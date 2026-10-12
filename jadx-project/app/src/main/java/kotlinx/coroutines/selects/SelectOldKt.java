package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: SelectOld.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0081H¢\u0006\u0002\u0010\u0007\u001a5\u0010\b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0081H¢\u0006\u0002\u0010\u0007\u001a%\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0002¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u000e\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"selectOld", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectUnbiasedOld", "resumeUndispatched", "T", "Lkotlinx/coroutines/CancellableContinuation;", "result", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectOldKt {
    public static final /* synthetic */ void access$resumeUndispatched(CancellableContinuation $receiver, Object result) {
        resumeUndispatched($receiver, result);
    }

    public static final /* synthetic */ void access$resumeUndispatchedWithException(CancellableContinuation $receiver, Throwable exception) {
        resumeUndispatchedWithException($receiver, exception);
    }

    public static final <R> Object selectOld(Function1<? super SelectBuilder<? super R>, Unit> r5, Continuation<? super R> r6) {
        SelectBuilderImpl scope = new SelectBuilderImpl(r6);
        r5.invoke(scope);     // Catch: Throwable -> L5
    L7:
        Object r1 = scope.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(r6);
    L10:
        return r1;
    L5:
        e = move-exception;
        scope.handleBuilderException(e);
        goto L7
    }

    private static final <R> Object selectOld$$forInline(Function1<? super SelectBuilder<? super R>, Unit> r5, Continuation<? super R> r6) {
        SelectBuilderImpl scope = new SelectBuilderImpl(r6);
        r5.invoke(scope);     // Catch: Throwable -> L5
    L7:
        Object r4 = scope.getResult();
        if (r4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(r6);
    L10:
        return r4;
    L5:
        e = move-exception;
        scope.handleBuilderException(e);
        goto L7
    }

    public static final <R> Object selectUnbiasedOld(Function1<? super SelectBuilder<? super R>, Unit> r5, Continuation<? super R> r6) {
        UnbiasedSelectBuilderImpl scope = new UnbiasedSelectBuilderImpl(r6);
        r5.invoke(scope);     // Catch: Throwable -> L5
    L7:
        Object r1 = scope.initSelectResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(r6);
    L10:
        return r1;
    L5:
        e = move-exception;
        scope.handleBuilderException(e);
        goto L7
    }

    private static final <R> Object selectUnbiasedOld$$forInline(Function1<? super SelectBuilder<? super R>, Unit> r5, Continuation<? super R> r6) {
        UnbiasedSelectBuilderImpl scope = new UnbiasedSelectBuilderImpl(r6);
        r5.invoke(scope);     // Catch: Throwable -> L5
    L7:
        Object r4 = scope.initSelectResult();
        if (r4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(r6);
    L10:
        return r4;
    L5:
        e = move-exception;
        scope.handleBuilderException(e);
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void resumeUndispatched(CancellableContinuation<? super T> r3, T r4) {
        CoroutineDispatcher dispatcher = (CoroutineDispatcher) r3.getContext().get(CoroutineDispatcher.Key);
        if (dispatcher == null) goto L5;
        r3.resumeUndispatched(dispatcher, r4);
        return;
    L5:
        Result.Companion r2 = Result.Companion;
        r3.resumeWith(Result.m7425constructorimpl(r4));
    }

    private static final void resumeUndispatchedWithException(CancellableContinuation<?> r3, Throwable exception) {
        CoroutineDispatcher dispatcher = (CoroutineDispatcher) r3.getContext().get(CoroutineDispatcher.Key);
        if (dispatcher == null) goto L5;
        r3.resumeUndispatchedWithException(dispatcher, exception);
        return;
    L5:
        Result.Companion r2 = Result.Companion;
        r3.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(exception)));
    }
}
