package kotlinx.coroutines.internal;

import androidx.autofill.HintConstants;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletedWithCancellation;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\tJ\r\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u001f\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010$\u001a\u00020%H\u0010¢\u0006\u0002\b&J\u0015\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cH\u0000¢\u0006\u0002\b(J\u001f\u0010)\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010*\u001a\u00028\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/H\u0016J\r\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2J\u0015\u00103\u001a\u0002012\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b4J\r\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6JE\u00107\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000092%\b\b\u0010:\u001a\u001f\u0012\u0013\u0012\u00110%¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b($\u0012\u0004\u0012\u00020 \u0018\u00010;H\u0080\b¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u0002012\b\u0010A\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0002\bBJ\u001e\u0010C\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0080\b¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0016¢\u0006\u0002\u0010EJ\u000f\u0010G\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020JH\u0016J\u001b\u0010K\u001a\u0004\u0018\u00010%2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030LH\u0000¢\u0006\u0002\bMR\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\u001a\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "get_state$kotlinx_coroutines_core$annotations", "()V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "countOrElement", "delegate", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "reusableCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "awaitReusability", "", "awaitReusability$kotlinx_coroutines_core", "cancelCompletedResult", "takenState", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "claimReusableCancellableContinuation", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "dispatchYield", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "isReusable", "", "isReusable$kotlinx_coroutines_core", "postponeCancellation", "postponeCancellation$kotlinx_coroutines_core", "release", "release$kotlinx_coroutines_core", "resumeCancellableWith", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "resumeCancellableWith$kotlinx_coroutines_core", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeCancelled", "state", "resumeCancelled$kotlinx_coroutines_core", "resumeUndispatchedWith", "resumeUndispatchedWith$kotlinx_coroutines_core", "(Ljava/lang/Object;)V", "resumeWith", "takeState", "takeState$kotlinx_coroutines_core", "toString", "", "tryReleaseClaimedContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements CoroutineStackFrame, Continuation<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = null;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object _state;
    public final Continuation<T> continuation;
    public final Object countOrElement;
    public final CoroutineDispatcher dispatcher;

    static {
        _reusableCancellableContinuation$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    }

    private final /* synthetic */ Object get_reusableCancellableContinuation$volatile() {
        return this._reusableCancellableContinuation$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_reusableCancellableContinuation$volatile$FU() {
        return _reusableCancellableContinuation$volatile$FU;
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicReferenceFieldUpdater r3, Function1<Object, Unit> r4) {
    L2:
        r4.invoke(r3.get(r2));
        goto L2
    }

    private final /* synthetic */ void set_reusableCancellableContinuation$volatile(Object r1) {
        this._reusableCancellableContinuation$volatile = r1;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(CoroutineDispatcher dispatcher, Continuation<? super T> r3) {
        super(-1);
        this.dispatcher = dispatcher;
        this.continuation = r3;
        this._state = DispatchedContinuationKt.access$getUNDEFINED$p();
        this.countOrElement = ThreadContextKt.threadContextElements(getContext());
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> r0 = this.continuation;
        if ((r0 instanceof CoroutineStackFrame) == true) goto L7;
        return null;
    L7:
        return (CoroutineStackFrame) r0;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    private final CancellableContinuationImpl<?> getReusableCancellableContinuation() {
        Object r0 = get_reusableCancellableContinuation$volatile$FU().get(this);
        if ((r0 instanceof CancellableContinuationImpl) == true) goto L7;
        return null;
    L7:
        return (CancellableContinuationImpl) r0;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        if (get_reusableCancellableContinuation$volatile$FU().get(this) == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_reusableCancellableContinuation$volatile$FU();
    L3:
        Object it = handler$atomicfu$iv.get(this);
        if (it == DispatchedContinuationKt.REUSABLE_CLAIMED) goto L3;
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        CancellableContinuationImpl<?> r0 = getReusableCancellableContinuation();
        if (r0 == null) goto L6;
        r0.detachChild$kotlinx_coroutines_core();
        return;
    }

    public final CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_reusableCancellableContinuation$volatile$FU();
    L3:
        Object state = handler$atomicfu$iv.get(this);
        if (state == null) goto L5;
        if ((state instanceof CancellableContinuationImpl) == true) goto L10;
        if (state == DispatchedContinuationKt.REUSABLE_CLAIMED) goto L3;
        if ((state instanceof Throwable) == true) goto L3;
        throw new IllegalStateException(("Inconsistent state " + state).toString());
    L10:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_reusableCancellableContinuation$volatile$FU(), this, state, DispatchedContinuationKt.REUSABLE_CLAIMED) == false) goto L3;
        return (CancellableContinuationImpl) state;
    L5:
        get_reusableCancellableContinuation$volatile$FU().set(this, DispatchedContinuationKt.REUSABLE_CLAIMED);
        return null;
    }

    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(CancellableContinuation<?> r8) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_reusableCancellableContinuation$volatile$FU();
    L3:
        Object state = handler$atomicfu$iv.get(this);
        if (state != DispatchedContinuationKt.REUSABLE_CLAIMED) goto L10;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_reusableCancellableContinuation$volatile$FU(), this, DispatchedContinuationKt.REUSABLE_CLAIMED, r8) == false) goto L3;
        return null;
    L10:
        if ((state instanceof Throwable) == false) goto L18;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_reusableCancellableContinuation$volatile$FU(), this, state, null) == false) goto L16;
        return (Throwable) state;
    L16:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L18:
        throw new IllegalStateException(("Inconsistent state " + state).toString());
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(Throwable cause) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_reusableCancellableContinuation$volatile$FU();
    L3:
        Object state = handler$atomicfu$iv.get(this);
        if (Intrinsics.areEqual(state, DispatchedContinuationKt.REUSABLE_CLAIMED) == true) goto L6;
        if ((state instanceof Throwable) == true) goto L10;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_reusableCancellableContinuation$volatile$FU(), this, state, null) == false) goto L3;
        return false;
    L10:
        return true;
    L6:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_reusableCancellableContinuation$volatile$FU(), this, DispatchedContinuationKt.REUSABLE_CLAIMED, cause) == false) goto L3;
        return true;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        Object state = this._state;
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        this._state = DispatchedContinuationKt.access$getUNDEFINED$p();
        return state;
    L5:
        if (state == DispatchedContinuationKt.access$getUNDEFINED$p()) goto L7;
        boolean r2 = true;
    L8:
        if (r2 == true) goto L12;
        throw new AssertionError();
    L7:
        r2 = false;
        goto L8
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        CoroutineContext context = this.continuation.getContext();
        Object state = CompletionStateKt.toState$default(result, null, 1, null);
        if (this.dispatcher.isDispatchNeeded(context) == false) goto L6;
        this._state = state;
        this.resumeMode = 0;
        this.dispatcher.mo8970dispatch(context, this);
        return;
    L6:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L8;
    L8:
        EventLoop eventLoop$iv = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$iv.isUnconfinedLoopActive() == false) goto L11;
        this._state = state;
        this.resumeMode = 0;
        eventLoop$iv.dispatchUnconfined(this);
        return;
    L11:
        DispatchedContinuation<T> $this$runUnconfinedEventLoop$iv$iv = this;
        eventLoop$iv.incrementUseCount(true);
        CoroutineContext context$iv = getContext();     // Catch: Throwable -> L23
        Object countOrElement$iv = this.countOrElement;     // Catch: Throwable -> L23
        Object oldValue$iv = ThreadContextKt.updateThreadContext(context$iv, countOrElement$iv);     // Catch: Throwable -> L23
        this.continuation.resumeWith(result);     // Catch: Throwable -> L20
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L20
    L16:
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);     // Catch: Throwable -> L23
    L18:
        if (eventLoop$iv.processUnconfinedEvent() == true) goto L18;
    L26:
        eventLoop$iv.decrementUseCount(true);
        return;
    L20:
        th = move-exception;
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);     // Catch: Throwable -> L23
        throw th;     // Catch: Throwable -> L23
    L23:
        e$iv$iv = move-exception;
        $this$runUnconfinedEventLoop$iv$iv.handleFatalException$kotlinx_coroutines_core(e$iv$iv, null);     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        eventLoop$iv.decrementUseCount(true);
        throw th;
    }

    public final void resumeCancellableWith$kotlinx_coroutines_core(Object result, Function1<? super Throwable, Unit> r24) {
        Object state = CompletionStateKt.toState(result, r24);
        if (this.dispatcher.isDispatchNeeded(getContext()) == false) goto L6;
        this._state = state;
        this.resumeMode = 1;
        this.dispatcher.mo8970dispatch(getContext(), this);
        return;
    L6:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L8;
    L8:
        EventLoop eventLoop$iv = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$iv.isUnconfinedLoopActive() == false) goto L11;
        this._state = state;
        this.resumeMode = 1;
        eventLoop$iv.dispatchUnconfined(this);
        return;
    L11:
        DispatchedContinuation<T> $this$runUnconfinedEventLoop$iv$iv = this;
        eventLoop$iv.incrementUseCount(true);
        Job job$iv = (Job) getContext().get(Job.Key);     // Catch: Throwable -> L57
        if (job$iv != null) goto L78;
    L20:
        boolean r0 = false;
    L77:
        if (r0 == true) goto L53;
        Continuation<T> r1 = this.continuation;     // Catch: Throwable -> L57
        Object countOrElement$iv$iv = this.countOrElement;     // Catch: Throwable -> L57
        CoroutineContext context$iv$iv = r1.getContext();     // Catch: Throwable -> L57
        Object oldValue$iv$iv = ThreadContextKt.updateThreadContext(context$iv$iv, countOrElement$iv$iv);     // Catch: Throwable -> L57
        if (oldValue$iv$iv != ThreadContextKt.NO_THREAD_ELEMENTS) goto L69;
        UndispatchedCoroutine<?> r2 = null;
    L31:
        UndispatchedCoroutine<?> r18 = r2;
        this.continuation.resumeWith(result);     // Catch: Throwable -> L40
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L40
        if (r18 != null) goto L37;
    L38:
        ThreadContextKt.restoreThreadContext(context$iv$iv, oldValue$iv$iv);     // Catch: Throwable -> L55
        goto L53
    L37:
        if (r18.clearThreadContext() == false) goto L53;
    L40:
        th = th;
    L44:
        if (r18 != null) goto L46;
    L47:
        ThreadContextKt.restoreThreadContext(context$iv$iv, oldValue$iv$iv);     // Catch: Throwable -> L55
    L49:
        throw th;     // Catch: Throwable -> L55
    L46:
        if (r18.clearThreadContext() == false) goto L49;
    L42:
        th = th;
        goto L44
    L69:
        r2 = CoroutineContextKt.updateUndispatchedCompletion(r1, context$iv$iv, oldValue$iv$iv);     // Catch: Throwable -> L28
    L28:
        e$iv$iv = th;
    L71:
        $this$runUnconfinedEventLoop$iv$iv.handleFatalException$kotlinx_coroutines_core(e$iv$iv, null);     // Catch: Throwable -> L64
    L61:
        eventLoop$iv.decrementUseCount(true);
        return;
    L64:
        th = move-exception;
        eventLoop$iv.decrementUseCount(true);
        throw th;
    L53:
        if (eventLoop$iv.processUnconfinedEvent() == true) goto L53;
    L55:
        e$iv$iv = th;
        goto L71
    L78:
    L18:
        e$iv$iv = th;
        goto L71
    L15:
        if (job$iv.isActive() == true) goto L20;
        CancellationException cause$iv = job$iv.getCancellationException();     // Catch: Throwable -> L18
        cancelCompletedResult$kotlinx_coroutines_core(state, cause$iv);     // Catch: Throwable -> L18
        Result.Companion r17 = Result.Companion;     // Catch: Throwable -> L18
        resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(cause$iv)));     // Catch: Throwable -> L18
        r0 = true;
    L57:
        e$iv$iv = th;
        goto L71
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(Object takenState, Throwable cause) {
        if ((takenState instanceof CompletedWithCancellation) == false) goto L6;
        ((CompletedWithCancellation) takenState).onCancellation.invoke(cause);
        return;
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(Object state) {
        Job job = (Job) getContext().get(Job.Key);
        if (job != null) goto L5;
        return false;
    L5:
        if (job.isActive() == true) goto L10;
        CancellationException cause = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state, cause);
        Result.Companion r4 = Result.Companion;
        resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(cause)));
        return true;
    L10:
        return false;
    }

    public final void resumeUndispatchedWith$kotlinx_coroutines_core(Object result) {
        Continuation<T> r1 = this.continuation;
        Object countOrElement$iv = this.countOrElement;
        CoroutineContext context$iv = r1.getContext();
        Object oldValue$iv = ThreadContextKt.updateThreadContext(context$iv, countOrElement$iv);
        if (oldValue$iv == ThreadContextKt.NO_THREAD_ELEMENTS) goto L5;
        UndispatchedCoroutine<?> r6 = CoroutineContextKt.updateUndispatchedCompletion(r1, context$iv, oldValue$iv);
    L20:
        this.continuation.resumeWith(result);     // Catch: Throwable -> L14
        Unit r7 = Unit.INSTANCE;     // Catch: Throwable -> L14
        if (r6 != null) goto L10;
    L11:
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);
        return;
    L10:
        if (r6.clearThreadContext() == true) goto L11;
        return;
    L14:
        th = move-exception;
        if (r6 != null) goto L17;
    L18:
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);
    L19:
        throw th;
    L17:
        if (r6.clearThreadContext() == false) goto L19;
    L5:
        r6 = null;
        goto L20
    }

    public final void dispatchYield$kotlinx_coroutines_core(CoroutineContext context, T r4) {
        this._state = r4;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(context, this);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + DebugStringsKt.toDebugString(this.continuation) + ']';
    }
}
