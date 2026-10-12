.class final Landroidx/compose/foundation/text/TextMeasurePolicy;
.super Ljava/lang/Object;
.source "BasicText.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,701:1\n230#2,3:702\n34#2,6:705\n233#2:711\n303#2,3:712\n70#2,4:715\n75#2:725\n306#2:726\n230#2,3:727\n34#2,6:730\n233#2:736\n56#3:719\n61#3:720\n26#4:721\n32#5:722\n80#6:723\n1#7:724\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n*L\n474#1:702,3\n474#1:705,6\n474#1:711\n476#1:712,3\n476#1:715,4\n476#1:725\n476#1:726\n493#1:727,3\n493#1:730,6\n493#1:736\n483#1:719\n484#1:720\n487#1:721\n487#1:722\n487#1:723\n476#1:724\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B+\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0003\u00a2\u0006\u0002\u0010\u0008J,\u0010\t\u001a\u00020\n*\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/foundation/text/TextMeasurePolicy;",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "shouldMeasureLinks",
        "Lkotlin/Function0;",
        "",
        "placements",
        "",
        "Landroidx/compose/ui/geometry/Rect;",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "measure",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurables",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;",
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
.field private final placements:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/util/List<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;>;"
        }
    .end annotation
.end field

.field private final shouldMeasureLinks:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p1, "shouldMeasureLinks"    # Lkotlin/jvm/functions/Function0;
    .param p2, "placements"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/util/List<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;>;)V"
        }
    .end annotation

    .line 464
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 465
    iput-object p1, p0, Landroidx/compose/foundation/text/TextMeasurePolicy;->shouldMeasureLinks:Lkotlin/jvm/functions/Function0;

    .line 466
    iput-object p2, p0, Landroidx/compose/foundation/text/TextMeasurePolicy;->placements:Lkotlin/jvm/functions/Function0;

    .line 464
    return-void
.end method


