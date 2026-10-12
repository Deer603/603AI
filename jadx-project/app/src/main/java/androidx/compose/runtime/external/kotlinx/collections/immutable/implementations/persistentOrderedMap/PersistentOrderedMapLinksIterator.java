package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: PersistentOrderedMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B)\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0002J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "nextKey", "", "hashMap", "", "(Ljava/lang/Object;Ljava/util/Map;)V", "index", "", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "getNextKey$runtime_release", "()Ljava/lang/Object;", "setNextKey$runtime_release", "(Ljava/lang/Object;)V", "hasNext", "", "next", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {
    public static final int $stable = 0;
    private final Map<K, LinkedValue<V>> hashMap;
    private int index;
    private Object nextKey;

    static {
        $stable = 8;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentOrderedMapLinksIterator(Object nextKey, Map<K, LinkedValue<V>> r2) {
        this.nextKey = nextKey;
        this.hashMap = r2;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }

    public final Object getNextKey$runtime_release() {
        return this.nextKey;
    }

    public final void setNextKey$runtime_release(Object r1) {
        this.nextKey = r1;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final void setIndex$runtime_release(int r1) {
        this.index = r1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index >= this.hashMap.size()) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    public LinkedValue<V> next() {
        if (hasNext() == false) goto L11;
        LinkedValue<V> r0 = this.hashMap.get(this.nextKey);
        if (r0 == null) goto L9;
        LinkedValue<V> r1 = r0;
        this.index++;
        this.nextKey = r1.getNext();
        return r1;
    L9:
        throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
    L11:
        throw new NoSuchElementException();
    }
}
