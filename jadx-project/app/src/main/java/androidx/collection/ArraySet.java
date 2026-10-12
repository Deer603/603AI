package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: ArraySet.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001?B\u0019\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0011\b\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u0010#\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0016\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\"J\u0016\u0010(\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\fJ\u0013\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010-\u001a\u00020\fH\u0016J\u0010\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012J\b\u00100\u001a\u00020 H\u0016J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0096\u0002J\u0015\u00103\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u00104\u001a\u00020 2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u00104\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00105\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t¢\u0006\u0002\u0010\u0014J%\u00109\u001a\b\u0012\u0004\u0012\u0002H:0\t\"\u0004\b\u0001\u0010:2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H:0\t¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020=H\u0016J\u0013\u0010>\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107R\u001a\u0010\u000e\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\rR$\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010¨\u0006@"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "set", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "array", "", "([Ljava/lang/Object;)V", "capacity", "", "(I)V", "_size", "get_size$collection", "()I", "set_size$collection", "", "getArray$collection", "()[Ljava/lang/Object;", "setArray$collection", "[Ljava/lang/Object;", "hashes", "", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "", "elements", "clear", "contains", "containsAll", "ensureCapacity", "minimumCapacity", "equals", "other", "hashCode", "indexOf", "key", "isEmpty", "iterator", "", "remove", "removeAll", "removeAt", "index", "(I)Ljava/lang/Object;", "retainAll", "toArray", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "valueAt", "ElementIterator", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {
    private int _size;
    private Object[] array;
    private int[] hashes;

    /* JADX INFO: compiled from: ArraySet.jvm.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\t"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "(Landroidx/collection/ArraySet;)V", "elementAt", "index", "", "(I)Ljava/lang/Object;", "removeAt", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class ElementIterator extends IndexBasedArrayIterator<E> {
        final /* synthetic */ ArraySet<E> this$0;

        public ElementIterator(ArraySet this$0) {
            this.this$0 = this$0;
            super(this$0.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int index) {
            return this.this$0.valueAt(index);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int index) {
            this.this$0.removeAt(index);
        }
    }

    public ArraySet() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public ArraySet(int capacity) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (capacity <= 0) goto L7;
        ArraySetKt.allocArrays(this, capacity);
        return;
    }

    public /* synthetic */ ArraySet(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public final void setHashes$collection(int[] r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.hashes = r2;
    }

    public final Object[] getArray$collection() {
        return this.array;
    }

    public final void setArray$collection(Object[] r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.array = r2;
    }

    public final int get_size$collection() {
        return this._size;
    }

    public final void set_size$collection(int r1) {
        this._size = r1;
    }

    public int getSize() {
        return this._size;
    }

    public ArraySet(ArraySet<? extends E> r2) {
        this(0);
        if (r2 == null) goto L6;
        addAll(r2);
        return;
    }

    public ArraySet(Collection<? extends E> r2) {
        this(0);
        if (r2 == null) goto L6;
        addAll(r2);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(E[] r3) {
        this(0);
        if (r3 == null) goto L8;
        Iterator r0 = ArrayIteratorKt.iterator(r3);
    L6:
        if (r0.hasNext() == false) goto L10;
        Object value = r0.next();
        add(value);
        goto L6
    L10:
        return;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() == 0) goto L6;
        setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
        setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
        set_size$collection(0);
    L6:
        if (get_size$collection() != 0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    public final void ensureCapacity(int minimumCapacity) {
        int oSize$iv = get_size$collection();
        if (getHashes$collection().length >= minimumCapacity) goto L9;
        int[] ohashes$iv = getHashes$collection();
        Object[] oarray$iv = getArray$collection();
        ArraySetKt.allocArrays(this, minimumCapacity);
        if (get_size$collection() <= 0) goto L9;
        ArraysKt.copyInto$default(ohashes$iv, getHashes$collection(), 0, 0, get_size$collection(), 6, null);
        ArraysKt.copyInto$default(oarray$iv, getArray$collection(), 0, 0, get_size$collection(), 6, null);
    L9:
        if (get_size$collection() != oSize$iv) goto L12;
        return;
    L12:
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        if (indexOf(element) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final int indexOf(Object key) {
        if (key != null) goto L6;
        return ArraySetKt.indexOfNull(this);
    L6:
        return ArraySetKt.indexOf(this, key, key.hashCode());
    }

    public final E valueAt(int r4) {
        return (E) getArray$collection()[r4];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (get_size$collection() > 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E r18) {
        int oSize$iv = get_size$collection();
        if (r18 != null) goto L5;
        int hash$iv = 0;
        int index$iv = ArraySetKt.indexOfNull(this);
    L6:
        boolean r6 = false;
        if (index$iv >= 0) goto L38;
        int index$iv2 = ~index$iv;
        if (oSize$iv < getHashes$collection().length) goto L28;
        int n$iv = 8;
        if (oSize$iv < 8) goto L15;
        n$iv = (oSize$iv >> 1) + oSize$iv;
    L18:
        int[] ohashes$iv = getHashes$collection();
        Object[] oarray$iv = getArray$collection();
        ArraySetKt.allocArrays(this, n$iv);
        if (oSize$iv != get_size$collection()) goto L27;
        if (getHashes$collection().length != 0) goto L23;
        r6 = true;
    L23:
        if (r6 == true) goto L28;
        ArraysKt.copyInto$default(ohashes$iv, getHashes$collection(), 0, 0, ohashes$iv.length, 6, null);
        ArraysKt.copyInto$default(oarray$iv, getArray$collection(), 0, 0, oarray$iv.length, 6, null);
        goto L28
    L27:
        throw new ConcurrentModificationException();
    L15:
        if (oSize$iv >= 4) goto L18;
        n$iv = 4;
    L28:
        if (index$iv2 >= oSize$iv) goto L31;
        ArraysKt.copyInto(getHashes$collection(), getHashes$collection(), index$iv2 + 1, index$iv2, oSize$iv);
        ArraysKt.copyInto(getArray$collection(), getArray$collection(), index$iv2 + 1, index$iv2, oSize$iv);
    L31:
        if (oSize$iv != get_size$collection()) goto L37;
        if (index$iv2 >= getHashes$collection().length) goto L37;
        getHashes$collection()[index$iv2] = hash$iv;
        getArray$collection()[index$iv2] = r18;
        set_size$collection(get_size$collection() + 1);
        return true;
    L37:
        throw new ConcurrentModificationException();
    L38:
        return false;
    L5:
        hash$iv = r18.hashCode();
        index$iv = ArraySetKt.indexOf(this, r18, hash$iv);
        goto L6
    }

    public final void addAll(ArraySet<? extends E> r10) {
        Intrinsics.checkNotNullParameter(r10, "array");
        int n$iv = r10.get_size$collection();
        ensureCapacity(get_size$collection() + n$iv);
        if (get_size$collection() != 0) goto L10;
        if (n$iv <= 0) goto L14;
        ArraysKt.copyInto$default(r10.getHashes$collection(), getHashes$collection(), 0, 0, n$iv, 6, null);
        ArraysKt.copyInto$default(r10.getArray$collection(), getArray$collection(), 0, 0, n$iv, 6, null);
        if (get_size$collection() != 0) goto L9;
        set_size$collection(n$iv);
        return;
    L9:
        throw new ConcurrentModificationException();
    L14:
        return;
    L10:
        int i$iv = 0;
    L11:
        if (i$iv >= n$iv) goto L17;
        add(r10.valueAt(i$iv));
        i$iv = i$iv + 1;
        goto L11
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int index$iv = indexOf(element);
        if (index$iv < 0) goto L5;
        removeAt(index$iv);
        return true;
    L5:
        return false;
    }

    public final E removeAt(int r16) {
        int r9 = get_size$collection();
        E r10 = (E) getArray$collection()[r16];
        if (r9 > 1) goto L5;
        clear();
    L27:
        return r10;
    L5:
        int r11 = r9 - 1;
        int r2 = 8;
        if (getHashes$collection().length <= 8) goto L20;
        if (get_size$collection() >= (getHashes$collection().length / 3)) goto L20;
        if (get_size$collection() <= 8) goto L13;
        r2 = get_size$collection() + (get_size$collection() >> 1);
    L13:
        int[] r0 = getHashes$collection();
        Object[] r13 = getArray$collection();
        ArraySetKt.allocArrays(this, r2);
        if (r16 <= 0) goto L16;
        int r4 = r16;
        ArraysKt.copyInto$default(r0, getHashes$collection(), 0, 0, r4, 6, null);
        Object[] r1 = r13;
        ArraysKt.copyInto$default(r1, getArray$collection(), 0, 0, r4, 6, null);
    L17:
        if (r4 >= r11) goto L24;
        ArraysKt.copyInto(r0, getHashes$collection(), r4, r4 + 1, r11 + 1);
        ArraysKt.copyInto(r1, getArray$collection(), r4, r4 + 1, r11 + 1);
    L24:
        if (r9 != get_size$collection()) goto L29;
        set_size$collection(r11);
        goto L27
    L29:
        throw new ConcurrentModificationException();
    L16:
        r4 = r16;
        r1 = r13;
    L20:
        if (r16 >= r11) goto L22;
        ArraysKt.copyInto(getHashes$collection(), getHashes$collection(), r16, r16 + 1, r11 + 1);
        ArraysKt.copyInto(getArray$collection(), getArray$collection(), r16, r16 + 1, r11 + 1);
    L22:
        getArray$collection()[r11] = null;
        goto L24
    }

    public final boolean removeAll(ArraySet<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "array");
        int n$iv = r7.get_size$collection();
        int originalSize$iv = get_size$collection();
        int i$iv = 0;
    L3:
        if (i$iv >= n$iv) goto L5;
        remove(r7.valueAt(i$iv));
        i$iv = i$iv + 1;
        goto L3
    L5:
        int i$iv2 = get_size$collection();
        if (originalSize$iv == i$iv2) goto L8;
        return true;
    L8:
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.array, 0, this._size);
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] r5) {
        Intrinsics.checkNotNullParameter(r5, "array");
        T[] r0 = (T[]) ArraySetJvmUtil.resizeForToArray(r5, this._size);
        ArraysKt.copyInto(this.array, r0, 0, 0, this._size);
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Set) == false) goto L23;
        if (size() != ((Set) other).size()) goto L28;
        int i$iv = 0;
        int r5 = get_size$collection();     // Catch: ClassCastException -> L18 NullPointerException -> L20
    L12:
        if (i$iv >= r5) goto L33;
        Object mine$iv = valueAt(i$iv);     // Catch: ClassCastException -> L18 NullPointerException -> L20
        if (((Set) other).contains(mine$iv) == false) goto L29;
        i$iv = i$iv + 1;
        goto L12
    L29:
        return false;
    L33:
        return true;
    L30:
        return false;
    L31:
        return false;
    L28:
        return false;
    L23:
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$iv = getHashes$collection();
        int s$iv = get_size$collection();
        int result$iv = 0;
        int i$iv = 0;
    L3:
        if (i$iv >= s$iv) goto L6;
        result$iv = result$iv + hashes$iv[i$iv];
        i$iv = i$iv + 1;
        goto L3
    L6:
        return result$iv;
    }

    public String toString() {
        if (isEmpty() == false) goto L5;
        return "{}";
    L5:
        StringBuilder $this$toStringInternal_u24lambda_u240$iv = new StringBuilder(get_size$collection() * 14);
        $this$toStringInternal_u24lambda_u240$iv.append('{');
        int i$iv = 0;
        int r6 = get_size$collection();
    L6:
        if (i$iv >= r6) goto L14;
        if (i$iv <= 0) goto L9;
        $this$toStringInternal_u24lambda_u240$iv.append(", ");
    L9:
        Object value$iv = valueAt(i$iv);
        if (value$iv == this) goto L12;
        $this$toStringInternal_u24lambda_u240$iv.append(value$iv);
    L13:
        i$iv = i$iv + 1;
        goto L6
    L12:
        $this$toStringInternal_u24lambda_u240$iv.append("(this Set)");
        goto L13
    L14:
        $this$toStringInternal_u24lambda_u240$iv.append('}');
        String r2 = $this$toStringInternal_u24lambda_u240$iv.toString();
        Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        return r2;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new ElementIterator(this);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> r6) {
        Intrinsics.checkNotNullParameter(r6, "elements");
        Iterator<? extends Object> r2 = r6.iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        Object item$iv = r2.next();
        if (contains(item$iv) == true) goto L4;
        return false;
    L8:
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        ensureCapacity(get_size$collection() + r7.size());
        boolean added$iv = false;
        Iterator<? extends E> r3 = r7.iterator();
    L4:
        if (r3.hasNext() == false) goto L7;
        added$iv = added$iv | add(r3.next());
        goto L4
    L7:
        return added$iv;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        boolean removed$iv = false;
        Iterator<? extends Object> r3 = r7.iterator();
    L4:
        if (r3.hasNext() == false) goto L7;
        Object value$iv = r3.next();
        removed$iv = removed$iv | remove(value$iv);
        goto L4
    L7:
        return removed$iv;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        boolean removed$iv = false;
        int i$iv = get_size$collection();
    L3:
        i$iv = i$iv - 1;
        if ((-1) >= i$iv) goto L10;
        if (CollectionsKt.contains(r7, getArray$collection()[i$iv]) == true) goto L3;
        removeAt(i$iv);
        removed$iv = true;
        goto L3
    L10:
        return removed$iv;
    }
}
