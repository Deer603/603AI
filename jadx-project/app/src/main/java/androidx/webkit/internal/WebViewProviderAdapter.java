package androidx.webkit.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.webkit.PrerenderException;
import androidx.webkit.PrerenderOperationCallback;
import androidx.webkit.Profile;
import androidx.webkit.SpeculativeLoadingParameters;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebNavigationClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewProviderAdapter {
    final WebViewProviderBoundaryInterface mImpl;

    public WebViewProviderAdapter(WebViewProviderBoundaryInterface impl) {
        this.mImpl = impl;
    }

    public void insertVisualStateCallback(long requestId, WebViewCompat.VisualStateCallback callback) {
        this.mImpl.insertVisualStateCallback(requestId, BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new VisualStateCallbackAdapter(callback)));
    }

    public WebMessagePortCompat[] createWebMessageChannel() {
        InvocationHandler[] invocationHandlers = this.mImpl.createWebMessageChannel();
        WebMessagePortCompat[] messagePorts = new WebMessagePortCompat[invocationHandlers.length];
        int n = 0;
    L4:
        if (n >= invocationHandlers.length) goto L6;
        messagePorts[n] = new WebMessagePortImpl(invocationHandlers[n]);
        n = n + 1;
        goto L4
    L6:
        return messagePorts;
    }

    public void postWebMessage(WebMessageCompat message, Uri targetOrigin) {
        this.mImpl.postMessageToMainFrame(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageAdapter(message)), targetOrigin);
    }

    public void addWebMessageListener(String jsObjectName, String[] allowedOriginRules, WebViewCompat.WebMessageListener listener) {
        this.mImpl.addWebMessageListener(jsObjectName, allowedOriginRules, BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageListenerAdapter(listener)));
    }

    public ScriptHandlerImpl addDocumentStartJavaScript(String script, String[] allowedOriginRules) {
        return ScriptHandlerImpl.toScriptHandler(this.mImpl.addDocumentStartJavaScript(script, allowedOriginRules));
    }

    public void removeWebMessageListener(String jsObjectName) {
        this.mImpl.removeWebMessageListener(jsObjectName);
    }

    public WebViewClient getWebViewClient() {
        return this.mImpl.getWebViewClient();
    }

    public WebChromeClient getWebChromeClient() {
        return this.mImpl.getWebChromeClient();
    }

    public WebViewRenderProcess getWebViewRenderProcess() {
        return WebViewRenderProcessImpl.forInvocationHandler(this.mImpl.getWebViewRenderer());
    }

    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        InvocationHandler handler = this.mImpl.getWebViewRendererClient();
        if (handler != null) goto L7;
        return null;
    L7:
        return ((WebViewRenderProcessClientAdapter) BoundaryInterfaceReflectionUtil.getDelegateFromInvocationHandler(handler)).getWebViewRenderProcessClient();
    }

    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        if (webViewRenderProcessClient == null) goto L4;
        InvocationHandler handler = BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebViewRenderProcessClientAdapter(executor, webViewRenderProcessClient));
    L5:
        this.mImpl.setWebViewRendererClient(handler);
        return;
    L4:
        handler = null;
        goto L5
    }

    public void setProfileWithName(String profileName) {
        this.mImpl.setProfile(profileName);
    }

    public Profile getProfile() {
        ProfileBoundaryInterface profile = (ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, this.mImpl.getProfile());
        return new ProfileImpl(profile);
    }

    public boolean isAudioMuted() {
        return this.mImpl.isAudioMuted();
    }

    public void setAudioMuted(boolean mute) {
        this.mImpl.setAudioMuted(mute);
    }

    public void prerenderUrlAsync(String url, CancellationSignal cancellationSignal, Executor callbackExecutor, final PrerenderOperationCallback callback) {
        ValueCallback<Void> activationCallback = new WebViewProviderAdapter$$ExternalSyntheticLambda2(callback);
        ValueCallback<Throwable> errorCallback = new WebViewProviderAdapter$$ExternalSyntheticLambda3(callback);
        this.mImpl.prerenderUrl(url, cancellationSignal, callbackExecutor, activationCallback, errorCallback);
    }

    static /* synthetic */ void lambda$prerenderUrlAsync$0(PrerenderOperationCallback callback, Void value) {
        callback.onPrerenderActivated();
    }

    static /* synthetic */ void lambda$prerenderUrlAsync$1(PrerenderOperationCallback callback, Throwable throwable) {
        callback.onError(new PrerenderException("Prerender operation failed", throwable));
    }

    public void prerenderUrlAsync(String url, CancellationSignal cancellationSignal, Executor callbackExecutor, SpeculativeLoadingParameters params, final PrerenderOperationCallback callback) {
        InvocationHandler paramsBoundaryInterface = BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new SpeculativeLoadingParametersAdapter(params));
        ValueCallback<Void> activationCallback = new WebViewProviderAdapter$$ExternalSyntheticLambda0(callback);
        ValueCallback<Throwable> errorCallback = new WebViewProviderAdapter$$ExternalSyntheticLambda1(callback);
        this.mImpl.prerenderUrl(url, cancellationSignal, callbackExecutor, paramsBoundaryInterface, activationCallback, errorCallback);
    }

    static /* synthetic */ void lambda$prerenderUrlAsync$2(PrerenderOperationCallback callback, Void value) {
        callback.onPrerenderActivated();
    }

    static /* synthetic */ void lambda$prerenderUrlAsync$3(PrerenderOperationCallback callback, Throwable throwable) {
        callback.onError(new PrerenderException("Prerender operation failed", throwable));
    }

    public void saveState(Bundle outState, int maxSizeBytes, boolean includeForwardState) {
        this.mImpl.saveState(outState, maxSizeBytes, includeForwardState);
    }

    public void setWebNavigationClient(WebNavigationClient client) {
        InvocationHandler clientBoundaryInterface = BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebNavigationClientAdapter(client));
        this.mImpl.setWebViewNavigationClient(clientBoundaryInterface);
    }

    public WebNavigationClient getWebNavigationClient() {
        InvocationHandler client = this.mImpl.getWebViewNavigationClient();
        if (client != null) goto L7;
        return null;
    L7:
        return ((WebNavigationClientAdapter) BoundaryInterfaceReflectionUtil.getDelegateFromInvocationHandler(client)).getWebNavigationClient();
    }
}
