package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyListMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\\\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002\u001a4\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002\u001a\u009f\u0002\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0002002\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u00101\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010!2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2/\u0010;\u001a+\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=¢\u0006\u0002\b@\u0012\u0004\u0012\u00020A0<H\u0000ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "items", "", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "isVertical", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "createItemsAfterList", "visibleItems", "measuredItemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "itemsCount", "beyondBoundsItemCount", "pinnedItems", "consumedScroll", "", "isLookingAhead", "lastApproachLayoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "createItemsBeforeList", "currentFirstItemIndex", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "scrollToBeConsumed", "constraints", "Landroidx/compose/ui/unit/Constraints;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "hasLookaheadOccurred", "approachLayoutInfo", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyItemsPlacement", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "layout", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyList-LCrQqZ4", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyListMeasureKt {
    /* JADX INFO: renamed from: measureLazyList-LCrQqZ4, reason: not valid java name */
    public static final LazyListMeasureResult m834measureLazyListLCrQqZ4(int itemsCount, final LazyListMeasuredItemProvider measuredItemProvider, int mainAxisAvailableSize, int beforeContentPadding, int afterContentPadding, int spaceBetweenItems, int firstVisibleItemIndex, int firstVisibleItemScrollOffset, float scrollToBeConsumed, long constraints, boolean isVertical, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, boolean reverseLayout, Density density, LazyLayoutItemAnimator<LazyListMeasuredItem> r74, int beyondBoundsItemCount, List<Integer> r76, boolean hasLookaheadOccurred, final boolean isLookingAhead, LazyListLayoutInfo approachLayoutInfo, CoroutineScope coroutineScope, final MutableState<Unit> r81, GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> r84) {
        int preScrollBackScrollDelta = beforeContentPadding;
        boolean r26 = true;
        if (preScrollBackScrollDelta < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("invalid beforeContentPadding");
    L10:
        if (afterContentPadding < 0) goto L12;
        boolean value$iv2 = true;
    L14:
        if (value$iv2 == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("invalid afterContentPadding");
    L17:
        if (itemsCount > 0) goto L29;
        int layoutWidth = Constraints.m6928getMinWidthimpl(constraints);
        int layoutHeight = Constraints.m6927getMinHeightimpl(constraints);
        r74.onMeasured(0, layoutWidth, layoutHeight, new ArrayList(), measuredItemProvider.getKeyIndexMap(), measuredItemProvider, isVertical, isLookingAhead, 1, hasLookaheadOccurred, 0, 0, coroutineScope, graphicsContext);
        if (isLookingAhead == true) goto L23;
        long disappearingItemsSize = r74.m893getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m7142equalsimpl0(disappearingItemsSize, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L23;
        layoutWidth = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, (int) (disappearingItemsSize >> 32));
        layoutHeight = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, (int) (disappearingItemsSize & 4294967295L));
    L23:
        MeasureResult r39 = r84.invoke(Integer.valueOf(layoutWidth), Integer.valueOf(layoutHeight), LazyListMeasureKt$measureLazyList$3.INSTANCE);
        List r46 = CollectionsKt.emptyList();
        int r0 = -preScrollBackScrollDelta;
        int r48 = mainAxisAvailableSize + afterContentPadding;
        if (isVertical == false) goto L26;
        Orientation r1 = Orientation.Vertical;
    L28:
        return new LazyListMeasureResult(null, 0, false, 0.0f, r39, 0.0f, false, coroutineScope, density, measuredItemProvider.m843getChildConstraintsmsEJaDk(), r46, r0, r48, 0, reverseLayout, r1, afterContentPadding, spaceBetweenItems, null);
    L26:
        r1 = Orientation.Horizontal;
        goto L28
    L29:
        int currentFirstItemIndex = firstVisibleItemIndex;
        int currentFirstItemScrollOffset = firstVisibleItemScrollOffset;
        if (currentFirstItemIndex < itemsCount) goto L32;
        currentFirstItemIndex = itemsCount - 1;
        currentFirstItemScrollOffset = 0;
    L32:
        int scrollDelta = Math.round(scrollToBeConsumed);
        int currentFirstItemScrollOffset2 = currentFirstItemScrollOffset - scrollDelta;
        if (currentFirstItemIndex != 0) goto L36;
        if (currentFirstItemScrollOffset2 >= 0) goto L36;
        int scrollDelta2 = scrollDelta + currentFirstItemScrollOffset2;
        currentFirstItemScrollOffset2 = 0;
        int scrollDelta3 = scrollDelta2;
    L37:
        ArrayDeque visibleItems = new ArrayDeque();
        int r2 = -preScrollBackScrollDelta;
        if (spaceBetweenItems >= 0) goto L40;
        int r3 = spaceBetweenItems;
    L41:
        int minOffset = r2 + r3;
        int previous = currentFirstItemScrollOffset2 + minOffset;
        int maxCrossAxis = 0;
        boolean remeasureNeeded = false;
        int currentFirstItemIndex2 = currentFirstItemIndex;
    L42:
        if (previous >= 0) goto L45;
        if (currentFirstItemIndex2 <= 0) goto L45;
        int currentFirstItemScrollOffset3 = previous;
        int currentFirstItemScrollOffset4 = currentFirstItemIndex2 - 1;
        int maxCrossAxis2 = maxCrossAxis;
        LazyListMeasuredItem measuredItem = LazyListMeasuredItemProvider.m840getAndMeasure0kLqBqw$default(measuredItemProvider, currentFirstItemScrollOffset4, 0, 2, null);
        visibleItems.add(0, measuredItem);
        int maxCrossAxis3 = Math.max(maxCrossAxis2, measuredItem.getCrossAxisSize());
        int maxCrossAxis4 = measuredItem.getMainAxisSizeWithSpacings();
        currentFirstItemIndex2 = currentFirstItemScrollOffset4;
        maxCrossAxis = maxCrossAxis3;
        previous = maxCrossAxis4 + currentFirstItemScrollOffset3;
    L45:
        int currentFirstItemScrollOffset5 = previous;
        int currentFirstItemIndex3 = maxCrossAxis;
        if (currentFirstItemScrollOffset5 >= minOffset) goto L48;
        int notConsumedScrollDelta = minOffset - currentFirstItemScrollOffset5;
        int currentFirstItemScrollOffset6 = minOffset;
        scrollDelta3 = scrollDelta3 - notConsumedScrollDelta;
    L49:
        int currentFirstItemScrollOffset7 = currentFirstItemScrollOffset6 - minOffset;
        int index = currentFirstItemIndex2;
        int maxMainAxis = RangesKt.coerceAtLeast(mainAxisAvailableSize + afterContentPadding, 0);
        int currentMainAxisOffset = -currentFirstItemScrollOffset7;
        int indexInVisibleItems = 0;
    L51:
        if (indexInVisibleItems >= visibleItems.size()) goto L55;
        if (currentMainAxisOffset >= maxMainAxis) goto L53;
        index = index + 1;
        currentMainAxisOffset = currentMainAxisOffset + ((LazyListMeasuredItem) visibleItems.get(indexInVisibleItems)).getMainAxisSizeWithSpacings();
        indexInVisibleItems = indexInVisibleItems + 1;
        goto L51
    L53:
        visibleItems.remove(indexInVisibleItems);
        remeasureNeeded = true;
        goto L51
    L55:
        int currentFirstItemScrollOffset8 = currentFirstItemScrollOffset7;
        boolean remeasureNeeded2 = remeasureNeeded;
        int currentMainAxisOffset2 = index;
        int index2 = currentMainAxisOffset;
    L56:
        if (currentMainAxisOffset2 >= itemsCount) goto L71;
        if (index2 < maxMainAxis) goto L63;
        if (index2 <= 0) goto L63;
        if (visibleItems.isEmpty() == false) goto L71;
    L63:
        int indexInVisibleItems2 = indexInVisibleItems;
        int maxMainAxis2 = maxMainAxis;
        int maxCrossAxis5 = currentFirstItemIndex3;
        int scrollDelta4 = scrollDelta3;
        int scrollDelta5 = index2;
        LazyListMeasuredItem measuredItem2 = LazyListMeasuredItemProvider.m840getAndMeasure0kLqBqw$default(measuredItemProvider, currentMainAxisOffset2, 0, 2, null);
        int index3 = currentMainAxisOffset2;
        int index4 = measuredItem2.getMainAxisSizeWithSpacings();
        int currentMainAxisOffset3 = index4 + scrollDelta5;
        if (currentMainAxisOffset3 <= minOffset) goto L66;
    L68:
        currentFirstItemIndex3 = Math.max(maxCrossAxis5, measuredItem2.getCrossAxisSize());
        visibleItems.add(measuredItem2);
    L69:
        currentMainAxisOffset2 = index3 + 1;
        index2 = currentMainAxisOffset3;
        scrollDelta3 = scrollDelta4;
        maxMainAxis = maxMainAxis2;
        indexInVisibleItems = indexInVisibleItems2;
        goto L56
    L66:
        if (index3 == (itemsCount - 1)) goto L68;
        currentFirstItemScrollOffset8 = currentFirstItemScrollOffset8 - measuredItem2.getMainAxisSizeWithSpacings();
        currentFirstItemIndex2 = index3 + 1;
        remeasureNeeded2 = true;
        currentFirstItemIndex3 = maxCrossAxis5;
    L71:
        int previousIndex = scrollDelta3;
        if (index2 >= mainAxisAvailableSize) goto L81;
        int toScrollBack = mainAxisAvailableSize - index2;
        int currentFirstItemScrollOffset9 = currentFirstItemScrollOffset8 - toScrollBack;
        int currentMainAxisOffset4 = index2 + toScrollBack;
    L74:
        if (currentFirstItemScrollOffset9 >= preScrollBackScrollDelta) goto L77;
        if (currentFirstItemIndex2 <= 0) goto L77;
        int preScrollBackScrollDelta2 = previousIndex;
        int preScrollBackScrollDelta3 = currentFirstItemIndex2 - 1;
        int index5 = currentMainAxisOffset2;
        LazyListMeasuredItem measuredItem3 = LazyListMeasuredItemProvider.m840getAndMeasure0kLqBqw$default(measuredItemProvider, preScrollBackScrollDelta3, 0, 2, null);
        visibleItems.add(0, measuredItem3);
        currentFirstItemIndex3 = Math.max(currentFirstItemIndex3, measuredItem3.getCrossAxisSize());
        currentFirstItemScrollOffset9 = currentFirstItemScrollOffset9 + measuredItem3.getMainAxisSizeWithSpacings();
        currentFirstItemIndex2 = preScrollBackScrollDelta3;
        previousIndex = preScrollBackScrollDelta2;
        currentMainAxisOffset2 = index5;
        preScrollBackScrollDelta = beforeContentPadding;
    L77:
        int index6 = currentMainAxisOffset2;
        int preScrollBackScrollDelta4 = previousIndex;
        boolean r4 = false;
        LazyListMeasuredItemProvider r5 = measuredItemProvider;
        int preScrollBackScrollDelta5 = scrollDelta3 + toScrollBack;
        if (currentFirstItemScrollOffset9 >= 0) goto L80;
        int currentMainAxisOffset5 = currentMainAxisOffset4 + currentFirstItemScrollOffset9;
        int currentFirstItemScrollOffset10 = preScrollBackScrollDelta5 + currentFirstItemScrollOffset9;
        int scrollDelta6 = 0;
        int currentMainAxisOffset6 = currentMainAxisOffset5;
        int currentMainAxisOffset7 = currentFirstItemIndex2;
    L83:
        if (MathKt.getSign(Math.round(scrollToBeConsumed)) == MathKt.getSign(currentFirstItemScrollOffset10)) goto L85;
    L87:
        float consumedScroll = scrollToBeConsumed;
    L88:
        float unconsumedScroll = scrollToBeConsumed - consumedScroll;
        if (isLookingAhead == false) goto L94;
        if (currentFirstItemScrollOffset10 <= preScrollBackScrollDelta4) goto L94;
        if (unconsumedScroll > 0.0f) goto L94;
        float r6 = (currentFirstItemScrollOffset10 - preScrollBackScrollDelta4) + unconsumedScroll;
    L95:
        float scrollBackAmount = r6;
        if (scrollDelta6 < 0) goto L98;
        boolean value$iv3 = true;
    L100:
        if (value$iv3 == true) goto L102;
        InlineClassHelperKt.throwIllegalArgumentException("negative currentFirstItemScrollOffset");
    L102:
        int r7 = -scrollDelta6;
        LazyListMeasuredItem firstItem = (LazyListMeasuredItem) visibleItems.first();
        if (beforeContentPadding > 0) goto L107;
        if (spaceBetweenItems < 0) goto L107;
        int currentFirstItemScrollOffset11 = scrollDelta6;
        LazyListMeasuredItem firstItem2 = firstItem;
    L120:
        List<LazyListMeasuredItem> r35 = createItemsBeforeList(currentMainAxisOffset7, r5, beyondBoundsItemCount, r76);
        int r8 = r35.size();
        LazyListMeasuredItem firstItem3 = firstItem2;
        int index$iv = 0;
    L121:
        if (index$iv >= r8) goto L123;
        Object item$iv = r35.get(index$iv);
        LazyListMeasuredItem it = (LazyListMeasuredItem) item$iv;
        currentFirstItemIndex3 = Math.max(currentFirstItemIndex3, it.getCrossAxisSize());
        index$iv = index$iv + 1;
        r8 = r8;
        goto L121
    L123:
        List<LazyListMeasuredItem> r36 = createItemsAfterList(visibleItems, measuredItemProvider, itemsCount, beyondBoundsItemCount, r76, consumedScroll, isLookingAhead, approachLayoutInfo);
        float consumedScroll2 = consumedScroll;
        List<LazyListMeasuredItem> r9 = r36;
        int index$iv2 = 0;
        int r10 = r9.size();
        int maxCrossAxis6 = currentFirstItemIndex3;
    L124:
        if (index$iv2 >= r10) goto L127;
        Object item$iv2 = r9.get(index$iv2);
        LazyListMeasuredItem it2 = (LazyListMeasuredItem) item$iv2;
        maxCrossAxis6 = Math.max(maxCrossAxis6, it2.getCrossAxisSize());
        index$iv2 = index$iv2 + 1;
        r9 = r9;
        goto L124
    L127:
        if (Intrinsics.areEqual(firstItem3, visibleItems.first()) == true) goto L129;
    L133:
        boolean r11 = false;
    L134:
        boolean noExtraItems = r11;
        if (isVertical == false) goto L137;
        int r12 = maxCrossAxis6;
    L138:
        int layoutWidth2 = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, r12);
        if (isVertical == false) goto L141;
        int r13 = currentMainAxisOffset6;
    L142:
        int layoutHeight2 = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, r13);
        final List<LazyListMeasuredItem> r14 = calculateItemsOffsets(visibleItems, r35, r36, layoutWidth2, layoutHeight2, currentMainAxisOffset6, mainAxisAvailableSize, r7, isVertical, verticalArrangement, horizontalArrangement, reverseLayout, density);
        int currentMainAxisOffset8 = currentMainAxisOffset6;
        r74.onMeasured((int) consumedScroll2, layoutWidth2, layoutHeight2, r14, measuredItemProvider.getKeyIndexMap(), measuredItemProvider, isVertical, isLookingAhead, 1, hasLookaheadOccurred, currentFirstItemScrollOffset11, currentMainAxisOffset8, coroutineScope, graphicsContext);
        if (isLookingAhead == true) goto L162;
        long disappearingItemsSize2 = r74.m893getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m7142equalsimpl0(disappearingItemsSize2, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L162;
        if (isVertical == false) goto L148;
        int oldMainAxisSize = layoutHeight2;
    L149:
        consumedScroll2 = consumedScroll2;
        int layoutWidth3 = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, Math.max(layoutWidth2, (int) (disappearingItemsSize2 >> 32)));
        int layoutHeight3 = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, Math.max(layoutHeight2, (int) (disappearingItemsSize2 & 4294967295L)));
        if (isVertical == false) goto L152;
        int newMainAxisSize = layoutHeight3;
    L153:
        if (newMainAxisSize == oldMainAxisSize) goto L158;
        int index$iv3 = 0;
        int r15 = r14.size();
    L155:
        if (index$iv3 >= r15) goto L157;
        Object item$iv3 = r14.get(index$iv3);
        int layoutHeight4 = layoutHeight3;
        LazyListMeasuredItem it3 = (LazyListMeasuredItem) item$iv3;
        it3.updateMainAxisLayoutSize(newMainAxisSize);
        index$iv3 = index$iv3 + 1;
        layoutHeight3 = layoutHeight4;
        goto L155
    L157:
        int layoutHeight5 = layoutHeight3;
    L159:
        int maxCrossAxis7 = layoutHeight5;
    L163:
        final List stickingItems = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, r14, measuredItemProvider.getHeaderIndexes(), beforeContentPadding, afterContentPadding, layoutWidth3, maxCrossAxis7, new LazyListMeasureKt$measureLazyList$stickingItems$1(measuredItemProvider));
        int layoutWidth4 = layoutWidth3;
        int layoutHeight6 = maxCrossAxis7;
        Integer r16 = null;
        if (noExtraItems == false) goto L169;
        LazyListMeasuredItem r17 = (LazyListMeasuredItem) CollectionsKt.firstOrNull(r14);
        if (r17 == null) goto L168;
        Integer r18 = Integer.valueOf(r17.getIndex());
    L173:
        Integer firstVisibleIndex = r18;
        if (noExtraItems == false) goto L178;
        LazyListMeasuredItem r19 = (LazyListMeasuredItem) CollectionsKt.lastOrNull(r14);
        if (r19 == null) goto L181;
        r16 = Integer.valueOf(r19.getIndex());
    L181:
        Integer lastVisibleIndex = r16;
        if (index6 < itemsCount) goto L186;
        if (currentMainAxisOffset8 > mainAxisAvailableSize) goto L186;
        r26 = false;
    L186:
        MeasureResult r20 = r84.invoke(Integer.valueOf(layoutWidth4), Integer.valueOf(layoutHeight6), new LazyListMeasureKt$measureLazyList$8(r81, r14, stickingItems, isLookingAhead));
        if (firstVisibleIndex == null) goto L189;
        int r21 = firstVisibleIndex.intValue();
    L190:
        if (lastVisibleIndex == null) goto L192;
        int r22 = lastVisibleIndex.intValue();
    L193:
        List r23 = LazyLayoutMeasuredItemKt.updatedVisibleItems(r21, r22, r14, stickingItems);
        int r110 = -beforeContentPadding;
        int maxOffset = mainAxisAvailableSize + afterContentPadding;
        if (isVertical == false) goto L196;
        Orientation r24 = Orientation.Vertical;
    L198:
        return new LazyListMeasureResult(firstItem3, currentFirstItemScrollOffset11, r26, consumedScroll2, r20, scrollBackAmount, remeasureNeeded2, coroutineScope, density, measuredItemProvider.m843getChildConstraintsmsEJaDk(), r23, r110, maxOffset, itemsCount, reverseLayout, r24, afterContentPadding, spaceBetweenItems, null);
    L196:
        r24 = Orientation.Horizontal;
        goto L198
    L192:
        r22 = 0;
        goto L193
    L189:
        r21 = 0;
        goto L190
    L178:
        LazyListMeasuredItem r25 = (LazyListMeasuredItem) visibleItems.lastOrNull();
        if (r25 == null) goto L181;
        r16 = Integer.valueOf(r25.getIndex());
        goto L181
    L168:
        r18 = null;
        goto L173
    L169:
        LazyListMeasuredItem r27 = (LazyListMeasuredItem) visibleItems.firstOrNull();
        if (r27 == null) goto L172;
        r18 = Integer.valueOf(r27.getIndex());
        goto L173
    L172:
        r18 = null;
        goto L173
    L158:
        layoutHeight5 = layoutHeight3;
        goto L159
    L152:
        newMainAxisSize = layoutWidth3;
        goto L153
    L148:
        oldMainAxisSize = layoutWidth2;
    L162:
        layoutWidth3 = layoutWidth2;
        maxCrossAxis7 = layoutHeight2;
        goto L163
    L141:
        r13 = maxCrossAxis6;
        goto L142
    L137:
        r12 = currentMainAxisOffset6;
        goto L138
    L129:
        if (r35.isEmpty() == false) goto L133;
        if (r36.isEmpty() == false) goto L133;
        r11 = true;
    L107:
        int r28 = visibleItems.size();
        int visibleItemsScrollOffset = 0;
    L108:
        if (visibleItemsScrollOffset >= r28) goto L118;
        int r111 = r28;
        int size = ((LazyListMeasuredItem) visibleItems.get(visibleItemsScrollOffset)).getMainAxisSizeWithSpacings();
        if (scrollDelta6 == 0) goto L116;
        if (size > scrollDelta6) goto L115;
        int currentFirstItemScrollOffset12 = scrollDelta6;
        int currentFirstItemScrollOffset13 = CollectionsKt.getLastIndex(visibleItems);
        if (visibleItemsScrollOffset == currentFirstItemScrollOffset13) goto L119;
        int currentFirstItemScrollOffset14 = visibleItemsScrollOffset + 1;
        firstItem = (LazyListMeasuredItem) visibleItems.get(currentFirstItemScrollOffset14);
        visibleItemsScrollOffset = visibleItemsScrollOffset + 1;
        scrollDelta6 = currentFirstItemScrollOffset12 - size;
        r28 = r111;
    L119:
        currentFirstItemScrollOffset11 = currentFirstItemScrollOffset12;
        firstItem2 = firstItem;
        goto L120
    L115:
        currentFirstItemScrollOffset12 = scrollDelta6;
        goto L119
    L116:
        currentFirstItemScrollOffset12 = scrollDelta6;
        goto L119
    L118:
        currentFirstItemScrollOffset12 = scrollDelta6;
        goto L119
    L98:
        value$iv3 = r4;
    L94:
        r6 = 0.0f;
        goto L95
    L85:
        if (Math.abs(Math.round(scrollToBeConsumed)) < Math.abs(currentFirstItemScrollOffset10)) goto L87;
        consumedScroll = currentFirstItemScrollOffset10;
        goto L88
    L80:
        int currentMainAxisOffset9 = currentFirstItemScrollOffset9;
        currentFirstItemScrollOffset10 = preScrollBackScrollDelta5;
        scrollDelta6 = currentMainAxisOffset9;
        currentMainAxisOffset6 = currentMainAxisOffset4;
        currentMainAxisOffset7 = currentFirstItemIndex2;
        goto L83
    L81:
        index6 = currentMainAxisOffset2;
        preScrollBackScrollDelta4 = previousIndex;
        r4 = false;
        r5 = measuredItemProvider;
        currentMainAxisOffset6 = index2;
        scrollDelta6 = currentFirstItemScrollOffset8;
        currentMainAxisOffset7 = currentFirstItemIndex2;
        currentFirstItemScrollOffset10 = scrollDelta3;
        goto L83
    L48:
        currentFirstItemScrollOffset6 = currentFirstItemScrollOffset5;
        goto L49
    L40:
        r3 = 0;
    L36:
        scrollDelta3 = scrollDelta;
        goto L37
    L12:
        value$iv2 = false;
        goto L14
    L5:
        value$iv = false;
        goto L7
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> r22, LazyListMeasuredItemProvider measuredItemProvider, int itemsCount, int beyondBoundsItemCount, List<Integer> r26, float consumedScroll, boolean isLookingAhead, LazyListLayoutInfo lastApproachLayoutInfo) {
        List r1 = null;
        int end = Math.min(((LazyListMeasuredItem) CollectionsKt.last(r22)).getIndex() + beyondBoundsItemCount, itemsCount - 1);
        boolean r4 = true;
        int i = ((LazyListMeasuredItem) CollectionsKt.last(r22)).getIndex() + 1;
        if (i > end) goto L10;
        int i2 = i;
    L5:
        if (r1 != null) goto L7;
        Object list = new ArrayList();
        r1 = (List) list;
    L7:
        r1.add(LazyListMeasuredItemProvider.m840getAndMeasure0kLqBqw$default(measuredItemProvider, i2, 0, 2, null));
        if (i2 == end) goto L10;
        i2 = i2 + 1;
    L10:
        if (isLookingAhead == false) goto L87;
        if (lastApproachLayoutInfo == null) goto L87;
        if (lastApproachLayoutInfo.getVisibleItemsInfo().isEmpty() == true) goto L87;
        List<LazyListItemInfo> r3 = lastApproachLayoutInfo.getVisibleItemsInfo();
        LazyListItemInfo found = null;
        int i3 = r3.size() - 1;
    L16:
        if ((-1) >= i3) goto L24;
        if (r3.get(i3).getIndex() <= end) goto L23;
        if (i3 == 0) goto L22;
        if (r3.get(i3 - 1).getIndex() > end) goto L23;
    L22:
        LazyListItemInfo found2 = r3.get(i3);
        found = found2;
    L23:
        i3 = i3 - 1;
    L24:
        LazyListItemInfo lastVisibleItem = (LazyListItemInfo) CollectionsKt.last(lastApproachLayoutInfo.getVisibleItemsInfo());
        if (found == null) goto L49;
        int i4 = found.getIndex();
        int r14 = Math.min(lastVisibleItem.getIndex(), itemsCount - 1);
        if (i4 > r14) goto L48;
        int i5 = i4;
    L29:
        if (r1 == null) goto L41;
        List $this$fastFirstOrNull$iv = r1;
        int index$iv$iv = 0;
        int r15 = $this$fastFirstOrNull$iv.size();
    L31:
        if (index$iv$iv >= r15) goto L39;
        Object item$iv$iv = $this$fastFirstOrNull$iv.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        boolean r21 = r4;
        if (((LazyListMeasuredItem) it$iv).getIndex() != i5) goto L35;
        boolean r5 = r21;
    L36:
        if (r5 == true) goto L40;
        index$iv$iv = index$iv$iv + 1;
        r4 = r21;
    L40:
        LazyListMeasuredItem r17 = (LazyListMeasuredItem) it$iv;
    L42:
        if (r17 != null) goto L46;
        if (r1 != null) goto L45;
        Object list2 = new ArrayList();
        r1 = (List) list2;
    L45:
        r1.add(LazyListMeasuredItemProvider.m840getAndMeasure0kLqBqw$default(measuredItemProvider, i5, 0, 2, null));
    L46:
        if (i5 == r14) goto L50;
        i5 = i5 + 1;
        r4 = r21;
    L50:
        float additionalOffset = ((lastApproachLayoutInfo.getViewportEndOffset() - lastVisibleItem.getOffset()) - lastVisibleItem.getSize()) - consumedScroll;
        if (additionalOffset <= 0.0f) goto L87;
        int index = lastVisibleItem.getIndex() + 1;
        int totalOffset = 0;
    L53:
        if (index >= itemsCount) goto L87;
        if (totalOffset >= additionalOffset) goto L87;
        if (index > end) goto L68;
        int index$iv$iv2 = 0;
        int r16 = r22.size();
    L58:
        if (index$iv$iv2 >= r16) goto L66;
        Object item$iv$iv2 = r22.get(index$iv$iv2);
        Object it$iv2 = item$iv$iv2;
        if (((LazyListMeasuredItem) it$iv2).getIndex() != index) goto L62;
        boolean r6 = r21;
    L63:
        if (r6 == true) goto L67;
        index$iv$iv2 = index$iv$iv2 + 1;
    L67:
        LazyListMeasuredItem item = (LazyListMeasuredItem) it$iv2;
    L82:
        if (item != null) goto L83;
        if (r1 != null) goto L86;
        Object list3 = new ArrayList();
        r1 = (List) list3;
    L86:
        r1.add(LazyListMeasuredItemProvider.m840getAndMeasure0kLqBqw$default(measuredItemProvider, index, 0, 2, null));
        index = index + 1;
        totalOffset = totalOffset + ((LazyListMeasuredItem) CollectionsKt.last(r1)).getMainAxisSizeWithSpacings();
        goto L53
    L83:
        index = index + 1;
        totalOffset = totalOffset + item.getMainAxisSizeWithSpacings();
        goto L53
    L62:
        r6 = false;
        goto L63
    L66:
        it$iv2 = null;
        goto L67
    L68:
        if (r1 == null) goto L80;
        List $this$fastFirstOrNull$iv2 = r1;
        int index$iv$iv3 = 0;
        int r12 = $this$fastFirstOrNull$iv2.size();
    L70:
        if (index$iv$iv3 >= r12) goto L78;
        Object item$iv$iv3 = $this$fastFirstOrNull$iv2.get(index$iv$iv3);
        Object it$iv3 = item$iv$iv3;
        if (((LazyListMeasuredItem) it$iv3).getIndex() != index) goto L74;
        boolean r13 = r21;
    L75:
        if (r13 == true) goto L79;
        index$iv$iv3 = index$iv$iv3 + 1;
    L79:
        item = (LazyListMeasuredItem) it$iv3;
        goto L82
    L74:
        r13 = false;
        goto L75
    L78:
        it$iv3 = null;
        goto L79
    L80:
        item = null;
        goto L82
    L35:
        r5 = false;
        goto L36
    L39:
        r21 = r4;
        it$iv = null;
        goto L40
    L41:
        r21 = r4;
        r17 = null;
        goto L42
    L48:
        r21 = true;
        goto L50
    L49:
        r21 = true;
    L87:
        if (r1 == null) goto L92;
        List it = r1;
        if (((LazyListMeasuredItem) CollectionsKt.last(it)).getIndex() <= end) goto L92;
        end = ((LazyListMeasuredItem) CollectionsKt.last(it)).getIndex();
    L92:
        int index$iv = 0;
        int r7 = r26.size();
    L93:
        if (index$iv >= r7) goto L101;
        Object item$iv = r26.get(index$iv);
        int index2 = ((Number) item$iv).intValue();
        if (index2 <= end) goto L99;
        if (r1 != null) goto L98;
        List list4 = new ArrayList();
        r1 = list4;
    L98:
        r1.add(LazyListMeasuredItemProvider.m840getAndMeasure0kLqBqw$default(measuredItemProvider, index2, 0, 2, null));
    L99:
        index$iv = index$iv + 1;
        goto L93
    L101:
        if (r1 != null) goto L104;
        return CollectionsKt.emptyList();
    L104:
        return r1;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int currentFirstItemIndex, LazyListMeasuredItemProvider measuredItemProvider, int beyondBoundsItemCount, List<Integer> r17) {
        ArrayList r0 = null;
        int start = Math.max(0, currentFirstItemIndex - beyondBoundsItemCount);
        int i = currentFirstItemIndex - 1;
        if (start > i) goto L10;
        int i2 = i;
    L5:
        if (r0 != null) goto L7;
        Object list = new ArrayList();
        r0 = (List) list;
    L7:
        r0.add(LazyListMeasuredItemProvider.m840getAndMeasure0kLqBqw$default(measuredItemProvider, i2, 0, 2, null));
        if (i2 == start) goto L10;
        i2 = i2 - 1;
    L10:
        int r4 = r17.size() - 1;
        if (r4 < 0) goto L20;
    L12:
        int index$iv = r4;
        r4 = r4 - 1;
        Object item$iv = r17.get(index$iv);
        int index = ((Number) item$iv).intValue();
        if (index >= start) goto L18;
        if (r0 != null) goto L16;
        Object list2 = new ArrayList();
        r0 = (List) list2;
    L16:
        r0.add(LazyListMeasuredItemProvider.m840getAndMeasure0kLqBqw$default(measuredItemProvider, index, 0, 2, null));
    L18:
        if (r4 >= 0) goto L12;
    L20:
        if (r0 != null) goto L23;
        return CollectionsKt.emptyList();
    L23:
        return r0;
    }

    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> r19, List<LazyListMeasuredItem> r20, List<LazyListMeasuredItem> r21, int layoutWidth, int layoutHeight, int finalMainAxisOffset, int maxOffset, int itemsScrollOffset, boolean isVertical, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, boolean reverseLayout, Density density) {
        List<LazyListMeasuredItem> r0 = r19;
        if (isVertical == false) goto L5;
        int r4 = layoutHeight;
    L6:
        int mainAxisLayoutSize = r4;
        int r6 = 0;
        boolean value$iv = true;
        if (finalMainAxisOffset >= Math.min(mainAxisLayoutSize, maxOffset)) goto L9;
        boolean r5 = true;
    L10:
        boolean hasSpareSpace = r5;
        if (hasSpareSpace == false) goto L19;
        if (itemsScrollOffset != 0) goto L14;
        boolean value$iv2 = true;
    L16:
        if (value$iv2 == true) goto L19;
        InlineClassHelperKt.throwIllegalStateException("non-zero itemsScrollOffset");
        goto L19
    L14:
        value$iv2 = false;
    L19:
        ArrayList positionedItems = new ArrayList((r0.size() + r20.size()) + r21.size());
        if (hasSpareSpace == true) goto L22;
        int currentMainAxis = itemsScrollOffset;
        int index$iv = 0;
        int r8 = r20.size();
    L62:
        if (index$iv >= r8) goto L64;
        Object item$iv = r20.get(index$iv);
        LazyListMeasuredItem it = (LazyListMeasuredItem) item$iv;
        currentMainAxis = currentMainAxis - it.getMainAxisSizeWithSpacings();
        it.position(currentMainAxis, layoutWidth, layoutHeight);
        positionedItems.add(it);
        index$iv = index$iv + 1;
        goto L62
    L64:
        int currentMainAxis2 = itemsScrollOffset;
        int index$iv2 = 0;
        int r9 = r19.size();
    L65:
        if (index$iv2 >= r9) goto L67;
        Object item$iv2 = r19.get(index$iv2);
        LazyListMeasuredItem it2 = (LazyListMeasuredItem) item$iv2;
        it2.position(currentMainAxis2, layoutWidth, layoutHeight);
        positionedItems.add(it2);
        currentMainAxis2 = currentMainAxis2 + it2.getMainAxisSizeWithSpacings();
        index$iv2 = index$iv2 + 1;
        goto L65
    L67:
        int index$iv3 = 0;
        int r10 = r21.size();
    L68:
        if (index$iv3 >= r10) goto L72;
        Object item$iv3 = r21.get(index$iv3);
        LazyListMeasuredItem it3 = (LazyListMeasuredItem) item$iv3;
        it3.position(currentMainAxis2, layoutWidth, layoutHeight);
        positionedItems.add(it3);
        currentMainAxis2 = currentMainAxis2 + it3.getMainAxisSizeWithSpacings();
        index$iv3 = index$iv3 + 1;
    L72:
        return positionedItems;
    L22:
        if (r20.isEmpty() == true) goto L24;
    L26:
        value$iv = false;
    L28:
        if (value$iv == true) goto L30;
        InlineClassHelperKt.throwIllegalArgumentException("no extra items");
    L30:
        int itemsCount = r0.size();
        int[] sizes = new int[itemsCount];
    L31:
        if (r6 >= itemsCount) goto L33;
        sizes[r6] = r0.get(calculateItemsOffsets$reverseAware(r6, reverseLayout, itemsCount)).getSize();
        r6 = r6 + 1;
        goto L31
    L33:
        int[] offsets = new int[itemsCount];
        if (isVertical == false) goto L41;
        if (verticalArrangement == null) goto L38;
        verticalArrangement.arrange(density, mainAxisLayoutSize, sizes, offsets);
    L43:
        IntRange reverseAwareOffsetIndices = ArraysKt.getIndices(offsets);
        if (reverseLayout == false) goto L47;
        reverseAwareOffsetIndices = RangesKt.reversed(reverseAwareOffsetIndices);
    L47:
        int index = reverseAwareOffsetIndices.getFirst();
        int r11 = reverseAwareOffsetIndices.getLast();
        int r15 = reverseAwareOffsetIndices.getStep();
        if (r15 <= 0) goto L50;
        if (index > r11) goto L50;
    L52:
        int absoluteOffset = offsets[index];
        LazyListMeasuredItem item = r0.get(calculateItemsOffsets$reverseAware(index, reverseLayout, itemsCount));
        if (reverseLayout == false) goto L55;
        int r17 = (mainAxisLayoutSize - absoluteOffset) - item.getSize();
    L56:
        int relativeOffset = r17;
        item.position(relativeOffset, layoutWidth, layoutHeight);
        positionedItems.add(item);
        if (index == r11) goto L72;
        index = index + r15;
        r0 = r19;
        goto L52
    L55:
        r17 = absoluteOffset;
    L50:
        if (r15 >= 0) goto L72;
        if (r11 > index) goto L72;
    L38:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
        throw new KotlinNothingValueException();
    L41:
        if (horizontalArrangement == null) goto L59;
        horizontalArrangement.arrange(density, mainAxisLayoutSize, sizes, LayoutDirection.Ltr, offsets);
        goto L43
    L59:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
        throw new KotlinNothingValueException();
    L24:
        if (r21.isEmpty() == false) goto L26;
    L9:
        r5 = false;
        goto L10
    L5:
        r4 = layoutWidth;
        goto L6
    }

    private static final int calculateItemsOffsets$reverseAware(int $this$calculateItemsOffsets_u24reverseAware, boolean $reverseLayout, int itemsCount) {
        if ($reverseLayout == true) goto L5;
        return $this$calculateItemsOffsets_u24reverseAware;
    L5:
        return (itemsCount - $this$calculateItemsOffsets_u24reverseAware) - 1;
    }
}
