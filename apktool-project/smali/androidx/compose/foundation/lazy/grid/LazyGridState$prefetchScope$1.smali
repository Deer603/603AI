.class public final Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1;
.super Ljava/lang/Object;
.source "LazyGridState.kt"

# interfaces
.implements Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/grid/LazyGridState;-><init>(IILandroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,613:1\n602#2,6:614\n609#2:626\n34#3,6:620\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1\n*L\n277#1:614,6\n277#1:626\n286#1:620,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "androidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1",
        "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;",
        "scheduleLinePrefetch",
        "",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
        "lineIndex",
        "",
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


# instance fields
.field final synthetic this$0:Landroidx/compose/foundation/lazy/grid/LazyGridState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V
    .locals 0
    .param p1, "$receiver"    # Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1;->this$0:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public scheduleLinePrefetch(I)Ljava/util/List;
    .locals 23
    .param p1, "lineIndex"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
            ">;"
        }
    .end annotation

    .line 276
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 277
    .local v1, "prefetchHandles":Ljava/util/List;
    sget-object v2, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    move-object/from16 v3, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    iget-object v0, v3, Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchScope$1;->this$0:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    const/4 v4, 0x0

    .line 614
    .local v4, "$i$f$withoutReadObservation":I
    nop

    .line 615
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v5

    .line 616
    .local v5, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 617
    .local v6, "observer$iv":Lkotlin/jvm/functions/Function1;
    :goto_0
    invoke-virtual {v2, v5}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v7

    .line 618
    .local v7, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 619
    const/4 v8, 0x0

    .line 279
    .local v8, "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getHasLookaheadOccurred$foundation_release()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 280
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getApproachLayoutInfo$foundation_release()Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    move-result-object v9

    goto :goto_1

    .line 282
    :cond_1
    invoke-static {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->access$getLayoutInfoState$p(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Landroidx/compose/runtime/MutableState;

    move-result-object v9

    invoke-interface {v9}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    .line 279
    :goto_1
    nop

    .line 278
    nop

    .line 285
    .local v9, "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    if-eqz v9, :cond_3

    move-object v10, v9

    .local v10, "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    const/4 v11, 0x0

    .line 286
    .local v11, "$i$a$-let-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1$1":I
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;->getPrefetchInfoRetriever()Lkotlin/jvm/functions/Function1;

    move-result-object v12

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    .local v12, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v13, 0x0

    .line 620
    .local v13, "$i$f$fastForEach":I
    nop

    .line 621
    const/4 v14, 0x0

    .local v14, "index$iv":I
    move-object v15, v12

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15}, Ljava/util/Collection;->size()I

    move-result v15

    :goto_2
    if-ge v14, v15, :cond_2

    .line 622
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 623
    .local v16, "item$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    check-cast v17, Lkotlin/Pair;

    .local v17, "lineInfo":Lkotlin/Pair;
    const/16 v18, 0x0

    .line 287
    .local v18, "$i$a$-fastForEach-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1$1$1":I
    nop

    .line 288
    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Ljava/lang/Number;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual/range {v17 .. v17}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Landroidx/compose/ui/unit/Constraints;

    move/from16 v21, v8

    move-object/from16 v22, v9

    .end local v8    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .end local v9    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .local v21, "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .local v22, "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v8

    invoke-virtual {v0, v3, v8, v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;->schedulePrefetch-0kLqBqw(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    move-result-object v0

    .line 287
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    nop

    .line 623
    .end local v17    # "lineInfo":Lkotlin/Pair;
    .end local v18    # "$i$a$-fastForEach-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1$1$1":I
    nop

    .line 621
    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v3, p0

    move-object/from16 v0, v19

    move/from16 v8, v21

    move-object/from16 v9, v22

    goto :goto_2

    .end local v21    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .end local v22    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .restart local v8    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .restart local v9    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    :cond_2
    move/from16 v21, v8

    move-object/from16 v22, v9

    .line 625
    .end local v8    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .end local v9    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .end local v14    # "index$iv":I
    .restart local v21    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .restart local v22    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    nop

    .line 291
    .end local v12    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v13    # "$i$f$fastForEach":I
    nop

    .line 285
    .end local v10    # "it":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .end local v11    # "$i$a$-let-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .end local v21    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .end local v22    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .restart local v8    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .restart local v9    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    :cond_3
    move/from16 v21, v8

    move-object/from16 v22, v9

    .line 291
    .end local v8    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .end local v9    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .restart local v21    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .restart local v22    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    :goto_3
    nop

    .line 619
    .end local v21    # "$i$a$-withoutReadObservation-LazyGridState$prefetchScope$1$scheduleLinePrefetch$1":I
    .end local v22    # "layoutInfo":Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    nop

    .line 626
    invoke-virtual {v2, v5, v7, v6}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    .line 619
    nop

    .line 293
    .end local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v4    # "$i$f$withoutReadObservation":I
    .end local v5    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v6    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v7    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    return-object v1

    .line 626
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .restart local v4    # "$i$f$withoutReadObservation":I
    .restart local v5    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v6    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v7    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :catchall_0
    move-exception v0

    invoke-virtual {v2, v5, v7, v6}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    throw v0
.end method
