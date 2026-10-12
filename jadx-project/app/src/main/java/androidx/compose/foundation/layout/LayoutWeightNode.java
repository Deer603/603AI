package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "weight", "", "fill", "", "(FZ)V", "getFill", "()Z", "setFill", "(Z)V", "getWeight", "()F", "setWeight", "(F)V", "modifyParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "Landroidx/compose/ui/unit/Density;", "parentData", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutWeightNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 0;
    private boolean fill;
    private float weight;

    static {
        $stable = 8;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public /* bridge */ /* synthetic */ Object modifyParentData(Density $this$modifyParentData, Object parentData) {
        return modifyParentData($this$modifyParentData, parentData);
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

    public LayoutWeightNode(float weight, boolean fill) {
        this.weight = weight;
        this.fill = fill;
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
        it.setWeight(this.weight);
        it.setFill(this.fill);
        return r0;
    L5:
        r0 = null;
        goto L6
    }
}
