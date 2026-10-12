.class final Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SharedContentNode.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/SharedBoundsNode;->approachPlace(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/ui/layout/MeasureResult;
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
    value = "SMAP\nSharedContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode$approachPlace$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,276:1\n1#2:277\n71#3:278\n65#3:279\n73#3:282\n69#3:283\n60#4:280\n70#4:284\n22#5:281\n26#5:285\n*S KotlinDebug\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode$approachPlace$2\n*L\n203#1:278\n203#1:279\n203#1:282\n203#1:283\n203#1:280\n203#1:284\n203#1:281\n204#1:285\n*E\n"
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

.field final synthetic this$0:Landroidx/compose/animation/SharedBoundsNode;


# direct methods
.method constructor <init>(Landroidx/compose/animation/SharedBoundsNode;Landroidx/compose/ui/layout/Placeable;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    iput-object p2, p0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->$placeable:Landroidx/compose/ui/layout/Placeable;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 177
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, v0}, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 20
    .param p1, "$this$layout"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 179
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    invoke-static {v1}, Landroidx/compose/animation/SharedBoundsNode;->access$getSharedElement(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/animation/SharedElement;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/animation/SharedElement;->getTargetBounds()Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 180
    iget-object v1, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    invoke-static {v1}, Landroidx/compose/animation/SharedBoundsNode;->access$getBoundsAnimation(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/animation/BoundsAnimation;

    move-result-object v1

    .line 181
    iget-object v2, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    invoke-static {v2}, Landroidx/compose/animation/SharedBoundsNode;->access$getSharedElement(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/animation/SharedElement;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/animation/SharedElement;->getCurrentBounds()Landroidx/compose/ui/geometry/Rect;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 182
    iget-object v3, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    invoke-static {v3}, Landroidx/compose/animation/SharedBoundsNode;->access$getSharedElement(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/animation/SharedElement;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/animation/SharedElement;->getTargetBounds()Landroidx/compose/ui/geometry/Rect;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 180
    invoke-virtual {v1, v2, v3}, Landroidx/compose/animation/BoundsAnimation;->animate(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V

    .line 185
    :cond_0
    iget-object v1, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    invoke-static {v1}, Landroidx/compose/animation/SharedBoundsNode;->access$getBoundsAnimation(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/animation/BoundsAnimation;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/animation/BoundsAnimation;->getValue()Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    .line 187
    .local v1, "animatedBounds":Landroidx/compose/ui/geometry/Rect;
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    .line 277
    .local v2, "it":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/4 v4, 0x0

    .line 187
    .local v4, "$i$a$-let-SharedBoundsNode$approachPlace$2$positionInScope$1":I
    invoke-static {v3}, Landroidx/compose/animation/SharedBoundsNode;->access$getRootCoords(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v3

    sget-object v5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v5

    invoke-interface {v3, v2, v5, v6}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v2

    .end local v2    # "it":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v4    # "$i$a$-let-SharedBoundsNode$approachPlace$2$positionInScope$1":I
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 186
    :goto_0
    nop

    .line 188
    .local v2, "positionInScope":Landroidx/compose/ui/geometry/Offset;
    const-wide/16 v3, 0x0

    .line 191
    .local v3, "topLeft":J
    nop

    .line 198
    iget-object v5, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    .line 191
    if-eqz v1, :cond_3

    .line 193
    invoke-static {v5}, Landroidx/compose/animation/SharedBoundsNode;->access$getBoundsAnimation(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/animation/BoundsAnimation;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/animation/BoundsAnimation;->getTarget()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 194
    iget-object v5, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    invoke-static {v5}, Landroidx/compose/animation/SharedBoundsNode;->access$getSharedElement(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/animation/SharedElement;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroidx/compose/animation/SharedElement;->setCurrentBounds(Landroidx/compose/ui/geometry/Rect;)V

    .line 196
    :cond_2
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    move-result-wide v3

    goto :goto_1

    .line 198
    :cond_3
    invoke-static {v5}, Landroidx/compose/animation/SharedBoundsNode;->access$getBoundsAnimation(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/animation/BoundsAnimation;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/animation/BoundsAnimation;->getTarget()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 199
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v5

    if-eqz v5, :cond_4

    iget-object v6, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    invoke-static {v6, v5}, Landroidx/compose/animation/SharedBoundsNode;->access$updateCurrentBounds(Landroidx/compose/animation/SharedBoundsNode;Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 201
    :cond_4
    iget-object v5, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    invoke-static {v5}, Landroidx/compose/animation/SharedBoundsNode;->access$getSharedElement(Landroidx/compose/animation/SharedBoundsNode;)Landroidx/compose/animation/SharedElement;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/animation/SharedElement;->getCurrentBounds()Landroidx/compose/ui/geometry/Rect;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    move-result-wide v3

    .line 203
    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v5

    .line 277
    .local v5, "it":J
    const/4 v7, 0x0

    .line 203
    .local v7, "$i$a$-let-SharedBoundsNode$approachPlace$2$1":I
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    move-result-wide v5

    .end local v5    # "it":J
    .end local v7    # "$i$a$-let-SharedBoundsNode$approachPlace$2$1":I
    goto :goto_2

    :cond_5
    sget-object v5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v5

    :goto_2
    const/4 v7, 0x0

    .line 278
    .local v7, "$i$f$component1-impl":I
    const/4 v8, 0x0

    .line 279
    .local v8, "$i$f$getX-impl":I
    move-wide v9, v5

    .local v9, "value$iv$iv$iv":J
    const/4 v11, 0x0

    .line 280
    .local v11, "$i$f$unpackFloat1":I
    const/16 v12, 0x20

    shr-long v12, v9, v12

    long-to-int v12, v12

    .local v12, "bits$iv$iv$iv$iv":I
    const/4 v13, 0x0

    .line 281
    .local v13, "$i$f$floatFromBits":I
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    .line 280
    .end local v12    # "bits$iv$iv$iv$iv":I
    .end local v13    # "$i$f$floatFromBits":I
    nop

    .line 279
    .end local v9    # "value$iv$iv$iv":J
    .end local v11    # "$i$f$unpackFloat1":I
    nop

    .line 278
    .end local v8    # "$i$f$getX-impl":I
    nop

    .line 203
    .end local v7    # "$i$f$component1-impl":I
    nop

    .local v12, "x":F
    const/4 v7, 0x0

    .line 282
    .local v7, "$i$f$component2-impl":I
    const/4 v8, 0x0

    .line 283
    .local v8, "$i$f$getY-impl":I
    nop

    .local v5, "value$iv$iv$iv":J
    const/4 v9, 0x0

    .line 284
    .local v9, "$i$f$unpackFloat2":I
    const-wide v10, 0xffffffffL

    and-long/2addr v10, v5

    long-to-int v10, v10

    .local v10, "bits$iv$iv$iv$iv":I
    const/4 v11, 0x0

    .line 281
    .local v11, "$i$f$floatFromBits":I
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    .line 284
    .end local v10    # "bits$iv$iv$iv$iv":I
    .end local v11    # "$i$f$floatFromBits":I
    nop

    .line 283
    .end local v5    # "value$iv$iv$iv":J
    .end local v9    # "$i$f$unpackFloat2":I
    nop

    .line 282
    .end local v8    # "$i$f$getY-impl":I
    nop

    .line 203
    .end local v7    # "$i$f$component2-impl":I
    nop

    .line 204
    .local v10, "y":F
    iget-object v14, v0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$2;->$placeable:Landroidx/compose/ui/layout/Placeable;

    move v5, v12

    .local v5, "$this$fastRoundToInt$iv":F
    const/4 v6, 0x0

    .line 285
    .local v6, "$i$f$fastRoundToInt":I
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v15

    .line 204
    .end local v5    # "$this$fastRoundToInt$iv":F
    .end local v6    # "$i$f$fastRoundToInt":I
    move v5, v10

    .restart local v5    # "$this$fastRoundToInt$iv":F
    const/4 v6, 0x0

    .line 285
    .restart local v6    # "$i$f$fastRoundToInt":I
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v16

    .line 204
    .end local v5    # "$this$fastRoundToInt$iv":F
    .end local v6    # "$i$f$fastRoundToInt":I
    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    move-object/from16 v13, p1

    invoke-static/range {v13 .. v19}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 205
    return-void
.end method
