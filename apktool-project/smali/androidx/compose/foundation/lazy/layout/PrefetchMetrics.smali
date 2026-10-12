.class public final Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;
.super Ljava/lang/Object;
.source "LazyLayoutPrefetchState.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n683#2:542\n1#3:543\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n*L\n170#1:542\n170#1:543\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\u00052\u0008\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\r\u001a\u00020\u000c2\u0008\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000cJ\u0018\u0010\u0011\u001a\u00020\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000cR\u001c\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;",
        "",
        "()V",
        "averagesByContentType",
        "Landroidx/collection/MutableScatterMap;",
        "Landroidx/compose/foundation/lazy/layout/Averages;",
        "lastUsedAverage",
        "lastUsedContentType",
        "overallAverage",
        "getAverage",
        "contentType",
        "getCompositionTimeNanos",
        "",
        "getMeasureTimeNanos",
        "saveCompositionTime",
        "",
        "timeNanos",
        "saveMeasureTime",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final averagesByContentType:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Landroidx/compose/foundation/lazy/layout/Averages;",
            ">;"
        }
    .end annotation
.end field

.field private lastUsedAverage:Landroidx/compose/foundation/lazy/layout/Averages;

.field private lastUsedContentType:Ljava/lang/Object;

.field private final overallAverage:Landroidx/compose/foundation/lazy/layout/Averages;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 178
    new-instance v0, Landroidx/compose/foundation/lazy/layout/Averages;

    invoke-direct {v0}, Landroidx/compose/foundation/lazy/layout/Averages;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->overallAverage:Landroidx/compose/foundation/lazy/layout/Averages;

    .line 179
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->averagesByContentType:Landroidx/collection/MutableScatterMap;

    .line 157
    return-void
.end method

.method private final getAverage(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/Averages;
    .locals 6
    .param p1, "contentType"    # Ljava/lang/Object;

    .line 165
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->lastUsedAverage:Landroidx/compose/foundation/lazy/layout/Averages;

    .line 166
    .local v0, "lastUsedAverage":Landroidx/compose/foundation/lazy/layout/Averages;
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->lastUsedContentType:Ljava/lang/Object;

    if-ne v1, p1, :cond_0

    if-eqz v0, :cond_0

    .line 167
    move-object v3, v0

    goto :goto_0

    .line 169
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->averagesByContentType:Landroidx/collection/MutableScatterMap;

    .line 170
    nop

    .local v1, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v2, 0x0

    .line 542
    .local v2, "$i$f$getOrPut":I
    invoke-virtual {v1, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    const/4 v3, 0x0

    .line 170
    .local v3, "$i$a$-getOrPut-PrefetchMetrics$getAverage$1":I
    iget-object v4, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->overallAverage:Landroidx/compose/foundation/lazy/layout/Averages;

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/layout/Averages;->copy()Landroidx/compose/foundation/lazy/layout/Averages;

    move-result-object v3

    .line 542
    .end local v3    # "$i$a$-getOrPut-PrefetchMetrics$getAverage$1":I
    move-object v4, v3

    .line 543
    .local v4, "it$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 542
    .local v5, "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    invoke-virtual {v1, p1, v4}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 171
    .end local v1    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v2    # "$i$f$getOrPut":I
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v5    # "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    :cond_1
    move-object v1, v3

    check-cast v1, Landroidx/compose/foundation/lazy/layout/Averages;

    .local v1, "it":Landroidx/compose/foundation/lazy/layout/Averages;
    const/4 v2, 0x0

    .line 172
    .local v2, "$i$a$-also-PrefetchMetrics$getAverage$2":I
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->lastUsedContentType:Ljava/lang/Object;

    .line 173
    iput-object v1, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->lastUsedAverage:Landroidx/compose/foundation/lazy/layout/Averages;

    .line 174
    nop

    .line 171
    .end local v1    # "it":Landroidx/compose/foundation/lazy/layout/Averages;
    .end local v2    # "$i$a$-also-PrefetchMetrics$getAverage$2":I
    check-cast v3, Landroidx/compose/foundation/lazy/layout/Averages;

    .line 166
    :goto_0
    return-object v3
.end method


# virtual methods
.method public final getCompositionTimeNanos(Ljava/lang/Object;)J
    .locals 2
    .param p1, "contentType"    # Ljava/lang/Object;

    .line 184
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->getAverage(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/Averages;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/Averages;->getCompositionTimeNanos()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getMeasureTimeNanos(Ljava/lang/Object;)J
    .locals 2
    .param p1, "contentType"    # Ljava/lang/Object;

    .line 186
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->getAverage(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/Averages;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/Averages;->getMeasureTimeNanos()J

    move-result-wide v0

    return-wide v0
.end method

.method public final saveCompositionTime(Ljava/lang/Object;J)V
    .locals 1
    .param p1, "contentType"    # Ljava/lang/Object;
    .param p2, "timeNanos"    # J

    .line 189
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->overallAverage:Landroidx/compose/foundation/lazy/layout/Averages;

    invoke-virtual {v0, p2, p3}, Landroidx/compose/foundation/lazy/layout/Averages;->saveCompositionTimeNanos(J)V

    .line 190
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->getAverage(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/Averages;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Landroidx/compose/foundation/lazy/layout/Averages;->saveCompositionTimeNanos(J)V

    .line 191
    return-void
.end method

.method public final saveMeasureTime(Ljava/lang/Object;J)V
    .locals 1
    .param p1, "contentType"    # Ljava/lang/Object;
    .param p2, "timeNanos"    # J

    .line 194
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->overallAverage:Landroidx/compose/foundation/lazy/layout/Averages;

    invoke-virtual {v0, p2, p3}, Landroidx/compose/foundation/lazy/layout/Averages;->saveMeasureTimeNanos(J)V

    .line 195
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;->getAverage(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/Averages;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Landroidx/compose/foundation/lazy/layout/Averages;->saveMeasureTimeNanos(J)V

    .line 196
    return-void
.end method
