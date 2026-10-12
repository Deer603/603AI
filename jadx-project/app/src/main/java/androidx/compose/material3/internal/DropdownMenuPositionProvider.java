package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.material3.MenuKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00128\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\u0010\u0010J2\u0010%\u001a\u00020&2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0016J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J9\u00102\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0003Jk\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u000728\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0007HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "contentOffset", "Landroidx/compose/ui/unit/DpOffset;", "density", "Landroidx/compose/ui/unit/Density;", "verticalMargin", "", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "anchorBounds", "menuBounds", "", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "bottomToAnchorTop", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "bottomToWindowBottom", "centerToAnchorTop", "getContentOffset-RKDOV3M", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "endToAnchorEnd", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "leftToWindowLeft", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "rightToWindowRight", "startToAnchorStart", "topToAnchorBottom", "topToWindowTop", "getVerticalMargin", "()I", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component1-RKDOV3M", "component2", "component3", "component4", "copy", "copy-uVxBXkw", "(JLandroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function2;)Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "equals", "", "other", "", "hashCode", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    static {
    }

    public /* synthetic */ DropdownMenuPositionProvider(long r1, Density r3, int r4, Function2 r5, DefaultConstructorMarker r6) {
        this(r1, r3, r4, r5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m3023copyuVxBXkw$default(DropdownMenuPositionProvider r6, long r7, Density r9, int r10, Function2 r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        r7 = r6.contentOffset;
    L5:
        long r1 = r7;
        if ((r12 & 2) == 0) goto L8;
        r9 = r6.density;
    L8:
        Density r3 = r9;
        if ((r12 & 4) == 0) goto L11;
        r10 = r6.verticalMargin;
    L11:
        int r4 = r10;
        if ((r12 & 8) == 0) goto L15;
        r11 = r6.onPositionCalculated;
    L15:
        return r6.m3025copyuVxBXkw(r1, r3, r4, r11);
    }

    /* JADX INFO: renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m3024component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final int component3() {
        return this.verticalMargin;
    }

    public final Function2<IntRect, IntRect, Unit> component4() {
        return this.onPositionCalculated;
    }

    /* JADX INFO: renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m3025copyuVxBXkw(long r8, Density r10, int r11, Function2<? super IntRect, ? super IntRect, Unit> r12) {
        return new DropdownMenuPositionProvider(r8, r10, r11, r12, null);
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
        if (this.verticalMargin == r1.verticalMargin) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.onPositionCalculated, r1.onPositionCalculated) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((DpOffset.m7038hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + DpOffset.m7041toStringimpl(this.contentOffset) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long contentOffset, Density density, int verticalMargin, Function2<? super IntRect, ? super IntRect, Unit> r10) {
        this.contentOffset = contentOffset;
        this.density = density;
        this.verticalMargin = verticalMargin;
        this.onPositionCalculated = r10;
        Density $this$_init__u24lambda_u241 = this.density;
        int contentOffsetX = $this$_init__u24lambda_u241.mo370roundToPx0680j_4(DpOffset.m7034getXD9Ej5fM(this.contentOffset));
        this.startToAnchorStart = MenuPosition.INSTANCE.startToAnchorStart(contentOffsetX);
        this.endToAnchorEnd = MenuPosition.INSTANCE.endToAnchorEnd(contentOffsetX);
        this.leftToWindowLeft = MenuPosition.INSTANCE.leftToWindowLeft(0);
        this.rightToWindowRight = MenuPosition.INSTANCE.rightToWindowRight(0);
        Density $this$_init__u24lambda_u242 = this.density;
        int contentOffsetY = $this$_init__u24lambda_u242.mo370roundToPx0680j_4(DpOffset.m7036getYD9Ej5fM(this.contentOffset));
        this.topToAnchorBottom = MenuPosition.INSTANCE.topToAnchorBottom(contentOffsetY);
        this.bottomToAnchorTop = MenuPosition.INSTANCE.bottomToAnchorTop(contentOffsetY);
        this.centerToAnchorTop = MenuPosition.INSTANCE.centerToAnchorTop(contentOffsetY);
        this.topToWindowTop = MenuPosition.INSTANCE.topToWindowTop(this.verticalMargin);
        this.bottomToWindowBottom = MenuPosition.INSTANCE.bottomToWindowBottom(this.verticalMargin);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long r8, Density $this$_init__u24lambda_u240, int r11, Function2 r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 4) == 0) goto L5;
        int r4 = $this$_init__u24lambda_u240.mo370roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
    L7:
        if ((r13 & 8) == 0) goto L9;
        Function2 r5 = AnonymousClass2.INSTANCE;
    L10:
        this(r8, $this$_init__u24lambda_u240, r4, r5, null);
        return;
    L9:
        r5 = r12;
        goto L10
    L5:
        r4 = r11;
        goto L7
    }

    /* JADX INFO: renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m3026getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo345calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        MenuPosition.Horizontal[] r0 = new MenuPosition.Horizontal[3];
        r0[0] = this.startToAnchorStart;
        r0[1] = this.endToAnchorEnd;
        if (IntOffset.m7101getXimpl(anchorBounds.m7125getCenternOccac()) >= (IntSize.m7144getWidthimpl(windowSize) / 2)) goto L5;
        MenuPosition.Horizontal r1 = this.leftToWindowLeft;
    L6:
        r0[2] = r1;
        List xCandidates = CollectionsKt.listOf(r0);
        int x = 0;
        int r12 = xCandidates.size();
        int index = 0;
    L7:
        if (index >= r12) goto L17;
        int xCandidate = ((MenuPosition.Horizontal) xCandidates.get(index)).mo3017position95KtPRI(anchorBounds, windowSize, IntSize.m7144getWidthimpl(popupContentSize), layoutDirection);
        if (index == CollectionsKt.getLastIndex(xCandidates)) goto L15;
        if (xCandidate < 0) goto L14;
        if ((IntSize.m7144getWidthimpl(popupContentSize) + xCandidate) <= IntSize.m7144getWidthimpl(windowSize)) goto L15;
    L14:
        index = index + 1;
    L15:
        x = xCandidate;
    L17:
        MenuPosition.Vertical[] r2 = new MenuPosition.Vertical[4];
        r2[0] = this.topToAnchorBottom;
        r2[1] = this.bottomToAnchorTop;
        r2[2] = this.centerToAnchorTop;
        if (IntOffset.m7102getYimpl(anchorBounds.m7125getCenternOccac()) >= (IntSize.m7143getHeightimpl(windowSize) / 2)) goto L20;
        MenuPosition.Vertical r3 = this.topToWindowTop;
    L21:
        r2[3] = r3;
        List yCandidates = CollectionsKt.listOf(r2);
        int y = 0;
        int index2 = 0;
        int r4 = yCandidates.size();
    L22:
        if (index2 >= r4) goto L33;
        int yCandidate = ((MenuPosition.Vertical) yCandidates.get(index2)).mo3018positionJVtK1S4(anchorBounds, windowSize, IntSize.m7143getHeightimpl(popupContentSize));
        if (index2 == CollectionsKt.getLastIndex(yCandidates)) goto L31;
        if (yCandidate < this.verticalMargin) goto L30;
        if ((IntSize.m7143getHeightimpl(popupContentSize) + yCandidate) <= (IntSize.m7143getHeightimpl(windowSize) - this.verticalMargin)) goto L31;
    L30:
        index2 = index2 + 1;
    L31:
        y = yCandidate;
    L33:
        long menuOffset = IntOffsetKt.IntOffset(x, y);
        this.onPositionCalculated.invoke(anchorBounds, IntRectKt.m7134IntRectVbeCjmY(menuOffset, popupContentSize));
        return menuOffset;
    L20:
        r3 = this.bottomToWindowBottom;
        goto L21
    L5:
        r1 = this.rightToWindowRight;
        goto L6
    }
}
