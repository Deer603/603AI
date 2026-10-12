package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0002'(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001eJ\u0015\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "startedCounter", "", "resumedCounter", "pauseSent", "", "stopSent", "handler", "Landroid/os/Handler;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "delayedPauseRunnable", "Ljava/lang/Runnable;", "initializationListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "activityStarted", "", "activityStarted$lifecycle_process_release", "activityResumed", "activityResumed$lifecycle_process_release", "activityPaused", "activityPaused$lifecycle_process_release", "activityStopped", "activityStopped$lifecycle_process_release", "dispatchPauseIfNeeded", "dispatchPauseIfNeeded$lifecycle_process_release", "dispatchStopIfNeeded", "dispatchStopIfNeeded$lifecycle_process_release", "attach", "context", "Landroid/content/Context;", "attach$lifecycle_process_release", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "Companion", "Api29Impl", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final Companion Companion = null;
    public static final long TIMEOUT_MS = 700;
    private static final ProcessLifecycleOwner newInstance = null;
    private final Runnable delayedPauseRunnable;
    private Handler handler;
    private final ReportFragment.ActivityInitializationListener initializationListener;
    private boolean pauseSent;
    private final LifecycleRegistry registry;
    private int resumedCounter;
    private int startedCounter;
    private boolean stopSent;

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "<init>", "()V", "registerActivityLifecycleCallbacks", "", "activity", "Landroid/app/Activity;", "callback", "Landroid/app/Application$ActivityLifecycleCallbacks;", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = null;

        static {
            INSTANCE = new Api29Impl();
        }

        private Api29Impl() {
        }

        @JvmStatic
        public static final void registerActivityLifecycleCallbacks(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "<init>", "()V", "TIMEOUT_MS", "", "getTIMEOUT_MS$lifecycle_process_release$annotations", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "get", "Landroidx/lifecycle/LifecycleOwner;", "init", "", "context", "Landroid/content/Context;", "init$lifecycle_process_release", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
        }

        private Companion() {
        }

        @JvmStatic
        public final LifecycleOwner get() {
            return ProcessLifecycleOwner.access$getNewInstance$cp();
        }

        @JvmStatic
        public final void init$lifecycle_process_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ProcessLifecycleOwner.access$getNewInstance$cp().attach$lifecycle_process_release(context);
        }
    }

    private ProcessLifecycleOwner() {
        this.pauseSent = true;
        this.stopSent = true;
        this.registry = new LifecycleRegistry(this);
        this.delayedPauseRunnable = new ProcessLifecycleOwner$$ExternalSyntheticLambda0(this);
        this.initializationListener = new ProcessLifecycleOwner$initializationListener$1(this);
    }

    public static final /* synthetic */ ReportFragment.ActivityInitializationListener access$getInitializationListener$p(ProcessLifecycleOwner $this) {
        return $this.initializationListener;
    }

    public static final /* synthetic */ ProcessLifecycleOwner access$getNewInstance$cp() {
        return newInstance;
    }

    static final void delayedPauseRunnable$lambda$0(ProcessLifecycleOwner this$0) {
        this$0.dispatchPauseIfNeeded$lifecycle_process_release();
        this$0.dispatchStopIfNeeded$lifecycle_process_release();
    }

    static {
        Companion = new Companion(null);
        newInstance = new ProcessLifecycleOwner();
    }

    @JvmStatic
    public static final LifecycleOwner get() {
        return Companion.get();
    }

    @JvmStatic
    public static final void init$lifecycle_process_release(Context context) {
        Companion.init$lifecycle_process_release(context);
    }

    public final void activityStarted$lifecycle_process_release() {
        this.startedCounter++;
        if (this.startedCounter == 1) goto L5;
        return;
    L5:
        if (this.stopSent == false) goto L9;
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.stopSent = false;
        return;
    }

    public final void activityResumed$lifecycle_process_release() {
        this.resumedCounter++;
        if (this.resumedCounter == 1) goto L5;
        return;
    L5:
        if (this.pauseSent == false) goto L7;
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.pauseSent = false;
        return;
    L7:
        Handler r0 = this.handler;
        Intrinsics.checkNotNull(r0);
        r0.removeCallbacks(this.delayedPauseRunnable);
    }

    public final void activityPaused$lifecycle_process_release() {
        this.resumedCounter--;
        if (this.resumedCounter != 0) goto L6;
        Handler r0 = this.handler;
        Intrinsics.checkNotNull(r0);
        r0.postDelayed(this.delayedPauseRunnable, 700);
        return;
    }

    public final void activityStopped$lifecycle_process_release() {
        this.startedCounter--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.resumedCounter != 0) goto L6;
        this.pauseSent = true;
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        return;
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.startedCounter == 0) goto L5;
        return;
    L5:
        if (this.pauseSent == false) goto L9;
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.stopSent = true;
        return;
    }

    public final void attach$lifecycle_process_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler();
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Context r0 = context.getApplicationContext();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.app.Application");
        Application app = (Application) r0;
        app.registerActivityLifecycleCallbacks(new ProcessLifecycleOwner$attach$1(this));
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.registry;
    }
}
