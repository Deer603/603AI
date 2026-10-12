package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class ApiHelperForP {
    private ApiHelperForP() {
    }

    public static TracingController getTracingControllerInstance() {
        return TracingController.getInstance();
    }

    public static boolean isTracing(TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void start(TracingController tracingController, TracingConfig tracingConfig) {
        android.webkit.TracingConfig config = new android.webkit.TracingConfig.Builder().addCategories(new int[]{tracingConfig.getPredefinedCategories()}).addCategories(tracingConfig.getCustomIncludedCategories()).setTracingMode(tracingConfig.getTracingMode()).build();
        tracingController.start(config);
    }

    public static boolean stop(TracingController tracingController, OutputStream os, Executor ex) {
        return tracingController.stop(os, ex);
    }

    public static ClassLoader getWebViewClassLoader() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper getWebViewLooper(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static void setDataDirectorySuffix(String suffix) {
        WebView.setDataDirectorySuffix(suffix);
    }
}
