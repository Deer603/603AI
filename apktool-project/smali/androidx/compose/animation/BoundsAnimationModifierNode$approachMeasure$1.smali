.class final Landroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1;
.super Lkotlin/jvm/internal/Lambda;
.source "AnimateBoundsModifier.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/BoundsAnimationModifierNode;->approachMeasure-3p2s80s(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;
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
    value = "SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,444:1\n1#2:445\n71#3:446\n65#3:447\n73#3:450\n69#3:451\n60#4:448\n70#4:452\n22#5:449\n26#5:453\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1\n*L\n274#1:446\n274#1:447\n274#1:450\n274#1:451\n274#1:448\n274#1:452\n274#1:449\n275#1:453\n*E\n"
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
.field final synthetic $placeable:Landroidx/compose/ui/layout/Placeable;

.field final synthetic this$0:Landroidx/compose/animation/BoundsAnimationModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/animation/BoundsAnimationModifierNode;Landroidx/compose/ui/layout/Placeable;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1;->this$0:Landroidx/compose/animation/BoundsAnimationModifierNode;

    iput-object p2, p0, Landroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1;->$placeable:Landroidx/compose/ui/layout/Placeable;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 255
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, v0}, Landroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 14
    .param p1, "$this$layout"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 256
    iget-object v0, p0, Landroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1;->this$0:Landroidx/compose/animation/BoundsAnimationModifierNode;

    invoke-static {v0}, Landroidx/compose/animation/BoundsAnimationModifierNode;->access$getBoundsAnimation$p(Landroidx/compose/animation/BoundsAnimationModifierNode;)Landroidx/compose/animation/BoundsTransformDeferredAnimation;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/animation/BoundsTransformDeferredAnimation;->getValue()Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 258
    .local v0, "animatedBounds":Landroidx/compose/ui/geometry/Rect;
    iget-object v1, p0, Landroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1;->this$0:Landroidx/compose/animation/BoundsAnimationModifierNode;

    invoke-virtual {v1}, Landroidx/compose/animation/BoundsAnimationModifierNode;->getLookaheadScope()Landroidx/compose/ui/layout/LookaheadScope;

    move-result-object v1

    .local v1, "$this$invoke_u24lambda_u241":Landroidx/compose/ui/layout/LookaheadScope;
    iget-object v2, p0, Landroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1;->this$0:Landroidx/compose/animation/BoundsAnimationModifierNode;

    const/4 v3, 0x0

    .line 259
    .local v3, "$i$a$-with-BoundsAnimationModifierNode$approachMeasure$1$positionInScope$1":I
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v4

    if-eqz v4, :cond_0

    .local v4, "coordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/4 v5, 0x0

    .line 260
    .local v5, "$i$a$-let-BoundsAnimationModifierNode$approachMeasure$1$positionInScope$1$1":I
    move-object v6, p1

    invoke-interface {v1, p1}, Landroidx/compose/ui/layout/LookaheadScope;->getLookaheadScopeCoordinates(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v7

    .line 261
    nop

    .line 262
    sget-object v8, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v8

    .line 263
    invoke-virtual {v2}, Landroidx/compose/animation/BoundsAnimationModifierNode;->getAnimateMotionFrameOfReference()Z

    move-result v2

    .line 260
    invoke-interface {v7, v4, v8, v9, v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-S_NoaFU(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J

    move-result-wide v7

    .line 264
    nop

    .end local v4    # "coordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v5    # "$i$a$-let-BoundsAnimationModifierNode$approachMeasure$1$positionInScope$1$1":I
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v2

    .line 259
    goto :goto_0

    :cond_0
    move-object v6, p1

    const/4 v2, 0x0

    .line 265
    :goto_0
    nop

    .line 258
    .end local v1    # "$this$invoke_u24lambda_u241":Landroidx/compose/ui/layout/LookaheadScope;
    .end local v3    # "$i$a$-with-BoundsAnimationModifierNode$approachMeasure$1$positionInScope$1":I
    nop

    .line 257
    nop

    .line 268
    .local v2, "positionInScope":Landroidx/compose/ui/geometry/Offset;
    nop

    .line 272
    iget-object v1, p0, Landroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1;->this$0:Landroidx/compose/animation/BoundsAnimationModifierNode;

    .line 268
    if-eqz v0, :cond_1

    .line 269
    invoke-static {v1}, Landroidx/compose/animation/BoundsAnimationModifierNode;->access$getBoundsAnimation$p(Landroidx/compose/animation/BoundsAnimationModifierNode;)Landroidx/compose/animation/BoundsTransformDeferredAnimation;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    move-result-wide v3

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getSize-NH-jbRc()J

    move-result-wide v7

    invoke-virtual {v1, v3, v4, v7, v8}, Landroidx/compose/animation/BoundsTransformDeferredAnimation;->updateCurrentBounds-tz77jQw(JJ)V

    .line 270
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    move-result-wide v3

    goto :goto_1

    .line 272
    :cond_1
    invoke-static {v1}, Landroidx/compose/animation/BoundsAnimationModifierNode;->access$getBoundsAnimation$p(Landroidx/compose/animation/BoundsAnimationModifierNode;)Landroidx/compose/animation/BoundsTransformDeferredAnimation;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/animation/BoundsTransformDeferredAnimation;->getCurrentBounds()Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    move-result-wide v3

    goto :goto_1

    :cond_2
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v3

    .line 268
    :goto_1
    nop

    .line 267
    nop

    .line 274
    .local v3, "topLeft":J
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v7

    .line 445
    .local v7, "it":J
    const/4 v1, 0x0

    .line 274
    .local v1, "$i$a$-let-BoundsAnimationModifierNode$approachMeasure$1$1":I
    invoke-static {v3, v4, v7, v8}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    move-result-wide v7

    .end local v1    # "$i$a$-let-BoundsAnimationModifierNode$approachMeasure$1$1":I
    .end local v7    # "it":J
    goto :goto_2

    :cond_3
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v7

    :goto_2
    const/4 v1, 0x0

    .line 446
    .local v1, "$i$f$component1-impl":I
    const/4 v5, 0x0

    .line 447
    .local v5, "$i$f$getX-impl":I
    move-wide v9, v7

    .local v9, "value$iv$iv$iv":J
    const/4 v11, 0x0

    .line 448
    .local v11, "$i$f$unpackFloat1":I
    const/16 v12, 0x20

    shr-long v12, v9, v12

    long-to-int v12, v12

    .local v12, "bits$iv$iv$iv$iv":I
    const/4 v13, 0x0

    .line 449
    .local v13, "$i$f$floatFromBits":I
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    .line 448
    .end local v12    # "bits$iv$iv$iv$iv":I
    .end local v13    # "$i$f$floatFromBits":I
    nop

    .line 447
    .end local v9    # "value$iv$iv$iv":J
    .end local v11    # "$i$f$unpackFloat1":I
    nop

    .line 446
    .end local v5    # "$i$f$getX-impl":I
    nop

    .line 274
    .end local v1    # "$i$f$component1-impl":I
    move v1, v12

    .local v1, "x":F
    const/4 v5, 0x0

    .line 450
    .local v5, "$i$f$component2-impl":I
    const/4 v9, 0x0

    .line 451
    .local v9, "$i$f$getY-impl":I
    nop

    .local v7, "value$iv$iv$iv":J
    const/4 v10, 0x0

    .line 452
    .local v10, "$i$f$unpackFloat2":I
    const-wide v11, 0xffffffffL

    and-long/2addr v11, v7

    long-to-int v11, v11

    .local v11, "bits$iv$iv$iv$iv":I
    const/4 v12, 0x0

    .line 449
    .local v12, "$i$f$floatFromBits":I
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    .line 452
    .end local v11    # "bits$iv$iv$iv$iv":I
    .end local v12    # "$i$f$floatFromBits":I
    nop

    .line 451
    .end local v7    # "value$iv$iv$iv":J
    .end local v10    # "$i$f$unpackFloat2":I
    nop

    .line 450
    .end local v9    # "$i$f$getY-impl":I
    nop

    .line 274
    .end local v5    # "$i$f$component2-impl":I
    move v5, v11

    .line 275
    .local v5, "y":F
    iget-object v7, p0, Landroidx/compose/animation/BoundsAnimationModifierNode$approachMeasure$1;->$placeable:Landroidx/compose/ui/layout/Placeable;

    move v8, v1

    .local v8, "$this$fastRoundToInt$iv":F
    const/4 v9, 0x0

    .line 453
    .local v9, "$i$f$fastRoundToInt":I
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 275
    .end local v8    # "$this$fastRoundToInt$iv":F
    .end local v9    # "$i$f$fastRoundToInt":I
    move v9, v5

    .local v9, "$this$fastRoundToInt$iv":F
    const/4 v10, 0x0

    .line 453
    .local v10, "$i$f$fastRoundToInt":I
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 275
    .end local v9    # "$this$fastRoundToInt$iv":F
    .end local v10    # "$i$f$fastRoundToInt":I
    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 276
    return-void
.end method
