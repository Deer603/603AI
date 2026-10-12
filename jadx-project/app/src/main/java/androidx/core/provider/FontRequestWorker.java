package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompat$$ExternalSyntheticBackport1;
import androidx.core.util.Consumer;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
class FontRequestWorker {
    private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = null;
    static final Object LOCK = null;
    static final SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> PENDING_REPLIES = null;
    static final LruCache<String, Typeface> sTypefaceCache = null;

    static final class TypefaceResult {
        final int mResult;
        final Typeface mTypeface;

        TypefaceResult(int result) {
            this.mTypeface = null;
            this.mResult = result;
        }

        TypefaceResult(Typeface typeface) {
            this.mTypeface = typeface;
            this.mResult = 0;
        }

        boolean isSuccess() {
            if (this.mResult != 0) goto L5;
            return true;
        L5:
            return false;
        }
    }

    private FontRequestWorker() {
    }

    static {
        sTypefaceCache = new LruCache(16);
        DEFAULT_EXECUTOR_SERVICE = RequestExecutor.createDefaultExecutor("fonts-androidx", 10, 10000);
        LOCK = new Object();
        PENDING_REPLIES = new SimpleArrayMap();
    }

    static void resetTypefaceCache() {
        sTypefaceCache.evictAll();
    }

    static Typeface requestFontSync(final Context context, final FontRequest request, CallbackWrapper callback, final int style, int timeoutInMillis) {
        final String id = createCacheId(TypefaceCompat$$ExternalSyntheticBackport1.m(request), style);
        Typeface cached = sTypefaceCache.get(id);
        if (cached == null) goto L7;
        callback.onTypefaceResult(new TypefaceResult(cached));
        return cached;
    L7:
        if (timeoutInMillis != (-1)) goto L10;
        TypefaceResult typefaceResult = getFontSync(id, context, TypefaceCompat$$ExternalSyntheticBackport1.m(request), style);
        callback.onTypefaceResult(typefaceResult);
        return typefaceResult.mTypeface;
    L10:
        Callable<TypefaceResult> fetcher = new AnonymousClass1(id, context, request, style);
        TypefaceResult typefaceResult2 = (TypefaceResult) RequestExecutor.submit(DEFAULT_EXECUTOR_SERVICE, fetcher, timeoutInMillis);     // Catch: InterruptedException -> L13
        callback.onTypefaceResult(typefaceResult2);     // Catch: InterruptedException -> L13
        return typefaceResult2.mTypeface;
    L14:
        callback.onTypefaceResult(new TypefaceResult(-3));
        return null;
    }

    static Typeface requestFontAsync(final Context context, final List<FontRequest> requests, final int style, Executor executor, final CallbackWrapper callback) {
        final String id = createCacheId(requests, style);
        Typeface cached = sTypefaceCache.get(id);
        if (cached == null) goto L6;
        callback.onTypefaceResult(new TypefaceResult(cached));
        return cached;
    L6:
        Consumer<TypefaceResult> reply = new AnonymousClass2(callback);
        Object r3 = LOCK;
        monitor-enter(r3);
        ArrayList<Consumer<TypefaceResult>> pendingReplies = PENDING_REPLIES.get(id);     // Catch: Throwable -> L21
        if (pendingReplies == null) goto L13;
        pendingReplies.add(reply);     // Catch: Throwable -> L21
        monitor-exit(r3);     // Catch: Throwable -> L21
        return null;
    L13:
        ArrayList<Consumer<TypefaceResult>> pendingReplies2 = new ArrayList();     // Catch: Throwable -> L21
        pendingReplies2.add(reply);     // Catch: Throwable -> L21
        PENDING_REPLIES.put(id, pendingReplies2);     // Catch: Throwable -> L21
        monitor-exit(r3);     // Catch: Throwable -> L21
        Callable<TypefaceResult> fetcher = new AnonymousClass3(id, context, requests, style);
        if (executor != null) goto L18;
        Executor finalExecutor = DEFAULT_EXECUTOR_SERVICE;
    L19:
        RequestExecutor.execute(finalExecutor, fetcher, new AnonymousClass4(id));
        return null;
    L18:
        finalExecutor = executor;
    L21:
        th = move-exception;
        throw th;
    }

