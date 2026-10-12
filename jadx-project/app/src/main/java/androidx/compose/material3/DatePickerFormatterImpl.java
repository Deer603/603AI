package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0096\u0002J-\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0018J%\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/DatePickerFormatterImpl;", "Landroidx/compose/material3/DatePickerFormatter;", "yearSelectionSkeleton", "", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "formatterCache", "", "", "getSelectedDateDescriptionSkeleton", "()Ljava/lang/String;", "getSelectedDateSkeleton", "getYearSelectionSkeleton", "equals", "", "other", "formatDate", "dateMillis", "", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "forContentDescription", "(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;", "formatMonthYear", "monthMillis", "(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DatePickerFormatterImpl implements DatePickerFormatter {
    private final Map<String, Object> formatterCache;
    private final String selectedDateDescriptionSkeleton;
    private final String selectedDateSkeleton;
    private final String yearSelectionSkeleton;

    public DatePickerFormatterImpl(String yearSelectionSkeleton, String selectedDateSkeleton, String selectedDateDescriptionSkeleton) {
        this.yearSelectionSkeleton = yearSelectionSkeleton;
        this.selectedDateSkeleton = selectedDateSkeleton;
        this.selectedDateDescriptionSkeleton = selectedDateDescriptionSkeleton;
        this.formatterCache = new LinkedHashMap();
    }

    public final String getYearSelectionSkeleton() {
        return this.yearSelectionSkeleton;
    }

    public final String getSelectedDateSkeleton() {
        return this.selectedDateSkeleton;
    }

    public final String getSelectedDateDescriptionSkeleton() {
        return this.selectedDateDescriptionSkeleton;
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatMonthYear(Long monthMillis, Locale locale) {
        if (monthMillis != null) goto L6;
        return null;
    L6:
        return CalendarModel_androidKt.formatWithSkeleton(monthMillis.longValue(), this.yearSelectionSkeleton, locale, this.formatterCache);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatDate(Long dateMillis, Locale locale, boolean forContentDescription) {
        if (dateMillis != null) goto L5;
        return null;
    L5:
        long r0 = dateMillis.longValue();
        if (forContentDescription == false) goto L8;
        String r2 = this.selectedDateDescriptionSkeleton;
    L10:
        return CalendarModel_androidKt.formatWithSkeleton(r0, r2, locale, this.formatterCache);
    L8:
        r2 = this.selectedDateSkeleton;
        goto L10
    }

    public boolean equals(Object other) {
        if ((other instanceof DatePickerFormatterImpl) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(this.yearSelectionSkeleton, ((DatePickerFormatterImpl) other).yearSelectionSkeleton) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.selectedDateSkeleton, ((DatePickerFormatterImpl) other).selectedDateSkeleton) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.selectedDateDescriptionSkeleton, ((DatePickerFormatterImpl) other).selectedDateDescriptionSkeleton) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = this.yearSelectionSkeleton.hashCode();
        int result2 = (result * 31) + this.selectedDateSkeleton.hashCode();
        return (result2 * 31) + this.selectedDateDescriptionSkeleton.hashCode();
    }
}
