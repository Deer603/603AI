.class final Landroidx/compose/material/TabKt$TabBaselineLayout$2$1;
.super Ljava/lang/Object;
.source "Tab.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/TabKt;->TabBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$TabBaselineLayout$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,430:1\n544#2,2:431\n33#2,6:433\n546#2:439\n544#2,2:441\n33#2,6:443\n546#2:449\n1#3:440\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$TabBaselineLayout$2$1\n*L\n313#1:431,2\n313#1:433,6\n313#1:439\n323#1:441,2\n323#1:443,6\n323#1:449\n*E\n"
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

    iput-object p1, p0, Landroidx/compose/material/TabKt$TabBaselineLayout$2$1;->$text:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Landroidx/compose/material/TabKt$TabBaselineLayout$2$1;->$icon:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 17
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

    .line 311
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/material/TabKt$TabBaselineLayout$2$1;->$text:Lkotlin/jvm/functions/Function2;

    const-string v2, "Collection contains no element matching the predicate."

    if-eqz v1, :cond_2

    .local v1, "it":Lkotlin/jvm/functions/Function2;
    const/4 v4, 0x0

    .line 312
    .local v4, "$i$a$-let-TabKt$TabBaselineLayout$2$1$textPlaceable$1":I
    nop

    .line 313
    move-object/from16 v5, p2

    .local v5, "$this$fastFirst$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 431
    .local v6, "$i$f$fastFirst":I
    nop

    .line 432
    move-object v7, v5

    .local v7, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 433
    .local v8, "$i$f$fastForEach":I
    nop

    .line 434
    const/4 v9, 0x0

    .local v9, "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_0
    if-ge v9, v10, :cond_1

    .line 435
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 436
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 432
    .local v13, "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/Measurable;

    .local v14, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v15, 0x0

    .line 313
    .local v15, "$i$a$-fastFirst-TabKt$TabBaselineLayout$2$1$textPlaceable$1$1":I
    invoke-static {v14}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v16, v1

    .end local v1    # "it":Lkotlin/jvm/functions/Function2;
    .local v16, "it":Lkotlin/jvm/functions/Function2;
    const-string/jumbo v1, "text"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 432
    .end local v14    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v15    # "$i$a$-fastFirst-TabKt$TabBaselineLayout$2$1$textPlaceable$1$1":I
    if-eqz v1, :cond_0

    .line 439
    .end local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastFirst":I
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    .end local v9    # "index$iv$iv":I
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v1, v12

    check-cast v1, Landroidx/compose/ui/layout/Measurable;

    .line 318
    const/16 v11, 0xb

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide/from16 v5, p3

    invoke-static/range {v5 .. v12}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v7

    .line 314
    invoke-interface {v1, v7, v8}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    .line 319
    nop

    .line 311
    .end local v4    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$textPlaceable$1":I
    .end local v16    # "it":Lkotlin/jvm/functions/Function2;
    goto :goto_1

    .line 436
    .restart local v4    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$textPlaceable$1":I
    .restart local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastFirst":I
    .restart local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v8    # "$i$f$fastForEach":I
    .restart local v9    # "index$iv$iv":I
    .restart local v11    # "item$iv$iv":Ljava/lang/Object;
    .restart local v16    # "it":Lkotlin/jvm/functions/Function2;
    :cond_0
    nop

    .line 434
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, v16

    goto :goto_0

    .end local v16    # "it":Lkotlin/jvm/functions/Function2;
    .restart local v1    # "it":Lkotlin/jvm/functions/Function2;
    :cond_1
    move-object/from16 v16, v1

    .line 438
    .end local v1    # "it":Lkotlin/jvm/functions/Function2;
    .end local v9    # "index$iv$iv":I
    .restart local v16    # "it":Lkotlin/jvm/functions/Function2;
    nop

    .line 439
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 311
    .end local v4    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$textPlaceable$1":I
    .end local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastFirst":I
    .end local v16    # "it":Lkotlin/jvm/functions/Function2;
    :cond_2
    const/4 v1, 0x0

    .line 310
    :goto_1
    move-object v4, v1

    .line 323
    .local v4, "textPlaceable":Landroidx/compose/ui/layout/Placeable;
    iget-object v1, v0, Landroidx/compose/material/TabKt$TabBaselineLayout$2$1;->$icon:Lkotlin/jvm/functions/Function2;

    if-eqz v1, :cond_5

    .line 440
    .restart local v1    # "it":Lkotlin/jvm/functions/Function2;
    const/4 v3, 0x0

    .line 323
    .local v3, "$i$a$-let-TabKt$TabBaselineLayout$2$1$iconPlaceable$1":I
    move-object/from16 v5, p2

    .restart local v5    # "$this$fastFirst$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 441
    .restart local v6    # "$i$f$fastFirst":I
    nop

    .line 442
    move-object v7, v5

    .restart local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v8, 0x0

    .line 443
    .restart local v8    # "$i$f$fastForEach":I
    nop

    .line 444
    const/4 v9, 0x0

    .restart local v9    # "index$iv$iv":I
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    :goto_2
    if-ge v9, v10, :cond_4

    .line 445
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 446
    .restart local v11    # "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .restart local v12    # "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 442
    .restart local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/ui/layout/Measurable;

    .restart local v14    # "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v15, 0x0

    .line 323
    .local v15, "$i$a$-fastFirst-TabKt$TabBaselineLayout$2$1$iconPlaceable$1$1":I
    invoke-static {v14}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v1

    .end local v1    # "it":Lkotlin/jvm/functions/Function2;
    .restart local v16    # "it":Lkotlin/jvm/functions/Function2;
    const-string/jumbo v1, "icon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 442
    .end local v14    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v15    # "$i$a$-fastFirst-TabKt$TabBaselineLayout$2$1$iconPlaceable$1$1":I
    if-eqz v0, :cond_3

    .line 449
    .end local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastFirst":I
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    .end local v9    # "index$iv$iv":I
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    move-object v0, v12

    check-cast v0, Landroidx/compose/ui/layout/Measurable;

    .line 323
    move-wide/from16 v14, p3

    invoke-interface {v0, v14, v15}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v0

    move-object v5, v0

    .end local v3    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$iconPlaceable$1":I
    .end local v16    # "it":Lkotlin/jvm/functions/Function2;
    goto :goto_3

    .line 442
    .restart local v3    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$iconPlaceable$1":I
    .restart local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastFirst":I
    .restart local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v8    # "$i$f$fastForEach":I
    .restart local v9    # "index$iv$iv":I
    .restart local v11    # "item$iv$iv":Ljava/lang/Object;
    .restart local v12    # "it$iv":Ljava/lang/Object;
    .restart local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    .restart local v16    # "it":Lkotlin/jvm/functions/Function2;
    :cond_3
    move-wide/from16 v14, p3

    .line 446
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-fastForEach-ListUtilsKt$fastFirst$2$iv":I
    nop

    .line 444
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    goto :goto_2

    .line 448
    .end local v9    # "index$iv$iv":I
    .end local v16    # "it":Lkotlin/jvm/functions/Function2;
    .restart local v1    # "it":Lkotlin/jvm/functions/Function2;
    :cond_4
    nop

    .line 449
    .end local v7    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v8    # "$i$f$fastForEach":I
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 323
    .end local v1    # "it":Lkotlin/jvm/functions/Function2;
    .end local v3    # "$i$a$-let-TabKt$TabBaselineLayout$2$1$iconPlaceable$1":I
    .end local v5    # "$this$fastFirst$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastFirst":I
    :cond_5
    move-wide/from16 v14, p3

    const/4 v5, 0x0

    .line 322
    :goto_3
    nop

    .line 325
    .local v5, "iconPlaceable":Landroidx/compose/ui/layout/Placeable;
    const/4 v0, 0x0

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v1

    goto :goto_4

    :cond_6
    move v1, v0

    :goto_4
    if-eqz v5, :cond_7

    invoke-virtual {v5}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v0

    :cond_7
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 333
    .local v7, "tabWidth":I
    nop

    .line 328
    if-eqz v4, :cond_8

    if-eqz v5, :cond_8

    .line 329
    invoke-static {}, Landroidx/compose/material/TabKt;->access$getLargeTabHeight$p()F

    move-result v0

    goto :goto_5

    .line 331
    :cond_8
    invoke-static {}, Landroidx/compose/material/TabKt;->access$getSmallTabHeight$p()F

    move-result v0

    .line 333
    :goto_5
    move-object/from16 v6, p1

    invoke-interface {v6, v0}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx-0680j_4(F)I

    move-result v8

    .line 327
    nop

    .line 335
    .local v8, "tabHeight":I
    if-eqz v4, :cond_9

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v4, v0}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v9, v0

    goto :goto_6

    :cond_9
    const/4 v9, 0x0

    .line 336
    .local v9, "firstBaseline":Ljava/lang/Integer;
    :goto_6
    if-eqz v4, :cond_a

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v4, v0}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object v10, v3

    goto :goto_7

    :cond_a
    const/4 v10, 0x0

    .line 338
    .local v10, "lastBaseline":Ljava/lang/Integer;
    :goto_7
    new-instance v3, Landroidx/compose/material/TabKt$TabBaselineLayout$2$1$1;

    invoke-direct/range {v3 .. v10}, Landroidx/compose/material/TabKt$TabBaselineLayout$2$1$1;-><init>(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;IILjava/lang/Integer;Ljava/lang/Integer;)V

    move-object v0, v9

    move-object v1, v10

    .end local v9    # "firstBaseline":Ljava/lang/Integer;
    .end local v10    # "lastBaseline":Ljava/lang/Integer;
    .local v0, "firstBaseline":Ljava/lang/Integer;
    .local v1, "lastBaseline":Ljava/lang/Integer;
    move-object v10, v3

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v2

    .line 354
    return-object v2
.end method
