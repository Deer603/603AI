package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class LocaleManagerCompat {

    static class Api21Impl {
        private Api21Impl() {
        }

        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static LocaleListCompat getLocales(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static LocaleList localeManagerGetSystemLocales(Object localeManager) {
            LocaleManager mLocaleManager = (LocaleManager) localeManager;
            return mLocaleManager.getSystemLocales();
        }

        static LocaleList localeManagerGetApplicationLocales(Object localeManager) {
            LocaleManager mLocaleManager = (LocaleManager) localeManager;
            return mLocaleManager.getApplicationLocales();
        }
    }

    private LocaleManagerCompat() {
    }

    public static LocaleListCompat getSystemLocales(Context context) {
        LocaleListCompat systemLocales = LocaleListCompat.getEmptyLocaleList();
        if (Build.VERSION.SDK_INT < 33) goto L8;
        Object localeManager = getLocaleManagerForApplication(context);
        if (localeManager == null) goto L11;
        LocaleListCompat systemLocales2 = LocaleListCompat.wrap(Api33Impl.localeManagerGetSystemLocales(localeManager));
        return systemLocales2;
    L11:
        return systemLocales;
    L8:
        LocaleListCompat systemLocales3 = getConfigurationLocales(Resources.getSystem().getConfiguration());
        return systemLocales3;
    }

    public static LocaleListCompat getApplicationLocales(Context context) {
        if (Build.VERSION.SDK_INT < 33) goto L11;
        Object localeManager = getLocaleManagerForApplication(context);
        if (localeManager == null) goto L9;
        return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManager));
    L9:
        return LocaleListCompat.getEmptyLocaleList();
    L11:
        return LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
    }

    private static Object getLocaleManagerForApplication(Context context) {
        return context.getSystemService("locale");
    }

    static LocaleListCompat getConfigurationLocales(Configuration conf) {
        return Api24Impl.getLocales(conf);
    }
}
