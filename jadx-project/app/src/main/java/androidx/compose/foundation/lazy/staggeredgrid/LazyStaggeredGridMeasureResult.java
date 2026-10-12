package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\u0018\u0010X\u001a\u0004\u0018\u00010\u00002\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u000bJ\t\u0010[\u001a\u00020EH\u0096\u0001R\u0014\u0010\u001e\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00150&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010\u001d\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0012\u00108\u001a\u00020\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010$R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010-R\u0014\u0010\u001f\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020>X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010-R'\u0010B\u001a\u0015\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E\u0018\u00010C¢\u0006\u0002\bF8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u00100R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010$R\u0014\u0010\u001c\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010$R\u001c\u0010\u0019\u001a\u00020\u001aX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010R\u001a\u0004\bP\u0010QR\u0014\u0010\u001b\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010$R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0012\u0010V\u001a\u00020\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "firstVisibleItemIndices", "", "firstVisibleItemScrollOffsets", "consumedScroll", "", "measureResult", "scrollBackAmount", "canScrollForward", "", "isVertical", "remeasureNeeded", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "spanProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "density", "Landroidx/compose/ui/unit/Density;", "totalItemsCount", "", "visibleItemsInfo", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "viewportSize", "Landroidx/compose/ui/unit/IntSize;", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "mainAxisItemSpacing", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "([I[IFLandroidx/compose/ui/layout/MeasureResult;FZZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;Landroidx/compose/ui/unit/Density;ILjava/util/List;JIIIIILkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAfterContentPadding", "()I", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "getBeforeContentPadding", "canScrollBackward", "getCanScrollBackward", "()Z", "getCanScrollForward", "getConsumedScroll", "()F", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getFirstVisibleItemIndices", "()[I", "getFirstVisibleItemScrollOffsets", "height", "getHeight", "getMainAxisItemSpacing", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getRemeasureNeeded", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "getScrollBackAmount", "getSlots", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getSpanProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getTotalItemsCount", "getViewportEndOffset", "getViewportSize-YbymL2g", "()J", "J", "getViewportStartOffset", "getVisibleItemsInfo", "()Ljava/util/List;", "width", "getWidth", "copyWithScrollDeltaWithoutRemeasure", "delta", "updateAnimations", "placeChildren", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {
    public static final int $stable = 0;
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;
    private final CoroutineScope coroutineScope;
    private final Density density;
    private final int[] firstVisibleItemIndices;
    private final int[] firstVisibleItemScrollOffsets;
    private final boolean isVertical;
    private final int mainAxisItemSpacing;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final float scrollBackAmount;
    private final LazyStaggeredGridSlots slots;
    private final LazyStaggeredGridSpanProvider spanProvider;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final long viewportSize;
    private final int viewportStartOffset;
    private final List<LazyStaggeredGridMeasuredItem> visibleItemsInfo;

    static {
        $stable = 8;
    }

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] r1, int[] r2, float r3, MeasureResult r4, float r5, boolean r6, boolean r7, boolean r8, LazyStaggeredGridSlots r9, LazyStaggeredGridSpanProvider r10, Density r11, int r12, List r13, long r14, int r16, int r17, int r18, int r19, int r20, CoroutineScope r21, DefaultConstructorMarker r22) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Function1<RulerScope, Unit> getRulers() {
        return this.measureResult.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    private LazyStaggeredGridMeasureResult(int[] firstVisibleItemIndices, int[] firstVisibleItemScrollOffsets, float consumedScroll, MeasureResult measureResult, float scrollBackAmount, boolean canScrollForward, boolean isVertical, boolean remeasureNeeded, LazyStaggeredGridSlots slots, LazyStaggeredGridSpanProvider spanProvider, Density density, int totalItemsCount, List<LazyStaggeredGridMeasuredItem> r29, long viewportSize, int viewportStartOffset, int viewportEndOffset, int beforeContentPadding, int afterContentPadding, int mainAxisItemSpacing, CoroutineScope coroutineScope) {
        this.firstVisibleItemIndices = firstVisibleItemIndices;
        this.firstVisibleItemScrollOffsets = firstVisibleItemScrollOffsets;
        this.consumedScroll = consumedScroll;
        this.measureResult = measureResult;
        this.scrollBackAmount = scrollBackAmount;
        this.canScrollForward = canScrollForward;
        this.isVertical = isVertical;
        this.remeasureNeeded = remeasureNeeded;
        this.slots = slots;
        this.spanProvider = spanProvider;
        this.density = density;
        this.totalItemsCount = totalItemsCount;
        this.visibleItemsInfo = r29;
        this.viewportSize = viewportSize;
        this.viewportStartOffset = viewportStartOffset;
        this.viewportEndOffset = viewportEndOffset;
        this.beforeContentPadding = beforeContentPadding;
        this.afterContentPadding = afterContentPadding;
        this.mainAxisItemSpacing = mainAxisItemSpacing;
        this.coroutineScope = coroutineScope;
        if (this.isVertical == false) goto L5;
        Orientation r1 = Orientation.Vertical;
    L6:
        this.orientation = r1;
        return;
    L5:
        r1 = Orientation.Horizontal;
        goto L6
    }

    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final MeasureResult getMeasureResult() {
        return this.measureResult;
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final LazyStaggeredGridSlots getSlots() {
        return this.slots;
    }

    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    public final Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public List<LazyStaggeredGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo934getViewportSizeYbymL2g() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final boolean getCanScrollBackward() {
        if (this.firstVisibleItemIndices[0] == 0) goto L5;
    L6:
        return true;
    L5:
        if (this.firstVisibleItemScrollOffsets[0] > 0) goto L6;
        return false;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure(int delta, boolean updateAnimations) {
        if (this.remeasureNeeded == true) goto L78;
        if (getVisibleItemsInfo().isEmpty() == true) goto L78;
        if (this.firstVisibleItemIndices.length != 0) goto L9;
        boolean r2 = true;
    L10:
        if (r2 == true) goto L78;
        if (this.firstVisibleItemScrollOffsets.length != 0) goto L14;
        boolean r3 = true;
    L15:
        if (r3 == true) goto L78;
        int mainAxisMax = getViewportEndOffset() - getAfterContentPadding();
        List<LazyStaggeredGridMeasuredItem> r6 = getVisibleItemsInfo();
        int index$iv = 0;
        int r9 = r6.size();
    L18:
        if (index$iv >= r9) goto L61;
        Object item$iv = r6.get(index$iv);
        LazyStaggeredGridMeasuredItem it = (LazyStaggeredGridMeasuredItem) item$iv;
        if (it.getNonScrollableItem() == true) goto L60;
        if (it.getMainAxisOffset() > 0) goto L24;
        boolean r13 = true;
    L26:
        if ((it.getMainAxisOffset() + delta) > 0) goto L28;
        boolean r14 = true;
    L29:
        if (r13 != r14) goto L60;
        if (it.getMainAxisOffset() > getViewportStartOffset()) goto L46;
        if (delta >= 0) goto L39;
        if (((it.getMainAxisOffset() + it.getMainAxisSizeWithSpacings()) - getViewportStartOffset()) <= (-delta)) goto L37;
        boolean canApply = true;
    L43:
        if (canApply == true) goto L46;
        return null;
    L37:
        canApply = false;
        goto L43
    L39:
        if ((getViewportStartOffset() - it.getMainAxisOffset()) <= delta) goto L41;
        canApply = true;
        goto L43
    L41:
        canApply = false;
    L46:
        if ((it.getMainAxisOffset() + it.getMainAxisSizeWithSpacings()) < mainAxisMax) goto L59;
        if (delta >= 0) goto L53;
        if (((it.getMainAxisOffset() + it.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) <= (-delta)) goto L51;
        boolean canApply2 = true;
    L57:
        if (canApply2 == true) goto L59;
        return null;
    L51:
        canApply2 = false;
        goto L57
    L53:
        if ((getViewportEndOffset() - it.getMainAxisOffset()) <= delta) goto L55;
        canApply2 = true;
        goto L57
    L55:
        canApply2 = false;
    L59:
        index$iv = index$iv + 1;
        goto L18
    L28:
        r14 = false;
        goto L29
    L24:
        r13 = false;
    L60:
        return null;
    L61:
        List<LazyStaggeredGridMeasuredItem> r4 = getVisibleItemsInfo();
        int index$iv2 = 0;
        int r8 = r4.size();
    L62:
        if (index$iv2 >= r8) goto L64;
        Object item$iv2 = r4.get(index$iv2);
        ((LazyStaggeredGridMeasuredItem) item$iv2).applyScrollDelta(delta, updateAnimations);
        index$iv2 = index$iv2 + 1;
        goto L62
    L64:
        int[] r15 = this.firstVisibleItemIndices;
        int r5 = this.firstVisibleItemScrollOffsets.length;
        int[] r16 = new int[r5];
        int r7 = 0;
    L65:
        if (r7 >= r5) goto L67;
        r16[r7] = this.firstVisibleItemScrollOffsets[r7] - delta;
        r7 = r7 + 1;
        goto L65
    L67:
        float r10 = delta;
        float r11 = this.scrollBackAmount;
        MeasureResult r12 = this.measureResult;
        if (this.canScrollForward == true) goto L72;
        if (delta > 0) goto L72;
        boolean r19 = false;
    L74:
        return new LazyStaggeredGridMeasureResult(r15, r16, r10, r12, r11, r19, this.isVertical, this.remeasureNeeded, this.slots, this.spanProvider, this.density, getTotalItemsCount(), getVisibleItemsInfo(), mo934getViewportSizeYbymL2g(), getViewportStartOffset(), getViewportEndOffset(), getBeforeContentPadding(), getAfterContentPadding(), getMainAxisItemSpacing(), this.coroutineScope, null);
    L72:
        r19 = true;
        goto L74
    L14:
        r3 = false;
        goto L15
    L9:
        r2 = false;
    L78:
        return null;
    }
}
