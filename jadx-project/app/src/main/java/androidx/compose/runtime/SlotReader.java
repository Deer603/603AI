package androidx.compose.runtime;

import androidx.compose.ui.spatial.RectListKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0015\n\u0002\b\u0016\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010H\u001a\u00020C2\b\b\u0002\u0010I\u001a\u00020\nJ\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u000e\u0010M\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u0006\u0010N\u001a\u00020KJ\u0006\u0010O\u001a\u00020KJ\f\u0010P\u001a\b\u0012\u0004\u0012\u00020R0QJ\u0010\u0010S\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u0010\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u0018\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010U\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010H\u001a\u00020CJ\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010V\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u000e\u00100\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\b\u0010W\u001a\u0004\u0018\u00010\u0001J\u0010\u0010X\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u000e\u00101\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u00103\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010Y\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010Z\u001a\u00020K2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010[\u001a\u00020K2\u0006\u0010I\u001a\u00020\nJ\u0006\u0010\\\u001a\u00020\nJ\u0006\u0010]\u001a\u00020KJ\u0006\u0010^\u001a\u00020KJ\u0006\u0010_\u001a\u00020KJ\b\u0010`\u001a\u00020aH\u0016J\u0016\u0010b\u001a\u0004\u0018\u00010\u0001*\u00020'2\u0006\u0010I\u001a\u00020\nH\u0002J\u0016\u0010X\u001a\u0004\u0018\u00010\u0001*\u00020'2\u0006\u0010I\u001a\u00020\nH\u0002J\u0016\u0010c\u001a\u0004\u0018\u00010\u0001*\u00020'2\u0006\u0010I\u001a\u00020\nH\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\rR\u0011\u0010$\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\rR\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\tR\u0011\u0010+\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010\tR\u0011\u0010-\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010\tR\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b/\u0010\tR\u0011\u00100\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010\tR\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\rR\u001e\u00103\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\rR\u0011\u00105\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b6\u0010\rR\u0011\u00107\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b8\u0010\rR\u0011\u00109\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010\rR\u0011\u0010;\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b<\u0010\rR\u0018\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010>X\u0082\u0004¢\u0006\u0004\n\u0002\u0010?R\u000e\u0010@\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010A\u001a\"\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0018\u00010Bj\u0010\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0018\u0001`EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006d"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "<set-?>", "", "closed", "getClosed", "()Z", "", "currentEnd", "getCurrentEnd", "()I", "currentGroup", "getCurrentGroup", "currentSlot", "currentSlotEnd", "currentSlotStack", "Landroidx/compose/runtime/IntStack;", "emptyCount", "groupAux", "getGroupAux", "()Ljava/lang/Object;", "groupEnd", "getGroupEnd", "groupKey", "getGroupKey", "groupNode", "getGroupNode", "groupObjectKey", "getGroupObjectKey", "groupSize", "getGroupSize", "groupSlotCount", "getGroupSlotCount", "groupSlotIndex", "getGroupSlotIndex", "groups", "", "groupsSize", "hadNext", "getHadNext", "hasObjectKey", "getHasObjectKey", "inEmpty", "getInEmpty", "isGroupEnd", "isNode", "nodeCount", "getNodeCount", "parent", "getParent", "parentNodes", "getParentNodes", "remainingSlots", "getRemainingSlots", "size", "getSize", "slot", "getSlot", "slots", "", "[Ljava/lang/Object;", "slotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "anchor", "index", "beginEmpty", "", "close", "containsMark", "endEmpty", "endGroup", "extractKeys", "", "Landroidx/compose/runtime/KeyInfo;", "get", "groupGet", "group", "hasMark", "next", "node", "parentOf", "reposition", "restoreParent", "skipGroup", "skipToGroupEnd", "startGroup", "startNode", "toString", "", "aux", "objectKey", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SlotReader {
    public static final int $stable = 0;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack currentSlotStack;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private boolean hadNext;
    private int parent;
    private final Object[] slots;
    private final int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    static {
        $stable = 8;
    }

    public SlotReader(SlotTable table) {
        this.table = table;
        this.groups = this.table.getGroups();
        this.groupsSize = this.table.getGroupsSize();
        this.slots = this.table.getSlots();
        this.slotsSize = this.table.getSlotsSize();
        this.currentEnd = this.groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.access$slotAnchor(this.groups, this.parent);
    }

    public final int parent(int index) {
        int[] $this$parentAnchor$iv = this.groups;
        return $this$parentAnchor$iv[(index * 5) + 2];
    }

    public final boolean isNode() {
        int[] $this$isNode$iv = this.groups;
        int address$iv = this.currentGroup;
        if (($this$isNode$iv[(address$iv * 5) + 1] & 1073741824) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public final boolean isNode(int index) {
        int[] $this$isNode$iv = this.groups;
        if (($this$isNode$iv[(index * 5) + 1] & 1073741824) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public final int getNodeCount() {
        int[] $this$nodeCount$iv = this.groups;
        int address$iv = this.currentGroup;
        return $this$nodeCount$iv[(address$iv * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int nodeCount(int index) {
        int[] $this$nodeCount$iv = this.groups;
        return $this$nodeCount$iv[(index * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final Object node(int index) {
        int[] $this$isNode$iv = this.groups;
        boolean r3 = true;
        if (($this$isNode$iv[(index * 5) + 1] & 1073741824) != 0) goto L6;
        r3 = false;
    L6:
        if (r3 == true) goto L10;
        return null;
    L10:
        return node(this.groups, index);
    }

    public final boolean isGroupEnd() {
        if (getInEmpty() == false) goto L5;
    L8:
        return true;
    L5:
        if (this.currentGroup == this.currentEnd) goto L8;
        return false;
    }

    public final boolean getInEmpty() {
        if (this.emptyCount <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final int getGroupSize() {
        return SlotTableKt.access$groupSize(this.groups, this.currentGroup);
    }

    public final int groupSize(int index) {
        return SlotTableKt.access$groupSize(this.groups, index);
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int groupEnd(int index) {
        return SlotTableKt.access$groupSize(this.groups, index) + index;
    }

    public final int getGroupKey() {
        if (this.currentGroup >= this.currentEnd) goto L5;
        int[] $this$key$iv = this.groups;
        int address$iv = this.currentGroup;
        return $this$key$iv[address$iv * 5];
    L5:
        return 0;
    }

    public final int groupKey(int index) {
        int[] $this$key$iv = this.groups;
        return $this$key$iv[index * 5];
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.access$slotAnchor(this.groups, this.parent);
    }

    public final boolean hasObjectKey(int index) {
        int[] $this$hasObjectKey$iv = this.groups;
        if (($this$hasObjectKey$iv[(index * 5) + 1] & 536870912) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public final boolean getHasObjectKey() {
        if (this.currentGroup >= this.currentEnd) goto L11;
        int[] $this$hasObjectKey$iv = this.groups;
        int address$iv = this.currentGroup;
        if (($this$hasObjectKey$iv[(address$iv * 5) + 1] & 536870912) == 0) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L10;
        return false;
    L10:
        return true;
    L7:
        r0 = false;
        goto L8
    L11:
        return false;
    }

    public final Object getGroupObjectKey() {
        if (this.currentGroup < this.currentEnd) goto L7;
        return null;
    L7:
        return objectKey(this.groups, this.currentGroup);
    }

    public final Object groupObjectKey(int index) {
        return objectKey(this.groups, index);
    }

    public final Object getGroupAux() {
        if (this.currentGroup >= this.currentEnd) goto L6;
        return aux(this.groups, this.currentGroup);
    L6:
        return 0;
    }

    public final Object groupAux(int index) {
        return aux(this.groups, index);
    }

    public final Object getGroupNode() {
        if (this.currentGroup < this.currentEnd) goto L7;
        return null;
    L7:
        return node(this.groups, this.currentGroup);
    }

    public final int groupKey(Anchor anchor) {
        if (anchor.getValid() == false) goto L5;
        int[] $this$key$iv = this.groups;
        int address$iv = this.table.anchorIndex(anchor);
        return $this$key$iv[address$iv * 5];
    L5:
        return 0;
    }

    public final boolean hasMark(int index) {
        int[] $this$hasMark$iv = this.groups;
        if (($this$hasMark$iv[(index * 5) + 1] & 134217728) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public final boolean containsMark(int index) {
        int[] $this$containsMark$iv = this.groups;
        if (($this$containsMark$iv[(index * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public final int getParentNodes() {
        if (this.parent < 0) goto L5;
        int[] $this$nodeCount$iv = this.groups;
        int address$iv = this.parent;
        return $this$nodeCount$iv[(address$iv * 5) + 1] & RectListKt.Lower26Bits;
    L5:
        return 0;
    }

    public final int getRemainingSlots() {
        return this.currentSlotEnd - this.currentSlot;
    }

    public final int parentOf(int index) {
        if (index >= 0) goto L4;
    L6:
        boolean value$iv = false;
    L8:
        if (value$iv == true) goto L10;
        PreconditionsKt.throwIllegalArgumentException("Invalid group index " + index);
    L10:
        int[] $this$parentAnchor$iv = this.groups;
        return $this$parentAnchor$iv[(index * 5) + 2];
    L4:
        if (index >= this.groupsSize) goto L6;
        value$iv = true;
        goto L8
    }

    public final int getGroupSlotCount() {
        int current = this.currentGroup;
        int start = SlotTableKt.access$slotAnchor(this.groups, current);
        int next = current + 1;
        if (next >= this.groupsSize) goto L5;
        int[] $this$dataAnchor$iv = this.groups;
        int end = $this$dataAnchor$iv[(next * 5) + 4];
    L7:
        return end - start;
    L5:
        end = this.slotsSize;
        goto L7
    }

    public final Object get(int index) {
        int slotIndex = this.currentSlot + index;
        if (slotIndex >= this.currentSlotEnd) goto L7;
        return this.slots[slotIndex];
    L7:
        return Composer.Companion.getEmpty();
    }

    public final Object groupGet(int index) {
        return groupGet(this.currentGroup, index);
    }

    public final Object groupGet(int group, int index) {
        int start = SlotTableKt.access$slotAnchor(this.groups, group);
        int next = group + 1;
        if (next >= this.groupsSize) goto L5;
        int[] $this$dataAnchor$iv = this.groups;
        int end = $this$dataAnchor$iv[(next * 5) + 4];
    L6:
        int address = start + index;
        if (address >= end) goto L10;
        return this.slots[address];
    L10:
        return Composer.Companion.getEmpty();
    L5:
        end = this.slotsSize;
        goto L6
    }

    public final Object next() {
        if (this.emptyCount <= 0) goto L5;
    L9:
        this.hadNext = false;
        return Composer.Companion.getEmpty();
    L5:
        if (this.currentSlot >= this.currentSlotEnd) goto L9;
        this.hadNext = true;
        Object[] r0 = this.slots;
        int r1 = this.currentSlot;
        this.currentSlot = r1 + 1;
        return r0[r1];
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void endEmpty() {
        if (this.emptyCount <= 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
    L9:
        this.emptyCount--;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, this.sourceInformationMap);
    }

    public final void startGroup() {
        if (this.emptyCount > 0) goto L27;
        int parent = this.parent;
        int currentGroup = this.currentGroup;
        int[] $this$parentAnchor$iv = this.groups;
        if ($this$parentAnchor$iv[(currentGroup * 5) + 2] != parent) goto L7;
        boolean value$iv = true;
    L9:
        if (value$iv == true) goto L11;
        PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
    L11:
        HashMap<Anchor, GroupSourceInformation> r2 = this.sourceInformationMap;
        if (r2 == null) goto L16;
        GroupSourceInformation r3 = r2.get(anchor(parent));
        if (r3 == null) goto L16;
        r3.reportGroup(this.table, currentGroup);
    L16:
        IntStack currentSlotStack = this.currentSlotStack;
        int currentSlot = this.currentSlot;
        int currentEndSlot = this.currentSlotEnd;
        if (currentSlot != 0) goto L20;
        if (currentEndSlot != 0) goto L20;
        currentSlotStack.push(-1);
    L21:
        this.parent = currentGroup;
        this.currentEnd = SlotTableKt.access$groupSize(this.groups, currentGroup) + currentGroup;
        this.currentGroup = currentGroup + 1;
        this.currentSlot = SlotTableKt.access$slotAnchor(this.groups, currentGroup);
        if (currentGroup < (this.groupsSize - 1)) goto L24;
        int r4 = this.slotsSize;
    L25:
        this.currentSlotEnd = r4;
        return;
    L24:
        int[] $this$dataAnchor$iv = this.groups;
        int address$iv = currentGroup + 1;
        r4 = $this$dataAnchor$iv[(address$iv * 5) + 4];
    L20:
        currentSlotStack.push(currentSlot);
        goto L21
    L7:
        value$iv = false;
        goto L9
    }

    public final void startNode() {
        if (this.emptyCount > 0) goto L13;
        int[] $this$isNode$iv = this.groups;
        int address$iv = this.currentGroup;
        boolean value$iv = true;
        if (($this$isNode$iv[(address$iv * 5) + 1] & 1073741824) != 0) goto L9;
        value$iv = false;
    L9:
        if (value$iv == true) goto L11;
        PreconditionsKt.throwIllegalArgumentException("Expected a node group");
    L11:
        startGroup();
        return;
    }

    public final int skipGroup() {
        boolean r1 = false;
        int count = 1;
        if (this.emptyCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
    L9:
        int[] $this$isNode$iv = this.groups;
        int address$iv = this.currentGroup;
        if (($this$isNode$iv[(address$iv * 5) + 1] & 1073741824) == 0) goto L12;
        r1 = true;
    L12:
        if (r1 == true) goto L15;
        int[] $this$nodeCount$iv = this.groups;
        int address$iv2 = this.currentGroup;
        count = $this$nodeCount$iv[(address$iv2 * 5) + 1] & RectListKt.Lower26Bits;
    L15:
        this.currentGroup += SlotTableKt.access$groupSize(this.groups, this.currentGroup);
        return count;
    L5:
        value$iv = false;
        goto L7
    }

    public final void skipToGroupEnd() {
        if (this.emptyCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
    L9:
        this.currentGroup = this.currentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void reposition(int index) {
        if (this.emptyCount != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
    L9:
        this.currentGroup = index;
        if (index >= this.groupsSize) goto L12;
        int[] $this$parentAnchor$iv = this.groups;
        int parent = $this$parentAnchor$iv[(index * 5) + 2];
    L13:
        this.parent = parent;
        if (parent >= 0) goto L16;
        this.currentEnd = this.groupsSize;
    L17:
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        return;
    L16:
        this.currentEnd = SlotTableKt.access$groupSize(this.groups, parent) + parent;
        goto L17
    L12:
        parent = -1;
        goto L13
    L5:
        value$iv = false;
        goto L7
    }

    public final void restoreParent(int index) {
        int newCurrentEnd = SlotTableKt.access$groupSize(this.groups, index) + index;
        int current = this.currentGroup;
        if (current < index) goto L6;
        if (current > newCurrentEnd) goto L6;
        boolean value$iv = true;
    L8:
        if (value$iv == true) goto L10;
        ComposerKt.composeImmediateRuntimeError("Index " + index + " is not a parent of " + current);
    L10:
        this.parent = index;
        this.currentEnd = newCurrentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        return;
    L6:
        value$iv = false;
        goto L8
    }

    public final void endGroup() {
        if (this.emptyCount == 0) goto L5;
        return;
    L5:
        if (this.currentGroup != this.currentEnd) goto L7;
        boolean value$iv = true;
    L9:
        if (value$iv == true) goto L11;
        ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
    L11:
        int[] $this$parentAnchor$iv = this.groups;
        int address$iv = this.parent;
        int parent = $this$parentAnchor$iv[(address$iv * 5) + 2];
        this.parent = parent;
        if (parent >= 0) goto L14;
        int r1 = this.groupsSize;
    L15:
        this.currentEnd = r1;
        IntStack currentSlotStack = this.currentSlotStack;
        int newCurrentSlot = currentSlotStack.pop();
        if (newCurrentSlot >= 0) goto L18;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        return;
    L18:
        this.currentSlot = newCurrentSlot;
        if (parent < (this.groupsSize - 1)) goto L21;
        int r2 = this.slotsSize;
    L22:
        this.currentSlotEnd = r2;
        return;
    L21:
        int[] $this$dataAnchor$iv = this.groups;
        int address$iv2 = parent + 1;
        r2 = $this$dataAnchor$iv[(address$iv2 * 5) + 4];
        goto L22
    L14:
        r1 = SlotTableKt.access$groupSize(this.groups, parent) + parent;
        goto L15
    L7:
        value$iv = false;
        goto L9
    }

    public final List<KeyInfo> extractKeys() {
        List result = new ArrayList();
        if (this.emptyCount <= 0) goto L5;
        return result;
    L5:
        int index = 0;
        int childIndex = this.currentGroup;
    L6:
        int index2 = index;
        int index3 = this.currentEnd;
        if (childIndex >= index3) goto L16;
        int[] $this$key$iv = this.groups;
        int r4 = $this$key$iv[childIndex * 5];
        int[] $this$key$iv2 = this.groups;
        Object r5 = objectKey($this$key$iv2, childIndex);
        int[] $this$isNode$iv = this.groups;
        int r9 = 1;
        if (($this$isNode$iv[(childIndex * 5) + 1] & 1073741824) == 0) goto L11;
        boolean r7 = true;
    L12:
        if (r7 == true) goto L15;
        int[] $this$nodeCount$iv = this.groups;
        r9 = 67108863 & $this$nodeCount$iv[(childIndex * 5) + 1];
    L15:
        index = index2 + 1;
        result.add(new KeyInfo(r4, r5, childIndex, r9, index2));
        childIndex = childIndex + SlotTableKt.access$groupSize(this.groups, childIndex);
        goto L6
    L11:
        r7 = false;
        goto L12
    L16:
        return result;
    }

    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.currentGroup;
    L6:
        return r0.anchor(r1);
    }

    public final Anchor anchor(int index) {
        ArrayList<Anchor> r0 = this.table.getAnchors$runtime_release();
        int effectiveSize$iv = this.groupsSize;
        int location$iv = SlotTableKt.access$search(r0, index, effectiveSize$iv);
        if (location$iv >= 0) goto L7;
        Anchor anchor$iv = new Anchor(index);
        r0.add(-(location$iv + 1), anchor$iv);
        return anchor$iv;
    L7:
        return r0.get(location$iv);
    }

    private final Object node(int[] $this$node, int index) {
        boolean r3 = true;
        if (($this$node[(index * 5) + 1] & 1073741824) != 0) goto L6;
        r3 = false;
    L6:
        if (r3 == false) goto L9;
        return this.slots[$this$node[(index * 5) + 4]];
    L9:
        return Composer.Companion.getEmpty();
    }

    private final Object aux(int[] $this$aux, int index) {
        boolean r3 = true;
        if (($this$aux[(index * 5) + 1] & 268435456) != 0) goto L6;
        r3 = false;
    L6:
        if (r3 == false) goto L9;
        return this.slots[SlotTableKt.access$auxIndex($this$aux, index)];
    L9:
        return Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] $this$objectKey, int index) {
        boolean r3 = true;
        if (($this$objectKey[(index * 5) + 1] & 536870912) != 0) goto L6;
        r3 = false;
    L6:
        if (r3 == true) goto L10;
        return null;
    L10:
        return this.slots[SlotTableKt.access$objectKeyIndex($this$objectKey, index)];
    }
}
