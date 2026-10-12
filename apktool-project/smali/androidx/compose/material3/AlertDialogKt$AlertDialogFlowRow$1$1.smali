.class final Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;
.super Ljava/lang/Object;
.source "AlertDialog.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/AlertDialogKt;->AlertDialogFlowRow-ixp7dh8(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,464:1\n33#2,6:465\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1\n*L\n402#1:465,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $crossAxisSpacing:F

.field final synthetic $mainAxisSpacing:F


# direct methods
.method constructor <init>(FF)V
    .locals 0

    iput p1, p0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->$mainAxisSpacing:F

    iput p2, p0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->$crossAxisSpacing:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final measure_3p2s80s$canAddToCurrentSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FJLandroidx/compose/ui/layout/Placeable;)Z
    .locals 2
    .param p0, "currentSequence"    # Ljava/util/List;
    .param p1, "currentMainAxisSize"    # Lkotlin/jvm/internal/Ref$IntRef;
    .param p2, "$this_Layout"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p3, "$mainAxisSpacing"    # F
    .param p4, "$constraints"    # J
    .param p6, "placeable"    # Landroidx/compose/ui/layout/Placeable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "FJ",
            "Landroidx/compose/ui/layout/Placeable;",
            ")Z"
        }
    .end annotation

    .line 380
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 381
    iget v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v1

    add-int/2addr v0, v1

    .line 382
    invoke-static {p4, p5}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v1

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private static final measure_3p2s80s$startNewSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V
    .locals 3
    .param p0, "sequences"    # Ljava/util/List;
    .param p1, "crossAxisSpace"    # Lkotlin/jvm/internal/Ref$IntRef;
    .param p2, "$this_Layout"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p3, "$crossAxisSpacing"    # F
    .param p4, "currentSequence"    # Ljava/util/List;
    .param p5, "crossAxisSizes"    # Ljava/util/List;
    .param p6, "currentCrossAxisSize"    # Lkotlin/jvm/internal/Ref$IntRef;
    .param p7, "crossAxisPositions"    # Ljava/util/List;
    .param p8, "mainAxisSpace"    # Lkotlin/jvm/internal/Ref$IntRef;
    .param p9, "currentMainAxisSize"    # Lkotlin/jvm/internal/Ref$IntRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;>;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "F",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            ")V"
        }
    .end annotation

    .line 386
    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 387
    iget v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {p2, p3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 390
    :cond_0
    move-object v0, p4

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p0, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 391
    move-object v0, p5

    check-cast v0, Ljava/util/Collection;

    iget v2, p6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 392
    move-object v0, p7

    check-cast v0, Ljava/util/Collection;

    iget v2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 394
    iget v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v2, p6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr v0, v2

    iput v0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 395
    iget v0, p8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v2, p9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 397
    invoke-interface {p4}, Ljava/util/List;->clear()V

    .line 398
    iput v1, p9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 399
    iput v1, p6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 400
    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 31
    .param p1, "$this$Layout"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "constraints"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 367
    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 368
    .local v2, "sequences":Ljava/util/List;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v1

    check-cast v7, Ljava/util/List;

    .line 369
    .local v7, "crossAxisSizes":Ljava/util/List;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v9, v1

    check-cast v9, Ljava/util/List;

    .line 371
    .local v9, "crossAxisPositions":Ljava/util/List;
    new-instance v10, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 372
    .local v10, "mainAxisSpace":Lkotlin/jvm/internal/Ref$IntRef;
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 374
    .local v3, "crossAxisSpace":Lkotlin/jvm/internal/Ref$IntRef;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v6, v1

    check-cast v6, Ljava/util/List;

    .line 375
    .local v6, "currentSequence":Ljava/util/List;
    new-instance v11, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 376
    .local v11, "currentMainAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    new-instance v8, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 402
    .local v8, "currentCrossAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    iget v14, v0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->$mainAxisSpacing:F

    iget v5, v0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->$crossAxisSpacing:F

    move-object/from16 v1, p2

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/16 v18, 0x0

    .line 465
    .local v18, "$i$f$fastForEach":I
    nop

    .line 466
    const/4 v4, 0x0

    .local v4, "index$iv":I
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v12

    :goto_0
    if-ge v4, v12, :cond_2

    .line 467
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 468
    .local v19, "item$iv":Ljava/lang/Object;
    move-object/from16 v13, v19

    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .local v13, "measurable":Landroidx/compose/ui/layout/Measurable;
    const/16 v20, 0x0

    .line 404
    .local v20, "$i$a$-fastForEach-AlertDialogKt$AlertDialogFlowRow$1$1$1":I
    move-object/from16 v22, v1

    move-object/from16 v21, v2

    move-wide/from16 v1, p3

    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "sequences":Ljava/util/List;
    .local v21, "sequences":Ljava/util/List;
    .local v22, "$this$fastForEach$iv":Ljava/util/List;
    invoke-interface {v13, v1, v2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v17

    .line 407
    .local v17, "placeable":Landroidx/compose/ui/layout/Placeable;
    move-wide v15, v1

    move v1, v12

    move-object/from16 v23, v13

    move-object/from16 v13, p1

    move-object v12, v11

    move-object v11, v6

    .end local v6    # "currentSequence":Ljava/util/List;
    .end local v13    # "measurable":Landroidx/compose/ui/layout/Measurable;
    .local v11, "currentSequence":Ljava/util/List;
    .local v12, "currentMainAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    .local v23, "measurable":Landroidx/compose/ui/layout/Measurable;
    invoke-static/range {v11 .. v17}, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->measure_3p2s80s$canAddToCurrentSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FJLandroidx/compose/ui/layout/Placeable;)Z

    move-result v2

    move-object v11, v12

    move-object/from16 v12, v17

    .end local v17    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v6    # "currentSequence":Ljava/util/List;
    .local v11, "currentMainAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    .local v12, "placeable":Landroidx/compose/ui/layout/Placeable;
    if-nez v2, :cond_0

    move v13, v4

    move-object/from16 v2, v21

    move-object/from16 v4, p1

    .end local v4    # "index$iv":I
    .end local v21    # "sequences":Ljava/util/List;
    .restart local v2    # "sequences":Ljava/util/List;
    .local v13, "index$iv":I
    invoke-static/range {v2 .. v11}, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->measure_3p2s80s$startNewSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V

    goto :goto_1

    .end local v2    # "sequences":Ljava/util/List;
    .end local v13    # "index$iv":I
    .restart local v4    # "index$iv":I
    .restart local v21    # "sequences":Ljava/util/List;
    :cond_0
    move v13, v4

    move-object/from16 v2, v21

    .line 410
    .end local v4    # "index$iv":I
    .end local v21    # "sequences":Ljava/util/List;
    .restart local v2    # "sequences":Ljava/util/List;
    .restart local v13    # "index$iv":I
    :goto_1
    move-object v4, v6

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    .line 411
    iget v4, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object/from16 v15, p1

    invoke-interface {v15, v14}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v16

    add-int v4, v4, v16

    iput v4, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    goto :goto_2

    .line 410
    :cond_1
    move-object/from16 v15, p1

    .line 413
    :goto_2
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 414
    iget v4, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v12}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v16

    add-int v4, v4, v16

    iput v4, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 415
    iget v4, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move/from16 v16, v1

    invoke-virtual {v12}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 416
    nop

    .line 468
    .end local v12    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v20    # "$i$a$-fastForEach-AlertDialogKt$AlertDialogFlowRow$1$1$1":I
    .end local v23    # "measurable":Landroidx/compose/ui/layout/Measurable;
    nop

    .line 466
    .end local v19    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v13, 0x1

    move/from16 v12, v16

    move-object/from16 v1, v22

    .end local v13    # "index$iv":I
    .restart local v4    # "index$iv":I
    goto :goto_0

    .end local v22    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v1    # "$this$fastForEach$iv":Ljava/util/List;
    :cond_2
    move-object/from16 v15, p1

    move-object/from16 v22, v1

    move v13, v4

    .line 470
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "index$iv":I
    .restart local v22    # "$this$fastForEach$iv":Ljava/util/List;
    nop

    .line 418
    .end local v18    # "$i$f$fastForEach":I
    .end local v22    # "$this$fastForEach$iv":Ljava/util/List;
    move-object v1, v6

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget v5, v0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->$crossAxisSpacing:F

    move-object v4, v15

    invoke-static/range {v2 .. v11}, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->measure_3p2s80s$startNewSequence(Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Landroidx/compose/ui/layout/MeasureScope;FLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;)V

    move-object v1, v7

    move-object v13, v8

    move-object v12, v11

    move-object v8, v3

    move-object v11, v6

    .end local v3    # "crossAxisSpace":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v6    # "currentSequence":Ljava/util/List;
    .end local v7    # "crossAxisSizes":Ljava/util/List;
    .local v1, "crossAxisSizes":Ljava/util/List;
    .local v8, "crossAxisSpace":Lkotlin/jvm/internal/Ref$IntRef;
    .local v11, "currentSequence":Ljava/util/List;
    .local v12, "currentMainAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    .local v13, "currentCrossAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    goto :goto_3

    .end local v1    # "crossAxisSizes":Ljava/util/List;
    .end local v12    # "currentMainAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v13    # "currentCrossAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v3    # "crossAxisSpace":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v6    # "currentSequence":Ljava/util/List;
    .restart local v7    # "crossAxisSizes":Ljava/util/List;
    .local v8, "currentCrossAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    .local v11, "currentMainAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    :cond_3
    move-object v1, v7

    move-object v13, v8

    move-object v12, v11

    move-object v8, v3

    move-object v11, v6

    .line 420
    .end local v3    # "crossAxisSpace":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v6    # "currentSequence":Ljava/util/List;
    .end local v7    # "crossAxisSizes":Ljava/util/List;
    .restart local v1    # "crossAxisSizes":Ljava/util/List;
    .local v8, "crossAxisSpace":Lkotlin/jvm/internal/Ref$IntRef;
    .local v11, "currentSequence":Ljava/util/List;
    .restart local v12    # "currentMainAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v13    # "currentCrossAxisSize":Lkotlin/jvm/internal/Ref$IntRef;
    :goto_3
    iget v3, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 422
    .local v6, "mainAxisLayoutSize":I
    iget v3, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 424
    .local v14, "crossAxisLayoutSize":I
    move/from16 v25, v6

    .line 426
    .local v25, "layoutWidth":I
    move/from16 v26, v14

    .line 428
    .local v26, "layoutHeight":I
    move-object v3, v2

    .end local v2    # "sequences":Ljava/util/List;
    .local v3, "sequences":Ljava/util/List;
    new-instance v2, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;

    iget v5, v0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->$mainAxisSpacing:F

    move-object/from16 v4, p1

    move-object v7, v9

    .end local v9    # "crossAxisPositions":Ljava/util/List;
    .local v7, "crossAxisPositions":Ljava/util/List;
    invoke-direct/range {v2 .. v7}, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;-><init>(Ljava/util/List;Landroidx/compose/ui/layout/MeasureScope;FILjava/util/List;)V

    move-object v9, v3

    move-object v3, v2

    move-object v2, v9

    move-object v9, v7

    .end local v3    # "sequences":Ljava/util/List;
    .end local v7    # "crossAxisPositions":Ljava/util/List;
    .restart local v2    # "sequences":Ljava/util/List;
    .restart local v9    # "crossAxisPositions":Ljava/util/List;
    move-object/from16 v28, v3

    check-cast v28, Lkotlin/jvm/functions/Function1;

    const/16 v29, 0x4

    const/16 v30, 0x0

    const/16 v27, 0x0

    move-object/from16 v24, p1

    invoke-static/range {v24 .. v30}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v3

    return-object v3
.end method
