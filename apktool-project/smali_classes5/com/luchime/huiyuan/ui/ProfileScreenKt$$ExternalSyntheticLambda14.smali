.class public final synthetic Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda14;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ProfileScreenKt;"
    method = "ProfileScreen$lambda$44"
    proto = "(Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Lcom/luchime/huiyuan/ui/AppHaptics;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda14;->f$0:Lcom/luchime/huiyuan/ui/AppHaptics;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda14;->f$1:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda14;->f$0:Lcom/luchime/huiyuan/ui/AppHaptics;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda14;->f$1:Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/luchime/huiyuan/ui/ProfileScreenKt;->ProfileScreen$lambda$44(Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
