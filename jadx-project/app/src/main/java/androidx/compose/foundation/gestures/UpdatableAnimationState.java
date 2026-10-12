package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: UpdatableAnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005JJ\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001bH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/animation/core/AnimationSpec;)V", "isRunning", "", "lastFrameTime", "", "lastVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "value", "getValue", "()F", "setValue", "(F)V", "vectorizedSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animateToZero", "", "beforeFrame", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "valueDelta", "afterFrame", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UpdatableAnimationState {
    public static final int $stable = 0;
    private static final Companion Companion = null;

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private static final AnimationVector1D ZeroVector = null;
    private boolean isRunning;
    private long lastFrameTime;
    private AnimationVector1D lastVelocity;
    private float value;
    private final VectorizedAnimationSpec<AnimationVector1D> vectorizedSpec;

    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u00020\n*\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "()V", "VisibilityThreshold", "", "ZeroVector", "Landroidx/compose/animation/core/AnimationVector1D;", "getZeroVector", "()Landroidx/compose/animation/core/AnimationVector1D;", "isZeroish", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.access$getZeroVector$cp();
        }

        public final boolean isZeroish(float $this$isZeroish) {
            if (Math.abs($this$isZeroish) >= 0.01f) goto L5;
            return true;
        L5:
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1, reason: invalid class name */
    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 153}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UpdatableAnimationState this$0;

        AnonymousClass1(UpdatableAnimationState r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.animateToZero(null, null, this);
        }
    }

    public UpdatableAnimationState(AnimationSpec<Float> r3) {
        this.vectorizedSpec = r3.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));
        this.lastFrameTime = Long.MIN_VALUE;
        this.lastVelocity = ZeroVector;
    }

    public static final /* synthetic */ Companion access$getCompanion$p() {
        return Companion;
    }

    public static final /* synthetic */ long access$getLastFrameTime$p(UpdatableAnimationState $this) {
        return $this.lastFrameTime;
    }

    public static final /* synthetic */ AnimationVector1D access$getLastVelocity$p(UpdatableAnimationState $this) {
        return $this.lastVelocity;
    }

    public static final /* synthetic */ VectorizedAnimationSpec access$getVectorizedSpec$p(UpdatableAnimationState $this) {
        return $this.vectorizedSpec;
    }

    public static final /* synthetic */ AnimationVector1D access$getZeroVector$cp() {
        return ZeroVector;
    }

    public static final /* synthetic */ void access$setLastFrameTime$p(UpdatableAnimationState $this, long r1) {
        $this.lastFrameTime = r1;
    }

    public static final /* synthetic */ void access$setLastVelocity$p(UpdatableAnimationState $this, AnimationVector1D r1) {
        $this.lastVelocity = r1;
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float r1) {
        this.value = r1;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b5 -> B:66:0x00b8). Please report as a decompilation issue!!! */
    public final Object animateToZero(Function1<? super Float, Unit> r18, Function0<Unit> r19, Continuation<? super Unit> r20) {
        if ((r20 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r20;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass1 r3 = r0;
        Object $result = r3.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r10 = true;
        switch(r3.label) {
            case 0: goto L22;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Function0<Unit> r2 = (Function0) r3.L$1;
        final UpdatableAnimationState r5 = (UpdatableAnimationState) r3.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L54:
        r2.invoke();     // Catch: Throwable -> L42
        final UpdatableAnimationState r11 = r5;
    L56:
        r11.lastFrameTime = Long.MIN_VALUE;
        r11.lastVelocity = ZeroVector;
        r11.isRunning = false;
        return Unit.INSTANCE;
    L42:
        th = th;
    L60:
        r5.lastFrameTime = Long.MIN_VALUE;
        r5.lastVelocity = ZeroVector;
        r5.isRunning = false;
        throw th;
    L15:
        th = th;
        goto L60
    L17:
        float durationScale = r3.F$0;
        Function0<Unit> r12 = (Function0) r3.L$2;
        final Function1<? super Float, Unit> r13 = (Function1) r3.L$1;
        UpdatableAnimationState r14 = (UpdatableAnimationState) r3.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L20
        final float durationScale2 = durationScale;
        r5 = r14;
    L66:
        r12.invoke();     // Catch: Throwable -> L42
        if (durationScale2 != 0.0f) goto L39;
        boolean r15 = true;
    L40:
        if (r15 == false) goto L31;
        r2 = r12;
        r11 = r5;
        AnonymousClass1 r4 = r3;
    L62:
        float durationScale3 = r11.value;     // Catch: Throwable -> L58
        if (Math.abs(durationScale3) == 0.0f) goto L49;
        r10 = false;
    L49:
        if (r10 == true) goto L56;
        Function1<Long, Unit> r6 = new AnonymousClass5(r11, r13);     // Catch: Throwable -> L58
        r4.L$0 = r11;     // Catch: Throwable -> L58
        r4.L$1 = r2;     // Catch: Throwable -> L58
        r4.L$2 = null;     // Catch: Throwable -> L58
        r4.label = 2;     // Catch: Throwable -> L58
        if (MonotonicFrameClockKt.withFrameNanos(r6, r4) != r1) goto L53;
        return r1;
    L53:
        r3 = r4;
        $result = $result;
        r5 = r11;
    L58:
        th = th;
        r5 = r11;
    L31:
        if (Companion.isZeroish(r5.value) == true) goto L44;
        Function1<Long, Unit> r16 = new AnonymousClass4(r5, durationScale2, r13);     // Catch: Throwable -> L42
        r3.L$0 = r5;     // Catch: Throwable -> L42
        r3.L$1 = r13;     // Catch: Throwable -> L42
        r3.L$2 = r12;     // Catch: Throwable -> L42
        r3.F$0 = durationScale2;     // Catch: Throwable -> L42
        r3.label = 1;     // Catch: Throwable -> L42
        if (MonotonicFrameClockKt.withFrameNanos(r16, r3) != r1) goto L66;
        return r1;
    L44:
        r2 = r12;
        r11 = r5;
        r4 = r3;
        goto L62
    L39:
        r15 = false;
    L20:
        th = th;
        r5 = r14;
        goto L60
    L22:
        ResultKt.throwOnFailure($result);
        r5 = this;
        r12 = r19;
        r13 = r18;
        boolean value$iv = !r5.isRunning;
        if (value$iv == true) goto L25;
        InlineClassHelperKt.throwIllegalStateException("animateToZero called while previous animation is running");
    L25:
        MotionDurationScale r17 = (MotionDurationScale) r3.getContext().get(MotionDurationScale.Key);
        if (r17 == null) goto L28;
        durationScale2 = r17.getScaleFactor();
    L29:
        r5.isRunning = true;
        goto L31
    L28:
        durationScale2 = 1.0f;
        goto L29
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r20);
        goto L8
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        ZeroVector = new AnimationVector1D(0.0f);
    }
}
