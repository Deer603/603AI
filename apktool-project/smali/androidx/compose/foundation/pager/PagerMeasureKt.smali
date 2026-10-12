.class public final Landroidx/compose/foundation/pager/PagerMeasureKt;
.super Ljava/lang/Object;
.source "PagerMeasure.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n698#1,4:713\n698#1,4:717\n698#1,4:721\n698#1,4:725\n698#1,4:729\n698#1,4:733\n698#1,4:784\n96#2,5:703\n96#2,5:708\n96#2,5:737\n50#2,5:813\n96#2,5:818\n34#3,6:742\n34#3,6:748\n230#3,3:754\n34#3,6:757\n233#3:763\n230#3,3:764\n34#3,6:767\n233#3:773\n230#3,3:774\n34#3,6:777\n233#3:783\n34#3,6:788\n34#3,6:794\n168#3,13:800\n34#3,6:824\n34#3,6:830\n34#3,6:836\n1#4:823\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n71#1:713,4\n139#1:717,4\n160#1:721,4\n181#1:725,4\n220#1:729,4\n244#1:733,4\n456#1:784,4\n67#1:703,5\n68#1:708,5\n301#1:737,5\n626#1:813,5\n634#1:818,5\n348#1:742,6\n373#1:748,6\n410#1:754,3\n410#1:757,6\n410#1:763\n417#1:764,3\n417#1:767,6\n417#1:773\n421#1:774,3\n421#1:777,6\n421#1:783\n516#1:788,6\n541#1:794,6\n560#1:800,13\n672#1:824,6\n679#1:830,6\n685#1:836,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aH\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u001aH\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a@\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0015H\u0002\u001a\u0017\u0010\u0018\u001a\u00020\u00192\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\u0008\u001a\u008c\u0001\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001e*\u00020\u001f2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002\u001aj\u0010\u0014\u001a\u00020\u0004*\u00020\u001f2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010(\u001a\u00020)2\u0008\u00107\u001a\u0004\u0018\u0001082\u0008\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\u0006\u0010*\u001a\u00020+2\u0006\u0010/\u001a\u00020\u0006H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008=\u0010>\u001a\u00f1\u0001\u0010?\u001a\u00020@*\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u00103\u001a\u0002042\u0006\u0010A\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u0002022\u0006\u0010(\u001a\u00020)2\u0008\u00109\u001a\u0004\u0018\u00010:2\u0008\u00107\u001a\u0004\u0018\u0001082\u0006\u0010*\u001a\u00020+2\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2/\u0010I\u001a+\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00190\u0015\u00a2\u0006\u0002\u0008L\u0012\u0004\u0012\u00020M0JH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008N\u0010O\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006P"
    }
    d2 = {
        "MaxPageOffset",
        "",
        "MinPageOffset",
        "calculateNewCurrentPage",
        "Landroidx/compose/foundation/pager/MeasuredPage;",
        "viewportSize",
        "",
        "visiblePagesInfo",
        "",
        "beforeContentPadding",
        "afterContentPadding",
        "itemSize",
        "snapPosition",
        "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
        "pageCount",
        "createPagesAfterList",
        "currentLastPage",
        "pagesCount",
        "beyondViewportPageCount",
        "pinnedPages",
        "getAndMeasure",
        "Lkotlin/Function1;",
        "createPagesBeforeList",
        "currentFirstPage",
        "debugLog",
        "",
        "generateMsg",
        "Lkotlin/Function0;",
        "",
        "calculatePagesOffsets",
        "",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "pages",
        "extraPagesBefore",
        "extraPagesAfter",
        "layoutWidth",
        "layoutHeight",
        "finalMainAxisOffset",
        "maxOffset",
        "pagesScrollOffset",
        "orientation",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "reverseLayout",
        "",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "spaceBetweenPages",
        "pageAvailableSize",
        "index",
        "childConstraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "pagerItemProvider",
        "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
        "visualPageOffset",
        "Landroidx/compose/ui/unit/IntOffset;",
        "horizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "verticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "getAndMeasure-SGf7dI0",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;",
        "measurePager",
        "Landroidx/compose/foundation/pager/PagerMeasureResult;",
        "mainAxisAvailableSize",
        "currentPage",
        "currentPageOffset",
        "constraints",
        "placementScopeInvalidator",
        "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "layout",
        "Lkotlin/Function3;",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/ExtensionFunctionType;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measurePager-bmk8ZPk",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;",
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
.field public static final MaxPageOffset:F = 0.5f

.field public static final MinPageOffset:F = -0.5f


# direct methods
.method public static final synthetic access$getAndMeasure-SGf7dI0(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "index"    # I
    .param p2, "childConstraints"    # J
    .param p4, "pagerItemProvider"    # Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    .param p5, "visualPageOffset"    # J
    .param p7, "orientation"    # Landroidx/compose/foundation/gestures/Orientation;
    .param p8, "horizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p9, "verticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p10, "layoutDirection"    # Landroidx/compose/ui/unit/LayoutDirection;
    .param p11, "reverseLayout"    # Z
    .param p12, "pageAvailableSize"    # I

    .line 1
    invoke-static/range {p0 .. p12}, Landroidx/compose/foundation/pager/PagerMeasureKt;->getAndMeasure-SGf7dI0(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;

    move-result-object v0

    return-object v0
.end method

.method private static final calculateNewCurrentPage(ILjava/util/List;IIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)Landroidx/compose/foundation/pager/MeasuredPage;
    .locals 18
    .param p0, "viewportSize"    # I
    .param p1, "visiblePagesInfo"    # Ljava/util/List;
    .param p2, "beforeContentPadding"    # I
    .param p3, "afterContentPadding"    # I
    .param p4, "itemSize"    # I
    .param p5, "snapPosition"    # Landroidx/compose/foundation/gestures/snapping/SnapPosition;
    .param p6, "pageCount"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;III",
            "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
            "I)",
            "Landroidx/compose/foundation/pager/MeasuredPage;"
        }
    .end annotation

    .line 560
    move-object/from16 v0, p1

    .local v0, "$this$fastMaxBy$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 800
    .local v1, "$i$f$fastMaxBy":I
    nop

    .line 801
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto/16 :goto_1

    .line 802
    :cond_0
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 803
    .local v2, "maxElem$iv":Ljava/lang/Object;
    move-object v3, v2

    check-cast v3, Landroidx/compose/foundation/pager/MeasuredPage;

    .local v3, "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/4 v4, 0x0

    .line 561
    .local v4, "$i$a$-fastMaxBy-PagerMeasureKt$calculateNewCurrentPage$1":I
    nop

    .line 563
    nop

    .line 564
    nop

    .line 565
    nop

    .line 566
    nop

    .line 567
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/MeasuredPage;->getOffset()I

    move-result v9

    .line 568
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v10

    .line 569
    nop

    .line 570
    nop

    .line 562
    move/from16 v5, p0

    move/from16 v6, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move-object/from16 v11, p5

    move/from16 v12, p6

    invoke-static/range {v5 .. v12}, Landroidx/compose/foundation/gestures/snapping/SnapPositionKt;->calculateDistanceToDesiredSnapPosition(IIIIIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v5

    .line 561
    neg-float v5, v5

    .line 572
    nop

    .line 803
    .end local v3    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v4    # "$i$a$-fastMaxBy-PagerMeasureKt$calculateNewCurrentPage$1":I
    nop

    .line 804
    .local v5, "maxValue$iv":F
    const/4 v3, 0x1

    .local v3, "i$iv":I
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v4

    if-gt v3, v4, :cond_2

    .line 805
    :goto_0
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 806
    .local v6, "e$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Landroidx/compose/foundation/pager/MeasuredPage;

    .local v7, "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/4 v8, 0x0

    .line 561
    .local v8, "$i$a$-fastMaxBy-PagerMeasureKt$calculateNewCurrentPage$1":I
    nop

    .line 563
    nop

    .line 564
    nop

    .line 565
    nop

    .line 566
    nop

    .line 567
    invoke-virtual {v7}, Landroidx/compose/foundation/pager/MeasuredPage;->getOffset()I

    move-result v14

    .line 568
    invoke-virtual {v7}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v15

    .line 569
    nop

    .line 570
    nop

    .line 562
    move/from16 v10, p0

    move/from16 v11, p2

    move/from16 v12, p3

    move/from16 v13, p4

    move-object/from16 v16, p5

    move/from16 v17, p6

    invoke-static/range {v10 .. v17}, Landroidx/compose/foundation/gestures/snapping/SnapPositionKt;->calculateDistanceToDesiredSnapPosition(IIIIIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    .line 561
    neg-float v9, v9

    .line 572
    nop

    .line 806
    .end local v7    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v8    # "$i$a$-fastMaxBy-PagerMeasureKt$calculateNewCurrentPage$1":I
    nop

    .line 807
    .local v9, "v$iv":F
    invoke-static {v5, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v7

    if-gez v7, :cond_1

    .line 808
    move-object v2, v6

    .line 809
    move v5, v9

    .line 804
    .end local v6    # "e$iv":Ljava/lang/Object;
    .end local v9    # "v$iv":F
    :cond_1
    if-eq v3, v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 812
    .end local v3    # "i$iv":I
    :cond_2
    nop

    .end local v0    # "$this$fastMaxBy$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastMaxBy":I
    .end local v2    # "maxElem$iv":Ljava/lang/Object;
    .end local v5    # "maxValue$iv":F
    :goto_1
    check-cast v2, Landroidx/compose/foundation/pager/MeasuredPage;

    .line 560
    return-object v2
.end method

.method private static final calculatePagesOffsets(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/Density;II)Ljava/util/List;
    .locals 22
    .param p0, "$this$calculatePagesOffsets"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "pages"    # Ljava/util/List;
    .param p2, "extraPagesBefore"    # Ljava/util/List;
    .param p3, "extraPagesAfter"    # Ljava/util/List;
    .param p4, "layoutWidth"    # I
    .param p5, "layoutHeight"    # I
    .param p6, "finalMainAxisOffset"    # I
    .param p7, "maxOffset"    # I
    .param p8, "pagesScrollOffset"    # I
    .param p9, "orientation"    # Landroidx/compose/foundation/gestures/Orientation;
    .param p10, "reverseLayout"    # Z
    .param p11, "density"    # Landroidx/compose/ui/unit/Density;
    .param p12, "spaceBetweenPages"    # I
    .param p13, "pageAvailableSize"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;IIIII",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "II)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;"
        }
    .end annotation

    .line 622
    move/from16 v0, p4

    move/from16 v1, p5

    move/from16 v2, p8

    move-object/from16 v3, p9

    move/from16 v4, p10

    move/from16 v5, p12

    add-int v6, p13, v5

    .line 623
    .local v6, "pageSizeWithSpacing":I
    sget-object v7, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v3, v7, :cond_0

    move v7, v1

    goto :goto_0

    :cond_0
    move v7, v0

    :goto_0
    move v10, v7

    .line 624
    .local v10, "mainAxisLayoutSize":I
    move/from16 v7, p7

    invoke-static {v10, v7}, Ljava/lang/Math;->min(II)I

    move-result v8

    move/from16 v14, p6

    if-ge v14, v8, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    move v15, v8

    .line 625
    .local v15, "hasSpareSpace":Z
    if-eqz v15, :cond_4

    .line 626
    if-nez v2, :cond_2

    const/4 v8, 0x1

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    .local v8, "value$iv":Z
    :goto_2
    const/4 v12, 0x0

    .line 813
    .local v12, "$i$f$checkPrecondition":I
    nop

    .line 814
    if-nez v8, :cond_3

    .line 815
    const/4 v13, 0x0

    .line 627
    .local v13, "$i$a$-checkPrecondition-PagerMeasureKt$calculatePagesOffsets$1":I
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v11, "non-zero pagesScrollOffset="

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 815
    .end local v13    # "$i$a$-checkPrecondition-PagerMeasureKt$calculatePagesOffsets$1":I
    invoke-static {v9}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 817
    :cond_3
    nop

    .line 631
    .end local v8    # "value$iv":Z
    .end local v12    # "$i$f$checkPrecondition":I
    :cond_4
    new-instance v8, Ljava/util/ArrayList;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v9

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v11

    add-int/2addr v9, v11

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v11

    add-int/2addr v9, v11

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 630
    nop

    .line 633
    .local v8, "positionedPages":Ljava/util/ArrayList;
    if-eqz v15, :cond_e

    .line 634
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_5

    const/4 v11, 0x1

    goto :goto_3

    :cond_5
    const/4 v11, 0x0

    .local v11, "value$iv":Z
    :goto_3
    const/4 v9, 0x0

    .line 818
    .local v9, "$i$f$requirePrecondition":I
    nop

    .line 819
    if-nez v11, :cond_6

    .line 820
    const/4 v12, 0x0

    .line 635
    .local v12, "$i$a$-requirePrecondition-PagerMeasureKt$calculatePagesOffsets$2":I
    nop

    .line 820
    .end local v12    # "$i$a$-requirePrecondition-PagerMeasureKt$calculatePagesOffsets$2":I
    const-string v12, "No extra pages"

    invoke-static {v12}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 822
    :cond_6
    nop

    .line 638
    .end local v9    # "$i$f$requirePrecondition":I
    .end local v11    # "value$iv":Z
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v9

    .line 641
    .local v9, "pagesCount":I
    new-array v11, v9, [I

    const/4 v12, 0x0

    :goto_4
    if-ge v12, v9, :cond_7

    aput p13, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    .line 642
    .local v11, "sizes":[I
    :cond_7
    new-array v13, v9, [I

    .line 644
    .local v13, "offsets":[I
    sget-object v12, Landroidx/compose/foundation/layout/Arrangement$Absolute;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement$Absolute;

    move-object/from16 v2, p0

    move/from16 v16, v6

    .end local v6    # "pageSizeWithSpacing":I
    .local v16, "pageSizeWithSpacing":I
    invoke-interface {v2, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->toDp-u2uoSUM(I)F

    move-result v6

    invoke-virtual {v12, v6}, Landroidx/compose/foundation/layout/Arrangement$Absolute;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v6

    .line 645
    .local v6, "arrangement":Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    sget-object v12, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v3, v12, :cond_8

    .line 646
    move-object v12, v6

    .line 823
    .local v12, "$this$calculatePagesOffsets_u24lambda_u2420":Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    const/16 v17, 0x0

    .line 646
    .local v17, "$i$a$-with-PagerMeasureKt$calculatePagesOffsets$3":I
    move-object/from16 v2, p11

    invoke-interface {v12, v2, v10, v11, v13}, Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    move-object v2, v8

    move v3, v9

    .end local v12    # "$this$calculatePagesOffsets_u24lambda_u2420":Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .end local v17    # "$i$a$-with-PagerMeasureKt$calculatePagesOffsets$3":I
    goto :goto_5

    .line 648
    :cond_8
    move-object/from16 v2, p11

    move-object v12, v8

    .end local v8    # "positionedPages":Ljava/util/ArrayList;
    .local v12, "positionedPages":Ljava/util/ArrayList;
    move-object v8, v6

    .local v8, "$this$calculatePagesOffsets_u24lambda_u2421":Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    const/16 v17, 0x0

    .line 650
    .local v17, "$i$a$-with-PagerMeasureKt$calculatePagesOffsets$4":I
    move-object/from16 v18, v12

    .end local v12    # "positionedPages":Ljava/util/ArrayList;
    .local v18, "positionedPages":Ljava/util/ArrayList;
    sget-object v12, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    move v3, v9

    move-object v9, v2

    move-object/from16 v2, v18

    .end local v9    # "pagesCount":I
    .end local v18    # "positionedPages":Ljava/util/ArrayList;
    .local v2, "positionedPages":Ljava/util/ArrayList;
    .local v3, "pagesCount":I
    invoke-interface/range {v8 .. v13}, Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 651
    nop

    .line 648
    .end local v8    # "$this$calculatePagesOffsets_u24lambda_u2421":Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .end local v17    # "$i$a$-with-PagerMeasureKt$calculatePagesOffsets$4":I
    nop

    .line 655
    :goto_5
    invoke-static {v13}, Lkotlin/collections/ArraysKt;->getIndices([I)Lkotlin/ranges/IntRange;

    move-result-object v8

    check-cast v8, Lkotlin/ranges/IntProgression;

    if-nez v4, :cond_9

    goto :goto_6

    :cond_9
    invoke-static {v8}, Lkotlin/ranges/RangesKt;->reversed(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;

    move-result-object v8

    .line 654
    :goto_6
    nop

    .line 656
    .local v8, "reverseAwareOffsetIndices":Lkotlin/ranges/IntProgression;
    invoke-virtual {v8}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v9

    .local v9, "index":I
    invoke-virtual {v8}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v12

    invoke-virtual {v8}, Lkotlin/ranges/IntProgression;->getStep()I

    move-result v17

    if-lez v17, :cond_a

    if-le v9, v12, :cond_b

    :cond_a
    if-gez v17, :cond_d

    if-gt v12, v9, :cond_d

    .line 657
    :cond_b
    :goto_7
    aget v18, v13, v9

    .line 659
    .local v18, "absoluteOffset":I
    invoke-static {v9, v4, v3}, Landroidx/compose/foundation/pager/PagerMeasureKt;->calculatePagesOffsets$reverseAware(IZI)I

    move-result v5

    move/from16 v19, v3

    move-object/from16 v3, p1

    .end local v3    # "pagesCount":I
    .local v19, "pagesCount":I
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/pager/MeasuredPage;

    .line 661
    .local v5, "page":Landroidx/compose/foundation/pager/MeasuredPage;
    if-eqz v4, :cond_c

    .line 663
    sub-int v20, v10, v18

    invoke-virtual {v5}, Landroidx/compose/foundation/pager/MeasuredPage;->getSize()I

    move-result v21

    sub-int v20, v20, v21

    goto :goto_8

    .line 665
    :cond_c
    move/from16 v20, v18

    .line 661
    :goto_8
    nop

    .line 660
    move/from16 v21, v20

    .line 667
    .local v21, "relativeOffset":I
    move/from16 v3, v21

    .end local v21    # "relativeOffset":I
    .local v3, "relativeOffset":I
    invoke-virtual {v5, v3, v0, v1}, Landroidx/compose/foundation/pager/MeasuredPage;->position(III)V

    .line 668
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 656
    .end local v3    # "relativeOffset":I
    .end local v5    # "page":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v18    # "absoluteOffset":I
    if-eq v9, v12, :cond_12

    add-int v9, v9, v17

    move/from16 v5, p12

    move/from16 v3, v19

    goto :goto_7

    .end local v19    # "pagesCount":I
    .local v3, "pagesCount":I
    :cond_d
    move/from16 v19, v3

    .end local v3    # "pagesCount":I
    .restart local v19    # "pagesCount":I
    goto/16 :goto_c

    .line 671
    .end local v2    # "positionedPages":Ljava/util/ArrayList;
    .end local v9    # "index":I
    .end local v11    # "sizes":[I
    .end local v13    # "offsets":[I
    .end local v16    # "pageSizeWithSpacing":I
    .end local v19    # "pagesCount":I
    .local v6, "pageSizeWithSpacing":I
    .local v8, "positionedPages":Ljava/util/ArrayList;
    :cond_e
    move/from16 v16, v6

    move-object v2, v8

    .end local v6    # "pageSizeWithSpacing":I
    .end local v8    # "positionedPages":Ljava/util/ArrayList;
    .restart local v2    # "positionedPages":Ljava/util/ArrayList;
    .restart local v16    # "pageSizeWithSpacing":I
    const/4 v3, 0x0

    .local v3, "currentMainAxis":I
    move/from16 v3, p8

    .line 672
    move-object/from16 v5, p2

    .local v5, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 824
    .local v6, "$i$f$fastForEach":I
    nop

    .line 825
    const/4 v8, 0x0

    .local v8, "index$iv":I
    move-object v9, v5

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_9
    if-ge v8, v9, :cond_f

    .line 826
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 827
    .local v11, "item$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Landroidx/compose/foundation/pager/MeasuredPage;

    .local v12, "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/4 v13, 0x0

    .line 673
    .local v13, "$i$a$-fastForEach-PagerMeasureKt$calculatePagesOffsets$5":I
    sub-int v3, v3, v16

    .line 674
    invoke-virtual {v12, v3, v0, v1}, Landroidx/compose/foundation/pager/MeasuredPage;->position(III)V

    .line 675
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 676
    nop

    .line 827
    .end local v12    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v13    # "$i$a$-fastForEach-PagerMeasureKt$calculatePagesOffsets$5":I
    nop

    .line 825
    .end local v11    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    .line 829
    .end local v8    # "index$iv":I
    :cond_f
    nop

    .line 678
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    move/from16 v3, p8

    .line 679
    move-object/from16 v5, p1

    .restart local v5    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 830
    .restart local v6    # "$i$f$fastForEach":I
    nop

    .line 831
    const/4 v8, 0x0

    .restart local v8    # "index$iv":I
    move-object v9, v5

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_a
    if-ge v8, v9, :cond_10

    .line 832
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 833
    .restart local v11    # "item$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Landroidx/compose/foundation/pager/MeasuredPage;

    .restart local v12    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/4 v13, 0x0

    .line 680
    .local v13, "$i$a$-fastForEach-PagerMeasureKt$calculatePagesOffsets$6":I
    invoke-virtual {v12, v3, v0, v1}, Landroidx/compose/foundation/pager/MeasuredPage;->position(III)V

    .line 681
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 682
    add-int v3, v3, v16

    .line 683
    nop

    .line 833
    .end local v12    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v13    # "$i$a$-fastForEach-PagerMeasureKt$calculatePagesOffsets$6":I
    nop

    .line 831
    .end local v11    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    .line 835
    .end local v8    # "index$iv":I
    :cond_10
    nop

    .line 685
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    move-object/from16 v5, p3

    .restart local v5    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 836
    .restart local v6    # "$i$f$fastForEach":I
    nop

    .line 837
    const/4 v8, 0x0

    .restart local v8    # "index$iv":I
    move-object v9, v5

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_b
    if-ge v8, v9, :cond_11

    .line 838
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 839
    .restart local v11    # "item$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Landroidx/compose/foundation/pager/MeasuredPage;

    .restart local v12    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/4 v13, 0x0

    .line 686
    .local v13, "$i$a$-fastForEach-PagerMeasureKt$calculatePagesOffsets$7":I
    invoke-virtual {v12, v3, v0, v1}, Landroidx/compose/foundation/pager/MeasuredPage;->position(III)V

    .line 687
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 688
    add-int v3, v3, v16

    .line 689
    nop

    .line 839
    .end local v12    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v13    # "$i$a$-fastForEach-PagerMeasureKt$calculatePagesOffsets$7":I
    nop

    .line 837
    .end local v11    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    .line 841
    .end local v8    # "index$iv":I
    :cond_11
    nop

    .line 691
    .end local v3    # "currentMainAxis":I
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    :cond_12
    :goto_c
    move-object v3, v2

    check-cast v3, Ljava/util/List;

    return-object v3
.end method

.method private static final calculatePagesOffsets$reverseAware(IZI)I
    .locals 1
    .param p0, "$this$calculatePagesOffsets_u24reverseAware"    # I
    .param p1, "$reverseLayout"    # Z
    .param p2, "pagesCount"    # I

    .line 639
    if-nez p1, :cond_0

    move v0, p0

    goto :goto_0

    :cond_0
    sub-int v0, p2, p0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0
.end method

.method private static final createPagesAfterList(IIILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 11
    .param p0, "currentLastPage"    # I
    .param p1, "pagesCount"    # I
    .param p2, "beyondViewportPageCount"    # I
    .param p3, "pinnedPages"    # Ljava/util/List;
    .param p4, "getAndMeasure"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;"
        }
    .end annotation

    .line 507
    const/4 v0, 0x0

    .line 509
    .local v0, "list":Ljava/lang/Object;
    add-int v1, p0, p2

    add-int/lit8 v2, p1, -0x1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 511
    .local v1, "end":I
    add-int/lit8 v2, p0, 0x1

    .local v2, "i":I
    if-gt v2, v1, :cond_1

    .line 512
    :goto_0
    if-nez v0, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 513
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 511
    if-eq v2, v1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 516
    .end local v2    # "i":I
    :cond_1
    move-object v2, p3

    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 788
    .local v3, "$i$f$fastForEach":I
    nop

    .line 789
    const/4 v4, 0x0

    .local v4, "index$iv":I
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_1
    if-ge v4, v5, :cond_5

    .line 790
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 791
    .local v6, "item$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .local v7, "pageIndex":I
    const/4 v8, 0x0

    .line 517
    .local v8, "$i$a$-fastForEach-PagerMeasureKt$createPagesAfterList$1":I
    add-int/lit8 v9, v1, 0x1

    const/4 v10, 0x0

    if-gt v9, v7, :cond_2

    if-ge v7, p1, :cond_2

    const/4 v10, 0x1

    :cond_2
    if-eqz v10, :cond_4

    .line 518
    if-nez v0, :cond_3

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    move-object v0, v9

    check-cast v0, Ljava/util/List;

    .line 519
    :cond_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {p4, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 521
    :cond_4
    nop

    .line 791
    .end local v7    # "pageIndex":I
    .end local v8    # "$i$a$-fastForEach-PagerMeasureKt$createPagesAfterList$1":I
    nop

    .line 789
    .end local v6    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 793
    .end local v4    # "index$iv":I
    :cond_5
    nop

    .line 523
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    if-nez v0, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_2

    :cond_6
    move-object v2, v0

    :goto_2
    return-object v2
.end method

.method private static final createPagesBeforeList(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 10
    .param p0, "currentFirstPage"    # I
    .param p1, "beyondViewportPageCount"    # I
    .param p2, "pinnedPages"    # Ljava/util/List;
    .param p3, "getAndMeasure"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;"
        }
    .end annotation

    .line 532
    const/4 v0, 0x0

    .line 534
    .local v0, "list":Ljava/lang/Object;
    const/4 v1, 0x0

    sub-int v2, p0, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 536
    .local v1, "start":I
    add-int/lit8 v2, p0, -0x1

    .local v2, "i":I
    if-gt v1, v2, :cond_1

    .line 537
    :goto_0
    if-nez v0, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 538
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 536
    if-eq v2, v1, :cond_1

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 541
    .end local v2    # "i":I
    :cond_1
    move-object v2, p2

    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 794
    .local v3, "$i$f$fastForEach":I
    nop

    .line 795
    const/4 v4, 0x0

    .local v4, "index$iv":I
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_1
    if-ge v4, v5, :cond_4

    .line 796
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 797
    .local v6, "item$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .local v7, "pageIndex":I
    const/4 v8, 0x0

    .line 542
    .local v8, "$i$a$-fastForEach-PagerMeasureKt$createPagesBeforeList$1":I
    if-ge v7, v1, :cond_3

    .line 543
    if-nez v0, :cond_2

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    move-object v0, v9

    check-cast v0, Ljava/util/List;

    .line 544
    :cond_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {p3, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 546
    :cond_3
    nop

    .line 797
    .end local v7    # "pageIndex":I
    .end local v8    # "$i$a$-fastForEach-PagerMeasureKt$createPagesBeforeList$1":I
    nop

    .line 795
    .end local v6    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 799
    .end local v4    # "index$iv":I
    :cond_4
    nop

    .line 548
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    if-nez v0, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_2

    :cond_5
    move-object v2, v0

    :goto_2
    return-object v2
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

    .line 698
    .local v0, "$i$f$debugLog":I
    nop

    .line 701
    return-void
.end method

.method private static final getAndMeasure-SGf7dI0(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;
    .locals 14
    .param p0, "$this$getAndMeasure_u2dSGf7dI0"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "index"    # I
    .param p2, "childConstraints"    # J
    .param p4, "pagerItemProvider"    # Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    .param p5, "visualPageOffset"    # J
    .param p7, "orientation"    # Landroidx/compose/foundation/gestures/Orientation;
    .param p8, "horizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p9, "verticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p10, "layoutDirection"    # Landroidx/compose/ui/unit/LayoutDirection;
    .param p11, "reverseLayout"    # Z
    .param p12, "pageAvailableSize"    # I

    .line 589
    move-object/from16 v0, p4

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;->getKey(I)Ljava/lang/Object;

    move-result-object v7

    .line 590
    .local v7, "key":Ljava/lang/Object;
    invoke-interface/range {p0 .. p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->measure-0kLqBqw(IJ)Ljava/util/List;

    move-result-object v4

    .line 592
    .local v4, "placeable":Ljava/util/List;
    new-instance v1, Landroidx/compose/foundation/pager/MeasuredPage;

    .line 593
    nop

    .line 600
    nop

    .line 594
    nop

    .line 595
    nop

    .line 602
    nop

    .line 601
    nop

    .line 596
    nop

    .line 597
    nop

    .line 598
    nop

    .line 599
    nop

    .line 592
    const/4 v13, 0x0

    move v2, p1

    move-wide/from16 v5, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v3, p12

    invoke-direct/range {v1 .. v13}, Landroidx/compose/foundation/pager/MeasuredPage;-><init>(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final measurePager-bmk8ZPk(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;
    .locals 49
    .param p0, "$this$measurePager_u2dbmk8ZPk"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "pageCount"    # I
    .param p2, "pagerItemProvider"    # Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
    .param p3, "mainAxisAvailableSize"    # I
    .param p4, "beforeContentPadding"    # I
    .param p5, "afterContentPadding"    # I
    .param p6, "spaceBetweenPages"    # I
    .param p7, "currentPage"    # I
    .param p8, "currentPageOffset"    # I
    .param p9, "constraints"    # J
    .param p11, "orientation"    # Landroidx/compose/foundation/gestures/Orientation;
    .param p12, "verticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p13, "horizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p14, "reverseLayout"    # Z
    .param p15, "visualPageOffset"    # J
    .param p17, "pageAvailableSize"    # I
    .param p18, "beyondViewportPageCount"    # I
    .param p19, "pinnedPages"    # Ljava/util/List;
    .param p20, "snapPosition"    # Landroidx/compose/foundation/gestures/snapping/SnapPosition;
    .param p21, "placementScopeInvalidator"    # Landroidx/compose/runtime/MutableState;
    .param p22, "coroutineScope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p23, "layout"    # Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "I",
            "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
            "IIIIIIJ",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "ZJII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/Unit;",
            ">;+",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;)",
            "Landroidx/compose/foundation/pager/PagerMeasureResult;"
        }
    .end annotation

    .line 67
    move/from16 v6, p1

    move/from16 v2, p4

    move-object/from16 v0, p19

    move-object/from16 v1, p23

    const/4 v3, 0x0

    const/16 v23, 0x1

    if-ltz v2, :cond_0

    move/from16 v4, v23

    goto :goto_0

    :cond_0
    move v4, v3

    .local v4, "value$iv":Z
    :goto_0
    const/4 v5, 0x0

    .line 703
    .local v5, "$i$f$requirePrecondition":I
    nop

    .line 704
    if-nez v4, :cond_1

    .line 705
    const/4 v9, 0x0

    .line 67
    .local v9, "$i$a$-requirePrecondition-PagerMeasureKt$measurePager$1":I
    nop

    .line 705
    .end local v9    # "$i$a$-requirePrecondition-PagerMeasureKt$measurePager$1":I
    const-string/jumbo v9, "negative beforeContentPadding"

    invoke-static {v9}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 707
    :cond_1
    nop

    .line 68
    .end local v4    # "value$iv":Z
    .end local v5    # "$i$f$requirePrecondition":I
    if-ltz p5, :cond_2

    move/from16 v4, v23

    goto :goto_1

    :cond_2
    move v4, v3

    .restart local v4    # "value$iv":Z
    :goto_1
    const/4 v5, 0x0

    .line 708
    .restart local v5    # "$i$f$requirePrecondition":I
    nop

    .line 709
    if-nez v4, :cond_3

    .line 710
    const/4 v9, 0x0

    .line 68
    .local v9, "$i$a$-requirePrecondition-PagerMeasureKt$measurePager$2":I
    nop

    .line 710
    .end local v9    # "$i$a$-requirePrecondition-PagerMeasureKt$measurePager$2":I
    const-string/jumbo v9, "negative afterContentPadding"

    invoke-static {v9}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 712
    :cond_3
    nop

    .line 69
    .end local v4    # "value$iv":Z
    .end local v5    # "$i$f$requirePrecondition":I
    add-int v4, p17, p6

    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v4

    .line 71
    .local v4, "pageSizeWithSpacing":I
    const/4 v5, 0x0

    .line 713
    .local v5, "$i$f$debugLog":I
    nop

    .line 716
    nop

    .line 78
    .end local v5    # "$i$f$debugLog":I
    if-gtz v6, :cond_4

    .line 80
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v10

    .line 85
    neg-int v15, v2

    .line 86
    add-int v16, p3, p5

    .line 87
    invoke-static/range {p9 .. p10}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static/range {p9 .. p10}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v9, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$4;->INSTANCE:Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$4;

    invoke-interface {v1, v3, v5, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v25, v3

    check-cast v25, Landroidx/compose/ui/layout/MeasureResult;

    .line 79
    new-instance v9, Landroidx/compose/foundation/pager/PagerMeasureResult;

    .line 80
    nop

    .line 81
    nop

    .line 82
    nop

    .line 83
    nop

    .line 84
    nop

    .line 85
    nop

    .line 86
    nop

    .line 90
    nop

    .line 91
    nop

    .line 88
    nop

    .line 93
    nop

    .line 94
    nop

    .line 89
    nop

    .line 92
    nop

    .line 95
    nop

    .line 87
    nop

    .line 96
    nop

    .line 79
    nop

    .line 97
    nop

    .line 79
    const/high16 v30, 0x60000

    const/16 v31, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v13, p5

    move/from16 v12, p6

    move-object/from16 v14, p11

    move/from16 v11, p17

    move/from16 v18, p18

    move-object/from16 v24, p20

    move-object/from16 v29, p22

    invoke-direct/range {v9 .. v31}, Landroidx/compose/foundation/pager/PagerMeasureResult;-><init>(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/ui/layout/MeasureResult;ZLjava/util/List;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v5, v18

    .line 78
    return-object v9

    .line 102
    :cond_4
    move-object/from16 v14, p11

    move/from16 v5, p18

    .line 104
    sget-object v9, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v14, v9, :cond_5

    .line 105
    invoke-static/range {p9 .. p10}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v9

    move/from16 v16, v9

    goto :goto_2

    .line 107
    :cond_5
    move/from16 v16, p17

    .line 102
    :goto_2
    nop

    .line 110
    sget-object v9, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-eq v14, v9, :cond_6

    .line 111
    invoke-static/range {p9 .. p10}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v9

    move/from16 v18, v9

    goto :goto_3

    .line 113
    :cond_6
    move/from16 v18, p17

    .line 102
    :goto_3
    const/16 v19, 0x5

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v11

    .line 101
    nop

    .line 117
    .local v11, "childConstraints":J
    const/4 v9, 0x0

    .local v9, "firstVisiblePage":I
    move/from16 v9, p7

    .line 118
    move/from16 v10, p8

    move/from16 v30, v9

    move/from16 v31, v10

    .line 122
    .end local v9    # "firstVisiblePage":I
    .local v30, "firstVisiblePage":I
    .local v31, "firstVisiblePageOffset":I
    :goto_4
    if-lez v30, :cond_7

    if-lez v31, :cond_7

    .line 123
    add-int/lit8 v30, v30, -0x1

    .line 124
    sub-int v31, v31, v4

    goto :goto_4

    .line 128
    :cond_7
    mul-int/lit8 v32, v31, -0x1

    .line 130
    .local v32, "firstVisiblePageScrollOffset":I
    move/from16 v9, v30

    .line 131
    .local v9, "currentFirstPage":I
    const/4 v10, 0x0

    .local v10, "currentFirstPageScrollOffset":I
    move/from16 v10, v32

    .line 132
    if-lt v9, v6, :cond_8

    .line 135
    add-int/lit8 v9, v6, -0x1

    .line 136
    const/4 v10, 0x0

    .line 139
    :cond_8
    const/4 v13, 0x0

    .line 717
    .local v13, "$i$f$debugLog":I
    nop

    .line 720
    nop

    .line 146
    .end local v13    # "$i$f$debugLog":I
    new-instance v13, Lkotlin/collections/ArrayDeque;

    invoke-direct {v13}, Lkotlin/collections/ArrayDeque;-><init>()V

    .line 149
    .local v13, "visiblePages":Lkotlin/collections/ArrayDeque;
    neg-int v15, v2

    if-gez p6, :cond_9

    move/from16 v16, p6

    goto :goto_5

    :cond_9
    move/from16 v16, v3

    :goto_5
    add-int v15, v15, v16

    .line 150
    .local v15, "minOffset":I
    move/from16 v22, p3

    .line 155
    .local v22, "maxOffset":I
    add-int/2addr v10, v15

    .line 158
    const/16 v16, 0x0

    .line 160
    .local v16, "maxCrossAxis":I
    const/16 v17, 0x0

    .line 721
    .local v17, "$i$f$debugLog":I
    nop

    .line 724
    move/from16 v24, v9

    .line 165
    .end local v9    # "currentFirstPage":I
    .end local v17    # "$i$f$debugLog":I
    .local v24, "currentFirstPage":I
    :goto_6
    if-gez v10, :cond_a

    if-lez v24, :cond_a

    .line 166
    move v9, v10

    .end local v10    # "currentFirstPageScrollOffset":I
    .local v9, "currentFirstPageScrollOffset":I
    add-int/lit8 v10, v24, -0x1

    .line 168
    .local v10, "previous":I
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
    nop

    .line 176
    invoke-interface/range {p0 .. p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v19

    .line 177
    nop

    .line 178
    nop

    .line 168
    move-object/from16 v18, p12

    move-object/from16 v17, p13

    move/from16 v20, p14

    move/from16 v21, p17

    move/from16 v33, v9

    move-object v1, v13

    move/from16 v35, v15

    move/from16 v34, v16

    move-object/from16 v9, p0

    move-object/from16 v13, p2

    move-object/from16 v16, v14

    move-wide/from16 v14, p15

    .end local v9    # "currentFirstPageScrollOffset":I
    .end local v13    # "visiblePages":Lkotlin/collections/ArrayDeque;
    .end local v15    # "minOffset":I
    .end local v16    # "maxCrossAxis":I
    .local v1, "visiblePages":Lkotlin/collections/ArrayDeque;
    .local v33, "currentFirstPageScrollOffset":I
    .local v34, "maxCrossAxis":I
    .local v35, "minOffset":I
    invoke-static/range {v9 .. v21}, Landroidx/compose/foundation/pager/PagerMeasureKt;->getAndMeasure-SGf7dI0(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;

    move-result-object v19

    .line 167
    move-object/from16 v9, v19

    .line 181
    .local v9, "measuredPage":Landroidx/compose/foundation/pager/MeasuredPage;
    const/4 v13, 0x0

    .line 725
    .local v13, "$i$f$debugLog":I
    nop

    .line 728
    nop

    .line 183
    .end local v13    # "$i$f$debugLog":I
    invoke-virtual {v1, v3, v9}, Lkotlin/collections/ArrayDeque;->add(ILjava/lang/Object;)V

    .line 184
    invoke-virtual {v9}, Landroidx/compose/foundation/pager/MeasuredPage;->getCrossAxisSize()I

    move-result v13

    move/from16 v14, v34

    .end local v34    # "maxCrossAxis":I
    .local v14, "maxCrossAxis":I
    invoke-static {v14, v13}, Ljava/lang/Math;->max(II)I

    move-result v16

    .line 185
    .end local v14    # "maxCrossAxis":I
    .restart local v16    # "maxCrossAxis":I
    move/from16 v13, v33

    .end local v33    # "currentFirstPageScrollOffset":I
    .local v13, "currentFirstPageScrollOffset":I
    add-int/2addr v13, v4

    .line 186
    move/from16 v24, v10

    move-object/from16 v14, p11

    move v10, v13

    move/from16 v15, v35

    move-object v13, v1

    move-object/from16 v1, p23

    .end local v9    # "measuredPage":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v10    # "previous":I
    goto :goto_6

    .line 165
    .end local v1    # "visiblePages":Lkotlin/collections/ArrayDeque;
    .end local v35    # "minOffset":I
    .local v10, "currentFirstPageScrollOffset":I
    .local v13, "visiblePages":Lkotlin/collections/ArrayDeque;
    .restart local v15    # "minOffset":I
    :cond_a
    move-object v1, v13

    move/from16 v35, v15

    move/from16 v14, v16

    move v13, v10

    .line 189
    .end local v10    # "currentFirstPageScrollOffset":I
    .end local v15    # "minOffset":I
    .end local v16    # "maxCrossAxis":I
    .restart local v1    # "visiblePages":Lkotlin/collections/ArrayDeque;
    .local v13, "currentFirstPageScrollOffset":I
    .restart local v14    # "maxCrossAxis":I
    .restart local v35    # "minOffset":I
    move/from16 v9, v35

    .end local v35    # "minOffset":I
    .local v9, "minOffset":I
    if-ge v13, v9, :cond_b

    .line 190
    move v10, v9

    .end local v13    # "currentFirstPageScrollOffset":I
    .restart local v10    # "currentFirstPageScrollOffset":I
    goto :goto_7

    .line 189
    .end local v10    # "currentFirstPageScrollOffset":I
    .restart local v13    # "currentFirstPageScrollOffset":I
    :cond_b
    move v10, v13

    .line 194
    .end local v13    # "currentFirstPageScrollOffset":I
    .restart local v10    # "currentFirstPageScrollOffset":I
    :goto_7
    sub-int/2addr v10, v9

    .line 196
    const/4 v13, 0x0

    .local v13, "index":I
    move/from16 v13, v24

    .line 197
    add-int v15, v22, p5

    invoke-static {v15, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v15

    .line 198
    .local v15, "maxMainAxis":I
    neg-int v3, v10

    .line 203
    .local v3, "currentMainAxisOffset":I
    const/16 v16, 0x0

    .line 206
    .local v16, "remeasureNeeded":Z
    const/16 v17, 0x0

    move/from16 v26, v4

    move/from16 v4, v17

    .line 208
    .local v4, "indexInVisibleItems":I
    .local v26, "pageSizeWithSpacing":I
    :goto_8
    move/from16 v35, v9

    .end local v9    # "minOffset":I
    .restart local v35    # "minOffset":I
    invoke-virtual {v1}, Lkotlin/collections/ArrayDeque;->size()I

    move-result v9

    if-ge v4, v9, :cond_d

    .line 209
    if-lt v3, v15, :cond_c

    .line 211
    invoke-virtual {v1, v4}, Lkotlin/collections/ArrayDeque;->remove(I)Ljava/lang/Object;

    .line 212
    const/16 v16, 0x1

    move/from16 v9, v35

    goto :goto_8

    .line 214
    :cond_c
    add-int/lit8 v13, v13, 0x1

    .line 215
    add-int v3, v3, v26

    .line 216
    add-int/lit8 v4, v4, 0x1

    move/from16 v9, v35

    goto :goto_8

    .line 220
    :cond_d
    const/4 v9, 0x0

    .line 729
    .local v9, "$i$f$debugLog":I
    nop

    .line 732
    move/from16 v28, v4

    move/from16 v27, v24

    move/from16 v4, v26

    move/from16 v24, v10

    move v10, v13

    move/from16 v26, v16

    move/from16 v16, v14

    .line 225
    .end local v9    # "$i$f$debugLog":I
    .end local v13    # "index":I
    .end local v14    # "maxCrossAxis":I
    .local v4, "pageSizeWithSpacing":I
    .local v10, "index":I
    .local v16, "maxCrossAxis":I
    .local v24, "currentFirstPageScrollOffset":I
    .local v26, "remeasureNeeded":Z
    .local v27, "currentFirstPage":I
    .local v28, "indexInVisibleItems":I
    :goto_9
    if-ge v10, v6, :cond_12

    .line 226
    if-lt v3, v15, :cond_f

    .line 227
    if-lez v3, :cond_f

    .line 228
    invoke-virtual {v1}, Lkotlin/collections/ArrayDeque;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_a

    :cond_e
    move/from16 v29, v4

    move v9, v10

    move v8, v15

    move/from16 v4, v16

    move/from16 v7, v35

    goto/16 :goto_d

    .line 231
    :cond_f
    :goto_a
    nop

    .line 232
    nop

    .line 233
    nop

    .line 234
    nop

    .line 235
    nop

    .line 236
    nop

    .line 237
    nop

    .line 238
    nop

    .line 239
    invoke-interface/range {p0 .. p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v19

    .line 240
    nop

    .line 241
    nop

    .line 231
    move-object/from16 v9, p0

    move-object/from16 v13, p2

    move-object/from16 v18, p12

    move-object/from16 v17, p13

    move/from16 v20, p14

    move/from16 v21, p17

    move/from16 v29, v4

    move v8, v15

    move/from16 v4, v16

    move/from16 v7, v35

    move-object/from16 v16, p11

    move-wide/from16 v14, p15

    .end local v15    # "maxMainAxis":I
    .end local v16    # "maxCrossAxis":I
    .end local v35    # "minOffset":I
    .local v4, "maxCrossAxis":I
    .local v7, "minOffset":I
    .local v8, "maxMainAxis":I
    .local v29, "pageSizeWithSpacing":I
    invoke-static/range {v9 .. v21}, Landroidx/compose/foundation/pager/PagerMeasureKt;->getAndMeasure-SGf7dI0(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;

    move-result-object v19

    .line 230
    move v9, v10

    .end local v10    # "index":I
    .local v9, "index":I
    move-object/from16 v10, v19

    .line 244
    .local v10, "measuredPage":Landroidx/compose/foundation/pager/MeasuredPage;
    const/4 v13, 0x0

    .line 733
    .local v13, "$i$f$debugLog":I
    nop

    .line 736
    nop

    .line 247
    .end local v13    # "$i$f$debugLog":I
    nop

    .line 248
    add-int/lit8 v13, v6, -0x1

    if-ne v9, v13, :cond_10

    .line 249
    move/from16 v13, p17

    goto :goto_b

    .line 251
    :cond_10
    move/from16 v13, v29

    .line 247
    :goto_b
    add-int/2addr v3, v13

    .line 254
    if-gt v3, v7, :cond_11

    add-int/lit8 v13, v6, -0x1

    if-eq v9, v13, :cond_11

    .line 256
    add-int/lit8 v13, v9, 0x1

    .line 257
    .end local v27    # "currentFirstPage":I
    .local v13, "currentFirstPage":I
    sub-int v24, v24, v29

    .line 258
    const/4 v14, 0x1

    move/from16 v27, v13

    move/from16 v26, v14

    move/from16 v16, v4

    .end local v26    # "remeasureNeeded":Z
    .local v14, "remeasureNeeded":Z
    goto :goto_c

    .line 260
    .end local v13    # "currentFirstPage":I
    .end local v14    # "remeasureNeeded":Z
    .restart local v26    # "remeasureNeeded":Z
    .restart local v27    # "currentFirstPage":I
    :cond_11
    invoke-virtual {v10}, Landroidx/compose/foundation/pager/MeasuredPage;->getCrossAxisSize()I

    move-result v13

    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 261
    invoke-virtual {v1, v10}, Lkotlin/collections/ArrayDeque;->add(Ljava/lang/Object;)Z

    move/from16 v16, v4

    .line 264
    .end local v4    # "maxCrossAxis":I
    .restart local v16    # "maxCrossAxis":I
    :goto_c
    add-int/lit8 v10, v9, 0x1

    move/from16 v35, v7

    move v15, v8

    move/from16 v4, v29

    .end local v9    # "index":I
    .local v10, "index":I
    goto :goto_9

    .line 225
    .end local v7    # "minOffset":I
    .end local v8    # "maxMainAxis":I
    .end local v29    # "pageSizeWithSpacing":I
    .local v4, "pageSizeWithSpacing":I
    .restart local v15    # "maxMainAxis":I
    .restart local v35    # "minOffset":I
    :cond_12
    move/from16 v29, v4

    move v9, v10

    move v8, v15

    move/from16 v4, v16

    move/from16 v7, v35

    .line 269
    .end local v10    # "index":I
    .end local v15    # "maxMainAxis":I
    .end local v16    # "maxCrossAxis":I
    .end local v35    # "minOffset":I
    .local v4, "maxCrossAxis":I
    .restart local v7    # "minOffset":I
    .restart local v8    # "maxMainAxis":I
    .restart local v9    # "index":I
    .restart local v29    # "pageSizeWithSpacing":I
    :goto_d
    move/from16 v10, v22

    .end local v22    # "maxOffset":I
    .local v10, "maxOffset":I
    if-ge v3, v10, :cond_15

    .line 270
    sub-int v22, v10, v3

    .line 271
    .local v22, "toScrollBack":I
    sub-int v24, v24, v22

    .line 272
    add-int v3, v3, v22

    move/from16 v13, v24

    .line 273
    .end local v24    # "currentFirstPageScrollOffset":I
    .local v13, "currentFirstPageScrollOffset":I
    :goto_e
    if-ge v13, v2, :cond_13

    if-lez v27, :cond_13

    .line 274
    move/from16 v16, v10

    .end local v10    # "maxOffset":I
    .local v16, "maxOffset":I
    add-int/lit8 v10, v27, -0x1

    .line 276
    .local v10, "previousIndex":I
    nop

    .line 277
    nop

    .line 278
    nop

    .line 279
    nop

    .line 280
    nop

    .line 281
    nop

    .line 282
    nop

    .line 283
    nop

    .line 284
    invoke-interface/range {p0 .. p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v19

    .line 285
    nop

    .line 286
    nop

    .line 276
    move-object/from16 v18, p12

    move-object/from16 v17, p13

    move/from16 v20, p14

    move-wide/from16 v14, p15

    move/from16 v21, p17

    move/from16 v35, v7

    move v7, v9

    move/from16 v24, v13

    move/from16 v33, v16

    move-object/from16 v9, p0

    move-object/from16 v13, p2

    move-object/from16 v16, p11

    .end local v9    # "index":I
    .end local v13    # "currentFirstPageScrollOffset":I
    .end local v16    # "maxOffset":I
    .local v7, "index":I
    .restart local v24    # "currentFirstPageScrollOffset":I
    .local v33, "maxOffset":I
    .restart local v35    # "minOffset":I
    invoke-static/range {v9 .. v21}, Landroidx/compose/foundation/pager/PagerMeasureKt;->getAndMeasure-SGf7dI0(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;

    move-result-object v19

    .line 275
    move-object/from16 v9, v19

    .line 288
    .local v9, "measuredPage":Landroidx/compose/foundation/pager/MeasuredPage;
    const/4 v13, 0x0

    invoke-virtual {v1, v13, v9}, Lkotlin/collections/ArrayDeque;->add(ILjava/lang/Object;)V

    .line 289
    invoke-virtual {v9}, Landroidx/compose/foundation/pager/MeasuredPage;->getCrossAxisSize()I

    move-result v14

    invoke-static {v4, v14}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 290
    add-int v14, v24, v29

    .line 291
    .end local v24    # "currentFirstPageScrollOffset":I
    .local v14, "currentFirstPageScrollOffset":I
    move/from16 v27, v10

    move v9, v7

    move v13, v14

    move/from16 v10, v33

    move/from16 v7, v35

    .end local v9    # "measuredPage":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v10    # "previousIndex":I
    goto :goto_e

    .line 273
    .end local v14    # "currentFirstPageScrollOffset":I
    .end local v33    # "maxOffset":I
    .end local v35    # "minOffset":I
    .local v7, "minOffset":I
    .local v9, "index":I
    .local v10, "maxOffset":I
    .restart local v13    # "currentFirstPageScrollOffset":I
    :cond_13
    move/from16 v35, v7

    move v7, v9

    move/from16 v33, v10

    move/from16 v24, v13

    const/4 v13, 0x0

    .line 294
    .end local v9    # "index":I
    .end local v10    # "maxOffset":I
    .end local v13    # "currentFirstPageScrollOffset":I
    .local v7, "index":I
    .restart local v24    # "currentFirstPageScrollOffset":I
    .restart local v33    # "maxOffset":I
    .restart local v35    # "minOffset":I
    if-gez v24, :cond_14

    .line 295
    add-int v3, v3, v24

    .line 296
    const/16 v24, 0x0

    move/from16 v9, v24

    goto :goto_f

    .line 294
    :cond_14
    move/from16 v9, v24

    goto :goto_f

    .line 269
    .end local v22    # "toScrollBack":I
    .end local v33    # "maxOffset":I
    .end local v35    # "minOffset":I
    .local v7, "minOffset":I
    .restart local v9    # "index":I
    .restart local v10    # "maxOffset":I
    :cond_15
    move/from16 v35, v7

    move v7, v9

    move/from16 v33, v10

    const/4 v13, 0x0

    .end local v9    # "index":I
    .end local v10    # "maxOffset":I
    .local v7, "index":I
    .restart local v33    # "maxOffset":I
    .restart local v35    # "minOffset":I
    move/from16 v9, v24

    .line 301
    .end local v24    # "currentFirstPageScrollOffset":I
    .local v9, "currentFirstPageScrollOffset":I
    :goto_f
    if-ltz v9, :cond_16

    move/from16 v10, v23

    goto :goto_10

    :cond_16
    move v10, v13

    .local v10, "value$iv":Z
    :goto_10
    const/4 v14, 0x0

    .line 737
    .local v14, "$i$f$requirePrecondition":I
    nop

    .line 738
    if-nez v10, :cond_17

    .line 739
    const/4 v15, 0x0

    .line 302
    .local v15, "$i$a$-requirePrecondition-PagerMeasureKt$measurePager$10":I
    nop

    .line 739
    .end local v15    # "$i$a$-requirePrecondition-PagerMeasureKt$measurePager$10":I
    const-string/jumbo v15, "invalid currentFirstPageScrollOffset"

    invoke-static {v15}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 741
    :cond_17
    nop

    .line 304
    .end local v10    # "value$iv":Z
    .end local v14    # "$i$f$requirePrecondition":I
    neg-int v10, v9

    .line 306
    .local v10, "visiblePagesScrollOffset":I
    invoke-virtual {v1}, Lkotlin/collections/ArrayDeque;->first()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/compose/foundation/pager/MeasuredPage;

    .line 310
    .local v14, "firstPage":Landroidx/compose/foundation/pager/MeasuredPage;
    if-gtz v2, :cond_19

    if-gez p6, :cond_18

    goto :goto_11

    :cond_18
    move/from16 v24, v9

    move-object v2, v14

    goto :goto_14

    .line 311
    :cond_19
    :goto_11
    const/4 v15, 0x0

    .local v15, "i":I
    move-object/from16 v16, v1

    check-cast v16, Ljava/util/Collection;

    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    move-result v13

    :goto_12
    if-ge v15, v13, :cond_1d

    .line 312
    move/from16 v16, v29

    .line 313
    .local v16, "size":I
    nop

    .line 314
    if-eqz v9, :cond_1b

    .line 315
    move/from16 v2, v16

    .end local v16    # "size":I
    .local v2, "size":I
    if-gt v2, v9, :cond_1a

    .line 316
    move-object/from16 v16, v1

    check-cast v16, Ljava/util/List;

    move/from16 v17, v2

    .end local v2    # "size":I
    .local v17, "size":I
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v2

    if-eq v15, v2, :cond_1c

    .line 318
    sub-int v9, v9, v17

    .line 319
    add-int/lit8 v2, v15, 0x1

    invoke-virtual {v1, v2}, Lkotlin/collections/ArrayDeque;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroidx/compose/foundation/pager/MeasuredPage;

    .line 311
    .end local v17    # "size":I
    add-int/lit8 v15, v15, 0x1

    move/from16 v2, p4

    goto :goto_12

    .line 315
    .restart local v2    # "size":I
    :cond_1a
    move/from16 v17, v2

    .end local v2    # "size":I
    .restart local v17    # "size":I
    goto :goto_13

    .line 314
    .end local v17    # "size":I
    .restart local v16    # "size":I
    :cond_1b
    move/from16 v17, v16

    .line 321
    .end local v16    # "size":I
    .restart local v17    # "size":I
    :cond_1c
    :goto_13
    nop

    .line 329
    .end local v15    # "i":I
    .end local v17    # "size":I
    :cond_1d
    move/from16 v24, v9

    move-object v2, v14

    .end local v9    # "currentFirstPageScrollOffset":I
    .end local v14    # "firstPage":Landroidx/compose/foundation/pager/MeasuredPage;
    .local v2, "firstPage":Landroidx/compose/foundation/pager/MeasuredPage;
    .restart local v24    # "currentFirstPageScrollOffset":I
    :goto_14
    nop

    .line 330
    nop

    .line 331
    nop

    .line 328
    new-instance v9, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$extraPagesBefore$1;

    move-object/from16 v13, p2

    move-object/from16 v16, p11

    move-object/from16 v18, p12

    move-object/from16 v17, p13

    move/from16 v19, p14

    move-wide/from16 v14, p15

    move/from16 v20, p17

    move/from16 v34, v8

    move/from16 v21, v10

    move/from16 v8, v27

    const/16 v25, 0x0

    move-object/from16 v10, p0

    .end local v10    # "visiblePagesScrollOffset":I
    .end local v27    # "currentFirstPage":I
    .local v8, "currentFirstPage":I
    .local v21, "visiblePagesScrollOffset":I
    .local v34, "maxMainAxis":I
    invoke-direct/range {v9 .. v20}, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$extraPagesBefore$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;JLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ZI)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v5, v0, v9}, Landroidx/compose/foundation/pager/PagerMeasureKt;->createPagesBeforeList(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v9

    .line 327
    move-object/from16 v22, v9

    .line 348
    .local v22, "extraPagesBefore":Ljava/util/List;
    nop

    .local v9, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 742
    .local v10, "$i$f$fastForEach":I
    nop

    .line 743
    const/4 v13, 0x0

    .local v13, "index$iv":I
    move-object v14, v9

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->size()I

    move-result v14

    :goto_15
    if-ge v13, v14, :cond_1e

    .line 744
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 745
    .local v15, "item$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Landroidx/compose/foundation/pager/MeasuredPage;

    .local v16, "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/16 v17, 0x0

    .line 348
    .local v17, "$i$a$-fastForEach-PagerMeasureKt$measurePager$11":I
    move-object/from16 v27, v1

    .end local v1    # "visiblePages":Lkotlin/collections/ArrayDeque;
    .local v27, "visiblePages":Lkotlin/collections/ArrayDeque;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/pager/MeasuredPage;->getCrossAxisSize()I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 745
    .end local v16    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v17    # "$i$a$-fastForEach-PagerMeasureKt$measurePager$11":I
    nop

    .line 743
    .end local v15    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, v27

    goto :goto_15

    .end local v27    # "visiblePages":Lkotlin/collections/ArrayDeque;
    .restart local v1    # "visiblePages":Lkotlin/collections/ArrayDeque;
    :cond_1e
    move-object/from16 v27, v1

    .line 747
    .end local v1    # "visiblePages":Lkotlin/collections/ArrayDeque;
    .end local v13    # "index$iv":I
    .restart local v27    # "visiblePages":Lkotlin/collections/ArrayDeque;
    nop

    .line 353
    .end local v9    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastForEach":I
    invoke-virtual/range {v27 .. v27}, Lkotlin/collections/ArrayDeque;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/pager/MeasuredPage;

    invoke-virtual {v1}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v1

    .line 354
    nop

    .line 355
    nop

    .line 356
    nop

    .line 352
    new-instance v9, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$extraPagesAfter$1;

    move-object/from16 v10, p0

    move-object/from16 v13, p2

    move-object/from16 v16, p11

    move-object/from16 v18, p12

    move-object/from16 v17, p13

    move/from16 v19, p14

    move-wide/from16 v14, p15

    move/from16 v20, p17

    invoke-direct/range {v9 .. v20}, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$extraPagesAfter$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;JLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ZI)V

    move-wide/from16 v36, v11

    move-object/from16 v14, v16

    .end local v11    # "childConstraints":J
    .local v36, "childConstraints":J
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v6, v5, v0, v9}, Landroidx/compose/foundation/pager/PagerMeasureKt;->createPagesAfterList(IIILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v12

    .line 351
    nop

    .line 373
    .local v12, "extraPagesAfter":Ljava/util/List;
    move-object v1, v12

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 748
    .local v9, "$i$f$fastForEach":I
    nop

    .line 749
    const/4 v10, 0x0

    .local v10, "index$iv":I
    move-object v11, v1

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v11

    :goto_16
    if-ge v10, v11, :cond_1f

    .line 750
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 751
    .local v13, "item$iv":Ljava/lang/Object;
    move-object v15, v13

    check-cast v15, Landroidx/compose/foundation/pager/MeasuredPage;

    .local v15, "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/16 v16, 0x0

    .line 373
    .local v16, "$i$a$-fastForEach-PagerMeasureKt$measurePager$12":I
    invoke-virtual {v15}, Landroidx/compose/foundation/pager/MeasuredPage;->getCrossAxisSize()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 751
    .end local v15    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v16    # "$i$a$-fastForEach-PagerMeasureKt$measurePager$12":I
    nop

    .line 749
    .end local v13    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p19

    goto :goto_16

    .line 753
    .end local v10    # "index$iv":I
    :cond_1f
    nop

    .line 376
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    invoke-virtual/range {v27 .. v27}, Lkotlin/collections/ArrayDeque;->first()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 377
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 378
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_20

    move/from16 v13, v23

    goto :goto_17

    :cond_20
    move/from16 v13, v25

    .line 375
    :goto_17
    move/from16 v38, v13

    .line 381
    .local v38, "noExtraPages":Z
    nop

    .line 382
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v14, v0, :cond_21

    move v0, v4

    goto :goto_18

    :cond_21
    move v0, v3

    .line 381
    :goto_18
    move-wide/from16 v9, p9

    invoke-static {v9, v10, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v13

    .line 380
    nop

    .line 386
    .local v13, "layoutWidth":I
    nop

    .line 387
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v14, v0, :cond_22

    move v0, v3

    goto :goto_19

    :cond_22
    move v0, v4

    .line 386
    :goto_19
    invoke-static {v9, v10, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v0

    .line 385
    nop

    .line 391
    .local v0, "layoutHeight":I
    nop

    .line 392
    move-object/from16 v10, v27

    check-cast v10, Ljava/util/List;

    .line 393
    nop

    .line 394
    nop

    .line 395
    nop

    .line 396
    nop

    .line 397
    nop

    .line 398
    nop

    .line 399
    nop

    .line 400
    nop

    .line 401
    nop

    .line 402
    move-object/from16 v20, p0

    check-cast v20, Landroidx/compose/ui/unit/Density;

    .line 404
    nop

    .line 403
    nop

    .line 391
    move-object/from16 v9, p0

    move/from16 v19, p14

    move v15, v3

    move-object/from16 v18, v14

    move/from16 v17, v21

    move-object/from16 v11, v22

    move/from16 v16, v33

    move/from16 v21, p6

    move/from16 v22, p17

    move v14, v0

    .end local v0    # "layoutHeight":I
    .end local v3    # "currentMainAxisOffset":I
    .end local v21    # "visiblePagesScrollOffset":I
    .end local v22    # "extraPagesBefore":Ljava/util/List;
    .end local v33    # "maxOffset":I
    .local v11, "extraPagesBefore":Ljava/util/List;
    .local v14, "layoutHeight":I
    .local v15, "currentMainAxisOffset":I
    .local v16, "maxOffset":I
    .local v17, "visiblePagesScrollOffset":I
    invoke-static/range {v9 .. v22}, Landroidx/compose/foundation/pager/PagerMeasureKt;->calculatePagesOffsets(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/Density;II)Ljava/util/List;

    move-result-object v0

    .line 390
    move-object/from16 v39, v11

    move-object/from16 v40, v12

    move/from16 v41, v13

    move/from16 v42, v14

    move v10, v15

    move/from16 v9, v16

    move/from16 v33, v17

    .end local v11    # "extraPagesBefore":Ljava/util/List;
    .end local v12    # "extraPagesAfter":Ljava/util/List;
    .end local v13    # "layoutWidth":I
    .end local v14    # "layoutHeight":I
    .end local v15    # "currentMainAxisOffset":I
    .end local v16    # "maxOffset":I
    .end local v17    # "visiblePagesScrollOffset":I
    .local v9, "maxOffset":I
    .local v10, "currentMainAxisOffset":I
    .local v33, "visiblePagesScrollOffset":I
    .local v39, "extraPagesBefore":Ljava/util/List;
    .local v40, "extraPagesAfter":Ljava/util/List;
    .local v41, "layoutWidth":I
    .local v42, "layoutHeight":I
    move-object v11, v0

    .line 408
    .local v11, "positionedPages":Ljava/util/List;
    if-eqz v38, :cond_23

    move-object v1, v11

    goto/16 :goto_1d

    .line 410
    :cond_23
    move-object v0, v11

    .local v0, "$this$fastFilter$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 754
    .local v1, "$i$f$fastFilter":I
    nop

    .line 755
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v12

    invoke-direct {v3, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 756
    .local v3, "target$iv":Ljava/util/ArrayList;
    move-object v12, v0

    .local v12, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v13, 0x0

    .line 757
    .local v13, "$i$f$fastForEach":I
    nop

    .line 758
    const/4 v14, 0x0

    .local v14, "index$iv$iv":I
    move-object v15, v12

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15}, Ljava/util/Collection;->size()I

    move-result v15

    :goto_1a
    if-ge v14, v15, :cond_26

    .line 759
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 760
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    .local v17, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 756
    .local v18, "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    move-object/from16 v19, v17

    check-cast v19, Landroidx/compose/foundation/pager/MeasuredPage;

    .local v19, "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/16 v20, 0x0

    .line 411
    .local v20, "$i$a$-fastFilter-PagerMeasureKt$measurePager$visiblePagesInfo$1":I
    move-object/from16 v21, v0

    .end local v0    # "$this$fastFilter$iv":Ljava/util/List;
    .local v21, "$this$fastFilter$iv":Ljava/util/List;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v0

    invoke-virtual/range {v27 .. v27}, Lkotlin/collections/ArrayDeque;->first()Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Landroidx/compose/foundation/pager/MeasuredPage;

    move/from16 v43, v1

    .end local v1    # "$i$f$fastFilter":I
    .local v43, "$i$f$fastFilter":I
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v1

    if-lt v0, v1, :cond_24

    .line 412
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v0

    invoke-virtual/range {v27 .. v27}, Lkotlin/collections/ArrayDeque;->last()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/pager/MeasuredPage;

    invoke-virtual {v1}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v1

    if-gt v0, v1, :cond_24

    move/from16 v0, v23

    goto :goto_1b

    :cond_24
    move/from16 v0, v25

    .line 756
    .end local v19    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v20    # "$i$a$-fastFilter-PagerMeasureKt$measurePager$visiblePagesInfo$1":I
    :goto_1b
    if-eqz v0, :cond_25

    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v1, v17

    .end local v17    # "it$iv":Ljava/lang/Object;
    .local v1, "it$iv":Ljava/lang/Object;
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    .end local v1    # "it$iv":Ljava/lang/Object;
    .restart local v17    # "it$iv":Ljava/lang/Object;
    :cond_25
    move-object/from16 v1, v17

    .line 760
    .end local v17    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    :goto_1c
    nop

    .line 758
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, v21

    move/from16 v1, v43

    goto :goto_1a

    .end local v21    # "$this$fastFilter$iv":Ljava/util/List;
    .end local v43    # "$i$f$fastFilter":I
    .restart local v0    # "$this$fastFilter$iv":Ljava/util/List;
    .local v1, "$i$f$fastFilter":I
    :cond_26
    move-object/from16 v21, v0

    move/from16 v43, v1

    .line 762
    .end local v0    # "$this$fastFilter$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastFilter":I
    .end local v14    # "index$iv$iv":I
    .restart local v21    # "$this$fastFilter$iv":Ljava/util/List;
    .restart local v43    # "$i$f$fastFilter":I
    nop

    .line 763
    .end local v12    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v13    # "$i$f$fastForEach":I
    move-object v0, v3

    check-cast v0, Ljava/util/List;

    move-object v1, v0

    .line 408
    .end local v3    # "target$iv":Ljava/util/ArrayList;
    .end local v21    # "$this$fastFilter$iv":Ljava/util/List;
    .end local v43    # "$i$f$fastFilter":I
    :goto_1d
    nop

    .line 407
    nop

    .line 416
    .local v1, "visiblePagesInfo":Ljava/util/List;
    invoke-interface/range {v39 .. v39}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object/from16 v44, v1

    goto :goto_21

    .line 417
    :cond_27
    move-object v0, v11

    .restart local v0    # "$this$fastFilter$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 764
    .local v3, "$i$f$fastFilter":I
    nop

    .line 765
    new-instance v12, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 766
    .local v12, "target$iv":Ljava/util/ArrayList;
    move-object v13, v0

    .local v13, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 767
    .local v14, "$i$f$fastForEach":I
    nop

    .line 768
    const/4 v15, 0x0

    .local v15, "index$iv$iv":I
    move-object/from16 v16, v13

    check-cast v16, Ljava/util/Collection;

    move-object/from16 v17, v0

    .end local v0    # "$this$fastFilter$iv":Ljava/util/List;
    .local v17, "$this$fastFilter$iv":Ljava/util/List;
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    move-result v0

    :goto_1e
    if-ge v15, v0, :cond_2a

    .line 769
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 770
    .restart local v16    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v16

    .local v18, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 766
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    move-object/from16 v20, v18

    check-cast v20, Landroidx/compose/foundation/pager/MeasuredPage;

    .local v20, "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/16 v21, 0x0

    .line 417
    .local v21, "$i$a$-fastFilter-PagerMeasureKt$measurePager$positionedPagesBefore$1":I
    move/from16 v22, v0

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v0

    invoke-virtual/range {v27 .. v27}, Lkotlin/collections/ArrayDeque;->first()Ljava/lang/Object;

    move-result-object v43

    check-cast v43, Landroidx/compose/foundation/pager/MeasuredPage;

    move-object/from16 v44, v1

    .end local v1    # "visiblePagesInfo":Ljava/util/List;
    .local v44, "visiblePagesInfo":Ljava/util/List;
    invoke-virtual/range {v43 .. v43}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v1

    if-ge v0, v1, :cond_28

    move/from16 v0, v23

    goto :goto_1f

    :cond_28
    move/from16 v0, v25

    .line 766
    .end local v20    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v21    # "$i$a$-fastFilter-PagerMeasureKt$measurePager$positionedPagesBefore$1":I
    :goto_1f
    if-eqz v0, :cond_29

    move-object v0, v12

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v1, v18

    .end local v18    # "it$iv":Ljava/lang/Object;
    .local v1, "it$iv":Ljava/lang/Object;
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .end local v1    # "it$iv":Ljava/lang/Object;
    .restart local v18    # "it$iv":Ljava/lang/Object;
    :cond_29
    move-object/from16 v1, v18

    .line 770
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    :goto_20
    nop

    .line 768
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v15, v15, 0x1

    move/from16 v0, v22

    move-object/from16 v1, v44

    goto :goto_1e

    .end local v44    # "visiblePagesInfo":Ljava/util/List;
    .local v1, "visiblePagesInfo":Ljava/util/List;
    :cond_2a
    move-object/from16 v44, v1

    .line 772
    .end local v1    # "visiblePagesInfo":Ljava/util/List;
    .end local v15    # "index$iv$iv":I
    .restart local v44    # "visiblePagesInfo":Ljava/util/List;
    nop

    .line 773
    .end local v13    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastForEach":I
    move-object v0, v12

    check-cast v0, Ljava/util/List;

    .line 416
    .end local v3    # "$i$f$fastFilter":I
    .end local v12    # "target$iv":Ljava/util/ArrayList;
    .end local v17    # "$this$fastFilter$iv":Ljava/util/List;
    :goto_21
    nop

    .line 415
    move-object v12, v0

    .line 420
    .local v12, "positionedPagesBefore":Ljava/util/List;
    invoke-interface/range {v40 .. v40}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_25

    .line 421
    :cond_2b
    move-object v0, v11

    .restart local v0    # "$this$fastFilter$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 774
    .local v1, "$i$f$fastFilter":I
    nop

    .line 775
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v13

    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 776
    .local v3, "target$iv":Ljava/util/ArrayList;
    move-object v13, v0

    .restart local v13    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 777
    .restart local v14    # "$i$f$fastForEach":I
    nop

    .line 778
    const/4 v15, 0x0

    .restart local v15    # "index$iv$iv":I
    move-object/from16 v16, v13

    check-cast v16, Ljava/util/Collection;

    move-object/from16 v17, v0

    .end local v0    # "$this$fastFilter$iv":Ljava/util/List;
    .restart local v17    # "$this$fastFilter$iv":Ljava/util/List;
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    move-result v0

    :goto_22
    if-ge v15, v0, :cond_2e

    .line 779
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 780
    .restart local v16    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v16

    .restart local v18    # "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 776
    .restart local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    move-object/from16 v20, v18

    check-cast v20, Landroidx/compose/foundation/pager/MeasuredPage;

    .restart local v20    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    const/16 v21, 0x0

    .line 421
    .local v21, "$i$a$-fastFilter-PagerMeasureKt$measurePager$positionedPagesAfter$1":I
    move/from16 v22, v0

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v0

    invoke-virtual/range {v27 .. v27}, Lkotlin/collections/ArrayDeque;->last()Ljava/lang/Object;

    move-result-object v43

    check-cast v43, Landroidx/compose/foundation/pager/MeasuredPage;

    move/from16 v45, v1

    .end local v1    # "$i$f$fastFilter":I
    .local v45, "$i$f$fastFilter":I
    invoke-virtual/range {v43 .. v43}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v1

    if-le v0, v1, :cond_2c

    move/from16 v0, v23

    goto :goto_23

    :cond_2c
    move/from16 v0, v25

    .line 776
    .end local v20    # "it":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v21    # "$i$a$-fastFilter-PagerMeasureKt$measurePager$positionedPagesAfter$1":I
    :goto_23
    if-eqz v0, :cond_2d

    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v1, v18

    .end local v18    # "it$iv":Ljava/lang/Object;
    .local v1, "it$iv":Ljava/lang/Object;
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .end local v1    # "it$iv":Ljava/lang/Object;
    .restart local v18    # "it$iv":Ljava/lang/Object;
    :cond_2d
    move-object/from16 v1, v18

    .line 780
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    :goto_24
    nop

    .line 778
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v15, v15, 0x1

    move/from16 v0, v22

    move/from16 v1, v45

    goto :goto_22

    .end local v45    # "$i$f$fastFilter":I
    .local v1, "$i$f$fastFilter":I
    :cond_2e
    move/from16 v45, v1

    .line 782
    .end local v1    # "$i$f$fastFilter":I
    .end local v15    # "index$iv$iv":I
    .restart local v45    # "$i$f$fastFilter":I
    nop

    .line 783
    .end local v13    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastForEach":I
    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 420
    .end local v3    # "target$iv":Ljava/util/ArrayList;
    .end local v17    # "$this$fastFilter$iv":Ljava/util/List;
    .end local v45    # "$i$f$fastFilter":I
    :goto_25
    nop

    .line 419
    move-object v13, v0

    .line 423
    .local v13, "positionedPagesAfter":Ljava/util/List;
    add-int v0, p3, p4

    add-int v0, v0, p5

    .line 427
    .local v0, "layoutSize":I
    nop

    .line 428
    nop

    .line 429
    nop

    .line 430
    nop

    .line 431
    nop

    .line 432
    nop

    .line 433
    nop

    .line 426
    move/from16 v3, p5

    move-object/from16 v5, p20

    move-object/from16 v14, p23

    move-object/from16 v19, v2

    move/from16 v45, v4

    move-object/from16 v43, v27

    move/from16 v4, v29

    move-object/from16 v1, v44

    move/from16 v2, p4

    move/from16 v44, v28

    .end local v2    # "firstPage":Landroidx/compose/foundation/pager/MeasuredPage;
    .end local v27    # "visiblePages":Lkotlin/collections/ArrayDeque;
    .end local v28    # "indexInVisibleItems":I
    .end local v29    # "pageSizeWithSpacing":I
    .local v1, "visiblePagesInfo":Ljava/util/List;
    .local v4, "pageSizeWithSpacing":I
    .local v19, "firstPage":Landroidx/compose/foundation/pager/MeasuredPage;
    .local v43, "visiblePages":Lkotlin/collections/ArrayDeque;
    .local v44, "indexInVisibleItems":I
    .local v45, "maxCrossAxis":I
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/pager/PagerMeasureKt;->calculateNewCurrentPage(ILjava/util/List;IIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)Landroidx/compose/foundation/pager/MeasuredPage;

    move-result-object v20

    .line 425
    move-object/from16 v16, v1

    move v15, v4

    .line 437
    .end local v1    # "visiblePagesInfo":Ljava/util/List;
    .end local v4    # "pageSizeWithSpacing":I
    .local v15, "pageSizeWithSpacing":I
    .local v16, "visiblePagesInfo":Ljava/util/List;
    .local v20, "newCurrentPage":Landroidx/compose/foundation/pager/MeasuredPage;
    nop

    .line 438
    nop

    .line 439
    nop

    .line 440
    nop

    .line 441
    nop

    .line 442
    if-eqz v20, :cond_2f

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    move-result v3

    move v5, v3

    goto :goto_26

    :cond_2f
    move/from16 v5, v25

    .line 443
    :goto_26
    nop

    .line 437
    move/from16 v6, p1

    move/from16 v3, p4

    move/from16 v4, p5

    move/from16 v2, p17

    move v1, v0

    move-object/from16 v0, p20

    .end local v0    # "layoutSize":I
    .local v1, "layoutSize":I
    invoke-interface/range {v0 .. v6}, Landroidx/compose/foundation/gestures/snapping/SnapPosition;->position(IIIIII)I

    move-result v5

    .line 436
    move v0, v1

    move v2, v3

    .line 446
    .end local v1    # "layoutSize":I
    .restart local v0    # "layoutSize":I
    .local v5, "snapOffset":I
    if-eqz v20, :cond_30

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/pager/MeasuredPage;->getOffset()I

    move-result v3

    goto :goto_27

    :cond_30
    move/from16 v3, v25

    .line 449
    .local v3, "currentPagePositionOffset":I
    :goto_27
    if-nez v15, :cond_31

    .line 450
    const/4 v1, 0x0

    move/from16 v46, v0

    move/from16 v21, v1

    goto :goto_28

    .line 452
    :cond_31
    sub-int v1, v5, v3

    int-to-float v1, v1

    int-to-float v4, v15

    div-float/2addr v1, v4

    .line 453
    const/high16 v4, -0x41000000    # -0.5f

    move/from16 v46, v0

    .end local v0    # "layoutSize":I
    .local v46, "layoutSize":I
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v1, v4, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    move/from16 v21, v1

    .line 449
    :goto_28
    nop

    .line 448
    nop

    .line 456
    .local v21, "currentPageOffsetFraction":F
    const/4 v0, 0x0

    .line 784
    .local v0, "$i$f$debugLog":I
    nop

    .line 787
    nop

    .line 464
    .end local v0    # "$i$f$debugLog":I
    nop

    .line 465
    nop

    .line 467
    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v42 .. v42}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v4, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14;

    move/from16 v47, v3

    move-object/from16 v3, p21

    .end local v3    # "currentPagePositionOffset":I
    .local v47, "currentPagePositionOffset":I
    invoke-direct {v4, v3, v11}, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14;-><init>(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    invoke-interface {v14, v0, v1, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/MeasureResult;

    .line 479
    move v4, v15

    .end local v15    # "pageSizeWithSpacing":I
    .restart local v4    # "pageSizeWithSpacing":I
    neg-int v15, v2

    .line 480
    add-int v22, v9, p5

    .line 488
    if-lt v7, v6, :cond_33

    if-le v10, v9, :cond_32

    goto :goto_29

    :cond_32
    move/from16 v23, v25

    .line 492
    :cond_33
    :goto_29
    nop

    .line 463
    move v1, v9

    .end local v9    # "maxOffset":I
    .local v1, "maxOffset":I
    new-instance v9, Landroidx/compose/foundation/pager/PagerMeasureResult;

    .line 481
    nop

    .line 484
    nop

    .line 485
    nop

    .line 486
    nop

    .line 483
    nop

    .line 479
    nop

    .line 480
    nop

    .line 482
    nop

    .line 487
    nop

    .line 464
    nop

    .line 489
    nop

    .line 490
    nop

    .line 465
    nop

    .line 488
    nop

    .line 491
    nop

    .line 467
    nop

    .line 492
    nop

    .line 493
    nop

    .line 494
    nop

    .line 495
    nop

    .line 463
    move-object/from16 v14, p11

    move/from16 v17, p14

    move/from16 v18, p18

    move-object/from16 v29, p22

    move-object/from16 v25, v0

    move v0, v10

    move-object/from16 v48, v11

    move-object/from16 v27, v12

    move-object/from16 v28, v13

    move-object/from16 v10, v16

    move/from16 v16, v22

    move/from16 v22, v24

    move/from16 v13, p5

    move/from16 v12, p6

    move/from16 v11, p17

    move-object/from16 v24, p20

    .end local v11    # "positionedPages":Ljava/util/List;
    .end local v12    # "positionedPagesBefore":Ljava/util/List;
    .end local v13    # "positionedPagesAfter":Ljava/util/List;
    .end local v16    # "visiblePagesInfo":Ljava/util/List;
    .end local v24    # "currentFirstPageScrollOffset":I
    .local v0, "currentMainAxisOffset":I
    .local v10, "visiblePagesInfo":Ljava/util/List;
    .local v22, "currentFirstPageScrollOffset":I
    .local v27, "positionedPagesBefore":Ljava/util/List;
    .local v28, "positionedPagesAfter":Ljava/util/List;
    .local v48, "positionedPages":Ljava/util/List;
    invoke-direct/range {v9 .. v29}, Landroidx/compose/foundation/pager/PagerMeasureResult;-><init>(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/ui/layout/MeasureResult;ZLjava/util/List;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)V

    return-object v9
.end method
