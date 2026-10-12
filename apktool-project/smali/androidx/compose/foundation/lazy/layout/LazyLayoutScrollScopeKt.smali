.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;
.super Ljava/lang/Object;
.source "LazyLayoutScrollScope.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyLayoutScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,297:1\n42#1,4:304\n42#1,4:308\n96#2,5:298\n1#3:303\n113#4:312\n113#4:313\n113#4:314\n*S KotlinDebug\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n*L\n169#1:304,4\n263#1:308,4\n116#1:298,5\n35#1:312\n36#1:313\n37#1:314\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0082\u0008\u001a2\u0010\u000c\u001a\u00020\u0008*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@\u00a2\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\u00a8\u0006\u0016"
    }
    d2 = {
        "BoundDistance",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "DEBUG",
        "",
        "MinimumDistance",
        "TargetDistance",
        "debugLog",
        "",
        "generateMsg",
        "Lkotlin/Function0;",
        "",
        "animateScrollToItem",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;",
        "index",
        "",
        "scrollOffset",
        "numOfItemsForTeleport",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isItemVisible",
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


# static fields
.field private static final BoundDistance:F

.field private static final DEBUG:Z = false

.field private static final MinimumDistance:F

.field private static final TargetDistance:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 35
    const/16 v0, 0x9c4

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 312
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 35
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->TargetDistance:F

    .line 36
    const/16 v0, 0x5dc

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 313
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 36
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->BoundDistance:F

    .line 37
    const/16 v0, 0x32

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 314
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 37
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->MinimumDistance:F

    return-void
.end method

.method public static final synthetic access$animateScrollToItem$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;II)Z
    .locals 1
    .param p0, "forward"    # Z
    .param p1, "$this_animateScrollToItem"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .param p2, "$index"    # I
    .param p3, "$scrollOffset"    # I

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->animateScrollToItem$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;II)Z

    move-result v0

    return v0
.end method

