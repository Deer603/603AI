package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¨\u0006\u0006"}, d2 = {"binarySearch", "", "T", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "itemIndex", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntervalListKt {
    public static final /* synthetic */ int access$binarySearch(MutableVector $receiver, int itemIndex) {
        return binarySearch($receiver, itemIndex);
    }

    private static final <T> int binarySearch(MutableVector<IntervalList.Interval<T>> r7, int itemIndex) {
        int left = 0;
        int right = r7.getSize() - 1;
    L3:
        if (left >= right) goto L12;
        int middle = ((right - left) / 2) + left;
        int middleValue = r7.content[middle].getStartIndex();
        if (middleValue == itemIndex) goto L6;
        if (middleValue < itemIndex) goto L8;
        right = middle - 1;
        goto L3
    L8:
        left = middle + 1;
        if (itemIndex >= r7.content[left].getStartIndex()) goto L3;
        return middle;
    L6:
        return middle;
    L12:
        return left;
    }
}
