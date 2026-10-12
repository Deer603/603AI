package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a \u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0001\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a@\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\f0\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000f*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrNull", "", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "collectionSizeOrDefault", "default", "flatten", "", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__IterablesKt$Iterable$1, reason: invalid class name */
    /* JADX INFO: compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 176)
    public static final class AnonymousClass1<T> implements Iterable<T>, KMappedMarker {
        final /* synthetic */ Function0<Iterator<T>> $iterator;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<? extends Iterator<? extends T>> r1) {
            this.$iterator = r1;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.$iterator.invoke();
        }
    }

    public CollectionsKt__IterablesKt() {
    }

    private static final <T> Iterable<T> Iterable(Function0<? extends Iterator<? extends T>> r1) {
        Intrinsics.checkNotNullParameter(r1, "iterator");
        return new AnonymousClass1(r1);
    }

    public static final <T> Integer collectionSizeOrNull(Iterable<? extends T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        if ((r1 instanceof Collection) == true) goto L7;
        return null;
    L7:
        return Integer.valueOf(((Collection) r1).size());
    }

    public static final <T> int collectionSizeOrDefault(Iterable<? extends T> r1, int r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        if ((r1 instanceof Collection) == false) goto L6;
        return ((Collection) r1).size();
    L6:
        return r2;
    }

    public static final <T> List<T> flatten(Iterable<? extends Iterable<? extends T>> r4) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        ArrayList result = new ArrayList();
        Iterator<? extends Iterable<? extends T>> r1 = r4.iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        ArrayList r3 = result;
        CollectionsKt.addAll(r3, r1.next());
        goto L4
    L7:
        return result;
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(Iterable<? extends Pair<? extends T, ? extends R>> r6) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        int expectedSize = CollectionsKt.collectionSizeOrDefault(r6, 10);
        ArrayList listT = new ArrayList(expectedSize);
        ArrayList listR = new ArrayList(expectedSize);
        Iterator<? extends Pair<? extends T, ? extends R>> r3 = r6.iterator();
    L4:
        if (r3.hasNext() == false) goto L7;
        Pair<? extends T, ? extends R> r4 = r3.next();
        listT.add(r4.getFirst());
        listR.add(r4.getSecond());
        goto L4
    L7:
        return TuplesKt.to(listT, listR);
    }
}
