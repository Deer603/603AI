.class public final synthetic Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;"
    method = "KnowledgeCard$lambda$60"
    proto = "(Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Lcom/luchime/huiyuan/LexiconEntry;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Z

.field public final synthetic f$3:Z

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$7:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$8:I


# direct methods
.method public synthetic constructor <init>(Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$0:Lcom/luchime/huiyuan/LexiconEntry;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$1:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$2:Z

    iput-boolean p4, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$3:Z

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$5:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$6:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$7:Lkotlin/jvm/functions/Function0;

    iput p9, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$8:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$0:Lcom/luchime/huiyuan/LexiconEntry;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$1:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$2:Z

    iget-boolean v3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$3:Z

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$5:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$6:Lkotlin/jvm/functions/Function0;

    iget-object v7, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$7:Lkotlin/jvm/functions/Function0;

    iget v8, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda25;->f$8:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->KnowledgeCard$lambda$60(Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
