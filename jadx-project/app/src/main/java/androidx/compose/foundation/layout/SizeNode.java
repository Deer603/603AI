package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010%\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016J&\u0010'\u001a\u00020(*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001c\u0010.\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010/\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u001c8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "getMaxHeight-D9Ej5fM", "()F", "setMaxHeight-0680j_4", "(F)V", "F", "getMaxWidth-D9Ej5fM", "setMaxWidth-0680j_4", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float r1, float r2, float r3, float r4, boolean r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    public /* synthetic */ SizeNode(float r8, float r9, float r10, float r11, boolean r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L5;
        float r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L7:
        if ((r13 & 2) == 0) goto L9;
        float r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L11:
        if ((r13 & 4) == 0) goto L13;
        float r3 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L15:
        if ((r13 & 8) == 0) goto L17;
        float r4 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L18:
        this(r1, r2, r3, r4, r12, null);
        return;
    L17:
        r4 = r11;
        goto L18
    L13:
        r3 = r10;
        goto L15
    L9:
        r2 = r9;
        goto L11
    L5:
        r1 = r8;
        goto L7
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m784getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m788setMinWidth0680j_4(float r1) {
        this.minWidth = r1;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m783getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m787setMinHeight0680j_4(float r1) {
        this.minHeight = r1;
    }

    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m782getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m786setMaxWidth0680j_4(float r1) {
        this.maxWidth = r1;
    }

    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m781getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m785setMaxHeight0680j_4(float r1) {
        this.maxHeight = r1;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final void setEnforceIncoming(boolean r1) {
        this.enforceIncoming = r1;
    }

    private SizeNode(float minWidth, float minHeight, float maxWidth, float maxHeight, boolean enforceIncoming) {
        this.minWidth = minWidth;
        this.minHeight = minHeight;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.enforceIncoming = enforceIncoming;
    }

    /* JADX INFO: renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m780getTargetConstraintsOenEA2s(Density $this$targetConstraints) {
        float $this$isSpecified$iv = this.maxWidth;
        if (Float.isNaN($this$isSpecified$iv) == true) goto L8;
        int $this$fastCoerceAtLeast$iv = $this$targetConstraints.mo370roundToPx0680j_4(this.maxWidth);
        if ($this$fastCoerceAtLeast$iv >= 0) goto L9;
        $this$fastCoerceAtLeast$iv = 0;
    L9:
        float $this$isSpecified$iv2 = this.maxHeight;
        if (Float.isNaN($this$isSpecified$iv2) == true) goto L15;
        int $this$fastCoerceAtLeast$iv2 = $this$targetConstraints.mo370roundToPx0680j_4(this.maxHeight);
        if ($this$fastCoerceAtLeast$iv2 >= 0) goto L16;
        $this$fastCoerceAtLeast$iv2 = 0;
    L16:
        float $this$isSpecified$iv3 = this.minWidth;
        boolean r5 = Float.isNaN($this$isSpecified$iv3);
        int minHeight = 0;
        if (r5 == true) goto L29;
        int $this$fastCoerceIn$iv = $this$targetConstraints.mo370roundToPx0680j_4(this.minWidth);
        int $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0) goto L22;
        $this$fastCoerceAtLeast$iv$iv = 0;
    L22:
        if ($this$fastCoerceAtLeast$iv$iv <= $this$fastCoerceAtLeast$iv) goto L25;
        $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceAtLeast$iv;
    L25:
        if ($this$fastCoerceAtLeast$iv$iv != Integer.MAX_VALUE) goto L30;
        $this$fastCoerceAtLeast$iv$iv = 0;
    L30:
        float $this$isSpecified$iv4 = this.minHeight;
        if (Float.isNaN($this$isSpecified$iv4) == true) goto L44;
        int $this$fastCoerceIn$iv2 = $this$targetConstraints.mo370roundToPx0680j_4(this.minHeight);
        int $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceIn$iv2;
        if ($this$fastCoerceAtLeast$iv$iv2 >= 0) goto L36;
        $this$fastCoerceAtLeast$iv$iv2 = 0;
    L36:
        if ($this$fastCoerceAtLeast$iv$iv2 <= $this$fastCoerceAtLeast$iv2) goto L39;
        $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceAtLeast$iv2;
    L39:
        if ($this$fastCoerceAtLeast$iv$iv2 == Integer.MAX_VALUE) goto L44;
        minHeight = $this$fastCoerceAtLeast$iv$iv2;
    L44:
        return ConstraintsKt.Constraints($this$fastCoerceAtLeast$iv$iv, $this$fastCoerceAtLeast$iv, minHeight, $this$fastCoerceAtLeast$iv2);
    L29:
        $this$fastCoerceAtLeast$iv$iv = 0;
        goto L30
    L15:
        $this$fastCoerceAtLeast$iv2 = Integer.MAX_VALUE;
        goto L16
    L8:
        $this$fastCoerceAtLeast$iv = Integer.MAX_VALUE;
        goto L9
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        long targetConstraints = m780getTargetConstraintsOenEA2s($this$measure_u2d3p2s80s);
        if (this.enforceIncoming == false) goto L5;
        long wrappedConstraints = ConstraintsKt.m6941constrainN9IONVI(constraints, targetConstraints);
    L30:
        final Placeable placeable = measurable.mo5714measureBRTryo0(wrappedConstraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new SizeNode$measure$1(placeable), 4, null);
    L5:
        float $this$isSpecified$iv = this.minWidth;
        if (Float.isNaN($this$isSpecified$iv) == true) goto L8;
        int $this$fastCoerceAtMost$iv = Constraints.m6928getMinWidthimpl(targetConstraints);
    L11:
        float $this$isSpecified$iv2 = this.maxWidth;
        if (Float.isNaN($this$isSpecified$iv2) == true) goto L14;
        int $this$fastCoerceAtLeast$iv = Constraints.m6926getMaxWidthimpl(targetConstraints);
    L17:
        float $this$isSpecified$iv3 = this.minHeight;
        if (Float.isNaN($this$isSpecified$iv3) == true) goto L20;
        int $this$fastCoerceAtMost$iv2 = Constraints.m6927getMinHeightimpl(targetConstraints);
    L23:
        float $this$isSpecified$iv4 = this.maxHeight;
        if (Float.isNaN($this$isSpecified$iv4) == true) goto L26;
        int $this$fastCoerceAtLeast$iv2 = Constraints.m6925getMaxHeightimpl(targetConstraints);
    L29:
        wrappedConstraints = ConstraintsKt.Constraints($this$fastCoerceAtMost$iv, $this$fastCoerceAtLeast$iv, $this$fastCoerceAtMost$iv2, $this$fastCoerceAtLeast$iv2);
        goto L30
    L26:
        $this$fastCoerceAtLeast$iv2 = Constraints.m6925getMaxHeightimpl(constraints);
        int minimumValue$iv = Constraints.m6927getMinHeightimpl(targetConstraints);
        if ($this$fastCoerceAtLeast$iv2 >= minimumValue$iv) goto L29;
        $this$fastCoerceAtLeast$iv2 = minimumValue$iv;
        goto L29
    L20:
        $this$fastCoerceAtMost$iv2 = Constraints.m6927getMinHeightimpl(constraints);
        int maximumValue$iv = Constraints.m6925getMaxHeightimpl(targetConstraints);
        if ($this$fastCoerceAtMost$iv2 <= maximumValue$iv) goto L23;
        $this$fastCoerceAtMost$iv2 = maximumValue$iv;
        goto L23
    L14:
        $this$fastCoerceAtLeast$iv = Constraints.m6926getMaxWidthimpl(constraints);
        int minimumValue$iv2 = Constraints.m6928getMinWidthimpl(targetConstraints);
        if ($this$fastCoerceAtLeast$iv >= minimumValue$iv2) goto L17;
        $this$fastCoerceAtLeast$iv = minimumValue$iv2;
        goto L17
    L8:
        $this$fastCoerceAtMost$iv = Constraints.m6928getMinWidthimpl(constraints);
        int maximumValue$iv2 = Constraints.m6926getMaxWidthimpl(targetConstraints);
        if ($this$fastCoerceAtMost$iv <= maximumValue$iv2) goto L11;
        $this$fastCoerceAtMost$iv = maximumValue$iv2;
        goto L11
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        long constraints = m780getTargetConstraintsOenEA2s($this$minIntrinsicWidth);
        if (Constraints.m6924getHasFixedWidthimpl(constraints) == false) goto L6;
        int childHeight = Constraints.m6926getMaxWidthimpl(constraints);
        return childHeight;
    L6:
        if (this.enforceIncoming == false) goto L8;
        int childHeight2 = height;
    L10:
        return ConstraintsKt.m6943constrainWidthK40F9xA(constraints, measurable.minIntrinsicWidth(childHeight2));
    L8:
        childHeight2 = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, height);
        goto L10
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        long constraints = m780getTargetConstraintsOenEA2s($this$minIntrinsicHeight);
        if (Constraints.m6923getHasFixedHeightimpl(constraints) == false) goto L6;
        int childWidth = Constraints.m6925getMaxHeightimpl(constraints);
        return childWidth;
    L6:
        if (this.enforceIncoming == false) goto L8;
        int childWidth2 = width;
    L10:
        return ConstraintsKt.m6942constrainHeightK40F9xA(constraints, measurable.minIntrinsicHeight(childWidth2));
    L8:
        childWidth2 = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, width);
        goto L10
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        long constraints = m780getTargetConstraintsOenEA2s($this$maxIntrinsicWidth);
        if (Constraints.m6924getHasFixedWidthimpl(constraints) == false) goto L6;
        int childHeight = Constraints.m6926getMaxWidthimpl(constraints);
        return childHeight;
    L6:
        if (this.enforceIncoming == false) goto L8;
        int childHeight2 = height;
    L10:
        return ConstraintsKt.m6943constrainWidthK40F9xA(constraints, measurable.maxIntrinsicWidth(childHeight2));
    L8:
        childHeight2 = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, height);
        goto L10
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        long constraints = m780getTargetConstraintsOenEA2s($this$maxIntrinsicHeight);
        if (Constraints.m6923getHasFixedHeightimpl(constraints) == false) goto L6;
        int childWidth = Constraints.m6925getMaxHeightimpl(constraints);
        return childWidth;
    L6:
        if (this.enforceIncoming == false) goto L8;
        int childWidth2 = width;
    L10:
        return ConstraintsKt.m6942constrainHeightK40F9xA(constraints, measurable.maxIntrinsicHeight(childWidth2));
    L8:
        childWidth2 = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, width);
        goto L10
    }
}
