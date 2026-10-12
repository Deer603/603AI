package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\r\u0010\u001a\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0019H\u0002J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\u000e\u0010\u001f\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u001bR\u0018\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000eR.\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\bX\u0084\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", "V", "T", "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "path", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "hasNext", "", "getHasNext$annotations", "()V", "getPath", "()[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "pathLastIndex", "", "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "checkHasNext", "", "currentKey", "()Ljava/lang/Object;", "ensureNextEntryIsReady", "moveToNextNodeWithData", "pathIndex", "next", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {
    public static final int $stable = 0;
    private boolean hasNext;
    private final TrieNodeBaseIterator<K, V, T>[] path;
    private int pathLastIndex;

    static {
        $stable = 8;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentHashMapBaseIterator(TrieNode<K, V> r5, TrieNodeBaseIterator<K, V, T>[] r6) {
        this.path = r6;
        this.hasNext = true;
        this.path[0].reset(r5.getBuffer$runtime_release(), r5.entryCount$runtime_release() * 2);
        this.pathLastIndex = 0;
        ensureNextEntryIsReady();
    }

    protected final TrieNodeBaseIterator<K, V, T>[] getPath() {
        return this.path;
    }

    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    protected final void setPathLastIndex(int r1) {
        this.pathLastIndex = r1;
    }

    private final int moveToNextNodeWithData(int pathIndex) {
        if (this.path[pathIndex].hasNextKey() == false) goto L6;
        return pathIndex;
    L6:
        if (this.path[pathIndex].hasNextNode() == false) goto L13;
        TrieNode<? extends K, ? extends V> r0 = this.path[pathIndex].currentNode();
        TrieNodeBaseIterator<K, V, T>[] r1 = this.path;
        if (pathIndex != 6) goto L10;
        r1[pathIndex + 1].reset(r0.getBuffer$runtime_release(), r0.getBuffer$runtime_release().length);
    L12:
        return moveToNextNodeWithData(pathIndex + 1);
    L10:
        r1[pathIndex + 1].reset(r0.getBuffer$runtime_release(), r0.entryCount$runtime_release() * 2);
        goto L12
    L13:
        return -1;
    }

    private final void ensureNextEntryIsReady() {
        if (this.path[this.pathLastIndex].hasNextKey() == false) goto L5;
        return;
    L5:
        int i = this.pathLastIndex;
    L7:
        if ((-1) >= i) goto L19;
        int result = moveToNextNodeWithData(i);
        if (result == (-1)) goto L11;
    L13:
        if (result != (-1)) goto L14;
        if (i <= 0) goto L18;
        this.path[i - 1].moveToNextNode();
    L18:
        this.path[i].reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release(), 0);
        i = i - 1;
        goto L7
    L14:
        this.pathLastIndex = result;
        return;
    L11:
        if (this.path[i].hasNextNode() == false) goto L13;
        this.path[i].moveToNextNode();
        result = moveToNextNodeWithData(i);
        goto L13
    L19:
        this.hasNext = false;
    }

    protected final K currentKey() {
        checkHasNext();
        return this.path[this.pathLastIndex].currentKey();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public T next() {
        checkHasNext();
        T r0 = this.path[this.pathLastIndex].next();
        ensureNextEntryIsReady();
        return r0;
    }

    private final void checkHasNext() {
        if (hasNext() == false) goto L6;
        return;
    L6:
        throw new NoSuchElementException();
    }
}
