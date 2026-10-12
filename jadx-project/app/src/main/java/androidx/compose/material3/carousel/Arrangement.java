package androidx.compose.material3.carousel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Arrangement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0003R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement;", "", "priority", "", "smallSize", "", "smallCount", "mediumSize", "mediumCount", "largeSize", "largeCount", "(IFIFIFI)V", "getLargeCount", "()I", "getLargeSize", "()F", "getMediumCount", "getMediumSize", "getSmallCount", "getSmallSize", "cost", "targetLargeSize", "isValid", "", "itemCount", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Arrangement {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002JX\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0013J`\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement$Companion;", "", "()V", "MediumItemFlexPercentage", "", "calculateLargeSize", "availableSpace", "smallCount", "", "smallSize", "mediumCount", "largeCount", "findLowestCostArrangement", "Landroidx/compose/material3/carousel/Arrangement;", "itemSpacing", "targetSmallSize", "minSmallSize", "maxSmallSize", "smallCounts", "", "targetMediumSize", "mediumCounts", "targetLargeSize", "largeCounts", "fit", "priority", "mediumSize", "largeSize", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Arrangement findLowestCostArrangement(float availableSpace, float itemSpacing, float targetSmallSize, float minSmallSize, float maxSmallSize, int[] smallCounts, float targetMediumSize, int[] mediumCounts, float targetLargeSize, int[] largeCounts) {
            Arrangement lowestCostArrangement = null;
            int priority = 1;
            int r15 = largeCounts.length;
            int r4 = 0;
        L3:
            if (r4 >= r15) goto L22;
            int largeCount = largeCounts[r4];
            int r5 = mediumCounts.length;
            int r6 = 0;
        L5:
            if (r6 >= r5) goto L20;
            int mediumCount = mediumCounts[r6];
            int r7 = smallCounts.length;
            int r8 = 0;
        L7:
            if (r8 >= r7) goto L19;
            int r9 = r6;
            int smallCount = smallCounts[r8];
            Arrangement lowestCostArrangement2 = lowestCostArrangement;
            int r17 = r4;
            int r18 = r5;
            int r20 = r7;
            int r21 = r8;
            Arrangement arrangement = fit(priority, availableSpace, itemSpacing, smallCount, targetSmallSize, minSmallSize, maxSmallSize, mediumCount, targetMediumSize, largeCount, targetLargeSize);
            if (lowestCostArrangement2 != null) goto L11;
        L12:
            lowestCostArrangement2 = arrangement;
            if (Arrangement.access$cost(lowestCostArrangement2, targetLargeSize) != 0.0f) goto L15;
            boolean r10 = true;
        L16:
            if (r10 == false) goto L18;
            return lowestCostArrangement2;
        L18:
            priority = priority + 1;
            r8 = r21 + 1;
            lowestCostArrangement = lowestCostArrangement2;
            r4 = r17;
            r5 = r18;
            r6 = r9;
            r7 = r20;
            smallCounts = smallCounts;
            goto L7
        L15:
            r10 = false;
            goto L16
        L11:
            if (Arrangement.access$cost(arrangement, targetLargeSize) >= Arrangement.access$cost(lowestCostArrangement2, targetLargeSize)) goto L18;
        L19:
            r6 = r6 + 1;
            smallCounts = smallCounts;
            goto L5
        L20:
            r4 = r4 + 1;
            goto L3
        L22:
            return lowestCostArrangement;
        }

        private final Arrangement fit(int priority, float availableSpace, float itemSpacing, int smallCount, float smallSize, float minSmallSize, float maxSmallSize, int mediumCount, float mediumSize, int largeCount, float largeSize) {
            int totalItemCount = (largeCount + mediumCount) + smallCount;
            float availableSpaceWithoutSpacing = availableSpace - ((totalItemCount - 1) * itemSpacing);
            float arrangedSmallSize = RangesKt.coerceIn(smallSize, minSmallSize, maxSmallSize);
            float totalSpaceTakenByArrangement = ((largeCount * largeSize) + (mediumCount * mediumSize)) + (smallCount * arrangedSmallSize);
            float delta = availableSpaceWithoutSpacing - totalSpaceTakenByArrangement;
            if (smallCount > 0) goto L5;
        L7:
            if (smallCount > 0) goto L9;
        L11:
            if (smallCount <= 0) goto L13;
            float arrangedSmallSize2 = arrangedSmallSize;
        L14:
            float arrangedLargeSize = calculateLargeSize(availableSpaceWithoutSpacing, smallCount, arrangedSmallSize2, mediumCount, largeCount);
            float arrangedSmallSize3 = arrangedSmallSize2;
            float arrangedMediumSize = (arrangedLargeSize + arrangedSmallSize3) / 2.0f;
            if (mediumCount > 0) goto L17;
        L25:
            float distribute = arrangedLargeSize;
        L27:
            return new Arrangement(priority, arrangedSmallSize3, smallCount, arrangedMediumSize, mediumCount, distribute, largeCount);
        L17:
            if (arrangedLargeSize != largeSize) goto L19;
            boolean r0 = true;
        L20:
            if (r0 == true) goto L25;
            float targetAdjustment = (largeSize - arrangedLargeSize) * largeCount;
            float availableMediumFlex = (0.1f * arrangedMediumSize) * mediumCount;
            float distribute2 = Math.min(Math.abs(targetAdjustment), availableMediumFlex);
            if (targetAdjustment <= 0.0f) goto L24;
            arrangedMediumSize = arrangedMediumSize - (distribute2 / mediumCount);
            distribute = arrangedLargeSize + (distribute2 / largeCount);
            goto L27
        L24:
            arrangedMediumSize = arrangedMediumSize + (distribute2 / mediumCount);
            distribute = arrangedLargeSize - (distribute2 / largeCount);
            goto L27
        L19:
            r0 = false;
            goto L20
        L13:
            arrangedSmallSize2 = 0.0f;
            goto L14
        L9:
            if (delta >= 0.0f) goto L11;
            arrangedSmallSize = arrangedSmallSize + Math.max(delta / smallCount, minSmallSize - arrangedSmallSize);
            goto L11
        L5:
            if (delta <= 0.0f) goto L7;
            arrangedSmallSize = arrangedSmallSize + Math.min(delta / smallCount, maxSmallSize - arrangedSmallSize);
            goto L11
        }

        private final float calculateLargeSize(float availableSpace, int smallCount, float smallSize, int mediumCount, int largeCount) {
            return (availableSpace - ((smallCount + (mediumCount / 2.0f)) * smallSize)) / (largeCount + (mediumCount / 2.0f));
        }
    }

    static {
        Companion = new Companion(null);
    }

    public Arrangement(int priority, float smallSize, int smallCount, float mediumSize, int mediumCount, float largeSize, int largeCount) {
        this.priority = priority;
        this.smallSize = smallSize;
        this.smallCount = smallCount;
        this.mediumSize = mediumSize;
        this.mediumCount = mediumCount;
        this.largeSize = largeSize;
        this.largeCount = largeCount;
    }

    public static final /* synthetic */ float access$cost(Arrangement $this, float targetLargeSize) {
        return $this.cost(targetLargeSize);
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final int getSmallCount() {
        return this.smallCount;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final int getMediumCount() {
        return this.mediumCount;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    public final int getLargeCount() {
        return this.largeCount;
    }

    private final boolean isValid() {
        if (this.largeCount <= 0) goto L15;
        if (this.smallCount <= 0) goto L15;
        if (this.mediumCount <= 0) goto L15;
        if (this.largeSize > this.mediumSize) goto L11;
        return false;
    L11:
        if (this.mediumSize > this.smallSize) goto L13;
        return false;
    L13:
        return true;
    L15:
        if (this.largeCount > 0) goto L17;
    L22:
        return true;
    L17:
        if (this.smallCount <= 0) goto L22;
        if (this.largeSize > this.smallSize) goto L21;
        return false;
    L21:
        return true;
    }

    private final float cost(float targetLargeSize) {
        if (isValid() == true) goto L7;
        return Float.MAX_VALUE;
    L7:
        return Math.abs(targetLargeSize - this.largeSize) * this.priority;
    }

    public final int itemCount() {
        return (this.largeCount + this.mediumCount) + this.smallCount;
    }
}
