.class final Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "AlertDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,464:1\n69#2,4:465\n69#2,6:469\n74#2:475\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2\n*L\n429#1:465,4\n445#1:469,6\n429#1:475\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "invoke"
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
.field final synthetic $crossAxisPositions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mainAxisLayoutSize:I

.field final synthetic $mainAxisSpacing:F

.field final synthetic $sequences:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $this_Layout:Landroidx/compose/ui/layout/MeasureScope;


# direct methods
.method constructor <init>(Ljava/util/List;Landroidx/compose/ui/layout/MeasureScope;FILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;>;",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "FI",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$sequences:Ljava/util/List;

    iput-object p2, p0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$this_Layout:Landroidx/compose/ui/layout/MeasureScope;

    iput p3, p0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$mainAxisSpacing:F

    iput p4, p0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$mainAxisLayoutSize:I

    iput-object p5, p0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$crossAxisPositions:Ljava/util/List;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 428
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, v0}, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 29
    .param p1, "$this$layout"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 429
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$sequences:Ljava/util/List;

    .local v1, "$this$fastForEachIndexed$iv":Ljava/util/List;
    iget-object v2, v0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$this_Layout:Landroidx/compose/ui/layout/MeasureScope;

    iget v3, v0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$mainAxisSpacing:F

    iget v6, v0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$mainAxisLayoutSize:I

    iget-object v10, v0, Landroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$crossAxisPositions:Ljava/util/List;

    const/4 v11, 0x0

    .line 465
    .local v11, "$i$f$fastForEachIndexed":I
    nop

    .line 466
    const/4 v4, 0x0

    .local v4, "index$iv":I
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v12

    move v13, v4

    .end local v4    # "index$iv":I
    .local v13, "index$iv":I
    :goto_0
    if-ge v13, v12, :cond_4

    .line 467
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 468
    .local v14, "item$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/util/List;

    .local v15, "placeables":Ljava/util/List;
    move v4, v13

    .local v4, "i":I
    const/16 v16, 0x0

    .line 431
    .local v16, "$i$a$-fastForEachIndexed-AlertDialogKt$AlertDialogFlowRow$1$1$2$1":I
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v5

    new-array v7, v5, [I

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v5, :cond_1

    .line 432
    invoke-interface {v15, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroidx/compose/ui/layout/Placeable;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v17

    .line 433
    const/16 v18, 0x0

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v8

    if-ge v9, v8, :cond_0

    invoke-interface {v2, v3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v8

    goto :goto_2

    :cond_0
    move/from16 v8, v18

    .line 432
    :goto_2
    add-int v17, v17, v8

    aput v17, v7, v9

    add-int/lit8 v9, v9, 0x1

    .line 431
    goto :goto_1

    .line 430
    :cond_1
    const/16 v18, 0x0

    .line 435
    .local v7, "childrenMainAxisSizes":[I
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v17

    .line 436
    .local v17, "arrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    array-length v5, v7

    new-array v9, v5, [I

    move/from16 v8, v18

    :goto_3
    if-ge v8, v5, :cond_2

    aput v18, v9, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 437
    .local v9, "mainAxisPositions":[I
    :cond_2
    move v5, v4

    .end local v4    # "i":I
    .local v5, "i":I
    move-object/from16 v4, v17

    .local v4, "$this$invoke_u24lambda_u242_u24lambda_u240":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const/16 v18, 0x0

    .line 438
    .local v18, "$i$a$-with-AlertDialogKt$AlertDialogFlowRow$1$1$2$1$1":I
    move v8, v5

    .end local v5    # "i":I
    .local v8, "i":I
    move-object v5, v2

    check-cast v5, Landroidx/compose/ui/unit/Density;

    .line 439
    nop

    .line 440
    nop

    .line 441
    move/from16 v19, v8

    .end local v8    # "i":I
    .local v19, "i":I
    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v8

    .line 442
    nop

    .line 438
    move/from16 v0, v19

    .end local v19    # "i":I
    .local v0, "i":I
    invoke-interface/range {v4 .. v9}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 444
    nop

    .line 437
    .end local v4    # "$this$invoke_u24lambda_u242_u24lambda_u240":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v18    # "$i$a$-with-AlertDialogKt$AlertDialogFlowRow$1$1$2$1$1":I
    nop

    .line 445
    move-object v4, v15

    .local v4, "$this$fastForEachIndexed$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 469
    .local v5, "$i$f$fastForEachIndexed":I
    nop

    .line 470
    const/4 v8, 0x0

    move-object/from16 v18, v1

    .end local v1    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .local v8, "index$iv":I
    .local v18, "$this$fastForEachIndexed$iv":Ljava/util/List;
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    :goto_4
    if-ge v8, v1, :cond_3

    .line 471
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 472
    .local v19, "item$iv":Ljava/lang/Object;
    move-object/from16 v21, v19

    check-cast v21, Landroidx/compose/ui/layout/Placeable;

    .local v21, "placeable":Landroidx/compose/ui/layout/Placeable;
    move/from16 v27, v8

    .local v27, "j":I
    const/16 v28, 0x0

    .line 446
    .local v28, "$i$a$-fastForEachIndexed-AlertDialogKt$AlertDialogFlowRow$1$1$2$1$2":I
    aget v22, v9, v27

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Ljava/lang/Number;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Number;->intValue()I

    move-result v23

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, p1

    invoke-static/range {v20 .. v26}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 447
    nop

    .line 472
    .end local v21    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v27    # "j":I
    .end local v28    # "$i$a$-fastForEachIndexed-AlertDialogKt$AlertDialogFlowRow$1$1$2$1$2":I
    nop

    .line 470
    .end local v19    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 474
    .end local v8    # "index$iv":I
    :cond_3
    nop

    .line 448
    .end local v4    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEachIndexed":I
    nop

    .line 468
    .end local v0    # "i":I
    .end local v7    # "childrenMainAxisSizes":[I
    .end local v9    # "mainAxisPositions":[I
    .end local v15    # "placeables":Ljava/util/List;
    .end local v16    # "$i$a$-fastForEachIndexed-AlertDialogKt$AlertDialogFlowRow$1$1$2$1":I
    .end local v17    # "arrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    nop

    .line 466
    .end local v14    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    goto/16 :goto_0

    .line 475
    .end local v13    # "index$iv":I
    .end local v18    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .restart local v1    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    :cond_4
    nop

    .line 449
    .end local v1    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .end local v11    # "$i$f$fastForEachIndexed":I
    return-void
.end method
