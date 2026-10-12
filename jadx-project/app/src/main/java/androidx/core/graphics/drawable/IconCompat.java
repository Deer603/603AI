package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public class IconCompat extends CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final PorterDuff.Mode DEFAULT_TINT_MODE = null;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;
    static final String EXTRA_INT1 = "int1";
    static final String EXTRA_INT2 = "int2";
    static final String EXTRA_OBJ = "obj";
    static final String EXTRA_STRING1 = "string1";
    static final String EXTRA_TINT_LIST = "tint_list";
    static final String EXTRA_TINT_MODE = "tint_mode";
    static final String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final String TAG = "IconCompat";
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    Object mObj1;
    public Parcelable mParcelable;
    public String mString1;
    public ColorStateList mTintList;
    PorterDuff.Mode mTintMode;
    public String mTintModeStr;
    public int mType;

    static class Api23Impl {
        private Api23Impl() {
        }

        static IconCompat createFromIcon(Context context, Icon icon) {
            switch(getType(icon)) {
                case 2: goto L10;
                case 3: goto L4;
                case 4: goto L9;
                case 5: goto L4;
                case 6: goto L7;
                default: goto L4;
            };
        L4:
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.mObj1 = icon;
            return iconCompat;
        L10:
            String resPackage = getResPackage(icon);
            return IconCompat.createWithResource(IconCompat.getResources(context, resPackage), resPackage, getResId(icon));
        L15:
            throw new IllegalArgumentException("Icon resource cannot be found");
        L7:
            return IconCompat.createWithAdaptiveBitmapContentUri(getUri(icon));
        L9:
            return IconCompat.createWithContentUri(getUri(icon));
        }

        static int getType(Object icon) {
            if (Build.VERSION.SDK_INT < 28) goto L18;
            return Api28Impl.getType(icon);
        L18:
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        L15:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon type " + icon, e);
            return -1;
        L9:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon type " + icon, e);
            return -1;
        L12:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon type " + icon, e);
            return -1;
        }

        static String getResPackage(Object icon) {
            if (Build.VERSION.SDK_INT < 28) goto L18;
            return Api28Impl.getResPackage(icon);
        L18:
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        L15:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon package", e);
            return null;
        L9:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon package", e);
            return null;
        L12:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon package", e);
            return null;
        }

        static IconCompat createFromIconInner(Object icon) {
            Preconditions.checkNotNull(icon);
            switch(getType(icon)) {
                case 2: goto L11;
                case 3: goto L4;
                case 4: goto L9;
                case 5: goto L4;
                case 6: goto L7;
                default: goto L4;
            };
        L4:
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.mObj1 = icon;
            return iconCompat;
        L7:
            return IconCompat.createWithAdaptiveBitmapContentUri(getUri(icon));
        L9:
            return IconCompat.createWithContentUri(getUri(icon));
        L11:
            return IconCompat.createWithResource(null, getResPackage(icon), getResId(icon));
        }

        static int getResId(Object icon) {
            if (Build.VERSION.SDK_INT < 28) goto L18;
            return Api28Impl.getResId(icon);
        L18:
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        L15:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon resource", e);
            return 0;
        L9:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon resource", e);
            return 0;
        L12:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon resource", e);
            return 0;
        }

        static Uri getUri(Object icon) {
            if (Build.VERSION.SDK_INT < 28) goto L18;
            return Api28Impl.getUri(icon);
        L18:
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        L15:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon uri", e);
            return null;
        L9:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon uri", e);
            return null;
        L12:
            e = move-exception;
            Log.e(IconCompat.TAG, "Unable to get icon uri", e);
            return null;
        }

        static Icon toIcon(IconCompat iconCompat, Context context) {
            switch(iconCompat.mType) {
                case -1: goto L30;
                case 0: goto L5;
                case 1: goto L21;
                case 2: goto L20;
                case 3: goto L19;
                case 4: goto L18;
                case 5: goto L17;
                case 6: goto L7;
                default: goto L5;
            };
        L17:
            Icon icon = Api26Impl.createWithAdaptiveBitmap((Bitmap) iconCompat.mObj1);
        L23:
            if (iconCompat.mTintList == null) goto L26;
            icon.setTintList(iconCompat.mTintList);
        L26:
            if (iconCompat.mTintMode == IconCompat.DEFAULT_TINT_MODE) goto L28;
            icon.setTintMode(iconCompat.mTintMode);
        L28:
            return icon;
        L18:
            icon = Icon.createWithContentUri((String) iconCompat.mObj1);
            goto L23
        L19:
            icon = Icon.createWithData((byte[]) iconCompat.mObj1, iconCompat.mInt1, iconCompat.mInt2);
            goto L23
        L20:
            icon = Icon.createWithResource(iconCompat.getResPackage(), iconCompat.mInt1);
            goto L23
        L21:
            icon = Icon.createWithBitmap((Bitmap) iconCompat.mObj1);
            goto L23
        L5:
            throw new IllegalArgumentException("Unknown type");
        L7:
            if (Build.VERSION.SDK_INT < 30) goto L9;
            icon = Api30Impl.createWithAdaptiveBitmapContentUri(iconCompat.getUri());
            goto L23
        L9:
            if (context == null) goto L16;
            InputStream is = iconCompat.getUriInputStream(context);
            if (is == null) goto L14;
            icon = Api26Impl.createWithAdaptiveBitmap(BitmapFactory.decodeStream(is));
            goto L23
        L14:
            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.getUri());
        L16:
            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.getUri());
        L30:
            return (Icon) iconCompat.mObj1;
        }

        static Drawable loadDrawable(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static Drawable createAdaptiveIconDrawable(Drawable backgroundDrawable, Drawable foregroundDrawable) {
            return new AdaptiveIconDrawable(backgroundDrawable, foregroundDrawable);
        }

        static Icon createWithAdaptiveBitmap(Bitmap bits) {
            return Icon.createWithAdaptiveBitmap(bits);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static String getResPackage(Object icon) {
            return ((Icon) icon).getResPackage();
        }

        static int getType(Object icon) {
            return ((Icon) icon).getType();
        }

        static int getResId(Object icon) {
            return ((Icon) icon).getResId();
        }

        static Uri getUri(Object icon) {
            return ((Icon) icon).getUri();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static Icon createWithAdaptiveBitmapContentUri(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    static {
        DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    }

    public static IconCompat createWithResource(Context context, int resId) {
        ObjectsCompat.requireNonNull(context);
        return createWithResource(context.getResources(), context.getPackageName(), resId);
    }

    public static IconCompat createWithResource(Resources r, String pkg, int resId) {
        ObjectsCompat.requireNonNull(pkg);
        if (resId == 0) goto L15;
        IconCompat rep = new IconCompat(2);
        rep.mInt1 = resId;
        if (r != null) goto L16;
        rep.mObj1 = pkg;
    L12:
        rep.mString1 = pkg;
        return rep;
    L16:
        rep.mObj1 = r.getResourceName(resId);     // Catch: Resources.NotFoundException -> L8
    L10:
        throw new IllegalArgumentException("Icon resource cannot be found");
    L15:
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static IconCompat createWithBitmap(Bitmap bits) {
        ObjectsCompat.requireNonNull(bits);
        IconCompat rep = new IconCompat(1);
        rep.mObj1 = bits;
        return rep;
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap bits) {
        ObjectsCompat.requireNonNull(bits);
        IconCompat rep = new IconCompat(5);
        rep.mObj1 = bits;
        return rep;
    }

    public static IconCompat createWithData(byte[] data, int offset, int length) {
        ObjectsCompat.requireNonNull(data);
        IconCompat rep = new IconCompat(3);
        rep.mObj1 = data;
        rep.mInt1 = offset;
        rep.mInt2 = length;
        return rep;
    }

    public static IconCompat createWithContentUri(String uri) {
        ObjectsCompat.requireNonNull(uri);
        IconCompat rep = new IconCompat(4);
        rep.mObj1 = uri;
        return rep;
    }

    public static IconCompat createWithContentUri(Uri uri) {
        ObjectsCompat.requireNonNull(uri);
        return createWithContentUri(uri.toString());
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(String uri) {
        ObjectsCompat.requireNonNull(uri);
        IconCompat rep = new IconCompat(6);
        rep.mObj1 = uri;
        return rep;
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(Uri uri) {
        ObjectsCompat.requireNonNull(uri);
        return createWithAdaptiveBitmapContentUri(uri.toString());
    }

    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
    }

    IconCompat(int mType) {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
        this.mType = mType;
    }

    public int getType() {
        if (this.mType != (-1)) goto L7;
        return Api23Impl.getType(this.mObj1);
    L7:
        return this.mType;
    }

    public String getResPackage() {
        if (this.mType != (-1)) goto L7;
        return Api23Impl.getResPackage(this.mObj1);
    L7:
        if (this.mType != 2) goto L18;
        if (this.mString1 == null) goto L16;
        if (TextUtils.isEmpty(this.mString1) == true) goto L16;
        return this.mString1;
    L16:
        return ((String) this.mObj1).split(":", -1)[0];
    L18:
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int getResId() {
        if (this.mType != (-1)) goto L7;
        return Api23Impl.getResId(this.mObj1);
    L7:
        if (this.mType != 2) goto L11;
        return this.mInt1;
    L11:
        throw new IllegalStateException("called getResId() on " + this);
    }

    public Bitmap getBitmap() {
        if (this.mType != (-1)) goto L11;
        if ((this.mObj1 instanceof Bitmap) == true) goto L7;
        return null;
    L7:
        return (Bitmap) this.mObj1;
    L11:
        if (this.mType != 1) goto L15;
        return (Bitmap) this.mObj1;
    L15:
        if (this.mType != 5) goto L19;
        return createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
    L19:
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public Uri getUri() {
        if (this.mType != (-1)) goto L7;
        return Api23Impl.getUri(this.mObj1);
    L7:
        if (this.mType == 4) goto L14;
        if (this.mType == 6) goto L14;
        throw new IllegalStateException("called getUri() on " + this);
    L14:
        return Uri.parse((String) this.mObj1);
    }

    public IconCompat setTint(int tint) {
        return setTintList(ColorStateList.valueOf(tint));
    }

    public IconCompat setTintList(ColorStateList tintList) {
        this.mTintList = tintList;
        return this;
    }

    public IconCompat setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    @Deprecated
    public Icon toIcon() {
        return toIcon(null);
    }

    public Icon toIcon(Context context) {
        return Api23Impl.toIcon(this, context);
    }

    public void checkResource(Context context) {
        if (this.mType == 2) goto L5;
        return;
    L5:
        if (this.mObj1 == null) goto L18;
        String fullResName = (String) this.mObj1;
        if (fullResName.contains(":") == true) goto L9;
        return;
    L9:
        String resName = fullResName.split(":", -1)[1];
        String resType = resName.split("/", -1)[0];
        String resName2 = resName.split("/", -1)[1];
        String resPackage = fullResName.split(":", -1)[0];
        if ("0_resource_name_obfuscated".equals(resName2) == false) goto L13;
        Log.i(TAG, "Found obfuscated resource, not trying to update resource id for it");
        return;
    L13:
        String appPackage = getResPackage();
        Resources res = getResources(context, appPackage);
        int id = res.getIdentifier(resName2, resType, resPackage);
        if (this.mInt1 == id) goto L19;
        Log.i(TAG, "Id has changed for " + appPackage + " " + fullResName);
        this.mInt1 = id;
        return;
    L19:
        return;
    }

    public Drawable loadDrawable(Context context) {
        checkResource(context);
        return Api23Impl.loadDrawable(toIcon(context), context);
    }

    private Drawable loadDrawableInner(Context context) {
        switch(this.mType) {
            case 1: goto L26;
            case 2: goto L17;
            case 3: goto L16;
            case 4: goto L11;
            case 5: goto L10;
            case 6: goto L5;
            default: goto L27;
        };
    L5:
        InputStream is = getUriInputStream(context);
        if (is == null) goto L27;
        return Api26Impl.createAdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(is)));
    L11:
        InputStream is2 = getUriInputStream(context);
        if (is2 == null) goto L27;
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(is2));
    L17:
        String resPackage = getResPackage();
        if (TextUtils.isEmpty(resPackage) == false) goto L20;
        resPackage = context.getPackageName();
    L20:
        Resources res = getResources(context, resPackage);
        return ResourcesCompat.getDrawable(res, this.mInt1, context.getTheme());
    L23:
        e = move-exception;
        Log.e(TAG, String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.mInt1), this.mObj1}), e);
    L27:
        return null;
    L10:
        return new BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, false));
    L16:
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.mObj1, this.mInt1, this.mInt2));
    L26:
        return new BitmapDrawable(context.getResources(), (Bitmap) this.mObj1);
    }

    public InputStream getUriInputStream(Context context) {
        Uri uri = getUri();
        String scheme = uri.getScheme();
        if ("content".equals(scheme) == false) goto L5;
    L17:
        return context.getContentResolver().openInputStream(uri);
    L13:
        e = move-exception;
        Log.w(TAG, "Unable to load image from URI: " + uri, e);
        return null;
    L5:
        if ("file".equals(scheme) == true) goto L17;
        return new FileInputStream(new File((String) this.mObj1));
    L9:
        e = move-exception;
        Log.w(TAG, "Unable to load image from path: " + uri, e);
        return null;
    }

    static Resources getResources(Context context, String resPackage) {
        if ("android".equals(resPackage) == true) goto L5;
        PackageManager pm = context.getPackageManager();
        ApplicationInfo ai = pm.getApplicationInfo(resPackage, 8192);     // Catch: PackageManager.NameNotFoundException -> L12
        if (ai == null) goto L11;
        return pm.getResourcesForApplication(ai);
    L11:
        return null;
    L12:
        e = move-exception;
        Log.e(TAG, String.format("Unable to find pkg=%s for icon", new Object[]{resPackage}), e);
        return null;
    L5:
        return Resources.getSystem();
    }

    public void addToShortcutIntent(Intent outIntent, Drawable badge, Context c) {
        checkResource(c);
        switch(this.mType) {
            case 1: goto L23;
            case 2: goto L30;
            case 3: goto L5;
            case 4: goto L5;
            case 5: goto L6;
            default: goto L5;
        };
    L6:
        Bitmap icon = createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
    L26:
        if (badge == null) goto L28;
        int w = icon.getWidth();
        int h = icon.getHeight();
        badge.setBounds(w / 2, h / 2, w, h);
        badge.draw(new Canvas(icon));
    L28:
        outIntent.putExtra("android.intent.extra.shortcut.ICON", icon);
        return;
    L23:
        icon = (Bitmap) this.mObj1;
        if (badge == null) goto L26;
        icon = icon.copy(icon.getConfig(), true);
        goto L26
    L30:
        Context context = c.createPackageContext(getResPackage(), 0);     // Catch: PackageManager.NameNotFoundException -> L20
        if (badge != null) goto L11;
        outIntent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, this.mInt1));     // Catch: PackageManager.NameNotFoundException -> L20
        return;
    L11:
        Drawable dr = ContextCompat.getDrawable(context, this.mInt1);     // Catch: PackageManager.NameNotFoundException -> L20
        if (dr.getIntrinsicWidth() > 0) goto L14;
    L17:
        int size = ((ActivityManager) context.getSystemService("activity")).getLauncherLargeIconSize();     // Catch: PackageManager.NameNotFoundException -> L20
        Bitmap icon2 = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);     // Catch: PackageManager.NameNotFoundException -> L20
        Bitmap icon3 = icon2;
    L18:
        dr.setBounds(0, 0, icon3.getWidth(), icon3.getHeight());     // Catch: PackageManager.NameNotFoundException -> L20
        dr.draw(new Canvas(icon3));     // Catch: PackageManager.NameNotFoundException -> L20
        icon = icon3;
        goto L26
    L14:
        if (dr.getIntrinsicHeight() <= 0) goto L17;
        icon3 = Bitmap.createBitmap(dr.getIntrinsicWidth(), dr.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);     // Catch: PackageManager.NameNotFoundException -> L20
    L20:
        e = move-exception;
        throw new IllegalArgumentException("Can't find package " + this.mObj1, e);
    L5:
        throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch(this.mType) {
            case -1: goto L9;
            case 0: goto L5;
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            case 4: goto L7;
            case 5: goto L8;
            case 6: goto L7;
            default: goto L5;
        };
    L6:
        bundle.putByteArray(EXTRA_OBJ, (byte[]) this.mObj1);
    L10:
        bundle.putInt("type", this.mType);
        bundle.putInt(EXTRA_INT1, this.mInt1);
        bundle.putInt(EXTRA_INT2, this.mInt2);
        bundle.putString(EXTRA_STRING1, this.mString1);
        if (this.mTintList == null) goto L14;
        bundle.putParcelable(EXTRA_TINT_LIST, this.mTintList);
    L14:
        if (this.mTintMode == DEFAULT_TINT_MODE) goto L16;
        bundle.putString(EXTRA_TINT_MODE, this.mTintMode.name());
    L16:
        return bundle;
    L7:
        bundle.putString(EXTRA_OBJ, (String) this.mObj1);
        goto L10
    L8:
        bundle.putParcelable(EXTRA_OBJ, (Bitmap) this.mObj1);
        goto L10
    L9:
        bundle.putParcelable(EXTRA_OBJ, (Parcelable) this.mObj1);
        goto L10
    L5:
        throw new IllegalArgumentException("Invalid icon");
    }

    public String toString() {
        if (this.mType == (-1)) goto L5;
        StringBuilder sb = new StringBuilder("Icon(typ=").append(typeToString(this.mType));
        switch(this.mType) {
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L14;
            case 6: goto L9;
            default: goto L16;
        };
    L9:
        sb.append(" uri=").append(this.mObj1);
        goto L16
    L10:
        sb.append(" len=").append(this.mInt1);
        if (this.mInt2 == 0) goto L16;
        sb.append(" off=").append(this.mInt2);
        goto L16
    L13:
        sb.append(" pkg=").append(this.mString1).append(" id=").append(String.format("0x%08x", new Object[]{Integer.valueOf(getResId())}));
        goto L16
    L14:
        sb.append(" size=").append(((Bitmap) this.mObj1).getWidth()).append("x").append(((Bitmap) this.mObj1).getHeight());
    L16:
        if (this.mTintList == null) goto L19;
        sb.append(" tint=");
        sb.append(this.mTintList);
    L19:
        if (this.mTintMode == DEFAULT_TINT_MODE) goto L21;
        sb.append(" mode=").append(this.mTintMode);
    L21:
        sb.append(")");
        return sb.toString();
    L5:
        return String.valueOf(this.mObj1);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean isStream) {
        this.mTintModeStr = this.mTintMode.name();
        switch(this.mType) {
            case -1: goto L12;
            case 0: goto L22;
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            case 4: goto L5;
            case 5: goto L8;
            case 6: goto L5;
            default: goto L22;
        };
    L5:
        this.mData = this.mObj1.toString().getBytes(Charset.forName("UTF-16"));
        return;
    L6:
        this.mData = (byte[]) this.mObj1;
        return;
    L7:
        this.mData = ((String) this.mObj1).getBytes(Charset.forName("UTF-16"));
        return;
    L8:
        Object r0 = this.mObj1;
        if (isStream == false) goto L11;
        Bitmap bitmap = (Bitmap) r0;
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 90, data);
        this.mData = data.toByteArray();
        return;
    L11:
        this.mParcelable = (Parcelable) r0;
        return;
    L12:
        if (isStream == true) goto L15;
        this.mParcelable = (Parcelable) this.mObj1;
        return;
    L15:
        throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.mTintMode = PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch(this.mType) {
            case -1: goto L16;
            case 0: goto L27;
            case 1: goto L12;
            case 2: goto L6;
            case 3: goto L5;
            case 4: goto L6;
            case 5: goto L12;
            case 6: goto L6;
            default: goto L27;
        };
    L5:
        this.mObj1 = this.mData;
        return;
    L6:
        this.mObj1 = new String(this.mData, Charset.forName("UTF-16"));
        if (this.mType == 2) goto L9;
        return;
    L9:
        if (this.mString1 != null) goto L22;
        this.mString1 = ((String) this.mObj1).split(":", -1)[0];
        return;
    L22:
        return;
    L27:
        return;
    L12:
        if (this.mParcelable == null) goto L14;
        this.mObj1 = this.mParcelable;
        return;
    L14:
        this.mObj1 = this.mData;
        this.mType = 3;
        this.mInt1 = 0;
        this.mInt2 = this.mData.length;
        return;
    L16:
        if (this.mParcelable == null) goto L19;
        this.mObj1 = this.mParcelable;
        return;
    L19:
        throw new IllegalArgumentException("Invalid icon");
    }

    private static String typeToString(int x) {
        switch(x) {
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L3;
        };
    L3:
        return "UNKNOWN";
    L5:
        return "URI_MASKABLE";
    L7:
        return "BITMAP_MASKABLE";
    L9:
        return "URI";
    L11:
        return "DATA";
    L13:
        return "RESOURCE";
    L15:
        return "BITMAP";
    }

    public static IconCompat createFromBundle(Bundle bundle) {
        int type = bundle.getInt("type");
        IconCompat icon = new IconCompat(type);
        icon.mInt1 = bundle.getInt(EXTRA_INT1);
        icon.mInt2 = bundle.getInt(EXTRA_INT2);
        icon.mString1 = bundle.getString(EXTRA_STRING1);
        if (bundle.containsKey(EXTRA_TINT_LIST) == false) goto L6;
        icon.mTintList = (ColorStateList) bundle.getParcelable(EXTRA_TINT_LIST);
    L6:
        if (bundle.containsKey(EXTRA_TINT_MODE) == false) goto L9;
        icon.mTintMode = PorterDuff.Mode.valueOf(bundle.getString(EXTRA_TINT_MODE));
    L9:
        switch(type) {
            case -1: goto L14;
            case 0: goto L10;
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L13;
            case 5: goto L14;
            case 6: goto L13;
            default: goto L10;
        };
    L10:
        Log.w(TAG, "Unknown type " + type);
        return null;
    L12:
        icon.mObj1 = bundle.getByteArray(EXTRA_OBJ);
    L15:
        return icon;
    L13:
        icon.mObj1 = bundle.getString(EXTRA_OBJ);
        goto L15
    L14:
        icon.mObj1 = bundle.getParcelable(EXTRA_OBJ);
        goto L15
    }

    public static IconCompat createFromIcon(Context context, Icon icon) {
        Preconditions.checkNotNull(icon);
        return Api23Impl.createFromIcon(context, icon);
    }

    public static IconCompat createFromIcon(Icon icon) {
        return Api23Impl.createFromIconInner(icon);
    }

    public static IconCompat createFromIconOrNullIfZeroResId(Icon icon) {
        if (Api23Impl.getType(icon) != 2) goto L9;
        if (Api23Impl.getResId(icon) != 0) goto L9;
        return null;
    L9:
        return Api23Impl.createFromIconInner(icon);
    }

    static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap adaptiveIconBitmap, boolean addShadow) {
        int size = (int) (Math.min(adaptiveIconBitmap.getWidth(), adaptiveIconBitmap.getHeight()) * DEFAULT_VIEW_PORT_SCALE);
        Bitmap icon = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(icon);
        Paint paint = new Paint(3);
        float center = size * 0.5f;
        float radius = ICON_DIAMETER_FACTOR * center;
        if (addShadow == false) goto L5;
        float blur = size * BLUR_FACTOR;
        paint.setColor(0);
        paint.setShadowLayer(blur, 0.0f, size * KEY_SHADOW_OFFSET_FACTOR, 1023410176);
        canvas.drawCircle(center, center, radius, paint);
        paint.setShadowLayer(blur, 0.0f, 0.0f, 503316480);
        canvas.drawCircle(center, center, radius, paint);
        paint.clearShadowLayer();
    L5:
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        BitmapShader shader = new BitmapShader(adaptiveIconBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix shift = new Matrix();
        shift.setTranslate((-(adaptiveIconBitmap.getWidth() - size)) / 2.0f, (-(adaptiveIconBitmap.getHeight() - size)) / 2.0f);
        shader.setLocalMatrix(shift);
        paint.setShader(shader);
        canvas.drawCircle(center, center, radius, paint);
        canvas.setBitmap(null);
        return icon;
    }
}
