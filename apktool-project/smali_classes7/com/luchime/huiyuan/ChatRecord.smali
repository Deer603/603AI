.class public final Lcom/luchime/huiyuan/ChatRecord;
.super Ljava/lang/Object;
.source "AppModels.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001a\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003JS\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0012\u00a8\u0006$"
    }
    d2 = {
        "Lcom/luchime/huiyuan/ChatRecord;",
        "",
        "id",
        "",
        "isUser",
        "",
        "text",
        "",
        "tag",
        "sourceQuote",
        "timestamp",
        "modelId",
        "<init>",
        "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V",
        "getId",
        "()J",
        "()Z",
        "getText",
        "()Ljava/lang/String;",
        "getTag",
        "getSourceQuote",
        "getTimestamp",
        "getModelId",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
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
.field private final id:J

.field private final isUser:Z

.field private final modelId:Ljava/lang/String;

.field private final sourceQuote:Ljava/lang/String;

.field private final tag:Ljava/lang/String;

.field private final text:Ljava/lang/String;

.field private final timestamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 1
    .param p1, "id"    # J
    .param p3, "isUser"    # Z
    .param p4, "text"    # Ljava/lang/String;
    .param p5, "tag"    # Ljava/lang/String;
    .param p6, "sourceQuote"    # Ljava/lang/String;
    .param p7, "timestamp"    # J
    .param p9, "modelId"    # Ljava/lang/String;

    const-string v0, "text"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelId"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-wide p1, p0, Lcom/luchime/huiyuan/ChatRecord;->id:J

    .line 7
    iput-boolean p3, p0, Lcom/luchime/huiyuan/ChatRecord;->isUser:Z

    .line 8
    iput-object p4, p0, Lcom/luchime/huiyuan/ChatRecord;->text:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/luchime/huiyuan/ChatRecord;->tag:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/luchime/huiyuan/ChatRecord;->sourceQuote:Ljava/lang/String;

    .line 11
    iput-wide p7, p0, Lcom/luchime/huiyuan/ChatRecord;->timestamp:J

    .line 12
    iput-object p9, p0, Lcom/luchime/huiyuan/ChatRecord;->modelId:Ljava/lang/String;

    .line 5
    return-void
.end method

.method public synthetic constructor <init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    .line 5
    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_0

    .line 12
    const-string v0, "HUIYUAN"

    move-object v10, v0

    goto :goto_0

    .line 5
    :cond_0
    move-object/from16 v10, p9

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    invoke-direct/range {v1 .. v10}, Lcom/luchime/huiyuan/ChatRecord;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 13
    return-void
.end method

.method public static synthetic copy$default(Lcom/luchime/huiyuan/ChatRecord;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/luchime/huiyuan/ChatRecord;
    .locals 10

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/luchime/huiyuan/ChatRecord;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p10, 0x2

    if-eqz p1, :cond_1

    iget-boolean p3, p0, Lcom/luchime/huiyuan/ChatRecord;->isUser:Z

    :cond_1
    move v3, p3

    and-int/lit8 p1, p10, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/luchime/huiyuan/ChatRecord;->text:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p10, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/luchime/huiyuan/ChatRecord;->tag:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p10, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/luchime/huiyuan/ChatRecord;->sourceQuote:Ljava/lang/String;

    move-object v6, p1

    goto :goto_0

    :cond_4
    move-object/from16 v6, p6

    :goto_0
    and-int/lit8 p1, p10, 0x20

    if-eqz p1, :cond_5

    iget-wide p1, p0, Lcom/luchime/huiyuan/ChatRecord;->timestamp:J

    move-wide v7, p1

    goto :goto_1

    :cond_5
    move-wide/from16 v7, p7

    :goto_1
    and-int/lit8 p1, p10, 0x40

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/luchime/huiyuan/ChatRecord;->modelId:Ljava/lang/String;

    move-object v9, p1

    goto :goto_2

    :cond_6
    move-object/from16 v9, p9

    :goto_2
    move-object v0, p0

    invoke-virtual/range {v0 .. v9}, Lcom/luchime/huiyuan/ChatRecord;->copy(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/luchime/huiyuan/ChatRecord;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/luchime/huiyuan/ChatRecord;->id:J

    return-wide v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/luchime/huiyuan/ChatRecord;->isUser:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ChatRecord;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ChatRecord;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ChatRecord;->sourceQuote:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lcom/luchime/huiyuan/ChatRecord;->timestamp:J

    return-wide v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ChatRecord;->modelId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/luchime/huiyuan/ChatRecord;
    .locals 11

    const-string v0, "text"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelId"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/luchime/huiyuan/ChatRecord;

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    invoke-direct/range {v1 .. v10}, Lcom/luchime/huiyuan/ChatRecord;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/luchime/huiyuan/ChatRecord;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/luchime/huiyuan/ChatRecord;

    iget-wide v3, p0, Lcom/luchime/huiyuan/ChatRecord;->id:J

    iget-wide v5, v1, Lcom/luchime/huiyuan/ChatRecord;->id:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget-boolean v3, p0, Lcom/luchime/huiyuan/ChatRecord;->isUser:Z

    iget-boolean v4, v1, Lcom/luchime/huiyuan/ChatRecord;->isUser:Z

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/luchime/huiyuan/ChatRecord;->text:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/ChatRecord;->text:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/luchime/huiyuan/ChatRecord;->tag:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/ChatRecord;->tag:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/luchime/huiyuan/ChatRecord;->sourceQuote:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/ChatRecord;->sourceQuote:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/luchime/huiyuan/ChatRecord;->timestamp:J

    iget-wide v5, v1, Lcom/luchime/huiyuan/ChatRecord;->timestamp:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_7

    return v2

    :cond_7
    iget-object v3, p0, Lcom/luchime/huiyuan/ChatRecord;->modelId:Ljava/lang/String;

    iget-object v1, v1, Lcom/luchime/huiyuan/ChatRecord;->modelId:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 6
    iget-wide v0, p0, Lcom/luchime/huiyuan/ChatRecord;->id:J

    return-wide v0
.end method

.method public final getModelId()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/luchime/huiyuan/ChatRecord;->modelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceQuote()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/luchime/huiyuan/ChatRecord;->sourceQuote:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/luchime/huiyuan/ChatRecord;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/luchime/huiyuan/ChatRecord;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 11
    iget-wide v0, p0, Lcom/luchime/huiyuan/ChatRecord;->timestamp:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/luchime/huiyuan/ChatRecord;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/luchime/huiyuan/ChatRecord;->isUser:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ChatRecord;->text:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ChatRecord;->tag:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/luchime/huiyuan/ChatRecord;->tag:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ChatRecord;->sourceQuote:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/luchime/huiyuan/ChatRecord;->sourceQuote:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/luchime/huiyuan/ChatRecord;->timestamp:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ChatRecord;->modelId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public final isUser()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/luchime/huiyuan/ChatRecord;->isUser:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Lcom/luchime/huiyuan/ChatRecord;->id:J

    iget-boolean v2, p0, Lcom/luchime/huiyuan/ChatRecord;->isUser:Z

    iget-object v3, p0, Lcom/luchime/huiyuan/ChatRecord;->text:Ljava/lang/String;

    iget-object v4, p0, Lcom/luchime/huiyuan/ChatRecord;->tag:Ljava/lang/String;

    iget-object v5, p0, Lcom/luchime/huiyuan/ChatRecord;->sourceQuote:Ljava/lang/String;

    iget-wide v6, p0, Lcom/luchime/huiyuan/ChatRecord;->timestamp:J

    iget-object v8, p0, Lcom/luchime/huiyuan/ChatRecord;->modelId:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "ChatRecord(id="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sourceQuote="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", modelId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
