package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a-\u0010\u0000\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0006\u001a.\u0010\u0007\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0087\b\u001a.\u0010\n\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0087\b\u001a(\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\r\u001a)\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000eH\u0087\n\u001a.\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0087\n¢\u0006\u0002\u0010\u0010\u001a)\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0087\n\u001a(\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\r\u001a)\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000eH\u0087\n\u001a.\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0087\n¢\u0006\u0002\u0010\u0010\u001a)\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0087\n\u001a&\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\u001a&\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\u001a-\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u000f¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000eH\u0000\u001a&\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\u001a&\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\u001a-\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u000f¢\u0006\u0002\u0010\u0014\u001a&\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\u001a-\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u000f¢\u0006\u0002\u0010\u0014\u001a&\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0002\b\u0017\u001a*\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a\u001a*\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a\u001a9\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u001d\u001a&\u0010\u0000\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0087\b¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0007¢\u0006\u0002\u0010#\u001a\u001f\u0010$\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0007¢\u0006\u0002\u0010#\u001a\u001d\u0010%\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0007¢\u0006\u0002\u0010#\u001a\u001f\u0010&\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001eH\u0007¢\u0006\u0002\u0010#\u001a*\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a\u001a*\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a\u001a9\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u001d¨\u0006'"}, d2 = {"remove", "", "T", "Lkotlin/internal/OnlyInputTypes;", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "removeAll", "elements", "", "retainAll", "plusAssign", "", "(Ljava/util/Collection;Ljava/lang/Object;)V", "", "", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "Lkotlin/sequences/Sequence;", "minusAssign", "addAll", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "convertToListIfNotCollection", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "", "predicate", "Lkotlin/Function1;", "filterInPlace", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "index", "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeFirst", "(Ljava/util/List;)Ljava/lang/Object;", "removeFirstOrNull", "removeLast", "removeLastOrNull", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt {
    public CollectionsKt__MutableCollectionsKt() {
    }

    private static final <T> boolean remove(Collection<? extends T> r1, T r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return TypeIntrinsics.asMutableCollection(r1).remove(r2);
    }

    private static final <T> boolean removeAll(Collection<? extends T> r1, Collection<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        return TypeIntrinsics.asMutableCollection(r1).removeAll(r2);
    }

    private static final <T> boolean retainAll(Collection<? extends T> r1, Collection<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        return TypeIntrinsics.asMutableCollection(r1).retainAll(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void plusAssign(Collection<? super T> r1, T r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        r1.add(r2);
    }

    private static final <T> void plusAssign(Collection<? super T> r1, Iterable<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        CollectionsKt.addAll(r1, r2);
    }

    private static final <T> void plusAssign(Collection<? super T> r1, T[] r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        CollectionsKt.addAll(r1, r2);
    }

    private static final <T> void plusAssign(Collection<? super T> r1, Sequence<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        CollectionsKt.addAll(r1, r2);
    }

    private static final <T> void minusAssign(Collection<? super T> r1, T r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        r1.remove(r2);
    }

    private static final <T> void minusAssign(Collection<? super T> r1, Iterable<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        CollectionsKt.removeAll(r1, r2);
    }

    private static final <T> void minusAssign(Collection<? super T> r1, T[] r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        CollectionsKt.removeAll(r1, r2);
    }

    private static final <T> void minusAssign(Collection<? super T> r1, Sequence<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        CollectionsKt.removeAll(r1, r2);
    }

    public static final <T> boolean addAll(Collection<? super T> r4, Iterable<? extends T> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "elements");
        if ((r5 instanceof Collection) == true) goto L5;
        boolean result = false;
        Iterator<? extends T> r1 = r5.iterator();
    L8:
        if (r1.hasNext() == false) goto L12;
        Object item = r1.next();
        if (r4.add(item) == false) goto L8;
        result = true;
        goto L8
    L12:
        return result;
    L5:
        return r4.addAll((Collection) r5);
    }

    public static final <T> boolean addAll(Collection<? super T> r4, Sequence<? extends T> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "elements");
        boolean result = false;
        Iterator<? extends T> r1 = r5.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Object item = r1.next();
        if (r4.add(item) == false) goto L4;
        result = true;
        goto L4
    L8:
        return result;
    }

    public static final <T> boolean addAll(Collection<? super T> r1, T[] r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        return r1.addAll(ArraysKt.asList(r2));
    }

    public static final <T> Collection<T> convertToListIfNotCollection(Iterable<? extends T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        if ((r1 instanceof Collection) == false) goto L6;
        return (Collection) r1;
    L6:
        return CollectionsKt.toList(r1);
    }

    public static final <T> boolean removeAll(Collection<? super T> r1, Iterable<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        return r1.removeAll(CollectionsKt.convertToListIfNotCollection(r2));
    }

    public static final <T> boolean removeAll(Collection<? super T> r2, Sequence<? extends T> r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "elements");
        List list = SequencesKt.toList(r3);
        if (list.isEmpty() == false) goto L5;
    L7:
        return false;
    L5:
        if (r2.removeAll(list) == false) goto L7;
        return true;
    }

    public static final <T> boolean removeAll(Collection<? super T> r3, T[] r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "elements");
        if (r4.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L11;
        if (r3.removeAll(ArraysKt.asList(r4)) == false) goto L11;
        return true;
    L11:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    public static final <T> boolean retainAll(Collection<? super T> r1, Iterable<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        return r1.retainAll(CollectionsKt.convertToListIfNotCollection(r2));
    }

    public static final <T> boolean retainAll(Collection<? super T> r1, T[] r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        if (r2.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L10;
        return r1.retainAll(ArraysKt.asList(r2));
    L10:
        return retainNothing$CollectionsKt__MutableCollectionsKt(r1);
    L5:
        r0 = false;
        goto L6
    }

    public static final <T> boolean retainAll(Collection<? super T> r2, Sequence<? extends T> r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "elements");
        List list = SequencesKt.toList(r3);
        if (list.isEmpty() == true) goto L7;
        return r2.retainAll(list);
    L7:
        return retainNothing$CollectionsKt__MutableCollectionsKt(r2);
    }

    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection<?> r1) {
        boolean result = !r1.isEmpty();
        r1.clear();
        return result;
    }

    public static final <T> boolean removeAll(Iterable<? extends T> r1, Function1<? super T, Boolean> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt(r1, r2, true);
    }

    public static final <T> boolean retainAll(Iterable<? extends T> r1, Function1<? super T, Boolean> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt(r1, r2, false);
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable<? extends T> r4, Function1<? super T, Boolean> r5, boolean r6) {
        boolean r0 = false;
        Iterator<? extends T> r1 = r4.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        if (r5.invoke(r1.next()).booleanValue() != r6) goto L4;
        r1.remove();
        r0 = true;
        goto L4
    L9:
        return r0;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @ReplaceWith(expression = "removeAt(index)", imports = {}))
    private static final <T> T remove(List<T> r1, int index) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.remove(index);
    }

    public static final <T> T removeFirst(List<T> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.isEmpty() == true) goto L7;
        return r2.remove(0);
    L7:
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T removeFirstOrNull(List<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        if (r1.isEmpty() == false) goto L6;
        return null;
    L6:
        return r1.remove(0);
    }

    public static final <T> T removeLast(List<T> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.isEmpty() == true) goto L7;
        return r2.remove(CollectionsKt.getLastIndex(r2));
    L7:
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T removeLastOrNull(List<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        if (r1.isEmpty() == false) goto L6;
        return null;
    L6:
        return r1.remove(CollectionsKt.getLastIndex(r1));
    }

    public static final <T> boolean removeAll(List<T> r1, Function1<? super T, Boolean> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt(r1, r2, true);
    }

    public static final <T> boolean retainAll(List<T> r1, Function1<? super T, Boolean> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt(r1, r2, false);
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List<T> r5, Function1<? super T, Boolean> r6, boolean predicateResultToRemove) {
        if ((r5 instanceof RandomAccess) == true) goto L6;
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
        return filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable(r5), r6, predicateResultToRemove);
    L6:
        int writeIndex = 0;
        int readIndex = 0;
        int r2 = CollectionsKt.getLastIndex(r5);
        if (0 > r2) goto L16;
    L8:
        T r3 = r5.get(readIndex);
        if (r6.invoke(r3).booleanValue() == predicateResultToRemove) goto L14;
        if (writeIndex == readIndex) goto L13;
        r5.set(writeIndex, r3);
    L13:
        writeIndex = writeIndex + 1;
    L14:
        if (readIndex == r2) goto L16;
        readIndex = readIndex + 1;
    L16:
        int readIndex2 = r5.size();
        if (writeIndex >= readIndex2) goto L25;
        int removeIndex = CollectionsKt.getLastIndex(r5);
        if (writeIndex > removeIndex) goto L23;
    L20:
        r5.remove(removeIndex);
        if (removeIndex == writeIndex) goto L29;
        removeIndex = removeIndex - 1;
        goto L20
    L29:
        return true;
    L23:
        return true;
    L25:
        return false;
    }
}
