package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LongSparseArray.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0004H\u0016J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0018\u0010&\u001a\u00020\u00102\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016J\u001f\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u0010)\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0004H\u0016J\u001f\u0010,\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ%\u0010,\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010/J\u001d\u00100\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u000203H\u0016J\u0015\u00104\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0002\u00105R\u0012\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u00066"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "initialCapacity", "", "(I)V", "garbage", "", "keys", "", "size", "values", "", "", "[Ljava/lang/Object;", "append", "", "key", "", "value", "(JLjava/lang/Object;)V", "clear", "clone", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(J)Ljava/lang/Object;", "defaultValue", "(JLjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "isEmpty", "keyAt", "index", "put", "putAll", "other", "putIfAbsent", "remove", "(JLjava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(JLjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)V", "toString", "", "valueAt", "(I)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LongSparseArray<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public LongSparseArray(int initialCapacity) {
        if (initialCapacity != 0) goto L5;
        this.keys = ContainerHelpersKt.EMPTY_LONGS;
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        return;
    L5:
        int idealCapacity = ContainerHelpersKt.idealLongArraySize(initialCapacity);
        this.keys = new long[idealCapacity];
        this.values = new Object[idealCapacity];
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m25clone() {
        return clone();
    }

    public LongSparseArray() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public /* synthetic */ LongSparseArray(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 10;
    L5:
        this(r1);
    }

    public LongSparseArray<E> clone() {
        Object r0 = super.clone();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray<E> r1 = (LongSparseArray) r0;
        r1.keys = (long[]) this.keys.clone();
        r1.values = (Object[]) this.values.clone();
        return r1;
    }

    public E get(long r9) {
        int r5 = ContainerHelpersKt.binarySearch(this.keys, this.size, r9);
        if (r5 < 0) goto L10;
        if (this.values[r5] == LongSparseArrayKt.access$getDELETED$p()) goto L10;
        return (E) this.values[r5];
    L10:
        return null;
    }

    public E get(long r8, E r10) {
        int r4 = ContainerHelpersKt.binarySearch(this.keys, this.size, r8);
        if (r4 < 0) goto L10;
        if (this.values[r4] == LongSparseArrayKt.access$getDELETED$p()) goto L10;
        return (E) this.values[r4];
    L10:
        return r10;
    }

    @Deprecated(message = "Alias for `remove(key)`.", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(long key) {
        int i$iv = ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (i$iv >= 0) goto L5;
        return;
    L5:
        if (this.values[i$iv] == LongSparseArrayKt.access$getDELETED$p()) goto L10;
        this.values[i$iv] = LongSparseArrayKt.access$getDELETED$p();
        this.garbage = true;
        return;
    }

    public void remove(long key) {
        int i$iv = ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (i$iv >= 0) goto L5;
        return;
    L5:
        if (this.values[i$iv] == LongSparseArrayKt.access$getDELETED$p()) goto L10;
        this.values[i$iv] = LongSparseArrayKt.access$getDELETED$p();
        this.garbage = true;
        return;
    }

    public boolean remove(long key, E r8) {
        int index$iv = indexOfKey(key);
        if (index$iv < 0) goto L7;
        Object mapValue$iv = valueAt(index$iv);
        if (Intrinsics.areEqual(r8, mapValue$iv) == false) goto L7;
        removeAt(index$iv);
        return true;
    L7:
        return false;
    }

    public void removeAt(int index) {
        if (this.values[index] == LongSparseArrayKt.access$getDELETED$p()) goto L7;
        this.values[index] = LongSparseArrayKt.access$getDELETED$p();
        this.garbage = true;
        return;
    }

    public E replace(long r6, E r8) {
        int r2 = indexOfKey(r6);
        if (r2 < 0) goto L5;
        E r3 = (E) this.values[r2];
        this.values[r2] = r8;
        return r3;
    L5:
        return null;
    }

    public boolean replace(long key, E r8, E r9) {
        int index$iv = indexOfKey(key);
        if (index$iv < 0) goto L7;
        Object mapValue$iv = this.values[index$iv];
        if (Intrinsics.areEqual(mapValue$iv, r8) == false) goto L7;
        this.values[index$iv] = r9;
        return true;
    L7:
        return false;
    }

    public void put(long key, E r18) {
        int index$iv = ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (index$iv < 0) goto L5;
        this.values[index$iv] = r18;
        return;
    L5:
        int index$iv2 = ~index$iv;
        if (index$iv2 >= this.size) goto L11;
        if (this.values[index$iv2] != LongSparseArrayKt.access$getDELETED$p()) goto L11;
        this.keys[index$iv2] = key;
        this.values[index$iv2] = r18;
        return;
    L11:
        if (this.garbage == false) goto L24;
        if (this.size < this.keys.length) goto L24;
        int n$iv$iv = this.size;
        int newSize$iv$iv = 0;
        long[] keys$iv$iv = this.keys;
        Object[] values$iv$iv = this.values;
        int i$iv$iv = 0;
    L15:
        if (i$iv$iv >= n$iv$iv) goto L22;
        Object value$iv$iv = values$iv$iv[i$iv$iv];
        if (value$iv$iv == LongSparseArrayKt.access$getDELETED$p()) goto L21;
        if (i$iv$iv == newSize$iv$iv) goto L20;
        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
        values$iv$iv[newSize$iv$iv] = value$iv$iv;
        values$iv$iv[i$iv$iv] = null;
    L20:
        newSize$iv$iv = newSize$iv$iv + 1;
    L21:
        i$iv$iv = i$iv$iv + 1;
        goto L15
    L22:
        this.garbage = false;
        this.size = newSize$iv$iv;
        index$iv2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, key);
    L24:
        if (this.size < this.keys.length) goto L27;
        int newSize$iv = ContainerHelpersKt.idealLongArraySize(this.size + 1);
        long[] r6 = Arrays.copyOf(this.keys, newSize$iv);
        Intrinsics.checkNotNullExpressionValue(r6, "copyOf(...)");
        this.keys = r6;
        Object[] r7 = Arrays.copyOf(this.values, newSize$iv);
        Intrinsics.checkNotNullExpressionValue(r7, "copyOf(...)");
        this.values = r7;
    L27:
        if ((this.size - index$iv2) == 0) goto L29;
        ArraysKt.copyInto(this.keys, this.keys, index$iv2 + 1, index$iv2, this.size);
        ArraysKt.copyInto(this.values, this.values, index$iv2 + 1, index$iv2, this.size);
    L29:
        this.keys[index$iv2] = key;
        this.values[index$iv2] = r18;
        this.size++;
    }

    public void putAll(LongSparseArray<? extends E> r10) {
        Intrinsics.checkNotNullParameter(r10, "other");
        int size$iv = r10.size();
        int r3 = 0;
    L3:
        if (r3 >= size$iv) goto L6;
        int i$iv = r3;
        put(r10.keyAt(i$iv), r10.valueAt(i$iv));
        r3 = r3 + 1;
        goto L3
    }

    public E putIfAbsent(long key, E r6) {
        E r2 = get(key);
        if (r2 != null) goto L6;
        put(key, r6);
    L6:
        return r2;
    }

    public int size() {
        if (this.garbage == false) goto L14;
        int n$iv$iv = this.size;
        int newSize$iv$iv = 0;
        long[] keys$iv$iv = this.keys;
        Object[] values$iv$iv = this.values;
        int i$iv$iv = 0;
    L5:
        if (i$iv$iv >= n$iv$iv) goto L12;
        Object value$iv$iv = values$iv$iv[i$iv$iv];
        if (value$iv$iv == LongSparseArrayKt.access$getDELETED$p()) goto L11;
        if (i$iv$iv == newSize$iv$iv) goto L10;
        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
        values$iv$iv[newSize$iv$iv] = value$iv$iv;
        values$iv$iv[i$iv$iv] = null;
    L10:
        newSize$iv$iv = newSize$iv$iv + 1;
    L11:
        i$iv$iv = i$iv$iv + 1;
        goto L5
    L12:
        this.garbage = false;
        this.size = newSize$iv$iv;
    L14:
        return this.size;
    }

    public boolean isEmpty() {
        if (size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public long keyAt(int index) {
        if (index >= 0) goto L5;
    L7:
        boolean value$iv$iv = false;
    L9:
        if (value$iv$iv == true) goto L11;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + index);
    L11:
        boolean value$iv$iv2 = this.garbage;
        if (value$iv$iv2 == false) goto L23;
        int n$iv$iv = this.size;
        int newSize$iv$iv = 0;
        long[] keys$iv$iv = this.keys;
        Object[] values$iv$iv = this.values;
        int i$iv$iv = 0;
    L14:
        if (i$iv$iv >= n$iv$iv) goto L21;
        Object value$iv$iv3 = values$iv$iv[i$iv$iv];
        if (value$iv$iv3 == LongSparseArrayKt.access$getDELETED$p()) goto L20;
        if (i$iv$iv == newSize$iv$iv) goto L19;
        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
        values$iv$iv[newSize$iv$iv] = value$iv$iv3;
        values$iv$iv[i$iv$iv] = null;
    L19:
        newSize$iv$iv = newSize$iv$iv + 1;
    L20:
        i$iv$iv = i$iv$iv + 1;
        goto L14
    L21:
        this.garbage = false;
        this.size = newSize$iv$iv;
    L23:
        return this.keys[index];
    L5:
        if (index >= this.size) goto L7;
        value$iv$iv = true;
        goto L9
    }

    public E valueAt(int r14) {
        if (r14 >= 0) goto L5;
    L7:
        boolean r3 = false;
    L9:
        if (r3 == true) goto L12;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + r14);
    L12:
        if (this.garbage == false) goto L23;
        int r5 = this.size;
        int r6 = 0;
        long[] r7 = this.keys;
        Object[] r8 = this.values;
        int r9 = 0;
    L14:
        if (r9 >= r5) goto L21;
        Object r10 = r8[r9];
        if (r10 == LongSparseArrayKt.access$getDELETED$p()) goto L20;
        if (r9 == r6) goto L19;
        r7[r6] = r7[r9];
        r8[r6] = r10;
        r8[r9] = null;
    L19:
        r6 = r6 + 1;
    L20:
        r9 = r9 + 1;
        goto L14
    L21:
        this.garbage = false;
        this.size = r6;
    L23:
        return (E) this.values[r14];
    L5:
        if (r14 >= this.size) goto L7;
        r3 = true;
        goto L9
    }

    public void setValueAt(int index, E r15) {
        if (index >= 0) goto L5;
    L7:
        boolean value$iv$iv = false;
    L9:
        if (value$iv$iv == true) goto L11;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + index);
    L11:
        boolean value$iv$iv2 = this.garbage;
        if (value$iv$iv2 == false) goto L22;
        int n$iv$iv = this.size;
        int newSize$iv$iv = 0;
        long[] keys$iv$iv = this.keys;
        Object[] values$iv$iv = this.values;
        int i$iv$iv = 0;
    L14:
        if (i$iv$iv >= n$iv$iv) goto L21;
        Object value$iv$iv3 = values$iv$iv[i$iv$iv];
        if (value$iv$iv3 == LongSparseArrayKt.access$getDELETED$p()) goto L20;
        if (i$iv$iv == newSize$iv$iv) goto L19;
        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
        values$iv$iv[newSize$iv$iv] = value$iv$iv3;
        values$iv$iv[i$iv$iv] = null;
    L19:
        newSize$iv$iv = newSize$iv$iv + 1;
    L20:
        i$iv$iv = i$iv$iv + 1;
        goto L14
    L21:
        this.garbage = false;
        this.size = newSize$iv$iv;
    L22:
        this.values[index] = r15;
        return;
    L5:
        if (index >= this.size) goto L7;
        value$iv$iv = true;
        goto L9
    }

    public int indexOfKey(long key) {
        if (this.garbage == false) goto L14;
        int n$iv$iv = this.size;
        int newSize$iv$iv = 0;
        long[] keys$iv$iv = this.keys;
        Object[] values$iv$iv = this.values;
        int i$iv$iv = 0;
    L5:
        if (i$iv$iv >= n$iv$iv) goto L12;
        Object value$iv$iv = values$iv$iv[i$iv$iv];
        if (value$iv$iv == LongSparseArrayKt.access$getDELETED$p()) goto L11;
        if (i$iv$iv == newSize$iv$iv) goto L10;
        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
        values$iv$iv[newSize$iv$iv] = value$iv$iv;
        values$iv$iv[i$iv$iv] = null;
    L10:
        newSize$iv$iv = newSize$iv$iv + 1;
    L11:
        i$iv$iv = i$iv$iv + 1;
        goto L5
    L12:
        this.garbage = false;
        this.size = newSize$iv$iv;
    L14:
        return ContainerHelpersKt.binarySearch(this.keys, this.size, key);
    }

    public int indexOfValue(E r14) {
        int r3 = 0;
        if (this.garbage == false) goto L13;
        int n$iv$iv = this.size;
        int newSize$iv$iv = 0;
        long[] keys$iv$iv = this.keys;
        Object[] values$iv$iv = this.values;
        int i$iv$iv = 0;
    L5:
        if (i$iv$iv >= n$iv$iv) goto L12;
        Object value$iv$iv = values$iv$iv[i$iv$iv];
        if (value$iv$iv == LongSparseArrayKt.access$getDELETED$p()) goto L11;
        if (i$iv$iv == newSize$iv$iv) goto L10;
        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
        values$iv$iv[newSize$iv$iv] = value$iv$iv;
        values$iv$iv[i$iv$iv] = null;
    L10:
        newSize$iv$iv = newSize$iv$iv + 1;
    L11:
        i$iv$iv = i$iv$iv + 1;
        goto L5
    L12:
        this.garbage = false;
        this.size = newSize$iv$iv;
    L13:
        int r2 = this.size;
    L14:
        if (r3 >= r2) goto L19;
        int i$iv = r3;
        if (this.values[i$iv] == r14) goto L26;
        r3 = r3 + 1;
        goto L14
    L26:
        return i$iv;
    L19:
        return -1;
    }

    public boolean containsKey(long key) {
        if (indexOfKey(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean containsValue(E r4) {
        if (indexOfValue(r4) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public void clear() {
        int n$iv = this.size;
        Object[] values$iv = this.values;
        int i$iv = 0;
    L3:
        if (i$iv >= n$iv) goto L5;
        values$iv[i$iv] = null;
        i$iv = i$iv + 1;
        goto L3
    L5:
        this.size = 0;
        this.garbage = false;
    }

    public void append(long key, E r15) {
        if (this.size == 0) goto L8;
        if (key > this.keys[this.size - 1]) goto L8;
        put(key, r15);
        return;
    L8:
        if (this.garbage == true) goto L10;
    L20:
        int pos$iv = this.size;
        if (pos$iv < this.keys.length) goto L23;
        int newSize$iv = ContainerHelpersKt.idealLongArraySize(pos$iv + 1);
        long[] r4 = Arrays.copyOf(this.keys, newSize$iv);
        Intrinsics.checkNotNullExpressionValue(r4, "copyOf(...)");
        this.keys = r4;
        Object[] r5 = Arrays.copyOf(this.values, newSize$iv);
        Intrinsics.checkNotNullExpressionValue(r5, "copyOf(...)");
        this.values = r5;
    L23:
        this.keys[pos$iv] = key;
        this.values[pos$iv] = r15;
        this.size = pos$iv + 1;
        return;
    L10:
        if (this.size < this.keys.length) goto L20;
        int n$iv$iv = this.size;
        int newSize$iv$iv = 0;
        long[] keys$iv$iv = this.keys;
        Object[] values$iv$iv = this.values;
        int i$iv$iv = 0;
    L12:
        if (i$iv$iv >= n$iv$iv) goto L19;
        Object value$iv$iv = values$iv$iv[i$iv$iv];
        if (value$iv$iv == LongSparseArrayKt.access$getDELETED$p()) goto L18;
        if (i$iv$iv == newSize$iv$iv) goto L17;
        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
        values$iv$iv[newSize$iv$iv] = value$iv$iv;
        values$iv$iv[i$iv$iv] = null;
    L17:
        newSize$iv$iv = newSize$iv$iv + 1;
    L18:
        i$iv$iv = i$iv$iv + 1;
        goto L12
    L19:
        this.garbage = false;
        this.size = newSize$iv$iv;
        goto L20
    }

    public String toString() {
        if (size() > 0) goto L5;
        return "{}";
    L5:
        StringBuilder $this$commonToString_u24lambda_u245$iv = new StringBuilder(this.size * 28);
        $this$commonToString_u24lambda_u245$iv.append('{');
        int i$iv = 0;
        int r6 = this.size;
    L6:
        if (i$iv >= r6) goto L14;
        if (i$iv <= 0) goto L9;
        $this$commonToString_u24lambda_u245$iv.append(", ");
    L9:
        long key$iv = keyAt(i$iv);
        $this$commonToString_u24lambda_u245$iv.append(key$iv);
        $this$commonToString_u24lambda_u245$iv.append('=');
        Object value$iv = valueAt(i$iv);
        if (value$iv == $this$commonToString_u24lambda_u245$iv) goto L12;
        $this$commonToString_u24lambda_u245$iv.append(value$iv);
    L13:
        i$iv = i$iv + 1;
        goto L6
    L12:
        $this$commonToString_u24lambda_u245$iv.append("(this Map)");
        goto L13
    L14:
        $this$commonToString_u24lambda_u245$iv.append('}');
        String r2 = $this$commonToString_u24lambda_u245$iv.toString();
        Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        return r2;
    }
}
