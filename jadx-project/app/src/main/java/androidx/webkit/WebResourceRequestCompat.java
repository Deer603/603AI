package androidx.webkit;

import android.webkit.WebResourceRequest;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.WebResourceRequestAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;

/* JADX INFO: loaded from: classes4.dex */
public class WebResourceRequestCompat {
    private WebResourceRequestCompat() {
    }

    public static boolean isRedirect(WebResourceRequest request) {
        ApiFeature.N feature = WebViewFeatureInternal.WEB_RESOURCE_REQUEST_IS_REDIRECT;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForN.isRedirect(request);
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getAdapter(request).isRedirect();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebResourceRequestAdapter getAdapter(WebResourceRequest request) {
        return WebViewGlueCommunicator.getCompatConverter().convertWebResourceRequest(request);
    }
}
