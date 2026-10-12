package androidx.compose.ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: LocaleExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods;", "", "()V", "localeSpan", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setTextLocales", "", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LocaleListHelperMethods {
    public static final int $stable = 0;
    public static final LocaleListHelperMethods INSTANCE = null;

    static {
        INSTANCE = new LocaleListHelperMethods();
    }

    private LocaleListHelperMethods() {
    }

    public final Object localeSpan(LocaleList localeList) {
        LocaleList $this$map$iv = localeList;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Locale> r5 = $this$map$iv.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        Object item$iv$iv = r5.next();
        Locale it = (Locale) item$iv$iv;
        destination$iv$iv.add(it.getPlatformLocale());
        goto L4
    L6:
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        java.util.Locale[] r0 = (java.util.Locale[]) $this$toTypedArray$iv.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(r0, r0.length)));
    }

    public final void setTextLocales(AndroidTextPaint textPaint, LocaleList localeList) {
        LocaleList $this$map$iv = localeList;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Locale> r5 = $this$map$iv.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        Object item$iv$iv = r5.next();
        Locale it = (Locale) item$iv$iv;
        destination$iv$iv.add(it.getPlatformLocale());
        goto L4
    L6:
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        java.util.Locale[] r0 = (java.util.Locale[]) $this$toTypedArray$iv.toArray(new java.util.Locale[0]);
        textPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(r0, r0.length)));
    }
}
