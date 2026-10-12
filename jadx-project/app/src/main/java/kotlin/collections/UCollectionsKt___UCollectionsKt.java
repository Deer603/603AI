package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"toUByteArray", "Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "Lkotlin/UInt;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "Lkotlin/ULong;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "Lkotlin/UShort;", "(Ljava/util/Collection;)[S", "sum", "", "sumOfUInt", "(Ljava/lang/Iterable;)I", "sumOfULong", "(Ljava/lang/Iterable;)J", "sumOfUByte", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    public UCollectionsKt___UCollectionsKt() {
    }

    public static final byte[] toUByteArray(Collection<UByte> r5) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        byte[] result = UByteArray.m7495constructorimpl(r5.size());
        int index = 0;
        Iterator<UByte> r2 = r5.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        byte element = r2.next().m7493unboximpl();
        UByteArray.m7506setVurrAj0(result, index, element);
        index = index + 1;
        goto L4
    L6:
        return result;
    }

    public static final int[] toUIntArray(Collection<UInt> r5) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        int[] result = UIntArray.m7574constructorimpl(r5.size());
        int index = 0;
        Iterator<UInt> r2 = r5.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        int element = r2.next().m7572unboximpl();
        UIntArray.m7585setVXSXFK8(result, index, element);
        index = index + 1;
        goto L4
    L6:
        return result;
    }

    public static final long[] toULongArray(Collection<ULong> r6) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        long[] result = ULongArray.m7653constructorimpl(r6.size());
        int index = 0;
        Iterator<ULong> r2 = r6.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        long element = r2.next().m7651unboximpl();
        ULongArray.m7664setk8EXiF4(result, index, element);
        index = index + 1;
        goto L4
    L6:
        return result;
    }

    public static final short[] toUShortArray(Collection<UShort> r5) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        short[] result = UShortArray.m7758constructorimpl(r5.size());
        int index = 0;
        Iterator<UShort> r2 = r5.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        short element = r2.next().m7756unboximpl();
        UShortArray.m7769set01HTLdE(result, index, element);
        index = index + 1;
        goto L4
    L6:
        return result;
    }

    public static final int sumOfUInt(Iterable<UInt> r4) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int sum = 0;
        Iterator<UInt> r1 = r4.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        int element = r1.next().m7572unboximpl();
        sum = UInt.m7520constructorimpl(sum + element);
        goto L4
    L6:
        return sum;
    }

    public static final long sumOfULong(Iterable<ULong> r7) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        long sum = 0;
        Iterator<ULong> r2 = r7.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        long element = r2.next().m7651unboximpl();
        sum = ULong.m7599constructorimpl(sum + element);
        goto L4
    L6:
        return sum;
    }

    public static final int sumOfUByte(Iterable<UByte> r4) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int sum = 0;
        Iterator<UByte> r1 = r4.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        byte element = r1.next().m7493unboximpl();
        sum = UInt.m7520constructorimpl(UInt.m7520constructorimpl(element & UByte.MAX_VALUE) + sum);
        goto L4
    L6:
        return sum;
    }

    public static final int sumOfUShort(Iterable<UShort> r4) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        int sum = 0;
        Iterator<UShort> r1 = r4.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        short element = r1.next().m7756unboximpl();
        sum = UInt.m7520constructorimpl(UInt.m7520constructorimpl(65535 & element) + sum);
        goto L4
    L6:
        return sum;
    }
}
