.class final Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyList.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/LazyListKt;->rememberLazyListMeasurePolicy(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;
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
        "Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,391:1\n107#2,7:392\n107#2,7:399\n32#3:406\n32#3:408\n80#4:407\n80#4:409\n602#5,8:410\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n251#1:392,7\n256#1:399,7\n274#1:406\n281#1:408\n274#1:407\n281#1:409\n328#1:410,8\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "containerConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "invoke-0kLqBqw",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/LazyListMeasureResult;"
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
.field final synthetic $beyondBoundsItemCount:I

.field final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $graphicsContext:Landroidx/compose/ui/graphics/GraphicsContext;

.field final synthetic $horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

.field final synthetic $horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field final synthetic $isVertical:Z

.field final synthetic $itemProviderLambda:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $reverseLayout:Z

.field final synthetic $state:Landroidx/compose/foundation/lazy/LazyListState;

.field final synthetic $stickyItemsPlacement:Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;

.field final synthetic $verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

.field final synthetic $verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/LazyListState;ZLandroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Z",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
            ">;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "I",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    iput-object p3, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    iput-object p5, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$itemProviderLambda:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    iput-object p7, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    iput p8, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$beyondBoundsItemCount:I

    iput-object p9, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iput-object p10, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$graphicsContext:Landroidx/compose/ui/graphics/GraphicsContext;

    iput-object p11, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$stickyItemsPlacement:Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;

    iput-object p12, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    iput-object p13, p0, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 200
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    move-object v1, p2

    check-cast v1, Landroidx/compose/ui/unit/Constraints;

    invoke-virtual {v1}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    move-result-object v0

    return-object v0
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/LazyListMeasureResult;
    .locals 53
    .param p1, "$this$null"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p2, "containerConstraints"    # J

    .line 201
    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListState;->getMeasurementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->attachToScope-impl(Landroidx/compose/runtime/MutableState;)V

    .line 203
    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListState;->getHasLookaheadOccurred$foundation_release()Z

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
    move/from16 v21, v0

    .line 205
    .local v21, "hasLookaheadOccurred":Z
    nop

    .line 206
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_2

    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2

    :cond_2
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 204
    :goto_2
    invoke-static {v4, v5, v0}, Landroidx/compose/foundation/CheckScrollableContainerConstraintsKt;->checkScrollableContainerConstraints-K40F9xA(JLandroidx/compose/foundation/gestures/Orientation;)V

    .line 211
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    .line 215
    iget-object v2, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 211
    if-eqz v0, :cond_3

    .line 212
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    invoke-interface {v2, v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateLeftPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    goto :goto_3

    .line 215
    :cond_3
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/PaddingKt;->calculateStartPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 211
    :goto_3
    nop

    .line 210
    move v2, v0

    .line 219
    .local v2, "startPadding":I
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    .line 223
    iget-object v6, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 219
    if-eqz v0, :cond_4

    .line 220
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    invoke-interface {v6, v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateRightPadding-u2uoSUM(Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    goto :goto_4

    .line 223
    :cond_4
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/PaddingKt;->calculateEndPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v0

    .line 219
    :goto_4
    nop

    .line 218
    move/from16 v29, v0

    .line 225
    .local v29, "endPadding":I
    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v6

    .line 226
    .local v6, "topPadding":I
    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-interface {v0}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    move-result v0

    invoke-interface {v3, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v30

    .line 227
    .local v30, "bottomPadding":I
    add-int v7, v6, v30

    .line 228
    .local v7, "totalVerticalPadding":I
    add-int v8, v2, v29

    .line 230
    .local v8, "totalHorizontalPadding":I
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_5

    move v0, v7

    goto :goto_5

    :cond_5
    move v0, v8

    .line 229
    :goto_5
    move/from16 v31, v0

    .line 232
    .local v31, "totalMainAxisPadding":I
    nop

    .line 233
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_6

    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    if-nez v0, :cond_6

    move v13, v6

    goto :goto_6

    .line 234
    :cond_6
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_7

    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    if-eqz v0, :cond_7

    move/from16 v13, v30

    goto :goto_6

    .line 235
    :cond_7
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-nez v0, :cond_8

    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    if-nez v0, :cond_8

    move v13, v2

    goto :goto_6

    .line 236
    :cond_8
    move/from16 v13, v29

    .line 232
    :goto_6
    nop

    .line 231
    nop

    .line 238
    .local v13, "beforeContentPadding":I
    sub-int v14, v31, v13

    .line 240
    .local v14, "afterContentPadding":I
    neg-int v0, v8

    neg-int v9, v7

    invoke-static {v4, v5, v0, v9}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    move-result-wide v11

    .line 239
    nop

    .line 242
    .local v11, "contentConstraints":J
    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$itemProviderLambda:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroidx/compose/foundation/lazy/LazyListItemProvider;

    .line 244
    .local v9, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    invoke-interface {v9}, Landroidx/compose/foundation/lazy/LazyListItemProvider;->getItemScope()Landroidx/compose/foundation/lazy/LazyItemScopeImpl;

    move-result-object v0

    .line 245
    invoke-static {v11, v12}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v10

    .line 246
    invoke-static {v11, v12}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v15

    .line 244
    invoke-virtual {v0, v10, v15}, Landroidx/compose/foundation/lazy/LazyItemScopeImpl;->setMaxSize(II)V

    .line 250
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_a

    .line 251
    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .local v0, "value$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 392
    .local v10, "$i$f$requirePreconditionNotNull":I
    nop

    .line 394
    if-eqz v0, :cond_9

    .line 398
    nop

    .line 254
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v10    # "$i$f$requirePreconditionNotNull":I
    invoke-interface {v0}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    move-result v0

    goto :goto_7

    .line 395
    .restart local v0    # "value$iv":Ljava/lang/Object;
    .restart local v10    # "$i$f$requirePreconditionNotNull":I
    :cond_9
    const/4 v15, 0x0

    .line 252
    .local v15, "$i$a$-requirePreconditionNotNull-LazyListKt$rememberLazyListMeasurePolicy$1$1$spaceBetweenItemsDp$1":I
    nop

    .line 395
    .end local v15    # "$i$a$-requirePreconditionNotNull-LazyListKt$rememberLazyListMeasurePolicy$1$1$spaceBetweenItemsDp$1":I
    const-string/jumbo v15, "null verticalArrangement when isVertical == true"

    invoke-static {v15}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v15, Lkotlin/KotlinNothingValueException;

    invoke-direct {v15}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v15

    .line 256
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v10    # "$i$f$requirePreconditionNotNull":I
    :cond_a
    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .restart local v0    # "value$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 399
    .restart local v10    # "$i$f$requirePreconditionNotNull":I
    nop

    .line 401
    if-eqz v0, :cond_13

    .line 405
    nop

    .line 259
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v10    # "$i$f$requirePreconditionNotNull":I
    invoke-interface {v0}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    move-result v0

    .line 250
    :goto_7
    nop

    .line 249
    move v10, v0

    .line 261
    .local v10, "spaceBetweenItemsDp":F
    move-object v15, v9

    .end local v9    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .local v15, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    invoke-interface {v3, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->roundToPx-0680j_4(F)I

    move-result v9

    .line 263
    .local v9, "spaceBetweenItems":I
    move/from16 v16, v8

    .end local v8    # "totalHorizontalPadding":I
    .local v16, "totalHorizontalPadding":I
    invoke-interface {v15}, Landroidx/compose/foundation/lazy/LazyListItemProvider;->getItemCount()I

    move-result v8

    .line 267
    .local v8, "itemsCount":I
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_b

    .line 268
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v0

    sub-int/2addr v0, v7

    goto :goto_8

    .line 270
    :cond_b
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v0

    sub-int v0, v0, v16

    .line 267
    :goto_8
    nop

    .line 266
    move/from16 v18, v0

    .line 273
    .local v18, "mainAxisAvailableSize":I
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    const-wide v19, 0xffffffffL

    const/16 v17, 0x20

    if-eqz v0, :cond_f

    if-lez v18, :cond_c

    goto :goto_b

    .line 282
    :cond_c
    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_d

    move v0, v2

    goto :goto_9

    :cond_d
    add-int v0, v2, v18

    .line 283
    :goto_9
    move/from16 v22, v0

    iget-boolean v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    if-eqz v0, :cond_e

    add-int v0, v6, v18

    goto :goto_a

    :cond_e
    move v0, v6

    .line 281
    :goto_a
    nop

    .local v0, "y$iv":I
    move/from16 v23, v22

    .local v23, "x$iv":I
    const/16 v22, 0x0

    .line 408
    .local v22, "$i$f$IntOffset":I
    const/16 v24, 0x0

    .line 409
    .local v24, "$i$f$packInts":I
    move/from16 v3, v23

    .end local v23    # "x$iv":I
    .local v3, "x$iv":I
    int-to-long v4, v3

    shl-long v4, v4, v17

    move-wide/from16 v25, v4

    .end local v3    # "x$iv":I
    .restart local v23    # "x$iv":I
    int-to-long v3, v0

    and-long v3, v3, v19

    or-long v3, v25, v3

    .line 408
    .end local v24    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v3

    move/from16 v17, v2

    goto :goto_c

    .line 274
    .end local v0    # "y$iv":I
    .end local v22    # "$i$f$IntOffset":I
    .end local v23    # "x$iv":I
    :cond_f
    :goto_b
    const/4 v0, 0x0

    .line 406
    .local v0, "$i$f$IntOffset":I
    const/4 v3, 0x0

    .line 407
    .local v3, "$i$f$packInts":I
    int-to-long v4, v2

    shl-long v4, v4, v17

    move/from16 v17, v2

    move/from16 v22, v3

    .end local v2    # "startPadding":I
    .end local v3    # "$i$f$packInts":I
    .local v17, "startPadding":I
    .local v22, "$i$f$packInts":I
    int-to-long v2, v6

    and-long v2, v2, v19

    or-long/2addr v2, v4

    .line 406
    .end local v22    # "$i$f$packInts":I
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v3

    .line 273
    .end local v0    # "$i$f$IntOffset":I
    :goto_c
    nop

    .line 272
    nop

    .line 288
    .local v3, "visualItemOffset":J
    new-instance v2, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1;

    iget-boolean v5, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    move/from16 v19, v10

    .end local v10    # "spaceBetweenItemsDp":F
    .local v19, "spaceBetweenItemsDp":F
    iget-object v10, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    move/from16 v20, v6

    move-object v6, v15

    move-wide/from16 v51, v11

    move/from16 v12, v16

    move-wide v15, v3

    move-wide/from16 v3, v51

    .end local v11    # "contentConstraints":J
    .end local v16    # "totalHorizontalPadding":I
    .local v3, "contentConstraints":J
    .local v6, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .local v12, "totalHorizontalPadding":I
    .local v15, "visualItemOffset":J
    .local v20, "topPadding":I
    iget-object v11, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    move/from16 v22, v12

    .end local v12    # "totalHorizontalPadding":I
    .local v22, "totalHorizontalPadding":I
    iget-boolean v12, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    move/from16 v32, v17

    move/from16 v34, v19

    move/from16 v33, v20

    move-object/from16 v17, v0

    move/from16 v19, v7

    move-object/from16 v7, p1

    .end local v7    # "totalVerticalPadding":I
    .end local v17    # "startPadding":I
    .end local v20    # "topPadding":I
    .local v19, "totalVerticalPadding":I
    .local v32, "startPadding":I
    .local v33, "topPadding":I
    .local v34, "spaceBetweenItemsDp":F
    invoke-direct/range {v2 .. v17}, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1;-><init>(JZLandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ZIIJLandroidx/compose/foundation/lazy/LazyListState;)V

    .line 287
    move-wide v11, v3

    move v10, v8

    move-wide/from16 v35, v15

    move-object v8, v6

    .end local v3    # "contentConstraints":J
    .end local v6    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .end local v15    # "visualItemOffset":J
    .local v8, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .local v10, "itemsCount":I
    .restart local v11    # "contentConstraints":J
    .local v35, "visualItemOffset":J
    move-object/from16 v37, v2

    .line 326
    .local v37, "measuredItemProvider":Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1;
    const/4 v2, 0x0

    .line 327
    .local v2, "firstVisibleItemIndex":I
    const/4 v3, 0x0

    .line 328
    .local v3, "firstVisibleScrollOffset":I
    sget-object v4, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .local v4, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    const/4 v5, 0x0

    .line 410
    .local v5, "$i$f$withoutReadObservation":I
    nop

    .line 411
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v6

    .line 412
    .local v6, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v6, :cond_10

    invoke-virtual {v6}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v7

    goto :goto_d

    :cond_10
    const/4 v7, 0x0

    .line 413
    .local v7, "observer$iv":Lkotlin/jvm/functions/Function1;
    :goto_d
    invoke-virtual {v4, v6}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v15

    .line 414
    .local v15, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 415
    const/16 v16, 0x0

    .line 329
    .local v16, "$i$a$-withoutReadObservation-LazyListKt$rememberLazyListMeasurePolicy$1$1$1":I
    nop

    .line 330
    nop

    .line 331
    nop

    .line 332
    move/from16 v17, v2

    .end local v2    # "firstVisibleItemIndex":I
    .local v17, "firstVisibleItemIndex":I
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemIndex()I

    move-result v2

    .line 330
    invoke-virtual {v0, v8, v2}, Landroidx/compose/foundation/lazy/LazyListState;->updateScrollPositionIfTheFirstItemWasMoved$foundation_release(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 329
    move/from16 v17, v2

    .line 334
    :try_start_1
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListState;->getFirstVisibleItemScrollOffset()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move/from16 v20, v0

    .line 335
    .end local v3    # "firstVisibleScrollOffset":I
    .local v20, "firstVisibleScrollOffset":I
    nop

    .end local v16    # "$i$a$-withoutReadObservation-LazyListKt$rememberLazyListMeasurePolicy$1$1$1":I
    :try_start_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 415
    nop

    .line 417
    invoke-virtual {v4, v6, v15, v7}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    .line 415
    nop

    .line 338
    .end local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v5    # "$i$f$withoutReadObservation":I
    .end local v6    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v7    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v15    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    move-object v0, v8

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;

    .line 339
    iget-object v2, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListState;->getPinnedItems$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    move-result-object v2

    .line 340
    iget-object v3, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    move-result-object v3

    .line 338
    invoke-static {v0, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt;->calculateLazyLayoutPinnedIndices(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;)Ljava/util/List;

    move-result-object v0

    .line 337
    nop

    .line 344
    .local v0, "pinnedItems":Ljava/util/List;
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->isLookingAhead()Z

    move-result v2

    if-nez v2, :cond_12

    if-nez v21, :cond_11

    goto :goto_e

    .line 347
    :cond_11
    iget-object v2, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListState;->getScrollDeltaBetweenPasses$foundation_release()F

    move-result v2

    goto :goto_f

    .line 345
    :cond_12
    :goto_e
    iget-object v2, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListState;->getScrollToBeConsumed$foundation_release()F

    move-result v2

    .line 344
    :goto_f
    nop

    .line 343
    move v15, v2

    .line 353
    .local v15, "scrollToBeConsumed":F
    nop

    .line 354
    move-object/from16 v16, v37

    check-cast v16, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;

    .line 355
    nop

    .line 356
    nop

    .line 357
    nop

    .line 358
    nop

    .line 359
    nop

    .line 360
    nop

    .line 361
    nop

    .line 362
    nop

    .line 363
    move/from16 v23, v13

    .end local v13    # "beforeContentPadding":I
    .local v23, "beforeContentPadding":I
    iget-boolean v13, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$isVertical:Z

    .line 364
    move/from16 v24, v14

    .end local v14    # "afterContentPadding":I
    .local v24, "afterContentPadding":I
    iget-object v14, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$verticalArrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 365
    move/from16 v25, v10

    move v10, v15

    .end local v15    # "scrollToBeConsumed":F
    .local v10, "scrollToBeConsumed":F
    .local v25, "itemsCount":I
    iget-object v15, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$horizontalArrangement:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 366
    iget-boolean v2, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$reverseLayout:Z

    .line 367
    move-object/from16 v26, v8

    move/from16 v8, v17

    .end local v17    # "firstVisibleItemIndex":I
    .local v8, "firstVisibleItemIndex":I
    .local v26, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/ui/unit/Density;

    .line 368
    iget-object v3, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListState;->getItemAnimator$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v27

    .line 369
    iget v3, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$beyondBoundsItemCount:I

    .line 370
    nop

    .line 371
    nop

    .line 372
    move/from16 v6, v22

    .end local v22    # "totalHorizontalPadding":I
    .local v6, "totalHorizontalPadding":I
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->isLookingAhead()Z

    move-result v22

    .line 373
    iget-object v4, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyListState;->getApproachLayoutInfo$foundation_release()Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    move-result-object v4

    move-object/from16 v28, v4

    check-cast v28, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;

    .line 374
    iget-object v4, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 375
    iget-object v5, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyListState;->getPlacementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;

    move-result-object v38

    .line 376
    iget-object v5, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$graphicsContext:Landroidx/compose/ui/graphics/GraphicsContext;

    .line 377
    iget-object v7, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$stickyItemsPlacement:Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;

    .line 352
    move/from16 v39, v2

    new-instance v2, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1;

    move/from16 v42, v18

    move/from16 v40, v24

    move-object/from16 v41, v26

    move-object/from16 v18, v27

    move-object/from16 v24, v4

    move-object/from16 v26, v5

    move-object/from16 v27, v7

    move/from16 v7, v19

    move-wide/from16 v4, p2

    move/from16 v19, v3

    move-object/from16 v3, p1

    .end local v18    # "mainAxisAvailableSize":I
    .end local v19    # "totalVerticalPadding":I
    .end local v24    # "afterContentPadding":I
    .end local v26    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .local v7, "totalVerticalPadding":I
    .local v40, "afterContentPadding":I
    .local v41, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .local v42, "mainAxisAvailableSize":I
    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;JII)V

    move/from16 v44, v6

    move/from16 v43, v7

    .end local v6    # "totalHorizontalPadding":I
    .end local v7    # "totalVerticalPadding":I
    .local v43, "totalVerticalPadding":I
    .local v44, "totalHorizontalPadding":I
    check-cast v2, Lkotlin/jvm/functions/Function3;

    move v7, v9

    move-object/from16 v3, v16

    move/from16 v9, v20

    move/from16 v5, v23

    move-object/from16 v23, v28

    move/from16 v16, v39

    move/from16 v6, v40

    move/from16 v4, v42

    move-object/from16 v20, v0

    move-object/from16 v28, v2

    move/from16 v2, v25

    move-object/from16 v25, v38

    .end local v0    # "pinnedItems":Ljava/util/List;
    .end local v23    # "beforeContentPadding":I
    .end local v25    # "itemsCount":I
    .end local v40    # "afterContentPadding":I
    .end local v42    # "mainAxisAvailableSize":I
    .local v2, "itemsCount":I
    .local v4, "mainAxisAvailableSize":I
    .local v5, "beforeContentPadding":I
    .local v6, "afterContentPadding":I
    .local v7, "spaceBetweenItems":I
    .local v9, "firstVisibleScrollOffset":I
    .local v20, "pinnedItems":Ljava/util/List;
    invoke-static/range {v2 .. v28}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->measureLazyList-LCrQqZ4(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    move-result-object v0

    .line 351
    move/from16 v25, v2

    move v13, v5

    move v14, v6

    move v2, v7

    .end local v4    # "mainAxisAvailableSize":I
    .end local v5    # "beforeContentPadding":I
    .end local v6    # "afterContentPadding":I
    .end local v7    # "spaceBetweenItems":I
    .local v2, "spaceBetweenItems":I
    .restart local v13    # "beforeContentPadding":I
    .restart local v14    # "afterContentPadding":I
    .restart local v25    # "itemsCount":I
    .restart local v42    # "mainAxisAvailableSize":I
    move-object/from16 v46, v0

    .line 387
    .local v46, "measureResult":Landroidx/compose/foundation/lazy/LazyListMeasureResult;
    iget-object v0, v1, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->isLookingAhead()Z

    move-result v47

    const/16 v49, 0x4

    const/16 v50, 0x0

    const/16 v48, 0x0

    move-object/from16 v45, v0

    invoke-static/range {v45 .. v50}, Landroidx/compose/foundation/lazy/LazyListState;->applyMeasureResult$foundation_release$default(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListMeasureResult;ZZILjava/lang/Object;)V

    .line 388
    return-object v46

    .line 417
    .end local v2    # "spaceBetweenItems":I
    .end local v25    # "itemsCount":I
    .end local v41    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .end local v42    # "mainAxisAvailableSize":I
    .end local v43    # "totalVerticalPadding":I
    .end local v44    # "totalHorizontalPadding":I
    .end local v46    # "measureResult":Landroidx/compose/foundation/lazy/LazyListMeasureResult;
    .local v4, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .local v5, "$i$f$withoutReadObservation":I
    .local v6, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .local v7, "observer$iv":Lkotlin/jvm/functions/Function1;
    .local v8, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .local v9, "spaceBetweenItems":I
    .local v10, "itemsCount":I
    .local v15, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v17    # "firstVisibleItemIndex":I
    .restart local v18    # "mainAxisAvailableSize":I
    .restart local v19    # "totalVerticalPadding":I
    .local v20, "firstVisibleScrollOffset":I
    .restart local v22    # "totalHorizontalPadding":I
    :catchall_0
    move-exception v0

    move-object/from16 v41, v8

    move v2, v9

    move/from16 v25, v10

    move/from16 v8, v17

    move/from16 v42, v18

    move/from16 v43, v19

    move/from16 v9, v20

    move/from16 v44, v22

    move v3, v9

    .end local v10    # "itemsCount":I
    .end local v17    # "firstVisibleItemIndex":I
    .end local v18    # "mainAxisAvailableSize":I
    .end local v19    # "totalVerticalPadding":I
    .end local v20    # "firstVisibleScrollOffset":I
    .end local v22    # "totalHorizontalPadding":I
    .restart local v2    # "spaceBetweenItems":I
    .local v8, "firstVisibleItemIndex":I
    .local v9, "firstVisibleScrollOffset":I
    .restart local v25    # "itemsCount":I
    .restart local v41    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .restart local v42    # "mainAxisAvailableSize":I
    .restart local v43    # "totalVerticalPadding":I
    .restart local v44    # "totalHorizontalPadding":I
    goto :goto_10

    .end local v2    # "spaceBetweenItems":I
    .end local v25    # "itemsCount":I
    .end local v41    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .end local v42    # "mainAxisAvailableSize":I
    .end local v43    # "totalVerticalPadding":I
    .end local v44    # "totalHorizontalPadding":I
    .restart local v3    # "firstVisibleScrollOffset":I
    .local v8, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .local v9, "spaceBetweenItems":I
    .restart local v10    # "itemsCount":I
    .restart local v17    # "firstVisibleItemIndex":I
    .restart local v18    # "mainAxisAvailableSize":I
    .restart local v19    # "totalVerticalPadding":I
    .restart local v22    # "totalHorizontalPadding":I
    :catchall_1
    move-exception v0

    move-object/from16 v41, v8

    move v2, v9

    move/from16 v25, v10

    move/from16 v8, v17

    move/from16 v42, v18

    move/from16 v43, v19

    move/from16 v44, v22

    .end local v9    # "spaceBetweenItems":I
    .end local v10    # "itemsCount":I
    .end local v17    # "firstVisibleItemIndex":I
    .end local v18    # "mainAxisAvailableSize":I
    .end local v19    # "totalVerticalPadding":I
    .end local v22    # "totalHorizontalPadding":I
    .restart local v2    # "spaceBetweenItems":I
    .local v8, "firstVisibleItemIndex":I
    .restart local v25    # "itemsCount":I
    .restart local v41    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .restart local v42    # "mainAxisAvailableSize":I
    .restart local v43    # "totalVerticalPadding":I
    .restart local v44    # "totalHorizontalPadding":I
    goto :goto_10

    .end local v2    # "spaceBetweenItems":I
    .end local v25    # "itemsCount":I
    .end local v41    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .end local v42    # "mainAxisAvailableSize":I
    .end local v43    # "totalVerticalPadding":I
    .end local v44    # "totalHorizontalPadding":I
    .local v8, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .restart local v9    # "spaceBetweenItems":I
    .restart local v10    # "itemsCount":I
    .restart local v17    # "firstVisibleItemIndex":I
    .restart local v18    # "mainAxisAvailableSize":I
    .restart local v19    # "totalVerticalPadding":I
    .restart local v22    # "totalHorizontalPadding":I
    :catchall_2
    move-exception v0

    move-object/from16 v41, v8

    move v2, v9

    move/from16 v25, v10

    move/from16 v42, v18

    move/from16 v43, v19

    move/from16 v44, v22

    .end local v8    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .end local v9    # "spaceBetweenItems":I
    .end local v10    # "itemsCount":I
    .end local v18    # "mainAxisAvailableSize":I
    .end local v19    # "totalVerticalPadding":I
    .end local v22    # "totalHorizontalPadding":I
    .restart local v2    # "spaceBetweenItems":I
    .restart local v25    # "itemsCount":I
    .restart local v41    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .restart local v42    # "mainAxisAvailableSize":I
    .restart local v43    # "totalVerticalPadding":I
    .restart local v44    # "totalHorizontalPadding":I
    :goto_10
    invoke-virtual {v4, v6, v15, v7}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    throw v0

    .line 402
    .end local v3    # "firstVisibleScrollOffset":I
    .end local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v5    # "$i$f$withoutReadObservation":I
    .end local v15    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v17    # "firstVisibleItemIndex":I
    .end local v25    # "itemsCount":I
    .end local v32    # "startPadding":I
    .end local v33    # "topPadding":I
    .end local v34    # "spaceBetweenItemsDp":F
    .end local v35    # "visualItemOffset":J
    .end local v37    # "measuredItemProvider":Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1;
    .end local v41    # "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .end local v42    # "mainAxisAvailableSize":I
    .end local v43    # "totalVerticalPadding":I
    .end local v44    # "totalHorizontalPadding":I
    .local v0, "value$iv":Ljava/lang/Object;
    .local v2, "startPadding":I
    .local v6, "topPadding":I
    .local v7, "totalVerticalPadding":I
    .local v8, "totalHorizontalPadding":I
    .local v9, "itemProvider":Landroidx/compose/foundation/lazy/LazyListItemProvider;
    .local v10, "$i$f$requirePreconditionNotNull":I
    :cond_13
    move/from16 v32, v2

    .end local v2    # "startPadding":I
    .restart local v32    # "startPadding":I
    const/4 v2, 0x0

    .line 257
    .local v2, "$i$a$-requirePreconditionNotNull-LazyListKt$rememberLazyListMeasurePolicy$1$1$spaceBetweenItemsDp$2":I
    nop

    .line 402
    .end local v2    # "$i$a$-requirePreconditionNotNull-LazyListKt$rememberLazyListMeasurePolicy$1$1$spaceBetweenItemsDp$2":I
    const-string/jumbo v2, "null horizontalAlignment when isVertical == false"

    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v2, Lkotlin/KotlinNothingValueException;

    invoke-direct {v2}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v2
.end method
