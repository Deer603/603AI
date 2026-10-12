.class final Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingRegion$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ImeEditCommand.android.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt;->setComposingRegion(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;II)V
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
.field final synthetic $end:I

.field final synthetic $start:I


# direct methods
.method constructor <init>(II)V
    .locals 1

    iput p1, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingRegion$1;->$start:I

    iput p2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingRegion$1;->$end:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 174
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/text/input/TextFieldBuffer;

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingRegion$1;->invoke(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V
    .locals 10
    .param p1, "$this$edit"    # Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 177
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->hasComposition$foundation_release()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->commitComposition$foundation_release()V

    .line 182
    :cond_0
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingRegion$1;->$start:I

    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getLength()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v4

    .line 183
    .local v4, "clampedStart":I
    iget v0, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setComposingRegion$1;->$end:I

    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getLength()I

    move-result v1

    invoke-static {v0, v2, v1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v5

    .line 184
    .local v5, "clampedEnd":I
    if-eq v4, v5, :cond_2

    .line 186
    if-ge v4, v5, :cond_1

    .line 187
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    .end local p1    # "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .local v3, "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->setComposition$foundation_release$default(Landroidx/compose/foundation/text/input/TextFieldBuffer;IILjava/util/List;ILjava/lang/Object;)V

    goto :goto_0

    .line 189
    .end local v3    # "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .restart local p1    # "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    :cond_1
    move-object v3, p1

    .end local p1    # "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .restart local v3    # "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move v9, v5

    move v5, v4

    move v4, v9

    .local v4, "clampedEnd":I
    .local v5, "clampedStart":I
    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->setComposition$foundation_release$default(Landroidx/compose/foundation/text/input/TextFieldBuffer;IILjava/util/List;ILjava/lang/Object;)V

    move v9, v5

    move v5, v4

    move v4, v9

    .local v4, "clampedStart":I
    .local v5, "clampedEnd":I
    goto :goto_0

    .line 184
    .end local v3    # "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .restart local p1    # "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    :cond_2
    move-object v3, p1

    .line 191
    .end local p1    # "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    .restart local v3    # "$this$edit":Landroidx/compose/foundation/text/input/TextFieldBuffer;
    :goto_0
    return-void
.end method
