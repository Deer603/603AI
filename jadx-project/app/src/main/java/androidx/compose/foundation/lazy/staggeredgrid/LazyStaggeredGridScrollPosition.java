package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LazyStaggeredGridScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00126\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0002J\u0016\u0010(\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u0018\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0002J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020)2\u0006\u0010#\u001a\u00020\u0003J\u0016\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u0002012\u0006\u0010\u0017\u001a\u00020\u0003R>\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR+\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001e\u0010#\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019¨\u00062"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "initialIndices", "", "initialOffsets", "fillIndices", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "targetIndex", "laneCount", "([I[ILkotlin/jvm/functions/Function2;)V", "hadFirstNotEmptyLayout", "", "<set-?>", "index", "getIndex", "()I", "setIndex", "(I)V", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "indices", "getIndices", "()[I", "lastKnownFirstItemKey", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrollOffset$delegate", "scrollOffsets", "getScrollOffsets", "calculateFirstVisibleIndex", "calculateFirstVisibleScrollOffset", "offsets", "requestPositionAndForgetLastKnownKey", "", "update", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "updateScrollOffset", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridScrollPosition {
    public static final int $stable = 0;
    private final Function2<Integer, Integer, int[]> fillIndices;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private int[] indices;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;
    private int[] scrollOffsets;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(int[] initialIndices, int[] initialOffsets, Function2<? super Integer, ? super Integer, int[]> r7) {
        this.fillIndices = r7;
        this.indices = initialIndices;
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleIndex(initialIndices));
        this.scrollOffsets = initialOffsets;
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleScrollOffset(initialIndices, initialOffsets));
        Integer r1 = ArraysKt.minOrNull(initialIndices);
        if (r1 == null) goto L5;
        int r2 = r1.intValue();
    L6:
        this.nearestRangeState = new LazyLayoutNearestRangeState(r2, 90, ComposerKt.invocationKey);
        return;
    L5:
        r2 = 0;
        goto L6
    }

    public final int[] getIndices() {
        return this.indices;
    }

    private final void setIndex(int r4) {
        MutableIntState $this$setValue$iv = this.index$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    public final int getIndex() {
        IntState $this$getValue$iv = this.index$delegate;
        return $this$getValue$iv.getIntValue();
    }

    public final int[] getScrollOffsets() {
        return this.scrollOffsets;
    }

    private final void setScrollOffset(int r4) {
        MutableIntState $this$setValue$iv = this.scrollOffset$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    public final int getScrollOffset() {
        IntState $this$getValue$iv = this.scrollOffset$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private final int calculateFirstVisibleIndex(int[] indices) {
        int minIndex = Integer.MAX_VALUE;
        int r3 = indices.length;
        int r5 = 0;
    L3:
        if (r5 >= r3) goto L11;
        int element$iv = indices[r5];
        if (element$iv <= 0) goto L6;
        if (minIndex <= element$iv) goto L9;
        minIndex = element$iv;
    L9:
        r5 = r5 + 1;
        goto L3
    L6:
        return 0;
    L11:
        if (minIndex != Integer.MAX_VALUE) goto L14;
        return 0;
    L14:
        return minIndex;
    }

    private final int calculateFirstVisibleScrollOffset(int[] indices, int[] offsets) {
        int minOffset = Integer.MAX_VALUE;
        int smallestIndex = calculateFirstVisibleIndex(indices);
        int lane = 0;
        int r3 = offsets.length;
    L3:
        if (lane >= r3) goto L9;
        if (indices[lane] != smallestIndex) goto L7;
        minOffset = Math.min(minOffset, offsets[lane]);
    L7:
        lane = lane + 1;
        goto L3
    L9:
        if (minOffset != Integer.MAX_VALUE) goto L12;
        return 0;
    L12:
        return minOffset;
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(LazyStaggeredGridMeasureResult measureResult) {
        int firstVisibleIndex = calculateFirstVisibleIndex(measureResult.getFirstVisibleItemIndices());
        List<LazyStaggeredGridMeasuredItem> r0 = measureResult.getVisibleItemsInfo();
        int index$iv$iv = 0;
        int r7 = r0.size();
    L3:
        Function1<Object, Unit> r9 = null;
        if (index$iv$iv >= r7) goto L12;
        Object item$iv$iv = r0.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        LazyStaggeredGridMeasuredItem it = (LazyStaggeredGridMeasuredItem) it$iv;
        if (it.getIndex() != firstVisibleIndex) goto L8;
        boolean r15 = true;
    L9:
        if (r15 == true) goto L13;
        index$iv$iv = index$iv$iv + 1;
    L13:
        LazyStaggeredGridMeasuredItem r11 = (LazyStaggeredGridMeasuredItem) it$iv;
        if (r11 == null) goto L16;
        Object r1 = r11.getKey();
    L17:
        this.lastKnownFirstItemKey = r1;
        this.nearestRangeState.update(firstVisibleIndex);
        if (this.hadFirstNotEmptyLayout == false) goto L20;
    L21:
        this.hadFirstNotEmptyLayout = true;
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L24;
        r9 = previousSnapshot$iv.getReadObserver();
    L24:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        update(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());     // Catch: Throwable -> L28
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L28
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r9);
        return;
    L28:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r9);
        throw th;
    L20:
        if (measureResult.getTotalItemsCount() > 0) goto L21;
        return;
    L16:
        r1 = null;
        goto L17
    L8:
        r15 = false;
        goto L9
    L12:
        it$iv = null;
        goto L13
    }

    public final void updateScrollOffset(int[] scrollOffsets) {
        this.scrollOffsets = scrollOffsets;
        setScrollOffset(calculateFirstVisibleScrollOffset(this.indices, scrollOffsets));
    }

    public final void requestPositionAndForgetLastKnownKey(int index, int scrollOffset) {
        int[] newIndices = this.fillIndices.invoke(Integer.valueOf(index), Integer.valueOf(this.indices.length));
        int r1 = newIndices.length;
        int[] newOffsets = new int[r1];
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        newOffsets[r3] = scrollOffset;
        r3 = r3 + 1;
        goto L3
    L5:
        update(newIndices, newOffsets);
        this.nearestRangeState.update(index);
        this.lastKnownFirstItemKey = null;
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved(LazyLayoutItemProvider itemProvider, int[] indices) {
        Object r0 = this.lastKnownFirstItemKey;
        int r1 = 0;
        Integer r2 = ArraysKt.getOrNull(indices, 0);
        if (r2 == null) goto L5;
        r1 = r2.intValue();
    L5:
        int newIndex = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, r0, r1);
        if (ArraysKt.contains(indices, newIndex) == true) goto L18;
        this.nearestRangeState.update(newIndex);
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L10;
        Function1<Object, Unit> r4 = previousSnapshot$iv.getReadObserver();
    L11:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        int[] newIndices = this.fillIndices.invoke(Integer.valueOf(newIndex), Integer.valueOf(indices.length));     // Catch: Throwable -> L14
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        this.indices = newIndices;
        setIndex(calculateFirstVisibleIndex(newIndices));
        return newIndices;
    L14:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r4);
        throw th;
    L10:
        r4 = null;
        goto L11
    L18:
        return indices;
    }

    private final void update(int[] indices, int[] offsets) {
        this.indices = indices;
        setIndex(calculateFirstVisibleIndex(indices));
        this.scrollOffsets = offsets;
        setScrollOffset(calculateFirstVisibleScrollOffset(indices, offsets));
    }
}
