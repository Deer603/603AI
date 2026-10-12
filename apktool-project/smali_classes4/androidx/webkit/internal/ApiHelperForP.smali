.class public Landroidx/webkit/internal/ApiHelperForP;
.super Ljava/lang/Object;
.source "ApiHelperForP.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    return-void
.end method

.method public static getTracingControllerInstance()Landroid/webkit/TracingController;
    .locals 1

    .line 47
    invoke-static {}, Landroid/webkit/TracingController;->getInstance()Landroid/webkit/TracingController;

    move-result-object v0

    return-object v0
.end method

.method public static getWebViewClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 85
    invoke-static {}, Landroid/webkit/WebView;->getWebViewClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    return-object v0
.end method

.method public static getWebViewLooper(Landroid/webkit/WebView;)Landroid/os/Looper;
    .locals 1
    .param p0, "webView"    # Landroid/webkit/WebView;

    .line 92
    invoke-virtual {p0}, Landroid/webkit/WebView;->getWebViewLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public static isTracing(Landroid/webkit/TracingController;)Z
    .locals 1
    .param p0, "tracingController"    # Landroid/webkit/TracingController;

    .line 54
    invoke-virtual {p0}, Landroid/webkit/TracingController;->isTracing()Z

    move-result v0

    return v0
.end method

.method public static setDataDirectorySuffix(Ljava/lang/String;)V
    .locals 0
    .param p0, "suffix"    # Ljava/lang/String;

    .line 100
    invoke-static {p0}, Landroid/webkit/WebView;->setDataDirectorySuffix(Ljava/lang/String;)V

    .line 101
    return-void
.end method

.method public static start(Landroid/webkit/TracingController;Landroidx/webkit/TracingConfig;)V
    .locals 2
    .param p0, "tracingController"    # Landroid/webkit/TracingController;
    .param p1, "tracingConfig"    # Landroidx/webkit/TracingConfig;

    .line 64
    new-instance v0, Landroid/webkit/TracingConfig$Builder;

    invoke-direct {v0}, Landroid/webkit/TracingConfig$Builder;-><init>()V

    .line 66
    invoke-virtual {p1}, Landroidx/webkit/TracingConfig;->getPredefinedCategories()I

    move-result v1

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/TracingConfig$Builder;->addCategories([I)Landroid/webkit/TracingConfig$Builder;

    move-result-object v0

    .line 67
    invoke-virtual {p1}, Landroidx/webkit/TracingConfig;->getCustomIncludedCategories()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/TracingConfig$Builder;->addCategories(Ljava/util/Collection;)Landroid/webkit/TracingConfig$Builder;

    move-result-object v0

    .line 68
    invoke-virtual {p1}, Landroidx/webkit/TracingConfig;->getTracingMode()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/webkit/TracingConfig$Builder;->setTracingMode(I)Landroid/webkit/TracingConfig$Builder;

    move-result-object v0

    .line 69
    invoke-virtual {v0}, Landroid/webkit/TracingConfig$Builder;->build()Landroid/webkit/TracingConfig;

    move-result-object v0

    .line 70
    .local v0, "config":Landroid/webkit/TracingConfig;
    invoke-virtual {p0, v0}, Landroid/webkit/TracingController;->start(Landroid/webkit/TracingConfig;)V

    .line 71
    return-void
.end method

.method public static stop(Landroid/webkit/TracingController;Ljava/io/OutputStream;Ljava/util/concurrent/Executor;)Z
    .locals 1
    .param p0, "tracingController"    # Landroid/webkit/TracingController;
    .param p1, "os"    # Ljava/io/OutputStream;
    .param p2, "ex"    # Ljava/util/concurrent/Executor;

    .line 78
    invoke-virtual {p0, p1, p2}, Landroid/webkit/TracingController;->stop(Ljava/io/OutputStream;Ljava/util/concurrent/Executor;)Z

    move-result v0

    return v0
.end method
