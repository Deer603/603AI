package kotlinx.coroutines.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a\u001e\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086@¢\u0006\u0002\u0010\t\u001aX\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\u0010\u0015\u001a\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¨\u0006\u0017"}, d2 = {"asCompletableFuture", "Ljava/util/concurrent/CompletableFuture;", "T", "Lkotlinx/coroutines/Deferred;", "", "Lkotlinx/coroutines/Job;", "asDeferred", "Ljava/util/concurrent/CompletionStage;", "await", "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "future", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ljava/util/concurrent/CompletableFuture;", "setupCancellation", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FutureKt {
    public static /* synthetic */ CompletableFuture future$default(CoroutineScope r0, EmptyCoroutineContext r1, CoroutineStart r2, Function2 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = EmptyCoroutineContext.INSTANCE;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = CoroutineStart.DEFAULT;
    L9:
        return future(r0, r1, r2, r3);
    }

    public static final <T> CompletableFuture<T> future(CoroutineScope $this$future, CoroutineContext context, CoroutineStart start, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> r7) {
        if (start.isLazy() == true) goto L7;
        CoroutineContext newContext = CoroutineContextKt.newCoroutineContext($this$future, context);
        CompletableFuture<T> r1 = new CompletableFuture();
        CompletableFutureCoroutine coroutine = new CompletableFutureCoroutine(newContext, r1);
        r1.handle(coroutine);
        coroutine.start(start, coroutine, r7);
        return r1;
    L7:
        throw new IllegalArgumentException((start + " start is not supported").toString());
    }

    public static final <T> CompletableFuture<T> asCompletableFuture(final Deferred<? extends T> r2) {
        final CompletableFuture<T> r0 = new CompletableFuture();
        setupCancellation(r2, r0);
        r2.invokeOnCompletion(new AnonymousClass1(r0, r2));
        return r0;
    }

    public static final CompletableFuture<Unit> asCompletableFuture(Job $this$asCompletableFuture) {
        final CompletableFuture<Unit> r0 = new CompletableFuture();
        setupCancellation($this$asCompletableFuture, r0);
        $this$asCompletableFuture.invokeOnCompletion(new AnonymousClass2(r0));
        return r0;
    }

    private static final void setupCancellation(final Job $this$setupCancellation, CompletableFuture<?> r2) {
        r2.handle(new FutureKt$$ExternalSyntheticLambda1($this$setupCancellation));
    }

    static final Unit setupCancellation$lambda$2(Job $this_setupCancellation, Object r4, Throwable exception) {
        CancellationException r5 = null;
        if (exception != null) goto L5;
    L9:
        $this_setupCancellation.cancel(r5);
        return Unit.INSTANCE;
    L5:
        if ((exception instanceof CancellationException) == false) goto L7;
        r5 = (CancellationException) exception;
    L7:
        if (r5 != null) goto L9;
        r5 = ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", exception);
        goto L9
    }

    public static final <T> Deferred<T> asDeferred(CompletionStage<T> r6) {
        CompletableFuture<T> r0 = r6.toCompletableFuture();
        if (r0.isDone() == true) goto L19;
        final CompletableDeferred result = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        final Function2<T, Throwable, Object> r2 = new C07752(result);
        r6.handle(new FutureKt$$ExternalSyntheticLambda0(r2));
        JobKt.cancelFutureOnCompletion(result, r0);
        return result;
    L19:
        return CompletableDeferredKt.CompletableDeferred(r0.get());
    L6:
        e = move-exception;
        if ((e instanceof ExecutionException) == false) goto L10;
        ExecutionException r4 = (ExecutionException) e;
    L11:
        if (r4 == null) goto L14;
        Throwable original = r4.getCause();
        if (original == null) goto L14;
    L15:
        CompletableDeferred it = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        it.completeExceptionally(original);
        return it;
    L14:
        original = e;
        goto L15
    L10:
        r4 = null;
        goto L11
    }

    static final Object asDeferred$lambda$4(Function2 $tmp0, Object p0, Throwable p1) {
        return $tmp0.invoke(p0, p1);
    }

    public static final <T> Object await(CompletionStage<T> r9, Continuation<? super T> r10) {
        final CompletableFuture<T> r0 = r9.toCompletableFuture();
        if (r0.isDone() == true) goto L16;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r10), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl cont = cancellable$iv;
        final ContinuationHandler consumer = new ContinuationHandler(cont);
        r9.handle(consumer);
        cont.invokeOnCancellation(new FutureKt$await$2$1(r0, consumer));
        Object r2 = cancellable$iv.getResult();
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L15;
        DebugProbesKt.probeCoroutineSuspended(r10);
    L15:
        return r2;
    L16:
        return r0.get();
    L6:
        e = move-exception;
        Throwable r3 = e.getCause();
        if (r3 == null) goto L10;
        throw r3;
    L10:
        throw e;
    }
}
