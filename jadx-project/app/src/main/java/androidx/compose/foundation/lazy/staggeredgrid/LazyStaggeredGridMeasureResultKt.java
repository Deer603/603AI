package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\b2\u0006\u0010\r\u001a\u00020\u0007H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0007*\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"EmptyArray", "", "EmptyLazyStaggeredGridLayoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "getEmptyLazyStaggeredGridLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)I", "findVisibleItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "itemIndex", "visibleItemsAverageSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridMeasureResultKt {
    private static final int[] EmptyArray = null;
    private static final LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo = null;

    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo $this$findVisibleItem, final int itemIndex) {
        if ($this$findVisibleItem.getVisibleItemsInfo().isEmpty() == false) goto L5;
        return null;
    L5:
        int r0 = ((LazyStaggeredGridItemInfo) CollectionsKt.first($this$findVisibleItem.getVisibleItemsInfo())).getIndex();
        boolean r3 = false;
        if (itemIndex > ((LazyStaggeredGridItemInfo) CollectionsKt.last($this$findVisibleItem.getVisibleItemsInfo())).getIndex()) goto L9;
        if (r0 > itemIndex) goto L9;
        r3 = true;
    L9:
        if (r3 == true) goto L11;
        return null;
    L11:
        int index = CollectionsKt.binarySearch$default($this$findVisibleItem.getVisibleItemsInfo(), 0, 0, new LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(itemIndex), 3, null);
        return (LazyStaggeredGridItemInfo) CollectionsKt.getOrNull($this$findVisibleItem.getVisibleItemsInfo(), index);
    }

    static {
        EmptyArray = new int[0];
        int[] r2 = EmptyArray;
        int[] r3 = EmptyArray;
        MeasureResult r0 = new LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1();
        List r14 = CollectionsKt.emptyList();
        long r15 = IntSize.Companion.m7149getZeroYbymL2g();
        MeasureResult r5 = r0;
        EmptyLazyStaggeredGridLayoutInfo = new LazyStaggeredGridMeasureResult(r2, r3, 0.0f, r5, 0.0f, false, false, false, new LazyStaggeredGridSlots(EmptyArray, EmptyArray), new LazyStaggeredGridSpanProvider(new MutableIntervalList()), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, r14, r15, 0, 0, 0, 0, 0, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), null);
    }

    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }

    public static final int visibleItemsAverageSize(LazyStaggeredGridLayoutInfo $this$visibleItemsAverageSize) {
        List<LazyStaggeredGridItemInfo> r0 = $this$visibleItemsAverageSize.getVisibleItemsInfo();
        if (r0.isEmpty() == false) goto L6;
        return 0;
    L6:
        List<LazyStaggeredGridItemInfo> r1 = r0;
        int sum$iv = 0;
        int index$iv$iv = 0;
        int r7 = r1.size();
    L7:
        if (index$iv$iv >= r7) goto L14;
        Object item$iv$iv = r1.get(index$iv$iv);
        LazyStaggeredGridItemInfo it = (LazyStaggeredGridItemInfo) item$iv$iv;
        if ($this$visibleItemsAverageSize.getOrientation() != Orientation.Vertical) goto L11;
        long arg0$iv = it.mo932getSizeYbymL2g();
        long arg0$iv2 = arg0$iv & 4294967295L;
    L12:
        sum$iv = sum$iv + ((int) arg0$iv2);
        index$iv$iv = index$iv$iv + 1;
        r0 = r0;
        r1 = r1;
        goto L7
    L11:
        long arg0$iv3 = it.mo932getSizeYbymL2g();
        arg0$iv2 = arg0$iv3 >> 32;
        goto L12
    L14:
        return (sum$iv / r0.size()) + $this$visibleItemsAverageSize.getMainAxisItemSpacing();
    }

    public static final int getSingleAxisViewportSize(LazyStaggeredGridLayoutInfo $this$singleAxisViewportSize) {
        if ($this$singleAxisViewportSize.getOrientation() != Orientation.Vertical) goto L5;
        long arg0$iv = $this$singleAxisViewportSize.mo934getViewportSizeYbymL2g();
        return (int) (4294967295L & arg0$iv);
    L5:
        long arg0$iv2 = $this$singleAxisViewportSize.mo934getViewportSizeYbymL2g();
        return (int) (arg0$iv2 >> 32);
    }
}
