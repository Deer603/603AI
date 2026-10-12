package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {
    private static final String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final String TAG = "TypefaceCompatApi24Impl";
    private static final Method sAddFontWeightStyle = null;
    private static final Method sCreateFromFamiliesWithDefault = null;
    private static final Class<?> sFontFamily = null;
    private static final Constructor<?> sFontFamilyCtor = null;

    TypefaceCompatApi24Impl() {
    }

    static {
        Class<?> fontFamilyClass = Class.forName(FONT_FAMILY_CLASS);     // Catch: Throwable -> L4
        Constructor<?> fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);     // Catch: Throwable -> L4
        Method addFontMethod = fontFamilyClass.getMethod(ADD_FONT_WEIGHT_STYLE_METHOD, new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});     // Catch: Throwable -> L4
        Object familyArray = Array.newInstance(fontFamilyClass, 1);     // Catch: Throwable -> L4
        Method createFromFamiliesWithDefaultMethod = Typeface.class.getMethod(CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD, new Class[]{familyArray.getClass()});     // Catch: Throwable -> L4
    L6:
        sFontFamilyCtor = fontFamilyCtor;
        sFontFamily = fontFamilyClass;
        sAddFontWeightStyle = addFontMethod;
        sCreateFromFamiliesWithDefault = createFromFamiliesWithDefaultMethod;
        return;
    L4:
        e = move-exception;
        Log.e(TAG, e.getClass().getName(), e);
        fontFamilyCtor = null;
        addFontMethod = null;
        fontFamilyClass = null;
        createFromFamiliesWithDefaultMethod = null;
        goto L6
    }

    public static boolean isUsable() {
        if (sAddFontWeightStyle != null) goto L6;
        Log.w(TAG, "Unable to collect necessary private methods.Fallback to legacy implementation.");
    L6:
        if (sAddFontWeightStyle == null) goto L8;
        return true;
    L8:
        return false;
    }

    private static Object newFamily() {
        return sFontFamilyCtor.newInstance(new Object[0]);
    L5:
        return null;
    }

    private static boolean addFontWeightStyle(Object family, ByteBuffer buffer, int ttcIndex, int weight, boolean style) {
        Boolean result = (Boolean) sAddFontWeightStyle.invoke(family, new Object[]{buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Boolean.valueOf(style)});     // Catch: InvocationTargetException -> L4 Throwable -> L6
        return result.booleanValue();
    L7:
        return false;
    }

    private static Typeface createFromFamiliesWithDefault(Object family) {
        Object familyArray = Array.newInstance(sFontFamily, 1);     // Catch: InvocationTargetException -> L5 Throwable -> L7
        Array.set(familyArray, 0, family);     // Catch: InvocationTargetException -> L5 Throwable -> L7
        return (Typeface) sCreateFromFamiliesWithDefault.invoke(null, new Object[]{familyArray});
    L8:
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fonts, int style) {
        Object family = newFamily();
        if (family != null) goto L5;
        return null;
    L5:
        SimpleArrayMap<Uri, ByteBuffer> bufferCache = new SimpleArrayMap();
        int r3 = fonts.length;
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L16;
        FontsContractCompat.FontInfo font = fonts[r4];
        Uri uri = font.getUri();
        ByteBuffer buffer = bufferCache.get(uri);
        if (buffer != null) goto L10;
        buffer = TypefaceCompatUtil.mmap(context, cancellationSignal, uri);
        bufferCache.put(uri, buffer);
    L10:
        if (buffer == null) goto L11;
        if (addFontWeightStyle(family, buffer, font.getTtcIndex(), font.getWeight(), font.isItalic()) == false) goto L14;
        r4 = r4 + 1;
        goto L6
    L14:
        return null;
    L11:
        return null;
    L16:
        Typeface typeface = createFromFamiliesWithDefault(family);
        if (typeface != null) goto L20;
        return null;
    L20:
        return Typeface.create(typeface, style);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry entry, Resources resources, int style) {
        Object family = newFamily();
        if (family != null) goto L5;
        return null;
    L5:
        FontResourcesParserCompat.FontFileResourceEntry[] r2 = entry.getEntries();
        int r3 = r2.length;
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L15;
        FontResourcesParserCompat.FontFileResourceEntry e = r2[r4];
        ByteBuffer buffer = TypefaceCompatUtil.copyToDirectBuffer(context, resources, e.getResourceId());
        if (buffer == null) goto L9;
        if (addFontWeightStyle(family, buffer, e.getTtcIndex(), e.getWeight(), e.isItalic()) == false) goto L12;
        r4 = r4 + 1;
        goto L6
    L12:
        return null;
    L9:
        return null;
    L15:
        return createFromFamiliesWithDefault(family);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    Typeface createWeightStyle(Context context, Typeface base, int weight, boolean italic) {
        Typeface out = null;
        out = WeightTypefaceApi21.createWeightStyle(base, weight, italic);     // Catch: RuntimeException -> L5
    L6:
        if (out != null) goto L11;
        Typeface out2 = super.createWeightStyle(context, base, weight, italic);
        return out2;
    L11:
        return out;
    }
}
