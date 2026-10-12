package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ&\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "fraction", "", "widthState", "Landroidx/compose/runtime/State;", "", "heightState", "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "getFraction", "()F", "setFraction", "(F)V", "getHeightState", "()Landroidx/compose/runtime/State;", "setHeightState", "(Landroidx/compose/runtime/State;)V", "getWidthState", "setWidthState", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    private float fraction;
    private State<Integer> heightState;
    private State<Integer> widthState;

    public /* synthetic */ ParentSizeNode(float r2, State r3, State r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = null;
    L8:
        this(r2, r3, r4);
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final void setFraction(float r1) {
        this.fraction = r1;
    }

    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    public final void setWidthState(State<Integer> r1) {
        this.widthState = r1;
    }

    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    public final void setHeightState(State<Integer> r1) {
        this.heightState = r1;
    }

    public ParentSizeNode(float fraction, State<Integer> r2, State<Integer> r3) {
        this.fraction = fraction;
        this.widthState = r2;
        this.heightState = r3;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        State<Integer> r0 = this.widthState;
        if (r0 != null) goto L5;
        int width = Integer.MAX_VALUE;
    L10:
        State<Integer> r1 = this.heightState;
        if (r1 != null) goto L13;
        int height = Integer.MAX_VALUE;
    L19:
        if (width == Integer.MAX_VALUE) goto L21;
        int r2 = width;
    L22:
        if (height == Integer.MAX_VALUE) goto L24;
        int r3 = height;
    L25:
        if (width == Integer.MAX_VALUE) goto L27;
        int r5 = width;
    L28:
        if (height == Integer.MAX_VALUE) goto L30;
        int r4 = height;
    L31:
        long childConstraints = ConstraintsKt.Constraints(r2, r5, r3, r4);
        final Placeable placeable = measurable.mo5714measureBRTryo0(childConstraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new ParentSizeNode$measure$1(placeable), 4, null);
    L30:
        r4 = Constraints.m6925getMaxHeightimpl(constraints);
        goto L31
    L27:
        r5 = Constraints.m6926getMaxWidthimpl(constraints);
        goto L28
    L24:
        r3 = Constraints.m6927getMinHeightimpl(constraints);
        goto L25
    L21:
        r2 = Constraints.m6928getMinWidthimpl(constraints);
        goto L22
    L13:
        if (r1.getValue().intValue() == Integer.MAX_VALUE) goto L15;
        float $this$fastRoundToInt$iv = r1.getValue().floatValue() * this.fraction;
        height = Math.round($this$fastRoundToInt$iv);
        goto L19
    L15:
        height = Integer.MAX_VALUE;
        goto L19
    L5:
        if (r0.getValue().intValue() == Integer.MAX_VALUE) goto L7;
        float $this$fastRoundToInt$iv2 = r0.getValue().floatValue() * this.fraction;
        width = Math.round($this$fastRoundToInt$iv2);
        goto L10
    L7:
        width = Integer.MAX_VALUE;
        goto L10
    }
}
