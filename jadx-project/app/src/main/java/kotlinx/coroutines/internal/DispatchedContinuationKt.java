package kotlinx.coroutines.internal;

import androidx.autofill.HintConstants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0003\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082\b\u001aR\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00122%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0012\u0010\u001a\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\r0\u0005H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DispatchedContinuationKt {
    public static final Symbol REUSABLE_CLAIMED = null;
    private static final Symbol UNDEFINED = null;

    public static final /* synthetic */ Symbol access$getUNDEFINED$p() {
        return UNDEFINED;
    }

    static {
        UNDEFINED = new Symbol("UNDEFINED");
        REUSABLE_CLAIMED = new Symbol("REUSABLE_CLAIMED");
    }

    public static /* synthetic */ void resumeCancellableWith$default(Continuation r0, Object r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        resumeCancellableWith(r0, r1, r2);
    }

    public static final <T> void resumeCancellableWith(Continuation<? super T> r22, Object result, Function1<? super Throwable, Unit> r24) {
        if ((r22 instanceof DispatchedContinuation) == false) goto L73;
        DispatchedContinuation this_$iv = (DispatchedContinuation) r22;
        Object state$iv = CompletionStateKt.toState(result, r24);
        if (this_$iv.dispatcher.isDispatchNeeded(this_$iv.getContext()) == false) goto L8;
        this_$iv._state = state$iv;
        this_$iv.resumeMode = 1;
        this_$iv.dispatcher.mo8970dispatch(this_$iv.getContext(), this_$iv);
        return;
    L8:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L10;
    L10:
        EventLoop eventLoop$iv$iv = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$iv$iv.isUnconfinedLoopActive() == false) goto L13;
        this_$iv._state = state$iv;
        this_$iv.resumeMode = 1;
        eventLoop$iv$iv.dispatchUnconfined(this_$iv);
        return;
    L13:
        DispatchedContinuation $this$runUnconfinedEventLoop$iv$iv$iv = this_$iv;
        eventLoop$iv$iv.incrementUseCount(true);
        Job job$iv$iv = (Job) this_$iv.getContext().get(Job.Key);     // Catch: Throwable -> L63
        if (job$iv$iv != null) goto L79;
    L22:
        boolean r0 = false;
    L81:
        if (r0 == true) goto L59;
        Continuation<T> r1 = this_$iv.continuation;     // Catch: Throwable -> L63
        Object countOrElement$iv$iv$iv = this_$iv.countOrElement;     // Catch: Throwable -> L63
        CoroutineContext context$iv$iv$iv = r1.getContext();     // Catch: Throwable -> L63
        Object oldValue$iv$iv$iv = ThreadContextKt.updateThreadContext(context$iv$iv$iv, countOrElement$iv$iv$iv);     // Catch: Throwable -> L54
        if (oldValue$iv$iv$iv != ThreadContextKt.NO_THREAD_ELEMENTS) goto L82;
        UndispatchedCoroutine<?> r2 = null;
    L35:
        UndispatchedCoroutine<?> r17 = r2;
        this_$iv.continuation.resumeWith(result);     // Catch: Throwable -> L44
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L44
        if (r17 != null) goto L41;
    L42:
        ThreadContextKt.restoreThreadContext(context$iv$iv$iv, oldValue$iv$iv$iv);     // Catch: Throwable -> L61
        goto L59
    L41:
        if (r17.clearThreadContext() == false) goto L59;
    L44:
        th = th;
    L48:
        if (r17 != null) goto L50;
    L51:
        ThreadContextKt.restoreThreadContext(context$iv$iv$iv, oldValue$iv$iv$iv);     // Catch: Throwable -> L61
    L53:
        throw th;     // Catch: Throwable -> L61
    L50:
        if (r17.clearThreadContext() == false) goto L53;
    L46:
        th = th;
        goto L48
    L82:
        r2 = CoroutineContextKt.updateUndispatchedCompletion(r1, context$iv$iv$iv, oldValue$iv$iv$iv);     // Catch: Throwable -> L32
    L32:
        e$iv$iv$iv = th;
    L88:
        $this$runUnconfinedEventLoop$iv$iv$iv.handleFatalException$kotlinx_coroutines_core(e$iv$iv$iv, null);     // Catch: Throwable -> L70
    L67:
        eventLoop$iv$iv.decrementUseCount(true);
        return;
    L70:
        th = move-exception;
        eventLoop$iv$iv.decrementUseCount(true);
        throw th;
    L54:
        e$iv$iv$iv = th;
    L59:
        if (eventLoop$iv$iv.processUnconfinedEvent() == true) goto L59;
    L61:
        e$iv$iv$iv = th;
        goto L88
    L79:
    L20:
        e$iv$iv$iv = th;
        goto L88
    L17:
        if (job$iv$iv.isActive() == true) goto L22;
        CancellationException cause$iv$iv = job$iv$iv.getCancellationException();     // Catch: Throwable -> L20
        this_$iv.cancelCompletedResult$kotlinx_coroutines_core(state$iv, cause$iv$iv);     // Catch: Throwable -> L20
        Result.Companion r16 = Result.Companion;     // Catch: Throwable -> L20
        this_$iv.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(cause$iv$iv)));     // Catch: Throwable -> L20
        r0 = true;
    L63:
        e$iv$iv$iv = th;
        goto L88
    L73:
        r22.resumeWith(result);
    }

    public static final boolean yieldUndispatched(DispatchedContinuation<? super Unit> r12) {
        Object contState$iv = Unit.INSTANCE;
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L5:
        EventLoop eventLoop$iv = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$iv.isUnconfinedQueueEmpty() == false) goto L9;
        return false;
    L9:
        if (eventLoop$iv.isUnconfinedLoopActive() == false) goto L11;
        r12._state = contState$iv;
        r12.resumeMode = 1;
        eventLoop$iv.dispatchUnconfined(r12);
        return true;
    L11:
        DispatchedContinuation<? super Unit> $this$runUnconfinedEventLoop$iv$iv = r12;
        eventLoop$iv.incrementUseCount(true);
        r12.run();     // Catch: Throwable -> L16
    L13:
        if (eventLoop$iv.processUnconfinedEvent() == true) goto L13;
    L19:
        eventLoop$iv.decrementUseCount(true);
        return false;
    L16:
        e$iv$iv = move-exception;
        $this$runUnconfinedEventLoop$iv$iv.handleFatalException$kotlinx_coroutines_core(e$iv$iv, null);     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        eventLoop$iv.decrementUseCount(true);
        throw th;
    }

    static /* synthetic */ boolean executeUnconfined$default(DispatchedContinuation $this$executeUnconfined_u24default, Object contState, int mode, boolean doYield, Function0 block, int r11, Object r12) {
        if ((r11 & 4) == 0) goto L6;
        doYield = false;
    L6:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L8;
    L15:
        EventLoop eventLoop = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (doYield == false) goto L21;
        if (eventLoop.isUnconfinedQueueEmpty() == false) goto L21;
        return false;
    L21:
        if (eventLoop.isUnconfinedLoopActive() == false) goto L23;
        $this$executeUnconfined_u24default._state = contState;
        $this$executeUnconfined_u24default.resumeMode = mode;
        eventLoop.dispatchUnconfined($this$executeUnconfined_u24default);
        return true;
    L23:
        DispatchedContinuation $this$runUnconfinedEventLoop$iv = $this$executeUnconfined_u24default;
        eventLoop.incrementUseCount(true);
        block.invoke();     // Catch: Throwable -> L28
    L25:
        if (eventLoop.processUnconfinedEvent() == true) goto L25;
    L31:
        eventLoop.decrementUseCount(true);
        return false;
    L28:
        e$iv = move-exception;
        $this$runUnconfinedEventLoop$iv.handleFatalException$kotlinx_coroutines_core(e$iv, null);     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        eventLoop.decrementUseCount(true);
        throw th;
    L8:
        if (mode == (-1)) goto L10;
        int r13 = 1;
    L11:
        if (r13 != 0) goto L15;
        throw new AssertionError();
    L10:
        r13 = 0;
        goto L11
    }

    private static final boolean executeUnconfined(DispatchedContinuation<?> r8, Object contState, int mode, boolean doYield, Function0<Unit> r12) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        EventLoop eventLoop = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (doYield == false) goto L18;
        if (eventLoop.isUnconfinedQueueEmpty() == false) goto L18;
        return false;
    L18:
        if (eventLoop.isUnconfinedLoopActive() == false) goto L20;
        r8._state = contState;
        r8.resumeMode = mode;
        eventLoop.dispatchUnconfined(r8);
        return true;
    L20:
        DispatchedContinuation<?> $this$runUnconfinedEventLoop$iv = r8;
        eventLoop.incrementUseCount(true);
        r12.invoke();     // Catch: Throwable -> L25
    L22:
        if (eventLoop.processUnconfinedEvent() == true) goto L22;
    L28:
        eventLoop.decrementUseCount(true);
        return false;
    L25:
        e$iv = move-exception;
        $this$runUnconfinedEventLoop$iv.handleFatalException$kotlinx_coroutines_core(e$iv, null);     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        eventLoop.decrementUseCount(true);
        throw th;
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
}
