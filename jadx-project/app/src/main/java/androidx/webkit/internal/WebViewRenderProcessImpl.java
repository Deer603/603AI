package androidx.webkit.internal;

import androidx.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewRenderProcessImpl extends WebViewRenderProcess {
    private static final WeakHashMap<android.webkit.WebViewRenderProcess, WebViewRenderProcessImpl> sFrameworkMap = null;
    private WebViewRendererBoundaryInterface mBoundaryInterface;
    private WeakReference<android.webkit.WebViewRenderProcess> mFrameworkObject;

    static {
        sFrameworkMap = new WeakHashMap();
    }

    public WebViewRenderProcessImpl(WebViewRendererBoundaryInterface boundaryInterface) {
        this.mBoundaryInterface = boundaryInterface;
    }

    public WebViewRenderProcessImpl(android.webkit.WebViewRenderProcess frameworkRenderer) {
        this.mFrameworkObject = new WeakReference(frameworkRenderer);
    }

    public static WebViewRenderProcessImpl forInvocationHandler(InvocationHandler invocationHandler) {
        final WebViewRendererBoundaryInterface boundaryInterface = (WebViewRendererBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (WebViewRenderProcessImpl) boundaryInterface.getOrCreatePeer(new WebViewRenderProcessImpl$$ExternalSyntheticLambda0(boundaryInterface));
    }

    static /* synthetic */ Object lambda$forInvocationHandler$0(WebViewRendererBoundaryInterface boundaryInterface) throws Exception {
        return new WebViewRenderProcessImpl(boundaryInterface);
    }

    public static WebViewRenderProcessImpl forFrameworkObject(android.webkit.WebViewRenderProcess frameworkRenderer) {
        WebViewRenderProcessImpl renderer = sFrameworkMap.get(frameworkRenderer);
        if (renderer == null) goto L5;
        return renderer;
    L5:
        WebViewRenderProcessImpl renderer2 = new WebViewRenderProcessImpl(frameworkRenderer);
        sFrameworkMap.put(frameworkRenderer, renderer2);
        return renderer2;
    }

    @Override // androidx.webkit.WebViewRenderProcess
    public boolean terminate() {
        ApiFeature.Q feature = WebViewFeatureInternal.WEB_VIEW_RENDERER_TERMINATE;
        if (feature.isSupportedByFramework() == false) goto L12;
        android.webkit.WebViewRenderProcess renderer = this.mFrameworkObject.get();
        if (renderer != null) goto L7;
    L9:
        return false;
    L7:
        if (ApiHelperForQ.terminate(renderer) == false) goto L9;
        return true;
    L12:
        if (feature.isSupportedByWebView() == false) goto L16;
        return this.mBoundaryInterface.terminate();
    L16:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
