package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u008c\u0002\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cø\u0001\u0000¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030>2\u0006\u0010E\u001a\u00020@2\u0006\u0010?\u001a\u00020@2\u0006\u0010F\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bG\u0010HJ\u0013\u0010I\u001a\u00020@2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010K\u001a\u00020LH\u0016J%\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bN\u0010OJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030>2\u0006\u0010P\u001a\u00020@2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bQ\u0010DJ!\u0010R\u001a\u00020\u001c*\u0004\u0018\u00010\u001c2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001c0TH\u0000¢\u0006\u0002\bUR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u0019\u0010\u0018\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b%\u0010\u001fR\u0019\u0010\u0019\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b&\u0010\u001fR\u0019\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b(\u0010\u001fR\u0019\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001fR\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b+\u0010\u001fR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b,\u0010\u001fR\u0019\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b-\u0010\u001fR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b.\u0010\u001fR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b0\u0010\u001fR\u0019\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b1\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b2\u0010\u001fR\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b8\u0010\u001fR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b9\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/material3/DatePickerColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "dateTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerColor-0d7_KjU", "()J", "J", "getCurrentYearContentColor-0d7_KjU", "getDateTextFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "getDayContentColor-0d7_KjU", "getDayInSelectionRangeContainerColor-0d7_KjU", "getDayInSelectionRangeContentColor-0d7_KjU", "getDisabledDayContentColor-0d7_KjU", "getDisabledSelectedDayContainerColor-0d7_KjU", "getDisabledSelectedDayContentColor-0d7_KjU", "getDisabledSelectedYearContainerColor-0d7_KjU", "getDisabledSelectedYearContentColor-0d7_KjU", "getDisabledYearContentColor-0d7_KjU", "getDividerColor-0d7_KjU", "getHeadlineContentColor-0d7_KjU", "getNavigationContentColor-0d7_KjU", "getSelectedDayContainerColor-0d7_KjU", "getSelectedDayContentColor-0d7_KjU", "getSelectedYearContainerColor-0d7_KjU", "getSelectedYearContentColor-0d7_KjU", "getSubheadContentColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "getTodayContentColor-0d7_KjU", "getTodayDateBorderColor-0d7_KjU", "getWeekdayContentColor-0d7_KjU", "getYearContentColor-0d7_KjU", "copy", "copy-tNwlRmA", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;)Landroidx/compose/material3/DatePickerColors;", "dayContainerColor", "Landroidx/compose/runtime/State;", "selected", "", "enabled", "animate", "dayContainerColor$material3_release", "(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isToday", "inRange", "dayContentColor$material3_release", "(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "yearContainerColor", "yearContainerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "currentYear", "yearContentColor$material3_release", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DatePickerColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long currentYearContentColor;
    private final TextFieldColors dateTextFieldColors;
    private final long dayContentColor;
    private final long dayInSelectionRangeContainerColor;
    private final long dayInSelectionRangeContentColor;
    private final long disabledDayContentColor;
    private final long disabledSelectedDayContainerColor;
    private final long disabledSelectedDayContentColor;
    private final long disabledSelectedYearContainerColor;
    private final long disabledSelectedYearContentColor;
    private final long disabledYearContentColor;
    private final long dividerColor;
    private final long headlineContentColor;
    private final long navigationContentColor;
    private final long selectedDayContainerColor;
    private final long selectedDayContentColor;
    private final long selectedYearContainerColor;
    private final long selectedYearContentColor;
    private final long subheadContentColor;
    private final long titleContentColor;
    private final long todayContentColor;
    private final long todayDateBorderColor;
    private final long weekdayContentColor;
    private final long yearContentColor;

    static {
    }

    public /* synthetic */ DatePickerColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, long r45, long r47, TextFieldColors r49, DefaultConstructorMarker r50) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49);
    }

    private DatePickerColors(long containerColor, long titleContentColor, long headlineContentColor, long weekdayContentColor, long subheadContentColor, long navigationContentColor, long yearContentColor, long disabledYearContentColor, long currentYearContentColor, long selectedYearContentColor, long disabledSelectedYearContentColor, long selectedYearContainerColor, long disabledSelectedYearContainerColor, long dayContentColor, long disabledDayContentColor, long selectedDayContentColor, long disabledSelectedDayContentColor, long selectedDayContainerColor, long disabledSelectedDayContainerColor, long todayContentColor, long todayDateBorderColor, long dayInSelectionRangeContainerColor, long dayInSelectionRangeContentColor, long dividerColor, TextFieldColors dateTextFieldColors) {
        this.containerColor = containerColor;
        this.titleContentColor = titleContentColor;
        this.headlineContentColor = headlineContentColor;
        this.weekdayContentColor = weekdayContentColor;
        this.subheadContentColor = subheadContentColor;
        this.navigationContentColor = navigationContentColor;
        this.yearContentColor = yearContentColor;
        this.disabledYearContentColor = disabledYearContentColor;
        this.currentYearContentColor = currentYearContentColor;
        this.selectedYearContentColor = selectedYearContentColor;
        this.disabledSelectedYearContentColor = disabledSelectedYearContentColor;
        this.selectedYearContainerColor = selectedYearContainerColor;
        this.disabledSelectedYearContainerColor = disabledSelectedYearContainerColor;
        this.dayContentColor = dayContentColor;
        this.disabledDayContentColor = disabledDayContentColor;
        this.selectedDayContentColor = selectedDayContentColor;
        this.disabledSelectedDayContentColor = disabledSelectedDayContentColor;
        this.selectedDayContainerColor = selectedDayContainerColor;
        this.disabledSelectedDayContainerColor = disabledSelectedDayContainerColor;
        this.todayContentColor = todayContentColor;
        this.todayDateBorderColor = todayDateBorderColor;
        this.dayInSelectionRangeContainerColor = dayInSelectionRangeContainerColor;
        this.dayInSelectionRangeContentColor = dayInSelectionRangeContentColor;
        this.dividerColor = dividerColor;
        this.dateTextFieldColors = dateTextFieldColors;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2124getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2143getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: getHeadlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m2136getHeadlineContentColor0d7_KjU() {
        return this.headlineContentColor;
    }

    /* JADX INFO: renamed from: getWeekdayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2146getWeekdayContentColor0d7_KjU() {
        return this.weekdayContentColor;
    }

    /* JADX INFO: renamed from: getSubheadContentColor-0d7_KjU, reason: not valid java name */
    public final long m2142getSubheadContentColor0d7_KjU() {
        return this.subheadContentColor;
    }

    /* JADX INFO: renamed from: getNavigationContentColor-0d7_KjU, reason: not valid java name */
    public final long m2137getNavigationContentColor0d7_KjU() {
        return this.navigationContentColor;
    }

    /* JADX INFO: renamed from: getYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2147getYearContentColor0d7_KjU() {
        return this.yearContentColor;
    }

    /* JADX INFO: renamed from: getDisabledYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2134getDisabledYearContentColor0d7_KjU() {
        return this.disabledYearContentColor;
    }

    /* JADX INFO: renamed from: getCurrentYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2125getCurrentYearContentColor0d7_KjU() {
        return this.currentYearContentColor;
    }

    /* JADX INFO: renamed from: getSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2141getSelectedYearContentColor0d7_KjU() {
        return this.selectedYearContentColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2133getDisabledSelectedYearContentColor0d7_KjU() {
        return this.disabledSelectedYearContentColor;
    }

    /* JADX INFO: renamed from: getSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2140getSelectedYearContainerColor0d7_KjU() {
        return this.selectedYearContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2132getDisabledSelectedYearContainerColor0d7_KjU() {
        return this.disabledSelectedYearContainerColor;
    }

    /* JADX INFO: renamed from: getDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2126getDayContentColor0d7_KjU() {
        return this.dayContentColor;
    }

    /* JADX INFO: renamed from: getDisabledDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2129getDisabledDayContentColor0d7_KjU() {
        return this.disabledDayContentColor;
    }

    /* JADX INFO: renamed from: getSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2139getSelectedDayContentColor0d7_KjU() {
        return this.selectedDayContentColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2131getDisabledSelectedDayContentColor0d7_KjU() {
        return this.disabledSelectedDayContentColor;
    }

    /* JADX INFO: renamed from: getSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2138getSelectedDayContainerColor0d7_KjU() {
        return this.selectedDayContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2130getDisabledSelectedDayContainerColor0d7_KjU() {
        return this.disabledSelectedDayContainerColor;
    }

    /* JADX INFO: renamed from: getTodayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2144getTodayContentColor0d7_KjU() {
        return this.todayContentColor;
    }

    /* JADX INFO: renamed from: getTodayDateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2145getTodayDateBorderColor0d7_KjU() {
        return this.todayDateBorderColor;
    }

    /* JADX INFO: renamed from: getDayInSelectionRangeContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2127getDayInSelectionRangeContainerColor0d7_KjU() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* JADX INFO: renamed from: getDayInSelectionRangeContentColor-0d7_KjU, reason: not valid java name */
    public final long m2128getDayInSelectionRangeContentColor0d7_KjU() {
        return this.dayInSelectionRangeContentColor;
    }

    /* JADX INFO: renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m2135getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* JADX INFO: renamed from: copy-tNwlRmA$default, reason: not valid java name */
    public static /* synthetic */ DatePickerColors m2122copytNwlRmA$default(DatePickerColors r19, long r20, long r22, long r24, long r26, long r28, long r30, long r32, long r34, long r36, long r38, long r40, long r42, long r44, long r46, long r48, long r50, long r52, long r54, long r56, long r58, long r60, long r62, long r64, long r66, TextFieldColors r68, int r69, Object r70) {
        if ((r69 & 1) == 0) goto L5;
        long r2 = r19.containerColor;
    L7:
        if ((r69 & 2) == 0) goto L9;
        long r4 = r19.titleContentColor;
    L11:
        if ((r69 & 4) == 0) goto L13;
        long r6 = r19.headlineContentColor;
    L15:
        if ((r69 & 8) == 0) goto L17;
        long r8 = r19.weekdayContentColor;
    L19:
        if ((r69 & 16) == 0) goto L21;
        long r10 = r19.subheadContentColor;
    L23:
        if ((r69 & 32) == 0) goto L25;
        long r12 = r19.navigationContentColor;
    L27:
        if ((r69 & 64) == 0) goto L29;
        long r14 = r19.yearContentColor;
    L30:
        long r16 = r2;
        if ((r69 & 128) == 0) goto L33;
        long r3 = r19.disabledYearContentColor;
    L34:
        long r21 = r3;
        if ((r69 & 256) == 0) goto L37;
        long r5 = r19.currentYearContentColor;
    L38:
        long r23 = r5;
        if ((r69 & 512) == 0) goto L41;
        long r7 = r19.selectedYearContentColor;
    L42:
        long r25 = r7;
        if ((r69 & 1024) == 0) goto L45;
        long r9 = r19.disabledSelectedYearContentColor;
    L46:
        long r27 = r9;
        if ((r69 & 2048) == 0) goto L49;
        long r11 = r19.selectedYearContainerColor;
    L50:
        long r29 = r11;
        if ((r69 & 4096) == 0) goto L53;
        long r13 = r19.disabledSelectedYearContainerColor;
    L54:
        long r31 = r13;
        if ((r69 & 8192) == 0) goto L57;
        long r15 = r19.dayContentColor;
    L58:
        long r33 = r15;
        if ((r69 & 16384) == 0) goto L61;
        long r17 = r19.disabledDayContentColor;
    L63:
        if ((r69 & 32768) == 0) goto L65;
        long r1 = r19.selectedDayContentColor;
    L67:
        if ((r69 & 65536) == 0) goto L69;
        long r18 = r19.disabledSelectedDayContentColor;
    L71:
        if ((r69 & 131072) == 0) goto L73;
        long r35 = r19.selectedDayContainerColor;
    L75:
        if ((r69 & 262144) == 0) goto L77;
        long r37 = r19.disabledSelectedDayContainerColor;
    L79:
        if ((r69 & 524288) == 0) goto L81;
        long r39 = r19.todayContentColor;
    L83:
        if ((r69 & 1048576) == 0) goto L85;
        long r41 = r19.todayDateBorderColor;
    L87:
        if ((r69 & 2097152) == 0) goto L89;
        long r43 = r19.dayInSelectionRangeContainerColor;
    L91:
        if ((r69 & 4194304) == 0) goto L93;
        long r45 = r19.dayInSelectionRangeContentColor;
    L95:
        if ((r69 & 8388608) == 0) goto L97;
        long r47 = r19.dividerColor;
    L99:
        if ((r69 & 16777216) == 0) goto L101;
        TextFieldColors r49 = r19.dateTextFieldColors;
    L102:
        long r410 = r17;
        long r51 = r1;
        long r210 = r6;
        long r211 = r8;
        long r212 = r10;
        long r310 = r12;
        long r311 = r14;
        long r213 = r4;
        return r19.m2123copytNwlRmA(r16, r213, r210, r211, r212, r310, r311, r21, r23, r25, r27, r29, r31, r33, r410, r51, r18, r35, r37, r39, r41, r43, r45, r47, r49);
    L101:
        r49 = r68;
        goto L102
    L97:
        r47 = r66;
        goto L99
    L93:
        r45 = r64;
        goto L95
    L89:
        r43 = r62;
        goto L91
    L85:
        r41 = r60;
        goto L87
    L81:
        r39 = r58;
        goto L83
    L77:
        r37 = r56;
        goto L79
    L73:
        r35 = r54;
        goto L75
    L69:
        r18 = r52;
        goto L71
    L65:
        r1 = r50;
        goto L67
    L61:
        r17 = r48;
        goto L63
    L57:
        r15 = r46;
        goto L58
    L53:
        r13 = r44;
        goto L54
    L49:
        r11 = r42;
        goto L50
    L45:
        r9 = r40;
        goto L46
    L41:
        r7 = r38;
        goto L42
    L37:
        r5 = r36;
        goto L38
    L33:
        r3 = r34;
        goto L34
    L29:
        r14 = r32;
        goto L30
    L25:
        r12 = r30;
        goto L27
    L21:
        r10 = r28;
        goto L23
    L17:
        r8 = r26;
        goto L19
    L13:
        r6 = r24;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    /* JADX INFO: renamed from: copy-tNwlRmA, reason: not valid java name */
    public final DatePickerColors m2123copytNwlRmA(long containerColor, long titleContentColor, long headlineContentColor, long weekdayContentColor, long subheadContentColor, long navigationContentColor, long yearContentColor, long disabledYearContentColor, long currentYearContentColor, long selectedYearContentColor, long disabledSelectedYearContentColor, long selectedYearContainerColor, long disabledSelectedYearContainerColor, long dayContentColor, long disabledDayContentColor, long selectedDayContentColor, long disabledSelectedDayContentColor, long selectedDayContainerColor, long disabledSelectedDayContainerColor, long todayContentColor, long todayDateBorderColor, long dayInSelectionRangeContainerColor, long dayInSelectionRangeContentColor, long dividerColor, TextFieldColors dateTextFieldColors) {
        boolean r10 = true;
        if (containerColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = containerColor;
    L10:
        if (titleContentColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = titleContentColor;
    L17:
        if (headlineContentColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = headlineContentColor;
    L24:
        if (weekdayContentColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = weekdayContentColor;
    L31:
        if (subheadContentColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = subheadContentColor;
    L38:
        if (navigationContentColor == 16) goto L40;
        boolean r9 = true;
    L41:
        if (r9 == false) goto L43;
        long r23 = navigationContentColor;
    L45:
        if (yearContentColor == 16) goto L47;
        boolean r11 = true;
    L48:
        if (r11 == false) goto L50;
        long r25 = yearContentColor;
    L52:
        if (disabledYearContentColor == 16) goto L54;
        boolean r12 = true;
    L55:
        if (r12 == false) goto L57;
        long r27 = disabledYearContentColor;
    L59:
        if (currentYearContentColor == 16) goto L61;
        boolean r14 = true;
    L62:
        if (r14 == false) goto L64;
        long r29 = currentYearContentColor;
    L66:
        if (selectedYearContentColor == 16) goto L68;
        boolean r16 = true;
    L69:
        if (r16 == false) goto L71;
        long r31 = selectedYearContentColor;
    L73:
        if (disabledSelectedYearContentColor == 16) goto L75;
        boolean r18 = true;
    L76:
        if (r18 == false) goto L78;
        long r33 = disabledSelectedYearContentColor;
    L80:
        if (selectedYearContainerColor == 16) goto L82;
        boolean r20 = true;
    L83:
        if (r20 == false) goto L85;
        long r35 = selectedYearContainerColor;
    L87:
        if (disabledSelectedYearContainerColor == 16) goto L89;
        boolean r22 = true;
    L90:
        if (r22 == false) goto L92;
        long r37 = disabledSelectedYearContainerColor;
    L94:
        if (dayContentColor == 16) goto L96;
        boolean r24 = true;
    L97:
        if (r24 == false) goto L99;
        long r39 = dayContentColor;
    L101:
        if (disabledDayContentColor == 16) goto L103;
        boolean r26 = true;
    L104:
        if (r26 == false) goto L106;
        long r41 = disabledDayContentColor;
    L108:
        if (selectedDayContentColor == 16) goto L110;
        boolean r28 = true;
    L111:
        if (r28 == false) goto L113;
        long r43 = selectedDayContentColor;
    L115:
        if (disabledSelectedDayContentColor == 16) goto L117;
        boolean r30 = true;
    L118:
        if (r30 == false) goto L120;
        long r45 = disabledSelectedDayContentColor;
    L122:
        if (selectedDayContainerColor == 16) goto L124;
        boolean r32 = true;
    L125:
        if (r32 == false) goto L127;
        long r47 = selectedDayContainerColor;
    L129:
        if (disabledSelectedDayContainerColor == 16) goto L131;
        boolean r34 = true;
    L132:
        if (r34 == false) goto L134;
        long r49 = disabledSelectedDayContainerColor;
    L136:
        if (todayContentColor == 16) goto L138;
        boolean r36 = true;
    L139:
        if (r36 == false) goto L141;
        long r51 = todayContentColor;
    L143:
        if (todayDateBorderColor == 16) goto L145;
        boolean r38 = true;
    L146:
        if (r38 == false) goto L148;
        long r53 = todayDateBorderColor;
    L150:
        if (dayInSelectionRangeContainerColor == 16) goto L152;
        boolean r40 = true;
    L153:
        if (r40 == false) goto L155;
        long r55 = dayInSelectionRangeContainerColor;
    L157:
        if (dayInSelectionRangeContentColor == 16) goto L159;
        boolean r42 = true;
    L160:
        if (r42 == false) goto L162;
        long r57 = dayInSelectionRangeContentColor;
    L164:
        if (dividerColor != 16) goto L167;
        r10 = false;
    L167:
        if (r10 == false) goto L169;
        long r59 = dividerColor;
    L171:
        return new DatePickerColors(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, takeOrElse$material3_release(dateTextFieldColors, new DatePickerColors$copy$25(this)), null);
    L169:
        r59 = this.dividerColor;
        goto L171
    L162:
        r57 = this.dayInSelectionRangeContentColor;
        goto L164
    L159:
        r42 = false;
        goto L160
    L155:
        r55 = this.dayInSelectionRangeContainerColor;
        goto L157
    L152:
        r40 = false;
        goto L153
    L148:
        r53 = this.todayDateBorderColor;
        goto L150
    L145:
        r38 = false;
        goto L146
    L141:
        r51 = this.todayContentColor;
        goto L143
    L138:
        r36 = false;
        goto L139
    L134:
        r49 = this.disabledSelectedDayContainerColor;
        goto L136
    L131:
        r34 = false;
        goto L132
    L127:
        r47 = this.selectedDayContainerColor;
        goto L129
    L124:
        r32 = false;
        goto L125
    L120:
        r45 = this.disabledSelectedDayContentColor;
        goto L122
    L117:
        r30 = false;
        goto L118
    L113:
        r43 = this.selectedDayContentColor;
        goto L115
    L110:
        r28 = false;
        goto L111
    L106:
        r41 = this.disabledDayContentColor;
        goto L108
    L103:
        r26 = false;
        goto L104
    L99:
        r39 = this.dayContentColor;
        goto L101
    L96:
        r24 = false;
        goto L97
    L92:
        r37 = this.disabledSelectedYearContainerColor;
        goto L94
    L89:
        r22 = false;
        goto L90
    L85:
        r35 = this.selectedYearContainerColor;
        goto L87
    L82:
        r20 = false;
        goto L83
    L78:
        r33 = this.disabledSelectedYearContentColor;
        goto L80
    L75:
        r18 = false;
        goto L76
    L71:
        r31 = this.selectedYearContentColor;
        goto L73
    L68:
        r16 = false;
        goto L69
    L64:
        r29 = this.currentYearContentColor;
        goto L66
    L61:
        r14 = false;
        goto L62
    L57:
        r27 = this.disabledYearContentColor;
        goto L59
    L54:
        r12 = false;
        goto L55
    L50:
        r25 = this.yearContentColor;
        goto L52
    L47:
        r11 = false;
        goto L48
    L43:
        r23 = this.navigationContentColor;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r21 = this.subheadContentColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.weekdayContentColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.headlineContentColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.titleContentColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.containerColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    public final TextFieldColors takeOrElse$material3_release(TextFieldColors $this$takeOrElse, Function0<TextFieldColors> r3) {
        if ($this$takeOrElse != null) goto L5;
        return r3.invoke();
    L5:
        return $this$takeOrElse;
    }

    public final State<Color> dayContentColor$material3_release(boolean isToday, boolean selected, boolean inRange, boolean enabled, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1233694918, "C(dayContentColor)P(2,3,1):DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L7;
        ComposerKt.traceEventStart(-1233694918, $changed, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:901)");
    L7:
        if (selected == false) goto L10;
        if (enabled == false) goto L10;
        long target = this.selectedDayContentColor;
    L25:
        if (inRange == false) goto L27;
        $composer.startReplaceGroup(-828303257);
        ComposerKt.sourceInformation($composer, "914@44574L28");
        State<Color> r2 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer, 0);
        $composer.endReplaceGroup();
    L29:
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L31:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L27:
        $composer.startReplaceGroup(-828241443);
        ComposerKt.sourceInformation($composer, "917@44710L88");
        r2 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, $composer, 0, 12);
        $composer.endReplaceGroup();
    L10:
        if (selected == false) goto L13;
        if (enabled == true) goto L13;
        target = this.disabledSelectedDayContentColor;
    L13:
        if (inRange == false) goto L16;
        if (enabled == false) goto L16;
        target = this.dayInSelectionRangeContentColor;
    L16:
        if (inRange == false) goto L19;
        if (enabled == true) goto L19;
        target = this.disabledDayContentColor;
    L19:
        if (isToday == false) goto L21;
        target = this.todayContentColor;
        goto L25
    L21:
        if (enabled == false) goto L23;
        target = this.dayContentColor;
        goto L25
    L23:
        target = this.disabledDayContentColor;
        goto L25
    }

    public final State<Color> dayContainerColor$material3_release(boolean selected, boolean enabled, boolean animate, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1240482658, "C(dayContainerColor)P(2,1):DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1240482658, $changed, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:933)");
    L5:
        if (selected == false) goto L9;
        if (enabled == false) goto L8;
        long r0 = this.selectedDayContainerColor;
    L10:
        long target = r0;
        if (animate == false) goto L13;
        $composer.startReplaceGroup(-217363149);
        ComposerKt.sourceInformation($composer, "941@45516L88");
        Composer $composer2 = $composer;
        State<Color> r14 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, $composer2, 0, 12);
        $composer2.endReplaceGroup();
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventEnd();
    L17:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r14;
    L13:
        $composer2 = $composer;
        $composer2.startReplaceGroup(-217247953);
        ComposerKt.sourceInformation($composer2, "943@45634L28");
        r14 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L15
    L8:
        r0 = this.disabledSelectedDayContainerColor;
        goto L10
    L9:
        r0 = Color.Companion.m4401getTransparent0d7_KjU();
        goto L10
    }

    public final State<Color> yearContentColor$material3_release(boolean currentYear, boolean selected, boolean enabled, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 874111097, "C(yearContentColor)P(!1,2)969@46510L122:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(874111097, $changed, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:959)");
    L6:
        if (selected == false) goto L9;
        if (enabled == false) goto L9;
        long r0 = this.selectedYearContentColor;
    L17:
        long target = r0;
        State<Color> r14 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, $composer, 0, 12);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r14;
    L9:
        if (selected == false) goto L12;
        if (enabled == true) goto L12;
        r0 = this.disabledSelectedYearContentColor;
    L12:
        if (currentYear == false) goto L14;
        r0 = this.currentYearContentColor;
        goto L17
    L14:
        if (enabled == false) goto L16;
        r0 = this.yearContentColor;
        goto L17
    L16:
        r0 = this.disabledYearContentColor;
        goto L17
    }

    public final State<Color> yearContainerColor$material3_release(boolean selected, boolean enabled, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1306331107, "C(yearContainerColor)P(1)989@47197L122:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1306331107, $changed, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:982)");
    L5:
        if (selected == false) goto L9;
        if (enabled == false) goto L8;
        long r0 = this.selectedYearContainerColor;
    L10:
        long target = r0;
        State<Color> r13 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, $composer, 0, 12);
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventEnd();
    L13:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r13;
    L8:
        r0 = this.disabledSelectedYearContainerColor;
        goto L10
    L9:
        r0 = Color.Companion.m4401getTransparent0d7_KjU();
        goto L10
    }

    public boolean equals(Object other) {
        if ((other instanceof DatePickerColors) == true) goto L6;
        return false;
    L6:
        if (Color.m4367equalsimpl0(this.containerColor, ((DatePickerColors) other).containerColor) == true) goto L9;
        return false;
    L9:
        if (Color.m4367equalsimpl0(this.titleContentColor, ((DatePickerColors) other).titleContentColor) == true) goto L12;
        return false;
    L12:
        if (Color.m4367equalsimpl0(this.headlineContentColor, ((DatePickerColors) other).headlineContentColor) == true) goto L15;
        return false;
    L15:
        if (Color.m4367equalsimpl0(this.weekdayContentColor, ((DatePickerColors) other).weekdayContentColor) == true) goto L18;
        return false;
    L18:
        if (Color.m4367equalsimpl0(this.subheadContentColor, ((DatePickerColors) other).subheadContentColor) == true) goto L21;
        return false;
    L21:
        if (Color.m4367equalsimpl0(this.yearContentColor, ((DatePickerColors) other).yearContentColor) == true) goto L24;
        return false;
    L24:
        if (Color.m4367equalsimpl0(this.disabledYearContentColor, ((DatePickerColors) other).disabledYearContentColor) == true) goto L27;
        return false;
    L27:
        if (Color.m4367equalsimpl0(this.currentYearContentColor, ((DatePickerColors) other).currentYearContentColor) == true) goto L30;
        return false;
    L30:
        if (Color.m4367equalsimpl0(this.selectedYearContentColor, ((DatePickerColors) other).selectedYearContentColor) == true) goto L33;
        return false;
    L33:
        if (Color.m4367equalsimpl0(this.disabledSelectedYearContentColor, ((DatePickerColors) other).disabledSelectedYearContentColor) == true) goto L36;
        return false;
    L36:
        if (Color.m4367equalsimpl0(this.selectedYearContainerColor, ((DatePickerColors) other).selectedYearContainerColor) == true) goto L39;
        return false;
    L39:
        if (Color.m4367equalsimpl0(this.disabledSelectedYearContainerColor, ((DatePickerColors) other).disabledSelectedYearContainerColor) == true) goto L42;
        return false;
    L42:
        if (Color.m4367equalsimpl0(this.dayContentColor, ((DatePickerColors) other).dayContentColor) == true) goto L45;
        return false;
    L45:
        if (Color.m4367equalsimpl0(this.disabledDayContentColor, ((DatePickerColors) other).disabledDayContentColor) == true) goto L48;
        return false;
    L48:
        if (Color.m4367equalsimpl0(this.selectedDayContentColor, ((DatePickerColors) other).selectedDayContentColor) == true) goto L51;
        return false;
    L51:
        if (Color.m4367equalsimpl0(this.disabledSelectedDayContentColor, ((DatePickerColors) other).disabledSelectedDayContentColor) == true) goto L54;
        return false;
    L54:
        if (Color.m4367equalsimpl0(this.selectedDayContainerColor, ((DatePickerColors) other).selectedDayContainerColor) == true) goto L57;
        return false;
    L57:
        if (Color.m4367equalsimpl0(this.disabledSelectedDayContainerColor, ((DatePickerColors) other).disabledSelectedDayContainerColor) == true) goto L60;
        return false;
    L60:
        if (Color.m4367equalsimpl0(this.todayContentColor, ((DatePickerColors) other).todayContentColor) == true) goto L63;
        return false;
    L63:
        if (Color.m4367equalsimpl0(this.todayDateBorderColor, ((DatePickerColors) other).todayDateBorderColor) == true) goto L66;
        return false;
    L66:
        if (Color.m4367equalsimpl0(this.dayInSelectionRangeContainerColor, ((DatePickerColors) other).dayInSelectionRangeContainerColor) == true) goto L69;
        return false;
    L69:
        if (Color.m4367equalsimpl0(this.dayInSelectionRangeContentColor, ((DatePickerColors) other).dayInSelectionRangeContentColor) == true) goto L71;
        return false;
    L71:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.containerColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.titleContentColor);
        return (((((((((((((((((((((((((((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.headlineContentColor)) * 31) + Color.m4373hashCodeimpl(this.weekdayContentColor)) * 31) + Color.m4373hashCodeimpl(this.subheadContentColor)) * 31) + Color.m4373hashCodeimpl(this.yearContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledYearContentColor)) * 31) + Color.m4373hashCodeimpl(this.currentYearContentColor)) * 31) + Color.m4373hashCodeimpl(this.selectedYearContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledSelectedYearContentColor)) * 31) + Color.m4373hashCodeimpl(this.selectedYearContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledSelectedYearContainerColor)) * 31) + Color.m4373hashCodeimpl(this.dayContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledDayContentColor)) * 31) + Color.m4373hashCodeimpl(this.selectedDayContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledSelectedDayContentColor)) * 31) + Color.m4373hashCodeimpl(this.selectedDayContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledSelectedDayContainerColor)) * 31) + Color.m4373hashCodeimpl(this.todayContentColor)) * 31) + Color.m4373hashCodeimpl(this.todayDateBorderColor)) * 31) + Color.m4373hashCodeimpl(this.dayInSelectionRangeContainerColor)) * 31) + Color.m4373hashCodeimpl(this.dayInSelectionRangeContentColor);
    }
}
