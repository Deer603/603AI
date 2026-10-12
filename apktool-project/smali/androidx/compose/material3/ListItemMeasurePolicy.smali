.class final Landroidx/compose/material3/ListItemMeasurePolicy;
.super Ljava/lang/Object;
.source "ListItem.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MultiContentMeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,731:1\n50#2:732\n86#2:733\n86#2:734\n50#2:735\n50#2:736\n86#2:737\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n*L\n213#1:732\n243#1:733\n299#1:734\n376#1:735\n395#1:736\n433#1:737\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00072\u0006\u0010\t\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\u0008\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\t\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0002\u0008\u000eH\u0002JV\u0010\u000f\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\u0008\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u0010\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0002\u0008\u000eH\u0002J(\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J2\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u00070\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u001c\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001d"
    }
    d2 = {
        "Landroidx/compose/material3/ListItemMeasurePolicy;",
        "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;",
        "()V",
        "calculateIntrinsicHeight",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "width",
        "intrinsicMeasure",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "Lkotlin/ExtensionFunctionType;",
        "calculateIntrinsicWidth",
        "height",
        "maxIntrinsicHeight",
        "maxIntrinsicWidth",
        "measure",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;",
        "minIntrinsicHeight",
        "minIntrinsicWidth",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final calculateIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I
    .locals 29
    .param p1, "$this$calculateIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .param p4, "intrinsicMeasure"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 392
    move-object/from16 v0, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p4

    const/4 v1, 0x0

    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 387
    move-object v12, v2

    .local v12, "headlineMeasurable":Ljava/util/List;
    const/4 v2, 0x1

    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 388
    move-object v13, v3

    .local v13, "overlineMeasurable":Ljava/util/List;
    const/4 v3, 0x2

    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 389
    move-object v14, v3

    .local v14, "supportingMeasurable":Ljava/util/List;
    const/4 v3, 0x3

    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 390
    move-object v15, v3

    .local v15, "leadingMeasurable":Ljava/util/List;
    const/4 v3, 0x4

    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 391
    move-object/from16 v16, v3

    .line 394
    .local v16, "trailingMeasurable":Ljava/util/List;
    const/4 v3, 0x0

    .line 395
    .local v3, "remainingWidth":I
    invoke-static {}, Landroidx/compose/material3/ListItemKt;->getListItemStartPadding()F

    move-result v4

    .local v4, "arg0$iv":F
    invoke-static {}, Landroidx/compose/material3/ListItemKt;->getListItemEndPadding()F

    move-result v5

    .local v5, "other$iv":F
    const/4 v6, 0x0

    .line 736
    .local v6, "$i$f$plus-5rwHm24":I
    add-float v7, v4, v5

    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 395
    .end local v4    # "arg0$iv":F
    .end local v5    # "other$iv":F
    .end local v6    # "$i$f$plus-5rwHm24":I
    invoke-interface {v0, v4}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v4

    move/from16 v5, p3

    invoke-static {v5, v4}, Landroidx/compose/material3/ListItemKt;->access$subtractConstraintSafely(II)I

    move-result v4

    .line 394
    nop

    .line 397
    .end local v3    # "remainingWidth":I
    .local v4, "remainingWidth":I
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    const v6, 0x7fffffff

    if-eqz v3, :cond_0

    .local v3, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v7, 0x0

    .line 398
    .local v7, "$i$a$-let-ListItemMeasurePolicy$calculateIntrinsicHeight$leadingHeight$1":I
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v3, v8}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    .line 399
    .local v8, "height":I
    nop

    .line 400
    nop

    .line 401
    invoke-interface {v3, v6}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v9

    .line 400
    invoke-static {v4, v9}, Landroidx/compose/material3/ListItemKt;->access$subtractConstraintSafely(II)I

    move-result v9

    .line 399
    move v4, v9

    .line 403
    nop

    .line 397
    .end local v3    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v7    # "$i$a$-let-ListItemMeasurePolicy$calculateIntrinsicHeight$leadingHeight$1":I
    .end local v8    # "height":I
    goto :goto_0

    .line 404
    :cond_0
    move v8, v1

    .line 397
    :goto_0
    nop

    .line 396
    nop

    .line 406
    .local v8, "leadingHeight":I
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v3, :cond_1

    .restart local v3    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v7, 0x0

    .line 407
    .local v7, "$i$a$-let-ListItemMeasurePolicy$calculateIntrinsicHeight$trailingHeight$1":I
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v3, v9}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    .line 408
    .local v9, "height":I
    nop

    .line 409
    nop

    .line 410
    invoke-interface {v3, v6}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    move-result v6

    .line 409
    invoke-static {v4, v6}, Landroidx/compose/material3/ListItemKt;->access$subtractConstraintSafely(II)I

    move-result v6

    .line 408
    move v4, v6

    .line 412
    nop

    .line 406
    .end local v3    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v7    # "$i$a$-let-ListItemMeasurePolicy$calculateIntrinsicHeight$trailingHeight$1":I
    .end local v9    # "height":I
    move/from16 v17, v4

    goto :goto_1

    .line 413
    :cond_1
    move v9, v1

    move/from16 v17, v4

    .line 406
    .end local v4    # "remainingWidth":I
    .local v17, "remainingWidth":I
    :goto_1
    nop

    .line 405
    nop

    .line 414
    .local v9, "trailingHeight":I
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v3, :cond_2

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v11, v3, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    move v4, v3

    goto :goto_2

    :cond_2
    move v4, v1

    .line 415
    .local v4, "overlineHeight":I
    :goto_2
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v3, :cond_3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v11, v3, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    goto :goto_3

    :cond_3
    move v3, v1

    .line 417
    .local v3, "headlineHeight":I
    :goto_3
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v6, :cond_4

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v11, v6, v7}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    goto :goto_4

    :cond_4
    move v6, v1

    .line 416
    :goto_4
    nop

    .line 418
    .local v6, "supportingHeight":I
    move-object v7, v0

    check-cast v7, Landroidx/compose/ui/unit/Density;

    invoke-static {v7, v6}, Landroidx/compose/material3/ListItemKt;->access$isSupportingMultilineHeuristic(Landroidx/compose/ui/unit/Density;I)Z

    move-result v7

    .line 420
    .local v7, "isSupportingMultiline":Z
    sget-object v1, Landroidx/compose/material3/ListItemType;->Companion:Landroidx/compose/material3/ListItemType$Companion;

    .line 421
    if-lez v4, :cond_5

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    .line 422
    :goto_5
    move/from16 v19, v3

    if-lez v6, :cond_6

    const/4 v3, 0x1

    goto :goto_6

    :cond_6
    const/4 v3, 0x0

    .line 423
    .end local v3    # "headlineHeight":I
    .local v19, "headlineHeight":I
    :goto_6
    nop

    .line 420
    invoke-virtual {v1, v2, v3, v7}, Landroidx/compose/material3/ListItemType$Companion;->invoke-Z-LSjz4$material3_release(ZZZ)I

    move-result v1

    .line 419
    nop

    .line 426
    .local v1, "listItemType":I
    nop

    .line 427
    nop

    .line 428
    nop

    .line 429
    nop

    .line 430
    nop

    .line 431
    nop

    .line 432
    nop

    .line 433
    invoke-static {v1}, Landroidx/compose/material3/ListItemKt;->access$verticalPadding-yh95HIg(I)F

    move-result v2

    .local v2, "arg0$iv":F
    const/4 v3, 0x2

    .local v3, "other$iv":I
    const/16 v18, 0x0

    .line 737
    .local v18, "$i$f$times-u2uoSUM":I
    move/from16 v20, v1

    .end local v1    # "listItemType":I
    .local v20, "listItemType":I
    int-to-float v1, v3

    mul-float/2addr v1, v2

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 433
    .end local v2    # "arg0$iv":F
    .end local v3    # "other$iv":I
    .end local v18    # "$i$f$times-u2uoSUM":I
    invoke-interface {v0, v1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    .line 434
    const/16 v25, 0xf

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v2

    .line 426
    move v5, v6

    move/from16 v18, v7

    move/from16 v6, v20

    move v7, v1

    move v1, v8

    move-wide/from16 v27, v2

    move v2, v9

    move-wide/from16 v8, v27

    move/from16 v3, v19

    .end local v7    # "isSupportingMultiline":Z
    .end local v8    # "leadingHeight":I
    .end local v9    # "trailingHeight":I
    .end local v19    # "headlineHeight":I
    .end local v20    # "listItemType":I
    .local v1, "leadingHeight":I
    .local v2, "trailingHeight":I
    .local v3, "headlineHeight":I
    .local v5, "supportingHeight":I
    .local v6, "listItemType":I
    .local v18, "isSupportingMultiline":Z
    invoke-static/range {v0 .. v9}, Landroidx/compose/material3/ListItemKt;->access$calculateHeight-N4Jib3Y(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIIJ)I

    move-result v7

    .end local v6    # "listItemType":I
    .restart local v20    # "listItemType":I
    return v7
.end method

.method private final calculateIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I
    .locals 22
    .param p1, "$this$calculateIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .param p4, "intrinsicMeasure"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 369
    move-object/from16 v0, p2

    move-object/from16 v1, p4

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 364
    nop

    .local v3, "headlineMeasurable":Ljava/util/List;
    const/4 v4, 0x1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 365
    nop

    .local v4, "overlineMeasurable":Ljava/util/List;
    const/4 v5, 0x2

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 366
    nop

    .local v5, "supportingMeasurable":Ljava/util/List;
    const/4 v6, 0x3

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    .line 367
    nop

    .local v6, "leadingMeasurable":Ljava/util/List;
    const/4 v7, 0x4

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 368
    nop

    .line 370
    .local v7, "trailingMeasurable":Ljava/util/List;
    nop

    .line 371
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v8, :cond_0

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v1, v8, v9}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    move v10, v8

    goto :goto_0

    :cond_0
    move v10, v2

    .line 372
    :goto_0
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v8, :cond_1

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v1, v8, v9}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    move v11, v8

    goto :goto_1

    :cond_1
    move v11, v2

    .line 373
    :goto_1
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v8, :cond_2

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v1, v8, v9}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    move v12, v8

    goto :goto_2

    :cond_2
    move v12, v2

    .line 374
    :goto_2
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v8, :cond_3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v1, v8, v9}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    move v13, v8

    goto :goto_3

    :cond_3
    move v13, v2

    .line 375
    :goto_3
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v8, :cond_4

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v8, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    :cond_4
    move v14, v2

    .line 376
    invoke-static {}, Landroidx/compose/material3/ListItemKt;->getListItemStartPadding()F

    move-result v2

    .local v2, "arg0$iv":F
    invoke-static {}, Landroidx/compose/material3/ListItemKt;->getListItemEndPadding()F

    move-result v8

    .local v8, "other$iv":F
    const/4 v9, 0x0

    .line 735
    .local v9, "$i$f$plus-5rwHm24":I
    add-float v15, v2, v8

    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 376
    .end local v2    # "arg0$iv":F
    .end local v8    # "other$iv":F
    .end local v9    # "$i$f$plus-5rwHm24":I
    move-object/from16 v9, p1

    invoke-interface {v9, v2}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->roundToPx-0680j_4(F)I

    move-result v15

    .line 377
    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v16

    .line 370
    invoke-static/range {v9 .. v17}, Landroidx/compose/material3/ListItemKt;->access$calculateWidth-yeHjK3Y(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIJ)I

    move-result v2

    return v2
