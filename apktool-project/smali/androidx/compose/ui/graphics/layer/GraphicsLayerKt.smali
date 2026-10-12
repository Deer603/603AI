.class public final Landroidx/compose/ui/graphics/layer/GraphicsLayerKt;
.super Ljava/lang/Object;
.source "GraphicsLayer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGraphicsLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,411:1\n233#2:412\n30#3:413\n30#3:427\n53#4,3:414\n53#4,3:424\n53#4,3:428\n53#4,3:432\n60#4:436\n56#5,6:417\n33#6:423\n33#6:431\n48#7:435\n22#8:437\n*S KotlinDebug\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n*L\n51#1:412\n389#1:413\n403#1:427\n389#1:414,3\n390#1:424,3\n403#1:428,3\n404#1:432,3\n405#1:436\n390#1:417,6\n390#1:423\n404#1:431\n405#1:435\n405#1:437\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "DefaultCameraDistance",
        "",
        "drawLayer",
        "",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "graphicsLayer",
        "Landroidx/compose/ui/graphics/layer/GraphicsLayer;",
        "setOutline",
        "outline",
        "Landroidx/compose/ui/graphics/Outline;",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final DefaultCameraDistance:F = 8.0f


# direct methods
.method public static final drawLayer(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 5
    .param p0, "$this$drawLayer"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .param p1, "graphicsLayer"    # Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 51
    move-object v0, p0

    .local v0, "$this$drawIntoCanvas$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/4 v1, 0x0

    .line 412
    .local v1, "$i$f$drawIntoCanvas":I
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v2

    .local v2, "canvas":Landroidx/compose/ui/graphics/Canvas;
    const/4 v3, 0x0

    .line 51
    .local v3, "$i$a$-drawIntoCanvas-GraphicsLayerKt$drawLayer$1":I
    invoke-interface {p0}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v4

    invoke-interface {v4}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getGraphicsLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    move-result-object v4

    invoke-virtual {p1, v2, v4}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->draw$ui_graphics_release(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 412
    .end local v2    # "canvas":Landroidx/compose/ui/graphics/Canvas;
    .end local v3    # "$i$a$-drawIntoCanvas-GraphicsLayerKt$drawLayer$1":I
    nop

    .line 52
    .end local v0    # "$this$drawIntoCanvas$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v1    # "$i$f$drawIntoCanvas":I
    return-void
.end method

.method public static final setOutline(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/Outline;)V
    .locals 18
    .param p0, "$this$setOutline"    # Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .param p1, "outline"    # Landroidx/compose/ui/graphics/Outline;

    .line 386
    move-object/from16 v0, p0

    move-object/from16 v6, p1

    .line 387
    instance-of v1, v6, Landroidx/compose/ui/graphics/Outline$Rectangle;

    const-wide v2, 0xffffffffL

    const/16 v4, 0x20

    if-eqz v1, :cond_0

    .line 388
    nop

    .line 389
    move-object v1, v6

    check-cast v1, Landroidx/compose/ui/graphics/Outline$Rectangle;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Outline$Rectangle;->getRect()Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v1

    .local v1, "x$iv":F
    move-object v5, v6

    check-cast v5, Landroidx/compose/ui/graphics/Outline$Rectangle;

    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Outline$Rectangle;->getRect()Landroidx/compose/ui/geometry/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v5

    .local v5, "y$iv":F
    const/4 v7, 0x0

    .line 413
    .local v7, "$i$f$Offset":I
    const/4 v8, 0x0

    .line 414
    .local v8, "$i$f$packFloats":I
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    .line 415
    .local v9, "v1$iv$iv":J
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v11, v11

    .line 416
    .local v11, "v2$iv$iv":J
    shl-long v13, v9, v4

    and-long v15, v11, v2

    or-long v8, v13, v15

    .line 413
    .end local v8    # "$i$f$packFloats":I
    .end local v9    # "v1$iv$iv":J
    .end local v11    # "v2$iv$iv":J
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v7

    .line 390
    .end local v1    # "x$iv":F
    .end local v5    # "y$iv":F
    .end local v7    # "$i$f$Offset":I
    move-object v1, v6

    check-cast v1, Landroidx/compose/ui/graphics/Outline$Rectangle;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Outline$Rectangle;->getRect()Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .local v1, "this_$iv":Landroidx/compose/ui/geometry/Rect;
    const/4 v5, 0x0

    .line 417
    .local v5, "$i$f$getWidth":I
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v9

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v10

    sub-float/2addr v9, v10

    .line 390
    .end local v1    # "this_$iv":Landroidx/compose/ui/geometry/Rect;
    .end local v5    # "$i$f$getWidth":I
    move-object v1, v6

    check-cast v1, Landroidx/compose/ui/graphics/Outline$Rectangle;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Outline$Rectangle;->getRect()Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .restart local v1    # "this_$iv":Landroidx/compose/ui/geometry/Rect;
    const/4 v5, 0x0

    .line 422
    .local v5, "$i$f$getHeight":I
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v10

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v11

    sub-float/2addr v10, v11

    .line 390
    .end local v1    # "this_$iv":Landroidx/compose/ui/geometry/Rect;
    .end local v5    # "$i$f$getHeight":I
    nop

    .local v9, "width$iv":F
    .local v10, "height$iv":F
    const/4 v1, 0x0

    .line 423
    .local v1, "$i$f$Size":I
    const/4 v5, 0x0

    .line 424
    .local v5, "$i$f$packFloats":I
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v11, v11

    .line 425
    .local v11, "v1$iv$iv":J
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v13

    int-to-long v13, v13

    .line 426
    .local v13, "v2$iv$iv":J
    shl-long v15, v11, v4

    and-long/2addr v2, v13

    or-long/2addr v2, v15

    .line 423
    .end local v5    # "$i$f$packFloats":I
    .end local v11    # "v1$iv$iv":J
    .end local v13    # "v2$iv$iv":J
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    move-result-wide v1

    .line 388
    .end local v1    # "$i$f$Size":I
    .end local v9    # "width$iv":F
    .end local v10    # "height$iv":F
    invoke-virtual {v0, v7, v8, v1, v2}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->setRectOutline-tz77jQw(JJ)V

    goto/16 :goto_0

    .line 392
    :cond_0
    instance-of v1, v6, Landroidx/compose/ui/graphics/Outline$Generic;

    if-eqz v1, :cond_1

    move-object v1, v6

    check-cast v1, Landroidx/compose/ui/graphics/Outline$Generic;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Outline$Generic;->getPath()Landroidx/compose/ui/graphics/Path;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->setPathOutline(Landroidx/compose/ui/graphics/Path;)V

    goto/16 :goto_0

    .line 393
    :cond_1
    instance-of v1, v6, Landroidx/compose/ui/graphics/Outline$Rounded;

    if-eqz v1, :cond_3

    .line 398
    move-object v1, v6

    check-cast v1, Landroidx/compose/ui/graphics/Outline$Rounded;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRectPath$ui_graphics_release()Landroidx/compose/ui/graphics/Path;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 399
    move-object v1, v6

    check-cast v1, Landroidx/compose/ui/graphics/Outline$Rounded;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRectPath$ui_graphics_release()Landroidx/compose/ui/graphics/Path;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->setPathOutline(Landroidx/compose/ui/graphics/Path;)V

    goto :goto_0

    .line 401
    :cond_2
    move-object v1, v6

    check-cast v1, Landroidx/compose/ui/graphics/Outline$Rounded;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    move-result-object v7

    .line 402
    .local v7, "rr":Landroidx/compose/ui/geometry/RoundRect;
    nop

    .line 403
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/RoundRect;->getLeft()F

    move-result v1

    .local v1, "x$iv":F
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/RoundRect;->getTop()F

    move-result v5

    .local v5, "y$iv":F
    const/4 v8, 0x0

    .line 427
    .local v8, "$i$f$Offset":I
    const/4 v9, 0x0

    .line 428
    .local v9, "$i$f$packFloats":I
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    .line 429
    .local v10, "v1$iv$iv":J
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    .line 430
    .local v12, "v2$iv$iv":J
    shl-long v14, v10, v4

    and-long v16, v12, v2

    or-long v9, v14, v16

    .line 427
    .end local v9    # "$i$f$packFloats":I
    .end local v10    # "v1$iv$iv":J
    .end local v12    # "v2$iv$iv":J
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v8

    .line 404
    .end local v1    # "x$iv":F
    .end local v5    # "y$iv":F
    .end local v8    # "$i$f$Offset":I
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/RoundRect;->getWidth()F

    move-result v1

    .local v1, "width$iv":F
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/RoundRect;->getHeight()F

    move-result v5

    .local v5, "height$iv":F
    const/4 v10, 0x0

    .line 431
    .local v10, "$i$f$Size":I
    const/4 v11, 0x0

    .line 432
    .local v11, "$i$f$packFloats":I
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    .line 433
    .local v12, "v1$iv$iv":J
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v14

    int-to-long v14, v14

    .line 434
    .local v14, "v2$iv$iv":J
    shl-long v16, v12, v4

    and-long/2addr v2, v14

    or-long v2, v16, v2

    .line 431
    .end local v11    # "$i$f$packFloats":I
    .end local v12    # "v1$iv$iv":J
    .end local v14    # "v2$iv$iv":J
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    move-result-wide v1

    .line 405
    .end local v1    # "width$iv":F
    .end local v5    # "height$iv":F
    .end local v10    # "$i$f$Size":I
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/RoundRect;->getBottomLeftCornerRadius-kKHJgLs()J

    move-result-wide v10

    .local v10, "arg0$iv":J
    const/4 v3, 0x0

    .line 435
    .local v3, "$i$f$getX-impl":I
    move-wide v12, v10

    .local v12, "value$iv$iv":J
    const/4 v5, 0x0

    .line 436
    .local v5, "$i$f$unpackFloat1":I
    shr-long v14, v12, v4

    long-to-int v4, v14

    .local v4, "bits$iv$iv$iv":I
    const/4 v14, 0x0

    .line 437
    .local v14, "$i$f$floatFromBits":I
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 436
    .end local v4    # "bits$iv$iv$iv":I
    .end local v14    # "$i$f$floatFromBits":I
    nop

    .line 435
    .end local v5    # "$i$f$unpackFloat1":I
    .end local v12    # "value$iv$iv":J
    nop

    .line 402
    .end local v3    # "$i$f$getX-impl":I
    .end local v10    # "arg0$iv":J
    move v5, v4

    move-wide v3, v1

    move-wide v1, v8

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->setRoundRectOutline-TNW_H78(JJF)V

    .line 410
    .end local v7    # "rr":Landroidx/compose/ui/geometry/RoundRect;
    :cond_3
    :goto_0
    return-void
.end method
