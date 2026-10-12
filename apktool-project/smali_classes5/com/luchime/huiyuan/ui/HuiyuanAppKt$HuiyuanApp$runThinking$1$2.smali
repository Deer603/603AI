.class final Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "HuiyuanApp.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$runThinking$1$2"
    f = "HuiyuanApp.kt"
    i = {}
    l = {
        0xc4
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $thinkId:J

.field final synthetic $timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/luchime/huiyuan/ui/TimelineItem;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;JLkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/luchime/huiyuan/ui/TimelineItem;",
            ">;J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-wide p2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->$thinkId:J

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method static final invokeSuspend$lambda$0(JLcom/luchime/huiyuan/ui/TimelineItem;)Z
    .locals 2
    .param p0, "$thinkId"    # J
    .param p2, "it"    # Lcom/luchime/huiyuan/ui/TimelineItem;

    .line 197
    invoke-interface {p2}, Lcom/luchime/huiyuan/ui/TimelineItem;->getId()J

    move-result-wide v0

    cmp-long v0, v0, p0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-wide v2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->$thinkId:J

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;JLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 195
    iget v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 196
    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x1

    iput v2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->label:I

    const-wide/16 v2, 0x190

    invoke-static {v2, v3, v1}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 195
    return-object v0

    .line 197
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/List;

    iget-wide v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;->$thinkId:J

    new-instance v3, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1, v2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2$$ExternalSyntheticLambda0;-><init>(J)V

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 198
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
