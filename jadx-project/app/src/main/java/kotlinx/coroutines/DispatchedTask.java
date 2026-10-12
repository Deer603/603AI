package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\fJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001eR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "handleFatalException$kotlinx_coroutines_core", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DispatchedTask<T> extends Task {
    public int resumeMode;

    public abstract Continuation<T> getDelegate$kotlinx_coroutines_core();

    public abstract Object takeState$kotlinx_coroutines_core();

    public DispatchedTask(int resumeMode) {
        this.resumeMode = resumeMode;
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(Object takenState, Throwable cause) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object r1) {
        return r1;
    }

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object state) {
        if ((state instanceof CompletedExceptionally) == false) goto L5;
        CompletedExceptionally r0 = (CompletedExceptionally) state;
    L6:
        if (r0 != null) goto L8;
        return null;
    L8:
        return r0.cause;
    L5:
        r0 = null;
        goto L6
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        TaskContext taskContext = this.taskContext;
        Throwable fatalException = null;
        Continuation<T> r0 = getDelegate$kotlinx_coroutines_core();     // Catch: Throwable -> L73
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");     // Catch: Throwable -> L73
        DispatchedContinuation delegate = (DispatchedContinuation) r0;     // Catch: Throwable -> L73
        Continuation<T> r1 = delegate.continuation;     // Catch: Throwable -> L73
        Object countOrElement$iv = delegate.countOrElement;     // Catch: Throwable -> L73
        CoroutineContext context$iv = r1.getContext();     // Catch: Throwable -> L73
        Object oldValue$iv = ThreadContextKt.updateThreadContext(context$iv, countOrElement$iv);     // Catch: Throwable -> L73
        Job job = null;
        if (oldValue$iv != ThreadContextKt.NO_THREAD_ELEMENTS) goto L86;
        UndispatchedCoroutine<?> r2 = null;
    L21:
        UndispatchedCoroutine<?> r11 = r2;
        CoroutineContext context = r1.getContext();     // Catch: Throwable -> L63
        Object state = takeState$kotlinx_coroutines_core();     // Catch: Throwable -> L63
        Throwable exception = getExceptionalResult$kotlinx_coroutines_core(state);     // Catch: Throwable -> L63
        if (exception == null) goto L97;
    L90:
        if (job != null) goto L32;
    L47:
        TaskContext taskContext2 = taskContext;
        if (exception == null) goto L50;
        Result.Companion r3 = Result.Companion;     // Catch: Throwable -> L61
        r1.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(exception)));     // Catch: Throwable -> L61
    L51:
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L61
        if (r11 != null) goto L54;
    L55:
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);     // Catch: Throwable -> L71
    L88:
        Result.Companion r5 = Result.Companion;     // Catch: Throwable -> L59
        DispatchedTask<T> r6 = this;     // Catch: Throwable -> L59
        taskContext2.afterTask();     // Catch: Throwable -> L59
        Object result = Result.m7425constructorimpl(Unit.INSTANCE);     // Catch: Throwable -> L59
    L80:
        handleFatalException$kotlinx_coroutines_core(fatalException, Result.m7428exceptionOrNullimpl(result));
        return;
    L59:
        th = th;
    L79:
        Result.Companion r7 = Result.Companion;
        result = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L80
    L54:
        if (r11.clearThreadContext() == false) goto L88;
    L50:
        Result.Companion r8 = Result.Companion;     // Catch: Throwable -> L61
        r1.resumeWith(Result.m7425constructorimpl(getSuccessfulResult$kotlinx_coroutines_core(state)));     // Catch: Throwable -> L61
        goto L51
    L32:
        if (job.isActive() == true) goto L47;
        CancellationException cause = job.getCancellationException();     // Catch: Throwable -> L63
        cancelCompletedResult$kotlinx_coroutines_core(state, cause);     // Catch: Throwable -> L63
        Result.Companion r18 = Result.Companion;     // Catch: Throwable -> L63
        if (DebugKt.getRECOVER_STACK_TRACES() == false) goto L44;
        taskContext2 = taskContext;
    L42:
        th = th;
    L65:
        if (r11 != null) goto L67;
    L68:
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);     // Catch: Throwable -> L71
    L70:
        throw th;     // Catch: Throwable -> L71
    L67:
        if (r11.clearThreadContext() == false) goto L70;
    L37:
        if ((r1 instanceof CoroutineStackFrame) == false) goto L45;
        CancellationException r9 = StackTraceRecoveryKt.access$recoverFromStackFrame(cause, (CoroutineStackFrame) r1);     // Catch: Throwable -> L61
    L46:
        r1.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(r9)));     // Catch: Throwable -> L61
    L45:
        r9 = cause;     // Catch: Throwable -> L61
        goto L46
    L44:
        taskContext2 = taskContext;
    L61:
        th = th;
        goto L65
    L97:
    L28:
        th = th;
        goto L65
    L25:
        if (DispatchedTaskKt.isCancellableMode(this.resumeMode) == false) goto L90;
        job = (Job) context.get(Job.Key);     // Catch: Throwable -> L28
    L63:
        th = th;
    L71:
        e = th;
    L75:
        fatalException = e;
        Result.Companion r10 = Result.Companion;     // Catch: Throwable -> L78
        taskContext.afterTask();     // Catch: Throwable -> L78
        result = Result.m7425constructorimpl(Unit.INSTANCE);     // Catch: Throwable -> L78
    L78:
        th = th;
        goto L79
    L86:
        r2 = CoroutineContextKt.updateUndispatchedCompletion(r1, context$iv, oldValue$iv);     // Catch: Throwable -> L18
    L18:
        e = th;
    L73:
        e = th;
        goto L75
    L5:
        if (this.resumeMode == (-1)) goto L7;
        boolean r12 = true;
    L8:
        if (r12 == true) goto L12;
        throw new AssertionError();
    L7:
        r12 = false;
        goto L8
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable exception, Throwable finallyException) {
        if (exception != null) goto L5;
        if (finallyException != null) goto L5;
        return;
    L5:
        if (exception == null) goto L8;
        if (finallyException == null) goto L8;
        kotlin.ExceptionsKt.addSuppressed(exception, finallyException);
    L8:
        if (exception != null) goto L10;
        Throwable cause = finallyException;
    L11:
        Intrinsics.checkNotNull(cause);
        CoroutinesInternalError reason = new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", cause);
        CoroutineExceptionHandlerKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), reason);
        return;
    L10:
        cause = exception;
        goto L11
    }
}
