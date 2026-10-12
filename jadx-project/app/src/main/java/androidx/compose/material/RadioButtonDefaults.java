package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "()V", "colors", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    public static final RadioButtonDefaults INSTANCE = null;

    static {
        INSTANCE = new RadioButtonDefaults();
    }

    private RadioButtonDefaults() {
    }

    /* JADX INFO: renamed from: colors-RGew2ao, reason: not valid java name */
    public final RadioButtonColors m1741colorsRGew2ao(long selectedColor, long unselectedColor, long disabledColor, Composer $composer, int $changed, int r29) {
        ComposerKt.sourceInformationMarkerStart($composer, 1370708026, "C(colors)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color,0:c#ui.graphics.Color)159@6473L6,160@6538L6,161@6620L6,161@6663L8,163@6715L151:RadioButton.kt#jmzs0o");
        if ((r29 & 1) == 0) goto L5;
        long selectedColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1600getSecondary0d7_KjU();
    L7:
        if ((r29 & 2) == 0) goto L9;
        long unselectedColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r29 & 4) == 0) goto L13;
        long disabledColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(1370708026, $changed, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)");
    L17:
        ComposerKt.sourceInformationMarkerStart($composer, -1778190116, "CC(remember):RadioButton.kt#9igjgp");
        boolean r4 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L22;
        if ($composer.changed(selectedColor2) == false) goto L22;
    L23:
        boolean r2 = true;
    L26:
        if ((($changed & 112) ^ 48) <= 32) goto L30;
        if ($composer.changed(unselectedColor2) == false) goto L30;
    L31:
        boolean r3 = true;
    L33:
        boolean r5 = r2 | r3;
        if ((($changed & 896) ^ 384) <= 256) goto L38;
        if ($composer.changed(disabledColor2) == false) goto L38;
    L39:
        r4 = true;
    L40:
        boolean invalid$iv = r5 | r4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L43;
    L46:
        Object value$iv = new DefaultRadioButtonColors(selectedColor2, unselectedColor2, disabledColor2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L47:
        DefaultRadioButtonColors r6 = (DefaultRadioButtonColors) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L50;
        ComposerKt.traceEventEnd();
    L50:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L43:
        if (it$iv != Composer.Companion.getEmpty()) goto L47;
    L38:
        if (($changed & 384) != 256) goto L40;
    L30:
        if (($changed & 48) == 32) goto L31;
        r3 = false;
    L22:
        if (($changed & 6) == 4) goto L23;
        r2 = false;
        goto L26
    L13:
        disabledColor2 = disabledColor;
        goto L15
    L9:
        unselectedColor2 = unselectedColor;
        goto L11
    L5:
        selectedColor2 = selectedColor;
        goto L7
    }
}
