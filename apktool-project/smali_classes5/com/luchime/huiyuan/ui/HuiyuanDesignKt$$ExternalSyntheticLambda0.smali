.class public final synthetic Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/HuiyuanDesignKt;"
    method = "CategoryBadge_iJQMabo$lambda$4"
    proto = "(Ljava/lang/String;JIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:J

.field public final synthetic f$2:I

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda0;->f$0:Ljava/lang/String;

    iput-wide p2, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda0;->f$1:J

    iput p4, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda0;->f$2:I

    iput p5, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda0;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda0;->f$0:Ljava/lang/String;

    iget-wide v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda0;->f$1:J

    iget v3, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda0;->f$2:I

    iget v4, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda0;->f$3:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt;->CategoryBadge_iJQMabo$lambda$4(Ljava/lang/String;JIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
