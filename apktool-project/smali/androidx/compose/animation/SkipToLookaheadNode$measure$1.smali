.class final Landroidx/compose/animation/SkipToLookaheadNode$measure$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SkipToLookaheadNode.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/SkipToLookaheadNode;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSkipToLookaheadNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode$measure$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 5 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,179:1\n54#2:180\n59#2:182\n54#2:188\n59#2:193\n85#3:181\n90#3:183\n53#3,3:185\n85#3:189\n60#3:191\n90#3:194\n70#3:196\n80#3:199\n31#4:184\n41#5:190\n46#5:195\n22#6:192\n22#6:197\n30#7:198\n61#8:200\n63#8:201\n*S KotlinDebug\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode$measure$1\n*L\n67#1:180\n67#1:182\n78#1:188\n79#1:193\n67#1:181\n67#1:183\n68#1:185,3\n78#1:189\n78#1:191\n79#1:194\n79#1:196\n77#1:199\n68#1:184\n78#1:190\n79#1:195\n78#1:192\n79#1:197\n77#1:198\n76#1:200\n75#1:201\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
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
.field final synthetic $constrainedSize:J

.field final synthetic $p:Landroidx/compose/ui/layout/Placeable;

.field final synthetic $this_measure:Landroidx/compose/ui/layout/MeasureScope;

.field final synthetic this$0:Landroidx/compose/animation/SkipToLookaheadNode;


