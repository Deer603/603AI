.class public final Landroidx/compose/ui/tooling/ShadowViewInfo_androidKt;
.super Ljava/lang/Object;
.source "ShadowViewInfo.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,115:1\n1549#2:116\n1620#2,3:117\n1373#2:120\n1461#2,5:121\n1549#2:126\n1620#2,3:127\n766#2:130\n857#2,2:131\n1477#2:133\n1502#2,3:134\n1505#2,3:144\n1855#2,2:147\n1549#2:149\n1620#2,3:150\n372#3,7:137\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n*L\n75#1:116\n75#1:117,3\n81#1:120\n81#1:121,5\n82#1:126\n82#1:127,3\n83#1:130\n83#1:131,2\n84#1:133\n84#1:134,3\n84#1:144,3\n89#1:147,2\n111#1:149\n111#1:150,3\n84#1:137,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001c\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "stitchTrees",
        "",
        "Landroidx/compose/ui/tooling/ViewInfo;",
        "allViewInfoRoots",
        "ui-tooling_release"
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
.method public static final stitchTrees(Ljava/util/List;)Ljava/util/List;
    .locals 15
    .param p0, "allViewInfoRoots"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/tooling/ViewInfo;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/ui/tooling/ViewInfo;",
            ">;"
        }
    .end annotation

    .line 72
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    return-object p0

    .line 75
    :cond_0
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 116
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 117
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 118
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Landroidx/compose/ui/tooling/ViewInfo;

    .local v8, "it":Landroidx/compose/ui/tooling/ViewInfo;
    const/4 v9, 0x0

    .line 75
    .local v9, "$i$a$-map-ShadowViewInfo_androidKt$stitchTrees$shadowTreeRoots$1":I
    new-instance v10, Landroidx/compose/ui/tooling/ShadowViewInfo;

    invoke-direct {v10, v8}, Landroidx/compose/ui/tooling/ShadowViewInfo;-><init>(Landroidx/compose/ui/tooling/ViewInfo;)V

    .line 118
    .end local v8    # "it":Landroidx/compose/ui/tooling/ViewInfo;
    .end local v9    # "$i$a$-map-ShadowViewInfo_androidKt$stitchTrees$shadowTreeRoots$1":I
    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 119
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 116
    nop

    .line 75
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    nop

    .line 80
    .local v2, "shadowTreeRoots":Ljava/util/List;
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .line 81
    nop

    .local v0, "$this$flatMap$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 120
    .local v1, "$i$f$flatMapSequence":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 121
    .local v6, "$i$f$flatMapSequenceTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 122
    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/tooling/ShadowViewInfo;

    .local v9, "it":Landroidx/compose/ui/tooling/ShadowViewInfo;
    const/4 v10, 0x0

    .line 81
    .local v10, "$i$a$-flatMapSequence-ShadowViewInfo_androidKt$stitchTrees$shadowNodesWithLayoutInfo$1":I
    invoke-virtual {v9}, Landroidx/compose/ui/tooling/ShadowViewInfo;->getAllNodes()Lkotlin/sequences/Sequence;

    move-result-object v9

    .line 122
    .end local v9    # "it":Landroidx/compose/ui/tooling/ShadowViewInfo;
    .end local v10    # "$i$a$-flatMapSequence-ShadowViewInfo_androidKt$stitchTrees$shadowNodesWithLayoutInfo$1":I
    nop

    .line 123
    .local v9, "list$iv$iv":Lkotlin/sequences/Sequence;
    invoke-static {v4, v9}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Lkotlin/sequences/Sequence;)Z

    goto :goto_1

    .line 125
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    .end local v9    # "list$iv$iv":Lkotlin/sequences/Sequence;
    :cond_2
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$flatMapSequenceTo":I
    check-cast v4, Ljava/util/List;

    .line 120
    nop

    .end local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$flatMapSequence":I
    check-cast v4, Ljava/lang/Iterable;

    .line 82
    nop

    .local v4, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 126
    .local v0, "$i$f$map":I
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .local v1, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v4

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 127
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 128
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/tooling/ShadowViewInfo;

    .local v9, "it":Landroidx/compose/ui/tooling/ShadowViewInfo;
    const/4 v10, 0x0

    .line 82
    .local v10, "$i$a$-map-ShadowViewInfo_androidKt$stitchTrees$shadowNodesWithLayoutInfo$2":I
    invoke-virtual {v9}, Landroidx/compose/ui/tooling/ShadowViewInfo;->getLayoutInfo()Landroidx/compose/ui/layout/LayoutInfo;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    .line 128
    .end local v9    # "it":Landroidx/compose/ui/tooling/ShadowViewInfo;
    .end local v10    # "$i$a$-map-ShadowViewInfo_androidKt$stitchTrees$shadowNodesWithLayoutInfo$2":I
    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 129
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v1    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v1, Ljava/util/List;

    .line 126
    nop

    .end local v0    # "$i$f$map":I
    .end local v4    # "$this$map$iv":Ljava/lang/Iterable;
    check-cast v1, Ljava/lang/Iterable;

    .line 83
    nop

    .local v1, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 130
    .local v0, "$i$f$filter":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 131
    .local v6, "$i$f$filterTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lkotlin/Pair;

    .local v9, "it":Lkotlin/Pair;
    const/4 v10, 0x0

    .line 83
    .local v10, "$i$a$-filter-ShadowViewInfo_androidKt$stitchTrees$shadowNodesWithLayoutInfo$3":I
    invoke-virtual {v9}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_5

    const/4 v11, 0x1

    goto :goto_4

    :cond_5
    const/4 v11, 0x0

    .line 131
    .end local v9    # "it":Lkotlin/Pair;
    .end local v10    # "$i$a$-filter-ShadowViewInfo_androidKt$stitchTrees$shadowNodesWithLayoutInfo$3":I
    :goto_4
    if-eqz v11, :cond_4

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 132
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    :cond_6
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filterTo":I
    check-cast v4, Ljava/util/List;

    .line 130
    nop

    .end local v0    # "$i$f$filter":I
    .end local v1    # "$this$filter$iv":Ljava/lang/Iterable;
    check-cast v4, Ljava/lang/Iterable;

    .line 84
    nop

    .local v4, "$this$groupBy$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 133
    .local v0, "$i$f$groupBy":I
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .local v1, "destination$iv$iv":Ljava/util/Map;
    move-object v5, v4

    .local v5, "$this$groupByTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 134
    .local v6, "$i$f$groupByTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 135
    .restart local v8    # "element$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lkotlin/Pair;

    .restart local v9    # "it":Lkotlin/Pair;
    const/4 v10, 0x0

    .line 84
    .local v10, "$i$a$-groupBy-ShadowViewInfo_androidKt$stitchTrees$shadowNodesWithLayoutInfo$4":I
    invoke-virtual {v9}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/ui/layout/LayoutInfo;

    .line 135
    .end local v9    # "it":Lkotlin/Pair;
    .end local v10    # "$i$a$-groupBy-ShadowViewInfo_androidKt$stitchTrees$shadowNodesWithLayoutInfo$4":I
    nop

    .line 136
    .local v11, "key$iv$iv":Ljava/lang/Object;
    move-object v9, v1

    .local v9, "$this$getOrPut$iv$iv$iv":Ljava/util/Map;
    const/4 v10, 0x0

    .line 137
    .local v10, "$i$f$getOrPut":I
    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .line 138
    .local v12, "value$iv$iv$iv":Ljava/lang/Object;
    if-nez v12, :cond_7

    .line 139
    const/4 v13, 0x0

    .line 136
    .local v13, "$i$a$-getOrPut-CollectionsKt___CollectionsKt$groupByTo$list$1$iv$iv":I
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    check-cast v14, Ljava/util/List;

    .line 139
    .end local v13    # "$i$a$-getOrPut-CollectionsKt___CollectionsKt$groupByTo$list$1$iv$iv":I
    nop

    .line 140
    .local v14, "answer$iv$iv$iv":Ljava/lang/Object;
    invoke-interface {v9, v11, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    nop

    .end local v14    # "answer$iv$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 143
    :cond_7
    move-object v14, v12

    .line 138
    :goto_6
    nop

    .line 136
    .end local v9    # "$this$getOrPut$iv$iv$iv":Ljava/util/Map;
    .end local v10    # "$i$f$getOrPut":I
    .end local v12    # "value$iv$iv$iv":Ljava/lang/Object;
    move-object v9, v14

    check-cast v9, Ljava/util/List;

    .line 144
    .local v9, "list$iv$iv":Ljava/util/List;
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 146
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    .end local v9    # "list$iv$iv":Ljava/util/List;
    .end local v11    # "key$iv$iv":Ljava/lang/Object;
    :cond_8
    nop

    .line 133
    .end local v1    # "destination$iv$iv":Ljava/util/Map;
    .end local v5    # "$this$groupByTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$groupByTo":I
    nop

    .line 84
    .end local v0    # "$i$f$groupBy":I
    .end local v4    # "$this$groupBy$iv":Ljava/lang/Iterable;
    nop

    .line 79
    nop

    .line 86
    .local v1, "shadowNodesWithLayoutInfo":Ljava/util/Map;
    new-instance v0, Ljava/util/LinkedHashSet;

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-direct {v0, v4}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 89
    .local v0, "currentRoots":Ljava/util/LinkedHashSet;
    move-object v4, v2

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 147
    .local v5, "$i$f$forEach":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Landroidx/compose/ui/tooling/ShadowViewInfo;

    .local v8, "rootToAttach":Landroidx/compose/ui/tooling/ShadowViewInfo;
    const/4 v9, 0x0

    .line 104
    .local v9, "$i$a$-forEach-ShadowViewInfo_androidKt$stitchTrees$1":I
    nop

    .line 90
    nop

    .line 94
    invoke-virtual {v8}, Landroidx/compose/ui/tooling/ShadowViewInfo;->getAllNodes()Lkotlin/sequences/Sequence;

    move-result-object v10

    .line 95
    new-instance v11, Landroidx/compose/ui/tooling/ShadowViewInfo_androidKt$stitchTrees$1$1;

    invoke-direct {v11, v1}, Landroidx/compose/ui/tooling/ShadowViewInfo_androidKt$stitchTrees$1$1;-><init>(Ljava/util/Map;)V

    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v11}, Lkotlin/sequences/SequencesKt;->flatMapIterable(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v10

    .line 98
    new-instance v11, Landroidx/compose/ui/tooling/ShadowViewInfo_androidKt$stitchTrees$1$2;

    invoke-direct {v11, v8}, Landroidx/compose/ui/tooling/ShadowViewInfo_androidKt$stitchTrees$1$2;-><init>(Landroidx/compose/ui/tooling/ShadowViewInfo;)V

    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v11}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v10

    .line 102
    sget-object v11, Landroidx/compose/ui/tooling/ShadowViewInfo_androidKt$stitchTrees$1$3;->INSTANCE:Landroidx/compose/ui/tooling/ShadowViewInfo_androidKt$stitchTrees$1$3;

    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v11}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v10

    .line 103
    invoke-static {v10}, Lkotlin/sequences/SequencesKt;->firstOrNull(Lkotlin/sequences/Sequence;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/ui/tooling/ShadowViewInfo;

    .line 104
    if-eqz v10, :cond_9

    .line 103
    nop

    .line 104
    nop

    .local v10, "nodeToAttachTo":Landroidx/compose/ui/tooling/ShadowViewInfo;
    const/4 v11, 0x0

    .line 106
    .local v11, "$i$a$-let-ShadowViewInfo_androidKt$stitchTrees$1$4":I
    invoke-virtual {v8, v10}, Landroidx/compose/ui/tooling/ShadowViewInfo;->setNewParent(Landroidx/compose/ui/tooling/ShadowViewInfo;)V

    .line 107
    invoke-virtual {v0, v8}, Ljava/util/LinkedHashSet;->remove(Ljava/lang/Object;)Z

    .line 108
    nop

    .line 104
    .end local v10    # "nodeToAttachTo":Landroidx/compose/ui/tooling/ShadowViewInfo;
    .end local v11    # "$i$a$-let-ShadowViewInfo_androidKt$stitchTrees$1$4":I
    :cond_9
    nop

    .line 109
    nop

    .line 147
    .end local v8    # "rootToAttach":Landroidx/compose/ui/tooling/ShadowViewInfo;
    .end local v9    # "$i$a$-forEach-ShadowViewInfo_androidKt$stitchTrees$1":I
    nop

    .end local v7    # "element$iv":Ljava/lang/Object;
    goto :goto_7

    .line 148
    :cond_a
    nop

    .line 111
    .end local v4    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEach":I
    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 149
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v6

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v4

    .local v6, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 150
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 151
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Landroidx/compose/ui/tooling/ShadowViewInfo;

    .local v10, "it":Landroidx/compose/ui/tooling/ShadowViewInfo;
    const/4 v11, 0x0

    .line 111
    .local v11, "$i$a$-map-ShadowViewInfo_androidKt$stitchTrees$newTree$1":I
    invoke-virtual {v10}, Landroidx/compose/ui/tooling/ShadowViewInfo;->toViewInfo()Landroidx/compose/ui/tooling/ViewInfo;

    move-result-object v10

    .line 151
    .end local v10    # "it":Landroidx/compose/ui/tooling/ShadowViewInfo;
    .end local v11    # "$i$a$-map-ShadowViewInfo_androidKt$stitchTrees$newTree$1":I
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 152
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    :cond_b
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v3, Ljava/util/List;

    .line 149
    nop

    .line 111
    .end local v4    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$map":I
    nop

    .line 113
    .local v3, "newTree":Ljava/util/List;
    return-object v3
.end method
