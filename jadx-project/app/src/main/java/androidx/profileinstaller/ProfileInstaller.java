package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileInstaller {
    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_PROFILE_IS_COMPRESSED = 5;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    private static final DiagnosticsCallback EMPTY_DIAGNOSTICS = null;
    static final DiagnosticsCallback LOG_DIAGNOSTICS = null;
    private static final String PROFILE_BASE_DIR = "/data/misc/profiles/cur/0";
    private static final String PROFILE_FILE = "primary.prof";
    private static final String PROFILE_INSTALLER_SKIP_FILE_NAME = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
    private static final String PROFILE_META_LOCATION = "dexopt/baseline.profm";
    static final String PROFILE_SOURCE_LOCATION = "dexopt/baseline.prof";
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_BENCHMARK_OPERATION_FAILURE = 15;
    public static final int RESULT_BENCHMARK_OPERATION_SUCCESS = 14;
    public static final int RESULT_BENCHMARK_OPERATION_UNKNOWN = 16;
    public static final int RESULT_DELETE_SKIP_FILE_SUCCESS = 11;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SKIP_FILE_SUCCESS = 10;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_META_FILE_REQUIRED_BUT_NOT_FOUND = 9;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_SAVE_PROFILE_SIGNALLED = 12;
    public static final int RESULT_SAVE_PROFILE_SKIPPED = 13;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;
    private static final String TAG = "ProfileInstaller";

    @Retention(RetentionPolicy.SOURCE)
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int r1, Object r2);

        void onResultReceived(int r1, Object r2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    private ProfileInstaller() {
    }

    static /* synthetic */ void lambda$result$0(DiagnosticsCallback diagnostics, int code, Object data) {
        diagnostics.onResultReceived(code, data);
    }

    static void result(Executor executor, final DiagnosticsCallback diagnostics, final int code, final Object data) {
        executor.execute(new ProfileInstaller$$ExternalSyntheticLambda0(diagnostics, code, data));
    }

    static void diagnostic(Executor executor, final DiagnosticsCallback diagnostics, final int code, final Object data) {
        executor.execute(new ProfileInstaller$$ExternalSyntheticLambda1(diagnostics, code, data));
    }

    static /* synthetic */ void lambda$diagnostic$1(DiagnosticsCallback diagnostics, int code, Object data) {
        diagnostics.onDiagnosticReceived(code, data);
    }

    static {
        EMPTY_DIAGNOSTICS = new AnonymousClass1();
        LOG_DIAGNOSTICS = new AnonymousClass2();
    }

    static boolean hasAlreadyWrittenProfileForThisInstall(PackageInfo packageInfo, File appFilesDir, DiagnosticsCallback diagnostics) {
        File skipFile = new File(appFilesDir, PROFILE_INSTALLER_SKIP_FILE_NAME);
        boolean result = false;
        if (skipFile.exists() == true) goto L24;
        return false;
    L24:
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(skipFile));     // Catch: IOException -> L20
        long lastProfileWritePackageUpdateTime = dataInputStream.readLong();     // Catch: Throwable -> L14
        dataInputStream.close();     // Catch: IOException -> L20
        if (lastProfileWritePackageUpdateTime != packageInfo.lastUpdateTime) goto L11;
        result = true;
    L11:
        if (result == false) goto L13;
        diagnostics.onResultReceived(2, null);
    L13:
        return result;
    L14:
        th = move-exception;
        dataInputStream.close();     // Catch: Throwable -> L17
    L19:
        throw th;     // Catch: IOException -> L20
    L17:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L20
    L21:
        return false;
    }

    static void noteProfileWrittenFor(PackageInfo packageInfo, File appFilesDir) {
        File skipFile = new File(appFilesDir, PROFILE_INSTALLER_SKIP_FILE_NAME);
        DataOutputStream os = new DataOutputStream(new FileOutputStream(skipFile));     // Catch: IOException -> L13
        os.writeLong(packageInfo.lastUpdateTime);     // Catch: Throwable -> L7
        os.close();     // Catch: IOException -> L13
        return;
    L7:
        th = move-exception;
        os.close();     // Catch: Throwable -> L10
    L12:
        throw th;     // Catch: IOException -> L13
    L10:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L13
    }

    static boolean deleteProfileWrittenFor(File appFilesDir) {
        File skipFile = new File(appFilesDir, PROFILE_INSTALLER_SKIP_FILE_NAME);
        return skipFile.delete();
    }

    private static boolean transcodeAndWrite(AssetManager assets, String packageName, PackageInfo packageInfo, File filesDir, String apkName, Executor executor, DiagnosticsCallback diagnostics) {
        File curProfile = new File(new File(PROFILE_BASE_DIR, packageName), PROFILE_FILE);
        DeviceProfileWriter deviceProfileWriter = new DeviceProfileWriter(assets, executor, diagnostics, apkName, PROFILE_SOURCE_LOCATION, PROFILE_META_LOCATION, curProfile);
        if (deviceProfileWriter.deviceAllowsProfileInstallerAotWrites() == true) goto L6;
        return false;
    L6:
        boolean success = deviceProfileWriter.read().transcodeIfNeeded().write();
        if (success == false) goto L9;
        noteProfileWrittenFor(packageInfo, filesDir);
    L9:
        return success;
    }

    public static void writeProfile(Context context) {
        writeProfile(context, new ProfileInstaller$$ExternalSyntheticLambda2(), EMPTY_DIAGNOSTICS);
    }

    public static void writeProfile(Context context, Executor executor, DiagnosticsCallback diagnostics) {
        writeProfile(context, executor, diagnostics, false);
    }

    static void writeProfile(Context context, Executor executor, DiagnosticsCallback diagnostics, boolean forceWriteProfile) {
        Context appContext = context.getApplicationContext();
        String packageName = appContext.getPackageName();
        ApplicationInfo appInfo = appContext.getApplicationInfo();
        AssetManager assetManager = appContext.getAssets();
        String apkName = new File(appInfo.sourceDir).getName();
        PackageManager packageManager = context.getPackageManager();
        boolean r11 = false;
        PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);     // Catch: PackageManager.NameNotFoundException -> L16
        File filesDir = context.getFilesDir();
        if (forceWriteProfile == false) goto L7;
    L10:
        Log.d(TAG, "Installing profile for " + context.getPackageName());
        boolean profileWritten = transcodeAndWrite(assetManager, packageName, packageInfo, filesDir, apkName, executor, diagnostics);
        if (profileWritten == false) goto L14;
        if (forceWriteProfile == false) goto L14;
        r11 = true;
    L14:
        ProfileVerifier.writeProfileVerification(context, r11);
        return;
    L7:
        if (hasAlreadyWrittenProfileForThisInstall(packageInfo, filesDir, diagnostics) == false) goto L10;
        Log.d(TAG, "Skipping profile installation for " + context.getPackageName());
        ProfileVerifier.writeProfileVerification(context, false);
        return;
    L16:
        e = move-exception;
        diagnostics.onResultReceived(7, e);
        ProfileVerifier.writeProfileVerification(context, false);
    }

    static void writeSkipFile(Context context, Executor executor, DiagnosticsCallback diagnostics) {
        Context appContext = context.getApplicationContext();
        String packageName = appContext.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);     // Catch: PackageManager.NameNotFoundException -> L6
        File filesDir = context.getFilesDir();
        noteProfileWrittenFor(packageInfo, filesDir);
        result(executor, diagnostics, 10, null);
        return;
    L6:
        e = move-exception;
        result(executor, diagnostics, 7, e);
    }

    static void deleteSkipFile(Context context, Executor executor, DiagnosticsCallback diagnostics) {
        File filesDir = context.getFilesDir();
        deleteProfileWrittenFor(filesDir);
        result(executor, diagnostics, 11, null);
    }
}
