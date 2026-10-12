package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a(\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\u0019\u001a(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0082\b\u001a2\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u0015H\u0000\u001a\u0012\u0010&\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*\u001a\u0014\u0010+\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010,\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010-\u001a\u00020\u0003*\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0002\u001a,\u0010/\u001a\u00020\u0003*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0082\n¢\u0006\u0002\u00103\u001a\r\u00104\u001a\u00020\u0003*\u00020\u0015H\u0082\b\u001a4\u00105\u001a\u00020'*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u0003H\u0082\n¢\u0006\u0002\u00107\u001a1\u00105\u001a\u00020'*\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00142\u0006\u00109\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010<\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\",\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\",\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e*\u0018\b\u0002\u0010\u0013\"\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0012\u0004\u0012\u00020\u00150\u0014*\f\b\u0002\u0010=\"\u00020\u00152\u00020\u0015¨\u0006>"}, d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "<set-?>", "", "VelocityTrackerAddPointsFix", "getVelocityTrackerAddPointsFix$annotations", "()V", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "VelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "getVelocityTrackerStrategyUseImpulse", "setVelocityTrackerStrategyUseImpulse", "Matrix", "", "", "Landroidx/compose/ui/input/pointer/util/Vector;", "rows", "cols", "(II)[[F", "calculateImpulseVelocity", "dataPoints", "time", "sampleCount", "isDataDifferential", "kineticEnergyToVelocity", "kineticEnergy", "polyFitLeastSquares", "x", "y", "degree", "coefficients", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "addPointerInputChangeLegacy", "addPointerInputChangeWithFix", "dot", "a", "get", "Landroidx/compose/ui/input/pointer/util/Matrix;", "row", "col", "([[FII)F", "norm", "set", "value", "([[FIIF)V", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "index", "", "dataPoint", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "Vector", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static boolean VelocityTrackerAddPointsFix;
    private static boolean VelocityTrackerStrategyUseImpulse;

    public static final /* synthetic */ float access$calculateImpulseVelocity(float[] dataPoints, float[] time, int sampleCount, boolean isDataDifferential) {
        return calculateImpulseVelocity(dataPoints, time, sampleCount, isDataDifferential);
    }

    public static final /* synthetic */ void access$set(DataPointAtTime[] $receiver, int index, long time, float dataPoint) {
        set($receiver, index, time, dataPoint);
    }

    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }

    public static /* synthetic */ void getVelocityTrackerStrategyUseImpulse$annotations() {
    }

    private static final void set(DataPointAtTime[] $this$set, int index, long time, float dataPoint) {
        DataPointAtTime currentEntry = $this$set[index];
        if (currentEntry != null) goto L5;
        $this$set[index] = new DataPointAtTime(time, dataPoint);
        return;
    L5:
        currentEntry.setTime(time);
        currentEntry.setDataPoint(dataPoint);
    }

    public static final void addPointerInputChange(VelocityTracker $this$addPointerInputChange, PointerInputChange event) {
        if (VelocityTrackerAddPointsFix == false) goto L5;
        addPointerInputChangeWithFix($this$addPointerInputChange, event);
        return;
    L5:
        addPointerInputChangeLegacy($this$addPointerInputChange, event);
    }

    private static final void addPointerInputChangeLegacy(VelocityTracker $this$addPointerInputChangeLegacy, PointerInputChange event) {
        if (PointerEventKt.changedToDownIgnoreConsumed(event) == false) goto L5;
        $this$addPointerInputChangeLegacy.m5689setCurrentPointerPositionAccumulatork4lQ0M$ui_release(event.m5589getPositionF1C5BW0());
        $this$addPointerInputChangeLegacy.resetTracking();
    L5:
        long previousPointerPosition = event.m5590getPreviousPositionF1C5BW0();
        List<HistoricalChange> r3 = event.getHistorical();
        int index$iv = 0;
        int r6 = r3.size();
    L6:
        if (index$iv >= r6) goto L8;
        Object item$iv = r3.get(index$iv);
        HistoricalChange it = (HistoricalChange) item$iv;
        long historicalDelta = Offset.m4129minusMKHz9U(it.m5513getPositionF1C5BW0(), previousPointerPosition);
        previousPointerPosition = it.m5513getPositionF1C5BW0();
        $this$addPointerInputChangeLegacy.m5689setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m4130plusMKHz9U($this$addPointerInputChangeLegacy.m5688getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), historicalDelta));
        $this$addPointerInputChangeLegacy.m5685addPositionUv8p0NA(it.getUptimeMillis(), $this$addPointerInputChangeLegacy.m5688getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
        index$iv = index$iv + 1;
        goto L6
    L8:
        long delta = Offset.m4129minusMKHz9U(event.m5589getPositionF1C5BW0(), previousPointerPosition);
        $this$addPointerInputChangeLegacy.m5689setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m4130plusMKHz9U($this$addPointerInputChangeLegacy.m5688getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), delta));
        $this$addPointerInputChangeLegacy.m5685addPositionUv8p0NA(event.getUptimeMillis(), $this$addPointerInputChangeLegacy.m5688getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker $this$addPointerInputChangeWithFix, PointerInputChange event) {
        if (PointerEventKt.changedToDownIgnoreConsumed(event) == false) goto L6;
        $this$addPointerInputChangeWithFix.resetTracking();
    L6:
        if (PointerEventKt.changedToUpIgnoreConsumed(event) == true) goto L12;
        List<HistoricalChange> r0 = event.getHistorical();
        int index$iv = 0;
        int r3 = r0.size();
    L8:
        if (index$iv >= r3) goto L10;
        Object item$iv = r0.get(index$iv);
        HistoricalChange it = (HistoricalChange) item$iv;
        $this$addPointerInputChangeWithFix.m5685addPositionUv8p0NA(it.getUptimeMillis(), it.m5512getOriginalEventPositionF1C5BW0$ui_release());
        index$iv = index$iv + 1;
        goto L8
    L10:
        $this$addPointerInputChangeWithFix.m5685addPositionUv8p0NA(event.getUptimeMillis(), event.m5588getOriginalEventPositionF1C5BW0$ui_release());
    L12:
        if (PointerEventKt.changedToUpIgnoreConsumed(event) == true) goto L14;
    L16:
        $this$addPointerInputChangeWithFix.setLastMoveEventTimeStamp$ui_release(event.getUptimeMillis());
        return;
    L14:
        if ((event.getUptimeMillis() - $this$addPointerInputChangeWithFix.getLastMoveEventTimeStamp$ui_release()) <= 40) goto L16;
        $this$addPointerInputChangeWithFix.resetTracking();
        goto L16
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] r0, float[] r1, int r2, int r3, float[] r4, int r5, Object r6) {
        if ((r5 & 16) == 0) goto L6;
        r4 = new float[RangesKt.coerceAtLeast(r3 + 1, 0)];
    L6:
        return polyFitLeastSquares(r0, r1, r2, r3, r4);
    }

    public static final float[] polyFitLeastSquares(float[] x, float[] y, int sampleCount, int degree, float[] coefficients) {
        if (degree >= 1) goto L5;
        InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
    L5:
        if (sampleCount != 0) goto L7;
        InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
    L7:
        if (degree < sampleCount) goto L9;
        int truncatedDegree = sampleCount - 1;
    L10:
        int n = truncatedDegree + 1;
        float[][] a = new float[n][];
        int r8 = 0;
    L11:
        if (r8 >= n) goto L13;
        a[r8] = new float[sampleCount];
        r8 = r8 + 1;
        goto L11
    L13:
        int h = 0;
    L14:
        if (h >= sampleCount) goto L19;
        a[0][h] = 1.0f;
        int i = 1;
    L16:
        if (i >= n) goto L18;
        int row$iv = i - 1;
        float value$iv = a[row$iv][h] * x[h];
        a[i][h] = value$iv;
        i = i + 1;
        goto L16
    L18:
        h = h + 1;
        goto L14
    L19:
        float[][] q = new float[n][];
        int r9 = 0;
    L20:
        if (r9 >= n) goto L22;
        q[r9] = new float[sampleCount];
        r9 = r9 + 1;
        goto L20
    L22:
        float[][] r = new float[n][];
        int r10 = 0;
    L23:
        if (r10 >= n) goto L25;
        r[r10] = new float[n];
        r10 = r10 + 1;
        goto L23
    L25:
        int j = 0;
    L26:
        if (j >= n) goto L47;
        float[] w = q[j];
        ArraysKt.copyInto(a[j], w, 0, 0, sampleCount);
        int i2 = 0;
    L28:
        if (i2 >= j) goto L33;
        float[] z = q[i2];
        float dot = dot(w, z);
        int h2 = 0;
    L30:
        if (h2 >= sampleCount) goto L32;
        w[h2] = w[h2] - (z[h2] * dot);
        h2 = h2 + 1;
        goto L30
    L32:
        i2 = i2 + 1;
        goto L28
    L33:
        float $this$fastCoerceAtLeast$iv = (float) Math.sqrt(dot(w, w));
        float minimumValue$iv = 1.0E-6f;
        if ($this$fastCoerceAtLeast$iv < 1.0E-6f) goto L37;
        minimumValue$iv = $this$fastCoerceAtLeast$iv;
    L37:
        float inverseNorm = 1.0f / minimumValue$iv;
        int h3 = 0;
    L38:
        if (h3 >= sampleCount) goto L40;
        w[h3] = w[h3] * inverseNorm;
        h3 = h3 + 1;
        goto L38
    L40:
        float[] v = r[j];
        int i3 = 0;
    L41:
        if (i3 >= n) goto L46;
        if (i3 >= j) goto L44;
        float r14 = 0.0f;
    L45:
        v[i3] = r14;
        i3 = i3 + 1;
        goto L41
    L44:
        r14 = dot(w, a[i3]);
        goto L45
    L46:
        j = j + 1;
        goto L26
    L47:
        int i4 = n - 1;
    L49:
        if ((-1) >= i4) goto L56;
        float c = dot(q[i4], y);
        float[] ri = r[i4];
        int j2 = n - 1;
        int r13 = i4 + 1;
        if (r13 > j2) goto L55;
    L52:
        c = c - (ri[j2] * coefficients[j2]);
        if (j2 == r13) goto L55;
        j2 = j2 - 1;
    L55:
        coefficients[i4] = c / ri[i4];
        i4 = i4 - 1;
        goto L49
    L56:
        return coefficients;
    L9:
        truncatedDegree = degree;
        goto L10
    }

    private static final float calculateImpulseVelocity(float[] dataPoints, float[] time, int sampleCount, boolean isDataDifferential) {
        float work = 0.0f;
        int start = sampleCount - 1;
        float nextTime = time[start];
        int i = start;
    L4:
        if (i <= 0) goto L19;
        float currentTime = nextTime;
        nextTime = time[i - 1];
        if (currentTime != nextTime) goto L8;
        boolean r6 = true;
    L9:
        if (r6 == true) goto L17;
        if (isDataDifferential == false) goto L13;
        float dataPointsDelta = -dataPoints[i - 1];
    L14:
        float vCurr = dataPointsDelta / (currentTime - nextTime);
        float vPrev = Math.signum(work) * ((float) Math.sqrt(2.0f * Math.abs(work)));
        work = work + ((vCurr - vPrev) * Math.abs(vCurr));
        if (i != start) goto L17;
        work = work * 0.5f;
        goto L17
    L13:
        dataPointsDelta = dataPoints[i] - dataPoints[i - 1];
    L17:
        i = i - 1;
        goto L4
    L8:
        r6 = false;
        goto L9
    L19:
        return Math.signum(work) * ((float) Math.sqrt(2.0f * Math.abs(work)));
    }

    private static final float kineticEnergyToVelocity(float kineticEnergy) {
        return Math.signum(kineticEnergy) * ((float) Math.sqrt(2.0f * Math.abs(kineticEnergy)));
    }

    private static final float dot(float[] $this$dot, float[] a) {
        float result = 0.0f;
        int i = 0;
        int r2 = $this$dot.length;
    L3:
        if (i >= r2) goto L5;
        result = result + ($this$dot[i] * a[i]);
        i = i + 1;
        goto L3
    L5:
        return result;
    }

    private static final float norm(float[] $this$norm) {
        return (float) Math.sqrt(dot($this$norm, $this$norm));
    }

    private static final float[][] Matrix(int rows, int cols) {
        float[][] r1 = new float[rows][];
        int r2 = 0;
    L3:
        if (r2 >= rows) goto L5;
        r1[r2] = new float[cols];
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    private static final float get(float[][] $this$get, int row, int col) {
        return $this$get[row][col];
    }

    private static final void set(float[][] $this$set, int row, int col, float value) {
        $this$set[row][col] = value;
    }

    static {
        VelocityTrackerAddPointsFix = true;
    }

    public static final boolean getVelocityTrackerAddPointsFix() {
        return VelocityTrackerAddPointsFix;
    }

    public static final void setVelocityTrackerAddPointsFix(boolean r0) {
        VelocityTrackerAddPointsFix = r0;
    }

    public static final boolean getVelocityTrackerStrategyUseImpulse() {
        return VelocityTrackerStrategyUseImpulse;
    }

    public static final void setVelocityTrackerStrategyUseImpulse(boolean r0) {
        VelocityTrackerStrategyUseImpulse = r0;
    }
}
