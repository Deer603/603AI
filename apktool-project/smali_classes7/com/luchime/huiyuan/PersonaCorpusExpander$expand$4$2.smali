.class final Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "PersonaCorpusExpander.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/PersonaCorpusExpander;->expand(Ljava/util/List;Lcom/luchime/huiyuan/EnginePersona;I)Ljava/util/List;
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
    value = "SMAP\nPersonaCorpusExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonaCorpusExpander.kt\ncom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1869#2:153\n1869#2:154\n1869#2,2:155\n1870#2:157\n1870#2:158\n*S KotlinDebug\n*F\n+ 1 PersonaCorpusExpander.kt\ncom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2\n*L\n34#1:153\n35#1:154\n36#1:155,2\n35#1:157\n34#1:158\n*E\n"
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
    c = "com.luchime.huiyuan.PersonaCorpusExpander$expand$4$2"
    f = "PersonaCorpusExpander.kt"
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
        0x25
    }
    m = "invokeSuspend"
    n = {
        "$this$sequence",
        "$this$forEach\\1",
        "element\\1",
        "original\\2",
        "$this$forEach\\3",
        "element\\3",
        "action\\4",
        "$this$forEach\\5",
        "element\\5",
        "check\\6",
        "$i$f$forEach\\1\\34",
        "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1\\2\\153\\0",
        "$i$f$forEach\\3\\35",
        "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2",
        "$i$f$forEach\\5\\36",
        "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4"
    }
    s = {
        "L$0",
        "L$1",
        "L$5",
        "L$6",
        "L$7",
        "L$9",
        "L$10",
        "L$11",
        "L$13",
        "L$14",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "I$4",
        "I$5"
    }
.end annotation


# instance fields
.field final synthetic $actions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $checks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $originals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;"
        }
    .end annotation
.end field

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

