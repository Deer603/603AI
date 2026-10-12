package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: OnLayoutRectChangedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007\u001a.\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\f"}, d2 = {"onLayoutRectChanged", "Landroidx/compose/ui/Modifier;", "throttleMillis", "", "debounceMillis", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "registerOnLayoutRectChanged", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OnLayoutRectChangedModifierKt {
    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier r6, long r7, long r9, Function1 r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        long r1 = 0;
    L7:
        if ((r12 & 2) == 0) goto L9;
        long r3 = 64;
    L11:
        return onLayoutRectChanged(r6, r1, r3, r11);
    L9:
        r3 = r9;
        goto L11
    L5:
        r1 = r7;
        goto L7
    }

    public static final Modifier onLayoutRectChanged(Modifier $this$onLayoutRectChanged, long throttleMillis, long debounceMillis, Function1<? super RelativeLayoutBounds, Unit> r11) {
        return $this$onLayoutRectChanged.then(new OnLayoutRectChangedElement(throttleMillis, debounceMillis, r11));
    }

    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(DelegatableNode $this$registerOnLayoutRectChanged, long throttleMillis, long debounceMillis, Function1<? super RelativeLayoutBounds, Unit> r14) {
        LayoutNode layoutNode = DelegatableNodeKt.requireLayoutNode($this$registerOnLayoutRectChanged);
        int id = layoutNode.getSemanticsId();
        RectManager rectManager = LayoutNodeKt.requireOwner(layoutNode).getRectManager();
        return rectManager.registerOnRectChangedCallback(id, throttleMillis, debounceMillis, $this$registerOnLayoutRectChanged, r14);
    }
}
