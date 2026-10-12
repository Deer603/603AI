.class public final Landroidx/webkit/WebViewAssetLoader$Builder;
.super Ljava/lang/Object;
.source "WebViewAssetLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/webkit/WebViewAssetLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private mDomain:Ljava/lang/String;

.field private final mHandlerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/core/util/Pair<",
            "Ljava/lang/String;",
            "Landroidx/webkit/WebViewAssetLoader$PathHandler;",
            ">;>;"
        }
    .end annotation
.end field

.field private mHttpAllowed:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 472
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 474
    const-string v0, "appassets.androidplatform.net"

    iput-object v0, p0, Landroidx/webkit/WebViewAssetLoader$Builder;->mDomain:Ljava/lang/String;

    .line 477
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/webkit/WebViewAssetLoader$Builder;->mHandlerList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addPathHandler(Ljava/lang/String;Landroidx/webkit/WebViewAssetLoader$PathHandler;)Landroidx/webkit/WebViewAssetLoader$Builder;
    .locals 2
    .param p1, "path"    # Ljava/lang/String;
    .param p2, "handler"    # Landroidx/webkit/WebViewAssetLoader$PathHandler;

    .line 518
    iget-object v0, p0, Landroidx/webkit/WebViewAssetLoader$Builder;->mHandlerList:Ljava/util/List;

    invoke-static {p1, p2}, Landroidx/core/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/core/util/Pair;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 519
    return-object p0
.end method

.method public build()Landroidx/webkit/WebViewAssetLoader;
    .locals 8

    .line 528
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 529
    .local v0, "pathMatcherList":Ljava/util/List;, "Ljava/util/List<Landroidx/webkit/WebViewAssetLoader$PathMatcher;>;"
    iget-object v1, p0, Landroidx/webkit/WebViewAssetLoader$Builder;->mHandlerList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/core/util/Pair;

    .line 530
    .local v2, "pair":Landroidx/core/util/Pair;, "Landroidx/core/util/Pair<Ljava/lang/String;Landroidx/webkit/WebViewAssetLoader$PathHandler;>;"
    iget-object v3, v2, Landroidx/core/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .line 531
    .local v3, "path":Ljava/lang/String;
    iget-object v4, v2, Landroidx/core/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Landroidx/webkit/WebViewAssetLoader$PathHandler;

    .line 532
    .local v4, "handler":Landroidx/webkit/WebViewAssetLoader$PathHandler;
    new-instance v5, Landroidx/webkit/WebViewAssetLoader$PathMatcher;

    iget-object v6, p0, Landroidx/webkit/WebViewAssetLoader$Builder;->mDomain:Ljava/lang/String;

    iget-boolean v7, p0, Landroidx/webkit/WebViewAssetLoader$Builder;->mHttpAllowed:Z

    invoke-direct {v5, v6, v3, v7, v4}, Landroidx/webkit/WebViewAssetLoader$PathMatcher;-><init>(Ljava/lang/String;Ljava/lang/String;ZLandroidx/webkit/WebViewAssetLoader$PathHandler;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 533
    .end local v2    # "pair":Landroidx/core/util/Pair;, "Landroidx/core/util/Pair<Ljava/lang/String;Landroidx/webkit/WebViewAssetLoader$PathHandler;>;"
    .end local v3    # "path":Ljava/lang/String;
    .end local v4    # "handler":Landroidx/webkit/WebViewAssetLoader$PathHandler;
    goto :goto_0

    .line 534
    :cond_0
    new-instance v1, Landroidx/webkit/WebViewAssetLoader;

    invoke-direct {v1, v0}, Landroidx/webkit/WebViewAssetLoader;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method public setDomain(Ljava/lang/String;)Landroidx/webkit/WebViewAssetLoader$Builder;
    .locals 0
    .param p1, "domain"    # Ljava/lang/String;

    .line 487
    iput-object p1, p0, Landroidx/webkit/WebViewAssetLoader$Builder;->mDomain:Ljava/lang/String;

    .line 488
    return-object p0
.end method

.method public setHttpAllowed(Z)Landroidx/webkit/WebViewAssetLoader$Builder;
    .locals 0
    .param p1, "httpAllowed"    # Z

    .line 498
    iput-boolean p1, p0, Landroidx/webkit/WebViewAssetLoader$Builder;->mHttpAllowed:Z

    .line 499
    return-object p0
.end method
