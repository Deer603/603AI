package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ColorSpaces.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020GH\u0080\b¢\u0006\u0002\bHJ\u001a\u0010I\u001a\u0004\u0018\u00010\u001e2\b\b\u0001\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u00020\u0010J\u001d\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020MH\u0000¢\u0006\u0002\bPJ\u001d\u0010Q\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020MH\u0000¢\u0006\u0002\bRJ\u001d\u0010S\u001a\u00020M2\u0006\u0010T\u001a\u00020\u00102\u0006\u0010O\u001a\u00020MH\u0000¢\u0006\u0002\bUJ\u001d\u0010V\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020MH\u0000¢\u0006\u0002\bWR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0$X\u0080\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0006R\u0011\u0010*\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0006R\u0011\u0010,\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0006R\u0011\u0010.\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0006R\u0011\u00100\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0006R\u000e\u00102\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00103\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001aR\u0011\u00107\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u00109\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0006R\u0011\u0010;\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u0011\u0010=\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u001aR\u0014\u0010A\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0012R\u0014\u0010C\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0006¨\u0006X"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "()V", "Aces", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "getAces", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Acescg", "getAcescg", "AdobeRgb", "getAdobeRgb", "Bt2020", "getBt2020", "Bt2020Hlg", "getBt2020Hlg", "Bt2020HlgTransferParameters", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getBt2020HlgTransferParameters$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Bt2020Pq", "getBt2020Pq", "Bt2020PqTransferParameters", "getBt2020PqTransferParameters$ui_graphics_release", "Bt2020Primaries", "", "getBt2020Primaries$ui_graphics_release", "()[F", "Bt709", "getBt709", "CieLab", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getCieLab", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieXyz", "getCieXyz", "ColorSpacesArray", "", "getColorSpacesArray$ui_graphics_release", "()[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "DciP3", "getDciP3", "DisplayP3", "getDisplayP3", "ExtendedSrgb", "getExtendedSrgb", "LinearExtendedSrgb", "getLinearExtendedSrgb", "LinearSrgb", "getLinearSrgb", "NoneTransferParameters", "Ntsc1953", "getNtsc1953", "Ntsc1953Primaries", "getNtsc1953Primaries$ui_graphics_release", "Oklab", "getOklab", "ProPhotoRgb", "getProPhotoRgb", "SmpteC", "getSmpteC", "Srgb", "getSrgb", "SrgbPrimaries", "getSrgbPrimaries$ui_graphics_release", "SrgbTransferParameters", "getSrgbTransferParameters$ui_graphics_release", "Unspecified", "getUnspecified$ui_graphics_release", "getColorSpace", "id", "", "getColorSpace$ui_graphics_release", "match", "toXYZD50", "function", "transferHlgEotf", "", "params", "x", "transferHlgEotf$ui_graphics_release", "transferHlgOetf", "transferHlgOetf$ui_graphics_release", "transferSt2048Eotf", "pq", "transferSt2048Eotf$ui_graphics_release", "transferSt2048Oetf", "transferSt2048Oetf$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ColorSpaces {
    private static final Rgb Aces = null;
    private static final Rgb Acescg = null;
    private static final Rgb AdobeRgb = null;
    private static final Rgb Bt2020 = null;
    private static final Rgb Bt2020Hlg = null;
    private static final TransferParameters Bt2020HlgTransferParameters = null;
    private static final Rgb Bt2020Pq = null;
    private static final TransferParameters Bt2020PqTransferParameters = null;
    private static final float[] Bt2020Primaries = null;
    private static final Rgb Bt709 = null;
    private static final ColorSpace CieLab = null;
    private static final ColorSpace CieXyz = null;
    private static final ColorSpace[] ColorSpacesArray = null;
    private static final Rgb DciP3 = null;
    private static final Rgb DisplayP3 = null;
    private static final Rgb ExtendedSrgb = null;
    public static final ColorSpaces INSTANCE = null;
    private static final Rgb LinearExtendedSrgb = null;
    private static final Rgb LinearSrgb = null;
    private static final TransferParameters NoneTransferParameters = null;
    private static final Rgb Ntsc1953 = null;
    private static final float[] Ntsc1953Primaries = null;
    private static final ColorSpace Oklab = null;
    private static final Rgb ProPhotoRgb = null;
    private static final Rgb SmpteC = null;
    private static final Rgb Srgb = null;
    private static final float[] SrgbPrimaries = null;
    private static final TransferParameters SrgbTransferParameters = null;
    private static final Rgb Unspecified = null;

    private ColorSpaces() {
    }

    static {
        INSTANCE = new ColorSpaces();
        SrgbPrimaries = new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        Ntsc1953Primaries = new float[]{0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Bt2020Primaries = new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        SrgbTransferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        NoneTransferParameters = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        Bt2020HlgTransferParameters = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        Bt2020PqTransferParameters = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        Srgb = new Rgb("sRGB IEC61966-2.1", SrgbPrimaries, Illuminant.INSTANCE.getD65(), SrgbTransferParameters, 0);
        LinearSrgb = new Rgb("sRGB IEC61966-2.1 (Linear)", SrgbPrimaries, Illuminant.INSTANCE.getD65(), 1.0d, 0.0f, 1.0f, 1);
        ExtendedSrgb = new Rgb("scRGB-nl IEC 61966-2-2:2003", SrgbPrimaries, Illuminant.INSTANCE.getD65(), null, new ColorSpaces$$ExternalSyntheticLambda0(), new ColorSpaces$$ExternalSyntheticLambda1(), -0.799f, 2.399f, SrgbTransferParameters, 2);
        LinearExtendedSrgb = new Rgb("scRGB IEC 61966-2-2:2003", SrgbPrimaries, Illuminant.INSTANCE.getD65(), 1.0d, -0.5f, 7.499f, 3);
        Bt709 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        Bt2020 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, Illuminant.INSTANCE.getD65(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        DciP3 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DisplayP3 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), SrgbTransferParameters, 7);
        Ntsc1953 = new Rgb("NTSC (1953)", Ntsc1953Primaries, Illuminant.INSTANCE.getC(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        SmpteC = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, Illuminant.INSTANCE.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        AdobeRgb = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), 2.2d, 0.0f, 1.0f, 10);
        ProPhotoRgb = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, Illuminant.INSTANCE.getD50(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        Aces = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, Illuminant.INSTANCE.getD60(), 1.0d, -65504.0f, 65504.0f, 12);
        Acescg = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, Illuminant.INSTANCE.getD60(), 1.0d, -65504.0f, 65504.0f, 13);
        CieXyz = new Xyz("Generic XYZ", 14);
        CieLab = new Lab("Generic L*a*b*", 15);
        Unspecified = new Rgb("None", SrgbPrimaries, Illuminant.INSTANCE.getD65(), NoneTransferParameters, 16);
        Bt2020Hlg = new Rgb("Hybrid Log Gamma encoding", Bt2020Primaries, Illuminant.INSTANCE.getD65(), null, new ColorSpaces$$ExternalSyntheticLambda2(), new ColorSpaces$$ExternalSyntheticLambda3(), 0.0f, 1.0f, Bt2020HlgTransferParameters, 17);
        Bt2020Pq = new Rgb("Perceptual Quantizer encoding", Bt2020Primaries, Illuminant.INSTANCE.getD65(), null, new ColorSpaces$$ExternalSyntheticLambda4(), new ColorSpaces$$ExternalSyntheticLambda5(), 0.0f, 1.0f, Bt2020PqTransferParameters, 18);
        Oklab = new Oklab("Oklab", 19);
        ColorSpacesArray = new ColorSpace[]{Srgb, LinearSrgb, ExtendedSrgb, LinearExtendedSrgb, Bt709, Bt2020, DciP3, DisplayP3, Ntsc1953, SmpteC, AdobeRgb, ProPhotoRgb, Aces, Acescg, CieXyz, CieLab, Unspecified, Bt2020Hlg, Bt2020Pq, Oklab};
    }

    public final float[] getSrgbPrimaries$ui_graphics_release() {
        return SrgbPrimaries;
    }

    public final float[] getNtsc1953Primaries$ui_graphics_release() {
        return Ntsc1953Primaries;
    }

    public final float[] getBt2020Primaries$ui_graphics_release() {
        return Bt2020Primaries;
    }

    public final TransferParameters getSrgbTransferParameters$ui_graphics_release() {
        return SrgbTransferParameters;
    }

    public final TransferParameters getBt2020HlgTransferParameters$ui_graphics_release() {
        return Bt2020HlgTransferParameters;
    }

    public final TransferParameters getBt2020PqTransferParameters$ui_graphics_release() {
        return Bt2020PqTransferParameters;
    }

    public final Rgb getSrgb() {
        return Srgb;
    }

    public final Rgb getLinearSrgb() {
        return LinearSrgb;
    }

    public final Rgb getExtendedSrgb() {
        return ExtendedSrgb;
    }

    static final double ExtendedSrgb$lambda$0(double x) {
        return ColorSpaceKt.absRcpResponse(x, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    static final double ExtendedSrgb$lambda$1(double x) {
        return ColorSpaceKt.absResponse(x, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final Rgb getLinearExtendedSrgb() {
        return LinearExtendedSrgb;
    }

    public final Rgb getBt709() {
        return Bt709;
    }

    public final Rgb getBt2020() {
        return Bt2020;
    }

    public final Rgb getDciP3() {
        return DciP3;
    }

    public final Rgb getDisplayP3() {
        return DisplayP3;
    }

    public final Rgb getNtsc1953() {
        return Ntsc1953;
    }

    public final Rgb getSmpteC() {
        return SmpteC;
    }

    public final Rgb getAdobeRgb() {
        return AdobeRgb;
    }

    public final Rgb getProPhotoRgb() {
        return ProPhotoRgb;
    }

    public final Rgb getAces() {
        return Aces;
    }

    public final Rgb getAcescg() {
        return Acescg;
    }

    public final ColorSpace getCieXyz() {
        return CieXyz;
    }

    public final ColorSpace getCieLab() {
        return CieLab;
    }

    public final Rgb getUnspecified$ui_graphics_release() {
        return Unspecified;
    }

    public final Rgb getBt2020Hlg() {
        return Bt2020Hlg;
    }

    static final double Bt2020Hlg$lambda$2(double x) {
        return INSTANCE.transferHlgOetf$ui_graphics_release(Bt2020HlgTransferParameters, x);
    }

    static final double Bt2020Hlg$lambda$3(double x) {
        return INSTANCE.transferHlgEotf$ui_graphics_release(Bt2020HlgTransferParameters, x);
    }

    public final Rgb getBt2020Pq() {
        return Bt2020Pq;
    }

    static final double Bt2020Pq$lambda$4(double x) {
        return INSTANCE.transferSt2048Oetf$ui_graphics_release(Bt2020PqTransferParameters, x);
    }

    static final double Bt2020Pq$lambda$5(double x) {
        return INSTANCE.transferSt2048Eotf$ui_graphics_release(Bt2020PqTransferParameters, x);
    }

    public final ColorSpace getOklab() {
        return Oklab;
    }

    public final ColorSpace match(float[] toXYZD50, TransferParameters function) {
        ColorSpace[] r0 = ColorSpacesArray;
        int r1 = r0.length;
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L13;
        ColorSpace colorSpace = r0[r2];
        if (ColorModel.m4773equalsimpl0(colorSpace.m4782getModelxdoWZVw(), ColorModel.Companion.m4780getRgbxdoWZVw()) == false) goto L12;
        ColorSpace r3 = ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null);
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Rgb rgb = (Rgb) r3;
        if (ColorSpaceKt.compare(toXYZD50, rgb.getTransform$ui_graphics_release()) == false) goto L12;
        if (ColorSpaceKt.compare(function, rgb.getTransferParameters()) == false) goto L12;
        return colorSpace;
    L12:
        r2 = r2 + 1;
        goto L4
    L13:
        return null;
    }

    public final ColorSpace getColorSpace$ui_graphics_release(int id) {
        return getColorSpacesArray$ui_graphics_release()[id];
    }

    public final ColorSpace[] getColorSpacesArray$ui_graphics_release() {
        return ColorSpacesArray;
    }

    public final double transferHlgOetf$ui_graphics_release(TransferParameters params, double x) {
        if (x >= 0.0d) goto L5;
        double sign = -1.0d;
    L6:
        double R = 1.0d / params.getA();
        double G = 1.0d / params.getB();
        double a = 1.0d / params.getC();
        double b = params.getD();
        double c = params.getE();
        double K = params.getF() + 1.0d;
        double absX = (x * sign) / K;
        if (absX > 1.0d) goto L9;
        double result = Math.pow(absX, G) * R;
    L11:
        return sign * result;
    L9:
        result = (Math.log(absX - b) * a) + c;
        goto L11
    L5:
        sign = 1.0d;
        goto L6
    }

    public final double transferHlgEotf$ui_graphics_release(TransferParameters params, double x) {
        if (x >= 0.0d) goto L5;
        double sign = -1.0d;
    L6:
        double absX = x * sign;
        double R = params.getA();
        double G = params.getB();
        double a = params.getC();
        double b = params.getD();
        double c = params.getE();
        double K = params.getF() + 1.0d;
        if ((absX * R) > 1.0d) goto L9;
        double result = Math.pow(absX * R, G);
    L11:
        return (K * sign) * result;
    L9:
        result = Math.exp((absX - c) * a) + b;
        goto L11
    L5:
        sign = 1.0d;
        goto L6
    }

    public final double transferSt2048Oetf$ui_graphics_release(TransferParameters params, double x) {
        if (x >= 0.0d) goto L5;
        double sign = -1.0d;
    L6:
        double absX = x * sign;
        double a = -params.getA();
        double b = params.getD();
        double c = 1.0d / params.getF();
        double d = params.getB();
        double e = -params.getE();
        double f = 1.0d / params.getC();
        double e2 = a + (Math.pow(absX, c) * b);
        double tmp = Math.max(e2, 0.0d);
        return sign * Math.pow(tmp / ((Math.pow(absX, c) * e) + d), f);
    L5:
        sign = 1.0d;
        goto L6
    }

    public final double transferSt2048Eotf$ui_graphics_release(TransferParameters pq, double x) {
        if (x >= 0.0d) goto L5;
        double sign = -1.0d;
    L6:
        double absX = x * sign;
        double tmp = RangesKt.coerceAtLeast(pq.getA() + (pq.getB() * Math.pow(absX, pq.getC())), 0.0d);
        return Math.pow(tmp / (pq.getD() + (pq.getE() * Math.pow(absX, pq.getC()))), pq.getF()) * sign;
    L5:
        sign = 1.0d;
        goto L6
    }
}
