.class final Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ImeEditCommand.android.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt;->deleteSurroundingText(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/foundation/text/input/TextFieldBuffer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nImeEditCommand.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n*L\n1#1,462:1\n96#2,5:463\n25#3,3:468\n32#3,4:471\n*S KotlinDebug\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1\n*L\n266#1:463,5\n273#1:468,3\n278#1:471,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/foundation/text/input/TextFieldBuffer;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $lengthAfterCursor:I

.field final synthetic $lengthBeforeCursor:I


# direct methods
.method constructor <init>(II)V
    .locals 1

    iput p1, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;->$lengthBeforeCursor:I

    iput p2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;->$lengthAfterCursor:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 265
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/text/input/TextFieldBuffer;

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;->invoke(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V
    .locals 8
    .param p1, "$this$edit"    # Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 266
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;->$lengthBeforeCursor:I

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    iget v0, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;->$lengthAfterCursor:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget v2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;->$lengthBeforeCursor:I

    iget v3, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;->$lengthAfterCursor:I

    .local v0, "value$iv":Z
    const/4 v4, 0x0

    .line 463
    .local v4, "$i$f$requirePrecondition":I
    nop

    .line 464
    if-nez v0, :cond_1

    .line 465
    const/4 v5, 0x0

    .line 267
    .local v5, "$i$a$-requirePrecondition-ImeEditCommand_androidKt$deleteSurroundingText$1$1":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 268
    nop

    .line 267
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 268
    nop

    .line 267
    const-string v6, " and "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 268
    nop

    .line 267
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 268
    nop

    .line 267
    const-string v3, " respectively."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 268
    nop

    .line 465
    .end local v5    # "$i$a$-requirePrecondition-ImeEditCommand_androidKt$deleteSurroundingText$1$1":I
    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 467
    :cond_1
    nop

    .line 273
    .end local v0    # "value$iv":Z
    .end local v4    # "$i$f$requirePrecondition":I
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v0

    .local v0, "$this$addExactOrElse$iv":I
    iget v2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;->$lengthAfterCursor:I

    .local v2, "right$iv":I
    const/4 v3, 0x0

    .line 468
    .local v3, "$i$f$addExactOrElse":I
    add-int v4, v0, v2

    .line 470
    .local v4, "result$iv":I
    xor-int v5, v0, v4

    xor-int v6, v2, v4

    and-int/2addr v5, v6

    if-gez v5, :cond_2

    const/4 v5, 0x0

    .line 273
    .local v5, "$i$a$-addExactOrElse-ImeEditCommand_androidKt$deleteSurroundingText$1$end$1":I
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getLength()I

    move-result v5

    .line 470
    .end local v5    # "$i$a$-addExactOrElse-ImeEditCommand_androidKt$deleteSurroundingText$1$end$1":I
    move v4, v5

    .line 273
    .end local v0    # "$this$addExactOrElse$iv":I
    .end local v2    # "right$iv":I
    .end local v3    # "$i$f$addExactOrElse":I
    .end local v4    # "result$iv":I
    :cond_2
    nop

    .line 274
    .local v4, "end":I
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getLength()I

    move-result v2

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {p1, v0, v2}, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt;->imeDelete(Landroidx/compose/foundation/text/input/TextFieldBuffer;II)V

    .line 278
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v0

    .local v0, "$this$subtractExactOrElse$iv":I
    iget v2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$deleteSurroundingText$1;->$lengthBeforeCursor:I

    .restart local v2    # "right$iv":I
    const/4 v3, 0x0

    .line 471
    .local v3, "$i$f$subtractExactOrElse":I
    sub-int v5, v0, v2

    .line 474
    .local v5, "result$iv":I
    xor-int v6, v0, v2

    xor-int v7, v0, v5

    and-int/2addr v6, v7

    if-gez v6, :cond_3

    const/4 v6, 0x0

    .line 278
    .local v6, "$i$a$-subtractExactOrElse-ImeEditCommand_androidKt$deleteSurroundingText$1$start$1":I
    nop

    .line 474
    .end local v6    # "$i$a$-subtractExactOrElse-ImeEditCommand_androidKt$deleteSurroundingText$1$start$1":I
    move v5, v1

    .line 278
    .end local v0    # "$this$subtractExactOrElse$iv":I
    .end local v2    # "right$iv":I
    .end local v3    # "$i$f$subtractExactOrElse":I
    .end local v5    # "result$iv":I
    :cond_3
    nop

    .line 279
    .local v5, "start":I
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v1

    invoke-static {p1, v0, v1}, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt;->imeDelete(Landroidx/compose/foundation/text/input/TextFieldBuffer;II)V

    .line 280
    return-void
.end method
