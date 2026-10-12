package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "sides", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "(Landroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "getSides-JoeWqyM", "()I", "I", "equals", "", "other", "", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", "hashCode", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets r1, int r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    private LimitInsets(WindowInsets insets, int sides) {
        this.insets = insets;
        this.sides = sides;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    /* JADX INFO: renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m679getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        if (layoutDirection != LayoutDirection.Ltr) goto L5;
        int layoutDirectionSide = WindowInsetsSides.Companion.m814getAllowLeftInLtrJoeWqyM$foundation_layout_release();
    L6:
        boolean allowLeft = WindowInsetsSides.m808hasAnybkgdKaI$foundation_layout_release(this.sides, layoutDirectionSide);
        if (allowLeft == true) goto L11;
        return 0;
    L11:
        return this.insets.getLeft(density, layoutDirection);
    L5:
        layoutDirectionSide = WindowInsetsSides.Companion.m815getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        goto L6
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        if (WindowInsetsSides.m808hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m824getTopJoeWqyM()) == true) goto L7;
        return 0;
    L7:
        return this.insets.getTop(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        if (layoutDirection != LayoutDirection.Ltr) goto L5;
        int layoutDirectionSide = WindowInsetsSides.Companion.m816getAllowRightInLtrJoeWqyM$foundation_layout_release();
    L6:
        boolean allowRight = WindowInsetsSides.m808hasAnybkgdKaI$foundation_layout_release(this.sides, layoutDirectionSide);
        if (allowRight == true) goto L11;
        return 0;
    L11:
        return this.insets.getRight(density, layoutDirection);
    L5:
        layoutDirectionSide = WindowInsetsSides.Companion.m817getAllowRightInRtlJoeWqyM$foundation_layout_release();
        goto L6
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        if (WindowInsetsSides.m808hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m818getBottomJoeWqyM()) == true) goto L7;
        return 0;
    L7:
        return this.insets.getBottom(density);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof LimitInsets) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.insets, ((LimitInsets) other).insets) == false) goto L14;
        if (WindowInsetsSides.m807equalsimpl0(this.sides, ((LimitInsets) other).sides) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public int hashCode() {
        int result = this.insets.hashCode();
        return (result * 31) + WindowInsetsSides.m809hashCodeimpl(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + WindowInsetsSides.m811toStringimpl(this.sides) + ')';
    }
}
