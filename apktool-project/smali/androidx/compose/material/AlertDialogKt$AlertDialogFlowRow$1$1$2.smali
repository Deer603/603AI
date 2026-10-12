.class final Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "AlertDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
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
    value = "SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,452:1\n69#2,4:453\n69#2,6:457\n74#2:463\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2\n*L\n422#1:453,4\n435#1:457,6\n422#1:463\n*E\n"
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
        0x9,
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

    iput-object p1, p0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$sequences:Ljava/util/List;

    iput-object p2, p0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$this_Layout:Landroidx/compose/ui/layout/MeasureScope;

    iput p3, p0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$mainAxisSpacing:F

    iput p4, p0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$mainAxisLayoutSize:I

    iput-object p5, p0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$crossAxisPositions:Ljava/util/List;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 421
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, v0}, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 29
    .param p1, "$this$layout"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 422
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$sequences:Ljava/util/List;

    .local v1, "$this$fastForEachIndexed$iv":Ljava/util/List;
    iget-object v2, v0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$this_Layout:Landroidx/compose/ui/layout/MeasureScope;

    iget v3, v0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$mainAxisSpacing:F

    iget v4, v0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$mainAxisLayoutSize:I

    iget-object v5, v0, Landroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$1$2;->$crossAxisPositions:Ljava/util/List;

    const/4 v6, 0x0

    .line 453
    .local v6, "$i$f$fastForEachIndexed":I
    nop

    .line 454
    const/4 v7, 0x0

    .local v7, "index$iv":I
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_3

    .line 455
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 456
    .local v9, "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/util/List;

    .local v10, "placeables":Ljava/util/List;
    move v11, v7

    .local v11, "i":I
    const/4 v12, 0x0

    .line 424
    .local v12, "$i$a$-fastForEachIndexed-AlertDialogKt$AlertDialogFlowRow$1$1$2$1":I
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v13

    new-array v14, v13, [I

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_1

    .line 425
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroidx/compose/ui/layout/Placeable;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v17

    .line 426
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    if-ge v15, v0, :cond_0

    invoke-interface {v2, v3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 425
    :goto_2
    add-int v17, v17, v0

    aput v17, v14, v15

    .line 424
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    goto :goto_1

    .line 423
    :cond_1
    nop

    .line 428
    .local v14, "childrenMainAxisSizes":[I
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getBottom()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    .line 431
    .local v0, "arrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    array-length v13, v14

    new-array v13, v13, [I

    .line 432
    .local v13, "mainAxisPositions":[I
    move-object v15, v0

    .local v15, "$this$invoke_u24lambda_u242_u24lambda_u240":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    const/16 v16, 0x0

    .line 433
    .local v16, "$i$a$-with-AlertDialogKt$AlertDialogFlowRow$1$1$2$1$1":I
    move-object/from16 v17, v0

    .end local v0    # "arrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v17, "arrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    move-object v0, v2

    check-cast v0, Landroidx/compose/ui/unit/Density;

    invoke-interface {v15, v0, v4, v14, v13}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 434
    nop

    .line 432
    .end local v15    # "$this$invoke_u24lambda_u242_u24lambda_u240":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v16    # "$i$a$-with-AlertDialogKt$AlertDialogFlowRow$1$1$2$1$1":I
    nop

    .line 435
    move-object v0, v10

    .local v0, "$this$fastForEachIndexed$iv":Ljava/util/List;
    const/4 v15, 0x0

    .line 457
    .local v15, "$i$f$fastForEachIndexed":I
    nop

    .line 458
    const/16 v16, 0x0

    move-object/from16 v18, v1

    .end local v1    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .local v16, "index$iv":I
    .local v18, "$this$fastForEachIndexed$iv":Ljava/util/List;
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move-object/from16 v19, v2

    move/from16 v2, v16

    .end local v16    # "index$iv":I
    .local v2, "index$iv":I
    :goto_3
    if-ge v2, v1, :cond_2

    .line 459
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 460
    .local v16, "item$iv":Ljava/lang/Object;
    move-object/from16 v21, v16

    check-cast v21, Landroidx/compose/ui/layout/Placeable;

    .local v21, "placeable":Landroidx/compose/ui/layout/Placeable;
    move/from16 v27, v2

    .local v27, "j":I
    const/16 v28, 0x0

    .line 436
    .local v28, "$i$a$-fastForEachIndexed-AlertDialogKt$AlertDialogFlowRow$1$1$2$1$2":I
    aget v22, v13, v27

    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Ljava/lang/Number;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Number;->intValue()I

    move-result v23

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, p1

    invoke-static/range {v20 .. v26}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 437
    nop

    .line 460
    .end local v21    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v27    # "j":I
    .end local v28    # "$i$a$-fastForEachIndexed-AlertDialogKt$AlertDialogFlowRow$1$1$2$1$2":I
    nop

    .line 458
    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 462
    .end local v2    # "index$iv":I
    :cond_2
    nop

    .line 438
    .end local v0    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .end local v15    # "$i$f$fastForEachIndexed":I
    nop

    .line 456
    .end local v10    # "placeables":Ljava/util/List;
    .end local v11    # "i":I
    .end local v12    # "$i$a$-fastForEachIndexed-AlertDialogKt$AlertDialogFlowRow$1$1$2$1":I
    .end local v13    # "mainAxisPositions":[I
    .end local v14    # "childrenMainAxisSizes":[I
    .end local v17    # "arrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    nop

    .line 454
    .end local v9    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    goto/16 :goto_0

    .line 463
    .end local v7    # "index$iv":I
    .end local v18    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .restart local v1    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    :cond_3
    nop

    .line 439
    .end local v1    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEachIndexed":I
    return-void
.end method
