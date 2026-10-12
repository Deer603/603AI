package androidx.compose.ui.util;

import androidx.collection.SieveCacheKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: InlineClassHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0086\b\u001a\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0086\b¨\u0006\u000e"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "unpackAbsFloat1", "value", "unpackAbsFloat2", "unpackFloat1", "unpackFloat2", "unpackInt1", "unpackInt2", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InlineClassHelperKt {
    public static final long packFloats(float val1, float val2) {
        long v1 = Float.floatToRawIntBits(val1);
        long v2 = Float.floatToRawIntBits(val2);
        return (v1 << 32) | (4294967295L & v2);
    }

    public static final float unpackFloat1(long value) {
        int bits$iv = (int) (value >> 32);
        return Float.intBitsToFloat(bits$iv);
    }

    public static final float unpackAbsFloat1(long value) {
        int bits$iv = (int) ((value >> 32) & SieveCacheKt.NodeLinkMask);
        return Float.intBitsToFloat(bits$iv);
    }

    public static final float unpackFloat2(long value) {
        int bits$iv = (int) (4294967295L & value);
        return Float.intBitsToFloat(bits$iv);
    }

    public static final float unpackAbsFloat2(long value) {
        int bits$iv = (int) (SieveCacheKt.NodeLinkMask & value);
        return Float.intBitsToFloat(bits$iv);
    }

    public static final long packInts(int val1, int val2) {
        return (((long) val1) << 32) | (((long) val2) & 4294967295L);
    }

    public static final int unpackInt1(long value) {
        return (int) (value >> 32);
    }

    public static final int unpackInt2(long value) {
        return (int) (4294967295L & value);
    }
}
