package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a5\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00192\b\b\u0001\u0010\u0012\u001a\u00020\u00192\b\b\u0001\u0010\u0013\u001a\u00020\u00192\b\b\u0003\u0010\u0014\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a1\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0082\b\u001a,\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u001e\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0016\u0010/\u001a\u000200*\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0016\u00103\u001a\u00020\u0011*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a%\u00106\u001a\u00020\u0007*\u00020\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0016\u0010;\u001a\u00020\u0019*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u0018\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\n\n\u0002\u0010\u0004\u0012\u0004\b\u0002\u0010\u0003\"\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"UnspecifiedColor", "Lkotlin/ULong;", "getUnspecifiedColor$annotations", "()V", "J", "isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "UncheckedColor", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4414isSpecified8_81llA$annotations(long r0) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4416isUnspecified8_81llA$annotations(long r0) {
    }

    public static /* synthetic */ long Color$default(float r0, float r1, float r2, float r3, Rgb r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L6;
        r3 = 1.0f;
    L6:
        if ((r5 & 16) == 0) goto L9;
        r4 = ColorSpaces.INSTANCE.getSrgb();
    L9:
        return Color(r0, r1, r2, r3, r4);
    }

    public static final long Color(float red, float green, float blue, float alpha, ColorSpace colorSpace) {
        if (colorSpace.isSrgb() == false) goto L30;
        float $this$fastCoerceAtLeast$iv$iv = alpha;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L8:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0f) goto L10;
        $this$fastCoerceAtLeast$iv$iv = 1.0f;
    L10:
        int r5 = ((int) (($this$fastCoerceAtLeast$iv$iv * 255.0f) + 0.5f)) << 24;
        float $this$fastCoerceAtLeast$iv$iv2 = red;
        if ($this$fastCoerceAtLeast$iv$iv2 >= 0.0f) goto L14;
        $this$fastCoerceAtLeast$iv$iv2 = 0.0f;
    L14:
        if ($this$fastCoerceAtLeast$iv$iv2 <= 1.0f) goto L16;
        $this$fastCoerceAtLeast$iv$iv2 = 1.0f;
    L16:
        int r3 = (((int) (($this$fastCoerceAtLeast$iv$iv2 * 255.0f) + 0.5f)) << 16) | r5;
        float $this$fastCoerceAtLeast$iv$iv3 = green;
        if ($this$fastCoerceAtLeast$iv$iv3 >= 0.0f) goto L20;
        $this$fastCoerceAtLeast$iv$iv3 = 0.0f;
    L20:
        if ($this$fastCoerceAtLeast$iv$iv3 <= 1.0f) goto L22;
        $this$fastCoerceAtLeast$iv$iv3 = 1.0f;
    L22:
        int r4 = r3 | (((int) (($this$fastCoerceAtLeast$iv$iv3 * 255.0f) + 0.5f)) << 8);
        float $this$fastCoerceAtLeast$iv$iv4 = blue;
        if ($this$fastCoerceAtLeast$iv$iv4 >= 0.0f) goto L26;
        $this$fastCoerceAtLeast$iv$iv4 = 0.0f;
    L26:
        if ($this$fastCoerceAtLeast$iv$iv4 <= 1.0f) goto L28;
        $this$fastCoerceAtLeast$iv$iv4 = 1.0f;
    L28:
        int argb = ((int) (($this$fastCoerceAtLeast$iv$iv4 * 255.0f) + 0.5f)) | r4;
        return Color.m4362constructorimpl(ULong.m7599constructorimpl(ULong.m7599constructorimpl(argb) << 32));
    L30:
        int argb2 = colorSpace.getComponentCount();
        if (argb2 != 3) goto L33;
        boolean value$iv = true;
    L35:
        if (value$iv == true) goto L37;
        InlineClassHelperKt.throwIllegalArgumentException("Color only works with ColorSpaces with 3 components");
    L37:
        int id = colorSpace.getId$ui_graphics_release();
        if (id == (-1)) goto L40;
        boolean value$iv2 = true;
    L42:
        if (value$iv2 == true) goto L44;
        InlineClassHelperKt.throwIllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
    L44:
        float minimumValue$iv = colorSpace.getMinValue(0);
        float maximumValue$iv = colorSpace.getMaxValue(0);
        float $this$fastCoerceAtLeast$iv$iv5 = red;
        if ($this$fastCoerceAtLeast$iv$iv5 >= minimumValue$iv) goto L48;
        $this$fastCoerceAtLeast$iv$iv5 = minimumValue$iv;
    L48:
        if ($this$fastCoerceAtLeast$iv$iv5 <= maximumValue$iv) goto L50;
        $this$fastCoerceAtLeast$iv$iv5 = maximumValue$iv;
    L50:
        int bits$iv = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv5);
        int s$iv = bits$iv >>> 31;
        int e$iv = (bits$iv >>> 23) & 255;
        int r13 = 8388607;
        int m$iv = bits$iv & 8388607;
        int outE$iv = 0;
        int outM$iv = 0;
        int r19 = 512;
        if (e$iv != 255) goto L57;
        outE$iv = 31;
        if (m$iv == 0) goto L55;
        int r21 = 512;
    L56:
        outM$iv = r21;
        float r22 = 0.5f;
    L70:
        int out$iv = s$iv << 15;
        short r = (short) ((out$iv | (outE$iv << 10)) | outM$iv);
    L71:
        float minimumValue$iv2 = colorSpace.getMinValue(1);
        float maximumValue$iv2 = colorSpace.getMaxValue(1);
        float $this$fastCoerceAtLeast$iv$iv6 = green;
        if ($this$fastCoerceAtLeast$iv$iv6 >= minimumValue$iv2) goto L75;
        $this$fastCoerceAtLeast$iv$iv6 = minimumValue$iv2;
    L75:
        if ($this$fastCoerceAtLeast$iv$iv6 <= maximumValue$iv2) goto L77;
        $this$fastCoerceAtLeast$iv$iv6 = maximumValue$iv2;
    L77:
        int bits$iv2 = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv6);
        int s$iv2 = bits$iv2 >>> 31;
        int e$iv2 = (bits$iv2 >>> 23) & 255;
        int m$iv2 = bits$iv2 & 8388607;
        int outE$iv2 = 0;
        int outM$iv2 = 0;
        if (e$iv2 != 255) goto L84;
        outE$iv2 = 31;
        if (m$iv2 == 0) goto L82;
        int r16 = 512;
    L83:
        outM$iv2 = r16;
    L98:
        short g = (short) (((s$iv2 << 15) | (outE$iv2 << 10)) | outM$iv2);
    L99:
        float minimumValue$iv3 = colorSpace.getMinValue(2);
        float maximumValue$iv3 = colorSpace.getMaxValue(2);
        float $this$fastCoerceAtLeast$iv$iv7 = blue;
        if ($this$fastCoerceAtLeast$iv$iv7 >= minimumValue$iv3) goto L103;
        $this$fastCoerceAtLeast$iv$iv7 = minimumValue$iv3;
    L103:
        if ($this$fastCoerceAtLeast$iv$iv7 <= maximumValue$iv3) goto L105;
        $this$fastCoerceAtLeast$iv$iv7 = maximumValue$iv3;
    L105:
        int bits$iv3 = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv7);
        int s$iv3 = bits$iv3 >>> 31;
        int e$iv3 = (bits$iv3 >>> 23) & 255;
        int m$iv3 = bits$iv3 & r13;
        int outE$iv3 = 0;
        int outM$iv3 = 0;
        if (e$iv3 != 255) goto L112;
        outE$iv3 = 31;
        if (m$iv3 != 0) goto L111;
        r19 = 0;
    L111:
        outM$iv3 = r19;
    L124:
        int out$iv2 = s$iv3 << 15;
        short b = (short) ((out$iv2 | (outE$iv3 << 10)) | outM$iv3);
    L125:
        float $this$fastCoerceAtLeast$iv$iv8 = alpha;
        if ($this$fastCoerceAtLeast$iv$iv8 >= 0.0f) goto L129;
        $this$fastCoerceAtLeast$iv$iv8 = 0.0f;
    L129:
        if ($this$fastCoerceAtLeast$iv$iv8 <= 1.0f) goto L131;
        $this$fastCoerceAtLeast$iv$iv8 = 1.0f;
    L131:
        int a = (int) (($this$fastCoerceAtLeast$iv$iv8 * 1023.0f) + r22);
        return Color.m4362constructorimpl(ULong.m7599constructorimpl((((((((long) r) & 65535) << 48) | ((((long) g) & 65535) << 32)) | ((65535 & ((long) b)) << 16)) | ((((long) a) & 1023) << 6)) | (((long) id) & 63)));
    L112:
        int e$iv4 = (e$iv3 - 127) + 15;
        if (e$iv4 < 31) goto L115;
        outE$iv3 = 49;
        goto L124
    L115:
        if (e$iv4 > 0) goto L121;
        if (e$iv4 < (-10)) goto L124;
        int m$iv4 = (m$iv3 | 8388608) >> (1 - e$iv4);
        if ((m$iv4 & 4096) == 0) goto L120;
        m$iv4 = m$iv4 + 8192;
    L120:
        outM$iv3 = m$iv4 >> 13;
        goto L124
    L121:
        outE$iv3 = e$iv4;
        outM$iv3 = m$iv3 >> 13;
        if ((m$iv3 & 4096) == 0) goto L124;
        int out$iv3 = (outE$iv3 << 10) | outM$iv3;
        b = (short) ((s$iv3 << 15) | (out$iv3 + 1));
        goto L125
    L82:
        r16 = 0;
        goto L83
    L84:
        int e$iv5 = (e$iv2 - 127) + 15;
        if (e$iv5 < 31) goto L87;
        outE$iv2 = 49;
        goto L98
    L87:
        if (e$iv5 > 0) goto L94;
        if (e$iv5 < (-10)) goto L98;
        int m$iv5 = (m$iv2 | 8388608) >> (1 - e$iv5);
        if ((m$iv5 & 4096) == 0) goto L92;
        m$iv5 = m$iv5 + 8192;
    L92:
        outM$iv2 = m$iv5 >> 13;
        goto L98
    L94:
        outE$iv2 = e$iv5;
        outM$iv2 = m$iv2 >> 13;
        if ((m$iv2 & 4096) == 0) goto L98;
        int out$iv4 = (outE$iv2 << 10) | outM$iv2;
        r13 = 8388607;
        g = (short) ((out$iv4 + 1) | (s$iv2 << 15));
        goto L99
    L55:
        r21 = 0;
        goto L56
    L57:
        int e$iv6 = (e$iv - 127) + 15;
        if (e$iv6 < 31) goto L60;
        outE$iv = 49;
        r22 = 0.5f;
        goto L70
    L60:
        if (e$iv6 > 0) goto L67;
        if (e$iv6 < (-10)) goto L66;
        int m$iv6 = (m$iv | 8388608) >> (1 - e$iv6);
        r22 = 0.5f;
        if ((m$iv6 & 4096) == 0) goto L65;
        m$iv6 = m$iv6 + 8192;
    L65:
        outM$iv = m$iv6 >> 13;
        goto L70
    L66:
        r22 = 0.5f;
        goto L70
    L67:
        r22 = 0.5f;
        outE$iv = e$iv6;
        outM$iv = m$iv >> 13;
        if ((m$iv & 4096) == 0) goto L70;
        int out$iv5 = (outE$iv << 10) | outM$iv;
        r = (short) ((out$iv5 + 1) | (s$iv << 15));
        goto L71
    L40:
        value$iv2 = false;
        goto L42
    L33:
        value$iv = false;
        goto L35
    }

    public static /* synthetic */ long UncheckedColor$default(float r0, float r1, float r2, float r3, Rgb r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L6;
        r3 = 1.0f;
    L6:
        if ((r5 & 16) == 0) goto L9;
        r4 = ColorSpaces.INSTANCE.getSrgb();
    L9:
        return UncheckedColor(r0, r1, r2, r3, r4);
    }

    public static final long UncheckedColor(float red, float green, float blue, float alpha, ColorSpace colorSpace) {
        float r4 = 0.5f;
        if (colorSpace.isSrgb() == false) goto L6;
        int r1 = (int) ((255.0f * blue) + 0.5f);
        int argb = r1 | (((((int) ((red * 255.0f) + 0.5f)) << 16) | (((int) ((alpha * 255.0f) + 0.5f)) << 24)) | (((int) ((green * 255.0f) + 0.5f)) << 8));
        return Color.m4362constructorimpl(ULong.m7599constructorimpl(ULong.m7599constructorimpl(argb) << 32));
    L6:
        int bits$iv = Float.floatToRawIntBits(red);
        int s$iv = bits$iv >>> 31;
        int e$iv = (bits$iv >>> 23) & 255;
        int r9 = 8388607;
        int m$iv = bits$iv & 8388607;
        int outE$iv = 0;
        int outM$iv = 0;
        int r15 = 512;
        if (e$iv != 255) goto L13;
        outE$iv = 31;
        if (m$iv == 0) goto L11;
        int r18 = 512;
    L12:
        outM$iv = r18;
        char r19 = 16;
    L27:
        short r = (short) (((s$iv << 15) | (outE$iv << 10)) | outM$iv);
    L28:
        int bits$iv2 = Float.floatToRawIntBits(green);
        int s$iv2 = bits$iv2 >>> 31;
        int e$iv2 = (bits$iv2 >>> 23) & 255;
        int m$iv2 = bits$iv2 & 8388607;
        int outE$iv2 = 0;
        int outM$iv2 = 0;
        if (e$iv2 != 255) goto L35;
        outE$iv2 = 31;
        if (m$iv2 == 0) goto L33;
        int r12 = 512;
    L34:
        outM$iv2 = r12;
    L49:
        short g = (short) (((s$iv2 << 15) | (outE$iv2 << 10)) | outM$iv2);
    L50:
        int bits$iv3 = Float.floatToRawIntBits(blue);
        int s$iv3 = bits$iv3 >>> 31;
        int e$iv3 = (bits$iv3 >>> 23) & 255;
        int m$iv3 = bits$iv3 & r9;
        int outE$iv3 = 0;
        int outM$iv3 = 0;
        if (e$iv3 != 255) goto L57;
        outE$iv3 = 31;
        if (m$iv3 != 0) goto L56;
        r15 = 0;
    L56:
        outM$iv3 = r15;
    L69:
        int out$iv = s$iv3 << 15;
        short b = (short) ((out$iv | (outE$iv3 << 10)) | outM$iv3);
    L70:
        int a = (int) ((Math.max(0.0f, Math.min(alpha, 1.0f)) * 1023.0f) + r4);
        int id = colorSpace.getId$ui_graphics_release();
        return Color.m4362constructorimpl(ULong.m7599constructorimpl((((((((long) r) & 65535) << 48) | ((((long) g) & 65535) << 32)) | ((65535 & ((long) b)) << r19)) | ((((long) a) & 1023) << 6)) | (((long) id) & 63)));
    L57:
        int e$iv4 = (e$iv3 - 127) + 15;
        if (e$iv4 < 31) goto L60;
        outE$iv3 = 49;
        goto L69
    L60:
        if (e$iv4 > 0) goto L66;
        if (e$iv4 < (-10)) goto L69;
        int m$iv4 = (m$iv3 | 8388608) >> (1 - e$iv4);
        if ((m$iv4 & 4096) == 0) goto L65;
        m$iv4 = m$iv4 + 8192;
    L65:
        outM$iv3 = m$iv4 >> 13;
        goto L69
    L66:
        outE$iv3 = e$iv4;
        outM$iv3 = m$iv3 >> 13;
        if ((m$iv3 & 4096) == 0) goto L69;
        int out$iv2 = (outE$iv3 << 10) | outM$iv3;
        b = (short) ((s$iv3 << 15) | (out$iv2 + 1));
        goto L70
    L33:
        r12 = 0;
        goto L34
    L35:
        int e$iv5 = (e$iv2 - 127) + 15;
        if (e$iv5 < 31) goto L38;
        outE$iv2 = 49;
        goto L49
    L38:
        if (e$iv5 > 0) goto L45;
        if (e$iv5 < (-10)) goto L49;
        int m$iv5 = (m$iv2 | 8388608) >> (1 - e$iv5);
        if ((m$iv5 & 4096) == 0) goto L43;
        m$iv5 = m$iv5 + 8192;
    L43:
        outM$iv2 = m$iv5 >> 13;
        goto L49
    L45:
        outE$iv2 = e$iv5;
        outM$iv2 = m$iv2 >> 13;
        if ((m$iv2 & 4096) == 0) goto L49;
        int out$iv3 = (outE$iv2 << 10) | outM$iv2;
        r9 = 8388607;
        g = (short) ((out$iv3 + 1) | (s$iv2 << 15));
        goto L50
    L11:
        r18 = 0;
        goto L12
    L13:
        int e$iv6 = (e$iv - 127) + 15;
        if (e$iv6 < 31) goto L16;
        outE$iv = 49;
        r19 = 16;
        goto L27
    L16:
        if (e$iv6 > 0) goto L23;
        if (e$iv6 < (-10)) goto L22;
        int m$iv6 = (m$iv | 8388608) >> (1 - e$iv6);
        r19 = 16;
        if ((m$iv6 & 4096) == 0) goto L21;
        m$iv6 = m$iv6 + 8192;
    L21:
        outM$iv = m$iv6 >> 13;
        goto L27
    L22:
        r19 = 16;
        goto L27
    L23:
        r19 = 16;
        outE$iv = e$iv6;
        outM$iv = m$iv >> 13;
        if ((m$iv & 4096) == 0) goto L27;
        int out$iv4 = (outE$iv << 10) | outM$iv;
        r4 = 0.5f;
        r = (short) ((out$iv4 + 1) | (s$iv << 15));
        goto L28
    }

    public static final long Color(int color) {
        return Color.m4362constructorimpl(ULong.m7599constructorimpl(ULong.m7599constructorimpl(color) << 32));
    }

    public static final long Color(long color) {
        return Color.m4362constructorimpl(ULong.m7599constructorimpl(color << 32));
    }

    public static /* synthetic */ long Color$default(int r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 8) == 0) goto L6;
        r3 = 255;
    L6:
        return Color(r0, r1, r2, r3);
    }

    public static final long Color(int red, int green, int blue, int alpha) {
        int color = ((((alpha & 255) << 24) | ((red & 255) << 16)) | ((green & 255) << 8)) | (blue & 255);
        return Color(color);
    }

    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m4417lerpjxsXWHM(long start, long stop, float fraction) {
        ColorSpace colorSpace = ColorSpaces.INSTANCE.getOklab();
        long startColor = Color.m4363convertvNxB06k(start, colorSpace);
        long endColor = Color.m4363convertvNxB06k(stop, colorSpace);
        float startAlpha = Color.m4368getAlphaimpl(startColor);
        float startL = Color.m4372getRedimpl(startColor);
        float startA = Color.m4371getGreenimpl(startColor);
        float startB = Color.m4369getBlueimpl(startColor);
        float endAlpha = Color.m4368getAlphaimpl(endColor);
        float endL = Color.m4372getRedimpl(endColor);
        float endA = Color.m4371getGreenimpl(endColor);
        float endB = Color.m4369getBlueimpl(endColor);
        float $this$fastCoerceAtLeast$iv$iv = fraction;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0f) goto L8;
        $this$fastCoerceAtLeast$iv$iv = 1.0f;
    L8:
        float minimumValue$iv = $this$fastCoerceAtLeast$iv$iv;
        long interpolated = UncheckedColor(MathHelpersKt.lerp(startL, endL, minimumValue$iv), MathHelpersKt.lerp(startA, endA, minimumValue$iv), MathHelpersKt.lerp(startB, endB, minimumValue$iv), MathHelpersKt.lerp(startAlpha, endAlpha, minimumValue$iv), colorSpace);
        return Color.m4363convertvNxB06k(interpolated, Color.m4370getColorSpaceimpl(stop));
    }

    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m4411compositeOverOWjLjI(long $this$compositeOver_u2d_u2dOWjLjI, long background) {
        long fg = Color.m4363convertvNxB06k($this$compositeOver_u2d_u2dOWjLjI, Color.m4370getColorSpaceimpl(background));
        float bgA = Color.m4368getAlphaimpl(background);
        float fgA = Color.m4368getAlphaimpl(fg);
        float a = ((1.0f - fgA) * bgA) + fgA;
        float fgC$iv = Color.m4372getRedimpl(fg);
        float bgC$iv = Color.m4372getRedimpl(background);
        float b = 0.0f;
        boolean r13 = true;
        if (a != 0.0f) goto L5;
        boolean r12 = true;
    L6:
        if (r12 == false) goto L8;
        float r = 0.0f;
    L9:
        float fgC$iv2 = Color.m4371getGreenimpl(fg);
        float bgC$iv2 = Color.m4371getGreenimpl(background);
        if (a != 0.0f) goto L12;
        boolean r15 = true;
    L13:
        if (r15 == false) goto L15;
        float g = 0.0f;
    L16:
        float fgC$iv3 = Color.m4369getBlueimpl(fg);
        float bgC$iv3 = Color.m4369getBlueimpl(background);
        if (a == 0.0f) goto L20;
        r13 = false;
    L20:
        if (r13 == true) goto L24;
        b = ((fgC$iv3 * fgA) + ((bgC$iv3 * bgA) * (1.0f - fgA))) / a;
    L24:
        return UncheckedColor(r, g, b, a, Color.m4370getColorSpaceimpl(background));
    L15:
        g = ((fgC$iv2 * fgA) + ((bgC$iv2 * bgA) * (1.0f - fgA))) / a;
        goto L16
    L12:
        r15 = false;
        goto L13
    L8:
        r = ((fgC$iv * fgA) + ((bgC$iv * bgA) * (1.0f - fgA))) / a;
        goto L9
    L5:
        r12 = false;
        goto L6
    }

    private static final float compositeComponent(float fgC, float bgC, float fgA, float bgA, float a) {
        if (a != 0.0f) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        return 0.0f;
    L9:
        return ((fgC * fgA) + ((bgC * bgA) * (1.0f - fgA))) / a;
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m4412getComponents8_81llA(long $this$getComponents_u2d8_81llA) {
        return new float[]{Color.m4372getRedimpl($this$getComponents_u2d8_81llA), Color.m4371getGreenimpl($this$getComponents_u2d8_81llA), Color.m4369getBlueimpl($this$getComponents_u2d8_81llA), Color.m4368getAlphaimpl($this$getComponents_u2d8_81llA)};
    }

    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m4418luminance8_81llA(long $this$luminance_u2d8_81llA) {
        ColorSpace colorSpace = Color.m4370getColorSpaceimpl($this$luminance_u2d8_81llA);
        boolean value$iv = ColorModel.m4773equalsimpl0(colorSpace.m4782getModelxdoWZVw(), ColorModel.Companion.m4780getRgbxdoWZVw());
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ColorModel.m4776toStringimpl(colorSpace.m4782getModelxdoWZVw()));
    L5:
        Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotf = ((Rgb) colorSpace).getEotfFunc$ui_graphics_release();
        double r = eotf.invoke(Color.m4372getRedimpl($this$luminance_u2d8_81llA));
        double g = eotf.invoke(Color.m4371getGreenimpl($this$luminance_u2d8_81llA));
        double b = eotf.invoke(Color.m4369getBlueimpl($this$luminance_u2d8_81llA));
        float $this$fastCoerceIn$iv = (float) (((0.2126d * r) + (0.7152d * g)) + (0.0722d * b));
        float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L9;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L9:
        if ($this$fastCoerceAtLeast$iv$iv > 1.0f) goto L12;
        return $this$fastCoerceAtLeast$iv$iv;
    L12:
        return 1.0f;
    }

    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m4420toArgb8_81llA(long $this$toArgb_u2d8_81llA) {
        return (int) ULong.m7599constructorimpl(Color.m4363convertvNxB06k($this$toArgb_u2d8_81llA, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m4413isSpecified8_81llA(long $this$isSpecified) {
        if ($this$isSpecified == 16) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m4415isUnspecified8_81llA(long $this$isUnspecified) {
        if ($this$isUnspecified != 16) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m4419takeOrElseDxMtmZc(long $this$takeOrElse_u2dDxMtmZc, Function0<Color> r8) {
        if ($this$takeOrElse_u2dDxMtmZc == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L9;
        return $this$takeOrElse_u2dDxMtmZc;
    L9:
        return r8.invoke().m4376unboximpl();
    L5:
        r4 = false;
        goto L6
    }
}
