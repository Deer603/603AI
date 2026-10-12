package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ¨\u00012\u00020\u0001:\u0002¨\u0001B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B!\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\"\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u00032\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0003H\u0086@¢\u0006\u0003\u0010\u0081\u0001J,\u0010\u0082\u0001\u001a\u00020~2\u0007\u0010\u0083\u0001\u001a\u00020\u000f2\u0007\u0010\u0084\u0001\u001a\u00020\u001b2\t\b\u0002\u0010\u0085\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b\u0086\u0001J\u0012\u0010\u0087\u0001\u001a\u00020~2\u0007\u0010\u0088\u0001\u001a\u00020FH\u0002J\u0019\u0010\u0089\u0001\u001a\u00020~2\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u008b\u0001H\u0002J\u0012\u0010\u008c\u0001\u001a\u00020t2\u0007\u0010\u008d\u0001\u001a\u00020tH\u0016J\u001a\u0010\u008e\u0001\u001a\u00020\u00072\u0007\u0010\u008f\u0001\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0003H\u0002J\u001d\u0010\u0090\u0001\u001a\u00020~2\u0007\u0010\u008d\u0001\u001a\u00020t2\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u000fH\u0002J\u0012\u0010\u0091\u0001\u001a\u00020t2\u0007\u0010\u0092\u0001\u001a\u00020tH\u0002J\u001c\u0010\u0093\u0001\u001a\u00020~2\b\b\u0001\u0010\u007f\u001a\u00020\u00032\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0003JI\u0010\u0094\u0001\u001a\u00020~2\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012-\u0010\u0097\u0001\u001a(\b\u0001\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020~0\u009a\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u009b\u00010\u0098\u0001¢\u0006\u0003\b\u009c\u0001H\u0096@¢\u0006\u0003\u0010\u009d\u0001J\u0017\u0010{\u001a\u00020t2\u0007\u0010\u0084\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b\u009e\u0001J#\u0010\u009f\u0001\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u00032\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0003H\u0086@¢\u0006\u0003\u0010\u0081\u0001J)\u0010 \u0001\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u00032\u0007\u0010\u0080\u0001\u001a\u00020\u00032\u0007\u0010¡\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b¢\u0001J\"\u0010£\u0001\u001a\u00020\u00072\b\u0010¤\u0001\u001a\u00030¥\u00012\u0007\u0010¦\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b§\u0001R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u001b8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u001b8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u001e\u0010/\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u001b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001eR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010,R\u0014\u0010=\u001a\u00020>X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u001eR\u0014\u0010C\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001eR\u0011\u0010E\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0JX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010,\"\u0004\bM\u0010NR\u001c\u0010O\u001a\u00020PX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\"\u001a\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001b\u0010W\u001a\u00020X8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b[\u0010\\*\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020^X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u001c\u0010a\u001a\u00020PX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\"\u001a\u0004\bb\u0010RR\u000e\u0010c\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010d\u001a\u00020eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u001a\u0010h\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u001e\"\u0004\bj\u0010 R\"\u0010l\u001a\u0004\u0018\u00010k2\b\u0010\u000e\u001a\u0004\u0018\u00010k@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020pX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020xX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u000e\u0010{\u001a\u00020tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006©\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemOffset", "(II)V", "initialFirstVisibleItems", "", "initialFirstVisibleOffsets", "prefetchScheduler", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "([I[ILandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "_lazyLayoutScrollDeltaBetweenPasses", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "<set-?>", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "approachLayoutInfo", "getApproachLayoutInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "currentItemPrefetchHandles", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "firstVisibleItemIndex", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "hasLookaheadOccurred", "getHasLookaheadOccurred$foundation_release", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "isScrollInProgress", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "getItemAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "laneCount", "getLaneCount$foundation_release", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "lastScrolledBackward", "getLastScrolledBackward", "lastScrolledForward", "getLastScrolledForward", "layoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "measurePassCount", "getMeasurePassCount$foundation_release", "setMeasurePassCount$foundation_release", "(I)V", "measurementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "getMeasurementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "prefetchBaseIndex", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollDeltaBetweenPasses", "", "getScrollDeltaBetweenPasses$foundation_release", "()F", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "scrollToBeConsumed", "scrollableState", "animateScrollToItem", "", "index", "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "isLookingAhead", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "cancelPrefetchIfVisibleItemsChanged", "info", "clearLeftoverPrefetchHandles", "prefetchHandlesUsed", "", "dispatchRawDelta", "delta", "fillNearestIndices", "itemIndex", "notifyPrefetch", "onScroll", "distance", "requestScrollToItem", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToBeConsumed$foundation_release", "scrollToItem", "snapToItemInternal", "forceRemeasure", "snapToItemInternal$foundation_release", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Saver<LazyStaggeredGridState, Object> Saver = null;
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;
    private LazyStaggeredGridMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private boolean hasLookaheadOccurred;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> itemAnimator;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final MutableState<LazyStaggeredGridMeasureResult> layoutInfoState;
    private int measurePassCount;
    private final MutableState<Unit> measurementScopeInvalidator;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<Unit> placementScopeInvalidator;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.access$getSaver$cp();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ LazyStaggeredGridMeasureResult $layoutInfo;
        final /* synthetic */ int $numOfItemsToTeleport;
        final /* synthetic */ int $scrollOffset;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LazyStaggeredGridState this$0;

        AnonymousClass2(LazyStaggeredGridState r2, int r3, int r4, int r5, LazyStaggeredGridMeasureResult r6, Continuation<? super AnonymousClass2> r7) {
            this.this$0 = r2;
            this.$index = r3;
            this.$scrollOffset = r4;
            this.$numOfItemsToTeleport = r5;
            this.$layoutInfo = r6;
            super(2, r7);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
            AnonymousClass2 r0 = new AnonymousClass2(this.this$0, this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo, r9);
            r0.L$0 = r8;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ScrollScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ScrollScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            ScrollScope $this$scroll = (ScrollScope) this.L$0;
            this.label = 1;
            if (LazyLayoutScrollScopeKt.animateScrollToItem(LazyStaggeredGridScrollScopeKt.LazyLayoutScrollScope(this.this$0, $this$scroll), this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo.getDensity(), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1", f = "LazyStaggeredGridState.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ LazyStaggeredGridState this$0;

        AnonymousClass1(LazyStaggeredGridState r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (ScrollExtensionsKt.stopScroll$default(this.this$0, null, this, 1, null) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", i = {0, 0, 0}, l = {251, 252}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    static final class C03411 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ LazyStaggeredGridState this$0;

        C03411(LazyStaggeredGridState r1, Continuation<? super C03411> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.scroll(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C03422 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;
        final /* synthetic */ LazyStaggeredGridState this$0;

        C03422(LazyStaggeredGridState r2, int r3, int r4, Continuation<? super C03422> r5) {
            this.this$0 = r2;
            this.$index = r3;
            this.$scrollOffset = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new C03422(this.this$0, this.$index, this.$scrollOffset, r6);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ScrollScope r3, Continuation<? super Unit> r4) {
            return ((C03422) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ScrollScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r5);
            this.this$0.snapToItemInternal$foundation_release(this.$index, this.$scrollOffset, true);
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LazyStaggeredGridState(int[] initialFirstVisibleItems, int[] initialFirstVisibleOffsets, PrefetchScheduler prefetchScheduler) {
        this.scrollPosition = new LazyStaggeredGridScrollPosition(initialFirstVisibleItems, initialFirstVisibleOffsets, new LazyStaggeredGridState$scrollPosition$1(this));
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        this.canScrollForward$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.remeasurementModifier = new LazyStaggeredGridState$remeasurementModifier$1(this);
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyStaggeredGridState$scrollableState$1(this));
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.itemAnimator = new LazyLayoutItemAnimator();
        this.scrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m907constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m907constructorimpl$default(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public static final /* synthetic */ int[] access$fillNearestIndices(LazyStaggeredGridState $this, int itemIndex, int laneCount) {
        return $this.fillNearestIndices(itemIndex, laneCount);
    }

    public static final /* synthetic */ Saver access$getSaver$cp() {
        return Saver;
    }

    public static final /* synthetic */ float access$onScroll(LazyStaggeredGridState $this, float distance) {
        return $this.onScroll(distance);
    }

    public static final /* synthetic */ void access$setRemeasurement$p(LazyStaggeredGridState $this, Remeasurement r1) {
        $this.remeasurement = r1;
    }

    public /* synthetic */ LazyStaggeredGridState(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }

    public LazyStaggeredGridState(int initialFirstVisibleItemIndex, int initialFirstVisibleItemOffset) {
        this(new int[]{initialFirstVisibleItemIndex}, new int[]{initialFirstVisibleItemOffset}, null);
    }

    public final boolean getHasLookaheadOccurred$foundation_release() {
        return this.hasLookaheadOccurred;
    }

    public final LazyStaggeredGridMeasureResult getApproachLayoutInfo$foundation_release() {
        return this.approachLayoutInfo;
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation_release() {
        return this.scrollPosition;
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation_release() {
        return this.laneInfo;
    }

    private void setCanScrollForward(boolean r5) {
        MutableState $this$setValue$iv = this.canScrollForward$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        State $this$getValue$iv = this.canScrollForward$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private void setCanScrollBackward(boolean r5) {
        MutableState $this$setValue$iv = this.canScrollBackward$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        State $this$getValue$iv = this.canScrollBackward$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean r1) {
        this.prefetchingEnabled = r1;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final float scrollToBeConsumed$foundation_release(boolean isLookingAhead) {
        if (isLookingAhead == true) goto L8;
        if (this.hasLookaheadOccurred == false) goto L8;
        return getScrollDeltaBetweenPasses$foundation_release();
    L8:
        return this.scrollToBeConsumed;
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.measurePassCount;
    }

    public final void setMeasurePassCount$foundation_release(int r1) {
        this.measurePassCount = r1;
    }

    public final int getLaneCount$foundation_release() {
        return this.layoutInfoState.getValue().getSlots().getSizes().length;
    }

    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final MutableInteractionSource getMutableInteractionSource$foundation_release() {
        return this.mutableInteractionSource;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    public final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    private static Object getNearestRange$foundation_release$delegate(LazyStaggeredGridState r1) {
        return r1.scrollPosition.getNearestRangeState();
    }

    public final IntRange getNearestRange$foundation_release() {
        State $this$getValue$iv = this.scrollPosition.getNearestRangeState();
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m951getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority scrollPriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof C03411) == false) goto L7;
        C03411 r0 = (C03411) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L22:
        return Unit.INSTANCE;
    L13:
        Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> r8 = (Function2) r0.L$2;
        MutatePriority scrollPriority2 = (MutatePriority) r0.L$1;
        LazyStaggeredGridState r3 = (LazyStaggeredGridState) r0.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        ScrollableState r4 = r3.scrollableState;
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
        if (r4.scroll(scrollPriority2, r8, r0) != r2) goto L22;
        return r2;
    L14:
        ResultKt.throwOnFailure($result);
        r3 = this;
        AwaitFirstLayoutModifier r5 = r3.awaitLayoutModifier;
        r0.L$0 = r3;
        r0.L$1 = scrollPriority;
        r0.L$2 = r9;
        r0.label = 1;
        if (r5.waitForFirstLayout(r0) != r2) goto L17;
        return r2;
    L17:
        scrollPriority2 = scrollPriority;
        r8 = r9;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C03411(this, r10);
        goto L8
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    private final float onScroll(float distance) {
        if (distance >= 0.0f) goto L7;
        if (getCanScrollForward() == true) goto L7;
    L10:
        return 0.0f;
    L7:
        if (distance <= 0.0f) goto L12;
        if (getCanScrollBackward() == false) goto L10;
    L12:
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) goto L14;
        boolean value$iv = true;
    L16:
        if (value$iv == true) goto L18;
        InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
    L18:
        this.scrollToBeConsumed += distance;
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) goto L39;
        float preScrollToBeConsumed = this.scrollToBeConsumed;
        int intDelta = MathKt.roundToInt(this.scrollToBeConsumed);
        LazyStaggeredGridMeasureResult scrolledLayoutInfo = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(intDelta, !this.hasLookaheadOccurred);
        if (scrolledLayoutInfo != null) goto L23;
    L32:
        if (scrolledLayoutInfo == null) goto L34;
        applyMeasureResult$foundation_release(scrolledLayoutInfo, this.hasLookaheadOccurred, true);
        ObservableScopeInvalidator.m911invalidateScopeimpl(this.placementScopeInvalidator);
        notifyPrefetch(preScrollToBeConsumed - this.scrollToBeConsumed, scrolledLayoutInfo);
        goto L39
    L34:
        Remeasurement r3 = this.remeasurement;
        if (r3 == null) goto L37;
        r3.forceRemeasure();
    L37:
        notifyPrefetch$default(this, preScrollToBeConsumed - this.scrollToBeConsumed, null, 2, null);
        goto L39
    L23:
        if (this.approachLayoutInfo == null) goto L32;
        LazyStaggeredGridMeasureResult r7 = this.approachLayoutInfo;
        if (r7 == null) goto L27;
        LazyStaggeredGridMeasureResult scrolledApproachLayoutInfo = r7.copyWithScrollDeltaWithoutRemeasure(intDelta, true);
    L29:
        if (scrolledApproachLayoutInfo == null) goto L31;
        this.approachLayoutInfo = scrolledApproachLayoutInfo;
        goto L32
    L31:
        scrolledLayoutInfo = null;
        goto L32
    L27:
        scrolledApproachLayoutInfo = null;
    L39:
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) goto L41;
        return distance;
    L41:
        float scrollConsumed = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return scrollConsumed;
    L14:
        value$iv = false;
        goto L16
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState r0, int r1, int r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        return r0.scrollToItem(r1, r2, r3);
    }

    public final Object scrollToItem(int index, int scrollOffset, Continuation<? super Unit> r9) {
        Object r10 = ScrollableState.scroll$default(this, null, new C03422(this, index, scrollOffset, null), r9, 1, null);
        if (r10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r10;
    L6:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState r0, int r1, int r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        return r0.animateScrollToItem(r1, r2, r3);
    }

    public final Object animateScrollToItem(int index, int scrollOffset, Continuation<? super Unit> r15) {
        LazyStaggeredGridMeasureResult layoutInfo = this.layoutInfoState.getValue();
        int numOfItemsToTeleport = layoutInfo.getSlots().getSizes().length * 100;
        Object r0 = ScrollableState.scroll$default(this, null, new AnonymousClass2(this, index, scrollOffset, numOfItemsToTeleport, layoutInfo, null), r15, 1, null);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m950getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyStaggeredGridState r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        r0.requestScrollToItem(r1, r2);
    }

    public final void requestScrollToItem(int index, int scrollOffset) {
        if (isScrollInProgress() == false) goto L5;
        BuildersKt.launch$default(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new AnonymousClass1(this, null), 3, null);
    L5:
        snapToItemInternal$foundation_release(index, scrollOffset, false);
    }

    public final void snapToItemInternal$foundation_release(int index, int scrollOffset, boolean forceRemeasure) {
        int r1 = 0;
        if (this.scrollPosition.getIndex() == index) goto L5;
    L8:
        boolean positionChanged = true;
    L10:
        if (positionChanged == false) goto L12;
        this.itemAnimator.reset();
    L12:
        LazyStaggeredGridMeasureResult layoutInfo = this.layoutInfoState.getValue();
        LazyStaggeredGridItemInfo visibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(layoutInfo, index);
        if (visibleItem == null) goto L23;
        if (positionChanged == false) goto L23;
        if (layoutInfo.getOrientation() != Orientation.Vertical) goto L18;
        int currentOffset = IntOffset.m7102getYimpl(visibleItem.mo931getOffsetnOccac());
    L19:
        int delta = currentOffset + scrollOffset;
        int r6 = layoutInfo.getFirstVisibleItemScrollOffsets().length;
        int[] offsets = new int[r6];
    L20:
        if (r1 >= r6) goto L22;
        offsets[r1] = layoutInfo.getFirstVisibleItemScrollOffsets()[r1] + delta;
        r1 = r1 + 1;
        goto L20
    L22:
        this.scrollPosition.updateScrollOffset(offsets);
    L24:
        if (forceRemeasure == false) goto L28;
        Remeasurement r2 = this.remeasurement;
        if (r2 == null) goto L31;
        r2.forceRemeasure();
        return;
    L31:
        return;
    L28:
        ObservableScopeInvalidator.m911invalidateScopeimpl(this.measurementScopeInvalidator);
        return;
    L18:
        currentOffset = IntOffset.m7101getXimpl(visibleItem.mo931getOffsetnOccac());
    L23:
        this.scrollPosition.requestPositionAndForgetLastKnownKey(index, scrollOffset);
        goto L24
    L5:
        if (this.scrollPosition.getScrollOffset() != scrollOffset) goto L8;
        positionChanged = false;
        goto L10
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyLayoutItemProvider itemProvider, int[] firstItemIndex) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemProvider, firstItemIndex);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    static /* synthetic */ void notifyPrefetch$default(LazyStaggeredGridState r0, float r1, LazyStaggeredGridMeasureResult r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = r0.layoutInfoState.getValue();
    L5:
        r0.notifyPrefetch(r1, r2);
    }

    private final void notifyPrefetch(float delta, LazyStaggeredGridMeasureResult info) {
        if (this.prefetchingEnabled == true) goto L5;
        return;
    L5:
        if (info.getVisibleItemsInfo().isEmpty() == true) goto L63;
        int r3 = 1;
        if (delta >= 0.0f) goto L9;
        boolean scrollingForward = true;
    L10:
        if (scrollingForward == false) goto L12;
        int prefetchIndex = ((LazyStaggeredGridMeasuredItem) CollectionsKt.last(info.getVisibleItemsInfo())).getIndex();
    L14:
        if (prefetchIndex != this.prefetchBaseIndex) goto L16;
        return;
    L16:
        this.prefetchBaseIndex = prefetchIndex;
        Set prefetchHandlesUsed = new LinkedHashSet();
        int targetIndex = prefetchIndex;
        LazyStaggeredGridSlots slots = info.getSlots();
        int laneCount = slots.getSizes().length;
        int lane = 0;
    L17:
        if (lane >= laneCount) goto L55;
        int previousIndex = targetIndex;
        LazyStaggeredGridLaneInfo r11 = this.laneInfo;
        if (scrollingForward == false) goto L21;
        int r12 = r11.findNextItemIndex(previousIndex, lane);
    L22:
        targetIndex = r12;
        if (targetIndex >= 0) goto L25;
    L27:
        int r13 = 0;
    L28:
        if (r13 == 0) goto L55;
        if (prefetchHandlesUsed.contains(Integer.valueOf(targetIndex)) == true) goto L55;
        prefetchHandlesUsed.add(Integer.valueOf(targetIndex));
        if (this.currentItemPrefetchHandles.containsKey(Integer.valueOf(targetIndex)) == true) goto L51;
        boolean isFullSpan = info.getSpanProvider().isFullSpan(targetIndex);
        if (isFullSpan == false) goto L38;
        int slot = 0;
    L39:
        if (isFullSpan == false) goto L41;
        int span = laneCount;
    L43:
        if (span != r3) goto L45;
        int start = slots.getSizes()[slot];
    L47:
        if (info.getOrientation() != Orientation.Vertical) goto L49;
        long r17 = Constraints.Companion.m6938fixedWidthOenEA2s(start);
    L50:
        long constraints = r17;
        this.currentItemPrefetchHandles.put(Integer.valueOf(targetIndex), this.prefetchState.m902schedulePrefetch0kLqBqw(targetIndex, constraints));
        goto L51
    L49:
        r17 = Constraints.Companion.m6937fixedHeightOenEA2s(start);
        goto L50
    L45:
        int start2 = slots.getPositions()[slot];
        int endSlot = (slot + span) - r3;
        int end = slots.getPositions()[endSlot] + slots.getSizes()[endSlot];
        start = end - start2;
        goto L47
    L41:
        span = r3;
        goto L43
    L38:
        slot = lane;
    L51:
        lane = lane + 1;
        slots = slots;
        laneCount = laneCount;
        r3 = 1;
        goto L17
    L25:
        if (targetIndex >= info.getTotalItemsCount()) goto L27;
        r13 = r3;
        goto L28
    L21:
        r12 = r11.findPreviousItemIndex(previousIndex, lane);
    L55:
        clearLeftoverPrefetchHandles(prefetchHandlesUsed);
        return;
    L12:
        prefetchIndex = ((LazyStaggeredGridMeasuredItem) CollectionsKt.first(info.getVisibleItemsInfo())).getIndex();
        goto L14
    L9:
        scrollingForward = false;
        goto L10
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> r4) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> r0 = this.currentItemPrefetchHandles.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> r1 = r0.next();
        if (r4.contains(r1.getKey()) == true) goto L4;
        r1.getValue().cancel();
        r0.remove();
        goto L4
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo info) {
        List<LazyStaggeredGridItemInfo> r0 = info.getVisibleItemsInfo();
        if (this.prefetchBaseIndex != (-1)) goto L5;
        return;
    L5:
        if (r0.isEmpty() == true) goto L19;
        int r1 = ((LazyStaggeredGridItemInfo) CollectionsKt.first(r0)).getIndex();
        int r3 = ((LazyStaggeredGridItemInfo) CollectionsKt.last(r0)).getIndex();
        int r4 = this.prefetchBaseIndex;
        boolean r5 = false;
        if (r1 > r4) goto L10;
        if (r4 > r3) goto L10;
        r5 = true;
    L10:
        if (r5 == true) goto L20;
        this.prefetchBaseIndex = -1;
        Iterable $this$forEach$iv = this.currentItemPrefetchHandles.values();
        Iterator r6 = $this$forEach$iv.iterator();
    L13:
        if (r6.hasNext() == false) goto L15;
        Object element$iv = r6.next();
        LazyLayoutPrefetchState.PrefetchHandle it = (LazyLayoutPrefetchState.PrefetchHandle) element$iv;
        it.cancel();
        goto L13
    L15:
        this.currentItemPrefetchHandles.clear();
        return;
    L20:
        return;
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyStaggeredGridState r0, LazyStaggeredGridMeasureResult r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = false;
    L5:
        r0.applyMeasureResult$foundation_release(r1, r2, r3);
    }

    public final void applyMeasureResult$foundation_release(LazyStaggeredGridMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (isLookingAhead == true) goto L7;
        if (this.hasLookaheadOccurred == false) goto L7;
        this.approachLayoutInfo = result;
        return;
    L7:
        if (isLookingAhead == false) goto L9;
        this.hasLookaheadOccurred = true;
    L9:
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        LazyStaggeredGridScrollPosition r1 = this.scrollPosition;
        if (visibleItemsStayedTheSame == false) goto L12;
        r1.updateScrollOffset(result.getFirstVisibleItemScrollOffsets());
    L13:
        setCanScrollBackward(result.getCanScrollBackward());
        setCanScrollForward(result.getCanScrollForward());
        if (isLookingAhead == false) goto L16;
        this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation_release(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
    L16:
        this.measurePassCount++;
        return;
    L12:
        r1.updateFromMeasureResult(result);
        cancelPrefetchIfVisibleItemsChanged(result);
        goto L13
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._lazyLayoutScrollDeltaBetweenPasses.getScrollDeltaBetweenPasses$foundation_release();
    }

    private final int[] fillNearestIndices(int itemIndex, int laneCount) {
        int[] indices = new int[laneCount];
        if (this.layoutInfoState.getValue().getSpanProvider().isFullSpan(itemIndex) == false) goto L6;
        ArraysKt.fill$default(indices, itemIndex, 0, 0, 6, null);
        return indices;
    L6:
        this.laneInfo.ensureValidIndex(itemIndex + laneCount);
        int previousLane = this.laneInfo.getLane(itemIndex);
        int r2 = 0;
        switch(previousLane) {
            case -2: goto L15;
            case -1: goto L15;
            default: goto L8;
        };
    L8:
        if (previousLane < 0) goto L12;
        r2 = 1;
    L12:
        if (r2 != 0) goto L14;
        InlineClassHelperKt.throwIllegalArgumentException("Expected positive lane number, got " + previousLane + " instead.");
    L14:
        r2 = Math.min(previousLane, laneCount);
    L15:
        int targetLaneIndex = r2;
        int currentItemIndex = itemIndex;
        int lane = targetLaneIndex - 1;
    L17:
        if ((-1) >= lane) goto L22;
        indices[lane] = this.laneInfo.findPreviousItemIndex(currentItemIndex, lane);
        if (indices[lane] == (-1)) goto L20;
        currentItemIndex = indices[lane];
        lane = lane - 1;
        goto L17
    L20:
        ArraysKt.fill$default(indices, -1, 0, lane, 2, null);
    L22:
        indices[targetLaneIndex] = itemIndex;
        int currentItemIndex2 = itemIndex;
        int lane2 = targetLaneIndex + 1;
    L23:
        if (lane2 >= laneCount) goto L25;
        indices[lane2] = this.laneInfo.findNextItemIndex(currentItemIndex2, lane2);
        currentItemIndex2 = indices[lane2];
        lane2 = lane2 + 1;
        goto L23
    L25:
        return indices;
    }

    static {
        Companion = new Companion(null);
        Saver = ListSaverKt.listSaver(LazyStaggeredGridState$Companion$Saver$1.INSTANCE, LazyStaggeredGridState$Companion$Saver$2.INSTANCE);
    }
}
