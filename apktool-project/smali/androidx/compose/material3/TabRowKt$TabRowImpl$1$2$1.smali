.class final Landroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1;
.super Ljava/lang/Object;
.source "TabRow.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MultiContentMeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TabRowKt$TabRowImpl$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1361:1\n256#2,3:1362\n33#2,4:1365\n259#2,2:1369\n38#2:1371\n261#2:1372\n151#2,3:1377\n33#2,4:1380\n154#2,2:1384\n38#2:1386\n156#2:1387\n151#2,3:1388\n33#2,4:1391\n154#2,2:1395\n38#2:1397\n156#2:1398\n151#2,3:1399\n33#2,4:1402\n154#2,2:1406\n38#2:1408\n156#2:1409\n86#3:1373\n56#3:1374\n86#3:1376\n148#4:1375\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1\n*L\n629#1:1362,3\n629#1:1365,4\n629#1:1369,2\n629#1:1371\n629#1:1372\n647#1:1377,3\n647#1:1380,4\n647#1:1384,2\n647#1:1386\n647#1:1387\n659#1:1388,3\n659#1:1391,4\n659#1:1395,2\n659#1:1397\n659#1:1398\n662#1:1399,3\n662#1:1402,4\n662#1:1406,2\n662#1:1408\n662#1:1409\n638#1:1373\n638#1:1374\n642#1:1376\n640#1:1375\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "<name for destructuring parameter 0>",
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
.field final synthetic $scope:Landroidx/compose/material3/TabRowKt$TabRowImpl$1$scope$1$1;


