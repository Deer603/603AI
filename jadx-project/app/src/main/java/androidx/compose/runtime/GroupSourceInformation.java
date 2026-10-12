package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0001H\u0002J\u001e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0003J\u0010\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u0000H\u0002J\u000e\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020,J\u0016\u0010/\u001a\u00020!2\u0006\u00100\u001a\u0002012\u0006\u0010\"\u001a\u00020\u0003J\u0016\u0010/\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u0003J\u001e\u00102\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0003R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R.\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00063"}, d2 = {"Landroidx/compose/runtime/GroupSourceInformation;", "", "key", "", "sourceInformation", "", "dataStartOffset", "(ILjava/lang/String;I)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "dataEndOffset", "getDataEndOffset", "()I", "setDataEndOffset", "(I)V", "getDataStartOffset", "groups", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getGroups", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "getKey", "getSourceInformation", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "add", "", "group", "addGroupAfter", "writer", "Landroidx/compose/runtime/SlotWriter;", "predecessor", "close", "dataOffset", "endGrouplessCall", "hasAnchor", "anchor", "Landroidx/compose/runtime/Anchor;", "openInformation", "removeAnchor", "reportGroup", "table", "Landroidx/compose/runtime/SlotTable;", "startGrouplessCall", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GroupSourceInformation {
    public static final int $stable = 0;
    private boolean closed;
    private int dataEndOffset;
    private final int dataStartOffset;
    private ArrayList<Object> groups;
    private final int key;
    private String sourceInformation;

    static {
        $stable = 8;
    }

    public GroupSourceInformation(int key, String sourceInformation, int dataStartOffset) {
        this.key = key;
        this.sourceInformation = sourceInformation;
        this.dataStartOffset = dataStartOffset;
    }

    public final int getKey() {
        return this.key;
    }

    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    public final void setSourceInformation(String r1) {
        this.sourceInformation = r1;
    }

    public final int getDataStartOffset() {
        return this.dataStartOffset;
    }

    public final ArrayList<Object> getGroups() {
        return this.groups;
    }

    public final void setGroups(ArrayList<Object> r1) {
        this.groups = r1;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void setClosed(boolean r1) {
        this.closed = r1;
    }

    public final int getDataEndOffset() {
        return this.dataEndOffset;
    }

    public final void setDataEndOffset(int r1) {
        this.dataEndOffset = r1;
    }

    public final void startGrouplessCall(int key, String sourceInformation, int dataOffset) {
        openInformation().add(new GroupSourceInformation(key, sourceInformation, dataOffset));
    }

    public final void endGrouplessCall(int dataOffset) {
        openInformation().close(dataOffset);
    }

    public final void reportGroup(SlotWriter writer, int group) {
        openInformation().add(writer.anchor(group));
    }

    public final void reportGroup(SlotTable table, int group) {
        openInformation().add(table.anchor(group));
    }

    public final void addGroupAfter(SlotWriter writer, int predecessor, int group) {
        ArrayList<Object> r0 = this.groups;
        if (r0 != null) goto L5;
        r0 = new ArrayList();
        this.groups = r0;
    L5:
        int index = 0;
        if (predecessor < 0) goto L26;
        Anchor anchor = writer.tryAnchor$runtime_release(predecessor);
        if (anchor == null) goto L26;
        ArrayList<Object> r3 = r0;
        int index$iv = 0;
        int size$iv = r3.size();
    L10:
        if (index$iv >= size$iv) goto L23;
        Object value$iv = r3.get(index$iv);
        if (Intrinsics.areEqual(value$iv, anchor) == false) goto L14;
    L19:
        boolean r10 = true;
    L20:
        if (r10 == true) goto L21;
        index$iv = index$iv + 1;
        goto L10
    L21:
        index = index$iv;
        goto L26
    L14:
        if ((value$iv instanceof GroupSourceInformation) == true) goto L16;
    L18:
        r10 = false;
        goto L20
    L16:
        if (((GroupSourceInformation) value$iv).hasAnchor(anchor) == false) goto L18;
    L23:
        index = -1;
    L26:
        r0.add(index, writer.anchor(group));
    }

    public final void close(int dataOffset) {
        this.closed = true;
        this.dataEndOffset = dataOffset;
    }

    private final GroupSourceInformation openInformation() {
        ArrayList<Object> r0 = this.groups;
        GroupSourceInformation r1 = null;
        if (r0 == null) goto L17;
        int index$iv = r0.size() - 1;
    L5:
        if (index$iv < 0) goto L15;
        Object value$iv = r0.get(index$iv);
        if ((value$iv instanceof GroupSourceInformation) == true) goto L9;
    L11:
        boolean r10 = false;
    L12:
        if (r10 == true) goto L19;
        index$iv = index$iv - 1;
    L19:
        if ((value$iv instanceof GroupSourceInformation) == false) goto L21;
        r1 = (GroupSourceInformation) value$iv;
    L21:
        if (r1 == null) goto L26;
        GroupSourceInformation r2 = r1.openInformation();
        if (r2 == null) goto L26;
        return r2;
    L26:
        return this;
    L9:
        if (((GroupSourceInformation) value$iv).closed == true) goto L11;
        r10 = true;
        goto L12
    L15:
        value$iv = null;
        goto L19
    L17:
        value$iv = null;
        goto L19
    }

    private final void add(Object group) {
        ArrayList<Object> r0 = this.groups;
        if (r0 != null) goto L5;
        r0 = new ArrayList();
    L5:
        this.groups = r0;
        r0.add(group);
    }

    private final boolean hasAnchor(Anchor anchor) {
        List r0 = this.groups;
        if (r0 == null) goto L26;
        List $this$fastAny$iv = r0;
        int index$iv$iv = 0;
        int r6 = $this$fastAny$iv.size();
    L6:
        if (index$iv$iv >= r6) goto L19;
        Object item$iv$iv = $this$fastAny$iv.get(index$iv$iv);
        if (Intrinsics.areEqual(item$iv$iv, anchor) == false) goto L10;
    L15:
        boolean r11 = true;
    L16:
        if (r11 == true) goto L17;
        index$iv$iv = index$iv$iv + 1;
        goto L6
    L17:
        boolean r1 = true;
    L21:
        if (r1 == true) goto L23;
        return false;
    L23:
        return true;
    L10:
        if ((item$iv$iv instanceof GroupSourceInformation) == true) goto L12;
    L14:
        r11 = false;
        goto L16
    L12:
        if (((GroupSourceInformation) item$iv$iv).hasAnchor(anchor) == false) goto L14;
    L19:
        r1 = false;
        goto L21
    L26:
        return false;
    }

    public final boolean removeAnchor(Anchor anchor) {
        ArrayList<Object> r0 = this.groups;
        if (r0 == null) goto L22;
        int index = r0.size() - 1;
    L5:
        if (index < 0) goto L18;
        Object item = r0.get(index);
        if ((item instanceof Anchor) == false) goto L12;
        if (Intrinsics.areEqual(item, anchor) == false) goto L16;
        r0.remove(index);
    L16:
        index = index - 1;
        goto L5
    L12:
        if ((item instanceof GroupSourceInformation) == false) goto L16;
        if (((GroupSourceInformation) item).removeAnchor(anchor) == true) goto L16;
        r0.remove(index);
        goto L16
    L18:
        if (r0.isEmpty() == false) goto L21;
        this.groups = null;
        return false;
    L21:
        return true;
    L22:
        return true;
    }
}
