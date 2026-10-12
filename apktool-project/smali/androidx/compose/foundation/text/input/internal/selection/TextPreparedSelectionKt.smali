.class public final Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt;
.super Ljava/lang/Object;
.source "TextPreparedSelection.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,560:1\n722#2,23:561\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n465#1:561,23\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "calculateNextCursorPositionAndWedgeAffinity",
        "Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;",
        "proposedCursor",
        "",
        "cursor",
        "transformedTextFieldState",
        "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
        "(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J",
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
.method public static final calculateNextCursorPositionAndWedgeAffinity(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J
    .locals 16
    .param p0, "proposedCursor"    # I
    .param p1, "cursor"    # I
    .param p2, "transformedTextFieldState"    # Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 455
    move/from16 v0, p0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 457
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->constructor-impl(I)J

    move-result-wide v1

    return-wide v1

    .line 460
    :cond_0
    move/from16 v1, p1

    if-le v0, v1, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 465
    .local v2, "forward":Z
    :goto_0
    move-object/from16 v3, p2

    .local v3, "$this$getIndexTransformationType$iv":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    const/4 v4, 0x0

    .line 561
    .local v4, "$i$f$getIndexTransformationType":I
    invoke-virtual {v3, v0}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->mapFromTransformed--jx7JFs(I)J

    move-result-wide v5

    .line 562
    .local v5, "untransformed$iv":J
    invoke-virtual {v3, v5, v6}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->mapToTransformed-GEjPoXI(J)J

    move-result-wide v7

    .line 564
    .local v7, "retransformed$iv":J
    nop

    .line 565
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-static {v7, v8}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 567
    sget-object v9, Landroidx/compose/foundation/text/input/internal/IndexTransformationType;->Untransformed:Landroidx/compose/foundation/text/input/internal/IndexTransformationType;

    goto :goto_1

    .line 569
    :cond_2
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-static {v7, v8}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v9

    if-nez v9, :cond_3

    .line 572
    sget-object v9, Landroidx/compose/foundation/text/input/internal/IndexTransformationType;->Replacement:Landroidx/compose/foundation/text/input/internal/IndexTransformationType;

    goto :goto_1

    .line 574
    :cond_3
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-static {v7, v8}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v9

    if-nez v9, :cond_4

    .line 576
    sget-object v9, Landroidx/compose/foundation/text/input/internal/IndexTransformationType;->Insertion:Landroidx/compose/foundation/text/input/internal/IndexTransformationType;

    goto :goto_1

    .line 580
    :cond_4
    sget-object v9, Landroidx/compose/foundation/text/input/internal/IndexTransformationType;->Deletion:Landroidx/compose/foundation/text/input/internal/IndexTransformationType;

    .line 564
    :goto_1
    nop

    .line 563
    nop

    .line 583
    .local v9, "type$iv":Landroidx/compose/foundation/text/input/internal/IndexTransformationType;
    move-object v10, v9

    .local v10, "type":Landroidx/compose/foundation/text/input/internal/IndexTransformationType;
    move-wide v11, v7

    .local v11, "retransformed":J
    const/4 v13, 0x0

    .line 468
    .local v13, "$i$a$-getIndexTransformationType-TextPreparedSelectionKt$calculateNextCursorPositionAndWedgeAffinity$1":I
    sget-object v14, Landroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v10}, Landroidx/compose/foundation/text/input/internal/IndexTransformationType;->ordinal()I

    move-result v15

    aget v14, v14, v15

    packed-switch v14, :pswitch_data_0

    .line 515
    new-instance v14, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v14}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v14

    .line 497
    :pswitch_0
    if-eqz v2, :cond_6

    .line 498
    invoke-static {v11, v12}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v14

    if-ne v0, v14, :cond_5

    .line 500
    sget-object v14, Landroidx/compose/foundation/text/input/internal/WedgeAffinity;->Start:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    invoke-static {v0, v14}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->constructor-impl(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J

    move-result-wide v14

    goto :goto_3

    .line 504
    :cond_5
    invoke-static {v11, v12}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v14

    sget-object v15, Landroidx/compose/foundation/text/input/internal/WedgeAffinity;->End:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    invoke-static {v14, v15}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->constructor-impl(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J

    move-result-wide v14

    goto :goto_3

    .line 509
    :cond_6
    invoke-static {v11, v12}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v14

    if-ne v0, v14, :cond_7

    .line 511
    sget-object v14, Landroidx/compose/foundation/text/input/internal/WedgeAffinity;->End:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    invoke-static {v0, v14}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->constructor-impl(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J

    move-result-wide v14

    goto :goto_3

    .line 515
    :cond_7
    invoke-static {v11, v12}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v14

    sget-object v15, Landroidx/compose/foundation/text/input/internal/WedgeAffinity;->Start:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    invoke-static {v14, v15}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->constructor-impl(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J

    move-result-wide v14

    goto :goto_3

    .line 487
    :pswitch_1
    if-eqz v2, :cond_8

    .line 488
    invoke-static {v11, v12}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v14

    sget-object v15, Landroidx/compose/foundation/text/input/internal/WedgeAffinity;->Start:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    invoke-static {v14, v15}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->constructor-impl(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J

    move-result-wide v14

    goto :goto_3

    .line 490
    :cond_8
    invoke-static {v11, v12}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v14

    sget-object v15, Landroidx/compose/foundation/text/input/internal/WedgeAffinity;->End:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    invoke-static {v14, v15}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->constructor-impl(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J

    move-result-wide v14

    goto :goto_3

    .line 480
    :pswitch_2
    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->constructor-impl(I)J

    move-result-wide v14

    goto :goto_3

    .line 474
    :pswitch_3
    nop

    .line 475
    if-eqz v2, :cond_9

    sget-object v14, Landroidx/compose/foundation/text/input/internal/WedgeAffinity;->Start:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    goto :goto_2

    :cond_9
    sget-object v14, Landroidx/compose/foundation/text/input/internal/WedgeAffinity;->End:Landroidx/compose/foundation/text/input/internal/WedgeAffinity;

    .line 473
    :goto_2
    invoke-static {v0, v14}, Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;->constructor-impl(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J

    move-result-wide v14

    .line 519
    :goto_3
    nop

    .line 583
    .end local v10    # "type":Landroidx/compose/foundation/text/input/internal/IndexTransformationType;
    .end local v11    # "retransformed":J
    .end local v13    # "$i$a$-getIndexTransformationType-TextPreparedSelectionKt$calculateNextCursorPositionAndWedgeAffinity$1":I
    nop

    .line 465
    .end local v3    # "$this$getIndexTransformationType$iv":Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .end local v4    # "$i$f$getIndexTransformationType":I
    .end local v5    # "untransformed$iv":J
    .end local v7    # "retransformed$iv":J
    .end local v9    # "type$iv":Landroidx/compose/foundation/text/input/internal/IndexTransformationType;
    return-wide v14

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
