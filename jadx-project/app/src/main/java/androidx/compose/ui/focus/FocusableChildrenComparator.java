package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "pathFromRoot", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {
    public static final FocusableChildrenComparator INSTANCE = null;

    static {
        INSTANCE = new FocusableChildrenComparator();
    }

    private FocusableChildrenComparator() {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(FocusTargetNode r3, FocusTargetNode r4) {
        return compare2(r3, r4);
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(FocusTargetNode a, FocusTargetNode b) {
        if (FocusTraversalKt.isEligibleForFocusSearch(a) == false) goto L21;
        if (FocusTraversalKt.isEligibleForFocusSearch(b) == false) goto L21;
        LayoutNode layoutNode1 = DelegatableNodeKt.requireLayoutNode(a);
        LayoutNode layoutNode2 = DelegatableNodeKt.requireLayoutNode(b);
        if (Intrinsics.areEqual(layoutNode1, layoutNode2) == false) goto L10;
        return 0;
    L10:
        MutableVector<LayoutNode> r1 = pathFromRoot(layoutNode1);
        MutableVector<LayoutNode> r4 = pathFromRoot(layoutNode2);
        int depth = 0;
        int r2 = Math.min(r1.getSize() - 1, r4.getSize() - 1);
        if (0 > r2) goto L19;
    L13:
        if (Intrinsics.areEqual(r1.content[depth], r4.content[depth]) == false) goto L15;
        if (depth == r2) goto L19;
        depth = depth + 1;
        goto L13
    L15:
        return Intrinsics.compare(r1.content[depth].getPlaceOrder$ui_release(), r4.content[depth].getPlaceOrder$ui_release());
    L19:
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    L21:
        if (FocusTraversalKt.isEligibleForFocusSearch(a) == false) goto L25;
        return -1;
    L25:
        if (FocusTraversalKt.isEligibleForFocusSearch(b) == false) goto L27;
        return 1;
    L27:
        return 0;
    }

    private final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> r3 = new MutableVector(new LayoutNode[16], 0);
        LayoutNode current = layoutNode;
    L3:
        if (current == null) goto L5;
        r3.add(0, current);
        current = current.getParent$ui_release();
        goto L3
    L5:
        return r3;
    }
}
