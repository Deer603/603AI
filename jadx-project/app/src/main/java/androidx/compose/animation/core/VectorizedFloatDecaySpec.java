package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0010\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "floatDecaySpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)V", "absVelocityThreshold", "", "getAbsVelocityThreshold", "()F", "getFloatDecaySpec", "()Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "targetVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "getDurationNanos", "", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getTargetValue", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecaySpec) {
        this.floatDecaySpec = floatDecaySpec;
        this.absVelocityThreshold = this.floatDecaySpec.getAbsVelocityThreshold();
    }

    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getValueFromNanos(long r9, V r11, V r12) {
        if (this.valueVector != null) goto L5;
        this.valueVector = (V) AnimationVectorsKt.newInstance(r11);
    L5:
        int r0 = 0;
        V r1 = this.valueVector;
        if (r1 != null) goto L8;
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        r1 = null;
    L8:
        int r2 = r1.getSize$animation_core_release();
    L9:
        V r4 = this.valueVector;
        if (r0 >= r2) goto L14;
        if (r4 != null) goto L13;
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        r4 = null;
    L13:
        r4.set$animation_core_release(r0, this.floatDecaySpec.getValueFromNanos(r9, r11.get$animation_core_release(r0), r12.get$animation_core_release(r0)));
        r0 = r0 + 1;
        goto L9
    L14:
        if (r4 != null) goto L17;
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    L17:
        return r4;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(V r8, V r9) {
        long r0 = 0;
        if (this.velocityVector != null) goto L5;
        this.velocityVector = (V) AnimationVectorsKt.newInstance(r8);
    L5:
        int r2 = 0;
        V r3 = this.velocityVector;
        if (r3 != null) goto L8;
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        r3 = null;
    L8:
        int r4 = r3.getSize$animation_core_release();
    L9:
        if (r2 >= r4) goto L11;
        r0 = Math.max(r0, this.floatDecaySpec.getDurationNanos(r8.get$animation_core_release(r2), r9.get$animation_core_release(r2)));
        r2 = r2 + 1;
        goto L9
    L11:
        return r0;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getVelocityFromNanos(long r9, V r11, V r12) {
        if (this.velocityVector != null) goto L5;
        this.velocityVector = (V) AnimationVectorsKt.newInstance(r11);
    L5:
        int r0 = 0;
        V r1 = this.velocityVector;
        if (r1 != null) goto L8;
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        r1 = null;
    L8:
        int r2 = r1.getSize$animation_core_release();
    L9:
        V r4 = this.velocityVector;
        if (r0 >= r2) goto L14;
        if (r4 != null) goto L13;
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        r4 = null;
    L13:
        r4.set$animation_core_release(r0, this.floatDecaySpec.getVelocityFromNanos(r9, r11.get$animation_core_release(r0), r12.get$animation_core_release(r0)));
        r0 = r0 + 1;
        goto L9
    L14:
        if (r4 != null) goto L17;
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    L17:
        return r4;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getTargetValue(V r9, V r10) {
        if (this.targetVector != null) goto L5;
        this.targetVector = (V) AnimationVectorsKt.newInstance(r9);
    L5:
        int r0 = 0;
        V r1 = this.targetVector;
        if (r1 != null) goto L8;
        Intrinsics.throwUninitializedPropertyAccessException("targetVector");
        r1 = null;
    L8:
        int r2 = r1.getSize$animation_core_release();
    L9:
        V r4 = this.targetVector;
        if (r0 >= r2) goto L14;
        if (r4 != null) goto L13;
        Intrinsics.throwUninitializedPropertyAccessException("targetVector");
        r4 = null;
    L13:
        r4.set$animation_core_release(r0, this.floatDecaySpec.getTargetValue(r9.get$animation_core_release(r0), r10.get$animation_core_release(r0)));
        r0 = r0 + 1;
        goto L9
    L14:
        if (r4 != null) goto L17;
        Intrinsics.throwUninitializedPropertyAccessException("targetVector");
        return null;
    L17:
        return r4;
    }
}
