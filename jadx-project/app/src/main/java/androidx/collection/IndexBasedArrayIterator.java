package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: IndexBasedArrayIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H$¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\u0007H\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0004H$R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/collection/IndexBasedArrayIterator;", "T", "", "startingSize", "", "(I)V", "canRemove", "", "index", "size", "elementAt", "(I)Ljava/lang/Object;", "hasNext", "next", "()Ljava/lang/Object;", "remove", "", "removeAt", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, KMutableIterator {
    private boolean canRemove;
    private int index;
    private int size;

    protected abstract T elementAt(int r1);

    protected abstract void removeAt(int r1);

    public IndexBasedArrayIterator(int startingSize) {
        this.size = startingSize;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index >= this.size) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext() == false) goto L7;
        T r0 = elementAt(this.index);
        this.index++;
        this.canRemove = true;
        return r0;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        boolean value$iv = this.canRemove;
        if (value$iv == true) goto L5;
        RuntimeHelpersKt.throwIllegalStateException("Call next() before removing an element.");
    L5:
        this.index--;
        removeAt(this.index);
        this.size--;
        this.canRemove = false;
    }
}
