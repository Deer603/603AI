package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class ResourcesCompat {
    public static final int ID_NULL = 0;
    private static final String TAG = "ResourcesCompat";
    private static final Object sColorStateCacheLock = null;
    private static final WeakHashMap<ColorStateListCacheKey, SparseArray<ColorStateListCacheEntry>> sColorStateCaches = null;
    private static final ThreadLocal<TypedValue> sTempTypedValue = null;

    static class Api21Impl {
        private Api21Impl() {
        }

        static Drawable getDrawable(Resources resources, int id, Resources.Theme theme) {
            return resources.getDrawable(id, theme);
        }

        static Drawable getDrawableForDensity(Resources resources, int id, int density, Resources.Theme theme) {
            return resources.getDrawableForDensity(id, density, theme);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static ColorStateList getColorStateList(Resources res, int id, Resources.Theme theme) {
            return res.getColorStateList(id, theme);
        }

        static int getColor(Resources resources, int id, Resources.Theme theme) {
            return resources.getColor(id, theme);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static float getFloat(Resources res, int id) {
            return res.getFloat(id);
        }
    }

    private static class ColorStateListCacheEntry {
        final Configuration mConfiguration;
        final int mThemeHash;
        final ColorStateList mValue;

        ColorStateListCacheEntry(ColorStateList value, Configuration configuration, Resources.Theme theme) {
            this.mValue = value;
            this.mConfiguration = configuration;
            if (theme != null) goto L5;
            int r0 = 0;
        L6:
            this.mThemeHash = r0;
            return;
        L5:
            r0 = theme.hashCode();
            goto L6
        }
    }

    private static final class ColorStateListCacheKey {
        final Resources mResources;
        final Resources.Theme mTheme;

        ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.mResources = resources;
            this.mTheme = theme;
        }

        public boolean equals(Object o) {
            if (this != o) goto L6;
            return true;
        L6:
            if (o != null) goto L8;
        L17:
            return false;
        L8:
            if (getClass() != o.getClass()) goto L17;
            ColorStateListCacheKey that = (ColorStateListCacheKey) o;
            if (this.mResources.equals(that.mResources) == false) goto L16;
            if (ObjectsCompat.equals(this.mTheme, that.mTheme) == false) goto L16;
            return true;
        L16:
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.hash(new Object[]{this.mResources, this.mTheme});
        }
    }

    public static abstract class FontCallback {
        public abstract void onFontRetrievalFailed(int r1);

        public abstract void onFontRetrieved(Typeface r1);

        public FontCallback() {
        }

        public final void callbackSuccessAsync(final Typeface typeface, Handler handler) {
            getHandler(handler).post(new ResourcesCompat$FontCallback$$ExternalSyntheticLambda0(this, typeface));
        }

        /* JADX INFO: renamed from: lambda$callbackSuccessAsync$0$androidx-core-content-res-ResourcesCompat$FontCallback, reason: not valid java name */
        /* synthetic */ void m7235x46c88379(Typeface typeface) {
            onFontRetrieved(typeface);
        }

        public final void callbackFailAsync(final int reason, Handler handler) {
            getHandler(handler).post(new ResourcesCompat$FontCallback$$ExternalSyntheticLambda1(this, reason));
        }

        /* JADX INFO: renamed from: lambda$callbackFailAsync$1$androidx-core-content-res-ResourcesCompat$FontCallback, reason: not valid java name */
        /* synthetic */ void m7234xb24343b7(int reason) {
            onFontRetrievalFailed(reason);
        }

        public static Handler getHandler(Handler handler) {
            if (handler != null) goto L5;
            return new Handler(Looper.getMainLooper());
        L5:
            return handler;
        }
    }

    public static final class ThemeCompat {

        static class Api23Impl {
            private static Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final Object sRebaseMethodLock = null;

            private Api23Impl() {
            }

            static {
                sRebaseMethodLock = new Object();
            }

            static void rebase(Resources.Theme theme) {
                Object r0 = sRebaseMethodLock;
                monitor-enter(r0);
            L23:
                th = move-exception;
                throw th;
            L6:
                if (sRebaseMethodFetched == true) goto L14;
                sRebaseMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);     // Catch: NoSuchMethodException -> L10 Throwable -> L23
                sRebaseMethod.setAccessible(true);     // Catch: NoSuchMethodException -> L10 Throwable -> L23
            L12:
                sRebaseMethodFetched = true;     // Catch: Throwable -> L23
                goto L14
            L10:
                e = move-exception;
                Log.i(ResourcesCompat.TAG, "Failed to retrieve rebase() method", e);     // Catch: Throwable -> L23
            L14:
                if (sRebaseMethod != null) goto L30;
            L21:
                monitor-exit(r0);     // Catch: Throwable -> L23
                return;
            L30:
                sRebaseMethod.invoke(theme, new Object[0]);     // Catch: InvocationTargetException -> L17 Throwable -> L19 Throwable -> L23
            L19:
                e = move-exception;
                Log.i(ResourcesCompat.TAG, "Failed to invoke rebase() method via reflection", e);     // Catch: Throwable -> L23
                sRebaseMethod = null;     // Catch: Throwable -> L23
                goto L21
            }
        }

        static class Api29Impl {
            private Api29Impl() {
            }

            static void rebase(Resources.Theme theme) {
                theme.rebase();
            }
        }

        private ThemeCompat() {
        }

        public static void rebase(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT < 29) goto L5;
            Api29Impl.rebase(theme);
            return;
        L5:
            Api23Impl.rebase(theme);
        }
    }

    static {
        sTempTypedValue = new ThreadLocal();
        sColorStateCaches = new WeakHashMap(0);
        sColorStateCacheLock = new Object();
    }

    public static void clearCachesForTheme(Resources.Theme theme) {
        Object r0 = sColorStateCacheLock;
        monitor-enter(r0);
        Iterator<ColorStateListCacheKey> keys = sColorStateCaches.keySet().iterator();     // Catch: Throwable -> L15
    L6:
        if (keys.hasNext() == false) goto L13;
        ColorStateListCacheKey key = keys.next();     // Catch: Throwable -> L15
        if (key == null) goto L6;
        if (theme.equals(key.mTheme) == false) goto L6;
        keys.remove();     // Catch: Throwable -> L15
        goto L6
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L15
        return;
    L15:
        th = move-exception;
        throw th;
    }

    public static Drawable getDrawable(Resources res, int id, Resources.Theme theme) throws Resources.NotFoundException {
        return Api21Impl.getDrawable(res, id, theme);
    }

    public static Drawable getDrawableForDensity(Resources res, int id, int density, Resources.Theme theme) throws Resources.NotFoundException {
        return Api21Impl.getDrawableForDensity(res, id, density, theme);
    }

    public static int getColor(Resources res, int id, Resources.Theme theme) throws Resources.NotFoundException {
        return Api23Impl.getColor(res, id, theme);
    }

    public static ColorStateList getColorStateList(Resources res, int id, Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateListCacheKey key = new ColorStateListCacheKey(res, theme);
        ColorStateList csl = getCachedColorStateList(key, id);
        if (csl == null) goto L5;
        return csl;
    L5:
        ColorStateList csl2 = inflateColorStateList(res, id, theme);
        if (csl2 == null) goto L10;
        addColorStateListToCache(key, id, csl2, theme);
        return csl2;
    L10:
        return Api23Impl.getColorStateList(res, id, theme);
    }

    private static ColorStateList inflateColorStateList(Resources resources, int resId, Resources.Theme theme) {
        if (isColorInt(resources, resId) == false) goto L5;
        return null;
    L5:
        XmlPullParser xml = resources.getXml(resId);
        return ColorStateListInflaterCompat.createFromXml(resources, xml, theme);
    L8:
        e = move-exception;
        Log.w(TAG, "Failed to inflate ColorStateList, leaving it to the framework", e);
        return null;
    }

    private static ColorStateList getCachedColorStateList(ColorStateListCacheKey key, int resId) {
        Object r0 = sColorStateCacheLock;
        monitor-enter(r0);
        SparseArray<ColorStateListCacheEntry> entries = sColorStateCaches.get(key);     // Catch: Throwable -> L27
        if (entries != null) goto L7;
    L24:
        monitor-exit(r0);     // Catch: Throwable -> L27
        return null;
    L7:
        if (entries.size() <= 0) goto L24;
        ColorStateListCacheEntry entry = entries.get(resId);     // Catch: Throwable -> L27
        if (entry == null) goto L24;
        if (entry.mConfiguration.equals(key.mResources.getConfiguration()) == true) goto L13;
    L23:
        entries.remove(resId);     // Catch: Throwable -> L27
        goto L24
    L13:
        if (key.mTheme != null) goto L17;
        if (entry.mThemeHash != 0) goto L17;
    L20:
        ColorStateList r3 = entry.mValue;     // Catch: Throwable -> L27
        monitor-exit(r0);     // Catch: Throwable -> L27
        return r3;
    L17:
        if (key.mTheme == null) goto L23;
        if (entry.mThemeHash != key.mTheme.hashCode()) goto L23;
    L27:
        th = move-exception;
        throw th;
    }

    private static void addColorStateListToCache(ColorStateListCacheKey key, int resId, ColorStateList value, Resources.Theme theme) {
        Object r0 = sColorStateCacheLock;
        monitor-enter(r0);
        SparseArray<ColorStateListCacheEntry> entries = sColorStateCaches.get(key);     // Catch: Throwable -> L10
        if (entries != null) goto L7;
        entries = new SparseArray();     // Catch: Throwable -> L10
        sColorStateCaches.put(key, entries);     // Catch: Throwable -> L10
    L7:
        entries.append(resId, new ColorStateListCacheEntry(value, key.mResources.getConfiguration(), theme));     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        throw th;
    }

    private static boolean isColorInt(Resources resources, int resId) {
        TypedValue value = getTypedValue();
        resources.getValue(resId, value, true);
        if (value.type >= 28) goto L5;
    L7:
        return false;
    L5:
        if (value.type > 31) goto L7;
        return true;
    }

    private static TypedValue getTypedValue() {
        TypedValue tv = sTempTypedValue.get();
        if (tv != null) goto L6;
        TypedValue tv2 = new TypedValue();
        sTempTypedValue.set(tv2);
        return tv2;
    L6:
        return tv;
    }

    public static float getFloat(Resources res, int id) {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        TypedValue value = getTypedValue();
        res.getValue(id, value, true);
        if (value.type != 4) goto L11;
        return value.getFloat();
    L11:
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(id) + " type #0x" + Integer.toHexString(value.type) + " is not valid");
    L5:
        return Api29Impl.getFloat(res, id);
    }

    public static Typeface getFont(Context context, int id) throws Resources.NotFoundException {
        if (context.isRestricted() == false) goto L7;
        return null;
    L7:
        return loadFont(context, id, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface getCachedFont(Context context, int id) throws Resources.NotFoundException {
        if (context.isRestricted() == false) goto L7;
        return null;
    L7:
        return loadFont(context, id, new TypedValue(), 0, null, null, false, true);
    }

    public static void getFont(Context context, int id, FontCallback fontCallback, Handler handler) throws Resources.NotFoundException {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted() == false) goto L6;
        fontCallback.callbackFailAsync(-4, handler);
        return;
    L6:
        loadFont(context, id, new TypedValue(), 0, fontCallback, handler, false, false);
    }

    public static Typeface getFont(Context context, int id, TypedValue value, int style, FontCallback fontCallback) throws Resources.NotFoundException {
        if (context.isRestricted() == false) goto L7;
        return null;
    L7:
        return loadFont(context, id, value, style, fontCallback, null, true, false);
    }

    private static Typeface loadFont(Context context, int id, TypedValue value, int style, FontCallback fontCallback, Handler handler, boolean isRequestFromLayoutInflator, boolean isCachedOnly) {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = loadFont(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator, isCachedOnly);
        if (typeface != null) goto L9;
        if (fontCallback != null) goto L9;
        if (isCachedOnly == true) goto L9;
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
    L9:
        return typeface;
    }

    private static Typeface loadFont(Context context, Resources wrapper, TypedValue value, int id, int style, FontCallback fontCallback, Handler handler, boolean isRequestFromLayoutInflator, boolean isCachedOnly) {
        if (value.string == null) goto L53;
        String file = value.string.toString();
        if (file.startsWith("res/") == true) goto L9;
        if (fontCallback == null) goto L8;
        fontCallback.callbackFailAsync(-3, handler);
    L8:
        return null;
    L9:
        Typeface typeface = TypefaceCompat.findFromCache(wrapper, id, file, value.assetCookie, style);
        if (typeface == null) goto L14;
        if (fontCallback == null) goto L13;
        fontCallback.callbackSuccessAsync(typeface, handler);
    L13:
        return typeface;
    L14:
        if (isCachedOnly == false) goto L57;
        return null;
    L57:
    L45:
        e = e;
    L46:
        Log.e(TAG, "Failed to read xml resource " + file, e);
    L49:
        if (fontCallback == null) goto L51;
        fontCallback.callbackFailAsync(-3, handler);
    L51:
        return null;
    L47:
        e = e;
    L48:
        Log.e(TAG, "Failed to parse xml resource " + file, e);
        goto L49
    L54:
        if (file.toLowerCase().endsWith(".xml") == false) goto L35;
        XmlResourceParser rp = wrapper.getXml(id);     // Catch: IOException -> L41 XmlPullParserException -> L43
        FontResourcesParserCompat.FamilyResourceEntry familyEntry = FontResourcesParserCompat.parse(rp, wrapper);     // Catch: IOException -> L41 XmlPullParserException -> L43
        if (familyEntry != null) goto L55;
        Log.e(TAG, "Failed to find font-family tag");     // Catch: IOException -> L45 XmlPullParserException -> L47
        if (fontCallback == null) goto L23;
        fontCallback.callbackFailAsync(-3, handler);     // Catch: IOException -> L45 XmlPullParserException -> L47
    L23:
        return null;
    L55:
    L28:
        return TypefaceCompat.createFromResourcesFamilyXml(context, familyEntry, wrapper, id, file, value.assetCookie, style, fontCallback, handler, isRequestFromLayoutInflator);
    L29:
        e = e;
        file = file;
    L31:
        e = e;
        file = file;
        goto L48
    L35:
        Typeface typeface2 = TypefaceCompat.createFromResourcesFontFile(context, wrapper, id, file, value.assetCookie, style);     // Catch: IOException -> L45 XmlPullParserException -> L47
        if (fontCallback == null) goto L40;
        if (typeface2 == null) goto L39;
        fontCallback.callbackSuccessAsync(typeface2, handler);     // Catch: IOException -> L45 XmlPullParserException -> L47
        goto L40
    L39:
        fontCallback.callbackFailAsync(-3, handler);     // Catch: IOException -> L45 XmlPullParserException -> L47
    L40:
        return typeface2;
    L41:
        e = e;
    L43:
        e = e;
        goto L48
    L53:
        throw new Resources.NotFoundException("Resource \"" + wrapper.getResourceName(id) + "\" (" + Integer.toHexString(id) + ") is not a Font: " + value);
    }

    private ResourcesCompat() {
    }
}
