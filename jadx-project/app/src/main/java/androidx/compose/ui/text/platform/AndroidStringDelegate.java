package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: AndroidStringDelegate.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001c\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "()V", "capitalize", "", "string", "locale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    static {
    }

    public AndroidStringDelegate() {
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toUpperCase(String string, Locale locale) {
        String r0 = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(r0, "toUpperCase(...)");
        return r0;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toLowerCase(String string, Locale locale) {
        String r0 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(r0, "toLowerCase(...)");
        return r0;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String capitalize(String string, Locale locale) {
        if (string.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L13;
        StringBuilder r1 = new StringBuilder();
        char it = string.charAt(0);
        if (Character.isLowerCase(it) == false) goto L10;
        String r4 = CharsKt.titlecase(it, locale);
    L11:
        StringBuilder r2 = r1.append(r4);
        String r3 = string.substring(1);
        Intrinsics.checkNotNullExpressionValue(r3, "substring(...)");
        return r2.append(r3).toString();
    L10:
        r4 = String.valueOf(it);
        goto L11
    L13:
        return string;
    L5:
        r0 = false;
        goto L6
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String decapitalize(String string, Locale locale) {
        if (string.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        StringBuilder r1 = new StringBuilder();
        char it = string.charAt(0);
        StringBuilder r2 = r1.append(CharsKt.lowercase(it, locale));
        String r3 = string.substring(1);
        Intrinsics.checkNotNullExpressionValue(r3, "substring(...)");
        return r2.append(r3).toString();
    L9:
        return string;
    L5:
        r0 = false;
        goto L6
    }
}
