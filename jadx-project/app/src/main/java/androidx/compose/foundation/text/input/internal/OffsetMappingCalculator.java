package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: OffsetMappingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J=\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "", "()V", "ops", "Landroidx/compose/foundation/text/input/internal/OpArray;", "[I", "opsSize", "", "map", "Landroidx/compose/ui/text/TextRange;", "offset", "fromSource", "", "map-fzxv0v0", "(IZ)J", "mapFromDest", "mapFromDest--jx7JFs", "(I)J", "mapFromSource", "mapFromSource--jx7JFs", "mapStep", "opOffset", "untransformedLen", "transformedLen", "mapStep-C6u-MEY", "(IIIIZ)J", "recordEditOperation", "", "sourceStart", "sourceEnd", "newLength", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OffsetMappingCalculator {
    public static final int $stable = 0;
    private int[] ops;
    private int opsSize;

    static {
        $stable = 8;
    }

    public OffsetMappingCalculator() {
        this.ops = OpArray.m1264constructorimpl(10);
    }

    public final void recordEditOperation(int sourceStart, int sourceEnd, int newLength) {
        if (newLength < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was " + newLength);
    L9:
        int sourceMin = Math.min(sourceStart, sourceEnd);
        int sourceMax = Math.max(sourceMin, sourceEnd);
        int sourceLength = sourceMax - sourceMin;
        if (sourceLength >= 2) goto L13;
        if (sourceLength != newLength) goto L13;
        return;
    L13:
        int newSize = this.opsSize + 1;
        if (newSize <= OpArray.m1271getSizeimpl(this.ops)) goto L16;
        int newCapacity = Math.max(newSize * 2, OpArray.m1271getSizeimpl(this.ops) * 2);
        this.ops = OpArray.m1266copyOfpSmdads(this.ops, newCapacity);
    L16:
        OpArray.m1273setimpl(this.ops, this.opsSize, sourceMin, sourceLength, newLength);
        this.opsSize = newSize;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    /* JADX INFO: renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m1262mapFromSourcejx7JFs(int offset) {
        return m1259mapfzxv0v0(offset, true);
    }

    /* JADX INFO: renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m1261mapFromDestjx7JFs(int offset) {
        return m1259mapfzxv0v0(offset, false);
    }

    /* JADX INFO: renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m1259mapfzxv0v0(int offset, boolean fromSource) {
        OffsetMappingCalculator r0 = this;
        int start = offset;
        int end = offset;
        int[] arg0$iv = r0.ops;
        int max$iv = r0.opsSize;
        boolean reversed$iv = !fromSource;
        if (max$iv < 0) goto L16;
        if (reversed$iv == false) goto L10;
        int end2 = end;
        int i$iv = max$iv - 1;
    L7:
        if ((-1) >= i$iv) goto L9;
        int offset$iv = arg0$iv[i$iv * 3];
        int srcLen$iv = arg0$iv[(i$iv * 3) + 1];
        int destLen$iv = arg0$iv[(i$iv * 3) + 2];
        long newStart = r0.m1260mapStepC6uMEY(start, offset$iv, srcLen$iv, destLen$iv, fromSource);
        long newEnd = m1260mapStepC6uMEY(end2, offset$iv, srcLen$iv, destLen$iv, fromSource);
        int start2 = Math.min(TextRange.m6417getStartimpl(newStart), TextRange.m6417getStartimpl(newEnd));
        end2 = Math.max(TextRange.m6412getEndimpl(newStart), TextRange.m6412getEndimpl(newEnd));
        i$iv = i$iv - 1;
        start = start2;
        r0 = this;
        goto L7
    L9:
        end = end2;
        start = start;
        goto L16
    L10:
        int i$iv2 = 0;
        int end3 = end;
    L11:
        if (i$iv2 >= max$iv) goto L13;
        int offset$iv2 = arg0$iv[i$iv2 * 3];
        int srcLen$iv2 = arg0$iv[(i$iv2 * 3) + 1];
        int destLen$iv2 = arg0$iv[(i$iv2 * 3) + 2];
        long newStart2 = m1260mapStepC6uMEY(start, offset$iv2, srcLen$iv2, destLen$iv2, fromSource);
        long newEnd2 = m1260mapStepC6uMEY(end3, offset$iv2, srcLen$iv2, destLen$iv2, fromSource);
        int start3 = Math.min(TextRange.m6417getStartimpl(newStart2), TextRange.m6417getStartimpl(newEnd2));
        end3 = Math.max(TextRange.m6412getEndimpl(newStart2), TextRange.m6412getEndimpl(newEnd2));
        i$iv2 = i$iv2 + 1;
        start = start3;
        goto L11
    L13:
        end = end3;
        start = start;
    L16:
        return TextRangeKt.TextRange(start, end);
    }

    /* JADX INFO: renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m1260mapStepC6uMEY(int offset, int opOffset, int untransformedLen, int transformedLen, boolean fromSource) {
        if (fromSource == false) goto L4;
        int srcLen = untransformedLen;
    L5:
        if (fromSource == false) goto L7;
        int destLen = transformedLen;
    L9:
        if (offset < opOffset) goto L22;
        if (offset != opOffset) goto L16;
        if (srcLen != 0) goto L24;
        return TextRangeKt.TextRange(opOffset, opOffset + destLen);
    L24:
        return TextRangeKt.TextRange(opOffset);
    L16:
        if (offset >= (opOffset + srcLen)) goto L21;
        if (destLen != 0) goto L26;
        return TextRangeKt.TextRange(opOffset);
    L26:
        return TextRangeKt.TextRange(opOffset, opOffset + destLen);
    L21:
        return TextRangeKt.TextRange((offset - srcLen) + destLen);
    L22:
        return TextRangeKt.TextRange(offset);
    L7:
        destLen = untransformedLen;
        goto L9
    L4:
        srcLen = transformedLen;
        goto L5
    }
}
