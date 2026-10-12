package androidx.compose.foundation;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Clickable.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\bH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"TapIndicationDelay", "", "getTapIndicationDelay", "()J", "isComposeRootInScrollableContainer", "", "Landroidx/compose/ui/node/DelegatableNode;", "isInScrollableViewGroup", "Landroid/view/View;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = 0;

    public static final boolean isComposeRootInScrollableContainer(DelegatableNode $this$isComposeRootInScrollableContainer) {
        return isInScrollableViewGroup(DelegatableNode_androidKt.requireView($this$isComposeRootInScrollableContainer));
    }

    private static final boolean isInScrollableViewGroup(View $this$isInScrollableViewGroup) {
        ViewParent p = $this$isInScrollableViewGroup.getParent();
    L3:
        if (p == null) goto L11;
        if ((p instanceof ViewGroup) == false) goto L16;
        if (((ViewGroup) p).shouldDelayChildPressedState() == true) goto L8;
        p = ((ViewGroup) p).getParent();
        goto L3
    L8:
        return true;
    L16:
        return false;
    L11:
        return false;
    }

    static {
        TapIndicationDelay = ViewConfiguration.getTapTimeout();
    }

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }
}
