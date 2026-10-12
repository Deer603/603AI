package kotlin.collections;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class UArraySortingKt {
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m7884partition4UcCI2c(byte[] array, int left, int right) {
        int i = left;
        int j = right;
        byte pivot = UByteArray.m7501getw2LRezQ(array, (left + right) / 2);
    L3:
        if (i > j) goto L12;
    L5:
        if (Intrinsics.compare(UByteArray.m7501getw2LRezQ(array, i) & UByte.MAX_VALUE, pivot & UByte.MAX_VALUE) >= 0) goto L8;
        i = i + 1;
    L8:
        if (Intrinsics.compare(UByteArray.m7501getw2LRezQ(array, j) & UByte.MAX_VALUE, pivot & UByte.MAX_VALUE) <= 0) goto L10;
        j = j - 1;
        goto L8
    L10:
        if (i > j) goto L3;
        byte tmp = UByteArray.m7501getw2LRezQ(array, i);
        UByteArray.m7506setVurrAj0(array, i, UByteArray.m7501getw2LRezQ(array, j));
        UByteArray.m7506setVurrAj0(array, j, tmp);
        i = i + 1;
        j = j - 1;
        goto L3
    L12:
        return i;
    }

    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m7888quickSort4UcCI2c(byte[] array, int left, int right) {
        int index = m7884partition4UcCI2c(array, left, right);
        if (left >= (index - 1)) goto L5;
        m7888quickSort4UcCI2c(array, left, index - 1);
    L5:
        if (index >= right) goto L8;
        m7888quickSort4UcCI2c(array, index, right);
        return;
    }

    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m7885partitionAa5vz7o(short[] array, int left, int right) {
        int i = left;
        int j = right;
        short pivot = UShortArray.m7764getMh2AYeg(array, (left + right) / 2);
    L3:
        if (i > j) goto L12;
    L5:
        if (Intrinsics.compare(UShortArray.m7764getMh2AYeg(array, i) & UShort.MAX_VALUE, pivot & UShort.MAX_VALUE) >= 0) goto L8;
        i = i + 1;
    L8:
        if (Intrinsics.compare(UShortArray.m7764getMh2AYeg(array, j) & UShort.MAX_VALUE, pivot & UShort.MAX_VALUE) <= 0) goto L10;
        j = j - 1;
        goto L8
    L10:
        if (i > j) goto L3;
        short tmp = UShortArray.m7764getMh2AYeg(array, i);
        UShortArray.m7769set01HTLdE(array, i, UShortArray.m7764getMh2AYeg(array, j));
        UShortArray.m7769set01HTLdE(array, j, tmp);
        i = i + 1;
        j = j - 1;
        goto L3
    L12:
        return i;
    }

    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m7889quickSortAa5vz7o(short[] array, int left, int right) {
        int index = m7885partitionAa5vz7o(array, left, right);
        if (left >= (index - 1)) goto L5;
        m7889quickSortAa5vz7o(array, left, index - 1);
    L5:
        if (index >= right) goto L8;
        m7889quickSortAa5vz7o(array, index, right);
        return;
    }

    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m7886partitionoBK06Vg(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = UIntArray.m7580getpVg5ArA(array, (left + right) / 2);
    L3:
        if (i > j) goto L12;
    L5:
        if (Integer.compareUnsigned(UIntArray.m7580getpVg5ArA(array, i), pivot) >= 0) goto L8;
        i = i + 1;
    L8:
        if (Integer.compareUnsigned(UIntArray.m7580getpVg5ArA(array, j), pivot) <= 0) goto L10;
        j = j - 1;
        goto L8
    L10:
        if (i > j) goto L3;
        int tmp = UIntArray.m7580getpVg5ArA(array, i);
        UIntArray.m7585setVXSXFK8(array, i, UIntArray.m7580getpVg5ArA(array, j));
        UIntArray.m7585setVXSXFK8(array, j, tmp);
        i = i + 1;
        j = j - 1;
        goto L3
    L12:
        return i;
    }

    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m7890quickSortoBK06Vg(int[] array, int left, int right) {
        int index = m7886partitionoBK06Vg(array, left, right);
        if (left >= (index - 1)) goto L5;
        m7890quickSortoBK06Vg(array, left, index - 1);
    L5:
        if (index >= right) goto L8;
        m7890quickSortoBK06Vg(array, index, right);
        return;
    }

    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m7883partitionnroSd4(long[] array, int left, int right) {
        int i = left;
        int j = right;
        long pivot = ULongArray.m7659getsVKNKU(array, (left + right) / 2);
    L3:
        if (i > j) goto L12;
    L5:
        if (Long.compareUnsigned(ULongArray.m7659getsVKNKU(array, i), pivot) >= 0) goto L8;
        i = i + 1;
    L8:
        if (Long.compareUnsigned(ULongArray.m7659getsVKNKU(array, j), pivot) <= 0) goto L10;
        j = j - 1;
        goto L8
    L10:
        if (i > j) goto L3;
        long tmp = ULongArray.m7659getsVKNKU(array, i);
        ULongArray.m7664setk8EXiF4(array, i, ULongArray.m7659getsVKNKU(array, j));
        ULongArray.m7664setk8EXiF4(array, j, tmp);
        i = i + 1;
        j = j - 1;
        goto L3
    L12:
        return i;
    }

    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m7887quickSortnroSd4(long[] array, int left, int right) {
        int index = m7883partitionnroSd4(array, left, right);
        if (left >= (index - 1)) goto L5;
        m7887quickSortnroSd4(array, left, index - 1);
    L5:
        if (index >= right) goto L8;
        m7887quickSortnroSd4(array, index, right);
        return;
    }

    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m7892sortArray4UcCI2c(byte[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        m7888quickSort4UcCI2c(array, fromIndex, toIndex - 1);
    }

    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m7893sortArrayAa5vz7o(short[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        m7889quickSortAa5vz7o(array, fromIndex, toIndex - 1);
    }

    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m7894sortArrayoBK06Vg(int[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        m7890quickSortoBK06Vg(array, fromIndex, toIndex - 1);
    }

    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m7891sortArraynroSd4(long[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        m7887quickSortnroSd4(array, fromIndex, toIndex - 1);
    }
}
