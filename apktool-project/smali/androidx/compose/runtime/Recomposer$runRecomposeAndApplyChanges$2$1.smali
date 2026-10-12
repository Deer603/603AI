.class final Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Recomposer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n+ 2 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1791:1\n45#2,5:1792\n45#2,3:1797\n49#2:1817\n33#3,2:1800\n33#3,2:1819\n33#3,2:1904\n423#4,9:1802\n519#4:1818\n740#4,15:1827\n33#5,4:1811\n38#5:1816\n33#5,6:1821\n33#5,6:1842\n33#5,6:1848\n1#6:1815\n231#7,3:1854\n200#7,7:1857\n211#7,3:1865\n214#7,9:1869\n234#7:1878\n231#7,3:1879\n200#7,7:1882\n211#7,3:1890\n214#7,9:1894\n234#7:1903\n1399#8:1864\n1270#8:1868\n1399#8:1889\n1270#8:1893\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n*L\n595#1:1792,5\n605#1:1797,3\n605#1:1817\n609#1:1800,2\n636#1:1819,2\n719#1:1904,2\n610#1:1802,9\n635#1:1818\n649#1:1827,15\n619#1:1811,4\n619#1:1816\n637#1:1821,6\n683#1:1842,6\n684#1:1848,6\n697#1:1854,3\n697#1:1857,7\n697#1:1865,3\n697#1:1869,9\n697#1:1878\n709#1:1879,3\n709#1:1882,7\n709#1:1890,3\n709#1:1894,9\n709#1:1903\n697#1:1864\n697#1:1868\n709#1:1889\n709#1:1893\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
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
.field final synthetic $alreadyComposed:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifiedValues:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifiedValuesSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $toApply:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $toComplete:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $toInsert:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $toLateApply:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
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
.method constructor <init>(Landroidx/compose/runtime/Recomposer;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Ljava/util/List;Landroidx/collection/MutableScatterSet;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Recomposer;",
            "Landroidx/collection/MutableScatterSet<",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/ControlledComposition;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->this$0:Landroidx/compose/runtime/Recomposer;

    iput-object p2, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$modifiedValues:Landroidx/collection/MutableScatterSet;

    iput-object p3, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$alreadyComposed:Landroidx/collection/MutableScatterSet;

    iput-object p4, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toRecompose:Ljava/util/List;

    iput-object p5, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toInsert:Ljava/util/List;

    iput-object p6, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toLateApply:Landroidx/collection/MutableScatterSet;

    iput-object p7, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toApply:Ljava/util/List;

    iput-object p8, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toComplete:Landroidx/collection/MutableScatterSet;

    iput-object p9, p0, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$modifiedValuesSet:Ljava/util/Set;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;

    .line 591
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->invoke(J)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(J)V
    .locals 42
    .param p1, "frameTime"    # J

    .line 594
    move-object/from16 v1, p0

    iget-object v0, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->this$0:Landroidx/compose/runtime/Recomposer;

    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getHasBroadcastFrameClockAwaiters(Landroidx/compose/runtime/Recomposer;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 595
    const-string v2, "Recomposer:animation"

    .local v2, "sectionName$iv":Ljava/lang/String;
    iget-object v0, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->this$0:Landroidx/compose/runtime/Recomposer;

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

    .line 598
    .local v5, "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$1":I
    :try_start_0
    invoke-static {v0}, Landroidx/compose/runtime/Recomposer;->access$getBroadcastFrameClock$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/BroadcastFrameClock;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-wide/from16 v6, p1

    :try_start_1
    invoke-virtual {v0, v6, v7}, Landroidx/compose/runtime/BroadcastFrameClock;->sendFrame(J)V

    .line 601
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->sendApplyNotifications()V

    .line 602
    nop

    .end local v5    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1794
    nop

    .line 1796
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v4}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 1794
    nop

    .line 1796
    .end local v2    # "sectionName$iv":Ljava/lang/String;
    .end local v3    # "$i$f$trace":I
    .end local v4    # "token$iv":Ljava/lang/Object;
    goto :goto_1

    .restart local v2    # "sectionName$iv":Ljava/lang/String;
    .restart local v3    # "$i$f$trace":I
    .restart local v4    # "token$iv":Ljava/lang/Object;
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

    .line 594
    .end local v2    # "sectionName$iv":Ljava/lang/String;
    .end local v3    # "$i$f$trace":I
    .end local v4    # "token$iv":Ljava/lang/Object;
    :cond_0
    move-wide/from16 v6, p1

    .line 605
    :goto_1
    const-string v2, "Recomposer:recompose"

    .restart local v2    # "sectionName$iv":Ljava/lang/String;
    iget-object v8, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->this$0:Landroidx/compose/runtime/Recomposer;

    iget-object v14, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$modifiedValues:Landroidx/collection/MutableScatterSet;

    iget-object v15, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$alreadyComposed:Landroidx/collection/MutableScatterSet;

    iget-object v3, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toRecompose:Ljava/util/List;

    iget-object v4, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toInsert:Ljava/util/List;

    iget-object v5, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toLateApply:Landroidx/collection/MutableScatterSet;

    iget-object v9, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toApply:Ljava/util/List;

    iget-object v10, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$toComplete:Landroidx/collection/MutableScatterSet;

    iget-object v0, v1, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1;->$modifiedValuesSet:Ljava/util/Set;

    const/16 v16, 0x0

    .line 1797
    .local v16, "$i$f$trace":I
    sget-object v11, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v11, v2}, Landroidx/compose/runtime/internal/Trace;->beginSection(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    .line 1798
    .local v11, "token$iv":Ljava/lang/Object;
    nop

    .line 1799
    const/16 v17, 0x0

    .line 608
    .local v17, "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    :try_start_2
    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$recordComposerModifications(Landroidx/compose/runtime/Recomposer;)Z

    .line 609
    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    move-result-object v12

    .local v12, "lock$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 1800
    .local v13, "$i$f$synchronized":I
    nop

    .line 1801
    monitor-enter v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1b

    const/16 v18, 0x0

    .line 610
    .local v18, "$i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$1$2$1":I
    :try_start_3
    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v19
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_19

    move-object/from16 v20, v19

    .local v20, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/16 v19, 0x0

    .line 1802
    .local v19, "$i$f$forEach":I
    nop

    .line 1803
    const/16 v21, 0x0

    .line 1804
    .local v21, "i$iv":I
    move-object/from16 v1, v20

    move-object/from16 v20, v2

    .end local v2    # "sectionName$iv":Ljava/lang/String;
    .local v1, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .local v20, "sectionName$iv":Ljava/lang/String;
    :try_start_4
    iget-object v2, v1, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 1805
    .local v2, "content$iv":[Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v22
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_18

    move/from16 v23, v22

    move-object/from16 v22, v1

    move/from16 v1, v21

    .line 1806
    .end local v21    # "i$iv":I
    .local v1, "i$iv":I
    .local v22, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .local v23, "size$iv":I
    :goto_2
    move-object/from16 v21, v2

    move/from16 v2, v23

    .end local v23    # "size$iv":I
    .local v2, "size$iv":I
    .local v21, "content$iv":[Ljava/lang/Object;
    if-ge v1, v2, :cond_1

    .line 1807
    :try_start_5
    aget-object v23, v21, v1

    check-cast v23, Landroidx/compose/runtime/ControlledComposition;

    move-object/from16 v24, v23

    .local v24, "it":Landroidx/compose/runtime/ControlledComposition;
    const/16 v23, 0x0

    .line 610
    .local v23, "$i$a$-forEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$1$1":I
    move/from16 v25, v1

    .end local v1    # "i$iv":I
    .local v25, "i$iv":I
    move-object v1, v3

    check-cast v1, Ljava/util/Collection;

    move/from16 v26, v2

    move-object/from16 v2, v24

    .end local v24    # "it":Landroidx/compose/runtime/ControlledComposition;
    .local v2, "it":Landroidx/compose/runtime/ControlledComposition;
    .local v26, "size$iv":I
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1807
    .end local v2    # "it":Landroidx/compose/runtime/ControlledComposition;
    .end local v23    # "$i$a$-forEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$1$1":I
    nop

    .line 1808
    add-int/lit8 v1, v25, 0x1

    move-object/from16 v2, v21

    move/from16 v23, v26

    .end local v25    # "i$iv":I
    .restart local v1    # "i$iv":I
    goto :goto_2

    .line 1801
    .end local v1    # "i$iv":I
    .end local v18    # "$i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$1$2$1":I
    .end local v19    # "$i$f$forEach":I
    .end local v21    # "content$iv":[Ljava/lang/Object;
    .end local v22    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v26    # "size$iv":I
    :catchall_2
    move-exception v0

    move-object v1, v11

    goto/16 :goto_27

    .line 1810
    .restart local v1    # "i$iv":I
    .local v2, "size$iv":I
    .restart local v18    # "$i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$1$2$1":I
    .restart local v19    # "$i$f$forEach":I
    .restart local v21    # "content$iv":[Ljava/lang/Object;
    .restart local v22    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    :cond_1
    move/from16 v25, v1

    move/from16 v26, v2

    .line 611
    .end local v1    # "i$iv":I
    .end local v2    # "size$iv":I
    .end local v19    # "$i$f$forEach":I
    .end local v21    # "content$iv":[Ljava/lang/Object;
    .end local v22    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    :try_start_6
    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 612
    nop

    .end local v18    # "$i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$1$2$1":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_18

    .line 1801
    :try_start_7
    monitor-exit v12

    .line 615
    .end local v12    # "lock$iv":Ljava/lang/Object;
    .end local v13    # "$i$f$synchronized":I
    invoke-virtual {v14}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 616
    invoke-virtual {v15}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 617
    :goto_3
    move-object v1, v3

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_16

    move-object v1, v4

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v18, v9

    move-object/from16 v36, v10

    move-object v1, v11

    goto/16 :goto_18

    .line 675
    :cond_2
    move-object v0, v9

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 676
    invoke-virtual {v8}, Landroidx/compose/runtime/Recomposer;->getChangeCount()J

    move-result-wide v0

    const-wide/16 v18, 0x1

    add-long v0, v0, v18

    invoke-static {v8, v0, v1}, Landroidx/compose/runtime/Recomposer;->access$setChangeCount$p(Landroidx/compose/runtime/Recomposer;J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_17

    .line 679
    nop

    .line 683
    move-object v0, v9

    .local v0, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 1842
    .local v1, "$i$f$fastForEach":I
    nop

    .line 1843
    const/16 v18, 0x0

    .local v18, "index$iv":I
    :try_start_8
    move-object/from16 v19, v0

    check-cast v19, Ljava/util/Collection;

    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v12

    move/from16 v13, v18

    .end local v18    # "index$iv":I
    .local v13, "index$iv":I
    :goto_4
    if-ge v13, v12, :cond_3

    .line 1844
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 1845
    .local v18, "item$iv":Ljava/lang/Object;
    move-object/from16 v22, v18

    check-cast v22, Landroidx/compose/runtime/ControlledComposition;

    move-object/from16 v23, v22

    .local v23, "composition":Landroidx/compose/runtime/ControlledComposition;
    const/16 v22, 0x0

    .line 683
    .local v22, "$i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$4":I
    move-object/from16 v2, v23

    .end local v23    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .local v2, "composition":Landroidx/compose/runtime/ControlledComposition;
    invoke-virtual {v10, v2}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 1845
    nop

    .line 1843
    .end local v2    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v18    # "item$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$4":I
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 1847
    .end local v13    # "index$iv":I
    :cond_3
    nop

    .line 684
    .end local v0    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastForEach":I
    move-object v0, v9

    .restart local v0    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 1848
    .restart local v1    # "$i$f$fastForEach":I
    nop

    .line 1849
    const/4 v2, 0x0

    .local v2, "index$iv":I
    move-object v12, v0

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    :goto_5
    if-ge v2, v12, :cond_4

    .line 1850
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1851
    .local v13, "item$iv":Ljava/lang/Object;
    move-object/from16 v18, v13

    check-cast v18, Landroidx/compose/runtime/ControlledComposition;

    .local v18, "composition":Landroidx/compose/runtime/ControlledComposition;
    const/16 v22, 0x0

    .line 684
    .local v22, "$i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$5":I
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/ControlledComposition;->applyChanges()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1851
    .end local v18    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v22    # "$i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$5":I
    nop

    .line 1849
    .end local v13    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 1853
    .end local v2    # "index$iv":I
    :cond_4
    nop

    .line 690
    .end local v0    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastForEach":I
    :try_start_9
    invoke-interface {v9}, Ljava/util/List;->clear()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 691
    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v18, v9

    move-object v5, v10

    move-object v1, v11

    goto :goto_8

    .line 1817
    .end local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    :catchall_3
    move-exception v0

    move-object v1, v11

    goto/16 :goto_28

    .line 685
    .restart local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    :catchall_4
    move-exception v0

    .line 686
    .local v0, "e":Ljava/lang/Throwable;
    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v1, v10

    const/4 v10, 0x0

    move-object v2, v11

    .end local v11    # "token$iv":Ljava/lang/Object;
    .local v2, "token$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    move-object/from16 v18, v2

    move-object v2, v1

    move-object/from16 v1, v18

    move-object/from16 v18, v9

    move-object v9, v0

    .end local v0    # "e":Ljava/lang/Throwable;
    .end local v2    # "token$iv":Ljava/lang/Object;
    .local v1, "token$iv":Ljava/lang/Object;
    .local v9, "e":Ljava/lang/Throwable;
    :try_start_a
    invoke-static/range {v8 .. v13}, Landroidx/compose/runtime/Recomposer;->processCompositionError$default(Landroidx/compose/runtime/Recomposer;Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;ZILjava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 687
    .end local v9    # "e":Ljava/lang/Throwable;
    .restart local v0    # "e":Ljava/lang/Throwable;
    move-object v13, v2

    move-object v9, v3

    move-object v10, v4

    move-object v12, v5

    move-object/from16 v11, v18

    :try_start_b
    invoke-static/range {v8 .. v15}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->access$invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 688
    nop

    .line 690
    .end local v0    # "e":Ljava/lang/Throwable;
    :try_start_c
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->clear()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1a

    .line 688
    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    nop

    .line 1817
    :goto_6
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    return-void

    .line 690
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    :catchall_5
    move-exception v0

    move-object/from16 v18, v11

    goto :goto_7

    :catchall_6
    move-exception v0

    :goto_7
    :try_start_d
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->clear()V

    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0

    .line 675
    .restart local v11    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :cond_5
    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v18, v9

    move-object v5, v10

    move-object v1, v11

    .line 694
    .end local v11    # "token$iv":Ljava/lang/Object;
    .restart local v1    # "token$iv":Ljava/lang/Object;
    :goto_8
    invoke-virtual {v4}, Landroidx/collection/MutableScatterSet;->isNotEmpty()Z

    move-result v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1a

    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const-wide/16 v25, 0x80

    if-eqz v0, :cond_d

    .line 695
    nop

    .line 696
    :try_start_e
    move-object v0, v4

    check-cast v0, Landroidx/collection/ScatterSet;

    invoke-virtual {v5, v0}, Landroidx/collection/MutableScatterSet;->plusAssign(Landroidx/collection/ScatterSet;)V

    .line 697
    move-object v0, v4

    check-cast v0, Landroidx/collection/ScatterSet;

    .local v0, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v10, 0x0

    .line 1854
    .local v10, "$i$f$forEach":I
    nop

    .line 1855
    const-wide/16 v27, 0xff

    iget-object v11, v0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1856
    .local v11, "elements$iv":[Ljava/lang/Object;
    move-object v12, v0

    .local v12, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v29, 0x0

    .line 1857
    .local v29, "$i$f$forEachIndex":I
    nop

    .line 1858
    const/16 v30, 0x7

    iget-object v13, v12, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1859
    .local v13, "m$iv$iv":[J
    const/16 v31, 0x8

    array-length v9, v13

    add-int/lit8 v9, v9, -0x2

    .line 1861
    .local v9, "lastIndex$iv$iv":I
    move-object/from16 v32, v0

    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v32, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v0, 0x0

    .local v0, "i$iv$iv":I
    if-gt v0, v9, :cond_a

    .line 1862
    :goto_9
    aget-wide v33, v13, v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1863
    .local v33, "slot$iv$iv":J
    move-wide/from16 v35, v33

    .local v35, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v37, 0x0

    .line 1864
    .local v37, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v38, v2

    move-object/from16 v39, v3

    move-wide/from16 v2, v35

    move-object/from16 v35, v4

    move-object/from16 v36, v5

    .end local v35    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v2, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    not-long v4, v2

    shl-long v4, v4, v30

    and-long/2addr v4, v2

    and-long v2, v4, v22

    .line 1863
    .end local v2    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v37    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v22

    if-eqz v2, :cond_9

    .line 1865
    sub-int v2, v0, v9

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    rsub-int/lit8 v2, v2, 0x8

    .line 1866
    .local v2, "bitCount$iv$iv":I
    const/4 v3, 0x0

    .local v3, "j$iv$iv":I
    :goto_a
    if-ge v3, v2, :cond_8

    .line 1867
    and-long v4, v33, v27

    .local v4, "value$iv$iv$iv":J
    const/16 v37, 0x0

    .line 1868
    .local v37, "$i$f$isFull":I
    cmp-long v40, v4, v25

    if-gez v40, :cond_6

    const/4 v4, 0x1

    goto :goto_b

    :cond_6
    const/4 v4, 0x0

    .line 1867
    .end local v4    # "value$iv$iv$iv":J
    .end local v37    # "$i$f$isFull":I
    :goto_b
    if-eqz v4, :cond_7

    .line 1869
    shl-int/lit8 v4, v0, 0x3

    add-int/2addr v4, v3

    .line 1870
    .local v4, "index$iv$iv":I
    move v5, v4

    .local v5, "index$iv":I
    const/16 v37, 0x0

    .line 1856
    .local v37, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    :try_start_f
    aget-object v40, v11, v5

    check-cast v40, Landroidx/compose/runtime/ControlledComposition;

    .local v40, "composition":Landroidx/compose/runtime/ControlledComposition;
    const/16 v41, 0x0

    .line 697
    .local v41, "$i$a$-forEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$6":I
    invoke-interface/range {v40 .. v40}, Landroidx/compose/runtime/ControlledComposition;->applyLateChanges()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 1856
    .end local v40    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v41    # "$i$a$-forEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$6":I
    nop

    .line 1870
    .end local v5    # "index$iv":I
    .end local v37    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_c

    .line 698
    .end local v0    # "i$iv$iv":I
    .end local v2    # "bitCount$iv$iv":I
    .end local v3    # "j$iv$iv":I
    .end local v4    # "index$iv$iv":I
    .end local v9    # "lastIndex$iv$iv":I
    .end local v10    # "$i$f$forEach":I
    .end local v11    # "elements$iv":[Ljava/lang/Object;
    .end local v12    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v13    # "m$iv$iv":[J
    .end local v29    # "$i$f$forEachIndex":I
    .end local v32    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v33    # "slot$iv$iv":J
    :catchall_7
    move-exception v0

    goto :goto_d

    .line 1872
    .restart local v0    # "i$iv$iv":I
    .restart local v2    # "bitCount$iv$iv":I
    .restart local v3    # "j$iv$iv":I
    .restart local v9    # "lastIndex$iv$iv":I
    .restart local v10    # "$i$f$forEach":I
    .restart local v11    # "elements$iv":[Ljava/lang/Object;
    .restart local v12    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v13    # "m$iv$iv":[J
    .restart local v29    # "$i$f$forEachIndex":I
    .restart local v32    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v33    # "slot$iv$iv":J
    :cond_7
    :goto_c
    shr-long v33, v33, v31

    .line 1866
    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    .line 1874
    .end local v3    # "j$iv$iv":I
    :cond_8
    move/from16 v3, v31

    if-ne v2, v3, :cond_c

    .line 1861
    .end local v2    # "bitCount$iv$iv":I
    .end local v33    # "slot$iv$iv":J
    :cond_9
    if-eq v0, v9, :cond_b

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v4, v35

    move-object/from16 v5, v36

    move-object/from16 v2, v38

    move-object/from16 v3, v39

    const/16 v31, 0x8

    goto :goto_9

    :cond_a
    move-object/from16 v38, v2

    move-object/from16 v39, v3

    move-object/from16 v35, v4

    move-object/from16 v36, v5

    .line 1877
    .end local v0    # "i$iv$iv":I
    :cond_b
    nop

    .line 1878
    .end local v9    # "lastIndex$iv$iv":I
    .end local v12    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v13    # "m$iv$iv":[J
    .end local v29    # "$i$f$forEachIndex":I
    :cond_c
    nop

    .line 703
    .end local v10    # "$i$f$forEach":I
    .end local v11    # "elements$iv":[Ljava/lang/Object;
    .end local v32    # "this_$iv":Landroidx/collection/ScatterSet;
    :try_start_10
    invoke-virtual/range {v35 .. v35}, Landroidx/collection/MutableScatterSet;->clear()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1a

    .line 704
    move-object/from16 v2, v38

    move-object/from16 v3, v39

    goto :goto_f

    .line 698
    :catchall_8
    move-exception v0

    move-object/from16 v38, v2

    move-object/from16 v39, v3

    move-object/from16 v35, v4

    move-object/from16 v36, v5

    :goto_d
    move-object v9, v0

    .line 699
    .local v9, "e":Ljava/lang/Throwable;
    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :try_start_11
    invoke-static/range {v8 .. v13}, Landroidx/compose/runtime/Recomposer;->processCompositionError$default(Landroidx/compose/runtime/Recomposer;Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;ZILjava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    move-object v0, v9

    .line 700
    .end local v9    # "e":Ljava/lang/Throwable;
    .local v0, "e":Ljava/lang/Throwable;
    move-object/from16 v11, v18

    move-object/from16 v12, v35

    move-object/from16 v13, v36

    move-object/from16 v9, v38

    move-object/from16 v10, v39

    :try_start_12
    invoke-static/range {v8 .. v15}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->access$invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 701
    nop

    .line 703
    .end local v0    # "e":Ljava/lang/Throwable;
    :try_start_13
    invoke-virtual/range {v35 .. v35}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 701
    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    goto/16 :goto_6

    .line 703
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    :catchall_9
    move-exception v0

    move-object/from16 v35, v12

    goto :goto_e

    :catchall_a
    move-exception v0

    :goto_e
    invoke-virtual/range {v35 .. v35}, Landroidx/collection/MutableScatterSet;->clear()V

    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0

    .line 694
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :cond_d
    move-object/from16 v35, v4

    move-object/from16 v36, v5

    const-wide/16 v27, 0xff

    const/16 v30, 0x7

    .line 707
    :goto_f
    invoke-virtual/range {v36 .. v36}, Landroidx/collection/MutableScatterSet;->isNotEmpty()Z

    move-result v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1a

    if-eqz v0, :cond_15

    .line 708
    nop

    .line 709
    :try_start_14
    move-object/from16 v10, v36

    check-cast v10, Landroidx/collection/ScatterSet;

    .local v10, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v0, 0x0

    .line 1879
    .local v0, "$i$f$forEach":I
    nop

    .line 1880
    iget-object v4, v10, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1881
    .local v4, "elements$iv":[Ljava/lang/Object;
    move-object v5, v10

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v9, 0x0

    .line 1882
    .local v9, "$i$f$forEachIndex":I
    nop

    .line 1883
    iget-object v11, v5, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1884
    .local v11, "m$iv$iv":[J
    array-length v12, v11

    add-int/lit8 v12, v12, -0x2

    .line 1886
    .local v12, "lastIndex$iv$iv":I
    const/4 v13, 0x0

    .local v13, "i$iv$iv":I
    if-gt v13, v12, :cond_12

    .line 1887
    :goto_10
    aget-wide v32, v11, v13
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 1888
    .local v32, "slot$iv$iv":J
    move-wide/from16 v37, v32

    .local v37, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v29, 0x0

    .line 1889
    .local v29, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v34, v2

    move-object/from16 v39, v3

    move-wide/from16 v2, v37

    move-object/from16 v37, v4

    move-object/from16 v38, v5

    .end local v4    # "elements$iv":[Ljava/lang/Object;
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v2, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v37, "elements$iv":[Ljava/lang/Object;
    .local v38, "this_$iv$iv":Landroidx/collection/ScatterSet;
    not-long v4, v2

    shl-long v4, v4, v30

    and-long/2addr v4, v2

    and-long v2, v4, v22

    .line 1888
    .end local v2    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v29    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v2, v2, v22

    if-eqz v2, :cond_11

    .line 1890
    sub-int v2, v13, v12

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v31, 0x8

    rsub-int/lit8 v2, v2, 0x8

    .line 1891
    .local v2, "bitCount$iv$iv":I
    const/4 v3, 0x0

    .restart local v3    # "j$iv$iv":I
    :goto_11
    if-ge v3, v2, :cond_10

    .line 1892
    and-long v4, v32, v27

    .local v4, "value$iv$iv$iv":J
    const/16 v29, 0x0

    .line 1893
    .local v29, "$i$f$isFull":I
    cmp-long v40, v4, v25

    if-gez v40, :cond_e

    const/4 v4, 0x1

    goto :goto_12

    :cond_e
    const/4 v4, 0x0

    .line 1892
    .end local v4    # "value$iv$iv$iv":J
    .end local v29    # "$i$f$isFull":I
    :goto_12
    if-eqz v4, :cond_f

    .line 1894
    shl-int/lit8 v4, v13, 0x3

    add-int/2addr v4, v3

    .line 1895
    .local v4, "index$iv$iv":I
    move v5, v4

    .local v5, "index$iv":I
    const/16 v29, 0x0

    .line 1881
    .local v29, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    :try_start_15
    aget-object v40, v37, v5

    check-cast v40, Landroidx/compose/runtime/ControlledComposition;

    .restart local v40    # "composition":Landroidx/compose/runtime/ControlledComposition;
    const/16 v41, 0x0

    .line 709
    .local v41, "$i$a$-forEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$7":I
    invoke-interface/range {v40 .. v40}, Landroidx/compose/runtime/ControlledComposition;->changesApplied()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    .line 1881
    .end local v40    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v41    # "$i$a$-forEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$7":I
    nop

    .line 1895
    .end local v5    # "index$iv":I
    .end local v29    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_13

    .line 710
    .end local v0    # "$i$f$forEach":I
    .end local v2    # "bitCount$iv$iv":I
    .end local v3    # "j$iv$iv":I
    .end local v4    # "index$iv$iv":I
    .end local v9    # "$i$f$forEachIndex":I
    .end local v10    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v11    # "m$iv$iv":[J
    .end local v12    # "lastIndex$iv$iv":I
    .end local v13    # "i$iv$iv":I
    .end local v32    # "slot$iv$iv":J
    .end local v37    # "elements$iv":[Ljava/lang/Object;
    .end local v38    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :catchall_b
    move-exception v0

    goto :goto_15

    .line 1897
    .restart local v0    # "$i$f$forEach":I
    .restart local v2    # "bitCount$iv$iv":I
    .restart local v3    # "j$iv$iv":I
    .restart local v9    # "$i$f$forEachIndex":I
    .restart local v10    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v11    # "m$iv$iv":[J
    .restart local v12    # "lastIndex$iv$iv":I
    .restart local v13    # "i$iv$iv":I
    .restart local v32    # "slot$iv$iv":J
    .restart local v37    # "elements$iv":[Ljava/lang/Object;
    .restart local v38    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_f
    :goto_13
    const/16 v4, 0x8

    shr-long v32, v32, v4

    .line 1891
    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    :cond_10
    const/16 v4, 0x8

    .line 1899
    .end local v3    # "j$iv$iv":I
    if-ne v2, v4, :cond_14

    goto :goto_14

    .line 1888
    .end local v2    # "bitCount$iv$iv":I
    :cond_11
    const/16 v4, 0x8

    .line 1886
    .end local v32    # "slot$iv$iv":J
    :goto_14
    if-eq v13, v12, :cond_13

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v2, v34

    move-object/from16 v4, v37

    move-object/from16 v5, v38

    move-object/from16 v3, v39

    goto :goto_10

    .end local v37    # "elements$iv":[Ljava/lang/Object;
    .end local v38    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v4, "elements$iv":[Ljava/lang/Object;
    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_12
    move-object/from16 v37, v4

    move-object/from16 v38, v5

    .line 1902
    .end local v4    # "elements$iv":[Ljava/lang/Object;
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v13    # "i$iv$iv":I
    .restart local v37    # "elements$iv":[Ljava/lang/Object;
    .restart local v38    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_13
    nop

    .line 1903
    .end local v9    # "$i$f$forEachIndex":I
    .end local v11    # "m$iv$iv":[J
    .end local v12    # "lastIndex$iv$iv":I
    .end local v38    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_14
    nop

    .line 715
    .end local v0    # "$i$f$forEach":I
    .end local v10    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v37    # "elements$iv":[Ljava/lang/Object;
    :try_start_16
    invoke-virtual/range {v36 .. v36}, Landroidx/collection/MutableScatterSet;->clear()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1a

    .line 716
    goto :goto_17

    .line 710
    :catchall_c
    move-exception v0

    move-object/from16 v34, v2

    move-object/from16 v39, v3

    :goto_15
    move-object v9, v0

    .line 711
    .local v9, "e":Ljava/lang/Throwable;
    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :try_start_17
    invoke-static/range {v8 .. v13}, Landroidx/compose/runtime/Recomposer;->processCompositionError$default(Landroidx/compose/runtime/Recomposer;Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;ZILjava/lang/Object;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    move-object v0, v9

    .line 712
    .end local v9    # "e":Ljava/lang/Throwable;
    .local v0, "e":Ljava/lang/Throwable;
    move-object/from16 v11, v18

    move-object/from16 v9, v34

    move-object/from16 v12, v35

    move-object/from16 v13, v36

    move-object/from16 v10, v39

    :try_start_18
    invoke-static/range {v8 .. v15}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->access$invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    .line 713
    nop

    .line 715
    .end local v0    # "e":Ljava/lang/Throwable;
    :try_start_19
    invoke-virtual/range {v36 .. v36}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 713
    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    goto/16 :goto_6

    .line 715
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    :catchall_d
    move-exception v0

    move-object/from16 v36, v13

    goto :goto_16

    :catchall_e
    move-exception v0

    :goto_16
    invoke-virtual/range {v36 .. v36}, Landroidx/collection/MutableScatterSet;->clear()V

    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0

    .line 719
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :cond_15
    :goto_17
    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    .local v2, "lock$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1904
    .local v3, "$i$f$synchronized":I
    nop

    .line 1905
    monitor-enter v2
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1a

    const/4 v0, 0x0

    .line 719
    .local v0, "$i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$1$2$8":I
    :try_start_1a
    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$deriveStateLocked(Landroidx/compose/runtime/Recomposer;)Lkotlinx/coroutines/CancellableContinuation;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_f

    .line 1905
    .end local v0    # "$i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$1$2$8":I
    :try_start_1b
    monitor-exit v2

    .line 726
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$synchronized":I
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->notifyObjectsInitialized()V

    .line 727
    invoke-virtual {v15}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 728
    invoke-virtual {v14}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 729
    const/4 v0, 0x0

    invoke-static {v8, v0}, Landroidx/compose/runtime/Recomposer;->access$setCompositionsRemoved$p(Landroidx/compose/runtime/Recomposer;Ljava/util/Set;)V

    .line 730
    nop

    .end local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_1a

    .line 1799
    nop

    .line 1817
    sget-object v0, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    .line 1799
    nop

    .line 731
    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    return-void

    .line 1905
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v2    # "lock$iv":Ljava/lang/Object;
    .restart local v3    # "$i$f$synchronized":I
    .restart local v16    # "$i$f$trace":I
    .restart local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    :catchall_f
    move-exception v0

    :try_start_1c
    monitor-exit v2

    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1a

    .line 617
    .end local v2    # "lock$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$synchronized":I
    .local v11, "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :cond_16
    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v18, v9

    move-object/from16 v36, v10

    move-object v1, v11

    .line 618
    .end local v11    # "token$iv":Ljava/lang/Object;
    .restart local v1    # "token$iv":Ljava/lang/Object;
    :goto_18
    nop

    .line 619
    move-object v5, v2

    .local v5, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v9, 0x0

    .line 1811
    .local v9, "$i$f$fastForEach":I
    nop

    .line 1812
    const/4 v10, 0x0

    .local v10, "index$iv":I
    :try_start_1d
    move-object v11, v5

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v11
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_14

    :goto_19
    if-ge v10, v11, :cond_18

    .line 1813
    :try_start_1e
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 1814
    .local v12, "item$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Landroidx/compose/runtime/ControlledComposition;

    .local v13, "composition":Landroidx/compose/runtime/ControlledComposition;
    const/16 v22, 0x0

    .line 620
    .local v22, "$i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$2":I
    invoke-static {v8, v13, v14}, Landroidx/compose/runtime/Recomposer;->access$performRecompose(Landroidx/compose/runtime/Recomposer;Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Landroidx/compose/runtime/ControlledComposition;

    move-result-object v23

    if-eqz v23, :cond_17

    move-object/from16 v25, v23

    .line 1815
    .local v25, "it":Landroidx/compose/runtime/ControlledComposition;
    const/16 v23, 0x0

    .line 620
    .local v23, "$i$a$-let-Recomposer$runRecomposeAndApplyChanges$2$1$2$2$1":I
    move-object/from16 v26, v5

    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .local v26, "$this$fastForEach$iv":Ljava/util/List;
    move-object/from16 v5, v18

    check-cast v5, Ljava/util/Collection;

    move-object/from16 v6, v25

    .end local v25    # "it":Landroidx/compose/runtime/ControlledComposition;
    .local v6, "it":Landroidx/compose/runtime/ControlledComposition;
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v6    # "it":Landroidx/compose/runtime/ControlledComposition;
    .end local v23    # "$i$a$-let-Recomposer$runRecomposeAndApplyChanges$2$1$2$2$1":I
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1a

    .end local v26    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v5    # "$this$fastForEach$iv":Ljava/util/List;
    :cond_17
    move-object/from16 v26, v5

    .line 621
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v26    # "$this$fastForEach$iv":Ljava/util/List;
    :goto_1a
    invoke-virtual {v15, v13}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_10

    .line 622
    nop

    .line 1814
    .end local v13    # "composition":Landroidx/compose/runtime/ControlledComposition;
    .end local v22    # "$i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$2":I
    nop

    .line 1812
    .end local v12    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v10, v10, 0x1

    move-wide/from16 v6, p1

    move-object/from16 v5, v26

    goto :goto_19

    .line 623
    .end local v9    # "$i$f$fastForEach":I
    .end local v10    # "index$iv":I
    .end local v26    # "$this$fastForEach$iv":Ljava/util/List;
    :catchall_10
    move-exception v0

    move-object v9, v0

    move-object/from16 v35, v4

    goto/16 :goto_25

    .line 1812
    .restart local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v9    # "$i$f$fastForEach":I
    .restart local v10    # "index$iv":I
    :cond_18
    move-object/from16 v26, v5

    .line 1816
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v10    # "index$iv":I
    .restart local v26    # "$this$fastForEach$iv":Ljava/util/List;
    nop

    .line 628
    .end local v9    # "$i$f$fastForEach":I
    .end local v26    # "$this$fastForEach$iv":Ljava/util/List;
    :try_start_1f
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 629
    nop

    .line 635
    invoke-virtual {v14}, Landroidx/collection/MutableScatterSet;->isNotEmpty()Z

    move-result v5

    if-nez v5, :cond_1b

    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v5

    .local v5, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v6, 0x0

    .line 1818
    .local v6, "$i$f$isNotEmpty":I
    invoke-virtual {v5}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v7

    if-eqz v7, :cond_19

    const/4 v5, 0x1

    goto :goto_1b

    :cond_19
    const/4 v5, 0x0

    .line 635
    .end local v5    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v6    # "$i$f$isNotEmpty":I
    :goto_1b
    if-eqz v5, :cond_1a

    goto :goto_1c

    :cond_1a
    move-object/from16 v23, v0

    move-object/from16 v38, v2

    goto/16 :goto_22

    .line 636
    :cond_1b
    :goto_1c
    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$getStateLock$p(Landroidx/compose/runtime/Recomposer;)Ljava/lang/Object;

    move-result-object v5

    .local v5, "lock$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1819
    .local v6, "$i$f$synchronized":I
    nop

    .line 1820
    monitor-enter v5
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1a

    const/4 v7, 0x0

    .line 637
    .local v7, "$i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$1$2$3":I
    :try_start_20
    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$getKnownCompositions(Landroidx/compose/runtime/Recomposer;)Ljava/util/List;

    move-result-object v9

    .local v9, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v10, 0x0

    .line 1821
    .local v10, "$i$f$fastForEach":I
    nop

    .line 1822
    const/4 v11, 0x0

    .local v11, "index$iv":I
    move-object v12, v9

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v12

    :goto_1d
    if-ge v11, v12, :cond_1e

    .line 1823
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 1824
    .local v13, "item$iv":Ljava/lang/Object;
    move-object/from16 v22, v13

    check-cast v22, Landroidx/compose/runtime/ControlledComposition;
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_13

    move-object/from16 v23, v22

    .local v23, "value":Landroidx/compose/runtime/ControlledComposition;
    const/16 v22, 0x0

    .line 638
    .local v22, "$i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$3$1":I
    nop

    .line 639
    move/from16 v25, v6

    move-object/from16 v6, v23

    .end local v23    # "value":Landroidx/compose/runtime/ControlledComposition;
    .local v6, "value":Landroidx/compose/runtime/ControlledComposition;
    .local v25, "$i$f$synchronized":I
    :try_start_21
    invoke-virtual {v15, v6}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_1d

    .line 640
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ControlledComposition;->observesAnyOf(Ljava/util/Set;)Z

    move-result v23

    if-eqz v23, :cond_1c

    .line 642
    move-object/from16 v23, v0

    move-object v0, v2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    .line 640
    :cond_1c
    move-object/from16 v23, v0

    goto :goto_1e

    .line 639
    :cond_1d
    move-object/from16 v23, v0

    .line 644
    :goto_1e
    nop

    .line 1824
    .end local v6    # "value":Landroidx/compose/runtime/ControlledComposition;
    .end local v22    # "$i$a$-fastForEach-Recomposer$runRecomposeAndApplyChanges$2$1$2$3$1":I
    nop

    .line 1822
    .end local v13    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, v23

    move/from16 v6, v25

    goto :goto_1d

    .end local v25    # "$i$f$synchronized":I
    .local v6, "$i$f$synchronized":I
    :cond_1e
    move-object/from16 v23, v0

    move/from16 v25, v6

    .line 1826
    .end local v6    # "$i$f$synchronized":I
    .end local v11    # "index$iv":I
    .restart local v25    # "$i$f$synchronized":I
    nop

    .line 649
    .end local v9    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v10    # "$i$f$fastForEach":I
    invoke-static {v8}, Landroidx/compose/runtime/Recomposer;->access$getCompositionInvalidations$p(Landroidx/compose/runtime/Recomposer;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v0

    .local v0, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v6, 0x0

    .line 1827
    .local v6, "$i$f$removeIf":I
    const/4 v9, 0x0

    .line 1828
    .local v9, "gap$iv":I
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v10

    .line 1829
    .local v10, "size$iv":I
    const/4 v11, 0x0

    .local v11, "i$iv":I
    :goto_1f
    if-ge v11, v10, :cond_22

    .line 1830
    iget-object v12, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    aget-object v12, v12, v11

    check-cast v12, Landroidx/compose/runtime/ControlledComposition;

    .local v12, "value":Landroidx/compose/runtime/ControlledComposition;
    const/4 v13, 0x0

    .line 650
    .local v13, "$i$a$-removeIf-Recomposer$runRecomposeAndApplyChanges$2$1$2$3$2":I
    invoke-virtual {v15, v12}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_1f

    invoke-interface {v2, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v22

    if-nez v22, :cond_1f

    .line 651
    move-object/from16 v38, v2

    move-object/from16 v2, v38

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 652
    const/4 v2, 0x1

    goto :goto_20

    .line 650
    :cond_1f
    move-object/from16 v38, v2

    .line 654
    const/4 v2, 0x0

    .line 655
    :goto_20
    nop

    .line 1830
    .end local v12    # "value":Landroidx/compose/runtime/ControlledComposition;
    .end local v13    # "$i$a$-removeIf-Recomposer$runRecomposeAndApplyChanges$2$1$2$3$2":I
    if-eqz v2, :cond_20

    .line 1831
    add-int/lit8 v9, v9, 0x1

    .line 1832
    goto :goto_21

    .line 1835
    :cond_20
    if-lez v9, :cond_21

    .line 1836
    iget-object v2, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    sub-int v12, v11, v9

    iget-object v13, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    aget-object v13, v13, v11

    aput-object v13, v2, v12

    .line 1829
    :cond_21
    :goto_21
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v38

    goto :goto_1f

    :cond_22
    move-object/from16 v38, v2

    .line 1839
    .end local v11    # "i$iv":I
    iget-object v2, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    sub-int v11, v10, v9

    const/4 v12, 0x0

    invoke-static {v2, v12, v11, v10}, Lkotlin/collections/ArraysKt;->fill([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 1840
    sub-int v2, v10, v9

    invoke-virtual {v0, v2}, Landroidx/compose/runtime/collection/MutableVector;->setSize(I)V

    .line 1841
    nop

    .line 657
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v6    # "$i$f$removeIf":I
    .end local v9    # "gap$iv":I
    .end local v10    # "size$iv":I
    nop

    .end local v7    # "$i$a$-synchronized-Recomposer$runRecomposeAndApplyChanges$2$1$2$3":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_12

    .line 1820
    :try_start_22
    monitor-exit v5

    .line 660
    .end local v5    # "lock$iv":Ljava/lang/Object;
    .end local v25    # "$i$f$synchronized":I
    :goto_22
    invoke-interface/range {v38 .. v38}, Ljava/util/List;->isEmpty()Z

    move-result v0
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_1a

    if-eqz v0, :cond_24

    .line 661
    nop

    .line 662
    :try_start_23
    invoke-static {v3, v8}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->access$invokeSuspend$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;)V

    .line 663
    :goto_23
    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_23

    .line 664
    invoke-static {v8, v3, v14}, Landroidx/compose/runtime/Recomposer;->access$performInsertValues(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Landroidx/collection/MutableScatterSet;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {v4, v0}, Landroidx/collection/MutableScatterSet;->plusAssign(Ljava/lang/Iterable;)V

    .line 665
    invoke-static {v3, v8}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->access$invokeSuspend$fillToInsert(Ljava/util/List;Landroidx/compose/runtime/Recomposer;)V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_11

    goto :goto_23

    .line 663
    :cond_23
    move-wide/from16 v6, p1

    move-object v11, v1

    move-object v5, v4

    move-object/from16 v9, v18

    move-object/from16 v0, v23

    move-object/from16 v10, v36

    move-object v4, v3

    move-object/from16 v3, v38

    goto/16 :goto_3

    .line 667
    :catchall_11
    move-exception v0

    move-object v9, v0

    .line 668
    .local v9, "e":Ljava/lang/Throwable;
    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    :try_start_24
    invoke-static/range {v8 .. v13}, Landroidx/compose/runtime/Recomposer;->processCompositionError$default(Landroidx/compose/runtime/Recomposer;Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;ZILjava/lang/Object;)V

    move-object v0, v9

    .line 669
    .end local v9    # "e":Ljava/lang/Throwable;
    .local v0, "e":Ljava/lang/Throwable;
    move-object v10, v3

    move-object v12, v4

    move-object/from16 v11, v18

    move-object/from16 v13, v36

    move-object/from16 v9, v38

    invoke-static/range {v8 .. v15}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->access$invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;)V

    .line 670
    nop

    .end local v0    # "e":Ljava/lang/Throwable;
    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    goto/16 :goto_6

    .line 660
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    :cond_24
    move-object/from16 v35, v4

    move-object/from16 v2, v38

    move-wide/from16 v6, p1

    move-object v11, v1

    move-object v4, v3

    move-object/from16 v9, v18

    move-object/from16 v0, v23

    move-object/from16 v5, v35

    move-object/from16 v10, v36

    move-object v3, v2

    goto/16 :goto_3

    .line 1820
    .restart local v5    # "lock$iv":Ljava/lang/Object;
    .restart local v25    # "$i$f$synchronized":I
    :catchall_12
    move-exception v0

    goto :goto_24

    .end local v25    # "$i$f$synchronized":I
    .local v6, "$i$f$synchronized":I
    :catchall_13
    move-exception v0

    move/from16 v25, v6

    .end local v6    # "$i$f$synchronized":I
    .restart local v25    # "$i$f$synchronized":I
    :goto_24
    monitor-exit v5

    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_1a

    .line 623
    .end local v5    # "lock$iv":Ljava/lang/Object;
    .end local v25    # "$i$f$synchronized":I
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :catchall_14
    move-exception v0

    move-object/from16 v35, v4

    move-object v9, v0

    .line 624
    .restart local v9    # "e":Ljava/lang/Throwable;
    :goto_25
    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    :try_start_25
    invoke-static/range {v8 .. v13}, Landroidx/compose/runtime/Recomposer;->processCompositionError$default(Landroidx/compose/runtime/Recomposer;Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;ZILjava/lang/Object;)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_16

    move-object v0, v9

    .line 625
    .end local v9    # "e":Ljava/lang/Throwable;
    .restart local v0    # "e":Ljava/lang/Throwable;
    move-object v9, v2

    move-object v10, v3

    move-object/from16 v11, v18

    move-object/from16 v12, v35

    move-object/from16 v13, v36

    :try_start_26
    invoke-static/range {v8 .. v15}, Landroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2;->access$invokeSuspend$clearRecompositionState(Landroidx/compose/runtime/Recomposer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;Landroidx/collection/MutableScatterSet;)V
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_15

    .line 626
    nop

    .line 628
    .end local v0    # "e":Ljava/lang/Throwable;
    :try_start_27
    invoke-interface {v9}, Ljava/util/List;->clear()V

    .line 626
    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    goto/16 :goto_6

    .line 628
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    :catchall_15
    move-exception v0

    goto :goto_26

    :catchall_16
    move-exception v0

    move-object v9, v2

    :goto_26
    invoke-interface {v9}, Ljava/util/List;->clear()V

    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0

    .line 1817
    .end local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .local v11, "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :catchall_17
    move-exception v0

    move-object v1, v11

    .end local v11    # "token$iv":Ljava/lang/Object;
    .restart local v1    # "token$iv":Ljava/lang/Object;
    goto :goto_28

    .line 1801
    .end local v1    # "token$iv":Ljava/lang/Object;
    .restart local v11    # "token$iv":Ljava/lang/Object;
    .local v12, "lock$iv":Ljava/lang/Object;
    .local v13, "$i$f$synchronized":I
    .restart local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    :catchall_18
    move-exception v0

    move-object v1, v11

    .end local v11    # "token$iv":Ljava/lang/Object;
    .restart local v1    # "token$iv":Ljava/lang/Object;
    goto :goto_27

    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    .local v2, "sectionName$iv":Ljava/lang/String;
    .restart local v11    # "token$iv":Ljava/lang/Object;
    :catchall_19
    move-exception v0

    move-object/from16 v20, v2

    move-object v1, v11

    .end local v2    # "sectionName$iv":Ljava/lang/String;
    .end local v11    # "token$iv":Ljava/lang/Object;
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    :goto_27
    monitor-exit v12

    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$trace":I
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    .end local p1    # "frameTime":J
    throw v0
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_1a

    .line 1817
    .end local v12    # "lock$iv":Ljava/lang/Object;
    .end local v13    # "$i$f$synchronized":I
    .end local v17    # "$i$a$-trace-Recomposer$runRecomposeAndApplyChanges$2$1$2":I
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v16    # "$i$f$trace":I
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    .restart local p1    # "frameTime":J
    :catchall_1a
    move-exception v0

    goto :goto_28

    .end local v1    # "token$iv":Ljava/lang/Object;
    .end local v20    # "sectionName$iv":Ljava/lang/String;
    .restart local v2    # "sectionName$iv":Ljava/lang/String;
    .restart local v11    # "token$iv":Ljava/lang/Object;
    :catchall_1b
    move-exception v0

    move-object/from16 v20, v2

    move-object v1, v11

    .end local v2    # "sectionName$iv":Ljava/lang/String;
    .end local v11    # "token$iv":Ljava/lang/Object;
    .restart local v1    # "token$iv":Ljava/lang/Object;
    .restart local v20    # "sectionName$iv":Ljava/lang/String;
    :goto_28
    sget-object v2, Landroidx/compose/runtime/internal/Trace;->INSTANCE:Landroidx/compose/runtime/internal/Trace;

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/internal/Trace;->endSection(Ljava/lang/Object;)V

    throw v0
.end method
