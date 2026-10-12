.class public final synthetic Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda49;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ChatScreenKt;"
    method = "ChatScreen$lambda$50$lambda$49$lambda$48"
    proto = "(Lcom/luchime/huiyuan/ui/AppHaptics;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Lcom/luchime/huiyuan/ui/AppHaptics;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/luchime/huiyuan/ui/AppHaptics;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda49;->f$0:Lcom/luchime/huiyuan/ui/AppHaptics;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda49;->f$1:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda49;->f$2:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda49;->f$0:Lcom/luchime/huiyuan/ui/AppHaptics;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda49;->f$1:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda49;->f$2:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, v2}, Lcom/luchime/huiyuan/ui/ChatScreenKt;->ChatScreen$lambda$50$lambda$49$lambda$48(Lcom/luchime/huiyuan/ui/AppHaptics;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
