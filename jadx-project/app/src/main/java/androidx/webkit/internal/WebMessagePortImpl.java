package androidx.webkit.internal;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class WebMessagePortImpl extends WebMessagePortCompat {
    private WebMessagePortBoundaryInterface mBoundaryInterface;
    private WebMessagePort mFrameworksImpl;

    public WebMessagePortImpl(WebMessagePort frameworksImpl) {
        this.mFrameworksImpl = frameworksImpl;
    }

    public WebMessagePortImpl(InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    private WebMessagePort getFrameworksImpl() {
        if (this.mFrameworksImpl != null) goto L6;
        this.mFrameworksImpl = WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(Proxy.getInvocationHandler(this.mBoundaryInterface));
    L6:
        return this.mFrameworksImpl;
    }

    private WebMessagePortBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface != null) goto L6;
        this.mBoundaryInterface = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(this.mFrameworksImpl));
    L6:
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void postMessage(WebMessageCompat message) {
        ApiFeature.M feature = WebViewFeatureInternal.WEB_MESSAGE_PORT_POST_MESSAGE;
        if (feature.isSupportedByFramework() == false) goto L8;
        if (message.getType() != 0) goto L8;
        ApiHelperForM.postMessage(getFrameworksImpl(), compatToFrameworkMessage(message));
        return;
    L8:
        if (feature.isSupportedByWebView() == false) goto L14;
        if (WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(message.getType()) == false) goto L14;
        getBoundaryInterface().postMessage(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageAdapter(message)));
        return;
    L14:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void close() {
        ApiFeature.M feature = WebViewFeatureInternal.WEB_MESSAGE_PORT_CLOSE;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForM.close(getFrameworksImpl());
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getBoundaryInterface().close();
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(WebMessagePortCompat.WebMessageCallbackCompat callback) {
        ApiFeature.M feature = WebViewFeatureInternal.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK;
        if (feature.isSupportedByWebView() == false) goto L6;
        getBoundaryInterface().setWebMessageCallback(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageCallbackAdapter(callback)));
        return;
    L6:
        if (feature.isSupportedByFramework() == false) goto L10;
        ApiHelperForM.setWebMessageCallback(getFrameworksImpl(), callback);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(Handler handler, WebMessagePortCompat.WebMessageCallbackCompat callback) {
        ApiFeature.M feature = WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (feature.isSupportedByWebView() == false) goto L6;
        getBoundaryInterface().setWebMessageCallback(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageCallbackAdapter(callback)), handler);
        return;
    L6:
        if (feature.isSupportedByFramework() == false) goto L10;
        ApiHelperForM.setWebMessageCallback(getFrameworksImpl(), callback, handler);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public WebMessagePort getFrameworkPort() {
        return getFrameworksImpl();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public InvocationHandler getInvocationHandler() {
        return Proxy.getInvocationHandler(getBoundaryInterface());
    }

    public static WebMessagePortCompat[] portsToCompat(WebMessagePort[] ports) {
        if (ports != null) goto L5;
        return null;
    L5:
        WebMessagePortCompat[] compatPorts = new WebMessagePortCompat[ports.length];
        int n = 0;
    L7:
        if (n >= ports.length) goto L9;
        compatPorts[n] = new WebMessagePortImpl(ports[n]);
        n = n + 1;
        goto L7
    L9:
        return compatPorts;
    }

    public static WebMessagePort[] compatToPorts(WebMessagePortCompat[] compatPorts) {
        if (compatPorts != null) goto L5;
        return null;
    L5:
        WebMessagePort[] ports = new WebMessagePort[compatPorts.length];
        int n = 0;
    L7:
        if (n >= ports.length) goto L9;
        ports[n] = compatPorts[n].getFrameworkPort();
        n = n + 1;
        goto L7
    L9:
        return ports;
    }

    public static WebMessage compatToFrameworkMessage(WebMessageCompat message) {
        return ApiHelperForM.createWebMessage(message);
    }

    public static WebMessageCompat frameworkMessageToCompat(WebMessage message) {
        return ApiHelperForM.createWebMessageCompat(message);
    }
}
