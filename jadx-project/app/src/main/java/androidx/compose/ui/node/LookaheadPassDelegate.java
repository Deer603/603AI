package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LookaheadPassDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b?\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002³\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010s\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020W0tH\u0016J\b\u0010v\u001a\u00020-H\u0002J\b\u0010w\u001a\u00020-H\u0002J\u001c\u0010x\u001a\u00020-2\u0012\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020-0+H\u0016J\u001d\u0010z\u001a\u00020-2\u0012\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020-0+H\u0082\bJ\u0011\u0010{\u001a\u00020W2\u0006\u0010|\u001a\u00020uH\u0096\u0002J\u000e\u0010}\u001a\u00020-2\u0006\u0010~\u001a\u00020\u0015J\u0006\u0010\u007f\u001a\u00020-J\t\u0010\u0080\u0001\u001a\u00020-H\u0016J\u000f\u0010\u0081\u0001\u001a\u00020-H\u0000¢\u0006\u0003\b\u0082\u0001J\u000f\u0010\u0083\u0001\u001a\u00020-H\u0000¢\u0006\u0003\b\u0084\u0001J\u0018\u0010\u0085\u0001\u001a\u00020-2\u0007\u0010\u0086\u0001\u001a\u00020\u0015H\u0000¢\u0006\u0003\b\u0087\u0001J\t\u0010\u0088\u0001\u001a\u00020-H\u0002J\u0012\u0010\u0089\u0001\u001a\u00020W2\u0007\u0010\u008a\u0001\u001a\u00020WH\u0016J\u0012\u0010\u008b\u0001\u001a\u00020W2\u0007\u0010\u008c\u0001\u001a\u00020WH\u0016J\u001e\u0010\u008d\u0001\u001a\u00020\u00012\u0007\u0010\u008e\u0001\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0012\u0010\u0091\u0001\u001a\u00020W2\u0007\u0010\u008a\u0001\u001a\u00020WH\u0016J\u0012\u0010\u0092\u0001\u001a\u00020W2\u0007\u0010\u008c\u0001\u001a\u00020WH\u0016J\u0007\u0010\u0093\u0001\u001a\u00020-J\u0007\u0010\u0094\u0001\u001a\u00020-J\t\u0010\u0095\u0001\u001a\u00020-H\u0002J\t\u0010\u0096\u0001\u001a\u00020-H\u0002J\u0007\u0010\u0097\u0001\u001a\u00020-J\u000f\u0010\u0098\u0001\u001a\u00020-H\u0000¢\u0006\u0003\b\u0099\u0001J\u001e\u0010\u009a\u0001\u001a\u00020-2\u0007\u0010\u008e\u0001\u001a\u00020%H\u0000ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001JC\u0010\u009d\u0001\u001a\u00020-2\u0007\u0010\u009e\u0001\u001a\u0002002\u0007\u0010\u009f\u0001\u001a\u0002032\u001a\u0010 \u0001\u001a\u0015\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0018\u00010+¢\u0006\u0002\b.H\u0014ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J0\u0010\u009d\u0001\u001a\u00020-2\u0007\u0010\u009e\u0001\u001a\u0002002\u0007\u0010\u009f\u0001\u001a\u0002032\u0007\u0010£\u0001\u001a\u00020)H\u0014ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¤\u0001JN\u0010¥\u0001\u001a\u00020-2\u0007\u0010\u009e\u0001\u001a\u0002002\u0007\u0010\u009f\u0001\u001a\u0002032\u001a\u0010 \u0001\u001a\u0015\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0018\u00010+¢\u0006\u0002\b.2\t\u0010£\u0001\u001a\u0004\u0018\u00010)H\u0002ø\u0001\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001c\u0010¨\u0001\u001a\u00020\u00152\u0007\u0010\u008e\u0001\u001a\u00020%ø\u0001\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0007\u0010«\u0001\u001a\u00020-J\t\u0010¬\u0001\u001a\u00020-H\u0016J\t\u0010\u00ad\u0001\u001a\u00020-H\u0016J\u0012\u0010®\u0001\u001a\u00020-2\u0007\u0010¯\u0001\u001a\u000208H\u0002J\u0007\u0010°\u0001\u001a\u00020\u0015J\u0012\u0010±\u0001\u001a\u00020-2\u0007\u0010²\u0001\u001a\u00020\u0015H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u001a\u0010\"\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u0019\u0010$\u001a\u0004\u0018\u00010%8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010*\u001a\u0015\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0018\u00010+¢\u0006\u0002\b.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\u000200X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00101R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00105\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0017R\u0014\u00107\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010<\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u00158B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010\u0019R$\u0010?\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u00158B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0017\"\u0004\bA\u0010\u0019R$\u0010C\u001a\u00020B2\u0006\u0010;\u001a\u00020B8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010H\u001a\u0004\u0018\u00010%X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0014\u0010I\u001a\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR$\u0010M\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u00158B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bN\u0010\u0017\"\u0004\bO\u0010\u0019R\u001a\u0010P\u001a\u00020QX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u000e\u0010Z\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010[\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010YR\u0011\u0010]\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b^\u0010\u0017R\u000e\u0010_\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010`\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010 R\u0016\u0010b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\"\u0010f\u001a\u0004\u0018\u00010e2\b\u00104\u001a\u0004\u0018\u00010e@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u000e\u0010i\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010j\u001a\u00020WX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010Y\"\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0017\"\u0004\bp\u0010\u0019R\u000e\u0010q\u001a\u00020WX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006´\u0001"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "layoutNodeLayoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "_placedState", "Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "childDelegates", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegatesDirty", "", "getChildDelegatesDirty$ui_release", "()Z", "setChildDelegatesDirty$ui_release", "(Z)V", "detachedFromParentLookaheadPlacement", "getDetachedFromParentLookaheadPlacement", "duringAlignmentLinesQuery", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "isPlaced", "isPlacedUnderMotionFrameOfReference", "setPlacedUnderMotionFrameOfReference", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastExplicitLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastLayerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "lastZIndex", "", "<set-?>", "layingOutChildren", "getLayingOutChildren", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "value", "layoutPending", "getLayoutPending", "setLayoutPending", "layoutPendingForAlignment", "getLayoutPendingForAlignment", "setLayoutPendingForAlignment", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "getLayoutState", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "setLayoutState", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "lookaheadConstraints", "measurePassDelegate", "Landroidx/compose/ui/node/MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePending", "getMeasurePending", "setMeasurePending", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "needsToBePlacedInApproach", "getNeedsToBePlacedInApproach", "onNodePlacedCalled", "outerCoordinator", "getOuterCoordinator", "parentAlignmentLinesOwner", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "parentData", "getParentData", "()Ljava/lang/Object;", "parentDataDirty", "placeOrder", "getPlaceOrder$ui_release", "setPlaceOrder$ui_release", "(I)V", "placedOnce", "getPlacedOnce$ui_release", "setPlacedOnce$ui_release", "previousPlaceOrder", "relayoutWithoutParentInProgress", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "checkChildrenPlaceOrderForUpdates", "clearPlaceOrder", "forEachChildAlignmentLinesOwner", "block", "forEachChildDelegate", "get", "alignmentLine", "invalidateIntrinsicsParent", "forceRequest", "invalidateParentData", "layoutChildren", "markLayoutPending", "markLayoutPending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "markNodeAndSubtreeAsNotPlaced", "inLookahead", "markNodeAndSubtreeAsNotPlaced$ui_release", "markNodeAndSubtreeAsPlaced", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "notifyChildrenUsingLookaheadCoordinatesWhilePlacing", "onAttachedToNullParent", "onBeforeLayoutChildren", "onIntrinsicsQueried", "onNodeDetached", "onNodePlaced", "onNodePlaced$ui_release", "performMeasure", "performMeasure-BRTryo0$ui_release", "(J)V", "placeAt", "position", "zIndex", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeSelf", "placeSelf-MLgxB_4", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "requestLayout", "requestMeasure", "trackLookaheadMeasurementByParent", "node", "updateParentData", "updatePlacedUnderMotionFrameOfReference", "newMFR", "PlacedState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    private final MutableVector<LookaheadPassDelegate> _childDelegates;
    private PlacedState _placedState;
    private final AlignmentLines alignmentLines;
    private boolean childDelegatesDirty;
    private boolean duringAlignmentLinesQuery;
    private boolean isPlacedUnderMotionFrameOfReference;
    private GraphicsLayer lastExplicitLayer;
    private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
    private long lastPosition;
    private float lastZIndex;
    private boolean layingOutChildren;
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
    private Constraints lookaheadConstraints;
    private LayoutNode.UsageByParent measuredByParent;
    private boolean measuredOnce;
    private boolean onNodePlacedCalled;
    private Object parentData;
    private boolean parentDataDirty;
    private int placeOrder;
    private boolean placedOnce;
    private int previousPlaceOrder;
    private boolean relayoutWithoutParentInProgress;

    /* JADX INFO: compiled from: LookaheadPassDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "", "(Ljava/lang/String;I)V", "IsPlacedInLookahead", "IsPlacedInApproach", "IsNotPlaced", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final enum PlacedState extends Enum<PlacedState> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ PlacedState[] $VALUES = null;
        public static final PlacedState IsNotPlaced = null;
        public static final PlacedState IsPlacedInApproach = null;
        public static final PlacedState IsPlacedInLookahead = null;

        private static final /* synthetic */ PlacedState[] $values() {
            return new PlacedState[]{IsPlacedInLookahead, IsPlacedInApproach, IsNotPlaced};
        }

        public static EnumEntries<PlacedState> getEntries() {
            return $ENTRIES;
        }

        public static PlacedState valueOf(String r1) {
            return (PlacedState) Enum.valueOf(PlacedState.class, r1);
        }

        public static PlacedState[] values() {
            return (PlacedState[]) $VALUES.clone();
        }

        private PlacedState(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            IsPlacedInLookahead = new PlacedState("IsPlacedInLookahead", 0);
            IsPlacedInApproach = new PlacedState("IsPlacedInApproach", 1);
            IsNotPlaced = new PlacedState("IsNotPlaced", 2);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    /* JADX INFO: compiled from: LookaheadPassDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            int[] r0 = new int[LayoutNode.LayoutState.values().length];
            r0[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L25:
            r0[LayoutNode.LayoutState.Measuring.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L31:
            r0[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
        L35:
            r0[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;     // Catch: NoSuchFieldError -> L15
        L16:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[LayoutNode.UsageByParent.values().length];
            r1[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;     // Catch: NoSuchFieldError -> L19
        L27:
            r1[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;     // Catch: NoSuchFieldError -> L22
        L23:
            $EnumSwitchMapping$1 = r1;
        }
    }

    static {
        $stable = 8;
    }

    public static final /* synthetic */ void access$checkChildrenPlaceOrderForUpdates(LookaheadPassDelegate $this) {
        $this.checkChildrenPlaceOrderForUpdates();
    }

    public static final /* synthetic */ void access$clearPlaceOrder(LookaheadPassDelegate $this) {
        $this.clearPlaceOrder();
    }

    public static final /* synthetic */ LayoutNode access$getLayoutNode(LookaheadPassDelegate $this) {
        return $this.getLayoutNode();
    }

    public static final /* synthetic */ LayoutNodeLayoutDelegate access$getLayoutNodeLayoutDelegate$p(LookaheadPassDelegate $this) {
        return $this.layoutNodeLayoutDelegate;
    }

    public static final /* synthetic */ NodeCoordinator access$getOuterCoordinator(LookaheadPassDelegate $this) {
        return $this.getOuterCoordinator();
    }

    public LookaheadPassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.placeOrder = Integer.MAX_VALUE;
        this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
        this.lastPosition = IntOffset.Companion.m7112getZeronOccac();
        this._placedState = PlacedState.IsNotPlaced;
        this.alignmentLines = new LookaheadAlignmentLines(this);
        this._childDelegates = new MutableVector(new LookaheadPassDelegate[16], 0);
        this.childDelegatesDirty = true;
        this.parentDataDirty = true;
        this.parentData = getMeasurePassDelegate$ui_release().getParentData();
    }

    private final void setMeasurePending(boolean value) {
        this.layoutNodeLayoutDelegate.setLookaheadMeasurePending$ui_release(value);
    }

    private final boolean getMeasurePending() {
        return this.layoutNodeLayoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    private final void setLayoutPending(boolean value) {
        this.layoutNodeLayoutDelegate.setLookaheadLayoutPending$ui_release(value);
    }

    private final boolean getLayoutPending() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    private final void setLayoutPendingForAlignment(boolean value) {
        this.layoutNodeLayoutDelegate.setLookaheadLayoutPendingForAlignment$ui_release(value);
    }

    private final boolean getLayoutPendingForAlignment() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPendingForAlignment$ui_release();
    }

    private final LayoutNode getLayoutNode() {
        return this.layoutNodeLayoutDelegate.getLayoutNode$ui_release();
    }

    public final void markLayoutPending$ui_release() {
        setLayoutPending(true);
        setLayoutPendingForAlignment(true);
    }

    public final void markMeasurePending$ui_release() {
        setMeasurePending(true);
    }

    public final int getPlaceOrder$ui_release() {
        return this.placeOrder;
    }

    public final void setPlaceOrder$ui_release(int r1) {
        this.placeOrder = r1;
    }

    public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
        return this.measuredByParent;
    }

    public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent r1) {
        this.measuredByParent = r1;
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutNodeLayoutDelegate.getMeasurePassDelegate$ui_release();
    }

    private final NodeCoordinator getOuterCoordinator() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator();
    }

    private final void setLayoutState(LayoutNode.LayoutState value) {
        this.layoutNodeLayoutDelegate.setLayoutState$ui_release(value);
    }

    private final LayoutNode.LayoutState getLayoutState() {
        return this.layoutNodeLayoutDelegate.getLayoutState$ui_release();
    }

    public final boolean getPlacedOnce$ui_release() {
        return this.placedOnce;
    }

    public final void setPlacedOnce$ui_release(boolean r1) {
        this.placedOnce = r1;
    }

    /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m5919getLastConstraintsDWUhwKw() {
        return this.lookaheadConstraints;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public boolean isPlaced() {
        if (this._placedState == PlacedState.IsNotPlaced) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public NodeCoordinator getInnerCoordinator() {
        return getLayoutNode().getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final boolean getNeedsToBePlacedInApproach() {
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode()) == false) goto L6;
        return true;
    L6:
        if (this._placedState != PlacedState.IsNotPlaced) goto L11;
        if (this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPass$ui_release() == true) goto L11;
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPlacement$ui_release(true);
    L11:
        return getDetachedFromParentLookaheadPlacement();
    }

    public final boolean getChildDelegatesDirty$ui_release() {
        return this.childDelegatesDirty;
    }

    public final void setChildDelegatesDirty$ui_release(boolean r1) {
        this.childDelegatesDirty = r1;
    }

    public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
        getLayoutNode().getChildren$ui_release();
        if (this.childDelegatesDirty == false) goto L5;
        LayoutNode $this$updateChildMeasurables$iv = getLayoutNode();
        MutableVector<LookaheadPassDelegate> r2 = this._childDelegates;
        MutableVector<LayoutNode> r6 = $this$updateChildMeasurables$iv.get_children$ui_release();
        int i$iv$iv$iv = 0;
        Object[] content$iv$iv$iv = r6.content;
        int size$iv$iv$iv = r6.getSize();
    L7:
        if (i$iv$iv$iv >= size$iv$iv$iv) goto L13;
        LayoutNode layoutNode$iv = (LayoutNode) content$iv$iv$iv[i$iv$iv$iv];
        int i$iv = i$iv$iv$iv;
        if (r2.getSize() > i$iv) goto L11;
        LookaheadPassDelegate r1 = layoutNode$iv.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(r1);
        r2.add(r1);
    L12:
        i$iv$iv$iv = i$iv$iv$iv + 1;
        $this$updateChildMeasurables$iv = $this$updateChildMeasurables$iv;
        goto L7
    L11:
        LookaheadPassDelegate r15 = layoutNode$iv.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(r15);
        r2.set(i$iv, r15);
        goto L12
    L13:
        r2.removeRange($this$updateChildMeasurables$iv.getChildren$ui_release().size(), r2.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.asMutableList();
    L5:
        return this._childDelegates.asMutableList();
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    private final void forEachChildDelegate(Function1<? super LookaheadPassDelegate, Unit> r12) {
        LayoutNode this_$iv = getLayoutNode();
        MutableVector<LayoutNode> r3 = this_$iv.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r3.content;
        int size$iv$iv = r3.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L6;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        LookaheadPassDelegate r10 = it.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(r10);
        r12.invoke(r10);
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (getLayoutPending() == false) goto L5;
        onBeforeLayoutChildren();
    L5:
        final LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        if (getLayoutPendingForAlignment() == false) goto L8;
    L13:
        setLayoutPending(false);
        LayoutNode.LayoutState oldLayoutState = getLayoutState();
        setLayoutState(LayoutNode.LayoutState.LookaheadLayingOut);
        Owner owner = LayoutNodeKt.requireOwner(getLayoutNode());
        this.layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringPlacement(false);
        OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(owner.getSnapshotObserver(), getLayoutNode(), false, new AnonymousClass1(this, lookaheadDelegate), 2, null);
        setLayoutState(oldLayoutState);
        if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() == true) goto L16;
    L18:
        setLayoutPendingForAlignment(false);
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
        if (lookaheadDelegate.isPlacingForAlignment$ui_release() == false) goto L18;
        requestLayout();
        goto L18
    L8:
        if (this.duringAlignmentLinesQuery == true) goto L20;
        if (lookaheadDelegate.isPlacingForAlignment$ui_release() == true) goto L20;
        if (getLayoutPending() == false) goto L20;
        goto L13
    }

    private final boolean getDetachedFromParentLookaheadPlacement() {
        return this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement$ui_release();
    }

    private final void checkChildrenPlaceOrderForUpdates() {
        LayoutNode this_$iv$iv = getLayoutNode();
        MutableVector<LayoutNode> r4 = this_$iv$iv.get_children$ui_release();
        int i$iv$iv$iv = 0;
        Object[] content$iv$iv$iv = r4.content;
        int size$iv$iv$iv = r4.getSize();
    L3:
        if (i$iv$iv$iv >= size$iv$iv$iv) goto L11;
        LayoutNode it$iv = (LayoutNode) content$iv$iv$iv[i$iv$iv$iv];
        LookaheadPassDelegate child = it$iv.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(child);
        if (child.previousPlaceOrder == child.placeOrder) goto L9;
        if (child.placeOrder != Integer.MAX_VALUE) goto L9;
        child.markNodeAndSubtreeAsNotPlaced$ui_release(true);
    L9:
        i$iv$iv$iv = i$iv$iv$iv + 1;
        goto L3
    }

    public final void markNodeAndSubtreeAsNotPlaced$ui_release(boolean inLookahead) {
        if (inLookahead == true) goto L4;
    L5:
        if (inLookahead == false) goto L7;
    L9:
        this._placedState = PlacedState.IsNotPlaced;
        LayoutNode this_$iv$iv = getLayoutNode();
        MutableVector<LayoutNode> r4 = this_$iv$iv.get_children$ui_release();
        int i$iv$iv$iv = 0;
        Object[] content$iv$iv$iv = r4.content;
        int size$iv$iv$iv = r4.getSize();
    L10:
        if (i$iv$iv$iv >= size$iv$iv$iv) goto L13;
        LayoutNode it$iv = (LayoutNode) content$iv$iv$iv[i$iv$iv$iv];
        LookaheadPassDelegate it = it$iv.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(it);
        it.markNodeAndSubtreeAsNotPlaced$ui_release(true);
        i$iv$iv$iv = i$iv$iv$iv + 1;
        goto L10
    L13:
        return;
    L7:
        if (getDetachedFromParentLookaheadPlacement() == true) goto L9;
        return;
    L4:
        if (getDetachedFromParentLookaheadPlacement() == false) goto L5;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public Map<AlignmentLine, Integer> calculateAlignmentLines() {
        if (this.duringAlignmentLinesQuery == false) goto L5;
    L10:
        LookaheadDelegate r0 = getInnerCoordinator().getLookaheadDelegate();
        if (r0 == null) goto L14;
        r0.setPlacingForAlignment$ui_release(true);
    L14:
        layoutChildren();
        LookaheadDelegate r1 = getInnerCoordinator().getLookaheadDelegate();
        if (r1 == null) goto L19;
        r1.setPlacingForAlignment$ui_release(false);
    L19:
        return getAlignmentLines().getLastCalculation();
    L5:
        if (getLayoutState() != LayoutNode.LayoutState.LookaheadMeasuring) goto L9;
        getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
        if (getAlignmentLines().getDirty$ui_release() == false) goto L10;
        this.layoutNodeLayoutDelegate.markLookaheadLayoutPending$ui_release();
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
        return r1.getLookaheadAlignmentLinesOwner$ui_release();
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
        AlignmentLinesOwner r9 = it.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        Intrinsics.checkNotNull(r9);
        r11.invoke(r9);
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.requestLookaheadRelayout$ui_release$default(getLayoutNode(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestMeasure() {
        LayoutNode.requestLookaheadRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
    }

    public final void notifyChildrenUsingLookaheadCoordinatesWhilePlacing() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingLookaheadCoordinatesDuringPlacement() <= 0) goto L23;
        LayoutNode this_$iv = getLayoutNode();
        MutableVector<LayoutNode> r2 = this_$iv.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L5:
        if (i$iv$iv >= size$iv$iv) goto L27;
        LayoutNode child = (LayoutNode) content$iv$iv[i$iv$iv];
        LayoutNodeLayoutDelegate childLayoutDelegate = child.getLayoutDelegate$ui_release();
        if (childLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() == false) goto L9;
    L12:
        boolean accessed = true;
    L14:
        if (accessed == true) goto L16;
    L18:
        LookaheadPassDelegate r11 = childLayoutDelegate.getLookaheadPassDelegate$ui_release();
        if (r11 == null) goto L21;
        r11.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
    L21:
        i$iv$iv = i$iv$iv + 1;
        goto L5
    L16:
        if (childLayoutDelegate.getLookaheadLayoutPending$ui_release() == true) goto L18;
        LayoutNode.requestLookaheadRelayout$ui_release$default(child, false, 1, null);
        goto L18
    L9:
        if (childLayoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement() == true) goto L12;
        accessed = false;
        goto L14
    L27:
        return;
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo5714measureBRTryo0(long constraints) {
        LayoutNode r0 = getLayoutNode().getParent$ui_release();
        LayoutNode.LayoutState r1 = null;
        if (r0 == null) goto L5;
        LayoutNode.LayoutState r2 = r0.getLayoutState$ui_release();
    L7:
        if (r2 == LayoutNode.LayoutState.LookaheadMeasuring) goto L13;
        LayoutNode r3 = getLayoutNode().getParent$ui_release();
        if (r3 == null) goto L12;
        r1 = r3.getLayoutState$ui_release();
    L12:
        if (r1 == LayoutNode.LayoutState.LookaheadLayingOut) goto L13;
    L14:
        trackLookaheadMeasurementByParent(getLayoutNode());
        if (getLayoutNode().getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) goto L17;
        getLayoutNode().clearSubtreeIntrinsicsUsage$ui_release();
    L17:
        m5921remeasureBRTryo0(constraints);
        return this;
    L13:
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPass$ui_release(false);
        goto L14
    L5:
        r2 = null;
        goto L7
    }

    private final void trackLookaheadMeasurementByParent(LayoutNode node) {
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
            case 2: goto L19;
            case 3: goto L18;
            case 4: goto L18;
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

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.parentData;
    }

    /* JADX INFO: renamed from: performMeasure-BRTryo0$ui_release, reason: not valid java name */
    public final void m5920performMeasureBRTryo0$ui_release(final long constraints) {
        setLayoutState(LayoutNode.LayoutState.LookaheadMeasuring);
        setMeasurePending(false);
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver(), getLayoutNode(), false, new LookaheadPassDelegate$performMeasure$1(this, constraints), 2, null);
        markLayoutPending$ui_release();
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode()) == false) goto L5;
        getMeasurePassDelegate$ui_release().markLayoutPending();
    L6:
        setLayoutState(LayoutNode.LayoutState.Idle);
        return;
    L5:
        getMeasurePassDelegate$ui_release().markMeasurePending$ui_release();
        goto L6
    }

    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: remeasure-BRTryo0, reason: not valid java name */
    public final boolean m5921remeasureBRTryo0(long r20) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00dc: CAST (r4v1 ?? I:long) = (long) (r6v12 'width$iv' int A[D('width$iv' int)]) in method: androidx.compose.ui.node.LookaheadPassDelegate.remeasure-BRTryo0(long):boolean, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadPassDelegate.m5921remeasureBRTryo0(long):boolean");
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected void mo5715placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r10) {
        m5918placeSelfMLgxB_4(position, zIndex, r10, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected void mo5775placeAtf8xVGno(long position, float zIndex, GraphicsLayer layer) {
        m5918placeSelfMLgxB_4(position, zIndex, null, layer);
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
        LookaheadDelegate r0 = getOuterCoordinator().getLookaheadDelegate();
        if (r0 == null) goto L5;
        Boolean old = Boolean.valueOf(r0.isPlacedUnderMotionFrameOfReference());
    L7:
        if (Intrinsics.areEqual(Boolean.valueOf(newMFR), old) == true) goto L12;
        LookaheadDelegate r1 = getOuterCoordinator().getLookaheadDelegate();
        if (r1 == null) goto L12;
        r1.setPlacedUnderMotionFrameOfReference(newMFR);
    L12:
        setPlacedUnderMotionFrameOfReference(newMFR);
        return;
    L5:
        old = null;
        goto L7
    }

    /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m5918placeSelfMLgxB_4(final long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r13, GraphicsLayer layer) {
        LayoutNode r0 = getLayoutNode().getParent$ui_release();
        if (r0 == null) goto L5;
        LayoutNode.LayoutState r1 = r0.getLayoutState$ui_release();
    L7:
        if (r1 != LayoutNode.LayoutState.LookaheadLayingOut) goto L9;
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPlacement$ui_release(false);
    L9:
        boolean value$iv = !getLayoutNode().isDeactivated();
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
    L12:
        setLayoutState(LayoutNode.LayoutState.LookaheadLayingOut);
        this.placedOnce = true;
        this.onNodePlacedCalled = false;
        if (IntOffset.m7100equalsimpl0(position, this.lastPosition) == false) goto L15;
    L20:
        final Owner owner = LayoutNodeKt.requireOwner(getLayoutNode());
        if (getLayoutPending() == false) goto L23;
    L25:
        this.layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringModifierPlacement(false);
        getAlignmentLines().setUsedByModifierLayout$ui_release(false);
        OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(owner.getSnapshotObserver(), getLayoutNode(), false, new LookaheadPassDelegate$placeSelf$2(this, owner, position), 2, null);
    L26:
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = r13;
        this.lastExplicitLayer = layer;
        setLayoutState(LayoutNode.LayoutState.Idle);
        return;
    L23:
        if (isPlaced() == false) goto L25;
        LookaheadDelegate r2 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r2);
        r2.m5915placeSelfApparentToRealOffsetgyyYBs$ui_release(position);
        onNodePlaced$ui_release();
        goto L26
    L15:
        if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement() == false) goto L17;
    L18:
        setLayoutPending(true);
    L19:
        notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
        goto L20
    L17:
        if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() == false) goto L19;
    L5:
        r1 = null;
        goto L7
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        LookaheadDelegate r0 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        LookaheadDelegate r0 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        LayoutNode r0 = getLayoutNode().getParent$ui_release();
        LayoutNode.LayoutState r1 = null;
        if (r0 == null) goto L5;
        LayoutNode.LayoutState r2 = r0.getLayoutState$ui_release();
    L7:
        if (r2 != LayoutNode.LayoutState.LookaheadMeasuring) goto L9;
        getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
    L15:
        this.duringAlignmentLinesQuery = true;
        LookaheadDelegate r3 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r3);
        int result = r3.get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return result;
    L9:
        LayoutNode r4 = getLayoutNode().getParent$ui_release();
        if (r4 == null) goto L13;
        r1 = r4.getLayoutState$ui_release();
    L13:
        if (r1 != LayoutNode.LayoutState.LookaheadLayingOut) goto L15;
        getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
        goto L15
    L5:
        r2 = null;
        goto L7
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        onIntrinsicsQueried();
        LookaheadDelegate r0 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        onIntrinsicsQueried();
        LookaheadDelegate r0 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        onIntrinsicsQueried();
        LookaheadDelegate r0 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        onIntrinsicsQueried();
        LookaheadDelegate r0 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r0);
        return r0.maxIntrinsicHeight(width);
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.requestLookaheadRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
        LayoutNode parent = getLayoutNode().getParent$ui_release();
        if (parent != null) goto L5;
        return;
    L5:
        if (getLayoutNode().getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) goto L14;
        LayoutNode r1 = getLayoutNode();
        LayoutNode.LayoutState r2 = parent.getLayoutState$ui_release();
        switch(WhenMappings.$EnumSwitchMapping$0[r2.ordinal()]) {
            case 2: goto L10;
            case 3: goto L9;
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

    public final void invalidateIntrinsicsParent(boolean forceRequest) {
        LayoutNode parent = getLayoutNode().getParent$ui_release();
        LayoutNode.UsageByParent intrinsicsUsageByParent = getLayoutNode().getIntrinsicsUsageByParent$ui_release();
        if (parent == null) goto L26;
        if (intrinsicsUsageByParent == LayoutNode.UsageByParent.NotUsed) goto L26;
        LayoutNode r2 = parent;
    L7:
        LayoutNode intrinsicsUsingParent = r2;
        if (intrinsicsUsingParent.getIntrinsicsUsageByParent$ui_release() != intrinsicsUsageByParent) goto L14;
        r2 = intrinsicsUsingParent.getParent$ui_release();
        if (r2 != null) goto L7;
    L14:
        switch(WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()]) {
            case 1: goto L22;
            case 2: goto L18;
            default: goto L16;
        };
    L16:
        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
    L18:
        if (intrinsicsUsingParent.getLookaheadRoot$ui_release() == null) goto L20;
        intrinsicsUsingParent.requestLookaheadRelayout$ui_release(forceRequest);
        return;
    L20:
        intrinsicsUsingParent.requestRelayout$ui_release(forceRequest);
        return;
    L22:
        if (intrinsicsUsingParent.getLookaheadRoot$ui_release() == null) goto L24;
        LayoutNode.requestLookaheadRemeasure$ui_release$default(intrinsicsUsingParent, forceRequest, false, false, 6, null);
        return;
    L24:
        LayoutNode.requestRemeasure$ui_release$default(intrinsicsUsingParent, forceRequest, false, false, 6, null);
        return;
    }

    public final void invalidateParentData() {
        this.parentDataDirty = true;
    }

    public final boolean updateParentData() {
        if (getParentData() != null) goto L8;
        LookaheadDelegate r0 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r0);
        if (r0.getParentData() != null) goto L8;
        return false;
    L8:
        if (this.parentDataDirty == true) goto L10;
        return false;
    L10:
        this.parentDataDirty = false;
        LookaheadDelegate r1 = getOuterCoordinator().getLookaheadDelegate();
        Intrinsics.checkNotNull(r1);
        this.parentData = r1.getParentData();
        return true;
    }

    public final void onNodePlaced$ui_release() {
        this.onNodePlacedCalled = true;
        LayoutNode parent = getLayoutNode().getParent$ui_release();
        boolean value$iv = false;
        if (this._placedState == PlacedState.IsPlacedInLookahead) goto L7;
        if (getDetachedFromParentLookaheadPlacement() == true) goto L7;
    L10:
        markNodeAndSubtreeAsPlaced();
        if (this.relayoutWithoutParentInProgress == false) goto L14;
        if (parent == null) goto L14;
        LayoutNode.requestLookaheadRelayout$ui_release$default(parent, false, 1, null);
    L14:
        if (parent != null) goto L16;
        this.placeOrder = 0;
    L29:
        layoutChildren();
        return;
    L16:
        if (this.relayoutWithoutParentInProgress == true) goto L29;
        if (parent.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) goto L22;
        if (parent.getLayoutState$ui_release() != LayoutNode.LayoutState.LookaheadLayingOut) goto L29;
    L22:
        if (this.placeOrder != Integer.MAX_VALUE) goto L25;
        value$iv = true;
    L25:
        if (value$iv == true) goto L27;
        InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
    L27:
        this.placeOrder = parent.getLayoutDelegate$ui_release().getNextChildLookaheadPlaceOrder$ui_release();
        LayoutNodeLayoutDelegate r2 = parent.getLayoutDelegate$ui_release();
        r2.setNextChildLookaheadPlaceOrder$ui_release(r2.getNextChildLookaheadPlaceOrder$ui_release() + 1);
    L7:
        if (this._placedState == PlacedState.IsPlacedInApproach) goto L14;
        if (getDetachedFromParentLookaheadPlacement() == false) goto L14;
        goto L10
    }

    private final void clearPlaceOrder() {
        this.layoutNodeLayoutDelegate.setNextChildLookaheadPlaceOrder$ui_release(0);
        LayoutNode this_$iv$iv = getLayoutNode();
        MutableVector<LayoutNode> r4 = this_$iv$iv.get_children$ui_release();
        int i$iv$iv$iv = 0;
        Object[] content$iv$iv$iv = r4.content;
        int size$iv$iv$iv = r4.getSize();
    L3:
        if (i$iv$iv$iv >= size$iv$iv$iv) goto L9;
        LayoutNode it$iv = (LayoutNode) content$iv$iv$iv[i$iv$iv$iv];
        LookaheadPassDelegate child = it$iv.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(child);
        child.previousPlaceOrder = child.placeOrder;
        child.placeOrder = Integer.MAX_VALUE;
        if (child.measuredByParent != LayoutNode.UsageByParent.InLayoutBlock) goto L7;
        child.measuredByParent = LayoutNode.UsageByParent.NotUsed;
    L7:
        i$iv$iv$iv = i$iv$iv$iv + 1;
        goto L3
    }

    private final void markNodeAndSubtreeAsPlaced() {
        PlacedState prevPlacedState = this._placedState;
        if (getDetachedFromParentLookaheadPlacement() == false) goto L5;
        this._placedState = PlacedState.IsPlacedInApproach;
    L7:
        if (prevPlacedState != PlacedState.IsPlacedInLookahead) goto L9;
    L11:
        LayoutNode this_$iv = getLayoutNode();
        MutableVector<LayoutNode> r3 = this_$iv.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r3.content;
        int size$iv$iv = r3.getSize();
    L12:
        if (i$iv$iv >= size$iv$iv) goto L22;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        LookaheadPassDelegate childDelegate = it.getLookaheadPassDelegate$ui_release();
        if (childDelegate == null) goto L20;
        if (childDelegate.placeOrder == Integer.MAX_VALUE) goto L18;
        childDelegate.markNodeAndSubtreeAsPlaced();
        it.rescheduleRemeasureOrRelayout$ui_release(it);
    L18:
        i$iv$iv = i$iv$iv + 1;
        goto L12
    L20:
        throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.".toString());
    L22:
        return;
    L9:
        if (this.layoutNodeLayoutDelegate.getLookaheadMeasurePending$ui_release() == false) goto L11;
        LayoutNode.requestLookaheadRemeasure$ui_release$default(getLayoutNode(), true, false, false, 6, null);
        goto L11
    L5:
        this._placedState = PlacedState.IsPlacedInLookahead;
        goto L7
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
        if (it.getLookaheadMeasurePending$ui_release() == false) goto L11;
        if (it.getMeasuredByParentInLookahead$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) goto L11;
        LookaheadPassDelegate r9 = it.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(r9);
        Constraints r10 = it.getLayoutDelegate$ui_release().m5907getLastLookaheadConstraintsDWUhwKw();
        Intrinsics.checkNotNull(r10);
        if (r9.m5921remeasureBRTryo0(r10.m6932unboximpl()) == false) goto L11;
        LayoutNode.requestLookaheadRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
    L11:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    public final void replace() {
        this.relayoutWithoutParentInProgress = true;     // Catch: Throwable -> L15
        boolean value$iv = this.placedOnce;     // Catch: Throwable -> L15
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalStateException("replace() called on item that was not placed");     // Catch: Throwable -> L15
    L6:
        this.onNodePlacedCalled = false;     // Catch: Throwable -> L15
        boolean wasPlacedBefore = isPlaced();     // Catch: Throwable -> L15
        m5918placeSelfMLgxB_4(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);     // Catch: Throwable -> L15
        if (wasPlacedBefore == true) goto L9;
    L13:
        this.relayoutWithoutParentInProgress = false;
        return;
    L9:
        if (this.onNodePlacedCalled == true) goto L13;
        LayoutNode r3 = getLayoutNode().getParent$ui_release();     // Catch: Throwable -> L15
        if (r3 == null) goto L13;
        LayoutNode.requestLookaheadRelayout$ui_release$default(r3, false, 1, null);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        this.relayoutWithoutParentInProgress = false;
        throw th;
    }

    public final void onNodeDetached() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this._placedState = PlacedState.IsNotPlaced;
    }

    public final void onAttachedToNullParent() {
        this._placedState = PlacedState.IsPlacedInLookahead;
    }
}
