.class final Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$1$1;
.super Ljava/lang/Object;
.source "ChatScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/ChatScreenKt;->LandscapePromptPanel(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $onPrompt:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $prompt:Ljava/lang/String;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$1$1;->$onPrompt:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$1$1;->$prompt:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 621
    invoke-virtual {p0}, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 622
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$1$1;->$onPrompt:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$LandscapePromptPanel$1$1$5$1$1;->$prompt:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    return-void
.end method
