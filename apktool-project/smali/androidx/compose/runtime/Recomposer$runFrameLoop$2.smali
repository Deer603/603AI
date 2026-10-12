.class final Landroidx/compose/runtime/Recomposer$runFrameLoop$2;
.super Lkotlin/jvm/internal/Lambda;
.source "Recomposer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/Recomposer;->runFrameLoop(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lkotlinx/coroutines/CancellableContinuation<",
        "-",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1791:1\n45#2,5:1792\n45#2,3:1797\n49#2:1831\n33#3,2:1800\n33#3,2:1829\n33#4,6:1802\n33#4,4:1817\n38#4:1822\n33#4,6:1823\n423#5,9:1808\n1#6:1821\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n953#1:1792,5\n963#1:1797,3\n963#1:1831\n968#1:1800,2\n997#1:1829,2\n969#1:1802,6\n979#1:1817,4\n979#1:1822\n992#1:1823,6\n971#1:1808,9\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "Lkotlinx/coroutines/CancellableContinuation;",
        "",
        "frameTime",
        "",
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
.field final synthetic $frameSignal:Landroidx/compose/runtime/ProduceFrameSignal;

.field final synthetic $toApply:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $toRecompose:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/runtime/Recomposer;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ProduceFrameSignal;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Recomposer;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Landroidx/compose/runtime/ProduceFrameSignal;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->this$0:Landroidx/compose/runtime/Recomposer;

    iput-object p2, p0, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->$toRecompose:Ljava/util/List;

    iput-object p3, p0, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->$toApply:Ljava/util/List;

    iput-object p4, p0, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->$frameSignal:Landroidx/compose/runtime/ProduceFrameSignal;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;

    .line 949
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->invoke(J)Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(J)Lkotlinx/coroutines/CancellableContinuation;
    .locals 22
    .param p1, "frameTime"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lkotlinx/coroutines/CancellableContinuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 952
    move-object/from16 v1, p0

    iget-object v0, v1, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->this$0:Landroidx/compose/runtime/Recomposer;

    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getHasBroadcastFrameClockAwaiters(Landroidx/compose/runtime/Recomposer;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 953
    const-string v2, "Recomposer:animation"

    .local v2, "sectionName$iv":Ljava/lang/String;
    iget-object v0, v1, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->this$0:Landroidx/compose/runtime/Recomposer;

    const/4 v3, 0x0

    .line 1792
    .local v3, "$i$f$trace":I
    sget-object v4, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v4, v2}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 1793
    .local v4, "token$iv":Ljava/lang/Object;
    nop

    .line 1794
    const/4 v5, 0x0

    .line 956
    .local v5, "$i$a$-trace-Recomposer$runFrameLoop$2$1":I
    :try_start_0
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getBroadcastFrameClock$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/BroadcastFrameClock;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-wide/from16 v6, p1

    :try_start_1
    invoke-virtual {v0, v6, v7}, Landroidx/compose/runtime/BroadcastFrameClock;->sendFrame(J)V

    .line 959
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->sendApplyNotifications()V

    .line 960
    nop

    .end local v5    # "$i$a$-trace-Recomposer$runFrameLoop$2$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1794
    nop

    .line 1796
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v4}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 1794
    goto :goto_1

    .line 1796
    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-wide/from16 v6, p1

    :goto_0
    sget-object v5, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v5, v4}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    throw v0

    .line 952
    .end local v2    # "sectionName$iv":Ljava/lang/String;
    .end local v3    # "$i$f$trace":I
    .end local v4    # "token$iv":Ljava/lang/Object;
    :cond_0
    move-wide/from16 v6, p1

    .line 963
    :goto_1
    const-string v2, "Recomposer:recompose"

    .restart local v2    # "sectionName$iv":Ljava/lang/String;
    iget-object v0, v1, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->this$0:Landroidx/compose/runtime/Recomposer;

    iget-object v3, v1, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->$toRecompose:Ljava/util/List;

    iget-object v4, v1, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->$toApply:Ljava/util/List;

    iget-object v5, v1, Landroidx/compose/runtime/Recomposer$runFrameLoop$2;->$frameSignal:Landroidx/compose/runtime/ProduceFrameSignal;

    const/4 v8, 0x0

    .line 1797
    .local v8, "$i$f$trace":I
    sget-object v9, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v9, v2}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    .line 1798
    .local v9, "token$iv":Ljava/lang/Object;
    nop

    .line 1799
    const/4 v10, 0x0

    .line 967
    .local v10, "$i$a$-trace-Recomposer$runFrameLoop$2$2":I
    :try_start_2
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$recordComposerModifications(Landroidx/compose/runtime/Recomposer;)Z

    .line 968
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    move-result-object v11

    .local v11, "lock$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1800
    .local v12, "$i$f$synchronized":I
    nop

    .line 1801
    monitor-enter v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_9

    const/4 v13, 0x0

    .line 969
    .local v13, "$i$a$-synchronized-Recomposer$runFrameLoop$2$2$1":I
    :try_start_3
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getCompositionsAwaitingApply$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    move-result-object v14

    .local v14, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v15, 0x0

    .line 1802
    .local v15, "$i$f$fastForEach":I
    nop

    .line 1803
    const/16 v16, 0x0

    .local v16, "index$iv":I
    move-object/from16 v17, v14

    check-cast v17, Ljava/util/Collection;

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->size()I

    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    move-object/from16 v17, v2

    move/from16 v2, v16

    .end local v16    # "index$iv":I
    .local v2, "index$iv":I
    .local v17, "sectionName$iv":Ljava/lang/String;
    :goto_2
    if-ge v2, v1, :cond_1

    .line 1804
    :try_start_4
    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 1805
    .local v16, "item$iv":Ljava/lang/Object;
    move-object/from16 v18, v16

    check-cast v18, Landroidx/compose/runtime/ControlledComposition;

    move-object/from16 v19, v18

    .local v19, "it":Landroidx/compose/runtime/ControlledComposition;
    const/16 v18, 0x0

    .line 969
    .local v18, "$i$a$-fastForEach-Recomposer$runFrameLoop$2$2$1$1":I
    move/from16 v20, v1

    move-object v1, v4

    check-cast v1, Ljava/util/Collection;

    move/from16 v21, v2

    move-object/from16 v2, v19

    .end local v19    # "it":Landroidx/compose/runtime/ControlledComposition;
    .local v2, "it":Landroidx/compose/runtime/ControlledComposition;
    .local v21, "index$iv":I
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1805
    .end local v2    # "it":Landroidx/compose/runtime/ControlledComposition;
    .end local v18    # "$i$a$-fastForEach-Recomposer$runFrameLoop$2$2$1$1":I
    nop

    .line 1803
    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v2, v21, 0x1

    move/from16 v1, v20

    .end local v21    # "index$iv":I
    .local v2, "index$iv":I
    goto :goto_2

    :cond_1
    move/from16 v21, v2

    .line 1807
    .end local v2    # "index$iv":I
    nop

    .line 970
    .end local v14    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v15    # "$i$f$fastForEach":I
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getCompositionsAwaitingApply$p(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 971
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v1

    .local v1, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v2, 0x0

    .line 1808
    .local v2, "$i$f$forEach":I
    nop

    .line 1809
    const/4 v14, 0x0

    .line 1810
    .local v14, "i$iv":I
    iget-object v15, v1, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 1811
    .local v15, "content$iv":[Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v16

    move/from16 v18, v16

    .line 1812
    .local v18, "size$iv":I
    :goto_3
    move-object/from16 v16, v1

    move/from16 v1, v18

    .end local v18    # "size$iv":I
    .local v1, "size$iv":I
    .local v16, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    if-ge v14, v1, :cond_2

    .line 1813
    aget-object v18, v15, v14

    check-cast v18, Landroidx/compose/runtime/ControlledComposition;

    move-object/from16 v19, v18

    .restart local v19    # "it":Landroidx/compose/runtime/ControlledComposition;
    const/16 v18, 0x0

    .line 971
    .local v18, "$i$a$-forEach-Recomposer$runFrameLoop$2$2$1$2":I
    move/from16 v20, v1

    .end local v1    # "size$iv":I
    .local v20, "size$iv":I
    move-object v1, v3

    check-cast v1, Ljava/util/Collection;

    move/from16 v21, v2

    move-object/from16 v2, v19

    .end local v19    # "it":Landroidx/compose/runtime/ControlledComposition;
    .local v2, "it":Landroidx/compose/runtime/ControlledComposition;
    .local v21, "$i$f$forEach":I
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1813
    .end local v2    # "it":Landroidx/compose/runtime/ControlledComposition;
    .end local v18    # "$i$a$-forEach-Recomposer$runFrameLoop$2$2$1$2":I
    nop

    .line 1814
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v1, v16

    move/from16 v18, v20

    move/from16 v2, v21

    goto :goto_3

    .line 1816
    .end local v20    # "size$iv":I
    .end local v21    # "$i$f$forEach":I
    .restart local v1    # "size$iv":I
    .local v2, "$i$f$forEach":I
    :cond_2
    move/from16 v20, v1

    move/from16 v21, v2

    .line 972
    .end local v1    # "size$iv":I
    .end local v2    # "$i$f$forEach":I
    .end local v14    # "i$iv":I
    .end local v15    # "content$iv":[Ljava/lang/Object;
    .end local v16    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 973
    invoke-virtual {v5}, Landroidx/compose/runtime/ProduceFrameSignal;->takeFrameRequestLocked()V

    .line 974
    nop

    .end local v13    # "$i$a$-synchronized-Recomposer$runFrameLoop$2$2$1":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 1801
    :try_start_5
    monitor-exit v11

    .line 977
    .end local v11    # "lock$iv":Ljava/lang/Object;
    .end local v12    # "$i$f$synchronized":I
    new-instance v1, Landroidx/collection/MutableScatterSet;

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x1

    invoke-direct {v1, v2, v11, v5}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    .line 978
    .local v1, "modifiedValues":Landroidx/collection/MutableScatterSet;
    nop

    .line 979
    move-object v2, v3

    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 1817
    .local v5, "$i$f$fastForEach":I
    nop

    .line 1818
    const/4 v11, 0x0

    .local v11, "index$iv":I
    :try_start_6
    move-object v12, v2

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    :goto_4
    if-ge v11, v12, :cond_4

    .line 1819
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1820
    .local v13, "item$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Landroidx/compose/runtime/ControlledComposition;

    .local v14, "composer":Landroidx/compose/runtime/ControlledComposition;
    const/4 v15, 0x0

    .line 980
    .local v15, "$i$a$-fastForEach-Recomposer$runFrameLoop$2$2$2":I
    invoke-static {v0, v14, v1}, Landroidx/compose/runtime/Recomposer;->access$performRecompose(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Landroidx/compose/runtime/ControlledComposition;

    move-result-object v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    if-eqz v16, :cond_3

    move-object/from16 v18, v16

    .line 1821
    .local v18, "it":Landroidx/compose/runtime/ControlledComposition;
    const/16 v16, 0x0

    .line 980
    .local v16, "$i$a$-let-Recomposer$runFrameLoop$2$2$2$1":I
    move-object/from16 v19, v1

    .end local v1    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .local v19, "modifiedValues":Landroidx/collection/MutableScatterSet;
    :try_start_7
    move-object v1, v4

    check-cast v1, Ljava/util/Collection;

    move-object/from16 v20, v2

    move-object/from16 v2, v18

    .end local v18    # "it":Landroidx/compose/runtime/ControlledComposition;
    .local v2, "it":Landroidx/compose/runtime/ControlledComposition;
    .local v20, "$this$fastForEach$iv":Ljava/util/List;
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .end local v2    # "it":Landroidx/compose/runtime/ControlledComposition;
    .end local v16    # "$i$a$-let-Recomposer$runFrameLoop$2$2$2$1":I
    goto :goto_5

    .line 983
    .end local v5    # "$i$f$fastForEach":I
    .end local v11    # "index$iv":I
    .end local v13    # "item$iv":Ljava/lang/Object;
    .end local v14    # "composer":Landroidx/compose/runtime/ControlledComposition;
    .end local v15    # "$i$a$-fastForEach-Recomposer$runFrameLoop$2$2$2":I
    .end local v20    # "$this$fastForEach$iv":Ljava/util/List;
    :catchall_2
    move-exception v0

    goto :goto_7

    .line 980
    .end local v19    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .restart local v1    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    .restart local v5    # "$i$f$fastForEach":I
    .restart local v11    # "index$iv":I
    .restart local v13    # "item$iv":Ljava/lang/Object;
    .restart local v14    # "composer":Landroidx/compose/runtime/ControlledComposition;
    .restart local v15    # "$i$a$-fastForEach-Recomposer$runFrameLoop$2$2$2":I
    :cond_3
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    .line 981
    .end local v1    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v19    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .restart local v20    # "$this$fastForEach$iv":Ljava/util/List;
    :goto_5
    nop

    .line 1820
    .end local v14    # "composer":Landroidx/compose/runtime/ControlledComposition;
    .end local v15    # "$i$a$-fastForEach-Recomposer$runFrameLoop$2$2$2":I
    nop

    .line 1818
    .end local v13    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    goto :goto_4

    .end local v19    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .end local v20    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v1    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .restart local v2    # "$this$fastForEach$iv":Ljava/util/List;
    :cond_4
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    .line 1822
    .end local v1    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v11    # "index$iv":I
    .restart local v19    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .restart local v20    # "$this$fastForEach$iv":Ljava/util/List;
    nop

    .line 983
    .end local v5    # "$i$f$fastForEach":I
    .end local v20    # "$this$fastForEach$iv":Ljava/util/List;
    :try_start_8
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 984
    nop

    .line 988
    move-object v1, v4

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Landroidx/compose/runtime/Recomposer;->getChangeCount()J

    move-result-wide v1

    const-wide/16 v11, 0x1

    add-long/2addr v1, v11

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/Recomposer;->access$setChangeCount$p(Landroidx/compose/runtime/Recomposer;J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 991
    :cond_5
    nop

    .line 992
    move-object v1, v4

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1823
    .local v2, "$i$f$fastForEach":I
    nop

    .line 1824
    const/4 v3, 0x0

    .local v3, "index$iv":I
    :try_start_9
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_6
    if-ge v3, v5, :cond_6

    .line 1825
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 1826
    .local v11, "item$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Landroidx/compose/runtime/ControlledComposition;

    .local v12, "composition":Landroidx/compose/runtime/ControlledComposition;
    const/4 v13, 0x0

    .line 992
    .local v13, "$i$a$-fastForEach-Recomposer$runFrameLoop$2$2$3":I
    invoke-interface {v12}, Landroidx/compose/runtime/ControlledComposition;->applyChanges()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1826
    .end local v12    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v13    # "$i$a$-fastForEach-Recomposer$runFrameLoop$2$2$3":I
    nop

    .line 1824
    .end local v11    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 1828
    .end local v3    # "index$iv":I
    :cond_6
    nop

    .line 994
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    :try_start_a
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 995
    nop

    .line 997
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    move-result-object v1

    .local v1, "lock$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 1829
    .local v2, "$i$f$synchronized":I
    nop

    .line 1830
    monitor-enter v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    const/4 v3, 0x0

    .line 997
    .local v3, "$i$a$-synchronized-Recomposer$runFrameLoop$2$2$4":I
    :try_start_b
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$deriveStateLocked(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 1830
    .end local v3    # "$i$a$-synchronized-Recomposer$runFrameLoop$2$2$4":I
    :try_start_c
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 997
    .end local v1    # "lock$iv":Ljava/lang/Object;
    .end local v2    # "$i$f$synchronized":I
    nop

    .line 1799
    .end local v10    # "$i$a$-trace-Recomposer$runFrameLoop$2$2":I
    .end local v19    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    nop

    .line 1831
    sget-object v1, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v1, v9}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 1799
    nop

    .line 998
    .end local v8    # "$i$f$trace":I
    .end local v9    # "token$iv":Ljava/lang/Object;
    .end local v17    # "sectionName$iv":Ljava/lang/String;
    return-object v0

    .line 1830
    .restart local v1    # "lock$iv":Ljava/lang/Object;
    .restart local v2    # "$i$f$synchronized":I
    .restart local v8    # "$i$f$trace":I
    .restart local v9    # "token$iv":Ljava/lang/Object;
    .restart local v10    # "$i$a$-trace-Recomposer$runFrameLoop$2$2":I
    .restart local v17    # "sectionName$iv":Ljava/lang/String;
    .restart local v19    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    :catchall_3
    move-exception v0

    :try_start_d
    monitor-exit v1

    .end local v8    # "$i$f$trace":I
    .end local v9    # "token$iv":Ljava/lang/Object;
    .end local v17    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0

    .line 994
    .end local v1    # "lock$iv":Ljava/lang/Object;
    .end local v2    # "$i$f$synchronized":I
    .restart local v8    # "$i$f$trace":I
    .restart local v9    # "token$iv":Ljava/lang/Object;
    .restart local v17    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :catchall_4
    move-exception v0

    invoke-interface {v4}, Ljava/util/List;->clear()V

    .end local v8    # "$i$f$trace":I
    .end local v9    # "token$iv":Ljava/lang/Object;
    .end local v17    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0

    .line 983
    .end local v19    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .local v1, "modifiedValues":Landroidx/collection/MutableScatterSet;
    .restart local v8    # "$i$f$trace":I
    .restart local v9    # "token$iv":Ljava/lang/Object;
    .restart local v17    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :catchall_5
    move-exception v0

    move-object/from16 v19, v1

    .end local v1    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .restart local v19    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    :goto_7
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .end local v8    # "$i$f$trace":I
    .end local v9    # "token$iv":Ljava/lang/Object;
    .end local v17    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0

    .line 1801
    .end local v19    # "modifiedValues":Landroidx/collection/MutableScatterSet;
    .restart local v8    # "$i$f$trace":I
    .restart local v9    # "token$iv":Ljava/lang/Object;
    .local v11, "lock$iv":Ljava/lang/Object;
    .local v12, "$i$f$synchronized":I
    .restart local v17    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :catchall_6
    move-exception v0

    goto :goto_8

    .end local v17    # "sectionName$iv":Ljava/lang/String;
    .local v2, "sectionName$iv":Ljava/lang/String;
    :catchall_7
    move-exception v0

    move-object/from16 v17, v2

    .end local v2    # "sectionName$iv":Ljava/lang/String;
    .restart local v17    # "sectionName$iv":Ljava/lang/String;
    :goto_8
    monitor-exit v11

    .end local v8    # "$i$f$trace":I
    .end local v9    # "token$iv":Ljava/lang/Object;
    .end local v17    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 1831
    .end local v10    # "$i$a$-trace-Recomposer$runFrameLoop$2$2":I
    .end local v11    # "lock$iv":Ljava/lang/Object;
    .end local v12    # "$i$f$synchronized":I
    .restart local v8    # "$i$f$trace":I
    .restart local v9    # "token$iv":Ljava/lang/Object;
    .restart local v17    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :catchall_8
    move-exception v0

    goto :goto_9

    .end local v17    # "sectionName$iv":Ljava/lang/String;
    .restart local v2    # "sectionName$iv":Ljava/lang/String;
    :catchall_9
    move-exception v0

    move-object/from16 v17, v2

    .end local v2    # "sectionName$iv":Ljava/lang/String;
    .restart local v17    # "sectionName$iv":Ljava/lang/String;
    :goto_9
    sget-object v1, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v1, v9}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    throw v0
.end method
