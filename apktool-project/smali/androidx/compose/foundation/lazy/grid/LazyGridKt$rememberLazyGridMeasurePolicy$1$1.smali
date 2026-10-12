.class final Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyGrid.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/grid/LazyGridKt;->rememberLazyGridMeasurePolicy(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;
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
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,422:1\n107#2,7:423\n107#2,7:430\n32#3:437\n32#3:439\n80#4:438\n80#4:440\n602#5,8:441\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n240#1:423,7\n245#1:430,7\n262#1:437\n269#1:439\n262#1:438\n269#1:440\n349#1:441,8\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "containerConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "invoke-0kLqBqw",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;"
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
.field final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $graphicsContext:Landroidx/compose/ui/graphics/GraphicsContext;

.field final synthetic $horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field final synthetic $isVertical:Z

.field final synthetic $itemProviderLambda:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $reverseLayout:Z

.field final synthetic $slots:Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;

.field final synthetic $state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

.field final synthetic $stickyItemsScrollBehavior:Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;

.field final synthetic $verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;ZLandroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Z",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
            ">;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    iput-object p3, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$reverseLayout:Z

    iput-object p5, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$itemProviderLambda:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$slots:Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;

    iput-object p7, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    iput-object p8, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iput-object p9, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iput-object p10, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$graphicsContext:Landroidx/compose/ui/graphics/GraphicsContext;

    iput-object p11, p0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$stickyItemsScrollBehavior:Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 190
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    move-object v1, p2

    check-cast v1, Landroidx/compose/ui/unit/Constraints;

    invoke-virtual {v1}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    move-result-object v0

    return-object v0
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .locals 59
    .param p1, "$this$null"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p2, "containerConstraints"    # J

    .line 191
    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-wide/from16 v13, p2

    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getMeasurementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->attachToScope-impl(Landroidx/compose/runtime/MutableState;)V

    .line 193
    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getHasLookaheadOccurred$foundation_release()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->isLookingAhead()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    move/from16 v22, v0

    .line 195
    .local v22, "isInLookaheadScope":Z
    nop

    .line 196
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_2

    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2

    :cond_2
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 194
    :goto_2
    invoke-static {v13, v14, v0}, Landroidx/compose/foundation/CheckScrollableContainerConstraintsKt;->checkScrollableContainerConstraints-K40F9xA(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 201
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    .line 205
    iget-object v2, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 201
    if-eqz v0, :cond_3

    .line 202
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    invoke-interface {v2, v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateLeftPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    goto :goto_3

    .line 205
    :cond_3
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/PaddingKt;->calculateStartPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 201
    :goto_3
    nop

    .line 200
    move v15, v0

    .line 209
    .local v15, "startPadding":I
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    .line 213
    iget-object v2, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 209
    if-eqz v0, :cond_4

    .line 210
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    invoke-interface {v2, v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateRightPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    goto :goto_4

    .line 213
    :cond_4
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/PaddingKt;->calculateEndPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 209
    :goto_4
    nop

    .line 208
    move/from16 v31, v0

    .line 215
    .local v31, "endPadding":I
    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v2

    .line 216
    .local v2, "topPadding":I
    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v32

    .line 217
    .local v32, "bottomPadding":I
    add-int v4, v2, v32

    .line 218
    .local v4, "totalVerticalPadding":I
    add-int v5, v15, v31

    .line 220
    .local v5, "totalHorizontalPadding":I
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_5

    move v0, v4

    goto :goto_5

    :cond_5
    move v0, v5

    .line 219
    :goto_5
    move/from16 v33, v0

    .line 222
    .local v33, "totalMainAxisPadding":I
    nop

    .line 223
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_6

    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$reverseLayout:Z

    if-nez v0, :cond_6

    move v6, v2

    goto :goto_6

    .line 224
    :cond_6
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_7

    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$reverseLayout:Z

    if-eqz v0, :cond_7

    move/from16 v6, v32

    goto :goto_6

    .line 225
    :cond_7
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    if-nez v0, :cond_8

    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$reverseLayout:Z

    if-nez v0, :cond_8

    move v6, v15

    goto :goto_6

    .line 226
    :cond_8
    move/from16 v6, v31

    .line 222
    :goto_6
    nop

    .line 221
    nop

    .line 228
    .local v6, "beforeContentPadding":I
    sub-int v7, v33, v6

    .line 230
    .local v7, "afterContentPadding":I
    neg-int v0, v5

    neg-int v8, v4

    invoke-static {v13, v14, v0, v8}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v8

    .line 229
    nop

    .line 232
    .local v8, "contentConstraints":J
    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$itemProviderLambda:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;

    .line 233
    .local v10, "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    invoke-interface {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;->getSpanLayoutProvider()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;

    move-result-object v11

    .line 234
    .local v11, "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$slots:Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;

    move-object v12, v3

    check-cast v12, Landroidx/compose/ui/unit/Density;

    invoke-interface {v0, v12, v8, v9}, Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;->invoke-0kLqBqw(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/grid/LazyGridSlots;

    move-result-object v25

    .line 235
    .local v25, "resolvedSlots":Landroidx/compose/foundation/lazy/grid/LazyGridSlots;
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/foundation/lazy/grid/LazyGridSlots;->getSizes()[I

    move-result-object v0

    array-length v12, v0

    .line 236
    .local v12, "slotsPerLine":I
    invoke-virtual {v11, v12}, Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;->setSlotsPerLine(I)V

    .line 239
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_a

    .line 240
    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .local v0, "value$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 423
    .local v16, "$i$f$requirePreconditionNotNull":I
    nop

    .line 425
    if-eqz v0, :cond_9

    .line 429
    nop

    .line 243
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$requirePreconditionNotNull":I
    invoke-interface {v0}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    move-result v0

    goto :goto_7

    .line 426
    .restart local v0    # "value$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$requirePreconditionNotNull":I
    :cond_9
    const/16 v17, 0x0

    .line 241
    .local v17, "$i$a$-requirePreconditionNotNull-LazyGridKt$rememberLazyGridMeasurePolicy$1$1$spaceBetweenLinesDp$1":I
    nop

    .line 426
    .end local v17    # "$i$a$-requirePreconditionNotNull-LazyGridKt$rememberLazyGridMeasurePolicy$1$1$spaceBetweenLinesDp$1":I
    const-string/jumbo v17, "null verticalArrangement when isVertical == true"

    invoke-static/range {v17 .. v17}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v17, Lkotlin/KotlinNothingValueException;

    invoke-direct/range {v17 .. v17}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v17

    .line 245
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$requirePreconditionNotNull":I
    :cond_a
    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .restart local v0    # "value$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 430
    .restart local v16    # "$i$f$requirePreconditionNotNull":I
    nop

    .line 432
    if-eqz v0, :cond_15

    .line 436
    nop

    .line 248
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$requirePreconditionNotNull":I
    invoke-interface {v0}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    move-result v0

    .line 239
    :goto_7
    nop

    .line 238
    move/from16 v34, v0

    .line 250
    .local v34, "spaceBetweenLinesDp":F
    move/from16 v13, v34

    .end local v34    # "spaceBetweenLinesDp":F
    .local v13, "spaceBetweenLinesDp":F
    invoke-interface {v3, v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v27

    .line 251
    .local v27, "spaceBetweenLines":I
    invoke-interface {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;->getItemCount()I

    move-result v26

    .line 255
    .local v26, "itemsCount":I
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_b

    .line 256
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_8

    .line 258
    :cond_b
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v0

    sub-int/2addr v0, v5

    .line 255
    :goto_8
    nop

    .line 254
    move v14, v0

    .line 261
    .local v14, "mainAxisAvailableSize":I
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$reverseLayout:Z

    const-wide v16, 0xffffffffL

    const/16 v18, 0x20

    if-eqz v0, :cond_f

    if-lez v14, :cond_c

    move/from16 v20, v4

    move/from16 v23, v5

    goto :goto_b

    .line 270
    :cond_c
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_d

    move v0, v15

    goto :goto_9

    :cond_d
    add-int v0, v15, v14

    .line 271
    :goto_9
    move/from16 v19, v0

    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_e

    add-int v0, v2, v14

    goto :goto_a

    :cond_e
    move v0, v2

    .line 269
    :goto_a
    nop

    .local v0, "y$iv":I
    move/from16 v20, v19

    .local v20, "x$iv":I
    const/16 v19, 0x0

    .line 439
    .local v19, "$i$f$IntOffset":I
    const/16 v21, 0x0

    .line 440
    .local v21, "$i$f$packInts":I
    move/from16 v23, v5

    move/from16 v3, v20

    move/from16 v20, v4

    .end local v4    # "totalVerticalPadding":I
    .end local v5    # "totalHorizontalPadding":I
    .local v3, "x$iv":I
    .local v20, "totalVerticalPadding":I
    .local v23, "totalHorizontalPadding":I
    int-to-long v4, v3

    shl-long v4, v4, v18

    move/from16 v24, v3

    move-wide/from16 v28, v4

    .end local v3    # "x$iv":I
    .local v24, "x$iv":I
    int-to-long v3, v0

    and-long v3, v3, v16

    or-long v3, v28, v3

    .line 439
    .end local v21    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v3

    goto :goto_c

    .line 261
    .end local v0    # "y$iv":I
    .end local v19    # "$i$f$IntOffset":I
    .end local v20    # "totalVerticalPadding":I
    .end local v23    # "totalHorizontalPadding":I
    .end local v24    # "x$iv":I
    .restart local v4    # "totalVerticalPadding":I
    .restart local v5    # "totalHorizontalPadding":I
    :cond_f
    move/from16 v20, v4

    move/from16 v23, v5

    .line 262
    .end local v4    # "totalVerticalPadding":I
    .end local v5    # "totalHorizontalPadding":I
    .restart local v20    # "totalVerticalPadding":I
    .restart local v23    # "totalHorizontalPadding":I
    :goto_b
    const/4 v0, 0x0

    .line 437
    .local v0, "$i$f$IntOffset":I
    const/4 v3, 0x0

    .line 438
    .local v3, "$i$f$packInts":I
    int-to-long v4, v15

    shl-long v4, v4, v18

    move/from16 v18, v3

    move-wide/from16 v28, v4

    .end local v3    # "$i$f$packInts":I
    .local v18, "$i$f$packInts":I
    int-to-long v3, v2

    and-long v3, v3, v16

    or-long v3, v28, v3

    .line 437
    .end local v18    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v3

    .line 261
    .end local v0    # "$i$f$IntOffset":I
    :goto_c
    nop

    .line 260
    nop

    .line 276
    .local v3, "visualItemOffset":J
    new-instance v28, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;

    move-wide/from16 v16, v8

    move v9, v6

    .end local v6    # "beforeContentPadding":I
    .end local v8    # "contentConstraints":J
    .local v9, "beforeContentPadding":I
    .local v16, "contentConstraints":J
    iget-object v6, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    move-object/from16 v29, v11

    move-object/from16 v56, v10

    move v10, v7

    move-wide/from16 v57, v3

    move-object/from16 v3, v56

    move v4, v12

    move-wide/from16 v11, v57

    .end local v7    # "afterContentPadding":I
    .end local v12    # "slotsPerLine":I
    .local v3, "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .local v4, "slotsPerLine":I
    .local v10, "afterContentPadding":I
    .local v11, "visualItemOffset":J
    .local v29, "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    iget-boolean v7, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    iget-boolean v8, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$reverseLayout:Z

    move/from16 v34, v2

    move/from16 v19, v4

    move-wide/from16 v17, v16

    move/from16 v16, v23

    move/from16 v5, v27

    move-object/from16 v2, v28

    move-object/from16 v4, p1

    .end local v2    # "topPadding":I
    .end local v4    # "slotsPerLine":I
    .end local v23    # "totalHorizontalPadding":I
    .end local v27    # "spaceBetweenLines":I
    .local v5, "spaceBetweenLines":I
    .local v16, "totalHorizontalPadding":I
    .local v17, "contentConstraints":J
    .local v19, "slotsPerLine":I
    .local v34, "topPadding":I
    invoke-direct/range {v2 .. v12}, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/lazy/grid/LazyGridState;ZZIIJ)V

    .line 275
    move-object v8, v3

    move-wide/from16 v35, v11

    .line 308
    .end local v3    # "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .end local v11    # "visualItemOffset":J
    .local v8, "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .local v28, "measuredItemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
    .local v35, "visualItemOffset":J
    new-instance v23, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;

    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    move/from16 v24, v0

    .end local v5    # "spaceBetweenLines":I
    .restart local v27    # "spaceBetweenLines":I
    invoke-direct/range {v23 .. v29}, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;-><init>(ZLandroidx/compose/foundation/lazy/grid/LazyGridSlots;IILandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)V

    .line 307
    move-object/from16 v37, v25

    move/from16 v12, v26

    move-object/from16 v38, v28

    move-object/from16 v11, v29

    .end local v25    # "resolvedSlots":Landroidx/compose/foundation/lazy/grid/LazyGridSlots;
    .end local v26    # "itemsCount":I
    .end local v28    # "measuredItemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
    .end local v29    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .local v11, "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .local v12, "itemsCount":I
    .local v37, "resolvedSlots":Landroidx/compose/foundation/lazy/grid/LazyGridSlots;
    .local v38, "measuredItemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
    move-object/from16 v2, v23

    .line 332
    .local v2, "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1;

    invoke-direct {v0, v11, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;)V

    move-object/from16 v28, v0

    check-cast v28, Lkotlin/jvm/functions/Function1;

    .line 346
    .local v28, "prefetchInfoRetriever":Lkotlin/jvm/functions/Function1;
    const/4 v3, 0x0

    .line 347
    .local v3, "firstVisibleLineIndex":I
    const/4 v4, 0x0

    .line 349
    .local v4, "firstVisibleLineScrollOffset":I
    sget-object v5, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .local v5, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    const/4 v6, 0x0

    .line 441
    .local v6, "$i$f$withoutReadObservation":I
    nop

    .line 442
    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v7

    .line 443
    .local v7, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v7, :cond_10

    invoke-virtual {v7}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v21

    goto :goto_d

    :cond_10
    const/16 v21, 0x0

    :goto_d
    move-object/from16 v23, v21

    .line 444
    .local v23, "observer$iv":Lkotlin/jvm/functions/Function1;
    move-object/from16 v21, v2

    .end local v2    # "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .local v21, "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    invoke-virtual {v5, v7}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v2

    .line 445
    .local v2, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 446
    const/16 v24, 0x0

    .line 351
    .local v24, "$i$a$-withoutReadObservation-LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1":I
    nop

    .line 352
    nop

    .line 353
    move/from16 v25, v3

    .end local v3    # "firstVisibleLineIndex":I
    .local v25, "firstVisibleLineIndex":I
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getFirstVisibleItemIndex()I

    move-result v3

    .line 351
    invoke-virtual {v0, v8, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->updateScrollPositionIfTheFirstItemWasMoved$foundation_release(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 350
    nop

    .line 355
    .local v3, "index":I
    if-lt v3, v12, :cond_12

    if-gtz v12, :cond_11

    goto :goto_e

    .line 361
    :cond_11
    add-int/lit8 v0, v12, -0x1

    :try_start_1
    invoke-virtual {v11, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;->getLineIndexOfItem(I)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 362
    .end local v25    # "firstVisibleLineIndex":I
    .local v0, "firstVisibleLineIndex":I
    const/4 v4, 0x0

    move/from16 v26, v0

    move/from16 v25, v10

    move v10, v4

    goto :goto_f

    .line 448
    .end local v0    # "firstVisibleLineIndex":I
    .end local v3    # "index":I
    .end local v24    # "$i$a$-withoutReadObservation-LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1":I
    .restart local v25    # "firstVisibleLineIndex":I
    :catchall_0
    move-exception v0

    move-object/from16 v46, v8

    move v8, v9

    move-object/from16 v47, v11

    move/from16 v43, v12

    move/from16 v39, v13

    move/from16 v41, v14

    move/from16 v42, v15

    move/from16 v49, v16

    move-wide/from16 v12, v17

    move/from16 v48, v20

    move-object/from16 v45, v21

    move-object/from16 v3, v23

    move/from16 v21, v10

    goto/16 :goto_12

    .line 356
    .restart local v3    # "index":I
    .restart local v24    # "$i$a$-withoutReadObservation-LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1":I
    :cond_12
    :goto_e
    :try_start_2
    invoke-virtual {v11, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;->getLineIndexOfItem(I)I

    move-result v26
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 357
    .end local v25    # "firstVisibleLineIndex":I
    .local v26, "firstVisibleLineIndex":I
    :try_start_3
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getFirstVisibleItemScrollOffset()I

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move v4, v0

    move/from16 v25, v10

    move v10, v4

    .line 364
    .end local v4    # "firstVisibleLineScrollOffset":I
    .local v10, "firstVisibleLineScrollOffset":I
    .local v25, "afterContentPadding":I
    :goto_f
    nop

    .end local v3    # "index":I
    .end local v24    # "$i$a$-withoutReadObservation-LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1":I
    :try_start_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 446
    nop

    .line 448
    move-object/from16 v3, v23

    .end local v23    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .local v3, "observer$iv":Lkotlin/jvm/functions/Function1;
    invoke-virtual {v5, v7, v2, v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    .line 446
    nop

    .line 367
    .end local v2    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v3    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v5    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v6    # "$i$f$withoutReadObservation":I
    .end local v7    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    move-object v0, v8

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;

    .line 368
    iget-object v2, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getPinnedItems$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    move-result-object v2

    .line 369
    iget-object v3, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    move-result-object v3

    .line 367
    invoke-static {v0, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt;->calculateLazyLayoutPinnedIndices(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;)Ljava/util/List;

    move-result-object v0

    .line 366
    nop

    .line 373
    .local v0, "pinnedItems":Ljava/util/List;
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->isLookingAhead()Z

    move-result v2

    if-nez v2, :cond_14

    if-nez v22, :cond_13

    goto :goto_10

    .line 376
    :cond_13
    iget-object v2, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getScrollDeltaBetweenPasses$foundation_release()F

    move-result v2

    goto :goto_11

    .line 374
    :cond_14
    :goto_10
    iget-object v2, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getScrollToBeConsumed$foundation_release()F

    move-result v2

    .line 373
    :goto_11
    nop

    .line 372
    move/from16 v23, v2

    .line 398
    .local v23, "scrollToBeConsumed":F
    iget-object v2, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getItemAnimator$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v24

    .line 402
    move-object/from16 v29, v11

    move/from16 v11, v23

    .end local v23    # "scrollToBeConsumed":F
    .local v11, "scrollToBeConsumed":F
    .restart local v29    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->isLookingAhead()Z

    move-result v23

    .line 403
    iget-object v2, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getApproachLayoutInfo$foundation_release()Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    move-result-object v2

    .line 405
    iget-object v3, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getPlacementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;

    move-result-object v30

    .line 382
    nop

    .line 383
    move-object/from16 v39, v21

    check-cast v39, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;

    .line 384
    move-object/from16 v40, v38

    check-cast v40, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;

    .line 385
    nop

    .line 386
    nop

    .line 387
    nop

    .line 388
    nop

    .line 389
    nop

    .line 390
    nop

    .line 391
    nop

    .line 392
    nop

    .line 393
    move/from16 v41, v14

    .end local v14    # "mainAxisAvailableSize":I
    .local v41, "mainAxisAvailableSize":I
    iget-boolean v14, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$isVertical:Z

    .line 394
    move/from16 v42, v15

    .end local v15    # "startPadding":I
    .local v42, "startPadding":I
    iget-object v15, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 395
    iget-object v3, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 396
    iget-boolean v4, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$reverseLayout:Z

    .line 397
    move/from16 v43, v12

    move-wide/from16 v56, v17

    move/from16 v17, v13

    move-wide/from16 v12, v56

    .end local v13    # "spaceBetweenLinesDp":F
    .local v12, "contentConstraints":J
    .local v17, "spaceBetweenLinesDp":F
    .local v43, "itemsCount":I
    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/ui/unit/Density;

    .line 398
    nop

    .line 399
    nop

    .line 400
    nop

    .line 401
    nop

    .line 402
    nop

    .line 403
    move-object/from16 v44, v2

    check-cast v44, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;

    .line 404
    iget-object v2, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 405
    nop

    .line 407
    iget-object v5, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$graphicsContext:Landroidx/compose/ui/graphics/GraphicsContext;

    .line 406
    nop

    .line 408
    iget-object v6, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$stickyItemsScrollBehavior:Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;

    .line 381
    move-object v7, v2

    new-instance v2, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1;

    move-object/from16 v46, v8

    move-object/from16 v45, v21

    move/from16 v21, v25

    move/from16 v8, v27

    move-object/from16 v47, v29

    move-object/from16 v27, v5

    move-object/from16 v29, v6

    move-object/from16 v25, v7

    move/from16 v6, v16

    move/from16 v7, v20

    move-object/from16 v16, v3

    move/from16 v20, v17

    move-object/from16 v3, p1

    move/from16 v17, v4

    move-wide/from16 v4, p2

    .end local v16    # "totalHorizontalPadding":I
    .end local v17    # "spaceBetweenLinesDp":F
    .end local v25    # "afterContentPadding":I
    .end local v27    # "spaceBetweenLines":I
    .end local v29    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .local v6, "totalHorizontalPadding":I
    .local v7, "totalVerticalPadding":I
    .local v8, "spaceBetweenLines":I
    .local v20, "spaceBetweenLinesDp":F
    .local v21, "afterContentPadding":I
    .local v45, "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .local v46, "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .local v47, "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;JII)V

    move/from16 v49, v6

    move/from16 v48, v7

    .end local v6    # "totalHorizontalPadding":I
    .end local v7    # "totalVerticalPadding":I
    .local v48, "totalVerticalPadding":I
    .local v49, "totalHorizontalPadding":I
    check-cast v2, Lkotlin/jvm/functions/Function3;

    move v6, v9

    move/from16 v7, v21

    move/from16 v9, v26

    move-object/from16 v26, v30

    move-object/from16 v3, v39

    move-object/from16 v4, v40

    move/from16 v5, v41

    move-object/from16 v21, v0

    move-object/from16 v30, v2

    move/from16 v39, v20

    move/from16 v2, v43

    move/from16 v20, v19

    move-object/from16 v19, v24

    move-object/from16 v24, v44

    .end local v0    # "pinnedItems":Ljava/util/List;
    .end local v19    # "slotsPerLine":I
    .end local v26    # "firstVisibleLineIndex":I
    .end local v41    # "mainAxisAvailableSize":I
    .end local v43    # "itemsCount":I
    .local v2, "itemsCount":I
    .local v5, "mainAxisAvailableSize":I
    .local v6, "beforeContentPadding":I
    .local v7, "afterContentPadding":I
    .local v9, "firstVisibleLineIndex":I
    .local v20, "slotsPerLine":I
    .local v21, "pinnedItems":Ljava/util/List;
    .local v39, "spaceBetweenLinesDp":F
    invoke-static/range {v2 .. v30}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->measureLazyGrid-GyuLg2I(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    move-result-object v0

    .line 380
    move/from16 v27, v8

    move/from16 v19, v20

    move-object/from16 v2, v21

    move v8, v6

    move/from16 v21, v7

    .end local v5    # "mainAxisAvailableSize":I
    .end local v6    # "beforeContentPadding":I
    .end local v7    # "afterContentPadding":I
    .end local v20    # "slotsPerLine":I
    .local v2, "pinnedItems":Ljava/util/List;
    .local v8, "beforeContentPadding":I
    .restart local v19    # "slotsPerLine":I
    .local v21, "afterContentPadding":I
    .restart local v27    # "spaceBetweenLines":I
    .restart local v41    # "mainAxisAvailableSize":I
    .restart local v43    # "itemsCount":I
    move-object/from16 v51, v0

    .line 418
    .local v51, "measureResult":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    iget-object v0, v1, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->isLookingAhead()Z

    move-result v52

    const/16 v54, 0x4

    const/16 v55, 0x0

    const/16 v53, 0x0

    move-object/from16 v50, v0

    invoke-static/range {v50 .. v55}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->applyMeasureResult$foundation_release$default(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;ZZILjava/lang/Object;)V

    .line 419
    return-object v51

    .line 448
    .end local v39    # "spaceBetweenLinesDp":F
    .end local v41    # "mainAxisAvailableSize":I
    .end local v42    # "startPadding":I
    .end local v43    # "itemsCount":I
    .end local v45    # "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .end local v46    # "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .end local v47    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .end local v48    # "totalVerticalPadding":I
    .end local v49    # "totalHorizontalPadding":I
    .end local v51    # "measureResult":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .local v2, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .local v5, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .local v6, "$i$f$withoutReadObservation":I
    .local v7, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .local v8, "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .local v9, "beforeContentPadding":I
    .local v11, "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .local v12, "itemsCount":I
    .restart local v13    # "spaceBetweenLinesDp":F
    .restart local v14    # "mainAxisAvailableSize":I
    .restart local v15    # "startPadding":I
    .restart local v16    # "totalHorizontalPadding":I
    .local v17, "contentConstraints":J
    .local v20, "totalVerticalPadding":I
    .local v21, "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .local v23, "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v25    # "afterContentPadding":I
    .restart local v26    # "firstVisibleLineIndex":I
    :catchall_1
    move-exception v0

    move-object/from16 v46, v8

    move v8, v9

    move-object/from16 v47, v11

    move/from16 v43, v12

    move/from16 v39, v13

    move/from16 v41, v14

    move/from16 v42, v15

    move/from16 v49, v16

    move-wide/from16 v12, v17

    move/from16 v48, v20

    move-object/from16 v45, v21

    move-object/from16 v3, v23

    move/from16 v21, v25

    move/from16 v9, v26

    move/from16 v25, v9

    move v4, v10

    .end local v11    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .end local v13    # "spaceBetweenLinesDp":F
    .end local v14    # "mainAxisAvailableSize":I
    .end local v15    # "startPadding":I
    .end local v16    # "totalHorizontalPadding":I
    .end local v17    # "contentConstraints":J
    .end local v20    # "totalVerticalPadding":I
    .end local v23    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v25    # "afterContentPadding":I
    .end local v26    # "firstVisibleLineIndex":I
    .restart local v3    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .local v8, "beforeContentPadding":I
    .local v9, "firstVisibleLineIndex":I
    .local v12, "contentConstraints":J
    .local v21, "afterContentPadding":I
    .restart local v39    # "spaceBetweenLinesDp":F
    .restart local v41    # "mainAxisAvailableSize":I
    .restart local v42    # "startPadding":I
    .restart local v43    # "itemsCount":I
    .restart local v45    # "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .restart local v46    # "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .restart local v47    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .restart local v48    # "totalVerticalPadding":I
    .restart local v49    # "totalHorizontalPadding":I
    goto :goto_12

    .end local v3    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v39    # "spaceBetweenLinesDp":F
    .end local v41    # "mainAxisAvailableSize":I
    .end local v42    # "startPadding":I
    .end local v43    # "itemsCount":I
    .end local v45    # "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .end local v46    # "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .end local v47    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .end local v48    # "totalVerticalPadding":I
    .end local v49    # "totalHorizontalPadding":I
    .restart local v4    # "firstVisibleLineScrollOffset":I
    .local v8, "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .local v9, "beforeContentPadding":I
    .local v10, "afterContentPadding":I
    .restart local v11    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .local v12, "itemsCount":I
    .restart local v13    # "spaceBetweenLinesDp":F
    .restart local v14    # "mainAxisAvailableSize":I
    .restart local v15    # "startPadding":I
    .restart local v16    # "totalHorizontalPadding":I
    .restart local v17    # "contentConstraints":J
    .restart local v20    # "totalVerticalPadding":I
    .local v21, "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .restart local v23    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v26    # "firstVisibleLineIndex":I
    :catchall_2
    move-exception v0

    move-object/from16 v46, v8

    move v8, v9

    move-object/from16 v47, v11

    move/from16 v43, v12

    move/from16 v39, v13

    move/from16 v41, v14

    move/from16 v42, v15

    move/from16 v49, v16

    move-wide/from16 v12, v17

    move/from16 v48, v20

    move-object/from16 v45, v21

    move-object/from16 v3, v23

    move/from16 v21, v10

    move/from16 v25, v26

    .end local v9    # "beforeContentPadding":I
    .end local v10    # "afterContentPadding":I
    .end local v11    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .end local v13    # "spaceBetweenLinesDp":F
    .end local v14    # "mainAxisAvailableSize":I
    .end local v15    # "startPadding":I
    .end local v16    # "totalHorizontalPadding":I
    .end local v17    # "contentConstraints":J
    .end local v20    # "totalVerticalPadding":I
    .end local v23    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v3    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .local v8, "beforeContentPadding":I
    .local v12, "contentConstraints":J
    .local v21, "afterContentPadding":I
    .restart local v39    # "spaceBetweenLinesDp":F
    .restart local v41    # "mainAxisAvailableSize":I
    .restart local v42    # "startPadding":I
    .restart local v43    # "itemsCount":I
    .restart local v45    # "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .restart local v46    # "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .restart local v47    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .restart local v48    # "totalVerticalPadding":I
    .restart local v49    # "totalHorizontalPadding":I
    goto :goto_12

    .end local v3    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v26    # "firstVisibleLineIndex":I
    .end local v39    # "spaceBetweenLinesDp":F
    .end local v41    # "mainAxisAvailableSize":I
    .end local v42    # "startPadding":I
    .end local v43    # "itemsCount":I
    .end local v45    # "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .end local v46    # "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .end local v47    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .end local v48    # "totalVerticalPadding":I
    .end local v49    # "totalHorizontalPadding":I
    .local v8, "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .restart local v9    # "beforeContentPadding":I
    .restart local v10    # "afterContentPadding":I
    .restart local v11    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .local v12, "itemsCount":I
    .restart local v13    # "spaceBetweenLinesDp":F
    .restart local v14    # "mainAxisAvailableSize":I
    .restart local v15    # "startPadding":I
    .restart local v16    # "totalHorizontalPadding":I
    .restart local v17    # "contentConstraints":J
    .restart local v20    # "totalVerticalPadding":I
    .local v21, "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .restart local v23    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .local v25, "firstVisibleLineIndex":I
    :catchall_3
    move-exception v0

    move-object/from16 v46, v8

    move v8, v9

    move-object/from16 v47, v11

    move/from16 v43, v12

    move/from16 v39, v13

    move/from16 v41, v14

    move/from16 v42, v15

    move/from16 v49, v16

    move-wide/from16 v12, v17

    move/from16 v48, v20

    move-object/from16 v45, v21

    move-object/from16 v3, v23

    move/from16 v21, v10

    .end local v9    # "beforeContentPadding":I
    .end local v10    # "afterContentPadding":I
    .end local v11    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .end local v13    # "spaceBetweenLinesDp":F
    .end local v14    # "mainAxisAvailableSize":I
    .end local v15    # "startPadding":I
    .end local v16    # "totalHorizontalPadding":I
    .end local v17    # "contentConstraints":J
    .end local v20    # "totalVerticalPadding":I
    .end local v23    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v3    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .local v8, "beforeContentPadding":I
    .local v12, "contentConstraints":J
    .local v21, "afterContentPadding":I
    .restart local v39    # "spaceBetweenLinesDp":F
    .restart local v41    # "mainAxisAvailableSize":I
    .restart local v42    # "startPadding":I
    .restart local v43    # "itemsCount":I
    .restart local v45    # "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .restart local v46    # "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .restart local v47    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .restart local v48    # "totalVerticalPadding":I
    .restart local v49    # "totalHorizontalPadding":I
    :goto_12
    invoke-virtual {v5, v7, v2, v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    throw v0

    .line 433
    .end local v3    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v19    # "slotsPerLine":I
    .end local v21    # "afterContentPadding":I
    .end local v27    # "spaceBetweenLines":I
    .end local v28    # "prefetchInfoRetriever":Lkotlin/jvm/functions/Function1;
    .end local v34    # "topPadding":I
    .end local v35    # "visualItemOffset":J
    .end local v37    # "resolvedSlots":Landroidx/compose/foundation/lazy/grid/LazyGridSlots;
    .end local v38    # "measuredItemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1;
    .end local v39    # "spaceBetweenLinesDp":F
    .end local v41    # "mainAxisAvailableSize":I
    .end local v42    # "startPadding":I
    .end local v43    # "itemsCount":I
    .end local v45    # "measuredLineProvider":Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    .end local v46    # "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .end local v47    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .end local v48    # "totalVerticalPadding":I
    .end local v49    # "totalHorizontalPadding":I
    .local v0, "value$iv":Ljava/lang/Object;
    .local v2, "topPadding":I
    .local v4, "totalVerticalPadding":I
    .local v5, "totalHorizontalPadding":I
    .local v6, "beforeContentPadding":I
    .local v7, "afterContentPadding":I
    .local v8, "contentConstraints":J
    .local v10, "itemProvider":Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
    .restart local v11    # "spanLayoutProvider":Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;
    .local v12, "slotsPerLine":I
    .restart local v15    # "startPadding":I
    .local v16, "$i$f$requirePreconditionNotNull":I
    .local v25, "resolvedSlots":Landroidx/compose/foundation/lazy/grid/LazyGridSlots;
    :cond_15
    move/from16 v34, v2

    .end local v2    # "topPadding":I
    .restart local v34    # "topPadding":I
    const/4 v2, 0x0

    .line 246
    .local v2, "$i$a$-requirePreconditionNotNull-LazyGridKt$rememberLazyGridMeasurePolicy$1$1$spaceBetweenLinesDp$2":I
    nop

    .line 433
    .end local v2    # "$i$a$-requirePreconditionNotNull-LazyGridKt$rememberLazyGridMeasurePolicy$1$1$spaceBetweenLinesDp$2":I
    const-string/jumbo v2, "null horizontalArrangement when isVertical == false"

    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v2, Lkotlin/KotlinNothingValueException;

    invoke-direct {v2}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v2
.end method
