.class public final synthetic Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/HuiyuanAppKt;"
    method = "HuiyuanApp$lambda$95$lambda$94$lambda$89$lambda$87$lambda$86"
    proto = "(Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AppTab;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda3;->f$0:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda3;->f$0:Landroidx/compose/runtime/MutableState;

    check-cast p1, Lcom/luchime/huiyuan/ui/AppTab;

    invoke-static {v0, p1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp$lambda$95$lambda$94$lambda$89$lambda$87$lambda$86(Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AppTab;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
