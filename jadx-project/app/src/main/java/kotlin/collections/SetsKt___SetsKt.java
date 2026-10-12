package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r"}, d2 = {"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
class SetsKt___SetsKt extends SetsKt__SetsKt {
    public SetsKt___SetsKt() {
    }

    public static final <T> Set<T> minus(Set<? extends T> r9, T r10) {
        Intrinsics.checkNotNullParameter(r9, "<this>");
        Iterable result = new LinkedHashSet(MapsKt.mapCapacity(r9.size()));
        boolean removed = false;
        Set<? extends T> $this$filterTo$iv = r9;
        Iterator<T> r4 = $this$filterTo$iv.iterator();
    L4:
        if (r4.hasNext() == false) goto L13;
        T r5 = r4.next();
        if (removed == false) goto L8;
    L10:
        boolean r8 = true;
    L11:
        if (r8 == false) goto L4;
        ((Collection) result).add(r5);
        goto L4
    L8:
        if (Intrinsics.areEqual(r5, r10) == false) goto L10;
        removed = true;
        r8 = false;
        goto L11
    L13:
        Iterable $this$filterTo$iv2 = (Collection) result;
        return (Set) $this$filterTo$iv2;
    }

    public static final <T> Set<T> minus(Set<? extends T> r2, T[] r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "elements");
        LinkedHashSet result = new LinkedHashSet(r2);
        CollectionsKt.removeAll(result, r3);
        return result;
    }

    public static final <T> Set<T> minus(Set<? extends T> r9, Iterable<? extends T> r10) {
        Intrinsics.checkNotNullParameter(r9, "<this>");
        Intrinsics.checkNotNullParameter(r10, "elements");
        Collection<?> r0 = CollectionsKt.convertToListIfNotCollection(r10);
        if (r0.isEmpty() == false) goto L7;
        return CollectionsKt.toSet(r9);
    L7:
        if ((r0 instanceof Set) == false) goto L16;
        Set<? extends T> $this$filterNotTo$iv = r9;
        Collection destination$iv = new LinkedHashSet();
        Iterator<T> r4 = $this$filterNotTo$iv.iterator();
    L10:
        if (r4.hasNext() == false) goto L15;
        T r5 = r4.next();
        if (((Set) r0).contains(r5) == true) goto L10;
        destination$iv.add(r5);
        goto L10
    L15:
        return (Set) destination$iv;
    L16:
        LinkedHashSet result = new LinkedHashSet(r9);
        result.removeAll(r0);
        return result;
    }

    public static final <T> Set<T> minus(Set<? extends T> r2, Sequence<? extends T> r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "elements");
        LinkedHashSet result = new LinkedHashSet(r2);
        CollectionsKt.removeAll(result, r3);
        return result;
    }

    private static final <T> Set<T> minusElement(Set<? extends T> r1, T r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return SetsKt.minus(r1, r2);
    }

    public static final <T> Set<T> plus(Set<? extends T> r2, T r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity(r2.size() + 1));
        result.addAll(r2);
        result.add(r3);
        return result;
    }

    public static final <T> Set<T> plus(Set<? extends T> r3, T[] r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "elements");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity(r3.size() + r4.length));
        result.addAll(r3);
        CollectionsKt.addAll(result, r4);
        return result;
    }

    public static final <T> Set<T> plus(Set<? extends T> r3, Iterable<? extends T> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "elements");
        Integer r0 = CollectionsKt.collectionSizeOrNull(r4);
        if (r0 == null) goto L5;
        int it = r0.intValue();
        int r2 = r3.size() + it;
    L6:
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity(r2));
        result.addAll(r3);
        CollectionsKt.addAll(result, r4);
        return result;
    L5:
        r2 = r3.size() * 2;
        goto L6
    }

    public static final <T> Set<T> plus(Set<? extends T> r2, Sequence<? extends T> r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "elements");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity(r2.size() * 2));
        result.addAll(r2);
        CollectionsKt.addAll(result, r3);
        return result;
    }

    private static final <T> Set<T> plusElement(Set<? extends T> r1, T r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return SetsKt.plus(r1, r2);
    }
}
