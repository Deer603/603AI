package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0010H$J\b\u0010\u0014\u001a\u00020\u0010H\u0016J*\u0010\u0015\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0004J\"\u0010\u001b\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0004R&\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000@TX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", "T", "Landroidx/compose/runtime/Applier;", "root", "(Ljava/lang/Object;)V", "<set-?>", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Ljava/lang/Object;", "getRoot", "stack", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "clear", "", "down", "node", "onClear", "up", "move", "", "from", "", "to", "count", "remove", "index", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 0;
    private T current;
    private final T root;
    private final ArrayList<T> stack;

    static {
        $stable = 8;
    }

    protected abstract void onClear();

    public AbstractApplier(T r3) {
        this.root = r3;
        this.stack = Stack.m3793constructorimpl$default(null, 1, null);
        this.current = this.root;
    }

    public final T getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    protected void setCurrent(T r1) {
        this.current = r1;
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T r3) {
        Stack.m3803pushimpl(this.stack, getCurrent());
        setCurrent(r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    public void up() {
        setCurrent(Stack.m3802popimpl(this.stack));
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        Stack.m3791clearimpl(this.stack);
        setCurrent(this.root);
        onClear();
    }

    protected final void remove(List<T> r2, int index, int count) {
        if (count != 1) goto L5;
        r2.remove(index);
        return;
    L5:
        r2.subList(index, index + count).clear();
    }

    protected final void move(List<T> r5, int from, int to, int count) {
        if (from <= to) goto L4;
        int dest = to;
    L6:
        if (count == 1) goto L8;
        List<T> r1 = r5.subList(from, from + count);
        List subCopy = CollectionsKt.toMutableList(r1);
        r1.clear();
        r5.addAll(dest, subCopy);
        return;
    L8:
        if (from != (to + 1)) goto L10;
    L13:
        r5.set(from, r5.set(to, r5.get(from)));
        return;
    L10:
        if (from == (to - 1)) goto L13;
        r5.add(dest, r5.remove(from));
        return;
    L4:
        dest = to - count;
        goto L6
    }
}
