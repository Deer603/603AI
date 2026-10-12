package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J.\u0010\u0019\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u001e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "()V", "children", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/Node;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "removeMatchingPointerInputModifierNodeList", "Landroidx/collection/MutableObjectList;", "buildCache", "", "changes", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "parentCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clear", "dispatchCancel", "dispatchFinalEventPass", "dispatchMainEventPass", "removeInvalidPointerIdsAndChanges", "pointerIdValue", "", "hitNodes", "removePointerInputModifierNode", "pointerInputModifierNode", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class NodeParent {
    public static final int $stable = 0;
    private final MutableVector<Node> children;
    private final MutableObjectList<NodeParent> removeMatchingPointerInputModifierNodeList;

    static {
        $stable = 8;
    }

    public NodeParent() {
        this.children = new MutableVector(new Node[16], 0);
        this.removeMatchingPointerInputModifierNodeList = new MutableObjectList(10);
    }

    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public boolean buildCache(LongSparseArray<PointerInputChange> r10, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        boolean changed = false;
        MutableVector<Node> r1 = this.children;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L12;
        Node it = (Node) content$iv[i$iv];
        if (it.buildCache(r10, parentCoordinates, internalPointerEvent, isInBounds) == true) goto L9;
        if (changed == true) goto L9;
        boolean r8 = false;
    L10:
        changed = r8;
        i$iv = i$iv + 1;
    L9:
        r8 = true;
        goto L10
    L12:
        return changed;
    }

    public boolean dispatchMainEventPass(LongSparseArray<PointerInputChange> r10, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        boolean dispatched = false;
        MutableVector<Node> r1 = this.children;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L12;
        Node it = (Node) content$iv[i$iv];
        if (it.dispatchMainEventPass(r10, parentCoordinates, internalPointerEvent, isInBounds) == true) goto L9;
        if (dispatched == true) goto L9;
        boolean r8 = false;
    L10:
        dispatched = r8;
        i$iv = i$iv + 1;
    L9:
        r8 = true;
        goto L10
    L12:
        return dispatched;
    }

    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        boolean dispatched = false;
        MutableVector<Node> r1 = this.children;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L11;
        Node it = (Node) content$iv[i$iv];
        if (it.dispatchFinalEventPass(internalPointerEvent) == true) goto L9;
        if (dispatched == true) goto L9;
        boolean r8 = false;
    L10:
        dispatched = r8;
        i$iv = i$iv + 1;
    L9:
        r8 = true;
        goto L10
    L11:
        cleanUpHits(internalPointerEvent);
        return dispatched;
    }

    public void dispatchCancel() {
        MutableVector<Node> r0 = this.children;
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L3:
        if (i$iv >= size$iv) goto L6;
        Node it = (Node) content$iv[i$iv];
        it.dispatchCancel();
        i$iv = i$iv + 1;
        goto L3
    }

    public void removePointerInputModifierNode(Modifier.Node pointerInputModifierNode) {
        this.removeMatchingPointerInputModifierNodeList.clear();
        this.removeMatchingPointerInputModifierNodeList.add(this);
    L4:
        if (this.removeMatchingPointerInputModifierNodeList.isNotEmpty() == false) goto L12;
        NodeParent parent = this.removeMatchingPointerInputModifierNodeList.removeAt(this.removeMatchingPointerInputModifierNodeList.getSize() - 1);
        int index = 0;
    L7:
        if (index >= parent.children.getSize()) goto L4;
        Node child = parent.children.content[index];
        if (Intrinsics.areEqual(child.getModifierNode(), pointerInputModifierNode) == true) goto L10;
        this.removeMatchingPointerInputModifierNodeList.add(child);
        index = index + 1;
        goto L7
    L10:
        parent.children.remove(child);
        child.dispatchCancel();
        goto L7
    }

    public final void clear() {
        this.children.clear();
    }

    public void removeInvalidPointerIdsAndChanges(long pointerIdValue, MutableObjectList<Node> r10) {
        MutableVector<Node> r0 = this.children;
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L3:
        if (i$iv >= size$iv) goto L6;
        Node it = (Node) content$iv[i$iv];
        it.removeInvalidPointerIdsAndChanges(pointerIdValue, r10);
        i$iv = i$iv + 1;
        goto L3
    }

    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        int i = this.children.getSize();
    L3:
        i = i - 1;
        if ((-1) >= i) goto L9;
        Node child = this.children.content[i];
        if (child.getPointerIds().isEmpty() == false) goto L3;
        this.children.removeAt(i);
        goto L3
    }
}
