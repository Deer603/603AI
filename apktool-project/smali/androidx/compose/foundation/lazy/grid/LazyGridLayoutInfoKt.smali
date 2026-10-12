.class public final Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt;
.super Ljava/lang/Object;
.source "LazyGridLayoutInfo.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyGridLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n59#2:134\n54#2:136\n90#3:135\n85#3:137\n*S KotlinDebug\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n*L\n117#1:134\n119#1:136\n117#1:135\n119#1:137\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "visibleLinesAverageMainAxisSize",
        "",
        "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final visibleLinesAverageMainAxisSize(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I
    .locals 18
    .param p0, "$this$visibleLinesAverageMainAxisSize"    # Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;

    .line 93
    move-object/from16 v0, p0

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getOrientation()Landroidx/compose/foundation/gestures/Orientation;

    move-result-object v1

    sget-object v2, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 94
    .local v1, "isVertical":Z
    :goto_0
    invoke-interface {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v2

    .line 98
    .local v2, "visibleItems":Ljava/util/List;
    const/4 v3, 0x0

    .line 99
    .local v3, "totalLinesMainAxisSize":I
    const/4 v4, 0x0

    .line 101
    .local v4, "linesCount":I
    const/4 v5, 0x0

    .line 102
    .local v5, "lineStartIndex":I
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    .line 103
    invoke-static {v1, v0, v5}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt;->visibleLinesAverageMainAxisSize$lineOf(ZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;I)I

    move-result v6

    .line 104
    .local v6, "currentLine":I
    const/4 v7, -0x1

    if-ne v6, v7, :cond_1

    .line 106
    add-int/lit8 v5, v5, 0x1

    .line 107
    goto :goto_1

    .line 110
    :cond_1
    const/4 v7, 0x0

    .line 111
    .local v7, "lineMainAxisSize":I
    move v8, v5

    .line 112
    .local v8, "lineEndIndex":I
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_3

    invoke-static {v1, v0, v8}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt;->visibleLinesAverageMainAxisSize$lineOf(ZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;I)I

    move-result v9

    if-ne v9, v6, :cond_3

    .line 114
    nop

    .line 116
    if-eqz v1, :cond_2

    .line 117
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    invoke-interface {v9}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getSize-YbymL2g()J

    move-result-wide v9

    .local v9, "arg0$iv":J
    const/4 v11, 0x0

    .line 134
    .local v11, "$i$f$getHeight-impl":I
    move-wide v12, v9

    .local v12, "value$iv$iv":J
    const/4 v14, 0x0

    .line 135
    .local v14, "$i$f$unpackInt2":I
    const-wide v15, 0xffffffffL

    move/from16 v17, v1

    .end local v1    # "isVertical":Z
    .local v17, "isVertical":Z
    and-long v0, v12, v15

    long-to-int v0, v0

    .line 134
    .end local v12    # "value$iv$iv":J
    .end local v14    # "$i$f$unpackInt2":I
    nop

    .end local v9    # "arg0$iv":J
    .end local v11    # "$i$f$getHeight-impl":I
    goto :goto_3

    .line 119
    .end local v17    # "isVertical":Z
    .restart local v1    # "isVertical":Z
    :cond_2
    move/from16 v17, v1

    .end local v1    # "isVertical":Z
    .restart local v17    # "isVertical":Z
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getSize-YbymL2g()J

    move-result-wide v0

    .local v0, "arg0$iv":J
    const/4 v9, 0x0

    .line 136
    .local v9, "$i$f$getWidth-impl":I
    move-wide v10, v0

    .local v10, "value$iv$iv":J
    const/4 v12, 0x0

    .line 137
    .local v12, "$i$f$unpackInt1":I
    const/16 v13, 0x20

    shr-long v13, v10, v13

    long-to-int v10, v13

    .line 136
    .end local v10    # "value$iv$iv":J
    .end local v12    # "$i$f$unpackInt1":I
    move v0, v10

    .line 114
    .end local v0    # "arg0$iv":J
    .end local v9    # "$i$f$getWidth-impl":I
    :goto_3
    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 113
    move v7, v0

    .line 122
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v17

    goto :goto_2

    .line 112
    .end local v17    # "isVertical":Z
    .restart local v1    # "isVertical":Z
    :cond_3
    move/from16 v17, v1

    .line 125
    .end local v1    # "isVertical":Z
    .restart local v17    # "isVertical":Z
    add-int/2addr v3, v7

    .line 126
    add-int/lit8 v4, v4, 0x1

    .line 128
    move v5, v8

    move-object/from16 v0, p0

    move/from16 v1, v17

    .end local v6    # "currentLine":I
    .end local v7    # "lineMainAxisSize":I
    .end local v8    # "lineEndIndex":I
    goto :goto_1

    .line 131
    .end local v17    # "isVertical":Z
    .restart local v1    # "isVertical":Z
    :cond_4
    move/from16 v17, v1

    .end local v1    # "isVertical":Z
    .restart local v17    # "isVertical":Z
    div-int v0, v3, v4

    invoke-interface/range {p0 .. p0}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getMainAxisItemSpacing()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private static final visibleLinesAverageMainAxisSize$lineOf(ZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;I)I
    .locals 1
    .param p0, "isVertical"    # Z
    .param p1, "$this_visibleLinesAverageMainAxisSize"    # Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;
    .param p2, "index"    # I

    .line 96
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    if-eqz p0, :cond_0

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getRow()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getColumn()I

    move-result v0

    :goto_0
    return v0
.end method
