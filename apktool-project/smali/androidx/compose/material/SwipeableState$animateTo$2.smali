.class final Landroidx/compose/material/SwipeableState$animateTo$2;
.super Ljava/lang/Object;
.source "Swipeable.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SwipeableState;->animateTo(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$animateTo$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,881:1\n1#2:882\n478#3,7:883\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState$animateTo$2\n*L\n334#1:883,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "anchors",
        "",
        "",
        "emit",
        "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
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
.field final synthetic $anim:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $targetValue:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroidx/compose/material/SwipeableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/material/SwipeableState<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Landroidx/compose/material/SwipeableState;Landroidx/compose/animation/core/AnimationSpec;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroidx/compose/material/SwipeableState<",
            "TT;>;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SwipeableState$animateTo$2;->$targetValue:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/compose/material/SwipeableState$animateTo$2;->this$0:Landroidx/compose/material/SwipeableState;

    iput-object p3, p0, Landroidx/compose/material/SwipeableState$animateTo$2;->$anim:Landroidx/compose/animation/core/AnimationSpec;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 323
    move-object v0, p1

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p0, v0, p2}, Landroidx/compose/material/SwipeableState$animateTo$2;->emit(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final emit(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Float;",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p2

    instance-of v0, v1, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;

    iget v2, v0, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v2, v0, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->label:I

    sub-int/2addr v2, v3

    iput v2, v0, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->label:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v1}, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;-><init>(Landroidx/compose/material/SwipeableState$animateTo$2;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v3, v0

    .local v3, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v4, v3, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->result:Ljava/lang/Object;

    .local v4, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 323
    iget v5, v3, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->label:I

    const/4 v6, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v8, 0x1

    packed-switch v5, :pswitch_data_0

    .end local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v4    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v4    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v0, v3, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->L$1:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/Map;

    .local v5, "anchors":Ljava/util/Map;
    iget-object v0, v3, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->L$0:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Landroidx/compose/material/SwipeableState$animateTo$2;

    .local v9, "this":Landroidx/compose/material/SwipeableState$animateTo$2;
    :try_start_0
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .end local v5    # "anchors":Ljava/util/Map;
    .end local v9    # "this":Landroidx/compose/material/SwipeableState$animateTo$2;
    :pswitch_1
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v9, p0

    .restart local v9    # "this":Landroidx/compose/material/SwipeableState$animateTo$2;
    move-object/from16 v5, p1

    .line 324
    .restart local v5    # "anchors":Ljava/util/Map;
    nop

    .line 325
    :try_start_1
    iget-object v10, v9, Landroidx/compose/material/SwipeableState$animateTo$2;->$targetValue:Ljava/lang/Object;

    invoke-static {v5, v10}, Landroidx/compose/material/SwipeableKt;->access$getOffset(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v10

    .line 326
    .local v10, "targetOffset":Ljava/lang/Float;
    if-eqz v10, :cond_6

    .line 327
    iget-object v11, v9, Landroidx/compose/material/SwipeableState$animateTo$2;->this$0:Landroidx/compose/material/SwipeableState;

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v12

    iget-object v13, v9, Landroidx/compose/material/SwipeableState$animateTo$2;->$anim:Landroidx/compose/animation/core/AnimationSpec;

    iput-object v9, v3, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->L$0:Ljava/lang/Object;

    iput-object v5, v3, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->L$1:Ljava/lang/Object;

    iput v8, v3, Landroidx/compose/material/SwipeableState$animateTo$2$emit$1;->label:I

    invoke-static {v11, v12, v13, v3}, Landroidx/compose/material/SwipeableState;->access$animateInternalToOffset(Landroidx/compose/material/SwipeableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v10    # "targetOffset":Ljava/lang/Float;
    if-ne v11, v0, :cond_1

    .line 323
    return-object v0

    .line 329
    :cond_1
    :goto_1
    iget-object v0, v9, Landroidx/compose/material/SwipeableState$animateTo$2;->this$0:Landroidx/compose/material/SwipeableState;

    invoke-static {v0}, Landroidx/compose/material/SwipeableState;->access$getAbsoluteOffset$p(Landroidx/compose/material/SwipeableState;)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result v0

    .line 331
    .local v0, "endOffset":F
    nop

    .line 334
    .local v5, "$this$filterKeys$iv":Ljava/util/Map;
    const/4 v10, 0x0

    .line 883
    .local v10, "$i$f$filterKeys":I
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 884
    .local v11, "result$iv":Ljava/util/LinkedHashMap;
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .end local v5    # "$this$filterKeys$iv":Ljava/util/Map;
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 885
    .local v12, "entry$iv":Ljava/util/Map$Entry;
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    .local v13, "anchorOffset":F
    const/4 v14, 0x0

    .line 334
    .local v14, "$i$a$-filterKeys-SwipeableState$animateTo$2$endValue$1":I
    sub-float v15, v13, v0

    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v13

    .end local v13    # "anchorOffset":F
    cmpg-float v13, v13, v7

    if-gez v13, :cond_3

    move v13, v8

    goto :goto_3

    :cond_3
    move v13, v6

    .line 885
    .end local v14    # "$i$a$-filterKeys-SwipeableState$animateTo$2$endValue$1":I
    :goto_3
    if-eqz v13, :cond_2

    .line 886
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v11, v13, v14}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 889
    .end local v0    # "endOffset":F
    .end local v12    # "entry$iv":Ljava/util/Map$Entry;
    :cond_4
    move-object v0, v11

    check-cast v0, Ljava/util/Map;

    .line 334
    .end local v10    # "$i$f$filterKeys":I
    .end local v11    # "result$iv":Ljava/util/LinkedHashMap;
    nop

    .line 335
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 336
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    .line 331
    if-nez v0, :cond_5

    .line 336
    iget-object v0, v9, Landroidx/compose/material/SwipeableState$animateTo$2;->this$0:Landroidx/compose/material/SwipeableState;

    invoke-virtual {v0}, Landroidx/compose/material/SwipeableState;->getCurrentValue()Ljava/lang/Object;

    move-result-object v0

    .line 331
    :cond_5
    nop

    .line 330
    nop

    .line 337
    .local v0, "endValue":Ljava/lang/Object;
    iget-object v5, v9, Landroidx/compose/material/SwipeableState$animateTo$2;->this$0:Landroidx/compose/material/SwipeableState;

    invoke-static {v5, v0}, Landroidx/compose/material/SwipeableState;->access$setCurrentValue(Landroidx/compose/material/SwipeableState;Ljava/lang/Object;)V

    .line 338
    .end local v0    # "endValue":Ljava/lang/Object;
    .end local v9    # "this":Landroidx/compose/material/SwipeableState$animateTo$2;
    nop

    .line 339
    .restart local v9    # "this":Landroidx/compose/material/SwipeableState$animateTo$2;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 882
    .local v5, "anchors":Ljava/util/Map;
    .local v10, "targetOffset":Ljava/lang/Float;
    :cond_6
    nop

    .end local v10    # "targetOffset":Ljava/lang/Float;
    const/4 v0, 0x0

    .line 326
    .local v0, "$i$a$-requireNotNull-SwipeableState$animateTo$2$1":I
    :try_start_2
    const-string v10, "The target value must have an associated anchor."

    .end local v0    # "$i$a$-requireNotNull-SwipeableState$animateTo$2$1":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .end local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v4    # "$result":Ljava/lang/Object;
    .end local v5    # "anchors":Ljava/util/Map;
    .end local v9    # "this":Landroidx/compose/material/SwipeableState$animateTo$2;
    .end local p2    # "$completion":Lkotlin/coroutines/Continuation;
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 329
    .restart local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v4    # "$result":Ljava/lang/Object;
    .restart local v5    # "anchors":Ljava/util/Map;
    .restart local v9    # "this":Landroidx/compose/material/SwipeableState$animateTo$2;
    .restart local p2    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_0
    move-exception v0

    iget-object v10, v9, Landroidx/compose/material/SwipeableState$animateTo$2;->this$0:Landroidx/compose/material/SwipeableState;

    invoke-static {v10}, Landroidx/compose/material/SwipeableState;->access$getAbsoluteOffset$p(Landroidx/compose/material/SwipeableState;)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v10

    invoke-interface {v10}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result v10

    .line 331
    .local v10, "endOffset":F
    nop

    .line 334
    .local v5, "$this$filterKeys$iv":Ljava/util/Map;
    const/4 v11, 0x0

    .line 883
    .local v11, "$i$f$filterKeys":I
    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 884
    .local v12, "result$iv":Ljava/util/LinkedHashMap;
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .end local v5    # "$this$filterKeys$iv":Ljava/util/Map;
    :cond_7
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    .line 885
    .local v13, "entry$iv":Ljava/util/Map$Entry;
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    move-result v14

    .local v14, "anchorOffset":F
    const/4 v15, 0x0

    .line 334
    .local v15, "$i$a$-filterKeys-SwipeableState$animateTo$2$endValue$1":I
    sub-float v16, v14, v10

    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(F)F

    move-result v14

    .end local v14    # "anchorOffset":F
    cmpg-float v14, v14, v7

    if-gez v14, :cond_8

    move v14, v8

    goto :goto_5

    :cond_8
    move v14, v6

    .line 885
    .end local v15    # "$i$a$-filterKeys-SwipeableState$animateTo$2$endValue$1":I
    :goto_5
    if-eqz v14, :cond_7

    .line 886
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v12, v14, v15}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 889
    .end local v10    # "endOffset":F
    .end local v13    # "entry$iv":Ljava/util/Map$Entry;
    :cond_9
    move-object v5, v12

    check-cast v5, Ljava/util/Map;

    .line 334
    .end local v11    # "$i$f$filterKeys":I
    .end local v12    # "result$iv":Ljava/util/LinkedHashMap;
    nop

    .line 335
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 336
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v5

    .line 331
    if-nez v5, :cond_a

    .line 336
    iget-object v5, v9, Landroidx/compose/material/SwipeableState$animateTo$2;->this$0:Landroidx/compose/material/SwipeableState;

    invoke-virtual {v5}, Landroidx/compose/material/SwipeableState;->getCurrentValue()Ljava/lang/Object;

    move-result-object v5

    .line 331
    :cond_a
    nop

    .line 330
    nop

    .line 337
    .local v5, "endValue":Ljava/lang/Object;
    iget-object v6, v9, Landroidx/compose/material/SwipeableState$animateTo$2;->this$0:Landroidx/compose/material/SwipeableState;

    invoke-static {v6, v5}, Landroidx/compose/material/SwipeableState;->access$setCurrentValue(Landroidx/compose/material/SwipeableState;Ljava/lang/Object;)V

    .end local v5    # "endValue":Ljava/lang/Object;
    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
