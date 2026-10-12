package androidx.compose.runtime.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotThreadLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ThreadMap {
    public static final int $stable = 0;
    private final long[] keys;
    private final int size;
    private final Object[] values;

    static {
        $stable = 8;
    }

    public ThreadMap(int size, long[] keys, Object[] values) {
        this.size = size;
        this.keys = keys;
        this.values = values;
    }

    public final Object get(long key) {
        int index = find(key);
        if (index >= 0) goto L7;
        return null;
    L7:
        return this.values[index];
    }

    public final boolean trySet(long key, Object value) {
        int index = find(key);
        if (index >= 0) goto L6;
        return false;
    L6:
        this.values[index] = value;
        return true;
    }

    public final ThreadMap newWith(long key, Object value) {
        int size = this.size;
        Object[] $this$count$iv = this.values;
        int count$iv = 0;
        int r4 = $this$count$iv.length;
        int r6 = 0;
    L3:
        boolean r7 = true;
        if (r6 >= r4) goto L12;
        Object element$iv = $this$count$iv[r6];
        if (element$iv != null) goto L9;
        r7 = false;
    L9:
        if (r7 == false) goto L11;
        count$iv = count$iv + 1;
    L11:
        r6 = r6 + 1;
        goto L3
    L12:
        int newSize = count$iv + 1;
        long[] newKeys = new long[newSize];
        Object[] newValues = new Object[newSize];
        if (newSize <= 1) goto L30;
        int dest = 0;
        int source = 0;
    L15:
        if (dest >= newSize) goto L23;
        if (source >= size) goto L23;
        long oldKey = this.keys[source];
        Object oldValue = this.values[source];
        if (oldKey > key) goto L19;
        if (oldValue == null) goto L22;
        newKeys[dest] = oldKey;
        newValues[dest] = oldValue;
        dest = dest + 1;
    L22:
        source = source + 1;
        goto L15
    L19:
        newKeys[dest] = key;
        newValues[dest] = value;
        dest = dest + 1;
    L23:
        if (source != size) goto L25;
        newKeys[newSize - 1] = key;
        newValues[newSize - 1] = value;
    L32:
        return new ThreadMap(newSize, newKeys, newValues);
    L25:
        if (dest >= newSize) goto L32;
        long oldKey2 = this.keys[source];
        Object oldValue2 = this.values[source];
        if (oldValue2 == null) goto L29;
        newKeys[dest] = oldKey2;
        newValues[dest] = oldValue2;
        dest = dest + 1;
    L29:
        source = source + 1;
        goto L25
    L30:
        newKeys[0] = key;
        newValues[0] = value;
        goto L32
    }

    private final int find(long key) {
        int high = this.size - 1;
        switch(high) {
            case -1: goto L12;
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        int low = 0;
    L13:
        if (low > high) goto L22;
        int mid = (low + high) >>> 1;
        long midVal = this.keys[mid];
        long comparison = midVal - key;
        if (comparison < 0) goto L16;
        if (comparison <= 0) goto L20;
        high = mid - 1;
        goto L13
    L20:
        return mid;
    L16:
        low = mid + 1;
        goto L13
    L22:
        return -(low + 1);
    L12:
        return -1;
    L6:
        if (this.keys[0] != key) goto L9;
        return 0;
    L9:
        if (this.keys[0] <= key) goto L31;
        return -2;
    L31:
        return -1;
    }
}
