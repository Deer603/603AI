.class public final synthetic Lkotlin/text/StringsKt___StringsKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation runtime Lcom/android/tools/r8/annotations/LambdaMethod;
    holder = "Lkotlin/text/StringsKt___StringsKt;"
    method = "windowedSequence$lambda$25$StringsKt___StringsKt"
    proto = "(ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;I)Ljava/lang/Object;"
.end annotation

.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    apiLevel = -0x2
    kind = 0x1c
    versionHash = "3b119036505a817327d30bbe4a430e8676906c2ab0a3363856806bcd3b289007"
.end annotation


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Ljava/lang/CharSequence;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lkotlin/text/StringsKt___StringsKt$$ExternalSyntheticLambda4;->f$0:I

    iput-object p2, p0, Lkotlin/text/StringsKt___StringsKt$$ExternalSyntheticLambda4;->f$1:Ljava/lang/CharSequence;

    iput-object p3, p0, Lkotlin/text/StringsKt___StringsKt$$ExternalSyntheticLambda4;->f$2:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget v0, p0, Lkotlin/text/StringsKt___StringsKt$$ExternalSyntheticLambda4;->f$0:I

    iget-object v1, p0, Lkotlin/text/StringsKt___StringsKt$$ExternalSyntheticLambda4;->f$1:Ljava/lang/CharSequence;

    iget-object v2, p0, Lkotlin/text/StringsKt___StringsKt$$ExternalSyntheticLambda4;->f$2:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lkotlin/text/StringsKt___StringsKt;->$r8$lambda$oReEvkBVk37EYcav8mOOaXfOBr0(ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
