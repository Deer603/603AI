package androidx.compose.ui.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextMeasurerHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DefaultCacheSize", "", "rememberTextMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "cacheSize", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextMeasurer;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextMeasurerHelperKt {
    private static final int DefaultCacheSize = 0;

    static {
        DefaultCacheSize = 8;
    }

    public static final TextMeasurer rememberTextMeasurer(int cacheSize, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, 1538166871, "C(rememberTextMeasurer)42@1995L7,43@2034L7,44@2089L7,46@2109L151:TextMeasurerHelper.kt#ruzxt2");
        boolean r1 = true;
        if ((r12 & 1) == 0) goto L6;
        cacheSize = DefaultCacheSize;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(1538166871, $changed, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
    L8:
        ProvidableCompositionLocal<FontFamily.Resolver> r13 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r13);
        ComposerKt.sourceInformationMarkerEnd($composer);
        FontFamily.Resolver fontFamilyResolver = (FontFamily.Resolver) r5;
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density density = (Density) r6;
        ProvidableCompositionLocal<LayoutDirection> r2 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        LayoutDirection layoutDirection = (LayoutDirection) r3;
        ComposerKt.sourceInformationMarkerStart($composer, 119404045, "CC(remember):TextMeasurerHelper.kt#9igjgp");
        boolean r4 = ($composer.changed(fontFamilyResolver) | $composer.changed(density)) | $composer.changed(layoutDirection);
        if ((($changed & 14) ^ 6) <= 4) goto L13;
        if ($composer.changed(cacheSize) == false) goto L13;
    L16:
        boolean invalid$iv = r1 | r4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L19;
    L22:
        Object value$iv = new TextMeasurer(fontFamilyResolver, density, layoutDirection, cacheSize);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L23:
        TextMeasurer r7 = (TextMeasurer) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventEnd();
    L26:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L19:
        if (it$iv != Composer.Companion.getEmpty()) goto L23;
    L13:
        if (($changed & 6) == 4) goto L16;
        r1 = false;
        goto L16
    }
}
