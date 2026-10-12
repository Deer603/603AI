package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0082\b\u001aO\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n2\u0006\u0010\u000b\u001a\u0002H\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¢\u0006\u0002\u0010\u000e\u001aV\u0010\u000f\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\u000b\u001a\u0002H\t2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\u0002\b\u0011H\u0000¢\u0006\u0002\u0010\u0012\u001aV\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\u000b\u001a\u0002H\t2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\u0002\b\u0011H\u0000¢\u0006\u0002\u0010\u0012\u001a?\u0010\u0014\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0082\b¨\u0006\u001a"}, d2 = {"startDirect", "", "T", "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function1;", "", "startCoroutineUndispatched", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "startCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "startUndispatchedOrReturn", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "undispatchedResult", "shouldThrow", "", "", "startBlock", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UndispatchedKt {
    public static final <T> void startCoroutineUnintercepted(Function1<? super Continuation<? super T>, ? extends Object> r5, Continuation<? super T> r6) {
        Continuation actualCompletion$iv = DebugProbesKt.probeCoroutineCreated(r6);
    L11:
        e$iv = move-exception;
        Result.Companion r3 = Result.Companion;
        actualCompletion$iv.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(e$iv)));
        return;
    L4:
        if ((r5 instanceof BaseContinuationImpl) == true) goto L6;
        Object value$iv = IntrinsicsKt.wrapWithContinuationImpl(r5, actualCompletion$iv);     // Catch: Throwable -> L11
    L8:
        if (value$iv == IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L16;
        Result.Companion r2 = Result.Companion;
        actualCompletion$iv.resumeWith(Result.m7425constructorimpl(value$iv));
        return;
    L16:
        return;
    L6:
        value$iv = ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r5, 1)).invoke(actualCompletion$iv);     // Catch: Throwable -> L11
        goto L8
    }

    public static final <R, T> void startCoroutineUndispatched(Function2<? super R, ? super Continuation<? super T>, ? extends Object> r10, R r11, Continuation<? super T> r12) {
        Continuation actualCompletion$iv = DebugProbesKt.probeCoroutineCreated(r12);
        CoroutineContext context$iv = r12.getContext();     // Catch: Throwable -> L18
        Object oldValue$iv = ThreadContextKt.updateThreadContext(context$iv, null);     // Catch: Throwable -> L18
    L15:
        th = move-exception;
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);     // Catch: Throwable -> L18
        throw th;     // Catch: Throwable -> L18
    L6:
        if ((r10 instanceof BaseContinuationImpl) == true) goto L8;
        Object value$iv = IntrinsicsKt.wrapWithContinuationImpl(r10, r11, actualCompletion$iv);     // Catch: Throwable -> L15
    L10:
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);     // Catch: Throwable -> L18
        if (value$iv == IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L24;
        Result.Companion r2 = Result.Companion;
        actualCompletion$iv.resumeWith(Result.m7425constructorimpl(value$iv));
        return;
    L24:
        return;
    L8:
        value$iv = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, 2)).invoke(r11, actualCompletion$iv);     // Catch: Throwable -> L15
    L18:
        e$iv = move-exception;
        Result.Companion r3 = Result.Companion;
        actualCompletion$iv.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(e$iv)));
    }

    private static final <T> void startDirect(Continuation<? super T> r4, Function1<? super Continuation<? super T>, ? extends Object> r5) {
        Continuation actualCompletion = DebugProbesKt.probeCoroutineCreated(r4);
        Object value = r5.invoke(actualCompletion);     // Catch: Throwable -> L8
        if (value == IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        Result.Companion r3 = Result.Companion;
        actualCompletion.resumeWith(Result.m7425constructorimpl(value));
        return;
    L13:
        return;
    L8:
        e = move-exception;
        Result.Companion r6 = Result.Companion;
        actualCompletion.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(e)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final <T, R> Object startUndispatchedOrReturn(ScopeCoroutine<? super T> r8, R r9, Function2<? super R, ? super Continuation<? super T>, ? extends Object> r10) {
        ?? r3 = 2;
    L8:
        th = move-exception;
        r3 = new CompletedExceptionally(th, false, r3, null);
    L11:
        if (r3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L32;
        Object r2 = r8.makeCompletingOnce$kotlinx_coroutines_core(r3);
        if (r2 != JobSupportKt.COMPLETING_WAITING_CHILDREN) goto L17;
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    L17:
        if ((r2 instanceof CompletedExceptionally) == false) goto L26;
        Throwable r4 = ((CompletedExceptionally) r2).cause;
        Throwable r5 = ((CompletedExceptionally) r2).cause;
        Continuation<? super T> r6 = r8.uCont;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L21;
        throw r5;
    L21:
        if ((r6 instanceof CoroutineStackFrame) == true) goto L24;
        throw r5;
    L24:
        throw StackTraceRecoveryKt.access$recoverFromStackFrame(r5, (CoroutineStackFrame) r6);
    L26:
        return JobSupportKt.unboxState(r2);
    L32:
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    L4:
        if ((r10 instanceof BaseContinuationImpl) == true) goto L6;
        r3 = IntrinsicsKt.wrapWithContinuationImpl(r10, r9, r8);     // Catch: Throwable -> L8
    L27:
        goto L11
    L6:
        r3 = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, 2)).invoke(r9, r8);     // Catch: Throwable -> L8
        goto L27
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(ScopeCoroutine<? super T> r8, R r9, Function2<? super R, ? super Continuation<? super T>, ? extends Object> r10) {
        ?? r3 = 2;
        boolean r4 = false;
    L8:
        th = move-exception;
        r3 = new CompletedExceptionally(th, false, r3, null);
    L11:
        if (r3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L51;
        Object r2 = r8.makeCompletingOnce$kotlinx_coroutines_core(r3);
        if (r2 != JobSupportKt.COMPLETING_WAITING_CHILDREN) goto L17;
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    L17:
        if ((r2 instanceof CompletedExceptionally) == false) goto L41;
        Throwable r5 = ((CompletedExceptionally) r2).cause;
        if ((r5 instanceof TimeoutCancellationException) == true) goto L21;
    L22:
        r4 = true;
    L23:
        if (r4 == false) goto L32;
        Throwable r6 = ((CompletedExceptionally) r2).cause;
        Continuation<? super T> r7 = r8.uCont;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L27;
        throw r6;
    L27:
        if ((r7 instanceof CoroutineStackFrame) == true) goto L30;
        throw r6;
    L30:
        throw StackTraceRecoveryKt.access$recoverFromStackFrame(r6, (CoroutineStackFrame) r7);
    L32:
        if ((r3 instanceof CompletedExceptionally) == false) goto L40;
        Throwable r11 = ((CompletedExceptionally) r3).cause;
        Continuation<? super T> r12 = r8.uCont;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L36;
        throw r11;
    L36:
        if ((r12 instanceof CoroutineStackFrame) == true) goto L39;
        throw r11;
    L39:
        throw StackTraceRecoveryKt.access$recoverFromStackFrame(r11, (CoroutineStackFrame) r12);
    L40:
        ?? r13 = r3;
    L43:
        return r13;
    L21:
        if (((TimeoutCancellationException) r5).coroutine == r8) goto L23;
    L41:
        r13 = JobSupportKt.unboxState(r2);
        goto L43
    L51:
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    L4:
        if ((r10 instanceof BaseContinuationImpl) == true) goto L6;
        r3 = IntrinsicsKt.wrapWithContinuationImpl(r10, r9, r8);     // Catch: Throwable -> L8
    L44:
        goto L11
    L6:
        r3 = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, 2)).invoke(r9, r8);     // Catch: Throwable -> L8
        goto L44
    }

    private static final <T> Object undispatchedResult(ScopeCoroutine<? super T> r7, Function1<? super Throwable, Boolean> r8, Function0<? extends Object> r9) {
        Object result = r9.invoke();     // Catch: Throwable -> L5
    L8:
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        Object state = r7.makeCompletingOnce$kotlinx_coroutines_core(result);
        if (state != JobSupportKt.COMPLETING_WAITING_CHILDREN) goto L16;
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    L16:
        if ((state instanceof CompletedExceptionally) == false) goto L37;
        if (r8.invoke(((CompletedExceptionally) state).cause).booleanValue() == false) goto L27;
        Throwable exception$iv = ((CompletedExceptionally) state).cause;
        Continuation<? super T> r4 = r7.uCont;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L22;
        throw exception$iv;
    L22:
        if ((r4 instanceof CoroutineStackFrame) == true) goto L25;
        throw exception$iv;
    L25:
        throw StackTraceRecoveryKt.access$recoverFromStackFrame(exception$iv, (CoroutineStackFrame) r4);
    L27:
        if ((result instanceof CompletedExceptionally) == false) goto L44;
        Throwable exception$iv2 = ((CompletedExceptionally) result).cause;
        Continuation<? super T> r5 = r7.uCont;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L31;
        throw exception$iv2;
    L31:
        if ((r5 instanceof CoroutineStackFrame) == true) goto L34;
        throw exception$iv2;
    L34:
        throw StackTraceRecoveryKt.access$recoverFromStackFrame(exception$iv2, (CoroutineStackFrame) r5);
    L44:
        return result;
    L37:
        return JobSupportKt.unboxState(state);
    L10:
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    L5:
        e = move-exception;
        result = new CompletedExceptionally(e, false, 2, null);
        goto L8
    }
}
