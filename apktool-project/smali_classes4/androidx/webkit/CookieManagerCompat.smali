.class public Landroidx/webkit/CookieManagerCompat;
.super Ljava/lang/Object;
.source "CookieManagerCompat.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getAdapter(Landroid/webkit/CookieManager;)Landroidx/webkit/internal/CookieManagerAdapter;
    .locals 1
    .param p0, "cookieManager"    # Landroid/webkit/CookieManager;

    .line 62
    invoke-static {}, Landroidx/webkit/internal/WebViewGlueCommunicator;->getCompatConverter()Landroidx/webkit/internal/WebkitToCompatConverter;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/webkit/internal/WebkitToCompatConverter;->convertCookieManager(Landroid/webkit/CookieManager;)Landroidx/webkit/internal/CookieManagerAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static getCookieInfo(Landroid/webkit/CookieManager;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .param p0, "cookieManager"    # Landroid/webkit/CookieManager;
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/CookieManager;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 53
    sget-object v0, Landroidx/webkit/internal/WebViewFeatureInternal;->GET_COOKIE_INFO:Landroidx/webkit/internal/ApiFeature$NoFramework;

    .line 54
    .local v0, "feature":Landroidx/webkit/internal/ApiFeature$NoFramework;
    invoke-virtual {v0}, Landroidx/webkit/internal/ApiFeature$NoFramework;->isSupportedByWebView()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 55
    invoke-static {p0}, Landroidx/webkit/CookieManagerCompat;->getAdapter(Landroid/webkit/CookieManager;)Landroidx/webkit/internal/CookieManagerAdapter;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/webkit/internal/CookieManagerAdapter;->getCookieInfo(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    return-object v1

    .line 57
    :cond_0
    invoke-static {}, Landroidx/webkit/internal/WebViewFeatureInternal;->getUnsupportedOperationException()Ljava/lang/UnsupportedOperationException;

    move-result-object v1

    throw v1
.end method
