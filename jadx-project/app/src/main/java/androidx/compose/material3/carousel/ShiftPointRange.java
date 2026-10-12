package androidx.compose.material3.carousel;

import kotlin.Metadata;

/* JADX INFO: compiled from: Strategy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/carousel/ShiftPointRange;", "", "fromStepIndex", "", "toStepIndex", "steppedInterpolation", "", "(IIF)V", "getFromStepIndex", "()I", "getSteppedInterpolation", "()F", "getToStepIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ShiftPointRange {
    private final int fromStepIndex;
    private final float steppedInterpolation;
    private final int toStepIndex;

    public static /* synthetic */ ShiftPointRange copy$default(ShiftPointRange r0, int r1, int r2, float r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.fromStepIndex;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.toStepIndex;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.steppedInterpolation;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.fromStepIndex;
    }

    public final int component2() {
        return this.toStepIndex;
    }

    public final float component3() {
        return this.steppedInterpolation;
    }

    public final ShiftPointRange copy(int r2, int r3, float r4) {
        return new ShiftPointRange(r2, r3, r4);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof ShiftPointRange) == true) goto L8;
        return false;
    L8:
        ShiftPointRange r1 = (ShiftPointRange) r6;
        if (this.fromStepIndex == r1.fromStepIndex) goto L12;
        return false;
    L12:
        if (this.toStepIndex == r1.toStepIndex) goto L15;
        return false;
    L15:
        if (Float.compare(this.steppedInterpolation, r1.steppedInterpolation) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.fromStepIndex) * 31) + Integer.hashCode(this.toStepIndex)) * 31) + Float.hashCode(this.steppedInterpolation);
    }

    public String toString() {
        return "ShiftPointRange(fromStepIndex=" + this.fromStepIndex + ", toStepIndex=" + this.toStepIndex + ", steppedInterpolation=" + this.steppedInterpolation + ')';
    }

    public ShiftPointRange(int fromStepIndex, int toStepIndex, float steppedInterpolation) {
        this.fromStepIndex = fromStepIndex;
        this.toStepIndex = toStepIndex;
        this.steppedInterpolation = steppedInterpolation;
    }

    public final int getFromStepIndex() {
        return this.fromStepIndex;
    }

    public final int getToStepIndex() {
        return this.toStepIndex;
    }

    public final float getSteppedInterpolation() {
        return this.steppedInterpolation;
    }
}
