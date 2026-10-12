package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
final class CamUtils {
    static final float[][] CAM16RGB_TO_XYZ = null;
    static final float[][] SRGB_TO_XYZ = null;
    static final float[] WHITE_POINT_D65 = null;
    static final float[][] XYZ_TO_CAM16RGB = null;

    private CamUtils() {
    }

    static {
        XYZ_TO_CAM16RGB = new float[][]{new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
        CAM16RGB_TO_XYZ = new float[][]{new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
        WHITE_POINT_D65 = new float[]{95.047f, 100.0f, 108.883f};
        SRGB_TO_XYZ = new float[][]{new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    }

    static int intFromLStar(float lStar) {
        if (lStar >= 1.0f) goto L7;
        return ViewCompat.MEASURED_STATE_MASK;
    L7:
        if (lStar <= 99.0f) goto L10;
        return -1;
    L10:
        float fy = (lStar + 16.0f) / 116.0f;
        if (lStar <= 8.0f) goto L13;
        boolean lExceedsEpsilonKappa = true;
    L14:
        if (lExceedsEpsilonKappa == false) goto L16;
        float yT = (fy * fy) * fy;
    L18:
        if (((fy * fy) * fy) <= 0.008856452f) goto L20;
        boolean cubeExceedEpsilon = true;
    L21:
        if (cubeExceedEpsilon == false) goto L23;
        float xT = (fy * fy) * fy;
    L24:
        if (cubeExceedEpsilon == false) goto L26;
        float zT = (fy * fy) * fy;
    L28:
        return ColorUtils.XYZToColor(WHITE_POINT_D65[0] * xT, WHITE_POINT_D65[1] * yT, WHITE_POINT_D65[2] * zT);
    L26:
        zT = ((116.0f * fy) - 16.0f) / 903.2963f;
        goto L28
    L23:
        xT = ((fy * 116.0f) - 16.0f) / 903.2963f;
        goto L24
    L20:
        cubeExceedEpsilon = false;
        goto L21
    L16:
        yT = lStar / 903.2963f;
        goto L18
    L13:
        lExceedsEpsilonKappa = false;
        goto L14
    }

    static float lerp(float start, float stop, float amount) {
        return ((stop - start) * amount) + start;
    }

    static float lStarFromInt(int argb) {
        return lStarFromY(yFromInt(argb));
    }

    static float lStarFromY(float y) {
        float y2 = y / 100.0f;
        if (y2 <= 0.008856452f) goto L5;
        float yIntermediate = (float) Math.cbrt(y2);
        return (116.0f * yIntermediate) - 16.0f;
    L5:
        return 903.2963f * y2;
    }

    static float yFromInt(int argb) {
        float r = linearized(Color.red(argb));
        float g = linearized(Color.green(argb));
        float b = linearized(Color.blue(argb));
        float[][] matrix = SRGB_TO_XYZ;
        float y = ((matrix[1][0] * r) + (matrix[1][1] * g)) + (matrix[1][2] * b);
        return y;
    }

    static void xyzFromInt(int argb, float[] outXYZ) {
        float r = linearized(Color.red(argb));
        float g = linearized(Color.green(argb));
        float b = linearized(Color.blue(argb));
        float[][] matrix = SRGB_TO_XYZ;
        outXYZ[0] = ((matrix[0][0] * r) + (matrix[0][1] * g)) + (matrix[0][2] * b);
        outXYZ[1] = ((matrix[1][0] * r) + (matrix[1][1] * g)) + (matrix[1][2] * b);
        outXYZ[2] = ((matrix[2][0] * r) + (matrix[2][1] * g)) + (matrix[2][2] * b);
    }

    static float yFromLStar(float lstar) {
        if (lstar <= 8.0f) goto L7;
        return ((float) Math.pow((((double) lstar) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    L7:
        return (lstar / 903.2963f) * 100.0f;
    }

    static float linearized(int rgbComponent) {
        float normalized = rgbComponent / 255.0f;
        if (normalized > 0.04045f) goto L7;
        return (normalized / 12.92f) * 100.0f;
    L7:
        return ((float) Math.pow((0.055f + normalized) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }
}