# direct methods
.method constructor <init>(Landroidx/compose/material3/TabRowKt$TabRowImpl$1$scope$1$1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1;->$scope:Landroidx/compose/material3/TabRowKt$TabRowImpl$1$scope$1$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 33
    .param p1, "$this$Layout"    # Landroidx/compose/ui/layout/MeasureScope;
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

    .line 621
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/util/List;

    .local v7, "tabMeasurables":Ljava/util/List;
    const/4 v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/util/List;

    .local v8, "dividerMeasurables":Ljava/util/List;
    const/4 v3, 0x2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/util/List;

    .line 622
    .local v9, "indicatorMeasurables":Ljava/util/List;
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v1

    .line 623
    .local v1, "tabRowWidth":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    .line 624
    .local v10, "tabCount":I
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    move-object v15, v3

    .line 625
    .local v15, "tabWidth":Lkotlin/jvm/internal/Ref$IntRef;
    if-lez v10, :cond_0

    .line 626
    div-int v3, v1, v10

    iput v3, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 629
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .local v3, "initial$iv":Ljava/lang/Object;
    move-object v4, v7

    .local v4, "$this$fastFold$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1362
    .local v5, "$i$f$fastFold":I
    nop

    .line 1363
    const/4 v6, 0x0

    .local v6, "accumulator$iv":Ljava/lang/Object;
    move-object v6, v3

    .line 1364
    move-object v11, v4

    .local v11, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v12, 0x0

    .line 1365
    .local v12, "$i$f$fastForEach":I
    nop

    .line 1366
    const/4 v13, 0x0

    .local v13, "index$iv$iv":I
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v14

    :goto_0
    if-ge v13, v14, :cond_1

    .line 1367
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 1368
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    .local v17, "e$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 1369
    .local v18, "$i$a$-fastForEach-ListUtilsKt$fastFold$2$iv":I
    move-object/from16 v2, v17

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .local v2, "curr":Landroidx/compose/ui/layout/Measurable;
    move-object/from16 v20, v6

    check-cast v20, Ljava/lang/Number;

    move/from16 p2, v1

    .end local v1    # "tabRowWidth":I
    .local p2, "tabRowWidth":I
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Number;->intValue()I

    move-result v1

    .local v1, "max":I
    const/16 v20, 0x0

    .line 630
    .local v20, "$i$a$-fastFold-TabRowKt$TabRowImpl$1$2$1$tabRowHeight$1":I
    move-object/from16 v21, v3

    .end local v3    # "initial$iv":Ljava/lang/Object;
    .local v21, "initial$iv":Ljava/lang/Object;
    iget v3, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {v2, v3}, Landroidx/compose/ui/layout/Measurable;->maxIntrinsicHeight(I)I

    move-result v3

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    .end local v1    # "max":I
    .end local v2    # "curr":Landroidx/compose/ui/layout/Measurable;
    .end local v20    # "$i$a$-fastFold-TabRowKt$TabRowImpl$1$2$1$tabRowHeight$1":I
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 1369
    move-object v6, v1

    .line 1370
    nop

    .line 1368
    .end local v17    # "e$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-fastForEach-ListUtilsKt$fastFold$2$iv":I
    nop

    .line 1366
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v13, v13, 0x1

    move/from16 v1, p2

    move-object/from16 v3, v21

    const/4 v2, 0x0

    goto :goto_0

    .end local v21    # "initial$iv":Ljava/lang/Object;
    .end local p2    # "tabRowWidth":I
    .local v1, "tabRowWidth":I
    .restart local v3    # "initial$iv":Ljava/lang/Object;
    :cond_1
    move/from16 p2, v1

    move-object/from16 v21, v3

    .line 1371
    .end local v1    # "tabRowWidth":I
    .end local v3    # "initial$iv":Ljava/lang/Object;
    .end local v13    # "index$iv$iv":I
    .restart local v21    # "initial$iv":Ljava/lang/Object;
    .restart local p2    # "tabRowWidth":I
    nop

    .line 1372
    .end local v11    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v12    # "$i$f$fastForEach":I
    nop

    .line 629
    .end local v4    # "$this$fastFold$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastFold":I
    .end local v6    # "accumulator$iv":Ljava/lang/Object;
    .end local v21    # "initial$iv":Ljava/lang/Object;
    move-object v1, v6

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v16

    .line 628
    move/from16 v2, v16

    .line 633
    .local v2, "tabRowHeight":I
    move-object/from16 v11, p0

    iget-object v1, v11, Landroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1;->$scope:Landroidx/compose/material3/TabRowKt$TabRowImpl$1$scope$1$1;

    .line 634
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v10, :cond_2

    move v5, v4

    .local v5, "index":I
    const/4 v6, 0x0

    .line 637
    .local v6, "$i$a$-List-TabRowKt$TabRowImpl$1$2$1$1":I
    nop

    .line 636
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    invoke-interface {v12, v2}, Landroidx/compose/ui/layout/Measurable;->maxIntrinsicWidth(I)I

    move-result v12

    iget v13, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 637
    invoke-interface {v0, v12}, Landroidx/compose/ui/layout/MeasureScope;->toDp-u2uoSUM(I)F

    move-result v12

    .line 635
    nop

    .line 638
    .local v12, "contentWidth":F
    invoke-static {}, Landroidx/compose/material3/TabKt;->getHorizontalTextPadding()F

    move-result v13

    .local v13, "arg0$iv":F
    const/4 v14, 0x2

    .local v14, "other$iv":I
    const/16 v16, 0x0

    .line 1373
    .local v16, "$i$f$times-u2uoSUM":I
    move/from16 v17, v2

    .end local v2    # "tabRowHeight":I
    .local v17, "tabRowHeight":I
    int-to-float v2, v14

    mul-float/2addr v2, v13

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 638
    .end local v13    # "arg0$iv":F
    .end local v14    # "other$iv":I
    .end local v16    # "$i$f$times-u2uoSUM":I
    nop

    .local v2, "other$iv":F
    const/4 v13, 0x0

    .line 1374
    .local v13, "$i$f$minus-5rwHm24":I
    sub-float v14, v12, v2

    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 638
    .end local v2    # "other$iv":F
    .end local v13    # "$i$f$minus-5rwHm24":I
    nop

    .line 640
    .end local v12    # "contentWidth":F
    .local v2, "contentWidth":F
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    move-result-object v12

    const/16 v13, 0x18

    .local v13, "$this$dp$iv":I
    const/4 v14, 0x0

    .line 1375
    .local v14, "$i$f$getDp":I
    move/from16 v16, v2

    .end local v2    # "contentWidth":F
    .local v16, "contentWidth":F
    int-to-float v2, v13

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .end local v13    # "$this$dp$iv":I
    .end local v14    # "$i$f$getDp":I
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    move-result-object v2

    .line 640
    invoke-static {v12, v2}, Lkotlin/comparisons/ComparisonsKt;->maxOf(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v2

    .line 642
    .local v2, "indicatorWidth":F
    new-instance v12, Landroidx/compose/material3/TabPosition;

    iget v13, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {v0, v13}, Landroidx/compose/ui/layout/MeasureScope;->toDp-u2uoSUM(I)F

    move-result v13

    .local v13, "arg0$iv":F
    const/4 v14, 0x0

    .line 1376
    .local v14, "$i$f$times-u2uoSUM":I
    move/from16 v18, v4

    int-to-float v4, v5

    mul-float/2addr v4, v13

    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 642
    .end local v13    # "arg0$iv":F
    .end local v14    # "$i$f$times-u2uoSUM":I
    iget v13, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface {v0, v13}, Landroidx/compose/ui/layout/MeasureScope;->toDp-u2uoSUM(I)F

    move-result v13

    const/4 v14, 0x0

    invoke-direct {v12, v4, v13, v2, v14}, Landroidx/compose/material3/TabPosition;-><init>(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 634
    .end local v2    # "indicatorWidth":F
    .end local v5    # "index":I
    .end local v6    # "$i$a$-List-TabRowKt$TabRowImpl$1$2$1$1":I
    .end local v16    # "contentWidth":F
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v18, 0x1

    move/from16 v2, v17

    goto :goto_1

    .end local v17    # "tabRowHeight":I
    .local v2, "tabRowHeight":I
    :cond_2
    move/from16 v17, v2

    .end local v2    # "tabRowHeight":I
    .restart local v17    # "tabRowHeight":I
    check-cast v3, Ljava/util/List;

    .line 633
    invoke-virtual {v1, v3}, Landroidx/compose/material3/TabRowKt$TabRowImpl$1$scope$1$1;->setTabPositions(Ljava/util/List;)V

    .line 647
    move-object v12, v7

    .local v12, "$this$fastMap$iv":Ljava/util/List;
    const/4 v13, 0x0

    .line 1377
    .local v13, "$i$f$fastMap":I
    nop

    .line 1378
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v14, v1

    .line 1379
    .local v14, "target$iv":Ljava/util/ArrayList;
    move-object v1, v12

    .local v1, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 1380
    .local v16, "$i$f$fastForEach":I
    nop

    .line 1381
    const/4 v2, 0x0

    .local v2, "index$iv$iv":I
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    :goto_2
    if-ge v2, v3, :cond_3

    .line 1382
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 1383
    .local v18, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v19, v18

    .local v19, "it$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 1384
    .local v20, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v4, v14

    check-cast v4, Ljava/util/Collection;

    move-object/from16 v5, v19

    check-cast v5, Landroidx/compose/ui/layout/Measurable;

    .local v5, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 648
    .local v21, "$i$a$-fastMap-TabRowKt$TabRowImpl$1$2$1$tabPlaceables$1":I
    nop

    .line 649
    nop

    .line 650
    move v6, v3

    iget v3, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 651
    move-object/from16 v22, v4

    iget v4, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 652
    nop

    .line 653
    nop

    .line 649
    move/from16 v23, v6

    move/from16 v6, v17

    move-object/from16 v24, v7

    move-object/from16 v0, v22

    move/from16 v22, v2

    move-object v7, v5

    move/from16 v5, v17

    move-object/from16 v17, v1

    move-wide/from16 v1, p3

    .end local v1    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "index$iv$iv":I
    .local v5, "tabRowHeight":I
    .local v7, "it":Landroidx/compose/ui/layout/Measurable;
    .local v17, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v22, "index$iv$iv":I
    .local v24, "tabMeasurables":Ljava/util/List;
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA(JIIII)J

    move-result-wide v3

    .line 648
    move v2, v5

    .end local v5    # "tabRowHeight":I
    .local v2, "tabRowHeight":I
    invoke-interface {v7, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    .line 1384
    .end local v7    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v21    # "$i$a$-fastMap-TabRowKt$TabRowImpl$1$2$1$tabPlaceables$1":I
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1385
    nop

    .line 1383
    .end local v19    # "it$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 1381
    .end local v18    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v0, v22, 0x1

    move-object/from16 v1, v17

    move/from16 v3, v23

    move-object/from16 v7, v24

    move/from16 v17, v2

    move v2, v0

    move-object/from16 v0, p1

    .end local v22    # "index$iv$iv":I
    .local v0, "index$iv$iv":I
    goto :goto_2

    .end local v0    # "index$iv$iv":I
    .end local v24    # "tabMeasurables":Ljava/util/List;
    .restart local v1    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v2, "index$iv$iv":I
    .local v7, "tabMeasurables":Ljava/util/List;
    .local v17, "tabRowHeight":I
    :cond_3
    move/from16 v22, v2

    move-object/from16 v24, v7

    move/from16 v2, v17

    move-object/from16 v17, v1

    .line 1386
    .end local v1    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "tabMeasurables":Ljava/util/List;
    .local v2, "tabRowHeight":I
    .local v17, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v24    # "tabMeasurables":Ljava/util/List;
    nop

    .line 1387
    .end local v16    # "$i$f$fastForEach":I
    .end local v17    # "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v12, v14

    check-cast v12, Ljava/util/List;

    .line 647
    .end local v12    # "$this$fastMap$iv":Ljava/util/List;
    .end local v13    # "$i$f$fastMap":I
    .end local v14    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 646
    nop

    .line 659
    .local v12, "tabPlaceables":Ljava/util/List;
    move-object v0, v8

    .local v0, "$this$fastMap$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 1388
    .local v1, "$i$f$fastMap":I
    nop

    .line 1389
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1390
    .local v3, "target$iv":Ljava/util/ArrayList;
    move-object v4, v0

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1391
    .local v5, "$i$f$fastForEach":I
    nop

    .line 1392
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    :goto_3
    if-ge v6, v7, :cond_4

    .line 1393
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1394
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 1395
    .local v16, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v17, v0

    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .local v17, "$this$fastMap$iv":Ljava/util/List;
    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    move/from16 v18, v1

    .end local v1    # "$i$f$fastMap":I
    .local v18, "$i$f$fastMap":I
    move-object v1, v14

    check-cast v1, Landroidx/compose/ui/layout/Measurable;

    .local v1, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v19, 0x0

    .line 659
    .local v19, "$i$a$-fastMap-TabRowKt$TabRowImpl$1$2$1$dividerPlaceables$1":I
    const/16 v31, 0xb

    const/16 v32, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-wide/from16 v25, p3

    move/from16 v20, v2

    move-object/from16 v21, v3

    .end local v2    # "tabRowHeight":I
    .end local v3    # "target$iv":Ljava/util/ArrayList;
    .local v20, "tabRowHeight":I
    .local v21, "target$iv":Ljava/util/ArrayList;
    invoke-static/range {v25 .. v32}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    .line 1395
    .end local v1    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v19    # "$i$a$-fastMap-TabRowKt$TabRowImpl$1$2$1$dividerPlaceables$1":I
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1396
    nop

    .line 1394
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 1392
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, v17

    move/from16 v1, v18

    move/from16 v2, v20

    move-object/from16 v3, v21

    goto :goto_3

    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastMap":I
    .end local v20    # "tabRowHeight":I
    .end local v21    # "target$iv":Ljava/util/ArrayList;
    .restart local v0    # "$this$fastMap$iv":Ljava/util/List;
    .local v1, "$i$f$fastMap":I
    .restart local v2    # "tabRowHeight":I
    .restart local v3    # "target$iv":Ljava/util/ArrayList;
    :cond_4
    move-object/from16 v17, v0

    move/from16 v18, v1

    move/from16 v20, v2

    move-object/from16 v21, v3

    .line 1397
    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastMap":I
    .end local v2    # "tabRowHeight":I
    .end local v3    # "target$iv":Ljava/util/ArrayList;
    .end local v6    # "index$iv$iv":I
    .restart local v17    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v18    # "$i$f$fastMap":I
    .restart local v20    # "tabRowHeight":I
    .restart local v21    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 1398
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    move-object/from16 v13, v21

    check-cast v13, Ljava/util/List;

    .line 659
    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastMap":I
    .end local v21    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 658
    nop

    .line 662
    .local v13, "dividerPlaceables":Ljava/util/List;
    move-object v0, v9

    .restart local v0    # "$this$fastMap$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 1399
    .local v7, "$i$f$fastMap":I
    nop

    .line 1400
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v14, v1

    .line 1401
    .local v14, "target$iv":Ljava/util/ArrayList;
    move-object v1, v0

    .local v1, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 1402
    .local v16, "$i$f$fastForEach":I
    nop

    .line 1403
    const/4 v2, 0x0

    .local v2, "index$iv$iv":I
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    :goto_4
    if-ge v2, v3, :cond_5

    .line 1404
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 1405
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    .local v18, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 1406
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v4, v14

    check-cast v4, Ljava/util/Collection;

    move-object/from16 v5, v18

    check-cast v5, Landroidx/compose/ui/layout/Measurable;

    .local v5, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 663
    .local v21, "$i$a$-fastMap-TabRowKt$TabRowImpl$1$2$1$indicatorPlaceables$1":I
    nop

    .line 664
    nop

    .line 665
    move v6, v3

    iget v3, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 666
    move-object/from16 v22, v4

    iget v4, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 667
    nop

    .line 668
    nop

    .line 664
    move-object/from16 v23, v5

    .end local v5    # "it":Landroidx/compose/ui/layout/Measurable;
    .local v23, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v5, 0x0

    move-object/from16 v25, v0

    move/from16 v26, v7

    move-object/from16 v0, v22

    move-object/from16 v7, v23

    move/from16 v23, v2

    move/from16 v22, v6

    move/from16 v6, v20

    move-object/from16 v20, v1

    move-wide/from16 v1, p3

    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .end local v1    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "index$iv$iv":I
    .local v6, "tabRowHeight":I
    .local v7, "it":Landroidx/compose/ui/layout/Measurable;
    .local v20, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v23, "index$iv$iv":I
    .local v25, "$this$fastMap$iv":Ljava/util/List;
    .local v26, "$i$f$fastMap":I
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA(JIIII)J

    move-result-wide v3

    .line 663
    move v2, v6

    .end local v6    # "tabRowHeight":I
    .local v2, "tabRowHeight":I
    invoke-interface {v7, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    .line 1406
    .end local v7    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v21    # "$i$a$-fastMap-TabRowKt$TabRowImpl$1$2$1$indicatorPlaceables$1":I
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1407
    nop

    .line 1405
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 1403
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v0, v23, 0x1

    move-object/from16 v1, v20

    move/from16 v3, v22

    move/from16 v7, v26

    move/from16 v20, v2

    move v2, v0

    move-object/from16 v0, v25

    .end local v23    # "index$iv$iv":I
    .local v0, "index$iv$iv":I
    goto :goto_4

    .end local v25    # "$this$fastMap$iv":Ljava/util/List;
    .end local v26    # "$i$f$fastMap":I
    .local v0, "$this$fastMap$iv":Ljava/util/List;
    .restart local v1    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v2, "index$iv$iv":I
    .local v7, "$i$f$fastMap":I
    .local v20, "tabRowHeight":I
    :cond_5
    move-object/from16 v25, v0

    move/from16 v23, v2

    move/from16 v2, v20

    move-object/from16 v20, v1

    .line 1408
    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .end local v1    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v2, "tabRowHeight":I
    .local v20, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v25    # "$this$fastMap$iv":Ljava/util/List;
    nop

    .line 1409
    .end local v16    # "$i$f$fastForEach":I
    .end local v20    # "$this$fastForEach$iv$iv":Ljava/util/List;
    check-cast v14, Ljava/util/List;

    .line 662
    .end local v7    # "$i$f$fastMap":I
    .end local v14    # "target$iv":Ljava/util/ArrayList;
    .end local v25    # "$this$fastMap$iv":Ljava/util/List;
    nop

    .line 661
    nop

    .line 673
    .local v14, "indicatorPlaceables":Ljava/util/List;
    new-instance v11, Landroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1$2;

    move/from16 v16, v2

    .end local v2    # "tabRowHeight":I
    .local v16, "tabRowHeight":I
    invoke-direct/range {v11 .. v16}, Landroidx/compose/material3/TabRowKt$TabRowImpl$1$2$1$2;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$IntRef;I)V

    .end local v16    # "tabRowHeight":I
    .restart local v2    # "tabRowHeight":I
    move-object v4, v11

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move/from16 v1, p2

    .end local p2    # "tabRowWidth":I
    .local v1, "tabRowWidth":I
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v3

    return-object v3
.end method
