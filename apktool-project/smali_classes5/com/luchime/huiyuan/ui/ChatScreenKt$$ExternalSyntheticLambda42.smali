.class public final synthetic Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda42;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ChatScreenKt;"
    method = "ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$lambda$18"
    proto = "(Lcom/luchime/huiyuan/ui/TimelineItem;)Ljava/lang/Object;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lcom/luchime/huiyuan/ui/TimelineItem;

    invoke-static {p1}, Lcom/luchime/huiyuan/ui/ChatScreenKt;->ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$lambda$18(Lcom/luchime/huiyuan/ui/TimelineItem;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
