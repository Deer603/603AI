package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: PersistentHashSetMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0014\u0010\u0010\u001a\u00020\f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\u000e\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0016J1\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", "expectedModCount", "", "lastIteratedElement", "Ljava/lang/Object;", "nextWasInvoked", "", "checkForComodification", "", "checkNextWasInvoked", "isCollision", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "next", "()Ljava/lang/Object;", "remove", "resetPath", "hashCode", "element", "pathIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, KMutableIterator {
    public static final int $stable = 0;
    private final PersistentHashSetBuilder<E> builder;
    private int expectedModCount;
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    static {
        $stable = 8;
    }

    public PersistentHashSetMutableIterator(PersistentHashSetBuilder<E> r2) {
        super(r2.getNode$runtime_release());
        this.builder = r2;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E r0 = (E) super.next();
        this.lastIteratedElement = r0;
        this.nextWasInvoked = true;
        return r0;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext() == false) goto L9;
        E r0 = currentElement();
        PersistentHashSetBuilder<E> r2 = this.builder;
        TypeIntrinsics.asMutableCollection(r2).remove(this.lastIteratedElement);
        if (r0 == null) goto L7;
        int r3 = r0.hashCode();
    L8:
        resetPath(r3, this.builder.getNode$runtime_release(), r0, 0);
    L10:
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
        return;
    L7:
        r3 = 0;
        goto L8
    L9:
        PersistentHashSetBuilder<E> r1 = this.builder;
        TypeIntrinsics.asMutableCollection(r1).remove(this.lastIteratedElement);
        goto L10
    }

    private final void resetPath(int hashCode, TrieNode<?> r7, E r8, int pathIndex) {
        boolean r1 = true;
        if (isCollision(r7) == false) goto L10;
        int index = ArraysKt.indexOf(r7.getBuffer(), r8);
        if (index != (-1)) goto L8;
        r1 = false;
    L8:
        CommonFunctionsKt.m3921assert(r1);
        getPath().get(pathIndex).reset(r7.getBuffer(), index);
        setPathLastIndex(pathIndex);
        return;
    L10:
        int position = 1 << TrieNodeKt.indexSegment(hashCode, pathIndex * 5);
        int index2 = r7.indexOfCellAt$runtime_release(position);
        getPath().get(pathIndex).reset(r7.getBuffer(), index2);
        Object cell = r7.getBuffer()[index2];
        if ((cell instanceof TrieNode) == false) goto L13;
        resetPath(hashCode, (TrieNode) cell, r8, pathIndex + 1);
        return;
    L13:
        setPathLastIndex(pathIndex);
    }

    private final boolean isCollision(TrieNode<?> r2) {
        if (r2.getBitmap() != 0) goto L5;
        return true;
    L5:
        return false;
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
