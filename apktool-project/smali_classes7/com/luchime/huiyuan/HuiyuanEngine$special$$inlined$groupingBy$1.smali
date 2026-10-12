.class public final Lcom/luchime/huiyuan/HuiyuanEngine$special$$inlined$groupingBy$1;
.super Ljava/lang/Object;
.source "_Collections.kt"

# interfaces
.implements Lkotlin/collections/Grouping;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/HuiyuanEngine;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/random/Random;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/luchime/huiyuan/EnginePersona;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/collections/Grouping<",
        "Lcom/luchime/huiyuan/LexiconEntry;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n+ 2 HuiyuanEngine.kt\ncom/luchime/huiyuan/HuiyuanEngine\n*L\n1#1,3794:1\n50#2:3795\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u000e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007\u00b8\u0006\u0000"
    }
    d2 = {
        "kotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1",
        "Lkotlin/collections/Grouping;",
        "sourceIterator",
        "",
        "keyOf",
        "element",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $this_groupingBy:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0
    .param p1, "$receiver"    # Ljava/lang/Iterable;

    iput-object p1, p0, Lcom/luchime/huiyuan/HuiyuanEngine$special$$inlined$groupingBy$1;->$this_groupingBy:Ljava/lang/Iterable;

    .line 1550
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public keyOf(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1552
    move-object v0, p1

    check-cast v0, Lcom/luchime/huiyuan/LexiconEntry;

    .local v0, "it\\1":Lcom/luchime/huiyuan/LexiconEntry;
    const/4 v1, 0x0

    .line 3795
    .local v1, "$i$a$-groupingBy-HuiyuanEngine$categoryCounts$1\\1\\1552\\0":I
    invoke-virtual {v0}, Lcom/luchime/huiyuan/LexiconEntry;->getCategory()Ljava/lang/String;

    move-result-object v0

    .line 1552
    .end local v0    # "it\\1":Lcom/luchime/huiyuan/LexiconEntry;
    .end local v1    # "$i$a$-groupingBy-HuiyuanEngine$categoryCounts$1\\1\\1552\\0":I
    return-object v0
.end method

.method public sourceIterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/luchime/huiyuan/LexiconEntry;",
            ">;"
        }
    .end annotation

    .line 1551
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine$special$$inlined$groupingBy$1;->$this_groupingBy:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
