.class final synthetic Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt;
.super Ljava/lang/Object;
.source "SnapshotFlow.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,179:1\n1247#2,6:180\n256#3,2:186\n231#3,3:188\n200#3,7:191\n211#3,3:199\n214#3,9:203\n234#3:212\n258#3:213\n1399#4:198\n1270#4:202\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n65#1:180,6\n178#1:186,2\n178#1:188,3\n178#1:191,7\n178#1:199,3\n178#1:203,9\n178#1:212\n178#1:213\n178#1:198\n178#1:202\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0002\u001a \u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0004\u001a?\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0008\u0008\u0000\u0010\u0002*\u0002H\u0007\"\u0004\u0008\u0001\u0010\u0007*\u0008\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0008\u001a\u0002H\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a-\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u000c2\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u0007\u00a2\u0006\u0002\u0010\r\u001a%\u0010\u000e\u001a\u00020\u000f*\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0013H\u0002\u00a2\u0006\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "snapshotFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "T",
        "block",
        "Lkotlin/Function0;",
        "collectAsState",
        "Landroidx/compose/runtime/State;",
        "R",
        "initial",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;",
        "intersects",
        "",
        "Landroidx/collection/MutableScatterSet;",
        "",
        "set",
        "",
        "intersects$SnapshotStateKt__SnapshotFlowKt",
        "runtime_release"
    }
    k = 0x5
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
    xs = "androidx/compose/runtime/SnapshotStateKt"
.end annotation


# direct methods
.method public static final synthetic access$intersects(Landroidx/collection/MutableScatterSet;Ljava/util/Set;)Z
    .locals 1
    .param p0, "$receiver"    # Landroidx/collection/MutableScatterSet;
    .param p1, "set"    # Ljava/util/Set;

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt;->intersects$SnapshotStateKt__SnapshotFlowKt(Landroidx/collection/MutableScatterSet;Ljava/util/Set;)Z

    move-result v0

    return v0
.end method

