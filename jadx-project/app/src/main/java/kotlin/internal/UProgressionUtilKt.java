package kotlin.internal;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.ULong;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m8635differenceModuloWZ9TVnA(int a, int b, int c) {
        int ac = Integer.remainderUnsigned(a, c);
        int bc = Integer.remainderUnsigned(b, c);
        if (Integer.compareUnsigned(ac, bc) < 0) goto L5;
        int r2 = ac - bc;
    L7:
        return UInt.m7520constructorimpl(r2);
    L5:
        r2 = UInt.m7520constructorimpl(ac - bc) + c;
        goto L7
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m8636differenceModulosambcqE(long a, long b, long c) {
        long ac = Long.remainderUnsigned(a, c);
        long bc = Long.remainderUnsigned(b, c);
        if (Long.compareUnsigned(ac, bc) < 0) goto L5;
        long r4 = ac - bc;
    L7:
        return ULong.m7599constructorimpl(r4);
    L5:
        r4 = ULong.m7599constructorimpl(ac - bc) + c;
        goto L7
    }

    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m8638getProgressionLastElementNkh28Cs(int start, int end, int step) {
        if (step > 0) goto L4;
        if (step >= 0) goto L14;
        if (Integer.compareUnsigned(start, end) > 0) goto L12;
    L16:
        return end;
    L12:
        return UInt.m7520constructorimpl(m8635differenceModuloWZ9TVnA(start, end, UInt.m7520constructorimpl(-step)) + end);
    L14:
        throw new IllegalArgumentException("Step is zero.");
    L4:
        if (Integer.compareUnsigned(start, end) >= 0) goto L16;
        return UInt.m7520constructorimpl(end - m8635differenceModuloWZ9TVnA(end, start, UInt.m7520constructorimpl(step)));
    }

    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m8637getProgressionLastElement7ftBX0g(long start, long end, long step) {
        if (step <= 0) goto L9;
        if (Long.compareUnsigned(start, end) < 0) goto L17;
    L18:
        return end;
    L17:
        return ULong.m7599constructorimpl(end - m8636differenceModulosambcqE(end, start, ULong.m7599constructorimpl(step)));
    L9:
        if (step >= 0) goto L16;
        if (Long.compareUnsigned(start, end) <= 0) goto L18;
        return ULong.m7599constructorimpl(m8636differenceModulosambcqE(start, end, ULong.m7599constructorimpl(-step)) + end);
    L16:
        throw new IllegalArgumentException("Step is zero.");
    }
}
