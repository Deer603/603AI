.class final Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SnapshotFlow.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    value = "SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n+ 2 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n51#2,2:180\n54#2:210\n55#2:214\n256#3,2:182\n231#3,3:184\n200#3,7:187\n211#3,3:195\n214#3,2:199\n217#3,6:202\n234#3:208\n258#3:209\n1399#4:194\n1270#4:198\n60#5:201\n1747#6,3:211\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n*L\n126#1:180,2\n126#1:210\n126#1:214\n126#1:182,2\n126#1:184,3\n126#1:187,7\n126#1:195,3\n126#1:199,2\n126#1:202,6\n126#1:208\n126#1:209\n126#1:194\n126#1:198\n126#1:201\n126#1:211,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
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
.field final synthetic $appliedChanges:Lkotlinx/coroutines/channels/Channel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/Channel<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlinx/coroutines/channels/Channel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/Channel<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1;->$appliedChanges:Lkotlinx/coroutines/channels/Channel;

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 124
    move-object v0, p1

    check-cast v0, Ljava/util/Set;

    move-object v1, p2

    check-cast v1, Landroidx/compose/runtime/snapshots/Snapshot;

    invoke-virtual {p0, v0, v1}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1;->invoke(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V

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

    .line 126
    move-object/from16 v0, p1

    .local v0, "$this$fastAny$iv":Ljava/util/Set;
    const/4 v1, 0x0

    .line 180
    .local v1, "$i$f$fastAny":I
    instance-of v2, v0, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    if-eqz v2, :cond_a

    .line 181
    move-object v2, v0

    check-cast v2, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    invoke-virtual {v2}, Landroidx/compose/runtime/collection/ScatterSetWrapper;->getSet$runtime_release()Landroidx/collection/ScatterSet;

    move-result-object v2

    .local v2, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v6, 0x0

    .line 182
    .local v6, "$i$f$any":I
    nop

    .line 183
    move-object v7, v2

    .local v7, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v8, 0x0

    .line 184
    .local v8, "$i$f$forEach":I
    nop

    .line 185
    iget-object v9, v7, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 186
    .local v9, "elements$iv$iv$iv":[Ljava/lang/Object;
    move-object v10, v7

    .local v10, "this_$iv$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v11, 0x0

    .line 187
    .local v11, "$i$f$forEachIndex":I
    nop

    .line 188
    iget-object v12, v10, Landroidx/collection/ScatterSet;->metadata:[J

    .line 189
    .local v12, "m$iv$iv$iv$iv":[J
    array-length v13, v12

    add-int/lit8 v13, v13, -0x2

    .line 191
    .local v13, "lastIndex$iv$iv$iv$iv":I
    const/4 v14, 0x0

    .local v14, "i$iv$iv$iv$iv":I
    if-gt v14, v13, :cond_7

    .line 192
    :goto_0
    aget-wide v15, v12, v14

    .line 193
    .local v15, "slot$iv$iv$iv$iv":J
    move-wide/from16 v17, v15

    .local v17, "$this$maskEmptyOrDeleted$iv$iv$iv$iv$iv":J
    const/16 v19, 0x0

    .line 194
    .local v19, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v3, v17

    const/16 p2, 0x4

    move/from16 v18, v6

    .end local v6    # "$i$f$any":I
    .end local v17    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv$iv":J
    .local v3, "$this$maskEmptyOrDeleted$iv$iv$iv$iv$iv":J
    .local v18, "$i$f$any":I
    not-long v5, v3

    const/16 v20, 0x7

    shl-long v5, v5, v20

    and-long/2addr v5, v3

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v3, v5, v20

    .line 193
    .end local v3    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv$iv":J
    .end local v19    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v3, v3, v20

    if-eqz v3, :cond_6

    .line 195
    sub-int v3, v14, v13

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v4, 0x8

    rsub-int/lit8 v3, v3, 0x8

    .line 196
    .local v3, "bitCount$iv$iv$iv$iv":I
    const/4 v5, 0x0

    .local v5, "j$iv$iv$iv$iv":I
    :goto_1
    if-ge v5, v3, :cond_5

    .line 197
    const-wide/16 v20, 0xff

    and-long v20, v15, v20

    .local v20, "value$iv$iv$iv$iv$iv":J
    const/4 v6, 0x0

    .line 198
    .local v6, "$i$f$isFull":I
    const-wide/16 v22, 0x80

    cmp-long v19, v20, v22

    if-gez v19, :cond_0

    const/4 v6, 0x1

    goto :goto_2

    :cond_0
    const/4 v6, 0x0

    .line 197
    .end local v6    # "$i$f$isFull":I
    .end local v20    # "value$iv$iv$iv$iv$iv":J
    :goto_2
    if-eqz v6, :cond_4

    .line 199
    shl-int/lit8 v6, v14, 0x3

    add-int/2addr v6, v5

    .line 200
    .local v6, "index$iv$iv$iv$iv":I
    move/from16 v19, v6

    .local v19, "index$iv$iv$iv":I
    const/16 v20, 0x0

    .line 186
    .local v20, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv$iv":I
    aget-object v21, v9, v19

    .local v21, "element$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 183
    .local v22, "$i$a$-forEach-ScatterSet$any$2$iv$iv":I
    move-object/from16 v23, v21

    .local v23, "it":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 126
    .local v24, "$i$a$-fastAny-SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1$maybeObserved$1":I
    move/from16 v25, v4

    move-object/from16 v4, v23

    move-object/from16 v23, v0

    .end local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .local v4, "it":Ljava/lang/Object;
    .local v23, "$this$fastAny$iv":Ljava/util/Set;
    instance-of v0, v4, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v0, :cond_2

    move-object v0, v4

    check-cast v0, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    sget-object v26, Landroidx/compose/runtime/snapshots/ReaderKind;->Companion:Landroidx/compose/runtime/snapshots/ReaderKind$Companion;

    .local v26, "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    const/16 v27, 0x0

    .line 201
    .local v27, "$i$f$getSnapshotFlow-6f8NoZ8":I
    move/from16 v28, v1

    .end local v1    # "$i$f$fastAny":I
    .local v28, "$i$f$fastAny":I
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v1

    .line 126
    .end local v26    # "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    .end local v27    # "$i$f$getSnapshotFlow-6f8NoZ8":I
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->isReadIn-h_f27i8$runtime_release(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    goto :goto_4

    .end local v28    # "$i$f$fastAny":I
    .restart local v1    # "$i$f$fastAny":I
    :cond_2
    move/from16 v28, v1

    .end local v1    # "$i$f$fastAny":I
    .restart local v28    # "$i$f$fastAny":I
    :goto_3
    const/4 v0, 0x1

    .line 183
    .end local v4    # "it":Ljava/lang/Object;
    .end local v24    # "$i$a$-fastAny-SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1$maybeObserved$1":I
    :goto_4
    if-eqz v0, :cond_3

    const/4 v4, 0x1

    goto/16 :goto_9

    .line 186
    .end local v21    # "element$iv$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-forEach-ScatterSet$any$2$iv$iv":I
    :cond_3
    nop

    .line 200
    .end local v19    # "index$iv$iv$iv":I
    .end local v20    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv$iv":I
    goto :goto_5

    .line 197
    .end local v6    # "index$iv$iv$iv$iv":I
    .end local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v28    # "$i$f$fastAny":I
    .restart local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v1    # "$i$f$fastAny":I
    :cond_4
    move-object/from16 v23, v0

    move/from16 v28, v1

    move/from16 v25, v4

    .line 202
    .end local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v1    # "$i$f$fastAny":I
    .restart local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v28    # "$i$f$fastAny":I
    :goto_5
    shr-long v15, v15, v25

    .line 196
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v23

    move/from16 v4, v25

    move/from16 v1, v28

    goto :goto_1

    .end local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v28    # "$i$f$fastAny":I
    .restart local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v1    # "$i$f$fastAny":I
    :cond_5
    move-object/from16 v23, v0

    move/from16 v28, v1

    move/from16 v25, v4

    .line 204
    .end local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v1    # "$i$f$fastAny":I
    .end local v5    # "j$iv$iv$iv$iv":I
    .restart local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v28    # "$i$f$fastAny":I
    move/from16 v0, v25

    if-ne v3, v0, :cond_9

    goto :goto_6

    .line 193
    .end local v3    # "bitCount$iv$iv$iv$iv":I
    .end local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v28    # "$i$f$fastAny":I
    .restart local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v1    # "$i$f$fastAny":I
    :cond_6
    move-object/from16 v23, v0

    move/from16 v28, v1

    .line 191
    .end local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v1    # "$i$f$fastAny":I
    .end local v15    # "slot$iv$iv$iv$iv":J
    .restart local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v28    # "$i$f$fastAny":I
    :goto_6
    if-eq v14, v13, :cond_8

    add-int/lit8 v14, v14, 0x1

    move/from16 v6, v18

    move-object/from16 v0, v23

    move/from16 v1, v28

    goto/16 :goto_0

    .end local v18    # "$i$f$any":I
    .end local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v28    # "$i$f$fastAny":I
    .restart local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v1    # "$i$f$fastAny":I
    .local v6, "$i$f$any":I
    :cond_7
    move-object/from16 v23, v0

    move/from16 v28, v1

    move/from16 v18, v6

    .line 207
    .end local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v1    # "$i$f$fastAny":I
    .end local v6    # "$i$f$any":I
    .end local v14    # "i$iv$iv$iv$iv":I
    .restart local v18    # "$i$f$any":I
    .restart local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v28    # "$i$f$fastAny":I
    :cond_8
    nop

    .line 208
    .end local v10    # "this_$iv$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v11    # "$i$f$forEachIndex":I
    .end local v12    # "m$iv$iv$iv$iv":[J
    .end local v13    # "lastIndex$iv$iv$iv$iv":I
    :cond_9
    nop

    .line 209
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v8    # "$i$f$forEach":I
    .end local v9    # "elements$iv$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .end local v2    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v18    # "$i$f$any":I
    goto :goto_9

    .line 210
    .end local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v28    # "$i$f$fastAny":I
    .restart local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v1    # "$i$f$fastAny":I
    :cond_a
    move-object/from16 v23, v0

    move/from16 v28, v1

    const/16 p2, 0x4

    .end local v0    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v1    # "$i$f$fastAny":I
    .restart local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .restart local v28    # "$i$f$fastAny":I
    move-object/from16 v0, v23

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any$iv$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 211
    .local v1, "$i$f$any":I
    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_b

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v4, 0x0

    goto :goto_9

    .line 212
    :cond_b
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv$iv":Ljava/lang/Object;
    move-object v4, v3

    .restart local v4    # "it":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 126
    .local v5, "$i$a$-fastAny-SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1$maybeObserved$1":I
    instance-of v6, v4, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v6, :cond_e

    move-object v6, v4

    check-cast v6, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    sget-object v7, Landroidx/compose/runtime/snapshots/ReaderKind;->Companion:Landroidx/compose/runtime/snapshots/ReaderKind$Companion;

    .local v7, "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    const/4 v8, 0x0

    .line 201
    .local v8, "$i$f$getSnapshotFlow-6f8NoZ8":I
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v7

    .line 126
    .end local v7    # "this_$iv":Landroidx/compose/runtime/snapshots/ReaderKind$Companion;
    .end local v8    # "$i$f$getSnapshotFlow-6f8NoZ8":I
    invoke-virtual {v6, v7}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->isReadIn-h_f27i8$runtime_release(I)Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_7

    :cond_d
    const/4 v4, 0x0

    goto :goto_8

    :cond_e
    :goto_7
    const/4 v4, 0x1

    .line 212
    .end local v4    # "it":Ljava/lang/Object;
    .end local v5    # "$i$a$-fastAny-SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1$maybeObserved$1":I
    :goto_8
    if-eqz v4, :cond_c

    const/4 v4, 0x1

    goto :goto_9

    .line 213
    .end local v3    # "element$iv$iv":Ljava/lang/Object;
    :cond_f
    const/4 v4, 0x0

    .line 214
    .end local v0    # "$this$any$iv$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any":I
    :goto_9
    nop

    .line 126
    .end local v23    # "$this$fastAny$iv":Ljava/util/Set;
    .end local v28    # "$i$f$fastAny":I
    nop

    .line 125
    nop

    .line 128
    .local v4, "maybeObserved":Z
    if-eqz v4, :cond_10

    .line 129
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1;->$appliedChanges:Lkotlinx/coroutines/channels/Channel;

    move-object/from16 v2, p1

    invoke-interface {v1, v2}, Lkotlinx/coroutines/channels/Channel;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 128
    :cond_10
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    .line 131
    :goto_a
    return-void
.end method
