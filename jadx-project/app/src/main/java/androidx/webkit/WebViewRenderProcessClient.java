package androidx.webkit;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WebViewRenderProcessClient {
    public abstract void onRenderProcessResponsive(WebView r1, WebViewRenderProcess r2);

    public abstract void onRenderProcessUnresponsive(WebView r1, WebViewRenderProcess r2);

    public WebViewRenderProcessClient() {
    }
}
