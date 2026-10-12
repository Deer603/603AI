package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathHitTester.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/PathHitTester;", "", "()V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "curves", "", "intervals", "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/PathSegment;", "path", "Landroidx/compose/ui/graphics/Path;", "roots", "tolerance", "", "contains", "", "position", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "updatePath", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PathHitTester {
    private Rect bounds;
    private final float[] curves;
    private final IntervalTree<PathSegment> intervals;
    private Path path;
    private final float[] roots;
    private float tolerance;

    /* JADX INFO: compiled from: PathHitTester.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[PathSegment.Type.values().length];
            r0[PathSegment.Type.Line.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[PathSegment.Type.Quadratic.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[PathSegment.Type.Cubic.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[PathSegment.Type.Done.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public PathHitTester() {
        this.path = PathHitTesterKt.access$getEmptyPath$p();
        this.tolerance = 0.5f;
        this.bounds = Rect.Companion.getZero();
        this.intervals = new IntervalTree();
        this.curves = new float[20];
        this.roots = new float[2];
    }

    public static /* synthetic */ void updatePath$default(PathHitTester r0, Path r1, float r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0.5f;
    L5:
        r0.updatePath(r1, r2);
    }

    public final void updatePath(Path path, float tolerance) {
        this.path = path;
        this.tolerance = tolerance;
        this.bounds = path.getBounds();
        this.intervals.clear();
        PathIterator iterator = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, tolerance);
    L4:
        if (iterator.hasNext() == false) goto L10;
        PathSegment segment = iterator.next();
        PathSegment.Type r2 = segment.getType();
        switch(WhenMappings.$EnumSwitchMapping$0[r2.ordinal()]) {
            case 1: goto L9;
            case 2: goto L9;
            case 3: goto L9;
            case 4: goto L17;
            default: goto L4;
        };
    L9:
        long r3 = BezierKt.computeVerticalBounds$default(segment, this.curves, 0, 4, null);
        int bits$iv$iv = (int) (r3 >> 32);
        float min = Float.intBitsToFloat(bits$iv$iv);
        int bits$iv$iv2 = (int) (r3 & 4294967295L);
        float max = Float.intBitsToFloat(bits$iv$iv2);
        this.intervals.addInterval(min, max, segment);
        goto L4
    L17:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4650containsk4lQ0M(long position) {
        if (this.path.isEmpty() == true) goto L44;
        if (this.bounds.m4151containsk4lQ0M(position) == false) goto L44;
        int bits$iv$iv$iv$iv = (int) (position >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv$iv);
        int bits$iv$iv$iv$iv2 = (int) (4294967295L & position);
        float y = Float.intBitsToFloat(bits$iv$iv$iv$iv2);
        float[] curvesArray = this.curves;
        float[] rootsArray = this.roots;
        int winding = 0;
        IntervalTree<PathSegment> r7 = this.intervals;
        int r14 = 1;
        if (r7.root == r7.terminator) goto L35;
        ArrayList<IntervalTree<PathSegment>.Node> r12 = r7.stack;
        r12.add(r7.root);
    L11:
        if (r12.size() <= 0) goto L34;
        IntervalTree<PathSegment>.Node r13 = r12.remove(r12.size() - r14);
        if (r13.overlaps(y, y) == false) goto L22;
        IntervalTree<PathSegment>.Node interval = r13;
        PathSegment r17 = interval.getData();
        Intrinsics.checkNotNull(r17);
        PathSegment segment = r17;
        int r18 = r14;
        float[] points = segment.getPoints();
        switch(WhenMappings.$EnumSwitchMapping$0[segment.getType().ordinal()]) {
            case 1: goto L20;
            case 2: goto L19;
            case 3: goto L18;
            case 4: goto L24;
            default: goto L24;
        };
    L18:
        winding = winding + BezierKt.cubicWinding(points, x, y, curvesArray, rootsArray);
        goto L24
    L19:
        winding = winding + BezierKt.quadraticWinding(points, x, y, curvesArray, rootsArray);
        goto L24
    L20:
        winding = winding + BezierKt.lineWinding(points, x, y);
    L24:
        if (r13.getLeft() == r7.terminator) goto L29;
        if (r13.getLeft().getMax() < y) goto L29;
        r12.add(r13.getLeft());
    L29:
        if (r13.getRight() == r7.terminator) goto L33;
        if (r13.getRight().getMin() > y) goto L33;
        r12.add(r13.getRight());
    L33:
        r14 = r18;
        goto L11
    L22:
        r18 = r14;
        goto L24
    L34:
        boolean r19 = r14;
        r12.clear();
    L36:
        boolean isEvenOdd = PathFillType.m4644equalsimpl0(this.path.mo4257getFillTypeRgk1Os(), PathFillType.Companion.m4648getEvenOddRgk1Os());
        if (isEvenOdd == false) goto L39;
        winding = winding & 1;
    L39:
        if (winding == 0) goto L41;
        return r19;
    L41:
        return false;
    L35:
        r19 = 1;
    L44:
        return false;
    }
}
