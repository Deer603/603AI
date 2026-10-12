package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u000e\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u0010\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u0011\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "()V", "HorizontalMaxHeight", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "availableWidth", "mainAxisSpacing", "HorizontalMaxWidth", "availableHeight", "HorizontalMinHeight", "HorizontalMinWidth", "VerticalMaxHeight", "VerticalMaxWidth", "VerticalMinHeight", "VerticalMinWidth", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntrinsicMeasureBlocks {
    public static final int $stable = 0;
    public static final IntrinsicMeasureBlocks INSTANCE = null;

    static {
        INSTANCE = new IntrinsicMeasureBlocks();
    }

    private IntrinsicMeasureBlocks() {
    }

    public final int HorizontalMinWidth(List<? extends IntrinsicMeasurable> r18, int availableHeight, int mainAxisSpacing) {
        if (r18.isEmpty() == true) goto L24;
        int weightUnitSpace$iv = 0;
        int fixedSpace$iv = 0;
        float totalWeight$iv = 0.0f;
        int index$iv$iv = 0;
        int r8 = r18.size();
    L6:
        boolean r9 = true;
        if (index$iv$iv >= r8) goto L18;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable child$iv = (IntrinsicMeasurable) item$iv$iv;
        float weight$iv = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv));
        int size$iv = child$iv.minIntrinsicWidth(availableHeight);
        if (weight$iv == 0.0f) goto L12;
        r9 = false;
    L12:
        if (r9 == false) goto L15;
        fixedSpace$iv = fixedSpace$iv + size$iv;
    L17:
        index$iv$iv = index$iv$iv + 1;
        goto L6
    L15:
        if (weight$iv <= 0.0f) goto L17;
        totalWeight$iv = totalWeight$iv + weight$iv;
        float $this$fastRoundToInt$iv$iv = size$iv / weight$iv;
        weightUnitSpace$iv = Math.max(weightUnitSpace$iv, Math.round($this$fastRoundToInt$iv$iv));
        goto L17
    L18:
        float $this$fastRoundToInt$iv$iv2 = weightUnitSpace$iv * totalWeight$iv;
        return (Math.round($this$fastRoundToInt$iv$iv2) + fixedSpace$iv) + ((r18.size() - 1) * mainAxisSpacing);
    L24:
        return 0;
    }

    public final int VerticalMinWidth(List<? extends IntrinsicMeasurable> r20, int availableHeight, int mainAxisSpacing) {
        if (r20.isEmpty() == false) goto L5;
        return 0;
    L5:
        boolean r5 = true;
        int fixedSpace$iv = Math.min((r20.size() - 1) * mainAxisSpacing, availableHeight);
        int crossAxisMax$iv = 0;
        float totalWeight$iv = 0.0f;
        int index$iv$iv = 0;
        int r10 = r20.size();
    L6:
        float r11 = 0.0f;
        int remaining$iv = Integer.MAX_VALUE;
        if (index$iv$iv >= r10) goto L22;
        Object item$iv$iv = r20.get(index$iv$iv);
        IntrinsicMeasurable child$iv = (IntrinsicMeasurable) item$iv$iv;
        float weight$iv = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv));
        if (weight$iv != 0.0f) goto L11;
        boolean r17 = r5;
    L12:
        if (r17 == false) goto L18;
        if (availableHeight == Integer.MAX_VALUE) goto L16;
        remaining$iv = availableHeight - fixedSpace$iv;
    L16:
        int mainAxisSpace$iv = Math.min(child$iv.maxIntrinsicHeight(Integer.MAX_VALUE), remaining$iv);
        fixedSpace$iv = fixedSpace$iv + mainAxisSpace$iv;
        crossAxisMax$iv = Math.max(crossAxisMax$iv, child$iv.minIntrinsicWidth(mainAxisSpace$iv));
    L20:
        index$iv$iv = index$iv$iv + 1;
        r5 = true;
        goto L6
    L18:
        if (weight$iv <= 0.0f) goto L20;
        totalWeight$iv = totalWeight$iv + weight$iv;
        goto L20
    L11:
        r17 = false;
        goto L12
    L22:
        if (totalWeight$iv != 0.0f) goto L24;
        boolean r6 = true;
    L25:
        if (r6 == false) goto L27;
        int weightUnitSpace$iv = 0;
    L30:
        int index$iv$iv2 = 0;
        int r9 = r20.size();
    L31:
        if (index$iv$iv2 >= r9) goto L39;
        Object item$iv$iv2 = r20.get(index$iv$iv2);
        IntrinsicMeasurable child$iv2 = (IntrinsicMeasurable) item$iv$iv2;
        float weight$iv2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv2));
        if (weight$iv2 <= r11) goto L38;
        if (weightUnitSpace$iv == remaining$iv) goto L36;
        float $this$fastRoundToInt$iv$iv = weightUnitSpace$iv * weight$iv2;
        int h = Math.round($this$fastRoundToInt$iv$iv);
    L37:
        crossAxisMax$iv = Math.max(crossAxisMax$iv, child$iv2.minIntrinsicWidth(h));
        goto L38
    L36:
        h = remaining$iv;
    L38:
        index$iv$iv2 = index$iv$iv2 + 1;
        r11 = 0.0f;
        remaining$iv = Integer.MAX_VALUE;
        goto L31
    L39:
        int weightUnitSpace$iv2 = crossAxisMax$iv;
        return weightUnitSpace$iv2;
    L27:
        if (availableHeight != Integer.MAX_VALUE) goto L29;
        weightUnitSpace$iv = Integer.MAX_VALUE;
        goto L30
    L29:
        float $this$fastRoundToInt$iv$iv2 = Math.max(availableHeight - fixedSpace$iv, 0) / totalWeight$iv;
        weightUnitSpace$iv = Math.round($this$fastRoundToInt$iv$iv2);
        goto L30
    L24:
        r6 = false;
        goto L25
    }

    public final int HorizontalMinHeight(List<? extends IntrinsicMeasurable> r20, int availableWidth, int mainAxisSpacing) {
        if (r20.isEmpty() == false) goto L5;
        return 0;
    L5:
        boolean r5 = true;
        int fixedSpace$iv = Math.min((r20.size() - 1) * mainAxisSpacing, availableWidth);
        int crossAxisMax$iv = 0;
        float totalWeight$iv = 0.0f;
        int index$iv$iv = 0;
        int r10 = r20.size();
    L6:
        float r11 = 0.0f;
        int remaining$iv = Integer.MAX_VALUE;
        if (index$iv$iv >= r10) goto L22;
        Object item$iv$iv = r20.get(index$iv$iv);
        IntrinsicMeasurable child$iv = (IntrinsicMeasurable) item$iv$iv;
        float weight$iv = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv));
        if (weight$iv != 0.0f) goto L11;
        boolean r17 = r5;
    L12:
        if (r17 == false) goto L18;
        if (availableWidth == Integer.MAX_VALUE) goto L16;
        remaining$iv = availableWidth - fixedSpace$iv;
    L16:
        int mainAxisSpace$iv = Math.min(child$iv.maxIntrinsicWidth(Integer.MAX_VALUE), remaining$iv);
        fixedSpace$iv = fixedSpace$iv + mainAxisSpace$iv;
        crossAxisMax$iv = Math.max(crossAxisMax$iv, child$iv.minIntrinsicHeight(mainAxisSpace$iv));
    L20:
        index$iv$iv = index$iv$iv + 1;
        r5 = true;
        goto L6
    L18:
        if (weight$iv <= 0.0f) goto L20;
        totalWeight$iv = totalWeight$iv + weight$iv;
        goto L20
    L11:
        r17 = false;
        goto L12
    L22:
        if (totalWeight$iv != 0.0f) goto L24;
        boolean r6 = true;
    L25:
        if (r6 == false) goto L27;
        int weightUnitSpace$iv = 0;
    L30:
        int index$iv$iv2 = 0;
        int r9 = r20.size();
    L31:
        if (index$iv$iv2 >= r9) goto L39;
        Object item$iv$iv2 = r20.get(index$iv$iv2);
        IntrinsicMeasurable child$iv2 = (IntrinsicMeasurable) item$iv$iv2;
        float weight$iv2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv2));
        if (weight$iv2 <= r11) goto L38;
        if (weightUnitSpace$iv == remaining$iv) goto L36;
        float $this$fastRoundToInt$iv$iv = weightUnitSpace$iv * weight$iv2;
        int w = Math.round($this$fastRoundToInt$iv$iv);
    L37:
        crossAxisMax$iv = Math.max(crossAxisMax$iv, child$iv2.minIntrinsicHeight(w));
        goto L38
    L36:
        w = remaining$iv;
    L38:
        index$iv$iv2 = index$iv$iv2 + 1;
        r11 = 0.0f;
        remaining$iv = Integer.MAX_VALUE;
        goto L31
    L39:
        int weightUnitSpace$iv2 = crossAxisMax$iv;
        return weightUnitSpace$iv2;
    L27:
        if (availableWidth != Integer.MAX_VALUE) goto L29;
        weightUnitSpace$iv = Integer.MAX_VALUE;
        goto L30
    L29:
        float $this$fastRoundToInt$iv$iv2 = Math.max(availableWidth - fixedSpace$iv, 0) / totalWeight$iv;
        weightUnitSpace$iv = Math.round($this$fastRoundToInt$iv$iv2);
        goto L30
    L24:
        r6 = false;
        goto L25
    }

    public final int VerticalMinHeight(List<? extends IntrinsicMeasurable> r18, int availableWidth, int mainAxisSpacing) {
        if (r18.isEmpty() == true) goto L24;
        int weightUnitSpace$iv = 0;
        int fixedSpace$iv = 0;
        float totalWeight$iv = 0.0f;
        int index$iv$iv = 0;
        int r8 = r18.size();
    L6:
        boolean r9 = true;
        if (index$iv$iv >= r8) goto L18;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable child$iv = (IntrinsicMeasurable) item$iv$iv;
        float weight$iv = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv));
        int size$iv = child$iv.minIntrinsicHeight(availableWidth);
        if (weight$iv == 0.0f) goto L12;
        r9 = false;
    L12:
        if (r9 == false) goto L15;
        fixedSpace$iv = fixedSpace$iv + size$iv;
    L17:
        index$iv$iv = index$iv$iv + 1;
        goto L6
    L15:
        if (weight$iv <= 0.0f) goto L17;
        totalWeight$iv = totalWeight$iv + weight$iv;
        float $this$fastRoundToInt$iv$iv = size$iv / weight$iv;
        weightUnitSpace$iv = Math.max(weightUnitSpace$iv, Math.round($this$fastRoundToInt$iv$iv));
        goto L17
    L18:
        float $this$fastRoundToInt$iv$iv2 = weightUnitSpace$iv * totalWeight$iv;
        return (Math.round($this$fastRoundToInt$iv$iv2) + fixedSpace$iv) + ((r18.size() - 1) * mainAxisSpacing);
    L24:
        return 0;
    }

    public final int HorizontalMaxWidth(List<? extends IntrinsicMeasurable> r18, int availableHeight, int mainAxisSpacing) {
        if (r18.isEmpty() == true) goto L24;
        int weightUnitSpace$iv = 0;
        int fixedSpace$iv = 0;
        float totalWeight$iv = 0.0f;
        int index$iv$iv = 0;
        int r8 = r18.size();
    L6:
        boolean r9 = true;
        if (index$iv$iv >= r8) goto L18;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable child$iv = (IntrinsicMeasurable) item$iv$iv;
        float weight$iv = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv));
        int size$iv = child$iv.maxIntrinsicWidth(availableHeight);
        if (weight$iv == 0.0f) goto L12;
        r9 = false;
    L12:
        if (r9 == false) goto L15;
        fixedSpace$iv = fixedSpace$iv + size$iv;
    L17:
        index$iv$iv = index$iv$iv + 1;
        goto L6
    L15:
        if (weight$iv <= 0.0f) goto L17;
        totalWeight$iv = totalWeight$iv + weight$iv;
        float $this$fastRoundToInt$iv$iv = size$iv / weight$iv;
        weightUnitSpace$iv = Math.max(weightUnitSpace$iv, Math.round($this$fastRoundToInt$iv$iv));
        goto L17
    L18:
        float $this$fastRoundToInt$iv$iv2 = weightUnitSpace$iv * totalWeight$iv;
        return (Math.round($this$fastRoundToInt$iv$iv2) + fixedSpace$iv) + ((r18.size() - 1) * mainAxisSpacing);
    L24:
        return 0;
    }

    public final int VerticalMaxWidth(List<? extends IntrinsicMeasurable> r20, int availableHeight, int mainAxisSpacing) {
        if (r20.isEmpty() == false) goto L5;
        return 0;
    L5:
        boolean r5 = true;
        int fixedSpace$iv = Math.min((r20.size() - 1) * mainAxisSpacing, availableHeight);
        int crossAxisMax$iv = 0;
        float totalWeight$iv = 0.0f;
        int index$iv$iv = 0;
        int r10 = r20.size();
    L6:
        float r11 = 0.0f;
        int remaining$iv = Integer.MAX_VALUE;
        if (index$iv$iv >= r10) goto L22;
        Object item$iv$iv = r20.get(index$iv$iv);
        IntrinsicMeasurable child$iv = (IntrinsicMeasurable) item$iv$iv;
        float weight$iv = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv));
        if (weight$iv != 0.0f) goto L11;
        boolean r17 = r5;
    L12:
        if (r17 == false) goto L18;
        if (availableHeight == Integer.MAX_VALUE) goto L16;
        remaining$iv = availableHeight - fixedSpace$iv;
    L16:
        int mainAxisSpace$iv = Math.min(child$iv.maxIntrinsicHeight(Integer.MAX_VALUE), remaining$iv);
        fixedSpace$iv = fixedSpace$iv + mainAxisSpace$iv;
        crossAxisMax$iv = Math.max(crossAxisMax$iv, child$iv.maxIntrinsicWidth(mainAxisSpace$iv));
    L20:
        index$iv$iv = index$iv$iv + 1;
        r5 = true;
        goto L6
    L18:
        if (weight$iv <= 0.0f) goto L20;
        totalWeight$iv = totalWeight$iv + weight$iv;
        goto L20
    L11:
        r17 = false;
        goto L12
    L22:
        if (totalWeight$iv != 0.0f) goto L24;
        boolean r6 = true;
    L25:
        if (r6 == false) goto L27;
        int weightUnitSpace$iv = 0;
    L30:
        int index$iv$iv2 = 0;
        int r9 = r20.size();
    L31:
        if (index$iv$iv2 >= r9) goto L39;
        Object item$iv$iv2 = r20.get(index$iv$iv2);
        IntrinsicMeasurable child$iv2 = (IntrinsicMeasurable) item$iv$iv2;
        float weight$iv2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv2));
        if (weight$iv2 <= r11) goto L38;
        if (weightUnitSpace$iv == remaining$iv) goto L36;
        float $this$fastRoundToInt$iv$iv = weightUnitSpace$iv * weight$iv2;
        int h = Math.round($this$fastRoundToInt$iv$iv);
    L37:
        crossAxisMax$iv = Math.max(crossAxisMax$iv, child$iv2.maxIntrinsicWidth(h));
        goto L38
    L36:
        h = remaining$iv;
    L38:
        index$iv$iv2 = index$iv$iv2 + 1;
        r11 = 0.0f;
        remaining$iv = Integer.MAX_VALUE;
        goto L31
    L39:
        int weightUnitSpace$iv2 = crossAxisMax$iv;
        return weightUnitSpace$iv2;
    L27:
        if (availableHeight != Integer.MAX_VALUE) goto L29;
        weightUnitSpace$iv = Integer.MAX_VALUE;
        goto L30
    L29:
        float $this$fastRoundToInt$iv$iv2 = Math.max(availableHeight - fixedSpace$iv, 0) / totalWeight$iv;
        weightUnitSpace$iv = Math.round($this$fastRoundToInt$iv$iv2);
        goto L30
    L24:
        r6 = false;
        goto L25
    }

    public final int HorizontalMaxHeight(List<? extends IntrinsicMeasurable> r20, int availableWidth, int mainAxisSpacing) {
        if (r20.isEmpty() == false) goto L5;
        return 0;
    L5:
        boolean r5 = true;
        int fixedSpace$iv = Math.min((r20.size() - 1) * mainAxisSpacing, availableWidth);
        int crossAxisMax$iv = 0;
        float totalWeight$iv = 0.0f;
        int index$iv$iv = 0;
        int r10 = r20.size();
    L6:
        float r11 = 0.0f;
        int remaining$iv = Integer.MAX_VALUE;
        if (index$iv$iv >= r10) goto L22;
        Object item$iv$iv = r20.get(index$iv$iv);
        IntrinsicMeasurable child$iv = (IntrinsicMeasurable) item$iv$iv;
        float weight$iv = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv));
        if (weight$iv != 0.0f) goto L11;
        boolean r17 = r5;
    L12:
        if (r17 == false) goto L18;
        if (availableWidth == Integer.MAX_VALUE) goto L16;
        remaining$iv = availableWidth - fixedSpace$iv;
    L16:
        int mainAxisSpace$iv = Math.min(child$iv.maxIntrinsicWidth(Integer.MAX_VALUE), remaining$iv);
        fixedSpace$iv = fixedSpace$iv + mainAxisSpace$iv;
        crossAxisMax$iv = Math.max(crossAxisMax$iv, child$iv.maxIntrinsicHeight(mainAxisSpace$iv));
    L20:
        index$iv$iv = index$iv$iv + 1;
        r5 = true;
        goto L6
    L18:
        if (weight$iv <= 0.0f) goto L20;
        totalWeight$iv = totalWeight$iv + weight$iv;
        goto L20
    L11:
        r17 = false;
        goto L12
    L22:
        if (totalWeight$iv != 0.0f) goto L24;
        boolean r6 = true;
    L25:
        if (r6 == false) goto L27;
        int weightUnitSpace$iv = 0;
    L30:
        int index$iv$iv2 = 0;
        int r9 = r20.size();
    L31:
        if (index$iv$iv2 >= r9) goto L39;
        Object item$iv$iv2 = r20.get(index$iv$iv2);
        IntrinsicMeasurable child$iv2 = (IntrinsicMeasurable) item$iv$iv2;
        float weight$iv2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv2));
        if (weight$iv2 <= r11) goto L38;
        if (weightUnitSpace$iv == remaining$iv) goto L36;
        float $this$fastRoundToInt$iv$iv = weightUnitSpace$iv * weight$iv2;
        int w = Math.round($this$fastRoundToInt$iv$iv);
    L37:
        crossAxisMax$iv = Math.max(crossAxisMax$iv, child$iv2.maxIntrinsicHeight(w));
        goto L38
    L36:
        w = remaining$iv;
    L38:
        index$iv$iv2 = index$iv$iv2 + 1;
        r11 = 0.0f;
        remaining$iv = Integer.MAX_VALUE;
        goto L31
    L39:
        int weightUnitSpace$iv2 = crossAxisMax$iv;
        return weightUnitSpace$iv2;
    L27:
        if (availableWidth != Integer.MAX_VALUE) goto L29;
        weightUnitSpace$iv = Integer.MAX_VALUE;
        goto L30
    L29:
        float $this$fastRoundToInt$iv$iv2 = Math.max(availableWidth - fixedSpace$iv, 0) / totalWeight$iv;
        weightUnitSpace$iv = Math.round($this$fastRoundToInt$iv$iv2);
        goto L30
    L24:
        r6 = false;
        goto L25
    }

    public final int VerticalMaxHeight(List<? extends IntrinsicMeasurable> r18, int availableWidth, int mainAxisSpacing) {
        if (r18.isEmpty() == true) goto L24;
        int weightUnitSpace$iv = 0;
        int fixedSpace$iv = 0;
        float totalWeight$iv = 0.0f;
        int index$iv$iv = 0;
        int r8 = r18.size();
    L6:
        boolean r9 = true;
        if (index$iv$iv >= r8) goto L18;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable child$iv = (IntrinsicMeasurable) item$iv$iv;
        float weight$iv = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(child$iv));
        int size$iv = child$iv.maxIntrinsicHeight(availableWidth);
        if (weight$iv == 0.0f) goto L12;
        r9 = false;
    L12:
        if (r9 == false) goto L15;
        fixedSpace$iv = fixedSpace$iv + size$iv;
    L17:
        index$iv$iv = index$iv$iv + 1;
        goto L6
    L15:
        if (weight$iv <= 0.0f) goto L17;
        totalWeight$iv = totalWeight$iv + weight$iv;
        float $this$fastRoundToInt$iv$iv = size$iv / weight$iv;
        weightUnitSpace$iv = Math.max(weightUnitSpace$iv, Math.round($this$fastRoundToInt$iv$iv));
        goto L17
    L18:
        float $this$fastRoundToInt$iv$iv2 = weightUnitSpace$iv * totalWeight$iv;
        return (Math.round($this$fastRoundToInt$iv$iv2) + fixedSpace$iv) + ((r18.size() - 1) * mainAxisSpacing);
    L24:
        return 0;
    }
}
