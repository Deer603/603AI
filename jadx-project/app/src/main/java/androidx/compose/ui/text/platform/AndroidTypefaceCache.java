package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.collection.SieveCache;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "Duplicate cache")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "()V", "cache", "Landroidx/collection/SieveCache;", "", "Landroid/graphics/Typeface;", "getKey", "context", "Landroid/content/Context;", "font", "Landroidx/compose/ui/text/font/Font;", "getOrCreate", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidTypefaceCache {
    public static final int $stable = 0;
    public static final AndroidTypefaceCache INSTANCE = null;
    private static final SieveCache<String, Typeface> cache = null;

    private AndroidTypefaceCache() {
    }

    static {
        INSTANCE = new AndroidTypefaceCache();
        cache = new SieveCache(16, 16, null, null, null, 28, null);
        $stable = 8;
    }

    public final Typeface getOrCreate(Context context, Font font) {
        String key = getKey(context, font);
        if (key == null) goto L10;
        Typeface it = cache.get(key);
        if (it == null) goto L10;
        return it;
    L10:
        if ((font instanceof ResourceFont) == false) goto L13;
        Typeface typeface = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
    L15:
        if (typeface == null) goto L20;
        if (key == null) goto L18;
        cache.put(key, typeface);
    L18:
        return typeface;
    L20:
        throw new IllegalArgumentException("Unable to load font " + font);
    L13:
        if ((font instanceof AndroidFont) == false) goto L22;
        typeface = ((AndroidFont) font).getTypefaceLoader().loadBlocking(context, (AndroidFont) font);
        goto L15
    L22:
        throw new IllegalArgumentException("Unknown font type: " + font);
    }

    private final String getKey(Context context, Font font) {
        if ((font instanceof ResourceFont) == false) goto L10;
        TypedValue value = new TypedValue();
        context.getResources().getValue(((ResourceFont) font).getResId(), value, true);
        StringBuilder r1 = new StringBuilder().append("res:");
        CharSequence r2 = value.string;
        if (r2 == null) goto L7;
        String r3 = r2.toString();
    L8:
        Intrinsics.checkNotNull(r3);
        return r1.append(r3).toString();
    L7:
        r3 = null;
        goto L8
    L10:
        if ((font instanceof AndroidPreloadedFont) == false) goto L14;
        return ((AndroidPreloadedFont) font).getCacheKey();
    L14:
        throw new IllegalArgumentException("Unknown font type: " + font);
    }
}
