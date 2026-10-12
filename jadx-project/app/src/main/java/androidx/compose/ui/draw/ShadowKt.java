package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ShadowKt {
    /* JADX INFO: renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4003shadowziNgDLE$default(Modifier r0, float r1, Shape r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = RectangleShapeKt.getRectangleShape();
    L6:
        if ((r4 & 4) == 0) goto L12;
        int $this$dp$iv = Dp.m6972compareTo0680j_4(r1, Dp.m6973constructorimpl(0));
        if ($this$dp$iv <= 0) goto L10;
        r3 = true;
        goto L12
    L10:
        r3 = false;
    L12:
        return m4002shadowziNgDLE(r0, r1, r2, r3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* JADX INFO: renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m4002shadowziNgDLE(Modifier $this$shadow_u2dziNgDLE, float elevation, Shape shape, boolean clip) {
        return m4000shadows4CzXII($this$shadow_u2dziNgDLE, elevation, shape, clip, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* JADX INFO: renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4001shadows4CzXII$default(Modifier r7, float r8, Shape r9, boolean r10, long r11, long r13, int r15, Object r16) {
        if ((r15 & 2) == 0) goto L5;
        Shape r0 = RectangleShapeKt.getRectangleShape();
    L7:
        if ((r15 & 4) == 0) goto L12;
        int $this$dp$iv = Dp.m6972compareTo0680j_4(r8, Dp.m6973constructorimpl(0));
        if ($this$dp$iv <= 0) goto L11;
        boolean r1 = true;
    L14:
        if ((r15 & 8) == 0) goto L16;
        long r3 = GraphicsLayerScopeKt.getDefaultShadowColor();
    L18:
        if ((r15 & 16) == 0) goto L20;
        long r5 = GraphicsLayerScopeKt.getDefaultShadowColor();
    L22:
        return m4000shadows4CzXII(r7, r8, r0, r1, r3, r5);
    L20:
        r5 = r13;
        goto L22
    L16:
        r3 = r11;
        goto L18
    L11:
        r1 = false;
        goto L14
    L12:
        r1 = r10;
        goto L14
    L5:
        r0 = r9;
        goto L7
    }

    /* JADX INFO: renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m4000shadows4CzXII(Modifier $this$shadow_u2ds4CzXII, float elevation, Shape shape, boolean clip, long ambientColor, long spotColor) {
        int $this$dp$iv = Dp.m6972compareTo0680j_4(elevation, Dp.m6973constructorimpl(0));
        if ($this$dp$iv > 0) goto L8;
        if (clip == true) goto L8;
        return $this$shadow_u2ds4CzXII;
    L8:
        return $this$shadow_u2ds4CzXII.then(new ShadowGraphicsLayerElement(elevation, shape, clip, ambientColor, spotColor, null));
    }
}
