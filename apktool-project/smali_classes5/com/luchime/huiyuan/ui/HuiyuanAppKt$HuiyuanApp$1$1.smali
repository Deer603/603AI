.class final Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "HuiyuanApp.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp(Landroidx/compose/runtime/Composer;I)V
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
    c = "com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$1$1"
    f = "HuiyuanApp.kt"
    i = {}
    l = {
        0x135
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $engine:Lcom/luchime/huiyuan/HuiyuanEngine;

.field final synthetic $initialMessages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/ChatRecord;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $nextId$delegate:Landroidx/compose/runtime/MutableLongState;

.field final synthetic $repository:Lcom/luchime/huiyuan/AppRepository;

.field final synthetic $selectedModel$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            ">;"
        }
    .end annotation
.end field

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
.method constructor <init>(Ljava/util/List;Lcom/luchime/huiyuan/HuiyuanEngine;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/AppRepository;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/ChatRecord;",
            ">;",
            "Lcom/luchime/huiyuan/HuiyuanEngine;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/luchime/huiyuan/ui/TimelineItem;",
            ">;",
            "Landroidx/compose/runtime/MutableLongState;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            ">;",
            "Lcom/luchime/huiyuan/AppRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$initialMessages:Ljava/util/List;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$engine:Lcom/luchime/huiyuan/HuiyuanEngine;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$selectedModel$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$initialMessages:Ljava/util/List;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$engine:Lcom/luchime/huiyuan/HuiyuanEngine;

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$selectedModel$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;-><init>(Ljava/util/List;Lcom/luchime/huiyuan/HuiyuanEngine;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/AppRepository;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 307
    iget v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->label:I

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

    .line 308
    iget-object v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$initialMessages:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 309
    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x1

    iput v2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->label:I

    const-wide/16 v2, 0x12c

    invoke-static {v2, v3, v1}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 307
    return-object v0

    .line 310
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$selectedModel$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$1$1;->$engine:Lcom/luchime/huiyuan/HuiyuanEngine;

    invoke-virtual {v0}, Lcom/luchime/huiyuan/HuiyuanEngine;->getGreeting()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v6, 0x0

    const-string v8, "\u95ee\u5019"

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp$appendMessage$default(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/AppRepository;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 312
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
