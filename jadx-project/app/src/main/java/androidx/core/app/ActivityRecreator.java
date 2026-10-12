package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class ActivityRecreator {
    private static final String LOG_TAG = "ActivityRecreator";
    protected static final Class<?> activityThreadClass = null;
    private static final Handler mainHandler = null;
    protected static final Field mainThreadField = null;
    protected static final Method performStopActivity2ParamsMethod = null;
    protected static final Method performStopActivity3ParamsMethod = null;
    protected static final Method requestRelaunchActivityMethod = null;
    protected static final Field tokenField = null;

    private static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {
        Object currentlyRecreatingToken;
        private Activity mActivity;
        private boolean mDestroyed;
        private final int mRecreatingHashCode;
        private boolean mStarted;
        private boolean mStopQueued;

        LifecycleCheckCallbacks(Activity aboutToRecreate) {
            this.mStarted = false;
            this.mDestroyed = false;
            this.mStopQueued = false;
            this.mActivity = aboutToRecreate;
            this.mRecreatingHashCode = this.mActivity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.mActivity != activity) goto L6;
            this.mStarted = true;
            return;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.mDestroyed == true) goto L5;
            return;
        L5:
            if (this.mStopQueued == false) goto L7;
            return;
        L7:
            if (this.mStarted == false) goto L9;
            return;
        L9:
            if (ActivityRecreator.queueOnStopIfNecessary(this.currentlyRecreatingToken, this.mRecreatingHashCode, activity) == false) goto L15;
            this.mStopQueued = true;
            this.currentlyRecreatingToken = null;
            return;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.mActivity != activity) goto L6;
            this.mActivity = null;
            this.mDestroyed = true;
            return;
        }
    }

    private ActivityRecreator() {
    }

    static {
        mainHandler = new Handler(Looper.getMainLooper());
        activityThreadClass = getActivityThreadClass();
        mainThreadField = getMainThreadField();
        tokenField = getTokenField();
        performStopActivity3ParamsMethod = getPerformStopActivity3Params(activityThreadClass);
        performStopActivity2ParamsMethod = getPerformStopActivity2Params(activityThreadClass);
        requestRelaunchActivityMethod = getRequestRelaunchActivityMethod(activityThreadClass);
    }

    static boolean recreate(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        activity.recreate();
        return true;
    L7:
        if (needsRelaunchCall() == false) goto L12;
        if (requestRelaunchActivityMethod != null) goto L12;
        return false;
    L12:
        if (performStopActivity2ParamsMethod == null) goto L14;
    L35:
        final Object token = tokenField.get(activity);     // Catch: Throwable -> L33
        if (token != null) goto L19;
        return false;
    L19:
        Object activityThread = mainThreadField.get(activity);     // Catch: Throwable -> L33
        if (activityThread != null) goto L22;
        return false;
    L22:
        final Application application = activity.getApplication();     // Catch: Throwable -> L33
        final LifecycleCheckCallbacks callbacks = new LifecycleCheckCallbacks(activity);     // Catch: Throwable -> L33
        application.registerActivityLifecycleCallbacks(callbacks);     // Catch: Throwable -> L33
        mainHandler.post(new AnonymousClass1(callbacks, token));     // Catch: Throwable -> L33
    L30:
        th = move-exception;
        mainHandler.post(new AnonymousClass2(application, callbacks));     // Catch: Throwable -> L33
        throw th;     // Catch: Throwable -> L33
    L24:
        if (needsRelaunchCall() == false) goto L26;
        requestRelaunchActivityMethod.invoke(activityThread, new Object[]{token, null, null, 0, false, null, null, false, false});     // Catch: Throwable -> L30
    L28:
        mainHandler.post(new AnonymousClass2(application, callbacks));     // Catch: Throwable -> L33
        return true;
    L26:
        activity.recreate();     // Catch: Throwable -> L30
    L34:
        return false;
    L14:
        if (performStopActivity3ParamsMethod != null) goto L35;
        return false;
    }

    protected static boolean queueOnStopIfNecessary(Object currentlyRecreatingToken, int currentlyRecreatingHashCode, Activity activity) {
        final Object token = tokenField.get(activity);     // Catch: Throwable -> L12
        if (token == currentlyRecreatingToken) goto L6;
    L11:
        return false;
    L6:
        if (activity.hashCode() != currentlyRecreatingHashCode) goto L11;
        final Object activityThread = mainThreadField.get(activity);     // Catch: Throwable -> L12
        mainHandler.postAtFrontOfQueue(new AnonymousClass3(activityThread, token));     // Catch: Throwable -> L12
        return true;
    L12:
        t = move-exception;
        Log.e(LOG_TAG, "Exception while fetching field values", t);
        return false;
    }

    private static Method getPerformStopActivity3Params(Class<?> activityThreadClass2) {
        if (activityThreadClass2 != null) goto L9;
        return null;
    L9:
        Method performStop = activityThreadClass2.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});     // Catch: Throwable -> L7
        performStop.setAccessible(true);     // Catch: Throwable -> L7
        return performStop;
    L8:
        return null;
    }

    private static Method getPerformStopActivity2Params(Class<?> activityThreadClass2) {
        if (activityThreadClass2 != null) goto L9;
        return null;
    L9:
        Method performStop = activityThreadClass2.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});     // Catch: Throwable -> L7
        performStop.setAccessible(true);     // Catch: Throwable -> L7
        return performStop;
    L8:
        return null;
    }

    private static boolean needsRelaunchCall() {
        if (Build.VERSION.SDK_INT != 26) goto L5;
    L8:
        return true;
    L5:
        if (Build.VERSION.SDK_INT == 27) goto L8;
        return false;
    }

    private static Method getRequestRelaunchActivityMethod(Class<?> activityThreadClass2) {
        if (needsRelaunchCall() == false) goto L10;
        if (activityThreadClass2 == null) goto L10;
        Method relaunch = activityThreadClass2.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});     // Catch: Throwable -> L8
        relaunch.setAccessible(true);     // Catch: Throwable -> L8
        return relaunch;
    L9:
        return null;
    L10:
        return null;
    }

    private static Field getMainThreadField() {
        Field mainThreadField2 = Activity.class.getDeclaredField("mMainThread");     // Catch: Throwable -> L4
        mainThreadField2.setAccessible(true);     // Catch: Throwable -> L4
        return mainThreadField2;
    L5:
        return null;
    }

    private static Field getTokenField() {
        Field tokenField2 = Activity.class.getDeclaredField("mToken");     // Catch: Throwable -> L4
        tokenField2.setAccessible(true);     // Catch: Throwable -> L4
        return tokenField2;
    L5:
        return null;
    }

    private static Class<?> getActivityThreadClass() {
        return Class.forName("android.app.ActivityThread");
    L5:
        return null;
    }
}
