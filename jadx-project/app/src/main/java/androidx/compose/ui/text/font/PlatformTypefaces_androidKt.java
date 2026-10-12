package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.autofill.HintConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: PlatformTypefaces.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a \u0010\u0007\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¨\u0006\r"}, d2 = {"PlatformTypefaces", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "getWeightSuffixForFallbackFamilyName", "", HintConstants.AUTOFILL_HINT_NAME, "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "setFontVariationSettings", "Landroid/graphics/Typeface;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PlatformTypefaces_androidKt {
    public static final PlatformTypefaces PlatformTypefaces() {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        return new PlatformTypefacesApi28();
    L6:
        return new PlatformTypefacesApi();
    }

    public static final android.graphics.Typeface setFontVariationSettings(android.graphics.Typeface $this$setFontVariationSettings, FontVariation.Settings variationSettings, Context context) {
        return TypefaceCompatApi26.INSTANCE.setFontVariationSettings($this$setFontVariationSettings, variationSettings, context);
    }

    public static final String getWeightSuffixForFallbackFamilyName(String name, FontWeight fontWeight) {
        int r0 = fontWeight.getWeight() / 100;
        boolean r2 = true;
        if (r0 < 0) goto L6;
        if (r0 >= 2) goto L6;
        boolean r4 = true;
    L7:
        if (r4 == false) goto L10;
        return name + "-thin";
    L10:
        if (2 > r0) goto L13;
        if (r0 >= 4) goto L13;
        boolean r1 = true;
    L14:
        if (r1 == true) goto L39;
        if (r0 == 4) goto L37;
        if (r0 != 5) goto L22;
        return name + "-medium";
    L22:
        if (6 > r0) goto L25;
        if (r0 >= 8) goto L25;
        boolean r3 = true;
    L26:
        if (r3 == true) goto L37;
        if (8 <= r0) goto L30;
    L32:
        r2 = false;
    L33:
        if (r2 == false) goto L37;
        return name + "-black";
    L30:
        if (r0 >= 11) goto L32;
    L25:
        r3 = false;
    L37:
        return name;
    L39:
        return name + "-light";
    L13:
        r1 = false;
    L6:
        r4 = false;
        goto L7
    }
}
