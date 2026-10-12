package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 X*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002XYB\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010<\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=J*\u0010>\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00028\u00002\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010@H\u0086@¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=J\b\u0010C\u001a\u00020\bH\u0002J\b\u0010D\u001a\u00020\bH\u0002J\r\u0010E\u001a\u00020\bH\u0000¢\u0006\u0002\bFJ\r\u0010G\u001a\u00020\bH\u0000¢\u0006\u0002\bHJ\u0018\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u0007H\u0002J\u000e\u0010L\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=J\"\u0010M\u001a\u00020\b2\b\b\u0001\u0010#\u001a\u00020!2\b\b\u0002\u00101\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020\bH\u0002J\u0016\u0010P\u001a\u00020\b2\u0006\u00101\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010QJ\u001b\u0010R\u001a\u00020\b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0010¢\u0006\u0002\bSJ\r\u0010T\u001a\u00020\bH\u0010¢\u0006\u0002\bUJ\u000e\u0010V\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=J\u000e\u0010W\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010=R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00028\u0000X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u0004R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010#\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020!8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\b00X\u0082\u0004¢\u0006\u0002\n\u0000R+\u00101\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u001f\u001a\u0004\b2\u0010\u000b\"\u0004\b3\u0010\u0004R\u001a\u00105\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "initialState", "(Ljava/lang/Object;)V", "animateOneFrameLambda", "Lkotlin/Function1;", "", "", "composedTargetState", "getComposedTargetState$animation_core_release", "()Ljava/lang/Object;", "setComposedTargetState$animation_core_release", "Ljava/lang/Object;", "compositionContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "getCompositionContinuation$animation_core_release", "()Lkotlinx/coroutines/CancellableContinuation;", "setCompositionContinuation$animation_core_release", "(Lkotlinx/coroutines/CancellableContinuation;)V", "compositionContinuationMutex", "Lkotlinx/coroutines/sync/Mutex;", "getCompositionContinuationMutex$animation_core_release", "()Lkotlinx/coroutines/sync/Mutex;", "currentAnimation", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "<set-?>", "currentState", "getCurrentState", "setCurrentState$animation_core_release", "currentState$delegate", "Landroidx/compose/runtime/MutableState;", "durationScale", "", "firstFrameLambda", "fraction", "getFraction", "()F", "setFraction", "(F)V", "fraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "initialValueAnimations", "Landroidx/collection/MutableObjectList;", "lastFrameTimeNanos", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "recalculateTotalDurationNanos", "Lkotlin/Function0;", "targetState", "getTargetState", "setTargetState$animation_core_release", "targetState$delegate", "totalDurationNanos", "getTotalDurationNanos$animation_core_release", "()J", "setTotalDurationNanos$animation_core_release", "(J)V", "transition", "Landroidx/compose/animation/core/Transition;", "animateOneFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doOneFrame", "endAllAnimations", "moveAnimationToInitialState", "observeTotalDuration", "observeTotalDuration$animation_core_release", "onTotalDurationChanged", "onTotalDurationChanged$animation_core_release", "recalculateAnimationValue", "animation", "deltaPlayTimeNanos", "runAnimations", "seekTo", "(FLjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "seekToFraction", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionConfigured", "transitionConfigured$animation_core_release", "transitionRemoved", "transitionRemoved$animation_core_release", "waitForComposition", "waitForCompositionAfterTargetStateChange", "Companion", "SeekingAnimationState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SeekableTransitionState<S> extends TransitionState<S> {
    public static final int $stable = 0;
    private static final Companion Companion = null;
    private static final AnimationVector1D Target1 = null;
    private static final AnimationVector1D ZeroVelocity = null;
    private final Function1<Long, Unit> animateOneFrameLambda;
    private S composedTargetState;
    private CancellableContinuation<? super S> compositionContinuation;
    private final Mutex compositionContinuationMutex;
    private SeekingAnimationState currentAnimation;
    private final MutableState currentState$delegate;
    private float durationScale;
    private final Function1<Long, Unit> firstFrameLambda;
    private final MutableFloatState fraction$delegate;
    private final MutableObjectList<SeekingAnimationState> initialValueAnimations;
    private long lastFrameTimeNanos;
    private final MutatorMutex mutatorMutex;
    private final Function0<Unit> recalculateTotalDurationNanos;
    private final MutableState targetState$delegate;
    private long totalDurationNanos;
    private Transition<S> transition;

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$Companion;", "", "()V", "Target1", "Landroidx/compose/animation/core/AnimationVector1D;", "getTarget1", "()Landroidx/compose/animation/core/AnimationVector1D;", "ZeroVelocity", "getZeroVelocity", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final AnimationVector1D getZeroVelocity() {
            return SeekableTransitionState.access$getZeroVelocity$cp();
        }

        public final AnimationVector1D getTarget1() {
            return SeekableTransitionState.access$getTarget1$cp();
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u001a\u0010 \u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "", "()V", "animationSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "getAnimationSpec", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;)V", "animationSpecDuration", "", "getAnimationSpecDuration", "()J", "setAnimationSpecDuration", "(J)V", "durationNanos", "getDurationNanos", "setDurationNanos", "initialVelocity", "getInitialVelocity", "()Landroidx/compose/animation/core/AnimationVector1D;", "setInitialVelocity", "(Landroidx/compose/animation/core/AnimationVector1D;)V", "isComplete", "", "()Z", "setComplete", "(Z)V", "progressNanos", "getProgressNanos", "setProgressNanos", "start", "getStart", "setStart", "value", "", "getValue", "()F", "setValue", "(F)V", "toString", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SeekingAnimationState {
        public static final int $stable = 0;
        private VectorizedAnimationSpec<AnimationVector1D> animationSpec;
        private long animationSpecDuration;
        private long durationNanos;
        private AnimationVector1D initialVelocity;
        private boolean isComplete;
        private long progressNanos;
        private AnimationVector1D start;
        private float value;

        static {
            $stable = 8;
        }

        public SeekingAnimationState() {
            this.start = new AnimationVector1D(0.0f);
        }

        public final long getProgressNanos() {
            return this.progressNanos;
        }

        public final void setProgressNanos(long r1) {
            this.progressNanos = r1;
        }

        public final VectorizedAnimationSpec<AnimationVector1D> getAnimationSpec() {
            return this.animationSpec;
        }

        public final void setAnimationSpec(VectorizedAnimationSpec<AnimationVector1D> r1) {
            this.animationSpec = r1;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final void setComplete(boolean r1) {
            this.isComplete = r1;
        }

        public final float getValue() {
            return this.value;
        }

        public final void setValue(float r1) {
            this.value = r1;
        }

        public final AnimationVector1D getStart() {
            return this.start;
        }

        public final void setStart(AnimationVector1D r1) {
            this.start = r1;
        }

        public final AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final void setInitialVelocity(AnimationVector1D r1) {
            this.initialVelocity = r1;
        }

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        public final void setDurationNanos(long r1) {
            this.durationNanos = r1;
        }

        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        public final void setAnimationSpecDuration(long r1) {
            this.animationSpecDuration = r1;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "S"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", i = {}, l = {599}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "S", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", i = {0}, l = {2147, 612, 614, 668, 670}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            AnonymousClass1(SeekableTransitionState<S> r2, S r3, Transition<S> r4, FiniteAnimationSpec<Float> r5, Continuation<? super AnonymousClass1> r6) {
                this.this$0 = r2;
                this.$targetState = r3;
                this.$transition = r4;
                this.$animationSpec = r5;
                super(2, r6);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
                return new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, r8);
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
            public final Object invokeSuspend(Object r18) {
                Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L11;
                    case 1: goto L10;
                    case 2: goto L9;
                    case 3: goto L8;
                    case 4: goto L7;
                    case 5: goto L6;
                    default: goto L5;
                };
            L6:
                Object $result = r18;
                ResultKt.throwOnFailure($result);
            L75:
                SeekableTransitionState.access$setFraction(this.this$0, 0.0f);
            L76:
                Object $result2 = Unit.INSTANCE;
                return $result2;
            L7:
                Object $result3 = r18;
                ResultKt.throwOnFailure($result3);
            L71:
                this.this$0.setCurrentState$animation_core_release(this.$targetState);
                this.label = 5;
                if (SeekableTransitionState.access$waitForComposition(this.this$0, this) != r0) goto L74;
                return r0;
            L74:
                $result = $result3;
                goto L75
            L8:
                $result3 = r18;
                ResultKt.throwOnFailure($result3);
            L29:
                if (Intrinsics.areEqual(this.this$0.getCurrentState(), this.$targetState) == true) goto L76;
                if (this.this$0.getFraction() >= 1.0f) goto L68;
                SeekingAnimationState newAnimation = SeekableTransitionState.access$getCurrentAnimation$p(this.this$0);
                FiniteAnimationSpec<Float> r9 = this.$animationSpec;
                if (r9 == null) goto L35;
                VectorizedFiniteAnimationSpec newSpec = r9.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));
            L36:
                if (newAnimation != null) goto L38;
            L39:
                if (newAnimation == null) goto L41;
                VectorizedAnimationSpec<AnimationVector1D> r10 = newAnimation.getAnimationSpec();
            L42:
                VectorizedAnimationSpec<AnimationVector1D> r11 = r10;
                if (r11 == null) goto L48;
                long r12 = newAnimation.getProgressNanos();
                AnimationVector1D r14 = newAnimation.getStart();
                AnimationVector1D r15 = SeekableTransitionState.access$getCompanion$p().getTarget1();
                AnimationVector1D r8 = newAnimation.getInitialVelocity();
                if (r8 != null) goto L47;
                r8 = SeekableTransitionState.access$getCompanion$p().getZeroVelocity();
            L47:
                AnimationVector1D oldVelocity = (AnimationVector1D) r11.getVelocityFromNanos(r12, r14, r15, r8);
            L61:
                if (newAnimation != null) goto L63;
                newAnimation = new SeekingAnimationState();
            L63:
                newAnimation.setAnimationSpec(newSpec);
                newAnimation.setComplete(false);
                newAnimation.setValue(this.this$0.getFraction());
                newAnimation.getStart().set$animation_core_release(0, this.this$0.getFraction());
                newAnimation.setDurationNanos(this.this$0.getTotalDurationNanos$animation_core_release());
                newAnimation.setProgressNanos(0);
                newAnimation.setInitialVelocity(oldVelocity);
                if (newSpec == null) goto L66;
                long r3 = newSpec.getDurationNanos(newAnimation.getStart(), SeekableTransitionState.access$getCompanion$p().getTarget1(), oldVelocity);
            L67:
                newAnimation.setAnimationSpecDuration(r3);
                SeekableTransitionState.access$setCurrentAnimation$p(this.this$0, newAnimation);
                goto L68
            L66:
                r3 = MathKt.roundToLong(this.this$0.getTotalDurationNanos$animation_core_release() * (1.0d - ((double) this.this$0.getFraction())));
                goto L67
            L48:
                if (newAnimation != null) goto L50;
            L60:
                oldVelocity = SeekableTransitionState.access$getCompanion$p().getZeroVelocity();
                goto L61
            L50:
                if (newAnimation.getProgressNanos() == 0) goto L60;
                long oldDurationNanos = newAnimation.getDurationNanos();
                if (oldDurationNanos != Long.MIN_VALUE) goto L56;
                oldDurationNanos = this.this$0.getTotalDurationNanos$animation_core_release();
            L56:
                float oldDuration = oldDurationNanos / 1.0E9f;
                if (oldDuration > 0.0f) goto L59;
                oldVelocity = SeekableTransitionState.access$getCompanion$p().getZeroVelocity();
                goto L61
            L59:
                oldVelocity = new AnimationVector1D(1.0f / oldDuration);
                goto L61
            L41:
                r10 = null;
                goto L42
            L38:
                if (Intrinsics.areEqual(newSpec, newAnimation.getAnimationSpec()) == true) goto L68;
            L35:
                newSpec = null;
            L68:
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (SeekableTransitionState.access$runAnimations(this.this$0, this) != r0) goto L71;
                return r0;
            L9:
                $result3 = r18;
                ResultKt.throwOnFailure($result3);
            L24:
                this.label = 3;
                if (SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(this.this$0, this) != r0) goto L29;
                return r0;
            L10:
                $result3 = r18;
                SeekableTransitionState<S> r13 = (SeekableTransitionState) this.L$1;
                Object owner$iv = null;
                Mutex $this$withLock_u24default$iv = (Mutex) this.L$0;
                ResultKt.throwOnFailure($result3);
            L81:
                Object composedTargetState = r13.getComposedTargetState$animation_core_release();     // Catch: Throwable -> L78
                $this$withLock_u24default$iv.unlock(owner$iv);
                if (Intrinsics.areEqual(this.$targetState, composedTargetState) == true) goto L29;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (SeekableTransitionState.access$doOneFrame(this.this$0, this) != r0) goto L24;
                return r0;
            L78:
                th = move-exception;
                $this$withLock_u24default$iv.unlock(owner$iv);
                throw th;
            L11:
                ResultKt.throwOnFailure(r18);
                $result3 = r18;
                S r7 = this.this$0.getTargetState();
                if (Intrinsics.areEqual(this.$targetState, r7) == true) goto L14;
                SeekableTransitionState.access$moveAnimationToInitialState(this.this$0);
                SeekableTransitionState.access$setFraction(this.this$0, 0.0f);
                this.$transition.updateTarget$animation_core_release(this.$targetState);
                this.$transition.setPlayTimeNanos(0);
                this.this$0.setCurrentState$animation_core_release(r7);
                this.this$0.setTargetState$animation_core_release(this.$targetState);
            L14:
                $this$withLock_u24default$iv = this.this$0.getCompositionContinuationMutex$animation_core_release();
                r13 = this.this$0;
                owner$iv = null;
                this.L$0 = $this$withLock_u24default$iv;
                this.L$1 = r13;
                this.label = 1;
                if ($this$withLock_u24default$iv.lock(null, this) != r0) goto L81;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass2(Transition<S> r2, SeekableTransitionState<S> r3, S r4, FiniteAnimationSpec<Float> r5, Continuation<? super AnonymousClass2> r6) {
            this.$transition = r2;
            this.this$0 = r3;
            this.$targetState = r4;
            this.$animationSpec = r5;
            super(1, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r7) {
            return new AnonymousClass2(this.$transition, this.this$0, this.$targetState, this.$animationSpec, r7);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((AnonymousClass2) create(r3)).invokeSuspend(Unit.INSTANCE);
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
        L10:
            this.$transition.onTransitionEnd$animation_core_release();
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, null), this) != r0) goto L10;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$runAnimations$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 1}, l = {353, 356}, m = "runAnimations", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        AnonymousClass1(SeekableTransitionState<S> r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return SeekableTransitionState.access$runAnimations(this.this$0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "S"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", i = {}, l = {488}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ float $fraction;
        final /* synthetic */ S $oldTargetState;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "S", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", i = {}, l = {510}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ float $fraction;
            final /* synthetic */ S $oldTargetState;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Transition.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "S", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", i = {}, l = {506}, m = "invokeSuspend", n = {}, s = {})
            static final class C00011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SeekableTransitionState<S> this$0;

                C00011(SeekableTransitionState<S> r2, Continuation<? super C00011> r3) {
                    this.this$0 = r2;
                    super(2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                    return new C00011(this.this$0, r4);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((C00011) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                    if (SeekableTransitionState.access$runAnimations(this.this$0, this) != r0) goto L11;
                    return r0;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            AnonymousClass1(S r2, S r3, SeekableTransitionState<S> r4, Transition<S> r5, float r6, Continuation<? super AnonymousClass1> r7) {
                this.$targetState = r2;
                this.$oldTargetState = r3;
                this.this$0 = r4;
                this.$transition = r5;
                this.$fraction = r6;
                super(2, r7);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
                AnonymousClass1 r0 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, r9);
                r0.L$0 = r8;
                return r0;
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
            L24:
                SeekableTransitionState.access$seekToFraction(this.this$0);
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
                boolean r1 = Intrinsics.areEqual(this.$targetState, this.$oldTargetState);
                SeekableTransitionState<S> r3 = this.this$0;
                if (r1 == true) goto L10;
                SeekableTransitionState.access$moveAnimationToInitialState(r3);
            L15:
                if (Intrinsics.areEqual(this.$targetState, this.$oldTargetState) == true) goto L17;
                this.$transition.updateTarget$animation_core_release(this.$targetState);
                this.$transition.setPlayTimeNanos(0);
                this.this$0.setTargetState$animation_core_release(this.$targetState);
                this.$transition.resetAnimationFraction$animation_core_release(this.$fraction);
            L17:
                SeekableTransitionState.access$setFraction(this.this$0, this.$fraction);
                if (SeekableTransitionState.access$getInitialValueAnimations$p(this.this$0).isNotEmpty() == false) goto L20;
                BuildersKt.launch$default($this$coroutineScope, null, null, new C00011(this.this$0, null), 3, null);
            L21:
                this.label = 1;
                if (SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(this.this$0, this) != r0) goto L24;
                return r0;
            L20:
                SeekableTransitionState.access$setLastFrameTimeNanos$p(this.this$0, Long.MIN_VALUE);
                goto L21
            L10:
                SeekableTransitionState.access$setCurrentAnimation$p(r3, null);
                if (Intrinsics.areEqual(this.this$0.getCurrentState(), this.$targetState) == false) goto L15;
                return Unit.INSTANCE;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass3(S r2, S r3, SeekableTransitionState<S> r4, Transition<S> r5, float r6, Continuation<? super AnonymousClass3> r7) {
            this.$targetState = r2;
            this.$oldTargetState = r3;
            this.this$0 = r4;
            this.$transition = r5;
            this.$fraction = r6;
            super(1, r7);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r8) {
            return new AnonymousClass3(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, r8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((AnonymousClass3) create(r3)).invokeSuspend(Unit.INSTANCE);
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
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "S"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", i = {}, l = {457}, m = "invokeSuspend", n = {}, s = {})
    static final class C01942 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        C01942(SeekableTransitionState<S> r2, S r3, Transition<S> r4, Continuation<? super C01942> r5) {
            this.this$0 = r2;
            this.$targetState = r3;
            this.$transition = r4;
            super(1, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r5) {
            return new C01942(this.this$0, this.$targetState, this.$transition, r5);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((C01942) create(r3)).invokeSuspend(Unit.INSTANCE);
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
        L23:
            this.$transition.onTransitionEnd$animation_core_release();
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            SeekableTransitionState.access$endAllAnimations(this.this$0);
            SeekableTransitionState.access$setLastFrameTimeNanos$p(this.this$0, Long.MIN_VALUE);
            SeekableTransitionState.access$setFraction(this.this$0, 0.0f);
            S r1 = this.$targetState;
            if (Intrinsics.areEqual(r1, this.this$0.getCurrentState()) == false) goto L11;
            float fraction = -4.0f;
        L14:
            this.$transition.updateTarget$animation_core_release(this.$targetState);
            this.$transition.setPlayTimeNanos(0);
            this.this$0.setTargetState$animation_core_release(this.$targetState);
            SeekableTransitionState.access$setFraction(this.this$0, 0.0f);
            this.this$0.setCurrentState$animation_core_release(this.$targetState);
            this.$transition.resetAnimationFraction$animation_core_release(fraction);
            if (fraction != (-3.0f)) goto L17;
            boolean r2 = true;
        L18:
            if (r2 == false) goto L23;
            this.label = 1;
            if (SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(this.this$0, this) != r0) goto L23;
            return r0;
        L17:
            r2 = false;
            goto L18
        L11:
            if (Intrinsics.areEqual(r1, this.this$0.getTargetState()) == false) goto L13;
            fraction = -5.0f;
            goto L14
        L13:
            fraction = -3.0f;
            goto L14
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 0, 1, 1}, l = {543, 2142}, m = "waitForComposition", n = {"this", "expectedState", "this", "expectedState"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C01951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        C01951(SeekableTransitionState<S> r1, Continuation<? super C01951> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return SeekableTransitionState.access$waitForComposition(this.this$0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 0, 1, 1}, l = {519, 2142}, m = "waitForCompositionAfterTargetStateChange", n = {"this", "expectedState", "this", "expectedState"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C01961 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        C01961(SeekableTransitionState<S> r1, Continuation<? super C01961> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(this.this$0, this);
        }
    }

    public SeekableTransitionState(S r6) {
        super(null);
        this.targetState$delegate = SnapshotStateKt.mutableStateOf$default(r6, null, 2, null);
        this.currentState$delegate = SnapshotStateKt.mutableStateOf$default(r6, null, 2, null);
        this.composedTargetState = r6;
        this.recalculateTotalDurationNanos = new SeekableTransitionState$recalculateTotalDurationNanos$1(this);
        this.fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = MutexKt.Mutex$default(false, 1, null);
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList(0, 1, null);
        this.firstFrameLambda = new SeekableTransitionState$firstFrameLambda$1(this);
        this.animateOneFrameLambda = new SeekableTransitionState$animateOneFrameLambda$1(this);
    }

    public static final /* synthetic */ Object access$animateOneFrame(SeekableTransitionState $this, Continuation $completion) {
        return $this.animateOneFrame($completion);
    }

    public static final /* synthetic */ Object access$doOneFrame(SeekableTransitionState $this, Continuation $completion) {
        return $this.doOneFrame($completion);
    }

    public static final /* synthetic */ void access$endAllAnimations(SeekableTransitionState $this) {
        $this.endAllAnimations();
    }

    public static final /* synthetic */ Companion access$getCompanion$p() {
        return Companion;
    }

    public static final /* synthetic */ SeekingAnimationState access$getCurrentAnimation$p(SeekableTransitionState $this) {
        return $this.currentAnimation;
    }

    public static final /* synthetic */ float access$getDurationScale$p(SeekableTransitionState $this) {
        return $this.durationScale;
    }

    public static final /* synthetic */ MutableObjectList access$getInitialValueAnimations$p(SeekableTransitionState $this) {
        return $this.initialValueAnimations;
    }

    public static final /* synthetic */ long access$getLastFrameTimeNanos$p(SeekableTransitionState $this) {
        return $this.lastFrameTimeNanos;
    }

    public static final /* synthetic */ AnimationVector1D access$getTarget1$cp() {
        return Target1;
    }

    public static final /* synthetic */ Transition access$getTransition$p(SeekableTransitionState $this) {
        return $this.transition;
    }

    public static final /* synthetic */ AnimationVector1D access$getZeroVelocity$cp() {
        return ZeroVelocity;
    }

    public static final /* synthetic */ void access$moveAnimationToInitialState(SeekableTransitionState $this) {
        $this.moveAnimationToInitialState();
    }

    public static final /* synthetic */ void access$recalculateAnimationValue(SeekableTransitionState $this, SeekingAnimationState animation, long deltaPlayTimeNanos) {
        $this.recalculateAnimationValue(animation, deltaPlayTimeNanos);
    }

    public static final /* synthetic */ Object access$runAnimations(SeekableTransitionState $this, Continuation $completion) {
        return $this.runAnimations($completion);
    }

    public static final /* synthetic */ void access$seekToFraction(SeekableTransitionState $this) {
        $this.seekToFraction();
    }

    public static final /* synthetic */ void access$setCurrentAnimation$p(SeekableTransitionState $this, SeekingAnimationState r1) {
        $this.currentAnimation = r1;
    }

    public static final /* synthetic */ void access$setFraction(SeekableTransitionState $this, float r1) {
        $this.setFraction(r1);
    }

    public static final /* synthetic */ void access$setLastFrameTimeNanos$p(SeekableTransitionState $this, long r1) {
        $this.lastFrameTimeNanos = r1;
    }

    public static final /* synthetic */ Object access$waitForComposition(SeekableTransitionState $this, Continuation $completion) {
        return $this.waitForComposition($completion);
    }

    public static final /* synthetic */ Object access$waitForCompositionAfterTargetStateChange(SeekableTransitionState $this, Continuation $completion) {
        return $this.waitForCompositionAfterTargetStateChange($completion);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core_release(S r4) {
        MutableState $this$setValue$iv = this.targetState$delegate;
        $this$setValue$iv.setValue(r4);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(S r4) {
        MutableState $this$setValue$iv = this.currentState$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final S getComposedTargetState$animation_core_release() {
        return this.composedTargetState;
    }

    public final void setComposedTargetState$animation_core_release(S r1) {
        this.composedTargetState = r1;
    }

    public final long getTotalDurationNanos$animation_core_release() {
        return this.totalDurationNanos;
    }

    public final void setTotalDurationNanos$animation_core_release(long r1) {
        this.totalDurationNanos = r1;
    }

    private final void setFraction(float r4) {
        MutableFloatState $this$setValue$iv = this.fraction$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getFraction() {
        FloatState $this$getValue$iv = this.fraction$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final CancellableContinuation<S> getCompositionContinuation$animation_core_release() {
        return this.compositionContinuation;
    }

    public final void setCompositionContinuation$animation_core_release(CancellableContinuation<? super S> r1) {
        this.compositionContinuation = r1;
    }

    public final Mutex getCompositionContinuationMutex$animation_core_release() {
        return this.compositionContinuationMutex;
    }

    private final void endAllAnimations() {
        Transition<S> r0 = this.transition;
        if (r0 == null) goto L5;
        r0.clearInitialAnimations$animation_core_release();
    L5:
        this.initialValueAnimations.clear();
        SeekingAnimationState current = this.currentAnimation;
        if (current == null) goto L9;
        this.currentAnimation = null;
        setFraction(1.0f);
        seekToFraction();
        return;
    }

    private final Object runAnimations(Continuation<? super Unit> r11) {
        if ((r11 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        SeekableTransitionState r3 = (SeekableTransitionState) r0.L$0;
        ResultKt.throwOnFailure($result);
    L34:
        if (r3.initialValueAnimations.isNotEmpty() == false) goto L36;
    L40:
        r0.L$0 = r3;
        r0.label = 2;
        if (r3.animateOneFrame(r0) != r2) goto L34;
        return r2;
    L36:
        if (r3.currentAnimation != null) goto L40;
        r3.lastFrameTimeNanos = Long.MIN_VALUE;
        return Unit.INSTANCE;
    L13:
        r3 = (SeekableTransitionState) r0.L$0;
        ResultKt.throwOnFailure($result);
        goto L34
    L14:
        ResultKt.throwOnFailure($result);
        r3 = this;
        if (r3.initialValueAnimations.isEmpty() == false) goto L21;
        if (r3.currentAnimation != null) goto L21;
        return Unit.INSTANCE;
    L21:
        if (SuspendAnimationKt.getDurationScale(r0.getContext()) != 0.0f) goto L23;
        boolean r6 = true;
    L24:
        if (r6 == false) goto L28;
        r3.endAllAnimations();
        r3.lastFrameTimeNanos = Long.MIN_VALUE;
        return Unit.INSTANCE;
    L28:
        if (r3.lastFrameTimeNanos != Long.MIN_VALUE) goto L34;
        Function1<Long, Unit> r7 = r3.firstFrameLambda;
        r0.L$0 = r3;
        r0.label = 1;
        if (MonotonicFrameClockKt.withFrameNanos(r7, r0) != r2) goto L34;
        return r2;
    L23:
        r6 = false;
        goto L24
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r11);
        goto L8
    }

    private final Object doOneFrame(Continuation<? super Unit> r5) {
        if (this.lastFrameTimeNanos != Long.MIN_VALUE) goto L9;
        Object r0 = MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        return r0;
    L8:
        return Unit.INSTANCE;
    L9:
        Object r1 = animateOneFrame(r5);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        return r1;
    L13:
        return Unit.INSTANCE;
    }

    private final Object animateOneFrame(Continuation<? super Unit> r4) {
        float durationScale = SuspendAnimationKt.getDurationScale(r4.getContext());
        if (durationScale > 0.0f) goto L6;
        endAllAnimations();
        return Unit.INSTANCE;
    L6:
        this.durationScale = durationScale;
        Object r1 = MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, r4);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r1;
    L10:
        return Unit.INSTANCE;
    }

    private final void recalculateAnimationValue(SeekingAnimationState animation, long deltaPlayTimeNanos) {
        long playTimeNanos = animation.getProgressNanos() + deltaPlayTimeNanos;
        animation.setProgressNanos(playTimeNanos);
        long durationNanos = animation.getAnimationSpecDuration();
        if (playTimeNanos < durationNanos) goto L5;
        animation.setValue(1.0f);
        return;
    L5:
        VectorizedAnimationSpec<AnimationVector1D> r2 = animation.getAnimationSpec();
        if (r2 == null) goto L11;
        AnimationVector1D r5 = animation.getStart();
        AnimationVector1D r6 = Target1;
        AnimationVector1D r7 = animation.getInitialVelocity();
        if (r7 != null) goto L10;
        r7 = ZeroVelocity;
    L10:
        animation.setValue(RangesKt.coerceIn(((AnimationVector1D) r2.getValueFromNanos(playTimeNanos, r5, r6, r7)).get$animation_core_release(0), 0.0f, 1.0f));
        return;
    L11:
        float start$iv = animation.getStart().get$animation_core_release(0);
        float fraction$iv = playTimeNanos / durationNanos;
        animation.setValue(((1.0f - fraction$iv) * start$iv) + (1.0f * fraction$iv));
    }

    public final Object snapTo(S r9, Continuation<? super Unit> r10) {
        Transition<S> r0 = this.transition;
        if (r0 != null) goto L7;
        return Unit.INSTANCE;
    L7:
        if (Intrinsics.areEqual(getCurrentState(), r9) == true) goto L9;
    L12:
        Object r11 = MutatorMutex.mutate$default(this.mutatorMutex, null, new C01942(this, r9, r0, null), r10, 1, null);
        if (r11 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L16;
        return r11;
    L16:
        return Unit.INSTANCE;
    L9:
        if (Intrinsics.areEqual(getTargetState(), r9) == false) goto L12;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(SeekableTransitionState r0, float r1, Object r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = r0.getTargetState();
    L6:
        return r0.seekTo(r1, r2, r3);
    }

    public final Object seekTo(float fraction, S r14, Continuation<? super Unit> r15) {
        boolean value$iv = false;
        if (0.0f > fraction) goto L8;
        if (fraction > 1.0f) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L10;
        PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + fraction);
    L10:
        Transition<S> r0 = this.transition;
        if (r0 == null) goto L13;
        Object oldTargetState = getTargetState();
        Object r16 = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass3(r14, oldTargetState, this, r0, fraction, null), r15, 1, null);
        if (r16 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L18;
        return r16;
    L18:
        return Unit.INSTANCE;
    L13:
        return Unit.INSTANCE;
    }

    private final Object waitForCompositionAfterTargetStateChange(Continuation<? super Unit> r18) {
        if ((r18 instanceof C01961) == false) goto L7;
        C01961 r1 = (C01961) r18;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Object expectedState = r1.L$1;
        SeekableTransitionState<S> r6 = (SeekableTransitionState) r1.L$0;
        ResultKt.throwOnFailure($result);
        SeekableTransitionState<S> r8 = r6;
        Object state = $result;
    L28:
        if (Intrinsics.areEqual(state, expectedState) == true) goto L30;
        r8.lastFrameTimeNanos = Long.MIN_VALUE;
        throw new CancellationException("snapTo() was canceled because state was changed to " + state + " instead of " + expectedState);
    L30:
        return Unit.INSTANCE;
    L13:
        expectedState = r1.L$1;
        r8 = (SeekableTransitionState) r1.L$0;
        ResultKt.throwOnFailure($result);
    L19:
        if (Intrinsics.areEqual(expectedState, r8.composedTargetState) == false) goto L21;
        Mutex.DefaultImpls.unlock$default(r8.compositionContinuationMutex, null, 1, null);
        goto L30
    L21:
        r1.L$0 = r8;
        r1.L$1 = expectedState;
        r1.label = 2;
        Continuation uCont$iv = r1;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl continuation = cancellable$iv;
        r8.setCompositionContinuation$animation_core_release(continuation);
        Mutex.DefaultImpls.unlock$default(r8.getCompositionContinuationMutex$animation_core_release(), null, 1, null);
        state = cancellable$iv.getResult();
        if (state != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L24;
        DebugProbesKt.probeCoroutineSuspended(r1);
    L24:
        if (state != r4) goto L28;
        return r4;
    L14:
        ResultKt.throwOnFailure($result);
        Object expectedState2 = getTargetState();
        Mutex r9 = this.compositionContinuationMutex;
        r1.L$0 = this;
        r1.L$1 = expectedState2;
        r1.label = 1;
        if (Mutex.DefaultImpls.lock$default(r9, null, r1, 1, null) != r4) goto L17;
        return r4;
    L17:
        r8 = this;
        expectedState = expectedState2;
        goto L19
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C01961(this, r18);
        goto L8
    }

    private final Object waitForComposition(Continuation<? super Unit> r18) {
        if ((r18 instanceof C01951) == false) goto L7;
        C01951 r1 = (C01951) r18;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Object expectedState = r1.L$1;
        SeekableTransitionState<S> r6 = (SeekableTransitionState) r1.L$0;
        ResultKt.throwOnFailure($result);
        SeekableTransitionState<S> r8 = r6;
        Object state = $result;
    L25:
        if (Intrinsics.areEqual(state, expectedState) == true) goto L27;
        r8.lastFrameTimeNanos = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
    L27:
        return Unit.INSTANCE;
    L13:
        expectedState = r1.L$1;
        r8 = (SeekableTransitionState) r1.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        r1.L$0 = r8;
        r1.L$1 = expectedState;
        r1.label = 2;
        Continuation uCont$iv = r1;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl continuation = cancellable$iv;
        r8.setCompositionContinuation$animation_core_release(continuation);
        Mutex.DefaultImpls.unlock$default(r8.getCompositionContinuationMutex$animation_core_release(), null, 1, null);
        state = cancellable$iv.getResult();
        if (state != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L21;
        DebugProbesKt.probeCoroutineSuspended(r1);
    L21:
        if (state != r4) goto L25;
        return r4;
    L14:
        ResultKt.throwOnFailure($result);
        Object expectedState2 = getTargetState();
        Mutex r9 = this.compositionContinuationMutex;
        r1.L$0 = this;
        r1.L$1 = expectedState2;
        r1.label = 1;
        if (Mutex.DefaultImpls.lock$default(r9, null, r1, 1, null) != r4) goto L17;
        return r4;
    L17:
        r8 = this;
        expectedState = expectedState2;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C01951(this, r18);
        goto L8
    }

    private final void moveAnimationToInitialState() {
        Transition<S> r0 = this.transition;
        if (r0 != null) goto L5;
        return;
    L5:
        SeekingAnimationState it = this.currentAnimation;
        if (it == null) goto L8;
    L20:
        if (it == null) goto L22;
        it.setDurationNanos(this.totalDurationNanos);
        this.initialValueAnimations.add(it);
        r0.setInitialAnimations$animation_core_release(it);
    L22:
        this.currentAnimation = null;
        return;
    L8:
        if (this.totalDurationNanos > 0) goto L10;
    L18:
        it = null;
        goto L20
    L10:
        if (getFraction() != 1.0f) goto L12;
        boolean r1 = true;
    L13:
        if (r1 == true) goto L18;
        if (Intrinsics.areEqual(getCurrentState(), getTargetState()) == true) goto L18;
        it = new SeekingAnimationState();
        it.setValue(getFraction());
        long totalDurationNanos = this.totalDurationNanos;
        it.setDurationNanos(totalDurationNanos);
        it.setAnimationSpecDuration(MathKt.roundToLong(totalDurationNanos * (1.0d - ((double) getFraction()))));
        it.getStart().set$animation_core_release(0, getFraction());
        goto L20
    L12:
        r1 = false;
        goto L13
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SeekableTransitionState r0, Object r1, FiniteAnimationSpec r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.getTargetState();
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = null;
    L9:
        return r0.animateTo(r1, r2, r3);
    }

    public final Object animateTo(S r10, FiniteAnimationSpec<Float> r11, Continuation<? super Unit> r12) {
        Transition<S> r0 = this.transition;
        if (r0 == null) goto L5;
        Object r13 = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(r0, this, r10, r11, null), r12, 1, null);
        if (r13 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r13;
    L10:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(Transition<S> r6) {
        if (this.transition != null) goto L5;
    L8:
        boolean value$iv = true;
    L10:
        if (value$iv == true) goto L12;
        PreconditionsKt.throwIllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + r6);
    L12:
        this.transition = r6;
        return;
    L5:
        if (Intrinsics.areEqual(r6, this.transition) == true) goto L8;
        value$iv = false;
        goto L10
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
        this.transition = null;
        TransitionKt.getSeekableStateObserver().clear(this);
    }

    public final void observeTotalDuration$animation_core_release() {
        TransitionKt.getSeekableStateObserver().observeReads(this, TransitionKt.access$getSeekableTransitionStateTotalDurationChanged$p(), this.recalculateTotalDurationNanos);
    }

    public final void onTotalDurationChanged$animation_core_release() {
        long previousTotalDurationNanos = this.totalDurationNanos;
        observeTotalDuration$animation_core_release();
        if (previousTotalDurationNanos == this.totalDurationNanos) goto L16;
        SeekingAnimationState animation = this.currentAnimation;
        if (animation == null) goto L13;
        if (animation.getProgressNanos() <= this.totalDurationNanos) goto L9;
        endAllAnimations();
        return;
    L9:
        animation.setDurationNanos(this.totalDurationNanos);
        if (animation.getAnimationSpec() != null) goto L18;
        animation.setAnimationSpecDuration(MathKt.roundToLong((1.0d - ((double) animation.getStart().get$animation_core_release(0))) * this.totalDurationNanos));
        return;
    L18:
        return;
    L13:
        if (this.totalDurationNanos == 0) goto L20;
        seekToFraction();
        return;
    L20:
        return;
    }

    private final void seekToFraction() {
        Transition<S> r0 = this.transition;
        if (r0 != null) goto L5;
        return;
    L5:
        long playTimeNanos = MathKt.roundToLong(((double) getFraction()) * r0.getTotalDurationNanos());
        r0.seekAnimations$animation_core_release(playTimeNanos);
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        ZeroVelocity = new AnimationVector1D(0.0f);
        Target1 = new AnimationVector1D(1.0f);
    }
}
