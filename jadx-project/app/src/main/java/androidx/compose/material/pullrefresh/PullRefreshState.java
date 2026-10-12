package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: PullRefreshState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\tH\u0002J\b\u00108\u001a\u00020\tH\u0002J\u0015\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0000¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0000¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0014H\u0000¢\u0006\u0002\b@J\u0015\u0010A\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\bDR+\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001c\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R+\u0010 \u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001b\u0010$\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010(\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0013\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000fR\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010\u000fR\u0014\u00102\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u000f¨\u0006E"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "animationScope", "Lkotlinx/coroutines/CoroutineScope;", "onRefreshState", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "", "refreshingOffset", "", "threshold", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;FF)V", "<set-?>", "_position", "get_position", "()F", "set_position", "(F)V", "_position$delegate", "Landroidx/compose/runtime/MutableFloatState;", "", "_refreshing", "get_refreshing", "()Z", "set_refreshing", "(Z)V", "_refreshing$delegate", "Landroidx/compose/runtime/MutableState;", "_refreshingOffset", "get_refreshingOffset", "set_refreshingOffset", "_refreshingOffset$delegate", "_threshold", "get_threshold", "set_threshold", "_threshold$delegate", "adjustedDistancePulled", "getAdjustedDistancePulled", "adjustedDistancePulled$delegate", "Landroidx/compose/runtime/State;", "distancePulled", "getDistancePulled", "setDistancePulled", "distancePulled$delegate", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "position", "getPosition$material_release", NotificationCompat.CATEGORY_PROGRESS, "getProgress", "refreshing", "getRefreshing$material_release", "getThreshold$material_release", "animateIndicatorTo", "Lkotlinx/coroutines/Job;", "offset", "calculateIndicatorPosition", "onPull", "pullDelta", "onPull$material_release", "onRelease", "velocity", "onRelease$material_release", "setRefreshing", "setRefreshing$material_release", "setRefreshingOffset", "setRefreshingOffset$material_release", "setThreshold", "setThreshold$material_release", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PullRefreshState {
    public static final int $stable = 0;
    private final MutableFloatState _position$delegate;
    private final MutableState _refreshing$delegate;
    private final MutableFloatState _refreshingOffset$delegate;
    private final MutableFloatState _threshold$delegate;
    private final State adjustedDistancePulled$delegate;
    private final CoroutineScope animationScope;
    private final MutableFloatState distancePulled$delegate;
    private final MutatorMutex mutatorMutex;
    private final State<Function0<Unit>> onRefreshState;

    /* JADX INFO: renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1, reason: invalid class name */
    /* JADX INFO: compiled from: PullRefreshState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $offset;
        int label;
        final /* synthetic */ PullRefreshState this$0;

        /* JADX INFO: renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: PullRefreshState.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
        static final class C00881 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ float $offset;
            int label;
            final /* synthetic */ PullRefreshState this$0;

            C00881(PullRefreshState r2, float r3, Continuation<? super C00881> r4) {
                this.this$0 = r2;
                this.$offset = r3;
                super(1, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> r4) {
                return new C00881(this.this$0, this.$offset, r4);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
                return invoke2(r2);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super Unit> r3) {
                return ((C00881) create(r3)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L7;
                    case 1: goto L6;
                    default: goto L5;
                };
            L6:
                ResultKt.throwOnFailure($result);
            L11:
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                float r2 = PullRefreshState.access$get_position(this.this$0);
                float r3 = this.$offset;
                final PullRefreshState r4 = this.this$0;
                this.label = 1;
                if (SuspendAnimationKt.animate$default(r2, r3, 0.0f, null, new C00891(r4), this, 12, null) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass1(PullRefreshState r2, float r3, Continuation<? super AnonymousClass1> r4) {
            this.this$0 = r2;
            this.$offset = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            return new AnonymousClass1(this.this$0, this.$offset, r5);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (MutatorMutex.mutate$default(PullRefreshState.access$getMutatorMutex$p(this.this$0), null, new C00881(this.this$0, this.$offset, null), this, 1, null) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(CoroutineScope animationScope, State<? extends Function0<Unit>> r5, float refreshingOffset, float threshold) {
        this.animationScope = animationScope;
        this.onRefreshState = r5;
        this.adjustedDistancePulled$delegate = SnapshotStateKt.derivedStateOf(new PullRefreshState$adjustedDistancePulled$2(this));
        this._refreshing$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this._position$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this._threshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(threshold);
        this._refreshingOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(refreshingOffset);
        this.mutatorMutex = new MutatorMutex();
    }

    public static final /* synthetic */ float access$getDistancePulled(PullRefreshState $this) {
        return $this.getDistancePulled();
    }

    public static final /* synthetic */ MutatorMutex access$getMutatorMutex$p(PullRefreshState $this) {
        return $this.mutatorMutex;
    }

    public static final /* synthetic */ float access$get_position(PullRefreshState $this) {
        return $this.get_position();
    }

    public static final /* synthetic */ void access$set_position(PullRefreshState $this, float r1) {
        $this.set_position(r1);
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return get_refreshing();
    }

    public final float getPosition$material_release() {
        return get_position();
    }

    public final float getThreshold$material_release() {
        return get_threshold();
    }

    private final float getAdjustedDistancePulled() {
        State $this$getValue$iv = this.adjustedDistancePulled$delegate;
        return ((Number) $this$getValue$iv.getValue()).floatValue();
    }

    private final boolean get_refreshing() {
        State $this$getValue$iv = this._refreshing$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void set_refreshing(boolean r5) {
        MutableState $this$setValue$iv = this._refreshing$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    private final float get_position() {
        FloatState $this$getValue$iv = this._position$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void set_position(float r4) {
        MutableFloatState $this$setValue$iv = this._position$delegate;
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

    private final float get_threshold() {
        FloatState $this$getValue$iv = this._threshold$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void set_threshold(float r4) {
        MutableFloatState $this$setValue$iv = this._threshold$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    private final float get_refreshingOffset() {
        FloatState $this$getValue$iv = this._refreshingOffset$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final void set_refreshingOffset(float r4) {
        MutableFloatState $this$setValue$iv = this._refreshingOffset$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float onPull$material_release(float pullDelta) {
        if (get_refreshing() == false) goto L5;
        return 0.0f;
    L5:
        float newOffset = RangesKt.coerceAtLeast(getDistancePulled() + pullDelta, 0.0f);
        float dragConsumed = newOffset - getDistancePulled();
        setDistancePulled(newOffset);
        set_position(calculateIndicatorPosition());
        return dragConsumed;
    }

    public final float onRelease$material_release(float velocity) {
        if (getRefreshing$material_release() == false) goto L6;
        return 0.0f;
    L6:
        if (getAdjustedDistancePulled() <= getThreshold$material_release()) goto L8;
        this.onRefreshState.getValue().invoke();
    L8:
        animateIndicatorTo(0.0f);
        if (getDistancePulled() != 0.0f) goto L11;
        boolean r0 = true;
    L12:
        if (r0 == false) goto L15;
        float consumed = 0.0f;
    L18:
        setDistancePulled(0.0f);
        return consumed;
    L15:
        if (velocity >= 0.0f) goto L17;
        consumed = 0.0f;
        goto L18
    L17:
        consumed = velocity;
        goto L18
    L11:
        r0 = false;
        goto L12
    }

    public final void setRefreshing$material_release(boolean refreshing) {
        if (get_refreshing() == refreshing) goto L9;
        set_refreshing(refreshing);
        float r0 = 0.0f;
        setDistancePulled(0.0f);
        if (refreshing == false) goto L7;
        r0 = get_refreshingOffset();
    L7:
        animateIndicatorTo(r0);
        return;
    }

    public final void setThreshold$material_release(float threshold) {
        set_threshold(threshold);
    }

    public final void setRefreshingOffset$material_release(float refreshingOffset) {
        if (get_refreshingOffset() != refreshingOffset) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L11;
        set_refreshingOffset(refreshingOffset);
        if (getRefreshing$material_release() == false) goto L12;
        animateIndicatorTo(refreshingOffset);
        return;
    L12:
        return;
    L11:
        return;
    L5:
        r0 = false;
        goto L6
    }

    private final Job animateIndicatorTo(float offset) {
        return BuildersKt.launch$default(this.animationScope, null, null, new AnonymousClass1(this, offset, null), 3, null);
    }

    private final float calculateIndicatorPosition() {
        if (getAdjustedDistancePulled() > getThreshold$material_release()) goto L5;
        float overshootPercent = getAdjustedDistancePulled();
        return overshootPercent;
    L5:
        float overshootPercent2 = Math.abs(getProgress()) - 1.0f;
        float $this$fastCoerceAtLeast$iv$iv = overshootPercent2;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L9;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L9:
        if ($this$fastCoerceAtLeast$iv$iv <= 2.0f) goto L11;
        $this$fastCoerceAtLeast$iv$iv = 2.0f;
    L11:
        float tensionPercent = $this$fastCoerceAtLeast$iv$iv - (((float) Math.pow($this$fastCoerceAtLeast$iv$iv, 2.0d)) / 4.0f);
        float extraOffset = getThreshold$material_release() * tensionPercent;
        float overshootPercent3 = getThreshold$material_release() + extraOffset;
        return overshootPercent3;
    }
}
