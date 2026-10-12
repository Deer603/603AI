package kotlinx.coroutines.internal;

import androidx.autofill.HintConstants;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.concurrent.internal.AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a8\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\tH\u0082\b\u001a!\u0010\r\u001a\u0002H\u000e\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f*\u0002H\u000eH\u0000¢\u0006\u0002\u0010\u0010\u001as\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u0002H\u001328\b\b\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0080\b\u001ag\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\u0002H\u00132\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0000¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u001f\u001a\u0002H\u0013H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "POINTERS_SHIFT", "", "addConditionally", "", "Lkotlinx/atomicfu/AtomicInt;", "delta", "condition", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cur", "close", "N", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "findSegmentAndMoveForward", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "S", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicRef;", "id", "", "startFrom", "createNewSegment", "Lkotlin/Function2;", "prev", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "moveForward", "to", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = null;
    private static final int POINTERS_SHIFT = 16;

    public static final /* synthetic */ Symbol access$getCLOSED$p() {
        return CLOSED;
    }

    private static final /* synthetic */ void loop$atomicfu(Object r1, AtomicReferenceFieldUpdater r2, Function1<Object, Unit> r3) {
    L2:
        r3.invoke(r2.get(r1));
        goto L2
    }

    private static final /* synthetic */ void loop$atomicfu$array(AtomicReferenceArray r1, int r2, Function1<Object, Unit> r3) {
    L2:
        r3.invoke(r1.get(r2));
        goto L2
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S r7, long id, Function2<? super Long, ? super S, ? extends S> r10) {
        Segment cur = r7;
    L4:
        if (cur.id >= id) goto L6;
    L10:
        ConcurrentLinkedListNode this_$iv = cur;
        Object it$iv = ConcurrentLinkedListNode.access$getNextOrClosed(this_$iv);
        if (it$iv == access$getCLOSED$p()) goto L13;
        Segment next = (Segment) ((ConcurrentLinkedListNode) it$iv);
        if (next != null) goto L16;
        Segment newTail = r10.invoke(Long.valueOf(cur.id + 1), cur);
        if (cur.trySetNext(newTail) == false) goto L4;
        if (cur.isRemoved() == false) goto L22;
        cur.remove();
    L22:
        cur = newTail;
        goto L4
    L16:
        cur = next;
        goto L4
    L13:
        return SegmentOrClosed.m8973constructorimpl(CLOSED);
    L6:
        if (cur.isRemoved() == true) goto L10;
        return SegmentOrClosed.m8973constructorimpl(cur);
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu(Object dispatchReceiver$atomicfu, AtomicReferenceFieldUpdater handler$atomicfu, S r8) {
    L2:
        Segment cur = (Segment) handler$atomicfu.get(dispatchReceiver$atomicfu);
        if (cur.id >= r8.id) goto L4;
        if (r8.tryIncPointers$kotlinx_coroutines_core() == false) goto L7;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu, dispatchReceiver$atomicfu, cur, r8) == true) goto L12;
        if (r8.decPointers$kotlinx_coroutines_core() == false) goto L2;
        r8.remove();
        goto L2
    L12:
        if (cur.decPointers$kotlinx_coroutines_core() == false) goto L14;
        cur.remove();
    L14:
        return true;
    L7:
        return false;
    L4:
        return true;
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$array(AtomicReferenceArray handler$atomicfu, int index$atomicfu, S r8) {
    L2:
        Segment cur = (Segment) handler$atomicfu.get(index$atomicfu);
        if (cur.id >= r8.id) goto L4;
        if (r8.tryIncPointers$kotlinx_coroutines_core() == false) goto L7;
        if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu, index$atomicfu, cur, r8) == true) goto L12;
        if (r8.decPointers$kotlinx_coroutines_core() == false) goto L2;
        r8.remove();
        goto L2
    L12:
        if (cur.decPointers$kotlinx_coroutines_core() == false) goto L14;
        cur.remove();
    L14:
        return true;
    L7:
        return false;
    L4:
        return true;
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu(Object dispatchReceiver$atomicfu, AtomicReferenceFieldUpdater handler$atomicfu, long id, S r12, Function2<? super Long, ? super S, ? extends S> r13) {
    L2:
        Object s = findSegmentInternal(r12, id, r13);
        if (SegmentOrClosed.m8978isClosedimpl(s) == true) goto L23;
        Segment to$iv = SegmentOrClosed.m8976getSegmentimpl(s);
    L5:
        Segment cur$iv = (Segment) handler$atomicfu.get(dispatchReceiver$atomicfu);
        boolean r5 = true;
        if (cur$iv.id >= to$iv.id) goto L17;
        if (to$iv.tryIncPointers$kotlinx_coroutines_core() == false) goto L10;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu, dispatchReceiver$atomicfu, cur$iv, to$iv) == true) goto L14;
        if (to$iv.decPointers$kotlinx_coroutines_core() == false) goto L5;
        to$iv.remove();
        goto L5
    L14:
        if (cur$iv.decPointers$kotlinx_coroutines_core() == false) goto L17;
        cur$iv.remove();
        goto L17
    L10:
        r5 = false;
    L17:
        if (r5 == false) goto L2;
    L23:
        return s;
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$array(AtomicReferenceArray handler$atomicfu, int index$atomicfu, long id, S r12, Function2<? super Long, ? super S, ? extends S> r13) {
    L2:
        Object s = findSegmentInternal(r12, id, r13);
        if (SegmentOrClosed.m8978isClosedimpl(s) == true) goto L23;
        Segment to$iv = SegmentOrClosed.m8976getSegmentimpl(s);
    L5:
        Segment cur$iv = (Segment) handler$atomicfu.get(index$atomicfu);
        boolean r5 = true;
        if (cur$iv.id >= to$iv.id) goto L17;
        if (to$iv.tryIncPointers$kotlinx_coroutines_core() == false) goto L10;
        if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu, index$atomicfu, cur$iv, to$iv) == true) goto L14;
        if (to$iv.decPointers$kotlinx_coroutines_core() == false) goto L5;
        to$iv.remove();
        goto L5
    L14:
        if (cur$iv.decPointers$kotlinx_coroutines_core() == false) goto L17;
        cur$iv.remove();
        goto L17
    L10:
        r5 = false;
    L17:
        if (r5 == false) goto L2;
    L23:
        return s;
    }

    public static final <N extends ConcurrentLinkedListNode<N>> N close(N r6) {
        N r0 = r6;
    L3:
        Object r3 = ConcurrentLinkedListNode.access$getNextOrClosed(r0);
        if (r3 == access$getCLOSED$p()) goto L6;
        ConcurrentLinkedListNode r5 = (ConcurrentLinkedListNode) r3;
        if (r5 == null) goto L10;
        r0 = (N) r5;
        goto L3
    L10:
        if (r0.markAsClosed() == false) goto L3;
        return r0;
    L6:
        return r0;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu(Object dispatchReceiver$atomicfu, AtomicIntegerFieldUpdater handler$atomicfu, int delta, Function1<? super Integer, Boolean> r5) {
    L2:
        int cur = handler$atomicfu.get(dispatchReceiver$atomicfu);
        if (r5.invoke(Integer.valueOf(cur)).booleanValue() == false) goto L4;
        if (handler$atomicfu.compareAndSet(dispatchReceiver$atomicfu, cur, cur + delta) == false) goto L2;
        return true;
    L4:
        return false;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$array(AtomicIntegerArray handler$atomicfu, int index$atomicfu, int delta, Function1<? super Integer, Boolean> r5) {
    L2:
        int cur = handler$atomicfu.get(index$atomicfu);
        if (r5.invoke(Integer.valueOf(cur)).booleanValue() == false) goto L4;
        if (handler$atomicfu.compareAndSet(index$atomicfu, cur, cur + delta) == false) goto L2;
        return true;
    L4:
        return false;
    }

    static {
        CLOSED = new Symbol("CLOSED");
    }
}
