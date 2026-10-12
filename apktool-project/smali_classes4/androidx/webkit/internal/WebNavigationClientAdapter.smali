.class public Landroidx/webkit/internal/WebNavigationClientAdapter;
.super Ljava/lang/Object;
.source "WebNavigationClientAdapter.java"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebViewNavigationClientBoundaryInterface;


# instance fields
.field mWebNavigationClient:Landroidx/webkit/WebNavigationClient;


# direct methods
.method public constructor <init>(Landroidx/webkit/WebNavigationClient;)V
    .locals 0
    .param p1, "client"    # Landroidx/webkit/WebNavigationClient;

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Landroidx/webkit/internal/WebNavigationClientAdapter;->mWebNavigationClient:Landroidx/webkit/WebNavigationClient;

    .line 43
    return-void
.end method

.method static synthetic lambda$onFirstContentfulPaint$6(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)Ljava/lang/Object;
    .locals 1
    .param p0, "boundaryInterface"    # Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 116
    new-instance v0, Landroidx/webkit/internal/PageImpl;

    invoke-direct {v0, p0}, Landroidx/webkit/internal/PageImpl;-><init>(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)V

    return-object v0
.end method

.method static synthetic lambda$onNavigationCompleted$2(Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;)Ljava/lang/Object;
    .locals 1
    .param p0, "boundaryInterface"    # Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 79
    new-instance v0, Landroidx/webkit/internal/NavigationAdapter;

    invoke-direct {v0, p0}, Landroidx/webkit/internal/NavigationAdapter;-><init>(Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;)V

    return-object v0
.end method

.method static synthetic lambda$onNavigationRedirected$1(Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;)Ljava/lang/Object;
    .locals 1
    .param p0, "boundaryInterface"    # Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 68
    new-instance v0, Landroidx/webkit/internal/NavigationAdapter;

    invoke-direct {v0, p0}, Landroidx/webkit/internal/NavigationAdapter;-><init>(Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;)V

    return-object v0
.end method

.method static synthetic lambda$onNavigationStarted$0(Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;)Ljava/lang/Object;
    .locals 1
    .param p0, "boundaryInterface"    # Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 57
    new-instance v0, Landroidx/webkit/internal/NavigationAdapter;

    invoke-direct {v0, p0}, Landroidx/webkit/internal/NavigationAdapter;-><init>(Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;)V

    return-object v0
.end method

.method static synthetic lambda$onPageDOMContentLoadedEventFired$5(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)Ljava/lang/Object;
    .locals 1
    .param p0, "boundaryInterface"    # Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 107
    new-instance v0, Landroidx/webkit/internal/PageImpl;

    invoke-direct {v0, p0}, Landroidx/webkit/internal/PageImpl;-><init>(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)V

    return-object v0
.end method

.method static synthetic lambda$onPageDeleted$3(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)Ljava/lang/Object;
    .locals 1
    .param p0, "boundaryInterface"    # Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 88
    new-instance v0, Landroidx/webkit/internal/PageImpl;

    invoke-direct {v0, p0}, Landroidx/webkit/internal/PageImpl;-><init>(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)V

    return-object v0
.end method

.method static synthetic lambda$onPageLoadEventFired$4(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)Ljava/lang/Object;
    .locals 1
    .param p0, "boundaryInterface"    # Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 97
    new-instance v0, Landroidx/webkit/internal/PageImpl;

    invoke-direct {v0, p0}, Landroidx/webkit/internal/PageImpl;-><init>(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)V

    return-object v0
.end method


# virtual methods
.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 3

    .line 122
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE"

    aput-object v2, v0, v1

    return-object v0
.end method

.method public getWebNavigationClient()Landroidx/webkit/WebNavigationClient;
    .locals 1

    .line 46
    iget-object v0, p0, Landroidx/webkit/internal/WebNavigationClientAdapter;->mWebNavigationClient:Landroidx/webkit/WebNavigationClient;

    return-object v0
.end method

.method public onFirstContentfulPaint(Ljava/lang/reflect/InvocationHandler;)V
    .locals 3
    .param p1, "page"    # Ljava/lang/reflect/InvocationHandler;

    .line 112
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;

    .line 113
    invoke-static {v0, p1}, Lorg/chromium/support_lib_boundary/util/BoundaryInterfaceReflectionUtil;->castToSuppLibClass(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;

    .line 115
    .local v0, "boundaryInterface":Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;
    iget-object v1, p0, Landroidx/webkit/internal/WebNavigationClientAdapter;->mWebNavigationClient:Landroidx/webkit/WebNavigationClient;

    new-instance v2, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0}, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda0;-><init>(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)V

    invoke-interface {v0, v2}, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/webkit/internal/PageImpl;

    invoke-interface {v1, v2}, Landroidx/webkit/WebNavigationClient;->onFirstContentfulPaint(Landroidx/webkit/Page;)V

    .line 117
    return-void
.end method

