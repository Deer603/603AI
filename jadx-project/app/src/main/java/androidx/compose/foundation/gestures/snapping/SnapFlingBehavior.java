package androidx.compose.foundation.gestures.snapping;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.ui.MotionDurationScale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J:\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0002\u0010!J.\u0010\"\u001a\u00020\u0006*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u0096@¢\u0006\u0002\u0010!JQ\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u001a*\u00020\u001c2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0002\u0010*JB\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0,*\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0002\u0010*R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "motionScaleDuration", "Landroidx/compose/ui/MotionDurationScale;", "getMotionScaleDuration$foundation_release", "()Landroidx/compose/ui/MotionDurationScale;", "setMotionScaleDuration$foundation_release", "(Landroidx/compose/ui/MotionDurationScale;)V", "equals", "", "other", "", "hashCode", "", "isDecayApproachPossible", "offset", "velocity", "fling", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "onRemainingScrollOffsetUpdate", "Lkotlin/Function1;", "", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performFling", "onRemainingDistanceUpdated", "runApproach", "initialTargetOffset", "onAnimationStep", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "delta", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryApproach", "Landroidx/compose/animation/core/AnimationState;", "updateRemainingScrollOffset", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapFlingBehavior implements TargetedFlingBehavior {
    public static final int $stable = 0;
    private final DecayAnimationSpec<Float> decayAnimationSpec;
    private MotionDurationScale motionScaleDuration;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {115}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SnapFlingBehavior this$0;

        AnonymousClass1(SnapFlingBehavior r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            this.result = r5;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.access$fling(this.this$0, null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {101}, m = "performFling", n = {}, s = {})
    static final class C02781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SnapFlingBehavior this$0;

        C02781(SnapFlingBehavior r1, Continuation<? super C02781> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            this.result = r5;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.performFling(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {175}, m = "tryApproach", n = {}, s = {})
    static final class C02791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SnapFlingBehavior this$0;

        C02791(SnapFlingBehavior r1, Continuation<? super C02791> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.access$tryApproach(this.this$0, null, 0.0f, 0.0f, null, this);
        }
    }

    static {
    }

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> r3, AnimationSpec<Float> r4) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.decayAnimationSpec = r3;
        this.snapAnimationSpec = r4;
        this.motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    }

    public static final /* synthetic */ Object access$fling(SnapFlingBehavior $this, ScrollScope $receiver, float initialVelocity, Function1 onRemainingScrollOffsetUpdate, Continuation $completion) {
        return $this.fling($receiver, initialVelocity, onRemainingScrollOffsetUpdate, $completion);
    }

    public static final /* synthetic */ DecayAnimationSpec access$getDecayAnimationSpec$p(SnapFlingBehavior $this) {
        return $this.decayAnimationSpec;
    }

    public static final /* synthetic */ AnimationSpec access$getSnapAnimationSpec$p(SnapFlingBehavior $this) {
        return $this.snapAnimationSpec;
    }

    public static final /* synthetic */ SnapLayoutInfoProvider access$getSnapLayoutInfoProvider$p(SnapFlingBehavior $this) {
        return $this.snapLayoutInfoProvider;
    }

    public static final /* synthetic */ Object access$runApproach(SnapFlingBehavior $this, ScrollScope $receiver, float initialTargetOffset, float initialVelocity, Function1 onAnimationStep, Continuation $completion) {
        return $this.runApproach($receiver, initialTargetOffset, initialVelocity, onAnimationStep, $completion);
    }

    public static final /* synthetic */ Object access$tryApproach(SnapFlingBehavior $this, ScrollScope $receiver, float offset, float velocity, Function1 updateRemainingScrollOffset, Continuation $completion) {
        return $this.tryApproach($receiver, offset, velocity, updateRemainingScrollOffset, $completion);
    }

    public final MotionDurationScale getMotionScaleDuration$foundation_release() {
        return this.motionScaleDuration;
    }

    public final void setMotionScaleDuration$foundation_release(MotionDurationScale r1) {
        this.motionScaleDuration = r1;
    }

    @Override // androidx.compose.foundation.gestures.TargetedFlingBehavior
    public Object performFling(ScrollScope $this$performFling, float initialVelocity, Function1<? super Float, Unit> r8, Continuation<? super Float> r9) {
        if ((r9 instanceof C02781) == false) goto L7;
        C02781 r0 = (C02781) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r4 = true;
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
        Object r6 = $result;
    L16:
        AnimationResult r7 = (AnimationResult) r6;
        float remainingOffset = ((Number) r7.component1()).floatValue();
        AnimationState remainingState = r7.component2();
        float r10 = 0.0f;
        if (remainingOffset == 0.0f) goto L20;
        r4 = false;
    L20:
        if (r4 == true) goto L24;
        r10 = ((Number) remainingState.getVelocity()).floatValue();
    L24:
        return Boxing.boxFloat(r10);
    L13:
        ResultKt.throwOnFailure($result);
        r0.label = 1;
        r6 = fling($this$performFling, initialVelocity, r8, r0);
        if (r6 != r2) goto L16;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C02781(this, r9);
        goto L8
    }

    private final Object fling(ScrollScope $this$fling, float initialVelocity, Function1<? super Float, Unit> r12, Continuation<? super AnimationResult<Float, AnimationVector1D>> r13) {
        if ((r13 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Function1<? super Float, Unit> r10 = (Function1) r0.L$0;
        ResultKt.throwOnFailure($result);
        Function1<? super Float, Unit> r6 = r10;
        Object r11 = $result;
    L16:
        AnimationResult result = (AnimationResult) r11;
        r6.invoke(Boxing.boxFloat(0.0f));
        return result;
    L13:
        ResultKt.throwOnFailure($result);
        r6 = r12;
        MotionDurationScale r14 = this.motionScaleDuration;
        SnapFlingBehavior$fling$result$1 r3 = new SnapFlingBehavior$fling$result$1(this, initialVelocity, r6, $this$fling, null);
        r0.L$0 = r6;
        r0.label = 1;
        r11 = BuildersKt.withContext(r14, r3, r0);
        if (r11 != r2) goto L16;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r13);
        goto L8
    }

    private final Object tryApproach(ScrollScope $this$tryApproach, float offset, float velocity, Function1<? super Float, Unit> r23, Continuation<? super AnimationState<Float, AnimationVector1D>> r24) {
        if ((r24 instanceof C02791) == false) goto L7;
        C02791 r1 = (C02791) r24;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        C02791 r8 = r1;
        Object $result = r8.result;
        Object r9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r8.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
        Object r3 = $result;
    L29:
        return ((AnimationResult) r3).getCurrentAnimationState();
    L13:
        ResultKt.throwOnFailure($result);
        boolean r12 = false;
        if (Math.abs(offset) != 0.0f) goto L16;
        boolean r5 = true;
    L17:
        if (r5 == true) goto L28;
        if (Math.abs(velocity) != 0.0f) goto L21;
        r12 = true;
    L21:
        if (r12 == true) goto L28;
        r8.label = 1;
        r3 = runApproach($this$tryApproach, offset, velocity, r23, r8);
        if (r3 != r9) goto L29;
        return r9;
    L28:
        return AnimationStateKt.AnimationState$default(offset, velocity, 0, 0, false, 28, null);
    L16:
        r5 = false;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C02791(this, r24);
        goto L8
    }

    private final Object runApproach(ScrollScope $this$runApproach, float initialTargetOffset, float initialVelocity, Function1<? super Float, Unit> r11, Continuation<? super AnimationResult<Float, AnimationVector1D>> r12) {
        if (isDecayApproachPossible(initialTargetOffset, initialVelocity) == false) goto L5;
        TargetApproachAnimation r0 = new DecayApproachAnimation(this.decayAnimationSpec);
    L6:
        ApproachAnimation animation = r0;
        return SnapFlingBehaviorKt.access$approach($this$runApproach, initialTargetOffset, initialVelocity, animation, r11, r12);
    L5:
        r0 = new TargetApproachAnimation(this.snapAnimationSpec);
        goto L6
    }

    private final boolean isDecayApproachPossible(float offset, float velocity) {
        float decayOffset = DecayAnimationSpecKt.calculateTargetValue(this.decayAnimationSpec, 0.0f, velocity);
        if (Math.abs(decayOffset) < Math.abs(offset)) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean equals(Object other) {
        if ((other instanceof SnapFlingBehavior) == true) goto L5;
        return false;
    L5:
        if (Intrinsics.areEqual(((SnapFlingBehavior) other).snapAnimationSpec, this.snapAnimationSpec) == true) goto L7;
        return false;
    L7:
        if (Intrinsics.areEqual(((SnapFlingBehavior) other).decayAnimationSpec, this.decayAnimationSpec) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(((SnapFlingBehavior) other).snapLayoutInfoProvider, this.snapLayoutInfoProvider) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public int hashCode() {
        int it = (0 * 31) + this.snapAnimationSpec.hashCode();
        int it2 = (it * 31) + this.decayAnimationSpec.hashCode();
        return (it2 * 31) + this.snapLayoutInfoProvider.hashCode();
    }
}
