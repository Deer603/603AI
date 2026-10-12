package androidx.core.util;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    private static class Api34Impl {
        private Api34Impl() {
        }

        public static float deriveDimension(int unitToConvertTo, float pixelValue, DisplayMetrics metrics) {
            return TypedValue.deriveDimension(unitToConvertTo, pixelValue, metrics);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
    }

    public static int getUnitFromComplexDimension(int complexDimension) {
        return (complexDimension >> 0) & 15;
    }

    public static float deriveDimension(int unitToConvertTo, float pixelValue, DisplayMetrics metrics) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api34Impl.deriveDimension(unitToConvertTo, pixelValue, metrics);
    L7:
        switch(unitToConvertTo) {
            case 0: goto L35;
            case 1: goto L31;
            case 2: goto L26;
            case 3: goto L21;
            case 4: goto L16;
            case 5: goto L11;
            default: goto L9;
        };
    L35:
        return pixelValue;
    L9:
        throw new IllegalArgumentException("Invalid unitToConvertTo " + unitToConvertTo);
    L11:
        if (metrics.xdpi != 0.0f) goto L14;
        return 0.0f;
    L14:
        return (pixelValue / metrics.xdpi) / INCHES_PER_MM;
    L16:
        if (metrics.xdpi != 0.0f) goto L19;
        return 0.0f;
    L19:
        return pixelValue / metrics.xdpi;
    L21:
        if (metrics.xdpi != 0.0f) goto L24;
        return 0.0f;
    L24:
        return (pixelValue / metrics.xdpi) / INCHES_PER_PT;
    L26:
        if (metrics.scaledDensity != 0.0f) goto L29;
        return 0.0f;
    L29:
        return pixelValue / metrics.scaledDensity;
    L31:
        if (metrics.density != 0.0f) goto L34;
        return 0.0f;
    L34:
        return pixelValue / metrics.density;
    }

    public static float dpToPx(float dpValue, DisplayMetrics metrics) {
        return TypedValue.applyDimension(1, dpValue, metrics);
    }

    public static float pxToDp(float pixelValue, DisplayMetrics metrics) {
        return deriveDimension(1, pixelValue, metrics);
    }

    public static float spToPx(float spValue, DisplayMetrics metrics) {
        return TypedValue.applyDimension(2, spValue, metrics);
    }

    public static float pxToSp(float pixelValue, DisplayMetrics metrics) {
        return deriveDimension(2, pixelValue, metrics);
    }
}
