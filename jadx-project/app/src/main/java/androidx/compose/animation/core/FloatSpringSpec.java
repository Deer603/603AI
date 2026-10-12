package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J(\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J(\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/FloatSpringSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "dampingRatio", "", "stiffness", "visibilityThreshold", "(FFF)V", "getDampingRatio", "()F", "spring", "Landroidx/compose/animation/core/SpringSimulation;", "getStiffness", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "getEndVelocity", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final float dampingRatio;
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    static {
        $stable = 8;
    }

    public FloatSpringSpec() {
        float r1 = 0.0f;
        float r2 = 0.0f;
        float r3 = 0.0f;
        this(r1, r2, r3, 7, null);
    }

    public FloatSpringSpec(float dampingRatio, float stiffness, float visibilityThreshold) {
        this.dampingRatio = dampingRatio;
        this.stiffness = stiffness;
        this.visibilityThreshold = visibilityThreshold;
        SpringSimulation it = new SpringSimulation(1.0f);
        it.setDampingRatio(this.dampingRatio);
        it.setStiffness(this.stiffness);
        this.spring = it;
    }

    public /* synthetic */ FloatSpringSpec(float r1, float r2, float r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 1.0f;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 1500.0f;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = 0.01f;
    L11:
        this(r1, r2, r3);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long playTimeMillis = playTimeNanos / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(targetValue);
        long arg0$iv = this.spring.m163updateValuesIJZedt4$animation_core_release(initialValue, initialVelocity, playTimeMillis);
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long playTimeMillis = playTimeNanos / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(targetValue);
        long arg0$iv = this.spring.m163updateValuesIJZedt4$animation_core_release(initialValue, initialVelocity, playTimeMillis);
        int bits$iv$iv$iv = (int) (4294967295L & arg0$iv);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float initialValue, float targetValue, float initialVelocity) {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
        float r0 = this.spring.getStiffness();
        float r1 = this.spring.getDampingRatio();
        float r2 = (initialValue - targetValue) / this.visibilityThreshold;
        return SpringEstimationKt.estimateAnimationDurationMillis(r0, r1, initialVelocity / this.visibilityThreshold, r2, 1.0f) * AnimationKt.MillisToNanos;
    }
}
