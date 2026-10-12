package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "time", "flingPosition-LfoxSSI", "(F)J", "FlingResult", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidFlingSpline {
    public static final AndroidFlingSpline INSTANCE = null;
    private static final int NbSamples = 100;
    private static final float[] SplinePositions = null;
    private static final float[] SplineTimes = null;

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "constructor-impl", "(J)J", "distanceCoefficient", "", "getDistanceCoefficient-impl", "(J)F", "velocityCoefficient", "getVelocityCoefficient-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class FlingResult {
        private final long packedValue;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m597boximpl(long r1) {
            return new FlingResult(r1);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m598constructorimpl(long r0) {
            return r0;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m599equalsimpl(long r4, Object r6) {
            if ((r6 instanceof FlingResult) == true) goto L6;
            return false;
        L6:
            if (r4 == ((FlingResult) r6).m605unboximpl()) goto L8;
            return false;
        L8:
            return true;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m600equalsimpl0(long r1, long r3) {
            if (r1 != r3) goto L5;
            return true;
        L5:
            return false;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m603hashCodeimpl(long r1) {
            return Long.hashCode(r1);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m604toStringimpl(long r2) {
            return "FlingResult(packedValue=" + r2 + ')';
        }

        public boolean equals(Object r3) {
            return m599equalsimpl(this.packedValue, r3);
        }

        public int hashCode() {
            return m603hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m604toStringimpl(this.packedValue);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m605unboximpl() {
            return this.packedValue;
        }

        private /* synthetic */ FlingResult(long packedValue) {
            this.packedValue = packedValue;
        }

        /* JADX INFO: renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m601getDistanceCoefficientimpl(long arg0) {
            int bits$iv$iv = (int) (arg0 >> 32);
            return Float.intBitsToFloat(bits$iv$iv);
        }

        /* JADX INFO: renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m602getVelocityCoefficientimpl(long arg0) {
            int bits$iv$iv = (int) (4294967295L & arg0);
            return Float.intBitsToFloat(bits$iv$iv);
        }
    }

    private AndroidFlingSpline() {
    }

    static {
        INSTANCE = new AndroidFlingSpline();
        SplinePositions = new float[101];
        SplineTimes = new float[101];
        float xMin = 0.0f;
        float yMin = 0.0f;
        int i = 0;
    L3:
        float r4 = 1.0f;
        if (i >= 100) goto L21;
        float alpha = i / 100.0f;
        float xMax = 1.0f;
    L6:
        float r10 = 2.0f;
        float x = xMin + ((xMax - xMin) / 2.0f);
        float r9 = 3.0f;
        float coef = (x * 3.0f) * (1.0f - x);
        float tx = ((((1.0f - x) * 0.175f) + (x * 0.35000002f)) * coef) + ((x * x) * x);
        if (Math.abs(tx - alpha) < 1.0E-5d) goto L12;
        if (tx > alpha) goto L10;
        xMin = x;
        goto L6
    L10:
        xMax = x;
        goto L6
    L12:
        SplinePositions[i] = ((((1.0f - x) * 0.5f) + x) * coef) + ((x * x) * x);
        float yMax = 1.0f;
    L13:
        float y = yMin + ((yMax - yMin) / r10);
        float coef2 = (y * r9) * (r4 - y);
        float dy = ((((r4 - y) * 0.5f) + y) * coef2) + ((y * y) * y);
        float r20 = r4;
        if (Math.abs(dy - alpha) < 1.0E-5d) goto L20;
        if (dy <= alpha) goto L18;
        yMax = y;
    L19:
        r4 = r20;
        r9 = 3.0f;
        r10 = 2.0f;
        goto L13
    L18:
        yMin = y;
        goto L19
    L20:
        SplineTimes[i] = ((((r20 - y) * 0.175f) + (0.35000002f * y)) * coef2) + ((y * y) * y);
        i = i + 1;
        goto L3
    L21:
        SplineTimes[100] = 1.0f;
        SplinePositions[100] = SplineTimes[100];
    }

    /* JADX INFO: renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m596flingPositionLfoxSSI(float time) {
        int index = (int) (100.0f * time);
        float distanceCoef = 1.0f;
        float velocityCoef = 0.0f;
        if (index >= 100) goto L5;
        float tInf = index / 100.0f;
        float tSup = (index + 1) / 100.0f;
        float dInf = SplinePositions[index];
        float dSup = SplinePositions[index + 1];
        velocityCoef = (dSup - dInf) / (tSup - tInf);
        distanceCoef = dInf + ((time - tInf) * velocityCoef);
    L5:
        long v1$iv = Float.floatToRawIntBits(distanceCoef);
        long v2$iv = Float.floatToRawIntBits(velocityCoef);
        return FlingResult.m598constructorimpl((v1$iv << 32) | (4294967295L & v2$iv));
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log(((double) (Math.abs(velocity) * 0.35f)) / ((double) friction));
    }
}
