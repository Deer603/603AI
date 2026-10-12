package androidx.webkit.internal;

import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class WebSettingsNoOpAdapter extends WebSettingsAdapter {
    public WebSettingsNoOpAdapter() {
        super(null);
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setOffscreenPreRaster(boolean enabled) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getOffscreenPreRaster() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setSafeBrowsingEnabled(boolean enabled) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getSafeBrowsingEnabled() {
        return true;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setDisabledActionModeMenuItems(int menuItems) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getDisabledActionModeMenuItems() {
        return 0;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setForceDark(int forceDarkMode) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getForceDark() {
        return 1;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setForceDarkStrategy(int forceDarkStrategy) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getForceDarkStrategy() {
        return 2;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setAlgorithmicDarkeningAllowed(boolean allow) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean isAlgorithmicDarkeningAllowed() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean enabled) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public Set<String> getRequestedWithHeaderOriginAllowList() {
        return Collections.emptySet();
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setRequestedWithHeaderOriginAllowList(Set<String> allowList) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public UserAgentMetadata getUserAgentMetadata() {
        return UserAgentMetadataInternal.getUserAgentMetadataFromMap(Collections.emptyMap());
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setUserAgentMetadata(UserAgentMetadata uaMetadata) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getAttributionRegistrationBehavior() {
        return 1;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setAttributionRegistrationBehavior(int behavior) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setWebViewMediaIntegrityApiStatus(WebViewMediaIntegrityApiStatusConfig permissionConfig) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
        return new WebViewMediaIntegrityApiStatusConfig.Builder(2).build();
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setWebAuthenticationSupport(int support) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getWebAuthenticationSupport() {
        return 0;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setSpeculativeLoadingStatus(int speculativeLoadingStatus) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getSpeculativeLoadingStatus() {
        return 0;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setBackForwardCacheEnabled(boolean backForwardCacheEnabled) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getBackForwardCacheEnabled() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setPaymentRequestEnabled(boolean enabled) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getPaymentRequestEnabled() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setHasEnrolledInstrumentEnabled(boolean enabled) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getHasEnrolledInstrumentEnabled() {
        return false;
    }
}
