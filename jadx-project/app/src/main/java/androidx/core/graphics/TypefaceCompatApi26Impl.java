package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {
    private static final String ABORT_CREATION_METHOD = "abortCreation";
    private static final String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
    private static final String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final String FREEZE_METHOD = "freeze";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final String TAG = "TypefaceCompatApi26Impl";
    protected final Method mAbortCreation;
    protected final Method mAddFontFromAssetManager;
    protected final Method mAddFontFromBuffer;
    protected final Method mCreateFromFamiliesWithDefault;
    protected final Class<?> mFontFamily;
    protected final Constructor<?> mFontFamilyCtor;
    protected final Method mFreeze;

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public /* bridge */ /* synthetic */ Typeface createFromFontInfoWithFallback(Context r1, CancellationSignal r2, List r3, int r4) {
        return super.createFromFontInfoWithFallback(r1, r2, r3, r4);
    }

    public TypefaceCompatApi26Impl() {
        Class<?> fontFamily = obtainFontFamily();     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Constructor<?> fontFamilyCtor = obtainFontFamilyCtor(fontFamily);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method addFontFromAssetManager = obtainAddFontFromAssetManagerMethod(fontFamily);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method addFontFromAssetManager2 = obtainAddFontFromBufferMethod(fontFamily);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method addFontFromBuffer = obtainFreezeMethod(fontFamily);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method freeze = obtainAbortCreationMethod(fontFamily);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
        Method abortCreation = obtainCreateFromFamiliesWithDefaultMethod(fontFamily);     // Catch: NoSuchMethodException -> L5 Throwable -> L7
    L9:
        this.mFontFamily = fontFamily;
        this.mFontFamilyCtor = fontFamilyCtor;
        this.mAddFontFromAssetManager = addFontFromAssetManager;
        this.mAddFontFromBuffer = addFontFromAssetManager2;
        this.mFreeze = addFontFromBuffer;
        this.mAbortCreation = freeze;
        this.mCreateFromFamiliesWithDefault = abortCreation;
        return;
    L7:
        e = move-exception;
        Log.e(TAG, "Unable to collect necessary methods for class " + e.getClass().getName(), e);
        fontFamily = null;
        fontFamilyCtor = null;
        addFontFromAssetManager = null;
        addFontFromAssetManager2 = null;
        addFontFromBuffer = null;
        freeze = null;
        abortCreation = null;
        goto L9
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
        if (this.mAddFontFromAssetManager != null) goto L6;
        Log.w(TAG, "Unable to collect necessary private methods. Fallback to legacy implementation.");
    L6:
        if (this.mAddFontFromAssetManager == null) goto L8;
        return true;
    L8:
        return false;
    }

    private Object newFamily() {
        return this.mFontFamilyCtor.newInstance(new Object[0]);
    L9:
        return null;
    }

    private boolean addFontFromAssetManager(Context context, Object family, String fileName, int ttcIndex, int weight, int style, FontVariationAxis[] axes) {
        return ((Boolean) this.mAddFontFromAssetManager.invoke(family, new Object[]{context.getAssets(), fileName, 0, false, Integer.valueOf(ttcIndex), Integer.valueOf(weight), Integer.valueOf(style), axes})).booleanValue();
    L8:
        return false;
    }

    private boolean addFontFromBuffer(Object family, ByteBuffer buffer, int ttcIndex, int weight, int style) {
        return ((Boolean) this.mAddFontFromBuffer.invoke(family, new Object[]{buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Integer.valueOf(style)})).booleanValue();
    L7:
        return false;
    }

    protected Typeface createFromFamiliesWithDefault(Object family) {
        Object familyArray = Array.newInstance(this.mFontFamily, 1);     // Catch: InvocationTargetException -> L5 Throwable -> L7
        Array.set(familyArray, 0, family);     // Catch: InvocationTargetException -> L5 Throwable -> L7
        return (Typeface) this.mCreateFromFamiliesWithDefault.invoke(null, new Object[]{familyArray, -1, -1});
    L8:
        return null;
    }

    private boolean freeze(Object family) {
        return ((Boolean) this.mFreeze.invoke(family, new Object[0])).booleanValue();
    L8:
        return false;
    }

    private void abortCreation(Object family) {
        this.mAbortCreation.invoke(family, new Object[0]);     // Catch: InvocationTargetException -> L4 IllegalAccessException -> L6
    L11:
        return;
    L8:
        return;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontFamilyFilesResourceEntry(Context r14, FontResourcesParserCompat.FontFamilyFilesResourceEntry r15, Resources r16, int r17) {
        if (isFontFamilyPrivateAPIAvailable() == false) goto L5;
        Object r3 = newFamily();
        if (r3 != null) goto L9;
        return null;
    L9:
        FontResourcesParserCompat.FontFileResourceEntry[] r9 = r15.getEntries();
        int r10 = r9.length;
        int r11 = 0;
    L10:
        if (r11 >= r10) goto L17;
        FontResourcesParserCompat.FontFileResourceEntry r12 = r9[r11];
        String r4 = r12.getFileName();
        int r5 = r12.getTtcIndex();
        int r6 = r12.getWeight();
        boolean r7 = r12.isItalic();
        if (addFontFromAssetManager(r14, r3, r4, r5, r6, r7 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(r12.getVariationSettings())) == false) goto L13;
        r11 = r11 + 1;
        goto L10
    L13:
        abortCreation(r3);
        return null;
    L17:
        if (freeze(r3) == true) goto L20;
        return null;
    L20:
        return createFromFamiliesWithDefault(r3);
    L5:
        return super.createFromFontFamilyFilesResourceEntry(r14, r15, r16, r17);
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontInfo(Context r17, CancellationSignal r18, FontsContractCompat.FontInfo[] r19, int r20) {
        if (r19.length >= 1) goto L6;
        return null;
    L6:
        if (isFontFamilyPrivateAPIAvailable() == true) goto L27;
        FontsContractCompat.FontInfo r2 = findBestInfo(r19, r20);
        ParcelFileDescriptor r0 = r17.getContentResolver().openFileDescriptor(r2.getUri(), "r", r18);     // Catch: IOException -> L25
        if (r0 != null) goto L52;
        if (r0 == null) goto L12;
        r0.close();     // Catch: IOException -> L25
    L12:
        return null;
    L52:
        Typeface r1 = new Typeface.Builder(r0.getFileDescriptor()).setWeight(r2.getWeight()).setItalic(r2.isItalic()).build();     // Catch: Throwable -> L17
        if (r0 == null) goto L16;
        r0.close();     // Catch: IOException -> L25
    L16:
        return r1;
    L17:
        th = move-exception;
        if (r0 == null) goto L61;
        r0.close();     // Catch: Throwable -> L22
        goto L26
    L62:
        throw th;     // Catch: IOException -> L25
    L22:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L25
        throw th;     // Catch: IOException -> L25
    L61:
        throw th;     // Catch: IOException -> L25
    L26:
        return null;
    L27:
        Map<Uri, ByteBuffer> r3 = TypefaceCompatUtil.readFontInfoIntoByteBuffer(r17, r19, r18);
        Object r4 = newFamily();
        if (r4 != null) goto L30;
        return null;
    L30:
        int r12 = r19.length;
        boolean r13 = false;
        int r14 = 0;
    L31:
        if (r14 >= r12) goto L41;
        FontsContractCompat.FontInfo r15 = r19[r14];
        ByteBuffer r5 = r3.get(r15.getUri());
        if (r5 == null) goto L40;
        if (addFontFromBuffer(r4, r5, r15.getTtcIndex(), r15.getWeight(), r15.isItalic() ? 1 : 0) == false) goto L37;
        r13 = true;
        goto L40
    L37:
        abortCreation(r4);
        return null;
    L40:
        r14 = r14 + 1;
        r13 = r13;
        goto L31
    L41:
        if (r13 == true) goto L45;
        abortCreation(r4);
        return null;
    L45:
        if (freeze(r4) == true) goto L47;
        return null;
    L47:
        Typeface r6 = createFromFamiliesWithDefault(r4);
        if (r6 != null) goto L51;
        return null;
    L51:
        return Typeface.create(r6, r20);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int id, String path, int style) {
        if (isFontFamilyPrivateAPIAvailable() == false) goto L5;
        Object fontFamily = newFamily();
        if (fontFamily != null) goto L10;
        return null;
    L10:
        if (addFontFromAssetManager(context, fontFamily, path, 0, -1, -1, null) == true) goto L14;
        abortCreation(fontFamily);
        return null;
    L14:
        if (freeze(fontFamily) == true) goto L17;
        return null;
    L17:
        return createFromFamiliesWithDefault(fontFamily);
    L5:
        return super.createFromResourcesFontFile(context, resources, id, path, style);
    }

    protected Class<?> obtainFontFamily() throws ClassNotFoundException {
        return Class.forName(FONT_FAMILY_CLASS);
    }

    protected Constructor<?> obtainFontFamilyCtor(Class<?> fontFamily) throws NoSuchMethodException {
        return fontFamily.getConstructor(new Class[0]);
    }

    protected Method obtainAddFontFromAssetManagerMethod(Class<?> fontFamily) throws NoSuchMethodException {
        return fontFamily.getMethod(ADD_FONT_FROM_ASSET_MANAGER_METHOD, new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
    }

    protected Method obtainAddFontFromBufferMethod(Class<?> fontFamily) throws NoSuchMethodException {
        return fontFamily.getMethod(ADD_FONT_FROM_BUFFER_METHOD, new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
    }

    protected Method obtainFreezeMethod(Class<?> fontFamily) throws NoSuchMethodException {
        return fontFamily.getMethod(FREEZE_METHOD, new Class[0]);
    }

    protected Method obtainAbortCreationMethod(Class<?> fontFamily) throws NoSuchMethodException {
        return fontFamily.getMethod(ABORT_CREATION_METHOD, new Class[0]);
    }

    protected Method obtainCreateFromFamiliesWithDefaultMethod(Class<?> fontFamily) throws NoSuchMethodException {
        Object familyArray = Array.newInstance(fontFamily, 1);
        Method m = Typeface.class.getDeclaredMethod(CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD, new Class[]{familyArray.getClass(), Integer.TYPE, Integer.TYPE});
        m.setAccessible(true);
        return m;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    Typeface createWeightStyle(Context context, Typeface base, int weight, boolean italic) {
        Typeface out = null;
        out = WeightTypefaceApi26.createWeightStyle(base, weight, italic);     // Catch: RuntimeException -> L5
    L6:
        if (out != null) goto L11;
        Typeface out2 = super.createWeightStyle(context, base, weight, italic);
        return out2;
    L11:
        return out;
    }
}
