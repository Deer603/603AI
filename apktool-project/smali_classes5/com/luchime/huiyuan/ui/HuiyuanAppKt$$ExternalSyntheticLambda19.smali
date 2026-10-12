.class public final synthetic Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda19;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/HuiyuanAppKt;"
    method = "HuiyuanApp$cancelActiveGeneration$lambda$48"
    proto = "(ZLcom/luchime/huiyuan/ui/TimelineItem;)Z"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda19;->f$0:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-boolean v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda19;->f$0:Z

    check-cast p1, Lcom/luchime/huiyuan/ui/TimelineItem;

    invoke-static {v0, p1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp$cancelActiveGeneration$lambda$48(ZLcom/luchime/huiyuan/ui/TimelineItem;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
