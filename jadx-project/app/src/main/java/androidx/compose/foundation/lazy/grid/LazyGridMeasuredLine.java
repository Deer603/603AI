package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LazyGridMeasuredLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0019\u001a\u00020\rJ)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "index", "", "items", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "isVertical", "", "mainAxisSpacing", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Landroidx/compose/foundation/lazy/grid/LazyGridSlots;Ljava/util/List;ZI)V", "getIndex", "()I", "getItems", "()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "isEmpty", "position", "offset", "layoutWidth", "layoutHeight", "(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyGridMeasuredLine {
    public static final int $stable = 0;
    private final int index;
    private final boolean isVertical;
    private final LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final LazyGridSlots slots;
    private final List<GridItemSpan> spans;

    static {
        $stable = 8;
    }

    public LazyGridMeasuredLine(int index, LazyGridMeasuredItem[] items, LazyGridSlots slots, List<GridItemSpan> r20, boolean isVertical, int mainAxisSpacing) {
        this.index = index;
        this.items = items;
        this.slots = slots;
        this.spans = r20;
        this.isVertical = isVertical;
        this.mainAxisSpacing = mainAxisSpacing;
        int maxMainAxis = 0;
        LazyGridMeasuredItem[] r8 = this.items;
        int r10 = r8.length;
        int r12 = 0;
    L3:
        if (r12 >= r10) goto L5;
        maxMainAxis = Math.max(maxMainAxis, r8[r12].getMainAxisSize());
        r12 = r12 + 1;
        goto L3
    L5:
        this.mainAxisSize = maxMainAxis;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(this.mainAxisSpacing + maxMainAxis, 0);
    }

    public final int getIndex() {
        return this.index;
    }

    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        if (this.items.length != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final LazyGridMeasuredItem[] position(int offset, int layoutWidth, int layoutHeight) {
        int usedSpan = 0;
        LazyGridMeasuredItem[] r2 = this.items;
        int index$iv = 0;
        int r5 = r2.length;
        int r6 = 0;
    L3:
        if (r6 >= r5) goto L14;
        LazyGridMeasuredItem r7 = r2[r6];
        int index$iv2 = index$iv + 1;
        int span = GridItemSpan.m850getCurrentLineSpanimpl(this.spans.get(index$iv).m853unboximpl());
        int startSlot = usedSpan;
        int r11 = this.slots.getPositions()[startSlot];
        if (this.isVertical == false) goto L7;
        int r14 = this.index;
    L9:
        if (this.isVertical == false) goto L11;
        int r15 = startSlot;
    L12:
        r7.position(offset, r11, layoutWidth, layoutHeight, r14, r15);
        Unit r10 = Unit.INSTANCE;
        usedSpan = usedSpan + span;
        r6 = r6 + 1;
        index$iv = index$iv2;
        goto L3
    L11:
        r15 = this.index;
        goto L12
    L7:
        r14 = startSlot;
        goto L9
    L14:
        return this.items;
    }
}
