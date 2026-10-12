package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a1\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u0001H\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0010H\u0000\u001a9\u0010\u0013\u001a\u00020\u0010\"\b\b\u0000\u0010\b*\u00020\t*\b\u0012\u0004\u0012\u0002H\b0\u00142\u0006\u0010\u0015\u001a\u0002H\b2\u0006\u0010\u0016\u001a\u0002H\b2\u0006\u0010\u0017\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u0018\u001aA\u0010\u0019\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t*\b\u0012\u0004\u0012\u0002H\b0\u00142\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u0002H\b2\u0006\u0010\u001c\u001a\u0002H\b2\u0006\u0010\u001d\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"EmptyArcSpline", "Landroidx/compose/animation/core/ArcSpline;", "EmptyFloatArray", "", "EmptyIntArray", "", "createSpringAnimations", "Landroidx/compose/animation/core/Animations;", "V", "Landroidx/compose/animation/core/AnimationVector;", "visibilityThreshold", "dampingRatio", "", "stiffness", "(Landroidx/compose/animation/core/AnimationVector;FF)Landroidx/compose/animation/core/Animations;", "clampPlayTime", "", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "playTime", "getDurationMillis", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getValueFromMillis", "playTimeMillis", "start", "end", "startVelocity", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class VectorizedAnimationSpecKt {
    private static final ArcSpline EmptyArcSpline = null;
    private static final float[] EmptyFloatArray = null;
    private static final int[] EmptyIntArray = null;

    public static final /* synthetic */ Animations access$createSpringAnimations(AnimationVector visibilityThreshold, float dampingRatio, float stiffness) {
        return createSpringAnimations(visibilityThreshold, dampingRatio, stiffness);
    }

    public static final /* synthetic */ ArcSpline access$getEmptyArcSpline$p() {
        return EmptyArcSpline;
    }

    public static final /* synthetic */ float[] access$getEmptyFloatArray$p() {
        return EmptyFloatArray;
    }

    public static final /* synthetic */ int[] access$getEmptyIntArray$p() {
        return EmptyIntArray;
    }

    public static final <V extends AnimationVector> long getDurationMillis(VectorizedAnimationSpec<V> r4, V r5, V r6, V r7) {
        return r4.getDurationNanos(r5, r6, r7) / AnimationKt.MillisToNanos;
    }

    public static final <V extends AnimationVector> V getValueFromMillis(VectorizedAnimationSpec<V> r8, long r9, V r11, V r12, V r13) {
        return (V) r8.getValueFromNanos(r9 * AnimationKt.MillisToNanos, r11, r12, r13);
    }

    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> r11, long playTime) {
        long $this$fastCoerceIn$iv = playTime - ((long) r11.getDelayMillis());
        long maximumValue$iv = r11.getDurationMillis();
        long $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv > maximumValue$iv) goto L9;
        return $this$fastCoerceAtLeast$iv$iv;
    L9:
        return maximumValue$iv;
    }

    private static final <V extends AnimationVector> Animations createSpringAnimations(final V r1, final float dampingRatio, final float stiffness) {
        if (r1 == null) goto L5;
        return new AnonymousClass1(r1, dampingRatio, stiffness);
    L5:
        return new AnonymousClass2(dampingRatio, stiffness);
    }

    static {
        EmptyIntArray = new int[0];
        EmptyFloatArray = new float[0];
        EmptyArcSpline = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});
    }
}
