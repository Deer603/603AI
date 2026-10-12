package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001ac\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "Card-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CardKt {
    /* JADX INFO: renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m1574CardFjzlyU(Modifier modifier, Shape shape, long backgroundColor, long contentColor, BorderStroke border, float elevation, Function2<? super Composer, ? super Integer, Unit> r21, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, 1956755640, "C(Card)P(5,6,0:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp)58@2498L6,59@2556L6,60@2598L32,65@2736L218:Card.kt#jmzs0o");
        if ((r24 & 1) == 0) goto L6;
        Modifier modifier2 = Modifier.Companion;
        modifier = modifier2;
    L6:
        if ((r24 & 2) == 0) goto L8;
        Shape shape2 = MaterialTheme.INSTANCE.getShapes($composer, 6).getMedium();
        Shape shape3 = shape2;
    L10:
        if ((r24 & 4) == 0) goto L12;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU();
    L14:
        if ((r24 & 8) == 0) goto L16;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer, ($changed >> 6) & 14);
    L18:
        if ((r24 & 16) == 0) goto L20;
        BorderStroke border2 = null;
    L22:
        if ((r24 & 32) == 0) goto L24;
        float elevation2 = Dp.m6973constructorimpl(1);
    L26:
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventStart(1956755640, $changed, -1, "androidx.compose.material.Card (Card.kt:64)");
    L28:
        SurfaceKt.m1782SurfaceFjzlyU(modifier, shape3, backgroundColor2, contentColor2, border2, elevation2, r21, $composer, (((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed)) | (458752 & $changed)) | (3670016 & $changed), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L31:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L24:
        elevation2 = elevation;
        goto L26
    L20:
        border2 = border;
        goto L22
    L16:
        contentColor2 = contentColor;
        goto L18
    L12:
        backgroundColor2 = backgroundColor;
        goto L14
    L8:
        shape3 = shape;
        goto L10
    }

    /* JADX INFO: renamed from: Card-LPr_se0, reason: not valid java name */
    public static final void m1575CardLPr_se0(Function0<Unit> r16, Modifier modifier, boolean enabled, Shape shape, long backgroundColor, long contentColor, BorderStroke border, float elevation, MutableInteractionSource interactionSource, Function2<? super Composer, ? super Integer, Unit> r27, Composer $composer, int $changed, int r30) {
        ComposerKt.sourceInformationMarkerStart($composer, 778538979, "C(Card)P(8,7,5,9,0:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)109@4693L6,110@4751L6,111@4793L32,117@4988L319:Card.kt#jmzs0o");
        if ((r30 & 2) == 0) goto L5;
        Modifier.Companion modifier2 = Modifier.Companion;
    L7:
        if ((r30 & 4) == 0) goto L9;
        boolean enabled2 = true;
    L11:
        if ((r30 & 8) == 0) goto L13;
        CornerBasedShape shape2 = MaterialTheme.INSTANCE.getShapes($composer, 6).getMedium();
    L15:
        if ((r30 & 16) == 0) goto L17;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU();
    L19:
        if ((r30 & 32) == 0) goto L21;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer, ($changed >> 12) & 14);
    L23:
        if ((r30 & 64) == 0) goto L25;
        BorderStroke border2 = null;
    L27:
        if ((r30 & 128) == 0) goto L29;
        float elevation2 = Dp.m6973constructorimpl(1);
    L31:
        if ((r30 & 256) == 0) goto L33;
        MutableInteractionSource interactionSource2 = null;
    L35:
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventStart(778538979, $changed, -1, "androidx.compose.material.Card (Card.kt:116)");
    L37:
        SurfaceKt.m1783SurfaceLPr_se0(r16, modifier2, enabled2, shape2, backgroundColor2, contentColor2, border2, elevation2, interactionSource2, r27, $composer, ((((((((($changed & 14) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed)) | (458752 & $changed)) | (3670016 & $changed)) | (29360128 & $changed)) | (234881024 & $changed)) | (1879048192 & $changed), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L40;
        ComposerKt.traceEventEnd();
    L40:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L33:
        interactionSource2 = interactionSource;
        goto L35
    L29:
        elevation2 = elevation;
        goto L31
    L25:
        border2 = border;
        goto L27
    L21:
        contentColor2 = contentColor;
        goto L23
    L17:
        backgroundColor2 = backgroundColor;
        goto L19
    L13:
        shape2 = shape;
        goto L15
    L9:
        enabled2 = enabled;
        goto L11
    L5:
        modifier2 = modifier;
        goto L7
    }
}
