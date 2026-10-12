package kotlinx.coroutines;

import androidx.autofill.HintConstants;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001b\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002042\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0017\u00105\u001a\u00020/2\f\u00106\u001a\b\u0012\u0004\u0012\u00020/07H\u0082\bJ1\u00108\u001a\u00020/2!\u00109\u001a\u001d\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/0:2\u0006\u00102\u001a\u000203J\u001e\u0010=\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0012\u0010@\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001f\u0010A\u001a\u00020/2\b\u0010B\u001a\u0004\u0018\u00010\u00122\u0006\u00102\u001a\u000203H\u0010¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u00020\u001d2\u0006\u00102\u001a\u000203H\u0002J\u0010\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u0012H\u0016J\r\u0010G\u001a\u00020/H\u0000¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020/H\u0002J\u0010\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\nH\u0002J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020NH\u0016J\u0019\u0010O\u001a\u0004\u0018\u0001032\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0002\bPJ\n\u0010Q\u001a\u0004\u0018\u00010\u0012H\u0001J\u0010\u0010R\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016J\u001f\u0010U\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0004\bV\u0010WJ\b\u0010X\u001a\u00020/H\u0016J\n\u0010Y\u001a\u0004\u0018\u00010\u0010H\u0002J1\u0010Z\u001a\u00020/2'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u000103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/0:j\u0002`[H\u0016J\u001c\u0010Z\u001a\u00020/2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030?2\u0006\u0010\\\u001a\u00020\nH\u0016J\u0010\u0010]\u001a\u00020/2\u0006\u00100\u001a\u00020\u0012H\u0002J\u0015\u0010^\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b_J\b\u0010`\u001a\u00020\u001dH\u0002J\u001a\u0010a\u001a\u00020/2\u0006\u00100\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010b\u001a\u00020(H\u0014J\u0015\u0010c\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0000¢\u0006\u0002\bdJ\r\u0010e\u001a\u00020/H\u0000¢\u0006\u0002\bfJ\b\u0010g\u001a\u00020\u001dH\u0001J:\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00028\u00002#\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:H\u0016¢\u0006\u0002\u0010jJA\u0010k\u001a\u00020/2\b\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2%\b\u0002\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:H\u0002J\u001b\u0010l\u001a\u00020/2\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000nH\u0016¢\u0006\u0002\u0010oJS\u0010p\u001a\u0004\u0018\u00010\u00122\u0006\u0010$\u001a\u00020q2\b\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\n2#\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:2\b\u0010r\u001a\u0004\u0018\u00010\u0012H\u0002J\u000f\u0010s\u001a\u0004\u0018\u00010\u0012H\u0010¢\u0006\u0002\btJ\b\u0010u\u001a\u00020(H\u0016J\b\u0010v\u001a\u00020\u001dH\u0002J!\u0010v\u001a\u0004\u0018\u00010\u00122\u0006\u0010i\u001a\u00028\u00002\b\u0010r\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010wJF\u0010v\u001a\u0004\u0018\u00010\u00122\u0006\u0010i\u001a\u00028\u00002\b\u0010r\u001a\u0004\u0018\u00010\u00122#\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:H\u0016¢\u0006\u0002\u0010xJC\u0010y\u001a\u0004\u0018\u00010z2\b\u0010-\u001a\u0004\u0018\u00010\u00122\b\u0010r\u001a\u0004\u0018\u00010\u00122#\u00109\u001a\u001f\u0012\u0013\u0012\u001103¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020/\u0018\u00010:H\u0002J\u0012\u0010{\u001a\u0004\u0018\u00010\u00122\u0006\u0010|\u001a\u000203H\u0016J\b\u0010}\u001a\u00020\u001dH\u0002J\u001a\u0010~\u001a\u00020/*\u00020\u007f2\u0006\u0010i\u001a\u00028\u0000H\u0016¢\u0006\u0003\u0010\u0080\u0001J\u0015\u0010\u0081\u0001\u001a\u00020/*\u00020\u007f2\u0006\u0010|\u001a\u000203H\u0016R\t\u0010\f\u001a\u00020\rX\u0082\u0004R\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004R\u0011\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fX\u0082\u0004R\u001c\u0010\u0013\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006\u0082\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "(Lkotlin/coroutines/Continuation;I)V", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicInt;", "_parentHandle", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/DisposableHandle;", "_state", "", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "", "()Z", "isCancelled", "isCompleted", "parentHandle", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "stateDebugRepresentation", "", "getStateDebugRepresentation", "()Ljava/lang/String;", "alreadyResumedError", "", "proposedUpdate", "callCancelHandler", "", "handler", "Lkotlinx/coroutines/CancelHandler;", "cause", "", "Lkotlinx/coroutines/InternalCompletionHandler;", "callCancelHandlerSafely", "block", "Lkotlin/Function0;", "callOnCancellation", "onCancellation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "callSegmentOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "cancel", "cancelCompletedResult", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "cancelLater", "completeResume", "token", "detachChild", "detachChild$kotlinx_coroutines_core", "detachChildIfNonResuable", "dispatchResume", "mode", "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "getExceptionalResult", "getExceptionalResult$kotlinx_coroutines_core", "getResult", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "initCancellability", "installParentHandle", "invokeOnCancellation", "Lkotlinx/coroutines/CompletionHandler;", "index", "invokeOnCancellationImpl", "invokeOnCancellationInternal", "invokeOnCancellationInternal$kotlinx_coroutines_core", "isReusable", "multipleHandlersError", "nameString", "parentCancelled", "parentCancelled$kotlinx_coroutines_core", "releaseClaimedReusableContinuation", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "resetStateReusable", "resume", "value", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumedState", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "takeState", "takeState$kotlinx_coroutines_core", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeImpl", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeWithException", "exception", "trySuspend", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private final CoroutineContext context;
    private final Continuation<T> delegate;

    static {
        _decisionAndIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
        _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
        _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");
    }

    private final /* synthetic */ int get_decisionAndIndex$volatile() {
        return this._decisionAndIndex$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater get_decisionAndIndex$volatile$FU() {
        return _decisionAndIndex$volatile$FU;
    }

    private final /* synthetic */ Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_parentHandle$volatile$FU() {
        return _parentHandle$volatile$FU;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_state$volatile$FU() {
        return _state$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicIntegerFieldUpdater r3, Function1<? super Integer, Unit> r4) {
    L2:
        r4.invoke(Integer.valueOf(r3.get(r2)));
        goto L2
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicReferenceFieldUpdater r3, Function1<Object, Unit> r4) {
    L2:
        r4.invoke(r3.get(r2));
        goto L2
    }

    private final /* synthetic */ void set_decisionAndIndex$volatile(int r1) {
        this._decisionAndIndex$volatile = r1;
    }

    private final /* synthetic */ void set_parentHandle$volatile(Object r1) {
        this._parentHandle$volatile = r1;
    }

    private final /* synthetic */ void set_state$volatile(Object r1) {
        this._state$volatile = r1;
    }

    private final /* synthetic */ void update$atomicfu(Object r3, AtomicIntegerFieldUpdater r4, Function1<? super Integer, Integer> r5) {
    L2:
        int r0 = r4.get(r3);
        if (r4.compareAndSet(r3, r0, r5.invoke(Integer.valueOf(r0)).intValue()) == false) goto L2;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(Continuation<? super T> r5, int resumeMode) {
        super(resumeMode);
        this.delegate = r5;
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        this.context = this.delegate.getContext();
        this._decisionAndIndex$volatile = (0 << 29) + 536870911;
        this._state$volatile = Active.INSTANCE;
        return;
    L5:
        if (resumeMode == (-1)) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L12;
        throw new AssertionError();
    L7:
        r1 = false;
        goto L8
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.context;
    }

    private final DisposableHandle getParentHandle() {
        return (DisposableHandle) get_parentHandle$volatile$FU().get(this);
    }

    public final Object getState$kotlinx_coroutines_core() {
        return get_state$volatile$FU().get(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof CancelledContinuation;
    }

    private final String getStateDebugRepresentation() {
        Object r0 = getState$kotlinx_coroutines_core();
        if ((r0 instanceof NotCompleted) == false) goto L6;
        return "Active";
    L6:
        if ((r0 instanceof CancelledContinuation) == false) goto L8;
        return "Cancelled";
    L8:
        return "Completed";
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        DisposableHandle handle = installParentHandle();
        if (handle != null) goto L6;
        return;
    L6:
        if (isCompleted() == false) goto L9;
        handle.dispose();
        get_parentHandle$volatile$FU().set(this, NonDisposableHandle.INSTANCE);
        return;
    }

    private final boolean isReusable() {
        if (DispatchedTaskKt.isReusableMode(this.resumeMode) == false) goto L7;
        Continuation<T> r0 = this.delegate;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        if (((DispatchedContinuation) r0).isReusable$kotlinx_coroutines_core() == false) goto L7;
        return true;
    L7:
        return false;
    }

    public final boolean resetStateReusable() {
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L13;
        if (this.resumeMode != 2) goto L7;
        int r0 = 1;
    L8:
        if (r0 != 0) goto L13;
        throw new AssertionError();
    L7:
        r0 = 0;
    L13:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L15;
    L22:
        Object state = get_state$volatile$FU().get(this);
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L30;
        if ((state instanceof NotCompleted) == false) goto L30;
        throw new AssertionError();
    L30:
        if ((state instanceof CompletedContinuation) == true) goto L32;
    L35:
        get_decisionAndIndex$volatile$FU().set(this, (0 << 29) + 536870911);
        get_state$volatile$FU().set(this, Active.INSTANCE);
        return true;
    L32:
        if (((CompletedContinuation) state).idempotentResume == null) goto L35;
        detachChild$kotlinx_coroutines_core();
        return false;
    L15:
        if (getParentHandle() == NonDisposableHandle.INSTANCE) goto L17;
        int r1 = 1;
    L18:
        if (r1 != 0) goto L22;
        throw new AssertionError();
    L17:
        r1 = 0;
        goto L18
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> r0 = this.delegate;
        if ((r0 instanceof CoroutineStackFrame) == true) goto L7;
        return null;
    L7:
        return (CoroutineStackFrame) r0;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(Object takenState, Throwable cause) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        Object state = handler$atomicfu$iv.get(this);
        if ((state instanceof NotCompleted) == true) goto L24;
        if ((state instanceof CompletedExceptionally) == true) goto L7;
        if ((state instanceof CompletedContinuation) == true) goto L11;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, new CompletedContinuation(state, null, null, null, cause, 14, null)) == false) goto L3;
        return;
    L11:
        if (((CompletedContinuation) state).getCancelled() == true) goto L18;
        CompletedContinuation update = CompletedContinuation.copy$default((CompletedContinuation) state, null, null, null, null, cause, 15, null);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, update) == false) goto L3;
        ((CompletedContinuation) state).invokeHandlers(this, cause);
        return;
    L18:
        throw new IllegalStateException("Must be called at most once".toString());
    L7:
        return;
    L24:
        throw new IllegalStateException("Not completed".toString());
    }

    private final boolean cancelLater(Throwable cause) {
        if (isReusable() == true) goto L6;
        return false;
    L6:
        Continuation<T> r0 = this.delegate;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        DispatchedContinuation dispatched = (DispatchedContinuation) r0;
        return dispatched.postponeCancellation$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(Throwable cause) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        Object state = handler$atomicfu$iv.get(this);
        boolean r5 = false;
        if ((state instanceof NotCompleted) == false) goto L5;
        CancellableContinuationImpl<T> r6 = this;
        if ((state instanceof CancelHandler) == false) goto L9;
    L10:
        r5 = true;
    L11:
        CancelledContinuation update = new CancelledContinuation(r6, cause, r5);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, update) == false) goto L3;
        NotCompleted r7 = (NotCompleted) state;
        if ((r7 instanceof CancelHandler) == false) goto L17;
        callCancelHandler((CancelHandler) state, cause);
    L19:
        detachChildIfNonResuable();
        dispatchResume(this.resumeMode);
        return true;
    L17:
        if ((r7 instanceof Segment) == false) goto L19;
        callSegmentOnCancellation((Segment) state, cause);
        goto L19
    L9:
        if ((state instanceof Segment) == false) goto L11;
    L5:
        return false;
    }

    public final void parentCancelled$kotlinx_coroutines_core(Throwable cause) {
        if (cancelLater(cause) == false) goto L5;
        return;
    L5:
        cancel(cause);
        detachChildIfNonResuable();
    }

    private final void callCancelHandlerSafely(Function0<Unit> r7) {
        r7.invoke();     // Catch: Throwable -> L5
        return;
    L5:
        ex = move-exception;
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, ex));
    }

    private final void callCancelHandler(InternalCompletionHandler handler, Throwable cause) {
        handler.invoke(cause);     // Catch: Throwable -> L5
        return;
    L5:
        ex$iv = move-exception;
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, ex$iv));
    }

    public final void callCancelHandler(CancelHandler handler, Throwable cause) {
        handler.invoke(cause);     // Catch: Throwable -> L5
        return;
    L5:
        ex$iv = move-exception;
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, ex$iv));
    }

    private final void callSegmentOnCancellation(Segment<?> r9, Throwable cause) {
        int $this$index$iv = get_decisionAndIndex$volatile$FU().get(this);
        int index = $this$index$iv & 536870911;
        if (index == 536870911) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L15;
        r9.onCancellation(index, cause, getContext());     // Catch: Throwable -> L10
        return;
    L10:
        ex$iv = move-exception;
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, ex$iv));
        return;
    L15:
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    L5:
        r1 = false;
        goto L6
    }

    public final void callOnCancellation(Function1<? super Throwable, Unit> r6, Throwable cause) {
        r6.invoke(cause);     // Catch: Throwable -> L4
        return;
    L4:
        ex = move-exception;
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, ex));
    }

    public Throwable getContinuationCancellationCause(Job parent) {
        return parent.getCancellationException();
    }

    private final boolean trySuspend() {
        AtomicIntegerFieldUpdater handler$atomicfu$iv = get_decisionAndIndex$volatile$FU();
    L3:
        int cur = handler$atomicfu$iv.get(this);
        int $this$decision$iv = cur >> 29;
        switch($this$decision$iv) {
            case 0: goto L9;
            case 1: goto L6;
            case 2: goto L7;
            default: goto L6;
        };
    L9:
        int index$iv = cur & 536870911;
        if (get_decisionAndIndex$volatile$FU().compareAndSet(this, cur, (1 << 29) + index$iv) == false) goto L3;
        return true;
    L6:
        throw new IllegalStateException("Already suspended".toString());
    L7:
        return false;
    }

    private final boolean tryResume() {
        AtomicIntegerFieldUpdater handler$atomicfu$iv = get_decisionAndIndex$volatile$FU();
    L3:
        int cur = handler$atomicfu$iv.get(this);
        int $this$decision$iv = cur >> 29;
        switch($this$decision$iv) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L6;
        };
    L9:
        int index$iv = cur & 536870911;
        if (get_decisionAndIndex$volatile$FU().compareAndSet(this, cur, (2 << 29) + index$iv) == false) goto L3;
        return true;
    L6:
        throw new IllegalStateException("Already resumed".toString());
    L7:
        return false;
    }

    public final Object getResult() {
        boolean isReusable = isReusable();
        if (trySuspend() == true) goto L5;
        if (isReusable == false) goto L13;
        releaseClaimedReusableContinuation$kotlinx_coroutines_core();
    L13:
        Object state = getState$kotlinx_coroutines_core();
        if ((state instanceof CompletedExceptionally) == false) goto L23;
        Throwable exception$iv = ((CompletedExceptionally) state).cause;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L18;
        throw exception$iv;
    L18:
        if ((this instanceof CoroutineStackFrame) == true) goto L21;
        throw exception$iv;
    L21:
        throw StackTraceRecoveryKt.access$recoverFromStackFrame(exception$iv, this);
    L23:
        if (DispatchedTaskKt.isCancellableMode(this.resumeMode) == false) goto L37;
        Job job = (Job) getContext().get(Job.Key);
        if (job == null) goto L37;
        if (job.isActive() == true) goto L37;
        CancellationException cause = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state, cause);
        if (DebugKt.getRECOVER_STACK_TRACES() == false) goto L35;
        if ((this instanceof CoroutineStackFrame) == false) goto L35;
        throw StackTraceRecoveryKt.access$recoverFromStackFrame(cause, this);
    L35:
        throw cause;
    L37:
        return getSuccessfulResult$kotlinx_coroutines_core(state);
    L5:
        if (getParentHandle() != null) goto L7;
        installParentHandle();
    L7:
        if (isReusable == false) goto L10;
        releaseClaimedReusableContinuation$kotlinx_coroutines_core();
    L10:
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    private final DisposableHandle installParentHandle() {
        Job parent = (Job) getContext().get(Job.Key);
        if (parent != null) goto L5;
        return null;
    L5:
        DisposableHandle handle = JobKt.invokeOnCompletion$default(parent, true, false, new ChildContinuation(this), 2, null);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_parentHandle$volatile$FU(), this, null, handle);
        return handle;
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Continuation<T> r0 = this.delegate;
        if ((r0 instanceof DispatchedContinuation) == false) goto L5;
        DispatchedContinuation r1 = (DispatchedContinuation) r0;
    L6:
        if (r1 == null) goto L12;
        Throwable cancellationCause = r1.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this);
        if (cancellationCause == null) goto L13;
        detachChild$kotlinx_coroutines_core();
        cancel(cancellationCause);
        return;
    L13:
        return;
    L12:
        return;
    L5:
        r1 = null;
        goto L6
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        resumeImpl$default(this, CompletionStateKt.toState(result, this), this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T r2, Function1<? super Throwable, Unit> r3) {
        resumeImpl(r2, this.resumeMode, r3);
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> r9, int index) {
        AtomicIntegerFieldUpdater handler$atomicfu$iv = get_decisionAndIndex$volatile$FU();
    L3:
        int it = handler$atomicfu$iv.get(this);
        int $this$index$iv = it & 536870911;
        if ($this$index$iv != 536870911) goto L6;
        boolean r5 = true;
    L7:
        if (r5 == false) goto L13;
        int decision$iv = it >> 29;
        if (handler$atomicfu$iv.compareAndSet(this, it, (decision$iv << 29) + index) == false) goto L3;
        invokeOnCancellationImpl(r9);
        return;
    L13:
        throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
    L6:
        r5 = false;
        goto L7
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(Function1<? super Throwable, Unit> r3) {
        CancellableContinuationKt.invokeOnCancellation(this, new CancelHandler.UserSupplied(r3));
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(CancelHandler handler) {
        invokeOnCancellationImpl(handler);
    }

    private final void invokeOnCancellationImpl(Object handler) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L15:
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L16:
        Object state = handler$atomicfu$iv.get(this);
        if ((state instanceof Active) == true) goto L19;
        if ((state instanceof CancelHandler) == false) goto L24;
        boolean r5 = true;
    L25:
        if (r5 == true) goto L26;
        if ((state instanceof CompletedExceptionally) == true) goto L30;
        if ((state instanceof CompletedContinuation) == true) goto L48;
        if ((handler instanceof Segment) == true) goto L62;
        Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
        CancelHandler r6 = (CancelHandler) handler;
        CompletedContinuation update = new CompletedContinuation(state, (CancelHandler) handler, null, null, null, 28, null);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, update) == false) goto L16;
        return;
    L62:
        return;
    L48:
        if (((CompletedContinuation) state).cancelHandler == null) goto L51;
        multipleHandlersError(handler, state);
    L51:
        if ((handler instanceof Segment) == true) goto L52;
        Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
        CancelHandler r7 = (CancelHandler) handler;
        if (((CompletedContinuation) state).getCancelled() == true) goto L55;
        CompletedContinuation update2 = CompletedContinuation.copy$default((CompletedContinuation) state, null, (CancelHandler) handler, null, null, null, 29, null);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, update2) == false) goto L16;
        return;
    L55:
        callCancelHandler((CancelHandler) handler, ((CompletedContinuation) state).cancelCause);
        return;
    L52:
        return;
    L30:
        if (((CompletedExceptionally) state).makeHandled() == true) goto L33;
        multipleHandlersError(handler, state);
    L33:
        if ((state instanceof CancelledContinuation) == false) goto L85;
        Throwable cause = null;
        if ((state instanceof CompletedExceptionally) == false) goto L37;
        CompletedExceptionally r3 = (CompletedExceptionally) state;
    L38:
        if (r3 == null) goto L41;
        cause = r3.cause;
    L41:
        if ((handler instanceof CancelHandler) == false) goto L43;
        callCancelHandler((CancelHandler) handler, cause);
        return;
    L43:
        Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
        callSegmentOnCancellation((Segment) handler, cause);
        return;
    L37:
        r3 = null;
        goto L38
    L85:
        return;
    L26:
        multipleHandlersError(handler, state);
        goto L16
    L24:
        r5 = state instanceof Segment;
        goto L25
    L19:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, handler) == false) goto L16;
        return;
    L5:
        if ((handler instanceof CancelHandler) == false) goto L7;
    L10:
        boolean r4 = true;
    L11:
        if (r4 == true) goto L15;
        throw new AssertionError();
    L7:
        if ((handler instanceof Segment) == true) goto L10;
        r4 = false;
        goto L11
    }

    private final void multipleHandlersError(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    private final void dispatchResume(int mode) {
        if (tryResume() == false) goto L5;
        return;
    L5:
        DispatchedTaskKt.dispatch(this, mode);
    }

    private final Object resumedState(NotCompleted state, Object proposedUpdate, int resumeMode, Function1<? super Throwable, Unit> r13, Object idempotent) {
        if ((proposedUpdate instanceof CompletedExceptionally) == false) goto L26;
        boolean r1 = true;
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L15;
        if (idempotent != null) goto L9;
        int r0 = 1;
    L10:
        if (r0 != 0) goto L15;
        throw new AssertionError();
    L9:
        r0 = 0;
    L15:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L42;
        if (r13 == null) goto L20;
        r1 = false;
    L20:
        if (r1 == true) goto L42;
        throw new AssertionError();
    L42:
        return proposedUpdate;
    L26:
        if (DispatchedTaskKt.isCancellableMode(resumeMode) == true) goto L29;
        if (idempotent == null) goto L42;
    L29:
        if (r13 != null) goto L37;
        if ((state instanceof CancelHandler) == true) goto L37;
        if (idempotent == null) goto L42;
    L37:
        if ((state instanceof CancelHandler) == false) goto L39;
        CancelHandler r2 = (CancelHandler) state;
    L41:
        return new CompletedContinuation(proposedUpdate, r2, r13, idempotent, null, 16, null);
    L39:
        r2 = null;
        goto L41
    }

    private final void resumeImpl(Object update, int resumeMode, Function1<? super Throwable, Unit> r14) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        Object state = handler$atomicfu$iv.get(this);
        if ((state instanceof NotCompleted) == false) goto L10;
        Object proposedUpdate = update;
        int resumeMode2 = resumeMode;
        Function1<? super Throwable, Unit> r9 = r14;
        Object update2 = resumedState((NotCompleted) state, proposedUpdate, resumeMode2, r9, null);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, update2) == true) goto L7;
        update = proposedUpdate;
        resumeMode = resumeMode2;
        r14 = r9;
        goto L3
    L7:
        detachChildIfNonResuable();
        dispatchResume(resumeMode2);
        return;
    L10:
        Object proposedUpdate2 = update;
        Function1<? super Throwable, Unit> r10 = r14;
        if ((state instanceof CancelledContinuation) == true) goto L13;
    L17:
        alreadyResumedError(proposedUpdate2);
        throw new KotlinNothingValueException();
    L13:
        if (((CancelledContinuation) state).makeResumed() == false) goto L17;
        if (r10 == null) goto L21;
        callOnCancellation(r10, ((CancelledContinuation) state).cause);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void resumeImpl$default(CancellableContinuationImpl r0, Object r1, int r2, Function1 r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = null;
    L6:
        r0.resumeImpl(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Symbol tryResumeImpl(Object update, Object idempotent, Function1<? super Throwable, Unit> r14) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        Object state = handler$atomicfu$iv.get(this);
        if ((state instanceof NotCompleted) == false) goto L10;
        Object proposedUpdate = update;
        Object idempotent2 = idempotent;
        Function1<? super Throwable, Unit> r9 = r14;
        Object update2 = resumedState((NotCompleted) state, proposedUpdate, this.resumeMode, r9, idempotent2);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_state$volatile$FU(), this, state, update2) == true) goto L7;
        update = proposedUpdate;
        r14 = r9;
        idempotent = idempotent2;
        goto L3
    L7:
        detachChildIfNonResuable();
        return CancellableContinuationImplKt.RESUME_TOKEN;
    L10:
        Object proposedUpdate2 = update;
        Object idempotent3 = idempotent;
        if ((state instanceof CompletedContinuation) == false) goto L25;
        if (idempotent3 != null) goto L14;
        return null;
    L14:
        if (((CompletedContinuation) state).idempotentResume == idempotent3) goto L16;
        return null;
    L16:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L24;
        if (Intrinsics.areEqual(((CompletedContinuation) state).result, proposedUpdate2) == true) goto L24;
        throw new AssertionError();
    L24:
        return CancellableContinuationImplKt.RESUME_TOKEN;
    L25:
        return null;
    }

    private final Void alreadyResumedError(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    private final void detachChildIfNonResuable() {
        if (isReusable() == true) goto L6;
        detachChild$kotlinx_coroutines_core();
        return;
    }

    public final void detachChild$kotlinx_coroutines_core() {
        DisposableHandle handle = getParentHandle();
        if (handle != null) goto L5;
        return;
    L5:
        handle.dispose();
        get_parentHandle$volatile$FU().set(this, NonDisposableHandle.INSTANCE);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResume(T r2, Object idempotent) {
        return tryResumeImpl(r2, idempotent, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResume(T r2, Object idempotent, Function1<? super Throwable, Unit> r4) {
        return tryResumeImpl(r2, idempotent, r4);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResumeWithException(Throwable exception) {
        return tryResumeImpl(new CompletedExceptionally(exception, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(Object token) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        dispatchResume(this.resumeMode);
        return;
    L5:
        if (token != CancellableContinuationImplKt.RESUME_TOKEN) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L12;
        throw new AssertionError();
    L7:
        r1 = false;
        goto L8
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(CoroutineDispatcher $this$resumeUndispatched, T r10) {
        Continuation<T> r0 = this.delegate;
        CoroutineDispatcher r2 = null;
        if ((r0 instanceof DispatchedContinuation) == false) goto L5;
        DispatchedContinuation dc = (DispatchedContinuation) r0;
    L6:
        if (dc == null) goto L8;
        r2 = dc.dispatcher;
    L8:
        if (r2 != $this$resumeUndispatched) goto L10;
        int r1 = 4;
    L11:
        resumeImpl$default(this, r10, r1, null, 4, null);
        return;
    L10:
        r1 = this.resumeMode;
        goto L11
    L5:
        dc = null;
        goto L6
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(CoroutineDispatcher $this$resumeUndispatchedWithException, Throwable exception) {
        Continuation<T> r0 = this.delegate;
        CoroutineDispatcher r2 = null;
        if ((r0 instanceof DispatchedContinuation) == false) goto L5;
        DispatchedContinuation dc = (DispatchedContinuation) r0;
    L6:
        CompletedExceptionally r4 = new CompletedExceptionally(exception, false, 2, null);
        if (dc == null) goto L9;
        r2 = dc.dispatcher;
    L9:
        if (r2 != $this$resumeUndispatchedWithException) goto L11;
        int r1 = 4;
    L12:
        resumeImpl$default(this, r4, r1, null, 4, null);
        return;
    L11:
        r1 = this.resumeMode;
        goto L12
    L5:
        dc = null;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object r2) {
        if ((r2 instanceof CompletedContinuation) == false) goto L6;
        return (T) ((CompletedContinuation) r2).result;
    L6:
        return r2;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object state) {
        Throwable it = super.getExceptionalResult$kotlinx_coroutines_core(state);
        if (it == null) goto L12;
        Continuation<T> r2 = this.delegate;
        if (DebugKt.getRECOVER_STACK_TRACES() == false) goto L14;
        if ((r2 instanceof CoroutineStackFrame) == false) goto L14;
        return StackTraceRecoveryKt.access$recoverFromStackFrame(it, (CoroutineStackFrame) r2);
    L14:
        return it;
    L12:
        return null;
    }

    public String toString() {
        return nameString() + '(' + DebugStringsKt.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + DebugStringsKt.getHexAddress(this);
    }

    protected String nameString() {
        return "CancellableContinuation";
    }
}
