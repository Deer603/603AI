.class public final synthetic Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda22;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lcom/luchime/huiyuan/ui/ProfileScreenKt;"
    method = "ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10"
    proto = "(Landroid/content/Context;Lcom/luchime/huiyuan/ui/AIModel;Lcom/luchime/huiyuan/LexiconEntry;)Lkotlin/Unit;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/luchime/huiyuan/ui/AIModel;

.field public final synthetic f$2:Lcom/luchime/huiyuan/LexiconEntry;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/luchime/huiyuan/ui/AIModel;Lcom/luchime/huiyuan/LexiconEntry;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda22;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda22;->f$1:Lcom/luchime/huiyuan/ui/AIModel;

    iput-object p3, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda22;->f$2:Lcom/luchime/huiyuan/LexiconEntry;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda22;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda22;->f$1:Lcom/luchime/huiyuan/ui/AIModel;

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/ProfileScreenKt$$ExternalSyntheticLambda22;->f$2:Lcom/luchime/huiyuan/LexiconEntry;

    invoke-static {v0, v1, v2}, Lcom/luchime/huiyuan/ui/ProfileScreenKt;->ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10(Landroid/content/Context;Lcom/luchime/huiyuan/ui/AIModel;Lcom/luchime/huiyuan/LexiconEntry;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
