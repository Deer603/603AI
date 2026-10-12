package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SpringEstimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a8\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0007\u001a(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a@\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a0\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aH\u0082\b\u001a\r\u0010\u001c\u001a\u00020\u001d*\u00020\u0004H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"MAX_LONG_MILLIS", "", "estimateAnimationDurationMillis", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "firstRootReal", "p0", "v0", "estimateDurationInternal", "firstRootImaginary", "secondRootReal", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    public static final long estimateAnimationDurationMillis(float stiffness, float dampingRatio, float initialVelocity, float initialDisplacement, float delta) {
        if (dampingRatio != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L10;
        return MAX_LONG_MILLIS;
    L10:
        return estimateAnimationDurationMillis(stiffness, dampingRatio, initialVelocity, initialDisplacement, delta);
    L5:
        r0 = false;
        goto L6
    }

    public static final long estimateAnimationDurationMillis(double stiffness, double dampingRatio, double initialVelocity, double initialDisplacement, double delta) {
        double dampingCoefficient = (2.0d * dampingRatio) * Math.sqrt(stiffness);
        double partialRoot = (dampingCoefficient * dampingCoefficient) - (4.0d * stiffness);
        double partialRootImaginary = 0.0d;
        if (partialRoot >= 0.0d) goto L5;
        double partialRootReal = 0.0d;
    L7:
        if (partialRoot >= 0.0d) goto L9;
        partialRootImaginary = Math.sqrt(Math.abs(partialRoot));
    L9:
        double firstRootReal = ((-dampingCoefficient) + partialRootReal) * 0.5d;
        double firstRootImaginary = partialRootImaginary * 0.5d;
        double secondRootReal = ((-dampingCoefficient) - partialRootReal) * 0.5d;
        return estimateDurationInternal(firstRootReal, firstRootImaginary, secondRootReal, dampingRatio, initialVelocity, initialDisplacement, delta);
    L5:
        partialRootReal = Math.sqrt(partialRoot);
        goto L7
    }

    public static final long estimateAnimationDurationMillis(double springConstant, double dampingCoefficient, double mass, double initialVelocity, double initialDisplacement, double delta) {
        double criticalDamping = Math.sqrt(springConstant * mass) * 2.0d;
        double dampingRatio = dampingCoefficient / criticalDamping;
        double partialRoot = (dampingCoefficient * dampingCoefficient) - ((4.0d * mass) * springConstant);
        double divisor = 1.0d / (2.0d * mass);
        double r6 = 0.0d;
        if (partialRoot >= 0.0d) goto L5;
        double r8 = 0.0d;
    L6:
        double partialRootReal = r8;
        if (partialRoot >= 0.0d) goto L9;
        r6 = Math.sqrt(Math.abs(partialRoot));
    L9:
        double partialRootImaginary = r6;
        double firstRootReal = ((-dampingCoefficient) + partialRootReal) * divisor;
        double firstRootImaginary = partialRootImaginary * divisor;
        double secondRootReal = ((-dampingCoefficient) - partialRootReal) * divisor;
        return estimateDurationInternal(firstRootReal, firstRootImaginary, secondRootReal, dampingRatio, initialVelocity, initialDisplacement, delta);
    L5:
        r8 = Math.sqrt(partialRoot);
        goto L6
    }

    private static final double estimateUnderDamped(double firstRootReal, double firstRootImaginary, double p0, double v0, double delta) {
        double c2 = (v0 - (firstRootReal * p0)) / firstRootImaginary;
        double c = Math.sqrt((p0 * p0) + (c2 * c2));
        return Math.log(delta / c) / firstRootReal;
    }

    private static final double estimateCriticallyDamped(double firstRootReal, double p0, double v0, double delta) {
        double r = firstRootReal;
        double c1 = p0;
        double c2 = v0 - (r * c1);
        double t1 = Math.log(Math.abs(delta / c1)) / r;
        double guess = Math.log(Math.abs(delta / c2));
        double t = guess;
        int i = 0;
    L3:
        double r2 = r;
        if (i >= 6) goto L6;
        t = guess - Math.log(Math.abs(t / r2));
        i = i + 1;
        r = r2;
        goto L3
    L6:
        double t2 = t / r2;
        boolean r19 = false;
        if ((Double.doubleToRawLongBits(t1) & Long.MAX_VALUE) >= 9218868437227405312L) goto L9;
        boolean r11 = true;
    L11:
        if (r11 == true) goto L14;
        double tCurr = t2;
    L20:
        double tInflection = (-((r2 * c1) + c2)) / (r2 * c2);
        double tCurr2 = tCurr;
        double tCurr3 = (Math.exp(r2 * tInflection) * c1) + ((c2 * tInflection) * Math.exp(r2 * tInflection));
        if (Double.isNaN(tInflection) == true) goto L40;
        if (tInflection <= 0.0d) goto L40;
        if (tInflection <= 0.0d) goto L37;
        c1 = c1;
        if ((-tCurr3) >= delta) goto L38;
        if (c2 < 0.0d) goto L32;
    L34:
        double tCurr4 = tCurr2;
    L35:
        double xInflection = -delta;
    L41:
        double tDelta = Double.MAX_VALUE;
        int iterations = 0;
    L43:
        if (tDelta <= 0.001d) goto L47;
        if (iterations >= 100) goto L47;
        iterations = iterations + 1;
        double tLast = tCurr4;
        double t3 = tCurr4;
        tCurr4 = tCurr4 - ((((c1 + (c2 * t3)) * Math.exp(r2 * t3)) + xInflection) / (((((r2 * t3) + 1.0d) * c2) + (c1 * r2)) * Math.exp(r2 * t3)));
        tDelta = Math.abs(tLast - tCurr4);
    L47:
        return tCurr4;
    L32:
        if (c1 <= 0.0d) goto L34;
        tCurr4 = 0.0d;
    L38:
        double tConcavChange = (-(2.0d / r2)) - (c1 / c2);
        tCurr4 = tConcavChange;
        xInflection = delta;
        goto L41
    L37:
        c1 = c1;
    L40:
        xInflection = -delta;
        tCurr4 = tCurr2;
        goto L41
    L14:
        if ((Double.doubleToRawLongBits(t2) & Long.MAX_VALUE) >= 9218868437227405312L) goto L17;
        r19 = true;
    L17:
        if (r19 == true) goto L19;
        tCurr = t1;
        goto L20
    L19:
        tCurr = Math.max(t1, t2);
        goto L20
    L9:
        r11 = false;
        goto L11
    }

    private static final double estimateOverDamped(double firstRootReal, double secondRootReal, double p0, double v0, double delta) {
        double c2 = ((firstRootReal * p0) - v0) / (firstRootReal - secondRootReal);
        double c1 = p0 - c2;
        double t1 = Math.log(Math.abs(delta / c1)) / firstRootReal;
        double t2 = Math.log(Math.abs(delta / c2)) / secondRootReal;
        boolean r21 = false;
        if ((Double.doubleToRawLongBits(t1) & Long.MAX_VALUE) >= 9218868437227405312L) goto L5;
        boolean r17 = true;
    L7:
        if (r17 == true) goto L10;
        double r6 = t2;
    L16:
        double tCurr = r6;
        double c3 = c1;
        double tInflection = Math.log((c1 * firstRootReal) / ((-c2) * secondRootReal)) / (secondRootReal - firstRootReal);
        if (Double.isNaN(tInflection) == true) goto L34;
        if (tInflection <= 0.0d) goto L34;
        if (tInflection <= 0.0d) goto L31;
        c3 = c3;
        if ((-estimateOverDamped$xInflection(c3, firstRootReal, tInflection, c2, secondRootReal)) < delta) goto L26;
    L32:
        double tConcavChange = Math.log((-((c2 * secondRootReal) * secondRootReal)) / ((c3 * firstRootReal) * firstRootReal)) / (firstRootReal - secondRootReal);
        tCurr = tConcavChange;
        double tConcavChange2 = delta;
    L36:
        if (Math.abs(((c3 * firstRootReal) * Math.exp(firstRootReal * tCurr)) + ((c2 * secondRootReal) * Math.exp(secondRootReal * tCurr))) >= 1.0E-4d) goto L38;
        return tCurr;
    L38:
        double tDelta = Double.MAX_VALUE;
        int iterations = 0;
    L40:
        if (tDelta <= 0.001d) goto L44;
        if (iterations >= 100) goto L44;
        iterations = iterations + 1;
        double tLast = tCurr;
        double t = tCurr;
        tCurr = tCurr - ((((Math.exp(firstRootReal * t) * c3) + (Math.exp(secondRootReal * t) * c2)) + tConcavChange2) / (((c3 * firstRootReal) * Math.exp(firstRootReal * t)) + ((c2 * secondRootReal) * Math.exp(secondRootReal * t))));
        tDelta = Math.abs(tLast - tCurr);
    L44:
        return tCurr;
    L26:
        if (c2 > 0.0d) goto L28;
    L30:
        tConcavChange2 = -delta;
        goto L36
    L28:
        if (c3 >= 0.0d) goto L30;
        tCurr = 0.0d;
        goto L30
    L31:
        c3 = c3;
    L34:
        tConcavChange2 = -delta;
        goto L36
    L10:
        if ((Double.doubleToRawLongBits(t2) & Long.MAX_VALUE) >= 9218868437227405312L) goto L13;
        r21 = true;
    L13:
        if (r21 == true) goto L15;
        r6 = t1;
        goto L16
    L15:
        r6 = Math.max(t1, t2);
        goto L16
    L5:
        r17 = false;
        goto L7
    }

    private static final double estimateOverDamped$xInflection(double c1, double r1, double tInflection, double c2, double r2) {
        return (Math.exp(r1 * tInflection) * c1) + (Math.exp(r2 * tInflection) * c2);
    }

    private static final long estimateDurationInternal(double firstRootReal, double firstRootImaginary, double secondRootReal, double dampingRatio, double initialVelocity, double initialPosition, double delta) {
        boolean r5 = true;
        if (initialPosition != 0.0d) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L15;
        if (initialVelocity == 0.0d) goto L11;
        r5 = false;
    L11:
        if (r5 == false) goto L15;
        return 0;
    L15:
        if (initialPosition >= 0.0d) goto L17;
        double r2 = -initialVelocity;
    L18:
        double v0 = r2;
        double p0 = Math.abs(initialPosition);
        if (dampingRatio <= 1.0d) goto L22;
        double r3 = estimateOverDamped(firstRootReal, secondRootReal, p0, v0, delta);
    L26:
        return (long) (r3 * 1000.0d);
    L22:
        if (dampingRatio >= 1.0d) goto L24;
        r3 = estimateUnderDamped(firstRootReal, firstRootImaginary, p0, v0, delta);
        goto L26
    L24:
        r3 = estimateCriticallyDamped(firstRootReal, p0, v0, delta);
        goto L26
    L17:
        r2 = initialVelocity;
        goto L18
    L5:
        r4 = false;
        goto L6
    }

    private static final double iterateNewtonsMethod(double x, Function1<? super Double, Double> r7, Function1<? super Double, Double> r8) {
        return x - (r7.invoke(Double.valueOf(x)).doubleValue() / r8.invoke(Double.valueOf(x)).doubleValue());
    }

    private static final boolean isNotFinite(double $this$isNotFinite) {
        if ((Double.doubleToRawLongBits($this$isNotFinite) & Long.MAX_VALUE) >= 9218868437227405312L) goto L5;
        boolean r4 = true;
    L7:
        return !r4;
    L5:
        r4 = false;
        goto L7
    }
}
