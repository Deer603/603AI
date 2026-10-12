package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Surface.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001ac\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001f\u001a,\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0010H\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a8\u0010&\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SurfaceKt {
    /* JADX INFO: renamed from: access$surface-8ww4TTg, reason: not valid java name */
    public static final /* synthetic */ Modifier m1786access$surface8ww4TTg(Modifier $receiver, Shape shape, long backgroundColor, BorderStroke border, float elevation) {
        return m1788surface8ww4TTg($receiver, shape, backgroundColor, border, elevation);
    }

    /* JADX INFO: renamed from: access$surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final /* synthetic */ long m1787access$surfaceColorAtElevationcq6XJ1M(long color, ElevationOverlay elevationOverlay, float absoluteElevation, Composer $composer, int $changed) {
        return m1789surfaceColorAtElevationcq6XJ1M(color, elevationOverlay, absoluteElevation, $composer, $changed);
    }

    /* JADX INFO: renamed from: Surface-F-jzlyU, reason: not valid java name */
    public static final void m1782SurfaceFjzlyU(Modifier modifier, Shape shape, long color, long contentColor, BorderStroke border, float elevation, final Function2<? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(1412203386);
        ComposerKt.sourceInformation($composer2, "C(Surface)P(5,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp)*103@5304L7,107@5467L875,104@5328L1014:Surface.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r37 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier modifier2 = modifier;
    L13:
        int r5 = r37 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        Shape shape2 = shape;
    L25:
        if (($changed & 384) == 0) goto L27;
        long color2 = color;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long contentColor2 = contentColor;
    L46:
        int r9 = r37 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
        BorderStroke border2 = border;
    L57:
        int r15 = r37 & 32;
        if (r15 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if ((r37 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if (($dirty & 599187) == 599186) goto L82;
        boolean r0 = true;
    L84:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L119;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "97@5087L6,98@5129L22");
        if (($changed & 1) != 0) goto L88;
    L97:
        if (r2 == 0) goto L99;
        modifier2 = Modifier.Companion;
    L99:
        if (r5 == 0) goto L102;
        shape2 = RectangleShapeKt.getRectangleShape();
    L102:
        if ((r37 & 4) == 0) goto L105;
        color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty = $dirty & (-897);
    L105:
        if ((r37 & 8) == 0) goto L107;
        contentColor2 = ColorsKt.m1616contentColorForek8zF_U(color2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
    L107:
        if (r9 == 0) goto L109;
        border2 = null;
    L109:
        if (r15 == 0) goto L111;
        final float elevation2 = Dp.m6973constructorimpl(0);
        final Shape shape3 = shape2;
        final long color3 = color2;
        final BorderStroke border3 = border2;
    L112:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventStart(1412203386, $dirty, -1, "androidx.compose.material.Surface (Surface.kt:102)");
    L115:
        ProvidableCompositionLocal<Dp> r1 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float arg0$iv = ((Dp) r6).m6987unboximpl();
        final float absoluteElevation = Dp.m6973constructorimpl(arg0$iv + elevation2);
        final Modifier modifier3 = modifier2;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor2)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m6971boximpl(absoluteElevation))}, ComposableLambdaKt.rememberComposableLambda(-1822160838, true, new SurfaceKt$Surface$1(modifier3, shape3, color3, absoluteElevation, border3, elevation2, r34), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L118;
        ComposerKt.traceEventEnd();
    L118:
        final long contentColor3 = contentColor2;
        final Shape shape4 = shape3;
        final long color4 = color3;
        final BorderStroke border4 = border3;
        final float elevation3 = elevation2;
        final Modifier modifier4 = modifier3;
    L120:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L124;
        r14.updateScope(new SurfaceKt$Surface$2(modifier4, shape4, color4, contentColor3, border4, elevation3, r34, $changed, r37));
        return;
    L124:
        return;
    L111:
        elevation2 = elevation;
        shape3 = shape2;
        color3 = color2;
        border3 = border2;
        goto L112
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L97;
        $composer2.skipToGroupEnd();
        if ((r37 & 4) == 0) goto L94;
        $dirty = $dirty & (-897);
    L94:
        if ((r37 & 8) == 0) goto L96;
        elevation2 = elevation;
        $dirty = $dirty & (-7169);
        shape3 = shape2;
        color3 = color2;
        border3 = border2;
        goto L112
    L96:
        elevation2 = elevation;
        shape3 = shape2;
        color3 = color2;
        border3 = border2;
        goto L112
    L119:
        $composer2.skipToGroupEnd();
        shape4 = shape2;
        contentColor3 = contentColor2;
        modifier4 = modifier2;
        color4 = color2;
        border4 = border2;
        elevation3 = elevation;
        goto L120
    L82:
        r0 = false;
        goto L84
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(r34) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
        goto L80
    L76:
        r17 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        if ($composer2.changed(elevation) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
        goto L69
    L65:
        r16 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        border2 = border;
        if ($composer2.changed(border2) == false) goto L54;
        int r18 = 16384;
    L55:
        $dirty = $dirty | r18;
        goto L57
    L54:
        r18 = 8192;
        goto L55
    L56:
        border2 = border;
        goto L57
    L38:
        if ((r37 & 8) != 0) goto L42;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
    L43:
        r10 = 1024;
        goto L44
    L42:
        contentColor2 = contentColor;
        goto L43
    L27:
        if ((r37 & 4) != 0) goto L31;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
        goto L33
    L31:
        color2 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L25
    L21:
        r7 = 16;
        goto L22
    L23:
        shape2 = shape;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L10;
        int r8 = 4;
    L11:
        $dirty = $dirty | r8;
        goto L13
    L10:
        r8 = 2;
        goto L11
    L12:
        modifier2 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: Surface-LPr_se0, reason: not valid java name */
    public static final void m1783SurfaceLPr_se0(final Function0<Unit> r30, Modifier modifier, boolean enabled, Shape shape, long color, long contentColor, BorderStroke border, float elevation, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r41, Composer $composer, final int $changed, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(1560876237);
        ComposerKt.sourceInformation($composer2, "C(Surface)P(8,7,5,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)*209@11068L7,213@11231L963,210@11092L1102:Surface.kt#jmzs0o");
        int $dirty = $changed;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r4 = r44 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r6 = r44 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L35:
        int r8 = r44 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long color2 = color;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        int r12 = r4;
        long contentColor2 = contentColor;
    L68:
        int r16 = r44 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r0 = r44 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r44 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if ((r44 & 512) == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L115;
        boolean r2 = true;
    L117:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L158;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "202@10794L6,203@10836L22");
        if (($changed & 1) != 0) goto L121;
    L130:
        if (r12 == 0) goto L132;
        modifier2 = Modifier.Companion;
    L132:
        if (r6 == 0) goto L134;
        enabled2 = true;
    L134:
        if (r8 == 0) goto L137;
        shape2 = RectangleShapeKt.getRectangleShape();
    L137:
        if ((r44 & 16) == 0) goto L140;
        color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty2 = $dirty2 & (-57345);
    L140:
        if ((r44 & 32) == 0) goto L142;
        contentColor2 = ColorsKt.m1616contentColorForek8zF_U(color2, $composer2, ($dirty2 >> 12) & 14);
        $dirty2 = $dirty2 & (-458753);
    L142:
        if (r16 == 0) goto L144;
        BorderStroke border2 = null;
    L145:
        if (r0 == 0) goto L147;
        float elevation2 = Dp.m6973constructorimpl(0);
    L148:
        if (r1 == 0) goto L150;
        final BorderStroke border3 = border2;
        final float elevation3 = elevation2;
        final MutableInteractionSource interactionSource2 = null;
        final boolean enabled3 = enabled2;
        final Shape shape3 = shape2;
        int $dirty3 = $dirty2;
        final long color3 = color2;
    L151:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L154;
        ComposerKt.traceEventStart(1560876237, $dirty3, -1, "androidx.compose.material.Surface (Surface.kt:208)");
    L154:
        ProvidableCompositionLocal<Dp> r3 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final float arg0$iv = Dp.m6973constructorimpl(((Dp) r9).m6987unboximpl() + elevation3);
        final Modifier modifier3 = modifier2;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor2)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m6971boximpl(arg0$iv))}, ComposableLambdaKt.rememberComposableLambda(2031491085, true, new SurfaceKt$Surface$3(modifier3, shape3, color3, arg0$iv, border3, elevation3, interactionSource2, enabled3, r30, r41), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L157;
        ComposerKt.traceEventEnd();
    L157:
        final long contentColor3 = contentColor2;
        final Modifier modifier4 = modifier3;
        final Shape shape4 = shape3;
        final long color4 = color3;
        final BorderStroke border4 = border3;
        final float elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final boolean enabled4 = enabled3;
    L159:
        ScopeUpdateScope r5 = $composer2.endRestartGroup();
        if (r5 == null) goto L163;
        r5.updateScope(new SurfaceKt$Surface$4(r30, modifier4, enabled4, shape4, color4, contentColor3, border4, elevation4, interactionSource3, r41, $changed, r44));
        return;
    L163:
        return;
    L150:
        interactionSource2 = interactionSource;
        border3 = border2;
        elevation3 = elevation2;
        enabled3 = enabled2;
        shape3 = shape2;
        $dirty3 = $dirty2;
        color3 = color2;
        goto L151
    L147:
        elevation2 = elevation;
        goto L148
    L144:
        border2 = border;
        goto L145
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L130;
        $composer2.skipToGroupEnd();
        if ((r44 & 16) == 0) goto L127;
        $dirty2 = $dirty2 & (-57345);
    L127:
        if ((r44 & 32) == 0) goto L129;
        border3 = border;
        elevation3 = elevation;
        interactionSource2 = interactionSource;
        $dirty3 = $dirty2 & (-458753);
        enabled3 = enabled2;
        shape3 = shape2;
        color3 = color2;
        goto L151
    L129:
        border3 = border;
        elevation3 = elevation;
        interactionSource2 = interactionSource;
        enabled3 = enabled2;
        shape3 = shape2;
        $dirty3 = $dirty2;
        color3 = color2;
        goto L151
    L158:
        $composer2.skipToGroupEnd();
        long r28 = contentColor2;
        enabled4 = enabled2;
        contentColor3 = r28;
        modifier4 = modifier2;
        shape4 = shape2;
        color4 = color2;
        border4 = border;
        elevation4 = elevation;
        interactionSource3 = interactionSource;
        goto L159
    L115:
        r2 = false;
        goto L117
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r41) == false) goto L109;
        int r20 = 536870912;
    L110:
        $dirty = $dirty | r20;
        goto L112
    L109:
        r20 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r21;
        goto L102
    L98:
        r21 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(elevation) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L90
    L87:
        r19 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(border) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L79
    L76:
        r18 = 524288;
        goto L77
    L60:
        if ((r44 & 32) != 0) goto L64;
        r12 = r4;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
    L65:
        r17 = 65536;
        goto L66
    L64:
        r12 = r4;
        contentColor2 = contentColor;
        goto L65
    L49:
        if ((r44 & 16) != 0) goto L53;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L54;
        int r13 = 16384;
    L55:
        $dirty = $dirty | r13;
    L54:
        r13 = 8192;
        goto L55
    L53:
        color2 = color;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
        goto L47
    L43:
        r10 = 1024;
        goto L44
    L45:
        shape2 = shape;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
        goto L35
    L32:
        r11 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r30) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L13
    L10:
        r14 = 2;
        goto L11
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Surface-Ny5ogXk, reason: not valid java name */
    public static final void m1784SurfaceNy5ogXk(final boolean selected, final Function0<Unit> r31, Modifier modifier, boolean enabled, Shape shape, long color, long contentColor, BorderStroke border, float elevation, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r42, Composer $composer, final int $changed, final int $changed1, final int r46) {
        Composer $composer2 = $composer.startRestartGroup(262027249);
        ComposerKt.sourceInformation($composer2, "C(Surface)P(9,8,7,5,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)*319@17008L7,323@17171L1009,320@17032L1148:Surface.kt#jmzs0o");
        int $dirty = $changed;
        if ((r46 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r5 = selected;
    L14:
        if ((r46 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r8 = r31;
    L24:
        int r9 = r46 & 4;
        if (r9 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r10 = modifier;
    L35:
        int r11 = r46 & 8;
        if (r11 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r12 = enabled;
    L46:
        int r13 = r46 & 16;
        if (r13 == 0) goto L50;
        $dirty = $dirty | 24576;
        Shape shape2 = shape;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        final long color2 = color;
    L69:
        if (($changed & 1572864) == 0) goto L71;
        int $dirty2 = $dirty;
        int $dirty1 = $changed1;
    L79:
        int r1 = r46 & 128;
        if (r1 == 0) goto L83;
        $dirty2 = $dirty2 | 12582912;
    L90:
        int r2 = r46 & 256;
        if (r2 == 0) goto L94;
        $dirty2 = $dirty2 | 100663296;
    L101:
        int r3 = r46 & 512;
        if (r3 == 0) goto L105;
        $dirty2 = $dirty2 | 805306368;
    L113:
        if ((r46 & 1024) == 0) goto L115;
        int $dirty3 = $dirty1 | 6;
    L125:
        if (($dirty2 & 306783379) == 306783378) goto L127;
    L130:
        boolean r4 = true;
    L132:
        if ($composer2.shouldExecute(r4, $dirty2 & 1) == false) goto L176;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "312@16734L6,313@16776L22");
        if (($changed & 1) != 0) goto L136;
    L145:
        if (r9 == 0) goto L147;
        Modifier.Companion modifier2 = Modifier.Companion;
    L148:
        if (r11 == 0) goto L150;
        boolean enabled2 = true;
    L151:
        if (r13 == 0) goto L154;
        shape2 = RectangleShapeKt.getRectangleShape();
    L154:
        if ((r46 & 32) == 0) goto L157;
        color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty2 = $dirty2 & (-458753);
    L157:
        if ((r46 & 64) == 0) goto L159;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(color2, $composer2, ($dirty2 >> 15) & 14);
        $dirty2 = $dirty2 & (-3670017);
    L160:
        if (r1 == 0) goto L162;
        BorderStroke border2 = null;
    L163:
        if (r2 == 0) goto L165;
        char r28 = 1;
        float elevation2 = Dp.m6973constructorimpl(0);
    L166:
        if (r3 == 0) goto L168;
        final BorderStroke border3 = border2;
        final float elevation3 = elevation2;
        final boolean enabled3 = enabled2;
        final MutableInteractionSource interactionSource2 = null;
        final Shape shape3 = shape2;
        int $dirty4 = $dirty2;
        int r6 = 262027249;
        final long color3 = color2;
    L169:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L172;
        ComposerKt.traceEventStart(r6, $dirty4, $dirty3, "androidx.compose.material.Surface (Surface.kt:318)");
    L172:
        ProvidableCompositionLocal<Dp> r7 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float arg0$iv = ((Dp) r14).m6987unboximpl();
        final float absoluteElevation = Dp.m6973constructorimpl(arg0$iv + elevation3);
        ProvidedValue[] r15 = new ProvidedValue[2];
        r15[0] = ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor2));
        r15[r28] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m6971boximpl(absoluteElevation));
        final Modifier modifier3 = modifier2;
        final boolean r23 = r5;
        final Function0<Unit> r26 = r8;
        CompositionLocalKt.CompositionLocalProvider(r15, ComposableLambdaKt.rememberComposableLambda(-1391199439, r28, new SurfaceKt$Surface$5(modifier3, shape3, color3, absoluteElevation, border3, elevation3, r23, interactionSource2, enabled3, r26, r42), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L175;
        ComposerKt.traceEventEnd();
    L175:
        final long contentColor3 = contentColor2;
        final Shape shape4 = shape3;
        color2 = color3;
        final BorderStroke border4 = border3;
        final float elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final boolean enabled4 = enabled3;
        final Modifier modifier4 = modifier3;
    L177:
        ScopeUpdateScope r16 = $composer2.endRestartGroup();
        if (r16 == null) goto L181;
        r16.updateScope(new SurfaceKt$Surface$6(selected, r31, modifier4, enabled4, shape4, color2, contentColor3, border4, elevation4, interactionSource3, r42, $changed, $changed1, r46));
        return;
    L181:
        return;
    L168:
        interactionSource2 = interactionSource;
        border3 = border2;
        elevation3 = elevation2;
        enabled3 = enabled2;
        shape3 = shape2;
        $dirty4 = $dirty2;
        r6 = 262027249;
        color3 = color2;
        goto L169
    L165:
        r28 = 1;
        elevation2 = elevation;
        goto L166
    L162:
        border2 = border;
        goto L163
    L159:
        contentColor2 = contentColor;
        goto L160
    L150:
        enabled2 = r12;
        goto L151
    L147:
        modifier2 = r10;
        goto L148
    L136:
        if ($composer2.getDefaultsInvalid() == true) goto L145;
        $composer2.skipToGroupEnd();
        if ((r46 & 32) == 0) goto L142;
        $dirty2 = $dirty2 & (-458753);
    L142:
        if ((r46 & 64) == 0) goto L144;
        border3 = border;
        elevation3 = elevation;
        interactionSource2 = interactionSource;
        $dirty4 = $dirty2 & (-3670017);
        color3 = color2;
        modifier2 = r10;
        enabled3 = r12;
        shape3 = shape2;
        r6 = 262027249;
        r28 = 1;
        contentColor2 = contentColor;
        goto L169
    L144:
        border3 = border;
        elevation3 = elevation;
        interactionSource2 = interactionSource;
        modifier2 = r10;
        enabled3 = r12;
        shape3 = shape2;
        $dirty4 = $dirty2;
        r6 = 262027249;
        r28 = 1;
        contentColor2 = contentColor;
        color3 = color2;
        goto L169
    L176:
        $composer2.skipToGroupEnd();
        contentColor3 = contentColor;
        elevation4 = elevation;
        modifier4 = r10;
        enabled4 = r12;
        shape4 = shape2;
        border4 = border;
        interactionSource3 = interactionSource;
        goto L177
    L127:
        if (($dirty3 & 3) != 2) goto L130;
        r4 = false;
        goto L132
    L115:
        int $dirty5 = $changed1 & 6;
        if ($dirty5 != 0) goto L123;
        if ($composer2.changedInstance(r42) == false) goto L120;
        int r24 = 4;
    L121:
        $dirty1 = $dirty1 | r24;
        goto L123
    L120:
        r24 = 2;
    L123:
        $dirty3 = $dirty1;
        goto L125
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changed(interactionSource) == false) goto L109;
        int r25 = 536870912;
    L110:
        $dirty2 = $dirty2 | r25;
        goto L113
    L109:
        r25 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(elevation) == false) goto L98;
        int r22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty2 | r22;
        goto L101
    L98:
        r22 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(border) == false) goto L87;
        int r21 = 8388608;
    L88:
        $dirty2 = $dirty2 | r21;
        goto L90
    L87:
        r21 = 4194304;
        goto L88
    L71:
        if ((r46 & 64) != 0) goto L75;
        int $dirty6 = $dirty;
        $dirty1 = $changed1;
        if ($composer2.changed(contentColor) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty2 = $dirty6 | r19;
    L76:
        r19 = 524288;
        goto L77
    L75:
        $dirty6 = $dirty;
        $dirty1 = $changed1;
        goto L76
    L60:
        if ((r46 & 32) != 0) goto L64;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
    L65:
        r17 = 65536;
        goto L66
    L64:
        color2 = color;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L54;
        int r18 = 16384;
    L55:
        $dirty = $dirty | r18;
        goto L58
    L54:
        r18 = 8192;
        goto L55
    L56:
        shape2 = shape;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r12 = enabled;
        if ($composer2.changed(r12) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
        goto L46
    L43:
        r110 = 1024;
        goto L44
    L45:
        r12 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r10 = modifier;
        if ($composer2.changed(r10) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L35
    L32:
        r111 = 128;
        goto L33
    L34:
        r10 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = r31;
        if ($composer2.changedInstance(r8) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
        goto L24
    L21:
        r20 = 16;
        goto L22
    L23:
        r8 = r31;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = selected;
        if ($composer2.changed(r5) == false) goto L10;
        int r27 = 4;
    L11:
        $dirty = $dirty | r27;
        goto L14
    L10:
        r27 = 2;
        goto L11
    L12:
        r5 = selected;
        goto L14
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Surface-Ny5ogXk, reason: not valid java name */
    public static final void m1785SurfaceNy5ogXk(final boolean checked, final Function1<? super Boolean, Unit> r31, Modifier modifier, boolean enabled, Shape shape, long color, long contentColor, BorderStroke border, float elevation, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r42, Composer $composer, final int $changed, final int $changed1, final int r46) {
        Composer $composer2 = $composer.startRestartGroup(1341569296);
        ComposerKt.sourceInformation($composer2, "C(Surface)P(1,9,8,6,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color!1,5:c#ui.unit.Dp,7)*430@23068L7,434@23231L1019,431@23092L1158:Surface.kt#jmzs0o");
        int $dirty = $changed;
        if ((r46 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r5 = checked;
    L14:
        if ((r46 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function1<? super Boolean, Unit> r8 = r31;
    L24:
        int r9 = r46 & 4;
        if (r9 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier r10 = modifier;
    L35:
        int r11 = r46 & 8;
        if (r11 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r12 = enabled;
    L46:
        int r13 = r46 & 16;
        if (r13 == 0) goto L50;
        $dirty = $dirty | 24576;
        Shape shape2 = shape;
    L58:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L60;
        final long color2 = color;
    L69:
        if (($changed & 1572864) == 0) goto L71;
        int $dirty2 = $dirty;
        int $dirty1 = $changed1;
    L79:
        int r1 = r46 & 128;
        if (r1 == 0) goto L83;
        $dirty2 = $dirty2 | 12582912;
    L90:
        int r2 = r46 & 256;
        if (r2 == 0) goto L94;
        $dirty2 = $dirty2 | 100663296;
    L101:
        int r3 = r46 & 512;
        if (r3 == 0) goto L105;
        $dirty2 = $dirty2 | 805306368;
    L113:
        if ((r46 & 1024) == 0) goto L115;
        int $dirty3 = $dirty1 | 6;
    L125:
        if (($dirty2 & 306783379) == 306783378) goto L127;
    L130:
        boolean r4 = true;
    L132:
        if ($composer2.shouldExecute(r4, $dirty2 & 1) == false) goto L176;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "423@22794L6,424@22836L22");
        if (($changed & 1) != 0) goto L136;
    L145:
        if (r9 == 0) goto L147;
        Modifier.Companion modifier2 = Modifier.Companion;
    L148:
        if (r11 == 0) goto L150;
        boolean enabled2 = true;
    L151:
        if (r13 == 0) goto L154;
        shape2 = RectangleShapeKt.getRectangleShape();
    L154:
        if ((r46 & 32) == 0) goto L157;
        color2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty2 = $dirty2 & (-458753);
    L157:
        if ((r46 & 64) == 0) goto L159;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(color2, $composer2, ($dirty2 >> 15) & 14);
        $dirty2 = $dirty2 & (-3670017);
    L160:
        if (r1 == 0) goto L162;
        BorderStroke border2 = null;
    L163:
        if (r2 == 0) goto L165;
        char r28 = 1;
        float elevation2 = Dp.m6973constructorimpl(0);
    L166:
        if (r3 == 0) goto L168;
        final BorderStroke border3 = border2;
        final float elevation3 = elevation2;
        final boolean enabled3 = enabled2;
        final MutableInteractionSource interactionSource2 = null;
        final Shape shape3 = shape2;
        int $dirty4 = $dirty2;
        int r6 = 1341569296;
        final long color3 = color2;
    L169:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L172;
        ComposerKt.traceEventStart(r6, $dirty4, $dirty3, "androidx.compose.material.Surface (Surface.kt:429)");
    L172:
        ProvidableCompositionLocal<Dp> r7 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float arg0$iv = ((Dp) r14).m6987unboximpl();
        final float absoluteElevation = Dp.m6973constructorimpl(arg0$iv + elevation3);
        ProvidedValue[] r15 = new ProvidedValue[2];
        r15[0] = ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor2));
        r15[r28] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m6971boximpl(absoluteElevation));
        final Modifier modifier3 = modifier2;
        final boolean r23 = r5;
        final Function1<? super Boolean, Unit> r26 = r8;
        CompositionLocalKt.CompositionLocalProvider(r15, ComposableLambdaKt.rememberComposableLambda(-311657392, r28, new SurfaceKt$Surface$7(modifier3, shape3, color3, absoluteElevation, border3, elevation3, r23, interactionSource2, enabled3, r26, r42), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L175;
        ComposerKt.traceEventEnd();
    L175:
        final long contentColor3 = contentColor2;
        final Shape shape4 = shape3;
        color2 = color3;
        final BorderStroke border4 = border3;
        final float elevation4 = elevation3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final boolean enabled4 = enabled3;
        final Modifier modifier4 = modifier3;
    L177:
        ScopeUpdateScope r16 = $composer2.endRestartGroup();
        if (r16 == null) goto L181;
        r16.updateScope(new SurfaceKt$Surface$8(checked, r31, modifier4, enabled4, shape4, color2, contentColor3, border4, elevation4, interactionSource3, r42, $changed, $changed1, r46));
        return;
    L181:
        return;
    L168:
        interactionSource2 = interactionSource;
        border3 = border2;
        elevation3 = elevation2;
        enabled3 = enabled2;
        shape3 = shape2;
        $dirty4 = $dirty2;
        r6 = 1341569296;
        color3 = color2;
        goto L169
    L165:
        r28 = 1;
        elevation2 = elevation;
        goto L166
    L162:
        border2 = border;
        goto L163
    L159:
        contentColor2 = contentColor;
        goto L160
    L150:
        enabled2 = r12;
        goto L151
    L147:
        modifier2 = r10;
        goto L148
    L136:
        if ($composer2.getDefaultsInvalid() == true) goto L145;
        $composer2.skipToGroupEnd();
        if ((r46 & 32) == 0) goto L142;
        $dirty2 = $dirty2 & (-458753);
    L142:
        if ((r46 & 64) == 0) goto L144;
        border3 = border;
        elevation3 = elevation;
        interactionSource2 = interactionSource;
        $dirty4 = $dirty2 & (-3670017);
        color3 = color2;
        modifier2 = r10;
        enabled3 = r12;
        shape3 = shape2;
        r6 = 1341569296;
        r28 = 1;
        contentColor2 = contentColor;
        goto L169
    L144:
        border3 = border;
        elevation3 = elevation;
        interactionSource2 = interactionSource;
        modifier2 = r10;
        enabled3 = r12;
        shape3 = shape2;
        $dirty4 = $dirty2;
        r6 = 1341569296;
        r28 = 1;
        contentColor2 = contentColor;
        color3 = color2;
        goto L169
    L176:
        $composer2.skipToGroupEnd();
        contentColor3 = contentColor;
        elevation4 = elevation;
        modifier4 = r10;
        enabled4 = r12;
        shape4 = shape2;
        border4 = border;
        interactionSource3 = interactionSource;
        goto L177
    L127:
        if (($dirty3 & 3) != 2) goto L130;
        r4 = false;
        goto L132
    L115:
        int $dirty5 = $changed1 & 6;
        if ($dirty5 != 0) goto L123;
        if ($composer2.changedInstance(r42) == false) goto L120;
        int r24 = 4;
    L121:
        $dirty1 = $dirty1 | r24;
        goto L123
    L120:
        r24 = 2;
    L123:
        $dirty3 = $dirty1;
        goto L125
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changed(interactionSource) == false) goto L109;
        int r25 = 536870912;
    L110:
        $dirty2 = $dirty2 | r25;
        goto L113
    L109:
        r25 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(elevation) == false) goto L98;
        int r22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty2 | r22;
        goto L101
    L98:
        r22 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(border) == false) goto L87;
        int r21 = 8388608;
    L88:
        $dirty2 = $dirty2 | r21;
        goto L90
    L87:
        r21 = 4194304;
        goto L88
    L71:
        if ((r46 & 64) != 0) goto L75;
        int $dirty6 = $dirty;
        $dirty1 = $changed1;
        if ($composer2.changed(contentColor) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty2 = $dirty6 | r19;
    L76:
        r19 = 524288;
        goto L77
    L75:
        $dirty6 = $dirty;
        $dirty1 = $changed1;
        goto L76
    L60:
        if ((r46 & 32) != 0) goto L64;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
    L65:
        r17 = 65536;
        goto L66
    L64:
        color2 = color;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L54;
        int r18 = 16384;
    L55:
        $dirty = $dirty | r18;
        goto L58
    L54:
        r18 = 8192;
        goto L55
    L56:
        shape2 = shape;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        r12 = enabled;
        if ($composer2.changed(r12) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
        goto L46
    L43:
        r110 = 1024;
        goto L44
    L45:
        r12 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r10 = modifier;
        if ($composer2.changed(r10) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L35
    L32:
        r111 = 128;
        goto L33
    L34:
        r10 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = r31;
        if ($composer2.changedInstance(r8) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
        goto L24
    L21:
        r20 = 16;
        goto L22
    L23:
        r8 = r31;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = checked;
        if ($composer2.changed(r5) == false) goto L10;
        int r27 = 4;
    L11:
        $dirty = $dirty | r27;
        goto L14
    L10:
        r27 = 2;
        goto L11
    L12:
        r5 = checked;
        goto L14
    }

    /* JADX INFO: renamed from: surface-8ww4TTg, reason: not valid java name */
    private static final Modifier m1788surface8ww4TTg(Modifier $this$surface_u2d8ww4TTg, Shape shape, long backgroundColor, BorderStroke border, float elevation) {
        Modifier $this$surface_u2d8ww4TTg2 = ShadowKt.m4001shadows4CzXII$default($this$surface_u2d8ww4TTg, elevation, shape, false, 0, 0, 24, null);
        Modifier.Companion r11 = Modifier.Companion;
        if (border == null) goto L6;
        r11 = BorderKt.border(r11, border, shape);
    L6:
        return ClipKt.clip(BackgroundKt.m233backgroundbw27NRU($this$surface_u2d8ww4TTg2.then(r11), backgroundColor, shape), shape);
    }

    /* JADX INFO: renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    private static final long m1789surfaceColorAtElevationcq6XJ1M(long color, ElevationOverlay elevationOverlay, float absoluteElevation, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1561611256, "C(surfaceColorAtElevation)P(1:c#ui.graphics.Color,2,0:c#ui.unit.Dp)481@24772L6:Surface.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1561611256, $changed, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:480)");
    L6:
        if (Color.m4367equalsimpl0(color, MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU()) == false) goto L9;
        if (elevationOverlay == null) goto L9;
        $composer.startReplaceGroup(1082922676);
        ComposerKt.sourceInformation($composer, "482@24843L31");
        Composer $composer2 = $composer;
        long color2 = elevationOverlay.mo1639apply7g2Lkgo(color, absoluteElevation, $composer2, (($changed & 14) | (($changed >> 3) & 112)) | (($changed << 3) & 896));
        $composer2.endReplaceGroup();
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventEnd();
    L13:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return color2;
    L9:
        $composer2 = $composer;
        $composer2.startReplaceGroup(1082990783);
        $composer2.endReplaceGroup();
        color2 = color;
        goto L11
    }
}
