package androidx.compose.ui.graphics.colorspace;

import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0000\u001a*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0000\u001a\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000\u001a\u0018\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000\u001a\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0000\u001a)\u0010\"\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0080\b\u001a)\u0010'\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0080\b\u001a)\u0010(\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0080\b\u001a8\u0010)\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010)\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010,\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010-\u001a\u00020\u0015*\u00020\u00152\u0006\u0010.\u001a\u00020\u00112\b\b\u0002\u0010/\u001a\u000200H\u0007\u001a(\u00101\u001a\u00020\u0013*\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"absRcpResponse", "", "x", "a", "b", "c", "d", "g", "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "createConnector", "Landroidx/compose/ui/graphics/colorspace/Connector;", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "createConnector-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "mul3x3Float3_0", "", "r0", "r1", "r2", "mul3x3Float3_1", "mul3x3Float3_2", "rcpResponse", "e", "f", "response", "adapt", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "connect-YBCOT_4", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ColorSpaceKt {
    /* JADX INFO: renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final Connector m4786createConnectorYBCOT_4(ColorSpace source, ColorSpace destination, int intent) {
        if (source == destination) goto L11;
        DefaultConstructorMarker r1 = null;
        if (ColorModel.m4773equalsimpl0(source.m4782getModelxdoWZVw(), ColorModel.Companion.m4780getRgbxdoWZVw()) == false) goto L10;
        if (ColorModel.m4773equalsimpl0(destination.m4782getModelxdoWZVw(), ColorModel.Companion.m4780getRgbxdoWZVw()) == false) goto L10;
        Intrinsics.checkNotNull(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new Connector.RgbConnector((Rgb) source, (Rgb) destination, intent, r1);
    L10:
        return new Connector(source, destination, intent, r1);
    L11:
        return Connector.Companion.identity$ui_graphics_release(source);
    }

    /* JADX INFO: renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m4785connectYBCOT_4$default(ColorSpace r0, Rgb r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = ColorSpaces.INSTANCE.getSrgb();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = RenderIntent.Companion.m4801getPerceptualuksYyKA();
    L9:
        return m4784connectYBCOT_4(r0, r1, r2);
    }

    /* JADX INFO: renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m4784connectYBCOT_4(ColorSpace $this$connect_u2dYBCOT_4, ColorSpace destination, int intent) {
        int srcId = $this$connect_u2dYBCOT_4.getId$ui_graphics_release();
        int dstId = destination.getId$ui_graphics_release();
        if ((srcId | dstId) < 0) goto L10;
        MutableIntObjectMap<Connector> r2 = ConnectorKt.getConnectors();
        int r3 = ((dstId << 6) | srcId) | (intent << 12);
        Connector r5 = r2.get(r3);
        if (r5 != null) goto L9;
        r5 = m4786createConnectorYBCOT_4($this$connect_u2dYBCOT_4, destination, intent);
        r2.set(r3, r5);
    L9:
        return r5;
    L10:
        return m4786createConnectorYBCOT_4($this$connect_u2dYBCOT_4, destination, intent);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace r0, WhitePoint r1, Adaptation r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = Adaptation.Companion.getBradford();
    L6:
        return adapt(r0, r1, r2);
    }

    public static final ColorSpace adapt(ColorSpace $this$adapt, WhitePoint whitePoint, Adaptation adaptation) {
        if (ColorModel.m4773equalsimpl0($this$adapt.m4782getModelxdoWZVw(), ColorModel.Companion.m4780getRgbxdoWZVw()) == false) goto L9;
        Intrinsics.checkNotNull($this$adapt, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Rgb rgb = (Rgb) $this$adapt;
        if (compare(rgb.getWhitePoint(), whitePoint) == false) goto L7;
        return $this$adapt;
    L7:
        float[] xyz = whitePoint.toXyz$ui_graphics_release();
        float[] adaptationTransform = chromaticAdaptation(adaptation.getTransform$ui_graphics_release(), rgb.getWhitePoint().toXyz$ui_graphics_release(), xyz);
        float[] transform = mul3x3(adaptationTransform, rgb.getTransform$ui_graphics_release());
        return new Rgb(rgb, transform, whitePoint);
    L9:
        return $this$adapt;
    }

    public static final ColorSpace adapt(ColorSpace $this$adapt, WhitePoint whitePoint) {
        return adapt$default($this$adapt, whitePoint, null, 2, null);
    }

    public static final double rcpResponse(double x, double a, double b, double c, double d, double g) {
        if (x < (d * c)) goto L6;
        return (Math.pow(x, 1.0d / g) - b) / a;
    L6:
        return x / c;
    }

    public static final double response(double x, double a, double b, double c, double d, double g) {
        if (x < d) goto L6;
        return Math.pow((a * x) + b, g);
    L6:
        return c * x;
    }

    public static final double rcpResponse(double x, double a, double b, double c, double d, double e, double f, double g) {
        if (x < (d * c)) goto L6;
        return (Math.pow(x - e, 1.0d / g) - b) / a;
    L6:
        return (x - f) / c;
    }

    public static final double response(double x, double a, double b, double c, double d, double e, double f, double g) {
        if (x < d) goto L6;
        return Math.pow((a * x) + b, g) + e;
    L6:
        return (c * x) + f;
    }

    public static final double absRcpResponse(double x, double a, double b, double c, double d, double g) {
        if (x >= 0.0d) goto L5;
        double r4 = -x;
    L7:
        return Math.copySign(rcpResponse(r4, a, b, c, d, g), x);
    L5:
        r4 = x;
        goto L7
    }

    public static final double absResponse(double x, double a, double b, double c, double d, double g) {
        if (x >= 0.0d) goto L5;
        double r4 = -x;
    L7:
        return Math.copySign(response(r4, a, b, c, d, g), x);
    L5:
        r4 = x;
        goto L7
    }

    public static final boolean compare(TransferParameters a, TransferParameters b) {
        if (b != null) goto L4;
    L18:
        return false;
    L4:
        if (Math.abs(a.getA() - b.getA()) >= 0.001d) goto L18;
        if (Math.abs(a.getB() - b.getB()) >= 0.001d) goto L18;
        if (Math.abs(a.getC() - b.getC()) >= 0.001d) goto L18;
        if (Math.abs(a.getD() - b.getD()) >= 0.002d) goto L18;
        if (Math.abs(a.getE() - b.getE()) >= 0.001d) goto L18;
        if (Math.abs(a.getF() - b.getF()) >= 0.001d) goto L18;
        if (Math.abs(a.getGamma() - b.getGamma()) >= 0.001d) goto L18;
        return true;
    }

    public static final boolean compare(WhitePoint a, WhitePoint b) {
        if (a != b) goto L6;
        return true;
    L6:
        if (Math.abs(a.getX() - b.getX()) < 0.001f) goto L8;
    L10:
        return false;
    L8:
        if (Math.abs(a.getY() - b.getY()) >= 0.001f) goto L10;
        return true;
    }

    public static final boolean compare(float[] a, float[] b) {
        if (a != b) goto L5;
        return true;
    L5:
        int i = 0;
        int r2 = a.length;
    L6:
        if (i >= r2) goto L14;
        if (Float.compare(a[i], b[i]) == 0) goto L13;
        if (Math.abs(a[i] - b[i]) <= 0.001f) goto L13;
        return false;
    L13:
        i = i + 1;
        goto L6
    L14:
        return true;
    }

    public static final float[] inverse3x3(float[] m) {
        float a = m[0];
        float b = m[3];
        float c = m[6];
        float d = m[1];
        float e = m[4];
        float f = m[7];
        float g = m[2];
        float h = m[5];
        float i = m[8];
        float xA = (e * i) - (f * h);
        float xB = (f * g) - (d * i);
        float xC = (d * h) - (e * g);
        float det = ((a * xA) + (b * xB)) + (c * xC);
        float[] inverted = new float[m.length];
        inverted[0] = xA / det;
        inverted[1] = xB / det;
        inverted[2] = xC / det;
        inverted[3] = ((c * h) - (b * i)) / det;
        inverted[4] = ((a * i) - (c * g)) / det;
        inverted[5] = ((b * g) - (a * h)) / det;
        inverted[6] = ((b * f) - (c * e)) / det;
        inverted[7] = ((c * d) - (a * f)) / det;
        inverted[8] = ((a * e) - (b * d)) / det;
        return inverted;
    }

    public static final float[] mul3x3(float[] lhs, float[] rhs) {
        float[] r = new float[9];
        if (lhs.length >= 9) goto L6;
        return r;
    L6:
        if (rhs.length >= 9) goto L8;
        return r;
    L8:
        r[0] = ((lhs[0] * rhs[0]) + (lhs[3] * rhs[1])) + (lhs[6] * rhs[2]);
        r[1] = ((lhs[1] * rhs[0]) + (lhs[4] * rhs[1])) + (lhs[7] * rhs[2]);
        r[2] = ((lhs[2] * rhs[0]) + (lhs[5] * rhs[1])) + (lhs[8] * rhs[2]);
        r[3] = ((lhs[0] * rhs[3]) + (lhs[3] * rhs[4])) + (lhs[6] * rhs[5]);
        r[4] = ((lhs[1] * rhs[3]) + (lhs[4] * rhs[4])) + (lhs[7] * rhs[5]);
        r[5] = ((lhs[2] * rhs[3]) + (lhs[5] * rhs[4])) + (lhs[8] * rhs[5]);
        r[6] = ((lhs[0] * rhs[6]) + (lhs[3] * rhs[7])) + (lhs[6] * rhs[8]);
        r[7] = ((lhs[1] * rhs[6]) + (lhs[4] * rhs[7])) + (lhs[7] * rhs[8]);
        r[8] = ((lhs[2] * rhs[6]) + (lhs[5] * rhs[7])) + (lhs[8] * rhs[8]);
        return r;
    }

    public static final float[] mul3x3Float3(float[] lhs, float[] rhs) {
        if (lhs.length >= 9) goto L6;
        return rhs;
    L6:
        if (rhs.length >= 3) goto L8;
        return rhs;
    L8:
        float r0 = rhs[0];
        float r1 = rhs[1];
        float r2 = rhs[2];
        rhs[0] = ((lhs[0] * r0) + (lhs[3] * r1)) + (lhs[6] * r2);
        rhs[1] = ((lhs[1] * r0) + (lhs[4] * r1)) + (lhs[7] * r2);
        rhs[2] = ((lhs[2] * r0) + (lhs[5] * r1)) + (lhs[8] * r2);
        return rhs;
    }

    public static final float mul3x3Float3_0(float[] lhs, float r0, float r1, float r2) {
        return ((lhs[0] * r0) + (lhs[3] * r1)) + (lhs[6] * r2);
    }

    public static final float mul3x3Float3_1(float[] lhs, float r0, float r1, float r2) {
        return ((lhs[1] * r0) + (lhs[4] * r1)) + (lhs[7] * r2);
    }

    public static final float mul3x3Float3_2(float[] lhs, float r0, float r1, float r2) {
        return ((lhs[2] * r0) + (lhs[5] * r1)) + (lhs[8] * r2);
    }

    public static final float[] mul3x3Diag(float[] lhs, float[] rhs) {
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], lhs[0] * rhs[3], lhs[1] * rhs[4], lhs[2] * rhs[5], lhs[0] * rhs[6], lhs[1] * rhs[7], lhs[2] * rhs[8]};
    }

    public static final float[] chromaticAdaptation(float[] matrix, float[] srcWhitePoint, float[] dstWhitePoint) {
        float[] srcLMS = mul3x3Float3(matrix, srcWhitePoint);
        float[] dstLMS = mul3x3Float3(matrix, dstWhitePoint);
        float[] LMS = {dstLMS[0] / srcLMS[0], dstLMS[1] / srcLMS[1], dstLMS[2] / srcLMS[2]};
        return mul3x3(inverse3x3(matrix), mul3x3Diag(LMS, matrix));
    }
}
