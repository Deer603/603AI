package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Connector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\fH\u0017J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0010ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "transformSource", "transformDestination", "renderIntent", "transform", "", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDestination", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getRenderIntent-uksYyKA", "()I", "I", "getSource", "r", "", "g", "b", "v", "transformToColor", "Landroidx/compose/ui/graphics/Color;", "color", "transformToColor-l2rxGTc$ui_graphics_release", "(J)J", "Companion", "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Connector {
    public static final Companion Companion = null;
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;

    /* JADX INFO: compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "()V", "computeTransform", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "identity", "Landroidx/compose/ui/graphics/colorspace/Connector;", "identity$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: access$computeTransform-YBCOT_4, reason: not valid java name */
        public static final /* synthetic */ float[] m4789access$computeTransformYBCOT_4(Companion $this, ColorSpace source, ColorSpace destination, int intent) {
            return $this.m4790computeTransformYBCOT_4(source, destination, intent);
        }

        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m4790computeTransformYBCOT_4(ColorSpace source, ColorSpace destination, int intent) {
            if (RenderIntent.m4796equalsimpl0(intent, RenderIntent.Companion.m4800getAbsoluteuksYyKA()) == true) goto L5;
            return null;
        L5:
            boolean srcRGB = ColorModel.m4773equalsimpl0(source.m4782getModelxdoWZVw(), ColorModel.Companion.m4780getRgbxdoWZVw());
            boolean dstRGB = ColorModel.m4773equalsimpl0(destination.m4782getModelxdoWZVw(), ColorModel.Companion.m4780getRgbxdoWZVw());
            if (srcRGB == false) goto L9;
            if (dstRGB == false) goto L9;
            return null;
        L9:
            if (srcRGB == true) goto L13;
            if (dstRGB == true) goto L13;
            return null;
        L13:
            if (srcRGB == false) goto L15;
            ColorSpace r1 = source;
        L16:
            Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) r1;
            if (srcRGB == false) goto L19;
            float[] srcXYZ = rgb.getWhitePoint().toXyz$ui_graphics_release();
        L20:
            if (dstRGB == false) goto L22;
            float[] dstXYZ = rgb.getWhitePoint().toXyz$ui_graphics_release();
        L24:
            return new float[]{srcXYZ[0] / dstXYZ[0], srcXYZ[1] / dstXYZ[1], srcXYZ[2] / dstXYZ[2]};
        L22:
            dstXYZ = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            goto L24
        L19:
            srcXYZ = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            goto L20
        L15:
            r1 = destination;
            goto L16
        }

        public final Connector identity$ui_graphics_release(final ColorSpace source) {
            final int r0 = RenderIntent.Companion.m4802getRelativeuksYyKA();
            return new Connector$Companion$identity$1(source, r0);
        }
    }

    /* JADX INFO: compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "mSource", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mDestination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "mTransform", "", "computeTransform", "source", "destination", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "transform", "v", "transformToColor", "Landroidx/compose/ui/graphics/Color;", "color", "transformToColor-l2rxGTc$ui_graphics_release", "(J)J", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RgbConnector extends Connector {
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        public /* synthetic */ RgbConnector(Rgb r1, Rgb r2, int r3, DefaultConstructorMarker r4) {
            this(r1, r2, r3);
        }

        private RgbConnector(Rgb mSource, Rgb mDestination, int intent) {
            super(mSource, mDestination, mSource, mDestination, intent, null, null);
            this.mSource = mSource;
            this.mDestination = mDestination;
            this.mTransform = m4791computeTransformYBCOT_4(this.mSource, this.mDestination, intent);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public float[] transform(float[] v) {
            v[0] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(v[0]);
            v[1] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(v[1]);
            v[2] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(v[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, v);
            v[0] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(v[0]);
            v[1] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(v[1]);
            v[2] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(v[2]);
            return v;
        }

        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m4791computeTransformYBCOT_4(Rgb source, Rgb destination, int intent) {
            if (ColorSpaceKt.compare(source.getWhitePoint(), destination.getWhitePoint()) == true) goto L5;
            float[] transform = source.getTransform$ui_graphics_release();
            float[] inverseTransform = destination.getInverseTransform$ui_graphics_release();
            float[] srcXYZ = source.getWhitePoint().toXyz$ui_graphics_release();
            float[] dstXYZ = destination.getWhitePoint().toXyz$ui_graphics_release();
            if (ColorSpaceKt.compare(source.getWhitePoint(), Illuminant.INSTANCE.getD50()) == true) goto L10;
            float[] srcAdaptation = ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), srcXYZ, Illuminant.INSTANCE.newD50Xyz$ui_graphics_release());
            transform = ColorSpaceKt.mul3x3(srcAdaptation, source.getTransform$ui_graphics_release());
        L10:
            if (ColorSpaceKt.compare(destination.getWhitePoint(), Illuminant.INSTANCE.getD50()) == true) goto L13;
            float[] dstAdaptation = ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), dstXYZ, Illuminant.INSTANCE.newD50Xyz$ui_graphics_release());
            inverseTransform = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(dstAdaptation, destination.getTransform$ui_graphics_release()));
        L13:
            if (RenderIntent.m4796equalsimpl0(intent, RenderIntent.Companion.m4800getAbsoluteuksYyKA()) == false) goto L16;
            transform = ColorSpaceKt.mul3x3Diag(new float[]{srcXYZ[0] / dstXYZ[0], srcXYZ[1] / dstXYZ[1], srcXYZ[2] / dstXYZ[2]}, transform);
        L16:
            return ColorSpaceKt.mul3x3(inverseTransform, transform);
        L5:
            return ColorSpaceKt.mul3x3(destination.getInverseTransform$ui_graphics_release(), source.getTransform$ui_graphics_release());
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release */
        public long mo4788transformToColorl2rxGTc$ui_graphics_release(long color) {
            float r = Color.m4372getRedimpl(color);
            float g = Color.m4371getGreenimpl(color);
            float b = Color.m4369getBlueimpl(color);
            float a = Color.m4368getAlphaimpl(color);
            float v0 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(r);
            float v1 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(g);
            float v2 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(b);
            float[] lhs$iv = this.mTransform;
            float v01 = ((lhs$iv[0] * v0) + (lhs$iv[3] * v1)) + (lhs$iv[6] * v2);
            float[] lhs$iv2 = this.mTransform;
            float v11 = ((lhs$iv2[1] * v0) + (lhs$iv2[4] * v1)) + (lhs$iv2[7] * v2);
            float[] lhs$iv3 = this.mTransform;
            float v21 = ((lhs$iv3[2] * v0) + (lhs$iv3[5] * v1)) + (lhs$iv3[8] * v2);
            float v02 = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(v01);
            float v12 = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(v11);
            float v22 = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(v21);
            return ColorKt.Color(v02, v12, v22, a, this.mDestination);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ Connector(ColorSpace r1, ColorSpace r2, int r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    public /* synthetic */ Connector(ColorSpace r1, ColorSpace r2, ColorSpace r3, ColorSpace r4, int r5, float[] r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    private Connector(ColorSpace source, ColorSpace destination, ColorSpace transformSource, ColorSpace transformDestination, int renderIntent, float[] transform) {
        this.source = source;
        this.destination = destination;
        this.transformSource = transformSource;
        this.transformDestination = transformDestination;
        this.renderIntent = renderIntent;
        this.transform = transform;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m4787getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    private Connector(ColorSpace source, ColorSpace destination, int intent) {
        if (ColorModel.m4773equalsimpl0(source.m4782getModelxdoWZVw(), ColorModel.Companion.m4780getRgbxdoWZVw()) == false) goto L5;
        ColorSpace r6 = ColorSpaceKt.adapt$default(source, Illuminant.INSTANCE.getD50(), null, 2, null);
    L7:
        if (ColorModel.m4773equalsimpl0(destination.m4782getModelxdoWZVw(), ColorModel.Companion.m4780getRgbxdoWZVw()) == false) goto L9;
        ColorSpace r7 = ColorSpaceKt.adapt$default(destination, Illuminant.INSTANCE.getD50(), null, 2, null);
    L10:
        this(source, destination, r6, r7, intent, Companion.m4789access$computeTransformYBCOT_4(Companion, source, destination, intent), null);
        return;
    L9:
        r7 = destination;
        goto L10
    L5:
        r6 = source;
        goto L7
    }

    public final float[] transform(float r, float g, float b) {
        return transform(new float[]{r, g, b});
    }

    public float[] transform(float[] v) {
        float[] xyz = this.transformSource.toXyz(v);
        if (this.transform == null) goto L6;
        xyz[0] = xyz[0] * this.transform[0];
        xyz[1] = xyz[1] * this.transform[1];
        xyz[2] = xyz[2] * this.transform[2];
    L6:
        return this.transformDestination.fromXyz(xyz);
    }

    /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release, reason: not valid java name */
    public long mo4788transformToColorl2rxGTc$ui_graphics_release(long color) {
        float r = Color.m4372getRedimpl(color);
        float g = Color.m4371getGreenimpl(color);
        float b = Color.m4369getBlueimpl(color);
        float r3 = Color.m4368getAlphaimpl(color);
        long packed = this.transformSource.toXy$ui_graphics_release(r, g, b);
        int bits$iv$iv = (int) (packed >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv);
        int bits$iv$iv2 = (int) (4294967295L & packed);
        float y = Float.intBitsToFloat(bits$iv$iv2);
        float z = this.transformSource.toZ$ui_graphics_release(r, g, b);
        if (this.transform == null) goto L5;
        float x2 = x * this.transform[0];
        float y2 = y * this.transform[1];
        float z2 = z * this.transform[2];
        float y3 = y2;
        float y4 = x2;
    L7:
        return this.transformDestination.mo4783xyzaToColorJlNiLsg$ui_graphics_release(y4, y3, z2, r3, this.destination);
    L5:
        z2 = z;
        y3 = y;
        y4 = x;
        goto L7
    }
}
