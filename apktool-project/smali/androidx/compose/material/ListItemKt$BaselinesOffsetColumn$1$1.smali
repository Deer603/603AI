.class final Landroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$1;
.super Ljava/lang/Object;
.source "ListItem.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/ListItemKt;->BaselinesOffsetColumn(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,445:1\n151#2,3:446\n33#2,4:449\n154#2,2:453\n38#2:455\n156#2:456\n256#2,3:457\n33#2,4:460\n259#2,2:464\n38#2:466\n261#2:467\n69#2,6:468\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$1\n*L\n369#1:446,3\n369#1:449,4\n369#1:453,2\n369#1:455\n369#1:456\n372#1:457,3\n372#1:460,4\n372#1:464,2\n372#1:466\n372#1:467\n375#1:468,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"
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
.field final synthetic $offsets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/unit/Dp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/unit/Dp;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$1;->$offsets:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 22
    .param p1, "$this$Layout"    # Landroidx/compose/ui/layout/MeasureScope;
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

    .line 368
    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x7fffffff

    move-wide/from16 v0, p3

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    .line 369
    .local v2, "childConstraints":J
    move-object/from16 v0, p2

    .local v0, "$this$fastMap$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 446
    .local v1, "$i$f$fastMap":I
    nop

    .line 447
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 448
    .local v4, "target$iv":Ljava/util/ArrayList;
    move-object v5, v0

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 449
    .local v6, "$i$f$fastForEach":I
    nop

    .line 450
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_0

    .line 451
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 452
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 453
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v12, v4

    check-cast v12, Ljava/util/Collection;

    move-object v13, v10

    check-cast v13, Landroidx/compose/ui/layout/Measurable;

    .local v13, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v14, 0x0

    .line 369
    .local v14, "$i$a$-fastMap-ListItemKt$BaselinesOffsetColumn$1$1$placeables$1":I
    invoke-interface {v13, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v13

    .line 453
    .end local v13    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v14    # "$i$a$-fastMap-ListItemKt$BaselinesOffsetColumn$1$1$placeables$1":I
    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 454
    nop

    .line 452
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 450
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 455
    .end local v7    # "index$iv$iv":I
    :cond_0
    nop

    .line 456
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 369
    .end local v0    # "$this$fastMap$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastMap":I
    .end local v4    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 372
    .local v0, "placeables":Ljava/util/List;
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .local v4, "initial$iv":Ljava/lang/Object;
    move-object v5, v0

    .local v5, "$this$fastFold$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 457
    .local v6, "$i$f$fastFold":I
    nop

    .line 458
    const/4 v7, 0x0

    .local v7, "accumulator$iv":Ljava/lang/Object;
    move-object v7, v4

    .line 459
    move-object v8, v5

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 460
    .local v9, "$i$f$fastForEach":I
    nop

    .line 461
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    :goto_1
    if-ge v10, v11, :cond_1

    .line 462
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 463
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "e$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 464
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFold$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/Placeable;

    .local v15, "placeable":Landroidx/compose/ui/layout/Placeable;
    move-object/from16 v16, v7

    check-cast v16, Ljava/lang/Number;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    move-result v16

    .local v16, "maxWidth":I
    move/from16 v17, v16

    .end local v16    # "maxWidth":I
    .local v17, "maxWidth":I
    const/16 v16, 0x0

    .line 372
    .local v16, "$i$a$-fastFold-ListItemKt$BaselinesOffsetColumn$1$1$containerWidth$1":I
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v1

    move-wide/from16 v19, v2

    move/from16 v2, v17

    .end local v17    # "maxWidth":I
    .local v2, "maxWidth":I
    .local v19, "childConstraints":J
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .end local v2    # "maxWidth":I
    .end local v15    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v16    # "$i$a$-fastFold-ListItemKt$BaselinesOffsetColumn$1$1$containerWidth$1":I
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 464
    move-object v7, v1

    .line 465
    nop

    .line 463
    .end local v13    # "e$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFold$2$iv":I
    nop

    .line 461
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-wide/from16 v2, v19

    const/4 v1, 0x0

    goto :goto_1

    .end local v19    # "childConstraints":J
    .local v2, "childConstraints":J
    :cond_1
    move-wide/from16 v19, v2

    .line 466
    .end local v2    # "childConstraints":J
    .end local v10    # "index$iv$iv":I
    .restart local v19    # "childConstraints":J
    nop

    .line 467
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    nop

    .line 372
    .end local v4    # "initial$iv":Ljava/lang/Object;
    .end local v5    # "$this$fastFold$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastFold":I
    .end local v7    # "accumulator$iv":Ljava/lang/Object;
    move-object v1, v7

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 371
    move v3, v1

    .line 373
    .local v3, "containerWidth":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [I

    .line 374
    .local v1, "y":[I
    const/4 v2, 0x0

    .line 375
    .local v2, "containerHeight":I
    move-object/from16 v9, p0

    iget-object v4, v9, Landroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$1;->$offsets:Ljava/util/List;

    move-object v5, v0

    .local v5, "$this$fastForEachIndexed$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 468
    .local v6, "$i$f$fastForEachIndexed":I
    nop

    .line 469
    const/4 v7, 0x0

    .local v7, "index$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_2
    if-ge v7, v8, :cond_3

    .line 470
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 471
    .local v10, "item$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Landroidx/compose/ui/layout/Placeable;

    .local v11, "placeable":Landroidx/compose/ui/layout/Placeable;
    move v12, v7

    .local v12, "index":I
    const/4 v13, 0x0

    .line 377
    .local v13, "$i$a$-fastForEachIndexed-ListItemKt$BaselinesOffsetColumn$1$1$1":I
    if-lez v12, :cond_2

    .line 378
    add-int/lit8 v14, v12, -0x1

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/compose/ui/layout/Placeable;

    invoke-virtual {v14}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v14

    add-int/lit8 v15, v12, -0x1

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/compose/ui/layout/Placeable;

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v16

    move/from16 v17, v2

    .end local v2    # "containerHeight":I
    .local v17, "containerHeight":I
    move-object/from16 v2, v16

    check-cast v2, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v15, v2}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v2

    sub-int/2addr v14, v2

    goto :goto_3

    .line 379
    .end local v17    # "containerHeight":I
    .restart local v2    # "containerHeight":I
    :cond_2
    move/from16 v17, v2

    .end local v2    # "containerHeight":I
    .restart local v17    # "containerHeight":I
    const/4 v14, 0x0

    .line 377
    :goto_3
    nop

    .line 376
    nop

    .line 381
    .local v14, "toPreviousBaseline":I
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v2

    move-object/from16 v15, p1

    invoke-interface {v15, v2}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v2

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v16

    move/from16 v21, v2

    move-object/from16 v2, v16

    check-cast v2, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v11, v2}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v2

    sub-int v2, v21, v2

    sub-int/2addr v2, v14

    move/from16 v16, v3

    const/4 v3, 0x0

    .end local v3    # "containerWidth":I
    .local v16, "containerWidth":I
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 380
    nop

    .line 382
    .local v2, "topPadding":I
    add-int v18, v2, v17

    aput v18, v1, v12

    .line 383
    invoke-virtual {v11}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v18

    add-int v18, v2, v18

    add-int v17, v17, v18

    .line 384
    nop

    .line 471
    .end local v2    # "topPadding":I
    .end local v11    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v12    # "index":I
    .end local v13    # "$i$a$-fastForEachIndexed-ListItemKt$BaselinesOffsetColumn$1$1$1":I
    .end local v14    # "toPreviousBaseline":I
    nop

    .line 469
    .end local v10    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move/from16 v3, v16

    move/from16 v2, v17

    goto :goto_2

    .end local v16    # "containerWidth":I
    .end local v17    # "containerHeight":I
    .local v2, "containerHeight":I
    .restart local v3    # "containerWidth":I
    :cond_3
    move-object/from16 v15, p1

    move/from16 v17, v2

    .line 473
    .end local v2    # "containerHeight":I
    .end local v7    # "index$iv":I
    .restart local v17    # "containerHeight":I
    nop

    .line 386
    .end local v5    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEachIndexed":I
    new-instance v2, Landroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$1$2;

    invoke-direct {v2, v0, v1}, Landroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1$1$2;-><init>(Ljava/util/List;[I)V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, v15

    move/from16 v4, v17

    .end local v17    # "containerHeight":I
    .local v4, "containerHeight":I
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    .line 390
    .end local v4    # "containerHeight":I
    .restart local v17    # "containerHeight":I
    return-object v5
.end method
