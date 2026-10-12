package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0002J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u000fJ\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "()V", "anchor", "", "lanes", "", "spannedItems", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "assignedToLane", "", "itemIndex", "targetLane", "ensureCapacity", "", "capacity", "newOffset", "ensureValidIndex", "requestedIndex", "findNextItemIndex", "findPreviousItemIndex", "getGaps", "getLane", "lowerBound", "reset", "setGaps", "gaps", "setLane", "lane", "upperBound", "Companion", "SpannedItem", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridLaneInfo {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    public static final int FullSpan = -2;
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;
    private int[] lanes;
    private final ArrayDeque<SpannedItem> spannedItems;

    /* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$Companion;", "", "()V", "FullSpan", "", "MaxCapacity", "Unset", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "", "index", "", "gaps", "", "(I[I)V", "getGaps", "()[I", "setGaps", "([I)V", "getIndex", "()I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SpannedItem {
        private int[] gaps;
        private final int index;

        public SpannedItem(int index, int[] gaps) {
            this.index = index;
            this.gaps = gaps;
        }

        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(int[] r1) {
            this.gaps = r1;
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public LazyStaggeredGridLaneInfo() {
        this.lanes = new int[16];
        this.spannedItems = new ArrayDeque();
    }

    public final void setLane(int itemIndex, int lane) {
        if (itemIndex < 0) goto L4;
        boolean value$iv = true;
    L6:
        if (value$iv == true) goto L8;
        InlineClassHelperKt.throwIllegalArgumentException("Negative lanes are not supported");
    L8:
        ensureValidIndex(itemIndex);
        this.lanes[itemIndex - this.anchor] = lane + 1;
        return;
    L4:
        value$iv = false;
        goto L6
    }

    public final int getLane(int itemIndex) {
        if (itemIndex >= lowerBound()) goto L5;
        return -1;
    L5:
        if (itemIndex < upperBound()) goto L8;
        return -1;
    L8:
        return this.lanes[itemIndex - this.anchor] - 1;
    }

    public final boolean assignedToLane(int itemIndex, int targetLane) {
        int lane = getLane(itemIndex);
        if (lane != targetLane) goto L5;
    L10:
        return true;
    L5:
        if (lane == (-1)) goto L10;
        if (lane == (-2)) goto L10;
        return false;
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        ArraysKt.fill$default(this.lanes, 0, 0, 0, 6, null);
        this.spannedItems.clear();
    }

    public final int findPreviousItemIndex(int itemIndex, int targetLane) {
        int i = itemIndex - 1;
    L4:
        if ((-1) >= i) goto L9;
        if (assignedToLane(i, targetLane) == true) goto L7;
        i = i - 1;
        goto L4
    L7:
        return i;
    L9:
        return -1;
    }

    public final int findNextItemIndex(int itemIndex, int targetLane) {
        int i = itemIndex + 1;
        int r1 = upperBound();
    L3:
        if (i >= r1) goto L8;
        if (assignedToLane(i, targetLane) == true) goto L6;
        i = i + 1;
        goto L3
    L6:
        return i;
    L8:
        int i2 = upperBound();
        return i2;
    }

    public final void ensureValidIndex(int requestedIndex) {
        int requestedCapacity = requestedIndex - this.anchor;
        if (requestedCapacity < 0) goto L6;
        if (requestedCapacity >= 131072) goto L6;
        boolean r4 = true;
    L8:
        if (r4 == false) goto L10;
        ensureCapacity$default(this, requestedCapacity + 1, 0, 2, null);
    L24:
        if (this.spannedItems.isEmpty() == true) goto L29;
        if (this.spannedItems.first().getIndex() >= lowerBound()) goto L29;
        this.spannedItems.removeFirst();
    L29:
        if (this.spannedItems.isEmpty() == true) goto L33;
        if (this.spannedItems.last().getIndex() <= upperBound()) goto L40;
        this.spannedItems.removeLast();
        goto L29
    L40:
        return;
    L33:
        return;
    L10:
        int oldAnchor = this.anchor;
        this.anchor = Math.max(requestedIndex - (this.lanes.length / 2), 0);
        int delta = this.anchor - oldAnchor;
        int[] r6 = this.lanes;
        if (delta >= 0) goto L13;
        int delta2 = -delta;
        int r7 = r6.length + delta2;
        int[] r8 = this.lanes;
        if (r7 >= 131072) goto L20;
        ensureCapacity((r8.length + delta2) + 1, delta2);
        goto L24
    L20:
        if (delta2 >= r8.length) goto L22;
        ArraysKt.copyInto(this.lanes, this.lanes, delta2, 0, this.lanes.length - delta2);
    L22:
        ArraysKt.fill(this.lanes, 0, 0, Math.min(this.lanes.length, delta2));
        goto L24
    L13:
        if (delta >= r6.length) goto L15;
        ArraysKt.copyInto(this.lanes, this.lanes, 0, delta, this.lanes.length);
    L15:
        ArraysKt.fill(this.lanes, 0, Math.max(0, this.lanes.length - delta), this.lanes.length);
    L6:
        r4 = false;
        goto L8
    }

    public final void setGaps(int itemIndex, int[] gaps) {
        List $this$binarySearchBy_u24default$iv = this.spannedItems;
        final Comparable key$iv = Integer.valueOf(itemIndex);
        int toIndex$iv = $this$binarySearchBy_u24default$iv.size();
        int foundIndex = CollectionsKt.binarySearch($this$binarySearchBy_u24default$iv, 0, toIndex$iv, new LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1(key$iv));
        if (foundIndex >= 0) goto L7;
        if (gaps != null) goto L6;
        return;
    L6:
        int insertionIndex = -(foundIndex + 1);
        this.spannedItems.add(insertionIndex, new SpannedItem(itemIndex, gaps));
        return;
    L7:
        ArrayDeque<SpannedItem> r1 = this.spannedItems;
        if (gaps != null) goto L10;
        r1.remove(foundIndex);
        return;
    L10:
        r1.get(foundIndex).setGaps(gaps);
    }

    public final int[] getGaps(int itemIndex) {
        List $this$binarySearchBy_u24default$iv = this.spannedItems;
        final Comparable key$iv = Integer.valueOf(itemIndex);
        int toIndex$iv = $this$binarySearchBy_u24default$iv.size();
        int foundIndex = CollectionsKt.binarySearch($this$binarySearchBy_u24default$iv, 0, toIndex$iv, new LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(key$iv));
        SpannedItem r1 = (SpannedItem) CollectionsKt.getOrNull(this.spannedItems, foundIndex);
        if (r1 != null) goto L7;
        return null;
    L7:
        return r1.getGaps();
    }

    static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        r0.ensureCapacity(r1, r2);
    }

    private final void ensureCapacity(int capacity, int newOffset) {
        if (capacity > 131072) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("Requested item capacity " + capacity + " is larger than max supported: 131072!");
    L10:
        if (this.lanes.length >= capacity) goto L16;
        int newSize = this.lanes.length;
    L12:
        if (newSize >= capacity) goto L14;
        newSize = newSize * 2;
        goto L12
    L14:
        this.lanes = ArraysKt.copyInto$default(this.lanes, new int[newSize], newOffset, 0, 0, 12, null);
        return;
    L16:
        return;
    L5:
        value$iv = false;
        goto L7
    }
}
