package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: FocusGroupNode.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u000bH\u0000\u001a\f\u0010\f\u001a\u00020\u0005*\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"getCurrentlyFocusedRect", "Landroid/graphics/Rect;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "hostView", "Landroid/view/View;", "embeddedView", "containsDescendant", "", "other", "focusInteropModifier", "Landroidx/compose/ui/Modifier;", "getEmbeddedView", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusGroupNode_androidKt {
    public static final /* synthetic */ boolean access$containsDescendant(View $receiver, View other) {
        return containsDescendant($receiver, other);
    }

    public static final /* synthetic */ Rect access$getCurrentlyFocusedRect(FocusOwner focusOwner, View hostView, View embeddedView) {
        return getCurrentlyFocusedRect(focusOwner, hostView, embeddedView);
    }

    public static final /* synthetic */ View access$getEmbeddedView(Modifier.Node $receiver) {
        return getEmbeddedView($receiver);
    }

    public static final Modifier focusInteropModifier(Modifier $this$focusInteropModifier) {
        return FocusModifierKt.focusTarget(FocusModifierKt.focusTarget($this$focusInteropModifier.then(FocusGroupPropertiesElement.INSTANCE)).then(FocusTargetPropertiesElement.INSTANCE));
    }

    private static final View getEmbeddedView(Modifier.Node $this$getEmbeddedView) {
        View r0 = DelegatableNodeKt.requireLayoutNode($this$getEmbeddedView.getNode()).getInteropView();
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("Could not fetch interop view".toString());
    }

    private static final boolean containsDescendant(View $this$containsDescendant, View other) {
        ViewParent viewParent = other.getParent();
    L3:
        if (viewParent == null) goto L9;
        if (viewParent == $this$containsDescendant.getParent()) goto L6;
        viewParent = viewParent.getParent();
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    private static final Rect getCurrentlyFocusedRect(FocusOwner focusOwner, View hostView, View embeddedView) {
        int[] hostViewOffset = new int[2];
        hostView.getLocationOnScreen(hostViewOffset);
        int[] embeddedViewOffset = new int[2];
        embeddedView.getLocationOnScreen(embeddedViewOffset);
        androidx.compose.ui.geometry.Rect focusedRect = focusOwner.getFocusRect();
        if (focusedRect != null) goto L7;
        return null;
    L7:
        return new Rect((((int) focusedRect.getLeft()) + hostViewOffset[0]) - embeddedViewOffset[0], (((int) focusedRect.getTop()) + hostViewOffset[1]) - embeddedViewOffset[1], (((int) focusedRect.getRight()) + hostViewOffset[0]) - embeddedViewOffset[0], (((int) focusedRect.getBottom()) + hostViewOffset[1]) - embeddedViewOffset[1]);
    }
}
