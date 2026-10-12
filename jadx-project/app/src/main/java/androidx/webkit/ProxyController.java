package androidx.webkit;

import androidx.webkit.internal.ProxyControllerImpl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProxyController {

    private static class LAZY_HOLDER {
        static final ProxyController INSTANCE = null;

        private LAZY_HOLDER() {
        }

        static {
            INSTANCE = new ProxyControllerImpl();
        }
    }

    public abstract void clearProxyOverride(Executor r1, Runnable r2);

    public abstract void setProxyOverride(ProxyConfig r1, Executor r2, Runnable r3);

    public ProxyController() {
    }

    public static ProxyController getInstance() {
        if (WebViewFeature.isFeatureSupported(WebViewFeature.PROXY_OVERRIDE) == false) goto L7;
        return LAZY_HOLDER.INSTANCE;
    L7:
        throw new UnsupportedOperationException("Proxy override not supported");
    }
}
