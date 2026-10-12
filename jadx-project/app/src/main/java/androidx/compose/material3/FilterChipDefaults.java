package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/J^\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00182\b\b\u0002\u00106\u001a\u00020\u00182\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u00182\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010=\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010%JN\u0010?\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010/R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedFilterChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedFilterChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColors", "getDefaultFilterChipColors$material3_release", "elevatedFilterChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "elevatedFilterChipColors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "elevatedFilterChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedFilterChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "filterChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "filterChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "filterChipColors", "filterChipColors-XqyqHi0", "filterChipElevation", "filterChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height = 0.0f;
    public static final FilterChipDefaults INSTANCE = null;
    private static final float IconSize = 0.0f;

    private FilterChipDefaults() {
    }

    static {
        INSTANCE = new FilterChipDefaults();
        Height = FilterChipTokens.INSTANCE.m3399getContainerHeightD9Ej5fM();
        IconSize = FilterChipTokens.INSTANCE.m3415getIconSizeD9Ej5fM();
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2240getHeightD9Ej5fM() {
        return Height;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2241getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final SelectableChipColors filterChipColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1743772077, "C(filterChipColors)1273@61089L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1743772077, $changed, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1273)");
    L5:
        SelectableChipColors r0 = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m2238filterChipColorsXqyqHi0(long containerColor, long labelColor, long iconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor, Composer $composer, int $changed, int $changed1, int r60) {
        ComposerKt.sourceInformationMarkerStart($composer, -1831479801, "C(filterChipColors)P(0:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,4:c#ui.graphics.Color,9:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color)1308@63087L11:Chip.kt#uh7d8r");
        if ((r60 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r60 & 2) == 0) goto L9;
        long labelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r60 & 4) == 0) goto L13;
        long iconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r60 & 8) == 0) goto L17;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r60 & 16) == 0) goto L21;
        long disabledLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r60 & 32) == 0) goto L25;
        long disabledLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r60 & 64) == 0) goto L29;
        long disabledTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r60 & 128) == 0) goto L33;
        long selectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if ((r60 & 256) == 0) goto L37;
        long disabledSelectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L39:
        if ((r60 & 512) == 0) goto L41;
        long selectedLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L43:
        if ((r60 & 1024) == 0) goto L45;
        long selectedLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L47:
        if ((r60 & 2048) == 0) goto L49;
        long selectedTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventStart(-1831479801, $changed, $changed1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1308)");
    L54:
        SelectableChipColors r1 = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2587copydaRQuJA(containerColor2, labelColor2, iconColor2, iconColor2, disabledContainerColor2, disabledLabelColor2, disabledLeadingIconColor2, disabledTrailingIconColor2, selectedContainerColor2, disabledSelectedContainerColor2, selectedLabelColor2, selectedLeadingIconColor2, selectedTrailingIconColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventEnd();
    L57:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L49:
        selectedTrailingIconColor2 = selectedTrailingIconColor;
        goto L51
    L45:
        selectedLeadingIconColor2 = selectedLeadingIconColor;
        goto L47
    L41:
        selectedLabelColor2 = selectedLabelColor;
        goto L43
    L37:
        disabledSelectedContainerColor2 = disabledSelectedContainerColor;
        goto L39
    L33:
        selectedContainerColor2 = selectedContainerColor;
        goto L35
    L29:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L31
    L25:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L27
    L21:
        disabledLabelColor2 = disabledLabelColor;
        goto L23
    L17:
        disabledContainerColor2 = disabledContainerColor;
        goto L19
    L13:
        iconColor2 = iconColor;
        goto L15
    L9:
        labelColor2 = labelColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final SelectableChipColors getDefaultFilterChipColors$material3_release(ColorScheme $this$defaultFilterChipColors) {
        SelectableChipColors it = $this$defaultFilterChipColors.getDefaultFilterChipColorsCached$material3_release();
        if (it != null) goto L6;
        SelectableChipColors it2 = new SelectableChipColors(Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), Color.Companion.m4401getTransparent0d7_KjU(), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getDisabledLabelTextColor()), FilterChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getFlatSelectedContainerColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerColor()), FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultFilterChipColors, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), null);
        $this$defaultFilterChipColors.setDefaultFilterChipColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m2239filterChipElevationaqJV_2Y(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, -757972185, "C(filterChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float elevation2 = FilterChipTokens.INSTANCE.m3406getFlatContainerElevationD9Ej5fM();
        float elevation3 = elevation2;
    L7:
        if ((r20 & 2) == 0) goto L9;
        float pressedElevation2 = FilterChipTokens.INSTANCE.m3410getFlatSelectedPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r20 & 4) == 0) goto L13;
        float focusedElevation2 = FilterChipTokens.INSTANCE.m3407getFlatSelectedFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r20 & 8) == 0) goto L17;
        float hoveredElevation2 = FilterChipTokens.INSTANCE.m3408getFlatSelectedHoverContainerElevationD9Ej5fM();
    L19:
        if ((r20 & 16) == 0) goto L21;
        float draggedElevation2 = FilterChipTokens.INSTANCE.m3400getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = elevation3;
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(-757972185, $changed, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1378)");
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

    /* JADX INFO: renamed from: filterChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m2237filterChipBorder_7El2pE(boolean enabled, boolean selected, long borderColor, long selectedBorderColor, long disabledBorderColor, long disabledSelectedBorderColor, float borderWidth, float selectedBorderWidth, Composer $composer, int $changed, int r32) {
        ComposerKt.sourceInformationMarkerStart($composer, -1138342447, "C(filterChipBorder)P(4,5,0:c#ui.graphics.Color,6:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,1:c#ui.unit.Dp,7:c#ui.unit.Dp)1406@68670L5,1409@68834L5:Chip.kt#uh7d8r");
        if ((r32 & 4) == 0) goto L5;
        long borderColor2 = ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), $composer, 6);
    L7:
        if ((r32 & 8) == 0) goto L9;
        long selectedBorderColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L11:
        if ((r32 & 16) == 0) goto L13;
        long disabledBorderColor2 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), $composer, 6), FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
    L15:
        if ((r32 & 32) == 0) goto L17;
        long disabledSelectedBorderColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L19:
        if ((r32 & 64) == 0) goto L21;
        float borderWidth2 = FilterChipTokens.INSTANCE.m3413getFlatUnselectedOutlineWidthD9Ej5fM();
    L23:
        if ((r32 & 128) == 0) goto L25;
        float selectedBorderWidth2 = FilterChipTokens.INSTANCE.m3409getFlatSelectedOutlineWidthD9Ej5fM();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(-1138342447, $changed, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1415)");
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

    public final SelectableChipColors elevatedFilterChipColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1082953289, "C(elevatedFilterChipColors)1430@69720L11:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1082953289, $changed, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1430)");
    L5:
        SelectableChipColors r0 = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m2235elevatedFilterChipColorsXqyqHi0(long containerColor, long labelColor, long iconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor, Composer $composer, int $changed, int $changed1, int r60) {
        ComposerKt.sourceInformationMarkerStart($composer, -915841711, "C(elevatedFilterChipColors)P(0:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,8:c#ui.graphics.Color,4:c#ui.graphics.Color,9:c#ui.graphics.Color,10:c#ui.graphics.Color,11:c#ui.graphics.Color)1465@71739L11:Chip.kt#uh7d8r");
        if ((r60 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r60 & 2) == 0) goto L9;
        long labelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r60 & 4) == 0) goto L13;
        long iconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r60 & 8) == 0) goto L17;
        long disabledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r60 & 16) == 0) goto L21;
        long disabledLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r60 & 32) == 0) goto L25;
        long disabledLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r60 & 64) == 0) goto L29;
        long disabledTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r60 & 128) == 0) goto L33;
        long selectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if ((r60 & 256) == 0) goto L37;
        long disabledSelectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L39:
        if ((r60 & 512) == 0) goto L41;
        long selectedLabelColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L43:
        if ((r60 & 1024) == 0) goto L45;
        long selectedLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L47:
        if ((r60 & 2048) == 0) goto L49;
        long selectedTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventStart(-915841711, $changed, $changed1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1465)");
    L54:
        SelectableChipColors r1 = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2587copydaRQuJA(containerColor2, labelColor2, iconColor2, iconColor2, disabledContainerColor2, disabledLabelColor2, disabledLeadingIconColor2, disabledTrailingIconColor2, selectedContainerColor2, disabledSelectedContainerColor2, selectedLabelColor2, selectedLeadingIconColor2, selectedTrailingIconColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventEnd();
    L57:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L49:
        selectedTrailingIconColor2 = selectedTrailingIconColor;
        goto L51
    L45:
        selectedLeadingIconColor2 = selectedLeadingIconColor;
        goto L47
    L41:
        selectedLabelColor2 = selectedLabelColor;
        goto L43
    L37:
        disabledSelectedContainerColor2 = disabledSelectedContainerColor;
        goto L39
    L33:
        selectedContainerColor2 = selectedContainerColor;
        goto L35
    L29:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L31
    L25:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L27
    L21:
        disabledLabelColor2 = disabledLabelColor;
        goto L23
    L17:
        disabledContainerColor2 = disabledContainerColor;
        goto L19
    L13:
        iconColor2 = iconColor;
        goto L15
    L9:
        labelColor2 = labelColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final SelectableChipColors getDefaultElevatedFilterChipColors$material3_release(ColorScheme $this$defaultElevatedFilterChipColors) {
        SelectableChipColors it = $this$defaultElevatedFilterChipColors.getDefaultElevatedFilterChipColorsCached$material3_release();
        if (it != null) goto L6;
        SelectableChipColors it2 = new SelectableChipColors(ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor()), FilterChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getDisabledLabelTextColor()), FilterChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getElevatedSelectedContainerColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor()), FilterChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultElevatedFilterChipColors, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), null);
        $this$defaultElevatedFilterChipColors.setDefaultElevatedFilterChipColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m2236elevatedFilterChipElevationaqJV_2Y(float elevation, float pressedElevation, float focusedElevation, float hoveredElevation, float draggedElevation, float disabledElevation, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 684803697, "C(elevatedFilterChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        if ((r20 & 1) == 0) goto L5;
        float elevation2 = FilterChipTokens.INSTANCE.m3401getElevatedContainerElevationD9Ej5fM();
        float elevation3 = elevation2;
    L7:
        if ((r20 & 2) == 0) goto L9;
        float pressedElevation2 = FilterChipTokens.INSTANCE.m3405getElevatedPressedContainerElevationD9Ej5fM();
        float pressedElevation3 = pressedElevation2;
    L11:
        if ((r20 & 4) == 0) goto L13;
        float focusedElevation2 = FilterChipTokens.INSTANCE.m3403getElevatedFocusContainerElevationD9Ej5fM();
        float focusedElevation3 = focusedElevation2;
    L15:
        if ((r20 & 8) == 0) goto L17;
        float hoveredElevation2 = FilterChipTokens.INSTANCE.m3404getElevatedHoverContainerElevationD9Ej5fM();
    L19:
        if ((r20 & 16) == 0) goto L21;
        float draggedElevation2 = FilterChipTokens.INSTANCE.m3400getDraggedContainerElevationD9Ej5fM();
    L23:
        if ((r20 & 32) == 0) goto L25;
        float disabledElevation2 = FilterChipTokens.INSTANCE.m3402getElevatedDisabledContainerElevationD9Ej5fM();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(684803697, $changed, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1536)");
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

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1598643637, "C1547@76563L5:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1598643637, $changed, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1547)");
    L5:
        Shape r0 = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
