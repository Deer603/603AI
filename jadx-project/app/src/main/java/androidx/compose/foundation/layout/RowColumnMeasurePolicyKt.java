package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: RowColumnMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "startIndex", "endIndex", "crossAxisOffset", "", "currentLineIndex", "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RowColumnMeasurePolicyKt {
    public static /* synthetic */ MeasureResult measure$default(RowColumnMeasurePolicy r15, int r16, int r17, int r18, int r19, int r20, MeasureScope r21, List r22, Placeable[] r23, int r24, int r25, int[] r26, int r27, int r28, Object r29) {
        if ((r28 & 1024) == 0) goto L5;
        int[] r13 = null;
    L7:
        if ((r28 & 2048) == 0) goto L9;
        int r14 = 0;
    L11:
        return measure(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r13, r14);
    L9:
        r14 = r27;
        goto L11
    L5:
        r13 = r26;
        goto L7
    }

    public static final MeasureResult measure(RowColumnMeasurePolicy $this$measure, int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, int arrangementSpacingInt, MeasureScope measureScope, List<? extends Measurable> r54, Placeable[] placeables, int startIndex, int endIndex, int[] crossAxisOffset, int currentLineIndex) {
        long arrangementSpacingPx = arrangementSpacingInt;
        int crossAxisSpace = 0;
        int subSize = endIndex - startIndex;
        int[] childrenMainAxisSize = new int[subSize];
        int i = 0;
        float totalWeight = 0.0f;
        int fixedSpace = 0;
        int weightChildrenCount = 0;
        boolean anyAlignBy = false;
        int spaceAfterLastNoWeight = 0;
        int i2 = startIndex;
    L3:
        int spaceAfterLastNoWeight2 = 0;
        int minimumValue$iv = Integer.MAX_VALUE;
        boolean r23 = true;
        if (i2 >= endIndex) goto L42;
        Measurable child = r54.get(i2);
        RowColumnParentData parentData = RowColumnImplKt.getRowColumnParentData(child);
        float weight = RowColumnImplKt.getWeight(parentData);
        if (anyAlignBy == false) goto L8;
    L11:
        anyAlignBy = r23;
        if (weight <= 0.0f) goto L14;
        totalWeight = totalWeight + weight;
        weightChildrenCount = weightChildrenCount + 1;
        i2 = i2;
        childrenMainAxisSize = childrenMainAxisSize;
        arrangementSpacingPx = arrangementSpacingPx;
    L41:
        i2 = i2 + 1;
        childrenMainAxisSize = childrenMainAxisSize;
        arrangementSpacingPx = arrangementSpacingPx;
        goto L3
    L14:
        if (crossAxisMax != Integer.MAX_VALUE) goto L16;
        Integer r7 = null;
    L21:
        Integer crossAxisDesiredSize = r7;
        int remaining = mainAxisMax - fixedSpace;
        Placeable placeable = placeables[i2];
        if (placeable != null) goto L36;
        if (crossAxisDesiredSize == null) goto L25;
        int r3 = crossAxisDesiredSize.intValue();
    L26:
        if (mainAxisMax == Integer.MAX_VALUE) goto L32;
        minimumValue$iv = 0;
        if (remaining < 0) goto L32;
        minimumValue$iv = remaining;
    L32:
        if (crossAxisDesiredSize == null) goto L34;
        int r6 = crossAxisDesiredSize.intValue();
    L35:
        int crossAxisSpace2 = crossAxisSpace;
        int crossAxisSpace3 = r3;
        int crossAxisSpace4 = crossAxisSpace2;
        RowColumnMeasurePolicy r0 = $this$measure;
        placeable = child.mo5714measureBRTryo0(RowColumnMeasurePolicy.m752createConstraintsxF2OJ5Q$default(r0, 0, crossAxisSpace3, minimumValue$iv, r6, false, 16, null));
    L37:
        int placeableMainAxisSize = r0.mainAxisSize(placeable);
        int placeableCrossAxisSize = r0.crossAxisSize(placeable);
        childrenMainAxisSize[i2 - startIndex] = placeableMainAxisSize;
        int $this$fastCoerceAtLeast$iv = remaining - placeableMainAxisSize;
        if ($this$fastCoerceAtLeast$iv >= 0) goto L40;
        $this$fastCoerceAtLeast$iv = 0;
    L40:
        int spaceAfterLastNoWeight3 = Math.min(arrangementSpacingInt, $this$fastCoerceAtLeast$iv);
        fixedSpace = fixedSpace + (placeableMainAxisSize + spaceAfterLastNoWeight3);
        int crossAxisSpace5 = Math.max(crossAxisSpace4, placeableCrossAxisSize);
        placeables[i2] = placeable;
        spaceAfterLastNoWeight = spaceAfterLastNoWeight3;
        crossAxisSpace = crossAxisSpace5;
        goto L41
    L34:
        r6 = crossAxisMax;
        goto L35
    L25:
        r3 = 0;
        goto L26
    L36:
        r0 = $this$measure;
        crossAxisSpace4 = crossAxisSpace;
        goto L37
    L16:
        if (parentData == null) goto L20;
        FlowLayoutData it = parentData.getFlowLayoutData();
        if (it == null) goto L20;
        float $this$fastRoundToInt$iv = it.getFillCrossAxisFraction() * crossAxisMax;
        int $i$f$fastRoundToInt = Math.round($this$fastRoundToInt$iv);
        r7 = Integer.valueOf($i$f$fastRoundToInt);
    L20:
        r7 = null;
        goto L21
    L8:
        if (RowColumnImplKt.isRelative(parentData) == true) goto L11;
        r23 = false;
        goto L11
    L42:
        int[] childrenMainAxisSize2 = childrenMainAxisSize;
        long arrangementSpacingPx2 = arrangementSpacingPx;
        int crossAxisSpace6 = crossAxisSpace;
        if (weightChildrenCount != 0) goto L45;
        int crossAxisSpace7 = crossAxisSpace6;
        int r26 = 0;
        int fixedSpace2 = fixedSpace - spaceAfterLastNoWeight;
        int fixedSpace3 = 0;
    L97:
        if (anyAlignBy == false) goto L118;
        int i3 = startIndex;
        int beforeCrossAxisAlignmentLine = 0;
        int afterCrossAxisAlignmentLine = 0;
    L99:
        if (i3 >= endIndex) goto L117;
        Placeable placeable2 = placeables[i3];
        Intrinsics.checkNotNull(placeable2);
        CrossAxisAlignment r8 = RowColumnImplKt.getCrossAxisAlignment(RowColumnImplKt.getRowColumnParentData(placeable2));
        if (r8 == null) goto L103;
        Integer alignmentLinePosition = r8.calculateAlignmentLinePosition$foundation_layout_release(placeable2);
    L105:
        if (alignmentLinePosition == null) goto L116;
        int it2 = alignmentLinePosition.intValue();
        int placeableCrossAxisSize2 = $this$measure.crossAxisSize(placeable2);
        if (it2 == Integer.MIN_VALUE) goto L109;
        int r2 = alignmentLinePosition.intValue();
    L110:
        beforeCrossAxisAlignmentLine = Math.max(beforeCrossAxisAlignmentLine, r2);
        if (it2 == Integer.MIN_VALUE) goto L113;
        int r4 = it2;
    L114:
        afterCrossAxisAlignmentLine = Math.max(afterCrossAxisAlignmentLine, placeableCrossAxisSize2 - r4);
        goto L116
    L113:
        r4 = placeableCrossAxisSize2;
        goto L114
    L109:
        r2 = r26;
    L116:
        i3 = i3 + 1;
        goto L99
    L103:
        alignmentLinePosition = null;
        goto L105
    L117:
        i = afterCrossAxisAlignmentLine;
    L119:
        int $this$fastCoerceAtLeast$iv2 = fixedSpace2 + fixedSpace3;
        if ($this$fastCoerceAtLeast$iv2 >= 0) goto L122;
        $this$fastCoerceAtLeast$iv2 = 0;
    L122:
        int mainAxisLayoutSize = Math.max($this$fastCoerceAtLeast$iv2, mainAxisMin);
        int crossAxisLayoutSize = Math.max(crossAxisSpace7, Math.max(crossAxisMin, beforeCrossAxisAlignmentLine + i));
        int[] mainAxisPositions = new int[subSize];
        $this$measure.populateMainAxisPositions(mainAxisLayoutSize, childrenMainAxisSize2, mainAxisPositions, measureScope);
        return $this$measure.placeHelper(placeables, measureScope, beforeCrossAxisAlignmentLine, mainAxisPositions, mainAxisLayoutSize, crossAxisLayoutSize, crossAxisOffset, currentLineIndex, startIndex, endIndex);
    L118:
        beforeCrossAxisAlignmentLine = 0;
        goto L119
    L45:
        if (mainAxisMax == Integer.MAX_VALUE) goto L47;
        int r5 = mainAxisMax;
    L48:
        int targetSpace = r5;
        long arrangementSpacingTotal = arrangementSpacingPx2 * ((long) (weightChildrenCount - 1));
        long $this$fastCoerceAtLeast$iv3 = ((long) (targetSpace - fixedSpace)) - arrangementSpacingTotal;
        if ($this$fastCoerceAtLeast$iv3 >= 0) goto L51;
        $this$fastCoerceAtLeast$iv3 = 0;
    L51:
        float weightUnitSpace = $this$fastCoerceAtLeast$iv3 / totalWeight;
        long remainder = $this$fastCoerceAtLeast$iv3;
        int i4 = startIndex;
    L52:
        if (i4 >= endIndex) goto L54;
        Measurable measurable = r54.get(i4);
        float itemWeight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable));
        float weightedSize = weightUnitSpace * itemWeight;
        int $i$f$fastRoundToInt2 = crossAxisSpace6;
        remainder = remainder - ((long) Math.round(weightedSize));
        i4 = i4 + 1;
        crossAxisSpace6 = $i$f$fastRoundToInt2;
        spaceAfterLastNoWeight2 = spaceAfterLastNoWeight2;
        goto L52
    L54:
        int r38 = spaceAfterLastNoWeight2;
        int crossAxisSpace8 = crossAxisSpace6;
        int weightedSpace = 0;
        int i5 = startIndex;
        int crossAxisSpace9 = crossAxisSpace8;
    L55:
        if (i5 >= endIndex) goto L90;
        if (placeables[i5] != null) goto L88;
        Measurable child2 = r54.get(i5);
        RowColumnParentData parentData2 = RowColumnImplKt.getRowColumnParentData(child2);
        float weight2 = RowColumnImplKt.getWeight(parentData2);
        if (crossAxisMax != minimumValue$iv) goto L61;
        Integer r1 = null;
    L66:
        Integer crossAxisDesiredSize2 = r1;
        if (weight2 <= r38) goto L69;
        boolean value$iv = true;
    L71:
        if (value$iv == true) goto L73;
        InlineClassHelperKt.throwIllegalStateException("All weights <= 0 should have placeables");
    L73:
        int remainderUnit = MathKt.getSign(remainder);
        remainder = remainder - ((long) remainderUnit);
        float weightedSize2 = weightUnitSpace * weight2;
        int childMainAxisSize = Math.max(0, Math.round(weightedSize2) + remainderUnit);
        if (RowColumnImplKt.getFill(parentData2) == false) goto L78;
        int r9 = Integer.MAX_VALUE;
        if (childMainAxisSize == Integer.MAX_VALUE) goto L79;
        int remainderUnit2 = childMainAxisSize;
    L80:
        if (crossAxisDesiredSize2 == null) goto L82;
        int r39 = crossAxisDesiredSize2.intValue();
    L84:
        if (crossAxisDesiredSize2 == null) goto L86;
        int r42 = crossAxisDesiredSize2.intValue();
    L87:
        int r43 = r9;
        int childMainAxisSize2 = r39;
        int i6 = i5;
        long childConstraints = $this$measure.mo638createConstraintsxF2OJ5Q(remainderUnit2, childMainAxisSize2, childMainAxisSize, r42, true);
        Placeable placeable3 = child2.mo5714measureBRTryo0(childConstraints);
        int placeableMainAxisSize2 = $this$measure.mainAxisSize(placeable3);
        int placeableCrossAxisSize3 = $this$measure.crossAxisSize(placeable3);
        childrenMainAxisSize2[i6 - startIndex] = placeableMainAxisSize2;
        weightedSpace = weightedSpace + placeableMainAxisSize2;
        int crossAxisSpace10 = Math.max(crossAxisSpace9, placeableCrossAxisSize3);
        placeables[i6] = placeable3;
        crossAxisSpace9 = crossAxisSpace10;
    L89:
        i5 = i6 + 1;
        $this$fastCoerceAtLeast$iv3 = $this$fastCoerceAtLeast$iv3;
        minimumValue$iv = r43;
        goto L55
    L86:
        r42 = crossAxisMax;
        goto L87
    L82:
        r39 = 0;
    L79:
        remainderUnit2 = 0;
        goto L80
    L78:
        r9 = Integer.MAX_VALUE;
        goto L79
    L69:
        value$iv = false;
        goto L71
    L61:
        if (parentData2 == null) goto L65;
        FlowLayoutData it3 = parentData2.getFlowLayoutData();
        if (it3 == null) goto L65;
        float $this$fastRoundToInt$iv2 = it3.getFillCrossAxisFraction() * crossAxisMax;
        int $i$f$fastRoundToInt3 = Math.round($this$fastRoundToInt$iv2);
        r1 = Integer.valueOf($i$f$fastRoundToInt3);
    L65:
        r1 = null;
        goto L66
    L88:
        r43 = minimumValue$iv;
        i6 = i5;
        goto L89
    L90:
        r26 = 0;
        int $this$fastCoerceIn$iv = (int) (((long) weightedSpace) + arrangementSpacingTotal);
        int maximumValue$iv = mainAxisMax - fixedSpace;
        int $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0) goto L94;
        $this$fastCoerceAtLeast$iv$iv = 0;
    L94:
        if ($this$fastCoerceAtLeast$iv$iv <= maximumValue$iv) goto L96;
        $this$fastCoerceAtLeast$iv$iv = maximumValue$iv;
    L96:
        crossAxisSpace7 = crossAxisSpace9;
        fixedSpace2 = fixedSpace;
        fixedSpace3 = $this$fastCoerceAtLeast$iv$iv;
        goto L97
    L47:
        r5 = mainAxisMin;
        goto L48
    }
}
