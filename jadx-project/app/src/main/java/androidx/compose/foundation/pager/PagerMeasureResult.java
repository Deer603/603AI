package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: PagerMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B¿\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\u0010\u0010S\u001a\u0004\u0018\u00010\u00002\u0006\u0010T\u001a\u00020\u0007J\t\u0010U\u001a\u00020DH\u0096\u0001R\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00070#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0014\u0010\u0010\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010*\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0012\u00109\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010!R\u000e\u0010\u0019\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010!R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010!R\u0011\u0010\u001a\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010,R'\u0010A\u001a\u0015\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0018\u00010B¢\u0006\u0002\bE8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0014\u0010\r\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010!R\u001a\u0010K\u001a\u00020L8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010!R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00105R\u0012\u0010Q\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "visiblePagesInfo", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "pageSize", "", "pageSpacing", "afterContentPadding", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "viewportStartOffset", "viewportEndOffset", "reverseLayout", "", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "currentPageOffsetFraction", "", "firstVisiblePageScrollOffset", "canScrollForward", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/ui/layout/MeasureResult;ZLjava/util/List;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)V", "getAfterContentPadding", "()I", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "beforeContentPadding", "getBeforeContentPadding", "getBeyondViewportPageCount", "canScrollBackward", "getCanScrollBackward", "()Z", "getCanScrollForward", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "getCurrentPage", "()Landroidx/compose/foundation/pager/MeasuredPage;", "getCurrentPageOffsetFraction", "()F", "getExtraPagesAfter", "()Ljava/util/List;", "getExtraPagesBefore", "getFirstVisiblePage", "getFirstVisiblePageScrollOffset", "height", "getHeight", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getPageSize", "getPageSpacing", "getRemeasureNeeded", "getReverseLayout", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "getSnapPosition", "()Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "getViewportEndOffset", "viewportSize", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "getViewportStartOffset", "getVisiblePagesInfo", "width", "getWidth", "copyWithScrollDeltaWithoutRemeasure", "delta", "placeChildren", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    public static final int $stable = 0;
    private final int afterContentPadding;
    private final int beyondViewportPageCount;
    private final boolean canScrollForward;
    private final CoroutineScope coroutineScope;
    private final MeasuredPage currentPage;
    private final float currentPageOffsetFraction;
    private final List<MeasuredPage> extraPagesAfter;
    private final List<MeasuredPage> extraPagesBefore;
    private final MeasuredPage firstVisiblePage;
    private final int firstVisiblePageScrollOffset;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final SnapPosition snapPosition;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<MeasuredPage> visiblePagesInfo;

    static {
        $stable = 8;
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

    public PagerMeasureResult(List<MeasuredPage> r17, int pageSize, int pageSpacing, int afterContentPadding, Orientation orientation, int viewportStartOffset, int viewportEndOffset, boolean reverseLayout, int beyondViewportPageCount, MeasuredPage firstVisiblePage, MeasuredPage currentPage, float currentPageOffsetFraction, int firstVisiblePageScrollOffset, boolean canScrollForward, SnapPosition snapPosition, MeasureResult measureResult, boolean remeasureNeeded, List<MeasuredPage> r34, List<MeasuredPage> r35, CoroutineScope coroutineScope) {
        this.visiblePagesInfo = r17;
        this.pageSize = pageSize;
        this.pageSpacing = pageSpacing;
        this.afterContentPadding = afterContentPadding;
        this.orientation = orientation;
        this.viewportStartOffset = viewportStartOffset;
        this.viewportEndOffset = viewportEndOffset;
        this.reverseLayout = reverseLayout;
        this.beyondViewportPageCount = beyondViewportPageCount;
        this.firstVisiblePage = firstVisiblePage;
        this.currentPage = currentPage;
        this.currentPageOffsetFraction = currentPageOffsetFraction;
        this.firstVisiblePageScrollOffset = firstVisiblePageScrollOffset;
        this.canScrollForward = canScrollForward;
        this.snapPosition = snapPosition;
        this.measureResult = measureResult;
        this.remeasureNeeded = remeasureNeeded;
        this.extraPagesBefore = r34;
        this.extraPagesAfter = r35;
        this.coroutineScope = coroutineScope;
    }

    public /* synthetic */ PagerMeasureResult(List r23, int r24, int r25, int r26, Orientation r27, int r28, int r29, boolean r30, int r31, MeasuredPage r32, MeasuredPage r33, float r34, int r35, boolean r36, SnapPosition r37, MeasureResult r38, boolean r39, List r40, List r41, CoroutineScope r42, int r43, DefaultConstructorMarker r44) {
        if ((r43 & 131072) == 0) goto L5;
        List r19 = CollectionsKt.emptyList();
    L7:
        if ((r43 & 262144) == 0) goto L9;
        List r20 = CollectionsKt.emptyList();
    L10:
        this(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r19, r20, r42);
        return;
    L9:
        r20 = r41;
        goto L10
    L5:
        r19 = r40;
        goto L7
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public List<MeasuredPage> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public SnapPosition getSnapPosition() {
        return this.snapPosition;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final List<MeasuredPage> getExtraPagesBefore() {
        return this.extraPagesBefore;
    }

    public final List<MeasuredPage> getExtraPagesAfter() {
        return this.extraPagesAfter;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo973getViewportSizeYbymL2g() {
        int width$iv = getWidth();
        int height$iv = getHeight();
        return IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        MeasuredPage r0 = this.firstVisiblePage;
        if (r0 == null) goto L5;
        int r1 = r0.getIndex();
    L6:
        if (r1 == 0) goto L8;
    L9:
        return true;
    L8:
        if (this.firstVisiblePageScrollOffset != 0) goto L9;
        return false;
    L5:
        r1 = 0;
        goto L6
    }

    public final PagerMeasureResult copyWithScrollDeltaWithoutRemeasure(int delta) {
        int pageSizeWithSpacing = getPageSize() + getPageSpacing();
        if (this.remeasureNeeded == false) goto L5;
    L56:
        return null;
    L5:
        if (getVisiblePagesInfo().isEmpty() == true) goto L56;
        if (this.firstVisiblePage == null) goto L56;
        int r3 = this.firstVisiblePageScrollOffset - delta;
        if (r3 < 0) goto L12;
        if (r3 >= pageSizeWithSpacing) goto L12;
        boolean r4 = true;
    L13:
        if (r4 == false) goto L56;
        if (pageSizeWithSpacing == 0) goto L17;
        float deltaFraction = delta / pageSizeWithSpacing;
    L18:
        float newCurrentPageOffsetFraction = this.currentPageOffsetFraction - deltaFraction;
        if (this.currentPage != null) goto L21;
    L55:
        return null;
    L21:
        if (newCurrentPageOffsetFraction >= 0.5f) goto L55;
        if (newCurrentPageOffsetFraction <= (-0.5f)) goto L55;
        MeasuredPage first = (MeasuredPage) CollectionsKt.first(getVisiblePagesInfo());
        MeasuredPage last = (MeasuredPage) CollectionsKt.last(getVisiblePagesInfo());
        if (delta >= 0) goto L31;
        int deltaToFirstItemChange = (first.getOffset() + pageSizeWithSpacing) - getViewportStartOffset();
        int deltaToLastItemChange = (last.getOffset() + pageSizeWithSpacing) - getViewportEndOffset();
        if (Math.min(deltaToFirstItemChange, deltaToLastItemChange) <= (-delta)) goto L30;
        int deltaToFirstItemChange2 = 1;
    L36:
        if (deltaToFirstItemChange2 == 0) goto L60;
        List<MeasuredPage> r5 = getVisiblePagesInfo();
        int index$iv = 0;
        int r13 = r5.size();
    L38:
        if (index$iv >= r13) goto L40;
        Object item$iv = r5.get(index$iv);
        MeasuredPage it = (MeasuredPage) item$iv;
        it.applyScrollDelta(delta);
        index$iv = index$iv + 1;
        goto L38
    L40:
        List<MeasuredPage> r6 = this.extraPagesBefore;
        int index$iv2 = 0;
        int r14 = r6.size();
    L41:
        if (index$iv2 >= r14) goto L43;
        Object item$iv2 = r6.get(index$iv2);
        MeasuredPage it2 = (MeasuredPage) item$iv2;
        it2.applyScrollDelta(delta);
        index$iv2 = index$iv2 + 1;
        goto L41
    L43:
        List<MeasuredPage> r7 = this.extraPagesAfter;
        int index$iv3 = 0;
        int r15 = r7.size();
    L44:
        if (index$iv3 >= r15) goto L46;
        Object item$iv3 = r7.get(index$iv3);
        MeasuredPage it3 = (MeasuredPage) item$iv3;
        it3.applyScrollDelta(delta);
        index$iv3 = index$iv3 + 1;
        goto L44
    L46:
        List<MeasuredPage> r16 = getVisiblePagesInfo();
        int r17 = getPageSize();
        int r18 = getPageSpacing();
        int r19 = getAfterContentPadding();
        Orientation r110 = getOrientation();
        int r20 = getViewportStartOffset();
        int r21 = getViewportEndOffset();
        boolean r22 = getReverseLayout();
        int r23 = getBeyondViewportPageCount();
        MeasuredPage r8 = this.firstVisiblePage;
        MeasuredPage r11 = this.currentPage;
        float r26 = this.currentPageOffsetFraction - deltaFraction;
        int r27 = this.firstVisiblePageScrollOffset - delta;
        if (this.canScrollForward == true) goto L51;
        if (delta > 0) goto L51;
        boolean r28 = false;
    L54:
        return new PagerMeasureResult(r16, r17, r18, r19, r110, r20, r21, r22, r23, r8, r11, r26, r27, r28, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope);
    L51:
        r28 = true;
        goto L54
    L60:
        return null;
    L30:
        deltaToFirstItemChange2 = 0;
        goto L36
    L31:
        int deltaToFirstItemChange3 = getViewportStartOffset() - first.getOffset();
        int deltaToLastItemChange2 = getViewportEndOffset() - last.getOffset();
        if (Math.min(deltaToFirstItemChange3, deltaToLastItemChange2) <= delta) goto L34;
        deltaToFirstItemChange2 = 1;
        goto L36
    L34:
        deltaToFirstItemChange2 = 0;
        goto L36
    L17:
        deltaFraction = 0.0f;
    L12:
        r4 = false;
        goto L13
    }
}
