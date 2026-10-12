package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Easing.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "a", "", "b", "c", "d", "(FFFF)V", "max", "min", "equals", "", "other", "", "hashCode", "", "throwNoSolution", "", "fraction", "toString", "", "transform", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float max;
    private final float min;

    static {
    }

    public CubicBezierEasing(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (Float.isNaN(this.a) == false) goto L5;
    L11:
        boolean value$iv = false;
    L13:
        if (value$iv == true) goto L15;
        PreconditionsKt.throwIllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + this.a + ", " + this.b + ", " + this.c + ", " + this.d + '.');
    L15:
        float[] roots = new float[5];
        long extrema = BezierKt.computeCubicVerticalBounds(0.0f, this.b, this.d, 1.0f, roots, 0);
        int bits$iv$iv = (int) (extrema >> 32);
        this.min = Float.intBitsToFloat(bits$iv$iv);
        int bits$iv$iv2 = (int) (4294967295L & extrema);
        this.max = Float.intBitsToFloat(bits$iv$iv2);
        return;
    L5:
        if (Float.isNaN(this.b) == true) goto L11;
        if (Float.isNaN(this.c) == true) goto L11;
        if (Float.isNaN(this.d) == true) goto L11;
        value$iv = true;
        goto L13
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float fraction) {
        if (fraction <= 0.0f) goto L17;
        if (fraction >= 1.0f) goto L17;
        float f = Math.max(fraction, 1.1920929E-7f);
        float t = BezierKt.findFirstCubicRoot(0.0f - f, this.a - f, this.c - f, 1.0f - f);
        if (Float.isNaN(t) == false) goto L9;
        throwNoSolution(fraction);
    L9:
        float $this$fastCoerceIn$iv = BezierKt.evaluateCubic(this.b, this.d, t);
        float minimumValue$iv = this.min;
        float maximumValue$iv = this.max;
        float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= minimumValue$iv) goto L13;
        $this$fastCoerceAtLeast$iv$iv = minimumValue$iv;
    L13:
        if ($this$fastCoerceAtLeast$iv$iv > maximumValue$iv) goto L18;
        return $this$fastCoerceAtLeast$iv$iv;
    L18:
        return maximumValue$iv;
    L17:
        return fraction;
    }

    private final void throwNoSolution(float fraction) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ") has no solution at " + fraction);
    }

    public boolean equals(Object other) {
        if ((other instanceof CubicBezierEasing) == true) goto L5;
        return false;
    L5:
        if (this.a != ((CubicBezierEasing) other).a) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L10;
        return false;
    L10:
        if (this.b != ((CubicBezierEasing) other).b) goto L12;
        boolean r1 = true;
    L13:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (this.c != ((CubicBezierEasing) other).c) goto L17;
        boolean r2 = true;
    L18:
        if (r2 == true) goto L20;
        return false;
    L20:
        if (this.d != ((CubicBezierEasing) other).d) goto L22;
        boolean r3 = true;
    L23:
        if (r3 == true) goto L26;
        return false;
    L26:
        return true;
    L22:
        r3 = false;
        goto L23
    L17:
        r2 = false;
        goto L18
    L12:
        r1 = false;
        goto L13
    L7:
        r0 = false;
        goto L8
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
    }
}
