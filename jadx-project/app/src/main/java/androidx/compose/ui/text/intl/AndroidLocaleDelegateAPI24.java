package androidx.compose.ui.text.intl;

import android.util.Log;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidLocaleDelegate.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "()V", "current", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "lastLocaleList", "lastPlatformLocaleList", "Landroid/os/LocaleList;", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "parseLanguageTag", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "languageTag", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    public static final int $stable = 0;
    private LocaleList lastLocaleList;
    private android.os.LocaleList lastPlatformLocaleList;
    private final SynchronizedObject lock;

    static {
        $stable = 8;
    }

    public AndroidLocaleDelegateAPI24() {
        this.lock = new SynchronizedObject();
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public LocaleList getCurrent() {
        android.os.LocaleList platformLocaleList = android.os.LocaleList.getDefault();
        SynchronizedObject r1 = this.lock;
        monitor-enter(r1);
        LocaleList r3 = this.lastLocaleList;     // Catch: Throwable -> L18
        if (r3 != null) goto L8;
    L12:
        int r4 = platformLocaleList.size();     // Catch: Throwable -> L18
        ArrayList r5 = new ArrayList(r4);     // Catch: Throwable -> L18
        int r6 = 0;
    L13:
        if (r6 >= r4) goto L15;
        int position = r6;
        r5.add(new Locale(platformLocaleList.get(position)));     // Catch: Throwable -> L18
        r6 = r6 + 1;     // Catch: Throwable -> L18
        goto L13
    L15:
        LocaleList localeList = new LocaleList(r5);     // Catch: Throwable -> L18
        this.lastPlatformLocaleList = platformLocaleList;     // Catch: Throwable -> L18
        this.lastLocaleList = localeList;     // Catch: Throwable -> L18
        monitor-exit(r1);
        return localeList;
    L8:
        if (platformLocaleList != this.lastPlatformLocaleList) goto L12;
        monitor-exit(r1);
        return r3;
    L18:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public java.util.Locale parseLanguageTag(String languageTag) {
        java.util.Locale platformLocale = java.util.Locale.forLanguageTag(languageTag);
        if (Intrinsics.areEqual(platformLocale.toLanguageTag(), "und") == false) goto L5;
        Log.e(AndroidLocaleDelegate_androidKt.access$getTAG$p(), "The language tag " + languageTag + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
    L5:
        return platformLocale;
    }
}
