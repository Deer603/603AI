package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: LazyLayoutKeyIndexMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "nearestRange", "Lkotlin/ranges/IntRange;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)V", "keys", "", "", "[Ljava/lang/Object;", "keysStartIndex", "", "map", "Landroidx/collection/ObjectIntMap;", "getIndex", "key", "getKey", "index", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    public static final int $stable = 0;
    private final Object[] keys;
    private final int keysStartIndex;
    private final ObjectIntMap<Object> map;

    static {
        $stable = 8;
    }

    public NearestRangeKeyIndexMap(IntRange nearestRange, LazyLayoutIntervalContent<?> r10) {
        IntervalList list = r10.getIntervals();
        final int first = nearestRange.getFirst();
        if (first < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("negative nearestRange.first");
    L9:
        final int last = Math.min(nearestRange.getLast(), list.getSize() - 1);
        if (last >= first) goto L12;
        this.map = ObjectIntMapKt.emptyObjectIntMap();
        this.keys = new Object[0];
        this.keysStartIndex = 0;
        return;
    L12:
        int size = (last - first) + 1;
        this.keys = new Object[size];
        this.keysStartIndex = first;
        final MutableObjectIntMap map = new MutableObjectIntMap(size);
        list.forEach(first, last, new NearestRangeKeyIndexMap$2$1(first, last, map, this));
        this.map = map;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public static final /* synthetic */ Object[] access$getKeys$p(NearestRangeKeyIndexMap $this) {
        return $this.keys;
    }

    public static final /* synthetic */ int access$getKeysStartIndex$p(NearestRangeKeyIndexMap $this) {
        return $this.keysStartIndex;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(Object key) {
        ObjectIntMap<Object> r0 = this.map;
        int index$iv = r0.findKeyIndex(key);
        if (index$iv < 0) goto L6;
        return r0.values[index$iv];
    L6:
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public Object getKey(int index) {
        Object[] r0 = this.keys;
        int r1 = index - this.keysStartIndex;
        if (r1 < 0) goto L8;
        if (r1 > ArraysKt.getLastIndex(r0)) goto L8;
        return r0[r1];
    L8:
        return null;
    }
}
