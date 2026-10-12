package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.ListUtilsKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformTypefaces.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0014\u0010\r\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceCompatApi26;", "", "()V", "threadLocalPaint", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "setFontVariationSettings", "Landroid/graphics/Typeface;", "typeface", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "toAndroidString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TypefaceCompatApi26 {
    public static final TypefaceCompatApi26 INSTANCE = null;
    private static ThreadLocal<Paint> threadLocalPaint;

    private TypefaceCompatApi26() {
    }

    static {
        INSTANCE = new TypefaceCompatApi26();
        threadLocalPaint = new ThreadLocal();
    }

    public final android.graphics.Typeface setFontVariationSettings(android.graphics.Typeface typeface, FontVariation.Settings variationSettings, Context context) {
        if (typeface != null) goto L6;
        return null;
    L6:
        if (variationSettings.getSettings().isEmpty() == false) goto L8;
        return typeface;
    L8:
        Paint localPaint = threadLocalPaint.get();
        if (localPaint != null) goto L11;
        localPaint = new Paint();
        threadLocalPaint.set(localPaint);
    L11:
        localPaint.setFontVariationSettings(null);
        localPaint.setTypeface(typeface);
        localPaint.setFontVariationSettings(toAndroidString(variationSettings, context));
        return localPaint.getTypeface();
    }

    private final String toAndroidString(FontVariation.Settings $this$toAndroidString, Context context) {
        final Density density = AndroidDensity_androidKt.Density(context);
        return ListUtilsKt.fastJoinToString$default($this$toAndroidString.getSettings(), null, null, null, 0, null, new AnonymousClass1(density), 31, null);
    }
}
