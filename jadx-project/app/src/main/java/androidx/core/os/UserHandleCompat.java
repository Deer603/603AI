package androidx.core.os;

import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class UserHandleCompat {
    private static Method sGetUserIdMethod;
    private static Constructor<UserHandle> sUserHandleConstructor;

    private static class Api24Impl {
        private Api24Impl() {
        }

        static UserHandle getUserHandleForUid(int uid) {
            return UserHandle.getUserHandleForUid(uid);
        }
    }

    private UserHandleCompat() {
    }

    public static UserHandle getUserHandleForUid(int uid) {
        return Api24Impl.getUserHandleForUid(uid);
    }

    private static Method getGetUserIdMethod() throws NoSuchMethodException {
        if (sGetUserIdMethod != null) goto L6;
        sGetUserIdMethod = UserHandle.class.getDeclaredMethod("getUserId", new Class[]{Integer.TYPE});
        sGetUserIdMethod.setAccessible(true);
    L6:
        return sGetUserIdMethod;
    }

    private static Constructor<UserHandle> getUserHandleConstructor() throws NoSuchMethodException {
        if (sUserHandleConstructor != null) goto L6;
        sUserHandleConstructor = UserHandle.class.getDeclaredConstructor(new Class[]{Integer.TYPE});
        sUserHandleConstructor.setAccessible(true);
    L6:
        return sUserHandleConstructor;
    }
}
