.class public final Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;
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
    name = "ThinkLog"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0008H\u00c6\u0003J-\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;",
        "Lcom/luchime/huiyuan/ui/TimelineItem;",
        "id",
        "",
        "lines",
        "",
        "",
        "model",
        "Lcom/luchime/huiyuan/ui/AIModel;",
        "<init>",
        "(JLjava/util/List;Lcom/luchime/huiyuan/ui/AIModel;)V",
        "getId",
        "()J",
        "getLines",
        "()Ljava/util/List;",
        "getModel",
        "()Lcom/luchime/huiyuan/ui/AIModel;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
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

.field private final lines:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final model:Lcom/luchime/huiyuan/ui/AIModel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->$stable:I

    return-void
.end method

.method public constructor <init>(JLjava/util/List;Lcom/luchime/huiyuan/ui/AIModel;)V
    .locals 1
    .param p1, "id"    # J
    .param p3, "lines"    # Ljava/util/List;
    .param p4, "model"    # Lcom/luchime/huiyuan/ui/AIModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            ")V"
        }
    .end annotation

    const-string v0, "lines"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-wide p1, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->id:J

    .line 78
    iput-object p3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->lines:Ljava/util/List;

    .line 79
    iput-object p4, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->model:Lcom/luchime/huiyuan/ui/AIModel;

    .line 76
    return-void
.end method

.method public static synthetic copy$default(Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;JLjava/util/List;Lcom/luchime/huiyuan/ui/AIModel;ILjava/lang/Object;)Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->id:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->lines:Ljava/util/List;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->model:Lcom/luchime/huiyuan/ui/AIModel;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->copy(JLjava/util/List;Lcom/luchime/huiyuan/ui/AIModel;)Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->lines:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/luchime/huiyuan/ui/AIModel;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->model:Lcom/luchime/huiyuan/ui/AIModel;

    return-object v0
.end method

.method public final copy(JLjava/util/List;Lcom/luchime/huiyuan/ui/AIModel;)Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/luchime/huiyuan/ui/AIModel;",
            ")",
            "Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;"
        }
    .end annotation

    const-string v0, "lines"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;-><init>(JLjava/util/List;Lcom/luchime/huiyuan/ui/AIModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;

    iget-wide v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->id:J

    iget-wide v5, v1, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->id:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->lines:Ljava/util/List;

    iget-object v4, v1, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->lines:Ljava/util/List;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->model:Lcom/luchime/huiyuan/ui/AIModel;

    iget-object v1, v1, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->model:Lcom/luchime/huiyuan/ui/AIModel;

    if-eq v3, v1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getId()J
    .locals 2

    .line 77
    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->id:J

    return-wide v0
.end method

.method public final getLines()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->lines:Ljava/util/List;

    return-object v0
.end method

.method public final getModel()Lcom/luchime/huiyuan/ui/AIModel;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->model:Lcom/luchime/huiyuan/ui/AIModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->lines:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->model:Lcom/luchime/huiyuan/ui/AIModel;

    invoke-virtual {v2}, Lcom/luchime/huiyuan/ui/AIModel;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->id:J

    iget-object v2, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->lines:Ljava/util/List;

    iget-object v3, p0, Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;->model:Lcom/luchime/huiyuan/ui/AIModel;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ThinkLog(id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
