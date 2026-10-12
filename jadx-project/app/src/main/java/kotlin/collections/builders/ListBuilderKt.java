package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a=\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\n\u0012\u0006\b\u0001\u0012\u0002H\b0\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fH\u0002¢\u0006\u0002\u0010\r\u001a-\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0017\u001a%\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u001f¨\u0006 "}, d2 = {"arrayOfUninitializedElements", "", "E", "size", "", "(I)[Ljava/lang/Object;", "subarrayContentToString", "", "T", "offset", "length", "thisCollection", "", "([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;", "subarrayContentHashCode", "([Ljava/lang/Object;II)I", "subarrayContentEquals", "", "other", "", "([Ljava/lang/Object;IILjava/util/List;)Z", "copyOfUninitializedElements", "newSize", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "resetAt", "", "index", "([Ljava/lang/Object;I)V", "resetRange", "fromIndex", "toIndex", "([Ljava/lang/Object;II)V", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ListBuilderKt {
    public static final /* synthetic */ boolean access$subarrayContentEquals(Object[] $receiver, int offset, int length, List other) {
        return subarrayContentEquals($receiver, offset, length, other);
    }

    public static final /* synthetic */ int access$subarrayContentHashCode(Object[] $receiver, int offset, int length) {
        return subarrayContentHashCode($receiver, offset, length);
    }

    public static final /* synthetic */ String access$subarrayContentToString(Object[] $receiver, int offset, int length, Collection thisCollection) {
        return subarrayContentToString($receiver, offset, length, thisCollection);
    }

    public static final <E> E[] arrayOfUninitializedElements(int r2) {
        if (r2 < 0) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L9;
        return (E[]) new Object[r2];
    L9:
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    L4:
        r0 = false;
        goto L5
    }

    private static final <T> String subarrayContentToString(T[] r4, int offset, int length, Collection<? extends T> r7) {
        StringBuilder sb = new StringBuilder((length * 3) + 2);
        sb.append("[");
        int i = 0;
    L3:
        if (i >= length) goto L11;
        if (i <= 0) goto L6;
        sb.append(", ");
    L6:
        T r2 = r4[offset + i];
        if (r2 != r7) goto L9;
        sb.append("(this Collection)");
    L10:
        i = i + 1;
        goto L3
    L9:
        sb.append(r2);
        goto L10
    L11:
        sb.append("]");
        String r3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(r3, "toString(...)");
        return r3;
    }

    private static final <T> int subarrayContentHashCode(T[] r5, int offset, int length) {
        int result = 1;
        int i = 0;
    L3:
        if (i >= length) goto L9;
        T r2 = r5[offset + i];
        int r3 = result * 31;
        if (r2 == null) goto L7;
        int r4 = r2.hashCode();
    L8:
        result = r3 + r4;
        i = i + 1;
        goto L3
    L7:
        r4 = 0;
        goto L8
    L9:
        return result;
    }

    private static final <T> boolean subarrayContentEquals(T[] r4, int offset, int length, List<?> r7) {
        if (length == r7.size()) goto L5;
        return false;
    L5:
        int i = 0;
    L6:
        if (i >= length) goto L11;
        if (Intrinsics.areEqual(r4[offset + i], r7.get(i)) == false) goto L9;
        i = i + 1;
        goto L6
    L9:
        return false;
    L11:
        return true;
    }

    public static final <T> T[] copyOfUninitializedElements(T[] r2, int r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        T[] r0 = (T[]) Arrays.copyOf(r2, r3);
        Intrinsics.checkNotNullExpressionValue(r0, "copyOf(...)");
        return r0;
    }

    public static final <E> void resetAt(E[] r1, int index) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        r1[index] = null;
    }

    public static final <E> void resetRange(E[] r1, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        int index = fromIndex;
    L3:
        if (index >= toIndex) goto L5;
        resetAt(r1, index);
        index = index + 1;
        goto L3
    }
}
