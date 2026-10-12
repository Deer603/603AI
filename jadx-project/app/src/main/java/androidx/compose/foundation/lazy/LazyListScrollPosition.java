package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazyListScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0003J\u0016\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0015\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "initialIndex", "", "initialScrollOffset", "(II)V", "hadFirstNotEmptyLayout", "", "<set-?>", "index", "getIndex", "()I", "setIndex", "(I)V", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "lastKnownFirstItemKey", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrollOffset$delegate", "requestPositionAndForgetLastKnownKey", "", "update", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "updateScrollOffset", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyListScrollPosition {
    public static final int $stable = 0;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    static {
        $stable = 8;
    }

    public LazyListScrollPosition() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public LazyListScrollPosition(int initialIndex, int initialScrollOffset) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(initialIndex);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(initialScrollOffset);
        this.nearestRangeState = new LazyLayoutNearestRangeState(initialIndex, 30, 100);
    }

    public /* synthetic */ LazyListScrollPosition(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }

    public final int getIndex() {
        IntState $this$getValue$iv = this.index$delegate;
        return $this$getValue$iv.getIntValue();
    }

    public final void setIndex(int r4) {
        MutableIntState $this$setValue$iv = this.index$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    private final void setScrollOffset(int r4) {
        MutableIntState $this$setValue$iv = this.scrollOffset$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    public final int getScrollOffset() {
        IntState $this$getValue$iv = this.scrollOffset$delegate;
        return $this$getValue$iv.getIntValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(LazyListMeasureResult measureResult) {
        LazyListMeasuredItem r0 = measureResult.getFirstVisibleItem();
        if (r0 == null) goto L5;
        Object r1 = r0.getKey();
    L6:
        this.lastKnownFirstItemKey = r1;
        if (this.hadFirstNotEmptyLayout == false) goto L9;
    L10:
        boolean value$iv = true;
        this.hadFirstNotEmptyLayout = true;
        int scrollOffset = measureResult.getFirstVisibleItemScrollOffset();
        int firstIndex = 0;
        if (scrollOffset >= 0.0f) goto L15;
        value$iv = false;
    L15:
        if (value$iv == true) goto L17;
        InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
    L17:
        LazyListMeasuredItem r2 = measureResult.getFirstVisibleItem();
        if (r2 == null) goto L20;
        firstIndex = r2.getIndex();
    L20:
        update(firstIndex, scrollOffset);
        return;
    L9:
        if (measureResult.getTotalItemsCount() > 0) goto L10;
        return;
    L5:
        r1 = null;
        goto L6
    }

    public final void updateScrollOffset(int scrollOffset) {
        if (scrollOffset < 0.0f) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
    L9:
        setScrollOffset(scrollOffset);
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void requestPositionAndForgetLastKnownKey(int index, int scrollOffset) {
        update(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(LazyListItemProvider itemProvider, int index) {
        int newIndex = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.lastKnownFirstItemKey, index);
        if (index == newIndex) goto L5;
        setIndex(newIndex);
        this.nearestRangeState.update(index);
    L5:
        return newIndex;
    }

    private final void update(int index, int scrollOffset) {
        if (index < 0.0f) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative (" + index + ')');
    L9:
        setIndex(index);
        this.nearestRangeState.update(index);
        setScrollOffset(scrollOffset);
        return;
    L5:
        value$iv = false;
        goto L7
    }
}
