package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\u001a.\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a!\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b\u001a&\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a(\u0010\u0017\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b¢\u0006\u0002\u0010\u0018\u001a.\u0010\u0017\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001a\u001a%\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0080\b\u001a!\u0010\u001c\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b\u001a&\u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a!\u0010 \u001a\u00020\u000e\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\u0080\b\u001a.\u0010\"\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u0010\u001a)\u0010#\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u0005H\u0080\b\u001a0\u0010%\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001a\u001a!\u0010&\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b\u001a.\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010'\u001a!\u0010(\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\u0080\b\u001a0\u0010)\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001a\u001a6\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u0002H\f2\u0006\u0010+\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010,\u001a.\u0010-\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010.\u001a\u0019\u0010/\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a\u0019\u00100\u001a\u000201\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a&\u00102\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\u0080\b¢\u0006\u0002\u00103\u001a!\u00104\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0086\n\u001aT\u00105\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000526\u00106\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b07H\u0086\bø\u0001\u0000\u001a.\u0010:\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\u0004H\u0086\b¢\u0006\u0002\u0010\u001a\u001a7\u0010;\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00040<H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010=\u001a\u0019\u0010>\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0086\b\u001a\u0016\u0010?\u001a\u00020@\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005\u001a-\u0010A\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0086\u0002\u001a-\u0010B\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010'\u001a.\u0010C\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0004H\u0086\n¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010D\u001a\b\u0012\u0004\u0012\u0002H\u00040E\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00058Æ\u0002¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"DELETED", "", "size", "", "T", "Landroidx/collection/LongSparseArray;", "getSize$annotations", "(Landroidx/collection/LongSparseArray;)V", "getSize", "(Landroidx/collection/LongSparseArray;)I", "commonAppend", "", "E", "key", "", "value", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonGc", "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "commonGetInternal", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "commonRemoveAt", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonSize", "commonToString", "", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "contains", "forEach", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getOrDefault", "getOrElse", "Lkotlin/Function0;", "(Landroidx/collection/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "keyIterator", "Lkotlin/collections/LongIterator;", "plus", "remove", "set", "valueIterator", "", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LongSparseArrayKt {
    private static final Object DELETED = null;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.collection.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u000e\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"androidx/collection/LongSparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C01581<T> implements Iterator<T>, KMappedMarker {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C01581(LongSparseArray<T> r1) {
            this.$this_valueIterator = r1;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int r1) {
            this.index = r1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.index >= this.$this_valueIterator.size()) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> r0 = this.$this_valueIterator;
            int r1 = this.index;
            this.index = r1 + 1;
            return r0.valueAt(r1);
        }
    }

    public static final /* synthetic */ Object access$getDELETED$p() {
        return DELETED;
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray r0) {
    }

    static {
        DELETED = new Object();
    }

    public static final <E> E commonGet(LongSparseArray<E> r7, long r8) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        int r4 = ContainerHelpersKt.binarySearch(r7.keys, r7.size, r8);
        if (r4 < 0) goto L10;
        if (r7.values[r4] == access$getDELETED$p()) goto L10;
        return (E) r7.values[r4];
    L10:
        return null;
    }

    public static final <E> E commonGet(LongSparseArray<E> r6, long r7, E r9) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        int r3 = ContainerHelpersKt.binarySearch(r6.keys, r6.size, r7);
        if (r3 < 0) goto L10;
        if (r6.values[r3] == access$getDELETED$p()) goto L10;
        return (E) r6.values[r3];
    L10:
        return r9;
    }

    public static final Object commonGetInternal(LongSparseArray<?> r4, long key, Object defaultValue) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int i = ContainerHelpersKt.binarySearch(r4.keys, r4.size, key);
        if (i < 0) goto L9;
        if (r4.values[i] == access$getDELETED$p()) goto L9;
        return r4.values[i];
    L9:
        return defaultValue;
    }

    public static final <E> void commonRemove(LongSparseArray<E> r4, long key) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int i = ContainerHelpersKt.binarySearch(r4.keys, r4.size, key);
        if (i >= 0) goto L5;
        return;
    L5:
        if (r4.values[i] == access$getDELETED$p()) goto L9;
        r4.values[i] = access$getDELETED$p();
        r4.garbage = true;
        return;
    }

    public static final <E> boolean commonRemove(LongSparseArray<E> r4, long key, E r7) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int index = r4.indexOfKey(key);
        if (index < 0) goto L8;
        Object mapValue = r4.valueAt(index);
        if (Intrinsics.areEqual(r7, mapValue) == false) goto L10;
        r4.removeAt(index);
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public static final <E> void commonRemoveAt(LongSparseArray<E> r3, int index) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        if (r3.values[index] == access$getDELETED$p()) goto L6;
        r3.values[index] = access$getDELETED$p();
        r3.garbage = true;
        return;
    }

    public static final <E> E commonReplace(LongSparseArray<E> r4, long r5, E r7) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int r1 = r4.indexOfKey(r5);
        if (r1 < 0) goto L6;
        E r2 = (E) r4.values[r1];
        r4.values[r1] = r7;
        return r2;
    L6:
        return null;
    }

    public static final <E> boolean commonReplace(LongSparseArray<E> r4, long key, E r7, E r8) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int index = r4.indexOfKey(key);
        if (index < 0) goto L8;
        Object mapValue = r4.values[index];
        if (Intrinsics.areEqual(mapValue, r7) == false) goto L10;
        r4.values[index] = r8;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public static final <E> void commonGc(LongSparseArray<E> r9) {
        Intrinsics.checkNotNullParameter(r9, "<this>");
        int n = r9.size;
        int newSize = 0;
        long[] keys = r9.keys;
        Object[] values = r9.values;
        int i = 0;
    L3:
        if (i >= n) goto L10;
        Object value = values[i];
        if (value == access$getDELETED$p()) goto L9;
        if (i == newSize) goto L8;
        keys[newSize] = keys[i];
        values[newSize] = value;
        values[i] = null;
    L8:
        newSize = newSize + 1;
    L9:
        i = i + 1;
        goto L3
    L10:
        r9.garbage = false;
        r9.size = newSize;
    }

    public static final <E> void commonPut(LongSparseArray<E> r12, long key, E r15) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        int index = ContainerHelpersKt.binarySearch(r12.keys, r12.size, key);
        if (index < 0) goto L5;
        r12.values[index] = r15;
        return;
    L5:
        int index2 = ~index;
        if (index2 >= r12.size) goto L12;
        if (r12.values[index2] != access$getDELETED$p()) goto L12;
        r12.keys[index2] = key;
        r12.values[index2] = r15;
        return;
    L12:
        if (r12.garbage == false) goto L25;
        if (r12.size < r12.keys.length) goto L25;
        int n$iv = r12.size;
        int newSize$iv = 0;
        long[] keys$iv = r12.keys;
        Object[] values$iv = r12.values;
        int i$iv = 0;
    L16:
        if (i$iv >= n$iv) goto L23;
        Object value$iv = values$iv[i$iv];
        if (value$iv == access$getDELETED$p()) goto L22;
        if (i$iv == newSize$iv) goto L21;
        keys$iv[newSize$iv] = keys$iv[i$iv];
        values$iv[newSize$iv] = value$iv;
        values$iv[i$iv] = null;
    L21:
        newSize$iv = newSize$iv + 1;
    L22:
        i$iv = i$iv + 1;
        goto L16
    L23:
        r12.garbage = false;
        r12.size = newSize$iv;
        index2 = ~ContainerHelpersKt.binarySearch(r12.keys, r12.size, key);
    L25:
        if (r12.size < r12.keys.length) goto L28;
        int newSize = ContainerHelpersKt.idealLongArraySize(r12.size + 1);
        long[] r3 = Arrays.copyOf(r12.keys, newSize);
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        r12.keys = r3;
        Object[] r4 = Arrays.copyOf(r12.values, newSize);
        Intrinsics.checkNotNullExpressionValue(r4, "copyOf(...)");
        r12.values = r4;
    L28:
        if ((r12.size - index2) == 0) goto L30;
        ArraysKt.copyInto(r12.keys, r12.keys, index2 + 1, index2, r12.size);
        ArraysKt.copyInto(r12.values, r12.values, index2 + 1, index2, r12.size);
    L30:
        r12.keys[index2] = key;
        r12.values[index2] = r15;
        r12.size++;
    }

    public static final <E> void commonPutAll(LongSparseArray<E> r8, LongSparseArray<? extends E> r9) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "other");
        int size = r9.size();
        int r2 = 0;
    L3:
        if (r2 >= size) goto L5;
        int i = r2;
        r8.put(r9.keyAt(i), r9.valueAt(i));
        r2 = r2 + 1;
        goto L3
    }

    public static final <E> E commonPutIfAbsent(LongSparseArray<E> r2, long key, E r5) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        E r1 = r2.get(key);
        if (r1 != null) goto L5;
        r2.put(key, r5);
    L5:
        return r1;
    }

    public static final <E> int commonSize(LongSparseArray<E> r11) {
        Intrinsics.checkNotNullParameter(r11, "<this>");
        if (r11.garbage == false) goto L14;
        int n$iv = r11.size;
        int newSize$iv = 0;
        long[] keys$iv = r11.keys;
        Object[] values$iv = r11.values;
        int i$iv = 0;
    L5:
        if (i$iv >= n$iv) goto L12;
        Object value$iv = values$iv[i$iv];
        if (value$iv == access$getDELETED$p()) goto L11;
        if (i$iv == newSize$iv) goto L10;
        keys$iv[newSize$iv] = keys$iv[i$iv];
        values$iv[newSize$iv] = value$iv;
        values$iv[i$iv] = null;
    L10:
        newSize$iv = newSize$iv + 1;
    L11:
        i$iv = i$iv + 1;
        goto L5
    L12:
        r11.garbage = false;
        r11.size = newSize$iv;
    L14:
        return r11.size;
    }

    public static final <E> boolean commonIsEmpty(LongSparseArray<E> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <E> long commonKeyAt(LongSparseArray<E> r12, int index) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        if (index >= 0) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L11;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + index);
    L11:
        boolean value$iv2 = r12.garbage;
        if (value$iv2 == false) goto L23;
        int n$iv = r12.size;
        int newSize$iv = 0;
        long[] keys$iv = r12.keys;
        Object[] values$iv = r12.values;
        int i$iv = 0;
    L14:
        if (i$iv >= n$iv) goto L21;
        Object value$iv3 = values$iv[i$iv];
        if (value$iv3 == access$getDELETED$p()) goto L20;
        if (i$iv == newSize$iv) goto L19;
        keys$iv[newSize$iv] = keys$iv[i$iv];
        values$iv[newSize$iv] = value$iv3;
        values$iv[i$iv] = null;
    L19:
        newSize$iv = newSize$iv + 1;
    L20:
        i$iv = i$iv + 1;
        goto L14
    L21:
        r12.garbage = false;
        r12.size = newSize$iv;
    L23:
        return r12.keys[index];
    L5:
        if (index >= r12.size) goto L7;
        value$iv = true;
        goto L9
    }

    public static final <E> E commonValueAt(LongSparseArray<E> r12, int r13) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        if (r13 >= 0) goto L5;
    L7:
        boolean r2 = false;
    L9:
        if (r2 == true) goto L12;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + r13);
    L12:
        if (r12.garbage == false) goto L23;
        int r4 = r12.size;
        int r5 = 0;
        long[] r6 = r12.keys;
        Object[] r7 = r12.values;
        int r8 = 0;
    L14:
        if (r8 >= r4) goto L21;
        Object r9 = r7[r8];
        if (r9 == access$getDELETED$p()) goto L20;
        if (r8 == r5) goto L19;
        r6[r5] = r6[r8];
        r7[r5] = r9;
        r7[r8] = null;
    L19:
        r5 = r5 + 1;
    L20:
        r8 = r8 + 1;
        goto L14
    L21:
        r12.garbage = false;
        r12.size = r5;
    L23:
        return (E) r12.values[r13];
    L5:
        if (r13 >= r12.size) goto L7;
        r2 = true;
        goto L9
    }

    public static final <E> void commonSetValueAt(LongSparseArray<E> r12, int index, E r14) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        if (index >= 0) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L11;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + index);
    L11:
        boolean value$iv2 = r12.garbage;
        if (value$iv2 == false) goto L22;
        int n$iv = r12.size;
        int newSize$iv = 0;
        long[] keys$iv = r12.keys;
        Object[] values$iv = r12.values;
        int i$iv = 0;
    L14:
        if (i$iv >= n$iv) goto L21;
        Object value$iv3 = values$iv[i$iv];
        if (value$iv3 == access$getDELETED$p()) goto L20;
        if (i$iv == newSize$iv) goto L19;
        keys$iv[newSize$iv] = keys$iv[i$iv];
        values$iv[newSize$iv] = value$iv3;
        values$iv[i$iv] = null;
    L19:
        newSize$iv = newSize$iv + 1;
    L20:
        i$iv = i$iv + 1;
        goto L14
    L21:
        r12.garbage = false;
        r12.size = newSize$iv;
    L22:
        r12.values[index] = r14;
        return;
    L5:
        if (index >= r12.size) goto L7;
        value$iv = true;
        goto L9
    }

    public static final <E> int commonIndexOfKey(LongSparseArray<E> r11, long key) {
        Intrinsics.checkNotNullParameter(r11, "<this>");
        if (r11.garbage == false) goto L14;
        int n$iv = r11.size;
        int newSize$iv = 0;
        long[] keys$iv = r11.keys;
        Object[] values$iv = r11.values;
        int i$iv = 0;
    L5:
        if (i$iv >= n$iv) goto L12;
        Object value$iv = values$iv[i$iv];
        if (value$iv == access$getDELETED$p()) goto L11;
        if (i$iv == newSize$iv) goto L10;
        keys$iv[newSize$iv] = keys$iv[i$iv];
        values$iv[newSize$iv] = value$iv;
        values$iv[i$iv] = null;
    L10:
        newSize$iv = newSize$iv + 1;
    L11:
        i$iv = i$iv + 1;
        goto L5
    L12:
        r11.garbage = false;
        r11.size = newSize$iv;
    L14:
        return ContainerHelpersKt.binarySearch(r11.keys, r11.size, key);
    }

    public static final <E> int commonIndexOfValue(LongSparseArray<E> r12, E r13) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        int r2 = 0;
        if (r12.garbage == false) goto L13;
        int n$iv = r12.size;
        int newSize$iv = 0;
        long[] keys$iv = r12.keys;
        Object[] values$iv = r12.values;
        int i$iv = 0;
    L5:
        if (i$iv >= n$iv) goto L12;
        Object value$iv = values$iv[i$iv];
        if (value$iv == access$getDELETED$p()) goto L11;
        if (i$iv == newSize$iv) goto L10;
        keys$iv[newSize$iv] = keys$iv[i$iv];
        values$iv[newSize$iv] = value$iv;
        values$iv[i$iv] = null;
    L10:
        newSize$iv = newSize$iv + 1;
    L11:
        i$iv = i$iv + 1;
        goto L5
    L12:
        r12.garbage = false;
        r12.size = newSize$iv;
    L13:
        int r1 = r12.size;
    L14:
        if (r2 >= r1) goto L19;
        int i = r2;
        if (r12.values[i] == r13) goto L17;
        r2 = r2 + 1;
        goto L14
    L17:
        return i;
    L19:
        return -1;
    }

    public static final <E> boolean commonContainsKey(LongSparseArray<E> r2, long key) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.indexOfKey(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <E> boolean commonContainsValue(LongSparseArray<E> r2, E r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.indexOfValue(r3) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <E> void commonClear(LongSparseArray<E> r5) {
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

    public static final <E> void commonAppend(LongSparseArray<E> r11, long key, E r14) {
        Intrinsics.checkNotNullParameter(r11, "<this>");
        if (r11.size == 0) goto L9;
        if (key > r11.keys[r11.size - 1]) goto L9;
        r11.put(key, r14);
        return;
    L9:
        if (r11.garbage == true) goto L11;
    L21:
        int pos = r11.size;
        if (pos < r11.keys.length) goto L24;
        int newSize = ContainerHelpersKt.idealLongArraySize(pos + 1);
        long[] r3 = Arrays.copyOf(r11.keys, newSize);
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        r11.keys = r3;
        Object[] r4 = Arrays.copyOf(r11.values, newSize);
        Intrinsics.checkNotNullExpressionValue(r4, "copyOf(...)");
        r11.values = r4;
    L24:
        r11.keys[pos] = key;
        r11.values[pos] = r14;
        r11.size = pos + 1;
        return;
    L11:
        if (r11.size < r11.keys.length) goto L21;
        int n$iv = r11.size;
        int newSize$iv = 0;
        long[] keys$iv = r11.keys;
        Object[] values$iv = r11.values;
        int i$iv = 0;
    L13:
        if (i$iv >= n$iv) goto L20;
        Object value$iv = values$iv[i$iv];
        if (value$iv == access$getDELETED$p()) goto L19;
        if (i$iv == newSize$iv) goto L18;
        keys$iv[newSize$iv] = keys$iv[i$iv];
        values$iv[newSize$iv] = value$iv;
        values$iv[i$iv] = null;
    L18:
        newSize$iv = newSize$iv + 1;
    L19:
        i$iv = i$iv + 1;
        goto L13
    L20:
        r11.garbage = false;
        r11.size = newSize$iv;
        goto L21
    }

    public static final <E> String commonToString(LongSparseArray<E> r10) {
        Intrinsics.checkNotNullParameter(r10, "<this>");
        if (r10.size() > 0) goto L6;
        return "{}";
    L6:
        StringBuilder $this$commonToString_u24lambda_u245 = new StringBuilder(r10.size * 28);
        $this$commonToString_u24lambda_u245.append('{');
        int i = 0;
        int r5 = r10.size;
    L7:
        if (i >= r5) goto L15;
        if (i <= 0) goto L10;
        $this$commonToString_u24lambda_u245.append(", ");
    L10:
        long key = r10.keyAt(i);
        $this$commonToString_u24lambda_u245.append(key);
        $this$commonToString_u24lambda_u245.append('=');
        Object value = r10.valueAt(i);
        if (value == $this$commonToString_u24lambda_u245) goto L13;
        $this$commonToString_u24lambda_u245.append(value);
    L14:
        i = i + 1;
        goto L7
    L13:
        $this$commonToString_u24lambda_u245.append("(this Map)");
        goto L14
    L15:
        $this$commonToString_u24lambda_u245.append('}');
        String r1 = $this$commonToString_u24lambda_u245.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    }

    public static final <T> int getSize(LongSparseArray<T> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.size();
    }

    public static final <T> boolean contains(LongSparseArray<T> r2, long key) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.containsKey(key);
    }

    public static final <T> void set(LongSparseArray<T> r1, long key, T r4) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        r1.put(key, r4);
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> r3, LongSparseArray<T> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "other");
        LongSparseArray<T> r0 = new LongSparseArray(r3.size() + r4.size());
        r0.putAll(r3);
        r0.putAll(r4);
        return r0;
    }

    public static final <T> T getOrDefault(LongSparseArray<T> r2, long key, T r5) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2.get(key, r5);
    }

    public static final <T> T getOrElse(LongSparseArray<T> r2, long key, Function0<? extends T> r5) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r5, "defaultValue");
        T r1 = r2.get(key);
        if (r1 == null) goto L5;
        return r1;
    L5:
        return r5.invoke();
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return !r2.isEmpty();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(LongSparseArray $this$remove, long key, Object value) {
        Intrinsics.checkNotNullParameter($this$remove, "<this>");
        return $this$remove.remove(key, value);
    }

    public static final <T> void forEach(LongSparseArray<T> r5, Function2<? super Long, ? super T, Unit> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "action");
        int index = 0;
        int r2 = r5.size();
    L3:
        if (index >= r2) goto L5;
        r6.invoke(Long.valueOf(r5.keyAt(index)), r5.valueAt(index));
        index = index + 1;
        goto L3
    }

    public static final <T> LongIterator keyIterator(final LongSparseArray<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return new AnonymousClass1(r1);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return new C01581(r1);
    }
}
