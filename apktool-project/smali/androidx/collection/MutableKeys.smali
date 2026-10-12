.class final Landroidx/collection/MutableKeys;
.super Ljava/lang/Object;
.source "ScatterMap.kt"

# interfaces
.implements Ljava/util/Set;
.implements Lkotlin/jvm/internal/markers/KMutableSet;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Set<",
        "TK;>;",
        "Lkotlin/jvm/internal/markers/KMutableSet;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableKeys\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n329#2,6:1808\n339#2,3:1815\n342#2,9:1819\n555#2:1828\n556#2:1832\n558#2,2:1834\n560#2,4:1837\n564#2:1844\n565#2:1848\n566#2:1850\n567#2,4:1853\n573#2:1858\n574#2,8:1860\n1399#3:1794\n1270#3:1798\n1399#3:1814\n1270#3:1818\n1165#3,3:1829\n1179#3:1833\n1175#3:1836\n1372#3,3:1841\n1386#3,3:1845\n1312#3:1849\n1303#3:1851\n1297#3:1852\n1309#3:1857\n1393#3:1859\n1726#4,3:1868\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableKeys\n*L\n1652#1:1788,6\n1652#1:1795,3\n1652#1:1799,9\n1663#1:1808,6\n1663#1:1815,3\n1663#1:1819,9\n1673#1:1828\n1673#1:1832\n1673#1:1834,2\n1673#1:1837,4\n1673#1:1844\n1673#1:1848\n1673#1:1850\n1673#1:1853,4\n1673#1:1858\n1673#1:1860,8\n1652#1:1794\n1652#1:1798\n1663#1:1814\n1663#1:1818\n1673#1:1829,3\n1673#1:1833\n1673#1:1836\n1673#1:1841,3\n1673#1:1845,3\n1673#1:1849\n1673#1:1851\n1673#1:1852\n1673#1:1857\n1673#1:1859\n1682#1:1868,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010)\n\u0002\u0008\u0004\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0008\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u0015\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0008\u0010\u0016\u001a\u00020\u000cH\u0016J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0002J\u0015\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u001a\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0016\u0010\u001b\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/collection/MutableKeys;",
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

    .line 1614
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    return-void
.end method

.method public static final synthetic access$getParent$p(Landroidx/collection/MutableKeys;)Landroidx/collection/MutableScatterMap;
    .locals 1
    .param p0, "$this"    # Landroidx/collection/MutableKeys;

    .line 1614
    iget-object v0, p0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1647
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
            "+TK;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1643
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public clear()V
    .locals 1

    .line 1640
    iget-object v0, p0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 1684
    iget-object v0, p0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->containsKey(Ljava/lang/Object;)Z

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

    .line 1682
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$all$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 1868
    .local v1, "$i$f$all":I
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    goto :goto_0

    .line 1869
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

    .line 1682
    .local v6, "$i$a$-all-MutableKeys$containsAll$1":I
    iget-object v7, p0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v7, v5}, Landroidx/collection/MutableScatterMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    .line 1869
    .end local v5    # "it":Ljava/lang/Object;
    .end local v6    # "$i$a$-all-MutableKeys$containsAll$1":I
    if-nez v5, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    .line 1870
    .end local v4    # "element$iv":Ljava/lang/Object;
    :cond_2
    nop

    .line 1682
    .end local v0    # "$this$all$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$all":I
    :goto_0
    return v3
.end method

