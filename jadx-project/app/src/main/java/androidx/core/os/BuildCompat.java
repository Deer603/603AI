package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

/* JADX INFO: compiled from: BuildCompat.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/core/os/BuildCompat;", "", "()V", "AD_SERVICES_EXTENSION_INT", "", "R_EXTENSION_INT", "S_EXTENSION_INT", "T_EXTENSION_INT", "isAtLeastB", "", "isAtLeastN", "isAtLeastNMR1", "isAtLeastO", "isAtLeastOMR1", "isAtLeastP", "isAtLeastPreReleaseCodename", "codename", "", "buildCodename", "isAtLeastQ", "isAtLeastR", "isAtLeastS", "isAtLeastSv2", "isAtLeastT", "isAtLeastU", "isAtLeastV", "Api30Impl", "PrereleaseSdkCheck", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT = 0;
    public static final BuildCompat INSTANCE = null;
    public static final int R_EXTENSION_INT = 0;
    public static final int S_EXTENSION_INT = 0;
    public static final int T_EXTENSION_INT = 0;

    /* JADX INFO: compiled from: BuildCompat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Landroidx/core/os/BuildCompat$Api30Impl;", "", "()V", "getExtensionVersion", "", "extension", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api30Impl {
        public static final Api30Impl INSTANCE = null;

        static {
            INSTANCE = new Api30Impl();
        }

        private Api30Impl() {
        }

        public final int getExtensionVersion(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    /* JADX INFO: compiled from: BuildCompat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface PrereleaseSdkCheck {
    }

    private BuildCompat() {
    }

    private static final Integer isAtLeastPreReleaseCodename$codenameToInt(String codename) {
        String r0 = codename.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r0, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (Intrinsics.areEqual(r0, "BAKLAVA") == true) goto L7;
        return null;
    L7:
        return 0;
    }

    @JvmStatic
    public static final boolean isAtLeastPreReleaseCodename(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename) == false) goto L5;
        return false;
    L5:
        Integer buildCodenameInt = isAtLeastPreReleaseCodename$codenameToInt(buildCodename);
        Integer codenameInt = isAtLeastPreReleaseCodename$codenameToInt(codename);
        if (buildCodenameInt == null) goto L12;
        if (codenameInt == null) goto L12;
        if (buildCodenameInt.intValue() >= codenameInt.intValue()) goto L11;
        return false;
    L11:
        return true;
    L12:
        if (buildCodenameInt != null) goto L18;
        if (codenameInt != null) goto L18;
        String r4 = buildCodename.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String r6 = codename.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r6, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (r4.compareTo(r6) >= 0) goto L17;
        return false;
    L17:
        return true;
    L18:
        if (buildCodenameInt != null) goto L20;
        return false;
    L20:
        return true;
    }

    @Deprecated(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastN() {
        return true;
    }

    @Deprecated(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastNMR1() {
        return true;
    }

    @Deprecated(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastO() {
        return true;
    }

    @Deprecated(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastOMR1() {
        if (Build.VERSION.SDK_INT < 27) goto L5;
        return true;
    L5:
        return false;
    }

    @Deprecated(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastP() {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        return true;
    L5:
        return false;
    }

    @Deprecated(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastQ() {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        return true;
    L5:
        return false;
    }

    @Deprecated(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastR() {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        return true;
    L5:
        return false;
    }

    @Deprecated(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastS() {
        if (Build.VERSION.SDK_INT < 31) goto L5;
    L10:
        return true;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L9;
        String r0 = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(r0, "CODENAME");
        if (isAtLeastPreReleaseCodename("S", r0) == true) goto L10;
    L9:
        return false;
    }

    @Deprecated(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastSv2() {
        if (Build.VERSION.SDK_INT < 32) goto L5;
    L10:
        return true;
    L5:
        if (Build.VERSION.SDK_INT < 31) goto L9;
        String r0 = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(r0, "CODENAME");
        if (isAtLeastPreReleaseCodename("Sv2", r0) == true) goto L10;
    L9:
        return false;
    }

    @Deprecated(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastT() {
        if (Build.VERSION.SDK_INT < 33) goto L5;
    L10:
        return true;
    L5:
        if (Build.VERSION.SDK_INT < 32) goto L9;
        String r0 = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(r0, "CODENAME");
        if (isAtLeastPreReleaseCodename("Tiramisu", r0) == true) goto L10;
    L9:
        return false;
    }

    @Deprecated(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastU() {
        if (Build.VERSION.SDK_INT < 34) goto L5;
    L10:
        return true;
    L5:
        if (Build.VERSION.SDK_INT < 33) goto L9;
        String r0 = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(r0, "CODENAME");
        if (isAtLeastPreReleaseCodename("UpsideDownCake", r0) == true) goto L10;
    L9:
        return false;
    }

    @Deprecated(message = "Android VanillaIceCream is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 35`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 35", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastV() {
        if (Build.VERSION.SDK_INT < 35) goto L5;
    L10:
        return true;
    L5:
        if (Build.VERSION.SDK_INT < 34) goto L9;
        String r0 = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(r0, "CODENAME");
        if (isAtLeastPreReleaseCodename("VanillaIceCream", r0) == true) goto L10;
    L9:
        return false;
    }

    @JvmStatic
    public static final boolean isAtLeastB() {
        if (Build.VERSION.SDK_INT < 36) goto L5;
    L10:
        return true;
    L5:
        if (Build.VERSION.SDK_INT < 35) goto L9;
        String r0 = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(r0, "CODENAME");
        if (isAtLeastPreReleaseCodename("Baklava", r0) == true) goto L10;
    L9:
        return false;
    }

    static {
        INSTANCE = new BuildCompat();
        int r1 = 0;
        if (Build.VERSION.SDK_INT < 30) goto L5;
        int r0 = Api30Impl.INSTANCE.getExtensionVersion(30);
    L6:
        R_EXTENSION_INT = r0;
        if (Build.VERSION.SDK_INT < 30) goto L9;
        int r2 = Api30Impl.INSTANCE.getExtensionVersion(31);
    L10:
        S_EXTENSION_INT = r2;
        if (Build.VERSION.SDK_INT < 30) goto L13;
        int r3 = Api30Impl.INSTANCE.getExtensionVersion(33);
    L14:
        T_EXTENSION_INT = r3;
        if (Build.VERSION.SDK_INT < 30) goto L18;
        r1 = Api30Impl.INSTANCE.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
    L18:
        AD_SERVICES_EXTENSION_INT = r1;
        return;
    L13:
        r3 = 0;
        goto L14
    L9:
        r2 = 0;
        goto L10
    L5:
        r0 = 0;
        goto L6
    }
}
