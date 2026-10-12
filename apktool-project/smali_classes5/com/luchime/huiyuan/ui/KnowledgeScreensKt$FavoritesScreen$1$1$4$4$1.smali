.class final Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$4$1;
.super Ljava/lang/Object;
.source "KnowledgeScreens.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->FavoritesScreen(Ljava/util/List;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $favorite:Lcom/luchime/huiyuan/FavoriteRecord;

.field final synthetic $onAsk:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/luchime/huiyuan/FavoriteRecord;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/luchime/huiyuan/FavoriteRecord;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$4$1;->$onAsk:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$4$1;->$favorite:Lcom/luchime/huiyuan/FavoriteRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 279
    invoke-virtual {p0}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$4$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 279
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$4$1;->$onAsk:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$FavoritesScreen$1$1$4$4$1;->$favorite:Lcom/luchime/huiyuan/FavoriteRecord;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/FavoriteRecord;->getText()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bf7\u6df1\u5165\u89e3\u91ca\u8fd9\u53e5\u8bdd\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
