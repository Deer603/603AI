.class final Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1;
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $entry:Lcom/luchime/huiyuan/LexiconEntry;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/luchime/huiyuan/LexiconEntry;)V
    .locals 0

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1;->$entry:Lcom/luchime/huiyuan/LexiconEntry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 188
    invoke-virtual {p0}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 188
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1;->$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1;->$entry:Lcom/luchime/huiyuan/LexiconEntry;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u8bed\u5f55"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1;->$entry:Lcom/luchime/huiyuan/LexiconEntry;

    invoke-virtual {v2}, Lcom/luchime/huiyuan/LexiconEntry;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt;->shareText(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
