package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014JN\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.J8\u0010(\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014JN\u00104\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001dJN\u00106\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010'R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material3/SuggestionChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedSuggestionChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedSuggestionChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "elevatedSuggestionChipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedSuggestionChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "suggestionChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "disabledBorderColor", "borderWidth", "suggestionChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "suggestionChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "suggestionChipColors", "suggestionChipColors-5tl4gsc", "suggestionChipElevation", "suggestionChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    private static final float Height = 0.0f;
    public static final SuggestionChipDefaults INSTANCE = null;
    private static final float IconSize = 0.0f;

    private SuggestionChipDefaults() {
    }

    static {
        INSTANCE = new SuggestionChipDefaults();
        Height = SuggestionChipTokens.INSTANCE.m3632getContainerHeightD9Ej5fM();
        IconSize = SuggestionChipTokens.INSTANCE.m3641getLeadingIconSizeD9Ej5fM();
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2664getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2665getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ChipColors suggestionChipColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1918570697, "C(suggestionChipColors)1739@86258L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1918570697, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1739)");
    L5:
        ChipColors r0 = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2668suggestionChipColors5tl4gsc(long containerColor, long labelColor, long iconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledIconContentColor, Composer $composer, int $changed, int r36) {
        ComposerKt.sourceInformationMarkerStart($composer, 1882647883, "C(suggestionChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color)1761@87335L11:Chip.kt#uh7d8r");
        if ((r36 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r36 & 2) == 0) goto L9;
        long labelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r36 & 4) == 0) goto L13;
        long iconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r36 & 8) == 0) goto L17;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r36 & 16) == 0) goto L21;
        long disabledLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r36 & 32) == 0) goto L25;
        long disabledIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(1882647883, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1761)");
    L30:
        ChipColors r1 = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1983copyFD3wquc(containerColor2, labelColor2, iconContentColor2, Color.Companion.m4402getUnspecified0d7_KjU(), disabledContainerColor2, disabledLabelColor2, disabledIconContentColor2, Color.Companion.m4402getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L25:
        disabledIconContentColor2 = disabledIconContentColor;
        goto L27
    L21:
        disabledLabelColor2 = disabledLabelColor;
        goto L23
    L17:
        disabledContainerColor2 = disabledContainerColor;
        goto L19
    L13:
        iconContentColor2 = iconContentColor;
        goto L15
    L9:
        labelColor2 = labelColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    /* JADX INFO: renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2669suggestionChipElevationaqJV_2Y(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1929994057, "C(suggestionChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float elevation2 = SuggestionChipTokens.INSTANCE.m3639getFlatContainerElevationD9Ej5fM();
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
        float draggedElevation2 = SuggestionChipTokens.INSTANCE.m3633getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = elevation3;
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(1929994057, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1792)");
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

    /* JADX INFO: renamed from: suggestionChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m2667suggestionChipBorderh1eTWw(boolean enabled, long borderColor, long disabledBorderColor, float borderWidth, Composer $composer, int $changed, int r23) {
        ComposerKt.sourceInformationMarkerStart($composer, -637354809, "C(suggestionChipBorder)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)1812@89713L5,1814@89815L5:Chip.kt#uh7d8r");
        if ((r23 & 2) == 0) goto L5;
        long borderColor2 = ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), $composer, 6);
    L7:
        if ((r23 & 4) == 0) goto L9;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), $composer, 6), SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r23 & 8) == 0) goto L13;
        float borderWidth2 = SuggestionChipTokens.INSTANCE.m3640getFlatOutlineWidthD9Ej5fM();
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-637354809, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1818)");
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

    @Deprecated(level = DeprecationLevel.WARNING, message = "Maintained for binary compatibility. Use the suggestChipBorder functions instead", replaceWith = @ReplaceWith(expression = "suggestionChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    /* JADX INFO: renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m2666suggestionChipBorderd_3_b6Q(long borderColor, long disabledBorderColor, float borderWidth, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, 439283919, "C(suggestionChipBorder)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)1838@90873L5,1840@90975L5:Chip.kt#uh7d8r");
        if ((r25 & 1) == 0) goto L5;
        long borderColor2 = ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), $composer, 6);
    L7:
        if ((r25 & 2) == 0) goto L9;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), $composer, 6), SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L11:
        if ((r25 & 4) == 0) goto L13;
        float borderWidth2 = SuggestionChipTokens.INSTANCE.m3640getFlatOutlineWidthD9Ej5fM();
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(439283919, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1845)");
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

    public final ChipColors elevatedSuggestionChipColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1671233087, "C(elevatedSuggestionChipColors)1857@91554L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1671233087, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1857)");
    L5:
        ChipColors r0 = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2662elevatedSuggestionChipColors5tl4gsc(long containerColor, long labelColor, long iconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledIconContentColor, Composer $composer, int $changed, int r36) {
        ComposerKt.sourceInformationMarkerStart($composer, 1269423125, "C(elevatedSuggestionChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color)1879@92652L11:Chip.kt#uh7d8r");
        if ((r36 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r36 & 2) == 0) goto L9;
        long labelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r36 & 4) == 0) goto L13;
        long iconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r36 & 8) == 0) goto L17;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r36 & 16) == 0) goto L21;
        long disabledLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r36 & 32) == 0) goto L25;
        long disabledIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(1269423125, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1879)");
    L30:
        ChipColors r1 = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m1983copyFD3wquc(containerColor2, labelColor2, iconContentColor2, Color.Companion.m4402getUnspecified0d7_KjU(), disabledContainerColor2, disabledLabelColor2, disabledIconContentColor2, Color.Companion.m4402getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L25:
        disabledIconContentColor2 = disabledIconContentColor;
        goto L27
    L21:
        disabledLabelColor2 = disabledLabelColor;
        goto L23
    L17:
        disabledContainerColor2 = disabledContainerColor;
        goto L19
    L13:
        iconContentColor2 = iconContentColor;
        goto L15
    L9:
        labelColor2 = labelColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final ChipColors getDefaultElevatedSuggestionChipColors$material3_release(ColorScheme $this$defaultElevatedSuggestionChipColors) {
        ChipColors it = $this$defaultElevatedSuggestionChipColors.getDefaultElevatedSuggestionChipColorsCached$material3_release();
        if (it != null) goto L6;
        ChipColors it2 = new ChipColors(ColorSchemeKt.fromToken($this$defaultElevatedSuggestionChipColors, SuggestionChipTokens.INSTANCE.getElevatedContainerColor()), ColorSchemeKt.fromToken($this$defaultElevatedSuggestionChipColors, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken($this$defaultElevatedSuggestionChipColors, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), Color.Companion.m4402getUnspecified0d7_KjU(), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedSuggestionChipColors, SuggestionChipTokens.INSTANCE.getElevatedDisabledContainerColor()), AssistChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedSuggestionChipColors, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), SuggestionChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedSuggestionChipColors, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m4402getUnspecified0d7_KjU(), null);
        $this$defaultElevatedSuggestionChipColors.setDefaultElevatedSuggestionChipColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2663elevatedSuggestionChipElevationaqJV_2Y(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1118088467, "C(elevatedSuggestionChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float elevation2 = SuggestionChipTokens.INSTANCE.m3634getElevatedContainerElevationD9Ej5fM();
        float elevation3 = elevation2;
    L7:
        if ((r20 & 2) == 0) goto L9;
        float pressedElevation2 = SuggestionChipTokens.INSTANCE.m3638getElevatedPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r20 & 4) == 0) goto L13;
        float focusedElevation2 = SuggestionChipTokens.INSTANCE.m3636getElevatedFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r20 & 8) == 0) goto L17;
        float hoveredElevation2 = SuggestionChipTokens.INSTANCE.m3637getElevatedHoverContainerElevationD9Ej5fM();
    L19:
        if ((r20 & 16) == 0) goto L21;
        float draggedElevation2 = SuggestionChipTokens.INSTANCE.m3633getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = SuggestionChipTokens.INSTANCE.m3635getElevatedDisabledContainerElevationD9Ej5fM();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(1118088467, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1932)");
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
        ComposerKt.sourceInformationMarkerStart($composer, 641188183, "C1943@96240L5:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(641188183, $changed, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1943)");
    L5:
        Shape r0 = ShapesKt.getValue(SuggestionChipTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
