package androidx.compose.ui.util;

import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: MathHelpers.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a)\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a)\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0001\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\r*\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0013H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0001H\u0086\b¨\u0006\u001a"}, d2 = {"fastCbrt", "", "x", "fastMaxOf", "a", "b", "c", "d", "fastMinOf", "lerp", "start", "stop", "fraction", "", "", "normalizedAngleCos", "normalizedDegrees", "normalizedAngleSin", "fastCoerceAtLeast", "", "minimumValue", "fastCoerceAtMost", "maximumValue", "fastCoerceIn", "fastIsFinite", "", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MathHelpersKt {
    public static final float lerp(float start, float stop, float fraction) {
        return ((1.0f - fraction) * start) + (fraction * stop);
    }

    public static final int lerp(int start, int stop, float fraction) {
        double $this$fastRoundToInt$iv = ((double) (stop - start)) * ((double) fraction);
        return ((int) Math.round($this$fastRoundToInt$iv)) + start;
    }

    public static final long lerp(long start, long stop, float fraction) {
        return MathKt.roundToLong((stop - start) * ((double) fraction)) + start;
    }

    public static final float fastMinOf(float a, float b, float c, float d) {
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }

    public static final float fastMaxOf(float a, float b, float c, float d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static final float fastCoerceIn(float $this$fastCoerceIn, float minimumValue, float maximumValue) {
        float $this$fastCoerceAtLeast$iv = $this$fastCoerceIn;
        if ($this$fastCoerceAtLeast$iv >= minimumValue) goto L6;
        $this$fastCoerceAtLeast$iv = minimumValue;
    L6:
        if ($this$fastCoerceAtLeast$iv > maximumValue) goto L8;
        return $this$fastCoerceAtLeast$iv;
    L8:
        return maximumValue;
    }

    public static final float fastCoerceAtLeast(float $this$fastCoerceAtLeast, float minimumValue) {
        if ($this$fastCoerceAtLeast >= minimumValue) goto L6;
        return minimumValue;
    L6:
        return $this$fastCoerceAtLeast;
    }

    public static final float fastCoerceAtMost(float $this$fastCoerceAtMost, float maximumValue) {
        if ($this$fastCoerceAtMost <= maximumValue) goto L6;
        return maximumValue;
    L6:
        return $this$fastCoerceAtMost;
    }

    public static final double fastCoerceIn(double $this$fastCoerceIn, double minimumValue, double maximumValue) {
        double $this$fastCoerceAtLeast$iv = $this$fastCoerceIn;
        if ($this$fastCoerceAtLeast$iv >= minimumValue) goto L6;
        $this$fastCoerceAtLeast$iv = minimumValue;
    L6:
        if ($this$fastCoerceAtLeast$iv > maximumValue) goto L8;
        return $this$fastCoerceAtLeast$iv;
    L8:
        return maximumValue;
    }

    public static final double fastCoerceAtLeast(double $this$fastCoerceAtLeast, double minimumValue) {
        if ($this$fastCoerceAtLeast >= minimumValue) goto L6;
        return minimumValue;
    L6:
        return $this$fastCoerceAtLeast;
    }

    public static final double fastCoerceAtMost(double $this$fastCoerceAtMost, double maximumValue) {
        if ($this$fastCoerceAtMost <= maximumValue) goto L6;
        return maximumValue;
    L6:
        return $this$fastCoerceAtMost;
    }

    public static final int fastCoerceIn(int $this$fastCoerceIn, int minimumValue, int maximumValue) {
        int $this$fastCoerceAtLeast$iv = $this$fastCoerceIn;
        if ($this$fastCoerceAtLeast$iv >= minimumValue) goto L6;
        $this$fastCoerceAtLeast$iv = minimumValue;
    L6:
        if ($this$fastCoerceAtLeast$iv > maximumValue) goto L8;
        return $this$fastCoerceAtLeast$iv;
    L8:
        return maximumValue;
    }

    public static final int fastCoerceAtLeast(int $this$fastCoerceAtLeast, int minimumValue) {
        if ($this$fastCoerceAtLeast >= minimumValue) goto L6;
        return minimumValue;
    L6:
        return $this$fastCoerceAtLeast;
    }

    public static final int fastCoerceAtMost(int $this$fastCoerceAtMost, int maximumValue) {
        if ($this$fastCoerceAtMost <= maximumValue) goto L6;
        return maximumValue;
    L6:
        return $this$fastCoerceAtMost;
    }

    public static final long fastCoerceIn(long $this$fastCoerceIn, long minimumValue, long maximumValue) {
        long $this$fastCoerceAtLeast$iv = $this$fastCoerceIn;
        if ($this$fastCoerceAtLeast$iv >= minimumValue) goto L6;
        $this$fastCoerceAtLeast$iv = minimumValue;
    L6:
        if ($this$fastCoerceAtLeast$iv > maximumValue) goto L8;
        return $this$fastCoerceAtLeast$iv;
    L8:
        return maximumValue;
    }

    public static final long fastCoerceAtLeast(long $this$fastCoerceAtLeast, long minimumValue) {
        if ($this$fastCoerceAtLeast >= minimumValue) goto L6;
        return minimumValue;
    L6:
        return $this$fastCoerceAtLeast;
    }

    public static final long fastCoerceAtMost(long $this$fastCoerceAtMost, long maximumValue) {
        if ($this$fastCoerceAtMost <= maximumValue) goto L6;
        return maximumValue;
    L6:
        return $this$fastCoerceAtMost;
    }

    public static final boolean fastIsFinite(float $this$fastIsFinite) {
        if ((Float.floatToRawIntBits($this$fastIsFinite) & Integer.MAX_VALUE) >= 2139095040) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean fastIsFinite(double $this$fastIsFinite) {
        if ((Double.doubleToRawLongBits($this$fastIsFinite) & Long.MAX_VALUE) >= 9218868437227405312L) goto L5;
        return true;
    L5:
        return false;
    }

    public static final float fastCbrt(float x) {
        long v = ((long) Float.floatToRawIntBits(x)) & 8589934591L;
        int bits$iv = ((int) (v / 3)) + 709952852;
        float estimate = Float.intBitsToFloat(bits$iv);
        float estimate2 = estimate - ((estimate - (x / (estimate * estimate))) * 0.33333334f);
        return estimate2 - ((estimate2 - (x / (estimate2 * estimate2))) * 0.33333334f);
    }

    public static final float normalizedAngleSin(float normalizedDegrees) {
        float degrees = normalizedDegrees - ((float) Math.floor(0.5f + normalizedDegrees));
        float x = Math.abs(degrees) * 2.0f;
        float a = 1.0f - x;
        return ((8.0f * degrees) * a) / (1.25f - (x * a));
    }

    public static final float normalizedAngleCos(float normalizedDegrees) {
        float normalizedDegrees$iv = 0.25f + normalizedDegrees;
        float degrees$iv = normalizedDegrees$iv - ((float) Math.floor(0.5f + normalizedDegrees$iv));
        float x$iv = Math.abs(degrees$iv) * 2.0f;
        float a$iv = 1.0f - x$iv;
        return ((8.0f * degrees$iv) * a$iv) / (1.25f - (x$iv * a$iv));
    }
}
