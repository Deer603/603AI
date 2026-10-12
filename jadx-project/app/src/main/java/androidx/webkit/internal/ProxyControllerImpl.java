package androidx.webkit.internal;

import androidx.webkit.ProxyConfig;
import androidx.webkit.ProxyController;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class ProxyControllerImpl extends ProxyController {
    private ProxyControllerBoundaryInterface mBoundaryInterface;

    public ProxyControllerImpl() {
    }

    @Override // androidx.webkit.ProxyController
    public void setProxyOverride(ProxyConfig proxyConfig, Executor executor, Runnable listener) {
        ApiFeature.NoFramework proxyOverride = WebViewFeatureInternal.PROXY_OVERRIDE;
        ApiFeature.NoFramework reverseBypass = WebViewFeatureInternal.PROXY_OVERRIDE_REVERSE_BYPASS;
        String[][] proxyRuleArray = proxyRulesToStringArray(proxyConfig.getProxyRules());
        String[] bypassRuleArray = (String[]) proxyConfig.getBypassRules().toArray(new String[0]);
        if (proxyOverride.isSupportedByWebView() == false) goto L8;
        if (proxyConfig.isReverseBypassEnabled() == true) goto L8;
        getBoundaryInterface().setProxyOverride(proxyRuleArray, bypassRuleArray, listener, executor);
        return;
    L8:
        if (proxyOverride.isSupportedByWebView() == false) goto L14;
        if (reverseBypass.isSupportedByWebView() == false) goto L14;
        getBoundaryInterface().setProxyOverride(proxyRuleArray, bypassRuleArray, listener, executor, proxyConfig.isReverseBypassEnabled());
        return;
    L14:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProxyController
    public void clearProxyOverride(Executor executor, Runnable listener) {
        ApiFeature.NoFramework feature = WebViewFeatureInternal.PROXY_OVERRIDE;
        if (feature.isSupportedByWebView() == false) goto L7;
        getBoundaryInterface().clearProxyOverride(listener, executor);
        return;
    L7:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static String[][] proxyRulesToStringArray(List<ProxyConfig.ProxyRule> proxyRuleList) {
        String[][] proxyRuleArray = (String[][]) Array.newInstance(String.class, new int[]{proxyRuleList.size(), 2});
        int i = 0;
    L4:
        if (i >= proxyRuleList.size()) goto L6;
        proxyRuleArray[i][0] = proxyRuleList.get(i).getSchemeFilter();
        proxyRuleArray[i][1] = proxyRuleList.get(i).getUrl();
        i = i + 1;
        goto L4
    L6:
        return proxyRuleArray;
    }

    private ProxyControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface != null) goto L6;
        this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getProxyController();
    L6:
        return this.mBoundaryInterface;
    }
}
