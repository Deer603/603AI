package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SlotWriter;
import kotlin.Metadata;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a(\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002\u001a(\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\f\u001a\u00020\u0001H\u0002*\f\b\u0000\u0010\r\"\u00020\u00012\u00020\u0001¨\u0006\u000e"}, d2 = {"currentNodeIndex", "", "slots", "Landroidx/compose/runtime/SlotWriter;", "positionToInsert", "anchor", "Landroidx/compose/runtime/Anchor;", "applier", "Landroidx/compose/runtime/Applier;", "", "positionToParentOf", "", "index", "IntParameter", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OperationKt {
    public static final /* synthetic */ int access$positionToInsert(SlotWriter slots, Anchor anchor, Applier applier) {
        return positionToInsert(slots, anchor, applier);
    }

    public static final /* synthetic */ void access$positionToParentOf(SlotWriter slots, Applier applier, int index) {
        positionToParentOf(slots, applier, index);
    }

    private static final void positionToParentOf(SlotWriter slots, Applier<Object> r2, int index) {
    L3:
        if (slots.indexInParent(index) == true) goto L8;
        slots.skipToGroupEnd();
        if (slots.isNode(slots.getParent()) == false) goto L7;
        r2.up();
    L7:
        slots.endGroup();
        goto L3
    }

    private static final int currentNodeIndex(SlotWriter slots) {
        int original = slots.getCurrentGroup();
        int current = slots.getParent();
    L3:
        if (current < 0) goto L7;
        if (slots.isNode(current) == true) goto L7;
        current = slots.parent(current);
    L7:
        int index = 0;
        int current2 = current + 1;
    L8:
        if (current2 >= original) goto L20;
        if (slots.indexInGroup(original, current2) == true) goto L12;
        if (slots.isNode(current2) == false) goto L18;
        int r4 = 1;
    L19:
        index = index + r4;
        current2 = current2 + slots.groupSize(current2);
        goto L8
    L18:
        r4 = slots.nodeCount(current2);
        goto L19
    L12:
        if (slots.isNode(current2) == false) goto L14;
        index = 0;
    L14:
        current2 = current2 + 1;
        goto L8
    L20:
        return index;
    }

    private static final int positionToInsert(SlotWriter slots, Anchor anchor, Applier<Object> r10) {
        int destination = slots.anchorIndex(anchor);
        boolean value$iv = true;
        if (slots.getCurrentGroup() >= destination) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L9:
        positionToParentOf(slots, r10, destination);
        int nodeIndex = currentNodeIndex(slots);
    L11:
        if (slots.getCurrentGroup() >= destination) goto L20;
        if (slots.indexInCurrentGroup(destination) == true) goto L15;
        nodeIndex = nodeIndex + slots.skipGroup();
        goto L11
    L15:
        if (slots.isNode() == false) goto L17;
        r10.down(slots.node(slots.getCurrentGroup()));
        nodeIndex = 0;
    L17:
        slots.startGroup();
        goto L11
    L20:
        if (slots.getCurrentGroup() == destination) goto L24;
        value$iv = false;
    L24:
        if (value$iv == true) goto L27;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L27:
        return nodeIndex;
    L5:
        value$iv2 = false;
        goto L7
    }
}
