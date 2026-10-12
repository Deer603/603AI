package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005B9\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J5\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\r2\u000e\u0010\u001a\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0001¢\u0006\u0002\u0010!R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "path", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "expectedModCount", "", "lastIteratedKey", "Ljava/lang/Object;", "nextWasInvoked", "", "checkForComodification", "", "checkNextWasInvoked", "next", "()Ljava/lang/Object;", "remove", "resetPath", "keyHash", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "key", "pathIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Ljava/lang/Object;I)V", "setValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMutableIterator {
    public static final int $stable = 0;
    private final PersistentHashMapBuilder<K, V> builder;
    private int expectedModCount;
    private K lastIteratedKey;
    private boolean nextWasInvoked;

    static {
        $stable = 8;
    }

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder<K, V> r2, TrieNodeBaseIterator<K, V, T>[] r3) {
        super(r2.getNode$runtime_release(), r3);
        this.builder = r2;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        this.lastIteratedKey = currentKey();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext() == false) goto L9;
        K r0 = currentKey();
        PersistentHashMapBuilder<K, V> r2 = this.builder;
        TypeIntrinsics.asMutableMap(r2).remove(this.lastIteratedKey);
        if (r0 == null) goto L7;
        int r3 = r0.hashCode();
    L8:
        resetPath(r3, this.builder.getNode$runtime_release(), r0, 0);
    L10:
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
        return;
    L7:
        r3 = 0;
        goto L8
    L9:
        PersistentHashMapBuilder<K, V> r1 = this.builder;
        TypeIntrinsics.asMutableMap(r1).remove(this.lastIteratedKey);
        goto L10
    }

    public final void setValue(K r5, V r6) {
        if (this.builder.containsKey(r5) == true) goto L6;
        return;
    L6:
        if (hasNext() == false) goto L12;
        K r0 = currentKey();
        this.builder.put(r5, r6);
        if (r0 == null) goto L10;
        int r2 = r0.hashCode();
    L11:
        resetPath(r2, this.builder.getNode$runtime_release(), r0, 0);
    L13:
        this.expectedModCount = this.builder.getModCount$runtime_release();
        return;
    L10:
        r2 = 0;
        goto L11
    L12:
        this.builder.put(r5, r6);
        goto L13
    }

    private final void resetPath(int keyHash, TrieNode<?, ?> r9, K r10, int pathIndex) {
        int shift = pathIndex * 5;
        if (shift <= 30) goto L10;
        getPath()[pathIndex].reset(r9.getBuffer$runtime_release(), r9.getBuffer$runtime_release().length, 0);
    L6:
        if (Intrinsics.areEqual(getPath()[pathIndex].currentKey(), r10) == true) goto L8;
        getPath()[pathIndex].moveToNextKey();
        goto L6
    L8:
        setPathLastIndex(pathIndex);
        return;
    L10:
        int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (r9.hasEntryAt$runtime_release(keyPositionMask) == false) goto L14;
        int keyIndex = r9.entryKeyIndex$runtime_release(keyPositionMask);
        getPath()[pathIndex].reset(r9.getBuffer$runtime_release(), r9.entryCount$runtime_release() * 2, keyIndex);
        setPathLastIndex(pathIndex);
        return;
    L14:
        int nodeIndex = r9.nodeIndex$runtime_release(keyPositionMask);
        TrieNode<?, ?> r3 = r9.nodeAtIndex$runtime_release(nodeIndex);
        getPath()[pathIndex].reset(r9.getBuffer$runtime_release(), r9.entryCount$runtime_release() * 2, nodeIndex);
        resetPath(keyHash, r3, r10, pathIndex + 1);
    }

    private final void checkNextWasInvoked() {
        if (this.nextWasInvoked == false) goto L6;
        return;
    L6:
        throw new IllegalStateException();
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$runtime_release() != this.expectedModCount) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException();
    }
}
