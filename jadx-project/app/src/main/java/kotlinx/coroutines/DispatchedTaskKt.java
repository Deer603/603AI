package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, d2 = {"MODE_ATOMIC", "", "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "", "(I)Z", "isReusableMode", "dispatch", "", "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "undispatched", "resumeUnconfined", "resumeWithStackTrace", "exception", "", "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DispatchedTaskKt {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
    }

    public static final boolean isCancellableMode(int $this$isCancellableMode) {
        if ($this$isCancellableMode != 1) goto L5;
        return true;
    L5:
        if ($this$isCancellableMode == 2) goto L10;
        return false;
    L10:
        return true;
    }

    public static final boolean isReusableMode(int $this$isReusableMode) {
        if ($this$isReusableMode != 2) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <T> void dispatch(DispatchedTask<? super T> r5, int mode) {
        boolean undispatched = true;
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        Continuation<? super T> r0 = r5.getDelegate$kotlinx_coroutines_core();
        if (mode == 4) goto L16;
        undispatched = false;
    L16:
        if (undispatched == false) goto L18;
    L25:
        resume(r5, r0, undispatched);
        return;
    L18:
        if ((r0 instanceof DispatchedContinuation) == false) goto L25;
        if (isCancellableMode(mode) != isCancellableMode(r5.resumeMode)) goto L25;
        CoroutineDispatcher dispatcher = ((DispatchedContinuation) r0).dispatcher;
        CoroutineContext context = r0.getContext();
        if (dispatcher.isDispatchNeeded(context) == false) goto L24;
        dispatcher.mo8970dispatch(context, r5);
        return;
    L24:
        resumeUnconfined(r5);
        return;
    L5:
        if (mode == (-1)) goto L7;
        int r1 = 1;
    L8:
        if (r1 != 0) goto L12;
        throw new AssertionError();
    L7:
        r1 = 0;
        goto L8
    }

    public static final <T> void resume(DispatchedTask<? super T> r13, Continuation<? super T> r14, boolean undispatched) {
        Object state = r13.takeState$kotlinx_coroutines_core();
        Throwable exception = r13.getExceptionalResult$kotlinx_coroutines_core(state);
        Result.Companion r2 = Result.Companion;
        if (exception == null) goto L5;
        Object r3 = ResultKt.createFailure(exception);
    L6:
        Object result = Result.m7425constructorimpl(r3);
        if (undispatched == false) goto L25;
        Intrinsics.checkNotNull(r14, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        DispatchedContinuation this_$iv = (DispatchedContinuation) r14;
        Continuation<T> r5 = this_$iv.continuation;
        Object countOrElement$iv$iv = this_$iv.countOrElement;
        CoroutineContext context$iv$iv = r5.getContext();
        Object oldValue$iv$iv = ThreadContextKt.updateThreadContext(context$iv$iv, countOrElement$iv$iv);
        if (oldValue$iv$iv == ThreadContextKt.NO_THREAD_ELEMENTS) goto L11;
        UndispatchedCoroutine<?> r10 = CoroutineContextKt.updateUndispatchedCompletion(r5, context$iv$iv, oldValue$iv$iv);
    L27:
        this_$iv.continuation.resumeWith(result);     // Catch: Throwable -> L19
        Unit r11 = Unit.INSTANCE;     // Catch: Throwable -> L19
        if (r10 != null) goto L16;
    L17:
        ThreadContextKt.restoreThreadContext(context$iv$iv, oldValue$iv$iv);
        return;
    L16:
        if (r10.clearThreadContext() == true) goto L17;
        return;
    L19:
        th = move-exception;
        if (r10 != null) goto L22;
    L23:
        ThreadContextKt.restoreThreadContext(context$iv$iv, oldValue$iv$iv);
    L24:
        throw th;
    L22:
        if (r10.clearThreadContext() == false) goto L24;
    L11:
        r10 = null;
        goto L27
    L25:
        r14.resumeWith(result);
        return;
    L5:
        r3 = r13.getSuccessfulResult$kotlinx_coroutines_core(state);
        goto L6
    }

    private static final void resumeUnconfined(DispatchedTask<?> r6) {
        EventLoop eventLoop = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop.isUnconfinedLoopActive() == false) goto L5;
        eventLoop.dispatchUnconfined(r6);
        return;
    L5:
        eventLoop.incrementUseCount(true);
        resume(r6, r6.getDelegate$kotlinx_coroutines_core(), true);     // Catch: Throwable -> L10
    L7:
        if (eventLoop.processUnconfinedEvent() == true) goto L7;
    L13:
        eventLoop.decrementUseCount(true);
        return;
    L10:
        e$iv = move-exception;
        r6.handleFatalException$kotlinx_coroutines_core(e$iv, null);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        eventLoop.decrementUseCount(true);
        throw th;
    }

    public static final void runUnconfinedEventLoop(DispatchedTask<?> r4, EventLoop eventLoop, Function0<Unit> r6) {
        eventLoop.incrementUseCount(true);
        r6.invoke();     // Catch: Throwable -> L7
    L4:
        if (eventLoop.processUnconfinedEvent() == true) goto L4;
    L10:
        eventLoop.decrementUseCount(true);
        return;
    L7:
        e = move-exception;
        r4.handleFatalException$kotlinx_coroutines_core(e, null);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        eventLoop.decrementUseCount(true);
        throw th;
    }

    public static final void resumeWithStackTrace(Continuation<?> r3, Throwable exception) {
        Result.Companion r1 = Result.Companion;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L5;
    L8:
        Throwable r2 = exception;
    L9:
        r3.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(r2)));
        return;
    L5:
        if ((r3 instanceof CoroutineStackFrame) == false) goto L8;
        r2 = StackTraceRecoveryKt.access$recoverFromStackFrame(exception, (CoroutineStackFrame) r3);
        goto L9
    }
}
