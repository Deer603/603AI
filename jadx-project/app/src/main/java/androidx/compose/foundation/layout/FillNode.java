package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "direction", "Landroidx/compose/foundation/layout/Direction;", "fraction", "", "(Landroidx/compose/foundation/layout/Direction;F)V", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "getFraction", "()F", "setFraction", "(F)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public final Direction getDirection() {
        return this.direction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final void setDirection(Direction r1) {
        this.direction = r1;
    }

    public final void setFraction(float r1) {
        this.fraction = r1;
    }

    public FillNode(Direction direction, float fraction) {
        this.direction = direction;
        this.fraction = fraction;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        if (Constraints.m6922getHasBoundedWidthimpl(constraints) == true) goto L5;
    L13:
        int minWidth = Constraints.m6928getMinWidthimpl(constraints);
        int $this$fastCoerceAtLeast$iv$iv = Constraints.m6926getMaxWidthimpl(constraints);
    L15:
        if (Constraints.m6921getHasBoundedHeightimpl(constraints) == true) goto L17;
    L25:
        int minHeight = Constraints.m6927getMinHeightimpl(constraints);
        int $this$fastCoerceAtLeast$iv$iv2 = Constraints.m6925getMaxHeightimpl(constraints);
    L26:
        final Placeable placeable = measurable.mo5714measureBRTryo0(ConstraintsKt.Constraints(minWidth, $this$fastCoerceAtLeast$iv$iv, minHeight, $this$fastCoerceAtLeast$iv$iv2));
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new FillNode$measure$1(placeable), 4, null);
    L17:
        if (this.direction == Direction.Horizontal) goto L25;
        float $this$fastRoundToInt$iv = Constraints.m6925getMaxHeightimpl(constraints) * this.fraction;
        int $this$fastCoerceIn$iv = Math.round($this$fastRoundToInt$iv);
        int minimumValue$iv = Constraints.m6927getMinHeightimpl(constraints);
        int maximumValue$iv = Constraints.m6925getMaxHeightimpl(constraints);
        $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv2 >= minimumValue$iv) goto L22;
        $this$fastCoerceAtLeast$iv$iv2 = minimumValue$iv;
    L22:
        if ($this$fastCoerceAtLeast$iv$iv2 <= maximumValue$iv) goto L24;
        $this$fastCoerceAtLeast$iv$iv2 = maximumValue$iv;
    L24:
        minHeight = $this$fastCoerceAtLeast$iv$iv2;
        goto L26
    L5:
        if (this.direction == Direction.Vertical) goto L13;
        float $this$fastRoundToInt$iv2 = Constraints.m6926getMaxWidthimpl(constraints) * this.fraction;
        int $this$fastCoerceIn$iv2 = Math.round($this$fastRoundToInt$iv2);
        int minimumValue$iv2 = Constraints.m6928getMinWidthimpl(constraints);
        int maximumValue$iv2 = Constraints.m6926getMaxWidthimpl(constraints);
        $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv2;
        if ($this$fastCoerceAtLeast$iv$iv >= minimumValue$iv2) goto L10;
        $this$fastCoerceAtLeast$iv$iv = minimumValue$iv2;
    L10:
        if ($this$fastCoerceAtLeast$iv$iv <= maximumValue$iv2) goto L12;
        $this$fastCoerceAtLeast$iv$iv = maximumValue$iv2;
    L12:
        minWidth = $this$fastCoerceAtLeast$iv$iv;
        goto L15
    }
}
