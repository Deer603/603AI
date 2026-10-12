package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJN\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/CheckboxDefaults;", "", "()V", "defaultCheckboxColors", "Landroidx/compose/material3/CheckboxColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCheckboxColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CheckboxColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledCheckedColor", "disabledUncheckedColor", "disabledIndeterminateColor", "colors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CheckboxColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = null;

    static {
        INSTANCE = new CheckboxDefaults();
    }

    private CheckboxDefaults() {
    }

    public final CheckboxColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -9530498, "C(colors)193@8111L11:Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-9530498, $changed, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:193)");
    L5:
        CheckboxColors r0 = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-5tl4gsc, reason: not valid java name */
    public final CheckboxColors m1976colors5tl4gsc(long checkedColor, long uncheckedColor, long checkmarkColor, long disabledCheckedColor, long disabledUncheckedColor, long disabledIndeterminateColor, Composer $composer, int $changed, int r44) {
        ComposerKt.sourceInformationMarkerStart($composer, -89536160, "C(colors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.Color)219@9500L11:Checkbox.kt#uh7d8r");
        if ((r44 & 1) == 0) goto L5;
        long checkedColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r44 & 2) == 0) goto L9;
        long uncheckedColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r44 & 4) == 0) goto L13;
        long checkmarkColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r44 & 8) == 0) goto L17;
        long disabledCheckedColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r44 & 16) == 0) goto L21;
        long disabledUncheckedColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r44 & 32) == 0) goto L25;
        long disabledIndeterminateColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(-89536160, $changed, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:219)");
    L30:
        CheckboxColors r1 = getDefaultCheckboxColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1963copy2qZNXz8(checkmarkColor2, Color.Companion.m4401getTransparent0d7_KjU(), checkedColor2, Color.Companion.m4401getTransparent0d7_KjU(), disabledCheckedColor2, Color.Companion.m4401getTransparent0d7_KjU(), disabledIndeterminateColor2, checkedColor2, uncheckedColor2, disabledCheckedColor2, disabledUncheckedColor2, disabledIndeterminateColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L25:
        disabledIndeterminateColor2 = disabledIndeterminateColor;
        goto L27
    L21:
        disabledUncheckedColor2 = disabledUncheckedColor;
        goto L23
    L17:
        disabledCheckedColor2 = disabledCheckedColor;
        goto L19
    L13:
        checkmarkColor2 = checkmarkColor;
        goto L15
    L9:
        uncheckedColor2 = uncheckedColor;
        goto L11
    L5:
        checkedColor2 = checkedColor;
        goto L7
    }

    public final CheckboxColors getDefaultCheckboxColors$material3_release(ColorScheme $this$defaultCheckboxColors) {
        CheckboxColors it = $this$defaultCheckboxColors.getDefaultCheckboxColorsCached$material3_release();
        if (it != null) goto L6;
        CheckboxColors it2 = new CheckboxColors(ColorSchemeKt.fromToken($this$defaultCheckboxColors, CheckboxTokens.INSTANCE.getSelectedIconColor()), Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultCheckboxColors, CheckboxTokens.INSTANCE.getSelectedContainerColor()), Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultCheckboxColors, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultCheckboxColors, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultCheckboxColors, CheckboxTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken($this$defaultCheckboxColors, CheckboxTokens.INSTANCE.getUnselectedOutlineColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultCheckboxColors, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultCheckboxColors, CheckboxTokens.INSTANCE.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultCheckboxColors, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultCheckboxColors.setDefaultCheckboxColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }
}
