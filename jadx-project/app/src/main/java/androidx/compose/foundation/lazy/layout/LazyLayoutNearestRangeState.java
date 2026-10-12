package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LazyLayoutNearestRangeState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/runtime/State;", "Lkotlin/ranges/IntRange;", "firstVisibleItem", "", "slidingWindowSize", "extraItemCount", "(III)V", "lastFirstVisibleItem", "<set-?>", "value", "getValue", "()Lkotlin/ranges/IntRange;", "setValue", "(Lkotlin/ranges/IntRange;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "update", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutNearestRangeState implements State<IntRange> {
    public static final int $stable = 0;
    private static final Companion Companion = null;
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;
    private final MutableState value$delegate;

    /* JADX INFO: compiled from: LazyLayoutNearestRangeState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState$Companion;", "", "()V", "calculateNearestItemsRange", "Lkotlin/ranges/IntRange;", "firstVisibleItem", "", "slidingWindowSize", "extraItemCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ IntRange access$calculateNearestItemsRange(Companion $this, int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
            return $this.calculateNearestItemsRange(firstVisibleItem, slidingWindowSize, extraItemCount);
        }

        private final IntRange calculateNearestItemsRange(int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
            int slidingWindowStart = (firstVisibleItem / slidingWindowSize) * slidingWindowSize;
            int start = Math.max(slidingWindowStart - extraItemCount, 0);
            int end = (slidingWindowStart + slidingWindowSize) + extraItemCount;
            return RangesKt.until(start, end);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public LazyLayoutNearestRangeState(int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
        this.slidingWindowSize = slidingWindowSize;
        this.extraItemCount = extraItemCount;
        this.value$delegate = SnapshotStateKt.mutableStateOf(Companion.access$calculateNearestItemsRange(Companion, firstVisibleItem, this.slidingWindowSize, this.extraItemCount), SnapshotStateKt.structuralEqualityPolicy());
        this.lastFirstVisibleItem = firstVisibleItem;
    }

    @Override // androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ IntRange getValue() {
        return getValue2();
    }

    private void setValue(IntRange r4) {
        MutableState $this$setValue$iv = this.value$delegate;
        $this$setValue$iv.setValue(r4);
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public IntRange getValue2() {
        State $this$getValue$iv = this.value$delegate;
        return (IntRange) $this$getValue$iv.getValue();
    }

    public final void update(int firstVisibleItem) {
        if (firstVisibleItem == this.lastFirstVisibleItem) goto L6;
        this.lastFirstVisibleItem = firstVisibleItem;
        setValue(Companion.access$calculateNearestItemsRange(Companion, firstVisibleItem, this.slidingWindowSize, this.extraItemCount));
        return;
    }
}
