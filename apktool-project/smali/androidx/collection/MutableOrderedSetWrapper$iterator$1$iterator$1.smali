.class final Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "OrderedScatterSet.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/collection/MutableOrderedSetWrapper$iterator$1;-><init>(Landroidx/collection/MutableOrderedSetWrapper;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/sequences/SequenceScope<",
        "-TE;>;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n+ 2 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 3 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1511:1\n255#2,6:1512\n261#2,4:1519\n1123#3:1518\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1\n*L\n1487#1:1512,6\n1487#1:1519,4\n1487#1:1518\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "E",
        "Lkotlin/sequences/SequenceScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1"
    f = "OrderedScatterSet.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x5d1
    }
    m = "invokeSuspend"
    n = {
        "$this$iterator",
        "nodes$iv",
        "previousNode$iv"
    }
    s = {
        "L$0",
        "L$3",
        "I$0"
    }
.end annotation


# instance fields
.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/collection/MutableOrderedSetWrapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableOrderedSetWrapper<",
            "TE;>;"
        }
    .end annotation
.end field

.field final synthetic this$1:Landroidx/collection/MutableOrderedSetWrapper$iterator$1;


# direct methods
.method constructor <init>(Landroidx/collection/MutableOrderedSetWrapper;Landroidx/collection/MutableOrderedSetWrapper$iterator$1;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableOrderedSetWrapper<",
            "TE;>;",
            "Landroidx/collection/MutableOrderedSetWrapper$iterator$1;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableOrderedSetWrapper;

    iput-object p2, p0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->this$1:Landroidx/collection/MutableOrderedSetWrapper$iterator$1;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;

    iget-object v1, p0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableOrderedSetWrapper;

    iget-object v2, p0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->this$1:Landroidx/collection/MutableOrderedSetWrapper$iterator$1;

    invoke-direct {v0, v1, v2, p2}, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;-><init>(Landroidx/collection/MutableOrderedSetWrapper;Landroidx/collection/MutableOrderedSetWrapper$iterator$1;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/sequences/SequenceScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/SequenceScope<",
            "-TE;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1486
    iget v2, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->label:I

    packed-switch v2, :pswitch_data_0

    .end local p0    # "this":Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .restart local p0    # "this":Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;
    :pswitch_0
    move-object/from16 v2, p1

    .local v2, "$result":Ljava/lang/Object;
    const/4 v3, 0x0

    .local v3, "$i$f$forEachIndex$collection":I
    const/4 v4, 0x0

    .local v4, "$i$a$-forEachIndex$collection-MutableOrderedSetWrapper$iterator$1$iterator$1$1":I
    iget v5, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->I$0:I

    .local v5, "previousNode$iv":I
    iget-object v6, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$3:Ljava/lang/Object;

    check-cast v6, [J

    .local v6, "nodes$iv":[J
    iget-object v7, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$2:Ljava/lang/Object;

    check-cast v7, Landroidx/collection/MutableOrderedSetWrapper;

    iget-object v8, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$1:Ljava/lang/Object;

    check-cast v8, Landroidx/collection/MutableOrderedSetWrapper$iterator$1;

    iget-object v9, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lkotlin/sequences/SequenceScope;

    .local v9, "$this$iterator":Lkotlin/sequences/SequenceScope;
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v0

    goto :goto_1

    .end local v2    # "$result":Ljava/lang/Object;
    .end local v3    # "$i$f$forEachIndex$collection":I
    .end local v4    # "$i$a$-forEachIndex$collection-MutableOrderedSetWrapper$iterator$1$iterator$1$1":I
    .end local v5    # "previousNode$iv":I
    .end local v6    # "nodes$iv":[J
    .end local v9    # "$this$iterator":Lkotlin/sequences/SequenceScope;
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    .restart local v2    # "$result":Ljava/lang/Object;
    iget-object v3, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lkotlin/sequences/SequenceScope;

    .line 1487
    .local v3, "$this$iterator":Lkotlin/sequences/SequenceScope;
    iget-object v4, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableOrderedSetWrapper;

    invoke-static {v4}, Landroidx/collection/MutableOrderedSetWrapper;->access$getParent$p(Landroidx/collection/MutableOrderedSetWrapper;)Landroidx/collection/MutableOrderedScatterSet;

    move-result-object v4

    check-cast v4, Landroidx/collection/OrderedScatterSet;

    .local v4, "this_$iv":Landroidx/collection/OrderedScatterSet;
    iget-object v5, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->this$1:Landroidx/collection/MutableOrderedSetWrapper$iterator$1;

    iget-object v6, v0, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->this$0:Landroidx/collection/MutableOrderedSetWrapper;

    const/4 v7, 0x0

    .line 1512
    .local v7, "$i$f$forEachIndex$collection":I
    nop

    .line 1513
    iget-object v8, v4, Landroidx/collection/OrderedScatterSet;->nodes:[J

    .line 1515
    .local v8, "nodes$iv":[J
    iget v9, v4, Landroidx/collection/OrderedScatterSet;->tail:I

    move-object v4, v3

    move v3, v7

    move-object v7, v6

    move-object v6, v8

    move-object v8, v5

    move-object v5, v0

    .line 1516
    .end local v7    # "$i$f$forEachIndex$collection":I
    .end local v8    # "nodes$iv":[J
    .end local p0    # "this":Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;
    .local v3, "$i$f$forEachIndex$collection":I
    .local v4, "$this$iterator":Lkotlin/sequences/SequenceScope;
    .local v5, "this":Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;
    .restart local v6    # "nodes$iv":[J
    .local v9, "candidate$iv":I
    :goto_0
    const v10, 0x7fffffff

    if-eq v9, v10, :cond_1

    .line 1517
    aget-wide v10, v6, v9

    .local v10, "$this$previousNode$iv$iv":J
    const/4 v12, 0x0

    .line 1518
    .local v12, "$i$f$getPreviousNode":I
    const/16 v13, 0x1f

    shr-long v13, v10, v13

    const-wide/32 v15, 0x7fffffff

    and-long/2addr v13, v15

    long-to-int v10, v13

    .line 1517
    .end local v10    # "$this$previousNode$iv$iv":J
    .end local v12    # "$i$f$getPreviousNode":I
    nop

    .line 1519
    .local v10, "previousNode$iv":I
    nop

    .local v9, "index":I
    const/4 v11, 0x0

    .line 1488
    .local v11, "$i$a$-forEachIndex$collection-MutableOrderedSetWrapper$iterator$1$iterator$1$1":I
    invoke-virtual {v8, v9}, Landroidx/collection/MutableOrderedSetWrapper$iterator$1;->setCurrent(I)V

    .line 1489
    invoke-static {v7}, Landroidx/collection/MutableOrderedSetWrapper;->access$getParent$p(Landroidx/collection/MutableOrderedSetWrapper;)Landroidx/collection/MutableOrderedScatterSet;

    move-result-object v12

    iget-object v12, v12, Landroidx/collection/MutableOrderedScatterSet;->elements:[Ljava/lang/Object;

    aget-object v12, v12, v9

    iput-object v4, v5, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$0:Ljava/lang/Object;

    iput-object v8, v5, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$1:Ljava/lang/Object;

    iput-object v7, v5, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$2:Ljava/lang/Object;

    iput-object v6, v5, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->L$3:Ljava/lang/Object;

    iput v10, v5, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->I$0:I

    const/4 v13, 0x1

    iput v13, v5, Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;->label:I

    invoke-virtual {v4, v12, v5}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    .end local v9    # "index":I
    if-ne v9, v1, :cond_0

    .line 1486
    return-object v1

    .line 1489
    :cond_0
    move-object v9, v6

    move-object v6, v5

    move v5, v10

    move-object v10, v8

    move-object v8, v7

    move-object v7, v9

    move-object v9, v4

    move v4, v11

    .line 1490
    .end local v10    # "previousNode$iv":I
    .end local v11    # "$i$a$-forEachIndex$collection-MutableOrderedSetWrapper$iterator$1$iterator$1$1":I
    .local v4, "$i$a$-forEachIndex$collection-MutableOrderedSetWrapper$iterator$1$iterator$1$1":I
    .local v5, "previousNode$iv":I
    .local v6, "this":Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;
    .local v7, "nodes$iv":[J
    .local v9, "$this$iterator":Lkotlin/sequences/SequenceScope;
    :goto_1
    nop

    .line 1519
    .end local v4    # "$i$a$-forEachIndex$collection-MutableOrderedSetWrapper$iterator$1$iterator$1$1":I
    nop

    .line 1520
    move-object v4, v9

    move v9, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    .local v5, "candidate$iv":I
    goto :goto_0

    .line 1522
    .end local v7    # "nodes$iv":[J
    .local v4, "$this$iterator":Lkotlin/sequences/SequenceScope;
    .local v5, "this":Landroidx/collection/MutableOrderedSetWrapper$iterator$1$iterator$1;
    .local v6, "nodes$iv":[J
    .local v9, "candidate$iv":I
    :cond_1
    nop

    .line 1491
    .end local v3    # "$i$f$forEachIndex$collection":I
    .end local v6    # "nodes$iv":[J
    .end local v9    # "candidate$iv":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
