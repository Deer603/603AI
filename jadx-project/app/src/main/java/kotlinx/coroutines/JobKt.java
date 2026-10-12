package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class JobKt {
    public static final CompletableJob Job(Job parent) {
        return JobKt__JobKt.Job(parent);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ Job m8907Job(Job parent) {
        return JobKt__JobKt.m8909Job(parent);
    }

    public static /* synthetic */ CompletableJob Job$default(Job r0, int r1, Object r2) {
        return JobKt__JobKt.Job$default(r0, r1, r2);
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ Job m8908Job$default(Job r0, int r1, Object r2) {
        return JobKt__JobKt.m8910Job$default(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancel(CoroutineContext $this$cancel) {
        JobKt__JobKt.cancel($this$cancel);
    }

    public static final void cancel(CoroutineContext $this$cancel, CancellationException cause) {
        JobKt__JobKt.cancel($this$cancel, cause);
    }

    public static final void cancel(Job $this$cancel, String message, Throwable cause) {
        JobKt__JobKt.cancel($this$cancel, message, cause);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean cancel(CoroutineContext $this$cancel, Throwable cause) {
        return JobKt__JobKt.cancel($this$cancel, cause);
    }

    public static /* synthetic */ void cancel$default(CoroutineContext r0, CancellationException r1, int r2, Object r3) {
        JobKt__JobKt.cancel$default(r0, r1, r2, r3);
    }

    public static /* synthetic */ void cancel$default(Job r0, String r1, Throwable r2, int r3, Object r4) {
        JobKt__JobKt.cancel$default(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ boolean cancel$default(CoroutineContext r0, Throwable r1, int r2, Object r3) {
        return JobKt__JobKt.cancel$default(r0, r1, r2, r3);
    }

    public static final Object cancelAndJoin(Job $this$cancelAndJoin, Continuation<? super Unit> r2) {
        return JobKt__JobKt.cancelAndJoin($this$cancelAndJoin, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(CoroutineContext $this$cancelChildren) {
        JobKt__JobKt.cancelChildren($this$cancelChildren);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(CoroutineContext $this$cancelChildren, Throwable cause) {
        JobKt__JobKt.cancelChildren($this$cancelChildren, cause);
    }

    public static final void cancelChildren(CoroutineContext $this$cancelChildren, CancellationException cause) {
        JobKt__JobKt.cancelChildren($this$cancelChildren, cause);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(Job $this$cancelChildren) {
        JobKt__JobKt.cancelChildren($this$cancelChildren);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(Job $this$cancelChildren, Throwable cause) {
        JobKt__JobKt.cancelChildren($this$cancelChildren, cause);
    }

    public static final void cancelChildren(Job $this$cancelChildren, CancellationException cause) {
        JobKt__JobKt.cancelChildren($this$cancelChildren, cause);
    }

    public static /* synthetic */ void cancelChildren$default(CoroutineContext r0, Throwable r1, int r2, Object r3) {
        JobKt__JobKt.cancelChildren$default(r0, r1, r2, r3);
    }

    public static /* synthetic */ void cancelChildren$default(CoroutineContext r0, CancellationException r1, int r2, Object r3) {
        JobKt__JobKt.cancelChildren$default(r0, r1, r2, r3);
    }

    public static /* synthetic */ void cancelChildren$default(Job r0, Throwable r1, int r2, Object r3) {
        JobKt__JobKt.cancelChildren$default(r0, r1, r2, r3);
    }

    public static /* synthetic */ void cancelChildren$default(Job r0, CancellationException r1, int r2, Object r3) {
        JobKt__JobKt.cancelChildren$default(r0, r1, r2, r3);
    }

    public static final void cancelFutureOnCancellation(CancellableContinuation<?> r0, Future<?> r1) {
        JobKt__FutureKt.cancelFutureOnCancellation(r0, r1);
    }

    public static final DisposableHandle cancelFutureOnCompletion(Job $this$cancelFutureOnCompletion, Future<?> r2) {
        return JobKt__FutureKt.cancelFutureOnCompletion($this$cancelFutureOnCompletion, r2);
    }

    public static final DisposableHandle disposeOnCompletion(Job $this$disposeOnCompletion, DisposableHandle handle) {
        return JobKt__JobKt.disposeOnCompletion($this$disposeOnCompletion, handle);
    }

    public static final void ensureActive(CoroutineContext $this$ensureActive) {
        JobKt__JobKt.ensureActive($this$ensureActive);
    }

    public static final void ensureActive(Job $this$ensureActive) {
        JobKt__JobKt.ensureActive($this$ensureActive);
    }

    public static final Job getJob(CoroutineContext $this$job) {
        return JobKt__JobKt.getJob($this$job);
    }

    public static final DisposableHandle invokeOnCompletion(Job $this$invokeOnCompletion, boolean onCancelling, boolean invokeImmediately, InternalCompletionHandler handler) {
        return JobKt__JobKt.invokeOnCompletion($this$invokeOnCompletion, onCancelling, invokeImmediately, handler);
    }

    public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job r0, boolean r1, boolean r2, InternalCompletionHandler r3, int r4, Object r5) {
        return JobKt__JobKt.invokeOnCompletion$default(r0, r1, r2, r3, r4, r5);
    }

    public static final boolean isActive(CoroutineContext $this$isActive) {
        return JobKt__JobKt.isActive($this$isActive);
    }
}
