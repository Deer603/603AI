package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

/* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, d2 = {"calculateCellsCrossAxisSizeImpl", "", "gridSize", "", "slotCount", "spacing", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridCellsKt {
    public static final /* synthetic */ int[] access$calculateCellsCrossAxisSizeImpl(int gridSize, int slotCount, int spacing) {
        return calculateCellsCrossAxisSizeImpl(gridSize, slotCount, spacing);
    }

    private static final int[] calculateCellsCrossAxisSizeImpl(int gridSize, int slotCount, int spacing) {
        int gridSizeWithoutSpacing = gridSize - ((slotCount - 1) * spacing);
        int slotSize = gridSizeWithoutSpacing / slotCount;
        int remainingPixels = gridSizeWithoutSpacing % slotCount;
        int[] r3 = new int[slotCount];
        int r5 = 0;
    L3:
        if (r5 >= slotCount) goto L11;
        if (slotSize >= 0) goto L6;
        int r6 = 0;
    L10:
        r3[r5] = r6;
        r5 = r5 + 1;
        goto L3
    L6:
        if (r5 >= remainingPixels) goto L8;
        int r7 = 1;
    L9:
        r6 = r7 + slotSize;
        goto L10
    L8:
        r7 = 0;
        goto L9
    L11:
        return r3;
    }
}
