package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class PackageManagerCompat {
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    public static final String LOG_TAG = "PackageManagerCompat";

    private static class Api30Impl {
        private Api30Impl() {
        }

        static boolean areUnusedAppRestrictionsEnabled(Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    public static ListenableFuture<Integer> getUnusedAppRestrictionsStatus(Context context) {
        ResolvableFuture<Integer> resultFuture = ResolvableFuture.create();
        if (UserManagerCompat.isUserUnlocked(context) == true) goto L7;
        resultFuture.set(0);
        Log.e(LOG_TAG, "User is in locked direct boot mode");
        return resultFuture;
    L7:
        if (areUnusedAppRestrictionsAvailable(context.getPackageManager()) == true) goto L10;
        resultFuture.set(1);
        return resultFuture;
    L10:
        int targetSdkVersion = context.getApplicationInfo().targetSdkVersion;
        if (targetSdkVersion >= 30) goto L14;
        resultFuture.set(0);
        Log.e(LOG_TAG, "Target SDK version below API 30");
        return resultFuture;
    L14:
        int r3 = 4;
        if (Build.VERSION.SDK_INT < 31) goto L24;
        if (Api30Impl.areUnusedAppRestrictionsEnabled(context) == false) goto L21;
        if (targetSdkVersion < 31) goto L20;
        r3 = 5;
    L20:
        resultFuture.set(Integer.valueOf(r3));
    L22:
        return resultFuture;
    L21:
        resultFuture.set(2);
        goto L22
    L24:
        if (Build.VERSION.SDK_INT == 30) goto L26;
        final UnusedAppRestrictionsBackportServiceConnection backportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
        Objects.requireNonNull(backportServiceConnection);
        resultFuture.addListener(new PackageManagerCompat$$ExternalSyntheticLambda0(backportServiceConnection), Executors.newSingleThreadExecutor());
        backportServiceConnection.connectAndFetchResult(resultFuture);
        return resultFuture;
    L26:
        if (Api30Impl.areUnusedAppRestrictionsEnabled(context) == true) goto L29;
        r3 = 2;
    L29:
        resultFuture.set(Integer.valueOf(r3));
        return resultFuture;
    }

    public static boolean areUnusedAppRestrictionsAvailable(PackageManager packageManager) {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        boolean restrictionsBuiltIntoOs = true;
    L7:
        if (Build.VERSION.SDK_INT >= 30) goto L9;
        boolean isOsMThroughQ = true;
    L11:
        if (getPermissionRevocationVerifierApp(packageManager) == null) goto L13;
        boolean hasBackportFeature = true;
    L14:
        if (restrictionsBuiltIntoOs == true) goto L20;
        if (isOsMThroughQ == false) goto L19;
        if (hasBackportFeature == false) goto L19;
        return true;
    L19:
        return false;
    L20:
        return true;
    L13:
        hasBackportFeature = false;
        goto L14
    L9:
        isOsMThroughQ = false;
        goto L11
    L5:
        restrictionsBuiltIntoOs = false;
        goto L7
    }

    public static String getPermissionRevocationVerifierApp(PackageManager packageManager) {
        Intent permissionRevocationSettingsIntent = new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", "com.example", null));
        List<ResolveInfo> intentResolvers = packageManager.queryIntentActivities(permissionRevocationSettingsIntent, 0);
        String verifierPackageName = null;
        Iterator<ResolveInfo> r3 = intentResolvers.iterator();
    L4:
        if (r3.hasNext() == false) goto L11;
        ResolveInfo intentResolver = r3.next();
        String packageName = intentResolver.activityInfo.packageName;
        if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", packageName) != 0) goto L4;
        if (verifierPackageName != null) goto L9;
        verifierPackageName = packageName;
        goto L4
    L9:
        return verifierPackageName;
    L11:
        return verifierPackageName;
    }
}
