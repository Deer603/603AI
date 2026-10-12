package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0003\b\t\nJ\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "", "calculateCrossAxisCellSizes", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "", "spacing", "Adaptive", "Fixed", "FixedSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StaggeredGridCells {

    /* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "minSize", "Landroidx/compose/ui/unit/Dp;", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "equals", "", "other", "", "hashCode", "", "calculateCrossAxisCellSizes", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Adaptive implements StaggeredGridCells {
        public static final int $stable = 0;
        private final float minSize;

        static {
        }

        public /* synthetic */ Adaptive(float r1, DefaultConstructorMarker r2) {
            this(r1);
        }

        private Adaptive(float minSize) {
            this.minSize = minSize;
            if (Dp.m6972compareTo0680j_4(this.minSize, Dp.m6973constructorimpl(0)) <= 0) goto L5;
            boolean value$iv = true;
        L7:
            if (value$iv == true) goto L11;
            InlineClassHelperKt.throwIllegalArgumentException("invalid minSize");
            return;
        L11:
            return;
        L5:
            value$iv = false;
            goto L7
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public int[] calculateCrossAxisCellSizes(Density $this$calculateCrossAxisCellSizes, int availableSize, int spacing) {
            int count = Math.max((availableSize + spacing) / ($this$calculateCrossAxisCellSizes.mo370roundToPx0680j_4(this.minSize) + spacing), 1);
            return LazyStaggeredGridCellsKt.access$calculateCellsCrossAxisSizeImpl(availableSize, count, spacing);
        }

        public int hashCode() {
            return Dp.m6979hashCodeimpl(this.minSize);
        }

        public boolean equals(Object other) {
            if ((other instanceof Adaptive) == true) goto L5;
        L7:
            return false;
        L5:
            if (Dp.m6978equalsimpl0(this.minSize, ((Adaptive) other).minSize) == false) goto L7;
            return true;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\u0003H\u0016J\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "count", "", "(I)V", "equals", "", "other", "", "hashCode", "calculateCrossAxisCellSizes", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Fixed implements StaggeredGridCells {
        public static final int $stable = 0;
        private final int count;

        static {
        }

        public Fixed(int count) {
            this.count = count;
            if (this.count <= 0) goto L5;
            boolean value$iv = true;
        L7:
            if (value$iv == true) goto L11;
            InlineClassHelperKt.throwIllegalArgumentException("grid with no rows/columns");
            return;
        L11:
            return;
        L5:
            value$iv = false;
            goto L7
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public int[] calculateCrossAxisCellSizes(Density $this$calculateCrossAxisCellSizes, int availableSize, int spacing) {
            return LazyStaggeredGridCellsKt.access$calculateCellsCrossAxisSizeImpl(availableSize, this.count, spacing);
        }

        public int hashCode() {
            return -this.count;
        }

        public boolean equals(Object other) {
            if ((other instanceof Fixed) == true) goto L5;
        L7:
            return false;
        L5:
            if (this.count != ((Fixed) other).count) goto L7;
            return true;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$FixedSize;", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "size", "Landroidx/compose/ui/unit/Dp;", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "equals", "", "other", "", "hashCode", "", "calculateCrossAxisCellSizes", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FixedSize implements StaggeredGridCells {
        public static final int $stable = 0;
        private final float size;

        static {
        }

        public /* synthetic */ FixedSize(float r1, DefaultConstructorMarker r2) {
            this(r1);
        }

        private FixedSize(float size) {
            this.size = size;
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
        public int[] calculateCrossAxisCellSizes(Density $this$calculateCrossAxisCellSizes, int availableSize, int spacing) {
            int cellSize = $this$calculateCrossAxisCellSizes.mo370roundToPx0680j_4(this.size);
            int r3 = 0;
            if ((cellSize + spacing) >= (availableSize + spacing)) goto L8;
            int cellCount = (availableSize + spacing) / (cellSize + spacing);
            int[] r2 = new int[cellCount];
        L5:
            if (r3 >= cellCount) goto L11;
            r2[r3] = cellSize;
            r3 = r3 + 1;
        L11:
            return r2;
        L8:
            r2 = new int[1];
        L9:
            if (r3 >= 1) goto L11;
            r2[r3] = availableSize;
            r3 = r3 + 1;
            goto L9
        }

        public int hashCode() {
            return Dp.m6979hashCodeimpl(this.size);
        }

        public boolean equals(Object other) {
            if ((other instanceof FixedSize) == true) goto L5;
        L7:
            return false;
        L5:
            if (Dp.m6978equalsimpl0(this.size, ((FixedSize) other).size) == false) goto L7;
            return true;
        }
    }

    int[] calculateCrossAxisCellSizes(Density r1, int r2, int r3);
}
