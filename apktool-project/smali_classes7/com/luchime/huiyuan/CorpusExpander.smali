.class public final Lcom/luchime/huiyuan/CorpusExpander;
.super Ljava/lang/Object;
.source "CorpusExpander.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCorpusExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CorpusExpander.kt\ncom/luchime/huiyuan/CorpusExpander\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,86:1\n1#2:87\n1563#3:88\n1634#3,3:89\n1208#3,2:92\n1236#3,4:94\n1374#3:98\n1460#3,2:99\n774#3:101\n865#3,2:102\n1869#3,2:104\n1563#3:106\n1634#3,3:107\n774#3:110\n865#3,2:111\n1462#3,3:115\n1321#4,2:113\n*S KotlinDebug\n*F\n+ 1 CorpusExpander.kt\ncom/luchime/huiyuan/CorpusExpander\n*L\n21#1:88\n21#1:89,3\n22#1:92,2\n22#1:94,4\n28#1:98\n28#1:99,2\n36#1:101\n36#1:102,2\n37#1:104,2\n40#1:106\n40#1:107,3\n41#1:110\n41#1:111,2\n28#1:115,3\n44#1:113,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u000c\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J0\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u0011*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/luchime/huiyuan/CorpusExpander;",
        "",
        "<init>",
        "()V",
        "expand",
        "",
        "Lcom/luchime/huiyuan/LexiconEntry;",
        "sourceEntries",
        "blueprints",
        "Lcom/luchime/huiyuan/CorpusBlueprint;",
        "targetPerCategory",
        "",
        "expansionSequence",
        "Lkotlin/sequences/Sequence;",
        "",
        "blueprint",
        "appendSentence",
        "",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "sentence",
        "END_PUNCTUATION",
        "",
        "",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field private static final END_PUNCTUATION:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/luchime/huiyuan/CorpusExpander;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/luchime/huiyuan/CorpusExpander;

    invoke-direct {v0}, Lcom/luchime/huiyuan/CorpusExpander;-><init>()V

    sput-object v0, Lcom/luchime/huiyuan/CorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/CorpusExpander;

    .line 84
    const/16 v0, 0x8

    new-array v1, v0, [Ljava/lang/Character;

    const/16 v2, 0x3002

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0xff01

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const v2, 0xff1f

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const v2, 0xff1b

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/16 v2, 0x2e

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/16 v2, 0x21

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/16 v2, 0x3f

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/16 v2, 0x3b

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lcom/luchime/huiyuan/CorpusExpander;->END_PUNCTUATION:Ljava/util/Set;

    sput v0, Lcom/luchime/huiyuan/CorpusExpander;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$appendSentence(Lcom/luchime/huiyuan/CorpusExpander;Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 0
    .param p0, "$this"    # Lcom/luchime/huiyuan/CorpusExpander;
    .param p1, "$receiver"    # Ljava/lang/StringBuilder;
    .param p2, "sentence"    # Ljava/lang/String;

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/luchime/huiyuan/CorpusExpander;->appendSentence(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method private final appendSentence(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 4
    .param p1, "$this$appendSentence"    # Ljava/lang/StringBuilder;
    .param p2, "sentence"    # Ljava/lang/String;

    .line 77
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 78
    .local v0, "clean":Ljava/lang/String;
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_1

    return-void

    .line 79
    :cond_1
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    if-eqz v2, :cond_3

    const/16 v1, 0x20

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    sget-object v1, Lcom/luchime/huiyuan/CorpusExpander;->END_PUNCTUATION:Ljava/util/Set;

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->last(Ljava/lang/CharSequence;)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const/16 v1, 0x3002

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    :cond_4
    return-void
.end method

.method private final expansionSequence(Lcom/luchime/huiyuan/CorpusBlueprint;)Lkotlin/sequences/Sequence;
    .locals 2
    .param p1, "blueprint"    # Lcom/luchime/huiyuan/CorpusBlueprint;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/CorpusBlueprint;",
            ")",
            "Lkotlin/sequences/Sequence<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/luchime/huiyuan/CorpusExpander$expansionSequence$1;-><init>(Lcom/luchime/huiyuan/CorpusBlueprint;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequence(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 74
    return-object v0
.end method


# virtual methods
.method public final expand(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;
    .locals 27
    .param p1, "sourceEntries"    # Ljava/util/List;
    .param p2, "blueprints"    # Ljava/util/List;
    .param p3, "targetPerCategory"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/CorpusBlueprint;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    const-string v3, "sourceEntries"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "blueprints"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_16

    .line 19
    if-lez v2, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_15

    .line 21
    move-object v5, v0

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$map\\3":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 88
    .local v6, "$i$f$map\\3\\21":I
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v5, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\4":Ljava/util/Collection;
    move-object v9, v5

    .local v9, "$this$mapTo\\4":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 89
    .local v10, "$i$f$mapTo\\4\\88":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 90
    .local v12, "item\\4":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Lcom/luchime/huiyuan/LexiconEntry;

    .local v13, "it\\5":Lcom/luchime/huiyuan/LexiconEntry;
    const/4 v14, 0x0

    .line 21
    .local v14, "$i$a$-map-CorpusExpander$expand$categoryOrder$1\\5\\90\\0":I
    invoke-virtual {v13}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v13

    .line 90
    .end local v13    # "it\\5":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v14    # "$i$a$-map-CorpusExpander$expand$categoryOrder$1\\5\\90\\0":I
    invoke-interface {v7, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 91
    .end local v12    # "item\\4":Ljava/lang/Object;
    :cond_1
    nop

    .end local v7    # "destination\\4":Ljava/util/Collection;
    .end local v9    # "$this$mapTo\\4":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo\\4\\88":I
    check-cast v7, Ljava/util/List;

    .line 88
    nop

    .end local v5    # "$this$map\\3":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map\\3\\21":I
    check-cast v7, Ljava/lang/Iterable;

    .line 21
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    .line 22
    .local v5, "categoryOrder":Ljava/util/List;
    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$associateBy\\6":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 92
    .local v7, "$i$f$associateBy\\6\\22":I
    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-static {v9}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v9

    const/16 v10, 0x10

    invoke-static {v9, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v9

    .line 93
    .local v9, "capacity\\6":I
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v10, Ljava/util/Map;

    .local v10, "destination\\7":Ljava/util/Map;
    move-object v11, v6

    .local v11, "$this$associateByTo\\7":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 94
    .local v12, "$i$f$associateByTo\\7\\93":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 95
    .local v14, "element\\7":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Lcom/luchime/huiyuan/CorpusBlueprint;

    .local v15, "it\\8":Lcom/luchime/huiyuan/CorpusBlueprint;
    const/16 v16, 0x0

    .line 22
    .local v16, "$i$a$-associateBy-CorpusExpander$expand$blueprintByCategory$1\\8\\95\\0":I
    invoke-virtual {v15}, Lcom/luchime/huiyuan/CorpusBlueprint;->getCategory()Ljava/lang/String;

    move-result-object v15

    .line 95
    .end local v15    # "it\\8":Lcom/luchime/huiyuan/CorpusBlueprint;
    .end local v16    # "$i$a$-associateBy-CorpusExpander$expand$blueprintByCategory$1\\8\\95\\0":I
    invoke-interface {v10, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 97
    .end local v14    # "element\\7":Ljava/lang/Object;
    :cond_2
    nop

    .line 93
    .end local v10    # "destination\\7":Ljava/util/Map;
    .end local v11    # "$this$associateByTo\\7":Ljava/lang/Iterable;
    .end local v12    # "$i$f$associateByTo\\7\\93":I
    nop

    .line 22
    .end local v6    # "$this$associateBy\\6":Ljava/lang/Iterable;
    .end local v7    # "$i$f$associateBy\\6\\22":I
    .end local v9    # "capacity\\6":I
    nop

    .line 23
    .local v10, "blueprintByCategory":Ljava/util/Map;
    invoke-interface {v10}, Ljava/util/Map;->size()I

    move-result v6

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    if-ne v6, v7, :cond_3

    const/4 v6, 0x1

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_14

    .line 24
    invoke-interface {v10}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    move-object v7, v5

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    .line 28
    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$flatMap\\11":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 98
    .local v7, "$i$f$flatMap\\11\\28":I
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination\\12":Ljava/util/Collection;
    move-object v11, v6

    .local v11, "$this$flatMapTo\\12":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 99
    .local v12, "$i$f$flatMapTo\\12\\98":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_12

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 100
    .local v14, "element\\12":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/lang/String;

    .local v15, "category\\13":Ljava/lang/String;
    const/16 v16, 0x0

    .line 29
    .local v16, "$i$a$-flatMap-CorpusExpander$expand$5\\13\\100\\0":I
    invoke-static {v10, v15}, Lkotlin/collections/MapsKt;->getValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v3, v17

    check-cast v3, Lcom/luchime/huiyuan/CorpusBlueprint;

    .line 30
    .local v3, "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    invoke-virtual {v3}, Lcom/luchime/huiyuan/CorpusBlueprint;->getPerspectives()Ljava/util/List;

    move-result-object v17

    check-cast v17, Ljava/util/Collection;

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v17

    if-nez v17, :cond_11

    .line 31
    invoke-virtual {v3}, Lcom/luchime/huiyuan/CorpusBlueprint;->getActions()Ljava/util/List;

    move-result-object v17

    check-cast v17, Ljava/util/Collection;

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v17

    if-nez v17, :cond_10

    .line 32
    invoke-virtual {v3}, Lcom/luchime/huiyuan/CorpusBlueprint;->getChecks()Ljava/util/List;

    move-result-object v17

    check-cast v17, Ljava/util/Collection;

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v17

    if-nez v17, :cond_f

    .line 34
    new-instance v17, Ljava/util/LinkedHashMap;

    invoke-direct/range {v17 .. v17}, Ljava/util/LinkedHashMap;-><init>()V

    move-object/from16 v18, v17

    .line 35
    .local v18, "unique\\13":Ljava/util/LinkedHashMap;
    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/Iterable;

    .line 36
    nop

    .local v17, "$this$filter\\17":Ljava/lang/Iterable;
    const/16 v19, 0x0

    .line 101
    .local v19, "$i$f$filter\\17\\36":I
    new-instance v20, Ljava/util/ArrayList;

    invoke-direct/range {v20 .. v20}, Ljava/util/ArrayList;-><init>()V

    check-cast v20, Ljava/util/Collection;

    .local v20, "destination\\18":Ljava/util/Collection;
    move-object/from16 v21, v17

    .local v21, "$this$filterTo\\18":Ljava/lang/Iterable;
    move-object/from16 v22, v20

    .end local v20    # "destination\\18":Ljava/util/Collection;
    .local v22, "destination\\18":Ljava/util/Collection;
    const/16 v20, 0x0

    .line 102
    .local v20, "$i$f$filterTo\\18\\101":I
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_5
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_5

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element\\18":Ljava/lang/Object;
    move-object/from16 v25, v4

    check-cast v25, Lcom/luchime/huiyuan/LexiconEntry;

    .local v25, "it\\19":Lcom/luchime/huiyuan/LexiconEntry;
    const/16 v26, 0x0

    .line 36
    .local v26, "$i$a$-filter-CorpusExpander$expand$5$4\\19\\102\\13":I
    invoke-virtual/range {v25 .. v25}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    .line 102
    .end local v25    # "it\\19":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v26    # "$i$a$-filter-CorpusExpander$expand$5$4\\19\\102\\13":I
    if-eqz v8, :cond_4

    move-object/from16 v8, v22

    .end local v22    # "destination\\18":Ljava/util/Collection;
    .local v8, "destination\\18":Ljava/util/Collection;
    invoke-interface {v8, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .end local v8    # "destination\\18":Ljava/util/Collection;
    .restart local v22    # "destination\\18":Ljava/util/Collection;
    :cond_4
    move-object/from16 v8, v22

    .end local v22    # "destination\\18":Ljava/util/Collection;
    .restart local v8    # "destination\\18":Ljava/util/Collection;
    :goto_6
    const/16 v8, 0xa

    goto :goto_5

    .line 103
    .end local v4    # "element\\18":Ljava/lang/Object;
    .end local v8    # "destination\\18":Ljava/util/Collection;
    .restart local v22    # "destination\\18":Ljava/util/Collection;
    :cond_5
    move-object/from16 v8, v22

    .end local v20    # "$i$f$filterTo\\18\\101":I
    .end local v21    # "$this$filterTo\\18":Ljava/lang/Iterable;
    .end local v22    # "destination\\18":Ljava/util/Collection;
    move-object v4, v8

    check-cast v4, Ljava/util/List;

    .line 101
    nop

    .end local v17    # "$this$filter\\17":Ljava/lang/Iterable;
    .end local v19    # "$i$f$filter\\17\\36":I
    check-cast v4, Ljava/lang/Iterable;

    .line 37
    nop

    .local v4, "$this$forEach\\20":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 104
    .local v8, "$i$f$forEach\\20\\37":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_7
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_6

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .local v19, "element\\20":Ljava/lang/Object;
    move-object/from16 v0, v19

    check-cast v0, Lcom/luchime/huiyuan/LexiconEntry;

    .local v0, "it\\21":Lcom/luchime/huiyuan/LexiconEntry;
    const/16 v20, 0x0

    .line 37
    .local v20, "$i$a$-forEach-CorpusExpander$expand$5$5\\21\\104\\13":I
    invoke-virtual {v0}, Lcom/luchime/huiyuan/LexiconEntry;->getText()Ljava/lang/String;

    move-result-object v21

    check-cast v21, Ljava/lang/CharSequence;

    invoke-static/range {v21 .. v21}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v21, v4

    move-object/from16 v4, v18

    .end local v18    # "unique\\13":Ljava/util/LinkedHashMap;
    .local v4, "unique\\13":Ljava/util/LinkedHashMap;
    .local v21, "$this$forEach\\20":Ljava/lang/Iterable;
    invoke-virtual {v4, v1, v0}, Ljava/util/LinkedHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .end local v0    # "it\\21":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v20    # "$i$a$-forEach-CorpusExpander$expand$5$5\\21\\104\\13":I
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v4, v21

    .end local v19    # "element\\20":Ljava/lang/Object;
    goto :goto_7

    .line 105
    .end local v21    # "$this$forEach\\20":Ljava/lang/Iterable;
    .local v4, "$this$forEach\\20":Ljava/lang/Iterable;
    .restart local v18    # "unique\\13":Ljava/util/LinkedHashMap;
    :cond_6
    move-object/from16 v21, v4

    move-object/from16 v4, v18

    .line 39
    .end local v8    # "$i$f$forEach\\20\\37":I
    .end local v18    # "unique\\13":Ljava/util/LinkedHashMap;
    .local v4, "unique\\13":Ljava/util/LinkedHashMap;
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v3}, Lcom/luchime/huiyuan/CorpusBlueprint;->getKeys()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 40
    nop

    .local v0, "$this$map\\22":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 106
    .local v1, "$i$f$map\\22\\40":I
    new-instance v8, Ljava/util/ArrayList;

    move/from16 v17, v1

    move-object/from16 v18, v5

    const/16 v1, 0xa

    .end local v1    # "$i$f$map\\22\\40":I
    .end local v5    # "categoryOrder":Ljava/util/List;
    .local v17, "$i$f$map\\22\\40":I
    .local v18, "categoryOrder":Ljava/util/List;
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    move-object v5, v8

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\23":Ljava/util/Collection;
    move-object v8, v0

    .local v8, "$this$mapTo\\23":Ljava/lang/Iterable;
    const/16 v19, 0x0

    .line 107
    .local v19, "$i$f$mapTo\\23\\106":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_8
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_7

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    .line 108
    .local v21, "item\\23":Ljava/lang/Object;
    move-object/from16 v22, v21

    check-cast v22, Ljava/lang/String;

    .local v22, "it\\24":Ljava/lang/String;
    const/16 v23, 0x0

    .line 40
    .local v23, "$i$a$-map-CorpusExpander$expand$5$searchKeys$1\\24\\108\\13":I
    move-object/from16 v25, v22

    check-cast v25, Ljava/lang/CharSequence;

    invoke-static/range {v25 .. v25}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 108
    .end local v22    # "it\\24":Ljava/lang/String;
    .end local v23    # "$i$a$-map-CorpusExpander$expand$5$searchKeys$1\\24\\108\\13":I
    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v1, 0xa

    goto :goto_8

    .line 109
    .end local v21    # "item\\23":Ljava/lang/Object;
    :cond_7
    nop

    .end local v5    # "destination\\23":Ljava/util/Collection;
    .end local v8    # "$this$mapTo\\23":Ljava/lang/Iterable;
    .end local v19    # "$i$f$mapTo\\23\\106":I
    move-object v1, v5

    check-cast v1, Ljava/util/List;

    .line 106
    nop

    .end local v0    # "$this$map\\22":Ljava/lang/Iterable;
    .end local v17    # "$i$f$map\\22\\40":I
    check-cast v1, Ljava/lang/Iterable;

    .line 41
    nop

    .local v1, "$this$filter\\25":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 110
    .local v0, "$i$f$filter\\25\\41":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\26":Ljava/util/Collection;
    move-object v8, v1

    .local v8, "$this$filterTo\\26":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 111
    .local v17, "$i$f$filterTo\\26\\110":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_9
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v0

    .end local v0    # "$i$f$filter\\25\\41":I
    .local v20, "$i$f$filter\\25\\41":I
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .local v0, "element\\26":Ljava/lang/Object;
    move-object/from16 v21, v0

    check-cast v21, Ljava/lang/String;

    .local v21, "it\\27":Ljava/lang/String;
    const/16 v22, 0x0

    .line 41
    .local v22, "$i$a$-filter-CorpusExpander$expand$5$searchKeys$2\\27\\111\\13":I
    move-object/from16 v23, v21

    check-cast v23, Ljava/lang/CharSequence;

    invoke-interface/range {v23 .. v23}, Ljava/lang/CharSequence;->length()I

    move-result v23

    if-lez v23, :cond_8

    const/16 v23, 0x1

    goto :goto_a

    :cond_8
    const/16 v23, 0x0

    .line 111
    .end local v21    # "it\\27":Ljava/lang/String;
    .end local v22    # "$i$a$-filter-CorpusExpander$expand$5$searchKeys$2\\27\\111\\13":I
    :goto_a
    if-eqz v23, :cond_9

    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_9
    move/from16 v0, v20

    goto :goto_9

    .line 112
    .end local v20    # "$i$f$filter\\25\\41":I
    .local v0, "$i$f$filter\\25\\41":I
    :cond_a
    move/from16 v20, v0

    .end local v0    # "$i$f$filter\\25\\41":I
    .end local v5    # "destination\\26":Ljava/util/Collection;
    .end local v8    # "$this$filterTo\\26":Ljava/lang/Iterable;
    .end local v17    # "$i$f$filterTo\\26\\110":I
    .restart local v20    # "$i$f$filter\\25\\41":I
    move-object v0, v5

    check-cast v0, Ljava/util/List;

    .line 110
    nop

    .end local v1    # "$this$filter\\25":Ljava/lang/Iterable;
    .end local v20    # "$i$f$filter\\25\\41":I
    check-cast v0, Ljava/lang/Iterable;

    .line 42
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 39
    nop

    .line 44
    .local v0, "searchKeys\\13":Ljava/util/List;
    sget-object v1, Lcom/luchime/huiyuan/CorpusExpander;->INSTANCE:Lcom/luchime/huiyuan/CorpusExpander;

    invoke-direct {v1, v3}, Lcom/luchime/huiyuan/CorpusExpander;->expansionSequence(Lcom/luchime/huiyuan/CorpusBlueprint;)Lkotlin/sequences/Sequence;

    move-result-object v1

    .local v1, "$this$forEach\\28":Lkotlin/sequences/Sequence;
    const/4 v5, 0x0

    .line 113
    .local v5, "$i$f$forEach\\28\\44":I
    invoke-interface {v1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v19, v1

    .end local v1    # "$this$forEach\\28":Lkotlin/sequences/Sequence;
    .local v17, "element\\28":Ljava/lang/Object;
    .local v19, "$this$forEach\\28":Lkotlin/sequences/Sequence;
    move-object/from16 v1, v17

    check-cast v1, Ljava/lang/String;

    .local v1, "text\\29":Ljava/lang/String;
    const/16 v20, 0x0

    .line 45
    .local v20, "$i$a$-forEach-CorpusExpander$expand$5$6\\29\\113\\13":I
    move-object/from16 v21, v3

    .end local v3    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .local v21, "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->size()I

    move-result v3

    if-ge v3, v2, :cond_b

    .line 46
    nop

    .line 47
    nop

    .line 48
    new-instance v3, Lcom/luchime/huiyuan/LexiconEntry;

    invoke-direct {v3, v15, v0, v1}, Lcom/luchime/huiyuan/LexiconEntry;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 46
    invoke-virtual {v4, v1, v3}, Ljava/util/LinkedHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    :cond_b
    nop

    .line 113
    .end local v1    # "text\\29":Ljava/lang/String;
    .end local v20    # "$i$a$-forEach-CorpusExpander$expand$5$6\\29\\113\\13":I
    move-object/from16 v1, v19

    move-object/from16 v3, v21

    .end local v17    # "element\\28":Ljava/lang/Object;
    goto :goto_b

    .line 114
    .end local v19    # "$this$forEach\\28":Lkotlin/sequences/Sequence;
    .end local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .local v1, "$this$forEach\\28":Lkotlin/sequences/Sequence;
    .restart local v3    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    :cond_c
    move-object/from16 v19, v1

    move-object/from16 v21, v3

    .line 53
    .end local v1    # "$this$forEach\\28":Lkotlin/sequences/Sequence;
    .end local v3    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .end local v5    # "$i$f$forEach\\28\\44":I
    .restart local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    if-lt v1, v2, :cond_d

    const/4 v1, 0x1

    goto :goto_c

    :cond_d
    const/4 v1, 0x0

    :goto_c
    if-eqz v1, :cond_e

    .line 56
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v3, "<get-values>(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 100
    .end local v0    # "searchKeys\\13":Ljava/util/List;
    .end local v4    # "unique\\13":Ljava/util/LinkedHashMap;
    .end local v15    # "category\\13":Ljava/lang/String;
    .end local v16    # "$i$a$-flatMap-CorpusExpander$expand$5\\13\\100\\0":I
    .end local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    nop

    .line 115
    .local v1, "list\\12":Ljava/lang/Iterable;
    invoke-static {v9, v1}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v5, v18

    const/16 v8, 0xa

    .end local v1    # "list\\12":Ljava/lang/Iterable;
    goto/16 :goto_4

    .line 53
    .restart local v0    # "searchKeys\\13":Ljava/util/List;
    .restart local v4    # "unique\\13":Ljava/util/LinkedHashMap;
    .restart local v15    # "category\\13":Ljava/lang/String;
    .restart local v16    # "$i$a$-flatMap-CorpusExpander$expand$5\\13\\100\\0":I
    .restart local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    :cond_e
    const/4 v1, 0x0

    .line 54
    .local v1, "$i$a$-require-CorpusExpander$expand$5$7\\30\\53\\13":I
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->size()I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v8, " \u53bb\u91cd\u540e\u53ea\u6709 "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " \u6761\uff0c\u672a\u8fbe\u5230 "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " \u6761"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 53
    .end local v1    # "$i$a$-require-CorpusExpander$expand$5$7\\30\\53\\13":I
    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 87
    .end local v0    # "searchKeys\\13":Ljava/util/List;
    .end local v4    # "unique\\13":Ljava/util/LinkedHashMap;
    .end local v18    # "categoryOrder":Ljava/util/List;
    .end local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .restart local v3    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .local v5, "categoryOrder":Ljava/util/List;
    :cond_f
    move-object/from16 v21, v3

    .end local v3    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .restart local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    const/4 v0, 0x0

    .line 32
    .local v0, "$i$a$-require-CorpusExpander$expand$5$3\\16\\32\\13":I
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " \u7f3a\u5c11\u6821\u9a8c\u65b9\u6cd5"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-CorpusExpander$expand$5$3\\16\\32\\13":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 87
    .end local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .restart local v3    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    :cond_10
    move-object/from16 v21, v3

    .end local v3    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .restart local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    const/4 v0, 0x0

    .line 31
    .local v0, "$i$a$-require-CorpusExpander$expand$5$2\\15\\31\\13":I
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " \u7f3a\u5c11\u884c\u52a8\u5efa\u8bae"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-CorpusExpander$expand$5$2\\15\\31\\13":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 87
    .end local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .restart local v3    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    :cond_11
    move-object/from16 v21, v3

    .end local v3    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    .restart local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    const/4 v0, 0x0

    .line 30
    .local v0, "$i$a$-require-CorpusExpander$expand$5$1\\14\\30\\13":I
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " \u7f3a\u5c11\u8ba4\u77e5\u89c6\u89d2"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-CorpusExpander$expand$5$1\\14\\30\\13":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 117
    .end local v14    # "element\\12":Ljava/lang/Object;
    .end local v15    # "category\\13":Ljava/lang/String;
    .end local v16    # "$i$a$-flatMap-CorpusExpander$expand$5\\13\\100\\0":I
    .end local v21    # "blueprint\\13":Lcom/luchime/huiyuan/CorpusBlueprint;
    :cond_12
    nop

    .end local v9    # "destination\\12":Ljava/util/Collection;
    .end local v11    # "$this$flatMapTo\\12":Ljava/lang/Iterable;
    .end local v12    # "$i$f$flatMapTo\\12\\98":I
    move-object v0, v9

    check-cast v0, Ljava/util/List;

    .line 98
    nop

    .line 28
    .end local v6    # "$this$flatMap\\11":Ljava/lang/Iterable;
    .end local v7    # "$i$f$flatMap\\11\\28":I
    return-object v0

    .line 24
    :cond_13
    move-object/from16 v18, v5

    .end local v5    # "categoryOrder":Ljava/util/List;
    .restart local v18    # "categoryOrder":Ljava/util/List;
    const/4 v0, 0x0

    .line 25
    .local v0, "$i$a$-require-CorpusExpander$expand$4\\10\\24\\0":I
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u8bed\u6599\u84dd\u56fe\u5fc5\u987b\u5b8c\u6574\u8986\u76d6\u7f51\u9875\u7684 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " \u4e2a\u7ef4\u5ea6"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 24
    .end local v0    # "$i$a$-require-CorpusExpander$expand$4\\10\\24\\0":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 87
    .end local v18    # "categoryOrder":Ljava/util/List;
    .restart local v5    # "categoryOrder":Ljava/util/List;
    :cond_14
    const/4 v0, 0x0

    .line 23
    .local v0, "$i$a$-require-CorpusExpander$expand$3\\9\\23\\0":I
    nop

    .end local v0    # "$i$a$-require-CorpusExpander$expand$3\\9\\23\\0":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\u8bed\u6599\u84dd\u56fe\u5206\u7c7b\u4e0d\u80fd\u91cd\u590d"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    .end local v5    # "categoryOrder":Ljava/util/List;
    .end local v10    # "blueprintByCategory":Ljava/util/Map;
    :cond_15
    const/4 v0, 0x0

    .line 19
    .local v0, "$i$a$-require-CorpusExpander$expand$2\\2\\19\\0":I
    nop

    .end local v0    # "$i$a$-require-CorpusExpander$expand$2\\2\\19\\0":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\u6bcf\u7c7b\u8bed\u6599\u76ee\u6807\u5fc5\u987b\u5927\u4e8e\u96f6"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_16
    const/4 v0, 0x0

    .line 18
    .local v0, "$i$a$-require-CorpusExpander$expand$1\\1\\18\\0":I
    nop

    .end local v0    # "$i$a$-require-CorpusExpander$expand$1\\1\\18\\0":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\u539f\u59cb\u7f51\u9875\u8bed\u6599\u4e0d\u80fd\u4e3a\u7a7a"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
