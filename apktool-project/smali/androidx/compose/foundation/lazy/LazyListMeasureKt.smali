.class public final Landroidx/compose/foundation/lazy/LazyListMeasureKt;
.super Ljava/lang/Object;
.source "LazyListMeasure.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,678:1\n96#2,5:679\n96#2,5:684\n96#2,5:696\n50#2,5:762\n96#2,5:767\n107#2,7:772\n107#2,7:779\n54#3:689\n59#3:691\n54#3:713\n59#3:715\n85#4:690\n90#4:692\n85#4:714\n90#4:716\n26#5:693\n26#5:694\n26#5:695\n34#6,6:701\n34#6,6:707\n34#6,6:717\n117#6,2:723\n34#6,6:725\n119#6:731\n117#6,2:732\n34#6,6:734\n119#6:740\n117#6,2:741\n34#6,6:743\n119#6:749\n34#6,6:750\n52#6,6:756\n34#6,6:786\n34#6,6:792\n34#6,6:798\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n79#1:679,5\n80#1:684,5\n287#1:696,5\n604#1:762,5\n611#1:767,5\n622#1:772,7\n630#1:779,7\n105#1:689\n106#1:691\n388#1:713\n390#1:715\n105#1:690\n106#1:692\n388#1:714\n390#1:716\n140#1:693\n269#1:694\n270#1:695\n321#1:701,6\n337#1:707,6\n393#1:717,6\n506#1:723,2\n506#1:725,6\n506#1:731\n526#1:732,2\n526#1:734,6\n526#1:740\n527#1:741,2\n527#1:743,6\n527#1:749\n548#1:750,6\n575#1:756,6\n657#1:786,6\n664#1:792,6\n670#1:798,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u008c\u0001\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\\\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u00082\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0008\u0010 \u001a\u0004\u0018\u00010!H\u0002\u001a4\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010#\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00082\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004H\u0002\u001a\u009f\u0002\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020\u00082\u0006\u0010(\u001a\u00020\u00082\u0006\u0010)\u001a\u00020\u00082\u0006\u0010*\u001a\u00020\u00082\u0006\u0010+\u001a\u00020\u00082\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u0002002\u0006\u0010\u001b\u001a\u00020\u00082\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00042\u0006\u00101\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0008\u00102\u001a\u0004\u0018\u00010!2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0008\u00109\u001a\u0004\u0018\u00010:2/\u0010;\u001a+\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=\u00a2\u0006\u0002\u0008@\u0012\u0004\u0012\u00020A0<H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008B\u0010C\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006D"
    }
    d2 = {
        "calculateItemsOffsets",
        "",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
        "items",
        "",
        "extraItemsBefore",
        "extraItemsAfter",
        "layoutWidth",
        "",
        "layoutHeight",
        "finalMainAxisOffset",
        "maxOffset",
        "itemsScrollOffset",
        "isVertical",
        "",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "reverseLayout",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "createItemsAfterList",
        "visibleItems",
        "measuredItemProvider",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
        "itemsCount",
        "beyondBoundsItemCount",
        "pinnedItems",
        "consumedScroll",
        "",
        "isLookingAhead",
        "lastApproachLayoutInfo",
        "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
        "createItemsBeforeList",
        "currentFirstItemIndex",
        "measureLazyList",
        "Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        "mainAxisAvailableSize",
        "beforeContentPadding",
        "afterContentPadding",
        "spaceBetweenItems",
        "firstVisibleItemIndex",
        "firstVisibleItemScrollOffset",
        "scrollToBeConsumed",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "itemAnimator",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;",
        "hasLookaheadOccurred",
        "approachLayoutInfo",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "placementScopeInvalidator",
        "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;",
        "graphicsContext",
        "Landroidx/compose/ui/graphics/GraphicsContext;",
        "stickyItemsPlacement",
        "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
        "layout",
        "Lkotlin/Function3;",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measureLazyList-LCrQqZ4",
        "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
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
.method private static final calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;
    .locals 19
    .param p0, "items"    # Ljava/util/List;
    .param p1, "extraItemsBefore"    # Ljava/util/List;
    .param p2, "extraItemsAfter"    # Ljava/util/List;
    .param p3, "layoutWidth"    # I
    .param p4, "layoutHeight"    # I
    .param p5, "finalMainAxisOffset"    # I
    .param p6, "maxOffset"    # I
    .param p7, "itemsScrollOffset"    # I
    .param p8, "isVertical"    # Z
    .param p9, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p10, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p11, "reverseLayout"    # Z
    .param p12, "density"    # Landroidx/compose/ui/unit/Density;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;IIIIIZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 601
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

    .line 602
    .local v7, "mainAxisLayoutSize":I
    move/from16 v4, p6

    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    move-result v5

    const/4 v6, 0x0

    const/4 v8, 0x1

    move/from16 v11, p5

    if-ge v11, v5, :cond_1

    move v5, v8

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    move v12, v5

    .line 603
    .local v12, "hasSpareSpace":Z
    if-eqz v12, :cond_4

    .line 604
    if-nez p7, :cond_2

    move v5, v8

    goto :goto_2

    :cond_2
    move v5, v6

    .local v5, "value$iv":Z
    :goto_2
    const/4 v9, 0x0

    .line 762
    .local v9, "$i$f$checkPrecondition":I
    nop

    .line 763
    if-nez v5, :cond_3

    .line 764
    const/4 v10, 0x0

    .line 604
    .local v10, "$i$a$-checkPrecondition-LazyListMeasureKt$calculateItemsOffsets$1":I
    nop

    .line 764
    .end local v10    # "$i$a$-checkPrecondition-LazyListMeasureKt$calculateItemsOffsets$1":I
    const-string/jumbo v10, "non-zero itemsScrollOffset"

    invoke-static {v10}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 766
    :cond_3
    nop

    .line 608
    .end local v5    # "value$iv":Z
    .end local v9    # "$i$f$checkPrecondition":I
    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v10

    add-int/2addr v9, v10

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    add-int/2addr v9, v10

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 607
    move-object v13, v5

    .line 610
    .local v13, "positionedItems":Ljava/util/ArrayList;
    if-eqz v12, :cond_f

    .line 611
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    move v8, v6

    .local v8, "value$iv":Z
    :goto_3
    const/4 v5, 0x0

    .line 767
    .local v5, "$i$f$requirePrecondition":I
    nop

    .line 768
    if-nez v8, :cond_6

    .line 769
    const/4 v9, 0x0

    .line 612
    .local v9, "$i$a$-requirePrecondition-LazyListMeasureKt$calculateItemsOffsets$2":I
    nop

    .line 769
    .end local v9    # "$i$a$-requirePrecondition-LazyListMeasureKt$calculateItemsOffsets$2":I
    const-string/jumbo v9, "no extra items"

    invoke-static {v9}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 771
    :cond_6
    nop

    .line 615
    .end local v5    # "$i$f$requirePrecondition":I
    .end local v8    # "value$iv":Z
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v14

    .line 618
    .local v14, "itemsCount":I
    new-array v8, v14, [I

    :goto_4
    if-ge v6, v14, :cond_7

    invoke-static {v6, v3, v14}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    move-result v5

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSize()I

    move-result v5

    aput v5, v8, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 619
    .local v8, "sizes":[I
    :cond_7
    new-array v10, v14, [I

    .line 620
    .local v10, "offsets":[I
    if-eqz p8, :cond_9

    .line 622
    const/4 v5, 0x0

    .line 772
    .local v5, "$i$f$requirePreconditionNotNull":I
    nop

    .line 774
    if-eqz p9, :cond_8

    .line 778
    nop

    .line 621
    .end local v5    # "$i$f$requirePreconditionNotNull":I
    move-object/from16 v5, p9

    .local v5, "$this$calculateItemsOffsets_u24lambda_u2416":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    const/4 v6, 0x0

    .line 626
    .local v6, "$i$a$-with-LazyListMeasureKt$calculateItemsOffsets$4":I
    move-object/from16 v9, p12

    invoke-interface {v5, v9, v7, v8, v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 627
    nop

    .line 621
    .end local v5    # "$this$calculateItemsOffsets_u24lambda_u2416":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v6    # "$i$a$-with-LazyListMeasureKt$calculateItemsOffsets$4":I
    goto :goto_5

    .line 775
    .local v5, "$i$f$requirePreconditionNotNull":I
    :cond_8
    move-object/from16 v9, p12

    const/4 v6, 0x0

    .line 623
    .local v6, "$i$a$-requirePreconditionNotNull-LazyListMeasureKt$calculateItemsOffsets$3":I
    nop

    .line 775
    .end local v6    # "$i$a$-requirePreconditionNotNull-LazyListMeasureKt$calculateItemsOffsets$3":I
    const-string/jumbo v6, "null verticalArrangement when isVertical == true"

    invoke-static {v6}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v6, Lkotlin/KotlinNothingValueException;

    invoke-direct {v6}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v6

    .line 630
    .end local v5    # "$i$f$requirePreconditionNotNull":I
    :cond_9
    move-object/from16 v9, p12

    const/4 v5, 0x0

    .line 779
    .restart local v5    # "$i$f$requirePreconditionNotNull":I
    nop

    .line 781
    if-eqz p10, :cond_e

    .line 785
    nop

    .line 629
    .end local v5    # "$i$f$requirePreconditionNotNull":I
    move-object/from16 v5, p10

    .local v5, "$this$calculateItemsOffsets_u24lambda_u2418":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const/4 v15, 0x0

    .line 635
    .local v15, "$i$a$-with-LazyListMeasureKt$calculateItemsOffsets$6":I
    sget-object v9, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    move-object/from16 v6, p12

    invoke-interface/range {v5 .. v10}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 636
    nop

    .line 629
    .end local v5    # "$this$calculateItemsOffsets_u24lambda_u2418":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v15    # "$i$a$-with-LazyListMeasureKt$calculateItemsOffsets$6":I
    nop

    .line 640
    :goto_5
    invoke-static {v10}, Lkotlin/collections/ArraysKt;->getIndices([I)Lkotlin/ranges/IntRange;

    move-result-object v5

    check-cast v5, Lkotlin/ranges/IntProgression;

    if-nez v3, :cond_a

    goto :goto_6

    :cond_a
    invoke-static {v5}, Lkotlin/ranges/RangesKt;->reversed(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;

    move-result-object v5

    .line 639
    :goto_6
    nop

    .line 641
    .local v5, "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v6

    .local v6, "index":I
    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v9

    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getStep()I

    move-result v15

    if-lez v15, :cond_b

    if-le v6, v9, :cond_c

    :cond_b
    if-gez v15, :cond_13

    if-gt v9, v6, :cond_13

    .line 642
    :cond_c
    :goto_7
    aget v16, v10, v6

    .line 644
    .local v16, "absoluteOffset":I
    invoke-static {v6, v3, v14}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    move-result v4

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 646
    .local v4, "item":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    if-eqz v3, :cond_d

    .line 648
    sub-int v17, v7, v16

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSize()I

    move-result v18

    sub-int v17, v17, v18

    goto :goto_8

    .line 650
    :cond_d
    move/from16 v17, v16

    .line 646
    :goto_8
    nop

    .line 645
    move/from16 v18, v17

    .line 652
    .local v18, "relativeOffset":I
    move/from16 v0, v18

    .end local v18    # "relativeOffset":I
    .local v0, "relativeOffset":I
    invoke-virtual {v4, v0, v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 653
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 641
    .end local v0    # "relativeOffset":I
    .end local v4    # "item":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v16    # "absoluteOffset":I
    if-eq v6, v9, :cond_13

    add-int/2addr v6, v15

    move-object/from16 v0, p0

    move/from16 v4, p6

    goto :goto_7

    .line 782
    .end local v6    # "index":I
    .local v5, "$i$f$requirePreconditionNotNull":I
    :cond_e
    const/4 v0, 0x0

    .line 631
    .local v0, "$i$a$-requirePreconditionNotNull-LazyListMeasureKt$calculateItemsOffsets$5":I
    nop

    .line 782
    .end local v0    # "$i$a$-requirePreconditionNotNull-LazyListMeasureKt$calculateItemsOffsets$5":I
    const-string/jumbo v0, "null horizontalArrangement when isVertical == false"

    invoke-static {v0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    .line 656
    .end local v5    # "$i$f$requirePreconditionNotNull":I
    .end local v8    # "sizes":[I
    .end local v10    # "offsets":[I
    .end local v14    # "itemsCount":I
    :cond_f
    const/4 v0, 0x0

    .local v0, "currentMainAxis":I
    move/from16 v0, p7

    .line 657
    move-object/from16 v4, p1

    .local v4, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 786
    .local v5, "$i$f$fastForEach":I
    nop

    .line 787
    const/4 v6, 0x0

    .local v6, "index$iv":I
    move-object v8, v4

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_9
    if-ge v6, v8, :cond_10

    .line 788
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 789
    .local v9, "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .local v10, "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/4 v14, 0x0

    .line 658
    .local v14, "$i$a$-fastForEach-LazyListMeasureKt$calculateItemsOffsets$7":I
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v15

    sub-int/2addr v0, v15

    .line 659
    invoke-virtual {v10, v0, v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 660
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 661
    nop

    .line 789
    .end local v10    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v14    # "$i$a$-fastForEach-LazyListMeasureKt$calculateItemsOffsets$7":I
    nop

    .line 787
    .end local v9    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    .line 791
    .end local v6    # "index$iv":I
    :cond_10
    nop

    .line 663
    .end local v4    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    move/from16 v0, p7

    .line 664
    move-object/from16 v4, p0

    .restart local v4    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 792
    .restart local v5    # "$i$f$fastForEach":I
    nop

    .line 793
    const/4 v6, 0x0

    .restart local v6    # "index$iv":I
    move-object v8, v4

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_a
    if-ge v6, v8, :cond_11

    .line 794
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 795
    .restart local v9    # "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .restart local v10    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/4 v14, 0x0

    .line 665
    .local v14, "$i$a$-fastForEach-LazyListMeasureKt$calculateItemsOffsets$8":I
    invoke-virtual {v10, v0, v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 666
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v15

    add-int/2addr v0, v15

    .line 668
    nop

    .line 795
    .end local v10    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v14    # "$i$a$-fastForEach-LazyListMeasureKt$calculateItemsOffsets$8":I
    nop

    .line 793
    .end local v9    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    .line 797
    .end local v6    # "index$iv":I
    :cond_11
    nop

    .line 670
    .end local v4    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    move-object/from16 v4, p2

    .restart local v4    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 798
    .restart local v5    # "$i$f$fastForEach":I
    nop

    .line 799
    const/4 v6, 0x0

    .restart local v6    # "index$iv":I
    move-object v8, v4

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_b
    if-ge v6, v8, :cond_12

    .line 800
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 801
    .restart local v9    # "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .restart local v10    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/4 v14, 0x0

    .line 671
    .local v14, "$i$a$-fastForEach-LazyListMeasureKt$calculateItemsOffsets$9":I
    invoke-virtual {v10, v0, v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 672
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 673
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v15

    add-int/2addr v0, v15

    .line 674
    nop

    .line 801
    .end local v10    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v14    # "$i$a$-fastForEach-LazyListMeasureKt$calculateItemsOffsets$9":I
    nop

    .line 799
    .end local v9    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    .line 803
    .end local v6    # "index$iv":I
    :cond_12
    nop

    .line 676
    .end local v0    # "currentMainAxis":I
    .end local v4    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    :cond_13
    move-object v0, v13

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final calculateItemsOffsets$reverseAware(IZI)I
    .locals 1
    .param p0, "$this$calculateItemsOffsets_u24reverseAware"    # I
    .param p1, "$reverseLayout"    # Z
    .param p2, "itemsCount"    # I

    .line 616
    if-nez p1, :cond_0

    move v0, p0

    goto :goto_0

    :cond_0
    sub-int v0, p2, p0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0
.end method

.method private static final createItemsAfterList(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;
    .locals 22
    .param p0, "visibleItems"    # Ljava/util/List;
    .param p1, "measuredItemProvider"    # Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;
    .param p2, "itemsCount"    # I
    .param p3, "beyondBoundsItemCount"    # I
    .param p4, "pinnedItems"    # Ljava/util/List;
    .param p5, "consumedScroll"    # F
    .param p6, "isLookingAhead"    # Z
    .param p7, "lastApproachLayoutInfo"    # Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;FZ",
            "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 473
    move/from16 v0, p2

    const/4 v1, 0x0

    .line 475
    .local v1, "list":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "end":I
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v2

    .line 477
    add-int v3, v2, p3

    add-int/lit8 v4, v0, -0x1

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 479
    invoke-static/range {p0 .. p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v3

    const/4 v4, 0x1

    add-int/2addr v3, v4

    .local v3, "i":I
    if-gt v3, v2, :cond_1

    move v6, v3

    .line 480
    .end local v3    # "i":I
    .local v6, "i":I
    :goto_0
    if-nez v1, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v3

    check-cast v1, Ljava/util/List;

    .line 481
    :cond_0
    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 479
    if-eq v6, v2, :cond_1

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 484
    .end local v6    # "i":I
    :cond_1
    if-eqz p6, :cond_18

    .line 486
    nop

    .line 487
    if-eqz p7, :cond_18

    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_18

    .line 492
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v3

    .local v3, "$this$createItemsAfterList_u24lambda_u246":Ljava/util/List;
    const/4 v5, 0x0

    .line 493
    .local v5, "$i$a$-run-LazyListMeasureKt$createItemsAfterList$firstItem$1":I
    const/4 v6, 0x0

    .line 494
    .local v6, "found":Landroidx/compose/foundation/lazy/LazyListItemInfo;
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v4

    .local v7, "i":I
    :goto_1
    const/4 v8, -0x1

    if-ge v8, v7, :cond_4

    .line 495
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    invoke-interface {v8}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    move-result v8

    if-le v8, v2, :cond_3

    if-eqz v7, :cond_2

    add-int/lit8 v8, v7, -0x1

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    invoke-interface {v8}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    move-result v8

    if-gt v8, v2, :cond_3

    .line 496
    :cond_2
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v6, v8

    check-cast v6, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 497
    goto :goto_2

    .line 494
    :cond_3
    add-int/lit8 v7, v7, -0x1

    goto :goto_1

    .line 500
    .end local v7    # "i":I
    :cond_4
    :goto_2
    nop

    .line 492
    .end local v3    # "$this$createItemsAfterList_u24lambda_u246":Ljava/util/List;
    .end local v5    # "$i$a$-run-LazyListMeasureKt$createItemsAfterList$firstItem$1":I
    .end local v6    # "found":Landroidx/compose/foundation/lazy/LazyListItemInfo;
    nop

    .line 491
    nop

    .line 502
    .local v6, "firstItem":Landroidx/compose/foundation/lazy/LazyListItemInfo;
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 503
    .local v3, "lastVisibleItem":Landroidx/compose/foundation/lazy/LazyListItemInfo;
    if-eqz v6, :cond_c

    .line 504
    invoke-interface {v6}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    move-result v7

    .restart local v7    # "i":I
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    move-result v8

    add-int/lit8 v9, v0, -0x1

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v14

    if-gt v7, v14, :cond_b

    move v8, v7

    .line 506
    .end local v7    # "i":I
    .local v8, "i":I
    :goto_3
    if-eqz v1, :cond_8

    move-object v7, v1

    .local v7, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 723
    .local v9, "$i$f$fastFirstOrNull":I
    nop

    .line 724
    move-object v10, v7

    .local v10, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v11, 0x0

    .line 725
    .local v11, "$i$f$fastForEach":I
    nop

    .line 726
    const/4 v12, 0x0

    .local v12, "index$iv$iv":I
    move-object v15, v10

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15}, Ljava/util/Collection;->size()I

    move-result v15

    :goto_4
    if-ge v12, v15, :cond_7

    .line 727
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 728
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    .local v17, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 724
    .local v18, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v19, v17

    check-cast v19, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .local v19, "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/16 v20, 0x0

    .line 506
    .local v20, "$i$a$-fastFirstOrNull-LazyListMeasureKt$createItemsAfterList$1":I
    move/from16 v21, v4

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v4

    if-ne v4, v8, :cond_5

    move/from16 v4, v21

    goto :goto_5

    :cond_5
    const/4 v4, 0x0

    .line 724
    .end local v19    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v20    # "$i$a$-fastFirstOrNull-LazyListMeasureKt$createItemsAfterList$1":I
    :goto_5
    if-eqz v4, :cond_6

    goto :goto_6

    .line 728
    .end local v17    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_6
    nop

    .line 726
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v12, v12, 0x1

    move/from16 v4, v21

    goto :goto_4

    :cond_7
    move/from16 v21, v4

    .line 730
    .end local v12    # "index$iv$iv":I
    nop

    .line 731
    .end local v10    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v11    # "$i$f$fastForEach":I
    const/16 v17, 0x0

    .line 506
    .end local v7    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastFirstOrNull":I
    :goto_6
    check-cast v17, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    goto :goto_7

    :cond_8
    move/from16 v21, v4

    const/16 v17, 0x0

    :goto_7
    if-nez v17, :cond_a

    .line 507
    if-nez v1, :cond_9

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v4

    check-cast v1, Ljava/util/List;

    .line 508
    :cond_9
    const/4 v11, 0x2

    const/4 v12, 0x0

    const-wide/16 v9, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 504
    :cond_a
    if-eq v8, v14, :cond_d

    add-int/lit8 v8, v8, 0x1

    move/from16 v4, v21

    goto :goto_3

    .end local v8    # "i":I
    .local v7, "i":I
    :cond_b
    move/from16 v21, v4

    goto :goto_8

    .line 503
    .end local v7    # "i":I
    :cond_c
    move/from16 v21, v4

    .line 516
    :cond_d
    :goto_8
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getViewportEndOffset()I

    move-result v4

    .line 517
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getOffset()I

    move-result v7

    .line 516
    sub-int/2addr v4, v7

    .line 518
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getSize()I

    move-result v7

    .line 516
    sub-int/2addr v4, v7

    int-to-float v4, v4

    .line 519
    nop

    .line 516
    sub-float v4, v4, p5

    .line 515
    nop

    .line 520
    .local v4, "additionalOffset":F
    const/4 v7, 0x0

    cmpl-float v7, v4, v7

    if-lez v7, :cond_18

    .line 521
    const/4 v7, 0x0

    .local v7, "index":I
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    move-result v8

    add-int/lit8 v8, v8, 0x1

    .line 522
    .end local v7    # "index":I
    .local v8, "index":I
    const/4 v7, 0x0

    move v14, v7

    .line 523
    .local v14, "totalOffset":I
    :goto_9
    if-ge v8, v0, :cond_18

    int-to-float v7, v14

    cmpg-float v7, v7, v4

    if-gez v7, :cond_18

    .line 525
    if-gt v8, v2, :cond_11

    .line 526
    move-object/from16 v7, p0

    .local v7, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 732
    .restart local v9    # "$i$f$fastFirstOrNull":I
    nop

    .line 733
    move-object v10, v7

    .restart local v10    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v11, 0x0

    .line 734
    .restart local v11    # "$i$f$fastForEach":I
    nop

    .line 735
    const/4 v12, 0x0

    .restart local v12    # "index$iv$iv":I
    move-object v15, v10

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15}, Ljava/util/Collection;->size()I

    move-result v15

    :goto_a
    if-ge v12, v15, :cond_10

    .line 736
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 737
    .restart local v16    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    .restart local v17    # "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 733
    .restart local v18    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v19, v17

    check-cast v19, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .restart local v19    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/16 v20, 0x0

    .line 526
    .local v20, "$i$a$-fastFirstOrNull-LazyListMeasureKt$createItemsAfterList$item$1":I
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v5

    if-ne v5, v8, :cond_e

    move/from16 v5, v21

    goto :goto_b

    :cond_e
    const/4 v5, 0x0

    .line 733
    .end local v19    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v20    # "$i$a$-fastFirstOrNull-LazyListMeasureKt$createItemsAfterList$item$1":I
    :goto_b
    if-eqz v5, :cond_f

    goto :goto_c

    .line 737
    .end local v17    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_f
    nop

    .line 735
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v12, v12, 0x1

    goto :goto_a

    .line 739
    .end local v12    # "index$iv$iv":I
    :cond_10
    nop

    .line 740
    .end local v10    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v11    # "$i$f$fastForEach":I
    const/16 v17, 0x0

    .end local v7    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastFirstOrNull":I
    :goto_c
    check-cast v17, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    goto :goto_10

    .line 527
    :cond_11
    if-eqz v1, :cond_15

    move-object v5, v1

    .local v5, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 741
    .local v7, "$i$f$fastFirstOrNull":I
    nop

    .line 742
    move-object v9, v5

    .local v9, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 743
    .local v10, "$i$f$fastForEach":I
    nop

    .line 744
    const/4 v11, 0x0

    .local v11, "index$iv$iv":I
    move-object v12, v9

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    :goto_d
    if-ge v11, v12, :cond_14

    .line 745
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 746
    .local v15, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    .local v16, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 742
    .local v17, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v18, v16

    check-cast v18, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .local v18, "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/16 v19, 0x0

    .line 527
    .local v19, "$i$a$-fastFirstOrNull-LazyListMeasureKt$createItemsAfterList$item$2":I
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v13

    if-ne v13, v8, :cond_12

    move/from16 v13, v21

    goto :goto_e

    :cond_12
    const/4 v13, 0x0

    .line 742
    .end local v18    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v19    # "$i$a$-fastFirstOrNull-LazyListMeasureKt$createItemsAfterList$item$2":I
    :goto_e
    if-eqz v13, :cond_13

    goto :goto_f

    .line 746
    .end local v16    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_13
    nop

    .line 744
    .end local v15    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    goto :goto_d

    .line 748
    .end local v11    # "index$iv$iv":I
    :cond_14
    nop

    .line 749
    .end local v9    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastForEach":I
    const/16 v16, 0x0

    .end local v5    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastFirstOrNull":I
    :goto_f
    move-object/from16 v17, v16

    check-cast v17, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    goto :goto_10

    .line 527
    :cond_15
    const/16 v17, 0x0

    .line 525
    :goto_10
    nop

    .line 524
    nop

    .line 528
    .local v17, "item":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    if-eqz v17, :cond_16

    .line 529
    add-int/lit8 v8, v8, 0x1

    .line 530
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v5

    add-int/2addr v14, v5

    goto/16 :goto_9

    .line 532
    :cond_16
    if-nez v1, :cond_17

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v5

    check-cast v1, Ljava/util/List;

    .line 533
    :cond_17
    const/4 v11, 0x2

    const/4 v12, 0x0

    const-wide/16 v9, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 534
    add-int/lit8 v8, v8, 0x1

    .line 535
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v5

    add-int/2addr v14, v5

    .end local v17    # "item":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    goto/16 :goto_9

    .line 543
    .end local v3    # "lastVisibleItem":Landroidx/compose/foundation/lazy/LazyListItemInfo;
    .end local v4    # "additionalOffset":F
    .end local v6    # "firstItem":Landroidx/compose/foundation/lazy/LazyListItemInfo;
    .end local v8    # "index":I
    .end local v14    # "totalOffset":I
    :cond_18
    if-eqz v1, :cond_1a

    move-object v3, v1

    .local v3, "it":Ljava/util/List;
    const/4 v4, 0x0

    .line 544
    .local v4, "$i$a$-let-LazyListMeasureKt$createItemsAfterList$2":I
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v5

    if-le v5, v2, :cond_19

    .line 545
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v2

    .line 547
    :cond_19
    nop

    .line 543
    .end local v3    # "it":Ljava/util/List;
    .end local v4    # "$i$a$-let-LazyListMeasureKt$createItemsAfterList$2":I
    nop

    .line 548
    :cond_1a
    move-object/from16 v3, p4

    .local v3, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 750
    .local v4, "$i$f$fastForEach":I
    nop

    .line 751
    const/4 v5, 0x0

    .local v5, "index$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_11
    if-ge v5, v6, :cond_1d

    .line 752
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 753
    .local v13, "item$iv":Ljava/lang/Object;
    move-object v7, v13

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v8

    .restart local v8    # "index":I
    const/4 v14, 0x0

    .line 549
    .local v14, "$i$a$-fastForEach-LazyListMeasureKt$createItemsAfterList$3":I
    if-le v8, v2, :cond_1c

    .line 550
    if-nez v1, :cond_1b

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v7

    check-cast v1, Ljava/util/List;

    .line 551
    :cond_1b
    const/4 v11, 0x2

    const/4 v12, 0x0

    const-wide/16 v9, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 553
    :cond_1c
    nop

    .line 753
    .end local v8    # "index":I
    .end local v14    # "$i$a$-fastForEach-LazyListMeasureKt$createItemsAfterList$3":I
    nop

    .line 751
    .end local v13    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_11

    .line 755
    .end local v5    # "index$iv":I
    :cond_1d
    nop

    .line 555
    .end local v3    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    if-nez v1, :cond_1e

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_12

    :cond_1e
    move-object v3, v1

    :goto_12
    return-object v3
.end method

.method private static final createItemsBeforeList(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;
    .locals 14
    .param p0, "currentFirstItemIndex"    # I
    .param p1, "measuredItemProvider"    # Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;
    .param p2, "beyondBoundsItemCount"    # I
    .param p3, "pinnedItems"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 564
    const/4 v0, 0x0

    .line 566
    .local v0, "list":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "start":I
    move v1, p0

    .line 568
    const/4 v2, 0x0

    sub-int v3, v1, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 570
    add-int/lit8 v2, p0, -0x1

    .local v2, "i":I
    if-gt v1, v2, :cond_1

    move v3, v2

    .line 571
    .end local v2    # "i":I
    .local v3, "i":I
    :goto_0
    if-nez v0, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v0, v2

    check-cast v0, Ljava/util/List;

    .line 572
    :cond_0
    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 570
    if-eq v3, v1, :cond_1

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 575
    .end local v3    # "i":I
    :cond_1
    move-object/from16 v2, p3

    .local v2, "$this$fastForEachReversed$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 756
    .local v3, "$i$f$fastForEachReversed":I
    nop

    .line 757
    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_5

    :cond_2
    move v11, v4

    .local v11, "index$iv":I
    add-int/lit8 v4, v4, -0x1

    .line 758
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 759
    .local v12, "item$iv":Ljava/lang/Object;
    move-object v5, v12

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v6

    .local v6, "index":I
    const/4 v13, 0x0

    .line 576
    .local v13, "$i$a$-fastForEachReversed-LazyListMeasureKt$createItemsBeforeList$1":I
    if-ge v6, v1, :cond_4

    .line 577
    if-nez v0, :cond_3

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object v0, v5

    check-cast v0, Ljava/util/List;

    .line 578
    :cond_3
    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 580
    :cond_4
    nop

    .line 759
    .end local v6    # "index":I
    .end local v13    # "$i$a$-fastForEachReversed-LazyListMeasureKt$createItemsBeforeList$1":I
    nop

    .line 757
    .end local v12    # "item$iv":Ljava/lang/Object;
    if-gez v4, :cond_2

    .line 761
    .end local v11    # "index$iv":I
    :cond_5
    nop

    .line 582
    .end local v2    # "$this$fastForEachReversed$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEachReversed":I
    if-nez v0, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_6
    move-object v2, v0

    :goto_1
    return-object v2
.end method

.method public static final measureLazyList-LCrQqZ4(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;
    .locals 58
    .param p0, "itemsCount"    # I
    .param p1, "measuredItemProvider"    # Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;
    .param p2, "mainAxisAvailableSize"    # I
    .param p3, "beforeContentPadding"    # I
    .param p4, "afterContentPadding"    # I
    .param p5, "spaceBetweenItems"    # I
    .param p6, "firstVisibleItemIndex"    # I
    .param p7, "firstVisibleItemScrollOffset"    # I
    .param p8, "scrollToBeConsumed"    # F
    .param p9, "constraints"    # J
    .param p11, "isVertical"    # Z
    .param p12, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p13, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p14, "reverseLayout"    # Z
    .param p15, "density"    # Landroidx/compose/ui/unit/Density;
    .param p16, "itemAnimator"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .param p17, "beyondBoundsItemCount"    # I
    .param p18, "pinnedItems"    # Ljava/util/List;
    .param p19, "hasLookaheadOccurred"    # Z
    .param p20, "isLookingAhead"    # Z
    .param p21, "approachLayoutInfo"    # Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
    .param p22, "coroutineScope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p23, "placementScopeInvalidator"    # Landroidx/compose/runtime/MutableState;
    .param p24, "graphicsContext"    # Landroidx/compose/ui/graphics/GraphicsContext;
    .param p25, "stickyItemsPlacement"    # Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;
    .param p26, "layout"    # Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "IIIIIIFJZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;ZZ",
            "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
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
            "Landroidx/compose/foundation/lazy/LazyListMeasureResult;"
        }
    .end annotation

    .line 79
    move/from16 v15, p0

    move/from16 v8, p3

    move-wide/from16 v9, p9

    move-object/from16 v11, p26

    const/4 v12, 0x0

    const/16 v26, 0x1

    if-ltz v8, :cond_0

    move/from16 v0, v26

    goto :goto_0

    :cond_0
    move v0, v12

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 679
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 680
    if-nez v0, :cond_1

    .line 681
    const/4 v2, 0x0

    .line 79
    .local v2, "$i$a$-requirePrecondition-LazyListMeasureKt$measureLazyList$1":I
    nop

    .line 681
    .end local v2    # "$i$a$-requirePrecondition-LazyListMeasureKt$measureLazyList$1":I
    const-string/jumbo v2, "invalid beforeContentPadding"

    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 683
    :cond_1
    nop

    .line 80
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    if-ltz p4, :cond_2

    move/from16 v0, v26

    goto :goto_1

    :cond_2
    move v0, v12

    .restart local v0    # "value$iv":Z
    :goto_1
    const/4 v1, 0x0

    .line 684
    .restart local v1    # "$i$f$requirePrecondition":I
    nop

    .line 685
    if-nez v0, :cond_3

    .line 686
    const/4 v2, 0x0

    .line 80
    .local v2, "$i$a$-requirePrecondition-LazyListMeasureKt$measureLazyList$2":I
    nop

    .line 686
    .end local v2    # "$i$a$-requirePrecondition-LazyListMeasureKt$measureLazyList$2":I
    const-string/jumbo v2, "invalid afterContentPadding"

    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 688
    :cond_3
    nop

    .line 82
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    const-wide v31, 0xffffffffL

    const/16 v33, 0x20

    if-gtz v15, :cond_6

    .line 84
    invoke-static {v9, v10}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v18

    .line 85
    .local v18, "layoutWidth":I
    invoke-static {v9, v10}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v19

    .line 88
    .local v19, "layoutHeight":I
    nop

    .line 89
    nop

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v0

    check-cast v20, Ljava/util/List;

    .line 91
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    move-result-object v21

    .line 86
    nop

    .line 87
    nop

    .line 88
    nop

    .line 89
    nop

    .line 90
    nop

    .line 91
    nop

    .line 92
    move-object/from16 v22, p1

    check-cast v22, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;

    .line 93
    nop

    .line 95
    nop

    .line 94
    nop

    .line 96
    nop

    .line 97
    nop

    .line 98
    nop

    .line 99
    nop

    .line 100
    nop

    .line 86
    const/16 v17, 0x0

    const/16 v25, 0x1

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v23, p11

    move-object/from16 v16, p16

    move/from16 v26, p19

    move/from16 v24, p20

    move-object/from16 v29, p22

    move-object/from16 v30, p24

    invoke-virtual/range {v16 .. v30}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)V

    .line 102
    if-nez p20, :cond_4

    .line 103
    invoke-virtual/range {p16 .. p16}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMinSizeToFitDisappearingItems-YbymL2g()J

    move-result-wide v0

    .line 104
    .local v0, "disappearingItemsSize":J
    sget-object v2, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    .line 105
    const/4 v2, 0x0

    .line 689
    .local v2, "$i$f$getWidth-impl":I
    move-wide v3, v0

    .local v3, "value$iv$iv":J
    const/4 v5, 0x0

    .line 690
    .local v5, "$i$f$unpackInt1":I
    shr-long v6, v3, v33

    long-to-int v3, v6

    .line 689
    .end local v3    # "value$iv$iv":J
    .end local v5    # "$i$f$unpackInt1":I
    nop

    .line 105
    .end local v2    # "$i$f$getWidth-impl":I
    invoke-static {v9, v10, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v18

    .line 106
    const/4 v2, 0x0

    .line 691
    .local v2, "$i$f$getHeight-impl":I
    move-wide v3, v0

    .restart local v3    # "value$iv$iv":J
    const/4 v5, 0x0

    .line 692
    .local v5, "$i$f$unpackInt2":I
    and-long v6, v3, v31

    long-to-int v3, v6

    .line 691
    .end local v3    # "value$iv$iv":J
    .end local v5    # "$i$f$unpackInt2":I
    nop

    .line 106
    .end local v2    # "$i$f$getHeight-impl":I
    invoke-static {v9, v10, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v19

    .line 114
    .end local v0    # "disappearingItemsSize":J
    :cond_4
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$3;->INSTANCE:Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$3;

    invoke-interface {v11, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v39, v0

    check-cast v39, Landroidx/compose/ui/layout/MeasureResult;

    .line 116
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v46

    .line 117
    neg-int v0, v8

    .line 118
    add-int v48, p2, p4

    .line 121
    if-eqz p11, :cond_5

    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2

    :cond_5
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_2
    move-object/from16 v51, v1

    .line 127
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getChildConstraints-msEJaDk()J

    move-result-wide v44

    .line 109
    new-instance v34, Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    .line 110
    nop

    .line 111
    nop

    .line 112
    nop

    .line 113
    nop

    .line 114
    nop

    .line 115
    nop

    .line 124
    nop

    .line 125
    nop

    .line 126
    nop

    .line 127
    nop

    .line 116
    nop

    .line 117
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

    .line 109
    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v49, 0x0

    const/16 v54, 0x0

    move/from16 v52, p4

    move/from16 v53, p5

    move/from16 v50, p14

    move-object/from16 v43, p15

    move-object/from16 v42, p22

    move/from16 v47, v0

    invoke-direct/range {v34 .. v54}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v34

    .line 130
    .end local v18    # "layoutWidth":I
    .end local v19    # "layoutHeight":I
    :cond_6
    move/from16 v0, p6

    .line 131
    .local v0, "currentFirstItemIndex":I
    move/from16 v1, p7

    .line 132
    .local v1, "currentFirstItemScrollOffset":I
    if-lt v0, v15, :cond_7

    .line 135
    add-int/lit8 v0, v15, -0x1

    .line 136
    const/4 v1, 0x0

    .line 140
    :cond_7
    move/from16 v2, p8

    .local v2, "$this$fastRoundToInt$iv":F
    const/4 v3, 0x0

    .line 693
    .local v3, "$i$f$fastRoundToInt":I
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 140
    .end local v2    # "$this$fastRoundToInt$iv":F
    .end local v3    # "$i$f$fastRoundToInt":I
    nop

    .line 144
    .local v2, "scrollDelta":I
    sub-int/2addr v1, v2

    .line 147
    if-nez v0, :cond_8

    if-gez v1, :cond_8

    .line 148
    add-int/2addr v2, v1

    .line 149
    const/4 v1, 0x0

    move v6, v2

    goto :goto_3

    .line 153
    :cond_8
    move v6, v2

    .end local v2    # "scrollDelta":I
    .local v6, "scrollDelta":I
    :goto_3
    new-instance v2, Lkotlin/collections/ArrayDeque;

    invoke-direct {v2}, Lkotlin/collections/ArrayDeque;-><init>()V

    move-object v13, v2

    .line 156
    .local v13, "visibleItems":Lkotlin/collections/ArrayDeque;
    neg-int v2, v8

    if-gez p5, :cond_9

    move/from16 v3, p5

    goto :goto_4

    :cond_9
    move v3, v12

    :goto_4
    add-int v14, v2, v3

    .line 157
    .local v14, "minOffset":I
    move/from16 v7, p2

    .line 162
    .local v7, "maxOffset":I
    add-int/2addr v1, v14

    .line 165
    const/4 v2, 0x0

    .line 170
    .local v2, "maxCrossAxis":I
    const/16 v16, 0x0

    move/from16 v17, v0

    .line 175
    .end local v0    # "currentFirstItemIndex":I
    .local v16, "remeasureNeeded":Z
    .local v17, "currentFirstItemIndex":I
    :goto_5
    if-gez v1, :cond_a

    if-lez v17, :cond_a

    .line 176
    move v0, v1

    .end local v1    # "currentFirstItemScrollOffset":I
    .local v0, "currentFirstItemScrollOffset":I
    add-int/lit8 v1, v17, -0x1

    .line 177
    .local v1, "previous":I
    const/4 v4, 0x2

    const/4 v5, 0x0

    move/from16 v18, v2

    .end local v2    # "maxCrossAxis":I
    .local v18, "maxCrossAxis":I
    const-wide/16 v2, 0x0

    move/from16 v55, v0

    move/from16 v56, v18

    move-object/from16 v0, p1

    .end local v0    # "currentFirstItemScrollOffset":I
    .end local v18    # "maxCrossAxis":I
    .local v55, "currentFirstItemScrollOffset":I
    .local v56, "maxCrossAxis":I
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v2

    .line 178
    .local v2, "measuredItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    invoke-virtual {v13, v12, v2}, Lkotlin/collections/ArrayDeque;->add(ILjava/lang/Object;)V

    .line 179
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v0

    move/from16 v3, v56

    .end local v56    # "maxCrossAxis":I
    .local v3, "maxCrossAxis":I
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 180
    .end local v3    # "maxCrossAxis":I
    .local v0, "maxCrossAxis":I
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v3

    move/from16 v4, v55

    .end local v55    # "currentFirstItemScrollOffset":I
    .local v4, "currentFirstItemScrollOffset":I
    add-int/2addr v3, v4

    .line 181
    .end local v4    # "currentFirstItemScrollOffset":I
    .local v3, "currentFirstItemScrollOffset":I
    move/from16 v17, v1

    move v2, v0

    move v1, v3

    .end local v1    # "previous":I
    .end local v2    # "measuredItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    goto :goto_5

    .line 175
    .end local v0    # "maxCrossAxis":I
    .end local v3    # "currentFirstItemScrollOffset":I
    .local v1, "currentFirstItemScrollOffset":I
    .local v2, "maxCrossAxis":I
    :cond_a
    move v4, v1

    move v3, v2

    .line 186
    .end local v1    # "currentFirstItemScrollOffset":I
    .end local v2    # "maxCrossAxis":I
    .local v3, "maxCrossAxis":I
    .restart local v4    # "currentFirstItemScrollOffset":I
    if-ge v4, v14, :cond_b

    .line 187
    sub-int v0, v14, v4

    .line 188
    .local v0, "notConsumedScrollDelta":I
    move v1, v14

    .line 189
    .end local v4    # "currentFirstItemScrollOffset":I
    .restart local v1    # "currentFirstItemScrollOffset":I
    sub-int/2addr v6, v0

    goto :goto_6

    .line 186
    .end local v0    # "notConsumedScrollDelta":I
    .end local v1    # "currentFirstItemScrollOffset":I
    .restart local v4    # "currentFirstItemScrollOffset":I
    :cond_b
    move v1, v4

    .line 193
    .end local v4    # "currentFirstItemScrollOffset":I
    .restart local v1    # "currentFirstItemScrollOffset":I
    :goto_6
    sub-int/2addr v1, v14

    .line 195
    move/from16 v0, v17

    .line 196
    .local v0, "index":I
    add-int v2, v7, p4

    invoke-static {v2, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    .line 197
    .local v2, "maxMainAxis":I
    neg-int v4, v1

    .line 200
    .local v4, "currentMainAxisOffset":I
    const/4 v5, 0x0

    .line 201
    .local v5, "indexInVisibleItems":I
    :goto_7
    invoke-virtual {v13}, Lkotlin/collections/ArrayDeque;->size()I

    move-result v12

    if-ge v5, v12, :cond_d

    .line 202
    if-lt v4, v2, :cond_c

    .line 204
    invoke-virtual {v13, v5}, Lkotlin/collections/ArrayDeque;->remove(I)Ljava/lang/Object;

    .line 205
    const/16 v16, 0x1

    const/4 v12, 0x0

    goto :goto_7

    .line 207
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 208
    invoke-virtual {v13, v5}, Lkotlin/collections/ArrayDeque;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v12

    add-int/2addr v4, v12

    .line 209
    add-int/lit8 v5, v5, 0x1

    const/4 v12, 0x0

    goto :goto_7

    .line 201
    :cond_d
    move v12, v1

    move/from16 v27, v16

    move v1, v0

    move v0, v4

    .line 217
    .end local v4    # "currentMainAxisOffset":I
    .end local v16    # "remeasureNeeded":Z
    .local v0, "currentMainAxisOffset":I
    .local v1, "index":I
    .local v12, "currentFirstItemScrollOffset":I
    .local v27, "remeasureNeeded":Z
    :goto_8
    if-ge v1, v15, :cond_11

    .line 218
    if-lt v0, v2, :cond_f

    .line 219
    if-lez v0, :cond_f

    .line 220
    invoke-virtual {v13}, Lkotlin/collections/ArrayDeque;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_e

    goto :goto_9

    :cond_e
    move/from16 v28, v2

    move v11, v3

    move/from16 v29, v5

    move/from16 v21, v6

    move v6, v0

    move v0, v1

    goto/16 :goto_b

    .line 222
    :cond_f
    :goto_9
    const/4 v4, 0x2

    move/from16 v16, v5

    .end local v5    # "indexInVisibleItems":I
    .local v16, "indexInVisibleItems":I
    const/4 v5, 0x0

    move/from16 v19, v2

    move/from16 v20, v3

    .end local v2    # "maxMainAxis":I
    .end local v3    # "maxCrossAxis":I
    .local v19, "maxMainAxis":I
    .local v20, "maxCrossAxis":I
    const-wide/16 v2, 0x0

    move/from16 v21, v6

    move/from16 v29, v16

    move/from16 v28, v19

    move/from16 v11, v20

    move v6, v0

    move-object/from16 v0, p1

    .end local v0    # "currentMainAxisOffset":I
    .end local v16    # "indexInVisibleItems":I
    .end local v19    # "maxMainAxis":I
    .end local v20    # "maxCrossAxis":I
    .local v6, "currentMainAxisOffset":I
    .local v11, "maxCrossAxis":I
    .local v21, "scrollDelta":I
    .local v28, "maxMainAxis":I
    .local v29, "indexInVisibleItems":I
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v2

    .line 223
    move v0, v1

    .end local v1    # "index":I
    .local v0, "index":I
    .local v2, "measuredItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v1

    add-int/2addr v1, v6

    .line 225
    .end local v6    # "currentMainAxisOffset":I
    .local v1, "currentMainAxisOffset":I
    if-gt v1, v14, :cond_10

    add-int/lit8 v3, v15, -0x1

    if-eq v0, v3, :cond_10

    .line 227
    add-int/lit8 v3, v0, 0x1

    .line 228
    .end local v17    # "currentFirstItemIndex":I
    .local v3, "currentFirstItemIndex":I
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v4

    sub-int/2addr v12, v4

    .line 229
    const/4 v4, 0x1

    move/from16 v17, v3

    move/from16 v27, v4

    move v3, v11

    .end local v27    # "remeasureNeeded":Z
    .local v4, "remeasureNeeded":Z
    goto :goto_a

    .line 231
    .end local v3    # "currentFirstItemIndex":I
    .end local v4    # "remeasureNeeded":Z
    .restart local v17    # "currentFirstItemIndex":I
    .restart local v27    # "remeasureNeeded":Z
    :cond_10
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v3

    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 232
    .end local v11    # "maxCrossAxis":I
    .local v3, "maxCrossAxis":I
    invoke-virtual {v13, v2}, Lkotlin/collections/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 235
    :goto_a
    add-int/lit8 v0, v0, 0x1

    move v2, v1

    move v1, v0

    move v0, v2

    move-object/from16 v11, p26

    move/from16 v6, v21

    move/from16 v2, v28

    move/from16 v5, v29

    goto :goto_8

    .line 217
    .end local v21    # "scrollDelta":I
    .end local v28    # "maxMainAxis":I
    .end local v29    # "indexInVisibleItems":I
    .local v0, "currentMainAxisOffset":I
    .local v1, "index":I
    .local v2, "maxMainAxis":I
    .restart local v5    # "indexInVisibleItems":I
    .local v6, "scrollDelta":I
    :cond_11
    move/from16 v28, v2

    move v11, v3

    move/from16 v29, v5

    move/from16 v21, v6

    move v6, v0

    move v0, v1

    .line 238
    .end local v1    # "index":I
    .end local v2    # "maxMainAxis":I
    .end local v3    # "maxCrossAxis":I
    .end local v5    # "indexInVisibleItems":I
    .local v0, "index":I
    .local v6, "currentMainAxisOffset":I
    .restart local v11    # "maxCrossAxis":I
    .restart local v21    # "scrollDelta":I
    .restart local v28    # "maxMainAxis":I
    .restart local v29    # "indexInVisibleItems":I
    :goto_b
    move/from16 v1, v21

    .line 241
    .local v1, "preScrollBackScrollDelta":I
    if-ge v6, v7, :cond_14

    .line 242
    sub-int v16, v7, v6

    .line 243
    .local v16, "toScrollBack":I
    sub-int v12, v12, v16

    .line 244
    add-int v6, v6, v16

    .line 246
    :goto_c
    if-ge v12, v8, :cond_12

    if-lez v17, :cond_12

    .line 248
    move v2, v1

    .end local v1    # "preScrollBackScrollDelta":I
    .local v2, "preScrollBackScrollDelta":I
    add-int/lit8 v1, v17, -0x1

    .line 249
    .local v1, "previousIndex":I
    const/4 v4, 0x2

    const/4 v5, 0x0

    move/from16 v19, v2

    .end local v2    # "preScrollBackScrollDelta":I
    .local v19, "preScrollBackScrollDelta":I
    const-wide/16 v2, 0x0

    move/from16 v30, v0

    move/from16 v8, v19

    move-object/from16 v0, p1

    .end local v0    # "index":I
    .end local v19    # "preScrollBackScrollDelta":I
    .local v8, "preScrollBackScrollDelta":I
    .local v30, "index":I
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v2

    .line 250
    .local v2, "measuredItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/4 v3, 0x0

    invoke-virtual {v13, v3, v2}, Lkotlin/collections/ArrayDeque;->add(ILjava/lang/Object;)V

    .line 251
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v4

    invoke-static {v11, v4}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 252
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v4

    add-int/2addr v12, v4

    .line 253
    move/from16 v17, v1

    move v1, v8

    move/from16 v0, v30

    move/from16 v8, p3

    .end local v1    # "previousIndex":I
    .end local v2    # "measuredItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    goto :goto_c

    .line 246
    .end local v8    # "preScrollBackScrollDelta":I
    .end local v30    # "index":I
    .restart local v0    # "index":I
    .local v1, "preScrollBackScrollDelta":I
    :cond_12
    move/from16 v30, v0

    move v8, v1

    const/4 v3, 0x0

    move-object/from16 v0, p1

    .line 255
    .end local v0    # "index":I
    .end local v1    # "preScrollBackScrollDelta":I
    .restart local v8    # "preScrollBackScrollDelta":I
    .restart local v30    # "index":I
    add-int v1, v21, v16

    .line 256
    .end local v21    # "scrollDelta":I
    .local v1, "scrollDelta":I
    if-gez v12, :cond_13

    .line 257
    add-int/2addr v1, v12

    .line 258
    add-int v2, v6, v12

    .line 259
    .end local v6    # "currentMainAxisOffset":I
    .local v2, "currentMainAxisOffset":I
    const/4 v12, 0x0

    move/from16 v39, v12

    move v12, v1

    move/from16 v1, v39

    move/from16 v39, v2

    move/from16 v2, v17

    goto :goto_d

    .line 256
    .end local v2    # "currentMainAxisOffset":I
    .restart local v6    # "currentMainAxisOffset":I
    :cond_13
    move v2, v12

    move v12, v1

    move v1, v2

    move/from16 v39, v6

    move/from16 v2, v17

    goto :goto_d

    .line 241
    .end local v8    # "preScrollBackScrollDelta":I
    .end local v16    # "toScrollBack":I
    .end local v30    # "index":I
    .restart local v0    # "index":I
    .local v1, "preScrollBackScrollDelta":I
    .restart local v21    # "scrollDelta":I
    :cond_14
    move/from16 v30, v0

    move v8, v1

    const/4 v3, 0x0

    move-object/from16 v0, p1

    .end local v0    # "index":I
    .end local v1    # "preScrollBackScrollDelta":I
    .restart local v8    # "preScrollBackScrollDelta":I
    .restart local v30    # "index":I
    move/from16 v39, v6

    move v1, v12

    move/from16 v2, v17

    move/from16 v12, v21

    .line 268
    .end local v6    # "currentMainAxisOffset":I
    .end local v17    # "currentFirstItemIndex":I
    .end local v21    # "scrollDelta":I
    .local v1, "currentFirstItemScrollOffset":I
    .local v2, "currentFirstItemIndex":I
    .local v12, "scrollDelta":I
    .local v39, "currentMainAxisOffset":I
    :goto_d
    nop

    .line 269
    move/from16 v4, p8

    .local v4, "$this$fastRoundToInt$iv":F
    const/4 v5, 0x0

    .line 694
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 269
    .end local v4    # "$this$fastRoundToInt$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    invoke-static {v4}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v4

    invoke-static {v12}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v5

    if-ne v4, v5, :cond_15

    .line 270
    move/from16 v4, p8

    .restart local v4    # "$this$fastRoundToInt$iv":F
    const/4 v5, 0x0

    .line 695
    .restart local v5    # "$i$f$fastRoundToInt":I
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 270
    .end local v4    # "$this$fastRoundToInt$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-lt v4, v5, :cond_15

    .line 272
    int-to-float v4, v12

    move v5, v4

    goto :goto_e

    .line 274
    :cond_15
    move/from16 v5, p8

    .line 268
    :goto_e
    nop

    .line 267
    nop

    .line 277
    .local v5, "consumedScroll":F
    sub-float v47, p8, v5

    .line 282
    .local v47, "unconsumedScroll":F
    const/4 v4, 0x0

    if-eqz p20, :cond_16

    if-le v12, v8, :cond_16

    cmpg-float v6, v47, v4

    if-gtz v6, :cond_16

    .line 283
    sub-int v4, v12, v8

    int-to-float v4, v4

    add-float v4, v4, v47

    move v6, v4

    goto :goto_f

    .line 284
    :cond_16
    move v6, v4

    .line 282
    :goto_f
    nop

    .line 281
    move/from16 v48, v6

    .line 287
    .local v48, "scrollBackAmount":F
    if-ltz v1, :cond_17

    move/from16 v4, v26

    goto :goto_10

    :cond_17
    move v4, v3

    .local v4, "value$iv":Z
    :goto_10
    const/4 v6, 0x0

    .line 696
    .local v6, "$i$f$requirePrecondition":I
    nop

    .line 697
    if-nez v4, :cond_18

    .line 698
    const/16 v16, 0x0

    .line 288
    .local v16, "$i$a$-requirePrecondition-LazyListMeasureKt$measureLazyList$4":I
    nop

    .line 698
    .end local v16    # "$i$a$-requirePrecondition-LazyListMeasureKt$measureLazyList$4":I
    const-string/jumbo v16, "negative currentFirstItemScrollOffset"

    invoke-static/range {v16 .. v16}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 700
    :cond_18
    nop

    .line 290
    .end local v4    # "value$iv":Z
    .end local v6    # "$i$f$requirePrecondition":I
    neg-int v4, v1

    .line 291
    .local v4, "visibleItemsScrollOffset":I
    invoke-virtual {v13}, Lkotlin/collections/ArrayDeque;->first()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 295
    .local v6, "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    if-gtz p3, :cond_1a

    if-gez p5, :cond_19

    goto :goto_11

    :cond_19
    move/from16 v22, v1

    move/from16 v41, v4

    move-object v1, v6

    goto :goto_15

    .line 296
    :cond_1a
    :goto_11
    const/16 v16, 0x0

    .local v16, "i":I
    move-object/from16 v17, v13

    check-cast v17, Ljava/util/Collection;

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->size()I

    move-result v3

    move/from16 v41, v4

    move/from16 v4, v16

    .end local v16    # "i":I
    .local v4, "i":I
    .local v41, "visibleItemsScrollOffset":I
    :goto_12
    if-ge v4, v3, :cond_1e

    .line 297
    invoke-virtual {v13, v4}, Lkotlin/collections/ArrayDeque;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move/from16 v17, v3

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v3

    .line 298
    .local v3, "size":I
    nop

    .line 299
    if-eqz v1, :cond_1c

    .line 300
    if-gt v3, v1, :cond_1b

    .line 301
    move-object/from16 v16, v13

    check-cast v16, Ljava/util/List;

    move/from16 v19, v1

    .end local v1    # "currentFirstItemScrollOffset":I
    .local v19, "currentFirstItemScrollOffset":I
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v1

    if-eq v4, v1, :cond_1d

    .line 303
    sub-int v1, v19, v3

    .line 304
    .end local v19    # "currentFirstItemScrollOffset":I
    .restart local v1    # "currentFirstItemScrollOffset":I
    move/from16 v16, v1

    .end local v1    # "currentFirstItemScrollOffset":I
    .local v16, "currentFirstItemScrollOffset":I
    add-int/lit8 v1, v4, 0x1

    invoke-virtual {v13, v1}, Lkotlin/collections/ArrayDeque;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 296
    .end local v3    # "size":I
    add-int/lit8 v4, v4, 0x1

    move/from16 v1, v16

    move/from16 v3, v17

    goto :goto_12

    .line 300
    .end local v16    # "currentFirstItemScrollOffset":I
    .restart local v1    # "currentFirstItemScrollOffset":I
    .restart local v3    # "size":I
    :cond_1b
    move/from16 v19, v1

    .end local v1    # "currentFirstItemScrollOffset":I
    .restart local v19    # "currentFirstItemScrollOffset":I
    goto :goto_13

    .line 299
    .end local v19    # "currentFirstItemScrollOffset":I
    .restart local v1    # "currentFirstItemScrollOffset":I
    :cond_1c
    move/from16 v19, v1

    .line 306
    .end local v1    # "currentFirstItemScrollOffset":I
    .restart local v19    # "currentFirstItemScrollOffset":I
    :cond_1d
    :goto_13
    goto :goto_14

    .line 296
    .end local v3    # "size":I
    .end local v19    # "currentFirstItemScrollOffset":I
    .restart local v1    # "currentFirstItemScrollOffset":I
    :cond_1e
    move/from16 v19, v1

    .line 314
    .end local v1    # "currentFirstItemScrollOffset":I
    .end local v4    # "i":I
    .restart local v19    # "currentFirstItemScrollOffset":I
    :goto_14
    move/from16 v22, v19

    move-object v1, v6

    .end local v6    # "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v19    # "currentFirstItemScrollOffset":I
    .local v1, "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .local v22, "currentFirstItemScrollOffset":I
    :goto_15
    nop

    .line 315
    nop

    .line 316
    nop

    .line 317
    nop

    .line 313
    move/from16 v3, p17

    move-object/from16 v4, p18

    invoke-static {v2, v0, v3, v4}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsBeforeList(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;

    move-result-object v35

    .line 312
    nop

    .line 321
    .local v35, "extraItemsBefore":Ljava/util/List;
    move-object/from16 v6, v35

    .local v6, "$this$fastForEach$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 701
    .local v16, "$i$f$fastForEach":I
    nop

    .line 702
    const/16 v17, 0x0

    .local v17, "index$iv":I
    move-object/from16 v19, v6

    check-cast v19, Ljava/util/Collection;

    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v0

    move/from16 v57, v17

    move-object/from16 v17, v1

    move/from16 v1, v57

    .local v1, "index$iv":I
    .local v17, "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    :goto_16
    if-ge v1, v0, :cond_1f

    .line 703
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 704
    .local v19, "item$iv":Ljava/lang/Object;
    move-object/from16 v20, v19

    check-cast v20, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .local v20, "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/16 v21, 0x0

    .line 321
    .local v21, "$i$a$-fastForEach-LazyListMeasureKt$measureLazyList$5":I
    move/from16 v23, v0

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v0

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 704
    .end local v20    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v21    # "$i$a$-fastForEach-LazyListMeasureKt$measureLazyList$5":I
    nop

    .line 702
    .end local v19    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v1, v1, 0x1

    move/from16 v0, v23

    goto :goto_16

    .line 706
    .end local v1    # "index$iv":I
    :cond_1f
    nop

    .line 326
    .end local v6    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastForEach":I
    move-object v0, v13

    check-cast v0, Ljava/util/List;

    .line 327
    nop

    .line 328
    nop

    .line 329
    nop

    .line 330
    nop

    .line 331
    nop

    .line 332
    nop

    .line 333
    nop

    .line 325
    move-object/from16 v1, p1

    move/from16 v6, p20

    move/from16 v49, v2

    move/from16 v40, v7

    move v2, v15

    move-object/from16 v15, v17

    const/16 v18, 0x0

    move-object/from16 v7, p21

    .end local v2    # "currentFirstItemIndex":I
    .end local v7    # "maxOffset":I
    .end local v17    # "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .local v15, "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .local v40, "maxOffset":I
    .local v49, "currentFirstItemIndex":I
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsAfterList(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;

    move-result-object v36

    .line 324
    move-object v0, v1

    move v1, v5

    .line 337
    .end local v5    # "consumedScroll":F
    .local v1, "consumedScroll":F
    .local v36, "extraItemsAfter":Ljava/util/List;
    move-object/from16 v2, v36

    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 707
    .local v3, "$i$f$fastForEach":I
    nop

    .line 708
    const/4 v4, 0x0

    .local v4, "index$iv":I
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move v6, v11

    .end local v11    # "maxCrossAxis":I
    .local v6, "maxCrossAxis":I
    :goto_17
    if-ge v4, v5, :cond_20

    .line 709
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 710
    .local v7, "item$iv":Ljava/lang/Object;
    move-object v11, v7

    check-cast v11, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .local v11, "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/16 v16, 0x0

    .line 337
    .local v16, "$i$a$-fastForEach-LazyListMeasureKt$measureLazyList$6":I
    move-object/from16 v17, v2

    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .local v17, "$this$fastForEach$iv":Ljava/util/List;
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v2

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 710
    .end local v11    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v16    # "$i$a$-fastForEach-LazyListMeasureKt$measureLazyList$6":I
    nop

    .line 708
    .end local v7    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v2, v17

    goto :goto_17

    .end local v17    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v2    # "$this$fastForEach$iv":Ljava/util/List;
    :cond_20
    move-object/from16 v17, v2

    .line 712
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "index$iv":I
    .restart local v17    # "$this$fastForEach$iv":Ljava/util/List;
    nop

    .line 340
    .end local v3    # "$i$f$fastForEach":I
    .end local v17    # "$this$fastForEach$iv":Ljava/util/List;
    invoke-virtual {v13}, Lkotlin/collections/ArrayDeque;->first()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    .line 341
    invoke-interface/range {v35 .. v35}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_21

    .line 342
    invoke-interface/range {v36 .. v36}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_21

    move/from16 v3, v26

    goto :goto_18

    :cond_21
    move/from16 v3, v18

    .line 339
    :goto_18
    move/from16 v50, v3

    .line 345
    .local v50, "noExtraItems":Z
    if-eqz p11, :cond_22

    move v2, v6

    goto :goto_19

    :cond_22
    move/from16 v2, v39

    :goto_19
    invoke-static {v9, v10, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v37

    .line 344
    nop

    .line 347
    .local v37, "layoutWidth":I
    if-eqz p11, :cond_23

    move/from16 v2, v39

    goto :goto_1a

    :cond_23
    move v2, v6

    :goto_1a
    invoke-static {v9, v10, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v38

    .line 346
    nop

    .line 351
    .local v38, "layoutHeight":I
    move-object/from16 v34, v13

    check-cast v34, Ljava/util/List;

    .line 352
    nop

    .line 353
    nop

    .line 354
    nop

    .line 355
    nop

    .line 356
    nop

    .line 357
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

    .line 350
    move/from16 v42, p11

    move-object/from16 v43, p12

    move-object/from16 v44, p13

    move/from16 v45, p14

    move-object/from16 v46, p15

    invoke-static/range {v34 .. v46}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;

    move-result-object v2

    .line 349
    nop

    .line 367
    .local v2, "positionedItems":Ljava/util/List;
    move/from16 v21, v12

    .end local v12    # "scrollDelta":I
    .local v21, "scrollDelta":I
    float-to-int v12, v1

    .line 368
    nop

    .line 369
    nop

    .line 371
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    move-result-object v16

    .line 378
    nop

    .line 379
    nop

    .line 366
    nop

    .line 367
    nop

    .line 368
    nop

    .line 369
    nop

    .line 370
    nop

    .line 371
    nop

    .line 372
    move-object/from16 v17, v0

    check-cast v17, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;

    .line 373
    nop

    .line 375
    nop

    .line 374
    nop

    .line 376
    nop

    .line 378
    nop

    .line 379
    nop

    .line 377
    nop

    .line 380
    nop

    .line 366
    const/16 v20, 0x1

    move/from16 v11, v37

    move-object/from16 v37, v13

    move v13, v11

    move/from16 v11, v38

    move/from16 v38, v14

    move v14, v11

    move-object/from16 v11, p16

    move/from16 v19, p20

    move-object/from16 v24, p22

    move-object/from16 v25, p24

    move-object/from16 v42, v15

    move/from16 v34, v18

    move/from16 v23, v39

    move/from16 v18, p11

    move-object v15, v2

    move/from16 v39, v21

    move/from16 v21, p19

    .end local v2    # "positionedItems":Ljava/util/List;
    .end local v21    # "scrollDelta":I
    .local v13, "layoutWidth":I
    .local v14, "layoutHeight":I
    .local v15, "positionedItems":Ljava/util/List;
    .local v23, "currentMainAxisOffset":I
    .local v37, "visibleItems":Lkotlin/collections/ArrayDeque;
    .local v38, "minOffset":I
    .local v39, "scrollDelta":I
    .local v42, "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    invoke-virtual/range {v11 .. v25}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)V

    .line 383
    move/from16 v11, v19

    move/from16 v12, v23

    .end local v23    # "currentMainAxisOffset":I
    .local v12, "currentMainAxisOffset":I
    if-nez v11, :cond_29

    .line 384
    invoke-virtual/range {p16 .. p16}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMinSizeToFitDisappearingItems-YbymL2g()J

    move-result-wide v2

    .line 385
    .local v2, "disappearingItemsSize":J
    sget-object v4, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v4

    if-nez v4, :cond_28

    .line 386
    if-eqz p11, :cond_24

    move v4, v14

    goto :goto_1b

    :cond_24
    move v4, v13

    .line 388
    .local v4, "oldMainAxisSize":I
    :goto_1b
    const/4 v5, 0x0

    .line 713
    .local v5, "$i$f$getWidth-impl":I
    move-wide/from16 v16, v2

    .local v16, "value$iv$iv":J
    const/4 v7, 0x0

    .line 714
    .local v7, "$i$f$unpackInt1":I
    move/from16 v18, v1

    move-wide/from16 v19, v2

    .end local v1    # "consumedScroll":F
    .end local v2    # "disappearingItemsSize":J
    .local v18, "consumedScroll":F
    .local v19, "disappearingItemsSize":J
    shr-long v1, v16, v33

    long-to-int v1, v1

    .line 713
    .end local v7    # "$i$f$unpackInt1":I
    .end local v16    # "value$iv$iv":J
    nop

    .line 388
    .end local v5    # "$i$f$getWidth-impl":I
    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v9, v10, v1}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v1

    .line 387
    nop

    .line 390
    .end local v13    # "layoutWidth":I
    .local v1, "layoutWidth":I
    const/4 v2, 0x0

    .line 715
    .local v2, "$i$f$getHeight-impl":I
    move-wide/from16 v16, v19

    .restart local v16    # "value$iv$iv":J
    const/4 v3, 0x0

    .line 716
    .local v3, "$i$f$unpackInt2":I
    move v5, v1

    move v7, v2

    .end local v1    # "layoutWidth":I
    .end local v2    # "$i$f$getHeight-impl":I
    .local v5, "layoutWidth":I
    .local v7, "$i$f$getHeight-impl":I
    and-long v1, v16, v31

    long-to-int v1, v1

    .line 715
    .end local v3    # "$i$f$unpackInt2":I
    .end local v16    # "value$iv$iv":J
    nop

    .line 390
    .end local v7    # "$i$f$getHeight-impl":I
    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v9, v10, v1}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v1

    .line 389
    nop

    .line 391
    .end local v14    # "layoutHeight":I
    .local v1, "layoutHeight":I
    if-eqz p11, :cond_25

    move v2, v1

    goto :goto_1c

    :cond_25
    move v2, v5

    .line 392
    .local v2, "newMainAxisSize":I
    :goto_1c
    if-eq v2, v4, :cond_27

    .line 393
    move-object v3, v15

    .local v3, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 717
    .local v7, "$i$f$fastForEach":I
    nop

    .line 718
    const/4 v13, 0x0

    .local v13, "index$iv":I
    move-object v14, v3

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->size()I

    move-result v14

    :goto_1d
    if-ge v13, v14, :cond_26

    .line 719
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 720
    .local v16, "item$iv":Ljava/lang/Object;
    move/from16 v17, v1

    .end local v1    # "layoutHeight":I
    .local v17, "layoutHeight":I
    move-object/from16 v1, v16

    check-cast v1, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .local v1, "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/16 v21, 0x0

    .line 393
    .local v21, "$i$a$-fastForEach-LazyListMeasureKt$measureLazyList$7":I
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->updateMainAxisLayoutSize(I)V

    .line 720
    .end local v1    # "it":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v21    # "$i$a$-fastForEach-LazyListMeasureKt$measureLazyList$7":I
    nop

    .line 718
    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v13, v13, 0x1

    move/from16 v1, v17

    goto :goto_1d

    .end local v17    # "layoutHeight":I
    .local v1, "layoutHeight":I
    :cond_26
    move/from16 v17, v1

    .line 722
    .end local v1    # "layoutHeight":I
    .end local v13    # "index$iv":I
    .restart local v17    # "layoutHeight":I
    goto :goto_1e

    .line 392
    .end local v3    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    .end local v17    # "layoutHeight":I
    .restart local v1    # "layoutHeight":I
    :cond_27
    move/from16 v17, v1

    .line 400
    .end local v1    # "layoutHeight":I
    .end local v2    # "newMainAxisSize":I
    .end local v4    # "oldMainAxisSize":I
    .end local v19    # "disappearingItemsSize":J
    .restart local v17    # "layoutHeight":I
    :goto_1e
    move v1, v6

    move/from16 v6, v17

    goto :goto_20

    .line 385
    .end local v5    # "layoutWidth":I
    .end local v17    # "layoutHeight":I
    .end local v18    # "consumedScroll":F
    .local v1, "consumedScroll":F
    .local v2, "disappearingItemsSize":J
    .local v13, "layoutWidth":I
    .restart local v14    # "layoutHeight":I
    :cond_28
    move/from16 v18, v1

    move-wide/from16 v19, v2

    .end local v1    # "consumedScroll":F
    .end local v2    # "disappearingItemsSize":J
    .restart local v18    # "consumedScroll":F
    .restart local v19    # "disappearingItemsSize":J
    goto :goto_1f

    .line 383
    .end local v18    # "consumedScroll":F
    .end local v19    # "disappearingItemsSize":J
    .restart local v1    # "consumedScroll":F
    :cond_29
    move/from16 v18, v1

    .line 400
    .end local v1    # "consumedScroll":F
    .restart local v18    # "consumedScroll":F
    :goto_1f
    move v1, v6

    move v5, v13

    move v6, v14

    .line 401
    .end local v13    # "layoutWidth":I
    .end local v14    # "layoutHeight":I
    .local v1, "maxCrossAxis":I
    .restart local v5    # "layoutWidth":I
    .local v6, "layoutHeight":I
    :goto_20
    nop

    .line 402
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getHeaderIndexes()Landroidx/collection/IntList;

    move-result-object v2

    .line 403
    nop

    .line 404
    nop

    .line 405
    nop

    .line 406
    nop

    .line 400
    new-instance v3, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$stickingItems$1;

    invoke-direct {v3, v0}, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$stickingItems$1;-><init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;)V

    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v0, p25

    move-object/from16 v13, p26

    move/from16 v21, v1

    move-object v1, v15

    move/from16 v14, v40

    move/from16 v15, p0

    .end local v15    # "positionedItems":Ljava/util/List;
    .end local v40    # "maxOffset":I
    .local v1, "positionedItems":Ljava/util/List;
    .local v14, "maxOffset":I
    .local v21, "maxCrossAxis":I
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt;->applyStickyItems(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Ljava/util/List;Landroidx/collection/IntList;IIIILkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v2

    .line 399
    move v0, v3

    move/from16 v23, v5

    move/from16 v24, v6

    .line 412
    .end local v5    # "layoutWidth":I
    .end local v6    # "layoutHeight":I
    .local v2, "stickingItems":Ljava/util/List;
    .local v23, "layoutWidth":I
    .local v24, "layoutHeight":I
    const/4 v3, 0x0

    if-eqz v50, :cond_2b

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-eqz v4, :cond_2a

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_21

    :cond_2a
    move-object v4, v3

    goto :goto_21

    .line 413
    :cond_2b
    invoke-virtual/range {v37 .. v37}, Lkotlin/collections/ArrayDeque;->firstOrNull()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-eqz v4, :cond_2c

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_21

    :cond_2c
    move-object v4, v3

    .line 412
    :goto_21
    nop

    .line 411
    move-object/from16 v25, v4

    .line 415
    .local v25, "firstVisibleIndex":Ljava/lang/Integer;
    if-eqz v50, :cond_2d

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-eqz v4, :cond_2e

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_22

    .line 416
    :cond_2d
    invoke-virtual/range {v37 .. v37}, Lkotlin/collections/ArrayDeque;->lastOrNull()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-eqz v4, :cond_2e

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 415
    :cond_2e
    :goto_22
    nop

    .line 414
    move-object/from16 v31, v3

    .line 419
    .local v31, "lastVisibleIndex":Ljava/lang/Integer;
    nop

    .line 420
    nop

    .line 421
    move/from16 v3, v30

    .end local v30    # "index":I
    .local v3, "index":I
    if-lt v3, v15, :cond_30

    if-le v12, v14, :cond_2f

    goto :goto_23

    :cond_2f
    move/from16 v26, v34

    .line 424
    :cond_30
    :goto_23
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v6, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$8;

    move-object/from16 v7, p23

    invoke-direct {v6, v7, v1, v2, v11}, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$8;-><init>(Landroidx/compose/runtime/MutableState;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v13, v4, v5, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroidx/compose/ui/layout/MeasureResult;

    .line 443
    if-eqz v25, :cond_31

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_24

    :cond_31
    move/from16 v4, v34

    .line 444
    :goto_24
    if-eqz v31, :cond_32

    invoke-virtual/range {v31 .. v31}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_25

    :cond_32
    move/from16 v6, v34

    .line 445
    :goto_25
    nop

    .line 446
    nop

    .line 442
    invoke-static {v4, v6, v1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt;->updatedVisibleItems(IILjava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 448
    neg-int v13, v0

    .line 449
    move/from16 v40, v14

    .end local v14    # "maxOffset":I
    .restart local v40    # "maxOffset":I
    add-int v14, v40, p4

    .line 452
    if-eqz p11, :cond_33

    sget-object v6, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_26

    :cond_33
    sget-object v6, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_26
    move-object/from16 v17, v6

    .line 455
    nop

    .line 458
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getChildConstraints-msEJaDk()J

    move-result-wide v10

    .line 418
    new-instance v0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    .line 419
    nop

    .line 420
    nop

    .line 421
    nop

    .line 422
    nop

    .line 424
    nop

    .line 440
    nop

    .line 455
    nop

    .line 456
    nop

    .line 457
    nop

    .line 458
    nop

    .line 442
    nop

    .line 448
    nop

    .line 449
    nop

    .line 450
    nop

    .line 451
    nop

    .line 452
    nop

    .line 453
    nop

    .line 454
    nop

    .line 418
    const/16 v20, 0x0

    move/from16 v19, p5

    move/from16 v16, p14

    move-object/from16 v9, p15

    move-object/from16 v32, v2

    move/from16 v30, v3

    move/from16 v2, v22

    move/from16 v3, v26

    move/from16 v7, v27

    move/from16 v6, v48

    move-object/from16 v27, v1

    move/from16 v22, v8

    move/from16 v26, v12

    move-object/from16 v1, v42

    move-object/from16 v8, p22

    move-object v12, v4

    move/from16 v4, v18

    move/from16 v18, p4

    .end local v3    # "index":I
    .end local v8    # "preScrollBackScrollDelta":I
    .end local v12    # "currentMainAxisOffset":I
    .end local v18    # "consumedScroll":F
    .end local v42    # "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v48    # "scrollBackAmount":F
    .local v1, "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .local v2, "currentFirstItemScrollOffset":I
    .local v4, "consumedScroll":F
    .local v6, "scrollBackAmount":F
    .local v7, "remeasureNeeded":Z
    .local v22, "preScrollBackScrollDelta":I
    .local v26, "currentMainAxisOffset":I
    .local v27, "positionedItems":Ljava/util/List;
    .restart local v30    # "index":I
    .local v32, "stickingItems":Ljava/util/List;
    invoke-direct/range {v0 .. v20}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v18, v4

    .end local v1    # "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v4    # "consumedScroll":F
    .restart local v18    # "consumedScroll":F
    .restart local v42    # "firstItem":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    return-object v0
.end method
