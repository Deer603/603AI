package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\tH\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "isDataDifferential", "", "(Z)V", "strategy", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "(ZLandroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;)V", "index", "", "()Z", "minSampleSize", "reusableDataPointsArray", "", "reusableTimeArray", "reusableVelocityCoefficients", "samples", "", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "[Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "addDataPoint", "", "timeMillis", "", "dataPoint", "", "calculateLeastSquaresVelocity", "dataPoints", "time", "sampleCount", "calculateVelocity", "maximumVelocity", "resetTracking", "Strategy", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VelocityTracker1D {
    public static final int $stable = 0;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;
    private final float[] reusableDataPointsArray;
    private final float[] reusableTimeArray;
    private final float[] reusableVelocityCoefficients;
    private final DataPointAtTime[] samples;
    private final Strategy strategy;

    /* JADX INFO: compiled from: VelocityTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final enum Strategy extends Enum<Strategy> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ Strategy[] $VALUES = null;
        public static final Strategy Impulse = null;
        public static final Strategy Lsq2 = null;

        private static final /* synthetic */ Strategy[] $values() {
            return new Strategy[]{Lsq2, Impulse};
        }

        public static EnumEntries<Strategy> getEntries() {
            return $ENTRIES;
        }

        public static Strategy valueOf(String r1) {
            return (Strategy) Enum.valueOf(Strategy.class, r1);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }

        private Strategy(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            Lsq2 = new Strategy("Lsq2", 0);
            Impulse = new Strategy("Impulse", 1);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    /* JADX INFO: compiled from: VelocityTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Strategy.values().length];
            r0[Strategy.Impulse.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[Strategy.Lsq2.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VelocityTracker1D() {
        boolean r2 = false;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public VelocityTracker1D(boolean isDataDifferential, Strategy strategy) {
        this.isDataDifferential = isDataDifferential;
        this.strategy = strategy;
        if (this.isDataDifferential == false) goto L10;
        if (this.strategy.equals(Strategy.Lsq2) == false) goto L10;
        throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
    L10:
        switch(WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()]) {
            case 1: goto L14;
            case 2: goto L13;
            default: goto L12;
        };
    L13:
        int r0 = 3;
    L15:
        this.minSampleSize = r0;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
        return;
    L14:
        r0 = 2;
        goto L15
    L12:
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ VelocityTracker1D(boolean r1, Strategy r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = Strategy.Lsq2;
    L8:
        this(r1, r2);
    }

    public final boolean isDataDifferential() {
        return this.isDataDifferential;
    }

    public VelocityTracker1D(boolean isDataDifferential) {
        this(isDataDifferential, Strategy.Impulse);
    }

    public final void addDataPoint(long timeMillis, float dataPoint) {
        this.index = (this.index + 1) % 20;
        VelocityTrackerKt.access$set(this.samples, this.index, timeMillis, dataPoint);
    }

    public final float calculateVelocity() {
        float[] dataPoints = this.reusableDataPointsArray;
        float[] time = this.reusableTimeArray;
        int sampleCount = 0;
        int index = this.index;
        DataPointAtTime newestSample = this.samples[index];
        if (newestSample != null) goto L5;
        return 0.0f;
    L5:
        DataPointAtTime previousSample = newestSample;
    L6:
        DataPointAtTime sample = this.samples[index];
        if (sample == null) goto L30;
        float age = newestSample.getTime() - sample.getTime();
        float delta = Math.abs(sample.getTime() - previousSample.getTime());
        if (this.strategy != Strategy.Lsq2) goto L12;
    L15:
        DataPointAtTime r10 = sample;
    L16:
        previousSample = r10;
        if (age > 100.0f) goto L30;
        if (delta > 40.0f) goto L30;
        dataPoints[sampleCount] = sample.getDataPoint();
        time[sampleCount] = -age;
        if (index != 0) goto L24;
        int r11 = 20;
    L25:
        index = r11 - 1;
        sampleCount = sampleCount + 1;
        if (sampleCount < 20) goto L6;
    L24:
        r11 = index;
        goto L25
    L12:
        if (this.isDataDifferential == true) goto L15;
        r10 = newestSample;
    L30:
        if (sampleCount >= this.minSampleSize) goto L32;
        return 0.0f;
    L32:
        switch(WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()]) {
            case 1: goto L36;
            case 2: goto L35;
            default: goto L34;
        };
    L35:
        float r5 = calculateLeastSquaresVelocity(dataPoints, time, sampleCount);
    L38:
        return r5 * 1000.0f;
    L36:
        r5 = VelocityTrackerKt.access$calculateImpulseVelocity(dataPoints, time, sampleCount, this.isDataDifferential);
        goto L38
    L34:
        throw new NoWhenBranchMatchedException();
    }

    public final float calculateVelocity(float maximumVelocity) {
        boolean r2 = true;
        if (maximumVelocity <= 0.0f) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + maximumVelocity);
    L9:
        float velocity = calculateVelocity();
        if (velocity == 0.0f) goto L13;
        r2 = false;
    L13:
        if (r2 == false) goto L15;
        return 0.0f;
    L15:
        if (Float.isNaN(velocity) == false) goto L18;
        return 0.0f;
    L18:
        if (velocity <= 0.0f) goto L23;
        return RangesKt.coerceAtMost(velocity, maximumVelocity);
    L23:
        return RangesKt.coerceAtLeast(velocity, -maximumVelocity);
    L5:
        value$iv = false;
        goto L7
    }

    public final void resetTracking() {
        ArraysKt.fill$default(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    private final float calculateLeastSquaresVelocity(float[] dataPoints, float[] time, int sampleCount) {
        return VelocityTrackerKt.polyFitLeastSquares(time, dataPoints, sampleCount, 2, this.reusableVelocityCoefficients)[1];
    L6:
        return 0.0f;
    }
}
