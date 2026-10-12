package kotlin.collections;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a/\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\u0006\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003\"\u0002H\u0002¢\u0006\u0002\u0010\u000b\u001a\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r\"\u0004\b\u0000\u0010\u0002H\u0087\b\u001a$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u000fj\b\u0012\u0004\u0012\u0002H\u0002`\u0010\"\u0004\b\u0000\u0010\u0002H\u0087\b¢\u0006\u0002\u0010\u0011\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r\"\u0004\b\u0000\u0010\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003\"\u0002H\u0002¢\u0006\u0002\u0010\u000b\u001a5\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u000fj\b\u0012\u0004\u0012\u0002H\u0002`\u0010\"\u0004\b\u0000\u0010\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003\"\u0002H\u0002¢\u0006\u0002\u0010\u0012\u001a%\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0016\u001a3\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u00142\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00020\u0003\"\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u000b\u001aC\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0018\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002H\u00020\u001bH\u0087\bø\u0001\u0000\u001aC\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\r\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0018\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002H\u00020\u001bH\u0087\bø\u0001\u0000\u001aF\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\b\"\u0004\b\u0000\u0010!2\u001f\b\u0001\u0010\"\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0\r\u0012\u0004\u0012\u00020#0\u001b¢\u0006\u0002\b$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aN\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\b\"\u0004\b\u0000\u0010!2\u0006\u0010%\u001a\u00020\u00192\u001f\b\u0001\u0010\"\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0\r\u0012\u0004\u0012\u00020#0\u001b¢\u0006\u0002\b$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0019\u0010-\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\b\u001a,\u0010.\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a!\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a!\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\bH\u0087\b\u001aH\u00100\u001a\u0002H1\"\u0010\b\u0000\u00102*\u0006\u0012\u0002\b\u00030\u0001*\u0002H1\"\u0004\b\u0001\u00101*\u0002H22\f\u00103\u001a\b\u0012\u0004\u0012\u0002H104H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u00105\u001a,\u00106\u001a\u00020\u0005\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b7*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0087\b\u001a&\u00108\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u0002092\u0006\u0010:\u001a\u00020;H\u0007\u001a\u001e\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0000\u001aE\u0010=\u001a\u00020\u0019\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020>*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u0001H\u00022\b\b\u0002\u0010?\u001a\u00020\u00192\b\b\u0002\u0010@\u001a\u00020\u0019¢\u0006\u0002\u0010A\u001aS\u0010=\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0006\u0010\u0015\u001a\u0002H\u00022\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`D2\b\b\u0002\u0010?\u001a\u00020\u00192\b\b\u0002\u0010@\u001a\u00020\u0019¢\u0006\u0002\u0010E\u001ag\u0010F\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010G*\b\u0012\u0004\u0012\u0002HG0>*\b\u0012\u0004\u0012\u0002H\u00020\b2\b\u0010H\u001a\u0004\u0018\u0001HG2\b\b\u0002\u0010?\u001a\u00020\u00192\b\b\u0002\u0010@\u001a\u00020\u00192\u0016\b\u0004\u0010I\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001HG0\u001bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010J\u001a>\u0010=\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\b\b\u0002\u0010?\u001a\u00020\u00192\b\b\u0002\u0010@\u001a\u00020\u00192\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00190\u001b\u001a%\u0010L\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0019H\u0002¢\u0006\u0002\bM\u001a\b\u0010N\u001a\u00020#H\u0001\u001a\b\u0010O\u001a\u00020#H\u0001\u001a!\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00032\n\u0010Q\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0002\u0010R\u001a3\u0010P\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u00022\n\u0010Q\u001a\u0006\u0012\u0002\b\u00030\u00012\f\u0010S\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¢\u0006\u0002\u0010T\"\u0019\u0010&\u001a\u00020'*\u0006\u0012\u0002\b\u00030\u00018F¢\u0006\u0006\u001a\u0004\b(\u0010)\"!\u0010*\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006U"}, d2 = {"asCollection", "", "T", "", "isVarargs", "", "([Ljava/lang/Object;Z)Ljava/util/Collection;", "emptyList", "", "listOf", "elements", "([Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "()Ljava/util/ArrayList;", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "listOfNotNull", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "List", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "MutableList", "buildList", "E", "builderAction", "", "Lkotlin/ExtensionFunctionType;", "capacity", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "(Ljava/util/List;)I", "isNotEmpty", "isNullOrEmpty", "orEmpty", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "containsAll", "Lkotlin/internal/OnlyInputTypes;", "shuffled", "", "random", "Lkotlin/random/Random;", "optimizeReadOnlyList", "binarySearch", "", "fromIndex", "toIndex", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "binarySearchBy", "K", "key", "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "comparison", "rangeCheck", "rangeCheck$CollectionsKt__CollectionsKt", "throwIndexOverflow", "throwCountOverflow", "collectionToArrayCommonImpl", "collection", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collections.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    public static final class AnonymousClass1<T> implements Function1<T, Integer> {

        /* JADX INFO: Incorrect field signature: TK; */
        final /* synthetic */ Comparable $key;
        final /* synthetic */ Function1<T, K> $selector;

        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+TK;>;TK;)V */
        public AnonymousClass1(Function1 r1, Comparable r2) {
            this.$selector = r1;
            this.$key = r2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(T r3) {
            return Integer.valueOf(ComparisonsKt.compareValues((Comparable) this.$selector.invoke(r3), this.$key));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Object r2) {
            return invoke(r2);
        }
    }

    public CollectionsKt__CollectionsKt() {
    }

    public static final <T> Collection<T> asCollection(T[] r1, boolean isVarargs) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return new ArrayAsCollection(r1, isVarargs);
    }

    public static /* synthetic */ Collection asCollection$default(Object[] r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        return CollectionsKt.asCollection(r0, r1);
    }

    public static final <T> List<T> emptyList() {
        return EmptyList.INSTANCE;
    }

    public static final <T> List<T> listOf(T... r1) {
        Intrinsics.checkNotNullParameter(r1, "elements");
        if (r1.length <= 0) goto L6;
        return ArraysKt.asList(r1);
    L6:
        return CollectionsKt.emptyList();
    }

    private static final <T> List<T> listOf() {
        return CollectionsKt.emptyList();
    }

    private static final <T> List<T> mutableListOf() {
        return new ArrayList();
    }

    private static final <T> ArrayList<T> arrayListOf() {
        return new ArrayList();
    }

    public static final <T> List<T> mutableListOf(T... r2) {
        Intrinsics.checkNotNullParameter(r2, "elements");
        if (r2.length != 0) goto L5;
        ArrayList r0 = new ArrayList();
    L7:
        return r0;
    L5:
        r0 = new ArrayList(CollectionsKt.asCollection(r2, true));
        goto L7
    }

    public static final <T> ArrayList<T> arrayListOf(T... r2) {
        Intrinsics.checkNotNullParameter(r2, "elements");
        if (r2.length != 0) goto L6;
        return new ArrayList();
    L6:
        return new ArrayList(CollectionsKt.asCollection(r2, true));
    }

    public static final <T> List<T> listOfNotNull(T r1) {
        if (r1 == null) goto L5;
        return CollectionsKt.listOf(r1);
    L5:
        return CollectionsKt.emptyList();
    }

    public static final <T> List<T> listOfNotNull(T... r1) {
        Intrinsics.checkNotNullParameter(r1, "elements");
        return ArraysKt.filterNotNull(r1);
    }

    private static final <T> List<T> List(int size, Function1<? super Integer, ? extends T> r4) {
        Intrinsics.checkNotNullParameter(r4, "init");
        ArrayList r0 = new ArrayList(size);
        int r1 = 0;
    L3:
        if (r1 >= size) goto L6;
        r0.add(r4.invoke(Integer.valueOf(r1)));
        r1 = r1 + 1;
        goto L3
    L6:
        return r0;
    }

    private static final <T> List<T> MutableList(int size, Function1<? super Integer, ? extends T> r6) {
        Intrinsics.checkNotNullParameter(r6, "init");
        ArrayList list = new ArrayList(size);
        int r1 = 0;
    L3:
        if (r1 >= size) goto L6;
        int index = r1;
        list.add(r6.invoke(Integer.valueOf(index)));
        r1 = r1 + 1;
        goto L3
    L6:
        return list;
    }

    private static final <E> List<E> buildList(Function1<? super List<E>, Unit> r1) {
        Intrinsics.checkNotNullParameter(r1, "builderAction");
        List r0 = CollectionsKt.createListBuilder();
        r1.invoke(r0);
        return CollectionsKt.build(r0);
    }

    private static final <E> List<E> buildList(int capacity, Function1<? super List<E>, Unit> r2) {
        Intrinsics.checkNotNullParameter(r2, "builderAction");
        List r0 = CollectionsKt.createListBuilder(capacity);
        r2.invoke(r0);
        return CollectionsKt.build(r0);
    }

    public static final IntRange getIndices(Collection<?> r3) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        return new IntRange(0, r3.size() - 1);
    }

    public static final <T> int getLastIndex(List<? extends T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.size() - 1;
    }

    private static final <T> boolean isNotEmpty(Collection<? extends T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return !r1.isEmpty();
    }

    private static final <T> boolean isNullOrEmpty(Collection<? extends T> r1) {
        if (r1 != null) goto L4;
    L7:
        return true;
    L4:
        if (r1.isEmpty() == true) goto L7;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Collection<T> orEmpty(Collection<? extends T> r1) {
        if (r1 != 0) goto L5;
        return CollectionsKt.emptyList();
    L5:
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> List<T> orEmpty(List<? extends T> r1) {
        if (r1 != 0) goto L5;
        return CollectionsKt.emptyList();
    L5:
        return r1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final Object ifEmpty(Collection $this$ifEmpty, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if ($this$ifEmpty.isEmpty() == false) goto L6;
        return defaultValue.invoke();
    L6:
        return $this$ifEmpty;
    }

    private static final <T> boolean containsAll(Collection<? extends T> r1, Collection<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "elements");
        return r1.containsAll(r2);
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> r3, Random random) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> r0 = CollectionsKt.toMutableList(r3);
        CollectionsKt.shuffle(r0, random);
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> optimizeReadOnlyList(List<? extends T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        switch(r1.size()) {
            case 0: goto L7;
            case 1: goto L9;
            default: goto L8;
        };
    L8:
        return r1;
    L9:
        return CollectionsKt.listOf(r1.get(0));
    L7:
        return CollectionsKt.emptyList();
    }

    public static /* synthetic */ int binarySearch$default(List r0, Comparable r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = r0.size();
    L9:
        return CollectionsKt.binarySearch(r0, r1, r2, r3);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(List<? extends T> r5, T r6, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        rangeCheck$CollectionsKt__CollectionsKt(r5.size(), fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;
    L3:
        if (low > high) goto L11;
        int mid = (low + high) >>> 1;
        Comparable midVal = r5.get(mid);
        int cmp = ComparisonsKt.compareValues(midVal, r6);
        if (cmp < 0) goto L6;
        if (cmp <= 0) goto L9;
        high = mid - 1;
        goto L3
    L9:
        return mid;
    L6:
        low = mid + 1;
        goto L3
    L11:
        return -(low + 1);
    }

    public static /* synthetic */ int binarySearch$default(List r0, Object r1, Comparator r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r4 = r0.size();
    L9:
        return CollectionsKt.binarySearch(r0, r1, r2, r3, r4);
    }

    public static final <T> int binarySearch(List<? extends T> r5, T r6, Comparator<? super T> r7, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r7, "comparator");
        rangeCheck$CollectionsKt__CollectionsKt(r5.size(), fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;
    L3:
        if (low > high) goto L11;
        int mid = (low + high) >>> 1;
        Object midVal = r5.get(mid);
        int cmp = r7.compare(midVal, r6);
        if (cmp < 0) goto L6;
        if (cmp <= 0) goto L9;
        high = mid - 1;
        goto L3
    L9:
        return mid;
    L6:
        low = mid + 1;
        goto L3
    L11:
        return -(low + 1);
    }

    public static /* synthetic */ int binarySearchBy$default(List $this$binarySearchBy_u24default, Comparable key, int fromIndex, int toIndex, Function1 selector, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        fromIndex = 0;
    L6:
        if ((r5 & 4) == 0) goto L8;
        toIndex = $this$binarySearchBy_u24default.size();
    L8:
        Intrinsics.checkNotNullParameter($this$binarySearchBy_u24default, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return CollectionsKt.binarySearch($this$binarySearchBy_u24default, fromIndex, toIndex, new AnonymousClass1(selector, key));
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(List<? extends T> r2, K r3, int fromIndex, int toIndex, Function1<? super T, ? extends K> r6) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r6, "selector");
        return CollectionsKt.binarySearch(r2, fromIndex, toIndex, new AnonymousClass1(r6, r3));
    }

    public static /* synthetic */ int binarySearch$default(List r0, int r1, int r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.size();
    L9:
        return CollectionsKt.binarySearch(r0, r1, r2, r3);
    }

    public static final <T> int binarySearch(List<? extends T> r5, int fromIndex, int toIndex, Function1<? super T, Integer> r8) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r8, "comparison");
        rangeCheck$CollectionsKt__CollectionsKt(r5.size(), fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;
    L3:
        if (low > high) goto L11;
        int mid = (low + high) >>> 1;
        Object midVal = r5.get(mid);
        int cmp = r8.invoke(midVal).intValue();
        if (cmp < 0) goto L6;
        if (cmp <= 0) goto L9;
        high = mid - 1;
        goto L3
    L9:
        return mid;
    L6:
        low = mid + 1;
        goto L3
    L11:
        return -(low + 1);
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int size, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) goto L12;
        if (fromIndex < 0) goto L10;
        if (toIndex > size) goto L8;
        return;
    L8:
        throw new IndexOutOfBoundsException("toIndex (" + toIndex + ") is greater than size (" + size + ").");
    L10:
        throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") is less than zero.");
    L12:
        throw new IllegalArgumentException("fromIndex (" + fromIndex + ") is greater than toIndex (" + toIndex + ").");
    }

    public static final void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final Object[] collectionToArrayCommonImpl(Collection<?> r5) {
        Intrinsics.checkNotNullParameter(r5, "collection");
        if (r5.isEmpty() == true) goto L5;
        Object[] destination = new Object[r5.size()];
        Iterator<?> r1 = r5.iterator();
        int index = 0;
    L8:
        if (r1.hasNext() == false) goto L10;
        destination[index] = r1.next();
        index = index + 1;
        goto L8
    L10:
        return destination;
    L5:
        return new Object[0];
    }

    public static final <T> T[] collectionToArrayCommonImpl(Collection<?> r5, T[] r6) {
        Intrinsics.checkNotNullParameter(r5, "collection");
        Intrinsics.checkNotNullParameter(r6, "array");
        if (r5.isEmpty() == false) goto L7;
        return (T[]) CollectionsKt.terminateCollectionToArray(0, r6);
    L7:
        if (r6.length >= r5.size()) goto L9;
        Object[] r0 = ArraysKt.arrayOfNulls(r6, r5.size());
    L10:
        Iterator<?> r1 = r5.iterator();
        int r2 = 0;
    L12:
        if (r1.hasNext() == false) goto L15;
        r0[r2] = r1.next();
        r2 = r2 + 1;
        goto L12
    L15:
        return (T[]) CollectionsKt.terminateCollectionToArray(r5.size(), r0);
    L9:
        r0 = r6;
        goto L10
    }
}
