package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.util.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class IntentCompat {
    public static final String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
    public static final String EXTRA_TIME = "android.intent.extra.TIME";

    static class Api33Impl {
        private Api33Impl() {
        }

        static <T> T getParcelableExtra(Intent r1, String r2, Class<T> r3) {
            return (T) r1.getParcelableExtra(r2, r3);
        }

        static <T> T[] getParcelableArrayExtra(Intent r1, String r2, Class<T> r3) {
            return (T[]) r1.getParcelableArrayExtra(r2, r3);
        }

        static <T> ArrayList<T> getParcelableArrayListExtra(Intent in, String name, Class<? extends T> clazz) {
            return in.getParcelableArrayListExtra(name, clazz);
        }

        static <T extends Serializable> T getSerializableExtra(Intent r1, String r2, Class<T> r3) {
            return (T) r1.getSerializableExtra(r2, r3);
        }
    }

    private IntentCompat() {
    }

    public static Intent makeMainSelectorActivity(String selectorAction, String selectorCategory) {
        return Intent.makeMainSelectorActivity(selectorAction, selectorCategory);
    }

    public static Intent createManageUnusedAppRestrictionsIntent(Context context, String packageName) {
        if (PackageManagerCompat.areUnusedAppRestrictionsAvailable(context.getPackageManager()) == false) goto L14;
        if (Build.VERSION.SDK_INT >= 31) goto L7;
        Intent permissionRevocationSettingsIntent = new Intent(PackageManagerCompat.ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", packageName, null));
        if (Build.VERSION.SDK_INT < 30) goto L11;
        return permissionRevocationSettingsIntent;
    L11:
        String verifierPackageName = PackageManagerCompat.getPermissionRevocationVerifierApp(context.getPackageManager());
        return permissionRevocationSettingsIntent.setPackage((String) Preconditions.checkNotNull(verifierPackageName));
    L7:
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", packageName, null));
    L14:
        throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
    }

    public static <T> T getParcelableExtra(Intent r2, String r3, Class<T> r4) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        T r0 = (T) r2.getParcelableExtra(r3);
        if (r4.isInstance(r0) == true) goto L11;
        return null;
    L11:
        return r0;
    L5:
        return (T) Api33Impl.getParcelableExtra(r2, r3, r4);
    }

    public static Parcelable[] getParcelableArrayExtra(Intent in, String name, Class<? extends Parcelable> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return (Parcelable[]) Api33Impl.getParcelableArrayExtra(in, name, clazz);
    L7:
        return in.getParcelableArrayExtra(name);
    }

    public static <T> ArrayList<T> getParcelableArrayListExtra(Intent in, String name, Class<? extends T> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api33Impl.getParcelableArrayListExtra(in, name, clazz);
    L7:
        return in.getParcelableArrayListExtra(name);
    }

    public static <T extends Serializable> T getSerializableExtra(Intent r2, String r3, Class<T> r4) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        T r0 = (T) r2.getSerializableExtra(r3);
        if (r4.isInstance(r0) == true) goto L11;
        return null;
    L11:
        return r0;
    L5:
        return (T) Api33Impl.getSerializableExtra(r2, r3, r4);
    }
}
