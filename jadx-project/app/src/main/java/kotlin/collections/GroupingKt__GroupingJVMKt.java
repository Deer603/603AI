package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: GroupingJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007\u001aZ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u00072\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f\u0012\u0004\u0012\u0002H\b0\u000bH\u0081\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"eachCount", "", "K", "", "T", "Lkotlin/collections/Grouping;", "mapValuesInPlace", "", "R", "V", "f", "Lkotlin/Function1;", "", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
class GroupingKt__GroupingJVMKt {
    public GroupingKt__GroupingJVMKt() {
    }

    public static final <T, K> Map<K, Integer> eachCount(Grouping<T, ? extends K> r20) {
        Intrinsics.checkNotNullParameter(r20, "<this>");
        Map destination$iv = new LinkedHashMap();
        Grouping<T, ? extends K> r2 = r20;
        Iterator<T> r6 = r2.sourceIterator();
    L4:
        if (r6.hasNext() == false) goto L16;
        K r8 = r2.keyOf(r6.next());
        Object accumulator$iv$iv = destination$iv.get(r8);
        if (accumulator$iv$iv == null) goto L8;
    L10:
        boolean first$iv = false;
    L12:
        if (first$iv == false) goto L14;
        Object r17 = new Ref.IntRef();
    L15:
        Ref.IntRef acc = (Ref.IntRef) r17;
        acc.element++;
        destination$iv.put(r8, acc);
        r2 = r2;
        goto L4
    L14:
        r17 = accumulator$iv$iv;
        goto L15
    L8:
        if (destination$iv.containsKey(r8) == true) goto L10;
        first$iv = true;
        goto L12
    L16:
        Iterator<T> r1 = destination$iv.entrySet().iterator();
    L18:
        if (r1.hasNext() == false) goto L21;
        Map.Entry it = (Map.Entry) r1.next();
        Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
        TypeIntrinsics.asMutableMapEntry(it).setValue(Integer.valueOf(((Ref.IntRef) it.getValue()).element));
        goto L18
    L21:
        return TypeIntrinsics.asMutableMap(destination$iv);
    }

    private static final <K, V, R> Map<K, R> mapValuesInPlace(Map<K, V> r8, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r9) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "f");
        Iterable $this$forEach$iv = r8.entrySet();
        Iterator r2 = $this$forEach$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        Object element$iv = r2.next();
        Map.Entry it = (Map.Entry) element$iv;
        Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
        TypeIntrinsics.asMutableMapEntry(it).setValue(r9.invoke(it));
        goto L4
    L7:
        return TypeIntrinsics.asMutableMap(r8);
    }
}
