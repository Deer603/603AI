package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u000eJ\u001e\u0010\u001a\u001a\u0004\u0018\u00018\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0086\b¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00028\u0000¢\u0006\u0002\u0010\"R\u0011\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0082\u0004R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006X\u0082\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0011\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "prev", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "aliveSegmentLeft", "getAliveSegmentLeft", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "aliveSegmentRight", "getAliveSegmentRight", "isRemoved", "", "()Z", "isTail", "next", "getNext", "nextOrClosed", "getNextOrClosed", "()Ljava/lang/Object;", "getPrev", "cleanPrev", "", "markAsClosed", "nextOrIfClosed", "onClosedAction", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "remove", "trySetNext", "value", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _prev$volatile$FU = null;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next$volatile");
        _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev$volatile");
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_next$volatile$FU() {
        return _next$volatile$FU;
    }

    private final /* synthetic */ Object get_prev$volatile() {
        return this._prev$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_prev$volatile$FU() {
        return _prev$volatile$FU;
    }

    private final /* synthetic */ void set_next$volatile(Object r1) {
        this._next$volatile = r1;
    }

    private final /* synthetic */ void set_prev$volatile(Object r1) {
        this._prev$volatile = r1;
    }

    private final /* synthetic */ void update$atomicfu(Object r3, AtomicReferenceFieldUpdater r4, Function1<Object, ? extends Object> r5) {
    L2:
        Object r0 = r4.get(r3);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r0, r5.invoke(r0)) == false) goto L2;
    }

    public abstract boolean isRemoved();

    public ConcurrentLinkedListNode(N r1) {
        this._prev$volatile = r1;
    }

    public static final /* synthetic */ Object access$getNextOrClosed(ConcurrentLinkedListNode $this) {
        return $this.getNextOrClosed();
    }

    private final Object getNextOrClosed() {
        return get_next$volatile$FU().get(this);
    }

    public final N nextOrIfClosed(Function0 onClosedAction) {
        Object it = access$getNextOrClosed(this);
        if (it != ConcurrentLinkedListKt.access$getCLOSED$p()) goto L5;
        onClosedAction.invoke();
        throw new KotlinNothingValueException();
    L5:
        return (N) it;
    }

    public final N getNext() {
        Object it$iv = access$getNextOrClosed(this);
        if (it$iv != ConcurrentLinkedListKt.access$getCLOSED$p()) goto L7;
        return null;
    L7:
        return (N) it$iv;
    }

    public final boolean trySetNext(N r3) {
        return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_next$volatile$FU(), this, null, r3);
    }

    public final boolean isTail() {
        if (getNext() != null) goto L5;
        return true;
    L5:
        return false;
    }

    public final N getPrev() {
        return (N) get_prev$volatile$FU().get(this);
    }

    public final void cleanPrev() {
        get_prev$volatile$FU().set(this, null);
    }

    public final boolean markAsClosed() {
        return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_next$volatile$FU(), this, null, ConcurrentLinkedListKt.access$getCLOSED$p());
    }

    public final void remove() {
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L16;
        if (isRemoved() == false) goto L7;
    L10:
        boolean r1 = true;
    L11:
        if (r1 == true) goto L16;
        throw new AssertionError();
    L7:
        if (isTail() == true) goto L10;
        r1 = false;
    L16:
        if (isTail() == false) goto L18;
        return;
    L18:
        ConcurrentLinkedListNode prev = getAliveSegmentLeft();
        ConcurrentLinkedListNode next = getAliveSegmentRight();
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_prev$volatile$FU();
    L19:
        Object r4 = handler$atomicfu$iv.get(next);
        ConcurrentLinkedListNode it = (ConcurrentLinkedListNode) r4;
        if (it != null) goto L22;
        ConcurrentLinkedListNode r7 = null;
    L24:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu$iv, next, r4, r7) == false) goto L19;
        if (prev == null) goto L28;
        get_next$volatile$FU().set(prev, next);
    L28:
        if (next.isRemoved() == false) goto L31;
        if (next.isTail() == false) goto L18;
    L31:
        if (prev == null) goto L44;
        if (prev.isRemoved() == true) goto L18;
        return;
    L44:
        return;
    L22:
        r7 = prev;
        goto L24
    }

    private final N getAliveSegmentLeft() {
        N r0 = (N) getPrev();
    L3:
        if (r0 == null) goto L7;
        if (r0.isRemoved() == false) goto L7;
        r0 = (N) get_prev$volatile$FU().get(r0);
    L7:
        return r0;
    }

    private final N getAliveSegmentRight() {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L9:
        N r0 = (N) getNext();
        Intrinsics.checkNotNull(r0);
    L11:
        if (r0.isRemoved() == false) goto L16;
        ConcurrentLinkedListNode r1 = r0.getNext();
        if (r1 == null) goto L14;
        r0 = (N) r1;
        goto L11
    L14:
        return r0;
    L16:
        return r0;
    L5:
        if (isTail() == false) goto L9;
        throw new AssertionError();
    }
}
