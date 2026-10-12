package kotlin.collections;

import androidx.autofill.HintConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Grouping.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u009e\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000\u001a·\u0001\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a¿\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u000526\u0010\u0015\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00162K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0017H\u0087\bø\u0001\u0000\u001aØ\u0001\u0010\u0018\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u001026\u0010\u0015\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00162K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0017H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u007f\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u001a\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a\u0093\u0001\u0010\u0018\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\u001a\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u008b\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001e0\u0001\"\u0004\b\u0000\u0010\u001e\"\b\b\u0001\u0010\u0004*\u0002H\u001e\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u001e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u001e0\u0017H\u0087\bø\u0001\u0000\u001a¤\u0001\u0010\u001f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u001e\"\b\b\u0001\u0010\u0004*\u0002H\u001e\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001e0\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u001e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u001e0\u0017H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010 \u001aI\u0010!\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0016\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\"0\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u0010H\u0007¢\u0006\u0002\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"aggregate", "", "K", "R", "T", "Lkotlin/collections/Grouping;", "operation", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "key", "accumulator", "element", "", "first", "aggregateTo", "M", "", "destination", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "fold", "initialValueSelector", "Lkotlin/Function2;", "Lkotlin/Function3;", "foldTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "initialValue", "(Lkotlin/collections/Grouping;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "(Lkotlin/collections/Grouping;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "reduce", "S", "reduceTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "eachCountTo", "", "(Lkotlin/collections/Grouping;Ljava/util/Map;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
class GroupingKt__GroupingKt extends GroupingKt__GroupingJVMKt {
    public GroupingKt__GroupingKt() {
    }

    public static final <T, K, R> Map<K, R> aggregate(Grouping<T, ? extends K> r9, Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> r10) {
        Intrinsics.checkNotNullParameter(r9, "<this>");
        Intrinsics.checkNotNullParameter(r10, "operation");
        LinkedHashMap r1 = new LinkedHashMap();
        Iterator<T> r4 = r9.sourceIterator();
    L4:
        if (r4.hasNext() == false) goto L13;
        T r5 = r4.next();
        Object key$iv = r9.keyOf(r5);
        Object accumulator$iv = r1.get(key$iv);
        if (accumulator$iv == null) goto L8;
    L10:
        boolean r8 = false;
    L11:
        r1.put(key$iv, r10.invoke(key$iv, accumulator$iv, r5, Boolean.valueOf(r8)));
        goto L4
    L8:
        if (r1.containsKey(key$iv) == true) goto L10;
        r8 = true;
        goto L11
    L13:
        return r1;
    }

    public static final <T, K, R, M extends Map<? super K, R>> M aggregateTo(Grouping<T, ? extends K> r6, M r7, Function4<? super K, ? super R, ? super T, ? super Boolean, ? extends R> r8) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        Intrinsics.checkNotNullParameter(r7, "destination");
        Intrinsics.checkNotNullParameter(r8, "operation");
        Iterator<T> r1 = r6.sourceIterator();
    L4:
        if (r1.hasNext() == false) goto L12;
        T r2 = r1.next();
        Object key = r6.keyOf(r2);
        Object accumulator = r7.get(key);
        if (accumulator == null) goto L8;
    L10:
        boolean r5 = false;
    L11:
        r7.put(key, r8.invoke(key, accumulator, r2, Boolean.valueOf(r5)));
        goto L4
    L8:
        if (r7.containsKey(key) == true) goto L10;
        r5 = true;
        goto L11
    L12:
        return r7;
    }

    public static final <T, K, R> Map<K, R> fold(Grouping<T, ? extends K> r19, Function2<? super K, ? super T, ? extends R> r20, Function3<? super K, ? super R, ? super T, ? extends R> r21) {
        Function2<? super K, ? super T, ? extends R> r0 = r20;
        Intrinsics.checkNotNullParameter(r19, "<this>");
        Intrinsics.checkNotNullParameter(r0, "initialValueSelector");
        Intrinsics.checkNotNullParameter(r21, "operation");
        int $i$f$fold = 0;
        Map destination$iv$iv = new LinkedHashMap();
        Iterator<T> r9 = r19.sourceIterator();
    L4:
        if (r9.hasNext() == false) goto L17;
        T r10 = r9.next();
        K r11 = r19.keyOf(r10);
        Object accumulator$iv$iv = destination$iv$iv.get(r11);
        if (accumulator$iv$iv == null) goto L8;
    L10:
        boolean first = false;
    L12:
        if (first == false) goto L14;
        Object key = r11;
        Object r1 = r0.invoke(key, r10);
    L15:
        destination$iv$iv.put(r11, r21.invoke(key, r1, r10));
        r0 = r20;
        $i$f$fold = $i$f$fold;
        goto L4
    L14:
        key = r11;
        r1 = accumulator$iv$iv;
        goto L15
    L8:
        if (destination$iv$iv.containsKey(r11) == true) goto L10;
        first = true;
        goto L12
    L17:
        return destination$iv$iv;
    }

    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(Grouping<T, ? extends K> r17, M r18, Function2<? super K, ? super T, ? extends R> r19, Function3<? super K, ? super R, ? super T, ? extends R> r20) {
        Function2<? super K, ? super T, ? extends R> r1 = r19;
        Intrinsics.checkNotNullParameter(r17, "<this>");
        Intrinsics.checkNotNullParameter(r18, "destination");
        Intrinsics.checkNotNullParameter(r1, "initialValueSelector");
        Intrinsics.checkNotNullParameter(r20, "operation");
        Iterator<T> r7 = r17.sourceIterator();
    L4:
        if (r7.hasNext() == false) goto L17;
        T r8 = r7.next();
        Object key$iv = r17.keyOf(r8);
        Object accumulator$iv = r18.get(key$iv);
        if (accumulator$iv == null) goto L8;
    L10:
        boolean first = false;
    L12:
        if (first == false) goto L14;
        Object r2 = r1.invoke(key$iv, r8);
    L15:
        r18.put(key$iv, r20.invoke(key$iv, r2, r8));
        r1 = r19;
        goto L4
    L14:
        r2 = accumulator$iv;
        goto L15
    L8:
        if (r18.containsKey(key$iv) == true) goto L10;
        first = true;
        goto L12
    L17:
        return r18;
    }

    public static final <T, K, R> Map<K, R> fold(Grouping<T, ? extends K> r17, R r18, Function2<? super R, ? super T, ? extends R> r19) {
        Intrinsics.checkNotNullParameter(r17, "<this>");
        Intrinsics.checkNotNullParameter(r19, "operation");
        int $i$f$fold = 0;
        Map destination$iv$iv = new LinkedHashMap();
        Iterator<T> r8 = r17.sourceIterator();
    L4:
        if (r8.hasNext() == false) goto L17;
        T r9 = r8.next();
        K r10 = r17.keyOf(r9);
        Object accumulator$iv$iv = destination$iv$iv.get(r10);
        if (accumulator$iv$iv == null) goto L8;
    L10:
        boolean first = false;
    L11:
        int $i$f$fold2 = $i$f$fold;
        if (first == false) goto L14;
        Object r1 = r18;
    L15:
        destination$iv$iv.put(r10, r19.invoke(r1, r9));
        $i$f$fold = $i$f$fold2;
        goto L4
    L14:
        r1 = accumulator$iv$iv;
        goto L15
    L8:
        if (destination$iv$iv.containsKey(r10) == true) goto L10;
        first = true;
        goto L11
    L17:
        return destination$iv$iv;
    }

    public static final <T, K, R, M extends Map<? super K, R>> M foldTo(Grouping<T, ? extends K> r12, M r13, R r14, Function2<? super R, ? super T, ? extends R> r15) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        Intrinsics.checkNotNullParameter(r13, "destination");
        Intrinsics.checkNotNullParameter(r15, "operation");
        Iterator<T> r3 = r12.sourceIterator();
    L4:
        if (r3.hasNext() == false) goto L17;
        T r4 = r3.next();
        K r5 = r12.keyOf(r4);
        Object accumulator$iv = r13.get(r5);
        if (accumulator$iv == null) goto L8;
    L10:
        boolean first = false;
    L12:
        if (first == false) goto L14;
        Object r11 = r14;
    L15:
        r13.put(r5, r15.invoke(r11, r4));
        goto L4
    L14:
        r11 = accumulator$iv;
        goto L15
    L8:
        if (r13.containsKey(r5) == true) goto L10;
        first = true;
        goto L12
    L17:
        return r13;
    }

    public static final <S, T extends S, K> Map<K, S> reduce(Grouping<T, ? extends K> r18, Function3<? super K, ? super S, ? super T, ? extends S> r19) {
        Intrinsics.checkNotNullParameter(r18, "<this>");
        Intrinsics.checkNotNullParameter(r19, "operation");
        LinkedHashMap r5 = new LinkedHashMap();
        Iterator<T> r8 = r18.sourceIterator();
    L4:
        if (r8.hasNext() == false) goto L17;
        T r9 = r8.next();
        Object key$iv$iv = r18.keyOf(r9);
        Object accumulator$iv$iv = r5.get(key$iv$iv);
        if (accumulator$iv$iv == null) goto L8;
    L10:
        boolean first = false;
    L11:
        Object e = r9;
        if (first == true) goto L15;
        e = r19.invoke(key$iv$iv, accumulator$iv$iv, e);
    L15:
        r5.put(key$iv$iv, e);
        goto L4
    L8:
        if (r5.containsKey(key$iv$iv) == true) goto L10;
        first = true;
        goto L11
    L17:
        return r5;
    }

    public static final <S, T extends S, K, M extends Map<? super K, S>> M reduceTo(Grouping<T, ? extends K> r13, M r14, Function3<? super K, ? super S, ? super T, ? extends S> r15) {
        Intrinsics.checkNotNullParameter(r13, "<this>");
        Intrinsics.checkNotNullParameter(r14, "destination");
        Intrinsics.checkNotNullParameter(r15, "operation");
        Iterator<T> r3 = r13.sourceIterator();
    L4:
        if (r3.hasNext() == false) goto L17;
        T r4 = r3.next();
        Object key$iv = r13.keyOf(r4);
        Object accumulator$iv = r14.get(key$iv);
        if (accumulator$iv == null) goto L8;
    L10:
        boolean first = false;
    L11:
        Object e = r4;
        if (first == true) goto L15;
        e = r15.invoke(key$iv, accumulator$iv, e);
    L15:
        r14.put(key$iv, e);
        goto L4
    L8:
        if (r14.containsKey(key$iv) == true) goto L10;
        first = true;
        goto L11
    L17:
        return r14;
    }

    public static final <T, K, M extends Map<? super K, Integer>> M eachCountTo(Grouping<T, ? extends K> r19, M r20) {
        Intrinsics.checkNotNullParameter(r19, "<this>");
        Intrinsics.checkNotNullParameter(r20, "destination");
        Iterator<T> r8 = r19.sourceIterator();
    L4:
        if (r8.hasNext() == false) goto L17;
        K r10 = r19.keyOf(r8.next());
        Object accumulator$iv$iv = r20.get(r10);
        if (accumulator$iv$iv == null) goto L8;
    L10:
        boolean first$iv = false;
    L12:
        if (first$iv == false) goto L14;
        Object r17 = 0;
    L15:
        int acc = ((Number) r17).intValue();
        r20.put(r10, Integer.valueOf(acc + 1));
        goto L4
    L14:
        r17 = accumulator$iv$iv;
        goto L15
    L8:
        if (r20.containsKey(r10) == true) goto L10;
        first$iv = true;
        goto L12
    L17:
        return r20;
    }
}
