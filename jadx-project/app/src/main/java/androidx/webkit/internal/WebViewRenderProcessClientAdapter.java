package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewRenderProcessClientAdapter implements WebViewRendererClientBoundaryInterface {
    private static final String[] sSupportedFeatures = null;
    private final Executor mExecutor;
    private final WebViewRenderProcessClient mWebViewRenderProcessClient;

    static {
        sSupportedFeatures = new String[]{"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};
    }

    public WebViewRenderProcessClientAdapter(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mExecutor = executor;
        this.mWebViewRenderProcessClient = webViewRenderProcessClient;
    }

    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return this.mWebViewRenderProcessClient;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(final WebView view, InvocationHandler renderer) {
        final WebViewRenderProcess rendererObject = WebViewRenderProcessImpl.forInvocationHandler(renderer);
        final WebViewRenderProcessClient client = this.mWebViewRenderProcessClient;
        if (this.mExecutor != null) goto L5;
        client.onRenderProcessUnresponsive(view, rendererObject);
        return;
    L5:
        this.mExecutor.execute(new WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda1(client, view, rendererObject));
    }

    static /* synthetic */ void lambda$onRendererUnresponsive$0(WebViewRenderProcessClient client, WebView view, WebViewRenderProcess rendererObject) {
        client.onRenderProcessUnresponsive(view, rendererObject);
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(final WebView view, InvocationHandler renderer) {
        final WebViewRenderProcess rendererObject = WebViewRenderProcessImpl.forInvocationHandler(renderer);
        final WebViewRenderProcessClient client = this.mWebViewRenderProcessClient;
        if (this.mExecutor != null) goto L5;
        client.onRenderProcessResponsive(view, rendererObject);
        return;
    L5:
        this.mExecutor.execute(new WebViewRenderProcessClientAdapter$$ExternalSyntheticLambda0(client, view, rendererObject));
    }

    static /* synthetic */ void lambda$onRendererResponsive$1(WebViewRenderProcessClient client, WebView view, WebViewRenderProcess rendererObject) {
        client.onRenderProcessResponsive(view, rendererObject);
    }
}
