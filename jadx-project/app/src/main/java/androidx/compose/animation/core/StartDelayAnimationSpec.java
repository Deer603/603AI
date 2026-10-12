package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\b\b\u0001\u0010\u0013*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00130\u0016H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/StartDelayAnimationSpec;", "T", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "startDelayNanos", "", "(Landroidx/compose/animation/core/AnimationSpec;J)V", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getStartDelayNanos", "()J", "equals", "", "other", "", "hashCode", "", "vectorize", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StartDelayAnimationSpec<T> implements AnimationSpec<T> {
    private final AnimationSpec<T> animationSpec;
    private final long startDelayNanos;

    public StartDelayAnimationSpec(AnimationSpec<T> r1, long startDelayNanos) {
        this.animationSpec = r1;
        this.startDelayNanos = startDelayNanos;
    }

    public final AnimationSpec<T> getAnimationSpec() {
        return this.animationSpec;
    }

    public final long getStartDelayNanos() {
        return this.startDelayNanos;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> r5) {
        return new StartDelayVectorizedAnimationSpec(this.animationSpec.vectorize(r5), this.startDelayNanos);
    }

    public int hashCode() {
        return (this.animationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }

    public boolean equals(Object other) {
        if ((other instanceof StartDelayAnimationSpec) == true) goto L6;
        return false;
    L6:
        if (((StartDelayAnimationSpec) other).startDelayNanos == this.startDelayNanos) goto L8;
        return false;
    L8:
        if (Intrinsics.areEqual(((StartDelayAnimationSpec) other).animationSpec, this.animationSpec) == false) goto L12;
        return true;
    L12:
        return false;
    }
}
