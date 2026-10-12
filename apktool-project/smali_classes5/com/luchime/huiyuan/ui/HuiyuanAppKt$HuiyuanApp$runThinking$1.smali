.class final Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "HuiyuanApp.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp$runThinking(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/AppRepository;Lcom/luchime/huiyuan/ReplyResult;Ljava/util/List;)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHuiyuanApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuiyuanApp.kt\ncom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,579:1\n1869#2:580\n360#2,7:581\n1870#2:588\n1878#2,2:589\n360#2,7:591\n1880#2:598\n360#2,7:599\n*S KotlinDebug\n*F\n+ 1 HuiyuanApp.kt\ncom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1\n*L\n169#1:580\n172#1:581,7\n169#1:588\n202#1:589,2\n205#1:591,7\n202#1:598\n224#1:599,7\n*E\n"
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
    c = "com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$runThinking$1"
    f = "HuiyuanApp.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0xaa,
        0xb3,
        0xdb
    }
    m = "invokeSuspend"
    n = {
        "$this$forEach\\1",
        "element\\1",
        "step\\2",
        "$i$f$forEach\\1\\169",
        "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0",
        "rendered",
        "units",
        "$this$forEachIndexed\\5",
        "item\\5",
        "unit\\6",
        "responseId",
        "$i$f$forEachIndexed\\5\\202",
        "index\\5",
        "unitIndex\\6",
        "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0",
        "messageIndex\\6"
    }
    s = {
        "L$0",
        "L$4",
        "L$5",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2",
        "L$8",
        "L$9",
        "J$0",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "I$4"
    }
.end annotation


# instance fields
.field final synthetic $activeGenerationJob$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlinx/coroutines/Job;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

.field final synthetic $generation:J

.field final synthetic $generationModel:Lcom/luchime/huiyuan/ui/AIModel;

.field final synthetic $haptics:Lcom/luchime/huiyuan/ui/AppHaptics;

.field final synthetic $isGenerating$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $nextId$delegate:Landroidx/compose/runtime/MutableLongState;

.field final synthetic $repository:Lcom/luchime/huiyuan/AppRepository;

.field final synthetic $result:Lcom/luchime/huiyuan/ReplyResult;

.field final synthetic $scope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $selectedTab$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/ui/AppTab;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $steps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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

.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field I$4:I

.field J$0:J

