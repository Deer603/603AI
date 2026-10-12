package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DelegatableNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"requireView", "Landroid/view/View;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DelegatableNode_androidKt {
    public static final View requireView(DelegatableNode $this$requireView) {
        boolean value$iv = $this$requireView.getNode().isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("Cannot get View because the Modifier node is not currently attached.");
    L5:
        Object r0 = LayoutNodeKt.requireOwner(DelegatableNodeKt.requireLayoutNode($this$requireView));
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.view.View");
        return (View) r0;
    }
}
