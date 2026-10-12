package androidx.core.os;

import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessCompat {

    static class Api19Impl {
        private static Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final Object sResolvedLock = null;

        static {
            sResolvedLock = new Object();
        }

        private Api19Impl() {
        }

        static boolean isApplicationUid(int uid) {
            Object r1 = sResolvedLock;     // Catch: Exception -> L21
            monitor-enter(r1);     // Catch: Exception -> L21
        L18:
            th = move-exception;
            throw th;     // Catch: Exception -> L21
        L6:
            if (sResolved == true) goto L8;
            sResolved = true;     // Catch: Throwable -> L18
            sMethodUserHandleIsAppMethod = UserHandle.class.getDeclaredMethod("isApp", new Class[]{Integer.TYPE});     // Catch: Throwable -> L18
        L8:
            monitor-exit(r1);     // Catch: Throwable -> L18
        L10:
            if (sMethodUserHandleIsAppMethod == null) goto L23;
            Boolean result = (Boolean) sMethodUserHandleIsAppMethod.invoke(null, new Object[]{Integer.valueOf(uid)});     // Catch: Exception -> L21
            if (result == null) goto L16;
            return result.booleanValue();
        L16:
            throw new NullPointerException();     // Catch: Exception -> L21
        L23:
            return true;
        L21:
            e = move-exception;
            e.printStackTrace();
            goto L23
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isApplicationUid(int uid) {
            return Process.isApplicationUid(uid);
        }
    }

    private ProcessCompat() {
    }

    public static boolean isApplicationUid(int uid) {
        return Api24Impl.isApplicationUid(uid);
    }
}
