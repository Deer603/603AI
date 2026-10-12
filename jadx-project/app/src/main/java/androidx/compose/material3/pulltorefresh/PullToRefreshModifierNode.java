package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: PullToRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u00106\u001a\u00020\bH\u0082@¢\u0006\u0002\u00107J\u000e\u00108\u001a\u00020\bH\u0082@¢\u0006\u0002\u00107J\b\u00109\u001a\u00020\u0010H\u0002J\u001a\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\b\u0010?\u001a\u00020\bH\u0016J*\u0010@\u001a\u00020;2\u0006\u0010A\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010B\u001a\u00020CH\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020G2\u0006\u0010<\u001a\u00020GH\u0096@ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\"\u0010J\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010B\u001a\u00020CH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0016\u0010M\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010OJ\u0006\u0010P\u001a\u00020\bR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u001b\"\u0004\b\u001e\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\f\u001a\u00020\rX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0017R\u0014\u0010.\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R+\u00102\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0019\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "isRefreshing", "", "onRefresh", "Lkotlin/Function0;", "", "enabled", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "threshold", "Landroidx/compose/ui/unit/Dp;", "(ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "adjustedDistancePulled", "", "getAdjustedDistancePulled", "()F", "<set-?>", "distancePulled", "getDistancePulled", "setDistancePulled", "(F)V", "distancePulled$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getEnabled", "()Z", "setEnabled", "(Z)V", "setRefreshing", "nestedScrollNode", "Landroidx/compose/ui/node/DelegatableNode;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "setOnRefresh", "(Lkotlin/jvm/functions/Function0;)V", NotificationCompat.CATEGORY_PROGRESS, "getProgress", "getState", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "setState", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;)V", "getThreshold-D9Ej5fM", "setThreshold-0680j_4", "F", "thresholdPx", "", "getThresholdPx", "()I", "verticalOffset", "getVerticalOffset", "setVerticalOffset", "verticalOffset$delegate", "animateToHidden", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToThreshold", "calculateVerticalOffset", "consumeAvailableOffset", "Landroidx/compose/ui/geometry/Offset;", "available", "consumeAvailableOffset-MK-Hz9U", "(J)J", "onAttach", "onPostScroll", "consumed", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "onRelease", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PullToRefreshModifierNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {
    public static final int $stable = 0;
    private final MutableFloatState distancePulled$delegate;
    private boolean enabled;
    private boolean isRefreshing;
    private DelegatableNode nestedScrollNode;
    private Function0<Unit> onRefresh;
    private PullToRefreshState state;
    private float threshold;
    private final MutableFloatState verticalOffset$delegate;

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1, reason: invalid class name */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {0}, l = {406}, m = "animateToHidden", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PullToRefreshModifierNode this$0;

        AnonymousClass1(PullToRefreshModifierNode r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.access$animateToHidden(this.this$0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {0}, l = {400}, m = "animateToThreshold", n = {"this"}, s = {"L$0"})
    static final class C06051 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PullToRefreshModifierNode this$0;

        C06051(PullToRefreshModifierNode r1, Continuation<? super C06051> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.access$animateToThreshold(this.this$0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", f = "PullToRefresh.kt", i = {}, l = {287, 289}, m = "invokeSuspend", n = {}, s = {})
    static final class C06061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PullToRefreshModifierNode this$0;

        C06061(PullToRefreshModifierNode r2, Continuation<? super C06061> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C06061(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C06061) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L21:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            goto L21
        L8:
            ResultKt.throwOnFailure($result);
            boolean r2 = this.this$0.isRefreshing();
            PullToRefreshModifierNode r3 = this.this$0;
            if (r2 == false) goto L15;
            this.label = 1;
            if (r3.getState().snapTo(1.0f, this) != r0) goto L21;
            return r0;
        L15:
            this.label = 2;
            if (r3.getState().snapTo(0.0f, this) != r0) goto L21;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {0, 0, 1, 1}, l = {359, 362}, m = "onRelease", n = {"this", "velocity", "this", "velocity"}, s = {"L$0", "F$0", "L$0", "F$0"})
    static final class C06071 extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PullToRefreshModifierNode this$0;

        C06071(PullToRefreshModifierNode r1, Continuation<? super C06071> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.access$onRelease(this.this$0, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", i = {}, l = {333, 335}, m = "invokeSuspend", n = {}, s = {})
    static final class C06081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PullToRefreshModifierNode this$0;

        C06081(PullToRefreshModifierNode r2, Continuation<? super C06081> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C06081(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C06081) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L21:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            goto L21
        L8:
            ResultKt.throwOnFailure($result);
            boolean r2 = this.this$0.isRefreshing();
            PullToRefreshModifierNode r3 = this.this$0;
            if (r2 == true) goto L15;
            this.label = 1;
            if (PullToRefreshModifierNode.access$animateToHidden(r3, this) != r0) goto L21;
            return r0;
        L15:
            this.label = 2;
            if (PullToRefreshModifierNode.access$animateToThreshold(r3, this) != r0) goto L21;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ PullToRefreshModifierNode(boolean r1, Function0 r2, boolean r3, PullToRefreshState r4, float r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    public static final /* synthetic */ Object access$animateToHidden(PullToRefreshModifierNode $this, Continuation $completion) {
        return $this.animateToHidden($completion);
    }

    public static final /* synthetic */ Object access$animateToThreshold(PullToRefreshModifierNode $this, Continuation $completion) {
        return $this.animateToThreshold($completion);
    }

    public static final /* synthetic */ int access$getThresholdPx(PullToRefreshModifierNode $this) {
        return $this.getThresholdPx();
    }

    public static final /* synthetic */ float access$getVerticalOffset(PullToRefreshModifierNode $this) {
        return $this.getVerticalOffset();
    }

    public static final /* synthetic */ Object access$onRelease(PullToRefreshModifierNode $this, float velocity, Continuation $completion) {
        return $this.onRelease(velocity, $completion);
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final void setRefreshing(boolean r1) {
        this.isRefreshing = r1;
    }

    public final Function0<Unit> getOnRefresh() {
        return this.onRefresh;
    }

    public final void setOnRefresh(Function0<Unit> r1) {
        this.onRefresh = r1;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean r1) {
        this.enabled = r1;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    public final void setState(PullToRefreshState r1) {
        this.state = r1;
    }

    /* JADX INFO: renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m3128getThresholdD9Ej5fM() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: setThreshold-0680j_4, reason: not valid java name */
    public final void m3129setThreshold0680j_4(float r1) {
        this.threshold = r1;
    }

    private PullToRefreshModifierNode(boolean isRefreshing, Function0<Unit> r4, boolean enabled, PullToRefreshState state, float threshold) {
        this.isRefreshing = isRefreshing;
        this.onRefresh = r4;
        this.enabled = enabled;
        this.state = state;
        this.threshold = threshold;
        this.nestedScrollNode = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        this.verticalOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    private final float getVerticalOffset() {
        FloatState $this$getValue$iv = this.verticalOffset$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setVerticalOffset(float r4) {
        MutableFloatState $this$setValue$iv = this.verticalOffset$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    private final float getDistancePulled() {
        FloatState $this$getValue$iv = this.distancePulled$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void setDistancePulled(float r4) {
        MutableFloatState $this$setValue$iv = this.distancePulled$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    private final float getAdjustedDistancePulled() {
        return getDistancePulled() * 0.5f;
    }

    private final int getThresholdPx() {
        Density $this$_get_thresholdPx__u24lambda_u240 = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalDensity());
        return $this$_get_thresholdPx__u24lambda_u240.mo370roundToPx0680j_4(this.threshold);
    }

    private final float getProgress() {
        return getAdjustedDistancePulled() / getThresholdPx();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        delegate(this.nestedScrollNode);
        BuildersKt.launch$default(getCoroutineScope(), null, null, new C06061(this, null), 3, null);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo803onPreScrollOzD1aCk(long available, int source) {
        if (this.state.isAnimating() == false) goto L6;
        return Offset.Companion.m4141getZeroF1C5BW0();
    L6:
        if (this.enabled == true) goto L9;
        return Offset.Companion.m4141getZeroF1C5BW0();
    L9:
        if (NestedScrollSource.m5470equalsimpl0(source, NestedScrollSource.Companion.m5482getUserInputWNlRxjI()) == false) goto L14;
        if (Offset.m4126getYimpl(available) >= 0.0f) goto L14;
        return m3127consumeAvailableOffsetMKHz9U(available);
    L14:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo497onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.state.isAnimating() == false) goto L6;
        return Offset.Companion.m4141getZeroF1C5BW0();
    L6:
        if (this.enabled == true) goto L9;
        return Offset.Companion.m4141getZeroF1C5BW0();
    L9:
        if (NestedScrollSource.m5470equalsimpl0(source, NestedScrollSource.Companion.m5482getUserInputWNlRxjI()) == false) goto L12;
        long r0 = m3127consumeAvailableOffsetMKHz9U(available);
        BuildersKt.launch$default(getCoroutineScope(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3, null);
        return r0;
    L12:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo802onPreFlingQWom1Mo(long available, Continuation<? super Velocity> r9) {
        if ((r9 instanceof PullToRefreshModifierNode$onPreFling$1) == false) goto L7;
        PullToRefreshModifierNode$onPreFling$1 r0 = (PullToRefreshModifierNode$onPreFling$1) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        float r7 = r0.F$0;
        ResultKt.throwOnFailure($result);
        float r4 = r7;
        Object r8 = $result;
    L17:
        return Velocity.m7202boximpl(VelocityKt.Velocity(r4, ((Number) r8).floatValue()));
    L13:
        ResultKt.throwOnFailure($result);
        float r3 = Velocity.m7212getYimpl(available);
        r4 = 0.0f;
        r0.F$0 = 0.0f;
        r0.label = 1;
        r8 = onRelease(r3, r0);
        if (r8 != r1) goto L17;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new PullToRefreshModifierNode$onPreFling$1(this, r9);
        goto L8
    }

    public final void update() {
        BuildersKt.launch$default(getCoroutineScope(), null, null, new C06081(this, null), 3, null);
    }

    /* JADX INFO: renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    private final long m3127consumeAvailableOffsetMKHz9U(long available) {
        if (this.isRefreshing == false) goto L5;
        float dragConsumed = 0.0f;
    L7:
        return OffsetKt.Offset(0.0f, dragConsumed);
    L5:
        float newOffset = RangesKt.coerceAtLeast(getDistancePulled() + Offset.m4126getYimpl(available), 0.0f);
        dragConsumed = newOffset - getDistancePulled();
        setDistancePulled(newOffset);
        setVerticalOffset(calculateVerticalOffset());
        goto L7
    }

    private final Object onRelease(float velocity, Continuation<? super Float> r9) {
        if ((r9 instanceof C06071) == false) goto L7;
        C06071 r0 = (C06071) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r3 = true;
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        velocity = r0.F$0;
        PullToRefreshModifierNode r2 = (PullToRefreshModifierNode) r0.L$0;
        ResultKt.throwOnFailure($result);
    L31:
        if (r2.getDistancePulled() == 0.0f) goto L34;
        r3 = false;
    L34:
        if (r3 == false) goto L37;
        velocity = 0.0f;
    L40:
        r2.setDistancePulled(0.0f);
        return Boxing.boxFloat(velocity);
    L37:
        if (velocity >= 0.0f) goto L40;
        velocity = 0.0f;
        goto L40
    L13:
        velocity = r0.F$0;
        r2 = (PullToRefreshModifierNode) r0.L$0;
        ResultKt.throwOnFailure($result);
    L24:
        r2.onRefresh.invoke();
        goto L31
    L14:
        ResultKt.throwOnFailure($result);
        if (this.isRefreshing == false) goto L19;
        return Boxing.boxFloat(0.0f);
    L19:
        if (getAdjustedDistancePulled() <= getThresholdPx()) goto L25;
        r0.L$0 = this;
        r0.F$0 = velocity;
        r0.label = 1;
        if (animateToThreshold(r0) != r1) goto L23;
        return r1;
    L23:
        r2 = this;
        goto L24
    L25:
        r0.L$0 = this;
        r0.F$0 = velocity;
        r0.label = 2;
        if (animateToHidden(r0) != r1) goto L28;
        return r1;
    L28:
        r2 = this;
        goto L31
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C06071(this, r9);
        goto L8
    }

    private final float calculateVerticalOffset() {
        if (getAdjustedDistancePulled() > getThresholdPx()) goto L5;
        float overshootPercent = getAdjustedDistancePulled();
        return overshootPercent;
    L5:
        float overshootPercent2 = Math.abs(getProgress()) - 1.0f;
        float linearTension = RangesKt.coerceIn(overshootPercent2, 0.0f, 2.0f);
        float tensionPercent = linearTension - (((float) Math.pow(linearTension, 2.0d)) / 4.0f);
        float extraOffset = getThresholdPx() * tensionPercent;
        float overshootPercent3 = getThresholdPx() + extraOffset;
        return overshootPercent3;
    }

    private final Object animateToThreshold(Continuation<? super Unit> r6) {
        if ((r6 instanceof C06051) == false) goto L7;
        C06051 r0 = (C06051) r6;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        PullToRefreshModifierNode r2 = (PullToRefreshModifierNode) r0.L$0;
        ResultKt.throwOnFailure($result);
    L17:
        r2.setDistancePulled(r2.getThresholdPx());
        r2.setVerticalOffset(r2.getThresholdPx());
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        PullToRefreshState r3 = this.state;
        r0.L$0 = this;
        r0.label = 1;
        if (r3.animateToThreshold(r0) != r1) goto L16;
        return r1;
    L16:
        r2 = this;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C06051(this, r6);
        goto L8
    }

    private final Object animateToHidden(Continuation<? super Unit> r6) {
        if ((r6 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r6;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        PullToRefreshModifierNode r2 = (PullToRefreshModifierNode) r0.L$0;
        ResultKt.throwOnFailure($result);
    L17:
        r2.setDistancePulled(0.0f);
        r2.setVerticalOffset(0.0f);
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        PullToRefreshState r3 = this.state;
        r0.L$0 = this;
        r0.label = 1;
        if (r3.animateToHidden(r0) != r1) goto L16;
        return r1;
    L16:
        r2 = this;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r6);
        goto L8
    }
}
