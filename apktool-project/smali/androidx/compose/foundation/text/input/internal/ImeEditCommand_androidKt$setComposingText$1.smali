.class final Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ImeEditCommand.android.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt;->setComposingText(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;Ljava/lang/String;ILjava/util/List;)V
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
.field final synthetic $annotations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/AnnotatedString$Annotation;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $newCursorPosition:I

.field final synthetic $text:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/AnnotatedString$Annotation;",
            ">;>;I)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$text:Ljava/lang/String;

    iput-object p2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$annotations:Ljava/util/List;

    iput p3, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$newCursorPosition:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 209
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/text/input/TextFieldBuffer;

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->invoke(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V
    .locals 6
    .param p1, "$this$edit"    # Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 210
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getComposition-MzsxiRA$foundation_release()Landroidx/compose/ui/text/TextRange;

    move-result-object v0

    .line 211
    .local v0, "compositionRange":Landroidx/compose/ui/text/TextRange;
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 213
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v3

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v4

    iget-object v5, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$text:Ljava/lang/String;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {p1, v3, v4, v5}, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt;->imeReplace(Landroidx/compose/foundation/text/input/TextFieldBuffer;IILjava/lang/CharSequence;)V

    .line 214
    iget-object v3, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$text:Ljava/lang/String;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz v3, :cond_3

    .line 215
    nop

    .line 216
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v3

    .line 217
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v4

    iget-object v5, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$text:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    .line 218
    iget-object v5, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$annotations:Ljava/util/List;

    .line 215
    invoke-virtual {p1, v3, v4, v5}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->setComposition$foundation_release(IILjava/util/List;)V

    goto :goto_2

    .line 224
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v3

    .line 225
    .local v3, "initialSelectionStart":I
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v4

    iget-object v5, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$text:Ljava/lang/String;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {p1, v3, v4, v5}, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt;->imeReplace(Landroidx/compose/foundation/text/input/TextFieldBuffer;IILjava/lang/CharSequence;)V

    .line 226
    iget-object v4, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$text:Ljava/lang/String;

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_2

    move v4, v1

    goto :goto_1

    :cond_2
    move v4, v2

    :goto_1
    if-eqz v4, :cond_3

    .line 227
    iget-object v4, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$text:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v3

    iget-object v5, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$annotations:Ljava/util/List;

    invoke-virtual {p1, v3, v4, v5}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->setComposition$foundation_release(IILjava/util/List;)V

    .line 233
    .end local v3    # "initialSelectionStart":I
    :cond_3
    :goto_2
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getSelection-d9O1mEE()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v3

    .line 237
    .local v3, "newCursor":I
    iget v4, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$newCursorPosition:I

    .line 240
    iget v5, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$newCursorPosition:I

    .line 237
    if-lez v4, :cond_4

    .line 238
    add-int/2addr v5, v3

    sub-int/2addr v5, v1

    goto :goto_3

    .line 240
    :cond_4
    add-int/2addr v5, v3

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingText$1;->$text:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v5, v1

    .line 237
    :goto_3
    nop

    .line 236
    nop

    .line 243
    .local v5, "newCursorInBuffer":I
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getLength()I

    move-result v1

    invoke-static {v5, v2, v1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->setSelection-5zc-tL8(J)V

    .line 244
    return-void
.end method
