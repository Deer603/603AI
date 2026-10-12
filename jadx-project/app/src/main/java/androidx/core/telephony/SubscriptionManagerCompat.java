package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class SubscriptionManagerCompat {
    private static Method sGetSlotIndexMethod;

    private static class Api29Impl {
        private Api29Impl() {
        }

        static int getSlotIndex(int subId) {
            return SubscriptionManager.getSlotIndex(subId);
        }
    }

    public static int getSlotIndex(int subId) {
        if (subId != (-1)) goto L6;
        return -1;
    L6:
        if (Build.VERSION.SDK_INT >= 29) goto L8;
        if (sGetSlotIndexMethod != null) goto L12;
        sGetSlotIndexMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", new Class[]{Integer.TYPE});     // Catch: InvocationTargetException -> L17 IllegalAccessException -> L19 NoSuchMethodException -> L21
        sGetSlotIndexMethod.setAccessible(true);     // Catch: InvocationTargetException -> L17 IllegalAccessException -> L19 NoSuchMethodException -> L21
    L12:
        Integer slotIdx = (Integer) sGetSlotIndexMethod.invoke(null, new Object[]{Integer.valueOf(subId)});     // Catch: InvocationTargetException -> L17 IllegalAccessException -> L19 NoSuchMethodException -> L21
        if (slotIdx == null) goto L23;
        return slotIdx.intValue();
    L23:
        return -1;
    L8:
        return Api29Impl.getSlotIndex(subId);
    }

    private SubscriptionManagerCompat() {
    }
}
