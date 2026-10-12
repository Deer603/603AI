.class final Landroidx/collection/MutableValues;
.super Ljava/lang/Object;
.source "ScatterMap.kt"

# interfaces
.implements Ljava/util/Collection;
.implements Lkotlin/jvm/internal/markers/KMutableCollection;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Collection<",
        "TV;>;",
        "Lkotlin/jvm/internal/markers/KMutableCollection;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n329#2,6:1808\n339#2,3:1815\n342#2,9:1819\n329#2,6:1828\n339#2,3:1835\n342#2,9:1839\n1399#3:1794\n1270#3:1798\n1399#3:1814\n1270#3:1818\n1399#3:1834\n1270#3:1838\n1726#4,3:1848\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues\n*L\n1726#1:1788,6\n1726#1:1795,3\n1726#1:1799,9\n1737#1:1808,6\n1737#1:1815,3\n1737#1:1819,9\n1747#1:1828,6\n1747#1:1835,3\n1747#1:1839,9\n1726#1:1794\n1726#1:1798\n1737#1:1814\n1737#1:1818\n1747#1:1834\n1747#1:1838\n1757#1:1848,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010)\n\u0002\u0008\u0004\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u0008\u0012\u0004\u0012\u0002H\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0008\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u0015\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0008\u0010\u0016\u001a\u00020\u000cH\u0016J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002J\u0015\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u001a\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0016\u0010\u001b\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0011H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/collection/MutableValues;",
        "K",
        "V",
        "",
        "parent",
        "Landroidx/collection/MutableScatterMap;",
        "(Landroidx/collection/MutableScatterMap;)V",
        "size",
        "",
        "getSize",
        "()I",
        "add",
        "",
        "element",
        "(Ljava/lang/Object;)Z",
        "addAll",
        "elements",
        "",
        "clear",
        "",
        "contains",
        "containsAll",
        "isEmpty",
        "iterator",
        "",
        "remove",
        "removeAll",
        "retainAll",
        "collection"
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
.field private final parent:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/collection/MutableScatterMap;)V
    .locals 1
    .param p1, "parent"    # Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1687
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    return-void
.end method

.method public static final synthetic access$getParent$p(Landroidx/collection/MutableValues;)Landroidx/collection/MutableScatterMap;
    .locals 1
    .param p0, "$this"    # Landroidx/collection/MutableValues;

    .line 1687
    iget-object v0, p0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .line 1721
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TV;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1717
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public clear()V
    .locals 1

    .line 1714
    iget-object v0, p0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 1759
    iget-object v0, p0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 8
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

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1757
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$all$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 1848
    .local v1, "$i$f$all":I
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    goto :goto_0

    .line 1849
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    .local v5, "it":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1757
    .local v6, "$i$a$-all-MutableValues$containsAll$1":I
    iget-object v7, p0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v7, v5}, Landroidx/collection/MutableScatterMap;->containsValue(Ljava/lang/Object;)Z

    move-result v5

    .line 1849
    .end local v5    # "it":Ljava/lang/Object;
    .end local v6    # "$i$a$-all-MutableValues$containsAll$1":I
    if-nez v5, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    .line 1850
    .end local v4    # "element$iv":Ljava/lang/Object;
    :cond_2
    nop

    .line 1757
    .end local v0    # "$this$all$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$all":I
    :goto_0
    return v3
.end method

