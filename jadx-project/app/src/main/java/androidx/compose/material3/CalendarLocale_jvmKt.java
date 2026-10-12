package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: CalendarLocale.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\u001a*\u0010\n\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\n\u0010\u000b\"\u00020\f2\u00020\f¨\u0006\r"}, d2 = {"cachedFormatters", "Ljava/util/WeakHashMap;", "", "Ljava/text/NumberFormat;", "getCachedDateTimeFormatter", "minDigits", "", "maxDigits", "isGroupingUsed", "", "toLocalString", "CalendarLocale", "Ljava/util/Locale;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CalendarLocale_jvmKt {
    private static final WeakHashMap<String, NumberFormat> cachedFormatters = null;

    public static /* synthetic */ String toLocalString$default(int r0, int r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 1;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 40;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = false;
    L12:
        return toLocalString(r0, r1, r2, r3);
    }

    public static final String toLocalString(int $this$toLocalString, int minDigits, int maxDigits, boolean isGroupingUsed) {
        return getCachedDateTimeFormatter(minDigits, maxDigits, isGroupingUsed).format(Integer.valueOf($this$toLocalString));
    }

    static {
        cachedFormatters = new WeakHashMap();
    }

    private static final NumberFormat getCachedDateTimeFormatter(int minDigits, int maxDigits, boolean isGroupingUsed) {
        String key = minDigits + '.' + maxDigits + '.' + isGroupingUsed + '.' + Locale.getDefault().toLanguageTag();
        Map $this$getOrPut$iv = cachedFormatters;
        NumberFormat r3 = $this$getOrPut$iv.get(key);
        if (r3 != null) goto L5;
        NumberFormat $this$getCachedDateTimeFormatter_u24lambda_u241_u24lambda_u240 = NumberFormat.getIntegerInstance();
        $this$getCachedDateTimeFormatter_u24lambda_u241_u24lambda_u240.setGroupingUsed(isGroupingUsed);
        $this$getCachedDateTimeFormatter_u24lambda_u241_u24lambda_u240.setMinimumIntegerDigits(minDigits);
        $this$getCachedDateTimeFormatter_u24lambda_u241_u24lambda_u240.setMaximumIntegerDigits(maxDigits);
        $this$getOrPut$iv.put(key, $this$getCachedDateTimeFormatter_u24lambda_u241_u24lambda_u240);
    L7:
        return $this$getCachedDateTimeFormatter_u24lambda_u241_u24lambda_u240;
    L5:
        $this$getCachedDateTimeFormatter_u24lambda_u241_u24lambda_u240 = r3;
        goto L7
    }
}
