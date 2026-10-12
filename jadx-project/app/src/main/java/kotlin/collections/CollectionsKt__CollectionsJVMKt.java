package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a0\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0006j\b\u0012\u0004\u0012\u0002H\u0002`\u0007\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\bH\u0081\b¢\u0006\u0002\u0010\t\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0081\bø\u0001\u0000\u001a?\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0081\bø\u0001\u0000\u001a\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e\"\u0004\b\u0000\u0010\u000bH\u0001\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0001\"\u0004\b\u0000\u0010\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0001\u001a\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0017H\u0087\b\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0019H\u0007\u001a&\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u001a\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001fH\u0081\b¢\u0006\u0002\u0010 \u001a4\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0081\b¢\u0006\u0002\u0010\"\u001a/\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010$\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0000¢\u0006\u0002\u0010%\u001a1\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\b\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\b2\u0006\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\u0010)\u001a\u0011\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0012H\u0081\b\u001a\u0011\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0081\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"listOf", "", "T", "element", "(Ljava/lang/Object;)Ljava/util/List;", "asArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "buildListInternal", "E", "builderAction", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "capacity", "", "createListBuilder", "build", "builder", "toList", "Ljava/util/Enumeration;", "shuffled", "", "random", "Ljava/util/Random;", "collectionToArray", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "terminateCollectionToArray", "collectionSize", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "checkIndexOverflow", "index", "checkCountOverflow", "count", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsJVMKt {
    public CollectionsKt__CollectionsJVMKt() {
    }

    public static final <T> List<T> listOf(T r2) {
        List<T> r0 = Collections.singletonList(r2);
        Intrinsics.checkNotNullExpressionValue(r0, "singletonList(...)");
        return r0;
    }

    private static final <T> ArrayList<T> asArrayList(T[] r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return new ArrayList(CollectionsKt.asCollection(r2, true));
    }

    private static final <E> List<E> buildListInternal(Function1<? super List<E>, Unit> r1) {
        Intrinsics.checkNotNullParameter(r1, "builderAction");
        List r0 = CollectionsKt.createListBuilder();
        r1.invoke(r0);
        return CollectionsKt.build(r0);
    }

    private static final <E> List<E> buildListInternal(int capacity, Function1<? super List<E>, Unit> r2) {
        Intrinsics.checkNotNullParameter(r2, "builderAction");
        List r0 = CollectionsKt.createListBuilder(capacity);
        r2.invoke(r0);
        return CollectionsKt.build(r0);
    }

    public static final <E> List<E> createListBuilder() {
        int r3 = 0;
        return new ListBuilder(r3, 1, null);
    }

    public static final <E> List<E> createListBuilder(int capacity) {
        return new ListBuilder(capacity);
    }

    public static final <E> List<E> build(List<E> r1) {
        Intrinsics.checkNotNullParameter(r1, "builder");
        return ((ListBuilder) r1).build();
    }

    private static final <T> List<T> toList(Enumeration<T> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        ArrayList r0 = Collections.list(r2);
        Intrinsics.checkNotNullExpressionValue(r0, "list(...)");
        return r0;
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> r3) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        List<T> r0 = CollectionsKt.toMutableList(r3);
        Collections.shuffle(r0);
        return r0;
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> r3, Random random) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> r0 = CollectionsKt.toMutableList(r3);
        Collections.shuffle(r0, random);
        return r0;
    }

    private static final Object[] collectionToArray(Collection<?> r1) {
        Intrinsics.checkNotNullParameter(r1, "collection");
        return CollectionToArray.toArray(r1);
    }

    private static final <T> T[] collectionToArray(Collection<?> r1, T[] r2) {
        Intrinsics.checkNotNullParameter(r1, "collection");
        Intrinsics.checkNotNullParameter(r2, "array");
        return (T[]) CollectionToArray.toArray(r1, r2);
    }

    public static final <T> T[] terminateCollectionToArray(int collectionSize, T[] r2) {
        Intrinsics.checkNotNullParameter(r2, "array");
        if (collectionSize >= r2.length) goto L5;
        r2[collectionSize] = null;
    L5:
        return r2;
    }

    public static final <T> Object[] copyToArrayOfAny(T[] r2, boolean isVarargs) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (isVarargs == true) goto L5;
    L7:
        Object[] r0 = Arrays.copyOf(r2, r2.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(r0, "copyOf(...)");
        return r0;
    L5:
        if (Intrinsics.areEqual(r2.getClass(), Object[].class) == false) goto L7;
        return r2;
    }

    private static final int checkIndexOverflow(int index) {
        if (index >= 0) goto L4;
        CollectionsKt.throwIndexOverflow();
    L4:
        return index;
    }

    private static final int checkCountOverflow(int count) {
        if (count >= 0) goto L4;
        CollectionsKt.throwCountOverflow();
    L4:
        return count;
    }
}
