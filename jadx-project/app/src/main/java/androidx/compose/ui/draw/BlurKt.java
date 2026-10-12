package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: Blur.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BlurKt {
    /* JADX INFO: renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3972blur1fqSgw$default(Modifier r0, float r1, float r2, BlurredEdgeTreatment r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = BlurredEdgeTreatment.m3975boximpl(BlurredEdgeTreatment.Companion.m3982getRectangleGoahg());
    L6:
        return m3971blur1fqSgw(r0, r1, r2, r3.m3981unboximpl());
    }

    /* JADX INFO: renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m3971blur1fqSgw(Modifier $this$blur_u2d1fqS_u2dgw, final float radiusX, final float radiusY, final Shape edgeTreatment) {
        if (edgeTreatment == null) goto L5;
        int tileMode = TileMode.Companion.m4739getClamp3opZhB0();
        final boolean clip = true;
        final int tileMode2 = tileMode;
    L6:
        int $this$dp$iv = Dp.m6972compareTo0680j_4(radiusX, Dp.m6973constructorimpl(0));
        if ($this$dp$iv <= 0) goto L10;
        int $this$dp$iv2 = Dp.m6972compareTo0680j_4(radiusY, Dp.m6973constructorimpl(0));
        if ($this$dp$iv2 <= 0) goto L10;
    L14:
        return GraphicsLayerModifierKt.graphicsLayer($this$blur_u2d1fqS_u2dgw, new BlurKt$blur$1(radiusX, radiusY, tileMode2, edgeTreatment, clip));
    L10:
        if (clip == true) goto L14;
        return $this$blur_u2d1fqS_u2dgw;
    L5:
        int tileMode3 = TileMode.Companion.m4740getDecal3opZhB0();
        clip = false;
        tileMode2 = tileMode3;
        goto L6
    }

    /* JADX INFO: renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3974blurF8QBwvs$default(Modifier r0, float r1, BlurredEdgeTreatment r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = BlurredEdgeTreatment.m3975boximpl(BlurredEdgeTreatment.Companion.m3982getRectangleGoahg());
    L6:
        return m3973blurF8QBwvs(r0, r1, r2.m3981unboximpl());
    }

    /* JADX INFO: renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m3973blurF8QBwvs(Modifier $this$blur_u2dF8QBwvs, float radius, Shape edgeTreatment) {
        return m3971blur1fqSgw($this$blur_u2dF8QBwvs, radius, radius, edgeTreatment);
    }
}
