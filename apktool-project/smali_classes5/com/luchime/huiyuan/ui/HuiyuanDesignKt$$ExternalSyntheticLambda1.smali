.class public final synthetic Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/HuiyuanDesignKt;"
    method = "ScreenHeader_fWhpE4E$lambda$7"
    proto = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;"
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

.field public final synthetic f$5:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$6:I

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$2:Ljava/lang/String;

    iput-wide p4, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$3:J

    iput-boolean p6, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$4:Z

    iput-object p7, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function2;

    iput p8, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$6:I

    iput p9, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$2:Ljava/lang/String;

    iget-wide v3, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$3:J

    iget-boolean v5, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$4:Z

    iget-object v6, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function2;

    iget v7, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$6:I

    iget v8, p0, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt$$ExternalSyntheticLambda1;->f$7:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/luchime/huiyuan/ui/HuiyuanDesignKt;->ScreenHeader_fWhpE4E$lambda$7(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
