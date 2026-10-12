package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0097A¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0016J-\u0010\u0019\u001a\u00020\u00112\n\u0010\u0018\u001a\u00060\tj\u0002`\n2\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u00060\u001cR\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u001bH\u0082\bJ\u001c\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\tj\u0002`\nH\u0017J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\"\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0002J\u001f\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0096\u0001J\b\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0012\u0010\r\u001a\u00060\u000ej\u0002`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runningWorkers", "Lkotlinx/atomicfu/AtomicInt;", "workerAllocationLock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "dispatchInternal", "startWorker", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "dispatchYield", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "limitedParallelism", "obtainTaskOrDeallocateWorker", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryAllocateWorker", "", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {
    private static final /* synthetic */ AtomicIntegerFieldUpdater runningWorkers$volatile$FU = null;
    private final /* synthetic */ Delay $$delegate_0;
    private final CoroutineDispatcher dispatcher;
    private final int parallelism;
    private final LockFreeTaskQueue<Runnable> queue;
    private volatile /* synthetic */ int runningWorkers$volatile;
    private final Object workerAllocationLock;

    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "(Lkotlinx/coroutines/internal/LimitedDispatcher;Ljava/lang/Runnable;)V", "run", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class Worker implements Runnable {
        private Runnable currentTask;
        final /* synthetic */ LimitedDispatcher this$0;

        public Worker(LimitedDispatcher this$0, Runnable currentTask) {
            this.this$0 = this$0;
            this.currentTask = currentTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            int fairnessCounter = 0;
        L17:
            this.currentTask.run();     // Catch: Throwable -> L6
        L8:
            Runnable r1 = LimitedDispatcher.access$obtainTaskOrDeallocateWorker(this.this$0);
            if (r1 == null) goto L10;
            this.currentTask = r1;
            fairnessCounter = fairnessCounter + 1;
            if (fairnessCounter < 16) goto L17;
            if (LimitedDispatcher.access$getDispatcher$p(this.this$0).isDispatchNeeded(this.this$0) == false) goto L17;
            LimitedDispatcher.access$getDispatcher$p(this.this$0).mo8970dispatch(this.this$0, this);
            return;
        L10:
            return;
        L6:
            e = move-exception;
            CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, e);
            goto L8
        }
    }

    static {
        runningWorkers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");
    }

    private final /* synthetic */ int getRunningWorkers$volatile() {
        return this.runningWorkers$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater getRunningWorkers$volatile$FU() {
        return runningWorkers$volatile$FU;
    }

    private final /* synthetic */ void setRunningWorkers$volatile(int r1) {
        this.runningWorkers$volatile = r1;
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long r2, Continuation<? super Unit> r4) {
        return this.$$delegate_0.delay(r2, r4);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long r2, Runnable r4, CoroutineContext r5) {
        return this.$$delegate_0.invokeOnTimeout(r2, r4, r5);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo8971scheduleResumeAfterDelay(long r2, CancellableContinuation<? super Unit> r4) {
        this.$$delegate_0.mo8971scheduleResumeAfterDelay(r2, r4);
    }

    public static final /* synthetic */ CoroutineDispatcher access$getDispatcher$p(LimitedDispatcher $this) {
        return $this.dispatcher;
    }

    public static final /* synthetic */ Runnable access$obtainTaskOrDeallocateWorker(LimitedDispatcher $this) {
        return $this.obtainTaskOrDeallocateWorker();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(CoroutineDispatcher r3, int parallelism) {
        this.dispatcher = r3;
        this.parallelism = parallelism;
        if ((r3 instanceof Delay) == false) goto L5;
        Delay r0 = (Delay) r3;
    L6:
        if (r0 != null) goto L8;
        r0 = DefaultExecutorKt.getDefaultDelay();
    L8:
        this.$$delegate_0 = r0;
        this.queue = new LockFreeTaskQueue(false);
        this.workerAllocationLock = new Object();
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int parallelism) {
        LimitedDispatcherKt.checkParallelism(parallelism);
        if (parallelism < this.parallelism) goto L7;
        return this;
    L7:
        return super.limitedParallelism(parallelism);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo8970dispatch(CoroutineContext context, Runnable block) {
        this.queue.addLast(block);
        if (getRunningWorkers$volatile$FU().get(this) < this.parallelism) goto L5;
        return;
    L5:
        if (tryAllocateWorker() == false) goto L12;
        Runnable task$iv = obtainTaskOrDeallocateWorker();
        if (task$iv == null) goto L13;
        Worker worker = new Worker(this, task$iv);
        this.dispatcher.mo8970dispatch(this, worker);
        return;
    L13:
        return;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext context, Runnable block) {
        this.queue.addLast(block);
        if (getRunningWorkers$volatile$FU().get(this) < this.parallelism) goto L5;
        return;
    L5:
        if (tryAllocateWorker() == false) goto L12;
        Runnable task$iv = obtainTaskOrDeallocateWorker();
        if (task$iv == null) goto L13;
        Worker worker = new Worker(this, task$iv);
        this.dispatcher.dispatchYield(this, worker);
        return;
    L13:
        return;
    }

    private final void dispatchInternal(Runnable block, Function1<? super Worker, Unit> r5) {
        this.queue.addLast(block);
        if (getRunningWorkers$volatile$FU().get(this) < this.parallelism) goto L6;
        return;
    L6:
        if (tryAllocateWorker() == true) goto L8;
        return;
    L8:
        Runnable task = obtainTaskOrDeallocateWorker();
        if (task != null) goto L11;
        return;
    L11:
        r5.invoke(new Worker(this, task));
    }

    private final boolean tryAllocateWorker() {
        Object lock$iv = this.workerAllocationLock;
        monitor-enter(lock$iv);
    L14:
        th = move-exception;
        throw th;
    L6:
        if (getRunningWorkers$volatile$FU().get(this) < this.parallelism) goto L10;
        monitor-exit(lock$iv);
        return false;
    L10:
        getRunningWorkers$volatile$FU().incrementAndGet(this);     // Catch: Throwable -> L14
        monitor-exit(lock$iv);
        return true;
    }

    private final Runnable obtainTaskOrDeallocateWorker() {
    L2:
        Runnable nextTask = this.queue.removeFirstOrNull();
        if (nextTask != null) goto L18;
        Object lock$iv = this.workerAllocationLock;
        monitor-enter(lock$iv);
        getRunningWorkers$volatile$FU().decrementAndGet(this);     // Catch: Throwable -> L15
        if (this.queue.getSize() == 0) goto L9;
        getRunningWorkers$volatile$FU().incrementAndGet(this);     // Catch: Throwable -> L15
        monitor-exit(lock$iv);
        goto L2
    L9:
        monitor-exit(lock$iv);
        return null;
    L15:
        th = move-exception;
        throw th;
    L18:
        return nextTask;
    }
}
