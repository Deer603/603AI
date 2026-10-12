package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class PermissionChecker {
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionResult {
    }

    private PermissionChecker() {
    }

    public static int checkPermission(Context context, String permission, int pid, int uid, String packageName) {
        if (context.checkPermission(permission, pid, uid) != (-1)) goto L5;
        return -1;
    L5:
        String op = AppOpsManagerCompat.permissionToOp(permission);
        if (op != null) goto L8;
        return 0;
    L8:
        if (packageName != null) goto L16;
        String[] packageNames = context.getPackageManager().getPackagesForUid(uid);
        if (packageNames != null) goto L12;
    L15:
        return -1;
    L12:
        if (packageNames.length <= 0) goto L15;
        packageName = packageNames[0];
    L16:
        int proxyUid = Process.myUid();
        String proxyPackageName = context.getPackageName();
        if (proxyUid == uid) goto L19;
    L21:
        boolean isCheckSelfPermission = false;
    L22:
        if (isCheckSelfPermission == false) goto L24;
        int checkOpResult = AppOpsManagerCompat.checkOrNoteProxyOp(context, uid, op, packageName);
    L25:
        if (checkOpResult == 0) goto L29;
        return -2;
    L29:
        return 0;
    L24:
        checkOpResult = AppOpsManagerCompat.noteProxyOpNoThrow(context, op, packageName);
        goto L25
    L19:
        if (ObjectsCompat.equals(proxyPackageName, packageName) == false) goto L21;
        isCheckSelfPermission = true;
        goto L22
    }

    public static int checkSelfPermission(Context context, String permission) {
        return checkPermission(context, permission, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int checkCallingPermission(Context context, String permission, String packageName) {
        if (Binder.getCallingPid() != Process.myPid()) goto L7;
        return -1;
    L7:
        return checkPermission(context, permission, Binder.getCallingPid(), Binder.getCallingUid(), packageName);
    }

    public static int checkCallingOrSelfPermission(Context context, String permission) {
        if (Binder.getCallingPid() != Process.myPid()) goto L5;
        String packageName = context.getPackageName();
    L7:
        return checkPermission(context, permission, Binder.getCallingPid(), Binder.getCallingUid(), packageName);
    L5:
        packageName = null;
        goto L7
    }
}
