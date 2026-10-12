package androidx.compose.foundation.gestures.snapping;

import androidx.autofill.HintConstants;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082\b\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001f\u001ak\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"0!*\u00020#2\u0006\u0010$\u001a\u00020\b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"0&2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00120(H\u0082@¢\u0006\u0002\u0010,\u001as\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"0!*\u00020#2\u0006\u0010$\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"0&2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00120(H\u0082@¢\u0006\u0002\u00100\u001ae\u00101\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"0!*\u00020#2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"052!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00120(H\u0082@¢\u0006\u0002\u00106\u001a\u0014\u00107\u001a\u00020\b*\u00020\b2\u0006\u00108\u001a\u00020\bH\u0002\u001a(\u00109\u001a\u0002H:\"\u000e\b\u0000\u0010:*\b\u0012\u0004\u0012\u0002H:0;*\b\u0012\u0004\u0012\u0002H:0<H\u0082\u0002¢\u0006\u0002\u0010=\u001a(\u0010>\u001a\u0002H:\"\u000e\b\u0000\u0010:*\b\u0012\u0004\u0012\u0002H:0;*\b\u0012\u0004\u0012\u0002H:0<H\u0082\u0002¢\u0006\u0002\u0010=\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"DEBUG", "", "MinFlingVelocityDp", "Landroidx/compose/ui/unit/Dp;", "getMinFlingVelocityDp", "()F", "F", "NoDistance", "", "NoVelocity", "calculateFinalOffset", "snappingOffset", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "lowerBound", "upperBound", "calculateFinalOffset-Fhqu1e0", "(IFF)F", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "snapFlingBehavior", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "animateDecay", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "targetOffset", "animationState", "Landroidx/compose/animation/core/AnimationState;", "onAnimationStep", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "delta", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateWithTarget", "cancelOffset", "animationSpec", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "approach", "initialTargetOffset", "initialVelocity", "animation", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceToTarget", "target", "component1", "T", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "component2", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = 0.0f;
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {313}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.access$animateDecay(null, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {354}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
    static final class C02801 extends ContinuationImpl {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C02801(Continuation<? super C02801> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            this.result = r9;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.access$animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    public static final /* synthetic */ Object access$animateDecay(ScrollScope $receiver, float targetOffset, AnimationState animationState, DecayAnimationSpec decayAnimationSpec, Function1 onAnimationStep, Continuation $completion) {
        return animateDecay($receiver, targetOffset, animationState, decayAnimationSpec, onAnimationStep, $completion);
    }

    public static final /* synthetic */ void access$animateDecay$consumeDelta(AnimationScope $receiver, ScrollScope $this_animateDecay, Function1 $onAnimationStep, float delta) {
        animateDecay$consumeDelta($receiver, $this_animateDecay, $onAnimationStep, delta);
    }

    public static final /* synthetic */ Object access$animateWithTarget(ScrollScope $receiver, float targetOffset, float cancelOffset, AnimationState animationState, AnimationSpec animationSpec, Function1 onAnimationStep, Continuation $completion) {
        return animateWithTarget($receiver, targetOffset, cancelOffset, animationState, animationSpec, onAnimationStep, $completion);
    }

    public static final /* synthetic */ Object access$approach(ScrollScope $receiver, float initialTargetOffset, float initialVelocity, ApproachAnimation animation, Function1 onAnimationStep, Continuation $completion) {
        return approach($receiver, initialTargetOffset, initialVelocity, animation, onAnimationStep, $completion);
    }

    public static final /* synthetic */ float access$coerceToTarget(float $receiver, float target) {
        return coerceToTarget($receiver, target);
    }

    public static final TargetedFlingBehavior snapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> r2, AnimationSpec<Float> r3) {
        return new SnapFlingBehavior(snapLayoutInfoProvider, r2, r3);
    }

    public static final TargetedFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1921733134, "C(rememberSnapFlingBehavior)232@10332L7,233@10402L26,234@10440L310:SnapFlingBehavior.kt#ppz6w6");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1921733134, $changed, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:231)");
    L5:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density density = (Density) r3;
        boolean r1 = false;
        DecayAnimationSpec highVelocityApproachSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay($composer, 0);
        ComposerKt.sourceInformationMarkerStart($composer, 962715205, "CC(remember):SnapFlingBehavior.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(snapLayoutInfoProvider) == false) goto L10;
    L11:
        r1 = true;
    L12:
        boolean invalid$iv = (r1 | $composer.changed(highVelocityApproachSpec)) | $composer.changed(density);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L15;
    L18:
        Object value$iv = snapFlingBehavior(snapLayoutInfoProvider, highVelocityApproachSpec, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L19:
        TargetedFlingBehavior r5 = (TargetedFlingBehavior) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
    L22:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L15:
        if (it$iv != Composer.Companion.getEmpty()) goto L19;
    L10:
        if (($changed & 6) != 4) goto L12;
        goto L11
    }

    private static final Object approach(ScrollScope $this$approach, float initialTargetOffset, float initialVelocity, ApproachAnimation<Float, AnimationVector1D> r9, Function1<? super Float, Unit> r10, Continuation<? super AnimationResult<Float, AnimationVector1D>> r11) {
        return r9.approachAnimation($this$approach, Boxing.boxFloat(initialTargetOffset), Boxing.boxFloat(initialVelocity), r10, r11);
    }

    private static final <T extends Comparable<? super T>> T component1(ClosedFloatingPointRange<T> r1) {
        return r1.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(ClosedFloatingPointRange<T> r1) {
        return r1.getEndInclusive();
    }

    private static final Object animateDecay(final ScrollScope $this$animateDecay, final float targetOffset, AnimationState<Float, AnimationVector1D> r9, DecayAnimationSpec<Float> r10, final Function1<? super Float, Unit> r11, Continuation<? super AnimationResult<Float, AnimationVector1D>> r12) {
        if ((r12 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r12;
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
        float targetOffset2 = r0.F$0;
        Ref.FloatRef previousValue = (Ref.FloatRef) r0.L$1;
        r9 = (AnimationState) r0.L$0;
        ResultKt.throwOnFailure($result);
    L22:
        return new AnimationResult(Boxing.boxFloat(targetOffset2 - previousValue.element), r9);
    L13:
        ResultKt.throwOnFailure($result);
        final Ref.FloatRef previousValue2 = new Ref.FloatRef();
        if (r9.getVelocity().floatValue() != 0.0f) goto L16;
        boolean r4 = true;
    L17:
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> r6 = new AnonymousClass2(targetOffset, previousValue2, $this$animateDecay, r11);
        r0.L$0 = r9;
        r0.L$1 = previousValue2;
        r0.F$0 = targetOffset;
        r0.label = 1;
        if (SuspendAnimationKt.animateDecay(r9, r10, !r4, r6, r0) != r2) goto L20;
        return r2;
    L20:
        targetOffset2 = targetOffset;
        previousValue = previousValue2;
        goto L22
    L16:
        r4 = false;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r12);
        goto L8
    }

    private static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> r3, ScrollScope $this_animateDecay, Function1<? super Float, Unit> r5, float delta) {
        float consumed = 0.0f;
        if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled == true) goto L13;
        consumed = $this_animateDecay.scrollBy(delta);
    L9:
        r5.invoke(Float.valueOf(consumed));
        if (Math.abs(delta - consumed) <= 0.5f) goto L15;
        r3.cancelAnimation();
        return;
    L15:
        return;
    L13:
        consumed = $this_animateDecay.scrollBy(delta);     // Catch: CancellationException -> L6
    L7:
        r3.cancelAnimation();
        goto L9
    }

    private static final Object animateWithTarget(final ScrollScope $this$animateWithTarget, float r19, final float cancelOffset, AnimationState<Float, AnimationVector1D> r21, AnimationSpec<Float> r22, final Function1<? super Float, Unit> r23, Continuation<? super AnimationResult<Float, AnimationVector1D>> r24) {
        if ((r24 instanceof C02801) == false) goto L7;
        C02801 r1 = (C02801) r24;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        float initialVelocity = r1.F$1;
        float targetOffset = r1.F$0;
        Ref.FloatRef consumedUpToNow = (Ref.FloatRef) r1.L$1;
        AnimationState<Float, AnimationVector1D> r6 = (AnimationState) r1.L$0;
        ResultKt.throwOnFailure($result);
        float targetOffset2 = targetOffset;
        AnimationState<Float, AnimationVector1D> r8 = r6;
    L21:
        float finalVelocity = coerceToTarget(r8.getVelocity().floatValue(), initialVelocity);
        return new AnimationResult(Boxing.boxFloat(targetOffset2 - consumedUpToNow.element), AnimationStateKt.copy$default(r8, 0.0f, finalVelocity, 0, 0, false, 29, null));
    L13:
        ResultKt.throwOnFailure($result);
        targetOffset2 = r19;
        final Ref.FloatRef consumedUpToNow2 = new Ref.FloatRef();
        float initialVelocity2 = r21.getVelocity().floatValue();
        Float r12 = Boxing.boxFloat(targetOffset2);
        if (r21.getVelocity().floatValue() != 0.0f) goto L16;
        boolean r13 = true;
    L17:
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> r15 = new C02812(cancelOffset, consumedUpToNow2, $this$animateWithTarget, r23);
        r1.L$0 = r21;
        r1.L$1 = consumedUpToNow2;
        r1.F$0 = targetOffset2;
        r1.F$1 = initialVelocity2;
        r1.label = 1;
        Continuation $continuation = r1;
        if (SuspendAnimationKt.animateTo(r21, r12, r22, !r13, r15, $continuation) != r3) goto L20;
        return r3;
    L20:
        consumedUpToNow = consumedUpToNow2;
        initialVelocity = initialVelocity2;
        r8 = r21;
        goto L21
    L16:
        r13 = false;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C02801(r24);
        goto L8
    }

    private static final float coerceToTarget(float $this$coerceToTarget, float target) {
        if (target != 0.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L9;
        return 0.0f;
    L9:
        if (target <= 0.0f) goto L12;
        return RangesKt.coerceAtMost($this$coerceToTarget, target);
    L12:
        return RangesKt.coerceAtLeast($this$coerceToTarget, target);
    L5:
        r1 = false;
        goto L6
    }

    static {
        MinFlingVelocityDp = Dp.m6973constructorimpl(400);
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float $this$calculateFinalOffset_Fhqu1e0_u24isValidDistance) {
        if ($this$calculateFinalOffset_Fhqu1e0_u24isValidDistance != Float.POSITIVE_INFINITY) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L14;
        if ($this$calculateFinalOffset_Fhqu1e0_u24isValidDistance != Float.NEGATIVE_INFINITY) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == true) goto L14;
        return true;
    L10:
        r1 = false;
    L14:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: calculateFinalOffset-Fhqu1e0, reason: not valid java name */
    public static final float m546calculateFinalOffsetFhqu1e0(int snappingOffset, float lowerBound, float upperBound) {
        if (FinalSnappingItem.m539equalsimpl0(snappingOffset, FinalSnappingItem.Companion.m543getClosestItembbeMdSM()) == false) goto L9;
        if (Math.abs(upperBound) > Math.abs(lowerBound)) goto L13;
    L10:
        float finalDistance = upperBound;
    L16:
        if (calculateFinalOffset_Fhqu1e0$isValidDistance(finalDistance) == true) goto L19;
        return 0.0f;
    L19:
        return finalDistance;
    L13:
        finalDistance = lowerBound;
        goto L16
    L9:
        if (FinalSnappingItem.m539equalsimpl0(snappingOffset, FinalSnappingItem.Companion.m544getNextItembbeMdSM()) == true) goto L10;
        if (FinalSnappingItem.m539equalsimpl0(snappingOffset, FinalSnappingItem.Companion.m545getPreviousItembbeMdSM()) == true) goto L13;
        finalDistance = 0.0f;
        goto L16
    }

    private static final void debugLog(Function0<String> r1) {
    }
}
