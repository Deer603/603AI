.class final Landroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2;
.super Ljava/lang/Object;
.source "AlertDialog.kt"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/AlertDialogKt;->AlertDialogBaselineLayout(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n116#2,2:453\n33#2,6:455\n118#2:461\n116#2,2:462\n33#2,6:464\n118#2:470\n1#3:471\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2\n*L\n266#1:453,2\n266#1:455,6\n266#1:461\n270#1:462,2\n270#1:464,6\n270#1:470\n*E\n"
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


# static fields
.field public static final INSTANCE:Landroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2;

    invoke-direct {v0}, Landroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2;-><init>()V

    sput-object v0, Landroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2;->INSTANCE:Landroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2;

    return-void
.end method

.method constructor <init>()V
    .locals 0

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

    .line 267
    move-object/from16 v0, p1

    .line 265
    nop

    .line 266
    move-object/from16 v1, p2

    .local v1, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 453
    .local v2, "$i$f$fastFirstOrNull":I
    nop

    .line 454
    move-object v3, v1

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 455
    .local v4, "$i$f$fastForEach":I
    nop

    .line 456
    const/4 v5, 0x0

    .local v5, "index$iv$iv":I
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    :goto_0
    const/4 v7, 0x0

    if-ge v5, v6, :cond_1

    .line 457
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 458
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 454
    .local v10, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v11, v9

    check-cast v11, Landroidx/compose/ui/layout/Measurable;

    .local v11, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v12, 0x0

    .line 266
    .local v12, "$i$a$-fastFirstOrNull-AlertDialogKt$AlertDialogBaselineLayout$2$titlePlaceable$1":I
    invoke-static {v11}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v13

    const-string/jumbo v14, "title"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    .line 454
    .end local v11    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v12    # "$i$a$-fastFirstOrNull-AlertDialogKt$AlertDialogBaselineLayout$2$titlePlaceable$1":I
    if-eqz v11, :cond_0

    goto :goto_1

    .line 458
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 456
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 460
    .end local v5    # "index$iv$iv":I
    :cond_1
    nop

    .line 461
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    move-object v9, v7

    .line 266
    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastFirstOrNull":I
    :goto_1
    check-cast v9, Landroidx/compose/ui/layout/Measurable;

    .line 267
    if-eqz v9, :cond_2

    .line 266
    nop

    .line 267
    const/16 v16, 0xb

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-wide/from16 v10, p3

    invoke-static/range {v10 .. v17}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v1

    invoke-interface {v9, v1, v2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v7

    .line 264
    :goto_2
    move-object v8, v1

    .line 271
    .local v8, "titlePlaceable":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 269
    nop

    .line 270
    move-object/from16 v1, p2

    .restart local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 462
    .restart local v2    # "$i$f$fastFirstOrNull":I
    nop

    .line 463
    move-object v3, v1

    .restart local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 464
    .restart local v4    # "$i$f$fastForEach":I
    nop

    .line 465
    const/4 v5, 0x0

    .restart local v5    # "index$iv$iv":I
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    :goto_3
    if-ge v5, v6, :cond_4

    .line 466
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 467
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 463
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v12, v10

    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    .local v12, "it":Landroidx/compose/ui/layout/Measurable;
    const/4 v13, 0x0

    .line 270
    .local v13, "$i$a$-fastFirstOrNull-AlertDialogKt$AlertDialogBaselineLayout$2$textPlaceable$1":I
    invoke-static {v12}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    move-result-object v14

    const-string/jumbo v15, "text"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    .line 463
    .end local v12    # "it":Landroidx/compose/ui/layout/Measurable;
    .end local v13    # "$i$a$-fastFirstOrNull-AlertDialogKt$AlertDialogBaselineLayout$2$textPlaceable$1":I
    if-eqz v12, :cond_3

    goto :goto_4

    .line 467
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_3
    nop

    .line 465
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 469
    .end local v5    # "index$iv$iv":I
    :cond_4
    nop

    .line 470
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    move-object v10, v7

    .line 270
    .end local v1    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastFirstOrNull":I
    :goto_4
    move-object v1, v10

    check-cast v1, Landroidx/compose/ui/layout/Measurable;

    .line 271
    if-eqz v1, :cond_5

    .line 270
    nop

    .line 271
    const/16 v16, 0xb

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-wide/from16 v10, p3

    invoke-static/range {v10 .. v17}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    move-result-object v1

    goto :goto_5

    :cond_5
    move-object v1, v7

    .line 268
    :goto_5
    move-object v9, v1

    .line 273
    .local v9, "textPlaceable":Landroidx/compose/ui/layout/Placeable;
    const/4 v1, 0x0

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v2

    goto :goto_6

    :cond_6
    move v2, v1

    :goto_6
    if-eqz v9, :cond_7

    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v3

    goto :goto_7

    :cond_7
    move v3, v1

    :goto_7
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 276
    .local v2, "layoutWidth":I
    const/high16 v3, -0x80000000

    if-eqz v8, :cond_9

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v8, v4}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .local v4, "baseline":I
    const/4 v5, 0x0

    .line 277
    .local v5, "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$firstTitleBaseline$1":I
    if-ne v4, v3, :cond_8

    move-object v6, v7

    goto :goto_8

    :cond_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 276
    .end local v4    # "baseline":I
    .end local v5    # "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$firstTitleBaseline$1":I
    :goto_8
    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_9

    .line 278
    :cond_9
    move v4, v1

    .line 276
    :goto_9
    nop

    .line 275
    move v10, v4

    .line 280
    .local v10, "firstTitleBaseline":I
    if-eqz v8, :cond_b

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getLastBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v8, v4}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v4

    .restart local v4    # "baseline":I
    const/4 v5, 0x0

    .line 281
    .local v5, "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$lastTitleBaseline$1":I
    if-ne v4, v3, :cond_a

    move-object v6, v7

    goto :goto_a

    :cond_a
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 280
    .end local v4    # "baseline":I
    .end local v5    # "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$lastTitleBaseline$1":I
    :goto_a
    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_b

    .line 282
    :cond_b
    move v4, v1

    .line 280
    :goto_b
    nop

    .line 279
    move v11, v4

    .line 284
    .local v11, "lastTitleBaseline":I
    invoke-static {}, Landroidx/compose/material/AlertDialogKt;->access$getTitleBaselineDistanceFromTop$p()J

    move-result-wide v4

    invoke-interface {v0, v4, v5}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx--R2X_6o(J)I

    move-result v12

    .line 287
    .local v12, "titleOffset":I
    sub-int v13, v12, v10

    .line 290
    .local v13, "titlePositionY":I
    if-eqz v9, :cond_d

    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/layout/AlignmentLine;

    invoke-virtual {v9, v4}, Landroidx/compose/ui/layout/Placeable;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v4

    .restart local v4    # "baseline":I
    const/4 v5, 0x0

    .line 291
    .local v5, "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$firstTextBaseline$1":I
    if-ne v4, v3, :cond_c

    goto :goto_c

    :cond_c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 290
    .end local v4    # "baseline":I
    .end local v5    # "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$firstTextBaseline$1":I
    :goto_c
    if-eqz v7, :cond_d

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_d

    .line 292
    :cond_d
    move v3, v1

    .line 290
    :goto_d
    nop

    .line 289
    move v7, v3

    .line 295
    .local v7, "firstTextBaseline":I
    if-nez v8, :cond_e

    .line 296
    invoke-static {}, Landroidx/compose/material/AlertDialogKt;->access$getTextBaselineDistanceFromTop$p()J

    move-result-wide v3

    invoke-interface {v0, v3, v4}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx--R2X_6o(J)I

    move-result v3

    goto :goto_e

    .line 298
    :cond_e
    invoke-static {}, Landroidx/compose/material/AlertDialogKt;->access$getTextBaselineDistanceFromTitle$p()J

    move-result-wide v3

    invoke-interface {v0, v3, v4}, Landroidx/compose/ui/layout/MeasureScope;->roundToPx--R2X_6o(J)I

    move-result v3

    .line 295
    :goto_e
    nop

    .line 294
    move v14, v3

    .line 302
    .local v14, "textOffset":I
    if-eqz v8, :cond_f

    move-object v3, v8

    .line 471
    .local v3, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v4, 0x0

    .line 302
    .local v4, "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$titleHeightWithSpacing$1":I
    invoke-virtual {v3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v5

    add-int/2addr v5, v13

    .end local v3    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v4    # "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$titleHeightWithSpacing$1":I
    goto :goto_f

    :cond_f
    move v5, v1

    :goto_f
    move v15, v5

    .line 307
    .local v15, "titleHeightWithSpacing":I
    if-nez v8, :cond_10

    .line 309
    sub-int v3, v14, v7

    goto :goto_10

    .line 311
    :cond_10
    if-nez v11, :cond_11

    .line 315
    sub-int v3, v15, v7

    add-int/2addr v3, v14

    goto :goto_10

    .line 318
    :cond_11
    add-int v3, v13, v11

    sub-int/2addr v3, v7

    add-int/2addr v3, v14

    .line 307
    :goto_10
    nop

    .line 306
    nop

    .line 324
    .local v3, "textPositionY":I
    if-eqz v9, :cond_14

    move-object v4, v9

    .local v4, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v5, 0x0

    .line 325
    .local v5, "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$textHeightWithSpacing$1":I
    if-nez v11, :cond_12

    .line 326
    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v1

    add-int/2addr v1, v14

    sub-int/2addr v1, v7

    goto :goto_11

    .line 328
    :cond_12
    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v6

    add-int/2addr v6, v14

    .line 329
    nop

    .line 328
    sub-int/2addr v6, v7

    .line 330
    if-eqz v8, :cond_13

    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v1

    :cond_13
    sub-int/2addr v1, v11

    .line 328
    sub-int/2addr v6, v1

    move v1, v6

    .line 331
    :goto_11
    nop

    .line 324
    .end local v4    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v5    # "$i$a$-let-AlertDialogKt$AlertDialogBaselineLayout$2$textHeightWithSpacing$1":I
    goto :goto_12

    .line 332
    :cond_14
    nop

    .line 324
    :goto_12
    nop

    .line 323
    move/from16 v16, v1

    .line 334
    .local v16, "textHeightWithSpacing":I
    move v1, v2

    .end local v2    # "layoutWidth":I
    .local v1, "layoutWidth":I
    add-int v2, v15, v16

    .line 336
    .local v2, "layoutHeight":I
    new-instance v4, Landroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2$1;

    invoke-direct {v4, v8, v13, v9, v3}, Landroidx/compose/material/AlertDialogKt$AlertDialogBaselineLayout$2$1;-><init>(Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;I)V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x4

    const/4 v6, 0x0

    move/from16 v17, v3

    .end local v3    # "textPositionY":I
    .local v17, "textPositionY":I
    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v3

    .line 339
    return-object v3
.end method
