package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
class BenchmarkOperation {

    private static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        static Context createDeviceProtectedStorageContext(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    private BenchmarkOperation() {
    }

    static void dropShaderCache(Context context, ProfileInstallReceiver.ResultDiagnostics callback) {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        File shaderDirectory = Api24ContextHelper.createDeviceProtectedStorageContext(context).getCacheDir();
    L7:
        if (deleteFilesRecursively(shaderDirectory) == false) goto L9;
        callback.onResultReceived(14, null);
        return;
    L9:
        callback.onResultReceived(15, null);
        return;
    L5:
        shaderDirectory = Api21ContextHelper.getCodeCacheDir(Api24ContextHelper.createDeviceProtectedStorageContext(context));
        goto L7
    }

    static boolean deleteFilesRecursively(File file) {
        if (file.isDirectory() == false) goto L16;
        File[] children = file.listFiles();
        if (children != null) goto L7;
        return false;
    L7:
        boolean success = true;
        int r4 = children.length;
        int r5 = 0;
    L8:
        if (r5 >= r4) goto L15;
        File child = children[r5];
        if (deleteFilesRecursively(child) == false) goto L13;
        if (success == false) goto L13;
        boolean r7 = true;
    L14:
        success = r7;
        r5 = r5 + 1;
    L13:
        r7 = false;
        goto L14
    L15:
        return success;
    L16:
        file.delete();
        return true;
    }
}
