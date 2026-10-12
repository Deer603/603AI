package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    private Entry<K, V> mEnd;
    private final WeakHashMap<SupportRemove<K, V>, Boolean> mIterators;
    private int mSize;
    Entry<K, V> mStart;

    static class AscendingIterator<K, V> extends ListIterator<K, V> {
        AscendingIterator(Entry<K, V> start, Entry<K, V> expectedEnd) {
            super(start, expectedEnd);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry<K, V> forward(Entry<K, V> entry) {
            return entry.mNext;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry<K, V> backward(Entry<K, V> entry) {
            return entry.mPrevious;
        }
    }

    private static class DescendingIterator<K, V> extends ListIterator<K, V> {
        DescendingIterator(Entry<K, V> start, Entry<K, V> expectedEnd) {
            super(start, expectedEnd);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry<K, V> forward(Entry<K, V> entry) {
            return entry.mPrevious;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry<K, V> backward(Entry<K, V> entry) {
            return entry.mNext;
        }
    }

    static class Entry<K, V> implements Map.Entry<K, V> {
        final K mKey;
        Entry<K, V> mNext;
        Entry<K, V> mPrevious;
        final V mValue;

        Entry(K key, V value) {
            this.mKey = key;
            this.mValue = value;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.mKey;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.mValue;
        }

        @Override // java.util.Map.Entry
        public V setValue(V value) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.mKey + "=" + this.mValue;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj != this) goto L6;
            return true;
        L6:
            if ((obj instanceof Entry) == true) goto L8;
            return false;
        L8:
            Entry entry = (Entry) obj;
            if (this.mKey.equals(entry.mKey) == false) goto L14;
            if (this.mValue.equals(entry.mValue) == false) goto L14;
            return true;
        L14:
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.mKey.hashCode() ^ this.mValue.hashCode();
        }
    }

    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        private boolean mBeforeStart;
        private Entry<K, V> mCurrent;
        final /* synthetic */ SafeIterableMap this$0;

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return next();
        }

        IteratorWithAdditions(SafeIterableMap this$0) {
            this.this$0 = this$0;
            this.mBeforeStart = true;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        void supportRemove(Entry<K, V> entry) {
            if (entry != this.mCurrent) goto L10;
            this.mCurrent = this.mCurrent.mPrevious;
            if (this.mCurrent != null) goto L7;
            boolean r0 = true;
        L8:
            this.mBeforeStart = r0;
            return;
        L7:
            r0 = false;
            goto L8
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.mBeforeStart == false) goto L10;
            if (this.this$0.mStart == null) goto L8;
            return true;
        L8:
            return false;
        L10:
            if (this.mCurrent == null) goto L15;
            if (this.mCurrent.mNext == null) goto L15;
            return true;
        L15:
            return false;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.mBeforeStart == false) goto L6;
            this.mBeforeStart = false;
            this.mCurrent = this.this$0.mStart;
        L11:
            return this.mCurrent;
        L6:
            if (this.mCurrent == null) goto L8;
            Entry<K, V> r0 = this.mCurrent.mNext;
        L9:
            this.mCurrent = r0;
            goto L11
        L8:
            r0 = null;
            goto L9
        }
    }

    private static abstract class ListIterator<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        Entry<K, V> mExpectedEnd;
        Entry<K, V> mNext;

        abstract Entry<K, V> backward(Entry<K, V> r1);

        abstract Entry<K, V> forward(Entry<K, V> r1);

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return next();
        }

        ListIterator(Entry<K, V> start, Entry<K, V> expectedEnd) {
            this.mExpectedEnd = expectedEnd;
            this.mNext = start;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.mNext == null) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry<K, V> entry) {
            if (this.mExpectedEnd != entry) goto L8;
            if (entry != this.mNext) goto L8;
            this.mNext = null;
            this.mExpectedEnd = null;
        L8:
            if (this.mExpectedEnd != entry) goto L11;
            this.mExpectedEnd = backward(this.mExpectedEnd);
        L11:
            if (this.mNext != entry) goto L14;
            this.mNext = nextNode();
            return;
        }

        private Entry<K, V> nextNode() {
            if (this.mNext != this.mExpectedEnd) goto L5;
            return null;
        L5:
            if (this.mExpectedEnd != null) goto L8;
            return null;
        L8:
            return forward(this.mNext);
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> result = this.mNext;
            this.mNext = nextNode();
            return result;
        }
    }

    public static abstract class SupportRemove<K, V> {
        abstract void supportRemove(Entry<K, V> r1);

        public SupportRemove() {
        }
    }

    public SafeIterableMap() {
        this.mIterators = new WeakHashMap();
        this.mSize = 0;
    }

    protected Entry<K, V> get(K k) {
        Entry<K, V> currentNode = this.mStart;
    L3:
        if (currentNode == null) goto L8;
        if (currentNode.mKey.equals(k) == true) goto L8;
        currentNode = currentNode.mNext;
    L8:
        return currentNode;
    }

    public V putIfAbsent(K key, V v) {
        Entry<K, V> entry = get(key);
        if (entry != null) goto L5;
        put(key, v);
        return null;
    L5:
        return entry.mValue;
    }

    Entry<K, V> put(K key, V v) {
        Entry<K, V> newEntry = new Entry(key, v);
        this.mSize++;
        if (this.mEnd != null) goto L6;
        this.mStart = newEntry;
        this.mEnd = this.mStart;
        return newEntry;
    L6:
        this.mEnd.mNext = newEntry;
        newEntry.mPrevious = this.mEnd;
        this.mEnd = newEntry;
        return newEntry;
    }

    public V remove(K key) {
        Entry<K, V> toRemove = get(key);
        if (toRemove != null) goto L5;
        return null;
    L5:
        this.mSize--;
        if (this.mIterators.isEmpty() == true) goto L12;
        Iterator<SupportRemove<K, V>> r2 = this.mIterators.keySet().iterator();
    L9:
        if (r2.hasNext() == false) goto L12;
        SupportRemove<K, V> iter = r2.next();
        iter.supportRemove(toRemove);
    L12:
        if (toRemove.mPrevious == null) goto L14;
        toRemove.mPrevious.mNext = toRemove.mNext;
    L16:
        if (toRemove.mNext == null) goto L18;
        toRemove.mNext.mPrevious = toRemove.mPrevious;
    L19:
        toRemove.mNext = null;
        toRemove.mPrevious = null;
        return toRemove.mValue;
    L18:
        this.mEnd = toRemove.mPrevious;
        goto L19
    L14:
        this.mStart = toRemove.mNext;
        goto L16
    }

    public int size() {
        return this.mSize;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        ListIterator<K, V> iterator = new AscendingIterator(this.mStart, this.mEnd);
        this.mIterators.put(iterator, false);
        return iterator;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        DescendingIterator<K, V> iterator = new DescendingIterator(this.mEnd, this.mStart);
        this.mIterators.put(iterator, false);
        return iterator;
    }

    public SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions() {
        SafeIterableMap<K, V>.IteratorWithAdditions iterator = new IteratorWithAdditions(this);
        this.mIterators.put(iterator, false);
        return iterator;
    }

    public Map.Entry<K, V> eldest() {
        return this.mStart;
    }

    public Map.Entry<K, V> newest() {
        return this.mEnd;
    }

    public boolean equals(Object obj) {
        if (obj != this) goto L6;
        return true;
    L6:
        if ((obj instanceof SafeIterableMap) == true) goto L8;
        return false;
    L8:
        SafeIterableMap map = (SafeIterableMap) obj;
        if (size() == map.size()) goto L11;
        return false;
    L11:
        Iterator<Map.Entry<K, V>> iterator1 = iterator();
        Iterator<Map.Entry<K, V>> r4 = map.iterator();
    L13:
        if (iterator1.hasNext() == false) goto L25;
        if (r4.hasNext() == false) goto L25;
        Map.Entry<K, V> next1 = iterator1.next();
        Object next2 = r4.next();
        if (next1 != null) goto L19;
        if (next2 == null) goto L19;
    L22:
        return false;
    L19:
        if (next1 == null) goto L13;
        if (next1.equals(next2) == true) goto L13;
    L25:
        if (iterator1.hasNext() == true) goto L30;
        if (r4.hasNext() == true) goto L30;
        return true;
    L30:
        return false;
    }

    public int hashCode() {
        int h = 0;
        Iterator<Map.Entry<K, V>> r1 = iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        Map.Entry<K, V> kvEntry = r1.next();
        h = h + kvEntry.hashCode();
        goto L4
    L6:
        return h;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Iterator<Map.Entry<K, V>> iterator = iterator();
    L4:
        if (iterator.hasNext() == false) goto L8;
        builder.append(iterator.next().toString());
        if (iterator.hasNext() == false) goto L4;
        builder.append(", ");
        goto L4
    L8:
        builder.append("]");
        return builder.toString();
    }
}
