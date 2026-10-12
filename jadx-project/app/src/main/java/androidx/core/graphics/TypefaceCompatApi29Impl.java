package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TypefaceCompatApi29Impl extends TypefaceCompatBaseImpl {
    private static final String TAG = "TypefaceCompatApi29Impl";

    public TypefaceCompatApi29Impl() {
    }

    private static int getMatchScore(FontStyle o1, FontStyle o2) {
        int r0 = Math.abs(o1.getWeight() - o2.getWeight()) / 100;
        if (o1.getSlant() != o2.getSlant()) goto L5;
        int r1 = 0;
    L7:
        return r0 + r1;
    L5:
        r1 = 2;
        goto L7
    }

    private Font findBaseFont(FontFamily family, int style) {
        if ((style & 1) == 0) goto L5;
        int r1 = 700;
    L7:
        if ((style & 2) == 0) goto L9;
        int r2 = 1;
    L10:
        FontStyle desiredStyle = new FontStyle(r1, r2);
        Font bestFont = family.getFont(0);
        int bestScore = getMatchScore(desiredStyle, bestFont.getStyle());
        int i = 1;
    L12:
        if (i >= family.getSize()) goto L17;
        Font candidate = family.getFont(i);
        int score = getMatchScore(desiredStyle, candidate.getStyle());
        if (score >= bestScore) goto L16;
        bestFont = candidate;
        bestScore = score;
    L16:
        i = i + 1;
        goto L12
    L17:
        return bestFont;
    L9:
        r2 = 0;
        goto L10
    L5:
        r1 = 400;
        goto L7
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fonts, int style) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected Typeface createFromInputStream(Context context, InputStream is) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fonts, int style) {
        ContentResolver resolver = context.getContentResolver();
        FontFamily family = getFontFamily(cancellationSignal, fonts, resolver);     // Catch: Exception -> L8
        if (family != null) goto L6;
        return null;
    L6:
        return new Typeface.CustomFallbackBuilder(family).setStyle(findBaseFont(family, style).getStyle()).build();
    L8:
        e = move-exception;
        Log.w(TAG, "Font load failed", e);
        return null;
    }

    private static FontFamily getFontFamily(CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fonts, ContentResolver resolver) {
        FontFamily.Builder familyBuilder = null;
        int r1 = fonts.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L31;
        FontsContractCompat.FontInfo font = fonts[r3];
        ParcelFileDescriptor pfd = resolver.openFileDescriptor(font.getUri(), "r", cancellationSignal);     // Catch: IOException -> L28
        if (pfd != null) goto L36;
        if (pfd == null) goto L30;
        pfd.close();     // Catch: IOException -> L28
    L30:
        r3 = r3 + 1;
        goto L3
    L36:
        Font.Builder r6 = new Font.Builder(pfd).setWeight(font.getWeight());     // Catch: Throwable -> L21
        if (font.isItalic() == false) goto L13;
        int r7 = 1;
    L14:
        Font platformFont = r6.setSlant(r7).setTtcIndex(font.getTtcIndex()).build();     // Catch: Throwable -> L21
        if (familyBuilder != null) goto L17;
        familyBuilder = new FontFamily.Builder(platformFont);     // Catch: Throwable -> L21
    L18:
        if (pfd == null) goto L30;
        pfd.close();     // Catch: IOException -> L28
        goto L30
    L17:
        familyBuilder.addFont(platformFont);     // Catch: Throwable -> L21
        goto L18
    L13:
        r7 = 0;
        goto L14
    L21:
        th = move-exception;
        if (pfd != null) goto L38;
    L27:
        throw th;     // Catch: IOException -> L28
    L38:
        pfd.close();     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L28
    L28:
        e = move-exception;
        Log.w(TAG, "Font load failed", e);
        goto L30
    L31:
        if (familyBuilder != null) goto L34;
        return null;
    L34:
        FontFamily family = familyBuilder.build();
        return family;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontInfoWithFallback(Context context, CancellationSignal cancellationSignal, List<FontsContractCompat.FontInfo[]> fonts, int style) {
        ContentResolver resolver = context.getContentResolver();
        FontFamily family = getFontFamily(cancellationSignal, fonts.get(0), resolver);     // Catch: Exception -> L15
        if (family != null) goto L6;
        return null;
    L6:
        Typeface.CustomFallbackBuilder builder = new Typeface.CustomFallbackBuilder(family);     // Catch: Exception -> L15
        int i = 1;
    L8:
        if (i >= fonts.size()) goto L13;
        FontFamily fallbackFamily = getFontFamily(cancellationSignal, fonts.get(i), resolver);     // Catch: Exception -> L15
        if (fallbackFamily == null) goto L12;
        builder.addCustomFallback(fallbackFamily);     // Catch: Exception -> L15
    L12:
        i = i + 1;     // Catch: Exception -> L15
        goto L8
    L13:
        return builder.setStyle(findBaseFont(family, style).getStyle()).build();
    L15:
        e = move-exception;
        Log.w(TAG, "Font load failed", e);
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry familyEntry, Resources resources, int style) {
        FontFamily.Builder familyBuilder = null;
        FontResourcesParserCompat.FontFileResourceEntry[] r2 = familyEntry.getEntries();     // Catch: Exception -> L21
        int r3 = r2.length;     // Catch: Exception -> L21
        int r5 = 0;
    L4:
        if (r5 >= r3) goto L17;
        FontResourcesParserCompat.FontFileResourceEntry entry = r2[r5];     // Catch: Exception -> L21
        Font.Builder r7 = new Font.Builder(resources, entry.getResourceId()).setWeight(entry.getWeight());     // Catch: IOException -> L15 Exception -> L21
        if (entry.isItalic() == false) goto L9;
        int r8 = 1;
    L10:
        Font platformFont = r7.setSlant(r8).setTtcIndex(entry.getTtcIndex()).setFontVariationSettings(entry.getVariationSettings()).build();     // Catch: IOException -> L15 Exception -> L21
        if (familyBuilder != null) goto L13;
        familyBuilder = new FontFamily.Builder(platformFont);     // Catch: IOException -> L15 Exception -> L21
        goto L16
    L13:
        familyBuilder.addFont(platformFont);     // Catch: IOException -> L15 Exception -> L21
        goto L16
    L9:
        r8 = 0;
    L16:
        r5 = r5 + 1;
        goto L4
    L17:
        if (familyBuilder != null) goto L19;
        return null;
    L19:
        FontFamily family = familyBuilder.build();     // Catch: Exception -> L21
        return new Typeface.CustomFallbackBuilder(family).setStyle(findBaseFont(family, style).getStyle()).build();
    L21:
        e = move-exception;
        Log.w(TAG, "Font load failed", e);
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int id, String path, int style) {
        Font font = new Font.Builder(resources, id).build();     // Catch: Exception -> L5
        FontFamily family = new FontFamily.Builder(font).build();     // Catch: Exception -> L5
        return new Typeface.CustomFallbackBuilder(family).setStyle(font.getStyle()).build();
    L5:
        e = move-exception;
        Log.w(TAG, "Font load failed", e);
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    Typeface createWeightStyle(Context context, Typeface base, int weight, boolean italic) {
        return Typeface.create(base, weight, italic);
    }
}
