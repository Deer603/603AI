package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0004J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00180\u001aJ\r\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001cR\u001f\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t0\u0007X\u0082\u0004R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "E", "", "singleConsumer", "", "(Z)V", "_cur", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "isEmpty", "()Z", "size", "", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)Z", "close", "", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "removeFirstOrNull", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LockFreeTaskQueue<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _cur$volatile$FU = null;
    private volatile /* synthetic */ Object _cur$volatile;

    static {
        _cur$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    }

    private final /* synthetic */ Object get_cur$volatile() {
        return this._cur$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_cur$volatile$FU() {
        return _cur$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicReferenceFieldUpdater r3, Function1<Object, Unit> r4) {
    L2:
        r4.invoke(r3.get(r2));
        goto L2
    }

    private final /* synthetic */ void set_cur$volatile(Object r1) {
        this._cur$volatile = r1;
    }

    public LockFreeTaskQueue(boolean singleConsumer) {
        this._cur$volatile = new LockFreeTaskQueueCore(8, singleConsumer);
    }

    public final boolean isEmpty() {
        return ((LockFreeTaskQueueCore) get_cur$volatile$FU().get(this)).isEmpty();
    }

    public final int getSize() {
        return ((LockFreeTaskQueueCore) get_cur$volatile$FU().get(this)).getSize();
    }

    public final void close() {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_cur$volatile$FU();
    L3:
        LockFreeTaskQueueCore cur = (LockFreeTaskQueueCore) handler$atomicfu$iv.get(this);
        if (cur.close() == true) goto L5;
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_cur$volatile$FU(), this, cur, cur.next());
        goto L3
    }

    public final boolean addLast(E r7) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_cur$volatile$FU();
    L3:
        LockFreeTaskQueueCore cur = (LockFreeTaskQueueCore) handler$atomicfu$iv.get(this);
        switch(cur.addLast(r7)) {
            case 0: goto L9;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L3;
        };
    L6:
        return false;
    L8:
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_cur$volatile$FU(), this, cur, cur.next());
        goto L3
    L9:
        return true;
    }

    public final E removeFirstOrNull() {
        AtomicReferenceFieldUpdater r0 = get_cur$volatile$FU();
    L3:
        LockFreeTaskQueueCore r2 = (LockFreeTaskQueueCore) r0.get(this);
        E r4 = (E) r2.removeFirstOrNull();
        if (r4 != LockFreeTaskQueueCore.REMOVE_FROZEN) goto L5;
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_cur$volatile$FU(), this, r2, r2.next());
        goto L3
    L5:
        return r4;
    }

    public final <R> List<R> map(Function1<? super E, ? extends R> r2) {
        return ((LockFreeTaskQueueCore) get_cur$volatile$FU().get(this)).map(r2);
    }

    public final boolean isClosed() {
        return ((LockFreeTaskQueueCore) get_cur$volatile$FU().get(this)).isClosed();
    }
}
