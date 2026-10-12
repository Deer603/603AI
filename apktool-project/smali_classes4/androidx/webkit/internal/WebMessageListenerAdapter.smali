.class public Landroidx/webkit/internal/WebMessageListenerAdapter;
.super Ljava/lang/Object;
.source "WebMessageListenerAdapter.java"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageListenerBoundaryInterface;


# instance fields
.field private final mWebMessageListener:Landroidx/webkit/WebViewCompat$WebMessageListener;


# direct methods
.method public constructor <init>(Landroidx/webkit/WebViewCompat$WebMessageListener;)V
    .locals 0
    .param p1, "webMessageListener"    # Landroidx/webkit/WebViewCompat$WebMessageListener;

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Landroidx/webkit/internal/WebMessageListenerAdapter;->mWebMessageListener:Landroidx/webkit/WebViewCompat$WebMessageListener;

    .line 43
    return-void
.end method


# virtual methods
.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 3

    .line 66
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "WEB_MESSAGE_LISTENER"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "WEB_MESSAGE_ARRAY_BUFFER"

    aput-object v2, v0, v1

    return-object v0
.end method

.method public onPostMessage(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;Landroid/net/Uri;ZLjava/lang/reflect/InvocationHandler;)V
    .locals 7
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "message"    # Ljava/lang/reflect/InvocationHandler;
    .param p3, "sourceOrigin"    # Landroid/net/Uri;
    .param p4, "isMainFrame"    # Z
    .param p5, "replyProxy"    # Ljava/lang/reflect/InvocationHandler;

    .line 49
    const-class v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 50
    invoke-static {v0, p2}, Lorg/chromium/support_lib_boundary/util/BoundaryInterfaceReflectionUtil;->castToSuppLibClass(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 49
    invoke-static {v0}, Landroidx/webkit/internal/WebMessageAdapter;->webMessageCompatFromBoundaryInterface(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)Landroidx/webkit/WebMessageCompat;

    move-result-object v3

    .line 52
    .local v3, "webMessage":Landroidx/webkit/WebMessageCompat;
    if-eqz v3, :cond_0

    .line 53
    nop

    .line 54
    invoke-static {p5}, Landroidx/webkit/internal/JavaScriptReplyProxyImpl;->forInvocationHandler(Ljava/lang/reflect/InvocationHandler;)Landroidx/webkit/internal/JavaScriptReplyProxyImpl;

    move-result-object v6

    .line 55
    .local v6, "jsReplyProxy":Landroidx/webkit/JavaScriptReplyProxy;
    iget-object v1, p0, Landroidx/webkit/internal/WebMessageListenerAdapter;->mWebMessageListener:Landroidx/webkit/WebViewCompat$WebMessageListener;

    move-object v2, p1

    move-object v4, p3

    move v5, p4

    .end local p1    # "view":Landroid/webkit/WebView;
    .end local p3    # "sourceOrigin":Landroid/net/Uri;
    .end local p4    # "isMainFrame":Z
    .local v2, "view":Landroid/webkit/WebView;
    .local v4, "sourceOrigin":Landroid/net/Uri;
    .local v5, "isMainFrame":Z
    invoke-interface/range {v1 .. v6}, Landroidx/webkit/WebViewCompat$WebMessageListener;->onPostMessage(Landroid/webkit/WebView;Landroidx/webkit/WebMessageCompat;Landroid/net/Uri;ZLandroidx/webkit/JavaScriptReplyProxy;)V

    goto :goto_0

    .line 52
    .end local v2    # "view":Landroid/webkit/WebView;
    .end local v4    # "sourceOrigin":Landroid/net/Uri;
    .end local v5    # "isMainFrame":Z
    .end local v6    # "jsReplyProxy":Landroidx/webkit/JavaScriptReplyProxy;
    .restart local p1    # "view":Landroid/webkit/WebView;
    .restart local p3    # "sourceOrigin":Landroid/net/Uri;
    .restart local p4    # "isMainFrame":Z
    :cond_0
    move-object v2, p1

    move-object v4, p3

    move v5, p4

    .line 58
    .end local p1    # "view":Landroid/webkit/WebView;
    .end local p3    # "sourceOrigin":Landroid/net/Uri;
    .end local p4    # "isMainFrame":Z
    .restart local v2    # "view":Landroid/webkit/WebView;
    .restart local v4    # "sourceOrigin":Landroid/net/Uri;
    .restart local v5    # "isMainFrame":Z
    :goto_0
    return-void
.end method
