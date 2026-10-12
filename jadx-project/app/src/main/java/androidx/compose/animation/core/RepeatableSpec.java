package androidx.compose.animation.core;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0016J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\b\b\u0001\u0010\u001d*\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001d0 H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/RepeatableSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "iterations", "", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getInitialStartOffset-Rmkjzm4", "()J", "J", "getIterations", "()I", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "equals", "", "other", "", "hashCode", "vectorize", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final int iterations;
    private final RepeatMode repeatMode;

    static {
    }

    public /* synthetic */ RepeatableSpec(int r1, DurationBasedAnimationSpec r2, RepeatMode r3, long r4, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4);
    }

    private RepeatableSpec(int iterations, DurationBasedAnimationSpec<T> r2, RepeatMode repeatMode, long initialStartOffset) {
        this.iterations = iterations;
        this.animation = r2;
        this.repeatMode = repeatMode;
        this.initialStartOffset = initialStartOffset;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter converter) {
        return vectorize(converter);
    }

    public /* synthetic */ RepeatableSpec(int r8, DurationBasedAnimationSpec r9, RepeatMode r10, long r11, int r13, DefaultConstructorMarker r14) {
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

    public final int getIterations() {
        return this.iterations;
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m162getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public /* synthetic */ RepeatableSpec(int r1, DurationBasedAnimationSpec r2, RepeatMode r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = RepeatMode.Restart;
    L5:
        this(r1, r2, r3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ RepeatableSpec(int iterations, DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        this(iterations, animation, repeatMode, StartOffset.m167constructorimpl$default(0, 0, 2, null), null);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(TwoWayConverter<T, V> r8) {
        return new VectorizedRepeatableSpec(this.iterations, this.animation.vectorize(r8), this.repeatMode, this.initialStartOffset, null);
    }

    public boolean equals(Object other) {
        if ((other instanceof RepeatableSpec) == true) goto L5;
        return false;
    L5:
        if (((RepeatableSpec) other).iterations == this.iterations) goto L7;
        return false;
    L7:
        if (Intrinsics.areEqual(((RepeatableSpec) other).animation, this.animation) == true) goto L9;
        return false;
    L9:
        if (((RepeatableSpec) other).repeatMode == this.repeatMode) goto L11;
        return false;
    L11:
        if (StartOffset.m169equalsimpl0(((RepeatableSpec) other).initialStartOffset, this.initialStartOffset) == false) goto L19;
        return true;
    L19:
        return false;
    }

    public int hashCode() {
        return (((((this.iterations * 31) + this.animation.hashCode()) * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m172hashCodeimpl(this.initialStartOffset);
    }
}
