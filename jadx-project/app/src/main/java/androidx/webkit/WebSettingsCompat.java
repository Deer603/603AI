package androidx.webkit;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebSettingsAdapter;
import androidx.webkit.internal.WebSettingsNoOpAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class WebSettingsCompat {
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_APP_TRIGGER = 3;
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_WEB_TRIGGER = 1;
    public static final int ATTRIBUTION_BEHAVIOR_DISABLED = 0;
    public static final int ATTRIBUTION_BEHAVIOR_WEB_SOURCE_AND_WEB_TRIGGER = 2;

    @Deprecated
    public static final int DARK_STRATEGY_PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING = 2;

    @Deprecated
    public static final int DARK_STRATEGY_USER_AGENT_DARKENING_ONLY = 0;

    @Deprecated
    public static final int DARK_STRATEGY_WEB_THEME_DARKENING_ONLY = 1;

    @Deprecated
    public static final int FORCE_DARK_AUTO = 1;

    @Deprecated
    public static final int FORCE_DARK_OFF = 0;

    @Deprecated
    public static final int FORCE_DARK_ON = 2;
    public static final int SPECULATIVE_LOADING_DISABLED = 0;
    public static final int SPECULATIVE_LOADING_PRERENDER_ENABLED = 1;
    private static final String TAG = "WebSettingsCompat";
    public static final int WEB_AUTHENTICATION_SUPPORT_FOR_APP = 1;
    public static final int WEB_AUTHENTICATION_SUPPORT_FOR_BROWSER = 2;
    public static final int WEB_AUTHENTICATION_SUPPORT_NONE = 0;

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalBackForwardCache {
    }

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalSpeculativeLoading {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDark {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkStrategy {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuItemFlags {
    }

    private WebSettingsCompat() {
    }

    public static void setOffscreenPreRaster(WebSettings settings, boolean enabled) {
        ApiFeature.M feature = WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForM.setOffscreenPreRaster(settings, enabled);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getAdapter(settings).setOffscreenPreRaster(enabled);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getOffscreenPreRaster(WebSettings settings) {
        ApiFeature.M feature = WebViewFeatureInternal.OFF_SCREEN_PRERASTER;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForM.getOffscreenPreRaster(settings);
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getAdapter(settings).getOffscreenPreRaster();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setSafeBrowsingEnabled(WebSettings settings, boolean enabled) {
        ApiFeature.O feature = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForO.setSafeBrowsingEnabled(settings, enabled);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getAdapter(settings).setSafeBrowsingEnabled(enabled);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getSafeBrowsingEnabled(WebSettings settings) {
        ApiFeature.O feature = WebViewFeatureInternal.SAFE_BROWSING_ENABLE;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForO.getSafeBrowsingEnabled(settings);
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getAdapter(settings).getSafeBrowsingEnabled();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setDisabledActionModeMenuItems(WebSettings settings, int menuItems) {
        ApiFeature.N feature = WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForN.setDisabledActionModeMenuItems(settings, menuItems);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getAdapter(settings).setDisabledActionModeMenuItems(menuItems);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static int getDisabledActionModeMenuItems(WebSettings settings) {
        ApiFeature.N feature = WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForN.getDisabledActionModeMenuItems(settings);
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getAdapter(settings).getDisabledActionModeMenuItems();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static void setForceDark(WebSettings settings, int forceDarkMode) {
        ApiFeature.Q feature = WebViewFeatureInternal.FORCE_DARK;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForQ.setForceDark(settings, forceDarkMode);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getAdapter(settings).setForceDark(forceDarkMode);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static int getForceDark(WebSettings settings) {
        ApiFeature.Q feature = WebViewFeatureInternal.FORCE_DARK;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForQ.getForceDark(settings);
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getAdapter(settings).getForceDark();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAlgorithmicDarkeningAllowed(WebSettings settings, boolean allow) {
        ApiFeature.T feature = WebViewFeatureInternal.ALGORITHMIC_DARKENING;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setAlgorithmicDarkeningAllowed(allow);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isAlgorithmicDarkeningAllowed(WebSettings settings) {
        ApiFeature.T feature = WebViewFeatureInternal.ALGORITHMIC_DARKENING;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).isAlgorithmicDarkeningAllowed();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static void setForceDarkStrategy(WebSettings settings, int forceDarkBehavior) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.FORCE_DARK_STRATEGY;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setForceDarkStrategy(forceDarkBehavior);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static int getForceDarkStrategy(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.FORCE_DARK_STRATEGY;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getForceDark();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setEnterpriseAuthenticationAppLinkPolicyEnabled(WebSettings settings, boolean enabled) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setEnterpriseAuthenticationAppLinkPolicyEnabled(enabled);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getEnterpriseAuthenticationAppLinkPolicyEnabled(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getEnterpriseAuthenticationAppLinkPolicyEnabled();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static Set<String> getRequestedWithHeaderOriginAllowList(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getRequestedWithHeaderOriginAllowList();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setRequestedWithHeaderOriginAllowList(WebSettings settings, Set<String> allowList) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setRequestedWithHeaderOriginAllowList(allowList);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setUserAgentMetadata(WebSettings settings, UserAgentMetadata metadata) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.USER_AGENT_METADATA;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setUserAgentMetadata(metadata);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static UserAgentMetadata getUserAgentMetadata(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.USER_AGENT_METADATA;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getUserAgentMetadata();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAttributionRegistrationBehavior(WebSettings settings, int behavior) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setAttributionRegistrationBehavior(behavior);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static int getAttributionRegistrationBehavior(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getAttributionRegistrationBehavior();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebViewMediaIntegrityApiStatus(WebSettings settings, WebViewMediaIntegrityApiStatusConfig permissionConfig) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setWebViewMediaIntegrityApiStatus(permissionConfig);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getWebViewMediaIntegrityApiStatus();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebAuthenticationSupport(WebSettings settings, int support) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEB_AUTHENTICATION;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setWebAuthenticationSupport(support);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static int getWebAuthenticationSupport(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEB_AUTHENTICATION;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getWebAuthenticationSupport();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setSpeculativeLoadingStatus(WebSettings settings, int speculativeLoadingStatus) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.SPECULATIVE_LOADING;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setSpeculativeLoadingStatus(speculativeLoadingStatus);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static int getSpeculativeLoadingStatus(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.SPECULATIVE_LOADING;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getSpeculativeLoadingStatus();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setBackForwardCacheEnabled(WebSettings settings, boolean backForwardCacheEnabled) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.BACK_FORWARD_CACHE;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setBackForwardCacheEnabled(backForwardCacheEnabled);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getBackForwardCacheEnabled(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.BACK_FORWARD_CACHE;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getBackForwardCacheEnabled();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setPaymentRequestEnabled(WebSettings settings, boolean enabled) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.PAYMENT_REQUEST;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setPaymentRequestEnabled(enabled);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getPaymentRequestEnabled(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.PAYMENT_REQUEST;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getPaymentRequestEnabled();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setHasEnrolledInstrumentEnabled(WebSettings settings, boolean enabled) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.PAYMENT_REQUEST;
        if (feature.isSupportedByWebView() == false) goto L7;
        getAdapter(settings).setHasEnrolledInstrumentEnabled(enabled);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean getHasEnrolledInstrumentEnabled(WebSettings settings) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.PAYMENT_REQUEST;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getAdapter(settings).getHasEnrolledInstrumentEnabled();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebSettingsAdapter getAdapter(WebSettings settings) {
        return WebViewGlueCommunicator.getCompatConverter().convertSettings(settings);
    L4:
        e = move-exception;
        if (Build.VERSION.SDK_INT == 30) goto L8;
    L11:
        throw e;
    L8:
        if ("android.webkit.WebSettingsWrapper".equals(settings.getClass().getCanonicalName()) == false) goto L11;
        Log.e(TAG, "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
        return new WebSettingsNoOpAdapter();
    }
}
