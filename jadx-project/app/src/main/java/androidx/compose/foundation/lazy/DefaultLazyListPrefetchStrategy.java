package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazyListPrefetchStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u001c\u0010\u000e\u001a\u00020\u000b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0014\u001a\u00020\u000b*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/DefaultLazyListPrefetchStrategy;", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "nestedPrefetchItemCount", "", "(I)V", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "indexToPrefetch", "wasScrollingForward", "", "onNestedPrefetch", "", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "firstVisibleItemIndex", "onScroll", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "delta", "", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "onVisibleItemsUpdated", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private int indexToPrefetch;
    private final int nestedPrefetchItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyListPrefetchStrategy() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public DefaultLazyListPrefetchStrategy(int nestedPrefetchItemCount) {
        this.nestedPrefetchItemCount = nestedPrefetchItemCount;
        this.indexToPrefetch = -1;
    }

    public /* synthetic */ DefaultLazyListPrefetchStrategy(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 2;
    L5:
        this(r1);
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onScroll(LazyListPrefetchScope $this$onScroll, float delta, LazyListLayoutInfo layoutInfo) {
        if (layoutInfo.getVisibleItemsInfo().isEmpty() == true) goto L37;
        boolean r1 = false;
        if (delta >= 0.0f) goto L7;
        boolean scrollingForward = true;
    L8:
        if (scrollingForward == false) goto L10;
        int indexToPrefetch = ((LazyListItemInfo) CollectionsKt.last(layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
    L12:
        if (indexToPrefetch >= 0) goto L14;
    L16:
        if (r1 == true) goto L18;
        return;
    L18:
        if (indexToPrefetch != this.indexToPrefetch) goto L20;
    L25:
        if (scrollingForward == false) goto L31;
        LazyListItemInfo lastItem = (LazyListItemInfo) CollectionsKt.last(layoutInfo.getVisibleItemsInfo());
        int spacing = layoutInfo.getMainAxisItemSpacing();
        int distanceToPrefetchItem = ((lastItem.getOffset() + lastItem.getSize()) + spacing) - layoutInfo.getViewportEndOffset();
        if (distanceToPrefetchItem >= (-delta)) goto L39;
        LazyLayoutPrefetchState.PrefetchHandle r5 = this.currentPrefetchHandle;
        if (r5 == null) goto L40;
        r5.markAsUrgent();
        return;
    L40:
        return;
    L39:
        return;
    L31:
        LazyListItemInfo firstItem = (LazyListItemInfo) CollectionsKt.first(layoutInfo.getVisibleItemsInfo());
        int distanceToPrefetchItem2 = layoutInfo.getViewportStartOffset() - firstItem.getOffset();
        if (distanceToPrefetchItem2 >= delta) goto L42;
        LazyLayoutPrefetchState.PrefetchHandle r4 = this.currentPrefetchHandle;
        if (r4 == null) goto L43;
        r4.markAsUrgent();
        return;
    L43:
        return;
    L42:
        return;
    L20:
        if (this.wasScrollingForward == scrollingForward) goto L24;
        LazyLayoutPrefetchState.PrefetchHandle r2 = this.currentPrefetchHandle;
        if (r2 == null) goto L24;
        r2.cancel();
    L24:
        this.wasScrollingForward = scrollingForward;
        this.indexToPrefetch = indexToPrefetch;
        this.currentPrefetchHandle = $this$onScroll.schedulePrefetch(indexToPrefetch);
        goto L25
    L14:
        if (indexToPrefetch >= layoutInfo.getTotalItemsCount()) goto L16;
        r1 = true;
        goto L16
    L10:
        indexToPrefetch = ((LazyListItemInfo) CollectionsKt.first(layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
        goto L12
    L7:
        scrollingForward = false;
        goto L8
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onVisibleItemsUpdated(LazyListPrefetchScope $this$onVisibleItemsUpdated, LazyListLayoutInfo layoutInfo) {
        if (this.indexToPrefetch != (-1)) goto L5;
        return;
    L5:
        if (layoutInfo.getVisibleItemsInfo().isEmpty() == false) goto L7;
        return;
    L7:
        if (this.wasScrollingForward == false) goto L9;
        int expectedPrefetchIndex = ((LazyListItemInfo) CollectionsKt.last(layoutInfo.getVisibleItemsInfo())).getIndex() + 1;
    L11:
        if (this.indexToPrefetch == expectedPrefetchIndex) goto L19;
        this.indexToPrefetch = -1;
        LazyLayoutPrefetchState.PrefetchHandle r1 = this.currentPrefetchHandle;
        if (r1 == null) goto L15;
        r1.cancel();
    L15:
        this.currentPrefetchHandle = null;
        return;
    L19:
        return;
    L9:
        expectedPrefetchIndex = ((LazyListItemInfo) CollectionsKt.first(layoutInfo.getVisibleItemsInfo())).getIndex() - 1;
        goto L11
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
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
