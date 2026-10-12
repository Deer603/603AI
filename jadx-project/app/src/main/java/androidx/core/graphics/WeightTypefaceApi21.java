package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class WeightTypefaceApi21 {
    private static final String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    private static final String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    private static final String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final String TAG = "WeightTypeface";
    private static final Constructor<Typeface> sConstructor = null;
    private static final Method sNativeCreateFromTypeface = null;
    private static final Method sNativeCreateWeightAlias = null;
    private static final Field sNativeInstance = null;
    private static final Object sWeightCacheLock = null;
    private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache = null;

    static {
        Field nativeInstance = Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);     // Catch: Throwable -> L4
        Method nativeCreateFromTypeface = Typeface.class.getDeclaredMethod(NATIVE_CREATE_FROM_TYPEFACE_METHOD, new Class[]{Long.TYPE, Integer.TYPE});     // Catch: Throwable -> L4
        nativeCreateFromTypeface.setAccessible(true);     // Catch: Throwable -> L4
        Method nativeCreateWeightAlias = Typeface.class.getDeclaredMethod(NATIVE_CREATE_WEIGHT_ALIAS_METHOD, new Class[]{Long.TYPE, Integer.TYPE});     // Catch: Throwable -> L4
        nativeCreateWeightAlias.setAccessible(true);     // Catch: Throwable -> L4
        Constructor<Typeface> constructor = Typeface.class.getDeclaredConstructor(new Class[]{Long.TYPE});     // Catch: Throwable -> L4
        constructor.setAccessible(true);     // Catch: Throwable -> L4
    L6:
        sNativeInstance = nativeInstance;
        sNativeCreateFromTypeface = nativeCreateFromTypeface;
        sNativeCreateWeightAlias = nativeCreateWeightAlias;
        sConstructor = constructor;
        sWeightTypefaceCache = new LongSparseArray(3);
        sWeightCacheLock = new Object();
        return;
    L4:
        e = move-exception;
        Log.e(TAG, e.getClass().getName(), e);
        nativeInstance = null;
        nativeCreateFromTypeface = null;
        nativeCreateWeightAlias = null;
        constructor = null;
        goto L6
    }

    private static boolean isPrivateApiAvailable() {
        if (sNativeInstance == null) goto L5;
        return true;
    L5:
        return false;
    }

    static Typeface createWeightStyle(Typeface r7, int r8, boolean r9) {
        if (isPrivateApiAvailable() == true) goto L6;
        return null;
    L6:
        int r0 = (r8 << 1) | (r9 ? 1 : 0);
        Object r1 = sWeightCacheLock;
        monitor-enter(r1);
        long r2 = getNativeInstance(r7);     // Catch: Throwable -> L22
        SparseArray<Typeface> r4 = sWeightTypefaceCache.get(r2);     // Catch: Throwable -> L22
        if (r4 != null) goto L11;
        r4 = new SparseArray(4);     // Catch: Throwable -> L22
        sWeightTypefaceCache.put(r2, r4);     // Catch: Throwable -> L22
    L16:
        if (r9 != r7.isItalic()) goto L18;
        Typeface r5 = create(nativeCreateWeightAlias(r2, r8));     // Catch: Throwable -> L22
    L19:
        r4.put(r0 == true ? 1 : 0, r5);     // Catch: Throwable -> L22
        monitor-exit(r1);     // Catch: Throwable -> L22
        return r5;
    L18:
        r5 = create(nativeCreateFromTypefaceWithExactStyle(r2, r8, r9));     // Catch: Throwable -> L22
        goto L19
    L11:
        Typeface r6 = r4.get(r0 == true ? 1 : 0);     // Catch: Throwable -> L22
        if (r6 == null) goto L16;
        monitor-exit(r1);     // Catch: Throwable -> L22
        return r6;
    L22:
        th = move-exception;
        throw th;
    }

    private static long getNativeInstance(Typeface typeface) {
        return sNativeInstance.getLong(typeface);
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    private static long nativeCreateFromTypefaceWithExactStyle(long nativeInstance, int weight, boolean italic) {
        if (italic == false) goto L4;
        int style = 2;
    L13:
        long nativeInstance2 = ((Long) sNativeCreateFromTypeface.invoke(null, new Object[]{Long.valueOf(nativeInstance), Integer.valueOf(style)})).longValue();     // Catch: InvocationTargetException -> L7 IllegalAccessException -> L10
        return ((Long) sNativeCreateWeightAlias.invoke(null, new Object[]{Long.valueOf(nativeInstance2), Integer.valueOf(weight)})).longValue();
    L10:
        e = move-exception;
        throw new RuntimeException(e);
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    L4:
        style = 0;
        goto L13
    }

    private static long nativeCreateWeightAlias(long nativeInstance, int weight) {
        return ((Long) sNativeCreateWeightAlias.invoke(null, new Object[]{Long.valueOf(nativeInstance), Integer.valueOf(weight)})).longValue();
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    private static Typeface create(long nativeInstance) {
        return sConstructor.newInstance(new Object[]{Long.valueOf(nativeInstance)});
    L10:
        return null;
    L8:
        return null;
    L6:
        return null;
    }

    private WeightTypefaceApi21() {
    }
}
