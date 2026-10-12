.class final Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Recomposer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/Recomposer$recompositionRunner$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/Object;",
        ">;",
        "Landroidx/compose/runtime/snapshots/Snapshot;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1791:1\n33#2,2:1792\n41#3,3:1794\n46#3:1822\n48#3:1825\n231#4,3:1797\n200#4,7:1800\n211#4,3:1808\n214#4,2:1812\n217#4,6:1815\n234#4:1821\n1399#5:1807\n1270#5:1811\n54#6:1814\n1855#7,2:1823\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n1045#1:1792,2\n1048#1:1794,3\n1048#1:1822\n1048#1:1825\n1048#1:1797,3\n1048#1:1800,7\n1048#1:1808,3\n1048#1:1812,2\n1048#1:1815,6\n1048#1:1821\n1048#1:1807\n1048#1:1811\n1051#1:1814\n1048#1:1823,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "changed",
        "",
        "",
        "<anonymous parameter 1>",
        "Landroidx/compose/runtime/snapshots/Snapshot;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/runtime/Recomposer;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/Recomposer;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;->this$0:Landroidx/compose/runtime/Recomposer;

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 1044
    move-object v0, p1

    check-cast v0, Ljava/util/Set;

    move-object v1, p2

    check-cast v1, Landroidx/compose/runtime/snapshots/Snapshot;

    invoke-virtual {p0, v0, v1}, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;->invoke(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 29
    .param p1, "changed"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/runtime/snapshots/Snapshot;",
            ")V"
        }
    .end annotation

    .line 1062
    move-object/from16 v1, p0

    .line 1045
    iget-object v0, v1, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;->this$0:Landroidx/compose/runtime/Recomposer;

    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    move-result-object v2

    .local v2, "lock$iv":Ljava/lang/Object;
    iget-object v0, v1, Landroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1;->this$0:Landroidx/compose/runtime/Recomposer;

    const/4 v3, 0x0

    .line 1792
    .local v3, "$i$f$synchronized":I
    nop

    .line 1793
    monitor-enter v2

    const/4 v4, 0x0

    .line 1046
    .local v4, "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    :try_start_0
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$get_state$p(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v5

    invoke-interface {v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/runtime/Recomposer$State;

    sget-object v6, Landroidx/compose/runtime/Recomposer$State;->Idle:Landroidx/compose/runtime/Recomposer$State;

    check-cast v6, Ljava/lang/Enum;

    invoke-virtual {v5, v6}, Landroidx/compose/runtime/Recomposer$State;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-ltz v5, :cond_c

    .line 1047
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getSnapshotInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/collection/MutableScatterSet;

    move-result-object v5

    .line 1048
    .local v5, "snapshotInvalidations":Landroidx/collection/MutableScatterSet;
    move-object/from16 v6, p1

    .local v6, "$this$fastForEach$iv":Ljava/util/Set;
    const/4 v7, 0x0

    .line 1794
    .local v7, "$i$f$fastForEach":I
    nop

    .line 1795
    instance-of v8, v6, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    if-eqz v8, :cond_9

    .line 1796
    move-object v8, v6

    check-cast v8, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    invoke-virtual {v8}, Landroidx/compose/runtime/collection/ScatterSetWrapper;->getSet$runtime_release()Landroidx/collection/ScatterSet;

    move-result-object v8

    .local v8, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v10, 0x0

    .line 1797
    .local v10, "$i$f$forEach":I
    nop

    .line 1798
    iget-object v11, v8, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1799
    .local v11, "elements$iv$iv":[Ljava/lang/Object;
    move-object v12, v8

    .local v12, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v13, 0x0

    .line 1800
    .local v13, "$i$f$forEachIndex":I
    nop

    .line 1801
    iget-object v14, v12, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1802
    .local v14, "m$iv$iv$iv":[J
    array-length v15, v14

    add-int/lit8 v15, v15, -0x2

    .line 1804
    .local v15, "lastIndex$iv$iv$iv":I
    const/16 p2, 0x1

    const/4 v9, 0x0

    .local v9, "i$iv$iv$iv":I
    if-gt v9, v15, :cond_6

    .line 1805
    :goto_0
    aget-wide v16, v14, v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1806
    .local v16, "slot$iv$iv$iv":J
    move-wide/from16 v18, v16

    .local v18, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v20, 0x0

    .line 1807
    .local v20, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v21, v0

    move-wide/from16 v0, v18

    move/from16 v18, v3

    move/from16 v19, v4

    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    .local v0, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v18, "$i$f$synchronized":I
    .local v19, "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    not-long v3, v0

    const/16 v22, 0x7

    shl-long v3, v3, v22

    and-long/2addr v3, v0

    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v3, v22

    .line 1806
    .end local v0    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v20    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v22

    if-eqz v0, :cond_5

    .line 1808
    sub-int v0, v9, v15

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 1809
    .local v0, "bitCount$iv$iv$iv":I
    const/4 v3, 0x0

    .local v3, "j$iv$iv$iv":I
    :goto_1
    if-ge v3, v0, :cond_4

    .line 1810
    const-wide/16 v22, 0xff

    and-long v22, v16, v22

    .local v22, "value$iv$iv$iv$iv":J
    const/4 v4, 0x0

    .line 1811
    .local v4, "$i$f$isFull":I
    const-wide/16 v24, 0x80

    cmp-long v20, v22, v24

    if-gez v20, :cond_0

    move/from16 v20, p2

    goto :goto_2

    :cond_0
    const/16 v20, 0x0

    .line 1810
    .end local v4    # "$i$f$isFull":I
    .end local v22    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v20, :cond_3

    .line 1812
    shl-int/lit8 v4, v9, 0x3

    add-int/2addr v4, v3

    .line 1813
    .local v4, "index$iv$iv$iv":I
    move/from16 v20, v4

    .local v20, "index$iv$iv":I
    const/16 v22, 0x0

    .line 1799
    .local v22, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    :try_start_1
    aget-object v23, v11, v20

    move-object/from16 v24, v23

    .local v24, "it":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 1049
    .local v23, "$i$a$-fastForEach-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1$1":I
    nop

    .line 1050
    move/from16 v25, v1

    move-object/from16 v1, v24

    move/from16 v24, v3

    .end local v3    # "j$iv$iv$iv":I
    .local v1, "it":Ljava/lang/Object;
    .local v24, "j$iv$iv$iv":I
    instance-of v3, v1, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v3, :cond_1

    .line 1051
    move-object v3, v1

    check-cast v3, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    sget-object v26, Landroidx/compose/runtime/snapshots/ReaderKind;->Companion:Landroidx/compose/runtime/snapshots/ReaderKind$Companion;

    .local v26, "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    const/16 v27, 0x0

    .line 1814
    .local v27, "$i$f$getComposition-6f8NoZ8":I
    move/from16 v28, v4

    .end local v4    # "index$iv$iv$iv":I
    .local v28, "index$iv$iv$iv":I
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v4

    .line 1051
    .end local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    .end local v27    # "$i$f$getComposition-6f8NoZ8":I
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->isReadIn-h_f27i8$runtime_release(I)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1055
    goto :goto_3

    .line 1050
    .end local v28    # "index$iv$iv$iv":I
    .restart local v4    # "index$iv$iv$iv":I
    :cond_1
    move/from16 v28, v4

    .line 1057
    .end local v4    # "index$iv$iv$iv":I
    .restart local v28    # "index$iv$iv$iv":I
    :cond_2
    invoke-virtual {v5, v1}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 1058
    nop

    .line 1799
    .end local v1    # "it":Ljava/lang/Object;
    .end local v23    # "$i$a$-fastForEach-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1$1":I
    :goto_3
    nop

    .line 1813
    .end local v20    # "index$iv$iv":I
    .end local v22    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_4

    .line 1810
    .end local v24    # "j$iv$iv$iv":I
    .end local v28    # "index$iv$iv$iv":I
    .restart local v3    # "j$iv$iv$iv":I
    :cond_3
    move/from16 v25, v1

    move/from16 v24, v3

    .line 1815
    .end local v3    # "j$iv$iv$iv":I
    .restart local v24    # "j$iv$iv$iv":I
    :goto_4
    shr-long v16, v16, v25

    .line 1809
    add-int/lit8 v3, v24, 0x1

    move/from16 v1, v25

    .end local v24    # "j$iv$iv$iv":I
    .restart local v3    # "j$iv$iv$iv":I
    goto :goto_1

    :cond_4
    move/from16 v25, v1

    move/from16 v24, v3

    .line 1817
    .end local v3    # "j$iv$iv$iv":I
    if-ne v0, v1, :cond_8

    .line 1804
    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v16    # "slot$iv$iv$iv":J
    :cond_5
    if-eq v9, v15, :cond_7

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p0

    move/from16 v3, v18

    move/from16 v4, v19

    move-object/from16 v0, v21

    goto/16 :goto_0

    .end local v18    # "$i$f$synchronized":I
    .end local v19    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    .local v3, "$i$f$synchronized":I
    .local v4, "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    :cond_6
    move-object/from16 v21, v0

    move/from16 v18, v3

    move/from16 v19, v4

    .line 1820
    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    .end local v9    # "i$iv$iv$iv":I
    .restart local v18    # "$i$f$synchronized":I
    .restart local v19    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    :cond_7
    nop

    .line 1821
    .end local v12    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v13    # "$i$f$forEachIndex":I
    .end local v14    # "m$iv$iv$iv":[J
    .end local v15    # "lastIndex$iv$iv$iv":I
    :cond_8
    nop

    .end local v8    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v10    # "$i$f$forEach":I
    .end local v11    # "elements$iv$iv":[Ljava/lang/Object;
    goto :goto_7

    .line 1822
    .end local v18    # "$i$f$synchronized":I
    .end local v19    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    .restart local v3    # "$i$f$synchronized":I
    .restart local v4    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    :cond_9
    move-object/from16 v21, v0

    move/from16 v18, v3

    move/from16 v19, v4

    const/16 p2, 0x1

    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    .restart local v18    # "$i$f$synchronized":I
    .restart local v19    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 1823
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv$iv":Ljava/lang/Object;
    move-object v8, v4

    .local v8, "it":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 1049
    .local v9, "$i$a$-fastForEach-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1$1":I
    nop

    .line 1050
    instance-of v10, v8, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v10, :cond_a

    .line 1051
    move-object v10, v8

    check-cast v10, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    sget-object v11, Landroidx/compose/runtime/snapshots/ReaderKind;->Companion:Landroidx/compose/runtime/snapshots/ReaderKind$Companion;

    .local v11, "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    const/4 v12, 0x0

    .line 1814
    .local v12, "$i$f$getComposition-6f8NoZ8":I
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v13

    .line 1051
    .end local v11    # "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    .end local v12    # "$i$f$getComposition-6f8NoZ8":I
    invoke-virtual {v10, v13}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->isReadIn-h_f27i8$runtime_release(I)Z

    move-result v10

    if-nez v10, :cond_a

    .line 1055
    goto :goto_6

    .line 1057
    :cond_a
    invoke-virtual {v5, v8}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 1058
    nop

    .line 1823
    .end local v8    # "it":Ljava/lang/Object;
    .end local v9    # "$i$a$-fastForEach-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1$1":I
    :goto_6
    nop

    .end local v4    # "element$iv$iv":Ljava/lang/Object;
    goto :goto_5

    .line 1824
    :cond_b
    nop

    .line 1825
    .end local v0    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    :goto_7
    nop

    .line 1059
    .end local v6    # "$this$fastForEach$iv":Ljava/util/Set;
    .end local v7    # "$i$f$fastForEach":I
    invoke-static/range {v21 .. v21}, Landroidx/compose/runtime/Recomposer;->access$deriveStateLocked(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v5    # "snapshotInvalidations":Landroidx/collection/MutableScatterSet;
    goto :goto_8

    .line 1793
    .end local v19    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    :catchall_0
    move-exception v0

    goto :goto_9

    .line 1060
    .end local v18    # "$i$f$synchronized":I
    .restart local v3    # "$i$f$synchronized":I
    .local v4, "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    :cond_c
    move/from16 v18, v3

    move/from16 v19, v4

    .end local v3    # "$i$f$synchronized":I
    .end local v4    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    .restart local v18    # "$i$f$synchronized":I
    .restart local v19    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    const/4 v0, 0x0

    .line 1793
    .end local v19    # "$i$a$-synchronized-Recomposer$recompositionRunner$2$unregisterApplyObserver$1$1":I
    :goto_8
    monitor-exit v2

    .line 1045
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v18    # "$i$f$synchronized":I
    nop

    .line 1062
    if-eqz v0, :cond_d

    .line 1045
    check-cast v0, Lkotlin/coroutines/Continuation;

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1062
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    .line 1063
    :cond_d
    return-void

    .line 1793
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v3    # "$i$f$synchronized":I
    :catchall_1
    move-exception v0

    move/from16 v18, v3

    .end local v3    # "$i$f$synchronized":I
    .restart local v18    # "$i$f$synchronized":I
    :goto_9
    monitor-exit v2

    throw v0
.end method