.method public static final collectAsState(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 7
    .param p0, "$this$collectAsState"    # Lkotlinx/coroutines/flow/Flow;
    .param p1, "initial"    # Ljava/lang/Object;
    .param p2, "context"    # Lkotlin/coroutines/CoroutineContext;
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::TR;R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/Flow<",
            "+TT;>;TR;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "TR;>;"
        }
    .end annotation

    .line 65
    const v0, -0x24285d4a

    const-string v1, "C(collectAsState)P(1)64@2575L153,64@2538L190:SnapshotFlow.kt#9igjgp"

    invoke-static {p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 63
    sget-object p5, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    move-object p2, p5

    check-cast p2, Lkotlin/coroutines/CoroutineContext;

    move-object v3, p2

    goto :goto_0

    .line 65
    :cond_0
    move-object v3, p2

    .line 63
    .end local p2    # "context":Lkotlin/coroutines/CoroutineContext;
    .local v3, "context":Lkotlin/coroutines/CoroutineContext;
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 65
    const/4 p2, -0x1

    const-string p5, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:64)"

    invoke-static {v0, p4, p2, p5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1
    const p2, -0x1db75e3b

    const-string p5, "CC(remember):SnapshotFlow.kt#9igjgp"

    invoke-static {p3, p2, p5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p3, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p2, p5

    .local p2, "invalid$iv":Z
    move-object p5, p3

    .local p5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v0, 0x0

    .line 180
    .local v0, "$i$f$cache":I
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 181
    .local v2, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p2, :cond_3

    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_2

    goto :goto_1

    .line 185
    :cond_2
    goto :goto_2

    .line 182
    :cond_3
    :goto_1
    const/4 v4, 0x0

    .line 65
    .local v4, "$i$a$-cache-SnapshotStateKt__SnapshotFlowKt$collectAsState$1":I
    new-instance v5, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1;

    const/4 v6, 0x0

    invoke-direct {v5, v3, p0, v6}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1;-><init>(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 182
    .end local v4    # "$i$a$-cache-SnapshotStateKt__SnapshotFlowKt$collectAsState$1":I
    nop

    .line 183
    .local v5, "value$iv":Ljava/lang/Object;
    invoke-interface {p5, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 184
    move-object v1, v5

    .line 180
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v2    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v5    # "value$iv":Ljava/lang/Object;
    :goto_2
    nop

    .line 65
    .end local v0    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    .end local p5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-static {p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    shr-int/lit8 p2, p4, 0x3

    and-int/lit8 p2, p2, 0x8

    shr-int/lit8 p5, p4, 0x3

    and-int/lit8 p5, p5, 0xe

    or-int/2addr p2, p5

    shl-int/lit8 p5, p4, 0x3

    and-int/lit8 p5, p5, 0x70

    or-int/2addr p2, p5

    and-int/lit16 p5, p4, 0x380

    or-int v6, p2, p5

    move-object v2, p0

    move-object v1, p1

    move-object v5, p3

    .end local p0    # "$this$collectAsState":Lkotlinx/coroutines/flow/Flow;
    .end local p1    # "initial":Ljava/lang/Object;
    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "initial":Ljava/lang/Object;
    .local v2, "$this$collectAsState":Lkotlinx/coroutines/flow/Flow;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v1 .. v6}, Landroidx/compose/runtime/SnapshotStateKt;->produceState(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object p0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object p0
.end method

.method public static final collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
    .locals 7
    .param p0, "$this$collectAsState"    # Lkotlinx/coroutines/flow/StateFlow;
    .param p1, "context"    # Lkotlin/coroutines/CoroutineContext;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT;>;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/runtime/State<",
            "TT;>;"
        }
    .end annotation

    .line 49
    const v0, -0x55d2e28f

    const-string v1, "C(collectAsState)48@1905L30:SnapshotFlow.kt#9igjgp"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 48
    sget-object p4, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    move-object p1, p4

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    move-object v3, p1

    goto :goto_0

    .line 49
    :cond_0
    move-object v3, p1

    .line 48
    .end local p1    # "context":Lkotlin/coroutines/CoroutineContext;
    .local v3, "context":Lkotlin/coroutines/CoroutineContext;
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 49
    const/4 p1, -0x1

    const-string p4, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:48)"

    invoke-static {v0, p3, p1, p4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1
    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    and-int/lit8 p1, p3, 0xe

    shl-int/lit8 p4, p3, 0x3

    and-int/lit16 p4, p4, 0x380

    or-int v5, p1, p4

    const/4 v6, 0x0

    move-object v4, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v1 .. v6}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object p1
.end method

.method private static final intersects$SnapshotStateKt__SnapshotFlowKt(Landroidx/collection/MutableScatterSet;Ljava/util/Set;)Z
    .locals 24
    .param p0, "$this$intersects"    # Landroidx/collection/MutableScatterSet;
    .param p1, "set"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterSet<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 178
    move-object/from16 v0, p0

    check-cast v0, Landroidx/collection/ScatterSet;

    .local v0, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v1, 0x0

    .line 186
    .local v1, "$i$f$any":I
    nop

    .line 187
    move-object v2, v0

    .local v2, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v3, 0x0

    .line 188
    .local v3, "$i$f$forEach":I
    nop

    .line 189
    iget-object v4, v2, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 190
    .local v4, "elements$iv$iv":[Ljava/lang/Object;
    move-object v5, v2

    .local v5, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v6, 0x0

    .line 191
    .local v6, "$i$f$forEachIndex":I
    nop

    .line 192
    iget-object v7, v5, Landroidx/collection/ScatterSet;->metadata:[J

    .line 193
    .local v7, "m$iv$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 195
    .local v8, "lastIndex$iv$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv$iv":I
    if-gt v9, v8, :cond_5

    .line 196
    :goto_0
    aget-wide v11, v7, v9

    .line 197
    .local v11, "slot$iv$iv$iv":J
    move-wide v13, v11

    .local v13, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/4 v15, 0x0

    .line 198
    .local v15, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v16, v11

    .end local v11    # "slot$iv$iv$iv":J
    .local v16, "slot$iv$iv$iv":J
    not-long v10, v13

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v13

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v10, v10, v18

    .line 197
    .end local v13    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v15    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v10, v10, v18

    if-eqz v10, :cond_4

    .line 199
    sub-int v10, v9, v8

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    .line 200
    .local v10, "bitCount$iv$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv$iv":I
    :goto_1
    if-ge v12, v10, :cond_3

    .line 201
    const-wide/16 v13, 0xff

    and-long v13, v16, v13

    .local v13, "value$iv$iv$iv$iv":J
    const/4 v15, 0x0

    .line 202
    .local v15, "$i$f$isFull":I
    const-wide/16 v18, 0x80

    cmp-long v18, v13, v18

    const/16 v19, 0x1

    if-gez v18, :cond_0

    move/from16 v13, v19

    goto :goto_2

    :cond_0
    const/4 v13, 0x0

    .line 201
    .end local v13    # "value$iv$iv$iv$iv":J
    .end local v15    # "$i$f$isFull":I
    :goto_2
    if-eqz v13, :cond_2

    .line 203
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 204
    .local v13, "index$iv$iv$iv":I
    move v14, v13

    .local v14, "index$iv$iv":I
    const/4 v15, 0x0

    .line 190
    .local v15, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    aget-object v18, v4, v14

    .local v18, "element$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 187
    .local v20, "$i$a$-forEach-ScatterSet$any$2$iv":I
    move-object/from16 v21, v18

    .local v21, "it":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 178
    .local v22, "$i$a$-any-SnapshotStateKt__SnapshotFlowKt$intersects$1":I
    move-object/from16 v23, v21

    move-object/from16 v21, v0

    move-object/from16 v0, v23

    move/from16 v23, v11

    move-object/from16 v11, p1

    .local v0, "it":Ljava/lang/Object;
    .local v21, "this_$iv":Landroidx/collection/ScatterSet;
    invoke-interface {v11, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 187
    .end local v0    # "it":Ljava/lang/Object;
    .end local v22    # "$i$a$-any-SnapshotStateKt__SnapshotFlowKt$intersects$1":I
    if-eqz v0, :cond_1

    move/from16 v10, v19

    goto :goto_5

    .line 190
    .end local v18    # "element$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-forEach-ScatterSet$any$2$iv":I
    :cond_1
    nop

    .line 204
    .end local v14    # "index$iv$iv":I
    .end local v15    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_3

    .line 201
    .end local v13    # "index$iv$iv$iv":I
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v0, "this_$iv":Landroidx/collection/ScatterSet;
    :cond_2
    move-object/from16 v21, v0

    move/from16 v23, v11

    move-object/from16 v11, p1

    .line 206
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_3
    shr-long v16, v16, v23

    .line 200
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, v21

    move/from16 v11, v23

    goto :goto_1

    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_3
    move-object/from16 v21, v0

    move/from16 v23, v11

    move-object/from16 v11, p1

    .line 208
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v12    # "j$iv$iv$iv":I
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    move/from16 v0, v23

    if-ne v10, v0, :cond_7

    goto :goto_4

    .line 197
    .end local v10    # "bitCount$iv$iv$iv":I
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_4
    move-object/from16 v11, p1

    move-object/from16 v21, v0

    .line 195
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v16    # "slot$iv$iv$iv":J
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_4
    if-eq v9, v8, :cond_6

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, v21

    goto :goto_0

    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_5
    move-object/from16 v11, p1

    move-object/from16 v21, v0

    .line 211
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v9    # "i$iv$iv$iv":I
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_6
    nop

    .line 212
    .end local v5    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v6    # "$i$f$forEachIndex":I
    .end local v7    # "m$iv$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv$iv":I
    :cond_7
    nop

    .line 213
    .end local v2    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v3    # "$i$f$forEach":I
    .end local v4    # "elements$iv$iv":[Ljava/lang/Object;
    const/4 v10, 0x0

    .line 178
    .end local v1    # "$i$f$any":I
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_5
    return v10
.end method

.method public static final snapshotFlow(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;
    .locals 2
    .param p0, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)",
            "Lkotlinx/coroutines/flow/Flow<",
            "TT;>;"
        }
    .end annotation

    .line 108
    new-instance v0, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 176
    return-object v0
.end method
