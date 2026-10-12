package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = null;

    static {
        INSTANCE = new CheckboxDefaults();
    }

    private CheckboxDefaults() {
    }

    /* JADX INFO: renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m1576colorszjMxDiM(long checkedColor, long uncheckedColor, long checkmarkColor, long disabledColor, long disabledIndeterminateColor, Composer $composer, int $changed, int r47) {
        ComposerKt.sourceInformationMarkerStart($composer, 469524104, "C(colors)P(0:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)222@9455L6,223@9519L6,224@9602L6,225@9663L6,225@9706L8,226@9800L8,228@9849L922:Checkbox.kt#jmzs0o");
        if ((r47 & 1) == 0) goto L5;
        long checkedColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1600getSecondary0d7_KjU();
    L7:
        if ((r47 & 2) == 0) goto L9;
        long uncheckedColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r47 & 4) == 0) goto L13;
        long checkmarkColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU();
    L15:
        if ((r47 & 8) == 0) goto L17;
        long disabledColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if ((r47 & 16) == 0) goto L21;
        long checkedColor3 = checkedColor2;
        long checkedColor4 = Color.m4365copywmQWz5c$default(checkedColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long checkedColor5 = checkedColor3;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(469524104, $changed, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:227)");
    L25:
        ComposerKt.sourceInformationMarkerStart($composer, 654677405, "CC(remember):Checkbox.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L30;
        if ($composer.changed(checkedColor5) == false) goto L30;
    L31:
        boolean r2 = true;
    L34:
        if ((($changed & 112) ^ 48) <= 32) goto L38;
        if ($composer.changed(uncheckedColor2) == false) goto L38;
    L39:
        boolean r3 = true;
    L41:
        boolean r4 = r2 | r3;
        if ((($changed & 896) ^ 384) <= 256) goto L46;
        if ($composer.changed(checkmarkColor2) == false) goto L46;
    L47:
        boolean r5 = true;
    L49:
        boolean r6 = r4 | r5;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L54;
        if ($composer.changed(disabledColor2) == false) goto L54;
    L55:
        boolean r7 = true;
    L57:
        boolean r8 = r6 | r7;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L62;
        if ($composer.changed(checkedColor4) == false) goto L62;
    L63:
        boolean r9 = true;
    L65:
        boolean invalid$iv = r8 | r9;
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L68;
    L71:
        long checkmarkColor3 = checkmarkColor2;
        long checkmarkColor4 = Color.m4365copywmQWz5c$default(checkmarkColor3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long checkedColor6 = checkedColor5;
        long checkedColor7 = Color.m4365copywmQWz5c$default(checkedColor6, 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long disabledColor3 = disabledColor2;
        long checkedColor8 = Color.m4365copywmQWz5c$default(disabledColor3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long disabledColor4 = checkedColor4;
        value$iv = new DefaultCheckboxColors(checkmarkColor3, checkmarkColor4, checkedColor6, checkedColor7, disabledColor3, checkedColor8, disabledColor4, checkedColor6, uncheckedColor2, disabledColor3, checkedColor4, null);
        $composer.updateRememberedValue(value$iv);
    L72:
        DefaultCheckboxColors r10 = (DefaultCheckboxColors) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L75;
        ComposerKt.traceEventEnd();
    L75:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L68:
        if (value$iv != Composer.Companion.getEmpty()) goto L72;
    L62:
        if (($changed & 24576) == 16384) goto L63;
        r9 = false;
    L54:
        if (($changed & 3072) == 2048) goto L55;
        r7 = false;
    L46:
        if (($changed & 384) == 256) goto L47;
        r5 = false;
    L38:
        if (($changed & 48) == 32) goto L39;
        r3 = false;
    L30:
        if (($changed & 6) == 4) goto L31;
        r2 = false;
        goto L34
    L21:
        checkedColor5 = checkedColor2;
        checkedColor4 = disabledIndeterminateColor;
        goto L23
    L17:
        disabledColor2 = disabledColor;
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
}
