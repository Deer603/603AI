package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(J$\u0010)\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020&H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010-J\u008e\u0002\u0010,\u001a\u00020\u00192\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020/2\b\b\u0002\u00104\u001a\u00020/2\b\b\u0002\u00105\u001a\u00020/2\b\b\u0002\u00106\u001a\u00020/2\b\b\u0002\u00107\u001a\u00020/2\b\b\u0002\u00108\u001a\u00020/2\b\b\u0002\u00109\u001a\u00020/2\b\b\u0002\u0010:\u001a\u00020/2\b\b\u0002\u0010;\u001a\u00020/2\b\b\u0002\u0010<\u001a\u00020/2\b\b\u0002\u0010=\u001a\u00020/2\b\b\u0002\u0010>\u001a\u00020/2\b\b\u0002\u0010?\u001a\u00020/2\b\b\u0002\u0010@\u001a\u00020/2\b\b\u0002\u0010A\u001a\u00020/2\b\b\u0002\u0010B\u001a\u00020/2\b\b\u0002\u0010C\u001a\u00020/2\b\b\u0002\u0010D\u001a\u00020/2\b\b\u0002\u0010E\u001a\u00020/2\b\b\u0002\u0010F\u001a\u00020/2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010HH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ$\u0010#\u001a\u00020$2\b\b\u0002\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\r2\b\b\u0002\u0010M\u001a\u00020\rJ'\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u000e\b\u0002\u0010R\u001a\b\u0012\u0004\u0012\u00020T0SH\u0001¢\u0006\u0004\bU\u0010VR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "()V", "AllDates", "Landroidx/compose/material3/SelectableDates;", "getAllDates", "()Landroidx/compose/material3/SelectableDates;", "TonalElevation", "Landroidx/compose/ui/unit/Dp;", "getTonalElevation-D9Ej5fM", "()F", "F", "YearAbbrMonthDaySkeleton", "", "YearMonthSkeleton", "YearMonthWeekdayDaySkeleton", "YearRange", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultDatePickerColors", "Landroidx/compose/material3/DatePickerColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultDatePickerColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "DatePickerHeadline", "", "selectedDateMillis", "", "displayMode", "Landroidx/compose/material3/DisplayMode;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "modifier", "Landroidx/compose/ui/Modifier;", "DatePickerHeadline-3kbWawI", "(Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerTitle", "DatePickerTitle-hOD91z4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "dividerColor", "dateTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "colors-bSRYm20", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/DatePickerColors;", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "rememberSnapFlingBehavior$material3_release", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DatePickerDefaults {
    public static final int $stable = 0;
    private static final SelectableDates AllDates = null;
    public static final DatePickerDefaults INSTANCE = null;
    private static final float TonalElevation = 0.0f;
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";
    public static final String YearMonthSkeleton = "yMMMM";
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";
    private static final IntRange YearRange = null;

    private DatePickerDefaults() {
    }

    public final DatePickerColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -275219611, "C(colors)432@18805L11,432@18817L23:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-275219611, $changed, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:432)");
    L5:
        DatePickerColors r0 = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme($composer, 6), $composer, ($changed << 3) & 112);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-bSRYm20, reason: not valid java name */
    public final DatePickerColors m2150colorsbSRYm20(long containerColor, long titleContentColor, long headlineContentColor, long weekdayContentColor, long subheadContentColor, long navigationContentColor, long yearContentColor, long disabledYearContentColor, long currentYearContentColor, long selectedYearContentColor, long disabledSelectedYearContentColor, long selectedYearContainerColor, long disabledSelectedYearContainerColor, long dayContentColor, long disabledDayContentColor, long selectedDayContentColor, long disabledSelectedDayContentColor, long selectedDayContainerColor, long disabledSelectedDayContainerColor, long todayContentColor, long todayDateBorderColor, long dayInSelectionRangeContentColor, long dayInSelectionRangeContainerColor, long dividerColor, TextFieldColors dateTextFieldColors, Composer $composer, int $changed, int $changed1, int $changed2, int r109) {
        ComposerKt.sourceInformationMarkerStart($composer, 1991626358, "C(colors)P(0:c#ui.graphics.Color,20:c#ui.graphics.Color,13:c#ui.graphics.Color,23:c#ui.graphics.Color,19:c#ui.graphics.Color,14:c#ui.graphics.Color,24:c#ui.graphics.Color,11:c#ui.graphics.Color,1:c#ui.graphics.Color,18:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,9:c#ui.graphics.Color,3:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,21:c#ui.graphics.Color,22:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color)501@23101L11,501@23113L23:DatePicker.kt#uh7d8r");
        if ((r109 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r109 & 2) == 0) goto L9;
        long titleContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r109 & 4) == 0) goto L13;
        long headlineContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r109 & 8) == 0) goto L17;
        long weekdayContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r109 & 16) == 0) goto L21;
        long subheadContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r109 & 32) == 0) goto L25;
        long navigationContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r109 & 64) == 0) goto L29;
        long yearContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if ((r109 & 128) == 0) goto L33;
        long disabledYearContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L35:
        if ((r109 & 256) == 0) goto L37;
        long currentYearContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L39:
        if ((r109 & 512) == 0) goto L41;
        long selectedYearContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L43:
        if ((r109 & 1024) == 0) goto L45;
        long disabledSelectedYearContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L47:
        if ((r109 & 2048) == 0) goto L49;
        long selectedYearContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r109 & 4096) == 0) goto L53;
        long disabledSelectedYearContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L55:
        if ((r109 & 8192) == 0) goto L57;
        long dayContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L59:
        if ((r109 & 16384) == 0) goto L61;
        long disabledDayContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L63:
        if ((32768 & r109) == 0) goto L65;
        long selectedDayContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L67:
        if ((65536 & r109) == 0) goto L69;
        long disabledSelectedDayContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L71:
        if ((131072 & r109) == 0) goto L73;
        long selectedDayContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L75:
        if ((262144 & r109) == 0) goto L77;
        long disabledSelectedDayContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L79:
        if ((524288 & r109) == 0) goto L81;
        long todayContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L83:
        if ((1048576 & r109) == 0) goto L85;
        long todayDateBorderColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L87:
        if ((2097152 & r109) == 0) goto L89;
        long dayInSelectionRangeContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L91:
        if ((4194304 & r109) == 0) goto L93;
        long dayInSelectionRangeContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L95:
        if ((8388608 & r109) == 0) goto L97;
        long dividerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L99:
        if ((r109 & 16777216) == 0) goto L101;
        TextFieldColors dateTextFieldColors2 = null;
    L103:
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventStart(1991626358, $changed, $changed1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:501)");
    L106:
        DatePickerColors r1 = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme($composer, 6), $composer, ($changed2 >> 12) & 112).m2123copytNwlRmA(containerColor2, titleContentColor2, headlineContentColor2, weekdayContentColor2, subheadContentColor2, navigationContentColor2, yearContentColor2, disabledYearContentColor2, currentYearContentColor2, selectedYearContentColor2, disabledSelectedYearContentColor2, selectedYearContainerColor2, disabledSelectedYearContainerColor2, dayContentColor2, disabledDayContentColor2, selectedDayContentColor2, disabledSelectedDayContentColor2, selectedDayContainerColor2, disabledSelectedDayContainerColor2, todayContentColor2, todayDateBorderColor2, dayInSelectionRangeContainerColor2, dayInSelectionRangeContentColor2, dividerColor2, dateTextFieldColors2);
        if (ComposerKt.isTraceInProgress() == false) goto L109;
        ComposerKt.traceEventEnd();
    L109:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L101:
        dateTextFieldColors2 = dateTextFieldColors;
        goto L103
    L97:
        dividerColor2 = dividerColor;
        goto L99
    L93:
        dayInSelectionRangeContainerColor2 = dayInSelectionRangeContainerColor;
        goto L95
    L89:
        dayInSelectionRangeContentColor2 = dayInSelectionRangeContentColor;
        goto L91
    L85:
        todayDateBorderColor2 = todayDateBorderColor;
        goto L87
    L81:
        todayContentColor2 = todayContentColor;
        goto L83
    L77:
        disabledSelectedDayContainerColor2 = disabledSelectedDayContainerColor;
        goto L79
    L73:
        selectedDayContainerColor2 = selectedDayContainerColor;
        goto L75
    L69:
        disabledSelectedDayContentColor2 = disabledSelectedDayContentColor;
        goto L71
    L65:
        selectedDayContentColor2 = selectedDayContentColor;
        goto L67
    L61:
        disabledDayContentColor2 = disabledDayContentColor;
        goto L63
    L57:
        dayContentColor2 = dayContentColor;
        goto L59
    L53:
        disabledSelectedYearContainerColor2 = disabledSelectedYearContainerColor;
        goto L55
    L49:
        selectedYearContainerColor2 = selectedYearContainerColor;
        goto L51
    L45:
        disabledSelectedYearContentColor2 = disabledSelectedYearContentColor;
        goto L47
    L41:
        selectedYearContentColor2 = selectedYearContentColor;
        goto L43
    L37:
        currentYearContentColor2 = currentYearContentColor;
        goto L39
    L33:
        disabledYearContentColor2 = disabledYearContentColor;
        goto L35
    L29:
        yearContentColor2 = yearContentColor;
        goto L31
    L25:
        navigationContentColor2 = navigationContentColor;
        goto L27
    L21:
        subheadContentColor2 = subheadContentColor;
        goto L23
    L17:
        weekdayContentColor2 = weekdayContentColor;
        goto L19
    L13:
        headlineContentColor2 = headlineContentColor;
        goto L15
    L9:
        titleContentColor2 = titleContentColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final DatePickerColors getDefaultDatePickerColors(ColorScheme $this$defaultDatePickerColors, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1180555308, "C:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1180555308, $changed, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:531)");
    L5:
        DatePickerColors it = $this$defaultDatePickerColors.getDefaultDatePickerColorsCached$material3_release();
        $composer.startReplaceGroup(-653681037);
        ComposerKt.sourceInformation($composer, "*589@28839L30");
        if (it != null) goto L8;
        long r5 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getContainerColor());
        long r7 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getHeaderSupportingTextColor());
        long r9 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getHeaderHeadlineColor());
        long r11 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextColor());
        long r13 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadColor());
        long r15 = $this$defaultDatePickerColors.m2033getOnSurfaceVariant0d7_KjU();
        long r17 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor());
        long r19 = Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long r21 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor());
        long r23 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor());
        long r25 = Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long r27 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor());
        long r29 = Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long r31 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor());
        long r33 = Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long r35 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor());
        long r37 = Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long r39 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor());
        long r41 = Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long r43 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor());
        long r45 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getDateTodayContainerOutlineColor());
        long r49 = ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getSelectionDateInRangeLabelTextColor());
        it = new DatePickerColors(r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, ColorSchemeKt.fromToken($this$defaultDatePickerColors, DatePickerModalTokens.INSTANCE.getRangeSelectionActiveIndicatorContainerColor()), r49, ColorSchemeKt.fromToken($this$defaultDatePickerColors, DividerTokens.INSTANCE.getColor()), OutlinedTextFieldDefaults.INSTANCE.getDefaultOutlinedTextFieldColors($this$defaultDatePickerColors, $composer, ($changed & 14) | 48), null);
        $this$defaultDatePickerColors.setDefaultDatePickerColorsCached$material3_release(it);
    L8:
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return it;
    }

    public static /* synthetic */ DatePickerFormatter dateFormatter$default(DatePickerDefaults r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = YearMonthSkeleton;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = YearAbbrMonthDaySkeleton;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = YearMonthWeekdayDaySkeleton;
    L12:
        return r0.dateFormatter(r1, r2, r3);
    }

    public final DatePickerFormatter dateFormatter(String yearSelectionSkeleton, String selectedDateSkeleton, String selectedDateDescriptionSkeleton) {
        return new DatePickerFormatterImpl(yearSelectionSkeleton, selectedDateSkeleton, selectedDateDescriptionSkeleton);
    }

    /* JADX INFO: renamed from: DatePickerTitle-hOD91z4, reason: not valid java name */
    public final void m2149DatePickerTitlehOD91z4(final int displayMode, Modifier modifier, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(327413563);
        ComposerKt.sourceInformation($composer2, "C(DatePickerTitle)P(0:c#material3.DisplayMode):DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r34 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r5 = modifier;
    L24:
        if (($dirty & 19) == 18) goto L26;
    L29:
        if (r4 == 0) goto L31;
        Modifier.Companion modifier2 = Modifier.Companion;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventStart(327413563, $dirty, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:629)");
    L36:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2196getPickerjFl4v0()) == false) goto L38;
        $composer2.startReplaceGroup(406439148);
        ComposerKt.sourceInformation($composer2, "632@30821L43,632@30809L77");
        Strings.Companion r0 = Strings.Companion;
        TextKt.m2820Text4IGK_g(Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_picker_title), $composer2, 0), modifier2, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, $dirty & 112, 0, 131068);
        $composer2.endReplaceGroup();
        Composer $composer3 = $composer2;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventEnd();
    L45:
        final Modifier modifier3 = modifier2;
    L46:
        ScopeUpdateScope r7 = $composer3.endRestartGroup();
        if (r7 == null) goto L50;
        r7.updateScope(new DatePickerDefaults$DatePickerTitle$1(this, displayMode, modifier3, $changed, r34));
        return;
    L50:
        return;
    L38:
        int $dirty2 = $dirty;
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2195getInputjFl4v0()) == false) goto L41;
        $composer2.startReplaceGroup(406443211);
        ComposerKt.sourceInformation($composer2, "634@30948L42,634@30936L76");
        Strings.Companion r1 = Strings.Companion;
        TextKt.m2820Text4IGK_g(Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_title), $composer2, 0), modifier2, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, $dirty2 & 112, 0, 131068);
        $composer3 = $composer2;
        $composer3.endReplaceGroup();
        goto L43
    L41:
        $composer3 = $composer2;
        $composer3.startReplaceGroup(-285079389);
        $composer3.endReplaceGroup();
        goto L43
    L31:
        modifier2 = r5;
        goto L33
    L26:
        if ($composer2.getSkipping() == false) goto L29;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier3 = r5;
        goto L46
    L16:
        if (($changed & 48) != 0) goto L22;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L20;
        int r6 = 32;
    L21:
        $dirty = $dirty | r6;
        goto L24
    L20:
        r6 = 16;
        goto L21
    L22:
        r5 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(displayMode) == false) goto L10;
        int r8 = 4;
    L11:
        $dirty = $dirty | r8;
        goto L12
    L10:
        r8 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: DatePickerHeadline-3kbWawI, reason: not valid java name */
    public final void m2148DatePickerHeadline3kbWawI(final Long selectedDateMillis, final int displayMode, final DatePickerFormatter dateFormatter, Modifier modifier, Composer $composer, final int $changed, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(1502835813);
        ComposerKt.sourceInformation($composer2, "C(DatePickerHeadline)P(3,1:c#material3.DisplayMode)655@31791L15,688@33142L135,685@33045L268:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r42 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r42 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r42 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L35:
        int r4 = r42 & 8;
        if (r4 == 0) goto L39;
        $dirty = $dirty | 3072;
        final Modifier modifier2 = modifier;
    L46:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L49;
    L52:
        if (r4 == 0) goto L54;
        Modifier modifier3 = Modifier.Companion;
    L56:
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventStart(1502835813, $dirty2, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:654)");
    L58:
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale($composer2, 0);
        String formattedDate = DatePickerFormatter.formatDate$default(dateFormatter, selectedDateMillis, defaultLocale, false, 4, null);
        String verboseDateDescription = dateFormatter.formatDate(selectedDateMillis, defaultLocale, true);
        $composer2.startReplaceGroup(1148835145);
        String r12 = "";
        ComposerKt.sourceInformation($composer2, "");
        if (verboseDateDescription == null) goto L61;
    L67:
        $composer2.endReplaceGroup();
        $composer2.startReplaceGroup(1148850481);
        ComposerKt.sourceInformation($composer2, "");
        if (formattedDate == null) goto L70;
        String headlineText = formattedDate;
    L77:
        $composer2.endReplaceGroup();
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2196getPickerjFl4v0()) == false) goto L81;
        $composer2.startReplaceGroup(1148862013);
        ComposerKt.sourceInformation($composer2, "680@32830L48");
        Strings.Companion r13 = Strings.Companion;
        r12 = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_picker_headline_description), $composer2, 0);
        $composer2.endReplaceGroup();
    L84:
        final String headlineDescription = String.format(r12, Arrays.copyOf(new Object[]{verboseDateDescription}, 1));
        Intrinsics.checkNotNullExpressionValue(headlineDescription, "format(this, *args)");
        ComposerKt.sourceInformationMarkerStart($composer2, 1148872084, "CC(remember):DatePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(headlineDescription);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L87;
    L90:
        Object value$iv = (Function1) new DatePickerDefaults$DatePickerHeadline$1$1(headlineDescription);
        $composer2.updateRememberedValue(value$iv);
    L91:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier4 = modifier3;
        Composer $composer3 = $composer2;
        String headlineText2 = headlineText;
        TextKt.m2820Text4IGK_g(headlineText2, SemanticsModifierKt.semantics$default(modifier3, false, (Function1) value$iv, 1, null), 0, 0, null, null, null, 0, null, null, 0, 0, false, 1, 0, null, null, $composer3, 0, 3072, 122876);
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventEnd();
    L94:
        modifier2 = modifier4;
    L95:
        ScopeUpdateScope r8 = $composer3.endRestartGroup();
        if (r8 == null) goto L99;
        r8.updateScope(new DatePickerDefaults$DatePickerHeadline$2(this, selectedDateMillis, displayMode, dateFormatter, modifier2, $changed, r42));
        return;
    L99:
        return;
    L87:
        if (it$iv == Composer.Companion.getEmpty()) goto L90;
        value$iv = it$iv;
        goto L91
    L81:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2195getInputjFl4v0()) == false) goto L83;
        $composer2.startReplaceGroup(1148864764);
        ComposerKt.sourceInformation($composer2, "681@32916L47");
        Strings.Companion r14 = Strings.Companion;
        r12 = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_headline_description), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L84
    L83:
        $composer2.startReplaceGroup(1255139345);
        $composer2.endReplaceGroup();
        goto L84
    L70:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2196getPickerjFl4v0()) == false) goto L73;
        $composer2.startReplaceGroup(1148853330);
        ComposerKt.sourceInformation($composer2, "673@32559L37");
        Strings.Companion r15 = Strings.Companion;
        headlineText = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_picker_headline), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L77
    L73:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2195getInputjFl4v0()) == false) goto L75;
        $composer2.startReplaceGroup(1148855857);
        ComposerKt.sourceInformation($composer2, "674@32638L36");
        Strings.Companion r16 = Strings.Companion;
        headlineText = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_headline), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L77
    L75:
        $composer2.startReplaceGroup(1254856625);
        $composer2.endReplaceGroup();
        headlineText = "";
        goto L77
    L61:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2196getPickerjFl4v0()) == false) goto L64;
        $composer2.startReplaceGroup(1148842944);
        ComposerKt.sourceInformation($composer2, "665@32234L51");
        Strings.Companion r5 = Strings.Companion;
        verboseDateDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_picker_no_selection_description), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L67
    L64:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2195getInputjFl4v0()) == false) goto L66;
        $composer2.startReplaceGroup(1148845915);
        ComposerKt.sourceInformation($composer2, "666@32327L46");
        Strings.Companion r6 = Strings.Companion;
        verboseDateDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_no_input_description), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L67
    L66:
        $composer2.startReplaceGroup(1254558033);
        $composer2.endReplaceGroup();
        verboseDateDescription = "";
        goto L67
    L54:
        modifier3 = modifier2;
        goto L56
    L49:
        if ($composer2.getSkipping() == false) goto L52;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        goto L95
    L39:
        if (($changed & 3072) != 0) goto L45;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
        goto L46
    L43:
        r9 = 1024;
        goto L44
    L45:
        modifier2 = modifier;
        goto L46
    L26:
        if (($changed & 384) != 0) goto L35;
        if (($changed & 512) != 0) goto L30;
        boolean r7 = $composer2.changed(dateFormatter);
    L31:
        if (r7 == false) goto L33;
        int r10 = 256;
    L34:
        $dirty = $dirty | r10;
        goto L35
    L33:
        r10 = 128;
        goto L34
    L30:
        r7 = $composer2.changedInstance(dateFormatter);
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(displayMode) == false) goto L20;
        int r11 = 32;
    L21:
        $dirty = $dirty | r11;
        goto L23
    L20:
        r11 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(selectedDateMillis) == false) goto L10;
        int r17 = 4;
    L11:
        $dirty = $dirty | r17;
        goto L13
    L10:
        r17 = 2;
        goto L11
    }

    public final FlingBehavior rememberSnapFlingBehavior$material3_release(LazyListState lazyListState, DecayAnimationSpec<Float> r18, Composer $composer, int $changed, int r21) {
        ComposerKt.sourceInformationMarkerStart($composer, -2036003494, "C(rememberSnapFlingBehavior)P(1)708@33801L669:DatePicker.kt#uh7d8r");
        if ((r21 & 2) == 0) goto L5;
        DecayAnimationSpec<Float> r5 = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(-2036003494, $changed, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:707)");
    L9:
        ComposerKt.sourceInformationMarkerStart($composer, 2078676503, "CC(remember):DatePicker.kt#9igjgp");
        boolean r3 = $composer.changed(r5);
        if ((($changed & 14) ^ 6) <= 4) goto L14;
        if ($composer.changed(lazyListState) == false) goto L14;
    L15:
        boolean r8 = true;
    L17:
        boolean invalid$iv = r3 | r8;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L20;
    L23:
        final SnapLayoutInfoProvider original = LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
        Object value$iv = SnapFlingBehaviorKt.snapFlingBehavior(new DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1(original), r5, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
        $composer.updateRememberedValue(value$iv);
    L24:
        TargetedFlingBehavior r0 = (TargetedFlingBehavior) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L27;
        ComposerKt.traceEventEnd();
    L27:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L20:
        if (it$iv == Composer.Companion.getEmpty()) goto L23;
        value$iv = it$iv;
    L14:
        if (($changed & 6) == 4) goto L15;
        r8 = false;
        goto L17
    L5:
        r5 = r18;
        goto L7
    }

    static {
        INSTANCE = new DatePickerDefaults();
        YearRange = new IntRange(1900, 2100);
        TonalElevation = ElevationTokens.INSTANCE.m3299getLevel0D9Ej5fM();
        AllDates = new DatePickerDefaults$AllDates$1();
    }

    public final IntRange getYearRange() {
        return YearRange;
    }

    /* JADX INFO: renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2151getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 700927667, "C734@34850L5:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(700927667, $changed, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:734)");
    L5:
        Shape r0 = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final SelectableDates getAllDates() {
        return AllDates;
    }
}
