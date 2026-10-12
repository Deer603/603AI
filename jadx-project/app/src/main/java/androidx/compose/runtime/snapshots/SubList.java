package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u001d\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u0016\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0016\u0010\u001d\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u0016\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0012H\u0016J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0016\u0010)\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u0015\u0010*\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u001fJ\u0016\u0010+\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u001e\u0010,\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010-J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010/\u001a\u00020\u0015H\u0002R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Landroidx/compose/runtime/snapshots/SubList;", "T", "", "parentList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "fromIndex", "", "toIndex", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V", "offset", "getParentList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<set-?>", "size", "getSize", "()I", "structure", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "validateModification", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SubList<T> implements List<T>, KMutableList {
    private final int offset;
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SubList$listIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\r\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/snapshots/SubList$listIterator$1", "", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "remove", "set", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements ListIterator<T>, KMutableListIterator {
        final /* synthetic */ Ref.IntRef $current;
        final /* synthetic */ SubList<T> this$0;

        AnonymousClass1(Ref.IntRef $current, SubList<T> r2) {
            this.$current = $current;
            this.this$0 = r2;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object element) {
            add(element);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            remove();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object element) {
            set(element);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.$current.element < 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.$current.element + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int oldCurrent = this.$current.element;
            SnapshotStateListKt.access$validateRange(oldCurrent, this.this$0.size());
            this.$current.element = oldCurrent - 1;
            return this.this$0.get(oldCurrent);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.$current.element;
        }

        @Override // java.util.ListIterator
        public Void add(T r2) {
            SnapshotStateListKt.access$modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.$current.element < (this.this$0.size() - 1)) goto L7;
            return false;
        L7:
            return true;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int newCurrent = this.$current.element + 1;
            SnapshotStateListKt.access$validateRange(newCurrent, this.this$0.size());
            this.$current.element = newCurrent;
            return this.this$0.get(newCurrent);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Void remove() {
            SnapshotStateListKt.access$modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        public Void set(T r2) {
            SnapshotStateListKt.access$modificationError();
            throw new KotlinNothingValueException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
        return (T[]) CollectionToArray.toArray(this, r2);
    }

    public SubList(SnapshotStateList<T> r2, int fromIndex, int toIndex) {
        this.parentList = r2;
        this.offset = fromIndex;
        this.structure = this.parentList.getStructure$runtime_release();
        this.size = toIndex - fromIndex;
    }

    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int index) {
        return removeAt(index);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        if (indexOf(element) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> r8) {
        Collection<? extends Object> $this$all$iv = r8;
        if (($this$all$iv instanceof Collection) == true) goto L5;
    L7:
        Iterator<T> r2 = $this$all$iv.iterator();
    L9:
        if (r2.hasNext() == false) goto L19;
        Object element$iv = r2.next();
        if (contains(element$iv) == true) goto L9;
        return false;
    L19:
        return true;
    L5:
        if ($this$all$iv.isEmpty() == false) goto L7;
        return true;
    }

    @Override // java.util.List
    public T get(int index) {
        validateModification();
        SnapshotStateListKt.access$validateRange(index, size());
        return this.parentList.get(this.offset + index);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        validateModification();
        Iterable $this$forEach$iv = RangesKt.until(this.offset, this.offset + size());
        Iterator<Integer> r2 = $this$forEach$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        int element$iv = ((IntIterator) r2).nextInt();
        if (Intrinsics.areEqual(element, this.parentList.get(element$iv)) == false) goto L4;
        return element$iv - this.offset;
    L10:
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        validateModification();
        int index = this.offset + size();
    L3:
        index = index - 1;
        if (index < this.offset) goto L10;
        if (Intrinsics.areEqual(element, this.parentList.get(index)) == false) goto L3;
        return index - this.offset;
    L10:
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T r4) {
        validateModification();
        this.parentList.add(this.offset + size(), r4);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return true;
    }

    @Override // java.util.List
    public void add(int index, T r4) {
        validateModification();
        this.parentList.add(this.offset + index, r4);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
    }

    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends T> r5) {
        validateModification();
        boolean result = this.parentList.addAll(this.offset + index, r5);
        if (result == false) goto L5;
        this.size = size() + r5.size();
        this.structure = this.parentList.getStructure$runtime_release();
    L5:
        return result;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> r2) {
        return addAll(size(), r2);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() <= 0) goto L6;
        validateModification();
        this.parentList.removeRange(this.offset, this.offset + size());
        this.size = 0;
        this.structure = this.parentList.getStructure$runtime_release();
        return;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        validateModification();
        Ref.IntRef current = new Ref.IntRef();
        current.element = index - 1;
        return new AnonymousClass1(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int index = indexOf(element);
        if (index < 0) goto L5;
        remove(index);
        return true;
    L5:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> r5) {
        boolean removed = false;
        Iterator<? extends Object> r1 = r5.iterator();
    L4:
        if (r1.hasNext() == false) goto L12;
        Object element = r1.next();
        if (remove(element) == true) goto L10;
        if (removed == true) goto L10;
        boolean r3 = false;
    L11:
        removed = r3;
    L10:
        r3 = true;
        goto L11
    L12:
        return removed;
    }

    public T removeAt(int index) {
        validateModification();
        T r0 = this.parentList.remove(this.offset + index);
        this.size = size() - 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return r0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> r5) {
        validateModification();
        int removed = this.parentList.retainAllInRange$runtime_release(r5, this.offset, this.offset + size());
        if (removed <= 0) goto L5;
        this.structure = this.parentList.getStructure$runtime_release();
        this.size = size() - removed;
    L5:
        if (removed <= 0) goto L7;
        return true;
    L7:
        return false;
    }

    @Override // java.util.List
    public T set(int index, T r4) {
        SnapshotStateListKt.access$validateRange(index, size());
        validateModification();
        T r0 = this.parentList.set(this.offset + index, r4);
        this.structure = this.parentList.getStructure$runtime_release();
        return r0;
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        boolean value$iv = true;
        if (fromIndex < 0) goto L6;
        if (fromIndex > toIndex) goto L6;
        boolean r2 = true;
    L7:
        if (r2 == true) goto L9;
    L11:
        value$iv = false;
    L13:
        if (value$iv == true) goto L15;
        PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
    L15:
        validateModification();
        return new SubList(this.parentList, this.offset + fromIndex, this.offset + toIndex);
    L9:
        if (toIndex > size()) goto L11;
    L6:
        r2 = false;
        goto L7
    }

    private final void validateModification() {
        if (this.parentList.getStructure$runtime_release() != this.structure) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException();
    }
}
