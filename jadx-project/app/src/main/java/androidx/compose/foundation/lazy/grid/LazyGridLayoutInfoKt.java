package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyGridLayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"visibleLinesAverageMainAxisSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridLayoutInfoKt {
    public static final int visibleLinesAverageMainAxisSize(LazyGridLayoutInfo $this$visibleLinesAverageMainAxisSize) {
        LazyGridLayoutInfo r0 = $this$visibleLinesAverageMainAxisSize;
        if (r0.getOrientation() != Orientation.Vertical) goto L5;
        boolean isVertical = true;
    L6:
        List<LazyGridItemInfo> r2 = r0.getVisibleItemsInfo();
        int totalLinesMainAxisSize = 0;
        int linesCount = 0;
        int lineStartIndex = 0;
    L8:
        if (lineStartIndex >= r2.size()) goto L23;
        int currentLine = visibleLinesAverageMainAxisSize$lineOf(isVertical, r0, lineStartIndex);
        if (currentLine == (-1)) goto L11;
        int lineMainAxisSize = 0;
        int lineEndIndex = lineStartIndex;
    L14:
        if (lineEndIndex >= r2.size()) goto L21;
        if (visibleLinesAverageMainAxisSize$lineOf(isVertical, r0, lineEndIndex) != currentLine) goto L21;
        if (isVertical == false) goto L19;
        long arg0$iv = r2.get(lineEndIndex).mo865getSizeYbymL2g();
        int r1 = (int) (arg0$iv & 4294967295L);
    L20:
        lineMainAxisSize = Math.max(lineMainAxisSize, r1);
        lineEndIndex = lineEndIndex + 1;
        r0 = $this$visibleLinesAverageMainAxisSize;
        isVertical = isVertical;
        goto L14
    L19:
        long arg0$iv2 = r2.get(lineEndIndex).mo865getSizeYbymL2g();
        r1 = (int) (arg0$iv2 >> 32);
    L21:
        totalLinesMainAxisSize = totalLinesMainAxisSize + lineMainAxisSize;
        linesCount = linesCount + 1;
        lineStartIndex = lineEndIndex;
        r0 = $this$visibleLinesAverageMainAxisSize;
        isVertical = isVertical;
        goto L8
    L11:
        lineStartIndex = lineStartIndex + 1;
        goto L8
    L23:
        return (totalLinesMainAxisSize / linesCount) + $this$visibleLinesAverageMainAxisSize.getMainAxisItemSpacing();
    L5:
        isVertical = false;
        goto L6
    }

    private static final int visibleLinesAverageMainAxisSize$lineOf(boolean isVertical, LazyGridLayoutInfo $this_visibleLinesAverageMainAxisSize, int index) {
        LazyGridItemInfo r0 = $this_visibleLinesAverageMainAxisSize.getVisibleItemsInfo().get(index);
        if (isVertical == false) goto L6;
        return r0.getRow();
    L6:
        return r0.getColumn();
    }
}
