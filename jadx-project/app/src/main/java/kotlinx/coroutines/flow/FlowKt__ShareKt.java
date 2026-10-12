package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\b\f\u001aM\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u001cH\u0002¢\u0006\u0002\b\u001d\u001aP\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012-\u0010\u001f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 ¢\u0006\u0002\b$¢\u0006\u0002\u0010%\u001a6\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a,\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010)\u001a9\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\t2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0002¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"asSharedFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "T", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "asStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "configureSharing", "Lkotlinx/coroutines/flow/SharingConfig;", "Lkotlinx/coroutines/flow/Flow;", "replay", "", "configureSharing$FlowKt__ShareKt", "launchSharing", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "upstream", "shared", "started", "Lkotlinx/coroutines/flow/SharingStarted;", "initialValue", "launchSharing$FlowKt__ShareKt", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/Job;", "launchSharingDeferred", "", "result", "Lkotlinx/coroutines/CompletableDeferred;", "launchSharingDeferred$FlowKt__ShareKt", "onSubscription", "action", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/SharedFlow;", "shareIn", "scope", "stateIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ShareKt {
    public static /* synthetic */ SharedFlow shareIn$default(Flow r0, CoroutineScope r1, SharingStarted r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = 0;
    L6:
        return FlowKt.shareIn(r0, r1, r2, r3);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> r9, CoroutineScope scope, SharingStarted started, int replay) {
        SharingConfig config = configureSharing$FlowKt__ShareKt(r9, replay);
        MutableSharedFlow shared = SharedFlowKt.MutableSharedFlow(replay, config.extraBufferCapacity, config.onBufferOverflow);
        Job job = launchSharing$FlowKt__ShareKt(scope, config.context, config.upstream, shared, started, SharedFlowKt.NO_VALUE);
        return new ReadonlySharedFlow(shared, job);
    }

    private static final <T> SharingConfig<T> configureSharing$FlowKt__ShareKt(Flow<? extends T> r7, int replay) {
        int r1 = 1;
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        int defaultExtraCapacity = RangesKt.coerceAtLeast(replay, Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()) - replay;
        if ((r7 instanceof ChannelFlow) == false) goto L31;
        Flow<T> r3 = ((ChannelFlow) r7).dropChannelOperators();
        if (r3 == null) goto L31;
        switch(((ChannelFlow) r7).capacity) {
            case -3: goto L20;
            case -2: goto L20;
            case -1: goto L18;
            case 0: goto L20;
            default: goto L18;
        };
    L18:
        r1 = ((ChannelFlow) r7).capacity;
    L29:
        return new SharingConfig(r3, r1, ((ChannelFlow) r7).onBufferOverflow, ((ChannelFlow) r7).context);
    L20:
        if (((ChannelFlow) r7).onBufferOverflow == BufferOverflow.SUSPEND) goto L22;
        if (replay == 0) goto L29;
        r1 = 0;
        goto L29
    L22:
        if (((ChannelFlow) r7).capacity != 0) goto L24;
        r1 = 0;
        goto L29
    L24:
        r1 = defaultExtraCapacity;
    L31:
        return new SharingConfig(r7, defaultExtraCapacity, BufferOverflow.SUSPEND, EmptyCoroutineContext.INSTANCE);
    L5:
        if (replay < 0) goto L7;
        int r0 = 1;
    L8:
        if (r0 != 0) goto L12;
        throw new AssertionError();
    L7:
        r0 = 0;
        goto L8
    }

    private static final <T> Job launchSharing$FlowKt__ShareKt(CoroutineScope $this$launchSharing, CoroutineContext context, Flow<? extends T> r9, MutableSharedFlow<T> r10, SharingStarted started, T r12) {
        if (Intrinsics.areEqual(started, SharingStarted.Companion.getEagerly()) == false) goto L5;
        CoroutineStart start = CoroutineStart.DEFAULT;
    L7:
        return BuildersKt.launch($this$launchSharing, context, start, new FlowKt__ShareKt$launchSharing$1(started, r9, r10, r12, null));
    L5:
        start = CoroutineStart.UNDISPATCHED;
        goto L7
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> r8, CoroutineScope scope, SharingStarted started, T r11) {
        SharingConfig config = configureSharing$FlowKt__ShareKt(r8, 1);
        MutableStateFlow state = StateFlowKt.MutableStateFlow(r11);
        Job job = launchSharing$FlowKt__ShareKt(scope, config.context, config.upstream, state, started, r11);
        return new ReadonlyStateFlow(state, job);
    }

    public static final <T> Object stateIn(Flow<? extends T> r4, CoroutineScope scope, Continuation<? super StateFlow<? extends T>> r6) {
        SharingConfig config = configureSharing$FlowKt__ShareKt(r4, 1);
        CompletableDeferred result = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        launchSharingDeferred$FlowKt__ShareKt(scope, config.context, config.upstream, result);
        return result.await(r6);
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(CoroutineScope $this$launchSharingDeferred, CoroutineContext context, Flow<? extends T> r10, CompletableDeferred<StateFlow<T>> r11) {
        BuildersKt.launch$default($this$launchSharingDeferred, context, null, new FlowKt__ShareKt$launchSharingDeferred$1(r10, r11, null), 2, null);
    }

    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> r3) {
        return new ReadonlySharedFlow(r3, null);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> r3) {
        return new ReadonlyStateFlow(r3, null);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> r1, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> r2) {
        return new SubscribedSharedFlow(r1, r2);
    }
}
