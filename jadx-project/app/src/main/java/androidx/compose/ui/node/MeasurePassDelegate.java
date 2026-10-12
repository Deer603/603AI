package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MeasurePassDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b=\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010{\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020W0|H\u0016J\b\u0010~\u001a\u00020/H\u0002J\b\u0010\u007f\u001a\u00020/H\u0002J\u001e\u0010\u0080\u0001\u001a\u00020/2\u0013\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020/0-H\u0016J\u001f\u0010\u0082\u0001\u001a\u00020/2\u0013\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020/0-H\u0082\bJ\u0013\u0010\u0083\u0001\u001a\u00020W2\u0007\u0010\u0084\u0001\u001a\u00020}H\u0096\u0002J\u0010\u0010\u0085\u0001\u001a\u00020/2\u0007\u0010\u0086\u0001\u001a\u00020\u0013J\u0007\u0010\u0087\u0001\u001a\u00020/J\t\u0010\u0088\u0001\u001a\u00020/H\u0016J\u000f\u0010\u0089\u0001\u001a\u00020/H\u0000¢\u0006\u0003\b\u008a\u0001J\u0007\u0010\u008b\u0001\u001a\u00020/J\u000f\u0010\u008c\u0001\u001a\u00020/H\u0000¢\u0006\u0003\b\u008d\u0001J\t\u0010\u008e\u0001\u001a\u00020/H\u0002J\t\u0010\u008f\u0001\u001a\u00020/H\u0002J\u0012\u0010\u0090\u0001\u001a\u00020W2\u0007\u0010\u0091\u0001\u001a\u00020WH\u0016J\u0012\u0010\u0092\u0001\u001a\u00020W2\u0007\u0010\u0093\u0001\u001a\u00020WH\u0016J\u001e\u0010\u0094\u0001\u001a\u00020\u00022\u0007\u0010\u0095\u0001\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0012\u0010\u0098\u0001\u001a\u00020W2\u0007\u0010\u0091\u0001\u001a\u00020WH\u0016J\u0012\u0010\u0099\u0001\u001a\u00020W2\u0007\u0010\u0093\u0001\u001a\u00020WH\u0016J\u0007\u0010\u009a\u0001\u001a\u00020/J\t\u0010\u009b\u0001\u001a\u00020/H\u0002J\t\u0010\u009c\u0001\u001a\u00020/H\u0002J\u0007\u0010\u009d\u0001\u001a\u00020/J\u000f\u0010\u009e\u0001\u001a\u00020/H\u0000¢\u0006\u0003\b\u009f\u0001J\u001e\u0010 \u0001\u001a\u00020/2\u0007\u0010\u0095\u0001\u001a\u00020'H\u0000ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JB\u0010£\u0001\u001a\u00020/2\u0007\u0010¤\u0001\u001a\u0002012\u0006\u0010x\u001a\u0002072\u001a\u0010¥\u0001\u001a\u0015\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0018\u00010-¢\u0006\u0002\b0H\u0014ø\u0001\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J/\u0010£\u0001\u001a\u00020/2\u0007\u0010¤\u0001\u001a\u0002012\u0006\u0010x\u001a\u0002072\u0007\u0010¨\u0001\u001a\u00020+H\u0014ø\u0001\u0000¢\u0006\u0006\b¦\u0001\u0010©\u0001JM\u0010ª\u0001\u001a\u00020/2\u0007\u0010¤\u0001\u001a\u0002012\u0006\u0010x\u001a\u0002072\u001a\u0010¥\u0001\u001a\u0015\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0018\u00010-¢\u0006\u0002\b02\t\u0010¨\u0001\u001a\u0004\u0018\u00010+H\u0002ø\u0001\u0000¢\u0006\u0006\b«\u0001\u0010¬\u0001JM\u0010\u00ad\u0001\u001a\u00020/2\u0007\u0010¤\u0001\u001a\u0002012\u0006\u0010x\u001a\u0002072\u001a\u0010¥\u0001\u001a\u0015\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0018\u00010-¢\u0006\u0002\b02\t\u0010¨\u0001\u001a\u0004\u0018\u00010+H\u0002ø\u0001\u0000¢\u0006\u0006\b®\u0001\u0010¬\u0001J\u001c\u0010¯\u0001\u001a\u00020\u00132\u0007\u0010\u0095\u0001\u001a\u00020'ø\u0001\u0000¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0007\u0010²\u0001\u001a\u00020/J\t\u0010³\u0001\u001a\u00020/H\u0016J\t\u0010´\u0001\u001a\u00020/H\u0016J\u0012\u0010µ\u0001\u001a\u00020/2\u0007\u0010¶\u0001\u001a\u00020=H\u0002J\u0007\u0010·\u0001\u001a\u00020\u0013J\u0012\u0010¸\u0001\u001a\u00020/2\u0007\u0010¹\u0001\u001a\u00020\u0013H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R$\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u0019\u0010&\u001a\u0004\u0018\u00010'8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010,\u001a\u0015\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0018\u00010-¢\u0006\u0002\b0X\u0082\u000e¢\u0006\u0002\n\u0000R&\u00102\u001a\u0002012\u0006\u0010\u001f\u001a\u000201@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00108\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0015R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020/0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010@\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0015R\u000e\u0010B\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010J\u001a\u0004\u0018\u00010K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001e\u0010N\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0015R\u001a\u0010P\u001a\u00020QX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u000e\u0010Z\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010[\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010YR\u000e\u0010]\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010_\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b`\u0010\u001eR\u0016\u0010a\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\"\u0010e\u001a\u0004\u0018\u00010d2\b\u0010\u001f\u001a\u0004\u0018\u00010d@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u000e\u0010h\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020/0;X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020'X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00105R\u001e\u0010m\u001a\u00020W2\u0006\u0010\u001f\u001a\u00020W@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bn\u0010YR\u0014\u0010o\u001a\b\u0012\u0004\u0012\u00020/0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010p\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010q\u001a\u0015\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0018\u00010-¢\u0006\u0002\b0X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010r\u001a\u000201X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00105R\u000e\u0010s\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010u\u001a\u00020W2\u0006\u0010\u001f\u001a\u00020W@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bv\u0010YR\u000e\u0010w\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010x\u001a\u0002072\u0006\u0010\u001f\u001a\u000207@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\by\u0010z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006º\u0001"}, d2 = {"Landroidx/compose/ui/node/MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "layoutNodeLayoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "childDelegates", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegatesDirty", "", "getChildDelegatesDirty$ui_release", "()Z", "setChildDelegatesDirty$ui_release", "(Z)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "<set-?>", "isPlaced", "setPlaced$ui_release", "isPlacedByParent", "setPlacedByParent$ui_release", "isPlacedUnderMotionFrameOfReference", "setPlacedUnderMotionFrameOfReference", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastExplicitLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastLayerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/unit/IntOffset;", "lastPosition", "getLastPosition-nOcc-ac$ui_release", "()J", "J", "lastZIndex", "", "layingOutChildren", "getLayingOutChildren", "layoutChildrenBlock", "Lkotlin/Function0;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutPending", "getLayoutPending$ui_release", "layoutPendingForAlignment", "value", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "getLayoutState", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "setLayoutState", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "getLookaheadPassDelegate", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "measurePending", "getMeasurePending$ui_release", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "needsCoordinatesUpdate", "onNodePlacedCalled", "outerCoordinator", "getOuterCoordinator", "parentAlignmentLinesOwner", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "parentData", "getParentData", "()Ljava/lang/Object;", "parentDataDirty", "performMeasureBlock", "getPerformMeasureBlock$ui_release", "()Lkotlin/jvm/functions/Function0;", "performMeasureConstraints", "placeOrder", "getPlaceOrder$ui_release", "placeOuterCoordinatorBlock", "placeOuterCoordinatorLayer", "placeOuterCoordinatorLayerBlock", "placeOuterCoordinatorPosition", "placeOuterCoordinatorZIndex", "placedOnce", "previousPlaceOrder", "getPreviousPlaceOrder$ui_release", "relayoutWithoutParentInProgress", "zIndex", "getZIndex$ui_release", "()F", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "checkChildrenPlaceOrderForUpdates", "clearPlaceOrder", "forEachChildAlignmentLinesOwner", "block", "forEachChildDelegate", "get", "alignmentLine", "invalidateIntrinsicsParent", "forceRequest", "invalidateParentData", "layoutChildren", "markDetachedFromParentLookaheadPass", "markDetachedFromParentLookaheadPass$ui_release", "markLayoutPending", "markMeasurePending", "markMeasurePending$ui_release", "markNodeAndSubtreeAsPlaced", "markSubtreeAsNotPlaced", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "notifyChildrenUsingCoordinatesWhilePlacing", "onBeforeLayoutChildren", "onIntrinsicsQueried", "onNodeDetached", "onNodePlaced", "onNodePlaced$ui_release", "performMeasure", "performMeasure-BRTryo0$ui_release", "(J)V", "placeAt", "position", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeOuterCoordinator", "placeOuterCoordinator-MLgxB_4", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeSelf", "placeSelf-MLgxB_4", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "requestLayout", "requestMeasure", "trackMeasurementByParent", "node", "updateParentData", "updatePlacedUnderMotionFrameOfReference", "newMFR", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    private final MutableVector<MeasurePassDelegate> _childDelegates;
    private final AlignmentLines alignmentLines;
    private boolean childDelegatesDirty;
    private boolean duringAlignmentLinesQuery;
    private boolean isPlaced;
    private boolean isPlacedByParent;
    private boolean isPlacedUnderMotionFrameOfReference;
    private GraphicsLayer lastExplicitLayer;
    private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
    private long lastPosition;
    private float lastZIndex;
    private boolean layingOutChildren;
    private final Function0<Unit> layoutChildrenBlock;
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean measurePending;
    private LayoutNode.UsageByParent measuredByParent;
    private boolean measuredOnce;
    private boolean needsCoordinatesUpdate;
    private boolean onNodePlacedCalled;
    private Object parentData;
    private boolean parentDataDirty;
    private final Function0<Unit> performMeasureBlock;
    private long performMeasureConstraints;
    private int placeOrder;
    private final Function0<Unit> placeOuterCoordinatorBlock;
    private GraphicsLayer placeOuterCoordinatorLayer;
    private Function1<? super GraphicsLayerScope, Unit> placeOuterCoordinatorLayerBlock;
    private long placeOuterCoordinatorPosition;
    private float placeOuterCoordinatorZIndex;
    private boolean placedOnce;
    private int previousPlaceOrder;
    private boolean relayoutWithoutParentInProgress;
    private float zIndex;

    /* JADX INFO: compiled from: MeasurePassDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            int[] r0 = new int[LayoutNode.LayoutState.values().length];
            r0[LayoutNode.LayoutState.Measuring.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L19:
            r0[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L10:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[LayoutNode.UsageByParent.values().length];
            r1[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;     // Catch: NoSuchFieldError -> L13
        L23:
            r1[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;     // Catch: NoSuchFieldError -> L16
        L17:
            $EnumSwitchMapping$1 = r1;
        }
    }

    static {
        $stable = 8;
    }

    public static final /* synthetic */ void access$checkChildrenPlaceOrderForUpdates(MeasurePassDelegate $this) {
        $this.checkChildrenPlaceOrderForUpdates();
    }

    public static final /* synthetic */ void access$clearPlaceOrder(MeasurePassDelegate $this) {
        $this.clearPlaceOrder();
    }

    public static final /* synthetic */ long access$getPerformMeasureConstraints$p(MeasurePassDelegate $this) {
        return $this.performMeasureConstraints;
    }

    public static final /* synthetic */ GraphicsLayer access$getPlaceOuterCoordinatorLayer$p(MeasurePassDelegate $this) {
        return $this.placeOuterCoordinatorLayer;
    }

    public static final /* synthetic */ Function1 access$getPlaceOuterCoordinatorLayerBlock$p(MeasurePassDelegate $this) {
        return $this.placeOuterCoordinatorLayerBlock;
    }

    public static final /* synthetic */ long access$getPlaceOuterCoordinatorPosition$p(MeasurePassDelegate $this) {
        return $this.placeOuterCoordinatorPosition;
    }

    public static final /* synthetic */ float access$getPlaceOuterCoordinatorZIndex$p(MeasurePassDelegate $this) {
        return $this.placeOuterCoordinatorZIndex;
    }

    public MeasurePassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.placeOrder = Integer.MAX_VALUE;
        this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        this.lastPosition = IntOffset.Companion.m7112getZeronOccac();
        this.parentDataDirty = true;
        this.alignmentLines = new LayoutNodeAlignmentLines(this);
        this._childDelegates = new MutableVector(new MeasurePassDelegate[16], 0);
        this.childDelegatesDirty = true;
        this.performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.performMeasureBlock = new MeasurePassDelegate$performMeasureBlock$1(this);
        this.layoutChildrenBlock = new MeasurePassDelegate$layoutChildrenBlock$1(this);
        this.placeOuterCoordinatorPosition = IntOffset.Companion.m7112getZeronOccac();
        this.placeOuterCoordinatorBlock = new MeasurePassDelegate$placeOuterCoordinatorBlock$1(this);
    }

    public final int getPreviousPlaceOrder$ui_release() {
        return this.previousPlaceOrder;
    }

    public final int getPlaceOrder$ui_release() {
        return this.placeOrder;
    }

    /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m5929getLastConstraintsDWUhwKw() {
        if (this.measuredOnce == true) goto L7;
        return null;
    L7:
        return Constraints.m6913boximpl(m5774getMeasurementConstraintsmsEJaDk());
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNodeLayoutDelegate.getLayoutNode$ui_release();
    }

    public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
        return this.measuredByParent;
    }

    public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent r1) {
        this.measuredByParent = r1;
    }

    public final boolean getDuringAlignmentLinesQuery$ui_release() {
        return this.duringAlignmentLinesQuery;
    }

    public final void setDuringAlignmentLinesQuery$ui_release(boolean r1) {
        this.duringAlignmentLinesQuery = r1;
    }

    /* JADX INFO: renamed from: getLastPosition-nOcc-ac$ui_release, reason: not valid java name */
    public final long m5930getLastPositionnOccac$ui_release() {
        return this.lastPosition;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.parentData;
    }

    private final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.layoutNodeLayoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public boolean isPlaced() {
        return this.isPlaced;
    }

    public void setPlaced$ui_release(boolean r1) {
        this.isPlaced = r1;
    }

    public final boolean isPlacedByParent() {
        return this.isPlacedByParent;
    }

    public final void setPlacedByParent$ui_release(boolean r1) {
        this.isPlacedByParent = r1;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePending;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutPending;
    }

    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutNodeLayoutDelegate.getLayoutState$ui_release();
    }

    public final void setLayoutState(LayoutNode.LayoutState value) {
        this.layoutNodeLayoutDelegate.setLayoutState$ui_release(value);
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public NodeCoordinator getInnerCoordinator() {
        return getLayoutNode().getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final boolean getChildDelegatesDirty$ui_release() {
        return this.childDelegatesDirty;
    }

    public final void setChildDelegatesDirty$ui_release(boolean r1) {
        this.childDelegatesDirty = r1;
    }

    public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
        getLayoutNode().updateChildrenIfDirty$ui_release();
        if (this.childDelegatesDirty == false) goto L5;
        LayoutNode $this$updateChildMeasurables$iv = getLayoutNode();
        MutableVector<MeasurePassDelegate> r2 = this._childDelegates;
        MutableVector<LayoutNode> r6 = $this$updateChildMeasurables$iv.get_children$ui_release();
        int i$iv$iv$iv = 0;
        Object[] content$iv$iv$iv = r6.content;
        int size$iv$iv$iv = r6.getSize();
    L7:
        if (i$iv$iv$iv >= size$iv$iv$iv) goto L13;
        LayoutNode layoutNode$iv = (LayoutNode) content$iv$iv$iv[i$iv$iv$iv];
        int i$iv = i$iv$iv$iv;
        if (r2.getSize() > i$iv) goto L11;
        r2.add(layoutNode$iv.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
    L12:
        i$iv$iv$iv = i$iv$iv$iv + 1;
        goto L7
    L11:
        r2.set(i$iv, layoutNode$iv.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
        goto L12
    L13:
        r2.removeRange($this$updateChildMeasurables$iv.getChildren$ui_release().size(), r2.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.asMutableList();
    L5:
        return this._childDelegates.asMutableList();
    }

    public final void markDetachedFromParentLookaheadPass$ui_release() {
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPass$ui_release(true);
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    public final Function0<Unit> getPerformMeasureBlock$ui_release() {
        return this.performMeasureBlock;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (this.layoutPending == false) goto L6;
        onBeforeLayoutChildren();
    L6:
        if (this.layoutPendingForAlignment == false) goto L8;
    L13:
        this.layoutPending = false;
        LayoutNode.LayoutState oldLayoutState = getLayoutState();
        setLayoutState(LayoutNode.LayoutState.LayingOut);
        this.layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(false);
        LayoutNode $this$layoutChildren_u24lambda_u241 = getLayoutNode();
        Owner owner = LayoutNodeKt.requireOwner($this$layoutChildren_u24lambda_u241);
        owner.getSnapshotObserver().observeLayoutSnapshotReads$ui_release($this$layoutChildren_u24lambda_u241, false, this.layoutChildrenBlock);
        setLayoutState(oldLayoutState);
        if (getInnerCoordinator().isPlacingForAlignment$ui_release() == true) goto L16;
    L18:
        this.layoutPendingForAlignment = false;
    L20:
        if (getAlignmentLines().getUsedDuringParentLayout$ui_release() == false) goto L23;
        getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
    L23:
        if (getAlignmentLines().getDirty$ui_release() == true) goto L25;
    L27:
        this.layingOutChildren = false;
        return;
    L25:
        if (getAlignmentLines().getRequired$ui_release() == false) goto L27;
        getAlignmentLines().recalculate();
        goto L27
    L16:
        if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() == false) goto L18;
        requestLayout();
        goto L18
    L8:
        if (this.duringAlignmentLinesQuery == true) goto L20;
        if (getInnerCoordinator().isPlacingForAlignment$ui_release() == true) goto L20;
        if (this.layoutPending == false) goto L20;
        goto L13
    }

    private final void checkChildrenPlaceOrderForUpdates() {
        LayoutNode $this$checkChildrenPlaceOrderForUpdates_u24lambda_u243 = getLayoutNode();
        MutableVector<LayoutNode> r4 = $this$checkChildrenPlaceOrderForUpdates_u24lambda_u243.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r4.content;
        int size$iv$iv = r4.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L14;
        LayoutNode child = (LayoutNode) content$iv$iv[i$iv$iv];
        if (child.getMeasurePassDelegate$ui_release().previousPlaceOrder == child.getPlaceOrder$ui_release()) goto L12;
        $this$checkChildrenPlaceOrderForUpdates_u24lambda_u243.onZSortedChildrenInvalidated$ui_release();
        $this$checkChildrenPlaceOrderForUpdates_u24lambda_u243.invalidateLayer$ui_release();
        if (child.getPlaceOrder$ui_release() != Integer.MAX_VALUE) goto L12;
        if (child.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPlacement$ui_release() == false) goto L11;
        LookaheadPassDelegate r11 = child.getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(r11);
        r11.markNodeAndSubtreeAsNotPlaced$ui_release(false);
    L11:
        child.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
    L12:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    private final void markSubtreeAsNotPlaced() {
        if (isPlaced() == false) goto L13;
        setPlaced$ui_release(false);
        LayoutNode this_$iv = getLayoutNode();
        NodeCoordinator delegate$iv = this_$iv.getOuterCoordinator$ui_release();
        NodeCoordinator final$iv = this_$iv.getInnerCoordinator$ui_release().getWrapped$ui_release();
    L6:
        if (Intrinsics.areEqual(delegate$iv, final$iv) == true) goto L9;
        if (delegate$iv == null) goto L9;
        NodeCoordinator it = delegate$iv;
        it.onUnplaced();
        it.releaseLayer();
        delegate$iv = delegate$iv.getWrapped$ui_release();
    L9:
        LayoutNode this_$iv$iv = getLayoutNode();
        MutableVector<LayoutNode> r4 = this_$iv$iv.get_children$ui_release();
        int i$iv$iv$iv = 0;
        Object[] content$iv$iv$iv = r4.content;
        int size$iv$iv$iv = r4.getSize();
    L10:
        if (i$iv$iv$iv >= size$iv$iv$iv) goto L17;
        LayoutNode it$iv = (LayoutNode) content$iv$iv$iv[i$iv$iv$iv];
        it$iv.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
        i$iv$iv$iv = i$iv$iv$iv + 1;
        goto L10
    L17:
        return;
    }

    private final void markNodeAndSubtreeAsPlaced() {
        boolean wasPlaced = isPlaced();
        setPlaced$ui_release(true);
        LayoutNode $this$markNodeAndSubtreeAsPlaced_u24lambda_u248 = getLayoutNode();
        if (wasPlaced == true) goto L10;
        $this$markNodeAndSubtreeAsPlaced_u24lambda_u248.getInnerCoordinator$ui_release().onPlaced();
        if ($this$markNodeAndSubtreeAsPlaced_u24lambda_u248.getMeasurePending$ui_release() == false) goto L8;
        LayoutNode.requestRemeasure$ui_release$default($this$markNodeAndSubtreeAsPlaced_u24lambda_u248, true, false, false, 6, null);
        goto L10
    L8:
        if ($this$markNodeAndSubtreeAsPlaced_u24lambda_u248.getLookaheadMeasurePending$ui_release() == false) goto L10;
        LayoutNode.requestLookaheadRemeasure$ui_release$default($this$markNodeAndSubtreeAsPlaced_u24lambda_u248, true, false, false, 6, null);
    L10:
        NodeCoordinator delegate$iv = $this$markNodeAndSubtreeAsPlaced_u24lambda_u248.getOuterCoordinator$ui_release();
        NodeCoordinator final$iv = $this$markNodeAndSubtreeAsPlaced_u24lambda_u248.getInnerCoordinator$ui_release().getWrapped$ui_release();
    L12:
        if (Intrinsics.areEqual(delegate$iv, final$iv) == true) goto L18;
        if (delegate$iv == null) goto L18;
        NodeCoordinator it = delegate$iv;
        if (it.getLastLayerDrawingWasSkipped$ui_release() == false) goto L17;
        it.invalidateLayer();
    L17:
        delegate$iv = delegate$iv.getWrapped$ui_release();
    L18:
        MutableVector<LayoutNode> r5 = $this$markNodeAndSubtreeAsPlaced_u24lambda_u248.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r5.content;
        int size$iv$iv = r5.getSize();
    L19:
        if (i$iv$iv >= size$iv$iv) goto L25;
        LayoutNode it2 = (LayoutNode) content$iv$iv[i$iv$iv];
        if (it2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) goto L23;
        it2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
        $this$markNodeAndSubtreeAsPlaced_u24lambda_u248.rescheduleRemeasureOrRelayout$ui_release(it2);
    L23:
        i$iv$iv = i$iv$iv + 1;
        goto L19
    }

    public final float getZIndex$ui_release() {
        return this.zIndex;
    }

    public final void onNodePlaced$ui_release() {
        this.onNodePlacedCalled = true;
        LayoutNode parent = getLayoutNode().getParent$ui_release();
        float newZIndex = getInnerCoordinator().getZIndex();
        LayoutNode this_$iv = getLayoutNode();
        NodeCoordinator coordinator$iv = this_$iv.getOuterCoordinator$ui_release();
        NodeCoordinator inner$iv = this_$iv.getInnerCoordinator$ui_release();
    L3:
        if (coordinator$iv == inner$iv) goto L5;
        Intrinsics.checkNotNull(coordinator$iv, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
        LayoutModifierNodeCoordinator it = (LayoutModifierNodeCoordinator) coordinator$iv;
        newZIndex = newZIndex + it.getZIndex();
        coordinator$iv = coordinator$iv.getWrapped$ui_release();
        goto L3
    L5:
        boolean value$iv = false;
        if (newZIndex != this.zIndex) goto L8;
        boolean r3 = true;
    L9:
        if (r3 == true) goto L16;
        this.zIndex = newZIndex;
        if (parent == null) goto L13;
        parent.onZSortedChildrenInvalidated$ui_release();
    L13:
        if (parent == null) goto L16;
        parent.invalidateLayer$ui_release();
    L16:
        if (isPlaced() == true) goto L23;
        if (parent == null) goto L19;
        parent.invalidateLayer$ui_release();
    L19:
        markNodeAndSubtreeAsPlaced();
        if (this.relayoutWithoutParentInProgress == false) goto L24;
        if (parent == null) goto L24;
        LayoutNode.requestRelayout$ui_release$default(parent, false, 1, null);
    L24:
        if (parent != null) goto L26;
        this.placeOrder = 0;
    L37:
        layoutChildren();
        return;
    L26:
        if (this.relayoutWithoutParentInProgress == true) goto L37;
        if (parent.getLayoutState$ui_release() != LayoutNode.LayoutState.LayingOut) goto L37;
        if (this.placeOrder != Integer.MAX_VALUE) goto L33;
        value$iv = true;
    L33:
        if (value$iv == true) goto L35;
        InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
    L35:
        this.placeOrder = parent.getLayoutDelegate$ui_release().getNextChildPlaceOrder$ui_release();
        LayoutNodeLayoutDelegate r4 = parent.getLayoutDelegate$ui_release();
        r4.setNextChildPlaceOrder$ui_release(r4.getNextChildPlaceOrder$ui_release() + 1);
        goto L37
    L23:
        getLayoutNode().getInnerCoordinator$ui_release().onPlaced();
        goto L24
    L8:
        r3 = false;
        goto L9
    }

    private final void clearPlaceOrder() {
        boolean r2 = false;
        this.layoutNodeLayoutDelegate.setNextChildPlaceOrder$ui_release(0);
        LayoutNode this_$iv$iv = getLayoutNode();
        MutableVector<LayoutNode> r6 = this_$iv$iv.get_children$ui_release();
        int i$iv$iv$iv = 0;
        Object[] content$iv$iv$iv = r6.content;
        int size$iv$iv$iv = r6.getSize();
    L3:
        if (i$iv$iv$iv >= size$iv$iv$iv) goto L9;
        LayoutNode it$iv = (LayoutNode) content$iv$iv$iv[i$iv$iv$iv];
        MeasurePassDelegate child = it$iv.getMeasurePassDelegate$ui_release();
        child.previousPlaceOrder = child.placeOrder;
        child.placeOrder = Integer.MAX_VALUE;
        child.isPlacedByParent = r2;
        if (child.measuredByParent != LayoutNode.UsageByParent.InLayoutBlock) goto L7;
        child.measuredByParent = LayoutNode.UsageByParent.NotUsed;
    L7:
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r2 = false;
        goto L3
    }

    private final void forEachChildDelegate(Function1<? super MeasurePassDelegate, Unit> r12) {
        LayoutNode this_$iv = getLayoutNode();
        MutableVector<LayoutNode> r3 = this_$iv.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r3.content;
        int size$iv$iv = r3.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L6;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        r12.invoke(it.getMeasurePassDelegate$ui_release());
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    /* JADX INFO: renamed from: performMeasure-BRTryo0$ui_release, reason: not valid java name */
    public final void m5931performMeasureBRTryo0$ui_release(long constraints) {
        if (getLayoutState() != LayoutNode.LayoutState.Idle) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
    L9:
        this.performMeasureConstraints = constraints;
        setLayoutState(LayoutNode.LayoutState.Measuring);
        this.measurePending = false;
        LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(getLayoutNode(), false, this.performMeasureBlock);
        if (getLayoutState() != LayoutNode.LayoutState.Measuring) goto L13;
        markLayoutPending();
        setLayoutState(LayoutNode.LayoutState.Idle);
        return;
    L13:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo5714measureBRTryo0(long constraints) {
        if (getLayoutNode().getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) goto L6;
        getLayoutNode().clearSubtreeIntrinsicsUsage$ui_release();
    L6:
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode()) == false) goto L8;
        LookaheadPassDelegate $this$measure_BRTryo0_u24lambda_u2414 = getLookaheadPassDelegate();
        Intrinsics.checkNotNull($this$measure_BRTryo0_u24lambda_u2414);
        $this$measure_BRTryo0_u24lambda_u2414.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        $this$measure_BRTryo0_u24lambda_u2414.mo5714measureBRTryo0(constraints);
    L8:
        trackMeasurementByParent(getLayoutNode());
        m5932remeasureBRTryo0(constraints);
        return this;
    }

    /* JADX INFO: renamed from: remeasure-BRTryo0, reason: not valid java name */
    public final boolean m5932remeasureBRTryo0(long constraints) {
        boolean sizeChanged = true;
        boolean value$iv = !getLayoutNode().isDeactivated();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
    L5:
        Owner owner = LayoutNodeKt.requireOwner(getLayoutNode());
        LayoutNode parent = getLayoutNode().getParent$ui_release();
        LayoutNode r4 = getLayoutNode();
        if (getLayoutNode().getCanMultiMeasure$ui_release() == true) goto L12;
        if (parent != null) goto L9;
    L11:
        boolean r5 = false;
    L13:
        r4.setCanMultiMeasure$ui_release(r5);
        if (getLayoutNode().getMeasurePending$ui_release() == true) goto L21;
        if (Constraints.m6919equalsimpl0(m5774getMeasurementConstraintsmsEJaDk(), constraints) == false) goto L21;
        Owner.forceMeasureTheSubtree$default(owner, getLayoutNode(), false, 2, null);
        getLayoutNode().resetSubtreeIntrinsicsUsage$ui_release();
        return false;
    L21:
        getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
        forEachChildAlignmentLinesOwner(MeasurePassDelegate$remeasure$2.INSTANCE);
        this.measuredOnce = true;
        long outerPreviousMeasuredSize = getOuterCoordinator().mo5722getSizeYbymL2g();
        m5777setMeasurementConstraintsBRTryo0(constraints);
        m5931performMeasureBRTryo0$ui_release(constraints);
        if (IntSize.m7142equalsimpl0(getOuterCoordinator().mo5722getSizeYbymL2g(), outerPreviousMeasuredSize) == true) goto L24;
    L30:
        int width$iv = getOuterCoordinator().getWidth();
        int height$iv = getOuterCoordinator().getHeight();
        m5776setMeasuredSizeozmzZPI(IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L)));
        return sizeChanged;
    L24:
        if (getOuterCoordinator().getWidth() != getWidth()) goto L30;
        if (getOuterCoordinator().getHeight() != getHeight()) goto L30;
        sizeChanged = false;
        goto L30
    L9:
        if (parent.getCanMultiMeasure$ui_release() == false) goto L11;
    L12:
        r5 = true;
        goto L13
    }

    private final void trackMeasurementByParent(LayoutNode node) {
        LayoutNode parent = node.getParent$ui_release();
        if (parent != null) goto L5;
        this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        return;
    L5:
        if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed) goto L7;
    L10:
        boolean value$iv = true;
    L12:
        if (value$iv == true) goto L15;
        InlineClassHelperKt.throwIllegalStateException(LayoutNodeLayoutDelegateKt.MeasuredTwiceErrorMessage);
    L15:
        switch(WhenMappings.$EnumSwitchMapping$0[parent.getLayoutState$ui_release().ordinal()]) {
            case 1: goto L19;
            case 2: goto L18;
            default: goto L17;
        };
    L18:
        LayoutNode.UsageByParent r1 = LayoutNode.UsageByParent.InLayoutBlock;
    L20:
        this.measuredByParent = r1;
        return;
    L19:
        r1 = LayoutNode.UsageByParent.InMeasureBlock;
        goto L20
    L17:
        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent.getLayoutState$ui_release());
    L7:
        if (node.getCanMultiMeasure$ui_release() == true) goto L10;
        value$iv = false;
        goto L12
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return getOuterCoordinator().getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return getOuterCoordinator().getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        LayoutNode r0 = getLayoutNode().getParent$ui_release();
        LayoutNode.LayoutState r1 = null;
        if (r0 == null) goto L5;
        LayoutNode.LayoutState r2 = r0.getLayoutState$ui_release();
    L7:
        if (r2 != LayoutNode.LayoutState.Measuring) goto L9;
        getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
    L15:
        this.duringAlignmentLinesQuery = true;
        int result = getOuterCoordinator().get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return result;
    L9:
        LayoutNode r3 = getLayoutNode().getParent$ui_release();
        if (r3 == null) goto L13;
        r1 = r3.getLayoutState$ui_release();
    L13:
        if (r1 != LayoutNode.LayoutState.LayingOut) goto L15;
        getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
        goto L15
    L5:
        r2 = null;
        goto L7
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected void mo5715placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r10) {
        m5928placeSelfMLgxB_4(position, zIndex, r10, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected void mo5775placeAtf8xVGno(long position, float zIndex, GraphicsLayer layer) {
        m5928placeSelfMLgxB_4(position, zIndex, null, layer);
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean r1) {
        this.isPlacedUnderMotionFrameOfReference = r1;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean newMFR) {
        boolean old = getOuterCoordinator().isPlacedUnderMotionFrameOfReference();
        if (newMFR == old) goto L5;
        getOuterCoordinator().setPlacedUnderMotionFrameOfReference(newMFR);
        this.needsCoordinatesUpdate = true;
    L5:
        setPlacedUnderMotionFrameOfReference(newMFR);
    }

    /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m5928placeSelfMLgxB_4(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r20, GraphicsLayer layer) {
        this.isPlacedByParent = true;
        boolean r3 = false;
        if (IntOffset.m7100equalsimpl0(position, this.lastPosition) == false) goto L8;
        if (this.needsCoordinatesUpdate == true) goto L8;
    L15:
        LookaheadPassDelegate r2 = getLookaheadPassDelegate();
        if (r2 != null) goto L18;
    L20:
        boolean r4 = false;
    L21:
        if (r4 == false) goto L31;
        NodeCoordinator r5 = getOuterCoordinator().getWrappedBy$ui_release();
        if (r5 == null) goto L26;
        Placeable.PlacementScope scope = r5.getPlacementScope();
        if (scope == null) goto L26;
    L27:
        Placeable.PlacementScope $this$placeSelf_MLgxB_4_u24lambda_u2419 = scope;
        LookaheadPassDelegate it = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(it);
        LayoutNode $this$placeSelf_MLgxB_4_u24lambda_u2419_u24lambda_u2418_u24lambda_u2417 = getLayoutNode().getParent$ui_release();
        if ($this$placeSelf_MLgxB_4_u24lambda_u2419_u24lambda_u2418_u24lambda_u2417 == null) goto L30;
        $this$placeSelf_MLgxB_4_u24lambda_u2419_u24lambda_u2418_u24lambda_u2417.getLayoutDelegate$ui_release().setNextChildLookaheadPlaceOrder$ui_release(0);
    L30:
        it.setPlaceOrder$ui_release(Integer.MAX_VALUE);
        Placeable.PlacementScope.place$default($this$placeSelf_MLgxB_4_u24lambda_u2419, it, IntOffset.m7101getXimpl(position), IntOffset.m7102getYimpl(position), 0.0f, 4, null);
    L26:
        scope = LayoutNodeKt.requireOwner(getLayoutNode()).getPlacementScope();
    L31:
        LookaheadPassDelegate r6 = getLookaheadPassDelegate();
        if (r6 != null) goto L34;
    L36:
        boolean value$iv = true ^ r3;
        if (value$iv == true) goto L39;
        InlineClassHelperKt.throwIllegalStateException("Error: Placement happened before lookahead.");
    L39:
        m5927placeOuterCoordinatorMLgxB_4(position, zIndex, r20, layer);
        return;
    L34:
        if (r6.getPlacedOnce$ui_release() == true) goto L36;
        r3 = true;
        goto L36
    L18:
        if (r2.getNeedsToBePlacedInApproach() != true) goto L20;
        r4 = true;
    L8:
        if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() == false) goto L10;
    L13:
        this.layoutPending = true;
        this.needsCoordinatesUpdate = false;
    L14:
        notifyChildrenUsingCoordinatesWhilePlacing();
        goto L15
    L10:
        if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() == true) goto L13;
        if (this.needsCoordinatesUpdate == false) goto L14;
        goto L13
    }

    /* JADX INFO: renamed from: placeOuterCoordinator-MLgxB_4, reason: not valid java name */
    private final void m5927placeOuterCoordinatorMLgxB_4(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r14, GraphicsLayer layer) {
        boolean value$iv = !getLayoutNode().isDeactivated();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
    L5:
        setLayoutState(LayoutNode.LayoutState.LayingOut);
        boolean firstPlacement = !this.placedOnce;
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = r14;
        this.lastExplicitLayer = layer;
        this.placedOnce = true;
        this.onNodePlacedCalled = false;
        Owner owner = LayoutNodeKt.requireOwner(getLayoutNode());
        owner.getRectManager().m6205onLayoutPositionChanged70tqf50(getLayoutNode(), position, firstPlacement);
        if (this.layoutPending == false) goto L8;
    L10:
        getAlignmentLines().setUsedByModifierLayout$ui_release(false);
        this.layoutNodeLayoutDelegate.setCoordinatesAccessedDuringModifierPlacement(false);
        this.placeOuterCoordinatorLayerBlock = r14;
        this.placeOuterCoordinatorPosition = position;
        this.placeOuterCoordinatorZIndex = zIndex;
        this.placeOuterCoordinatorLayer = layer;
        owner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(getLayoutNode(), false, this.placeOuterCoordinatorBlock);
    L11:
        setLayoutState(LayoutNode.LayoutState.Idle);
        return;
    L8:
        if (isPlaced() == false) goto L10;
        getOuterCoordinator().m5966placeSelfApparentToRealOffsetMLgxB_4(position, zIndex, r14, layer);
        onNodePlaced$ui_release();
        goto L11
    }

    public final void replace() {
        this.relayoutWithoutParentInProgress = true;     // Catch: Throwable -> L15
        boolean value$iv = this.placedOnce;     // Catch: Throwable -> L15
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalStateException("replace called on unplaced item");     // Catch: Throwable -> L15
    L6:
        boolean wasPlacedBefore = isPlaced();     // Catch: Throwable -> L15
        m5927placeOuterCoordinatorMLgxB_4(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);     // Catch: Throwable -> L15
        if (wasPlacedBefore == true) goto L9;
    L13:
        this.relayoutWithoutParentInProgress = false;
        return;
    L9:
        if (this.onNodePlacedCalled == true) goto L13;
        LayoutNode r3 = getLayoutNode().getParent$ui_release();     // Catch: Throwable -> L15
        if (r3 == null) goto L13;
        LayoutNode.requestRelayout$ui_release$default(r3, false, 1, null);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        this.relayoutWithoutParentInProgress = false;
        throw th;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode()) == false) goto L6;
        LookaheadPassDelegate r0 = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.minIntrinsicWidth(height);
    L6:
        onIntrinsicsQueried();
        return getOuterCoordinator().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode()) == false) goto L6;
        LookaheadPassDelegate r0 = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.maxIntrinsicWidth(height);
    L6:
        onIntrinsicsQueried();
        return getOuterCoordinator().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode()) == false) goto L6;
        LookaheadPassDelegate r0 = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.minIntrinsicHeight(width);
    L6:
        onIntrinsicsQueried();
        return getOuterCoordinator().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode()) == false) goto L6;
        LookaheadPassDelegate r0 = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.maxIntrinsicHeight(width);
    L6:
        onIntrinsicsQueried();
        return getOuterCoordinator().maxIntrinsicHeight(width);
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.requestRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
        LayoutNode parent = getLayoutNode().getParent$ui_release();
        if (parent != null) goto L5;
        return;
    L5:
        if (getLayoutNode().getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) goto L14;
        LayoutNode r1 = getLayoutNode();
        LayoutNode.LayoutState r2 = parent.getLayoutState$ui_release();
        switch(WhenMappings.$EnumSwitchMapping$0[r2.ordinal()]) {
            case 1: goto L10;
            case 2: goto L9;
            default: goto L8;
        };
    L8:
        LayoutNode.UsageByParent r3 = parent.getIntrinsicsUsageByParent$ui_release();
    L11:
        r1.setIntrinsicsUsageByParent$ui_release(r3);
        return;
    L9:
        r3 = LayoutNode.UsageByParent.InLayoutBlock;
        goto L11
    L10:
        r3 = LayoutNode.UsageByParent.InMeasureBlock;
        goto L11
    }

    public final void invalidateParentData() {
        this.parentDataDirty = true;
    }

    public final boolean updateParentData() {
        if (getParentData() != null) goto L8;
        if (getOuterCoordinator().getParentData() != null) goto L8;
        return false;
    L8:
        if (this.parentDataDirty == true) goto L10;
        return false;
    L10:
        this.parentDataDirty = false;
        this.parentData = getOuterCoordinator().getParentData();
        return true;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public Map<AlignmentLine, Integer> calculateAlignmentLines() {
        if (this.duringAlignmentLinesQuery == false) goto L5;
    L10:
        getInnerCoordinator().setPlacingForAlignment$ui_release(true);
        layoutChildren();
        getInnerCoordinator().setPlacingForAlignment$ui_release(false);
        return getAlignmentLines().getLastCalculation();
    L5:
        if (getLayoutState() != LayoutNode.LayoutState.Measuring) goto L9;
        getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
        if (getAlignmentLines().getDirty$ui_release() == false) goto L10;
        markLayoutPending();
        goto L10
    L9:
        getAlignmentLines().setUsedByModifierLayout$ui_release(true);
        goto L10
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLinesOwner getParentAlignmentLinesOwner() {
        LayoutNode r0 = getLayoutNode().getParent$ui_release();
        if (r0 == null) goto L7;
        LayoutNodeLayoutDelegate r1 = r0.getLayoutDelegate$ui_release();
        if (r1 == null) goto L7;
        return r1.getAlignmentLinesOwner$ui_release();
    L7:
        return null;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void forEachChildAlignmentLinesOwner(Function1<? super AlignmentLinesOwner, Unit> r11) {
        LayoutNode this_$iv = getLayoutNode();
        MutableVector<LayoutNode> r2 = this_$iv.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L6;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        r11.invoke(it.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestMeasure() {
        LayoutNode.requestRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
    }

    public final void notifyChildrenUsingCoordinatesWhilePlacing() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() <= 0) goto L20;
        LayoutNode this_$iv = getLayoutNode();
        MutableVector<LayoutNode> r2 = this_$iv.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L5:
        if (i$iv$iv >= size$iv$iv) goto L25;
        LayoutNode child = (LayoutNode) content$iv$iv[i$iv$iv];
        LayoutNodeLayoutDelegate childLayoutDelegate = child.getLayoutDelegate$ui_release();
        if (childLayoutDelegate.getCoordinatesAccessedDuringPlacement() == false) goto L9;
    L12:
        boolean accessed = true;
    L14:
        if (accessed == false) goto L18;
        if (childLayoutDelegate.getLayoutPending$ui_release() == true) goto L18;
        LayoutNode.requestRelayout$ui_release$default(child, false, 1, null);
    L18:
        childLayoutDelegate.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
        i$iv$iv = i$iv$iv + 1;
        goto L5
    L9:
        if (childLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() == true) goto L12;
        accessed = false;
        goto L14
    L25:
        return;
    }

    private final void onBeforeLayoutChildren() {
        LayoutNode this_$iv = getLayoutNode();
        MutableVector<LayoutNode> r2 = this_$iv.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L13;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        if (it.getMeasurePending$ui_release() == false) goto L11;
        if (it.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) goto L11;
        if (LayoutNode.m5887remeasure_Sx5XlM$ui_release$default(it, null, 1, null) == false) goto L11;
        LayoutNode.requestRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
    L11:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    public final void invalidateIntrinsicsParent(boolean forceRequest) {
        LayoutNode parent = getLayoutNode().getParent$ui_release();
        LayoutNode.UsageByParent intrinsicsUsageByParent = getLayoutNode().getIntrinsicsUsageByParent$ui_release();
        if (parent == null) goto L20;
        if (intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) goto L20;
        LayoutNode r2 = parent;
    L7:
        LayoutNode intrinsicsUsingParent = r2;
        if (intrinsicsUsingParent.getIntrinsicsUsageByParent$ui_release() != intrinsicsUsageByParent) goto L14;
        r2 = intrinsicsUsingParent.getParent$ui_release();
        if (r2 != null) goto L7;
    L14:
        switch(WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()]) {
            case 1: goto L18;
            case 2: goto L17;
            default: goto L16;
        };
    L17:
        intrinsicsUsingParent.requestRelayout$ui_release(forceRequest);
        return;
    L18:
        LayoutNode.requestRemeasure$ui_release$default(intrinsicsUsingParent, forceRequest, false, false, 6, null);
        return;
    L16:
        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
    }

    public final void onNodeDetached() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        setPlaced$ui_release(false);
    }

    public final void markLayoutPending() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }
}
