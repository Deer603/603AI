package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidColorSpace.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelper;", "", "()V", "androidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "composeColorSpace", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ColorSpaceVerificationHelper {
    public static final ColorSpaceVerificationHelper INSTANCE = null;

    static {
        INSTANCE = new ColorSpaceVerificationHelper();
    }

    private ColorSpaceVerificationHelper() {
    }

    @JvmStatic
    public static final ColorSpace androidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace $this$androidColorSpace) {
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getSrgb()) == false) goto L6;
        return ColorSpace.get(ColorSpace.Named.SRGB);
    L6:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getAces()) == false) goto L9;
        return ColorSpace.get(ColorSpace.Named.ACES);
    L9:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getAcescg()) == false) goto L12;
        return ColorSpace.get(ColorSpace.Named.ACESCG);
    L12:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getAdobeRgb()) == false) goto L15;
        return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
    L15:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getBt2020()) == false) goto L18;
        return ColorSpace.get(ColorSpace.Named.BT2020);
    L18:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getBt709()) == false) goto L21;
        return ColorSpace.get(ColorSpace.Named.BT709);
    L21:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getCieLab()) == false) goto L24;
        return ColorSpace.get(ColorSpace.Named.CIE_LAB);
    L24:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getCieXyz()) == false) goto L27;
        return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
    L27:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getDciP3()) == false) goto L30;
        return ColorSpace.get(ColorSpace.Named.DCI_P3);
    L30:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getDisplayP3()) == false) goto L33;
        return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
    L33:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getExtendedSrgb()) == false) goto L36;
        return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
    L36:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getLinearExtendedSrgb()) == false) goto L39;
        return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
    L39:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getLinearSrgb()) == false) goto L42;
        return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
    L42:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getNtsc1953()) == false) goto L45;
        return ColorSpace.get(ColorSpace.Named.NTSC_1953);
    L45:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getProPhotoRgb()) == false) goto L48;
        return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
    L48:
        if (Intrinsics.areEqual($this$androidColorSpace, ColorSpaces.INSTANCE.getSmpteC()) == false) goto L51;
        return ColorSpace.get(ColorSpace.Named.SMPTE_C);
    L51:
        if (Build.VERSION.SDK_INT < 34) goto L56;
        ColorSpace v34ColorSpace = ColorSpaceVerificationHelperV34.obtainAndroidColorSpace($this$androidColorSpace);
        if (v34ColorSpace == null) goto L56;
        return v34ColorSpace;
    L56:
        if (($this$androidColorSpace instanceof Rgb) == false) goto L67;
        float[] whitePointArray = ((Rgb) $this$androidColorSpace).getWhitePoint().toXyz$ui_graphics_release();
        TransferParameters transferParams = ((Rgb) $this$androidColorSpace).getTransferParameters();
        if (transferParams == null) goto L60;
        ColorSpace.Rgb.TransferParameters r6 = new ColorSpace.Rgb.TransferParameters(transferParams.getA(), transferParams.getB(), transferParams.getC(), transferParams.getD(), transferParams.getE(), transferParams.getF(), transferParams.getGamma());
    L61:
        ColorSpace.Rgb.TransferParameters androidTransferParams = r6;
        if (androidTransferParams == null) goto L64;
        ColorSpace.Rgb r2 = new ColorSpace.Rgb($this$androidColorSpace.getName(), ((Rgb) $this$androidColorSpace).getPrimaries$ui_graphics_release(), whitePointArray, androidTransferParams);
    L84:
        return r2;
    L64:
        String r3 = $this$androidColorSpace.getName();
        float[] r4 = ((Rgb) $this$androidColorSpace).getPrimaries$ui_graphics_release();
        final Function1<Double, Double> r7 = ((Rgb) $this$androidColorSpace).getOetf();
        DoubleUnaryOperator r8 = new ColorSpaceVerificationHelper$$ExternalSyntheticLambda0(r7);
        final Function1<Double, Double> r9 = ((Rgb) $this$androidColorSpace).getEotf();
        r2 = new ColorSpace.Rgb(r3, r4, whitePointArray, r8, new ColorSpaceVerificationHelper$$ExternalSyntheticLambda1(r9), $this$androidColorSpace.getMinValue(0), $this$androidColorSpace.getMaxValue(0));
        goto L84
    L60:
        r6 = null;
        goto L61
    L67:
        return ColorSpace.get(ColorSpace.Named.SRGB);
    }

    static final double androidColorSpace$lambda$0(Function1 $tmp0, double p0) {
        return ((Number) $tmp0.invoke(Double.valueOf(p0))).doubleValue();
    }

    static final double androidColorSpace$lambda$1(Function1 $tmp0, double p0) {
        return ((Number) $tmp0.invoke(Double.valueOf(p0))).doubleValue();
    }

    @JvmStatic
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(final ColorSpace $this$composeColorSpace) {
        int r1 = $this$composeColorSpace.getId();
        if (r1 != ColorSpace.Named.SRGB.ordinal()) goto L6;
        return ColorSpaces.INSTANCE.getSrgb();
    L6:
        if (r1 != ColorSpace.Named.ACES.ordinal()) goto L9;
        return ColorSpaces.INSTANCE.getAces();
    L9:
        if (r1 != ColorSpace.Named.ACESCG.ordinal()) goto L12;
        return ColorSpaces.INSTANCE.getAcescg();
    L12:
        if (r1 != ColorSpace.Named.ADOBE_RGB.ordinal()) goto L15;
        return ColorSpaces.INSTANCE.getAdobeRgb();
    L15:
        if (r1 != ColorSpace.Named.BT2020.ordinal()) goto L18;
        return ColorSpaces.INSTANCE.getBt2020();
    L18:
        if (r1 != ColorSpace.Named.BT709.ordinal()) goto L21;
        return ColorSpaces.INSTANCE.getBt709();
    L21:
        if (r1 != ColorSpace.Named.CIE_LAB.ordinal()) goto L24;
        return ColorSpaces.INSTANCE.getCieLab();
    L24:
        if (r1 != ColorSpace.Named.CIE_XYZ.ordinal()) goto L27;
        return ColorSpaces.INSTANCE.getCieXyz();
    L27:
        if (r1 != ColorSpace.Named.DCI_P3.ordinal()) goto L30;
        return ColorSpaces.INSTANCE.getDciP3();
    L30:
        if (r1 != ColorSpace.Named.DISPLAY_P3.ordinal()) goto L33;
        return ColorSpaces.INSTANCE.getDisplayP3();
    L33:
        if (r1 != ColorSpace.Named.EXTENDED_SRGB.ordinal()) goto L36;
        return ColorSpaces.INSTANCE.getExtendedSrgb();
    L36:
        if (r1 != ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) goto L39;
        return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
    L39:
        if (r1 != ColorSpace.Named.LINEAR_SRGB.ordinal()) goto L42;
        return ColorSpaces.INSTANCE.getLinearSrgb();
    L42:
        if (r1 != ColorSpace.Named.NTSC_1953.ordinal()) goto L45;
        return ColorSpaces.INSTANCE.getNtsc1953();
    L45:
        if (r1 != ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) goto L48;
        return ColorSpaces.INSTANCE.getProPhotoRgb();
    L48:
        if (r1 != ColorSpace.Named.SMPTE_C.ordinal()) goto L51;
        return ColorSpaces.INSTANCE.getSmpteC();
    L51:
        if (Build.VERSION.SDK_INT < 34) goto L56;
        androidx.compose.ui.graphics.colorspace.ColorSpace v34ColorSpace = ColorSpaceVerificationHelperV34.obtainComposeColorSpaceFromId($this$composeColorSpace.getId());
        if (Intrinsics.areEqual(v34ColorSpace, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release()) == true) goto L56;
        return v34ColorSpace;
    L56:
        if (($this$composeColorSpace instanceof ColorSpace.Rgb) == false) goto L66;
        ColorSpace.Rgb.TransferParameters transferParams = ((ColorSpace.Rgb) $this$composeColorSpace).getTransferParameters();
        if (((ColorSpace.Rgb) $this$composeColorSpace).getWhitePoint().length != 3) goto L60;
        WhitePoint r2 = new WhitePoint(((ColorSpace.Rgb) $this$composeColorSpace).getWhitePoint()[0], ((ColorSpace.Rgb) $this$composeColorSpace).getWhitePoint()[1], ((ColorSpace.Rgb) $this$composeColorSpace).getWhitePoint()[2]);
    L61:
        WhitePoint whitePoint = r2;
        if (transferParams == null) goto L64;
        TransferParameters composeTransferParams = new TransferParameters(transferParams.g, transferParams.a, transferParams.b, transferParams.c, transferParams.d, transferParams.e, transferParams.f);
    L65:
        Rgb r6 = new Rgb(((ColorSpace.Rgb) $this$composeColorSpace).getName(), ((ColorSpace.Rgb) $this$composeColorSpace).getPrimaries(), whitePoint, ((ColorSpace.Rgb) $this$composeColorSpace).getTransform(), new ColorSpaceVerificationHelper$$ExternalSyntheticLambda2($this$composeColorSpace), new ColorSpaceVerificationHelper$$ExternalSyntheticLambda3($this$composeColorSpace), $this$composeColorSpace.getMinValue(0), $this$composeColorSpace.getMaxValue(0), composeTransferParams, ((ColorSpace.Rgb) $this$composeColorSpace).getId());
    L68:
        return r6;
    L64:
        composeTransferParams = null;
        goto L65
    L60:
        r2 = new WhitePoint(((ColorSpace.Rgb) $this$composeColorSpace).getWhitePoint()[0], ((ColorSpace.Rgb) $this$composeColorSpace).getWhitePoint()[1]);
        goto L61
    L66:
        r6 = ColorSpaces.INSTANCE.getSrgb();
        goto L68
    }

    static final double composeColorSpace$lambda$2(ColorSpace $this_composeColorSpace, double x) {
        return ((ColorSpace.Rgb) $this_composeColorSpace).getOetf().applyAsDouble(x);
    }

    static final double composeColorSpace$lambda$3(ColorSpace $this_composeColorSpace, double x) {
        return ((ColorSpace.Rgb) $this_composeColorSpace).getEotf().applyAsDouble(x);
    }
}
