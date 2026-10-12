package androidx.compose.ui.graphics;

import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0005\u001a\u00020\u0006*\u00060\u0003j\u0002`\u0007H\u0000\u001a\u0010\u0010\b\u001a\u00020\t*\u00060\u0003j\u0002`\u0007H\u0000\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00060\u0003j\u0002`\u0007H\u0000¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00060\u0003j\u0002`\u0007H\u0000¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u0011*\u00060\u0003j\u0002`\u0007H\u0000¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0012\u001a\u00020\u0013*\u00060\u0003j\u0002`\u0007H\u0000¢\u0006\u0002\u0010\u000f\u001a\u0010\u0010\u0014\u001a\u00020\u0006*\u00060\u0003j\u0002`\u0007H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u0006*\u00060\u0003j\u0002`\u0007H\u0000\u001a\u0015\u0010\u0016\u001a\u00020\u0017*\u00060\u0003j\u0002`\u0007H\u0000¢\u0006\u0002\u0010\u000f\u001a\u0018\u0010\u0018\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001a\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\u001b\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001a\u001a\u00020\tH\u0000\u001a\"\u0010\u001c\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\"\u0010!\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001a\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010%H\u0000\u001a\"\u0010&\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001a\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010 \u001a\u001a\u0010(\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010)H\u0000\u001a \u0010*\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u000e\u0010\u001a\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0000\u001a\"\u0010-\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001a\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b.\u0010 \u001a\"\u0010/\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u0010 \u001a\u0018\u00101\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001a\u001a\u00020\u0006H\u0000\u001a\u0018\u00102\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001a\u001a\u00020\u0006H\u0000\u001a\"\u00103\u001a\u00020\u0019*\u00060\u0003j\u0002`\u00072\u0006\u0010\u001a\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b4\u0010 *\n\u00105\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Paint", "Landroidx/compose/ui/graphics/Paint;", "makeNativePaint", "Landroid/graphics/Paint;", "asComposePaint", "getNativeAlpha", "", "Landroidx/compose/ui/graphics/NativePaint;", "getNativeAntiAlias", "", "getNativeColor", "Landroidx/compose/ui/graphics/Color;", "(Landroid/graphics/Paint;)J", "getNativeFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "(Landroid/graphics/Paint;)I", "getNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeMiterLimit", "getNativeStrokeWidth", "getNativeStyle", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeAlpha", "", "value", "setNativeAntiAlias", "setNativeBlendMode", "mode", "Landroidx/compose/ui/graphics/BlendMode;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeColor", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "setNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativePathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "setNativeShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeMiterLimit", "setNativeStrokeWidth", "setNativeStyle", "setNativeStyle--5YerkU", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidPaint_androidKt {

    /* JADX INFO: compiled from: AndroidPaint.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2 = null;

        static {
            int[] r0 = new int[android.graphics.Paint.Style.values().length];
            r0[android.graphics.Paint.Style.STROKE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L6:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[android.graphics.Paint.Cap.values().length];
            r1[android.graphics.Paint.Cap.BUTT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L32:
            r1[android.graphics.Paint.Cap.ROUND.ordinal()] = 2;     // Catch: NoSuchFieldError -> L13
        L34:
            r1[android.graphics.Paint.Cap.SQUARE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L17
        L18:
            $EnumSwitchMapping$1 = r1;
            int[] r2 = new int[android.graphics.Paint.Join.values().length];
            r2[android.graphics.Paint.Join.MITER.ordinal()] = 1;     // Catch: NoSuchFieldError -> L21
        L38:
            r2[android.graphics.Paint.Join.BEVEL.ordinal()] = 2;     // Catch: NoSuchFieldError -> L24
        L40:
            r2[android.graphics.Paint.Join.ROUND.ordinal()] = 3;     // Catch: NoSuchFieldError -> L27
        L28:
            $EnumSwitchMapping$2 = r2;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final Paint asComposePaint(android.graphics.Paint $this$asComposePaint) {
        return new AndroidPaint($this$asComposePaint);
    }

    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    /* JADX INFO: renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m4250setNativeBlendModeGB0RdKg(android.graphics.Paint $this$setNativeBlendMode_u2dGB0RdKg, int mode) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        WrapperVerificationHelperMethods.INSTANCE.m4769setBlendModeGB0RdKg($this$setNativeBlendMode_u2dGB0RdKg, mode);
        return;
    L5:
        $this$setNativeBlendMode_u2dGB0RdKg.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m4218toPorterDuffModes9anfk8(mode)));
    }

    public static final void setNativeColorFilter(android.graphics.Paint $this$setNativeColorFilter, ColorFilter value) {
        if (value == null) goto L4;
        android.graphics.ColorFilter r0 = AndroidColorFilter_androidKt.asAndroidColorFilter(value);
    L5:
        $this$setNativeColorFilter.setColorFilter(r0);
        return;
    L4:
        r0 = null;
        goto L5
    }

    public static final float getNativeAlpha(android.graphics.Paint $this$getNativeAlpha) {
        return $this$getNativeAlpha.getAlpha() / 255.0f;
    }

    public static final void setNativeAlpha(android.graphics.Paint $this$setNativeAlpha, float value) {
        $this$setNativeAlpha.setAlpha((int) Math.rint(255.0f * value));
    }

    public static final boolean getNativeAntiAlias(android.graphics.Paint $this$getNativeAntiAlias) {
        return $this$getNativeAntiAlias.isAntiAlias();
    }

    public static final void setNativeAntiAlias(android.graphics.Paint $this$setNativeAntiAlias, boolean value) {
        $this$setNativeAntiAlias.setAntiAlias(value);
    }

    public static final long getNativeColor(android.graphics.Paint $this$getNativeColor) {
        return ColorKt.Color($this$getNativeColor.getColor());
    }

    /* JADX INFO: renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m4251setNativeColor4WTKRHQ(android.graphics.Paint $this$setNativeColor_u2d4WTKRHQ, long value) {
        $this$setNativeColor_u2d4WTKRHQ.setColor(ColorKt.m4420toArgb8_81llA(value));
    }

    /* JADX INFO: renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m4255setNativeStyle5YerkU(android.graphics.Paint $this$setNativeStyle_u2d_u2d5YerkU, int value) {
        if (PaintingStyle.m4629equalsimpl0(value, PaintingStyle.Companion.m4634getStrokeTiuSbCo()) == false) goto L5;
        android.graphics.Paint.Style r0 = android.graphics.Paint.Style.STROKE;
    L6:
        $this$setNativeStyle_u2d_u2d5YerkU.setStyle(r0);
        return;
    L5:
        r0 = android.graphics.Paint.Style.FILL;
        goto L6
    }

    public static final int getNativeStyle(android.graphics.Paint $this$getNativeStyle) {
        android.graphics.Paint.Style r0 = $this$getNativeStyle.getStyle();
        if (r0 != null) goto L5;
        int r1 = -1;
    L7:
        if (r1 != 1) goto L10;
        return PaintingStyle.Companion.m4634getStrokeTiuSbCo();
    L10:
        return PaintingStyle.Companion.m4633getFillTiuSbCo();
    L5:
        r1 = WhenMappings.$EnumSwitchMapping$0[r0.ordinal()];
        goto L7
    }

    public static final float getNativeStrokeWidth(android.graphics.Paint $this$getNativeStrokeWidth) {
        return $this$getNativeStrokeWidth.getStrokeWidth();
    }

    public static final void setNativeStrokeWidth(android.graphics.Paint $this$setNativeStrokeWidth, float value) {
        $this$setNativeStrokeWidth.setStrokeWidth(value);
    }

    public static final int getNativeStrokeCap(android.graphics.Paint $this$getNativeStrokeCap) {
        android.graphics.Paint.Cap r0 = $this$getNativeStrokeCap.getStrokeCap();
        if (r0 != null) goto L5;
        int r1 = -1;
    L6:
        switch(r1) {
            case 1: goto L11;
            case 2: goto L14;
            case 3: goto L13;
            default: goto L12;
        };
    L12:
        return StrokeCap.Companion.m4719getButtKaPHkGw();
    L13:
        return StrokeCap.Companion.m4721getSquareKaPHkGw();
    L14:
        return StrokeCap.Companion.m4720getRoundKaPHkGw();
    L11:
        return StrokeCap.Companion.m4719getButtKaPHkGw();
    L5:
        r1 = WhenMappings.$EnumSwitchMapping$1[r0.ordinal()];
        goto L6
    }

    /* JADX INFO: renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m4253setNativeStrokeCapCSYIeUk(android.graphics.Paint $this$setNativeStrokeCap_u2dCSYIeUk, int value) {
        if (StrokeCap.m4715equalsimpl0(value, StrokeCap.Companion.m4721getSquareKaPHkGw()) == false) goto L6;
        android.graphics.Paint.Cap r0 = android.graphics.Paint.Cap.SQUARE;
    L12:
        $this$setNativeStrokeCap_u2dCSYIeUk.setStrokeCap(r0);
        return;
    L6:
        if (StrokeCap.m4715equalsimpl0(value, StrokeCap.Companion.m4720getRoundKaPHkGw()) == false) goto L9;
        r0 = android.graphics.Paint.Cap.ROUND;
        goto L12
    L9:
        if (StrokeCap.m4715equalsimpl0(value, StrokeCap.Companion.m4719getButtKaPHkGw()) == false) goto L11;
        r0 = android.graphics.Paint.Cap.BUTT;
        goto L12
    L11:
        r0 = android.graphics.Paint.Cap.BUTT;
        goto L12
    }

    public static final int getNativeStrokeJoin(android.graphics.Paint $this$getNativeStrokeJoin) {
        android.graphics.Paint.Join r0 = $this$getNativeStrokeJoin.getStrokeJoin();
        if (r0 != null) goto L5;
        int r1 = -1;
    L6:
        switch(r1) {
            case 1: goto L11;
            case 2: goto L14;
            case 3: goto L13;
            default: goto L12;
        };
    L12:
        return StrokeJoin.Companion.m4730getMiterLxFBmk8();
    L13:
        return StrokeJoin.Companion.m4731getRoundLxFBmk8();
    L14:
        return StrokeJoin.Companion.m4729getBevelLxFBmk8();
    L11:
        return StrokeJoin.Companion.m4730getMiterLxFBmk8();
    L5:
        r1 = WhenMappings.$EnumSwitchMapping$2[r0.ordinal()];
        goto L6
    }

    /* JADX INFO: renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m4254setNativeStrokeJoinkLtJ_vA(android.graphics.Paint $this$setNativeStrokeJoin_u2dkLtJ_vA, int value) {
        if (StrokeJoin.m4725equalsimpl0(value, StrokeJoin.Companion.m4730getMiterLxFBmk8()) == false) goto L6;
        android.graphics.Paint.Join r0 = android.graphics.Paint.Join.MITER;
    L12:
        $this$setNativeStrokeJoin_u2dkLtJ_vA.setStrokeJoin(r0);
        return;
    L6:
        if (StrokeJoin.m4725equalsimpl0(value, StrokeJoin.Companion.m4729getBevelLxFBmk8()) == false) goto L9;
        r0 = android.graphics.Paint.Join.BEVEL;
        goto L12
    L9:
        if (StrokeJoin.m4725equalsimpl0(value, StrokeJoin.Companion.m4731getRoundLxFBmk8()) == false) goto L11;
        r0 = android.graphics.Paint.Join.ROUND;
        goto L12
    L11:
        r0 = android.graphics.Paint.Join.MITER;
        goto L12
    }

    public static final float getNativeStrokeMiterLimit(android.graphics.Paint $this$getNativeStrokeMiterLimit) {
        return $this$getNativeStrokeMiterLimit.getStrokeMiter();
    }

    public static final void setNativeStrokeMiterLimit(android.graphics.Paint $this$setNativeStrokeMiterLimit, float value) {
        $this$setNativeStrokeMiterLimit.setStrokeMiter(value);
    }

    public static final int getNativeFilterQuality(android.graphics.Paint $this$getNativeFilterQuality) {
        if ($this$getNativeFilterQuality.isFilterBitmap() == true) goto L6;
        return FilterQuality.Companion.m4467getNonefv9h1I();
    L6:
        return FilterQuality.Companion.m4465getLowfv9h1I();
    }

    /* JADX INFO: renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m4252setNativeFilterQuality50PEsBU(android.graphics.Paint $this$setNativeFilterQuality_u2d50PEsBU, int value) {
        $this$setNativeFilterQuality_u2d50PEsBU.setFilterBitmap(!FilterQuality.m4460equalsimpl0(value, FilterQuality.Companion.m4467getNonefv9h1I()));
    }

    public static final void setNativeShader(android.graphics.Paint $this$setNativeShader, Shader value) {
        $this$setNativeShader.setShader(value);
    }

    public static final void setNativePathEffect(android.graphics.Paint $this$setNativePathEffect, PathEffect value) {
        AndroidPathEffect r0 = (AndroidPathEffect) value;
        if (r0 == null) goto L5;
        android.graphics.PathEffect r1 = r0.getNativePathEffect();
    L6:
        $this$setNativePathEffect.setPathEffect(r1);
        return;
    L5:
        r1 = null;
        goto L6
    }
}