.method public static final animateScrollToItem(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 39
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;",
            "III",
            "Landroidx/compose/ui/unit/Density;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p5

    instance-of v0, v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;

    iget v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    sub-int/2addr v2, v3

    iput v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v2, v0

    .local v2, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v3, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->result:Ljava/lang/Object;

    .local v3, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 110
    iget v0, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    const/4 v9, 0x1

    packed-switch v0, :pswitch_data_0

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v3    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v3    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget v0, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .local v0, "scrollOffset":I
    iget v4, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    .local v4, "index":I
    iget-object v5, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    check-cast v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    .local v5, "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    .end local v0    # "scrollOffset":I
    .end local v4    # "index":I
    .end local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    :pswitch_1
    iget v0, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$3:I

    .local v0, "forward":Z
    iget v10, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$2:F

    .local v10, "minDistancePx":F
    iget v11, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$1:F

    .local v11, "boundDistancePx":F
    iget v12, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$0:F

    .local v12, "targetDistancePx":F
    iget v13, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$2:I

    .local v13, "numOfItemsForTeleport":I
    iget v14, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .local v14, "scrollOffset":I
    iget v15, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    const/16 v16, 0x0

    .local v15, "index":I
    iget-object v6, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$3:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$IntRef;

    .local v6, "loops":Lkotlin/jvm/internal/Ref$IntRef;
    iget-object v5, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .local v5, "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    iget-object v7, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/Ref$BooleanRef;

    .local v7, "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    iget-object v8, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    .local v8, "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    :try_start_0
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v25, v6

    move-object v6, v5

    move-object v5, v8

    move-object/from16 v8, v25

    move/from16 v25, v11

    move/from16 v27, v13

    move/from16 v28, v14

    move v14, v0

    move-object v0, v7

    move v7, v15

    goto/16 :goto_8

    .line 257
    .end local v0    # "forward":Z
    .end local v5    # "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v6    # "loops":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v7    # "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    .end local v10    # "minDistancePx":F
    .end local v11    # "boundDistancePx":F
    .end local v12    # "targetDistancePx":F
    .end local v13    # "numOfItemsForTeleport":I
    :catch_0
    move-exception v0

    move-object v5, v4

    move v6, v14

    move v4, v15

    const/4 v13, 0x0

    move-object v15, v8

    goto/16 :goto_9

    .line 110
    .end local v8    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v14    # "scrollOffset":I
    .end local v15    # "index":I
    :pswitch_2
    const/16 v16, 0x0

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v5, p0

    .local v5, "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    move/from16 v6, p2

    .local v6, "scrollOffset":I
    move-object/from16 v0, p4

    .local v0, "density":Landroidx/compose/ui/unit/Density;
    move/from16 v7, p1

    .local v7, "index":I
    move/from16 v8, p3

    .line 116
    .local v8, "numOfItemsForTeleport":I
    int-to-float v10, v7

    cmpl-float v10, v10, v16

    if-ltz v10, :cond_1

    move v10, v9

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    .local v10, "value$iv":Z
    :goto_1
    const/4 v11, 0x0

    .line 298
    .local v11, "$i$f$requirePrecondition":I
    nop

    .line 299
    if-nez v10, :cond_2

    .line 300
    .end local v10    # "value$iv":Z
    const/4 v10, 0x0

    .line 116
    .local v10, "$i$a$-requirePrecondition-LazyLayoutScrollScopeKt$animateScrollToItem$2":I
    nop

    .line 300
    .end local v10    # "$i$a$-requirePrecondition-LazyLayoutScrollScopeKt$animateScrollToItem$2":I
    const-string v10, "Index should be non-negative"

    invoke-static {v10}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 302
    :cond_2
    nop

    .line 118
    .end local v11    # "$i$f$requirePrecondition":I
    nop

    .line 119
    move-object v10, v0

    .line 303
    .local v10, "$this$animateScrollToItem_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    const/4 v11, 0x0

    .line 119
    .local v11, "$i$a$-with-LazyLayoutScrollScopeKt$animateScrollToItem$targetDistancePx$1":I
    :try_start_1
    sget v12, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->TargetDistance:F

    invoke-interface {v10, v12}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v12

    .line 120
    .end local v10    # "$this$animateScrollToItem_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    .end local v11    # "$i$a$-with-LazyLayoutScrollScopeKt$animateScrollToItem$targetDistancePx$1":I
    .restart local v12    # "targetDistancePx":F
    move-object v10, v0

    .line 303
    .local v10, "$this$animateScrollToItem_u24lambda_u242":Landroidx/compose/ui/unit/Density;
    const/4 v11, 0x0

    .line 120
    .local v11, "$i$a$-with-LazyLayoutScrollScopeKt$animateScrollToItem$boundDistancePx$1":I
    sget v13, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->BoundDistance:F

    invoke-interface {v10, v13}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v13

    .line 121
    .end local v10    # "$this$animateScrollToItem_u24lambda_u242":Landroidx/compose/ui/unit/Density;
    .end local v11    # "$i$a$-with-LazyLayoutScrollScopeKt$animateScrollToItem$boundDistancePx$1":I
    .local v13, "boundDistancePx":F
    nop

    .line 303
    .local v0, "$this$animateScrollToItem_u24lambda_u243":Landroidx/compose/ui/unit/Density;
    const/4 v10, 0x0

    .line 121
    .local v10, "$i$a$-with-LazyLayoutScrollScopeKt$animateScrollToItem$minDistancePx$1":I
    sget v11, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->MinimumDistance:F

    invoke-interface {v0, v11}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v11

    .line 122
    .end local v0    # "$this$animateScrollToItem_u24lambda_u243":Landroidx/compose/ui/unit/Density;
    .end local v10    # "$i$a$-with-LazyLayoutScrollScopeKt$animateScrollToItem$minDistancePx$1":I
    .local v11, "minDistancePx":F
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .local v0, "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    iput-boolean v9, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 123
    new-instance v10, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v10, "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    const/16 v25, 0x1e

    const/16 v26, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v18 .. v26}, Landroidx/compose/animation/core/AnimationStateKt;->AnimationState$default(FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    move-result-object v14

    iput-object v14, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 125
    invoke-static {v5, v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z

    move-result v14
    :try_end_1
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_1 .. :try_end_1} :catch_9

    if-nez v14, :cond_c

    .line 130
    :try_start_2
    invoke-interface {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    move-result v14

    if-le v7, v14, :cond_3

    move v14, v9

    goto :goto_2

    :cond_3
    const/4 v14, 0x0

    .line 158
    .local v14, "forward":Z
    :goto_2
    new-instance v15, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v15}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .local v15, "loops":Lkotlin/jvm/internal/Ref$IntRef;
    iput v9, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_2
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_2 .. :try_end_2} :catch_7

    move/from16 v28, v6

    move/from16 v27, v8

    move-object v6, v10

    move v10, v11

    move/from16 v25, v13

    move-object/from16 v26, v15

    .line 159
    .end local v8    # "numOfItemsForTeleport":I
    .end local v11    # "minDistancePx":F
    .end local v13    # "boundDistancePx":F
    .end local v15    # "loops":Lkotlin/jvm/internal/Ref$IntRef;
    .end local p5    # "$completion":Lkotlin/coroutines/Continuation;
    .local v1, "$completion":Lkotlin/coroutines/Continuation;
    .local v6, "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v10, "minDistancePx":F
    .local v25, "boundDistancePx":F
    .local v26, "loops":Lkotlin/jvm/internal/Ref$IntRef;
    .local v27, "numOfItemsForTeleport":I
    .local v28, "scrollOffset":I
    :goto_3
    :try_start_3
    iget-boolean v8, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v8, :cond_b

    invoke-interface {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getItemCount()I

    move-result v8

    if-lez v8, :cond_b

    .line 160
    const/4 v8, 0x2

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-static {v5, v7, v13, v8, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->calculateDistanceTo$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILjava/lang/Object;)I

    move-result v15

    add-int v15, v15, v28

    .line 162
    .local v15, "expectedDistance":I
    invoke-static {v15}, Ljava/lang/Math;->abs(I)I

    move-result v8
    :try_end_3
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_3 .. :try_end_3} :catch_6

    int-to-float v8, v8

    cmpg-float v8, v8, v12

    if-gez v8, :cond_5

    .line 163
    int-to-float v8, v15

    :try_start_4
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    .end local v15    # "expectedDistance":I
    invoke-static {v8, v10}, Ljava/lang/Math;->max(FF)F

    move-result v8
    :try_end_4
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_4 .. :try_end_4} :catch_1

    .line 164
    .local v8, "absTargetPx":F
    if-eqz v14, :cond_4

    move/from16 v21, v8

    goto :goto_4

    :cond_4
    neg-float v8, v8

    move/from16 v21, v8

    .end local v8    # "absTargetPx":F
    goto :goto_4

    .line 166
    :cond_5
    if-eqz v14, :cond_6

    move/from16 v21, v12

    goto :goto_4

    :cond_6
    neg-float v8, v12

    move/from16 v21, v8

    .line 162
    :goto_4
    nop

    .line 161
    nop

    .line 169
    .local v21, "target":F
    const/4 v8, 0x0

    .line 304
    .local v8, "$i$f$debugLog":I
    nop

    .line 307
    nop

    .line 175
    .end local v8    # "$i$f$debugLog":I
    :try_start_5
    iget-object v8, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object/from16 v29, v8

    check-cast v29, Landroidx/compose/animation/core/AnimationState;

    const/16 v37, 0x1e

    const/16 v38, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    invoke-static/range {v29 .. v38}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    move-result-object v8

    iput-object v8, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 176
    new-instance v22, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct/range {v22 .. v22}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 177
    .local v22, "prevValue":Lkotlin/jvm/internal/Ref$FloatRef;
    iget-object v8, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/animation/core/AnimationState;

    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v11

    iget-object v13, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v13, Landroidx/compose/animation/core/AnimationState;

    invoke-virtual {v13}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    cmpg-float v13, v13, v16

    if-nez v13, :cond_7

    move v13, v9

    goto :goto_5

    :cond_7
    const/4 v13, 0x0

    :goto_5
    if-nez v13, :cond_8

    move v13, v9

    goto :goto_6

    :cond_8
    const/4 v13, 0x0

    :goto_6
    new-instance v18, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;
    :try_end_5
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_5 .. :try_end_5} :catch_6

    if-eqz v14, :cond_9

    move/from16 v24, v9

    goto :goto_7

    .end local v21    # "target":F
    .end local v22    # "prevValue":Lkotlin/jvm/internal/Ref$FloatRef;
    :cond_9
    const/16 v24, 0x0

    :goto_7
    move-object/from16 v23, v0

    move-object/from16 v19, v5

    move-object/from16 v29, v6

    move/from16 v20, v7

    .end local v0    # "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    .end local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v6    # "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v7    # "index":I
    .local v19, "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .local v20, "index":I
    .restart local v21    # "target":F
    .restart local v22    # "prevValue":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v23, "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    .local v29, "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    :try_start_6
    invoke-direct/range {v18 .. v29}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IFLkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$BooleanRef;ZFLkotlin/jvm/internal/Ref$IntRef;IILkotlin/jvm/internal/Ref$ObjectRef;)V
    :try_end_6
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_6 .. :try_end_6} :catch_5

    move-object/from16 p0, v1

    move-object/from16 p1, v3

    move-object/from16 v15, v19

    move/from16 v3, v20

    move-object/from16 v7, v23

    move/from16 v0, v25

    move-object/from16 v6, v26

    move/from16 v9, v27

    move/from16 v1, v28

    move-object/from16 v5, v29

    .end local v19    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v20    # "index":I
    .end local v21    # "target":F
    .end local v22    # "prevValue":Lkotlin/jvm/internal/Ref$FloatRef;
    .end local v23    # "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    .end local v25    # "boundDistancePx":F
    .end local v26    # "loops":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v27    # "numOfItemsForTeleport":I
    .end local v28    # "scrollOffset":I
    .end local v29    # "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v0, "boundDistancePx":F
    .local v1, "scrollOffset":I
    .local v3, "index":I
    .local v5, "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v6, "loops":Lkotlin/jvm/internal/Ref$IntRef;
    .local v7, "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    .local v9, "numOfItemsForTeleport":I
    .local v15, "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .local p0, "$completion":Lkotlin/coroutines/Continuation;
    .local p1, "$result":Ljava/lang/Object;
    :try_start_7
    move-object/from16 v22, v18

    check-cast v22, Lkotlin/jvm/functions/Function1;

    iput-object v15, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$1:Ljava/lang/Object;

    iput-object v5, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$2:Ljava/lang/Object;

    iput-object v6, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$3:Ljava/lang/Object;

    iput v3, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    iput v1, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    iput v9, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$2:I

    iput v12, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$0:F

    iput v0, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$1:F

    iput v10, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$2:F

    iput v14, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$3:I
    :try_end_7
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_7 .. :try_end_7} :catch_4

    move/from16 v28, v1

    const/4 v1, 0x1

    .end local v1    # "scrollOffset":I
    .restart local v28    # "scrollOffset":I
    :try_start_8
    iput v1, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I
    :try_end_8
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_8 .. :try_end_8} :catch_3

    const/16 v20, 0x0

    const/16 v24, 0x2

    const/16 v25, 0x0

    move-object/from16 v23, v2

    move-object/from16 v18, v8

    move-object/from16 v19, v11

    move/from16 v21, v13

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v23, "$continuation":Lkotlin/coroutines/Continuation;
    :try_start_9
    invoke-static/range {v18 .. v25}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo$default(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_9
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_9 .. :try_end_9} :catch_2

    if-ne v1, v4, :cond_a

    .line 110
    return-object v4

    .line 177
    :cond_a
    move-object/from16 v1, p0

    move/from16 v25, v0

    move-object v8, v6

    move-object v0, v7

    move/from16 v27, v9

    move-object/from16 v2, v23

    move v7, v3

    move-object v6, v5

    move-object v5, v15

    move-object/from16 v3, p1

    .line 255
    .end local v9    # "numOfItemsForTeleport":I
    .end local v15    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local p0    # "$completion":Lkotlin/coroutines/Continuation;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    .local v1, "$completion":Lkotlin/coroutines/Continuation;
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v3, "$result":Ljava/lang/Object;
    .local v5, "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .local v6, "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v7, "index":I
    .local v8, "loops":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v25    # "boundDistancePx":F
    .restart local v27    # "numOfItemsForTeleport":I
    :goto_8
    :try_start_a
    iget v9, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/16 v26, 0x1

    add-int/lit8 v9, v9, 0x1

    iput v9, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_a
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_a .. :try_end_a} :catch_1

    move-object/from16 v26, v8

    const/4 v9, 0x1

    goto/16 :goto_3

    .line 257
    .end local v0    # "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    .end local v6    # "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v8    # "loops":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v10    # "minDistancePx":F
    .end local v12    # "targetDistancePx":F
    .end local v14    # "forward":Z
    .end local v25    # "boundDistancePx":F
    .end local v27    # "numOfItemsForTeleport":I
    :catch_1
    move-exception v0

    move-object v15, v5

    move/from16 v6, v28

    const/4 v13, 0x0

    move-object v5, v4

    move v4, v7

    goto/16 :goto_9

    .end local v1    # "$completion":Lkotlin/coroutines/Continuation;
    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v7    # "index":I
    .local v3, "index":I
    .restart local v15    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .restart local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local p0    # "$completion":Lkotlin/coroutines/Continuation;
    .restart local p1    # "$result":Ljava/lang/Object;
    :catch_2
    move-exception v0

    move-object/from16 v1, p0

    move-object v5, v4

    move-object/from16 v2, v23

    move/from16 v6, v28

    const/4 v13, 0x0

    move v4, v3

    move-object/from16 v3, p1

    goto/16 :goto_9

    .end local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    :catch_3
    move-exception v0

    move-object/from16 v23, v2

    move-object/from16 v1, p0

    move-object v5, v4

    move/from16 v6, v28

    const/4 v13, 0x0

    move v4, v3

    move-object/from16 v3, p1

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    goto/16 :goto_9

    .end local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v28    # "scrollOffset":I
    .local v1, "scrollOffset":I
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    :catch_4
    move-exception v0

    move/from16 v28, v1

    move-object/from16 v23, v2

    move-object/from16 v1, p0

    move-object v5, v4

    move/from16 v6, v28

    const/4 v13, 0x0

    move v4, v3

    move-object/from16 v3, p1

    .end local v1    # "scrollOffset":I
    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v28    # "scrollOffset":I
    goto/16 :goto_9

    .end local v15    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local p0    # "$completion":Lkotlin/coroutines/Continuation;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$completion":Lkotlin/coroutines/Continuation;
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v3, "$result":Ljava/lang/Object;
    .restart local v19    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .restart local v20    # "index":I
    :catch_5
    move-exception v0

    move-object/from16 p0, v1

    move-object/from16 v23, v2

    move-object/from16 p1, v3

    move-object/from16 v15, v19

    move/from16 v3, v20

    move-object v5, v4

    move/from16 v6, v28

    const/4 v13, 0x0

    move v4, v3

    move-object/from16 v3, p1

    .end local v1    # "$completion":Lkotlin/coroutines/Continuation;
    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v19    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v20    # "index":I
    .local v3, "index":I
    .restart local v15    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .restart local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local p0    # "$completion":Lkotlin/coroutines/Continuation;
    .restart local p1    # "$result":Ljava/lang/Object;
    goto/16 :goto_9

    .line 159
    .end local v15    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local p0    # "$completion":Lkotlin/coroutines/Continuation;
    .end local p1    # "$result":Ljava/lang/Object;
    .restart local v0    # "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    .restart local v1    # "$completion":Lkotlin/coroutines/Continuation;
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v3, "$result":Ljava/lang/Object;
    .restart local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .restart local v6    # "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v7    # "index":I
    .restart local v10    # "minDistancePx":F
    .restart local v12    # "targetDistancePx":F
    .restart local v14    # "forward":Z
    .restart local v25    # "boundDistancePx":F
    .restart local v26    # "loops":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v27    # "numOfItemsForTeleport":I
    :cond_b
    move-object/from16 p0, v1

    move-object/from16 v23, v2

    move-object/from16 p1, v3

    move-object v15, v5

    move-object v5, v6

    move v3, v7

    move-object/from16 v6, v26

    move/from16 v9, v27

    move-object v7, v0

    move/from16 v0, v25

    .line 296
    .end local v0    # "loop":Lkotlin/jvm/internal/Ref$BooleanRef;
    .end local v1    # "$completion":Lkotlin/coroutines/Continuation;
    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v3    # "$result":Ljava/lang/Object;
    .end local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v6    # "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v7    # "index":I
    .end local v10    # "minDistancePx":F
    .end local v12    # "targetDistancePx":F
    .end local v14    # "forward":Z
    .end local v25    # "boundDistancePx":F
    .end local v26    # "loops":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v27    # "numOfItemsForTeleport":I
    .end local v28    # "scrollOffset":I
    .restart local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local p0    # "$completion":Lkotlin/coroutines/Continuation;
    .restart local p1    # "$result":Ljava/lang/Object;
    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v2, v23

    goto/16 :goto_c

    .line 257
    .end local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local p0    # "$completion":Lkotlin/coroutines/Continuation;
    .end local p1    # "$result":Ljava/lang/Object;
    .restart local v1    # "$completion":Lkotlin/coroutines/Continuation;
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v3    # "$result":Ljava/lang/Object;
    .restart local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .restart local v7    # "index":I
    .restart local v28    # "scrollOffset":I
    :catch_6
    move-exception v0

    move-object/from16 p0, v1

    move-object/from16 v23, v2

    move-object/from16 p1, v3

    move-object v15, v5

    move v3, v7

    move-object v5, v4

    move/from16 v6, v28

    const/4 v13, 0x0

    move v4, v3

    move-object/from16 v3, p1

    .end local v1    # "$completion":Lkotlin/coroutines/Continuation;
    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v7    # "index":I
    .local v3, "index":I
    .restart local v15    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .restart local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local p0    # "$completion":Lkotlin/coroutines/Continuation;
    .restart local p1    # "$result":Ljava/lang/Object;
    goto :goto_9

    .end local v15    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v23    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v28    # "scrollOffset":I
    .end local p0    # "$completion":Lkotlin/coroutines/Continuation;
    .end local p1    # "$result":Ljava/lang/Object;
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v3, "$result":Ljava/lang/Object;
    .restart local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .local v6, "scrollOffset":I
    .restart local v7    # "index":I
    .restart local p5    # "$completion":Lkotlin/coroutines/Continuation;
    :catch_7
    move-exception v0

    move-object v15, v5

    const/4 v13, 0x0

    move-object v5, v4

    move v4, v7

    goto :goto_9

    .line 126
    .local v10, "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    :cond_c
    const/4 v8, 0x2

    const/4 v11, 0x0

    const/4 v13, 0x0

    :try_start_b
    invoke-static {v5, v7, v13, v8, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->calculateDistanceTo$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILjava/lang/Object;)I

    move-result v0

    .line 128
    .local v0, "targetItemInitialOffset":I
    new-instance v8, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;

    iget-object v9, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v9, Landroidx/compose/animation/core/AnimationState;

    invoke-direct {v8, v0, v9}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;-><init>(ILandroidx/compose/animation/core/AnimationState;)V

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v3    # "$result":Ljava/lang/Object;
    .end local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v6    # "scrollOffset":I
    .end local v7    # "index":I
    .end local p5    # "$completion":Lkotlin/coroutines/Continuation;
    throw v8
    :try_end_b
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_b .. :try_end_b} :catch_8

    .line 257
    .end local v0    # "targetItemInitialOffset":I
    .end local v10    # "anim":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v3    # "$result":Ljava/lang/Object;
    .restart local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .restart local v6    # "scrollOffset":I
    .restart local v7    # "index":I
    .restart local p5    # "$completion":Lkotlin/coroutines/Continuation;
    :catch_8
    move-exception v0

    move-object v15, v5

    move-object v5, v4

    move v4, v7

    goto :goto_9

    :catch_9
    move-exception v0

    const/4 v13, 0x0

    move-object v15, v5

    move-object v5, v4

    move v4, v7

    .line 260
    .end local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v7    # "index":I
    .end local p5    # "$completion":Lkotlin/coroutines/Continuation;
    .local v0, "itemFound":Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;
    .restart local v1    # "$completion":Lkotlin/coroutines/Continuation;
    .restart local v4    # "index":I
    .restart local v15    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    :goto_9
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->getPreviousAnimation()Landroidx/compose/animation/core/AnimationState;

    move-result-object v27

    const/16 v35, 0x1e

    const/16 v36, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    invoke-static/range {v27 .. v36}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    move-result-object v17

    .line 261
    .local v17, "anim":Landroidx/compose/animation/core/AnimationState;
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->getItemOffset()I

    move-result v7

    add-int/2addr v7, v6

    int-to-float v0, v7

    .line 262
    .local v0, "target":F
    new-instance v7, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 263
    .local v7, "prevValue":Lkotlin/jvm/internal/Ref$FloatRef;
    const/4 v8, 0x0

    .line 308
    .local v8, "$i$f$debugLog":I
    nop

    .line 311
    nop

    .line 264
    .end local v8    # "$i$f$debugLog":I
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v18

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    cmpg-float v8, v8, v16

    if-nez v8, :cond_d

    const/4 v8, 0x1

    goto :goto_a

    :cond_d
    move v8, v13

    .end local v17    # "anim":Landroidx/compose/animation/core/AnimationState;
    :goto_a
    const/16 v26, 0x1

    xor-int/lit8 v20, v8, 0x1

    new-instance v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;

    invoke-direct {v8, v0, v7, v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;-><init>(FLkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;)V

    move-object/from16 v21, v8

    check-cast v21, Lkotlin/jvm/functions/Function1;

    iput-object v15, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$1:Ljava/lang/Object;

    iput-object v11, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$2:Ljava/lang/Object;

    iput-object v11, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$3:Ljava/lang/Object;

    iput v4, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    iput v6, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    const/4 v8, 0x2

    iput v8, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    const/16 v19, 0x0

    const/16 v23, 0x2

    const/16 v24, 0x0

    move-object/from16 v22, v2

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v17    # "anim":Landroidx/compose/animation/core/AnimationState;
    .local v22, "$continuation":Lkotlin/coroutines/Continuation;
    invoke-static/range {v17 .. v24}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo$default(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "target":F
    .end local v7    # "prevValue":Lkotlin/jvm/internal/Ref$FloatRef;
    .end local v17    # "anim":Landroidx/compose/animation/core/AnimationState;
    if-ne v0, v5, :cond_e

    .line 110
    return-object v5

    .line 264
    :cond_e
    move v0, v6

    move-object v5, v15

    move-object/from16 v2, v22

    .line 294
    .end local v6    # "scrollOffset":I
    .end local v15    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .end local v22    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v0, "scrollOffset":I
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    :goto_b
    invoke-interface {v5, v4, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->snapToItem(II)V

    .line 296
    .end local v0    # "scrollOffset":I
    .end local v4    # "index":I
    .end local v5    # "$this$animateScrollToItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    :goto_c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final animateScrollToItem$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;II)Z
    .locals 3
    .param p0, "forward"    # Z
    .param p1, "$this_animateScrollToItem"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .param p2, "$index"    # I
    .param p3, "$scrollOffset"    # I

    .line 135
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_2

    .line 136
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    move-result v2

    if-le v2, p2, :cond_0

    .line 137
    move v0, v1

    goto :goto_0

    .line 139
    :cond_0
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    move-result v2

    if-ne v2, p2, :cond_1

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemScrollOffset()I

    move-result v2

    if-le v2, p3, :cond_1

    .line 141
    move v0, v1

    goto :goto_0

    .line 143
    :cond_1
    goto :goto_0

    .line 146
    :cond_2
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    move-result v2

    if-ge v2, p2, :cond_3

    .line 147
    move v0, v1

    goto :goto_0

    .line 149
    :cond_3
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    move-result v2

    if-ne v2, p2, :cond_4

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemScrollOffset()I

    move-result v2

    if-ge v2, p3, :cond_4

    .line 151
    move v0, v1

    goto :goto_0

    .line 153
    :cond_4
    nop

    .line 135
    :goto_0
    return v0
.end method

.method private static final debugLog(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p0, "generateMsg"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 42
    .local v0, "$i$f$debugLog":I
    nop

    .line 45
    return-void
.end method

.method public static final isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z
    .locals 3
    .param p0, "$this$isItemVisible"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;
    .param p1, "index"    # I

    .line 98
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    move-result v0

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getLastVisibleItemIndex()I

    move-result v1

    const/4 v2, 0x0

    if-gt p1, v1, :cond_0

    if-gt v0, p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method
