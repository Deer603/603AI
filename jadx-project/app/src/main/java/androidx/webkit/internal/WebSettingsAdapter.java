package androidx.webkit.internal;

import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class WebSettingsAdapter {
    private final WebSettingsBoundaryInterface mBoundaryInterface;

    public WebSettingsAdapter(WebSettingsBoundaryInterface boundaryInterface) {
        this.mBoundaryInterface = boundaryInterface;
    }

    public void setOffscreenPreRaster(boolean enabled) {
        this.mBoundaryInterface.setOffscreenPreRaster(enabled);
    }

    public boolean getOffscreenPreRaster() {
        return this.mBoundaryInterface.getOffscreenPreRaster();
    }

    public void setSafeBrowsingEnabled(boolean enabled) {
        this.mBoundaryInterface.setSafeBrowsingEnabled(enabled);
    }

    public boolean getSafeBrowsingEnabled() {
        return this.mBoundaryInterface.getSafeBrowsingEnabled();
    }

    public void setDisabledActionModeMenuItems(int menuItems) {
        this.mBoundaryInterface.setDisabledActionModeMenuItems(menuItems);
    }

    public int getDisabledActionModeMenuItems() {
        return this.mBoundaryInterface.getDisabledActionModeMenuItems();
    }

    public void setForceDark(int forceDarkMode) {
        this.mBoundaryInterface.setForceDark(forceDarkMode);
    }

    public int getForceDark() {
        return this.mBoundaryInterface.getForceDark();
    }

    public void setForceDarkStrategy(int forceDarkStrategy) {
        this.mBoundaryInterface.setForceDarkBehavior(forceDarkStrategy);
    }

    public int getForceDarkStrategy() {
        return this.mBoundaryInterface.getForceDarkBehavior();
    }

    public void setAlgorithmicDarkeningAllowed(boolean allow) {
        this.mBoundaryInterface.setAlgorithmicDarkeningAllowed(allow);
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return this.mBoundaryInterface.isAlgorithmicDarkeningAllowed();
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean enabled) {
        this.mBoundaryInterface.setEnterpriseAuthenticationAppLinkPolicyEnabled(enabled);
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return this.mBoundaryInterface.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public Set<String> getRequestedWithHeaderOriginAllowList() {
        return this.mBoundaryInterface.getRequestedWithHeaderOriginAllowList();
    }

    public void setRequestedWithHeaderOriginAllowList(Set<String> allowList) {
        this.mBoundaryInterface.setRequestedWithHeaderOriginAllowList(allowList);
    }

    public UserAgentMetadata getUserAgentMetadata() {
        return UserAgentMetadataInternal.getUserAgentMetadataFromMap(this.mBoundaryInterface.getUserAgentMetadataMap());
    }

    public void setUserAgentMetadata(UserAgentMetadata uaMetadata) {
        this.mBoundaryInterface.setUserAgentMetadataFromMap(UserAgentMetadataInternal.convertUserAgentMetadataToMap(uaMetadata));
    }

    public int getAttributionRegistrationBehavior() {
        return this.mBoundaryInterface.getAttributionBehavior();
    }

    public void setAttributionRegistrationBehavior(int behavior) {
        this.mBoundaryInterface.setAttributionBehavior(behavior);
    }

    public void setWebViewMediaIntegrityApiStatus(WebViewMediaIntegrityApiStatusConfig permissionConfig) {
        this.mBoundaryInterface.setWebViewMediaIntegrityApiStatus(permissionConfig.getDefaultStatus(), permissionConfig.getOverrideRules());
    }

    public WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
        return new WebViewMediaIntegrityApiStatusConfig.Builder(this.mBoundaryInterface.getWebViewMediaIntegrityApiDefaultStatus()).setOverrideRules(this.mBoundaryInterface.getWebViewMediaIntegrityApiOverrideRules()).build();
    }

    public void setWebAuthenticationSupport(int support) {
        this.mBoundaryInterface.setWebauthnSupport(support);
    }

    public int getWebAuthenticationSupport() {
        return this.mBoundaryInterface.getWebauthnSupport();
    }

    public void setSpeculativeLoadingStatus(int speculativeLoadingStatus) {
        this.mBoundaryInterface.setSpeculativeLoadingStatus(speculativeLoadingStatus);
    }

    public int getSpeculativeLoadingStatus() {
        return this.mBoundaryInterface.getSpeculativeLoadingStatus();
    }

    public void setBackForwardCacheEnabled(boolean backForwardCacheEnabled) {
        this.mBoundaryInterface.setBackForwardCacheEnabled(backForwardCacheEnabled);
    }

    public boolean getBackForwardCacheEnabled() {
        return this.mBoundaryInterface.getBackForwardCacheEnabled();
    }

    public void setPaymentRequestEnabled(boolean enabled) {
        this.mBoundaryInterface.setPaymentRequestEnabled(enabled);
    }

    public boolean getPaymentRequestEnabled() {
        return this.mBoundaryInterface.getPaymentRequestEnabled();
    }

    public void setHasEnrolledInstrumentEnabled(boolean enabled) {
        this.mBoundaryInterface.setHasEnrolledInstrumentEnabled(enabled);
    }

    public boolean getHasEnrolledInstrumentEnabled() {
        return this.mBoundaryInterface.getHasEnrolledInstrumentEnabled();
    }
}
