.class final Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "CorpusExpander.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/CorpusExpander;->expansionSequence(Lcom/luchime/huiyuan/CorpusBlueprint;)Lkotlin/sequences/Sequence;
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
        "-",
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCorpusExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CorpusExpander.kt\ncom/luchime/huiyuan/CorpusExpander$expansionSequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1869#2:87\n1869#2:88\n1869#2,2:89\n1870#2:91\n1870#2:92\n*S KotlinDebug\n*F\n+ 1 CorpusExpander.kt\ncom/luchime/huiyuan/CorpusExpander$expansionSequence$1\n*L\n61#1:87\n62#1:88\n63#1:89,2\n62#1:91\n61#1:92\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlin/sequences/SequenceScope;",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.luchime.huiyuan.CorpusExpander$expansionSequence$1"
    f = "CorpusExpander.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x40
    }
    m = "invokeSuspend"
    n = {
        "$this$sequence",
        "$this$forEach\\1",
        "element\\1",
        "perspective\\2",
        "$this$forEach\\3",
        "element\\3",
        "action\\4",
        "$this$forEach\\5",
        "element\\5",
        "check\\6",
        "$i$f$forEach\\1\\61",
        "$i$a$-forEach-CorpusExpander$expansionSequence$1$1\\2\\87\\0",
        "$i$f$forEach\\3\\62",
        "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1\\4\\88\\2",
        "$i$f$forEach\\5\\63",
        "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4"
    }
    s = {
        "L$0",
        "L$1",
        "L$4",
        "L$5",
        "L$6",
        "L$8",
        "L$9",
        "L$10",
        "L$12",
        "L$13",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "I$4",
        "I$5"
    }
.end annotation


# instance fields
.field final synthetic $blueprint:Lcom/luchime/huiyuan/CorpusBlueprint;

.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field I$4:I

.field I$5:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$11:Ljava/lang/Object;

.field L$12:Ljava/lang/Object;

