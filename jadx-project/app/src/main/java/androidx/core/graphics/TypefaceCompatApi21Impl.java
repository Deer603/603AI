package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static final String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final String TAG = "TypefaceCompatApi21Impl";
    private static Method sAddFontWeightStyle;
    private static Method sCreateFromFamiliesWithDefault;
    private static Class<?> sFontFamily;
    private static Constructor<?> sFontFamilyCtor;
    private static boolean sHasInitBeenCalled;

    TypefaceCompatApi21Impl() {
    }

    static {
        sHasInitBeenCalled = false;
    }

    private static void init() {
        if (sHasInitBeenCalled == false) goto L5;
        return;
    L5:
        sHasInitBeenCalled = true;
        Class<?> fontFamilyClass = Class.forName(FONT_FAMILY_CLASS);     // Catch: Throwable -> L8
        Constructor<?> fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);     // Catch: Throwable -> L8
        Method addFontMethod = fontFamilyClass.getMethod(ADD_FONT_WEIGHT_STYLE_METHOD, new Class[]{String.class, Integer.TYPE, Boolean.TYPE});     // Catch: Throwable -> L8
        Object familyArray = Array.newInstance(fontFamilyClass, 1);     // Catch: Throwable -> L8
        Method createFromFamiliesWithDefaultMethod = Typeface.class.getMethod(CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD, new Class[]{familyArray.getClass()});     // Catch: Throwable -> L8
    L10:
        sFontFamilyCtor = fontFamilyCtor;
        sFontFamily = fontFamilyClass;
        sAddFontWeightStyle = addFontMethod;
        sCreateFromFamiliesWithDefault = createFromFamiliesWithDefaultMethod;
        return;
    L8:
        e = move-exception;
        Log.e(TAG, e.getClass().getName(), e);
        fontFamilyClass = null;
        fontFamilyCtor = null;
        addFontMethod = null;
        createFromFamiliesWithDefaultMethod = null;
        goto L10
    }

    private File getFile(ParcelFileDescriptor fd) {
        String path = Os.readlink("/proc/self/fd/" + fd.getFd());     // Catch: ErrnoException -> L8
        if (OsConstants.S_ISREG(Os.stat(path).st_mode) == false) goto L7;
        return new File(path);
    L7:
        return null;
    L9:
        return null;
    }

    private static Object newFamily() {
        init();
        return sFontFamilyCtor.newInstance(new Object[0]);
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    private static Typeface createFromFamiliesWithDefault(Object family) {
        init();
        Object familyArray = Array.newInstance(sFontFamily, 1);     // Catch: Throwable -> L5 IllegalAccessException -> L7
        Array.set(familyArray, 0, family);     // Catch: Throwable -> L5 IllegalAccessException -> L7
        return (Typeface) sCreateFromFamiliesWithDefault.invoke(null, new Object[]{familyArray});
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    private static boolean addFontWeightStyle(Object family, String name, int weight, boolean style) {
        init();
        Boolean result = (Boolean) sAddFontWeightStyle.invoke(family, new Object[]{name, Integer.valueOf(weight), Boolean.valueOf(style)});     // Catch: Throwable -> L5 IllegalAccessException -> L7
        return result.booleanValue();
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fonts, int style) {
        if (fonts.length >= 1) goto L5;
        return null;
    L5:
        FontsContractCompat.FontInfo bestFont = findBestInfo(fonts, style);
        ContentResolver resolver = context.getContentResolver();
        ParcelFileDescriptor pfd = resolver.openFileDescriptor(bestFont.getUri(), "r", cancellationSignal);     // Catch: IOException -> L39
        if (pfd != null) goto L46;
        if (pfd == null) goto L10;
        pfd.close();     // Catch: IOException -> L39
    L10:
        return null;
    L46:
        File file = getFile(pfd);     // Catch: Throwable -> L32
        if (file != null) goto L14;
    L20:
        FileInputStream fis = new FileInputStream(pfd.getFileDescriptor());     // Catch: Throwable -> L32
        Typeface r6 = super.createFromInputStream(context, fis);     // Catch: Throwable -> L26
        fis.close();     // Catch: Throwable -> L32
        if (pfd == null) goto L25;
        pfd.close();     // Catch: IOException -> L39
    L25:
        return r6;
    L26:
        th = move-exception;
        fis.close();     // Catch: Throwable -> L29
    L31:
        throw th;     // Catch: Throwable -> L32
    L29:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L32
        goto L31
    L14:
        if (file.canRead() == false) goto L20;
        Typeface r5 = Typeface.createFromFile(file);     // Catch: Throwable -> L32
        if (pfd == null) goto L19;
        pfd.close();     // Catch: IOException -> L39
    L19:
        return r5;
    L32:
        th = move-exception;
        if (pfd != null) goto L41;
    L38:
        throw th;     // Catch: IOException -> L39
    L41:
        pfd.close();     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L39
    L40:
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry entry, Resources resources, int style) {
        Object family = newFamily();
        FontResourcesParserCompat.FontFileResourceEntry[] r1 = entry.getEntries();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L23;
        FontResourcesParserCompat.FontFileResourceEntry e = r1[r3];
        File tmpFile = TypefaceCompatUtil.getTempFile(context);
        if (tmpFile == null) goto L6;
    L16:
        th = move-exception;
        tmpFile.delete();
        throw th;
    L8:
        if (TypefaceCompatUtil.copyToFile(tmpFile, resources, e.getResourceId()) == false) goto L9;
        if (addFontWeightStyle(family, tmpFile.getPath(), e.getWeight(), e.isItalic()) == false) goto L13;
        tmpFile.delete();
        r3 = r3 + 1;
        goto L3
    L13:
        tmpFile.delete();
        return null;
        goto L20
    L9:
        tmpFile.delete();
        return null;
    L20:
        tmpFile.delete();
        return null;
    L6:
        return null;
    L23:
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
