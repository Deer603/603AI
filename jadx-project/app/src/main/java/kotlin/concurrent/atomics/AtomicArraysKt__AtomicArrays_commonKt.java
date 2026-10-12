package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicArrays.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a-\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0007\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\n\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u000b\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\f\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00140\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"AtomicIntArray", "Lkotlin/concurrent/atomics/AtomicIntArray;", "size", "", "init", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "fetchAndIncrementAt", "index", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;I)I", "incrementAndFetchAt", "decrementAndFetchAt", "fetchAndDecrementAt", "AtomicLongArray", "Lkotlin/concurrent/atomics/AtomicLongArray;", "", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;I)J", "AtomicArray", "Lkotlin/concurrent/atomics/AtomicArray;", "T", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicArraysKt")
class AtomicArraysKt__AtomicArrays_commonKt {
    public AtomicArraysKt__AtomicArrays_commonKt() {
    }

    public static final AtomicIntegerArray AtomicIntArray(int size, Function1<? super Integer, Integer> r5) {
        Intrinsics.checkNotNullParameter(r5, "init");
        int[] r1 = new int[size];
        int r2 = 0;
    L3:
        if (r2 >= size) goto L6;
        r1[r2] = r5.invoke(Integer.valueOf(r2)).intValue();
        r2 = r2 + 1;
        goto L3
    L6:
        return new AtomicIntegerArray(r1);
    }

    public static final int fetchAndIncrementAt(AtomicIntegerArray $this$fetchAndIncrementAt, int index) {
        Intrinsics.checkNotNullParameter($this$fetchAndIncrementAt, "<this>");
        return $this$fetchAndIncrementAt.getAndAdd(index, 1);
    }

    public static final int incrementAndFetchAt(AtomicIntegerArray $this$incrementAndFetchAt, int index) {
        Intrinsics.checkNotNullParameter($this$incrementAndFetchAt, "<this>");
        return $this$incrementAndFetchAt.addAndGet(index, 1);
    }

    public static final int decrementAndFetchAt(AtomicIntegerArray $this$decrementAndFetchAt, int index) {
        Intrinsics.checkNotNullParameter($this$decrementAndFetchAt, "<this>");
        return $this$decrementAndFetchAt.addAndGet(index, -1);
    }

    public static final int fetchAndDecrementAt(AtomicIntegerArray $this$fetchAndDecrementAt, int index) {
        Intrinsics.checkNotNullParameter($this$fetchAndDecrementAt, "<this>");
        return $this$fetchAndDecrementAt.getAndAdd(index, -1);
    }

    public static final AtomicLongArray AtomicLongArray(int size, Function1<? super Integer, Long> r6) {
        Intrinsics.checkNotNullParameter(r6, "init");
        long[] r1 = new long[size];
        int r2 = 0;
    L3:
        if (r2 >= size) goto L6;
        r1[r2] = r6.invoke(Integer.valueOf(r2)).longValue();
        r2 = r2 + 1;
        goto L3
    L6:
        return new AtomicLongArray(r1);
    }

    public static final long fetchAndIncrementAt(AtomicLongArray $this$fetchAndIncrementAt, int index) {
        Intrinsics.checkNotNullParameter($this$fetchAndIncrementAt, "<this>");
        return $this$fetchAndIncrementAt.getAndAdd(index, 1);
    }

    public static final long incrementAndFetchAt(AtomicLongArray $this$incrementAndFetchAt, int index) {
        Intrinsics.checkNotNullParameter($this$incrementAndFetchAt, "<this>");
        return $this$incrementAndFetchAt.addAndGet(index, 1);
    }

    public static final long decrementAndFetchAt(AtomicLongArray $this$decrementAndFetchAt, int index) {
        Intrinsics.checkNotNullParameter($this$decrementAndFetchAt, "<this>");
        return $this$decrementAndFetchAt.addAndGet(index, -1);
    }

    public static final long fetchAndDecrementAt(AtomicLongArray $this$fetchAndDecrementAt, int index) {
        Intrinsics.checkNotNullParameter($this$fetchAndDecrementAt, "<this>");
        return $this$fetchAndDecrementAt.getAndAdd(index, -1);
    }

    public static final /* synthetic */ <T> AtomicReferenceArray<T> AtomicArray(int size, Function1<? super Integer, ? extends T> r5) {
        Intrinsics.checkNotNullParameter(r5, "init");
        int r2 = 0;
        Intrinsics.reifiedOperationMarker(0, "T");
        Object[] r1 = new Object[size];
    L3:
        if (r2 >= size) goto L6;
        r1[r2] = r5.invoke(Integer.valueOf(r2));
        r2 = r2 + 1;
        goto L3
    L6:
        return new AtomicReferenceArray(r1);
    }
}
