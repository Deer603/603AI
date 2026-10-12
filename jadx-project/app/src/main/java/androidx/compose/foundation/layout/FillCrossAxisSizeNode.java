package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\t\u001a\u00020\n*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/layout/FillCrossAxisSizeNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "fraction", "", "(F)V", "getFraction", "()F", "setFraction", "modifyParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "Landroidx/compose/ui/unit/Density;", "parentData", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FillCrossAxisSizeNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 0;
    private float fraction;

    static {
        $stable = 8;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public /* bridge */ /* synthetic */ Object modifyParentData(Density $this$modifyParentData, Object parentData) {
        return modifyParentData($this$modifyParentData, parentData);
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final void setFraction(float r1) {
        this.fraction = r1;
    }

    public FillCrossAxisSizeNode(float fraction) {
        this.fraction = fraction;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public RowColumnParentData modifyParentData(Density $this$modifyParentData, Object parentData) {
        if ((parentData instanceof RowColumnParentData) == false) goto L5;
        RowColumnParentData r0 = (RowColumnParentData) parentData;
    L6:
        if (r0 != null) goto L8;
        r0 = new RowColumnParentData(0.0f, false, null, null, 15, null);
    L8:
        RowColumnParentData it = r0;
        FlowLayoutData r3 = it.getFlowLayoutData();
        if (r3 != null) goto L11;
        r3 = new FlowLayoutData(this.fraction);
    L11:
        it.setFlowLayoutData(r3);
        FlowLayoutData r4 = it.getFlowLayoutData();
        Intrinsics.checkNotNull(r4);
        r4.setFillCrossAxisFraction(this.fraction);
        return r0;
    L5:
        r0 = null;
        goto L6
    }
}
