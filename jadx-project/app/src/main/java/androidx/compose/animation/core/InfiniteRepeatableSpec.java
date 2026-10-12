package androidx.compose.animation.core;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\b\b\u0001\u0010\u001a*\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "T", "Landroidx/compose/animation/core/AnimationSpec;", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getInitialStartOffset-Rmkjzm4", "()J", "J", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "equals", "", "other", "", "hashCode", "", "vectorize", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {
    public static final int $stable = 0;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final RepeatMode repeatMode;

    static {
        $stable = 8;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec r1, RepeatMode r2, long r3, DefaultConstructorMarker r5) {
        this(r1, r2, r3);
    }

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec<T> r1, RepeatMode repeatMode, long initialStartOffset) {
        this.animation = r1;
        this.repeatMode = repeatMode;
        this.initialStartOffset = initialStartOffset;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec r7, RepeatMode r8, long r9, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 2) == 0) goto L5;
        RepeatMode r2 = RepeatMode.Restart;
    L7:
        if ((r11 & 4) == 0) goto L9;
        long r3 = StartOffset.m167constructorimpl$default(0, 0, 2, null);
    L10:
        this(r7, r2, r3, null);
        return;
    L9:
        r3 = r9;
        goto L10
    L5:
        r2 = r8;
        goto L7
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m149getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec r1, RepeatMode r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = RepeatMode.Restart;
    L5:
        this(r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        this(animation, repeatMode, StartOffset.m167constructorimpl$default(0, 0, 2, null), null);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> r7) {
        return new VectorizedInfiniteRepeatableSpec(this.animation.vectorize(r7), this.repeatMode, this.initialStartOffset, null);
    }

    public boolean equals(Object other) {
        if ((other instanceof InfiniteRepeatableSpec) == true) goto L5;
        return false;
    L5:
        if (Intrinsics.areEqual(((InfiniteRepeatableSpec) other).animation, this.animation) == true) goto L7;
        return false;
    L7:
        if (((InfiniteRepeatableSpec) other).repeatMode == this.repeatMode) goto L9;
        return false;
    L9:
        if (StartOffset.m169equalsimpl0(((InfiniteRepeatableSpec) other).initialStartOffset, this.initialStartOffset) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m172hashCodeimpl(this.initialStartOffset);
    }
}
