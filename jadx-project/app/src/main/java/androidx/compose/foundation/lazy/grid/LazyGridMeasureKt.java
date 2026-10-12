package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
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
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b\u001a\u008c\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001aF\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\b\u0010$\u001a\u0004\u0018\u00010%H\u0002\u001aÜ\u0002\u0010&\u001a\u00020'2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002032\u0006\u00104\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010%2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<23\u0010=\u001a/\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002010A0\u00010\n2\b\u0010B\u001a\u0004\u0018\u00010C2/\u0010D\u001a+\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0\n¢\u0006\u0002\bH\u0012\u0004\u0012\u00020I0EH\u0000ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001a+\u0010L\u001a\u00020G\"\u0004\b\u0000\u0010M*\b\u0012\u0004\u0012\u0002HM0\r2\f\u0010N\u001a\b\u0012\u0004\u0012\u0002HM0OH\u0002¢\u0006\u0002\u0010P\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q"}, d2 = {"calculateExtraItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "pinnedItems", "", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "filter", "Lkotlin/Function1;", "", "calculateItemsOffsets", "", "lines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "linesRetainedForLookahead", "lastVisibleItemIndex", "itemsCount", "isLookingAhead", "visibleLines", "lastApproachLayoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "scrollToBeConsumed", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "slotsPerLine", "isInLookaheadScope", "approachLayoutInfo", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "prefetchInfoRetriever", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "line", "Lkotlin/Pair;", "stickyItemsScrollBehavior", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyGrid-GyuLg2I", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "addAllFromArray", "T", "arr", "", "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridMeasureKt {
    /* JADX INFO: renamed from: measureLazyGrid-GyuLg2I, reason: not valid java name */
    public static final LazyGridMeasureResult m869measureLazyGridGyuLg2I(int itemsCount, final LazyGridMeasuredLineProvider measuredLineProvider, final LazyGridMeasuredItemProvider measuredItemProvider, int mainAxisAvailableSize, int beforeContentPadding, int afterContentPadding, int spaceBetweenLines, int firstVisibleLineIndex, int firstVisibleLineScrollOffset, float scrollToBeConsumed, long constraints, boolean isVertical, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, boolean reverseLayout, Density density, LazyLayoutItemAnimator<LazyGridMeasuredItem> r80, int slotsPerLine, List<Integer> r82, boolean isInLookaheadScope, final boolean isLookingAhead, LazyGridLayoutInfo approachLayoutInfo, CoroutineScope coroutineScope, final MutableState<Unit> r87, GraphicsContext graphicsContext, Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> r89, StickyItemsPlacement stickyItemsScrollBehavior, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> r91) {
        if (beforeContentPadding < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
    L10:
        if (afterContentPadding < 0) goto L12;
        boolean value$iv2 = true;
    L14:
        if (value$iv2 == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
    L17:
        if (itemsCount > 0) goto L29;
        int layoutWidth = Constraints.m6928getMinWidthimpl(constraints);
        int layoutHeight = Constraints.m6927getMinHeightimpl(constraints);
        r80.onMeasured(0, layoutWidth, layoutHeight, new ArrayList(), measuredItemProvider.getKeyIndexMap(), measuredItemProvider, isVertical, isLookingAhead, slotsPerLine, isInLookaheadScope, 0, 0, coroutineScope, graphicsContext);
        if (isLookingAhead == true) goto L23;
        long disappearingItemsSize = r80.m893getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m7142equalsimpl0(disappearingItemsSize, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L23;
        layoutWidth = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, (int) (disappearingItemsSize >> 32));
        layoutHeight = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, (int) (disappearingItemsSize & 4294967295L));
    L23:
        MeasureResult r39 = r91.invoke(Integer.valueOf(layoutWidth), Integer.valueOf(layoutHeight), LazyGridMeasureKt$measureLazyGrid$3.INSTANCE);
        List r46 = CollectionsKt.emptyList();
        int r0 = -beforeContentPadding;
        int r48 = mainAxisAvailableSize + afterContentPadding;
        if (isVertical == false) goto L26;
        Orientation r1 = Orientation.Vertical;
    L28:
        return new LazyGridMeasureResult(null, 0, false, 0.0f, r39, 0.0f, false, coroutineScope, density, slotsPerLine, r89, r46, r0, r48, 0, reverseLayout, r1, afterContentPadding, spaceBetweenLines);
    L26:
        r1 = Orientation.Horizontal;
        goto L28
    L29:
        int currentFirstLineIndex = firstVisibleLineIndex;
        int scrollDelta = Math.round(scrollToBeConsumed);
        int currentFirstLineScrollOffset = firstVisibleLineScrollOffset - scrollDelta;
        if (currentFirstLineIndex != 0) goto L33;
        if (currentFirstLineScrollOffset >= 0) goto L33;
        scrollDelta = scrollDelta + currentFirstLineScrollOffset;
        currentFirstLineScrollOffset = 0;
    L33:
        ArrayDeque visibleLines = new ArrayDeque();
        int r4 = -beforeContentPadding;
        if (spaceBetweenLines >= 0) goto L36;
        int r5 = spaceBetweenLines;
    L37:
        int minOffset = r4 + r5;
        int currentFirstLineScrollOffset2 = currentFirstLineScrollOffset + minOffset;
    L38:
        if (currentFirstLineScrollOffset2 >= 0) goto L41;
        if (currentFirstLineIndex <= 0) goto L41;
        int previous = currentFirstLineIndex - 1;
        LazyGridMeasuredLine measuredLine = measuredLineProvider.getAndMeasure(previous);
        visibleLines.add(0, measuredLine);
        currentFirstLineScrollOffset2 = currentFirstLineScrollOffset2 + measuredLine.getMainAxisSizeWithSpacings();
        currentFirstLineIndex = previous;
    L41:
        if (currentFirstLineScrollOffset2 >= minOffset) goto L43;
        int notConsumedScrollDelta = minOffset - currentFirstLineScrollOffset2;
        currentFirstLineScrollOffset2 = minOffset;
        scrollDelta = scrollDelta - notConsumedScrollDelta;
    L43:
        int currentFirstLineIndex2 = currentFirstLineScrollOffset2 - minOffset;
        int index = currentFirstLineIndex;
        int maxMainAxis = RangesKt.coerceAtLeast(mainAxisAvailableSize + afterContentPadding, 0);
        int currentMainAxisOffset = -currentFirstLineIndex2;
        boolean remeasureNeeded = false;
        int indexInVisibleLines = 0;
    L44:
        currentFirstLineIndex = currentFirstLineIndex;
        if (indexInVisibleLines >= visibleLines.size()) goto L49;
        if (currentMainAxisOffset >= maxMainAxis) goto L47;
        index = index + 1;
        currentMainAxisOffset = currentMainAxisOffset + ((LazyGridMeasuredLine) visibleLines.get(indexInVisibleLines)).getMainAxisSizeWithSpacings();
        indexInVisibleLines = indexInVisibleLines + 1;
        goto L44
    L47:
        visibleLines.remove(indexInVisibleLines);
        remeasureNeeded = true;
        goto L44
    L49:
        boolean remeasureNeeded2 = remeasureNeeded;
        int currentFirstLineIndex3 = currentFirstLineIndex;
    L50:
        if (index >= itemsCount) goto L68;
        if (currentMainAxisOffset < maxMainAxis) goto L57;
        if (currentMainAxisOffset <= 0) goto L57;
        if (visibleLines.isEmpty() == true) goto L57;
        int currentFirstLineIndex4 = currentFirstLineIndex3;
    L69:
        int currentFirstLineIndex5 = scrollDelta;
        if (currentMainAxisOffset >= mainAxisAvailableSize) goto L79;
        int currentFirstLineScrollOffset3 = mainAxisAvailableSize - currentMainAxisOffset;
        int currentFirstLineScrollOffset4 = currentFirstLineIndex2 - currentFirstLineScrollOffset3;
        int currentMainAxisOffset2 = currentMainAxisOffset + currentFirstLineScrollOffset3;
    L72:
        if (currentFirstLineScrollOffset4 >= beforeContentPadding) goto L75;
        if (currentFirstLineIndex4 <= 0) goto L75;
        int toScrollBack = currentFirstLineScrollOffset3;
        int toScrollBack2 = currentFirstLineIndex4 - 1;
        int currentFirstLineScrollOffset5 = currentFirstLineScrollOffset4;
        LazyGridMeasuredLine measuredLine2 = measuredLineProvider.getAndMeasure(toScrollBack2);
        visibleLines.add(0, measuredLine2);
        currentFirstLineIndex4 = toScrollBack2;
        currentFirstLineScrollOffset4 = currentFirstLineScrollOffset5 + measuredLine2.getMainAxisSizeWithSpacings();
        currentFirstLineScrollOffset3 = toScrollBack;
    L75:
        int toScrollBack3 = currentFirstLineScrollOffset3;
        int currentFirstLineScrollOffset6 = currentFirstLineScrollOffset4;
        int scrollDelta2 = scrollDelta + toScrollBack3;
        if (currentFirstLineScrollOffset6 >= 0) goto L78;
        scrollDelta2 = scrollDelta2 + currentFirstLineScrollOffset6;
        int currentFirstLineScrollOffset7 = 0;
        int currentMainAxisOffset3 = currentMainAxisOffset2 + currentFirstLineScrollOffset6;
    L80:
        int minOffset2 = minOffset;
        if (MathKt.getSign(Math.round(scrollToBeConsumed)) == MathKt.getSign(scrollDelta2)) goto L83;
    L85:
        float consumedScroll = scrollToBeConsumed;
    L86:
        float unconsumedScroll = scrollToBeConsumed - consumedScroll;
        float r8 = 0.0f;
        if (isLookingAhead == false) goto L93;
        if (scrollDelta2 <= currentFirstLineIndex5) goto L93;
        if (unconsumedScroll > 0.0f) goto L93;
        r8 = (scrollDelta2 - currentFirstLineIndex5) + unconsumedScroll;
    L93:
        float scrollBackAmount = r8;
        if (currentFirstLineScrollOffset7 < 0) goto L96;
        boolean value$iv3 = true;
    L98:
        if (value$iv3 == true) goto L100;
        InlineClassHelperKt.throwIllegalArgumentException("negative initial offset");
    L100:
        int visibleLinesScrollOffset = -currentFirstLineScrollOffset7;
        LazyGridMeasuredLine firstLine = (LazyGridMeasuredLine) visibleLines.first();
        LazyGridMeasuredItem r19 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(firstLine.getItems());
        if (r19 == null) goto L103;
        int r110 = r19.getIndex();
    L104:
        int minOffset3 = r110;
        LazyGridMeasuredLine r111 = (LazyGridMeasuredLine) visibleLines.lastOrNull();
        if (r111 == null) goto L111;
        LazyGridMeasuredItem[] r112 = r111.getItems();
        if (r112 == null) goto L111;
        LazyGridMeasuredItem r113 = (LazyGridMeasuredItem) ArraysKt.lastOrNull(r112);
        if (r113 == null) goto L111;
        int lastItemIndex = r113.getIndex();
    L112:
        List extraItemsBefore = null;
        List<Integer> r22 = r82;
        int maxOffset = r22.size();
        int preScrollBackScrollDelta = 0;
    L113:
        if (preScrollBackScrollDelta >= maxOffset) goto L129;
        int r25 = maxOffset;
        List<Integer> r6 = r22;
        Object item$iv$iv = r6.get(preScrollBackScrollDelta);
        int index$iv$iv = preScrollBackScrollDelta;
        int index$iv = ((Number) item$iv$iv).intValue();
        if (index$iv < 0) goto L119;
        int it = currentFirstLineScrollOffset7;
        List<Integer> r37 = r6;
        int firstItemIndex = minOffset3;
        if (index$iv >= firstItemIndex) goto L120;
        int it2 = 1;
    L121:
        if (it2 == 0) goto L127;
        int index2 = index;
        int span$iv = measuredLineProvider.spanOf(index$iv);
        int maxMainAxis2 = maxMainAxis;
        long constraints$iv = measuredLineProvider.m873childConstraintsJhjzzOo$foundation_release(0, span$iv);
        int index3 = index2;
        int maxMainAxis3 = maxMainAxis2;
        int index4 = firstItemIndex;
        float consumedScroll2 = consumedScroll;
        LazyGridMeasuredItem measuredItem$iv = measuredItemProvider.mo841getAndMeasurehBUhpc(index$iv, 0, span$iv, constraints$iv);
        if (extraItemsBefore != null) goto L125;
        Object items$iv = new ArrayList();
        List r3 = (List) items$iv;
    L126:
        r3.add(measuredItem$iv);
        extraItemsBefore = r3;
    L128:
        consumedScroll = consumedScroll2;
        preScrollBackScrollDelta = index$iv$iv + 1;
        currentMainAxisOffset3 = currentMainAxisOffset3;
        maxOffset = r25;
        r22 = r37;
        visibleLinesScrollOffset = visibleLinesScrollOffset;
        minOffset2 = minOffset2;
        maxMainAxis = maxMainAxis3;
        index = index3;
        scrollDelta2 = scrollDelta2;
        minOffset3 = index4;
        currentFirstLineScrollOffset7 = it;
        goto L113
    L125:
        r3 = extraItemsBefore;
        goto L126
    L127:
        consumedScroll2 = consumedScroll;
        index4 = firstItemIndex;
        index3 = index;
        maxMainAxis3 = maxMainAxis;
    L120:
        it2 = 0;
        goto L121
    L119:
        it = currentFirstLineScrollOffset7;
        r37 = r6;
        firstItemIndex = minOffset3;
        goto L120
    L129:
        int currentFirstLineScrollOffset8 = currentFirstLineScrollOffset7;
        float consumedScroll3 = consumedScroll;
        int visibleLinesScrollOffset2 = visibleLinesScrollOffset;
        int currentMainAxisOffset4 = currentMainAxisOffset3;
        int currentFirstLineScrollOffset9 = minOffset3;
        if (extraItemsBefore != null) goto L132;
        extraItemsBefore = CollectionsKt.emptyList();
    L132:
        int lastItemIndex2 = lastItemIndex;
        List<LazyGridMeasuredLine> r7 = linesRetainedForLookahead(lastItemIndex2, itemsCount, measuredLineProvider, isLookingAhead, visibleLines, approachLayoutInfo);
        List<Integer> r2 = r82;
        int r9 = r2.size();
        ArrayList r20 = null;
        int index$iv$iv2 = 0;
    L133:
        if (index$iv$iv2 >= r9) goto L173;
        Object item$iv$iv2 = r2.get(index$iv$iv2);
        int index$iv2 = ((Number) item$iv$iv2).intValue();
        int lastItemIndex3 = lastItemIndex2;
        if ((lastItemIndex3 + 1) > index$iv2) goto L138;
        if (index$iv2 >= itemsCount) goto L138;
        boolean r10 = true;
    L139:
        if (r10 == false) goto L162;
        if (isLookingAhead == false) goto L160;
        List<LazyGridMeasuredLine> r34 = r7;
        int r11 = r34.size();
        int index$iv$iv3 = index$iv$iv2;
        int index$iv$iv4 = 0;
    L142:
        if (index$iv$iv4 >= r11) goto L157;
        int r38 = r11;
        List<LazyGridMeasuredLine> r12 = r34;
        Object item$iv$iv3 = r12.get(index$iv$iv4);
        LazyGridMeasuredLine line = (LazyGridMeasuredLine) item$iv$iv3;
        LazyGridMeasuredItem[] r13 = line.getItems();
        int index$iv$iv5 = index$iv$iv4;
        int index$iv$iv6 = r13.length;
        int r14 = 0;
    L144:
        if (r14 >= index$iv$iv6) goto L152;
        int r60 = r14;
        if (r13[r14].getIndex() != index$iv2) goto L148;
        boolean r15 = true;
    L149:
        if (r15 == true) goto L150;
        r14 = r60 + 1;
        goto L144
    L150:
        boolean r16 = true;
    L154:
        if (r16 == true) goto L155;
        index$iv$iv4 = index$iv$iv5 + 1;
        r11 = r38;
        r34 = r12;
        goto L142
    L155:
        boolean r17 = true;
    L158:
        if (r17 == false) goto L161;
    L163:
        int index$iv$iv7 = 0;
    L165:
        if (index$iv$iv7 == 0) goto L172;
        int span$iv2 = measuredLineProvider.spanOf(index$iv2);
        long constraints$iv2 = measuredLineProvider.m873childConstraintsJhjzzOo$foundation_release(0, span$iv2);
        LazyGridMeasuredItem measuredItem$iv2 = measuredItemProvider.mo841getAndMeasurehBUhpc(index$iv2, 0, span$iv2, constraints$iv2);
        if (r20 != null) goto L169;
        Object items$iv2 = new ArrayList();
        ArrayList r18 = (List) items$iv2;
    L170:
        r18.add(measuredItem$iv2);
        r20 = r18;
        goto L172
    L169:
        r18 = r20;
    L172:
        index$iv$iv2 = index$iv$iv3 + 1;
        r9 = r9;
        r2 = r2;
        lastItemIndex2 = lastItemIndex3;
    L161:
        index$iv$iv7 = 1;
        goto L165
    L148:
        r15 = false;
        goto L149
    L152:
        r16 = false;
        goto L154
    L157:
        r17 = false;
        goto L158
    L160:
        index$iv$iv3 = index$iv$iv2;
        goto L161
    L162:
        index$iv$iv3 = index$iv$iv2;
    L138:
        r10 = false;
        goto L139
    L173:
        int lastItemIndex4 = lastItemIndex2;
        if (r20 != null) goto L176;
        List extraItemsAfter = CollectionsKt.emptyList();
    L178:
        if (beforeContentPadding > 0) goto L182;
        if (spaceBetweenLines < 0) goto L182;
        int currentFirstLineScrollOffset10 = currentFirstLineScrollOffset8;
        LazyGridMeasuredLine firstLine2 = firstLine;
    L192:
        if (isVertical == false) goto L194;
        int layoutWidth2 = Constraints.m6926getMaxWidthimpl(constraints);
    L196:
        if (isVertical == false) goto L198;
        int layoutHeight2 = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, currentMainAxisOffset4);
    L200:
        if (r7.isEmpty() == false) goto L202;
        List r35 = visibleLines;
    L203:
        final List<LazyGridMeasuredItem> r114 = calculateItemsOffsets(r35, extraItemsBefore, extraItemsAfter, layoutWidth2, layoutHeight2, currentMainAxisOffset4, mainAxisAvailableSize, visibleLinesScrollOffset2, isVertical, verticalArrangement, horizontalArrangement, reverseLayout, density);
        int indexInVisibleLines2 = (int) consumedScroll3;
        int layoutHeight3 = layoutHeight2;
        int layoutWidth3 = layoutWidth2;
        r80.onMeasured(indexInVisibleLines2, layoutWidth3, layoutHeight3, r114, measuredItemProvider.getKeyIndexMap(), measuredItemProvider, isVertical, isLookingAhead, slotsPerLine, isInLookaheadScope, currentFirstLineScrollOffset10, currentMainAxisOffset4, coroutineScope, graphicsContext);
        if (isLookingAhead == true) goto L222;
        long disappearingItemsSize2 = r80.m893getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m7142equalsimpl0(disappearingItemsSize2, IntSize.Companion.m7149getZeroYbymL2g()) == true) goto L222;
        if (isVertical == false) goto L209;
        int oldMainAxisSize = layoutHeight3;
    L210:
        int layoutWidth4 = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, Math.max(layoutWidth3, (int) (disappearingItemsSize2 >> 32)));
        int layoutHeight4 = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, Math.max(layoutHeight3, (int) (disappearingItemsSize2 & 4294967295L)));
        if (isVertical == false) goto L213;
        int newMainAxisSize = layoutHeight4;
    L214:
        if (newMainAxisSize == oldMainAxisSize) goto L220;
        int layoutHeight5 = r114.size();
        int oldMainAxisSize2 = 0;
    L216:
        if (oldMainAxisSize2 >= layoutHeight5) goto L220;
        Object item$iv = r114.get(oldMainAxisSize2);
        int r23 = layoutHeight5;
        LazyGridMeasuredItem it3 = (LazyGridMeasuredItem) item$iv;
        it3.updateMainAxisLayoutSize(newMainAxisSize);
        oldMainAxisSize2 = oldMainAxisSize2 + 1;
        layoutHeight5 = r23;
    L220:
        int firstItemIndex2 = layoutHeight4;
        int layoutWidth5 = layoutWidth4;
    L223:
        final List stickingItems = LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsScrollBehavior, r114, measuredItemProvider.getHeaderIndices(), beforeContentPadding, afterContentPadding, layoutWidth5, firstItemIndex2, new LazyGridMeasureKt$measureLazyGrid$stickingItems$1(measuredLineProvider, measuredItemProvider));
        int layoutWidth6 = layoutWidth5;
        int layoutHeight6 = firstItemIndex2;
        if (lastItemIndex4 != (itemsCount - 1)) goto L228;
        if (currentMainAxisOffset4 > mainAxisAvailableSize) goto L228;
        boolean r21 = false;
    L229:
        boolean r115 = r21;
        MeasureResult r24 = r91.invoke(Integer.valueOf(layoutWidth6), Integer.valueOf(layoutHeight6), new LazyGridMeasureKt$measureLazyGrid$6(r87, r114, stickingItems, isLookingAhead));
        int currentMainAxisOffset5 = -beforeContentPadding;
        int r116 = mainAxisAvailableSize + afterContentPadding;
        List r117 = LazyLayoutMeasuredItemKt.updatedVisibleItems(currentFirstLineScrollOffset9, lastItemIndex4, r114, stickingItems);
        if (isVertical == false) goto L232;
        Orientation r26 = Orientation.Vertical;
    L234:
        return new LazyGridMeasureResult(firstLine2, currentFirstLineScrollOffset10, r115, consumedScroll3, r24, scrollBackAmount, remeasureNeeded2, coroutineScope, density, slotsPerLine, r89, r117, currentMainAxisOffset5, r116, itemsCount, reverseLayout, r26, afterContentPadding, spaceBetweenLines);
    L232:
        r26 = Orientation.Horizontal;
    L228:
        r21 = true;
        goto L229
    L213:
        newMainAxisSize = layoutWidth4;
        goto L214
    L209:
        oldMainAxisSize = layoutWidth3;
    L222:
        firstItemIndex2 = layoutHeight3;
        layoutWidth5 = layoutWidth3;
        goto L223
    L202:
        r35 = CollectionsKt.plus(visibleLines, r7);
        goto L203
    L198:
        layoutHeight2 = Constraints.m6925getMaxHeightimpl(constraints);
        goto L200
    L194:
        layoutWidth2 = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, currentMainAxisOffset4);
    L182:
        int i = 0;
        int r27 = visibleLines.size();
        int currentFirstLineScrollOffset11 = currentFirstLineScrollOffset8;
    L183:
        if (i >= r27) goto L191;
        int size = ((LazyGridMeasuredLine) visibleLines.get(i)).getMainAxisSizeWithSpacings();
        if (currentFirstLineScrollOffset11 == 0) goto L191;
        if (size > currentFirstLineScrollOffset11) goto L191;
        if (i == CollectionsKt.getLastIndex(visibleLines)) goto L191;
        currentFirstLineScrollOffset11 = currentFirstLineScrollOffset11 - size;
        firstLine = (LazyGridMeasuredLine) visibleLines.get(i + 1);
        i = i + 1;
    L191:
        currentFirstLineScrollOffset10 = currentFirstLineScrollOffset11;
        firstLine2 = firstLine;
        goto L192
    L176:
        extraItemsAfter = r20;
    L111:
        lastItemIndex = 0;
        goto L112
    L103:
        r110 = 0;
        goto L104
    L96:
        value$iv3 = false;
        goto L98
    L83:
        if (Math.abs(Math.round(scrollToBeConsumed)) < Math.abs(scrollDelta2)) goto L85;
        consumedScroll = scrollDelta2;
        goto L86
    L78:
        currentMainAxisOffset3 = currentMainAxisOffset2;
        currentFirstLineScrollOffset7 = currentFirstLineScrollOffset6;
        goto L80
    L79:
        currentMainAxisOffset3 = currentMainAxisOffset;
        scrollDelta2 = scrollDelta;
        currentFirstLineScrollOffset7 = currentFirstLineIndex2;
    L57:
        currentFirstLineIndex4 = currentFirstLineIndex3;
        LazyGridMeasuredLine measuredLine3 = measuredLineProvider.getAndMeasure(index);
        if (measuredLine3.isEmpty() == true) goto L69;
        currentMainAxisOffset = currentMainAxisOffset + measuredLine3.getMainAxisSizeWithSpacings();
        if (currentMainAxisOffset > minOffset) goto L65;
        int currentFirstLineScrollOffset12 = currentFirstLineIndex2;
        int scrollDelta3 = scrollDelta;
        if (((LazyGridMeasuredItem) ArraysKt.last(measuredLine3.getItems())).getIndex() == (itemsCount - 1)) goto L66;
        remeasureNeeded2 = true;
        currentFirstLineIndex4 = index + 1;
        currentFirstLineIndex2 = currentFirstLineScrollOffset12 - measuredLine3.getMainAxisSizeWithSpacings();
    L67:
        index = index + 1;
        currentFirstLineIndex3 = currentFirstLineIndex4;
        scrollDelta = scrollDelta3;
    L66:
        visibleLines.add(measuredLine3);
        currentFirstLineIndex2 = currentFirstLineScrollOffset12;
        goto L67
    L65:
        currentFirstLineScrollOffset12 = currentFirstLineIndex2;
        scrollDelta3 = scrollDelta;
        goto L66
    L68:
        currentFirstLineIndex4 = currentFirstLineIndex3;
        goto L69
    L36:
        r5 = 0;
        goto L37
    L12:
        value$iv2 = false;
        goto L14
    L5:
        value$iv = false;
        goto L7
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> r16, LazyGridMeasuredItemProvider measuredItemProvider, LazyGridMeasuredLineProvider measuredLineProvider, Function1<? super Integer, Boolean> r19) {
        ArrayList r2 = null;
        int index$iv = 0;
        int r6 = r16.size();
    L3:
        if (index$iv >= r6) goto L12;
        Object item$iv = r16.get(index$iv);
        int index = ((Number) item$iv).intValue();
        if (r19.invoke(Integer.valueOf(index)).booleanValue() == false) goto L10;
        int span = measuredLineProvider.spanOf(index);
        long constraints = measuredLineProvider.m873childConstraintsJhjzzOo$foundation_release(0, span);
        LazyGridMeasuredItem measuredItem = measuredItemProvider.mo841getAndMeasurehBUhpc(index, 0, span, constraints);
        if (r2 != null) goto L9;
        Object items = new ArrayList();
        r2 = (List) items;
    L9:
        r2.add(measuredItem);
    L10:
        index$iv = index$iv + 1;
        goto L3
    L12:
        if (r2 != null) goto L15;
        return CollectionsKt.emptyList();
    L15:
        return r2;
    }

    private static final List<LazyGridMeasuredLine> linesRetainedForLookahead(int lastVisibleItemIndex, int itemsCount, LazyGridMeasuredLineProvider measuredLineProvider, boolean isLookingAhead, List<LazyGridMeasuredLine> r29, LazyGridLayoutInfo lastApproachLayoutInfo) {
        List list = null;
        if (isLookingAhead == false) goto L58;
        if (lastApproachLayoutInfo == null) goto L58;
        if (lastApproachLayoutInfo.getVisibleItemsInfo().isEmpty() == true) goto L58;
        List<LazyGridItemInfo> r2 = lastApproachLayoutInfo.getVisibleItemsInfo();
        LazyGridItemInfo found = null;
        boolean r6 = true;
        int i = r2.size() - 1;
    L9:
        if ((-1) >= i) goto L17;
        if (r2.get(i).getIndex() <= lastVisibleItemIndex) goto L16;
        if (i == 0) goto L15;
        if (r2.get(i - 1).getIndex() > lastVisibleItemIndex) goto L16;
    L15:
        LazyGridItemInfo found2 = r2.get(i);
        found = found2;
    L16:
        i = i - 1;
    L17:
        LazyGridItemInfo lastVisibleItem = (LazyGridItemInfo) CollectionsKt.last(lastApproachLayoutInfo.getVisibleItemsInfo());
        LazyGridMeasuredLine it = (LazyGridMeasuredLine) CollectionsKt.lastOrNull(r29);
        if (it == null) goto L20;
        int lineIndex = it.getIndex() + 1;
    L21:
        if (found == null) goto L58;
        int i2 = found.getIndex();
        int r7 = Math.min(lastVisibleItem.getIndex(), itemsCount - 1);
        if (i2 > r7) goto L58;
    L24:
        if (list == null) goto L45;
        List $this$fastAny$iv = list;
        int index$iv$iv = 0;
        int r14 = $this$fastAny$iv.size();
    L26:
        if (index$iv$iv >= r14) goto L41;
        Object item$iv$iv = $this$fastAny$iv.get(index$iv$iv);
        LazyGridMeasuredItem[] r5 = ((LazyGridMeasuredLine) item$iv$iv).getItems();
        int r8 = r5.length;
        int r0 = 0;
    L28:
        if (r0 >= r8) goto L36;
        int r24 = r0;
        if (r5[r0].getIndex() != i2) goto L32;
        boolean r1 = true;
    L33:
        if (r1 == true) goto L34;
        r0 = r24 + 1;
        goto L28
    L34:
        boolean r3 = true;
    L38:
        if (r3 == true) goto L39;
        index$iv$iv = index$iv$iv + 1;
        goto L26
    L39:
        boolean r4 = true;
    L42:
        boolean r9 = true;
        if (r4 != true) goto L46;
        boolean r10 = true;
    L47:
        if (r10 == true) goto L52;
        if (list != null) goto L50;
        list = new ArrayList();
    L50:
        LazyGridMeasuredLine measuredLine = measuredLineProvider.getAndMeasure(lineIndex);
        lineIndex = lineIndex + 1;
        list.add(measuredLine);
    L52:
        if (i2 == r7) goto L58;
        i2 = i2 + 1;
        r6 = r9;
    L46:
        r10 = false;
        goto L47
    L32:
        r1 = false;
        goto L33
    L36:
        r3 = false;
        goto L38
    L41:
        r4 = false;
        goto L42
    L45:
        r9 = r6;
        goto L46
    L20:
        lineIndex = 0;
    L58:
        if (list != null) goto L61;
        return CollectionsKt.emptyList();
    L61:
        return list;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> r22, List<LazyGridMeasuredItem> r23, List<LazyGridMeasuredItem> r24, int layoutWidth, int layoutHeight, int finalMainAxisOffset, int maxOffset, int firstLineScrollOffset, boolean isVertical, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, boolean reverseLayout, Density density) {
        List<LazyGridMeasuredLine> r0 = r22;
        boolean r3 = reverseLayout;
        if (isVertical == false) goto L5;
        int r4 = layoutHeight;
    L6:
        int mainAxisLayoutSize = r4;
        if (finalMainAxisOffset >= Math.min(mainAxisLayoutSize, maxOffset)) goto L9;
        boolean r5 = true;
    L10:
        boolean hasSpareSpace = r5;
        if (hasSpareSpace == false) goto L19;
        if (firstLineScrollOffset != 0) goto L14;
        boolean value$iv = true;
    L16:
        if (value$iv == true) goto L19;
        InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
        goto L19
    L14:
        value$iv = false;
    L19:
        int sum$iv = 0;
        int index$iv$iv = 0;
        int r8 = r22.size();
    L20:
        if (index$iv$iv >= r8) goto L22;
        Object item$iv$iv = r22.get(index$iv$iv);
        sum$iv = sum$iv + ((LazyGridMeasuredLine) item$iv$iv).getItems().length;
        index$iv$iv = index$iv$iv + 1;
        goto L20
    L22:
        ArrayList positionedItems = new ArrayList(sum$iv);
        if (hasSpareSpace == true) goto L25;
        int currentMainAxis = firstLineScrollOffset;
        int r6 = r23.size() - 1;
        if (r6 < 0) goto L69;
    L66:
        int index$iv = r6;
        r6 = r6 - 1;
        Object item$iv = r23.get(index$iv);
        LazyGridMeasuredItem it = (LazyGridMeasuredItem) item$iv;
        currentMainAxis = currentMainAxis - it.getMainAxisSizeWithSpacings();
        it.position(currentMainAxis, 0, layoutWidth, layoutHeight);
        positionedItems.add(it);
        if (r6 >= 0) goto L66;
    L69:
        int currentMainAxis2 = firstLineScrollOffset;
        int index$iv2 = 0;
        int r7 = r22.size();
    L70:
        if (index$iv2 >= r7) goto L72;
        Object item$iv2 = r22.get(index$iv2);
        LazyGridMeasuredLine it2 = (LazyGridMeasuredLine) item$iv2;
        addAllFromArray(positionedItems, it2.position(currentMainAxis2, layoutWidth, layoutHeight));
        currentMainAxis2 = currentMainAxis2 + it2.getMainAxisSizeWithSpacings();
        index$iv2 = index$iv2 + 1;
        goto L70
    L72:
        int index$iv3 = 0;
        int r9 = r24.size();
    L73:
        if (index$iv3 >= r9) goto L77;
        Object item$iv3 = r24.get(index$iv3);
        LazyGridMeasuredItem it3 = (LazyGridMeasuredItem) item$iv3;
        it3.position(currentMainAxis2, 0, layoutWidth, layoutHeight);
        positionedItems.add(it3);
        currentMainAxis2 = currentMainAxis2 + it3.getMainAxisSizeWithSpacings();
        index$iv3 = index$iv3 + 1;
    L77:
        return positionedItems;
    L25:
        if (r23.isEmpty() == true) goto L27;
    L29:
        boolean value$iv2 = false;
    L31:
        if (value$iv2 == true) goto L33;
        InlineClassHelperKt.throwIllegalArgumentException("no items");
    L33:
        int linesCount = r0.size();
        int[] sizes = new int[linesCount];
        int r10 = 0;
    L34:
        if (r10 >= linesCount) goto L36;
        sizes[r10] = r0.get(calculateItemsOffsets$reverseAware(r10, r3, linesCount)).getMainAxisSize();
        r10 = r10 + 1;
        goto L34
    L36:
        int[] offsets = new int[linesCount];
        if (isVertical == false) goto L44;
        if (verticalArrangement == null) goto L41;
        verticalArrangement.arrange(density, mainAxisLayoutSize, sizes, offsets);
    L46:
        IntRange reverseAwareOffsetIndices = ArraysKt.getIndices(offsets);
        if (r3 == false) goto L49;
        reverseAwareOffsetIndices = RangesKt.reversed(reverseAwareOffsetIndices);
    L49:
        int index = reverseAwareOffsetIndices.getFirst();
        int r11 = reverseAwareOffsetIndices.getLast();
        int r15 = reverseAwareOffsetIndices.getStep();
        if (r15 <= 0) goto L52;
        if (index > r11) goto L52;
    L54:
        int absoluteOffset = offsets[index];
        LazyGridMeasuredLine line = r0.get(calculateItemsOffsets$reverseAware(index, r3, linesCount));
        if (r3 == false) goto L57;
        int r17 = (mainAxisLayoutSize - absoluteOffset) - line.getMainAxisSize();
    L58:
        int relativeOffset = r17;
        IntProgression reverseAwareOffsetIndices2 = reverseAwareOffsetIndices;
        addAllFromArray(positionedItems, line.position(relativeOffset, layoutWidth, layoutHeight));
        if (index == r11) goto L77;
        index = index + r15;
        r0 = r22;
        r3 = reverseLayout;
        reverseAwareOffsetIndices = reverseAwareOffsetIndices2;
        goto L54
    L57:
        r17 = absoluteOffset;
    L52:
        if (r15 >= 0) goto L77;
        if (r11 > index) goto L77;
    L41:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement");
        throw new KotlinNothingValueException();
    L44:
        if (horizontalArrangement == null) goto L62;
        horizontalArrangement.arrange(density, mainAxisLayoutSize, sizes, LayoutDirection.Ltr, offsets);
        goto L46
    L62:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement");
        throw new KotlinNothingValueException();
    L27:
        if (r24.isEmpty() == false) goto L29;
        value$iv2 = true;
        goto L31
    L9:
        r5 = false;
        goto L10
    L5:
        r4 = layoutWidth;
        goto L6
    }

    private static final int calculateItemsOffsets$reverseAware(int $this$calculateItemsOffsets_u24reverseAware, boolean $reverseLayout, int linesCount) {
        if ($reverseLayout == true) goto L5;
        return $this$calculateItemsOffsets_u24reverseAware;
    L5:
        return (linesCount - $this$calculateItemsOffsets_u24reverseAware) - 1;
    }

    private static final <T> void addAllFromArray(List<T> r3, T[] r4) {
        int r0 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r3.add(r4[r1]);
        r1 = r1 + 1;
        goto L3
    }
}
