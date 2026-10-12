package androidx.compose.animation.core;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SuspendAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u0096\u0001\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\r\u001a\u0002H\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u0001H\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u0011H\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0086@¢\u0006\u0002\u0010\u0017\u001ap\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0086@¢\u0006\u0002\u0010\u0018\u001a^\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u001a26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0086@¢\u0006\u0002\u0010\u001b\u001as\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0080@¢\u0006\u0002\u0010$\u001am\u0010\u0019\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070%2\b\b\u0002\u0010&\u001a\u00020'2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0086@¢\u0006\u0002\u0010(\u001aw\u0010)\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2\u0006\u0010\r\u001a\u0002H\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00102\b\b\u0002\u0010&\u001a\u00020'2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0086@¢\u0006\u0002\u0010*\u001aW\u0010+\u001a\u0002H,\"\u0004\b\u0000\u0010,\"\u0004\b\u0001\u0010\u0007\"\b\b\u0002\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H,0!H\u0082@¢\u0006\u0002\u0010/\u001a\u0085\u0001\u00100\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"2\u0006\u0010.\u001a\u00020 2\u0006\u00101\u001a\u00020 2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2#\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0002\u001a\u0085\u0001\u00104\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"2\u0006\u0010.\u001a\u00020 2\u0006\u0010\u0000\u001a\u00020\u00012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2#\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0002\u001a<\u00105\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001cH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u00066"}, d2 = {"durationScale", "", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", "animate", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "targetValue", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "value", "velocity", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateDecay", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "animation", "Landroidx/compose/animation/core/Animation;", "startTimeNanos", "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "sequentialAnimation", "", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callWithFrameNanos", "R", "onFrame", "frameTimeNanos", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doAnimationFrame", "playTimeNanos", "anim", "state", "doAnimationFrameWithScale", "updateState", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SuspendAnimationKt {

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$4, reason: invalid class name */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {231, 280}, m = "animate", n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass4<T, V extends AnimationVector> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass4(Continuation<? super AnonymousClass4> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return SuspendAnimationKt.animate(null, null, 0, null, this);
        }
    }

    public static final /* synthetic */ Object access$callWithFrameNanos(Animation $receiver, Function1 onFrame, Continuation $completion) {
        return callWithFrameNanos($receiver, onFrame, $completion);
    }

    public static final /* synthetic */ void access$doAnimationFrameWithScale(AnimationScope $receiver, long frameTimeNanos, float durationScale, Animation anim, AnimationState state, Function1 block) {
        doAnimationFrameWithScale($receiver, frameTimeNanos, durationScale, anim, state, block);
    }

    public static /* synthetic */ Object animate$default(float r1, float r2, float r3, SpringSpec r4, Function2 r5, Continuation r6, int r7, Object r8) {
        if ((r7 & 4) == 0) goto L6;
        r3 = 0.0f;
    L6:
        if ((r7 & 8) == 0) goto L9;
        r4 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    L9:
        return animate(r1, r2, r3, r4, r5, r6);
    }

    public static final Object animate(float initialValue, float targetValue, float initialVelocity, AnimationSpec<Float> r11, Function2<? super Float, ? super Float, Unit> r12, Continuation<? super Unit> r13) {
        Object r14 = animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Boxing.boxFloat(initialValue), Boxing.boxFloat(targetValue), Boxing.boxFloat(initialVelocity), r11, r12, r13);
        if (r14 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r14;
    L6:
        return Unit.INSTANCE;
    }

    public static final Object animateDecay(float initialValue, float initialVelocity, FloatDecayAnimationSpec animationSpec, final Function2<? super Float, ? super Float, Unit> r22, Continuation<? super Unit> r23) {
        DecayAnimation<Float, AnimationVector1D> r10 = AnimationKt.DecayAnimation(animationSpec, initialValue, initialVelocity);
        Object r0 = animate$default(AnimationStateKt.AnimationState$default(initialValue, initialVelocity, 0, 0, false, 28, null), r10, 0, new AnonymousClass2(r22), r23, 2, null);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter r1, Object r2, Object r3, Object r4, SpringSpec r5, Function2 r6, Continuation r7, int r8, Object r9) {
        if ((r8 & 8) == 0) goto L6;
        r4 = null;
    L6:
        if ((r8 & 16) == 0) goto L9;
        r5 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    L9:
        return animate(r1, r2, r3, r4, r5, r6, r7);
    }

    public static final <T, V extends AnimationVector> Object animate(final TwoWayConverter<T, V> r14, T r15, T r16, T r17, AnimationSpec<T> r18, final Function2<? super T, ? super T, Unit> r19, Continuation<? super Unit> r20) {
        if (r17 == null) goto L7;
        V r2 = r14.getConvertToVector().invoke(r17);
        if (r2 == null) goto L7;
        AnimationVector initialVelocityVector = r2;
    L8:
        AnimationVector initialVelocityVector2 = initialVelocityVector;
        TargetBasedAnimation anim = new TargetBasedAnimation(r18, r14, r15, r16, initialVelocityVector2);
        Object r1 = animate$default(new AnimationState(r14, r15, initialVelocityVector2, 0, 0, false, 56, null), anim, 0, new AnonymousClass3(r19, r14), r20, 2, null);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L12;
        return r1;
    L12:
        return Unit.INSTANCE;
    L7:
        initialVelocityVector = AnimationVectorsKt.newInstance(r14.getConvertToVector().invoke(r15));
        goto L8
    }

    public static /* synthetic */ Object animateTo$default(AnimationState r6, Object r7, AnimationSpec r8, boolean r9, Function1 r10, Continuation r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        AnimationSpec r2 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    L7:
        if ((r12 & 4) == 0) goto L9;
        boolean r3 = false;
    L11:
        if ((r12 & 8) == 0) goto L13;
        Function1 r4 = C01982.INSTANCE;
    L15:
        return animateTo(r6, r7, r2, r3, r4, r11);
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

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> r7, T r8, AnimationSpec<T> r9, boolean sequentialAnimation, Function1<? super AnimationScope<T, V>, Unit> r11, Continuation<? super Unit> r12) {
        T r3 = r7.getValue();
        TargetBasedAnimation anim = new TargetBasedAnimation(r9, r7.getTypeConverter(), r3, r8, r7.getVelocityVector());
        TargetBasedAnimation r2 = anim;
        if (sequentialAnimation == false) goto L5;
        long r4 = r7.getLastFrameTimeNanos();
    L6:
        Object r5 = animate(r7, r2, r4, r11, r12);
        if (r5 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r5;
    L10:
        return Unit.INSTANCE;
    L5:
        r4 = Long.MIN_VALUE;
        goto L6
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState r0, DecayAnimationSpec r1, boolean r2, C01974 r3, Continuation r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = C01974.INSTANCE;
    L9:
        return animateDecay(r0, r1, r2, r3, r4);
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> r10, DecayAnimationSpec<T> r11, boolean sequentialAnimation, Function1<? super AnimationScope<T, V>, Unit> r13, Continuation<? super Unit> r14) {
        T r0 = r10.getValue();
        AnimationVector r1 = r10.getVelocityVector();
        DecayAnimation anim = new DecayAnimation(r11, r10.getTypeConverter(), r0, r1);
        DecayAnimation r5 = anim;
        if (sequentialAnimation == false) goto L5;
        long r2 = r10.getLastFrameTimeNanos();
    L6:
        Object r12 = animate(r10, r5, r2, r13, r14);
        if (r12 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r12;
    L10:
        return Unit.INSTANCE;
    L5:
        r2 = Long.MIN_VALUE;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [T, androidx.compose.animation.core.AnimationScope] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final <T, V extends AnimationVector> Object animate(AnimationState<T, V> r26, final Animation<T, V> r27, long r28, final Function1<? super AnimationScope<T, V>, Unit> r30, Continuation<? super Unit> r31) {
        if ((r31 instanceof AnonymousClass4) == false) goto L7;
        AnonymousClass4 r0 = (AnonymousClass4) r31;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass4 r2 = r0;
        Object r3 = r2.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        final Ref.ObjectRef r4 = r2.label;
        boolean r5 = true;
        switch(r4) {
            case 0: goto L20;
            case 1: goto L15;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Ref.ObjectRef r6 = (Ref.ObjectRef) r2.L$3;
        Function1<? super AnimationScope<T, V>, Unit> r7 = (Function1) r2.L$2;
        Animation<T, V> r8 = (Animation) r2.L$1;
        AnimationState<T, V> r9 = (AnimationState) r2.L$0;
        ResultKt.throwOnFailure(r3);     // Catch: CancellationException -> L18
        Function1<? super AnimationScope<T, V>, Unit> r15 = r7;
        Animation<T, V> r12 = r8;
        final AnimationState<T, V> r14 = r9;
        r4 = r6;
    L76:
        T r10 = r4.element;     // Catch: CancellationException -> L51
        Intrinsics.checkNotNull(r10);     // Catch: CancellationException -> L51
        if (((AnimationScope) r10).isRunning() == false) goto L50;
        final float r11 = getDurationScale(r2.getContext());     // Catch: CancellationException -> L51
        final Ref.ObjectRef r29 = r4;
        final Animation<T, V> r210 = r12;
        final AnimationState<T, V> r32 = r14;
        final Function1<? super AnimationScope<T, V>, Unit> r33 = r15;
        AnimationState<T, V> r13 = r32;
        Function1<Long, Unit> r16 = new AnonymousClass9(r29, r11, r210, r32, r33);     // Catch: CancellationException -> L47
        r2.L$0 = r13;     // Catch: CancellationException -> L45
        r2.L$1 = r210;     // Catch: CancellationException -> L45
        r2.L$2 = r33;     // Catch: CancellationException -> L45
        r2.L$3 = r4;     // Catch: CancellationException -> L45
        r2.label = 2;     // Catch: CancellationException -> L45
        if (callWithFrameNanos(r210, r16, r2) == r1) goto L42;
        r15 = r33;
        r12 = r210;
        r14 = r13;
        goto L76
    L42:
        return r1;
    L45:
        e = e;
    L55:
        AnimationScope r17 = (AnimationScope) r4.element;
        if (r17 == null) goto L59;
        r17.setRunning$animation_core_release(false);
    L59:
        AnimationScope r18 = (AnimationScope) r4.element;
        if (r18 != null) goto L62;
    L64:
        r5 = false;
    L65:
        if (r5 == false) goto L67;
        r13.setRunning$animation_core_release(false);
    L67:
        throw e;
    L62:
        if (r18.getLastFrameTimeNanos() != r13.getLastFrameTimeNanos()) goto L64;
    L47:
        e = e;
        r4 = r29;
        r13 = r32;
        goto L55
    L50:
        return Unit.INSTANCE;
    L51:
        e = e;
        r13 = r14;
        goto L55
    L15:
        Ref.ObjectRef r19 = (Ref.ObjectRef) r2.L$3;
        Function1<? super AnimationScope<T, V>, Unit> r20 = (Function1) r2.L$2;
        Animation<T, V> r21 = (Animation) r2.L$1;
        AnimationState<T, V> r22 = (AnimationState) r2.L$0;
        ResultKt.throwOnFailure(r3);     // Catch: CancellationException -> L18
        ?? r23 = r19;
    L30:
        r15 = r20;
        r12 = r21;
        r14 = r22;
        r4 = r23;
        goto L76
    L20:
        ResultKt.throwOnFailure(r3);
        r14 = r26;
        final T r110 = r27.getValueFromNanos(0);
        final AnimationVector r111 = r27.getVelocityVectorFromNanos(0);
        r4 = new Ref.ObjectRef();
        if (r28 != Long.MIN_VALUE) goto L33;
        final float r24 = getDurationScale(r2.getContext());     // Catch: CancellationException -> L53
        Function1<Long, Unit> r25 = new AnonymousClass6(r4, r110, r27, r111, r14, r24, r30);     // Catch: CancellationException -> L31
        r20 = r30;
        r2.L$0 = r14;     // Catch: CancellationException -> L53
        r2.L$1 = r27;     // Catch: CancellationException -> L53
        r2.L$2 = r20;     // Catch: CancellationException -> L53
        r2.L$3 = r4;     // Catch: CancellationException -> L53
        r2.label = 1;     // Catch: CancellationException -> L53
        if (callWithFrameNanos(r27, r25, r2) != r1) goto L29;
        return r1;
    L29:
        r21 = r27;
        r22 = r14;
        r23 = r4;
    L31:
        e = e;
        r4 = r4;
        r13 = r14;
        goto L55
    L33:
        ?? r112 = (T) new AnimationScope(r110, r27.getTypeConverter(), r111, r28, r27.getTargetValue(), r28, true, new AnonymousClass7(r14));
        r15 = r30;
        doAnimationFrameWithScale(r112, r28, getDurationScale(r2.getContext()), r27, r14, r15);     // Catch: CancellationException -> L53
        r12 = r27;
        r4.element = r112;     // Catch: CancellationException -> L53
        r4 = r4;
    L53:
        e = e;
        r13 = r14;
        goto L55
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        e = e;
    L7:
        r0 = new AnonymousClass4(r31);
        goto L8
    }

    public static /* synthetic */ Object animate$default(AnimationState r6, Animation r7, long r8, Function1 r10, Continuation r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        long r2 = Long.MIN_VALUE;
    L7:
        if ((r12 & 4) == 0) goto L9;
        Function1 r4 = AnonymousClass5.INSTANCE;
    L11:
        return animate(r6, r7, r2, r4, r11);
    L9:
        r4 = r10;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    private static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> r1, final Function1<? super Long, ? extends R> r2, Continuation<? super R> r3) {
        if (r1.isInfinite() == false) goto L7;
        return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r2, r3);
    L7:
        return MonotonicFrameClockKt.withFrameNanos(new C01992(r2), r3);
    }

    public static final float getDurationScale(CoroutineContext $this$durationScale) {
        MotionDurationScale r0 = (MotionDurationScale) $this$durationScale.get(MotionDurationScale.Key);
        if (r0 == null) goto L5;
        float scale = r0.getScaleFactor();
    L7:
        if (scale < 0.0f) goto L9;
        boolean value$iv = true;
    L11:
        if (value$iv == true) goto L14;
        PreconditionsKt.throwIllegalStateException("negative scale factor");
    L14:
        return scale;
    L9:
        value$iv = false;
        goto L11
    L5:
        scale = 1.0f;
        goto L7
    }

    public static final <T, V extends AnimationVector> void updateState(AnimationScope<T, V> r2, AnimationState<T, V> r3) {
        r3.setValue$animation_core_release(r2.getValue());
        AnimationVectorsKt.copyFrom(r3.getVelocityVector(), r2.getVelocityVector());
        r3.setFinishedTimeNanos$animation_core_release(r2.getFinishedTimeNanos());
        r3.setLastFrameTimeNanos$animation_core_release(r2.getLastFrameTimeNanos());
        r3.setRunning$animation_core_release(r2.isRunning());
    }

    private static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> r10, long frameTimeNanos, float durationScale, Animation<T, V> r14, AnimationState<T, V> r15, Function1<? super AnimationScope<T, V>, Unit> r16) {
        if (durationScale != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        long r1 = r14.getDurationNanos();
    L9:
        long playTimeNanos = r1;
        doAnimationFrame(r10, frameTimeNanos, playTimeNanos, r14, r15, r16);
        return;
    L8:
        r1 = (long) ((frameTimeNanos - r10.getStartTimeNanos()) / durationScale);
        goto L9
    L5:
        r0 = false;
        goto L6
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> r3, long frameTimeNanos, long playTimeNanos, Animation<T, V> r8, AnimationState<T, V> r9, Function1<? super AnimationScope<T, V>, Unit> r10) {
        r3.setLastFrameTimeNanos$animation_core_release(frameTimeNanos);
        r3.setValue$animation_core_release(r8.getValueFromNanos(playTimeNanos));
        r3.setVelocityVector$animation_core_release(r8.getVelocityVectorFromNanos(playTimeNanos));
        boolean isLastFrame = r8.isFinishedFromNanos(playTimeNanos);
        if (isLastFrame == false) goto L5;
        r3.setFinishedTimeNanos$animation_core_release(r3.getLastFrameTimeNanos());
        r3.setRunning$animation_core_release(false);
    L5:
        updateState(r3, r9);
        r10.invoke(r3);
    }
}
