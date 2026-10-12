package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0005H\u0080\b\u001a>\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0005H\u0000\u001a\u001d\u0010\u000e\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a>\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0005H\u0000\u001aD\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0005H\u0000\u001a\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¨\u0006\u0015"}, d2 = {"all", "", "T", "Landroidx/collection/ObjectList;", "predicate", "Lkotlin/Function1;", "fastFilter", "fastMap", "R", "transform", "isSorted", "K", "", "selector", "removeLast", "Landroidx/collection/MutableObjectList;", "(Landroidx/collection/MutableObjectList;)Ljava/lang/Object;", "sortBy", "", "sortedBy", "toMutableObjectList", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExtensionsKt {
    public static final <T, R> ObjectList<R> fastMap(ObjectList<T> r12, Function1<? super T, ? extends R> r13) {
        MutableObjectList target = new MutableObjectList(r12.getSize());
        Object[] content$iv = r12.content;
        int i$iv = 0;
        int r6 = r12._size;
    L3:
        if (i$iv >= r6) goto L6;
        Object it = content$iv[i$iv];
        target.add(r13.invoke(it));
        i$iv = i$iv + 1;
        goto L3
    L6:
        return target;
    }

    public static final <T> ObjectList<T> fastFilter(ObjectList<T> r13, Function1<? super T, Boolean> r14) {
        Object[] content$iv$iv = r13.content;
        int i$iv$iv = 0;
        int r7 = r13._size;
    L4:
        if (i$iv$iv >= r7) goto L9;
        Object it$iv = content$iv$iv[i$iv$iv];
        if (r14.invoke(it$iv).booleanValue() == false) goto L7;
        i$iv$iv = i$iv$iv + 1;
        goto L4
    L7:
        boolean r1 = false;
    L10:
        if (r1 == false) goto L12;
        return r13;
    L12:
        MutableObjectList target = new MutableObjectList(0, 1, null);
        Object[] content$iv = r13.content;
        int i$iv = 0;
        int r6 = r13._size;
    L13:
        if (i$iv >= r6) goto L19;
        Object it = content$iv[i$iv];
        if (r14.invoke(it).booleanValue() == false) goto L17;
        target.add(it);
    L17:
        i$iv = i$iv + 1;
        goto L13
    L19:
        return target;
    L9:
        r1 = true;
        goto L10
    }

    public static final <T> boolean all(ObjectList<T> r9, Function1<? super T, Boolean> r10) {
        Object[] content$iv = r9.content;
        int i$iv = 0;
        int r5 = r9._size;
    L3:
        if (i$iv >= r5) goto L9;
        Object it = content$iv[i$iv];
        if (r10.invoke(it).booleanValue() == false) goto L6;
        i$iv = i$iv + 1;
        goto L3
    L6:
        return false;
    L9:
        return true;
    }

    public static final <T> MutableObjectList<T> toMutableObjectList(ObjectList<T> r10) {
        MutableObjectList target = new MutableObjectList(r10.getSize());
        Object[] content$iv = r10.content;
        int i$iv = 0;
        int r5 = r10._size;
    L3:
        if (i$iv >= r5) goto L6;
        Object it = content$iv[i$iv];
        target.add(it);
        i$iv = i$iv + 1;
        goto L3
    L6:
        return target;
    }

    public static final <T, K extends Comparable<? super K>> ObjectList<T> sortedBy(ObjectList<T> r3, Function1<? super T, ? extends K> r4) {
        if (isSorted(r3, r4) == true) goto L7;
        MutableObjectList it = toMutableObjectList(r3);
        sortBy(it, r4);
        return it;
    L7:
        return r3;
    }

    public static final <T, K extends Comparable<? super K>> boolean isSorted(ObjectList<T> r9, Function1<? super T, ? extends K> r10) {
        if (r9.getSize() > 1) goto L5;
        return true;
    L5:
        Object previousValue = r9.get(0);
        Comparable previousKey = r10.invoke(previousValue);
        if (previousKey != null) goto L8;
        return false;
    L8:
        int i = 1;
        int r5 = r9.getSize();
    L9:
        if (i >= r5) goto L17;
        Object value = r9.get(i);
        K r7 = r10.invoke(value);
        if (r7 == null) goto L12;
        if (previousKey.compareTo(r7) > 0) goto L15;
        previousKey = r7;
        i = i + 1;
        goto L9
    L15:
        return false;
    L12:
        return false;
    L17:
        return true;
    }

    public static final <T, K extends Comparable<? super K>> void sortBy(MutableObjectList<T> r4, final Function1<? super T, ? extends K> r5) {
        List<T> r0 = r4.asMutableList();
        if (r0.size() <= 1) goto L7;
        CollectionsKt.sortWith(r0, new ExtensionsKt$sortBy$$inlined$sortBy$1(r5));
        return;
    }

    public static final <T> T removeLast(MutableObjectList<T> r4) {
        if (r4.isEmpty() == true) goto L7;
        int last = r4.getSize() - 1;
        T r1 = r4.get(last);
        r4.removeAt(last);
        return r1;
    L7:
        throw new NoSuchElementException("List is empty.");
    }
}
