package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: NestedScrollNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b*\u0002H\u0007H\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"nestedScrollModifierNode", "Landroidx/compose/ui/node/DelegatableNode;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "findNearestAttachedAncestor", "T", "Landroidx/compose/ui/node/TraversableNode;", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NestedScrollNodeKt {
    public static final /* synthetic */ TraversableNode access$findNearestAttachedAncestor(TraversableNode $receiver) {
        return findNearestAttachedAncestor($receiver);
    }

    public static final DelegatableNode nestedScrollModifierNode(NestedScrollConnection connection, NestedScrollDispatcher dispatcher) {
        return new NestedScrollNode(connection, dispatcher);
    }

    private static final <T extends TraversableNode> T findNearestAttachedAncestor(T r2) {
        final Ref.ObjectRef node = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(r2, new AnonymousClass1(node));
        return (T) node.element;
    }
}
