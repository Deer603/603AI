package androidx.webkit.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class ApiHelperForQ {
    private ApiHelperForQ() {
    }

    @Deprecated
    public static void setForceDark(WebSettings webSettings, int forceDark) {
        webSettings.setForceDark(forceDark);
    }

    @Deprecated
    public static int getForceDark(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    public static WebViewRenderProcess getWebViewRenderProcess(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    public static boolean terminate(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }

    public static void setWebViewRenderProcessClient(WebView webView, Executor executor, WebViewRenderProcessClient client) {
        if (client == null) goto L4;
        WebViewRenderProcessClientFrameworkAdapter clientAdapter = new WebViewRenderProcessClientFrameworkAdapter(client);
    L5:
        webView.setWebViewRenderProcessClient(executor, clientAdapter);
        return;
    L4:
        clientAdapter = null;
        goto L5
    }

    public static void setWebViewRenderProcessClient(WebView webView, WebViewRenderProcessClient client) {
        if (client == null) goto L4;
        WebViewRenderProcessClientFrameworkAdapter clientAdapter = new WebViewRenderProcessClientFrameworkAdapter(client);
    L5:
        webView.setWebViewRenderProcessClient(clientAdapter);
        return;
    L4:
        clientAdapter = null;
        goto L5
    }

    public static android.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }
}