.field L$13:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/luchime/huiyuan/CorpusBlueprint;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/CorpusBlueprint;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->$blueprint:Lcom/luchime/huiyuan/CorpusBlueprint;

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

    new-instance v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;

    iget-object v1, p0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->$blueprint:Lcom/luchime/huiyuan/CorpusBlueprint;

    invoke-direct {v0, v1, p2}, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;-><init>(Lcom/luchime/huiyuan/CorpusBlueprint;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/sequences/SequenceScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/SequenceScope<",
            "-",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlin/sequences/SequenceScope;

    .local v1, "$this$sequence":Lkotlin/sequences/SequenceScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 60
    iget v3, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->label:I

    packed-switch v3, :pswitch_data_0

    .end local p0    # "this":Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;
    move-object/from16 v16, v1

    .end local v1    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .local v16, "$this$sequence":Lkotlin/sequences/SequenceScope;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .end local v16    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .restart local v1    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .restart local p0    # "this":Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;
    :pswitch_0
    iget v3, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$5:I

    .local v3, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4":I
    iget v4, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$4:I

    .local v4, "$i$f$forEach\\5\\63":I
    iget v5, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$3:I

    .local v5, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1\\4\\88\\2":I
    iget v6, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$2:I

    .local v6, "$i$f$forEach\\3\\62":I
    iget v7, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$1:I

    .local v7, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1\\2\\87\\0":I
    iget v8, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$0:I

    .local v8, "$i$f$forEach\\1\\61":I
    iget-object v9, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$13:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    .local v9, "check\\6":Ljava/lang/String;
    iget-object v10, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$12:Ljava/lang/Object;

    .local v10, "element\\5":Ljava/lang/Object;
    iget-object v11, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$11:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$10:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    .local v12, "$this$forEach\\5":Ljava/lang/Iterable;
    iget-object v13, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$9:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    .local v13, "action\\4":Ljava/lang/String;
    iget-object v14, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$8:Ljava/lang/Object;

    .local v14, "element\\3":Ljava/lang/Object;
    iget-object v15, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$7:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    move-object/from16 v16, v1

    .end local v1    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .restart local v16    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    iget-object v1, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$6:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 v17, v1

    .local v17, "$this$forEach\\3":Ljava/lang/Iterable;
    iget-object v1, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$5:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    move-object/from16 v18, v1

    .local v18, "perspective\\2":Ljava/lang/String;
    iget-object v1, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$4:Ljava/lang/Object;

    move-object/from16 v19, v1

    .local v19, "element\\1":Ljava/lang/Object;
    iget-object v1, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/luchime/huiyuan/CorpusBlueprint;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach\\1":Ljava/lang/Iterable;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v22, v17

    move-object/from16 v17, v1

    move-object v1, v15

    move v15, v6

    move v6, v5

    move v5, v4

    move-object v4, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v14

    move-object/from16 v14, v22

    move-object/from16 v22, v13

    move-object v13, v11

    move-object/from16 v11, v18

    move-object/from16 v18, v12

    move v12, v7

    move v7, v8

    move-object/from16 v8, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v10

    move-object v10, v0

    move-object/from16 v0, p1

    goto/16 :goto_3

    .end local v3    # "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4":I
    .end local v4    # "$i$f$forEach\\5\\63":I
    .end local v5    # "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1\\4\\88\\2":I
    .end local v6    # "$i$f$forEach\\3\\62":I
    .end local v7    # "$i$a$-forEach-CorpusExpander$expansionSequence$1$1\\2\\87\\0":I
    .end local v8    # "$i$f$forEach\\1\\61":I
    .end local v9    # "check\\6":Ljava/lang/String;
    .end local v10    # "element\\5":Ljava/lang/Object;
    .end local v12    # "$this$forEach\\5":Ljava/lang/Iterable;
    .end local v13    # "action\\4":Ljava/lang/String;
    .end local v14    # "element\\3":Ljava/lang/Object;
    .end local v16    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .end local v17    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v18    # "perspective\\2":Ljava/lang/String;
    .end local v19    # "element\\1":Ljava/lang/Object;
    .local v1, "$this$sequence":Lkotlin/sequences/SequenceScope;
    :pswitch_1
    move-object/from16 v16, v1

    .end local v1    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .restart local v16    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    iget-object v1, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->$blueprint:Lcom/luchime/huiyuan/CorpusBlueprint;

    invoke-virtual {v1}, Lcom/luchime/huiyuan/CorpusBlueprint;->getPerspectives()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach\\1":Ljava/lang/Iterable;
    iget-object v3, v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->$blueprint:Lcom/luchime/huiyuan/CorpusBlueprint;

    const/4 v4, 0x0

    .line 87
    .local v4, "$i$f$forEach\\1\\61":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object v7, v0

    move-object v6, v5

    move v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    .end local v4    # "$i$f$forEach\\1\\61":I
    .end local p0    # "this":Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .local v2, "$this$forEach\\1":Ljava/lang/Iterable;
    .local v5, "$i$f$forEach\\1\\61":I
    .local v7, "this":Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\1":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "perspective\\2":Ljava/lang/String;
    const/4 v10, 0x0

    .line 62
    .local v10, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1\\2\\87\\0":I
    invoke-virtual {v4}, Lcom/luchime/huiyuan/CorpusBlueprint;->getActions()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$forEach\\3":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 88
    .local v12, "$i$f$forEach\\3\\62":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .restart local v14    # "element\\3":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/lang/String;

    .local v15, "action\\4":Ljava/lang/String;
    const/16 v17, 0x0

    .line 63
    .local v17, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1\\4\\88\\2":I
    invoke-virtual {v4}, Lcom/luchime/huiyuan/CorpusBlueprint;->getChecks()Ljava/util/List;

    move-result-object v18

    check-cast v18, Ljava/lang/Iterable;

    .local v18, "$this$forEach\\5":Ljava/lang/Iterable;
    const/16 v19, 0x0

    .line 89
    .local v19, "$i$f$forEach\\5\\63":I
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    move-object/from16 p1, v1

    move-object v1, v13

    move-object v0, v15

    move-object/from16 v13, v20

    move v15, v12

    move v12, v10

    move-object v10, v8

    move-object v8, v6

    move/from16 v6, v17

    move-object/from16 v17, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v14

    move-object v14, v11

    move-object v11, v9

    move-object v9, v7

    move v7, v5

    move-object v5, v4

    move/from16 v4, v19

    .end local v1    # "$result":Ljava/lang/Object;
    .end local v5    # "$i$f$forEach\\1\\61":I
    .end local v8    # "element\\1":Ljava/lang/Object;
    .end local v19    # "$i$f$forEach\\5\\63":I
    .local v0, "action\\4":Ljava/lang/String;
    .local v2, "$this$sequence":Lkotlin/sequences/SequenceScope;
    .local v4, "$i$f$forEach\\5\\63":I
    .local v6, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1\\4\\88\\2":I
    .local v7, "$i$f$forEach\\1\\61":I
    .local v9, "this":Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;
    .local v10, "element\\1":Ljava/lang/Object;
    .local v11, "perspective\\2":Ljava/lang/String;
    .local v12, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1\\2\\87\\0":I
    .local v14, "$this$forEach\\3":Ljava/lang/Iterable;
    .local v15, "$i$f$forEach\\3\\62":I
    .local v16, "element\\3":Ljava/lang/Object;
    .local v17, "$this$forEach\\1":Ljava/lang/Iterable;
    .restart local p1    # "$result":Ljava/lang/Object;
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v10

    .end local v10    # "element\\1":Ljava/lang/Object;
    .local v19, "element\\5":Ljava/lang/Object;
    .local v20, "element\\1":Ljava/lang/Object;
    move-object/from16 v10, v19

    check-cast v10, Ljava/lang/String;

    move-object/from16 v21, v14

    .end local v14    # "$this$forEach\\3":Ljava/lang/Iterable;
    .local v10, "check\\6":Ljava/lang/String;
    .local v21, "$this$forEach\\3":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 64
    .local v14, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4":I
    nop

    .line 65
    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v23, v22

    .local v23, "$this$invokeSuspend_u24lambda_u243_u24lambda_u242_u24lambda_u241_u24lambda_u240\\7":Ljava/lang/StringBuilder;
    const/16 v24, 0x0

    .line 66
    .local v24, "$i$a$-buildString-CorpusExpander$expansionSequence$1$1$1$1$1\\7\\65\\6":I
    move-object/from16 v25, v3

    sget-object v3, Lcom/luchime/huiyuan/CorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/CorpusExpander;

    move/from16 v26, v14

    move-object/from16 v14, v23

    .end local v23    # "$this$invokeSuspend_u24lambda_u243_u24lambda_u242_u24lambda_u241_u24lambda_u240\\7":Ljava/lang/StringBuilder;
    .local v14, "$this$invokeSuspend_u24lambda_u243_u24lambda_u242_u24lambda_u241_u24lambda_u240\\7":Ljava/lang/StringBuilder;
    .local v26, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4":I
    invoke-static {v3, v14, v11}, Lcom/luchime/huiyuan/CorpusExpander;->access$appendSentence(Lcom/luchime/huiyuan/CorpusExpander;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 67
    sget-object v3, Lcom/luchime/huiyuan/CorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/CorpusExpander;

    invoke-static {v3, v14, v0}, Lcom/luchime/huiyuan/CorpusExpander;->access$appendSentence(Lcom/luchime/huiyuan/CorpusExpander;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 68
    sget-object v3, Lcom/luchime/huiyuan/CorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/CorpusExpander;

    invoke-static {v3, v14, v10}, Lcom/luchime/huiyuan/CorpusExpander;->access$appendSentence(Lcom/luchime/huiyuan/CorpusExpander;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 69
    nop

    .line 65
    .end local v14    # "$this$invokeSuspend_u24lambda_u243_u24lambda_u242_u24lambda_u241_u24lambda_u240\\7":Ljava/lang/StringBuilder;
    .end local v24    # "$i$a$-buildString-CorpusExpander$expansionSequence$1$1$1$1$1\\7\\65\\6":I
    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 64
    iput-object v2, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$0:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$1:Ljava/lang/Object;

    iput-object v5, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$2:Ljava/lang/Object;

    iput-object v8, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$3:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$4:Ljava/lang/Object;

    iput-object v11, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$5:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$6:Ljava/lang/Object;

    iput-object v1, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$7:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$8:Ljava/lang/Object;

    iput-object v0, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$9:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$10:Ljava/lang/Object;

    iput-object v13, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$11:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$12:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->L$13:Ljava/lang/Object;

    iput v7, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$0:I

    iput v12, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$1:I

    iput v15, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$2:I

    iput v6, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$3:I

    iput v4, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$4:I

    move/from16 v14, v26

    .end local v26    # "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4":I
    .local v14, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4":I
    iput v14, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->I$5:I

    move-object/from16 v22, v0

    .end local v0    # "action\\4":Ljava/lang/String;
    .local v22, "action\\4":Ljava/lang/String;
    const/4 v0, 0x1

    iput v0, v9, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;->label:I

    invoke-virtual {v2, v3, v9}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v3, v25

    if-ne v0, v3, :cond_0

    .line 60
    return-object v3

    .line 64
    :cond_0
    move v0, v4

    move-object v4, v3

    move v3, v14

    move-object/from16 v14, v21

    move-object/from16 v21, v5

    move v5, v0

    move-object v0, v10

    move-object v10, v9

    move-object v9, v0

    move-object/from16 v0, p1

    .line 71
    .end local v4    # "$i$f$forEach\\5\\63":I
    .end local v21    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    .restart local v3    # "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4":I
    .local v5, "$i$f$forEach\\5\\63":I
    .local v9, "check\\6":Ljava/lang/String;
    .local v10, "this":Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;
    .local v14, "$this$forEach\\3":Ljava/lang/Iterable;
    :goto_3
    nop

    .line 89
    .end local v3    # "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4":I
    .end local v9    # "check\\6":Ljava/lang/String;
    .end local v19    # "element\\5":Ljava/lang/Object;
    move-object/from16 p1, v0

    move-object v3, v4

    move v4, v5

    move-object v9, v10

    move-object/from16 v10, v20

    move-object/from16 v5, v21

    move-object/from16 v0, v22

    goto/16 :goto_2

    .line 90
    .end local v5    # "$i$f$forEach\\5\\63":I
    .end local v20    # "element\\1":Ljava/lang/Object;
    .end local v22    # "action\\4":Ljava/lang/String;
    .local v0, "action\\4":Ljava/lang/String;
    .restart local v4    # "$i$f$forEach\\5\\63":I
    .local v9, "this":Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;
    .local v10, "element\\1":Ljava/lang/Object;
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_1
    move-object/from16 v22, v0

    move-object/from16 v20, v10

    move-object/from16 v21, v14

    .line 72
    .end local v0    # "action\\4":Ljava/lang/String;
    .end local v4    # "$i$f$forEach\\5\\63":I
    .end local v10    # "element\\1":Ljava/lang/Object;
    .end local v14    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v18    # "$this$forEach\\5":Ljava/lang/Iterable;
    .restart local v20    # "element\\1":Ljava/lang/Object;
    .restart local v21    # "$this$forEach\\3":Ljava/lang/Iterable;
    .restart local v22    # "action\\4":Ljava/lang/String;
    nop

    .line 88
    .end local v6    # "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1\\4\\88\\2":I
    .end local v16    # "element\\3":Ljava/lang/Object;
    .end local v22    # "action\\4":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object v13, v1

    move-object/from16 v16, v2

    move-object v4, v5

    move v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v9, v11

    move v10, v12

    move v12, v15

    move-object/from16 v2, v17

    move-object/from16 v8, v20

    move-object/from16 v11, v21

    move-object/from16 v1, p1

    goto/16 :goto_1

    .line 91
    .end local v15    # "$i$f$forEach\\3\\62":I
    .end local v17    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v20    # "element\\1":Ljava/lang/Object;
    .end local v21    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local p1    # "$result":Ljava/lang/Object;
    .restart local v1    # "$result":Ljava/lang/Object;
    .local v2, "$this$forEach\\1":Ljava/lang/Iterable;
    .local v5, "$i$f$forEach\\1\\61":I
    .local v7, "this":Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;
    .restart local v8    # "element\\1":Ljava/lang/Object;
    .local v9, "perspective\\2":Ljava/lang/String;
    .local v10, "$i$a$-forEach-CorpusExpander$expansionSequence$1$1\\2\\87\\0":I
    .local v11, "$this$forEach\\3":Ljava/lang/Iterable;
    .local v12, "$i$f$forEach\\3\\62":I
    .local v16, "$this$sequence":Lkotlin/sequences/SequenceScope;
    :cond_2
    nop

    .line 73
    .end local v11    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEach\\3\\62":I
    nop

    .line 87
    .end local v8    # "element\\1":Ljava/lang/Object;
    .end local v9    # "perspective\\2":Ljava/lang/String;
    .end local v10    # "$i$a$-forEach-CorpusExpander$expansionSequence$1$1\\2\\87\\0":I
    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 92
    :cond_3
    nop

    .line 74
    .end local v2    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEach\\1\\61":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