.method public getSize()I
    .locals 1

    .line 1616
    iget-object v0, p0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    iget v0, v0, Landroidx/collection/MutableScatterMap;->_size:I

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1618
    iget-object v0, p0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

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
            "TK;>;"
        }
    .end annotation

    .line 1621
    new-instance v0, Landroidx/collection/MutableKeys$iterator$1;

    invoke-direct {v0, p0}, Landroidx/collection/MutableKeys$iterator$1;-><init>(Landroidx/collection/MutableKeys;)V

    check-cast v0, Ljava/util/Iterator;

    .line 1638
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 25
    .param p1, "element"    # Ljava/lang/Object;

    .line 1673
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    check-cast v2, Landroidx/collection/ScatterMap;

    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v3, 0x0

    .line 1828
    .local v3, "$i$f$findKeyIndex$collection":I
    const/4 v4, 0x0

    .line 1829
    .local v4, "$i$f$hash":I
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const v7, -0x3361d2af    # -8.293031E7f

    mul-int/2addr v6, v7

    .line 1831
    .local v6, "hash$iv$iv":I
    shl-int/lit8 v7, v6, 0x10

    xor-int v4, v6, v7

    .line 1828
    .end local v4    # "$i$f$hash":I
    .end local v6    # "hash$iv$iv":I
    nop

    .line 1832
    .local v4, "hash$iv":I
    const/4 v6, 0x0

    .line 1833
    .local v6, "$i$f$h2":I
    and-int/lit8 v6, v4, 0x7f

    .line 1832
    .end local v6    # "$i$f$h2":I
    nop

    .line 1834
    .local v6, "hash2$iv":I
    iget v7, v2, Landroidx/collection/ScatterMap;->_capacity:I

    .line 1835
    .local v7, "probeMask$iv":I
    const/4 v8, 0x0

    .line 1836
    .local v8, "$i$f$h1":I
    ushr-int/lit8 v8, v4, 0x7

    .line 1835
    .end local v8    # "$i$f$h1":I
    and-int/2addr v8, v7

    .line 1837
    .local v8, "probeOffset$iv":I
    const/4 v9, 0x0

    .line 1839
    .local v9, "probeIndex$iv":I
    :goto_1
    nop

    .line 1840
    iget-object v10, v2, Landroidx/collection/ScatterMap;->metadata:[J

    .local v10, "metadata$iv$iv":[J
    const/4 v11, 0x0

    .line 1841
    .local v11, "$i$f$group":I
    shr-int/lit8 v12, v8, 0x3

    .line 1842
    .local v12, "i$iv$iv":I
    and-int/lit8 v13, v8, 0x7

    shl-int/lit8 v13, v13, 0x3

    .line 1843
    .local v13, "b$iv$iv":I
    aget-wide v14, v10, v12

    ushr-long/2addr v14, v13

    add-int/lit8 v16, v12, 0x1

    aget-wide v16, v10, v16

    rsub-int/lit8 v18, v13, 0x40

    shl-long v16, v16, v18

    move/from16 v19, v6

    const/16 v18, 0x0

    .end local v6    # "hash2$iv":I
    .local v19, "hash2$iv":I
    int-to-long v5, v13

    neg-long v5, v5

    const/16 v20, 0x3f

    shr-long v5, v5, v20

    and-long v5, v16, v5

    or-long/2addr v5, v14

    .line 1840
    .end local v10    # "metadata$iv$iv":[J
    .end local v11    # "$i$f$group":I
    .end local v12    # "i$iv$iv":I
    .end local v13    # "b$iv$iv":I
    nop

    .line 1844
    .local v5, "g$iv":J
    move-wide v10, v5

    .local v10, "$this$match$iv$iv":J
    const/4 v12, 0x0

    .line 1845
    .local v12, "$i$f$match":I
    move/from16 v13, v19

    .end local v19    # "hash2$iv":I
    .local v13, "hash2$iv":I
    int-to-long v14, v13

    const-wide v16, 0x101010101010101L

    mul-long v14, v14, v16

    xor-long/2addr v14, v10

    .line 1847
    .local v14, "x$iv$iv":J
    sub-long v16, v14, v16

    move/from16 v19, v3

    move/from16 v20, v4

    .end local v3    # "$i$f$findKeyIndex$collection":I
    .end local v4    # "hash$iv":I
    .local v19, "$i$f$findKeyIndex$collection":I
    .local v20, "hash$iv":I
    not-long v3, v14

    and-long v3, v16, v3

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v3, v3, v16

    .line 1844
    .end local v10    # "$this$match$iv$iv":J
    .end local v12    # "$i$f$match":I
    .end local v14    # "x$iv$iv":J
    nop

    .line 1848
    .local v3, "m$iv":J
    :goto_2
    move-wide v10, v3

    .local v10, "$this$hasNext$iv$iv":J
    const/4 v12, 0x0

    .line 1849
    .local v12, "$i$f$hasNext":I
    const-wide/16 v14, 0x0

    cmp-long v21, v10, v14

    const/16 v22, 0x1

    if-eqz v21, :cond_1

    move/from16 v10, v22

    goto :goto_3

    :cond_1
    move/from16 v10, v18

    .end local v10    # "$this$hasNext$iv$iv":J
    .end local v12    # "$i$f$hasNext":I
    :goto_3
    if-eqz v10, :cond_3

    .line 1850
    move-wide v10, v3

    .local v10, "$this$get$iv$iv":J
    const/4 v12, 0x0

    .line 1851
    .local v12, "$i$f$get":I
    move-wide v14, v10

    .local v14, "$this$lowestBitSet$iv$iv$iv":J
    const/16 v21, 0x0

    .line 1852
    .local v21, "$i$f$lowestBitSet":I
    invoke-static {v14, v15}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v23

    shr-int/lit8 v14, v23, 0x3

    .line 1851
    .end local v14    # "$this$lowestBitSet$iv$iv$iv":J
    .end local v21    # "$i$f$lowestBitSet":I
    nop

    .line 1850
    .end local v10    # "$this$get$iv$iv":J
    .end local v12    # "$i$f$get":I
    add-int/2addr v14, v8

    and-int v10, v14, v7

    .line 1853
    .local v10, "index$iv":I
    iget-object v11, v2, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    aget-object v11, v11, v10

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 1854
    goto :goto_4

    .line 1856
    :cond_2
    move-wide v11, v3

    .local v11, "$this$next$iv$iv":J
    const/4 v14, 0x0

    .line 1857
    .local v14, "$i$f$next":I
    const-wide/16 v21, 0x1

    sub-long v21, v11, v21

    and-long v11, v11, v21

    .line 1856
    .end local v11    # "$this$next$iv$iv":J
    .end local v14    # "$i$f$next":I
    move-wide v3, v11

    .end local v10    # "index$iv":I
    goto :goto_2

    .line 1858
    :cond_3
    move-wide v10, v5

    .local v10, "$this$maskEmpty$iv$iv":J
    const/4 v12, 0x0

    .line 1859
    .local v12, "$i$f$maskEmpty":I
    move-wide/from16 v23, v14

    not-long v14, v10

    const/16 v21, 0x6

    shl-long v14, v14, v21

    and-long/2addr v14, v10

    and-long v10, v14, v16

    .line 1858
    .end local v10    # "$this$maskEmpty$iv$iv":J
    .end local v12    # "$i$f$maskEmpty":I
    cmp-long v10, v10, v23

    if-eqz v10, :cond_5

    .line 1860
    nop

    .line 1867
    .end local v3    # "m$iv":J
    .end local v5    # "g$iv":J
    const/4 v10, -0x1

    .line 1673
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v7    # "probeMask$iv":I
    .end local v8    # "probeOffset$iv":I
    .end local v9    # "probeIndex$iv":I
    .end local v13    # "hash2$iv":I
    .end local v19    # "$i$f$findKeyIndex$collection":I
    .end local v20    # "hash$iv":I
    :goto_4
    nop

    .line 1674
    .local v10, "index":I
    if-ltz v10, :cond_4

    .line 1675
    iget-object v2, v0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v2, v10}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 1676
    return v22

    .line 1678
    :cond_4
    return v18

    .line 1863
    .end local v10    # "index":I
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v3    # "m$iv":J
    .restart local v5    # "g$iv":J
    .restart local v7    # "probeMask$iv":I
    .restart local v8    # "probeOffset$iv":I
    .restart local v9    # "probeIndex$iv":I
    .restart local v13    # "hash2$iv":I
    .restart local v19    # "$i$f$findKeyIndex$collection":I
    .restart local v20    # "hash$iv":I
    :cond_5
    add-int/lit8 v9, v9, 0x8

    .line 1864
    add-int v10, v8, v9

    and-int v8, v10, v7

    move v6, v13

    move/from16 v3, v19

    move/from16 v4, v20

    .end local v3    # "m$iv":J
    .end local v5    # "g$iv":J
    goto/16 :goto_1
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

    .line 1662
    const/4 v2, 0x0

    .line 1663
    .local v2, "changed":Z
    iget-object v3, v0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

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

    .line 1664
    .local v15, "$i$a$-forEachIndexed-MutableKeys$removeAll$1":I
    move/from16 v16, v11

    move-object v11, v1

    check-cast v11, Ljava/lang/Iterable;

    iget-object v1, v0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    iget-object v1, v1, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v1, v1, v14

    invoke-static {v11, v1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1665
    iget-object v1, v0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1, v14}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 1666
    const/4 v2, 0x1

    .line 1668
    :cond_1
    nop

    .line 1820
    .end local v14    # "index":I
    .end local v15    # "$i$a$-forEachIndexed-MutableKeys$removeAll$1":I
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

    .line 1669
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

    .line 1651
    const/4 v2, 0x0

    .line 1652
    .local v2, "changed":Z
    iget-object v3, v0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

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

    .line 1653
    .local v15, "$i$a$-forEachIndexed-MutableKeys$retainAll$1":I
    move/from16 v16, v11

    move-object v11, v1

    check-cast v11, Ljava/lang/Iterable;

    iget-object v1, v0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    iget-object v1, v1, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v1, v1, v14

    invoke-static {v11, v1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1654
    iget-object v1, v0, Landroidx/collection/MutableKeys;->parent:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1, v14}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 1655
    const/4 v2, 0x1

    .line 1657
    :cond_1
    nop

    .line 1800
    .end local v14    # "index":I
    .end local v15    # "$i$a$-forEachIndexed-MutableKeys$retainAll$1":I
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

    .line 1658
    .end local v3    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "m$iv":[J
    .end local v6    # "lastIndex$iv":I
    :cond_6
    return v2
.end method

.method public final bridge size()I
    .locals 1

    .line 1614
    invoke-virtual {p0}, Landroidx/collection/MutableKeys;->getSize()I

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
