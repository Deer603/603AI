package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: LazyLayoutStickyItems.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b\u001ah\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\b\b\u0000\u0010\u000e*\u00020\u0004*\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u000e0\u0019H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Debug", "", "mainAxisOffset", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "applyStickyItems", "", "T", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "positionedItems", "", "stickyItems", "Landroidx/collection/IntList;", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "getAndMeasure", "Lkotlin/Function1;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutStickyItemsKt {
    private static final boolean Debug = false;

    public static final /* synthetic */ int access$getMainAxisOffset(LazyLayoutMeasuredItem $receiver) {
        return getMainAxisOffset($receiver);
    }

    private static final void debugLog(Function0<String> r1) {
    }

    private static final int getMainAxisOffset(LazyLayoutMeasuredItem $this$mainAxisOffset) {
        long it = $this$mainAxisOffset.mo839getOffsetBjo55l4(0);
        if ($this$mainAxisOffset.isVertical() == false) goto L6;
        return IntOffset.m7102getYimpl(it);
    L6:
        return IntOffset.m7101getXimpl(it);
    }

    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(StickyItemsPlacement $this$applyStickyItems, List<T> r22, IntList stickyItems, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight, Function1<? super Integer, ? extends T> r28) {
        List<T> r9 = r22;
        if ($this$applyStickyItems == null) goto L41;
        if (r9.isEmpty() == true) goto L41;
        if (stickyItems._size == 0) goto L9;
        boolean r1 = true;
    L10:
        if (r1 == false) goto L41;
        IntList stickingItems = $this$applyStickyItems.getStickingIndices(((LazyLayoutMeasuredItem) CollectionsKt.first(r9)).getIndex(), ((LazyLayoutMeasuredItem) CollectionsKt.last(r9)).getIndex(), stickyItems);
        List positionedStickingItems = new ArrayList();
        List target$iv = new ArrayList(r22.size());
        int index$iv$iv = 0;
        int r7 = r22.size();
    L12:
        if (index$iv$iv >= r7) goto L17;
        T r8 = r22.get(index$iv$iv);
        T it = r8;
        if (stickyItems.contains(it.getIndex()) == false) goto L16;
        target$iv.add(r8);
    L16:
        index$iv$iv = index$iv$iv + 1;
        goto L12
    L17:
        List visibleStickyItems = target$iv;
        int[] content$iv = stickingItems.content;
        int i$iv = 0;
        int r4 = stickingItems._size;
    L18:
        if (i$iv >= r4) goto L50;
        int[] content$iv2 = content$iv;
        int stickingIndex = content$iv2[i$iv];
        int index$iv = 0;
        Iterator<T> r17 = r22.iterator();
    L21:
        if (r17.hasNext() == false) goto L29;
        LazyLayoutMeasuredItem item$iv = r17.next();
        LazyLayoutMeasuredItem it2 = item$iv;
        if (it2.getIndex() != stickingIndex) goto L25;
        boolean r12 = true;
    L26:
        if (r12 == true) goto L30;
        index$iv = index$iv + 1;
    L30:
        int itemIndex = index$iv;
        if (itemIndex != (-1)) goto L33;
        T r6 = r28.invoke(Integer.valueOf(stickingIndex));
    L34:
        int i$iv2 = i$iv;
        int i$iv3 = r6.getMainAxisSizeWithSpacings();
        if (itemIndex != (-1)) goto L37;
        int r0 = Integer.MIN_VALUE;
    L38:
        int r18 = r4;
        T r10 = r6;
        int offset = $this$applyStickyItems.calculateStickingItemOffset(visibleStickyItems, stickingIndex, i$iv3, r0, beforeContentPadding, afterContentPadding, layoutWidth, layoutHeight);
        r10.setNonScrollableItem(true);
        r10.position(offset, 0, layoutWidth, layoutHeight);
        positionedStickingItems.add(r10);
        i$iv = i$iv2 + 1;
        r9 = r22;
        content$iv = content$iv2;
        r4 = r18;
        goto L18
    L37:
        r0 = getMainAxisOffset(r6);
        goto L38
    L33:
        r6 = r9.remove(itemIndex);
        goto L34
    L25:
        r12 = false;
        goto L26
    L29:
        index$iv = -1;
        goto L30
    L50:
        return positionedStickingItems;
    L9:
        r1 = false;
    L41:
        return CollectionsKt.emptyList();
    }
}
