package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "weight", "", "fill", "", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "flowLayoutData", "Landroidx/compose/foundation/layout/FlowLayoutData;", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;Landroidx/compose/foundation/layout/FlowLayoutData;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "setCrossAxisAlignment", "(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V", "getFill", "()Z", "setFill", "(Z)V", "getFlowLayoutData", "()Landroidx/compose/foundation/layout/FlowLayoutData;", "setFlowLayoutData", "(Landroidx/compose/foundation/layout/FlowLayoutData;)V", "getWeight", "()F", "setWeight", "(F)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RowColumnParentData {
    public static final int $stable = 0;
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private FlowLayoutData flowLayoutData;
    private float weight;

    static {
        $stable = 8;
    }

    public RowColumnParentData() {
        float r1 = 0.0f;
        boolean r2 = false;
        CrossAxisAlignment r3 = null;
        FlowLayoutData r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData r0, float r1, boolean r2, CrossAxisAlignment r3, FlowLayoutData r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.weight;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.fill;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.crossAxisAlignment;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.flowLayoutData;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final float component1() {
        return this.weight;
    }

    public final boolean component2() {
        return this.fill;
    }

    public final CrossAxisAlignment component3() {
        return this.crossAxisAlignment;
    }

    public final FlowLayoutData component4() {
        return this.flowLayoutData;
    }

    public final RowColumnParentData copy(float r2, boolean r3, CrossAxisAlignment r4, FlowLayoutData r5) {
        return new RowColumnParentData(r2, r3, r4, r5);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof RowColumnParentData) == true) goto L8;
        return false;
    L8:
        RowColumnParentData r1 = (RowColumnParentData) r6;
        if (Float.compare(this.weight, r1.weight) == 0) goto L12;
        return false;
    L12:
        if (this.fill == r1.fill) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.crossAxisAlignment, r1.crossAxisAlignment) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.flowLayoutData, r1.flowLayoutData) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r0 = ((Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill)) * 31;
        int r3 = 0;
        if (this.crossAxisAlignment != null) goto L5;
        int r2 = 0;
    L6:
        int r1 = (r0 + r2) * 31;
        if (this.flowLayoutData == null) goto L11;
        r3 = this.flowLayoutData.hashCode();
    L11:
        return r1 + r3;
    L5:
        r2 = this.crossAxisAlignment.hashCode();
        goto L6
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + this.flowLayoutData + ')';
    }

    public RowColumnParentData(float weight, boolean fill, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        this.weight = weight;
        this.fill = fill;
        this.crossAxisAlignment = crossAxisAlignment;
        this.flowLayoutData = flowLayoutData;
    }

    public /* synthetic */ RowColumnParentData(float r2, boolean r3, CrossAxisAlignment r4, FlowLayoutData r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setWeight(float r1) {
        this.weight = r1;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final void setFill(boolean r1) {
        this.fill = r1;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final void setCrossAxisAlignment(CrossAxisAlignment r1) {
        this.crossAxisAlignment = r1;
    }

    public final FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    public final void setFlowLayoutData(FlowLayoutData r1) {
        this.flowLayoutData = r1;
    }
}
