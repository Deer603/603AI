package androidx.core.os;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class LocaleListCompatWrapper implements LocaleListInterface {
    private static final Locale EN_LATN = null;
    private static final Locale LOCALE_AR_XB = null;
    private static final Locale LOCALE_EN_XA = null;
    private static final Locale[] sEmptyList = null;
    private final Locale[] mList;
    private final String mStringRepresentation;

    static class Api21Impl {
        private Api21Impl() {
        }

        static String getScript(Locale locale) {
            return locale.getScript();
        }
    }

    static {
        sEmptyList = new Locale[0];
        LOCALE_EN_XA = new Locale("en", "XA");
        LOCALE_AR_XB = new Locale("ar", "XB");
        EN_LATN = LocaleListCompat.forLanguageTagCompat("en-Latn");
    }

    @Override // androidx.core.os.LocaleListInterface
    public Object getLocaleList() {
        return null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int index) {
        if (index >= 0) goto L4;
    L6:
        return null;
    L4:
        if (index >= this.mList.length) goto L6;
        return this.mList[index];
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        if (this.mList.length != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        return this.mList.length;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(Locale locale) {
        int i = 0;
    L4:
        if (i >= this.mList.length) goto L9;
        if (this.mList[i].equals(locale) == true) goto L7;
        i = i + 1;
        goto L4
    L7:
        return i;
    L9:
        return -1;
    }

    public boolean equals(Object other) {
        if (other != this) goto L6;
        return true;
    L6:
        if ((other instanceof LocaleListCompatWrapper) == true) goto L8;
        return false;
    L8:
        Locale[] otherList = ((LocaleListCompatWrapper) other).mList;
        if (this.mList.length == otherList.length) goto L11;
        return false;
    L11:
        int i = 0;
    L13:
        if (i >= this.mList.length) goto L18;
        if (this.mList[i].equals(otherList[i]) == false) goto L16;
        i = i + 1;
        goto L13
    L16:
        return false;
    L18:
        return true;
    }

    public int hashCode() {
        int result = 1;
        Locale[] r1 = this.mList;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        Locale locale = r1[r3];
        result = (result * 31) + locale.hashCode();
        r3 = r3 + 1;
        goto L3
    L5:
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
    L4:
        if (i >= this.mList.length) goto L9;
        sb.append(this.mList[i]);
        if (i >= (this.mList.length - 1)) goto L8;
        sb.append(',');
    L8:
        i = i + 1;
        goto L4
    L9:
        sb.append("]");
        return sb.toString();
    }

    @Override // androidx.core.os.LocaleListInterface
    public String toLanguageTags() {
        return this.mStringRepresentation;
    }

    LocaleListCompatWrapper(Locale... list) {
        if (list.length != 0) goto L5;
        this.mList = sEmptyList;
        this.mStringRepresentation = "";
        return;
    L5:
        List<Locale> localeList = new ArrayList();
        HashSet<Locale> seenLocales = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
    L7:
        if (i >= list.length) goto L19;
        Locale l = list[i];
        if (l == null) goto L18;
        if (seenLocales.contains(l) == true) goto L16;
        Locale localeClone = (Locale) l.clone();
        localeList.add(localeClone);
        toLanguageTag(sb, localeClone);
        if (i >= (list.length - 1)) goto L15;
        sb.append(',');
    L15:
        seenLocales.add(localeClone);
    L16:
        i = i + 1;
        goto L7
    L18:
        throw new NullPointerException("list[" + i + "] is null");
    L19:
        this.mList = (Locale[]) localeList.toArray(new Locale[0]);
        this.mStringRepresentation = sb.toString();
    }

    static void toLanguageTag(StringBuilder builder, Locale locale) {
        builder.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null) goto L5;
        return;
    L5:
        if (country.isEmpty() == true) goto L9;
        builder.append('-');
        builder.append(locale.getCountry());
        return;
    }

    private static String getLikelyScript(Locale locale) {
        String script = Api21Impl.getScript(locale);
        if (script.isEmpty() == true) goto L5;
        return script;
    L5:
        return "";
    }

    private static boolean isPseudoLocale(Locale locale) {
        if (LOCALE_EN_XA.equals(locale) == false) goto L5;
    L8:
        return true;
    L5:
        if (LOCALE_AR_XB.equals(locale) == true) goto L8;
        return false;
    }

    private static int matchScore(Locale r5, Locale r6) {
        if (r5.equals(r6) == false) goto L6;
        return 1;
    L6:
        if (r5.getLanguage().equals(r6.getLanguage()) == true) goto L9;
        return 0;
    L9:
        if (isPseudoLocale(r5) == false) goto L11;
    L25:
        return 0;
    L11:
        if (isPseudoLocale(r6) == true) goto L25;
        String r0 = getLikelyScript(r5);
        if (r0.isEmpty() == false) goto L24;
        String r3 = r5.getCountry();
        if (r3.isEmpty() == false) goto L18;
        return 1;
    L18:
        if (r3.equals(r6.getCountry()) == false) goto L22;
        return 1;
    L22:
        return 0;
    L24:
        return r0.equals(getLikelyScript(r6)) ? 1 : 0;
    }

    private int findFirstMatchIndex(Locale supportedLocale) {
        int idx = 0;
    L4:
        if (idx >= this.mList.length) goto L9;
        int score = matchScore(supportedLocale, this.mList[idx]);
        if (score > 0) goto L7;
        idx = idx + 1;
        goto L4
    L7:
        return idx;
    L9:
        return Integer.MAX_VALUE;
    }

    private int computeFirstMatchIndex(Collection<String> supportedLocales, boolean assumeEnglishIsSupported) {
        if (this.mList.length != 1) goto L6;
        return 0;
    L6:
        if (this.mList.length != 0) goto L9;
        return -1;
    L9:
        int bestIndex = Integer.MAX_VALUE;
        if (assumeEnglishIsSupported == false) goto L16;
        int idx = findFirstMatchIndex(EN_LATN);
        if (idx != 0) goto L14;
        return 0;
    L14:
        if (idx >= Integer.MAX_VALUE) goto L16;
        bestIndex = idx;
    L16:
        Iterator<String> r1 = supportedLocales.iterator();
    L18:
        if (r1.hasNext() == false) goto L26;
        String languageTag = r1.next();
        Locale supportedLocale = LocaleListCompat.forLanguageTagCompat(languageTag);
        int idx2 = findFirstMatchIndex(supportedLocale);
        if (idx2 == 0) goto L21;
        if (idx2 >= bestIndex) goto L18;
        bestIndex = idx2;
        goto L18
    L21:
        return 0;
    L26:
        if (bestIndex != Integer.MAX_VALUE) goto L28;
        return 0;
    L28:
        return bestIndex;
    }

    private Locale computeFirstMatch(Collection<String> supportedLocales, boolean assumeEnglishIsSupported) {
        int bestIndex = computeFirstMatchIndex(supportedLocales, assumeEnglishIsSupported);
        if (bestIndex != (-1)) goto L6;
        return null;
    L6:
        return this.mList[bestIndex];
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale getFirstMatch(String[] supportedLocales) {
        return computeFirstMatch(Arrays.asList(supportedLocales), false);
    }
}
