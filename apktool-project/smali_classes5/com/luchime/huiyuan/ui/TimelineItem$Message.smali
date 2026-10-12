.class public final Lcom/luchime/huiyuan/ui/TimelineItem$Message;
.super Ljava/lang/Object;
.source "HuiyuanApp.kt"

# interfaces
.implements Lcom/luchime/huiyuan/ui/TimelineItem;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luchime/huiyuan/ui/TimelineItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Message"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\rH\u00c6\u0003J]\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\rH\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00052\u0008\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0007H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0012R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006)"
    }
    d2 = {
        "Lcom/luchime/huiyuan/ui/TimelineItem$Message;",
        "Lcom/luchime/huiyuan/ui/TimelineItem;",
        "id",
        "",
        "isUser",
        "",
        "text",
        "",
        "tag",
        "sourceQuote",
        "timestamp",
        "isStreaming",
        "model",
        "Lcom/luchime/huiyuan/ui/AIModel;",
        "<init>",
        "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;)V",
        "getId",
        "()J",
        "()Z",
        "getText",
        "()Ljava/lang/String;",
        "getTag",
        "getSourceQuote",
        "getTimestamp",
        "getModel",
        "()Lcom/luchime/huiyuan/ui/AIModel;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "other",
        "",
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

.field private final isStreaming:Z

.field private final isUser:Z

.field private final model:Lcom/luchime/huiyuan/ui/AIModel;

.field private final sourceQuote:Ljava/lang/String;

.field private final tag:Ljava/lang/String;

.field private final text:Ljava/lang/String;

.field private final timestamp:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;)V
    .locals 1
    .param p1, "id"    # J
    .param p3, "isUser"    # Z
    .param p4, "text"    # Ljava/lang/String;
    .param p5, "tag"    # Ljava/lang/String;
    .param p6, "sourceQuote"    # Ljava/lang/String;
    .param p7, "timestamp"    # J
    .param p9, "isStreaming"    # Z
    .param p10, "model"    # Lcom/luchime/huiyuan/ui/AIModel;

    const-string v0, "text"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-wide p1, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->id:J

    .line 67
    iput-boolean p3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isUser:Z

    .line 68
    iput-object p4, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->text:Ljava/lang/String;

    .line 69
    iput-object p5, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->tag:Ljava/lang/String;

    .line 70
    iput-object p6, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->sourceQuote:Ljava/lang/String;

    .line 71
    iput-wide p7, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->timestamp:J

    .line 72
    iput-boolean p9, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isStreaming:Z

    .line 73
    iput-object p10, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->model:Lcom/luchime/huiyuan/ui/AIModel;

    .line 65
    return-void
.end method

.method public synthetic constructor <init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    .line 65
    and-int/lit8 p12, p11, 0x8

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    .line 69
    move-object p5, v0

    .line 65
    :cond_0
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_1

    .line 70
    move-object p6, v0

    .line 65
    :cond_1
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_2

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p7

    .line 65
    :cond_2
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_3

    .line 72
    const/4 p9, 0x0

    .line 65
    :cond_3
    and-int/lit16 p11, p11, 0x80

    if-eqz p11, :cond_4

    .line 73
    sget-object p10, Lcom/luchime/huiyuan/ui/AIModel;->HUIYUAN:Lcom/luchime/huiyuan/ui/AIModel;

    move-object p11, p10

    goto :goto_0

    .line 65
    :cond_4
    move-object p11, p10

    :goto_0
    move p10, p9

    move-wide p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-wide p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p11}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;)V

    .line 74
    return-void
.end method

.method public static synthetic copy$default(Lcom/luchime/huiyuan/ui/TimelineItem$Message;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;ILjava/lang/Object;)Lcom/luchime/huiyuan/ui/TimelineItem$Message;
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-boolean p3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isUser:Z

    :cond_1
    move v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->text:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->tag:Ljava/lang/String;

    move-object v5, p1

    goto :goto_0

    :cond_3
    move-object/from16 v5, p5

    :goto_0
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->sourceQuote:Ljava/lang/String;

    move-object v6, p1

    goto :goto_1

    :cond_4
    move-object/from16 v6, p6

    :goto_1
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-wide p1, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->timestamp:J

    move-wide v7, p1

    goto :goto_2

    :cond_5
    move-wide/from16 v7, p7

    :goto_2
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isStreaming:Z

    move v9, p1

    goto :goto_3

    :cond_6
    move/from16 v9, p9

    :goto_3
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->model:Lcom/luchime/huiyuan/ui/AIModel;

    move-object v10, p1

    goto :goto_4

    :cond_7
    move-object/from16 v10, p10

    :goto_4
    move-object v0, p0

    invoke-virtual/range {v0 .. v10}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->copy(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;)Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->id:J

    return-wide v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isUser:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->sourceQuote:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->timestamp:J

    return-wide v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isStreaming:Z

    return v0
.end method

.method public final component8()Lcom/luchime/huiyuan/ui/AIModel;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->model:Lcom/luchime/huiyuan/ui/AIModel;

    return-object v0
.end method

.method public final copy(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;)Lcom/luchime/huiyuan/ui/TimelineItem$Message;
    .locals 12

    const-string v0, "text"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    move-wide v2, p1

    move v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    move/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcom/luchime/huiyuan/ui/TimelineItem$Message;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLcom/luchime/huiyuan/ui/AIModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;

    iget-wide v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->id:J

    iget-wide v5, v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->id:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget-boolean v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isUser:Z

    iget-boolean v4, v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isUser:Z

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->text:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->text:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->tag:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->tag:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->sourceQuote:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->sourceQuote:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->timestamp:J

    iget-wide v5, v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->timestamp:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_7

    return v2

    :cond_7
    iget-boolean v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isStreaming:Z

    iget-boolean v4, v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isStreaming:Z

    if-eq v3, v4, :cond_8

    return v2

    :cond_8
    iget-object v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->model:Lcom/luchime/huiyuan/ui/AIModel;

    iget-object v1, v1, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->model:Lcom/luchime/huiyuan/ui/AIModel;

    if-eq v3, v1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public getId()J
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->id:J

    return-wide v0
.end method

.method public final getModel()Lcom/luchime/huiyuan/ui/AIModel;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->model:Lcom/luchime/huiyuan/ui/AIModel;

    return-object v0
.end method

.method public final getSourceQuote()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->sourceQuote:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->timestamp:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isUser:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->text:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->tag:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->tag:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->sourceQuote:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->sourceQuote:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->timestamp:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isStreaming:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->model:Lcom/luchime/huiyuan/ui/AIModel;

    invoke-virtual {v2}, Lcom/luchime/huiyuan/ui/AIModel;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public final isStreaming()Z
    .locals 1

    .line 72
    iget-boolean v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isStreaming:Z

    return v0
.end method

.method public final isUser()Z
    .locals 1

    .line 67
    iget-boolean v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isUser:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->id:J

    iget-boolean v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isUser:Z

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->text:Ljava/lang/String;

    iget-object v4, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->tag:Ljava/lang/String;

    iget-object v5, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->sourceQuote:Ljava/lang/String;

    iget-wide v6, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->timestamp:J

    iget-boolean v8, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->isStreaming:Z

    iget-object v9, p0, Lcom/luchime/huiyuan/ui/TimelineItem$Message;->model:Lcom/luchime/huiyuan/ui/AIModel;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Message(id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

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

    const-string v1, ", isStreaming="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
