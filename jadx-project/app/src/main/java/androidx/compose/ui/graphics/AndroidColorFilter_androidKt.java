package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidColorFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0002\u0010\t\u001a&\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a&\u0010\u0010\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\b\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\b\u0010\u0018\u001a\u00020\u0017H\u0000\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u001a\u001a\n\u0010\u001b\u001a\u00020\u001a*\u00020\u0001*\f\b\u0000\u0010\u001c\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"actualColorMatrixColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "colorMatrix", "Landroidx/compose/ui/graphics/ColorMatrix;", "actualColorMatrixColorFilter-jHG-Opc", "([F)Landroid/graphics/ColorFilter;", "actualColorMatrixFromFilter", "filter", "(Landroid/graphics/ColorFilter;)[F", "actualLightingColorFilter", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "actualLightingColorFilter--OWjLjI", "(JJ)Landroid/graphics/ColorFilter;", "actualTintColorFilter", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "actualTintColorFilter-xETnrds", "(JI)Landroid/graphics/ColorFilter;", "supportsColorMatrixQuery", "", "supportsLightingColorFilterQuery", "asAndroidColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "asComposeColorFilter", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidColorFilter_androidKt {
    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter $this$asAndroidColorFilter) {
        return $this$asAndroidColorFilter.getNativeColorFilter$ui_graphics_release();
    }

    public static final ColorFilter asComposeColorFilter(android.graphics.ColorFilter $this$asComposeColorFilter) {
        if (29 > Build.VERSION.SDK_INT) goto L8;
        if (($this$asComposeColorFilter instanceof android.graphics.BlendModeColorFilter) == false) goto L8;
        return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter((android.graphics.BlendModeColorFilter) $this$asComposeColorFilter);
    L8:
        if (($this$asComposeColorFilter instanceof android.graphics.LightingColorFilter) == false) goto L13;
        if (supportsLightingColorFilterQuery() == false) goto L13;
        return new LightingColorFilter(ColorKt.Color(((android.graphics.LightingColorFilter) $this$asComposeColorFilter).getColorMultiply()), ColorKt.Color(((android.graphics.LightingColorFilter) $this$asComposeColorFilter).getColorAdd()), $this$asComposeColorFilter, null);
    L13:
        if (($this$asComposeColorFilter instanceof android.graphics.ColorMatrixColorFilter) == false) goto L18;
        if (supportsColorMatrixQuery() == false) goto L18;
        return new ColorMatrixColorFilter(null, $this$asComposeColorFilter, null);
    L18:
        return new ColorFilter($this$asComposeColorFilter);
    }

    /* JADX INFO: renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m4232actualTintColorFilterxETnrds(long color, int blendMode) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        android.graphics.ColorFilter androidColorFilter = BlendModeColorFilterHelper.INSTANCE.m4312BlendModeColorFilterxETnrds(color, blendMode);
        return androidColorFilter;
    L5:
        android.graphics.ColorFilter androidColorFilter2 = new PorterDuffColorFilter(ColorKt.m4420toArgb8_81llA(color), AndroidBlendMode_androidKt.m4218toPorterDuffModes9anfk8(blendMode));
        return androidColorFilter2;
    }

    /* JADX INFO: renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m4230actualColorMatrixColorFilterjHGOpc(float[] colorMatrix) {
        return new android.graphics.ColorMatrixColorFilter(colorMatrix);
    }

    /* JADX INFO: renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final android.graphics.ColorFilter m4231actualLightingColorFilterOWjLjI(long multiply, long add) {
        return new android.graphics.LightingColorFilter(ColorKt.m4420toArgb8_81llA(multiply), ColorKt.m4420toArgb8_81llA(add));
    }

    public static final float[] actualColorMatrixFromFilter(android.graphics.ColorFilter filter) {
        if ((filter instanceof android.graphics.ColorMatrixColorFilter) == false) goto L9;
        if (supportsColorMatrixQuery() == false) goto L9;
        return ColorMatrixFilterHelper.INSTANCE.m4445getColorMatrix8unuwjk((android.graphics.ColorMatrixColorFilter) filter);
    L9:
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    public static final boolean supportsColorMatrixQuery() {
        return true;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return true;
    }
}
