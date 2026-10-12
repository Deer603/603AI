package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0004HÂ\u0003J\u0016\u0010\u0016\u001a\u00020\u0006HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\tJ'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0015\u0010#\u001a\u00020$*\u00020$2\u0006\u0010%\u001a\u00020&H\u0097\u0001J\r\u0010'\u001a\u00020$*\u00020$H\u0097\u0001R\u001c\u0010\u0005\u001a\u00020\u0006X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/foundation/layout/BoxScope;", "density", "Landroidx/compose/ui/unit/Density;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstraints-msEJaDk", "()J", "J", "maxHeight", "Landroidx/compose/ui/unit/Dp;", "getMaxHeight-D9Ej5fM", "()F", "maxWidth", "getMaxWidth-D9Ej5fM", "minHeight", "getMinHeight-D9Ej5fM", "minWidth", "getMinWidth-D9Ej5fM", "component1", "component2", "component2-msEJaDk", "copy", "copy-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "equals", "", "other", "", "hashCode", "", "toString", "", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "matchParentSize", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density r1, long r2, DefaultConstructorMarker r4) {
        this(r1, r2);
    }

    private final Density component1() {
        return this.density;
    }

    /* JADX INFO: renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m635copy0kLqBqw$default(BoxWithConstraintsScopeImpl r0, Density r1, long r2, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.density;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.constraints;
    L9:
        return r0.m637copy0kLqBqw(r1, r2);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier r2, Alignment r3) {
        return this.$$delegate_0.align(r2, r3);
    }

    /* JADX INFO: renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m636component2msEJaDk() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m637copy0kLqBqw(Density r3, long r4) {
        return new BoxWithConstraintsScopeImpl(r3, r4, null);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BoxWithConstraintsScopeImpl) == true) goto L8;
        return false;
    L8:
        BoxWithConstraintsScopeImpl r1 = (BoxWithConstraintsScopeImpl) r8;
        if (Intrinsics.areEqual(this.density, r1.density) == true) goto L12;
        return false;
    L12:
        if (Constraints.m6919equalsimpl0(this.constraints, r1.constraints) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m6929hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier r2) {
        return this.$$delegate_0.matchParentSize(r2);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + Constraints.m6931toStringimpl(this.constraints) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density, long constraints) {
        this.density = density;
        this.constraints = constraints;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo630getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM */
    public float mo634getMinWidthD9Ej5fM() {
        Density $this$getMinWidth_D9Ej5fM_u24lambda_u240 = this.density;
        return $this$getMinWidth_D9Ej5fM_u24lambda_u240.mo373toDpu2uoSUM(Constraints.m6928getMinWidthimpl(mo630getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM */
    public float mo632getMaxWidthD9Ej5fM() {
        Density $this$getMaxWidth_D9Ej5fM_u24lambda_u241 = this.density;
        if (Constraints.m6922getHasBoundedWidthimpl(mo630getConstraintsmsEJaDk()) == false) goto L7;
        return $this$getMaxWidth_D9Ej5fM_u24lambda_u241.mo373toDpu2uoSUM(Constraints.m6926getMaxWidthimpl(mo630getConstraintsmsEJaDk()));
    L7:
        return Dp.Companion.m6992getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM */
    public float mo633getMinHeightD9Ej5fM() {
        Density $this$getMinHeight_D9Ej5fM_u24lambda_u242 = this.density;
        return $this$getMinHeight_D9Ej5fM_u24lambda_u242.mo373toDpu2uoSUM(Constraints.m6927getMinHeightimpl(mo630getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM */
    public float mo631getMaxHeightD9Ej5fM() {
        Density $this$getMaxHeight_D9Ej5fM_u24lambda_u243 = this.density;
        if (Constraints.m6921getHasBoundedHeightimpl(mo630getConstraintsmsEJaDk()) == false) goto L7;
        return $this$getMaxHeight_D9Ej5fM_u24lambda_u243.mo373toDpu2uoSUM(Constraints.m6925getMaxHeightimpl(mo630getConstraintsmsEJaDk()));
    L7:
        return Dp.Companion.m6992getInfinityD9Ej5fM();
    }
}
