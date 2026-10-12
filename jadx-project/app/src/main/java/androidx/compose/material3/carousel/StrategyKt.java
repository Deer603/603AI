package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Strategy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002\u001a\u001e\u0010\u000f\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002\u001a \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0002\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002\u001a\u001e\u0010\u0019\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002\u001a&\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002\u001a0\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0002\u001a0\u0010&\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a(\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0**\b\u0012\u0004\u0012\u00020\b0*2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¨\u0006+"}, d2 = {"createShiftedKeylineListForContentPadding", "Landroidx/compose/material3/carousel/KeylineList;", "from", "carouselMainAxisSize", "", "itemSpacing", "contentPadding", "pivot", "Landroidx/compose/material3/carousel/Keyline;", "pivotIndex", "", "getEndKeylineSteps", "", "defaultKeylines", "afterContentPadding", "getEndShiftDistance", "endKeylineSteps", "getShiftPointRange", "Landroidx/compose/material3/carousel/ShiftPointRange;", "stepsCount", "shiftPoint", "Landroidx/collection/FloatList;", "interpolation", "getStartKeylineSteps", "beforeContentPadding", "getStartShiftDistance", "startKeylineSteps", "getStepInterpolationPoints", "totalShiftDistance", "steps", "isShiftingLeft", "", "lerp", "outputMin", "outputMax", "inputMin", "inputMax", "value", "moveKeylineAndCreateShiftedKeylineList", "srcIndex", "dstIndex", "move", "", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StrategyKt {
    public static final /* synthetic */ List access$getEndKeylineSteps(KeylineList defaultKeylines, float carouselMainAxisSize, float itemSpacing, float afterContentPadding) {
        return getEndKeylineSteps(defaultKeylines, carouselMainAxisSize, itemSpacing, afterContentPadding);
    }

    public static final /* synthetic */ float access$getEndShiftDistance(List endKeylineSteps, float afterContentPadding) {
        return getEndShiftDistance(endKeylineSteps, afterContentPadding);
    }

    public static final /* synthetic */ ShiftPointRange access$getShiftPointRange(int stepsCount, FloatList shiftPoint, float interpolation) {
        return getShiftPointRange(stepsCount, shiftPoint, interpolation);
    }

    public static final /* synthetic */ List access$getStartKeylineSteps(KeylineList defaultKeylines, float carouselMainAxisSize, float itemSpacing, float beforeContentPadding) {
        return getStartKeylineSteps(defaultKeylines, carouselMainAxisSize, itemSpacing, beforeContentPadding);
    }

    public static final /* synthetic */ float access$getStartShiftDistance(List startKeylineSteps, float beforeContentPadding) {
        return getStartShiftDistance(startKeylineSteps, beforeContentPadding);
    }

    public static final /* synthetic */ FloatList access$getStepInterpolationPoints(float totalShiftDistance, List steps, boolean isShiftingLeft) {
        return getStepInterpolationPoints(totalShiftDistance, steps, isShiftingLeft);
    }

    public static final /* synthetic */ float access$lerp(float outputMin, float outputMax, float inputMin, float inputMax, float value) {
        return lerp(outputMin, outputMax, inputMin, inputMax, value);
    }

    public static final /* synthetic */ List access$move(List $receiver, int srcIndex, int dstIndex) {
        return move($receiver, srcIndex, dstIndex);
    }

    private static final float getStartShiftDistance(List<KeylineList> r2, float beforeContentPadding) {
        if (r2.isEmpty() == false) goto L7;
        return 0.0f;
    L7:
        return Math.max(((Keyline) CollectionsKt.first((List) CollectionsKt.last(r2))).getUnadjustedOffset() - ((Keyline) CollectionsKt.first((List) CollectionsKt.first(r2))).getUnadjustedOffset(), beforeContentPadding);
    }

    private static final float getEndShiftDistance(List<KeylineList> r2, float afterContentPadding) {
        if (r2.isEmpty() == false) goto L7;
        return 0.0f;
    L7:
        return Math.max(((Keyline) CollectionsKt.last((List) CollectionsKt.first(r2))).getUnadjustedOffset() - ((Keyline) CollectionsKt.last((List) CollectionsKt.last(r2))).getUnadjustedOffset(), afterContentPadding);
    }

    private static final List<KeylineList> getStartKeylineSteps(KeylineList defaultKeylines, float carouselMainAxisSize, float itemSpacing, float beforeContentPadding) {
        if (defaultKeylines.isEmpty() == true) goto L5;
        List steps = new ArrayList();
        steps.add(defaultKeylines);
        boolean r3 = false;
        if (defaultKeylines.isFirstFocalItemAtStartOfContainer() == true) goto L9;
        int startIndex = defaultKeylines.getFirstNonAnchorIndex();
        int endIndex = defaultKeylines.getFirstFocalIndex();
        int numberOfSteps = endIndex - startIndex;
        if (numberOfSteps <= 0) goto L18;
    L21:
        int i = 0;
    L22:
        if (i >= numberOfSteps) goto L28;
        KeylineList prevStep = (KeylineList) CollectionsKt.last(steps);
        int originalItemIndex = startIndex + i;
        int dstIndex = CollectionsKt.getLastIndex(defaultKeylines);
        if (originalItemIndex <= 0) goto L26;
        float originalNeighborBeforeSize = defaultKeylines.get(originalItemIndex - 1).getSize();
        dstIndex = prevStep.firstIndexAfterFocalRangeWithSize(originalNeighborBeforeSize) - 1;
    L26:
        steps.add(moveKeylineAndCreateShiftedKeylineList(prevStep, defaultKeylines.getFirstNonAnchorIndex(), dstIndex, carouselMainAxisSize, itemSpacing));
        i = i + 1;
        goto L22
    L28:
        if (beforeContentPadding != 0.0f) goto L30;
        r3 = true;
    L30:
        if (r3 == true) goto L32;
        steps.set(CollectionsKt.getLastIndex(steps), createShiftedKeylineListForContentPadding((KeylineList) CollectionsKt.last(steps), carouselMainAxisSize, itemSpacing, beforeContentPadding, ((KeylineList) CollectionsKt.last(steps)).getFirstFocal(), ((KeylineList) CollectionsKt.last(steps)).getFirstFocalIndex()));
    L32:
        return steps;
    L18:
        if (defaultKeylines.getFirstFocal().getCutoff() <= 0.0f) goto L21;
        steps.add(moveKeylineAndCreateShiftedKeylineList(defaultKeylines, 0, 0, carouselMainAxisSize, itemSpacing));
        return steps;
    L9:
        if (beforeContentPadding != 0.0f) goto L11;
        r3 = true;
    L11:
        if (r3 == true) goto L14;
        steps.add(createShiftedKeylineListForContentPadding(defaultKeylines, carouselMainAxisSize, itemSpacing, beforeContentPadding, defaultKeylines.getFirstFocal(), defaultKeylines.getFirstFocalIndex()));
    L14:
        return steps;
    L5:
        return CollectionsKt.emptyList();
    }

    private static final List<KeylineList> getEndKeylineSteps(KeylineList defaultKeylines, float carouselMainAxisSize, float itemSpacing, float afterContentPadding) {
        if (defaultKeylines.isEmpty() == true) goto L5;
        List steps = new ArrayList();
        steps.add(defaultKeylines);
        boolean r3 = false;
        if (defaultKeylines.isLastFocalItemAtEndOfContainer(carouselMainAxisSize) == true) goto L9;
        int startIndex = defaultKeylines.getLastFocalIndex();
        int endIndex = defaultKeylines.getLastNonAnchorIndex();
        int numberOfSteps = endIndex - startIndex;
        if (numberOfSteps <= 0) goto L18;
    L21:
        int i = 0;
    L22:
        if (i >= numberOfSteps) goto L28;
        KeylineList prevStep = (KeylineList) CollectionsKt.last(steps);
        int originalItemIndex = endIndex - i;
        int dstIndex = 0;
        if (originalItemIndex >= CollectionsKt.getLastIndex(defaultKeylines)) goto L26;
        float originalNeighborAfterSize = defaultKeylines.get(originalItemIndex + 1).getSize();
        dstIndex = prevStep.lastIndexBeforeFocalRangeWithSize(originalNeighborAfterSize) + 1;
    L26:
        KeylineList keylines = moveKeylineAndCreateShiftedKeylineList(prevStep, defaultKeylines.getLastNonAnchorIndex(), dstIndex, carouselMainAxisSize, itemSpacing);
        steps.add(keylines);
        i = i + 1;
        goto L22
    L28:
        if (afterContentPadding != 0.0f) goto L30;
        r3 = true;
    L30:
        if (r3 == true) goto L32;
        steps.set(CollectionsKt.getLastIndex(steps), createShiftedKeylineListForContentPadding((KeylineList) CollectionsKt.last(steps), carouselMainAxisSize, itemSpacing, -afterContentPadding, ((KeylineList) CollectionsKt.last(steps)).getLastFocal(), ((KeylineList) CollectionsKt.last(steps)).getLastFocalIndex()));
    L32:
        return steps;
    L18:
        if (defaultKeylines.getLastFocal().getCutoff() <= 0.0f) goto L21;
        steps.add(moveKeylineAndCreateShiftedKeylineList(defaultKeylines, 0, 0, carouselMainAxisSize, itemSpacing));
        return steps;
    L9:
        if (afterContentPadding != 0.0f) goto L11;
        r3 = true;
    L11:
        if (r3 == true) goto L14;
        steps.add(createShiftedKeylineListForContentPadding(defaultKeylines, carouselMainAxisSize, itemSpacing, -afterContentPadding, defaultKeylines.getLastFocal(), defaultKeylines.getLastFocalIndex()));
    L14:
        return steps;
    L5:
        return CollectionsKt.emptyList();
    }

    private static final KeylineList createShiftedKeylineListForContentPadding(final KeylineList from, float carouselMainAxisSize, float itemSpacing, float contentPadding, Keyline pivot, int pivotIndex) {
        KeylineList $this$fastFilter$iv = from;
        List target$iv = new ArrayList($this$fastFilter$iv.size());
        int index$iv$iv = 0;
        int r7 = $this$fastFilter$iv.size();
    L3:
        if (index$iv$iv >= r7) goto L8;
        Keyline r8 = $this$fastFilter$iv.get(index$iv$iv);
        Keyline it = r8;
        if (it.isAnchor() == true) goto L7;
        target$iv.add(r8);
    L7:
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L8:
        int numberOfNonAnchorKeylines = target$iv.size();
        final float sizeReduction = contentPadding / numberOfNonAnchorKeylines;
        List newKeylines = KeylineListKt.keylineListOf(carouselMainAxisSize, itemSpacing, pivotIndex, (pivot.getOffset() - (sizeReduction / 2.0f)) + contentPadding, new StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1(from, sizeReduction));
        List $this$fastMapIndexed$iv = newKeylines;
        ArrayList target$iv2 = new ArrayList($this$fastMapIndexed$iv.size());
        int index$iv$iv2 = 0;
        int r13 = $this$fastMapIndexed$iv.size();
    L9:
        if (index$iv$iv2 >= r13) goto L12;
        Object item$iv$iv = $this$fastMapIndexed$iv.get(index$iv$iv2);
        int index$iv = index$iv$iv2;
        Keyline k = (Keyline) item$iv$iv;
        target$iv2.add(Keyline.copy$default(k, 0.0f, 0.0f, from.get(index$iv).getUnadjustedOffset(), false, false, false, 0.0f, 123, null));
        index$iv$iv2 = index$iv$iv2 + 1;
        numberOfNonAnchorKeylines = numberOfNonAnchorKeylines;
        sizeReduction = sizeReduction;
        goto L9
    L12:
        return new KeylineList(target$iv2);
    }

    private static final KeylineList moveKeylineAndCreateShiftedKeylineList(final KeylineList from, final int srcIndex, final int dstIndex, float carouselMainAxisSize, float itemSpacing) {
        if (srcIndex <= dstIndex) goto L4;
        int pivotDir = 1;
    L5:
        float pivotDelta = ((from.get(srcIndex).getSize() - from.get(srcIndex).getCutoff()) + itemSpacing) * pivotDir;
        int newPivotIndex = from.getPivotIndex() + pivotDir;
        float newPivotOffset = from.getPivot().getOffset() + pivotDelta;
        return KeylineListKt.keylineListOf(carouselMainAxisSize, itemSpacing, newPivotIndex, newPivotOffset, new AnonymousClass1(from, srcIndex, dstIndex));
    L4:
        pivotDir = -1;
        goto L5
    }

    private static final FloatList getStepInterpolationPoints(float totalShiftDistance, List<KeylineList> r17, boolean isShiftingLeft) {
        MutableFloatList points = FloatListKt.mutableFloatListOf(0.0f);
        if (totalShiftDistance != 0.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L25;
        if (r17.isEmpty() == true) goto L25;
        Iterable $this$map$iv = RangesKt.until(1, r17.size());
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Integer> r7 = $this$map$iv.iterator();
    L12:
        if (r7.hasNext() == false) goto L22;
        int item$iv$iv = ((IntIterator) r7).nextInt();
        KeylineList prevKeylines = r17.get(item$iv$iv - 1);
        KeylineList currKeylines = r17.get(item$iv$iv);
        if (isShiftingLeft == false) goto L16;
        float distanceShifted = ((Keyline) CollectionsKt.first(currKeylines)).getUnadjustedOffset() - ((Keyline) CollectionsKt.first(prevKeylines)).getUnadjustedOffset();
    L17:
        float stepPercentage = distanceShifted / totalShiftDistance;
        if (item$iv$iv != CollectionsKt.getLastIndex(r17)) goto L20;
        float point = 1.0f;
    L21:
        destination$iv$iv.add(Boolean.valueOf(points.add(point)));
        goto L12
    L20:
        point = points.get(item$iv$iv - 1) + stepPercentage;
        goto L21
    L16:
        distanceShifted = ((Keyline) CollectionsKt.last(prevKeylines)).getUnadjustedOffset() - ((Keyline) CollectionsKt.last(currKeylines)).getUnadjustedOffset();
        goto L17
    L22:
        ArrayList r4 = (List) destination$iv$iv;
        return points;
    L25:
        return points;
    L5:
        r1 = false;
        goto L6
    }

    private static final ShiftPointRange getShiftPointRange(int stepsCount, FloatList shiftPoint, float interpolation) {
        float lowerBounds = shiftPoint.get(0);
        Iterable $this$forEach$iv = RangesKt.until(1, stepsCount);
        Iterator<Integer> r4 = $this$forEach$iv.iterator();
    L4:
        if (r4.hasNext() == false) goto L11;
        int element$iv = ((IntIterator) r4).nextInt();
        float upperBounds = shiftPoint.get(element$iv);
        if (interpolation <= upperBounds) goto L8;
        lowerBounds = upperBounds;
        goto L4
    L8:
        return new ShiftPointRange(element$iv - 1, element$iv, lerp(0.0f, 1.0f, lowerBounds, upperBounds, interpolation));
    L11:
        return new ShiftPointRange(0, 0, 0.0f);
    }

    private static final List<Keyline> move(List<Keyline> r1, int srcIndex, int dstIndex) {
        Keyline keyline = r1.get(srcIndex);
        r1.remove(srcIndex);
        r1.add(dstIndex, keyline);
        return r1;
    }

    private static final float lerp(float outputMin, float outputMax, float inputMin, float inputMax, float value) {
        if (value > inputMin) goto L6;
        return outputMin;
    L6:
        if (value < inputMax) goto L9;
        return outputMax;
    L9:
        return MathHelpersKt.lerp(outputMin, outputMax, (value - inputMin) / (inputMax - inputMin));
    }
}