.method public getSize()I
    .locals 1

    .line 1690
    iget-object v0, p0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    iget v0, v0, Landroidx/collection/MutableScatterMap;->_size:I

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1692
    iget-object v0, p0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    .line 1695
    new-instance v0, Landroidx/collection/MutableValues$iterator$1;

    invoke-direct {v0, p0}, Landroidx/collection/MutableValues$iterator$1;-><init>(Landroidx/collection/MutableValues;)V

    check-cast v0, Ljava/util/Iterator;

    .line 1712
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 18
    .param p1, "element"    # Ljava/lang/Object;

    .line 1747
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    check-cast v1, Landroidx/collection/ScatterMap;

    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v2, 0x0

    .line 1828
    .local v2, "$i$f$forEachIndexed":I
    iget-object v3, v1, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1829
    .local v3, "m$iv":[J
    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    .line 1831
    .local v4, "lastIndex$iv":I
    const/4 v5, 0x0

    .local v5, "i$iv":I
    if-gt v5, v4, :cond_5

    .line 1832
    :goto_0
    aget-wide v7, v3, v5

    .line 1833
    .local v7, "slot$iv":J
    move-wide v9, v7

    .local v9, "$this$maskEmptyOrDeleted$iv$iv":J
    const/4 v11, 0x0

    .line 1834
    .local v11, "$i$f$maskEmptyOrDeleted":I
    not-long v12, v9

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v9

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v9, v12, v14

    .line 1833
    .end local v9    # "$this$maskEmptyOrDeleted$iv$iv":J
    .end local v11    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v9, v9, v14

    if-eqz v9, :cond_4

    .line 1835
    sub-int v9, v5, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    .line 1836
    .local v9, "bitCount$iv":I
    const/4 v11, 0x0

    .local v11, "j$iv":I
    :goto_1
    if-ge v11, v9, :cond_3

    .line 1837
    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    .local v12, "value$iv$iv":J
    const/4 v14, 0x0

    .line 1838
    .local v14, "$i$f$isFull":I
    const-wide/16 v15, 0x80

    cmp-long v15, v12, v15

    const/16 v16, 0x1

    if-gez v15, :cond_0

    move/from16 v12, v16

    goto :goto_2

    :cond_0
    const/4 v12, 0x0

    .line 1837
    .end local v12    # "value$iv$iv":J
    .end local v14    # "$i$f$isFull":I
    :goto_2
    if-eqz v12, :cond_2

    .line 1839
    shl-int/lit8 v12, v5, 0x3

    add-int/2addr v12, v11

    .line 1840
    .local v12, "index$iv":I
    move v13, v12

    .local v13, "index":I
    const/4 v14, 0x0

    .line 1748
    .local v14, "$i$a$-forEachIndexed-MutableValues$remove$1":I
    iget-object v15, v0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    iget-object v15, v15, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v15, v15, v13

    move-object/from16 v6, p1

    const/16 v17, 0x0

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_1

    .line 1749
    iget-object v10, v0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v10, v13}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 1750
    return v16

    .line 1752
    :cond_1
    nop

    .line 1840
    .end local v13    # "index":I
    .end local v14    # "$i$a$-forEachIndexed-MutableValues$remove$1":I
    goto :goto_3

    .line 1837
    .end local v12    # "index$iv":I
    :cond_2
    move-object/from16 v6, p1

    const/16 v17, 0x0

    .line 1842
    :goto_3
    shr-long/2addr v7, v10

    .line 1836
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_3
    move-object/from16 v6, p1

    const/16 v17, 0x0

    .line 1844
    .end local v11    # "j$iv":I
    if-ne v9, v10, :cond_7

    goto :goto_4

    .line 1833
    .end local v9    # "bitCount$iv":I
    :cond_4
    move-object/from16 v6, p1

    const/16 v17, 0x0

    .line 1831
    .end local v7    # "slot$iv":J
    :goto_4
    if-eq v5, v4, :cond_6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    move-object/from16 v6, p1

    const/16 v17, 0x0

    .line 1847
    .end local v5    # "i$iv":I
    :cond_6
    nop

    .line 1753
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$forEachIndexed":I
    .end local v3    # "m$iv":[J
    .end local v4    # "lastIndex$iv":I
    :cond_7
    return v17
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 18
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "elements"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1736
    const/4 v2, 0x0

    .line 1737
    .local v2, "changed":Z
    iget-object v3, v0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    check-cast v3, Landroidx/collection/ScatterMap;

    .local v3, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v4, 0x0

    .line 1808
    .local v4, "$i$f$forEachIndexed":I
    iget-object v5, v3, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1809
    .local v5, "m$iv":[J
    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    .line 1811
    .local v6, "lastIndex$iv":I
    const/4 v7, 0x0

    .local v7, "i$iv":I
    if-gt v7, v6, :cond_5

    .line 1812
    :goto_0
    aget-wide v8, v5, v7

    .line 1813
    .local v8, "slot$iv":J
    move-wide v10, v8

    .local v10, "$this$maskEmptyOrDeleted$iv$iv":J
    const/4 v12, 0x0

    .line 1814
    .local v12, "$i$f$maskEmptyOrDeleted":I
    not-long v13, v10

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v10

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v10, v13, v15

    .line 1813
    .end local v10    # "$this$maskEmptyOrDeleted$iv$iv":J
    .end local v12    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v10, v10, v15

    if-eqz v10, :cond_4

    .line 1815
    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    .line 1816
    .local v10, "bitCount$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv":I
    :goto_1
    if-ge v12, v10, :cond_3

    .line 1817
    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    .local v13, "value$iv$iv":J
    const/4 v15, 0x0

    .line 1818
    .local v15, "$i$f$isFull":I
    const-wide/16 v16, 0x80

    cmp-long v16, v13, v16

    if-gez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_2

    :cond_0
    const/16 v16, 0x0

    .line 1817
    .end local v13    # "value$iv$iv":J
    .end local v15    # "$i$f$isFull":I
    :goto_2
    if-eqz v16, :cond_2

    .line 1819
    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    .line 1820
    .local v13, "index$iv":I
    move v14, v13

    .local v14, "index":I
    const/4 v15, 0x0

    .line 1738
    .local v15, "$i$a$-forEachIndexed-MutableValues$removeAll$1":I
    move/from16 v16, v11

    move-object v11, v1

    check-cast v11, Ljava/lang/Iterable;

    iget-object v1, v0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    iget-object v1, v1, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v1, v1, v14

    invoke-static {v11, v1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1739
    iget-object v1, v0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1, v14}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 1740
    const/4 v2, 0x1

    .line 1742
    :cond_1
    nop

    .line 1820
    .end local v14    # "index":I
    .end local v15    # "$i$a$-forEachIndexed-MutableValues$removeAll$1":I
    goto :goto_3

    .line 1817
    .end local v13    # "index$iv":I
    :cond_2
    move/from16 v16, v11

    .line 1822
    :goto_3
    shr-long v8, v8, v16

    .line 1816
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p1

    move/from16 v11, v16

    goto :goto_1

    :cond_3
    move/from16 v16, v11

    .line 1824
    .end local v12    # "j$iv":I
    move/from16 v1, v16

    if-ne v10, v1, :cond_6

    .line 1811
    .end local v8    # "slot$iv":J
    .end local v10    # "bitCount$iv":I
    :cond_4
    if-eq v7, v6, :cond_5

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p1

    goto :goto_0

    .line 1827
    .end local v7    # "i$iv":I
    :cond_5
    nop

    .line 1743
    .end local v3    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "m$iv":[J
    .end local v6    # "lastIndex$iv":I
    :cond_6
    return v2
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 18
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "elements"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1725
    const/4 v2, 0x0

    .line 1726
    .local v2, "changed":Z
    iget-object v3, v0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    check-cast v3, Landroidx/collection/ScatterMap;

    .local v3, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v4, 0x0

    .line 1788
    .local v4, "$i$f$forEachIndexed":I
    iget-object v5, v3, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1789
    .local v5, "m$iv":[J
    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    .line 1791
    .local v6, "lastIndex$iv":I
    const/4 v7, 0x0

    .local v7, "i$iv":I
    if-gt v7, v6, :cond_5

    .line 1792
    :goto_0
    aget-wide v8, v5, v7

    .line 1793
    .local v8, "slot$iv":J
    move-wide v10, v8

    .local v10, "$this$maskEmptyOrDeleted$iv$iv":J
    const/4 v12, 0x0

    .line 1794
    .local v12, "$i$f$maskEmptyOrDeleted":I
    not-long v13, v10

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v10

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v10, v13, v15

    .line 1793
    .end local v10    # "$this$maskEmptyOrDeleted$iv$iv":J
    .end local v12    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v10, v10, v15

    if-eqz v10, :cond_4

    .line 1795
    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    .line 1796
    .local v10, "bitCount$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv":I
    :goto_1
    if-ge v12, v10, :cond_3

    .line 1797
    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    .local v13, "value$iv$iv":J
    const/4 v15, 0x0

    .line 1798
    .local v15, "$i$f$isFull":I
    const-wide/16 v16, 0x80

    cmp-long v16, v13, v16

    if-gez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_2

    :cond_0
    const/16 v16, 0x0

    .line 1797
    .end local v13    # "value$iv$iv":J
    .end local v15    # "$i$f$isFull":I
    :goto_2
    if-eqz v16, :cond_2

    .line 1799
    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    .line 1800
    .local v13, "index$iv":I
    move v14, v13

    .local v14, "index":I
    const/4 v15, 0x0

    .line 1727
    .local v15, "$i$a$-forEachIndexed-MutableValues$retainAll$1":I
    move/from16 v16, v11

    move-object v11, v1

    check-cast v11, Ljava/lang/Iterable;

    iget-object v1, v0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    iget-object v1, v1, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v1, v1, v14

    invoke-static {v11, v1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1728
    iget-object v1, v0, Landroidx/collection/MutableValues;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1, v14}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 1729
    const/4 v2, 0x1

    .line 1731
    :cond_1
    nop

    .line 1800
    .end local v14    # "index":I
    .end local v15    # "$i$a$-forEachIndexed-MutableValues$retainAll$1":I
    goto :goto_3

    .line 1797
    .end local v13    # "index$iv":I
    :cond_2
    move/from16 v16, v11

    .line 1802
    :goto_3
    shr-long v8, v8, v16

    .line 1796
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p1

    move/from16 v11, v16

    goto :goto_1

    :cond_3
    move/from16 v16, v11

    .line 1804
    .end local v12    # "j$iv":I
    move/from16 v1, v16

    if-ne v10, v1, :cond_6

    .line 1791
    .end local v8    # "slot$iv":J
    .end local v10    # "bitCount$iv":I
    :cond_4
    if-eq v7, v6, :cond_5

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p1

    goto :goto_0

    .line 1807
    .end local v7    # "i$iv":I
    :cond_5
    nop

    .line 1732
    .end local v3    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "m$iv":[J
    .end local v6    # "lastIndex$iv":I
    :cond_6
    return v2
.end method

.method public final bridge size()I
    .locals 1

    .line 1687
    invoke-virtual {p0}, Landroidx/collection/MutableValues;->getSize()I

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

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
