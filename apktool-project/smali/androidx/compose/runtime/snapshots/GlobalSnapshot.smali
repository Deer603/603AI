.class public final Landroidx/compose/runtime/snapshots/GlobalSnapshot;
.super Landroidx/compose/runtime/snapshots/MutableSnapshot;
.source "Snapshot.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,2487:1\n193#2,14:2488\n193#2,14:2502\n1894#3,2:2516\n33#4,2:2518\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1490#1:2488,14\n1510#1:2502,14\n1544#1:2516,2\n1544#1:2518,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u0008\u0010\n\u001a\u00020\u000bH\u0016J\u0015\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0010\u00a2\u0006\u0002\u0008\u0010J\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0010\u00a2\u0006\u0002\u0008\u0012J\r\u0010\u0013\u001a\u00020\u000bH\u0010\u00a2\u0006\u0002\u0008\u0014J4\u0010\u0015\u001a\u00020\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00172\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017H\u0016J\u001e\u0010\u001a\u001a\u00020\u000f2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017H\u0016\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/GlobalSnapshot;",
        "Landroidx/compose/runtime/snapshots/MutableSnapshot;",
        "snapshotId",
        "",
        "Landroidx/compose/runtime/snapshots/SnapshotId;",
        "invalid",
        "Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
        "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V",
        "apply",
        "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;",
        "dispose",
        "",
        "nestedActivated",
        "",
        "snapshot",
        "Landroidx/compose/runtime/snapshots/Snapshot;",
        "nestedActivated$runtime_release",
        "nestedDeactivated",
        "nestedDeactivated$runtime_release",
        "notifyObjectsInitialized",
        "notifyObjectsInitialized$runtime_release",
        "takeNestedMutableSnapshot",
        "readObserver",
        "Lkotlin/Function1;",
        "",
        "writeObserver",
        "takeNestedSnapshot",
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


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V
    .locals 7
    .param p1, "snapshotId"    # J
    .param p3, "invalid"    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 1481
    nop

    .line 1482
    nop

    .line 1483
    nop

    .line 1484
    nop

    .line 1485
    sget-object v0, Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;->INSTANCE:Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1481
    const/4 v5, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    .end local p1    # "snapshotId":J
    .end local p3    # "invalid":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v2, "snapshotId":J
    .local v4, "invalid":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    invoke-direct/range {v1 .. v6}, Landroidx/compose/runtime/snapshots/MutableSnapshot;-><init>(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 1480
    return-void
.end method


# virtual methods
.method public apply()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1541
    const-string v1, "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public dispose()V
    .locals 4

    .line 1544
    const/4 v0, 0x0

    .line 2516
    .local v0, "$i$f$sync":I
    nop

    .line 2517
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v1

    .local v1, "lock$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 2518
    .local v2, "$i$f$synchronized":I
    nop

    .line 2519
    monitor-enter v1

    const/4 v3, 0x0

    .line 1544
    .local v3, "$i$a$-sync-GlobalSnapshot$dispose$1":I
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/GlobalSnapshot;->releasePinnedSnapshotLocked$runtime_release()V

    .end local v3    # "$i$a$-sync-GlobalSnapshot$dispose$1":I
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2519
    monitor-exit v1

    .line 2517
    .end local v1    # "lock$iv$iv":Ljava/lang/Object;
    .end local v2    # "$i$f$synchronized":I
    nop

    .line 1545
    .end local v0    # "$i$f$sync":I
    return-void

    .line 2519
    .restart local v0    # "$i$f$sync":I
    .restart local v1    # "lock$iv$iv":Ljava/lang/Object;
    .restart local v2    # "$i$f$synchronized":I
    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3
.end method

.method public nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;
    .locals 1
    .param p1, "snapshot"    # Landroidx/compose/runtime/snapshots/Snapshot;

    .line 1538
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateMapKt;->unsupported()Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public bridge synthetic nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 0
    .param p1, "snapshot"    # Landroidx/compose/runtime/snapshots/Snapshot;

    .line 1480
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/GlobalSnapshot;->nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;

    return-void
.end method

.method public nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;
    .locals 1
    .param p1, "snapshot"    # Landroidx/compose/runtime/snapshots/Snapshot;

    .line 1536
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateMapKt;->unsupported()Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public bridge synthetic nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 0
    .param p1, "snapshot"    # Landroidx/compose/runtime/snapshots/Snapshot;

    .line 1480
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/GlobalSnapshot;->nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;

    return-void
.end method

.method public notifyObjectsInitialized$runtime_release()V
    .locals 0

    .line 1533
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$advanceGlobalSnapshot()V

    .line 1534
    return-void
.end method

.method public takeNestedMutableSnapshot(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .locals 11
    .param p1, "readObserver"    # Lkotlin/jvm/functions/Function1;
    .param p2, "writeObserver"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/runtime/snapshots/MutableSnapshot;"
        }
    .end annotation

    .line 1511
    nop

    .line 1512
    nop

    .line 1510
    const/4 v0, 0x0

    .local v0, "readonly$iv":Z
    const/4 v1, 0x0

    .local v1, "parent$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    const/4 v2, 0x0

    .line 2502
    .local v2, "$i$f$creatingSnapshot":I
    const/4 v3, 0x0

    .line 2503
    .local v3, "observerMap$iv":Ljava/util/Map;
    invoke-static {}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->access$getObservers$p()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v4

    .line 2504
    .local v4, "observers$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    move-object v5, p1

    .line 2505
    .local v5, "actualReadObserver$iv":Lkotlin/jvm/functions/Function1;
    move-object v6, p2

    .line 2506
    .local v6, "actualWriteObserver$iv":Lkotlin/jvm/functions/Function1;
    if-eqz v4, :cond_0

    .line 2507
    invoke-static {v4, v1, v0, p1, p2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->mergeObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;

    move-result-object v7

    .line 2508
    .local v7, "result$iv":Lkotlin/Pair;
    invoke-virtual {v7}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;

    .line 2509
    .local v8, "mappedObservers$iv":Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    .line 2510
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getWriteObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    .line 2511
    invoke-virtual {v7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v9

    move-object v3, v9

    check-cast v3, Ljava/util/Map;

    .line 2513
    .end local v7    # "result$iv":Lkotlin/Pair;
    .end local v8    # "mappedObservers$iv":Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;
    :cond_0
    move-object v7, v5

    .local v7, "actualReadObserver":Lkotlin/jvm/functions/Function1;
    move-object v8, v6

    .local v8, "actualWriteObserver":Lkotlin/jvm/functions/Function1;
    const/4 v9, 0x0

    .line 1516
    .local v9, "$i$a$-creatingSnapshot-GlobalSnapshot$takeNestedMutableSnapshot$1":I
    new-instance v10, Landroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1$1;

    invoke-direct {v10, v7, v8}, Landroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$takeNewSnapshot(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v10

    check-cast v10, Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 1529
    nop

    .line 2513
    .end local v7    # "actualReadObserver":Lkotlin/jvm/functions/Function1;
    .end local v8    # "actualWriteObserver":Lkotlin/jvm/functions/Function1;
    .end local v9    # "$i$a$-creatingSnapshot-GlobalSnapshot$takeNestedMutableSnapshot$1":I
    move-object v7, v10

    check-cast v7, Landroidx/compose/runtime/snapshots/Snapshot;

    .line 2514
    .local v7, "result$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v4, :cond_1

    invoke-static {v4, v1, v7, v3}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->dispatchCreatedObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V

    .line 2515
    :cond_1
    nop

    .end local v0    # "readonly$iv":Z
    .end local v1    # "parent$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v2    # "$i$f$creatingSnapshot":I
    .end local v3    # "observerMap$iv":Ljava/util/Map;
    .end local v4    # "observers$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v5    # "actualReadObserver$iv":Lkotlin/jvm/functions/Function1;
    .end local v6    # "actualWriteObserver$iv":Lkotlin/jvm/functions/Function1;
    .end local v7    # "result$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    move-object v0, v7

    check-cast v0, Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 1530
    return-object v0
.end method

.method public takeNestedSnapshot(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;
    .locals 11
    .param p1, "readObserver"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/runtime/snapshots/Snapshot;"
        }
    .end annotation

    .line 1491
    nop

    .line 1494
    nop

    .line 1492
    nop

    .line 1490
    const/4 v0, 0x0

    move-object v1, v0

    .local v1, "parent$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    const/4 v2, 0x1

    .local v0, "writeObserver$iv":Lkotlin/jvm/functions/Function1;
    .local v2, "readonly$iv":Z
    const/4 v3, 0x0

    .line 2488
    .local v3, "$i$f$creatingSnapshot":I
    const/4 v4, 0x0

    .line 2489
    .local v4, "observerMap$iv":Ljava/util/Map;
    invoke-static {}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->access$getObservers$p()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v5

    .line 2490
    .local v5, "observers$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    move-object v6, p1

    .line 2491
    .local v6, "actualReadObserver$iv":Lkotlin/jvm/functions/Function1;
    move-object v7, v0

    .line 2492
    .local v7, "actualWriteObserver$iv":Lkotlin/jvm/functions/Function1;
    if-eqz v5, :cond_0

    .line 2493
    invoke-static {v5, v1, v2, p1, v0}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->mergeObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;

    move-result-object v8

    .line 2494
    .local v8, "result$iv":Lkotlin/Pair;
    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;

    .line 2495
    .local v9, "mappedObservers$iv":Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    .line 2496
    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getWriteObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v7

    .line 2497
    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v10

    move-object v4, v10

    check-cast v4, Ljava/util/Map;

    .line 2499
    .end local v8    # "result$iv":Lkotlin/Pair;
    .end local v9    # "mappedObservers$iv":Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;
    :cond_0
    move-object v8, v6

    .local v8, "actualReadObserver":Lkotlin/jvm/functions/Function1;
    const/4 v9, 0x0

    .line 1496
    .local v9, "$i$a$-creatingSnapshot-GlobalSnapshot$takeNestedSnapshot$1":I
    new-instance v10, Landroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1$1;

    invoke-direct {v10, v8}, Landroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$takeNewSnapshot(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v10

    check-cast v10, Landroidx/compose/runtime/snapshots/ReadonlySnapshot;

    .line 1502
    nop

    .line 2499
    .end local v8    # "actualReadObserver":Lkotlin/jvm/functions/Function1;
    .end local v9    # "$i$a$-creatingSnapshot-GlobalSnapshot$takeNestedSnapshot$1":I
    move-object v8, v10

    check-cast v8, Landroidx/compose/runtime/snapshots/Snapshot;

    .line 2500
    .local v8, "result$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v5, :cond_1

    invoke-static {v5, v1, v8, v4}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->dispatchCreatedObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V

    .line 2501
    :cond_1
    nop

    .line 1503
    .end local v0    # "writeObserver$iv":Lkotlin/jvm/functions/Function1;
    .end local v1    # "parent$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v2    # "readonly$iv":Z
    .end local v3    # "$i$f$creatingSnapshot":I
    .end local v4    # "observerMap$iv":Ljava/util/Map;
    .end local v5    # "observers$iv":Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;
    .end local v6    # "actualReadObserver$iv":Lkotlin/jvm/functions/Function1;
    .end local v7    # "actualWriteObserver$iv":Lkotlin/jvm/functions/Function1;
    .end local v8    # "result$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    return-object v8
.end method
