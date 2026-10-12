.class final synthetic Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;
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


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/luchime/huiyuan/AppRepository;Lcom/luchime/huiyuan/HuiyuanEngine;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/luchime/huiyuan/ui/TimelineItem;",
            ">;",
            "Lcom/luchime/huiyuan/AppRepository;",
            "Lcom/luchime/huiyuan/HuiyuanEngine;",
            "Landroidx/compose/runtime/MutableLongState;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlinx/coroutines/Job;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableLongState;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$engine:Lcom/luchime/huiyuan/HuiyuanEngine;

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$activeGenerationJob$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$isGenerating$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    iput-object p8, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$selectedModel$delegate:Landroidx/compose/runtime/MutableState;

    const-class v2, Lkotlin/jvm/internal/Intrinsics$Kotlin;

    const-string v4, "HuiyuanApp$resetConversation(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/luchime/huiyuan/AppRepository;Lcom/luchime/huiyuan/HuiyuanEngine;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;)V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-string v3, "resetConversation"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 345
    invoke-virtual {p0}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 345
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$timeline:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$repository:Lcom/luchime/huiyuan/AppRepository;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$engine:Lcom/luchime/huiyuan/HuiyuanEngine;

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$conversationGeneration$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$activeGenerationJob$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$isGenerating$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$nextId$delegate:Landroidx/compose/runtime/MutableLongState;

    iget-object v7, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1;->$selectedModel$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static/range {v0 .. v7}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->access$HuiyuanApp$resetConversation(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/luchime/huiyuan/AppRepository;Lcom/luchime/huiyuan/HuiyuanEngine;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;)V

    return-void
.end method
