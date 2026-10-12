.class public final synthetic Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/AppHapticsKt;"
    method = "hapticClickable$lambda$4"
    proto = "(ZLcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lcom/luchime/huiyuan/ui/HapticCue;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(ZLcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda2;->f$0:Z

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda2;->f$1:Lcom/luchime/huiyuan/ui/HapticCue;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-boolean v0, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda2;->f$0:Z

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda2;->f$1:Lcom/luchime/huiyuan/ui/HapticCue;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/AppHapticsKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function0;

    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/luchime/huiyuan/ui/AppHapticsKt;->hapticClickable$lambda$4(ZLcom/luchime/huiyuan/ui/HapticCue;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
