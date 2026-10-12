package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ScatterSetWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u001a1\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0002\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\nH\u0000¨\u0006\u000b"}, d2 = {"fastAny", "", "", "", "block", "Lkotlin/Function1;", "fastForEach", "", "T", "wrapIntoSet", "Landroidx/collection/ScatterSet;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScatterSetWrapperKt {
    public static final <T> Set<T> wrapIntoSet(ScatterSet<T> r1) {
        return new ScatterSetWrapper(r1);
    }

    public static final <T> void fastForEach(Set<? extends T> r21, Function1<? super T, Unit> r22) {
        int $i$f$fastForEach = 0;
        if ((r21 instanceof ScatterSetWrapper) == false) goto L25;
        ScatterSet<T> r3 = ((ScatterSetWrapper) r21).getSet$runtime_release();
        Object[] elements$iv = r3.elements;
        long[] m$iv$iv = r3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L30;
    L6:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int $i$f$fastForEach2 = $i$f$fastForEach;
        ScatterSet<T> r17 = r3;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L20;
        int r4 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L9:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L13;
        boolean r19 = true;
    L14:
        if (r19 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        r22.invoke(elements$iv[index$iv$iv]);
    L17:
        slot$iv$iv = slot$iv$iv >> r4;
        j$iv$iv = j$iv$iv + 1;
        r4 = r4;
        goto L9
    L13:
        r19 = false;
        goto L14
    L19:
        if (bitCount$iv$iv == r4) goto L20;
        return;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L38;
        i$iv$iv = i$iv$iv + 1;
        $i$f$fastForEach = $i$f$fastForEach2;
        r3 = r17;
        goto L6
    L38:
        return;
    L30:
        return;
    L25:
        Set<? extends T> $this$forEach$iv = r21;
        Iterator<T> r5 = $this$forEach$iv.iterator();
    L27:
        if (r5.hasNext() == false) goto L39;
        Object element$iv = r5.next();
        r22.invoke(element$iv);
        goto L27
    }

    public static final boolean fastAny(Set<? extends Object> r24, Function1<Object, Boolean> r25) {
        int $i$f$fastAny = 0;
        if ((r24 instanceof ScatterSetWrapper) == false) goto L28;
        ScatterSet this_$iv = ((ScatterSetWrapper) r24).getSet$runtime_release();
        Object[] elements$iv$iv = this_$iv.elements;
        long[] m$iv$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L6:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$fastAny2 = $i$f$fastAny;
        ScatterSet this_$iv2 = this_$iv;
        if (((((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r3 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L9:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L22;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L13;
        int $i$f$isFull = 1;
    L14:
        if ($i$f$isFull == 0) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Object element$iv = elements$iv$iv[index$iv$iv$iv];
        if (r25.invoke(element$iv).booleanValue() == false) goto L20;
        return true;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r3;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r3 = r3;
        goto L9
    L13:
        $i$f$isFull = 0;
        goto L14
    L22:
        if (bitCount$iv$iv$iv != r3) goto L27;
    L23:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L27;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        $i$f$fastAny = $i$f$fastAny2;
        this_$iv = this_$iv2;
    L27:
        return false;
    L28:
        Set<? extends Object> $this$any$iv = r24;
        if (($this$any$iv instanceof Collection) == true) goto L31;
    L33:
        Iterator r4 = $this$any$iv.iterator();
    L35:
        if (r4.hasNext() == false) goto L39;
        Object element$iv2 = r4.next();
        if (r25.invoke(element$iv2).booleanValue() == false) goto L35;
        return true;
    L39:
        return false;
    L31:
        if ($this$any$iv.isEmpty() == false) goto L33;
        return false;
    }
}
