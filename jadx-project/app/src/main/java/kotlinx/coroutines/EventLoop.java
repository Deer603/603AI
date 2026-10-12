package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0010J\u0010\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\nH\u0016J\u0006\u0010\u001d\u001a\u00020\u0004J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "isActive", "", "()Z", "isEmpty", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty", "nextTime", "", "getNextTime", "()J", "shared", "unconfinedQueue", "Lkotlin/collections/ArrayDeque;", "Lkotlinx/coroutines/DispatchedTask;", "useCount", "decrementUseCount", "", "unconfined", "delta", "dispatchUnconfined", "task", "incrementUseCount", "limitedParallelism", "parallelism", "", "processNextEvent", "processUnconfinedEvent", "shouldBeProcessedFromContext", "shutdown", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class EventLoop extends CoroutineDispatcher {
    private boolean shared;
    private ArrayDeque<DispatchedTask<?>> unconfinedQueue;
    private long useCount;

    public EventLoop() {
    }

    public long processNextEvent() {
        if (processUnconfinedEvent() == true) goto L6;
        return Long.MAX_VALUE;
    L6:
        return 0;
    }

    protected boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    protected long getNextTime() {
        ArrayDeque<DispatchedTask<?>> r0 = this.unconfinedQueue;
        if (r0 != null) goto L6;
        return Long.MAX_VALUE;
    L6:
        if (r0.isEmpty() == true) goto L10;
        return 0;
    L10:
        return Long.MAX_VALUE;
    }

    public final boolean processUnconfinedEvent() {
        ArrayDeque<DispatchedTask<?>> r0 = this.unconfinedQueue;
        if (r0 != null) goto L5;
        return false;
    L5:
        DispatchedTask<?> r2 = r0.removeFirstOrNull();
        if (r2 != null) goto L8;
        return false;
    L8:
        r2.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public final void dispatchUnconfined(DispatchedTask<?> r4) {
        ArrayDeque<DispatchedTask<?>> r0 = this.unconfinedQueue;
        if (r0 != null) goto L5;
        r0 = new ArrayDeque();
        this.unconfinedQueue = r0;
    L5:
        r0.addLast(r4);
    }

    public final boolean isActive() {
        if (this.useCount <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isUnconfinedLoopActive() {
        if (this.useCount >= delta(true)) goto L7;
        return false;
    L7:
        return true;
    }

    public final boolean isUnconfinedQueueEmpty() {
        ArrayDeque<DispatchedTask<?>> r0 = this.unconfinedQueue;
        if (r0 != null) goto L7;
        return true;
    L7:
        return r0.isEmpty();
    }

    private final long delta(boolean unconfined) {
        if (unconfined == false) goto L4;
        return 4294967296L;
    L4:
        return 1;
    }

    public static /* synthetic */ void incrementUseCount$default(EventLoop r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        r0.incrementUseCount(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final void incrementUseCount(boolean unconfined) {
        this.useCount += delta(unconfined);
        if (unconfined == true) goto L6;
        this.shared = true;
        return;
    }

    public static /* synthetic */ void decrementUseCount$default(EventLoop r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        r0.decrementUseCount(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public final void decrementUseCount(boolean unconfined) {
        this.useCount -= delta(unconfined);
        if (this.useCount <= 0) goto L6;
        return;
    L6:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L16;
        if (this.useCount != 0) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == true) goto L16;
        throw new AssertionError();
    L10:
        r1 = false;
    L16:
        if (this.shared == false) goto L19;
        shutdown();
        return;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int parallelism) {
        LimitedDispatcherKt.checkParallelism(parallelism);
        return this;
    }

    public void shutdown() {
    }
}
