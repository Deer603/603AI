package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Tooltip.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0093\u0001\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"PlainTooltip", "", "Landroidx/compose/material3/TooltipScope;", "modifier", "Landroidx/compose/ui/Modifier;", "caretSize", "Landroidx/compose/ui/unit/DpSize;", "shape", "Landroidx/compose/ui/graphics/Shape;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "containerColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PlainTooltip-7QI4Sbk", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "RichTooltip", "title", "action", "colors", "Landroidx/compose/material3/RichTooltipColors;", "text", "RichTooltip-yDvdmqw", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "drawCaretWithPath", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "caretType", "Landroidx/compose/material3/CaretType;", "density", "Landroidx/compose/ui/unit/Density;", "configuration", "Landroid/content/res/Configuration;", "anchorLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "drawCaretWithPath-JKu-mZY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/material3/CaretType;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJLandroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Tooltip_androidKt {
    /* JADX INFO: renamed from: access$drawCaretWithPath-JKu-mZY, reason: not valid java name */
    public static final /* synthetic */ DrawResult m2973access$drawCaretWithPathJKumZY(CacheDrawScope $receiver, CaretType caretType, Density density, Configuration configuration, long containerColor, long caretSize, LayoutCoordinates anchorLayoutCoordinates) {
        return m2974drawCaretWithPathJKumZY($receiver, caretType, density, configuration, containerColor, caretSize, anchorLayoutCoordinates);
    }

    /* JADX INFO: renamed from: PlainTooltip-7QI4Sbk, reason: not valid java name */
    public static final void m2971PlainTooltip7QI4Sbk(final TooltipScope $this$PlainTooltip_u2d7QI4Sbk, Modifier modifier, long caretSize, Shape shape, long contentColor, long containerColor, float tonalElevation, float shadowElevation, final Function2<? super Composer, ? super Integer, Unit> r39, Composer $composer, final int $changed, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(1407069716);
        ComposerKt.sourceInformation($composer2, "C(PlainTooltip)P(4,0:c#ui.unit.DpSize,6,3:c#ui.graphics.Color,1:c#ui.graphics.Color,7:c#ui.unit.Dp,5:c#ui.unit.Dp)208@8412L26,209@8482L24,211@8552L26,96@3876L606,90@3685L797:Tooltip.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((Integer.MIN_VALUE & r42) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r4 = r42 & 1;
        if (r4 == 0) goto L19;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L27:
        if (($changed & 384) != 0) goto L38;
        if ((r42 & 2) != 0) goto L34;
        if ($composer2.changed(caretSize) == false) goto L34;
        int r6 = 256;
    L35:
        $dirty = $dirty | r6;
    L34:
        r6 = 128;
    L38:
        if (($changed & 3072) == 0) goto L40;
        Shape shape2 = shape;
    L49:
        if (($changed & 24576) == 0) goto L51;
        final long contentColor2 = contentColor;
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) goto L62;
        long containerColor2 = containerColor;
    L70:
        int r9 = r42 & 32;
        if (r9 == 0) goto L74;
        $dirty = $dirty | 1572864;
        float tonalElevation2 = tonalElevation;
    L81:
        int r18 = r42 & 64;
        if (r18 == 0) goto L85;
        $dirty = $dirty | 12582912;
    L93:
        if ((r42 & 128) == 0) goto L96;
        $dirty = $dirty | 100663296;
    L103:
        if ((38347923 & $dirty) == 38347922) goto L105;
    L108:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L111;
    L126:
        if (r4 == 0) goto L129;
        modifier2 = Modifier.Companion;
    L129:
        if ((r42 & 2) == 0) goto L131;
        long caretSize2 = DpSize.Companion.m7080getUnspecifiedMYxV2XQ();
        $dirty = $dirty & (-897);
    L133:
        if ((r42 & 4) == 0) goto L136;
        $dirty = $dirty & (-7169);
        shape2 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape($composer2, 6);
    L136:
        if ((r42 & 8) == 0) goto L139;
        contentColor2 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor($composer2, 6);
        $dirty = $dirty & (-57345);
    L139:
        if ((r42 & 16) == 0) goto L141;
        containerColor2 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor($composer2, 6);
        $dirty = $dirty & (-458753);
    L141:
        if (r9 == 0) goto L143;
        tonalElevation2 = Dp.m6973constructorimpl(0);
    L143:
        if (r18 == 0) goto L145;
        float shadowElevation2 = Dp.m6973constructorimpl(0);
        int $dirty2 = $dirty;
        float tonalElevation3 = tonalElevation2;
        long caretSize3 = caretSize2;
    L146:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L150;
        ComposerKt.traceEventStart(1407069716, $dirty2, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:73)");
    L150:
        $composer2.startReplaceGroup(-333850415);
        ComposerKt.sourceInformation($composer2, "76@3183L7,77@3242L7,78@3281L343");
        long $this$isSpecified$iv = caretSize3;
        if ($this$isSpecified$iv == InlineClassHelperKt.UnspecifiedPackedFloats) goto L153;
        int r7 = 1;
    L154:
        if (r7 == 0) goto L180;
        ProvidableCompositionLocal<Density> r8 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r10;
        ProvidableCompositionLocal<Configuration> r11 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r13 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Configuration configuration = (Configuration) r13;
        Modifier.Companion r14 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -333845325, "CC(remember):Tooltip.android.kt#9igjgp");
        boolean r15 = $composer2.changed(density) | $composer2.changedInstance(configuration);
        if (((458752 & $dirty2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) goto L160;
        if ($composer2.changed(containerColor2) == false) goto L160;
    L161:
        boolean r12 = true;
    L163:
        boolean r16 = r12 | r15;
        if ((($dirty2 & 896) ^ 384) <= 256) goto L168;
        if ($composer2.changed(caretSize3) == false) goto L168;
    L169:
        boolean r17 = true;
    L171:
        boolean invalid$iv = r16 | r17;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L177;
        final long caretSize4 = caretSize3;
        if (it$iv == Composer.Companion.getEmpty()) goto L178;
        Object value$iv = it$iv;
        long containerColor3 = containerColor2;
        long containerColor4 = caretSize4;
    L179:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier drawCaretModifier = $this$PlainTooltip_u2d7QI4Sbk.drawCaret(r14, (Function2) value$iv).then(modifier2);
    L181:
        $composer2.endReplaceGroup();
        Shape shape3 = shape2;
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(drawCaretModifier, shape3, containerColor3, 0, tonalElevation3, shadowElevation2, null, ComposableLambdaKt.rememberComposableLambda(1430116975, true, new Tooltip_androidKt$PlainTooltip$1(contentColor2, r39), $composer2, 54), $composer3, ((((($dirty2 >> 6) & 112) | 12582912) | (($dirty2 >> 9) & 896)) | (($dirty2 >> 6) & 57344)) | (($dirty2 >> 6) & 458752), 72);
        if (ComposerKt.isTraceInProgress() == false) goto L184;
        ComposerKt.traceEventEnd();
    L184:
        int $dirty3 = $dirty2;
        final Modifier modifier3 = modifier2;
        final long caretSize5 = containerColor4;
        final long contentColor3 = contentColor2;
        final Shape shape4 = shape3;
        final long containerColor5 = containerColor3;
        final float tonalElevation4 = tonalElevation3;
        final float shadowElevation3 = shadowElevation2;
    L185:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L189;
        r0.updateScope(new Tooltip_androidKt$PlainTooltip$2($this$PlainTooltip_u2d7QI4Sbk, modifier3, caretSize5, shape4, contentColor3, containerColor5, tonalElevation4, shadowElevation3, r39, $changed, r42));
        return;
    L189:
        return;
    L178:
        final long containerColor6 = containerColor2;
        containerColor3 = containerColor6;
        containerColor4 = caretSize4;
        value$iv = (Function2) new Tooltip_androidKt$PlainTooltip$drawCaretModifier$1$1(density, configuration, containerColor6, caretSize4);
        $composer2.updateRememberedValue(value$iv);
        goto L179
    L177:
        caretSize4 = caretSize3;
    L168:
        if (($dirty2 & 384) == 256) goto L169;
        r17 = false;
    L160:
        if (($dirty2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) goto L161;
        r12 = false;
        goto L163
    L180:
        containerColor3 = containerColor2;
        containerColor4 = caretSize3;
        drawCaretModifier = modifier2;
        goto L181
    L153:
        r7 = 0;
        goto L154
    L145:
        shadowElevation2 = shadowElevation;
        $dirty2 = $dirty;
        tonalElevation3 = tonalElevation2;
        caretSize3 = caretSize2;
        goto L146
    L131:
        caretSize2 = caretSize;
        goto L133
    L111:
        if ($composer2.getDefaultsInvalid() == true) goto L126;
        $composer2.skipToGroupEnd();
        if ((r42 & 2) == 0) goto L117;
        $dirty = $dirty & (-897);
    L117:
        if ((r42 & 4) == 0) goto L120;
        $dirty = $dirty & (-7169);
    L120:
        if ((r42 & 8) == 0) goto L123;
        $dirty = $dirty & (-57345);
    L123:
        if ((r42 & 16) == 0) goto L125;
        $dirty2 = $dirty & (-458753);
        caretSize3 = caretSize;
        shadowElevation2 = shadowElevation;
        tonalElevation3 = tonalElevation2;
        goto L146
    L125:
        shadowElevation2 = shadowElevation;
        $dirty2 = $dirty;
        tonalElevation3 = tonalElevation2;
        caretSize3 = caretSize;
        goto L146
    L105:
        if ($composer2.getSkipping() == false) goto L108;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier3 = modifier2;
        shape4 = shape2;
        containerColor5 = containerColor2;
        contentColor3 = contentColor2;
        tonalElevation4 = tonalElevation2;
        shadowElevation3 = shadowElevation;
        $dirty3 = $dirty;
        caretSize5 = caretSize;
        goto L185
    L96:
        if (($changed & 100663296) != 0) goto L103;
        if ($composer2.changedInstance(r39) == false) goto L100;
        int r1 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L101:
        $dirty = $dirty | r1;
        goto L103
    L100:
        r1 = 33554432;
        goto L101
    L85:
        if (($changed & 12582912) != 0) goto L93;
        if ($composer2.changed(shadowElevation) == false) goto L89;
        int r21 = 8388608;
    L90:
        $dirty = $dirty | r21;
        goto L93
    L89:
        r21 = 4194304;
        goto L90
    L74:
        if (($changed & 1572864) != 0) goto L80;
        tonalElevation2 = tonalElevation;
        if ($composer2.changed(tonalElevation2) == false) goto L78;
        int r19 = 1048576;
    L79:
        $dirty = $dirty | r19;
        goto L81
    L78:
        r19 = 524288;
        goto L79
    L80:
        tonalElevation2 = tonalElevation;
        goto L81
    L62:
        if ((r42 & 16) != 0) goto L66;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L67;
        int r20 = 131072;
    L68:
        $dirty = $dirty | r20;
    L67:
        r20 = 65536;
        goto L68
    L66:
        containerColor2 = containerColor;
        goto L67
    L51:
        if ((r42 & 8) != 0) goto L55;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L56;
        int r110 = 16384;
    L57:
        $dirty = $dirty | r110;
    L56:
        r110 = 8192;
        goto L57
    L55:
        contentColor2 = contentColor;
        goto L56
    L40:
        if ((r42 & 4) != 0) goto L44;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L45;
        int r111 = 2048;
    L46:
        $dirty = $dirty | r111;
    L45:
        r111 = 1024;
        goto L46
    L44:
        shape2 = shape;
        goto L45
    L19:
        if (($changed & 48) != 0) goto L25;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L23;
        int r22 = 32;
    L24:
        $dirty = $dirty | r22;
        goto L27
    L23:
        r22 = 16;
        goto L24
    L25:
        modifier2 = modifier;
        goto L27
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r5 = $composer2.changed($this$PlainTooltip_u2d7QI4Sbk);
    L11:
        if (r5 == false) goto L13;
        int r23 = 4;
    L14:
        $dirty = $dirty | r23;
        goto L15
    L13:
        r23 = 2;
        goto L14
    L10:
        r5 = $composer2.changedInstance($this$PlainTooltip_u2d7QI4Sbk);
        goto L11
    }

    /* JADX INFO: renamed from: RichTooltip-yDvdmqw, reason: not valid java name */
    public static final void m2972RichTooltipyDvdmqw(final TooltipScope $this$RichTooltip_u2dyDvdmqw, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r35, Function2<? super Composer, ? super Integer, Unit> r36, long caretSize, Shape shape, RichTooltipColors colors, float tonalElevation, float shadowElevation, final Function2<? super Composer, ? super Integer, Unit> r43, Composer $composer, final int $changed, final int r46) {
        Composer $composer2 = $composer.startRestartGroup(1867454921);
        ComposerKt.sourceInformation($composer2, "C(RichTooltip)P(3,7!1,1:c#ui.unit.DpSize,5!1,8:c#ui.unit.Dp,4:c#ui.unit.Dp)255@9959L25,257@10034L19,*148@5873L7,150@5944L11,150@5956L61,178@6991L1595,167@6622L1964:Tooltip.android.kt#uh7d8r");
        int $dirty = $changed;
        if ((Integer.MIN_VALUE & r46) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r4 = r46 & 1;
        if (r4 == 0) goto L19;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L26:
        int r6 = r46 & 2;
        if (r6 == 0) goto L30;
        $dirty = $dirty | 384;
        final Function2<? super Composer, ? super Integer, Unit> r7 = r35;
    L37:
        int r8 = r46 & 4;
        if (r8 == 0) goto L41;
        $dirty = $dirty | 3072;
        final Function2<? super Composer, ? super Integer, Unit> r9 = r36;
    L49:
        if (($changed & 24576) == 0) goto L51;
        long caretSize2 = caretSize;
    L60:
        if ((196608 & $changed) == 0) goto L62;
        Shape shape2 = shape;
    L71:
        if (($changed & 1572864) != 0) goto L81;
        if ((r46 & 32) != 0) goto L78;
        if ($composer2.changed(colors) == false) goto L78;
        int r17 = 1048576;
    L79:
        $dirty = $dirty | r17;
    L78:
        r17 = 524288;
    L81:
        int r18 = r46 & 64;
        if (r18 == 0) goto L85;
        $dirty = $dirty | 12582912;
    L92:
        int r0 = r46 & 128;
        if (r0 == 0) goto L96;
        $dirty = $dirty | 100663296;
    L104:
        if ((r46 & 256) == 0) goto L107;
        $dirty = $dirty | 805306368;
    L113:
        int $dirty2 = $dirty;
        if ((306783379 & $dirty) == 306783378) goto L116;
    L119:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L122;
    L134:
        if (r4 == 0) goto L136;
        modifier2 = Modifier.Companion;
    L136:
        if (r6 == 0) goto L138;
        r7 = null;
    L138:
        if (r8 == 0) goto L141;
        r9 = null;
    L141:
        if ((r46 & 8) == 0) goto L144;
        caretSize2 = DpSize.Companion.m7080getUnspecifiedMYxV2XQ();
        $dirty2 = $dirty2 & (-57345);
    L144:
        if ((r46 & 16) == 0) goto L147;
        $dirty2 = $dirty2 & (-458753);
        shape2 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape($composer2, 6);
    L147:
        if ((r46 & 32) == 0) goto L149;
        RichTooltipColors colors2 = TooltipDefaults.INSTANCE.richTooltipColors($composer2, 6);
        $dirty2 = $dirty2 & (-3670017);
    L150:
        if (r18 == 0) goto L152;
        float tonalElevation2 = ElevationTokens.INSTANCE.m3299getLevel0D9Ej5fM();
    L153:
        if (r0 == 0) goto L155;
        int r21 = $dirty2;
        float tonalElevation3 = tonalElevation2;
        int $dirty3 = r21;
        float shadowElevation2 = RichTooltipTokens.INSTANCE.m3597getContainerElevationD9Ej5fM();
    L156:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L159;
        ComposerKt.traceEventStart(1867454921, $dirty3, -1, "androidx.compose.material3.RichTooltip (Tooltip.android.kt:147)");
    L159:
        ProvidableCompositionLocal<Dp> r3 = SurfaceKt.getLocalAbsoluteTonalElevation();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r16 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float arg0$iv = ((Dp) r16).m6987unboximpl();
        long elevatedColor = ColorSchemeKt.m2055applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme($composer2, 6), colors2.m2526getContainerColor0d7_KjU(), Dp.m6973constructorimpl(arg0$iv + tonalElevation3), $composer2, 0);
        Shape shape3 = shape2;
        $composer2.startReplaceGroup(1472746423);
        ComposerKt.sourceInformation($composer2, "153@6122L7,154@6181L7,155@6220L341");
        long $this$isSpecified$iv = caretSize2;
        if ($this$isSpecified$iv == InlineClassHelperKt.UnspecifiedPackedFloats) goto L162;
        boolean r19 = true;
    L163:
        if (r19 == false) goto L181;
        ProvidableCompositionLocal<Density> r10 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r12 = $composer2.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r12;
        ProvidableCompositionLocal<Configuration> r13 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r11 = $composer2.consume(r13);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Configuration configuration = (Configuration) r11;
        Modifier.Companion r14 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 1472751513, "CC(remember):Tooltip.android.kt#9igjgp");
        boolean r1 = ($composer2.changed(density) | $composer2.changedInstance(configuration)) | $composer2.changed(elevatedColor);
        if (((57344 & $dirty3) ^ 24576) <= 16384) goto L169;
        if ($composer2.changed(caretSize2) == false) goto L169;
    L170:
        boolean r2 = true;
    L172:
        boolean invalid$iv = r1 | r2;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L178;
        final long elevatedColor2 = elevatedColor;
        if (it$iv == Composer.Companion.getEmpty()) goto L179;
        Object value$iv = it$iv;
        long caretSize3 = caretSize2;
    L180:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier drawCaretModifier = $this$RichTooltip_u2dyDvdmqw.drawCaret(r14, (Function2) value$iv).then(modifier2);
    L182:
        $composer2.endReplaceGroup();
        Modifier drawCaretModifier2 = drawCaretModifier;
        final RichTooltipColors colors3 = colors2;
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(SizeKt.m776sizeInqDBjuR0$default(drawCaretModifier2, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getRichTooltipMaxWidth(), 0.0f, 8, null), shape3, colors2.m2526getContainerColor0d7_KjU(), 0, tonalElevation3, shadowElevation2, null, ComposableLambdaKt.rememberComposableLambda(317290958, true, new Tooltip_androidKt$RichTooltip$1(r7, r9, colors3, r43), $composer2, 54), $composer3, (((($dirty3 >> 12) & 112) | 12582912) | (($dirty3 >> 9) & 57344)) | (($dirty3 >> 9) & 458752), 72);
        if (ComposerKt.isTraceInProgress() == false) goto L185;
        ComposerKt.traceEventEnd();
    L185:
        final Function2<? super Composer, ? super Integer, Unit> r5 = r9;
        final float tonalElevation4 = tonalElevation3;
        final RichTooltipColors colors4 = colors3;
        final Modifier modifier3 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r15 = r7;
        final Shape shape4 = shape3;
        final float shadowElevation3 = shadowElevation2;
        final long caretSize4 = caretSize3;
    L186:
        ScopeUpdateScope r110 = $composer3.endRestartGroup();
        if (r110 == null) goto L190;
        r110.updateScope(new Tooltip_androidKt$RichTooltip$2($this$RichTooltip_u2dyDvdmqw, modifier3, r15, r5, caretSize4, shape4, colors4, tonalElevation4, shadowElevation3, r43, $changed, r46));
        return;
    L190:
        return;
    L179:
        final long caretSize5 = caretSize2;
        caretSize3 = caretSize5;
        value$iv = (Function2) new Tooltip_androidKt$RichTooltip$drawCaretModifier$1$1(density, configuration, elevatedColor2, caretSize5);
        $composer2.updateRememberedValue(value$iv);
        goto L180
    L178:
        elevatedColor2 = elevatedColor;
    L169:
        if (($dirty3 & 24576) == 16384) goto L170;
        r2 = false;
        goto L172
    L181:
        caretSize3 = caretSize2;
        drawCaretModifier = modifier2;
        goto L182
    L162:
        r19 = false;
        goto L163
    L155:
        int r22 = $dirty2;
        tonalElevation3 = tonalElevation2;
        $dirty3 = r22;
        shadowElevation2 = shadowElevation;
        goto L156
    L152:
        tonalElevation2 = tonalElevation;
        goto L153
    L149:
        colors2 = colors;
        goto L150
    L122:
        if ($composer2.getDefaultsInvalid() == true) goto L134;
        $composer2.skipToGroupEnd();
        if ((r46 & 8) == 0) goto L128;
        $dirty2 = $dirty2 & (-57345);
    L128:
        if ((r46 & 16) == 0) goto L131;
        $dirty2 = $dirty2 & (-458753);
    L131:
        if ((r46 & 32) == 0) goto L133;
        int r20 = $dirty2 & (-3670017);
        tonalElevation3 = tonalElevation;
        shadowElevation2 = shadowElevation;
        $dirty3 = r20;
        colors2 = colors;
        goto L156
    L133:
        colors2 = colors;
        shadowElevation2 = shadowElevation;
        $dirty3 = $dirty2;
        tonalElevation3 = tonalElevation;
        goto L156
    L116:
        if ($composer2.getSkipping() == false) goto L119;
        $composer2.skipToGroupEnd();
        colors4 = colors;
        $composer3 = $composer2;
        modifier3 = modifier2;
        r15 = r7;
        r5 = r9;
        shape4 = shape2;
        caretSize4 = caretSize2;
        tonalElevation4 = tonalElevation;
        shadowElevation3 = shadowElevation;
        goto L186
    L107:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(r43) == false) goto L111;
        int r23 = 536870912;
    L112:
        $dirty = $dirty | r23;
        goto L113
    L111:
        r23 = 268435456;
        goto L112
    L96:
        if (($changed & 100663296) != 0) goto L104;
        if ($composer2.changed(shadowElevation) == false) goto L100;
        int r24 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L101:
        $dirty = $dirty | r24;
        goto L104
    L100:
        r24 = 33554432;
        goto L101
    L85:
        if (($changed & 12582912) != 0) goto L92;
        if ($composer2.changed(tonalElevation) == false) goto L89;
        int r111 = 8388608;
    L90:
        $dirty = $dirty | r111;
        goto L92
    L89:
        r111 = 4194304;
        goto L90
    L62:
        if ((r46 & 16) != 0) goto L66;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L67;
        int r112 = 131072;
    L68:
        $dirty = $dirty | r112;
    L67:
        r112 = 65536;
        goto L68
    L66:
        shape2 = shape;
        goto L67
    L51:
        if ((r46 & 8) != 0) goto L55;
        caretSize2 = caretSize;
        if ($composer2.changed(caretSize2) == false) goto L56;
        int r113 = 16384;
    L57:
        $dirty = $dirty | r113;
    L56:
        r113 = 8192;
        goto L57
    L55:
        caretSize2 = caretSize;
        goto L56
    L41:
        if (($changed & 3072) != 0) goto L47;
        r9 = r36;
        if ($composer2.changedInstance(r9) == false) goto L45;
        int r114 = 2048;
    L46:
        $dirty = $dirty | r114;
        goto L49
    L45:
        r114 = 1024;
        goto L46
    L47:
        r9 = r36;
        goto L49
    L30:
        if (($changed & 384) != 0) goto L36;
        r7 = r35;
        if ($composer2.changedInstance(r7) == false) goto L34;
        int r25 = 256;
    L35:
        $dirty = $dirty | r25;
        goto L37
    L34:
        r25 = 128;
        goto L35
    L36:
        r7 = r35;
        goto L37
    L19:
        if (($changed & 48) != 0) goto L25;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L23;
        int r26 = 32;
    L24:
        $dirty = $dirty | r26;
        goto L26
    L23:
        r26 = 16;
        goto L24
    L25:
        modifier2 = modifier;
        goto L26
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r27 = $composer2.changed($this$RichTooltip_u2dyDvdmqw);
    L11:
        if (r27 == false) goto L13;
        int r28 = 4;
    L14:
        $dirty = $dirty | r28;
        goto L15
    L13:
        r28 = 2;
        goto L14
    L10:
        r27 = $composer2.changedInstance($this$RichTooltip_u2dyDvdmqw);
        goto L11
    }

    /* JADX INFO: renamed from: drawCaretWithPath-JKu-mZY, reason: not valid java name */
    private static final DrawResult m2974drawCaretWithPathJKumZY(CacheDrawScope $this$drawCaretWithPath_u2dJKu_u2dmZY, CaretType caretType, Density density, Configuration configuration, final long containerColor, long caretSize, final LayoutCoordinates anchorLayoutCoordinates) {
        final Path path = AndroidPath_androidKt.Path();
        if (anchorLayoutCoordinates == null) goto L35;
        int caretHeightPx = density.mo370roundToPx0680j_4(DpSize.m7069getHeightD9Ej5fM(caretSize));
        int caretWidthPx = density.mo370roundToPx0680j_4(DpSize.m7071getWidthD9Ej5fM(caretSize));
        int $this$dp$iv = configuration.screenWidthDp;
        int screenWidthPx = density.mo370roundToPx0680j_4(Dp.m6973constructorimpl($this$dp$iv));
        int tooltipAnchorSpacing = density.mo370roundToPx0680j_4(TooltipKt.getSpacingBetweenTooltipAndAnchor());
        Rect anchorBounds = LayoutCoordinatesKt.boundsInWindow(anchorLayoutCoordinates);
        float anchorLeft = anchorBounds.getLeft();
        float anchorRight = anchorBounds.getRight();
        float anchorTop = anchorBounds.getTop();
        float anchorMid = (anchorRight + anchorLeft) / 2.0f;
        float anchorWidth = anchorRight - anchorLeft;
        float tooltipWidth = Size.m4194getWidthimpl($this$drawCaretWithPath_u2dJKu_u2dmZY.m3986getSizeNHjbRc());
        float tooltipHeight = Size.m4191getHeightimpl($this$drawCaretWithPath_u2dJKu_u2dmZY.m3986getSizeNHjbRc());
        if (((anchorTop - tooltipHeight) - tooltipAnchorSpacing) >= 0.0f) goto L7;
        boolean isCaretTop = true;
    L8:
        if (isCaretTop == false) goto L10;
        float r18 = 0.0f;
    L11:
        float caretY = r18;
        if (caretType == CaretType.Plain) goto L14;
        float anchorMidFromRightScreenEdge = caretY;
        long preferredPosition = OffsetKt.Offset(anchorMid - anchorLeft, anchorMidFromRightScreenEdge);
        if ((anchorLeft + tooltipWidth) <= screenWidthPx) goto L29;
        preferredPosition = OffsetKt.Offset(anchorMid - (anchorRight - tooltipWidth), anchorMidFromRightScreenEdge);
        if ((anchorRight - tooltipWidth) >= 0.0f) goto L29;
        if (((anchorLeft - (tooltipWidth / 2.0f)) + (anchorWidth / 2.0f)) > 0.0f) goto L26;
        preferredPosition = OffsetKt.Offset(anchorMid, anchorMidFromRightScreenEdge);
        goto L29
    L26:
        if ((((tooltipWidth / 2.0f) + anchorRight) - (anchorWidth / 2.0f)) < screenWidthPx) goto L28;
        float caretX = tooltipWidth - (screenWidthPx - anchorMid);
        preferredPosition = OffsetKt.Offset(caretX, anchorMidFromRightScreenEdge);
        goto L29
    L28:
        preferredPosition = OffsetKt.Offset(tooltipWidth / 2.0f, anchorMidFromRightScreenEdge);
    L29:
        long position = preferredPosition;
    L30:
        if (isCaretTop == false) goto L32;
        path.moveTo(Offset.m4125getXimpl(position), Offset.m4126getYimpl(position));
        path.lineTo(Offset.m4125getXimpl(position) + (caretWidthPx / 2), Offset.m4126getYimpl(position));
        path.lineTo(Offset.m4125getXimpl(position), Offset.m4126getYimpl(position) - caretHeightPx);
        path.lineTo(Offset.m4125getXimpl(position) - (caretWidthPx / 2), Offset.m4126getYimpl(position));
        path.close();
        goto L35
    L32:
        path.moveTo(Offset.m4125getXimpl(position), Offset.m4126getYimpl(position));
        path.lineTo(Offset.m4125getXimpl(position) + (caretWidthPx / 2), Offset.m4126getYimpl(position));
        path.lineTo(Offset.m4125getXimpl(position), Offset.m4126getYimpl(position) + caretHeightPx);
        path.lineTo(Offset.m4125getXimpl(position) - (caretWidthPx / 2), Offset.m4126getYimpl(position));
        path.close();
        goto L35
    L14:
        if (((tooltipWidth / 2.0f) + anchorMid) <= screenWidthPx) goto L16;
        float caretX2 = tooltipWidth - (screenWidthPx - anchorMid);
        anchorMidFromRightScreenEdge = caretY;
        position = OffsetKt.Offset(caretX2, anchorMidFromRightScreenEdge);
        goto L30
    L16:
        anchorMidFromRightScreenEdge = caretY;
        float tooltipLeft = anchorLeft - ((Size.m4194getWidthimpl($this$drawCaretWithPath_u2dJKu_u2dmZY.m3986getSizeNHjbRc()) / 2.0f) - (anchorWidth / 2.0f));
        float caretX3 = anchorMid - Math.max(tooltipLeft, 0.0f);
        position = OffsetKt.Offset(caretX3, anchorMidFromRightScreenEdge);
        goto L30
    L10:
        r18 = tooltipHeight;
        goto L11
    L7:
        isCaretTop = false;
    L35:
        return $this$drawCaretWithPath_u2dJKu_u2dmZY.onDrawWithContent(new Tooltip_androidKt$drawCaretWithPath$4(anchorLayoutCoordinates, path, containerColor));
    }
}
