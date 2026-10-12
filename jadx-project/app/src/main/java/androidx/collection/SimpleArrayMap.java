package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SimpleArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B!\b\u0016\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0013\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00028\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ,\u0010 \u001a\u0002H!\"\n\b\u0002\u0010!*\u0004\u0018\u00018\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u0002H!H\u0082\b¢\u0006\u0002\u0010\u001fJ\b\u0010\"\u001a\u00020\u0007H\u0016J\u001d\u0010#\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0007H\u0002J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0001H\u0001¢\u0006\u0004\b*\u0010'J\b\u0010+\u001a\u00020\u0012H\u0016J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010.J\u001f\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ \u00100\u001a\u00020\u00102\u0016\u0010\u0004\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016J\u001f\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ\u0017\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u001d\u00102\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00103J\u0015\u00104\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010.J\u001f\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ%\u00105\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u00106\u001a\u00028\u00012\u0006\u00107\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00108J\u001d\u00109\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010:J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020<H\u0016J\u0015\u0010=\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010.R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "map", "(Landroidx/collection/SimpleArrayMap;)V", "capacity", "", "(I)V", "array", "", "[Ljava/lang/Object;", "hashes", "", "size", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "ensureCapacity", "minimumCapacity", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefaultInternal", "T", "hashCode", "indexOf", "hash", "(Ljava/lang/Object;I)I", "indexOfKey", "(Ljava/lang/Object;)I", "indexOfNull", "indexOfValue", "__restricted$indexOfValue", "isEmpty", "keyAt", "index", "(I)Ljava/lang/Object;", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "toString", "", "valueAt", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public SimpleArrayMap(int capacity) {
        if (capacity != 0) goto L5;
        int[] r0 = ContainerHelpersKt.EMPTY_INTS;
    L6:
        this.hashes = r0;
        if (capacity != 0) goto L9;
        Object[] r1 = ContainerHelpersKt.EMPTY_OBJECTS;
    L10:
        this.array = r1;
        return;
    L9:
        r1 = new Object[capacity << 1];
        goto L10
    L5:
        r0 = new int[capacity];
        goto L6
    }

    public /* synthetic */ SimpleArrayMap(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> r4) {
        int r2 = 0;
        this(r2, 1, null);
        if (r4 == null) goto L6;
        putAll(r4);
        return;
    }

    private final int indexOf(K r7, int hash) {
        int n = this.size;
        if (n != 0) goto L6;
        return -1;
    L6:
        int index = ContainerHelpersKt.binarySearch(this.hashes, n, hash);
        if (index >= 0) goto L10;
        return index;
    L10:
        if (Intrinsics.areEqual(r7, this.array[index << 1]) == false) goto L12;
        return index;
    L12:
        int end = index + 1;
    L13:
        if (end >= n) goto L20;
        if (this.hashes[end] != hash) goto L20;
        if (Intrinsics.areEqual(r7, this.array[end << 1]) == true) goto L18;
        end = end + 1;
        goto L13
    L18:
        return end;
    L20:
        int i = index - 1;
    L21:
        if (i < 0) goto L29;
        if (this.hashes[i] != hash) goto L29;
        if (Intrinsics.areEqual(r7, this.array[i << 1]) == true) goto L26;
        i = i - 1;
        goto L21
    L26:
        return i;
    L29:
        return ~end;
    }

    private final int indexOfNull() {
        int n = this.size;
        if (n != 0) goto L6;
        return -1;
    L6:
        int index = ContainerHelpersKt.binarySearch(this.hashes, n, 0);
        if (index >= 0) goto L10;
        return index;
    L10:
        if (this.array[index << 1] != null) goto L12;
        return index;
    L12:
        int end = index + 1;
    L13:
        if (end >= n) goto L20;
        if (this.hashes[end] != 0) goto L20;
        if (this.array[end << 1] == null) goto L18;
        end = end + 1;
        goto L13
    L18:
        return end;
    L20:
        int i = index - 1;
    L21:
        if (i < 0) goto L29;
        if (this.hashes[i] != 0) goto L29;
        if (this.array[i << 1] == null) goto L26;
        i = i - 1;
        goto L21
    L26:
        return i;
    L29:
        return ~end;
    }

    public void clear() {
        if (this.size <= 0) goto L6;
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        this.size = 0;
    L6:
        if (this.size > 0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    public void ensureCapacity(int minimumCapacity) {
        int osize = this.size;
        if (this.hashes.length >= minimumCapacity) goto L6;
        int[] r1 = Arrays.copyOf(this.hashes, minimumCapacity);
        Intrinsics.checkNotNullExpressionValue(r1, "copyOf(...)");
        this.hashes = r1;
        Object[] r2 = Arrays.copyOf(this.array, minimumCapacity * 2);
        Intrinsics.checkNotNullExpressionValue(r2, "copyOf(...)");
        this.array = r2;
    L6:
        if (this.size != osize) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(K r2) {
        if (indexOfKey(r2) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public int indexOfKey(K r2) {
        if (r2 != null) goto L5;
        return indexOfNull();
    L5:
        return indexOf(r2, r2.hashCode());
    }

    public final int __restricted$indexOfValue(V r5) {
        int n = this.size * 2;
        Object[] array = this.array;
        if (r5 != null) goto L11;
        int i = 1;
    L5:
        if (i >= n) goto L18;
        if (array[i] == null) goto L9;
        i = i + 2;
        goto L5
    L9:
        return i >> 1;
    L18:
        return -1;
    L11:
        int i2 = 1;
    L12:
        if (i2 >= n) goto L24;
        if (Intrinsics.areEqual(r5, array[i2]) == true) goto L16;
        i2 = i2 + 2;
        goto L12
    L16:
        return i2 >> 1;
    L24:
        return -1;
    }

    public boolean containsValue(V r2) {
        if (__restricted$indexOfValue(r2) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public V get(K r7) {
        int r3 = indexOfKey(r7);
        if (r3 < 0) goto L7;
        return (V) this.array[(r3 << 1) + 1];
    L7:
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object r6, V r7) {
        int r2 = indexOfKey(r6);
        if (r2 < 0) goto L7;
        return (V) this.array[(r2 << 1) + 1];
    L7:
        return r7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object r5, T r6) {
        int r1 = indexOfKey(r5);
        if (r1 < 0) goto L6;
        return (T) this.array[(r1 << 1) + 1];
    L6:
        return r6;
    }

    public K keyAt(int r6) {
        boolean r0 = false;
        if (r6 < 0) goto L8;
        if (r6 >= this.size) goto L8;
        r0 = true;
    L8:
        if (r0 == true) goto L11;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + r6);
    L11:
        return (K) this.array[r6 << 1];
    }

    public V valueAt(int r7) {
        boolean r0 = false;
        if (r7 < 0) goto L8;
        if (r7 >= this.size) goto L8;
        r0 = true;
    L8:
        if (r0 == true) goto L11;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + r7);
    L11:
        return (V) this.array[(r7 << 1) + 1];
    }

    public V setValueAt(int r7, V r8) {
        boolean r0 = false;
        if (r7 < 0) goto L8;
        if (r7 >= this.size) goto L8;
        r0 = true;
    L8:
        if (r0 == true) goto L10;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + r7);
    L10:
        int r1 = (r7 << 1) + 1;
        V r2 = (V) this.array[r1];
        this.array[r1] = r8;
        return r2;
    }

    public boolean isEmpty() {
        if (this.size > 0) goto L5;
        return true;
    L5:
        return false;
    }

    public V put(K r9, V r10) {
        int r0 = this.size;
        if (r9 == null) goto L5;
        int r1 = r9.hashCode();
    L6:
        if (r9 == null) goto L8;
        int r2 = indexOf(r9, r1);
    L9:
        if (r2 < 0) goto L12;
        int r3 = (r2 << 1) + 1;
        V r4 = (V) this.array[r3];
        this.array[r3] = r10;
        return r4;
    L12:
        int r5 = ~r2;
        if (r0 < this.hashes.length) goto L26;
        int r6 = 8;
        if (r0 < 8) goto L18;
        r6 = (r0 >> 1) + r0;
    L21:
        int[] r7 = Arrays.copyOf(this.hashes, r6);
        Intrinsics.checkNotNullExpressionValue(r7, "copyOf(...)");
        this.hashes = r7;
        Object[] r8 = Arrays.copyOf(this.array, r6 << 1);
        Intrinsics.checkNotNullExpressionValue(r8, "copyOf(...)");
        this.array = r8;
        if (r0 == this.size) goto L26;
        throw new ConcurrentModificationException();
    L18:
        if (r0 >= 4) goto L21;
        r6 = 4;
    L26:
        if (r5 >= r0) goto L29;
        ArraysKt.copyInto(this.hashes, this.hashes, r5 + 1, r5, r0);
        ArraysKt.copyInto(this.array, this.array, (r5 + 1) << 1, r5 << 1, this.size << 1);
    L29:
        if (r0 != this.size) goto L35;
        if (r5 >= this.hashes.length) goto L35;
        this.hashes[r5] = r1;
        this.array[r5 << 1] = r9;
        this.array[(r5 << 1) + 1] = r10;
        this.size++;
        return null;
    L35:
        throw new ConcurrentModificationException();
    L8:
        r2 = indexOfNull();
        goto L9
    L5:
        r1 = 0;
        goto L6
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> r6) {
        Intrinsics.checkNotNullParameter(r6, "map");
        int n = r6.size;
        ensureCapacity(this.size + n);
        if (this.size != 0) goto L6;
        if (n <= 0) goto L9;
        ArraysKt.copyInto(r6.hashes, this.hashes, 0, 0, n);
        ArraysKt.copyInto(r6.array, this.array, 0, 0, n << 1);
        this.size = n;
        return;
    L9:
        return;
    L6:
        int i = 0;
    L7:
        if (i >= n) goto L12;
        put(r6.keyAt(i), r6.valueAt(i));
        i = i + 1;
        goto L7
    }

    public V putIfAbsent(K r2, V r3) {
        V r0 = get(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return put(r2, r3);
    }

    public V remove(K r3) {
        int index = indexOfKey(r3);
        if (index >= 0) goto L7;
        return null;
    L7:
        return removeAt(index);
    }

    public boolean remove(K r4, V r5) {
        int index = indexOfKey(r4);
        if (index < 0) goto L8;
        Object mapValue = valueAt(index);
        if (Intrinsics.areEqual(r5, mapValue) == false) goto L10;
        removeAt(index);
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public V removeAt(int r12) {
        if (r12 >= 0) goto L5;
    L7:
        boolean r2 = false;
    L9:
        if (r2 == true) goto L11;
        RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + r12);
    L11:
        V r3 = (V) this.array[(r12 << 1) + 1];
        int r4 = this.size;
        if (r4 > 1) goto L14;
        clear();
    L35:
        return r3;
    L14:
        int r5 = r4 - 1;
        int r6 = 8;
        if (this.hashes.length > 8) goto L17;
    L29:
        if (r12 >= r5) goto L31;
        ArraysKt.copyInto(this.hashes, this.hashes, r12, r12 + 1, r5 + 1);
        ArraysKt.copyInto(this.array, this.array, r12 << 1, (r12 + 1) << 1, (r5 + 1) << 1);
    L31:
        this.array[r5 << 1] = null;
        this.array[(r5 << 1) + 1] = null;
    L33:
        if (r4 != this.size) goto L37;
        this.size = r5;
        goto L35
    L37:
        throw new ConcurrentModificationException();
    L17:
        if (r4 >= (this.hashes.length / 3)) goto L29;
        if (r4 <= 8) goto L21;
        r6 = r4 + (r4 >> 1);
    L21:
        int[] r7 = this.hashes;
        Object[] r8 = this.array;
        int[] r9 = Arrays.copyOf(this.hashes, r6);
        Intrinsics.checkNotNullExpressionValue(r9, "copyOf(...)");
        this.hashes = r9;
        Object[] r10 = Arrays.copyOf(this.array, r6 << 1);
        Intrinsics.checkNotNullExpressionValue(r10, "copyOf(...)");
        this.array = r10;
        if (r4 != this.size) goto L28;
        if (r12 <= 0) goto L25;
        ArraysKt.copyInto(r7, this.hashes, 0, 0, r12);
        ArraysKt.copyInto(r8, this.array, 0, 0, r12 << 1);
    L25:
        if (r12 >= r5) goto L33;
        ArraysKt.copyInto(r7, this.hashes, r12, r12 + 1, r5 + 1);
        ArraysKt.copyInto(r8, this.array, r12 << 1, (r12 + 1) << 1, (r5 + 1) << 1);
        goto L33
    L28:
        throw new ConcurrentModificationException();
    L5:
        if (r12 >= this.size) goto L7;
        r2 = true;
        goto L9
    }

    public V replace(K r3, V r4) {
        int index = indexOfKey(r3);
        if (index >= 0) goto L7;
        return null;
    L7:
        return setValueAt(index, r4);
    }

    public boolean replace(K r4, V r5, V r6) {
        int index = indexOfKey(r4);
        if (index < 0) goto L8;
        Object mapValue = valueAt(index);
        if (Intrinsics.areEqual(r5, mapValue) == false) goto L10;
        setValueAt(index, r6);
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public int size() {
        return this.size;
    }

    public boolean equals(Object other) {
        if (this != other) goto L46;
        return true;
    L46:
        if ((other instanceof SimpleArrayMap) == false) goto L25;
        if (size() == ((SimpleArrayMap) other).size()) goto L11;
        return false;
    L11:
        SimpleArrayMap otherSimpleArrayMap = (SimpleArrayMap) other;     // Catch: ClassCastException -> L42 NullPointerException -> L44
        int i = 0;
        int r4 = this.size;     // Catch: ClassCastException -> L42 NullPointerException -> L44
    L12:
        if (i >= r4) goto L23;
        K r5 = keyAt(i);     // Catch: ClassCastException -> L42 NullPointerException -> L44
        Object mine = valueAt(i);     // Catch: ClassCastException -> L42 NullPointerException -> L44
        Object theirs = otherSimpleArrayMap.get(r5);     // Catch: ClassCastException -> L42 NullPointerException -> L44
        if (mine != null) goto L20;
        if (theirs != null) goto L18;
        if (otherSimpleArrayMap.containsKey(r5) == false) goto L18;
    L22:
        i = i + 1;     // Catch: ClassCastException -> L42 NullPointerException -> L44
    L18:
        return false;
    L20:
        if (Intrinsics.areEqual(mine, theirs) == true) goto L22;
        return false;
    L23:
        return true;
    L25:
        if ((other instanceof Map) == false) goto L45;
        if (size() == ((Map) other).size()) goto L29;
        return false;
    L29:
        int i2 = 0;
        int r3 = this.size;     // Catch: ClassCastException -> L42 NullPointerException -> L44
    L30:
        if (i2 >= r3) goto L41;
        Object key = keyAt(i2);     // Catch: ClassCastException -> L42 NullPointerException -> L44
        Object mine2 = valueAt(i2);     // Catch: ClassCastException -> L42 NullPointerException -> L44
        Object theirs2 = ((Map) other).get(key);     // Catch: ClassCastException -> L42 NullPointerException -> L44
        if (mine2 != null) goto L38;
        if (theirs2 != null) goto L36;
        if (((Map) other).containsKey(key) == false) goto L36;
    L40:
        i2 = i2 + 1;
    L36:
        return false;
    L38:
        if (Intrinsics.areEqual(mine2, theirs2) == true) goto L40;
        return false;
    L41:
        return true;
    L45:
        return false;
    }

    public int hashCode() {
        int[] hashes = this.hashes;
        Object[] array = this.array;
        int result = 0;
        int i = 0;
        int v = 1;
        int s = this.size;
    L3:
        if (i >= s) goto L9;
        Object value = array[v];
        int r7 = hashes[i];
        if (value == null) goto L7;
        int r8 = value.hashCode();
    L8:
        result = result + (r7 ^ r8);
        i = i + 1;
        v = v + 2;
        goto L3
    L7:
        r8 = 0;
        goto L8
    L9:
        return result;
    }

    public String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder $this$toString_u24lambda_u245 = new StringBuilder(this.size * 28);
        $this$toString_u24lambda_u245.append('{');
        int i = 0;
        int r4 = this.size;
    L7:
        if (i >= r4) goto L19;
        if (i <= 0) goto L10;
        $this$toString_u24lambda_u245.append(", ");
    L10:
        Object key = keyAt(i);
        if (key == $this$toString_u24lambda_u245) goto L13;
        $this$toString_u24lambda_u245.append(key);
    L14:
        $this$toString_u24lambda_u245.append('=');
        Object value = valueAt(i);
        if (value == $this$toString_u24lambda_u245) goto L17;
        $this$toString_u24lambda_u245.append(value);
    L18:
        i = i + 1;
        goto L7
    L17:
        $this$toString_u24lambda_u245.append("(this Map)");
        goto L18
    L13:
        $this$toString_u24lambda_u245.append("(this Map)");
        goto L14
    L19:
        $this$toString_u24lambda_u245.append('}');
        String r0 = $this$toString_u24lambda_u245.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }
}
