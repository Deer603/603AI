package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.platform.AndroidDefaultTypeface;
import androidx.compose.ui.text.platform.AndroidFontListTypeface;
import androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface;
import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: AndroidTypeface.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0018\u00010\nH\u0007\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u000e"}, d2 = {"FontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "typeface", "Landroid/graphics/Typeface;", "Typeface", "Landroidx/compose/ui/text/font/Typeface;", "context", "Landroid/content/Context;", "fontFamily", "styles", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidTypeface_androidKt {
    public static /* synthetic */ Typeface Typeface$default(Context r0, FontFamily r1, List r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = null;
    L6:
        return Typeface(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final Typeface Typeface(Context context, FontFamily fontFamily, List<Pair<FontWeight, FontStyle>> r10) {
        if ((fontFamily instanceof FontListFontFamily) == false) goto L6;
        return new AndroidFontListTypeface((FontListFontFamily) fontFamily, context, r10, null, 8, null);
    L6:
        if ((fontFamily instanceof GenericFontFamily) == false) goto L9;
        return new AndroidGenericFontFamilyTypeface((GenericFontFamily) fontFamily);
    L9:
        if ((fontFamily instanceof DefaultFontFamily) == false) goto L12;
        return new AndroidDefaultTypeface();
    L12:
        if ((fontFamily instanceof LoadedFontFamily) == false) goto L16;
        return ((LoadedFontFamily) fontFamily).getTypeface();
    L16:
        throw new NoWhenBranchMatchedException();
    }

    public static final Typeface Typeface(android.graphics.Typeface typeface) {
        return new AndroidTypefaceWrapper(typeface);
    }

    public static final FontFamily FontFamily(android.graphics.Typeface typeface) {
        return FontFamilyKt.FontFamily(Typeface(typeface));
    }
}
