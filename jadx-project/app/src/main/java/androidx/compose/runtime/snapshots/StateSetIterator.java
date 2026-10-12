package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: SnapshotStateSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\t\u0010\u001f\u001a\u00020 H\u0096\u0002J\"\u0010!\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010#H\u0082\b¢\u0006\u0002\u0010$J\u000e\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nJ\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0002R\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\r\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Landroidx/compose/runtime/snapshots/StateSetIterator;", "T", "", "set", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "iterator", "", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Ljava/util/Iterator;)V", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getIterator", "()Ljava/util/Iterator;", "modification", "", "getModification", "()I", "setModification", "(I)V", "next", "getNext$annotations", "()V", "getNext", "setNext", "getSet", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "advance", "", "hasNext", "", "modify", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "remove", "validateModification", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StateSetIterator<T> implements Iterator<T>, KMutableIterator {
    private T current;
    private final Iterator<T> iterator;
    private int modification;
    private T next;
    private final SnapshotStateSet<T> set;

    public static /* synthetic */ void getNext$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateSetIterator(SnapshotStateSet<T> r2, Iterator<? extends T> r3) {
        this.set = r2;
        this.iterator = r3;
        this.modification = this.set.getModification$runtime_release();
        advance();
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final SnapshotStateSet<T> getSet() {
        return this.set;
    }

    public final T getCurrent() {
        return this.current;
    }

    public final void setCurrent(T r1) {
        this.current = r1;
    }

    public final T getNext() {
        return this.next;
    }

    public final void setNext(T r1) {
        this.next = r1;
    }

    public final int getModification() {
        return this.modification;
    }

    public final void setModification(int r1) {
        this.modification = r1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.next == null) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        validateModification();
        advance();
        T r0 = this.current;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        validateModification();
        Object value = this.current;
        if (value == null) goto L7;
        this.set.remove(value);
        this.current = null;
        Unit r2 = Unit.INSTANCE;
        this.modification = this.set.getModification$runtime_release();
        return;
    L7:
        throw new IllegalStateException();
    }

    private final void advance() {
        this.current = this.next;
        if (this.iterator.hasNext() == false) goto L5;
        T r0 = this.iterator.next();
    L6:
        this.next = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    private final <T> T modify(Function0<? extends T> r6) {
        validateModification();
        T r1 = r6.invoke();
        this.modification = this.set.getModification$runtime_release();
        return r1;
    }

    private final void validateModification() {
        if (this.set.getModification$runtime_release() != this.modification) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException();
    }
}
