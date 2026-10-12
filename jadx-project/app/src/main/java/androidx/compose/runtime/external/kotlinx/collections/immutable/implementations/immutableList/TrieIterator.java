package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrieIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B-\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\r\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u000e\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010J\r\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J7\u0010\u0018\u001a\u00020\u00122\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\nR\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "root", "", "", "index", "", "size", "height", "([Ljava/lang/Object;III)V", "isInRightEdge", "", "path", "[Ljava/lang/Object;", "elementAtCurrentIndex", "()Ljava/lang/Object;", "fillPath", "", "startLevel", "fillPathIfNeeded", "indexPredicate", "next", "previous", "reset", "reset$runtime_release", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TrieIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 0;
    private int height;
    private boolean isInRightEdge;
    private Object[] path;

    static {
        $stable = 8;
    }

    public TrieIterator(Object[] r4, int r5, int r6, int r7) {
        super(r5, r6);
        this.height = r7;
        this.path = new Object[this.height];
        if (r5 != r6) goto L5;
        boolean r2 = true;
    L6:
        this.isInRightEdge = r2;
        this.path[0] = r4;
        fillPath(r5 - (this.isInRightEdge ? 1 : 0), 1);
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final void reset$runtime_release(Object[] r3, int r4, int r5, int r6) {
        setIndex(r4);
        setSize(r5);
        this.height = r6;
        if (this.path.length >= r6) goto L5;
        this.path = new Object[r6];
    L5:
        boolean r1 = false;
        this.path[0] = r3;
        if (r4 != r5) goto L8;
        r1 = true;
    L8:
        this.isInRightEdge = r1;
        fillPath(r4 - (this.isInRightEdge ? 1 : 0), 1);
    }

    private final void fillPath(int index, int startLevel) {
        int shift = (this.height - startLevel) * 5;
        int i = startLevel;
    L4:
        if (i >= this.height) goto L6;
        Object[] r2 = this.path;
        Object r3 = this.path[i - 1];
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r2[i] = ((Object[]) r3)[UtilsKt.indexSegment(index, shift)];
        shift = shift - 5;
        i = i + 1;
        goto L4
    }

    private final void fillPathIfNeeded(int indexPredicate) {
        int shift = 0;
    L4:
        if (UtilsKt.indexSegment(getIndex(), shift) != indexPredicate) goto L6;
        shift = shift + 5;
        goto L4
    L6:
        if (shift <= 0) goto L10;
        int level = (this.height - 1) - (shift / 5);
        fillPath(getIndex(), level + 1);
        return;
    }

    private final E elementAtCurrentIndex() {
        int r0 = getIndex() & 31;
        Object r1 = this.path[this.height - 1];
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) r1)[r0];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext() == false) goto L11;
        E r0 = elementAtCurrentIndex();
        setIndex(getIndex() + 1);
        if (getIndex() != getSize()) goto L8;
        this.isInRightEdge = true;
        return r0;
    L8:
        fillPathIfNeeded(0);
        return r0;
    L11:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious() == false) goto L11;
        setIndex(getIndex() - 1);
        if (this.isInRightEdge == false) goto L8;
        this.isInRightEdge = false;
        return elementAtCurrentIndex();
    L8:
        fillPathIfNeeded(31);
        return elementAtCurrentIndex();
    L11:
        throw new NoSuchElementException();
    }
}
