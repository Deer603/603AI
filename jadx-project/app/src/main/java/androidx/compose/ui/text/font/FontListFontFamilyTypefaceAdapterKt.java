package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002¨\u0006\r"}, d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FontListFontFamilyTypefaceAdapterKt {
    public static final /* synthetic */ Pair access$firstImmediatelyAvailable(List $receiver, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 createDefaultTypeface) {
        return firstImmediatelyAvailable($receiver, typefaceRequest, asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> r16, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1<? super TypefaceRequest, ? extends Object> r20) {
        int r11 = r16.size();
        List asyncFontsToLoad = null;
        int idx = 0;
    L3:
        if (idx >= r11) goto L81;
        Font font = r16.get(idx);
        int r0 = font.mo6473getLoadingStrategyPKNRLFQ();
        if (FontLoadingStrategy.m6515equalsimpl0(r0, FontLoadingStrategy.Companion.m6520getBlockingPKNRLFQ()) == true) goto L6;
        if (FontLoadingStrategy.m6515equalsimpl0(r0, FontLoadingStrategy.Companion.m6521getOptionalLocalPKNRLFQ()) == false) goto L65;
        SynchronizedObject lock$iv$iv = AsyncTypefaceCache.access$getCacheLock$p(asyncTypefaceCache);
        monitor-enter(lock$iv$iv);
        AsyncTypefaceCache.Key key$iv = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());     // Catch: Throwable -> L61
        AsyncTypefaceCache.AsyncTypefaceResult priorResult$iv = (AsyncTypefaceCache.AsyncTypefaceResult) AsyncTypefaceCache.access$getResultCache$p(asyncTypefaceCache).get(key$iv);     // Catch: Throwable -> L61
        if (priorResult$iv != null) goto L40;
        priorResult$iv = (AsyncTypefaceCache.AsyncTypefaceResult) AsyncTypefaceCache.access$getPermanentCache$p(asyncTypefaceCache).get(key$iv);     // Catch: Throwable -> L61
    L40:
        if (priorResult$iv == null) goto L45;
        Object result = priorResult$iv.m6490unboximpl();     // Catch: Throwable -> L61
        monitor-exit(lock$iv$iv);
    L57:
        if (result != null) goto L59;
    L78:
        idx = idx + 1;
        goto L3
    L59:
        return TuplesKt.to(asyncFontsToLoad, FontSynthesis_androidKt.m6549synthesizeTypefaceFxwP2eA(typefaceRequest.m6574getFontSynthesisGVVA2EU(), result, font, typefaceRequest.getFontWeight(), typefaceRequest.m6573getFontStyle_LCdwA()));
    L45:
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L61
        monitor-exit(lock$iv$iv);
        Result.Companion r2 = Result.Companion;     // Catch: Throwable -> L50
        Object r3 = Result.m7425constructorimpl(platformFontLoader.loadBlocking(font));     // Catch: Throwable -> L50
    L53:
        if (Result.m7431isFailureimpl(r3) == false) goto L55;
        r3 = null;
    L55:
        result = r3;
        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, result, false, 8, null);
    L50:
        th = move-exception;
        Result.Companion r7 = Result.Companion;
        r3 = Result.m7425constructorimpl(ResultKt.createFailure(th));
    L61:
        th = move-exception;
        throw th;
    L65:
        if (FontLoadingStrategy.m6515equalsimpl0(r0, FontLoadingStrategy.Companion.m6519getAsyncPKNRLFQ()) == false) goto L80;
        AsyncTypefaceCache.AsyncTypefaceResult cacheResult = asyncTypefaceCache.m6482get1ASDuI8(font, platformFontLoader);
        if (cacheResult != null) goto L72;
        if (asyncFontsToLoad != null) goto L70;
        asyncFontsToLoad = CollectionsKt.mutableListOf(new Font[]{font});
        goto L78
    L70:
        asyncFontsToLoad.add(font);
        goto L78
    L72:
        if (AsyncTypefaceCache.AsyncTypefaceResult.m6488isPermanentFailureimpl(cacheResult.m6490unboximpl()) == true) goto L78;
        if (cacheResult.m6490unboximpl() == null) goto L78;
        return TuplesKt.to(asyncFontsToLoad, FontSynthesis_androidKt.m6549synthesizeTypefaceFxwP2eA(typefaceRequest.m6574getFontSynthesisGVVA2EU(), cacheResult.m6490unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m6573getFontStyle_LCdwA()));
    L80:
        throw new IllegalStateException("Unknown font type " + font);
    L6:
        SynchronizedObject lock$iv$iv2 = AsyncTypefaceCache.access$getCacheLock$p(asyncTypefaceCache);
        monitor-enter(lock$iv$iv2);
        AsyncTypefaceCache.Key key$iv2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());     // Catch: Throwable -> L29
        AsyncTypefaceCache.AsyncTypefaceResult priorResult$iv2 = (AsyncTypefaceCache.AsyncTypefaceResult) AsyncTypefaceCache.access$getResultCache$p(asyncTypefaceCache).get(key$iv2);     // Catch: Throwable -> L29
        if (priorResult$iv2 != null) goto L12;
        priorResult$iv2 = (AsyncTypefaceCache.AsyncTypefaceResult) AsyncTypefaceCache.access$getPermanentCache$p(asyncTypefaceCache).get(key$iv2);     // Catch: Throwable -> L29
    L12:
        if (priorResult$iv2 == null) goto L17;
        Object result2 = priorResult$iv2.m6490unboximpl();     // Catch: Throwable -> L29
        monitor-exit(lock$iv$iv2);
    L25:
        if (result2 != null) goto L28;
        result2 = r20.invoke(typefaceRequest);
    L28:
        return TuplesKt.to(asyncFontsToLoad, FontSynthesis_androidKt.m6549synthesizeTypefaceFxwP2eA(typefaceRequest.m6574getFontSynthesisGVVA2EU(), result2, font, typefaceRequest.getFontWeight(), typefaceRequest.m6573getFontStyle_LCdwA()));
    L17:
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L29
        monitor-exit(lock$iv$iv2);
        result2 = platformFontLoader.loadBlocking(font);     // Catch: Exception -> L22
    L24:
        Object it$iv = result2;
        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, it$iv, false, 8, null);
    L23:
        result2 = r20.invoke(typefaceRequest);
    L29:
        th = move-exception;
        throw th;
    L81:
        Object fallbackTypeface = r20.invoke(typefaceRequest);
        return TuplesKt.to(asyncFontsToLoad, fallbackTypeface);
    }
}
