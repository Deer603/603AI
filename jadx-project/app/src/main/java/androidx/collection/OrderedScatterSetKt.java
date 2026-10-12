package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderedScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\b\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n\u001a/\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\f\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0011\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0012\u001a/\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0013\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u0014\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EmptyOrderedScatterSet", "Landroidx/collection/MutableOrderedScatterSet;", "", "emptyOrderedScatterSet", "Landroidx/collection/OrderedScatterSet;", "E", "mutableOrderedScatterSetOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "elements", "", "([Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "orderedScatterSetOf", "(Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "([Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OrderedScatterSetKt {
    private static final MutableOrderedScatterSet<Object> EmptyOrderedScatterSet = null;

    static {
        EmptyOrderedScatterSet = new MutableOrderedScatterSet(0);
    }

    public static final <E> OrderedScatterSet<E> emptyOrderedScatterSet() {
        MutableOrderedScatterSet<Object> r0 = EmptyOrderedScatterSet;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.emptyOrderedScatterSet>");
        return r0;
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf() {
        MutableOrderedScatterSet<Object> r0 = EmptyOrderedScatterSet;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.orderedScatterSetOf>");
        return r0;
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E r1) {
        return mutableOrderedScatterSetOf(r1);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E r1, E r2) {
        return mutableOrderedScatterSetOf(r1, r2);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E r1, E r2, E r3) {
        return mutableOrderedScatterSetOf(r1, r2, r3);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E... r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        MutableOrderedScatterSet $this$orderedScatterSetOf_u24lambda_u240 = new MutableOrderedScatterSet(r3.length);
        $this$orderedScatterSetOf_u24lambda_u240.plusAssign(r3);
        return $this$orderedScatterSetOf_u24lambda_u240;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf() {
        int r3 = 0;
        return new MutableOrderedScatterSet(r3, 1, null);
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E r3) {
        MutableOrderedScatterSet<E> r0 = new MutableOrderedScatterSet(1);
        r0.plusAssign(r3);
        return r0;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E r3, E r4) {
        MutableOrderedScatterSet<E> r0 = new MutableOrderedScatterSet(2);
        r0.plusAssign(r3);
        r0.plusAssign(r4);
        return r0;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E r3, E r4, E r5) {
        MutableOrderedScatterSet<E> r0 = new MutableOrderedScatterSet(3);
        r0.plusAssign(r3);
        r0.plusAssign(r4);
        r0.plusAssign(r5);
        return r0;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E... r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        MutableOrderedScatterSet<E> r0 = new MutableOrderedScatterSet(r3.length);
        r0.plusAssign(r3);
        return r0;
    }
}
