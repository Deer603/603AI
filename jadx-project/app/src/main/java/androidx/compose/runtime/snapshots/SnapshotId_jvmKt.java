package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotId.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0019\u0010\f\u001a\u00060\bj\u0002`\t2\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0080\b\u001a\u0014\u0010\u000e\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0005*\u00060\bj\u0002`\t2\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a\u001d\u0010\u0011\u001a\u00020\u0005*\u00060\u0001j\u0002`\u00022\n\u0010\u0012\u001a\u00060\u0001j\u0002`\u0002H\u0080\n\u001a\u0019\u0010\u0011\u001a\u00020\u0005*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u001d\u0010\u0013\u001a\u00020\u0014*\u00060\bj\u0002`\t2\n\u0010\u0012\u001a\u00060\bj\u0002`\tH\u0080\b\u001a\u001d\u0010\u0015\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u0015\u0010\u0016\u001a\u00060\u0001j\u0002`\u0002*\u00060\bj\u0002`\tH\u0080\b\u001a)\u0010\u0017\u001a\u00020\u0014*\u00060\bj\u0002`\t2\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00140\u0019H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u0005H\u0080\n\u001a!\u0010\u001c\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\n\u0010\u0012\u001a\u00060\u0001j\u0002`\u0002H\u0080\n\u001a\u001d\u0010\u001c\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u001d\u0010\u001d\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a%\u0010\u001e\u001a\u00020\u0014*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u00052\n\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002H\u0080\n\u001a\u001d\u0010 \u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0080\n\u001a\u0011\u0010!\u001a\u00020\u0005*\u00060\u0001j\u0002`\u0002H\u0086\b\u001a\u0011\u0010\"\u001a\u00020\u0001*\u00060\u0001j\u0002`\u0002H\u0086\b\u001a\u0010\u0010#\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0005H\u0000\u001a(\u0010$\u001a\u00060\bj\u0002`\t*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a \u0010%\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t*\u00060\bj\u0002`\t2\u0006\u0010\u001b\u001a\u00020\u0005H\u0000\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002X\u0080T¢\u0006\u0002\n\u0000\"\u001d\u0010\u0007\u001a\u00020\u0005*\u00060\bj\u0002`\t8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010&\"\u00020\u00012\u00020\u0001*\n\u0010'\"\u00020\b2\u00020\b¨\u0006("}, d2 = {"SnapshotIdInvalidValue", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "SnapshotIdMax", "SnapshotIdSize", "", "SnapshotIdZero", "size", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "getSize", "([J)I", "snapshotIdArrayOf", "id", "snapshotIdArrayWithCapacity", "capacity", "binarySearch", "compareTo", "other", "copyInto", "", "div", "first", "forEach", "block", "Lkotlin/Function1;", "get", "index", "minus", "plus", "set", "value", "times", "toInt", "toLong", "toSnapshotId", "withIdInsertedAt", "withIdRemovedAt", "SnapshotId", "SnapshotIdArray", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapshotId_jvmKt {
    public static final long SnapshotIdInvalidValue = -1;
    public static final long SnapshotIdMax = Long.MAX_VALUE;
    public static final int SnapshotIdSize = 64;
    public static final long SnapshotIdZero = 0;

    public static final int compareTo(long $this$compareTo, long other) {
        return Intrinsics.compare($this$compareTo, other);
    }

    public static final int compareTo(long $this$compareTo, int other) {
        return Intrinsics.compare($this$compareTo, other);
    }

    public static final long plus(long $this$plus, int other) {
        return ((long) other) + $this$plus;
    }

    public static final long minus(long $this$minus, long other) {
        return $this$minus - other;
    }

    public static final long minus(long $this$minus, int other) {
        return $this$minus - ((long) other);
    }

    public static final long div(long $this$div, int other) {
        return $this$div / ((long) other);
    }

    public static final long times(long $this$times, int other) {
        return ((long) other) * $this$times;
    }

    public static final int toInt(long $this$toInt) {
        return (int) $this$toInt;
    }

    public static final long toLong(long $this$toLong) {
        return $this$toLong;
    }

    public static final long[] snapshotIdArrayWithCapacity(int capacity) {
        return new long[capacity];
    }

    public static final long get(long[] $this$get, int index) {
        return $this$get[index];
    }

    public static final void set(long[] $this$set, int index, long value) {
        $this$set[index] = value;
    }

    public static final int getSize(long[] $this$size) {
        return $this$size.length;
    }

    public static final void copyInto(long[] $this$copyInto, long[] other) {
        ArraysKt.copyInto$default($this$copyInto, other, 0, 0, 0, 12, null);
    }

    public static final long first(long[] $this$first) {
        return $this$first[0];
    }

    public static final int binarySearch(long[] $this$binarySearch, long id) {
        int low = 0;
        int high = $this$binarySearch.length - 1;
    L3:
        if (low > high) goto L12;
        int mid = (low + high) >>> 1;
        long midVal = $this$binarySearch[mid];
        if (id > midVal) goto L6;
        if (id >= midVal) goto L10;
        high = mid - 1;
        goto L3
    L10:
        return mid;
    L6:
        low = mid + 1;
        goto L3
    L12:
        return -(low + 1);
    }

    public static final void forEach(long[] $this$forEach, Function1<? super Long, Unit> r7) {
        int r1 = $this$forEach.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        long value = $this$forEach[r2];
        r7.invoke(Long.valueOf(value));
        r2 = r2 + 1;
        goto L3
    }

    public static final long[] withIdInsertedAt(long[] $this$withIdInsertedAt, int index, long id) {
        int newSize = $this$withIdInsertedAt.length + 1;
        long[] newArray = new long[newSize];
        ArraysKt.copyInto($this$withIdInsertedAt, newArray, 0, 0, index);
        ArraysKt.copyInto($this$withIdInsertedAt, newArray, index + 1, index, newSize - 1);
        newArray[index] = id;
        return newArray;
    }

    public static final long[] withIdRemovedAt(long[] $this$withIdRemovedAt, int index) {
        int newSize = $this$withIdRemovedAt.length - 1;
        if (newSize != 0) goto L6;
        return null;
    L6:
        long[] newArray = new long[newSize];
        if (index <= 0) goto L9;
        ArraysKt.copyInto($this$withIdRemovedAt, newArray, 0, 0, index);
    L9:
        if (index >= newSize) goto L11;
        ArraysKt.copyInto($this$withIdRemovedAt, newArray, index, index + 1, newSize + 1);
    L11:
        return newArray;
    }

    public static final long[] snapshotIdArrayOf(long id) {
        return new long[]{id};
    }

    public static final long toSnapshotId(int $this$toSnapshotId) {
        return $this$toSnapshotId;
    }
}
