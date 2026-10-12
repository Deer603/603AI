.class public final Landroidx/webkit/WebStorageCompat;
.super Ljava/lang/Object;
.source "WebStorageCompat.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static deleteBrowsingData(Landroid/webkit/WebStorage;Ljava/lang/Runnable;)V
    .locals 1
    .param p0, "instance"    # Landroid/webkit/WebStorage;
    .param p1, "doneCallback"    # Ljava/lang/Runnable;

    .line 93
    new-instance v0, Landroidx/webkit/WebStorageCompat$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Landroidx/webkit/WebStorageCompat$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {p0, v0, p1}, Landroidx/webkit/WebStorageCompat;->deleteBrowsingData(Landroid/webkit/WebStorage;Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    .line 95
    return-void
.end method

.method public static deleteBrowsingData(Landroid/webkit/WebStorage;Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V
    .locals 2
    .param p0, "instance"    # Landroid/webkit/WebStorage;
    .param p1, "executor"    # Ljava/util/concurrent/Executor;
    .param p2, "doneCallback"    # Ljava/lang/Runnable;

    .line 71
    sget-object v0, Landroidx/webkit/internal/WebViewFeatureInternal;->DELETE_BROWSING_DATA:Landroidx/webkit/internal/ApiFeature$NoFramework;

    .line 72
    .local v0, "feature":Landroidx/webkit/internal/ApiFeature$NoFramework;
    invoke-virtual {v0}, Landroidx/webkit/internal/ApiFeature$NoFramework;->isSupportedByWebView()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 73
    invoke-static {p0}, Landroidx/webkit/WebStorageCompat;->getAdapter(Landroid/webkit/WebStorage;)Landroidx/webkit/internal/WebStorageAdapter;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Landroidx/webkit/internal/WebStorageAdapter;->deleteBrowsingData(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    .line 78
    return-void

    .line 75
    :cond_0
    invoke-static {}, Landroidx/webkit/internal/WebViewFeatureInternal;->getUnsupportedOperationException()Ljava/lang/UnsupportedOperationException;

    move-result-object v1

    throw v1
.end method

.method public static deleteBrowsingDataForSite(Landroid/webkit/WebStorage;Ljava/lang/String;Ljava/lang/Runnable;)Ljava/lang/String;
    .locals 1
    .param p0, "instance"    # Landroid/webkit/WebStorage;
    .param p1, "site"    # Ljava/lang/String;
    .param p2, "doneCallback"    # Ljava/lang/Runnable;

    .line 153
    new-instance v0, Landroidx/webkit/WebStorageCompat$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Landroidx/webkit/WebStorageCompat$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {p0, p1, v0, p2}, Landroidx/webkit/WebStorageCompat;->deleteBrowsingDataForSite(Landroid/webkit/WebStorage;Ljava/lang/String;Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static deleteBrowsingDataForSite(Landroid/webkit/WebStorage;Ljava/lang/String;Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)Ljava/lang/String;
    .locals 2
    .param p0, "instance"    # Landroid/webkit/WebStorage;
    .param p1, "site"    # Ljava/lang/String;
    .param p2, "executor"    # Ljava/util/concurrent/Executor;
    .param p3, "doneCallback"    # Ljava/lang/Runnable;

    .line 130
    sget-object v0, Landroidx/webkit/internal/WebViewFeatureInternal;->DELETE_BROWSING_DATA:Landroidx/webkit/internal/ApiFeature$NoFramework;

    .line 131
    .local v0, "feature":Landroidx/webkit/internal/ApiFeature$NoFramework;
    invoke-virtual {v0}, Landroidx/webkit/internal/ApiFeature$NoFramework;->isSupportedByWebView()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 132
    invoke-static {p0}, Landroidx/webkit/WebStorageCompat;->getAdapter(Landroid/webkit/WebStorage;)Landroidx/webkit/internal/WebStorageAdapter;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3}, Landroidx/webkit/internal/WebStorageAdapter;->deleteBrowsingDataForSite(Ljava/lang/String;Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 134
    :cond_0
    invoke-static {}, Landroidx/webkit/internal/WebViewFeatureInternal;->getUnsupportedOperationException()Ljava/lang/UnsupportedOperationException;

    move-result-object v1

    throw v1
.end method

.method private static getAdapter(Landroid/webkit/WebStorage;)Landroidx/webkit/internal/WebStorageAdapter;
    .locals 1
    .param p0, "webStorage"    # Landroid/webkit/WebStorage;

    .line 159
    invoke-static {}, Landroidx/webkit/internal/WebViewGlueCommunicator;->getCompatConverter()Landroidx/webkit/internal/WebkitToCompatConverter;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/webkit/internal/WebkitToCompatConverter;->convertWebStorage(Landroid/webkit/WebStorage;)Landroidx/webkit/internal/WebStorageAdapter;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$deleteBrowsingData$0(Ljava/lang/Runnable;)V
    .locals 2
    .param p0, "r"    # Ljava/lang/Runnable;

    .line 93
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic lambda$deleteBrowsingDataForSite$1(Ljava/lang/Runnable;)V
    .locals 2
    .param p0, "r"    # Ljava/lang/Runnable;

    .line 154
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
