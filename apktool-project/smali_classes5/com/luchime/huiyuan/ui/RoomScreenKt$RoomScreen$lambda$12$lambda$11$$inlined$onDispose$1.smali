.class public final Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$lambda$12$lambda$11$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "Effects.kt"

# interfaces
.implements Landroidx/compose/runtime/DisposableEffectResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/RoomScreenKt;->RoomScreen(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RoomScreen.kt\ncom/luchime/huiyuan/ui/RoomScreenKt\n*L\n1#1,67:1\n145#2,6:68\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0000"
    }
    d2 = {
        "androidx/compose/runtime/DisposableEffectScope$onDispose$1",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "dispose",
        "",
        "runtime_release"
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
.field final synthetic $webViewHolder$inlined:[Landroid/webkit/WebView;


# direct methods
.method public constructor <init>([Landroid/webkit/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$lambda$12$lambda$11$$inlined$onDispose$1;->$webViewHolder$inlined:[Landroid/webkit/WebView;

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 4

    .line 66
    const/4 v0, 0x0

    .line 68
    .local v0, "$i$a$-onDispose-RoomScreenKt$RoomScreen$2$1$1\\1\\66\\0":I
    iget-object v1, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$lambda$12$lambda$11$$inlined$onDispose$1;->$webViewHolder$inlined:[Landroid/webkit/WebView;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    if-eqz v1, :cond_0

    .local v1, "$this$RoomScreen_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249\\2":Landroid/webkit/WebView;
    const/4 v3, 0x0

    .line 69
    .local v3, "$i$a$-apply-RoomScreenKt$RoomScreen$2$1$1$1\\2\\68\\1":I
    invoke-virtual {v1}, Landroid/webkit/WebView;->stopLoading()V

    .line 70
    invoke-virtual {v1}, Landroid/webkit/WebView;->destroy()V

    .line 71
    nop

    .line 68
    .end local v1    # "$this$RoomScreen_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249\\2":Landroid/webkit/WebView;
    .end local v3    # "$i$a$-apply-RoomScreenKt$RoomScreen$2$1$1$1\\2\\68\\1":I
    nop

    .line 72
    :cond_0
    iget-object v1, p0, Lcom/luchime/huiyuan/ui/RoomScreenKt$RoomScreen$lambda$12$lambda$11$$inlined$onDispose$1;->$webViewHolder$inlined:[Landroid/webkit/WebView;

    const/4 v3, 0x0

    aput-object v3, v1, v2

    .line 73
    nop

    .line 66
    .end local v0    # "$i$a$-onDispose-RoomScreenKt$RoomScreen$2$1$1\\1\\66\\0":I
    nop

    .line 67
    return-void
.end method
