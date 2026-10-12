package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.FontResourcesParserCompat;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
final class WeightTypefaceApi14 {
    private static final String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final String TAG = "WeightTypeface";
    private static final Field sNativeInstance = null;
    private static final Object sWeightCacheLock = null;
    private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache = null;

    static {
        Field nativeInstance = Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);     // Catch: Exception -> L4
        nativeInstance.setAccessible(true);     // Catch: Exception -> L4
    L6:
        sNativeInstance = nativeInstance;
        sWeightTypefaceCache = new LongSparseArray(3);
        sWeightCacheLock = new Object();
        return;
    L4:
        e = move-exception;
        Log.e(TAG, e.getClass().getName(), e);
        nativeInstance = null;
        goto L6
    }

    private static boolean isPrivateApiAvailable() {
        if (sNativeInstance == null) goto L5;
        return true;
    L5:
        return false;
    }

    static Typeface createWeightStyle(TypefaceCompatBaseImpl r7, Context r8, Typeface r9, int r10, boolean r11) {
        if (isPrivateApiAvailable() == true) goto L6;
        return null;
    L6:
        int r0 = (r10 << 1) | (r11 ? 1 : 0);
        Object r1 = sWeightCacheLock;
        monitor-enter(r1);
        long r2 = getNativeInstance(r9);     // Catch: Throwable -> L21
        SparseArray<Typeface> r4 = sWeightTypefaceCache.get(r2);     // Catch: Throwable -> L21
        if (r4 != null) goto L11;
        r4 = new SparseArray(4);     // Catch: Throwable -> L21
        sWeightTypefaceCache.put(r2, r4);     // Catch: Throwable -> L21
    L15:
        Typeface r5 = getBestFontFromFamily(r7, r8, r9, r10, r11);     // Catch: Throwable -> L21
        if (r5 != null) goto L18;
        r5 = platformTypefaceCreate(r9, r10, r11);     // Catch: Throwable -> L21
    L18:
        r4.put(r0 == true ? 1 : 0, r5);     // Catch: Throwable -> L21
        monitor-exit(r1);     // Catch: Throwable -> L21
        return r5;
    L11:
        Typeface r6 = r4.get(r0 == true ? 1 : 0);     // Catch: Throwable -> L21
        if (r6 == null) goto L15;
        monitor-exit(r1);     // Catch: Throwable -> L21
        return r6;
    L21:
        th = move-exception;
        throw th;
    }

    private static Typeface platformTypefaceCreate(Typeface base, int weight, boolean italic) {
        if (weight < 600) goto L5;
        boolean isBold = true;
    L7:
        if (isBold == true) goto L10;
        if (italic == true) goto L10;
        int style = 0;
    L16:
        return Typeface.create(base, style);
    L10:
        if (isBold == true) goto L12;
        style = 2;
        goto L16
    L12:
        if (italic == true) goto L14;
        style = 1;
        goto L16
    L14:
        style = 3;
        goto L16
    L5:
        isBold = false;
        goto L7
    }

    private static Typeface getBestFontFromFamily(TypefaceCompatBaseImpl compat, Context context, Typeface base, int weight, boolean italic) {
        FontResourcesParserCompat.FontFamilyFilesResourceEntry family = compat.getFontFamily(base);
        if (family != null) goto L7;
        return null;
    L7:
        return compat.createFromFontFamilyFilesResourceEntry(context, family, context.getResources(), weight, italic);
    }

    private static long getNativeInstance(Typeface typeface) {
        Number num = (Number) sNativeInstance.get(typeface);     // Catch: IllegalAccessException -> L4
        return num.longValue();
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    private WeightTypefaceApi14() {
    }
}
