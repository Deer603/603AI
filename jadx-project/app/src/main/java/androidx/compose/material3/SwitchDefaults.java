package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000eJ²\u0001\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u00020\t*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/SwitchDefaults;", "", "()V", "IconSize", "Landroidx/compose/ui/unit/Dp;", "getIconSize-D9Ej5fM", "()F", "F", "defaultSwitchColors", "Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSwitchColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SwitchColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "colors-V1nXRL4", "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SwitchColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = null;
    private static final float IconSize = 0.0f;

    private SwitchDefaults() {
    }

    public final SwitchColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 435552781, "C(colors)299@11393L11:Switch.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(435552781, $changed, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:299)");
    L5:
        SwitchColors r0 = getDefaultSwitchColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m2702colorsV1nXRL4(long checkedThumbColor, long checkedTrackColor, long checkedBorderColor, long checkedIconColor, long uncheckedThumbColor, long uncheckedTrackColor, long uncheckedBorderColor, long uncheckedIconColor, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledCheckedBorderColor, long disabledCheckedIconColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, long disabledUncheckedBorderColor, long disabledUncheckedIconColor, Composer $composer, int $changed, int $changed1, int r77) {
        ComposerKt.sourceInformationMarkerStart($composer, 1937926421, "C(colors)P(2:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,14:c#ui.graphics.Color,15:c#ui.graphics.Color,12:c#ui.graphics.Color,13:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color,8:c#ui.graphics.Color,9:c#ui.graphics.Color)324@13145L5,325@13219L5,327@13346L5,328@13425L5,329@13503L5,330@13594L5,331@13670L5,333@13773L5,335@13898L11,337@14015L5,339@14131L11,342@14309L5,344@14432L11,346@14554L5,348@14681L11,350@14802L5,352@14918L11,354@15047L5,356@15163L11,358@15282L5,360@15407L11:Switch.kt#uh7d8r");
        if ((r77 & 1) == 0) goto L5;
        long checkedThumbColor2 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), $composer, 6);
    L7:
        if ((r77 & 2) == 0) goto L9;
        long checkedTrackColor2 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), $composer, 6);
    L11:
        if ((r77 & 4) == 0) goto L13;
        long checkedBorderColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L15:
        if ((r77 & 8) == 0) goto L17;
        long checkedIconColor2 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), $composer, 6);
    L19:
        if ((r77 & 16) == 0) goto L21;
        long uncheckedThumbColor2 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), $composer, 6);
    L23:
        if ((r77 & 32) == 0) goto L25;
        long uncheckedTrackColor2 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), $composer, 6);
    L27:
        if ((r77 & 64) == 0) goto L29;
        long uncheckedBorderColor2 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), $composer, 6);
    L31:
        if ((r77 & 128) == 0) goto L33;
        long uncheckedIconColor2 = ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), $composer, 6);
    L35:
        if ((r77 & 256) == 0) goto L37;
        long disabledCheckedThumbColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), $composer, 6), SwitchTokens.INSTANCE.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU());
    L39:
        if ((r77 & 512) == 0) goto L41;
        long disabledCheckedTrackColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), $composer, 6), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU());
    L43:
        if ((r77 & 1024) == 0) goto L45;
        long disabledCheckedBorderColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L47:
        if ((r77 & 2048) == 0) goto L49;
        long disabledCheckedIconColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), $composer, 6), SwitchTokens.INSTANCE.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU());
    L51:
        if ((r77 & 4096) == 0) goto L53;
        long disabledUncheckedThumbColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), $composer, 6), SwitchTokens.INSTANCE.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU());
    L55:
        if ((r77 & 8192) == 0) goto L57;
        long disabledUncheckedTrackColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), $composer, 6), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU());
    L59:
        if ((r77 & 16384) == 0) goto L61;
        long disabledUncheckedBorderColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), $composer, 6), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU());
    L63:
        if ((r77 & 32768) == 0) goto L65;
        long disabledUncheckedIconColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), $composer, 6), SwitchTokens.INSTANCE.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer, 6).m2043getSurface0d7_KjU());
    L67:
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventStart(1937926421, $changed, $changed1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:362)");
    L70:
        SwitchColors r7 = new SwitchColors(checkedThumbColor2, checkedTrackColor2, checkedBorderColor2, checkedIconColor2, uncheckedThumbColor2, uncheckedTrackColor2, uncheckedBorderColor2, uncheckedIconColor2, disabledCheckedThumbColor2, disabledCheckedTrackColor2, disabledCheckedBorderColor2, disabledCheckedIconColor2, disabledUncheckedThumbColor2, disabledUncheckedTrackColor2, disabledUncheckedBorderColor2, disabledUncheckedIconColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventEnd();
    L73:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L65:
        disabledUncheckedIconColor2 = disabledUncheckedIconColor;
        goto L67
    L61:
        disabledUncheckedBorderColor2 = disabledUncheckedBorderColor;
        goto L63
    L57:
        disabledUncheckedTrackColor2 = disabledUncheckedTrackColor;
        goto L59
    L53:
        disabledUncheckedThumbColor2 = disabledUncheckedThumbColor;
        goto L55
    L49:
        disabledCheckedIconColor2 = disabledCheckedIconColor;
        goto L51
    L45:
        disabledCheckedBorderColor2 = disabledCheckedBorderColor;
        goto L47
    L41:
        disabledCheckedTrackColor2 = disabledCheckedTrackColor;
        goto L43
    L37:
        disabledCheckedThumbColor2 = disabledCheckedThumbColor;
        goto L39
    L33:
        uncheckedIconColor2 = uncheckedIconColor;
        goto L35
    L29:
        uncheckedBorderColor2 = uncheckedBorderColor;
        goto L31
    L25:
        uncheckedTrackColor2 = uncheckedTrackColor;
        goto L27
    L21:
        uncheckedThumbColor2 = uncheckedThumbColor;
        goto L23
    L17:
        checkedIconColor2 = checkedIconColor;
        goto L19
    L13:
        checkedBorderColor2 = checkedBorderColor;
        goto L15
    L9:
        checkedTrackColor2 = checkedTrackColor;
        goto L11
    L5:
        checkedThumbColor2 = checkedThumbColor;
        goto L7
    }

    public final SwitchColors getDefaultSwitchColors$material3_release(ColorScheme $this$defaultSwitchColors) {
        SwitchColors it = $this$defaultSwitchColors.getDefaultSwitchColorsCached$material3_release();
        if (it != null) goto L6;
        SwitchColors it2 = new SwitchColors(ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getSelectedHandleColor()), ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getSelectedTrackColor()), Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getSelectedIconColor()), ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getUnselectedHandleColor()), ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getUnselectedTrackColor()), ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor()), ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getUnselectedIconColor()), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getDisabledSelectedHandleColor()), SwitchTokens.INSTANCE.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), $this$defaultSwitchColors.m2043getSurface0d7_KjU()), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getDisabledSelectedTrackColor()), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), $this$defaultSwitchColors.m2043getSurface0d7_KjU()), Color.Companion.m4401getTransparent0d7_KjU(), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getDisabledSelectedIconColor()), SwitchTokens.INSTANCE.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), $this$defaultSwitchColors.m2043getSurface0d7_KjU()), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor()), SwitchTokens.INSTANCE.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), $this$defaultSwitchColors.m2043getSurface0d7_KjU()), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor()), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), $this$defaultSwitchColors.m2043getSurface0d7_KjU()), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor()), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), $this$defaultSwitchColors.m2043getSurface0d7_KjU()), ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultSwitchColors, SwitchTokens.INSTANCE.getDisabledUnselectedIconColor()), SwitchTokens.INSTANCE.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), $this$defaultSwitchColors.m2043getSurface0d7_KjU()), null);
        $this$defaultSwitchColors.setDefaultSwitchColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    static {
        INSTANCE = new SwitchDefaults();
        IconSize = Dp.m6973constructorimpl(16);
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2703getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
