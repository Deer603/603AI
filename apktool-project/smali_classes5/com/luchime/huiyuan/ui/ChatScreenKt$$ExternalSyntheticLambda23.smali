.class public final synthetic Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ChatScreenKt;"
    method = "MessageBubble$lambda$101$lambda$100"
    proto = "(Lcom/luchime/huiyuan/ui/TimelineItem$Message;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Lcom/luchime/huiyuan/ui/TimelineItem$Message;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/luchime/huiyuan/ui/TimelineItem$Message;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$0:Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$1:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$2:Lkotlin/jvm/functions/Function0;

    iput-boolean p4, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$3:Z

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$4:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$0:Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$1:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$2:Lkotlin/jvm/functions/Function0;

    iget-boolean v3, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$3:Z

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda23;->f$4:Lkotlin/jvm/functions/Function0;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/layout/BoxScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/luchime/huiyuan/ui/ChatScreenKt;->MessageBubble$lambda$101$lambda$100(Lcom/luchime/huiyuan/ui/TimelineItem$Message;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
