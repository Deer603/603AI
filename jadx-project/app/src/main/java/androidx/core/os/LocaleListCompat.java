package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import androidx.core.text.ICUCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class LocaleListCompat {
    private static final LocaleListCompat sEmptyLocaleList = null;
    private final LocaleListInterface mImpl;

    static class Api21Impl {
        private static final Locale[] PSEUDO_LOCALE = null;

        private Api21Impl() {
        }

        static boolean matchesLanguageAndScript(Locale supported, Locale desired) {
            if (supported.equals(desired) == false) goto L6;
            return true;
        L6:
            if (supported.getLanguage().equals(desired.getLanguage()) == true) goto L9;
            return false;
        L9:
            if (isPseudoLocale(supported) == false) goto L11;
        L24:
            return false;
        L11:
            if (isPseudoLocale(desired) == true) goto L24;
            String supportedScr = ICUCompat.maximizeAndGetScript(supported);
            if (supportedScr.isEmpty() == false) goto L22;
            String supportedRegion = supported.getCountry();
            if (supportedRegion.isEmpty() == false) goto L18;
            return true;
        L18:
            if (supportedRegion.equals(desired.getCountry()) == false) goto L21;
            return true;
        L21:
            return false;
        L22:
            String desiredScr = ICUCompat.maximizeAndGetScript(desired);
            return supportedScr.equals(desiredScr);
        }

        static {
            PSEUDO_LOCALE = new Locale[]{new Locale("en", "XA"), new Locale("ar", "XB")};
        }

        private static boolean isPseudoLocale(Locale locale) {
            Locale[] r0 = PSEUDO_LOCALE;
            int r1 = r0.length;
            int r3 = 0;
        L3:
            if (r3 >= r1) goto L9;
            Locale pseudoLocale = r0[r3];
            if (pseudoLocale.equals(locale) == true) goto L6;
            r3 = r3 + 1;
            goto L3
        L6:
            return true;
        L9:
            return false;
        }

        static Locale forLanguageTag(String languageTag) {
            return Locale.forLanguageTag(languageTag);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static LocaleList createLocaleList(Locale... list) {
            return new LocaleList(list);
        }

        static LocaleList getAdjustedDefault() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList getDefault() {
            return LocaleList.getDefault();
        }
    }

    static {
        sEmptyLocaleList = create(new Locale[0]);
    }

    private LocaleListCompat(LocaleListInterface impl) {
        this.mImpl = impl;
    }

    @Deprecated
    public static LocaleListCompat wrap(Object localeList) {
        return wrap((LocaleList) localeList);
    }

    public static LocaleListCompat wrap(LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    public Object unwrap() {
        return this.mImpl.getLocaleList();
    }

    public static LocaleListCompat create(Locale... localeList) {
        return wrap(Api24Impl.createLocaleList(localeList));
    }

    public Locale get(int index) {
        return this.mImpl.get(index);
    }

    public boolean isEmpty() {
        return this.mImpl.isEmpty();
    }

    public int size() {
        return this.mImpl.size();
    }

    public int indexOf(Locale locale) {
        return this.mImpl.indexOf(locale);
    }

    public String toLanguageTags() {
        return this.mImpl.toLanguageTags();
    }

    public Locale getFirstMatch(String[] supportedLocales) {
        return this.mImpl.getFirstMatch(supportedLocales);
    }

    public static LocaleListCompat getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    public static LocaleListCompat forLanguageTags(String list) {
        if (list == null) goto L13;
        if (list.isEmpty() == true) goto L13;
        String[] tags = list.split(",", -1);
        Locale[] localeArray = new Locale[tags.length];
        int i = 0;
    L8:
        if (i >= localeArray.length) goto L11;
        localeArray[i] = Api21Impl.forLanguageTag(tags[i]);
        i = i + 1;
        goto L8
    L11:
        return create(localeArray);
    L13:
        return getEmptyLocaleList();
    }

    static Locale forLanguageTagCompat(String str) {
        if (str.contains("-") == false) goto L18;
        String[] args = str.split("-", -1);
        if (args.length <= 2) goto L9;
        return new Locale(args[0], args[1], args[2]);
    L9:
        if (args.length <= 1) goto L13;
        return new Locale(args[0], args[1]);
    L13:
        if (args.length != 1) goto L33;
        return new Locale(args[0]);
    L33:
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    L18:
        if (str.contains("_") == false) goto L35;
        String[] args2 = str.split("_", -1);
        if (args2.length <= 2) goto L24;
        return new Locale(args2[0], args2[1], args2[2]);
    L24:
        if (args2.length <= 1) goto L28;
        return new Locale(args2[0], args2[1]);
    L28:
        if (args2.length != 1) goto L33;
        return new Locale(args2[0]);
    L35:
        return new Locale(str);
    }

    public static LocaleListCompat getAdjustedDefault() {
        return wrap(Api24Impl.getAdjustedDefault());
    }

    public static LocaleListCompat getDefault() {
        return wrap(Api24Impl.getDefault());
    }

    public static boolean matchesLanguageAndScript(Locale supported, Locale desired) {
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return LocaleList.matchesLanguageAndScript(supported, desired);
    L7:
        return Api21Impl.matchesLanguageAndScript(supported, desired);
    }

    public boolean equals(Object other) {
        if ((other instanceof LocaleListCompat) == true) goto L5;
    L7:
        return false;
    L5:
        if (this.mImpl.equals(((LocaleListCompat) other).mImpl) == false) goto L7;
        return true;
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public String toString() {
        return this.mImpl.toString();
    }
}
