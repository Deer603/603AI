package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.content.IntentCompat;

/* JADX INFO: loaded from: classes4.dex */
public class AppLaunchChecker {
    private static final String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
    private static final String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";

    public static boolean hasStartedFromLauncher(Context context) {
        return context.getSharedPreferences(SHARED_PREFS_NAME, 0).getBoolean(KEY_STARTED_FROM_LAUNCHER, false);
    }

    public static void onActivityCreate(Activity activity) {
        SharedPreferences sp = activity.getSharedPreferences(SHARED_PREFS_NAME, 0);
        if (sp.getBoolean(KEY_STARTED_FROM_LAUNCHER, false) == false) goto L5;
        return;
    L5:
        Intent launchIntent = activity.getIntent();
        if (launchIntent != null) goto L9;
        return;
    L9:
        if ("android.intent.action.MAIN".equals(launchIntent.getAction()) == true) goto L11;
        return;
    L11:
        if (launchIntent.hasCategory("android.intent.category.LAUNCHER") == false) goto L13;
    L14:
        sp.edit().putBoolean(KEY_STARTED_FROM_LAUNCHER, true).apply();
        return;
    L13:
        if (launchIntent.hasCategory(IntentCompat.CATEGORY_LEANBACK_LAUNCHER) == true) goto L14;
    }

    @Deprecated
    public AppLaunchChecker() {
    }
}
