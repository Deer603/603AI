.class final synthetic Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "HuiyuanApp.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
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

.field final synthetic $engine:Lcom/luchime/huiyuan/HuiyuanEngine;

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

.field final synthetic $scope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $selectedModel$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectedTab$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/ui/AppTab;",
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

.field final synthetic $usageStats$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/UsageStats;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/luchime/huiyuan/HuiyuanEngine;Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/HuiyuanEngine;",
            "Lcom/luchime/huiyuan/AppRepository;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/UsageStats;",
            ">;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/luchime/huiyuan/ui/TimelineItem;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/runtime/MutableLongState;",
            "Landroidx/compose/runtime/MutableLongState;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlinx/coroutines/Job;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            ">;",
            "Lcom/luchime/huiyuan/ui/AppHaptics;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/ui/AppTab;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    iput-object v6, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$engine:Lcom/luchime/huiyuan/HuiyuanEngine;

    move-object/from16 v7, p2

    iput-object v7, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    move-object/from16 v8, p3

    iput-object v8, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$isGenerating$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v9, p4

    iput-object v9, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$usageStats$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v10, p5

    iput-object v10, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-object/from16 v11, p6

    iput-object v11, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$scope:Lkotlinx/coroutines/CoroutineScope;

    move-object/from16 v12, p7

    iput-object v12, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    move-object/from16 v13, p8

    iput-object v13, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    move-object/from16 v14, p9

    iput-object v14, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$activeGenerationJob$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v15, p10

    iput-object v15, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$selectedModel$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v1, p11

    iput-object v1, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$haptics:Lcom/luchime/huiyuan/ui/AppHaptics;

    move-object/from16 v2, p12

    iput-object v2, v0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$selectedTab$delegate:Landroidx/compose/runtime/MutableState;

    const-class v2, Lkotlin/jvm/internal/Intrinsics$Kotlin;

    const-string v4, "HuiyuanApp$randomOne(Lcom/luchime/huiyuan/HuiyuanEngine;Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;)V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-string v3, "randomOne"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 339
    invoke-virtual {p0}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 12

    .line 339
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$engine:Lcom/luchime/huiyuan/HuiyuanEngine;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$isGenerating$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$usageStats$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$scope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v6, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-object v7, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-object v8, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$activeGenerationJob$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$selectedModel$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v10, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$haptics:Lcom/luchime/huiyuan/ui/AppHaptics;

    iget-object v11, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1;->$selectedTab$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static/range {v0 .. v11}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$randomOne(Lcom/luchime/huiyuan/HuiyuanEngine;Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;)V

    return-void
.end method
