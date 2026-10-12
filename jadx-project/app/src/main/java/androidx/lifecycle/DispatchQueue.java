package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: DispatchQueue.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\u0005H\u0007J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "<init>", "()V", "paused", "", "finished", "isDraining", "queue", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "pause", "", "resume", "finish", "drainQueue", "canRun", "dispatchAndEnqueue", "context", "Lkotlin/coroutines/CoroutineContext;", "runnable", "enqueue", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused;
    private final Queue<Runnable> queue;

    public DispatchQueue() {
        this.paused = true;
        this.queue = new ArrayDeque();
    }

    public final void pause() {
        this.paused = true;
    }

    public final void resume() {
        if (this.paused == true) goto L6;
        return;
    L6:
        if (this.finished == true) goto L10;
        this.paused = false;
        drainQueue();
        return;
    L10:
        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
    }

    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    public final void drainQueue() {
        if (this.isDraining == false) goto L21;
        return;
    L21:
        this.isDraining = true;     // Catch: Throwable -> L18
    L8:
        if (this.queue.isEmpty() == true) goto L16;
        if (canRun() == false) goto L16;
        Runnable r0 = this.queue.poll();     // Catch: Throwable -> L18
        if (r0 == null) goto L8;
        r0.run();     // Catch: Throwable -> L18
    L16:
        this.isDraining = false;
        return;
    L18:
        th = move-exception;
        this.isDraining = false;
        throw th;
    }

    public final boolean canRun() {
        if (this.finished == false) goto L5;
    L8:
        return true;
    L5:
        if (this.paused == false) goto L8;
        return false;
    }

    public final void dispatchAndEnqueue(CoroutineContext context, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        MainCoroutineDispatcher $this$dispatchAndEnqueue_u24lambda_u242 = Dispatchers.getMain().getImmediate();
        if ($this$dispatchAndEnqueue_u24lambda_u242.isDispatchNeeded(context) == false) goto L5;
    L8:
        $this$dispatchAndEnqueue_u24lambda_u242.mo8970dispatch(context, new DispatchQueue$$ExternalSyntheticLambda0(this, runnable));
        return;
    L5:
        if (canRun() == true) goto L8;
        enqueue(runnable);
    }

    static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue this$0, Runnable $runnable) {
        this$0.enqueue($runnable);
    }

    private final void enqueue(Runnable runnable) {
        if (this.queue.offer(runnable) == false) goto L7;
        drainQueue();
        return;
    L7:
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }
}
