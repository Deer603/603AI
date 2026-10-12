package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0082\bJ2\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u000e0\u0017H\u0016J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0012\u001a\u00020\tH\u0096\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u001a\u0010\u001b\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0012\u001a\u00020\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "T", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "()V", "intervals", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "lastInterval", "<set-?>", "", "size", "getSize", "()I", "addInterval", "", "value", "(ILjava/lang/Object;)V", "checkIndexBounds", "index", "forEach", "fromIndex", "toIndex", "block", "Lkotlin/Function1;", "get", "getIntervalForIndex", "itemIndex", "contains", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 0;
    private final MutableVector<IntervalList.Interval<T>> intervals;
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    static {
        $stable = 8;
    }

    public MutableIntervalList() {
        this.intervals = new MutableVector(new IntervalList.Interval[16], 0);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }

    public final void addInterval(int size, T r5) {
        if (size < 0) goto L4;
        boolean value$iv = true;
    L6:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("size should be >=0");
    L9:
        if (size != 0) goto L11;
        return;
    L11:
        IntervalList.Interval<T> r0 = new IntervalList.Interval(getSize(), size, r5);
        this.size = getSize() + size;
        this.intervals.add(r0);
        return;
    L4:
        value$iv = false;
        goto L6
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int fromIndex, int toIndex, Function1<? super IntervalList.Interval<? extends T>, Unit> r11) {
        boolean value$iv = true;
        if (fromIndex >= 0) goto L5;
    L7:
        boolean r4 = false;
    L9:
        if (r4 == true) goto L12;
        InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + fromIndex + ", size " + getSize());
    L12:
        if (toIndex >= 0) goto L14;
    L16:
        boolean r5 = false;
    L17:
        if (r5 == true) goto L20;
        InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + toIndex + ", size " + getSize());
    L20:
        if (toIndex >= fromIndex) goto L24;
        value$iv = false;
    L24:
        if (value$iv == true) goto L26;
        InlineClassHelperKt.throwIllegalArgumentException("toIndex (" + toIndex + ") should be not smaller than fromIndex (" + fromIndex + ')');
    L26:
        int intervalIndex = IntervalListKt.access$binarySearch(this.intervals, fromIndex);
        int itemIndex = this.intervals.content[intervalIndex].getStartIndex();
    L27:
        if (itemIndex > toIndex) goto L29;
        IntervalList.Interval<T> r2 = this.intervals.content[intervalIndex];
        r11.invoke(r2);
        itemIndex = itemIndex + r2.getSize();
        intervalIndex = intervalIndex + 1;
        goto L27
    L29:
        return;
    L14:
        if (toIndex >= getSize()) goto L16;
        r5 = true;
        goto L17
    L5:
        if (fromIndex >= getSize()) goto L7;
        r4 = true;
        goto L9
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval<T> get(int index) {
        boolean r2 = false;
        if (index >= 0) goto L5;
    L7:
        if (r2 == true) goto L10;
        InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + index + ", size " + getSize());
    L10:
        return getIntervalForIndex(index);
    L5:
        if (index >= getSize()) goto L7;
        r2 = true;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final IntervalList.Interval<T> getIntervalForIndex(int r6) {
        IntervalList.Interval r0 = this.lastInterval;
        if (r0 != null) goto L5;
    L7:
        MutableVector<IntervalList.Interval<T>> r1 = this.intervals;
        int r2 = IntervalListKt.access$binarySearch(this.intervals, r6);
        Object r3 = r1.content[r2];
        this.lastInterval = (IntervalList.Interval) r3;
        return (IntervalList.Interval) r3;
    L5:
        if (contains(r0, r6) == false) goto L7;
        return r0;
    }

    private final void checkIndexBounds(int index) {
        boolean r1 = false;
        if (index >= 0) goto L5;
    L7:
        if (r1 == true) goto L10;
        InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + index + ", size " + getSize());
        return;
    L10:
        return;
    L5:
        if (index >= getSize()) goto L7;
        r1 = true;
        goto L7
    }

    private final boolean contains(IntervalList.Interval<? extends T> r4, int index) {
        int r0 = r4.getStartIndex();
        if (index >= (r4.getStartIndex() + r4.getSize())) goto L7;
        if (r0 > index) goto L8;
        return true;
    L8:
        return false;
    L7:
        return false;
    }
}
