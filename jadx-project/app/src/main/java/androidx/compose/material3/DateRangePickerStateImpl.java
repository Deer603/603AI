package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0002\u0010\u0010J!\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010$R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DateRangePickerState;", "initialSelectedStartDateMillis", "", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Ljava/util/Locale;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "_displayMode", "Landroidx/compose/runtime/MutableState;", "_selectedEndDate", "Landroidx/compose/material3/internal/CalendarDate;", "_selectedStartDate", "displayMode", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "selectedEndDateMillis", "getSelectedEndDateMillis", "()Ljava/lang/Long;", "selectedStartDateMillis", "getSelectedStartDateMillis", "setSelection", "", "startDateMillis", "endDateMillis", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {
    public static final Companion Companion = null;
    private MutableState<DisplayMode> _displayMode;
    private MutableState<CalendarDate> _selectedEndDate;
    private MutableState<CalendarDate> _selectedStartDate;

    /* JADX INFO: compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DateRangePickerStateImpl;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<DateRangePickerStateImpl, Object> Saver(final SelectableDates selectableDates, final Locale locale) {
            return ListSaverKt.listSaver(DateRangePickerStateImpl$Companion$Saver$1.INSTANCE, new DateRangePickerStateImpl$Companion$Saver$2(selectableDates, locale));
        }
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ DateRangePickerStateImpl(Long r1, Long r2, Long r3, IntRange r4, int r5, SelectableDates r6, Locale r7, DefaultConstructorMarker r8) {
        this(r1, r2, r3, r4, r5, r6, r7);
    }

    private DateRangePickerStateImpl(Long initialSelectedStartDateMillis, Long initialSelectedEndDateMillis, Long initialDisplayedMonthMillis, IntRange yearRange, int initialDisplayMode, SelectableDates selectableDates, Locale locale) {
        super(initialDisplayedMonthMillis, yearRange, selectableDates, locale);
        this._selectedStartDate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selectedEndDate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        setSelection(initialSelectedStartDateMillis, initialSelectedEndDateMillis);
        this._displayMode = SnapshotStateKt.mutableStateOf$default(DisplayMode.m2188boximpl(initialDisplayMode), null, 2, null);
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedStartDateMillis() {
        CalendarDate r0 = this._selectedStartDate.getValue();
        if (r0 != null) goto L7;
        return null;
    L7:
        return Long.valueOf(r0.getUtcTimeMillis());
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public Long getSelectedEndDateMillis() {
        CalendarDate r0 = this._selectedEndDate.getValue();
        if (r0 != null) goto L7;
        return null;
    L7:
        return Long.valueOf(r0.getUtcTimeMillis());
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* JADX INFO: renamed from: getDisplayMode-jFl-4v0 */
    public int mo2178getDisplayModejFl4v0() {
        return this._displayMode.getValue().m2194unboximpl();
    }

    @Override // androidx.compose.material3.DateRangePickerState
    /* JADX INFO: renamed from: setDisplayMode-vCnGnXg */
    public void mo2179setDisplayModevCnGnXg(int displayMode) {
        Long r0 = getSelectedStartDateMillis();
        if (r0 == null) goto L5;
        long it = r0.longValue();
        setDisplayedMonthMillis(getCalendarModel().getMonth(it).getStartUtcTimeMillis());
    L5:
        this._displayMode.setValue(DisplayMode.m2188boximpl(displayMode));
    }

    @Override // androidx.compose.material3.DateRangePickerState
    public void setSelection(Long startDateMillis, Long endDateMillis) {
        CalendarDate endDate = null;
        if (startDateMillis == null) goto L5;
        CalendarDate startDate = getCalendarModel().getCanonicalDate(startDateMillis.longValue());
    L7:
        if (endDateMillis == null) goto L11;
        endDate = getCalendarModel().getCanonicalDate(endDateMillis.longValue());
    L11:
        if (startDate == null) goto L17;
        CalendarDate it = startDate;
        if (getYearRange().contains(it.getYear()) == true) goto L17;
        throw new IllegalArgumentException(("The provided start date year (" + it.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
    L17:
        if (endDate == null) goto L23;
        CalendarDate it2 = endDate;
        if (getYearRange().contains(it2.getYear()) == true) goto L23;
        throw new IllegalArgumentException(("The provided end date year (" + it2.getYear() + ") is out of the years range of " + getYearRange() + '.').toString());
    L23:
        if (endDate == null) goto L35;
        if (startDate == null) goto L34;
        if (startDate.getUtcTimeMillis() > endDate.getUtcTimeMillis()) goto L28;
        boolean r2 = true;
    L29:
        if (r2 == true) goto L35;
        throw new IllegalArgumentException("The provided end date appears before the start date.".toString());
    L28:
        r2 = false;
        goto L29
    L34:
        throw new IllegalArgumentException("An end date was provided without a start date.".toString());
    L35:
        this._selectedStartDate.setValue(startDate);
        this._selectedEndDate.setValue(endDate);
        return;
    L5:
        startDate = null;
        goto L7
    }
}
