.class final Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;
.super Lkotlin/jvm/internal/Lambda;
.source "WindowInsetsPadding.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;
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
    value = "SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,623:1\n1#2:624\n54#3:625\n59#3:627\n54#3:647\n59#3:656\n85#4:626\n90#4:628\n53#4,3:630\n60#4:634\n70#4:641\n85#4:648\n60#4:650\n90#4:657\n70#4:659\n30#5:629\n65#6:633\n69#6:640\n65#6:649\n69#6:658\n22#7,5:635\n22#7,5:642\n22#7,5:651\n22#7,5:660\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2\n*L\n568#1:625\n568#1:627\n574#1:647\n575#1:656\n568#1:626\n568#1:628\n568#1:630,3\n572#1:634\n573#1:641\n574#1:648\n574#1:650\n575#1:657\n575#1:659\n568#1:629\n572#1:633\n573#1:640\n574#1:649\n575#1:658\n572#1:635,5\n573#1:642,5\n574#1:651,5\n575#1:660,5\n*E\n"
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
.field final synthetic $height:I

.field final synthetic $measurable:Landroidx/compose/ui/layout/Measurable;

.field final synthetic $width:I

.field final synthetic this$0:Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;Landroidx/compose/ui/layout/Measurable;II)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->this$0:Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;

    iput-object p2, p0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->$measurable:Landroidx/compose/ui/layout/Measurable;

    iput p3, p0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->$width:I

    iput p4, p0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->$height:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 556
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, v0}, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 23
    .param p1, "$this$layout"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 557
    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v1

    .line 558
    .local v1, "coordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    if-eqz v1, :cond_0

    iget-object v2, v0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->this$0:Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;

    move-object v3, v1

    .line 624
    .local v3, "it":Landroidx/compose/ui/layout/LayoutCoordinates;
    const/4 v4, 0x0

    .line 558
    .local v4, "$i$a$-let-RecalculateWindowInsetsModifierNode$measure$2$1":I
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    move-result-wide v5

    invoke-static {v5, v6}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;->setOldPosition--gyyYBs(J)V

    .line 560
    .end local v3    # "it":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v4    # "$i$a$-let-RecalculateWindowInsetsModifierNode$measure$2$1":I
    :cond_0
    if-nez v1, :cond_1

    .line 562
    iget-object v2, v0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->this$0:Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;

    invoke-static {}, Landroidx/compose/foundation/layout/WindowInsetsPaddingKt;->getModifierLocalConsumedWindowInsets()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/modifier/ModifierLocal;

    invoke-virtual {v2, v3}, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;->getCurrent(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/layout/WindowInsets;

    move-object/from16 v17, v1

    goto/16 :goto_0

    .line 564
    :cond_1
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->positionInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)J

    move-result-wide v2

    .line 565
    .local v2, "topLeft":J
    invoke-interface {v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v4

    .line 567
    .local v4, "size":J
    nop

    .line 568
    const/4 v6, 0x0

    .line 625
    .local v6, "$i$f$getWidth-impl":I
    move-wide v7, v4

    .local v7, "value$iv$iv":J
    const/4 v9, 0x0

    .line 626
    .local v9, "$i$f$unpackInt1":I
    const/16 v10, 0x20

    shr-long v11, v7, v10

    long-to-int v7, v11

    .line 625
    .end local v7    # "value$iv$iv":J
    .end local v9    # "$i$f$unpackInt1":I
    nop

    .line 568
    .end local v6    # "$i$f$getWidth-impl":I
    int-to-float v6, v7

    const/4 v7, 0x0

    .line 627
    .local v7, "$i$f$getHeight-impl":I
    move-wide v8, v4

    .local v8, "value$iv$iv":J
    const/4 v11, 0x0

    .line 628
    .local v11, "$i$f$unpackInt2":I
    const-wide v12, 0xffffffffL

    and-long v14, v8, v12

    long-to-int v8, v14

    .line 627
    .end local v8    # "value$iv$iv":J
    .end local v11    # "$i$f$unpackInt2":I
    nop

    .line 568
    .end local v7    # "$i$f$getHeight-impl":I
    int-to-float v7, v8

    .local v6, "x$iv":F
    .local v7, "y$iv":F
    const/4 v8, 0x0

    .line 629
    .local v8, "$i$f$Offset":I
    const/4 v9, 0x0

    .line 630
    .local v9, "$i$f$packFloats":I
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v14, v11

    .line 631
    .local v14, "v1$iv$iv":J
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    move/from16 v16, v10

    int-to-long v10, v11

    .line 632
    .local v10, "v2$iv$iv":J
    shl-long v17, v14, v16

    and-long v19, v10, v12

    or-long v9, v17, v19

    .line 629
    .end local v9    # "$i$f$packFloats":I
    .end local v10    # "v2$iv$iv":J
    .end local v14    # "v1$iv$iv":J
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v6

    .line 567
    .end local v6    # "x$iv":F
    .end local v7    # "y$iv":F
    .end local v8    # "$i$f$Offset":I
    invoke-interface {v1, v6, v7}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToRoot-MK-Hz9U(J)J

    move-result-wide v6

    .line 566
    nop

    .line 570
    .local v6, "bottomRight":J
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v8

    .line 571
    .local v8, "root":Landroidx/compose/ui/layout/LayoutCoordinates;
    invoke-interface {v8}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v9

    .line 572
    .local v9, "rootSize":J
    const/4 v11, 0x0

    .line 633
    .local v11, "$i$f$getX-impl":I
    move-wide v14, v2

    .local v14, "value$iv$iv":J
    const/16 v17, 0x0

    .line 634
    .local v17, "$i$f$unpackFloat1":I
    move-wide/from16 v18, v12

    shr-long v12, v14, v16

    long-to-int v12, v12

    .local v12, "bits$iv$iv$iv":I
    const/4 v13, 0x0

    .line 635
    .local v13, "$i$f$floatFromBits":I
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    .line 634
    .end local v12    # "bits$iv$iv$iv":I
    .end local v13    # "$i$f$floatFromBits":I
    nop

    .line 633
    .end local v14    # "value$iv$iv":J
    .end local v17    # "$i$f$unpackFloat1":I
    nop

    .line 572
    .end local v11    # "$i$f$getX-impl":I
    nop

    .local v12, "$this$fastRoundToInt$iv":F
    const/4 v11, 0x0

    .line 639
    .local v11, "$i$f$fastRoundToInt":I
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v11

    .line 572
    .end local v11    # "$i$f$fastRoundToInt":I
    .end local v12    # "$this$fastRoundToInt$iv":F
    nop

    .line 573
    .local v11, "left":I
    const/4 v12, 0x0

    .line 640
    .local v12, "$i$f$getY-impl":I
    move-wide v13, v2

    .local v13, "value$iv$iv":J
    const/4 v15, 0x0

    .line 641
    .local v15, "$i$f$unpackFloat2":I
    move-object/from16 v17, v1

    move-wide/from16 v20, v2

    .end local v1    # "coordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v2    # "topLeft":J
    .local v17, "coordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .local v20, "topLeft":J
    and-long v1, v13, v18

    long-to-int v1, v1

    .local v1, "bits$iv$iv$iv":I
    const/4 v2, 0x0

    .line 642
    .local v2, "$i$f$floatFromBits":I
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 641
    .end local v1    # "bits$iv$iv$iv":I
    .end local v2    # "$i$f$floatFromBits":I
    nop

    .line 640
    .end local v13    # "value$iv$iv":J
    .end local v15    # "$i$f$unpackFloat2":I
    nop

    .line 573
    .end local v12    # "$i$f$getY-impl":I
    nop

    .local v1, "$this$fastRoundToInt$iv":F
    const/4 v2, 0x0

    .line 646
    .local v2, "$i$f$fastRoundToInt":I
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 573
    .end local v1    # "$this$fastRoundToInt$iv":F
    .end local v2    # "$i$f$fastRoundToInt":I
    nop

    .line 574
    .local v1, "top":I
    const/4 v2, 0x0

    .line 647
    .local v2, "$i$f$getWidth-impl":I
    move-wide v12, v9

    .local v12, "value$iv$iv":J
    const/4 v3, 0x0

    .line 648
    .local v3, "$i$f$unpackInt1":I
    shr-long v14, v12, v16

    long-to-int v3, v14

    .line 647
    .end local v3    # "$i$f$unpackInt1":I
    .end local v12    # "value$iv$iv":J
    nop

    .line 574
    .end local v2    # "$i$f$getWidth-impl":I
    const/4 v2, 0x0

    .line 649
    .local v2, "$i$f$getX-impl":I
    move-wide v12, v6

    .restart local v12    # "value$iv$iv":J
    const/4 v14, 0x0

    .line 650
    .local v14, "$i$f$unpackFloat1":I
    move/from16 v22, v2

    move v15, v3

    .end local v2    # "$i$f$getX-impl":I
    .local v22, "$i$f$getX-impl":I
    shr-long v2, v12, v16

    long-to-int v2, v2

    .local v2, "bits$iv$iv$iv":I
    const/4 v3, 0x0

    .line 651
    .local v3, "$i$f$floatFromBits":I
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 650
    .end local v2    # "bits$iv$iv$iv":I
    .end local v3    # "$i$f$floatFromBits":I
    nop

    .line 649
    .end local v12    # "value$iv$iv":J
    .end local v14    # "$i$f$unpackFloat1":I
    nop

    .line 574
    .end local v22    # "$i$f$getX-impl":I
    nop

    .local v2, "$this$fastRoundToInt$iv":F
    const/4 v3, 0x0

    .line 655
    .local v3, "$i$f$fastRoundToInt":I
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 574
    .end local v2    # "$this$fastRoundToInt$iv":F
    .end local v3    # "$i$f$fastRoundToInt":I
    sub-int v3, v15, v2

    .line 575
    .local v3, "right":I
    const/4 v2, 0x0

    .line 656
    .local v2, "$i$f$getHeight-impl":I
    move-wide v12, v9

    .restart local v12    # "value$iv$iv":J
    const/4 v14, 0x0

    .line 657
    .local v14, "$i$f$unpackInt2":I
    move-wide v15, v4

    .end local v4    # "size":J
    .local v15, "size":J
    and-long v4, v12, v18

    long-to-int v4, v4

    .line 656
    .end local v12    # "value$iv$iv":J
    .end local v14    # "$i$f$unpackInt2":I
    nop

    .line 575
    .end local v2    # "$i$f$getHeight-impl":I
    const/4 v2, 0x0

    .line 658
    .local v2, "$i$f$getY-impl":I
    move-wide v12, v6

    .restart local v12    # "value$iv$iv":J
    const/4 v5, 0x0

    .line 659
    .local v5, "$i$f$unpackFloat2":I
    move v14, v4

    move/from16 v22, v5

    .end local v5    # "$i$f$unpackFloat2":I
    .local v22, "$i$f$unpackFloat2":I
    and-long v4, v12, v18

    long-to-int v4, v4

    .local v4, "bits$iv$iv$iv":I
    const/4 v5, 0x0

    .line 660
    .local v5, "$i$f$floatFromBits":I
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 659
    .end local v4    # "bits$iv$iv$iv":I
    .end local v5    # "$i$f$floatFromBits":I
    nop

    .line 658
    .end local v12    # "value$iv$iv":J
    .end local v22    # "$i$f$unpackFloat2":I
    nop

    .line 575
    .end local v2    # "$i$f$getY-impl":I
    nop

    .local v4, "$this$fastRoundToInt$iv":F
    const/4 v2, 0x0

    .line 664
    .local v2, "$i$f$fastRoundToInt":I
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 575
    .end local v2    # "$i$f$fastRoundToInt":I
    .end local v4    # "$this$fastRoundToInt$iv":F
    sub-int v4, v14, v2

    .line 576
    .local v4, "bottom":I
    iget-object v2, v0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->this$0:Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;->getInsets()Landroidx/compose/foundation/layout/ValueInsets;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/ValueInsets;->getValue$foundation_layout_release()Landroidx/compose/foundation/layout/InsetsValues;

    move-result-object v2

    .line 577
    .local v2, "oldValues":Landroidx/compose/foundation/layout/InsetsValues;
    nop

    .line 578
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/InsetsValues;->getLeft()I

    move-result v5

    if-ne v5, v11, :cond_2

    .line 579
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/InsetsValues;->getTop()I

    move-result v5

    if-ne v5, v1, :cond_2

    .line 580
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/InsetsValues;->getRight()I

    move-result v5

    if-ne v5, v3, :cond_2

    .line 581
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/InsetsValues;->getBottom()I

    move-result v5

    if-eq v5, v4, :cond_3

    .line 583
    :cond_2
    iget-object v5, v0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->this$0:Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;

    invoke-virtual {v5}, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;->getInsets()Landroidx/compose/foundation/layout/ValueInsets;

    move-result-object v5

    new-instance v12, Landroidx/compose/foundation/layout/InsetsValues;

    invoke-direct {v12, v11, v1, v3, v4}, Landroidx/compose/foundation/layout/InsetsValues;-><init>(IIII)V

    invoke-virtual {v5, v12}, Landroidx/compose/foundation/layout/ValueInsets;->setValue$foundation_layout_release(Landroidx/compose/foundation/layout/InsetsValues;)V

    .line 585
    :cond_3
    iget-object v5, v0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->this$0:Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;

    invoke-virtual {v5}, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;->getInsets()Landroidx/compose/foundation/layout/ValueInsets;

    move-result-object v1

    .end local v1    # "top":I
    .end local v2    # "oldValues":Landroidx/compose/foundation/layout/InsetsValues;
    .end local v3    # "right":I
    .end local v4    # "bottom":I
    .end local v6    # "bottomRight":J
    .end local v8    # "root":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v9    # "rootSize":J
    .end local v11    # "left":I
    .end local v15    # "size":J
    .end local v20    # "topLeft":J
    move-object v2, v1

    check-cast v2, Landroidx/compose/foundation/layout/WindowInsets;

    .line 560
    :goto_0
    nop

    .line 559
    nop

    .line 587
    .local v2, "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    iget-object v1, v0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->this$0:Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;

    invoke-static {}, Landroidx/compose/foundation/layout/WindowInsetsPaddingKt;->getModifierLocalConsumedWindowInsets()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/modifier/ModifierLocal;

    invoke-virtual {v1, v3, v2}, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;->provide(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V

    .line 588
    iget-object v1, v0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->$measurable:Landroidx/compose/ui/layout/Measurable;

    sget-object v3, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    iget v4, v0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->$width:I

    iget v5, v0, Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode$measure$2;->$height:I

    invoke-virtual {v3, v4, v5}, Landroidx/compose/ui/unit/Constraints$Companion;->fixed-JhjzzOo(II)J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v6

    .line 589
    .local v6, "placeable":Landroidx/compose/ui/layout/Placeable;
    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 590
    return-void
.end method
