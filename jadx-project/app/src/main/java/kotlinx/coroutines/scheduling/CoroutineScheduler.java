package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0003IJKB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0086\bJ\u0011\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0082\bJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0002J\u001a\u0010&\u001a\u00020 2\n\u0010'\u001a\u00060(j\u0002`)2\u0006\u0010*\u001a\u00020+J\u0011\u0010\u0012\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0082\bJ\u000e\u0010,\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002J\t\u0010-\u001a\u00020$H\u0082\bJ\t\u0010.\u001a\u00020\u0004H\u0082\bJ&\u0010/\u001a\u00020$2\n\u0010'\u001a\u00060(j\u0002`)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00100\u001a\u00020\u0018J\u0014\u00101\u001a\u00020$2\n\u00102\u001a\u00060(j\u0002`)H\u0016J\t\u00103\u001a\u00020\u0007H\u0082\bJ\t\u00104\u001a\u00020\u0004H\u0082\bJ\u0014\u00105\u001a\u00020\u00042\n\u00106\u001a\u00060\u001dR\u00020\u0000H\u0002J\u000e\u00107\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002J\u0012\u00108\u001a\u00020\u00182\n\u00106\u001a\u00060\u001dR\u00020\u0000J\"\u00109\u001a\u00020$2\n\u00106\u001a\u00060\u001dR\u00020\u00002\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004J\t\u0010<\u001a\u00020\u0007H\u0082\bJ\u000e\u0010=\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\u0007J\u0018\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0018H\u0002J\u0006\u0010C\u001a\u00020$J\b\u0010D\u001a\u00020\tH\u0016J\t\u0010E\u001a\u00020\u0018H\u0082\bJ\u0012\u0010F\u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020\u0018H\u0002J$\u0010H\u001a\u0004\u0018\u00010 *\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u00100\u001a\u00020\u0018H\u0002R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0015\u0010\r\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\t\u0010\u0010\u001a\u00020\u0011X\u0082\u0004R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0012\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0010\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\u001a\u001a\u00020\u0011X\u0082\u0004R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u001dR\u00020\u00000\u001c8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "(IIJLjava/lang/String;)V", "_isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "availableCpuPermits", "getAvailableCpuPermits", "()I", "controlState", "Lkotlinx/atomicfu/AtomicLong;", "createdWorkers", "getCreatedWorkers", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "isTerminated", "", "()Z", "parkedWorkersStack", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "addToGlobalQueue", "task", "Lkotlinx/coroutines/scheduling/Task;", "state", "blockingTasks", "close", "", "createNewWorker", "createTask", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "currentWorker", "decrementBlockingTasks", "decrementCreatedWorkers", "dispatch", "tailDispatch", "execute", "command", "incrementBlockingTasks", "incrementCreatedWorkers", "parkedWorkersStackNextIndex", "worker", "parkedWorkersStackPop", "parkedWorkersStackPush", "parkedWorkersStackTopUpdate", "oldIndex", "newIndex", "releaseCpuPermit", "runSafely", "shutdown", "timeout", "signalBlockingWork", "stateSnapshot", "skipUnpark", "signalCpuWork", "toString", "tryAcquireCpuPermit", "tryCreateWorker", "tryUnpark", "submitToLocalQueue", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoroutineScheduler implements Executor, Closeable {
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 9223367638808264704L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 2097151;
    public static final Companion Companion = null;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    public static final Symbol NOT_IN_STACK = null;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;
    private static final /* synthetic */ AtomicIntegerFieldUpdater _isTerminated$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater controlState$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater parkedWorkersStack$volatile$FU = null;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int corePoolSize;
    public final GlobalQueue globalBlockingQueue;
    public final GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final String schedulerName;
    public final ResizableAtomicArray<Worker> workers;

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[WorkerState.values().length];
            r0[WorkerState.PARKING.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L20:
            r0[WorkerState.BLOCKING.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L24:
            r0[WorkerState.CPU_ACQUIRED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L28:
            r0[WorkerState.DORMANT.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L22:
            r0[WorkerState.TERMINATED.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L18:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020 H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020\u000eH\u0002J\n\u0010,\u001a\u0004\u0018\u00010 H\u0002J\n\u0010-\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010.\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u0003H\u0002J\b\u00101\u001a\u00020\u000eH\u0002J\u0006\u00102\u001a\u00020\u000eJ\u000e\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003J\b\u00105\u001a\u00020%H\u0002J\n\u00106\u001a\u0004\u0018\u00010 H\u0002J\b\u00107\u001a\u00020%H\u0016J\u0006\u00108\u001a\u00020\u0010J\b\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020\u000eH\u0002J\b\u0010;\u001a\u00020%H\u0002J\u000e\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u001dJ\u0016\u0010>\u001a\u0004\u0018\u00010 2\n\u0010?\u001a\u00060\u0003j\u0002`@H\u0002J\b\u0010A\u001a\u00020%H\u0002R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00198Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0006\u0010\"\u001a\u00020#¨\u0006B"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "index", "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "", "minDelayUntilStealableTaskNs", "", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "stolenTask", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlinx/coroutines/scheduling/Task;", "terminationDeadline", "workerCtl", "Lkotlinx/atomicfu/AtomicInt;", "afterTask", "", "taskMode", "beforeTask", "executeTask", "task", "findAnyTask", "scanLocalQueue", "findBlockingTask", "findCpuTask", "findTask", "idleReset", "mode", "inStack", "isIo", "nextInt", "upperBound", "park", "pollGlobalQueues", "run", "runSingleTask", "runWorker", "tryAcquireCpuPermit", "tryPark", "tryReleaseCpu", "newState", "trySteal", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryTerminateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Worker extends Thread {
        private static final /* synthetic */ AtomicIntegerFieldUpdater workerCtl$volatile$FU = null;
        private volatile int indexInArray;
        public final WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile Object nextParkedWorker;
        private int rngState;
        public WorkerState state;
        private final Ref.ObjectRef<Task> stolenTask;
        private long terminationDeadline;
        final /* synthetic */ CoroutineScheduler this$0;
        private volatile /* synthetic */ int workerCtl$volatile;

        static {
            workerCtl$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");
        }

        private final /* synthetic */ int getWorkerCtl$volatile() {
            return this.workerCtl$volatile;
        }

        public static final /* synthetic */ AtomicIntegerFieldUpdater getWorkerCtl$volatile$FU$kotlinx_coroutines_core() {
            return workerCtl$volatile$FU;
        }

        private final /* synthetic */ void setWorkerCtl$volatile(int r1) {
            this.workerCtl$volatile = r1;
        }

        private Worker(CoroutineScheduler this$0) {
            this.this$0 = this$0;
            setDaemon(true);
            setContextClassLoader(this.this$0.getClass().getClassLoader());
            this.localQueue = new WorkQueue();
            this.stolenTask = new Ref.ObjectRef();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            int seed = (int) System.nanoTime();
            if (seed != 0) goto L6;
            seed = 42;
        L6:
            this.rngState = seed;
        }

        public static final /* synthetic */ CoroutineScheduler access$getThis$0$p(Worker $this) {
            return $this.this$0;
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final void setIndexInArray(int index) {
            StringBuilder r0 = new StringBuilder().append(this.this$0.schedulerName).append("-worker-");
            if (index != 0) goto L5;
            String r1 = "TERMINATED";
        L6:
            setName(r0.append(r1).toString());
            this.indexInArray = index;
            return;
        L5:
            r1 = String.valueOf(index);
            goto L6
        }

        public Worker(CoroutineScheduler this$0, int index) {
            this(this$0);
            setIndexInArray(index);
        }

        public final CoroutineScheduler getScheduler() {
            return access$getThis$0$p(this);
        }

        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final void setNextParkedWorker(Object r1) {
            this.nextParkedWorker = r1;
        }

        private final boolean tryAcquireCpuPermit() {
            if (this.state == WorkerState.CPU_ACQUIRED) goto L21;
            CoroutineScheduler this_$iv = this.this$0;
            AtomicLongFieldUpdater handler$atomicfu$iv$iv = CoroutineScheduler.access$getControlState$volatile$FU();
        L6:
            long state$iv = handler$atomicfu$iv$iv.get(this_$iv);
            if (((int) ((CoroutineScheduler.CPU_PERMITS_MASK & state$iv) >> 42)) == 0) goto L8;
            long update$iv = state$iv - 4398046511104L;
            if (CoroutineScheduler.access$getControlState$volatile$FU().compareAndSet(this_$iv, state$iv, update$iv) == false) goto L6;
            int $i$f$tryAcquireCpuPermit = 1;
        L12:
            if ($i$f$tryAcquireCpuPermit == 0) goto L15;
            this.state = WorkerState.CPU_ACQUIRED;
            return true;
        L15:
            return false;
        L8:
            $i$f$tryAcquireCpuPermit = 0;
            goto L12
        L21:
            return true;
        }

        public final boolean tryReleaseCpu(WorkerState newState) {
            WorkerState previousState = this.state;
            if (previousState != WorkerState.CPU_ACQUIRED) goto L5;
            boolean hadCpu = true;
        L6:
            if (hadCpu == false) goto L8;
            CoroutineScheduler this_$iv = this.this$0;
            CoroutineScheduler.access$getControlState$volatile$FU().addAndGet(this_$iv, 4398046511104L);
        L8:
            if (previousState == newState) goto L10;
            this.state = newState;
        L10:
            return hadCpu;
        L5:
            hadCpu = false;
            goto L6
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            runWorker();
        }

        private final void runWorker() {
            boolean rescanned = false;
        L4:
            if (this.this$0.isTerminated() == true) goto L17;
            if (this.state == WorkerState.TERMINATED) goto L17;
            Task task = findTask(this.mayHaveLocalTasks);
            if (task != null) goto L9;
            this.mayHaveLocalTasks = false;
            if (this.minDelayUntilStealableTaskNs != 0) goto L12;
            tryPark();
            goto L4
        L12:
            if (rescanned == false) goto L13;
            rescanned = false;
            tryReleaseCpu(WorkerState.PARKING);
            Thread.interrupted();
            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
            this.minDelayUntilStealableTaskNs = 0;
            goto L4
        L13:
            rescanned = true;
            goto L4
        L9:
            rescanned = false;
            this.minDelayUntilStealableTaskNs = 0;
            executeTask(task);
        L17:
            tryReleaseCpu(WorkerState.TERMINATED);
        }

        public final long runSingleTask() {
            WorkerState stateSnapshot = this.state;
            boolean r3 = true;
            if (this.state != WorkerState.CPU_ACQUIRED) goto L5;
            boolean isCpuThread = true;
        L6:
            if (isCpuThread == false) goto L8;
            Task task = findCpuTask();
        L10:
            if (task == null) goto L12;
            this.this$0.runSafely(task);
            if (isCpuThread == true) goto L21;
            CoroutineScheduler this_$iv = this.this$0;
            CoroutineScheduler.access$getControlState$volatile$FU().addAndGet(this_$iv, CoroutineScheduler.PARKED_VERSION_MASK);
        L21:
            if (DebugKt.getASSERTIONS_ENABLED() == true) goto L23;
        L30:
            return 0;
        L23:
            if (this.state == stateSnapshot) goto L26;
            r3 = false;
        L26:
            if (r3 == true) goto L30;
            throw new AssertionError();
        L12:
            if (this.minDelayUntilStealableTaskNs != 0) goto L16;
            return -1;
        L16:
            return this.minDelayUntilStealableTaskNs;
        L8:
            task = findBlockingTask();
            goto L10
        L5:
            isCpuThread = false;
            goto L6
        }

        public final boolean isIo() {
            if (this.state != WorkerState.BLOCKING) goto L5;
            return true;
        L5:
            return false;
        }

        private final void tryPark() {
            if (inStack() == true) goto L6;
            this.this$0.parkedWorkersStackPush(this);
            return;
        L6:
            getWorkerCtl$volatile$FU$kotlinx_coroutines_core().set(this, -1);
        L8:
            if (inStack() == false) goto L17;
            if (getWorkerCtl$volatile$FU$kotlinx_coroutines_core().get(this) != (-1)) goto L22;
            if (this.this$0.isTerminated() == true) goto L23;
            if (this.state == WorkerState.TERMINATED) goto L24;
            tryReleaseCpu(WorkerState.PARKING);
            Thread.interrupted();
            park();
            goto L8
        L24:
            return;
        L23:
            return;
        L22:
            return;
        }

        private final boolean inStack() {
            if (this.nextParkedWorker == CoroutineScheduler.NOT_IN_STACK) goto L5;
            return true;
        L5:
            return false;
        }

        private final void executeTask(Task task) {
            int taskMode = task.taskContext.getTaskMode();
            idleReset(taskMode);
            beforeTask(taskMode);
            this.this$0.runSafely(task);
            afterTask(taskMode);
        }

        private final void beforeTask(int taskMode) {
            if (taskMode != 0) goto L5;
            return;
        L5:
            if (tryReleaseCpu(WorkerState.BLOCKING) == false) goto L8;
            this.this$0.signalCpuWork();
            return;
        }

        private final void afterTask(int taskMode) {
            if (taskMode != 0) goto L4;
            return;
        L4:
            CoroutineScheduler this_$iv = this.this$0;
            CoroutineScheduler.access$getControlState$volatile$FU().addAndGet(this_$iv, CoroutineScheduler.PARKED_VERSION_MASK);
            WorkerState currentState = this.state;
            if (currentState != WorkerState.TERMINATED) goto L7;
            return;
        L7:
            if (DebugKt.getASSERTIONS_ENABLED() == true) goto L9;
        L16:
            this.state = WorkerState.DORMANT;
            return;
        L9:
            if (currentState != WorkerState.BLOCKING) goto L11;
            boolean r2 = true;
        L12:
            if (r2 == true) goto L16;
            throw new AssertionError();
        L11:
            r2 = false;
            goto L12
        }

        public final int nextInt(int upperBound) {
            int r = this.rngState;
            int r2 = r ^ (r << 13);
            int r3 = r2 ^ (r2 >> 17);
            int r4 = r3 ^ (r3 << 5);
            this.rngState = r4;
            int mask = upperBound - 1;
            if ((mask & upperBound) != 0) goto L7;
            return r4 & mask;
        L7:
            return (Integer.MAX_VALUE & r4) % upperBound;
        }

        private final void park() {
            if (this.terminationDeadline != 0) goto L5;
            this.terminationDeadline = System.nanoTime() + this.this$0.idleWorkerKeepAliveNs;
        L5:
            LockSupport.parkNanos(this.this$0.idleWorkerKeepAliveNs);
            if ((System.nanoTime() - this.terminationDeadline) < 0) goto L9;
            this.terminationDeadline = 0;
            tryTerminateWorker();
            return;
        }

        private final void tryTerminateWorker() {
            Object lock$iv = this.this$0.workers;
            CoroutineScheduler this_$iv = this.this$0;
            monitor-enter(lock$iv);
        L25:
            th = move-exception;
            throw th;
        L6:
            if (this_$iv.isTerminated() == false) goto L10;
            monitor-exit(lock$iv);
            return;
        L10:
            int r5 = (int) (CoroutineScheduler.access$getControlState$volatile$FU().get(this_$iv) & 2097151);     // Catch: Throwable -> L25
            int $i$f$getCreatedWorkers = this_$iv.corePoolSize;     // Catch: Throwable -> L25
            if (r5 > $i$f$getCreatedWorkers) goto L15;
            monitor-exit(lock$iv);
            return;
        L15:
            if (getWorkerCtl$volatile$FU$kotlinx_coroutines_core().compareAndSet(this, -1, 1) == true) goto L18;
            monitor-exit(lock$iv);
            return;
        L18:
            int oldIndex = this.indexInArray;     // Catch: Throwable -> L25
            setIndexInArray(0);     // Catch: Throwable -> L25
            this_$iv.parkedWorkersStackTopUpdate(this, oldIndex, 0);     // Catch: Throwable -> L25
            long state$iv$iv = CoroutineScheduler.access$getControlState$volatile$FU().getAndDecrement(this_$iv);     // Catch: Throwable -> L25
            int lastIndex = (int) (2097151 & state$iv$iv);     // Catch: Throwable -> L25
            if (lastIndex == oldIndex) goto L21;
            Worker r6 = this_$iv.workers.get(lastIndex);     // Catch: Throwable -> L25
            Intrinsics.checkNotNull(r6);     // Catch: Throwable -> L25
            Worker lastWorker = r6;     // Catch: Throwable -> L25
            this_$iv.workers.setSynchronized(oldIndex, lastWorker);     // Catch: Throwable -> L25
            lastWorker.setIndexInArray(oldIndex);     // Catch: Throwable -> L25
            this_$iv.parkedWorkersStackTopUpdate(lastWorker, lastIndex, oldIndex);     // Catch: Throwable -> L25
        L21:
            this_$iv.workers.setSynchronized(lastIndex, null);     // Catch: Throwable -> L25
            Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L25
            monitor-exit(lock$iv);
            this.state = WorkerState.TERMINATED;
        }

        private final void idleReset(int mode) {
            this.terminationDeadline = 0;
            if (this.state == WorkerState.PARKING) goto L5;
            return;
        L5:
            if (DebugKt.getASSERTIONS_ENABLED() == false) goto L14;
            boolean r1 = true;
            if (mode == 1) goto L10;
            r1 = false;
        L10:
            if (r1 == true) goto L14;
            throw new AssertionError();
        L14:
            this.state = WorkerState.BLOCKING;
        }

        public final Task findTask(boolean mayHaveLocalTasks) {
            if (tryAcquireCpuPermit() == false) goto L7;
            return findAnyTask(mayHaveLocalTasks);
        L7:
            return findBlockingTask();
        }

        private final Task findBlockingTask() {
            Task r0 = this.localQueue.pollBlocking();
            if (r0 != null) goto L8;
            Task r1 = this.this$0.globalBlockingQueue.removeFirstOrNull();
            if (r1 == null) goto L7;
            return r1;
        L7:
            return trySteal(1);
        L8:
            return r0;
        }

        private final Task findCpuTask() {
            Task r0 = this.localQueue.pollCpu();
            if (r0 != null) goto L8;
            Task r1 = this.this$0.globalBlockingQueue.removeFirstOrNull();
            if (r1 == null) goto L7;
            return r1;
        L7:
            return trySteal(2);
        L8:
            return r0;
        }

        private final Task findAnyTask(boolean scanLocalQueue) {
            if (scanLocalQueue == true) goto L4;
            Task it = pollGlobalQueues();
            if (it != null) goto L24;
        L26:
            return trySteal(3);
        L24:
            return it;
        L4:
            if (nextInt(this.this$0.corePoolSize * 2) != 0) goto L6;
            boolean globalFirst = true;
        L7:
            if (globalFirst == false) goto L12;
            Task it2 = pollGlobalQueues();
            if (it2 == null) goto L12;
            return it2;
        L12:
            Task it3 = this.localQueue.poll();
            if (it3 != null) goto L15;
            if (globalFirst == true) goto L26;
            Task it4 = pollGlobalQueues();
            if (it4 == null) goto L26;
            return it4;
        L15:
            return it3;
        L6:
            globalFirst = false;
            goto L7
        }

        private final Task pollGlobalQueues() {
            int r0 = nextInt(2);
            CoroutineScheduler r1 = this.this$0;
            if (r0 != 0) goto L10;
            Task it = r1.globalCpuQueue.removeFirstOrNull();
            if (it == null) goto L9;
            return it;
        L9:
            return this.this$0.globalBlockingQueue.removeFirstOrNull();
        L10:
            Task it2 = r1.globalBlockingQueue.removeFirstOrNull();
            if (it2 == null) goto L15;
            return it2;
        L15:
            return this.this$0.globalCpuQueue.removeFirstOrNull();
        }

        private final Task trySteal(int stealingMode) {
            CoroutineScheduler this_$iv = this.this$0;
            int created = (int) (CoroutineScheduler.access$getControlState$volatile$FU().get(this_$iv) & 2097151);
            if (created >= 2) goto L5;
            return null;
        L5:
            int currentIndex = nextInt(created);
            long minDelay = Long.MAX_VALUE;
            CoroutineScheduler r6 = this.this$0;
            int r7 = 0;
        L6:
            long r8 = 0;
            if (r7 >= created) goto L24;
            currentIndex = currentIndex + 1;
            if (currentIndex <= created) goto L11;
            currentIndex = 1;
        L11:
            Worker worker = r6.workers.get(currentIndex);
            if (worker == null) goto L22;
            if (worker == this) goto L22;
            long stealResult = worker.localQueue.trySteal(stealingMode, this.stolenTask);
            if (stealResult == (-1)) goto L16;
            if (stealResult <= 0) goto L22;
            minDelay = Math.min(minDelay, stealResult);
            goto L22
        L16:
            Task result = this.stolenTask.element;
            this.stolenTask.element = null;
            return result;
        L22:
            r7 = r7 + 1;
            goto L6
        L24:
            if (minDelay == Long.MAX_VALUE) goto L26;
            r8 = minDelay;
        L26:
            this.minDelayUntilStealableTaskNs = r8;
            return null;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final enum WorkerState extends Enum<WorkerState> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ WorkerState[] $VALUES = null;
        public static final WorkerState BLOCKING = null;
        public static final WorkerState CPU_ACQUIRED = null;
        public static final WorkerState DORMANT = null;
        public static final WorkerState PARKING = null;
        public static final WorkerState TERMINATED = null;

        private static final /* synthetic */ WorkerState[] $values() {
            return new WorkerState[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        public static EnumEntries<WorkerState> getEntries() {
            return $ENTRIES;
        }

        public static WorkerState valueOf(String r1) {
            return (WorkerState) Enum.valueOf(WorkerState.class, r1);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) $VALUES.clone();
        }

        private WorkerState(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            CPU_ACQUIRED = new WorkerState("CPU_ACQUIRED", 0);
            BLOCKING = new WorkerState("BLOCKING", 1);
            PARKING = new WorkerState("PARKING", 2);
            DORMANT = new WorkerState("DORMANT", 3);
            TERMINATED = new WorkerState("TERMINATED", 4);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    private final /* synthetic */ long getControlState$volatile() {
        return this.controlState$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater getControlState$volatile$FU() {
        return controlState$volatile$FU;
    }

    private final /* synthetic */ long getParkedWorkersStack$volatile() {
        return this.parkedWorkersStack$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater getParkedWorkersStack$volatile$FU() {
        return parkedWorkersStack$volatile$FU;
    }

    private final /* synthetic */ int get_isTerminated$volatile() {
        return this._isTerminated$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater get_isTerminated$volatile$FU() {
        return _isTerminated$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu(Object r3, AtomicLongFieldUpdater r4, Function1<? super Long, Unit> r5) {
    L2:
        r5.invoke(Long.valueOf(r4.get(r3)));
        goto L2
    }

    private final /* synthetic */ void setControlState$volatile(long r1) {
        this.controlState$volatile = r1;
    }

    private final /* synthetic */ void setParkedWorkersStack$volatile(long r1) {
        this.parkedWorkersStack$volatile = r1;
    }

    private final /* synthetic */ void set_isTerminated$volatile(int r1) {
        this._isTerminated$volatile = r1;
    }

    public CoroutineScheduler(int corePoolSize, int maxPoolSize, long idleWorkerKeepAliveNs, String schedulerName) {
        this.corePoolSize = corePoolSize;
        this.maxPoolSize = maxPoolSize;
        this.idleWorkerKeepAliveNs = idleWorkerKeepAliveNs;
        this.schedulerName = schedulerName;
        if (this.corePoolSize < 1) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L32;
        if (this.maxPoolSize < this.corePoolSize) goto L10;
        boolean r1 = true;
    L12:
        if (r1 == false) goto L30;
        if (this.maxPoolSize > 2097150) goto L16;
        boolean r2 = true;
    L17:
        if (r2 == false) goto L28;
        if (this.idleWorkerKeepAliveNs <= 0) goto L21;
        boolean r3 = true;
    L22:
        if (r3 == false) goto L26;
        this.globalCpuQueue = new GlobalQueue();
        this.globalBlockingQueue = new GlobalQueue();
        this.workers = new ResizableAtomicArray((this.corePoolSize + 1) * 2);
        this.controlState$volatile = ((long) this.corePoolSize) << 42;
        this._isTerminated$volatile = 0;
        return;
    L26:
        throw new IllegalArgumentException(("Idle worker keep alive time " + this.idleWorkerKeepAliveNs + " must be positive").toString());
    L21:
        r3 = false;
        goto L22
    L28:
        throw new IllegalArgumentException(("Max pool size " + this.maxPoolSize + " should not exceed maximal supported number of threads 2097150").toString());
    L16:
        r2 = false;
        goto L17
    L30:
        throw new IllegalArgumentException(("Max pool size " + this.maxPoolSize + " should be greater than or equals to core pool size " + this.corePoolSize).toString());
    L10:
        r1 = false;
        goto L12
    L32:
        throw new IllegalArgumentException(("Core pool size " + this.corePoolSize + " should be at least 1").toString());
    L5:
        r0 = false;
        goto L6
    }

    public static final /* synthetic */ AtomicLongFieldUpdater access$getControlState$volatile$FU() {
        return getControlState$volatile$FU();
    }

    public /* synthetic */ CoroutineScheduler(int r7, int r8, long r9, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 4) == 0) goto L5;
        long r3 = TasksKt.IDLE_WORKER_KEEP_ALIVE_NS;
    L7:
        if ((r12 & 8) == 0) goto L9;
        String r5 = TasksKt.DEFAULT_SCHEDULER_NAME;
    L10:
        this(r7, r8, r3, r5);
        return;
    L9:
        r5 = r11;
        goto L10
    L5:
        r3 = r9;
        goto L7
    }

    private final boolean addToGlobalQueue(Task task) {
        boolean r3 = true;
        if (task.taskContext.getTaskMode() == 1) goto L6;
        r3 = false;
    L6:
        if (r3 == false) goto L9;
        return this.globalBlockingQueue.addLast(task);
    L9:
        return this.globalCpuQueue.addLast(task);
    }

    public final void parkedWorkersStackTopUpdate(Worker worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater handler$atomicfu$iv = getParkedWorkersStack$volatile$FU();
    L3:
        long top = handler$atomicfu$iv.get(this);
        int index = (int) (2097151 & top);
        long updVersion = (PARKED_VERSION_INC + top) & PARKED_VERSION_MASK;
        if (index != oldIndex) goto L8;
        if (newIndex != 0) goto L7;
        int r2 = parkedWorkersStackNextIndex(worker);
    L9:
        int updIndex = r2;
        if (updIndex < 0) goto L3;
        if (getParkedWorkersStack$volatile$FU().compareAndSet(this, top, ((long) updIndex) | updVersion) == false) goto L3;
        return;
    L7:
        r2 = newIndex;
        goto L9
    L8:
        r2 = index;
        goto L9
    }

    public final boolean parkedWorkersStackPush(Worker worker) {
        if (worker.getNextParkedWorker() == NOT_IN_STACK) goto L5;
        return false;
    L5:
        AtomicLongFieldUpdater handler$atomicfu$iv = getParkedWorkersStack$volatile$FU();
    L6:
        long top = handler$atomicfu$iv.get(this);
        int index = (int) (2097151 & top);
        long updVersion = PARKED_VERSION_MASK & (PARKED_VERSION_INC + top);
        int updIndex = worker.getIndexInArray();
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L9;
    L16:
        worker.setNextParkedWorker(this.workers.get(index));
        if (getParkedWorkersStack$volatile$FU().compareAndSet(this, top, ((long) updIndex) | updVersion) == false) goto L6;
        return true;
    L9:
        if (updIndex == 0) goto L11;
        int r0 = 1;
    L12:
        if (r0 != 0) goto L16;
        throw new AssertionError();
    L11:
        r0 = 0;
        goto L12
    }

    private final Worker parkedWorkersStackPop() {
        AtomicLongFieldUpdater handler$atomicfu$iv = getParkedWorkersStack$volatile$FU();
    L3:
        long top = handler$atomicfu$iv.get(this);
        int index = (int) (2097151 & top);
        Worker worker = this.workers.get(index);
        if (worker == null) goto L5;
        long updVersion = (PARKED_VERSION_INC + top) & PARKED_VERSION_MASK;
        int updIndex = parkedWorkersStackNextIndex(worker);
        if (updIndex < 0) goto L3;
        if (getParkedWorkersStack$volatile$FU().compareAndSet(this, top, ((long) updIndex) | updVersion) == false) goto L3;
        worker.setNextParkedWorker(NOT_IN_STACK);
        return worker;
    L5:
        return null;
    }

    private final int parkedWorkersStackNextIndex(Worker worker) {
        Object next = worker.getNextParkedWorker();
    L4:
        if (next == NOT_IN_STACK) goto L5;
        if (next == null) goto L8;
        Worker nextWorker = (Worker) next;
        int updIndex = nextWorker.getIndexInArray();
        if (updIndex != 0) goto L12;
        next = nextWorker.getNextParkedWorker();
        goto L4
    L12:
        return updIndex;
    L8:
        return 0;
    L5:
        return -1;
    }

    private final int getCreatedWorkers() {
        return (int) (access$getControlState$volatile$FU().get(this) & 2097151);
    }

    private final int getAvailableCpuPermits() {
        long state$iv = getControlState$volatile$FU().get(this);
        return (int) ((CPU_PERMITS_MASK & state$iv) >> 42);
    }

    private final int createdWorkers(long state) {
        return (int) (2097151 & state);
    }

    private final int blockingTasks(long state) {
        return (int) ((BLOCKING_MASK & state) >> 21);
    }

    public final int availableCpuPermits(long state) {
        return (int) ((CPU_PERMITS_MASK & state) >> 42);
    }

    private final int incrementCreatedWorkers() {
        long state$iv = getControlState$volatile$FU().incrementAndGet(this);
        return (int) (2097151 & state$iv);
    }

    private final int decrementCreatedWorkers() {
        long state$iv = access$getControlState$volatile$FU().getAndDecrement(this);
        return (int) (2097151 & state$iv);
    }

    private final long incrementBlockingTasks() {
        return getControlState$volatile$FU().addAndGet(this, PARKED_VERSION_INC);
    }

    private final void decrementBlockingTasks() {
        access$getControlState$volatile$FU().addAndGet(this, PARKED_VERSION_MASK);
    }

    private final boolean tryAcquireCpuPermit() {
        AtomicLongFieldUpdater handler$atomicfu$iv = access$getControlState$volatile$FU();
    L3:
        long state = handler$atomicfu$iv.get(this);
        if (((int) ((CPU_PERMITS_MASK & state) >> 42)) == 0) goto L5;
        long update = state - 4398046511104L;
        if (access$getControlState$volatile$FU().compareAndSet(this, state, update) == false) goto L3;
        return true;
    L5:
        return false;
    }

    private final long releaseCpuPermit() {
        return access$getControlState$volatile$FU().addAndGet(this, 4398046511104L);
    }

    public final boolean isTerminated() {
        if (get_isTerminated$volatile$FU().get(this) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    static {
        Companion = new Companion(null);
        parkedWorkersStack$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
        controlState$volatile$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
        _isTerminated$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
        NOT_IN_STACK = new Symbol("NOT_IN_STACK");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        dispatch$default(this, command, null, false, 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown(10000);
    }

    public final void shutdown(long timeout) {
        boolean r2 = false;
        if (get_isTerminated$volatile$FU().compareAndSet(this, 0, 1) == true) goto L5;
        return;
    L5:
        Worker currentWorker = currentWorker();
        Object lock$iv = this.workers;
        monitor-enter(lock$iv);
        int created = (int) (access$getControlState$volatile$FU().get(this) & 2097151);
        monitor-exit(lock$iv);
        int i = 1;
        if (1 > created) goto L33;
    L13:
        Worker r5 = this.workers.get(i);
        Intrinsics.checkNotNull(r5);
        Worker worker = r5;
        if (worker == currentWorker) goto L30;
    L16:
        if (worker.getState() == Thread.State.TERMINATED) goto L19;
        LockSupport.unpark(worker);
        worker.join(timeout);
        goto L16
    L19:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L21;
    L28:
        worker.localQueue.offloadAllWorkTo(this.globalBlockingQueue);
        goto L30
    L21:
        if (worker.state != WorkerState.TERMINATED) goto L23;
        int r6 = 1;
    L24:
        if (r6 != 0) goto L28;
        throw new AssertionError();
    L23:
        r6 = 0;
    L30:
        if (i == created) goto L33;
        i = i + 1;
    L33:
        this.globalBlockingQueue.close();
        this.globalCpuQueue.close();
    L35:
        if (currentWorker == null) goto L38;
        Task task = currentWorker.findTask(true);
        if (task == null) goto L38;
    L55:
        runSafely(task);
    L38:
        task = this.globalCpuQueue.removeFirstOrNull();
        if (task != null) goto L55;
        task = this.globalBlockingQueue.removeFirstOrNull();
        if (task != null) goto L55;
        if (currentWorker == null) goto L45;
        currentWorker.tryReleaseCpu(WorkerState.TERMINATED);
    L45:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L53;
        long state$iv$iv = getControlState$volatile$FU().get(this);
        if (((int) ((CPU_PERMITS_MASK & state$iv$iv) >> 42)) != this.corePoolSize) goto L49;
        r2 = true;
    L49:
        if (r2 == true) goto L53;
        throw new AssertionError();
    L53:
        getParkedWorkersStack$volatile$FU().set(this, 0);
        getControlState$volatile$FU().set(this, 0);
        return;
    L56:
        th = move-exception;
        throw th;
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler r0, Runnable r1, TaskContext r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = TasksKt.NonBlockingContext;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = false;
    L8:
        r0.dispatch(r1, r2, r3);
    }

    public final void dispatch(Runnable block, TaskContext taskContext, boolean tailDispatch) {
        AbstractTimeSource r0 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r0 == null) goto L5;
        r0.trackTask();
    L5:
        Task task = createTask(block, taskContext);
        boolean skipUnpark = false;
        if (task.taskContext.getTaskMode() != 1) goto L8;
        boolean isBlockingTask = true;
    L10:
        if (isBlockingTask == false) goto L12;
        long stateSnapshot = getControlState$volatile$FU().addAndGet(this, PARKED_VERSION_INC);
    L13:
        Worker currentWorker = currentWorker();
        Task notAdded = submitToLocalQueue(currentWorker, task, tailDispatch);
        if (notAdded != null) goto L16;
    L20:
        if (tailDispatch == false) goto L23;
        if (currentWorker == null) goto L23;
        skipUnpark = true;
    L23:
        if (isBlockingTask == false) goto L25;
        signalBlockingWork(stateSnapshot, skipUnpark);
        return;
    L25:
        if (skipUnpark == false) goto L27;
        return;
    L27:
        signalCpuWork();
        return;
    L16:
        if (addToGlobalQueue(notAdded) == true) goto L20;
        throw new RejectedExecutionException(this.schedulerName + " was terminated");
    L12:
        stateSnapshot = 0;
        goto L13
    L8:
        isBlockingTask = false;
        goto L10
    }

    public final Task createTask(Runnable block, TaskContext taskContext) {
        long nanoTime = TasksKt.schedulerTimeSource.nanoTime();
        if ((block instanceof Task) == false) goto L7;
        ((Task) block).submissionTime = nanoTime;
        ((Task) block).taskContext = taskContext;
        return (Task) block;
    L7:
        return new TaskImpl(block, nanoTime, taskContext);
    }

    private final void signalBlockingWork(long stateSnapshot, boolean skipUnpark) {
        if (skipUnpark == false) goto L5;
        return;
    L5:
        if (tryUnpark() == false) goto L8;
        return;
    L8:
        if (tryCreateWorker(stateSnapshot) == false) goto L10;
        return;
    L10:
        tryUnpark();
    }

    public final void signalCpuWork() {
        if (tryUnpark() == false) goto L6;
        return;
    L6:
        if (tryCreateWorker$default(this, 0, 1, null) == false) goto L8;
        return;
    L8:
        tryUnpark();
    }

    static /* synthetic */ boolean tryCreateWorker$default(CoroutineScheduler r0, long r1, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = getControlState$volatile$FU().get(r0);
    L6:
        return r0.tryCreateWorker(r1);
    }

    private final boolean tryCreateWorker(long state) {
        int created = (int) (2097151 & state);
        int blocking = (int) ((BLOCKING_MASK & state) >> 21);
        int cpuWorkers = RangesKt.coerceAtLeast(created - blocking, 0);
        if (cpuWorkers >= this.corePoolSize) goto L11;
        int newCpuWorkers = createNewWorker();
        if (newCpuWorkers == 1) goto L7;
    L9:
        if (newCpuWorkers <= 0) goto L11;
        return true;
    L7:
        if (this.corePoolSize <= 1) goto L9;
        createNewWorker();
    L11:
        return false;
    }

    private final boolean tryUnpark() {
    L2:
        Worker worker = parkedWorkersStackPop();
        if (worker == null) goto L4;
        if (Worker.getWorkerCtl$volatile$FU$kotlinx_coroutines_core().compareAndSet(worker, -1, 0) == false) goto L2;
        LockSupport.unpark(worker);
        return true;
    L4:
        return false;
    }

    private final int createNewWorker() {
        Object lock$iv = this.workers;
        monitor-enter(lock$iv);
    L40:
        th = move-exception;
        throw th;
    L6:
        if (isTerminated() == false) goto L10;
        monitor-exit(lock$iv);
        return -1;
    L10:
        long state = getControlState$volatile$FU().get(this);     // Catch: Throwable -> L40
        int created = (int) (state & 2097151);     // Catch: Throwable -> L40
        int blocking = (int) ((BLOCKING_MASK & state) >> 21);     // Catch: Throwable -> L40
        int cpuWorkers = RangesKt.coerceAtLeast(created - blocking, 0);     // Catch: Throwable -> L40
        if (cpuWorkers < this.corePoolSize) goto L15;
        monitor-exit(lock$iv);
        return 0;
    L15:
        if (created < this.maxPoolSize) goto L19;
        monitor-exit(lock$iv);
        return 0;
    L19:
        int newIndex = ((int) (access$getControlState$volatile$FU().get(this) & 2097151)) + 1;     // Catch: Throwable -> L40
        if (newIndex > 0) goto L22;
    L24:
        boolean r14 = false;
    L25:
        if (r14 == false) goto L39;
        Worker r15 = new Worker(this, newIndex);     // Catch: Throwable -> L40
        this.workers.setSynchronized(newIndex, r15);     // Catch: Throwable -> L40
        long state$iv$iv = getControlState$volatile$FU().incrementAndGet(this);     // Catch: Throwable -> L40
        if (newIndex != ((int) (state$iv$iv & 2097151))) goto L30;
        boolean r13 = true;
    L31:
        if (r13 == false) goto L37;
        int cpuWorkers2 = cpuWorkers + 1;
        monitor-exit(lock$iv);
        r15.start();
        return cpuWorkers2;
    L37:
        throw new IllegalArgumentException("Failed requirement.".toString());     // Catch: Throwable -> L40
    L30:
        r13 = false;
        goto L31
    L39:
        throw new IllegalArgumentException("Failed requirement.".toString());     // Catch: Throwable -> L40
    L22:
        if (this.workers.get(newIndex) != null) goto L24;
        r14 = true;
        goto L25
    }

    private final Task submitToLocalQueue(Worker $this$submitToLocalQueue, Task task, boolean tailDispatch) {
        if ($this$submitToLocalQueue != null) goto L5;
        return task;
    L5:
        if ($this$submitToLocalQueue.state != WorkerState.TERMINATED) goto L8;
        return task;
    L8:
        if (task.taskContext.getTaskMode() == 0) goto L10;
    L12:
        $this$submitToLocalQueue.mayHaveLocalTasks = true;
        return $this$submitToLocalQueue.localQueue.add(task, tailDispatch);
    L10:
        if ($this$submitToLocalQueue.state != WorkerState.BLOCKING) goto L12;
        return task;
    }

    private final Worker currentWorker() {
        Thread r0 = Thread.currentThread();
        if ((r0 instanceof Worker) == false) goto L5;
        Worker r1 = (Worker) r0;
    L6:
        if (r1 == null) goto L11;
        Worker it = r1;
        if (Intrinsics.areEqual(Worker.access$getThis$0$p(it), this) == true) goto L10;
        return null;
    L10:
        return r1;
    L11:
        return null;
    L5:
        r1 = null;
        goto L6
    }

    public String toString() {
        int parkedWorkers = 0;
        int blockingWorkers = 0;
        int cpuWorkers = 0;
        int dormant = 0;
        int terminated = 0;
        ArrayList queueSizes = new ArrayList();
        int index = 1;
        int r8 = this.workers.currentLength();
    L3:
        if (index >= r8) goto L18;
        Worker worker = this.workers.get(index);
        if (worker == null) goto L17;
        int queueSize = worker.localQueue.getSize$kotlinx_coroutines_core();
        WorkerState r11 = worker.state;
        switch(WhenMappings.$EnumSwitchMapping$0[r11.ordinal()]) {
            case 1: goto L16;
            case 2: goto L15;
            case 3: goto L14;
            case 4: goto L11;
            case 5: goto L10;
            default: goto L17;
        };
    L10:
        terminated = terminated + 1;
        goto L17
    L11:
        dormant = dormant + 1;
        if (queueSize <= 0) goto L17;
        queueSizes.add(new StringBuilder().append(queueSize).append('d').toString());
        goto L17
    L14:
        cpuWorkers = cpuWorkers + 1;
        queueSizes.add(new StringBuilder().append(queueSize).append('c').toString());
        goto L17
    L15:
        blockingWorkers = blockingWorkers + 1;
        queueSizes.add(new StringBuilder().append(queueSize).append('b').toString());
        goto L17
    L16:
        parkedWorkers = parkedWorkers + 1;
    L17:
        index = index + 1;
        goto L3
    L18:
        long state = getControlState$volatile$FU().get(this);
        StringBuilder r9 = new StringBuilder();
        r9.append(this.schedulerName).append('@').append(DebugStringsKt.getHexAddress(this)).append("[Pool Size {core = ").append(this.corePoolSize).append(", max = ").append(this.maxPoolSize).append("}, Worker States {CPU = ").append(cpuWorkers).append(", blocking = ").append(blockingWorkers).append(", parked = ").append(parkedWorkers).append(", dormant = ").append(dormant).append(", terminated = ").append(terminated).append("}, running workers queues = ").append(queueSizes).append(", global CPU queue size = ").append(this.globalCpuQueue.getSize()).append(", global blocking queue size = ").append(this.globalBlockingQueue.getSize());
        r9.append(", Control State {created workers= ").append((int) (2097151 & state)).append(", blocking tasks = ").append((int) ((BLOCKING_MASK & state) >> 21)).append(", CPUs acquired = ").append(this.corePoolSize - ((int) ((CPU_PERMITS_MASK & state) >> 42))).append("}]");
        return r9.toString();
    }

    public final void runSafely(Task task) {
        task.run();     // Catch: Throwable -> L7
        AbstractTimeSource r0 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r0 == null) goto L22;
    L5:
        r0.unTrackTask();
        return;
    L22:
        return;
    L7:
        e = move-exception;
        Thread thread = Thread.currentThread();     // Catch: Throwable -> L13
        thread.getUncaughtExceptionHandler().uncaughtException(thread, e);     // Catch: Throwable -> L13
        r0 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r0 != null) goto L5;
        return;
    L13:
        th = move-exception;
        AbstractTimeSource r1 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r1 == null) goto L17;
        r1.unTrackTask();
    L17:
        throw th;
    }
}
