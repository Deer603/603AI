package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.webkit.WebViewCompat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StartupApiFeature {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String METADATA_HOLDER_SERVICE_NAME = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";
    private static final Set<StartupApiFeature> sValues = null;
    private final String mInternalFeatureValue;
    private final String mPublicFeatureValue;

    public static class NoFramework extends StartupApiFeature {
        NoFramework(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }
    }

    public static class P extends StartupApiFeature {
        P(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT < 28) goto L5;
            return true;
        L5:
            return false;
        }
    }

    public abstract boolean isSupportedByFramework();

    static {
        sValues = new HashSet();
    }

    StartupApiFeature(String publicFeatureValue, String internalFeatureValue) {
        this.mPublicFeatureValue = publicFeatureValue;
        this.mInternalFeatureValue = internalFeatureValue;
        sValues.add(this);
    }

    public String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }

    public boolean isSupported(Context context) {
        if (isSupportedByFramework() == false) goto L5;
    L8:
        return true;
    L5:
        if (isSupportedByWebView(context) == true) goto L8;
        return false;
    }

    public boolean isSupportedByWebView(Context context) {
        Bundle bundle = getMetaDataFromWebViewManifestOrNull(context);
        if (bundle != null) goto L7;
        return false;
    L7:
        return bundle.containsKey(this.mInternalFeatureValue);
    }

    public static Set<StartupApiFeature> values() {
        return Collections.unmodifiableSet(sValues);
    }

    private static Bundle getMetaDataFromWebViewManifestOrNull(Context context) {
        PackageInfo systemWebViewPackage = WebViewCompat.getCurrentWebViewPackage(context);
        if (systemWebViewPackage != null) goto L5;
        return null;
    L5:
        ComponentName compName = new ComponentName(systemWebViewPackage.packageName, METADATA_HOLDER_SERVICE_NAME);
        if (Build.VERSION.SDK_INT < 33) goto L12;
        PackageManager.ComponentInfoFlags flags = ApiHelperForTiramisu.of(640);
        return ApiHelperForTiramisu.getServiceInfo(context.getPackageManager(), compName, flags).metaData;
    L11:
        return null;
    L12:
        int flags2 = 128 | 512;
        return getServiceInfo(context, compName, flags2).metaData;
    L16:
        return null;
    }

    private static ServiceInfo getServiceInfo(Context context, ComponentName compName, int flags) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 33) goto L7;
        return context.getPackageManager().getServiceInfo(compName, flags);
    L7:
        throw new AssertionError();
    }
}
