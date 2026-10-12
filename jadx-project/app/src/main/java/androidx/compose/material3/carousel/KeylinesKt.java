package androidx.compose.material3.carousel;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Keylines.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001aD\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0001H\u0000\u001a(\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¨\u0006\u0017"}, d2 = {"calculateMediumChildSize", "", "minimumMediumSize", "largeItemSize", "remainingSpace", "createLeftAlignedKeylineList", "Landroidx/compose/material3/carousel/KeylineList;", "carouselMainAxisSize", "itemSpacing", "leftAnchorSize", "rightAnchorSize", "arrangement", "Landroidx/compose/material3/carousel/Arrangement;", "multiBrowseKeylineList", "density", "Landroidx/compose/ui/unit/Density;", "preferredItemSize", "itemCount", "", "minSmallItemSize", "maxSmallItemSize", "uncontainedKeylineList", "itemSize", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KeylinesKt {
    public static /* synthetic */ KeylineList multiBrowseKeylineList$default(Density $this$multiBrowseKeylineList_u24lambda_u240, float r8, float r9, float r10, int r11, float r12, float r13, int r14, Object r15) {
        if ((r14 & 32) == 0) goto L5;
        float r5 = $this$multiBrowseKeylineList_u24lambda_u240.mo376toPx0680j_4(CarouselDefaults.INSTANCE.m3008getMinSmallItemSizeD9Ej5fM$material3_release());
    L7:
        if ((r14 & 64) == 0) goto L9;
        float r6 = $this$multiBrowseKeylineList_u24lambda_u240.mo376toPx0680j_4(CarouselDefaults.INSTANCE.m3007getMaxSmallItemSizeD9Ej5fM$material3_release());
    L11:
        return multiBrowseKeylineList($this$multiBrowseKeylineList_u24lambda_u240, r8, r9, r10, r11, r5, r6);
    L9:
        r6 = r13;
        goto L11
    L5:
        r5 = r12;
        goto L7
    }

    public static final KeylineList multiBrowseKeylineList(Density density, float carouselMainAxisSize, float preferredItemSize, float itemSpacing, int itemCount, float minSmallItemSize, float maxSmallItemSize) {
        if (carouselMainAxisSize != 0.0f) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L40;
        if (preferredItemSize != 0.0f) goto L10;
        boolean r0 = true;
    L11:
        if (r0 == true) goto L40;
        int[] smallCounts = {1};
        int[] mediumCounts = {1, 0};
        float targetLargeSize = Math.min(preferredItemSize, carouselMainAxisSize);
        float targetSmallSize = RangesKt.coerceIn(targetLargeSize / 3.0f, minSmallItemSize, maxSmallItemSize);
        float targetMediumSize = (targetLargeSize + targetSmallSize) / 2.0f;
        if (carouselMainAxisSize >= (2.0f * minSmallItemSize)) goto L16;
        smallCounts = new int[]{0};
    L16:
        float minAvailableLargeSpace = (carouselMainAxisSize - (ArraysKt.maxOrThrow(mediumCounts) * targetMediumSize)) - (ArraysKt.maxOrThrow(smallCounts) * maxSmallItemSize);
        int minLargeCount = Math.max(1, (int) Math.floor(minAvailableLargeSpace / targetLargeSize));
        int maxLargeCount = (int) Math.ceil(carouselMainAxisSize / targetLargeSize);
        int r4 = (maxLargeCount - minLargeCount) + 1;
        int[] largeCounts = new int[r4];
        int r10 = 0;
    L17:
        if (r10 >= r4) goto L19;
        largeCounts[r10] = maxLargeCount - r10;
        r10 = r10 + 1;
        goto L17
    L19:
        float anchorSize = density.mo376toPx0680j_4(CarouselDefaults.INSTANCE.m3006getAnchorSizeD9Ej5fM$material3_release());
        Arrangement arrangement = Arrangement.Companion.findLowestCostArrangement(carouselMainAxisSize, itemSpacing, targetSmallSize, minSmallItemSize, maxSmallItemSize, smallCounts, targetMediumSize, mediumCounts, targetLargeSize, largeCounts);
        if (arrangement != null) goto L22;
    L32:
        float r1 = carouselMainAxisSize;
        Arrangement arrangement2 = arrangement;
    L33:
        if (arrangement2 != null) goto L37;
        return KeylineListKt.emptyKeylineList();
    L37:
        return createLeftAlignedKeylineList(r1, itemSpacing, anchorSize, anchorSize, arrangement2);
    L22:
        if (arrangement.itemCount() <= itemCount) goto L32;
        int keylineSurplus = arrangement.itemCount() - itemCount;
        int smallCount = arrangement.getSmallCount();
        int keylineSurplus2 = keylineSurplus;
        int smallCount2 = smallCount;
        int keylineSurplus3 = arrangement.getMediumCount();
    L24:
        if (keylineSurplus2 <= 0) goto L31;
        if (smallCount2 <= 0) goto L28;
        smallCount2 = smallCount2 - 1;
    L30:
        keylineSurplus2 = keylineSurplus2 - 1;
        goto L24
    L28:
        if (keylineSurplus3 <= 1) goto L30;
        keylineSurplus3 = keylineSurplus3 - 1;
        goto L30
    L31:
        int mediumCount = keylineSurplus3;
        r1 = carouselMainAxisSize;
        arrangement2 = Arrangement.Companion.findLowestCostArrangement(r1, itemSpacing, targetSmallSize, minSmallItemSize, maxSmallItemSize, new int[]{smallCount2}, targetMediumSize, new int[]{mediumCount}, targetLargeSize, largeCounts);
        goto L33
    L10:
        r0 = false;
    L40:
        return KeylineListKt.emptyKeylineList();
    L5:
        r2 = false;
        goto L6
    }

    public static final KeylineList createLeftAlignedKeylineList(float carouselMainAxisSize, float itemSpacing, final float leftAnchorSize, final float rightAnchorSize, final Arrangement arrangement) {
        return KeylineListKt.m3014keylineListOfWNYm7Xg(carouselMainAxisSize, itemSpacing, CarouselAlignment.Companion.m3005getStartNUL3oTo(), new AnonymousClass1(leftAnchorSize, arrangement, rightAnchorSize));
    }

    public static final KeylineList uncontainedKeylineList(Density density, float carouselMainAxisSize, float itemSize, float itemSpacing) {
        if (carouselMainAxisSize != 0.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L20;
        if (itemSize != 0.0f) goto L10;
        boolean r2 = true;
    L11:
        if (r2 == true) goto L20;
        float largeItemSize = Math.min(itemSize + itemSpacing, carouselMainAxisSize);
        int largeCount = Math.max(1, (int) Math.floor(carouselMainAxisSize / largeItemSize));
        float remainingSpace = carouselMainAxisSize - (largeCount * largeItemSize);
        if (remainingSpace <= 0.0f) goto L16;
        int mediumCount = 1;
    L17:
        float defaultAnchorSize = density.mo376toPx0680j_4(CarouselDefaults.INSTANCE.m3006getAnchorSizeD9Ej5fM$material3_release());
        float mediumItemSize = calculateMediumChildSize(defaultAnchorSize, largeItemSize, remainingSpace);
        Arrangement arrangement = new Arrangement(0, 0.0f, 0, mediumItemSize, mediumCount, largeItemSize, largeCount);
        float xSmallSize = Math.min(defaultAnchorSize, itemSize);
        float leftAnchorSize = Math.max(xSmallSize, 0.5f * mediumItemSize);
        return createLeftAlignedKeylineList(carouselMainAxisSize, itemSpacing, leftAnchorSize, defaultAnchorSize, arrangement);
    L16:
        mediumCount = 0;
        goto L17
    L10:
        r2 = false;
    L20:
        return KeylineListKt.emptyKeylineList();
    L5:
        r1 = false;
        goto L6
    }

    private static final float calculateMediumChildSize(float minimumMediumSize, float largeItemSize, float remainingSpace) {
        float sizeWithThirdCutOff = 1.5f * remainingSpace;
        float mediumItemSize = Math.max(sizeWithThirdCutOff, minimumMediumSize);
        float largeItemThreshold = 0.85f * largeItemSize;
        if (mediumItemSize <= largeItemThreshold) goto L6;
        float sizeWithFifthCutOff = 1.2f * remainingSpace;
        return Math.max(largeItemThreshold, sizeWithFifthCutOff);
    L6:
        return mediumItemSize;
    }
}
