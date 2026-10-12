package androidx.compose.material3.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J$\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H&J$\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\f2\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004J$\u0010\u001e\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\f2\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001cH&J\u0016\u0010%\u001a\u00020&2\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H&J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0012H&J\u0010\u0010(\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u0012H&J\u0018\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H&J\u0010\u0010(\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH&J\u0018\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u0007H&J\u001a\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH&J\u0018\u0010.\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u0007H&R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00170\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u00060"}, d2 = {"Landroidx/compose/material3/internal/CalendarModel;", "", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Ljava/util/Locale;)V", "firstDayOfWeek", "", "getFirstDayOfWeek", "()I", "formatterCache", "", "", "getFormatterCache$material3_release", "()Ljava/util/Map;", "getLocale", "()Ljava/util/Locale;", "today", "Landroidx/compose/material3/internal/CalendarDate;", "getToday", "()Landroidx/compose/material3/internal/CalendarDate;", "weekdayNames", "", "Lkotlin/Pair;", "getWeekdayNames", "()Ljava/util/List;", "formatWithPattern", "utcTimeMillis", "", "pattern", "formatWithSkeleton", "date", "skeleton", "month", "Landroidx/compose/material3/internal/CalendarMonth;", "getCanonicalDate", "timeInMillis", "getDateInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "getDayOfWeek", "getMonth", "year", "minusMonths", "from", "subtractedMonthsCount", "parse", "plusMonths", "addedMonthsCount", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CalendarModel {
    public static final int $stable = 0;
    private final Map<String, Object> formatterCache;
    private final Locale locale;

    static {
        $stable = 8;
    }

    public abstract String formatWithPattern(long r1, String r3, Locale r4);

    public abstract CalendarDate getCanonicalDate(long r1);

    public abstract DateInputFormat getDateInputFormat(Locale r1);

    public abstract int getDayOfWeek(CalendarDate r1);

    public abstract int getFirstDayOfWeek();

    public abstract CalendarMonth getMonth(int r1, int r2);

    public abstract CalendarMonth getMonth(long r1);

    public abstract CalendarMonth getMonth(CalendarDate r1);

    public abstract CalendarDate getToday();

    public abstract List<Pair<String, String>> getWeekdayNames();

    public abstract CalendarMonth minusMonths(CalendarMonth r1, int r2);

    public abstract CalendarDate parse(String r1, String r2);

    public abstract CalendarMonth plusMonths(CalendarMonth r1, int r2);

    public CalendarModel(Locale locale) {
        this.locale = locale;
        this.formatterCache = new LinkedHashMap();
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Map<String, Object> getFormatterCache$material3_release() {
        return this.formatterCache;
    }

    public static /* synthetic */ DateInputFormat getDateInputFormat$default(CalendarModel r0, Locale r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = r0.locale;
    L7:
        return r0.getDateInputFormat(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel r0, CalendarMonth r1, String r2, Locale r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = r0.locale;
    L7:
        return r0.formatWithSkeleton(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
    }

    public final String formatWithSkeleton(CalendarMonth month, String skeleton, Locale locale) {
        return CalendarModel_androidKt.formatWithSkeleton(month.getStartUtcTimeMillis(), skeleton, locale, this.formatterCache);
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel r0, CalendarDate r1, String r2, Locale r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = r0.locale;
    L7:
        return r0.formatWithSkeleton(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
    }

    public final String formatWithSkeleton(CalendarDate date, String skeleton, Locale locale) {
        return CalendarModel_androidKt.formatWithSkeleton(date.getUtcTimeMillis(), skeleton, locale, this.formatterCache);
    }
}
