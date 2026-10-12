package androidx.compose.ui.layout;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"view", "Landroid/view/View;", "Landroidx/compose/ui/layout/LayoutInfo;", "getView", "(Landroidx/compose/ui/layout/LayoutInfo;)Landroid/view/View;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutInfo_androidKt {
    public static final View getView(LayoutInfo $this$view) {
        Intrinsics.checkNotNull($this$view, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutNode");
        Object r0 = ((LayoutNode) $this$view).getOwner$ui_release();
        if ((r0 instanceof View) == true) goto L7;
        return null;
    L7:
        return (View) r0;
    }
}
