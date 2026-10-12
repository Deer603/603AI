package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J%\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "delayMillis", "", "getDelayMillis", "()I", "durationMillis", "getDurationMillis", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector> extends VectorizedFiniteAnimationSpec<V> {

    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedDurationBasedAnimationSpec<V> r1, V r2, V r3, V r4) {
            return (V) VectorizedDurationBasedAnimationSpec.access$getEndVelocity$jd(r1, r2, r3, r4);
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(VectorizedDurationBasedAnimationSpec<V> r1) {
            return VectorizedDurationBasedAnimationSpec.access$isInfinite$jd(r1);
        }

        @Deprecated
        public static <V extends AnimationVector> long getDurationNanos(VectorizedDurationBasedAnimationSpec<V> r2, V r3, V r4, V r5) {
            return VectorizedDurationBasedAnimationSpec.access$getDurationNanos$jd(r2, r3, r4, r5);
        }
    }

    int getDelayMillis();

    int getDurationMillis();

    static /* synthetic */ long access$getDurationNanos$jd(VectorizedDurationBasedAnimationSpec $this, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        return super.getDurationNanos(initialValue, targetValue, initialVelocity);
    }

    static /* synthetic */ AnimationVector access$getEndVelocity$jd(VectorizedDurationBasedAnimationSpec $this, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        return super.getEndVelocity(initialValue, targetValue, initialVelocity);
    }

    static /* synthetic */ boolean access$isInfinite$jd(VectorizedDurationBasedAnimationSpec $this) {
        return super.isInfinite();
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default long getDurationNanos(V r5, V r6, V r7) {
        return ((long) (getDelayMillis() + getDurationMillis())) * AnimationKt.MillisToNanos;
    }
}
