.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt;
.super Ljava/lang/Object;
.source "LazyLayoutStickyItems.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyLayoutStickyItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1#2:221\n366#3:222\n237#3,4:233\n242#3:244\n230#4,3:223\n34#4,6:226\n233#4:232\n350#5,7:237\n*S KotlinDebug\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n*L\n178#1:222\n191#1:233,4\n191#1:244\n188#1:223,3\n188#1:226,6\n188#1:232\n192#1:237,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0082\u0008\u001ah\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u0002H\u000e0\r\"\u0008\u0008\u0000\u0010\u000e*\u00020\u0004*\u0004\u0018\u00010\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u000e0\u0019H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u001a"
    }
    d2 = {
        "Debug",
        "",
        "mainAxisOffset",
        "",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;",
        "getMainAxisOffset",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I",
        "debugLog",
        "",
        "generateMsg",
        "Lkotlin/Function0;",
        "",
        "applyStickyItems",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
        "positionedItems",
        "",
        "stickyItems",
        "Landroidx/collection/IntList;",
        "beforeContentPadding",
        "afterContentPadding",
        "layoutWidth",
        "layoutHeight",
        "getAndMeasure",
        "Lkotlin/Function1;",
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


# static fields
.field private static final Debug:Z = false


# direct methods
.method public static final synthetic access$getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt;->getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v0

    return v0
.end method

.method public static final applyStickyItems(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Ljava/util/List;Landroidx/collection/IntList;IIIILkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 21
    .param p0, "$this$applyStickyItems"    # Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;
    .param p1, "positionedItems"    # Ljava/util/List;
    .param p2, "stickyItems"    # Landroidx/collection/IntList;
    .param p3, "beforeContentPadding"    # I
    .param p4, "afterContentPadding"    # I
    .param p5, "layoutWidth"    # I
    .param p6, "layoutHeight"    # I
    .param p7, "getAndMeasure"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;",
            ">(",
            "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
            "Ljava/util/List<",
            "TT;>;",
            "Landroidx/collection/IntList;",
            "IIII",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "+TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 178
    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    if-eqz v0, :cond_9

    move-object v1, v9

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    move-object/from16 v1, p2

    .local v1, "this_$iv":Landroidx/collection/IntList;
    const/4 v2, 0x0

    .line 222
    .local v2, "$i$f$isNotEmpty":I
    iget v3, v1, Landroidx/collection/IntList;->_size:I

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 178
    .end local v1    # "this_$iv":Landroidx/collection/IntList;
    .end local v2    # "$i$f$isNotEmpty":I
    :goto_0
    if-eqz v1, :cond_9

    .line 181
    nop

    .line 182
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getIndex()I

    move-result v1

    .line 183
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    invoke-interface {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getIndex()I

    move-result v2

    .line 184
    nop

    .line 181
    invoke-interface {v0, v1, v2, v10}, Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;->getStickingIndices(IILandroidx/collection/IntList;)Landroidx/collection/IntList;

    move-result-object v1

    .line 180
    move-object v13, v1

    .line 187
    .local v13, "stickingItems":Landroidx/collection/IntList;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v14, v1

    check-cast v14, Ljava/util/List;

    .line 188
    .local v14, "positionedStickingItems":Ljava/util/List;
    move-object/from16 v1, p1

    .local v1, "$this$fastFilter$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 223
    .local v2, "$i$f$fastFilter":I
    nop

    .line 224
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 225
    .local v3, "target$iv":Ljava/util/ArrayList;
    move-object v4, v1

    .local v4, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 226
    .local v5, "$i$f$fastForEach":I
    nop

    .line 227
    const/4 v6, 0x0

    .local v6, "index$iv$iv":I
    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_1
    if-ge v6, v7, :cond_2

    .line 228
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 229
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v8

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 225
    .local v16, "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    move-object/from16 v17, v15

    check-cast v17, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .local v17, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/16 v18, 0x0

    .line 188
    .local v18, "$i$a$-fastFilter-LazyLayoutStickyItemsKt$applyStickyItems$visibleStickyItems$1":I
    invoke-interface/range {v17 .. v17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getIndex()I

    move-result v11

    invoke-virtual {v10, v11}, Landroidx/collection/IntList;->contains(I)Z

    move-result v11

    .line 225
    .end local v17    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v18    # "$i$a$-fastFilter-LazyLayoutStickyItemsKt$applyStickyItems$visibleStickyItems$1":I
    if-eqz v11, :cond_1

    move-object v11, v3

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 229
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv":I
    :cond_1
    nop

    .line 227
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 231
    .end local v6    # "index$iv$iv":I
    :cond_2
    nop

    .line 232
    .end local v4    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    move-object v1, v3

    check-cast v1, Ljava/util/List;

    .line 188
    .end local v1    # "$this$fastFilter$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastFilter":I
    .end local v3    # "target$iv":Ljava/util/ArrayList;
    nop

    .line 191
    .local v1, "visibleStickyItems":Ljava/util/List;
    move-object v11, v13

    .local v11, "this_$iv":Landroidx/collection/IntList;
    const/4 v15, 0x0

    .line 233
    .local v15, "$i$f$forEach":I
    nop

    .line 234
    iget-object v2, v11, Landroidx/collection/IntList;->content:[I

    .line 235
    .local v2, "content$iv":[I
    const/4 v3, 0x0

    .local v3, "i$iv":I
    iget v4, v11, Landroidx/collection/IntList;->_size:I

    :goto_2
    if-ge v3, v4, :cond_8

    .line 236
    move-object v5, v2

    .end local v2    # "content$iv":[I
    .local v5, "content$iv":[I
    aget v2, v5, v3

    .local v2, "stickingIndex":I
    const/16 v16, 0x0

    .line 192
    .local v16, "$i$a$-forEach-LazyLayoutStickyItemsKt$applyStickyItems$1":I
    move-object/from16 v6, p1

    .local v6, "$this$indexOfFirst$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 237
    .local v7, "$i$f$indexOfFirst":I
    const/4 v8, 0x0

    .line 238
    .local v8, "index$iv":I
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_3
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_5

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 239
    .local v18, "item$iv":Ljava/lang/Object;
    move-object/from16 v19, v18

    check-cast v19, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .local v19, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/16 v20, 0x0

    .line 192
    .local v20, "$i$a$-indexOfFirst-LazyLayoutStickyItemsKt$applyStickyItems$1$itemIndex$1":I
    invoke-interface/range {v19 .. v19}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getIndex()I

    move-result v12

    if-ne v12, v2, :cond_3

    const/4 v12, 0x1

    goto :goto_4

    :cond_3
    const/4 v12, 0x0

    .line 239
    .end local v19    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v20    # "$i$a$-indexOfFirst-LazyLayoutStickyItemsKt$applyStickyItems$1$itemIndex$1":I
    :goto_4
    if-eqz v12, :cond_4

    .line 240
    goto :goto_5

    .line 241
    :cond_4
    nop

    .end local v18    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 243
    :cond_5
    const/4 v8, -0x1

    .line 192
    .end local v6    # "$this$indexOfFirst$iv":Ljava/util/List;
    .end local v7    # "$i$f$indexOfFirst":I
    .end local v8    # "index$iv":I
    :goto_5
    move v12, v8

    .line 195
    .local v12, "itemIndex":I
    const/4 v6, -0x1

    if-ne v12, v6, :cond_6

    .line 196
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v7, p7

    invoke-interface {v7, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    goto :goto_6

    .line 198
    :cond_6
    move-object/from16 v7, p7

    invoke-interface {v9, v12}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 195
    :goto_6
    nop

    .line 194
    nop

    .line 201
    .local v6, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    nop

    .line 202
    nop

    .line 203
    nop

    .line 204
    move v8, v3

    .end local v3    # "i$iv":I
    .local v8, "i$iv":I
    invoke-interface {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v3

    .line 205
    const/4 v0, -0x1

    if-ne v12, v0, :cond_7

    const/high16 v0, -0x80000000

    goto :goto_7

    :cond_7
    invoke-static {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt;->getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v0

    .line 206
    :goto_7
    nop

    .line 207
    nop

    .line 208
    nop

    .line 209
    nop

    .line 201
    move/from16 v7, p5

    move/from16 v18, v4

    move-object/from16 v17, v5

    move-object v9, v6

    move/from16 v19, v8

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v8, p6

    move v4, v0

    move-object/from16 v0, p0

    .end local v5    # "content$iv":[I
    .end local v6    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v8    # "i$iv":I
    .local v9, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .local v17, "content$iv":[I
    .local v19, "i$iv":I
    invoke-interface/range {v0 .. v8}, Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;->calculateStickingItemOffset(Ljava/util/List;IIIIIII)I

    move-result v3

    .line 200
    nop

    .line 211
    .local v3, "offset":I
    const/4 v0, 0x1

    invoke-interface {v9, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->setNonScrollableItem(Z)V

    .line 212
    const/4 v4, 0x0

    invoke-interface {v9, v3, v4, v7, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->position(IIII)V

    .line 213
    invoke-interface {v14, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    nop

    .line 236
    .end local v2    # "stickingIndex":I
    .end local v3    # "offset":I
    .end local v9    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v12    # "itemIndex":I
    .end local v16    # "$i$a$-forEach-LazyLayoutStickyItemsKt$applyStickyItems$1":I
    nop

    .line 235
    add-int/lit8 v3, v19, 0x1

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v2, v17

    move/from16 v4, v18

    .end local v19    # "i$iv":I
    .local v3, "i$iv":I
    goto/16 :goto_2

    .end local v17    # "content$iv":[I
    .local v2, "content$iv":[I
    :cond_8
    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v17, v2

    move/from16 v19, v3

    .line 244
    .end local v2    # "content$iv":[I
    .end local v3    # "i$iv":I
    .restart local v17    # "content$iv":[I
    nop

    .line 215
    .end local v11    # "this_$iv":Landroidx/collection/IntList;
    .end local v15    # "$i$f$forEach":I
    .end local v17    # "content$iv":[I
    nop

    .end local v1    # "visibleStickyItems":Ljava/util/List;
    .end local v13    # "stickingItems":Landroidx/collection/IntList;
    .end local v14    # "positionedStickingItems":Ljava/util/List;
    goto :goto_8

    .line 178
    :cond_9
    move/from16 v7, p5

    move/from16 v8, p6

    .line 217
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v14

    .line 178
    :goto_8
    return-object v14
.end method

.method private static final debugLog(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p0, "generateMsg"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 155
    .local v0, "$i$f$debugLog":I
    nop

    .line 158
    return-void
.end method

.method private static final getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 4
    .param p0, "$this$mainAxisOffset"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 161
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    move-result-wide v0

    .line 221
    .local v0, "it":J
    const/4 v2, 0x0

    .line 161
    .local v2, "$i$a$-let-LazyLayoutStickyItemsKt$mainAxisOffset$1":I
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->isVertical()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v3

    .end local v0    # "it":J
    .end local v2    # "$i$a$-let-LazyLayoutStickyItemsKt$mainAxisOffset$1":I
    :goto_0
    return v3
.end method
