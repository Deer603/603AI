package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ae\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u001d\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\b\u001a2\u001d\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\b\u001a2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015H\u0082\b\u001aF\u0010\u001e\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u001d\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\b\u001a2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015H\u0082\b\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u00020\u0006*\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000f\"\u001a\u0010\u0010\u001a\u00020\u0011*\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "fill", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "isRelative", "rowColumnParentData", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getRowColumnParentData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "weight", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "intrinsicCrossAxisSize", "", "children", "", "mainAxisSize", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "intrinsicMainAxisSize", "crossAxisAvailable", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RowColumnImplKt {
    public static final RowColumnParentData getRowColumnParentData(IntrinsicMeasurable $this$rowColumnParentData) {
        Object r0 = $this$rowColumnParentData.getParentData();
        if ((r0 instanceof RowColumnParentData) == true) goto L7;
        return null;
    L7:
        return (RowColumnParentData) r0;
    }

    public static final RowColumnParentData getRowColumnParentData(Placeable $this$rowColumnParentData) {
        Object r0 = $this$rowColumnParentData.getParentData();
        if ((r0 instanceof RowColumnParentData) == true) goto L7;
        return null;
    L7:
        return (RowColumnParentData) r0;
    }

    public static final float getWeight(RowColumnParentData $this$weight) {
        if ($this$weight != null) goto L6;
        return 0.0f;
    L6:
        return $this$weight.getWeight();
    }

    public static final boolean getFill(RowColumnParentData $this$fill) {
        if ($this$fill != null) goto L6;
        return true;
    L6:
        return $this$fill.getFill();
    }

    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData $this$crossAxisAlignment) {
        if ($this$crossAxisAlignment != null) goto L6;
        return null;
    L6:
        return $this$crossAxisAlignment.getCrossAxisAlignment();
    }

    public static final boolean isRelative(RowColumnParentData $this$isRelative) {
        CrossAxisAlignment r0 = getCrossAxisAlignment($this$isRelative);
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.isRelative$foundation_layout_release();
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> r18, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r19, int crossAxisAvailable, int mainAxisSpacing) {
        if (r18.isEmpty() == false) goto L5;
        return 0;
    L5:
        int weightUnitSpace = 0;
        int fixedSpace = 0;
        float totalWeight = 0.0f;
        int index$iv = 0;
        int r8 = r18.size();
    L6:
        boolean r9 = true;
        if (index$iv >= r8) goto L18;
        Object item$iv = r18.get(index$iv);
        IntrinsicMeasurable child = (IntrinsicMeasurable) item$iv;
        float weight = getWeight(getRowColumnParentData(child));
        int size = r19.invoke(child, Integer.valueOf(crossAxisAvailable)).intValue();
        if (weight == 0.0f) goto L12;
        r9 = false;
    L12:
        if (r9 == false) goto L15;
        fixedSpace = fixedSpace + size;
    L17:
        index$iv = index$iv + 1;
        goto L6
    L15:
        if (weight <= 0.0f) goto L17;
        totalWeight = totalWeight + weight;
        float $this$fastRoundToInt$iv = size / weight;
        weightUnitSpace = Math.max(weightUnitSpace, Math.round($this$fastRoundToInt$iv));
        goto L17
    L18:
        float $this$fastRoundToInt$iv2 = weightUnitSpace * totalWeight;
        return (Math.round($this$fastRoundToInt$iv2) + fixedSpace) + ((r18.size() - 1) * mainAxisSpacing);
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> r20, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r21, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r22, int mainAxisAvailable, int mainAxisSpacing) {
        boolean r4 = false;
        if (r20.isEmpty() == false) goto L5;
        return 0;
    L5:
        boolean r6 = true;
        int fixedSpace = Math.min((r20.size() - 1) * mainAxisSpacing, mainAxisAvailable);
        int crossAxisMax = 0;
        float totalWeight = 0.0f;
        int index$iv = 0;
        int r11 = r20.size();
    L6:
        float r12 = 0.0f;
        if (index$iv >= r11) goto L22;
        Object item$iv = r20.get(index$iv);
        IntrinsicMeasurable child = (IntrinsicMeasurable) item$iv;
        float weight = getWeight(getRowColumnParentData(child));
        if (weight != 0.0f) goto L11;
        boolean r18 = r6;
    L12:
        if (r18 == false) goto L18;
        if (mainAxisAvailable != Integer.MAX_VALUE) goto L15;
        int remaining = Integer.MAX_VALUE;
    L16:
        int mainAxisSpace = Math.min(r21.invoke(child, Integer.MAX_VALUE).intValue(), remaining);
        fixedSpace = fixedSpace + mainAxisSpace;
        crossAxisMax = Math.max(crossAxisMax, r22.invoke(child, Integer.valueOf(mainAxisSpace)).intValue());
    L20:
        index$iv = index$iv + 1;
        r4 = false;
        r6 = true;
        goto L6
    L15:
        remaining = mainAxisAvailable - fixedSpace;
        goto L16
    L18:
        if (weight <= 0.0f) goto L20;
        totalWeight = totalWeight + weight;
        goto L20
    L11:
        r18 = r4;
        goto L12
    L22:
        if (totalWeight != 0.0f) goto L24;
        boolean r19 = true;
    L25:
        if (r19 == false) goto L27;
        int weightUnitSpace = 0;
    L30:
        int index$iv2 = 0;
        int r13 = r20.size();
    L31:
        if (index$iv2 >= r13) goto L40;
        Object item$iv2 = r20.get(index$iv2);
        IntrinsicMeasurable child2 = (IntrinsicMeasurable) item$iv2;
        float weight2 = getWeight(getRowColumnParentData(child2));
        if (weight2 <= r12) goto L38;
        if (weightUnitSpace == Integer.MAX_VALUE) goto L36;
        float $this$fastRoundToInt$iv = weightUnitSpace * weight2;
        int r14 = Math.round($this$fastRoundToInt$iv);
    L37:
        crossAxisMax = Math.max(crossAxisMax, r22.invoke(child2, Integer.valueOf(r14)).intValue());
        goto L38
    L36:
        r14 = Integer.MAX_VALUE;
    L38:
        index$iv2 = index$iv2 + 1;
        r12 = 0.0f;
        goto L31
    L40:
        return crossAxisMax;
    L27:
        if (mainAxisAvailable != Integer.MAX_VALUE) goto L29;
        weightUnitSpace = Integer.MAX_VALUE;
        goto L30
    L29:
        float $this$fastRoundToInt$iv2 = Math.max(mainAxisAvailable - fixedSpace, 0) / totalWeight;
        weightUnitSpace = Math.round($this$fastRoundToInt$iv2);
        goto L30
    L24:
        r19 = false;
        goto L25
    }
}
