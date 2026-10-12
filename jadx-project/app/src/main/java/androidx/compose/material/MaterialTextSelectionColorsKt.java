package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: MaterialTextSelectionColors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a2\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"DefaultSelectionBackgroundAlpha", "", "DesiredContrastRatio", "MinimumSelectionBackgroundAlpha", "binarySearchForAccessibleSelectionColorAlpha", "selectionColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "backgroundColor", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", "foreground", "background", "calculateContrastRatio--OWjLjI", "(JJ)F", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateSelectionBackgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "colors", "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    public static final TextSelectionColors rememberTextSelectionColors(Colors colors, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -721696685, "C(rememberTextSelectionColors)45@1907L6,46@1926L416:MaterialTextSelectionColors.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-721696685, $changed, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
    L6:
        long primaryColor = colors.m1598getPrimary0d7_KjU();
        long backgroundColor = colors.m1591getBackground0d7_KjU();
        $composer.startReplaceGroup(1102762852);
        ComposerKt.sourceInformation($composer, "*44@1858L7");
        long $this$takeOrElse_u2dDxMtmZc$iv = ColorsKt.m1615contentColorFor4WTKRHQ(colors, backgroundColor);
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L9;
        boolean r13 = true;
    L10:
        if (r13 == false) goto L12;
        long r14 = $this$takeOrElse_u2dDxMtmZc$iv;
    L13:
        $composer.endReplaceGroup();
        long textColorWithLowestAlpha = Color.m4365copywmQWz5c$default(r14, ContentAlpha.INSTANCE.getMedium($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        ComposerKt.sourceInformationMarkerStart($composer, 1102766396, "CC(remember):MaterialTextSelectionColors.kt#9igjgp");
        boolean invalid$iv = ($composer.changed(primaryColor) | $composer.changed(backgroundColor)) | $composer.changed(textColorWithLowestAlpha);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv = new TextSelectionColors(colors.m1598getPrimary0d7_KjU(), m1697calculateSelectionBackgroundColorysEtTa8(primaryColor, textColorWithLowestAlpha, backgroundColor), null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L20:
        TextSelectionColors r12 = (TextSelectionColors) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L16:
        if (it$iv != Composer.Companion.getEmpty()) goto L20;
    L12:
        ProvidableCompositionLocal<Color> r11 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r15 = $composer.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer);
        r14 = ((Color) r15).m4376unboximpl();
        goto L13
    L9:
        r13 = false;
        goto L10
    }

    /* JADX INFO: renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m1697calculateSelectionBackgroundColorysEtTa8(long selectionColor, long textColor, long backgroundColor) {
        float maximumContrastRatio = m1696calculateContrastRationb2GgbA(selectionColor, 0.4f, textColor, backgroundColor);
        float minimumContrastRatio = m1696calculateContrastRationb2GgbA(selectionColor, 0.2f, textColor, backgroundColor);
        if (maximumContrastRatio < DesiredContrastRatio) goto L6;
        float alpha = 0.4f;
    L10:
        return Color.m4365copywmQWz5c$default(selectionColor, alpha, 0.0f, 0.0f, 0.0f, 14, null);
    L6:
        if (minimumContrastRatio >= DesiredContrastRatio) goto L8;
        alpha = 0.2f;
        goto L10
    L8:
        alpha = m1694binarySearchForAccessibleSelectionColorAlphaysEtTa8(selectionColor, textColor, backgroundColor);
        goto L10
    }

    /* JADX INFO: renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m1694binarySearchForAccessibleSelectionColorAlphaysEtTa8(long selectionColor, long textColor, long backgroundColor) {
        int attempts = 0;
        float lowAlpha = 0.2f;
        float alpha = 0.4f;
        float highAlpha = 0.4f;
    L3:
        if (attempts >= 7) goto L15;
        float contrastRatio = m1696calculateContrastRationb2GgbA(selectionColor, alpha, textColor, backgroundColor);
        float percentageError = (contrastRatio / DesiredContrastRatio) - 1.0f;
        boolean r7 = false;
        if (0.0f <= percentageError) goto L7;
    L9:
        if (r7 == true) goto L15;
        if (percentageError >= 0.0f) goto L13;
        highAlpha = alpha;
    L14:
        alpha = (highAlpha + lowAlpha) / 2.0f;
        attempts = attempts + 1;
        goto L3
    L13:
        lowAlpha = alpha;
        goto L14
    L7:
        if (percentageError > 0.01f) goto L9;
        r7 = true;
    L15:
        return alpha;
    }

    /* JADX INFO: renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m1696calculateContrastRationb2GgbA(long selectionColor, float selectionColorAlpha, long textColor, long backgroundColor) {
        long compositeBackground = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(selectionColor, selectionColorAlpha, 0.0f, 0.0f, 0.0f, 14, null), backgroundColor);
        long compositeTextColor = ColorKt.m4411compositeOverOWjLjI(textColor, compositeBackground);
        return m1695calculateContrastRatioOWjLjI(compositeTextColor, compositeBackground);
    }

    /* JADX INFO: renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m1695calculateContrastRatioOWjLjI(long foreground, long background) {
        float foregroundLuminance = ColorKt.m4418luminance8_81llA(foreground) + 0.05f;
        float backgroundLuminance = ColorKt.m4418luminance8_81llA(background) + 0.05f;
        return Math.max(foregroundLuminance, backgroundLuminance) / Math.min(foregroundLuminance, backgroundLuminance);
    }
}
