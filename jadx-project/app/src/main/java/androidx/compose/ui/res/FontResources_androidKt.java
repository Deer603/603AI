package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: FontResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"cacheLock", "Ljava/lang/Object;", "syncLoadedTypefaces", "", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/Typeface;", "fontResource", "fontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/Typeface;", "fontResourceFromContext", "context", "Landroid/content/Context;", "a", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FontResources_androidKt {
    private static final Object cacheLock = null;
    private static final Map<FontFamily, Typeface> syncLoadedTypefaces = null;

    static {
        cacheLock = new Object();
        syncLoadedTypefaces = new LinkedHashMap();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final Typeface fontResource(FontFamily fontFamily, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -190831095, "C(fontResource)52@1895L7:FontResources.android.kt#ccshc7");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-190831095, $changed, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:51)");
    L5:
        ProvidableCompositionLocal<Context> r0 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Typeface r1 = fontResourceFromContext((Context) r3, fontFamily);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final Typeface fontResourceFromContext(Context context, FontFamily a) {
        if ((a instanceof SystemFontFamily) == false) goto L5;
    L9:
        Object r0 = cacheLock;
        monitor-enter(r0);
        Map<FontFamily, Typeface> r4 = syncLoadedTypefaces;     // Catch: Throwable -> L19
        Typeface r6 = r4.get(a);     // Catch: Throwable -> L19
        if (r6 != null) goto L15;
        Typeface r1 = AndroidTypeface_androidKt.Typeface$default(context, a, null, 4, null);     // Catch: Throwable -> L19
        r4.put(a, r1);     // Catch: Throwable -> L19
    L16:
        Typeface r2 = r1;     // Catch: Throwable -> L19
        monitor-exit(r0);
        return r2;
    L15:
        r1 = r6;
    L19:
        th = move-exception;
        throw th;
    L5:
        if ((a instanceof LoadedFontFamily) == true) goto L9;
        return AndroidTypeface_androidKt.Typeface$default(context, a, null, 4, null);
    }
}
