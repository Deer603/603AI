.class public final synthetic Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ProfileScreenKt;"
    method = "ProfileScreen$lambda$36$lambda$35$lambda$34"
    proto = "(ZIIILandroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:I

.field public final synthetic f$2:I

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(ZIII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda8;->f$0:Z

    iput p2, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda8;->f$1:I

    iput p3, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda8;->f$2:I

    iput p4, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda8;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-boolean v0, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda8;->f$0:Z

    iget v1, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda8;->f$1:I

    iget v2, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda8;->f$2:I

    iget v3, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda8;->f$3:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/luchime/huiyuan/ui/ProfileScreenKt;->ProfileScreen$lambda$36$lambda$35$lambda$34(ZIIILandroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
