package androidx.compose.ui.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.platform.SubcompositionKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0003bcdB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020/0.¢\u0006\u0002\b0H\u0002¢\u0006\u0002\u00101J%\u00102\u001a\u0002032\u001d\u00104\u001a\u0019\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020805¢\u0006\u0002\b9J!\u0010:\u001a\u0002082\u0006\u0010;\u001a\u0002082\u000e\b\u0004\u0010<\u001a\b\u0012\u0004\u0012\u00020/0.H\u0082\bJ\u0010\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0018H\u0002J\b\u0010?\u001a\u00020/H\u0002J\u000e\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020\u0018J\b\u0010B\u001a\u00020/H\u0002J\u0006\u0010C\u001a\u00020/J \u0010D\u001a\u0004\u0018\u00010\u000b2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010>\u001a\u00020\u0018H\u0002J\u0017\u0010F\u001a\u00020/2\f\u00104\u001a\b\u0012\u0004\u0012\u00020/0.H\u0082\bJ\u0006\u0010G\u001a\u00020/J\u0010\u0010H\u001a\u00020/2\u0006\u0010I\u001a\u00020JH\u0002J\"\u0010K\u001a\u00020/2\u0006\u0010L\u001a\u00020\u00182\u0006\u0010M\u001a\u00020\u00182\b\b\u0002\u0010N\u001a\u00020\u0018H\u0002J\b\u0010O\u001a\u00020/H\u0016J\b\u0010P\u001a\u00020/H\u0016J\b\u0010Q\u001a\u00020/H\u0016J(\u0010R\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020/0.¢\u0006\u0002\b0¢\u0006\u0002\u0010SJ\u0018\u0010T\u001a\u00020/2\u0006\u0010U\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u001bH\u0002J2\u0010T\u001a\u00020/2\u0006\u0010U\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020/0.¢\u0006\u0002\b0H\u0002¢\u0006\u0002\u0010WJ.\u0010T\u001a\b\u0012\u0004\u0012\u00020+0*2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020/0.¢\u0006\u0002\b0¢\u0006\u0002\u00101JB\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020J2\u0006\u0010]\u001a\u00020\u00122\u0011\u0010^\u001a\r\u0012\u0004\u0012\u00020/0.¢\u0006\u0002\b0H\u0002¢\u0006\u0002\u0010_J\u0014\u0010`\u001a\u0004\u0018\u00010\u00032\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002J\f\u0010a\u001a\u00020/*\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00060\"R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006e"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "root", "Landroidx/compose/ui/node/LayoutNode;", "slotReusePolicy", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "NoIntrinsicsMessage", "", "approachComposedSlotIds", "Landroidx/compose/runtime/collection/MutableVector;", "", "approachMeasureScope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;", "approachPrecomposeSlotHandleMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "currentApproachIndex", "", "currentIndex", "nodeToNodeState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "precomposeMap", "precomposedCount", "reusableCount", "reusableSlotIdsSet", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "scope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "slotIdToNode", "value", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "setSlotReusePolicy", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "approachSubcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "createMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "createMeasureResult", "result", "placeChildrenBlock", "createNodeAt", "index", "disposeCurrentNodes", "disposeOrReuseStartingFromIndex", "startIndex", "disposeUnusedSlotsInApproach", "forceRecomposeChildren", "getSlotIdAtIndex", "foldedChildren", "ignoreRemeasureRequests", "makeSureStateIsConsistent", "markActiveNodesAsReused", "deactivate", "", "move", "from", "to", "count", "onDeactivate", "onRelease", "onReuse", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "subcompose", "node", "nodeState", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "subcomposeInto", "Landroidx/compose/runtime/ReusableComposition;", "existing", "container", "reuseContent", "parent", "composable", "(Landroidx/compose/runtime/ReusableComposition;Landroidx/compose/ui/node/LayoutNode;ZLandroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/ReusableComposition;", "takeNodeFromReusables", "resetLayoutState", "ApproachMeasureScopeImpl", "NodeState", "Scope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 0;
    private final String NoIntrinsicsMessage;
    private final MutableVector<Object> approachComposedSlotIds;
    private final ApproachMeasureScopeImpl approachMeasureScope;
    private final MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> approachPrecomposeSlotHandleMap;
    private CompositionContext compositionContext;
    private int currentApproachIndex;
    private int currentIndex;
    private final MutableScatterMap<LayoutNode, NodeState> nodeToNodeState;
    private final MutableScatterMap<Object, LayoutNode> precomposeMap;
    private int precomposedCount;
    private int reusableCount;
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet;
    private final LayoutNode root;
    private final Scope scope;
    private final MutableScatterMap<Object, LayoutNode> slotIdToNode;
    private SubcomposeSlotReusePolicy slotReusePolicy;

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003Je\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00172\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a¢\u0006\u0002\b\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096\u0001JH\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00172\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096\u0001J0\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010#\u001a\u0004\u0018\u00010$2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u001c0&¢\u0006\u0002\b'H\u0016¢\u0006\u0002\u0010(J\u0017\u0010)\u001a\u00020\u0014*\u00020*H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010)\u001a\u00020\u0014*\u00020-H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020**\u00020-H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001a\u00100\u001a\u00020**\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001a\u00100\u001a\u00020**\u00020\u0014H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00105J\u0017\u00106\u001a\u000207*\u000208H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u0005*\u00020*H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b<\u00104J\u0017\u0010;\u001a\u00020\u0005*\u00020-H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b=\u00102J\r\u0010>\u001a\u00020?*\u00020@H\u0097\u0001J\u0017\u0010A\u001a\u000208*\u000207H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010:J\u0017\u0010C\u001a\u00020-*\u00020*H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001a\u0010C\u001a\u00020-*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010EJ\u001a\u0010C\u001a\u00020-*\u00020\u0014H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "isLookingAhead", "", "()Z", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "roundToPx", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;
        final /* synthetic */ LayoutNodeSubcompositionsState this$0;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int r2, int r3, Map<AlignmentLine, Integer> r4, Function1<? super Placeable.PlacementScope, Unit> r5) {
            return this.$$delegate_0.layout(r2, r3, r4, r5);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int r7, int r8, Map<AlignmentLine, Integer> r9, Function1<? super RulerScope, Unit> r10, Function1<? super Placeable.PlacementScope, Unit> r11) {
            return this.$$delegate_0.layout(r7, r8, r9, r10, r11);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public int mo369roundToPxR2X_6o(long r2) {
            return this.$$delegate_0.mo369roundToPxR2X_6o(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public int mo370roundToPx0680j_4(float r2) {
            return this.$$delegate_0.mo370roundToPx0680j_4(r2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public float mo371toDpGaN1DYA(long r2) {
            return this.$$delegate_0.mo371toDpGaN1DYA(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo372toDpu2uoSUM(float r2) {
            return this.$$delegate_0.mo372toDpu2uoSUM(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo373toDpu2uoSUM(int r2) {
            return this.$$delegate_0.mo373toDpu2uoSUM(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public long mo374toDpSizekrfVVM(long r3) {
            return this.$$delegate_0.mo374toDpSizekrfVVM(r3);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo375toPxR2X_6o(long r2) {
            return this.$$delegate_0.mo375toPxR2X_6o(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public float mo376toPx0680j_4(float r2) {
            return this.$$delegate_0.mo376toPx0680j_4(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect r2) {
            return this.$$delegate_0.toRect(r2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public long mo377toSizeXkaWNTQ(long r3) {
            return this.$$delegate_0.mo377toSizeXkaWNTQ(r3);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public long mo378toSp0xMU5do(float r3) {
            return this.$$delegate_0.mo378toSp0xMU5do(r3);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo379toSpkPz2Gy4(float r3) {
            return this.$$delegate_0.mo379toSpkPz2Gy4(r3);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo380toSpkPz2Gy4(int r3) {
            return this.$$delegate_0.mo380toSpkPz2Gy4(r3);
        }

        public ApproachMeasureScopeImpl(LayoutNodeSubcompositionsState this$0) {
            this.this$0 = this$0;
            this.$$delegate_0 = LayoutNodeSubcompositionsState.access$getScope$p(this.this$0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object slotId, Function2<? super Composer, ? super Integer, Unit> r5) {
            LayoutNode nodeInSlot = (LayoutNode) LayoutNodeSubcompositionsState.access$getSlotIdToNode$p(this.this$0).get(slotId);
            if (nodeInSlot == null) goto L9;
            if (LayoutNodeSubcompositionsState.access$getRoot$p(this.this$0).getFoldedChildren$ui_release().indexOf(nodeInSlot) >= LayoutNodeSubcompositionsState.access$getCurrentIndex$p(this.this$0)) goto L9;
            return nodeInSlot.getChildMeasurables$ui_release();
        L9:
            return LayoutNodeSubcompositionsState.access$approachSubcompose(this.this$0, slotId, r5);
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B.\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR'\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "", "slotId", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "composition", "Landroidx/compose/runtime/ReusableComposition;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ReusableComposition;)V", "value", "", "active", "getActive", "()Z", "setActive", "(Z)V", "activeState", "Landroidx/compose/runtime/MutableState;", "getActiveState", "()Landroidx/compose/runtime/MutableState;", "setActiveState", "(Landroidx/compose/runtime/MutableState;)V", "getComposition", "()Landroidx/compose/runtime/ReusableComposition;", "setComposition", "(Landroidx/compose/runtime/ReusableComposition;)V", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "forceRecompose", "getForceRecompose", "setForceRecompose", "forceReuse", "getForceReuse", "setForceReuse", "getSlotId", "()Ljava/lang/Object;", "setSlotId", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class NodeState {
        private MutableState<Boolean> activeState;
        private ReusableComposition composition;
        private Function2<? super Composer, ? super Integer, Unit> content;
        private boolean forceRecompose;
        private boolean forceReuse;
        private Object slotId;

        public NodeState(Object slotId, Function2<? super Composer, ? super Integer, Unit> r5, ReusableComposition composition) {
            this.slotId = slotId;
            this.content = r5;
            this.composition = composition;
            this.activeState = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        }

        public /* synthetic */ NodeState(Object r1, Function2 r2, ReusableComposition r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 4) == 0) goto L5;
            r3 = null;
        L5:
            this(r1, r2, r3);
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setSlotId(Object r1) {
            this.slotId = r1;
        }

        public final Function2<Composer, Integer, Unit> getContent() {
            return this.content;
        }

        public final void setContent(Function2<? super Composer, ? super Integer, Unit> r1) {
            this.content = r1;
        }

        public final ReusableComposition getComposition() {
            return this.composition;
        }

        public final void setComposition(ReusableComposition r1) {
            this.composition = r1;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final void setForceRecompose(boolean r1) {
            this.forceRecompose = r1;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final void setForceReuse(boolean r1) {
            this.forceReuse = r1;
        }

        public final MutableState<Boolean> getActiveState() {
            return this.activeState;
        }

        public final void setActiveState(MutableState<Boolean> r1) {
            this.activeState = r1;
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        public final void setActive(boolean value) {
            this.activeState.setValue(Boolean.valueOf(value));
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J`\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00180\u001b2\u0019\u0010\u001d\u001a\u0015\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001e¢\u0006\u0002\b!2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0002\b!H\u0016J0\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\b\u0010'\u001a\u0004\u0018\u00010(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020 0*¢\u0006\u0002\b+H\u0016¢\u0006\u0002\u0010,R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006-"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "density", "", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", "isLookingAhead", "", "()Z", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection;
        final /* synthetic */ LayoutNodeSubcompositionsState this$0;

        public Scope(LayoutNodeSubcompositionsState this$0) {
            this.this$0 = this$0;
            this.layoutDirection = LayoutDirection.Rtl;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void setLayoutDirection(LayoutDirection r1) {
            this.layoutDirection = r1;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        public void setDensity(float r1) {
            this.density = r1;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        public void setFontScale(float r1) {
            this.fontScale = r1;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            if (LayoutNodeSubcompositionsState.access$getRoot$p(this.this$0).getLayoutState$ui_release() != LayoutNode.LayoutState.LookaheadLayingOut) goto L5;
        L8:
            return true;
        L5:
            if (LayoutNodeSubcompositionsState.access$getRoot$p(this.this$0).getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring) goto L8;
            return false;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object slotId, Function2<? super Composer, ? super Integer, Unit> r3) {
            return this.this$0.subcompose(slotId, r3);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(final int width, final int height, final Map<AlignmentLine, Integer> r11, final Function1<? super RulerScope, Unit> r12, final Function1<? super Placeable.PlacementScope, Unit> r13) {
            if ((width & ViewCompat.MEASURED_STATE_MASK) == 0) goto L5;
        L7:
            boolean value$iv$iv = false;
        L9:
            if (value$iv$iv == true) goto L11;
            InlineClassHelperKt.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        L11:
            final LayoutNodeSubcompositionsState r6 = this.this$0;
            return new LayoutNodeSubcompositionsState$Scope$layout$1(width, height, r11, r12, this, r6, r13);
        L5:
            if (((-16777216) & height) != 0) goto L7;
            value$iv$iv = true;
            goto L9
        }
    }

    static {
        $stable = 8;
    }

    public LayoutNodeSubcompositionsState(LayoutNode root, SubcomposeSlotReusePolicy slotReusePolicy) {
        this.root = root;
        this.slotReusePolicy = slotReusePolicy;
        this.nodeToNodeState = ScatterMapKt.mutableScatterMapOf();
        this.slotIdToNode = ScatterMapKt.mutableScatterMapOf();
        this.scope = new Scope(this);
        this.approachMeasureScope = new ApproachMeasureScopeImpl(this);
        this.precomposeMap = ScatterMapKt.mutableScatterMapOf();
        this.reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
        this.approachPrecomposeSlotHandleMap = ScatterMapKt.mutableScatterMapOf();
        this.approachComposedSlotIds = new MutableVector(new Object[16], 0);
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final /* synthetic */ List access$approachSubcompose(LayoutNodeSubcompositionsState $this, Object slotId, Function2 content) {
        return $this.approachSubcompose(slotId, content);
    }

    public static final /* synthetic */ void access$disposeUnusedSlotsInApproach(LayoutNodeSubcompositionsState $this) {
        $this.disposeUnusedSlotsInApproach();
    }

    public static final /* synthetic */ ApproachMeasureScopeImpl access$getApproachMeasureScope$p(LayoutNodeSubcompositionsState $this) {
        return $this.approachMeasureScope;
    }

    public static final /* synthetic */ int access$getCurrentApproachIndex$p(LayoutNodeSubcompositionsState $this) {
        return $this.currentApproachIndex;
    }

    public static final /* synthetic */ int access$getCurrentIndex$p(LayoutNodeSubcompositionsState $this) {
        return $this.currentIndex;
    }

    public static final /* synthetic */ MutableScatterMap access$getPrecomposeMap$p(LayoutNodeSubcompositionsState $this) {
        return $this.precomposeMap;
    }

    public static final /* synthetic */ int access$getPrecomposedCount$p(LayoutNodeSubcompositionsState $this) {
        return $this.precomposedCount;
    }

    public static final /* synthetic */ int access$getReusableCount$p(LayoutNodeSubcompositionsState $this) {
        return $this.reusableCount;
    }

    public static final /* synthetic */ LayoutNode access$getRoot$p(LayoutNodeSubcompositionsState $this) {
        return $this.root;
    }

    public static final /* synthetic */ Scope access$getScope$p(LayoutNodeSubcompositionsState $this) {
        return $this.scope;
    }

    public static final /* synthetic */ MutableScatterMap access$getSlotIdToNode$p(LayoutNodeSubcompositionsState $this) {
        return $this.slotIdToNode;
    }

    public static final /* synthetic */ void access$move(LayoutNodeSubcompositionsState $this, int from, int to, int count) {
        $this.move(from, to, count);
    }

    public static final /* synthetic */ void access$setCurrentApproachIndex$p(LayoutNodeSubcompositionsState $this, int r1) {
        $this.currentApproachIndex = r1;
    }

    public static final /* synthetic */ void access$setCurrentIndex$p(LayoutNodeSubcompositionsState $this, int r1) {
        $this.currentIndex = r1;
    }

    public static final /* synthetic */ void access$setPrecomposedCount$p(LayoutNodeSubcompositionsState $this, int r1) {
        $this.precomposedCount = r1;
    }

    public static final /* synthetic */ void access$setReusableCount$p(LayoutNodeSubcompositionsState $this, int r1) {
        $this.reusableCount = r1;
    }

    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    public final void setCompositionContext(CompositionContext r1) {
        this.compositionContext = r1;
    }

    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy value) {
        if (this.slotReusePolicy == value) goto L6;
        this.slotReusePolicy = value;
        markActiveNodesAsReused(false);
        LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, false, 7, null);
        return;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    public final List<Measurable> subcompose(Object slotId, Function2<? super Composer, ? super Integer, Unit> r14) {
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState = this.root.getLayoutState$ui_release();
        boolean value$iv = false;
        if (layoutState != LayoutNode.LayoutState.Measuring) goto L5;
    L12:
        boolean value$iv2 = true;
    L14:
        if (value$iv2 == true) goto L16;
        InlineClassHelperKt.throwIllegalStateException("subcompose can only be used inside the measure or layout blocks");
    L16:
        MutableScatterMap<Object, LayoutNode> r1 = this.slotIdToNode;
        LayoutNode r5 = r1.get(slotId);
        if (r5 != null) goto L32;
        LayoutNode precomposed = this.precomposeMap.remove(slotId);
        if (precomposed != null) goto L21;
        LayoutNode r7 = takeNodeFromReusables(slotId);
        if (r7 != null) goto L31;
        r7 = createNodeAt(this.currentIndex);
    L31:
        r5 = r7;
        r1.set(slotId, r5);
        goto L32
    L21:
        if (this.precomposedCount <= 0) goto L23;
        boolean value$iv3 = true;
    L25:
        if (value$iv3 == true) goto L27;
        InlineClassHelperKt.throwIllegalStateException("Check failed.");
    L27:
        this.precomposedCount--;
        r7 = precomposed;
        goto L31
    L23:
        value$iv3 = false;
    L32:
        LayoutNode node = r5;
        if (CollectionsKt.getOrNull(this.root.getFoldedChildren$ui_release(), this.currentIndex) == node) goto L43;
        int itemIndex = this.root.getFoldedChildren$ui_release().indexOf(node);
        if (itemIndex < this.currentIndex) goto L38;
        value$iv = true;
    L38:
        if (value$iv == true) goto L40;
        InlineClassHelperKt.throwIllegalArgumentException("Key \"" + slotId + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
    L40:
        int $i$f$requirePrecondition = this.currentIndex;
        if ($i$f$requirePrecondition == itemIndex) goto L43;
        move$default(this, itemIndex, this.currentIndex, 0, 4, null);
    L43:
        this.currentIndex++;
        subcompose(node, slotId, r14);
        if (layoutState == LayoutNode.LayoutState.Measuring) goto L50;
        if (layoutState == LayoutNode.LayoutState.LayingOut) goto L50;
        return node.getChildLookaheadMeasurables$ui_release();
    L50:
        return node.getChildMeasurables$ui_release();
    L5:
        if (layoutState == LayoutNode.LayoutState.LayingOut) goto L12;
        if (layoutState == LayoutNode.LayoutState.LookaheadMeasuring) goto L12;
        if (layoutState == LayoutNode.LayoutState.LookaheadLayingOut) goto L12;
        value$iv2 = false;
        goto L14
    }

    private final void subcompose(LayoutNode node, Object slotId, Function2<? super Composer, ? super Integer, Unit> r12) {
        MutableScatterMap<LayoutNode, NodeState> r0 = this.nodeToNodeState;
        Object r2 = r0.get(node);
        if (r2 != null) goto L6;
        ReusableComposition r6 = null;
        NodeState r3 = new NodeState(slotId, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m5706getLambda1$ui_release(), r6, 4, null);
        r0.set(node, r3);
        r2 = r3;
    L6:
        Object slotId2 = r2;
        NodeState nodeState = (NodeState) slotId2;
        ReusableComposition r1 = nodeState.getComposition();
        if (r1 == null) goto L9;
        boolean hasPendingChanges = r1.getHasInvalidations();
    L11:
        if (nodeState.getContent() != r12) goto L15;
        if (hasPendingChanges == true) goto L15;
        if (nodeState.getForceRecompose() == true) goto L15;
        return;
    L15:
        nodeState.setContent(r12);
        subcompose(node, nodeState);
        nodeState.setForceRecompose(false);
        return;
    L9:
        hasPendingChanges = true;
        goto L11
    }

    private final void subcompose(LayoutNode node, final NodeState nodeState) {
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L5;
        Function1<Object, Unit> r0 = previousSnapshot$iv.getReadObserver();
    L6:
        Function1<Object, Unit> r5 = r0;
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        LayoutNode this_$iv$iv = this.root;     // Catch: Throwable -> L19
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv$iv, true);     // Catch: Throwable -> L19
        final Function2<Composer, Integer, Unit> r13 = nodeState.getContent();     // Catch: Throwable -> L19
        ReusableComposition r15 = nodeState.getComposition();     // Catch: Throwable -> L19
        CompositionContext r11 = this.compositionContext;     // Catch: Throwable -> L19
        if (r11 == null) goto L15;
        boolean r17 = nodeState.getForceReuse();     // Catch: Throwable -> L19
        nodeState.setComposition(subcomposeInto(r15, node, r17, r11, ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new LayoutNodeSubcompositionsState$subcompose$3$1$1(nodeState, r13))));     // Catch: Throwable -> L17
        nodeState.setForceReuse(false);     // Catch: Throwable -> L17
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv$iv, false);     // Catch: Throwable -> L17
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L17
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r5);
        return;
    L15:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("parent composition reference not set");     // Catch: Throwable -> L17
        throw new KotlinNothingValueException();     // Catch: Throwable -> L17
    L17:
        th = th;
    L21:
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r5);
        throw th;
    L19:
        th = th;
        goto L21
    L5:
        r0 = null;
        goto L6
    }

    private final ReusableComposition subcomposeInto(ReusableComposition existing, LayoutNode container, boolean reuseContent, CompositionContext parent, Function2<? super Composer, ? super Integer, Unit> r8) {
        if (existing != null) goto L4;
    L7:
        ReusableComposition r0 = SubcompositionKt.createSubcomposition(container, parent);
    L8:
        ReusableComposition $this$subcomposeInto_u24lambda_u246 = r0;
        if (reuseContent == true) goto L11;
        $this$subcomposeInto_u24lambda_u246.setContent(r8);
    L13:
        return r0;
    L11:
        $this$subcomposeInto_u24lambda_u246.setContentWithReuse(r8);
        goto L13
    L4:
        if (existing.isDisposed() == true) goto L7;
        r0 = existing;
        goto L8
    }

    private final Object getSlotIdAtIndex(List<LayoutNode> r3, int index) {
        LayoutNode node = r3.get(index);
        NodeState r1 = this.nodeToNodeState.get(node);
        Intrinsics.checkNotNull(r1);
        return r1.getSlotId();
    }

    public final void disposeOrReuseStartingFromIndex(int startIndex) {
        int r2 = startIndex;
        this.reusableCount = 0;
        List<LayoutNode> r3 = this.root.getFoldedChildren$ui_release();
        boolean r5 = true;
        int lastReusableIndex = (r3.size() - this.precomposedCount) - 1;
        boolean needApplyNotification = false;
        if (r2 > lastReusableIndex) goto L47;
        this.reusableSlotIdsSet.clear();
        int i = startIndex;
        if (i > lastReusableIndex) goto L9;
    L6:
        this.reusableSlotIdsSet.add$ui_release(getSlotIdAtIndex(r3, i));
        if (i == lastReusableIndex) goto L9;
        i = i + 1;
    L9:
        this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
        int i2 = lastReusableIndex;
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L12;
        Function1<Object, Unit> r11 = previousSnapshot$iv.getReadObserver();
    L13:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
    L14:
        if (i2 < r2) goto L41;
        LayoutNode node = r3.get(i2);     // Catch: Throwable -> L39
        NodeState r15 = this.nodeToNodeState.get(node);     // Catch: Throwable -> L39
        Intrinsics.checkNotNull(r15);     // Catch: Throwable -> L39
        NodeState nodeState = r15;     // Catch: Throwable -> L39
        Object slotId = nodeState.getSlotId();     // Catch: Throwable -> L39
        boolean r16 = r5;
        if (this.reusableSlotIdsSet.contains(slotId) == false) goto L25;
        this.reusableCount++;     // Catch: Throwable -> L22
        if (nodeState.getActive() == false) goto L21;
        resetLayoutState(node);     // Catch: Throwable -> L22
        nodeState.setActive(false);     // Catch: Throwable -> L22
        needApplyNotification = true;
        boolean r4 = r16;
        Object foldedChildren = null;
    L59:
        this.slotIdToNode.remove(slotId);     // Catch: Throwable -> L43
        i2 = i2 - 1;     // Catch: Throwable -> L43
        r2 = startIndex;
        r5 = r4;
        r3 = r3;
        lastReusableIndex = lastReusableIndex;
    L43:
        Throwable th = th;
    L44:
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r11);
        throw th;
    L21:
        r4 = r16;
        foldedChildren = null;
    L22:
        th = th;
        goto L44
    L25:
        LayoutNode this_$iv$iv = this.root;     // Catch: Throwable -> L39
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv$iv, r16);     // Catch: Throwable -> L37
        this.nodeToNodeState.remove(node);     // Catch: Throwable -> L37
        ReusableComposition r6 = nodeState.getComposition();     // Catch: Throwable -> L37
        if (r6 != null) goto L51;
    L33:
        r4 = true;
        this.root.removeAt$ui_release(i2, 1);     // Catch: Throwable -> L43
        foldedChildren = null;
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv$iv, false);     // Catch: Throwable -> L43
        goto L59
    L51:
        r6.dispose();     // Catch: Throwable -> L31
    L31:
        th = th;
    L37:
        th = th;
    L39:
        th = th;
        goto L44
    L41:
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L43
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r11);
        goto L47
    L12:
        r11 = null;
    L47:
        if (needApplyNotification == false) goto L49;
        Snapshot.Companion.sendApplyNotifications();
    L49:
        makeSureStateIsConsistent();
    }

    private final void markActiveNodesAsReused(boolean deactivate) {
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        List<LayoutNode> r2 = this.root.getFoldedChildren$ui_release();
        int childCount = r2.size();
        if (this.reusableCount == childCount) goto L28;
        this.reusableCount = childCount;
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L7;
        Function1<Object, Unit> r8 = previousSnapshot$iv.getReadObserver();
    L8:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        int i = 0;
    L9:
        if (i >= childCount) goto L23;
        LayoutNode node = r2.get(i);     // Catch: Throwable -> L25
        NodeState nodeState = this.nodeToNodeState.get(node);     // Catch: Throwable -> L25
        if (nodeState == null) goto L22;
        if (nodeState.getActive() == false) goto L22;
        resetLayoutState(node);     // Catch: Throwable -> L25
        if (deactivate == false) goto L20;
        ReusableComposition r14 = nodeState.getComposition();     // Catch: Throwable -> L25
        if (r14 == null) goto L19;
        r14.deactivate();     // Catch: Throwable -> L25
    L19:
        nodeState.setActiveState(SnapshotStateKt.mutableStateOf$default(false, null, 2, null));     // Catch: Throwable -> L25
    L21:
        nodeState.setSlotId(SubcomposeLayoutKt.access$getReusedSlotId$p());     // Catch: Throwable -> L25
        goto L22
    L20:
        nodeState.setActive(false);     // Catch: Throwable -> L25
    L22:
        i = i + 1;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r8);
        throw th;
    L23:
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L25
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r8);
        this.slotIdToNode.clear();
        goto L28
    L7:
        r8 = null;
    L28:
        makeSureStateIsConsistent();
    }

    private final void disposeCurrentNodes() {
        LayoutNode this_$iv = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv, true);
        int r4 = 0;
        ScatterMap this_$iv2 = this.nodeToNodeState;
        Object[] v$iv = this_$iv2.values;
        long[] m$iv$iv = this_$iv2.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L23;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r19 = r4;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L19;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
        long slot$iv$iv2 = slot$iv$iv;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L18;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        NodeState it = (NodeState) v$iv[index$iv$iv];
        ReusableComposition r23 = it.getComposition();
        if (r23 == null) goto L17;
        r23.dispose();
    L17:
        slot$iv$iv2 = slot$iv$iv2 >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L7
    L11:
        r17 = false;
        goto L12
    L18:
        if (bitCount$iv$iv != 8) goto L23;
    L19:
        if (i$iv$iv == lastIndex$iv$iv) goto L23;
        i$iv$iv = i$iv$iv + 1;
        r4 = r19;
    L23:
        this.root.removeAll$ui_release();
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv, false);
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    public final void makeSureStateIsConsistent() {
        int childrenCount = this.root.getFoldedChildren$ui_release().size();
        boolean value$iv = true;
        if (this.nodeToNodeState.getSize() != childrenCount) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.getSize() + ") and the children count on the SubcomposeLayout (" + childrenCount + "). Are you trying to use the state of the disposed SubcomposeLayout?");
    L10:
        if (((childrenCount - this.reusableCount) - this.precomposedCount) < 0) goto L12;
        boolean value$iv3 = true;
    L14:
        if (value$iv3 == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Total children " + childrenCount + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount);
    L17:
        if (this.precomposeMap.getSize() == this.precomposedCount) goto L21;
        value$iv = false;
    L21:
        if (value$iv == true) goto L25;
        InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.getSize());
        return;
    L25:
        return;
    L12:
        value$iv3 = false;
        goto L14
    L5:
        value$iv2 = false;
        goto L7
    }

    private final void resetLayoutState(LayoutNode $this$resetLayoutState) {
        $this$resetLayoutState.getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        LookaheadPassDelegate it = $this$resetLayoutState.getLookaheadPassDelegate$ui_release();
        if (it == null) goto L6;
        it.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        return;
    }

    private final LayoutNode takeNodeFromReusables(Object slotId) {
        if (this.reusableCount != 0) goto L5;
        return null;
    L5:
        List<LayoutNode> r0 = this.root.getFoldedChildren$ui_release();
        int reusableNodesSectionEnd = r0.size() - this.precomposedCount;
        int reusableNodesSectionStart = reusableNodesSectionEnd - this.reusableCount;
        int index = reusableNodesSectionEnd - 1;
        int chosenIndex = -1;
    L6:
        if (index < reusableNodesSectionStart) goto L12;
        if (Intrinsics.areEqual(getSlotIdAtIndex(r0, index), slotId) == true) goto L9;
        index = index - 1;
        goto L6
    L9:
        chosenIndex = index;
    L12:
        if (chosenIndex != (-1)) goto L22;
        index = reusableNodesSectionEnd - 1;
    L14:
        if (index < reusableNodesSectionStart) goto L22;
        NodeState r8 = this.nodeToNodeState.get(r0.get(index));
        Intrinsics.checkNotNull(r8);
        NodeState nodeState = r8;
        if (nodeState.getSlotId() == SubcomposeLayoutKt.access$getReusedSlotId$p()) goto L21;
        if (this.slotReusePolicy.areCompatible(slotId, nodeState.getSlotId()) == true) goto L21;
        index = index - 1;
    L21:
        nodeState.setSlotId(slotId);
        chosenIndex = index;
    L22:
        if (chosenIndex != (-1)) goto L25;
        return null;
    L25:
        if (index == reusableNodesSectionStart) goto L27;
        move(index, reusableNodesSectionStart, 1);
    L27:
        this.reusableCount--;
        LayoutNode node = r0.get(reusableNodesSectionStart);
        NodeState r9 = this.nodeToNodeState.get(node);
        Intrinsics.checkNotNull(r9);
        NodeState nodeState2 = r9;
        nodeState2.setActiveState(SnapshotStateKt.mutableStateOf$default(true, null, 2, null));
        nodeState2.setForceReuse(true);
        nodeState2.setForceRecompose(true);
        return node;
    }

    public final MeasurePolicy createMeasurePolicy(final Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> r3) {
        final String r0 = this.NoIntrinsicsMessage;
        return new AnonymousClass1(this, r3, r0);
    }

    private final void disposeUnusedSlotsInApproach() {
        MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> r1 = this.approachPrecomposeSlotHandleMap;
        int $i$f$removeIf = 0;
        MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> this_$iv$iv = r1;
        long[] m$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L36;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L30;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L27;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        boolean r17 = false;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L25;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r16 = r11;
        Object slotId = r1.keys[index$iv$iv];
        int $i$f$removeIf2 = $i$f$removeIf;
        SubcomposeLayoutState.PrecomposedSlotHandle handle = (SubcomposeLayoutState.PrecomposedSlotHandle) r1.values[index$iv$iv];
        int id = this.approachComposedSlotIds.indexOf(slotId);
        if (id < 0) goto L19;
        ScatterMap this_$iv$iv2 = this_$iv$iv;
        if (id < this.currentApproachIndex) goto L22;
    L20:
        handle.dispose();
        r17 = true;
    L22:
        if (r17 == false) goto L26;
        r1.removeValueAt(index$iv$iv);
    L26:
        slot$iv$iv = slot$iv$iv >> r16;
        j$iv$iv = j$iv$iv + 1;
        r11 = r16;
        $i$f$removeIf = $i$f$removeIf2;
        this_$iv$iv = this_$iv$iv2;
        goto L7
    L19:
        this_$iv$iv2 = this_$iv$iv;
        goto L20
    L25:
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv2 = this_$iv$iv;
        r16 = r11;
        goto L26
    L11:
        r13 = false;
        goto L12
    L27:
        int $i$f$removeIf3 = $i$f$removeIf;
        ScatterMap this_$iv$iv3 = this_$iv$iv;
        if (bitCount$iv$iv != r11) goto L43;
    L31:
        if (i$iv$iv == lastIndex$iv$iv) goto L44;
        i$iv$iv = i$iv$iv + 1;
        $i$f$removeIf = $i$f$removeIf3;
        this_$iv$iv = this_$iv$iv3;
        goto L4
    L44:
        return;
    L43:
        return;
    L30:
        $i$f$removeIf3 = $i$f$removeIf;
        this_$iv$iv3 = this_$iv$iv;
        goto L31
    }

    private final MeasureResult createMeasureResult(final MeasureResult result, final Function0<Unit> r4) {
        return new C06371(result, r4);
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(final Object slotId, Function2<? super Composer, ? super Integer, Unit> r11) {
        if (this.root.isAttached() == false) goto L5;
        makeSureStateIsConsistent();
        if (this.slotIdToNode.containsKey(slotId) == true) goto L17;
        this.approachPrecomposeSlotHandleMap.remove(slotId);
        MutableScatterMap<Object, LayoutNode> r0 = this.precomposeMap;
        LayoutNode r2 = r0.get(slotId);
        if (r2 != null) goto L15;
        LayoutNode reusedNode = takeNodeFromReusables(slotId);
        LayoutNode r4 = this.root;
        if (reusedNode == null) goto L13;
        int nodeIndex = r4.getFoldedChildren$ui_release().indexOf(reusedNode);
        move(nodeIndex, this.root.getFoldedChildren$ui_release().size(), 1);
        this.precomposedCount++;
        LayoutNode r5 = reusedNode;
    L14:
        r2 = r5;
        r0.set(slotId, r2);
        goto L15
    L13:
        r5 = createNodeAt(r4.getFoldedChildren$ui_release().size());
        this.precomposedCount++;
    L15:
        LayoutNode node = r2;
        subcompose(node, slotId, r11);
    L17:
        return new AnonymousClass2(this, slotId);
    L5:
        return new C06381();
    }

    public final void forceRecomposeChildren() {
        int childCount = this.root.getFoldedChildren$ui_release().size();
        if (this.reusableCount == childCount) goto L30;
        ScatterMap this_$iv = this.nodeToNodeState;
        int $i$f$forEachValue = 0;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L27;
    L6:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int childCount2 = childCount;
        ScatterMap this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L9:
        if (j$iv$iv >= bitCount$iv$iv) goto L18;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        int r19 = r2;
        if (value$iv$iv$iv >= 128) goto L13;
        boolean r18 = true;
    L14:
        if (r18 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        NodeState nodeState = (NodeState) v$iv[index$iv$iv];
        nodeState.setForceRecompose(true);
    L17:
        slot$iv$iv = slot$iv$iv >> r19;
        j$iv$iv = j$iv$iv + 1;
        r2 = r19;
        $i$f$forEachValue = $i$f$forEachValue;
        goto L9
    L13:
        r18 = false;
        goto L14
    L18:
        int $i$f$forEachValue2 = $i$f$forEachValue;
        if (bitCount$iv$iv != r2) goto L27;
    L22:
        if (i$iv$iv == lastIndex$iv$iv) goto L27;
        i$iv$iv = i$iv$iv + 1;
        childCount = childCount2;
        this_$iv = this_$iv2;
        $i$f$forEachValue = $i$f$forEachValue2;
        goto L6
    L21:
        $i$f$forEachValue2 = $i$f$forEachValue;
    L27:
        if (this.root.getMeasurePending$ui_release() == true) goto L36;
        LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, false, 7, null);
        return;
    L36:
        return;
    }

    private final LayoutNode createNodeAt(int index) {
        LayoutNode node = new LayoutNode(true, 0, 2, null);
        LayoutNode this_$iv$iv = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv$iv, true);
        this.root.insertAt$ui_release(index, node);
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv$iv, false);
        return node;
    }

    static /* synthetic */ void move$default(LayoutNodeSubcompositionsState r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 1;
    L5:
        r0.move(r1, r2, r3);
    }

    private final void move(int from, int to, int count) {
        LayoutNode this_$iv$iv = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv$iv, true);
        this.root.move$ui_release(from, to, count);
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv$iv, false);
    }

    private final void ignoreRemeasureRequests(Function0<Unit> r5) {
        LayoutNode this_$iv = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv, true);
        r5.invoke();
        LayoutNode.access$setIgnoreRemeasureRequests$p(this_$iv, false);
    }

    private final List<Measurable> approachSubcompose(Object slotId, Function2<? super Composer, ? super Integer, Unit> r14) {
        if (this.approachComposedSlotIds.getSize() < this.currentApproachIndex) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
    L9:
        int r0 = this.approachComposedSlotIds.getSize();
        int r1 = this.currentApproachIndex;
        MutableVector<Object> r3 = this.approachComposedSlotIds;
        if (r0 != r1) goto L12;
        r3.add(slotId);
    L13:
        this.currentApproachIndex++;
        if (this.precomposeMap.contains(slotId) == true) goto L19;
        SubcomposeLayoutState.PrecomposedSlotHandle it = precompose(slotId, r14);
        this.approachPrecomposeSlotHandleMap.set(slotId, it);
        LayoutNode.LayoutState r2 = this.root.getLayoutState$ui_release();
        LayoutNode.LayoutState r4 = LayoutNode.LayoutState.LayingOut;
        LayoutNode r5 = this.root;
        if (r2 != r4) goto L18;
        r5.requestLookaheadRelayout$ui_release(true);
        goto L19
    L18:
        LayoutNode.requestLookaheadRemeasure$ui_release$default(r5, true, false, false, 6, null);
    L19:
        LayoutNode $this$approachSubcompose_u24lambda_u2427 = this.precomposeMap.get(slotId);
        if ($this$approachSubcompose_u24lambda_u2427 == null) goto L27;
        List<MeasurePassDelegate> r6 = $this$approachSubcompose_u24lambda_u2427.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
        int index$iv = 0;
        int r8 = r6.size();
    L22:
        if (index$iv >= r8) goto L25;
        Object item$iv = r6.get(index$iv);
        MeasurePassDelegate delegate = (MeasurePassDelegate) item$iv;
        delegate.markDetachedFromParentLookaheadPass$ui_release();
        index$iv = index$iv + 1;
        goto L22
    L25:
        if (r6 == null) goto L27;
        return r6;
    L27:
        return CollectionsKt.emptyList();
    L12:
        r3.set(this.currentApproachIndex, slotId);
        goto L13
    L5:
        value$iv = false;
        goto L7
    }
}
