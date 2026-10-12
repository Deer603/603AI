package androidx.compose.animation.core;

import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0016J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\b\b\u0001\u0010\u0019*\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00190\u001cH\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0010\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/core/ArcAnimationSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "mode", "Landroidx/compose/animation/core/ArcMode;", "durationMillis", "", "delayMillis", "easing", "Landroidx/compose/animation/core/Easing;", "(IIILandroidx/compose/animation/core/Easing;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDelayMillis", "()I", "getDurationMillis", "getEasing", "()Landroidx/compose/animation/core/Easing;", "getMode--9T-Mq4", "I", "equals", "", "other", "", "hashCode", "vectorize", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArcAnimationSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delayMillis;
    private final int durationMillis;
    private final Easing easing;
    private final int mode;

    static {
    }

    public /* synthetic */ ArcAnimationSpec(int r1, int r2, int r3, Easing r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    private ArcAnimationSpec(int mode, int durationMillis, int delayMillis, Easing easing) {
        this.mode = mode;
        this.durationMillis = durationMillis;
        this.delayMillis = delayMillis;
        this.easing = easing;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter converter) {
        return vectorize(converter);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedFiniteAnimationSpec vectorize(TwoWayConverter converter) {
        return vectorize(converter);
    }

    public /* synthetic */ ArcAnimationSpec(int r7, int r8, int r9, Easing r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L5;
        int r1 = ArcMode.Companion.m147getArcBelow9TMq4();
    L7:
        if ((r11 & 2) == 0) goto L9;
        int r2 = 300;
    L11:
        if ((r11 & 4) == 0) goto L13;
        int r3 = 0;
    L15:
        if ((r11 & 8) == 0) goto L17;
        Easing r4 = EasingKt.getFastOutSlowInEasing();
    L18:
        this(r1, r2, r3, r4, null);
        return;
    L17:
        r4 = r10;
        goto L18
    L13:
        r3 = r9;
        goto L15
    L9:
        r2 = r8;
        goto L11
    L5:
        r1 = r7;
        goto L7
    }

    /* JADX INFO: renamed from: getMode--9T-Mq4, reason: not valid java name */
    public final int m138getMode9TMq4() {
        return this.mode;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> r9) {
        return new VectorizedKeyframesSpec(IntListKt.intListOf(0, this.durationMillis), IntObjectMapKt.emptyIntObjectMap(), this.durationMillis, this.delayMillis, this.easing, this.mode, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof ArcAnimationSpec) == true) goto L9;
        return false;
    L9:
        if (ArcMode.m142equalsimpl0(this.mode, ((ArcAnimationSpec) other).mode) == true) goto L12;
        return false;
    L12:
        if (this.durationMillis == ((ArcAnimationSpec) other).durationMillis) goto L15;
        return false;
    L15:
        if (this.delayMillis == ((ArcAnimationSpec) other).delayMillis) goto L18;
        return false;
    L18:
        return Intrinsics.areEqual(this.easing, ((ArcAnimationSpec) other).easing);
    }

    public int hashCode() {
        int result = ArcMode.m143hashCodeimpl(this.mode);
        int result2 = (result * 31) + this.durationMillis;
        return (((result2 * 31) + this.delayMillis) * 31) + this.easing.hashCode();
    }
}
