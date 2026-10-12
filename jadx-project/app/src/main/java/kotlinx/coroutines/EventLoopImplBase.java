package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u00043456B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aJ\u0014\u0010\u001f\u001a\u00020\u00172\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0016J\u0014\u0010!\u001a\u00020\f2\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0002J\b\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0004J\u0016\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(J\u0018\u0010)\u001a\u00020*2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0002J\u001c\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00132\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aH\u0004J\u001e\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001700H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u0010 \u001a\u00020(H\u0002J\b\u00102\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005X\u0082\u0004R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00067"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "()V", "_delayed", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_isCompleted", "Lkotlinx/atomicfu/AtomicBoolean;", "_queue", "", "value", "", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "nextTime", "", "getNextTime", "()J", "closeQueue", "", "dequeue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "enqueue", "task", "enqueueImpl", "processNextEvent", "rescheduleAllDelayed", "resetAll", "schedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "scheduleImpl", "", "scheduleInvokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldUnpark", "shutdown", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _delayed$volatile$FU = null;
    private static final /* synthetic */ AtomicIntegerFieldUpdater _isCompleted$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _queue$volatile$FU = null;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class DelayedResumeTask extends DelayedTask {
        private final CancellableContinuation<Unit> cont;
        final /* synthetic */ EventLoopImplBase this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public DelayedResumeTask(EventLoopImplBase this$0, long nanoTime, CancellableContinuation<? super Unit> r4) {
            this.this$0 = this$0;
            super(nanoTime);
            this.cont = r4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.resumeUndispatched(this.this$0, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class DelayedRunnableTask extends DelayedTask {
        private final Runnable block;

        public DelayedRunnableTask(long nanoTime, Runnable block) {
            super(nanoTime);
            this.block = block;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public String toString() {
            return super.toString() + this.block;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\tJ\b\u0010%\u001a\u00020&H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "nanoTime", "", "(J)V", "_heap", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {
        private volatile Object _heap;
        private int index;
        public long nanoTime;

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(DelayedTask r2) {
            return compareTo2(r2);
        }

        public DelayedTask(long nanoTime) {
            this.nanoTime = nanoTime;
            this.index = -1;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public ThreadSafeHeap<?> getHeap() {
            Object r0 = this._heap;
            if ((r0 instanceof ThreadSafeHeap) == true) goto L7;
            return null;
        L7:
            return (ThreadSafeHeap) r0;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(ThreadSafeHeap<?> r3) {
            if (this._heap == EventLoop_commonKt.access$getDISPOSED_TASK$p()) goto L5;
            boolean r0 = true;
        L6:
            if (r0 == false) goto L10;
            this._heap = r3;
            return;
        L10:
            throw new IllegalArgumentException("Failed requirement.".toString());
        L5:
            r0 = false;
            goto L6
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
            return this.index;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int r1) {
            this.index = r1;
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(DelayedTask other) {
            long dTime = this.nanoTime - other.nanoTime;
            if (dTime <= 0) goto L6;
            return 1;
        L6:
            if (dTime >= 0) goto L8;
            return -1;
        L8:
            return 0;
        }

        public final boolean timeToExecute(long now) {
            if ((now - this.nanoTime) < 0) goto L5;
            return true;
        L5:
            return false;
        }

        public final int scheduleTask(long now, DelayedTaskQueue delayed, EventLoopImplBase eventLoop) {
            monitor-enter(this);
        L40:
            th = move-exception;
            throw th;
        L6:
            if (this._heap != EventLoop_commonKt.access$getDISPOSED_TASK$p()) goto L10;
            monitor-exit(this);
            return 2;
        L10:
            DelayedTaskQueue this_$iv = delayed;     // Catch: Throwable -> L40
            monitor-enter(this_$iv);     // Catch: Throwable -> L40
            DelayedTask firstTask = this_$iv.firstImpl();     // Catch: Throwable -> L37
            if (EventLoopImplBase.access$isCompleted(eventLoop) == false) goto L19;
            monitor-exit(this_$iv);     // Catch: Throwable -> L40
            monitor-exit(this);
            return 1;
        L19:
            if (firstTask != null) goto L21;
            delayed.timeNow = now;     // Catch: Throwable -> L37
            long r16 = 0;
        L30:
            if ((this.nanoTime - delayed.timeNow) >= r16) goto L32;
            this.nanoTime = delayed.timeNow;     // Catch: Throwable -> L37
        L32:
            this_$iv.addImpl(this);     // Catch: Throwable -> L37
            monitor-exit(this_$iv);     // Catch: Throwable -> L40
            monitor-exit(this);
            return 0;
        L21:
            r16 = 0;
            long firstTime = firstTask.nanoTime;     // Catch: Throwable -> L37
            if ((firstTime - now) < 0) goto L24;
            long r18 = now;
        L25:
            long minTime = r18;
            if ((minTime - delayed.timeNow) <= 0) goto L30;
            delayed.timeNow = minTime;     // Catch: Throwable -> L37
            goto L30
        L24:
            r18 = firstTime;
        L37:
            th = move-exception;
            throw th;     // Catch: Throwable -> L40
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            monitor-enter(this);
            Object heap = this._heap;     // Catch: Throwable -> L18
            if (heap != EventLoop_commonKt.access$getDISPOSED_TASK$p()) goto L10;
            monitor-exit(this);
            return;
        L10:
            if ((heap instanceof DelayedTaskQueue) == false) goto L12;
            DelayedTaskQueue r4 = (DelayedTaskQueue) heap;     // Catch: Throwable -> L18
        L13:
            if (r4 == null) goto L15;
            r4.remove(this);     // Catch: Throwable -> L18
        L15:
            this._heap = EventLoop_commonKt.access$getDISPOSED_TASK$p();     // Catch: Throwable -> L18
            Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L18
            monitor-exit(this);
            return;
        L12:
            r4 = null;
        L18:
            th = move-exception;
            throw th;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long timeNow) {
            this.timeNow = timeNow;
        }
    }

    static {
        _queue$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue$volatile");
        _delayed$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed$volatile");
        _isCompleted$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted$volatile");
    }

    private final /* synthetic */ Object get_delayed$volatile() {
        return this._delayed$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_delayed$volatile$FU() {
        return _delayed$volatile$FU;
    }

    private final /* synthetic */ int get_isCompleted$volatile() {
        return this._isCompleted$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater get_isCompleted$volatile$FU() {
        return _isCompleted$volatile$FU;
    }

    private final /* synthetic */ Object get_queue$volatile() {
        return this._queue$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_queue$volatile$FU() {
        return _queue$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicReferenceFieldUpdater r3, Function1<Object, Unit> r4) {
    L2:
        r4.invoke(r3.get(r2));
        goto L2
    }

    private final /* synthetic */ void set_delayed$volatile(Object r1) {
        this._delayed$volatile = r1;
    }

    private final /* synthetic */ void set_isCompleted$volatile(int r1) {
        this._isCompleted$volatile = r1;
    }

    private final /* synthetic */ void set_queue$volatile(Object r1) {
        this._queue$volatile = r1;
    }

    public EventLoopImplBase() {
        this._isCompleted$volatile = 0;
    }

    public static final /* synthetic */ boolean access$isCompleted(EventLoopImplBase $this) {
        return $this.isCompleted();
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long time, Continuation<? super Unit> r4) {
        return Delay.DefaultImpls.delay(this, time, r4);
    }

    public DisposableHandle invokeOnTimeout(long timeMillis, Runnable block, CoroutineContext context) {
        return Delay.DefaultImpls.invokeOnTimeout(this, timeMillis, block, context);
    }

    private final boolean isCompleted() {
        if (get_isCompleted$volatile$FU().get(this) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    private final void setCompleted(boolean r2) {
        get_isCompleted$volatile$FU().set(this, r2 ? 1 : 0);
    }

    @Override // kotlinx.coroutines.EventLoop
    protected boolean isEmpty() {
        if (isUnconfinedQueueEmpty() == true) goto L5;
        return false;
    L5:
        DelayedTaskQueue delayed = (DelayedTaskQueue) get_delayed$volatile$FU().get(this);
        if (delayed != null) goto L8;
    L10:
        Object queue = get_queue$volatile$FU().get(this);
        if (queue != null) goto L14;
        return true;
    L14:
        if ((queue instanceof LockFreeTaskQueueCore) == false) goto L17;
        return ((LockFreeTaskQueueCore) queue).isEmpty();
    L17:
        if (queue == EventLoop_commonKt.access$getCLOSED_EMPTY$p()) goto L19;
        return false;
    L19:
        return true;
    L8:
        if (delayed.isEmpty() == true) goto L10;
        return false;
    }

    @Override // kotlinx.coroutines.EventLoop
    protected long getNextTime() {
        if (super.getNextTime() != 0) goto L5;
        return 0;
    L5:
        Object queue = get_queue$volatile$FU().get(this);
        if (queue != null) goto L8;
    L16:
        DelayedTaskQueue r1 = (DelayedTaskQueue) get_delayed$volatile$FU().get(this);
        if (r1 == null) goto L27;
        DelayedTask nextDelayedTask = r1.peek();
        if (nextDelayedTask == null) goto L27;
        long r4 = nextDelayedTask.nanoTime;
        AbstractTimeSource r6 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r6 == null) goto L24;
        long r7 = r6.nanoTime();
    L26:
        return RangesKt.coerceAtLeast(r4 - r7, 0);
    L24:
        r7 = System.nanoTime();
    L27:
        return Long.MAX_VALUE;
    L8:
        if ((queue instanceof LockFreeTaskQueueCore) == false) goto L13;
        if (((LockFreeTaskQueueCore) queue).isEmpty() == true) goto L16;
        return 0;
    L13:
        if (queue != EventLoop_commonKt.access$getCLOSED_EMPTY$p()) goto L15;
        return Long.MAX_VALUE;
    L15:
        return 0;
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadLocalEventLoop.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        setCompleted(true);
        closeQueue();
    L4:
        if (processNextEvent() <= 0) goto L4;
        rescheduleAllDelayed();
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo8971scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super Unit> r10) {
        long timeNanos = EventLoop_commonKt.delayToNanos(timeMillis);
        if (timeNanos >= 4611686018427387903L) goto L10;
        AbstractTimeSource r2 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r2 == null) goto L7;
        long now = r2.nanoTime();
    L8:
        DelayedResumeTask task = new DelayedResumeTask(this, now + timeNanos, r10);
        schedule(now, task);
        CancellableContinuationKt.disposeOnCancellation(r10, task);
        return;
    L7:
        now = System.nanoTime();
        goto L8
    }

    protected final DisposableHandle scheduleInvokeOnTimeout(long timeMillis, Runnable block) {
        long timeNanos = EventLoop_commonKt.delayToNanos(timeMillis);
        if (timeNanos >= 4611686018427387903L) goto L10;
        AbstractTimeSource r2 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r2 == null) goto L7;
        long now = r2.nanoTime();
    L8:
        DelayedRunnableTask task = new DelayedRunnableTask(now + timeNanos, block);
        schedule(now, task);
        return task;
    L7:
        now = System.nanoTime();
        goto L8
    L10:
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
        long r2 = 0;
        if (processUnconfinedEvent() == false) goto L5;
        return 0;
    L5:
        ThreadSafeHeap delayed = (DelayedTaskQueue) get_delayed$volatile$FU().get(this);
        if (delayed != null) goto L8;
    L39:
        r2 = 0;
    L40:
        Runnable task = dequeue();
        if (task == null) goto L45;
        task.run();
        return r2;
    L45:
        return getNextTime();
    L8:
        if (delayed.isEmpty() == true) goto L39;
        AbstractTimeSource r0 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r0 == null) goto L12;
        long now = r0.nanoTime();
    L13:
        ThreadSafeHeap this_$iv = delayed;
        monitor-enter(this_$iv);
        ThreadSafeHeapNode first$iv = this_$iv.firstImpl();     // Catch: Throwable -> L36
        DelayedTask r12 = null;
        if (first$iv != null) goto L21;
        monitor-exit(this_$iv);
    L33:
        if (r12 == null) goto L40;
        r2 = r2;
        goto L13
    L21:
        DelayedTask it = (DelayedTask) first$iv;     // Catch: Throwable -> L36
        if (it.timeToExecute(now) == false) goto L24;
        boolean r3 = enqueueImpl(it);     // Catch: Throwable -> L36
    L26:
        if (r3 == true) goto L28;
    L31:
        monitor-exit(this_$iv);
        goto L33
    L28:
        r12 = this_$iv.removeAtImpl(0);     // Catch: Throwable -> L36
        goto L31
    L24:
        r3 = false;
    L36:
        th = move-exception;
        throw th;
    L12:
        now = System.nanoTime();
        goto L13
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo8970dispatch(CoroutineContext context, Runnable block) {
        enqueue(block);
    }

    public void enqueue(Runnable task) {
        if (enqueueImpl(task) == false) goto L5;
        unpark();
        return;
    L5:
        DefaultExecutor.INSTANCE.enqueue(task);
    }

    private final boolean enqueueImpl(Runnable task) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_queue$volatile$FU();
    L3:
        Object queue = handler$atomicfu$iv.get(this);
        if (isCompleted() == true) goto L5;
        if (queue == null) goto L9;
        if ((queue instanceof LockFreeTaskQueueCore) == true) goto L13;
        if (queue == EventLoop_commonKt.access$getCLOSED_EMPTY$p()) goto L22;
        LockFreeTaskQueueCore newQueue = new LockFreeTaskQueueCore(8, true);
        Intrinsics.checkNotNull(queue, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
        newQueue.addLast((Runnable) queue);
        newQueue.addLast(task);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_queue$volatile$FU(), this, queue, newQueue) == false) goto L3;
        return true;
    L22:
        return false;
    L13:
        Intrinsics.checkNotNull(queue, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
        switch(((LockFreeTaskQueueCore) queue).addLast(task)) {
            case 0: goto L18;
            case 1: goto L17;
            case 2: goto L16;
            default: goto L3;
        };
    L16:
        return false;
    L17:
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_queue$volatile$FU(), this, queue, ((LockFreeTaskQueueCore) queue).next());
        goto L3
    L18:
        return true;
    L9:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_queue$volatile$FU(), this, null, task) == false) goto L3;
        return true;
    L5:
        return false;
    }

    private final Runnable dequeue() {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_queue$volatile$FU();
    L3:
        Object queue = handler$atomicfu$iv.get(this);
        if (queue == null) goto L5;
        if ((queue instanceof LockFreeTaskQueueCore) == true) goto L8;
        if (queue == EventLoop_commonKt.access$getCLOSED_EMPTY$p()) goto L15;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_queue$volatile$FU(), this, queue, null) == false) goto L3;
        Intrinsics.checkNotNull(queue, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
        return (Runnable) queue;
    L15:
        return null;
    L8:
        Intrinsics.checkNotNull(queue, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
        Object result = ((LockFreeTaskQueueCore) queue).removeFirstOrNull();
        if (result != LockFreeTaskQueueCore.REMOVE_FROZEN) goto L11;
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_queue$volatile$FU(), this, queue, ((LockFreeTaskQueueCore) queue).next());
        goto L3
    L11:
        return (Runnable) result;
    L5:
        return null;
    }

    private final void closeQueue() {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L9:
        AtomicReferenceFieldUpdater handler$atomicfu$iv = get_queue$volatile$FU();
    L10:
        Object queue = handler$atomicfu$iv.get(this);
        if (queue == null) goto L13;
        if ((queue instanceof LockFreeTaskQueueCore) == true) goto L17;
        if (queue == EventLoop_commonKt.access$getCLOSED_EMPTY$p()) goto L21;
        LockFreeTaskQueueCore newQueue = new LockFreeTaskQueueCore(8, true);
        Intrinsics.checkNotNull(queue, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
        newQueue.addLast((Runnable) queue);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_queue$volatile$FU(), this, queue, newQueue) == false) goto L10;
        return;
    L21:
        return;
    L17:
        ((LockFreeTaskQueueCore) queue).close();
        return;
    L13:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_queue$volatile$FU(), this, null, EventLoop_commonKt.access$getCLOSED_EMPTY$p()) == false) goto L10;
        return;
    L5:
        if (isCompleted() == true) goto L9;
        throw new AssertionError();
    }

    public final void schedule(long now, DelayedTask delayedTask) {
        switch(scheduleImpl(now, delayedTask)) {
            case 0: goto L9;
            case 1: goto L7;
            case 2: goto L14;
            default: goto L5;
        };
    L7:
        reschedule(now, delayedTask);
        return;
    L14:
        return;
    L5:
        throw new IllegalStateException("unexpected result".toString());
    L9:
        if (shouldUnpark(delayedTask) == false) goto L13;
        unpark();
        return;
    }

    private final boolean shouldUnpark(DelayedTask task) {
        DelayedTaskQueue r0 = (DelayedTaskQueue) get_delayed$volatile$FU().get(this);
        if (r0 == null) goto L5;
        DelayedTask r1 = r0.peek();
    L6:
        if (r1 != task) goto L8;
        return true;
    L8:
        return false;
    L5:
        r1 = null;
        goto L6
    }

    private final int scheduleImpl(long now, DelayedTask delayedTask) {
        if (isCompleted() == false) goto L6;
        return 1;
    L6:
        DelayedTaskQueue delayedQueue = (DelayedTaskQueue) get_delayed$volatile$FU().get(this);
        if (delayedQueue != null) goto L10;
        EventLoopImplBase $this$scheduleImpl_u24lambda_u248 = this;
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_delayed$volatile$FU(), $this$scheduleImpl_u24lambda_u248, null, new DelayedTaskQueue(now));
        Object r2 = get_delayed$volatile$FU().get($this$scheduleImpl_u24lambda_u248);
        Intrinsics.checkNotNull(r2);
        delayedQueue = (DelayedTaskQueue) r2;
    L10:
        return delayedTask.scheduleTask(now, delayedQueue, this);
    }

    protected final void resetAll() {
        get_queue$volatile$FU().set(this, null);
        get_delayed$volatile$FU().set(this, null);
    }

    private final void rescheduleAllDelayed() {
        AbstractTimeSource r0 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r0 == null) goto L5;
        long now = r0.nanoTime();
    L6:
        DelayedTaskQueue r2 = (DelayedTaskQueue) get_delayed$volatile$FU().get(this);
        if (r2 == null) goto L12;
        DelayedTask delayedTask = r2.removeFirstOrNull();
        if (delayedTask == null) goto L16;
        reschedule(now, delayedTask);
        goto L6
    L16:
        return;
    L12:
        return;
    L5:
        now = System.nanoTime();
        goto L6
    }
}
