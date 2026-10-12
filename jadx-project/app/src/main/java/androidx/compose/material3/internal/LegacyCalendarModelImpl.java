package androidx.compose.material3.internal;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LegacyCalendarModelImpl.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0014\u0010\u001c\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0007H\u0016J\u001a\u0010)\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0018\u0010*\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0007H\u0016J\b\u0010,\u001a\u00020\u0011H\u0016J\u0014\u0010-\u001a\u00020#*\u00020\u000b2\u0006\u0010.\u001a\u00020/H\u0002J\f\u0010-\u001a\u00020#*\u00020!H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u00061"}, d2 = {"Landroidx/compose/material3/internal/LegacyCalendarModelImpl;", "Landroidx/compose/material3/internal/CalendarModel;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Ljava/util/Locale;)V", "firstDayOfWeek", "", "getFirstDayOfWeek", "()I", "today", "Landroidx/compose/material3/internal/CalendarDate;", "getToday", "()Landroidx/compose/material3/internal/CalendarDate;", "weekdayNames", "", "Lkotlin/Pair;", "", "getWeekdayNames", "()Ljava/util/List;", "dayInISO8601", "day", "formatWithPattern", "utcTimeMillis", "", "pattern", "getCanonicalDate", "timeInMillis", "getDateInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "getDayOfWeek", "date", "getMonth", "Landroidx/compose/material3/internal/CalendarMonth;", "firstDayCalendar", "Ljava/util/Calendar;", "year", "month", "minusMonths", "from", "subtractedMonthsCount", "parse", "plusMonths", "addedMonthsCount", "toString", "toCalendar", "timeZone", "Ljava/util/TimeZone;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyCalendarModelImpl extends CalendarModel {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final TimeZone utcTimeZone = null;
    private final int firstDayOfWeek;
    private final List<Pair<String, String>> weekdayNames;

    /* JADX INFO: compiled from: LegacyCalendarModelImpl.jvm.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0010J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/internal/LegacyCalendarModelImpl$Companion;", "", "()V", "utcTimeZone", "Ljava/util/TimeZone;", "getUtcTimeZone$material3_release", "()Ljava/util/TimeZone;", "formatWithPattern", "", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "cache", "", "getCachedSimpleDateFormat", "Ljava/text/SimpleDateFormat;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final String formatWithPattern(long utcTimeMillis, String pattern, Locale locale, Map<String, Object> r9) {
            SimpleDateFormat dateFormat = getCachedSimpleDateFormat(pattern, locale, r9);
            Calendar calendar = Calendar.getInstance(getUtcTimeZone$material3_release());
            calendar.setTimeInMillis(utcTimeMillis);
            return dateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        }

        public final TimeZone getUtcTimeZone$material3_release() {
            return LegacyCalendarModelImpl.access$getUtcTimeZone$cp();
        }

        private final SimpleDateFormat getCachedSimpleDateFormat(String r8, Locale r9, Map<String, Object> r10) {
            String r0 = r8 + r9.toLanguageTag();
            Object r3 = r10.get(r0);
            if (r3 != null) goto L5;
            SimpleDateFormat r5 = new SimpleDateFormat(r8, r9);
            r5.setTimeZone(LegacyCalendarModelImpl.Companion.getUtcTimeZone$material3_release());
            r10.put(r0, r5);
            Object r6 = r5;
        L7:
            return (SimpleDateFormat) r6;
        L5:
            r6 = r3;
            goto L7
        }
    }

    public static final /* synthetic */ TimeZone access$getUtcTimeZone$cp() {
        return utcTimeZone;
    }

    public LegacyCalendarModelImpl(Locale locale) {
        super(locale);
        this.firstDayOfWeek = dayInISO8601(Calendar.getInstance(locale).getFirstDayOfWeek());
        List $this$weekdayNames_u24lambda_u241 = CollectionsKt.createListBuilder();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List $this$fastForEachIndexed$iv = ArraysKt.drop(weekdays, 2);
        int index$iv = 0;
        int r10 = $this$fastForEachIndexed$iv.size();
    L3:
        if (index$iv >= r10) goto L5;
        Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
        String day = (String) item$iv;
        int index = index$iv;
        $this$weekdayNames_u24lambda_u241.add(new Pair(day, shortWeekdays[index + 2]));
        index$iv = index$iv + 1;
        goto L3
    L5:
        $this$weekdayNames_u24lambda_u241.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.weekdayNames = CollectionsKt.build($this$weekdayNames_u24lambda_u241);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getToday() {
        Calendar systemCalendar = Calendar.getInstance();
        systemCalendar.set(11, 0);
        systemCalendar.set(12, 0);
        systemCalendar.set(13, 0);
        systemCalendar.set(14, 0);
        int utcOffset = systemCalendar.get(15) + systemCalendar.get(16);
        return new CalendarDate(systemCalendar.get(1), 1 + systemCalendar.get(2), systemCalendar.get(5), systemCalendar.getTimeInMillis() + ((long) utcOffset));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public List<Pair<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public DateInputFormat getDateInputFormat(Locale locale) {
        DateFormat r0 = DateFormat.getDateInstance(3, locale);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return CalendarModelKt.datePatternAsInputFormat(((SimpleDateFormat) r0).toPattern());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate getCanonicalDate(long timeInMillis) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(timeInMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(long timeInMillis) {
        Calendar firstDayCalendar = Calendar.getInstance(utcTimeZone);
        firstDayCalendar.setTimeInMillis(timeInMillis);
        firstDayCalendar.set(5, 1);
        firstDayCalendar.set(11, 0);
        firstDayCalendar.set(12, 0);
        firstDayCalendar.set(13, 0);
        firstDayCalendar.set(14, 0);
        return getMonth(firstDayCalendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(CalendarDate date) {
        return getMonth(date.getYear(), date.getMonth());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth getMonth(int year, int month) {
        Calendar firstDayCalendar = Calendar.getInstance(utcTimeZone);
        firstDayCalendar.clear();
        firstDayCalendar.set(1, year);
        firstDayCalendar.set(2, month - 1);
        firstDayCalendar.set(5, 1);
        return getMonth(firstDayCalendar);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public int getDayOfWeek(CalendarDate date) {
        return dayInISO8601(toCalendar(date, TimeZone.getDefault()).get(7));
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth plusMonths(CalendarMonth from, int addedMonthsCount) {
        if (addedMonthsCount > 0) goto L4;
        return from;
    L4:
        Calendar laterMonth = toCalendar(from);
        laterMonth.add(2, addedMonthsCount);
        return getMonth(laterMonth);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarMonth minusMonths(CalendarMonth from, int subtractedMonthsCount) {
        if (subtractedMonthsCount > 0) goto L4;
        return from;
    L4:
        Calendar earlierMonth = toCalendar(from);
        earlierMonth.add(2, -subtractedMonthsCount);
        return getMonth(earlierMonth);
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public String formatWithPattern(long utcTimeMillis, String pattern, Locale locale) {
        return Companion.formatWithPattern(utcTimeMillis, pattern, locale, getFormatterCache$material3_release());
    }

    @Override // androidx.compose.material3.internal.CalendarModel
    public CalendarDate parse(String date, String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setTimeZone(utcTimeZone);
        dateFormat.setLenient(false);
        Date parsedDate = dateFormat.parse(date);     // Catch: ParseException -> L8
        if (parsedDate != null) goto L6;
        return null;
    L6:
        Calendar calendar = Calendar.getInstance(utcTimeZone);     // Catch: ParseException -> L8
        calendar.setTime(parsedDate);     // Catch: ParseException -> L8
        return new CalendarDate(calendar.get(1), 1 + calendar.get(2), calendar.get(5), calendar.getTimeInMillis());
    L9:
        return null;
    }

    public String toString() {
        return "LegacyCalendarModel";
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        utcTimeZone = TimeZone.getTimeZone("UTC");
    }

    private final int dayInISO8601(int day) {
        int shiftedDay = (day + 6) % 7;
        if (shiftedDay != 0) goto L5;
        return 7;
    L5:
        return shiftedDay;
    }

    private final CalendarMonth getMonth(Calendar firstDayCalendar) {
        int difference = dayInISO8601(firstDayCalendar.get(7)) - getFirstDayOfWeek();
        if (difference >= 0) goto L5;
        int r1 = difference + 7;
    L6:
        int daysFromStartOfWeekToFirstOfMonth = r1;
        return new CalendarMonth(firstDayCalendar.get(1), firstDayCalendar.get(2) + 1, firstDayCalendar.getActualMaximum(5), daysFromStartOfWeekToFirstOfMonth, firstDayCalendar.getTimeInMillis());
    L5:
        r1 = difference;
        goto L6
    }

    private final Calendar toCalendar(CalendarMonth $this$toCalendar) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis($this$toCalendar.getStartUtcTimeMillis());
        return calendar;
    }

    private final Calendar toCalendar(CalendarDate $this$toCalendar, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, $this$toCalendar.getYear());
        calendar.set(2, $this$toCalendar.getMonth() - 1);
        calendar.set(5, $this$toCalendar.getDayOfMonth());
        return calendar;
    }
}
