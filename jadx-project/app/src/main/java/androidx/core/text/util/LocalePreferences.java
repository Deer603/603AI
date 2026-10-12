package androidx.core.text.util;

import android.icu.number.LocalizedNumberFormatter;
import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalePreferences {
    private static final String TAG = null;
    private static final String[] WEATHER_FAHRENHEIT_COUNTRIES = null;

    /* JADX INFO: renamed from: androidx.core.text.util.LocalePreferences$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$icu$text$DateFormat$HourCycle = null;

        static {
            $SwitchMap$android$icu$text$DateFormat$HourCycle = new int[DateFormat.HourCycle.values().length];
            $SwitchMap$android$icu$text$DateFormat$HourCycle[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L22:
            $SwitchMap$android$icu$text$DateFormat$HourCycle[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L18:
            $SwitchMap$android$icu$text$DateFormat$HourCycle[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L16:
            $SwitchMap$android$icu$text$DateFormat$HourCycle[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
            return;
        }
    }

    private static class Api24Impl {
        static String getCalendarType(Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        static Locale getDefaultLocale() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }

        private Api24Impl() {
        }
    }

    private static class Api33Impl {
        static String getResolvedTemperatureUnit(Locale locale) {
            LocalizedNumberFormatter nf = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale);
            String unit = nf.format(1).getOutputUnit().getIdentifier();
            if (unit.startsWith(TemperatureUnit.FAHRENHEIT) == false) goto L5;
            return TemperatureUnit.FAHRENHEIT;
        L5:
            return unit;
        }

        static String getHourCycle(Locale locale) {
            return getHourCycleType(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        private static String getHourCycleType(DateFormat.HourCycle hourCycle) {
            switch(AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle[hourCycle.ordinal()]) {
                case 1: goto L12;
                case 2: goto L10;
                case 3: goto L8;
                case 4: goto L6;
                default: goto L4;
            };
        L4:
            return "";
        L6:
            return HourCycle.H24;
        L8:
            return HourCycle.H23;
        L10:
            return HourCycle.H12;
        L12:
            return HourCycle.H11;
        }

        private Api33Impl() {
        }
    }

    public static class CalendarType {
        public static final String CHINESE = "chinese";
        public static final String DANGI = "dangi";
        public static final String DEFAULT = "";
        public static final String GREGORIAN = "gregorian";
        public static final String HEBREW = "hebrew";
        public static final String INDIAN = "indian";
        public static final String ISLAMIC = "islamic";
        public static final String ISLAMIC_CIVIL = "islamic-civil";
        public static final String ISLAMIC_RGSA = "islamic-rgsa";
        public static final String ISLAMIC_TBLA = "islamic-tbla";
        public static final String ISLAMIC_UMALQURA = "islamic-umalqura";
        public static final String PERSIAN = "persian";
        private static final String U_EXTENSION_TAG = "ca";

        @Retention(RetentionPolicy.SOURCE)
        public @interface CalendarTypes {
        }

        private CalendarType() {
        }
    }

    public static class FirstDayOfWeek {
        public static final String DEFAULT = "";
        public static final String FRIDAY = "fri";
        public static final String MONDAY = "mon";
        public static final String SATURDAY = "sat";
        public static final String SUNDAY = "sun";
        public static final String THURSDAY = "thu";
        public static final String TUESDAY = "tue";
        private static final String U_EXTENSION_TAG = "fw";
        public static final String WEDNESDAY = "wed";

        @Retention(RetentionPolicy.SOURCE)
        public @interface Days {
        }

        private FirstDayOfWeek() {
        }
    }

    public static class HourCycle {
        public static final String DEFAULT = "";
        public static final String H11 = "h11";
        public static final String H12 = "h12";
        public static final String H23 = "h23";
        public static final String H24 = "h24";
        private static final String U_EXTENSION_TAG = "hc";

        @Retention(RetentionPolicy.SOURCE)
        public @interface HourCycleTypes {
        }

        private HourCycle() {
        }
    }

    public static class TemperatureUnit {
        public static final String CELSIUS = "celsius";
        public static final String DEFAULT = "";
        public static final String FAHRENHEIT = "fahrenhe";
        public static final String KELVIN = "kelvin";
        private static final String U_EXTENSION_TAG = "mu";

        @Retention(RetentionPolicy.SOURCE)
        public @interface TemperatureUnits {
        }

        private TemperatureUnit() {
        }
    }

    static {
        TAG = LocalePreferences.class.getSimpleName();
        WEATHER_FAHRENHEIT_COUNTRIES = new String[]{"BS", "BZ", "KY", "PR", "PW", "US"};
    }

    public static String getHourCycle() {
        return getHourCycle(true);
    }

    public static String getHourCycle(Locale locale) {
        return getHourCycle(locale, true);
    }

    public static String getHourCycle(boolean resolved) {
        Locale defaultLocale = Api24Impl.getDefaultLocale();
        return getHourCycle(defaultLocale, resolved);
    }

    public static String getHourCycle(Locale locale, boolean resolved) {
        String result = getUnicodeLocaleType("hc", "", locale, resolved);
        if (result == null) goto L6;
        return result;
    L6:
        if (Build.VERSION.SDK_INT < 33) goto L10;
        return Api33Impl.getHourCycle(locale);
    L10:
        return getBaseHourCycle(locale);
    }

    public static String getCalendarType() {
        return getCalendarType(true);
    }

    public static String getCalendarType(Locale locale) {
        return getCalendarType(locale, true);
    }

    public static String getCalendarType(boolean resolved) {
        Locale defaultLocale = Api24Impl.getDefaultLocale();
        return getCalendarType(defaultLocale, resolved);
    }

    public static String getCalendarType(Locale locale, boolean resolved) {
        String result = getUnicodeLocaleType("ca", "", locale, resolved);
        if (result == null) goto L6;
        return result;
    L6:
        return Api24Impl.getCalendarType(locale);
    }

    public static String getTemperatureUnit() {
        return getTemperatureUnit(true);
    }

    public static String getTemperatureUnit(Locale locale) {
        return getTemperatureUnit(locale, true);
    }

    public static String getTemperatureUnit(boolean resolved) {
        Locale defaultLocale = Api24Impl.getDefaultLocale();
        return getTemperatureUnit(defaultLocale, resolved);
    }

    public static String getTemperatureUnit(Locale locale, boolean resolved) {
        String result = getUnicodeLocaleType("mu", "", locale, resolved);
        if (result == null) goto L6;
        return result;
    L6:
        if (Build.VERSION.SDK_INT < 33) goto L10;
        return Api33Impl.getResolvedTemperatureUnit(locale);
    L10:
        return getTemperatureHardCoded(locale);
    }

    public static String getFirstDayOfWeek() {
        return getFirstDayOfWeek(true);
    }

    public static String getFirstDayOfWeek(Locale locale) {
        return getFirstDayOfWeek(locale, true);
    }

    public static String getFirstDayOfWeek(boolean resolved) {
        Locale defaultLocale = Api24Impl.getDefaultLocale();
        return getFirstDayOfWeek(defaultLocale, resolved);
    }

    public static String getFirstDayOfWeek(Locale locale, boolean resolved) {
        String result = getUnicodeLocaleType("fw", "", locale, resolved);
        if (result == null) goto L6;
        return result;
    L6:
        return getBaseFirstDayOfWeek(locale);
    }

    private static String getUnicodeLocaleType(String tag, String defaultValue, Locale locale, boolean resolved) {
        String ext = locale.getUnicodeLocaleType(tag);
        if (ext == null) goto L5;
        return ext;
    L5:
        if (resolved == true) goto L7;
        return defaultValue;
    L7:
        return null;
    }

    private static String getTemperatureHardCoded(Locale locale) {
        if (Arrays.binarySearch(WEATHER_FAHRENHEIT_COUNTRIES, locale.getCountry()) < 0) goto L5;
        return TemperatureUnit.FAHRENHEIT;
    L5:
        return TemperatureUnit.CELSIUS;
    }

    private static String getBaseHourCycle(Locale locale) {
        String pattern = android.text.format.DateFormat.getBestDateTimePattern(locale, "jm");
        if (pattern.contains("H") == false) goto L5;
        return HourCycle.H23;
    L5:
        return HourCycle.H12;
    }

    private static String getBaseFirstDayOfWeek(Locale locale) {
        return getStringOfFirstDayOfWeek(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    private static String getStringOfFirstDayOfWeek(int fw) {
        String[] arrDays = {FirstDayOfWeek.SUNDAY, FirstDayOfWeek.MONDAY, FirstDayOfWeek.TUESDAY, FirstDayOfWeek.WEDNESDAY, FirstDayOfWeek.THURSDAY, FirstDayOfWeek.FRIDAY, FirstDayOfWeek.SATURDAY};
        if (fw < 1) goto L6;
        if (fw > 7) goto L6;
        return arrDays[fw - 1];
    L6:
        return "";
    }

    private static Locale getDefaultLocale() {
        return Locale.getDefault();
    }

    private LocalePreferences() {
    }
}
