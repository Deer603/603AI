.class public final synthetic Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;"
    method = "KnowledgeCard$lambda$59"
    proto = "(Lcom/luchime/huiyuan/LexiconEntry;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Lcom/luchime/huiyuan/LexiconEntry;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Ljava/lang/String;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/luchime/huiyuan/LexiconEntry;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$0:Lcom/luchime/huiyuan/LexiconEntry;

    iput-boolean p2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$1:Z

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$5:Ljava/lang/String;

    iput-object p7, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$6:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$0:Lcom/luchime/huiyuan/LexiconEntry;

    iget-boolean v1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$1:Z

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$5:Ljava/lang/String;

    iget-object v6, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda24;->f$6:Lkotlin/jvm/functions/Function0;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/layout/BoxScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->KnowledgeCard$lambda$59(Lcom/luchime/huiyuan/LexiconEntry;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
