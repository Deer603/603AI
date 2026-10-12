.class final Landroidx/compose/runtime/NestedContentMap;
.super Ljava/lang/Object;
.source "Recomposer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1791:1\n1#2:1792\n118#3,4:1793\n123#3,4:1803\n287#4,6:1797\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n*L\n1780#1:1793,4\n1780#1:1803,4\n1780#1:1797,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u000e\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0019\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0086\u0002J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005R*\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u0004X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u0007R*\u0010\u0008\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/runtime/NestedContentMap;",
        "",
        "()V",
        "containerMap",
        "Landroidx/compose/runtime/collection/MultiValueMap;",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "Landroidx/compose/runtime/MovableContent;",
        "Landroidx/collection/MutableScatterMap;",
        "contentMap",
        "Landroidx/compose/runtime/NestedMovableContent;",
        "add",
        "",
        "content",
        "nestedContent",
        "clear",
        "contains",
        "",
        "key",
        "removeLast",
        "usedContainer",
        "reference",
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
.field private final containerMap:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final contentMap:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1759
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1761
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Landroidx/compose/runtime/collection/MultiValueMap;->constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/runtime/NestedContentMap;->contentMap:Landroidx/collection/MutableScatterMap;

    .line 1762
    invoke-static {v0, v1, v0}, Landroidx/compose/runtime/collection/MultiValueMap;->constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/NestedContentMap;->containerMap:Landroidx/collection/MutableScatterMap;

    .line 1760
    return-void
.end method


# virtual methods
.method public final add(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/NestedMovableContent;)V
    .locals 2
    .param p1, "content"    # Landroidx/compose/runtime/MovableContent;
    .param p2, "nestedContent"    # Landroidx/compose/runtime/NestedMovableContent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MovableContent<",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/NestedMovableContent;",
            ")V"
        }
    .end annotation

    .line 1765
    iget-object v0, p0, Landroidx/compose/runtime/NestedContentMap;->contentMap:Landroidx/collection/MutableScatterMap;

    invoke-static {v0, p1, p2}, Landroidx/compose/runtime/collection/MultiValueMap;->add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1766
    iget-object v0, p0, Landroidx/compose/runtime/NestedContentMap;->containerMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {p2}, Landroidx/compose/runtime/NestedMovableContent;->getContainer()Landroidx/compose/runtime/MovableContentStateReference;

    move-result-object v1

    invoke-static {v0, v1, p1}, Landroidx/compose/runtime/collection/MultiValueMap;->add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1767
    return-void
.end method

.method public final clear()V
    .locals 1

    .line 1770
    iget-object v0, p0, Landroidx/compose/runtime/NestedContentMap;->contentMap:Landroidx/collection/MutableScatterMap;

    invoke-static {v0}, Landroidx/compose/runtime/collection/MultiValueMap;->clear-impl(Landroidx/collection/MutableScatterMap;)V

    .line 1771
    iget-object v0, p0, Landroidx/compose/runtime/NestedContentMap;->containerMap:Landroidx/collection/MutableScatterMap;

    invoke-static {v0}, Landroidx/compose/runtime/collection/MultiValueMap;->clear-impl(Landroidx/collection/MutableScatterMap;)V

    .line 1772
    return-void
.end method

