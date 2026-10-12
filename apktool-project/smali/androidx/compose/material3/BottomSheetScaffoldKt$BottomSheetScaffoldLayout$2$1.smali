.class final Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;
.super Ljava/lang/Object;
.source "BottomSheetScaffold.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MultiContentMeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/BottomSheetScaffoldKt;->BottomSheetScaffoldLayout-2E65NiM(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,410:1\n151#2,3:411\n33#2,4:414\n154#2,2:418\n38#2:420\n156#2:421\n151#2,3:422\n33#2,4:425\n154#2,2:429\n38#2:431\n156#2:432\n317#2,8:433\n151#2,3:441\n33#2,4:444\n154#2,2:448\n38#2:450\n156#2:451\n151#2,3:452\n33#2,4:455\n154#2,2:459\n38#2:461\n156#2:462\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1\n*L\n378#1:411,3\n378#1:414,4\n378#1:418,2\n378#1:420\n378#1:421\n380#1:422,3\n380#1:425,4\n380#1:429,2\n380#1:431\n380#1:432\n381#1:433,8\n384#1:441,3\n384#1:444,4\n384#1:448,2\n384#1:450\n384#1:451\n386#1:452,3\n386#1:455,4\n386#1:459,2\n386#1:461\n386#1:462\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "<name for destructuring parameter 0>",
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
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $sheetOffset:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sheetState:Landroidx/compose/material3/SheetState;


