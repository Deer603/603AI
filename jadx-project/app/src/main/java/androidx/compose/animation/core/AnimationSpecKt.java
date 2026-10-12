package androidx.compose.animation.core;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a@\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\"\u0004\b\u0000\u0010\u00022\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007\u001a1\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018\"\u0004\b\u0000\u0010\u00022\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018\"\u0004\b\u0000\u0010\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016\u001a4\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001d\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001aH\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001d\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020#\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010$\u001a\u00020\u001fH\u0007\u001a9\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00020&\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010(\u001a\u00020\u001b2\n\b\u0002\u0010)\u001a\u0004\u0018\u0001H\u0002H\u0007¢\u0006\u0002\u0010*\u001a2\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u00020,\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010-\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010.\u001a\u00020/H\u0007\u001a9\u00100\u001a\u0004\u0018\u0001H1\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u00101*\u000202*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H1032\b\u00104\u001a\u0004\u0018\u0001H\u0002H\u0002¢\u0006\u0002\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"delayed", "Landroidx/compose/animation/core/AnimationSpec;", "T", "animationSpec", "startDelayNanos", "", "infiniteRepeatable", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "infiniteRepeatable-9IiC70o", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "keyframes", "Landroidx/compose/animation/core/KeyframesSpec;", "init", "Lkotlin/Function1;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "Lkotlin/ExtensionFunctionType;", "keyframesWithSpline", "Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "periodicBias", "", "repeatable", "Landroidx/compose/animation/core/RepeatableSpec;", "iterations", "", "repeatable-91I0pcU", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/RepeatableSpec;", "snap", "Landroidx/compose/animation/core/SnapSpec;", "delayMillis", "spring", "Landroidx/compose/animation/core/SpringSpec;", "dampingRatio", "stiffness", "visibilityThreshold", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;", "tween", "Landroidx/compose/animation/core/TweenSpec;", "durationMillis", "easing", "Landroidx/compose/animation/core/Easing;", "convert", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/TwoWayConverter;", "data", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimationSpecKt {
    public static final /* synthetic */ AnimationVector access$convert(TwoWayConverter $receiver, Object data) {
        return convert($receiver, data);
    }

    private static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> r1, T r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return r1.getConvertToVector().invoke(r2);
    }

    public static /* synthetic */ TweenSpec tween$default(int r0, int r1, Easing r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r0 = AnimationConstants.DefaultDurationMillis;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r1 = 0;
    L9:
        if ((r3 & 4) == 0) goto L12;
        r2 = EasingKt.getFastOutSlowInEasing();
    L12:
        return tween(r0, r1, r2);
    }

    public static final <T> TweenSpec<T> tween(int durationMillis, int delayMillis, Easing easing) {
        return new TweenSpec(durationMillis, delayMillis, easing);
    }

    public static /* synthetic */ SpringSpec spring$default(float r0, float r1, Object r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r0 = 1.0f;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r1 = 1500.0f;
    L9:
        if ((r3 & 4) == 0) goto L12;
        r2 = null;
    L12:
        return spring(r0, r1, r2);
    }

    public static final <T> SpringSpec<T> spring(float dampingRatio, float stiffness, T r3) {
        return new SpringSpec(dampingRatio, stiffness, r3);
    }

    public static final <T> KeyframesSpec<T> keyframes(Function1<? super KeyframesSpec.KeyframesSpecConfig<T>, Unit> r2) {
        KeyframesSpec.KeyframesSpecConfig r1 = new KeyframesSpec.KeyframesSpecConfig();
        r2.invoke(r1);
        return new KeyframesSpec(r1);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(Function1<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, Unit> r2) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig r1 = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        r2.invoke(r1);
        return new KeyframesWithSplineSpec(r1);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(float periodicBias, Function1<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, Unit> r3) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig r1 = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        r3.invoke(r1);
        return new KeyframesWithSplineSpec(r1, periodicBias);
    }

    /* JADX INFO: renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m137repeatable91I0pcU$default(int r0, DurationBasedAnimationSpec r1, RepeatMode r2, long r3, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r2 = RepeatMode.Restart;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r3 = StartOffset.m167constructorimpl$default(0, 0, 2, null);
    L9:
        return m136repeatable91I0pcU(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m136repeatable91I0pcU(int iterations, DurationBasedAnimationSpec<T> r8, RepeatMode repeatMode, long initialStartOffset) {
        return new RepeatableSpec(iterations, r8, repeatMode, initialStartOffset, null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int r0, DurationBasedAnimationSpec r1, RepeatMode r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = RepeatMode.Restart;
    L6:
        return repeatable(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ RepeatableSpec repeatable(int iterations, DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        return new RepeatableSpec(iterations, animation, repeatMode, StartOffset.m167constructorimpl$default(0, 0, 2, null), null);
    }

    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m135infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec r0, RepeatMode r1, long r2, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r1 = RepeatMode.Restart;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r2 = StartOffset.m167constructorimpl$default(0, 0, 2, null);
    L9:
        return m134infiniteRepeatable9IiC70o(r0, r1, r2);
    }

    /* JADX INFO: renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m134infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> r6, RepeatMode repeatMode, long initialStartOffset) {
        return new InfiniteRepeatableSpec(r6, repeatMode, initialStartOffset, null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec r0, RepeatMode r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = RepeatMode.Restart;
    L6:
        return infiniteRepeatable(r0, r1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        return new InfiniteRepeatableSpec(animation, repeatMode, StartOffset.m167constructorimpl$default(0, 0, 2, null), null);
    }

    public static final <T> SnapSpec<T> snap(int delayMillis) {
        return new SnapSpec(delayMillis);
    }

    public static /* synthetic */ SnapSpec snap$default(int r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = 0;
    L6:
        return snap(r0);
    }

    public static final <T> AnimationSpec<T> delayed(AnimationSpec<T> r1, long startDelayNanos) {
        return new StartDelayAnimationSpec(r1, startDelayNanos);
    }
}
