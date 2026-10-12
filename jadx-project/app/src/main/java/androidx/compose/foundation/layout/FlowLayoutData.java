package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutData;", "", "fillCrossAxisFraction", "", "(F)V", "getFillCrossAxisFraction", "()F", "setFillCrossAxisFraction", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowLayoutData {
    public static final int $stable = 0;
    private float fillCrossAxisFraction;

    static {
        $stable = 8;
    }

    public static /* synthetic */ FlowLayoutData copy$default(FlowLayoutData r0, float r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.fillCrossAxisFraction;
    L6:
        return r0.copy(r1);
    }

    public final float component1() {
        return this.fillCrossAxisFraction;
    }

    public final FlowLayoutData copy(float r2) {
        return new FlowLayoutData(r2);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FlowLayoutData) == true) goto L9;
        return false;
    L9:
        if (Float.compare(this.fillCrossAxisFraction, ((FlowLayoutData) r5).fillCrossAxisFraction) == 0) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Float.hashCode(this.fillCrossAxisFraction);
    }

    public String toString() {
        return "FlowLayoutData(fillCrossAxisFraction=" + this.fillCrossAxisFraction + ')';
    }

    public FlowLayoutData(float fillCrossAxisFraction) {
        this.fillCrossAxisFraction = fillCrossAxisFraction;
    }

    public final float getFillCrossAxisFraction() {
        return this.fillCrossAxisFraction;
    }

    public final void setFillCrossAxisFraction(float r1) {
        this.fillCrossAxisFraction = r1;
    }
}
