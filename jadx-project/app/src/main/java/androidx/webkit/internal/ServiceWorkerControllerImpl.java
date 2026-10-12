package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.webkit.ServiceWorkerClientCompat;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceWorkerControllerImpl extends ServiceWorkerControllerCompat {
    private ServiceWorkerControllerBoundaryInterface mBoundaryInterface;
    private ServiceWorkerController mFrameworksImpl;
    private final ServiceWorkerWebSettingsCompat mWebSettings;

    public ServiceWorkerControllerImpl() {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (feature.isSupportedByFramework() == false) goto L6;
        this.mFrameworksImpl = ApiHelperForN.getServiceWorkerControllerInstance();
        this.mBoundaryInterface = null;
        this.mWebSettings = ApiHelperForN.getServiceWorkerWebSettingsImpl(getFrameworksImpl());
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        this.mFrameworksImpl = null;
        this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
        this.mWebSettings = new ServiceWorkerWebSettingsImpl(this.mBoundaryInterface.getServiceWorkerWebSettings());
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private ServiceWorkerController getFrameworksImpl() {
        if (this.mFrameworksImpl != null) goto L6;
        this.mFrameworksImpl = ApiHelperForN.getServiceWorkerControllerInstance();
    L6:
        return this.mFrameworksImpl;
    }

    private ServiceWorkerControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface != null) goto L6;
        this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
    L6:
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings() {
        return this.mWebSettings;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public void setServiceWorkerClient(ServiceWorkerClientCompat client) {
        ApiFeature.N feature = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (feature.isSupportedByFramework() == false) goto L8;
        if (client != null) goto L6;
        ApiHelperForN.setServiceWorkerClient(getFrameworksImpl(), null);
        return;
    L6:
        ApiHelperForN.setServiceWorkerClientCompat(getFrameworksImpl(), client);
        return;
    L8:
        if (feature.isSupportedByWebView() == false) goto L14;
        if (client != null) goto L11;
        getBoundaryInterface().setServiceWorkerClient(null);
        return;
    L11:
        getBoundaryInterface().setServiceWorkerClient(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new ServiceWorkerClientAdapter(client)));
        return;
    L14:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
