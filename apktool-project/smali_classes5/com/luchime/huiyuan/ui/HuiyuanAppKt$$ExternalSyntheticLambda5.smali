.class public final synthetic Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/HuiyuanAppKt;"
    method = "HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$54$lambda$53"
    proto = "(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AIModel;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Lcom/luchime/huiyuan/AppRepository;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda5;->f$0:Lcom/luchime/huiyuan/AppRepository;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda5;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda5;->f$2:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda5;->f$0:Lcom/luchime/huiyuan/AppRepository;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda5;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/HuiyuanAppKt$$ExternalSyntheticLambda5;->f$2:Landroidx/compose/runtime/MutableState;

    check-cast p1, Lcom/luchime/huiyuan/ui/AIModel;

    invoke-static {v0, v1, v2, p1}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$54$lambda$53(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AIModel;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
