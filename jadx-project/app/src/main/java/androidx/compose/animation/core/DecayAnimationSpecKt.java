package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: DecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u001aI\u0010\u0006\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u0002H\u00022\u0006\u0010\f\u001a\u0002H\u0002¢\u0006\u0002\u0010\r\u001a \u0010\u0006\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000f¨\u0006\u0010"}, d2 = {"exponentialDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "frictionMultiplier", "", "absVelocityThreshold", "calculateTargetValue", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "generateDecayAnimationSpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DecayAnimationSpecKt {
    public static final <T, V extends AnimationVector> T calculateTargetValue(DecayAnimationSpec<T> r3, TwoWayConverter<T, V> r4, T r5, T r6) {
        AnimationVector r1 = r3.vectorize(r4).getTargetValue(r4.getConvertToVector().invoke(r5), r4.getConvertToVector().invoke(r6));
        return (T) r4.getConvertFromVector().invoke(r1);
    }

    public static final float calculateTargetValue(DecayAnimationSpec<Float> r3, float initialValue, float initialVelocity) {
        VectorizedDecayAnimationSpec vectorizedSpec = r3.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));
        AnimationVector1D targetVector = (AnimationVector1D) vectorizedSpec.getTargetValue(AnimationVectorsKt.AnimationVector(initialValue), AnimationVectorsKt.AnimationVector(initialVelocity));
        return targetVector.getValue();
    }

    public static /* synthetic */ DecayAnimationSpec exponentialDecay$default(float r0, float r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r0 = 1.0f;
    L6:
        if ((r2 & 2) == 0) goto L9;
        r1 = 0.1f;
    L9:
        return exponentialDecay(r0, r1);
    }

    public static final <T> DecayAnimationSpec<T> exponentialDecay(float frictionMultiplier, float absVelocityThreshold) {
        return generateDecayAnimationSpec(new FloatExponentialDecaySpec(frictionMultiplier, absVelocityThreshold));
    }

    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(FloatDecayAnimationSpec $this$generateDecayAnimationSpec) {
        return new DecayAnimationSpecImpl($this$generateDecayAnimationSpec);
    }
}
