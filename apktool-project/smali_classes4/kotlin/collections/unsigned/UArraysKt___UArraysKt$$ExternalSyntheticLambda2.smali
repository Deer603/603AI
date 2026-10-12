.class public final synthetic Lkotlin/collections/unsigned/UArraysKt___UArraysKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lkotlin/collections/unsigned/UArraysKt___UArraysKt;"
    method = "withIndex_GBYM_sE$lambda$58$UArraysKt___UArraysKt"
    proto = "([B)Ljava/util/Iterator;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:[B


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/collections/unsigned/UArraysKt___UArraysKt$$ExternalSyntheticLambda2;->f$0:[B

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lkotlin/collections/unsigned/UArraysKt___UArraysKt$$ExternalSyntheticLambda2;->f$0:[B

    invoke-static {v0}, Lkotlin/collections/unsigned/UArraysKt___UArraysKt;->$r8$lambda$mBmt3ZSYhoqMn71ZbyMauS5VhEo([B)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
