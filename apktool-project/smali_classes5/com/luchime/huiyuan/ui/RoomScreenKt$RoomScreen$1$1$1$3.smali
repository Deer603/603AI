.class public final Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;
.super Landroid/webkit/WebViewClient;
.source "RoomScreen.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/RoomScreenKt;->RoomScreen(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\t\u0018\u00010\u0003\u00a2\u0006\u0002\u0008\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0018\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "com/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3",
        "Landroid/webkit/WebViewClient;",
        "shouldInterceptRequest",
        "Landroid/webkit/WebResourceResponse;",
        "Lorg/jspecify/annotations/Nullable;",
        "view",
        "Landroid/webkit/WebView;",
        "request",
        "Landroid/webkit/WebResourceRequest;",
        "shouldOverrideUrlLoading",
        "",
        "onPageFinished",
        "",
        "url",
        "",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $assetLoader:Landroidx/webkit/WebViewAssetLoader;

.field final synthetic $latestModelCallback$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $latestOpenChat$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/webkit/WebViewAssetLoader;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0
    .param p1, "$assetLoader"    # Landroidx/webkit/WebViewAssetLoader;
    .param p2, "$latestModelCallback$delegate"    # Landroidx/compose/runtime/State;
    .param p3, "$latestOpenChat$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/webkit/WebViewAssetLoader;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            "Lkotlin/Unit;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$assetLoader:Landroidx/webkit/WebViewAssetLoader;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestModelCallback$delegate:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestOpenChat$delegate:Landroidx/compose/runtime/State;

    .line 95
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    nop

    .line 134
    nop

    .line 128
    const-string v0, "var touchStyle = document.createElement(\'style\');\ntouchStyle.textContent =\n  \'html,body,#canvas-container,canvas{touch-action:none!important;overscroll-behavior:none!important;user-select:none!important;}\';\ndocument.head.appendChild(touchStyle);"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 136
    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 2
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "request"    # Landroid/webkit/WebResourceRequest;

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$assetLoader:Landroidx/webkit/WebViewAssetLoader;

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/webkit/WebViewAssetLoader;->shouldInterceptRequest(Landroid/net/Uri;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    return-object v0
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "request"    # Landroid/webkit/WebResourceRequest;

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "index.html"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestModelCallback$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->access$RoomScreen$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    sget-object v1, Lcom/luchime/huiyuan/ui/AIModel;->HUIYUAN:Lcom/luchime/huiyuan/ui/AIModel;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestOpenChat$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->access$RoomScreen$lambda$1(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 111
    goto :goto_1

    .line 102
    :sswitch_1
    const-string v1, "tango_index.html"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 119
    :cond_1
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestModelCallback$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->access$RoomScreen$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    sget-object v1, Lcom/luchime/huiyuan/ui/AIModel;->TANGO:Lcom/luchime/huiyuan/ui/AIModel;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestOpenChat$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->access$RoomScreen$lambda$1(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 121
    goto :goto_1

    .line 102
    :sswitch_2
    const-string v1, "guigui_index.html"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 114
    :cond_2
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestModelCallback$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->access$RoomScreen$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    sget-object v1, Lcom/luchime/huiyuan/ui/AIModel;->GUIGUI:Lcom/luchime/huiyuan/ui/AIModel;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestOpenChat$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->access$RoomScreen$lambda$1(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 116
    goto :goto_1

    .line 102
    :sswitch_3
    const-string v1, "piaoai_index.html"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 104
    :cond_3
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestModelCallback$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->access$RoomScreen$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    sget-object v1, Lcom/luchime/huiyuan/ui/AIModel;->PIAO:Lcom/luchime/huiyuan/ui/AIModel;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$1$1$1$3;->$latestOpenChat$delegate:Landroidx/compose/runtime/State;

    invoke-static {v0}, Lcom/luchime/huiyuan/ui/RoomScreenKt;->access$RoomScreen$lambda$1(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 106
    goto :goto_1

    .line 123
    :cond_4
    :goto_0
    const/4 v2, 0x0

    .line 102
    :goto_1
    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x435bc4c9 -> :sswitch_3
        -0x2454a53a -> :sswitch_2
        0x6f5e0fd -> :sswitch_1
        0x29d0cb47 -> :sswitch_0
    .end sparse-switch
.end method
