.class final Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$3$1;
.super Ljava/lang/Object;
.source "ChatScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/ChatScreenKt;->ChatScreen(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/lang/String;IZZLjava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic $item:Lcom/luchime/huiyuan/ui/TimelineItem;

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
.method constructor <init>(Lcom/luchime/huiyuan/ui/TimelineItem;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/ui/TimelineItem;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$3$1;->$item:Lcom/luchime/huiyuan/ui/TimelineItem;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$3$1;->$onToggleFavorite:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 213
    invoke-virtual {p0}, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$3$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 214
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$3$1;->$item:Lcom/luchime/huiyuan/ui/TimelineItem;

    check-cast v0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    invoke-virtual {v0}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->getSourceQuote()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$3$1;->$onToggleFavorite:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$ChatScreen$3$1$3$1$2$3$1;->$item:Lcom/luchime/huiyuan/ui/TimelineItem;

    .local v0, "source\\1":Ljava/lang/String;
    const/4 v3, 0x0

    .line 215
    .local v3, "$i$a$-let-ChatScreenKt$ChatScreen$3$1$3$1$2$3$1$1\\1\\214\\0":I
    check-cast v2, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    invoke-virtual {v2}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->getTag()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "\u901a\u7528"

    :cond_0
    invoke-interface {v1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    nop

    .line 214
    .end local v0    # "source\\1":Ljava/lang/String;
    .end local v3    # "$i$a$-let-ChatScreenKt$ChatScreen$3$1$3$1$2$3$1$1\\1\\214\\0":I
    nop

    .line 217
    :cond_1
    return-void
.end method