# virtual methods
.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 31
    .param p1, "$this$measure_u2d3p2s80s"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "constraints"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 474
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .local v1, "$this$fastFilter$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 702
    .local v2, "$i$f$fastFilter":I
    nop

    .line 703
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 704
    .local v3, "target$iv":Ljava/util/ArrayList;
    move-object v4, v1

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 705
    .local v5, "$i$f$fastForEach":I
    nop

    .line 706
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_1

    .line 707
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 708
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 704
    .local v10, "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    move-object v11, v9

    check-cast v11, Landroidx/compose/ui/layout/Measurable;

    .local v11, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v12, 0x0

    .line 474
    .local v12, "$i$a$-fastFilter-TextMeasurePolicy$measure$inlineContentMeasurables$1":I
    invoke-interface {v11}, Landroidx/compose/ui/layout/Measurable;->getParentData()Ljava/lang/Object;

    move-result-object v13

    instance-of v13, v13, Landroidx/compose/foundation/text/TextRangeLayoutModifier;

    .line 704
    .end local v11    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v12    # "$i$a$-fastFilter-TextMeasurePolicy$measure$inlineContentMeasurables$1":I
    if-nez v13, :cond_0

    move-object v11, v3

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 708
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    :cond_0
    nop

    .line 706
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 710
    .end local v6    # "index$iv$iv":I
    :cond_1
    nop

    .line 711
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    move-object v1, v3

    check-cast v1, Ljava/util/List;

    .line 474
    .end local v1    # "$this$fastFilter$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastFilter":I
    .end local v3    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 473
    nop

    .line 476
    .local v1, "inlineContentMeasurables":Ljava/util/List;
    iget-object v2, v0, Landroidx/compose/foundation/text/TextMeasurePolicy;->placements:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_5

    .local v2, "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 712
    .local v4, "$i$f$fastMapIndexedNotNull":I
    nop

    .line 713
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 714
    .local v5, "target$iv":Ljava/util/ArrayList;
    move-object v6, v2

    .local v6, "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 715
    .local v7, "$i$f$fastForEachIndexed":I
    nop

    .line 716
    const/4 v8, 0x0

    .local v8, "index$iv$iv":I
    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    :goto_1
    if-ge v8, v9, :cond_4

    .line 717
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 718
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move v11, v8

    .local v11, "index$iv":I
    move-object v12, v10

    .local v12, "e$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 714
    .local v13, "$i$a$-fastForEachIndexed-ListUtilsKt$fastMapIndexedNotNull$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/geometry/Rect;

    .local v14, "rect":Landroidx/compose/ui/geometry/Rect;
    move v15, v11

    .local v15, "index":I
    const/16 v16, 0x0

    .line 479
    .local v16, "$i$a$-fastMapIndexedNotNull-TextMeasurePolicy$measure$inlineContentToPlace$1":I
    if-eqz v14, :cond_2

    move-object/from16 v17, v14

    .local v17, "it":Landroidx/compose/ui/geometry/Rect;
    const/16 v18, 0x0

    .line 480
    .local v18, "$i$a$-let-TextMeasurePolicy$measure$inlineContentToPlace$1$1":I
    new-instance v3, Lkotlin/Pair;

    .line 481
    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v1

    .end local v1    # "inlineContentMeasurables":Ljava/util/List;
    .local v20, "inlineContentMeasurables":Ljava/util/List;
    move-object/from16 v1, v19

    check-cast v1, Landroidx/compose/ui/layout/Measurable;

    .line 482
    nop

    .line 483
    move-object/from16 v19, v17

    .local v19, "this_$iv":Landroidx/compose/ui/geometry/Rect;
    const/16 v21, 0x0

    .line 719
    .local v21, "$i$f$getWidth":I
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v22

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v23

    move-object/from16 v24, v2

    .end local v2    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .local v24, "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    sub-float v2, v22, v23

    .line 483
    .end local v19    # "this_$iv":Landroidx/compose/ui/geometry/Rect;
    .end local v21    # "$i$f$getWidth":I
    move/from16 v19, v4

    move-object/from16 v21, v5

    .end local v4    # "$i$f$fastMapIndexedNotNull":I
    .end local v5    # "target$iv":Ljava/util/ArrayList;
    .local v19, "$i$f$fastMapIndexedNotNull":I
    .local v21, "target$iv":Ljava/util/ArrayList;
    float-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v2, v4

    float-to-int v2, v2

    .line 482
    nop

    .line 484
    move-object/from16 v4, v17

    .local v4, "this_$iv":Landroidx/compose/ui/geometry/Rect;
    const/4 v5, 0x0

    .line 720
    .local v5, "$i$f$getHeight":I
    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v22

    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v23

    sub-float v4, v22, v23

    .line 484
    .end local v4    # "this_$iv":Landroidx/compose/ui/geometry/Rect;
    .end local v5    # "$i$f$getHeight":I
    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    .line 482
    const/16 v29, 0x5

    const/16 v30, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 v26, v2

    move/from16 v28, v4

    invoke-static/range {v25 .. v30}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v4

    .line 481
    invoke-interface {v1, v4, v5}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    .line 487
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v2

    .local v2, "$this$fastRoundToInt$iv":F
    const/4 v4, 0x0

    .line 721
    .local v4, "$i$f$fastRoundToInt":I
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 487
    .end local v2    # "$this$fastRoundToInt$iv":F
    .end local v4    # "$i$f$fastRoundToInt":I
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v4

    .local v4, "$this$fastRoundToInt$iv":F
    const/4 v5, 0x0

    .line 721
    .local v5, "$i$f$fastRoundToInt":I
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 487
    .end local v4    # "$this$fastRoundToInt$iv":F
    .end local v5    # "$i$f$fastRoundToInt":I
    nop

    .local v2, "x$iv":I
    .local v4, "y$iv":I
    const/4 v5, 0x0

    .line 722
    .local v5, "$i$f$IntOffset":I
    const/16 v22, 0x0

    .line 723
    .local v22, "$i$f$packInts":I
    move/from16 v25, v5

    move-object/from16 v23, v6

    .end local v5    # "$i$f$IntOffset":I
    .end local v6    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .local v23, "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .local v25, "$i$f$IntOffset":I
    int-to-long v5, v2

    const/16 v26, 0x20

    shl-long v5, v5, v26

    move-wide/from16 v26, v5

    int-to-long v5, v4

    const-wide v28, 0xffffffffL

    and-long v5, v5, v28

    or-long v5, v26, v5

    .line 722
    .end local v22    # "$i$f$packInts":I
    invoke-static {v5, v6}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v4

    .end local v2    # "x$iv":I
    .end local v4    # "y$iv":I
    .end local v25    # "$i$f$IntOffset":I
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->box-impl(J)Landroidx/compose/ui/unit/IntOffset;

    move-result-object v2

    .line 480
    invoke-direct {v3, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 488
    nop

    .line 479
    .end local v17    # "it":Landroidx/compose/ui/geometry/Rect;
    .end local v18    # "$i$a$-let-TextMeasurePolicy$measure$inlineContentToPlace$1$1":I
    goto :goto_2

    .end local v19    # "$i$f$fastMapIndexedNotNull":I
    .end local v20    # "inlineContentMeasurables":Ljava/util/List;
    .end local v21    # "target$iv":Ljava/util/ArrayList;
    .end local v23    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .end local v24    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .restart local v1    # "inlineContentMeasurables":Ljava/util/List;
    .local v2, "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .local v4, "$i$f$fastMapIndexedNotNull":I
    .local v5, "target$iv":Ljava/util/ArrayList;
    .restart local v6    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    :cond_2
    move-object/from16 v20, v1

    move-object/from16 v24, v2

    move/from16 v19, v4

    move-object/from16 v21, v5

    move-object/from16 v23, v6

    .end local v1    # "inlineContentMeasurables":Ljava/util/List;
    .end local v2    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastMapIndexedNotNull":I
    .end local v5    # "target$iv":Ljava/util/ArrayList;
    .end local v6    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .restart local v19    # "$i$f$fastMapIndexedNotNull":I
    .restart local v20    # "inlineContentMeasurables":Ljava/util/List;
    .restart local v21    # "target$iv":Ljava/util/ArrayList;
    .restart local v23    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .restart local v24    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 489
    :goto_2
    nop

    .line 714
    .end local v14    # "rect":Landroidx/compose/ui/geometry/Rect;
    .end local v15    # "index":I
    .end local v16    # "$i$a$-fastMapIndexedNotNull-TextMeasurePolicy$measure$inlineContentToPlace$1":I
    if-eqz v3, :cond_3

    .line 724
    .local v3, "it$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 714
    .local v1, "$i$a$-let-ListUtilsKt$fastMapIndexedNotNull$2$1$iv":I
    move-object/from16 v2, v21

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 718
    .end local v1    # "$i$a$-let-ListUtilsKt$fastMapIndexedNotNull$2$1$iv":I
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v11    # "index$iv":I
    .end local v12    # "e$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEachIndexed-ListUtilsKt$fastMapIndexedNotNull$2$iv":I
    :cond_3
    nop

    .line 716
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    move/from16 v4, v19

    move-object/from16 v1, v20

    move-object/from16 v5, v21

    move-object/from16 v6, v23

    move-object/from16 v2, v24

    goto/16 :goto_1

    .end local v19    # "$i$f$fastMapIndexedNotNull":I
    .end local v20    # "inlineContentMeasurables":Ljava/util/List;
    .end local v21    # "target$iv":Ljava/util/ArrayList;
    .end local v23    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .end local v24    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .local v1, "inlineContentMeasurables":Ljava/util/List;
    .restart local v2    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .restart local v4    # "$i$f$fastMapIndexedNotNull":I
    .restart local v5    # "target$iv":Ljava/util/ArrayList;
    .restart local v6    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    :cond_4
    move-object/from16 v20, v1

    move-object/from16 v24, v2

    move/from16 v19, v4

    move-object/from16 v21, v5

    move-object/from16 v23, v6

    .line 725
    .end local v1    # "inlineContentMeasurables":Ljava/util/List;
    .end local v2    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastMapIndexedNotNull":I
    .end local v5    # "target$iv":Ljava/util/ArrayList;
    .end local v6    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .end local v8    # "index$iv$iv":I
    .restart local v19    # "$i$f$fastMapIndexedNotNull":I
    .restart local v20    # "inlineContentMeasurables":Ljava/util/List;
    .restart local v21    # "target$iv":Ljava/util/ArrayList;
    .restart local v23    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    .restart local v24    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    nop

    .line 726
    .end local v7    # "$i$f$fastForEachIndexed":I
    .end local v23    # "$this$fastForEachIndexed$iv$iv":Ljava/util/List;
    move-object/from16 v3, v21

    check-cast v3, Ljava/util/List;

    .end local v19    # "$i$f$fastMapIndexedNotNull":I
    .end local v21    # "target$iv":Ljava/util/ArrayList;
    .end local v24    # "$this$fastMapIndexedNotNull$iv":Ljava/util/List;
    goto :goto_3

    .line 476
    .end local v20    # "inlineContentMeasurables":Ljava/util/List;
    .restart local v1    # "inlineContentMeasurables":Ljava/util/List;
    :cond_5
    move-object/from16 v20, v1

    .end local v1    # "inlineContentMeasurables":Ljava/util/List;
    .restart local v20    # "inlineContentMeasurables":Ljava/util/List;
    const/4 v3, 0x0

    .line 475
    :goto_3
    nop

    .line 493
    .local v3, "inlineContentToPlace":Ljava/util/List;
    move-object/from16 v1, p2

    .local v1, "$this$fastFilter$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 727
    .local v2, "$i$f$fastFilter":I
    nop

    .line 728
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 729
    .local v4, "target$iv":Ljava/util/ArrayList;
    move-object v5, v1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 730
    .local v6, "$i$f$fastForEach":I
    nop

    .line 731
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_4
    if-ge v7, v8, :cond_7

    .line 732
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 733
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 729
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    move-object v12, v10

    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    .local v12, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v13, 0x0

    .line 493
    .local v13, "$i$a$-fastFilter-TextMeasurePolicy$measure$linksMeasurables$1":I
    invoke-interface {v12}, Landroidx/compose/ui/layout/Measurable;->getParentData()Ljava/lang/Object;

    move-result-object v14

    instance-of v12, v14, Landroidx/compose/foundation/text/TextRangeLayoutModifier;

    .line 729
    .end local v12    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v13    # "$i$a$-fastFilter-TextMeasurePolicy$measure$linksMeasurables$1":I
    if-eqz v12, :cond_6

    move-object v12, v4

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 733
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    :cond_6
    nop

    .line 731
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 735
    .end local v7    # "index$iv$iv":I
    :cond_7
    nop

    .line 736
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    move-object v1, v4

    check-cast v1, Ljava/util/List;

    .line 493
    .end local v1    # "$this$fastFilter$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastFilter":I
    .end local v4    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 496
    .local v1, "linksMeasurables":Ljava/util/List;
    nop

    .line 497
    iget-object v2, v0, Landroidx/compose/foundation/text/TextMeasurePolicy;->shouldMeasureLinks:Lkotlin/jvm/functions/Function0;

    .line 495
    invoke-static {v1, v2}, Landroidx/compose/foundation/text/BasicTextKt;->access$measureWithTextRangeMeasureConstraints(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/util/List;

    move-result-object v2

    .line 494
    nop

    .line 500
    .local v2, "linksToPlace":Ljava/util/List;
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v5

    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v6

    new-instance v4, Landroidx/compose/foundation/text/TextMeasurePolicy$measure$1;

    invoke-direct {v4, v3, v2}, Landroidx/compose/foundation/text/TextMeasurePolicy$measure$1;-><init>(Ljava/util/List;Ljava/util/List;)V

    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    return-object v5
.end method
