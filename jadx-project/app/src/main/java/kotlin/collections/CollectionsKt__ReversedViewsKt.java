package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\b\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0002\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0002\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u000b\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000bH\u0007¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"reverseElementIndex", "", "", "index", "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "reverseIteratorIndex", "reverseIteratorIndex$CollectionsKt__ReversedViewsKt", "asReversed", "T", "", "asReversedMutable", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    public CollectionsKt__ReversedViewsKt() {
    }

    public static final /* synthetic */ int access$reverseElementIndex(List $receiver, int index) {
        return reverseElementIndex$CollectionsKt__ReversedViewsKt($receiver, index);
    }

    public static final /* synthetic */ int access$reverseIteratorIndex(List $receiver, int index) {
        return reverseIteratorIndex$CollectionsKt__ReversedViewsKt($receiver, index);
    }

    public static final /* synthetic */ int access$reversePositionIndex(List $receiver, int index) {
        return reversePositionIndex$CollectionsKt__ReversedViewsKt($receiver, index);
    }

    private static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(List<?> r5, int index) {
        if (index >= 0) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r1 == false) goto L12;
        return CollectionsKt.getLastIndex(r5) - index;
    L12:
        throw new IndexOutOfBoundsException("Element index " + index + " must be in range [" + new IntRange(0, CollectionsKt.getLastIndex(r5)) + "].");
    L5:
        if (index > CollectionsKt.getLastIndex(r5)) goto L7;
        r1 = true;
        goto L8
    }

    private static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(List<?> r5, int index) {
        if (index >= 0) goto L5;
    L7:
        boolean r1 = false;
    L8:
        if (r1 == false) goto L12;
        return r5.size() - index;
    L12:
        throw new IndexOutOfBoundsException("Position index " + index + " must be in range [" + new IntRange(0, r5.size()) + "].");
    L5:
        if (index > r5.size()) goto L7;
        r1 = true;
        goto L8
    }

    private static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(List<?> r1, int index) {
        return CollectionsKt.getLastIndex(r1) - index;
    }

    public static final <T> List<T> asReversed(List<? extends T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return new ReversedListReadOnly(r1);
    }

    public static final <T> List<T> asReversedMutable(List<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return new ReversedList(r1);
    }
}
