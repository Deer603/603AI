package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PagerScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003J\u0016\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003J\u0016\u0010&\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0005J\u0018\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0005H\u0002J\u000e\u0010*\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "currentPage", "", "currentPageOffsetFraction", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "(IFLandroidx/compose/foundation/pager/PagerState;)V", "<set-?>", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "currentPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "getCurrentPageOffsetFraction", "()F", "setCurrentPageOffsetFraction", "(F)V", "currentPageOffsetFraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "hadFirstNotEmptyLayout", "", "lastKnownCurrentPageKey", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "applyScrollDelta", "", "delta", "matchPageWithKey", "itemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "index", "requestPositionAndForgetLastKnownKey", "offsetFraction", "update", "page", "updateCurrentPageOffsetFraction", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PagerScrollPosition {
    public static final int $stable = 0;
    private final MutableIntState currentPage$delegate;
    private final MutableFloatState currentPageOffsetFraction$delegate;
    private boolean hadFirstNotEmptyLayout;
    private Object lastKnownCurrentPageKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final PagerState state;

    static {
        $stable = 8;
    }

    public PagerScrollPosition(int currentPage, float currentPageOffsetFraction, PagerState state) {
        this.state = state;
        this.currentPage$delegate = SnapshotIntStateKt.mutableIntStateOf(currentPage);
        this.currentPageOffsetFraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(currentPageOffsetFraction);
        this.nearestRangeState = new LazyLayoutNearestRangeState(currentPage, 30, 100);
    }

    public /* synthetic */ PagerScrollPosition(int r1, float r2, PagerState r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = 0.0f;
    L8:
        this(r1, r2, r3);
    }

    public final PagerState getState() {
        return this.state;
    }

    private final void setCurrentPage(int r4) {
        MutableIntState $this$setValue$iv = this.currentPage$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    public final int getCurrentPage() {
        IntState $this$getValue$iv = this.currentPage$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private final void setCurrentPageOffsetFraction(float r4) {
        MutableFloatState $this$setValue$iv = this.currentPageOffsetFraction$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getCurrentPageOffsetFraction() {
        FloatState $this$getValue$iv = this.currentPageOffsetFraction$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(PagerMeasureResult measureResult) {
        MeasuredPage r0 = measureResult.getCurrentPage();
        if (r0 == null) goto L5;
        Object r1 = r0.getKey();
    L6:
        this.lastKnownCurrentPageKey = r1;
        if (this.hadFirstNotEmptyLayout == false) goto L9;
    L10:
        this.hadFirstNotEmptyLayout = true;
        MeasuredPage r2 = measureResult.getCurrentPage();
        if (r2 == null) goto L13;
        int r3 = r2.getIndex();
    L14:
        update(r3, measureResult.getCurrentPageOffsetFraction());
        return;
    L13:
        r3 = 0;
        goto L14
    L9:
        if (measureResult.getVisiblePagesInfo().isEmpty() == false) goto L10;
        return;
    L5:
        r1 = null;
        goto L6
    }

    public final void requestPositionAndForgetLastKnownKey(int index, float offsetFraction) {
        update(index, offsetFraction);
        this.lastKnownCurrentPageKey = null;
    }

    public final int matchPageWithKey(PagerLazyLayoutItemProvider itemProvider, int index) {
        int newIndex = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.lastKnownCurrentPageKey, index);
        if (index == newIndex) goto L5;
        setCurrentPage(newIndex);
        this.nearestRangeState.update(index);
    L5:
        return newIndex;
    }

    private final void update(int page, float offsetFraction) {
        setCurrentPage(page);
        this.nearestRangeState.update(page);
        setCurrentPageOffsetFraction(offsetFraction);
    }

    public final void updateCurrentPageOffsetFraction(float offsetFraction) {
        setCurrentPageOffsetFraction(offsetFraction);
    }

    public final void applyScrollDelta(int delta) {
        if (this.state.getPageSizeWithSpacing$foundation_release() != 0) goto L5;
        float fractionUpdate = 0.0f;
    L6:
        setCurrentPageOffsetFraction(getCurrentPageOffsetFraction() + fractionUpdate);
        return;
    L5:
        fractionUpdate = delta / this.state.getPageSizeWithSpacing$foundation_release();
        goto L6
    }
}
