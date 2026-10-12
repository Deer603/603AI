package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001c\u0010\u001c\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J&\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\u0019\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001c\u0010'\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/ScrollNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "state", "Landroidx/compose/foundation/ScrollState;", "reverseScrolling", "", "isVertical", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "()Z", "setVertical", "(Z)V", "getReverseScrolling", "setReverseScrolling", "getState", "()Landroidx/compose/foundation/ScrollState;", "setState", "(Landroidx/compose/foundation/ScrollState;)V", "applySemantics", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public static final int $stable = 0;
    private boolean isVertical;
    private boolean reverseScrolling;
    private ScrollState state;

    static {
        $stable = 8;
    }

    public final ScrollState getState() {
        return this.state;
    }

    public final void setState(ScrollState r1) {
        this.state = r1;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final void setReverseScrolling(boolean r1) {
        this.reverseScrolling = r1;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final void setVertical(boolean r1) {
        this.isVertical = r1;
    }

    public ScrollNode(ScrollState state, boolean reverseScrolling, boolean isVertical) {
        this.state = state;
        this.reverseScrolling = reverseScrolling;
        this.isVertical = isVertical;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        if (this.isVertical == false) goto L5;
        Orientation r0 = Orientation.Vertical;
    L6:
        CheckScrollableContainerConstraintsKt.m262checkScrollableContainerConstraintsK40F9xA(constraints, r0);
        int r3 = Integer.MAX_VALUE;
        if (this.isVertical == false) goto L9;
        int r6 = Integer.MAX_VALUE;
    L11:
        if (this.isVertical == false) goto L13;
        r3 = Constraints.m6926getMaxWidthimpl(constraints);
    L13:
        long childConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, r3, 0, r6, 5, null);
        final Placeable placeable = measurable.mo5714measureBRTryo0(childConstraints);
        int width = RangesKt.coerceAtMost(placeable.getWidth(), Constraints.m6926getMaxWidthimpl(constraints));
        int height = RangesKt.coerceAtMost(placeable.getHeight(), Constraints.m6925getMaxHeightimpl(constraints));
        int scrollHeight = placeable.getHeight() - height;
        int scrollWidth = placeable.getWidth() - width;
        if (this.isVertical == false) goto L16;
        int r7 = scrollHeight;
    L17:
        final int side = r7;
        this.state.setMaxValue$foundation_release(side);
        ScrollState r8 = this.state;
        if (this.isVertical == false) goto L20;
        int r9 = height;
    L21:
        r8.setViewportSize$foundation_release(r9);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, height, null, new ScrollNode$measure$1(this, side, placeable), 4, null);
    L20:
        r9 = width;
        goto L21
    L16:
        r7 = scrollWidth;
        goto L17
    L9:
        r6 = Constraints.m6925getMaxHeightimpl(constraints);
        goto L11
    L5:
        r0 = Orientation.Horizontal;
        goto L6
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        if (this.isVertical == false) goto L5;
        int r0 = Integer.MAX_VALUE;
    L7:
        return measurable.minIntrinsicWidth(r0);
    L5:
        r0 = height;
        goto L7
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        if (this.isVertical == false) goto L5;
        int r0 = width;
    L7:
        return measurable.minIntrinsicHeight(r0);
    L5:
        r0 = Integer.MAX_VALUE;
        goto L7
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        if (this.isVertical == false) goto L5;
        int r0 = Integer.MAX_VALUE;
    L7:
        return measurable.maxIntrinsicWidth(r0);
    L5:
        r0 = height;
        goto L7
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        if (this.isVertical == false) goto L5;
        int r0 = width;
    L7:
        return measurable.maxIntrinsicHeight(r0);
    L5:
        r0 = Integer.MAX_VALUE;
        goto L7
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        SemanticsPropertiesKt.setTraversalGroup($this$applySemantics, true);
        ScrollAxisRange accessibilityScrollState = new ScrollAxisRange(new ScrollNode$applySemantics$accessibilityScrollState$1(this), new ScrollNode$applySemantics$accessibilityScrollState$2(this), this.reverseScrolling);
        if (this.isVertical == false) goto L5;
        SemanticsPropertiesKt.setVerticalScrollAxisRange($this$applySemantics, accessibilityScrollState);
        return;
    L5:
        SemanticsPropertiesKt.setHorizontalScrollAxisRange($this$applySemantics, accessibilityScrollState);
    }
}
