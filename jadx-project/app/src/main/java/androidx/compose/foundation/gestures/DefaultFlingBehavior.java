package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u0004*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0096@¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollableDefaultFlingBehavior;", "flingDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "motionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "lastAnimationCycleCount", "", "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V", "updateDensity", "", "density", "Landroidx/compose/ui/unit/Density;", "performFling", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultFlingBehavior implements ScrollableDefaultFlingBehavior {
    public static final int $stable = 0;
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {953}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Float>, Object> {
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ ScrollScope $this_performFling;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DefaultFlingBehavior this$0;

        AnonymousClass2(float r2, DefaultFlingBehavior r3, ScrollScope r4, Continuation<? super AnonymousClass2> r5) {
            this.$initialVelocity = r2;
            this.this$0 = r3;
            this.$this_performFling = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new AnonymousClass2(this.$initialVelocity, this.this$0, this.$this_performFling, r6);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Float> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Float> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L11;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            AnimationState animationState = (AnimationState) this.L$1;
            final Ref.FloatRef velocityLeft = (Ref.FloatRef) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L9
        L22:
            float r1 = velocityLeft.element;
        L25:
            return Boxing.boxFloat(r1);
        L21:
            velocityLeft.element = ((Number) animationState.getVelocity()).floatValue();
            goto L22
        L11:
            ResultKt.throwOnFailure($result);
            if (Math.abs(this.$initialVelocity) <= 1.0f) goto L23;
            velocityLeft = new Ref.FloatRef();
            velocityLeft.element = this.$initialVelocity;
            final Ref.FloatRef lastValue = new Ref.FloatRef();
            AnimationState animationState2 = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0, 0, false, 28, null);
            DecayAnimationSpec r5 = DefaultFlingBehavior.access$getFlingDecay$p(this.this$0);     // Catch: CancellationException -> L19
            final ScrollScope r6 = this.$this_performFling;     // Catch: CancellationException -> L19
            final DefaultFlingBehavior r7 = this.this$0;     // Catch: CancellationException -> L19
            this.L$0 = velocityLeft;     // Catch: CancellationException -> L19
            this.L$1 = animationState2;     // Catch: CancellationException -> L19
            this.label = 1;     // Catch: CancellationException -> L19
            if (SuspendAnimationKt.animateDecay$default(animationState2, r5, false, new AnonymousClass1(lastValue, r6, velocityLeft, r7), this, 2, null) != r0) goto L22;
            return r0;
        L20:
            animationState = animationState2;
            goto L21
        L23:
            r1 = this.$initialVelocity;
            goto L25
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
    }

    public DefaultFlingBehavior(DecayAnimationSpec<Float> r1, MotionDurationScale motionDurationScale) {
        this.flingDecay = r1;
        this.motionDurationScale = motionDurationScale;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec r1, MotionDurationScale r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = ScrollableKt.getDefaultScrollMotionDurationScale();
    L5:
        this(r1, r2);
    }

    public static final /* synthetic */ DecayAnimationSpec access$getFlingDecay$p(DefaultFlingBehavior $this) {
        return $this.flingDecay;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void setLastAnimationCycleCount(int r1) {
        this.lastAnimationCycleCount = r1;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope $this$performFling, float initialVelocity, Continuation<? super Float> r6) {
        this.lastAnimationCycleCount = 0;
        return BuildersKt.withContext(this.motionDurationScale, new AnonymousClass2(initialVelocity, this, $this$performFling, null), r6);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior
    public void updateDensity(Density density) {
        this.flingDecay = SplineBasedDecayKt.splineBasedDecay(density);
    }
}
