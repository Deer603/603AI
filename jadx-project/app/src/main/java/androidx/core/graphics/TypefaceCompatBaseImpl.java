package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
class TypefaceCompatBaseImpl {
    private static final int INVALID_KEY = 0;
    private static final String TAG = "TypefaceCompatBaseImpl";
    private ConcurrentHashMap<Long, FontResourcesParserCompat.FontFamilyFilesResourceEntry> mFontFamilies;

    private interface StyleExtractor<T> {
        int getWeight(T r1);

        boolean isItalic(T r1);
    }

    TypefaceCompatBaseImpl() {
        this.mFontFamilies = new ConcurrentHashMap();
    }

    private static <T> T findBestFont(T[] r3, int r4, StyleExtractor<T> r5) {
        if ((r4 & 1) != 0) goto L5;
        int r0 = 400;
    L7:
        if ((r4 & 2) == 0) goto L9;
        boolean r1 = true;
    L11:
        return (T) findBestFont(r3, r0, r1, r5);
    L9:
        r1 = false;
        goto L11
    L5:
        r0 = 700;
        goto L7
    }

    private static <T> T findBestFont(T[] fonts, int targetWeight, boolean isTargetItalic, StyleExtractor<T> extractor) {
        T best = null;
        int bestScore = Integer.MAX_VALUE;
        int r2 = fonts.length;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L13;
        T font = fonts[r4];
        int r6 = Math.abs(extractor.getWeight(font) - targetWeight) * 2;
        if (extractor.isItalic(font) != isTargetItalic) goto L7;
        int r7 = 0;
    L8:
        int score = r6 + r7;
        if (best == null) goto L11;
        if (bestScore > score) goto L11;
    L12:
        r4 = r4 + 1;
    L11:
        best = font;
        bestScore = score;
        goto L12
    L7:
        r7 = 1;
        goto L8
    L13:
        return best;
    }

    private static long getUniqueKey(Typeface typeface) {
        if (typeface != null) goto L13;
        return 0;
    L13:
        Field field = Typeface.class.getDeclaredField("native_instance");     // Catch: IllegalAccessException -> L7 NoSuchFieldException -> L10
        field.setAccessible(true);     // Catch: IllegalAccessException -> L7 NoSuchFieldException -> L10
        Number num = (Number) field.get(typeface);     // Catch: IllegalAccessException -> L7 NoSuchFieldException -> L10
        return num.longValue();
    L7:
        e = move-exception;
        Log.e(TAG, "Could not retrieve font from family.", e);
        return 0;
    L10:
        e = move-exception;
        Log.e(TAG, "Could not retrieve font from family.", e);
        return 0;
    }

    protected FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fonts, int style) {
        return (FontsContractCompat.FontInfo) findBestFont(fonts, style, new AnonymousClass1(this));
    }

    protected Typeface createFromInputStream(Context context, InputStream is) {
        File tmpFile = TypefaceCompatUtil.getTempFile(context);
        if (tmpFile != null) goto L18;
        return null;
    L18:
    L12:
        th = move-exception;
        tmpFile.delete();
        throw th;
    L6:
        if (TypefaceCompatUtil.copyToFile(tmpFile, is) == true) goto L9;
        tmpFile.delete();
        return null;
    L9:
        Typeface r1 = Typeface.createFromFile(tmpFile.getPath());     // Catch: Throwable -> L12 RuntimeException -> L15
        tmpFile.delete();
        return r1;
    L16:
        tmpFile.delete();
        return null;
    }

    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fonts, int style) {
        if (fonts.length >= 1) goto L5;
        return null;
    L5:
        FontsContractCompat.FontInfo font = findBestInfo(fonts, style);
        InputStream is = null;
        is = context.getContentResolver().openInputStream(font.getUri());     // Catch: Throwable -> L9 IOException -> L12
        Typeface r2 = createFromInputStream(context, is);     // Catch: Throwable -> L9 IOException -> L12
        TypefaceCompatUtil.closeQuietly(is);
        return r2;
    L9:
        th = move-exception;
        TypefaceCompatUtil.closeQuietly(is);
        throw th;
    L13:
        TypefaceCompatUtil.closeQuietly(is);
        return null;
    }

    public Typeface createFromFontInfoWithFallback(Context context, CancellationSignal cancellationSignal, List<FontsContractCompat.FontInfo[]> fonts, int style) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    private FontResourcesParserCompat.FontFileResourceEntry findBestEntry(FontResourcesParserCompat.FontFamilyFilesResourceEntry entry, int style) {
        return (FontResourcesParserCompat.FontFileResourceEntry) findBestFont(entry.getEntries(), style, new AnonymousClass2(this));
    }

    private FontResourcesParserCompat.FontFileResourceEntry findBestEntry(FontResourcesParserCompat.FontFamilyFilesResourceEntry entry, int weight, boolean italic) {
        return (FontResourcesParserCompat.FontFileResourceEntry) findBestFont(entry.getEntries(), weight, italic, new AnonymousClass3(this));
    }

    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry entry, Resources resources, int style) {
        FontResourcesParserCompat.FontFileResourceEntry best = findBestEntry(entry, style);
        if (best != null) goto L6;
        return null;
    L6:
        Typeface typeface = TypefaceCompat.createFromResourcesFontFile(context, resources, best.getResourceId(), best.getFileName(), 0, style);
        addFontFamily(typeface, entry);
        return typeface;
    }

    Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry entry, Resources resources, int weight, boolean italic) {
        FontResourcesParserCompat.FontFileResourceEntry best = findBestEntry(entry, weight, italic);
        if (best != null) goto L6;
        return null;
    L6:
        Typeface typeface = TypefaceCompat.createFromResourcesFontFile(context, resources, best.getResourceId(), best.getFileName(), 0, 0);
        addFontFamily(typeface, entry);
        return typeface;
    }

    public Typeface createFromResourcesFontFile(Context context, Resources resources, int id, String path, int style) {
        File tmpFile = TypefaceCompatUtil.getTempFile(context);
        if (tmpFile != null) goto L18;
        return null;
    L18:
    L12:
        th = move-exception;
        tmpFile.delete();
        throw th;
    L6:
        if (TypefaceCompatUtil.copyToFile(tmpFile, resources, id) == true) goto L9;
        tmpFile.delete();
        return null;
    L9:
        Typeface r1 = Typeface.createFromFile(tmpFile.getPath());     // Catch: Throwable -> L12 RuntimeException -> L15
        tmpFile.delete();
        return r1;
    L16:
        tmpFile.delete();
        return null;
    }

    Typeface createWeightStyle(Context context, Typeface base, int weight, boolean italic) {
        Typeface out = null;
        out = WeightTypefaceApi14.createWeightStyle(this, context, base, weight, italic);     // Catch: RuntimeException -> L5
    L6:
        if (out == null) goto L8;
        return out;
    L8:
        return base;
    }

    FontResourcesParserCompat.FontFamilyFilesResourceEntry getFontFamily(Typeface typeface) {
        long key = getUniqueKey(typeface);
        if (key != 0) goto L7;
        return null;
    L7:
        return this.mFontFamilies.get(Long.valueOf(key));
    }

    private void addFontFamily(Typeface typeface, FontResourcesParserCompat.FontFamilyFilesResourceEntry entry) {
        long key = getUniqueKey(typeface);
        if (key == 0) goto L6;
        this.mFontFamilies.put(Long.valueOf(key), entry);
        return;
    }
}
