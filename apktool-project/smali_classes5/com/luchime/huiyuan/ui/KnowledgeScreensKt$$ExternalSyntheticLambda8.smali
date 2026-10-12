.class public final synthetic Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;"
    method = "KnowledgeScreen$lambda$39$lambda$38$lambda$26"
    proto = "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Ljava/util/Map;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda8;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda8;->f$1:Ljava/util/List;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda8;->f$2:Ljava/util/Map;

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda8;->f$3:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda8;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda8;->f$1:Ljava/util/List;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda8;->f$2:Ljava/util/Map;

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda8;->f$3:Landroidx/compose/runtime/MutableState;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->KnowledgeScreen$lambda$39$lambda$38$lambda$26(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
