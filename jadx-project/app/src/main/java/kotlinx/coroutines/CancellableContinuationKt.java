package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000\u001a0\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086H¢\u0006\u0002\u0010\n\u001a0\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0001\u0012\u0004\u0012\u00020\t0\u0007H\u0080H¢\u0006\u0002\u0010\n\u001a\u0018\u0010\f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a \u0010\u000f\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¨\u0006\u0012"}, d2 = {"getOrCreateCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "delegate", "Lkotlin/coroutines/Continuation;", "suspendCancellableCoroutine", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendCancellableCoroutineReusable", "disposeOnCancellation", "handle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "handler", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CancellableContinuationKt {
    public static final <T> void invokeOnCancellation(CancellableContinuation<? super T> r2, CancelHandler handler) {
        if ((r2 instanceof CancellableContinuationImpl) == false) goto L7;
        ((CancellableContinuationImpl) r2).invokeOnCancellationInternal$kotlinx_coroutines_core(handler);
        return;
    L7:
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }

    public static final <T> Object suspendCancellableCoroutine(Function1<? super CancellableContinuation<? super T>, Unit> r6, Continuation<? super T> r7) {
        CancellableContinuationImpl cancellable = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r7), 1);
        cancellable.initCancellability();
        r6.invoke(cancellable);
        Object r1 = cancellable.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L5;
        DebugProbesKt.probeCoroutineSuspended(r7);
    L5:
        return r1;
    }

    private static final <T> Object suspendCancellableCoroutine$$forInline(Function1<? super CancellableContinuation<? super T>, Unit> r6, Continuation<? super T> r7) {
        CancellableContinuationImpl cancellable = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r7), 1);
        cancellable.initCancellability();
        r6.invoke(cancellable);
        Object r4 = cancellable.getResult();
        if (r4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L5;
        DebugProbesKt.probeCoroutineSuspended(r7);
    L5:
        return r4;
    }

    public static final <T> Object suspendCancellableCoroutineReusable(Function1<? super CancellableContinuationImpl<? super T>, Unit> r5, Continuation<? super T> r6) {
        CancellableContinuationImpl cancellable = getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(r6));
        r5.invoke(cancellable);     // Catch: Throwable -> L8
        Object r1 = cancellable.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L7;
        DebugProbesKt.probeCoroutineSuspended(r6);
    L7:
        return r1;
    L8:
        e = move-exception;
        cancellable.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        throw e;
    }

    private static final <T> Object suspendCancellableCoroutineReusable$$forInline(Function1<? super CancellableContinuationImpl<? super T>, Unit> r5, Continuation<? super T> r6) {
        CancellableContinuationImpl cancellable = getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(r6));
        r5.invoke(cancellable);     // Catch: Throwable -> L8
        Object r4 = cancellable.getResult();
        if (r4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L7;
        DebugProbesKt.probeCoroutineSuspended(r6);
    L7:
        return r4;
    L8:
        e = move-exception;
        cancellable.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        throw e;
    }

    public static final <T> CancellableContinuationImpl<T> getOrCreateCancellableContinuation(Continuation<? super T> r3) {
        if ((r3 instanceof DispatchedContinuation) == false) goto L5;
        CancellableContinuationImpl<T> r0 = ((DispatchedContinuation) r3).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (r0 == null) goto L16;
        if (r0.resetStateReusable() == true) goto L12;
        r0 = null;
    L12:
        if (r0 == null) goto L16;
        return r0;
    L16:
        return new CancellableContinuationImpl(r3, 2);
    L5:
        return new CancellableContinuationImpl(r3, 1);
    }

    public static final void disposeOnCancellation(CancellableContinuation<?> r1, DisposableHandle handle) {
        invokeOnCancellation(r1, new DisposeOnCancel(handle));
    }
}
