package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jv\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SliderDefaults;", "", "()V", "DisabledActiveTrackAlpha", "", "DisabledInactiveTrackAlpha", "DisabledTickAlpha", "InactiveTrackAlpha", "TickAlpha", "colors", "Landroidx/compose/material/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;
    public static final SliderDefaults INSTANCE = null;
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    static {
        INSTANCE = new SliderDefaults();
    }

    private SliderDefaults() {
    }

    /* JADX INFO: renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m1756colorsq0g_0yA(long thumbColor, long disabledThumbColor, long activeTrackColor, long inactiveTrackColor, long disabledActiveTrackColor, long disabledInactiveTrackColor, long activeTickColor, long inactiveTickColor, long disabledActiveTickColor, long disabledInactiveTickColor, Composer $composer, int $changed, int $changed1, int r54) {
        ComposerKt.sourceInformationMarkerStart($composer, 436017687, "C(colors)P(9:c#ui.graphics.Color,6:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,7:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color)590@25832L6,592@25910L6,593@25970L8,594@26025L6,595@26090L6,598@26261L6,601@26474L33:Slider.kt#jmzs0o");
        if ((r54 & 1) == 0) goto L5;
        long thumbColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU();
    L7:
        if ((r54 & 2) == 0) goto L9;
        long disabledThumbColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L11:
        if ((r54 & 4) == 0) goto L13;
        long activeTrackColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1598getPrimary0d7_KjU();
    L15:
        if ((r54 & 8) == 0) goto L17;
        long inactiveTrackColor2 = Color.m4365copywmQWz5c$default(activeTrackColor2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
    L19:
        if ((r54 & 16) == 0) goto L21;
        long disabledActiveTrackColor2 = Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
    L23:
        if ((r54 & 32) == 0) goto L25;
        long disabledInactiveTrackColor2 = Color.m4365copywmQWz5c$default(disabledActiveTrackColor2, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if ((r54 & 64) == 0) goto L29;
        long activeTickColor2 = Color.m4365copywmQWz5c$default(ColorsKt.m1616contentColorForek8zF_U(activeTrackColor2, $composer, ($changed >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L31:
        if ((r54 & 128) == 0) goto L33;
        long inactiveTickColor2 = Color.m4365copywmQWz5c$default(activeTrackColor2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
    L35:
        if ((r54 & 256) == 0) goto L37;
        long disabledActiveTickColor2 = Color.m4365copywmQWz5c$default(activeTickColor2, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
    L39:
        if ((r54 & 512) == 0) goto L41;
        long disabledInactiveTickColor2 = Color.m4365copywmQWz5c$default(disabledInactiveTrackColor2, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(436017687, $changed, $changed1, "androidx.compose.material.SliderDefaults.colors (Slider.kt:607)");
    L46:
        DefaultSliderColors r8 = new DefaultSliderColors(thumbColor2, disabledThumbColor2, activeTrackColor2, inactiveTrackColor2, disabledActiveTrackColor2, disabledInactiveTrackColor2, activeTickColor2, inactiveTickColor2, disabledActiveTickColor2, disabledInactiveTickColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L49;
        ComposerKt.traceEventEnd();
    L49:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L41:
        disabledInactiveTickColor2 = disabledInactiveTickColor;
        goto L43
    L37:
        disabledActiveTickColor2 = disabledActiveTickColor;
        goto L39
    L33:
        inactiveTickColor2 = inactiveTickColor;
        goto L35
    L29:
        activeTickColor2 = activeTickColor;
        goto L31
    L25:
        disabledInactiveTrackColor2 = disabledInactiveTrackColor;
        goto L27
    L21:
        disabledActiveTrackColor2 = disabledActiveTrackColor;
        goto L23
    L17:
        inactiveTrackColor2 = inactiveTrackColor;
        goto L19
    L13:
        activeTrackColor2 = activeTrackColor;
        goto L15
    L9:
        disabledThumbColor2 = disabledThumbColor;
        goto L11
    L5:
        thumbColor2 = thumbColor;
        goto L7
    }
}
