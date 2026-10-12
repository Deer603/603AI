package androidx.webkit;

import android.content.Context;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.StartupApiFeature;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes4.dex */
public class ProcessGlobalConfig {
    private static boolean sApplyCalled;
    private static final Object sLock = null;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = null;
    String mCacheDirectoryBasePath;
    String mDataDirectoryBasePath;
    String mDataDirectorySuffix;
    Boolean mPartitionedCookiesEnabled;

    static {
        sProcessGlobalConfig = new AtomicReference();
        sLock = new Object();
        sApplyCalled = false;
    }

    public ProcessGlobalConfig() {
    }

    public ProcessGlobalConfig setDataDirectorySuffix(Context context, String suffix) {
        StartupApiFeature.P feature = WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX;
        if (feature.isSupported(context) == false) goto L15;
        if (suffix.equals("") == true) goto L13;
        if (suffix.indexOf(File.separatorChar) >= 0) goto L11;
        this.mDataDirectorySuffix = suffix;
        return this;
    L11:
        throw new IllegalArgumentException("Suffix " + suffix + " contains a path separator");
    L13:
        throw new IllegalArgumentException("Suffix cannot be an empty string");
    L15:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public ProcessGlobalConfig setDirectoryBasePaths(Context context, File dataDirectoryBasePath, File cacheDirectoryBasePath) {
        StartupApiFeature.NoFramework feature = WebViewFeatureInternal.STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH;
        if (feature.isSupported(context) == false) goto L15;
        if (dataDirectoryBasePath.isAbsolute() == false) goto L13;
        if (cacheDirectoryBasePath.isAbsolute() == false) goto L11;
        this.mDataDirectoryBasePath = dataDirectoryBasePath.getAbsolutePath();
        this.mCacheDirectoryBasePath = cacheDirectoryBasePath.getAbsolutePath();
        return this;
    L11:
        throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
    L13:
        throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
    L15:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public ProcessGlobalConfig setPartitionedCookiesEnabled(Context context, boolean isEnabled) {
        StartupApiFeature.NoFramework feature = WebViewFeatureInternal.STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES;
        if (feature.isSupported(context) == false) goto L7;
        this.mPartitionedCookiesEnabled = Boolean.valueOf(isEnabled);
        return this;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void apply(ProcessGlobalConfig config) {
        Object r0 = sLock;
        monitor-enter(r0);
    L34:
        th = move-exception;
        throw th;
    L5:
        if (sApplyCalled == true) goto L33;
        sApplyCalled = true;     // Catch: Throwable -> L34
        monitor-exit(r0);     // Catch: Throwable -> L34
        HashMap<String, Object> configMap = new HashMap();
        if (webViewCurrentlyLoaded() == true) goto L31;
        if (config.mDataDirectorySuffix == null) goto L17;
        StartupApiFeature.P feature = WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX;
        if (feature.isSupportedByFramework() == false) goto L15;
        ApiHelperForP.setDataDirectorySuffix(config.mDataDirectorySuffix);
        goto L17
    L15:
        configMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, config.mDataDirectorySuffix);
    L17:
        if (config.mDataDirectoryBasePath == null) goto L20;
        configMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, config.mDataDirectoryBasePath);
    L20:
        if (config.mCacheDirectoryBasePath == null) goto L23;
        configMap.put(ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, config.mCacheDirectoryBasePath);
    L23:
        if (config.mPartitionedCookiesEnabled == null) goto L26;
        configMap.put(ProcessGlobalConfigConstants.CONFIGURE_PARTITIONED_COOKIES, config.mPartitionedCookiesEnabled);
    L26:
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(sProcessGlobalConfig, null, configMap) == false) goto L29;
        return;
    L29:
        throw new RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
    L31:
        throw new IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
    L33:
        throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");     // Catch: Throwable -> L34
    }

    private static boolean webViewCurrentlyLoaded() {
        Class<?> webViewFactoryClass = Class.forName("android.webkit.WebViewFactory");     // Catch: Exception -> L7
        Field providerInstanceField = webViewFactoryClass.getDeclaredField("sProviderInstance");     // Catch: Exception -> L7
        providerInstanceField.setAccessible(true);     // Catch: Exception -> L7
        if (providerInstanceField.get(null) != null) goto L6;
        return false;
    L6:
        return true;
    L8:
        return false;
    }
}
