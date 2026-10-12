package kotlinx.coroutines;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001aF\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nH\u0000¢\u0006\u0002\u0010\u0010\u001a+\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"recoverResult", "Lkotlin/Result;", "T", "state", "", "uCont", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toState", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cause", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "caller", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CompletionStateKt {
    public static /* synthetic */ Object toState$default(Object r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return toState(r0, r1);
    }

    public static final <T> Object toState(Object $this$toState, Function1<? super Throwable, Unit> r7) {
        Throwable it = Result.m7428exceptionOrNullimpl($this$toState);
        if (it != null) goto L9;
        if (r7 != null) goto L10;
        return $this$toState;
    L10:
        return new CompletedWithCancellation($this$toState, r7);
    L9:
        return new CompletedExceptionally(it, false, 2, null);
    }

    public static final <T> Object toState(Object $this$toState, CancellableContinuation<?> r8) {
        Throwable it = Result.m7428exceptionOrNullimpl($this$toState);
        if (it != null) goto L6;
        return $this$toState;
    L6:
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L8;
    L11:
        Throwable r4 = it;
    L13:
        return new CompletedExceptionally(r4, false, 2, null);
    L8:
        if ((r8 instanceof CoroutineStackFrame) == false) goto L11;
        r4 = StackTraceRecoveryKt.access$recoverFromStackFrame(it, (CoroutineStackFrame) r8);
        goto L13
    }

    public static final <T> Object recoverResult(Object state, Continuation<? super T> r4) {
        if ((state instanceof CompletedExceptionally) == false) goto L11;
        Result.Companion r0 = Result.Companion;
        Throwable exception$iv = ((CompletedExceptionally) state).cause;
        if (DebugKt.getRECOVER_STACK_TRACES() == false) goto L13;
        if ((r4 instanceof CoroutineStackFrame) == false) goto L13;
        exception$iv = StackTraceRecoveryKt.access$recoverFromStackFrame(exception$iv, (CoroutineStackFrame) r4);
    L13:
        return Result.m7425constructorimpl(ResultKt.createFailure(exception$iv));
    L11:
        Result.Companion r1 = Result.Companion;
        return Result.m7425constructorimpl(state);
    }
}
