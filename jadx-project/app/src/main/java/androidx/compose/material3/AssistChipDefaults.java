package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010#Jb\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010#Jb\u00108\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010-JN\u0010:\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00107R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultAssistChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultAssistChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultElevatedAssistChipColors", "getDefaultElevatedAssistChipColors$material3_release", "assistChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "disabledBorderColor", "borderWidth", "assistChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "assistChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "assistChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "assistChipColors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "assistChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "assistChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "elevatedAssistChipColors", "elevatedAssistChipColors-oq7We08", "elevatedAssistChipElevation", "elevatedAssistChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AssistChipDefaults {
    public static final int $stable = 0;
    private static final float Height = 0.0f;
    public static final AssistChipDefaults INSTANCE = null;
    private static final float IconSize = 0.0f;

    private AssistChipDefaults() {
    }

    static {
        INSTANCE = new AssistChipDefaults();
        Height = AssistChipTokens.INSTANCE.m3130getContainerHeightD9Ej5fM();
        IconSize = AssistChipTokens.INSTANCE.m3139getIconSizeD9Ej5fM();
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1914getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1915getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ChipColors assistChipColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1961061417, "C(assistChipColors)1019@48412L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1961061417, $changed, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1019)");
    L5:
        ChipColors r0 = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1910assistChipColorsoq7We08(long containerColor, long labelColor, long leadingIconContentColor, long trailingIconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconContentColor, long disabledTrailingIconContentColor, Composer $composer, int $changed, int r41) {
        ComposerKt.sourceInformationMarkerStart($composer, -391745725, "C(assistChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)1045@49833L11:Chip.kt#uh7d8r");
        if ((r41 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r41 & 2) == 0) goto L9;
        long labelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r41 & 4) == 0) goto L13;
        long leadingIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r41 & 8) == 0) goto L17;
        long trailingIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r41 & 16) == 0) goto L21;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r41 & 32) == 0) goto L25;
        long disabledLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r41 & 64) == 0) goto L29;
        long disabledLeadingIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r41 & 128) == 0) goto L33;
        long disabledTrailingIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventStart(-391745725, $changed, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1045)");
    L38:
        ChipColors r1 = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1983copyFD3wquc(containerColor2, labelColor2, leadingIconContentColor2, trailingIconContentColor2, disabledContainerColor2, disabledLabelColor2, disabledLeadingIconContentColor2, disabledTrailingIconContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L41;
        ComposerKt.traceEventEnd();
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L33:
        disabledTrailingIconContentColor2 = disabledTrailingIconContentColor;
        goto L35
    L29:
        disabledLeadingIconContentColor2 = disabledLeadingIconContentColor;
        goto L31
    L25:
        disabledLabelColor2 = disabledLabelColor;
        goto L27
    L21:
        disabledContainerColor2 = disabledContainerColor;
        goto L23
    L17:
        trailingIconContentColor2 = trailingIconContentColor;
        goto L19
    L13:
        leadingIconContentColor2 = leadingIconContentColor;
        goto L15
    L9:
        labelColor2 = labelColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final ChipColors getDefaultAssistChipColors$material3_release(ColorScheme $this$defaultAssistChipColors) {
        ChipColors it = $this$defaultAssistChipColors.getDefaultAssistChipColorsCached$material3_release();
        if (it != null) goto L6;
        ChipColors it2 = new ChipColors(Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultAssistChipColors, AssistChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken($this$defaultAssistChipColors, AssistChipTokens.INSTANCE.getIconColor()), ColorSchemeKt.fromToken($this$defaultAssistChipColors, AssistChipTokens.INSTANCE.getIconColor()), Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultAssistChipColors, AssistChipTokens.INSTANCE.getDisabledLabelTextColor()), AssistChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultAssistChipColors, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultAssistChipColors, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultAssistChipColors.setDefaultAssistChipColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1911assistChipElevationaqJV_2Y(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 245366099, "C(assistChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float elevation2 = AssistChipTokens.INSTANCE.m3137getFlatContainerElevationD9Ej5fM();
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
        float draggedElevation2 = AssistChipTokens.INSTANCE.m3131getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = elevation3;
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(245366099, $changed, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1098)");
    L30:
        ChipElevation r3 = new ChipElevation(elevation3, pressedElevation3, focusedElevation3, hoveredElevation2, draggedElevation2, disabledElevation2, null);
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

    /* JADX INFO: renamed from: assistChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m1909assistChipBorderh1eTWw(boolean enabled, long borderColor, long disabledBorderColor, float borderWidth, Composer $composer, int $changed, int r23) {
        ComposerKt.sourceInformationMarkerStart($composer, -1458649561, "C(assistChipBorder)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)1118@53518L5,1120@53616L5:Chip.kt#uh7d8r");
        if ((r23 & 2) == 0) goto L5;
        long borderColor2 = ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), $composer, 6);
    L7:
        if ((r23 & 4) == 0) goto L9;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), $composer, 6), AssistChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r23 & 8) == 0) goto L13;
        float borderWidth2 = AssistChipTokens.INSTANCE.m3138getFlatOutlineWidthD9Ej5fM();
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-1458649561, $changed, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1124)");
    L18:
        if (enabled == false) goto L20;
        long r7 = borderColor2;
    L21:
        BorderStroke r1 = BorderStrokeKt.m261BorderStrokecXLIe8U(borderWidth2, r7);
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L20:
        r7 = disabledBorderColor2;
        goto L21
    L13:
        borderWidth2 = borderWidth;
        goto L15
    L9:
        disabledBorderColor2 = disabledBorderColor;
        goto L11
    L5:
        borderColor2 = borderColor;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the assistChipBorder function that returns BorderStroke instead", replaceWith = @ReplaceWith(expression = "assistChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    /* JADX INFO: renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m1908assistChipBorderd_3_b6Q(long borderColor, long disabledBorderColor, float borderWidth, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, 382372847, "C(assistChipBorder)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)1145@54691L5,1147@54789L5:Chip.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long borderColor2 = ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), $composer, 6);
    L7:
        if ((r25 & 2) == 0) goto L9;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), $composer, 6), AssistChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r25 & 4) == 0) goto L13;
        float borderWidth2 = AssistChipTokens.INSTANCE.m3138getFlatOutlineWidthD9Ej5fM();
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(382372847, $changed, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1152)");
    L18:
        ChipBorder r6 = new ChipBorder(borderColor2, disabledBorderColor2, borderWidth2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventEnd();
    L21:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L13:
        borderWidth2 = borderWidth;
        goto L15
    L9:
        disabledBorderColor2 = disabledBorderColor;
        goto L11
    L5:
        borderColor2 = borderColor;
        goto L7
    }

    public final ChipColors elevatedAssistChipColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 655175583, "C(elevatedAssistChipColors)1163@55344L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(655175583, $changed, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1163)");
    L5:
        ChipColors r0 = getDefaultElevatedAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1912elevatedAssistChipColorsoq7We08(long containerColor, long labelColor, long leadingIconContentColor, long trailingIconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconContentColor, long disabledTrailingIconContentColor, Composer $composer, int $changed, int r41) {
        ComposerKt.sourceInformationMarkerStart($composer, -535762675, "C(elevatedAssistChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)1189@56785L11:Chip.kt#uh7d8r");
        if ((r41 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r41 & 2) == 0) goto L9;
        long labelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r41 & 4) == 0) goto L13;
        long leadingIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r41 & 8) == 0) goto L17;
        long trailingIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r41 & 16) == 0) goto L21;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r41 & 32) == 0) goto L25;
        long disabledLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r41 & 64) == 0) goto L29;
        long disabledLeadingIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r41 & 128) == 0) goto L33;
        long disabledTrailingIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventStart(-535762675, $changed, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1189)");
    L38:
        ChipColors r1 = SuggestionChipDefaults.INSTANCE.getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1983copyFD3wquc(containerColor2, labelColor2, leadingIconContentColor2, trailingIconContentColor2, disabledContainerColor2, disabledLabelColor2, disabledLeadingIconContentColor2, disabledTrailingIconContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L41;
        ComposerKt.traceEventEnd();
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L33:
        disabledTrailingIconContentColor2 = disabledTrailingIconContentColor;
        goto L35
    L29:
        disabledLeadingIconContentColor2 = disabledLeadingIconContentColor;
        goto L31
    L25:
        disabledLabelColor2 = disabledLabelColor;
        goto L27
    L21:
        disabledContainerColor2 = disabledContainerColor;
        goto L23
    L17:
        trailingIconContentColor2 = trailingIconContentColor;
        goto L19
    L13:
        leadingIconContentColor2 = leadingIconContentColor;
        goto L15
    L9:
        labelColor2 = labelColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final ChipColors getDefaultElevatedAssistChipColors$material3_release(ColorScheme $this$defaultElevatedAssistChipColors) {
        ChipColors it = $this$defaultElevatedAssistChipColors.getDefaultElevatedAssistChipColorsCached$material3_release();
        if (it != null) goto L6;
        ChipColors it2 = new ChipColors(ColorSchemeKt.fromToken($this$defaultElevatedAssistChipColors, AssistChipTokens.INSTANCE.getElevatedContainerColor()), ColorSchemeKt.fromToken($this$defaultElevatedAssistChipColors, AssistChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken($this$defaultElevatedAssistChipColors, AssistChipTokens.INSTANCE.getIconColor()), ColorSchemeKt.fromToken($this$defaultElevatedAssistChipColors, AssistChipTokens.INSTANCE.getIconColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedAssistChipColors, AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor()), AssistChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedAssistChipColors, AssistChipTokens.INSTANCE.getDisabledLabelTextColor()), AssistChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedAssistChipColors, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedAssistChipColors, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultElevatedAssistChipColors.setDefaultElevatedAssistChipColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1913elevatedAssistChipElevationaqJV_2Y(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1457698077, "C(elevatedAssistChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float elevation2 = AssistChipTokens.INSTANCE.m3132getElevatedContainerElevationD9Ej5fM();
        float elevation3 = elevation2;
    L7:
        if ((r20 & 2) == 0) goto L9;
        float pressedElevation2 = AssistChipTokens.INSTANCE.m3136getElevatedPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r20 & 4) == 0) goto L13;
        float focusedElevation2 = AssistChipTokens.INSTANCE.m3134getElevatedFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r20 & 8) == 0) goto L17;
        float hoveredElevation2 = AssistChipTokens.INSTANCE.m3135getElevatedHoverContainerElevationD9Ej5fM();
    L19:
        if ((r20 & 16) == 0) goto L21;
        float draggedElevation2 = AssistChipTokens.INSTANCE.m3131getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = AssistChipTokens.INSTANCE.m3133getElevatedDisabledContainerElevationD9Ej5fM();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(1457698077, $changed, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1244)");
    L30:
        ChipElevation r3 = new ChipElevation(elevation3, pressedElevation3, focusedElevation3, hoveredElevation2, draggedElevation2, disabledElevation2, null);
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

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1988153916, "C1255@60496L5:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1988153916, $changed, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1255)");
    L5:
        Shape r0 = ShapesKt.getValue(AssistChipTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
