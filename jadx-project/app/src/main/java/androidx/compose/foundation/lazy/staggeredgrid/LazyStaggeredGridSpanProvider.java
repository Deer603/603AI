package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: LazyStaggeredGridSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "(Landroidx/compose/foundation/lazy/layout/IntervalList;)V", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "isFullSpan", "", "itemIndex", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridSpanProvider {
    public static final int $stable = 0;
    private final IntervalList<LazyStaggeredGridInterval> intervals;

    static {
        $stable = 8;
    }

    public LazyStaggeredGridSpanProvider(IntervalList<LazyStaggeredGridInterval> r1) {
        this.intervals = r1;
    }

    public final IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean isFullSpan(int itemIndex) {
        if (itemIndex >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == true) goto L10;
        return false;
    L10:
        IntervalList.Interval<LazyStaggeredGridInterval> r3 = this.intervals.get(itemIndex);
        Function1<Integer, StaggeredGridItemSpan> r4 = r3.getValue().getSpan();
        int localIndex = itemIndex - r3.getStartIndex();
        if (r4 == null) goto L16;
        if (r4.invoke(Integer.valueOf(localIndex)) != StaggeredGridItemSpan.Companion.getFullLine()) goto L16;
        return true;
    L16:
        return false;
    L5:
        if (itemIndex >= this.intervals.getSize()) goto L7;
        r2 = true;
        goto L8
    }
}
