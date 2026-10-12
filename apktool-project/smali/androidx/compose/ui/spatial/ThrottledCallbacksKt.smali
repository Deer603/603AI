.class public final Landroidx/compose/ui/spatial/ThrottledCallbacksKt;
.super Ljava/lang/Object;
.source "ThrottledCallbacks.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,494:1\n83#2:495\n159#3:496\n32#3:505\n30#4:497\n53#5,3:498\n85#5:502\n90#5:504\n80#5:506\n54#6:501\n59#6:503\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n*L\n460#1:495\n470#1:496\n478#1:505\n470#1:497\n470#1:498,3\n478#1:502\n478#1:504\n478#1:506\n478#1:501\n478#1:503\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000e"
    }
    d2 = {
        "rectInfoFor",
        "Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
        "node",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "topLeft",
        "",
        "bottomRight",
        "windowOffset",
        "Landroidx/compose/ui/unit/IntOffset;",
        "screenOffset",
        "viewToWindowMatrix",
        "Landroidx/compose/ui/graphics/Matrix;",
        "rectInfoFor-Q-MZNJw",
        "(Landroidx/compose/ui/node/DelegatableNode;JJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
        "ui_release"
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
.method public static final rectInfoFor-Q-MZNJw(Landroidx/compose/ui/node/DelegatableNode;JJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;
    .locals 24
    .param p0, "node"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p1, "topLeft"    # J
    .param p3, "bottomRight"    # J
    .param p5, "windowOffset"    # J
    .param p7, "screenOffset"    # J
    .param p9, "viewToWindowMatrix"    # [F

    .line 460
    const/4 v0, 0x0

    .line 495
    .local v0, "$i$f$getLayout-OLwlOKw":I
    const/4 v1, 0x2

    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v0

    .line 460
    .end local v0    # "$i$f$getLayout-OLwlOKw":I
    move-object/from16 v11, p0

    invoke-static {v11, v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireCoordinator-64DMado(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    .line 461
    .local v0, "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    invoke-static {v11}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v13

    .line 462
    .local v13, "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->isPlaced()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    return-object v1

    .line 468
    :cond_0
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    if-eq v1, v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move v14, v1

    .line 469
    .local v14, "needsTransform":Z
    if-eqz v14, :cond_2

    .line 470
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v1

    .local v1, "$this$toOffset_u2d_u2dgyyYBs$iv":J
    const/4 v3, 0x0

    .line 496
    .local v3, "$i$f$toOffset--gyyYBs":I
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v4

    int-to-float v4, v4

    .local v4, "x$iv$iv":F
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v5

    int-to-float v5, v5

    .local v5, "y$iv$iv":F
    const/4 v6, 0x0

    .line 497
    .local v6, "$i$f$Offset":I
    const/4 v7, 0x0

    .line 498
    .local v7, "$i$f$packFloats":I
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    .line 499
    .local v8, "v1$iv$iv$iv":J
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    move-object v15, v0

    move-wide/from16 v16, v1

    .end local v0    # "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    .end local v1    # "$this$toOffset_u2d_u2dgyyYBs$iv":J
    .local v15, "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    .local v16, "$this$toOffset_u2d_u2dgyyYBs$iv":J
    int-to-long v0, v10

    .line 500
    .local v0, "v2$iv$iv$iv":J
    const/16 v2, 0x20

    shl-long v18, v8, v2

    const-wide v20, 0xffffffffL

    and-long v22, v0, v20

    or-long v0, v18, v22

    .line 497
    .end local v0    # "v2$iv$iv$iv":J
    .end local v7    # "$i$f$packFloats":I
    .end local v8    # "v1$iv$iv$iv":J
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v0

    .line 496
    .end local v4    # "x$iv$iv":F
    .end local v5    # "y$iv$iv":F
    .end local v6    # "$i$f$Offset":I
    nop

    .line 470
    .end local v3    # "$i$f$toOffset--gyyYBs":I
    .end local v16    # "$this$toOffset_u2d_u2dgyyYBs$iv":J
    nop

    .line 471
    .local v0, "topLeftOffset":J
    invoke-virtual {v15}, Landroidx/compose/ui/node/NodeCoordinator;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v3

    invoke-interface {v3}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v16

    .line 473
    .local v16, "size":J
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v3

    .line 474
    move-object v4, v15

    check-cast v4, Landroidx/compose/ui/layout/LayoutCoordinates;

    invoke-interface {v3, v4, v0, v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v3

    .line 475
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v3

    .line 472
    nop

    .line 476
    .local v3, "transformedPos":J
    move-wide v5, v0

    .end local v0    # "topLeftOffset":J
    .local v5, "topLeftOffset":J
    new-instance v1, Landroidx/compose/ui/spatial/RelativeLayoutBounds;

    .line 477
    nop

    .line 478
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v0

    const/4 v7, 0x0

    .line 501
    .local v7, "$i$f$getWidth-impl":I
    move-wide/from16 v8, v16

    .local v8, "value$iv$iv":J
    const/4 v10, 0x0

    .line 502
    .local v10, "$i$f$unpackInt1":I
    move v12, v2

    move-wide/from16 v18, v3

    .end local v3    # "transformedPos":J
    .local v18, "transformedPos":J
    shr-long v2, v8, v12

    long-to-int v2, v2

    .line 501
    .end local v8    # "value$iv$iv":J
    .end local v10    # "$i$f$unpackInt1":I
    nop

    .line 478
    .end local v7    # "$i$f$getWidth-impl":I
    add-int/2addr v0, v2

    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v2

    const/4 v3, 0x0

    .line 503
    .local v3, "$i$f$getHeight-impl":I
    move-wide/from16 v7, v16

    .local v7, "value$iv$iv":J
    const/4 v4, 0x0

    .line 504
    .local v4, "$i$f$unpackInt2":I
    and-long v9, v7, v20

    long-to-int v4, v9

    .line 503
    .end local v4    # "$i$f$unpackInt2":I
    .end local v7    # "value$iv$iv":J
    nop

    .line 478
    .end local v3    # "$i$f$getHeight-impl":I
    add-int/2addr v2, v4

    .local v0, "x$iv":I
    .local v2, "y$iv":I
    const/4 v3, 0x0

    .line 505
    .local v3, "$i$f$IntOffset":I
    const/4 v4, 0x0

    .line 506
    .local v4, "$i$f$packInts":I
    int-to-long v7, v0

    shl-long/2addr v7, v12

    int-to-long v9, v2

    and-long v9, v9, v20

    or-long/2addr v7, v9

    .line 505
    .end local v4    # "$i$f$packInts":I
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v2

    .line 479
    .end local v0    # "x$iv":I
    .end local v2    # "y$iv":I
    .end local v3    # "$i$f$IntOffset":I
    nop

    .line 480
    nop

    .line 481
    nop

    .line 482
    nop

    .line 476
    const/4 v12, 0x0

    move-wide v7, v5

    move-wide v4, v2

    move-wide/from16 v2, v18

    move-wide/from16 v18, v7

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    .end local v5    # "topLeftOffset":J
    .local v2, "transformedPos":J
    .local v18, "topLeftOffset":J
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/spatial/RelativeLayoutBounds;-><init>(JJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v2    # "transformedPos":J
    .end local v16    # "size":J
    .end local v18    # "topLeftOffset":J
    goto :goto_1

    .line 485
    .end local v15    # "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    .local v0, "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    :cond_2
    move-object v15, v0

    .end local v0    # "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    .restart local v15    # "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    new-instance v1, Landroidx/compose/ui/spatial/RelativeLayoutBounds;

    .line 486
    nop

    .line 487
    nop

    .line 488
    nop

    .line 489
    nop

    .line 490
    nop

    .line 491
    nop

    .line 485
    const/4 v12, 0x0

    move-object/from16 v11, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/spatial/RelativeLayoutBounds;-><init>(JJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 469
    :goto_1
    return-object v1
.end method
