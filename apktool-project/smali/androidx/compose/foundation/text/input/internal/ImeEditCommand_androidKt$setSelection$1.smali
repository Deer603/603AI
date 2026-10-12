.class final Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ImeEditCommand.android.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt;->setSelection(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;II)V
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
    value = "SMAP\nImeEditCommand.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,462:1\n101#2,10:463\n101#2,10:473\n*S KotlinDebug\n*F\n+ 1 ImeEditCommand.android.kt\nandroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1\n*L\n363#1:463,10\n364#1:473,10\n*E\n"
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

.field final synthetic $this_setSelection:Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;II)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1;->$this_setSelection:Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;

    iput p2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1;->$start:I

    iput p3, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1;->$end:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 359
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/text/input/TextFieldBuffer;

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1;->invoke(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V
    .locals 9
    .param p1, "$this$edit"    # Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 361
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1;->$this_setSelection:Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getLength()I

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;->mapToTransformed-GEjPoXI(J)J

    move-result-wide v0

    .line 363
    .local v0, "transformedSpaceLength":J
    iget v2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1;->$start:I

    .local v2, "$this$fastCoerceIn$iv":I
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v3

    .local v3, "minimumValue$iv":I
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v4

    .local v4, "maximumValue$iv":I
    const/4 v5, 0x0

    .line 463
    .local v5, "$i$f$fastCoerceIn":I
    move v6, v2

    .local v6, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v7, 0x0

    .line 467
    .local v7, "$i$f$fastCoerceAtLeast":I
    if-ge v6, v3, :cond_0

    move v6, v3

    .line 463
    .end local v6    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v7    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    nop

    .local v6, "$this$fastCoerceAtMost$iv$iv":I
    const/4 v7, 0x0

    .line 472
    .local v7, "$i$f$fastCoerceAtMost":I
    if-le v6, v4, :cond_1

    move v6, v4

    .line 463
    .end local v6    # "$this$fastCoerceAtMost$iv$iv":I
    .end local v7    # "$i$f$fastCoerceAtMost":I
    :cond_1
    nop

    .line 363
    .end local v2    # "$this$fastCoerceIn$iv":I
    .end local v3    # "minimumValue$iv":I
    .end local v4    # "maximumValue$iv":I
    .end local v5    # "$i$f$fastCoerceIn":I
    nop

    .line 364
    .local v6, "clampedStart":I
    iget v2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1;->$end:I

    .restart local v2    # "$this$fastCoerceIn$iv":I
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    move-result v3

    .restart local v3    # "minimumValue$iv":I
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    move-result v4

    .restart local v4    # "maximumValue$iv":I
    const/4 v5, 0x0

    .line 473
    .restart local v5    # "$i$f$fastCoerceIn":I
    move v7, v2

    .local v7, "$this$fastCoerceAtLeast$iv$iv":I
    const/4 v8, 0x0

    .line 477
    .local v8, "$i$f$fastCoerceAtLeast":I
    if-ge v7, v3, :cond_2

    move v7, v3

    .line 473
    .end local v7    # "$this$fastCoerceAtLeast$iv$iv":I
    .end local v8    # "$i$f$fastCoerceAtLeast":I
    :cond_2
    nop

    .local v7, "$this$fastCoerceAtMost$iv$iv":I
    const/4 v8, 0x0

    .line 482
    .local v8, "$i$f$fastCoerceAtMost":I
    if-le v7, v4, :cond_3

    move v7, v4

    .line 473
    .end local v7    # "$this$fastCoerceAtMost$iv$iv":I
    .end local v8    # "$i$f$fastCoerceAtMost":I
    :cond_3
    nop

    .line 364
    .end local v2    # "$this$fastCoerceIn$iv":I
    .end local v3    # "minimumValue$iv":I
    .end local v4    # "maximumValue$iv":I
    .end local v5    # "$i$f$fastCoerceIn":I
    nop

    .line 365
    .local v7, "clampedEnd":I
    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/ImeEditCommand_androidKt$setSelection$1;->$this_setSelection:Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;

    invoke-static {v6, v7}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;->mapFromTransformed-GEjPoXI(J)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->setSelection-5zc-tL8(J)V

    .line 366
    return-void
.end method
