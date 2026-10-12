.class final Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1;
.super Ljava/lang/Object;
.source "KnowledgeScreens.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->KnowledgeScreen(Ljava/util/List;Ljava/lang/String;ZLjava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $entry:Lcom/luchime/huiyuan/LexiconEntry;

.field final synthetic $onToggleFavorite:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/luchime/huiyuan/LexiconEntry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1;->$onToggleFavorite:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1;->$entry:Lcom/luchime/huiyuan/LexiconEntry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 189
    invoke-virtual {p0}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 189
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1;->$onToggleFavorite:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1;->$entry:Lcom/luchime/huiyuan/LexiconEntry;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/LexiconEntry;->getText()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1;->$entry:Lcom/luchime/huiyuan/LexiconEntry;

    invoke-virtual {v2}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
