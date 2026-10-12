.class public final synthetic Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/HuiyuanDesignKt;"
    method = "RetroCard_3IgeMak$lambda$1"
    proto = "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/Modifier;

.field public final synthetic f$1:J

.field public final synthetic f$2:Lkotlin/jvm/functions/Function3;

.field public final synthetic f$3:I

.field public final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function3;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$0:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$1:J

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$2:Lkotlin/jvm/functions/Function3;

    iput p5, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$3:I

    iput p6, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$4:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$0:Landroidx/compose/ui/Modifier;

    iget-wide v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$1:J

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$2:Lkotlin/jvm/functions/Function3;

    iget v4, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$3:I

    iget v5, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda3;->f$4:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt;->RetroCard_3IgeMak$lambda$1(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
