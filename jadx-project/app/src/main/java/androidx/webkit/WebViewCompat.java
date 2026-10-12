package androidx.webkit;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForOMR1;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebMessageAdapter;
import androidx.webkit.internal.WebMessagePortImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import androidx.webkit.internal.WebViewProviderFactory;
import androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewCompat {
    private static final Uri EMPTY_URI = null;
    private static final Uri WILDCARD_URI = null;
    private static final WeakHashMap<WebView, WebViewProviderAdapter> sProviderAdapterCache = null;
    private static boolean sShouldCacheProvider;

    /* JADX INFO: renamed from: androidx.webkit.WebViewCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalAsyncStartUp {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalCacheProvider {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalSaveState {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalUrlPrerender {
    }

    private static class NullReturningWebViewStartUpResult implements WebViewStartUpResult {
        private NullReturningWebViewStartUpResult() {
        }

        /* synthetic */ NullReturningWebViewStartUpResult(AnonymousClass1 x0) {
            this();
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public Long getTotalTimeInUiThreadMillis() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public Long getMaxTimePerTaskInUiThreadMillis() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public List<BlockingStartUpLocation> getBlockingStartUpLocations() {
            return null;
        }
    }

    public interface VisualStateCallback {
        void onComplete(long r1);
    }

    public interface WebMessageListener {
        void onPostMessage(WebView r1, WebMessageCompat r2, Uri r3, boolean r4, JavaScriptReplyProxy r5);
    }

    public interface WebViewStartUpCallback {
        void onSuccess(WebViewStartUpResult r1);
    }

    static {
        WILDCARD_URI = Uri.parse(ProxyConfig.MATCH_ALL_SCHEMES);
        EMPTY_URI = Uri.parse("");
        sShouldCacheProvider = true;
        sProviderAdapterCache = new WeakHashMap();
    }

    private WebViewCompat() {
    }

    public static void postVisualStateCallback(WebView webview, long requestId, VisualStateCallback callback) {
        ApiFeature.M feature = WebViewFeatureInternal.VISUAL_STATE_CALLBACK;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForM.postVisualStateCallback(webview, requestId, callback);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        checkThread(webview);
        getProvider(webview).insertVisualStateCallback(requestId, callback);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> callback) {
        ApiFeature.O_MR1 feature = WebViewFeatureInternal.START_SAFE_BROWSING;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForOMR1.startSafeBrowsing(context, callback);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getFactory().getStatics().initSafeBrowsing(context, callback);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setSafeBrowsingAllowlist(Set<String> hosts, ValueCallback<Boolean> callback) {
        ApiFeature.O_MR1 preferredFeature = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        ApiFeature.O_MR1 deprecatedFeature = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (preferredFeature.isSupportedByWebView() == false) goto L6;
        getFactory().getStatics().setSafeBrowsingAllowlist(hosts, callback);
        return;
    L6:
        List<String> hostsList = new ArrayList(hosts);
        if (deprecatedFeature.isSupportedByFramework() == false) goto L10;
        ApiHelperForOMR1.setSafeBrowsingWhitelist(hostsList, callback);
        return;
    L10:
        if (deprecatedFeature.isSupportedByWebView() == false) goto L14;
        getFactory().getStatics().setSafeBrowsingWhitelist(hostsList, callback);
        return;
    L14:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(List<String> hosts, ValueCallback<Boolean> callback) {
        setSafeBrowsingAllowlist(new HashSet(hosts), callback);
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        ApiFeature.O_MR1 feature = WebViewFeatureInternal.SAFE_BROWSING_PRIVACY_POLICY_URL;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl();
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getFactory().getStatics().getSafeBrowsingPrivacyPolicyUrl();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static PackageInfo getCurrentWebViewPackage(Context context) {
        PackageInfo info = getCurrentLoadedWebViewPackage();
        if (info == null) goto L6;
        return info;
    L6:
        return getNotYetLoadedWebViewPackageInfo(context);
    }

    public static PackageInfo getCurrentLoadedWebViewPackage() {
        return ApiHelperForO.getCurrentWebViewPackage();
    }

    private static PackageInfo getLoadedWebViewPackageInfo() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> webViewFactoryClass = Class.forName("android.webkit.WebViewFactory");
        return (PackageInfo) webViewFactoryClass.getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    private static PackageInfo getNotYetLoadedWebViewPackageInfo(Context context) {
        Class<?> webviewUpdateServiceClass = Class.forName("android.webkit.WebViewUpdateService");     // Catch: Throwable -> L11 InvocationTargetException -> L13 IllegalAccessException -> L15 ClassNotFoundException -> L17
        String webviewPackageName = (String) webviewUpdateServiceClass.getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);     // Catch: Throwable -> L11 InvocationTargetException -> L13 IllegalAccessException -> L15 ClassNotFoundException -> L17
        if (webviewPackageName != null) goto L6;
        return null;
    L6:
        PackageManager pm = context.getPackageManager();
        return pm.getPackageInfo(webviewPackageName, 0);
    L10:
        return null;
    L18:
        return null;
    }

    private static WebViewProviderAdapter getProvider(WebView webview) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.CACHE_PROVIDER;
        if (feature.isSupportedByWebView() == false) goto L11;
        if (sShouldCacheProvider == false) goto L11;
        WebViewProviderAdapter adapter = sProviderAdapterCache.get(webview);
        if (adapter != null) goto L12;
        WebViewProviderAdapter adapter2 = new WebViewProviderAdapter(createProvider(webview));
        sProviderAdapterCache.put(webview, adapter2);
        return adapter2;
    L12:
        return adapter;
    L11:
        return new WebViewProviderAdapter(createProvider(webview));
    }

    public static WebMessagePortCompat[] createWebMessageChannel(WebView webview) {
        ApiFeature.M feature = WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (feature.isSupportedByFramework() == false) goto L7;
        return WebMessagePortImpl.portsToCompat(ApiHelperForM.createWebMessageChannel(webview));
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        checkThread(webview);
        return getProvider(webview).createWebMessageChannel();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void postWebMessage(WebView webview, WebMessageCompat message, Uri targetOrigin) {
        if (WILDCARD_URI.equals(targetOrigin) == false) goto L5;
        targetOrigin = EMPTY_URI;
    L5:
        ApiFeature.M feature = WebViewFeatureInternal.POST_WEB_MESSAGE;
        if (feature.isSupportedByFramework() == false) goto L11;
        if (message.getType() != 0) goto L11;
        ApiHelperForM.postWebMessage(webview, WebMessagePortImpl.compatToFrameworkMessage(message), targetOrigin);
        return;
    L11:
        if (feature.isSupportedByWebView() == false) goto L17;
        if (WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(message.getType()) == false) goto L17;
        checkThread(webview);
        getProvider(webview).postWebMessage(message, targetOrigin);
        return;
    L17:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void addWebMessageListener(WebView webView, String jsObjectName, Set<String> allowedOriginRules, WebMessageListener listener) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEB_MESSAGE_LISTENER;
        if (feature.isSupportedByWebView() == false) goto L7;
        getProvider(webView).addWebMessageListener(jsObjectName, (String[]) allowedOriginRules.toArray(new String[0]), listener);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void removeWebMessageListener(WebView webview, String jsObjectName) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEB_MESSAGE_LISTENER;
        if (feature.isSupportedByWebView() == false) goto L7;
        getProvider(webview).removeWebMessageListener(jsObjectName);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static ScriptHandler addDocumentStartJavaScript(WebView webview, String script, Set<String> allowedOriginRules) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.DOCUMENT_START_SCRIPT;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getProvider(webview).addDocumentStartJavaScript(script, (String[]) allowedOriginRules.toArray(new String[0]));
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebViewClient getWebViewClient(WebView webview) {
        ApiFeature.O feature = WebViewFeatureInternal.GET_WEB_VIEW_CLIENT;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForO.getWebViewClient(webview);
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        checkThread(webview);
        return getProvider(webview).getWebViewClient();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebChromeClient getWebChromeClient(WebView webview) {
        ApiFeature.O feature = WebViewFeatureInternal.GET_WEB_CHROME_CLIENT;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForO.getWebChromeClient(webview);
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        checkThread(webview);
        return getProvider(webview).getWebChromeClient();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebViewRenderProcess getWebViewRenderProcess(WebView webview) {
        ApiFeature.Q feature = WebViewFeatureInternal.GET_WEB_VIEW_RENDERER;
        if (feature.isSupportedByFramework() == false) goto L10;
        android.webkit.WebViewRenderProcess renderer = ApiHelperForQ.getWebViewRenderProcess(webview);
        if (renderer != null) goto L15;
        return null;
    L15:
        return WebViewRenderProcessImpl.forFrameworkObject(renderer);
    L10:
        if (feature.isSupportedByWebView() == false) goto L14;
        checkThread(webview);
        return getProvider(webview).getWebViewRenderProcess();
    L14:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebViewRenderProcessClient(WebView webview, Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        ApiFeature.Q feature = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForQ.setWebViewRenderProcessClient(webview, executor, webViewRenderProcessClient);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        checkThread(webview);
        getProvider(webview).setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebViewRenderProcessClient(WebView webview, WebViewRenderProcessClient webViewRenderProcessClient) {
        ApiFeature.Q feature = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForQ.setWebViewRenderProcessClient(webview, webViewRenderProcessClient);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        checkThread(webview);
        getProvider(webview).setWebViewRenderProcessClient(null, webViewRenderProcessClient);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebViewRenderProcessClient getWebViewRenderProcessClient(WebView webview) {
        ApiFeature.Q feature = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (feature.isSupportedByFramework() == false) goto L14;
        android.webkit.WebViewRenderProcessClient renderer = ApiHelperForQ.getWebViewRenderProcessClient(webview);
        if (renderer != null) goto L7;
        return null;
    L7:
        if ((renderer instanceof WebViewRenderProcessClientFrameworkAdapter) == true) goto L10;
        return null;
    L10:
        return ((WebViewRenderProcessClientFrameworkAdapter) renderer).getFrameworkRenderProcessClient();
    L14:
        if (feature.isSupportedByWebView() == false) goto L18;
        checkThread(webview);
        return getProvider(webview).getWebViewRenderProcessClient();
    L18:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isMultiProcessEnabled() {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MULTI_PROCESS;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getFactory().getStatics().isMultiProcessEnabled();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static String getVariationsHeader() {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.GET_VARIATIONS_HEADER;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getFactory().getStatics().getVariationsHeader();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setProfile(WebView webView, String profileName) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MULTI_PROFILE;
        if (feature.isSupportedByWebView() == false) goto L7;
        getProvider(webView).setProfileWithName(profileName);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static Profile getProfile(WebView webView) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MULTI_PROFILE;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getProvider(webView).getProfile();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isAudioMuted(WebView webView) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MUTE_AUDIO;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getProvider(webView).isAudioMuted();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAudioMuted(WebView webView, boolean mute) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.MUTE_AUDIO;
        if (feature.isSupportedByWebView() == false) goto L7;
        getProvider(webView).setAudioMuted(mute);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void startUpWebView(final Context context, final WebViewStartUpConfig config, final WebViewStartUpCallback callback) {
        config.getBackgroundExecutor().execute(new WebViewCompat$$ExternalSyntheticLambda0(config, callback, context));
    }

    static /* synthetic */ void lambda$startUpWebView$3(WebViewStartUpConfig config, final WebViewStartUpCallback callback, Context context) {
        WebViewGlueCommunicator.getWebViewClassLoader();
        if (WebViewFeatureInternal.ASYNC_WEBVIEW_STARTUP.isSupportedByWebView() == false) goto L7;
        getFactory().startUpWebView(config, new WebViewCompat$$ExternalSyntheticLambda2(callback));
        return;
    L7:
        if (config.shouldRunUiThreadStartUpTasks() == false) goto L9;
        WebSettings.getDefaultUserAgent(context.getApplicationContext());
    L9:
        new Handler(Looper.getMainLooper()).post(new WebViewCompat$$ExternalSyntheticLambda3(callback));
    }

    static /* synthetic */ void lambda$startUpWebView$0(WebViewStartUpCallback callback, WebViewStartUpResult result) {
        callback.onSuccess(result);
    }

    static /* synthetic */ void lambda$startUpWebView$1(final WebViewStartUpCallback callback, final WebViewStartUpResult result) {
        new Handler(Looper.getMainLooper()).post(new WebViewCompat$$ExternalSyntheticLambda1(callback, result));
    }

    static /* synthetic */ void lambda$startUpWebView$2(WebViewStartUpCallback callback) {
        callback.onSuccess(new NullReturningWebViewStartUpResult(null));
    }

    public static void setDefaultTrafficStatsTag(int tag) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.DEFAULT_TRAFFICSTATS_TAGGING;
        if (feature.isSupportedByWebView() == false) goto L7;
        getFactory().getStatics().setDefaultTrafficStatsTag(tag);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void prerenderUrlAsync(WebView webView, String url, CancellationSignal cancellationSignal, Executor callbackExecutor, PrerenderOperationCallback callback) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.PRERENDER_WITH_URL;
        if (feature.isSupportedByWebView() == false) goto L7;
        getProvider(webView).prerenderUrlAsync(url, cancellationSignal, callbackExecutor, callback);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void prerenderUrlAsync(WebView webView, String url, CancellationSignal cancellationSignal, Executor callbackExecutor, SpeculativeLoadingParameters params, PrerenderOperationCallback callback) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.PRERENDER_WITH_URL;
        if (feature.isSupportedByWebView() == false) goto L7;
        getProvider(webView).prerenderUrlAsync(url, cancellationSignal, callbackExecutor, params, callback);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void saveState(WebView webView, Bundle outState, int maxSizeBytes, boolean includeForwardState) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.SAVE_STATE;
        if (feature.isSupportedByWebView() == false) goto L7;
        getProvider(webView).saveState(outState, maxSizeBytes, includeForwardState);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setShouldCacheProvider(boolean shouldCacheProvider) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.CACHE_PROVIDER;
        if (feature.isSupportedByWebView() == false) goto L7;
        sShouldCacheProvider = shouldCacheProvider;
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebNavigationClient(WebView webView, WebNavigationClient client) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.NAVIGATION_CALLBACK_BASIC;
        if (feature.isSupportedByWebView() == false) goto L7;
        getProvider(webView).setWebNavigationClient(client);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebNavigationClient getWebNavigationClient(WebView webView) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.NAVIGATION_CALLBACK_BASIC;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getProvider(webView).getWebNavigationClient();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebViewProviderFactory getFactory() {
        return WebViewGlueCommunicator.getFactory();
    }

    private static WebViewProviderBoundaryInterface createProvider(WebView webview) {
        return getFactory().createWebView(webview);
    }

    private static void checkThread(WebView webview) {
        if (Build.VERSION.SDK_INT < 28) goto L18;
        Looper webViewLooper = ApiHelperForP.getWebViewLooper(webview);
        if (webViewLooper != Looper.myLooper()) goto L8;
        return;
    L8:
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    L18:
        Method checkThreadMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);     // Catch: InvocationTargetException -> L11 Throwable -> L13 NoSuchMethodException -> L15
        checkThreadMethod.setAccessible(true);     // Catch: InvocationTargetException -> L11 Throwable -> L13 NoSuchMethodException -> L15
        checkThreadMethod.invoke(webview, new Object[0]);     // Catch: InvocationTargetException -> L11 Throwable -> L13 NoSuchMethodException -> L15
        return;
    L13:
        e = move-exception;
        throw new RuntimeException(e);
    }

    static WeakHashMap<WebView, WebViewProviderAdapter> getProviderAdapterCacheForTesting() {
        return sProviderAdapterCache;
    }
}
