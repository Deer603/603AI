.class public final Lcom/luchime/huiyuan/ReplyResult;
.super Ljava/lang/Object;
.source "HuiyuanEngine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J=\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/luchime/huiyuan/ReplyResult;",
        "",
        "kind",
        "",
        "text",
        "tag",
        "entry",
        "Lcom/luchime/huiyuan/LexiconEntry;",
        "dimension",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V",
        "getKind",
        "()Ljava/lang/String;",
        "getText",
        "getTag",
        "getEntry",
        "()Lcom/luchime/huiyuan/LexiconEntry;",
        "getDimension",
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
.field private final dimension:Ljava/lang/String;

.field private final entry:Lcom/luchime/huiyuan/LexiconEntry;

.field private final kind:Ljava/lang/String;

.field private final tag:Ljava/lang/String;

.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/luchime/huiyuan/ReplyResult;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V
    .locals 1
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "text"    # Ljava/lang/String;
    .param p3, "tag"    # Ljava/lang/String;
    .param p4, "entry"    # Lcom/luchime/huiyuan/LexiconEntry;
    .param p5, "dimension"    # Ljava/lang/String;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dimension"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/luchime/huiyuan/ReplyResult;->kind:Ljava/lang/String;

    .line 24
    iput-object p2, p0, Lcom/luchime/huiyuan/ReplyResult;->text:Ljava/lang/String;

    .line 25
    iput-object p3, p0, Lcom/luchime/huiyuan/ReplyResult;->tag:Ljava/lang/String;

    .line 26
    iput-object p4, p0, Lcom/luchime/huiyuan/ReplyResult;->entry:Lcom/luchime/huiyuan/LexiconEntry;

    .line 27
    iput-object p5, p0, Lcom/luchime/huiyuan/ReplyResult;->dimension:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public static synthetic copy$default(Lcom/luchime/huiyuan/ReplyResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;ILjava/lang/Object;)Lcom/luchime/huiyuan/ReplyResult;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/luchime/huiyuan/ReplyResult;->kind:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/luchime/huiyuan/ReplyResult;->text:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/luchime/huiyuan/ReplyResult;->tag:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/luchime/huiyuan/ReplyResult;->entry:Lcom/luchime/huiyuan/LexiconEntry;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/luchime/huiyuan/ReplyResult;->dimension:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/luchime/huiyuan/ReplyResult;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)Lcom/luchime/huiyuan/ReplyResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->kind:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/luchime/huiyuan/LexiconEntry;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->entry:Lcom/luchime/huiyuan/LexiconEntry;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->dimension:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)Lcom/luchime/huiyuan/ReplyResult;
    .locals 7

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dimension"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/luchime/huiyuan/ReplyResult;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/luchime/huiyuan/ReplyResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/luchime/huiyuan/ReplyResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/luchime/huiyuan/ReplyResult;

    iget-object v3, p0, Lcom/luchime/huiyuan/ReplyResult;->kind:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/ReplyResult;->kind:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/luchime/huiyuan/ReplyResult;->text:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/ReplyResult;->text:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/luchime/huiyuan/ReplyResult;->tag:Ljava/lang/String;

    iget-object v4, v1, Lcom/luchime/huiyuan/ReplyResult;->tag:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/luchime/huiyuan/ReplyResult;->entry:Lcom/luchime/huiyuan/LexiconEntry;

    iget-object v4, v1, Lcom/luchime/huiyuan/ReplyResult;->entry:Lcom/luchime/huiyuan/LexiconEntry;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/luchime/huiyuan/ReplyResult;->dimension:Ljava/lang/String;

    iget-object v1, v1, Lcom/luchime/huiyuan/ReplyResult;->dimension:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDimension()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->dimension:Ljava/lang/String;

    return-object v0
.end method

.method public final getEntry()Lcom/luchime/huiyuan/LexiconEntry;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->entry:Lcom/luchime/huiyuan/LexiconEntry;

    return-object v0
.end method

.method public final getKind()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->kind:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->kind:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ReplyResult;->text:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ReplyResult;->tag:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ReplyResult;->entry:Lcom/luchime/huiyuan/LexiconEntry;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/luchime/huiyuan/ReplyResult;->entry:Lcom/luchime/huiyuan/LexiconEntry;

    invoke-virtual {v2}, Lcom/luchime/huiyuan/LexiconEntry;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/luchime/huiyuan/ReplyResult;->dimension:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/luchime/huiyuan/ReplyResult;->kind:Ljava/lang/String;

    iget-object v1, p0, Lcom/luchime/huiyuan/ReplyResult;->text:Ljava/lang/String;

    iget-object v2, p0, Lcom/luchime/huiyuan/ReplyResult;->tag:Ljava/lang/String;

    iget-object v3, p0, Lcom/luchime/huiyuan/ReplyResult;->entry:Lcom/luchime/huiyuan/LexiconEntry;

    iget-object v4, p0, Lcom/luchime/huiyuan/ReplyResult;->dimension:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ReplyResult(kind="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", text="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", entry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dimension="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