# direct methods
.method constructor <init>(Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetState;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetState:Landroidx/compose/material3/SheetState;

    iput-object p2, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetOffset:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 31
    .param p1, "$this$Layout"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p3, "constraints"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;>;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 372
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .local v3, "topBarMeasurables":Ljava/util/List;
    const/4 v4, 0x1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .local v4, "bodyMeasurables":Ljava/util/List;
    const/4 v5, 0x2

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .local v5, "bottomSheetMeasurables":Ljava/util/List;
    const/4 v6, 0x3

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 374
    .local v1, "snackbarHostMeasurables":Ljava/util/List;
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v7

    .line 375
    .local v7, "layoutWidth":I
    invoke-static/range {p3 .. p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v12

    .line 376
    .local v12, "layoutHeight":I
    const/16 v19, 0xa

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-wide/from16 v13, p3

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v8

    .line 378
    .local v8, "looseConstraints":J
    move-object v6, v5

    .local v6, "$this$fastMap$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 411
    .local v10, "$i$f$fastMap":I
    nop

    .line 412
    new-instance v11, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 413
    .local v11, "target$iv":Ljava/util/ArrayList;
    move-object v13, v6

    .local v13, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 414
    .local v14, "$i$f$fastForEach":I
    nop

    .line 415
    const/4 v15, 0x0

    .local v15, "index$iv$iv":I
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v15, v2, :cond_0

    .line 416
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 417
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    .local v18, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 418
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 p2, v1

    .end local v1    # "snackbarHostMeasurables":Ljava/util/List;
    .local p2, "snackbarHostMeasurables":Ljava/util/List;
    move-object v1, v11

    check-cast v1, Ljava/util/Collection;

    move/from16 v20, v2

    move-object/from16 v2, v18

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .local v2, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v21, 0x0

    .line 378
    .local v21, "$i$a$-fastMap-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$sheetPlaceables$1":I
    invoke-interface {v2, v8, v9}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    .line 418
    .end local v2    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v21    # "$i$a$-fastMap-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$sheetPlaceables$1":I
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 419
    nop

    .line 417
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 415
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, p2

    move/from16 v2, v20

    goto :goto_0

    .end local p2    # "snackbarHostMeasurables":Ljava/util/List;
    .restart local v1    # "snackbarHostMeasurables":Ljava/util/List;
    :cond_0
    move-object/from16 p2, v1

    .line 420
    .end local v1    # "snackbarHostMeasurables":Ljava/util/List;
    .end local v15    # "index$iv$iv":I
    .restart local p2    # "snackbarHostMeasurables":Ljava/util/List;
    nop

    .line 421
    .end local v13    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastForEach":I
    move-object v1, v11

    check-cast v1, Ljava/util/List;

    .line 378
    .end local v6    # "$this$fastMap$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastMap":I
    .end local v11    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 380
    .local v1, "sheetPlaceables":Ljava/util/List;
    move-object v2, v3

    .local v2, "$this$fastMap$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 422
    .local v6, "$i$f$fastMap":I
    nop

    .line 423
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 424
    .local v10, "target$iv":Ljava/util/ArrayList;
    move-object v11, v2

    .local v11, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v13, 0x0

    .line 425
    .local v13, "$i$f$fastForEach":I
    nop

    .line 426
    const/4 v14, 0x0

    .local v14, "index$iv$iv":I
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v15

    :goto_1
    if-ge v14, v15, :cond_1

    .line 427
    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 428
    .restart local v17    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    .restart local v18    # "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 429
    .restart local v19    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v20, v1

    .end local v1    # "sheetPlaceables":Ljava/util/List;
    .local v20, "sheetPlaceables":Ljava/util/List;
    move-object v1, v10

    check-cast v1, Ljava/util/Collection;

    move-object/from16 v21, v2

    .end local v2    # "$this$fastMap$iv":Ljava/util/List;
    .local v21, "$this$fastMap$iv":Ljava/util/List;
    move-object/from16 v2, v18

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .local v2, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v22, 0x0

    .line 380
    .local v22, "$i$a$-fastMap-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarPlaceables$1":I
    invoke-interface {v2, v8, v9}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    .line 429
    .end local v2    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v22    # "$i$a$-fastMap-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarPlaceables$1":I
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 430
    nop

    .line 428
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 426
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    goto :goto_1

    .end local v20    # "sheetPlaceables":Ljava/util/List;
    .end local v21    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v1    # "sheetPlaceables":Ljava/util/List;
    .local v2, "$this$fastMap$iv":Ljava/util/List;
    :cond_1
    move-object/from16 v20, v1

    move-object/from16 v21, v2

    .line 431
    .end local v1    # "sheetPlaceables":Ljava/util/List;
    .end local v2    # "$this$fastMap$iv":Ljava/util/List;
    .end local v14    # "index$iv$iv":I
    .restart local v20    # "sheetPlaceables":Ljava/util/List;
    .restart local v21    # "$this$fastMap$iv":Ljava/util/List;
    nop

    .line 432
    .end local v11    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v13    # "$i$f$fastForEach":I
    move-object v14, v10

    check-cast v14, Ljava/util/List;

    .line 380
    .end local v6    # "$i$f$fastMap":I
    .end local v10    # "target$iv":Ljava/util/ArrayList;
    .end local v21    # "$this$fastMap$iv":Ljava/util/List;
    nop

    .line 381
    .local v14, "topBarPlaceables":Ljava/util/List;
    move-object v1, v14

    .local v1, "$this$fastMaxOfOrNull$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 433
    .local v2, "$i$f$fastMaxOfOrNull":I
    nop

    .line 434
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v6, 0x0

    move-object v10, v6

    const/4 v6, 0x0

    goto :goto_3

    .line 435
    :cond_2
    const/4 v6, 0x0

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/ui/layout/Placeable;

    .local v10, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v11, 0x0

    .line 381
    .local v11, "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarHeight$1":I
    invoke-virtual {v10}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v10

    .end local v10    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v11    # "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarHeight$1":I
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 435
    check-cast v10, Ljava/lang/Comparable;

    .line 436
    .local v10, "maxValue$iv":Ljava/lang/Comparable;
    const/4 v11, 0x1

    .local v11, "i$iv":I
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v13

    if-gt v11, v13, :cond_4

    .line 437
    :goto_2
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/compose/ui/layout/Placeable;

    .local v15, "it":Landroidx/compose/ui/layout/Placeable;
    const/16 v16, 0x0

    .line 381
    .local v16, "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarHeight$1":I
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v15

    .end local v15    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v16    # "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarHeight$1":I
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    .line 437
    check-cast v15, Ljava/lang/Comparable;

    .line 438
    .local v15, "v$iv":Ljava/lang/Comparable;
    invoke-interface {v15, v10}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v16

    if-lez v16, :cond_3

    move-object v10, v15

    .line 436
    .end local v15    # "v$iv":Ljava/lang/Comparable;
    :cond_3
    if-eq v11, v13, :cond_4

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 440
    .end local v11    # "i$iv":I
    :cond_4
    nop

    .line 381
    .end local v1    # "$this$fastMaxOfOrNull$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastMaxOfOrNull":I
    .end local v10    # "maxValue$iv":Ljava/lang/Comparable;
    :goto_3
    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_5

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move v15, v2

    goto :goto_4

    :cond_5
    move v15, v6

    .line 383
    .local v15, "topBarHeight":I
    :goto_4
    sub-int v26, v12, v15

    const/16 v27, 0x7

    const/16 v28, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-wide/from16 v21, v8

    .end local v8    # "looseConstraints":J
    .local v21, "looseConstraints":J
    invoke-static/range {v21 .. v28}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v1

    .line 384
    .end local v21    # "looseConstraints":J
    .local v1, "bodyConstraints":J
    .restart local v8    # "looseConstraints":J
    move-object v6, v4

    .local v6, "$this$fastMap$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 441
    .local v10, "$i$f$fastMap":I
    nop

    .line 442
    new-instance v11, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 443
    .local v11, "target$iv":Ljava/util/ArrayList;
    move-object v13, v6

    .local v13, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 444
    .local v16, "$i$f$fastForEach":I
    nop

    .line 445
    const/16 v17, 0x0

    move-object/from16 v18, v3

    .end local v3    # "topBarMeasurables":Ljava/util/List;
    .local v17, "index$iv$iv":I
    .local v18, "topBarMeasurables":Ljava/util/List;
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 v19, v4

    move/from16 v4, v17

    .end local v17    # "index$iv$iv":I
    .local v4, "index$iv$iv":I
    .local v19, "bodyMeasurables":Ljava/util/List;
    :goto_5
    if-ge v4, v3, :cond_6

    .line 446
    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 447
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v17

    .local v21, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 448
    .local v22, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move/from16 v23, v3

    move-object v3, v11

    check-cast v3, Ljava/util/Collection;

    move/from16 v24, v4

    .end local v4    # "index$iv$iv":I
    .local v24, "index$iv$iv":I
    move-object/from16 v4, v21

    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    .local v4, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v25, 0x0

    .line 384
    .local v25, "$i$a$-fastMap-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$bodyPlaceables$1":I
    invoke-interface {v4, v1, v2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v4

    .line 448
    .end local v4    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v25    # "$i$a$-fastMap-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$bodyPlaceables$1":I
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 449
    nop

    .line 447
    .end local v21    # "it$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 445
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v4, v24, 0x1

    move/from16 v3, v23

    .end local v24    # "index$iv$iv":I
    .local v4, "index$iv$iv":I
    goto :goto_5

    :cond_6
    move/from16 v24, v4

    .line 450
    .end local v4    # "index$iv$iv":I
    nop

    .line 451
    .end local v13    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastForEach":I
    move-object v13, v11

    check-cast v13, Ljava/util/List;

    .line 384
    .end local v6    # "$this$fastMap$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastMap":I
    .end local v11    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 386
    .local v13, "bodyPlaceables":Ljava/util/List;
    move-object/from16 v3, p2

    .local v3, "$this$fastMap$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 452
    .local v4, "$i$f$fastMap":I
    nop

    .line 453
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 454
    .local v6, "target$iv":Ljava/util/ArrayList;
    move-object v10, v3

    .local v10, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v11, 0x0

    .line 455
    .local v11, "$i$f$fastForEach":I
    nop

    .line 456
    const/16 v16, 0x0

    move-wide/from16 v21, v1

    .end local v1    # "bodyConstraints":J
    .local v16, "index$iv$iv":I
    .local v21, "bodyConstraints":J
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v1

    move/from16 v2, v16

    .end local v16    # "index$iv$iv":I
    .local v2, "index$iv$iv":I
    :goto_6
    if-ge v2, v1, :cond_7

    .line 457
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 458
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    .local v17, "it$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 459
    .local v23, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move/from16 v24, v1

    move-object v1, v6

    check-cast v1, Ljava/util/Collection;

    move/from16 v25, v2

    .end local v2    # "index$iv$iv":I
    .local v25, "index$iv$iv":I
    move-object/from16 v2, v17

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .local v2, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v26, 0x0

    .line 386
    .local v26, "$i$a$-fastMap-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$snackbarPlaceables$1":I
    invoke-interface {v2, v8, v9}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    .line 459
    .end local v2    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v26    # "$i$a$-fastMap-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$snackbarPlaceables$1":I
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 460
    nop

    .line 458
    .end local v17    # "it$iv":Ljava/lang/Object;
    .end local v23    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 456
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v2, v25, 0x1

    move/from16 v1, v24

    .end local v25    # "index$iv$iv":I
    .local v2, "index$iv$iv":I
    goto :goto_6

    .line 461
    .end local v2    # "index$iv$iv":I
    :cond_7
    nop

    .line 462
    .end local v10    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v11    # "$i$f$fastForEach":I
    move-object v1, v6

    check-cast v1, Ljava/util/List;

    .line 386
    .end local v3    # "$this$fastMap$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastMap":I
    .end local v6    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 388
    .local v1, "snackbarPlaceables":Ljava/util/List;
    new-instance v6, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;

    iget-object v10, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetState:Landroidx/compose/material3/SheetState;

    iget-object v11, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->$sheetOffset:Lkotlin/jvm/functions/Function0;

    move-wide/from16 v29, v8

    move-object v9, v1

    move-wide/from16 v1, v29

    move v8, v7

    move-object/from16 v7, v20

    .end local v20    # "sheetPlaceables":Ljava/util/List;
    .local v1, "looseConstraints":J
    .local v7, "sheetPlaceables":Ljava/util/List;
    .local v8, "layoutWidth":I
    .local v9, "snackbarPlaceables":Ljava/util/List;
    invoke-direct/range {v6 .. v15}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;-><init>(Ljava/util/List;ILjava/util/List;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;ILjava/util/List;Ljava/util/List;I)V

    move v7, v8

    move-object v3, v9

    .end local v8    # "layoutWidth":I
    .end local v9    # "snackbarPlaceables":Ljava/util/List;
    .local v3, "snackbarPlaceables":Ljava/util/List;
    .local v7, "layoutWidth":I
    .restart local v20    # "sheetPlaceables":Ljava/util/List;
    move-object v10, v6

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x4

    move v8, v12

    .end local v12    # "layoutHeight":I
    .local v8, "layoutHeight":I
    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v4

    move v12, v8

    .end local v8    # "layoutHeight":I
    .restart local v12    # "layoutHeight":I
    return-object v4
.end method
