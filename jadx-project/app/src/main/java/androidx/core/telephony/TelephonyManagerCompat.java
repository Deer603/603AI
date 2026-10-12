package androidx.core.telephony;

import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class TelephonyManagerCompat {
    private static Method sGetDeviceIdMethod;
    private static Method sGetSubIdMethod;

    private static class Api23Impl {
        private Api23Impl() {
        }

        static String getDeviceId(TelephonyManager telephonyManager, int slotIndex) {
            return telephonyManager.getDeviceId(slotIndex);
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
        }

        static String getImei(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static int getSubscriptionId(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    public static String getImei(TelephonyManager telephonyManager) {
        return Api26Impl.getImei(telephonyManager);
    }

    public static int getSubscriptionId(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        if (sGetSubIdMethod != null) goto L10;
        sGetSubIdMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);     // Catch: NoSuchMethodException -> L16 IllegalAccessException -> L18 InvocationTargetException -> L20
        sGetSubIdMethod.setAccessible(true);     // Catch: NoSuchMethodException -> L16 IllegalAccessException -> L18 InvocationTargetException -> L20
    L10:
        Integer subId = (Integer) sGetSubIdMethod.invoke(telephonyManager, new Object[0]);     // Catch: NoSuchMethodException -> L16 IllegalAccessException -> L18 InvocationTargetException -> L20
        if (subId != null) goto L13;
        return Integer.MAX_VALUE;
    L13:
        if (subId.intValue() == (-1)) goto L28;
        return subId.intValue();
    L28:
        return Integer.MAX_VALUE;
    L29:
        return Integer.MAX_VALUE;
    L22:
        return Integer.MAX_VALUE;
    L26:
        return Integer.MAX_VALUE;
    L5:
        return Api30Impl.getSubscriptionId(telephonyManager);
    }

    private TelephonyManagerCompat() {
    }
}
