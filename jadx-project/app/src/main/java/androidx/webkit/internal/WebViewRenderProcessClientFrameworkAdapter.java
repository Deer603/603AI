package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {
    private final androidx.webkit.WebViewRenderProcessClient mWebViewRenderProcessClient;

    public WebViewRenderProcessClientFrameworkAdapter(androidx.webkit.WebViewRenderProcessClient client) {
        this.mWebViewRenderProcessClient = client;
    }

    public void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess renderer) {
        this.mWebViewRenderProcessClient.onRenderProcessUnresponsive(view, WebViewRenderProcessImpl.forFrameworkObject(renderer));
    }

    public void onRenderProcessResponsive(WebView view, WebViewRenderProcess renderer) {
        this.mWebViewRenderProcessClient.onRenderProcessResponsive(view, WebViewRenderProcessImpl.forFrameworkObject(renderer));
    }

    public androidx.webkit.WebViewRenderProcessClient getFrameworkRenderProcessClient() {
        return this.mWebViewRenderProcessClient;
    }
}
