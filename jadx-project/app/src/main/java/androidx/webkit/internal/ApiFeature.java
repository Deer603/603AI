package androidx.webkit.internal;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ApiFeature implements ConditionallySupportedFeature {
    private static final Set<ApiFeature> sValues = null;
    private final String mInternalFeatureValue;
    private final String mPublicFeatureValue;

    private static class LAZY_HOLDER {
        static final Set<String> WEBVIEW_APK_FEATURES = null;

        private LAZY_HOLDER() {
        }

        static {
            WEBVIEW_APK_FEATURES = new HashSet(Arrays.asList(WebViewGlueCommunicator.getFactory().getWebViewFeatures()));
        }
    }

    public static class M extends ApiFeature {
        M(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }
    }

    public static class N extends ApiFeature {
        N(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }
    }

    public static class NoFramework extends ApiFeature {
        NoFramework(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }
    }

    public static class O extends ApiFeature {
        O(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }
    }

    public static class O_MR1 extends ApiFeature {
        O_MR1(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT < 27) goto L5;
            return true;
        L5:
            return false;
        }
    }

    public static class P extends ApiFeature {
        P(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT < 28) goto L5;
            return true;
        L5:
            return false;
        }
    }

    public static class Q extends ApiFeature {
        Q(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT < 29) goto L5;
            return true;
        L5:
            return false;
        }
    }

    public static class T extends ApiFeature {
        T(String publicFeatureValue, String internalFeatureValue) {
            super(publicFeatureValue, internalFeatureValue);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            if (Build.VERSION.SDK_INT < 33) goto L5;
            return true;
        L5:
            return false;
        }
    }

    public abstract boolean isSupportedByFramework();

    static {
        sValues = new HashSet();
    }

    ApiFeature(String publicFeatureValue, String internalFeatureValue) {
        this.mPublicFeatureValue = publicFeatureValue;
        this.mInternalFeatureValue = internalFeatureValue;
        sValues.add(this);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
        if (isSupportedByFramework() == false) goto L5;
    L8:
        return true;
    L5:
        if (isSupportedByWebView() == true) goto L8;
        return false;
    }

    public boolean isSupportedByWebView() {
        return BoundaryInterfaceReflectionUtil.containsFeature(LAZY_HOLDER.WEBVIEW_APK_FEATURES, this.mInternalFeatureValue);
    }

    public static Set<ApiFeature> values() {
        return Collections.unmodifiableSet(sValues);
    }

    public static Set<String> getWebViewApkFeaturesForTesting() {
        return LAZY_HOLDER.WEBVIEW_APK_FEATURES;
    }
}
