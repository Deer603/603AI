package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: MonoSpline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "time", "", "y", "", "periodicBias", "", "([F[[FF)V", "slopeTemp", "tangents", "[[F", "timePoints", "values", "getPos", "", "v", "Landroidx/compose/animation/core/AnimationVector;", "index", "", "t", "j", "getSlope", "makeFloatArray", "a", "b", "(II)[[F", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MonoSpline {
    public static final int $stable = 0;
    private final float[] slopeTemp;
    private final float[][] tangents;
    private final float[] timePoints;
    private final float[][] values;

    static {
        $stable = 8;
    }

    public MonoSpline(float[] time, float[][] y, float periodicBias) {
        int n = time.length;
        boolean r4 = false;
        int dim = y[0].length;
        this.slopeTemp = new float[dim];
        float[][] slope = makeFloatArray(n - 1, dim);
        float[][] tangent = makeFloatArray(n, dim);
        int j = 0;
    L3:
        if (j >= dim) goto L13;
        int i = 0;
        int r10 = n - 1;
    L5:
        if (i >= r10) goto L11;
        float dt = time[i + 1] - time[i];
        slope[i][j] = (y[i + 1][j] - y[i][j]) / dt;
        if (i != 0) goto L9;
        tangent[i][j] = slope[i][j];
    L10:
        i = i + 1;
        goto L5
    L9:
        tangent[i][j] = (slope[i - 1][j] + slope[i][j]) * 0.5f;
        goto L10
    L11:
        int i2 = n - 1;
        tangent[i2][j] = slope[n - 2][j];
        j = j + 1;
        goto L3
    L13:
        if (Float.isNaN(periodicBias) == true) goto L17;
        int j2 = 0;
    L15:
        if (j2 >= dim) goto L17;
        float adjustedSlope = (slope[n - 2][j2] * (1.0f - periodicBias)) + (slope[0][j2] * periodicBias);
        slope[0][j2] = adjustedSlope;
        slope[n - 2][j2] = adjustedSlope;
        tangent[n - 1][j2] = adjustedSlope;
        tangent[0][j2] = adjustedSlope;
        j2 = j2 + 1;
    L17:
        int i3 = 0;
        int r9 = n - 1;
    L18:
        if (i3 >= r9) goto L32;
        int j3 = 0;
    L20:
        if (j3 >= dim) goto L31;
        if (slope[i3][j3] != 0.0f) goto L24;
        boolean r11 = true;
    L25:
        if (r11 == false) goto L27;
        tangent[i3][j3] = 0.0f;
        tangent[i3 + 1][j3] = 0.0f;
        int dim2 = dim;
    L30:
        j3 = j3 + 1;
        dim = dim2;
        r4 = false;
        goto L20
    L27:
        float a = tangent[i3][j3] / slope[i3][j3];
        float b = tangent[i3 + 1][j3] / slope[i3][j3];
        dim2 = dim;
        float h = (float) Math.hypot(a, b);
        if (h <= 9.0d) goto L30;
        float t = 3.0f / h;
        tangent[i3][j3] = (t * a) * slope[i3][j3];
        tangent[i3 + 1][j3] = (t * b) * slope[i3][j3];
        goto L30
    L24:
        r11 = r4;
        goto L25
    L31:
        i3 = i3 + 1;
        r4 = false;
        goto L18
    L32:
        this.timePoints = time;
        this.values = y;
        this.tangents = tangent;
    }

    private final float[][] makeFloatArray(int a, int b) {
        float[][] r0 = new float[a][];
        int r1 = 0;
    L3:
        if (r1 >= a) goto L5;
        r0[r1] = new float[b];
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }

    public final float getPos(float t, int j) {
        float[][] values = this.values;
        float[][] tangents = this.tangents;
        int n = this.timePoints.length;
        if (t > this.timePoints[0]) goto L6;
        int index = 0;
    L10:
        if (index != (-1)) goto L12;
        int i = 0;
        int r6 = n - 1;
    L14:
        if (i >= r6) goto L27;
        if (t != this.timePoints[i]) goto L18;
        boolean r7 = true;
    L19:
        if (r7 == true) goto L21;
        if (t < this.timePoints[i + 1]) goto L24;
        i = i + 1;
        goto L14
    L24:
        float h = this.timePoints[i + 1] - this.timePoints[i];
        float x = (t - this.timePoints[i]) / h;
        float y1 = values[i][j];
        float y2 = values[i + 1][j];
        float t1 = tangents[i][j];
        float t2 = tangents[i + 1][j];
        return MonoSplineKt.hermiteInterpolate(h, x, y1, y2, t1, t2);
    L21:
        return values[i][j];
    L18:
        r7 = false;
        goto L19
    L27:
        return 0.0f;
    L12:
        return values[index][j] + ((t - this.timePoints[index]) * getSlope(this.timePoints[index], j));
    L6:
        if (t < this.timePoints[n - 1]) goto L8;
        index = n - 1;
        goto L10
    L8:
        index = -1;
        goto L10
    }

    public static /* synthetic */ void getPos$default(MonoSpline r0, float r1, AnimationVector r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        r0.getPos(r1, r2, r3);
    }

    public final void getPos(float time, AnimationVector v, int index) {
        int n = this.timePoints.length;
        int dim = this.values[0].length;
        if (time > this.timePoints[0]) goto L6;
        int k = 0;
    L10:
        if (k == (-1)) goto L15;
        getSlope(this.timePoints[k], this.slopeTemp);
        int j = 0;
    L12:
        if (j >= dim) goto L14;
        v.set$animation_core_release(j, this.values[k][j] + ((time - this.timePoints[k]) * this.slopeTemp[j]));
        j = j + 1;
        goto L12
    L14:
        return;
    L15:
        int i = index;
        int r5 = n - 1;
    L16:
        if (i >= r5) goto L33;
        if (time != this.timePoints[i]) goto L20;
        boolean r6 = true;
    L21:
        if (r6 == true) goto L22;
        if (time < this.timePoints[i + 1]) goto L28;
        i = i + 1;
        goto L16
    L28:
        float h = this.timePoints[i + 1] - this.timePoints[i];
        float x = (time - this.timePoints[i]) / h;
        int j2 = 0;
    L29:
        if (j2 >= dim) goto L31;
        float y1 = this.values[i][j2];
        float y2 = this.values[i + 1][j2];
        float t1 = this.tangents[i][j2];
        float t2 = this.tangents[i + 1][j2];
        v.set$animation_core_release(j2, MonoSplineKt.hermiteInterpolate(h, x, y1, y2, t1, t2));
        j2 = j2 + 1;
        goto L29
    L31:
        return;
    L22:
        int j3 = 0;
    L23:
        if (j3 >= dim) goto L25;
        v.set$animation_core_release(j3, this.values[i][j3]);
        j3 = j3 + 1;
        goto L23
    L25:
        return;
    L20:
        r6 = false;
        goto L21
    L33:
        return;
    L6:
        if (time < this.timePoints[n - 1]) goto L8;
        k = n - 1;
        goto L10
    L8:
        k = -1;
        goto L10
    }

    private final void getSlope(float time, float[] v) {
        int dim = this.values[0].length;
        int n = this.timePoints.length;
        float minimumValue$iv = this.timePoints[0];
        float maximumValue$iv = this.timePoints[n - 1];
        float $this$fastCoerceAtLeast$iv$iv = time;
        if ($this$fastCoerceAtLeast$iv$iv >= minimumValue$iv) goto L6;
        $this$fastCoerceAtLeast$iv$iv = minimumValue$iv;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= maximumValue$iv) goto L9;
        $this$fastCoerceAtLeast$iv$iv = maximumValue$iv;
    L9:
        if (v.length >= dim) goto L11;
        return;
    L11:
        int i = 0;
        int r3 = n - 1;
    L12:
        if (i >= r3) goto L20;
        if ($this$fastCoerceAtLeast$iv$iv <= this.timePoints[i + 1]) goto L15;
        i = i + 1;
        goto L12
    L15:
        float h = this.timePoints[i + 1] - this.timePoints[i];
        float x = ($this$fastCoerceAtLeast$iv$iv - this.timePoints[i]) / h;
        int j = 0;
    L16:
        if (j >= dim) goto L24;
        float y1 = this.values[i][j];
        float y2 = this.values[i + 1][j];
        float t1 = this.tangents[i][j];
        float t2 = this.tangents[i + 1][j];
        v[j] = MonoSplineKt.hermiteDifferential(h, x, y1, y2, t1, t2) / h;
        j = j + 1;
        goto L16
    L24:
        return;
    }

    public static /* synthetic */ void getSlope$default(MonoSpline r0, float r1, AnimationVector r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        r0.getSlope(r1, r2, r3);
    }

    public final void getSlope(float time, AnimationVector v, int index) {
        float[] timePoints = this.timePoints;
        float[][] values = this.values;
        float[][] tangents = this.tangents;
        int n = timePoints.length;
        int tangentIndex = 0;
        int dim = values[0].length;
        if (time > timePoints[0]) goto L6;
    L10:
        if (tangentIndex == (-1)) goto L18;
        float[] tangent = tangents[tangentIndex];
        if (tangent.length >= dim) goto L14;
        return;
    L14:
        int j = 0;
    L15:
        if (j >= dim) goto L17;
        v.set$animation_core_release(j, tangent[j]);
        j = j + 1;
        goto L15
    L17:
        return;
    L18:
        int i = index;
        int r9 = n - 1;
    L19:
        if (i >= r9) goto L27;
        if (time <= timePoints[i + 1]) goto L22;
        i = i + 1;
        goto L19
    L22:
        float h = timePoints[i + 1] - timePoints[i];
        float x = (time - timePoints[i]) / h;
        int j2 = 0;
    L23:
        if (j2 >= dim) goto L32;
        float y1 = values[i][j2];
        float y2 = values[i + 1][j2];
        float t1 = tangents[i][j2];
        float t2 = tangents[i + 1][j2];
        v.set$animation_core_release(j2, MonoSplineKt.hermiteDifferential(h, x, y1, y2, t1, t2) / h);
        j2 = j2 + 1;
        goto L23
    L32:
        return;
    L27:
        return;
    L6:
        if (time < timePoints[n - 1]) goto L8;
        tangentIndex = n - 1;
        goto L10
    L8:
        tangentIndex = -1;
        goto L10
    }

    private final float getSlope(float time, int j) {
        float[] timePoints = this.timePoints;
        float[][] values = this.values;
        float[][] tangents = this.tangents;
        int n = timePoints.length;
        float minimumValue$iv = timePoints[0];
        float maximumValue$iv = timePoints[n - 1];
        float $this$fastCoerceAtLeast$iv$iv = time;
        if ($this$fastCoerceAtLeast$iv$iv >= minimumValue$iv) goto L6;
        $this$fastCoerceAtLeast$iv$iv = minimumValue$iv;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= maximumValue$iv) goto L8;
        $this$fastCoerceAtLeast$iv$iv = maximumValue$iv;
    L8:
        int i = 0;
        int r6 = n - 1;
    L9:
        if (i >= r6) goto L15;
        if ($this$fastCoerceAtLeast$iv$iv <= timePoints[i + 1]) goto L12;
        i = i + 1;
        goto L9
    L12:
        float y1 = values[i][j];
        float y2 = values[i + 1][j];
        float t1 = tangents[i][j];
        float t2 = tangents[i + 1][j];
        float h = timePoints[i + 1] - timePoints[i];
        float x = ($this$fastCoerceAtLeast$iv$iv - timePoints[i]) / h;
        return MonoSplineKt.hermiteDifferential(h, x, y1, y2, t1, t2) / h;
    L15:
        return 0.0f;
    }
}
