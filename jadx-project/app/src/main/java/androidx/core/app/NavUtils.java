package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.ReplaceWith;

/* JADX INFO: loaded from: classes4.dex */
public final class NavUtils {
    public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final String TAG = "NavUtils";

    @ReplaceWith(expression = "sourceActivity.shouldUpRecreateTask(targetIntent)")
    @Deprecated
    public static boolean shouldUpRecreateTask(Activity sourceActivity, Intent targetIntent) {
        return sourceActivity.shouldUpRecreateTask(targetIntent);
    }

    public static void navigateUpFromSameTask(Activity sourceActivity) {
        Intent upIntent = getParentActivityIntent(sourceActivity);
        if (upIntent == null) goto L7;
        navigateUpTo(sourceActivity, upIntent);
        return;
    L7:
        throw new IllegalArgumentException("Activity " + sourceActivity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    @ReplaceWith(expression = "sourceActivity.navigateUpTo(upIntent)")
    @Deprecated
    public static void navigateUpTo(Activity sourceActivity, Intent upIntent) {
        sourceActivity.navigateUpTo(upIntent);
    }

    public static Intent getParentActivityIntent(Activity sourceActivity) {
        Intent result = sourceActivity.getParentActivityIntent();
        if (result == null) goto L5;
        return result;
    L5:
        String parentName = getParentActivityName(sourceActivity);
        if (parentName != null) goto L8;
        return null;
    L8:
        ComponentName target = new ComponentName(sourceActivity, parentName);
        String grandparent = getParentActivityName(sourceActivity, target);     // Catch: PackageManager.NameNotFoundException -> L14
        if (grandparent != null) goto L13;
        return Intent.makeMainActivity(target);
    L13:
        return new Intent().setComponent(target);
    L15:
        Log.e(TAG, "getParentActivityIntent: bad parentActivityName '" + parentName + "' in manifest");
        return null;
    }

    public static Intent getParentActivityIntent(Context context, Class<?> sourceActivityClass) throws PackageManager.NameNotFoundException {
        String parentActivity = getParentActivityName(context, new ComponentName(context, sourceActivityClass));
        if (parentActivity != null) goto L6;
        return null;
    L6:
        ComponentName target = new ComponentName(context, parentActivity);
        String grandparent = getParentActivityName(context, target);
        if (grandparent != null) goto L9;
        Intent parentIntent = Intent.makeMainActivity(target);
        return parentIntent;
    L9:
        Intent parentIntent2 = new Intent().setComponent(target);
        return parentIntent2;
    }

    public static Intent getParentActivityIntent(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String parentActivity = getParentActivityName(context, componentName);
        if (parentActivity != null) goto L6;
        return null;
    L6:
        ComponentName target = new ComponentName(componentName.getPackageName(), parentActivity);
        String grandparent = getParentActivityName(context, target);
        if (grandparent != null) goto L9;
        Intent parentIntent = Intent.makeMainActivity(target);
        return parentIntent;
    L9:
        Intent parentIntent2 = new Intent().setComponent(target);
        return parentIntent2;
    }

    public static String getParentActivityName(Activity sourceActivity) {
        return getParentActivityName(sourceActivity, sourceActivity.getComponentName());
    L4:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static String getParentActivityName(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager pm = context.getPackageManager();
        int flags = 128 | 512;
        if (Build.VERSION.SDK_INT < 29) goto L5;
        int flags2 = flags | 269221888;
    L6:
        ActivityInfo info = pm.getActivityInfo(componentName, flags2);
        String result = info.parentActivityName;
        if (result == null) goto L10;
        return result;
    L10:
        if (info.metaData != null) goto L12;
        return null;
    L12:
        String parentActivity = info.metaData.getString(PARENT_ACTIVITY);
        if (parentActivity != null) goto L16;
        return null;
    L16:
        if (parentActivity.charAt(0) == '.') goto L18;
        return parentActivity;
    L18:
        return context.getPackageName() + parentActivity;
    L5:
        flags2 = flags | 786432;
        goto L6
    }

    private NavUtils() {
    }
}
