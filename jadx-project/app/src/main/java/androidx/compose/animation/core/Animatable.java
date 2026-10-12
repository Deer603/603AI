package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B/\b\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tB7\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJY\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>2\u0006\u0010?\u001a\u00028\u00002\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000A2'\b\u0002\u0010B\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020D\u0018\u00010C¢\u0006\u0002\bEH\u0086@¢\u0006\u0002\u0010FJe\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>2\u0006\u0010,\u001a\u00028\u00002\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000H2\b\b\u0002\u0010?\u001a\u00028\u00002'\b\u0002\u0010B\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020D\u0018\u00010C¢\u0006\u0002\bEH\u0086@¢\u0006\u0002\u0010IJ\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000KJ\u0015\u0010L\u001a\u00028\u00002\u0006\u00106\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010MJ\b\u0010N\u001a\u00020DH\u0002J]\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Q2\u0006\u0010?\u001a\u00028\u00002%\u0010B\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020D\u0018\u00010C¢\u0006\u0002\bEH\u0082@¢\u0006\u0002\u0010RJ\u0016\u0010S\u001a\u00020D2\u0006\u0010,\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010TJ\u000e\u0010U\u001a\u00020DH\u0086@¢\u0006\u0002\u0010VJ#\u0010W\u001a\u00020D2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u00103\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010XR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0010\u0010#\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\u00028\u0001X\u0082\u0004¢\u0006\n\n\u0002\u0010$\u0012\u0004\b(\u0010)R\u0016\u0010*\u001a\u00028\u0001X\u0082\u0004¢\u0006\n\n\u0002\u0010$\u0012\u0004\b+\u0010)R+\u0010,\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b-\u0010!\"\u0004\b.\u0010/R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b4\u0010!R\u0010\u00105\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010$R\u0011\u00106\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b7\u0010!R\u0011\u00108\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b9\u0010!R\u0011\u0010:\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"¨\u0006Y"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "initialValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThreshold", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "<set-?>", "", "isRunning", "()Z", "setRunning", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "lowerBound", "getLowerBound", "()Ljava/lang/Object;", "Ljava/lang/Object;", "lowerBoundVector", "Landroidx/compose/animation/core/AnimationVector;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "negativeInfinityBounds", "getNegativeInfinityBounds$annotations", "()V", "positiveInfinityBounds", "getPositiveInfinityBounds$annotations", "targetValue", "getTargetValue", "setTargetValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "upperBound", "getUpperBound", "upperBoundVector", "value", "getValue", "velocity", "getVelocity", "velocityVector", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "animateDecay", "Landroidx/compose/animation/core/AnimationResult;", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asState", "Landroidx/compose/runtime/State;", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "runAnimation", "animation", "Landroidx/compose/animation/core/Animation;", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 0;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;
    private final MutableState isRunning$delegate;
    private final String label;
    private T lowerBound;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;
    private final MutableState targetValue$delegate;
    private final TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$runAnimation$2, reason: invalid class name */
    /* JADX INFO: compiled from: Animatable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {305}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Animatable<T, V> r2, T r3, Animation<T, V> r4, long r5, Function1<? super Animatable<T, V>, Unit> r7, Continuation<? super AnonymousClass2> r8) {
            this.this$0 = r2;
            this.$initialVelocity = r3;
            this.$animation = r4;
            this.$startTime = r5;
            this.$block = r7;
            super(1, r8);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r9) {
            return new AnonymousClass2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, r9);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object r2) {
            return invoke((Continuation) r2);
        }

        public final Object invoke(Continuation<? super AnimationResult<T, V>> r3) {
            return ((AnonymousClass2) create(r3)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            Ref.BooleanRef clampingNeeded = (Ref.BooleanRef) this.L$1;
            AnimationState endState = (AnimationState) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: CancellationException -> L20
        L15:
            if (clampingNeeded.element == false) goto L17;
            AnimationEndReason endReason = AnimationEndReason.BoundReached;     // Catch: CancellationException -> L20
        L18:
            Animatable.access$endAnimation(this.this$0);     // Catch: CancellationException -> L20
            return new AnimationResult(endState, endReason);
        L17:
            endReason = AnimationEndReason.Finished;     // Catch: CancellationException -> L20
            goto L18
        L9:
            ResultKt.throwOnFailure($result);
            this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release(this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));     // Catch: CancellationException -> L20
            Animatable.access$setTargetValue(this.this$0, this.$animation.getTargetValue());     // Catch: CancellationException -> L20
            Animatable.access$setRunning(this.this$0, true);     // Catch: CancellationException -> L20
            final AnimationState endState2 = AnimationStateKt.copy$default(this.this$0.getInternalState$animation_core_release(), null, null, 0, Long.MIN_VALUE, false, 23, null);     // Catch: CancellationException -> L20
            final Ref.BooleanRef clampingNeeded2 = new Ref.BooleanRef();     // Catch: CancellationException -> L20
            Animation<T, V> r4 = this.$animation;     // Catch: CancellationException -> L20
            long r5 = this.$startTime;     // Catch: CancellationException -> L20
            final Animatable<T, V> r8 = this.this$0;     // Catch: CancellationException -> L20
            final Function1<Animatable<T, V>, Unit> r9 = this.$block;     // Catch: CancellationException -> L20
            this.L$0 = endState2;     // Catch: CancellationException -> L20
            this.L$1 = clampingNeeded2;     // Catch: CancellationException -> L20
            this.label = 1;     // Catch: CancellationException -> L20
            if (SuspendAnimationKt.animate(endState2, r4, r5, new AnonymousClass1(r8, endState2, r9, clampingNeeded2), this) != r0) goto L13;
            return r0;
        L13:
            clampingNeeded = clampingNeeded2;
            endState = endState2;
            goto L15
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L20:
            e = move-exception;
            Animatable.access$endAnimation(this.this$0);
            throw e;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Animatable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C01902 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        C01902(Animatable<T, V> r2, T r3, Continuation<? super C01902> r4) {
            this.this$0 = r2;
            this.$targetValue = r3;
            super(1, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r4) {
            return new C01902(this.this$0, this.$targetValue, r4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((C01902) create(r3)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r3);
            Animatable.access$endAnimation(this.this$0);
            Object r0 = Animatable.access$clampToBounds(this.this$0, this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(r0);
            Animatable.access$setTargetValue(this.this$0, r0);
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$stop$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Animatable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C01912 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        C01912(Animatable<T, V> r2, Continuation<? super C01912> r3) {
            this.this$0 = r2;
            super(1, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r3) {
            return new C01912(this.this$0, r3);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((C01912) create(r3)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r2) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r2);
            Animatable.access$endAnimation(this.this$0);
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    private static /* synthetic */ void getNegativeInfinityBounds$annotations() {
    }

    private static /* synthetic */ void getPositiveInfinityBounds$annotations() {
    }

    public Animatable(T r12, TwoWayConverter<T, V> r13, T r14, String r15) {
        this.typeConverter = r13;
        this.visibilityThreshold = r14;
        this.label = r15;
        this.internalState = new AnimationState(this.typeConverter, r12, null, 0, 0, false, 60, null);
        this.isRunning$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.mutableStateOf$default(r12, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec(0.0f, 0.0f, this.visibilityThreshold, 3, null);
        AnimationVector r16 = getVelocityVector();
        if ((r16 instanceof AnimationVector1D) == false) goto L6;
        AnimationVector4D r17 = AnimatableKt.access$getNegativeInfinityBounds1D$p();
    L12:
        Intrinsics.checkNotNull(r17, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = r17;
        AnimationVector r18 = getVelocityVector();
        if ((r18 instanceof AnimationVector1D) == false) goto L16;
        AnimationVector4D r19 = AnimatableKt.access$getPositiveInfinityBounds1D$p();
    L22:
        Intrinsics.checkNotNull(r19, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = r19;
        this.lowerBoundVector = this.negativeInfinityBounds;
        this.upperBoundVector = this.positiveInfinityBounds;
        return;
    L16:
        if ((r18 instanceof AnimationVector2D) == false) goto L19;
        r19 = AnimatableKt.access$getPositiveInfinityBounds2D$p();
        goto L22
    L19:
        if ((r18 instanceof AnimationVector3D) == false) goto L21;
        r19 = AnimatableKt.access$getPositiveInfinityBounds3D$p();
        goto L22
    L21:
        r19 = AnimatableKt.access$getPositiveInfinityBounds4D$p();
        goto L22
    L6:
        if ((r16 instanceof AnimationVector2D) == false) goto L9;
        r17 = AnimatableKt.access$getNegativeInfinityBounds2D$p();
        goto L12
    L9:
        if ((r16 instanceof AnimationVector3D) == false) goto L11;
        r17 = AnimatableKt.access$getNegativeInfinityBounds3D$p();
        goto L12
    L11:
        r17 = AnimatableKt.access$getNegativeInfinityBounds4D$p();
        goto L12
    }

    public static final /* synthetic */ Object access$clampToBounds(Animatable $this, Object value) {
        return $this.clampToBounds(value);
    }

    public static final /* synthetic */ void access$endAnimation(Animatable $this) {
        $this.endAnimation();
    }

    public static final /* synthetic */ Object access$runAnimation(Animatable $this, Animation animation, Object initialVelocity, Function1 block, Continuation $completion) {
        return $this.runAnimation(animation, initialVelocity, block, $completion);
    }

    public static final /* synthetic */ void access$setRunning(Animatable $this, boolean r1) {
        $this.setRunning(r1);
    }

    public static final /* synthetic */ void access$setTargetValue(Animatable $this, Object r1) {
        $this.setTargetValue(r1);
    }

    public /* synthetic */ Animatable(Object r1, TwoWayConverter r2, Object r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = null;
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = "Animatable";
    L8:
        this(r1, r2, r3, r4);
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ Animatable(Object r1, TwoWayConverter r2, Object r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @ReplaceWith(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(Object initialValue, TwoWayConverter typeConverter, Object visibilityThreshold) {
        this(initialValue, typeConverter, visibilityThreshold, "Animatable");
    }

    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    private final void setRunning(boolean r5) {
        MutableState $this$setValue$iv = this.isRunning$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean isRunning() {
        State $this$getValue$iv = this.isRunning$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setTargetValue(T r4) {
        MutableState $this$setValue$iv = this.targetValue$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final T getTargetValue() {
        State $this$getValue$iv = this.targetValue$delegate;
        return $this$getValue$iv.getValue();
    }

    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getUpperBound() {
        return this.upperBound;
    }

    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable r0, Object r1, Object r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.lowerBound;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = r0.upperBound;
    L8:
        r0.updateBounds(r1, r2);
    }

    public final void updateBounds(T r10, T r11) {
        if (r10 == null) goto L5;
        V r2 = this.typeConverter.getConvertToVector().invoke(r10);
        if (r2 == null) goto L5;
    L7:
        if (r11 == null) goto L10;
        V r3 = this.typeConverter.getConvertToVector().invoke(r11);
        if (r3 == null) goto L10;
    L11:
        int i = 0;
        int r1 = r2.getSize$animation_core_release();
    L12:
        if (i >= r1) goto L21;
        if (r2.get$animation_core_release(i) > r3.get$animation_core_release(i)) goto L16;
        boolean value$iv = true;
    L18:
        if (value$iv == true) goto L20;
        PreconditionsKt.throwIllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + r2 + " is greater than upper bound " + r3 + " on index " + i);
    L20:
        i = i + 1;
        goto L12
    L16:
        value$iv = false;
        goto L18
    L21:
        this.lowerBoundVector = r2;
        this.upperBoundVector = r3;
        this.upperBound = r11;
        this.lowerBound = r10;
        if (isRunning() == true) goto L30;
        T r0 = clampToBounds(getValue());
        if (Intrinsics.areEqual(r0, getValue()) == true) goto L31;
        this.internalState.setValue$animation_core_release(r0);
        return;
    L31:
        return;
    L30:
        return;
    L10:
        r3 = this.positiveInfinityBounds;
    L5:
        r2 = this.negativeInfinityBounds;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable r6, Object r7, AnimationSpec r8, Object r9, Function1 r10, Continuation r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        AnimationSpec r2 = r6.defaultSpringSpec;
    L7:
        if ((r12 & 4) == 0) goto L9;
        Object r3 = r6.getVelocity();
    L11:
        if ((r12 & 8) == 0) goto L13;
        Function1 r4 = null;
    L15:
        return r6.animateTo(r7, r2, r3, r4, r11);
    L13:
        r4 = r10;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    public final Object animateTo(T r3, AnimationSpec<T> r4, T r5, Function1<? super Animatable<T, V>, Unit> r6, Continuation<? super AnimationResult<T, V>> r7) {
        T r0 = getValue();
        TargetBasedAnimation anim = AnimationKt.TargetBasedAnimation(r4, this.typeConverter, r0, r3, r5);
        return runAnimation(anim, r5, r6, r7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable r0, Object r1, DecayAnimationSpec r2, Function1 r3, Continuation r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = null;
    L6:
        return r0.animateDecay(r1, r2, r3, r4);
    }

    public final Object animateDecay(T r5, DecayAnimationSpec<T> r6, Function1<? super Animatable<T, V>, Unit> r7, Continuation<? super AnimationResult<T, V>> r8) {
        T r0 = getValue();
        V r1 = this.typeConverter.getConvertToVector().invoke(r5);
        DecayAnimation anim = new DecayAnimation(r6, this.typeConverter, r0, r1);
        return runAnimation(anim, r5, r7, r8);
    }

    private final Object runAnimation(Animation<T, V> r13, T r14, Function1<? super Animatable<T, V>, Unit> r15, Continuation<? super AnimationResult<T, V>> r16) {
        long startTime = this.internalState.getLastFrameTimeNanos();
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(this, r14, r13, startTime, r15, null), r16, 1, null);
    }

    private final T clampToBounds(T r8) {
        if (Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) == true) goto L5;
    L7:
        V r0 = this.typeConverter.getConvertToVector().invoke(r8);
        boolean clamped = false;
        int i = 0;
        int r3 = r0.getSize$animation_core_release();
    L8:
        if (i >= r3) goto L15;
        if (r0.get$animation_core_release(i) >= this.lowerBoundVector.get$animation_core_release(i)) goto L12;
    L13:
        clamped = true;
        r0.set$animation_core_release(i, RangesKt.coerceIn(r0.get$animation_core_release(i), this.lowerBoundVector.get$animation_core_release(i), this.upperBoundVector.get$animation_core_release(i)));
    L14:
        i = i + 1;
        goto L8
    L12:
        if (r0.get$animation_core_release(i) <= this.upperBoundVector.get$animation_core_release(i)) goto L14;
    L15:
        if (clamped == true) goto L17;
        return r8;
    L17:
        return this.typeConverter.getConvertFromVector().invoke(r0);
    L5:
        if (Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds) == false) goto L7;
        return r8;
    }

    private final void endAnimation() {
        AnimationState<T, V> r0 = this.internalState;
        r0.getVelocityVector().reset$animation_core_release();
        r0.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    public final Object snapTo(T r7, Continuation<? super Unit> r8) {
        Object r9 = MutatorMutex.mutate$default(this.mutatorMutex, null, new C01902(this, r7, null), r8, 1, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r9;
    L6:
        return Unit.INSTANCE;
    }

    public final Object stop(Continuation<? super Unit> r7) {
        Object r8 = MutatorMutex.mutate$default(this.mutatorMutex, null, new C01912(this, null), r7, 1, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    public final State<T> asState() {
        return this.internalState;
    }
}
