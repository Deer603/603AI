package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SparseArrayCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a.\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a!\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b\u001a&\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u000e\u001a'\u0010\u000f\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u0010\u001a-\u0010\u000f\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H\u0004H\u0000¢\u0006\u0002\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b\u001a&\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a!\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b\u001a.\u0010\u0019\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a)\u0010\u001a\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0005H\u0080\b\u001a0\u0010\u001c\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0012\u001a \u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a+\u0010\u001d\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0080\b\u001a!\u0010\u001e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b\u001a)\u0010\u001f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0080\b\u001a0\u0010!\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0012\u001a6\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u0002H\u00042\u0006\u0010#\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010$\u001a.\u0010%\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010&\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a\u0019\u0010'\u001a\u00020(\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a&\u0010)\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010*\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0002\u001a:\u0010+\u001a\u0002H,\"\u0004\b\u0000\u0010\u0004\"\n\b\u0001\u0010,*\u0004\u0018\u0001H\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H,H\u0082\b¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"DELETED", "", "commonAppend", "", "E", "Landroidx/collection/SparseArrayCompat;", "key", "", "value", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "commonRemoveAt", "commonRemoveAtRange", "size", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "commonSize", "commonToString", "", "commonValueAt", "gc", "internalGet", "T", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SparseArrayCompatKt {
    private static final Object DELETED = null;

    public static final /* synthetic */ void access$gc(SparseArrayCompat $receiver) {
        gc($receiver);
    }

    public static final /* synthetic */ Object access$getDELETED$p() {
        return DELETED;
    }

    static {
        DELETED = new Object();
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> r4, int r5, T r6) {
        int r1 = ContainerHelpersKt.binarySearch(r4.keys, r4.size, r5);
        if (r1 < 0) goto L9;
        if (r4.values[r1] == DELETED) goto L9;
        return (T) r4.values[r1];
    L9:
        return r6;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> r6, int r7) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        int r3 = ContainerHelpersKt.binarySearch(r6.keys, r6.size, r7);
        if (r3 < 0) goto L10;
        if (r6.values[r3] == DELETED) goto L10;
        return (E) r6.values[r3];
    L10:
        return null;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> r5, int r6, E r7) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        int r2 = ContainerHelpersKt.binarySearch(r5.keys, r5.size, r6);
        if (r2 < 0) goto L10;
        if (r5.values[r2] == DELETED) goto L10;
        return (E) r5.values[r2];
    L10:
        return r7;
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> r3, int key) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        int i = ContainerHelpersKt.binarySearch(r3.keys, r3.size, key);
        if (i >= 0) goto L5;
        return;
    L5:
        if (r3.values[i] == DELETED) goto L9;
        r3.values[i] = DELETED;
        r3.garbage = true;
        return;
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> r4, int key, Object value) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int index = r4.indexOfKey(key);
        if (index < 0) goto L8;
        Object mapValue = r4.valueAt(index);
        if (Intrinsics.areEqual(value, mapValue) == false) goto L10;
        r4.removeAt(index);
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> r3, int index) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        if (r3.values[index] == access$getDELETED$p()) goto L6;
        r3.values[index] = access$getDELETED$p();
        r3.garbage = true;
        return;
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> r3, int index, int size) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        int end = Math.min(size, index + size);
        int i = index;
    L3:
        if (i >= end) goto L5;
        r3.removeAt(i);
        i = i + 1;
        goto L3
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> r4, int r5, E r6) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int r1 = r4.indexOfKey(r5);
        if (r1 < 0) goto L6;
        E r2 = (E) r4.values[r1];
        r4.values[r1] = r6;
        return r2;
    L6:
        return null;
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> r4, int key, E r6, E r7) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int index = r4.indexOfKey(key);
        if (index < 0) goto L8;
        Object mapValue = r4.values[index];
        if (Intrinsics.areEqual(mapValue, r6) == false) goto L10;
        r4.values[index] = r7;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    private static final <E> void gc(SparseArrayCompat<E> r7) {
        int n = r7.size;
        int o = 0;
        int[] keys = r7.keys;
        Object[] values = r7.values;
        int i = 0;
    L3:
        if (i >= n) goto L10;
        Object value = values[i];
        if (value == DELETED) goto L9;
        if (i == o) goto L8;
        keys[o] = keys[i];
        values[o] = value;
        values[i] = null;
    L8:
        o = o + 1;
    L9:
        i = i + 1;
        goto L3
    L10:
        r7.garbage = false;
        r7.size = o;
    }

    public static final <E> void commonPut(SparseArrayCompat<E> r6, int key, E r8) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        int i = ContainerHelpersKt.binarySearch(r6.keys, r6.size, key);
        if (i < 0) goto L5;
        r6.values[i] = r8;
        return;
    L5:
        int i2 = ~i;
        if (i2 >= r6.size) goto L12;
        if (r6.values[i2] != access$getDELETED$p()) goto L12;
        r6.keys[i2] = key;
        r6.values[i2] = r8;
        return;
    L12:
        if (r6.garbage == false) goto L17;
        if (r6.size < r6.keys.length) goto L17;
        access$gc(r6);
        i2 = ~ContainerHelpersKt.binarySearch(r6.keys, r6.size, key);
    L17:
        if (r6.size < r6.keys.length) goto L20;
        int n = ContainerHelpersKt.idealIntArraySize(r6.size + 1);
        int[] r3 = Arrays.copyOf(r6.keys, n);
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        r6.keys = r3;
        Object[] r4 = Arrays.copyOf(r6.values, n);
        Intrinsics.checkNotNullExpressionValue(r4, "copyOf(...)");
        r6.values = r4;
    L20:
        if ((r6.size - i2) == 0) goto L22;
        ArraysKt.copyInto(r6.keys, r6.keys, i2 + 1, i2, r6.size);
        ArraysKt.copyInto(r6.values, r6.values, i2 + 1, i2, r6.size);
    L22:
        r6.keys[i2] = key;
        r6.values[i2] = r8;
        r6.size++;
    }

    public static final <E> void commonPutAll(SparseArrayCompat<E> r12, SparseArrayCompat<? extends E> r13) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        Intrinsics.checkNotNullParameter(r13, "other");
        int i = 0;
        int r2 = r13.size();
    L3:
        if (i >= r2) goto L26;
        int key$iv = r13.keyAt(i);
        Object value$iv = r13.valueAt(i);
        int i$iv = ContainerHelpersKt.binarySearch(r12.keys, r12.size, key$iv);
        if (i$iv < 0) goto L7;
        r12.values[i$iv] = value$iv;
    L25:
        i = i + 1;
        goto L3
    L7:
        int i$iv2 = ~i$iv;
        if (i$iv2 >= r12.size) goto L13;
        if (r12.values[i$iv2] != access$getDELETED$p()) goto L13;
        r12.keys[i$iv2] = key$iv;
        r12.values[i$iv2] = value$iv;
    L13:
        if (r12.garbage == false) goto L18;
        if (r12.size < r12.keys.length) goto L18;
        access$gc(r12);
        i$iv2 = ~ContainerHelpersKt.binarySearch(r12.keys, r12.size, key$iv);
    L18:
        if (r12.size < r12.keys.length) goto L21;
        int n$iv = ContainerHelpersKt.idealIntArraySize(r12.size + 1);
        int[] r9 = Arrays.copyOf(r12.keys, n$iv);
        Intrinsics.checkNotNullExpressionValue(r9, "copyOf(...)");
        r12.keys = r9;
        Object[] r10 = Arrays.copyOf(r12.values, n$iv);
        Intrinsics.checkNotNullExpressionValue(r10, "copyOf(...)");
        r12.values = r10;
    L21:
        if ((r12.size - i$iv2) == 0) goto L23;
        ArraysKt.copyInto(r12.keys, r12.keys, i$iv2 + 1, i$iv2, r12.size);
        ArraysKt.copyInto(r12.values, r12.values, i$iv2 + 1, i$iv2, r12.size);
    L23:
        r12.keys[i$iv2] = key$iv;
        r12.values[i$iv2] = value$iv;
        r12.size++;
        goto L25
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> r9, int r10, E r11) {
        Intrinsics.checkNotNullParameter(r9, "<this>");
        E r1 = (E) commonGet(r9, r10);
        if (r1 != null) goto L25;
        int r4 = ContainerHelpersKt.binarySearch(r9.keys, r9.size, r10);
        if (r4 < 0) goto L7;
        r9.values[r4] = r11;
        goto L25
    L7:
        int r5 = ~r4;
        if (r5 >= r9.size) goto L13;
        if (r9.values[r5] != access$getDELETED$p()) goto L13;
        r9.keys[r5] = r10;
        r9.values[r5] = r11;
    L13:
        if (r9.garbage == false) goto L18;
        if (r9.size < r9.keys.length) goto L18;
        access$gc(r9);
        r5 = ~ContainerHelpersKt.binarySearch(r9.keys, r9.size, r10);
    L18:
        if (r9.size < r9.keys.length) goto L21;
        int r6 = ContainerHelpersKt.idealIntArraySize(r9.size + 1);
        int[] r7 = Arrays.copyOf(r9.keys, r6);
        Intrinsics.checkNotNullExpressionValue(r7, "copyOf(...)");
        r9.keys = r7;
        Object[] r8 = Arrays.copyOf(r9.values, r6);
        Intrinsics.checkNotNullExpressionValue(r8, "copyOf(...)");
        r9.values = r8;
    L21:
        if ((r9.size - r5) == 0) goto L23;
        ArraysKt.copyInto(r9.keys, r9.keys, r5 + 1, r5, r9.size);
        ArraysKt.copyInto(r9.values, r9.values, r5 + 1, r5, r9.size);
    L23:
        r9.keys[r5] = r10;
        r9.values[r5] = r11;
        r9.size++;
    L25:
        return r1;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.garbage == false) goto L6;
        access$gc(r2);
    L6:
        return r2.size;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> r2, int index) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.garbage == false) goto L6;
        access$gc(r2);
    L6:
        return r2.keys[index];
    }

    public static final <E> E commonValueAt(SparseArrayCompat<E> r4, int r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        if (r4.garbage == false) goto L6;
        access$gc(r4);
    L6:
        if (r5 < r4.values.length) goto L8;
        CollectionPlatformUtils r1 = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    L8:
        return (E) r4.values[r5];
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> r2, int index, E r4) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.garbage == false) goto L5;
        access$gc(r2);
    L5:
        r2.values[index] = r4;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> r3, int key) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        if (r3.garbage == false) goto L6;
        access$gc(r3);
    L6:
        return ContainerHelpersKt.binarySearch(r3.keys, r3.size, key);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> r4, E r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        if (r4.garbage == false) goto L5;
        access$gc(r4);
    L5:
        int i = 0;
        int r2 = r4.size;
    L6:
        if (i >= r2) goto L11;
        if (r4.values[i] == r5) goto L9;
        i = i + 1;
        goto L6
    L9:
        return i;
    L11:
        return -1;
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> r2, int key) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.indexOfKey(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> r6, E r7) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        if (r6.garbage == false) goto L5;
        access$gc(r6);
    L5:
        int i$iv = 0;
        int r4 = r6.size;
    L6:
        if (i$iv >= r4) goto L11;
        if (r6.values[i$iv] == r7) goto L12;
        i$iv = i$iv + 1;
    L12:
        if (i$iv < 0) goto L14;
        return true;
    L14:
        return false;
    L11:
        i$iv = -1;
        goto L12
    }

    public static final <E> void commonClear(SparseArrayCompat<E> r5) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        int n = r5.size;
        Object[] values = r5.values;
        int i = 0;
    L3:
        if (i >= n) goto L5;
        values[i] = null;
        i = i + 1;
        goto L3
    L5:
        r5.size = 0;
        r5.garbage = false;
    }

    public static final <E> void commonAppend(SparseArrayCompat<E> r5, int key, E r7) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        if (r5.size == 0) goto L9;
        if (key > r5.keys[r5.size - 1]) goto L9;
        r5.put(key, r7);
        return;
    L9:
        if (r5.garbage == true) goto L11;
    L13:
        int pos = r5.size;
        if (pos < r5.keys.length) goto L16;
        int n = ContainerHelpersKt.idealIntArraySize(pos + 1);
        int[] r3 = Arrays.copyOf(r5.keys, n);
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        r5.keys = r3;
        Object[] r4 = Arrays.copyOf(r5.values, n);
        Intrinsics.checkNotNullExpressionValue(r4, "copyOf(...)");
        r5.values = r4;
    L16:
        r5.keys[pos] = key;
        r5.values[pos] = r7;
        r5.size = pos + 1;
        return;
    L11:
        if (r5.size < r5.keys.length) goto L13;
        access$gc(r5);
        goto L13
    }

    public static final <E> String commonToString(SparseArrayCompat<E> r7) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        if (r7.size() > 0) goto L6;
        return "{}";
    L6:
        StringBuilder buffer = new StringBuilder(r7.size * 28);
        buffer.append('{');
        int i = 0;
        int r3 = r7.size;
    L7:
        if (i >= r3) goto L15;
        if (i <= 0) goto L10;
        buffer.append(", ");
    L10:
        int key = r7.keyAt(i);
        buffer.append(key);
        buffer.append('=');
        Object value = r7.valueAt(i);
        if (value == r7) goto L13;
        buffer.append(value);
    L14:
        i = i + 1;
        goto L7
    L13:
        buffer.append("(this Map)");
        goto L14
    L15:
        buffer.append('}');
        String r2 = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        return r2;
    }
}
