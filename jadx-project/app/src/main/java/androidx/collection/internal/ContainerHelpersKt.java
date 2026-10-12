package androidx.collection.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContainerHelpers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0000\u001a \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0000X\u0081\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0016"}, d2 = {"EMPTY_INTS", "", "EMPTY_LONGS", "", "EMPTY_OBJECTS", "", "", "[Ljava/lang/Object;", "binarySearch", "", "array", "size", "value", "", "equal", "", "a", "b", "idealByteArraySize", "need", "idealIntArraySize", "idealLongArraySize", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContainerHelpersKt {
    public static final int[] EMPTY_INTS = null;
    public static final long[] EMPTY_LONGS = null;
    public static final Object[] EMPTY_OBJECTS = null;

    static {
        EMPTY_INTS = new int[0];
        EMPTY_LONGS = new long[0];
        EMPTY_OBJECTS = new Object[0];
    }

    public static final int idealIntArraySize(int need) {
        return idealByteArraySize(need * 4) / 4;
    }

    public static final int idealLongArraySize(int need) {
        return idealByteArraySize(need * 8) / 8;
    }

    public static final int idealByteArraySize(int need) {
        int i = 4;
    L4:
        if (i >= 32) goto L10;
        if (need <= ((1 << i) - 12)) goto L8;
        i = i + 1;
        goto L4
    L8:
        return (1 << i) - 12;
    L10:
        return need;
    }

    public static final boolean equal(Object a, Object b) {
        return Intrinsics.areEqual(a, b);
    }

    public static final int binarySearch(int[] array, int size, int value) {
        Intrinsics.checkNotNullParameter(array, "array");
        int lo = 0;
        int hi = size - 1;
    L3:
        if (lo > hi) goto L11;
        int mid = (lo + hi) >>> 1;
        int midVal = array[mid];
        if (midVal < value) goto L6;
        if (midVal <= value) goto L9;
        hi = mid - 1;
        goto L3
    L9:
        return mid;
    L6:
        lo = mid + 1;
        goto L3
    L11:
        return ~lo;
    }

    public static final int binarySearch(long[] array, int size, long value) {
        Intrinsics.checkNotNullParameter(array, "array");
        int lo = 0;
        int hi = size - 1;
    L3:
        if (lo > hi) goto L12;
        int mid = (lo + hi) >>> 1;
        long midVal = array[mid];
        if (midVal < value) goto L6;
        if (midVal <= value) goto L10;
        hi = mid - 1;
        goto L3
    L10:
        return mid;
    L6:
        lo = mid + 1;
        goto L3
    L12:
        return ~lo;
    }
}
