package androidx.compose.runtime.collection;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a@\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a0\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\n\"\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0014\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a \u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¨\u0006\u0017"}, d2 = {"MutableVector", "Landroidx/compose/runtime/collection/MutableVector;", "T", "capacity", "", "size", "init", "Lkotlin/Function1;", "mutableVectorOf", "elements", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "throwListIndexOutOfBoundsException", "", "index", "throwNegativeIndexException", "fromIndex", "throwOutOfRangeException", "toIndex", "throwReversedIndicesException", "checkIndex", "", "checkSubIndex", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MutableVectorKt {
    public static final void checkIndex(List<?> r1, int index) {
        int size = r1.size();
        if (index < 0) goto L5;
        if (index >= size) goto L5;
        return;
    L5:
        throwListIndexOutOfBoundsException(index, size);
    }

    private static final void throwListIndexOutOfBoundsException(int index, int size) {
        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. The list has " + size + " elements.");
    }

    public static final void checkSubIndex(List<?> r1, int fromIndex, int toIndex) {
        if (fromIndex <= toIndex) goto L4;
        throwReversedIndicesException(fromIndex, toIndex);
    L4:
        if (fromIndex >= 0) goto L7;
        throwNegativeIndexException(fromIndex);
    L7:
        if (toIndex <= r1.size()) goto L10;
        throwOutOfRangeException(toIndex, r1.size());
        return;
    }

    private static final void throwOutOfRangeException(int toIndex, int size) {
        throw new IndexOutOfBoundsException("toIndex (" + toIndex + ") is more than than the list size (" + size + ')');
    }

    private static final void throwNegativeIndexException(int fromIndex) {
        throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") is less than 0.");
    }

    private static final void throwReversedIndicesException(int fromIndex, int toIndex) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + fromIndex + ") is greater than toIndex (" + toIndex + ").");
    }

    public static /* synthetic */ MutableVector MutableVector$default(int capacity, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        capacity = 16;
    L5:
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[capacity], 0);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int capacity) {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[capacity], 0);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int size, Function1<? super Integer, ? extends T> r5) {
        int r2 = 0;
        Intrinsics.reifiedOperationMarker(0, "T");
        Object[] arr = new Object[size];
    L3:
        if (r2 >= size) goto L6;
        arr[r2] = r5.invoke(Integer.valueOf(r2));
        r2 = r2 + 1;
        goto L3
    L6:
        return new MutableVector(arr, size);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[16], 0);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... r3) {
        return new MutableVector(r3, r3.length);
    }
}
