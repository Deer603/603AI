package androidx.compose.runtime;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/SourceInformationGroupDataIterator;", "", "", "", "table", "Landroidx/compose/runtime/SlotTable;", "group", "", "sourceInformation", "Landroidx/compose/runtime/GroupSourceInformation;", "(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;)V", "base", "end", "filter", "Landroidx/compose/runtime/BitVector;", "index", "start", "getTable", "()Landroidx/compose/runtime/SlotTable;", "hasNext", "", "iterator", "next", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SourceInformationGroupDataIterator implements Iterable<Object>, Iterator<Object>, KMappedMarker {
    private final int base;
    private final int end;
    private final BitVector filter;
    private int index;
    private final int start;
    private final SlotTable table;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SourceInformationGroupDataIterator(SlotTable table, int group, GroupSourceInformation sourceInformation) {
        this.table = table;
        int[] $this$dataAnchor$iv = this.table.getGroups();
        this.base = $this$dataAnchor$iv[(group * 5) + 4];
        this.start = sourceInformation.getDataStartOffset();
        int it = sourceInformation.getDataEndOffset();
        if (it <= 0) goto L5;
        int r2 = it;
    L10:
        this.end = r2;
        BitVector it2 = new BitVector();
        List r3 = sourceInformation.getGroups();
        if (r3 == null) goto L20;
        List $this$fastForEach$iv = r3;
        int index$iv = 0;
        int r7 = $this$fastForEach$iv.size();
    L14:
        if (index$iv >= r7) goto L20;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        if ((item$iv instanceof GroupSourceInformation) == false) goto L18;
        it2.setRange(((GroupSourceInformation) item$iv).getDataStartOffset(), ((GroupSourceInformation) item$iv).getDataEndOffset());
    L18:
        index$iv = index$iv + 1;
    L20:
        this.filter = it2;
        this.index = this.filter.nextClear(this.start);
        return;
    L5:
        int r4 = group + 1;
        int r5 = this.table.getGroupsSize();
        SlotTable r6 = this.table;
        if (r4 >= r5) goto L8;
        int[] $this$dataAnchor$iv2 = r6.getGroups();
        int address$iv = group + 1;
        int r8 = $this$dataAnchor$iv2[(address$iv * 5) + 4];
    L9:
        r2 = r8 - this.base;
        goto L10
    L8:
        r8 = r6.getSlotsSize();
        goto L9
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index >= this.end) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        int r0 = this.end;
        int r1 = this.index;
        boolean r3 = false;
        if (r1 < 0) goto L6;
        if (r1 >= r0) goto L6;
        r3 = true;
    L6:
        if (r3 == false) goto L8;
        Object r2 = this.table.getSlots()[this.base + this.index];
    L9:
        this.index = this.filter.nextClear(this.index + 1);
        return r2;
    L8:
        r2 = null;
        goto L9
    }
}
