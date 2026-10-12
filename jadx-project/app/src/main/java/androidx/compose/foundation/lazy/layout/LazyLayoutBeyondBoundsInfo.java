package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "()V", "beyondBoundsItems", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "end", "", "getEnd", "()I", "start", "getStart", "addInterval", "hasIntervals", "", "removeInterval", "", "interval", "Interval", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutBeyondBoundsInfo {
    public static final int $stable = 0;
    private final MutableVector<Interval> beyondBoundsItems;

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsInfo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "start", "", "end", "(II)V", "getEnd", "()I", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Interval {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        static {
        }

        public static /* synthetic */ Interval copy$default(Interval r0, int r1, int r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.start;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.end;
        L9:
            return r0.copy(r1, r2);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final Interval copy(int r2, int r3) {
            return new Interval(r2, r3);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof Interval) == true) goto L8;
            return false;
        L8:
            Interval r1 = (Interval) r6;
            if (this.start == r1.start) goto L12;
            return false;
        L12:
            if (this.end == r1.end) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
            boolean value$iv = true;
            if (this.start < 0) goto L5;
            boolean value$iv2 = true;
        L7:
            if (value$iv2 == true) goto L10;
            InlineClassHelperKt.throwIllegalArgumentException("negative start index");
        L10:
            if (this.end >= this.start) goto L14;
            value$iv = false;
        L14:
            if (value$iv == true) goto L18;
            InlineClassHelperKt.throwIllegalArgumentException("end index greater than start");
            return;
        L18:
            return;
        L5:
            value$iv2 = false;
            goto L7
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }
    }

    static {
        $stable = MutableVector.$stable;
    }

    public LazyLayoutBeyondBoundsInfo() {
        this.beyondBoundsItems = new MutableVector(new Interval[16], 0);
    }

    public final Interval addInterval(int start, int end) {
        Interval $this$addInterval_u24lambda_u240 = new Interval(start, end);
        this.beyondBoundsItems.add($this$addInterval_u24lambda_u240);
        return $this$addInterval_u24lambda_u240;
    }

    public final void removeInterval(Interval interval) {
        this.beyondBoundsItems.remove(interval);
    }

    public final boolean hasIntervals() {
        if (this.beyondBoundsItems.getSize() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final int getStart() {
        int minIndex = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> r1 = this.beyondBoundsItems;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L9;
        Interval it = (Interval) content$iv[i$iv];
        if (it.getStart() >= minIndex) goto L7;
        minIndex = it.getStart();
    L7:
        i$iv = i$iv + 1;
        goto L3
    L9:
        if (minIndex < 0) goto L11;
        boolean value$iv = true;
    L13:
        if (value$iv == true) goto L16;
        InlineClassHelperKt.throwIllegalArgumentException("negative minIndex");
    L16:
        return minIndex;
    L11:
        value$iv = false;
        goto L13
    }

    public final int getEnd() {
        int maxIndex = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> r1 = this.beyondBoundsItems;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L9;
        Interval it = (Interval) content$iv[i$iv];
        if (it.getEnd() <= maxIndex) goto L7;
        maxIndex = it.getEnd();
    L7:
        i$iv = i$iv + 1;
        goto L3
    L9:
        return maxIndex;
    }
}
