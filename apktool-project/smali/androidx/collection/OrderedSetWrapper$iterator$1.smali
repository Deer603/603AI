.class final Landroidx/collection/OrderedSetWrapper$iterator$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "OrderedScatterSet.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/collection/OrderedSetWrapper;->iterator()Ljava/util/Iterator;
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
    value = "SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedSetWrapper$iterator$1\n+ 2 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 3 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1511:1\n301#2,7:1512\n308#2,4:1520\n1123#3:1519\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedSetWrapper$iterator$1\n*L\n1454#1:1512,7\n1454#1:1520,4\n1454#1:1519\n*E\n"
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
    c = "androidx.collection.OrderedSetWrapper$iterator$1"
    f = "OrderedScatterSet.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x5ae
    }
    m = "invokeSuspend"
    n = {
        "$this$iterator",
        "elements$iv",
        "nodes$iv",
        "previousNode$iv"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0"
    }
.end annotation


# instance fields
.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/collection/OrderedSetWrapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/OrderedSetWrapper<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/collection/OrderedSetWrapper;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/OrderedSetWrapper<",
            "TE;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/collection/OrderedSetWrapper$iterator$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/collection/OrderedSetWrapper$iterator$1;->this$0:Landroidx/collection/OrderedSetWrapper;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p2}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance v0, Landroidx/collection/OrderedSetWrapper$iterator$1;

    iget-object v1, p0, Landroidx/collection/OrderedSetWrapper$iterator$1;->this$0:Landroidx/collection/OrderedSetWrapper;

    invoke-direct {v0, v1, p2}, Landroidx/collection/OrderedSetWrapper$iterator$1;-><init>(Landroidx/collection/OrderedSetWrapper;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Landroidx/collection/OrderedSetWrapper$iterator$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/sequences/SequenceScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/collection/OrderedSetWrapper$iterator$1;->invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Landroidx/collection/OrderedSetWrapper$iterator$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Landroidx/collection/OrderedSetWrapper$iterator$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Landroidx/collection/OrderedSetWrapper$iterator$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 1454
    iget v1, p0, Landroidx/collection/OrderedSetWrapper$iterator$1;->label:I

    packed-switch v1, :pswitch_data_0

    .end local p0    # "this":Landroidx/collection/OrderedSetWrapper$iterator$1;
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .restart local p0    # "this":Landroidx/collection/OrderedSetWrapper$iterator$1;
    .local p1, "$result":Ljava/lang/Object;
    :pswitch_0
    const/4 v1, 0x0

    .local v1, "$i$f$forEach":I
    const/4 v2, 0x0

    .local v2, "$i$a$-forEach-OrderedSetWrapper$iterator$1$1":I
    iget v3, p0, Landroidx/collection/OrderedSetWrapper$iterator$1;->I$0:I

    .local v3, "previousNode$iv":I
    iget-object v4, p0, Landroidx/collection/OrderedSetWrapper$iterator$1;->L$2:Ljava/lang/Object;

    check-cast v4, [J

    .local v4, "nodes$iv":[J
    iget-object v5, p0, Landroidx/collection/OrderedSetWrapper$iterator$1;->L$1:Ljava/lang/Object;

    check-cast v5, [Ljava/lang/Object;

    .local v5, "elements$iv":[Ljava/lang/Object;
    iget-object v6, p0, Landroidx/collection/OrderedSetWrapper$iterator$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lkotlin/sequences/SequenceScope;

    .local v6, "$this$iterator":Lkotlin/sequences/SequenceScope;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v5

    move-object v5, v4

    move-object v4, p0

    goto :goto_1

    .end local v1    # "$i$f$forEach":I
    .end local v2    # "$i$a$-forEach-OrderedSetWrapper$iterator$1$1":I
    .end local v3    # "previousNode$iv":I
    .end local v4    # "nodes$iv":[J
    .end local v5    # "elements$iv":[Ljava/lang/Object;
    .end local v6    # "$this$iterator":Lkotlin/sequences/SequenceScope;
    .end local p1    # "$result":Ljava/lang/Object;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .restart local p1    # "$result":Ljava/lang/Object;
    iget-object v1, p0, Landroidx/collection/OrderedSetWrapper$iterator$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlin/sequences/SequenceScope;

    .local v1, "$this$iterator":Lkotlin/sequences/SequenceScope;
    iget-object v2, p0, Landroidx/collection/OrderedSetWrapper$iterator$1;->this$0:Landroidx/collection/OrderedSetWrapper;

    invoke-static {v2}, Landroidx/collection/OrderedSetWrapper;->access$getParent$p(Landroidx/collection/OrderedSetWrapper;)Landroidx/collection/OrderedScatterSet;

    move-result-object v2

    .local v2, "this_$iv":Landroidx/collection/OrderedScatterSet;
    const/4 v3, 0x0

    .line 1512
    .local v3, "$i$f$forEach":I
    nop

    .line 1513
    iget-object v4, v2, Landroidx/collection/OrderedScatterSet;->elements:[Ljava/lang/Object;

    .line 1514
    .local v4, "elements$iv":[Ljava/lang/Object;
    iget-object v5, v2, Landroidx/collection/OrderedScatterSet;->nodes:[J

    .line 1516
    .local v5, "nodes$iv":[J
    iget v6, v2, Landroidx/collection/OrderedScatterSet;->tail:I

    move-object v2, v5

    move-object v5, v4

    move-object v4, v2

    move-object v2, v1

    move v1, v3

    move-object v3, p0

    .line 1517
    .end local p0    # "this":Landroidx/collection/OrderedSetWrapper$iterator$1;
    .local v1, "$i$f$forEach":I
    .local v2, "$this$iterator":Lkotlin/sequences/SequenceScope;
    .local v3, "this":Landroidx/collection/OrderedSetWrapper$iterator$1;
    .local v4, "nodes$iv":[J
    .local v5, "elements$iv":[Ljava/lang/Object;
    .local v6, "candidate$iv":I
    :goto_0
    const v7, 0x7fffffff

    if-eq v6, v7, :cond_1

    .line 1518
    aget-wide v7, v4, v6

    .local v7, "$this$previousNode$iv$iv":J
    const/4 v9, 0x0

    .line 1519
    .local v9, "$i$f$getPreviousNode":I
    const/16 v10, 0x1f

    shr-long v10, v7, v10

    const-wide/32 v12, 0x7fffffff

    and-long/2addr v10, v12

    long-to-int v7, v10

    .line 1518
    .end local v7    # "$this$previousNode$iv$iv":J
    .end local v9    # "$i$f$getPreviousNode":I
    nop

    .line 1520
    .local v7, "previousNode$iv":I
    aget-object v6, v5, v6

    .local v6, "element":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 1454
    .local v8, "$i$a$-forEach-OrderedSetWrapper$iterator$1$1":I
    iput-object v2, v3, Landroidx/collection/OrderedSetWrapper$iterator$1;->L$0:Ljava/lang/Object;

    iput-object v5, v3, Landroidx/collection/OrderedSetWrapper$iterator$1;->L$1:Ljava/lang/Object;

    iput-object v4, v3, Landroidx/collection/OrderedSetWrapper$iterator$1;->L$2:Ljava/lang/Object;

    iput v7, v3, Landroidx/collection/OrderedSetWrapper$iterator$1;->I$0:I

    const/4 v9, 0x1

    iput v9, v3, Landroidx/collection/OrderedSetWrapper$iterator$1;->label:I

    invoke-virtual {v2, v6, v3}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    .end local v6    # "element":Ljava/lang/Object;
    if-ne v6, v0, :cond_0

    return-object v0

    :cond_0
    move-object v6, v4

    move-object v4, v3

    move v3, v7

    move-object v7, v5

    move-object v5, v6

    move-object v6, v2

    move v2, v8

    .line 1520
    .end local v2    # "$this$iterator":Lkotlin/sequences/SequenceScope;
    .end local v8    # "$i$a$-forEach-OrderedSetWrapper$iterator$1$1":I
    .local v3, "previousNode$iv":I
    .local v4, "this":Landroidx/collection/OrderedSetWrapper$iterator$1;
    .local v5, "nodes$iv":[J
    .local v6, "$this$iterator":Lkotlin/sequences/SequenceScope;
    .local v7, "elements$iv":[Ljava/lang/Object;
    :goto_1
    nop

    .line 1521
    move-object v2, v6

    move v6, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v7

    .local v3, "candidate$iv":I
    goto :goto_0

    .line 1523
    .end local v7    # "elements$iv":[Ljava/lang/Object;
    .restart local v2    # "$this$iterator":Lkotlin/sequences/SequenceScope;
    .local v3, "this":Landroidx/collection/OrderedSetWrapper$iterator$1;
    .local v4, "nodes$iv":[J
    .local v5, "elements$iv":[Ljava/lang/Object;
    .local v6, "candidate$iv":I
    :cond_1
    nop

    .line 1454
    .end local v1    # "$i$f$forEach":I
    .end local v4    # "nodes$iv":[J
    .end local v5    # "elements$iv":[Ljava/lang/Object;
    .end local v6    # "candidate$iv":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