.field L$14:Ljava/lang/Object;

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
.method constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->$originals:Ljava/util/List;

    iput-object p2, p0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->$actions:Ljava/util/List;

    iput-object p3, p0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->$checks:Ljava/util/List;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;

    iget-object v1, p0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->$originals:Ljava/util/List;

    iget-object v2, p0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->$actions:Ljava/util/List;

    iget-object v3, p0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->$checks:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/sequences/SequenceScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->invoke(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlin/sequences/SequenceScope;

    .local v1, "$this$sequence":Lkotlin/sequences/SequenceScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 33
    iget v3, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->label:I

    packed-switch v3, :pswitch_data_0

    .end local p0    # "this":Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;
    move-object/from16 v16, v1

    .end local v1    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .local v16, "$this$sequence":Lkotlin/sequences/SequenceScope;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .end local v16    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .restart local v1    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .restart local p0    # "this":Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;
    :pswitch_0
    iget v3, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$5:I

    .local v3, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4":I
    iget v4, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$4:I

    .local v4, "$i$f$forEach\\5\\36":I
    iget v5, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$3:I

    .local v5, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    iget v6, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$2:I

    .local v6, "$i$f$forEach\\3\\35":I
    iget v7, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$1:I

    .local v7, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1\\2\\153\\0":I
    iget v8, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$0:I

    .local v8, "$i$f$forEach\\1\\34":I
    iget-object v9, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$14:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    .local v9, "check\\6":Ljava/lang/String;
    iget-object v10, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$13:Ljava/lang/Object;

    .local v10, "element\\5":Ljava/lang/Object;
    iget-object v11, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$12:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$11:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    .local v12, "$this$forEach\\5":Ljava/lang/Iterable;
    iget-object v13, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$10:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    .local v13, "action\\4":Ljava/lang/String;
    iget-object v14, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$9:Ljava/lang/Object;

    .local v14, "element\\3":Ljava/lang/Object;
    iget-object v15, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$8:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    move-object/from16 v16, v1

    .end local v1    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .restart local v16    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    iget-object v1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$7:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 v17, v1

    .local v17, "$this$forEach\\3":Ljava/lang/Iterable;
    iget-object v1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$6:Ljava/lang/Object;

    check-cast v1, Lcom/luchime/huiyuan/LexiconEntry;

    move-object/from16 v18, v1

    .local v18, "original\\2":Lcom/luchime/huiyuan/LexiconEntry;
    iget-object v1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$5:Ljava/lang/Object;

    move-object/from16 v19, v1

    .local v19, "element\\1":Ljava/lang/Object;
    iget-object v1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach\\1":Ljava/lang/Iterable;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v23, v18

    move-object/from16 v18, v1

    move v1, v6

    move v6, v4

    move-object v4, v2

    move-object v2, v15

    move-object/from16 v15, v17

    move-object/from16 v17, v14

    move v14, v7

    move v7, v5

    move-object/from16 v5, v22

    move-object/from16 v22, v12

    move-object/from16 v12, v23

    move-object/from16 v23, v13

    move-object v13, v11

    move-object v11, v0

    move-object/from16 v0, p1

    goto/16 :goto_3

    .end local v3    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4":I
    .end local v4    # "$i$f$forEach\\5\\36":I
    .end local v5    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .end local v6    # "$i$f$forEach\\3\\35":I
    .end local v7    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1\\2\\153\\0":I
    .end local v8    # "$i$f$forEach\\1\\34":I
    .end local v9    # "check\\6":Ljava/lang/String;
    .end local v10    # "element\\5":Ljava/lang/Object;
    .end local v12    # "$this$forEach\\5":Ljava/lang/Iterable;
    .end local v13    # "action\\4":Ljava/lang/String;
    .end local v14    # "element\\3":Ljava/lang/Object;
    .end local v16    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .end local v17    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v18    # "original\\2":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v19    # "element\\1":Ljava/lang/Object;
    .local v1, "$this$sequence":Lkotlin/sequences/SequenceScope;
    :pswitch_1
    move-object/from16 v16, v1

    .end local v1    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    .restart local v16    # "$this$sequence":Lkotlin/sequences/SequenceScope;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    iget-object v1, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->$originals:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach\\1":Ljava/lang/Iterable;
    iget-object v3, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->$actions:Ljava/util/List;

    iget-object v4, v0, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->$checks:Ljava/util/List;

    const/4 v5, 0x0

    .line 153
    .local v5, "$i$f$forEach\\1\\34":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v8, v0

    move-object v7, v6

    move v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    .end local v5    # "$i$f$forEach\\1\\34":I
    .end local p0    # "this":Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .local v2, "$this$forEach\\1":Ljava/lang/Iterable;
    .local v6, "$i$f$forEach\\1\\34":I
    .local v8, "this":Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element\\1":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/luchime/huiyuan/LexiconEntry;

    .local v10, "original\\2":Lcom/luchime/huiyuan/LexiconEntry;
    const/4 v11, 0x0

    .line 35
    .local v11, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1\\2\\153\\0":I
    move-object v12, v4

    check-cast v12, Ljava/lang/Iterable;

    .local v12, "$this$forEach\\3":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 154
    .local v13, "$i$f$forEach\\3\\35":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element\\3":Ljava/lang/Object;
    move-object/from16 v17, v15

    check-cast v17, Ljava/lang/String;

    .local v17, "action\\4":Ljava/lang/String;
    const/16 v18, 0x0

    .line 36
    .local v18, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    move-object/from16 v19, v5

    check-cast v19, Ljava/lang/Iterable;

    .local v19, "$this$forEach\\5":Ljava/lang/Iterable;
    const/16 v20, 0x0

    .line 155
    .local v20, "$i$f$forEach\\5\\36":I
    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    move-object/from16 p1, v1

    move v1, v13

    move-object/from16 v0, v17

    move-object/from16 v13, v21

    move-object/from16 v17, v2

    move-object v2, v14

    move v14, v11

    move-object/from16 v11, v16

    move-object/from16 v16, v15

    move-object v15, v12

    move-object v12, v10

    move-object v10, v8

    move v8, v6

    move/from16 v6, v18

    move-object/from16 v18, v9

    move-object v9, v7

    move-object v7, v5

    move-object v5, v4

    move/from16 v4, v20

    .end local v2    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v9    # "element\\1":Ljava/lang/Object;
    .end local v13    # "$i$f$forEach\\3\\35":I
    .end local v20    # "$i$f$forEach\\5\\36":I
    .local v0, "action\\4":Ljava/lang/String;
    .local v1, "$i$f$forEach\\3\\35":I
    .restart local v4    # "$i$f$forEach\\5\\36":I
    .local v6, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .local v8, "$i$f$forEach\\1\\34":I
    .local v10, "this":Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;
    .local v11, "$this$sequence":Lkotlin/sequences/SequenceScope;
    .local v12, "original\\2":Lcom/luchime/huiyuan/LexiconEntry;
    .local v14, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1\\2\\153\\0":I
    .local v15, "$this$forEach\\3":Ljava/lang/Iterable;
    .local v16, "element\\3":Ljava/lang/Object;
    .local v17, "$this$forEach\\1":Ljava/lang/Iterable;
    .local v18, "element\\1":Ljava/lang/Object;
    .restart local p1    # "$result":Ljava/lang/Object;
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v15

    .end local v15    # "$this$forEach\\3":Ljava/lang/Iterable;
    .local v20, "element\\5":Ljava/lang/Object;
    .local v21, "$this$forEach\\3":Ljava/lang/Iterable;
    move-object/from16 v15, v20

    check-cast v15, Ljava/lang/String;

    move-object/from16 v22, v3

    .local v15, "check\\6":Ljava/lang/String;
    const/4 v3, 0x0

    .line 37
    .restart local v3    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4":I
    move/from16 v23, v3

    .end local v3    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4":I
    .local v23, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4":I
    sget-object v3, Lcom/luchime/huiyuan/PersonaCorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/PersonaCorpusExpander;

    move/from16 v24, v4

    .end local v4    # "$i$f$forEach\\5\\36":I
    .local v24, "$i$f$forEach\\5\\36":I
    invoke-virtual {v12}, Lcom/luchime/huiyuan/LexiconEntry;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/luchime/huiyuan/PersonaCorpusExpander;->access$sentence(Lcom/luchime/huiyuan/PersonaCorpusExpander;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/luchime/huiyuan/PersonaCorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/PersonaCorpusExpander;

    invoke-static {v4, v0}, Lcom/luchime/huiyuan/PersonaCorpusExpander;->access$sentence(Lcom/luchime/huiyuan/PersonaCorpusExpander;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move/from16 v25, v6

    .end local v6    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .local v25, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    sget-object v6, Lcom/luchime/huiyuan/PersonaCorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/PersonaCorpusExpander;

    invoke-static {v6, v15}, Lcom/luchime/huiyuan/PersonaCorpusExpander;->access$sentence(Lcom/luchime/huiyuan/PersonaCorpusExpander;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v26, v15

    .end local v15    # "check\\6":Ljava/lang/String;
    .local v26, "check\\6":Ljava/lang/String;
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v15, " "

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v11, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$0:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$1:Ljava/lang/Object;

    iput-object v5, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$2:Ljava/lang/Object;

    iput-object v7, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$3:Ljava/lang/Object;

    iput-object v9, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$4:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$5:Ljava/lang/Object;

    iput-object v12, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$6:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$7:Ljava/lang/Object;

    iput-object v2, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$8:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$9:Ljava/lang/Object;

    iput-object v0, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$10:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$11:Ljava/lang/Object;

    iput-object v13, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$12:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$13:Ljava/lang/Object;

    invoke-static/range {v26 .. v26}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->L$14:Ljava/lang/Object;

    iput v8, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$0:I

    iput v14, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$1:I

    iput v1, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$2:I

    move/from16 v4, v25

    .end local v25    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .local v4, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    iput v4, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$3:I

    move/from16 v6, v24

    .end local v24    # "$i$f$forEach\\5\\36":I
    .local v6, "$i$f$forEach\\5\\36":I
    iput v6, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$4:I

    move/from16 v15, v23

    .end local v23    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4":I
    .local v15, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4":I
    iput v15, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->I$5:I

    move-object/from16 v23, v0

    .end local v0    # "action\\4":Ljava/lang/String;
    .local v23, "action\\4":Ljava/lang/String;
    const/4 v0, 0x1

    iput v0, v10, Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;->label:I

    invoke-virtual {v11, v3, v10}, Lkotlin/sequences/SequenceScope;->yield(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v3, v22

    if-ne v0, v3, :cond_0

    .line 33
    return-object v3

    .line 37
    :cond_0
    move v0, v4

    move-object v4, v3

    move v3, v15

    move-object/from16 v15, v21

    move-object/from16 v21, v7

    move v7, v0

    move-object/from16 v22, v19

    move-object/from16 v19, v18

    move-object/from16 v18, v17

    move-object/from16 v17, v16

    move-object/from16 v16, v11

    move-object v11, v10

    move-object/from16 v10, v20

    move-object/from16 v20, v9

    move-object/from16 v9, v26

    move-object/from16 v0, p1

    .line 38
    .end local v4    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .end local v20    # "element\\5":Ljava/lang/Object;
    .end local v21    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v26    # "check\\6":Ljava/lang/String;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    .restart local v3    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4":I
    .local v7, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .local v9, "check\\6":Ljava/lang/String;
    .local v10, "element\\5":Ljava/lang/Object;
    .local v11, "this":Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;
    .local v15, "$this$forEach\\3":Ljava/lang/Iterable;
    .local v16, "$this$sequence":Lkotlin/sequences/SequenceScope;
    .local v17, "element\\3":Ljava/lang/Object;
    .local v18, "$this$forEach\\1":Ljava/lang/Iterable;
    .local v19, "element\\1":Ljava/lang/Object;
    .local v22, "$this$forEach\\5":Ljava/lang/Iterable;
    :goto_3
    nop

    .line 155
    .end local v3    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4":I
    .end local v9    # "check\\6":Ljava/lang/String;
    .end local v10    # "element\\5":Ljava/lang/Object;
    move-object/from16 p1, v0

    move-object v3, v4

    move v4, v6

    move v6, v7

    move-object v10, v11

    move-object/from16 v11, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v9, v20

    move-object/from16 v7, v21

    move-object/from16 v19, v22

    move-object/from16 v0, v23

    goto/16 :goto_2

    .line 156
    .end local v7    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .end local v22    # "$this$forEach\\5":Ljava/lang/Iterable;
    .end local v23    # "action\\4":Ljava/lang/String;
    .local v0, "action\\4":Ljava/lang/String;
    .local v4, "$i$f$forEach\\5\\36":I
    .local v6, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .local v10, "this":Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;
    .local v11, "$this$sequence":Lkotlin/sequences/SequenceScope;
    .local v16, "element\\3":Ljava/lang/Object;
    .local v17, "$this$forEach\\1":Ljava/lang/Iterable;
    .local v18, "element\\1":Ljava/lang/Object;
    .local v19, "$this$forEach\\5":Ljava/lang/Iterable;
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_1
    move/from16 v21, v6

    move v6, v4

    move/from16 v4, v21

    move-object/from16 v23, v0

    move-object/from16 v21, v15

    .line 39
    .end local v0    # "action\\4":Ljava/lang/String;
    .end local v6    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .end local v15    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v19    # "$this$forEach\\5":Ljava/lang/Iterable;
    .local v4, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .restart local v21    # "$this$forEach\\3":Ljava/lang/Iterable;
    .restart local v23    # "action\\4":Ljava/lang/String;
    nop

    .line 154
    .end local v4    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2":I
    .end local v16    # "element\\3":Ljava/lang/Object;
    .end local v23    # "action\\4":Ljava/lang/String;
    move-object/from16 v0, p0

    move v13, v1

    move-object v4, v5

    move-object v5, v7

    move v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object/from16 v16, v11

    move-object v10, v12

    move v11, v14

    move-object/from16 v9, v18

    move-object/from16 v12, v21

    move-object/from16 v1, p1

    move-object v14, v2

    move-object/from16 v2, v17

    goto/16 :goto_1

    .line 157
    .end local v14    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1\\2\\153\\0":I
    .end local v17    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v18    # "element\\1":Ljava/lang/Object;
    .end local v21    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .restart local v2    # "$this$forEach\\1":Ljava/lang/Iterable;
    .local v6, "$i$f$forEach\\1\\34":I
    .local v8, "this":Lcom/luchime/huiyuan/PersonaCorpusExpander$expand$4$2;
    .local v9, "element\\1":Ljava/lang/Object;
    .local v10, "original\\2":Lcom/luchime/huiyuan/LexiconEntry;
    .local v11, "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1\\2\\153\\0":I
    .local v12, "$this$forEach\\3":Ljava/lang/Iterable;
    .restart local v13    # "$i$f$forEach\\3\\35":I
    .local v16, "$this$sequence":Lkotlin/sequences/SequenceScope;
    :cond_2
    nop

    .line 40
    .end local v12    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v13    # "$i$f$forEach\\3\\35":I
    nop

    .line 153
    .end local v9    # "element\\1":Ljava/lang/Object;
    .end local v10    # "original\\2":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v11    # "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1\\2\\153\\0":I
    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 158
    :cond_3
    nop

    .line 41
    .end local v2    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v6    # "$i$f$forEach\\1\\34":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
