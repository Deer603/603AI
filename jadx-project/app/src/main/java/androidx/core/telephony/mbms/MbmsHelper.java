package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.telephony.mbms.ServiceInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class MbmsHelper {

    static class Api28Impl {
        private Api28Impl() {
        }

        static CharSequence getBestNameForService(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty() == false) goto L5;
            return null;
        L5:
            String[] supportedLanguages = new String[namedContentLocales.size()];
            int i = 0;
            Iterator r4 = serviceInfo.getNamedContentLocales().iterator();
        L7:
            if (r4.hasNext() == false) goto L9;
            Locale l = (Locale) r4.next();
            supportedLanguages[i] = l.toLanguageTag();
            i = i + 1;
            goto L7
        L9:
            LocaleList localeList = context.getResources().getConfiguration().getLocales();
            Locale bestLocale = localeList.getFirstMatch(supportedLanguages);
            if (bestLocale != null) goto L13;
            return null;
        L13:
            return serviceInfo.getNameForLocale(bestLocale);
        }
    }

    private MbmsHelper() {
    }

    public static CharSequence getBestNameForService(Context context, ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return null;
    L5:
        return Api28Impl.getBestNameForService(context, serviceInfo);
    }
}
