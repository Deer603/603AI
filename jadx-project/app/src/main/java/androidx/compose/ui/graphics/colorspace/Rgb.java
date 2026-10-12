package androidx.compose.ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Rgb.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ^2\u00020\u0001:\u0001^BC\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nB[\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011B#\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014B+\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015B/\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018B#\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001aB+\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001bB?\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u001cB\u001f\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001fB[\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020 \u0012\u0006\u0010\t\u001a\u00020 \u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\"J\u0013\u0010<\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010>H\u0096\u0002J \u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fH\u0007J\u0012\u0010?\u001a\u00020\u00052\b\b\u0001\u0010C\u001a\u00020\u0005H\u0007J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J\b\u0010E\u001a\u00020\u0005H\u0007J\u0012\u0010E\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020\u0005H\u0007J\u0010\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\u0010\u0010H\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0017H\u0016J\b\u0010I\u001a\u00020\u0005H\u0007J\u0012\u0010I\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010J\u001a\u00020\u0005H\u0007J\u0012\u0010J\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u0005H\u0007J\b\u0010K\u001a\u00020\u0017H\u0016J \u0010L\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fH\u0007J\u0012\u0010L\u001a\u00020\u00052\b\b\u0001\u0010C\u001a\u00020\u0005H\u0007J%\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bRJ\u0010\u0010S\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J%\u0010T\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000fH\u0010¢\u0006\u0002\bUJ=\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010]R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010/R\u0014\u00100\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0014\u00102\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0014\u00104\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0014\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0013\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\u001e\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "toXYZ", "", "oetf", "Lkotlin/Function1;", "", "eotf", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "primaries", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "", "max", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "id", "", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "transform", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "transferParameters", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "getEotf", "()Lkotlin/jvm/functions/Function1;", "eotfFunc", "getEotfFunc$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "eotfOrig", "getEotfOrig$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "()[F", "isSrgb", "", "()Z", "isWideGamut", "getOetf", "oetfFunc", "getOetfFunc$ui_graphics_release", "oetfOrig", "getOetfOrig$ui_graphics_release", "getPrimaries$ui_graphics_release", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransform$ui_graphics_release", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "equals", "other", "", "fromLinear", "r", "g", "b", "v", "fromXyz", "getInverseTransform", "getMaxValue", "component", "getMinValue", "getPrimaries", "getTransform", "hashCode", "toLinear", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Rgb extends ColorSpace {
    public static final Companion Companion = null;
    private static final DoubleFunction DoubleIdentity = null;
    private final Function1<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final Function1<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    /* JADX INFO: compiled from: Rgb.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J)\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0082\bJ\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0002J@\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0002J \u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0010\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "area", "", "primaries", "", "compare", "", "point", "", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "generateEotf", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "generateOetf", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ WhitePoint access$computeWhitePoint(Companion $this, float[] toXYZ) {
            return $this.computeWhitePoint(toXYZ);
        }

        public static final /* synthetic */ float[] access$computeXYZMatrix(Companion $this, float[] primaries, WhitePoint whitePoint) {
            return $this.computeXYZMatrix(primaries, whitePoint);
        }

        public static final /* synthetic */ DoubleFunction access$generateEotf(Companion $this, TransferParameters function) {
            return $this.generateEotf(function);
        }

        public static final /* synthetic */ DoubleFunction access$generateOetf(Companion $this, TransferParameters function) {
            return $this.generateOetf(function);
        }

        public static final /* synthetic */ boolean access$isSrgb(Companion $this, float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id) {
            return $this.isSrgb(primaries, whitePoint, OETF, EOTF, min, max, id);
        }

        public static final /* synthetic */ boolean access$isWideGamut(Companion $this, float[] primaries, float min, float max) {
            return $this.isWideGamut(primaries, min, max);
        }

        public static final /* synthetic */ float[] access$xyPrimaries(Companion $this, float[] primaries) {
            return $this.xyPrimaries(primaries);
        }

        private final boolean isSrgb(float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id) {
            if (id != 0) goto L6;
            return true;
        L6:
            if (ColorSpaceKt.compare(primaries, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release()) == true) goto L9;
            return false;
        L9:
            if (ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) == true) goto L12;
            return false;
        L12:
            if (min != 0.0f) goto L14;
            boolean r1 = true;
        L15:
            if (r1 == true) goto L18;
            return false;
        L18:
            if (max != 1.0f) goto L20;
            boolean r2 = true;
        L21:
            if (r2 == true) goto L23;
            return false;
        L23:
            Rgb srgb = ColorSpaces.INSTANCE.getSrgb();
            double x = 0.0d;
        L25:
            if (x > 1.0d) goto L33;
            if (compare(x, OETF, srgb.getOetfOrig$ui_graphics_release()) == false) goto L28;
            if (compare(x, EOTF, srgb.getEotfOrig$ui_graphics_release()) == false) goto L31;
            x = x + 0.00392156862745098d;
            goto L25
        L31:
            return false;
        L28:
            return false;
        L33:
            return true;
        L20:
            r2 = false;
            goto L21
        L14:
            r1 = false;
            goto L15
        }

        private final boolean compare(double point, DoubleFunction a, DoubleFunction b) {
            double rA = a.invoke(point);
            double rB = b.invoke(point);
            if (Math.abs(rA - rB) > 0.001d) goto L5;
            return true;
        L5:
            return false;
        }

        private final boolean isWideGamut(float[] primaries, float min, float max) {
            if ((area(primaries) / area(ColorSpaces.INSTANCE.getNtsc1953Primaries$ui_graphics_release())) <= 0.9f) goto L7;
            if (contains(primaries, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release()) == false) goto L7;
        L10:
            return true;
        L7:
            if (min < 0.0f) goto L9;
        L11:
            return false;
        L9:
            if (max <= 1.0f) goto L11;
            goto L10
        }

        private final float area(float[] primaries) {
            if (primaries.length >= 6) goto L5;
            return 0.0f;
        L5:
            float rx = primaries[0];
            float ry = primaries[1];
            float gx = primaries[2];
            float gy = primaries[3];
            float bx = primaries[4];
            float by = primaries[5];
            float det = (((((rx * gy) + (ry * bx)) + (gx * by)) - (gy * bx)) - (ry * gx)) - (rx * by);
            float r = 0.5f * det;
            if (r >= 0.0f) goto L9;
            return -r;
        L9:
            return r;
        }

        private final float cross(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        private final boolean contains(float[] p1, float[] p2) {
            float[] p0 = {p1[0] - p2[0], p1[1] - p2[1], p1[2] - p2[2], p1[3] - p2[3], p1[4] - p2[4], p1[5] - p2[5]};
            float ax$iv = p0[0];
            float ay$iv = p0[1];
            float bx$iv = p2[0] - p2[4];
            float by$iv = p2[1] - p2[5];
            if (((ax$iv * by$iv) - (ay$iv * bx$iv)) < 0.0f) goto L20;
            float ax$iv2 = p2[0] - p2[2];
            float ay$iv2 = p2[1] - p2[3];
            float bx$iv2 = p0[0];
            float by$iv2 = p0[1];
            if (((ax$iv2 * by$iv2) - (ay$iv2 * bx$iv2)) < 0.0f) goto L20;
            float ax$iv3 = p0[2];
            float ay$iv3 = p0[3];
            float bx$iv3 = p2[2] - p2[0];
            float by$iv3 = p2[3] - p2[1];
            if (((ax$iv3 * by$iv3) - (ay$iv3 * bx$iv3)) < 0.0f) goto L19;
            float ax$iv4 = p2[2] - p2[4];
            float ay$iv4 = p2[3] - p2[5];
            float bx$iv4 = p0[2];
            float by$iv4 = p0[3];
            if (((ax$iv4 * by$iv4) - (ay$iv4 * bx$iv4)) < 0.0f) goto L19;
            float ax$iv5 = p0[4];
            float ay$iv5 = p0[5];
            float bx$iv5 = p2[4] - p2[2];
            float by$iv5 = p2[5] - p2[3];
            if (((ax$iv5 * by$iv5) - (ay$iv5 * bx$iv5)) < 0.0f) goto L21;
            float ax$iv6 = p2[4] - p2[0];
            float ay$iv6 = p2[5] - p2[1];
            float bx$iv6 = p0[4];
            float by$iv6 = p0[5];
            if (((ax$iv6 * by$iv6) - (ay$iv6 * bx$iv6)) >= 0.0f) goto L18;
            return false;
        L18:
            return true;
        L21:
            return false;
        L19:
            return false;
        L20:
            return false;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] toXYZ) {
            float[] r = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] g = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] b = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float rSum = (r[0] + r[1]) + r[2];
            float gSum = (g[0] + g[1]) + g[2];
            float bSum = (b[0] + b[1]) + b[2];
            return new float[]{r[0] / rSum, r[1] / rSum, g[0] / gSum, g[1] / gSum, b[0] / bSum, b[1] / bSum};
        }

        private final WhitePoint computeWhitePoint(float[] toXYZ) {
            float[] w = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float sum = (w[0] + w[1]) + w[2];
            return new WhitePoint(w[0] / sum, w[1] / sum);
        }

        private final float[] xyPrimaries(float[] primaries) {
            float[] xyPrimaries = new float[6];
            if (primaries.length != 9) goto L5;
            float sum = (primaries[0] + primaries[1]) + primaries[2];
            xyPrimaries[0] = primaries[0] / sum;
            xyPrimaries[1] = primaries[1] / sum;
            float sum2 = (primaries[3] + primaries[4]) + primaries[5];
            xyPrimaries[2] = primaries[3] / sum2;
            xyPrimaries[3] = primaries[4] / sum2;
            float sum3 = (primaries[6] + primaries[7]) + primaries[8];
            xyPrimaries[4] = primaries[6] / sum3;
            xyPrimaries[5] = primaries[7] / sum3;
        L6:
            return xyPrimaries;
        L5:
            ArraysKt.copyInto$default(primaries, xyPrimaries, 0, 0, 6, 6, null);
            goto L6
        }

        private final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float rx = primaries[0];
            float ry = primaries[1];
            float gx = primaries[2];
            float gy = primaries[3];
            float bx = primaries[4];
            float by = primaries[5];
            float wx = whitePoint.getX();
            float wy = whitePoint.getY();
            float oneRxRy = (1.0f - rx) / ry;
            float oneGxGy = (1.0f - gx) / gy;
            float oneBxBy = (1.0f - bx) / by;
            float oneWxWy = (1.0f - wx) / wy;
            float rxRy = rx / ry;
            float gxGy = gx / gy;
            float bxBy = bx / by;
            float wxWy = wx / wy;
            float byNumerator = ((oneWxWy - oneRxRy) * (gxGy - rxRy)) - ((wxWy - rxRy) * (oneGxGy - oneRxRy));
            float byDenominator = ((oneBxBy - oneRxRy) * (gxGy - rxRy)) - ((bxBy - rxRy) * (oneGxGy - oneRxRy));
            float bY = byNumerator / byDenominator;
            float gY = ((wxWy - rxRy) - ((bxBy - rxRy) * bY)) / (gxGy - rxRy);
            float rY = (1.0f - gY) - bY;
            float rYRy = rY / ry;
            float gYGy = gY / gy;
            float bYBy = bY / by;
            return new float[]{rYRy * rx, rY, ((1.0f - rx) - ry) * rYRy, gYGy * gx, gY, ((1.0f - gx) - gy) * gYGy, bYBy * bx, bY, ((1.0f - bx) - by) * bYBy};
        }

        private final DoubleFunction generateOetf(final TransferParameters function) {
            if (function.isHLGish$ui_graphics_release() == false) goto L6;
            return new Rgb$Companion$$ExternalSyntheticLambda4(function);
        L6:
            if (function.isPQish$ui_graphics_release() == true) goto L22;
            boolean r1 = true;
            if (function.getE() != 0.0d) goto L11;
            boolean r0 = true;
        L12:
            if (r0 == false) goto L20;
            if (function.getF() == 0.0d) goto L17;
            r1 = false;
        L17:
            if (r1 == false) goto L20;
            return new Rgb$Companion$$ExternalSyntheticLambda6(function);
        L20:
            return new Rgb$Companion$$ExternalSyntheticLambda7(function);
        L11:
            r0 = false;
            goto L12
        L22:
            return new Rgb$Companion$$ExternalSyntheticLambda5(function);
        }

        static final double generateOetf$lambda$0(TransferParameters $function, double x) {
            return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics_release($function, x);
        }

        static final double generateOetf$lambda$1(TransferParameters $function, double x) {
            return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics_release($function, x);
        }

        static final double generateOetf$lambda$2(TransferParameters $function, double x) {
            return ColorSpaceKt.rcpResponse(x, $function.getA(), $function.getB(), $function.getC(), $function.getD(), $function.getGamma());
        }

        static final double generateOetf$lambda$3(TransferParameters $function, double x) {
            return ColorSpaceKt.rcpResponse(x, $function.getA(), $function.getB(), $function.getC(), $function.getD(), $function.getE(), $function.getF(), $function.getGamma());
        }

        private final DoubleFunction generateEotf(final TransferParameters function) {
            if (function.isHLGish$ui_graphics_release() == false) goto L6;
            return new Rgb$Companion$$ExternalSyntheticLambda0(function);
        L6:
            if (function.isPQish$ui_graphics_release() == true) goto L22;
            boolean r1 = true;
            if (function.getE() != 0.0d) goto L11;
            boolean r0 = true;
        L12:
            if (r0 == false) goto L20;
            if (function.getF() == 0.0d) goto L17;
            r1 = false;
        L17:
            if (r1 == false) goto L20;
            return new Rgb$Companion$$ExternalSyntheticLambda2(function);
        L20:
            return new Rgb$Companion$$ExternalSyntheticLambda3(function);
        L11:
            r0 = false;
            goto L12
        L22:
            return new Rgb$Companion$$ExternalSyntheticLambda1(function);
        }

        static final double generateEotf$lambda$4(TransferParameters $function, double x) {
            return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics_release($function, x);
        }

        static final double generateEotf$lambda$5(TransferParameters $function, double x) {
            return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics_release($function, x);
        }

        static final double generateEotf$lambda$6(TransferParameters $function, double x) {
            return ColorSpaceKt.response(x, $function.getA(), $function.getB(), $function.getC(), $function.getD(), $function.getGamma());
        }

        static final double generateEotf$lambda$7(TransferParameters $function, double x) {
            return ColorSpaceKt.response(x, $function.getA(), $function.getB(), $function.getC(), $function.getD(), $function.getE(), $function.getF(), $function.getGamma());
        }
    }

    public static final /* synthetic */ float access$getMax$p(Rgb $this) {
        return $this.max;
    }

    public static final /* synthetic */ float access$getMin$p(Rgb $this) {
        return $this.min;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public Rgb(String name, float[] primaries, WhitePoint whitePoint, float[] transform, DoubleFunction oetf, DoubleFunction eotf, float min, float max, TransferParameters transferParameters, int id) {
        super(name, ColorModel.Companion.m4780getRgbxdoWZVw(), id, null);
        this.whitePoint = whitePoint;
        this.min = min;
        this.max = max;
        this.transferParameters = transferParameters;
        this.oetfOrig = oetf;
        this.oetf = new Rgb$oetf$1(this);
        this.oetfFunc = new Rgb$$ExternalSyntheticLambda0(this);
        this.eotfOrig = eotf;
        this.eotf = new Rgb$eotf$1(this);
        this.eotfFunc = new Rgb$$ExternalSyntheticLambda1(this);
        if (primaries.length == 6) goto L10;
        if (primaries.length == 9) goto L10;
        throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
    L10:
        if (this.min >= this.max) goto L22;
        this.primaries = Companion.access$xyPrimaries(Companion, primaries);
        if (transform != null) goto L15;
        this.transform = Companion.access$computeXYZMatrix(Companion, this.primaries, this.whitePoint);
    L17:
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = Companion.access$isWideGamut(Companion, this.primaries, this.min, this.max);
        this.isSrgb = Companion.access$isSrgb(Companion, this.primaries, this.whitePoint, oetf, eotf, this.min, this.max, id);
        return;
    L15:
        if (transform.length != 9) goto L20;
        this.transform = transform;
        goto L17
    L20:
        throw new IllegalArgumentException("Transform must have 9 entries! Has " + transform.length);
    L22:
        throw new IllegalArgumentException("Invalid range: min=" + this.min + ", max=" + this.max + "; min must be strictly < max");
    }

    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.oetfFunc;
    }

    static final double oetfFunc$lambda$0(Rgb this$0, double x) {
        return RangesKt.coerceIn(this$0.oetfOrig.invoke(x), this$0.min, this$0.max);
    }

    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.eotfFunc;
    }

    static final double eotfFunc$lambda$1(Rgb this$0, double x) {
        return this$0.eotfOrig.invoke(RangesKt.coerceIn(x, this$0.min, this$0.max));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    public final float[] getPrimaries() {
        float[] r0 = this.primaries;
        float[] r1 = Arrays.copyOf(r0, r0.length);
        Intrinsics.checkNotNullExpressionValue(r1, "copyOf(...)");
        return r1;
    }

    public final float[] getTransform() {
        float[] r0 = this.transform;
        float[] r1 = Arrays.copyOf(r0, r0.length);
        Intrinsics.checkNotNullExpressionValue(r1, "copyOf(...)");
        return r1;
    }

    public final float[] getInverseTransform() {
        float[] r0 = this.inverseTransform;
        float[] r1 = Arrays.copyOf(r0, r0.length);
        Intrinsics.checkNotNullExpressionValue(r1, "copyOf(...)");
        return r1;
    }

    public Rgb(String name, float[] toXYZ, final Function1<? super Double, Double> r17, final Function1<? super Double, Double> r18) {
        this(name, Companion.computePrimaries$ui_graphics_release(toXYZ), Companion.access$computeWhitePoint(Companion, toXYZ), null, new Rgb$$ExternalSyntheticLambda3(r17), new Rgb$$ExternalSyntheticLambda4(r18), 0.0f, 1.0f, null, -1);
    }

    static final double _init_$lambda$2(Function1 $oetf, double x) {
        return ((Number) $oetf.invoke(Double.valueOf(x))).doubleValue();
    }

    static final double _init_$lambda$3(Function1 $eotf, double x) {
        return ((Number) $eotf.invoke(Double.valueOf(x))).doubleValue();
    }

    public Rgb(String name, float[] primaries, WhitePoint whitePoint, final Function1<? super Double, Double> r17, final Function1<? super Double, Double> r18, float min, float max) {
        this(name, primaries, whitePoint, null, new Rgb$$ExternalSyntheticLambda7(r17), new Rgb$$ExternalSyntheticLambda8(r18), min, max, null, -1);
    }

    static final double _init_$lambda$4(Function1 $oetf, double x) {
        return ((Number) $oetf.invoke(Double.valueOf(x))).doubleValue();
    }

    static final double _init_$lambda$5(Function1 $eotf, double x) {
        return ((Number) $eotf.invoke(Double.valueOf(x))).doubleValue();
    }

    public Rgb(String name, float[] toXYZ, TransferParameters function) {
        this(name, Companion.computePrimaries$ui_graphics_release(toXYZ), Companion.access$computeWhitePoint(Companion, toXYZ), function, -1);
    }

    public Rgb(String name, float[] primaries, WhitePoint whitePoint, TransferParameters function) {
        this(name, primaries, whitePoint, function, -1);
    }

    public Rgb(String name, float[] primaries, WhitePoint whitePoint, TransferParameters function, int id) {
        this(name, primaries, whitePoint, null, Companion.access$generateOetf(Companion, function), Companion.access$generateEotf(Companion, function), 0.0f, 1.0f, function, id);
    }

    public Rgb(String name, float[] toXYZ, double gamma) {
        this(name, Companion.computePrimaries$ui_graphics_release(toXYZ), Companion.access$computeWhitePoint(Companion, toXYZ), gamma, 0.0f, 1.0f, -1);
    }

    public Rgb(String name, float[] primaries, WhitePoint whitePoint, double gamma) {
        this(name, primaries, whitePoint, gamma, 0.0f, 1.0f, -1);
    }

    public Rgb(String name, float[] primaries, WhitePoint whitePoint, final double gamma, float min, float max, int id) {
        boolean r5 = true;
        if (gamma != 1.0d) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        DoubleFunction r17 = DoubleIdentity;
    L10:
        if (gamma == 1.0d) goto L13;
        r5 = false;
    L13:
        if (r5 == false) goto L15;
        DoubleFunction r18 = DoubleIdentity;
    L16:
        this(name, primaries, whitePoint, null, r17, r18, min, max, new TransferParameters(gamma, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), id);
        return;
    L15:
        r18 = new Rgb$$ExternalSyntheticLambda6(gamma);
        goto L16
    L8:
        r17 = new Rgb$$ExternalSyntheticLambda5(gamma);
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    static final double _init_$lambda$6(double $gamma, double x) {
        double r0 = 0.0d;
        if (x < 0.0d) goto L7;
        r0 = x;
    L7:
        return Math.pow(r0, 1.0d / $gamma);
    }

    static final double _init_$lambda$7(double $gamma, double x) {
        double r0 = 0.0d;
        if (x < 0.0d) goto L7;
        r0 = x;
    L7:
        return Math.pow(r0, $gamma);
    }

    public Rgb(Rgb colorSpace, float[] transform, WhitePoint whitePoint) {
        this(colorSpace.getName(), colorSpace.primaries, whitePoint, transform, colorSpace.oetfOrig, colorSpace.eotfOrig, colorSpace.min, colorSpace.max, colorSpace.transferParameters, -1);
    }

    public final float[] getPrimaries(float[] primaries) {
        return ArraysKt.copyInto$default(this.primaries, primaries, 0, 0, 0, 14, null);
    }

    public final float[] getTransform(float[] transform) {
        return ArraysKt.copyInto$default(this.transform, transform, 0, 0, 0, 14, null);
    }

    public final float[] getInverseTransform(float[] inverseTransform) {
        return ArraysKt.copyInto$default(this.inverseTransform, inverseTransform, 0, 0, 0, 14, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.min;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    public final float[] toLinear(float r, float g, float b) {
        return toLinear(new float[]{r, g, b});
    }

    public final float[] toLinear(float[] v) {
        if (v.length >= 3) goto L5;
        return v;
    L5:
        v[0] = (float) this.eotfFunc.invoke(v[0]);
        v[1] = (float) this.eotfFunc.invoke(v[1]);
        v[2] = (float) this.eotfFunc.invoke(v[2]);
        return v;
    }

    public final float[] fromLinear(float r, float g, float b) {
        return fromLinear(new float[]{r, g, b});
    }

    public final float[] fromLinear(float[] v) {
        if (v.length >= 3) goto L5;
        return v;
    L5:
        v[0] = (float) this.oetfFunc.invoke(v[0]);
        v[1] = (float) this.oetfFunc.invoke(v[1]);
        v[2] = (float) this.oetfFunc.invoke(v[2]);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v) {
        if (v.length >= 3) goto L5;
        return v;
    L5:
        v[0] = (float) this.eotfFunc.invoke(v[0]);
        v[1] = (float) this.eotfFunc.invoke(v[1]);
        v[2] = (float) this.eotfFunc.invoke(v[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, v);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        float v00 = (float) this.eotfFunc.invoke(v0);
        float v10 = (float) this.eotfFunc.invoke(v1);
        float v20 = (float) this.eotfFunc.invoke(v2);
        if (this.transform.length >= 9) goto L6;
        return 0;
    L6:
        float[] lhs$iv = this.transform;
        float x = ((lhs$iv[0] * v00) + (lhs$iv[3] * v10)) + (lhs$iv[6] * v20);
        float[] lhs$iv2 = this.transform;
        float y = ((lhs$iv2[1] * v00) + (lhs$iv2[4] * v10)) + (lhs$iv2[7] * v20);
        long v1$iv = Float.floatToRawIntBits(x);
        long v2$iv = Float.floatToRawIntBits(y);
        return (v1$iv << 32) | (v2$iv & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        float v00 = (float) this.eotfFunc.invoke(v0);
        float v10 = (float) this.eotfFunc.invoke(v1);
        float v20 = (float) this.eotfFunc.invoke(v2);
        float[] lhs$iv = this.transform;
        float z = ((lhs$iv[2] * v00) + (lhs$iv[5] * v10)) + (lhs$iv[8] * v20);
        return z;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4783xyzaToColorJlNiLsg$ui_graphics_release(float x, float y, float z, float a, ColorSpace colorSpace) {
        float[] lhs$iv = this.inverseTransform;
        float v0 = ((lhs$iv[0] * x) + (lhs$iv[3] * y)) + (lhs$iv[6] * z);
        float[] lhs$iv2 = this.inverseTransform;
        float v1 = ((lhs$iv2[1] * x) + (lhs$iv2[4] * y)) + (lhs$iv2[7] * z);
        float[] lhs$iv3 = this.inverseTransform;
        float v2 = ((lhs$iv3[2] * x) + (lhs$iv3[5] * y)) + (lhs$iv3[8] * z);
        return ColorKt.Color((float) this.oetfFunc.invoke(v0), (float) this.oetfFunc.invoke(v1), (float) this.oetfFunc.invoke(v2), a, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, v);
        if (v.length >= 3) goto L5;
        return v;
    L5:
        v[0] = (float) this.oetfFunc.invoke(v[0]);
        v[1] = (float) this.oetfFunc.invoke(v[1]);
        v[2] = (float) this.oetfFunc.invoke(v[2]);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L37:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L37;
        if (super.equals(other) == true) goto L13;
        return false;
    L13:
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) == 0) goto L17;
        return false;
    L17:
        if (Float.compare(rgb.max, this.max) == 0) goto L20;
        return false;
    L20:
        if (Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) == true) goto L23;
        return false;
    L23:
        if (Arrays.equals(this.primaries, rgb.primaries) == true) goto L26;
        return false;
    L26:
        if (this.transferParameters == null) goto L30;
        return Intrinsics.areEqual(this.transferParameters, rgb.transferParameters);
    L30:
        if (rgb.transferParameters != null) goto L33;
        return true;
    L33:
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig) == true) goto L36;
        return false;
    L36:
        return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int result = super.hashCode();
        int result2 = ((((result * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        boolean r4 = true;
        int r5 = 0;
        if (this.min != 0.0f) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L8;
        int r3 = Float.floatToIntBits(this.min);
    L9:
        int result3 = (result2 + r3) * 31;
        if (this.max == 0.0f) goto L13;
        r4 = false;
    L13:
        if (r4 == true) goto L15;
        int r6 = Float.floatToIntBits(this.max);
    L16:
        int result4 = (result3 + r6) * 31;
        TransferParameters r7 = this.transferParameters;
        if (r7 == null) goto L19;
        r5 = r7.hashCode();
    L19:
        int result5 = result4 + r5;
        if (this.transferParameters == null) goto L22;
        return result5;
    L22:
        return (((result5 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
    L15:
        r6 = 0;
        goto L16
    L8:
        r3 = 0;
        goto L9
    L5:
        r2 = false;
        goto L6
    }

    static {
        Companion = new Companion(null);
        DoubleIdentity = new Rgb$$ExternalSyntheticLambda2();
    }

    static final double DoubleIdentity$lambda$8(double d) {
        return d;
    }
}
