.class public final synthetic Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/AppHapticsKt;"
    method = "hapticClickable$lambda$4$lambda$3$lambda$2"
    proto = "(Lcom/luchime/huiyuan/ui/AppHaptics;Lcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Lcom/luchime/huiyuan/ui/AppHaptics;

.field public final synthetic f$1:Lcom/luchime/huiyuan/ui/HapticCue;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/luchime/huiyuan/ui/AppHaptics;Lcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda0;->f$0:Lcom/luchime/huiyuan/ui/AppHaptics;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda0;->f$1:Lcom/luchime/huiyuan/ui/HapticCue;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda0;->f$0:Lcom/luchime/huiyuan/ui/AppHaptics;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda0;->f$1:Lcom/luchime/huiyuan/ui/HapticCue;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, Lcom/luchime/huiyuan/ui/AppHapticsKt;->hapticClickable$lambda$4$lambda$3$lambda$2(Lcom/luchime/huiyuan/ui/AppHaptics;Lcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
