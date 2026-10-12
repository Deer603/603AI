package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    ArrayMap<K, V>.EntrySet mEntrySet;
    ArrayMap<K, V>.KeySet mKeySet;
    ArrayMap<K, V>.ValueCollection mValues;

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        final /* synthetic */ ArrayMap this$0;

        EntrySet(ArrayMap this$0) {
            this.this$0 = this$0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new MapIterator(this.this$0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.size();
        }
    }

    final class KeyIterator extends IndexBasedArrayIterator<K> {
        final /* synthetic */ ArrayMap this$0;

        KeyIterator(ArrayMap this$0) {
            this.this$0 = this$0;
            super(this$0.size());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected K elementAt(int index) {
            return this.this$0.keyAt(index);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int index) {
            this.this$0.removeAt(index);
        }
    }

    final class KeySet implements Set<K> {
        final /* synthetic */ ArrayMap this$0;

        KeySet(ArrayMap this$0) {
            this.this$0 = this$0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K object) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object object) {
            return this.this$0.containsKey(object);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.this$0.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.this$0.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new KeyIterator(this.this$0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object object) {
            int index = this.this$0.indexOfKey(object);
            if (index < 0) goto L6;
            this.this$0.removeAt(index);
            return true;
        L6:
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.this$0.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.this$0.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.this$0.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int N = this.this$0.size();
            Object[] result = new Object[N];
            int i = 0;
        L3:
            if (i >= N) goto L5;
            result[i] = this.this$0.keyAt(i);
            i = i + 1;
            goto L3
        L5:
            return result;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r4) {
            int r0 = size();
            if (r4.length >= r0) goto L5;
            r4 = (T[]) ((Object[]) Array.newInstance(r4.getClass().getComponentType(), r0));
        L5:
            int r1 = 0;
        L6:
            if (r1 >= r0) goto L9;
            T[] r5 = r4;
            r5[r1] = this.this$0.keyAt(r1);
            r1 = r1 + 1;
            goto L6
        L9:
            if (r4.length <= r0) goto L11;
            r4[r0] = null;
        L11:
            return r4;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object object) {
            return ArrayMap.equalsSetHelper(this, object);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int result = 0;
            int i = this.this$0.size() - 1;
        L3:
            if (i < 0) goto L9;
            K obj = this.this$0.keyAt(i);
            if (obj != null) goto L7;
            int r3 = 0;
        L8:
            result = result + r3;
            i = i - 1;
            goto L3
        L7:
            r3 = obj.hashCode();
            goto L8
        L9:
            return result;
        }
    }

    final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int mEnd;
        boolean mEntryValid;
        int mIndex;
        final /* synthetic */ ArrayMap this$0;

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return next();
        }

        MapIterator(ArrayMap this$0) {
            this.this$0 = this$0;
            this.mEnd = this$0.size() - 1;
            this.mIndex = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.mIndex >= this.mEnd) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (hasNext() == false) goto L7;
            this.mIndex++;
            this.mEntryValid = true;
            return this;
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.mEntryValid == false) goto L7;
            this.this$0.removeAt(this.mIndex);
            this.mIndex--;
            this.mEnd--;
            this.mEntryValid = false;
            return;
        L7:
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.mEntryValid == false) goto L7;
            return this.this$0.keyAt(this.mIndex);
        L7:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.mEntryValid == false) goto L7;
            return this.this$0.valueAt(this.mIndex);
        L7:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V setValue(V object) {
            if (this.mEntryValid == false) goto L7;
            return this.this$0.setValueAt(this.mIndex, object);
        L7:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object o) {
            if (this.mEntryValid == false) goto L15;
            if ((o instanceof Map.Entry) == true) goto L7;
            return false;
        L7:
            Map.Entry<?, ?> e = (Map.Entry) o;
            if (ContainerHelpersKt.equal(e.getKey(), this.this$0.keyAt(this.mIndex)) == true) goto L10;
            return false;
        L10:
            if (ContainerHelpersKt.equal(e.getValue(), this.this$0.valueAt(this.mIndex)) == false) goto L17;
            return true;
        L17:
            return false;
        L15:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.mEntryValid == false) goto L14;
            K key = this.this$0.keyAt(this.mIndex);
            V value = this.this$0.valueAt(this.mIndex);
            int r2 = 0;
            if (key != null) goto L7;
            int r3 = 0;
        L8:
            if (value == null) goto L12;
            r2 = value.hashCode();
        L12:
            return r2 ^ r3;
        L7:
            r3 = key.hashCode();
            goto L8
        L14:
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class ValueCollection implements Collection<V> {
        final /* synthetic */ ArrayMap this$0;

        ValueCollection(ArrayMap this$0) {
            this.this$0 = this$0;
        }

        @Override // java.util.Collection
        public boolean add(V object) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            this.this$0.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object object) {
            if (this.this$0.__restricted$indexOfValue(object) < 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> r0 = collection.iterator();
        L4:
            if (r0.hasNext() == false) goto L10;
            Object o = r0.next();
            if (contains(o) == true) goto L4;
            return false;
        L10:
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.this$0.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator(this.this$0);
        }

        @Override // java.util.Collection
        public boolean remove(Object object) {
            int index = this.this$0.__restricted$indexOfValue(object);
            if (index < 0) goto L6;
            this.this$0.removeAt(index);
            return true;
        L6:
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int N = this.this$0.size();
            boolean changed = false;
            int i = 0;
        L3:
            if (i >= N) goto L8;
            V cur = this.this$0.valueAt(i);
            if (collection.contains(cur) == false) goto L7;
            this.this$0.removeAt(i);
            i = i - 1;
            N = N - 1;
            changed = true;
        L7:
            i = i + 1;
            goto L3
        L8:
            return changed;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int N = this.this$0.size();
            boolean changed = false;
            int i = 0;
        L3:
            if (i >= N) goto L8;
            V cur = this.this$0.valueAt(i);
            if (collection.contains(cur) == true) goto L7;
            this.this$0.removeAt(i);
            i = i - 1;
            N = N - 1;
            changed = true;
        L7:
            i = i + 1;
            goto L3
        L8:
            return changed;
        }

        @Override // java.util.Collection
        public int size() {
            return this.this$0.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int N = this.this$0.size();
            Object[] result = new Object[N];
            int i = 0;
        L3:
            if (i >= N) goto L5;
            result[i] = this.this$0.valueAt(i);
            i = i + 1;
            goto L3
        L5:
            return result;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] r4) {
            int r0 = size();
            if (r4.length >= r0) goto L5;
            r4 = (T[]) ((Object[]) Array.newInstance(r4.getClass().getComponentType(), r0));
        L5:
            int r1 = 0;
        L6:
            if (r1 >= r0) goto L9;
            T[] r5 = r4;
            r5[r1] = this.this$0.valueAt(r1);
            r1 = r1 + 1;
            goto L6
        L9:
            if (r4.length <= r0) goto L11;
            r4[r0] = null;
        L11:
            return r4;
        }
    }

    final class ValueIterator extends IndexBasedArrayIterator<V> {
        final /* synthetic */ ArrayMap this$0;

        ValueIterator(ArrayMap this$0) {
            this.this$0 = this$0;
            super(this$0.size());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected V elementAt(int index) {
            return this.this$0.valueAt(index);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int index) {
            this.this$0.removeAt(index);
        }
    }

    public ArrayMap() {
    }

    public ArrayMap(int capacity) {
        super(capacity);
    }

    public ArrayMap(SimpleArrayMap map) {
        super(map);
    }

    public boolean containsAll(Collection<?> collection) {
        Iterator<?> r0 = collection.iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        Object o = r0.next();
        if (containsKey(o) == true) goto L4;
        return false;
    L10:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsKey(Object r2) {
        return super.containsKey(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsValue(Object r2) {
        return super.containsValue(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V get(Object r2) {
        return (V) super.get(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V remove(Object r2) {
        return (V) super.remove(r2);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(size() + map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> r0 = map.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Map.Entry<? extends K, ? extends V> entry = r0.next();
        put(entry.getKey(), entry.getValue());
        goto L4
    }

    public boolean removeAll(Collection<?> collection) {
        int oldSize = size();
        Iterator<?> r1 = collection.iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        Object o = r1.next();
        remove(o);
        goto L4
    L7:
        if (oldSize == size()) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean retainAll(Collection<?> collection) {
        int oldSize = size();
        int i = size() - 1;
    L3:
        if (i < 0) goto L8;
        if (collection.contains(keyAt(i)) == true) goto L7;
        removeAt(i);
    L7:
        i = i - 1;
        goto L3
    L8:
        int i2 = size();
        if (oldSize != i2) goto L16;
        return false;
    L16:
        return true;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> entrySet = this.mEntrySet;
        if (entrySet != null) goto L6;
        ArrayMap<K, V>.EntrySet r1 = new EntrySet(this);
        this.mEntrySet = r1;
        return r1;
    L6:
        return entrySet;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        Set<K> keySet = this.mKeySet;
        if (keySet != null) goto L6;
        ArrayMap<K, V>.KeySet r1 = new KeySet(this);
        this.mKeySet = r1;
        return r1;
    L6:
        return keySet;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        Collection<V> values = this.mValues;
        if (values != null) goto L6;
        ArrayMap<K, V>.ValueCollection r1 = new ValueCollection(this);
        this.mValues = r1;
        return r1;
    L6:
        return values;
    }

    static <T> boolean equalsSetHelper(Set<T> set, Object object) {
        if (set != object) goto L6;
        return true;
    L6:
        if ((object instanceof Set) == false) goto L18;
        Set<?> s = (Set) object;
        if (set.size() != s.size()) goto L14;
        if (set.containsAll(s) == false) goto L14;
        return true;
    L14:
        return false;
    L18:
        return false;
    }
}
