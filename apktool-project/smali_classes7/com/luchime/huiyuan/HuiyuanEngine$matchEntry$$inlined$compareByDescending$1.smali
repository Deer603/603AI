.class public final Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$compareByDescending$1;
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
    value = "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HuiyuanEngine.kt\ncom/luchime/huiyuan/HuiyuanEngine\n*L\n1#1,328:1\n196#2:329\n*E\n"
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
.field final synthetic $bestByDimension$inlined:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashMap;)V
    .locals 0

    iput-object p1, p0, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$compareByDescending$1;->$bestByDimension$inlined:Ljava/util/LinkedHashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5
    .param p1, "a"    # Ljava/lang/Object;
    .param p2, "b"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 121
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    .local v0, "it\\1":Ljava/lang/String;
    const/4 v1, 0x0

    .line 329
    .local v1, "$i$a$-compareByDescending-HuiyuanEngine$matchEntry$topDimension$1\\1\\121\\0":I
    iget-object v2, p0, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$compareByDescending$1;->$bestByDimension$inlined:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v2, :cond_0

    check-cast v2, Ljava/lang/Comparable;

    goto :goto_0

    :cond_0
    move-object v2, v3

    check-cast v2, Ljava/lang/Comparable;

    .line 121
    .end local v0    # "it\\1":Ljava/lang/String;
    .end local v1    # "$i$a$-compareByDescending-HuiyuanEngine$matchEntry$topDimension$1\\1\\121\\0":I
    :goto_0
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .local v0, "it\\2":Ljava/lang/String;
    const/4 v1, 0x0

    .line 329
    .local v1, "$i$a$-compareByDescending-HuiyuanEngine$matchEntry$topDimension$1\\2\\121\\0":I
    iget-object v4, p0, Lcom/luchime/huiyuan/HuiyuanEngine$matchEntry$$inlined$compareByDescending$1;->$bestByDimension$inlined:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_1

    check-cast v4, Ljava/lang/Comparable;

    goto :goto_1

    :cond_1
    move-object v4, v3

    check-cast v4, Ljava/lang/Comparable;

    .line 121
    .end local v0    # "it\\2":Ljava/lang/String;
    .end local v1    # "$i$a$-compareByDescending-HuiyuanEngine$matchEntry$topDimension$1\\2\\121\\0":I
    :goto_1
    invoke-static {v2, v4}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    return v0
.end method
