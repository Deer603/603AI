package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentName, WorkEnqueuer> sClassWorkEnqueuer = null;
    static final Object sLock = null;
    final ArrayList<CompatWorkItem> mCompatQueue;
    WorkEnqueuer mCompatWorkEnqueuer;
    CommandProcessor mCurProcessor;
    boolean mDestroyed;
    boolean mInterruptIfStopped;
    CompatJobEngine mJobImpl;
    boolean mStopped;

    final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ JobIntentService this$0;

        CommandProcessor(JobIntentService this$0) {
            this.this$0 = this$0;
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ Void doInBackground(Void[] r1) {
            return doInBackground2(r1);
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onCancelled(Void r1) {
            onCancelled2(r1);
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(Void r1) {
            onPostExecute2(r1);
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected Void doInBackground2(Void... params) {
        L2:
            GenericWorkItem work = this.this$0.dequeueWork();
            if (work == null) goto L5;
            this.this$0.onHandleWork(work.getIntent());
            work.complete();
            goto L2
        L5:
            return null;
        }

        /* JADX INFO: renamed from: onCancelled, reason: avoid collision after fix types in other method */
        protected void onCancelled2(Void aVoid) {
            this.this$0.processorFinished();
        }

        /* JADX INFO: renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected void onPostExecute2(Void aVoid) {
            this.this$0.processorFinished();
        }
    }

    interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        CompatWorkEnqueuer(Context context, ComponentName cn) {
            super(cn);
            this.mContext = context.getApplicationContext();
            PowerManager pm = (PowerManager) context.getSystemService("power");
            this.mLaunchWakeLock = pm.newWakeLock(1, cn.getClassName() + ":launch");
            this.mLaunchWakeLock.setReferenceCounted(false);
            this.mRunWakeLock = pm.newWakeLock(1, cn.getClassName() + ":run");
            this.mRunWakeLock.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        void enqueueWork(Intent work) {
            Intent intent = new Intent(work);
            intent.setComponent(this.mComponentName);
            if (this.mContext.startService(intent) == null) goto L15;
            monitor-enter(this);
        L12:
            th = move-exception;
            throw th;
        L6:
            if (this.mLaunchingService == true) goto L10;
            this.mLaunchingService = true;     // Catch: Throwable -> L12
            if (this.mServiceProcessing == true) goto L10;
            this.mLaunchWakeLock.acquire(60000);     // Catch: Throwable -> L12
        L10:
            monitor-exit(this);     // Catch: Throwable -> L12
            return;
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
            monitor-enter(this);
            this.mLaunchingService = false;     // Catch: Throwable -> L7
            monitor-exit(this);     // Catch: Throwable -> L7
            return;
        L7:
            th = move-exception;
            throw th;
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
            monitor-enter(this);
        L8:
            th = move-exception;
            throw th;
        L4:
            if (this.mServiceProcessing == true) goto L6;
            this.mServiceProcessing = true;     // Catch: Throwable -> L8
            this.mRunWakeLock.acquire(600000);     // Catch: Throwable -> L8
            this.mLaunchWakeLock.release();     // Catch: Throwable -> L8
        L6:
            monitor-exit(this);     // Catch: Throwable -> L8
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
            monitor-enter(this);
        L11:
            th = move-exception;
            throw th;
        L4:
            if (this.mServiceProcessing == true) goto L6;
        L9:
            monitor-exit(this);     // Catch: Throwable -> L11
            return;
        L6:
            if (this.mLaunchingService == false) goto L8;
            this.mLaunchWakeLock.acquire(60000);     // Catch: Throwable -> L11
        L8:
            this.mServiceProcessing = false;     // Catch: Throwable -> L11
            this.mRunWakeLock.release();     // Catch: Throwable -> L11
            goto L9
        }
    }

    final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;
        final /* synthetic */ JobIntentService this$0;

        CompatWorkItem(JobIntentService this$0, Intent intent, int startId) {
            this.this$0 = this$0;
            this.mIntent = intent;
            this.mStartId = startId;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.mIntent;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void complete() {
            this.this$0.stopSelf(this.mStartId);
        }
    }

    interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock;
        JobParameters mParams;
        final JobIntentService mService;

        final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;
            final /* synthetic */ JobServiceEngineImpl this$0;

            WrapperWorkItem(JobServiceEngineImpl this$0, JobWorkItem jobWork) {
                this.this$0 = this$0;
                this.mJobWork = jobWork;
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public void complete() {
                Object r0 = this.this$0.mLock;
                monitor-enter(r0);
            L9:
                th = move-exception;
                throw th;
            L5:
                if (this.this$0.mParams == null) goto L7;
                this.this$0.mParams.completeWork(this.mJobWork);     // Catch: Throwable -> L9
            L7:
                monitor-exit(r0);     // Catch: Throwable -> L9
            }
        }

        JobServiceEngineImpl(JobIntentService service) {
            super(service);
            this.mLock = new Object();
            this.mService = service;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters params) {
            this.mParams = params;
            this.mService.ensureProcessorRunningLocked(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters params) {
            boolean result = this.mService.doStopCurrentWork();
            Object r1 = this.mLock;
            monitor-enter(r1);
            this.mParams = null;     // Catch: Throwable -> L8
            monitor-exit(r1);     // Catch: Throwable -> L8
            return result;
        L8:
            th = move-exception;
            throw th;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public GenericWorkItem dequeueWork() {
            Object r0 = this.mLock;
            monitor-enter(r0);
        L14:
            th = move-exception;
            throw th;
        L5:
            if (this.mParams != null) goto L8;
            monitor-exit(r0);     // Catch: Throwable -> L14
            return null;
        L8:
            JobWorkItem work = this.mParams.dequeueWork();     // Catch: Throwable -> L14
            monitor-exit(r0);     // Catch: Throwable -> L14
            if (work == null) goto L13;
            work.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
            return new WrapperWorkItem(this, work);
        L13:
            return null;
        }
    }

    static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        JobWorkEnqueuer(Context context, ComponentName cn, int jobId) {
            super(cn);
            ensureJobId(jobId);
            JobInfo.Builder b = new JobInfo.Builder(jobId, this.mComponentName);
            this.mJobInfo = b.setOverrideDeadline(0).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        void enqueueWork(Intent work) {
            this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(work));
        }
    }

    static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        abstract void enqueueWork(Intent r1);

        WorkEnqueuer(ComponentName cn) {
            this.mComponentName = cn;
        }

        void ensureJobId(int jobId) {
            if (this.mHasJobId == true) goto L6;
            this.mHasJobId = true;
            this.mJobId = jobId;
            return;
        L6:
            if (this.mJobId != jobId) goto L9;
            return;
        L9:
            throw new IllegalArgumentException("Given job ID " + jobId + " is different than previous " + this.mJobId);
        }

        public void serviceStartReceived() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceProcessingFinished() {
        }
    }

    protected abstract void onHandleWork(Intent r1);

    static {
        sLock = new Object();
        sClassWorkEnqueuer = new HashMap();
    }

    public JobIntentService() {
        this.mInterruptIfStopped = false;
        this.mStopped = false;
        this.mDestroyed = false;
        this.mCompatQueue = null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new JobServiceEngineImpl(this);
        this.mCompatWorkEnqueuer = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (this.mCompatQueue == null) goto L17;
        this.mCompatWorkEnqueuer.serviceStartReceived();
        ArrayList<CompatWorkItem> r0 = this.mCompatQueue;
        monitor-enter(r0);
        ArrayList<CompatWorkItem> r1 = this.mCompatQueue;     // Catch: Throwable -> L14
        if (intent == null) goto L9;
        Intent r3 = intent;
    L10:
        r1.add(new CompatWorkItem(this, r3, startId));     // Catch: Throwable -> L14
        ensureProcessorRunningLocked(true);     // Catch: Throwable -> L14
        monitor-exit(r0);     // Catch: Throwable -> L14
        return 3;
    L9:
        r3 = new Intent();     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    L17:
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.mJobImpl == null) goto L6;
        IBinder engine = this.mJobImpl.compatGetBinder();
        return engine;
    L6:
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (this.mCompatQueue == null) goto L13;
        ArrayList<CompatWorkItem> r0 = this.mCompatQueue;
        monitor-enter(r0);
        this.mDestroyed = true;     // Catch: Throwable -> L10
        this.mCompatWorkEnqueuer.serviceProcessingFinished();     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public static void enqueueWork(Context context, Class<?> cls, int jobId, Intent work) {
        enqueueWork(context, new ComponentName(context, cls), jobId, work);
    }

    public static void enqueueWork(Context context, ComponentName component, int jobId, Intent work) {
        if (work == null) goto L13;
        Object r0 = sLock;
        monitor-enter(r0);
        WorkEnqueuer we = getWorkEnqueuer(context, component, true, jobId);     // Catch: Throwable -> L9
        we.ensureJobId(jobId);     // Catch: Throwable -> L9
        we.enqueueWork(work);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    L13:
        throw new IllegalArgumentException("work must not be null");
    }

    static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName cn, boolean hasJobId, int jobId) {
        WorkEnqueuer we = sClassWorkEnqueuer.get(cn);
        if (we != null) goto L8;
        if (hasJobId == false) goto L7;
        WorkEnqueuer we2 = new JobWorkEnqueuer(context, cn, jobId);
        sClassWorkEnqueuer.put(cn, we2);
        return we2;
    L7:
        throw new IllegalArgumentException("Can't be here without a job id");
    L8:
        return we;
    }

    public void setInterruptIfStopped(boolean interruptIfStopped) {
        this.mInterruptIfStopped = interruptIfStopped;
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    boolean doStopCurrentWork() {
        if (this.mCurProcessor == null) goto L5;
        this.mCurProcessor.cancel(this.mInterruptIfStopped);
    L5:
        this.mStopped = true;
        return onStopCurrentWork();
    }

    void ensureProcessorRunningLocked(boolean reportStarted) {
        if (this.mCurProcessor != null) goto L10;
        this.mCurProcessor = new CommandProcessor(this);
        if (this.mCompatWorkEnqueuer == null) goto L8;
        if (reportStarted == false) goto L8;
        this.mCompatWorkEnqueuer.serviceProcessingStarted();
    L8:
        this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return;
    }

    void processorFinished() {
        if (this.mCompatQueue == null) goto L20;
        ArrayList<CompatWorkItem> r0 = this.mCompatQueue;
        monitor-enter(r0);
        this.mCurProcessor = null;     // Catch: Throwable -> L17
        if (this.mCompatQueue == null) goto L13;
        if (this.mCompatQueue.size() <= 0) goto L13;
        ensureProcessorRunningLocked(false);     // Catch: Throwable -> L17
    L15:
        monitor-exit(r0);     // Catch: Throwable -> L17
        return;
    L13:
        if (this.mDestroyed == true) goto L15;
        this.mCompatWorkEnqueuer.serviceProcessingFinished();     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    }

    GenericWorkItem dequeueWork() {
        if (this.mJobImpl != null) goto L5;
        ArrayList<CompatWorkItem> r0 = this.mCompatQueue;
        monitor-enter(r0);
    L16:
        th = move-exception;
        throw th;
    L9:
        if (this.mCompatQueue.size() <= 0) goto L13;
        CompatWorkItem r1 = this.mCompatQueue.remove(0);     // Catch: Throwable -> L16
        monitor-exit(r0);     // Catch: Throwable -> L16
        return r1;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L16
        return null;
    L5:
        return this.mJobImpl.dequeueWork();
    }
}
