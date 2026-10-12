package androidx.compose.ui.layout;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: OnGlobalLayoutListener.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¨\u0006\n"}, d2 = {"registerOnGlobalLayoutListener", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "Landroidx/compose/ui/node/DelegatableNode;", "throttleMillis", "", "debounceMillis", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OnGlobalLayoutListenerKt {
    public static final DelegatableNode.RegistrationHandle registerOnGlobalLayoutListener(DelegatableNode $this$registerOnGlobalLayoutListener, long throttleMillis, long debounceMillis, Function1<? super RelativeLayoutBounds, Unit> r14) {
        LayoutNode layoutNode = DelegatableNodeKt.requireLayoutNode($this$registerOnGlobalLayoutListener);
        int id = layoutNode.getSemanticsId();
        RectManager rectManager = LayoutNodeKt.requireOwner(layoutNode).getRectManager();
        return rectManager.registerOnGlobalLayoutCallback(id, throttleMillis, debounceMillis, $this$registerOnGlobalLayoutListener.getNode(), r14);
    }
}
