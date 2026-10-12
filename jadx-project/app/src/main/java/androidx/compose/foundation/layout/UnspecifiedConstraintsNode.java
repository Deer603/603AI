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
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J&\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u001f\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMinHeight-D9Ej5fM", "()F", "setMinHeight-0680j_4", "(F)V", "F", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float r1, float r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float r1, float r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L8:
        this(r1, r2, null);
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m792getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    /* JADX INFO: renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m794setMinWidth0680j_4(float r1) {
        this.minWidth = r1;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m791getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m793setMinHeight0680j_4(float r1) {
        this.minHeight = r1;
    }

    private UnspecifiedConstraintsNode(float minWidth, float minHeight) {
        this.minWidth = minWidth;
        this.minHeight = minHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        float $this$isSpecified$iv = this.minWidth;
        if (Float.isNaN($this$isSpecified$iv) == false) goto L5;
    L13:
        int $this$fastCoerceAtLeast$iv$iv = Constraints.m6928getMinWidthimpl(constraints);
    L14:
        int r0 = Constraints.m6926getMaxWidthimpl(constraints);
        float $this$isSpecified$iv2 = this.minHeight;
        if (Float.isNaN($this$isSpecified$iv2) == false) goto L17;
    L25:
        int $this$fastCoerceAtLeast$iv$iv2 = Constraints.m6927getMinHeightimpl(constraints);
    L26:
        long wrappedConstraints = ConstraintsKt.Constraints($this$fastCoerceAtLeast$iv$iv, r0, $this$fastCoerceAtLeast$iv$iv2, Constraints.m6925getMaxHeightimpl(constraints));
        final Placeable placeable = measurable.mo5714measureBRTryo0(wrappedConstraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new UnspecifiedConstraintsNode$measure$1(placeable), 4, null);
    L17:
        if (Constraints.m6927getMinHeightimpl(constraints) != 0) goto L25;
        int $this$fastCoerceIn$iv = $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(this.minHeight);
        int maximumValue$iv = Constraints.m6925getMaxHeightimpl(constraints);
        $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv2 >= 0) goto L22;
        $this$fastCoerceAtLeast$iv$iv2 = 0;
    L22:
        if ($this$fastCoerceAtLeast$iv$iv2 <= maximumValue$iv) goto L26;
        $this$fastCoerceAtLeast$iv$iv2 = maximumValue$iv;
        goto L26
    L5:
        if (Constraints.m6928getMinWidthimpl(constraints) != 0) goto L13;
        int $this$fastCoerceIn$iv2 = $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(this.minWidth);
        int maximumValue$iv2 = Constraints.m6926getMaxWidthimpl(constraints);
        $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv2;
        if ($this$fastCoerceAtLeast$iv$iv >= 0) goto L10;
        $this$fastCoerceAtLeast$iv$iv = 0;
    L10:
        if ($this$fastCoerceAtLeast$iv$iv <= maximumValue$iv2) goto L14;
        $this$fastCoerceAtLeast$iv$iv = maximumValue$iv2;
        goto L14
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        int $this$fastCoerceAtLeast$iv = measurable.minIntrinsicWidth(height);
        float $this$isSpecified$iv = this.minWidth;
        if (Float.isNaN($this$isSpecified$iv) == true) goto L5;
        int minimumValue$iv = $this$minIntrinsicWidth.mo370roundToPx0680j_4(this.minWidth);
    L7:
        if ($this$fastCoerceAtLeast$iv < minimumValue$iv) goto L9;
        return $this$fastCoerceAtLeast$iv;
    L9:
        return minimumValue$iv;
    L5:
        minimumValue$iv = 0;
        goto L7
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        int $this$fastCoerceAtLeast$iv = measurable.maxIntrinsicWidth(height);
        float $this$isSpecified$iv = this.minWidth;
        if (Float.isNaN($this$isSpecified$iv) == true) goto L5;
        int minimumValue$iv = $this$maxIntrinsicWidth.mo370roundToPx0680j_4(this.minWidth);
    L7:
        if ($this$fastCoerceAtLeast$iv < minimumValue$iv) goto L9;
        return $this$fastCoerceAtLeast$iv;
    L9:
        return minimumValue$iv;
    L5:
        minimumValue$iv = 0;
        goto L7
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        int $this$fastCoerceAtLeast$iv = measurable.minIntrinsicHeight(width);
        float $this$isSpecified$iv = this.minHeight;
        if (Float.isNaN($this$isSpecified$iv) == true) goto L5;
        int minimumValue$iv = $this$minIntrinsicHeight.mo370roundToPx0680j_4(this.minHeight);
    L7:
        if ($this$fastCoerceAtLeast$iv < minimumValue$iv) goto L9;
        return $this$fastCoerceAtLeast$iv;
    L9:
        return minimumValue$iv;
    L5:
        minimumValue$iv = 0;
        goto L7
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        int $this$fastCoerceAtLeast$iv = measurable.maxIntrinsicHeight(width);
        float $this$isSpecified$iv = this.minHeight;
        if (Float.isNaN($this$isSpecified$iv) == true) goto L5;
        int minimumValue$iv = $this$maxIntrinsicHeight.mo370roundToPx0680j_4(this.minHeight);
    L7:
        if ($this$fastCoerceAtLeast$iv < minimumValue$iv) goto L9;
        return $this$fastCoerceAtLeast$iv;
    L9:
        return minimumValue$iv;
    L5:
        minimumValue$iv = 0;
        goto L7
    }
}
