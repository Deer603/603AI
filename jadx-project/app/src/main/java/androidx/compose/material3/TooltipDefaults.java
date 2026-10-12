package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\"J:\u0010!\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/material3/TooltipDefaults;", "", "()V", "caretSize", "Landroidx/compose/ui/unit/DpSize;", "getCaretSize-MYxV2XQ", "()J", "J", "plainTooltipContainerColor", "Landroidx/compose/ui/graphics/Color;", "getPlainTooltipContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "plainTooltipContainerShape", "Landroidx/compose/ui/graphics/Shape;", "getPlainTooltipContainerShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "plainTooltipContentColor", "getPlainTooltipContentColor", "richTooltipContainerShape", "getRichTooltipContainerShape", "defaultRichTooltipColors", "Landroidx/compose/material3/RichTooltipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultRichTooltipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/RichTooltipColors;", "rememberPlainTooltipPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "spacingBetweenTooltipAndAnchor", "Landroidx/compose/ui/unit/Dp;", "rememberPlainTooltipPositionProvider-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/window/PopupPositionProvider;", "rememberRichTooltipPositionProvider", "rememberRichTooltipPositionProvider-kHDZbjc", "richTooltipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RichTooltipColors;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "richTooltipColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RichTooltipColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TooltipDefaults {
    public static final int $stable = 0;
    public static final TooltipDefaults INSTANCE = null;
    private static final long caretSize = 0;

    private TooltipDefaults() {
    }

    public final Shape getPlainTooltipContainerShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 49570325, "C240@10518L5:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(49570325, $changed, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:240)");
    L5:
        Shape r0 = ShapesKt.getValue(PlainTooltipTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getPlainTooltipContainerColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 102696215, "C244@10694L5:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(102696215, $changed, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:244)");
    L5:
        long r0 = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getContainerColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getPlainTooltipContentColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1982928937, "C248@10882L5:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1982928937, $changed, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:248)");
    L5:
        long r0 = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getRichTooltipContainerShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1138709783, "C252@11055L5:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1138709783, $changed, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:252)");
    L5:
        Shape r0 = ShapesKt.getValue(RichTooltipTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    static {
        INSTANCE = new TooltipDefaults();
        caretSize = DpKt.m6995DpSizeYgX7TsA(Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(8));
    }

    /* JADX INFO: renamed from: getCaretSize-MYxV2XQ, reason: not valid java name */
    public final long m2967getCaretSizeMYxV2XQ() {
        return caretSize;
    }

    public final RichTooltipColors richTooltipColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1622312141, "C(richTooltipColors)261@11362L11:Tooltip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1622312141, $changed, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:261)");
    L5:
        RichTooltipColors r0 = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: richTooltipColors-ro_MJ88, reason: not valid java name */
    public final RichTooltipColors m2970richTooltipColorsro_MJ88(long containerColor, long contentColor, long titleContentColor, long actionContentColor, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, 1498555081, "C(richTooltipColors)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color)274@11844L11:Tooltip.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r25 & 2) == 0) goto L9;
        long contentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r25 & 4) == 0) goto L13;
        long titleContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r25 & 8) == 0) goto L17;
        long actionContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(1498555081, $changed, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:274)");
    L22:
        RichTooltipColors r1 = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2524copyjRlVdoo(containerColor2, contentColor2, titleContentColor2, actionContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L17:
        actionContentColor2 = actionContentColor;
        goto L19
    L13:
        titleContentColor2 = titleContentColor;
        goto L15
    L9:
        contentColor2 = contentColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final RichTooltipColors getDefaultRichTooltipColors$material3_release(ColorScheme $this$defaultRichTooltipColors) {
        RichTooltipColors it = $this$defaultRichTooltipColors.getDefaultRichTooltipColorsCached$material3_release();
        if (it != null) goto L6;
        RichTooltipColors it2 = new RichTooltipColors(ColorSchemeKt.fromToken($this$defaultRichTooltipColors, RichTooltipTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken($this$defaultRichTooltipColors, RichTooltipTokens.INSTANCE.getSupportingTextColor()), ColorSchemeKt.fromToken($this$defaultRichTooltipColors, RichTooltipTokens.INSTANCE.getSubheadColor()), ColorSchemeKt.fromToken($this$defaultRichTooltipColors, RichTooltipTokens.INSTANCE.getActionLabelTextColor()), null);
        $this$defaultRichTooltipColors.setDefaultRichTooltipColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: rememberPlainTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m2968rememberPlainTooltipPositionProviderkHDZbjc(float spacingBetweenTooltipAndAnchor, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, 1047866909, "C(rememberPlainTooltipPositionProvider)P(0:c#ui.unit.Dp)*304@13227L7,305@13298L897:Tooltip.kt#uh7d8r");
        if ((r11 & 1) == 0) goto L6;
        spacingBetweenTooltipAndAnchor = TooltipKt.getSpacingBetweenTooltipAndAnchor();
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(1047866909, $changed, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:302)");
    L8:
        ProvidableCompositionLocal<Density> r12 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r2 = $composer.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density $this$rememberPlainTooltipPositionProvider_kHDZbjc_u24lambda_u241 = (Density) r2;
        final int tooltipAnchorSpacing = $this$rememberPlainTooltipPositionProvider_kHDZbjc_u24lambda_u241.mo370roundToPx0680j_4(spacingBetweenTooltipAndAnchor);
        ComposerKt.sourceInformationMarkerStart($composer, 1994502237, "CC(remember):Tooltip.kt#9igjgp");
        boolean invalid$iv = $composer.changed(tooltipAnchorSpacing);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L11;
    L14:
        Object value$iv = new TooltipDefaults$rememberPlainTooltipPositionProvider$1$1(tooltipAnchorSpacing);
        $composer.updateRememberedValue(value$iv);
    L15:
        TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 r6 = (TooltipDefaults$rememberPlainTooltipPositionProvider$1$1) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventEnd();
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L11:
        if (it$iv == Composer.Companion.getEmpty()) goto L14;
        value$iv = it$iv;
        goto L15
    }

    /* JADX INFO: renamed from: rememberRichTooltipPositionProvider-kHDZbjc, reason: not valid java name */
    public final PopupPositionProvider m2969rememberRichTooltipPositionProviderkHDZbjc(float spacingBetweenTooltipAndAnchor, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, -1538806795, "C(rememberRichTooltipPositionProvider)P(0:c#ui.unit.Dp)*337@14707L7,338@14778L1457:Tooltip.kt#uh7d8r");
        if ((r11 & 1) == 0) goto L6;
        spacingBetweenTooltipAndAnchor = TooltipKt.getSpacingBetweenTooltipAndAnchor();
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(-1538806795, $changed, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:335)");
    L8:
        ProvidableCompositionLocal<Density> r12 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r2 = $composer.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density $this$rememberRichTooltipPositionProvider_kHDZbjc_u24lambda_u243 = (Density) r2;
        final int tooltipAnchorSpacing = $this$rememberRichTooltipPositionProvider_kHDZbjc_u24lambda_u243.mo370roundToPx0680j_4(spacingBetweenTooltipAndAnchor);
        ComposerKt.sourceInformationMarkerStart($composer, -1778011319, "CC(remember):Tooltip.kt#9igjgp");
        boolean invalid$iv = $composer.changed(tooltipAnchorSpacing);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L11;
    L14:
        Object value$iv = new TooltipDefaults$rememberRichTooltipPositionProvider$1$1(tooltipAnchorSpacing);
        $composer.updateRememberedValue(value$iv);
    L15:
        TooltipDefaults$rememberRichTooltipPositionProvider$1$1 r6 = (TooltipDefaults$rememberRichTooltipPositionProvider$1$1) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventEnd();
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L11:
        if (it$iv == Composer.Companion.getEmpty()) goto L14;
        value$iv = it$iv;
        goto L15
    }
}
