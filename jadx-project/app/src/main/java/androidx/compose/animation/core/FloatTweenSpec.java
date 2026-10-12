package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0082\bJ \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "duration", "", "delay", "easing", "Landroidx/compose/animation/core/Easing;", "(IILandroidx/compose/animation/core/Easing;)V", "getDelay", "()I", "delayNanos", "", "getDuration", "durationNanos", "clampPlayTimeNanos", "playTimeNanos", "getDurationNanos", "initialValue", "", "targetValue", "initialVelocity", "getValueFromNanos", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final long delayNanos;
    private final int duration;
    private final long durationNanos;
    private final Easing easing;

    static {
    }

    public FloatTweenSpec() {
        int r1 = 0;
        int r2 = 0;
        Easing r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public FloatTweenSpec(int duration, int delay, Easing easing) {
        this.duration = duration;
        this.delay = delay;
        this.easing = easing;
        this.durationNanos = ((long) this.duration) * AnimationKt.MillisToNanos;
        this.delayNanos = ((long) this.delay) * AnimationKt.MillisToNanos;
    }

    public /* synthetic */ FloatTweenSpec(int r1, int r2, Easing r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = AnimationConstants.DefaultDurationMillis;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = EasingKt.getFastOutSlowInEasing();
    L11:
        this(r1, r2, r3);
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getDelay() {
        return this.delay;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long $this$fastCoerceIn$iv$iv = playTimeNanos - this.delayNanos;
        long maximumValue$iv$iv = this.durationNanos;
        long $this$fastCoerceAtLeast$iv$iv$iv = $this$fastCoerceIn$iv$iv;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= 0) goto L6;
        $this$fastCoerceAtLeast$iv$iv$iv = 0;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv$iv <= maximumValue$iv$iv) goto L9;
        $this$fastCoerceAtLeast$iv$iv$iv = maximumValue$iv$iv;
    L9:
        if (this.duration != 0) goto L11;
        float rawFraction = 1.0f;
    L12:
        float fraction = this.easing.transform(rawFraction);
        return ((1.0f - fraction) * initialValue) + (targetValue * fraction);
    L11:
        rawFraction = $this$fastCoerceAtLeast$iv$iv$iv / this.durationNanos;
        goto L12
    }

    private final long clampPlayTimeNanos(long playTimeNanos) {
        long $this$fastCoerceIn$iv = playTimeNanos - this.delayNanos;
        long maximumValue$iv = this.durationNanos;
        long $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv > maximumValue$iv) goto L9;
        return $this$fastCoerceAtLeast$iv$iv;
    L9:
        return maximumValue$iv;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
        return this.delayNanos + this.durationNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long $this$fastCoerceIn$iv$iv = playTimeNanos - this.delayNanos;
        long maximumValue$iv$iv = this.durationNanos;
        long $this$fastCoerceAtLeast$iv$iv$iv = $this$fastCoerceIn$iv$iv;
        if ($this$fastCoerceAtLeast$iv$iv$iv >= 0) goto L6;
        $this$fastCoerceAtLeast$iv$iv$iv = 0;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv$iv <= maximumValue$iv$iv) goto L8;
        $this$fastCoerceAtLeast$iv$iv$iv = maximumValue$iv$iv;
    L8:
        long clampedPlayTimeNanos = $this$fastCoerceAtLeast$iv$iv$iv;
        if (clampedPlayTimeNanos != 0) goto L11;
        return initialVelocity;
    L11:
        float startNum = getValueFromNanos(clampedPlayTimeNanos - AnimationKt.MillisToNanos, initialValue, targetValue, initialVelocity);
        float endNum = getValueFromNanos(clampedPlayTimeNanos, initialValue, targetValue, initialVelocity);
        return (endNum - startNum) * 1000.0f;
    }
}
