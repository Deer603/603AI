package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J,\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/BoxMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "alignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "(Landroidx/compose/ui/Alignment;Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BoxMeasurePolicy implements MeasurePolicy {
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    private final Alignment component1() {
        return this.alignment;
    }

    private final boolean component2() {
        return this.propagateMinConstraints;
    }

    public static /* synthetic */ BoxMeasurePolicy copy$default(BoxMeasurePolicy r0, Alignment r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.alignment;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.propagateMinConstraints;
    L9:
        return r0.copy(r1, r2);
    }

    public final BoxMeasurePolicy copy(Alignment r2, boolean r3) {
        return new BoxMeasurePolicy(r2, r3);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof BoxMeasurePolicy) == true) goto L8;
        return false;
    L8:
        BoxMeasurePolicy r1 = (BoxMeasurePolicy) r6;
        if (Intrinsics.areEqual(this.alignment, r1.alignment) == true) goto L12;
        return false;
    L12:
        if (this.propagateMinConstraints == r1.propagateMinConstraints) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }

    public BoxMeasurePolicy(Alignment alignment, boolean propagateMinConstraints) {
        this.alignment = alignment;
        this.propagateMinConstraints = propagateMinConstraints;
    }

    public static final /* synthetic */ Alignment access$getAlignment$p(BoxMeasurePolicy $this) {
        return $this.alignment;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(final MeasureScope $this$measure_u2d3p2s80s, final List<? extends Measurable> r20, long constraints) {
        if (r20.isEmpty() == false) goto L7;
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, Constraints.m6928getMinWidthimpl(constraints), Constraints.m6927getMinHeightimpl(constraints), null, BoxMeasurePolicy$measure$1.INSTANCE, 4, null);
    L7:
        if (this.propagateMinConstraints == false) goto L9;
        long r1 = constraints;
    L10:
        long contentConstraints = r1;
        if (r20.size() != 1) goto L18;
        final Measurable measurable = r20.get(0);
        if (BoxKt.access$getMatchesParentSize(measurable) == true) goto L15;
        Placeable placeable = measurable.mo5714measureBRTryo0(contentConstraints);
        int boxWidth = Math.max(Constraints.m6928getMinWidthimpl(constraints), placeable.getWidth());
        final int boxHeight = Math.max(Constraints.m6927getMinHeightimpl(constraints), placeable.getHeight());
        int boxHeight2 = boxWidth;
    L16:
        final int boxWidth2 = boxHeight2;
        final Placeable placeable2 = placeable;
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, boxWidth2, boxHeight, null, new BoxMeasurePolicy$measure$2(placeable2, measurable, $this$measure_u2d3p2s80s, boxWidth2, boxHeight, this), 4, null);
    L15:
        int boxWidth3 = Constraints.m6928getMinWidthimpl(constraints);
        int boxHeight3 = Constraints.m6927getMinHeightimpl(constraints);
        placeable = measurable.mo5714measureBRTryo0(Constraints.Companion.m6936fixedJhjzzOo(Constraints.m6928getMinWidthimpl(constraints), Constraints.m6927getMinHeightimpl(constraints)));
        boxHeight = boxHeight3;
        boxHeight2 = boxWidth3;
        goto L16
    L18:
        final Placeable[] placeables = new Placeable[r20.size()];
        final Ref.IntRef boxWidth4 = new Ref.IntRef();
        boxWidth4.element = Constraints.m6928getMinWidthimpl(constraints);
        final Ref.IntRef boxHeight4 = new Ref.IntRef();
        boxHeight4.element = Constraints.m6927getMinHeightimpl(constraints);
        int r11 = r20.size();
        int index$iv = 0;
        int index$iv2 = 0;
    L19:
        if (index$iv2 >= r11) goto L26;
        Object item$iv = r20.get(index$iv2);
        Measurable measurable2 = (Measurable) item$iv;
        int index = index$iv2;
        if (BoxKt.access$getMatchesParentSize(measurable2) == true) goto L23;
        Placeable placeable3 = measurable2.mo5714measureBRTryo0(contentConstraints);
        placeables[index] = placeable3;
        boxWidth4.element = Math.max(boxWidth4.element, placeable3.getWidth());
        boxHeight4.element = Math.max(boxHeight4.element, placeable3.getHeight());
    L24:
        index$iv2 = index$iv2 + 1;
        goto L19
    L23:
        index$iv = 1;
        goto L24
    L26:
        if (index$iv == 0) goto L43;
        if (boxWidth4.element == Integer.MAX_VALUE) goto L30;
        int r0 = boxWidth4.element;
    L32:
        if (boxHeight4.element == Integer.MAX_VALUE) goto L34;
        int r2 = boxHeight4.element;
    L35:
        long matchParentSizeConstraints = ConstraintsKt.Constraints(r0, boxWidth4.element, r2, boxHeight4.element);
        int index$iv3 = 0;
        int r12 = r20.size();
    L36:
        if (index$iv3 >= r12) goto L43;
        Object item$iv2 = r20.get(index$iv3);
        Measurable measurable3 = (Measurable) item$iv2;
        int index2 = index$iv3;
        if (BoxKt.access$getMatchesParentSize(measurable3) == false) goto L40;
        placeables[index2] = measurable3.mo5714measureBRTryo0(matchParentSizeConstraints);
    L40:
        index$iv3 = index$iv3 + 1;
        goto L36
    L34:
        r2 = 0;
        goto L35
    L30:
        r0 = 0;
    L43:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, boxWidth4.element, boxHeight4.element, null, new BoxMeasurePolicy$measure$5(placeables, r20, $this$measure_u2d3p2s80s, boxWidth4, boxHeight4, this), 4, null);
    L9:
        r1 = Constraints.m6914constructorimpl(constraints & ConstraintsKt.MaxDimensionsAndFocusMask);
        goto L10
    }
}
