package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a)\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"inset", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "rotateRad", "radians", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "scale", "scale-0AR0LA0", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DrawTransformKt {
    public static /* synthetic */ void inset$default(DrawTransform $this$inset_u24default, float horizontal, float vertical, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        horizontal = 0.0f;
    L6:
        if ((r3 & 2) == 0) goto L8;
        vertical = 0.0f;
    L8:
        $this$inset_u24default.inset(horizontal, vertical, horizontal, vertical);
    }

    public static final void inset(DrawTransform $this$inset, float horizontal, float vertical) {
        $this$inset.inset(horizontal, vertical, horizontal, vertical);
    }

    public static final void inset(DrawTransform $this$inset, float inset) {
        $this$inset.inset(inset, inset, inset, inset);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m4983rotateRad0AR0LA0$default(DrawTransform $this$rotateRad_u2d0AR0LA0_u24default, float radians, long pivot, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        pivot = $this$rotateRad_u2d0AR0LA0_u24default.mo4842getCenterF1C5BW0();
    L5:
        $this$rotateRad_u2d0AR0LA0_u24default.mo4844rotateUv8p0NA(DegreesKt.degrees(radians), pivot);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m4982rotateRad0AR0LA0(DrawTransform $this$rotateRad_u2d0AR0LA0, float radians, long pivot) {
        $this$rotateRad_u2d0AR0LA0.mo4844rotateUv8p0NA(DegreesKt.degrees(radians), pivot);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m4984scale0AR0LA0(DrawTransform $this$scale_u2d0AR0LA0, float scale, long pivot) {
        $this$scale_u2d0AR0LA0.mo4845scale0AR0LA0(scale, scale, pivot);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m4985scale0AR0LA0$default(DrawTransform $this$scale_u2d0AR0LA0_u24default, float scale, long pivot, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        pivot = $this$scale_u2d0AR0LA0_u24default.mo4842getCenterF1C5BW0();
    L5:
        $this$scale_u2d0AR0LA0_u24default.mo4845scale0AR0LA0(scale, scale, pivot);
    }
}
