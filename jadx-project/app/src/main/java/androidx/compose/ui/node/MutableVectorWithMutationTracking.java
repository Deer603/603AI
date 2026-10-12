package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: MutableVectorWithMutationTracking.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u001b\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bJ\u0006\u0010\u0017\u001a\u00020\u0007J\u001d\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u001aH\u0086\bJ\u0016\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\fH\u0086\n¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0002\u0010\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "T", "", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "onVectorMutated", "Lkotlin/Function0;", "", "(Landroidx/compose/runtime/collection/MutableVector;Lkotlin/jvm/functions/Function0;)V", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "size", "", "getSize", "()I", "getVector", "()Landroidx/compose/runtime/collection/MutableVector;", "add", "index", "element", "(ILjava/lang/Object;)V", "asList", "", "clear", "forEach", "block", "Lkotlin/Function1;", "get", "(I)Ljava/lang/Object;", "removeAt", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = 0;
    private final Function0<Unit> onVectorMutated;
    private final MutableVector<T> vector;

    static {
        $stable = MutableVector.$stable;
    }

    public MutableVectorWithMutationTracking(MutableVector<T> r1, Function0<Unit> r2) {
        this.vector = r1;
        this.onVectorMutated = r2;
    }

    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final Function0<Unit> getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return getVector().getSize();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void add(int index, T r3) {
        this.vector.add(index, r3);
        this.onVectorMutated.invoke();
    }

    public final T removeAt(int index) {
        T r0 = this.vector.removeAt(index);
        this.onVectorMutated.invoke();
        return r0;
    }

    public final void forEach(Function1<? super T, Unit> r8) {
        MutableVector<T> r1 = getVector();
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L6;
        r8.invoke(content$iv[i$iv]);
        i$iv = i$iv + 1;
        goto L3
    }

    public final List<T> asList() {
        return getVector().asMutableList();
    }

    public final T get(int index) {
        return getVector().content[index];
    }
}
