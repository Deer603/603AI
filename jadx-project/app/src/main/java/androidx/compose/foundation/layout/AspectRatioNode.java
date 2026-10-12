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
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001e\u0010&\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u001e\u0010,\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010)J\u001e\u0010.\u001a\u00020\u0011*\u00020\u00122\u0006\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float r1) {
        this.aspectRatio = r1;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void setMatchHeightConstraintsFirst(boolean r1) {
        this.matchHeightConstraintsFirst = r1;
    }

    public AspectRatioNode(float aspectRatio, boolean matchHeightConstraintsFirst) {
        this.aspectRatio = aspectRatio;
        this.matchHeightConstraintsFirst = matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        long size = m624findSizeToXhtMw(constraints);
        if (IntSize.m7142equalsimpl0(size, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L5;
        long wrappedConstraints = Constraints.Companion.m6936fixedJhjzzOo((int) (size >> 32), (int) (4294967295L & size));
    L6:
        final Placeable placeable = measurable.mo5714measureBRTryo0(wrappedConstraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new AspectRatioNode$measure$1(placeable), 4, null);
    L5:
        wrappedConstraints = constraints;
        goto L6
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        if (height == Integer.MAX_VALUE) goto L6;
        float $this$fastRoundToInt$iv = height * this.aspectRatio;
        return Math.round($this$fastRoundToInt$iv);
    L6:
        return measurable.minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        if (height == Integer.MAX_VALUE) goto L6;
        float $this$fastRoundToInt$iv = height * this.aspectRatio;
        return Math.round($this$fastRoundToInt$iv);
    L6:
        return measurable.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        if (width == Integer.MAX_VALUE) goto L6;
        float $this$fastRoundToInt$iv = width / this.aspectRatio;
        return Math.round($this$fastRoundToInt$iv);
    L6:
        return measurable.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        if (width == Integer.MAX_VALUE) goto L6;
        float $this$fastRoundToInt$iv = width / this.aspectRatio;
        return Math.round($this$fastRoundToInt$iv);
    L6:
        return measurable.maxIntrinsicHeight(width);
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m624findSizeToXhtMw(long $this$findSize_u2dToXhtMw) {
        if (this.matchHeightConstraintsFirst == true) goto L29;
        long it = m626tryMaxWidthJN0ABg($this$findSize_u2dToXhtMw, true);
        if (IntSize.m7142equalsimpl0(it, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L7;
        return it;
    L7:
        long it2 = m625tryMaxHeightJN0ABg($this$findSize_u2dToXhtMw, true);
        if (IntSize.m7142equalsimpl0(it2, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L10;
        return it2;
    L10:
        long it3 = m628tryMinWidthJN0ABg($this$findSize_u2dToXhtMw, true);
        if (IntSize.m7142equalsimpl0(it3, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L13;
        return it3;
    L13:
        long it4 = m627tryMinHeightJN0ABg($this$findSize_u2dToXhtMw, true);
        if (IntSize.m7142equalsimpl0(it4, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L16;
        return it4;
    L16:
        long it5 = m626tryMaxWidthJN0ABg($this$findSize_u2dToXhtMw, false);
        if (IntSize.m7142equalsimpl0(it5, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L19;
        return it5;
    L19:
        long it6 = m625tryMaxHeightJN0ABg($this$findSize_u2dToXhtMw, false);
        if (IntSize.m7142equalsimpl0(it6, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L22;
        return it6;
    L22:
        long it7 = m628tryMinWidthJN0ABg($this$findSize_u2dToXhtMw, false);
        if (IntSize.m7142equalsimpl0(it7, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L25;
        return it7;
    L25:
        long it8 = m627tryMinHeightJN0ABg($this$findSize_u2dToXhtMw, false);
        if (IntSize.m7142equalsimpl0(it8, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L54;
        return it8;
    L54:
        return IntSize.Companion.m7149getZeroYbymL2g();
    L29:
        long it9 = m625tryMaxHeightJN0ABg($this$findSize_u2dToXhtMw, true);
        if (IntSize.m7142equalsimpl0(it9, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L32;
        return it9;
    L32:
        long it10 = m626tryMaxWidthJN0ABg($this$findSize_u2dToXhtMw, true);
        if (IntSize.m7142equalsimpl0(it10, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L35;
        return it10;
    L35:
        long it11 = m627tryMinHeightJN0ABg($this$findSize_u2dToXhtMw, true);
        if (IntSize.m7142equalsimpl0(it11, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L38;
        return it11;
    L38:
        long it12 = m628tryMinWidthJN0ABg($this$findSize_u2dToXhtMw, true);
        if (IntSize.m7142equalsimpl0(it12, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L41;
        return it12;
    L41:
        long it13 = m625tryMaxHeightJN0ABg($this$findSize_u2dToXhtMw, false);
        if (IntSize.m7142equalsimpl0(it13, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L44;
        return it13;
    L44:
        long it14 = m626tryMaxWidthJN0ABg($this$findSize_u2dToXhtMw, false);
        if (IntSize.m7142equalsimpl0(it14, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L47;
        return it14;
    L47:
        long it15 = m627tryMinHeightJN0ABg($this$findSize_u2dToXhtMw, false);
        if (IntSize.m7142equalsimpl0(it15, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L50;
        return it15;
    L50:
        long it16 = m628tryMinWidthJN0ABg($this$findSize_u2dToXhtMw, false);
        if (IntSize.m7142equalsimpl0(it16, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L54;
        return it16;
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m626tryMaxWidthJN0ABg(long $this$tryMaxWidth_u2dJN_u2d0ABg, boolean enforceConstraints) {
        int maxWidth = Constraints.m6926getMaxWidthimpl($this$tryMaxWidth_u2dJN_u2d0ABg);
        if (maxWidth == Integer.MAX_VALUE) goto L12;
        float $this$fastRoundToInt$iv = maxWidth / this.aspectRatio;
        int height = Math.round($this$fastRoundToInt$iv);
        if (height <= 0) goto L12;
        if (enforceConstraints == false) goto L10;
        if (AspectRatioKt.m623isSatisfiedByNN6EwU($this$tryMaxWidth_u2dJN_u2d0ABg, maxWidth, height) == false) goto L12;
    L10:
        return IntSize.m7139constructorimpl((((long) maxWidth) << 32) | (((long) height) & 4294967295L));
    L12:
        return IntSize.Companion.m7149getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m625tryMaxHeightJN0ABg(long $this$tryMaxHeight_u2dJN_u2d0ABg, boolean enforceConstraints) {
        int maxHeight = Constraints.m6925getMaxHeightimpl($this$tryMaxHeight_u2dJN_u2d0ABg);
        if (maxHeight == Integer.MAX_VALUE) goto L12;
        float $this$fastRoundToInt$iv = maxHeight * this.aspectRatio;
        int width = Math.round($this$fastRoundToInt$iv);
        if (width <= 0) goto L12;
        if (enforceConstraints == false) goto L10;
        if (AspectRatioKt.m623isSatisfiedByNN6EwU($this$tryMaxHeight_u2dJN_u2d0ABg, width, maxHeight) == false) goto L12;
    L10:
        return IntSize.m7139constructorimpl((((long) width) << 32) | (((long) maxHeight) & 4294967295L));
    L12:
        return IntSize.Companion.m7149getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m628tryMinWidthJN0ABg(long $this$tryMinWidth_u2dJN_u2d0ABg, boolean enforceConstraints) {
        int minWidth = Constraints.m6928getMinWidthimpl($this$tryMinWidth_u2dJN_u2d0ABg);
        float $this$fastRoundToInt$iv = minWidth / this.aspectRatio;
        int height = Math.round($this$fastRoundToInt$iv);
        if (height <= 0) goto L10;
        if (enforceConstraints == false) goto L8;
        if (AspectRatioKt.m623isSatisfiedByNN6EwU($this$tryMinWidth_u2dJN_u2d0ABg, minWidth, height) == false) goto L10;
    L8:
        return IntSize.m7139constructorimpl((((long) minWidth) << 32) | (((long) height) & 4294967295L));
    L10:
        return IntSize.Companion.m7149getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m627tryMinHeightJN0ABg(long $this$tryMinHeight_u2dJN_u2d0ABg, boolean enforceConstraints) {
        int minHeight = Constraints.m6927getMinHeightimpl($this$tryMinHeight_u2dJN_u2d0ABg);
        float $this$fastRoundToInt$iv = minHeight * this.aspectRatio;
        int width = Math.round($this$fastRoundToInt$iv);
        if (width <= 0) goto L10;
        if (enforceConstraints == false) goto L8;
        if (AspectRatioKt.m623isSatisfiedByNN6EwU($this$tryMinHeight_u2dJN_u2d0ABg, width, minHeight) == false) goto L10;
    L8:
        return IntSize.m7139constructorimpl((((long) width) << 32) | (((long) minHeight) & 4294967295L));
    L10:
        return IntSize.Companion.m7149getZeroYbymL2g();
    }
}
