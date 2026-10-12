package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _USequences.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "sumOfUInt", "(Lkotlin/sequences/Sequence;)I", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UByte;", "sumOfUByte", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/sequences/USequencesKt")
class USequencesKt___USequencesKt {
    public USequencesKt___USequencesKt() {
    }

    public static final int sumOfUInt(Sequence<UInt> r4) {
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

    public static final long sumOfULong(Sequence<ULong> r7) {
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

    public static final int sumOfUByte(Sequence<UByte> r4) {
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

    public static final int sumOfUShort(Sequence<UShort> r4) {
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
