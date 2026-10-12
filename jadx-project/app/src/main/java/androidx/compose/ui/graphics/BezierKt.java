package androidx.compose.ui.graphics;

import androidx.collection.FloatFloatPair;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: Bezier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0082\b\u001a?\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001e\u001a'\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\u0010\u001e\u001aH\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0000\u001a \u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0018H\u0002\u001a0\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0018H\u0000\u001a \u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0007\u001a0\u00103\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u001a \u00109\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u001a(\u0010:\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u001a\u0018\u0010;\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0003H\u0002\u001a\u0018\u0010<\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0003H\u0007\u001a\u0018\u0010=\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u0018H\u0002\u001a(\u0010?\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u001a(\u0010B\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H\u0007\u001a\u0019\u0010C\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003H\u0082\b\u001a \u0010D\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003H\u0002\u001a\u0018\u0010E\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0003H\u0007\u001a+\u0010G\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0082\b\u001a2\u0010H\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002\u001a \u0010I\u001a\u00020A2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002\u001a \u0010J\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0000\u001a(\u0010K\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0002\u001a0\u0010M\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0018H\u0002\u001a\u0018\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0002\u001a0\u0010P\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0018H\u0000\u001a0\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010U\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010V\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u0003H\u0002\u001a \u0010W\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0003H\u0002\u001a\u0018\u0010X\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0002\u001a \u0010Y\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u001a\u0015\u0010Z\u001a\u00020A*\u00020\u00012\u0006\u0010[\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010Z\u001a\u00020A*\u00020\u00032\u0006\u0010[\u001a\u00020\u0003H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0005\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\"\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b\"\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\\"}, d2 = {"Epsilon", "", "FloatEpsilon", "", "Tau", "endX", "Landroidx/compose/ui/graphics/PathSegment;", "getEndX", "(Landroidx/compose/ui/graphics/PathSegment;)F", "endY", "getEndY", "startX", "getStartX", "startY", "getStartY", "clampValidRootInUnitRange", "r", "computeCubicVerticalBounds", "Landroidx/collection/FloatFloatPair;", "p0y", "p1y", "p2y", "p3y", "roots", "", "index", "", "(FFFF[FI)J", "computeHorizontalBounds", "segment", "(Landroidx/compose/ui/graphics/PathSegment;[FI)J", "computeVerticalBounds", "cubicArea", "x0", "y0", "x1", "y1", "x2", "y2", "x3", "y3", "cubicToMonotonicCubics", "cubic", "dst", "tmpRoot", "cubicWinding", "points", "x", "y", "tmpCubics", "tmpRoots", "evaluateCubic", "p1", "p2", "t", "p0", "p3", "evaluateLine", "evaluateQuadratic", "evaluateX", "evaluateY", "findCubicExtremaY", "dstRoots", "findDerivativeRoots", "horizontal", "", "findFirstCubicRoot", "findFirstLineRoot", "findFirstQuadraticRoot", "findFirstRoot", "fraction", "findLineRoot", "findQuadraticRoots", "isQuadraticMonotonic", "lineWinding", "monotonicCubicWinding", "offset", "monotonicQuadraticWinding", "quadraticToMonotonicQuadratics", "quadratic", "quadraticWinding", "tmpQuadratics", "splitCubicAt", "", "src", "srcOffset", "dstOffset", "splitQuadraticAt", "unitDivide", "writeValidRootInUnitRange", "closeTo", "b", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BezierKt {
    private static final double Epsilon = 1.0E-7d;
    private static final float FloatEpsilon = 1.05E-6f;
    private static final double Tau = 6.283185307179586d;

    /* JADX INFO: compiled from: Bezier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[PathSegment.Type.values().length];
            r0[PathSegment.Type.Move.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L26:
            r0[PathSegment.Type.Line.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L32:
            r0[PathSegment.Type.Quadratic.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L36:
            r0[PathSegment.Type.Cubic.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L28:
            r0[PathSegment.Type.Conic.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L30:
            r0[PathSegment.Type.Close.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L38:
            r0[PathSegment.Type.Done.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L24:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ int access$writeValidRootInUnitRange(float r, float[] roots, int index) {
        return writeValidRootInUnitRange(r, roots, index);
    }

    private static final float evaluateX(PathSegment segment, float t) {
        float[] points = segment.getPoints();
        PathSegment.Type r1 = segment.getType();
        switch(WhenMappings.$EnumSwitchMapping$0[r1.ordinal()]) {
            case 1: goto L9;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            default: goto L4;
        };
    L4:
        return Float.NaN;
    L11:
        return evaluateCubic(points[0], points[2], points[4], points[6], t);
    L12:
        return evaluateQuadratic(points[0], points[2], points[4], t);
    L13:
        return evaluateLine(points[0], points[2], t);
    L9:
        return points[0];
    }

    public static final float evaluateY(PathSegment segment, float t) {
        float[] points = segment.getPoints();
        PathSegment.Type r1 = segment.getType();
        switch(WhenMappings.$EnumSwitchMapping$0[r1.ordinal()]) {
            case 1: goto L9;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            default: goto L4;
        };
    L4:
        return Float.NaN;
    L11:
        return evaluateCubic(points[1], points[3], points[5], points[7], t);
    L12:
        return evaluateQuadratic(points[1], points[3], points[5], t);
    L13:
        return evaluateLine(points[1], points[3], t);
    L9:
        return points[1];
    }

    private static final float evaluateLine(float p0y, float p1y, float t) {
        return ((p1y - p0y) * t) + p0y;
    }

    private static final float evaluateQuadratic(float p0, float p1, float p2, float t) {
        float by = (p1 - p0) * 2.0f;
        float ay = (p2 - (2.0f * p1)) + p0;
        return (((ay * t) + by) * t) + p0;
    }

    private static final float evaluateCubic(float p0, float p1, float p2, float p3, float t) {
        float a = (((p1 - p2) * 3.0f) + p3) - p0;
        float b = ((p2 - (2.0f * p1)) + p0) * 3.0f;
        float c = (p1 - p0) * 3.0f;
        return (((((a * t) + b) * t) + c) * t) + p0;
    }

    public static final float evaluateCubic(float p1, float p2, float t) {
        float a = (p1 - p2) + 0.33333334f;
        float b = p2 - (2.0f * p1);
        return (((((a * t) + b) * t) + p1) * 3.0f) * t;
    }

    public static final float findFirstRoot(PathSegment segment, float fraction) {
        float[] points = segment.getPoints();
        switch(WhenMappings.$EnumSwitchMapping$0[segment.getType().ordinal()]) {
            case 1: goto L25;
            case 2: goto L11;
            case 3: goto L24;
            case 4: goto L23;
            case 5: goto L25;
            case 6: goto L25;
            case 7: goto L25;
            default: goto L5;
        };
    L11:
        float p0$iv = points[0] - fraction;
        float p1$iv = points[2] - fraction;
        float r$iv$iv = (-p0$iv) / (p1$iv - p0$iv);
        float $this$fastCoerceAtLeast$iv$iv$iv$iv = r$iv$iv;
        if ($this$fastCoerceAtLeast$iv$iv$iv$iv >= 0.0f) goto L15;
        $this$fastCoerceAtLeast$iv$iv$iv$iv = 0.0f;
    L15:
        if ($this$fastCoerceAtLeast$iv$iv$iv$iv <= 1.0f) goto L18;
        $this$fastCoerceAtLeast$iv$iv$iv$iv = 1.0f;
    L18:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv$iv - r$iv$iv) <= FloatEpsilon) goto L26;
        return Float.NaN;
    L26:
        return $this$fastCoerceAtLeast$iv$iv$iv$iv;
    L25:
        return Float.NaN;
    L5:
        throw new NoWhenBranchMatchedException();
    L23:
        return findFirstCubicRoot(points[0] - fraction, points[2] - fraction, points[4] - fraction, points[6] - fraction);
    L24:
        return findFirstQuadraticRoot(points[0] - fraction, points[2] - fraction, points[4] - fraction);
    }

    private static final float findFirstLineRoot(float p0, float p1) {
        float r$iv = (-p0) / (p1 - p0);
        float $this$fastCoerceAtLeast$iv$iv$iv = r$iv;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= 0.0f) goto L6;
        $this$fastCoerceAtLeast$iv$iv$iv = 0.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv$iv <= 1.0f) goto L9;
        $this$fastCoerceAtLeast$iv$iv$iv = 1.0f;
    L9:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv - r$iv) > FloatEpsilon) goto L11;
        return $this$fastCoerceAtLeast$iv$iv$iv;
    L11:
        return Float.NaN;
    }

    private static final float findFirstQuadraticRoot(float p0, float p1, float p2) {
        double a = p0;
        double b = p1;
        double c = p2;
        double d = (a - (b * 2.0d)) + c;
        boolean r14 = true;
        if (d != 0.0d) goto L5;
        boolean r13 = true;
    L7:
        if (r13 == true) goto L32;
        double v1 = -Math.sqrt((b * b) - (a * c));
        double v2 = (-a) + b;
        float r$iv = (float) ((-(v1 + v2)) / d);
        float $this$fastCoerceAtLeast$iv$iv$iv = r$iv;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= 0.0f) goto L12;
        $this$fastCoerceAtLeast$iv$iv$iv = 0.0f;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv$iv <= 1.0f) goto L15;
        $this$fastCoerceAtLeast$iv$iv$iv = 1.0f;
    L15:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv - r$iv) <= FloatEpsilon) goto L18;
        $this$fastCoerceAtLeast$iv$iv$iv = Float.NaN;
    L18:
        if (Float.isNaN($this$fastCoerceAtLeast$iv$iv$iv) == true) goto L20;
        return $this$fastCoerceAtLeast$iv$iv$iv;
    L20:
        float r$iv2 = (float) ((v1 - v2) / d);
        float $this$fastCoerceAtLeast$iv$iv$iv2 = r$iv2;
        if ($this$fastCoerceAtLeast$iv$iv$iv2 >= 0.0f) goto L24;
        $this$fastCoerceAtLeast$iv$iv$iv2 = 0.0f;
    L24:
        if ($this$fastCoerceAtLeast$iv$iv$iv2 <= 1.0f) goto L27;
        $this$fastCoerceAtLeast$iv$iv$iv2 = 1.0f;
    L27:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv2 - r$iv2) <= FloatEpsilon) goto L30;
        return Float.NaN;
    L30:
        return $this$fastCoerceAtLeast$iv$iv$iv2;
    L32:
        if (b == c) goto L35;
        r14 = false;
    L35:
        if (r14 == true) goto L47;
        float r$iv3 = (float) (((b * 2.0d) - c) / ((b * 2.0d) - (2.0d * c)));
        float $this$fastCoerceAtLeast$iv$iv$iv3 = r$iv3;
        if ($this$fastCoerceAtLeast$iv$iv$iv3 >= 0.0f) goto L40;
        $this$fastCoerceAtLeast$iv$iv$iv3 = 0.0f;
    L40:
        if ($this$fastCoerceAtLeast$iv$iv$iv3 <= 1.0f) goto L43;
        $this$fastCoerceAtLeast$iv$iv$iv3 = 1.0f;
    L43:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv3 - r$iv3) <= FloatEpsilon) goto L46;
        return Float.NaN;
    L46:
        return $this$fastCoerceAtLeast$iv$iv$iv3;
    L47:
        return Float.NaN;
    L5:
        r13 = false;
        goto L7
    }

    public static final float findFirstCubicRoot(float p0, float p1, float p2, float p3) {
        double a = ((((double) p0) - (((double) p1) * 2.0d)) + ((double) p2)) * 3.0d;
        double b = ((double) (p1 - p0)) * 3.0d;
        double c = p0;
        double d = (((double) (-p0)) + (((double) (p1 - p2)) * 3.0d)) + ((double) p3);
        boolean r22 = true;
        if (Math.abs(d - 0.0d) >= Epsilon) goto L5;
        boolean r6 = true;
    L7:
        if (r6 == true) goto L9;
        double a2 = a / d;
        double b2 = b / d;
        double o3 = ((b2 * 3.0d) - (a2 * a2)) / 9.0d;
        double q2 = (((((2.0d * a2) * a2) * a2) - ((9.0d * a2) * b2)) + (27.0d * (c / d))) / 54.0d;
        double discriminant = (q2 * q2) + ((o3 * o3) * o3);
        double a3 = a2 / 3.0d;
        if (discriminant >= 0.0d) goto L97;
        double mp33 = -((o3 * o3) * o3);
        double r = Math.sqrt(mp33);
        double t = (-q2) / r;
        double $this$fastCoerceAtLeast$iv$iv = t;
        if ($this$fastCoerceAtLeast$iv$iv >= (-1.0d)) goto L59;
        $this$fastCoerceAtLeast$iv$iv = -1.0d;
    L59:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0d) goto L61;
        $this$fastCoerceAtLeast$iv$iv = 1.0d;
    L61:
        double phi = Math.acos($this$fastCoerceAtLeast$iv$iv);
        float t1 = MathHelpersKt.fastCbrt((float) r) * 2.0f;
        float r$iv = (float) ((((double) t1) * Math.cos(phi / 3.0d)) - a3);
        float $this$fastCoerceAtLeast$iv$iv$iv = r$iv;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= 0.0f) goto L65;
        $this$fastCoerceAtLeast$iv$iv$iv = 0.0f;
    L65:
        if ($this$fastCoerceAtLeast$iv$iv$iv <= 1.0f) goto L68;
        $this$fastCoerceAtLeast$iv$iv$iv = 1.0f;
    L68:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv - r$iv) <= FloatEpsilon) goto L71;
        $this$fastCoerceAtLeast$iv$iv$iv = Float.NaN;
    L71:
        if (Float.isNaN($this$fastCoerceAtLeast$iv$iv$iv) == true) goto L73;
        return $this$fastCoerceAtLeast$iv$iv$iv;
    L73:
        float r$iv2 = (float) ((((double) t1) * Math.cos((phi + Tau) / 3.0d)) - a3);
        float $this$fastCoerceAtLeast$iv$iv$iv2 = r$iv2;
        if ($this$fastCoerceAtLeast$iv$iv$iv2 >= 0.0f) goto L77;
        $this$fastCoerceAtLeast$iv$iv$iv2 = 0.0f;
    L77:
        if ($this$fastCoerceAtLeast$iv$iv$iv2 <= 1.0f) goto L80;
        $this$fastCoerceAtLeast$iv$iv$iv2 = 1.0f;
    L80:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv2 - r$iv2) <= FloatEpsilon) goto L83;
        $this$fastCoerceAtLeast$iv$iv$iv2 = Float.NaN;
    L83:
        if (Float.isNaN($this$fastCoerceAtLeast$iv$iv$iv2) == true) goto L85;
        return $this$fastCoerceAtLeast$iv$iv$iv2;
    L85:
        float r$iv3 = (float) ((((double) t1) * Math.cos((phi + 12.566370614359172d) / 3.0d)) - a3);
        float $this$fastCoerceAtLeast$iv$iv$iv3 = r$iv3;
        if ($this$fastCoerceAtLeast$iv$iv$iv3 >= 0.0f) goto L89;
        $this$fastCoerceAtLeast$iv$iv$iv3 = 0.0f;
    L89:
        if ($this$fastCoerceAtLeast$iv$iv$iv3 <= 1.0f) goto L92;
        $this$fastCoerceAtLeast$iv$iv$iv3 = 1.0f;
    L92:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv3 - r$iv3) <= FloatEpsilon) goto L95;
        return Float.NaN;
    L95:
        return $this$fastCoerceAtLeast$iv$iv$iv3;
    L97:
        if (discriminant == 0.0d) goto L100;
        r22 = false;
    L100:
        if (r22 == false) goto L124;
        float u1 = -MathHelpersKt.fastCbrt((float) q2);
        float r$iv4 = (u1 * 2.0f) - ((float) a3);
        float $this$fastCoerceAtLeast$iv$iv$iv4 = r$iv4;
        if ($this$fastCoerceAtLeast$iv$iv$iv4 >= 0.0f) goto L105;
        $this$fastCoerceAtLeast$iv$iv$iv4 = 0.0f;
    L105:
        if ($this$fastCoerceAtLeast$iv$iv$iv4 <= 1.0f) goto L108;
        $this$fastCoerceAtLeast$iv$iv$iv4 = 1.0f;
    L108:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv4 - r$iv4) <= FloatEpsilon) goto L111;
        $this$fastCoerceAtLeast$iv$iv$iv4 = Float.NaN;
    L111:
        if (Float.isNaN($this$fastCoerceAtLeast$iv$iv$iv4) == true) goto L113;
        return $this$fastCoerceAtLeast$iv$iv$iv4;
    L113:
        float r$iv5 = (-u1) - ((float) a3);
        float $this$fastCoerceAtLeast$iv$iv$iv5 = r$iv5;
        if ($this$fastCoerceAtLeast$iv$iv$iv5 >= 0.0f) goto L117;
        $this$fastCoerceAtLeast$iv$iv$iv5 = 0.0f;
    L117:
        if ($this$fastCoerceAtLeast$iv$iv$iv5 <= 1.0f) goto L120;
        $this$fastCoerceAtLeast$iv$iv$iv5 = 1.0f;
    L120:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv5 - r$iv5) <= FloatEpsilon) goto L123;
        return Float.NaN;
    L123:
        return $this$fastCoerceAtLeast$iv$iv$iv5;
    L124:
        double sd = Math.sqrt(discriminant);
        float u2 = MathHelpersKt.fastCbrt((float) ((-q2) + sd));
        float v1 = MathHelpersKt.fastCbrt((float) (q2 + sd));
        float r$iv6 = (float) (((double) (u2 - v1)) - a3);
        float $this$fastCoerceAtLeast$iv$iv$iv6 = r$iv6;
        if ($this$fastCoerceAtLeast$iv$iv$iv6 >= 0.0f) goto L128;
        $this$fastCoerceAtLeast$iv$iv$iv6 = 0.0f;
    L128:
        if ($this$fastCoerceAtLeast$iv$iv$iv6 <= 1.0f) goto L131;
        $this$fastCoerceAtLeast$iv$iv$iv6 = 1.0f;
    L131:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv6 - r$iv6) <= FloatEpsilon) goto L134;
        return Float.NaN;
    L134:
        return $this$fastCoerceAtLeast$iv$iv$iv6;
    L9:
        if (Math.abs(a - 0.0d) >= Epsilon) goto L11;
        int $i$f$closeTo = 1;
    L12:
        if ($i$f$closeTo != 0) goto L14;
        double q = Math.sqrt((b * b) - ((4.0d * a) * c));
        double a4 = a * 2.0d;
        float r$iv7 = (float) ((q - b) / a4);
        float $this$fastCoerceAtLeast$iv$iv$iv7 = r$iv7;
        if ($this$fastCoerceAtLeast$iv$iv$iv7 >= 0.0f) goto L34;
        $this$fastCoerceAtLeast$iv$iv$iv7 = 0.0f;
    L34:
        if ($this$fastCoerceAtLeast$iv$iv$iv7 <= 1.0f) goto L37;
        $this$fastCoerceAtLeast$iv$iv$iv7 = 1.0f;
    L37:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv7 - r$iv7) <= FloatEpsilon) goto L40;
        $this$fastCoerceAtLeast$iv$iv$iv7 = Float.NaN;
    L40:
        if (Float.isNaN($this$fastCoerceAtLeast$iv$iv$iv7) == true) goto L42;
        return $this$fastCoerceAtLeast$iv$iv$iv7;
    L42:
        float r$iv8 = (float) (((-b) - q) / a4);
        float $this$fastCoerceAtLeast$iv$iv$iv8 = r$iv8;
        if ($this$fastCoerceAtLeast$iv$iv$iv8 >= 0.0f) goto L46;
        $this$fastCoerceAtLeast$iv$iv$iv8 = 0.0f;
    L46:
        if ($this$fastCoerceAtLeast$iv$iv$iv8 <= 1.0f) goto L49;
        $this$fastCoerceAtLeast$iv$iv$iv8 = 1.0f;
    L49:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv8 - r$iv8) <= FloatEpsilon) goto L52;
        return Float.NaN;
    L52:
        return $this$fastCoerceAtLeast$iv$iv$iv8;
    L14:
        if (Math.abs(b - 0.0d) < Epsilon) goto L17;
        r22 = false;
    L17:
        if (r22 == false) goto L19;
        return Float.NaN;
    L19:
        float r$iv9 = (float) ((-c) / b);
        float $this$fastCoerceAtLeast$iv$iv$iv9 = r$iv9;
        if ($this$fastCoerceAtLeast$iv$iv$iv9 >= 0.0f) goto L23;
        $this$fastCoerceAtLeast$iv$iv$iv9 = 0.0f;
    L23:
        if ($this$fastCoerceAtLeast$iv$iv$iv9 <= 1.0f) goto L26;
        $this$fastCoerceAtLeast$iv$iv$iv9 = 1.0f;
    L26:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv$iv9 - r$iv9) <= FloatEpsilon) goto L29;
        return Float.NaN;
    L29:
        return $this$fastCoerceAtLeast$iv$iv$iv9;
    L11:
        $i$f$closeTo = 0;
        goto L12
    L5:
        r6 = false;
        goto L7
    }

    static /* synthetic */ int findLineRoot$default(float p0, float p1, float[] roots, int index, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L6;
        index = 0;
    L6:
        return access$writeValidRootInUnitRange((-p0) / (p1 - p0), roots, index);
    }

    private static final int findLineRoot(float p0, float p1, float[] roots, int index) {
        return access$writeValidRootInUnitRange((-p0) / (p1 - p0), roots, index);
    }

    static /* synthetic */ int findQuadraticRoots$default(float r0, float r1, float r2, float[] r3, int r4, int r5, Object r6) {
        if ((r5 & 16) == 0) goto L6;
        r4 = 0;
    L6:
        return findQuadraticRoots(r0, r1, r2, r3, r4);
    }

    private static final int findQuadraticRoots(float p0, float p1, float p2, float[] roots, int index) {
        double a = p0;
        double b = p1;
        double c = p2;
        double d = (a - (b * 2.0d)) + c;
        boolean r17 = false;
        if (d != 0.0d) goto L5;
        boolean r12 = true;
    L6:
        if (r12 == true) goto L18;
        double v1 = -Math.sqrt((b * b) - (a * c));
        double v2 = (-a) + b;
        int rootCount = 0 + writeValidRootInUnitRange((float) ((-(v1 + v2)) / d), roots, index);
        int rootCount2 = rootCount + writeValidRootInUnitRange((float) ((v1 - v2) / d), roots, index + rootCount);
        if (rootCount2 <= 1) goto L23;
        float s = roots[index];
        float t = roots[index + 1];
        if (s <= t) goto L13;
        roots[index] = t;
        roots[index + 1] = s;
        return rootCount2;
    L13:
        if (s != t) goto L15;
        r17 = true;
    L15:
        if (r17 == true) goto L26;
        return rootCount2;
    L26:
        return rootCount2 - 1;
    L23:
        return rootCount2;
    L18:
        if (b != c) goto L20;
        r17 = true;
    L20:
        if (r17 == false) goto L22;
        return 0;
    L22:
        return 0 + writeValidRootInUnitRange((float) (((b * 2.0d) - c) / ((b * 2.0d) - (c * 2.0d))), roots, index);
    L5:
        r12 = false;
        goto L6
    }

    private static final int findDerivativeRoots(PathSegment r12, boolean r13, float[] r14, int r15) {
        int r0 = !r13 ? 1 : 0;
        float[] r1 = r12.getPoints();
        PathSegment.Type r2 = r12.getType();
        switch(WhenMappings.$EnumSwitchMapping$0[r2.ordinal()]) {
            case 3: goto L6;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return 0;
    L5:
        float r3 = (r1[r0 + 2] - r1[r0 + 0]) * 3.0f;
        float r5 = (r1[r0 + 4] - r1[r0 + 2]) * 3.0f;
        float r6 = (r1[r0 + 6] - r1[r0 + 4]) * 3.0f;
        int r4 = findQuadraticRoots(r3, r5, r6, r14, r15);
        float r7 = (r5 - r3) * 2.0f;
        float r10 = (-r7) / (((r6 - r5) * 2.0f) - r7);
        return r4 + access$writeValidRootInUnitRange(r10, r14, r15 + r4);
    L6:
        float r8 = (r1[r0 + 2] - r1[r0 + 0]) * 2.0f;
        float r9 = 2.0f * (r1[r0 + 4] - r1[r0 + 2]);
        return access$writeValidRootInUnitRange((-r8) / (r9 - r8), r14, r15);
    }

    public static /* synthetic */ long computeHorizontalBounds$default(PathSegment r0, float[] r1, int r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = 0;
    L6:
        return computeHorizontalBounds(r0, r1, r2);
    }

    public static final long computeHorizontalBounds(PathSegment segment, float[] roots, int index) {
        int count = findDerivativeRoots(segment, true, roots, index);
        float minX = Math.min(segment.getPoints()[0], getEndX(segment));
        float maxX = Math.max(segment.getPoints()[0], getEndX(segment));
        int i = 0;
    L3:
        if (i >= count) goto L6;
        float t = roots[i];
        float x = evaluateX(segment, t);
        minX = Math.min(minX, x);
        maxX = Math.max(maxX, x);
        i = i + 1;
        goto L3
    L6:
        return FloatFloatPair.m4constructorimpl(minX, maxX);
    }

    public static /* synthetic */ long computeVerticalBounds$default(PathSegment r0, float[] r1, int r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = 0;
    L6:
        return computeVerticalBounds(r0, r1, r2);
    }

    public static final long computeVerticalBounds(PathSegment segment, float[] roots, int index) {
        int count = findDerivativeRoots(segment, false, roots, index);
        float minY = Math.min(segment.getPoints()[1], getEndY(segment));
        float maxY = Math.max(segment.getPoints()[1], getEndY(segment));
        int i = 0;
    L3:
        if (i >= count) goto L6;
        float t = roots[i];
        float x = evaluateY(segment, t);
        minY = Math.min(minY, x);
        maxY = Math.max(maxY, x);
        i = i + 1;
        goto L3
    L6:
        return FloatFloatPair.m4constructorimpl(minY, maxY);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float r6, float r7, float r8, float r9, float[] r10, int r11, int r12, Object r13) {
        if ((r12 & 32) == 0) goto L5;
        int r5 = 0;
    L7:
        return computeCubicVerticalBounds(r6, r7, r8, r9, r10, r5);
    L5:
        r5 = r11;
        goto L7
    }

    public static final long computeCubicVerticalBounds(float p0y, float p1y, float p2y, float p3y, float[] roots, int index) {
        float[] r4 = roots;
        float d0 = (p1y - p0y) * 3.0f;
        float d1 = (p2y - p1y) * 3.0f;
        float d2 = (p3y - p2y) * 3.0f;
        int count = findQuadraticRoots(d0, d1, d2, r4, index);
        float dd0 = (d1 - d0) * 2.0f;
        float dd1 = (d2 - d1) * 2.0f;
        int index$iv = index + count;
        int count2 = count + access$writeValidRootInUnitRange((-dd0) / (dd1 - dd0), r4, index$iv);
        float minY = Math.min(p0y, p3y);
        float maxY = Math.max(p0y, p3y);
        int i = 0;
    L3:
        if (i >= count2) goto L6;
        float t = r4[i];
        float y = evaluateCubic(p0y, p1y, p2y, p3y, t);
        minY = Math.min(minY, y);
        maxY = Math.max(maxY, y);
        i = i + 1;
        r4 = roots;
        goto L3
    L6:
        return FloatFloatPair.m4constructorimpl(minY, maxY);
    }

    public static final boolean closeTo(double $this$closeTo, double b) {
        if (Math.abs($this$closeTo - b) >= Epsilon) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean closeTo(float $this$closeTo, float b) {
        if (Math.abs($this$closeTo - b) >= FloatEpsilon) goto L5;
        return true;
    L5:
        return false;
    }

    private static final float clampValidRootInUnitRange(float r) {
        float $this$fastCoerceAtLeast$iv$iv = r;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0f) goto L9;
        $this$fastCoerceAtLeast$iv$iv = 1.0f;
    L9:
        if (Math.abs($this$fastCoerceAtLeast$iv$iv - r) <= FloatEpsilon) goto L12;
        return Float.NaN;
    L12:
        return $this$fastCoerceAtLeast$iv$iv;
    }

    private static final int writeValidRootInUnitRange(float r8, float[] r9, int r10) {
        float r5 = r8;
        if (r5 >= 0.0f) goto L6;
        r5 = 0.0f;
    L6:
        if (r5 <= 1.0f) goto L9;
        r5 = 1.0f;
    L9:
        if (Math.abs(r5 - r8) <= FloatEpsilon) goto L11;
        r5 = Float.NaN;
    L11:
        r9[r10] = r5;
        return !Float.isNaN(r5) ? 1 : 0;
    }

    public static final int lineWinding(float[] points, float x, float y) {
        boolean r2 = false;
        if (points.length >= 4) goto L5;
        return 0;
    L5:
        float x0 = points[0];
        float y0 = points[1];
        float x1 = points[2];
        float y1 = points[3];
        float dy = y1 - y0;
        int direction = 1;
        if (y0 <= y1) goto L9;
        y0 = y1;
        y1 = y0;
        direction = -1;
    L9:
        if (y >= y0) goto L11;
    L22:
        return 0;
    L11:
        if (y >= y1) goto L22;
        float crossProduct = ((x1 - x0) * (y - y0)) - ((x - x0) * dy);
        if (crossProduct != 0.0f) goto L16;
        r2 = true;
    L16:
        if (r2 == false) goto L19;
        return 0;
    L19:
        if (((int) Math.signum(crossProduct)) != direction) goto L24;
        return 0;
    L24:
        return direction;
    }

    private static final boolean isQuadraticMonotonic(float y0, float y1, float y2) {
        if ((Math.signum(y0 - y1) + Math.signum(y1 - y2)) != 0.0f) goto L5;
        boolean r0 = true;
    L7:
        return !r0;
    L5:
        r0 = false;
        goto L7
    }

    public static final int quadraticWinding(float[] points, float x, float y, float[] tmpQuadratics, float[] tmpRoots) {
        float y0 = points[1];
        float y1 = points[3];
        float y2 = points[5];
        if (isQuadraticMonotonic(y0, y1, y2) == true) goto L5;
        int rootCount = quadraticToMonotonicQuadratics(points, tmpQuadratics);
        int winding = monotonicQuadraticWinding(tmpQuadratics, 0, x, y, tmpRoots);
        if (rootCount > 0) goto L9;
        return winding;
    L9:
        return winding + monotonicQuadraticWinding(tmpQuadratics, 4, x, y, tmpRoots);
    L5:
        return monotonicQuadraticWinding(points, 0, x, y, tmpRoots);
    }

    private static final int monotonicQuadraticWinding(float[] points, int offset, float x, float y, float[] tmpRoots) {
        float y0 = points[offset + 1];
        float y2 = points[offset + 5];
        int direction = 1;
        if (y0 <= y2) goto L6;
        y2 = y0;
        y0 = y2;
        direction = -1;
    L6:
        if (y >= y0) goto L8;
    L34:
        return 0;
    L8:
        if (y >= y2) goto L34;
        float y1 = points[offset + 1];
        float y3 = points[offset + 3];
        float y4 = points[offset + 5];
        int rootCount = findQuadraticRoots$default((y1 - (y3 * 2.0f)) + y4, (y3 - y1) * 2.0f, y1 - y, tmpRoots, 0, 16, null);
        if (rootCount != 0) goto L13;
        float xt = points[(1 - direction) * 2];
    L14:
        float $this$closeTo$iv = xt;
        boolean r11 = true;
        if (Math.abs($this$closeTo$iv - x) >= FloatEpsilon) goto L17;
        boolean r8 = true;
    L18:
        if (r8 == false) goto L31;
        if (x != points[4]) goto L22;
        boolean r6 = true;
    L23:
        if (r6 == true) goto L25;
    L29:
        return 0;
    L25:
        if (y == y4) goto L28;
        r11 = false;
    L28:
        if (r11 == true) goto L31;
    L22:
        r6 = false;
    L31:
        if (xt < x) goto L33;
        return 0;
    L33:
        return direction;
    L17:
        r8 = false;
        goto L18
    L13:
        xt = evaluateQuadratic(points[0], points[2], points[4], tmpRoots[0]);
        goto L14
    }

    private static final int quadraticToMonotonicQuadratics(float[] quadratic, float[] dst) {
        if (quadratic.length >= 6) goto L6;
        return 0;
    L6:
        if (dst.length >= 6) goto L8;
        return 0;
    L8:
        float y0 = quadratic[1];
        float y1 = quadratic[3];
        float y2 = quadratic[5];
        if (isQuadraticMonotonic(y0, y1, y2) == true) goto L19;
        float t = unitDivide(y0 - y1, ((y0 - y1) - y1) + y2);
        if (Float.isNaN(t) == true) goto L15;
        splitQuadraticAt(quadratic, dst, t);
        return 1;
    L15:
        if (Math.abs(y0 - y1) >= Math.abs(y1 - y2)) goto L17;
        float r0 = y0;
    L18:
        y1 = r0;
        goto L19
    L17:
        r0 = y2;
    L19:
        ArraysKt.copyInto(quadratic, dst, 0, 0, 6);
        dst[3] = y1;
        return 0;
    }

    private static final void splitQuadraticAt(float[] src, float[] dst, float t) {
        if (src.length >= 6) goto L6;
        return;
    L6:
        if (dst.length >= 10) goto L8;
        return;
    L8:
        float p0x = src[0];
        float p0y = src[1];
        float p1x = src[2];
        float p1y = src[3];
        float p2x = src[4];
        float p2y = src[5];
        float abx = MathHelpersKt.lerp(p0x, p1x, t);
        float aby = MathHelpersKt.lerp(p0y, p1y, t);
        dst[0] = p0x;
        dst[1] = p0y;
        dst[2] = abx;
        dst[3] = aby;
        float bcx = MathHelpersKt.lerp(p1x, p2x, t);
        float bcy = MathHelpersKt.lerp(p1y, p2y, t);
        float abcx = MathHelpersKt.lerp(abx, bcx, t);
        float abcy = MathHelpersKt.lerp(aby, bcy, t);
        dst[4] = abcx;
        dst[5] = abcy;
        dst[6] = bcx;
        dst[7] = bcy;
        dst[8] = p2x;
        dst[9] = p2y;
    }

    private static final float unitDivide(float x, float y) {
        float n = x;
        float d = y;
        if (n >= 0.0f) goto L5;
        n = -n;
        d = -d;
    L5:
        boolean r4 = true;
        if (d != 0.0f) goto L8;
        boolean r3 = true;
    L10:
        if (r3 == false) goto L12;
    L26:
        return Float.NaN;
    L12:
        if (n != 0.0f) goto L14;
        boolean r5 = true;
    L15:
        if (r5 == true) goto L26;
        if (n >= d) goto L26;
        float r = n / d;
        if (r == 0.0f) goto L23;
        r4 = false;
    L23:
        if (r4 == false) goto L25;
        return Float.NaN;
    L25:
        return r;
    L14:
        r5 = false;
        goto L15
    L8:
        r3 = false;
        goto L10
    }

    public static final int cubicWinding(float[] points, float x, float y, float[] tmpCubics, float[] tmpRoots) {
        int splits = cubicToMonotonicCubics(points, tmpCubics, tmpRoots);
        int winding = 0;
        int i = 0;
        if (0 > splits) goto L7;
    L4:
        winding = winding + monotonicCubicWinding(tmpCubics, (i * 3) * 2, x, y);
        if (i == splits) goto L7;
        i = i + 1;
    L7:
        return winding;
    }

    private static final int monotonicCubicWinding(float[] points, int offset, float x, float y) {
        float y0 = points[offset + 1];
        float y3 = points[offset + 7];
        int direction = 1;
        if (y0 <= y3) goto L6;
        y3 = y0;
        y0 = y3;
        direction = -1;
    L6:
        if (y >= y0) goto L8;
    L39:
        return 0;
    L8:
        if (y >= y3) goto L39;
        float x0 = points[offset + 0];
        float x1 = points[offset + 2];
        float x2 = points[offset + 4];
        float x3 = points[offset + 6];
        float min = Math.min(x0, Math.min(x1, Math.min(x2, x3)));
        if (x >= min) goto L13;
        return 0;
    L13:
        float max = Math.max(x0, Math.max(x1, Math.max(x2, x3)));
        if (x <= max) goto L16;
        return direction;
    L16:
        float y1 = points[offset + 1];
        float y2 = points[offset + 3];
        float y4 = points[offset + 5];
        float y5 = points[offset + 7];
        float root = findFirstCubicRoot(y1 - y, y2 - y, y4 - y, y5 - y);
        if (Float.isNaN(root) == false) goto L19;
        return 0;
    L19:
        float xt = evaluateCubic(x0, x1, x2, x3, root);
        boolean r17 = true;
        if (Math.abs(xt - x) >= FloatEpsilon) goto L22;
        boolean r14 = true;
    L23:
        if (r14 == false) goto L36;
        if (x != x3) goto L27;
        boolean r15 = true;
    L28:
        if (r15 == true) goto L30;
    L34:
        return 0;
    L30:
        if (y == y5) goto L33;
        r17 = false;
    L33:
        if (r17 == true) goto L36;
    L27:
        r15 = false;
    L36:
        if (xt < x) goto L38;
        return 0;
    L38:
        return direction;
    L22:
        r14 = false;
        goto L23
    }

    private static final int cubicToMonotonicCubics(float[] cubic, float[] dst, float[] tmpRoot) {
        int rootCount = findCubicExtremaY(cubic, tmpRoot);
        if (rootCount == 0) goto L5;
        float lastT = 0.0f;
        int dstOffset = 0;
        float[] src = cubic;
        int i = 0;
    L9:
        if (i >= rootCount) goto L17;
        float t = tmpRoot[i];
        float $this$fastCoerceIn$iv = (t - lastT) / (1.0f - lastT);
        float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L14;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L14:
        if ($this$fastCoerceAtLeast$iv$iv <= 1.0f) goto L16;
        $this$fastCoerceAtLeast$iv$iv = 1.0f;
    L16:
        lastT = $this$fastCoerceAtLeast$iv$iv;
        splitCubicAt(src, dstOffset, dst, dstOffset, $this$fastCoerceAtLeast$iv$iv);
        src = dst;
        dstOffset = dstOffset + 6;
        i = i + 1;
    L17:
        return rootCount;
    L5:
        if (dst.length >= 8) goto L7;
        return 0;
    L7:
        ArraysKt.copyInto(cubic, dst, 0, 0, 8);
        goto L17
    }

    private static final int findCubicExtremaY(float[] cubic, float[] dstRoots) {
        float a = cubic[1];
        float b = cubic[3];
        float c = cubic[5];
        float d = cubic[7];
        float A = (d - a) + ((b - c) * 3.0f);
        float B = (((a - b) - b) - c) * 2.0f;
        float C = b - a;
        return findQuadraticRoots(A, B, C, dstRoots, 0);
    }

    private static final void splitCubicAt(float[] src, int srcOffset, float[] dst, int dstOffset, float t) {
        if (src.length >= (srcOffset + 8)) goto L6;
        return;
    L6:
        if (dst.length >= (dstOffset + 14)) goto L9;
        return;
    L9:
        if (t < 1.0f) goto L12;
        ArraysKt.copyInto(src, dst, dstOffset, srcOffset, 8);
        float x = src[srcOffset + 6];
        float y = src[srcOffset + 7];
        dst[dstOffset + 8] = x;
        dst[dstOffset + 9] = y;
        dst[dstOffset + 10] = x;
        dst[dstOffset + 11] = y;
        dst[dstOffset + 12] = x;
        dst[dstOffset + 13] = y;
        return;
    L12:
        float p0x = src[srcOffset + 0];
        float p0y = src[srcOffset + 1];
        dst[dstOffset + 0] = p0x;
        dst[dstOffset + 1] = p0y;
        float p1x = src[srcOffset + 2];
        float p1y = src[srcOffset + 3];
        float abx = MathHelpersKt.lerp(p0x, p1x, t);
        float aby = MathHelpersKt.lerp(p0y, p1y, t);
        dst[dstOffset + 2] = abx;
        dst[dstOffset + 3] = aby;
        float p2x = src[srcOffset + 4];
        float p2y = src[srcOffset + 5];
        float bcx = MathHelpersKt.lerp(p1x, p2x, t);
        float bcy = MathHelpersKt.lerp(p1y, p2y, t);
        float abcx = MathHelpersKt.lerp(abx, bcx, t);
        float abcy = MathHelpersKt.lerp(aby, bcy, t);
        dst[dstOffset + 4] = abcx;
        dst[dstOffset + 5] = abcy;
        float p3x = src[srcOffset + 6];
        float p3y = src[srcOffset + 7];
        float cdx = MathHelpersKt.lerp(p2x, p3x, t);
        float cdy = MathHelpersKt.lerp(p2y, p3y, t);
        float bcdx = MathHelpersKt.lerp(bcx, cdx, t);
        float bcdy = MathHelpersKt.lerp(bcy, cdy, t);
        float abcdx = MathHelpersKt.lerp(abcx, bcdx, t);
        float abcdy = MathHelpersKt.lerp(abcy, bcdy, t);
        dst[dstOffset + 6] = abcdx;
        dst[dstOffset + 7] = abcdy;
        dst[dstOffset + 8] = bcdx;
        dst[dstOffset + 9] = bcdy;
        dst[dstOffset + 10] = cdx;
        dst[dstOffset + 11] = cdy;
        dst[dstOffset + 12] = p3x;
        dst[dstOffset + 13] = p3y;
    }

    public static final float cubicArea(float x0, float y0, float x1, float y1, float x2, float y2, float x3, float y3) {
        return ((((((((y3 - y0) * (x1 + x2)) - ((x3 - x0) * (y1 + y2))) + ((x0 - x2) * y1)) - ((y0 - y2) * x1)) + (((x0 / 3.0f) + x2) * y3)) - (((y0 / 3.0f) + y2) * x3)) * 3.0f) / 20.0f;
    }

    private static final float getStartX(PathSegment $this$startX) {
        return $this$startX.getPoints()[0];
    }

    private static final float getEndX(PathSegment $this$endX) {
        float[] r0 = $this$endX.getPoints();
        PathSegment.Type r1 = $this$endX.getType();
        char r2 = 4;
        switch(WhenMappings.$EnumSwitchMapping$0[r1.ordinal()]) {
            case 2: goto L8;
            case 3: goto L10;
            case 4: goto L6;
            case 5: goto L10;
            default: goto L4;
        };
    L4:
        r2 = 0;
        goto L10
    L6:
        r2 = 6;
        goto L10
    L8:
        r2 = 2;
    L10:
        return r0[r2];
    }

    private static final float getStartY(PathSegment $this$startY) {
        return $this$startY.getPoints()[1];
    }

    private static final float getEndY(PathSegment $this$endY) {
        float[] r0 = $this$endY.getPoints();
        PathSegment.Type r1 = $this$endY.getType();
        char r2 = 5;
        switch(WhenMappings.$EnumSwitchMapping$0[r1.ordinal()]) {
            case 2: goto L8;
            case 3: goto L10;
            case 4: goto L6;
            case 5: goto L10;
            default: goto L4;
        };
    L4:
        r2 = 0;
        goto L10
    L6:
        r2 = 7;
        goto L10
    L8:
        r2 = 3;
    L10:
        return r0[r2];
    }
}
