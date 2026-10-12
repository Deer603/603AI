package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJ\u009e\u0001\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u001cH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/TimePickerDefaults;", "", "()V", "defaultTimePickerColors", "Landroidx/compose/material3/TimePickerColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTimePickerColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TimePickerColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TimePickerColors;", "clockDialColor", "Landroidx/compose/ui/graphics/Color;", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "colors-u3YEpmA", "(JJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TimePickerColors;", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType-sDNSZnc", "(Landroidx/compose/runtime/Composer;I)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimePickerDefaults {
    public static final int $stable = 0;
    public static final TimePickerDefaults INSTANCE = null;

    static {
        INSTANCE = new TimePickerDefaults();
    }

    private TimePickerDefaults() {
    }

    public final TimePickerColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2085808058, "C(colors)270@13292L11:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2085808058, $changed, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:270)");
    L5:
        TimePickerColors r0 = getDefaultTimePickerColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-u3YEpmA, reason: not valid java name */
    public final TimePickerColors m2844colorsu3YEpmA(long clockDialColor, long clockDialSelectedContentColor, long clockDialUnselectedContentColor, long selectorColor, long containerColor, long periodSelectorBorderColor, long periodSelectorSelectedContainerColor, long periodSelectorUnselectedContainerColor, long periodSelectorSelectedContentColor, long periodSelectorUnselectedContentColor, long timeSelectorSelectedContainerColor, long timeSelectorUnselectedContainerColor, long timeSelectorSelectedContentColor, long timeSelectorUnselectedContentColor, Composer $composer, int $changed, int $changed1, int r66) {
        ComposerKt.sourceInformationMarkerStart($composer, -646352288, "C(colors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,8:c#ui.graphics.Color,10:c#ui.graphics.Color,12:c#ui.graphics.Color,11:c#ui.graphics.Color,13:c#ui.graphics.Color)317@16058L11:TimePicker.kt#uh7d8r");
        if ((r66 & 1) == 0) goto L5;
        long clockDialColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r66 & 2) == 0) goto L9;
        long clockDialSelectedContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r66 & 4) == 0) goto L13;
        long clockDialUnselectedContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r66 & 8) == 0) goto L17;
        long selectorColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r66 & 16) == 0) goto L21;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r66 & 32) == 0) goto L25;
        long periodSelectorBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r66 & 64) == 0) goto L29;
        long periodSelectorSelectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r66 & 128) == 0) goto L33;
        long periodSelectorUnselectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if ((r66 & 256) == 0) goto L37;
        long periodSelectorSelectedContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L39:
        if ((r66 & 512) == 0) goto L41;
        long periodSelectorUnselectedContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L43:
        if ((r66 & 1024) == 0) goto L45;
        long timeSelectorSelectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L47:
        if ((r66 & 2048) == 0) goto L49;
        long timeSelectorUnselectedContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r66 & 4096) == 0) goto L53;
        long timeSelectorSelectedContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L55:
        if ((r66 & 8192) == 0) goto L57;
        long timeSelectorUnselectedContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L59:
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventStart(-646352288, $changed, $changed1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:317)");
    L62:
        TimePickerColors r1 = getDefaultTimePickerColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2825copydVHXu7A(clockDialColor2, selectorColor2, containerColor2, periodSelectorBorderColor2, clockDialSelectedContentColor2, clockDialUnselectedContentColor2, periodSelectorSelectedContainerColor2, periodSelectorUnselectedContainerColor2, periodSelectorSelectedContentColor2, periodSelectorUnselectedContentColor2, timeSelectorSelectedContainerColor2, timeSelectorUnselectedContainerColor2, timeSelectorSelectedContentColor2, timeSelectorUnselectedContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventEnd();
    L65:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L57:
        timeSelectorUnselectedContentColor2 = timeSelectorUnselectedContentColor;
        goto L59
    L53:
        timeSelectorSelectedContentColor2 = timeSelectorSelectedContentColor;
        goto L55
    L49:
        timeSelectorUnselectedContainerColor2 = timeSelectorUnselectedContainerColor;
        goto L51
    L45:
        timeSelectorSelectedContainerColor2 = timeSelectorSelectedContainerColor;
        goto L47
    L41:
        periodSelectorUnselectedContentColor2 = periodSelectorUnselectedContentColor;
        goto L43
    L37:
        periodSelectorSelectedContentColor2 = periodSelectorSelectedContentColor;
        goto L39
    L33:
        periodSelectorUnselectedContainerColor2 = periodSelectorUnselectedContainerColor;
        goto L35
    L29:
        periodSelectorSelectedContainerColor2 = periodSelectorSelectedContainerColor;
        goto L31
    L25:
        periodSelectorBorderColor2 = periodSelectorBorderColor;
        goto L27
    L21:
        containerColor2 = containerColor;
        goto L23
    L17:
        selectorColor2 = selectorColor;
        goto L19
    L13:
        clockDialUnselectedContentColor2 = clockDialUnselectedContentColor;
        goto L15
    L9:
        clockDialSelectedContentColor2 = clockDialSelectedContentColor;
        goto L11
    L5:
        clockDialColor2 = clockDialColor;
        goto L7
    }

    public final TimePickerColors getDefaultTimePickerColors$material3_release(ColorScheme $this$defaultTimePickerColors) {
        TimePickerColors it = $this$defaultTimePickerColors.getDefaultTimePickerColorsCached$material3_release();
        if (it != null) goto L6;
        long r3 = ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getClockDialColor());
        long r11 = ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getClockDialSelectedLabelTextColor());
        long r13 = ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getClockDialUnselectedLabelTextColor());
        TimePickerColors it2 = new TimePickerColors(r3, ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getClockDialSelectorHandleContainerColor()), ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getPeriodSelectorOutlineColor()), r11, r13, ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getPeriodSelectorSelectedContainerColor()), Color.Companion.m4401getTransparent0d7_KjU(), ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getPeriodSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getPeriodSelectorUnselectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getTimeSelectorSelectedContainerColor()), ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getTimeSelectorUnselectedContainerColor()), ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getTimeSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken($this$defaultTimePickerColors, TimePickerTokens.INSTANCE.getTimeSelectorUnselectedLabelTextColor()), null);
        $this$defaultTimePickerColors.setDefaultTimePickerColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    /* JADX INFO: renamed from: layoutType-sDNSZnc, reason: not valid java name */
    public final int m2845layoutTypesDNSZnc(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 517161502, "C(layoutType)367@19209L27:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(517161502, $changed, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:367)");
    L5:
        int r0 = TimePicker_androidKt.getDefaultTimePickerLayoutType($composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
