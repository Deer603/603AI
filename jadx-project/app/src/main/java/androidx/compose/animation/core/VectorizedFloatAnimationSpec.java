package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "anim", "Landroidx/compose/animation/core/FloatAnimationSpec;", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "anims", "Landroidx/compose/animation/core/Animations;", "(Landroidx/compose/animation/core/Animations;)V", "endVelocityVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 0;
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    static {
        $stable = 8;
    }

    public VectorizedFloatAnimationSpec(Animations anims) {
        this.anims = anims;
    }

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec anim) {
        this(new AnonymousClass1(anim));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long r15, V r17, V r18, V r19) {
        if (this.valueVector != null) goto L5;
        this.valueVector = (V) AnimationVectorsKt.newInstance(r17);
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
        if (r0 >= r2) goto L15;
        if (r4 != null) goto L13;
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        r4 = null;
    L13:
        r4.set$animation_core_release(r0, this.anims.get(r0).getValueFromNanos(r15, r17.get$animation_core_release(r0), r18.get$animation_core_release(r0), r19.get$animation_core_release(r0)));
        r0 = r0 + 1;
        goto L9
    L15:
        if (r4 != null) goto L18;
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    L18:
        return r4;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long r15, V r17, V r18, V r19) {
        if (this.velocityVector != null) goto L5;
        this.velocityVector = (V) AnimationVectorsKt.newInstance(r19);
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
        if (r0 >= r2) goto L15;
        if (r4 != null) goto L13;
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        r4 = null;
    L13:
        r4.set$animation_core_release(r0, this.anims.get(r0).getVelocityFromNanos(r15, r17.get$animation_core_release(r0), r18.get$animation_core_release(r0), r19.get$animation_core_release(r0)));
        r0 = r0 + 1;
        goto L9
    L15:
        if (r4 != null) goto L18;
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    L18:
        return r4;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V r10, V r11, V r12) {
        if (this.endVelocityVector != null) goto L5;
        this.endVelocityVector = (V) AnimationVectorsKt.newInstance(r12);
    L5:
        int r0 = 0;
        V r1 = this.endVelocityVector;
        if (r1 != null) goto L8;
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        r1 = null;
    L8:
        int r2 = r1.getSize$animation_core_release();
    L9:
        V r4 = this.endVelocityVector;
        if (r0 >= r2) goto L14;
        if (r4 != null) goto L13;
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        r4 = null;
    L13:
        r4.set$animation_core_release(r0, this.anims.get(r0).getEndVelocity(r10.get$animation_core_release(r0), r11.get$animation_core_release(r0), r12.get$animation_core_release(r0)));
        r0 = r0 + 1;
        goto L9
    L14:
        if (r4 != null) goto L17;
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    L17:
        return r4;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V r9, V r10, V r11) {
        long maxDuration = 0;
        int i = 0;
        int r3 = r9.getSize$animation_core_release();
    L3:
        if (i >= r3) goto L5;
        maxDuration = Math.max(maxDuration, this.anims.get(i).getDurationNanos(r9.get$animation_core_release(i), r10.get$animation_core_release(i), r11.get$animation_core_release(i)));
        i = i + 1;
        goto L3
    L5:
        return maxDuration;
    }
}
