.class final Landroidx/compose/runtime/SourceInformationGroupDataIterator;
.super Ljava/lang/Object;
.source "SlotTable.kt"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/util/Iterator;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/util/Iterator<",
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3777#2:3964\n3777#2:3965\n33#3,6:3966\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n*L\n3408#1:3964\n3414#1:3965\n3421#1:3966,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/runtime/SourceInformationGroupDataIterator;",
        "",
        "",
        "",
        "table",
        "Landroidx/compose/runtime/SlotTable;",
        "group",
        "",
        "sourceInformation",
        "Landroidx/compose/runtime/GroupSourceInformation;",
        "(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;)V",
        "base",
        "end",
        "filter",
        "Landroidx/compose/runtime/BitVector;",
        "index",
        "start",
        "getTable",
        "()Landroidx/compose/runtime/SlotTable;",
        "hasNext",
        "",
        "iterator",
        "next",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final base:I

.field private final end:I

.field private final filter:Landroidx/compose/runtime/BitVector;

.field private index:I

.field private final start:I

.field private final table:Landroidx/compose/runtime/SlotTable;


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;)V
    .locals 13
    .param p1, "table"    # Landroidx/compose/runtime/SlotTable;
    .param p2, "group"    # I
    .param p3, "sourceInformation"    # Landroidx/compose/runtime/GroupSourceInformation;

    .line 3403
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3404
    iput-object p1, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->table:Landroidx/compose/runtime/SlotTable;

    .line 3408
    iget-object v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v0

    .local v0, "$this$dataAnchor$iv":[I
    const/4 v1, 0x0

    .line 3964
    .local v1, "$i$f$dataAnchor":I
    mul-int/lit8 v2, p2, 0x5

    add-int/lit8 v2, v2, 0x4

    aget v0, v0, v2

    .line 3408
    .end local v0    # "$this$dataAnchor$iv":[I
    .end local v1    # "$i$f$dataAnchor":I
    iput v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->base:I

    .line 3409
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/GroupSourceInformation;->getDataStartOffset()I

    move-result v0

    iput v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->start:I

    .line 3411
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/GroupSourceInformation;->getDataEndOffset()I

    move-result v0

    .local v0, "it":I
    const/4 v1, 0x0

    .line 3412
    .local v1, "$i$a$-let-SourceInformationGroupDataIterator$end$1":I
    if-lez v0, :cond_0

    move v2, v0

    goto :goto_1

    .line 3414
    :cond_0
    add-int/lit8 v2, p2, 0x1

    iget-object v3, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v3}, Landroidx/compose/runtime/SlotTable;->getGroupsSize()I

    move-result v3

    .line 3415
    iget-object v4, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->table:Landroidx/compose/runtime/SlotTable;

    .line 3414
    if-ge v2, v3, :cond_1

    invoke-virtual {v4}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v2

    .local v2, "$this$dataAnchor$iv":[I
    add-int/lit8 v3, p2, 0x1

    .local v3, "address$iv":I
    const/4 v4, 0x0

    .line 3965
    .local v4, "$i$f$dataAnchor":I
    mul-int/lit8 v5, v3, 0x5

    add-int/lit8 v5, v5, 0x4

    aget v2, v2, v5

    .end local v2    # "$this$dataAnchor$iv":[I
    .end local v3    # "address$iv":I
    .end local v4    # "$i$f$dataAnchor":I
    goto :goto_0

    .line 3415
    :cond_1
    invoke-virtual {v4}, Landroidx/compose/runtime/SlotTable;->getSlotsSize()I

    move-result v2

    :goto_0
    iget v3, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->base:I

    .line 3414
    sub-int/2addr v2, v3

    .line 3415
    :goto_1
    nop

    .line 3411
    .end local v0    # "it":I
    .end local v1    # "$i$a$-let-SourceInformationGroupDataIterator$end$1":I
    iput v2, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->end:I

    .line 3418
    new-instance v0, Landroidx/compose/runtime/BitVector;

    invoke-direct {v0}, Landroidx/compose/runtime/BitVector;-><init>()V

    move-object v1, v0

    .local v1, "it":Landroidx/compose/runtime/BitVector;
    const/4 v2, 0x0

    .line 3420
    .local v2, "$i$a$-also-SourceInformationGroupDataIterator$filter$1":I
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/GroupSourceInformation;->getGroups()Ljava/util/ArrayList;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_3

    .line 3421
    .local v3, "groups":Ljava/util/ArrayList;
    :cond_2
    move-object v4, v3

    check-cast v4, Ljava/util/List;

    .local v4, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 3966
    .local v5, "$i$f$fastForEach":I
    nop

    .line 3967
    const/4 v6, 0x0

    .local v6, "index$iv":I
    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_2
    if-ge v6, v7, :cond_4

    .line 3968
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 3969
    .local v8, "item$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "info":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 3422
    .local v10, "$i$a$-fastForEach-SourceInformationGroupDataIterator$filter$1$1":I
    instance-of v11, v9, Landroidx/compose/runtime/GroupSourceInformation;

    if-eqz v11, :cond_3

    .line 3423
    move-object v11, v9

    check-cast v11, Landroidx/compose/runtime/GroupSourceInformation;

    invoke-virtual {v11}, Landroidx/compose/runtime/GroupSourceInformation;->getDataStartOffset()I

    move-result v11

    move-object v12, v9

    check-cast v12, Landroidx/compose/runtime/GroupSourceInformation;

    invoke-virtual {v12}, Landroidx/compose/runtime/GroupSourceInformation;->getDataEndOffset()I

    move-result v12

    invoke-virtual {v1, v11, v12}, Landroidx/compose/runtime/BitVector;->setRange(II)V

    .line 3425
    :cond_3
    nop

    .line 3969
    .end local v9    # "info":Ljava/lang/Object;
    .end local v10    # "$i$a$-fastForEach-SourceInformationGroupDataIterator$filter$1$1":I
    nop

    .line 3967
    .end local v8    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 3971
    .end local v6    # "index$iv":I
    :cond_4
    nop

    .line 3426
    .end local v4    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastForEach":I
    nop

    .line 3418
    .end local v1    # "it":Landroidx/compose/runtime/BitVector;
    .end local v2    # "$i$a$-also-SourceInformationGroupDataIterator$filter$1":I
    .end local v3    # "groups":Ljava/util/ArrayList;
    :goto_3
    iput-object v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->filter:Landroidx/compose/runtime/BitVector;

    .line 3427
    iget-object v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->filter:Landroidx/compose/runtime/BitVector;

    iget v1, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->start:I

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/BitVector;->nextClear(I)I

    move-result v0

    iput v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->index:I

    .line 3403
    return-void
.end method


# virtual methods
.method public final getTable()Landroidx/compose/runtime/SlotTable;
    .locals 1

    .line 3404
    iget-object v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->table:Landroidx/compose/runtime/SlotTable;

    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    .line 3431
    iget v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->index:I

    iget v1, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->end:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 3429
    move-object v0, p0

    check-cast v0, Ljava/util/Iterator;

    return-object v0
.end method

.method public next()Ljava/lang/Object;
    .locals 6

    .line 3434
    iget v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->end:I

    iget v1, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->index:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ltz v1, :cond_0

    if-ge v1, v0, :cond_0

    move v3, v2

    :cond_0
    if-eqz v3, :cond_1

    iget-object v0, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getSlots()[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->base:I

    iget v3, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->index:I

    add-int/2addr v1, v3

    aget-object v0, v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    move-object v1, v0

    .local v1, "it":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 3435
    .local v3, "$i$a$-also-SourceInformationGroupDataIterator$next$1":I
    iget-object v4, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->filter:Landroidx/compose/runtime/BitVector;

    iget v5, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->index:I

    add-int/2addr v5, v2

    invoke-virtual {v4, v5}, Landroidx/compose/runtime/BitVector;->nextClear(I)I

    move-result v2

    iput v2, p0, Landroidx/compose/runtime/SourceInformationGroupDataIterator;->index:I

    .line 3436
    nop

    .line 3434
    .end local v1    # "it":Ljava/lang/Object;
    .end local v3    # "$i$a$-also-SourceInformationGroupDataIterator$next$1":I
    nop

    .line 3436
    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
