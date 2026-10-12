.class final Landroidx/compose/material3/TabKt$TabBaselineLayout$2$1;
.super Ljava/lang/Object;
.source "Tab.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TabKt;->TabBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$TabBaselineLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n544#2,2:451\n33#2,6:453\n546#2:459\n544#2,2:461\n33#2,6:463\n546#2:469\n1#3:460\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$TabBaselineLayout$2$1\n*L\n319#1:451,2\n319#1:453,6\n319#1:459\n329#1:461,2\n329#1:463,6\n329#1:469\n*E\n"
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
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $icon:Lkotlin/jvm/functions/Function2;
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

.field final synthetic $text:Lkotlin/jvm/functions/Function2;
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
.method constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
    .locals 0
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
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/TabKt$TabBaselineLayout$2$1;->$text:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Landroidx/compose/material3/TabKt$TabBaselineLayout$2$1;->$icon:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 18
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

    .line 317
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/material3/TabKt$TabBaselineLayout$2$1;->$text:Lkotlin/jvm/functions/Function2;

    const-string v3, "Collection contains no element matching the predicate."

    if-eqz v2, :cond_2

    .local v2, "it":Lkotlin/jvm/functions/Function2;
    const/4 v5, 0x0

    .line 318
    .local v5, "$i$a$-let-TabKt$TabBaselineLayout$2$1$textPlaceable$1":I
    nop

    .line 319
    move-object/from16 v6, p2

    .local v6, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 451
    .local v7, "$i$f$fastFirst":I
    nop

    .line 452
    move-object v8, v6

    .local v8, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 453
    .local v9, "$i$f$fastForEach":I
    nop

    .line 454
    const/4 v10, 0x0

    .local v10, "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    :goto_0
    if-ge v10, v11, :cond_1

    .line 455
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 456
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 452
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/Measurable;

    .local v15, "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v16, 0x0

    .line 319
    .local v16, "$i$a$-fastFirst-TabKt$TabBaselineLayout$2$1$textPlaceable$1$1":I
    invoke-static {v15}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v17, v2

    .end local v2    # "it":Lkotlin/jvm/functions/Function2;
    .local v17, "it":Lkotlin/jvm/functions/Function2;
    const-string/jumbo v2, "text"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 452
    .end local v15    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v16    # "$i$a$-fastFirst-TabKt$TabBaselineLayout$2$1$textPlaceable$1$1":I
    if-eqz v2, :cond_0

    .line 459
    .end local v6    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastFirst":I
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    .end local v10    # "index$iv$iv":I
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v2, v13

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 324
    const/16 v12, 0xb

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-wide/from16 v6, p3

    invoke-static/range {v6 .. v13}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v8

    .line 320
    invoke-interface {v2, v8, v9}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v2

    .line 317
    .end local v5    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$textPlaceable$1":I
    .end local v17    # "it":Lkotlin/jvm/functions/Function2;
    goto :goto_1

    .line 456
    .restart local v5    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$textPlaceable$1":I
    .restart local v6    # "$this$fastFirst$iv":Ljava/util/List;
    .restart local v7    # "$i$f$fastFirst":I
    .restart local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v9    # "$i$f$fastForEach":I
    .restart local v10    # "index$iv$iv":I
    .restart local v12    # "item$iv$iv":Ljava/lang/Object;
    .restart local v17    # "it":Lkotlin/jvm/functions/Function2;
    :cond_0
    nop

    .line 454
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v17

    goto :goto_0

    .end local v17    # "it":Lkotlin/jvm/functions/Function2;
    .restart local v2    # "it":Lkotlin/jvm/functions/Function2;
    :cond_1
    move-object/from16 v17, v2

    .line 458
    .end local v2    # "it":Lkotlin/jvm/functions/Function2;
    .end local v10    # "index$iv$iv":I
    .restart local v17    # "it":Lkotlin/jvm/functions/Function2;
    nop

    .line 459
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 317
    .end local v5    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$textPlaceable$1":I
    .end local v6    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastFirst":I
    .end local v17    # "it":Lkotlin/jvm/functions/Function2;
    :cond_2
    const/4 v2, 0x0

    .line 316
    :goto_1
    nop

    .line 329
    .local v2, "textPlaceable":Landroidx/compose/ui/layout/Placeable;
    iget-object v4, v0, Landroidx/compose/material3/TabKt$TabBaselineLayout$2$1;->$icon:Lkotlin/jvm/functions/Function2;

    if-eqz v4, :cond_5

    .line 460
    .local v4, "it":Lkotlin/jvm/functions/Function2;
    const/4 v5, 0x0

    .line 329
    .local v5, "$i$a$-let-TabKt$TabBaselineLayout$2$1$iconPlaceable$1":I
    move-object/from16 v6, p2

    .restart local v6    # "$this$fastFirst$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 461
    .restart local v7    # "$i$f$fastFirst":I
    nop

    .line 462
    move-object v8, v6

    .restart local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 463
    .restart local v9    # "$i$f$fastForEach":I
    nop

    .line 464
    const/4 v10, 0x0

    .restart local v10    # "index$iv$iv":I
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    :goto_2
    if-ge v10, v11, :cond_4

    .line 465
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 466
    .restart local v12    # "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .restart local v13    # "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 462
    .restart local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/layout/Measurable;

    .restart local v15    # "it":Landroidx/compose/ui/layout/Measurable;
    const/16 v16, 0x0

    .line 329
    .local v16, "$i$a$-fastFirst-TabKt$TabBaselineLayout$2$1$iconPlaceable$1$1":I
    invoke-static {v15}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v4

    .end local v4    # "it":Lkotlin/jvm/functions/Function2;
    .restart local v17    # "it":Lkotlin/jvm/functions/Function2;
    const-string/jumbo v4, "icon"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 462
    .end local v15    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v16    # "$i$a$-fastFirst-TabKt$TabBaselineLayout$2$1$iconPlaceable$1$1":I
    if-eqz v0, :cond_3

    .line 469
    .end local v6    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastFirst":I
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    .end local v10    # "index$iv$iv":I
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v0, v13

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 329
    move-wide/from16 v3, p3

    invoke-interface {v0, v3, v4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    move-object v3, v0

    .end local v5    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$iconPlaceable$1":I
    .end local v17    # "it":Lkotlin/jvm/functions/Function2;
    goto :goto_3

    .line 466
    .restart local v5    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$iconPlaceable$1":I
    .restart local v6    # "$this$fastFirst$iv":Ljava/util/List;
    .restart local v7    # "$i$f$fastFirst":I
    .restart local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v9    # "$i$f$fastForEach":I
    .restart local v10    # "index$iv$iv":I
    .restart local v12    # "item$iv$iv":Ljava/lang/Object;
    .restart local v17    # "it":Lkotlin/jvm/functions/Function2;
    :cond_3
    nop

    .line 464
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object/from16 v4, v17

    goto :goto_2

    .line 468
    .end local v10    # "index$iv$iv":I
    .end local v17    # "it":Lkotlin/jvm/functions/Function2;
    .restart local v4    # "it":Lkotlin/jvm/functions/Function2;
    :cond_4
    nop

    .line 469
    .end local v8    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v9    # "$i$f$fastForEach":I
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 329
    .end local v4    # "it":Lkotlin/jvm/functions/Function2;
    .end local v5    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$iconPlaceable$1":I
    .end local v6    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastFirst":I
    :cond_5
    const/4 v3, 0x0

    .line 328
    :goto_3
    nop

    .line 331
    .local v3, "iconPlaceable":Landroidx/compose/ui/layout/Placeable;
    const/4 v0, 0x0

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v4

    goto :goto_4

    :cond_6
    move v4, v0

    :goto_4
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v5

    goto :goto_5

    :cond_7
    move v5, v0

    :goto_5
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 339
    .local v5, "tabWidth":I
    nop

    .line 334
    if-eqz v2, :cond_8

    if-eqz v3, :cond_8

    .line 335
    invoke-static {}, Landroidx/compose/material3/TabKt;->access$getLargeTabHeight$p()F

    move-result v4

    goto :goto_6

    .line 337
    :cond_8
    invoke-static {}, Landroidx/compose/material3/TabKt;->access$getSmallTabHeight$p()F

    move-result v4

    .line 339
    :goto_6
    invoke-interface {v1, v4}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v4

    .line 333
    move v9, v4

    .line 344
    .local v9, "specHeight":I
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v4

    goto :goto_7

    :cond_9
    move v4, v0

    .line 345
    :goto_7
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v0

    .line 344
    :cond_a
    add-int/2addr v4, v0

    .line 346
    invoke-static {}, Landroidx/compose/material3/TabKt;->access$getIconDistanceFromBaseline$p()J

    move-result-wide v6

    invoke-interface {v1, v6, v7}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx--R2X_6o(J)I

    move-result v0

    .line 344
    add-int/2addr v4, v0

    .line 342
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 341
    nop

    .line 349
    .local v6, "tabHeight":I
    if-eqz v2, :cond_b

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v2, v0}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v7, v0

    goto :goto_8

    :cond_b
    const/4 v7, 0x0

    .line 350
    .local v7, "firstBaseline":Ljava/lang/Integer;
    :goto_8
    if-eqz v2, :cond_c

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v2, v0}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v8, v4

    goto :goto_9

    :cond_c
    const/4 v8, 0x0

    .line 352
    .local v8, "lastBaseline":Ljava/lang/Integer;
    :goto_9
    new-instance v1, Landroidx/compose/material3/TabKt$TabBaselineLayout$2$1$1;

    move-object/from16 v4, p1

    invoke-direct/range {v1 .. v8}, Landroidx/compose/material3/TabKt$TabBaselineLayout$2$1$1;-><init>(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;IILjava/lang/Integer;Ljava/lang/Integer;)V

    move-object v0, v2

    move v2, v5

    move-object v10, v7

    move-object v11, v8

    move-object v8, v3

    move v3, v6

    .end local v5    # "tabWidth":I
    .end local v6    # "tabHeight":I
    .end local v7    # "firstBaseline":Ljava/lang/Integer;
    .local v0, "textPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v2, "tabWidth":I
    .local v3, "tabHeight":I
    .local v8, "iconPlaceable":Landroidx/compose/ui/layout/Placeable;
    .local v10, "firstBaseline":Ljava/lang/Integer;
    .local v11, "lastBaseline":Ljava/lang/Integer;
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v4

    return-object v4
.end method
