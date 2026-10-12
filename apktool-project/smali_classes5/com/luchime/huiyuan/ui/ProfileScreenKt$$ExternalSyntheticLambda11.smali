.class public final synthetic Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ProfileScreenKt;"
    method = "ProfileScreen$lambda$36$lambda$35"
    proto = "(ZLcom/luchime/huiyuan/LexiconEntry;Lcom/luchime/huiyuan/ui/AIModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lcom/luchime/huiyuan/UsageStats;ILjava/util/List;Ljava/lang/String;Landroidx/compose/runtime/MutableState;IIILandroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lcom/luchime/huiyuan/LexiconEntry;

.field public final synthetic f$10:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$11:I

.field public final synthetic f$12:I

.field public final synthetic f$13:I

.field public final synthetic f$2:Lcom/luchime/huiyuan/ui/AIModel;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Landroid/content/Context;

.field public final synthetic f$6:Lcom/luchime/huiyuan/UsageStats;

.field public final synthetic f$7:I

.field public final synthetic f$8:Ljava/util/List;

.field public final synthetic f$9:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLcom/luchime/huiyuan/LexiconEntry;Lcom/luchime/huiyuan/ui/AIModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lcom/luchime/huiyuan/UsageStats;ILjava/util/List;Ljava/lang/String;Landroidx/compose/runtime/MutableState;III)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$0:Z

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$1:Lcom/luchime/huiyuan/LexiconEntry;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$2:Lcom/luchime/huiyuan/ui/AIModel;

    iput-object p4, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$5:Landroid/content/Context;

    iput-object p7, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$6:Lcom/luchime/huiyuan/UsageStats;

    iput p8, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$7:I

    iput-object p9, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$8:Ljava/util/List;

    iput-object p10, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$9:Ljava/lang/String;

    iput-object p11, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$10:Landroidx/compose/runtime/MutableState;

    iput p12, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$11:I

    iput p13, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$12:I

    iput p14, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$13:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 0
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$0:Z

    iget-object v2, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$1:Lcom/luchime/huiyuan/LexiconEntry;

    iget-object v3, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$2:Lcom/luchime/huiyuan/ui/AIModel;

    iget-object v4, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$3:Ljava/lang/String;

    iget-object v5, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v6, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$5:Landroid/content/Context;

    iget-object v7, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$6:Lcom/luchime/huiyuan/UsageStats;

    iget v8, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$7:I

    iget-object v9, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$8:Ljava/util/List;

    iget-object v10, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$9:Ljava/lang/String;

    iget-object v11, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$10:Landroidx/compose/runtime/MutableState;

    iget v12, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$11:I

    iget v13, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$12:I

    iget v14, v0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda11;->f$13:I

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v1 .. v15}, Lcom/luchime/huiyuan/ui/ProfileScreenKt;->ProfileScreen$lambda$36$lambda$35(ZLcom/luchime/huiyuan/LexiconEntry;Lcom/luchime/huiyuan/ui/AIModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lcom/luchime/huiyuan/UsageStats;ILjava/util/List;Ljava/lang/String;Landroidx/compose/runtime/MutableState;IIILandroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
