.class final Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Carousel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,693:1\n2310#2,14:694\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1\n*L\n520#1:694,14\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
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
.field final synthetic $carouselItemInfo:Landroidx/compose/material3/carousel/CarouselItemInfoImpl;

.field final synthetic $clipShape:Landroidx/compose/ui/graphics/Shape;

.field final synthetic $index:I

.field final synthetic $isRtl:Z

.field final synthetic $isVertical:Z

.field final synthetic $state:Landroidx/compose/material3/carousel/CarouselState;

.field final synthetic $strategyResult:Landroidx/compose/material3/carousel/Strategy;


# direct methods
.method constructor <init>(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/material3/carousel/Strategy;IZLandroidx/compose/material3/carousel/CarouselItemInfoImpl;Landroidx/compose/ui/graphics/Shape;Z)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$state:Landroidx/compose/material3/carousel/CarouselState;

    iput-object p2, p0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    iput p3, p0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$index:I

    iput-boolean p4, p0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$isVertical:Z

    iput-object p5, p0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$carouselItemInfo:Landroidx/compose/material3/carousel/CarouselItemInfoImpl;

    iput-object p6, p0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$clipShape:Landroidx/compose/ui/graphics/Shape;

    iput-boolean p7, p0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$isRtl:Z

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 470
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/graphics/GraphicsLayerScope;

    invoke-virtual {p0, v0}, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->invoke(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V
    .locals 29
    .param p1, "$this$placeWithLayer"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 474
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$state:Landroidx/compose/material3/carousel/CarouselState;

    iget-object v3, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    invoke-static {v2, v3}, Landroidx/compose/material3/carousel/CarouselKt;->calculateCurrentScrollOffset(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/material3/carousel/Strategy;)F

    move-result v5

    .line 475
    .local v5, "scrollOffset":F
    iget-object v2, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$state:Landroidx/compose/material3/carousel/CarouselState;

    iget-object v3, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    invoke-static {v2, v3}, Landroidx/compose/material3/carousel/CarouselKt;->calculateMaxScrollOffset(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/material3/carousel/Strategy;)F

    move-result v6

    .line 478
    .local v6, "maxScrollOffset":F
    iget-object v4, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/material3/carousel/Strategy;->getKeylineListForScrollOffset$material3_release$default(Landroidx/compose/material3/carousel/Strategy;FFZILjava/lang/Object;)Landroidx/compose/material3/carousel/KeylineList;

    move-result-object v2

    .line 477
    nop

    .line 480
    .local v2, "keylines":Landroidx/compose/material3/carousel/KeylineList;
    iget-object v3, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    .line 481
    nop

    .line 482
    nop

    .line 483
    nop

    .line 480
    const/4 v4, 0x1

    invoke-virtual {v3, v5, v6, v4}, Landroidx/compose/material3/carousel/Strategy;->getKeylineListForScrollOffset$material3_release(FFZ)Landroidx/compose/material3/carousel/KeylineList;

    move-result-object v3

    .line 479
    nop

    .line 488
    .local v3, "roundedKeylines":Landroidx/compose/material3/carousel/KeylineList;
    iget-object v7, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    invoke-virtual {v7}, Landroidx/compose/material3/carousel/Strategy;->getItemMainAxisSize()F

    move-result v7

    iget-object v8, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    invoke-virtual {v8}, Landroidx/compose/material3/carousel/Strategy;->getItemSpacing()F

    move-result v8

    add-float/2addr v7, v8

    .line 487
    nop

    .line 490
    .local v7, "itemSizeWithSpacing":F
    iget v8, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$index:I

    int-to-float v8, v8

    mul-float/2addr v8, v7

    iget-object v9, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    invoke-virtual {v9}, Landroidx/compose/material3/carousel/Strategy;->getItemMainAxisSize()F

    move-result v9

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v9, v10

    add-float/2addr v8, v9

    .line 491
    nop

    .line 490
    sub-float/2addr v8, v5

    .line 489
    nop

    .line 496
    .local v8, "unadjustedCenter":F
    invoke-virtual {v2, v8}, Landroidx/compose/material3/carousel/KeylineList;->getKeylineBefore(F)Landroidx/compose/material3/carousel/Keyline;

    move-result-object v9

    .line 497
    .local v9, "keylineBefore":Landroidx/compose/material3/carousel/Keyline;
    invoke-virtual {v2, v8}, Landroidx/compose/material3/carousel/KeylineList;->getKeylineAfter(F)Landroidx/compose/material3/carousel/Keyline;

    move-result-object v11

    .line 498
    .local v11, "keylineAfter":Landroidx/compose/material3/carousel/Keyline;
    invoke-static {v9, v11, v8}, Landroidx/compose/material3/carousel/CarouselKt;->access$getProgress(Landroidx/compose/material3/carousel/Keyline;Landroidx/compose/material3/carousel/Keyline;F)F

    move-result v12

    .line 499
    .local v12, "progress":F
    invoke-static {v9, v11, v12}, Landroidx/compose/material3/carousel/KeylineListKt;->lerp(Landroidx/compose/material3/carousel/Keyline;Landroidx/compose/material3/carousel/Keyline;F)Landroidx/compose/material3/carousel/Keyline;

    move-result-object v13

    .line 500
    .local v13, "interpolatedKeyline":Landroidx/compose/material3/carousel/Keyline;
    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    .line 503
    .local v14, "isOutOfKeylineBounds":Z
    iget-boolean v15, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$isVertical:Z

    if-eqz v15, :cond_0

    invoke-interface {v1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v15

    goto :goto_0

    :cond_0
    iget-object v15, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    invoke-virtual {v15}, Landroidx/compose/material3/carousel/Strategy;->getItemMainAxisSize()F

    move-result v15

    :goto_0
    div-float/2addr v15, v10

    .line 502
    nop

    .line 505
    .local v15, "centerX":F
    move/from16 v16, v4

    iget-boolean v4, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$isVertical:Z

    if-eqz v4, :cond_1

    iget-object v4, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$strategyResult:Landroidx/compose/material3/carousel/Strategy;

    invoke-virtual {v4}, Landroidx/compose/material3/carousel/Strategy;->getItemMainAxisSize()F

    move-result v4

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v4

    :goto_1
    div-float/2addr v4, v10

    .line 504
    nop

    .line 507
    .local v4, "centerY":F
    move/from16 v17, v10

    iget-boolean v10, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$isVertical:Z

    if-eqz v10, :cond_2

    invoke-interface {v1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v10

    goto :goto_2

    :cond_2
    invoke-virtual {v13}, Landroidx/compose/material3/carousel/Keyline;->getSize()F

    move-result v10

    :goto_2
    div-float v10, v10, v17

    .line 506
    nop

    .line 509
    .local v10, "halfMaskWidth":F
    move-object/from16 v18, v2

    .end local v2    # "keylines":Landroidx/compose/material3/carousel/KeylineList;
    .local v18, "keylines":Landroidx/compose/material3/carousel/KeylineList;
    iget-boolean v2, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$isVertical:Z

    if-eqz v2, :cond_3

    invoke-virtual {v13}, Landroidx/compose/material3/carousel/Keyline;->getSize()F

    move-result v2

    goto :goto_3

    :cond_3
    invoke-interface {v1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v2

    :goto_3
    div-float v2, v2, v17

    .line 508
    nop

    .line 511
    .local v2, "halfMaskHeight":F
    move/from16 v17, v2

    .end local v2    # "halfMaskHeight":F
    .local v17, "halfMaskHeight":F
    new-instance v2, Landroidx/compose/ui/geometry/Rect;

    .line 512
    move-object/from16 v19, v3

    .end local v3    # "roundedKeylines":Landroidx/compose/material3/carousel/KeylineList;
    .local v19, "roundedKeylines":Landroidx/compose/material3/carousel/KeylineList;
    sub-float v3, v15, v10

    .line 513
    move/from16 v20, v4

    .end local v4    # "centerY":F
    .local v20, "centerY":F
    sub-float v4, v20, v17

    .line 514
    move/from16 v21, v5

    .end local v5    # "scrollOffset":F
    .local v21, "scrollOffset":F
    add-float v5, v15, v10

    .line 515
    move/from16 v22, v6

    .end local v6    # "maxScrollOffset":F
    .local v22, "maxScrollOffset":F
    add-float v6, v20, v17

    .line 511
    invoke-direct {v2, v3, v4, v5, v6}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 510
    nop

    .line 519
    .local v2, "maskRect":Landroidx/compose/ui/geometry/Rect;
    iget-object v3, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$carouselItemInfo:Landroidx/compose/material3/carousel/CarouselItemInfoImpl;

    invoke-virtual {v13}, Landroidx/compose/material3/carousel/Keyline;->getSize()F

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/compose/material3/carousel/CarouselItemInfoImpl;->setSizeState(F)V

    .line 520
    iget-object v3, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$carouselItemInfo:Landroidx/compose/material3/carousel/CarouselItemInfoImpl;

    move-object/from16 v4, v19

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$minBy$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 694
    .local v5, "$i$f$minByOrThrow":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 695
    .local v6, "iterator$iv":Ljava/util/Iterator;
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_a

    .line 696
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    .line 697
    .local v23, "minElem$iv":Ljava/lang/Object;
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-nez v24, :cond_4

    goto :goto_5

    .line 698
    :cond_4
    move-object/from16 v24, v23

    check-cast v24, Landroidx/compose/material3/carousel/Keyline;

    .local v24, "it":Landroidx/compose/material3/carousel/Keyline;
    const/16 v25, 0x0

    .line 520
    .local v25, "$i$a$-minByOrThrow-CarouselKt$carouselItem$1$2$1$1":I
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/material3/carousel/Keyline;->getSize()F

    move-result v24

    .line 698
    .end local v24    # "it":Landroidx/compose/material3/carousel/Keyline;
    .end local v25    # "$i$a$-minByOrThrow-CarouselKt$carouselItem$1$2$1$1":I
    move/from16 v28, v24

    move-object/from16 v24, v4

    move/from16 v4, v28

    .line 700
    .local v4, "minValue$iv":F
    .local v24, "$this$minBy$iv":Ljava/lang/Iterable;
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    .line 701
    .local v25, "e$iv":Ljava/lang/Object;
    move-object/from16 v26, v25

    check-cast v26, Landroidx/compose/material3/carousel/Keyline;

    .local v26, "it":Landroidx/compose/material3/carousel/Keyline;
    const/16 v27, 0x0

    .line 520
    .local v27, "$i$a$-minByOrThrow-CarouselKt$carouselItem$1$2$1$1":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/material3/carousel/Keyline;->getSize()F

    move-result v26

    .line 701
    .end local v26    # "it":Landroidx/compose/material3/carousel/Keyline;
    .end local v27    # "$i$a$-minByOrThrow-CarouselKt$carouselItem$1$2$1$1":I
    move/from16 v27, v26

    .line 702
    .local v27, "v$iv":F
    move/from16 v26, v5

    move/from16 v5, v27

    .end local v27    # "v$iv":F
    .local v5, "v$iv":F
    .local v26, "$i$f$minByOrThrow":I
    invoke-static {v4, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v27

    if-lez v27, :cond_5

    .line 703
    move-object/from16 v23, v25

    .line 704
    move v4, v5

    .line 706
    .end local v5    # "v$iv":F
    .end local v25    # "e$iv":Ljava/lang/Object;
    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_9

    .line 707
    nop

    .end local v4    # "minValue$iv":F
    .end local v6    # "iterator$iv":Ljava/util/Iterator;
    .end local v23    # "minElem$iv":Ljava/lang/Object;
    .end local v24    # "$this$minBy$iv":Ljava/lang/Iterable;
    .end local v26    # "$i$f$minByOrThrow":I
    :goto_5
    check-cast v23, Landroidx/compose/material3/carousel/Keyline;

    .line 520
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/material3/carousel/Keyline;->getSize()F

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/compose/material3/carousel/CarouselItemInfoImpl;->setMinSizeState(F)V

    .line 521
    iget-object v3, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$carouselItemInfo:Landroidx/compose/material3/carousel/CarouselItemInfoImpl;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/material3/carousel/KeylineList;->getFirstFocal()Landroidx/compose/material3/carousel/Keyline;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material3/carousel/Keyline;->getSize()F

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/compose/material3/carousel/CarouselItemInfoImpl;->setMaxSizeState(F)V

    .line 522
    iget-object v3, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$carouselItemInfo:Landroidx/compose/material3/carousel/CarouselItemInfoImpl;

    invoke-virtual {v3, v2}, Landroidx/compose/material3/carousel/CarouselItemInfoImpl;->setMaskRectState(Landroidx/compose/ui/geometry/Rect;)V

    .line 525
    new-instance v3, Landroidx/compose/ui/geometry/Rect;

    invoke-interface {v1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v4

    invoke-interface {v1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v5

    const/4 v6, 0x0

    invoke-direct {v3, v6, v6, v4, v5}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-interface {v1, v3}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->setClip(Z)V

    .line 526
    iget-object v3, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$clipShape:Landroidx/compose/ui/graphics/Shape;

    invoke-interface {v1, v3}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->setShape(Landroidx/compose/ui/graphics/Shape;)V

    .line 530
    invoke-virtual {v13}, Landroidx/compose/material3/carousel/Keyline;->getOffset()F

    move-result v3

    sub-float/2addr v3, v8

    .line 531
    .local v3, "translation":F
    if-eqz v14, :cond_6

    .line 535
    invoke-virtual {v13}, Landroidx/compose/material3/carousel/Keyline;->getUnadjustedOffset()F

    move-result v4

    sub-float v4, v8, v4

    .line 536
    invoke-virtual {v13}, Landroidx/compose/material3/carousel/Keyline;->getSize()F

    move-result v5

    .line 535
    div-float/2addr v4, v5

    .line 534
    nop

    .line 537
    .local v4, "outOfBoundsOffset":F
    add-float/2addr v3, v4

    .line 539
    .end local v4    # "outOfBoundsOffset":F
    :cond_6
    iget-boolean v4, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$isVertical:Z

    if-eqz v4, :cond_7

    .line 540
    invoke-interface {v1, v3}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->setTranslationY(F)V

    goto :goto_7

    .line 542
    :cond_7
    iget-boolean v4, v0, Landroidx/compose/material3/carousel/CarouselKt$carouselItem$1$2$1;->$isRtl:Z

    if-eqz v4, :cond_8

    neg-float v4, v3

    goto :goto_6

    :cond_8
    move v4, v3

    :goto_6
    invoke-interface {v1, v4}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->setTranslationX(F)V

    .line 544
    :goto_7
    return-void

    .line 706
    .end local v3    # "translation":F
    .local v4, "minValue$iv":F
    .restart local v6    # "iterator$iv":Ljava/util/Iterator;
    .restart local v23    # "minElem$iv":Ljava/lang/Object;
    .restart local v24    # "$this$minBy$iv":Ljava/lang/Iterable;
    .restart local v26    # "$i$f$minByOrThrow":I
    :cond_9
    move/from16 v5, v26

    goto/16 :goto_4

    .line 695
    .end local v23    # "minElem$iv":Ljava/lang/Object;
    .end local v24    # "$this$minBy$iv":Ljava/lang/Iterable;
    .end local v26    # "$i$f$minByOrThrow":I
    .local v4, "$this$minBy$iv":Ljava/lang/Iterable;
    .local v5, "$i$f$minByOrThrow":I
    :cond_a
    new-instance v3, Ljava/util/NoSuchElementException;

    invoke-direct {v3}, Ljava/util/NoSuchElementException;-><init>()V

    throw v3
.end method
