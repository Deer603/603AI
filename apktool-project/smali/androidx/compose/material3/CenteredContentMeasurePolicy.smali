.class final Landroidx/compose/material3/CenteredContentMeasurePolicy;
.super Ljava/lang/Object;
.source "ExpressiveNavigationBar.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExpressiveNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,459:1\n151#2,3:460\n33#2,4:463\n154#2,2:467\n38#2:469\n156#2:470\n33#2,6:471\n151#2,3:477\n33#2,4:480\n154#2,2:484\n38#2:486\n156#2:487\n*S KotlinDebug\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n*L\n364#1:460,3\n364#1:463,4\n364#1:467,2\n364#1:469\n364#1:470\n373#1:471,6\n380#1:477,3\n380#1:480,4\n380#1:484,2\n380#1:486\n380#1:487\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\nH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/material3/CenteredContentMeasurePolicy;",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "()V",
        "measure",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;",
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

    .line 345
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 27
    .param p1, "$this$measure_u2d3p2s80s"    # Landroidx/compose/ui/layout/MeasureScope;
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

    .line 350
    move-wide/from16 v0, p3

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v3

    .line 351
    .local v3, "width":I
    const/4 v2, 0x0

    .local v2, "itemHeight":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v4

    .line 352
    .end local v2    # "itemHeight":I
    .local v4, "itemHeight":I
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v9

    .line 354
    .local v9, "itemsCount":I
    const/4 v2, 0x1

    if-ge v9, v2, :cond_0

    .line 355
    sget-object v2, Landroidx/compose/material3/CenteredContentMeasurePolicy$measure$1;->INSTANCE:Landroidx/compose/material3/CenteredContentMeasurePolicy$measure$1;

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    return-object v5

    .line 358
    :cond_0
    new-instance v2, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    move-object v10, v2

    .line 359
    .local v10, "barHorizontalPadding":Lkotlin/jvm/internal/Ref$IntRef;
    const/4 v2, 0x0

    .line 360
    .local v2, "itemsPlaceables":Ljava/util/List;
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getHasBoundedWidth-impl(J)Z

    move-result v5

    if-nez v5, :cond_2

    .line 364
    move-object/from16 v5, p2

    .local v5, "$this$fastMap$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 460
    .local v6, "$i$f$fastMap":I
    nop

    .line 461
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 462
    .local v7, "target$iv":Ljava/util/ArrayList;
    move-object v8, v5

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v11, 0x0

    .line 463
    .local v11, "$i$f$fastForEach":I
    nop

    .line 464
    const/4 v12, 0x0

    .local v12, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v13

    :goto_0
    if-ge v12, v13, :cond_1

    .line 465
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 466
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 467
    .local v16, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v17, v2

    .end local v2    # "itemsPlaceables":Ljava/util/List;
    .local v17, "itemsPlaceables":Ljava/util/List;
    move-object v2, v7

    check-cast v2, Ljava/util/Collection;

    move-object/from16 v18, v5

    .end local v5    # "$this$fastMap$iv":Ljava/util/List;
    .local v18, "$this$fastMap$iv":Ljava/util/List;
    move-object v5, v15

    check-cast v5, Landroidx/compose/ui/layout/Measurable;

    .local v5, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v19, 0x0

    .line 365
    .local v19, "$i$a$-fastMap-CenteredContentMeasurePolicy$measure$2":I
    move/from16 v20, v6

    .end local v6    # "$i$f$fastMap":I
    .local v20, "$i$f$fastMap":I
    sget-object v6, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    move-object/from16 v21, v7

    .end local v7    # "target$iv":Ljava/util/ArrayList;
    .local v21, "target$iv":Ljava/util/ArrayList;
    invoke-virtual {v6, v4}, Landroidx/compose/ui/unit/Constraints$Companion;->fixedHeight-OenEA2s(I)J

    move-result-wide v6

    invoke-static {v0, v1, v6, v7}, Landroidx/compose/ui/unit/ConstraintsKt;->constrain-N9IONVI(JJ)J

    move-result-wide v6

    invoke-interface {v5, v6, v7}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v5

    .line 467
    .end local v5    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v19    # "$i$a$-fastMap-CenteredContentMeasurePolicy$measure$2":I
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 468
    nop

    .line 466
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 464
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, v17

    move-object/from16 v5, v18

    move/from16 v6, v20

    move-object/from16 v7, v21

    goto :goto_0

    .end local v17    # "itemsPlaceables":Ljava/util/List;
    .end local v18    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    .end local v21    # "target$iv":Ljava/util/ArrayList;
    .restart local v2    # "itemsPlaceables":Ljava/util/List;
    .local v5, "$this$fastMap$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastMap":I
    .restart local v7    # "target$iv":Ljava/util/ArrayList;
    :cond_1
    move-object/from16 v17, v2

    move-object/from16 v18, v5

    move/from16 v20, v6

    move-object/from16 v21, v7

    .line 469
    .end local v2    # "itemsPlaceables":Ljava/util/List;
    .end local v5    # "$this$fastMap$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastMap":I
    .end local v7    # "target$iv":Ljava/util/ArrayList;
    .end local v12    # "index$iv$iv":I
    .restart local v17    # "itemsPlaceables":Ljava/util/List;
    .restart local v18    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v20    # "$i$f$fastMap":I
    .restart local v21    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 470
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v11    # "$i$f$fastForEach":I
    move-object/from16 v2, v21

    check-cast v2, Ljava/util/List;

    .line 363
    .end local v18    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    .end local v21    # "target$iv":Ljava/util/ArrayList;
    move/from16 v16, v3

    move/from16 v25, v9

    move-object v9, v2

    .end local v17    # "itemsPlaceables":Ljava/util/List;
    .restart local v2    # "itemsPlaceables":Ljava/util/List;
    goto/16 :goto_4

    .line 368
    :cond_2
    move-object/from16 v17, v2

    .end local v2    # "itemsPlaceables":Ljava/util/List;
    .restart local v17    # "itemsPlaceables":Ljava/util/List;
    div-int v2, v3, v9

    .line 369
    .local v2, "itemMaxWidth":I
    invoke-static {v9, v3}, Landroidx/compose/material3/ExpressiveNavigationBarKt;->access$calculateCenteredContentHorizontalPadding(II)I

    move-result v5

    iput v5, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 370
    iget v5, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    mul-int/lit8 v5, v5, 0x2

    sub-int v5, v3, v5

    div-int/2addr v5, v9

    .line 373
    .local v5, "itemMinWidth":I
    move-object/from16 v6, p2

    .local v6, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 471
    .local v7, "$i$f$fastForEach":I
    nop

    .line 472
    const/4 v8, 0x0

    .local v8, "index$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v11

    :goto_1
    if-ge v8, v11, :cond_4

    .line 473
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 474
    .local v12, "item$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .local v13, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v14, 0x0

    .line 374
    .local v14, "$i$a$-fastForEach-CenteredContentMeasurePolicy$measure$3":I
    invoke-interface {v13, v5}, Landroidx/compose/ui/layout/Measurable;->maxIntrinsicHeight(I)I

    move-result v15

    .line 375
    .local v15, "measurableHeight":I
    if-ge v4, v15, :cond_3

    .line 376
    move/from16 v16, v3

    .end local v3    # "width":I
    .local v16, "width":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v3

    invoke-static {v15, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v3

    move v4, v3

    .end local v4    # "itemHeight":I
    .local v3, "itemHeight":I
    goto :goto_2

    .line 375
    .end local v16    # "width":I
    .local v3, "width":I
    .restart local v4    # "itemHeight":I
    :cond_3
    move/from16 v16, v3

    .line 378
    .end local v3    # "width":I
    .restart local v16    # "width":I
    :goto_2
    nop

    .line 474
    .end local v13    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v14    # "$i$a$-fastForEach-CenteredContentMeasurePolicy$measure$3":I
    .end local v15    # "measurableHeight":I
    nop

    .line 472
    .end local v12    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move/from16 v3, v16

    goto :goto_1

    .end local v16    # "width":I
    .restart local v3    # "width":I
    :cond_4
    move/from16 v16, v3

    .line 476
    .end local v3    # "width":I
    .end local v8    # "index$iv":I
    .restart local v16    # "width":I
    nop

    .line 380
    .end local v6    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    move-object/from16 v3, p2

    .local v3, "$this$fastMap$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 477
    .local v6, "$i$f$fastMap":I
    nop

    .line 478
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 479
    .local v7, "target$iv":Ljava/util/ArrayList;
    move-object v8, v3

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v11, 0x0

    .line 480
    .restart local v11    # "$i$f$fastForEach":I
    nop

    .line 481
    const/4 v12, 0x0

    .local v12, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v13

    :goto_3
    if-ge v12, v13, :cond_6

    .line 482
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 483
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 484
    .local v18, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v19, v3

    .end local v3    # "$this$fastMap$iv":Ljava/util/List;
    .local v19, "$this$fastMap$iv":Ljava/util/List;
    move-object v3, v7

    check-cast v3, Ljava/util/Collection;

    move/from16 v20, v5

    .end local v5    # "itemMinWidth":I
    .local v20, "itemMinWidth":I
    move-object v5, v15

    check-cast v5, Landroidx/compose/ui/layout/Measurable;

    .local v5, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 381
    .local v21, "$i$a$-fastMap-CenteredContentMeasurePolicy$measure$4":I
    move/from16 v22, v20

    .line 382
    .local v22, "currentItemWidth":I
    move/from16 v23, v6

    .end local v6    # "$i$f$fastMap":I
    .local v23, "$i$f$fastMap":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/layout/Measurable;->maxIntrinsicWidth(I)I

    move-result v6

    .line 383
    .local v6, "measurableWidth":I
    move-object/from16 v24, v7

    move/from16 v7, v22

    .end local v22    # "currentItemWidth":I
    .local v7, "currentItemWidth":I
    .local v24, "target$iv":Ljava/util/ArrayList;
    if-ge v7, v6, :cond_5

    .line 386
    invoke-static {v6, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v22

    .line 388
    .end local v7    # "currentItemWidth":I
    .restart local v22    # "currentItemWidth":I
    iget v7, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    sub-int v25, v22, v20

    div-int/lit8 v25, v25, 0x2

    sub-int v7, v7, v25

    iput v7, v10, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move/from16 v7, v22

    .line 391
    .end local v22    # "currentItemWidth":I
    .restart local v7    # "currentItemWidth":I
    :cond_5
    nop

    .line 392
    nop

    .line 393
    move/from16 v22, v2

    .end local v2    # "itemMaxWidth":I
    .local v22, "itemMaxWidth":I
    sget-object v2, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    move-object/from16 v26, v8

    move/from16 v25, v9

    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "itemsCount":I
    .local v25, "itemsCount":I
    .local v26, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-virtual {v2, v7, v4}, Landroidx/compose/ui/unit/Constraints$Companion;->fixed-JhjzzOo(II)J

    move-result-wide v8

    .line 392
    invoke-static {v0, v1, v8, v9}, Landroidx/compose/ui/unit/ConstraintsKt;->constrain-N9IONVI(JJ)J

    move-result-wide v8

    .line 391
    invoke-interface {v5, v8, v9}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    .line 484
    .end local v5    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v6    # "measurableWidth":I
    .end local v7    # "currentItemWidth":I
    .end local v21    # "$i$a$-fastMap-CenteredContentMeasurePolicy$measure$4":I
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 485
    nop

    .line 483
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 481
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v3, v19

    move/from16 v5, v20

    move/from16 v2, v22

    move/from16 v6, v23

    move-object/from16 v7, v24

    move/from16 v9, v25

    move-object/from16 v8, v26

    goto :goto_3

    .end local v19    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "itemMinWidth":I
    .end local v22    # "itemMaxWidth":I
    .end local v23    # "$i$f$fastMap":I
    .end local v24    # "target$iv":Ljava/util/ArrayList;
    .end local v25    # "itemsCount":I
    .end local v26    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v2    # "itemMaxWidth":I
    .restart local v3    # "$this$fastMap$iv":Ljava/util/List;
    .local v5, "itemMinWidth":I
    .local v6, "$i$f$fastMap":I
    .local v7, "target$iv":Ljava/util/ArrayList;
    .restart local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v9    # "itemsCount":I
    :cond_6
    move/from16 v22, v2

    move-object/from16 v19, v3

    move/from16 v20, v5

    move/from16 v23, v6

    move-object/from16 v24, v7

    move-object/from16 v26, v8

    move/from16 v25, v9

    .line 486
    .end local v2    # "itemMaxWidth":I
    .end local v3    # "$this$fastMap$iv":Ljava/util/List;
    .end local v5    # "itemMinWidth":I
    .end local v6    # "$i$f$fastMap":I
    .end local v7    # "target$iv":Ljava/util/ArrayList;
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "itemsCount":I
    .end local v12    # "index$iv$iv":I
    .restart local v19    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v20    # "itemMinWidth":I
    .restart local v22    # "itemMaxWidth":I
    .restart local v23    # "$i$f$fastMap":I
    .restart local v24    # "target$iv":Ljava/util/ArrayList;
    .restart local v25    # "itemsCount":I
    .restart local v26    # "$this$fastForEach$iv$iv":Ljava/util/List;
    nop

    .line 487
    .end local v11    # "$i$f$fastForEach":I
    .end local v26    # "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object/from16 v2, v24

    check-cast v2, Ljava/util/List;

    .line 379
    .end local v19    # "$this$fastMap$iv":Ljava/util/List;
    .end local v23    # "$i$f$fastMap":I
    .end local v24    # "target$iv":Ljava/util/ArrayList;
    move-object v9, v2

    .line 399
    .end local v17    # "itemsPlaceables":Ljava/util/List;
    .end local v20    # "itemMinWidth":I
    .end local v22    # "itemMaxWidth":I
    .local v9, "itemsPlaceables":Ljava/util/List;
    :goto_4
    new-instance v2, Landroidx/compose/material3/CenteredContentMeasurePolicy$measure$5;

    invoke-direct {v2, v10, v9}, Landroidx/compose/material3/CenteredContentMeasurePolicy$measure$5;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/List;)V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, p1

    move/from16 v3, v16

    .end local v16    # "width":I
    .local v3, "width":I
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    return-object v5
.end method
