package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: FocusInteropUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000\u001a%\u0010\u000b\u001a\u00020\f*\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"toFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "androidDirection", "", "toLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "androidLayoutDirection", "calculateBoundingRectRelativeTo", "Landroidx/compose/ui/geometry/Rect;", "Landroid/view/View;", "view", "requestInteropFocus", "", "direction", "rect", "Landroid/graphics/Rect;", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "toAndroidFocusDirection", "toAndroidFocusDirection-3ESFkO8", "(I)Ljava/lang/Integer;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusInteropUtils_androidKt {
    public static final FocusDirection toFocusDirection(int androidDirection) {
        switch(androidDirection) {
            case 1: goto L10;
            case 2: goto L16;
            case 17: goto L15;
            case 33: goto L14;
            case 66: goto L13;
            case 130: goto L12;
            default: goto L3;
        };
    L3:
        return null;
    L12:
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4013getDowndhqQ8s());
    L13:
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4019getRightdhqQ8s());
    L14:
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4020getUpdhqQ8s());
    L15:
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4016getLeftdhqQ8s());
    L16:
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4017getNextdhqQ8s());
    L10:
        return FocusDirection.m4006boximpl(FocusDirection.Companion.m4018getPreviousdhqQ8s());
    }

    /* JADX INFO: renamed from: toAndroidFocusDirection-3ESFkO8, reason: not valid java name */
    public static final Integer m4021toAndroidFocusDirection3ESFkO8(int $this$toAndroidFocusDirection_u2d3ESFkO8) {
        if (FocusDirection.m4009equalsimpl0($this$toAndroidFocusDirection_u2d3ESFkO8, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L6;
        return 33;
    L6:
        if (FocusDirection.m4009equalsimpl0($this$toAndroidFocusDirection_u2d3ESFkO8, FocusDirection.Companion.m4013getDowndhqQ8s()) == false) goto L9;
        return 130;
    L9:
        if (FocusDirection.m4009equalsimpl0($this$toAndroidFocusDirection_u2d3ESFkO8, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L12;
        return 17;
    L12:
        if (FocusDirection.m4009equalsimpl0($this$toAndroidFocusDirection_u2d3ESFkO8, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L15;
        return 66;
    L15:
        if (FocusDirection.m4009equalsimpl0($this$toAndroidFocusDirection_u2d3ESFkO8, FocusDirection.Companion.m4017getNextdhqQ8s()) == false) goto L18;
        return 2;
    L18:
        if (FocusDirection.m4009equalsimpl0($this$toAndroidFocusDirection_u2d3ESFkO8, FocusDirection.Companion.m4018getPreviousdhqQ8s()) == true) goto L27;
        return null;
    L27:
        return 1;
    }

    public static final LayoutDirection toLayoutDirection(int androidLayoutDirection) {
        switch(androidLayoutDirection) {
            case 0: goto L6;
            case 1: goto L8;
            default: goto L3;
        };
    L3:
        return null;
    L8:
        return LayoutDirection.Rtl;
    L6:
        return LayoutDirection.Ltr;
    }

    public static final Rect calculateBoundingRectRelativeTo(View $this$calculateBoundingRectRelativeTo, View view) {
        $this$calculateBoundingRectRelativeTo.getLocationInWindow(FocusInteropUtils.Companion.getTempCoordinates());
        int xInWindow = FocusInteropUtils.Companion.getTempCoordinates()[0];
        int yInWindow = FocusInteropUtils.Companion.getTempCoordinates()[1];
        view.getLocationInWindow(FocusInteropUtils.Companion.getTempCoordinates());
        int targetX = FocusInteropUtils.Companion.getTempCoordinates()[0];
        int targetY = FocusInteropUtils.Companion.getTempCoordinates()[1];
        float x = xInWindow - targetX;
        float y = yInWindow - targetY;
        return new Rect(x, y, $this$calculateBoundingRectRelativeTo.getWidth() + x, $this$calculateBoundingRectRelativeTo.getHeight() + y);
    }

    public static final boolean requestInteropFocus(View $this$requestInteropFocus, Integer direction, android.graphics.Rect rect) {
        if (direction != null) goto L5;
        return $this$requestInteropFocus.requestFocus();
    L5:
        if (($this$requestInteropFocus instanceof ViewGroup) == true) goto L8;
        return $this$requestInteropFocus.requestFocus(direction.intValue(), rect);
    L8:
        if (((ViewGroup) $this$requestInteropFocus).isFocused() == false) goto L11;
        return true;
    L11:
        if (((ViewGroup) $this$requestInteropFocus).isFocusable() == false) goto L16;
        if ($this$requestInteropFocus.hasFocus() == true) goto L16;
        return $this$requestInteropFocus.requestFocus(direction.intValue(), rect);
    L16:
        if (($this$requestInteropFocus instanceof AndroidComposeView) == true) goto L36;
        if (rect == null) goto L24;
        View r0 = FocusFinder.getInstance().findNextFocusFromRect((ViewGroup) $this$requestInteropFocus, rect, direction.intValue());
        if (r0 == null) goto L38;
        return r0.requestFocus(direction.intValue(), rect);
    L38:
        return $this$requestInteropFocus.requestFocus(direction.intValue(), rect);
    L24:
        if ($this$requestInteropFocus.hasFocus() == false) goto L26;
        View focusedView = $this$requestInteropFocus.findFocus();
    L27:
        View r1 = FocusFinder.getInstance().findNextFocus((ViewGroup) $this$requestInteropFocus, focusedView, direction.intValue());
        if (r1 == null) goto L31;
        return r1.requestFocus(direction.intValue());
    L31:
        return $this$requestInteropFocus.requestFocus(direction.intValue());
    L26:
        focusedView = null;
        goto L27
    L36:
        return $this$requestInteropFocus.requestFocus(direction.intValue(), rect);
    }
}
