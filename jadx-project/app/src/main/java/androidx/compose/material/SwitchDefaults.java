package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jv\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = null;

    static {
        INSTANCE = new SwitchDefaults();
    }

    private SwitchDefaults() {
    }

    /* JADX INFO: renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1794colorsSQMK_m0(long checkedThumbColor, long checkedTrackColor, float checkedTrackAlpha, long uncheckedThumbColor, long uncheckedTrackColor, float uncheckedTrackAlpha, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, Composer $composer, int $changed, int $changed1, int r50) {
        ComposerKt.sourceInformationMarkerStart($composer, -1032127534, "C(colors)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color!1,7:c#ui.graphics.Color,9:c#ui.graphics.Color,8,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color)319@13206L6,322@13378L6,323@13445L6,327@13623L8,328@13678L6,331@13811L8,332@13866L6,335@14003L8,336@14058L6,339@14195L8,340@14250L6:Switch.kt#jmzs0o");
        if ((r50 & 1) == 0) goto L5;
        long checkedThumbColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1601getSecondaryVariant0d7_KjU();
    L7:
        if ((r50 & 2) == 0) goto L9;
        long checkedTrackColor2 = checkedThumbColor2;
    L11:
        if ((r50 & 4) == 0) goto L13;
        float checkedTrackAlpha2 = 0.54f;
    L15:
        if ((r50 & 8) == 0) goto L17;
        long uncheckedThumbColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU();
    L19:
        if ((r50 & 16) == 0) goto L21;
        long uncheckedTrackColor2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU();
    L23:
        if ((r50 & 32) == 0) goto L25;
        float uncheckedTrackAlpha2 = 0.38f;
    L27:
        if ((r50 & 64) == 0) goto L29;
        long checkedThumbColor3 = checkedThumbColor2;
        long checkedThumbColor4 = Color.m4365copywmQWz5c$default(checkedThumbColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long checkedThumbColor5 = checkedThumbColor3;
        long disabledCheckedThumbColor2 = ColorKt.m4411compositeOverOWjLjI(checkedThumbColor4, MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L31:
        if ((r50 & 128) == 0) goto L33;
        long checkedTrackColor3 = checkedTrackColor2;
        long disabledCheckedTrackColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(checkedTrackColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L35:
        if ((r50 & 256) == 0) goto L37;
        long uncheckedThumbColor3 = uncheckedThumbColor2;
        long disabledUncheckedThumbColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(uncheckedThumbColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L39:
        if ((r50 & 512) == 0) goto L41;
        long uncheckedTrackColor3 = uncheckedTrackColor2;
        long disabledUncheckedTrackColor2 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(uncheckedTrackColor3, ContentAlpha.INSTANCE.getDisabled($composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(-1032127534, $changed, $changed1, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:342)");
    L46:
        float checkedTrackAlpha3 = checkedTrackAlpha2;
        long disabledUncheckedThumbColor3 = disabledUncheckedThumbColor2;
        long uncheckedThumbColor4 = uncheckedThumbColor2;
        long checkedThumbColor6 = checkedThumbColor5;
        DefaultSwitchColors r0 = new DefaultSwitchColors(checkedThumbColor6, Color.m4365copywmQWz5c$default(checkedTrackColor2, checkedTrackAlpha3, 0.0f, 0.0f, 0.0f, 14, null), uncheckedThumbColor4, Color.m4365copywmQWz5c$default(uncheckedTrackColor2, uncheckedTrackAlpha2, 0.0f, 0.0f, 0.0f, 14, null), disabledCheckedThumbColor2, Color.m4365copywmQWz5c$default(disabledCheckedTrackColor2, checkedTrackAlpha3, 0.0f, 0.0f, 0.0f, 14, null), disabledUncheckedThumbColor3, Color.m4365copywmQWz5c$default(disabledUncheckedTrackColor2, uncheckedTrackAlpha2, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress() == false) goto L49;
        ComposerKt.traceEventEnd();
    L49:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L41:
        disabledUncheckedTrackColor2 = disabledUncheckedTrackColor;
        goto L43
    L37:
        disabledUncheckedThumbColor2 = disabledUncheckedThumbColor;
        goto L39
    L33:
        disabledCheckedTrackColor2 = disabledCheckedTrackColor;
        goto L35
    L29:
        checkedThumbColor5 = checkedThumbColor2;
        disabledCheckedThumbColor2 = disabledCheckedThumbColor;
        goto L31
    L25:
        uncheckedTrackAlpha2 = uncheckedTrackAlpha;
        goto L27
    L21:
        uncheckedTrackColor2 = uncheckedTrackColor;
        goto L23
    L17:
        uncheckedThumbColor2 = uncheckedThumbColor;
        goto L19
    L13:
        checkedTrackAlpha2 = checkedTrackAlpha;
        goto L15
    L9:
        checkedTrackColor2 = checkedTrackColor;
        goto L11
    L5:
        checkedThumbColor2 = checkedThumbColor;
        goto L7
    }
}