.method public onNavigationCompleted(Ljava/lang/reflect/InvocationHandler;)V
    .locals 3
    .param p1, "navigation"    # Ljava/lang/reflect/InvocationHandler;

    .line 73
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;

    .line 74
    invoke-static {v0, p1}, Lorg/chromium/support_lib_boundary/util/BoundaryInterfaceReflectionUtil;->castToSuppLibClass(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;

    .line 77
    .local v0, "boundaryInterface":Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;
    iget-object v1, p0, Landroidx/webkit/internal/WebNavigationClientAdapter;->mWebNavigationClient:Landroidx/webkit/WebNavigationClient;

    new-instance v2, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda6;

    invoke-direct {v2, v0}, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda6;-><init>(Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;)V

    .line 78
    invoke-interface {v0, v2}, Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/webkit/internal/NavigationAdapter;

    .line 77
    invoke-interface {v1, v2}, Landroidx/webkit/WebNavigationClient;->onNavigationCompleted(Landroidx/webkit/Navigation;)V

    .line 80
    return-void
.end method

.method public onNavigationRedirected(Ljava/lang/reflect/InvocationHandler;)V
    .locals 3
    .param p1, "navigation"    # Ljava/lang/reflect/InvocationHandler;

    .line 62
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;

    .line 63
    invoke-static {v0, p1}, Lorg/chromium/support_lib_boundary/util/BoundaryInterfaceReflectionUtil;->castToSuppLibClass(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;

    .line 66
    .local v0, "boundaryInterface":Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;
    iget-object v1, p0, Landroidx/webkit/internal/WebNavigationClientAdapter;->mWebNavigationClient:Landroidx/webkit/WebNavigationClient;

    new-instance v2, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda3;

    invoke-direct {v2, v0}, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda3;-><init>(Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;)V

    .line 67
    invoke-interface {v0, v2}, Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/webkit/internal/NavigationAdapter;

    .line 66
    invoke-interface {v1, v2}, Landroidx/webkit/WebNavigationClient;->onNavigationRedirected(Landroidx/webkit/Navigation;)V

    .line 69
    return-void
.end method

.method public onNavigationStarted(Ljava/lang/reflect/InvocationHandler;)V
    .locals 3
    .param p1, "navigation"    # Ljava/lang/reflect/InvocationHandler;

    .line 51
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;

    .line 52
    invoke-static {v0, p1}, Lorg/chromium/support_lib_boundary/util/BoundaryInterfaceReflectionUtil;->castToSuppLibClass(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;

    .line 55
    .local v0, "boundaryInterface":Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;
    iget-object v1, p0, Landroidx/webkit/internal/WebNavigationClientAdapter;->mWebNavigationClient:Landroidx/webkit/WebNavigationClient;

    new-instance v2, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda1;

    invoke-direct {v2, v0}, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda1;-><init>(Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;)V

    .line 56
    invoke-interface {v0, v2}, Lorg/chromium/support_lib_boundary/WebViewNavigationBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/webkit/internal/NavigationAdapter;

    .line 55
    invoke-interface {v1, v2}, Landroidx/webkit/WebNavigationClient;->onNavigationStarted(Landroidx/webkit/Navigation;)V

    .line 58
    return-void
.end method

.method public onPageDOMContentLoadedEventFired(Ljava/lang/reflect/InvocationHandler;)V
    .locals 3
    .param p1, "page"    # Ljava/lang/reflect/InvocationHandler;

    .line 102
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;

    .line 103
    invoke-static {v0, p1}, Lorg/chromium/support_lib_boundary/util/BoundaryInterfaceReflectionUtil;->castToSuppLibClass(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;

    .line 105
    .local v0, "boundaryInterface":Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;
    iget-object v1, p0, Landroidx/webkit/internal/WebNavigationClientAdapter;->mWebNavigationClient:Landroidx/webkit/WebNavigationClient;

    new-instance v2, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda5;

    invoke-direct {v2, v0}, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda5;-><init>(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)V

    .line 106
    invoke-interface {v0, v2}, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/webkit/internal/PageImpl;

    .line 105
    invoke-interface {v1, v2}, Landroidx/webkit/WebNavigationClient;->onPageDomContentLoadedEventFired(Landroidx/webkit/Page;)V

    .line 108
    return-void
.end method

.method public onPageDeleted(Ljava/lang/reflect/InvocationHandler;)V
    .locals 3
    .param p1, "page"    # Ljava/lang/reflect/InvocationHandler;

    .line 84
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;

    .line 85
    invoke-static {v0, p1}, Lorg/chromium/support_lib_boundary/util/BoundaryInterfaceReflectionUtil;->castToSuppLibClass(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;

    .line 87
    .local v0, "boundaryInterface":Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;
    iget-object v1, p0, Landroidx/webkit/internal/WebNavigationClientAdapter;->mWebNavigationClient:Landroidx/webkit/WebNavigationClient;

    new-instance v2, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda2;

    invoke-direct {v2, v0}, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda2;-><init>(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)V

    invoke-interface {v0, v2}, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/webkit/internal/PageImpl;

    invoke-interface {v1, v2}, Landroidx/webkit/WebNavigationClient;->onPageDeleted(Landroidx/webkit/Page;)V

    .line 89
    return-void
.end method

.method public onPageLoadEventFired(Ljava/lang/reflect/InvocationHandler;)V
    .locals 3
    .param p1, "page"    # Ljava/lang/reflect/InvocationHandler;

    .line 93
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;

    .line 94
    invoke-static {v0, p1}, Lorg/chromium/support_lib_boundary/util/BoundaryInterfaceReflectionUtil;->castToSuppLibClass(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;

    .line 96
    .local v0, "boundaryInterface":Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;
    iget-object v1, p0, Landroidx/webkit/internal/WebNavigationClientAdapter;->mWebNavigationClient:Landroidx/webkit/WebNavigationClient;

    new-instance v2, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda4;

    invoke-direct {v2, v0}, Landroidx/webkit/internal/WebNavigationClientAdapter$$ExternalSyntheticLambda4;-><init>(Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;)V

    invoke-interface {v0, v2}, Lorg/chromium/support_lib_boundary/WebViewPageBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/webkit/internal/PageImpl;

    invoke-interface {v1, v2}, Landroidx/webkit/WebNavigationClient;->onPageLoadEventFired(Landroidx/webkit/Page;)V

    .line 98
    return-void
.end method
