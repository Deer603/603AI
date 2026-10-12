package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TypefaceCompat {
    public static final boolean DOWNLOADABLE_FALLBACK_DEBUG = false;
    public static final boolean DOWNLOADABLE_FONT_TRACING = true;
    private static final LruCache<String, Typeface> sTypefaceCache = null;
    private static final TypefaceCompatBaseImpl sTypefaceCompatImpl = null;

    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {
        private ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(ResourcesCompat.FontCallback fontCallback) {
            this.mFontCallback = fontCallback;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(Typeface typeface) {
            if (this.mFontCallback == null) goto L6;
            this.mFontCallback.onFontRetrieved(typeface);
            return;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int reason) {
            if (this.mFontCallback == null) goto L6;
            this.mFontCallback.onFontRetrievalFailed(reason);
            return;
        }
    }

    static {
        Trace.beginSection("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT < 29) goto L6;
        sTypefaceCompatImpl = new TypefaceCompatApi29Impl();
    L9:
        sTypefaceCache = new LruCache(16);
        Trace.endSection();
        return;
    L6:
        if (Build.VERSION.SDK_INT < 28) goto L8;
        sTypefaceCompatImpl = new TypefaceCompatApi28Impl();
        goto L9
    L8:
        sTypefaceCompatImpl = new TypefaceCompatApi26Impl();
        goto L9
    }

    private TypefaceCompat() {
    }

    public static Typeface findFromCache(Resources resources, int id, String path, int cookie, int style) {
        return sTypefaceCache.get(createResourceUid(resources, id, path, cookie, style));
    }

    @Deprecated
    public static Typeface findFromCache(Resources resources, int id, int style) {
        return findFromCache(resources, id, null, 0, style);
    }

    private static String createResourceUid(Resources resources, int id, String path, int cookie, int style) {
        return resources.getResourcePackageName(id) + '-' + path + '-' + cookie + '-' + id + '-' + style;
    }

    private static Typeface getSystemFontFamily(String familyName) {
        if (familyName != null) goto L5;
    L13:
        return null;
    L5:
        if (familyName.isEmpty() == true) goto L13;
        Typeface typeface = Typeface.create(familyName, 0);
        Typeface defaultTypeface = Typeface.create(Typeface.DEFAULT, 0);
        if (typeface != null) goto L10;
        return null;
    L10:
        if (typeface.equals(defaultTypeface) == false) goto L12;
        return null;
    L12:
        return typeface;
    }

    public static Typeface createFromResourcesFamilyXml(Context context, FontResourcesParserCompat.FamilyResourceEntry entry, Resources resources, int id, String path, int cookie, int style, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        if ((entry instanceof FontResourcesParserCompat.ProviderResourceEntry) == false) goto L27;
        FontResourcesParserCompat.ProviderResourceEntry providerEntry = (FontResourcesParserCompat.ProviderResourceEntry) entry;
        Typeface fontFamilyTypeface = getSystemFontFamily(providerEntry.getSystemFontFamilyName());
        if (fontFamilyTypeface == null) goto L9;
        if (fontCallback == null) goto L8;
        fontCallback.callbackSuccessAsync(fontFamilyTypeface, handler);
    L8:
        return fontFamilyTypeface;
    L9:
        boolean r4 = true;
        if (isRequestFromLayoutInflator == true) goto L12;
        if (fontCallback == null) goto L18;
        r4 = false;
    L18:
        boolean isBlocking = r4;
        if (isRequestFromLayoutInflator == false) goto L21;
        int timeout = providerEntry.getTimeout();
    L22:
        Handler newHandler = ResourcesCompat.FontCallback.getHandler(handler);
        ResourcesCallbackAdapter newCallback = new ResourcesCallbackAdapter(fontCallback);
        if (providerEntry.getFallbackRequest() == null) goto L25;
        List<FontRequest> requests = TypefaceCompat$$ExternalSyntheticBackport0.m(providerEntry.getRequest(), providerEntry.getFallbackRequest());
    L26:
        Typeface typeface = FontsContractCompat.requestFont(context, requests, style, isBlocking, timeout, newHandler, newCallback);
    L32:
        if (typeface == null) goto L34;
        sTypefaceCache.put(createResourceUid(resources, id, path, cookie, style), typeface);
    L34:
        return typeface;
    L25:
        requests = TypefaceCompat$$ExternalSyntheticBackport1.m(providerEntry.getRequest());
        goto L26
    L21:
        timeout = -1;
        goto L22
    L12:
        if (providerEntry.getFetchStrategy() == 0) goto L18;
        r4 = false;
        goto L18
    L27:
        typeface = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) entry, resources, style);
        if (fontCallback == null) goto L32;
        if (typeface == null) goto L31;
        fontCallback.callbackSuccessAsync(typeface, handler);
        goto L32
    L31:
        fontCallback.callbackFailAsync(-3, handler);
        goto L32
    }

    @Deprecated
    public static Typeface createFromResourcesFamilyXml(Context context, FontResourcesParserCompat.FamilyResourceEntry entry, Resources resources, int id, int style, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        return createFromResourcesFamilyXml(context, entry, resources, id, null, 0, style, fontCallback, handler, isRequestFromLayoutInflator);
    }

    public static Typeface createFromResourcesFontFile(Context context, Resources resources, int id, String path, int cookie, int style) {
        Typeface typeface = sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, id, path, style);
        if (typeface == null) goto L5;
        String resourceUid = createResourceUid(resources, id, path, cookie, style);
        sTypefaceCache.put(resourceUid, typeface);
    L5:
        return typeface;
    }

    @Deprecated
    public static Typeface createFromResourcesFontFile(Context context, Resources resources, int id, String path, int style) {
        return createFromResourcesFontFile(context, resources, id, path, 0, style);
    }

    public static Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fonts, int style) {
        Trace.beginSection("TypefaceCompat.createFromFontInfo");
        Typeface r0 = sTypefaceCompatImpl.createFromFontInfo(context, cancellationSignal, fonts, style);     // Catch: Throwable -> L6
        Trace.endSection();
        return r0;
    L6:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public static Typeface createFromFontInfoWithFallback(Context context, CancellationSignal cancellationSignal, List<FontsContractCompat.FontInfo[]> fonts, int style) {
        Trace.beginSection("TypefaceCompat.createFromFontInfoWithFallback");
        Typeface r0 = sTypefaceCompatImpl.createFromFontInfoWithFallback(context, cancellationSignal, fonts, style);     // Catch: Throwable -> L6
        Trace.endSection();
        return r0;
    L6:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    private static Typeface getBestFontFromFamily(Context context, Typeface typeface, int style) {
        FontResourcesParserCompat.FontFamilyFilesResourceEntry families = sTypefaceCompatImpl.getFontFamily(typeface);
        if (families != null) goto L7;
        return null;
    L7:
        return sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, families, context.getResources(), style);
    }

    public static Typeface create(Context context, Typeface family, int style) {
        if (context == null) goto L6;
        return Typeface.create(family, style);
    L6:
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface create(Context context, Typeface family, int weight, boolean italic) {
        if (context == null) goto L9;
        Preconditions.checkArgumentInRange(weight, 1, 1000, "weight");
        if (family != null) goto L7;
        family = Typeface.DEFAULT;
    L7:
        return sTypefaceCompatImpl.createWeightStyle(context, family, weight, italic);
    L9:
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static void clearCache() {
        sTypefaceCache.evictAll();
    }
}
