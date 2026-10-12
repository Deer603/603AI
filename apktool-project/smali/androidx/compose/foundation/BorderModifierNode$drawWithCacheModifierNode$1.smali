.class final Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Border.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/BorderModifierNode;-><init>(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/draw/CacheDrawScope;",
        "Landroidx/compose/ui/draw/DrawResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,468:1\n30#2:469\n53#3,3:470\n60#3:474\n70#3:477\n53#3,3:479\n57#4:473\n61#4:476\n22#5:475\n33#6:478\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1\n*L\n169#1:469\n169#1:470,3\n170#1:474\n170#1:477\n170#1:479,3\n170#1:473\n170#1:476\n170#1:475\n170#1:478\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/draw/DrawResult;",
        "Landroidx/compose/ui/draw/CacheDrawScope;",
        "invoke"
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
.field final synthetic this$0:Landroidx/compose/foundation/BorderModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/BorderModifierNode;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;
    .locals 25
    .param p1, "$this$CacheDrawModifierNode"    # Landroidx/compose/ui/draw/CacheDrawScope;

    .line 159
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getWidth-D9Ej5fM()F

    move-result v1

    invoke-virtual {v2, v1}, Landroidx/compose/ui/draw/CacheDrawScope;->toPx-0680j_4(F)F

    move-result v1

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-ltz v1, :cond_0

    invoke-virtual {v2}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Size;->getMinDimension-impl(J)F

    move-result v1

    cmpl-float v1, v1, v3

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move v11, v1

    .line 160
    .local v11, "hasValidBorderParams":Z
    if-nez v11, :cond_1

    .line 161
    invoke-static {v2}, Landroidx/compose/foundation/BorderKt;->access$drawContentWithoutBorder(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v1

    goto/16 :goto_3

    .line 164
    :cond_1
    nop

    .line 165
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getWidth-D9Ej5fM()F

    move-result v1

    sget-object v3, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/unit/Dp$Companion;->getHairline-D9Ej5fM()F

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getWidth-D9Ej5fM()F

    move-result v1

    invoke-virtual {v2, v1}, Landroidx/compose/ui/draw/CacheDrawScope;->toPx-0680j_4(F)F

    move-result v1

    float-to-double v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v1, v6

    .line 166
    :goto_1
    invoke-virtual {v2}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v6

    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Size;->getMinDimension-impl(J)F

    move-result v3

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v3, v6

    float-to-double v7, v3

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-float v3, v7

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 164
    nop

    .line 163
    nop

    .line 168
    .local v8, "strokeWidthPx":F
    div-float v12, v8, v6

    .line 169
    .local v12, "halfStroke":F
    const/4 v1, 0x0

    .line 469
    .local v1, "$i$f$Offset":I
    const/4 v3, 0x0

    .line 470
    .local v3, "$i$f$packFloats":I
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v9, v7

    .line 471
    .local v9, "v1$iv$iv":J
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v13, v7

    .line 472
    .local v13, "v2$iv$iv":J
    const/16 v7, 0x20

    shl-long v15, v9, v7

    const-wide v17, 0xffffffffL

    and-long v19, v13, v17

    or-long v9, v15, v19

    .line 469
    .end local v3    # "$i$f$packFloats":I
    .end local v9    # "v1$iv$iv":J
    .end local v13    # "v2$iv$iv":J
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v9

    .line 169
    .end local v1    # "$i$f$Offset":I
    nop

    .line 170
    .local v9, "topLeft":J
    invoke-virtual {v2}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v13

    .local v13, "arg0$iv":J
    const/4 v1, 0x0

    .line 473
    .local v1, "$i$f$getWidth-impl":I
    move-wide v15, v13

    .local v15, "value$iv$iv":J
    const/4 v3, 0x0

    .line 474
    .local v3, "$i$f$unpackFloat1":I
    shr-long v4, v15, v7

    long-to-int v4, v4

    .local v4, "bits$iv$iv$iv":I
    const/4 v5, 0x0

    .line 475
    .local v5, "$i$f$floatFromBits":I
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 474
    .end local v4    # "bits$iv$iv$iv":I
    .end local v5    # "$i$f$floatFromBits":I
    nop

    .line 473
    .end local v3    # "$i$f$unpackFloat1":I
    .end local v15    # "value$iv$iv":J
    nop

    .line 170
    .end local v1    # "$i$f$getWidth-impl":I
    .end local v13    # "arg0$iv":J
    sub-float/2addr v4, v8

    invoke-virtual {v2}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v13

    .restart local v13    # "arg0$iv":J
    const/4 v1, 0x0

    .line 476
    .local v1, "$i$f$getHeight-impl":I
    move-wide v15, v13

    .restart local v15    # "value$iv$iv":J
    const/4 v3, 0x0

    .line 477
    .local v3, "$i$f$unpackFloat2":I
    move v5, v6

    move/from16 v21, v7

    and-long v6, v15, v17

    long-to-int v6, v6

    .local v6, "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 475
    .local v7, "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 477
    .end local v6    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 476
    .end local v3    # "$i$f$unpackFloat2":I
    .end local v15    # "value$iv$iv":J
    nop

    .line 170
    .end local v1    # "$i$f$getHeight-impl":I
    .end local v13    # "arg0$iv":J
    sub-float/2addr v6, v8

    .local v4, "width$iv":F
    .local v6, "height$iv":F
    const/4 v1, 0x0

    .line 478
    .local v1, "$i$f$Size":I
    const/4 v3, 0x0

    .line 479
    .local v3, "$i$f$packFloats":I
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v13, v7

    .line 480
    .local v13, "v1$iv$iv":J
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    move v15, v5

    move/from16 v16, v6

    .end local v6    # "height$iv":F
    .local v16, "height$iv":F
    int-to-long v5, v7

    .line 481
    .local v5, "v2$iv$iv":J
    shl-long v21, v13, v21

    and-long v17, v5, v17

    or-long v5, v21, v17

    .line 478
    .end local v3    # "$i$f$packFloats":I
    .end local v5    # "v2$iv$iv":J
    .end local v13    # "v1$iv$iv":J
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    move-result-wide v5

    .line 170
    .end local v1    # "$i$f$Size":I
    .end local v4    # "width$iv":F
    .end local v16    # "height$iv":F
    move-wide v13, v5

    .line 172
    .local v13, "borderSize":J
    mul-float v6, v8, v15

    invoke-virtual {v2}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Size;->getMinDimension-impl(J)F

    move-result v1

    cmpl-float v1, v6, v1

    if-lez v1, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    .line 173
    .local v5, "fillArea":Z
    :goto_2
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getShape()Landroidx/compose/ui/graphics/Shape;

    move-result-object v1

    invoke-virtual {v2}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v3

    invoke-virtual {v2}, Landroidx/compose/ui/draw/CacheDrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v6

    move-object v7, v2

    check-cast v7, Landroidx/compose/ui/unit/Density;

    invoke-interface {v1, v3, v4, v6, v7}, Landroidx/compose/ui/graphics/Shape;->createOutline-Pq9zytI(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;

    move-result-object v15

    .line 174
    .local v15, "outline":Landroidx/compose/ui/graphics/Outline;
    instance-of v1, v15, Landroidx/compose/ui/graphics/Outline$Generic;

    if-eqz v1, :cond_4

    .line 175
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    iget-object v3, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v3}, Landroidx/compose/foundation/BorderModifierNode;->getBrush()Landroidx/compose/ui/graphics/Brush;

    move-result-object v3

    move-object v4, v15

    check-cast v4, Landroidx/compose/ui/graphics/Outline$Generic;

    move v6, v8

    .end local v8    # "strokeWidthPx":F
    .local v6, "strokeWidthPx":F
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/BorderModifierNode;->access$drawGenericBorder(Landroidx/compose/foundation/BorderModifierNode;Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v1

    goto :goto_3

    .line 176
    .end local v6    # "strokeWidthPx":F
    .restart local v8    # "strokeWidthPx":F
    :cond_4
    move v6, v8

    .end local v8    # "strokeWidthPx":F
    .restart local v6    # "strokeWidthPx":F
    instance-of v1, v15, Landroidx/compose/ui/graphics/Outline$Rounded;

    if-eqz v1, :cond_5

    .line 177
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    .line 178
    iget-object v2, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v2}, Landroidx/compose/foundation/BorderModifierNode;->getBrush()Landroidx/compose/ui/graphics/Brush;

    move-result-object v3

    .line 179
    move-object v4, v15

    check-cast v4, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 180
    nop

    .line 181
    nop

    .line 182
    nop

    .line 183
    nop

    .line 177
    move-object/from16 v2, p1

    move-wide v7, v13

    move-wide/from16 v23, v9

    move v9, v5

    move v10, v6

    move-wide/from16 v5, v23

    .end local v6    # "strokeWidthPx":F
    .end local v13    # "borderSize":J
    .local v5, "topLeft":J
    .local v7, "borderSize":J
    .local v9, "fillArea":Z
    .local v10, "strokeWidthPx":F
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/BorderModifierNode;->access$drawRoundRectBorder-JqoCqck(Landroidx/compose/foundation/BorderModifierNode;Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v1

    move-wide v3, v5

    move v5, v9

    move v6, v10

    .end local v9    # "fillArea":Z
    .end local v10    # "strokeWidthPx":F
    .local v3, "topLeft":J
    .local v5, "fillArea":Z
    .restart local v6    # "strokeWidthPx":F
    goto :goto_3

    .line 185
    .end local v3    # "topLeft":J
    .end local v7    # "borderSize":J
    .local v9, "topLeft":J
    .restart local v13    # "borderSize":J
    :cond_5
    move-wide v3, v9

    move-wide v7, v13

    .end local v9    # "topLeft":J
    .end local v13    # "borderSize":J
    .restart local v3    # "topLeft":J
    .restart local v7    # "borderSize":J
    instance-of v1, v15, Landroidx/compose/ui/graphics/Outline$Rectangle;

    if-eqz v1, :cond_6

    .line 186
    iget-object v1, v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->this$0:Landroidx/compose/foundation/BorderModifierNode;

    invoke-virtual {v1}, Landroidx/compose/foundation/BorderModifierNode;->getBrush()Landroidx/compose/ui/graphics/Brush;

    move-result-object v2

    move-object/from16 v1, p1

    move-wide/from16 v23, v7

    move v7, v5

    move v8, v6

    move-wide/from16 v5, v23

    .end local v6    # "strokeWidthPx":F
    .local v5, "borderSize":J
    .local v7, "fillArea":Z
    .restart local v8    # "strokeWidthPx":F
    invoke-static/range {v1 .. v8}, Landroidx/compose/foundation/BorderKt;->access$drawRectBorder-NsqcLGU(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v2

    move v5, v7

    move v6, v8

    move-wide/from16 v7, v23

    move-object v1, v2

    .line 188
    .end local v3    # "topLeft":J
    .end local v5    # "borderSize":J
    .end local v7    # "fillArea":Z
    .end local v8    # "strokeWidthPx":F
    .end local v12    # "halfStroke":F
    .end local v15    # "outline":Landroidx/compose/ui/graphics/Outline;
    :goto_3
    return-object v1

    .line 186
    .restart local v3    # "topLeft":J
    .local v5, "fillArea":Z
    .restart local v6    # "strokeWidthPx":F
    .local v7, "borderSize":J
    .restart local v12    # "halfStroke":F
    .restart local v15    # "outline":Landroidx/compose/ui/graphics/Outline;
    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 158
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/draw/CacheDrawScope;

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;->invoke(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v0

    return-object v0
.end method
