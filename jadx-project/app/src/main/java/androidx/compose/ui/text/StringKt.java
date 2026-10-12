package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"stringDelegate", "Landroidx/compose/ui/text/PlatformStringDelegate;", "capitalize", "", "locale", "Landroidx/compose/ui/text/intl/Locale;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringKt {
    private static final PlatformStringDelegate stringDelegate = null;

    public static final String toUpperCase(String $this$toUpperCase, Locale locale) {
        return stringDelegate.toUpperCase($this$toUpperCase, locale.getPlatformLocale());
    }

    public static final String toLowerCase(String $this$toLowerCase, Locale locale) {
        return stringDelegate.toLowerCase($this$toLowerCase, locale.getPlatformLocale());
    }

    public static final String capitalize(String $this$capitalize, Locale locale) {
        return stringDelegate.capitalize($this$capitalize, locale.getPlatformLocale());
    }

    public static final String decapitalize(String $this$decapitalize, Locale locale) {
        return stringDelegate.decapitalize($this$decapitalize, locale.getPlatformLocale());
    }

    public static final String toUpperCase(String $this$toUpperCase, LocaleList localeList) {
        if (localeList.isEmpty() == false) goto L5;
        Locale r0 = Locale.Companion.getCurrent();
    L7:
        return toUpperCase($this$toUpperCase, r0);
    L5:
        r0 = localeList.get(0);
        goto L7
    }

    public static final String toLowerCase(String $this$toLowerCase, LocaleList localeList) {
        if (localeList.isEmpty() == false) goto L5;
        Locale r0 = Locale.Companion.getCurrent();
    L7:
        return toLowerCase($this$toLowerCase, r0);
    L5:
        r0 = localeList.get(0);
        goto L7
    }

    public static final String capitalize(String $this$capitalize, LocaleList localeList) {
        if (localeList.isEmpty() == false) goto L5;
        Locale r0 = Locale.Companion.getCurrent();
    L7:
        return capitalize($this$capitalize, r0);
    L5:
        r0 = localeList.get(0);
        goto L7
    }

    public static final String decapitalize(String $this$decapitalize, LocaleList localeList) {
        if (localeList.isEmpty() == false) goto L5;
        Locale r0 = Locale.Companion.getCurrent();
    L7:
        return decapitalize($this$decapitalize, r0);
    L5:
        r0 = localeList.get(0);
        goto L7
    }

    static {
        stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();
    }
}
