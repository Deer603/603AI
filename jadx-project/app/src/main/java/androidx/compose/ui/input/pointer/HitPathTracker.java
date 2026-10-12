package androidx.compose.ui.input.pointer;

import androidx.collection.LongObjectMap;
import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0015J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u0015J\u001e\u0010#\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "rootCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "clearNodeCacheAfterDispatchedEvent", "", "dispatchCancelAfterDispatchedEvent", "dispatchingEvent", "hitPointerIdsAndNodes", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/input/pointer/Node;", "nodesToRemove", "Landroidx/compose/ui/Modifier$Node;", "removeSpecificNodesAfterDispatchedEvent", "root", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "addHitPath", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "addHitPath-QJqDSyo", "(JLjava/util/List;Z)V", "clearPreviouslyHitModifierNodeCache", "dispatchChanges", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "processCancel", "removeInvalidPointerIdsAndChanges", "", "hitNodes", "removePointerInputModifierNode", "pointerInputNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HitPathTracker {
    public static final int $stable = 0;
    private boolean clearNodeCacheAfterDispatchedEvent;
    private boolean dispatchCancelAfterDispatchedEvent;
    private boolean dispatchingEvent;
    private final MutableLongObjectMap<MutableObjectList<Node>> hitPointerIdsAndNodes;
    private final MutableObjectList<Modifier.Node> nodesToRemove;
    private boolean removeSpecificNodesAfterDispatchedEvent;
    private final NodeParent root;
    private final LayoutCoordinates rootCoordinates;

    static {
        $stable = 8;
    }

    public HitPathTracker(LayoutCoordinates rootCoordinates) {
        this.rootCoordinates = rootCoordinates;
        this.nodesToRemove = new MutableObjectList(0, 1, null);
        this.root = new NodeParent();
        this.hitPointerIdsAndNodes = new MutableLongObjectMap(10);
    }

    public static final /* synthetic */ void access$removePointerInputModifierNode(HitPathTracker $this, Modifier.Node pointerInputNode) {
        $this.removePointerInputModifierNode(pointerInputNode);
    }

    public final NodeParent getRoot$ui_release() {
        return this.root;
    }

    /* JADX INFO: renamed from: addHitPath-QJqDSyo$default, reason: not valid java name */
    public static /* synthetic */ void m5514addHitPathQJqDSyo$default(HitPathTracker r0, long r1, List r3, boolean r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L5;
        r4 = false;
    L5:
        r0.m5515addHitPathQJqDSyo(r1, r3, r4);
    }

    /* JADX INFO: renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    public final void m5515addHitPathQJqDSyo(long pointerId, List<? extends Modifier.Node> r27, boolean prunePointerIdsAndChangesNotInNodesList) {
        List<? extends Modifier.Node> r3 = r27;
        NodeParent parent = this.root;
        this.hitPointerIdsAndNodes.clear();
        boolean merging = true;
        int i = 0;
        int r7 = r3.size();
    L3:
        if (i >= r7) goto L31;
        final Modifier.Node pointerInputNode = r3.get(i);
        if (pointerInputNode.isAttached() == false) goto L29;
        pointerInputNode.setDetachedListener$ui_release(new HitPathTracker$addHitPath$1(this, pointerInputNode));
        if (merging == false) goto L24;
        MutableVector<Node> r12 = parent.getChildren();
        Object[] content$iv = r12.content;
        int size$iv = r12.getSize();
        int i$iv = 0;
    L9:
        if (i$iv >= size$iv) goto L14;
        Object item$iv = content$iv[i$iv];
        Node it = (Node) item$iv;
        if (Intrinsics.areEqual(it.getModifierNode(), pointerInputNode) == true) goto L15;
        i$iv = i$iv + 1;
    L15:
        Node node = (Node) item$iv;
        if (node == null) goto L22;
        node.markIsIn();
        node.getPointerIds().add(pointerId);
        MutableLongObjectMap<MutableObjectList<Node>> r9 = this.hitPointerIdsAndNodes;
        MutableObjectList<Node> r15 = r9.get(pointerId);
        if (r15 != null) goto L21;
        MutableObjectList<Node> r4 = new MutableObjectList(0, 1, null);
        r9.set(pointerId, r4);
        r15 = r4;
    L21:
        r15.add(node);
        Node parent2 = node;
        parent = parent2;
        merging = merging;
        goto L29
    L22:
        merging = false;
        goto L24
    L14:
        item$iv = null;
    L24:
        Node node2 = new Node(pointerInputNode);
        node2.getPointerIds().add(pointerId);
        MutableLongObjectMap<MutableObjectList<Node>> r5 = this.hitPointerIdsAndNodes;
        MutableObjectList<Node> r13 = r5.get(pointerId);
        if (r13 != null) goto L27;
        MutableObjectList<Node> r16 = new MutableObjectList(0, 1, null);
        r5.set(pointerId, r16);
        r13 = r16;
    L27:
        r13.add(node2);
        parent.getChildren().add(node2);
        parent = node2;
    L29:
        i = i + 1;
        r3 = r27;
        goto L3
    L31:
        if (prunePointerIdsAndChangesNotInNodesList == false) goto L55;
        LongObjectMap this_$iv = this.hitPointerIdsAndNodes;
        int $i$f$forEach = 0;
        long[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L67;
    L34:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L49;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L37:
        if (j$iv$iv >= bitCount$iv$iv) goto L46;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L41;
        boolean r17 = true;
    L42:
        if (r17 == false) goto L45;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        long key = k$iv[index$iv$iv];
        removeInvalidPointerIdsAndChanges(key, (MutableObjectList) v$iv[index$iv$iv]);
    L45:
        slot$iv$iv = slot$iv$iv >> r2;
        j$iv$iv = j$iv$iv + 1;
        this_$iv = this_$iv;
        r2 = r2;
        $i$f$forEach = $i$f$forEach;
        goto L37
    L41:
        r17 = false;
        goto L42
    L46:
        LongObjectMap this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        if (bitCount$iv$iv != r2) goto L68;
    L50:
        if (i$iv$iv == lastIndex$iv$iv) goto L69;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        goto L34
    L69:
        return;
    L68:
        return;
    L49:
        this_$iv2 = this_$iv;
        $i$f$forEach2 = $i$f$forEach;
        goto L50
    L67:
        return;
    }

    private final void removePointerInputModifierNode(Modifier.Node pointerInputNode) {
        if (this.dispatchingEvent == false) goto L6;
        this.removeSpecificNodesAfterDispatchedEvent = true;
        this.nodesToRemove.add(pointerInputNode);
        return;
    L6:
        this.root.removePointerInputModifierNode(pointerInputNode);
    }

    private final void removeInvalidPointerIdsAndChanges(long pointerId, MutableObjectList<Node> r4) {
        this.root.removeInvalidPointerIdsAndChanges(pointerId, r4);
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker r0, InternalPointerEvent r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        return r0.dispatchChanges(r1, r2);
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        boolean changed = this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, isInBounds);
        if (changed == true) goto L5;
        return false;
    L5:
        boolean dispatchHit = true;
        this.dispatchingEvent = true;
        boolean dispatchHit2 = this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, isInBounds);
        if (this.root.dispatchFinalEventPass(internalPointerEvent) == true) goto L10;
        if (dispatchHit2 == true) goto L10;
        dispatchHit = false;
    L10:
        this.dispatchingEvent = false;
        if (this.removeSpecificNodesAfterDispatchedEvent == false) goto L18;
        this.removeSpecificNodesAfterDispatchedEvent = false;
        int i = 0;
        int r4 = this.nodesToRemove.getSize();
    L13:
        MutableObjectList<Modifier.Node> r5 = this.nodesToRemove;
        if (i >= r4) goto L16;
        removePointerInputModifierNode(r5.get(i));
        i = i + 1;
        goto L13
    L16:
        r5.clear();
    L18:
        if (this.dispatchCancelAfterDispatchedEvent == false) goto L21;
        this.dispatchCancelAfterDispatchedEvent = false;
        processCancel();
    L21:
        if (this.clearNodeCacheAfterDispatchedEvent == false) goto L23;
        this.clearNodeCacheAfterDispatchedEvent = false;
        clearPreviouslyHitModifierNodeCache();
    L23:
        return dispatchHit;
    }

    public final void clearPreviouslyHitModifierNodeCache() {
        if (this.clearNodeCacheAfterDispatchedEvent == false) goto L6;
        this.clearNodeCacheAfterDispatchedEvent = true;
        return;
    L6:
        this.root.clear();
    }

    public final void processCancel() {
        if (this.dispatchingEvent == false) goto L6;
        this.dispatchCancelAfterDispatchedEvent = true;
        return;
    L6:
        this.root.dispatchCancel();
        clearPreviouslyHitModifierNodeCache();
    }
}