.field J$1:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/util/List;JLandroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/luchime/huiyuan/ReplyResult;Lcom/luchime/huiyuan/ui/AIModel;Lkotlinx/coroutines/CoroutineScope;Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableLongState;JLandroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/luchime/huiyuan/ui/TimelineItem;",
            ">;",
            "Lcom/luchime/huiyuan/ReplyResult;",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lcom/luchime/huiyuan/ui/AppHaptics;",
            "Landroidx/compose/runtime/MutableLongState;",
            "J",
            "Landroidx/compose/runtime/MutableLongState;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/ui/AppTab;",
            ">;",
            "Lcom/luchime/huiyuan/AppRepository;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlinx/coroutines/Job;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iput-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$steps:Ljava/util/List;

    move-wide/from16 v2, p2

    iput-wide v2, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generation:J

    move-object/from16 v4, p4

    iput-object v4, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-object/from16 v5, p5

    iput-object v5, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$result:Lcom/luchime/huiyuan/ReplyResult;

    move-object/from16 v6, p6

    iput-object v6, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generationModel:Lcom/luchime/huiyuan/ui/AIModel;

    move-object/from16 v7, p7

    iput-object v7, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$scope:Lkotlinx/coroutines/CoroutineScope;

    move-object/from16 v8, p8

    iput-object v8, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$haptics:Lcom/luchime/huiyuan/ui/AppHaptics;

    move-object/from16 v9, p9

    iput-object v9, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    move-wide/from16 v10, p10

    iput-wide v10, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$thinkId:J

    move-object/from16 v12, p12

    iput-object v12, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    move-object/from16 v13, p13

    iput-object v13, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$selectedTab$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v14, p14

    iput-object v14, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    move-object/from16 v15, p15

    iput-object v15, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$isGenerating$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$activeGenerationJob$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v1, 0x2

    move-object/from16 v2, p17

    invoke-direct {v0, v1, v2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 19
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

    move-object/from16 v0, p0

    new-instance v1, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;

    iget-object v2, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$steps:Ljava/util/List;

    iget-wide v3, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generation:J

    iget-object v5, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v6, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$result:Lcom/luchime/huiyuan/ReplyResult;

    iget-object v7, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generationModel:Lcom/luchime/huiyuan/ui/AIModel;

    iget-object v8, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$scope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v9, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$haptics:Lcom/luchime/huiyuan/ui/AppHaptics;

    iget-object v10, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-wide v11, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$thinkId:J

    iget-object v13, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-object v14, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$selectedTab$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v15, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$isGenerating$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$activeGenerationJob$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v18, v17

    move-object/from16 v17, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v18

    move-object/from16 v18, p2

    invoke-direct/range {v1 .. v18}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;-><init>(Ljava/util/List;JLandroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/luchime/huiyuan/ReplyResult;Lcom/luchime/huiyuan/ui/AIModel;Lkotlinx/coroutines/CoroutineScope;Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableLongState;JLandroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v16, v1

    move-object/from16 v1, v16

    check-cast v1, Lkotlin/coroutines/Continuation;

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 168
    iget v2, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->label:I

    packed-switch v2, :pswitch_data_0

    .end local p0    # "this":Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local p0    # "this":Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
    :pswitch_0
    iget v2, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$4:I

    .local v2, "messageIndex\\6":I
    iget v7, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$3:I

    .local v7, "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    iget v8, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$2:I

    .local v8, "unitIndex\\6":I
    iget v9, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$1:I

    .local v9, "index\\5":I
    iget v10, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$0:I

    .local v10, "$i$f$forEachIndexed\\5\\202":I
    iget-wide v11, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->J$1:J

    iget-wide v13, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->J$0:J

    .local v13, "responseId":J
    iget-object v15, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$9:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    .local v15, "unit\\6":Ljava/lang/String;
    iget-object v3, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$8:Ljava/lang/Object;

    .local v3, "item\\5":Ljava/lang/Object;
    iget-object v4, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$7:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v6, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$6:Ljava/lang/Object;

    check-cast v6, Landroidx/compose/runtime/MutableState;

    iget-object v5, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$5:Ljava/lang/Object;

    check-cast v5, Landroidx/compose/runtime/MutableLongState;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lcom/luchime/huiyuan/ui/AppHaptics;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$3:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 v20, v1

    .local v20, "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    iget-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    move-object/from16 v21, v1

    .local v21, "units":Ljava/util/List;
    iget-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/StringBuilder;

    .local v1, "rendered":Ljava/lang/StringBuilder;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-wide/from16 v26, v13

    move-object v14, v4

    move v13, v8

    move-object/from16 v8, v19

    move-object/from16 v19, v20

    move-object v4, v3

    move-object/from16 v3, v21

    move/from16 v21, v9

    move-object v9, v0

    move-object/from16 v0, p1

    goto/16 :goto_e

    .end local v1    # "rendered":Ljava/lang/StringBuilder;
    .end local v2    # "messageIndex\\6":I
    .end local v3    # "item\\5":Ljava/lang/Object;
    .end local v7    # "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    .end local v8    # "unitIndex\\6":I
    .end local v9    # "index\\5":I
    .end local v10    # "$i$f$forEachIndexed\\5\\202":I
    .end local v13    # "responseId":J
    .end local v15    # "unit\\6":Ljava/lang/String;
    .end local v20    # "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    .end local v21    # "units":Ljava/util/List;
    :pswitch_1
    move-object/from16 v17, v1

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v0

    move-object/from16 v0, p1

    goto/16 :goto_6

    :pswitch_2
    move-object/from16 v17, v1

    iget v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$1:I

    .local v1, "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    iget v2, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$0:I

    .local v2, "$i$f$forEach\\1\\169":I
    iget-wide v3, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->J$1:J

    iget-wide v5, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->J$0:J

    iget-object v7, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$5:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .local v7, "step\\2":Ljava/lang/String;
    iget-object v8, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$4:Ljava/lang/Object;

    .local v8, "element\\1":Ljava/lang/Object;
    iget-object v9, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$3:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$2:Ljava/lang/Object;

    check-cast v10, Landroidx/compose/runtime/MutableLongState;

    iget-object v11, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$1:Ljava/lang/Object;

    check-cast v11, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v12, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$0:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    .local v12, "$this$forEach\\1":Ljava/lang/Iterable;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v14, v7

    move-object v13, v8

    move-object v7, v0

    move v8, v2

    move-object/from16 v2, v17

    move-object/from16 v0, p1

    goto :goto_1

    .end local v1    # "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    .end local v2    # "$i$f$forEach\\1\\169":I
    .end local v7    # "step\\2":Ljava/lang/String;
    .end local v8    # "element\\1":Ljava/lang/Object;
    .end local v12    # "$this$forEach\\1":Ljava/lang/Iterable;
    :pswitch_3
    move-object/from16 v17, v1

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 169
    iget-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$steps:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach\\1":Ljava/lang/Iterable;
    iget-wide v2, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generation:J

    iget-object v4, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v5, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-wide v6, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$thinkId:J

    const/4 v8, 0x0

    .line 580
    .local v8, "$i$f$forEach\\1\\169":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-object v12, v1

    move-object v11, v4

    move-object v10, v5

    move-wide/from16 v41, v6

    move-object v7, v0

    move-wide v5, v2

    move-wide/from16 v3, v41

    move-object/from16 v2, v17

    move-object/from16 v1, p1

    .end local p0    # "this":Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .local v7, "this":Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
    .restart local v12    # "$this$forEach\\1":Ljava/lang/Iterable;
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element\\1":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Ljava/lang/String;

    .local v14, "step\\2":Ljava/lang/String;
    const/4 v15, 0x0

    .line 170
    .local v15, "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    nop

    .restart local p0    # "this":Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$0:Ljava/lang/Object;

    iput-object v11, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$1:Ljava/lang/Object;

    iput-object v10, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$2:Ljava/lang/Object;

    iput-object v9, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$3:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$4:Ljava/lang/Object;

    iput-object v14, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$5:Ljava/lang/Object;

    iput-wide v5, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->J$0:J

    iput-wide v3, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->J$1:J

    iput v8, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$0:I

    iput v15, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$1:I

    const/4 v0, 0x1

    iput v0, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->label:I

    move-object/from16 p1, v1

    .end local v1    # "$result":Ljava/lang/Object;
    .restart local p1    # "$result":Ljava/lang/Object;
    const-wide/16 v0, 0x1ae

    invoke-static {v0, v1, v7}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_0

    .line 168
    .end local p0    # "this":Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
    return-object v2

    .line 170
    :cond_0
    move v1, v15

    move-object/from16 v0, p1

    .line 171
    .end local v15    # "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    .local v1, "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    :goto_1
    invoke-static {v10}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$31(Landroidx/compose/runtime/MutableLongState;)J

    move-result-wide v17

    cmp-long v15, v5, v17

    if-eqz v15, :cond_1

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 172
    :cond_1
    move-object v15, v11

    check-cast v15, Ljava/util/List;

    .local v15, "$this$indexOfFirst\\3":Ljava/util/List;
    const/16 v17, 0x0

    .line 581
    .local v17, "$i$f$indexOfFirst\\3\\172":I
    const/16 v18, 0x0

    .line 582
    .local v18, "index\\3":I
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_4

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    .line 583
    .local v20, "item\\3":Ljava/lang/Object;
    move-object/from16 v21, v20

    check-cast v21, Lcom/luchime/huiyuan/ui/TimelineItem;

    .local v21, "it\\4":Lcom/luchime/huiyuan/ui/TimelineItem;
    const/16 v22, 0x0

    .line 172
    .local v22, "$i$a$-indexOfFirst-HuiyuanAppKt$HuiyuanApp$runThinking$1$1$index$1\\4\\583\\2":I
    invoke-interface/range {v21 .. v21}, Lcom/luchime/huiyuan/ui/TimelineItem;->getId()J

    move-result-wide v23

    cmp-long v23, v23, v3

    if-nez v23, :cond_2

    const/16 v21, 0x1

    goto :goto_3

    :cond_2
    const/16 v21, 0x0

    .line 583
    .end local v21    # "it\\4":Lcom/luchime/huiyuan/ui/TimelineItem;
    .end local v22    # "$i$a$-indexOfFirst-HuiyuanAppKt$HuiyuanApp$runThinking$1$1$index$1\\4\\583\\2":I
    :goto_3
    if-eqz v21, :cond_3

    .line 584
    goto :goto_4

    .line 585
    :cond_3
    nop

    .end local v20    # "item\\3":Ljava/lang/Object;
    add-int/lit8 v18, v18, 0x1

    goto :goto_2

    .line 587
    :cond_4
    const/16 v18, -0x1

    .line 172
    .end local v15    # "$this$indexOfFirst\\3":Ljava/util/List;
    .end local v17    # "$i$f$indexOfFirst\\3\\172":I
    .end local v18    # "index\\3":I
    :goto_4
    move/from16 v15, v18

    .line 173
    .local v15, "index\\2":I
    if-ltz v15, :cond_5

    .line 174
    move-object/from16 p1, v0

    .end local v0    # "$result":Ljava/lang/Object;
    .restart local p1    # "$result":Ljava/lang/Object;
    invoke-virtual {v11, v15}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move/from16 v17, v1

    .end local v1    # "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    .local v17, "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    const-string v1, "null cannot be cast to non-null type com.luchime.huiyuan.ui.TimelineItem.ThinkLog"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v18, v0

    check-cast v18, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;

    .line 175
    .local v18, "current\\2":Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;
    invoke-virtual/range {v18 .. v18}, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->getLines()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, v14}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v21

    const/16 v23, 0x5

    const/16 v24, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    invoke-static/range {v18 .. v24}, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->copy$default(Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;JLjava/util/List;Lcom/luchime/huiyuan/ui/AIModel;ILjava/lang/Object;)Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;

    move-result-object v0

    invoke-virtual {v11, v15, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 173
    .end local v17    # "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    .end local v18    # "current\\2":Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;
    .end local p1    # "$result":Ljava/lang/Object;
    .restart local v0    # "$result":Ljava/lang/Object;
    .restart local v1    # "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    :cond_5
    move-object/from16 p1, v0

    move/from16 v17, v1

    .line 177
    .end local v0    # "$result":Ljava/lang/Object;
    .end local v1    # "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    .restart local v17    # "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    .restart local p1    # "$result":Ljava/lang/Object;
    :goto_5
    nop

    .line 580
    .end local v13    # "element\\1":Ljava/lang/Object;
    .end local v14    # "step\\2":Ljava/lang/String;
    .end local v15    # "index\\2":I
    .end local v17    # "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0":I
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_0

    .line 588
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    :cond_6
    move-object/from16 p1, v1

    .line 179
    .end local v1    # "$result":Ljava/lang/Object;
    .end local v8    # "$i$f$forEach\\1\\169":I
    .end local v12    # "$this$forEach\\1":Ljava/lang/Iterable;
    .restart local p1    # "$result":Ljava/lang/Object;
    move-object v0, v7

    check-cast v0, Lkotlin/coroutines/Continuation;

    const/4 v1, 0x0

    iput-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$0:Ljava/lang/Object;

    iput-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$1:Ljava/lang/Object;

    iput-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$2:Ljava/lang/Object;

    iput-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$3:Ljava/lang/Object;

    iput-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$4:Ljava/lang/Object;

    iput-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$5:Ljava/lang/Object;

    const/4 v1, 0x2

    iput v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->label:I

    const-wide/16 v3, 0x1e0

    invoke-static {v3, v4, v0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_7

    .line 168
    return-object v2

    .line 179
    :cond_7
    move-object v1, v2

    move-object/from16 v0, p1

    .line 180
    .end local p1    # "$result":Ljava/lang/Object;
    .restart local v0    # "$result":Ljava/lang/Object;
    :goto_6
    iget-wide v2, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generation:J

    iget-object v4, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    invoke-static {v4}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$31(Landroidx/compose/runtime/MutableLongState;)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_8

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 182
    :cond_8
    iget-object v2, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    invoke-static {v2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$28(Landroidx/compose/runtime/MutableLongState;)J

    move-result-wide v2

    iget-object v4, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    const-wide/16 v5, 0x1

    add-long/2addr v5, v2

    invoke-static {v4, v5, v6}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$29(Landroidx/compose/runtime/MutableLongState;J)V

    move-wide/from16 v18, v2

    .line 183
    .local v18, "responseId":J
    iget-object v2, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v2, Ljava/util/Collection;

    new-instance v17, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    .line 184
    nop

    .line 185
    nop

    .line 186
    nop

    .line 187
    iget-object v3, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$result:Lcom/luchime/huiyuan/ReplyResult;

    invoke-virtual {v3}, Lcom/luchime/huiyuan/ReplyResult;->getTag()Ljava/lang/String;

    move-result-object v22

    .line 188
    iget-object v3, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$result:Lcom/luchime/huiyuan/ReplyResult;

    invoke-virtual {v3}, Lcom/luchime/huiyuan/ReplyResult;->getEntry()Lcom/luchime/huiyuan/LexiconEntry;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lcom/luchime/huiyuan/LexiconEntry;->getText()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v23, v3

    goto :goto_7

    :cond_9
    const/16 v23, 0x0

    .line 183
    :goto_7
    nop

    .line 189
    nop

    .line 190
    iget-object v3, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generationModel:Lcom/luchime/huiyuan/ui/AIModel;

    .line 183
    const/16 v28, 0x20

    const/16 v29, 0x0

    const/16 v20, 0x0

    const-string v21, ""

    const-wide/16 v24, 0x0

    const/16 v26, 0x1

    move-object/from16 v27, v3

    invoke-direct/range {v17 .. v29}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 195
    iget-object v8, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v2, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;

    iget-object v3, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-wide v4, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$thinkId:J

    const/4 v6, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1$2;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;JLkotlin/coroutines/Continuation;)V

    move-object v11, v2

    check-cast v11, Lkotlin/jvm/functions/Function2;

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 200
    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$result:Lcom/luchime/huiyuan/ReplyResult;

    invoke-virtual {v3}, Lcom/luchime/huiyuan/ReplyResult;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 201
    .local v2, "rendered":Ljava/lang/StringBuilder;
    sget-object v3, Lcom/luchime/huiyuan/StreamingTextPolicy;->INSTANCE:Lcom/luchime/huiyuan/StreamingTextPolicy;

    iget-object v4, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$result:Lcom/luchime/huiyuan/ReplyResult;

    invoke-virtual {v4}, Lcom/luchime/huiyuan/ReplyResult;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/luchime/huiyuan/StreamingTextPolicy;->units(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 202
    .local v3, "units":Ljava/util/List;
    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    iget-wide v5, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generation:J

    iget-object v8, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v9, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$haptics:Lcom/luchime/huiyuan/ui/AppHaptics;

    iget-object v10, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-object v11, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$selectedTab$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v12, 0x0

    .line 589
    .local v12, "$i$f$forEachIndexed\\5\\202":I
    const/4 v13, 0x0

    .line 590
    .local v13, "index\\5":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    move-object/from16 p1, v0

    move-object v15, v4

    move-object v4, v1

    move-wide/from16 v0, v18

    move-wide/from16 v41, v5

    move-object v5, v10

    move-object v6, v11

    move v10, v12

    move-wide/from16 v11, v41

    .end local v4    # "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEachIndexed\\5\\202":I
    .end local v18    # "responseId":J
    .local v0, "responseId":J
    .restart local v10    # "$i$f$forEachIndexed\\5\\202":I
    .local v15, "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    .restart local p1    # "$result":Ljava/lang/Object;
    :goto_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    move/from16 v18, v13

    .end local v13    # "index\\5":I
    .local v18, "index\\5":I
    const-string v13, "null cannot be cast to non-null type com.luchime.huiyuan.ui.TimelineItem.Message"

    if-eqz v17, :cond_14

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .local v17, "item\\5":Ljava/lang/Object;
    move-object/from16 v19, v15

    .end local v15    # "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    .local v19, "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    add-int/lit8 v15, v18, 0x1

    .end local v18    # "index\\5":I
    .local v15, "index\\5":I
    if-gez v18, :cond_a

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_a
    move-object/from16 v20, v4

    move-object/from16 v4, v17

    check-cast v4, Ljava/lang/String;

    .local v4, "unit\\6":Ljava/lang/String;
    move/from16 v21, v15

    .end local v15    # "index\\5":I
    .local v18, "unitIndex\\6":I
    .local v21, "index\\5":I
    const/4 v15, 0x0

    .line 203
    .local v15, "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    invoke-static {v5}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$31(Landroidx/compose/runtime/MutableLongState;)J

    move-result-wide v22

    cmp-long v22, v11, v22

    if-eqz v22, :cond_b

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v5

    .line 204
    :cond_b
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    move-object/from16 v22, v8

    check-cast v22, Ljava/util/List;

    .local v22, "$this$indexOfFirst\\7":Ljava/util/List;
    const/16 v23, 0x0

    .line 591
    .local v23, "$i$f$indexOfFirst\\7\\205":I
    const/16 v24, 0x0

    .line 592
    .local v24, "index\\7":I
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v25

    :goto_9
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_e

    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    .line 593
    .local v26, "item\\7":Ljava/lang/Object;
    move-object/from16 v27, v26

    check-cast v27, Lcom/luchime/huiyuan/ui/TimelineItem;

    .local v27, "it\\8":Lcom/luchime/huiyuan/ui/TimelineItem;
    const/16 v28, 0x0

    .line 205
    .local v28, "$i$a$-indexOfFirst-HuiyuanAppKt$HuiyuanApp$runThinking$1$3$messageIndex$1\\8\\593\\6":I
    invoke-interface/range {v27 .. v27}, Lcom/luchime/huiyuan/ui/TimelineItem;->getId()J

    move-result-wide v29

    cmp-long v29, v29, v0

    if-nez v29, :cond_c

    const/16 v27, 0x1

    goto :goto_a

    :cond_c
    const/16 v27, 0x0

    .line 593
    .end local v27    # "it\\8":Lcom/luchime/huiyuan/ui/TimelineItem;
    .end local v28    # "$i$a$-indexOfFirst-HuiyuanAppKt$HuiyuanApp$runThinking$1$3$messageIndex$1\\8\\593\\6":I
    :goto_a
    if-eqz v27, :cond_d

    .line 594
    goto :goto_b

    .line 595
    :cond_d
    nop

    .end local v26    # "item\\7":Ljava/lang/Object;
    add-int/lit8 v24, v24, 0x1

    goto :goto_9

    .line 597
    :cond_e
    const/16 v24, -0x1

    .line 205
    .end local v22    # "$this$indexOfFirst\\7":Ljava/util/List;
    .end local v23    # "$i$f$indexOfFirst\\7\\205":I
    .end local v24    # "index\\7":I
    :goto_b
    move/from16 v22, v24

    .line 206
    .local v22, "messageIndex\\6":I
    if-ltz v22, :cond_f

    .line 207
    move/from16 v23, v15

    move/from16 v15, v22

    move/from16 v22, v10

    .end local v10    # "$i$f$forEachIndexed\\5\\202":I
    .local v15, "messageIndex\\6":I
    .local v22, "$i$f$forEachIndexed\\5\\202":I
    .local v23, "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    invoke-virtual {v8, v15}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v24, v10

    check-cast v24, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    .line 208
    .local v24, "current\\6":Lcom/luchime/huiyuan/ui/TimelineItem$Message;
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v13, "toString(...)"

    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v35, 0xfb

    const/16 v36, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v28, v10

    invoke-static/range {v24 .. v36}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->copy$default(Lcom/luchime/huiyuan/ui/TimelineItem$Message;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;ILjava/lang/Object;)Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    move-result-object v10

    invoke-virtual {v8, v15, v10}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    .line 206
    .end local v23    # "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    .end local v24    # "current\\6":Lcom/luchime/huiyuan/ui/TimelineItem$Message;
    .restart local v10    # "$i$f$forEachIndexed\\5\\202":I
    .local v15, "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    .local v22, "messageIndex\\6":I
    :cond_f
    move/from16 v23, v15

    move/from16 v15, v22

    move/from16 v22, v10

    .line 211
    .end local v10    # "$i$f$forEachIndexed\\5\\202":I
    .local v15, "messageIndex\\6":I
    .local v22, "$i$f$forEachIndexed\\5\\202":I
    .restart local v23    # "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    :goto_c
    nop

    .line 212
    invoke-static {v6}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$16(Landroidx/compose/runtime/MutableState;)Lcom/luchime/huiyuan/ui/AppTab;

    move-result-object v10

    sget-object v13, Lcom/luchime/huiyuan/ui/AppTab;->CHAT:Lcom/luchime/huiyuan/ui/AppTab;

    if-ne v10, v13, :cond_10

    .line 213
    sget-object v10, Lcom/luchime/huiyuan/StreamingTextPolicy;->INSTANCE:Lcom/luchime/huiyuan/StreamingTextPolicy;

    move/from16 v13, v18

    .end local v18    # "unitIndex\\6":I
    .local v13, "unitIndex\\6":I
    invoke-virtual {v10, v13, v4}, Lcom/luchime/huiyuan/StreamingTextPolicy;->shouldTick(ILjava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_11

    .line 215
    sget-object v10, Lcom/luchime/huiyuan/ui/HapticCue;->STREAM_TICK:Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-virtual {v9, v10}, Lcom/luchime/huiyuan/ui/AppHaptics;->perform(Lcom/luchime/huiyuan/ui/HapticCue;)V

    goto :goto_d

    .line 212
    .end local v13    # "unitIndex\\6":I
    .restart local v18    # "unitIndex\\6":I
    :cond_10
    move/from16 v13, v18

    .line 218
    .end local v18    # "unitIndex\\6":I
    .restart local v13    # "unitIndex\\6":I
    :cond_11
    :goto_d
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v10

    if-eq v13, v10, :cond_13

    .line 219
    sget-object v10, Lcom/luchime/huiyuan/StreamingTextPolicy;->INSTANCE:Lcom/luchime/huiyuan/StreamingTextPolicy;

    move-wide/from16 v24, v11

    invoke-virtual {v10, v4}, Lcom/luchime/huiyuan/StreamingTextPolicy;->delayAfter(Ljava/lang/String;)J

    move-result-wide v10

    iput-object v2, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$0:Ljava/lang/Object;

    iput-object v3, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$1:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$2:Ljava/lang/Object;

    iput-object v8, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$3:Ljava/lang/Object;

    iput-object v9, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$4:Ljava/lang/Object;

    iput-object v5, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$5:Ljava/lang/Object;

    iput-object v6, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$6:Ljava/lang/Object;

    iput-object v14, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$7:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$8:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->L$9:Ljava/lang/Object;

    iput-wide v0, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->J$0:J

    move-wide/from16 v26, v0

    move-wide/from16 v0, v24

    .end local v0    # "responseId":J
    .local v26, "responseId":J
    iput-wide v0, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->J$1:J

    move/from16 v12, v22

    .end local v22    # "$i$f$forEachIndexed\\5\\202":I
    .restart local v12    # "$i$f$forEachIndexed\\5\\202":I
    iput v12, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$0:I

    move/from16 v0, v21

    .end local v21    # "index\\5":I
    .local v0, "index\\5":I
    iput v0, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$1:I

    iput v13, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$2:I

    move/from16 v1, v23

    .end local v23    # "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    .local v1, "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    iput v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$3:I

    iput v15, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->I$4:I

    .end local v0    # "index\\5":I
    .restart local v21    # "index\\5":I
    const/4 v0, 0x3

    iput v0, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->label:I

    invoke-static {v10, v11, v7}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v10, v20

    if-ne v0, v10, :cond_12

    .line 168
    return-object v10

    .line 219
    :cond_12
    move-object/from16 v18, v9

    move-object v9, v7

    move v7, v1

    move-object v1, v2

    move v2, v15

    move-object v15, v4

    move-object/from16 v4, v17

    move-object/from16 v17, v10

    move v10, v12

    move-wide/from16 v11, v24

    move-object/from16 v0, p1

    .line 221
    .end local v12    # "$i$f$forEachIndexed\\5\\202":I
    .end local v17    # "item\\5":Ljava/lang/Object;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    .local v1, "rendered":Ljava/lang/StringBuilder;
    .local v2, "messageIndex\\6":I
    .local v4, "item\\5":Ljava/lang/Object;
    .local v7, "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    .local v9, "this":Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
    .restart local v10    # "$i$f$forEachIndexed\\5\\202":I
    .local v15, "unit\\6":Ljava/lang/String;
    :goto_e
    move-object v2, v1

    move-object v7, v9

    move-object/from16 v4, v17

    move-object/from16 v9, v18

    move-object/from16 v15, v19

    move/from16 v13, v21

    goto :goto_f

    .line 218
    .end local v1    # "rendered":Ljava/lang/StringBuilder;
    .end local v9    # "this":Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
    .end local v10    # "$i$f$forEachIndexed\\5\\202":I
    .end local v26    # "responseId":J
    .local v0, "responseId":J
    .local v2, "rendered":Ljava/lang/StringBuilder;
    .local v4, "unit\\6":Ljava/lang/String;
    .local v7, "this":Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;
    .local v15, "messageIndex\\6":I
    .restart local v17    # "item\\5":Ljava/lang/Object;
    .restart local v22    # "$i$f$forEachIndexed\\5\\202":I
    .restart local v23    # "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_13
    move-wide/from16 v26, v0

    move-wide/from16 v24, v11

    move-object/from16 v10, v20

    move/from16 v12, v22

    move/from16 v1, v23

    .end local v0    # "responseId":J
    .end local v22    # "$i$f$forEachIndexed\\5\\202":I
    .end local v23    # "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    .local v1, "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    .restart local v12    # "$i$f$forEachIndexed\\5\\202":I
    .restart local v26    # "responseId":J
    move-object/from16 v0, p1

    move-object v4, v10

    move v10, v12

    move-wide/from16 v11, v24

    move-object/from16 v15, v19

    move/from16 v13, v21

    .line 590
    .end local v1    # "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0":I
    .end local v4    # "unit\\6":Ljava/lang/String;
    .end local v12    # "$i$f$forEachIndexed\\5\\202":I
    .end local v17    # "item\\5":Ljava/lang/Object;
    .end local v19    # "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    .end local v21    # "index\\5":I
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    .restart local v10    # "$i$f$forEachIndexed\\5\\202":I
    .local v13, "index\\5":I
    .local v15, "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    :goto_f
    move-object/from16 p1, v0

    move-wide/from16 v0, v26

    goto/16 :goto_8

    .line 598
    .end local v13    # "index\\5":I
    .end local v26    # "responseId":J
    .local v0, "responseId":J
    .local v18, "index\\5":I
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_14
    move-wide/from16 v26, v0

    move v12, v10

    move-object/from16 v19, v15

    .line 223
    .end local v0    # "responseId":J
    .end local v10    # "$i$f$forEachIndexed\\5\\202":I
    .end local v15    # "$this$forEachIndexed\\5":Ljava/lang/Iterable;
    .end local v18    # "index\\5":I
    .restart local v26    # "responseId":J
    iget-wide v0, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generation:J

    iget-object v4, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    invoke-static {v4}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$31(Landroidx/compose/runtime/MutableLongState;)J

    move-result-wide v4

    cmp-long v0, v0, v4

    if-eqz v0, :cond_15

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 224
    :cond_15
    iget-object v0, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/List;

    .local v0, "$this$indexOfFirst\\9":Ljava/util/List;
    const/4 v1, 0x0

    .line 599
    .local v1, "$i$f$indexOfFirst\\9\\224":I
    const/4 v4, 0x0

    .line 600
    .local v4, "index\\9":I
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 601
    .local v6, "item\\9":Ljava/lang/Object;
    move-object v8, v6

    check-cast v8, Lcom/luchime/huiyuan/ui/TimelineItem;

    .local v8, "it\\10":Lcom/luchime/huiyuan/ui/TimelineItem;
    const/4 v9, 0x0

    .line 224
    .local v9, "$i$a$-indexOfFirst-HuiyuanAppKt$HuiyuanApp$runThinking$1$messageIndex$1\\10\\601\\0":I
    invoke-interface {v8}, Lcom/luchime/huiyuan/ui/TimelineItem;->getId()J

    move-result-wide v10

    cmp-long v10, v10, v26

    if-nez v10, :cond_16

    const/4 v8, 0x1

    goto :goto_11

    :cond_16
    const/4 v8, 0x0

    .line 601
    .end local v8    # "it\\10":Lcom/luchime/huiyuan/ui/TimelineItem;
    .end local v9    # "$i$a$-indexOfFirst-HuiyuanAppKt$HuiyuanApp$runThinking$1$messageIndex$1\\10\\601\\0":I
    :goto_11
    if-eqz v8, :cond_17

    .line 602
    move/from16 v16, v4

    goto :goto_12

    .line 603
    :cond_17
    nop

    .end local v6    # "item\\9":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_10

    .line 605
    :cond_18
    const/16 v16, -0x1

    .line 224
    .end local v0    # "$this$indexOfFirst\\9":Ljava/util/List;
    .end local v1    # "$i$f$indexOfFirst\\9\\224":I
    .end local v4    # "index\\9":I
    :goto_12
    move/from16 v0, v16

    .line 225
    .local v0, "messageIndex":I
    if-ltz v0, :cond_19

    .line 226
    iget-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v28, v1

    check-cast v28, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    .line 227
    .local v28, "current":Lcom/luchime/huiyuan/ui/TimelineItem$Message;
    iget-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v4, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$result:Lcom/luchime/huiyuan/ReplyResult;

    invoke-virtual {v4}, Lcom/luchime/huiyuan/ReplyResult;->getText()Ljava/lang/String;

    move-result-object v32

    const/16 v39, 0xbb

    const/16 v40, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-static/range {v28 .. v40}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->copy$default(Lcom/luchime/huiyuan/ui/TimelineItem$Message;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;ILjava/lang/Object;)Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 229
    .end local v28    # "current":Lcom/luchime/huiyuan/ui/TimelineItem$Message;
    :cond_19
    iget-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    iget-object v4, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-static {v1, v4}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$persistConversation(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V

    .line 230
    iget-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$selectedTab$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$16(Landroidx/compose/runtime/MutableState;)Lcom/luchime/huiyuan/ui/AppTab;

    move-result-object v1

    sget-object v4, Lcom/luchime/huiyuan/ui/AppTab;->CHAT:Lcom/luchime/huiyuan/ui/AppTab;

    if-ne v1, v4, :cond_1a

    .line 231
    iget-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$haptics:Lcom/luchime/huiyuan/ui/AppHaptics;

    sget-object v4, Lcom/luchime/huiyuan/ui/HapticCue;->STREAM_COMPLETE:Lcom/luchime/huiyuan/ui/HapticCue;

    invoke-virtual {v1, v4}, Lcom/luchime/huiyuan/ui/AppHaptics;->perform(Lcom/luchime/huiyuan/ui/HapticCue;)V

    .line 233
    :cond_1a
    iget-wide v4, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$generation:J

    iget-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    invoke-static {v1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$31(Landroidx/compose/runtime/MutableLongState;)J

    move-result-wide v8

    cmp-long v1, v4, v8

    if-nez v1, :cond_1b

    .line 234
    iget-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$isGenerating$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v4, 0x0

    invoke-static {v1, v4}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$35(Landroidx/compose/runtime/MutableState;Z)V

    .line 235
    iget-object v1, v7, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$runThinking$1;->$activeGenerationJob$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v6, 0x0

    invoke-static {v1, v6}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$lambda$38(Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/Job;)V

    .line 237
    :cond_1b
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
