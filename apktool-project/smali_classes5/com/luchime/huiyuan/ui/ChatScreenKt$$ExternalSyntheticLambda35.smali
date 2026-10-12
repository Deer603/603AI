.class public final synthetic Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ChatScreenKt;"
    method = "ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40"
    proto = "(Ljava/util/List;Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/MutableState;Ljava/util/Set;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lcom/luchime/huiyuan/ui/AIModel;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Ljava/util/Set;

.field public final synthetic f$6:Landroid/content/Context;

.field public final synthetic f$7:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/MutableState;Ljava/util/Set;Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$1:Lcom/luchime/huiyuan/ui/AIModel;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$2:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$3:Z

    iput-object p5, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$5:Ljava/util/Set;

    iput-object p7, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$6:Landroid/content/Context;

    iput-object p8, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$7:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$1:Lcom/luchime/huiyuan/ui/AIModel;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$2:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$3:Z

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$5:Ljava/util/Set;

    iget-object v6, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$6:Landroid/content/Context;

    iget-object v7, p0, Lcom/luchime/huiyuan/ui/ChatScreenKt$$ExternalSyntheticLambda35;->f$7:Lkotlin/jvm/functions/Function2;

    move-object v8, p1

    check-cast v8, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static/range {v0 .. v8}, Lcom/luchime/huiyuan/ui/ChatScreenKt;->ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40(Ljava/util/List;Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/MutableState;Ljava/util/Set;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