# direct methods
.method constructor <init>(Landroidx/compose/animation/SkipToLookaheadNode;Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/layout/MeasureScope;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->this$0:Landroidx/compose/animation/SkipToLookaheadNode;

    iput-object p2, p0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->$p:Landroidx/compose/ui/layout/Placeable;

    iput-wide p3, p0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->$constrainedSize:J

    iput-object p5, p0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->$this_measure:Landroidx/compose/ui/layout/MeasureScope;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 60
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, v0}, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 23
    .param p1, "$this$layout"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 61
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->this$0:Landroidx/compose/animation/SkipToLookaheadNode;

    invoke-virtual {v1}, Landroidx/compose/animation/SkipToLookaheadNode;->getScaleToBounds()Landroidx/compose/animation/ScaleToBoundsImpl;

    move-result-object v1

    .line 62
    .local v1, "scaleToBounds":Landroidx/compose/animation/ScaleToBoundsImpl;
    iget-object v2, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->this$0:Landroidx/compose/animation/SkipToLookaheadNode;

    invoke-virtual {v2}, Landroidx/compose/animation/SkipToLookaheadNode;->isEnabled()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 65
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/animation/ScaleToBoundsImpl;->getContentScale()Landroidx/compose/ui/layout/ContentScale;

    move-result-object v2

    .line 67
    .local v2, "contentScale":Landroidx/compose/ui/layout/ContentScale;
    iget-object v3, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->this$0:Landroidx/compose/animation/SkipToLookaheadNode;

    invoke-static {v3}, Landroidx/compose/animation/SkipToLookaheadNode;->access$getLookaheadSize$p(Landroidx/compose/animation/SkipToLookaheadNode;)J

    move-result-wide v3

    .local v3, "arg0$iv":J
    const/4 v5, 0x0

    .line 180
    .local v5, "$i$f$getWidth-impl":I
    move-wide v6, v3

    .local v6, "value$iv$iv":J
    const/4 v8, 0x0

    .line 181
    .local v8, "$i$f$unpackInt1":I
    const/16 v9, 0x20

    shr-long v10, v6, v9

    long-to-int v6, v10

    .line 180
    .end local v6    # "value$iv$iv":J
    .end local v8    # "$i$f$unpackInt1":I
    nop

    .line 67
    .end local v3    # "arg0$iv":J
    .end local v5    # "$i$f$getWidth-impl":I
    const-wide v3, 0xffffffffL

    if-eqz v6, :cond_2

    iget-object v5, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->this$0:Landroidx/compose/animation/SkipToLookaheadNode;

    invoke-static {v5}, Landroidx/compose/animation/SkipToLookaheadNode;->access$getLookaheadSize$p(Landroidx/compose/animation/SkipToLookaheadNode;)J

    move-result-wide v5

    .local v5, "arg0$iv":J
    const/4 v7, 0x0

    .line 182
    .local v7, "$i$f$getHeight-impl":I
    move-wide v10, v5

    .local v10, "value$iv$iv":J
    const/4 v8, 0x0

    .line 183
    .local v8, "$i$f$unpackInt2":I
    and-long v12, v10, v3

    long-to-int v8, v12

    .line 182
    .end local v8    # "$i$f$unpackInt2":I
    .end local v10    # "value$iv$iv":J
    nop

    .line 67
    .end local v5    # "arg0$iv":J
    .end local v7    # "$i$f$getHeight-impl":I
    if-nez v8, :cond_1

    goto :goto_0

    .line 70
    :cond_1
    nop

    .line 71
    iget-object v5, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->this$0:Landroidx/compose/animation/SkipToLookaheadNode;

    invoke-static {v5}, Landroidx/compose/animation/SkipToLookaheadNode;->access$getLookaheadSize$p(Landroidx/compose/animation/SkipToLookaheadNode;)J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/ui/unit/IntSizeKt;->toSize-ozmzZPI(J)J

    move-result-wide v5

    .line 72
    iget-wide v7, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->$constrainedSize:J

    invoke-static {v7, v8}, Landroidx/compose/ui/unit/IntSizeKt;->toSize-ozmzZPI(J)J

    move-result-wide v7

    .line 70
    invoke-interface {v2, v5, v6, v7, v8}, Landroidx/compose/ui/layout/ContentScale;->computeScaleFactor-H7hwNQA(JJ)J

    move-result-wide v5

    goto :goto_1

    .line 68
    :cond_2
    :goto_0
    const/high16 v5, 0x3f800000    # 1.0f

    .local v5, "scaleX$iv":F
    const/high16 v6, 0x3f800000    # 1.0f

    .local v6, "scaleY$iv":F
    const/4 v7, 0x0

    .line 184
    .local v7, "$i$f$ScaleFactor":I
    const/4 v8, 0x0

    .line 185
    .local v8, "$i$f$packFloats":I
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    .line 186
    .local v10, "v1$iv$iv":J
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    .line 187
    .local v12, "v2$iv$iv":J
    shl-long v14, v10, v9

    and-long v16, v12, v3

    or-long v10, v14, v16

    .line 184
    .end local v8    # "$i$f$packFloats":I
    .end local v10    # "v1$iv$iv":J
    .end local v12    # "v2$iv$iv":J
    invoke-static {v10, v11}, Landroidx/compose/ui/layout/ScaleFactor;->constructor-impl(J)J

    move-result-wide v5

    .line 67
    .end local v5    # "scaleX$iv":F
    .end local v6    # "scaleY$iv":F
    .end local v7    # "$i$f$ScaleFactor":I
    :goto_1
    nop

    .line 66
    nop

    .line 76
    .local v5, "resolvedScale":J
    invoke-virtual {v1}, Landroidx/compose/animation/ScaleToBoundsImpl;->getAlignment()Landroidx/compose/ui/Alignment;

    move-result-object v10

    .line 78
    iget-object v7, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->this$0:Landroidx/compose/animation/SkipToLookaheadNode;

    invoke-static {v7}, Landroidx/compose/animation/SkipToLookaheadNode;->access$getLookaheadSize$p(Landroidx/compose/animation/SkipToLookaheadNode;)J

    move-result-wide v7

    .local v7, "arg0$iv":J
    const/4 v11, 0x0

    .line 188
    .local v11, "$i$f$getWidth-impl":I
    move-wide v12, v7

    .local v12, "value$iv$iv":J
    const/4 v14, 0x0

    .line 189
    .local v14, "$i$f$unpackInt1":I
    move-wide v15, v3

    shr-long v3, v12, v9

    long-to-int v3, v3

    .line 188
    .end local v12    # "value$iv$iv":J
    .end local v14    # "$i$f$unpackInt1":I
    nop

    .end local v7    # "arg0$iv":J
    .end local v11    # "$i$f$getWidth-impl":I
    int-to-float v3, v3

    .line 78
    const/4 v4, 0x0

    .line 190
    .local v4, "$i$f$getScaleX-impl":I
    move-wide v7, v5

    .local v7, "value$iv$iv":J
    const/4 v11, 0x0

    .line 191
    .local v11, "$i$f$unpackFloat1":I
    shr-long v12, v7, v9

    long-to-int v12, v12

    .local v12, "bits$iv$iv$iv":I
    const/4 v13, 0x0

    .line 192
    .local v13, "$i$f$floatFromBits":I
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    .line 191
    .end local v12    # "bits$iv$iv$iv":I
    .end local v13    # "$i$f$floatFromBits":I
    nop

    .line 190
    .end local v7    # "value$iv$iv":J
    .end local v11    # "$i$f$unpackFloat1":I
    nop

    .line 78
    .end local v4    # "$i$f$getScaleX-impl":I
    mul-float/2addr v3, v12

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    .line 79
    iget-object v4, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->this$0:Landroidx/compose/animation/SkipToLookaheadNode;

    invoke-static {v4}, Landroidx/compose/animation/SkipToLookaheadNode;->access$getLookaheadSize$p(Landroidx/compose/animation/SkipToLookaheadNode;)J

    move-result-wide v7

    .local v7, "arg0$iv":J
    const/4 v4, 0x0

    .line 193
    .local v4, "$i$f$getHeight-impl":I
    move-wide v11, v7

    .local v11, "value$iv$iv":J
    const/4 v13, 0x0

    .line 194
    .local v13, "$i$f$unpackInt2":I
    move v14, v9

    move-object/from16 v17, v10

    and-long v9, v11, v15

    long-to-int v9, v9

    .line 193
    .end local v11    # "value$iv$iv":J
    .end local v13    # "$i$f$unpackInt2":I
    nop

    .end local v4    # "$i$f$getHeight-impl":I
    .end local v7    # "arg0$iv":J
    int-to-float v4, v9

    .line 79
    const/4 v7, 0x0

    .line 195
    .local v7, "$i$f$getScaleY-impl":I
    move-wide v8, v5

    .local v8, "value$iv$iv":J
    const/4 v10, 0x0

    .line 196
    .local v10, "$i$f$unpackFloat2":I
    and-long v11, v8, v15

    long-to-int v11, v11

    .local v11, "bits$iv$iv$iv":I
    const/4 v12, 0x0

    .line 197
    .local v12, "$i$f$floatFromBits":I
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    .line 196
    .end local v11    # "bits$iv$iv$iv":I
    .end local v12    # "$i$f$floatFromBits":I
    nop

    .line 195
    .end local v8    # "value$iv$iv":J
    .end local v10    # "$i$f$unpackFloat2":I
    nop

    .line 79
    .end local v7    # "$i$f$getScaleY-impl":I
    mul-float/2addr v4, v11

    invoke-static {v4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    .line 77
    nop

    .local v3, "width$iv":I
    .local v4, "height$iv":I
    const/4 v7, 0x0

    .line 198
    .local v7, "$i$f$IntSize":I
    const/4 v8, 0x0

    .line 199
    .local v8, "$i$f$packInts":I
    int-to-long v9, v3

    shl-long/2addr v9, v14

    int-to-long v11, v4

    and-long/2addr v11, v15

    or-long v8, v9, v11

    .line 198
    .end local v8    # "$i$f$packInts":I
    invoke-static {v8, v9}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    move-result-wide v11

    .line 81
    .end local v3    # "width$iv":I
    .end local v4    # "height$iv":I
    .end local v7    # "$i$f$IntSize":I
    iget-wide v13, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->$constrainedSize:J

    .line 82
    iget-object v3, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->$this_measure:Landroidx/compose/ui/layout/MeasureScope;

    invoke-interface {v3}, Landroidx/compose/ui/layout/MeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v15

    .line 76
    move-object/from16 v10, v17

    invoke-interface/range {v10 .. v15}, Landroidx/compose/ui/Alignment;->align-KFBX0sM(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    move-result-wide v3

    const/4 v7, 0x0

    .line 200
    .local v7, "$i$f$component1-impl":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v7

    .line 75
    .end local v7    # "$i$f$component1-impl":I
    move v10, v7

    .local v10, "x":I
    const/4 v7, 0x0

    .line 201
    .local v7, "$i$f$component2-impl":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v11

    .line 75
    .end local v7    # "$i$f$component2-impl":I
    nop

    .line 84
    .local v11, "y":I
    iget-object v9, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->$p:Landroidx/compose/ui/layout/Placeable;

    new-instance v3, Landroidx/compose/animation/SkipToLookaheadNode$measure$1$1;

    invoke-direct {v3, v5, v6}, Landroidx/compose/animation/SkipToLookaheadNode$measure$1$1;-><init>(J)V

    move-object v13, v3

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v15}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeWithLayer$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    goto :goto_3

    .line 63
    .end local v2    # "contentScale":Landroidx/compose/ui/layout/ContentScale;
    .end local v5    # "resolvedScale":J
    .end local v10    # "x":I
    .end local v11    # "y":I
    :cond_3
    :goto_2
    iget-object v2, v0, Landroidx/compose/animation/SkipToLookaheadNode$measure$1;->$p:Landroidx/compose/ui/layout/Placeable;

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, p1

    move-object/from16 v17, v2

    invoke-static/range {v16 .. v22}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 90
    :goto_3
    return-void
.end method
