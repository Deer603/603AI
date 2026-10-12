package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010$\u001a\u00020\"H\u0016J\n\u0010%\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010&\u001a\u00020'H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001eR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001f¨\u0006("}, d2 = {"Landroidx/compose/runtime/CompositionDataImpl;", "Landroidx/compose/runtime/tooling/CompositionData;", "Landroidx/compose/runtime/tooling/CompositionInstance;", "composition", "Landroidx/compose/runtime/Composition;", "(Landroidx/compose/runtime/Composition;)V", "getComposition", "()Landroidx/compose/runtime/Composition;", "compositionGroups", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "getCompositionGroups", "()Ljava/lang/Iterable;", "data", "getData", "()Landroidx/compose/runtime/tooling/CompositionData;", "isEmpty", "", "()Z", "parent", "getParent", "()Landroidx/compose/runtime/tooling/CompositionInstance;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable", "()Landroidx/compose/runtime/SlotTable;", "context", "Landroidx/compose/runtime/CompositionContext;", "getContext", "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/Composition;", "(Landroidx/compose/runtime/Composition;)Landroidx/compose/runtime/SlotTable;", "equals", "other", "", "find", "identityToFind", "findContextGroup", "hashCode", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CompositionDataImpl implements CompositionData, CompositionInstance {
    public static final int $stable = 0;
    private final Composition composition;

    static {
        $stable = 8;
    }

    public CompositionDataImpl(Composition composition) {
        this.composition = composition;
    }

    public final Composition getComposition() {
        return this.composition;
    }

    private final SlotTable getSlotTable() {
        Composition r0 = this.composition;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        return ((CompositionImpl) r0).getSlotTable$runtime_release();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return getSlotTable().getCompositionGroups();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return getSlotTable().isEmpty();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        return getSlotTable().find(identityToFind);
    }

    public int hashCode() {
        return this.composition.hashCode() * 31;
    }

    public boolean equals(Object other) {
        if ((other instanceof CompositionDataImpl) == true) goto L5;
    L7:
        return false;
    L5:
        if (Intrinsics.areEqual(this.composition, ((CompositionDataImpl) other).composition) == false) goto L7;
        return true;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionInstance getParent() {
        Composition it = getParent(this.composition);
        if (it == null) goto L5;
        CompositionDataImpl r2 = new CompositionDataImpl(it);
    L7:
        return r2;
    L5:
        r2 = null;
        goto L7
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionData getData() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionInstance
    public CompositionGroup findContextGroup() {
        Composition r0 = getParent(this.composition);
        if (r0 == null) goto L14;
        SlotTable parentSlotTable = getSlotTable(r0);
        if (parentSlotTable == null) goto L18;
        CompositionContext context = getContext(this.composition);
        SlotReader reader$iv = parentSlotTable.openReader();
        CompositionGroup r8 = findContextGroup$lambda$2$scanGroup(reader$iv, context, parentSlotTable, 0, reader$iv.getSize());     // Catch: Throwable -> L11
        reader$iv.close();
        return r8;
    L11:
        th = move-exception;
        reader$iv.close();
        throw th;
    L18:
        return null;
    L14:
        return null;
    }

    private static final CompositionGroup findContextGroup$lambda$2$scanGroup(SlotReader $reader, CompositionContext context, SlotTable parentSlotTable, int group, int end) {
        int current = group;
    L3:
        ComposerImpl.CompositionContextHolder contextHolder = null;
        if (current >= end) goto L26;
        int next = $reader.groupSize(current) + current;
        if ($reader.hasMark(current) == false) goto L20;
        if ($reader.groupKey(current) != 206) goto L20;
        if (Intrinsics.areEqual($reader.groupObjectKey(current), ComposerKt.getReference()) == false) goto L20;
        Object r3 = $reader.groupGet(current, 0);
        if ((r3 instanceof ComposerImpl.CompositionContextHolder) == false) goto L14;
        contextHolder = (ComposerImpl.CompositionContextHolder) r3;
    L14:
        if (contextHolder == null) goto L20;
        if (Intrinsics.areEqual(contextHolder.getRef(), context) == false) goto L20;
        return SlotTableKt.compositionGroupOf(parentSlotTable, current);
    L20:
        if ($reader.containsMark(current) == false) goto L25;
        CompositionGroup it = findContextGroup$lambda$2$scanGroup($reader, context, parentSlotTable, current + 1, next);
        if (it == null) goto L25;
        return it;
    L25:
        current = next;
        goto L3
    L26:
        return null;
    }

    private final SlotTable getSlotTable(Composition $this$slotTable) {
        if (($this$slotTable instanceof CompositionImpl) == false) goto L5;
        CompositionImpl r0 = (CompositionImpl) $this$slotTable;
    L6:
        if (r0 != null) goto L8;
        return null;
    L8:
        return r0.getSlotTable$runtime_release();
    L5:
        r0 = null;
        goto L6
    }

    private final CompositionContext getContext(Composition $this$context) {
        if (($this$context instanceof CompositionImpl) == false) goto L5;
        CompositionImpl r0 = (CompositionImpl) $this$context;
    L6:
        if (r0 != null) goto L8;
        return null;
    L8:
        return r0.getParent();
    L5:
        r0 = null;
        goto L6
    }

    private final Composition getParent(Composition $this$parent) {
        CompositionContext r0 = getContext($this$parent);
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getComposition$runtime_release();
    }
}
