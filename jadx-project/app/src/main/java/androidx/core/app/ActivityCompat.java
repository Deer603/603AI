package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityCompat extends ContextCompat {
    private static PermissionCompatDelegate sDelegate;

    /* JADX INFO: renamed from: androidx.core.app.ActivityCompat$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ String[] val$permissionsArray;
        final /* synthetic */ int val$requestCode;

        AnonymousClass1(String[] r1, Activity r2, int r3) {
            this.val$permissionsArray = r1;
            this.val$activity = r2;
            this.val$requestCode = r3;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] grantResults = new int[this.val$permissionsArray.length];
            PackageManager packageManager = this.val$activity.getPackageManager();
            String packageName = this.val$activity.getPackageName();
            int permissionCount = this.val$permissionsArray.length;
            int i = 0;
        L3:
            if (i >= permissionCount) goto L5;
            grantResults[i] = packageManager.checkPermission(this.val$permissionsArray[i], packageName);
            i = i + 1;
            goto L3
        L5:
            ((OnRequestPermissionsResultCallback) this.val$activity).onRequestPermissionsResult(this.val$requestCode, this.val$permissionsArray, grantResults);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void finishAfterTransition(Activity activity) {
            activity.finishAfterTransition();
        }

        static void setEnterSharedElementCallback(Activity activity, android.app.SharedElementCallback callback) {
            activity.setEnterSharedElementCallback(callback);
        }

        static void setExitSharedElementCallback(Activity activity, android.app.SharedElementCallback callback) {
            activity.setExitSharedElementCallback(callback);
        }

        static void postponeEnterTransition(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void startPostponedEnterTransition(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    static class Api22Impl {
        private Api22Impl() {
        }

        static Uri getReferrer(Activity activity) {
            return activity.getReferrer();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void requestPermissions(Activity activity, String[] permissions, int requestCode) {
            activity.requestPermissions(permissions, requestCode);
        }

        static boolean shouldShowRequestPermissionRationale(Activity activity, String permission) {
            return activity.shouldShowRequestPermissionRationale(permission);
        }

        static void onSharedElementsReady(Object onSharedElementsReadyListener) {
            ((android.app.SharedElementCallback.OnSharedElementsReadyListener) onSharedElementsReadyListener).onSharedElementsReady();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(Activity r1, int r2) {
            return (T) r1.requireViewById(r2);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static void setLocusContext(Activity activity, LocusIdCompat locusId, Bundle bundle) {
            if (locusId != null) goto L4;
            LocusId r0 = null;
        L5:
            activity.setLocusContext(r0, bundle);
            return;
        L4:
            r0 = locusId.toLocusId();
            goto L5
        }

        static Display getDisplay(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean isLaunchedFromBubble(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        static boolean shouldShowRequestPermissionRationale(Activity activity, String permission) {
            PackageManager packageManager = activity.getApplication().getPackageManager();     // Catch: IllegalAccessException -> L4 Throwable -> L6 NoSuchMethodException -> L8
            Method method = PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class});     // Catch: IllegalAccessException -> L4 Throwable -> L6 NoSuchMethodException -> L8
            return ((Boolean) method.invoke(packageManager, new Object[]{permission})).booleanValue();
        L10:
            return activity.shouldShowRequestPermissionRationale(permission);
        }
    }

    static class Api32Impl {
        private Api32Impl() {
        }

        static boolean shouldShowRequestPermissionRationale(Activity activity, String permission) {
            return activity.shouldShowRequestPermissionRationale(permission);
        }
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int r1, String[] r2, int[] r3);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(Activity r1, int r2, int r3, Intent r4);

        boolean requestPermissions(Activity r1, String[] r2, int r3);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int r1);
    }

    static class SharedElementCallback21Impl extends android.app.SharedElementCallback {
        private final SharedElementCallback mCallback;

        SharedElementCallback21Impl(SharedElementCallback callback) {
            this.mCallback = callback;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> sharedElementNames, List<View> sharedElements, List<View> sharedElementSnapshots) {
            this.mCallback.onSharedElementStart(sharedElementNames, sharedElements, sharedElementSnapshots);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> sharedElementNames, List<View> sharedElements, List<View> sharedElementSnapshots) {
            this.mCallback.onSharedElementEnd(sharedElementNames, sharedElements, sharedElementSnapshots);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> rejectedSharedElements) {
            this.mCallback.onRejectSharedElements(rejectedSharedElements);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> names, Map<String, View> sharedElements) {
            this.mCallback.onMapSharedElements(names, sharedElements);
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View sharedElement, Matrix viewToGlobalMatrix, RectF screenBounds) {
            return this.mCallback.onCaptureSharedElementSnapshot(sharedElement, viewToGlobalMatrix, screenBounds);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable snapshot) {
            return this.mCallback.onCreateSnapshotView(context, snapshot);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> sharedElementNames, List<View> sharedElements, final android.app.SharedElementCallback.OnSharedElementsReadyListener listener) {
            this.mCallback.onSharedElementsArrived(sharedElementNames, sharedElements, new ActivityCompat$SharedElementCallback21Impl$$ExternalSyntheticLambda0(listener));
        }

        static /* synthetic */ void lambda$onSharedElementsArrived$0(android.app.SharedElementCallback.OnSharedElementsReadyListener listener) {
            Api23Impl.onSharedElementsReady(listener);
        }
    }

    protected ActivityCompat() {
    }

    public static void setPermissionCompatDelegate(PermissionCompatDelegate delegate) {
        sDelegate = delegate;
    }

    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return sDelegate;
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void startActivityForResult(Activity activity, Intent intent, int requestCode, Bundle options) {
        activity.startActivityForResult(intent, requestCode, options);
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public static void finishAffinity(Activity activity) {
        activity.finishAffinity();
    }

    public static void finishAfterTransition(Activity activity) {
        Api21Impl.finishAfterTransition(activity);
    }

    public static Uri getReferrer(Activity activity) {
        return Api22Impl.getReferrer(activity);
    }

    public static <T extends View> T requireViewById(Activity r3, int r4) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        T r0 = (T) r3.findViewById(r4);
        if (r0 == null) goto L10;
        return r0;
    L10:
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    L5:
        return (T) Api28Impl.requireViewById(r3, r4);
    }

    public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback callback) {
        if (callback == null) goto L4;
        android.app.SharedElementCallback frameworkCallback = new SharedElementCallback21Impl(callback);
    L5:
        Api21Impl.setEnterSharedElementCallback(activity, frameworkCallback);
        return;
    L4:
        frameworkCallback = null;
        goto L5
    }

    public static void setExitSharedElementCallback(Activity activity, SharedElementCallback callback) {
        if (callback == null) goto L4;
        android.app.SharedElementCallback frameworkCallback = new SharedElementCallback21Impl(callback);
    L5:
        Api21Impl.setExitSharedElementCallback(activity, frameworkCallback);
        return;
    L4:
        frameworkCallback = null;
        goto L5
    }

    public static void postponeEnterTransition(Activity activity) {
        Api21Impl.postponeEnterTransition(activity);
    }

    public static void startPostponedEnterTransition(Activity activity) {
        Api21Impl.startPostponedEnterTransition(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(Activity r7, String[] permissions, int requestCode) {
        if (sDelegate != null) goto L5;
    L7:
        Set<Integer> indicesOfPermissionsToRemove = new HashSet();
        int i = 0;
    L9:
        if (i >= permissions.length) goto L20;
        if (TextUtils.isEmpty(permissions[i]) == true) goto L19;
        if (Build.VERSION.SDK_INT >= 33) goto L17;
        if (TextUtils.equals(permissions[i], "android.permission.POST_NOTIFICATIONS") == false) goto L17;
        indicesOfPermissionsToRemove.add(Integer.valueOf(i));
    L17:
        i = i + 1;
        goto L9
    L19:
        throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(permissions) + " must not contain null or empty values");
    L20:
        int numPermissionsToRemove = indicesOfPermissionsToRemove.size();
        if (numPermissionsToRemove <= 0) goto L23;
        String[] permissionsArray = new String[permissions.length - numPermissionsToRemove];
    L24:
        if (numPermissionsToRemove <= 0) goto L36;
        if (numPermissionsToRemove != permissions.length) goto L28;
        return;
    L28:
        int i2 = 0;
        int modifiedIndex = 0;
    L30:
        if (i2 >= permissions.length) goto L36;
        if (indicesOfPermissionsToRemove.contains(Integer.valueOf(i2)) == true) goto L34;
        permissionsArray[modifiedIndex] = permissions[i2];
        modifiedIndex = modifiedIndex + 1;
    L34:
        i2 = i2 + 1;
    L36:
        if ((r7 instanceof RequestPermissionsRequestCodeValidator) == false) goto L38;
        ((RequestPermissionsRequestCodeValidator) r7).validateRequestPermissionsRequestCode(requestCode);
    L38:
        Api23Impl.requestPermissions(r7, permissions, requestCode);
        return;
    L23:
        permissionsArray = permissions;
        goto L24
    L5:
        if (sDelegate.requestPermissions(r7, permissions, requestCode) == false) goto L7;
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String permission) {
        if (Build.VERSION.SDK_INT >= 33) goto L9;
        if (TextUtils.equals("android.permission.POST_NOTIFICATIONS", permission) == false) goto L9;
        return false;
    L9:
        if (Build.VERSION.SDK_INT < 32) goto L13;
        return Api32Impl.shouldShowRequestPermissionRationale(activity, permission);
    L13:
        if (Build.VERSION.SDK_INT != 31) goto L17;
        return Api31Impl.shouldShowRequestPermissionRationale(activity, permission);
    L17:
        return Api23Impl.shouldShowRequestPermissionRationale(activity, permission);
    }

    public static boolean isLaunchedFromBubble(Activity activity) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return Api31Impl.isLaunchedFromBubble(activity);
    L7:
        if (Build.VERSION.SDK_INT != 30) goto L16;
        if (Api30Impl.getDisplay(activity) == null) goto L14;
        if (Api30Impl.getDisplay(activity).getDisplayId() == 0) goto L14;
        return true;
    L14:
        return false;
    L16:
        if (Build.VERSION.SDK_INT == 29) goto L18;
        return false;
    L18:
        if (activity.getWindowManager().getDefaultDisplay() == null) goto L23;
        if (activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) goto L23;
        return true;
    L23:
        return false;
    }

    public static DragAndDropPermissionsCompat requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
        return DragAndDropPermissionsCompat.request(activity, dragEvent);
    }

    public static void recreate(final Activity activity) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        activity.recreate();
        return;
    L5:
        Handler handler = new Handler(activity.getMainLooper());
        handler.post(new ActivityCompat$$ExternalSyntheticLambda0(activity));
    }

    static /* synthetic */ void lambda$recreate$0(Activity activity) {
        if (activity.isFinishing() == false) goto L5;
        return;
    L5:
        if (ActivityRecreator.recreate(activity) == true) goto L9;
        activity.recreate();
        return;
    }

    public static void setLocusContext(Activity activity, LocusIdCompat locusId, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        Api30Impl.setLocusContext(activity, locusId, bundle);
        return;
    }
}
