package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import androidx.compose.ui.graphics.Interval;
import androidx.compose.ui.graphics.IntervalTree;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathEasing.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/animation/core/PathEasing;", "Landroidx/compose/animation/core/Easing;", "path", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/ui/graphics/Path;)V", "intervals", "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/PathSegment;", "initializeEasing", "", "transform", "", "fraction", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PathEasing implements Easing {
    public static final int $stable = 0;
    private IntervalTree<PathSegment> intervals;
    private final Path path;

    static {
    }

    public PathEasing(Path path) {
        this.path = path;
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float fraction) {
        if (fraction > 0.0f) goto L6;
        return 0.0f;
    L6:
        if (fraction < 1.0f) goto L9;
        return 1.0f;
    L9:
        if (this.intervals != null) goto L11;
        initializeEasing();
    L11:
        IntervalTree<PathSegment> r1 = this.intervals;
        if (r1 != null) goto L14;
        Intrinsics.throwUninitializedPropertyAccessException("intervals");
        r1 = null;
    L14:
        Interval result = IntervalTree.findFirstOverlap$default(r1, fraction, 0.0f, 2, null);
        Object value$iv = result.getData();
        if (value$iv == null) goto L21;
        PathSegment segment = (PathSegment) value$iv;
        float t = BezierKt.findFirstRoot(segment, fraction);
        if ((!Float.isNaN(t)) == true) goto L20;
        PreconditionsKt.throwIllegalStateException("The easing path is invalid. Make sure it does not contain NaN/Infinity values.");
    L20:
        return BezierKt.evaluateY(segment, t);
    L21:
        PreconditionsKt.throwIllegalStateExceptionForNullCheck("The easing path is invalid. Make sure it is continuous on the x axis.");
        throw new KotlinNothingValueException();
    }

    private final void initializeEasing() {
        float[] roots = new float[5];
        IntervalTree<PathSegment> r1 = new IntervalTree();
        PathIterator iterator = this.path.iterator(PathIterator.ConicEvaluation.AsQuadratics, 2.0E-4f);
    L3:
        boolean value$iv = true;
        if (iterator.hasNext() == false) goto L18;
        PathSegment segment = iterator.next();
        if (segment.getType() != PathSegment.Type.Close) goto L10;
        value$iv = false;
    L10:
        if (value$iv == true) goto L13;
        PreconditionsKt.throwIllegalArgumentException("The path cannot contain a close() command.");
    L13:
        if (segment.getType() == PathSegment.Type.Move) goto L3;
        if (segment.getType() == PathSegment.Type.Done) goto L3;
        long bounds = BezierKt.computeHorizontalBounds$default(segment, roots, 0, 4, null);
        int bits$iv$iv = (int) (bounds >> 32);
        int bits$iv$iv2 = (int) (4294967295L & bounds);
        r1.addInterval(Float.intBitsToFloat(bits$iv$iv), Float.intBitsToFloat(bits$iv$iv2), segment);
        goto L3
    L18:
        if (r1.contains(0.0f) == true) goto L20;
    L22:
        value$iv = false;
    L24:
        if (value$iv == true) goto L26;
        PreconditionsKt.throwIllegalArgumentException("The easing path must start at 0.0f and end at 1.0f.");
    L26:
        this.intervals = r1;
        return;
    L20:
        if (r1.contains(1.0f) == false) goto L22;
        goto L22
    }
}
