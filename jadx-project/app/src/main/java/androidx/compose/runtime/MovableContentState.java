package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.ExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J3\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0000¢\u0006\u0002\b\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "slotTable", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "extractNestedStates", "Landroidx/collection/ScatterMap;", "Landroidx/compose/runtime/MovableContentStateReference;", "applier", "Landroidx/compose/runtime/Applier;", "references", "Landroidx/collection/ObjectList;", "extractNestedStates$runtime_release", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MovableContentState {
    public static final int $stable = 0;
    private final SlotTable slotTable;

    static {
        $stable = 8;
    }

    public MovableContentState(SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public final ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates$runtime_release(Applier<?> r21, ObjectList<MovableContentStateReference> r22) {
        ObjectList<MovableContentStateReference> r0 = r22;
        Object[] content$iv$iv$iv = r0.content;
        int i$iv$iv$iv = 0;
        int r9 = r0._size;
    L3:
        if (i$iv$iv$iv >= r9) goto L8;
        Object it$iv$iv = content$iv$iv$iv[i$iv$iv$iv];
        MovableContentStateReference it = (MovableContentStateReference) it$iv$iv;
        if (this.slotTable.ownsAnchor(it.getAnchor$runtime_release()) == false) goto L6;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        goto L3
    L6:
        boolean r3 = false;
    L9:
        if (r3 == true) goto L18;
        MutableObjectList target$iv = new MutableObjectList(0, 1, null);
        Object[] content$iv$iv = r0.content;
        int i$iv$iv = 0;
        int r8 = r0._size;
    L12:
        if (i$iv$iv >= r8) goto L17;
        Object it$iv = content$iv$iv[i$iv$iv];
        MovableContentStateReference it2 = (MovableContentStateReference) it$iv;
        if (this.slotTable.ownsAnchor(it2.getAnchor$runtime_release()) == false) goto L16;
        target$iv.add(it$iv);
    L16:
        i$iv$iv = i$iv$iv + 1;
        goto L12
    L17:
        r0 = target$iv;
    L18:
        ObjectList referencesToExtract = ExtensionsKt.sortedBy(r0, new MovableContentState$extractNestedStates$referencesToExtract$2(this));
        if (referencesToExtract.isEmpty() == true) goto L21;
        MutableScatterMap result = ScatterMapKt.mutableScatterMapOf();
        SlotTable this_$iv = this.slotTable;
        SlotWriter writer$iv = this_$iv.openWriter();
        Object[] content$iv = referencesToExtract.content;     // Catch: Throwable -> L33
        int i$iv = 0;
        int r14 = referencesToExtract._size;     // Catch: Throwable -> L33
    L24:
        if (i$iv >= r14) goto L28;
        MovableContentStateReference reference = (MovableContentStateReference) content$iv[i$iv];     // Catch: Throwable -> L33
        int newGroup = writer$iv.anchorIndex(reference.getAnchor$runtime_release());     // Catch: Throwable -> L33
        int newParent = writer$iv.parent(newGroup);     // Catch: Throwable -> L33
        extractNestedStates$lambda$3$closeToGroupContaining(writer$iv, newParent);     // Catch: Throwable -> L33
        extractNestedStates$lambda$3$openParent(writer$iv, newParent);     // Catch: Throwable -> L33
        writer$iv.advanceBy(newGroup - writer$iv.getCurrentGroup());     // Catch: Throwable -> L33
        ObjectList referencesToExtract2 = referencesToExtract;
        MovableContentState content = ComposerKt.extractMovableContentAtCurrent(reference.getComposition$runtime_release(), reference, writer$iv, r21);     // Catch: Throwable -> L31
        result.set(reference, content);     // Catch: Throwable -> L31
        i$iv = i$iv + 1;     // Catch: Throwable -> L31
        referencesToExtract = referencesToExtract2;
    L31:
        th = th;
    L35:
        writer$iv.close(false);
        throw th;
    L28:
        extractNestedStates$lambda$3$closeToGroupContaining(writer$iv, Integer.MAX_VALUE);     // Catch: Throwable -> L31
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L31
        writer$iv.close(true);
        return result;
    L33:
        th = th;
        goto L35
    L21:
        return ScatterMapKt.emptyScatterMap();
    L8:
        r3 = true;
        goto L9
    }

    private static final void extractNestedStates$lambda$3$closeToGroupContaining(SlotWriter $writer, int group) {
    L3:
        if ($writer.getParent() < 0) goto L7;
        if ($writer.getCurrentGroupEnd() > group) goto L10;
        $writer.skipToGroupEnd();
        $writer.endGroup();
        goto L3
    L10:
        return;
    }

    private static final void extractNestedStates$lambda$3$openParent(SlotWriter $writer, int parent) {
        extractNestedStates$lambda$3$closeToGroupContaining($writer, parent);
    L4:
        if ($writer.getCurrentGroup() == parent) goto L12;
        if ($writer.isGroupEnd() == true) goto L12;
        if (parent < ComposerKt.access$getNextGroup($writer)) goto L9;
        $writer.skipGroup();
        goto L4
    L9:
        $writer.startGroup();
    L12:
        if ($writer.getCurrentGroup() != parent) goto L14;
        boolean value$iv = true;
    L16:
        if (value$iv == true) goto L18;
        ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
    L18:
        $writer.startGroup();
        return;
    L14:
        value$iv = false;
        goto L16
    }
}
