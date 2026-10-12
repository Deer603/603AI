.class public final synthetic Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;"
    method = "FavoritesScreen$lambda$54$lambda$53"
    proto = "(Ljava/util/List;ZLcom/luchime/huiyuan/ui/AppHaptics;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Lcom/luchime/huiyuan/ui/AppHaptics;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Landroid/content/Context;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZLcom/luchime/huiyuan/ui/AppHaptics;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$0:Ljava/util/List;

    iput-boolean p2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$1:Z

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$2:Lcom/luchime/huiyuan/ui/AppHaptics;

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$4:Landroid/content/Context;

    iput-object p6, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$5:Lkotlin/jvm/functions/Function2;

    iput-object p7, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$6:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$0:Ljava/util/List;

    iget-boolean v1, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$1:Z

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$2:Lcom/luchime/huiyuan/ui/AppHaptics;

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$4:Landroid/content/Context;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$5:Lkotlin/jvm/functions/Function2;

    iget-object v6, p0, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt$$ExternalSyntheticLambda18;->f$6:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v0 .. v7}, Lcom/luchime/huiyuan/ui/KnowledgeScreensKt;->FavoritesScreen$lambda$54$lambda$53(Ljava/util/List;ZLcom/luchime/huiyuan/ui/AppHaptics;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
