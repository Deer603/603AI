.class final Landroidx/compose/material/TabRowKt$TabRow$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "TabRow.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/TabRowKt$TabRow$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,491:1\n151#2,3:492\n33#2,4:495\n154#2,2:499\n38#2:501\n156#2:502\n171#2,13:503\n1#3:516\n87#4:517\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2$1$1\n*L\n158#1:492,3\n158#1:495,4\n158#1:499,2\n158#1:501\n158#1:502\n162#1:503,13\n165#1:517\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "invoke-0kLqBqw",
        "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"
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
.field final synthetic $divider:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $indicator:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $tabs:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/material/TabPosition;",
            ">;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$tabs:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$divider:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$indicator:Lkotlin/jvm/functions/Function3;

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 152
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/SubcomposeMeasureScope;

    move-object v1, p2

    check-cast v1, Landroidx/compose/ui/unit/Constraints;

    invoke-virtual {v1}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v0

    return-object v0
.end method

.method public final invoke-0kLqBqw(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 26
    .param p1, "$this$SubcomposeLayout"    # Landroidx/compose/ui/layout/SubcomposeMeasureScope;
    .param p2, "constraints"    # J

    .line 153
    move-object/from16 v0, p0

    move-object/from16 v3, p1

    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    .line 154
    .local v2, "tabRowWidth":I
    sget-object v1, Landroidx/compose/material/TabSlots;->Tabs:Landroidx/compose/material/TabSlots;

    iget-object v4, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$tabs:Lkotlin/jvm/functions/Function2;

    invoke-interface {v3, v1, v4}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->subcompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    move-result-object v12

    .line 155
    .local v12, "tabMeasurables":Ljava/util/List;
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    .line 156
    .local v13, "tabCount":I
    div-int v5, v2, v13

    .line 158
    .local v5, "tabWidth":I
    move-object v1, v12

    .local v1, "$this$fastMap$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 492
    .local v14, "$i$f$fastMap":I
    nop

    .line 493
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v15, v4

    .line 494
    .local v15, "target$iv":Ljava/util/ArrayList;
    move-object v4, v1

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 495
    .local v16, "$i$f$fastForEach":I
    nop

    .line 496
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_0

    .line 497
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 498
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    .local v18, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 499
    .local v19, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v8, v15

    check-cast v8, Ljava/util/Collection;

    move-object/from16 v9, v18

    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .local v9, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v20, 0x0

    .line 159
    .local v20, "$i$a$-fastMap-TabRowKt$TabRow$2$1$1$tabPlaceables$1":I
    const/16 v10, 0xc

    const/4 v11, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v22, v9

    .end local v9    # "it":Landroidx/compose/ui/layout/Measurable;
    .local v22, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v9, 0x0

    move/from16 v23, v7

    move v7, v5

    move-object/from16 v24, v1

    move/from16 v25, v2

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    move-object/from16 v21, v4

    move/from16 v22, v6

    move v6, v5

    move-wide/from16 v4, p2

    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "tabWidth":I
    .local v2, "it":Landroidx/compose/ui/layout/Measurable;
    .local v6, "tabWidth":I
    .local v21, "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v22, "index$iv$iv":I
    .local v24, "$this$fastMap$iv":Ljava/util/List;
    .local v25, "tabRowWidth":I
    invoke-static/range {v4 .. v11}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v7

    move v5, v6

    .end local v6    # "tabWidth":I
    .restart local v5    # "tabWidth":I
    invoke-interface {v2, v7, v8}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    .line 499
    .end local v2    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v20    # "$i$a$-fastMap-TabRowKt$TabRow$2$1$1$tabPlaceables$1":I
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 500
    nop

    .line 498
    .end local v18    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 496
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v22, 0x1

    move-object/from16 v4, v21

    move/from16 v7, v23

    move-object/from16 v1, v24

    move/from16 v2, v25

    .end local v22    # "index$iv$iv":I
    .local v6, "index$iv$iv":I
    goto :goto_0

    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v24    # "$this$fastMap$iv":Ljava/util/List;
    .end local v25    # "tabRowWidth":I
    .restart local v1    # "$this$fastMap$iv":Ljava/util/List;
    .local v2, "tabRowWidth":I
    .restart local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    :cond_0
    move-object/from16 v24, v1

    move/from16 v25, v2

    move-object/from16 v21, v4

    move/from16 v22, v6

    .line 501
    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .end local v2    # "tabRowWidth":I
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "index$iv$iv":I
    .restart local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v24    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v25    # "tabRowWidth":I
    nop

    .line 502
    .end local v16    # "$i$f$fastForEach":I
    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v2, v15

    check-cast v2, Ljava/util/List;

    .line 158
    .end local v14    # "$i$f$fastMap":I
    .end local v15    # "target$iv":Ljava/util/ArrayList;
    .end local v24    # "$this$fastMap$iv":Ljava/util/List;
    nop

    .line 157
    nop

    .line 162
    .local v2, "tabPlaceables":Ljava/util/List;
    move-object v1, v2

    .local v1, "$this$fastMaxBy$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 503
    .local v4, "$i$f$fastMaxBy":I
    nop

    .line 504
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v6, :cond_1

    move-object v6, v7

    goto :goto_2

    .line 505
    :cond_1
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 506
    .local v6, "maxElem$iv":Ljava/lang/Object;
    move-object v9, v6

    check-cast v9, Landroidx/compose/ui/layout/Placeable;

    .local v9, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v10, 0x0

    .line 162
    .local v10, "$i$a$-fastMaxBy-TabRowKt$TabRow$2$1$1$tabRowHeight$1":I
    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v9

    .line 506
    .end local v9    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v10    # "$i$a$-fastMaxBy-TabRowKt$TabRow$2$1$1$tabRowHeight$1":I
    nop

    .line 507
    .local v9, "maxValue$iv":I
    const/4 v10, 0x1

    .local v10, "i$iv":I
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v11

    if-gt v10, v11, :cond_3

    .line 508
    :goto_1
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 509
    .local v14, "e$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Landroidx/compose/ui/layout/Placeable;

    .local v15, "it":Landroidx/compose/ui/layout/Placeable;
    const/16 v16, 0x0

    .line 162
    .local v16, "$i$a$-fastMaxBy-TabRowKt$TabRow$2$1$1$tabRowHeight$1":I
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v15

    .line 509
    .end local v15    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v16    # "$i$a$-fastMaxBy-TabRowKt$TabRow$2$1$1$tabRowHeight$1":I
    nop

    .line 510
    .local v15, "v$iv":I
    if-ge v9, v15, :cond_2

    .line 511
    move-object v6, v14

    .line 512
    move v9, v15

    .line 507
    .end local v14    # "e$iv":Ljava/lang/Object;
    .end local v15    # "v$iv":I
    :cond_2
    if-eq v10, v11, :cond_3

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 515
    .end local v10    # "i$iv":I
    :cond_3
    nop

    .line 162
    .end local v1    # "$this$fastMaxBy$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastMaxBy":I
    .end local v6    # "maxElem$iv":Ljava/lang/Object;
    .end local v9    # "maxValue$iv":I
    :goto_2
    check-cast v6, Landroidx/compose/ui/layout/Placeable;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v1

    goto :goto_3

    :cond_4
    move v1, v8

    .line 165
    .local v1, "tabRowHeight":I
    :goto_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v13}, Ljava/util/ArrayList;-><init>(I)V

    :goto_4
    if-ge v8, v13, :cond_5

    .line 516
    move v6, v8

    .local v6, "index":I
    const/4 v9, 0x0

    .line 165
    .local v9, "$i$a$-List-TabRowKt$TabRow$2$1$1$tabPositions$1":I
    new-instance v10, Landroidx/compose/material/TabPosition;

    invoke-interface {v3, v5}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toDp-u2uoSUM(I)F

    move-result v11

    .local v11, "arg0$iv":F
    const/4 v14, 0x0

    .line 517
    .local v14, "$i$f$times-u2uoSUM":I
    int-to-float v15, v6

    mul-float/2addr v15, v11

    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v11

    .line 165
    .end local v11    # "arg0$iv":F
    .end local v14    # "$i$f$times-u2uoSUM":I
    invoke-interface {v3, v5}, Landroidx/compose/ui/layout/SubcomposeMeasureScope;->toDp-u2uoSUM(I)F

    move-result v14

    invoke-direct {v10, v11, v14, v7}, Landroidx/compose/material/TabPosition;-><init>(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v6    # "index":I
    .end local v9    # "$i$a$-List-TabRowKt$TabRow$2$1$1$tabPositions$1":I
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_5
    move-object v10, v4

    check-cast v10, Ljava/util/List;

    .line 164
    nop

    .line 167
    .local v10, "tabPositions":Ljava/util/List;
    move-object v14, v3

    check-cast v14, Landroidx/compose/ui/layout/MeasureScope;

    move v8, v1

    .end local v1    # "tabRowHeight":I
    .local v8, "tabRowHeight":I
    new-instance v1, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;

    iget-object v4, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$divider:Lkotlin/jvm/functions/Function2;

    iget-object v9, v0, Landroidx/compose/material/TabRowKt$TabRow$2$1$1;->$indicator:Lkotlin/jvm/functions/Function3;

    move-wide/from16 v6, p2

    move/from16 v11, v25

    .end local v25    # "tabRowWidth":I
    .local v11, "tabRowWidth":I
    invoke-direct/range {v1 .. v11}, Landroidx/compose/material/TabRowKt$TabRow$2$1$1$1;-><init>(Ljava/util/List;Landroidx/compose/ui/layout/SubcomposeMeasureScope;Lkotlin/jvm/functions/Function2;IJILkotlin/jvm/functions/Function3;Ljava/util/List;I)V

    move-object v9, v2

    move v3, v8

    move v2, v11

    move v8, v5

    .end local v5    # "tabWidth":I
    .end local v11    # "tabRowWidth":I
    .local v2, "tabRowWidth":I
    .local v3, "tabRowHeight":I
    .local v8, "tabWidth":I
    .local v9, "tabPlaceables":Ljava/util/List;
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, v14

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v1

    .line 181
    return-object v1
.end method
