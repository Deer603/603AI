.class public final Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$thenByDescending$1;
.super Ljava/lang/Object;
.source "Comparisons.kt"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luchime/huiyuan/HuiyuanEngine;->matchEntry(Ljava/lang/String;)Lcom/luchime/huiyuan/LexiconEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 HuiyuanEngine.kt\ncom/luchime/huiyuan/HuiyuanEngine\n*L\n1#1,328:1\n197#2:329\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $sumByDimension$inlined:Ljava/util/LinkedHashMap;

.field final synthetic $this_thenByDescending:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;Ljava/util/LinkedHashMap;)V
    .locals 0

    iput-object p1, p0, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$thenByDescending$1;->$this_thenByDescending:Ljava/util/Comparator;

    iput-object p2, p0, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$thenByDescending$1;->$sumByDimension$inlined:Ljava/util/LinkedHashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6
    .param p1, "a"    # Ljava/lang/Object;
    .param p2, "b"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 170
    iget-object v0, p0, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$thenByDescending$1;->$this_thenByDescending:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    .line 171
    .local v0, "previousCompare":I
    if-eqz v0, :cond_0

    move v1, v0

    goto :goto_2

    :cond_0
    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    .local v1, "it\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 329
    .local v2, "$i$a$-thenByDescending-HuiyuanEngine$matchEntry$topDimension$2\\1\\171\\0":I
    iget-object v3, p0, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$thenByDescending$1;->$sumByDimension$inlined:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_0
    check-cast v3, Ljava/lang/Comparable;

    .line 171
    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-thenByDescending-HuiyuanEngine$matchEntry$topDimension$2\\1\\171\\0":I
    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    .local v1, "it\\2":Ljava/lang/String;
    const/4 v2, 0x0

    .line 329
    .local v2, "$i$a$-thenByDescending-HuiyuanEngine$matchEntry$topDimension$2\\2\\171\\0":I
    iget-object v5, p0, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$thenByDescending$1;->$sumByDimension$inlined:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    check-cast v5, Ljava/lang/Comparable;

    goto :goto_1

    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/Comparable;

    .line 171
    .end local v1    # "it\\2":Ljava/lang/String;
    .end local v2    # "$i$a$-thenByDescending-HuiyuanEngine$matchEntry$topDimension$2\\2\\171\\0":I
    :goto_1
    invoke-static {v3, v5}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v1

    :goto_2
    return v1
.end method
