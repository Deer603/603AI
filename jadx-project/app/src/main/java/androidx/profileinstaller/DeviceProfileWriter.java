package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceProfileWriter {
    private final String mApkName;
    private final AssetManager mAssetManager;
    private final File mCurProfile;
    private final byte[] mDesiredVersion;
    private boolean mDeviceSupportsAotProfile;
    private final ProfileInstaller.DiagnosticsCallback mDiagnostics;
    private final Executor mExecutor;
    private DexProfileData[] mProfile;
    private final String mProfileMetaSourceLocation;
    private final String mProfileSourceLocation;
    private byte[] mTranscodedProfile;

    private void result(final int code, final Object data) {
        this.mExecutor.execute(new DeviceProfileWriter$$ExternalSyntheticLambda0(this, code, data));
    }

    /* JADX INFO: renamed from: lambda$result$0$androidx-profileinstaller-DeviceProfileWriter, reason: not valid java name */
    /* synthetic */ void m7266lambda$result$0$androidxprofileinstallerDeviceProfileWriter(int code, Object data) {
        this.mDiagnostics.onResultReceived(code, data);
    }

    public DeviceProfileWriter(AssetManager assetManager, Executor executor, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String apkName, String profileSourceLocation, String profileMetaSourceLocation, File curProfile) {
        this.mDeviceSupportsAotProfile = false;
        this.mAssetManager = assetManager;
        this.mExecutor = executor;
        this.mDiagnostics = diagnosticsCallback;
        this.mApkName = apkName;
        this.mProfileSourceLocation = profileSourceLocation;
        this.mProfileMetaSourceLocation = profileMetaSourceLocation;
        this.mCurProfile = curProfile;
        this.mDesiredVersion = desiredVersion();
    }

    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.mDesiredVersion != null) goto L6;
        result(3, Integer.valueOf(Build.VERSION.SDK_INT));
        return false;
    L6:
        boolean r0 = this.mCurProfile.exists();
        File r2 = this.mCurProfile;
        if (r0 == true) goto L9;
        if (r2.createNewFile() == true) goto L17;
        result(4, null);     // Catch: IOException -> L19
        return false;
    L17:
        this.mDeviceSupportsAotProfile = true;
        return true;
    L20:
        result(4, null);
        return false;
    L9:
        if (r2.canWrite() == true) goto L17;
        result(4, null);
        return false;
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
        if (this.mDeviceSupportsAotProfile == false) goto L6;
        return;
    L6:
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    public DeviceProfileWriter read() {
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        if (this.mDesiredVersion != null) goto L5;
        return this;
    L5:
        InputStream profileStream = getProfileInputStream(this.mAssetManager);
        if (profileStream == null) goto L9;
        this.mProfile = readProfileInternal(profileStream);
    L9:
        if (this.mProfile == null) goto L15;
        DexProfileData[] profile = this.mProfile;
        if (requiresMetadata() == false) goto L15;
        DeviceProfileWriter profileWriter = addMetadata(profile, this.mDesiredVersion);
        if (profileWriter == null) goto L15;
        return profileWriter;
    L15:
        return this;
    }

    private InputStream openStreamFromAssets(AssetManager assetManager, String location) throws IOException {
        AssetFileDescriptor descriptor = assetManager.openFd(location);     // Catch: FileNotFoundException -> L5
        InputStream profileStream = descriptor.createInputStream();     // Catch: FileNotFoundException -> L5
        return profileStream;
    L5:
        e = move-exception;
        String message = e.getMessage();
        if (message != null) goto L9;
        return null;
    L9:
        if (message.contains("compressed") == false) goto L16;
        this.mDiagnostics.onDiagnosticReceived(5, null);
        return null;
    L16:
        return null;
    }

    private InputStream getProfileInputStream(AssetManager assetManager) {
        InputStream profileStream = openStreamFromAssets(assetManager, this.mProfileSourceLocation);     // Catch: IOException -> L6 FileNotFoundException -> L8
    L13:
        return profileStream;
    L8:
        e = move-exception;
        this.mDiagnostics.onResultReceived(6, e);
        return null;
    L6:
        e = move-exception;
        this.mDiagnostics.onResultReceived(7, e);
        return null;
    }

    private DexProfileData[] readProfileInternal(InputStream profileStream) {
        DexProfileData[] profile = null;
        byte[] baselineVersion = ProfileTranscoder.readHeader(profileStream, ProfileTranscoder.MAGIC_PROF);     // Catch: Throwable -> L9 IllegalStateException -> L11 IOException -> L15
        profile = ProfileTranscoder.readProfile(profileStream, baselineVersion, this.mApkName);     // Catch: Throwable -> L9 IllegalStateException -> L11 IOException -> L15
        profileStream.close();     // Catch: IOException -> L7
    L27:
    L30:
        return profile;
    L7:
        e = move-exception;
        this.mDiagnostics.onResultReceived(7, e);
    L15:
        e = move-exception;
        this.mDiagnostics.onResultReceived(7, e);     // Catch: Throwable -> L9
        profileStream.close();     // Catch: IOException -> L7
    L11:
        e = move-exception;
        this.mDiagnostics.onResultReceived(8, e);     // Catch: Throwable -> L9
        profileStream.close();     // Catch: IOException -> L7
    L9:
        th = move-exception;
        profileStream.close();     // Catch: IOException -> L22
    L24:
        throw th;
    L22:
        e = move-exception;
        this.mDiagnostics.onResultReceived(7, e);
        goto L24
    }

    private DeviceProfileWriter addMetadata(DexProfileData[] profile, byte[] desiredVersion) {
        InputStream is = openStreamFromAssets(this.mAssetManager, this.mProfileMetaSourceLocation);     // Catch: IllegalStateException -> L19 IOException -> L21 FileNotFoundException -> L23
        if (is != null) goto L29;
        if (is == null) goto L26;
        is.close();     // Catch: IllegalStateException -> L19 IOException -> L21 FileNotFoundException -> L23
    L26:
        return null;
    L29:
        byte[] metaVersion = ProfileTranscoder.readHeader(is, ProfileTranscoder.MAGIC_PROFM);     // Catch: Throwable -> L9
        this.mProfile = ProfileTranscoder.readMeta(is, metaVersion, desiredVersion, profile);     // Catch: Throwable -> L9
        if (is == null) goto L8;
        is.close();     // Catch: IllegalStateException -> L19 IOException -> L21 FileNotFoundException -> L23
    L8:
        return this;
    L9:
        th = move-exception;
        if (is != null) goto L27;
    L15:
        throw th;     // Catch: IllegalStateException -> L19 IOException -> L21 FileNotFoundException -> L23
    L27:
        is.close();     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L19 IOException -> L21 FileNotFoundException -> L23
    L23:
        e = move-exception;
        this.mDiagnostics.onResultReceived(9, e);
    L21:
        e = move-exception;
        this.mDiagnostics.onResultReceived(7, e);
    L19:
        e = move-exception;
        this.mProfile = null;
        this.mDiagnostics.onResultReceived(8, e);
        goto L26
    }

    public DeviceProfileWriter transcodeIfNeeded() {
        DexProfileData[] profile = this.mProfile;
        byte[] desiredVersion = this.mDesiredVersion;
        if (profile == null) goto L29;
        if (desiredVersion == null) goto L29;
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        ByteArrayOutputStream os = new ByteArrayOutputStream();     // Catch: IllegalStateException -> L22 IOException -> L24
        ProfileTranscoder.writeHeader(os, desiredVersion);     // Catch: Throwable -> L16
        boolean success = ProfileTranscoder.transcodeAndWriteBody(os, desiredVersion, profile);     // Catch: Throwable -> L16
        if (success == true) goto L13;
        this.mDiagnostics.onResultReceived(5, null);     // Catch: Throwable -> L16
        this.mProfile = null;     // Catch: Throwable -> L16
        os.close();     // Catch: IllegalStateException -> L22 IOException -> L24
        return this;
    L13:
        this.mTranscodedProfile = os.toByteArray();     // Catch: Throwable -> L16
        os.close();     // Catch: IllegalStateException -> L22 IOException -> L24
    L27:
        this.mProfile = null;
        return this;
    L16:
        th = move-exception;
        os.close();     // Catch: Throwable -> L19
    L21:
        throw th;     // Catch: IllegalStateException -> L22 IOException -> L24
    L19:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalStateException -> L22 IOException -> L24
    L24:
        e = move-exception;
        this.mDiagnostics.onResultReceived(7, e);
    L22:
        e = move-exception;
        this.mDiagnostics.onResultReceived(8, e);
    L29:
        return this;
    }

    public boolean write() {
        byte[] transcodedProfile = this.mTranscodedProfile;
        if (transcodedProfile != null) goto L5;
        return false;
    L5:
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        InputStream bis = new ByteArrayInputStream(transcodedProfile);     // Catch: Throwable -> L45 IOException -> L47 FileNotFoundException -> L50
        FileOutputStream os = new FileOutputStream(this.mCurProfile);     // Catch: Throwable -> L39
        FileChannel channel = os.getChannel();     // Catch: Throwable -> L33
        FileLock lock = channel.tryLock();     // Catch: Throwable -> L26
        Encoding.writeAll(bis, os, lock);     // Catch: Throwable -> L19
        result(1, null);     // Catch: Throwable -> L19
        if (lock == null) goto L13;
        lock.close();     // Catch: Throwable -> L26
    L13:
        if (channel == null) goto L15;
        channel.close();     // Catch: Throwable -> L33
    L15:
        os.close();     // Catch: Throwable -> L39
        bis.close();     // Catch: Throwable -> L45 IOException -> L47 FileNotFoundException -> L50
        this.mTranscodedProfile = null;
        this.mProfile = null;
        return true;
    L19:
        th = move-exception;
        if (lock != null) goto L58;
    L25:
        throw th;     // Catch: Throwable -> L26
    L58:
        lock.close();     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        if (channel != null) goto L68;
    L32:
        throw th;     // Catch: Throwable -> L33
    L68:
        channel.close();     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        os.close();     // Catch: Throwable -> L36
    L38:
        throw th;     // Catch: Throwable -> L39
    L36:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        bis.close();     // Catch: Throwable -> L42
    L44:
        throw th;     // Catch: Throwable -> L45 IOException -> L47 FileNotFoundException -> L50
    L42:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L45 IOException -> L47 FileNotFoundException -> L50
    L45:
        th = move-exception;
        this.mTranscodedProfile = null;
        this.mProfile = null;
        throw th;
    L50:
        e = move-exception;
        result(6, e);     // Catch: Throwable -> L45
    L52:
        this.mTranscodedProfile = null;
        this.mProfile = null;
        return false;
    L47:
        e = move-exception;
        result(7, e);     // Catch: Throwable -> L45
        goto L52
    }

    private static byte[] desiredVersion() {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return ProfileVersion.V015_S;
    L7:
        switch(Build.VERSION.SDK_INT) {
            case 24: goto L17;
            case 25: goto L17;
            case 26: goto L15;
            case 27: goto L13;
            case 28: goto L11;
            case 29: goto L11;
            case 30: goto L11;
            default: goto L8;
        };
    L8:
        return null;
    L11:
        return ProfileVersion.V010_P;
    L13:
        return ProfileVersion.V009_O_MR1;
    L15:
        return ProfileVersion.V005_O;
    L17:
        return ProfileVersion.V001_N;
    }

    private static boolean requiresMetadata() {
        if (Build.VERSION.SDK_INT < 31) goto L6;
        return true;
    L6:
        switch(Build.VERSION.SDK_INT) {
            case 24: goto L9;
            case 25: goto L9;
            case 26: goto L8;
            case 27: goto L8;
            case 28: goto L8;
            case 29: goto L8;
            case 30: goto L8;
            default: goto L7;
        };
    L7:
        return false;
    L8:
        return false;
    L9:
        return true;
    }
}
