.class final Landroidx/compose/material/DelegatingThemeAwareRippleNode$updateConfiguration$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Ripple.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/DelegatingThemeAwareRippleNode;->updateConfiguration()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/material/DelegatingThemeAwareRippleNode;


# direct methods
.method constructor <init>(Landroidx/compose/material/DelegatingThemeAwareRippleNode;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/material/DelegatingThemeAwareRippleNode$updateConfiguration$1;->this$0:Landroidx/compose/material/DelegatingThemeAwareRippleNode;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 291
    invoke-virtual {p0}, Landroidx/compose/material/DelegatingThemeAwareRippleNode$updateConfiguration$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 292
    iget-object v0, p0, Landroidx/compose/material/DelegatingThemeAwareRippleNode$updateConfiguration$1;->this$0:Landroidx/compose/material/DelegatingThemeAwareRippleNode;

    check-cast v0, Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;

    invoke-static {}, Landroidx/compose/material/RippleKt;->getLocalRippleConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    invoke-static {v0, v1}, Landroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt;->currentValueOf(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material/RippleConfiguration;

    .line 293
    .local v0, "configuration":Landroidx/compose/material/RippleConfiguration;
    nop

    .line 296
    iget-object v1, p0, Landroidx/compose/material/DelegatingThemeAwareRippleNode$updateConfiguration$1;->this$0:Landroidx/compose/material/DelegatingThemeAwareRippleNode;

    .line 293
    if-nez v0, :cond_0

    .line 294
    invoke-static {v1}, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->access$removeRipple(Landroidx/compose/material/DelegatingThemeAwareRippleNode;)V

    goto :goto_0

    .line 296
    :cond_0
    invoke-static {v1}, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->access$getRippleNode$p(Landroidx/compose/material/DelegatingThemeAwareRippleNode;)Landroidx/compose/ui/node/DelegatableNode;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/compose/material/DelegatingThemeAwareRippleNode$updateConfiguration$1;->this$0:Landroidx/compose/material/DelegatingThemeAwareRippleNode;

    invoke-static {v1}, Landroidx/compose/material/DelegatingThemeAwareRippleNode;->access$attachNewRipple(Landroidx/compose/material/DelegatingThemeAwareRippleNode;)V

    .line 298
    :cond_1
    :goto_0
    return-void
.end method
