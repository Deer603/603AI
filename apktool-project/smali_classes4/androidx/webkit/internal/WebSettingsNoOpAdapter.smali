.class public Landroidx/webkit/internal/WebSettingsNoOpAdapter;
.super Landroidx/webkit/internal/WebSettingsAdapter;
.source "WebSettingsNoOpAdapter.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/webkit/internal/WebSettingsAdapter;-><init>(Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;)V

    .line 47
    return-void
.end method


# virtual methods
.method public getAttributionRegistrationBehavior()I
    .locals 1

    .line 201
    const/4 v0, 0x1

    return v0
.end method

.method public getBackForwardCacheEnabled()Z
    .locals 1

    .line 280
    const/4 v0, 0x0

    return v0
.end method

.method public getDisabledActionModeMenuItems()I
    .locals 1

    .line 91
    const/4 v0, 0x0

    return v0
.end method

.method public getEnterpriseAuthenticationAppLinkPolicyEnabled()Z
    .locals 1

    .line 155
    const/4 v0, 0x0

    return v0
.end method

.method public getForceDark()I
    .locals 1

    .line 107
    const/4 v0, 0x1

    return v0
.end method

.method public getForceDarkStrategy()I
    .locals 1

    .line 123
    const/4 v0, 0x2

    return v0
.end method

.method public getHasEnrolledInstrumentEnabled()Z
    .locals 1

    .line 312
    const/4 v0, 0x0

    return v0
.end method

.method public getOffscreenPreRaster()Z
    .locals 1

    .line 61
    const/4 v0, 0x0

    return v0
.end method

.method public getPaymentRequestEnabled()Z
    .locals 1

    .line 296
    const/4 v0, 0x0

    return v0
.end method

.method public getRequestedWithHeaderOriginAllowList()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 164
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getSafeBrowsingEnabled()Z
    .locals 1

    .line 76
    const/4 v0, 0x1

    return v0
.end method

.method public getSpeculativeLoadingStatus()I
    .locals 1

    .line 263
    const/4 v0, 0x0

    return v0
.end method

.method public getUserAgentMetadata()Landroidx/webkit/UserAgentMetadata;
    .locals 1

    .line 183
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    .line 182
    invoke-static {v0}, Landroidx/webkit/internal/UserAgentMetadataInternal;->getUserAgentMetadataFromMap(Ljava/util/Map;)Landroidx/webkit/UserAgentMetadata;

    move-result-object v0

    return-object v0
.end method

.method public getWebAuthenticationSupport()I
    .locals 1

    .line 246
    const/4 v0, 0x0

    return v0
.end method

.method public getWebViewMediaIntegrityApiStatus()Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig;
    .locals 2

    .line 227
    new-instance v0, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;-><init>(I)V

    .line 229
    invoke-virtual {v0}, Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig$Builder;->build()Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig;

    move-result-object v0

    .line 227
    return-object v0
.end method

.method public isAlgorithmicDarkeningAllowed()Z
    .locals 1

    .line 138
    const/4 v0, 0x0

    return v0
.end method

.method public setAlgorithmicDarkeningAllowed(Z)V
    .locals 0
    .param p1, "allow"    # Z

    .line 131
    return-void
.end method

.method public setAttributionRegistrationBehavior(I)V
    .locals 0
    .param p1, "behavior"    # I

    .line 210
    return-void
.end method

.method public setBackForwardCacheEnabled(Z)V
    .locals 0
    .param p1, "backForwardCacheEnabled"    # Z

    .line 272
    return-void
.end method

.method public setDisabledActionModeMenuItems(I)V
    .locals 0
    .param p1, "menuItems"    # I

    .line 84
    return-void
.end method

.method public setEnterpriseAuthenticationAppLinkPolicyEnabled(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .line 147
    return-void
.end method

.method public setForceDark(I)V
    .locals 0
    .param p1, "forceDarkMode"    # I

    .line 99
    return-void
.end method

.method public setForceDarkStrategy(I)V
    .locals 0
    .param p1, "forceDarkStrategy"    # I

    .line 115
    return-void
.end method

.method public setHasEnrolledInstrumentEnabled(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .line 304
    return-void
.end method

.method public setOffscreenPreRaster(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .line 54
    return-void
.end method

.method public setPaymentRequestEnabled(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .line 288
    return-void
.end method

.method public setRequestedWithHeaderOriginAllowList(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 174
    .local p1, "allowList":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    return-void
.end method

.method public setSafeBrowsingEnabled(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .line 69
    return-void
.end method

.method public setSpeculativeLoadingStatus(I)V
    .locals 0
    .param p1, "speculativeLoadingStatus"    # I

    .line 255
    return-void
.end method

.method public setUserAgentMetadata(Landroidx/webkit/UserAgentMetadata;)V
    .locals 0
    .param p1, "uaMetadata"    # Landroidx/webkit/UserAgentMetadata;

    .line 193
    return-void
.end method

.method public setWebAuthenticationSupport(I)V
    .locals 0
    .param p1, "support"    # I

    .line 238
    return-void
.end method

.method public setWebViewMediaIntegrityApiStatus(Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig;)V
    .locals 0
    .param p1, "permissionConfig"    # Landroidx/webkit/WebViewMediaIntegrityApiStatusConfig;

    .line 219
    return-void
.end method
