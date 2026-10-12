package androidx.compose.material3.internal;

import android.text.format.DateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: CalendarModel.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0000\u001a8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bH\u0000¨\u0006\r"}, d2 = {"createCalendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "formatWithSkeleton", "", "utcTimeMillis", "", "skeleton", "cache", "", "", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CalendarModel_androidKt {
    public static final CalendarModel createCalendarModel(Locale locale) {
        return new CalendarModelImpl(locale);
    }

    public static final String formatWithSkeleton(long utcTimeMillis, String skeleton, Locale locale, Map<String, Object> r11) {
        String r0 = "S:" + skeleton + locale.toLanguageTag();
        Object value$iv = r11.get(r0);
        if (value$iv != null) goto L5;
        Object answer$iv = DateFormat.getBestDateTimePattern(locale, skeleton);
        r11.put(r0, answer$iv);
    L6:
        String pattern = answer$iv.toString();
        return CalendarModelImpl.Companion.formatWithPattern(utcTimeMillis, pattern, locale, r11);
    L5:
        answer$iv = value$iv;
        goto L6
    }
}
