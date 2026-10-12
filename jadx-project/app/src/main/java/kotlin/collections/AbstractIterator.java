package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u000fH$J\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u000fH\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0014"}, d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "<init>", "()V", "state", "", "nextValue", "Ljava/lang/Object;", "hasNext", "", "next", "()Ljava/lang/Object;", "tryToComputeNext", "computeNext", "", "setNext", "value", "(Ljava/lang/Object;)V", "done", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {
    private T nextValue;
    private int state;

    protected abstract void computeNext();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AbstractIterator() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        switch(this.state) {
            case 0: goto L9;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        return false;
    L7:
        return true;
    L5:
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    L9:
        return tryToComputeNext();
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.state != 1) goto L7;
        this.state = 0;
        return this.nextValue;
    L7:
        if (this.state == 2) goto L13;
        if (tryToComputeNext() == false) goto L13;
        this.state = 0;
        return this.nextValue;
    L13:
        throw new NoSuchElementException();
    }

    private final boolean tryToComputeNext() {
        this.state = 3;
        computeNext();
        if (this.state == 1) goto L7;
        return false;
    L7:
        return true;
    }

    protected final void setNext(T r2) {
        this.nextValue = r2;
        this.state = 1;
    }

    protected final void done() {
        this.state = 2;
    }
}
