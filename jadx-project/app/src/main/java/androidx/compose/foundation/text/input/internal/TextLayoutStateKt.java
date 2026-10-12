package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextLayoutState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001a\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "fromDecorationToTextLayout", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "offset", "fromDecorationToTextLayout-Uv8p0NA", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "fromTextLayoutToCore", "fromTextLayoutToCore-Uv8p0NA", "fromWindowToDecoration", "fromWindowToDecoration-Uv8p0NA", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextLayoutStateKt {
    /* JADX INFO: renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m1303coerceIn3MmeM6k(long $this$coerceIn_u2d3MmeM6k, Rect rect) {
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

    /* JADX INFO: renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m1305fromTextLayoutToCoreUv8p0NA(TextLayoutState $this$fromTextLayoutToCore_u2dUv8p0NA, long offset) {
        LayoutCoordinates textLayoutNodeCoordinates = $this$fromTextLayoutToCore_u2dUv8p0NA.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) goto L22;
        Offset r2 = null;
        if (textLayoutNodeCoordinates.isAttached() == true) goto L8;
        textLayoutNodeCoordinates = null;
    L8:
        if (textLayoutNodeCoordinates == null) goto L22;
        LayoutCoordinates it = $this$fromTextLayoutToCore_u2dUv8p0NA.getCoreNodeCoordinates();
        if (it != null) goto L12;
    L19:
        if (r2 == null) goto L22;
        return r2.m4135unboximpl();
    L12:
        if (it.isAttached() == true) goto L15;
        it = null;
    L15:
        if (it == null) goto L19;
        r2 = Offset.m4114boximpl(it.mo5723localPositionOfR5De75A(textLayoutNodeCoordinates, offset));
    L22:
        return offset;
    }

    /* JADX INFO: renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m1304fromDecorationToTextLayoutUv8p0NA(TextLayoutState $this$fromDecorationToTextLayout_u2dUv8p0NA, long offset) {
        LayoutCoordinates textLayoutNodeCoordinates = $this$fromDecorationToTextLayout_u2dUv8p0NA.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) goto L18;
        LayoutCoordinates decoratorNodeCoordinates = $this$fromDecorationToTextLayout_u2dUv8p0NA.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates != null) goto L7;
        Offset r2 = null;
    L15:
        if (r2 == null) goto L18;
        return r2.m4135unboximpl();
    L7:
        if (textLayoutNodeCoordinates.isAttached() == true) goto L9;
    L11:
        long r4 = offset;
    L12:
        r2 = Offset.m4114boximpl(r4);
        goto L15
    L9:
        if (decoratorNodeCoordinates.isAttached() == false) goto L11;
        r4 = textLayoutNodeCoordinates.mo5723localPositionOfR5De75A(decoratorNodeCoordinates, offset);
    L18:
        return offset;
    }

    /* JADX INFO: renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m1306fromWindowToDecorationUv8p0NA(TextLayoutState $this$fromWindowToDecoration_u2dUv8p0NA, long offset) {
        LayoutCoordinates decoratorNodeCoordinates = $this$fromWindowToDecoration_u2dUv8p0NA.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates == null) goto L10;
        if (decoratorNodeCoordinates.isAttached() == false) goto L11;
        return decoratorNodeCoordinates.mo5731windowToLocalMKHz9U(offset);
    L11:
        return offset;
    L10:
        return offset;
    }
}
