.class public final Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion$StickToTopPlacement$1;
.super Ljava/lang/Object;
.source "LazyLayoutStickyItems.kt"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyLayoutStickyItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion$StickToTopPlacement$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,220:1\n117#2,2:221\n34#2,6:223\n119#2:229\n155#3,4:230\n155#3,4:234\n155#3,4:239\n363#4:238\n74#4:243\n*S KotlinDebug\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion$StickToTopPlacement$1\n*L\n89#1:221,2\n89#1:223,6\n89#1:229\n92#1:230,4\n108#1:234,4\n127#1:239,4\n121#1:238\n133#1:243\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH\u0016\u00a8\u0006\u0013"
    }
    d2 = {
        "androidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion$StickToTopPlacement$1",
        "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
        "calculateStickingItemOffset",
        "",
        "visibleStickyItems",
        "",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;",
        "itemIndex",
        "itemSize",
        "itemOffset",
        "beforeContentPadding",
        "afterContentPadding",
        "layoutWidth",
        "layoutHeight",
        "getStickingIndices",
        "Landroidx/collection/IntList;",
        "firstVisibleItemIndex",
        "lastVisibleItemIndex",
        "stickyItems",
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


# direct methods
.method constructor <init>()V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public calculateStickingItemOffset(Ljava/util/List;IIIIIII)I
    .locals 15
    .param p1, "visibleStickyItems"    # Ljava/util/List;
    .param p2, "itemIndex"    # I
    .param p3, "itemSize"    # I
    .param p4, "itemOffset"    # I
    .param p5, "beforeContentPadding"    # I
    .param p6, "afterContentPadding"    # I
    .param p7, "layoutWidth"    # I
    .param p8, "layoutHeight"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;",
            ">;IIIIIII)I"
        }
    .end annotation

    .line 89
    move/from16 v0, p4

    move/from16 v1, p5

    move-object/from16 v2, p1

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 221
    .local v3, "$i$f$fastFirstOrNull":I
    nop

    .line 222
    move-object v4, v2

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 223
    .local v5, "$i$f$fastForEach":I
    nop

    .line 224
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_2

    .line 225
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 226
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 222
    .local v10, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v11, v9

    check-cast v11, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .local v11, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/4 v12, 0x0

    .line 89
    .local v12, "$i$a$-fastFirstOrNull-StickyItemsPlacement$Companion$StickToTopPlacement$1$calculateStickingItemOffset$nextStickyItemOffset$1":I
    invoke-interface {v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getIndex()I

    move-result v13

    move/from16 v14, p2

    if-eq v13, v14, :cond_0

    const/4 v13, 0x1

    goto :goto_1

    :cond_0
    const/4 v13, 0x0

    .line 222
    .end local v11    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v12    # "$i$a$-fastFirstOrNull-StickyItemsPlacement$Companion$StickToTopPlacement$1$calculateStickingItemOffset$nextStickyItemOffset$1":I
    :goto_1
    if-eqz v13, :cond_1

    goto :goto_2

    .line 226
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_1
    nop

    .line 224
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    move/from16 v14, p2

    .line 228
    .end local v6    # "index$iv$iv":I
    nop

    .line 229
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    const/4 v9, 0x0

    .line 89
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastFirstOrNull":I
    :goto_2
    check-cast v9, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    const/high16 v2, -0x80000000

    if-eqz v9, :cond_3

    invoke-static {v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt;->access$getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v3

    goto :goto_3

    .line 90
    :cond_3
    move v3, v2

    .line 89
    :goto_3
    nop

    .line 88
    nop

    .line 92
    .local v3, "nextStickyItemOffset":I
    const/4 v4, 0x0

    .line 230
    .local v4, "$i$f$debugLog":I
    nop

    .line 233
    nop

    .line 94
    .end local v4    # "$i$f$debugLog":I
    const/4 v4, 0x0

    .line 95
    .local v4, "updatedItemOffset":I
    if-ne v0, v2, :cond_4

    .line 96
    neg-int v5, v1

    goto :goto_4

    .line 98
    :cond_4
    neg-int v5, v1

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 94
    :goto_4
    nop

    .line 103
    .end local v4    # "updatedItemOffset":I
    .local v5, "updatedItemOffset":I
    if-eq v3, v2, :cond_5

    .line 104
    nop

    .line 105
    sub-int v2, v3, p3

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 104
    move v5, v2

    .line 108
    :cond_5
    const/4 v2, 0x0

    .line 234
    .local v2, "$i$f$debugLog":I
    nop

    .line 237
    nop

    .line 112
    .end local v2    # "$i$f$debugLog":I
    return v5
.end method

.method public getStickingIndices(IILandroidx/collection/IntList;)Landroidx/collection/IntList;
    .locals 6
    .param p1, "firstVisibleItemIndex"    # I
    .param p2, "lastVisibleItemIndex"    # I
    .param p3, "stickyItems"    # Landroidx/collection/IntList;

    .line 121
    sub-int v0, p2, p1

    if-ltz v0, :cond_5

    move-object v0, p3

    .local v0, "this_$iv":Landroidx/collection/IntList;
    const/4 v1, 0x0

    .line 238
    .local v1, "$i$f$isEmpty":I
    iget v2, v0, Landroidx/collection/IntList;->_size:I

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    .line 121
    .end local v0    # "this_$iv":Landroidx/collection/IntList;
    .end local v1    # "$i$f$isEmpty":I
    :goto_0
    if-eqz v2, :cond_1

    goto :goto_3

    .line 125
    :cond_1
    move v0, p1

    .line 127
    .local v0, "firstVisible":I
    const/4 v1, 0x0

    .line 239
    .local v1, "$i$f$debugLog":I
    nop

    .line 242
    nop

    .line 129
    .end local v1    # "$i$f$debugLog":I
    const/4 v1, -0x1

    .line 133
    .local v1, "currentHeaderIndex":I
    move-object v2, p3

    .local v2, "this_$iv":Landroidx/collection/IntList;
    const/4 v4, 0x0

    .line 243
    .local v4, "$i$f$getIndices":I
    iget v5, v2, Landroidx/collection/IntList;->_size:I

    invoke-static {v3, v5}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v2

    .line 133
    .end local v2    # "this_$iv":Landroidx/collection/IntList;
    .end local v4    # "$i$f$getIndices":I
    invoke-virtual {v2}, Lkotlin/ranges/IntRange;->getFirst()I

    move-result v3

    .local v3, "index":I
    invoke-virtual {v2}, Lkotlin/ranges/IntRange;->getLast()I

    move-result v2

    if-gt v3, v2, :cond_3

    .line 134
    :goto_1
    invoke-virtual {p3, v3}, Landroidx/collection/IntList;->get(I)I

    move-result v4

    if-gt v4, v0, :cond_2

    .line 135
    invoke-virtual {p3, v3}, Landroidx/collection/IntList;->get(I)I

    move-result v1

    .line 133
    if-eq v3, v2, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 137
    :cond_2
    nop

    .line 141
    .end local v3    # "index":I
    :cond_3
    const/4 v2, -0x1

    if-ne v1, v2, :cond_4

    .line 143
    invoke-static {}, Landroidx/collection/IntListKt;->emptyIntList()Landroidx/collection/IntList;

    move-result-object v2

    goto :goto_2

    .line 145
    :cond_4
    invoke-static {v1}, Landroidx/collection/IntListKt;->intListOf(I)Landroidx/collection/IntList;

    move-result-object v2

    .line 141
    :goto_2
    return-object v2

    .line 122
    .end local v0    # "firstVisible":I
    .end local v1    # "currentHeaderIndex":I
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/collection/IntListKt;->emptyIntList()Landroidx/collection/IntList;

    move-result-object v0

    return-object v0
.end method
