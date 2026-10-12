.class public final Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;
.super Ljava/lang/Object;
.source "LazyGridMeasure.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,635:1\n467#1,3:658\n470#1,16:665\n487#1:682\n467#1,3:683\n470#1:690\n471#1,15:701\n487#1:717\n96#2,5:636\n96#2,5:641\n96#2,5:653\n50#2,5:745\n96#2,5:760\n107#2,7:765\n107#2,7:772\n54#3:646\n59#3:648\n54#3:718\n59#3:720\n85#4:647\n90#4:649\n85#4:719\n90#4:721\n26#5:650\n26#5:651\n26#5:652\n34#6,4:661\n39#6:681\n34#6,4:686\n102#6,2:691\n34#6,4:693\n39#6:699\n104#6:700\n39#6:716\n34#6,6:722\n34#6,6:728\n102#6,2:735\n34#6,4:737\n39#6:743\n104#6:744\n133#6,3:750\n34#6,6:753\n136#6:759\n52#6,6:779\n34#6,6:785\n34#6,6:791\n12474#7,2:697\n12474#7,2:741\n1#8:734\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n290#1:658,3\n290#1:665,16\n290#1:682\n308#1:683,3\n308#1:690\n308#1:701,15\n308#1:717\n82#1:636,5\n83#1:641,5\n283#1:653,5\n562#1:745,5\n568#1:760,5\n575#1:765,7\n580#1:772,7\n107#1:646\n108#1:648\n393#1:718\n395#1:720\n107#1:647\n108#1:649\n393#1:719\n395#1:721\n137#1:650\n265#1:651\n266#1:652\n290#1:661,4\n290#1:681\n308#1:686,4\n315#1:691,2\n315#1:693,4\n315#1:699\n315#1:700\n308#1:716\n398#1:722,6\n469#1:728,6\n530#1:735,2\n530#1:737,4\n530#1:743\n530#1:744\n565#1:750,3\n565#1:753,6\n565#1:759\n608#1:779,6\n615#1:785,6\n620#1:791,6\n316#1:697,2\n530#1:741,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u001aA\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0082\u0008\u001a\u008c\u0001\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001aF\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00012\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\"\u001a\u00020\u000b2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00012\u0008\u0010$\u001a\u0004\u0018\u00010%H\u0002\u001a\u00dc\u0002\u0010&\u001a\u00020\'2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010\u0017\u001a\u00020\u000b2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u0002032\u0006\u00104\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0008\u00106\u001a\u0004\u0018\u00010%2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<23\u0010=\u001a/\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008>\u0012\u0008\u0008?\u0012\u0004\u0008\u0008(@\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002010A0\u00010\n2\u0008\u0010B\u001a\u0004\u0018\u00010C2/\u0010D\u001a+\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G0\n\u00a2\u0006\u0002\u0008H\u0012\u0004\u0012\u00020I0EH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008J\u0010K\u001a+\u0010L\u001a\u00020G\"\u0004\u0008\u0000\u0010M*\u0008\u0012\u0004\u0012\u0002HM0\r2\u000c\u0010N\u001a\u0008\u0012\u0004\u0012\u0002HM0OH\u0002\u00a2\u0006\u0002\u0010P\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006Q"
    }
    d2 = {
        "calculateExtraItems",
        "",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
        "pinnedItems",
        "",
        "measuredItemProvider",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;",
        "measuredLineProvider",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;",
        "filter",
        "Lkotlin/Function1;",
        "",
        "calculateItemsOffsets",
        "",
        "lines",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;",
        "itemsBefore",
        "itemsAfter",
        "layoutWidth",
        "layoutHeight",
        "finalMainAxisOffset",
        "maxOffset",
        "firstLineScrollOffset",
        "isVertical",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "reverseLayout",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "linesRetainedForLookahead",
        "lastVisibleItemIndex",
        "itemsCount",
        "isLookingAhead",
        "visibleLines",
        "lastApproachLayoutInfo",
        "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;",
        "measureLazyGrid",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
        "mainAxisAvailableSize",
        "beforeContentPadding",
        "afterContentPadding",
        "spaceBetweenLines",
        "firstVisibleLineIndex",
        "firstVisibleLineScrollOffset",
        "scrollToBeConsumed",
        "",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "itemAnimator",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;",
        "slotsPerLine",
        "isInLookaheadScope",
        "approachLayoutInfo",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "placementScopeInvalidator",
        "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;",
        "graphicsContext",
        "Landroidx/compose/ui/graphics/GraphicsContext;",
        "prefetchInfoRetriever",
        "Lkotlin/ParameterName;",
        "name",
        "line",
        "Lkotlin/Pair;",
        "stickyItemsScrollBehavior",
        "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
        "layout",
        "Lkotlin/Function3;",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measureLazyGrid-GyuLg2I",
        "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
        "addAllFromArray",
        "T",
        "arr",
        "",
        "(Ljava/util/List;[Ljava/lang/Object;)V",
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
.method private static final addAllFromArray(Ljava/util/List;[Ljava/lang/Object;)V
    .locals 3
    .param p0, "$this$addAllFromArray"    # Ljava/util/List;
    .param p1, "arr"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;[TT;)V"
        }
    .end annotation

    .line 631
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 632
    .local v2, "item":Ljava/lang/Object;
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 631
    .end local v2    # "item":Ljava/lang/Object;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 634
    :cond_0
    return-void
.end method

.method private static final calculateExtraItems(Ljava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 16
    .param p0, "pinnedItems"    # Ljava/util/List;
    .param p1, "measuredItemProvider"    # Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;
    .param p2, "measuredLineProvider"    # Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;
    .param p3, "filter"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    const/4 v1, 0x0

    .line 467
    .local v1, "$i$f$calculateExtraItems":I
    const/4 v2, 0x0

    .line 469
    .local v2, "items":Ljava/lang/Object;
    move-object/from16 v3, p0

    .local v3, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 728
    .local v4, "$i$f$fastForEach":I
    nop

    .line 729
    const/4 v5, 0x0

    .local v5, "index$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_2

    .line 730
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 731
    .local v7, "item$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v10

    .local v10, "index":I
    const/4 v8, 0x0

    .line 470
    .local v8, "$i$a$-fastForEach-LazyGridMeasureKt$calculateExtraItems$1":I
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v15, p3

    invoke-interface {v15, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 471
    invoke-virtual {v0, v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->spanOf(I)I

    move-result v12

    .line 472
    .local v12, "span":I
    const/4 v9, 0x0

    invoke-virtual {v0, v9, v12}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->childConstraints-JhjzzOo$foundation_release(II)J

    move-result-wide v13

    .line 474
    .local v13, "constraints":J
    nop

    .line 475
    nop

    .line 477
    nop

    .line 478
    nop

    .line 476
    nop

    .line 474
    const/4 v11, 0x0

    move-object/from16 v9, p1

    invoke-virtual/range {v9 .. v14}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getAndMeasure--hBUhpc(IIIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v11

    .line 473
    nop

    .line 480
    .local v11, "measuredItem":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    if-nez v2, :cond_0

    .line 481
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    move-object v2, v9

    check-cast v2, Ljava/util/List;

    .line 483
    :cond_0
    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 485
    .end local v11    # "measuredItem":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    .end local v12    # "span":I
    .end local v13    # "constraints":J
    :cond_1
    nop

    .line 731
    .end local v8    # "$i$a$-fastForEach-LazyGridMeasureKt$calculateExtraItems$1":I
    .end local v10    # "index":I
    nop

    .line 729
    .end local v7    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move-object/from16 v15, p3

    .line 733
    .end local v5    # "index$iv":I
    nop

    .line 487
    .end local v3    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    if-nez v2, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v2

    :goto_1
    return-object v3
.end method

.method private static final calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;
    .locals 22
    .param p0, "lines"    # Ljava/util/List;
    .param p1, "itemsBefore"    # Ljava/util/List;
    .param p2, "itemsAfter"    # Ljava/util/List;
    .param p3, "layoutWidth"    # I
    .param p4, "layoutHeight"    # I
    .param p5, "finalMainAxisOffset"    # I
    .param p6, "maxOffset"    # I
    .param p7, "firstLineScrollOffset"    # I
    .param p8, "isVertical"    # Z
    .param p9, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p10, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p11, "reverseLayout"    # Z
    .param p12, "density"    # Landroidx/compose/ui/unit/Density;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;IIIIIZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 559
    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move/from16 v3, p11

    if-eqz p8, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    move v7, v4

    .line 560
    .local v7, "mainAxisLayoutSize":I
    move/from16 v4, p6

    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    move-result v5

    move/from16 v11, p5

    if-ge v11, v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    move v12, v5

    .line 561
    .local v12, "hasSpareSpace":Z
    if-eqz v12, :cond_4

    .line 562
    if-nez p7, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    .local v5, "value$iv":Z
    :goto_2
    const/4 v9, 0x0

    .line 745
    .local v9, "$i$f$checkPrecondition":I
    nop

    .line 746
    if-nez v5, :cond_3

    .line 747
    const/4 v10, 0x0

    .line 562
    .local v10, "$i$a$-checkPrecondition-LazyGridMeasureKt$calculateItemsOffsets$1":I
    nop

    .line 747
    .end local v10    # "$i$a$-checkPrecondition-LazyGridMeasureKt$calculateItemsOffsets$1":I
    const-string/jumbo v10, "non-zero firstLineScrollOffset"

    invoke-static {v10}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 749
    :cond_3
    nop

    .line 565
    .end local v5    # "value$iv":Z
    .end local v9    # "$i$f$checkPrecondition":I
    :cond_4
    move-object/from16 v5, p0

    .local v5, "$this$fastSumBy$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 750
    .local v9, "$i$f$fastSumBy":I
    nop

    .line 751
    const/4 v10, 0x0

    .line 752
    .local v10, "sum$iv":I
    move-object v13, v5

    .local v13, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 753
    .local v14, "$i$f$fastForEach":I
    nop

    .line 754
    const/4 v15, 0x0

    .local v15, "index$iv$iv":I
    move-object/from16 v16, v13

    check-cast v16, Ljava/util/Collection;

    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_3
    if-ge v15, v8, :cond_5

    .line 755
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 756
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v16

    .local v18, "element$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 752
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastSumBy$2$iv":I
    move-object/from16 v20, v18

    check-cast v20, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .local v20, "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    const/16 v21, 0x0

    .line 565
    .local v21, "$i$a$-fastSumBy-LazyGridMeasureKt$calculateItemsOffsets$positionedItems$1":I
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v6

    array-length v6, v6

    .line 752
    .end local v20    # "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .end local v21    # "$i$a$-fastSumBy-LazyGridMeasureKt$calculateItemsOffsets$positionedItems$1":I
    add-int/2addr v10, v6

    .line 756
    .end local v18    # "element$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastSumBy$2$iv":I
    nop

    .line 754
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v15, v15, 0x1

    goto :goto_3

    .line 758
    .end local v15    # "index$iv$iv":I
    :cond_5
    nop

    .line 759
    .end local v13    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastForEach":I
    nop

    .line 565
    .end local v5    # "$this$fastSumBy$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastSumBy":I
    .end local v10    # "sum$iv":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v10}, Ljava/util/ArrayList;-><init>(I)V

    move-object v13, v5

    .line 567
    .local v13, "positionedItems":Ljava/util/ArrayList;
    if-eqz v12, :cond_11

    .line 568
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v8, 0x1

    goto :goto_4

    :cond_6
    const/4 v8, 0x0

    .local v8, "value$iv":Z
    :goto_4
    const/4 v5, 0x0

    .line 760
    .local v5, "$i$f$requirePrecondition":I
    nop

    .line 761
    if-nez v8, :cond_7

    .line 762
    const/4 v6, 0x0

    .line 568
    .local v6, "$i$a$-requirePrecondition-LazyGridMeasureKt$calculateItemsOffsets$2":I
    nop

    .line 762
    .end local v6    # "$i$a$-requirePrecondition-LazyGridMeasureKt$calculateItemsOffsets$2":I
    const-string/jumbo v6, "no items"

    invoke-static {v6}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 764
    :cond_7
    nop

    .line 569
    .end local v5    # "$i$f$requirePrecondition":I
    .end local v8    # "value$iv":Z
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v14

    .line 572
    .local v14, "linesCount":I
    new-array v8, v14, [I

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v14, :cond_8

    invoke-static {v6, v3, v14}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    move-result v5

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSize()I

    move-result v5

    aput v5, v8, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 573
    .local v8, "sizes":[I
    :cond_8
    new-array v10, v14, [I

    .line 574
    .local v10, "offsets":[I
    if-eqz p8, :cond_a

    .line 575
    const/4 v5, 0x0

    .line 765
    .local v5, "$i$f$requirePreconditionNotNull":I
    nop

    .line 767
    if-eqz p9, :cond_9

    .line 771
    nop

    .line 575
    .end local v5    # "$i$f$requirePreconditionNotNull":I
    move-object/from16 v5, p9

    .local v5, "$this$calculateItemsOffsets_u24lambda_u2417":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    const/4 v6, 0x0

    .line 576
    .local v6, "$i$a$-with-LazyGridMeasureKt$calculateItemsOffsets$4":I
    move-object/from16 v9, p12

    invoke-interface {v5, v9, v7, v8, v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 577
    nop

    .line 575
    .end local v5    # "$this$calculateItemsOffsets_u24lambda_u2417":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v6    # "$i$a$-with-LazyGridMeasureKt$calculateItemsOffsets$4":I
    goto :goto_6

    .line 768
    .local v5, "$i$f$requirePreconditionNotNull":I
    :cond_9
    move-object/from16 v9, p12

    const/4 v6, 0x0

    .line 575
    .local v6, "$i$a$-requirePreconditionNotNull-LazyGridMeasureKt$calculateItemsOffsets$3":I
    nop

    .line 768
    .end local v6    # "$i$a$-requirePreconditionNotNull-LazyGridMeasureKt$calculateItemsOffsets$3":I
    const-string/jumbo v6, "null verticalArrangement"

    invoke-static {v6}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v6, Lkotlin/KotlinNothingValueException;

    invoke-direct {v6}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v6

    .line 580
    .end local v5    # "$i$f$requirePreconditionNotNull":I
    :cond_a
    move-object/from16 v9, p12

    const/4 v5, 0x0

    .line 772
    .restart local v5    # "$i$f$requirePreconditionNotNull":I
    nop

    .line 774
    if-eqz p10, :cond_10

    .line 778
    nop

    .line 579
    .end local v5    # "$i$f$requirePreconditionNotNull":I
    move-object/from16 v5, p10

    .local v5, "$this$calculateItemsOffsets_u24lambda_u2419":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const/4 v15, 0x0

    .line 583
    .local v15, "$i$a$-with-LazyGridMeasureKt$calculateItemsOffsets$6":I
    sget-object v9, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    move-object/from16 v6, p12

    invoke-interface/range {v5 .. v10}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 584
    nop

    .line 579
    .end local v5    # "$this$calculateItemsOffsets_u24lambda_u2419":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v15    # "$i$a$-with-LazyGridMeasureKt$calculateItemsOffsets$6":I
    nop

    .line 588
    :goto_6
    invoke-static {v10}, Lkotlin/collections/ArraysKt;->getIndices([I)Lkotlin/ranges/IntRange;

    move-result-object v5

    check-cast v5, Lkotlin/ranges/IntProgression;

    if-eqz v3, :cond_b

    invoke-static {v5}, Lkotlin/ranges/RangesKt;->reversed(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;

    move-result-object v5

    .line 587
    :cond_b
    nop

    .line 590
    .local v5, "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v6

    .local v6, "index":I
    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v9

    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getStep()I

    move-result v15

    if-lez v15, :cond_c

    if-le v6, v9, :cond_d

    :cond_c
    if-gez v15, :cond_f

    if-gt v9, v6, :cond_f

    .line 591
    :cond_d
    :goto_7
    aget v16, v10, v6

    .line 593
    .local v16, "absoluteOffset":I
    invoke-static {v6, v3, v14}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    move-result v4

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 595
    .local v4, "line":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    if-eqz v3, :cond_e

    .line 597
    sub-int v17, v7, v16

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSize()I

    move-result v18

    sub-int v17, v17, v18

    goto :goto_8

    .line 599
    :cond_e
    move/from16 v17, v16

    .line 595
    :goto_8
    nop

    .line 594
    move/from16 v18, v17

    .line 601
    .local v18, "relativeOffset":I
    move-object v0, v13

    check-cast v0, Ljava/util/List;

    .line 602
    move-object/from16 v17, v5

    move/from16 v3, v18

    .end local v5    # "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    .end local v18    # "relativeOffset":I
    .local v3, "relativeOffset":I
    .local v17, "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    invoke-virtual {v4, v3, v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->position(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v5

    .line 601
    invoke-static {v0, v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->addAllFromArray(Ljava/util/List;[Ljava/lang/Object;)V

    .line 590
    .end local v3    # "relativeOffset":I
    .end local v4    # "line":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .end local v16    # "absoluteOffset":I
    if-eq v6, v9, :cond_16

    add-int/2addr v6, v15

    move-object/from16 v0, p0

    move/from16 v4, p6

    move/from16 v3, p11

    move-object/from16 v5, v17

    goto :goto_7

    .end local v17    # "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    .restart local v5    # "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    :cond_f
    move-object/from16 v17, v5

    .end local v5    # "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    .restart local v17    # "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    goto/16 :goto_b

    .line 775
    .end local v6    # "index":I
    .end local v17    # "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    .local v5, "$i$f$requirePreconditionNotNull":I
    :cond_10
    const/4 v0, 0x0

    .line 580
    .local v0, "$i$a$-requirePreconditionNotNull-LazyGridMeasureKt$calculateItemsOffsets$5":I
    nop

    .line 775
    .end local v0    # "$i$a$-requirePreconditionNotNull-LazyGridMeasureKt$calculateItemsOffsets$5":I
    const-string/jumbo v0, "null horizontalArrangement"

    invoke-static {v0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    .line 606
    .end local v5    # "$i$f$requirePreconditionNotNull":I
    .end local v8    # "sizes":[I
    .end local v10    # "offsets":[I
    .end local v14    # "linesCount":I
    :cond_11
    const/4 v0, 0x0

    .local v0, "currentMainAxis":I
    move/from16 v0, p7

    .line 608
    move-object/from16 v3, p1

    .local v3, "$this$fastForEachReversed$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 779
    .local v4, "$i$f$fastForEachReversed":I
    nop

    .line 780
    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ltz v5, :cond_13

    :cond_12
    move v6, v5

    .local v6, "index$iv":I
    add-int/lit8 v5, v5, -0x1

    .line 781
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 782
    .local v8, "item$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .local v9, "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    const/4 v10, 0x0

    .line 609
    .local v10, "$i$a$-fastForEachReversed-LazyGridMeasureKt$calculateItemsOffsets$7":I
    invoke-virtual {v9}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v14

    sub-int/2addr v0, v14

    .line 610
    const/4 v14, 0x0

    invoke-virtual {v9, v0, v14, v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->position(IIII)V

    .line 611
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 612
    nop

    .line 782
    .end local v9    # "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    .end local v10    # "$i$a$-fastForEachReversed-LazyGridMeasureKt$calculateItemsOffsets$7":I
    nop

    .line 780
    .end local v8    # "item$iv":Ljava/lang/Object;
    if-gez v5, :cond_12

    .line 784
    .end local v6    # "index$iv":I
    :cond_13
    nop

    .line 614
    .end local v3    # "$this$fastForEachReversed$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEachReversed":I
    move/from16 v0, p7

    .line 615
    move-object/from16 v3, p0

    .local v3, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 785
    .local v4, "$i$f$fastForEach":I
    nop

    .line 786
    const/4 v5, 0x0

    .local v5, "index$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_9
    if-ge v5, v6, :cond_14

    .line 787
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 788
    .restart local v8    # "item$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .local v9, "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    const/4 v10, 0x0

    .line 616
    .local v10, "$i$a$-fastForEach-LazyGridMeasureKt$calculateItemsOffsets$8":I
    move-object v14, v13

    check-cast v14, Ljava/util/List;

    invoke-virtual {v9, v0, v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->position(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v15

    invoke-static {v14, v15}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->addAllFromArray(Ljava/util/List;[Ljava/lang/Object;)V

    .line 617
    invoke-virtual {v9}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v14

    add-int/2addr v0, v14

    .line 618
    nop

    .line 788
    .end local v9    # "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .end local v10    # "$i$a$-fastForEach-LazyGridMeasureKt$calculateItemsOffsets$8":I
    nop

    .line 786
    .end local v8    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    .line 790
    .end local v5    # "index$iv":I
    :cond_14
    nop

    .line 620
    .end local v3    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    move-object/from16 v3, p2

    .restart local v3    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 791
    .restart local v4    # "$i$f$fastForEach":I
    nop

    .line 792
    const/4 v5, 0x0

    .restart local v5    # "index$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_a
    if-ge v5, v6, :cond_15

    .line 793
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 794
    .restart local v8    # "item$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .local v9, "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    const/4 v10, 0x0

    .line 621
    .local v10, "$i$a$-fastForEach-LazyGridMeasureKt$calculateItemsOffsets$9":I
    const/4 v14, 0x0

    invoke-virtual {v9, v0, v14, v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->position(IIII)V

    .line 622
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 623
    invoke-virtual {v9}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v15

    add-int/2addr v0, v15

    .line 624
    nop

    .line 794
    .end local v9    # "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    .end local v10    # "$i$a$-fastForEach-LazyGridMeasureKt$calculateItemsOffsets$9":I
    nop

    .line 792
    .end local v8    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    .line 796
    .end local v5    # "index$iv":I
    :cond_15
    nop

    .line 626
    .end local v0    # "currentMainAxis":I
    .end local v3    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    :cond_16
    :goto_b
    move-object v0, v13

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final calculateItemsOffsets$reverseAware(IZI)I
    .locals 1
    .param p0, "$this$calculateItemsOffsets_u24reverseAware"    # I
    .param p1, "$reverseLayout"    # Z
    .param p2, "linesCount"    # I

    .line 570
    if-nez p1, :cond_0

    move v0, p0

    goto :goto_0

    :cond_0
    sub-int v0, p2, p0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0
.end method

.method private static final linesRetainedForLookahead(IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;ZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)Ljava/util/List;
    .locals 25
    .param p0, "lastVisibleItemIndex"    # I
    .param p1, "itemsCount"    # I
    .param p2, "measuredLineProvider"    # Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;
    .param p3, "isLookingAhead"    # Z
    .param p4, "visibleLines"    # Ljava/util/List;
    .param p5, "lastApproachLayoutInfo"    # Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;",
            "Z",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;",
            ">;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;",
            ">;"
        }
    .end annotation

    .line 503
    move/from16 v0, p0

    const/4 v1, 0x0

    .line 505
    .local v1, "list":Ljava/util/List;
    if-eqz p3, :cond_10

    .line 507
    nop

    .line 508
    if-eqz p5, :cond_f

    invoke-interface/range {p5 .. p5}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_f

    .line 513
    invoke-interface/range {p5 .. p5}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v2

    .local v2, "$this$linesRetainedForLookahead_u24lambda_u249":Ljava/util/List;
    const/4 v3, 0x0

    .line 514
    .local v3, "$i$a$-run-LazyGridMeasureKt$linesRetainedForLookahead$firstItem$1":I
    const/4 v4, 0x0

    .line 515
    .local v4, "found":Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    .local v5, "i":I
    :goto_0
    const/4 v7, -0x1

    if-ge v7, v5, :cond_2

    .line 516
    nop

    .line 517
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    invoke-interface {v7}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    move-result v7

    if-le v7, v0, :cond_1

    .line 518
    if-eqz v5, :cond_0

    add-int/lit8 v7, v5, -0x1

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    invoke-interface {v7}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    move-result v7

    if-gt v7, v0, :cond_1

    .line 520
    :cond_0
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v4, v7

    check-cast v4, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 521
    goto :goto_1

    .line 515
    :cond_1
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 524
    .end local v5    # "i":I
    :cond_2
    :goto_1
    nop

    .line 513
    .end local v2    # "$this$linesRetainedForLookahead_u24lambda_u249":Ljava/util/List;
    .end local v3    # "$i$a$-run-LazyGridMeasureKt$linesRetainedForLookahead$firstItem$1":I
    .end local v4    # "found":Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;
    nop

    .line 512
    nop

    .line 526
    .local v4, "firstItem":Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;
    invoke-interface/range {p5 .. p5}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 527
    .local v2, "lastVisibleItem":Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;
    invoke-static/range {p4 .. p4}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    if-eqz v3, :cond_3

    .line 734
    .local v3, "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    const/4 v7, 0x0

    .line 527
    .local v7, "$i$a$-let-LazyGridMeasureKt$linesRetainedForLookahead$lineIndex$1":I
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getIndex()I

    move-result v8

    add-int/2addr v8, v6

    .end local v3    # "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .end local v7    # "$i$a$-let-LazyGridMeasureKt$linesRetainedForLookahead$lineIndex$1":I
    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    .line 528
    .local v8, "lineIndex":I
    :goto_2
    if-eqz v4, :cond_e

    .line 529
    invoke-interface {v4}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    move-result v3

    .local v3, "i":I
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    move-result v7

    add-int/lit8 v9, p1, -0x1

    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    move-result v7

    if-gt v3, v7, :cond_d

    .line 530
    :goto_3
    if-eqz v1, :cond_9

    move-object v9, v1

    .local v9, "$this$fastAny$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 735
    .local v10, "$i$f$fastAny":I
    nop

    .line 736
    move-object v11, v9

    .local v11, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v12, 0x0

    .line 737
    .local v12, "$i$f$fastForEach":I
    nop

    .line 738
    const/4 v13, 0x0

    .local v13, "index$iv$iv":I
    move-object v14, v11

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->size()I

    move-result v14

    :goto_4
    if-ge v13, v14, :cond_8

    .line 739
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 740
    .local v15, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    .local v16, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 736
    .local v17, "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    move-object/from16 v18, v16

    check-cast v18, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .local v18, "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    const/16 v19, 0x0

    .line 530
    .local v19, "$i$a$-fastAny-LazyGridMeasureKt$linesRetainedForLookahead$1":I
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v5

    .local v5, "$this$any$iv":[Ljava/lang/Object;
    const/16 v20, 0x0

    .line 741
    .local v20, "$i$f$any":I
    array-length v6, v5

    const/4 v0, 0x0

    :goto_5
    if-ge v0, v6, :cond_6

    aget-object v21, v5, v0

    .local v21, "element$iv":Ljava/lang/Object;
    move-object/from16 v22, v21

    .local v22, "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    const/16 v23, 0x0

    .line 530
    .local v23, "$i$a$-any-LazyGridMeasureKt$linesRetainedForLookahead$1$1":I
    move/from16 v24, v0

    invoke-virtual/range {v22 .. v22}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    move-result v0

    if-ne v0, v3, :cond_4

    const/4 v0, 0x1

    goto :goto_6

    :cond_4
    const/4 v0, 0x0

    .line 741
    .end local v22    # "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    .end local v23    # "$i$a$-any-LazyGridMeasureKt$linesRetainedForLookahead$1$1":I
    :goto_6
    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_7

    .end local v21    # "element$iv":Ljava/lang/Object;
    :cond_5
    add-int/lit8 v0, v24, 0x1

    goto :goto_5

    .line 742
    :cond_6
    const/4 v0, 0x0

    .line 530
    .end local v5    # "$this$any$iv":[Ljava/lang/Object;
    .end local v20    # "$i$f$any":I
    :goto_7
    nop

    .line 736
    .end local v18    # "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .end local v19    # "$i$a$-fastAny-LazyGridMeasureKt$linesRetainedForLookahead$1":I
    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_8

    .line 740
    .end local v16    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    :cond_7
    nop

    .line 738
    .end local v15    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v13, v13, 0x1

    const/4 v6, 0x1

    move/from16 v0, p0

    goto :goto_4

    .line 743
    .end local v13    # "index$iv$iv":I
    :cond_8
    nop

    .line 744
    .end local v11    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v12    # "$i$f$fastForEach":I
    const/4 v0, 0x0

    .line 530
    .end local v9    # "$this$fastAny$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastAny":I
    :goto_8
    const/4 v5, 0x1

    if-ne v0, v5, :cond_a

    move v0, v5

    goto :goto_9

    :cond_9
    move v5, v6

    :cond_a
    const/4 v0, 0x0

    :goto_9
    if-nez v0, :cond_c

    .line 531
    if-nez v1, :cond_b

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 532
    :cond_b
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v6

    .line 533
    .local v6, "measuredLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    add-int/lit8 v8, v8, 0x1

    .line 534
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 530
    .end local v6    # "measuredLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    :cond_c
    move-object/from16 v0, p2

    .line 529
    :goto_a
    if-eq v3, v7, :cond_11

    add-int/lit8 v3, v3, 0x1

    move/from16 v0, p0

    move v6, v5

    goto :goto_3

    :cond_d
    move-object/from16 v0, p2

    goto :goto_b

    .line 528
    .end local v3    # "i":I
    :cond_e
    move-object/from16 v0, p2

    goto :goto_b

    .line 508
    .end local v2    # "lastVisibleItem":Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;
    .end local v4    # "firstItem":Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;
    .end local v8    # "lineIndex":I
    :cond_f
    move-object/from16 v0, p2

    goto :goto_b

    .line 505
    :cond_10
    move-object/from16 v0, p2

    .line 540
    :cond_11
    :goto_b
    if-nez v1, :cond_12

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_c

    :cond_12
    move-object v2, v1

    :goto_c
    return-object v2
.end method

.method public static final measureLazyGrid-GyuLg2I(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .locals 63
    .param p0, "itemsCount"    # I
    .param p1, "measuredLineProvider"    # Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;
    .param p2, "measuredItemProvider"    # Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;
    .param p3, "mainAxisAvailableSize"    # I
    .param p4, "beforeContentPadding"    # I
    .param p5, "afterContentPadding"    # I
    .param p6, "spaceBetweenLines"    # I
    .param p7, "firstVisibleLineIndex"    # I
    .param p8, "firstVisibleLineScrollOffset"    # I
    .param p9, "scrollToBeConsumed"    # F
    .param p10, "constraints"    # J
    .param p12, "isVertical"    # Z
    .param p13, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p14, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p15, "reverseLayout"    # Z
    .param p16, "density"    # Landroidx/compose/ui/unit/Density;
    .param p17, "itemAnimator"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .param p18, "slotsPerLine"    # I
    .param p19, "pinnedItems"    # Ljava/util/List;
    .param p20, "isInLookaheadScope"    # Z
    .param p21, "isLookingAhead"    # Z
    .param p22, "approachLayoutInfo"    # Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;
    .param p23, "coroutineScope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p24, "placementScopeInvalidator"    # Landroidx/compose/runtime/MutableState;
    .param p25, "graphicsContext"    # Landroidx/compose/ui/graphics/GraphicsContext;
    .param p26, "prefetchInfoRetriever"    # Lkotlin/jvm/functions/Function1;
    .param p27, "stickyItemsScrollBehavior"    # Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;
    .param p28, "layout"    # Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;",
            "IIIIIIFJZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;ZZ",
            "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/unit/Constraints;",
            ">;>;>;",
            "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/Unit;",
            ">;+",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;)",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;"
        }
    .end annotation

    .line 82
    move/from16 v15, p0

    move-object/from16 v2, p1

    move/from16 v9, p4

    move-wide/from16 v10, p10

    move-object/from16 v12, p28

    const/4 v13, 0x0

    const/16 v27, 0x1

    if-ltz v9, :cond_0

    move/from16 v0, v27

    goto :goto_0

    :cond_0
    move v0, v13

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 636
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 637
    if-nez v0, :cond_1

    .line 638
    const/4 v3, 0x0

    .line 82
    .local v3, "$i$a$-requirePrecondition-LazyGridMeasureKt$measureLazyGrid$1":I
    nop

    .line 638
    .end local v3    # "$i$a$-requirePrecondition-LazyGridMeasureKt$measureLazyGrid$1":I
    const-string/jumbo v3, "negative beforeContentPadding"

    invoke-static {v3}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 640
    :cond_1
    nop

    .line 83
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    if-ltz p5, :cond_2

    move/from16 v0, v27

    goto :goto_1

    :cond_2
    move v0, v13

    .restart local v0    # "value$iv":Z
    :goto_1
    const/4 v1, 0x0

    .line 641
    .restart local v1    # "$i$f$requirePrecondition":I
    nop

    .line 642
    if-nez v0, :cond_3

    .line 643
    const/4 v3, 0x0

    .line 83
    .local v3, "$i$a$-requirePrecondition-LazyGridMeasureKt$measureLazyGrid$2":I
    nop

    .line 643
    .end local v3    # "$i$a$-requirePrecondition-LazyGridMeasureKt$measureLazyGrid$2":I
    const-string/jumbo v3, "negative afterContentPadding"

    invoke-static {v3}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 645
    :cond_3
    nop

    .line 84
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    const-wide v31, 0xffffffffL

    const/16 v33, 0x20

    if-gtz v15, :cond_6

    .line 86
    invoke-static {v10, v11}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v18

    .line 87
    .local v18, "layoutWidth":I
    invoke-static {v10, v11}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v19

    .line 90
    .local v19, "layoutHeight":I
    nop

    .line 91
    nop

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v0

    check-cast v20, Ljava/util/List;

    .line 93
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    move-result-object v21

    .line 88
    nop

    .line 89
    nop

    .line 90
    nop

    .line 91
    nop

    .line 92
    nop

    .line 93
    nop

    .line 94
    move-object/from16 v22, p2

    check-cast v22, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;

    .line 95
    nop

    .line 97
    nop

    .line 96
    nop

    .line 98
    nop

    .line 99
    nop

    .line 100
    nop

    .line 101
    nop

    .line 102
    nop

    .line 88
    const/16 v17, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v23, p12

    move-object/from16 v16, p17

    move/from16 v25, p18

    move/from16 v26, p20

    move/from16 v24, p21

    move-object/from16 v29, p23

    move-object/from16 v30, p25

    invoke-virtual/range {v16 .. v30}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)V

    .line 104
    if-nez p21, :cond_4

    .line 105
    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMinSizeToFitDisappearingItems-YbymL2g()J

    move-result-wide v0

    .line 106
    .local v0, "disappearingItemsSize":J
    sget-object v3, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v3

    if-nez v3, :cond_4

    .line 107
    const/4 v3, 0x0

    .line 646
    .local v3, "$i$f$getWidth-impl":I
    move-wide v4, v0

    .local v4, "value$iv$iv":J
    const/4 v6, 0x0

    .line 647
    .local v6, "$i$f$unpackInt1":I
    shr-long v7, v4, v33

    long-to-int v4, v7

    .line 646
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackInt1":I
    nop

    .line 107
    .end local v3    # "$i$f$getWidth-impl":I
    invoke-static {v10, v11, v4}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v18

    .line 108
    const/4 v3, 0x0

    .line 648
    .local v3, "$i$f$getHeight-impl":I
    move-wide v4, v0

    .restart local v4    # "value$iv$iv":J
    const/4 v6, 0x0

    .line 649
    .local v6, "$i$f$unpackInt2":I
    and-long v7, v4, v31

    long-to-int v4, v7

    .line 648
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackInt2":I
    nop

    .line 108
    .end local v3    # "$i$f$getHeight-impl":I
    invoke-static {v10, v11, v4}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v19

    .line 116
    .end local v0    # "disappearingItemsSize":J
    :cond_4
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v3, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3;

    invoke-interface {v12, v0, v1, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v39, v0

    check-cast v39, Landroidx/compose/ui/layout/MeasureResult;

    .line 118
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v46

    .line 119
    neg-int v0, v9

    .line 120
    add-int v48, p3, p5

    .line 123
    if-eqz p12, :cond_5

    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2

    :cond_5
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_2
    move-object/from16 v51, v1

    .line 111
    new-instance v34, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    .line 112
    nop

    .line 113
    nop

    .line 114
    nop

    .line 115
    nop

    .line 116
    nop

    .line 117
    nop

    .line 126
    nop

    .line 129
    nop

    .line 127
    nop

    .line 128
    nop

    .line 130
    nop

    .line 118
    nop

    .line 119
    nop

    .line 120
    nop

    .line 121
    nop

    .line 122
    nop

    .line 123
    nop

    .line 124
    nop

    .line 125
    nop

    .line 111
    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v49, 0x0

    move/from16 v52, p5

    move/from16 v53, p6

    move/from16 v50, p15

    move-object/from16 v43, p16

    move/from16 v44, p18

    move-object/from16 v42, p23

    move-object/from16 v45, p26

    move/from16 v47, v0

    invoke-direct/range {v34 .. v53}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v34

    .line 133
    .end local v18    # "layoutWidth":I
    .end local v19    # "layoutHeight":I
    :cond_6
    move/from16 v0, p7

    .line 134
    .local v0, "currentFirstLineIndex":I
    move/from16 v1, p8

    .line 137
    .local v1, "currentFirstLineScrollOffset":I
    move/from16 v3, p9

    .local v3, "$this$fastRoundToInt$iv":F
    const/4 v4, 0x0

    .line 650
    .local v4, "$i$f$fastRoundToInt":I
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 137
    .end local v3    # "$this$fastRoundToInt$iv":F
    .end local v4    # "$i$f$fastRoundToInt":I
    nop

    .line 141
    .local v3, "scrollDelta":I
    sub-int/2addr v1, v3

    .line 144
    if-nez v0, :cond_7

    if-gez v1, :cond_7

    .line 145
    add-int/2addr v3, v1

    .line 146
    const/4 v1, 0x0

    .line 150
    :cond_7
    new-instance v4, Lkotlin/collections/ArrayDeque;

    invoke-direct {v4}, Lkotlin/collections/ArrayDeque;-><init>()V

    move-object v14, v4

    .line 153
    .local v14, "visibleLines":Lkotlin/collections/ArrayDeque;
    neg-int v4, v9

    if-gez p6, :cond_8

    move/from16 v5, p6

    goto :goto_3

    :cond_8
    move v5, v13

    :goto_3
    add-int/2addr v4, v5

    .line 154
    .local v4, "minOffset":I
    move/from16 v5, p3

    .line 159
    .local v5, "maxOffset":I
    add-int/2addr v1, v4

    .line 164
    :goto_4
    if-gez v1, :cond_9

    if-lez v0, :cond_9

    .line 165
    add-int/lit8 v6, v0, -0x1

    .line 166
    .local v6, "previous":I
    invoke-virtual {v2, v6}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v7

    .line 167
    .local v7, "measuredLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    invoke-virtual {v14, v13, v7}, Lkotlin/collections/ArrayDeque;->add(ILjava/lang/Object;)V

    .line 168
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v8

    add-int/2addr v1, v8

    .line 169
    move v0, v6

    .end local v6    # "previous":I
    .end local v7    # "measuredLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    goto :goto_4

    .line 174
    :cond_9
    if-ge v1, v4, :cond_a

    .line 175
    sub-int v6, v4, v1

    .line 176
    .local v6, "notConsumedScrollDelta":I
    move v1, v4

    .line 177
    sub-int/2addr v3, v6

    .line 181
    .end local v6    # "notConsumedScrollDelta":I
    :cond_a
    sub-int/2addr v1, v4

    .line 183
    move v6, v0

    .line 184
    .local v6, "index":I
    add-int v7, v5, p5

    invoke-static {v7, v13}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v7

    .line 185
    .local v7, "maxMainAxis":I
    neg-int v8, v1

    .line 190
    .local v8, "currentMainAxisOffset":I
    const/16 v16, 0x0

    .line 193
    .local v16, "remeasureNeeded":Z
    const/16 v17, 0x0

    move/from16 v13, v17

    .line 194
    .local v13, "indexInVisibleLines":I
    :goto_5
    move/from16 v18, v0

    .end local v0    # "currentFirstLineIndex":I
    .local v18, "currentFirstLineIndex":I
    invoke-virtual {v14}, Lkotlin/collections/ArrayDeque;->size()I

    move-result v0

    if-ge v13, v0, :cond_c

    .line 195
    if-lt v8, v7, :cond_b

    .line 197
    invoke-virtual {v14, v13}, Lkotlin/collections/ArrayDeque;->remove(I)Ljava/lang/Object;

    .line 198
    const/16 v16, 0x1

    move/from16 v0, v18

    goto :goto_5

    .line 200
    :cond_b
    add-int/lit8 v6, v6, 0x1

    .line 201
    invoke-virtual {v14, v13}, Lkotlin/collections/ArrayDeque;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v0

    add-int/2addr v8, v0

    .line 202
    add-int/lit8 v13, v13, 0x1

    move/from16 v0, v18

    goto :goto_5

    .line 194
    :cond_c
    move/from16 v28, v16

    move/from16 v0, v18

    .line 210
    .end local v16    # "remeasureNeeded":Z
    .end local v18    # "currentFirstLineIndex":I
    .restart local v0    # "currentFirstLineIndex":I
    .local v28, "remeasureNeeded":Z
    :goto_6
    if-ge v6, v15, :cond_12

    .line 211
    if-lt v8, v7, :cond_e

    .line 212
    if-lez v8, :cond_e

    .line 213
    invoke-virtual {v14}, Lkotlin/collections/ArrayDeque;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_d

    goto :goto_7

    :cond_d
    move/from16 v16, v0

    move/from16 v19, v1

    move/from16 v18, v3

    goto :goto_9

    .line 215
    :cond_e
    :goto_7
    move/from16 v16, v0

    .end local v0    # "currentFirstLineIndex":I
    .local v16, "currentFirstLineIndex":I
    invoke-virtual {v2, v6}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v0

    .line 216
    .local v0, "measuredLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->isEmpty()Z

    move-result v18

    if-eqz v18, :cond_f

    .line 217
    move/from16 v19, v1

    move/from16 v18, v3

    goto :goto_9

    .line 220
    :cond_f
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v18

    add-int v8, v8, v18

    .line 221
    nop

    .line 222
    if-gt v8, v4, :cond_10

    .line 223
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lkotlin/collections/ArraysKt;->last([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move/from16 v19, v1

    .end local v1    # "currentFirstLineScrollOffset":I
    .local v19, "currentFirstLineScrollOffset":I
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    move-result v1

    move/from16 v18, v3

    .end local v3    # "scrollDelta":I
    .local v18, "scrollDelta":I
    add-int/lit8 v3, v15, -0x1

    if-eq v1, v3, :cond_11

    .line 226
    add-int/lit8 v1, v6, 0x1

    .line 227
    .end local v16    # "currentFirstLineIndex":I
    .local v1, "currentFirstLineIndex":I
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v3

    sub-int v3, v19, v3

    .line 228
    .end local v19    # "currentFirstLineScrollOffset":I
    .local v3, "currentFirstLineScrollOffset":I
    const/16 v16, 0x1

    move/from16 v28, v16

    move/from16 v16, v1

    move v1, v3

    .end local v28    # "remeasureNeeded":Z
    .local v16, "remeasureNeeded":Z
    goto :goto_8

    .line 222
    .end local v18    # "scrollDelta":I
    .local v1, "currentFirstLineScrollOffset":I
    .local v3, "scrollDelta":I
    .local v16, "currentFirstLineIndex":I
    .restart local v28    # "remeasureNeeded":Z
    :cond_10
    move/from16 v19, v1

    move/from16 v18, v3

    .line 230
    .end local v1    # "currentFirstLineScrollOffset":I
    .end local v3    # "scrollDelta":I
    .restart local v18    # "scrollDelta":I
    .restart local v19    # "currentFirstLineScrollOffset":I
    :cond_11
    invoke-virtual {v14, v0}, Lkotlin/collections/ArrayDeque;->add(Ljava/lang/Object;)Z

    move/from16 v1, v19

    .line 232
    .end local v19    # "currentFirstLineScrollOffset":I
    .restart local v1    # "currentFirstLineScrollOffset":I
    :goto_8
    add-int/lit8 v6, v6, 0x1

    move/from16 v0, v16

    move/from16 v3, v18

    goto :goto_6

    .line 210
    .end local v16    # "currentFirstLineIndex":I
    .end local v18    # "scrollDelta":I
    .local v0, "currentFirstLineIndex":I
    .restart local v3    # "scrollDelta":I
    :cond_12
    move/from16 v16, v0

    move/from16 v19, v1

    move/from16 v18, v3

    .line 235
    .end local v0    # "currentFirstLineIndex":I
    .end local v1    # "currentFirstLineScrollOffset":I
    .end local v3    # "scrollDelta":I
    .restart local v16    # "currentFirstLineIndex":I
    .restart local v18    # "scrollDelta":I
    .restart local v19    # "currentFirstLineScrollOffset":I
    :goto_9
    move/from16 v0, v18

    .line 238
    .local v0, "preScrollBackScrollDelta":I
    if-ge v8, v5, :cond_15

    .line 239
    sub-int v1, v5, v8

    .line 240
    .local v1, "toScrollBack":I
    sub-int v3, v19, v1

    .line 241
    .end local v19    # "currentFirstLineScrollOffset":I
    .local v3, "currentFirstLineScrollOffset":I
    add-int/2addr v8, v1

    .line 243
    :goto_a
    if-ge v3, v9, :cond_13

    if-lez v16, :cond_13

    .line 245
    move/from16 v20, v1

    .end local v1    # "toScrollBack":I
    .local v20, "toScrollBack":I
    add-int/lit8 v1, v16, -0x1

    .line 246
    .local v1, "previousIndex":I
    move/from16 v19, v3

    .end local v3    # "currentFirstLineScrollOffset":I
    .restart local v19    # "currentFirstLineScrollOffset":I
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v3

    .line 247
    .local v3, "measuredLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    move/from16 v21, v1

    const/4 v1, 0x0

    .end local v1    # "previousIndex":I
    .local v21, "previousIndex":I
    invoke-virtual {v14, v1, v3}, Lkotlin/collections/ArrayDeque;->add(ILjava/lang/Object;)V

    .line 248
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v1

    add-int v1, v19, v1

    .line 249
    .end local v19    # "currentFirstLineScrollOffset":I
    .local v1, "currentFirstLineScrollOffset":I
    move/from16 v16, v21

    move v3, v1

    move/from16 v1, v20

    .end local v3    # "measuredLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .end local v21    # "previousIndex":I
    goto :goto_a

    .line 243
    .end local v20    # "toScrollBack":I
    .local v1, "toScrollBack":I
    .local v3, "currentFirstLineScrollOffset":I
    :cond_13
    move/from16 v20, v1

    move/from16 v19, v3

    .line 251
    .end local v1    # "toScrollBack":I
    .end local v3    # "currentFirstLineScrollOffset":I
    .restart local v19    # "currentFirstLineScrollOffset":I
    .restart local v20    # "toScrollBack":I
    add-int v3, v18, v20

    .line 252
    .end local v18    # "scrollDelta":I
    .local v3, "scrollDelta":I
    if-gez v19, :cond_14

    .line 253
    add-int v3, v3, v19

    .line 254
    add-int v8, v8, v19

    .line 255
    const/4 v1, 0x0

    move/from16 v39, v8

    move/from16 v29, v16

    .end local v19    # "currentFirstLineScrollOffset":I
    .local v1, "currentFirstLineScrollOffset":I
    goto :goto_b

    .line 252
    .end local v1    # "currentFirstLineScrollOffset":I
    .restart local v19    # "currentFirstLineScrollOffset":I
    :cond_14
    move/from16 v39, v8

    move/from16 v29, v16

    move/from16 v1, v19

    goto :goto_b

    .line 238
    .end local v3    # "scrollDelta":I
    .end local v20    # "toScrollBack":I
    .restart local v18    # "scrollDelta":I
    :cond_15
    move/from16 v39, v8

    move/from16 v29, v16

    move/from16 v3, v18

    move/from16 v1, v19

    .line 264
    .end local v8    # "currentMainAxisOffset":I
    .end local v16    # "currentFirstLineIndex":I
    .end local v18    # "scrollDelta":I
    .end local v19    # "currentFirstLineScrollOffset":I
    .restart local v1    # "currentFirstLineScrollOffset":I
    .restart local v3    # "scrollDelta":I
    .local v29, "currentFirstLineIndex":I
    .local v39, "currentMainAxisOffset":I
    :goto_b
    nop

    .line 265
    move/from16 v8, p9

    .local v8, "$this$fastRoundToInt$iv":F
    const/16 v16, 0x0

    .line 651
    .local v16, "$i$f$fastRoundToInt":I
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 265
    .end local v8    # "$this$fastRoundToInt$iv":F
    .end local v16    # "$i$f$fastRoundToInt":I
    invoke-static {v8}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v8

    move/from16 v16, v4

    .end local v4    # "minOffset":I
    .local v16, "minOffset":I
    invoke-static {v3}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v4

    if-ne v8, v4, :cond_16

    .line 266
    move/from16 v4, p9

    .local v4, "$this$fastRoundToInt$iv":F
    const/4 v8, 0x0

    .line 652
    .local v8, "$i$f$fastRoundToInt":I
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 266
    .end local v4    # "$this$fastRoundToInt$iv":F
    .end local v8    # "$i$f$fastRoundToInt":I
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v8

    if-lt v4, v8, :cond_16

    .line 268
    int-to-float v4, v3

    goto :goto_c

    .line 270
    :cond_16
    move/from16 v4, p9

    .line 264
    :goto_c
    nop

    .line 263
    nop

    .line 273
    .local v4, "consumedScroll":F
    sub-float v30, p9, v4

    .line 278
    .local v30, "unconsumedScroll":F
    const/4 v8, 0x0

    if-eqz p21, :cond_17

    if-le v3, v0, :cond_17

    cmpg-float v18, v30, v8

    if-gtz v18, :cond_17

    .line 279
    sub-int v8, v3, v0

    int-to-float v8, v8

    add-float v8, v8, v30

    goto :goto_d

    .line 280
    :cond_17
    nop

    .line 278
    :goto_d
    nop

    .line 277
    move/from16 v47, v8

    .line 283
    .local v47, "scrollBackAmount":F
    if-ltz v1, :cond_18

    move/from16 v8, v27

    goto :goto_e

    :cond_18
    const/4 v8, 0x0

    .local v8, "value$iv":Z
    :goto_e
    const/16 v18, 0x0

    .line 653
    .local v18, "$i$f$requirePrecondition":I
    nop

    .line 654
    if-nez v8, :cond_19

    .line 655
    const/16 v19, 0x0

    .line 283
    .local v19, "$i$a$-requirePrecondition-LazyGridMeasureKt$measureLazyGrid$4":I
    nop

    .line 655
    .end local v19    # "$i$a$-requirePrecondition-LazyGridMeasureKt$measureLazyGrid$4":I
    const-string/jumbo v19, "negative initial offset"

    invoke-static/range {v19 .. v19}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 657
    :cond_19
    nop

    .line 284
    .end local v8    # "value$iv":Z
    .end local v18    # "$i$f$requirePrecondition":I
    neg-int v8, v1

    .line 285
    .local v8, "visibleLinesScrollOffset":I
    invoke-virtual {v14}, Lkotlin/collections/ArrayDeque;->first()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 287
    .local v18, "firstLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    if-eqz v19, :cond_1a

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    move-result v19

    goto :goto_f

    :cond_1a
    const/16 v19, 0x0

    :goto_f
    move/from16 v48, v19

    .line 288
    .local v48, "firstItemIndex":I
    invoke-virtual {v14}, Lkotlin/collections/ArrayDeque;->lastOrNull()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    if-eqz v19, :cond_1b

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v19

    if-eqz v19, :cond_1b

    invoke-static/range {v19 .. v19}, Lkotlin/collections/ArraysKt;->lastOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    if-eqz v19, :cond_1b

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    move-result v19

    goto :goto_10

    :cond_1b
    const/16 v19, 0x0

    .line 290
    .local v19, "lastItemIndex":I
    :goto_10
    const/16 v20, 0x0

    .line 658
    .local v20, "$i$f$calculateExtraItems":I
    const/16 v21, 0x0

    .line 660
    .local v21, "items$iv":Ljava/lang/Object;
    move-object/from16 v22, p19

    .local v22, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v23, 0x0

    .line 661
    .local v23, "$i$f$fastForEach":I
    nop

    .line 662
    const/16 v24, 0x0

    .local v24, "index$iv$iv":I
    move-object/from16 v25, v22

    check-cast v25, Ljava/util/Collection;

    move/from16 v40, v5

    .end local v5    # "maxOffset":I
    .local v40, "maxOffset":I
    invoke-interface/range {v25 .. v25}, Ljava/util/Collection;->size()I

    move-result v5

    move/from16 v62, v24

    move/from16 v24, v0

    move/from16 v0, v62

    .local v0, "index$iv$iv":I
    .local v24, "preScrollBackScrollDelta":I
    :goto_11
    if-ge v0, v5, :cond_20

    .line 663
    move/from16 v25, v5

    move-object/from16 v5, v22

    .end local v22    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    .line 664
    .local v22, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v26, v22

    check-cast v26, Ljava/lang/Number;

    move/from16 v34, v0

    .end local v0    # "index$iv$iv":I
    .local v34, "index$iv$iv":I
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Number;->intValue()I

    move-result v0

    .local v0, "index$iv":I
    const/16 v26, 0x0

    .line 665
    .local v26, "$i$a$-fastForEach-LazyGridMeasureKt$calculateExtraItems$1$iv":I
    move/from16 v35, v0

    .local v35, "it":I
    const/16 v36, 0x0

    .line 294
    .local v36, "$i$a$-calculateExtraItems-LazyGridMeasureKt$measureLazyGrid$extraItemsBefore$1":I
    if-ltz v35, :cond_1c

    move/from16 v37, v35

    move/from16 v35, v1

    move/from16 v1, v37

    move-object/from16 v37, v5

    move/from16 v5, v48

    .end local v48    # "firstItemIndex":I
    .local v1, "it":I
    .local v5, "firstItemIndex":I
    .local v35, "currentFirstLineScrollOffset":I
    .local v37, "$this$fastForEach$iv$iv":Ljava/util/List;
    if-ge v1, v5, :cond_1d

    move/from16 v1, v27

    goto :goto_12

    .end local v37    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v1, "currentFirstLineScrollOffset":I
    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v35, "it":I
    .restart local v48    # "firstItemIndex":I
    :cond_1c
    move/from16 v37, v35

    move/from16 v35, v1

    move/from16 v1, v37

    move-object/from16 v37, v5

    move/from16 v5, v48

    .end local v48    # "firstItemIndex":I
    .local v1, "it":I
    .local v5, "firstItemIndex":I
    .local v35, "currentFirstLineScrollOffset":I
    .restart local v37    # "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_1d
    const/4 v1, 0x0

    .line 665
    .end local v1    # "it":I
    .end local v36    # "$i$a$-calculateExtraItems-LazyGridMeasureKt$measureLazyGrid$extraItemsBefore$1":I
    :goto_12
    if-eqz v1, :cond_1f

    .line 666
    move v1, v6

    .end local v6    # "index":I
    .local v1, "index":I
    invoke-virtual {v2, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->spanOf(I)I

    move-result v6

    .line 667
    .local v6, "span$iv":I
    move/from16 v36, v0

    move/from16 v38, v7

    move/from16 v41, v8

    const/4 v0, 0x0

    .end local v0    # "index$iv":I
    .end local v7    # "maxMainAxis":I
    .end local v8    # "visibleLinesScrollOffset":I
    .local v36, "index$iv":I
    .local v38, "maxMainAxis":I
    .local v41, "visibleLinesScrollOffset":I
    invoke-virtual {v2, v0, v6}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->childConstraints-JhjzzOo$foundation_release(II)J

    move-result-wide v7

    .line 669
    .local v7, "constraints$iv":J
    nop

    .line 670
    nop

    .line 672
    nop

    .line 673
    nop

    .line 671
    nop

    .line 669
    move v0, v5

    .end local v5    # "firstItemIndex":I
    .local v0, "firstItemIndex":I
    const/4 v5, 0x0

    move/from16 v50, v1

    move/from16 v51, v3

    move/from16 v48, v16

    move/from16 v49, v38

    move/from16 v9, v39

    move-object/from16 v3, p2

    move v1, v0

    move v0, v4

    move/from16 v4, v36

    .end local v3    # "scrollDelta":I
    .end local v16    # "minOffset":I
    .end local v36    # "index$iv":I
    .end local v38    # "maxMainAxis":I
    .end local v39    # "currentMainAxisOffset":I
    .local v0, "consumedScroll":F
    .local v1, "firstItemIndex":I
    .local v4, "index$iv":I
    .local v9, "currentMainAxisOffset":I
    .local v48, "minOffset":I
    .local v49, "maxMainAxis":I
    .local v50, "index":I
    .local v51, "scrollDelta":I
    invoke-virtual/range {v3 .. v8}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getAndMeasure--hBUhpc(IIIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v5

    .line 668
    nop

    .line 675
    .local v5, "measuredItem$iv":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    if-nez v21, :cond_1e

    .line 676
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v21, v3

    check-cast v21, Ljava/util/List;

    move-object/from16 v3, v21

    goto :goto_13

    .line 675
    :cond_1e
    move-object/from16 v3, v21

    .line 678
    .end local v21    # "items$iv":Ljava/lang/Object;
    .local v3, "items$iv":Ljava/lang/Object;
    :goto_13
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v21, v3

    goto :goto_14

    .line 665
    .end local v1    # "firstItemIndex":I
    .end local v9    # "currentMainAxisOffset":I
    .end local v41    # "visibleLinesScrollOffset":I
    .end local v48    # "minOffset":I
    .end local v49    # "maxMainAxis":I
    .end local v50    # "index":I
    .end local v51    # "scrollDelta":I
    .local v0, "index$iv":I
    .local v3, "scrollDelta":I
    .local v4, "consumedScroll":F
    .local v5, "firstItemIndex":I
    .local v6, "index":I
    .local v7, "maxMainAxis":I
    .restart local v8    # "visibleLinesScrollOffset":I
    .restart local v16    # "minOffset":I
    .restart local v21    # "items$iv":Ljava/lang/Object;
    .restart local v39    # "currentMainAxisOffset":I
    :cond_1f
    move v1, v4

    move v4, v0

    move v0, v1

    move/from16 v51, v3

    move v1, v5

    move/from16 v50, v6

    move/from16 v49, v7

    move/from16 v41, v8

    move/from16 v48, v16

    move/from16 v9, v39

    .line 680
    .end local v3    # "scrollDelta":I
    .end local v5    # "firstItemIndex":I
    .end local v6    # "index":I
    .end local v7    # "maxMainAxis":I
    .end local v8    # "visibleLinesScrollOffset":I
    .end local v16    # "minOffset":I
    .end local v39    # "currentMainAxisOffset":I
    .local v0, "consumedScroll":F
    .restart local v1    # "firstItemIndex":I
    .local v4, "index$iv":I
    .restart local v9    # "currentMainAxisOffset":I
    .restart local v41    # "visibleLinesScrollOffset":I
    .restart local v48    # "minOffset":I
    .restart local v49    # "maxMainAxis":I
    .restart local v50    # "index":I
    .restart local v51    # "scrollDelta":I
    :goto_14
    nop

    .line 664
    .end local v4    # "index$iv":I
    .end local v26    # "$i$a$-fastForEach-LazyGridMeasureKt$calculateExtraItems$1$iv":I
    nop

    .line 662
    .end local v22    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v34, 0x1

    move v4, v0

    move v0, v3

    move/from16 v39, v9

    move/from16 v5, v25

    move-object/from16 v22, v37

    move/from16 v8, v41

    move/from16 v16, v48

    move/from16 v7, v49

    move/from16 v6, v50

    move/from16 v3, v51

    move/from16 v9, p4

    move/from16 v48, v1

    move/from16 v1, v35

    .end local v34    # "index$iv$iv":I
    .local v3, "index$iv$iv":I
    goto/16 :goto_11

    .end local v9    # "currentMainAxisOffset":I
    .end local v35    # "currentFirstLineScrollOffset":I
    .end local v37    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v41    # "visibleLinesScrollOffset":I
    .end local v49    # "maxMainAxis":I
    .end local v50    # "index":I
    .end local v51    # "scrollDelta":I
    .local v0, "index$iv$iv":I
    .local v1, "currentFirstLineScrollOffset":I
    .local v3, "scrollDelta":I
    .local v4, "consumedScroll":F
    .restart local v6    # "index":I
    .restart local v7    # "maxMainAxis":I
    .restart local v8    # "visibleLinesScrollOffset":I
    .restart local v16    # "minOffset":I
    .local v22, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v39    # "currentMainAxisOffset":I
    .local v48, "firstItemIndex":I
    :cond_20
    move/from16 v34, v0

    move/from16 v35, v1

    move/from16 v51, v3

    move v0, v4

    move/from16 v50, v6

    move/from16 v49, v7

    move/from16 v41, v8

    move-object/from16 v37, v22

    move/from16 v9, v39

    move/from16 v1, v48

    move/from16 v48, v16

    .line 681
    .end local v3    # "scrollDelta":I
    .end local v4    # "consumedScroll":F
    .end local v6    # "index":I
    .end local v7    # "maxMainAxis":I
    .end local v8    # "visibleLinesScrollOffset":I
    .end local v16    # "minOffset":I
    .end local v22    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v39    # "currentMainAxisOffset":I
    .local v0, "consumedScroll":F
    .local v1, "firstItemIndex":I
    .restart local v9    # "currentMainAxisOffset":I
    .restart local v35    # "currentFirstLineScrollOffset":I
    .restart local v37    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v41    # "visibleLinesScrollOffset":I
    .local v48, "minOffset":I
    .restart local v49    # "maxMainAxis":I
    .restart local v50    # "index":I
    .restart local v51    # "scrollDelta":I
    nop

    .line 682
    .end local v23    # "$i$f$fastForEach":I
    .end local v37    # "$this$fastForEach$iv$iv":Ljava/util/List;
    if-nez v21, :cond_21

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    move-object/from16 v21, v3

    .line 290
    .end local v20    # "$i$f$calculateExtraItems":I
    .end local v21    # "items$iv":Ljava/lang/Object;
    :cond_21
    nop

    .line 289
    nop

    .line 299
    .local v21, "extraItemsBefore":Ljava/util/List;
    nop

    .line 300
    nop

    .line 301
    nop

    .line 302
    nop

    .line 303
    move-object v4, v14

    check-cast v4, Ljava/util/List;

    .line 304
    nop

    .line 298
    move/from16 v3, p21

    move-object/from16 v5, p22

    move v8, v0

    move v6, v1

    move v1, v15

    move/from16 v0, v19

    move/from16 v52, v24

    .end local v1    # "firstItemIndex":I
    .end local v19    # "lastItemIndex":I
    .end local v24    # "preScrollBackScrollDelta":I
    .local v0, "lastItemIndex":I
    .local v6, "firstItemIndex":I
    .local v8, "consumedScroll":F
    .local v52, "preScrollBackScrollDelta":I
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->linesRetainedForLookahead(IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;ZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)Ljava/util/List;

    move-result-object v4

    .line 297
    move v7, v1

    move-object v15, v2

    move-object/from16 v53, v4

    .line 308
    .local v53, "linesRetainedForLookahead":Ljava/util/List;
    const/16 v16, 0x0

    .line 683
    .local v16, "$i$f$calculateExtraItems":I
    const/4 v1, 0x0

    .line 685
    .local v1, "items$iv":Ljava/lang/Object;
    move-object/from16 v2, p19

    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v19, 0x0

    .line 686
    .local v19, "$i$f$fastForEach":I
    nop

    .line 687
    const/4 v3, 0x0

    .local v3, "index$iv$iv":I
    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    move-object/from16 v20, v1

    move v1, v3

    .end local v3    # "index$iv$iv":I
    .local v1, "index$iv$iv":I
    .local v20, "items$iv":Ljava/lang/Object;
    :goto_15
    if-ge v1, v4, :cond_2d

    .line 688
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    .line 689
    .local v22, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v3, v22

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .local v3, "index$iv":I
    const/16 v23, 0x0

    .line 690
    .local v23, "$i$a$-fastForEach-LazyGridMeasureKt$calculateExtraItems$1$iv":I
    move v5, v3

    .local v5, "it":I
    const/16 v24, 0x0

    .line 313
    .local v24, "$i$a$-calculateExtraItems-LazyGridMeasureKt$measureLazyGrid$extraItemsAfter$1":I
    move/from16 v25, v0

    .end local v0    # "lastItemIndex":I
    .local v25, "lastItemIndex":I
    add-int/lit8 v0, v25, 0x1

    if-gt v0, v5, :cond_22

    if-ge v5, v7, :cond_22

    move/from16 v0, v27

    goto :goto_16

    :cond_22
    const/4 v0, 0x0

    :goto_16
    if-eqz v0, :cond_29

    .line 314
    if-eqz p21, :cond_28

    .line 315
    move-object/from16 v0, v53

    .local v0, "$this$fastAny$iv":Ljava/util/List;
    const/16 v26, 0x0

    .line 691
    .local v26, "$i$f$fastAny":I
    nop

    .line 692
    move-object/from16 v34, v0

    .local v34, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v36, 0x0

    .line 693
    .local v36, "$i$f$fastForEach":I
    nop

    .line 694
    const/16 v37, 0x0

    .local v37, "index$iv$iv":I
    move-object/from16 v38, v34

    check-cast v38, Ljava/util/Collection;

    move-object/from16 v39, v0

    .end local v0    # "$this$fastAny$iv":Ljava/util/List;
    .local v39, "$this$fastAny$iv":Ljava/util/List;
    invoke-interface/range {v38 .. v38}, Ljava/util/Collection;->size()I

    move-result v0

    move/from16 v38, v1

    move/from16 v1, v37

    .end local v37    # "index$iv$iv":I
    .local v38, "index$iv$iv":I
    :goto_17
    if-ge v1, v0, :cond_27

    .line 695
    move/from16 v37, v0

    move-object/from16 v0, v34

    .end local v34    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v34

    .line 696
    .local v34, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v42, v34

    .local v42, "it$iv":Ljava/lang/Object;
    const/16 v43, 0x0

    .line 692
    .local v43, "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    move-object/from16 v44, v42

    check-cast v44, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .local v44, "line":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    const/16 v45, 0x0

    .line 316
    .local v45, "$i$a$-fastAny-LazyGridMeasureKt$measureLazyGrid$extraItemsAfter$1$1":I
    move-object/from16 v46, v0

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v46, "$this$fastForEach$iv$iv":Ljava/util/List;
    invoke-virtual/range {v44 .. v44}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v0

    .local v0, "$this$any$iv":[Ljava/lang/Object;
    const/16 v54, 0x0

    .line 697
    .local v54, "$i$f$any":I
    move/from16 v55, v1

    .end local v1    # "index$iv$iv":I
    .local v55, "index$iv$iv":I
    array-length v1, v0

    move-object/from16 v56, v0

    const/4 v0, 0x0

    .end local v0    # "$this$any$iv":[Ljava/lang/Object;
    .local v56, "$this$any$iv":[Ljava/lang/Object;
    :goto_18
    if-ge v0, v1, :cond_25

    aget-object v57, v56, v0

    .local v57, "element$iv":Ljava/lang/Object;
    move-object/from16 v58, v57

    .local v58, "item":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    const/16 v59, 0x0

    .line 316
    .local v59, "$i$a$-any-LazyGridMeasureKt$measureLazyGrid$extraItemsAfter$1$1$1":I
    move/from16 v60, v0

    invoke-virtual/range {v58 .. v58}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    move-result v0

    if-ne v0, v5, :cond_23

    move/from16 v0, v27

    goto :goto_19

    :cond_23
    const/4 v0, 0x0

    .line 697
    .end local v58    # "item":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    .end local v59    # "$i$a$-any-LazyGridMeasureKt$measureLazyGrid$extraItemsAfter$1$1$1":I
    :goto_19
    if-eqz v0, :cond_24

    move/from16 v1, v27

    goto :goto_1a

    .end local v57    # "element$iv":Ljava/lang/Object;
    :cond_24
    add-int/lit8 v0, v60, 0x1

    goto :goto_18

    .line 698
    :cond_25
    const/4 v1, 0x0

    .line 316
    .end local v54    # "$i$f$any":I
    .end local v56    # "$this$any$iv":[Ljava/lang/Object;
    :goto_1a
    nop

    .line 692
    .end local v44    # "line":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .end local v45    # "$i$a$-fastAny-LazyGridMeasureKt$measureLazyGrid$extraItemsAfter$1$1":I
    if-eqz v1, :cond_26

    move/from16 v1, v27

    goto :goto_1b

    .line 696
    .end local v42    # "it$iv":Ljava/lang/Object;
    .end local v43    # "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    :cond_26
    nop

    .line 694
    .end local v34    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v1, v55, 0x1

    move/from16 v0, v37

    move-object/from16 v34, v46

    .end local v55    # "index$iv$iv":I
    .restart local v1    # "index$iv$iv":I
    goto :goto_17

    .end local v46    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v34, "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_27
    move/from16 v55, v1

    move-object/from16 v46, v34

    .line 699
    .end local v1    # "index$iv$iv":I
    .end local v34    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v46    # "$this$fastForEach$iv$iv":Ljava/util/List;
    nop

    .line 700
    .end local v36    # "$i$f$fastForEach":I
    .end local v46    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 315
    .end local v26    # "$i$f$fastAny":I
    .end local v39    # "$this$fastAny$iv":Ljava/util/List;
    :goto_1b
    if-nez v1, :cond_2a

    goto :goto_1c

    .line 314
    .end local v38    # "index$iv$iv":I
    .restart local v1    # "index$iv$iv":I
    :cond_28
    move/from16 v38, v1

    .line 315
    .end local v1    # "index$iv$iv":I
    .restart local v38    # "index$iv$iv":I
    :goto_1c
    move/from16 v1, v27

    goto :goto_1d

    .line 313
    .end local v38    # "index$iv$iv":I
    .restart local v1    # "index$iv$iv":I
    :cond_29
    move/from16 v38, v1

    .line 315
    .end local v1    # "index$iv$iv":I
    .restart local v38    # "index$iv$iv":I
    :cond_2a
    const/4 v1, 0x0

    .line 317
    :goto_1d
    nop

    .line 690
    .end local v5    # "it":I
    .end local v24    # "$i$a$-calculateExtraItems-LazyGridMeasureKt$measureLazyGrid$extraItemsAfter$1":I
    if-eqz v1, :cond_2c

    .line 701
    move v1, v3

    .end local v3    # "index$iv":I
    .local v1, "index$iv":I
    invoke-virtual {v15, v1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->spanOf(I)I

    move-result v3

    .line 702
    .local v3, "span$iv":I
    move/from16 v17, v4

    const/4 v0, 0x0

    invoke-virtual {v15, v0, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->childConstraints-JhjzzOo$foundation_release(II)J

    move-result-wide v4

    .line 704
    .local v4, "constraints$iv":J
    nop

    .line 705
    nop

    .line 707
    nop

    .line 708
    nop

    .line 706
    nop

    .line 704
    move-object/from16 v24, v2

    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v24, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    move/from16 v61, v25

    move/from16 v25, v0

    move-object/from16 v0, p2

    .end local v25    # "lastItemIndex":I
    .local v61, "lastItemIndex":I
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getAndMeasure--hBUhpc(IIIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v2

    .line 703
    nop

    .line 710
    .local v2, "measuredItem$iv":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    if-nez v20, :cond_2b

    .line 711
    new-instance v26, Ljava/util/ArrayList;

    invoke-direct/range {v26 .. v26}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v26

    check-cast v20, Ljava/util/List;

    move/from16 v26, v1

    move-object/from16 v1, v20

    goto :goto_1e

    .line 710
    :cond_2b
    move/from16 v26, v1

    move-object/from16 v1, v20

    .line 713
    .end local v20    # "items$iv":Ljava/lang/Object;
    .local v1, "items$iv":Ljava/lang/Object;
    .local v26, "index$iv":I
    :goto_1e
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v20, v1

    goto :goto_1f

    .line 690
    .end local v1    # "items$iv":Ljava/lang/Object;
    .end local v4    # "constraints$iv":J
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v26    # "index$iv":I
    .end local v61    # "lastItemIndex":I
    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v3, "index$iv":I
    .restart local v20    # "items$iv":Ljava/lang/Object;
    .restart local v25    # "lastItemIndex":I
    :cond_2c
    move-object/from16 v0, p2

    move-object/from16 v24, v2

    move/from16 v26, v3

    move/from16 v17, v4

    move/from16 v61, v25

    const/16 v25, 0x0

    .line 715
    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v3    # "index$iv":I
    .end local v25    # "lastItemIndex":I
    .restart local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v26    # "index$iv":I
    .restart local v61    # "lastItemIndex":I
    :goto_1f
    nop

    .line 689
    .end local v23    # "$i$a$-fastForEach-LazyGridMeasureKt$calculateExtraItems$1$iv":I
    .end local v26    # "index$iv":I
    nop

    .line 687
    .end local v22    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v1, v38, 0x1

    move/from16 v4, v17

    move-object/from16 v2, v24

    move/from16 v0, v61

    .end local v38    # "index$iv$iv":I
    .local v1, "index$iv$iv":I
    goto/16 :goto_15

    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v61    # "lastItemIndex":I
    .local v0, "lastItemIndex":I
    .restart local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_2d
    move/from16 v61, v0

    move/from16 v38, v1

    move-object/from16 v24, v2

    const/16 v25, 0x0

    move-object/from16 v0, p2

    .line 716
    .end local v0    # "lastItemIndex":I
    .end local v1    # "index$iv$iv":I
    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v61    # "lastItemIndex":I
    nop

    .line 717
    .end local v19    # "$i$f$fastForEach":I
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    if-nez v20, :cond_2e

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    move-object/from16 v36, v1

    goto :goto_20

    :cond_2e
    move-object/from16 v36, v20

    .line 308
    .end local v16    # "$i$f$calculateExtraItems":I
    .end local v20    # "items$iv":Ljava/lang/Object;
    :goto_20
    nop

    .line 307
    nop

    .line 323
    .local v36, "extraItemsAfter":Ljava/util/List;
    if-gtz p4, :cond_30

    if-gez p6, :cond_2f

    goto :goto_21

    :cond_2f
    move/from16 v23, v35

    move-object/from16 v54, v18

    goto :goto_23

    .line 324
    :cond_30
    :goto_21
    const/4 v1, 0x0

    .local v1, "i":I
    move-object v2, v14

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    move/from16 v3, v35

    .end local v35    # "currentFirstLineScrollOffset":I
    .local v3, "currentFirstLineScrollOffset":I
    :goto_22
    if-ge v1, v2, :cond_32

    .line 325
    invoke-virtual {v14, v1}, Lkotlin/collections/ArrayDeque;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v4

    .line 326
    .local v4, "size":I
    nop

    .line 327
    if-eqz v3, :cond_31

    .line 328
    if-gt v4, v3, :cond_31

    .line 329
    move-object v5, v14

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v5

    if-eq v1, v5, :cond_31

    .line 331
    sub-int/2addr v3, v4

    .line 332
    add-int/lit8 v5, v1, 0x1

    invoke-virtual {v14, v5}, Lkotlin/collections/ArrayDeque;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v18, v5

    check-cast v18, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 324
    .end local v4    # "size":I
    add-int/lit8 v1, v1, 0x1

    goto :goto_22

    .line 334
    .restart local v4    # "size":I
    :cond_31
    nop

    .line 340
    .end local v1    # "i":I
    .end local v4    # "size":I
    :cond_32
    move/from16 v23, v3

    move-object/from16 v54, v18

    .end local v3    # "currentFirstLineScrollOffset":I
    .end local v18    # "firstLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .local v23, "currentFirstLineScrollOffset":I
    .local v54, "firstLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    :goto_23
    if-eqz p12, :cond_33

    .line 341
    invoke-static {v10, v11}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v1

    move/from16 v37, v1

    goto :goto_24

    .line 343
    :cond_33
    invoke-static {v10, v11, v9}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v1

    move/from16 v37, v1

    .line 340
    :goto_24
    nop

    .line 339
    nop

    .line 346
    .local v37, "layoutWidth":I
    if-eqz p12, :cond_34

    .line 347
    invoke-static {v10, v11, v9}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v1

    move/from16 v38, v1

    goto :goto_25

    .line 349
    :cond_34
    invoke-static {v10, v11}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v1

    move/from16 v38, v1

    .line 346
    :goto_25
    nop

    .line 345
    nop

    .line 355
    .local v38, "layoutHeight":I
    invoke-interface/range {v53 .. v53}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_35

    move-object v1, v14

    check-cast v1, Ljava/util/List;

    move-object/from16 v34, v1

    goto :goto_26

    .line 356
    :cond_35
    move-object v1, v14

    check-cast v1, Ljava/util/Collection;

    move-object/from16 v2, v53

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v34, v1

    .line 357
    :goto_26
    nop

    .line 358
    nop

    .line 359
    nop

    .line 360
    nop

    .line 361
    nop

    .line 362
    nop

    .line 363
    nop

    .line 364
    nop

    .line 365
    nop

    .line 366
    nop

    .line 367
    nop

    .line 368
    nop

    .line 353
    move/from16 v42, p12

    move-object/from16 v43, p13

    move-object/from16 v44, p14

    move/from16 v45, p15

    move-object/from16 v46, p16

    move/from16 v39, v9

    move-object/from16 v35, v21

    .end local v9    # "currentMainAxisOffset":I
    .end local v21    # "extraItemsBefore":Ljava/util/List;
    .local v35, "extraItemsBefore":Ljava/util/List;
    .local v39, "currentMainAxisOffset":I
    invoke-static/range {v34 .. v46}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;

    move-result-object v16

    .line 352
    move/from16 v9, v40

    .line 372
    .end local v40    # "maxOffset":I
    .local v9, "maxOffset":I
    .local v16, "positionedItems":Ljava/util/List;
    move/from16 v17, v13

    .end local v13    # "indexInVisibleLines":I
    .local v17, "indexInVisibleLines":I
    float-to-int v13, v8

    .line 373
    nop

    .line 374
    nop

    .line 376
    move/from16 v1, v17

    .end local v17    # "indexInVisibleLines":I
    .local v1, "indexInVisibleLines":I
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    move-result-object v17

    .line 382
    nop

    .line 383
    nop

    .line 371
    nop

    .line 372
    nop

    .line 373
    nop

    .line 374
    nop

    .line 375
    nop

    .line 376
    nop

    .line 377
    move-object/from16 v18, v0

    check-cast v18, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;

    .line 378
    nop

    .line 380
    nop

    .line 379
    nop

    .line 381
    nop

    .line 382
    nop

    .line 383
    nop

    .line 384
    nop

    .line 385
    nop

    .line 371
    move/from16 v12, v38

    move/from16 v38, v1

    move-object v1, v15

    move v15, v12

    move/from16 v12, v37

    move-object/from16 v37, v14

    move v14, v12

    move/from16 v19, p12

    move-object/from16 v12, p17

    move/from16 v21, p18

    move/from16 v22, p20

    move/from16 v20, p21

    move-object/from16 v26, p25

    move/from16 v34, v25

    move/from16 v24, v39

    move-object/from16 v25, p23

    .end local v1    # "indexInVisibleLines":I
    .end local v39    # "currentMainAxisOffset":I
    .local v14, "layoutWidth":I
    .local v15, "layoutHeight":I
    .local v24, "currentMainAxisOffset":I
    .local v37, "visibleLines":Lkotlin/collections/ArrayDeque;
    .local v38, "indexInVisibleLines":I
    invoke-virtual/range {v12 .. v26}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)V

    .line 388
    move/from16 v12, v20

    move/from16 v13, v24

    .end local v24    # "currentMainAxisOffset":I
    .local v13, "currentMainAxisOffset":I
    if-nez v12, :cond_3b

    .line 389
    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMinSizeToFitDisappearingItems-YbymL2g()J

    move-result-wide v2

    .line 390
    .local v2, "disappearingItemsSize":J
    sget-object v4, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v4

    if-nez v4, :cond_3a

    .line 391
    if-eqz p12, :cond_36

    move v4, v15

    goto :goto_27

    :cond_36
    move v4, v14

    .line 393
    .local v4, "oldMainAxisSize":I
    :goto_27
    const/4 v5, 0x0

    .line 718
    .local v5, "$i$f$getWidth-impl":I
    move-wide/from16 v17, v2

    .local v17, "value$iv$iv":J
    const/16 v19, 0x0

    .line 719
    .local v19, "$i$f$unpackInt1":I
    move-wide/from16 v20, v2

    .end local v2    # "disappearingItemsSize":J
    .local v20, "disappearingItemsSize":J
    shr-long v2, v17, v33

    long-to-int v2, v2

    .line 718
    .end local v17    # "value$iv$iv":J
    .end local v19    # "$i$f$unpackInt1":I
    nop

    .line 393
    .end local v5    # "$i$f$getWidth-impl":I
    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v2

    .line 392
    nop

    .line 395
    .end local v14    # "layoutWidth":I
    .local v2, "layoutWidth":I
    const/4 v3, 0x0

    .line 720
    .local v3, "$i$f$getHeight-impl":I
    move-wide/from16 v17, v20

    .restart local v17    # "value$iv$iv":J
    const/4 v5, 0x0

    .line 721
    .local v5, "$i$f$unpackInt2":I
    move v14, v2

    move/from16 v19, v3

    .end local v2    # "layoutWidth":I
    .end local v3    # "$i$f$getHeight-impl":I
    .restart local v14    # "layoutWidth":I
    .local v19, "$i$f$getHeight-impl":I
    and-long v2, v17, v31

    long-to-int v2, v2

    .line 720
    .end local v5    # "$i$f$unpackInt2":I
    .end local v17    # "value$iv$iv":J
    nop

    .line 395
    .end local v19    # "$i$f$getHeight-impl":I
    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v2

    .line 394
    nop

    .line 396
    .end local v15    # "layoutHeight":I
    .local v2, "layoutHeight":I
    if-eqz p12, :cond_37

    move v3, v2

    goto :goto_28

    :cond_37
    move v3, v14

    .line 397
    .local v3, "newMainAxisSize":I
    :goto_28
    if-eq v3, v4, :cond_39

    .line 398
    move-object/from16 v5, v16

    .local v5, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v15, 0x0

    .line 722
    .local v15, "$i$f$fastForEach":I
    nop

    .line 723
    const/16 v17, 0x0

    .local v17, "index$iv":I
    move-object/from16 v18, v5

    check-cast v18, Ljava/util/Collection;

    move/from16 v19, v2

    .end local v2    # "layoutHeight":I
    .local v19, "layoutHeight":I
    invoke-interface/range {v18 .. v18}, Ljava/util/Collection;->size()I

    move-result v2

    move/from16 v18, v4

    move/from16 v4, v17

    .end local v17    # "index$iv":I
    .local v4, "index$iv":I
    .local v18, "oldMainAxisSize":I
    :goto_29
    if-ge v4, v2, :cond_38

    .line 724
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 725
    .local v17, "item$iv":Ljava/lang/Object;
    move/from16 v22, v2

    move-object/from16 v2, v17

    check-cast v2, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .local v2, "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    const/16 v24, 0x0

    .line 398
    .local v24, "$i$a$-fastForEach-LazyGridMeasureKt$measureLazyGrid$5":I
    invoke-virtual {v2, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->updateMainAxisLayoutSize(I)V

    .line 725
    .end local v2    # "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;
    .end local v24    # "$i$a$-fastForEach-LazyGridMeasureKt$measureLazyGrid$5":I
    nop

    .line 723
    .end local v17    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    move/from16 v2, v22

    goto :goto_29

    .line 727
    .end local v4    # "index$iv":I
    :cond_38
    goto :goto_2a

    .line 397
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v15    # "$i$f$fastForEach":I
    .end local v18    # "oldMainAxisSize":I
    .end local v19    # "layoutHeight":I
    .local v2, "layoutHeight":I
    .local v4, "oldMainAxisSize":I
    :cond_39
    move/from16 v19, v2

    move/from16 v18, v4

    .line 405
    .end local v2    # "layoutHeight":I
    .end local v3    # "newMainAxisSize":I
    .end local v4    # "oldMainAxisSize":I
    .end local v20    # "disappearingItemsSize":J
    .restart local v19    # "layoutHeight":I
    :goto_2a
    move/from16 v5, v19

    move/from16 v19, v6

    move v6, v5

    move v5, v14

    goto :goto_2b

    .line 390
    .end local v19    # "layoutHeight":I
    .local v2, "disappearingItemsSize":J
    .local v15, "layoutHeight":I
    :cond_3a
    move-wide/from16 v20, v2

    .line 405
    .end local v2    # "disappearingItemsSize":J
    :cond_3b
    move/from16 v19, v6

    move v6, v15

    move v5, v14

    .line 406
    .end local v14    # "layoutWidth":I
    .end local v15    # "layoutHeight":I
    .local v5, "layoutWidth":I
    .local v6, "layoutHeight":I
    .local v19, "firstItemIndex":I
    :goto_2b
    nop

    .line 407
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getHeaderIndices()Landroidx/collection/IntList;

    move-result-object v2

    .line 408
    nop

    .line 409
    nop

    .line 410
    nop

    .line 411
    nop

    .line 405
    new-instance v3, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$stickingItems$1;

    invoke-direct {v3, v1, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$stickingItems$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move/from16 v4, p5

    move-object/from16 v0, p27

    move-object/from16 v14, p28

    move-object v7, v3

    move-object/from16 v1, v16

    move/from16 v15, v19

    move/from16 v3, p4

    .end local v16    # "positionedItems":Ljava/util/List;
    .end local v19    # "firstItemIndex":I
    .local v1, "positionedItems":Ljava/util/List;
    .local v15, "firstItemIndex":I
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt;->applyStickyItems(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Ljava/util/List;Landroidx/collection/IntList;IIIILkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v2

    .line 404
    move v0, v3

    move/from16 v20, v5

    move/from16 v21, v6

    .line 424
    .end local v5    # "layoutWidth":I
    .end local v6    # "layoutHeight":I
    .local v2, "stickingItems":Ljava/util/List;
    .local v20, "layoutWidth":I
    .local v21, "layoutHeight":I
    nop

    .line 425
    nop

    .line 426
    add-int/lit8 v3, p0, -0x1

    move/from16 v4, v61

    .end local v61    # "lastItemIndex":I
    .local v4, "lastItemIndex":I
    if-ne v4, v3, :cond_3d

    if-le v13, v9, :cond_3c

    goto :goto_2c

    :cond_3c
    move/from16 v3, v34

    goto :goto_2d

    :cond_3d
    :goto_2c
    move/from16 v3, v27

    .line 429
    :goto_2d
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$6;

    move/from16 v16, v3

    move-object/from16 v3, p24

    invoke-direct {v7, v3, v1, v2, v12}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$6;-><init>(Landroidx/compose/runtime/MutableState;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v14, v5, v6, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/ui/layout/MeasureResult;

    .line 443
    move/from16 v39, v13

    .end local v13    # "currentMainAxisOffset":I
    .restart local v39    # "currentMainAxisOffset":I
    neg-int v13, v0

    .line 444
    add-int v14, p3, p5

    .line 446
    invoke-static {v15, v4, v1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt;->updatedVisibleItems(IILjava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    .line 449
    if-eqz p12, :cond_3e

    sget-object v6, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2e

    :cond_3e
    sget-object v6, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_2e
    move-object/from16 v17, v6

    .line 452
    nop

    .line 423
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    .line 424
    nop

    .line 425
    nop

    .line 426
    nop

    .line 427
    nop

    .line 429
    nop

    .line 442
    nop

    .line 452
    nop

    .line 455
    nop

    .line 453
    nop

    .line 454
    nop

    .line 456
    nop

    .line 446
    nop

    .line 443
    nop

    .line 444
    nop

    .line 447
    nop

    .line 448
    nop

    .line 449
    nop

    .line 450
    nop

    .line 451
    nop

    .line 423
    move/from16 v18, p5

    move/from16 v19, p6

    move/from16 v10, p18

    move-object/from16 v11, p26

    move-object/from16 v24, v2

    move/from16 v25, v4

    move v4, v8

    move/from16 v40, v9

    move/from16 v22, v15

    move/from16 v3, v16

    move/from16 v2, v23

    move/from16 v7, v28

    move/from16 v6, v47

    move/from16 v15, p0

    move/from16 v16, p15

    move-object/from16 v9, p16

    move-object/from16 v8, p23

    move-object/from16 v23, v1

    move-object/from16 v1, v54

    .end local v8    # "consumedScroll":F
    .end local v9    # "maxOffset":I
    .end local v15    # "firstItemIndex":I
    .end local v28    # "remeasureNeeded":Z
    .end local v47    # "scrollBackAmount":F
    .end local v54    # "firstLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .local v1, "firstLine":Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;
    .local v2, "currentFirstLineScrollOffset":I
    .local v4, "consumedScroll":F
    .local v6, "scrollBackAmount":F
    .local v7, "remeasureNeeded":Z
    .local v22, "firstItemIndex":I
    .local v23, "positionedItems":Ljava/util/List;
    .local v24, "stickingItems":Ljava/util/List;
    .restart local v25    # "lastItemIndex":I
    .restart local v40    # "maxOffset":I
    invoke-direct/range {v0 .. v19}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v0
.end method
