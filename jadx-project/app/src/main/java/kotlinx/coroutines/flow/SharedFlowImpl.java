package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001c\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0016\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010AJ\u0016\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006i"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", "head", "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", "index", "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* JADX INFO: compiled from: SharedFlow.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Emitter implements DisposableHandle {
        public final Continuation<Unit> cont;
        public final SharedFlowImpl<?> flow;
        public long index;
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(SharedFlowImpl<?> r1, long index, Object value, Continuation<? super Unit> r5) {
            this.flow = r1;
            this.index = index;
            this.value = value;
            this.cont = r5;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            SharedFlowImpl.access$cancelEmitter(this.flow, this);
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[BufferOverflow.values().length];
            r0[BufferOverflow.SUSPEND.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[BufferOverflow.DROP_LATEST.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[BufferOverflow.DROP_OLDEST.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {382, 389, 392}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        AnonymousClass1(SharedFlowImpl<T> r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.collect$suspendImpl(this.this$0, null, this);
        }
    }

    protected static /* synthetic */ void getLastReplayedLocked$annotations() {
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> r2, Continuation<?> r3) {
        return collect$suspendImpl(this, r2, r3);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T r2, Continuation<? super Unit> r3) {
        return emit$suspendImpl(this, r2, r3);
    }

    public static final /* synthetic */ Object access$awaitValue(SharedFlowImpl $this, SharedFlowSlot slot, Continuation $completion) {
        return $this.awaitValue(slot, $completion);
    }

    public static final /* synthetic */ void access$cancelEmitter(SharedFlowImpl $this, Emitter emitter) {
        $this.cancelEmitter(emitter);
    }

    public static final /* synthetic */ Object access$emitSuspend(SharedFlowImpl $this, Object value, Continuation $completion) {
        return $this.emitSuspend(value, $completion);
    }

    public static final /* synthetic */ void access$enqueueLocked(SharedFlowImpl $this, Object item) {
        $this.enqueueLocked(item);
    }

    public static final /* synthetic */ Continuation[] access$findSlotsToResumeLocked(SharedFlowImpl $this, Continuation[] resumesIn) {
        return $this.findSlotsToResumeLocked(resumesIn);
    }

    public static final /* synthetic */ int access$getBufferCapacity$p(SharedFlowImpl $this) {
        return $this.bufferCapacity;
    }

    public static final /* synthetic */ long access$getHead(SharedFlowImpl $this) {
        return $this.getHead();
    }

    public static final /* synthetic */ int access$getQueueSize$p(SharedFlowImpl $this) {
        return $this.queueSize;
    }

    public static final /* synthetic */ int access$getTotalSize(SharedFlowImpl $this) {
        return $this.getTotalSize();
    }

    public static final /* synthetic */ void access$setQueueSize$p(SharedFlowImpl $this, int r1) {
        $this.queueSize = r1;
    }

    public static final /* synthetic */ boolean access$tryEmitLocked(SharedFlowImpl $this, Object value) {
        return $this.tryEmitLocked(value);
    }

    public static final /* synthetic */ long access$tryPeekLocked(SharedFlowImpl $this, SharedFlowSlot slot) {
        return $this.tryPeekLocked(slot);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ AbstractSharedFlowSlot createSlot() {
        return createSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ AbstractSharedFlowSlot[] createSlotArray(int size) {
        return createSlotArray(size);
    }

    public SharedFlowImpl(int replay, int bufferCapacity, BufferOverflow onBufferOverflow) {
        this.replay = replay;
        this.bufferCapacity = bufferCapacity;
        this.onBufferOverflow = onBufferOverflow;
    }

    private final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + ((long) this.bufferSize)) - this.replayIndex);
    }

    private final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final long getBufferEndIndex() {
        return getHead() + ((long) this.bufferSize);
    }

    private final long getQueueEndIndex() {
        return (getHead() + ((long) this.bufferSize)) + ((long) this.queueSize);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        monitor-enter(this);
        int replaySize = getReplaySize();     // Catch: Throwable -> L18
        if (replaySize != 0) goto L10;
        List<T> r4 = CollectionsKt.emptyList();     // Catch: Throwable -> L18
        monitor-exit(this);
        return r4;
    L10:
        ArrayList result = new ArrayList(replaySize);     // Catch: Throwable -> L18
        Object[] buffer = this.buffer;     // Catch: Throwable -> L18
        Intrinsics.checkNotNull(buffer);     // Catch: Throwable -> L18
        int i = 0;
    L11:
        if (i >= replaySize) goto L15;
        result.add(SharedFlowKt.access$getBufferAt(buffer, this.replayIndex + ((long) i)));     // Catch: Throwable -> L18
        i = i + 1;
        goto L11
    L15:
        monitor-exit(this);
        return result;
    L18:
        th = move-exception;
        throw th;
    }

    protected final T getLastReplayedLocked() {
        Object[] r0 = this.buffer;
        Intrinsics.checkNotNull(r0);
        return (T) SharedFlowKt.access$getBufferAt(r0, (this.replayIndex + ((long) getReplaySize())) - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlinx.coroutines.flow.FlowCollector<? super T>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v8, types: [kotlinx.coroutines.flow.SharedFlowSlot] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlinx.coroutines.flow.SharedFlowSlot] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d4 -> B:29:0x009d). Please report as a decompilation issue!!! */
    static /* synthetic */ <T> Object collect$suspendImpl(SharedFlowImpl<T> r7, FlowCollector<? super T> r8, Continuation<?> r9) {
        if ((r9 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r10 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L21;
            case 1: goto L18;
            case 2: goto L15;
            case 3: goto L12;
            default: goto L11;
        };
    L12:
        Job r11 = (Job) r0.L$3;
        boolean r12 = (FlowCollector<? super T>) ((SharedFlowSlot) r0.L$2);
        FlowCollector r2 = (FlowCollector) r0.L$1;
        SharedFlowImpl r3 = (SharedFlowImpl) r0.L$0;
        ResultKt.throwOnFailure(r10);     // Catch: Throwable -> L43
        Job r4 = r11;
        ?? r13 = r2;
        r8 = r12;
    L29:
        Job r6 = r4;
        ?? r5 = r13;
        Job r14 = r6;
    L30:
        Object r15 = r3.tryTakeValue((SharedFlowSlot) r8);     // Catch: Throwable -> L43
        if (r15 != SharedFlowKt.NO_VALUE) goto L36;
        r0.L$0 = r3;     // Catch: Throwable -> L43
        r0.L$1 = r5;     // Catch: Throwable -> L43
        r0.L$2 = (Object) r8;     // Catch: Throwable -> L43
        r0.L$3 = r14;     // Catch: Throwable -> L43
        r0.label = 2;     // Catch: Throwable -> L43
        if (r3.awaitValue((SharedFlowSlot) r8, r0) != r1) goto L30;
        return r1;
    L36:
        if (r14 == null) goto L38;
        JobKt.ensureActive(r14);     // Catch: Throwable -> L43
    L38:
        r0.L$0 = r3;     // Catch: Throwable -> L43
        r0.L$1 = r5;     // Catch: Throwable -> L43
        r0.L$2 = (Object) r8;     // Catch: Throwable -> L43
        r0.L$3 = r14;     // Catch: Throwable -> L43
        r0.label = 3;     // Catch: Throwable -> L43
        if (r5.emit(r15, r0) != r1) goto L41;
        return r1;
    L41:
        ?? r16 = r5;
        r4 = r14;
        r13 = r16;
        r8 = r8;
        goto L29
    L15:
        r14 = (Job) r0.L$3;
        r8 = (SharedFlowSlot) r0.L$2;
        r5 = (FlowCollector) r0.L$1;
        r3 = (SharedFlowImpl) r0.L$0;
        ResultKt.throwOnFailure(r10);     // Catch: Throwable -> L43
        goto L30
    L18:
        SharedFlowSlot r17 = (SharedFlowSlot) r0.L$2;
        FlowCollector r18 = (FlowCollector) r0.L$1;
        r3 = (SharedFlowImpl) r0.L$0;
        ResultKt.throwOnFailure(r10);     // Catch: Throwable -> L43
        ?? r19 = r18;
        SharedFlowSlot r20 = r17;
    L28:
        r4 = (Job) r0.getContext().get(Job.Key);     // Catch: Throwable -> L43
        r13 = r19;
        r8 = r20;
        goto L29
    L21:
        ResultKt.throwOnFailure(r10);
        r3 = r7;
        ?? r21 = r8;
        SharedFlowSlot r22 = r3.allocateSlot();
        boolean r23 = r21 instanceof SubscribedFlowCollector;     // Catch: Throwable -> L43
        r19 = r21;
        r20 = r22;
        if (r23 == false) goto L28;
        r0.L$0 = r3;     // Catch: Throwable -> L43
        r0.L$1 = r21;     // Catch: Throwable -> L43
        r0.L$2 = r22;     // Catch: Throwable -> L43
        r0.label = 1;     // Catch: Throwable -> L43
        Object r24 = ((SubscribedFlowCollector) r21).onSubscription(r0);     // Catch: Throwable -> L43
        r19 = r21;
        r20 = r22;
        if (r24 != r1) goto L28;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L43:
        th = move-exception;
        r3.freeSlot((AbstractSharedFlowSlot) r8);
        throw th;
    L7:
        r0 = new AnonymousClass1(r7, r9);
        goto L8
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r7) {
        Continuation<Unit>[] r0 = AbstractSharedFlowKt.EMPTY_RESUMES;
        monitor-enter(this);
        int r5 = 0;
        if (tryEmitLocked(r7) == false) goto L9;
        r0 = findSlotsToResumeLocked(r0);     // Catch: Throwable -> L19
        boolean emitted = true;
    L11:
        monitor-exit(this);
        int r1 = r0.length;
    L13:
        if (r5 >= r1) goto L18;
        Continuation<Unit> r2 = r0[r5];
        if (r2 == null) goto L17;
        Result.Companion r3 = Result.Companion;
        r2.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
    L17:
        r5 = r5 + 1;
        goto L13
    L18:
        return emitted;
    L9:
        emitted = false;
    L19:
        th = move-exception;
        throw th;
    }

    static /* synthetic */ <T> Object emit$suspendImpl(SharedFlowImpl<T> r2, T r3, Continuation<? super Unit> r4) {
        if (r2.tryEmit(r3) == true) goto L5;
        Object r0 = r2.emitSuspend(r3, r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r0;
    L10:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }

    private final boolean tryEmitLocked(T r15) {
        if (getNCollectors() != 0) goto L7;
        return tryEmitNoCollectorsLocked(r15);
    L7:
        if (this.bufferSize >= this.bufferCapacity) goto L9;
    L16:
        enqueueLocked(r15);
        this.bufferSize++;
        if (this.bufferSize <= this.bufferCapacity) goto L20;
        dropOldestLocked();
    L20:
        if (getReplaySize() <= this.replay) goto L22;
        updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
    L22:
        return true;
    L9:
        if (this.minCollectorIndex > this.replayIndex) goto L16;
        switch(WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()]) {
            case 1: goto L14;
            case 2: goto L13;
            default: goto L16;
        };
    L13:
        return true;
    L14:
        return false;
    }

    private final boolean tryEmitNoCollectorsLocked(T r7) {
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L13;
        if (getNCollectors() != 0) goto L7;
        boolean r2 = true;
    L8:
        if (r2 == true) goto L13;
        throw new AssertionError();
    L7:
        r2 = false;
    L13:
        if (this.replay != 0) goto L15;
        return true;
    L15:
        enqueueLocked(r7);
        this.bufferSize++;
        if (this.bufferSize <= this.replay) goto L18;
        dropOldestLocked();
    L18:
        this.minCollectorIndex = getHead() + ((long) this.bufferSize);
        return true;
    }

    private final void dropOldestLocked() {
        Object[] r0 = this.buffer;
        Intrinsics.checkNotNull(r0);
        SharedFlowKt.access$setBufferAt(r0, getHead(), null);
        this.bufferSize--;
        long newHead = getHead() + 1;
        if (this.replayIndex >= newHead) goto L6;
        this.replayIndex = newHead;
    L6:
        if (this.minCollectorIndex >= newHead) goto L9;
        correctCollectorIndexesOnDropOldest(newHead);
    L9:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L11;
        return;
    L11:
        if (getHead() != newHead) goto L13;
        boolean r3 = true;
    L14:
        if (r3 == false) goto L17;
        return;
    L17:
        throw new AssertionError();
    L13:
        r3 = false;
        goto L14
    }

    private final void correctCollectorIndexesOnDropOldest(long newHead) {
        SharedFlowImpl<T> this_$iv = this;
        if (AbstractSharedFlow.access$getNCollectors(this_$iv) == 0) goto L19;
        Object[] $this$forEach$iv$iv = AbstractSharedFlow.access$getSlots(this_$iv);
        if ($this$forEach$iv$iv == null) goto L19;
        int r7 = $this$forEach$iv$iv.length;
        int r8 = 0;
    L7:
        if (r8 >= r7) goto L19;
        Object element$iv$iv = $this$forEach$iv$iv[r8];
        if (element$iv$iv == null) goto L16;
        SharedFlowSlot slot = (SharedFlowSlot) element$iv$iv;
        if (slot.index < 0) goto L16;
        if (slot.index >= newHead) goto L16;
        slot.index = newHead;
    L16:
        r8 = r8 + 1;
    L19:
        this.minCollectorIndex = newHead;
    }

    private final void enqueueLocked(Object item) {
        int curSize = getTotalSize();
        Object[] curBuffer = this.buffer;
        if (curBuffer != null) goto L6;
        curBuffer = growBuffer(null, 0, 2);
    L8:
        SharedFlowKt.access$setBufferAt(curBuffer, getHead() + ((long) curSize), item);
        return;
    L6:
        if (curSize < curBuffer.length) goto L8;
        curBuffer = growBuffer(curBuffer, curSize, curBuffer.length * 2);
        goto L8
    }

    private final Object[] growBuffer(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L14;
        Object[] newBuffer = new Object[newSize];
        this.buffer = newBuffer;
        if (curBuffer != null) goto L9;
        return newBuffer;
    L9:
        long head = getHead();
        int i = 0;
    L10:
        if (i >= curSize) goto L12;
        SharedFlowKt.access$setBufferAt(newBuffer, ((long) i) + head, SharedFlowKt.access$getBufferAt(curBuffer, ((long) i) + head));
        i = i + 1;
        goto L10
    L12:
        return newBuffer;
    L14:
        throw new IllegalStateException("Buffer size overflow".toString());
    L4:
        r0 = false;
        goto L5
    }

    private final Object emitSuspend(T r18, Continuation<? super Unit> r19) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r19), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl cont = cancellable$iv;
        Continuation<Unit>[] r13 = AbstractSharedFlowKt.EMPTY_RESUMES;
        monitor-enter(this);
    L30:
        th = move-exception;
        throw th;
    L6:
        if (access$tryEmitLocked(this, r18) == false) goto L8;
        Result.Companion r2 = Result.Companion;     // Catch: Throwable -> L30
        cont.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));     // Catch: Throwable -> L30
        Continuation<Unit>[] r0 = access$findSlotsToResumeLocked(this, r13);     // Catch: Throwable -> L30
        Emitter emitter = null;
    L13:
        monitor-exit(this);
        if (emitter == null) goto L16;
        CancellableContinuationKt.disposeOnCancellation(cont, emitter);
    L16:
        int r3 = r0.length;
        int r4 = 0;
    L17:
        if (r4 >= r3) goto L22;
        Continuation<Unit> r5 = r0[r4];
        if (r5 == null) goto L21;
        Result.Companion r9 = Result.Companion;
        r5.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
    L21:
        r4 = r4 + 1;
        goto L17
    L22:
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L26;
        DebugProbesKt.probeCoroutineSuspended(r19);
    L26:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L29;
        return r1;
    L29:
        return Unit.INSTANCE;
    L8:
        Emitter it = new Emitter(this, access$getHead(this) + ((long) access$getTotalSize(this)), r18, cont);     // Catch: Throwable -> L30
        access$enqueueLocked(this, it);     // Catch: Throwable -> L30
        access$setQueueSize$p(this, access$getQueueSize$p(this) + 1);     // Catch: Throwable -> L30
        if (access$getBufferCapacity$p(this) == 0) goto L11;
    L12:
        emitter = it;
        r0 = r13;
        goto L13
    L11:
        r13 = access$findSlotsToResumeLocked(this, r13);     // Catch: Throwable -> L30
        goto L12
    }

    private final void cancelEmitter(Emitter emitter) {
        monitor-enter(this);
    L17:
        th = move-exception;
        throw th;
    L7:
        if (emitter.index >= getHead()) goto L10;
        monitor-exit(this);
        return;
    L10:
        Object[] buffer = this.buffer;     // Catch: Throwable -> L17
        Intrinsics.checkNotNull(buffer);     // Catch: Throwable -> L17
        if (SharedFlowKt.access$getBufferAt(buffer, emitter.index) == emitter) goto L14;
        monitor-exit(this);
        return;
    L14:
        SharedFlowKt.access$setBufferAt(buffer, emitter.index, SharedFlowKt.NO_VALUE);     // Catch: Throwable -> L17
        cleanupTailLocked();     // Catch: Throwable -> L17
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L17
        monitor-exit(this);
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long index = this.replayIndex;
        if (index >= this.minCollectorIndex) goto L5;
        this.minCollectorIndex = index;
    L5:
        return index;
    }

    public final Continuation<Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long oldIndex) {
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L13;
        if (oldIndex < this.minCollectorIndex) goto L7;
        int r1 = 1;
    L8:
        if (r1 != 0) goto L13;
        throw new AssertionError();
    L7:
        r1 = 0;
    L13:
        if (oldIndex > this.minCollectorIndex) goto L15;
        long head = getHead();
        long newMinCollectorIndex = ((long) this.bufferSize) + head;
        long r5 = 1;
        if (this.bufferCapacity == 0) goto L19;
    L21:
        SharedFlowImpl<T> this_$iv = this;
        if (AbstractSharedFlow.access$getNCollectors(this_$iv) == 0) goto L40;
        Object[] $this$forEach$iv$iv = AbstractSharedFlow.access$getSlots(this_$iv);
        if ($this$forEach$iv$iv == null) goto L38;
        int r13 = $this$forEach$iv$iv.length;
        int r14 = 0;
    L26:
        if (r14 >= r13) goto L37;
        Object element$iv$iv = $this$forEach$iv$iv[r14];
        if (element$iv$iv == null) goto L35;
        long r18 = r5;
        SharedFlowSlot slot = (SharedFlowSlot) element$iv$iv;
        if (slot.index < 0) goto L36;
        if (slot.index >= newMinCollectorIndex) goto L36;
        newMinCollectorIndex = slot.index;
    L36:
        r14 = r14 + 1;
        r5 = r18;
        goto L26
    L35:
        r18 = r5;
        goto L36
    L37:
        long r19 = r5;
    L42:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L52;
        if (newMinCollectorIndex < this.minCollectorIndex) goto L46;
        int r2 = 1;
    L47:
        if (r2 != 0) goto L52;
        throw new AssertionError();
    L46:
        r2 = 0;
    L52:
        if (newMinCollectorIndex <= this.minCollectorIndex) goto L54;
        long newBufferEndIndex = getBufferEndIndex();
        int r6 = getNCollectors();
        int r7 = this.queueSize;
        if (r6 <= 0) goto L59;
        int newBufferSize0 = (int) (newBufferEndIndex - newMinCollectorIndex);
        r7 = Math.min(r7, this.bufferCapacity - newBufferSize0);
    L59:
        int maxResumeCount = r7;
        Continuation<Unit>[] r8 = AbstractSharedFlowKt.EMPTY_RESUMES;
        long newQueueEndIndex = newBufferEndIndex + ((long) this.queueSize);
        if (maxResumeCount <= 0) goto L72;
        Continuation<Unit>[] r9 = new Continuation[maxResumeCount];
        int resumeCount = 0;
        Object[] buffer = this.buffer;
        Intrinsics.checkNotNull(buffer);
        long curEmitterIndex = newBufferEndIndex;
    L63:
        if (curEmitterIndex >= newQueueEndIndex) goto L71;
        Object emitter = SharedFlowKt.access$getBufferAt(buffer, curEmitterIndex);
        long newMinCollectorIndex2 = newMinCollectorIndex;
        if (emitter == SharedFlowKt.NO_VALUE) goto L70;
        Intrinsics.checkNotNull(emitter, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
        Emitter r3 = (Emitter) emitter;
        int resumeCount2 = resumeCount + 1;
        r9[resumeCount] = ((Emitter) emitter).cont;
        SharedFlowKt.access$setBufferAt(buffer, curEmitterIndex, SharedFlowKt.NO_VALUE);
        SharedFlowKt.access$setBufferAt(buffer, newBufferEndIndex, ((Emitter) emitter).value);
        newBufferEndIndex = newBufferEndIndex + r19;
        if (resumeCount2 >= maxResumeCount) goto L69;
        resumeCount = resumeCount2;
        goto L70
    L69:
        Continuation<Unit>[] r10 = r9;
    L73:
        int newBufferSize1 = (int) (newBufferEndIndex - head);
        if (getNCollectors() != 0) goto L76;
        long newMinCollectorIndex3 = newBufferEndIndex;
    L77:
        long newReplayIndex = Math.max(this.replayIndex, newBufferEndIndex - ((long) Math.min(this.replay, newBufferSize1)));
        if (this.bufferCapacity == 0) goto L80;
    L84:
        long newReplayIndex2 = newBufferEndIndex;
        long newBufferEndIndex2 = newReplayIndex;
    L85:
        updateBufferLocked(newBufferEndIndex2, newMinCollectorIndex3, newReplayIndex2, newQueueEndIndex);
        cleanupTailLocked();
        if (r10.length != 0) goto L88;
        boolean r20 = true;
    L89:
        if (r20 == false) goto L91;
        return r10;
    L91:
        return findSlotsToResumeLocked(r10);
    L88:
        r20 = false;
        goto L89
    L80:
        if (newReplayIndex >= newQueueEndIndex) goto L84;
        Object[] r15 = this.buffer;
        Intrinsics.checkNotNull(r15);
        if (Intrinsics.areEqual(SharedFlowKt.access$getBufferAt(r15, newReplayIndex), SharedFlowKt.NO_VALUE) == false) goto L84;
        long newReplayIndex3 = newReplayIndex + r19;
        newReplayIndex2 = newBufferEndIndex + r19;
        newBufferEndIndex2 = newReplayIndex3;
        goto L85
    L76:
        newMinCollectorIndex3 = newMinCollectorIndex2;
    L70:
        curEmitterIndex = curEmitterIndex + r19;
        newMinCollectorIndex = newMinCollectorIndex2;
        goto L63
    L71:
        newMinCollectorIndex2 = newMinCollectorIndex;
        r10 = r9;
        goto L73
    L72:
        newMinCollectorIndex2 = newMinCollectorIndex;
        r10 = r8;
        goto L73
    L54:
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    L38:
        r19 = 1;
        goto L42
    L40:
        r19 = 1;
        goto L42
    L19:
        if (this.queueSize <= 0) goto L21;
        newMinCollectorIndex = newMinCollectorIndex + 1;
        goto L21
    L15:
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    private final void updateBufferLocked(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long newHead = Math.min(newMinCollectorIndex, newReplayIndex);
        boolean r8 = true;
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        long index = getHead();
    L14:
        if (index >= newHead) goto L16;
        Object[] r7 = this.buffer;
        Intrinsics.checkNotNull(r7);
        SharedFlowKt.access$setBufferAt(r7, index, null);
        index = index + 1;
        goto L14
    L16:
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - newHead);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L27;
        if (this.bufferSize < 0) goto L21;
        int r9 = 1;
    L22:
        if (r9 != 0) goto L27;
        throw new AssertionError();
    L21:
        r9 = 0;
    L27:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L37;
        if (this.queueSize < 0) goto L31;
        int r10 = 1;
    L32:
        if (r10 != 0) goto L37;
        throw new AssertionError();
    L31:
        r10 = 0;
    L37:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L39;
        return;
    L39:
        if (this.replayIndex <= (getHead() + ((long) this.bufferSize))) goto L42;
        r8 = false;
    L42:
        if (r8 == false) goto L45;
        return;
    L45:
        throw new AssertionError();
    L5:
        if (newHead < getHead()) goto L7;
        int r11 = 1;
    L8:
        if (r11 != 0) goto L12;
        throw new AssertionError();
    L7:
        r11 = 0;
        goto L8
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity == 0) goto L5;
    L7:
        Object[] buffer = this.buffer;
        Intrinsics.checkNotNull(buffer);
    L9:
        if (this.queueSize <= 0) goto L13;
        if (SharedFlowKt.access$getBufferAt(buffer, (getHead() + ((long) getTotalSize())) - 1) != SharedFlowKt.NO_VALUE) goto L16;
        this.queueSize--;
        SharedFlowKt.access$setBufferAt(buffer, getHead() + ((long) getTotalSize()), null);
        goto L9
    L16:
        return;
    L13:
        return;
    L5:
        if (this.queueSize > 1) goto L7;
    }

    private final Object tryTakeValue(SharedFlowSlot slot) {
        Continuation<Unit>[] r0 = AbstractSharedFlowKt.EMPTY_RESUMES;
        monitor-enter(this);
        long index = tryPeekLocked(slot);     // Catch: Throwable -> L19
        if (index >= 0) goto L8;
        Object value = SharedFlowKt.NO_VALUE;     // Catch: Throwable -> L19
    L11:
        monitor-exit(this);
        int r1 = r0.length;
        int r2 = 0;
    L13:
        if (r2 >= r1) goto L18;
        Continuation<Unit> r3 = r0[r2];
        if (r3 == null) goto L17;
        Result.Companion r4 = Result.Companion;
        r3.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
    L17:
        r2 = r2 + 1;
        goto L13
    L18:
        return value;
    L8:
        long oldIndex = slot.index;     // Catch: Throwable -> L19
        Object newValue = getPeekedValueLockedAt(index);     // Catch: Throwable -> L19
        slot.index = 1 + index;     // Catch: Throwable -> L19
        r0 = updateCollectorIndexLocked$kotlinx_coroutines_core(oldIndex);     // Catch: Throwable -> L19
        value = newValue;
    L19:
        th = move-exception;
        throw th;
    }

    private final long tryPeekLocked(SharedFlowSlot slot) {
        long index = slot.index;
        if (index >= getBufferEndIndex()) goto L6;
        return index;
    L6:
        if (this.bufferCapacity <= 0) goto L9;
        return -1;
    L9:
        if (index <= getHead()) goto L12;
        return -1;
    L12:
        if (this.queueSize != 0) goto L14;
        return -1;
    L14:
        return index;
    }

    private final Object getPeekedValueLockedAt(long index) {
        Object[] r0 = this.buffer;
        Intrinsics.checkNotNull(r0);
        Object item = SharedFlowKt.access$getBufferAt(r0, index);
        if ((item instanceof Emitter) == true) goto L6;
        return item;
    L6:
        return ((Emitter) item).value;
    }

    private final Object awaitValue(SharedFlowSlot slot, Continuation<? super Unit> r15) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r15), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl cont = cancellable$iv;
        monitor-enter(this);
        long index = access$tryPeekLocked(this, slot);     // Catch: Throwable -> L19
        if (index >= 0) goto L8;
        slot.cont = cont;     // Catch: Throwable -> L19
        slot.cont = cont;     // Catch: Throwable -> L19
    L9:
        Unit r8 = Unit.INSTANCE;     // Catch: Throwable -> L19
        monitor-exit(this);
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L15;
        DebugProbesKt.probeCoroutineSuspended(r15);
    L15:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L18;
        return r1;
    L18:
        return Unit.INSTANCE;
    L8:
        Result.Companion r12 = Result.Companion;     // Catch: Throwable -> L19
        cont.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    }

    private final Continuation<Unit>[] findSlotsToResumeLocked(Continuation<Unit>[] r21) {
        SharedFlowImpl<T> r0 = this;
        Object[] r1 = r21;
        int resumeCount = r21.length;
        SharedFlowImpl<T> this_$iv = r0;
        if (AbstractSharedFlow.access$getNCollectors(this_$iv) == 0) goto L28;
        Object[] $this$forEach$iv$iv = AbstractSharedFlow.access$getSlots(this_$iv);
        if ($this$forEach$iv$iv == null) goto L28;
        int r8 = $this$forEach$iv$iv.length;
        int r9 = 0;
    L7:
        if (r9 >= r8) goto L28;
        Object element$iv$iv = $this$forEach$iv$iv[r9];
        if (element$iv$iv == null) goto L24;
        SharedFlowSlot slot = (SharedFlowSlot) element$iv$iv;
        Continuation<? super Unit> r15 = slot.cont;
        if (r15 != null) goto L14;
    L21:
        resumeCount = resumeCount;
        goto L24
    L14:
        if (r0.tryPeekLocked(slot) < 0) goto L21;
        if (resumeCount < r1.length) goto L19;
        int resumeCount2 = r1.length * 2;
        Object[] r2 = Arrays.copyOf(r1, Math.max(2, resumeCount2));
        Intrinsics.checkNotNullExpressionValue(r2, "copyOf(...)");
        r1 = r2;
    L19:
        resumeCount = resumeCount + 1;
        ((Continuation[]) r1)[resumeCount] = r15;
        slot.cont = null;
    L24:
        r9 = r9 + 1;
        r0 = this;
    L28:
        return (Continuation[]) r1;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected SharedFlowSlot[] createSlotArray(int size) {
        return new SharedFlowSlot[size];
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        monitor-enter(this);
        updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());     // Catch: Throwable -> L10
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L10:
        th = th;
    L14:
        monitor-exit(this);
        throw th;
    L12:
        th = th;
        goto L14
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, context, capacity, onBufferOverflow);
    }
}
