package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.SafeBrowsingResponseCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {
    private SafeBrowsingResponseBoundaryInterface mBoundaryInterface;
    private SafeBrowsingResponse mFrameworksImpl;

    public SafeBrowsingResponseImpl(InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public SafeBrowsingResponseImpl(SafeBrowsingResponse response) {
        this.mFrameworksImpl = response;
    }

    private SafeBrowsingResponse getFrameworksImpl() {
        if (this.mFrameworksImpl != null) goto L6;
        this.mFrameworksImpl = WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.mBoundaryInterface));
    L6:
        return this.mFrameworksImpl;
    }

    private SafeBrowsingResponseBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface != null) goto L6;
        this.mBoundaryInterface = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(this.mFrameworksImpl));
    L6:
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void showInterstitial(boolean allowReporting) {
        ApiFeature.O_MR1 feature = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForOMR1.showInterstitial(getFrameworksImpl(), allowReporting);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getBoundaryInterface().showInterstitial(allowReporting);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void proceed(boolean report) {
        ApiFeature.O_MR1 feature = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_PROCEED;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForOMR1.proceed(getFrameworksImpl(), report);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getBoundaryInterface().proceed(report);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void backToSafety(boolean report) {
        ApiFeature.O_MR1 feature = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY;
        if (feature.isSupportedByFramework() == false) goto L6;
        ApiHelperForOMR1.backToSafety(getFrameworksImpl(), report);
        return;
    L6:
        if (feature.isSupportedByWebView() == false) goto L10;
        getBoundaryInterface().backToSafety(report);
        return;
    L10:
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
