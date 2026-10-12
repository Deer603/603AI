package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003()*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006J\b\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\b¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "gridContent", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "(Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;)V", "bucketSize", "", "getBucketSize", "()I", "buckets", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "Lkotlin/collections/ArrayList;", "cachedBucket", "", "cachedBucketIndex", "lastLineIndex", "lastLineStartItemIndex", "lastLineStartKnownSpan", "previousDefaultSpans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "value", "slotsPerLine", "getSlotsPerLine", "setSlotsPerLine", "(I)V", "totalSize", "getTotalSize", "getDefaultSpans", "currentSlotsPerLine", "getLineConfiguration", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "lineIndex", "getLineIndexOfItem", "itemIndex", "invalidateCache", "", "spanOf", "maxSpan", "Bucket", "LazyGridItemSpanScopeImpl", "LineConfiguration", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyGridSpanLayoutProvider {
    public static final int $stable = 0;
    private final ArrayList<Bucket> buckets;
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;
    private final LazyGridIntervalContent gridContent;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "", "firstItemIndex", "", "firstItemKnownSpan", "(II)V", "getFirstItemIndex", "()I", "getFirstItemKnownSpan", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public Bucket(int firstItemIndex, int firstItemKnownSpan) {
            this.firstItemIndex = firstItemIndex;
            this.firstItemKnownSpan = firstItemKnownSpan;
        }

        public /* synthetic */ Bucket(int r1, int r2, int r3, DefaultConstructorMarker r4) {
            if ((r3 & 2) == 0) goto L5;
            r2 = 0;
        L5:
            this(r1, r2);
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LazyGridItemSpanScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "()V", "maxCurrentLineSpan", "", "getMaxCurrentLineSpan", "()I", "setMaxCurrentLineSpan", "(I)V", "maxLineSpan", "getMaxLineSpan", "setMaxLineSpan", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        public static final LazyGridItemSpanScopeImpl INSTANCE = null;
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        static {
            INSTANCE = new LazyGridItemSpanScopeImpl();
        }

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        public void setMaxCurrentLineSpan(int r1) {
            maxCurrentLineSpan = r1;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxLineSpan(int r1) {
            maxLineSpan = r1;
        }
    }

    /* JADX INFO: compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "firstItemIndex", "", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "(ILjava/util/List;)V", "getFirstItemIndex", "()I", "getSpans", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LineConfiguration {
        public static final int $stable = 0;
        private final int firstItemIndex;
        private final List<GridItemSpan> spans;

        static {
            $stable = 8;
        }

        public LineConfiguration(int firstItemIndex, List<GridItemSpan> r2) {
            this.firstItemIndex = firstItemIndex;
            this.spans = r2;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    static {
        $stable = 8;
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent gridContent) {
        this.gridContent = gridContent;
        ArrayList<Bucket> r0 = new ArrayList();
        int r6 = 0;
        r0.add(new Bucket(r6, r6, 2, null));
        this.buckets = r0;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = CollectionsKt.emptyList();
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((((double) getTotalSize()) * 1.0d) / ((double) this.slotsPerLine))) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int currentSlotsPerLine) {
        if (currentSlotsPerLine == this.previousDefaultSpans.size()) goto L11;
        ArrayList r0 = new ArrayList(currentSlotsPerLine);
        int r1 = 0;
    L6:
        if (r1 >= currentSlotsPerLine) goto L8;
        r0.add(GridItemSpan.m846boximpl(LazyGridSpanKt.GridItemSpan(1)));
        r1 = r1 + 1;
        goto L6
    L8:
        ArrayList it = r0;
        this.previousDefaultSpans = it;
        return it;
    L11:
        return this.previousDefaultSpans;
    }

    public final int getTotalSize() {
        return this.gridContent.getIntervals().getSize();
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final void setSlotsPerLine(int value) {
        if (value == this.slotsPerLine) goto L6;
        this.slotsPerLine = value;
        invalidateCache();
        return;
    }

    public final LineConfiguration getLineConfiguration(int lineIndex) {
        if (this.gridContent.getHasCustomSpans$foundation_release() == true) goto L6;
        int firstItemIndex = this.slotsPerLine * lineIndex;
        return new LineConfiguration(firstItemIndex, getDefaultSpans(RangesKt.coerceAtLeast(RangesKt.coerceAtMost(this.slotsPerLine, getTotalSize() - firstItemIndex), 0)));
    L6:
        int firstItemIndex2 = getBucketSize();
        int bucketIndex = Math.min(lineIndex / firstItemIndex2, this.buckets.size() - 1);
        int currentLine = getBucketSize() * bucketIndex;
        int currentItemIndex = this.buckets.get(bucketIndex).getFirstItemIndex();
        int knownCurrentItemSpan = this.buckets.get(bucketIndex).getFirstItemKnownSpan();
        int r6 = this.lastLineIndex;
        if (currentLine > r6) goto L10;
        if (r6 > lineIndex) goto L10;
        boolean r7 = true;
    L11:
        if (r7 == false) goto L14;
        currentLine = this.lastLineIndex;
        currentItemIndex = this.lastLineStartItemIndex;
        knownCurrentItemSpan = this.lastLineStartKnownSpan;
    L19:
        if ((currentLine % getBucketSize()) != 0) goto L27;
        int r8 = getBucketSize();
        int r9 = lineIndex - currentLine;
        if (2 > r9) goto L24;
        if (r9 >= r8) goto L24;
        boolean r10 = true;
    L25:
        if (r10 == false) goto L27;
        boolean cacheThisBucket = true;
    L29:
        if (cacheThisBucket == false) goto L31;
        this.cachedBucketIndex = bucketIndex;
        this.cachedBucket.clear();
    L31:
        if (currentLine > lineIndex) goto L33;
        boolean value$iv = true;
    L35:
        if (value$iv == true) goto L38;
        InlineClassHelperKt.throwIllegalStateException("currentLine (" + currentLine + ") > lineIndex (" + lineIndex + ')');
    L38:
        if (currentLine >= lineIndex) goto L67;
        if (currentItemIndex >= getTotalSize()) goto L67;
        if (cacheThisBucket == false) goto L43;
        this.cachedBucket.add(Integer.valueOf(currentItemIndex));
    L43:
        int spansUsed = 0;
    L45:
        if (spansUsed >= this.slotsPerLine) goto L55;
        if (currentItemIndex >= getTotalSize()) goto L55;
        if (knownCurrentItemSpan != 0) goto L50;
        int it = knownCurrentItemSpan;
        knownCurrentItemSpan = spanOf(currentItemIndex, this.slotsPerLine - spansUsed);
    L52:
        if ((spansUsed + knownCurrentItemSpan) > this.slotsPerLine) goto L55;
        currentItemIndex = currentItemIndex + 1;
        spansUsed = spansUsed + knownCurrentItemSpan;
        knownCurrentItemSpan = it;
        goto L45
    L50:
        it = 0;
    L55:
        currentLine = currentLine + 1;
        if ((currentLine % getBucketSize()) != 0) goto L38;
        if (currentItemIndex >= getTotalSize()) goto L38;
        int currentLineBucket = currentLine / getBucketSize();
        if (this.buckets.size() != currentLineBucket) goto L62;
        boolean value$iv2 = true;
    L64:
        if (value$iv2 == true) goto L66;
        InlineClassHelperKt.throwIllegalStateException("invalid starting point");
    L66:
        this.buckets.add(new Bucket(currentItemIndex, knownCurrentItemSpan));
        goto L38
    L62:
        value$iv2 = false;
    L67:
        this.lastLineIndex = lineIndex;
        this.lastLineStartItemIndex = currentItemIndex;
        this.lastLineStartKnownSpan = knownCurrentItemSpan;
        int firstItemIndex3 = currentItemIndex;
        List spans = new ArrayList();
        int spansUsed2 = 0;
    L69:
        if (spansUsed2 >= this.slotsPerLine) goto L80;
        if (currentItemIndex >= getTotalSize()) goto L80;
        if (knownCurrentItemSpan != 0) goto L74;
        int it2 = knownCurrentItemSpan;
        knownCurrentItemSpan = spanOf(currentItemIndex, this.slotsPerLine - spansUsed2);
    L76:
        if ((spansUsed2 + knownCurrentItemSpan) > this.slotsPerLine) goto L80;
        currentItemIndex = currentItemIndex + 1;
        spans.add(GridItemSpan.m846boximpl(LazyGridSpanKt.GridItemSpan(knownCurrentItemSpan)));
        spansUsed2 = spansUsed2 + knownCurrentItemSpan;
        knownCurrentItemSpan = it2;
        goto L69
    L74:
        it2 = 0;
    L80:
        return new LineConfiguration(firstItemIndex3, spans);
    L33:
        value$iv = false;
    L24:
        r10 = false;
    L27:
        cacheThisBucket = false;
        goto L29
    L14:
        if (bucketIndex != this.cachedBucketIndex) goto L19;
        if ((lineIndex - currentLine) >= this.cachedBucket.size()) goto L19;
        currentItemIndex = this.cachedBucket.get(lineIndex - currentLine).intValue();
        currentLine = lineIndex;
        knownCurrentItemSpan = 0;
    L10:
        r7 = false;
        goto L11
    }

    public final int getLineIndexOfItem(final int itemIndex) {
        int r1 = 0;
        if (getTotalSize() > 0) goto L6;
        return 0;
    L6:
        if (itemIndex >= getTotalSize()) goto L8;
        boolean value$iv = true;
    L10:
        if (value$iv == true) goto L13;
        InlineClassHelperKt.throwIllegalArgumentException("ItemIndex > total count");
    L13:
        if (this.gridContent.getHasCustomSpans$foundation_release() == false) goto L15;
        int it = CollectionsKt.binarySearch$default(this.buckets, 0, 0, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(itemIndex), 3, null);
        int r4 = 2;
        if (it >= 0) goto L20;
        it = (-it) - 2;
    L20:
        int currentLine = getBucketSize() * it;
        int span = this.buckets.get(it).getFirstItemIndex();
        if (span > itemIndex) goto L23;
        boolean value$iv2 = true;
    L25:
        if (value$iv2 == true) goto L27;
        InlineClassHelperKt.throwIllegalArgumentException("currentItemIndex > itemIndex");
    L27:
        int spansUsed = 0;
    L28:
        int r7 = this.slotsPerLine;
        if (span >= itemIndex) goto L48;
        int currentItemIndex = span + 1;
        int span2 = spanOf(span, r7 - spansUsed);
        if ((spansUsed + span2) >= this.slotsPerLine) goto L34;
        spansUsed = spansUsed + span2;
    L38:
        if ((currentLine % getBucketSize()) != 0) goto L46;
        int currentLineBucket = currentLine / getBucketSize();
        if (currentLineBucket < this.buckets.size()) goto L46;
        ArrayList<Bucket> r9 = this.buckets;
        if (spansUsed <= 0) goto L44;
        int r11 = 1;
    L45:
        r9.add(new Bucket(currentItemIndex - r11, r1, r4, null));
        goto L46
    L44:
        r11 = 0;
    L46:
        span = currentItemIndex;
        goto L28
    L34:
        if ((spansUsed + span2) != this.slotsPerLine) goto L36;
        currentLine = currentLine + 1;
        spansUsed = 0;
        goto L38
    L36:
        currentLine = currentLine + 1;
        spansUsed = span2;
        goto L38
    L48:
        if ((spanOf(itemIndex, r7 - spansUsed) + spansUsed) > this.slotsPerLine) goto L50;
        return currentLine;
    L50:
        return currentLine + 1;
    L23:
        value$iv2 = false;
        goto L25
    L15:
        return itemIndex / this.slotsPerLine;
    L8:
        value$iv = false;
        goto L10
    }

    public final int spanOf(int itemIndex, int maxSpan) {
        LazyGridItemSpanScopeImpl $this$spanOf_u24lambda_u2410 = LazyGridItemSpanScopeImpl.INSTANCE;
        $this$spanOf_u24lambda_u2410.setMaxCurrentLineSpan(maxSpan);
        $this$spanOf_u24lambda_u2410.setMaxLineSpan(this.slotsPerLine);
        IntervalList.Interval<LazyGridInterval> r2 = this.gridContent.getIntervals().get(itemIndex);
        int localIntervalIndex = itemIndex - r2.getStartIndex();
        long span = r2.getValue().getSpan().invoke($this$spanOf_u24lambda_u2410, Integer.valueOf(localIntervalIndex)).m853unboximpl();
        return GridItemSpan.m850getCurrentLineSpanimpl(span);
    }

    private final void invalidateCache() {
        this.buckets.clear();
        int r4 = 0;
        this.buckets.add(new Bucket(r4, r4, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }
}
