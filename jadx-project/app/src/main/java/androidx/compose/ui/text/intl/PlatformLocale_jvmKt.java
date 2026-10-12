package androidx.compose.ui.text.intl;

import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformLocale.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\n\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000\"\u001c\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u001c\u0010\b\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005*\n\u0010\u000b\"\u00020\u00022\u00020\u0002¨\u0006\f"}, d2 = {"language", "", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "getLanguage", "(Ljava/util/Locale;)Ljava/lang/String;", "region", "getRegion", "script", "getScript", "getLanguageTag", "PlatformLocale", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PlatformLocale_jvmKt {
    public static final String getLanguage(java.util.Locale $this$language) {
        return $this$language.getLanguage();
    }

    public static final String getScript(java.util.Locale $this$script) {
        return $this$script.getScript();
    }

    public static final String getRegion(java.util.Locale $this$region) {
        return $this$region.getCountry();
    }

    public static final String getLanguageTag(java.util.Locale $this$getLanguageTag) {
        return $this$getLanguageTag.toLanguageTag();
    }
}
