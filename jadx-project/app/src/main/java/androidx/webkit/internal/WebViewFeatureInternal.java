package androidx.webkit.internal;

import android.content.Context;
import androidx.webkit.WebViewFeature;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.support_lib_boundary.util.Features;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewFeatureInternal {
    public static final ApiFeature.T ALGORITHMIC_DARKENING = null;
    public static final ApiFeature.NoFramework ASYNC_WEBVIEW_STARTUP = null;
    public static final ApiFeature.NoFramework ATTRIBUTION_REGISTRATION_BEHAVIOR = null;
    public static final ApiFeature.NoFramework BACK_FORWARD_CACHE = null;
    public static final ApiFeature.NoFramework CACHE_PROVIDER = null;
    public static final ApiFeature.M CREATE_WEB_MESSAGE_CHANNEL = null;
    public static final ApiFeature.NoFramework DEFAULT_TRAFFICSTATS_TAGGING = null;
    public static final ApiFeature.NoFramework DELETE_BROWSING_DATA = null;
    public static final ApiFeature.N DISABLED_ACTION_MODE_MENU_ITEMS = null;
    public static final ApiFeature.NoFramework DOCUMENT_START_SCRIPT = null;
    public static final ApiFeature.NoFramework ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY = null;
    public static final ApiFeature.Q FORCE_DARK = null;
    public static final ApiFeature.NoFramework FORCE_DARK_STRATEGY = null;
    public static final ApiFeature.NoFramework GET_COOKIE_INFO = null;
    public static final ApiFeature.NoFramework GET_VARIATIONS_HEADER = null;
    public static final ApiFeature.O GET_WEB_CHROME_CLIENT = null;
    public static final ApiFeature.O GET_WEB_VIEW_CLIENT = null;
    public static final ApiFeature.Q GET_WEB_VIEW_RENDERER = null;
    public static final ApiFeature.NoFramework MULTI_PROCESS = null;
    public static final ApiFeature.NoFramework MULTI_PROFILE = null;
    public static final ApiFeature.NoFramework MUTE_AUDIO = null;
    public static final ApiFeature.NoFramework NAVIGATION_CALLBACK_BASIC = null;
    public static final ApiFeature.M OFF_SCREEN_PRERASTER = null;
    public static final ApiFeature.NoFramework PAYMENT_REQUEST = null;
    public static final ApiFeature.M POST_WEB_MESSAGE = null;
    public static final ApiFeature.NoFramework PRERENDER_WITH_URL = null;
    public static final ApiFeature.NoFramework PROFILE_URL_PREFETCH = null;
    public static final ApiFeature.NoFramework PROXY_OVERRIDE = null;
    public static final ApiFeature.NoFramework PROXY_OVERRIDE_REVERSE_BYPASS = null;
    public static final ApiFeature.M RECEIVE_HTTP_ERROR = null;
    public static final ApiFeature.M RECEIVE_WEB_RESOURCE_ERROR = null;
    public static final ApiFeature.NoFramework REQUESTED_WITH_HEADER_ALLOW_LIST = null;

    @Deprecated
    public static final ApiFeature.O_MR1 SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED = null;

    @Deprecated
    public static final ApiFeature.O_MR1 SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED = null;
    public static final ApiFeature.O_MR1 SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED = null;
    public static final ApiFeature.O_MR1 SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED = null;
    public static final ApiFeature.O SAFE_BROWSING_ENABLE = null;
    public static final ApiFeature.O_MR1 SAFE_BROWSING_HIT = null;
    public static final ApiFeature.O_MR1 SAFE_BROWSING_PRIVACY_POLICY_URL = null;
    public static final ApiFeature.O_MR1 SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY = null;
    public static final ApiFeature.O_MR1 SAFE_BROWSING_RESPONSE_PROCEED = null;
    public static final ApiFeature.O_MR1 SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL = null;
    public static final ApiFeature.NoFramework SAVE_STATE = null;
    public static final ApiFeature.N SERVICE_WORKER_BASIC_USAGE = null;
    public static final ApiFeature.N SERVICE_WORKER_BLOCK_NETWORK_LOADS = null;
    public static final ApiFeature.N SERVICE_WORKER_CACHE_MODE = null;
    public static final ApiFeature.N SERVICE_WORKER_CONTENT_ACCESS = null;
    public static final ApiFeature.N SERVICE_WORKER_FILE_ACCESS = null;
    public static final ApiFeature.N SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST = null;
    public static final ApiFeature.N SHOULD_OVERRIDE_WITH_REDIRECTS = null;
    public static final ApiFeature.NoFramework SPECULATIVE_LOADING = null;
    public static final ApiFeature.NoFramework SPECULATIVE_LOADING_CONFIG = null;
    public static final StartupApiFeature.NoFramework STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES = null;
    public static final StartupApiFeature.P STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX = null;
    public static final StartupApiFeature.NoFramework STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH = null;
    public static final ApiFeature.O_MR1 START_SAFE_BROWSING = null;
    public static final ApiFeature.P TRACING_CONTROLLER_BASIC_USAGE = null;
    public static final ApiFeature.NoFramework USER_AGENT_METADATA = null;
    public static final ApiFeature.M VISUAL_STATE_CALLBACK = null;
    public static final ApiFeature.NoFramework WEBVIEW_BUILDER = null;
    public static final ApiFeature.NoFramework WEBVIEW_MEDIA_INTEGRITY_API_STATUS = null;
    public static final ApiFeature.NoFramework WEB_AUTHENTICATION = null;
    public static final ApiFeature.NoFramework WEB_MESSAGE_ARRAY_BUFFER = null;
    public static final ApiFeature.M WEB_MESSAGE_CALLBACK_ON_MESSAGE = null;
    public static final ApiFeature.NoFramework WEB_MESSAGE_LISTENER = null;
    public static final ApiFeature.M WEB_MESSAGE_PORT_CLOSE = null;
    public static final ApiFeature.M WEB_MESSAGE_PORT_POST_MESSAGE = null;
    public static final ApiFeature.M WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK = null;
    public static final ApiFeature.M WEB_RESOURCE_ERROR_GET_CODE = null;
    public static final ApiFeature.M WEB_RESOURCE_ERROR_GET_DESCRIPTION = null;
    public static final ApiFeature.N WEB_RESOURCE_REQUEST_IS_REDIRECT = null;
    public static final ApiFeature.Q WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE = null;
    public static final ApiFeature.Q WEB_VIEW_RENDERER_TERMINATE = null;

    static {
        VISUAL_STATE_CALLBACK = new ApiFeature.M("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
        OFF_SCREEN_PRERASTER = new ApiFeature.M("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        SAFE_BROWSING_ENABLE = new ApiFeature.O("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        DISABLED_ACTION_MODE_MENU_ITEMS = new ApiFeature.N("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        START_SAFE_BROWSING = new ApiFeature.O_MR1("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED = new ApiFeature.O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED = new ApiFeature.O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED = new ApiFeature.O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED = new ApiFeature.O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        SAFE_BROWSING_PRIVACY_POLICY_URL = new ApiFeature.O_MR1("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        SERVICE_WORKER_BASIC_USAGE = new ApiFeature.N("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        SERVICE_WORKER_CACHE_MODE = new ApiFeature.N("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        SERVICE_WORKER_CONTENT_ACCESS = new ApiFeature.N("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        SERVICE_WORKER_FILE_ACCESS = new ApiFeature.N("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        SERVICE_WORKER_BLOCK_NETWORK_LOADS = new ApiFeature.N("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST = new ApiFeature.N("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        RECEIVE_WEB_RESOURCE_ERROR = new ApiFeature.M("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        RECEIVE_HTTP_ERROR = new ApiFeature.M("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        SHOULD_OVERRIDE_WITH_REDIRECTS = new ApiFeature.N("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        SAFE_BROWSING_HIT = new ApiFeature.O_MR1("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        WEB_RESOURCE_REQUEST_IS_REDIRECT = new ApiFeature.N("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        WEB_RESOURCE_ERROR_GET_DESCRIPTION = new ApiFeature.M("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        WEB_RESOURCE_ERROR_GET_CODE = new ApiFeature.M("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        SAFE_BROWSING_RESPONSE_PROCEED = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        WEB_MESSAGE_PORT_POST_MESSAGE = new ApiFeature.M("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        WEB_MESSAGE_PORT_CLOSE = new ApiFeature.M("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        WEB_MESSAGE_ARRAY_BUFFER = new ApiFeature.NoFramework("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK = new ApiFeature.M("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        CREATE_WEB_MESSAGE_CHANNEL = new ApiFeature.M("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        POST_WEB_MESSAGE = new ApiFeature.M("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        WEB_MESSAGE_CALLBACK_ON_MESSAGE = new ApiFeature.M("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        GET_WEB_VIEW_CLIENT = new ApiFeature.O("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        GET_WEB_CHROME_CLIENT = new ApiFeature.O("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        GET_WEB_VIEW_RENDERER = new ApiFeature.Q("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        WEB_VIEW_RENDERER_TERMINATE = new ApiFeature.Q("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        TRACING_CONTROLLER_BASIC_USAGE = new ApiFeature.P("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX = new StartupApiFeature.P("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
        STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH = new StartupApiFeature.NoFramework(WebViewFeature.STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS, StartupFeatures.STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH);
        STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES = new StartupApiFeature.NoFramework("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");
        WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE = new ApiFeature.Q("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        final String r1 = "ALGORITHMIC_DARKENING";
        final String r2 = "ALGORITHMIC_DARKENING";
        ALGORITHMIC_DARKENING = new AnonymousClass1(r1, r2);
        PROXY_OVERRIDE = new ApiFeature.NoFramework(WebViewFeature.PROXY_OVERRIDE, Features.PROXY_OVERRIDE);
        MULTI_PROCESS = new ApiFeature.NoFramework(WebViewFeature.MULTI_PROCESS, Features.MULTI_PROCESS_QUERY);
        FORCE_DARK = new ApiFeature.Q("FORCE_DARK", "FORCE_DARK");
        FORCE_DARK_STRATEGY = new ApiFeature.NoFramework(WebViewFeature.FORCE_DARK_STRATEGY, Features.FORCE_DARK_BEHAVIOR);
        WEB_MESSAGE_LISTENER = new ApiFeature.NoFramework("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        DOCUMENT_START_SCRIPT = new ApiFeature.NoFramework(WebViewFeature.DOCUMENT_START_SCRIPT, Features.DOCUMENT_START_SCRIPT);
        PROXY_OVERRIDE_REVERSE_BYPASS = new ApiFeature.NoFramework("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        GET_VARIATIONS_HEADER = new ApiFeature.NoFramework("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY = new ApiFeature.NoFramework("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        GET_COOKIE_INFO = new ApiFeature.NoFramework("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        REQUESTED_WITH_HEADER_ALLOW_LIST = new ApiFeature.NoFramework("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        USER_AGENT_METADATA = new ApiFeature.NoFramework("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        final String r3 = "MULTI_PROFILE";
        final String r4 = "MULTI_PROFILE";
        MULTI_PROFILE = new AnonymousClass2(r3, r4);
        ATTRIBUTION_REGISTRATION_BEHAVIOR = new ApiFeature.NoFramework(WebViewFeature.ATTRIBUTION_REGISTRATION_BEHAVIOR, Features.ATTRIBUTION_BEHAVIOR);
        WEBVIEW_MEDIA_INTEGRITY_API_STATUS = new ApiFeature.NoFramework(WebViewFeature.WEBVIEW_MEDIA_INTEGRITY_API_STATUS, Features.WEBVIEW_MEDIA_INTEGRITY_API_STATUS);
        MUTE_AUDIO = new ApiFeature.NoFramework("MUTE_AUDIO", "MUTE_AUDIO");
        WEB_AUTHENTICATION = new ApiFeature.NoFramework("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        SPECULATIVE_LOADING = new ApiFeature.NoFramework(WebViewFeature.SPECULATIVE_LOADING, Features.SPECULATIVE_LOADING);
        BACK_FORWARD_CACHE = new ApiFeature.NoFramework("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
        DELETE_BROWSING_DATA = new ApiFeature.NoFramework(WebViewFeature.DELETE_BROWSING_DATA, Features.WEB_STORAGE_DELETE_BROWSING_DATA);
        final String r5 = "PREFETCH_URL_V4";
        final String r6 = "PREFETCH_URL_V4";
        PROFILE_URL_PREFETCH = new AnonymousClass3(r5, r6);
        ASYNC_WEBVIEW_STARTUP = new ApiFeature.NoFramework("IMPLEMENTATION_ONLY_FEATURE", Features.ASYNC_WEBVIEW_STARTUP);
        DEFAULT_TRAFFICSTATS_TAGGING = new ApiFeature.NoFramework("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
        PRERENDER_WITH_URL = new ApiFeature.NoFramework("PRERENDER_URL_V2", "PRERENDER_URL_V2");
        SPECULATIVE_LOADING_CONFIG = new ApiFeature.NoFramework("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");
        SAVE_STATE = new ApiFeature.NoFramework("SAVE_STATE", "SAVE_STATE");
        NAVIGATION_CALLBACK_BASIC = new ApiFeature.NoFramework("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");
        CACHE_PROVIDER = new ApiFeature.NoFramework(WebViewFeature.CACHE_PROVIDER, Features.PROVIDER_WEAKLY_REF_WEBVIEW);
        PAYMENT_REQUEST = new ApiFeature.NoFramework("PAYMENT_REQUEST", "PAYMENT_REQUEST");
        WEBVIEW_BUILDER = new ApiFeature.NoFramework("WEBVIEW_BUILDER", "WEBVIEW_BUILDER");
    }

    private WebViewFeatureInternal() {
    }

    public static boolean isSupported(String publicFeatureValue) {
        return isSupported(publicFeatureValue, ApiFeature.values());
    }

    public static boolean isStartupFeatureSupported(String publicFeatureValue, Context context) {
        return isStartupFeatureSupported(publicFeatureValue, StartupApiFeature.values(), context);
    }

    public static <T extends ConditionallySupportedFeature> boolean isSupported(String publicFeatureValue, Collection<T> internalFeatures) {
        Set<ConditionallySupportedFeature> matchingFeatures = new HashSet();
        Iterator<T> r1 = internalFeatures.iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        ConditionallySupportedFeature feature = r1.next();
        if (feature.getPublicFeatureName().equals(publicFeatureValue) == false) goto L4;
        matchingFeatures.add(feature);
        goto L4
    L10:
        if (matchingFeatures.isEmpty() == true) goto L22;
        Iterator<ConditionallySupportedFeature> r2 = matchingFeatures.iterator();
    L13:
        if (r2.hasNext() == false) goto L19;
        if (r2.next().isSupported() == false) goto L13;
        return true;
    L19:
        return false;
    L22:
        throw new RuntimeException("Unknown feature " + publicFeatureValue);
    }

    public static boolean isStartupFeatureSupported(String publicFeatureValue, Collection<StartupApiFeature> internalFeatures, Context context) {
        Set<StartupApiFeature> matchingFeatures = new HashSet();
        Iterator<StartupApiFeature> r1 = internalFeatures.iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        StartupApiFeature feature = r1.next();
        if (feature.getPublicFeatureName().equals(publicFeatureValue) == false) goto L4;
        matchingFeatures.add(feature);
        goto L4
    L10:
        if (matchingFeatures.isEmpty() == true) goto L22;
        Iterator<StartupApiFeature> r2 = matchingFeatures.iterator();
    L13:
        if (r2.hasNext() == false) goto L19;
        if (r2.next().isSupported(context) == false) goto L13;
        return true;
    L19:
        return false;
    L22:
        throw new RuntimeException("Unknown feature " + publicFeatureValue);
    }

    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
