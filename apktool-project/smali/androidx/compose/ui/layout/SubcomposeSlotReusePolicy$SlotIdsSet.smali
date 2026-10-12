.class public final Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;
.super Ljava/lang/Object;
.source "SubcomposeLayout.kt"

# interfaces
.implements Ljava/util/Collection;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SlotIdsSet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Collection<",
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n+ 4 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1037:1\n1855#2,2:1038\n938#3,2:1040\n941#3,4:1056\n945#3:1066\n1009#3,3:1067\n1013#3,4:1084\n1017#3:1094\n269#4,7:1042\n280#4,3:1050\n283#4,2:1054\n286#4,6:1060\n269#4,7:1070\n280#4,3:1078\n283#4,2:1082\n286#4,6:1088\n301#4,7:1095\n308#4,4:1103\n1399#5:1049\n1270#5:1053\n1399#5:1077\n1270#5:1081\n1123#6:1102\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet\n*L\n306#1:1038,2\n341#1:1040,2\n341#1:1056,4\n341#1:1066\n357#1:1067,3\n357#1:1084,4\n357#1:1094\n341#1:1042,7\n341#1:1050,3\n341#1:1054,2\n341#1:1060,6\n357#1:1070,7\n357#1:1078,3\n357#1:1082,2\n357#1:1088,6\n373#1:1095,7\n373#1:1103,4\n341#1:1049\n341#1:1053\n357#1:1077\n357#1:1081\n373#1:1102\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010)\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0008\u0000\u0012\u0010\u0008\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0002\u0008\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0016J\u001c\u0010\u0014\u001a\u00020\u000f2\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000f0\u0016J\u0008\u0010\u0017\u001a\u00020\u000bH\u0016J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0019H\u0096\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002J\u001c\u0010\u001b\u001a\u00020\u000b2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000b0\u0016J\u0016\u0010\u001b\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u001e\u001a\u00020\u000b2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000b0\u0016J\u0016\u0010\u001e\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006!"
    }
    d2 = {
        "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;",
        "",
        "",
        "set",
        "Landroidx/collection/MutableOrderedScatterSet;",
        "(Landroidx/collection/MutableOrderedScatterSet;)V",
        "size",
        "",
        "getSize",
        "()I",
        "add",
        "",
        "slotId",
        "add$ui_release",
        "clear",
        "",
        "contains",
        "element",
        "containsAll",
        "elements",
        "forEach",
        "block",
        "Lkotlin/Function1;",
        "isEmpty",
        "iterator",
        "",
        "remove",
        "removeAll",
        "predicate",
        "slotIds",
        "retainAll",
        "trimToSize",
        "maxSlotsToRetainForReuse",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final set:Landroidx/collection/MutableOrderedScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableOrderedScatterSet<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;-><init>(Landroidx/collection/MutableOrderedScatterSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/collection/MutableOrderedScatterSet;)V
    .locals 0
    .param p1, "set"    # Landroidx/collection/MutableOrderedScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableOrderedScatterSet<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 295
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 297
    iput-object p1, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    .line 296
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/collection/MutableOrderedScatterSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 296
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 297
    invoke-static {}, Landroidx/collection/OrderedScatterSetKt;->mutableOrderedScatterSetOf()Landroidx/collection/MutableOrderedScatterSet;

    move-result-object p1

    .line 296
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;-><init>(Landroidx/collection/MutableOrderedScatterSet;)V

    .line 298
    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 295
    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->add$ui_release(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final add$ui_release(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "slotId"    # Ljava/lang/Object;

    .line 316
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableOrderedScatterSet;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final clear()V
    .locals 1

    .line 360
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0}, Landroidx/collection/MutableOrderedScatterSet;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 314
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableOrderedScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 7
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 306
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 1038
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    .local v4, "element":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 307
    .local v5, "$i$a$-forEach-SubcomposeSlotReusePolicy$SlotIdsSet$containsAll$1":I
    iget-object v6, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v6, v4}, Landroidx/collection/MutableOrderedScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 308
    const/4 v2, 0x0

    return v2

    .line 310
    :cond_0
    nop

    .line 1038
    .end local v4    # "element":Ljava/lang/Object;
    .end local v5    # "$i$a$-forEach-SubcomposeSlotReusePolicy$SlotIdsSet$containsAll$1":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1039
    :cond_1
    nop

    .line 311
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    const/4 v0, 0x1

    return v0
.end method

.method public final forEach(Lkotlin/jvm/functions/Function1;)V
    .locals 12
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 373
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    check-cast v0, Landroidx/collection/OrderedScatterSet;

    .local v0, "this_$iv":Landroidx/collection/OrderedScatterSet;
    const/4 v1, 0x0

    .line 1095
    .local v1, "$i$f$forEach":I
    nop

    .line 1096
    iget-object v2, v0, Landroidx/collection/OrderedScatterSet;->elements:[Ljava/lang/Object;

    .line 1097
    .local v2, "elements$iv":[Ljava/lang/Object;
    iget-object v3, v0, Landroidx/collection/OrderedScatterSet;->nodes:[J

    .line 1099
    .local v3, "nodes$iv":[J
    iget v4, v0, Landroidx/collection/OrderedScatterSet;->tail:I

    .line 1100
    .local v4, "candidate$iv":I
    :goto_0
    const v5, 0x7fffffff

    if-eq v4, v5, :cond_0

    .line 1101
    aget-wide v5, v3, v4

    .local v5, "$this$previousNode$iv$iv":J
    const/4 v7, 0x0

    .line 1102
    .local v7, "$i$f$getPreviousNode":I
    const/16 v8, 0x1f

    shr-long v8, v5, v8

    const-wide/32 v10, 0x7fffffff

    and-long/2addr v8, v10

    long-to-int v5, v8

    .line 1101
    .end local v5    # "$this$previousNode$iv$iv":J
    .end local v7    # "$i$f$getPreviousNode":I
    nop

    .line 1103
    .local v5, "previousNode$iv":I
    aget-object v6, v2, v4

    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1104
    move v4, v5

    .end local v5    # "previousNode$iv":I
    goto :goto_0

    .line 1106
    :cond_0
    nop

    .line 373
    .end local v0    # "this_$iv":Landroidx/collection/OrderedScatterSet;
    .end local v1    # "$i$f$forEach":I
    .end local v2    # "elements$iv":[Ljava/lang/Object;
    .end local v3    # "nodes$iv":[J
    .end local v4    # "candidate$iv":I
    return-void
.end method

.method public getSize()I
    .locals 1

    .line 301
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0}, Landroidx/collection/MutableOrderedScatterSet;->getSize()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 303
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0}, Landroidx/collection/MutableOrderedScatterSet;->isEmpty()Z

    move-result v0

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

    .line 318
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0}, Landroidx/collection/MutableOrderedScatterSet;->asMutableSet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "slotId"    # Ljava/lang/Object;

    .line 325
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableOrderedScatterSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1, "slotIds"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 332
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableOrderedScatterSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final removeAll(Lkotlin/jvm/functions/Function1;)Z
    .locals 20
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 340
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v1}, Landroidx/collection/MutableOrderedScatterSet;->getSize()I

    move-result v1

    .line 341
    .local v1, "size":I
    iget-object v2, v0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    .local v2, "this_$iv":Landroidx/collection/MutableOrderedScatterSet;
    const/4 v3, 0x0

    .line 1040
    .local v3, "$i$f$removeIf":I
    iget-object v4, v2, Landroidx/collection/MutableOrderedScatterSet;->elements:[Ljava/lang/Object;

    .line 1041
    .local v4, "elements$iv":[Ljava/lang/Object;
    move-object v5, v2

    check-cast v5, Landroidx/collection/OrderedScatterSet;

    .local v5, "this_$iv$iv":Landroidx/collection/OrderedScatterSet;
    const/4 v6, 0x0

    .line 1042
    .local v6, "$i$f$unorderedForEachIndex":I
    nop

    .line 1043
    iget-object v7, v5, Landroidx/collection/OrderedScatterSet;->metadata:[J

    .line 1044
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1046
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_5

    .line 1047
    :goto_0
    aget-wide v12, v7, v9

    .line 1048
    .local v12, "slot$iv$iv":J
    move-wide v14, v12

    .local v14, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1049
    .local v16, "$i$f$maskEmptyOrDeleted":I
    not-long v10, v14

    const/16 v17, 0x7

    shl-long v10, v10, v17

    and-long/2addr v10, v14

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v10, v10, v17

    .line 1048
    .end local v14    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v16    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v10, v10, v17

    if-eqz v10, :cond_4

    .line 1050
    sub-int v10, v9, v8

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    .line 1051
    .local v10, "bitCount$iv$iv":I
    const/4 v14, 0x0

    .local v14, "j$iv$iv":I
    :goto_1
    if-ge v14, v10, :cond_3

    .line 1052
    const-wide/16 v15, 0xff

    and-long/2addr v15, v12

    .local v15, "value$iv$iv$iv":J
    const/16 v17, 0x0

    .line 1053
    .local v17, "$i$f$isFull":I
    const-wide/16 v18, 0x80

    cmp-long v18, v15, v18

    if-gez v18, :cond_0

    const/4 v15, 0x1

    goto :goto_2

    :cond_0
    const/4 v15, 0x0

    .line 1052
    .end local v15    # "value$iv$iv$iv":J
    .end local v17    # "$i$f$isFull":I
    :goto_2
    if-eqz v15, :cond_2

    .line 1054
    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    .line 1055
    .local v15, "index$iv$iv":I
    move/from16 v16, v15

    .local v16, "index$iv":I
    const/16 v17, 0x0

    .line 1056
    .local v17, "$i$a$-unorderedForEachIndex-MutableOrderedScatterSet$removeIf$1$iv":I
    move/from16 v18, v11

    aget-object v11, v4, v16

    move/from16 v19, v3

    move-object/from16 v3, p1

    .end local v3    # "$i$f$removeIf":I
    .local v19, "$i$f$removeIf":I
    invoke-interface {v3, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_1

    .line 1057
    move/from16 v11, v16

    .end local v16    # "index$iv":I
    .local v11, "index$iv":I
    invoke-virtual {v2, v11}, Landroidx/collection/MutableOrderedScatterSet;->removeElementAt(I)V

    goto :goto_3

    .line 1056
    .end local v11    # "index$iv":I
    .restart local v16    # "index$iv":I
    :cond_1
    move/from16 v11, v16

    .line 1059
    .end local v16    # "index$iv":I
    .restart local v11    # "index$iv":I
    :goto_3
    nop

    .line 1055
    .end local v11    # "index$iv":I
    .end local v17    # "$i$a$-unorderedForEachIndex-MutableOrderedScatterSet$removeIf$1$iv":I
    goto :goto_4

    .line 1052
    .end local v15    # "index$iv$iv":I
    .end local v19    # "$i$f$removeIf":I
    .restart local v3    # "$i$f$removeIf":I
    :cond_2
    move/from16 v19, v3

    move/from16 v18, v11

    move-object/from16 v3, p1

    .line 1060
    .end local v3    # "$i$f$removeIf":I
    .restart local v19    # "$i$f$removeIf":I
    :goto_4
    shr-long v12, v12, v18

    .line 1051
    add-int/lit8 v14, v14, 0x1

    move/from16 v11, v18

    move/from16 v3, v19

    goto :goto_1

    .end local v19    # "$i$f$removeIf":I
    .restart local v3    # "$i$f$removeIf":I
    :cond_3
    move/from16 v19, v3

    move/from16 v18, v11

    move-object/from16 v3, p1

    .line 1062
    .end local v3    # "$i$f$removeIf":I
    .end local v14    # "j$iv$iv":I
    .restart local v19    # "$i$f$removeIf":I
    if-ne v10, v11, :cond_7

    goto :goto_5

    .line 1048
    .end local v10    # "bitCount$iv$iv":I
    .end local v19    # "$i$f$removeIf":I
    .restart local v3    # "$i$f$removeIf":I
    :cond_4
    move/from16 v19, v3

    move-object/from16 v3, p1

    .line 1046
    .end local v3    # "$i$f$removeIf":I
    .end local v12    # "slot$iv$iv":J
    .restart local v19    # "$i$f$removeIf":I
    :goto_5
    if-eq v9, v8, :cond_6

    add-int/lit8 v9, v9, 0x1

    move/from16 v3, v19

    goto :goto_0

    .end local v19    # "$i$f$removeIf":I
    .restart local v3    # "$i$f$removeIf":I
    :cond_5
    move/from16 v19, v3

    move-object/from16 v3, p1

    .line 1065
    .end local v3    # "$i$f$removeIf":I
    .end local v9    # "i$iv$iv":I
    .restart local v19    # "$i$f$removeIf":I
    :cond_6
    nop

    .line 1066
    .end local v5    # "this_$iv$iv":Landroidx/collection/OrderedScatterSet;
    .end local v6    # "$i$f$unorderedForEachIndex":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_7
    nop

    .line 342
    .end local v2    # "this_$iv":Landroidx/collection/MutableOrderedScatterSet;
    .end local v4    # "elements$iv":[Ljava/lang/Object;
    .end local v19    # "$i$f$removeIf":I
    iget-object v2, v0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v2}, Landroidx/collection/MutableOrderedScatterSet;->getSize()I

    move-result v2

    if-eq v1, v2, :cond_8

    const/4 v10, 0x1

    goto :goto_6

    :cond_8
    const/4 v10, 0x0

    :goto_6
    return v10
.end method

.method public removeIf(Ljava/util/function/Predicate;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Predicate<",
            "-",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1, "slotIds"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 350
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableOrderedScatterSet;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final retainAll(Lkotlin/jvm/functions/Function1;)Z
    .locals 20
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 357
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    .local v1, "this_$iv":Landroidx/collection/MutableOrderedScatterSet;
    const/4 v2, 0x0

    .line 1067
    .local v2, "$i$f$retainAll":I
    iget-object v3, v1, Landroidx/collection/MutableOrderedScatterSet;->elements:[Ljava/lang/Object;

    .line 1068
    .local v3, "elements$iv":[Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/collection/MutableOrderedScatterSet;->getSize()I

    move-result v4

    .line 1069
    .local v4, "startSize$iv":I
    move-object v5, v1

    check-cast v5, Landroidx/collection/OrderedScatterSet;

    .local v5, "this_$iv$iv":Landroidx/collection/OrderedScatterSet;
    const/4 v6, 0x0

    .line 1070
    .local v6, "$i$f$unorderedForEachIndex":I
    nop

    .line 1071
    iget-object v7, v5, Landroidx/collection/OrderedScatterSet;->metadata:[J

    .line 1072
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1074
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_5

    .line 1075
    :goto_0
    aget-wide v12, v7, v9

    .line 1076
    .local v12, "slot$iv$iv":J
    move-wide v14, v12

    .local v14, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1077
    .local v16, "$i$f$maskEmptyOrDeleted":I
    not-long v10, v14

    const/16 v17, 0x7

    shl-long v10, v10, v17

    and-long/2addr v10, v14

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v10, v10, v17

    .line 1076
    .end local v14    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v16    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v10, v10, v17

    if-eqz v10, :cond_4

    .line 1078
    sub-int v10, v9, v8

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    .line 1079
    .local v10, "bitCount$iv$iv":I
    const/4 v14, 0x0

    .local v14, "j$iv$iv":I
    :goto_1
    if-ge v14, v10, :cond_3

    .line 1080
    const-wide/16 v15, 0xff

    and-long/2addr v15, v12

    .local v15, "value$iv$iv$iv":J
    const/16 v17, 0x0

    .line 1081
    .local v17, "$i$f$isFull":I
    const-wide/16 v18, 0x80

    cmp-long v18, v15, v18

    if-gez v18, :cond_0

    const/4 v15, 0x1

    goto :goto_2

    :cond_0
    const/4 v15, 0x0

    .line 1080
    .end local v15    # "value$iv$iv$iv":J
    .end local v17    # "$i$f$isFull":I
    :goto_2
    if-eqz v15, :cond_2

    .line 1082
    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    .line 1083
    .local v15, "index$iv$iv":I
    move/from16 v16, v15

    .local v16, "index$iv":I
    const/16 v17, 0x0

    .line 1084
    .local v17, "$i$a$-unorderedForEachIndex-MutableOrderedScatterSet$retainAll$4$iv":I
    move/from16 v18, v11

    aget-object v11, v3, v16

    move-object/from16 v0, p1

    invoke-interface {v0, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-nez v11, :cond_1

    .line 1085
    move/from16 v11, v16

    .end local v16    # "index$iv":I
    .local v11, "index$iv":I
    invoke-virtual {v1, v11}, Landroidx/collection/MutableOrderedScatterSet;->removeElementAt(I)V

    goto :goto_3

    .line 1084
    .end local v11    # "index$iv":I
    .restart local v16    # "index$iv":I
    :cond_1
    move/from16 v11, v16

    .line 1087
    .end local v16    # "index$iv":I
    .restart local v11    # "index$iv":I
    :goto_3
    nop

    .line 1083
    .end local v11    # "index$iv":I
    .end local v17    # "$i$a$-unorderedForEachIndex-MutableOrderedScatterSet$retainAll$4$iv":I
    goto :goto_4

    .line 1080
    .end local v15    # "index$iv$iv":I
    :cond_2
    move-object/from16 v0, p1

    move/from16 v18, v11

    .line 1088
    :goto_4
    shr-long v12, v12, v18

    .line 1079
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    move/from16 v11, v18

    goto :goto_1

    :cond_3
    move-object/from16 v0, p1

    move/from16 v18, v11

    .line 1090
    .end local v14    # "j$iv$iv":I
    if-ne v10, v11, :cond_7

    goto :goto_5

    .line 1076
    .end local v10    # "bitCount$iv$iv":I
    :cond_4
    move-object/from16 v0, p1

    .line 1074
    .end local v12    # "slot$iv$iv":J
    :goto_5
    if-eq v9, v8, :cond_6

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    goto :goto_0

    :cond_5
    move-object/from16 v0, p1

    .line 1093
    .end local v9    # "i$iv$iv":I
    :cond_6
    nop

    .line 1094
    .end local v5    # "this_$iv$iv":Landroidx/collection/OrderedScatterSet;
    .end local v6    # "$i$f$unorderedForEachIndex":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_7
    invoke-virtual {v1}, Landroidx/collection/MutableOrderedScatterSet;->getSize()I

    move-result v5

    if-eq v4, v5, :cond_8

    const/4 v10, 0x1

    goto :goto_6

    :cond_8
    const/4 v10, 0x0

    .line 357
    .end local v1    # "this_$iv":Landroidx/collection/MutableOrderedScatterSet;
    .end local v2    # "$i$f$retainAll":I
    .end local v3    # "elements$iv":[Ljava/lang/Object;
    .end local v4    # "startSize$iv":I
    :goto_6
    return v10
.end method

.method public final bridge size()I
    .locals 1

    .line 295
    invoke-virtual {p0}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->getSize()I

    move-result v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final trimToSize(I)V
    .locals 1
    .param p1, "maxSlotsToRetainForReuse"    # I

    .line 366
    iget-object v0, p0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->set:Landroidx/collection/MutableOrderedScatterSet;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableOrderedScatterSet;->trimToSize(I)V

    return-void
.end method
