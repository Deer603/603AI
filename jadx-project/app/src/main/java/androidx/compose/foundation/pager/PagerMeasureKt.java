package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: PagerMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001aH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a@\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a\u0017\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a\u008c\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002\u001aj\u0010\u0014\u001a\u00020\u0004*\u00020\u001f2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010(\u001a\u00020)2\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\u0006\u0010*\u001a\u00020+2\u0006\u0010/\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001añ\u0001\u0010?\u001a\u00020@*\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00103\u001a\u0002042\u0006\u0010A\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u0002022\u0006\u0010(\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010:2\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010*\u001a\u00020+2\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2/\u0010I\u001a+\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00190\u0015¢\u0006\u0002\bL\u0012\u0004\u0012\u00020M0JH\u0000ø\u0001\u0000¢\u0006\u0004\bN\u0010O\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"MaxPageOffset", "", "MinPageOffset", "calculateNewCurrentPage", "Landroidx/compose/foundation/pager/MeasuredPage;", "viewportSize", "", "visiblePagesInfo", "", "beforeContentPadding", "afterContentPadding", "itemSize", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageCount", "createPagesAfterList", "currentLastPage", "pagesCount", "beyondViewportPageCount", "pinnedPages", "getAndMeasure", "Lkotlin/Function1;", "createPagesBeforeList", "currentFirstPage", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "calculatePagesOffsets", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseLayout", "", "density", "Landroidx/compose/ui/unit/Density;", "spaceBetweenPages", "pageAvailableSize", "index", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "pagerItemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "visualPageOffset", "Landroidx/compose/ui/unit/IntOffset;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "measurePager", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "mainAxisAvailableSize", "currentPage", "currentPageOffset", "constraints", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePager-bmk8ZPk", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    /* JADX INFO: renamed from: access$getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final /* synthetic */ MeasuredPage m974access$getAndMeasureSGf7dI0(LazyLayoutMeasureScope $receiver, int index, long childConstraints, PagerLazyLayoutItemProvider pagerItemProvider, long visualPageOffset, Orientation orientation, Alignment.Horizontal horizontalAlignment, Alignment.Vertical verticalAlignment, LayoutDirection layoutDirection, boolean reverseLayout, int pageAvailableSize) {
        return m975getAndMeasureSGf7dI0($receiver, index, childConstraints, pagerItemProvider, visualPageOffset, orientation, horizontalAlignment, verticalAlignment, layoutDirection, reverseLayout, pageAvailableSize);
    }

    /* JADX INFO: renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m976measurePagerbmk8ZPk(final LazyLayoutMeasureScope $this$measurePager_u2dbmk8ZPk, int pageCount, final PagerLazyLayoutItemProvider pagerItemProvider, int mainAxisAvailableSize, int beforeContentPadding, int afterContentPadding, int spaceBetweenPages, int currentPage, int currentPageOffset, long constraints, final Orientation orientation, final Alignment.Vertical verticalAlignment, final Alignment.Horizontal horizontalAlignment, final boolean reverseLayout, final long visualPageOffset, final int pageAvailableSize, int beyondViewportPageCount, List<Integer> r68, SnapPosition snapPosition, final MutableState<Unit> r70, CoroutineScope coroutineScope, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> r72) {
        boolean r23 = true;
        if (beforeContentPadding < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
    L10:
        if (afterContentPadding < 0) goto L12;
        boolean value$iv2 = true;
    L14:
        if (value$iv2 == true) goto L16;
        InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
    L16:
        int pageSizeWithSpacing = RangesKt.coerceAtLeast(pageAvailableSize + spaceBetweenPages, 0);
        if (pageCount <= 0) goto L19;
        Orientation r14 = orientation;
        if (r14 != Orientation.Vertical) goto L23;
        int r16 = Constraints.m6926getMaxWidthimpl(constraints);
    L25:
        if (r14 == Orientation.Vertical) goto L27;
        int r18 = Constraints.m6925getMaxHeightimpl(constraints);
    L28:
        final long childConstraints = ConstraintsKt.Constraints$default(0, r16, 0, r18, 5, null);
        int firstVisiblePage = currentPage;
        int firstVisiblePageOffset = currentPageOffset;
    L29:
        if (firstVisiblePage <= 0) goto L32;
        if (firstVisiblePageOffset <= 0) goto L32;
        firstVisiblePage = firstVisiblePage - 1;
        firstVisiblePageOffset = firstVisiblePageOffset - pageSizeWithSpacing;
    L32:
        int firstVisiblePageScrollOffset = firstVisiblePageOffset * (-1);
        int currentFirstPage = firstVisiblePage;
        int currentFirstPageScrollOffset = firstVisiblePageScrollOffset;
        if (currentFirstPage < pageCount) goto L35;
        currentFirstPage = pageCount - 1;
        currentFirstPageScrollOffset = 0;
    L35:
        ArrayDeque visiblePages = new ArrayDeque();
        int r15 = -beforeContentPadding;
        if (spaceBetweenPages >= 0) goto L38;
        int r17 = spaceBetweenPages;
    L39:
        int minOffset = r15 + r17;
        int previous = currentFirstPageScrollOffset + minOffset;
        int maxCrossAxis = 0;
        int currentFirstPage2 = currentFirstPage;
    L40:
        if (previous >= 0) goto L43;
        if (currentFirstPage2 <= 0) goto L43;
        int currentFirstPageScrollOffset2 = previous;
        int currentFirstPageScrollOffset3 = currentFirstPage2 - 1;
        ArrayDeque visiblePages2 = visiblePages;
        int maxCrossAxis2 = maxCrossAxis;
        MeasuredPage measuredPage = m975getAndMeasureSGf7dI0($this$measurePager_u2dbmk8ZPk, currentFirstPageScrollOffset3, childConstraints, pagerItemProvider, visualPageOffset, r14, horizontalAlignment, verticalAlignment, $this$measurePager_u2dbmk8ZPk.getLayoutDirection(), reverseLayout, pageAvailableSize);
        visiblePages2.add(0, measuredPage);
        maxCrossAxis = Math.max(maxCrossAxis2, measuredPage.getCrossAxisSize());
        currentFirstPage2 = currentFirstPageScrollOffset3;
        r14 = orientation;
        previous = currentFirstPageScrollOffset2 + pageSizeWithSpacing;
        minOffset = minOffset;
        visiblePages = visiblePages2;
    L43:
        ArrayDeque visiblePages3 = visiblePages;
        int maxCrossAxis3 = maxCrossAxis;
        int currentFirstPageScrollOffset4 = previous;
        int minOffset2 = minOffset;
        if (currentFirstPageScrollOffset4 >= minOffset2) goto L46;
        int currentFirstPageScrollOffset5 = minOffset2;
    L47:
        int currentFirstPageScrollOffset6 = currentFirstPageScrollOffset5 - minOffset2;
        int index = currentFirstPage2;
        int maxMainAxis = RangesKt.coerceAtLeast(mainAxisAvailableSize + afterContentPadding, 0);
        int currentMainAxisOffset = -currentFirstPageScrollOffset6;
        boolean remeasureNeeded = false;
        int pageSizeWithSpacing2 = 0;
    L48:
        minOffset2 = minOffset2;
        if (pageSizeWithSpacing2 >= visiblePages3.size()) goto L53;
        if (currentMainAxisOffset >= maxMainAxis) goto L51;
        index = index + 1;
        currentMainAxisOffset = currentMainAxisOffset + pageSizeWithSpacing;
        pageSizeWithSpacing2 = pageSizeWithSpacing2 + 1;
        goto L48
    L51:
        visiblePages3.remove(pageSizeWithSpacing2);
        remeasureNeeded = true;
        goto L48
    L53:
        int currentFirstPage3 = currentFirstPage2;
        int indexInVisibleItems = pageSizeWithSpacing;
        int currentFirstPageScrollOffset7 = currentFirstPageScrollOffset6;
        int currentFirstPageScrollOffset8 = index;
        boolean remeasureNeeded2 = remeasureNeeded;
        int maxCrossAxis4 = maxCrossAxis3;
    L54:
        if (currentFirstPageScrollOffset8 >= pageCount) goto L73;
        if (currentMainAxisOffset < maxMainAxis) goto L61;
        if (currentMainAxisOffset <= 0) goto L61;
        if (visiblePages3.isEmpty() == false) goto L73;
    L61:
        int pageSizeWithSpacing3 = indexInVisibleItems;
        int maxMainAxis2 = maxMainAxis;
        int maxCrossAxis5 = maxCrossAxis4;
        int minOffset3 = minOffset2;
        MeasuredPage measuredPage2 = m975getAndMeasureSGf7dI0($this$measurePager_u2dbmk8ZPk, currentFirstPageScrollOffset8, childConstraints, pagerItemProvider, visualPageOffset, orientation, horizontalAlignment, verticalAlignment, $this$measurePager_u2dbmk8ZPk.getLayoutDirection(), reverseLayout, pageAvailableSize);
        int index2 = currentFirstPageScrollOffset8;
        if (index2 != (pageCount - 1)) goto L64;
        int r13 = pageAvailableSize;
    L65:
        currentMainAxisOffset = currentMainAxisOffset + r13;
        if (currentMainAxisOffset <= minOffset3) goto L68;
    L70:
        maxCrossAxis5 = Math.max(maxCrossAxis5, measuredPage2.getCrossAxisSize());
        visiblePages3.add(measuredPage2);
    L71:
        maxCrossAxis4 = maxCrossAxis5;
        currentFirstPageScrollOffset8 = index2 + 1;
        minOffset2 = minOffset3;
        maxMainAxis = maxMainAxis2;
        indexInVisibleItems = pageSizeWithSpacing3;
        goto L54
    L68:
        if (index2 == (pageCount - 1)) goto L70;
        currentFirstPageScrollOffset7 = currentFirstPageScrollOffset7 - pageSizeWithSpacing3;
        currentFirstPage3 = index2 + 1;
        remeasureNeeded2 = true;
        goto L71
    L64:
        r13 = pageSizeWithSpacing3;
    L73:
        int previousIndex = mainAxisAvailableSize;
        if (currentMainAxisOffset >= previousIndex) goto L83;
        int toScrollBack = previousIndex - currentMainAxisOffset;
        currentMainAxisOffset = currentMainAxisOffset + toScrollBack;
        int currentFirstPageScrollOffset9 = currentFirstPageScrollOffset7 - toScrollBack;
    L76:
        if (currentFirstPageScrollOffset9 >= beforeContentPadding) goto L79;
        if (currentFirstPage3 <= 0) goto L79;
        int maxOffset = previousIndex;
        int maxOffset2 = currentFirstPage3 - 1;
        MeasuredPage measuredPage3 = m975getAndMeasureSGf7dI0($this$measurePager_u2dbmk8ZPk, maxOffset2, childConstraints, pagerItemProvider, visualPageOffset, orientation, horizontalAlignment, verticalAlignment, $this$measurePager_u2dbmk8ZPk.getLayoutDirection(), reverseLayout, pageAvailableSize);
        visiblePages3.add(0, measuredPage3);
        maxCrossAxis4 = Math.max(maxCrossAxis4, measuredPage3.getCrossAxisSize());
        currentFirstPage3 = maxOffset2;
        currentFirstPageScrollOffset8 = currentFirstPageScrollOffset8;
        currentFirstPageScrollOffset9 = currentFirstPageScrollOffset9 + indexInVisibleItems;
        previousIndex = maxOffset;
        minOffset2 = minOffset2;
    L79:
        int minOffset4 = currentFirstPageScrollOffset8;
        int maxOffset3 = previousIndex;
        int currentFirstPageScrollOffset10 = currentFirstPageScrollOffset9;
        boolean r19 = false;
        if (currentFirstPageScrollOffset10 >= 0) goto L82;
        currentMainAxisOffset = currentMainAxisOffset + currentFirstPageScrollOffset10;
        int currentFirstPageScrollOffset11 = 0;
    L84:
        if (currentFirstPageScrollOffset11 < 0) goto L86;
        boolean value$iv3 = true;
    L88:
        if (value$iv3 == true) goto L90;
        InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
    L90:
        int visiblePagesScrollOffset = -currentFirstPageScrollOffset11;
        MeasuredPage firstPage = (MeasuredPage) visiblePages3.first();
        if (beforeContentPadding > 0) goto L95;
        if (spaceBetweenPages < 0) goto L95;
        int currentFirstPageScrollOffset12 = currentFirstPageScrollOffset11;
        MeasuredPage firstPage2 = firstPage;
    L108:
        List<MeasuredPage> r9 = createPagesBeforeList(currentFirstPage3, beyondViewportPageCount, r68, new PagerMeasureKt$measurePager$extraPagesBefore$1($this$measurePager_u2dbmk8ZPk, childConstraints, pagerItemProvider, visualPageOffset, orientation, horizontalAlignment, verticalAlignment, reverseLayout, pageAvailableSize));
        int index$iv = 0;
        int r110 = r9.size();
    L109:
        if (index$iv >= r110) goto L111;
        Object item$iv = r9.get(index$iv);
        maxCrossAxis4 = Math.max(maxCrossAxis4, ((MeasuredPage) item$iv).getCrossAxisSize());
        index$iv = index$iv + 1;
        visiblePages3 = visiblePages3;
        goto L109
    L111:
        ArrayDeque visiblePages4 = visiblePages3;
        List<MeasuredPage> r12 = createPagesAfterList(((MeasuredPage) visiblePages4.last()).getIndex(), pageCount, beyondViewportPageCount, r68, new PagerMeasureKt$measurePager$extraPagesAfter$1($this$measurePager_u2dbmk8ZPk, childConstraints, pagerItemProvider, visualPageOffset, orientation, horizontalAlignment, verticalAlignment, reverseLayout, pageAvailableSize));
        int index$iv2 = 0;
        int r11 = r12.size();
    L112:
        if (index$iv2 >= r11) goto L115;
        Object item$iv2 = r12.get(index$iv2);
        maxCrossAxis4 = Math.max(maxCrossAxis4, ((MeasuredPage) item$iv2).getCrossAxisSize());
        index$iv2 = index$iv2 + 1;
        goto L112
    L115:
        if (Intrinsics.areEqual(firstPage2, visiblePages4.first()) == true) goto L117;
    L121:
        boolean r111 = false;
    L122:
        boolean noExtraPages = r111;
        if (orientation != Orientation.Vertical) goto L125;
        int r0 = maxCrossAxis4;
    L126:
        int layoutWidth = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, r0);
        if (orientation != Orientation.Vertical) goto L129;
        int r1 = currentMainAxisOffset;
    L130:
        int layoutHeight = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, r1);
        int currentMainAxisOffset2 = currentMainAxisOffset;
        int maxOffset4 = maxOffset3;
        final List<MeasuredPage> r2 = calculatePagesOffsets($this$measurePager_u2dbmk8ZPk, visiblePages4, r9, r12, layoutWidth, layoutHeight, currentMainAxisOffset2, maxOffset4, visiblePagesScrollOffset, orientation, reverseLayout, $this$measurePager_u2dbmk8ZPk, spaceBetweenPages, pageAvailableSize);
        if (noExtraPages == false) goto L133;
        List<MeasuredPage> r3 = r2;
    L147:
        if (r9.isEmpty() == false) goto L149;
        ArrayList r4 = CollectionsKt.emptyList();
        List<MeasuredPage> r44 = r3;
    L160:
        List positionedPagesBefore = r4;
        if (r12.isEmpty() == false) goto L163;
        ArrayList r5 = CollectionsKt.emptyList();
    L174:
        List positionedPagesAfter = r5;
        int layoutSize = (mainAxisAvailableSize + beforeContentPadding) + afterContentPadding;
        MeasuredPage firstPage3 = firstPage2;
        int maxCrossAxis6 = indexInVisibleItems;
        List<MeasuredPage> r6 = r44;
        MeasuredPage newCurrentPage = calculateNewCurrentPage(layoutSize, r6, beforeContentPadding, afterContentPadding, maxCrossAxis6, snapPosition, pageCount);
        if (newCurrentPage == null) goto L177;
        int r7 = newCurrentPage.getIndex();
    L178:
        int snapOffset = snapPosition.position(layoutSize, pageAvailableSize, beforeContentPadding, afterContentPadding, r7, pageCount);
        if (newCurrentPage == null) goto L181;
        int currentPagePositionOffset = newCurrentPage.getOffset();
    L182:
        if (maxCrossAxis6 != 0) goto L184;
        float currentPageOffsetFraction = 0.0f;
    L185:
        MeasureResult r8 = r72.invoke(Integer.valueOf(layoutWidth), Integer.valueOf(layoutHeight), new PagerMeasureKt$measurePager$14(r70, r2));
        int pageSizeWithSpacing4 = -beforeContentPadding;
        int currentFirstPageScrollOffset13 = maxOffset4 + afterContentPadding;
        if (minOffset4 < pageCount) goto L191;
        if (currentMainAxisOffset2 > maxOffset4) goto L191;
        r23 = false;
    L191:
        return new PagerMeasureResult(r6, pageAvailableSize, spaceBetweenPages, afterContentPadding, orientation, pageSizeWithSpacing4, currentFirstPageScrollOffset13, reverseLayout, beyondViewportPageCount, firstPage3, newCurrentPage, currentPageOffsetFraction, currentFirstPageScrollOffset12, r23, snapPosition, r8, remeasureNeeded2, positionedPagesBefore, positionedPagesAfter, coroutineScope);
    L184:
        currentPageOffsetFraction = RangesKt.coerceIn((snapOffset - currentPagePositionOffset) / maxCrossAxis6, -0.5f, 0.5f);
        goto L185
    L181:
        currentPagePositionOffset = 0;
        goto L182
    L177:
        r7 = 0;
        goto L178
    L163:
        int $i$f$fastFilter = 0;
        ArrayList target$iv = new ArrayList(r2.size());
        int index$iv$iv = 0;
        int r10 = r2.size();
    L164:
        if (index$iv$iv >= r10) goto L173;
        MeasuredPage it = r2.get(index$iv$iv);
        int r22 = r10;
        int r20 = it.getIndex();
        int $i$f$fastFilter2 = $i$f$fastFilter;
        int $i$f$fastFilter3 = ((MeasuredPage) visiblePages4.last()).getIndex();
        if (r20 <= $i$f$fastFilter3) goto L168;
        boolean r21 = true;
    L169:
        if (r21 == false) goto L172;
        target$iv.add(it);
    L172:
        index$iv$iv = index$iv$iv + 1;
        r10 = r22;
        $i$f$fastFilter = $i$f$fastFilter2;
        goto L164
    L168:
        r21 = false;
        goto L169
    L173:
        r5 = target$iv;
        goto L174
    L149:
        ArrayList target$iv2 = new ArrayList(r2.size());
        int index$iv$iv2 = 0;
        int r24 = r2.size();
    L150:
        if (index$iv$iv2 >= r24) goto L159;
        MeasuredPage it2 = r2.get(index$iv$iv2);
        int r25 = r24;
        List<MeasuredPage> r45 = r3;
        if (it2.getIndex() >= ((MeasuredPage) visiblePages4.first()).getIndex()) goto L154;
        boolean r26 = true;
    L155:
        if (r26 == false) goto L158;
        target$iv2.add(it2);
    L158:
        index$iv$iv2 = index$iv$iv2 + 1;
        r24 = r25;
        r3 = r45;
        goto L150
    L154:
        r26 = false;
        goto L155
    L159:
        r44 = r3;
        r4 = target$iv2;
        goto L160
    L133:
        List<MeasuredPage> r27 = r2;
        int $i$f$fastFilter4 = 0;
        ArrayList target$iv3 = new ArrayList(r27.size());
        int index$iv$iv3 = 0;
        int r112 = r27.size();
    L134:
        if (index$iv$iv3 >= r112) goto L145;
        MeasuredPage r113 = r27.get(index$iv$iv3);
        MeasuredPage it3 = r113;
        List<MeasuredPage> r28 = r27;
        int r29 = it3.getIndex();
        int $i$f$fastFilter5 = $i$f$fastFilter4;
        int $i$f$fastFilter6 = ((MeasuredPage) visiblePages4.first()).getIndex();
        if (r29 >= $i$f$fastFilter6) goto L138;
    L140:
        boolean r30 = false;
    L141:
        if (r30 == false) goto L144;
        target$iv3.add(r113);
    L144:
        index$iv$iv3 = index$iv$iv3 + 1;
        r27 = r28;
        $i$f$fastFilter4 = $i$f$fastFilter5;
        goto L134
    L138:
        if (it3.getIndex() > ((MeasuredPage) visiblePages4.last()).getIndex()) goto L140;
        r30 = true;
        goto L141
    L145:
        r3 = target$iv3;
        goto L147
    L129:
        r1 = maxCrossAxis4;
        goto L130
    L125:
        r0 = currentMainAxisOffset;
        goto L126
    L117:
        if (r9.isEmpty() == false) goto L121;
        if (r12.isEmpty() == false) goto L121;
        r111 = true;
    L95:
        int i = 0;
        int r114 = visiblePages3.size();
    L96:
        if (i >= r114) goto L107;
        int size = indexInVisibleItems;
        if (currentFirstPageScrollOffset11 == 0) goto L107;
        if (size > currentFirstPageScrollOffset11) goto L107;
        if (i == CollectionsKt.getLastIndex(visiblePages3)) goto L107;
        currentFirstPageScrollOffset11 = currentFirstPageScrollOffset11 - size;
        firstPage = (MeasuredPage) visiblePages3.get(i + 1);
        i = i + 1;
    L107:
        currentFirstPageScrollOffset12 = currentFirstPageScrollOffset11;
        firstPage2 = firstPage;
        goto L108
    L86:
        value$iv3 = r19;
        goto L88
    L82:
        currentFirstPageScrollOffset11 = currentFirstPageScrollOffset10;
        goto L84
    L83:
        minOffset4 = currentFirstPageScrollOffset8;
        maxOffset3 = previousIndex;
        r19 = false;
        currentFirstPageScrollOffset11 = currentFirstPageScrollOffset7;
        goto L84
    L46:
        currentFirstPageScrollOffset5 = currentFirstPageScrollOffset4;
        goto L47
    L38:
        r17 = 0;
        goto L39
    L27:
        r18 = pageAvailableSize;
        goto L28
    L23:
        r16 = pageAvailableSize;
        goto L25
    L19:
        return new PagerMeasureResult(CollectionsKt.emptyList(), pageAvailableSize, spaceBetweenPages, afterContentPadding, orientation, -beforeContentPadding, mainAxisAvailableSize + afterContentPadding, false, beyondViewportPageCount, null, null, 0.0f, 0, false, snapPosition, r72.invoke(Integer.valueOf(Constraints.m6928getMinWidthimpl(constraints)), Integer.valueOf(Constraints.m6927getMinHeightimpl(constraints)), PagerMeasureKt$measurePager$4.INSTANCE), false, null, null, coroutineScope, 393216, null);
    L12:
        value$iv2 = false;
        goto L14
    L5:
        value$iv = false;
        goto L7
    }

    private static final List<MeasuredPage> createPagesAfterList(int currentLastPage, int pagesCount, int beyondViewportPageCount, List<Integer> r14, Function1<? super Integer, MeasuredPage> r15) {
        ArrayList r0 = null;
        int end = Math.min(currentLastPage + beyondViewportPageCount, pagesCount - 1);
        int i = currentLastPage + 1;
        if (i > end) goto L9;
    L4:
        if (r0 != null) goto L6;
        Object list = new ArrayList();
        r0 = (List) list;
    L6:
        r0.add(r15.invoke(Integer.valueOf(i)));
        if (i == end) goto L9;
        i = i + 1;
    L9:
        int index$iv = 0;
        int r5 = r14.size();
    L10:
        if (index$iv >= r5) goto L21;
        Object item$iv = r14.get(index$iv);
        int pageIndex = ((Number) item$iv).intValue();
        boolean r10 = false;
        if ((end + 1) > pageIndex) goto L15;
        if (pageIndex >= pagesCount) goto L15;
        r10 = true;
    L15:
        if (r10 == false) goto L19;
        if (r0 != null) goto L18;
        Object list2 = new ArrayList();
        r0 = (List) list2;
    L18:
        r0.add(r15.invoke(Integer.valueOf(pageIndex)));
    L19:
        index$iv = index$iv + 1;
        goto L10
    L21:
        if (r0 != null) goto L24;
        return CollectionsKt.emptyList();
    L24:
        return r0;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int currentFirstPage, int beyondViewportPageCount, List<Integer> r12, Function1<? super Integer, MeasuredPage> r13) {
        ArrayList r0 = null;
        int start = Math.max(0, currentFirstPage - beyondViewportPageCount);
        int i = currentFirstPage - 1;
        if (start > i) goto L9;
    L4:
        if (r0 != null) goto L6;
        Object list = new ArrayList();
        r0 = (List) list;
    L6:
        r0.add(r13.invoke(Integer.valueOf(i)));
        if (i == start) goto L9;
        i = i - 1;
    L9:
        int index$iv = 0;
        int r5 = r12.size();
    L10:
        if (index$iv >= r5) goto L18;
        Object item$iv = r12.get(index$iv);
        int pageIndex = ((Number) item$iv).intValue();
        if (pageIndex >= start) goto L16;
        if (r0 != null) goto L15;
        Object list2 = new ArrayList();
        r0 = (List) list2;
    L15:
        r0.add(r13.invoke(Integer.valueOf(pageIndex)));
    L16:
        index$iv = index$iv + 1;
        goto L10
    L18:
        if (r0 != null) goto L21;
        return CollectionsKt.emptyList();
    L21:
        return r0;
    }

    private static final MeasuredPage calculateNewCurrentPage(int viewportSize, List<MeasuredPage> r19, int beforeContentPadding, int afterContentPadding, int itemSize, SnapPosition snapPosition, int pageCount) {
        if (r19.isEmpty() == false) goto L5;
        Object maxElem$iv = null;
    L14:
        return (MeasuredPage) maxElem$iv;
    L5:
        maxElem$iv = r19.get(0);
        MeasuredPage it = (MeasuredPage) maxElem$iv;
        float maxValue$iv = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(viewportSize, beforeContentPadding, afterContentPadding, itemSize, it.getOffset(), it.getIndex(), snapPosition, pageCount));
        int i$iv = 1;
        int r4 = CollectionsKt.getLastIndex(r19);
        if (1 > r4) goto L14;
    L7:
        Object e$iv = r19.get(i$iv);
        MeasuredPage it2 = (MeasuredPage) e$iv;
        float v$iv = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(viewportSize, beforeContentPadding, afterContentPadding, itemSize, it2.getOffset(), it2.getIndex(), snapPosition, pageCount));
        if (Float.compare(maxValue$iv, v$iv) >= 0) goto L10;
        maxElem$iv = e$iv;
        maxValue$iv = v$iv;
    L10:
        if (i$iv == r4) goto L14;
        i$iv = i$iv + 1;
        goto L7
    }

    /* JADX INFO: renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    private static final MeasuredPage m975getAndMeasureSGf7dI0(LazyLayoutMeasureScope $this$getAndMeasure_u2dSGf7dI0, int index, long childConstraints, PagerLazyLayoutItemProvider pagerItemProvider, long visualPageOffset, Orientation orientation, Alignment.Horizontal horizontalAlignment, Alignment.Vertical verticalAlignment, LayoutDirection layoutDirection, boolean reverseLayout, int pageAvailableSize) {
        Object key = pagerItemProvider.getKey(index);
        return new MeasuredPage(index, pageAvailableSize, $this$getAndMeasure_u2dSGf7dI0.mo899measure0kLqBqw(index, childConstraints), visualPageOffset, key, orientation, horizontalAlignment, verticalAlignment, layoutDirection, reverseLayout, null);
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope $this$calculatePagesOffsets, List<MeasuredPage> r23, List<MeasuredPage> r24, List<MeasuredPage> r25, int layoutWidth, int layoutHeight, int finalMainAxisOffset, int maxOffset, int pagesScrollOffset, Orientation orientation, boolean reverseLayout, Density density, int spaceBetweenPages, int pageAvailableSize) {
        int pageSizeWithSpacing = pageAvailableSize + spaceBetweenPages;
        if (orientation != Orientation.Vertical) goto L5;
        int r7 = layoutHeight;
    L6:
        int mainAxisLayoutSize = r7;
        if (finalMainAxisOffset >= Math.min(mainAxisLayoutSize, maxOffset)) goto L9;
        boolean r8 = true;
    L10:
        boolean hasSpareSpace = r8;
        if (hasSpareSpace == false) goto L19;
        if (pagesScrollOffset != 0) goto L14;
        boolean value$iv = true;
    L16:
        if (value$iv == true) goto L19;
        InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + pagesScrollOffset);
        goto L19
    L14:
        value$iv = false;
    L19:
        ArrayList positionedPages = new ArrayList((r23.size() + r24.size()) + r25.size());
        if (hasSpareSpace == true) goto L22;
        ArrayList positionedPages2 = positionedPages;
        int currentMainAxis = pagesScrollOffset;
        int index$iv = 0;
        int r9 = r24.size();
    L55:
        if (index$iv >= r9) goto L57;
        Object item$iv = r24.get(index$iv);
        MeasuredPage it = (MeasuredPage) item$iv;
        currentMainAxis = currentMainAxis - pageSizeWithSpacing;
        it.position(currentMainAxis, layoutWidth, layoutHeight);
        positionedPages2.add(it);
        index$iv = index$iv + 1;
        goto L55
    L57:
        int currentMainAxis2 = pagesScrollOffset;
        int index$iv2 = 0;
        int r10 = r23.size();
    L58:
        if (index$iv2 >= r10) goto L60;
        Object item$iv2 = r23.get(index$iv2);
        MeasuredPage it2 = (MeasuredPage) item$iv2;
        it2.position(currentMainAxis2, layoutWidth, layoutHeight);
        positionedPages2.add(it2);
        currentMainAxis2 = currentMainAxis2 + pageSizeWithSpacing;
        index$iv2 = index$iv2 + 1;
        goto L58
    L60:
        int index$iv3 = 0;
        int r11 = r25.size();
    L61:
        if (index$iv3 >= r11) goto L65;
        Object item$iv3 = r25.get(index$iv3);
        MeasuredPage it3 = (MeasuredPage) item$iv3;
        it3.position(currentMainAxis2, layoutWidth, layoutHeight);
        positionedPages2.add(it3);
        currentMainAxis2 = currentMainAxis2 + pageSizeWithSpacing;
        index$iv3 = index$iv3 + 1;
    L65:
        return positionedPages2;
    L22:
        if (r24.isEmpty() == true) goto L24;
    L26:
        boolean value$iv2 = false;
    L28:
        if (value$iv2 == true) goto L30;
        InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
    L30:
        int pagesCount = r23.size();
        int[] sizes = new int[pagesCount];
        int r12 = 0;
    L31:
        if (r12 >= pagesCount) goto L33;
        sizes[r12] = pageAvailableSize;
        r12 = r12 + 1;
        goto L31
    L33:
        int[] offsets = new int[pagesCount];
        Arrangement.HorizontalOrVertical arrangement = Arrangement.Absolute.INSTANCE.m609spacedBy0680j_4($this$calculatePagesOffsets.mo373toDpu2uoSUM(spaceBetweenPages));
        if (orientation != Orientation.Vertical) goto L36;
        arrangement.arrange(density, mainAxisLayoutSize, sizes, offsets);
        positionedPages2 = positionedPages;
    L37:
        IntRange reverseAwareOffsetIndices = ArraysKt.getIndices(offsets);
        if (reverseLayout == false) goto L41;
        reverseAwareOffsetIndices = RangesKt.reversed(reverseAwareOffsetIndices);
    L41:
        int index = reverseAwareOffsetIndices.getFirst();
        int r13 = reverseAwareOffsetIndices.getLast();
        int r17 = reverseAwareOffsetIndices.getStep();
        if (r17 <= 0) goto L44;
        if (index > r13) goto L44;
    L46:
        int absoluteOffset = offsets[index];
        int pagesCount2 = pagesCount;
        MeasuredPage page = r23.get(calculatePagesOffsets$reverseAware(index, reverseLayout, pagesCount));
        if (reverseLayout == false) goto L49;
        int r20 = (mainAxisLayoutSize - absoluteOffset) - page.getSize();
    L50:
        int relativeOffset = r20;
        page.position(relativeOffset, layoutWidth, layoutHeight);
        positionedPages2.add(page);
        if (index == r13) goto L65;
        index = index + r17;
        pagesCount = pagesCount2;
        goto L46
    L49:
        r20 = absoluteOffset;
    L44:
        if (r17 >= 0) goto L65;
        if (r13 > index) goto L65;
    L36:
        positionedPages2 = positionedPages;
        arrangement.arrange(density, mainAxisLayoutSize, sizes, LayoutDirection.Ltr, offsets);
        goto L37
    L24:
        if (r25.isEmpty() == false) goto L26;
        value$iv2 = true;
        goto L28
    L9:
        r8 = false;
        goto L10
    L5:
        r7 = layoutWidth;
        goto L6
    }

    private static final int calculatePagesOffsets$reverseAware(int $this$calculatePagesOffsets_u24reverseAware, boolean $reverseLayout, int pagesCount) {
        if ($reverseLayout == true) goto L5;
        return $this$calculatePagesOffsets_u24reverseAware;
    L5:
        return (pagesCount - $this$calculatePagesOffsets_u24reverseAware) - 1;
    }

    private static final void debugLog(Function0<String> r1) {
    }
}