.method public final contains(Landroidx/compose/runtime/MovableContent;)Z
    .locals 1
    .param p1, "key"    # Landroidx/compose/runtime/MovableContent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MovableContent<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1777
    iget-object v0, p0, Landroidx/compose/runtime/NestedContentMap;->contentMap:Landroidx/collection/MutableScatterMap;

    invoke-static {v0, p1}, Landroidx/compose/runtime/collection/MultiValueMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final removeLast(Landroidx/compose/runtime/MovableContent;)Landroidx/compose/runtime/NestedMovableContent;
    .locals 4
    .param p1, "key"    # Landroidx/compose/runtime/MovableContent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MovableContent<",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/compose/runtime/NestedMovableContent;"
        }
    .end annotation

    .line 1775
    iget-object v0, p0, Landroidx/compose/runtime/NestedContentMap;->contentMap:Landroidx/collection/MutableScatterMap;

    invoke-static {v0, p1}, Landroidx/compose/runtime/collection/MultiValueMap;->removeLast-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/compose/runtime/NestedMovableContent;

    .line 1792
    .local v1, "it":Landroidx/compose/runtime/NestedMovableContent;
    const/4 v2, 0x0

    .line 1775
    .local v2, "$i$a$-also-NestedContentMap$removeLast$1":I
    iget-object v3, p0, Landroidx/compose/runtime/NestedContentMap;->contentMap:Landroidx/collection/MutableScatterMap;

    invoke-static {v3}, Landroidx/compose/runtime/collection/MultiValueMap;->isEmpty-impl(Landroidx/collection/MutableScatterMap;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Landroidx/compose/runtime/NestedContentMap;->containerMap:Landroidx/collection/MutableScatterMap;

    invoke-static {v3}, Landroidx/compose/runtime/collection/MultiValueMap;->clear-impl(Landroidx/collection/MutableScatterMap;)V

    .end local v1    # "it":Landroidx/compose/runtime/NestedMovableContent;
    .end local v2    # "$i$a$-also-NestedContentMap$removeLast$1":I
    :cond_0
    check-cast v0, Landroidx/compose/runtime/NestedMovableContent;

    return-object v0
.end method

.method public final usedContainer(Landroidx/compose/runtime/MovableContentStateReference;)V
    .locals 18
    .param p1, "reference"    # Landroidx/compose/runtime/MovableContentStateReference;

    .line 1780
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/runtime/NestedContentMap;->containerMap:Landroidx/collection/MutableScatterMap;

    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    const/4 v3, 0x0

    .line 1793
    .local v3, "$i$f$forEachValue-impl":I
    invoke-virtual {v2, v1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    .local v4, "it$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 1794
    .local v5, "$i$a$-let-MultiValueMap$forEachValue$1$iv":I
    nop

    .line 1795
    instance-of v6, v4, Landroidx/collection/MutableObjectList;

    const-string/jumbo v7, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"

    if-eqz v6, :cond_1

    .line 1796
    move-object v6, v4

    check-cast v6, Landroidx/collection/ObjectList;

    .local v6, "this_$iv$iv":Landroidx/collection/ObjectList;
    const/4 v8, 0x0

    .line 1797
    .local v8, "$i$f$forEach":I
    nop

    .line 1798
    iget-object v9, v6, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 1799
    .local v9, "content$iv$iv":[Ljava/lang/Object;
    const/4 v10, 0x0

    .local v10, "i$iv$iv":I
    iget v11, v6, Landroidx/collection/ObjectList;->_size:I

    :goto_0
    if-ge v10, v11, :cond_0

    .line 1800
    aget-object v12, v9, v10

    .local v12, "value$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1796
    .local v13, "$i$a$-forEach-MultiValueMap$forEachValue$1$1$iv":I
    invoke-static {v12, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v14, v12

    check-cast v14, Landroidx/compose/runtime/MovableContent;

    .local v14, "value":Landroidx/compose/runtime/MovableContent;
    const/4 v15, 0x0

    .line 1781
    .local v15, "$i$a$-forEachValue-impl-NestedContentMap$usedContainer$1":I
    move-object/from16 v16, v2

    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v16, "arg0$iv":Landroidx/collection/MutableScatterMap;
    iget-object v2, v0, Landroidx/compose/runtime/NestedContentMap;->contentMap:Landroidx/collection/MutableScatterMap;

    move/from16 v17, v3

    .end local v3    # "$i$f$forEachValue-impl":I
    .local v17, "$i$f$forEachValue-impl":I
    new-instance v3, Landroidx/compose/runtime/NestedContentMap$usedContainer$1$1;

    invoke-direct {v3, v1}, Landroidx/compose/runtime/NestedContentMap$usedContainer$1$1;-><init>(Landroidx/compose/runtime/MovableContentStateReference;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v14, v3}, Landroidx/compose/runtime/collection/MultiValueMap;->removeValueIf-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 1782
    nop

    .line 1796
    .end local v14    # "value":Landroidx/compose/runtime/MovableContent;
    .end local v15    # "$i$a$-forEachValue-impl-NestedContentMap$usedContainer$1":I
    nop

    .line 1800
    .end local v12    # "value$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-forEach-MultiValueMap$forEachValue$1$1$iv":I
    nop

    .line 1799
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v16

    move/from16 v3, v17

    goto :goto_0

    .end local v16    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v17    # "$i$f$forEachValue-impl":I
    .restart local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v3    # "$i$f$forEachValue-impl":I
    :cond_0
    move-object/from16 v16, v2

    move/from16 v17, v3

    .line 1802
    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "$i$f$forEachValue-impl":I
    .end local v10    # "i$iv$iv":I
    .restart local v16    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v17    # "$i$f$forEachValue-impl":I
    nop

    .end local v6    # "this_$iv$iv":Landroidx/collection/ObjectList;
    .end local v8    # "$i$f$forEach":I
    .end local v9    # "content$iv$iv":[Ljava/lang/Object;
    goto :goto_1

    .line 1803
    .end local v16    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v17    # "$i$f$forEachValue-impl":I
    .restart local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v3    # "$i$f$forEachValue-impl":I
    :cond_1
    move-object/from16 v16, v2

    move/from16 v17, v3

    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "$i$f$forEachValue-impl":I
    .restart local v16    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v17    # "$i$f$forEachValue-impl":I
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v4

    check-cast v2, Landroidx/compose/runtime/MovableContent;

    .local v2, "value":Landroidx/compose/runtime/MovableContent;
    const/4 v3, 0x0

    .line 1781
    .local v3, "$i$a$-forEachValue-impl-NestedContentMap$usedContainer$1":I
    iget-object v6, v0, Landroidx/compose/runtime/NestedContentMap;->contentMap:Landroidx/collection/MutableScatterMap;

    new-instance v7, Landroidx/compose/runtime/NestedContentMap$usedContainer$1$1;

    invoke-direct {v7, v1}, Landroidx/compose/runtime/NestedContentMap$usedContainer$1$1;-><init>(Landroidx/compose/runtime/MovableContentStateReference;)V

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v2, v7}, Landroidx/compose/runtime/collection/MultiValueMap;->removeValueIf-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 1782
    nop

    .line 1803
    .end local v2    # "value":Landroidx/compose/runtime/MovableContent;
    .end local v3    # "$i$a$-forEachValue-impl-NestedContentMap$usedContainer$1":I
    nop

    .line 1805
    :goto_1
    nop

    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-MultiValueMap$forEachValue$1$iv":I
    goto :goto_2

    .line 1793
    .end local v16    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v17    # "$i$f$forEachValue-impl":I
    .local v2, "arg0$iv":Landroidx/collection/MutableScatterMap;
    .local v3, "$i$f$forEachValue-impl":I
    :cond_2
    move-object/from16 v16, v2

    move/from16 v17, v3

    .end local v2    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v3    # "$i$f$forEachValue-impl":I
    .restart local v16    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .restart local v17    # "$i$f$forEachValue-impl":I
    :goto_2
    nop

    .line 1806
    nop

    .line 1783
    .end local v16    # "arg0$iv":Landroidx/collection/MutableScatterMap;
    .end local v17    # "$i$f$forEachValue-impl":I
    return-void
.end method
