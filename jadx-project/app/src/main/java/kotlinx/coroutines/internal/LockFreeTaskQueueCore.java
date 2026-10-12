package kotlinx.coroutines.internal;

import androidx.autofill.HintConstants;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ,*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J1\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0006J&\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\u0004\b\u0001\u0010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H#0%J\b\u0010&\u001a\u00020\u001aH\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010(\u001a\u0004\u0018\u00010\u0002J,\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002R#\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n0\tX\u0082\u0004R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "E", "", "capacity", "", "singleConsumer", "", "(IZ)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Lkotlinx/atomicfu/AtomicArray;", "isEmpty", "()Z", "mask", "size", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)I", "allocateNextCopy", "state", "", "allocateOrGetNextCopy", "close", "fillPlaceholder", "index", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "markFrozen", "next", "removeFirstOrNull", "removeSlowPath", "oldHead", "newHead", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final Companion Companion = null;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final Symbol REMOVE_FROZEN = null;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    private final /* synthetic */ AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final long wo(long $this$wo, long other) {
            return (~other) & $this$wo;
        }

        public final long updateHead(long $this$updateHead, int newHead) {
            return wo($this$updateHead, LockFreeTaskQueueCore.HEAD_MASK) | (((long) newHead) << 0);
        }

        public final long updateTail(long $this$updateTail, int newTail) {
            return wo($this$updateTail, LockFreeTaskQueueCore.TAIL_MASK) | (((long) newTail) << 30);
        }

        public final <T> T withState(long $this$withState, Function2<? super Integer, ? super Integer, ? extends T> r8) {
            int head = (int) ((LockFreeTaskQueueCore.HEAD_MASK & $this$withState) >> 0);
            int tail = (int) ((LockFreeTaskQueueCore.TAIL_MASK & $this$withState) >> 30);
            return r8.invoke(Integer.valueOf(head), Integer.valueOf(tail));
        }

        public final int addFailReason(long $this$addFailReason) {
            if ((LockFreeTaskQueueCore.CLOSED_MASK & $this$addFailReason) == 0) goto L5;
            return 2;
        L5:
            return 1;
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "index", "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Placeholder {
        public final int index;

        public Placeholder(int index) {
            this.index = index;
        }
    }

    private final /* synthetic */ AtomicReferenceArray getArray() {
        return this.array;
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_next$volatile$FU() {
        return _next$volatile$FU;
    }

    private final /* synthetic */ long get_state$volatile() {
        return this._state$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater get_state$volatile$FU() {
        return _state$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu(Object r3, AtomicLongFieldUpdater r4, Function1<? super Long, Unit> r5) {
    L2:
        r5.invoke(Long.valueOf(r4.get(r3)));
        goto L2
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicReferenceFieldUpdater r3, Function1<Object, Unit> r4) {
    L2:
        r4.invoke(r3.get(r2));
        goto L2
    }

    private final /* synthetic */ void set_next$volatile(Object r1) {
        this._next$volatile = r1;
    }

    private final /* synthetic */ void set_state$volatile(long r1) {
        this._state$volatile = r1;
    }

    private final /* synthetic */ void update$atomicfu(Object r7, AtomicLongFieldUpdater r8, Function1<? super Long, Long> r9) {
    L2:
        long r2 = r8.get(r7);
        long r4 = r9.invoke(Long.valueOf(r2)).longValue();
        Object r1 = r7;
        AtomicLongFieldUpdater r0 = r8;
        if (r0.compareAndSet(r1, r2, r4) == true) goto L4;
        r8 = r0;
        r7 = r1;
        goto L2
    }

    private final /* synthetic */ long updateAndGet$atomicfu(Object r8, AtomicLongFieldUpdater r9, Function1<? super Long, Long> r10) {
    L2:
        long r2 = r9.get(r8);
        Long r6 = r10.invoke(Long.valueOf(r2));
        Object r1 = r8;
        AtomicLongFieldUpdater r0 = r9;
        if (r0.compareAndSet(r1, r2, r6.longValue()) == true) goto L5;
        r9 = r0;
        r8 = r1;
        goto L2
    L5:
        return r6.longValue();
    }

    public LockFreeTaskQueueCore(int capacity, boolean singleConsumer) {
        this.capacity = capacity;
        this.singleConsumer = singleConsumer;
        boolean r1 = true;
        this.mask = this.capacity - 1;
        this.array = new AtomicReferenceArray(this.capacity);
        if (this.mask > 1073741823) goto L5;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L17;
        if ((this.capacity & this.mask) == 0) goto L12;
        r1 = false;
    L12:
        if (r1 == false) goto L15;
        return;
    L15:
        throw new IllegalStateException("Check failed.".toString());
    L17:
        throw new IllegalStateException("Check failed.".toString());
    L5:
        r0 = false;
        goto L7
    }

    public final boolean isEmpty() {
        Companion r0 = Companion;
        long $this$withState$iv = get_state$volatile$FU().get(this);
        int head$iv = (int) ((HEAD_MASK & $this$withState$iv) >> 0);
        int tail$iv = (int) ((TAIL_MASK & $this$withState$iv) >> 30);
        if (head$iv != tail$iv) goto L7;
        return true;
    L7:
        return false;
    }

    public final int getSize() {
        Companion r0 = Companion;
        long $this$withState$iv = get_state$volatile$FU().get(this);
        int head$iv = (int) ((HEAD_MASK & $this$withState$iv) >> 0);
        int tail$iv = (int) ((TAIL_MASK & $this$withState$iv) >> 30);
        int head = (tail$iv - head$iv) & MAX_CAPACITY_MASK;
        return head;
    }

    public final boolean close() {
        AtomicLongFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        long state = handler$atomicfu$iv.get(this);
        if ((state & CLOSED_MASK) != 0) goto L5;
        if ((FROZEN_MASK & state) != 0) goto L8;
        if (handler$atomicfu$iv.compareAndSet(this, state, state | CLOSED_MASK) == false) goto L3;
        return true;
    L8:
        return false;
    L5:
        return true;
    }

    public final int addLast(E r28) {
        LockFreeTaskQueueCore<E> r1 = this;
        AtomicLongFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
        LockFreeTaskQueueCore<E> r7 = this;
    L3:
        long state = handler$atomicfu$iv.get(r1);
        if ((3458764513820540928L & state) != 0) goto L6;
        Companion r12 = Companion;
        int head$iv = (int) ((HEAD_MASK & state) >> 0);
        int tail$iv = (int) ((TAIL_MASK & state) >> 30);
        int mask = r1.mask;
        if (((tail$iv + 2) & mask) == (head$iv & mask)) goto L9;
        if (r1.singleConsumer == true) goto L21;
        AtomicReferenceArray r0 = r1.getArray();
        int r23 = MAX_CAPACITY_MASK;
        if (r0.get(tail$iv & mask) != null) goto L15;
    L22:
        int newTail = (tail$iv + 1) & r23;
        LockFreeTaskQueueCore<E> r26 = r7;
        if (get_state$volatile$FU().compareAndSet(r1, state, Companion.updateTail(state, newTail)) == true) goto L24;
        r1 = this;
        r7 = r26;
        goto L3
    L24:
        getArray().set(tail$iv & mask, r28);
        LockFreeTaskQueueCore<E> r2 = this;
    L26:
        if ((get_state$volatile$FU().get(r2) & FROZEN_MASK) == 0) goto L31;
        LockFreeTaskQueueCore<E> r3 = r2.next().fillPlaceholder(tail$iv, r28);
        if (r3 == null) goto L31;
        r2 = r3;
    L31:
        return 0;
    L15:
        if (r1.capacity < 1024) goto L20;
        if (((tail$iv - head$iv) & MAX_CAPACITY_MASK) <= (r1.capacity >> 1)) goto L3;
    L20:
        return 1;
    L21:
        r23 = MAX_CAPACITY_MASK;
        goto L22
    L9:
        return 1;
    L6:
        return Companion.addFailReason(state);
    }

    private final LockFreeTaskQueueCore<E> fillPlaceholder(int index, E r5) {
        Object old = getArray().get(this.mask & index);
        if ((old instanceof Placeholder) == true) goto L5;
        return null;
    L5:
        if (((Placeholder) old).index != index) goto L10;
        getArray().set(this.mask & index, r5);
        return this;
    L10:
        return null;
    }

    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
        LockFreeTaskQueueCore<E> r7 = this;
    L3:
        long state = handler$atomicfu$iv.get(this);
        if ((FROZEN_MASK & state) != 0) goto L6;
        Companion r9 = Companion;
        int head$iv = (int) ((HEAD_MASK & state) >> 0);
        int tail$iv = (int) ((TAIL_MASK & state) >> 30);
        handler$atomicfu$iv = handler$atomicfu$iv;
        if ((this.mask & tail$iv) == (this.mask & head$iv)) goto L9;
        Object element = getArray().get(this.mask & head$iv);
        if (element == null) goto L13;
        if ((element instanceof Placeholder) == true) goto L18;
        int newHead = (head$iv + 1) & MAX_CAPACITY_MASK;
        LockFreeTaskQueueCore<E> r21 = r7;
        if (get_state$volatile$FU().compareAndSet(this, state, Companion.updateHead(state, newHead)) == true) goto L21;
        if (this.singleConsumer == true) goto L25;
        r7 = r21;
        goto L3
    L25:
        LockFreeTaskQueueCore<E> r0 = this;
    L26:
        LockFreeTaskQueueCore<E> r4 = r0.removeSlowPath(head$iv, newHead);
        if (r4 == null) goto L28;
        r0 = r4;
        goto L26
    L28:
        return element;
    L21:
        getArray().set(this.mask & head$iv, null);
        return element;
    L18:
        return null;
    L13:
        if (this.singleConsumer == false) goto L3;
        return null;
    L9:
        return null;
    L6:
        return REMOVE_FROZEN;
    }

    private final LockFreeTaskQueueCore<E> removeSlowPath(int oldHead, int newHead) {
        AtomicLongFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        long state = handler$atomicfu$iv.get(this);
        Companion r9 = Companion;
        boolean r0 = false;
        int head$iv = (int) ((HEAD_MASK & state) >> 0);
        int r14 = (int) ((TAIL_MASK & state) >> 30);
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L14;
        if (head$iv != oldHead) goto L8;
        r0 = true;
    L8:
        if (r0 == true) goto L14;
        throw new AssertionError();
    L14:
        if ((state & FROZEN_MASK) != 0) goto L16;
        AtomicLongFieldUpdater handler$atomicfu$iv2 = handler$atomicfu$iv;
        if (get_state$volatile$FU().compareAndSet(this, state, Companion.updateHead(state, newHead)) == true) goto L19;
        handler$atomicfu$iv = handler$atomicfu$iv2;
        goto L3
    L19:
        getArray().set(this.mask & head$iv, null);
        return null;
    L16:
        return next();
    }

    public final LockFreeTaskQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    private final long markFrozen() {
        AtomicLongFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        long state = handler$atomicfu$iv.get(this);
        if ((state & FROZEN_MASK) != 0) goto L5;
        long state2 = state | FROZEN_MASK;
        if (handler$atomicfu$iv.compareAndSet(this, state, state2) == false) goto L3;
        return state2;
    L5:
        return state;
    }

    private final LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long state) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_next$volatile$FU();
    L3:
        LockFreeTaskQueueCore<E> r2 = (LockFreeTaskQueueCore) handler$atomicfu$iv.get(this);
        if (r2 != null) goto L5;
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_next$volatile$FU(), this, null, allocateNextCopy(state));
        goto L3
    L5:
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LockFreeTaskQueueCore<E> allocateNextCopy(long state) {
        LockFreeTaskQueueCore<E> r1 = new LockFreeTaskQueueCore(this.capacity * 2, this.singleConsumer);
        Companion r2 = Companion;
        int head$iv = (int) ((HEAD_MASK & state) >> 0);
        int tail$iv = (int) ((TAIL_MASK & state) >> 30);
        int index = head$iv;
    L4:
        if ((this.mask & index) == (this.mask & tail$iv)) goto L9;
        Object value = getArray().get(this.mask & index);
        if (value != null) goto L8;
        value = new Placeholder(index);
    L8:
        r1.getArray().set(r1.mask & index, value);
        index = index + 1;
        goto L4
    L9:
        get_state$volatile$FU().set(r1, Companion.wo(state, FROZEN_MASK));
        return r1;
    }

    public final <R> List<R> map(Function1<? super E, ? extends R> r14) {
        ArrayList res = new ArrayList(this.capacity);
        Companion r1 = Companion;
        long $this$withState$iv = get_state$volatile$FU().get(this);
        int head$iv = (int) ((HEAD_MASK & $this$withState$iv) >> 0);
        int tail$iv = (int) ((TAIL_MASK & $this$withState$iv) >> 30);
        int index = head$iv;
    L4:
        if ((this.mask & index) == (this.mask & tail$iv)) goto L12;
        Object element = getArray().get(this.mask & index);
        if (element == null) goto L10;
        if ((element instanceof Placeholder) == true) goto L10;
        res.add(r14.invoke(element));
    L10:
        index = index + 1;
        goto L4
    L12:
        return res;
    }

    public final boolean isClosed() {
        if ((get_state$volatile$FU().get(this) & CLOSED_MASK) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    static {
        Companion = new Companion(null);
        _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");
        _state$volatile$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");
        REMOVE_FROZEN = new Symbol("REMOVE_FROZEN");
    }
}
