package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CollectionToArray.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CollectionToArray {
    private static final Object[] EMPTY = null;
    private static final int MAX_SIZE = 2147483645;

    static {
        EMPTY = new Object[0];
    }

    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.9")
    public static final Object[] toArray(Collection<?> r10) {
        Intrinsics.checkNotNullParameter(r10, "collection");
        int size$iv = r10.size();
        if (size$iv == 0) goto L35;
        Iterator<?> r2 = r10.iterator();
        if (r2.hasNext() == false) goto L36;
        Object[] result$iv = new Object[size$iv];
        int i$iv = 0;
    L9:
        i$iv = i$iv + 1;
        result$iv[i$iv] = r2.next();
        if (i$iv >= result$iv.length) goto L12;
        if (r2.hasNext() == true) goto L9;
        Object[] result = result$iv;
        Object[] r9 = Arrays.copyOf(result, i$iv);
        Intrinsics.checkNotNullExpressionValue(r9, "copyOf(...)");
        return r9;
    L12:
        if (r2.hasNext() == false) goto L37;
        int newSize$iv = ((i$iv * 3) + 1) >>> 1;
        if (newSize$iv <= i$iv) goto L17;
    L21:
        Object[] r7 = Arrays.copyOf(result$iv, newSize$iv);
        Intrinsics.checkNotNullExpressionValue(r7, "copyOf(...)");
        result$iv = r7;
        goto L9
    L17:
        if (i$iv >= MAX_SIZE) goto L20;
        newSize$iv = MAX_SIZE;
        goto L21
    L20:
        throw new OutOfMemoryError();
    L37:
        return result$iv;
    L36:
        return EMPTY;
    L35:
        return EMPTY;
    }

    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.9")
    public static final Object[] toArray(Collection<?> r10, Object[] a) {
        Intrinsics.checkNotNullParameter(r10, "collection");
        if (a == null) goto L45;
        int size$iv = r10.size();
        if (size$iv == 0) goto L7;
        Iterator<?> r4 = r10.iterator();
        if (r4.hasNext() == true) goto L18;
        if (a.length <= 0) goto L54;
        a[0] = null;
    L54:
        return a;
    L18:
        if (size$iv > a.length) goto L20;
        Object[] result$iv = a;
    L21:
        int i$iv = 0;
    L22:
        i$iv = i$iv + 1;
        result$iv[i$iv] = r4.next();
        if (i$iv >= result$iv.length) goto L25;
        if (r4.hasNext() == true) goto L22;
        Object[] result = result$iv;
        if (result != a) goto L40;
        a[i$iv] = null;
        Object[] r3 = a;
    L41:
        Object[] result$iv2 = r3;
        return result$iv2;
    L40:
        r3 = Arrays.copyOf(result, i$iv);
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        goto L41
    L25:
        if (r4.hasNext() == false) goto L55;
        int newSize$iv = ((i$iv * 3) + 1) >>> 1;
        if (newSize$iv <= i$iv) goto L30;
    L34:
        Object[] r8 = Arrays.copyOf(result$iv, newSize$iv);
        Intrinsics.checkNotNullExpressionValue(r8, "copyOf(...)");
        result$iv = r8;
        goto L22
    L30:
        if (i$iv >= MAX_SIZE) goto L33;
        newSize$iv = MAX_SIZE;
        goto L34
    L33:
        throw new OutOfMemoryError();
    L55:
        return result$iv;
    L20:
        Object r6 = Array.newInstance(a.getClass().getComponentType(), size$iv);
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        result$iv = (Object[]) r6;
        goto L21
    L7:
        if (a.length <= 0) goto L54;
        a[0] = null;
        goto L54
    L45:
        throw new NullPointerException();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    private static final Object[] toArrayImpl(Collection<?> r8, Function0<Object[]> r9, Function1<? super Integer, Object[]> r10, Function2<? super Object[], ? super Integer, Object[]> r11) {
        int size = r8.size();
        if (size == 0) goto L5;
        Iterator<?> r2 = r8.iterator();
        if (r2.hasNext() == false) goto L9;
        Object[] r3 = r10.invoke(Integer.valueOf(size));
        int i = 0;
    L11:
        i = i + 1;
        r3[i] = r2.next();
        if (i >= r3.length) goto L14;
        if (r2.hasNext() == true) goto L11;
        return r11.invoke(r3, Integer.valueOf(i));
    L14:
        if (r2.hasNext() == false) goto L15;
        int newSize = ((i * 3) + 1) >>> 1;
        if (newSize <= i) goto L19;
    L23:
        Object[] r6 = Arrays.copyOf(r3, newSize);
        Intrinsics.checkNotNullExpressionValue(r6, "copyOf(...)");
        r3 = r6;
        goto L11
    L19:
        if (i >= MAX_SIZE) goto L22;
        newSize = MAX_SIZE;
        goto L23
    L22:
        throw new OutOfMemoryError();
    L15:
        return r3;
    L9:
        return r9.invoke();
    L5:
        return r9.invoke();
    }
}
