package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Surface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0091\u0001\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001am\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0099\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u009f\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060#2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010$\u001a\"\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a8\u0010)\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020+H\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "shadowElevation", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "", "surface-XO-JAsU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = null;

    /* JADX INFO: renamed from: access$surface-XO-JAsU, reason: not valid java name */
    public static final /* synthetic */ Modifier m2674access$surfaceXOJAsU(Modifier $receiver, Shape shape, long backgroundColor, BorderStroke border, float shadowElevation) {
        return m2676surfaceXOJAsU($receiver, shape, backgroundColor, border, shadowElevation);
    }

    /* JADX INFO: renamed from: access$surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final /* synthetic */ long m2675access$surfaceColorAtElevationCLU3JFs(long color, float elevation, Composer $composer, int $changed) {
        return m2677surfaceColorAtElevationCLU3JFs(color, elevation, $composer, $changed);
    }

    /* JADX INFO: renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m2670SurfaceT9BRK9s(Modifier modifier, Shape shape, long color, long contentColor, float tonalElevation, float shadowElevation, BorderStroke border, final Function2<? super Composer, ? super Integer, Unit> r25, Composer $composer, int $changed, int r28) {
        ComposerKt.sourceInformationMarkerStart($composer, -513881741, "C(Surface)P(4,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color,7:c#ui.unit.Dp,5:c#ui.unit.Dp)96@5014L11,97@5061L22,*103@5278L7,107@5451L741,104@5307L885:Surface.kt#uh7d8r");
        if ((r28 & 1) == 0) goto L5;
        Modifier.Companion modifier2 = Modifier.Companion;
    L7:
        if ((r28 & 2) == 0) goto L9;
        Shape shape2 = RectangleShapeKt.getRectangleShape();
    L11:
        if ((r28 & 4) == 0) goto L13;
        long color2 = MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU();
    L15:
        if ((r28 & 8) == 0) goto L17;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(color2, $composer, ($changed >> 6) & 14);
    L19:
        if ((r28 & 16) == 0) goto L21;
        float tonalElevation2 = Dp.m6973constructorimpl(0);
    L23:
        if ((r28 & 32) == 0) goto L25;
        float shadowElevation2 = Dp.m6973constructorimpl(0);
    L27:
        if ((r28 & 64) == 0) goto L29;
        BorderStroke border2 = null;
    L31:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(-513881741, $changed, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
    L33:
        ProvidableCompositionLocal<Dp> r2 = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r14 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final float arg0$iv = Dp.m6973constructorimpl(((Dp) r14).m6987unboximpl() + tonalElevation2);
        final Modifier modifier3 = modifier2;
        final Shape shape3 = shape2;
        final long color3 = color2;
        final float shadowElevation3 = shadowElevation2;
        final BorderStroke border3 = border2;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor2)), LocalAbsoluteTonalElevation.provides(Dp.m6971boximpl(arg0$iv))}, ComposableLambdaKt.rememberComposableLambda(-70914509, true, new SurfaceKt$Surface$1(modifier3, shape3, color3, arg0$iv, border3, shadowElevation3, r25), $composer, 54), $composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
    L36:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L29:
        border2 = border;
        goto L31
    L25:
        shadowElevation2 = shadowElevation;
        goto L27
    L21:
        tonalElevation2 = tonalElevation;
        goto L23
    L17:
        contentColor2 = contentColor;
        goto L19
    L13:
        color2 = color;
        goto L15
    L9:
        shape2 = shape;
        goto L11
    L5:
        modifier2 = modifier;
        goto L7
    }

    /* JADX INFO: renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m2673Surfaceo_FOJdg(final Function0<Unit> r19, Modifier modifier, boolean enabled, Shape shape, long color, long contentColor, float tonalElevation, float shadowElevation, BorderStroke border, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r31, Composer $composer, int $changed, int $changed1, int r35) {
        ComposerKt.sourceInformationMarkerStart($composer, -789752804, "C(Surface)P(7,6,4,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.unit.Dp,8:c#ui.unit.Dp!1,5)196@10536L11,197@10583L22,*204@10857L7,208@11030L853,205@10886L997:Surface.kt#uh7d8r");
        if ((r35 & 2) == 0) goto L5;
        final Modifier modifier2 = Modifier.Companion;
    L7:
        if ((r35 & 4) == 0) goto L9;
        final boolean enabled2 = true;
    L11:
        if ((r35 & 8) == 0) goto L13;
        final Shape shape2 = RectangleShapeKt.getRectangleShape();
    L15:
        if ((r35 & 16) == 0) goto L17;
        final long color2 = MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU();
    L19:
        if ((r35 & 32) == 0) goto L21;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(color2, $composer, ($changed >> 12) & 14);
    L23:
        if ((r35 & 64) == 0) goto L25;
        float tonalElevation2 = Dp.m6973constructorimpl(0);
    L27:
        if ((r35 & 128) == 0) goto L29;
        final float shadowElevation2 = Dp.m6973constructorimpl(0);
    L31:
        if ((r35 & 256) == 0) goto L33;
        final BorderStroke border2 = null;
    L35:
        if ((r35 & 512) == 0) goto L37;
        final MutableInteractionSource interactionSource2 = null;
    L39:
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventStart(-789752804, $changed, $changed1, "androidx.compose.material3.Surface (Surface.kt:203)");
    L42:
        ProvidableCompositionLocal<Dp> r2 = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r1 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        float arg0$iv = ((Dp) r1).m6987unboximpl();
        final float absoluteElevation = Dp.m6973constructorimpl(arg0$iv + tonalElevation2);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor2)), LocalAbsoluteTonalElevation.provides(Dp.m6971boximpl(absoluteElevation))}, ComposableLambdaKt.rememberComposableLambda(1279702876, true, new SurfaceKt$Surface$2(modifier2, shape2, color2, absoluteElevation, border2, interactionSource2, enabled2, r19, shadowElevation2, r31), $composer, 54), $composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventEnd();
    L45:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L37:
        interactionSource2 = interactionSource;
        goto L39
    L33:
        border2 = border;
        goto L35
    L29:
        shadowElevation2 = shadowElevation;
        goto L31
    L25:
        tonalElevation2 = tonalElevation;
        goto L27
    L21:
        contentColor2 = contentColor;
        goto L23
    L17:
        color2 = color;
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

    /* JADX INFO: renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2671Surfaced85dljk(final boolean selected, final Function0<Unit> r21, Modifier modifier, boolean enabled, Shape shape, long color, long contentColor, float tonalElevation, float shadowElevation, BorderStroke border, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r33, Composer $composer, int $changed, int $changed1, int r37) {
        ComposerKt.sourceInformationMarkerStart($composer, 540296512, "C(Surface)P(8,7,6,4,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp!1,5)299@16163L11,300@16210L22,*307@16484L7,311@16657L899,308@16513L1043:Surface.kt#uh7d8r");
        if ((r37 & 4) == 0) goto L5;
        final Modifier modifier2 = Modifier.Companion;
    L7:
        if ((r37 & 8) == 0) goto L9;
        final boolean enabled2 = true;
    L11:
        if ((r37 & 16) == 0) goto L13;
        final Shape shape2 = RectangleShapeKt.getRectangleShape();
    L15:
        if ((r37 & 32) == 0) goto L17;
        final long color2 = MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU();
    L19:
        if ((r37 & 64) == 0) goto L21;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(color2, $composer, ($changed >> 15) & 14);
    L23:
        if ((r37 & 128) == 0) goto L25;
        float tonalElevation2 = Dp.m6973constructorimpl(0);
    L27:
        if ((r37 & 256) == 0) goto L29;
        final float shadowElevation2 = Dp.m6973constructorimpl(0);
    L31:
        if ((r37 & 512) == 0) goto L33;
        final BorderStroke border2 = null;
    L35:
        if ((r37 & 1024) == 0) goto L37;
        final MutableInteractionSource interactionSource2 = null;
    L39:
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventStart(540296512, $changed, $changed1, "androidx.compose.material3.Surface (Surface.kt:306)");
    L42:
        ProvidableCompositionLocal<Dp> r2 = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r12 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        float arg0$iv = ((Dp) r12).m6987unboximpl();
        final float absoluteElevation = Dp.m6973constructorimpl(arg0$iv + tonalElevation2);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor2)), LocalAbsoluteTonalElevation.provides(Dp.m6971boximpl(absoluteElevation))}, ComposableLambdaKt.rememberComposableLambda(-1164547968, true, new SurfaceKt$Surface$3(modifier2, shape2, color2, absoluteElevation, border2, selected, interactionSource2, enabled2, r21, shadowElevation2, r33), $composer, 54), $composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventEnd();
    L45:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L37:
        interactionSource2 = interactionSource;
        goto L39
    L33:
        border2 = border;
        goto L35
    L29:
        shadowElevation2 = shadowElevation;
        goto L31
    L25:
        tonalElevation2 = tonalElevation;
        goto L27
    L21:
        contentColor2 = contentColor;
        goto L23
    L17:
        color2 = color;
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

    /* JADX INFO: renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2672Surfaced85dljk(final boolean checked, final Function1<? super Boolean, Unit> r21, Modifier modifier, boolean enabled, Shape shape, long color, long contentColor, float tonalElevation, float shadowElevation, BorderStroke border, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r33, Composer $composer, int $changed, int $changed1, int r37) {
        ComposerKt.sourceInformationMarkerStart($composer, -1877401889, "C(Surface)P(1,8,7,5,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp!1,6)403@21903L11,404@21950L22,*411@22224L7,415@22397L909,412@22253L1053:Surface.kt#uh7d8r");
        if ((r37 & 4) == 0) goto L5;
        final Modifier modifier2 = Modifier.Companion;
    L7:
        if ((r37 & 8) == 0) goto L9;
        final boolean enabled2 = true;
    L11:
        if ((r37 & 16) == 0) goto L13;
        final Shape shape2 = RectangleShapeKt.getRectangleShape();
    L15:
        if ((r37 & 32) == 0) goto L17;
        final long color2 = MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU();
    L19:
        if ((r37 & 64) == 0) goto L21;
        long contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(color2, $composer, ($changed >> 15) & 14);
    L23:
        if ((r37 & 128) == 0) goto L25;
        float tonalElevation2 = Dp.m6973constructorimpl(0);
    L27:
        if ((r37 & 256) == 0) goto L29;
        final float shadowElevation2 = Dp.m6973constructorimpl(0);
    L31:
        if ((r37 & 512) == 0) goto L33;
        final BorderStroke border2 = null;
    L35:
        if ((r37 & 1024) == 0) goto L37;
        final MutableInteractionSource interactionSource2 = null;
    L39:
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventStart(-1877401889, $changed, $changed1, "androidx.compose.material3.Surface (Surface.kt:410)");
    L42:
        ProvidableCompositionLocal<Dp> r2 = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r12 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        float arg0$iv = ((Dp) r12).m6987unboximpl();
        final float absoluteElevation = Dp.m6973constructorimpl(arg0$iv + tonalElevation2);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor2)), LocalAbsoluteTonalElevation.provides(Dp.m6971boximpl(absoluteElevation))}, ComposableLambdaKt.rememberComposableLambda(712720927, true, new SurfaceKt$Surface$4(modifier2, shape2, color2, absoluteElevation, border2, checked, interactionSource2, enabled2, r21, shadowElevation2, r33), $composer, 54), $composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventEnd();
    L45:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L37:
        interactionSource2 = interactionSource;
        goto L39
    L33:
        border2 = border;
        goto L35
    L29:
        shadowElevation2 = shadowElevation;
        goto L31
    L25:
        tonalElevation2 = tonalElevation;
        goto L27
    L21:
        contentColor2 = contentColor;
        goto L23
    L17:
        color2 = color;
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

    /* JADX INFO: renamed from: surface-XO-JAsU, reason: not valid java name */
    private static final Modifier m2676surfaceXOJAsU(Modifier $this$surface_u2dXO_u2dJAsU, Shape shape, long backgroundColor, BorderStroke border, float shadowElevation) {
        if (shadowElevation <= 0.0f) goto L5;
        Shape r14 = shape;
        Modifier.Companion r1 = GraphicsLayerModifierKt.m4526graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, shadowElevation, 0.0f, 0.0f, 0.0f, 0.0f, 0, r14, false, null, 0, 0, 0, 124895, null);
    L6:
        Modifier r2 = $this$surface_u2dXO_u2dJAsU.then(r1);
        Modifier.Companion r3 = Modifier.Companion;
        if (border == null) goto L10;
        r3 = BorderKt.border(r3, border, r14);
    L10:
        return ClipKt.clip(BackgroundKt.m233backgroundbw27NRU(r2.then(r3), backgroundColor, r14), r14);
    L5:
        r14 = shape;
        r1 = Modifier.Companion;
        goto L6
    }

    /* JADX INFO: renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    private static final long m2677surfaceColorAtElevationCLU3JFs(long color, float elevation, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2079918090, "C(surfaceColorAtElevation)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)465@24025L11,465@24037L37:Surface.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2079918090, $changed, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
    L5:
        long color2 = ColorSchemeKt.m2055applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme($composer, 6), color, elevation, $composer, (($changed << 3) & 112) | (($changed << 3) & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return color2;
    }

    static {
        LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, SurfaceKt$LocalAbsoluteTonalElevation$1.INSTANCE, 1, null);
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }
}
