.class public final synthetic Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ChatScreenKt;"
    method = "LandscapePromptPanel$lambda$81$lambda$80"
    proto = "(Ljava/util/List;Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lcom/luchime/huiyuan/ui/AIModel;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$1:Lcom/luchime/huiyuan/ui/AIModel;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$2:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$3:Z

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$5:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$1:Lcom/luchime/huiyuan/ui/AIModel;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$2:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$3:Z

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda50;->f$5:Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v0 .. v6}, Lcom/luchime/huiyuan/ui/ChatScreenKt;->LandscapePromptPanel$lambda$81$lambda$80(Ljava/util/List;Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
