.class public final Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;
.super Ljava/lang/Object;
.source "PagerSnapLayoutInfoProvider.kt"

# interfaces
.implements Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt;->SnapLayoutInfoProvider(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPagerSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,306:1\n50#2,5:307\n222#3,4:312\n222#3,4:316\n222#3,4:320\n222#3,4:324\n222#3,4:328\n222#3,4:332\n222#3,4:336\n222#3,4:341\n222#3,4:345\n1#4:340\n34#5,6:349\n*S KotlinDebug\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1\n*L\n53#1:307,5\n61#1:312,4\n71#1:316,4\n87#1:320,4\n96#1:324,4\n102#1:328,4\n116#1:332,4\n122#1:336,4\n135#1:341,4\n142#1:345,4\n146#1:349,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0011"
    }
    d2 = {
        "androidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1",
        "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;",
        "layoutInfo",
        "Landroidx/compose/foundation/pager/PagerLayoutInfo;",
        "getLayoutInfo",
        "()Landroidx/compose/foundation/pager/PagerLayoutInfo;",
        "calculateApproachOffset",
        "",
        "velocity",
        "decayOffset",
        "calculateSnapOffset",
        "searchForSnappingBounds",
        "Lkotlin/Pair;",
        "snapPosition",
        "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
        "isValidDistance",
        "",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $calculateFinalSnappingBound:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pagerSnapDistance:Landroidx/compose/foundation/pager/PagerSnapDistance;

.field final synthetic $pagerState:Landroidx/compose/foundation/pager/PagerState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/pager/PagerSnapDistance;)V
    .locals 0
    .param p1, "$pagerState"    # Landroidx/compose/foundation/pager/PagerState;
    .param p2, "$calculateFinalSnappingBound"    # Lkotlin/jvm/functions/Function3;
    .param p3, "$pagerSnapDistance"    # Landroidx/compose/foundation/pager/PagerSnapDistance;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/foundation/pager/PagerSnapDistance;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$calculateFinalSnappingBound:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerSnapDistance:Landroidx/compose/foundation/pager/PagerSnapDistance;

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final searchForSnappingBounds(Landroidx/compose/foundation/gestures/snapping/SnapPosition;F)Lkotlin/Pair;
    .locals 21
    .param p1, "snapPosition"    # Landroidx/compose/foundation/gestures/snapping/SnapPosition;
    .param p2, "velocity"    # F
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
            "F)",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 142
    move-object/from16 v0, p0

    move/from16 v1, p2

    const/4 v2, 0x0

    .line 345
    .local v2, "$i$f$debugLog":I
    nop

    .line 348
    nop

    .line 143
    .end local v2    # "$i$f$debugLog":I
    const/4 v2, 0x0

    .local v2, "lowerBoundOffset":F
    const/high16 v2, -0x800000    # Float.NEGATIVE_INFINITY

    .line 144
    const/4 v3, 0x0

    .local v3, "upperBoundOffset":F
    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 146
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    move-result-object v4

    invoke-interface {v4}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

    move-result-object v4

    .local v4, "$this$fastForEach$iv":Ljava/util/List;
    iget-object v5, v0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    const/4 v6, 0x0

    .line 349
    .local v6, "$i$f$fastForEach":I
    nop

    .line 350
    const/4 v7, 0x0

    .local v7, "index$iv":I
    move-object v8, v4

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_2

    .line 351
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 352
    .local v9, "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Landroidx/compose/foundation/pager/PageInfo;

    .local v10, "page":Landroidx/compose/foundation/pager/PageInfo;
    const/4 v11, 0x0

    .line 149
    .local v11, "$i$a$-fastForEach-PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1$searchForSnappingBounds$2":I
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    move-result-object v12

    invoke-static {v12}, Landroidx/compose/foundation/pager/PagerLayoutInfoKt;->getMainAxisViewportSize(Landroidx/compose/foundation/pager/PagerLayoutInfo;)I

    move-result v13

    .line 150
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    move-result-object v12

    invoke-interface {v12}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getBeforeContentPadding()I

    move-result v14

    .line 151
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    move-result-object v12

    invoke-interface {v12}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getAfterContentPadding()I

    move-result v15

    .line 152
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    move-result-object v12

    invoke-interface {v12}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getPageSize()I

    move-result v16

    .line 153
    invoke-interface {v10}, Landroidx/compose/foundation/pager/PageInfo;->getOffset()I

    move-result v17

    .line 154
    invoke-interface {v10}, Landroidx/compose/foundation/pager/PageInfo;->getIndex()I

    move-result v18

    .line 155
    nop

    .line 156
    invoke-virtual {v5}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    move-result v20

    .line 148
    move-object/from16 v19, p1

    invoke-static/range {v13 .. v20}, Landroidx/compose/foundation/gestures/snapping/SnapPositionKt;->calculateDistanceToDesiredSnapPosition(IIIIIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)F

    move-result v12

    .line 147
    nop

    .line 160
    .local v12, "offset":F
    const/4 v13, 0x0

    cmpg-float v14, v12, v13

    if-gtz v14, :cond_0

    cmpl-float v14, v12, v2

    if-lez v14, :cond_0

    .line 161
    move v2, v12

    .line 165
    :cond_0
    cmpl-float v13, v12, v13

    if-ltz v13, :cond_1

    cmpg-float v13, v12, v3

    if-gez v13, :cond_1

    .line 166
    move v3, v12

    .line 168
    :cond_1
    nop

    .line 352
    .end local v10    # "page":Landroidx/compose/foundation/pager/PageInfo;
    .end local v11    # "$i$a$-fastForEach-PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1$searchForSnappingBounds$2":I
    .end local v12    # "offset":F
    nop

    .line 350
    .end local v9    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 354
    .end local v7    # "index$iv":I
    :cond_2
    nop

    .line 171
    .end local v4    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    const/high16 v4, -0x800000    # Float.NEGATIVE_INFINITY

    cmpg-float v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_3

    move v4, v6

    goto :goto_1

    :cond_3
    move v4, v5

    :goto_1
    if-eqz v4, :cond_4

    .line 172
    move v2, v3

    .line 175
    :cond_4
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v4, v3, v4

    if-nez v4, :cond_5

    move v5, v6

    :cond_5
    if-eqz v5, :cond_6

    .line 176
    move v3, v2

    .line 181
    :cond_6
    iget-object v4, v0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v4}, Landroidx/compose/foundation/pager/PagerState;->getCanScrollForward()Z

    move-result v4

    if-nez v4, :cond_7

    .line 182
    const/4 v3, 0x0

    .line 185
    iget-object v4, v0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-static {v4, v1}, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt;->access$isScrollingForward(Landroidx/compose/foundation/pager/PagerState;F)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 186
    const/4 v2, 0x0

    .line 190
    :cond_7
    iget-object v4, v0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v4}, Landroidx/compose/foundation/pager/PagerState;->getCanScrollBackward()Z

    move-result v4

    if-nez v4, :cond_8

    .line 191
    const/4 v2, 0x0

    .line 194
    iget-object v4, v0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-static {v4, v1}, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt;->access$isScrollingForward(Landroidx/compose/foundation/pager/PagerState;F)Z

    move-result v4

    if-nez v4, :cond_8

    .line 195
    const/4 v3, 0x0

    .line 198
    :cond_8
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    return-object v4
.end method


