package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: SnapshotDoubleIndexHeap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0014\u0010\u0019\u001a\u00020\u00112\f\b\u0002\u0010\u001a\u001a\u00060\u0011j\u0002`\u0012J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0015H\u0007J\u001c\u0010\"\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00042\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00060\rj\u0002`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "()V", "firstFreeHandle", "", "handles", "", "index", "<set-?>", "size", "getSize", "()I", "values", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "add", "value", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "allocateHandle", "ensure", "", "atLeast", "freeHandle", "handle", "lowestOrDefault", "default", "remove", "shiftDown", "shiftUp", "swap", "a", "b", "validate", "validateHandle", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 0;
    private int firstFreeHandle;
    private int[] handles;
    private int[] index;
    private int size;
    private long[] values;

    static {
        $stable = 8;
    }

    public SnapshotDoubleIndexHeap() {
        this.values = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(16);
        this.index = new int[16];
        int[] r1 = new int[16];
        int r2 = 0;
    L3:
        if (r2 >= 16) goto L5;
        int r3 = r2 + 1;
        r1[r2] = r3;
        r2 = r3;
        goto L3
    L5:
        this.handles = r1;
    }

    public final int getSize() {
        return this.size;
    }

    public static /* synthetic */ long lowestOrDefault$default(SnapshotDoubleIndexHeap r0, long r1, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        return r0.lowestOrDefault(r1);
    }

    public final long lowestOrDefault(long r4) {
        if (this.size <= 0) goto L6;
        return this.values[0];
    L6:
        return r4;
    }

    public final int add(long value) {
        ensure(this.size + 1);
        int i = this.size;
        this.size = i + 1;
        int handle = allocateHandle();
        this.values[i] = value;
        this.index[i] = handle;
        this.handles[handle] = i;
        shiftUp(i);
        return handle;
    }

    public final void remove(int handle) {
        int i = this.handles[handle];
        swap(i, this.size - 1);
        this.size--;
        shiftUp(i);
        shiftDown(i);
        freeHandle(handle);
    }

    public final void validate() {
        int index = 1;
        int r1 = this.size;
    L3:
        if (index >= r1) goto L9;
        int parent = ((index + 1) >> 1) - 1;
        if (this.values[parent] > this.values[index]) goto L8;
        index = index + 1;
        goto L3
    L8:
        throw new IllegalStateException(("Index " + index + " is out of place").toString());
    }

    public final void validateHandle(int handle, long value) {
        int i = this.handles[handle];
        if (this.index[i] != handle) goto L10;
        if (this.values[i] != value) goto L8;
        return;
    L8:
        throw new IllegalStateException(("Value for handle " + handle + " was " + this.values[i] + " but was supposed to be " + value).toString());
    L10:
        throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString());
    }

    private final void shiftUp(int index) {
        long[] values = this.values;
        long value = values[index];
        int current = index;
    L3:
        if (current <= 0) goto L8;
        int parent = ((current + 1) >> 1) - 1;
        if (values[parent] <= value) goto L11;
        swap(parent, current);
        current = parent;
        goto L3
    L11:
        return;
    }

    private final void shiftDown(int index) {
        long[] values = this.values;
        int half = this.size >> 1;
        int current = index;
    L3:
        if (current >= half) goto L16;
        int right = (current + 1) << 1;
        int left = right - 1;
        if (right >= this.size) goto L13;
        if (values[right] >= values[left]) goto L13;
        if (values[right] >= values[current]) goto L11;
        swap(right, current);
        current = right;
        goto L3
    L11:
        return;
    L13:
        if (values[left] >= values[current]) goto L15;
        swap(left, current);
        current = left;
        goto L3
    L15:
        return;
    }

    private final void swap(int a, int b) {
        long[] values = this.values;
        int[] index = this.index;
        int[] handles = this.handles;
        long t = values[a];
        values[a] = values[b];
        values[b] = t;
        int ia = index[a];
        int ib = index[b];
        index[a] = ib;
        index[b] = ia;
        handles[ib] = a;
        handles[ia] = b;
    }

    private final void ensure(int atLeast) {
        int capacity = this.values.length;
        if (atLeast > capacity) goto L5;
        return;
    L5:
        int newCapacity = capacity * 2;
        long[] newValues = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(newCapacity);
        int[] newIndex = new int[newCapacity];
        long[] $this$copyInto$iv = this.values;
        ArraysKt.copyInto$default($this$copyInto$iv, newValues, 0, 0, 0, 12, null);
        ArraysKt.copyInto$default(this.index, newIndex, 0, 0, 0, 14, null);
        this.values = newValues;
        this.index = newIndex;
    }

    private final int allocateHandle() {
        int capacity = this.handles.length;
        if (this.firstFreeHandle < capacity) goto L8;
        int r1 = capacity * 2;
        int[] newHandles = new int[r1];
        int r3 = 0;
    L5:
        if (r3 >= r1) goto L7;
        int r4 = r3 + 1;
        newHandles[r3] = r4;
        r3 = r4;
        goto L5
    L7:
        ArraysKt.copyInto$default(this.handles, newHandles, 0, 0, 0, 14, null);
        this.handles = newHandles;
    L8:
        int handle = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[this.firstFreeHandle];
        return handle;
    }

    private final void freeHandle(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }
}
