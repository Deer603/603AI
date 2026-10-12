package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ2\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\fJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003JC\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/material/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "contentOffset", "Landroidx/compose/ui/unit/DpOffset;", "density", "Landroidx/compose/ui/unit/Density;", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentOffset-RKDOV3M", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component1-RKDOV3M", "component2", "component3", "copy", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;)Landroidx/compose/material/DropdownMenuPositionProvider;", "equals", "", "other", "", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final long contentOffset;
    private final Density density;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;

    static {
    }

    public /* synthetic */ DropdownMenuPositionProvider(long r1, Density r3, Function2 r4, DefaultConstructorMarker r5) {
        this(r1, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1658copyrOJDEFc$default(DropdownMenuPositionProvider r0, long r1, Density r3, Function2 r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.contentOffset;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = r0.density;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = r0.onPositionCalculated;
    L12:
        return r0.m1660copyrOJDEFc(r1, r3, r4);
    }

    /* JADX INFO: renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m1659component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final Function2<IntRect, IntRect, Unit> component3() {
        return this.onPositionCalculated;
    }

    /* JADX INFO: renamed from: copy-rOJDEFc, reason: not valid java name */
    public final DropdownMenuPositionProvider m1660copyrOJDEFc(long r7, Density r9, Function2<? super IntRect, ? super IntRect, Unit> r10) {
        return new DropdownMenuPositionProvider(r7, r9, r10, null);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof DropdownMenuPositionProvider) == true) goto L8;
        return false;
    L8:
        DropdownMenuPositionProvider r1 = (DropdownMenuPositionProvider) r8;
        if (DpOffset.m7033equalsimpl0(this.contentOffset, r1.contentOffset) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.density, r1.density) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.onPositionCalculated, r1.onPositionCalculated) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((DpOffset.m7038hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + DpOffset.m7041toStringimpl(this.contentOffset) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long contentOffset, Density density, Function2<? super IntRect, ? super IntRect, Unit> r4) {
        this.contentOffset = contentOffset;
        this.density = density;
        this.onPositionCalculated = r4;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long r7, Density r9, Function2 r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 4) == 0) goto L5;
        Function2 r4 = AnonymousClass1.INSTANCE;
    L6:
        this(r7, r9, r4, null);
        return;
    L5:
        r4 = r10;
        goto L6
    }

    /* JADX INFO: renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m1661getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo345calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        Density $this$calculatePosition_llwVHH4_u24lambda_u240 = this.density;
        int verticalMargin = $this$calculatePosition_llwVHH4_u24lambda_u240.mo370roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        Density $this$calculatePosition_llwVHH4_u24lambda_u241 = this.density;
        int r5 = $this$calculatePosition_llwVHH4_u24lambda_u241.mo370roundToPx0680j_4(DpOffset.m7034getXD9Ej5fM(this.contentOffset));
        char r7 = 1;
        if (layoutDirection != LayoutDirection.Ltr) goto L5;
        int r6 = 1;
    L6:
        int contentOffsetX = r5 * r6;
        Density $this$calculatePosition_llwVHH4_u24lambda_u242 = this.density;
        int contentOffsetY = $this$calculatePosition_llwVHH4_u24lambda_u242.mo370roundToPx0680j_4(DpOffset.m7036getYD9Ej5fM(this.contentOffset));
        int leftToAnchorLeft = anchorBounds.getLeft() + contentOffsetX;
        int rightToAnchorRight = (anchorBounds.getRight() - IntSize.m7144getWidthimpl(popupContentSize)) + contentOffsetX;
        int rightToWindowRight = IntSize.m7144getWidthimpl(windowSize) - IntSize.m7144getWidthimpl(popupContentSize);
        char r11 = 3;
        if (layoutDirection != LayoutDirection.Ltr) goto L13;
        Integer[] r10 = new Integer[3];
        r10[0] = Integer.valueOf(leftToAnchorLeft);
        r10[1] = Integer.valueOf(rightToAnchorRight);
        if (anchorBounds.getLeft() < 0) goto L11;
        int r14 = rightToWindowRight;
    L12:
        r10[2] = Integer.valueOf(r14);
        Sequence $this$firstOrNull$iv = SequencesKt.sequenceOf(r10);
    L18:
        Iterator r15 = $this$firstOrNull$iv.iterator();
    L19:
        Object r17 = null;
        if (r15.hasNext() == false) goto L31;
        Object element$iv = r15.next();
        int it = ((Number) element$iv).intValue();
        if (it < 0) goto L26;
        char r21 = r7;
        char r20 = r11;
        if ((it + IntSize.m7144getWidthimpl(popupContentSize)) > IntSize.m7144getWidthimpl(windowSize)) goto L27;
        char r8 = r21;
    L28:
        if (r8 != 0) goto L32;
        r11 = r20;
        r7 = r21;
    L32:
        Integer r16 = (Integer) element$iv;
        if (r16 == null) goto L35;
        int x = r16.intValue();
    L36:
        int topToAnchorBottom = Math.max(anchorBounds.getBottom() + contentOffsetY, verticalMargin);
        int bottomToAnchorTop = (anchorBounds.getTop() - IntSize.m7143getHeightimpl(popupContentSize)) + contentOffsetY;
        int centerToAnchorTop = (anchorBounds.getTop() - (IntSize.m7143getHeightimpl(popupContentSize) / 2)) + contentOffsetY;
        int bottomToWindowBottom = (IntSize.m7143getHeightimpl(windowSize) - IntSize.m7143getHeightimpl(popupContentSize)) - verticalMargin;
        Integer[] r12 = new Integer[4];
        r12[0] = Integer.valueOf(topToAnchorBottom);
        r12[r21] = Integer.valueOf(bottomToAnchorTop);
        r12[2] = Integer.valueOf(centerToAnchorTop);
        r12[r20] = Integer.valueOf(bottomToWindowBottom);
        Sequence $this$firstOrNull$iv2 = SequencesKt.sequenceOf(r12);
        Iterator r18 = $this$firstOrNull$iv2.iterator();
    L38:
        if (r18.hasNext() == false) goto L50;
        Object element$iv2 = r18.next();
        int it2 = ((Number) element$iv2).intValue();
        if (it2 < verticalMargin) goto L44;
        int verticalMargin2 = verticalMargin;
        if ((it2 + IntSize.m7143getHeightimpl(popupContentSize)) > (IntSize.m7143getHeightimpl(windowSize) - verticalMargin2)) goto L45;
        char r1 = r21;
    L46:
        if (r1 != 0) goto L47;
        verticalMargin = verticalMargin2;
        goto L38
    L47:
        r17 = element$iv2;
    L45:
        r1 = 0;
        goto L46
    L44:
        verticalMargin2 = verticalMargin;
    L50:
        Integer r19 = (Integer) r17;
        if (r19 == null) goto L53;
        int y = r19.intValue();
    L54:
        this.onPositionCalculated.invoke(anchorBounds, new IntRect(x, y, IntSize.m7144getWidthimpl(popupContentSize) + x, y + IntSize.m7143getHeightimpl(popupContentSize)));
        return IntOffsetKt.IntOffset(x, y);
    L53:
        y = bottomToAnchorTop;
        goto L54
    L35:
        x = rightToAnchorRight;
    L27:
        r8 = 0;
        goto L28
    L26:
        r21 = r7;
        r20 = r11;
        goto L27
    L31:
        r21 = r7;
        r20 = r11;
        element$iv = null;
        goto L32
    L11:
        r14 = 0;
        goto L12
    L13:
        Integer[] r13 = new Integer[3];
        r13[0] = Integer.valueOf(rightToAnchorRight);
        r13[1] = Integer.valueOf(leftToAnchorLeft);
        if (anchorBounds.getRight() > IntSize.m7144getWidthimpl(windowSize)) goto L16;
        int r110 = 0;
    L17:
        r13[2] = Integer.valueOf(r110);
        $this$firstOrNull$iv = SequencesKt.sequenceOf(r13);
        goto L18
    L16:
        r110 = rightToWindowRight;
        goto L17
    L5:
        r6 = -1;
        goto L6
    }
}
