package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: WeakCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\r\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/WeakCache;", "T", "", "()V", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "size", "", "getSize", "()I", "values", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/ref/Reference;", "clearWeakReferences", "", "pop", "()Ljava/lang/Object;", "push", "element", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WeakCache<T> {
    public static final int $stable = 0;
    private final ReferenceQueue<T> referenceQueue;
    private final MutableVector<Reference<T>> values;

    static {
        $stable = 8;
    }

    public WeakCache() {
        this.values = new MutableVector(new Reference[16], 0);
        this.referenceQueue = new ReferenceQueue();
    }

    public final void push(T r4) {
        clearWeakReferences();
        this.values.add(new WeakReference(r4, this.referenceQueue));
    }

    public final T pop() {
        clearWeakReferences();
    L4:
        if (this.values.getSize() == 0) goto L6;
        boolean r2 = true;
    L7:
        if (r2 == false) goto L11;
        T r0 = this.values.removeAt(this.values.getSize() - 1).get();
        if (r0 == null) goto L4;
        return r0;
    L11:
        return null;
    L6:
        r2 = false;
        goto L7
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.getSize();
    }

    private final void clearWeakReferences() {
    L2:
        Reference<? extends T> r0 = this.referenceQueue.poll();
        if (r0 == null) goto L5;
        this.values.remove(r0);
    L5:
        if (r0 != null) goto L2;
    }
}
