package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0007"}, d2 = {"invalidateLayer", "", "Landroidx/compose/ui/node/LayoutModifierNode;", "invalidateMeasurement", "invalidatePlacement", "remeasureSync", "requestRemeasure", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutModifierNodeKt {
    public static final void remeasureSync(LayoutModifierNode $this$remeasureSync) {
        DelegatableNodeKt.requireLayoutNode($this$remeasureSync).forceRemeasure();
    }

    public static final void invalidateLayer(LayoutModifierNode $this$invalidateLayer) {
        DelegatableNodeKt.m5836requireCoordinator64DMado($this$invalidateLayer, NodeKind.m5976constructorimpl(2)).invalidateLayer();
    }

    public static final void invalidatePlacement(LayoutModifierNode $this$invalidatePlacement) {
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode($this$invalidatePlacement), false, 1, null);
    }

    public static final void invalidateMeasurement(LayoutModifierNode $this$invalidateMeasurement) {
        DelegatableNodeKt.requireLayoutNode($this$invalidateMeasurement).invalidateMeasurements$ui_release();
    }

    public static final void requestRemeasure(LayoutModifierNode $this$requestRemeasure) {
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode($this$requestRemeasure), false, false, false, 7, null);
    }
}
