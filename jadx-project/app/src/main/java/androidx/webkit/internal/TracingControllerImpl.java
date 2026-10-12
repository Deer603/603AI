package androidx.webkit.internal;

import androidx.webkit.TracingConfig;
import androidx.webkit.TracingController;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class TracingControllerImpl extends TracingController {
    private TracingControllerBoundaryInterface mBoundaryInterface;
    private android.webkit.TracingController mFrameworksImpl;

    public TracingControllerImpl() {
        ApiFeature.P feature = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (feature.isSupportedByFramework() == false) goto L6;
        this.mFrameworksImpl = ApiHelperForP.getTracingControllerInstance();
        this.mBoundaryInterface = null;
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        this.mFrameworksImpl = null;
        this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getTracingController();
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private android.webkit.TracingController getFrameworksImpl() {
        if (this.mFrameworksImpl != null) goto L6;
        this.mFrameworksImpl = ApiHelperForP.getTracingControllerInstance();
    L6:
        return this.mFrameworksImpl;
    }

    private TracingControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface != null) goto L6;
        this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getTracingController();
    L6:
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.TracingController
    public boolean isTracing() {
        ApiFeature.P feature = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForP.isTracing(getFrameworksImpl());
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getBoundaryInterface().isTracing();
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.TracingController
    public void start(TracingConfig tracingConfig) {
        if (tracingConfig == null) goto L13;
        ApiFeature.P feature = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (feature.isSupportedByFramework() == false) goto L7;
        ApiHelperForP.start(getFrameworksImpl(), tracingConfig);
        return;
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        getBoundaryInterface().start(tracingConfig.getPredefinedCategories(), tracingConfig.getCustomIncludedCategories(), tracingConfig.getTracingMode());
        return;
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    L13:
        throw new IllegalArgumentException("Tracing config must be non null");
    }

    @Override // androidx.webkit.TracingController
    public boolean stop(OutputStream outputStream, Executor executor) {
        ApiFeature.P feature = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (feature.isSupportedByFramework() == false) goto L7;
        return ApiHelperForP.stop(getFrameworksImpl(), outputStream, executor);
    L7:
        if (feature.isSupportedByWebView() == false) goto L11;
        return getBoundaryInterface().stop(outputStream, executor);
    L11:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
