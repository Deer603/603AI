package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextLayoutResultProxy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextLayoutResultProxyKt {
    /* JADX INFO: renamed from: access$coerceIn-3MmeM6k, reason: not valid java name */
    public static final /* synthetic */ long m1169access$coerceIn3MmeM6k(long $receiver, Rect rect) {
        return m1170coerceIn3MmeM6k($receiver, rect);
    }

    /* JADX INFO: renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    private static final long m1170coerceIn3MmeM6k(long $this$coerceIn_u2d3MmeM6k, Rect rect) {
        int bits$iv$iv$iv = (int) ($this$coerceIn_u2d3MmeM6k >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) >= rect.getLeft()) goto L5;
        float xOffset = rect.getLeft();
    L9:
        int bits$iv$iv$iv2 = (int) ($this$coerceIn_u2d3MmeM6k & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) >= rect.getTop()) goto L12;
        float yOffset = rect.getTop();
    L16:
        long v1$iv$iv = Float.floatToRawIntBits(xOffset);
        long v2$iv$iv = Float.floatToRawIntBits(yOffset);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L12:
        int bits$iv$iv$iv3 = (int) ($this$coerceIn_u2d3MmeM6k & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) <= rect.getBottom()) goto L15;
        yOffset = rect.getBottom();
        goto L16
    L15:
        int bits$iv$iv$iv4 = (int) ($this$coerceIn_u2d3MmeM6k & 4294967295L);
        yOffset = Float.intBitsToFloat(bits$iv$iv$iv4);
        goto L16
    L5:
        int bits$iv$iv$iv5 = (int) ($this$coerceIn_u2d3MmeM6k >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv5) <= rect.getRight()) goto L8;
        xOffset = rect.getRight();
        goto L9
    L8:
        int bits$iv$iv$iv6 = (int) ($this$coerceIn_u2d3MmeM6k >> 32);
        xOffset = Float.intBitsToFloat(bits$iv$iv$iv6);
        goto L9
    }
}
