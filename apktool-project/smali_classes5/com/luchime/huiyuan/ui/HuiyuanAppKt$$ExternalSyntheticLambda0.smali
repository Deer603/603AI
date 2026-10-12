.class public final synthetic Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/HuiyuanAppKt;"
    method = "SideNavigation$lambda$101$lambda$100$lambda$98$lambda$97"
    proto = "(Lkotlin/jvm/functions/Function1;Lcom/luchime/huiyuan/ui/AppTab;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Lcom/luchime/huiyuan/ui/AppTab;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/luchime/huiyuan/ui/AppTab;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda0;->f$1:Lcom/luchime/huiyuan/ui/AppTab;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda0;->f$1:Lcom/luchime/huiyuan/ui/AppTab;

    invoke-static {v0, v1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->SideNavigation$lambda$101$lambda$100$lambda$98$lambda$97(Lkotlin/jvm/functions/Function1;Lcom/luchime/huiyuan/ui/AppTab;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
