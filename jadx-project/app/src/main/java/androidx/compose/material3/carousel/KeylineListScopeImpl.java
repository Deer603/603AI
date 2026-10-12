package androidx.compose.material3.carousel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: KeylineList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016JT\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002J(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\b\u0010\u001f\u001a\u00020\u0004H\u0002J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002J \u0010\"\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl;", "Landroidx/compose/material3/carousel/KeylineListScope;", "()V", "firstFocalIndex", "", "focalItemSize", "", "pivotIndex", "pivotOffset", "tmpKeylines", "", "Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "add", "", "size", "isAnchor", "", "createKeylinesWithPivot", "", "Landroidx/compose/material3/carousel/Keyline;", "lastFocalIndex", "itemMainAxisSize", "carouselMainAxisSize", "itemSpacing", "createWithAlignment", "Landroidx/compose/material3/carousel/KeylineList;", "carouselAlignment", "Landroidx/compose/material3/carousel/CarouselAlignment;", "createWithAlignment-waks0t8", "(FFI)Landroidx/compose/material3/carousel/KeylineList;", "createWithPivot", "findLastFocalIndex", "isCutoffLeft", "offset", "isCutoffRight", "TmpKeyline", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class KeylineListScopeImpl implements KeylineListScope {
    private int firstFocalIndex;
    private float focalItemSize;
    private int pivotIndex;
    private float pivotOffset;
    private final List<TmpKeyline> tmpKeylines;

    /* JADX INFO: compiled from: KeylineList.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "", "size", "", "isAnchor", "", "(FZ)V", "()Z", "getSize", "()F", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class TmpKeyline {
        private final boolean isAnchor;
        private final float size;

        public static /* synthetic */ TmpKeyline copy$default(TmpKeyline r0, float r1, boolean r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.size;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.isAnchor;
        L9:
            return r0.copy(r1, r2);
        }

        public final float component1() {
            return this.size;
        }

        public final boolean component2() {
            return this.isAnchor;
        }

        public final TmpKeyline copy(float r2, boolean r3) {
            return new TmpKeyline(r2, r3);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof TmpKeyline) == true) goto L8;
            return false;
        L8:
            TmpKeyline r1 = (TmpKeyline) r6;
            if (Float.compare(this.size, r1.size) == 0) goto L12;
            return false;
        L12:
            if (this.isAnchor == r1.isAnchor) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Float.hashCode(this.size) * 31) + Boolean.hashCode(this.isAnchor);
        }

        public String toString() {
            return "TmpKeyline(size=" + this.size + ", isAnchor=" + this.isAnchor + ')';
        }

        public TmpKeyline(float size, boolean isAnchor) {
            this.size = size;
            this.isAnchor = isAnchor;
        }

        public final float getSize() {
            return this.size;
        }

        public final boolean isAnchor() {
            return this.isAnchor;
        }
    }

    public KeylineListScopeImpl() {
        this.firstFocalIndex = -1;
        this.pivotIndex = -1;
        this.tmpKeylines = new ArrayList();
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public void add(float size, boolean isAnchor) {
        this.tmpKeylines.add(new TmpKeyline(size, isAnchor));
        if (size <= this.focalItemSize) goto L6;
        this.firstFocalIndex = CollectionsKt.getLastIndex(this.tmpKeylines);
        this.focalItemSize = size;
        return;
    }

    public final KeylineList createWithPivot(float carouselMainAxisSize, float itemSpacing, int pivotIndex, float pivotOffset) {
        return new KeylineList(createKeylinesWithPivot(pivotIndex, pivotOffset, this.firstFocalIndex, findLastFocalIndex(), this.focalItemSize, carouselMainAxisSize, itemSpacing, this.tmpKeylines));
    }

    /* JADX INFO: renamed from: createWithAlignment-waks0t8, reason: not valid java name */
    public final KeylineList m3015createWithAlignmentwaks0t8(float carouselMainAxisSize, float itemSpacing, int carouselAlignment) {
        int lastFocalIndex = findLastFocalIndex();
        int focalItemCount = lastFocalIndex - this.firstFocalIndex;
        this.pivotIndex = this.firstFocalIndex;
        if (CarouselAlignment.m2999equalsimpl0(carouselAlignment, CarouselAlignment.Companion.m3003getCenterNUL3oTo()) == false) goto L15;
        float itemSpacingSplit = 0.0f;
        if (itemSpacing != 0.0f) goto L7;
        boolean r2 = true;
    L8:
        if (r2 == true) goto L14;
        int r3 = focalItemCount % 2;
        if ((r3 + ((((r3 ^ 2) & ((-r3) | r3)) >> 31) & 2)) == 0) goto L14;
        itemSpacingSplit = itemSpacing / 2.0f;
    L14:
        float r4 = ((carouselMainAxisSize / 2.0f) - ((this.focalItemSize / 2.0f) * focalItemCount)) - itemSpacingSplit;
    L19:
        this.pivotOffset = r4;
        return new KeylineList(createKeylinesWithPivot(this.pivotIndex, this.pivotOffset, this.firstFocalIndex, lastFocalIndex, this.focalItemSize, carouselMainAxisSize, itemSpacing, this.tmpKeylines));
    L7:
        r2 = false;
        goto L8
    L15:
        boolean r0 = CarouselAlignment.m2999equalsimpl0(carouselAlignment, CarouselAlignment.Companion.m3004getEndNUL3oTo());
        float r5 = this.focalItemSize;
        if (r0 == false) goto L18;
        r4 = carouselMainAxisSize - (r5 / 2.0f);
        goto L19
    L18:
        r4 = r5 / 2.0f;
        goto L19
    }

    private final int findLastFocalIndex() {
        int lastFocalIndex = this.firstFocalIndex;
    L4:
        if (lastFocalIndex >= CollectionsKt.getLastIndex(this.tmpKeylines)) goto L11;
        if (this.tmpKeylines.get(lastFocalIndex + 1).getSize() != this.focalItemSize) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == false) goto L11;
        lastFocalIndex = lastFocalIndex + 1;
        goto L4
    L8:
        r1 = false;
    L11:
        return lastFocalIndex;
    }

    private final List<Keyline> createKeylinesWithPivot(int pivotIndex, float pivotOffset, int firstFocalIndex, int lastFocalIndex, float itemMainAxisSize, float carouselMainAxisSize, float itemSpacing, List<TmpKeyline> r38) {
        TmpKeyline pivot = r38.get(pivotIndex);
        List keylines = new ArrayList();
        if (isCutoffLeft(pivot.getSize(), pivotOffset) == false) goto L6;
        float pivotCutoff = pivotOffset - (pivot.getSize() / 2.0f);
    L9:
        float r3 = pivot.getSize();
        if (firstFocalIndex > pivotIndex) goto L13;
        if (pivotIndex > lastFocalIndex) goto L13;
        boolean r6 = true;
    L14:
        Iterable r1 = null;
        keylines.add(new Keyline(r3, pivotOffset, pivotOffset, r6, pivot.isAnchor(), true, pivotCutoff));
        float offset = (pivotOffset - (itemMainAxisSize / 2.0f)) - itemSpacing;
        float unadjustedOffset = (pivotOffset - (itemMainAxisSize / 2.0f)) - itemSpacing;
        Iterable $this$forEach$iv = RangesKt.downTo(pivotIndex - 1, 0);
        Iterator<Integer> r7 = $this$forEach$iv.iterator();
    L16:
        if (r7.hasNext() == false) goto L27;
        int element$iv = ((IntIterator) r7).nextInt();
        TmpKeyline tmp = r38.get(element$iv);
        float tmpOffset = offset - (tmp.getSize() / 2.0f);
        float tmpUnadjustedOffset = unadjustedOffset - (itemMainAxisSize / 2.0f);
        Iterable $this$forEach$iv2 = $this$forEach$iv;
        if (isCutoffLeft(tmp.getSize(), tmpOffset) == false) goto L20;
        float cutoff = Math.abs(tmpOffset - (tmp.getSize() / 2.0f));
    L21:
        float r23 = tmp.getSize();
        if (firstFocalIndex > element$iv) goto L25;
        if (element$iv > lastFocalIndex) goto L25;
        boolean r26 = true;
    L26:
        keylines.add(0, new Keyline(r23, tmpOffset, tmpUnadjustedOffset, r26, tmp.isAnchor(), false, cutoff));
        offset = offset - (tmp.getSize() + itemSpacing);
        unadjustedOffset = unadjustedOffset - (itemMainAxisSize + itemSpacing);
        r1 = null;
        $this$forEach$iv = $this$forEach$iv2;
    L25:
        r26 = false;
        goto L26
    L20:
        cutoff = 0.0f;
        goto L21
    L27:
        float offset2 = (pivotOffset + (itemMainAxisSize / 2.0f)) + itemSpacing;
        float offset3 = itemMainAxisSize / 2.0f;
        float unadjustedOffset2 = (pivotOffset + offset3) + itemSpacing;
        Iterator<Integer> r8 = RangesKt.until(pivotIndex + 1, r38.size()).iterator();
    L29:
        if (r8.hasNext() == false) goto L41;
        int element$iv2 = ((IntIterator) r8).nextInt();
        TmpKeyline tmp2 = r38.get(element$iv2);
        float tmpOffset2 = offset2 + (tmp2.getSize() / 2.0f);
        float tmpUnadjustedOffset2 = unadjustedOffset2 + (itemMainAxisSize / 2.0f);
        float offset4 = offset2;
        float offset5 = tmp2.getSize();
        if (isCutoffRight(offset5, tmpOffset2, carouselMainAxisSize) == false) goto L33;
        float cutoff2 = ((tmp2.getSize() / 2.0f) + tmpOffset2) - carouselMainAxisSize;
    L34:
        float r24 = tmp2.getSize();
        if (firstFocalIndex > element$iv2) goto L38;
        if (element$iv2 > lastFocalIndex) goto L38;
        boolean r27 = true;
    L39:
        keylines.add(new Keyline(r24, tmpOffset2, tmpUnadjustedOffset2, r27, tmp2.isAnchor(), false, cutoff2));
        offset2 = offset4 + (tmp2.getSize() + itemSpacing);
        unadjustedOffset2 = unadjustedOffset2 + (itemMainAxisSize + itemSpacing);
    L38:
        r27 = false;
        goto L39
    L33:
        cutoff2 = 0.0f;
        goto L34
    L41:
        return keylines;
    L13:
        r6 = false;
        goto L14
    L6:
        if (isCutoffRight(pivot.getSize(), pivotOffset, carouselMainAxisSize) == false) goto L8;
        pivotCutoff = ((pivot.getSize() / 2.0f) + pivotOffset) - carouselMainAxisSize;
        goto L9
    L8:
        pivotCutoff = 0.0f;
        goto L9
    }

    private final boolean isCutoffLeft(float size, float offset) {
        if ((offset - (size / 2.0f)) < 0.0f) goto L5;
    L7:
        return false;
    L5:
        if (((size / 2.0f) + offset) <= 0.0f) goto L7;
        return true;
    }

    private final boolean isCutoffRight(float size, float offset, float carouselMainAxisSize) {
        if ((offset - (size / 2.0f)) < carouselMainAxisSize) goto L5;
    L7:
        return false;
    L5:
        if (((size / 2.0f) + offset) <= carouselMainAxisSize) goto L7;
        return true;
    }
}
