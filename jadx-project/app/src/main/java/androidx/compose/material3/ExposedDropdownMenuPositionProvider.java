package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u00128\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\u0010\u0011J2\u0010%\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\n\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "density", "Landroidx/compose/ui/unit/Density;", "topWindowInsets", "", "keyboardSignalState", "Landroidx/compose/runtime/State;", "", "verticalMargin", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "anchorBounds", "menuBounds", "(Landroidx/compose/ui/unit/Density;ILandroidx/compose/runtime/State;ILkotlin/jvm/functions/Function2;)V", "bottomToAnchorTop", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "bottomToWindowBottom", "getDensity", "()Landroidx/compose/ui/unit/Density;", "endToAnchorEnd", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "getKeyboardSignalState", "()Landroidx/compose/runtime/State;", "leftToWindowLeft", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "rightToWindowRight", "startToAnchorStart", "topToAnchorBottom", "topToWindowTop", "getTopWindowInsets", "()I", "getVerticalMargin", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final State<Unit> keyboardSignalState;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int topWindowInsets;
    private final int verticalMargin;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuPositionProvider(Density density, int topWindowInsets, State<Unit> r7, int verticalMargin, Function2<? super IntRect, ? super IntRect, Unit> r9) {
        this.density = density;
        this.topWindowInsets = topWindowInsets;
        this.keyboardSignalState = r7;
        this.verticalMargin = verticalMargin;
        this.onPositionCalculated = r9;
        this.startToAnchorStart = MenuPosition.startToAnchorStart$default(MenuPosition.INSTANCE, 0, 1, null);
        this.endToAnchorEnd = MenuPosition.endToAnchorEnd$default(MenuPosition.INSTANCE, 0, 1, null);
        this.leftToWindowLeft = MenuPosition.leftToWindowLeft$default(MenuPosition.INSTANCE, 0, 1, null);
        this.rightToWindowRight = MenuPosition.rightToWindowRight$default(MenuPosition.INSTANCE, 0, 1, null);
        this.topToAnchorBottom = MenuPosition.topToAnchorBottom$default(MenuPosition.INSTANCE, 0, 1, null);
        this.bottomToAnchorTop = MenuPosition.bottomToAnchorTop$default(MenuPosition.INSTANCE, 0, 1, null);
        this.topToWindowTop = MenuPosition.INSTANCE.topToWindowTop(this.verticalMargin);
        this.bottomToWindowBottom = MenuPosition.INSTANCE.bottomToWindowBottom(this.verticalMargin);
    }

    public /* synthetic */ ExposedDropdownMenuPositionProvider(Density $this$_init__u24lambda_u240, int r8, State r9, int r10, Function2 r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 4) == 0) goto L5;
        State r3 = null;
    L7:
        if ((r12 & 8) == 0) goto L9;
        int r4 = $this$_init__u24lambda_u240.mo370roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
    L11:
        if ((r12 & 16) == 0) goto L13;
        Function2 r5 = AnonymousClass2.INSTANCE;
    L14:
        this($this$_init__u24lambda_u240, r8, r3, r4, r5);
        return;
    L13:
        r5 = r11;
        goto L14
    L9:
        r4 = r10;
        goto L11
    L5:
        r3 = r9;
        goto L7
    }

    public final Density getDensity() {
        return this.density;
    }

    public final int getTopWindowInsets() {
        return this.topWindowInsets;
    }

    public final State<Unit> getKeyboardSignalState() {
        return this.keyboardSignalState;
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
        State<Unit> r0 = this.keyboardSignalState;
        if (r0 == null) goto L5;
        r0.getValue();
    L5:
        long windowSize2 = IntSizeKt.IntSize(IntSize.m7144getWidthimpl(windowSize), IntSize.m7143getHeightimpl(windowSize) + this.topWindowInsets);
        MenuPosition.Horizontal[] r1 = new MenuPosition.Horizontal[3];
        r1[0] = this.startToAnchorStart;
        r1[1] = this.endToAnchorEnd;
        if (IntOffset.m7101getXimpl(anchorBounds.m7125getCenternOccac()) >= (IntSize.m7144getWidthimpl(windowSize2) / 2)) goto L8;
        MenuPosition.Horizontal r2 = this.leftToWindowLeft;
    L9:
        r1[2] = r2;
        List xCandidates = CollectionsKt.listOf(r1);
        int x = 0;
        int r12 = xCandidates.size();
        int index = 0;
    L10:
        if (index >= r12) goto L19;
        int xCandidate = ((MenuPosition.Horizontal) xCandidates.get(index)).mo3017position95KtPRI(anchorBounds, windowSize2, IntSize.m7144getWidthimpl(popupContentSize), layoutDirection);
        if (index == CollectionsKt.getLastIndex(xCandidates)) goto L18;
        if (xCandidate < 0) goto L17;
        if ((IntSize.m7144getWidthimpl(popupContentSize) + xCandidate) <= IntSize.m7144getWidthimpl(windowSize2)) goto L18;
    L17:
        index = index + 1;
    L18:
        x = xCandidate;
    L19:
        MenuPosition.Vertical[] r3 = new MenuPosition.Vertical[3];
        r3[0] = this.topToAnchorBottom;
        r3[1] = this.bottomToAnchorTop;
        if (IntOffset.m7102getYimpl(anchorBounds.m7125getCenternOccac()) >= (IntSize.m7143getHeightimpl(windowSize2) / 2)) goto L22;
        MenuPosition.Vertical r4 = this.topToWindowTop;
    L23:
        r3[2] = r4;
        List yCandidates = CollectionsKt.listOf(r3);
        int y = 0;
        int index2 = 0;
        int r7 = yCandidates.size();
    L24:
        if (index2 >= r7) goto L33;
        int yCandidate = ((MenuPosition.Vertical) yCandidates.get(index2)).mo3018positionJVtK1S4(anchorBounds, windowSize2, IntSize.m7143getHeightimpl(popupContentSize));
        if (index2 == CollectionsKt.getLastIndex(yCandidates)) goto L32;
        if (yCandidate < 0) goto L31;
        if ((IntSize.m7143getHeightimpl(popupContentSize) + yCandidate) <= IntSize.m7143getHeightimpl(windowSize2)) goto L32;
    L31:
        index2 = index2 + 1;
    L32:
        y = yCandidate;
    L33:
        long menuOffset = IntOffsetKt.IntOffset(x, y);
        this.onPositionCalculated.invoke(anchorBounds, IntRectKt.m7134IntRectVbeCjmY(menuOffset, popupContentSize));
        return menuOffset;
    L22:
        r4 = this.bottomToWindowBottom;
        goto L23
    L8:
        r2 = this.rightToWindowRight;
        goto L9
    }
}
