package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ConcurrentKt;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J.\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010#*\u00020$2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006%"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "getExecutor", "()Ljava/util/concurrent/Executor;", "cancelJobOnRejection", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "Ljava/util/concurrent/RejectedExecutionException;", "close", "dispatch", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "scheduleBlock", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {
    private final Executor executor;

    public ExecutorCoroutineDispatcherImpl(Executor executor) {
        this.executor = executor;
        ConcurrentKt.removeFutureOnCancel(getExecutor());
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long time, Continuation<? super Unit> r4) {
        return Delay.DefaultImpls.delay(this, time, r4);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this.executor;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo8970dispatch(CoroutineContext context, Runnable block) {
        Executor r0 = getExecutor();     // Catch: RejectedExecutionException -> L9
        AbstractTimeSource r1 = AbstractTimeSourceKt.access$getTimeSource$p();     // Catch: RejectedExecutionException -> L9
        if (r1 == null) goto L6;
        Runnable r2 = r1.wrapTask(block);     // Catch: RejectedExecutionException -> L9
        if (r2 == null) goto L6;
    L7:
        r0.execute(r2);     // Catch: RejectedExecutionException -> L9
        return;
    L6:
        r2 = block;
    L9:
        e = move-exception;
        AbstractTimeSource r3 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r3 == null) goto L13;
        r3.unTrackTask();
    L13:
        cancelJobOnRejection(context, e);
        Dispatchers.getIO().mo8970dispatch(context, block);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo8971scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super Unit> r12) {
        Executor r0 = getExecutor();
        ScheduledFuture<?> r2 = null;
        if ((r0 instanceof ScheduledExecutorService) == false) goto L5;
        ScheduledExecutorService r4 = (ScheduledExecutorService) r0;
    L6:
        if (r4 == null) goto L8;
        long timeMillis2 = timeMillis;
        r2 = scheduleBlock(r4, new ResumeUndispatchedRunnable(this, r12), r12.getContext(), timeMillis2);
    L9:
        if (r2 == null) goto L12;
        JobKt.cancelFutureOnCancellation(r12, r2);
        return;
    L12:
        DefaultExecutor.INSTANCE.mo8971scheduleResumeAfterDelay(timeMillis2, r12);
        return;
    L8:
        timeMillis2 = timeMillis;
        goto L9
    L5:
        r4 = null;
        goto L6
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long timeMillis, Runnable block, CoroutineContext context) {
        Executor r0 = getExecutor();
        ScheduledFuture<?> r2 = null;
        if ((r0 instanceof ScheduledExecutorService) == false) goto L5;
        ScheduledExecutorService r4 = (ScheduledExecutorService) r0;
    L6:
        if (r4 == null) goto L8;
        long timeMillis2 = timeMillis;
        Runnable block2 = block;
        CoroutineContext context2 = context;
        r2 = scheduleBlock(r4, block2, context2, timeMillis2);
    L10:
        if (r2 == null) goto L13;
        return new DisposableFutureHandle(r2);
    L13:
        return DefaultExecutor.INSTANCE.invokeOnTimeout(timeMillis2, block2, context2);
    L8:
        timeMillis2 = timeMillis;
        block2 = block;
        context2 = context;
        goto L10
    L5:
        r4 = null;
        goto L6
    }

    private final ScheduledFuture<?> scheduleBlock(ScheduledExecutorService $this$scheduleBlock, Runnable block, CoroutineContext context, long timeMillis) {
        return $this$scheduleBlock.schedule(block, timeMillis, TimeUnit.MILLISECONDS);
    L4:
        e = move-exception;
        cancelJobOnRejection(context, e);
        return null;
    }

    private final void cancelJobOnRejection(CoroutineContext context, RejectedExecutionException exception) {
        JobKt.cancel(context, ExceptionsKt.CancellationException("The task was rejected", exception));
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor r0 = getExecutor();
        if ((r0 instanceof ExecutorService) == false) goto L5;
        ExecutorService r1 = (ExecutorService) r0;
    L6:
        if (r1 == null) goto L9;
        r1.shutdown();
        return;
    L9:
        return;
    L5:
        r1 = null;
        goto L6
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return getExecutor().toString();
    }

    public boolean equals(Object other) {
        if ((other instanceof ExecutorCoroutineDispatcherImpl) == true) goto L5;
    L7:
        return false;
    L5:
        if (((ExecutorCoroutineDispatcherImpl) other).getExecutor() != getExecutor()) goto L7;
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }
}
