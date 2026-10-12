package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.IntOffset;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LazyLayoutMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u001aD\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\bH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"LazyLayoutMeasuredItemIndexComparator", "Ljava/util/Comparator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "mainAxisOffset", "", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "updatedVisibleItems", "", "T", "firstVisibleIndex", "lastVisibleIndex", "positionedItems", "stickingItems", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutMeasuredItemKt {
    private static final Comparator<LazyLayoutMeasuredItem> LazyLayoutMeasuredItemIndexComparator = null;

    public static final <T extends LazyLayoutMeasuredItem> List<T> updatedVisibleItems(int firstVisibleIndex, int lastVisibleIndex, List<? extends T> r12, List<? extends T> r13) {
        if (r12.isEmpty() == true) goto L5;
        List<T> finalVisibleItems = CollectionsKt.toMutableList(r13);
        int index$iv = 0;
        int r4 = r12.size();
    L7:
        if (index$iv >= r4) goto L15;
        T item$iv = r12.get(index$iv);
        T r6 = item$iv;
        int r8 = r6.getIndex();
        boolean r9 = false;
        if (firstVisibleIndex > r8) goto L12;
        if (r8 > lastVisibleIndex) goto L12;
        r9 = true;
    L12:
        if (r9 == false) goto L14;
        finalVisibleItems.add(r6);
    L14:
        index$iv = index$iv + 1;
        goto L7
    L15:
        CollectionsKt.sortWith(finalVisibleItems, LazyLayoutMeasuredItemIndexComparator);
        return finalVisibleItems;
    L5:
        return CollectionsKt.emptyList();
    }

    private static final int getMainAxisOffset(LazyLayoutMeasuredItem $this$mainAxisOffset) {
        long it = $this$mainAxisOffset.mo839getOffsetBjo55l4(0);
        if ($this$mainAxisOffset.isVertical() == false) goto L6;
        return IntOffset.m7102getYimpl(it);
    L6:
        return IntOffset.m7101getXimpl(it);
    }

    static {
        LazyLayoutMeasuredItemIndexComparator = new LazyLayoutMeasuredItemKt$$ExternalSyntheticLambda0();
    }

    static final int LazyLayoutMeasuredItemIndexComparator$lambda$2(LazyLayoutMeasuredItem a, LazyLayoutMeasuredItem b) {
        return Intrinsics.compare(a.getIndex(), b.getIndex());
    }
}
