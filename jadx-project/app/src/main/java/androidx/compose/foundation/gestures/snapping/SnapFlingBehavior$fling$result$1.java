package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {135, 151}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ Function1<Float, Unit> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: Multi-variable type inference failed */
    SnapFlingBehavior$fling$result$1(SnapFlingBehavior r2, float r3, Function1<? super Float, Unit> r4, ScrollScope r5, Continuation<? super SnapFlingBehavior$fling$result$1> r6) {
        this.this$0 = r2;
        this.$initialVelocity = r3;
        this.$onRemainingScrollOffsetUpdate = r4;
        this.$this_fling = r5;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, r8);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super AnimationResult<Float, AnimationVector1D>> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super AnimationResult<Float, AnimationVector1D>> r4) {
        return ((SnapFlingBehavior$fling$result$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L8;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);
        return $result;
    L7:
        Object $result2 = $result;
        Ref.FloatRef remainingScrollOffset = (Ref.FloatRef) this.L$0;
        ResultKt.throwOnFailure($result2);
        final Ref.FloatRef remainingScrollOffset2 = remainingScrollOffset;
        Object r4 = $result2;
    L14:
        AnimationState animationState = (AnimationState) r4;
        float finalSnapOffset = SnapFlingBehavior.access$getSnapLayoutInfoProvider$p(this.this$0).calculateSnapOffset(((Number) animationState.getVelocity()).floatValue());
        boolean value$iv = true ^ Float.isNaN(finalSnapOffset);
        if (value$iv == true) goto L17;
        InlineClassHelperKt.throwIllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
    L17:
        remainingScrollOffset2.element = finalSnapOffset;
        ScrollScope r3 = this.$this_fling;
        float r5 = remainingScrollOffset2.element;
        float r7 = remainingScrollOffset2.element;
        AnimationState r10 = AnimationStateKt.copy$default(animationState, 0.0f, 0.0f, 0, 0, false, 30, null);
        AnimationSpec r11 = SnapFlingBehavior.access$getSnapAnimationSpec$p(this.this$0);
        final Function1<Float, Unit> r8 = this.$onRemainingScrollOffsetUpdate;
        this.L$0 = null;
        this.label = 2;
        Object r6 = SnapFlingBehaviorKt.access$animateWithTarget(r3, r5, r7, r10, r11, new AnonymousClass4(remainingScrollOffset2, r8), this);
        if (r6 != r1) goto L21;
        return r1;
    L21:
        return r6;
    L8:
        ResultKt.throwOnFailure($result);
        $result2 = $result;
        float decayOffset = SnapFlingBehavior.access$getSnapLayoutInfoProvider$p(this.this$0).calculateApproachOffset(this.$initialVelocity, DecayAnimationSpecKt.calculateTargetValue(SnapFlingBehavior.access$getDecayAnimationSpec$p(this.this$0), 0.0f, this.$initialVelocity));
        boolean value$iv2 = !Float.isNaN(decayOffset);
        if (value$iv2 == true) goto L11;
        InlineClassHelperKt.throwIllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
    L11:
        remainingScrollOffset2 = new Ref.FloatRef();
        float initialOffset = Math.abs(decayOffset);
        remainingScrollOffset2.element = initialOffset * Math.signum(this.$initialVelocity);
        this.$onRemainingScrollOffsetUpdate.invoke(Boxing.boxFloat(remainingScrollOffset2.element));
        SnapFlingBehavior r9 = this.this$0;
        ScrollScope r12 = this.$this_fling;
        float r13 = remainingScrollOffset2.element;
        float r14 = this.$initialVelocity;
        final Function1<Float, Unit> r15 = this.$onRemainingScrollOffsetUpdate;
        this.L$0 = remainingScrollOffset2;
        this.label = 1;
        r4 = SnapFlingBehavior.access$tryApproach(r9, r12, r13, r14, new SnapFlingBehavior$fling$result$1$animationState$1(remainingScrollOffset2, r15), this);
        if (r4 != r1) goto L14;
        return r1;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
