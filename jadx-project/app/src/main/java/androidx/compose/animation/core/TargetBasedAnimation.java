package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004BE\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\fBE\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u000eJ\u0015\u0010.\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0002\u00100J\u0015\u00101\u001a\u00028\u00012\u0006\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0002\u00102J\b\u00103\u001a\u000204H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00028\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u000b\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R&\u0010\"\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u0000@@X\u0080\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010%R&\u0010'\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u0000@@X\u0080\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010%R\u0014\u0010\n\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0010\u0010+\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u00065"}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "targetValue", "initialVelocityVector", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "_durationNanos", "", "_endVelocity", "Landroidx/compose/animation/core/AnimationVector;", "getAnimationSpec$animation_core_release", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "durationNanos", "getDurationNanos", "()J", "endVelocity", "getEndVelocity", "()Landroidx/compose/animation/core/AnimationVector;", "getInitialValue", "()Ljava/lang/Object;", "initialValueVector", "isInfinite", "", "()Z", "value", "mutableInitialValue", "getMutableInitialValue$animation_core_release", "setMutableInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "mutableTargetValue", "getMutableTargetValue$animation_core_release", "setMutableTargetValue$animation_core_release", "getTargetValue", "targetValueVector", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "getValueFromNanos", "playTimeNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "toString", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;
    private long _durationNanos;
    private V _endVelocity;
    private final VectorizedAnimationSpec<V> animationSpec;
    private V initialValueVector;
    private final V initialVelocityVector;
    private T mutableInitialValue;
    private T mutableTargetValue;
    private V targetValueVector;
    private final TwoWayConverter<T, V> typeConverter;

    static {
        $stable = 8;
    }

    public TargetBasedAnimation(VectorizedAnimationSpec<V> r3, TwoWayConverter<T, V> r4, T r5, T r6, V r7) {
        this.animationSpec = r3;
        this.typeConverter = r4;
        this.mutableTargetValue = r6;
        this.mutableInitialValue = r5;
        this.initialValueVector = getTypeConverter().getConvertToVector().invoke(r5);
        this.targetValueVector = getTypeConverter().getConvertToVector().invoke(r6);
        if (r7 == null) goto L6;
        V r0 = (V) AnimationVectorsKt.copy(r7);
        if (r0 == null) goto L6;
    L7:
        this.initialVelocityVector = r0;
        this._durationNanos = -1;
        return;
    L6:
        r0 = (V) AnimationVectorsKt.newInstance(getTypeConverter().getConvertToVector().invoke(r5));
        goto L7
    }

    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec r7, TwoWayConverter r8, Object r9, Object r10, AnimationVector r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 16) == 0) goto L5;
        AnimationVector r5 = null;
    L6:
        this(r7, r8, r9, r10, r5);
        return;
    L5:
        r5 = r11;
        goto L6
    }

    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core_release() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getMutableTargetValue$animation_core_release() {
        return this.mutableTargetValue;
    }

    public final void setMutableTargetValue$animation_core_release(T r3) {
        if (Intrinsics.areEqual(this.mutableTargetValue, r3) == true) goto L6;
        this.mutableTargetValue = r3;
        this.targetValueVector = getTypeConverter().getConvertToVector().invoke(r3);
        this._endVelocity = null;
        this._durationNanos = -1;
        return;
    }

    public final T getMutableInitialValue$animation_core_release() {
        return this.mutableInitialValue;
    }

    public final void setMutableInitialValue$animation_core_release(T r3) {
        if (Intrinsics.areEqual(r3, this.mutableInitialValue) == true) goto L6;
        this.mutableInitialValue = r3;
        this.initialValueVector = getTypeConverter().getConvertToVector().invoke(r3);
        this._endVelocity = null;
        this._durationNanos = -1;
        return;
    }

    public final T getInitialValue() {
        return this.mutableInitialValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.mutableTargetValue;
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec r7, TwoWayConverter r8, Object r9, Object r10, AnimationVector r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 16) == 0) goto L5;
        AnimationVector r5 = null;
    L6:
        this(r7, r8, r9, r10, r5);
        return;
    L5:
        r5 = r11;
        goto L6
    }

    public TargetBasedAnimation(AnimationSpec<T> r7, TwoWayConverter<T, V> r8, T r9, T r10, V r11) {
        this(r7.vectorize(r8), r8, r9, r10, r11);
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long r10) {
        if (isFinishedFromNanos(r10) == true) goto L12;
        AnimationVector r11 = this.animationSpec.getValueFromNanos(r10, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        int r0 = 0;
        int r1 = r11.getSize$animation_core_release();
    L5:
        if (r0 >= r1) goto L16;
        if ((!Float.isNaN(r11.get$animation_core_release(r0))) == true) goto L9;
        PreconditionsKt.throwIllegalStateException("AnimationVector cannot contain a NaN. " + r11 + ". Animation: " + this + ", playTimeNanos: " + r10);
    L9:
        r0 = r0 + 1;
        goto L5
    L16:
        return (T) getTypeConverter().getConvertFromVector().invoke(r11);
    L12:
        return getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        if (this._durationNanos >= 0) goto L6;
        this._durationNanos = this.animationSpec.getDurationNanos(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
    L6:
        return this._durationNanos;
    }

    private final V getEndVelocity() {
        V r0 = this._endVelocity;
        if (r0 != null) goto L6;
        V r1 = (V) this.animationSpec.getEndVelocity(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long r8) {
        if (isFinishedFromNanos(r8) == true) goto L6;
        return (V) this.animationSpec.getVelocityFromNanos(r8, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
    L6:
        return (V) getEndVelocity();
    }

    public String toString() {
        return "TargetBasedAnimation: " + getInitialValue() + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.animationSpec;
    }
}
