.class final Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BottomSheetScaffold.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,410:1\n317#2,8:411\n317#2,8:419\n317#2,8:427\n33#2,6:435\n33#2,6:441\n33#2,6:447\n33#2,6:453\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1\n*L\n389#1:411,8\n392#1:419,8\n393#1:427,8\n403#1:435,6\n404#1:441,6\n405#1:447,6\n406#1:453,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "invoke"
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
.field final synthetic $bodyPlaceables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $layoutHeight:I

.field final synthetic $layoutWidth:I

.field final synthetic $sheetOffset:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sheetPlaceables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sheetState:Landroidx/compose/material3/SheetState;

.field final synthetic $snackbarPlaceables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $topBarHeight:I

.field final synthetic $topBarPlaceables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;ILjava/util/List;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;ILjava/util/List;Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;I",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;",
            "Landroidx/compose/material3/SheetState;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Float;",
            ">;I",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$sheetPlaceables:Ljava/util/List;

    iput p2, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$layoutWidth:I

    iput-object p3, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$snackbarPlaceables:Ljava/util/List;

    iput-object p4, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$sheetState:Landroidx/compose/material3/SheetState;

    iput-object p5, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$sheetOffset:Lkotlin/jvm/functions/Function0;

    iput p6, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$layoutHeight:I

    iput-object p7, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$bodyPlaceables:Ljava/util/List;

    iput-object p8, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$topBarPlaceables:Ljava/util/List;

    iput p9, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$topBarHeight:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 388
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, v0}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 27
    .param p1, "$this$layout"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 389
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$sheetPlaceables:Ljava/util/List;

    .local v1, "$this$fastMaxOfOrNull$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 411
    .local v2, "$i$f$fastMaxOfOrNull":I
    nop

    .line 412
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    move-object v3, v4

    goto :goto_1

    .line 413
    :cond_0
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/layout/Placeable;

    .local v3, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v6, 0x0

    .line 389
    .local v6, "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$sheetWidth$1":I
    invoke-virtual {v3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v3

    .end local v3    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v6    # "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$sheetWidth$1":I
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 413
    check-cast v3, Ljava/lang/Comparable;

    .line 414
    .local v3, "maxValue$iv":Ljava/lang/Comparable;
    const/4 v6, 0x1

    .local v6, "i$iv":I
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v7

    if-gt v6, v7, :cond_2

    .line 415
    :goto_0
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/layout/Placeable;

    .local v8, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v9, 0x0

    .line 389
    .local v9, "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$sheetWidth$1":I
    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v8

    .end local v8    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$sheetWidth$1":I
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 415
    check-cast v8, Ljava/lang/Comparable;

    .line 416
    .local v8, "v$iv":Ljava/lang/Comparable;
    invoke-interface {v8, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v9

    if-lez v9, :cond_1

    move-object v3, v8

    .line 414
    .end local v8    # "v$iv":Ljava/lang/Comparable;
    :cond_1
    if-eq v6, v7, :cond_2

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 418
    .end local v6    # "i$iv":I
    :cond_2
    nop

    .line 389
    .end local v1    # "$this$fastMaxOfOrNull$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastMaxOfOrNull":I
    .end local v3    # "maxValue$iv":Ljava/lang/Comparable;
    :goto_1
    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_2

    :cond_3
    move v1, v5

    .line 390
    .local v1, "sheetWidth":I
    :goto_2
    iget v2, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$layoutWidth:I

    sub-int/2addr v2, v1

    div-int/lit8 v2, v2, 0x2

    invoke-static {v5, v2}, Ljava/lang/Integer;->max(II)I

    move-result v8

    .line 392
    .local v8, "sheetOffsetX":I
    iget-object v2, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$snackbarPlaceables:Ljava/util/List;

    .local v2, "$this$fastMaxOfOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 419
    .local v3, "$i$f$fastMaxOfOrNull":I
    nop

    .line 420
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v6, v4

    goto :goto_4

    .line 421
    :cond_4
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/layout/Placeable;

    .local v6, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v7, 0x0

    .line 392
    .local v7, "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$snackbarWidth$1":I
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v6

    .end local v6    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v7    # "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$snackbarWidth$1":I
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 421
    check-cast v6, Ljava/lang/Comparable;

    .line 422
    .local v6, "maxValue$iv":Ljava/lang/Comparable;
    const/4 v7, 0x1

    .local v7, "i$iv":I
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v9

    if-gt v7, v9, :cond_6

    .line 423
    :goto_3
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/ui/layout/Placeable;

    .local v10, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v11, 0x0

    .line 392
    .local v11, "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$snackbarWidth$1":I
    invoke-virtual {v10}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v10

    .end local v10    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v11    # "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$snackbarWidth$1":I
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 423
    check-cast v10, Ljava/lang/Comparable;

    .line 424
    .local v10, "v$iv":Ljava/lang/Comparable;
    invoke-interface {v10, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v11

    if-lez v11, :cond_5

    move-object v6, v10

    .line 422
    .end local v10    # "v$iv":Ljava/lang/Comparable;
    :cond_5
    if-eq v7, v9, :cond_6

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 426
    .end local v7    # "i$iv":I
    :cond_6
    nop

    .line 392
    .end local v2    # "$this$fastMaxOfOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastMaxOfOrNull":I
    .end local v6    # "maxValue$iv":Ljava/lang/Comparable;
    :goto_4
    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_5

    :cond_7
    move v2, v5

    .line 393
    .local v2, "snackbarWidth":I
    :goto_5
    iget-object v3, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$snackbarPlaceables:Ljava/util/List;

    .local v3, "$this$fastMaxOfOrNull$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 427
    .local v6, "$i$f$fastMaxOfOrNull":I
    nop

    .line 428
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_7

    .line 429
    :cond_8
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/layout/Placeable;

    .local v4, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v7, 0x0

    .line 393
    .local v7, "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$snackbarHeight$1":I
    invoke-virtual {v4}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v4

    .end local v4    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v7    # "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$snackbarHeight$1":I
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 429
    check-cast v4, Ljava/lang/Comparable;

    .line 430
    .local v4, "maxValue$iv":Ljava/lang/Comparable;
    const/4 v7, 0x1

    .local v7, "i$iv":I
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v9

    if-gt v7, v9, :cond_a

    .line 431
    :goto_6
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/ui/layout/Placeable;

    .local v10, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v11, 0x0

    .line 393
    .local v11, "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$snackbarHeight$1":I
    invoke-virtual {v10}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v10

    .end local v10    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v11    # "$i$a$-fastMaxOfOrNull-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$snackbarHeight$1":I
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 431
    check-cast v10, Ljava/lang/Comparable;

    .line 432
    .local v10, "v$iv":Ljava/lang/Comparable;
    invoke-interface {v10, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v11

    if-lez v11, :cond_9

    move-object v4, v10

    .line 430
    .end local v10    # "v$iv":Ljava/lang/Comparable;
    :cond_9
    if-eq v7, v9, :cond_a

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    .line 434
    .end local v7    # "i$iv":I
    :cond_a
    nop

    .line 393
    .end local v3    # "$this$fastMaxOfOrNull$iv":Ljava/util/List;
    .end local v4    # "maxValue$iv":Ljava/lang/Comparable;
    .end local v6    # "$i$f$fastMaxOfOrNull":I
    :goto_7
    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 394
    .local v5, "snackbarHeight":I
    :cond_b
    iget v3, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$layoutWidth:I

    sub-int/2addr v3, v2

    div-int/lit8 v3, v3, 0x2

    .line 396
    .local v3, "snackbarOffsetX":I
    iget-object v4, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$sheetState:Landroidx/compose/material3/SheetState;

    invoke-virtual {v4}, Landroidx/compose/material3/SheetState;->getCurrentValue()Landroidx/compose/material3/SheetValue;

    move-result-object v4

    sget-object v6, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Landroidx/compose/material3/SheetValue;->ordinal()I

    move-result v4

    aget v4, v6, v4

    packed-switch v4, :pswitch_data_0

    .line 399
    move v11, v3

    .end local v3    # "snackbarOffsetX":I
    .local v11, "snackbarOffsetX":I
    new-instance v3, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v3}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v3

    .end local v11    # "snackbarOffsetX":I
    .restart local v3    # "snackbarOffsetX":I
    :pswitch_0
    iget v4, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$layoutHeight:I

    sub-int/2addr v4, v5

    move v12, v4

    goto :goto_8

    .line 397
    :pswitch_1
    iget-object v4, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$sheetOffset:Lkotlin/jvm/functions/Function0;

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    sub-int/2addr v4, v5

    move v12, v4

    .line 396
    :goto_8
    nop

    .line 395
    move v4, v12

    .line 403
    .local v4, "snackbarOffsetY":I
    iget-object v6, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$bodyPlaceables:Ljava/util/List;

    .local v6, "$this$fastForEach$iv":Ljava/util/List;
    iget v12, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$topBarHeight:I

    const/4 v7, 0x0

    .line 435
    .local v7, "$i$f$fastForEach":I
    nop

    .line 436
    const/4 v9, 0x0

    .local v9, "index$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    :goto_9
    if-ge v9, v10, :cond_c

    .line 437
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 438
    .local v16, "item$iv":Ljava/lang/Object;
    move v11, v10

    move-object/from16 v10, v16

    check-cast v10, Landroidx/compose/ui/layout/Placeable;

    .local v10, "it":Landroidx/compose/ui/layout/Placeable;
    const/16 v17, 0x0

    .line 403
    .local v17, "$i$a$-fastForEach-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$1":I
    const/4 v14, 0x4

    const/4 v15, 0x0

    move v13, v11

    const/4 v11, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v9

    move-object/from16 v9, p1

    .end local v9    # "index$iv":I
    .local v19, "index$iv":I
    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 438
    .end local v10    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v17    # "$i$a$-fastForEach-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$1":I
    nop

    .line 436
    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v9, v19, 0x1

    move/from16 v10, v18

    .end local v19    # "index$iv":I
    .restart local v9    # "index$iv":I
    goto :goto_9

    :cond_c
    move/from16 v19, v9

    .line 440
    .end local v9    # "index$iv":I
    nop

    .line 404
    .end local v6    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    iget-object v6, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$topBarPlaceables:Ljava/util/List;

    .restart local v6    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 441
    .restart local v7    # "$i$f$fastForEach":I
    nop

    .line 442
    const/4 v9, 0x0

    .restart local v9    # "index$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    :goto_a
    if-ge v9, v10, :cond_d

    .line 443
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 444
    .local v11, "item$iv":Ljava/lang/Object;
    move-object/from16 v21, v11

    check-cast v21, Landroidx/compose/ui/layout/Placeable;

    .local v21, "it":Landroidx/compose/ui/layout/Placeable;
    const/4 v12, 0x0

    .line 404
    .local v12, "$i$a$-fastForEach-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$2":I
    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, p1

    invoke-static/range {v20 .. v26}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 444
    .end local v12    # "$i$a$-fastForEach-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$2":I
    .end local v21    # "it":Landroidx/compose/ui/layout/Placeable;
    nop

    .line 442
    .end local v11    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    .line 446
    .end local v9    # "index$iv":I
    :cond_d
    nop

    .line 405
    .end local v6    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    iget-object v13, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$sheetPlaceables:Ljava/util/List;

    .local v13, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v14, 0x0

    .line 447
    .local v14, "$i$f$fastForEach":I
    nop

    .line 448
    const/4 v6, 0x0

    .local v6, "index$iv":I
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v15

    :goto_b
    if-ge v6, v15, :cond_e

    .line 449
    invoke-interface {v13, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 450
    .restart local v16    # "item$iv":Ljava/lang/Object;
    move-object/from16 v7, v16

    check-cast v7, Landroidx/compose/ui/layout/Placeable;

    .local v7, "it":Landroidx/compose/ui/layout/Placeable;
    const/16 v17, 0x0

    .line 405
    .local v17, "$i$a$-fastForEach-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$3":I
    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v18, v6

    move-object/from16 v6, p1

    .end local v6    # "index$iv":I
    .local v18, "index$iv":I
    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 450
    .end local v7    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v17    # "$i$a$-fastForEach-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$3":I
    nop

    .line 448
    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v6, v18, 0x1

    .end local v18    # "index$iv":I
    .restart local v6    # "index$iv":I
    goto :goto_b

    :cond_e
    move/from16 v18, v6

    .line 452
    .end local v6    # "index$iv":I
    nop

    .line 406
    .end local v13    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v14    # "$i$f$fastForEach":I
    iget-object v6, v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1;->$snackbarPlaceables:Ljava/util/List;

    .local v6, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 453
    .local v7, "$i$f$fastForEach":I
    nop

    .line 454
    const/4 v9, 0x0

    .restart local v9    # "index$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    :goto_c
    if-ge v9, v10, :cond_f

    .line 455
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 456
    .restart local v16    # "item$iv":Ljava/lang/Object;
    move v11, v10

    move-object/from16 v10, v16

    check-cast v10, Landroidx/compose/ui/layout/Placeable;

    .restart local v10    # "it":Landroidx/compose/ui/layout/Placeable;
    const/16 v17, 0x0

    .line 406
    .local v17, "$i$a$-fastForEach-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$4":I
    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move v12, v11

    move v11, v3

    move v3, v12

    move v12, v4

    move v4, v9

    move-object/from16 v9, p1

    .end local v3    # "snackbarOffsetX":I
    .end local v9    # "index$iv":I
    .local v4, "index$iv":I
    .local v11, "snackbarOffsetX":I
    .local v12, "snackbarOffsetY":I
    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 456
    .end local v10    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v17    # "$i$a$-fastForEach-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$4":I
    nop

    .line 454
    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v9, v4, 0x1

    move v10, v3

    move v3, v11

    move v4, v12

    .end local v4    # "index$iv":I
    .restart local v9    # "index$iv":I
    goto :goto_c

    .line 458
    .end local v9    # "index$iv":I
    .end local v11    # "snackbarOffsetX":I
    .end local v12    # "snackbarOffsetY":I
    .restart local v3    # "snackbarOffsetX":I
    .local v4, "snackbarOffsetY":I
    :cond_f
    nop

    .line 407
    .end local v6    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
