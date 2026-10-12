.class public final Landroidx/compose/runtime/IntStack;
.super Ljava/lang/Object;
.source "Stack.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\t\u0010\u000e\u001a\u00020\u000fH\u0086\u0008J\t\u0010\u0010\u001a\u00020\u000fH\u0086\u0008J\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004J\u0008\u0010\u0018\u001a\u00020\u0008H\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u00088\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/runtime/IntStack;",
        "",
        "()V",
        "size",
        "",
        "getSize",
        "()I",
        "slots",
        "",
        "tos",
        "clear",
        "",
        "indexOf",
        "value",
        "isEmpty",
        "",
        "isNotEmpty",
        "peek",
        "index",
        "peek2",
        "peekOr",
        "default",
        "pop",
        "push",
        "resize",
        "runtime_release"
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
.field public slots:[I

.field public tos:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/IntStack;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/16 v0, 0xa

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    .line 48
    return-void
.end method

.method private final resize()[I
    .locals 2

    .line 56
    iget-object v0, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    iget-object v1, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .local v0, "copy":[I
    iput-object v0, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    .line 58
    return-object v0
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Landroidx/compose/runtime/IntStack;->tos:I

    .line 88
    return-void
.end method

.method public final getSize()I
    .locals 2

    const/4 v0, 0x0

    .line 53
    .local v0, "$i$f$getSize":I
    iget v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    return v1
.end method

.method public final indexOf(I)I
    .locals 4
    .param p1, "value"    # I

    .line 91
    iget-object v0, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    .line 92
    .local v0, "slots":[I
    array-length v1, v0

    iget v2, p0, Landroidx/compose/runtime/IntStack;->tos:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 93
    .local v1, "end":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v1, :cond_1

    .line 94
    aget v3, v0, v2

    if-ne v3, p1, :cond_0

    return v2

    .line 93
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 96
    .end local v2    # "i":I
    :cond_1
    const/4 v2, -0x1

    return v2
.end method

.method public final isEmpty()Z
    .locals 2

    const/4 v0, 0x0

    .line 82
    .local v0, "$i$f$isEmpty":I
    iget v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final isNotEmpty()Z
    .locals 2

    const/4 v0, 0x0

    .line 84
    .local v0, "$i$f$isNotEmpty":I
    iget v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final peek()I
    .locals 2

    .line 76
    iget-object v0, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    iget v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    return v0
.end method

.method public final peek(I)I
    .locals 1
    .param p1, "index"    # I

    .line 80
    iget-object v0, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    aget v0, v0, p1

    return v0
.end method

.method public final peek2()I
    .locals 2

    .line 78
    iget-object v0, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    iget v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    add-int/lit8 v1, v1, -0x2

    aget v0, v0, v1

    return v0
.end method

.method public final peekOr(I)I
    .locals 2
    .param p1, "default"    # I

    .line 72
    iget v0, p0, Landroidx/compose/runtime/IntStack;->tos:I

    add-int/lit8 v0, v0, -0x1

    .line 73
    .local v0, "index":I
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    aget v1, v1, v0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    return v1
.end method

.method public final pop()I
    .locals 2

    .line 69
    iget-object v0, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    iget v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    iget v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    aget v0, v0, v1

    return v0
.end method

.method public final push(I)V
    .locals 3
    .param p1, "value"    # I

    .line 62
    iget-object v0, p0, Landroidx/compose/runtime/IntStack;->slots:[I

    .line 63
    .local v0, "slots":[I
    iget v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    array-length v2, v0

    if-lt v1, v2, :cond_0

    .line 64
    invoke-direct {p0}, Landroidx/compose/runtime/IntStack;->resize()[I

    move-result-object v0

    .line 66
    :cond_0
    iget v1, p0, Landroidx/compose/runtime/IntStack;->tos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/compose/runtime/IntStack;->tos:I

    aput p1, v0, v1

    .line 67
    return-void
.end method
