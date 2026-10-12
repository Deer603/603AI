package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ%\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J-\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ-\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J-\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/VectorizedRepeatableSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "iterations", "", "animation", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "(ILandroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "(ILandroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "durationNanos", "", "getDurationNanos$animation_core_release", "()J", "initialOffsetNanos", "getDurationNanos", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "repetitionPlayTimeNanos", "repetitionStartVelocity", "start", "startVelocity", "end", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 0;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final int iterations;
    private final RepeatMode repeatMode;

    static {
        $stable = 8;
    }

    public /* synthetic */ VectorizedRepeatableSpec(int r1, VectorizedDurationBasedAnimationSpec r2, RepeatMode r3, long r4, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4);
    }

    private VectorizedRepeatableSpec(int iterations, VectorizedDurationBasedAnimationSpec<V> r6, RepeatMode repeatMode, long initialStartOffset) {
        this.iterations = iterations;
        this.animation = r6;
        this.repeatMode = repeatMode;
        if (this.iterations < 1) goto L7;
        this.durationNanos = ((long) (this.animation.getDelayMillis() + this.animation.getDurationMillis())) * AnimationKt.MillisToNanos;
        this.initialOffsetNanos = AnimationKt.MillisToNanos * initialStartOffset;
        return;
    L7:
        throw new IllegalArgumentException("Iterations count can't be less than 1");
    }

    public /* synthetic */ VectorizedRepeatableSpec(int r8, VectorizedDurationBasedAnimationSpec r9, RepeatMode r10, long r11, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 4) == 0) goto L5;
        RepeatMode r3 = RepeatMode.Restart;
    L7:
        if ((r13 & 8) == 0) goto L9;
        long r4 = StartOffset.m167constructorimpl$default(0, 0, 2, null);
    L10:
        this(r8, r9, r3, r4, null);
        return;
    L9:
        r4 = r11;
        goto L10
    L5:
        r3 = r10;
        goto L7
    }

    public /* synthetic */ VectorizedRepeatableSpec(int r1, VectorizedDurationBasedAnimationSpec r2, RepeatMode r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = RepeatMode.Restart;
    L5:
        this(r1, r2, r3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ VectorizedRepeatableSpec(int iterations, VectorizedDurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        this(iterations, animation, repeatMode, StartOffset.m167constructorimpl$default(0, 0, 2, null), null);
    }

    public final long getDurationNanos$animation_core_release() {
        return this.durationNanos;
    }

    private final long repetitionPlayTimeNanos(long playTimeNanos) {
        if ((this.initialOffsetNanos + playTimeNanos) > 0) goto L5;
        return 0;
    L5:
        long postOffsetPlayTimeNanos = this.initialOffsetNanos + playTimeNanos;
        long repeatsCount = Math.min(postOffsetPlayTimeNanos / this.durationNanos, ((long) this.iterations) - 1);
        if (this.repeatMode == RepeatMode.Restart) goto L12;
        if ((repeatsCount % 2) == 0) goto L12;
        return ((1 + repeatsCount) * this.durationNanos) - postOffsetPlayTimeNanos;
    L12:
        return postOffsetPlayTimeNanos - (this.durationNanos * repeatsCount);
    }

    private final V repetitionStartVelocity(long r11, V r13, V r14, V r15) {
        if ((this.initialOffsetNanos + r11) <= this.durationNanos) goto L6;
        return (V) getVelocityFromNanos(this.durationNanos - this.initialOffsetNanos, r13, r14, r15);
    L6:
        return r14;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long playTimeNanos, V r12, V r13, V r14) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(playTimeNanos), r12, r13, repetitionStartVelocity(playTimeNanos, r12, r14, r13));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V r12, V r13, V r14) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(playTimeNanos), r12, r13, repetitionStartVelocity(playTimeNanos, r12, r14, r13));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V r5, V r6, V r7) {
        return (((long) this.iterations) * this.durationNanos) - this.initialOffsetNanos;
    }
}
