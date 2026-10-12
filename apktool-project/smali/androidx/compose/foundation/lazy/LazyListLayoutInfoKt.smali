.class public final Landroidx/compose/foundation/lazy/LazyListLayoutInfoKt;
.super Ljava/lang/Object;
.source "LazyListLayoutInfo.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyListLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n133#2,3:96\n34#2,6:99\n136#2:105\n*S KotlinDebug\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n*L\n92#1:96,3\n92#1:99,6\n92#1:105\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "visibleItemsAverageSize",
        "",
        "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
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


# direct methods
.method public static final visibleItemsAverageSize(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I
    .locals 13
    .param p0, "$this$visibleItemsAverageSize"    # Landroidx/compose/foundation/lazy/LazyListLayoutInfo;

    .line 91
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    move-result-object v0

    .line 92
    .local v0, "visibleItems":Ljava/util/List;
    move-object v1, v0

    .local v1, "$this$fastSumBy$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 96
    .local v2, "$i$f$fastSumBy":I
    nop

    .line 97
    const/4 v3, 0x0

    .line 98
    .local v3, "sum$iv":I
    move-object v4, v1

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 99
    .local v5, "$i$f$fastForEach":I
    nop

    .line 100
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_0

    .line 101
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 102
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "element$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 98
    .local v10, "$i$a$-fastForEach-ListUtilsKt$fastSumBy$2$iv":I
    move-object v11, v9

    check-cast v11, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .local v11, "it":Landroidx/compose/foundation/lazy/LazyListItemInfo;
    const/4 v12, 0x0

    .line 92
    .local v12, "$i$a$-fastSumBy-LazyListLayoutInfoKt$visibleItemsAverageSize$itemsSum$1":I
    invoke-interface {v11}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getSize()I

    move-result v11

    .line 98
    .end local v11    # "it":Landroidx/compose/foundation/lazy/LazyListItemInfo;
    .end local v12    # "$i$a$-fastSumBy-LazyListLayoutInfoKt$visibleItemsAverageSize$itemsSum$1":I
    add-int/2addr v3, v11

    .line 102
    .end local v9    # "element$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-fastForEach-ListUtilsKt$fastSumBy$2$iv":I
    nop

    .line 100
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 104
    .end local v6    # "index$iv$iv":I
    :cond_0
    nop

    .line 105
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    nop

    .line 92
    .end local v1    # "$this$fastSumBy$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastSumBy":I
    .end local v3    # "sum$iv":I
    nop

    .line 93
    .local v3, "itemsSum":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    div-int v1, v3, v1

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getMainAxisItemSpacing()I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method
