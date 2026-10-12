package androidx.webkit.internal;

import androidx.webkit.JavaScriptReplyProxy;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class JavaScriptReplyProxyImpl extends JavaScriptReplyProxy {
    private final JsReplyProxyBoundaryInterface mBoundaryInterface;

    public JavaScriptReplyProxyImpl(JsReplyProxyBoundaryInterface boundaryInterface) {
        this.mBoundaryInterface = boundaryInterface;
    }

    public static JavaScriptReplyProxyImpl forInvocationHandler(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface boundaryInterface = (JsReplyProxyBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (JavaScriptReplyProxyImpl) boundaryInterface.getOrCreatePeer(new JavaScriptReplyProxyImpl$$ExternalSyntheticLambda0(boundaryInterface));
    }

    static /* synthetic */ Object lambda$forInvocationHandler$0(JsReplyProxyBoundaryInterface boundaryInterface) throws Exception {
        return new JavaScriptReplyProxyImpl(boundaryInterface);
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(String message) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEB_MESSAGE_LISTENER;
        if (feature.isSupportedByWebView() == false) goto L7;
        this.mBoundaryInterface.postMessage(message);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(byte[] arrayBuffer) {
        Objects.requireNonNull(arrayBuffer, "ArrayBuffer must be non-null");
        ApiFeature.NoFramework feature = WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER;
        if (feature.isSupportedByWebView() == false) goto L7;
        this.mBoundaryInterface.postMessageWithPayload(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessagePayloadAdapter(arrayBuffer)));
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
