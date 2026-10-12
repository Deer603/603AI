.class final Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "PagerMeasurePolicy.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerMeasurePolicyKt;->rememberPagerMeasurePolicy-8u0NR3k(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/foundation/pager/PagerMeasureResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,223:1\n32#2:224\n32#2:226\n80#3:225\n80#3:227\n602#4,8:228\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n*L\n126#1:224\n133#1:226\n126#1:225\n133#1:227\n166#1:228,8\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/foundation/pager/PagerMeasureResult;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "containerConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "invoke-0kLqBqw",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/pager/PagerMeasureResult;"
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
.field final synthetic $beyondViewportPageCount:I

.field final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

.field final synthetic $itemProviderLambda:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $orientation:Landroidx/compose/foundation/gestures/Orientation;

.field final synthetic $pageCount:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pageSize:Landroidx/compose/foundation/pager/PageSize;

.field final synthetic $pageSpacing:F

.field final synthetic $reverseLayout:Z

.field final synthetic $snapPosition:Landroidx/compose/foundation/gestures/snapping/SnapPosition;

.field final synthetic $state:Landroidx/compose/foundation/pager/PagerState;

.field final synthetic $verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/pager/PageSize;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZF",
            "Landroidx/compose/foundation/pager/PageSize;",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "I",
            "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
            "Lkotlinx/coroutines/CoroutineScope;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    iput-object p2, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iput-object p3, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-boolean p4, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    iput p5, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageSpacing:F

    iput-object p6, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageSize:Landroidx/compose/foundation/pager/PageSize;

    iput-object p7, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$itemProviderLambda:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageCount:Lkotlin/jvm/functions/Function0;

    iput-object p9, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    iput-object p10, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iput p11, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$beyondViewportPageCount:I

    iput-object p12, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$snapPosition:Landroidx/compose/foundation/gestures/snapping/SnapPosition;

    iput-object p13, p0, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 72
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    move-object v1, p2

    check-cast v1, Landroidx/compose/ui/unit/Constraints;

    invoke-virtual {v1}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/pager/PagerMeasureResult;

    move-result-object v0

    return-object v0
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/pager/PagerMeasureResult;
    .locals 46
    .param p1, "$this$null"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p2, "containerConstraints"    # J

    .line 73
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v4, p2

    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getMeasurementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->attachToScope-impl(Landroidx/compose/runtime/MutableState;)V

    .line 74
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move/from16 v26, v0

    .line 76
    .local v26, "isVertical":Z
    nop

    .line 77
    if-eqz v26, :cond_1

    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_1

    :cond_1
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 75
    :goto_1
    invoke-static {v4, v5, v0}, Landroidx/compose/foundation/CheckScrollableContainerConstraintsKt;->checkScrollableContainerConstraints-K40F9xA(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 82
    nop

    .line 86
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 82
    if-eqz v26, :cond_2

    .line 83
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v3

    invoke-interface {v0, v3}, Landroidx/compose/foundation/layout/PaddingValues;->calculateLeftPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v2, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    goto :goto_2

    .line 86
    :cond_2
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/PaddingKt;->calculateStartPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v2, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 82
    :goto_2
    nop

    .line 81
    move v8, v0

    .line 90
    .local v8, "startPadding":I
    nop

    .line 94
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 90
    if-eqz v26, :cond_3

    .line 91
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v3

    invoke-interface {v0, v3}, Landroidx/compose/foundation/layout/PaddingValues;->calculateRightPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v2, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    goto :goto_3

    .line 94
    :cond_3
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/PaddingKt;->calculateEndPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v2, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 90
    :goto_3
    nop

    .line 89
    move/from16 v27, v0

    .line 96
    .local v27, "endPadding":I
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    move-result v0

    invoke-interface {v2, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v9

    .line 97
    .local v9, "topPadding":I
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    move-result v0

    invoke-interface {v2, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v28

    .line 98
    .local v28, "bottomPadding":I
    add-int v7, v9, v28

    .line 99
    .local v7, "totalVerticalPadding":I
    add-int v3, v8, v27

    .line 101
    .local v3, "totalHorizontalPadding":I
    if-eqz v26, :cond_4

    move v0, v7

    goto :goto_4

    :cond_4
    move v0, v3

    .line 100
    :goto_4
    move/from16 v29, v0

    .line 103
    .local v29, "totalMainAxisPadding":I
    nop

    .line 104
    if-eqz v26, :cond_5

    iget-boolean v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    if-nez v0, :cond_5

    move v0, v9

    goto :goto_5

    .line 105
    :cond_5
    if-eqz v26, :cond_6

    iget-boolean v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    if-eqz v0, :cond_6

    move/from16 v0, v28

    goto :goto_5

    .line 106
    :cond_6
    if-nez v26, :cond_7

    iget-boolean v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    if-nez v0, :cond_7

    move v0, v8

    goto :goto_5

    .line 107
    :cond_7
    move/from16 v0, v27

    .line 103
    :goto_5
    nop

    .line 102
    move v14, v0

    .line 109
    .local v14, "beforeContentPadding":I
    sub-int v15, v29, v14

    .line 111
    .local v15, "afterContentPadding":I
    neg-int v0, v3

    neg-int v10, v7

    invoke-static {v4, v5, v0, v10}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v11

    .line 110
    move-wide/from16 v19, v11

    .line 113
    .local v19, "contentConstraints":J
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    move-object v10, v2

    check-cast v10, Landroidx/compose/ui/unit/Density;

    invoke-virtual {v0, v10}, Landroidx/compose/foundation/pager/PagerState;->setDensity$foundation_release(Landroidx/compose/ui/unit/Density;)V

    .line 115
    iget v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageSpacing:F

    invoke-interface {v2, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v13

    .line 119
    .local v13, "spaceBetweenPages":I
    if-eqz v26, :cond_8

    .line 120
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v0

    sub-int/2addr v0, v7

    goto :goto_6

    .line 122
    :cond_8
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v0

    sub-int/2addr v0, v3

    .line 119
    :goto_6
    nop

    .line 118
    move v10, v0

    .line 125
    .local v10, "mainAxisAvailableSize":I
    iget-boolean v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    const/16 v16, 0x20

    if-eqz v0, :cond_c

    if-lez v10, :cond_9

    move/from16 v25, v3

    const-wide v22, 0xffffffffL

    goto :goto_9

    .line 134
    :cond_9
    if-eqz v26, :cond_a

    move v0, v8

    goto :goto_7

    :cond_a
    add-int v0, v8, v10

    .line 135
    :goto_7
    if-eqz v26, :cond_b

    add-int v17, v9, v10

    goto :goto_8

    :cond_b
    move/from16 v17, v9

    .line 133
    :goto_8
    move/from16 v18, v17

    .local v0, "x$iv":I
    .local v18, "y$iv":I
    const/16 v17, 0x0

    .line 226
    .local v17, "$i$f$IntOffset":I
    const/16 v21, 0x0

    .line 227
    .local v21, "$i$f$packInts":I
    const-wide v22, 0xffffffffL

    int-to-long v11, v0

    shl-long v11, v11, v16

    move/from16 v25, v3

    move/from16 v6, v18

    .end local v3    # "totalHorizontalPadding":I
    .end local v18    # "y$iv":I
    .local v6, "y$iv":I
    .local v25, "totalHorizontalPadding":I
    int-to-long v2, v6

    and-long v2, v2, v22

    or-long/2addr v2, v11

    .line 226
    .end local v21    # "$i$f$packInts":I
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v2

    move-wide/from16 v17, v2

    goto :goto_a

    .line 125
    .end local v0    # "x$iv":I
    .end local v6    # "y$iv":I
    .end local v17    # "$i$f$IntOffset":I
    .end local v25    # "totalHorizontalPadding":I
    .restart local v3    # "totalHorizontalPadding":I
    :cond_c
    move/from16 v25, v3

    const-wide v22, 0xffffffffL

    .line 126
    .end local v3    # "totalHorizontalPadding":I
    .restart local v25    # "totalHorizontalPadding":I
    :goto_9
    const/4 v0, 0x0

    .line 224
    .local v0, "$i$f$IntOffset":I
    const/4 v2, 0x0

    .line 225
    .local v2, "$i$f$packInts":I
    int-to-long v11, v8

    shl-long v11, v11, v16

    move v6, v2

    .end local v2    # "$i$f$packInts":I
    .local v6, "$i$f$packInts":I
    int-to-long v2, v9

    and-long v2, v2, v22

    or-long/2addr v2, v11

    .line 224
    .end local v6    # "$i$f$packInts":I
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v2

    move-wide/from16 v17, v2

    .line 125
    .end local v0    # "$i$f$IntOffset":I
    :goto_a
    nop

    .line 124
    move-wide/from16 v21, v17

    .line 140
    .local v21, "visualItemOffset":J
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageSize:Landroidx/compose/foundation/pager/PageSize;

    .local v0, "$this$invoke_0kLqBqw_u24lambda_u240":Landroidx/compose/foundation/pager/PageSize;
    const/4 v2, 0x0

    .line 141
    .local v2, "$i$a$-with-PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$pageAvailableSize$1":I
    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/ui/unit/Density;

    invoke-interface {v0, v3, v10, v13}, Landroidx/compose/foundation/pager/PageSize;->calculateMainAxisPageSize(Landroidx/compose/ui/unit/Density;II)I

    move-result v3

    .line 142
    const/4 v6, 0x0

    invoke-static {v3, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v12

    .line 140
    .end local v0    # "$this$invoke_0kLqBqw_u24lambda_u240":Landroidx/compose/foundation/pager/PageSize;
    .end local v2    # "$i$a$-with-PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$pageAvailableSize$1":I
    nop

    .line 139
    nop

    .line 145
    .local v12, "pageAvailableSize":I
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    .line 146
    nop

    .line 148
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v2, v3, :cond_d

    .line 149
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    move/from16 v31, v2

    goto :goto_b

    .line 151
    :cond_d
    move/from16 v31, v12

    .line 146
    :goto_b
    nop

    .line 154
    iget-object v2, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-eq v2, v3, :cond_e

    .line 155
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v2

    move/from16 v33, v2

    goto :goto_c

    .line 157
    :cond_e
    move/from16 v33, v12

    .line 146
    :goto_c
    const/16 v34, 0x5

    const/16 v35, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    invoke-static/range {v30 .. v35}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v2

    .line 145
    invoke-virtual {v0, v2, v3}, Landroidx/compose/foundation/pager/PagerState;->setPremeasureConstraints-BRTryo0$foundation_release(J)V

    .line 160
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$itemProviderLambda:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;

    .line 162
    .local v2, "itemProvider":Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    const/4 v3, 0x0

    .line 163
    .local v3, "currentPage":I
    const/4 v6, 0x0

    .line 164
    .local v6, "currentPageOffset":I
    add-int v0, v10, v14

    add-int v11, v0, v15

    .line 166
    .local v11, "layoutSize":I
    move/from16 v16, v3

    .end local v3    # "currentPage":I
    .local v16, "currentPage":I
    sget-object v3, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .local v3, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    move/from16 v17, v10

    .end local v10    # "mainAxisAvailableSize":I
    .local v17, "mainAxisAvailableSize":I
    iget-object v10, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$snapPosition:Landroidx/compose/foundation/gestures/snapping/SnapPosition;

    const/16 v23, 0x0

    .line 228
    .local v23, "$i$f$withoutReadObservation":I
    nop

    .line 229
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v4

    .line 230
    .local v4, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v4, :cond_f

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    goto :goto_d

    :cond_f
    const/4 v5, 0x0

    .line 231
    .local v5, "observer$iv":Lkotlin/jvm/functions/Function1;
    :goto_d
    move/from16 v24, v6

    .end local v6    # "currentPageOffset":I
    .local v24, "currentPageOffset":I
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v6

    .line 232
    .local v6, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 233
    const/16 v30, 0x0

    .line 167
    .local v30, "$i$a$-withoutReadObservation-PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$1":I
    move/from16 v31, v7

    .end local v7    # "totalVerticalPadding":I
    .local v31, "totalVerticalPadding":I
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    move-result v7

    invoke-virtual {v0, v2, v7}, Landroidx/compose/foundation/pager/PagerState;->matchScrollPositionWithKey$foundation_release(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    move/from16 v32, v7

    .line 168
    .end local v16    # "currentPage":I
    .local v32, "currentPage":I
    nop

    .line 169
    nop

    .line 170
    nop

    .line 171
    nop

    .line 172
    nop

    .line 173
    nop

    .line 174
    nop

    .line 175
    :try_start_1
    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    move-result v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 176
    move/from16 v7, v17

    .end local v17    # "mainAxisAvailableSize":I
    .local v7, "mainAxisAvailableSize":I
    :try_start_2
    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPageOffsetFraction()F

    move-result v17

    .line 177
    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    move-result v18
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 169
    move/from16 v33, v7

    .end local v7    # "mainAxisAvailableSize":I
    .local v33, "mainAxisAvailableSize":I
    :try_start_3
    invoke-static/range {v10 .. v18}, Landroidx/compose/foundation/pager/PagerKt;->currentPageOffset(Landroidx/compose/foundation/gestures/snapping/SnapPosition;IIIIIIFI)I

    move-result v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move/from16 v34, v11

    .line 168
    .end local v11    # "layoutSize":I
    .local v34, "layoutSize":I
    nop

    .line 179
    .end local v24    # "currentPageOffset":I
    .local v10, "currentPageOffset":I
    nop

    .end local v30    # "$i$a$-withoutReadObservation-PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$1":I
    :try_start_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 233
    nop

    .line 235
    invoke-virtual {v3, v4, v6, v5}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    .line 233
    nop

    .line 182
    .end local v3    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v4    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v5    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v6    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v23    # "$i$f$withoutReadObservation":I
    move-object v0, v2

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;

    .line 183
    iget-object v3, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getPinnedPages$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    move-result-object v3

    .line 184
    iget-object v4, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v4}, Landroidx/compose/foundation/pager/PagerState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    move-result-object v4

    .line 182
    invoke-static {v0, v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt;->calculateLazyLayoutPinnedIndices(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;)Ljava/util/List;

    move-result-object v0

    .line 181
    nop

    .line 193
    .local v0, "pinnedPages":Ljava/util/List;
    iget-object v3, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$pageCount:Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v11

    .line 208
    iget-object v3, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getPlacementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;

    move-result-object v23

    .line 189
    nop

    .line 193
    nop

    .line 204
    nop

    .line 195
    nop

    .line 190
    nop

    .line 191
    nop

    .line 194
    nop

    .line 200
    nop

    .line 201
    nop

    .line 192
    nop

    .line 199
    move/from16 v16, v8

    move v8, v13

    .end local v13    # "spaceBetweenPages":I
    .local v8, "spaceBetweenPages":I
    .local v16, "startPadding":I
    iget-object v13, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 203
    move/from16 v17, v14

    .end local v14    # "beforeContentPadding":I
    .local v17, "beforeContentPadding":I
    iget-object v14, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    .line 202
    move/from16 v18, v15

    .end local v15    # "afterContentPadding":I
    .local v18, "afterContentPadding":I
    iget-object v15, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    .line 205
    iget-boolean v3, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$reverseLayout:Z

    .line 196
    nop

    .line 197
    nop

    .line 198
    iget v4, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$beyondViewportPageCount:I

    .line 206
    nop

    .line 207
    iget-object v5, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$snapPosition:Landroidx/compose/foundation/gestures/snapping/SnapPosition;

    .line 208
    nop

    .line 209
    iget-object v6, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 189
    move-object v7, v2

    .end local v2    # "itemProvider":Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    .local v7, "itemProvider":Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    new-instance v2, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1;

    move-object/from16 v35, v6

    move-object/from16 v24, v7

    move/from16 v30, v11

    move/from16 v6, v25

    move/from16 v7, v31

    move/from16 v25, v16

    move/from16 v31, v18

    move/from16 v16, v3

    move-object/from16 v3, p1

    move-wide/from16 v44, v19

    move/from16 v20, v4

    move/from16 v19, v12

    move-wide/from16 v11, v44

    move-wide/from16 v44, v21

    move-object/from16 v22, v5

    move-wide/from16 v4, p2

    move/from16 v21, v17

    move-wide/from16 v17, v44

    .end local v12    # "pageAvailableSize":I
    .end local v16    # "startPadding":I
    .end local v18    # "afterContentPadding":I
    .local v6, "totalHorizontalPadding":I
    .local v7, "totalVerticalPadding":I
    .local v11, "contentConstraints":J
    .local v17, "visualItemOffset":J
    .local v19, "pageAvailableSize":I
    .local v21, "beforeContentPadding":I
    .local v24, "itemProvider":Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    .local v25, "startPadding":I
    .local v31, "afterContentPadding":I
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$measureResult$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;JII)V

    move/from16 v37, v6

    move/from16 v36, v7

    .end local v6    # "totalHorizontalPadding":I
    .end local v7    # "totalVerticalPadding":I
    .local v36, "totalVerticalPadding":I
    .local v37, "totalHorizontalPadding":I
    check-cast v2, Lkotlin/jvm/functions/Function3;

    move/from16 v6, v21

    move-object/from16 v4, v24

    move/from16 v3, v30

    move/from16 v7, v31

    move/from16 v5, v33

    move-object/from16 v24, v35

    move-object/from16 v21, v0

    move/from16 v31, v9

    move/from16 v30, v25

    move/from16 v9, v32

    move-object/from16 v25, v2

    move-object/from16 v2, p1

    .end local v0    # "pinnedPages":Ljava/util/List;
    .end local v24    # "itemProvider":Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    .end local v25    # "startPadding":I
    .end local v32    # "currentPage":I
    .end local v33    # "mainAxisAvailableSize":I
    .local v4, "itemProvider":Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    .local v5, "mainAxisAvailableSize":I
    .local v6, "beforeContentPadding":I
    .local v7, "afterContentPadding":I
    .local v9, "currentPage":I
    .local v21, "pinnedPages":Ljava/util/List;
    .local v30, "startPadding":I
    .local v31, "topPadding":I
    invoke-static/range {v2 .. v25}, Landroidx/compose/foundation/pager/PagerMeasureKt;->measurePager-bmk8ZPk(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;

    move-result-object v0

    .line 188
    move-object v2, v4

    move v14, v6

    move v15, v7

    move v13, v8

    move-wide/from16 v7, v17

    move/from16 v17, v5

    .end local v4    # "itemProvider":Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    .end local v5    # "mainAxisAvailableSize":I
    .end local v6    # "beforeContentPadding":I
    .end local v8    # "spaceBetweenPages":I
    .restart local v2    # "itemProvider":Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    .local v7, "visualItemOffset":J
    .restart local v13    # "spaceBetweenPages":I
    .restart local v14    # "beforeContentPadding":I
    .restart local v15    # "afterContentPadding":I
    .local v17, "mainAxisAvailableSize":I
    move-object/from16 v39, v0

    .line 219
    .local v39, "measureResult":Landroidx/compose/foundation/pager/PagerMeasureResult;
    iget-object v0, v1, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/pager/PagerState;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->isLookingAhead()Z

    move-result v40

    const/16 v42, 0x4

    const/16 v43, 0x0

    const/16 v41, 0x0

    move-object/from16 v38, v0

    invoke-static/range {v38 .. v43}, Landroidx/compose/foundation/pager/PagerState;->applyMeasureResult$foundation_release$default(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerMeasureResult;ZZILjava/lang/Object;)V

    .line 220
    return-object v39

    .line 235
    .end local v7    # "visualItemOffset":J
    .end local v11    # "contentConstraints":J
    .end local v17    # "mainAxisAvailableSize":I
    .end local v30    # "startPadding":I
    .end local v36    # "totalVerticalPadding":I
    .end local v37    # "totalHorizontalPadding":I
    .end local v39    # "measureResult":Landroidx/compose/foundation/pager/PagerMeasureResult;
    .restart local v3    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .local v4, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .local v5, "observer$iv":Lkotlin/jvm/functions/Function1;
    .local v6, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .local v8, "startPadding":I
    .local v9, "topPadding":I
    .restart local v12    # "pageAvailableSize":I
    .local v19, "contentConstraints":J
    .local v21, "visualItemOffset":J
    .restart local v23    # "$i$f$withoutReadObservation":I
    .local v25, "totalHorizontalPadding":I
    .local v31, "totalVerticalPadding":I
    .restart local v32    # "currentPage":I
    .restart local v33    # "mainAxisAvailableSize":I
    :catchall_0
    move-exception v0

    move-wide/from16 v36, v19

    move/from16 v19, v12

    move-wide/from16 v11, v36

    move/from16 v30, v8

    move-wide/from16 v7, v21

    move/from16 v37, v25

    move/from16 v36, v31

    move/from16 v17, v33

    move/from16 v31, v9

    move/from16 v9, v32

    move/from16 v24, v10

    .end local v8    # "startPadding":I
    .end local v12    # "pageAvailableSize":I
    .end local v21    # "visualItemOffset":J
    .end local v25    # "totalHorizontalPadding":I
    .end local v32    # "currentPage":I
    .end local v33    # "mainAxisAvailableSize":I
    .restart local v7    # "visualItemOffset":J
    .local v9, "currentPage":I
    .restart local v11    # "contentConstraints":J
    .restart local v17    # "mainAxisAvailableSize":I
    .local v19, "pageAvailableSize":I
    .restart local v30    # "startPadding":I
    .local v31, "topPadding":I
    .restart local v36    # "totalVerticalPadding":I
    .restart local v37    # "totalHorizontalPadding":I
    goto/16 :goto_e

    .end local v7    # "visualItemOffset":J
    .end local v10    # "currentPageOffset":I
    .end local v17    # "mainAxisAvailableSize":I
    .end local v30    # "startPadding":I
    .end local v34    # "layoutSize":I
    .end local v36    # "totalVerticalPadding":I
    .end local v37    # "totalHorizontalPadding":I
    .restart local v8    # "startPadding":I
    .local v9, "topPadding":I
    .local v11, "layoutSize":I
    .restart local v12    # "pageAvailableSize":I
    .local v19, "contentConstraints":J
    .restart local v21    # "visualItemOffset":J
    .local v24, "currentPageOffset":I
    .restart local v25    # "totalHorizontalPadding":I
    .local v31, "totalVerticalPadding":I
    .restart local v32    # "currentPage":I
    .restart local v33    # "mainAxisAvailableSize":I
    :catchall_1
    move-exception v0

    move/from16 v30, v8

    move/from16 v34, v11

    move-wide/from16 v7, v21

    move/from16 v37, v25

    move/from16 v36, v31

    move/from16 v17, v33

    move/from16 v31, v9

    move/from16 v9, v32

    move-wide/from16 v44, v19

    move/from16 v19, v12

    move-wide/from16 v11, v44

    .end local v8    # "startPadding":I
    .end local v12    # "pageAvailableSize":I
    .end local v21    # "visualItemOffset":J
    .end local v25    # "totalHorizontalPadding":I
    .end local v32    # "currentPage":I
    .end local v33    # "mainAxisAvailableSize":I
    .restart local v7    # "visualItemOffset":J
    .local v9, "currentPage":I
    .local v11, "contentConstraints":J
    .restart local v17    # "mainAxisAvailableSize":I
    .local v19, "pageAvailableSize":I
    .restart local v30    # "startPadding":I
    .local v31, "topPadding":I
    .restart local v34    # "layoutSize":I
    .restart local v36    # "totalVerticalPadding":I
    .restart local v37    # "totalHorizontalPadding":I
    goto :goto_e

    .end local v17    # "mainAxisAvailableSize":I
    .end local v30    # "startPadding":I
    .end local v34    # "layoutSize":I
    .end local v36    # "totalVerticalPadding":I
    .end local v37    # "totalHorizontalPadding":I
    .local v7, "mainAxisAvailableSize":I
    .restart local v8    # "startPadding":I
    .local v9, "topPadding":I
    .local v11, "layoutSize":I
    .restart local v12    # "pageAvailableSize":I
    .local v19, "contentConstraints":J
    .restart local v21    # "visualItemOffset":J
    .restart local v25    # "totalHorizontalPadding":I
    .local v31, "totalVerticalPadding":I
    .restart local v32    # "currentPage":I
    :catchall_2
    move-exception v0

    move/from16 v17, v7

    move/from16 v30, v8

    move/from16 v34, v11

    move-wide/from16 v7, v21

    move/from16 v37, v25

    move/from16 v36, v31

    move/from16 v31, v9

    move/from16 v9, v32

    move-wide/from16 v44, v19

    move/from16 v19, v12

    move-wide/from16 v11, v44

    .end local v8    # "startPadding":I
    .end local v12    # "pageAvailableSize":I
    .end local v21    # "visualItemOffset":J
    .end local v25    # "totalHorizontalPadding":I
    .end local v32    # "currentPage":I
    .local v7, "visualItemOffset":J
    .local v9, "currentPage":I
    .local v11, "contentConstraints":J
    .restart local v17    # "mainAxisAvailableSize":I
    .local v19, "pageAvailableSize":I
    .restart local v30    # "startPadding":I
    .local v31, "topPadding":I
    .restart local v34    # "layoutSize":I
    .restart local v36    # "totalVerticalPadding":I
    .restart local v37    # "totalHorizontalPadding":I
    goto :goto_e

    .end local v7    # "visualItemOffset":J
    .end local v30    # "startPadding":I
    .end local v34    # "layoutSize":I
    .end local v36    # "totalVerticalPadding":I
    .end local v37    # "totalHorizontalPadding":I
    .restart local v8    # "startPadding":I
    .local v9, "topPadding":I
    .local v11, "layoutSize":I
    .restart local v12    # "pageAvailableSize":I
    .local v19, "contentConstraints":J
    .restart local v21    # "visualItemOffset":J
    .restart local v25    # "totalHorizontalPadding":I
    .local v31, "totalVerticalPadding":I
    .restart local v32    # "currentPage":I
    :catchall_3
    move-exception v0

    move/from16 v30, v8

    move/from16 v34, v11

    move-wide/from16 v7, v21

    move/from16 v37, v25

    move/from16 v36, v31

    move/from16 v31, v9

    move/from16 v9, v32

    move-wide/from16 v44, v19

    move/from16 v19, v12

    move-wide/from16 v11, v44

    .end local v8    # "startPadding":I
    .end local v12    # "pageAvailableSize":I
    .end local v21    # "visualItemOffset":J
    .end local v25    # "totalHorizontalPadding":I
    .end local v32    # "currentPage":I
    .restart local v7    # "visualItemOffset":J
    .local v9, "currentPage":I
    .local v11, "contentConstraints":J
    .local v19, "pageAvailableSize":I
    .restart local v30    # "startPadding":I
    .local v31, "topPadding":I
    .restart local v34    # "layoutSize":I
    .restart local v36    # "totalVerticalPadding":I
    .restart local v37    # "totalHorizontalPadding":I
    goto :goto_e

    .end local v7    # "visualItemOffset":J
    .end local v30    # "startPadding":I
    .end local v34    # "layoutSize":I
    .end local v36    # "totalVerticalPadding":I
    .end local v37    # "totalHorizontalPadding":I
    .restart local v8    # "startPadding":I
    .local v9, "topPadding":I
    .local v11, "layoutSize":I
    .restart local v12    # "pageAvailableSize":I
    .local v16, "currentPage":I
    .local v19, "contentConstraints":J
    .restart local v21    # "visualItemOffset":J
    .restart local v25    # "totalHorizontalPadding":I
    .local v31, "totalVerticalPadding":I
    :catchall_4
    move-exception v0

    move/from16 v30, v8

    move/from16 v34, v11

    move-wide/from16 v7, v21

    move/from16 v37, v25

    move/from16 v36, v31

    move/from16 v31, v9

    move-wide/from16 v44, v19

    move/from16 v19, v12

    move-wide/from16 v11, v44

    move/from16 v9, v16

    .end local v8    # "startPadding":I
    .end local v12    # "pageAvailableSize":I
    .end local v16    # "currentPage":I
    .end local v21    # "visualItemOffset":J
    .end local v25    # "totalHorizontalPadding":I
    .restart local v7    # "visualItemOffset":J
    .local v9, "currentPage":I
    .local v11, "contentConstraints":J
    .local v19, "pageAvailableSize":I
    .restart local v30    # "startPadding":I
    .local v31, "topPadding":I
    .restart local v34    # "layoutSize":I
    .restart local v36    # "totalVerticalPadding":I
    .restart local v37    # "totalHorizontalPadding":I
    :goto_e
    invoke-virtual {v3, v4, v6, v5}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    throw v0
.end method
