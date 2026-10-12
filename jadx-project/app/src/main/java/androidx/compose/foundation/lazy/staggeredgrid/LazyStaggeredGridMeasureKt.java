package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0082\b¢\u0006\u0002\u0010\u0010\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0001H\u0082\b\u001aK\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010$\u001a\u001d\u0010%\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001dH\u0002¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020\u0005*\u00020\u00142\u0006\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0003H\u0002\u001a7\u0010*\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00122\b\b\u0002\u0010+\u001a\u00020\u00012\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b\u001a\u001c\u0010-\u001a\u00020\u0003*\u00020\u00142\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0003H\u0002\u001a+\u00100\u001a\u00020\u0005*\u0002012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\f\u00104\u001a\u00020\u0003*\u00020 H\u0002\u001a2\u00105\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00106\u001a\u0016\u00107\u001a\u00020\u0003*\u00020 2\b\b\u0002\u00108\u001a\u00020\u0003H\u0000\u001aG\u00109\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012*\u00020\u00142\u0006\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00012\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050=H\u0082\b\u001a\u001e\u0010>\u001a\u00020\u0003*\u00020 2\u0006\u0010?\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a,\u0010B\u001a\u00020C*\u00020\u00142\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020 2\u0006\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020\u0001H\u0002\u001a¦\u0001\u0010H\u001a\u00020C*\u00020\f2\u0006\u0010I\u001a\u00020J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u00012\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\b\u0010]\u001a\u0004\u0018\u00010^2\u0006\u0010_\u001a\u00020`H\u0000ø\u0001\u0000¢\u0006\u0004\ba\u0010b\u001a\u0014\u0010c\u001a\u00020\u0005*\u00020 2\u0006\u0010d\u001a\u00020\u0003H\u0002\u001a!\u0010e\u001a\u00020 *\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006f"}, d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", "T", "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "beforeVisibleBounds", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "minOffset", "maxOffset", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[IIII)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "fastForEach", "reverse", "action", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "itemsRetainedForLookahead", "lastVisibleItemIndex", "itemsCount", "isLookingAhead", "Lkotlin/Function2;", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isInLookaheadScope", "approachLayoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "measureStaggeredGrid-C6celF4", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope scope, Function1<? super LazyLayoutMeasureScope, ? extends T> r3) {
        return r3.invoke(scope);
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] r1) {
        return "";
    }

    private static final void debugLog(Function0<String> r1) {
    }

    /* JADX INFO: renamed from: measureStaggeredGrid-C6celF4, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m943measureStaggeredGridC6celF4(LazyLayoutMeasureScope $this$measureStaggeredGrid_u2dC6celF4, LazyStaggeredGridState state, List<Integer> r24, LazyStaggeredGridItemProvider itemProvider, LazyStaggeredGridSlots resolvedSlots, long constraints, boolean isVertical, boolean reverseLayout, long contentOffset, int mainAxisAvailableSize, int mainAxisSpacing, int beforeContentPadding, int afterContentPadding, CoroutineScope coroutineScope, boolean isInLookaheadScope, boolean isLookingAhead, LazyStaggeredGridLayoutInfo approachLayoutInfo, GraphicsContext graphicsContext) {
        LazyStaggeredGridMeasureContext context = new LazyStaggeredGridMeasureContext(state, r24, itemProvider, resolvedSlots, constraints, isVertical, $this$measureStaggeredGrid_u2dC6celF4, mainAxisAvailableSize, contentOffset, beforeContentPadding, afterContentPadding, reverseLayout, mainAxisSpacing, coroutineScope, isInLookaheadScope, isLookingAhead, approachLayoutInfo, graphicsContext, null);
        int[] firstVisibleIndices = state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(itemProvider, state.getScrollPosition$foundation_release().getIndices());
        int[] firstVisibleOffsets = state.getScrollPosition$foundation_release().getScrollOffsets();
        if (firstVisibleIndices.length != context.getLaneCount()) goto L5;
        int[] initialItemIndices = firstVisibleIndices;
    L18:
        if (firstVisibleOffsets.length != context.getLaneCount()) goto L20;
        int[] initialItemOffsets = firstVisibleOffsets;
    L30:
        float $this$fastRoundToInt$iv = state.scrollToBeConsumed$foundation_release(isLookingAhead);
        return measure(context, Math.round($this$fastRoundToInt$iv), initialItemIndices, initialItemOffsets, true);
    L20:
        initialItemOffsets = new int[context.getLaneCount()];
        int lane = 0;
        int r12 = initialItemOffsets.length;
    L21:
        if (lane >= r12) goto L30;
        if (lane >= firstVisibleOffsets.length) goto L25;
        int r13 = firstVisibleOffsets[lane];
    L28:
        initialItemOffsets[lane] = r13;
        lane = lane + 1;
        goto L21
    L25:
        if (lane != 0) goto L27;
        r13 = 0;
        goto L28
    L27:
        r13 = initialItemOffsets[lane - 1];
        goto L28
    L5:
        context.getLaneInfo().reset();
        initialItemIndices = new int[context.getLaneCount()];
        int lane2 = 0;
        int r14 = initialItemIndices.length;
    L6:
        if (lane2 >= r14) goto L18;
        if (lane2 < firstVisibleIndices.length) goto L10;
    L12:
        if (lane2 != 0) goto L14;
        int r15 = 0;
    L15:
        initialItemIndices[lane2] = r15;
        context.getLaneInfo().setLane(initialItemIndices[lane2], lane2);
        lane2 = lane2 + 1;
        goto L6
    L14:
        r15 = m942maxInRangejy6DScQ(initialItemIndices, SpanRange.m953constructorimpl(0, lane2)) + 1;
        goto L15
    L10:
        if (firstVisibleIndices[lane2] == (-1)) goto L12;
        r15 = firstVisibleIndices[lane2];
        goto L15
    }

    private static final LazyStaggeredGridMeasureResult measure(final LazyStaggeredGridMeasureContext $this$measure, int initialScrollDelta, int[] initialItemIndices, int[] initialItemOffsets, boolean canRestartMeasure) {
        $this$measure = $this$measure;
        final LazyLayoutMeasureScope scope$iv = $this$measure.getMeasureScope();
        int offset = $this$measure.getItemProvider().getItemCount();
        if (offset > 0) goto L5;
        long r16 = 4294967295L;
        char r18 = ' ';
    L542:
        int layoutWidth = Constraints.m6928getMinWidthimpl($this$measure.m935getConstraintsmsEJaDk());
        int layoutHeight = Constraints.m6927getMinHeightimpl($this$measure.m935getConstraintsmsEJaDk());
        LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> r26 = $this$measure.getState().getItemAnimator$foundation_release();
        ArrayList r30 = new ArrayList();
        LazyLayoutKeyIndexMap r31 = $this$measure.getMeasuredItemProvider().getKeyIndexMap();
        LazyStaggeredGridMeasureProvider r0 = $this$measure.getMeasuredItemProvider();
        LazyStaggeredGridMeasureProvider r32 = r0;
        r26.onMeasured(0, layoutWidth, layoutHeight, r30, r31, r32, $this$measure.isVertical(), scope$iv.isLookingAhead(), $this$measure.getLaneCount(), $this$measure.isInLookaheadScope(), 0, 0, $this$measure.getCoroutineScope(), $this$measure.getGraphicsContext());
        if (scope$iv.isLookingAhead() == true) goto L547;
        long disappearingItemsSize = $this$measure.getState().getItemAnimator$foundation_release().m893getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m7142equalsimpl0(disappearingItemsSize, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L547;
        int layoutWidth2 = ConstraintsKt.m6943constrainWidthK40F9xA($this$measure.m935getConstraintsmsEJaDk(), (int) (disappearingItemsSize >> r18));
        int layoutHeight2 = ConstraintsKt.m6942constrainHeightK40F9xA($this$measure.m935getConstraintsmsEJaDk(), (int) (disappearingItemsSize & r16));
    L548:
        MeasureResult r4 = MeasureScope.layout$default(scope$iv, layoutWidth2, layoutHeight2, null, LazyStaggeredGridMeasureKt$measure$1$1.INSTANCE, 4, null);
        boolean r7 = $this$measure.isVertical();
        List r13 = CollectionsKt.emptyList();
        int width$iv = Constraints.m6928getMinWidthimpl($this$measure.m935getConstraintsmsEJaDk());
        int height$iv = Constraints.m6927getMinHeightimpl($this$measure.m935getConstraintsmsEJaDk());
        return new LazyStaggeredGridMeasureResult(initialItemIndices, initialItemOffsets, 0.0f, r4, 0.0f, false, r7, false, $this$measure.getResolvedSlots(), $this$measure.getItemProvider().getSpanProvider(), scope$iv, offset, r13, IntSize.m7139constructorimpl((((long) width$iv) << r18) | (((long) height$iv) & r16)), -$this$measure.getBeforeContentPadding(), $this$measure.getMainAxisAvailableSize() + $this$measure.getAfterContentPadding(), $this$measure.getBeforeContentPadding(), $this$measure.getAfterContentPadding(), $this$measure.getMainAxisSpacing(), $this$measure.getCoroutineScope(), null);
    L547:
        layoutWidth2 = layoutWidth;
        layoutHeight2 = layoutHeight;
        goto L548
    L5:
        if ($this$measure.getLaneCount() != 0) goto L7;
        r16 = 4294967295L;
        r18 = ' ';
        goto L542
    L7:
        int scrollDelta = initialScrollDelta;
        int[] r2 = Arrays.copyOf(initialItemIndices, initialItemIndices.length);
        String r3 = "copyOf(...)";
        Intrinsics.checkNotNullExpressionValue(r2, "copyOf(...)");
        int[] firstItemIndices = r2;
        int[] r5 = Arrays.copyOf(initialItemOffsets, initialItemOffsets.length);
        Intrinsics.checkNotNullExpressionValue(r5, "copyOf(...)");
        int[] firstItemOffsets = r5;
        boolean remeasureNeeded = false;
        ensureIndicesInRange($this$measure, firstItemIndices, offset);
        offsetBy(firstItemOffsets, -scrollDelta);
        int r6 = $this$measure.getLaneCount();
        ArrayDeque[] measuredItems = new ArrayDeque[r6];
        int r9 = 0;
    L8:
        if (r9 >= r6) goto L10;
        measuredItems[r9] = new ArrayDeque(16);
        r9 = r9 + 1;
        goto L8
    L10:
        offsetBy(firstItemOffsets, -$this$measure.getBeforeContentPadding());
        int laneToCheckForGaps = -1;
    L12:
        if (measure$lambda$43$hasSpaceBeforeFirst(firstItemIndices, firstItemOffsets, $this$measure) == false) goto L49;
        int laneIndex = indexOfMaxValue(firstItemIndices);
        int itemIndex = firstItemIndices[laneIndex];
        int r22 = 0;
        int r15 = firstItemOffsets.length;
        int i = 0;
    L14:
        if (i >= r15) goto L21;
        int scrollDelta2 = scrollDelta;
        boolean remeasureNeeded2 = remeasureNeeded;
        if (firstItemIndices[i] == firstItemIndices[laneIndex]) goto L20;
        if (firstItemOffsets[i] >= firstItemOffsets[laneIndex]) goto L20;
        firstItemOffsets[i] = firstItemOffsets[laneIndex];
    L20:
        i = i + 1;
        scrollDelta = scrollDelta2;
        remeasureNeeded = remeasureNeeded2;
        goto L14
    L21:
        int scrollDelta3 = scrollDelta;
        boolean remeasureNeeded3 = remeasureNeeded;
        int previousItemIndex = findPreviousItemIndex($this$measure, itemIndex, laneIndex);
        if (previousItemIndex < 0) goto L23;
        long spanRange = $this$measure.m938getSpanRangelOCCd4c($this$measure.getItemProvider(), previousItemIndex, laneIndex);
        LazyStaggeredGridLaneInfo r8 = $this$measure.getLaneInfo();
        if ((((int) (spanRange & 4294967295L)) - ((int) (spanRange >> 32))) == 1) goto L27;
        boolean r10 = true;
    L28:
        if (r10 == false) goto L30;
        int r11 = -2;
    L31:
        r8.setLane(previousItemIndex, r11);
        LazyStaggeredGridMeasuredItem measuredItem = $this$measure.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(previousItemIndex, spanRange);
        int offset2 = m942maxInRangejy6DScQ(firstItemOffsets, spanRange);
        if ((((int) (spanRange & 4294967295L)) - ((int) (spanRange >> 32))) == 1) goto L34;
        boolean r12 = true;
    L35:
        if (r12 == false) goto L37;
        int[] gaps = $this$measure.getLaneInfo().getGaps(previousItemIndex);
    L38:
        int i$iv = (int) (spanRange >> 32);
        int r1 = (int) (spanRange & 4294967295L);
        int i$iv2 = i$iv;
    L39:
        if (i$iv2 >= r1) goto L48;
        int lane = i$iv2;
        firstItemIndices[lane] = previousItemIndex;
        if (gaps != null) goto L43;
        int gap = 0;
    L44:
        int newOffset = (offset2 + measuredItem.getMainAxisSizeWithSpacings()) + gap;
        firstItemOffsets[lane] = newOffset;
        if (($this$measure.getMainAxisAvailableSize() + newOffset) > 0) goto L47;
        remeasureNeeded3 = true;
    L47:
        i$iv2 = i$iv2 + 1;
        goto L39
    L43:
        gap = gaps[lane];
        goto L44
    L48:
        scrollDelta = scrollDelta3;
        remeasureNeeded = remeasureNeeded3;
        goto L12
    L37:
        gaps = null;
        goto L38
    L34:
        r12 = false;
        goto L35
    L30:
        r11 = (int) (spanRange >> 32);
        goto L31
    L27:
        r10 = false;
        goto L28
    L23:
        laneToCheckForGaps = laneIndex;
    L50:
        int $i$f$debugLog = $this$measure.getBeforeContentPadding();
        int minOffset = -$i$f$debugLog;
        if (firstItemOffsets[r22] >= minOffset) goto L53;
        int notConsumedScrollDelta = minOffset - firstItemOffsets[r22];
        offsetBy(firstItemOffsets, minOffset - firstItemOffsets[r22]);
        int scrollDelta4 = scrollDelta3 - notConsumedScrollDelta;
    L54:
        offsetBy(firstItemOffsets, $this$measure.getBeforeContentPadding());
        if (laneToCheckForGaps != (-1)) goto L57;
        int laneToCheckForGaps2 = ArraysKt.indexOf(firstItemIndices, r22);
    L59:
        if (laneToCheckForGaps2 == (-1)) goto L71;
        int lane2 = laneToCheckForGaps2;
        if (measure$lambda$43$misalignedStart(firstItemIndices, $this$measure, firstItemOffsets, lane2) == false) goto L71;
        if (canRestartMeasure == false) goto L71;
        $this$measure.getLaneInfo().reset();
        int r14 = firstItemIndices.length;
        int[] r17 = new int[r14];
        int r19 = 0;
    L64:
        if (r19 >= r14) goto L66;
        r17[r19] = -1;
        r19 = r19 + 1;
        goto L64
    L66:
        int r20 = firstItemOffsets.length;
        int[] r21 = new int[r20];
        int r110 = 0;
    L67:
        if (r110 >= r20) goto L70;
        r21[r110] = firstItemOffsets[lane2];
        r110 = r110 + 1;
        goto L67
    L70:
        return measure($this$measure, scrollDelta4, r17, r21, false);
    L71:
        int[] r23 = Arrays.copyOf(firstItemIndices, firstItemIndices.length);
        Intrinsics.checkNotNullExpressionValue(r23, "copyOf(...)");
        int[] currentItemIndices = r23;
        int r24 = firstItemOffsets.length;
        int[] currentItemOffsets = new int[r24];
        int r111 = 0;
    L72:
        if (r111 >= r24) goto L74;
        currentItemOffsets[r111] = -firstItemOffsets[r111];
        r111 = r111 + 1;
        goto L72
    L74:
        int minVisibleOffset = minOffset + $this$measure.getMainAxisSpacing();
        int maxOffset = RangesKt.coerceAtLeast($this$measure.getMainAxisAvailableSize() + $this$measure.getAfterContentPadding(), 0);
        int initialItemsMeasured = 0;
        boolean remeasureNeeded4 = remeasureNeeded3;
        int initialLaneToMeasure = indexOfMinValue$default(currentItemIndices, 0, 1, null);
    L76:
        if (initialLaneToMeasure == (-1)) goto L104;
        if (initialItemsMeasured >= $this$measure.getLaneCount()) goto L104;
        int itemIndex2 = currentItemIndices[initialLaneToMeasure];
        int laneIndex2 = initialLaneToMeasure;
        initialLaneToMeasure = indexOfMinValue(currentItemIndices, itemIndex2);
        initialItemsMeasured = initialItemsMeasured + 1;
        if (itemIndex2 < 0) goto L76;
        int[] currentItemIndices2 = currentItemIndices;
        int laneIndex3 = laneToCheckForGaps2;
        long spanRange2 = $this$measure.m938getSpanRangelOCCd4c($this$measure.getItemProvider(), itemIndex2, laneIndex2);
        LazyStaggeredGridMeasuredItem measuredItem2 = $this$measure.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(itemIndex2, spanRange2);
        LazyStaggeredGridLaneInfo r25 = $this$measure.getLaneInfo();
        int[] firstItemIndices2 = firstItemIndices;
        int[] firstItemOffsets2 = firstItemOffsets;
        if ((((int) (spanRange2 & 4294967295L)) - ((int) (spanRange2 >> 32))) == 1) goto L84;
        boolean r112 = true;
    L85:
        if (r112 == false) goto L87;
        int r113 = -2;
    L88:
        r25.setLane(itemIndex2, r113);
        int offset3 = m942maxInRangejy6DScQ(currentItemOffsets, spanRange2);
        int i$iv3 = (int) (spanRange2 >> 32);
        int r27 = (int) (spanRange2 & 4294967295L);
        int i$iv4 = i$iv3;
    L89:
        if (i$iv4 >= r27) goto L92;
        int lane3 = i$iv4;
        currentItemOffsets[lane3] = offset3 + measuredItem2.getMainAxisSizeWithSpacings();
        currentItemIndices2[lane3] = itemIndex2;
        measuredItems[lane3].addLast(measuredItem2);
        i$iv4 = i$iv4 + 1;
        itemIndex2 = itemIndex2;
        goto L89
    L92:
        if (offset3 >= minVisibleOffset) goto L96;
        long value$iv$iv = spanRange2 >> 32;
        if (currentItemOffsets[(int) value$iv$iv] > minVisibleOffset) goto L96;
        measuredItem2.setVisible(false);
        remeasureNeeded4 = true;
    L96:
        long $this$isFullSpan$iv = spanRange2 & 4294967295L;
        if ((((int) $this$isFullSpan$iv) - ((int) (spanRange2 >> 32))) == 1) goto L99;
        boolean r28 = true;
    L100:
        if (r28 == true) goto L101;
        laneToCheckForGaps2 = laneIndex3;
        initialLaneToMeasure = initialLaneToMeasure;
        initialItemsMeasured = initialItemsMeasured;
        firstItemIndices = firstItemIndices2;
        firstItemOffsets = firstItemOffsets2;
        currentItemIndices = currentItemIndices2;
        goto L76
    L101:
        initialItemsMeasured = $this$measure.getLaneCount();
        laneToCheckForGaps2 = laneIndex3;
        initialLaneToMeasure = initialLaneToMeasure;
        firstItemIndices = firstItemIndices2;
        firstItemOffsets = firstItemOffsets2;
        currentItemIndices = currentItemIndices2;
        goto L76
    L99:
        r28 = false;
        goto L100
    L87:
        r113 = (int) (spanRange2 >> 32);
        goto L88
    L84:
        r112 = false;
    L104:
        int[] currentItemIndices3 = currentItemIndices;
        int[] firstItemIndices3 = firstItemIndices;
        int[] firstItemOffsets3 = firstItemOffsets;
    L105:
        int r114 = currentItemOffsets.length;
        int r115 = 0;
    L106:
        if (r115 >= r114) goto L116;
        int element$iv = currentItemOffsets[r115];
        int initialLaneToMeasure2 = initialLaneToMeasure;
        if (element$iv < maxOffset) goto L112;
        if (element$iv <= 0) goto L112;
        int it = 0;
    L113:
        if (it != 0) goto L114;
        r115 = r115 + 1;
        initialLaneToMeasure = initialLaneToMeasure2;
        goto L106
    L114:
        int initialLaneToMeasure3 = 1;
    L117:
        if (initialLaneToMeasure3 != 0) goto L126;
        ArrayDeque[] r29 = measuredItems;
        int r33 = r29.length;
        int r116 = 0;
    L119:
        if (r116 >= r33) goto L124;
        if (r29[r116].isEmpty() == false) goto L122;
        r116 = r116 + 1;
        goto L119
    L122:
        boolean r34 = false;
    L125:
        if (r34 == true) goto L126;
    L128:
        int laneIndex4 = 0;
        int r35 = measuredItems.length;
    L129:
        if (laneIndex4 >= r35) goto L149;
        ArrayDeque laneItems = measuredItems[laneIndex4];
    L132:
        if (laneItems.size() <= 1) goto L144;
        if (((LazyStaggeredGridMeasuredItem) laneItems.first()).isVisible() == true) goto L144;
        LazyStaggeredGridMeasuredItem item = (LazyStaggeredGridMeasuredItem) laneItems.removeFirst();
        if (item.getSpan() == 1) goto L138;
        int[] gaps2 = $this$measure.getLaneInfo().getGaps(item.getIndex());
    L139:
        int r117 = firstItemOffsets3[laneIndex4];
        int r210 = item.getMainAxisSizeWithSpacings();
        if (gaps2 != null) goto L142;
        int r211 = 0;
    L143:
        firstItemOffsets3[laneIndex4] = r117 - (r210 + r211);
        goto L132
    L142:
        r211 = gaps2[laneIndex4];
        goto L143
    L138:
        gaps2 = null;
    L144:
        LazyStaggeredGridMeasuredItem r118 = (LazyStaggeredGridMeasuredItem) laneItems.firstOrNull();
        if (r118 == null) goto L147;
        int r119 = r118.getIndex();
    L148:
        firstItemIndices3[laneIndex4] = r119;
        laneIndex4 = laneIndex4 + 1;
        goto L129
    L147:
        r119 = -1;
        goto L148
    L149:
        int[] $this$any$iv = currentItemIndices3;
        int r36 = $this$any$iv.length;
        int r120 = 0;
    L150:
        if (r120 >= r36) goto L158;
        int element$iv2 = $this$any$iv[r120];
        int[] $this$any$iv2 = $this$any$iv;
        if (element$iv2 != (offset - 1)) goto L154;
        boolean r37 = true;
    L155:
        if (r37 == true) goto L156;
        r120 = r120 + 1;
        $this$any$iv = $this$any$iv2;
        goto L150
    L156:
        boolean r38 = true;
    L159:
        if (r38 == false) goto L161;
        offsetBy(currentItemOffsets, -$this$measure.getMainAxisSpacing());
    L161:
        int preScrollBackScrollDelta = scrollDelta4;
        int[] $this$all$iv = currentItemOffsets;
        int r121 = $this$all$iv.length;
        int r122 = 0;
    L162:
        if (r122 >= r121) goto L170;
        int element$iv3 = $this$all$iv[r122];
        int[] $this$all$iv2 = $this$all$iv;
        int maxOffset2 = maxOffset;
        if (element$iv3 >= $this$measure.getMainAxisAvailableSize()) goto L166;
        boolean r39 = true;
    L167:
        if (r39 == false) goto L168;
        r122 = r122 + 1;
        $this$all$iv = $this$all$iv2;
        maxOffset = maxOffset2;
        goto L162
    L168:
        boolean r40 = false;
    L171:
        if (r40 == false) goto L246;
        int maxOffsetLane = indexOfMaxValue(currentItemOffsets);
        int toScrollBack = $this$measure.getMainAxisAvailableSize() - currentItemOffsets[maxOffsetLane];
        int[] firstItemOffsets4 = firstItemOffsets3;
        offsetBy(firstItemOffsets4, -toScrollBack);
        offsetBy(currentItemOffsets, toScrollBack);
        boolean gapDetected = false;
    L173:
        int maxOffsetLane2 = maxOffsetLane;
        int maxOffsetLane3 = firstItemOffsets4.length;
        int toScrollBack2 = toScrollBack;
        int toScrollBack3 = 0;
    L174:
        if (toScrollBack3 >= maxOffsetLane3) goto L182;
        int element$iv4 = firstItemOffsets4[toScrollBack3];
        int r310 = maxOffsetLane3;
        int r311 = toScrollBack3;
        if (element$iv4 >= $this$measure.getBeforeContentPadding()) goto L178;
        boolean r41 = true;
    L179:
        if (r41 == true) goto L180;
        toScrollBack3 = r311 + 1;
        maxOffsetLane3 = r310;
        goto L174
    L180:
        boolean r42 = true;
    L183:
        if (r42 == false) goto L238;
        int laneIndex5 = indexOfMinValue$default(firstItemOffsets4, 0, 1, null);
        int nextLaneIndex = indexOfMaxValue(firstItemIndices3);
        if (laneIndex5 == nextLaneIndex) goto L191;
        if (firstItemOffsets4[laneIndex5] != firstItemOffsets4[nextLaneIndex]) goto L189;
        laneIndex5 = nextLaneIndex;
        goto L191
    L189:
        gapDetected = true;
    L191:
        if (firstItemIndices3[laneIndex5] != (-1)) goto L193;
        int currentIndex = offset;
    L194:
        int previousIndex = findPreviousItemIndex($this$measure, currentIndex, laneIndex5);
        if (previousIndex < 0) goto L196;
        boolean gapDetected2 = gapDetected;
        int initialItemsMeasured2 = initialItemsMeasured;
        int[] firstItemIndices4 = firstItemIndices3;
        long spanRange3 = $this$measure.m938getSpanRangelOCCd4c($this$measure.getItemProvider(), previousIndex, laneIndex5);
        LazyStaggeredGridLaneInfo r43 = $this$measure.getLaneInfo();
        int itemCount = offset;
        if ((((int) (spanRange3 & 4294967295L)) - ((int) (spanRange3 >> 32))) == 1) goto L216;
        boolean r123 = true;
    L217:
        if (r123 == false) goto L219;
        int r124 = -2;
    L220:
        r43.setLane(previousIndex, r124);
        LazyStaggeredGridMeasuredItem measuredItem3 = $this$measure.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(previousIndex, spanRange3);
        int offset4 = m942maxInRangejy6DScQ(firstItemOffsets4, spanRange3);
        if ((((int) (spanRange3 & 4294967295L)) - ((int) (spanRange3 >> 32))) == 1) goto L223;
        boolean r44 = true;
    L224:
        if (r44 == false) goto L226;
        int[] gaps3 = $this$measure.getLaneInfo().getGaps(previousIndex);
    L227:
        int[] gaps4 = gaps3;
        int i$iv5 = (int) (spanRange3 >> 32);
        int r45 = (int) (spanRange3 & 4294967295L);
        int i$iv6 = i$iv5;
    L228:
        if (i$iv6 >= r45) goto L237;
        int lane4 = i$iv6;
        int r312 = r45;
        if (firstItemOffsets4[lane4] == offset4) goto L232;
        gapDetected2 = true;
    L232:
        measuredItems[lane4].addFirst(measuredItem3);
        firstItemIndices4[lane4] = previousIndex;
        if (gaps4 != null) goto L235;
        int gap2 = 0;
    L236:
        firstItemOffsets4[lane4] = (offset4 + measuredItem3.getMainAxisSizeWithSpacings()) + gap2;
        i$iv6 = i$iv6 + 1;
        r45 = r312;
        goto L228
    L235:
        gap2 = gaps4[lane4];
        goto L236
    L237:
        firstItemIndices3 = firstItemIndices4;
        maxOffsetLane = maxOffsetLane2;
        toScrollBack = toScrollBack2;
        gapDetected = gapDetected2;
        initialItemsMeasured = initialItemsMeasured2;
        offset = itemCount;
        goto L173
    L226:
        gaps3 = null;
        goto L227
    L223:
        r44 = false;
        goto L224
    L219:
        r124 = (int) (spanRange3 >> 32);
        goto L220
    L216:
        r123 = false;
        goto L217
    L196:
        if (gapDetected == true) goto L201;
        int[] firstItemIndices5 = firstItemIndices3;
        if (measure$lambda$43$misalignedStart(firstItemIndices5, $this$measure, firstItemOffsets4, laneIndex5) == false) goto L212;
    L202:
        if (canRestartMeasure == false) goto L212;
        $this$measure.getLaneInfo().reset();
        int r46 = firstItemIndices5.length;
        int[] r47 = new int[r46];
        int currentIndex2 = 0;
    L204:
        if (currentIndex2 >= r46) goto L206;
        r47[currentIndex2] = -1;
        currentIndex2 = currentIndex2 + 1;
        goto L204
    L206:
        int r48 = firstItemOffsets4.length;
        int[] r49 = new int[r48];
        int r50 = 0;
    L207:
        if (r50 >= r48) goto L210;
        r49[r50] = firstItemOffsets4[laneIndex5];
        r50 = r50 + 1;
        goto L207
    L210:
        return measure($this$measure, scrollDelta4, r47, r49, false);
    L212:
        gapDetected = gapDetected;
    L239:
        if (gapDetected == false) goto L243;
        if (canRestartMeasure == false) goto L243;
        $this$measure.getLaneInfo().reset();
        return measure($this$measure, scrollDelta4, firstItemIndices5, firstItemOffsets4, false);
    L243:
        scrollDelta4 = scrollDelta4 + toScrollBack2;
        int minOffsetLane = indexOfMinValue$default(firstItemOffsets4, 0, 1, null);
        if (firstItemOffsets4[minOffsetLane] >= 0) goto L247;
        int offsetValue = firstItemOffsets4[minOffsetLane];
        scrollDelta4 = scrollDelta4 + offsetValue;
        offsetBy(currentItemOffsets, offsetValue);
        offsetBy(firstItemOffsets4, -offsetValue);
    L247:
        float scrollToBeConsumed = $this$measure.getState().scrollToBeConsumed$foundation_release(scope$iv.isLookingAhead());
        if (MathKt.getSign(Math.round(scrollToBeConsumed)) == MathKt.getSign(scrollDelta4)) goto L250;
    L252:
        float r212 = scrollToBeConsumed;
    L253:
        float consumedScroll = r212;
        float unconsumedScroll = scrollToBeConsumed - consumedScroll;
        if (scope$iv.isLookingAhead() == false) goto L259;
        if (scrollDelta4 <= preScrollBackScrollDelta) goto L259;
        if (unconsumedScroll > 0.0f) goto L259;
        float scrollBackAmount = (scrollDelta4 - preScrollBackScrollDelta) + unconsumedScroll;
    L260:
        int[] r51 = Arrays.copyOf(firstItemOffsets4, firstItemOffsets4.length);
        Intrinsics.checkNotNullExpressionValue(r51, r3);
        int[] itemScrollOffsets = r51;
        int i$iv7 = 0;
        int r52 = itemScrollOffsets.length;
    L261:
        if (i$iv7 >= r52) goto L263;
        int it2 = itemScrollOffsets[i$iv7];
        itemScrollOffsets[i$iv7] = -it2;
        i$iv7 = i$iv7 + 1;
        goto L261
    L263:
        int $i$f$debugLog2 = $this$measure.getBeforeContentPadding();
        if ($i$f$debugLog2 <= $this$measure.getMainAxisSpacing()) goto L284;
        int laneIndex6 = 0;
        int r53 = measuredItems.length;
    L266:
        if (laneIndex6 >= r53) goto L284;
        ArrayDeque laneItems2 = measuredItems[laneIndex6];
        int i2 = 0;
        int r54 = laneItems2.size();
    L268:
        if (i2 >= r54) goto L281;
        LazyStaggeredGridMeasuredItem item2 = (LazyStaggeredGridMeasuredItem) laneItems2.get(i2);
        int r213 = r54;
        LazyStaggeredGridLaneInfo r55 = $this$measure.getLaneInfo();
        int laneIndex7 = laneIndex6;
        int laneIndex8 = item2.getIndex();
        int[] gaps5 = r55.getGaps(laneIndex8);
        int r56 = item2.getMainAxisSizeWithSpacings();
        if (gaps5 != null) goto L272;
        int r313 = 0;
    L273:
        int size = r56 + r313;
        if (i2 == CollectionsKt.getLastIndex(laneItems2)) goto L282;
        if (firstItemOffsets4[laneIndex7] == 0) goto L282;
        if (firstItemOffsets4[laneIndex7] < size) goto L282;
        firstItemOffsets4[laneIndex7] = firstItemOffsets4[laneIndex7] - size;
        firstItemIndices5[laneIndex7] = ((LazyStaggeredGridMeasuredItem) laneItems2.get(i2 + 1)).getIndex();
        i2 = i2 + 1;
        r54 = r213;
        laneIndex6 = laneIndex7;
    L282:
        laneIndex6 = laneIndex7 + 1;
        goto L266
    L272:
        r313 = gaps5[laneIndex7];
        goto L273
    L281:
        laneIndex7 = laneIndex6;
    L284:
        int $i$f$debugLog3 = $this$measure.getBeforeContentPadding();
        int contentPadding = $i$f$debugLog3 + $this$measure.getAfterContentPadding();
        if ($this$measure.isVertical() == false) goto L287;
        int r57 = Constraints.m6926getMaxWidthimpl($this$measure.m935getConstraintsmsEJaDk());
    L288:
        int layoutWidth3 = r57;
        if ($this$measure.isVertical() == false) goto L291;
        int layoutHeight3 = ConstraintsKt.m6942constrainHeightK40F9xA($this$measure.m935getConstraintsmsEJaDk(), ArraysKt.maxOrThrow(currentItemOffsets) + contentPadding);
    L293:
        if ($this$measure.isVertical() == false) goto L295;
        int r58 = layoutHeight3;
    L296:
        int it3 = Math.min(r58, $this$measure.getMainAxisAvailableSize());
        int mainAxisLayoutSize = (it3 - $this$measure.getBeforeContentPadding()) + $this$measure.getAfterContentPadding();
        int index$iv = itemScrollOffsets[0];
        boolean beforeVisibleBounds$iv = true;
        LazyStaggeredGridMeasureContext $this$calculateExtraItems$iv = $this$measure;
        List r214 = null;
        List<Integer> r314 = $this$calculateExtraItems$iv.getPinnedItems();
        int r315 = r314.size() - 1;
        if (r315 < 0) goto L333;
    L298:
        int index$iv$iv$iv = r315;
        r315 = r315 - 1;
        int extraItemOffset = index$iv;
        List<Integer> r59 = r314;
        boolean beforeVisibleBounds$iv2 = beforeVisibleBounds$iv;
        int index$iv2 = ((Number) r59.get(index$iv$iv$iv)).intValue();
        int[] itemScrollOffsets2 = itemScrollOffsets;
        int lane5 = $this$measure.getLaneInfo().getLane(index$iv2);
        switch(lane5) {
            case -2: goto L303;
            case -1: goto L303;
            default: goto L300;
        };
    L300:
        ArrayDeque[] measuredItems2 = measuredItems;
        LazyStaggeredGridMeasuredItem r60 = (LazyStaggeredGridMeasuredItem) measuredItems2[lane5].firstOrNull();
        if (r60 == null) goto L317;
        int firstIndex = r60.getIndex();
    L318:
        if (firstIndex <= index$iv2) goto L320;
        int firstIndex2 = 1;
    L322:
        if (firstIndex2 == 0) goto L328;
        long spanRange$iv = $this$calculateExtraItems$iv.m938getSpanRangelOCCd4c($this$calculateExtraItems$iv.getItemProvider(), index$iv2, 0);
        if (r214 != null) goto L326;
        Object result$iv = new ArrayList();
        List r61 = (List) result$iv;
    L327:
        LazyStaggeredGridMeasuredItem measuredItem$iv = $this$calculateExtraItems$iv.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(index$iv2, spanRange$iv);
        index$iv = extraItemOffset - measuredItem$iv.getMainAxisSizeWithSpacings();
        measuredItem$iv.position(index$iv, 0, mainAxisLayoutSize);
        r61.add(measuredItem$iv);
        r214 = r61;
    L330:
        if (r315 < 0) goto L335;
        beforeVisibleBounds$iv = beforeVisibleBounds$iv2;
        r314 = r59;
        measuredItems = measuredItems2;
        itemScrollOffsets = itemScrollOffsets2;
        $this$calculateExtraItems$iv = $this$calculateExtraItems$iv;
        scrollDelta4 = scrollDelta4;
    L335:
        if (r214 != null) goto L337;
        r214 = CollectionsKt.emptyList();
    L337:
        List extraItemsBefore = r214;
        ArrayDeque[] measuredItems3 = measuredItems2;
        int[] itemScrollOffsets3 = itemScrollOffsets2;
        List<LazyStaggeredGridMeasuredItem> r316 = calculateVisibleItems($this$measure, measuredItems3, itemScrollOffsets3, mainAxisLayoutSize, minOffset, maxOffset2);
        ArrayDeque[] measuredItems4 = measuredItems3;
        int extraItemOffset2 = itemScrollOffsets3[0];
        LazyStaggeredGridMeasuredItem r62 = (LazyStaggeredGridMeasuredItem) CollectionsKt.lastOrNull(r316);
        if (r62 == null) goto L340;
        int lastVisibleItemIndex$iv = r62.getIndex();
    L341:
        boolean isLookingAhead$iv = scope$iv.isLookingAhead();
        LazyStaggeredGridMeasureContext $this$itemsRetainedForLookahead$iv = $this$measure;
        List list$iv = null;
        if (isLookingAhead$iv == true) goto L344;
        int extraItemOffset3 = extraItemOffset2;
    L408:
        int extraItemOffset4 = extraItemOffset3;
    L409:
        List itemsRetainedForLookahead = list$iv;
        LazyStaggeredGridMeasureContext $this$calculateExtraItems$iv2 = $this$measure;
        boolean beforeVisibleBounds$iv3 = false;
        int $i$f$calculateExtraItems = 0;
        List<Integer> r63 = $this$calculateExtraItems$iv2.getPinnedItems();
        int extraItemOffset5 = extraItemOffset4;
        int extraItemOffset6 = r63.size();
        int index$iv$iv$iv2 = 0;
        List r215 = null;
        int extraItemOffset7 = extraItemOffset5;
    L410:
        if (index$iv$iv$iv2 >= extraItemOffset6) goto L457;
        int r317 = extraItemOffset6;
        int index$iv3 = ((Number) r63.get(index$iv$iv$iv2)).intValue();
        boolean beforeVisibleBounds$iv4 = beforeVisibleBounds$iv3;
        int index$iv$iv$iv3 = index$iv$iv$iv2;
        int index$iv$iv$iv4 = offset;
        if (index$iv3 < index$iv$iv$iv4) goto L414;
        offset = index$iv$iv$iv4;
        int $i$f$calculateExtraItems2 = $i$f$calculateExtraItems;
        int itemCount2 = 0;
    L449:
        if (itemCount2 == 0) goto L456;
        long spanRange$iv2 = $this$calculateExtraItems$iv2.m938getSpanRangelOCCd4c($this$calculateExtraItems$iv2.getItemProvider(), index$iv3, 0);
        if (r215 != null) goto L453;
        Object result$iv2 = new ArrayList();
        List r64 = (List) result$iv2;
    L454:
        LazyStaggeredGridMeasuredItem measuredItem$iv2 = $this$calculateExtraItems$iv2.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(index$iv3, spanRange$iv2);
        measuredItem$iv2.position(extraItemOffset7, 0, mainAxisLayoutSize);
        extraItemOffset7 = extraItemOffset7 + measuredItem$iv2.getMainAxisSizeWithSpacings();
        r64.add(measuredItem$iv2);
        r215 = r64;
        goto L456
    L453:
        r64 = r215;
    L456:
        index$iv$iv$iv2 = index$iv$iv$iv3 + 1;
        r63 = r63;
        extraItemOffset6 = r317;
        beforeVisibleBounds$iv3 = beforeVisibleBounds$iv4;
        $this$calculateExtraItems$iv2 = $this$calculateExtraItems$iv2;
        $i$f$calculateExtraItems = $i$f$calculateExtraItems2;
        firstItemOffsets4 = firstItemOffsets4;
        goto L410
    L414:
        if (itemsRetainedForLookahead == null) goto L428;
        List $this$fastForEach$iv$iv = itemsRetainedForLookahead;
        offset = index$iv$iv$iv4;
        int itemCount3 = $this$fastForEach$iv$iv.size();
        $i$f$calculateExtraItems2 = $i$f$calculateExtraItems;
        int $i$f$calculateExtraItems3 = 0;
    L416:
        if ($i$f$calculateExtraItems3 >= itemCount3) goto L424;
        int r410 = itemCount3;
        List $this$fastForEach$iv$iv2 = $this$fastForEach$iv$iv;
        Object item$iv$iv = $this$fastForEach$iv$iv2.get($i$f$calculateExtraItems3);
        LazyStaggeredGridMeasuredItem it4 = (LazyStaggeredGridMeasuredItem) item$iv$iv;
        if (it4.getIndex() != index$iv3) goto L420;
        boolean r65 = true;
    L421:
        if (r65 == true) goto L422;
        $i$f$calculateExtraItems3 = $i$f$calculateExtraItems3 + 1;
        itemCount3 = r410;
        $this$fastForEach$iv$iv = $this$fastForEach$iv$iv2;
        goto L416
    L422:
        boolean r66 = true;
    L426:
        if (r66 != true) goto L429;
        int itemCount4 = 1;
    L430:
        if (itemCount4 == 0) goto L432;
        itemCount2 = 0;
        goto L449
    L432:
        int lane6 = $this$measure.getLaneInfo().getLane(index$iv3);
        switch(lane6) {
            case -2: goto L437;
            case -1: goto L437;
            default: goto L435;
        };
    L437:
        int lane7 = currentItemIndices3.length;
        int r67 = 0;
    L438:
        if (r67 >= lane7) goto L446;
        int element$iv5 = currentItemIndices3[r67];
        int r411 = lane7;
        if (element$iv5 >= index$iv3) goto L442;
        int it5 = 1;
    L443:
        if (it5 == 0) goto L444;
        r67 = r67 + 1;
        lane7 = r411;
        goto L438
    L444:
        itemCount2 = 0;
        goto L449
    L442:
        it5 = 0;
        goto L443
    L446:
        itemCount2 = 1;
        goto L449
    L435:
        if (currentItemIndices3[lane6] >= index$iv3) goto L447;
        itemCount2 = 1;
        goto L449
    L447:
        itemCount2 = 0;
    L429:
        itemCount4 = 0;
        goto L430
    L420:
        r65 = false;
        goto L421
    L424:
        r66 = false;
        goto L426
    L428:
        offset = index$iv$iv$iv4;
        $i$f$calculateExtraItems2 = $i$f$calculateExtraItems;
        goto L429
    L457:
        int[] firstItemOffsets5 = firstItemOffsets4;
        if (r215 != null) goto L460;
        r215 = CollectionsKt.emptyList();
    L460:
        List extraItemsAfter = r215;
        final List positionedItems = new ArrayList();
        positionedItems.addAll(extraItemsBefore);
        positionedItems.addAll(r316);
        if (itemsRetainedForLookahead == null) goto L463;
        positionedItems.addAll(itemsRetainedForLookahead);
    L463:
        positionedItems.addAll(extraItemsAfter);
        LazyLayoutKeyIndexMap r510 = $this$measure.getMeasuredItemProvider().getKeyIndexMap();
        LazyStaggeredGridMeasureProvider r68 = $this$measure.getMeasuredItemProvider();
        LazyStaggeredGridMeasureProvider r511 = r68;
        $this$measure.getState().getItemAnimator$foundation_release().onMeasured((int) consumedScroll, layoutWidth3, layoutHeight3, positionedItems, r510, r511, $this$measure.isVertical(), scope$iv.isLookingAhead(), $this$measure.getLaneCount(), $this$measure.isInLookaheadScope(), ArraysKt.minOrThrow(firstItemOffsets5), ArraysKt.maxOrThrow(currentItemOffsets) + contentPadding, $this$measure.getCoroutineScope(), $this$measure.getGraphicsContext());
        int layoutHeight4 = layoutHeight3;
        if (scope$iv.isLookingAhead() == true) goto L483;
        long disappearingItemsSize2 = $this$measure.getState().getItemAnimator$foundation_release().m893getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m7142equalsimpl0(disappearingItemsSize2, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L483;
        if ($this$measure.isVertical() == false) goto L470;
        int r512 = layoutHeight4;
    L471:
        int oldMainAxisSize = r512;
        int layoutWidth4 = ConstraintsKt.m6943constrainWidthK40F9xA($this$measure.m935getConstraintsmsEJaDk(), Math.max(layoutWidth3, (int) (disappearingItemsSize2 >> 32)));
        int layoutHeight5 = ConstraintsKt.m6942constrainHeightK40F9xA($this$measure.m935getConstraintsmsEJaDk(), Math.max(layoutHeight4, (int) (disappearingItemsSize2 & 4294967295L)));
        if ($this$measure.isVertical() == false) goto L474;
        int newMainAxisSize = layoutHeight5;
    L475:
        if (newMainAxisSize == oldMainAxisSize) goto L480;
        int index$iv4 = 0;
        int r125 = positionedItems.size();
    L477:
        if (index$iv4 >= r125) goto L480;
        LazyStaggeredGridMeasuredItem it6 = (LazyStaggeredGridMeasuredItem) positionedItems.get(index$iv4);
        it6.updateMainAxisLayoutSize(newMainAxisSize);
        index$iv4 = index$iv4 + 1;
    L480:
        int layoutWidth5 = layoutWidth4;
        int layoutHeight6 = layoutHeight5;
    L484:
        int r69 = currentItemOffsets.length;
        int r70 = 0;
    L485:
        if (r70 >= r69) goto L493;
        int element$iv6 = currentItemOffsets[r70];
        if (element$iv6 <= $this$measure.getMainAxisAvailableSize()) goto L489;
        int it7 = 1;
    L490:
        if (it7 != 0) goto L491;
        r70 = r70 + 1;
        goto L485
    L491:
        boolean r71 = true;
    L494:
        if (r71 == true) goto L508;
        int r72 = currentItemIndices3.length;
        int r73 = 0;
    L496:
        if (r73 >= r72) goto L504;
        int element$iv7 = currentItemIndices3[r73];
        if (element$iv7 >= (offset - 1)) goto L500;
        int it8 = 1;
    L501:
        if (it8 == 0) goto L502;
        r73 = r73 + 1;
        goto L496
    L502:
        boolean r74 = false;
    L505:
        if (r74 == true) goto L508;
        boolean canScrollForward = false;
    L509:
        int itemCount5 = offset;
        return new LazyStaggeredGridMeasureResult(firstItemIndices5, firstItemOffsets5, consumedScroll, MeasureScope.layout$default(scope$iv, layoutWidth5, layoutHeight6, null, new LazyStaggeredGridMeasureKt$measure$1$33($this$measure, positionedItems, scope$iv), 4, null), scrollBackAmount, canScrollForward, $this$measure.isVertical(), remeasureNeeded4, $this$measure.getResolvedSlots(), $this$measure.getItemProvider().getSpanProvider(), scope$iv, itemCount5, r316, IntSize.m7139constructorimpl((((long) layoutWidth5) << 32) | (((long) layoutHeight6) & 4294967295L)), minOffset, maxOffset2, $this$measure.getBeforeContentPadding(), $this$measure.getAfterContentPadding(), $this$measure.getMainAxisSpacing(), $this$measure.getCoroutineScope(), null);
    L500:
        it8 = 0;
        goto L501
    L504:
        r74 = true;
    L508:
        canScrollForward = true;
        goto L509
    L489:
        it7 = 0;
        goto L490
    L493:
        r71 = false;
        goto L494
    L474:
        newMainAxisSize = layoutWidth4;
        goto L475
    L470:
        r512 = layoutWidth3;
    L483:
        layoutWidth5 = layoutWidth3;
        layoutHeight6 = layoutHeight4;
        goto L484
    L344:
        if ($this$itemsRetainedForLookahead$iv.getApproachLayoutInfo() != null) goto L346;
    L406:
        extraItemOffset3 = extraItemOffset2;
        goto L408
    L346:
        if ($this$itemsRetainedForLookahead$iv.getApproachLayoutInfo().getVisibleItemsInfo().isEmpty() == true) goto L406;
        extraItemOffset3 = extraItemOffset2;
        List<LazyStaggeredGridItemInfo> r75 = $this$itemsRetainedForLookahead$iv.getApproachLayoutInfo().getVisibleItemsInfo();
        LazyStaggeredGridItemInfo found$iv = null;
        int i$iv8 = r75.size() - 1;
    L348:
        ArrayDeque[] measuredItems5 = measuredItems4;
        if ((-1) >= i$iv8) goto L357;
        if (r75.get(i$iv8).getIndex() <= lastVisibleItemIndex$iv) goto L356;
        if (i$iv8 == 0) goto L355;
        if (r75.get(i$iv8 - 1).getIndex() > lastVisibleItemIndex$iv) goto L356;
    L355:
        LazyStaggeredGridItemInfo found$iv2 = r75.get(i$iv8);
        found$iv = found$iv2;
    L356:
        i$iv8 = i$iv8 - 1;
        measuredItems4 = measuredItems5;
    L357:
        LazyStaggeredGridItemInfo lastVisibleItem$iv = (LazyStaggeredGridItemInfo) CollectionsKt.last($this$itemsRetainedForLookahead$iv.getApproachLayoutInfo().getVisibleItemsInfo());
        if (found$iv == null) goto L408;
        int i$iv9 = found$iv.getIndex();
        int r76 = Math.min(lastVisibleItem$iv.getIndex(), offset - 1);
        if (i$iv9 > r76) goto L408;
        int i$iv10 = i$iv9;
        int extraItemOffset8 = extraItemOffset3;
    L362:
        if (list$iv == null) goto L376;
        List $this$fastAny$iv$iv = list$iv;
        List $this$fastForEach$iv$iv$iv = $this$fastAny$iv$iv;
        int lastVisibleItemIndex$iv2 = lastVisibleItemIndex$iv;
        int lastVisibleItemIndex$iv3 = $this$fastForEach$iv$iv$iv.size();
        boolean isLookingAhead$iv2 = isLookingAhead$iv;
        int index$iv$iv$iv5 = 0;
    L364:
        if (index$iv$iv$iv5 >= lastVisibleItemIndex$iv3) goto L372;
        int r318 = lastVisibleItemIndex$iv3;
        List $this$fastForEach$iv$iv$iv2 = $this$fastForEach$iv$iv$iv;
        if (((LazyStaggeredGridMeasuredItem) $this$fastForEach$iv$iv$iv2.get(index$iv$iv$iv5)).getIndex() != i$iv10) goto L368;
        boolean r77 = true;
    L369:
        if (r77 == true) goto L370;
        index$iv$iv$iv5 = index$iv$iv$iv5 + 1;
        lastVisibleItemIndex$iv3 = r318;
        $this$fastForEach$iv$iv$iv = $this$fastForEach$iv$iv$iv2;
        goto L364
    L370:
        boolean r78 = true;
    L374:
        if (r78 != true) goto L377;
        int lastVisibleItemIndex$iv4 = 1;
    L378:
        if (lastVisibleItemIndex$iv4 != 0) goto L400;
        if (list$iv != null) goto L381;
        list$iv = new ArrayList();
    L381:
        List list$iv2 = list$iv;
        List<LazyStaggeredGridItemInfo> r319 = $this$itemsRetainedForLookahead$iv.getApproachLayoutInfo().getVisibleItemsInfo();
        int r79 = r319.size();
        int index$iv$iv$iv6 = 0;
    L382:
        if (index$iv$iv$iv6 >= r79) goto L390;
        int r320 = r79;
        List<LazyStaggeredGridItemInfo> r80 = r319;
        Object item$iv$iv$iv = r80.get(index$iv$iv$iv6);
        if (((LazyStaggeredGridItemInfo) item$iv$iv$iv).getIndex() != i$iv10) goto L386;
        boolean r81 = true;
    L387:
        if (r81 == true) goto L388;
        index$iv$iv$iv6 = index$iv$iv$iv6 + 1;
        r79 = r320;
        r319 = r80;
        goto L382
    L388:
        Object r82 = item$iv$iv$iv;
    L391:
        LazyStaggeredGridItemInfo r83 = (LazyStaggeredGridItemInfo) r82;
        if (r83 == null) goto L394;
        int lane$iv = r83.getLane();
    L395:
        LazyStaggeredGridMeasureContext $this$itemsRetainedForLookahead$iv2 = $this$itemsRetainedForLookahead$iv;
        long spanRange$iv3 = $this$itemsRetainedForLookahead$iv2.m938getSpanRangelOCCd4c($this$itemsRetainedForLookahead$iv.getItemProvider(), i$iv10, lane$iv);
        LazyStaggeredGridMeasuredItem item$iv = $this$itemsRetainedForLookahead$iv2.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(i$iv10, spanRange$iv3);
        list$iv2.add(item$iv);
        list$iv = list$iv2;
        int[] it$iv = $this$itemsRetainedForLookahead$iv2.getResolvedSlots().getPositions();
        if (it$iv.length <= lane$iv) goto L398;
        int crossAxisOffset$iv = it$iv[lane$iv];
    L399:
        int crossAxis = crossAxisOffset$iv;
        item$iv.position(extraItemOffset8, crossAxis, mainAxisLayoutSize);
        extraItemOffset8 = extraItemOffset8 + item$iv.getMainAxisSizeWithSpacings();
    L401:
        if (i$iv10 == r76) goto L403;
        i$iv10 = i$iv10 + 1;
        $this$itemsRetainedForLookahead$iv = $this$itemsRetainedForLookahead$iv2;
        isLookingAhead$iv = isLookingAhead$iv2;
        lastVisibleItemIndex$iv = lastVisibleItemIndex$iv2;
        firstItemIndices5 = firstItemIndices5;
        preScrollBackScrollDelta = preScrollBackScrollDelta;
        scrollToBeConsumed = scrollToBeConsumed;
        contentPadding = contentPadding;
        goto L362
    L403:
        extraItemOffset4 = extraItemOffset8;
        goto L409
    L398:
        crossAxisOffset$iv = 0;
        goto L399
    L394:
        lane$iv = 0;
        goto L395
    L386:
        r81 = false;
        goto L387
    L390:
        r82 = null;
        goto L391
    L400:
        $this$itemsRetainedForLookahead$iv2 = $this$itemsRetainedForLookahead$iv;
    L377:
        lastVisibleItemIndex$iv4 = 0;
        goto L378
    L368:
        r77 = false;
        goto L369
    L372:
        r78 = false;
        goto L374
    L376:
        lastVisibleItemIndex$iv2 = lastVisibleItemIndex$iv;
        isLookingAhead$iv2 = isLookingAhead$iv;
        goto L377
    L340:
        lastVisibleItemIndex$iv = -1;
        goto L341
    L326:
        r61 = r214;
        goto L327
    L328:
        index$iv = extraItemOffset;
        goto L330
    L320:
        firstIndex2 = 0;
        goto L322
    L317:
        firstIndex = -1;
        goto L318
    L303:
        measuredItems2 = measuredItems;
        int r84 = measuredItems2.length;
        int r85 = 0;
    L304:
        if (r85 >= r84) goto L316;
        LazyStaggeredGridMeasuredItem r513 = (LazyStaggeredGridMeasuredItem) measuredItems2[r85].firstOrNull();
        if (r513 == null) goto L308;
        int r514 = r513.getIndex();
    L309:
        int firstIndex3 = r514;
        int r515 = r85;
        if (firstIndex3 <= index$iv2) goto L312;
        int firstIndex4 = 1;
    L313:
        if (firstIndex4 == 0) goto L314;
        r85 = r515 + 1;
        goto L304
    L314:
        firstIndex2 = 0;
        goto L322
    L312:
        firstIndex4 = 0;
        goto L313
    L308:
        r514 = -1;
        goto L309
    L316:
        firstIndex2 = 1;
        goto L322
    L333:
        itemScrollOffsets2 = itemScrollOffsets;
        measuredItems2 = measuredItems;
        goto L335
    L295:
        r58 = layoutWidth3;
        goto L296
    L291:
        layoutHeight3 = Constraints.m6925getMaxHeightimpl($this$measure.m935getConstraintsmsEJaDk());
        goto L293
    L287:
        r57 = ConstraintsKt.m6943constrainWidthK40F9xA($this$measure.m935getConstraintsmsEJaDk(), ArraysKt.maxOrThrow(currentItemOffsets) + contentPadding);
    L259:
        scrollBackAmount = 0.0f;
        goto L260
    L250:
        if (Math.abs(Math.round(scrollToBeConsumed)) < Math.abs(scrollDelta4)) goto L252;
        r212 = scrollDelta4;
        goto L253
    L201:
        firstItemIndices5 = firstItemIndices3;
        goto L202
    L193:
        currentIndex = firstItemIndices3[laneIndex5];
        goto L194
    L238:
        firstItemIndices5 = firstItemIndices3;
        goto L239
    L178:
        r41 = false;
        goto L179
    L182:
        r42 = false;
        goto L183
    L246:
        offset = offset;
        firstItemIndices5 = firstItemIndices3;
        firstItemOffsets4 = firstItemOffsets3;
        goto L247
    L166:
        r39 = false;
        goto L167
    L170:
        maxOffset2 = maxOffset;
        r40 = true;
        goto L171
    L154:
        r37 = false;
        goto L155
    L158:
        r38 = false;
        goto L159
    L124:
        r34 = true;
    L126:
        int currentLaneIndex = indexOfMinValue$default(currentItemOffsets, 0, 1, null);
        int itemIndex3 = ArraysKt.maxOrThrow(currentItemIndices3) + 1;
        if (itemIndex3 >= offset) goto L128;
        maxOffset = maxOffset;
        measuredItems = measuredItems;
        initialItemsMeasured = initialItemsMeasured;
        offset = offset;
        initialLaneToMeasure = initialLaneToMeasure2;
        firstItemIndices3 = firstItemIndices3;
        firstItemOffsets3 = firstItemOffsets3;
        long spanRange4 = $this$measure.m938getSpanRangelOCCd4c($this$measure.getItemProvider(), itemIndex3, currentLaneIndex);
        LazyStaggeredGridLaneInfo r86 = $this$measure.getLaneInfo();
        if ((((int) (spanRange4 & 4294967295L)) - ((int) (spanRange4 >> 32))) == 1) goto L514;
        boolean r126 = true;
    L515:
        if (r126 == false) goto L517;
        int r87 = -2;
    L518:
        r86.setLane(itemIndex3, r87);
        LazyStaggeredGridMeasuredItem measuredItem4 = $this$measure.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(itemIndex3, spanRange4);
        int offset5 = m942maxInRangejy6DScQ(currentItemOffsets, spanRange4);
        r3 = r3;
        if ((((int) (spanRange4 & 4294967295L)) - ((int) (spanRange4 >> 32))) == 1) goto L521;
        boolean r127 = true;
    L522:
        if (r127 == false) goto L526;
        int[] gaps6 = $this$measure.getLaneInfo().getGaps(itemIndex3);
        if (gaps6 != null) goto L527;
        gaps6 = new int[$this$measure.getLaneCount()];
    L527:
        int minVisibleOffset2 = minVisibleOffset;
        int i$iv11 = (int) (spanRange4 >> 32);
        long $this$forEach_u2dnIS5qE8$iv = spanRange4 & 4294967295L;
        int r88 = (int) $this$forEach_u2dnIS5qE8$iv;
    L528:
        if (i$iv11 >= r88) goto L533;
        int lane8 = i$iv11;
        if (gaps6 == null) goto L532;
        gaps6[lane8] = offset5 - currentItemOffsets[lane8];
    L532:
        currentItemIndices3[lane8] = itemIndex3;
        currentItemOffsets[lane8] = measuredItem4.getMainAxisSizeWithSpacings() + offset5;
        measuredItems[lane8].addLast(measuredItem4);
        i$iv11 = i$iv11 + 1;
        goto L528
    L533:
        $this$measure.getLaneInfo().setGaps(itemIndex3, gaps6);
        minVisibleOffset = minVisibleOffset2;
        if (offset5 >= minVisibleOffset) goto L105;
        if (currentItemOffsets[(int) (spanRange4 >> 32)] > minVisibleOffset) goto L105;
        measuredItem4.setVisible(false);
        goto L105
    L526:
        gaps6 = null;
        goto L527
    L521:
        r127 = false;
        goto L522
    L517:
        r87 = (int) (spanRange4 >> 32);
        goto L518
    L514:
        r126 = false;
    L112:
        it = 1;
        goto L113
    L116:
        initialLaneToMeasure2 = initialLaneToMeasure;
        initialLaneToMeasure3 = 0;
        goto L117
    L57:
        laneToCheckForGaps2 = laneToCheckForGaps;
        goto L59
    L53:
        scrollDelta4 = scrollDelta3;
        goto L54
    L49:
        scrollDelta3 = scrollDelta;
        remeasureNeeded3 = remeasureNeeded;
        r22 = 0;
        goto L50
    }

    private static final boolean measure$lambda$43$hasSpaceBeforeFirst(int[] firstItemIndices, int[] firstItemOffsets, LazyStaggeredGridMeasureContext $this_measure) {
        int lane = 0;
        int r1 = firstItemIndices.length;
    L4:
        if (lane >= r1) goto L11;
        int itemIndex = firstItemIndices[lane];
        int itemOffset = firstItemOffsets[lane];
        if (itemOffset >= Math.max(-$this_measure.getMainAxisSpacing(), 0)) goto L10;
        if (itemIndex <= 0) goto L10;
        return true;
    L10:
        lane = lane + 1;
        goto L4
    L11:
        return false;
    }

    private static final boolean measure$lambda$43$misalignedStart(int[] firstItemIndices, LazyStaggeredGridMeasureContext $this_measure, int[] firstItemOffsets, int referenceLane) {
        int lane = 0;
        int r1 = firstItemIndices.length;
    L3:
        boolean misalignedOffsets = false;
        if (lane >= r1) goto L15;
        if (findPreviousItemIndex($this_measure, firstItemIndices[lane], lane) == (-1)) goto L8;
    L12:
        if (misalignedOffsets == true) goto L13;
        lane = lane + 1;
        goto L3
    L13:
        return true;
    L8:
        if (firstItemOffsets[lane] == firstItemOffsets[referenceLane]) goto L12;
        misalignedOffsets = true;
        goto L12
    L15:
        int lane2 = 0;
        int r2 = firstItemIndices.length;
    L16:
        if (lane2 >= r2) goto L27;
        if (findPreviousItemIndex($this_measure, firstItemIndices[lane2], lane2) != (-1)) goto L20;
    L22:
        boolean moreItemsInOtherLanes = false;
    L24:
        if (moreItemsInOtherLanes == true) goto L25;
        lane2 = lane2 + 1;
        goto L16
    L25:
        return true;
    L20:
        if (firstItemOffsets[lane2] < firstItemOffsets[referenceLane]) goto L22;
        moreItemsInOtherLanes = true;
        goto L24
    L27:
        int firstItemLane = $this_measure.getLaneInfo().getLane(0);
        if (firstItemLane == 0) goto L38;
        if (firstItemLane != (-1)) goto L31;
        return false;
    L31:
        if (firstItemLane != (-2)) goto L33;
        return false;
    L33:
        return true;
    L38:
        return false;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext $this$calculateVisibleItems, ArrayDeque<LazyStaggeredGridMeasuredItem>[] r25, int[] itemScrollOffsets, int mainAxisLayoutSize, int minOffset, int maxOffset) {
        ArrayDeque<LazyStaggeredGridMeasuredItem>[] r0 = r25;
        int[] r1 = itemScrollOffsets;
        int r2 = r0.length;
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r2) goto L5;
        r5 = r5 + r0[r4].size();
        r4 = r4 + 1;
        goto L3
    L5:
        ArrayList positionedItems = new ArrayList(r5);
    L6:
        int r6 = r25.length;
        int r7 = 0;
    L7:
        if (r7 >= r6) goto L12;
        if (r25[r7].isEmpty() == false) goto L10;
        r7 = r7 + 1;
        goto L7
    L10:
        boolean r8 = true;
    L13:
        if (r8 == false) goto L39;
        int result$iv = -1;
        int min$iv = Integer.MAX_VALUE;
        int i$iv = 0;
        int r9 = r25.length;
    L15:
        if (i$iv >= r9) goto L24;
        LazyStaggeredGridMeasuredItem r12 = r25[i$iv].firstOrNull();
        if (r12 == null) goto L19;
        int value$iv = r12.getIndex();
    L21:
        if (min$iv <= value$iv) goto L23;
        min$iv = value$iv;
        result$iv = i$iv;
    L23:
        i$iv = i$iv + 1;
        goto L15
    L19:
        value$iv = Integer.MAX_VALUE;
        goto L21
    L24:
        LazyStaggeredGridMeasuredItem item = r0[result$iv].removeFirst();
        if (item.getLane() != result$iv) goto L6;
        long spanRange = SpanRange.m953constructorimpl(item.getLane(), item.getSpan());
        int mainAxisOffset = m942maxInRangejy6DScQ(r1, spanRange);
        int crossAxisOffset = $this$calculateVisibleItems.getResolvedSlots().getPositions()[result$iv];
        int maxEdge = item.getMainAxisSize() + mainAxisOffset;
        if (maxEdge < minOffset) goto L34;
        if (mainAxisOffset > maxOffset) goto L34;
        item.position(mainAxisOffset, crossAxisOffset, mainAxisLayoutSize);
        positionedItems.add(item);
    L34:
        int i$iv2 = (int) (spanRange >> 32);
        int r3 = (int) (spanRange & 4294967295L);
    L35:
        if (i$iv2 >= r3) goto L37;
        int lane = i$iv2;
        itemScrollOffsets[lane] = mainAxisOffset + item.getMainAxisSizeWithSpacings();
        i$iv2 = i$iv2 + 1;
        goto L35
    L37:
        r0 = r25;
        r1 = itemScrollOffsets;
        goto L6
    L39:
        return positionedItems;
    L12:
        r8 = false;
        goto L13
    }

    private static final List<LazyStaggeredGridMeasuredItem> itemsRetainedForLookahead(LazyStaggeredGridMeasureContext $this$itemsRetainedForLookahead, int lastVisibleItemIndex, int itemsCount, boolean isLookingAhead, Function2<? super LazyStaggeredGridMeasuredItem, ? super Integer, Unit> r24) {
        List list = null;
        if (isLookingAhead == false) goto L65;
        if ($this$itemsRetainedForLookahead.getApproachLayoutInfo() == null) goto L65;
        if ($this$itemsRetainedForLookahead.getApproachLayoutInfo().getVisibleItemsInfo().isEmpty() == true) goto L65;
        List<LazyStaggeredGridItemInfo> r3 = $this$itemsRetainedForLookahead.getApproachLayoutInfo().getVisibleItemsInfo();
        LazyStaggeredGridItemInfo found = null;
        boolean r7 = true;
        int i = r3.size() - 1;
    L10:
        if ((-1) >= i) goto L18;
        if (r3.get(i).getIndex() <= lastVisibleItemIndex) goto L17;
        if (i == 0) goto L16;
        if (r3.get(i - 1).getIndex() > lastVisibleItemIndex) goto L17;
    L16:
        LazyStaggeredGridItemInfo found2 = r3.get(i);
        found = found2;
    L17:
        i = i - 1;
    L18:
        LazyStaggeredGridItemInfo lastVisibleItem = (LazyStaggeredGridItemInfo) CollectionsKt.last($this$itemsRetainedForLookahead.getApproachLayoutInfo().getVisibleItemsInfo());
        if (found == null) goto L65;
        int i2 = found.getIndex();
        int r6 = Math.min(lastVisibleItem.getIndex(), itemsCount - 1);
        if (i2 > r6) goto L65;
    L22:
        if (list == null) goto L35;
        List $this$fastAny$iv = list;
        int index$iv$iv = 0;
        int r14 = $this$fastAny$iv.size();
    L24:
        if (index$iv$iv >= r14) goto L32;
        Object item$iv$iv = $this$fastAny$iv.get(index$iv$iv);
        if (((LazyStaggeredGridMeasuredItem) item$iv$iv).getIndex() != i2) goto L28;
        boolean r8 = r7;
    L29:
        if (r8 == true) goto L30;
        index$iv$iv = index$iv$iv + 1;
        goto L24
    L30:
        boolean r9 = r7;
    L33:
        if (r9 != r7) goto L35;
        boolean r10 = r7;
    L36:
        if (r10 == true) goto L59;
        if (list != null) goto L39;
        list = new ArrayList();
    L39:
        List<LazyStaggeredGridItemInfo> r11 = $this$itemsRetainedForLookahead.getApproachLayoutInfo().getVisibleItemsInfo();
        int index$iv$iv2 = 0;
        int r13 = r11.size();
    L40:
        if (index$iv$iv2 >= r13) goto L48;
        Object item$iv$iv2 = r11.get(index$iv$iv2);
        Object it$iv = item$iv$iv2;
        if (((LazyStaggeredGridItemInfo) it$iv).getIndex() != i2) goto L44;
        boolean r12 = true;
    L45:
        if (r12 == true) goto L49;
        index$iv$iv2 = index$iv$iv2 + 1;
    L49:
        LazyStaggeredGridItemInfo r15 = (LazyStaggeredGridItemInfo) it$iv;
        if (r15 == null) goto L52;
        int lane = r15.getLane();
    L53:
        long spanRange = $this$itemsRetainedForLookahead.m938getSpanRangelOCCd4c($this$itemsRetainedForLookahead.getItemProvider(), i2, lane);
        LazyStaggeredGridMeasuredItem item = $this$itemsRetainedForLookahead.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(i2, spanRange);
        list.add(item);
        int[] it = $this$itemsRetainedForLookahead.getResolvedSlots().getPositions();
        if (it.length <= lane) goto L56;
        int crossAxisOffset = it[lane];
    L57:
        r24.invoke(item, Integer.valueOf(crossAxisOffset));
        goto L59
    L56:
        crossAxisOffset = 0;
        goto L57
    L52:
        lane = 0;
        goto L53
    L44:
        r12 = false;
        goto L45
    L48:
        it$iv = null;
    L59:
        if (i2 == r6) goto L65;
        i2 = i2 + 1;
        r7 = true;
        goto L22
    L28:
        r8 = false;
        goto L29
    L32:
        r9 = false;
    L35:
        r10 = false;
    L65:
        return list;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext $this$calculateExtraItems, Function1<? super LazyStaggeredGridMeasuredItem, Unit> r19, Function1<? super Integer, Boolean> r20, boolean beforeVisibleBounds) {
        Function1<? super Integer, Boolean> r2 = r20;
        int $i$f$calculateExtraItems = 0;
        ArrayList r4 = null;
        List<Integer> r5 = $this$calculateExtraItems.getPinnedItems();
        int r7 = 0;
        if (beforeVisibleBounds == false) goto L20;
        int r10 = r5.size() - 1;
        if (r10 < 0) goto L32;
    L6:
        int index$iv$iv = r10;
        r10 = r10 - 1;
        Object item$iv$iv = r5.get(index$iv$iv);
        int index = ((Number) item$iv$iv).intValue();
        if (r2.invoke(Integer.valueOf(index)).booleanValue() == false) goto L15;
        ArrayList r17 = r4;
        long spanRange = $this$calculateExtraItems.m938getSpanRangelOCCd4c($this$calculateExtraItems.getItemProvider(), index, r7);
        if (r17 != null) goto L11;
        ArrayList r15 = new ArrayList();
    L12:
        LazyStaggeredGridMeasuredItem measuredItem = $this$calculateExtraItems.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(index, spanRange);
        r19.invoke(measuredItem);
        r15.add(measuredItem);
        r4 = r15;
        goto L15
    L11:
        r15 = r17;
    L15:
        if (r10 < 0) goto L32;
        $i$f$calculateExtraItems = $i$f$calculateExtraItems;
        r7 = 0;
    L32:
        if (r4 != null) goto L35;
        return CollectionsKt.emptyList();
    L35:
        return r4;
    L20:
        List<Integer> r3 = r5;
        int index$iv$iv2 = 0;
        int r9 = r3.size();
    L21:
        if (index$iv$iv2 >= r9) goto L32;
        Object item$iv$iv2 = r3.get(index$iv$iv2);
        int index2 = ((Number) item$iv$iv2).intValue();
        if (r2.invoke(Integer.valueOf(index2)).booleanValue() == false) goto L29;
        long spanRange2 = $this$calculateExtraItems.m938getSpanRangelOCCd4c($this$calculateExtraItems.getItemProvider(), index2, 0);
        if (r4 != null) goto L27;
        Object result = new ArrayList();
        r4 = (List) result;
    L27:
        LazyStaggeredGridMeasuredItem measuredItem2 = $this$calculateExtraItems.getMeasuredItemProvider().m947getAndMeasurejy6DScQ(index2, spanRange2);
        r19.invoke(measuredItem2);
        r4.add(measuredItem2);
    L29:
        index$iv$iv2 = index$iv$iv2 + 1;
        r2 = r20;
        r3 = r3;
        goto L21
    }

    static /* synthetic */ void fastForEach$default(List $this$fastForEach_u24default, boolean reverse, Function1 action, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        reverse = false;
    L6:
        if (reverse == false) goto L13;
        int r1 = $this$fastForEach_u24default.size() - 1;
        if (r1 < 0) goto L17;
    L9:
        int index$iv = r1;
        r1 = r1 - 1;
        Object item$iv = $this$fastForEach_u24default.get(index$iv);
        action.invoke(item$iv);
        if (r1 >= 0) goto L9;
        return;
    L17:
        return;
    L13:
        int index$iv2 = 0;
        int r2 = $this$fastForEach_u24default.size();
    L14:
        if (index$iv2 >= r2) goto L22;
        Object item$iv2 = $this$fastForEach_u24default.get(index$iv2);
        action.invoke(item$iv2);
        index$iv2 = index$iv2 + 1;
        goto L14
    }

    private static final <T> void fastForEach(List<? extends T> r6, boolean reverse, Function1<? super T, Unit> r8) {
        if (reverse == false) goto L10;
        int r3 = r6.size() - 1;
        if (r3 < 0) goto L14;
    L6:
        int index$iv = r3;
        r3 = r3 - 1;
        Object item$iv = r6.get(index$iv);
        r8.invoke(item$iv);
        if (r3 >= 0) goto L6;
        return;
    L14:
        return;
    L10:
        int index$iv2 = 0;
        int r4 = r6.size();
    L11:
        if (index$iv2 >= r4) goto L19;
        Object item$iv2 = r6.get(index$iv2);
        r8.invoke(item$iv2);
        index$iv2 = index$iv2 + 1;
        goto L11
    }

    /* JADX INFO: renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m941forEachnIS5qE8(long $this$forEach_u2dnIS5qE8, Function1<? super Integer, Unit> r10) {
        int i = (int) ($this$forEach_u2dnIS5qE8 >> 32);
        int r3 = (int) (4294967295L & $this$forEach_u2dnIS5qE8);
    L3:
        if (i >= r3) goto L5;
        r10.invoke(Integer.valueOf(i));
        i = i + 1;
        goto L3
    }

    private static final void offsetBy(int[] $this$offsetBy, int delta) {
        int i = 0;
        int r1 = $this$offsetBy.length;
    L3:
        if (i >= r1) goto L5;
        $this$offsetBy[i] = $this$offsetBy[i] + delta;
        i = i + 1;
        goto L3
    }

    /* JADX INFO: renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m942maxInRangejy6DScQ(int[] $this$maxInRange_u2djy6DScQ, long indexRange) {
        int max = Integer.MIN_VALUE;
        int i$iv = (int) (indexRange >> 32);
        int r6 = (int) (4294967295L & indexRange);
    L3:
        if (i$iv >= r6) goto L6;
        int it = i$iv;
        max = Math.max(max, $this$maxInRange_u2djy6DScQ[it]);
        i$iv = i$iv + 1;
        goto L3
    L6:
        return max;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = Integer.MIN_VALUE;
    L6:
        return indexOfMinValue(r0, r1);
    }

    public static final int indexOfMinValue(int[] $this$indexOfMinValue, int minBound) {
        int result = -1;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int r3 = $this$indexOfMinValue.length;
    L3:
        if (i >= r3) goto L11;
        int r4 = minBound + 1;
        int r5 = $this$indexOfMinValue[i];
        boolean r6 = false;
        if (r4 > r5) goto L8;
        if (r5 >= min) goto L8;
        r6 = true;
    L8:
        if (r6 == false) goto L10;
        min = $this$indexOfMinValue[i];
        result = i;
    L10:
        i = i + 1;
        goto L3
    L11:
        return result;
    }

    private static final <T> int indexOfMinBy(T[] r6, Function1<? super T, Integer> r7) {
        int result = -1;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int r4 = r6.length;
    L3:
        if (i >= r4) goto L8;
        int value = r7.invoke(r6[i]).intValue();
        if (min <= value) goto L7;
        min = value;
        result = i;
    L7:
        i = i + 1;
        goto L3
    L8:
        return result;
    }

    private static final int indexOfMaxValue(int[] $this$indexOfMaxValue) {
        int result = -1;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int r3 = $this$indexOfMaxValue.length;
    L3:
        if (i >= r3) goto L8;
        if (max >= $this$indexOfMaxValue[i]) goto L7;
        max = $this$indexOfMaxValue[i];
        result = i;
    L7:
        i = i + 1;
        goto L3
    L8:
        return result;
    }

    private static final int[] transform(int[] $this$transform, Function1<? super Integer, Integer> r5) {
        int i = 0;
        int r2 = $this$transform.length;
    L3:
        if (i >= r2) goto L5;
        $this$transform[i] = r5.invoke(Integer.valueOf($this$transform[i])).intValue();
        i = i + 1;
        goto L3
    L5:
        return $this$transform;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext $this$ensureIndicesInRange, int[] indices, int itemCount) {
        int r0 = indices.length - 1;
        if (r0 < 0) goto L18;
    L4:
        int i = r0;
        r0 = r0 - 1;
    L6:
        if (indices[i] >= itemCount) goto L17;
        if ($this$ensureIndicesInRange.getLaneInfo().assignedToLane(indices[i], i) == false) goto L17;
        if (indices[i] < 0) goto L15;
        if ($this$ensureIndicesInRange.isFullSpan($this$ensureIndicesInRange.getItemProvider(), indices[i]) == true) goto L15;
        $this$ensureIndicesInRange.getLaneInfo().setLane(indices[i], i);
    L15:
        if (r0 >= 0) goto L4;
        return;
    L17:
        indices[i] = findPreviousItemIndex($this$ensureIndicesInRange, indices[i], i);
        goto L6
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext $this$findPreviousItemIndex, int item, int lane) {
        return $this$findPreviousItemIndex.getLaneInfo().findPreviousItemIndex(item, lane);
    }
}
