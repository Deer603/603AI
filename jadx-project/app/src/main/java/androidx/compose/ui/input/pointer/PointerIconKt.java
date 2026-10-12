package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a(\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"pointerHoverIcon", "Landroidx/compose/ui/Modifier;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "overrideDescendants", "", "stylusHoverIcon", "touchBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PointerIconKt {
    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier r0, PointerIcon r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return pointerHoverIcon(r0, r1, r2);
    }

    public static final Modifier pointerHoverIcon(Modifier $this$pointerHoverIcon, PointerIcon icon, boolean overrideDescendants) {
        return $this$pointerHoverIcon.then(new PointerHoverIconModifierElement(icon, overrideDescendants));
    }

    public static /* synthetic */ Modifier stylusHoverIcon$default(Modifier r0, PointerIcon r1, boolean r2, DpTouchBoundsExpansion r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = null;
    L9:
        return stylusHoverIcon(r0, r1, r2, r3);
    }

    public static final Modifier stylusHoverIcon(Modifier $this$stylusHoverIcon, PointerIcon icon, boolean overrideDescendants, DpTouchBoundsExpansion touchBoundsExpansion) {
        return $this$stylusHoverIcon.then(new StylusHoverIconModifierElement(icon, overrideDescendants, touchBoundsExpansion));
    }
}
