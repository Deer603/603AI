package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Overscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/OverscrollModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "overscrollNode", "Landroidx/compose/ui/node/DelegatableNode;", "(Landroidx/compose/ui/node/DelegatableNode;)V", "attachIfNeeded", "", "onAttach", "onDetach", "update", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OverscrollModifierNode extends DelegatingNode {
    private DelegatableNode overscrollNode;

    public OverscrollModifierNode(DelegatableNode overscrollNode) {
        this.overscrollNode = overscrollNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        attachIfNeeded();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode it = this.overscrollNode;
        if (it == null) goto L6;
        undelegate(it);
        return;
    }

    public final void update(DelegatableNode overscrollNode) {
        DelegatableNode it = this.overscrollNode;
        if (it == null) goto L5;
        undelegate(it);
    L5:
        this.overscrollNode = overscrollNode;
        attachIfNeeded();
    }

    private final void attachIfNeeded() {
        DelegatableNode r0 = this.overscrollNode;
        boolean r1 = false;
        if (r0 == null) goto L9;
        Modifier.Node r2 = r0.getNode();
        if (r2 == null) goto L9;
        if (r2.isAttached() == true) goto L9;
        r1 = true;
    L9:
        if (r1 == false) goto L11;
        DelegatableNode r3 = this.overscrollNode;
        Intrinsics.checkNotNull(r3);
        DelegatableNode r4 = delegate(r3);
    L12:
        this.overscrollNode = r4;
        return;
    L11:
        r4 = null;
        goto L12
    }
}
