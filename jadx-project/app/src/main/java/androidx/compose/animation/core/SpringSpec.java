package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0015\"\b\b\u0001\u0010\u0016*\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00160\u0019H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/SpringSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "dampingRatio", "", "stiffness", "visibilityThreshold", "(FFLjava/lang/Object;)V", "getDampingRatio", "()F", "getStiffness", "getVisibilityThreshold", "()Ljava/lang/Object;", "Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "vectorize", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final float dampingRatio;
    private final float stiffness;
    private final T visibilityThreshold;

    static {
    }

    public SpringSpec() {
        float r1 = 0.0f;
        float r2 = 0.0f;
        Object r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public SpringSpec(float dampingRatio, float stiffness, T r3) {
        this.dampingRatio = dampingRatio;
        this.stiffness = stiffness;
        this.visibilityThreshold = r3;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter converter) {
        return vectorize(converter);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedFiniteAnimationSpec vectorize(TwoWayConverter converter) {
        return vectorize(converter);
    }

    public /* synthetic */ SpringSpec(float r1, float r2, Object r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 1.0f;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 1500.0f;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = null;
    L11:
        this(r1, r2, r3);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(TwoWayConverter<T, V> r5) {
        return new VectorizedSpringSpec(this.dampingRatio, this.stiffness, AnimationSpecKt.access$convert(r5, this.visibilityThreshold));
    }

    public boolean equals(Object other) {
        if ((other instanceof SpringSpec) == true) goto L5;
        return false;
    L5:
        if (((SpringSpec) other).dampingRatio != this.dampingRatio) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L10;
        return false;
    L10:
        if (((SpringSpec) other).stiffness != this.stiffness) goto L12;
        boolean r1 = true;
    L13:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(((SpringSpec) other).visibilityThreshold, this.visibilityThreshold) == true) goto L19;
        return false;
    L19:
        return true;
    L12:
        r1 = false;
        goto L13
    L7:
        r0 = false;
        goto L8
    }

    public int hashCode() {
        T r0 = this.visibilityThreshold;
        if (r0 == null) goto L5;
        int r1 = r0.hashCode();
    L7:
        return (((r1 * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    L5:
        r1 = 0;
        goto L7
    }
}
