package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LazyGridMeasuredLineProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ%\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0007H&¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "", "isVertical", "", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "gridItemsCount", "", "spaceBetweenLines", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "(ZLandroidx/compose/foundation/lazy/grid/LazyGridSlots;IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)V", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "startSlot", "span", "childConstraints-JhjzzOo$foundation_release", "(II)J", "createLine", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "index", "items", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "mainAxisSpacing", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Ljava/util/List;I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getAndMeasure", "lineIndex", "spanOf", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LazyGridMeasuredLineProvider {
    public static final int $stable = 0;
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyGridMeasuredItemProvider measuredItemProvider;
    private final LazyGridSlots slots;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    static {
        $stable = 8;
    }

    public abstract LazyGridMeasuredLine createLine(int r1, LazyGridMeasuredItem[] r2, List<GridItemSpan> r3, int r4);

    public LazyGridMeasuredLineProvider(boolean isVertical, LazyGridSlots slots, int gridItemsCount, int spaceBetweenLines, LazyGridMeasuredItemProvider measuredItemProvider, LazyGridSpanLayoutProvider spanLayoutProvider) {
        this.isVertical = isVertical;
        this.slots = slots;
        this.gridItemsCount = gridItemsCount;
        this.spaceBetweenLines = spaceBetweenLines;
        this.measuredItemProvider = measuredItemProvider;
        this.spanLayoutProvider = spanLayoutProvider;
    }

    /* JADX INFO: renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m873childConstraintsJhjzzOo$foundation_release(int startSlot, int span) {
        LazyGridSlots r0 = this.slots;
        if (span != 1) goto L5;
        int r1 = r0.getSizes()[startSlot];
    L6:
        int crossAxisSize = RangesKt.coerceAtLeast(r1, 0);
        if (this.isVertical == false) goto L10;
        return Constraints.Companion.m6938fixedWidthOenEA2s(crossAxisSize);
    L10:
        return Constraints.Companion.m6937fixedHeightOenEA2s(crossAxisSize);
    L5:
        int endSlot = (startSlot + span) - 1;
        r1 = (r0.getPositions()[endSlot] + this.slots.getSizes()[endSlot]) - this.slots.getPositions()[startSlot];
        goto L6
    }

    public final int spanOf(int index) {
        return this.spanLayoutProvider.spanOf(index, this.spanLayoutProvider.getSlotsPerLine());
    }

    public final LazyGridMeasuredLine getAndMeasure(int lineIndex) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(lineIndex);
        int lineItemsCount = lineConfiguration.getSpans().size();
        int r2 = 0;
        if (lineItemsCount != 0) goto L5;
    L8:
        int r3 = 0;
    L9:
        int mainAxisSpacing = r3;
        LazyGridMeasuredItem[] items = new LazyGridMeasuredItem[lineItemsCount];
        int startSlot = 0;
    L10:
        if (r2 >= lineItemsCount) goto L13;
        int span = GridItemSpan.m850getCurrentLineSpanimpl(lineConfiguration.getSpans().get(r2).m853unboximpl());
        long constraints = m873childConstraintsJhjzzOo$foundation_release(startSlot, span);
        LazyGridMeasuredItem r4 = this.measuredItemProvider.m872getAndMeasurem8Kt_7k(lineConfiguration.getFirstItemIndex() + r2, constraints, startSlot, span, mainAxisSpacing);
        startSlot = startSlot + span;
        Unit r5 = Unit.INSTANCE;
        items[r2] = r4;
        r2 = r2 + 1;
        goto L10
    L13:
        return createLine(lineIndex, items, lineConfiguration.getSpans(), mainAxisSpacing);
    L5:
        if ((lineConfiguration.getFirstItemIndex() + lineItemsCount) == this.gridItemsCount) goto L8;
        r3 = this.spaceBetweenLines;
        goto L9
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.measuredItemProvider.getKeyIndexMap();
    }
}
