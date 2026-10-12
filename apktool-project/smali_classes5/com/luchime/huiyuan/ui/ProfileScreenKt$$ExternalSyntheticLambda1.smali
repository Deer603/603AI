.class public final synthetic Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ProfileScreenKt;"
    method = "SettingsRow_uDo3WH8$lambda$58"
    proto = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:J

.field public final synthetic f$4:Z

.field public final synthetic f$5:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$2:Ljava/lang/String;

    iput-wide p4, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$3:J

    iput-boolean p6, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$4:Z

    iput-object p7, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function0;

    iput p8, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$2:Ljava/lang/String;

    iget-wide v3, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$3:J

    iget-boolean v5, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$4:Z

    iget-object v6, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function0;

    iget v7, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda1;->f$6:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/luchime/huiyuan/ui/ProfileScreenKt;->SettingsRow_uDo3WH8$lambda$58(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
