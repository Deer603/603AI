package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J^\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010$J\u0094\u0001\u0010#\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\b\b\u0002\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010(\u001a\u00020\u001b2\b\b\u0002\u0010)\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020\u001b2\b\b\u0002\u0010+\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u001b2\b\b\u0002\u0010.\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103JN\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/material3/InputChipDefaults;", "", "()V", "AvatarSize", "Landroidx/compose/ui/unit/Dp;", "getAvatarSize-D9Ej5fM", "()F", "F", "Height", "getHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultInputChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultInputChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "inputChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "Landroidx/compose/ui/graphics/Color;", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "inputChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "inputChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "inputChipColors-kwJvTHA", "(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "inputChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "inputChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InputChipDefaults {
    public static final int $stable = 0;
    private static final float AvatarSize = 0.0f;
    private static final float Height = 0.0f;
    public static final InputChipDefaults INSTANCE = null;
    private static final float IconSize = 0.0f;

    private InputChipDefaults() {
    }

    static {
        INSTANCE = new InputChipDefaults();
        Height = InputChipTokens.INSTANCE.m3420getContainerHeightD9Ej5fM();
        IconSize = InputChipTokens.INSTANCE.m3422getLeadingIconSizeD9Ej5fM();
        AvatarSize = InputChipTokens.INSTANCE.m3418getAvatarSizeD9Ej5fM();
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2289getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2290getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m2288getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    public final SelectableChipColors inputChipColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -770375587, "C(inputChipColors)1568@77247L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-770375587, $changed, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1568)");
    L5:
        SelectableChipColors r0 = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m2292inputChipColorskwJvTHA(long containerColor, long labelColor, long leadingIconColor, long trailingIconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor, Composer $composer, int $changed, int $changed1, int r62) {
        ComposerKt.sourceInformationMarkerStart($composer, 1312840646, "C(inputChipColors)P(0:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,4:c#ui.graphics.Color,9:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color)1605@79387L11:Chip.kt#uh7d8r");
        if ((r62 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r62 & 2) == 0) goto L9;
        long labelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r62 & 4) == 0) goto L13;
        long leadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r62 & 8) == 0) goto L17;
        long trailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r62 & 16) == 0) goto L21;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r62 & 32) == 0) goto L25;
        long disabledLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r62 & 64) == 0) goto L29;
        long disabledLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r62 & 128) == 0) goto L33;
        long disabledTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if ((r62 & 256) == 0) goto L37;
        long selectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L39:
        if ((r62 & 512) == 0) goto L41;
        long disabledSelectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L43:
        if ((r62 & 1024) == 0) goto L45;
        long selectedLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L47:
        if ((r62 & 2048) == 0) goto L49;
        long selectedLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r62 & 4096) == 0) goto L53;
        long selectedTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L55:
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventStart(1312840646, $changed, $changed1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1605)");
    L58:
        SelectableChipColors r1 = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2587copydaRQuJA(containerColor2, labelColor2, leadingIconColor2, trailingIconColor2, disabledContainerColor2, disabledLabelColor2, disabledLeadingIconColor2, disabledTrailingIconColor2, selectedContainerColor2, disabledSelectedContainerColor2, selectedLabelColor2, selectedLeadingIconColor2, selectedTrailingIconColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L61;
        ComposerKt.traceEventEnd();
    L61:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L53:
        selectedTrailingIconColor2 = selectedTrailingIconColor;
        goto L55
    L49:
        selectedLeadingIconColor2 = selectedLeadingIconColor;
        goto L51
    L45:
        selectedLabelColor2 = selectedLabelColor;
        goto L47
    L41:
        disabledSelectedContainerColor2 = disabledSelectedContainerColor;
        goto L43
    L37:
        selectedContainerColor2 = selectedContainerColor;
        goto L39
    L33:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L35
    L29:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L31
    L25:
        disabledLabelColor2 = disabledLabelColor;
        goto L27
    L21:
        disabledContainerColor2 = disabledContainerColor;
        goto L23
    L17:
        trailingIconColor2 = trailingIconColor;
        goto L19
    L13:
        leadingIconColor2 = leadingIconColor;
        goto L15
    L9:
        labelColor2 = labelColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final SelectableChipColors getDefaultInputChipColors$material3_release(ColorScheme $this$defaultInputChipColors) {
        SelectableChipColors it = $this$defaultInputChipColors.getDefaultInputChipColorsCached$material3_release();
        if (it != null) goto L6;
        SelectableChipColors it2 = new SelectableChipColors(Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getUnselectedTrailingIconColor()), Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getSelectedContainerColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getDisabledSelectedContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultInputChipColors, InputChipTokens.INSTANCE.getSelectedTrailingIconColor()), null);
        $this$defaultInputChipColors.setDefaultInputChipColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m2293inputChipElevationaqJV_2Y(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1745270109, "C(inputChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float elevation2 = InputChipTokens.INSTANCE.m3419getContainerElevationD9Ej5fM();
        float elevation3 = elevation2;
    L7:
        if ((r20 & 2) == 0) goto L9;
        float pressedElevation2 = elevation3;
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r20 & 4) == 0) goto L13;
        float focusedElevation2 = elevation3;
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r20 & 8) == 0) goto L17;
        float hoveredElevation2 = elevation3;
    L19:
        if ((r20 & 16) == 0) goto L21;
        float draggedElevation2 = InputChipTokens.INSTANCE.m3421getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = elevation3;
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(1745270109, $changed, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1672)");
    L30:
        SelectableChipElevation r3 = new SelectableChipElevation(elevation3, pressedElevation3, focusedElevation3, hoveredElevation2, draggedElevation2, disabledElevation2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L25:
        disabledElevation2 = disabledElevation;
        goto L27
    L21:
        draggedElevation2 = draggedElevation;
        goto L23
    L17:
        hoveredElevation2 = hoveredElevation;
        goto L19
    L13:
        focusedElevation3 = focusedElevation;
        goto L15
    L9:
        pressedElevation3 = pressedElevation;
        goto L11
    L5:
        elevation3 = elevation;
        goto L7
    }

    /* JADX INFO: renamed from: inputChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m2291inputChipBorder_7El2pE(boolean enabled, boolean selected, long borderColor, long selectedBorderColor, long disabledBorderColor, long disabledSelectedBorderColor, float borderWidth, float selectedBorderWidth, Composer $composer, int $changed, int r32) {
        ComposerKt.sourceInformationMarkerStart($composer, 2050575347, "C(inputChipBorder)P(4,5,0:c#ui.graphics.Color,6:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,1:c#ui.unit.Dp,7:c#ui.unit.Dp)1700@84707L5,1703@84866L5:Chip.kt#uh7d8r");
        if ((r32 & 4) == 0) goto L5;
        long borderColor2 = ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), $composer, 6);
    L7:
        if ((r32 & 8) == 0) goto L9;
        long selectedBorderColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L11:
        if ((r32 & 16) == 0) goto L13;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), $composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r32 & 32) == 0) goto L17;
        long disabledSelectedBorderColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L19:
        if ((r32 & 64) == 0) goto L21;
        float borderWidth2 = InputChipTokens.INSTANCE.m3425getUnselectedOutlineWidthD9Ej5fM();
    L23:
        if ((r32 & 128) == 0) goto L25;
        float selectedBorderWidth2 = InputChipTokens.INSTANCE.m3423getSelectedOutlineWidthD9Ej5fM();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(2050575347, $changed, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1709)");
    L30:
        if (enabled == false) goto L34;
        if (selected == false) goto L33;
        long color = selectedBorderColor2;
    L38:
        if (selected == false) goto L40;
        float r2 = selectedBorderWidth2;
    L41:
        BorderStroke r3 = BorderStrokeKt.m261BorderStrokecXLIe8U(r2, color);
        if (ComposerKt.isTraceInProgress() == false) goto L44;
        ComposerKt.traceEventEnd();
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L40:
        r2 = borderWidth2;
        goto L41
    L33:
        color = borderColor2;
        goto L38
    L34:
        if (selected == false) goto L36;
        color = disabledSelectedBorderColor2;
        goto L38
    L36:
        color = disabledBorderColor2;
        goto L38
    L25:
        selectedBorderWidth2 = selectedBorderWidth;
        goto L27
    L21:
        borderWidth2 = borderWidth;
        goto L23
    L17:
        disabledSelectedBorderColor2 = disabledSelectedBorderColor;
        goto L19
    L13:
        disabledBorderColor2 = disabledBorderColor;
        goto L15
    L9:
        selectedBorderColor2 = selectedBorderColor;
        goto L11
    L5:
        borderColor2 = borderColor;
        goto L7
    }

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1052444143, "C1721@85639L5:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1052444143, $changed, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1721)");
    L5:
        Shape r0 = ShapesKt.getValue(InputChipTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
