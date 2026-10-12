package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EditorInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LocaleListHelper;", "", "()V", "setHintLocales", "", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LocaleListHelper {
    public static final int $stable = 0;
    public static final LocaleListHelper INSTANCE = null;

    static {
        INSTANCE = new LocaleListHelper();
    }

    private LocaleListHelper() {
    }

    public final void setHintLocales(EditorInfo editorInfo, LocaleList localeList) {
        if (Intrinsics.areEqual(localeList, LocaleList.Companion.getEmpty()) == false) goto L5;
        editorInfo.hintLocales = null;
        return;
    L5:
        LocaleList $this$map$iv = localeList;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Locale> r5 = $this$map$iv.iterator();
    L7:
        if (r5.hasNext() == false) goto L9;
        Object item$iv$iv = r5.next();
        Locale it = (Locale) item$iv$iv;
        destination$iv$iv.add(it.getPlatformLocale());
        goto L7
    L9:
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        java.util.Locale[] r0 = (java.util.Locale[]) $this$toTypedArray$iv.toArray(new java.util.Locale[0]);
        editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(r0, r0.length));
    }
}
