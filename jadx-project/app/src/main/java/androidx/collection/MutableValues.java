package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0015\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u001a\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0016\u0010\u001b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Landroidx/collection/MutableValues;", "K", "V", "", "parent", "Landroidx/collection/MutableScatterMap;", "(Landroidx/collection/MutableScatterMap;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MutableValues<K, V> implements Collection<V>, KMutableCollection {
    private final MutableScatterMap<K, V> parent;

    /* JADX INFO: renamed from: androidx.collection.MutableValues$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScatterMap.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\f\u001a\u00020\rH\u0096\u0002J\u000e\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"androidx/collection/MutableValues$iterator$1", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "iterator", "", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<V>, KMutableIterator {
        private int current;
        private final Iterator<Integer> iterator;
        final /* synthetic */ MutableValues<K, V> this$0;

        AnonymousClass1(MutableValues<K, V> r3) {
            this.this$0 = r3;
            this.iterator = SequencesKt.iterator(new MutableValues$iterator$1$iterator$1(r3, null));
            this.current = -1;
        }

        public final Iterator<Integer> getIterator() {
            return this.iterator;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final void setCurrent(int r1) {
            this.current = r1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            this.current = this.iterator.next().intValue();
            return (V) MutableValues.access$getParent$p(this.this$0).values[this.current];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current < 0) goto L6;
            MutableValues.access$getParent$p(this.this$0).removeValueAt(this.current);
            this.current = -1;
            return;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] r2) {
        Intrinsics.checkNotNullParameter(r2, "array");
        return (T[]) CollectionToArray.toArray(this, r2);
    }

    public MutableValues(MutableScatterMap<K, V> r2) {
        Intrinsics.checkNotNullParameter(r2, "parent");
        this.parent = r2;
    }

    public static final /* synthetic */ MutableScatterMap access$getParent$p(MutableValues $this) {
        return $this.parent;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends V> r2) {
        Intrinsics.checkNotNullParameter(r2, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean add(V r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> r19) {
        Collection<? extends Object> r1 = r19;
        Intrinsics.checkNotNullParameter(r1, "elements");
        boolean changed = false;
        ScatterMap this_$iv = this.parent;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L24;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L21;
        int r11 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L20;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r16 = true;
    L12:
        if (r16 == false) goto L17;
        int index$iv = (i$iv << 3) + j$iv;
        int r17 = r11;
        if (CollectionsKt.contains(r1, this.parent.values[index$iv]) == true) goto L18;
        this.parent.removeValueAt(index$iv);
        changed = true;
    L18:
        slot$iv = slot$iv >> r17;
        j$iv = j$iv + 1;
        r1 = r19;
        r11 = r17;
        goto L7
    L17:
        r17 = r11;
        goto L18
    L11:
        r16 = false;
        goto L12
    L20:
        if (bitCount$iv != r11) goto L24;
    L21:
        if (i$iv == lastIndex$iv) goto L24;
        i$iv = i$iv + 1;
        r1 = r19;
    L24:
        return changed;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> r19) {
        Collection<? extends Object> r1 = r19;
        Intrinsics.checkNotNullParameter(r1, "elements");
        boolean changed = false;
        ScatterMap this_$iv = this.parent;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L24;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L21;
        int r11 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L20;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r16 = true;
    L12:
        if (r16 == false) goto L17;
        int index$iv = (i$iv << 3) + j$iv;
        int r17 = r11;
        if (CollectionsKt.contains(r1, this.parent.values[index$iv]) == false) goto L18;
        this.parent.removeValueAt(index$iv);
        changed = true;
    L18:
        slot$iv = slot$iv >> r17;
        j$iv = j$iv + 1;
        r1 = r19;
        r11 = r17;
        goto L7
    L17:
        r17 = r11;
        goto L18
    L11:
        r16 = false;
        goto L12
    L20:
        if (bitCount$iv != r11) goto L24;
    L21:
        if (i$iv == lastIndex$iv) goto L24;
        i$iv = i$iv + 1;
        r1 = r19;
    L24:
        return changed;
    }

    @Override // java.util.Collection
    public boolean remove(Object element) {
        ScatterMap this_$iv = this.parent;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L28;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L23;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L20;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r12 = true;
    L12:
        if (r12 == false) goto L19;
        int index$iv = (i$iv << 3) + j$iv;
        if (Intrinsics.areEqual(this.parent.values[index$iv], element) == false) goto L19;
        this.parent.removeValueAt(index$iv);
        return true;
    L19:
        slot$iv = slot$iv >> 8;
        j$iv = j$iv + 1;
        goto L7
    L11:
        r12 = false;
        goto L12
    L20:
        boolean r17 = false;
        if (bitCount$iv != 8) goto L35;
    L24:
        if (i$iv == lastIndex$iv) goto L36;
        i$iv = i$iv + 1;
        goto L4
    L36:
        return r17;
    L35:
        return false;
    L23:
        r17 = false;
        goto L24
    L28:
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> r9) {
        Intrinsics.checkNotNullParameter(r9, "elements");
        Collection<? extends Object> r0 = r9;
        if (r0.isEmpty() == true) goto L16;
        Iterator<T> r2 = r0.iterator();
    L7:
        if (r2.hasNext() == false) goto L17;
        Object r4 = r2.next();
        if (this.parent.containsValue((V) r4) == true) goto L7;
        return false;
    L17:
        return true;
    L16:
        return true;
    }

    @Override // java.util.Collection
    public boolean contains(Object element) {
        return this.parent.containsValue(element);
    }
}
