package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazyGridPrefetchStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u001c\u0010\u000f\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "nestedPrefetchItemCount", "", "(I)V", "currentLinePrefetchHandles", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "lineToPrefetch", "wasScrollingForward", "", "onNestedPrefetch", "", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "firstVisibleItemIndex", "onScroll", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;", "delta", "", "layoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "onVisibleItemsUpdated", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;
    private int lineToPrefetch;
    private final int nestedPrefetchItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyGridPrefetchStrategy() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public DefaultLazyGridPrefetchStrategy(int nestedPrefetchItemCount) {
        this.nestedPrefetchItemCount = nestedPrefetchItemCount;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
    }

    public /* synthetic */ DefaultLazyGridPrefetchStrategy(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 2;
    L5:
        this(r1);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onScroll(LazyGridPrefetchScope $this$onScroll, float delta, LazyGridLayoutInfo layoutInfo) {
        if (layoutInfo.getVisibleItemsInfo().isEmpty() == true) goto L52;
        boolean r3 = false;
        if (delta >= 0.0f) goto L7;
        boolean scrollingForward = true;
    L9:
        if (scrollingForward == false) goto L15;
        LazyGridItemInfo it = (LazyGridItemInfo) CollectionsKt.last(layoutInfo.getVisibleItemsInfo());
        if (layoutInfo.getOrientation() != Orientation.Vertical) goto L13;
        int r9 = it.getRow();
    L14:
        int lineToPrefetch = r9 + 1;
        int closestNextItemToPrefetch = ((LazyGridItemInfo) CollectionsKt.last(layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
    L20:
        if (closestNextItemToPrefetch >= 0) goto L22;
    L24:
        if (r3 == false) goto L58;
        if (lineToPrefetch == this.lineToPrefetch) goto L37;
        if (lineToPrefetch < 0) goto L37;
        if (this.wasScrollingForward == scrollingForward) goto L34;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> r4 = this.currentLinePrefetchHandles;
        int i$iv = 0;
        Object[] content$iv = r4.content;
        int size$iv = r4.getSize();
    L31:
        if (i$iv >= size$iv) goto L34;
        ((LazyLayoutPrefetchState.PrefetchHandle) content$iv[i$iv]).cancel();
        i$iv = i$iv + 1;
    L34:
        this.wasScrollingForward = scrollingForward;
        this.lineToPrefetch = lineToPrefetch;
        this.currentLinePrefetchHandles.clear();
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> r5 = this.currentLinePrefetchHandles;
        r5.addAll(r5.getSize(), $this$onScroll.scheduleLinePrefetch(lineToPrefetch));
    L37:
        if (scrollingForward == false) goto L44;
        LazyGridItemInfo lastItem = (LazyGridItemInfo) CollectionsKt.last(layoutInfo.getVisibleItemsInfo());
        int itemSize = LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lastItem, layoutInfo.getOrientation());
        int itemSpacing = layoutInfo.getMainAxisItemSpacing();
        int distanceToPrefetchItem = ((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lastItem, layoutInfo.getOrientation()) + itemSize) + itemSpacing) - layoutInfo.getViewportEndOffset();
        if (distanceToPrefetchItem >= (-delta)) goto L56;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> r10 = this.currentLinePrefetchHandles;
        int i$iv2 = 0;
        Object[] content$iv2 = r10.content;
        int size$iv2 = r10.getSize();
    L41:
        if (i$iv2 >= size$iv2) goto L59;
        ((LazyLayoutPrefetchState.PrefetchHandle) content$iv2[i$iv2]).markAsUrgent();
        i$iv2 = i$iv2 + 1;
        goto L41
    L59:
        return;
    L56:
        return;
    L44:
        LazyGridItemInfo firstItem = (LazyGridItemInfo) CollectionsKt.first(layoutInfo.getVisibleItemsInfo());
        int distanceToPrefetchItem2 = layoutInfo.getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(firstItem, layoutInfo.getOrientation());
        if (distanceToPrefetchItem2 >= delta) goto L57;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> r7 = this.currentLinePrefetchHandles;
        int i$iv3 = 0;
        Object[] content$iv3 = r7.content;
        int size$iv3 = r7.getSize();
    L47:
        if (i$iv3 >= size$iv3) goto L60;
        ((LazyLayoutPrefetchState.PrefetchHandle) content$iv3[i$iv3]).markAsUrgent();
        i$iv3 = i$iv3 + 1;
        goto L47
    L60:
        return;
    L57:
        return;
    L58:
        return;
    L22:
        if (closestNextItemToPrefetch >= layoutInfo.getTotalItemsCount()) goto L24;
        r3 = true;
        goto L24
    L13:
        r9 = it.getColumn();
        goto L14
    L15:
        LazyGridItemInfo it2 = (LazyGridItemInfo) CollectionsKt.first(layoutInfo.getVisibleItemsInfo());
        if (layoutInfo.getOrientation() != Orientation.Vertical) goto L18;
        int r11 = it2.getRow();
    L19:
        lineToPrefetch = r11 - 1;
        closestNextItemToPrefetch = ((LazyGridItemInfo) CollectionsKt.first(layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
        goto L20
    L18:
        r11 = it2.getColumn();
        goto L19
    L7:
        scrollingForward = false;
        goto L9
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onVisibleItemsUpdated(LazyGridPrefetchScope $this$onVisibleItemsUpdated, LazyGridLayoutInfo layoutInfo) {
        if (this.lineToPrefetch != (-1)) goto L5;
        return;
    L5:
        if (layoutInfo.getVisibleItemsInfo().isEmpty() == false) goto L7;
        return;
    L7:
        if (this.wasScrollingForward == false) goto L13;
        LazyGridItemInfo it = (LazyGridItemInfo) CollectionsKt.last(layoutInfo.getVisibleItemsInfo());
        if (layoutInfo.getOrientation() != Orientation.Vertical) goto L11;
        int r3 = it.getRow();
    L12:
        int expectedLineToPrefetch = r3 + 1;
    L19:
        if (this.lineToPrefetch == expectedLineToPrefetch) goto L28;
        this.lineToPrefetch = -1;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> r0 = this.currentLinePrefetchHandles;
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L21:
        if (i$iv >= size$iv) goto L23;
        ((LazyLayoutPrefetchState.PrefetchHandle) content$iv[i$iv]).cancel();
        i$iv = i$iv + 1;
        goto L21
    L23:
        this.currentLinePrefetchHandles.clear();
        return;
    L28:
        return;
    L11:
        r3 = it.getColumn();
        goto L12
    L13:
        LazyGridItemInfo it2 = (LazyGridItemInfo) CollectionsKt.first(layoutInfo.getVisibleItemsInfo());
        if (layoutInfo.getOrientation() != Orientation.Vertical) goto L16;
        int r4 = it2.getRow();
    L17:
        expectedLineToPrefetch = r4 - 1;
        goto L19
    L16:
        r4 = it2.getColumn();
        goto L17
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope $this$onNestedPrefetch, int firstVisibleItemIndex) {
        int r0 = this.nestedPrefetchItemCount;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        int i = r1;
        $this$onNestedPrefetch.schedulePrefetch(firstVisibleItemIndex + i);
        r1 = r1 + 1;
        goto L3
    }
}
