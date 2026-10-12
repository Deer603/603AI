.class public final Lcom/luchime/huiyuan/UsageStats;
.super Ljava/lang/Object;
.source "AppModels.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003JI\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001d\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\r\u00a8\u0006!"
    }
    d2 = {
        "Lcom/luchime/huiyuan/UsageStats;",
        "",
        "totalQuestions",
        "",
        "randomDraws",
        "streakDays",
        "lastActiveDate",
        "",
        "categoryCounts",
        "",
        "<init>",
        "(IIILjava/lang/String;Ljava/util/Map;)V",
        "getTotalQuestions",
        "()I",
        "getRandomDraws",
        "getStreakDays",
        "getLastActiveDate",
        "()Ljava/lang/String;",
        "getCategoryCounts",
        "()Ljava/util/Map;",
        "totalInteractions",
        "getTotalInteractions",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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


# instance fields
.field private final categoryCounts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final lastActiveDate:Ljava/lang/String;

.field private final randomDraws:I

.field private final streakDays:I

.field private final totalQuestions:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/luchime/huiyuan/UsageStats;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/luchime/huiyuan/UsageStats;-><init>(IIILjava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Ljava/util/Map;)V
    .locals 1
    .param p1, "totalQuestions"    # I
    .param p2, "randomDraws"    # I
    .param p3, "streakDays"    # I
    .param p4, "lastActiveDate"    # Ljava/lang/String;
    .param p5, "categoryCounts"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "categoryCounts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput p1, p0, Lcom/luchime/huiyuan/UsageStats;->totalQuestions:I

    .line 23
    iput p2, p0, Lcom/luchime/huiyuan/UsageStats;->randomDraws:I

    .line 24
    iput p3, p0, Lcom/luchime/huiyuan/UsageStats;->streakDays:I

    .line 25
    iput-object p4, p0, Lcom/luchime/huiyuan/UsageStats;->lastActiveDate:Ljava/lang/String;

    .line 26
    iput-object p5, p0, Lcom/luchime/huiyuan/UsageStats;->categoryCounts:Ljava/util/Map;

    .line 21
    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    .line 21
    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    .line 22
    move p1, v0

    .line 21
    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 23
    move p2, v0

    .line 21
    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    .line 24
    move p3, v0

    .line 21
    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    .line 25
    const/4 p4, 0x0

    .line 21
    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 26
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p5

    move-object p6, p5

    goto :goto_0

    .line 21
    :cond_4
    move-object p6, p5

    :goto_0
    move-object p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, Lcom/luchime/huiyuan/UsageStats;-><init>(IIILjava/lang/String;Ljava/util/Map;)V

    .line 27
    return-void
.end method

.method public static synthetic copy$default(Lcom/luchime/huiyuan/UsageStats;IIILjava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/luchime/huiyuan/UsageStats;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/luchime/huiyuan/UsageStats;->totalQuestions:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/luchime/huiyuan/UsageStats;->randomDraws:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/luchime/huiyuan/UsageStats;->streakDays:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/luchime/huiyuan/UsageStats;->lastActiveDate:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/luchime/huiyuan/UsageStats;->categoryCounts:Ljava/util/Map;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/luchime/huiyuan/UsageStats;->copy(IIILjava/lang/String;Ljava/util/Map;)Lcom/luchime/huiyuan/UsageStats;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/luchime/huiyuan/UsageStats;->totalQuestions:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/luchime/huiyuan/UsageStats;->randomDraws:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/luchime/huiyuan/UsageStats;->streakDays:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/UsageStats;->lastActiveDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/luchime/huiyuan/UsageStats;->categoryCounts:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(IIILjava/lang/String;Ljava/util/Map;)Lcom/luchime/huiyuan/UsageStats;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/luchime/huiyuan/UsageStats;"
        }
    .end annotation

    const-string v0, "categoryCounts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/luchime/huiyuan/UsageStats;

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/luchime/huiyuan/UsageStats;-><init>(IIILjava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/luchime/huiyuan/UsageStats;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/luchime/huiyuan/UsageStats;

    iget v3, p0, Lcom/luchime/huiyuan/UsageStats;->totalQuestions:I

    iget v4, v1, Lcom/luchime/huiyuan/UsageStats;->totalQuestions:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/luchime/huiyuan/UsageStats;->randomDraws:I

    iget v4, v1, Lcom/luchime/huiyuan/UsageStats;->randomDraws:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget v3, p0, Lcom/luchime/huiyuan/UsageStats;->streakDays:I

    iget v4, v1, Lcom/luchime/huiyuan/UsageStats;->streakDays:I

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/luchime/huiyuan/UsageStats;->lastActiveDate:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/UsageStats;->lastActiveDate:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/luchime/huiyuan/UsageStats;->categoryCounts:Ljava/util/Map;

    iget-object v1, v1, Lcom/luchime/huiyuan/UsageStats;->categoryCounts:Ljava/util/Map;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCategoryCounts()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/luchime/huiyuan/UsageStats;->categoryCounts:Ljava/util/Map;

    return-object v0
.end method

.method public final getLastActiveDate()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/luchime/huiyuan/UsageStats;->lastActiveDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getRandomDraws()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/luchime/huiyuan/UsageStats;->randomDraws:I

    return v0
.end method

.method public final getStreakDays()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/luchime/huiyuan/UsageStats;->streakDays:I

    return v0
.end method

.method public final getTotalInteractions()I
    .locals 2

    .line 28
    iget v0, p0, Lcom/luchime/huiyuan/UsageStats;->totalQuestions:I

    iget v1, p0, Lcom/luchime/huiyuan/UsageStats;->randomDraws:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final getTotalQuestions()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/luchime/huiyuan/UsageStats;->totalQuestions:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/luchime/huiyuan/UsageStats;->totalQuestions:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/luchime/huiyuan/UsageStats;->randomDraws:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/luchime/huiyuan/UsageStats;->streakDays:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/UsageStats;->lastActiveDate:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/luchime/huiyuan/UsageStats;->lastActiveDate:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/UsageStats;->categoryCounts:Ljava/util/Map;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/luchime/huiyuan/UsageStats;->totalQuestions:I

    iget v1, p0, Lcom/luchime/huiyuan/UsageStats;->randomDraws:I

    iget v2, p0, Lcom/luchime/huiyuan/UsageStats;->streakDays:I

    iget-object v3, p0, Lcom/luchime/huiyuan/UsageStats;->lastActiveDate:Ljava/lang/String;

    iget-object v4, p0, Lcom/luchime/huiyuan/UsageStats;->categoryCounts:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "UsageStats(totalQuestions="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", randomDraws="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", streakDays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastActiveDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", categoryCounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
