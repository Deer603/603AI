package androidx.compose.material3.internal;

import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition;", "", "()V", "bottomToAnchorTop", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "offset", "", "bottomToWindowBottom", "margin", "centerToAnchorTop", "endToAnchorEnd", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "leftToWindowLeft", "rightToWindowRight", "startToAnchorStart", "topToAnchorBottom", "topToWindowTop", "Horizontal", "Vertical", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenuPosition {
    public static final int $stable = 0;
    public static final MenuPosition INSTANCE = null;

    /* JADX INFO: compiled from: MenuPosition.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "", "position", "", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "menuWidth", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Horizontal {
        /* JADX INFO: renamed from: position-95KtPRI */
        int mo3017position95KtPRI(IntRect r1, long r2, int r4, LayoutDirection r5);
    }

    /* JADX INFO: compiled from: MenuPosition.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Vertical;", "", "position", "", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "menuHeight", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Vertical {
        /* JADX INFO: renamed from: position-JVtK1S4 */
        int mo3018positionJVtK1S4(IntRect r1, long r2, int r4);
    }

    static {
        INSTANCE = new MenuPosition();
    }

    private MenuPosition() {
    }

    public static /* synthetic */ Horizontal startToAnchorStart$default(MenuPosition r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.startToAnchorStart(r1);
    }

    public final Horizontal startToAnchorStart(int offset) {
        return new AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getStart(), Alignment.Companion.getStart(), offset);
    }

    public static /* synthetic */ Horizontal endToAnchorEnd$default(MenuPosition r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.endToAnchorEnd(r1);
    }

    public final Horizontal endToAnchorEnd(int offset) {
        return new AnchorAlignmentOffsetPosition.Horizontal(Alignment.Companion.getEnd(), Alignment.Companion.getEnd(), offset);
    }

    public static /* synthetic */ Horizontal leftToWindowLeft$default(MenuPosition r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.leftToWindowLeft(r1);
    }

    public final Horizontal leftToWindowLeft(int margin) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getLeft(), margin);
    }

    public static /* synthetic */ Horizontal rightToWindowRight$default(MenuPosition r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.rightToWindowRight(r1);
    }

    public final Horizontal rightToWindowRight(int margin) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getRight(), margin);
    }

    public static /* synthetic */ Vertical topToAnchorBottom$default(MenuPosition r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.topToAnchorBottom(r1);
    }

    public final Vertical topToAnchorBottom(int offset) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getTop(), Alignment.Companion.getBottom(), offset);
    }

    public static /* synthetic */ Vertical bottomToAnchorTop$default(MenuPosition r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.bottomToAnchorTop(r1);
    }

    public final Vertical bottomToAnchorTop(int offset) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getBottom(), Alignment.Companion.getTop(), offset);
    }

    public static /* synthetic */ Vertical centerToAnchorTop$default(MenuPosition r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.centerToAnchorTop(r1);
    }

    public final Vertical centerToAnchorTop(int offset) {
        return new AnchorAlignmentOffsetPosition.Vertical(Alignment.Companion.getCenterVertically(), Alignment.Companion.getTop(), offset);
    }

    public static /* synthetic */ Vertical topToWindowTop$default(MenuPosition r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.topToWindowTop(r1);
    }

    public final Vertical topToWindowTop(int margin) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getTop(), margin);
    }

    public static /* synthetic */ Vertical bottomToWindowBottom$default(MenuPosition r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.bottomToWindowBottom(r1);
    }

    public final Vertical bottomToWindowBottom(int margin) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getBottom(), margin);
    }
}
