package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: IntOffset.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u0016\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", "offset", "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntOffsetKt {
    public static final long IntOffset(int x, int y) {
        return IntOffset.m7095constructorimpl((((long) x) << 32) | (((long) y) & 4294967295L));
    }

    /* JADX INFO: renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m7113lerp81ZRxRo(long start, long stop, float fraction) {
        int val1$iv = MathHelpersKt.lerp(IntOffset.m7101getXimpl(start), IntOffset.m7101getXimpl(stop), fraction);
        int val2$iv = MathHelpersKt.lerp(IntOffset.m7102getYimpl(start), IntOffset.m7102getYimpl(stop), fraction);
        return IntOffset.m7095constructorimpl((((long) val1$iv) << 32) | (((long) val2$iv) & 4294967295L));
    }

    /* JADX INFO: renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m7119toOffsetgyyYBs(long $this$toOffset_u2d_u2dgyyYBs) {
        float x$iv = IntOffset.m7101getXimpl($this$toOffset_u2d_u2dgyyYBs);
        float y$iv = IntOffset.m7102getYimpl($this$toOffset_u2d_u2dgyyYBs);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m7116plusNvtHpc(long $this$plus_u2dNv_u2dtHpc, long offset) {
        int bits$iv$iv$iv = (int) ($this$plus_u2dNv_u2dtHpc >> 32);
        float x$iv = Float.intBitsToFloat(bits$iv$iv$iv) + IntOffset.m7101getXimpl(offset);
        int bits$iv$iv$iv2 = (int) ($this$plus_u2dNv_u2dtHpc & 4294967295L);
        float y$iv = Float.intBitsToFloat(bits$iv$iv$iv2) + IntOffset.m7102getYimpl(offset);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m7114minusNvtHpc(long $this$minus_u2dNv_u2dtHpc, long offset) {
        int bits$iv$iv$iv = (int) ($this$minus_u2dNv_u2dtHpc >> 32);
        float x$iv = Float.intBitsToFloat(bits$iv$iv$iv) - IntOffset.m7101getXimpl(offset);
        int bits$iv$iv$iv2 = (int) ($this$minus_u2dNv_u2dtHpc & 4294967295L);
        float y$iv = Float.intBitsToFloat(bits$iv$iv$iv2) - IntOffset.m7102getYimpl(offset);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* JADX INFO: renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m7117plusoCl6YwE(long $this$plus_u2doCl6YwE, long offset) {
        int bits$iv$iv$iv = (int) (offset >> 32);
        float x$iv = IntOffset.m7101getXimpl($this$plus_u2doCl6YwE) + Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (offset & 4294967295L);
        float y$iv = IntOffset.m7102getYimpl($this$plus_u2doCl6YwE) + Float.intBitsToFloat(bits$iv$iv$iv2);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
    }

    /* JADX INFO: renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m7115minusoCl6YwE(long $this$minus_u2doCl6YwE, long offset) {
        int bits$iv$iv$iv = (int) (offset >> 32);
        float x$iv = IntOffset.m7101getXimpl($this$minus_u2doCl6YwE) - Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (offset & 4294967295L);
        float y$iv = IntOffset.m7102getYimpl($this$minus_u2doCl6YwE) - Float.intBitsToFloat(bits$iv$iv$iv2);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
    }

    /* JADX INFO: renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m7118roundk4lQ0M(long $this$round_u2dk_u2d4lQ0M) {
        int bits$iv$iv$iv = (int) ($this$round_u2dk_u2d4lQ0M >> 32);
        float $this$fastRoundToInt$iv = Float.intBitsToFloat(bits$iv$iv$iv);
        int $i$f$fastRoundToInt = Math.round($this$fastRoundToInt$iv);
        int bits$iv$iv$iv2 = (int) ($this$round_u2dk_u2d4lQ0M & 4294967295L);
        float $this$fastRoundToInt$iv2 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int $i$f$fastRoundToInt2 = Math.round($this$fastRoundToInt$iv2);
        return IntOffset.m7095constructorimpl((((long) $i$f$fastRoundToInt) << 32) | (((long) $i$f$fastRoundToInt2) & 4294967295L));
    }
}
