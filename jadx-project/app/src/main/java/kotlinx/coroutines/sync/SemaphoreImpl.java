package kotlinx.coroutines.sync;

import androidx.autofill.HintConstants;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.concurrent.internal.AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0017Jb\u0010\u0016\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0019\u001a\u0002H\u00182!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001d0\u00122!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0012H\u0083\b¢\u0006\u0002\u0010\u001fJ\u0016\u0010\u0016\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0005J\u000e\u0010!\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J\u001e\u0010&\u001a\u00020\u00142\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0004J\b\u0010+\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u001dH\u0002J\f\u0010.\u001a\u00020\u001d*\u00020*H\u0002R\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\t\u0010\r\u001a\u00020\fX\u0082\u0004R\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¨\u0006/"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Semaphore;", "permits", "", "acquiredPermits", "(II)V", "_availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "availablePermits", "getAvailablePermits", "()I", "deqIdx", "Lkotlinx/atomicfu/AtomicLong;", "enqIdx", "head", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "onCancellationRelease", "Lkotlin/Function1;", "", "", "tail", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "W", "waiter", "suspend", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "", "onAcquired", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/CancellableContinuation;", "acquireSlowPath", "addAcquireToQueue", "Lkotlinx/coroutines/Waiter;", "coerceAvailablePermitsAtMaximum", "decPermits", "onAcquireRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "", "release", "tryAcquire", "tryResumeNextFromQueue", "tryResumeAcquire", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SemaphoreImpl implements Semaphore {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater deqIdx$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater enqIdx$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater head$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater tail$volatile$FU = null;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private final Function1<Throwable, Unit> onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head$volatile");
        deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx$volatile");
        tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail$volatile");
        enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx$volatile");
        _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits$volatile");
    }

    private final /* synthetic */ long getDeqIdx$volatile() {
        return this.deqIdx$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater getDeqIdx$volatile$FU() {
        return deqIdx$volatile$FU;
    }

    private final /* synthetic */ long getEnqIdx$volatile() {
        return this.enqIdx$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater getEnqIdx$volatile$FU() {
        return enqIdx$volatile$FU;
    }

    private final /* synthetic */ Object getHead$volatile() {
        return this.head$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getHead$volatile$FU() {
        return head$volatile$FU;
    }

    private final /* synthetic */ Object getTail$volatile() {
        return this.tail$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getTail$volatile$FU() {
        return tail$volatile$FU;
    }

    private final /* synthetic */ int get_availablePermits$volatile() {
        return this._availablePermits$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater get_availablePermits$volatile$FU() {
        return _availablePermits$volatile$FU;
    }

    private final /* synthetic */ void setDeqIdx$volatile(long r1) {
        this.deqIdx$volatile = r1;
    }

    private final /* synthetic */ void setEnqIdx$volatile(long r1) {
        this.enqIdx$volatile = r1;
    }

    private final /* synthetic */ void setHead$volatile(Object r1) {
        this.head$volatile = r1;
    }

    private final /* synthetic */ void setTail$volatile(Object r1) {
        this.tail$volatile = r1;
    }

    private final /* synthetic */ void set_availablePermits$volatile(int r1) {
        this._availablePermits$volatile = r1;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public Object acquire(Continuation<? super Unit> r2) {
        return acquire$suspendImpl(this, r2);
    }

    public SemaphoreImpl(int permits, int acquiredPermits) {
        this.permits = permits;
        boolean r1 = true;
        if (this.permits <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L18;
        if (acquiredPermits >= 0) goto L9;
    L11:
        r1 = false;
    L12:
        if (r1 == false) goto L16;
        SemaphoreSegment s = new SemaphoreSegment(0, null, 2);
        this.head$volatile = s;
        this.tail$volatile = s;
        this._availablePermits$volatile = this.permits - acquiredPermits;
        this.onCancellationRelease = new SemaphoreImpl$onCancellationRelease$1(this);
        return;
    L16:
        throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + this.permits).toString());
    L9:
        if (acquiredPermits > this.permits) goto L11;
    L18:
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + this.permits).toString());
    L5:
        r0 = false;
        goto L6
    }

    public static final /* synthetic */ Object access$acquireSlowPath(SemaphoreImpl $this, Continuation $completion) {
        return $this.acquireSlowPath($completion);
    }

    public static final /* synthetic */ boolean access$addAcquireToQueue(SemaphoreImpl $this, Waiter waiter) {
        return $this.addAcquireToQueue(waiter);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return Math.max(get_availablePermits$volatile$FU().get(this), 0);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
    L2:
        int p = get_availablePermits$volatile$FU().get(this);
        if (p > this.permits) goto L4;
        if (p <= 0) goto L6;
        if (get_availablePermits$volatile$FU().compareAndSet(this, p, p - 1) == false) goto L2;
        return true;
    L6:
        return false;
    L4:
        coerceAvailablePermitsAtMaximum();
        goto L2
    }

    static /* synthetic */ Object acquire$suspendImpl(SemaphoreImpl $this, Continuation<? super Unit> r4) {
        int p = $this.decPermits();
        if (p > 0) goto L5;
        Object r1 = $this.acquireSlowPath(r4);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r1;
    L10:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }

    private final Object acquireSlowPath(Continuation<? super Unit> r8) {
        CancellableContinuationImpl cancellable$iv = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(r8));
    L14:
        e$iv = move-exception;
        cancellable$iv.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        throw e$iv;
    L4:
        if (access$addAcquireToQueue(this, cancellable$iv) == true) goto L6;
        acquire(cancellable$iv);     // Catch: Throwable -> L14
    L6:
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(r8);
    L10:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        return r1;
    L13:
        return Unit.INSTANCE;
    }

    protected final void acquire(CancellableContinuation<? super Unit> r8) {
    L3:
        int p$iv = decPermits();
        if (p$iv > 0) goto L5;
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
        if (addAcquireToQueue((Waiter) r8) == false) goto L3;
        return;
    L5:
        r8.resume(Unit.INSTANCE, this.onCancellationRelease);
    }

    private final <W> void acquire(W r4, Function1<? super W, Boolean> r5, Function1<? super W, Unit> r6) {
    L3:
        int p = decPermits();
        if (p > 0) goto L5;
        if (r5.invoke(r4).booleanValue() == false) goto L3;
        return;
    L5:
        r6.invoke(r4);
    }

    protected final void onAcquireRegFunction(SelectInstance<?> r7, Object ignoredParam) {
    L3:
        int p$iv = decPermits();
        if (p$iv > 0) goto L5;
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
        if (addAcquireToQueue((Waiter) r7) == false) goto L3;
        return;
    L5:
        r7.selectInRegistrationPhase(Unit.INSTANCE);
    }

    private final int decPermits() {
    L2:
        int p = get_availablePermits$volatile$FU().getAndDecrement(this);
        if (p > this.permits) goto L2;
        return p;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
    L2:
        int p = get_availablePermits$volatile$FU().getAndIncrement(this);
        if (p >= this.permits) goto L9;
        if (p >= 0) goto L5;
        if (tryResumeNextFromQueue() == false) goto L2;
        return;
    L5:
        return;
    L9:
        coerceAvailablePermitsAtMaximum();
        throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
    }

    private final void coerceAvailablePermitsAtMaximum() {
    L2:
        int cur = get_availablePermits$volatile$FU().get(this);
        if (cur <= this.permits) goto L6;
        if (get_availablePermits$volatile$FU().compareAndSet(this, cur, this.permits) == false) goto L2;
        return;
    }

    private final boolean addAcquireToQueue(Waiter waiter) {
        SemaphoreSegment curTail = (SemaphoreSegment) getTail$volatile$FU().get(this);
        long enqIdx = getEnqIdx$volatile$FU().getAndIncrement(this);
        KFunction createNewSegment = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater handler$atomicfu$iv = getTail$volatile$FU();
        long id$iv = enqIdx / ((long) SemaphoreKt.access$getSEGMENT_SIZE$p());
    L3:
        Object s$iv = ConcurrentLinkedListKt.findSegmentInternal(curTail, id$iv, (Function2) createNewSegment);
        if (SegmentOrClosed.m8978isClosedimpl(s$iv) == true) goto L25;
        Segment to$iv$iv = SegmentOrClosed.m8976getSegmentimpl(s$iv);
    L6:
        Segment cur$iv$iv = (Segment) handler$atomicfu$iv.get(this);
        boolean r15 = false;
        boolean r16 = true;
        SemaphoreSegment curTail2 = curTail;
        long enqIdx2 = enqIdx;
        if (cur$iv$iv.id >= to$iv$iv.id) goto L8;
        if (to$iv$iv.tryIncPointers$kotlinx_coroutines_core() == false) goto L11;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu$iv, this, cur$iv$iv, to$iv$iv) == true) goto L15;
        if (to$iv$iv.decPointers$kotlinx_coroutines_core() == false) goto L24;
        to$iv$iv.remove();
    L24:
        curTail = curTail2;
        enqIdx = enqIdx2;
        goto L6
    L15:
        if (cur$iv$iv.decPointers$kotlinx_coroutines_core() == false) goto L17;
        cur$iv$iv.remove();
    L17:
        boolean r2 = true;
    L18:
        if (r2 == true) goto L26;
        curTail = curTail2;
        enqIdx = enqIdx2;
    L26:
        SemaphoreSegment segment = (SemaphoreSegment) SegmentOrClosed.m8976getSegmentimpl(s$iv);
        int i = (int) (enqIdx2 % ((long) SemaphoreKt.access$getSEGMENT_SIZE$p()));
        if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(segment.getAcquirers(), i, null, waiter) == false) goto L30;
        waiter.invokeOnCancellation(segment, i);
        return r16;
    L30:
        Object expected$iv = SemaphoreKt.access$getPERMIT$p();
        Object value$iv = SemaphoreKt.access$getTAKEN$p();
        if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(segment.getAcquirers(), i, expected$iv, value$iv) == false) goto L42;
        if ((waiter instanceof CancellableContinuation) == false) goto L36;
        Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        CancellableContinuation r4 = (CancellableContinuation) waiter;
        ((CancellableContinuation) waiter).resume(Unit.INSTANCE, this.onCancellationRelease);
    L38:
        return r16;
    L36:
        if ((waiter instanceof SelectInstance) == false) goto L40;
        ((SelectInstance) waiter).selectInRegistrationPhase(Unit.INSTANCE);
        goto L38
    L40:
        throw new IllegalStateException(("unexpected: " + waiter).toString());
    L42:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L44;
    L51:
        return r15;
    L44:
        if (segment.getAcquirers().get(i) != SemaphoreKt.access$getBROKEN$p()) goto L46;
        boolean r12 = r16;
    L47:
        if (r12 == true) goto L51;
        throw new AssertionError();
    L46:
        r12 = r15;
        goto L47
    L11:
        r2 = false;
        goto L18
    L8:
        r2 = true;
        goto L18
    L25:
        enqIdx2 = enqIdx;
        r15 = false;
        r16 = true;
        goto L26
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v2 */
    private final boolean tryResumeNextFromQueue() {
        SemaphoreSegment r1 = (SemaphoreSegment) getHead$volatile$FU().get(this);
        long r2 = getDeqIdx$volatile$FU().getAndIncrement(this);
        long r4 = r2 / ((long) SemaphoreKt.access$getSEGMENT_SIZE$p());
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 r6 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater r7 = getHead$volatile$FU();
    L3:
        Object r8 = ConcurrentLinkedListKt.findSegmentInternal(r1, r4, r6);
        if (SegmentOrClosed.m8978isClosedimpl(r8) == true) goto L24;
        Segment r9 = SegmentOrClosed.m8976getSegmentimpl(r8);
    L6:
        Segment r12 = (Segment) r7.get(this);
        boolean r16 = false;
        boolean r17 = true;
        if (r12.id >= r9.id) goto L8;
        if (r9.tryIncPointers$kotlinx_coroutines_core() == false) goto L11;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r7, this, r12, r9) == true) goto L15;
        if (r9.decPointers$kotlinx_coroutines_core() == false) goto L6;
        r9.remove();
        goto L6
    L15:
        if (r12.decPointers$kotlinx_coroutines_core() == false) goto L17;
        r12.remove();
    L17:
        boolean r10 = true;
    L18:
        if (r10 == false) goto L3;
    L25:
        SemaphoreSegment r11 = (SemaphoreSegment) SegmentOrClosed.m8976getSegmentimpl(r8);
        r11.cleanPrev();
        if (r11.id <= r4) goto L28;
        return r16;
    L28:
        int r13 = (int) (r2 % ((long) SemaphoreKt.access$getSEGMENT_SIZE$p()));
        Object r14 = r11.getAcquirers().getAndSet(r13, SemaphoreKt.access$getPERMIT$p());
        if (r14 != null) goto L39;
        int r15 = SemaphoreKt.access$getMAX_SPIN_CYCLES$p();
        ?? r18 = r16;
    L31:
        if (r18 >= r15) goto L37;
        SemaphoreSegment r19 = r1;
        if (r11.getAcquirers().get(r13) == SemaphoreKt.access$getTAKEN$p()) goto L34;
        r1 = r19;
        r18 = r18 + 1;
        goto L31
    L34:
        return r17;
    L37:
        return !AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(r11.getAcquirers(), r13, SemaphoreKt.access$getPERMIT$p(), SemaphoreKt.access$getBROKEN$p());
    L39:
        if (r14 != SemaphoreKt.access$getCANCELLED$p()) goto L42;
        return r16;
    L42:
        return tryResumeAcquire(r14);
    L11:
        r10 = false;
        goto L18
    L8:
        r10 = true;
        goto L18
    L24:
        r16 = false;
        r17 = true;
        goto L25
    }

    private final boolean tryResumeAcquire(Object $this$tryResumeAcquire) {
        if (($this$tryResumeAcquire instanceof CancellableContinuation) == false) goto L9;
        Intrinsics.checkNotNull($this$tryResumeAcquire, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        CancellableContinuation r0 = (CancellableContinuation) $this$tryResumeAcquire;
        Object token = ((CancellableContinuation) $this$tryResumeAcquire).tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
        if (token == null) goto L7;
        ((CancellableContinuation) $this$tryResumeAcquire).completeResume(token);
        return true;
    L7:
        return false;
    L9:
        if (($this$tryResumeAcquire instanceof SelectInstance) == false) goto L13;
        return ((SelectInstance) $this$tryResumeAcquire).trySelect(this, Unit.INSTANCE);
    L13:
        throw new IllegalStateException(("unexpected: " + $this$tryResumeAcquire).toString());
    }
}
