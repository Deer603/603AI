package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "time", "FlingResult", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidFlingSpline {
    public static final int $stable = 0;
    public static final AndroidFlingSpline INSTANCE = null;
    private static final int NbSamples = 100;
    private static final float[] SplinePositions = null;
    private static final float[] SplineTimes = null;

    /* JADX INFO: compiled from: SplineBasedDecay.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AndroidFlingSpline$FlingResult;", "", "distanceCoefficient", "", "velocityCoefficient", "(FF)V", "getDistanceCoefficient", "()F", "getVelocityCoefficient", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FlingResult {
        public static final int $stable = 0;
        private final float distanceCoefficient;
        private final float velocityCoefficient;

        static {
        }

        public static /* synthetic */ FlingResult copy$default(FlingResult r0, float r1, float r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.distanceCoefficient;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.velocityCoefficient;
        L9:
            return r0.copy(r1, r2);
        }

        public final float component1() {
            return this.distanceCoefficient;
        }

        public final float component2() {
            return this.velocityCoefficient;
        }

        public final FlingResult copy(float r2, float r3) {
            return new FlingResult(r2, r3);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof FlingResult) == true) goto L8;
            return false;
        L8:
            FlingResult r1 = (FlingResult) r6;
            if (Float.compare(this.distanceCoefficient, r1.distanceCoefficient) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.velocityCoefficient, r1.velocityCoefficient) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Float.hashCode(this.distanceCoefficient) * 31) + Float.hashCode(this.velocityCoefficient);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
        }

        public FlingResult(float distanceCoefficient, float velocityCoefficient) {
            this.distanceCoefficient = distanceCoefficient;
            this.velocityCoefficient = velocityCoefficient;
        }

        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }
    }

    private AndroidFlingSpline() {
    }

    static {
        INSTANCE = new AndroidFlingSpline();
        SplinePositions = new float[101];
        SplineTimes = new float[101];
        SplineBasedDecayKt.access$computeSplineInfo(SplinePositions, SplineTimes, 100);
        $stable = 8;
    }

    public final FlingResult flingPosition(float time) {
        float clampedTime = RangesKt.coerceIn(time, 0.0f, 1.0f);
        int index = (int) (100.0f * clampedTime);
        float distanceCoef = 1.0f;
        float velocityCoef = 0.0f;
        if (index >= 100) goto L6;
        float tInf = index / 100.0f;
        float tSup = (index + 1) / 100.0f;
        float dInf = SplinePositions[index];
        float dSup = SplinePositions[index + 1];
        velocityCoef = (dSup - dInf) / (tSup - tInf);
        distanceCoef = dInf + ((clampedTime - tInf) * velocityCoef);
    L6:
        return new FlingResult(distanceCoef, velocityCoef);
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log(((double) (Math.abs(velocity) * 0.35f)) / ((double) friction));
    }
}