.end method


# virtual methods
.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$maxIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I)I"
        }
    .end annotation

    .line 341
    sget-object v0, Landroidx/compose/material3/ListItemMeasurePolicy$maxIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material3/ListItemMeasurePolicy$maxIntrinsicHeight$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/ListItemMeasurePolicy;->calculateIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$maxIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I)I"
        }
    .end annotation

    .line 346
    sget-object v0, Landroidx/compose/material3/ListItemMeasurePolicy$maxIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material3/ListItemMeasurePolicy$maxIntrinsicWidth$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/ListItemMeasurePolicy;->calculateIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 42
    .param p1, "$this$measure_u2d3p2s80s"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "constraints"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;>;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 207
    move-object/from16 v0, p1

    move-object/from16 v12, p2

    const/4 v1, 0x0

    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 202
    move-object v13, v2

    .local v13, "headlineMeasurable":Ljava/util/List;
    const/4 v2, 0x1

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 203
    move-object v14, v3

    .local v14, "overlineMeasurable":Ljava/util/List;
    const/4 v3, 0x2

    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 204
    move-object v15, v3

    .local v15, "supportingMeasurable":Ljava/util/List;
    const/4 v3, 0x3

    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 205
    move-object/from16 v16, v3

    .local v16, "leadingMeasurable":Ljava/util/List;
    const/4 v3, 0x4

    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 206
    move-object/from16 v17, v3

    .line 208
    .local v17, "trailingMeasurable":Ljava/util/List;
    const/4 v3, 0x0

    .line 210
    .local v3, "currentTotalWidth":I
    const/16 v10, 0xa

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide/from16 v4, p3

    invoke-static/range {v4 .. v11}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v6

    .line 211
    .local v6, "looseConstraints":J
    invoke-static {}, Landroidx/compose/material3/ListItemKt;->getListItemStartPadding()F

    move-result v4

    .line 212
    .local v4, "startPadding":F
    invoke-static {}, Landroidx/compose/material3/ListItemKt;->getListItemEndPadding()F

    move-result v5

    .line 213
    .local v5, "endPadding":F
    const/4 v8, 0x0

    .line 732
    .local v8, "$i$f$plus-5rwHm24":I
    add-float v9, v4, v5

    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 213
    .end local v8    # "$i$f$plus-5rwHm24":I
    invoke-interface {v0, v8}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v8

    .line 224
    .local v8, "horizontalPadding":I
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    if-eqz v9, :cond_0

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v10

    invoke-interface {v9, v10}, Landroidx/compose/ui/layout/Measurable;->minIntrinsicWidth(I)I

    move-result v9

    goto :goto_0

    :cond_0
    move v9, v1

    .line 223
    :goto_0
    move/from16 v28, v9

    .line 226
    .local v28, "intrinsicLeadingWidth":I
    invoke-static/range {v17 .. v17}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    if-eqz v9, :cond_1

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v10

    invoke-interface {v9, v10}, Landroidx/compose/ui/layout/Measurable;->minIntrinsicWidth(I)I

    move-result v9

    goto :goto_1

    :cond_1
    move v9, v1

    .line 225
    :goto_1
    move/from16 v29, v9

    .line 228
    .local v29, "intrinsicTrailingWidth":I
    invoke-static {v6, v7}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v9

    .line 229
    add-int v10, v28, v29

    add-int/2addr v10, v8

    .line 228
    invoke-static {v9, v10}, Landroidx/compose/material3/ListItemKt;->access$subtractConstraintSafely(II)I

    move-result v9

    .line 227
    nop

    .line 232
    .local v9, "intrinsicSupportingWidthConstraint":I
    nop

    .line 233
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/ui/layout/Measurable;

    .line 234
    if-eqz v10, :cond_2

    .line 233
    nop

    .line 234
    invoke-interface {v10, v9}, Landroidx/compose/ui/layout/Measurable;->minIntrinsicHeight(I)I

    move-result v10

    .line 232
    goto :goto_2

    .line 234
    :cond_2
    move v10, v1

    .line 232
    :goto_2
    nop

    .line 231
    nop

    .line 236
    .local v10, "intrinsicSupportingHeight":I
    move-object v11, v0

    check-cast v11, Landroidx/compose/ui/unit/Density;

    invoke-static {v11, v10}, Landroidx/compose/material3/ListItemKt;->access$isSupportingMultilineHeuristic(Landroidx/compose/ui/unit/Density;I)Z

    move-result v11

    .line 235
    nop

    .line 238
    .local v11, "intrinsicIsSupportingMultiline":Z
    sget-object v1, Landroidx/compose/material3/ListItemType;->Companion:Landroidx/compose/material3/ListItemType$Companion;

    .line 239
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v19

    if-eqz v19, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    .line 240
    :goto_3
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v20

    if-eqz v20, :cond_4

    move/from16 v20, v3

    const/4 v3, 0x1

    goto :goto_4

    :cond_4
    move/from16 v20, v3

    const/4 v3, 0x0

    .line 241
    .end local v3    # "currentTotalWidth":I
    .local v20, "currentTotalWidth":I
    :goto_4
    nop

    .line 238
    invoke-virtual {v1, v2, v3, v11}, Landroidx/compose/material3/ListItemType$Companion;->invoke-Z-LSjz4$material3_release(ZZZ)I

    move-result v1

    .line 237
    move/from16 v30, v1

    .line 243
    .local v30, "intrinsicListItemType":I
    invoke-static/range {v30 .. v30}, Landroidx/compose/material3/ListItemKt;->access$verticalPadding-yh95HIg(I)F

    move-result v1

    .local v1, "arg0$iv":F
    const/4 v2, 0x2

    .local v2, "other$iv":I
    const/4 v3, 0x0

    .line 733
    .local v3, "$i$f$times-u2uoSUM":I
    move/from16 v21, v1

    .end local v1    # "arg0$iv":F
    .local v21, "arg0$iv":F
    int-to-float v1, v2

    mul-float v1, v1, v21

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 243
    .end local v2    # "other$iv":I
    .end local v3    # "$i$f$times-u2uoSUM":I
    .end local v21    # "arg0$iv":F
    invoke-interface {v0, v1}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v1

    .line 246
    .local v1, "intrinsicVerticalPadding":I
    nop

    .line 247
    neg-int v2, v8

    .line 248
    neg-int v3, v1

    .line 246
    invoke-static {v6, v7, v2, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v2

    .line 245
    nop

    .line 251
    .local v2, "paddedLooseConstraints":J
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v21

    move/from16 v31, v1

    .end local v1    # "intrinsicVerticalPadding":I
    .local v31, "intrinsicVerticalPadding":I
    move-object/from16 v1, v21

    check-cast v1, Landroidx/compose/ui/layout/Measurable;

    const/16 v27, 0x0

    if-eqz v1, :cond_5

    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    goto :goto_5

    :cond_5
    move-object/from16 v1, v27

    .line 252
    .local v1, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    :goto_5
    invoke-static {v1}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v21

    move-object/from16 v32, v1

    .end local v1    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v32, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    add-int v1, v20, v21

    .line 257
    .end local v20    # "currentTotalWidth":I
    .local v1, "currentTotalWidth":I
    nop

    .line 255
    nop

    .line 256
    invoke-static/range {v17 .. v17}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v20

    move-wide/from16 v21, v2

    .end local v2    # "paddedLooseConstraints":J
    .local v21, "paddedLooseConstraints":J
    move-object/from16 v2, v20

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 257
    if-eqz v2, :cond_6

    .line 256
    nop

    .line 257
    neg-int v3, v1

    const/16 v25, 0x2

    const/16 v26, 0x0

    const/16 v24, 0x0

    move/from16 v23, v3

    move-wide/from16 v33, v6

    .end local v6    # "looseConstraints":J
    .local v33, "looseConstraints":J
    invoke-static/range {v21 .. v26}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v6

    invoke-interface {v2, v6, v7}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    goto :goto_6

    .end local v33    # "looseConstraints":J
    .restart local v6    # "looseConstraints":J
    :cond_6
    move-wide/from16 v33, v6

    .end local v6    # "looseConstraints":J
    .restart local v33    # "looseConstraints":J
    move-object/from16 v2, v27

    .line 254
    :goto_6
    nop

    .line 258
    .local v2, "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v2}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    add-int/2addr v1, v3

    .line 260
    const/4 v3, 0x0

    .line 265
    .local v3, "currentTotalHeight":I
    nop

    .line 263
    nop

    .line 264
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 265
    if-eqz v6, :cond_7

    .line 264
    nop

    .line 265
    neg-int v7, v1

    const/16 v25, 0x2

    const/16 v26, 0x0

    const/16 v24, 0x0

    move/from16 v20, v3

    move/from16 v23, v7

    move-object v7, v2

    .end local v2    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v3    # "currentTotalHeight":I
    .local v7, "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v20, "currentTotalHeight":I
    invoke-static/range {v21 .. v26}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U$default(JIIILjava/lang/Object;)J

    move-result-wide v2

    move-object/from16 v35, v13

    move-wide/from16 v12, v21

    .end local v13    # "headlineMeasurable":Ljava/util/List;
    .end local v21    # "paddedLooseConstraints":J
    .local v12, "paddedLooseConstraints":J
    .local v35, "headlineMeasurable":Ljava/util/List;
    invoke-interface {v6, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    goto :goto_7

    .end local v7    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v12    # "paddedLooseConstraints":J
    .end local v20    # "currentTotalHeight":I
    .end local v35    # "headlineMeasurable":Ljava/util/List;
    .restart local v2    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v3    # "currentTotalHeight":I
    .restart local v13    # "headlineMeasurable":Ljava/util/List;
    .restart local v21    # "paddedLooseConstraints":J
    :cond_7
    move-object v7, v2

    move/from16 v20, v3

    move-object/from16 v35, v13

    move-wide/from16 v12, v21

    .end local v2    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v3    # "currentTotalHeight":I
    .end local v13    # "headlineMeasurable":Ljava/util/List;
    .end local v21    # "paddedLooseConstraints":J
    .restart local v7    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v12    # "paddedLooseConstraints":J
    .restart local v20    # "currentTotalHeight":I
    .restart local v35    # "headlineMeasurable":Ljava/util/List;
    move-object/from16 v2, v27

    .line 262
    :goto_7
    nop

    .line 266
    .local v2, "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v2}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v3

    add-int v3, v20, v3

    .line 271
    .end local v20    # "currentTotalHeight":I
    .restart local v3    # "currentTotalHeight":I
    nop

    .line 269
    nop

    .line 270
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 271
    if-eqz v6, :cond_8

    .line 270
    nop

    .line 272
    nop

    .line 273
    move-object/from16 v36, v2

    .end local v2    # "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v36, "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    neg-int v2, v1

    .line 274
    move-object/from16 v37, v7

    .end local v7    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v37, "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    neg-int v7, v3

    .line 272
    move/from16 v20, v3

    .end local v3    # "currentTotalHeight":I
    .restart local v20    # "currentTotalHeight":I
    invoke-static {v12, v13, v2, v7}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v2

    .line 271
    invoke-interface {v6, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    move-object v7, v2

    goto :goto_8

    .end local v20    # "currentTotalHeight":I
    .end local v36    # "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v37    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v2    # "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v3    # "currentTotalHeight":I
    .restart local v7    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_8
    move-object/from16 v36, v2

    move/from16 v20, v3

    move-object/from16 v37, v7

    .end local v2    # "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v3    # "currentTotalHeight":I
    .end local v7    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v20    # "currentTotalHeight":I
    .restart local v36    # "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v37    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    move-object/from16 v7, v27

    .line 268
    :goto_8
    nop

    .line 277
    .local v7, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    invoke-static {v7}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v2

    add-int v2, v20, v2

    .line 279
    .end local v20    # "currentTotalHeight":I
    .local v2, "currentTotalHeight":I
    if-eqz v7, :cond_9

    .line 280
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v7, v3}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v3

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v7, v6}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v6

    if-eq v3, v6, :cond_9

    const/4 v3, 0x1

    goto :goto_9

    :cond_9
    const/4 v3, 0x0

    .line 278
    :goto_9
    nop

    .line 285
    .local v3, "isSupportingMultiline":Z
    nop

    .line 283
    nop

    .line 284
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 285
    if-eqz v6, :cond_a

    .line 284
    nop

    .line 286
    nop

    .line 287
    move-object/from16 v38, v7

    .end local v7    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v38, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    neg-int v7, v1

    .line 288
    move/from16 v39, v1

    .end local v1    # "currentTotalWidth":I
    .local v39, "currentTotalWidth":I
    neg-int v1, v2

    .line 286
    move/from16 v40, v2

    .end local v2    # "currentTotalHeight":I
    .local v40, "currentTotalHeight":I
    invoke-static {v12, v13, v7, v1}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v1

    .line 285
    invoke-interface {v6, v1, v2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v27

    goto :goto_a

    .end local v38    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v39    # "currentTotalWidth":I
    .end local v40    # "currentTotalHeight":I
    .restart local v1    # "currentTotalWidth":I
    .restart local v2    # "currentTotalHeight":I
    .restart local v7    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    :cond_a
    move/from16 v39, v1

    move/from16 v40, v2

    move-object/from16 v38, v7

    .end local v1    # "currentTotalWidth":I
    .end local v2    # "currentTotalHeight":I
    .end local v7    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v38    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v39    # "currentTotalWidth":I
    .restart local v40    # "currentTotalHeight":I
    :goto_a
    move-object/from16 v6, v27

    .line 282
    nop

    .line 293
    .local v6, "overlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    sget-object v1, Landroidx/compose/material3/ListItemType;->Companion:Landroidx/compose/material3/ListItemType$Companion;

    .line 294
    if-eqz v6, :cond_b

    const/4 v2, 0x1

    goto :goto_b

    :cond_b
    const/4 v2, 0x0

    .line 295
    :goto_b
    if-eqz v38, :cond_c

    const/4 v7, 0x1

    goto :goto_c

    :cond_c
    const/4 v7, 0x0

    .line 296
    :goto_c
    nop

    .line 293
    invoke-virtual {v1, v2, v7, v3}, Landroidx/compose/material3/ListItemType$Companion;->invoke-Z-LSjz4$material3_release(ZZZ)I

    move-result v24

    .line 292
    move/from16 v1, v24

    .line 298
    .local v1, "listItemType":I
    invoke-static {v1}, Landroidx/compose/material3/ListItemKt;->access$verticalPadding-yh95HIg(I)F

    move-result v2

    .line 299
    .local v2, "topPadding":F
    const/4 v7, 0x2

    .local v7, "other$iv":I
    const/16 v18, 0x0

    .line 734
    .local v18, "$i$f$times-u2uoSUM":I
    move/from16 v27, v1

    .end local v1    # "listItemType":I
    .local v27, "listItemType":I
    int-to-float v1, v7

    mul-float/2addr v1, v2

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 299
    .end local v7    # "other$iv":I
    .end local v18    # "$i$f$times-u2uoSUM":I
    nop

    .line 302
    .local v1, "verticalPadding":F
    move-object/from16 v18, v0

    check-cast v18, Landroidx/compose/ui/layout/IntrinsicMeasureScope;

    .line 303
    invoke-static/range {v32 .. v32}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v19

    .line 304
    invoke-static/range {v37 .. v37}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v20

    .line 305
    invoke-static/range {v36 .. v36}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v21

    .line 306
    invoke-static {v6}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v22

    .line 307
    invoke-static/range {v38 .. v38}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v23

    .line 308
    nop

    .line 309
    nop

    .line 302
    move-wide/from16 v25, p3

    move/from16 v24, v8

    .end local v8    # "horizontalPadding":I
    .local v24, "horizontalPadding":I
    invoke-static/range {v18 .. v26}, Landroidx/compose/material3/ListItemKt;->access$calculateWidth-yeHjK3Y(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIJ)I

    move-result v7

    .line 301
    move/from16 v41, v24

    .line 312
    .end local v24    # "horizontalPadding":I
    .local v7, "width":I
    .local v41, "horizontalPadding":I
    move-object/from16 v18, v0

    check-cast v18, Landroidx/compose/ui/layout/IntrinsicMeasureScope;

    .line 313
    invoke-static/range {v32 .. v32}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v19

    .line 314
    invoke-static/range {v37 .. v37}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v20

    .line 315
    invoke-static/range {v36 .. v36}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v21

    .line 316
    invoke-static {v6}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v22

    .line 317
    invoke-static/range {v38 .. v38}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    move-result v23

    .line 318
    nop

    .line 319
    invoke-interface {v0, v1}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v25

    .line 320
    nop

    .line 312
    move/from16 v24, v27

    move-wide/from16 v26, p3

    .end local v27    # "listItemType":I
    .local v24, "listItemType":I
    invoke-static/range {v18 .. v27}, Landroidx/compose/material3/ListItemKt;->access$calculateHeight-N4Jib3Y(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIIJ)I

    move-result v8

    .line 311
    move-wide/from16 v21, v12

    move/from16 v12, v24

    .line 323
    .end local v24    # "listItemType":I
    .local v8, "height":I
    .local v12, "listItemType":I
    .restart local v21    # "paddedLooseConstraints":J
    nop

    .line 324
    nop

    .line 325
    nop

    .line 326
    nop

    .line 327
    nop

    .line 328
    nop

    .line 329
    nop

    .line 330
    nop

    .line 331
    sget-object v13, Landroidx/compose/material3/ListItemType;->Companion:Landroidx/compose/material3/ListItemType$Companion;

    invoke-virtual {v13}, Landroidx/compose/material3/ListItemType$Companion;->getThreeLine-AlXitO8()I

    move-result v13

    invoke-static {v12, v13}, Landroidx/compose/material3/ListItemType;->equals-impl0(II)Z

    move-result v13

    .line 332
    move/from16 v18, v9

    .end local v9    # "intrinsicSupportingWidthConstraint":I
    .local v18, "intrinsicSupportingWidthConstraint":I
    invoke-interface {v0, v4}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v9

    .line 333
    move/from16 v19, v10

    .end local v10    # "intrinsicSupportingHeight":I
    .local v19, "intrinsicSupportingHeight":I
    invoke-interface {v0, v5}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v10

    .line 334
    move/from16 v20, v11

    .end local v11    # "intrinsicIsSupportingMultiline":Z
    .local v20, "intrinsicIsSupportingMultiline":Z
    invoke-interface {v0, v2}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v11

    .line 323
    move/from16 v26, v1

    move/from16 v25, v2

    move/from16 v24, v3

    move v1, v7

    move v2, v8

    move v8, v13

    move/from16 v23, v20

    move-object/from16 v3, v32

    move-object/from16 v7, v38

    move v13, v4

    move/from16 v20, v19

    move-object/from16 v4, v37

    move/from16 v19, v18

    move/from16 v18, v5

    move-object/from16 v5, v36

    .end local v8    # "height":I
    .end local v32    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v36    # "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v37    # "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v38    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v1, "width":I
    .local v2, "height":I
    .local v3, "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v4, "trailingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v5, "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v7, "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v13, "startPadding":F
    .local v18, "endPadding":F
    .local v19, "intrinsicSupportingWidthConstraint":I
    .local v20, "intrinsicSupportingHeight":I
    .local v23, "intrinsicIsSupportingMultiline":Z
    .local v24, "isSupportingMultiline":Z
    .local v25, "topPadding":F
    .local v26, "verticalPadding":F
    invoke-static/range {v0 .. v11}, Landroidx/compose/material3/ListItemKt;->access$place(Landroidx/compose/ui/layout/MeasureScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIII)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v8

    .end local v3    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    .end local v7    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v32    # "leadingPlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v36    # "headlinePlaceable":Landroidx/compose/ui/layout/Placeable;
    .restart local v38    # "supportingPlaceable":Landroidx/compose/ui/layout/Placeable;
    return-object v8
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$minIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I)I"
        }
    .end annotation

    .line 351
    sget-object v0, Landroidx/compose/material3/ListItemMeasurePolicy$minIntrinsicHeight$1;->INSTANCE:Landroidx/compose/material3/ListItemMeasurePolicy$minIntrinsicHeight$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/ListItemMeasurePolicy;->calculateIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 1
    .param p1, "$this$minIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;>;I)I"
        }
    .end annotation

    .line 356
    sget-object v0, Landroidx/compose/material3/ListItemMeasurePolicy$minIntrinsicWidth$1;->INSTANCE:Landroidx/compose/material3/ListItemMeasurePolicy$minIntrinsicWidth$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/material3/ListItemMeasurePolicy;->calculateIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    move-result v0

    return v0
.end method
