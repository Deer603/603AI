.class final Landroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1;
.super Ljava/lang/Object;
.source "Snackbar.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SnackbarKt;->OneRowSnackbar(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,383:1\n544#2,2:384\n33#2,6:386\n546#2:392\n544#2,2:393\n33#2,6:395\n546#2:401\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1\n*L\n324#1:384,2\n324#1:386,6\n324#1:392\n330#1:393,2\n330#1:395,6\n330#1:401\n*E\n"
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
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $actionTag:Ljava/lang/String;

.field final synthetic $textTag:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1;->$actionTag:Ljava/lang/String;

    iput-object p2, p0, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1;->$textTag:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 20
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

    .line 324
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1;->$actionTag:Ljava/lang/String;

    move-object/from16 v3, p2

    .local v3, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 384
    .local v4, "$i$f$fastFirst":I
    nop

    .line 385
    move-object v5, v3

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 386
    .local v6, "$i$f$fastForEach":I
    nop

    .line 387
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    const-string v9, "Collection contains no element matching the predicate."

    if-ge v7, v8, :cond_8

    .line 388
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 389
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 385
    .local v12, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .local v13, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v14, 0x0

    .line 324
    .local v14, "$i$a$-fastFirst-SnackbarKt$OneRowSnackbar$2$1$buttonPlaceable$1":I
    invoke-static {v13}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    .line 385
    .end local v13    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v14    # "$i$a$-fastFirst-SnackbarKt$OneRowSnackbar$2$1$buttonPlaceable$1":I
    if-eqz v13, :cond_7

    .line 392
    .end local v3    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastFirst":I
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    .end local v7    # "index$iv$iv":I
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v2, v11

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 324
    move-wide/from16 v10, p3

    invoke-interface {v2, v10, v11}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    .line 323
    move-object v6, v2

    .line 326
    .local v6, "buttonPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v10, v11}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {}, Landroidx/compose/material/SnackbarKt;->access$getTextEndExtraSpacing$p()F

    move-result v3

    invoke-interface {v1, v3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v3

    sub-int/2addr v2, v3

    .line 327
    invoke-static {v10, v11}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v3

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v13

    .line 325
    nop

    .line 329
    .local v13, "textMaxWidth":I
    nop

    .line 330
    iget-object v2, v0, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1;->$textTag:Ljava/lang/String;

    move-object/from16 v3, p2

    .restart local v3    # "$this$fastFirst$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 393
    .restart local v4    # "$i$f$fastFirst":I
    nop

    .line 394
    move-object v5, v3

    .restart local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 395
    .local v7, "$i$f$fastForEach":I
    nop

    .line 396
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v12

    :goto_1
    if-ge v8, v12, :cond_6

    .line 397
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 398
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 394
    .local v16, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object/from16 v17, v15

    check-cast v17, Landroidx/compose/ui/layout/Measurable;

    .local v17, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v18, 0x0

    .line 330
    .local v18, "$i$a$-fastFirst-SnackbarKt$OneRowSnackbar$2$1$textPlaceable$1":I
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 394
    .end local v17    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v18    # "$i$a$-fastFirst-SnackbarKt$OneRowSnackbar$2$1$textPlaceable$1":I
    if-eqz v0, :cond_5

    .line 401
    .end local v3    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastFirst":I
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    .end local v8    # "index$iv$iv":I
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v0, v15

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 331
    const/16 v16, 0x9

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {v0, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v4

    .line 328
    nop

    .line 333
    .local v4, "textPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v4, v0}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v0

    .line 334
    .local v0, "firstTextBaseline":I
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v4, v2}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v9

    .line 336
    .local v9, "lastTextBaseline":I
    const/high16 v3, -0x80000000

    const/4 v5, 0x1

    if-eq v0, v3, :cond_0

    .line 337
    if-eq v9, v3, :cond_0

    move v7, v5

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    .line 335
    :goto_2
    move v10, v7

    .line 338
    .local v10, "hasText":Z
    if-eq v0, v9, :cond_2

    if-nez v10, :cond_1

    goto :goto_3

    :cond_1
    const/4 v5, 0x0

    :cond_2
    :goto_3
    move v11, v5

    .line 339
    .local v11, "isOneLine":Z
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v5

    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v7

    sub-int v7, v5, v7

    .line 341
    .local v7, "buttonPlaceX":I
    const/4 v5, 0x0

    .line 342
    .local v5, "textPlaceY":I
    const/4 v8, 0x0

    .line 343
    .local v8, "containerHeight":I
    const/4 v12, 0x0

    .line 344
    .local v12, "buttonPlaceY":I
    if-eqz v11, :cond_4

    .line 345
    invoke-static {}, Landroidx/compose/material/SnackbarKt;->access$getSnackbarMinHeightOneLine$p()F

    move-result v14

    invoke-interface {v1, v14}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v14

    .line 346
    .local v14, "minContainerHeight":I
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v15

    .line 347
    .local v15, "contentHeight":I
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 348
    invoke-virtual {v4}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v16

    sub-int v16, v8, v16

    div-int/lit8 v16, v16, 0x2

    .line 349
    .end local v5    # "textPlaceY":I
    .local v16, "textPlaceY":I
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v5

    check-cast v5, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v6, v5}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v5

    .line 351
    .local v5, "buttonBaseline":I
    move/from16 v17, v5

    .local v17, "it":I
    const/16 v18, 0x0

    .line 352
    .local v18, "$i$a$-let-SnackbarKt$OneRowSnackbar$2$1$1":I
    move/from16 v2, v17

    .end local v17    # "it":I
    .local v2, "it":I
    if-eq v2, v3, :cond_3

    .line 353
    add-int v3, v16, v0

    sub-int/2addr v3, v2

    move/from16 v19, v3

    goto :goto_4

    .line 355
    :cond_3
    const/16 v19, 0x0

    .line 356
    :goto_4
    nop

    .line 351
    .end local v2    # "it":I
    .end local v18    # "$i$a$-let-SnackbarKt$OneRowSnackbar$2$1$1":I
    nop

    .line 350
    move v2, v8

    move/from16 v5, v16

    move/from16 v8, v19

    .end local v5    # "buttonBaseline":I
    .end local v12    # "buttonPlaceY":I
    .end local v14    # "minContainerHeight":I
    .end local v15    # "contentHeight":I
    .local v19, "buttonPlaceY":I
    goto :goto_5

    .line 359
    .end local v16    # "textPlaceY":I
    .end local v19    # "buttonPlaceY":I
    .local v5, "textPlaceY":I
    .restart local v12    # "buttonPlaceY":I
    :cond_4
    invoke-static {}, Landroidx/compose/material/SnackbarKt;->access$getHeightToFirstLine$p()F

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v2

    .line 360
    .local v2, "baselineOffset":I
    sub-int v16, v2, v0

    .line 361
    .end local v5    # "textPlaceY":I
    .restart local v16    # "textPlaceY":I
    invoke-static {}, Landroidx/compose/material/SnackbarKt;->access$getSnackbarMinHeightTwoLines$p()F

    move-result v3

    invoke-interface {v1, v3}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v3

    .line 362
    .local v3, "minContainerHeight":I
    invoke-virtual {v4}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v5

    add-int v5, v16, v5

    .line 363
    .local v5, "contentHeight":I
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 364
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v14

    sub-int v14, v8, v14

    div-int/lit8 v19, v14, 0x2

    move v2, v8

    move/from16 v5, v16

    move/from16 v8, v19

    .line 367
    .end local v3    # "minContainerHeight":I
    .end local v12    # "buttonPlaceY":I
    .end local v16    # "textPlaceY":I
    .local v2, "containerHeight":I
    .local v5, "textPlaceY":I
    .local v8, "buttonPlaceY":I
    :goto_5
    move v12, v2

    .end local v2    # "containerHeight":I
    .local v12, "containerHeight":I
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    new-instance v3, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1$2;

    invoke-direct/range {v3 .. v8}, Landroidx/compose/material/SnackbarKt$OneRowSnackbar$2$1$2;-><init>(Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;II)V

    move/from16 v16, v5

    move-object/from16 v17, v6

    move v14, v7

    move/from16 v19, v8

    move-object v8, v4

    .end local v4    # "textPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "textPlaceY":I
    .end local v6    # "buttonPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v7    # "buttonPlaceX":I
    .local v8, "textPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v14, "buttonPlaceX":I
    .restart local v16    # "textPlaceY":I
    .local v17, "buttonPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v19    # "buttonPlaceY":I
    move-object v5, v3

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move v3, v12

    .end local v12    # "containerHeight":I
    .local v3, "containerHeight":I
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v2

    .line 370
    .end local v3    # "containerHeight":I
    .restart local v12    # "containerHeight":I
    return-object v2

    .line 394
    .end local v0    # "firstTextBaseline":I
    .end local v9    # "lastTextBaseline":I
    .end local v10    # "hasText":Z
    .end local v11    # "isOneLine":Z
    .end local v12    # "containerHeight":I
    .end local v17    # "buttonPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v19    # "buttonPlaceY":I
    .local v3, "$this$fastFirst$iv":Ljava/util/List;
    .local v4, "$i$f$fastFirst":I
    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v6    # "buttonPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v7, "$i$f$fastForEach":I
    .local v8, "index$iv$iv":I
    .local v14, "item$iv$iv":Ljava/lang/Object;
    .local v15, "it$iv":Ljava/lang/Object;
    .local v16, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    :cond_5
    move-object/from16 v17, v6

    .line 398
    .end local v6    # "buttonPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v17    # "buttonPlaceable":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 396
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v10, p3

    goto/16 :goto_1

    .line 400
    .end local v8    # "index$iv$iv":I
    .end local v17    # "buttonPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v6    # "buttonPlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_6
    nop

    .line 401
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v9}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 389
    .end local v13    # "textMaxWidth":I
    .restart local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v6, "$i$f$fastForEach":I
    .local v7, "index$iv$iv":I
    .local v10, "item$iv$iv":Ljava/lang/Object;
    :cond_7
    nop

    .line 387
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_0

    .line 391
    .end local v7    # "index$iv$iv":I
    :cond_8
    nop

    .line 392
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v9}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
