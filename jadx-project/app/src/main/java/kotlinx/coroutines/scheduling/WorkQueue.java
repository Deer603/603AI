package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.concurrent.internal.AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0016\u0010#\u001a\u0004\u0018\u00010\u00072\n\u0010$\u001a\u00060\tj\u0002`%H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\"\u0010(\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+J$\u0010,\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+H\u0002J\u000e\u0010-\u001a\u00020\u0018*\u0004\u0018\u00010\u0007H\u0002R\t\u0010\u0003\u001a\u00020\u0004X\u0082\u0004R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\t\u0010\f\u001a\u00020\u0004X\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0004X\u0082\u0004R\u0014\u0010\u0010\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006."}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "()V", "blockingTasksInBuffer", "Lkotlinx/atomicfu/AtomicInt;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "bufferSize", "", "getBufferSize", "()I", "consumerIndex", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "size", "getSize$kotlinx_coroutines_core", "add", "task", "fair", "", "addLast", "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "poll", "pollBlocking", "pollBuffer", "pollCpu", "pollTo", "queue", "pollWithExclusiveMode", "onlyBlocking", "stealWithExclusiveMode", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryExtractFromTheMiddle", "index", "trySteal", "", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "tryStealLastScheduled", "decrementIfBlocking", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WorkQueue {
    private static final /* synthetic */ AtomicIntegerFieldUpdater blockingTasksInBuffer$volatile$FU = null;
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumerIndex$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater lastScheduledTask$volatile$FU = null;
    private static final /* synthetic */ AtomicIntegerFieldUpdater producerIndex$volatile$FU = null;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private final AtomicReferenceArray<Task> buffer;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        lastScheduledTask$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask$volatile");
        producerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex$volatile");
        consumerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex$volatile");
        blockingTasksInBuffer$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer$volatile");
    }

    private final /* synthetic */ int getBlockingTasksInBuffer$volatile() {
        return this.blockingTasksInBuffer$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater getBlockingTasksInBuffer$volatile$FU() {
        return blockingTasksInBuffer$volatile$FU;
    }

    private final /* synthetic */ int getConsumerIndex$volatile() {
        return this.consumerIndex$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater getConsumerIndex$volatile$FU() {
        return consumerIndex$volatile$FU;
    }

    private final /* synthetic */ Object getLastScheduledTask$volatile() {
        return this.lastScheduledTask$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getLastScheduledTask$volatile$FU() {
        return lastScheduledTask$volatile$FU;
    }

    private final /* synthetic */ int getProducerIndex$volatile() {
        return this.producerIndex$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater getProducerIndex$volatile$FU() {
        return producerIndex$volatile$FU;
    }

    private final /* synthetic */ void setBlockingTasksInBuffer$volatile(int r1) {
        this.blockingTasksInBuffer$volatile = r1;
    }

    private final /* synthetic */ void setConsumerIndex$volatile(int r1) {
        this.consumerIndex$volatile = r1;
    }

    private final /* synthetic */ void setLastScheduledTask$volatile(Object r1) {
        this.lastScheduledTask$volatile = r1;
    }

    private final /* synthetic */ void setProducerIndex$volatile(int r1) {
        this.producerIndex$volatile = r1;
    }

    public WorkQueue() {
        this.buffer = new AtomicReferenceArray(128);
    }

    private final int getBufferSize() {
        return getProducerIndex$volatile$FU().get(this) - getConsumerIndex$volatile$FU().get(this);
    }

    public final int getSize$kotlinx_coroutines_core() {
        if (getLastScheduledTask$volatile$FU().get(this) == null) goto L6;
        return getBufferSize() + 1;
    L6:
        return getBufferSize();
    }

    public final Task poll() {
        Task r0 = (Task) getLastScheduledTask$volatile$FU().getAndSet(this, null);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return pollBuffer();
    }

    public static /* synthetic */ Task add$default(WorkQueue r0, Task r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.add(r1, r2);
    }

    public final Task add(Task task, boolean fair) {
        if (fair == true) goto L4;
        Task previous = (Task) getLastScheduledTask$volatile$FU().getAndSet(this, task);
        if (previous != null) goto L10;
        return null;
    L10:
        return addLast(previous);
    L4:
        return addLast(task);
    }

    private final Task addLast(Task task) {
        if (getBufferSize() != 127) goto L5;
        return task;
    L5:
        boolean r4 = true;
        if (task.taskContext.getTaskMode() == 1) goto L9;
        r4 = false;
    L9:
        if (r4 == false) goto L11;
        getBlockingTasksInBuffer$volatile$FU().incrementAndGet(this);
    L11:
        int nextIndex = getProducerIndex$volatile$FU().get(this) & WorkQueueKt.MASK;
    L13:
        if (this.buffer.get(nextIndex) == null) goto L15;
        Thread.yield();
        goto L13
    L15:
        this.buffer.lazySet(nextIndex, task);
        getProducerIndex$volatile$FU().incrementAndGet(this);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int r4, Ref.ObjectRef<Task> r5) {
        if (r4 != 3) goto L5;
        T r0 = pollBuffer();
    L7:
        if (r0 == 0) goto L11;
        r5.element = r0;
        return -1;
    L11:
        return tryStealLastScheduled(r4, r5);
    L5:
        r0 = stealWithExclusiveMode(r4);
        goto L7
    }

    private final Task stealWithExclusiveMode(int stealingMode) {
        int start = getConsumerIndex$volatile$FU().get(this);
        int end = getProducerIndex$volatile$FU().get(this);
        boolean onlyBlocking = true;
        if (stealingMode == 1) goto L7;
        onlyBlocking = false;
    L7:
        if (start == end) goto L16;
        if (onlyBlocking == true) goto L10;
    L12:
        int start2 = start + 1;
        Task r0 = tryExtractFromTheMiddle(start, onlyBlocking);
        if (r0 != null) goto L15;
        start = start2;
        goto L7
    L15:
        return r0;
    L10:
        if (getBlockingTasksInBuffer$volatile$FU().get(this) != 0) goto L12;
        return null;
    L16:
        return null;
    }

    public final Task pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    public final Task pollCpu() {
        return pollWithExclusiveMode(false);
    }

    private final Task pollWithExclusiveMode(boolean onlyBlocking) {
    L2:
        Task lastScheduled = (Task) getLastScheduledTask$volatile$FU().get(this);
        if (lastScheduled == null) goto L13;
        boolean r5 = true;
        if (lastScheduled.taskContext.getTaskMode() == 1) goto L9;
        r5 = false;
    L9:
        if (r5 != onlyBlocking) goto L13;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getLastScheduledTask$volatile$FU(), this, lastScheduled, null) == false) goto L2;
        return lastScheduled;
    L13:
        int start = getConsumerIndex$volatile$FU().get(this);
        int end = getProducerIndex$volatile$FU().get(this);
    L14:
        if (start == end) goto L22;
        if (onlyBlocking == true) goto L17;
    L19:
        end = end - 1;
        Task task = tryExtractFromTheMiddle(end, onlyBlocking);
        if (task == null) goto L14;
        return task;
    L17:
        if (getBlockingTasksInBuffer$volatile$FU().get(this) != 0) goto L19;
        return null;
    L22:
        return null;
    }

    private final Task tryExtractFromTheMiddle(int index, boolean onlyBlocking) {
        int arrayIndex = index & WorkQueueKt.MASK;
        Task value = this.buffer.get(arrayIndex);
        if (value == null) goto L14;
        boolean r6 = true;
        if (value.taskContext.getTaskMode() == 1) goto L8;
        r6 = false;
    L8:
        if (r6 != onlyBlocking) goto L14;
        if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(this.buffer, arrayIndex, value, null) == false) goto L14;
        if (onlyBlocking == false) goto L13;
        getBlockingTasksInBuffer$volatile$FU().decrementAndGet(this);
    L13:
        return value;
    L14:
        return null;
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        Task it = (Task) getLastScheduledTask$volatile$FU().getAndSet(this, null);
        if (it == null) goto L6;
        globalQueue.addLast(it);
    L6:
        if (pollTo(globalQueue) == true) goto L6;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.Task] */
    private final long tryStealLastScheduled(int stealingMode, Ref.ObjectRef<Task> r11) {
    L2:
        ?? r0 = (Task) getLastScheduledTask$volatile$FU().get(this);
        if (r0 == 0) goto L4;
        int r8 = 1;
        if (r0.taskContext.getTaskMode() != 1) goto L8;
        boolean r7 = true;
    L9:
        if (r7 == true) goto L13;
        r8 = 2;
    L13:
        if ((r8 & stealingMode) == 0) goto L14;
        long time = TasksKt.schedulerTimeSource.nanoTime();
        long staleness = time - r0.submissionTime;
        if (staleness < TasksKt.WORK_STEALING_TIME_RESOLUTION_NS) goto L18;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getLastScheduledTask$volatile$FU(), this, r0, null) == false) goto L2;
        r11.element = r0;
        return -1;
    L18:
        return TasksKt.WORK_STEALING_TIME_RESOLUTION_NS - staleness;
    L14:
        return -2;
    L8:
        r7 = false;
        goto L9
    L4:
        return -2;
    }

    private final boolean pollTo(GlobalQueue queue) {
        Task task = pollBuffer();
        if (task != null) goto L6;
        return false;
    L6:
        queue.addLast(task);
        return true;
    }

    private final Task pollBuffer() {
    L2:
        int tailLocal = getConsumerIndex$volatile$FU().get(this);
        if ((tailLocal - getProducerIndex$volatile$FU().get(this)) == 0) goto L4;
        int index = tailLocal & WorkQueueKt.MASK;
        if (getConsumerIndex$volatile$FU().compareAndSet(this, tailLocal, tailLocal + 1) == false) goto L2;
        Task value = this.buffer.getAndSet(index, null);
        if (value == null) goto L2;
        decrementIfBlocking(value);
        return value;
    L4:
        return null;
    }

    private final void decrementIfBlocking(Task $this$decrementIfBlocking) {
        if ($this$decrementIfBlocking == null) goto L17;
        boolean r3 = false;
        if ($this$decrementIfBlocking.taskContext.getTaskMode() != 1) goto L6;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L18;
        int value = getBlockingTasksInBuffer$volatile$FU().decrementAndGet(this);
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L11;
        return;
    L11:
        if (value < 0) goto L13;
        r3 = true;
    L13:
        if (r3 == false) goto L16;
        return;
    L16:
        throw new AssertionError();
    L18:
        return;
    L6:
        r0 = false;
        goto L7
    }
}
