package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebStorageBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class WebkitToCompatConverter {
    private final WebkitToCompatConverterBoundaryInterface mImpl;

    public WebkitToCompatConverter(WebkitToCompatConverterBoundaryInterface impl) {
        this.mImpl = impl;
    }

    public WebSettingsAdapter convertSettings(WebSettings webSettings) {
        return new WebSettingsAdapter((WebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebSettingsBoundaryInterface.class, this.mImpl.convertSettings(webSettings)));
    }

    public WebResourceRequestAdapter convertWebResourceRequest(WebResourceRequest request) {
        return new WebResourceRequestAdapter((WebResourceRequestBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceRequestBoundaryInterface.class, this.mImpl.convertWebResourceRequest(request)));
    }

    public InvocationHandler convertServiceWorkerSettings(ServiceWorkerWebSettings settings) {
        return this.mImpl.convertServiceWorkerSettings(settings);
    }

    public ServiceWorkerWebSettings convertServiceWorkerSettings(InvocationHandler serviceWorkerSettings) {
        return (ServiceWorkerWebSettings) this.mImpl.convertServiceWorkerSettings(serviceWorkerSettings);
    }

    public InvocationHandler convertWebResourceError(WebResourceError webResourceError) {
        return this.mImpl.convertWebResourceError(webResourceError);
    }

    public WebResourceError convertWebResourceError(InvocationHandler webResourceError) {
        return (WebResourceError) this.mImpl.convertWebResourceError(webResourceError);
    }

    public InvocationHandler convertSafeBrowsingResponse(SafeBrowsingResponse safeBrowsingResponse) {
        return this.mImpl.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public SafeBrowsingResponse convertSafeBrowsingResponse(InvocationHandler safeBrowsingResponse) {
        return (SafeBrowsingResponse) this.mImpl.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public InvocationHandler convertWebMessagePort(WebMessagePort webMessagePort) {
        return this.mImpl.convertWebMessagePort(webMessagePort);
    }

    public WebMessagePort convertWebMessagePort(InvocationHandler webMessagePort) {
        return (WebMessagePort) this.mImpl.convertWebMessagePort(webMessagePort);
    }

    public CookieManagerAdapter convertCookieManager(CookieManager cookieManager) {
        return new CookieManagerAdapter((WebViewCookieManagerBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewCookieManagerBoundaryInterface.class, this.mImpl.convertCookieManager(cookieManager)));
    }

    public WebStorageAdapter convertWebStorage(WebStorage webStorage) {
        return new WebStorageAdapter((WebStorageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebStorageBoundaryInterface.class, this.mImpl.convertWebStorage(webStorage)));
    }
}