# virtual methods
.method public calculateApproachOffset(FF)F
    .locals 12
    .param p1, "velocity"    # F
    .param p2, "decayOffset"    # F

    .line 71
    const/4 v0, 0x0

    .line 316
    .local v0, "$i$f$debugLog":I
    nop

    .line 319
    nop

    .line 72
    .end local v0    # "$i$f$debugLog":I
    iget-object v0, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getPageSize$foundation_release()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v1}, Landroidx/compose/foundation/pager/PagerState;->getPageSpacing$foundation_release()I

    move-result v1

    add-int/2addr v0, v1

    .line 75
    .local v0, "effectivePageSizePx":I
    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 78
    :cond_0
    move v2, p2

    .line 81
    .local v2, "animationOffsetPx":F
    cmpg-float v1, p1, v1

    .line 84
    iget-object v3, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    .line 81
    if-gez v1, :cond_1

    .line 82
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getFirstVisiblePage$foundation_release()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 84
    :cond_1
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getFirstVisiblePage$foundation_release()I

    move-result v1

    .line 81
    :goto_0
    nop

    .line 80
    move v4, v1

    .line 87
    .local v4, "startPage":I
    const/4 v1, 0x0

    .line 320
    .local v1, "$i$f$debugLog":I
    nop

    .line 323
    nop

    .line 94
    .end local v1    # "$i$f$debugLog":I
    int-to-float v1, v0

    div-float v1, v2, v1

    .line 96
    .local v1, "pagesInAnimationOffset":F
    const/4 v3, 0x0

    .line 324
    .local v3, "$i$f$debugLog":I
    nop

    .line 327
    nop

    .line 100
    .end local v3    # "$i$f$debugLog":I
    float-to-int v3, v1

    add-int/2addr v3, v4

    iget-object v5, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v5}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    move-result v5

    const/4 v9, 0x0

    invoke-static {v3, v9, v5}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v5

    .line 99
    nop

    .line 102
    .local v5, "targetPage":I
    const/4 v3, 0x0

    .line 328
    .restart local v3    # "$i$f$debugLog":I
    nop

    .line 331
    nop

    .line 106
    .end local v3    # "$i$f$debugLog":I
    iget-object v3, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerSnapDistance:Landroidx/compose/foundation/pager/PagerSnapDistance;

    .line 108
    nop

    .line 109
    nop

    .line 110
    nop

    .line 111
    iget-object v6, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v6}, Landroidx/compose/foundation/pager/PagerState;->getPageSize$foundation_release()I

    move-result v7

    .line 112
    iget-object v6, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v6}, Landroidx/compose/foundation/pager/PagerState;->getPageSpacing$foundation_release()I

    move-result v8

    .line 107
    move v6, p1

    .end local p1    # "velocity":F
    .local v6, "velocity":F
    invoke-interface/range {v3 .. v8}, Landroidx/compose/foundation/pager/PagerSnapDistance;->calculateTargetPage(IIFII)I

    move-result p1

    .line 114
    iget-object v3, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    move-result v3

    invoke-static {p1, v9, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p1

    .line 105
    nop

    .line 116
    .local p1, "correctedTargetPage":I
    const/4 v3, 0x0

    .line 332
    .restart local v3    # "$i$f$debugLog":I
    nop

    .line 335
    nop

    .line 120
    .end local v3    # "$i$f$debugLog":I
    sub-int v3, p1, v4

    mul-int/2addr v3, v0

    .line 122
    .local v3, "proposedFlingOffset":I
    const/4 v7, 0x0

    .line 336
    .local v7, "$i$f$debugLog":I
    nop

    .line 339
    nop

    .line 127
    .end local v7    # "$i$f$debugLog":I
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v7

    sub-int/2addr v7, v0

    invoke-static {v7, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v7

    .line 126
    nop

    .line 130
    .local v7, "flingApproachOffsetPx":I
    if-nez v7, :cond_2

    .line 131
    int-to-float v8, v7

    goto :goto_1

    .line 133
    :cond_2
    int-to-float v8, v7

    invoke-static {v6}, Ljava/lang/Math;->signum(F)F

    move-result v9

    mul-float/2addr v8, v9

    .line 135
    :goto_1
    move v9, v8

    .line 340
    .local v9, "it":F
    const/4 v10, 0x0

    .line 135
    .local v10, "$i$a$-also-PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1$calculateApproachOffset$7":I
    const/4 v11, 0x0

    .line 341
    .local v11, "$i$f$debugLog":I
    nop

    .line 344
    nop

    .line 135
    .end local v11    # "$i$f$debugLog":I
    nop

    .line 130
    .end local v9    # "it":F
    .end local v10    # "$i$a$-also-PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1$calculateApproachOffset$7":I
    return v8
.end method

.method public calculateSnapOffset(F)F
    .locals 10
    .param p1, "velocity"    # F

    .line 46
    iget-object v0, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getSnapPosition()Landroidx/compose/foundation/gestures/snapping/SnapPosition;

    move-result-object v0

    .line 48
    .local v0, "snapPosition":Landroidx/compose/foundation/gestures/snapping/SnapPosition;
    invoke-direct {p0, v0, p1}, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->searchForSnappingBounds(Landroidx/compose/foundation/gestures/snapping/SnapPosition;F)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    .line 47
    nop

    .local v2, "lowerBoundOffset":F
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    .line 51
    .local v1, "upperBoundOffset":F
    iget-object v3, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$calculateFinalSnappingBound:Lkotlin/jvm/functions/Function3;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    .line 50
    nop

    .line 54
    .local v3, "finalDistance":F
    cmpg-float v4, v3, v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    const/4 v7, 0x0

    if-nez v4, :cond_4

    .line 55
    cmpg-float v4, v3, v1

    if-nez v4, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    if-nez v4, :cond_4

    .line 56
    cmpg-float v4, v3, v7

    if-nez v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_2
    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    move v5, v6

    goto :goto_4

    :cond_4
    :goto_3
    nop

    .line 53
    :goto_4
    nop

    .local v5, "value$iv":Z
    const/4 v4, 0x0

    .line 307
    .local v4, "$i$f$checkPrecondition":I
    nop

    .line 308
    if-nez v5, :cond_5

    .line 309
    const/4 v6, 0x0

    .line 58
    .local v6, "$i$a$-checkPrecondition-PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1$calculateSnapOffset$1":I
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Final Snapping Offset Should Be one of "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ", "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " or 0.0"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 309
    .end local v6    # "$i$a$-checkPrecondition-PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1$calculateSnapOffset$1":I
    invoke-static {v6}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 311
    :cond_5
    nop

    .line 61
    .end local v4    # "$i$f$checkPrecondition":I
    .end local v5    # "value$iv":Z
    const/4 v4, 0x0

    .line 312
    .local v4, "$i$f$debugLog":I
    nop

    .line 315
    nop

    .line 63
    .end local v4    # "$i$f$debugLog":I
    invoke-virtual {p0, v3}, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->isValidDistance(F)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 64
    move v7, v3

    goto :goto_5

    .line 66
    :cond_6
    nop

    .line 63
    :goto_5
    return v7
.end method

.method public final getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;
    .locals 1

    .line 39
    iget-object v0, p0, Landroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;->$pagerState:Landroidx/compose/foundation/pager/PagerState;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerState;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    move-result-object v0

    return-object v0
.end method

.method public final isValidDistance(F)Z
    .locals 3
    .param p1, "$this$isValidDistance"    # F

    .line 42
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v0, p1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_2

    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    cmpg-float v0, p1, v0

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    return v1
.end method
