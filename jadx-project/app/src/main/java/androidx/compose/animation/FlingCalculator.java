package androidx.compose.animation;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: FlingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0003H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/FlingCalculator;", "", "friction", "", "density", "Landroidx/compose/ui/unit/Density;", "(FLandroidx/compose/ui/unit/Density;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "magicPhysicalCoefficient", "computeDeceleration", "flingDistance", "velocity", "flingDuration", "", "flingInfo", "Landroidx/compose/animation/FlingCalculator$FlingInfo;", "getSplineDeceleration", "", "FlingInfo", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlingCalculator {
    public static final int $stable = 0;
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    /* JADX INFO: compiled from: FlingCalculator.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/FlingCalculator$FlingInfo;", "", "initialVelocity", "", "distance", "duration", "", "(FFJ)V", "getDistance", "()F", "getDuration", "()J", "getInitialVelocity", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "position", "time", "toString", "", "velocity", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        static {
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo r0, float r1, float r2, long r3, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = r0.initialVelocity;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = r0.distance;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = r0.duration;
        L12:
            return r0.copy(r1, r2, r3);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        public final FlingInfo copy(float r2, float r3, long r4) {
            return new FlingInfo(r2, r3, r4);
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof FlingInfo) == true) goto L8;
            return false;
        L8:
            FlingInfo r1 = (FlingInfo) r8;
            if (Float.compare(this.initialVelocity, r1.initialVelocity) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.distance, r1.distance) == 0) goto L15;
            return false;
        L15:
            if (this.duration == r1.duration) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Float.hashCode(this.initialVelocity) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.duration);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public FlingInfo(float initialVelocity, float distance, long duration) {
            this.initialVelocity = initialVelocity;
            this.distance = distance;
            this.duration = duration;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public final float position(long time) {
            if (this.duration <= 0) goto L5;
            float splinePos = time / this.duration;
        L7:
            return (this.distance * Math.signum(this.initialVelocity)) * AndroidFlingSpline.INSTANCE.flingPosition(splinePos).getDistanceCoefficient();
        L5:
            splinePos = 1.0f;
            goto L7
        }

        public final float velocity(long time) {
            if (this.duration <= 0) goto L5;
            float splinePos = time / this.duration;
        L7:
            return (((AndroidFlingSpline.INSTANCE.flingPosition(splinePos).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        L5:
            splinePos = 1.0f;
            goto L7
        }
    }

    static {
    }

    public FlingCalculator(float friction, Density density) {
        this.friction = friction;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(this.density);
    }

    public final Density getDensity() {
        return this.density;
    }

    private final float computeDeceleration(Density density) {
        return FlingCalculatorKt.access$computeDeceleration(0.84f, density.getDensity());
    }

    private final double getSplineDeceleration(float velocity) {
        return AndroidFlingSpline.INSTANCE.deceleration(velocity, this.friction * this.magicPhysicalCoefficient);
    }

    public final long flingDuration(float velocity) {
        double l = getSplineDeceleration(velocity);
        double decelMinusOne = ((double) FlingCalculatorKt.access$getDecelerationRate$p()) - 1.0d;
        return (long) (Math.exp(l / decelMinusOne) * 1000.0d);
    }

    public final float flingDistance(float velocity) {
        double l = getSplineDeceleration(velocity);
        double decelMinusOne = ((double) FlingCalculatorKt.access$getDecelerationRate$p()) - 1.0d;
        return (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) FlingCalculatorKt.access$getDecelerationRate$p()) / decelMinusOne) * l));
    }

    public final FlingInfo flingInfo(float velocity) {
        double l = getSplineDeceleration(velocity);
        double decelMinusOne = ((double) FlingCalculatorKt.access$getDecelerationRate$p()) - 1.0d;
        return new FlingInfo(velocity, (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) FlingCalculatorKt.access$getDecelerationRate$p()) / decelMinusOne) * l)), (long) (Math.exp(l / decelMinusOne) * 1000.0d));
    }
}
