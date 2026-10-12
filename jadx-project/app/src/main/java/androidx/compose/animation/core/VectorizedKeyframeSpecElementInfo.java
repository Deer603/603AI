package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u0016\u0010\u0014\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "vectorValue", "easing", "Landroidx/compose/animation/core/Easing;", "arcMode", "Landroidx/compose/animation/core/ArcMode;", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArcMode--9T-Mq4", "()I", "I", "getEasing", "()Landroidx/compose/animation/core/Easing;", "getVectorValue", "()Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationVector;", "component1", "component2", "component3", "component3--9T-Mq4", "copy", "copy-2NF0KzA", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/Easing;I)Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "equals", "", "other", "hashCode", "", "toString", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorizedKeyframeSpecElementInfo<V extends AnimationVector> {
    public static final int $stable = 0;
    private final int arcMode;
    private final Easing easing;
    private final V vectorValue;

    static {
    }

    public /* synthetic */ VectorizedKeyframeSpecElementInfo(AnimationVector r1, Easing r2, int r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-2NF0KzA$default, reason: not valid java name */
    public static /* synthetic */ VectorizedKeyframeSpecElementInfo m196copy2NF0KzA$default(VectorizedKeyframeSpecElementInfo r0, AnimationVector r1, Easing r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.vectorValue;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.easing;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.arcMode;
    L12:
        return r0.m198copy2NF0KzA(r1, r2, r3);
    }

    public final V component1() {
        return this.vectorValue;
    }

    public final Easing component2() {
        return this.easing;
    }

    /* JADX INFO: renamed from: component3--9T-Mq4, reason: not valid java name */
    public final int m197component39TMq4() {
        return this.arcMode;
    }

    /* JADX INFO: renamed from: copy-2NF0KzA, reason: not valid java name */
    public final VectorizedKeyframeSpecElementInfo<V> m198copy2NF0KzA(V r3, Easing r4, int r5) {
        return new VectorizedKeyframeSpecElementInfo(r3, r4, r5, null);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof VectorizedKeyframeSpecElementInfo) == true) goto L8;
        return false;
    L8:
        VectorizedKeyframeSpecElementInfo r1 = (VectorizedKeyframeSpecElementInfo) r6;
        if (Intrinsics.areEqual(this.vectorValue, r1.vectorValue) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.easing, r1.easing) == true) goto L15;
        return false;
    L15:
        if (ArcMode.m142equalsimpl0(this.arcMode, r1.arcMode) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.vectorValue.hashCode() * 31) + this.easing.hashCode()) * 31) + ArcMode.m143hashCodeimpl(this.arcMode);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.vectorValue + ", easing=" + this.easing + ", arcMode=" + ArcMode.m144toStringimpl(this.arcMode) + ')';
    }

    private VectorizedKeyframeSpecElementInfo(V r1, Easing easing, int arcMode) {
        this.vectorValue = r1;
        this.easing = easing;
        this.arcMode = arcMode;
    }

    public final V getVectorValue() {
        return this.vectorValue;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    /* JADX INFO: renamed from: getArcMode--9T-Mq4, reason: not valid java name */
    public final int m199getArcMode9TMq4() {
        return this.arcMode;
    }
}
