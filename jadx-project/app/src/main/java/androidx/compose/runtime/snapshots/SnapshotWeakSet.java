package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SnapshotWeakSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0002\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u001eJ%\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\"J\r\u0010#\u001a\u00020\u0019H\u0001¢\u0006\u0002\b$J\u001d\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190(H\u0086\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00120\u0011X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "T", "", "()V", "hashes", "", "getHashes$runtime_release", "()[I", "setHashes$runtime_release", "([I)V", "size", "", "getSize$runtime_release", "()I", "setSize$runtime_release", "(I)V", "values", "", "Landroidx/compose/runtime/internal/WeakReference;", "getValues$runtime_release", "()[Landroidx/compose/runtime/internal/WeakReference;", "setValues$runtime_release", "([Landroidx/compose/runtime/internal/WeakReference;)V", "[Landroidx/compose/runtime/internal/WeakReference;", "add", "", "value", "(Ljava/lang/Object;)Z", "find", "hash", "(Ljava/lang/Object;I)I", "findExactIndex", "midIndex", "valueHash", "(ILjava/lang/Object;I)I", "isValid", "isValid$runtime_release", "removeIf", "", "block", "Lkotlin/Function1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapshotWeakSet<T> {
    public static final int $stable = 0;
    private int[] hashes;
    private int size;
    private WeakReference<T>[] values;

    static {
        $stable = 8;
    }

    public SnapshotWeakSet() {
        this.hashes = new int[16];
        this.values = new WeakReference[16];
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    public final void setSize$runtime_release(int r1) {
        this.size = r1;
    }

    public final int[] getHashes$runtime_release() {
        return this.hashes;
    }

    public final void setHashes$runtime_release(int[] r1) {
        this.hashes = r1;
    }

    public final WeakReference<T>[] getValues$runtime_release() {
        return this.values;
    }

    public final void setValues$runtime_release(WeakReference<T>[] r1) {
        this.values = r1;
    }

    public final boolean add(T r15) {
        int size = this.size;
        int hash = Utils_jvmKt.identityHashCode(r15);
        if (size <= 0) goto L7;
        int index = find(r15, hash);
        if (index < 0) goto L8;
        return false;
    L8:
        int insertIndex = -(index + 1);
        int capacity = this.values.length;
        if (size != capacity) goto L11;
        int newCapacity = capacity * 2;
        WeakReference<T>[] r13 = new WeakReference[newCapacity];
        int[] newHashes = new int[newCapacity];
        Object[] $this$fastCopyInto$iv = this.values;
        int destinationOffset$iv = insertIndex + 1;
        System.arraycopy($this$fastCopyInto$iv, insertIndex, r13, destinationOffset$iv, size - insertIndex);
        Object[] $this$fastCopyInto$iv2 = this.values;
        System.arraycopy($this$fastCopyInto$iv2, 0, r13, 0, insertIndex - 0);
        ArraysKt.copyInto(this.hashes, newHashes, insertIndex + 1, insertIndex, size);
        ArraysKt.copyInto$default(this.hashes, newHashes, 0, 0, insertIndex, 6, null);
        this.values = r13;
        this.hashes = newHashes;
    L12:
        this.values[insertIndex] = new WeakReference(r15);
        this.hashes[insertIndex] = hash;
        this.size++;
        return true;
    L11:
        Object[] $this$fastCopyInto$iv3 = this.values;
        Object[] destination$iv = this.values;
        int destinationOffset$iv2 = insertIndex + 1;
        System.arraycopy($this$fastCopyInto$iv3, insertIndex, destination$iv, destinationOffset$iv2, size - insertIndex);
        ArraysKt.copyInto(this.hashes, this.hashes, insertIndex + 1, insertIndex, size);
        goto L12
    L7:
        index = -1;
        goto L8
    }

    public final void removeIf(Function1<? super T, Boolean> r9) {
        int size = getSize$runtime_release();
        int currentUsed = 0;
        int i = 0;
    L3:
        Object value = null;
        if (i >= size) goto L15;
        WeakReference<T> r5 = getValues$runtime_release()[i];
        if (r5 == null) goto L8;
        value = r5.get();
    L8:
        if (value == null) goto L14;
        if (r9.invoke(value).booleanValue() == true) goto L14;
        if (currentUsed == i) goto L13;
        getValues$runtime_release()[currentUsed] = r5;
        getHashes$runtime_release()[currentUsed] = getHashes$runtime_release()[i];
    L13:
        currentUsed = currentUsed + 1;
    L14:
        i = i + 1;
        goto L3
    L15:
        int i2 = currentUsed;
    L16:
        if (i2 >= size) goto L18;
        getValues$runtime_release()[i2] = null;
        getHashes$runtime_release()[i2] = 0;
        i2 = i2 + 1;
        goto L16
    L18:
        if (currentUsed == size) goto L26;
        setSize$runtime_release(currentUsed);
        return;
    }

    private final int find(T r7, int hash) {
        int low = 0;
        int high = this.size - 1;
    L3:
        if (low > high) goto L18;
        int mid = (low + high) >>> 1;
        int midHash = this.hashes[mid];
        if (midHash < hash) goto L6;
        if (midHash <= hash) goto L9;
        high = mid - 1;
        goto L3
    L9:
        WeakReference<T> r4 = this.values[mid];
        if (r4 == null) goto L12;
        Object midVal = r4.get();
    L13:
        if (r7 != midVal) goto L16;
        return mid;
    L16:
        return findExactIndex(mid, r7, hash);
    L12:
        midVal = null;
        goto L13
    L6:
        low = mid + 1;
        goto L3
    L18:
        return -(low + 1);
    }

    private final int findExactIndex(int midIndex, T r6, int valueHash) {
        int i = midIndex - 1;
    L3:
        Object v = null;
        if ((-1) >= i) goto L14;
        if (this.hashes[i] != valueHash) goto L14;
        WeakReference<T> r2 = this.values[i];
        if (r2 == null) goto L11;
        v = r2.get();
    L11:
        if (v == r6) goto L12;
        i = i - 1;
        goto L3
    L12:
        return i;
    L14:
        int i2 = midIndex + 1;
        int r3 = this.size;
    L15:
        if (i2 >= r3) goto L27;
        if (this.hashes[i2] != valueHash) goto L19;
        WeakReference<T> r4 = this.values[i2];
        if (r4 == null) goto L23;
        Object v2 = r4.get();
    L24:
        if (v2 == r6) goto L25;
        i2 = i2 + 1;
        goto L15
    L25:
        return i2;
    L23:
        v2 = null;
        goto L24
    L19:
        return -(i2 + 1);
    L27:
        int i3 = this.size;
        return -(i3 + 1);
    }

    public final boolean isValid$runtime_release() {
        int size = this.size;
        WeakReference<T>[] r1 = this.values;
        int[] hashes = this.hashes;
        int capacity = r1.length;
        if (size <= capacity) goto L5;
        return false;
    L5:
        int previous = Integer.MIN_VALUE;
        int i = 0;
    L6:
        if (i >= size) goto L19;
        int hash = hashes[i];
        if (hash < previous) goto L9;
        WeakReference<T> r8 = r1[i];
        if (r8 == null) goto L12;
        Object value = r8.get();
        if (value == null) goto L18;
        if (hash == Utils_jvmKt.identityHashCode(value)) goto L18;
        return false;
    L18:
        previous = hash;
        i = i + 1;
        goto L6
    L12:
        return false;
    L9:
        return false;
    L19:
        int i2 = size;
    L20:
        if (i2 >= capacity) goto L28;
        if (hashes[i2] != 0) goto L23;
        if (r1[i2] != null) goto L26;
        i2 = i2 + 1;
        goto L20
    L26:
        return false;
    L23:
        return false;
    L28:
        return true;
    }
}
