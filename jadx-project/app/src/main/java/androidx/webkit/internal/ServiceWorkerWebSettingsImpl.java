package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Set;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceWorkerWebSettingsImpl extends ServiceWorkerWebSettingsCompat {
    private ServiceWorkerWebSettingsBoundaryInterface mBoundaryInterface;
    private ServiceWorkerWebSettings mFrameworksImpl;

    public ServiceWorkerWebSettingsImpl(ServiceWorkerWebSettings settings) {
        this.mFrameworksImpl = settings;
    }

    public ServiceWorkerWebSettingsImpl(InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (ServiceWorkerWebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    private ServiceWorkerWebSettings getFrameworksImpl() {
        if (this.mFrameworksImpl != null) goto L6;
        this.mFrameworksImpl = WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(Proxy.getInvocationHandler(this.mBoundaryInterface));
    L6:
        return this.mFrameworksImpl;
    }

    private ServiceWorkerWebSettingsBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface != null) goto L6;
        this.mBoundaryInterface = (ServiceWorkerWebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(this.mFrameworksImpl));
    L6:
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setCacheMode(int mode) {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForN.setCacheMode(getFrameworksImpl(), mode);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getBoundaryInterface().setCacheMode(mode);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int getCacheMode() {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForN.getCacheMode(getFrameworksImpl());
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getBoundaryInterface().getCacheMode();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowContentAccess(boolean allow) {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForN.setAllowContentAccess(getFrameworksImpl(), allow);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getBoundaryInterface().setAllowContentAccess(allow);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowContentAccess() {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForN.getAllowContentAccess(getFrameworksImpl());
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getBoundaryInterface().getAllowContentAccess();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowFileAccess(boolean allow) {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForN.setAllowFileAccess(getFrameworksImpl(), allow);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getBoundaryInterface().setAllowFileAccess(allow);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowFileAccess() {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForN.getAllowFileAccess(getFrameworksImpl());
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getBoundaryInterface().getAllowFileAccess();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setBlockNetworkLoads(boolean flag) {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForN.setBlockNetworkLoads(getFrameworksImpl(), flag);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getBoundaryInterface().setBlockNetworkLoads(flag);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getBlockNetworkLoads() {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForN.getBlockNetworkLoads(getFrameworksImpl());
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getBoundaryInterface().getBlockNetworkLoads();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public Set<String> getRequestedWithHeaderOriginAllowList() {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST;
        if (feature.isSupportedByWebView() == false) goto L7;
        return getBoundaryInterface().getRequestedWithHeaderOriginAllowList();
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setRequestedWithHeaderOriginAllowList(Set<String> allowList) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST;
        if (feature.isSupportedByWebView() == false) goto L7;
        getBoundaryInterface().setRequestedWithHeaderOriginAllowList(allowList);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
