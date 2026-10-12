package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApproachLayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J&\u0010\u001c\u001a\u00020\t*\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010!\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "isMeasurementApproachInProgress", "", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "approachMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "isPlacementApproachInProgress", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "lookaheadCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "maxApproachIntrinsicHeight", "", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxApproachIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureScope;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minApproachIntrinsicHeight", "minApproachIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    /* JADX INFO: renamed from: approachMeasure-3p2s80s */
    MeasureResult mo65approachMeasure3p2s80s(ApproachMeasureScope r1, Measurable r2, long r3);

    /* JADX INFO: renamed from: isMeasurementApproachInProgress-ozmzZPI */
    boolean mo66isMeasurementApproachInProgressozmzZPI(long r1);

    default boolean isPlacementApproachInProgress(Placeable.PlacementScope $this$isPlacementApproachInProgress, LayoutCoordinates lookaheadCoordinates) {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    default MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        final Placeable $this$measure_3p2s80s_u24lambda_u240 = measurable.mo5714measureBRTryo0(constraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, $this$measure_3p2s80s_u24lambda_u240.getWidth(), $this$measure_3p2s80s_u24lambda_u240.getHeight(), null, new ApproachLayoutModifierNode$measure$1$1($this$measure_3p2s80s_u24lambda_u240), 4, null);
    }

    default int minApproachIntrinsicWidth(ApproachIntrinsicMeasureScope $this$minApproachIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        NodeCoordinator r0 = getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(r0);
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        if (r1.getHasMeasureResult() == false) goto L6;
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new C06351(this), $this$minApproachIntrinsicWidth, measurable, height);
    L6:
        return measurable.minIntrinsicWidth(height);
    }

    default int minApproachIntrinsicHeight(ApproachIntrinsicMeasureScope $this$minApproachIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        NodeCoordinator r0 = getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(r0);
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        if (r1.getHasMeasureResult() == false) goto L6;
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new C06341(this), $this$minApproachIntrinsicHeight, measurable, width);
    L6:
        return measurable.minIntrinsicHeight(width);
    }

    default int maxApproachIntrinsicWidth(ApproachIntrinsicMeasureScope $this$maxApproachIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        NodeCoordinator r0 = getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(r0);
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        if (r1.getHasMeasureResult() == false) goto L6;
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new C06331(this), $this$maxApproachIntrinsicWidth, measurable, height);
    L6:
        return measurable.maxIntrinsicWidth(height);
    }

    default int maxApproachIntrinsicHeight(ApproachIntrinsicMeasureScope $this$maxApproachIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        NodeCoordinator r0 = getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(r0);
        LookaheadDelegate r1 = r0.getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        if (r1.getHasMeasureResult() == false) goto L6;
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new AnonymousClass1(this), $this$maxApproachIntrinsicHeight, measurable, width);
    L6:
        return measurable.maxIntrinsicHeight(width);
    }
}
