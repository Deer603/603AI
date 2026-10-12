package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"calculateLazyLayoutPinnedIndices", "", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List<Integer> calculateLazyLayoutPinnedIndices(LazyLayoutItemProvider $this$calculateLazyLayoutPinnedIndices, LazyLayoutPinnedItemList pinnedItemList, LazyLayoutBeyondBoundsInfo beyondBoundsInfo) {
        if (beyondBoundsInfo.hasIntervals() == false) goto L5;
    L8:
        List pinnedItems = new ArrayList();
        if (beyondBoundsInfo.hasIntervals() == false) goto L11;
        IntRange beyondBoundsRange = new IntRange(beyondBoundsInfo.getStart(), Math.min(beyondBoundsInfo.getEnd(), $this$calculateLazyLayoutPinnedIndices.getItemCount() - 1));
    L12:
        LazyLayoutPinnedItemList $this$fastForEach$iv = pinnedItemList;
        int index$iv = 0;
        int r6 = $this$fastForEach$iv.size();
    L13:
        if (index$iv >= r6) goto L27;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        LazyLayoutPinnedItemList.PinnedItem it = (LazyLayoutPinnedItemList.PinnedItem) item$iv;
        int index = LazyLayoutItemProviderKt.findIndexByKey($this$calculateLazyLayoutPinnedIndices, it.getKey(), it.getIndex());
        int r11 = beyondBoundsRange.getFirst();
        boolean r13 = false;
        if (index > beyondBoundsRange.getLast()) goto L18;
        if (r11 > index) goto L18;
        boolean r12 = true;
    L19:
        if (r12 == true) goto L26;
        if (index >= 0) goto L22;
    L24:
        if (r13 == false) goto L26;
        pinnedItems.add(Integer.valueOf(index));
        goto L26
    L22:
        if (index >= $this$calculateLazyLayoutPinnedIndices.getItemCount()) goto L24;
        r13 = true;
    L26:
        index$iv = index$iv + 1;
    L18:
        r12 = false;
        goto L19
    L27:
        int i = beyondBoundsRange.getFirst();
        int r3 = beyondBoundsRange.getLast();
        if (i > r3) goto L32;
    L29:
        pinnedItems.add(Integer.valueOf(i));
        if (i == r3) goto L32;
        i = i + 1;
    L32:
        return pinnedItems;
    L11:
        beyondBoundsRange = IntRange.Companion.getEMPTY();
        goto L12
    L5:
        if (pinnedItemList.isEmpty() == false) goto L8;
        return CollectionsKt.emptyList();
    }
}
