package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\rH\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010¨\u0006,"}, d2 = {"Landroidx/compose/runtime/SlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "table", "Landroidx/compose/runtime/SlotTable;", "group", "", "version", "(Landroidx/compose/runtime/SlotTable;II)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "data", "", "getData", "getGroup", "()I", "groupSize", "getGroupSize", "identity", "getIdentity", "()Ljava/lang/Object;", "isEmpty", "", "()Z", "key", "getKey", "node", "getNode", "slotsSize", "getSlotsSize", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "getVersion", "find", "identityToFind", "iterator", "", "validateRead", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
    private final int group;
    private final SlotTable table;
    private final int version;

    public SlotTableGroup(SlotTable table, int group, int version) {
        this.table = table;
        this.group = group;
        this.version = version;
    }

    public /* synthetic */ SlotTableGroup(SlotTable r1, int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = r1.getVersion$runtime_release();
    L5:
        this(r1, r2, r3);
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        if (SlotTableKt.access$groupSize(this.table.getGroups(), this.group) != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        int[] $this$hasObjectKey$iv = this.table.getGroups();
        int address$iv = this.group;
        boolean r4 = true;
        if (($this$hasObjectKey$iv[(address$iv * 5) + 1] & 536870912) != 0) goto L6;
        r4 = false;
    L6:
        SlotTable r0 = this.table;
        if (r4 == false) goto L9;
        Object r1 = r0.getSlots()[SlotTableKt.access$objectKeyIndex(this.table.getGroups(), this.group)];
        Intrinsics.checkNotNull(r1);
        return r1;
    L9:
        int[] $this$key$iv = r0.getGroups();
        int address$iv2 = this.group;
        return Integer.valueOf($this$key$iv[address$iv2 * 5]);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        int[] $this$hasAux$iv = this.table.getGroups();
        int address$iv = this.group;
        boolean r4 = true;
        if (($this$hasAux$iv[(address$iv * 5) + 1] & 268435456) != 0) goto L6;
        r4 = false;
    L6:
        SlotTable r0 = this.table;
        if (r4 == false) goto L11;
        Object r1 = r0.getSlots()[SlotTableKt.access$auxIndex(this.table.getGroups(), this.group)];
        if ((r1 instanceof String) == true) goto L16;
        return null;
    L16:
        return (String) r1;
    L11:
        GroupSourceInformation r2 = r0.sourceInformationOf(this.group);
        if (r2 != null) goto L14;
        return null;
    L14:
        return r2.getSourceInformation();
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        int[] $this$isNode$iv = this.table.getGroups();
        int address$iv = this.group;
        boolean r4 = true;
        if (($this$isNode$iv[(address$iv * 5) + 1] & 1073741824) != 0) goto L6;
        r4 = false;
    L6:
        if (r4 == false) goto L8;
        Object[] r0 = this.table.getSlots();
        int[] $this$nodeIndex$iv = this.table.getGroups();
        int address$iv2 = this.group;
        return r0[$this$nodeIndex$iv[(address$iv2 * 5) + 4]];
    L8:
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable<Object> getData() {
        GroupSourceInformation it = this.table.sourceInformationOf(this.group);
        if (it == null) goto L6;
        return new SourceInformationGroupDataIterator(this.table, this.group, it);
    L6:
        return new DataIterator(this.table, this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        validateRead();
        SlotTable this_$iv = this.table;
        SlotReader reader$iv = this_$iv.openReader();
        Anchor r6 = reader$iv.anchor(this.group);     // Catch: Throwable -> L6
        reader$iv.close();
        return r6;
    L6:
        th = move-exception;
        reader$iv.close();
        throw th;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        validateRead();
        GroupSourceInformation it = this.table.sourceInformationOf(this.group);
        if (it == null) goto L6;
        return new SourceInformationGroupIterator(this.table, this.group, it, new AnchoredGroupPath(this.group));
    L6:
        return new GroupIterator(this.table, this.group + 1, this.group + SlotTableKt.access$groupSize(this.table.getGroups(), this.group));
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        return SlotTableKt.access$groupSize(this.table.getGroups(), this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int nextGroup = this.group + getGroupSize();
        int r1 = this.table.getGroupsSize();
        SlotTable r2 = this.table;
        if (nextGroup >= r1) goto L5;
        int[] $this$dataAnchor$iv = r2.getGroups();
        int nextSlot = $this$dataAnchor$iv[(nextGroup * 5) + 4];
    L6:
        int[] $this$dataAnchor$iv2 = this.table.getGroups();
        int address$iv = this.group;
        return nextSlot - $this$dataAnchor$iv2[(address$iv * 5) + 4];
    L5:
        nextSlot = r2.getSlotsSize();
        goto L6
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() == this.version) goto L6;
        SlotTableKt.throwConcurrentModificationException();
        return;
    }

    private static final CompositionGroup find$findAnchoredGroup(SlotTableGroup this$0, Anchor anchor) {
        if (this$0.table.ownsAnchor(anchor) == false) goto L10;
        int anchorGroup = this$0.table.anchorIndex(anchor);
        if (anchorGroup >= this$0.group) goto L7;
        return null;
    L7:
        if ((anchorGroup - this$0.group) < SlotTableKt.access$groupSize(this$0.table.getGroups(), this$0.group)) goto L9;
        return null;
    L9:
        return new SlotTableGroup(this$0.table, anchorGroup, this$0.version);
    L10:
        return null;
    }

    private static final CompositionGroup find$findRelativeGroup(CompositionGroup group, int index) {
        return (CompositionGroup) CollectionsKt.firstOrNull(CollectionsKt.drop(group.getCompositionGroups(), index));
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        if ((identityToFind instanceof Anchor) == false) goto L6;
        return find$findAnchoredGroup(this, (Anchor) identityToFind);
    L6:
        if ((identityToFind instanceof SourceInformationSlotTableGroupIdentity) == false) goto L12;
        CompositionGroup it = find(((SourceInformationSlotTableGroupIdentity) identityToFind).getParentIdentity());
        if (it == null) goto L15;
        return find$findRelativeGroup(it, ((SourceInformationSlotTableGroupIdentity) identityToFind).getIndex());
    L15:
        return null;
    L12:
        return null;
    }
}
