package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileVerifier {
    private static final String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final String PROFILE_FILE_NAME = "primary.prof";
    private static final String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final Object SYNC_OBJ = null;
    private static final String TAG = "ProfileVerifier";
    private static CompilationStatus sCompilationStatus;
    private static final ResolvableFuture<CompilationStatus> sFuture = null;

    private static class Api33Impl {
        private Api33Impl() {
        }

        static PackageInfo getPackageInfo(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        Cache(int schema, int resultCode, long packageLastUpdateTime, long installedCurrentProfileSize) {
            this.mSchema = schema;
            this.mResultCode = resultCode;
            this.mPackageLastUpdateTime = packageLastUpdateTime;
            this.mInstalledCurrentProfileSize = installedCurrentProfileSize;
        }

        public boolean equals(Object o) {
            if (this != o) goto L6;
            return true;
        L6:
            if (o != null) goto L8;
        L21:
            return false;
        L8:
            if ((o instanceof Cache) == false) goto L21;
            Cache cacheFile = (Cache) o;
            if (this.mResultCode != cacheFile.mResultCode) goto L20;
            if (this.mPackageLastUpdateTime != cacheFile.mPackageLastUpdateTime) goto L20;
            if (this.mSchema != cacheFile.mSchema) goto L20;
            if (this.mInstalledCurrentProfileSize != cacheFile.mInstalledCurrentProfileSize) goto L20;
            return true;
        L20:
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize)});
        }

        void writeOnFile(File file) throws IOException {
            file.delete();
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            dos.writeInt(this.mSchema);     // Catch: Throwable -> L6
            dos.writeInt(this.mResultCode);     // Catch: Throwable -> L6
            dos.writeLong(this.mPackageLastUpdateTime);     // Catch: Throwable -> L6
            dos.writeLong(this.mInstalledCurrentProfileSize);     // Catch: Throwable -> L6
            dos.close();
            return;
        L6:
            th = move-exception;
            dos.close();     // Catch: Throwable -> L9
        L11:
            throw th;
        L9:
            th = move-exception;
            th.addSuppressed(th);
            goto L11
        }

        static Cache readFromFile(File file) throws IOException {
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            Cache r2 = new Cache(dis.readInt(), dis.readInt(), dis.readLong(), dis.readLong());     // Catch: Throwable -> L6
            dis.close();
            return r2;
        L6:
            th = move-exception;
            dis.close();     // Catch: Throwable -> L10
            throw th;
        L10:
            th = move-exception;
            th.addSuppressed(th);
            throw th;
        }
    }

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED = 327680;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;

        @Deprecated
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_NO_PROFILE_INSTALLED = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasEmbeddedProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        CompilationStatus(int resultCode, boolean hasReferenceProfile, boolean hasCurrentProfile, boolean hasEmbeddedProfile) {
            this.mResultCode = resultCode;
            this.mHasCurrentProfile = hasCurrentProfile;
            this.mHasReferenceProfile = hasReferenceProfile;
            this.mHasEmbeddedProfile = hasEmbeddedProfile;
        }

        public int getProfileInstallResultCode() {
            return this.mResultCode;
        }

        public boolean isCompiledWithProfile() {
            return this.mHasReferenceProfile;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.mHasCurrentProfile;
        }

        public boolean appApkHasEmbeddedProfile() {
            return this.mHasEmbeddedProfile;
        }
    }

    static {
        sFuture = ResolvableFuture.create();
        SYNC_OBJ = new Object();
        sCompilationStatus = null;
    }

    private ProfileVerifier() {
    }

    public static CompilationStatus writeProfileVerification(Context context) {
        return writeProfileVerification(context, false);
    }

    static CompilationStatus writeProfileVerification(Context context, boolean forceVerifyCurrentProfile) {
        if (forceVerifyCurrentProfile == false) goto L4;
    L7:
        Object r1 = SYNC_OBJ;
        monitor-enter(r1);
        if (forceVerifyCurrentProfile == false) goto L114;
    L15:
        boolean hasCurrentProfile = false;
        AssetFileDescriptor afd = context.getAssets().openFd("dexopt/baseline.prof");     // Catch: Throwable -> L34 IOException -> L36
        if (afd.getLength() <= 0) goto L22;
        boolean hasEmbeddedProfile = true;
    L23:
        if (afd == null) goto L25;
        afd.close();     // Catch: Throwable -> L34 IOException -> L36
    L25:
        boolean hasEmbeddedProfile2 = hasEmbeddedProfile;
    L39:
        if (Build.VERSION.SDK_INT >= 28) goto L41;
    L106:
        CompilationStatus r0 = setCompilationStatus(262144, false, false, hasEmbeddedProfile2);     // Catch: Throwable -> L34
        monitor-exit(r1);     // Catch: Throwable -> L34
        return r0;
    L41:
        if (Build.VERSION.SDK_INT == 30) goto L106;
        File referenceProfileFile = new File(new File(REF_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);     // Catch: Throwable -> L34
        long referenceProfileSize = referenceProfileFile.length();     // Catch: Throwable -> L34
        if (referenceProfileFile.exists() == true) goto L46;
    L48:
        boolean r2 = false;
    L49:
        boolean hasReferenceProfile = r2;
        File currentProfileFile = new File(new File(CUR_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);     // Catch: Throwable -> L34
        long currentProfileSize = currentProfileFile.length();     // Catch: Throwable -> L34
        if (currentProfileFile.exists() == true) goto L52;
    L115:
        long packageLastUpdateTime = getPackageLastUpdateTime(context);     // Catch: Throwable -> L34 PackageManager.NameNotFoundException -> L102
        File cacheFile = new File(context.getFilesDir(), PROFILE_INSTALLED_CACHE_FILE_NAME);     // Catch: Throwable -> L34
        Cache currentCache = null;
        if (cacheFile.exists() == false) goto L65;
        currentCache = Cache.readFromFile(cacheFile);     // Catch: Throwable -> L34 IOException -> L59
        goto L65
    L63:
        return setCompilationStatus(131072, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile2);
    L65:
        if (currentCache != null) goto L67;
    L72:
        if (hasEmbeddedProfile2 == true) goto L74;
        int resultCode = CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED;
    L79:
        if (forceVerifyCurrentProfile == false) goto L83;
        if (hasCurrentProfile == false) goto L83;
        if (resultCode == 1) goto L83;
        resultCode = 2;
    L83:
        if (currentCache != null) goto L85;
    L90:
        int resultCode2 = resultCode;
    L91:
        Cache newCache = new Cache(1, resultCode2, packageLastUpdateTime, currentProfileSize);     // Catch: Throwable -> L34
        if (currentCache != null) goto L94;
    L111:
        newCache.writeOnFile(cacheFile);     // Catch: Throwable -> L34 IOException -> L97
    L96:
        int resultCode3 = resultCode2;
    L99:
        CompilationStatus r4 = setCompilationStatus(resultCode3, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile2);     // Catch: Throwable -> L34
        monitor-exit(r1);     // Catch: Throwable -> L34
        return r4;
    L98:
        resultCode3 = 196608;
        goto L99
    L94:
        if (currentCache.equals(newCache) == true) goto L96;
    L85:
        if (currentCache.mResultCode != 2) goto L90;
        if (resultCode != 1) goto L90;
        if (referenceProfileSize >= currentCache.mInstalledCurrentProfileSize) goto L90;
        resultCode2 = 3;
        goto L91
    L74:
        if (hasReferenceProfile == false) goto L76;
        resultCode = 1;
        goto L79
    L76:
        if (hasCurrentProfile == false) goto L78;
        resultCode = 2;
        goto L79
    L78:
        resultCode = 0;
        goto L79
    L67:
        if (currentCache.mPackageLastUpdateTime != packageLastUpdateTime) goto L72;
        if (currentCache.mResultCode == 2) goto L72;
        resultCode = currentCache.mResultCode;     // Catch: Throwable -> L34
        goto L79
    L34:
        th = move-exception;
        throw th;
    L105:
        return setCompilationStatus(65536, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile2);
    L52:
        if (currentProfileSize <= 0) goto L115;
        hasCurrentProfile = true;
        goto L115
    L46:
        if (referenceProfileSize <= 0) goto L48;
        r2 = true;
        goto L49
    L22:
        hasEmbeddedProfile = false;
    L26:
        th = move-exception;
        if (afd == null) goto L123;
        afd.close();     // Catch: Throwable -> L31
        throw th;     // Catch: Throwable -> L34 IOException -> L36
    L31:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L34 IOException -> L36
        throw th;     // Catch: Throwable -> L34 IOException -> L36
    L123:
        throw th;     // Catch: Throwable -> L34 IOException -> L36
    L37:
        hasEmbeddedProfile2 = false;
        goto L39
    L114:
        if (sCompilationStatus == null) goto L15;
        CompilationStatus r3 = sCompilationStatus;     // Catch: Throwable -> L34
        monitor-exit(r1);     // Catch: Throwable -> L34
        return r3;
    L4:
        if (sCompilationStatus == null) goto L7;
        return sCompilationStatus;
    }

    private static CompilationStatus setCompilationStatus(int resultCode, boolean hasReferenceProfile, boolean hasCurrentProfile, boolean hasEmbeddedProfile) {
        sCompilationStatus = new CompilationStatus(resultCode, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile);
        sFuture.set(sCompilationStatus);
        return sCompilationStatus;
    }

    private static long getPackageLastUpdateTime(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime;
    L7:
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static ListenableFuture<CompilationStatus> getCompilationStatusAsync() {
        return sFuture;
    }
}