    private static String createCacheId(List<FontRequest> requests, int style) {
        StringBuilder cacheId = new StringBuilder();
        int i = 0;
    L4:
        if (i >= requests.size()) goto L10;
        cacheId.append(requests.get(i).getId()).append("-").append(style);
        if (i >= (requests.size() - 1)) goto L8;
        cacheId.append(";");
    L8:
        i = i + 1;
        goto L4
    L10:
        return cacheId.toString();
    }

    static TypefaceResult getFontSync(String cacheId, Context context, List<FontRequest> requests, int style) {
        Trace.beginSection("getFontSync");
        Typeface cached = sTypefaceCache.get(cacheId);     // Catch: Throwable -> L32
        if (cached == null) goto L36;
        TypefaceResult r1 = new TypefaceResult(cached);     // Catch: Throwable -> L32
        Trace.endSection();
        return r1;
    L36:
        FontsContractCompat.FontFamilyResult result = FontProvider.getFontFamilyResult(context, requests, null);     // Catch: PackageManager.NameNotFoundException -> L28 Throwable -> L32
        int fontFamilyResultStatus = getFontFamilyResultStatus(result);     // Catch: Throwable -> L32
        if (fontFamilyResultStatus == 0) goto L16;
        TypefaceResult r2 = new TypefaceResult(fontFamilyResultStatus);     // Catch: Throwable -> L32
        Trace.endSection();
        return r2;
    L16:
        if (result.hasFallback() == true) goto L18;
    L20:
        Typeface typeface = TypefaceCompat.createFromFontInfo(context, null, result.getFonts(), style);     // Catch: Throwable -> L32
    L21:
        if (typeface == null) goto L25;
        sTypefaceCache.put(cacheId, typeface);     // Catch: Throwable -> L32
        TypefaceResult r4 = new TypefaceResult(typeface);     // Catch: Throwable -> L32
        Trace.endSection();
        return r4;
    L25:
        TypefaceResult r5 = new TypefaceResult(-3);     // Catch: Throwable -> L32
        Trace.endSection();
        return r5;
    L18:
        if (Build.VERSION.SDK_INT < 29) goto L20;
        typeface = TypefaceCompat.createFromFontInfoWithFallback(context, null, result.getFontsWithFallbacks(), style);     // Catch: Throwable -> L32
        goto L21
    L29:
        TypefaceResult r3 = new TypefaceResult(-1);     // Catch: Throwable -> L32
        Trace.endSection();
        return r3;
    L32:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    private static int getFontFamilyResultStatus(FontsContractCompat.FontFamilyResult fontFamilyResult) {
        if (fontFamilyResult.getStatusCode() != 0) goto L5;
        FontsContractCompat.FontInfo[] fonts = fontFamilyResult.getFonts();
        if (fonts != null) goto L12;
        return 1;
    L12:
        if (fonts.length == 0) goto L29;
        int r2 = fonts.length;
        int r4 = 0;
    L15:
        if (r4 >= r2) goto L23;
        FontsContractCompat.FontInfo font = fonts[r4];
        int resultCode = font.getResultCode();
        if (resultCode != 0) goto L18;
        r4 = r4 + 1;
        goto L15
    L18:
        if (resultCode >= 0) goto L21;
        return -3;
    L21:
        return resultCode;
    L23:
        return 0;
    L29:
        return 1;
    L5:
        switch(fontFamilyResult.getStatusCode()) {
            case 1: goto L7;
            default: goto L6;
        };
    L6:
        return -3;
    L7:
        return -2;
    }
}
