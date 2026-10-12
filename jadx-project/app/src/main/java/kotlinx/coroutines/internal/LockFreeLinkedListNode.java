package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000fJ%\u0010\u0017\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0086\bJ \u0010\u001a\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0001J\u0012\u0010\u001b\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000fJ\u001b\u0010\u001c\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0082\u0010J\u0019\u0010\u001f\u001a\u00060\u0000j\u0002`\u000f2\n\u0010 \u001a\u00060\u0000j\u0002`\u000fH\u0082\u0010J\u0014\u0010!\u001a\u00020\u00152\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J%\u0010\"\u001a\u00020#2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0081\bJ\u0010\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fH\u0014J\b\u0010%\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fH\u0001J\b\u0010'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020)H\u0016J(\u0010*\u001a\u00020+2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000f2\u0006\u0010,\u001a\u00020#H\u0001J%\u0010-\u001a\u00020\u00152\n\u0010.\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0000¢\u0006\u0002\b/R\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004R\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004X\u0082\u0004R\u0011\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000e\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0012\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "isRemoved", "", "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prevNode", "getPrevNode", "addLast", "", "node", "addLastIf", "condition", "Lkotlin/Function0;", "addNext", "addOneIfEmpty", "correctPrev", "op", "Lkotlinx/coroutines/internal/OpDescriptor;", "findPrevNonRemoved", "current", "finishAdd", "makeCondAddOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "remove", "removeOrNext", "removed", "toString", "", "tryCondAddNext", "", "condAdd", "validateNode", "prev", "validateNode$kotlinx_coroutines_core", "CondAddOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LockFreeLinkedListNode {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _prev$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _removedRef$volatile$FU = null;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {
        public final LockFreeLinkedListNode newNode;
        public LockFreeLinkedListNode oldNext;

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ void complete(LockFreeLinkedListNode r2, Object failure) {
            complete2(r2, failure);
        }

        public CondAddOp(LockFreeLinkedListNode newNode) {
            this.newNode = newNode;
        }

        /* JADX INFO: renamed from: complete, reason: avoid collision after fix types in other method */
        public void complete2(LockFreeLinkedListNode affected, Object failure) {
            if (failure != null) goto L4;
            boolean success = true;
        L5:
            if (success == false) goto L7;
            LockFreeLinkedListNode update = this.newNode;
        L8:
            if (update != null) goto L10;
            return;
        L10:
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(LockFreeLinkedListNode.access$get_next$volatile$FU(), affected, this, update) == false) goto L15;
            if (success == false) goto L16;
            LockFreeLinkedListNode r2 = this.newNode;
            LockFreeLinkedListNode r3 = this.oldNext;
            Intrinsics.checkNotNull(r3);
            LockFreeLinkedListNode.access$finishAdd(r2, r3);
            return;
        L16:
            return;
        L15:
            return;
        L7:
            update = this.oldNext;
            goto L8
        L4:
            success = false;
            goto L5
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1, reason: invalid class name */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass1 extends CondAddOp {
        final /* synthetic */ Function0<Boolean> $condition;

        public AnonymousClass1(LockFreeLinkedListNode $node, Function0<Boolean> r2) {
            this.$condition = r2;
            super($node);
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ Object prepare(LockFreeLinkedListNode r2) {
            return prepare2(r2);
        }

        /* JADX INFO: renamed from: prepare, reason: avoid collision after fix types in other method */
        public Object prepare2(LockFreeLinkedListNode affected) {
            if (this.$condition.invoke().booleanValue() == false) goto L6;
            return null;
        L6:
            return LockFreeLinkedListKt.getCONDITION_FALSE();
        }
    }

    static {
        _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");
        _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");
        _removedRef$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
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

    private final /* synthetic */ Object get_removedRef$volatile() {
        return this._removedRef$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_removedRef$volatile$FU() {
        return _removedRef$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicReferenceFieldUpdater r3, Function1<Object, Unit> r4) {
    L2:
        r4.invoke(r3.get(r2));
        goto L2
    }

    private final /* synthetic */ void set_next$volatile(Object r1) {
        this._next$volatile = r1;
    }

    private final /* synthetic */ void set_prev$volatile(Object r1) {
        this._prev$volatile = r1;
    }

    private final /* synthetic */ void set_removedRef$volatile(Object r1) {
        this._removedRef$volatile = r1;
    }

    public LockFreeLinkedListNode() {
        this._next$volatile = this;
        this._prev$volatile = this;
    }

    public static final /* synthetic */ void access$finishAdd(LockFreeLinkedListNode $this, LockFreeLinkedListNode next) {
        $this.finishAdd(next);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater access$get_next$volatile$FU() {
        return get_next$volatile$FU();
    }

    private final Removed removed() {
        Removed r0 = (Removed) get_removedRef$volatile$FU().get(this);
        if (r0 != null) goto L6;
        Removed it = new Removed(this);
        get_removedRef$volatile$FU().set(this, it);
        return it;
    L6:
        return r0;
    }

    public final CondAddOp makeCondAddOp(LockFreeLinkedListNode node, Function0<Boolean> r4) {
        return new AnonymousClass1(node, r4);
    }

    public boolean isRemoved() {
        return getNext() instanceof Removed;
    }

    public final Object getNext() {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_next$volatile$FU();
    L3:
        Object next = handler$atomicfu$iv.get(this);
        if ((next instanceof OpDescriptor) == false) goto L5;
        ((OpDescriptor) next).perform(this);
        goto L3
    L5:
        return next;
    }

    public final LockFreeLinkedListNode getNextNode() {
        Object it = getNext();
        if ((it instanceof Removed) == false) goto L5;
        Removed r2 = (Removed) it;
    L6:
        if (r2 == null) goto L9;
        LockFreeLinkedListNode r3 = r2.ref;
        if (r3 == null) goto L9;
        return r3;
    L9:
        Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (LockFreeLinkedListNode) it;
    L5:
        r2 = null;
        goto L6
    }

    public final LockFreeLinkedListNode getPrevNode() {
        LockFreeLinkedListNode r0 = correctPrev(null);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return findPrevNonRemoved((LockFreeLinkedListNode) get_prev$volatile$FU().get(this));
    }

    private final LockFreeLinkedListNode findPrevNonRemoved(LockFreeLinkedListNode current) {
    L3:
        if (current.isRemoved() == false) goto L4;
        current = (LockFreeLinkedListNode) get_prev$volatile$FU().get(current);
        goto L3
    L4:
        return current;
    }

    public final boolean addOneIfEmpty(LockFreeLinkedListNode node) {
        get_prev$volatile$FU().set(node, this);
        get_next$volatile$FU().set(node, this);
    L3:
        Object next = getNext();
        if (next != this) goto L5;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_next$volatile$FU(), this, this, node) == false) goto L3;
        node.finishAdd(this);
        return true;
    L5:
        return false;
    }

    public final void addLast(LockFreeLinkedListNode node) {
    L3:
        if (getPrevNode().addNext(node, this) == false) goto L3;
    }

    public final boolean addLastIf(LockFreeLinkedListNode node, Function0<Boolean> r6) {
        CondAddOp condAdd = new AnonymousClass1(node, r6);
    L3:
        LockFreeLinkedListNode prev = getPrevNode();
        switch(prev.tryCondAddNext(node, this, condAdd)) {
            case 1: goto L8;
            case 2: goto L6;
            default: goto L3;
        };
    L6:
        return false;
    L8:
        return true;
    }

    public final boolean addNext(LockFreeLinkedListNode node, LockFreeLinkedListNode next) {
        get_prev$volatile$FU().set(node, this);
        get_next$volatile$FU().set(node, next);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_next$volatile$FU(), this, next, node) == true) goto L6;
        return false;
    L6:
        node.finishAdd(next);
        return true;
    }

    public final int tryCondAddNext(LockFreeLinkedListNode node, LockFreeLinkedListNode next, CondAddOp condAdd) {
        get_prev$volatile$FU().set(node, this);
        get_next$volatile$FU().set(node, next);
        condAdd.oldNext = next;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_next$volatile$FU(), this, next, condAdd) == true) goto L7;
        return 0;
    L7:
        if (condAdd.perform(this) != null) goto L9;
        return 1;
    L9:
        return 2;
    }

    /* JADX INFO: renamed from: remove */
    public boolean mo8969remove() {
        if (removeOrNext() != null) goto L5;
        return true;
    L5:
        return false;
    }

    public final LockFreeLinkedListNode removeOrNext() {
    L2:
        Object next = getNext();
        if ((next instanceof Removed) == true) goto L5;
        if (next == this) goto L8;
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        Removed removed = ((LockFreeLinkedListNode) next).removed();
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_next$volatile$FU(), this, next, removed) == false) goto L2;
        ((LockFreeLinkedListNode) next).correctPrev(null);
        return null;
    L8:
        return (LockFreeLinkedListNode) next;
    L5:
        return ((Removed) next).ref;
    }

    private final void finishAdd(LockFreeLinkedListNode next) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_prev$volatile$FU();
    L3:
        LockFreeLinkedListNode nextPrev = (LockFreeLinkedListNode) handler$atomicfu$iv.get(next);
        if (getNext() != next) goto L5;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_prev$volatile$FU(), next, nextPrev, this) == false) goto L3;
        if (isRemoved() == false) goto L16;
        next.correctPrev(null);
        return;
    L16:
        return;
    }

    protected LockFreeLinkedListNode nextIfRemoved() {
        Object r0 = getNext();
        if ((r0 instanceof Removed) == false) goto L5;
        Removed r1 = (Removed) r0;
    L6:
        if (r1 != null) goto L8;
        return null;
    L8:
        return r1.ref;
    L5:
        r1 = null;
        goto L6
    }

    private final LockFreeLinkedListNode correctPrev(OpDescriptor op) {
    L2:
        LockFreeLinkedListNode oldPrev = (LockFreeLinkedListNode) get_prev$volatile$FU().get(this);
        LockFreeLinkedListNode prev = oldPrev;
        LockFreeLinkedListNode last = null;
    L3:
        Object prevNext = get_next$volatile$FU().get(prev);
        if (prevNext == this) goto L5;
        if (isRemoved() == true) goto L13;
        if (prevNext == op) goto L16;
        if ((prevNext instanceof OpDescriptor) == true) goto L19;
        if ((prevNext instanceof Removed) == true) goto L22;
        last = prev;
        Intrinsics.checkNotNull(prevNext, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        prev = (LockFreeLinkedListNode) prevNext;
        goto L3
    L22:
        if (last != null) goto L24;
        prev = (LockFreeLinkedListNode) get_prev$volatile$FU().get(prev);
        goto L3
    L24:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_next$volatile$FU(), last, prev, ((Removed) prevNext).ref) == false) goto L2;
        prev = last;
        last = null;
        goto L3
    L19:
        ((OpDescriptor) prevNext).perform(prev);
        goto L2
    L16:
        return prev;
    L13:
        return null;
    L5:
        if (oldPrev == prev) goto L6;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_prev$volatile$FU(), this, oldPrev, prev) == false) goto L2;
        return prev;
    L6:
        return prev;
    }

    public final void validateNode$kotlinx_coroutines_core(LockFreeLinkedListNode prev, LockFreeLinkedListNode next) {
        boolean r1 = true;
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L13;
        if (prev != get_prev$volatile$FU().get(this)) goto L7;
        int r0 = 1;
    L8:
        if (r0 != 0) goto L13;
        throw new AssertionError();
    L7:
        r0 = 0;
    L13:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L15;
        return;
    L15:
        if (next == get_next$volatile$FU().get(this)) goto L18;
        r1 = false;
    L18:
        if (r1 == false) goto L21;
        return;
    L21:
        throw new AssertionError();
    }

    public String toString() {
        return new C07761(this) + '@' + DebugStringsKt.getHexAddress(this);
    }
}
