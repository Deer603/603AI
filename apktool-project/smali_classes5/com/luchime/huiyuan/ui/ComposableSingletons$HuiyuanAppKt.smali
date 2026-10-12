.class public final Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;
.super Ljava/lang/Object;
.source "HuiyuanApp.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;

.field private static lambda$-1957827056:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private static lambda$689415095:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;

    invoke-direct {v0}, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;-><init>()V

    sput-object v0, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;->INSTANCE:Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;

    .line 571
    new-instance v0, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt$$ExternalSyntheticLambda0;-><init>()V

    const v1, -0x74b211f0

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;->lambda$-1957827056:Lkotlin/jvm/functions/Function2;

    .line 577
    new-instance v0, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt$$ExternalSyntheticLambda1;-><init>()V

    const v1, 0x2917a3b7

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;->lambda$689415095:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final lambda_689415095$lambda$1(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 4
    .param p0, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p1, "$changed"    # I

    const-string v0, "C576@22701L12:HuiyuanApp.kt#cyjvf"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-interface {p0, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.luchime.huiyuan.ui.ComposableSingletons$HuiyuanAppKt.lambda$689415095.<anonymous> (HuiyuanApp.kt:576)"

    const v3, 0x2917a3b7

    invoke-static {v3, p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 577
    :cond_1
    invoke-static {p0, v2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp(Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method static final lambda__1957827056$lambda$0(Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 4
    .param p0, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p1, "$changed"    # I

    const-string v0, "C570@22544L12:HuiyuanApp.kt#cyjvf"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-interface {p0, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.luchime.huiyuan.ui.ComposableSingletons$HuiyuanAppKt.lambda$-1957827056.<anonymous> (HuiyuanApp.kt:570)"

    const v3, -0x74b211f0

    invoke-static {v3, p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 571
    :cond_1
    invoke-static {p0, v2}, Lcom/luchime/huiyuan/ui/HuiyuanAppKt;->HuiyuanApp(Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final getLambda$-1957827056$app()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;->lambda$-1957827056:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final getLambda$689415095$app()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/luchime/huiyuan/ui/ComposableSingletons$HuiyuanAppKt;->lambda$689415095:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
