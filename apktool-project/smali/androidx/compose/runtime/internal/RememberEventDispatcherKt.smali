.class public final Landroidx/compose/runtime/internal/RememberEventDispatcherKt;
.super Ljava/lang/Object;
.source "RememberEventDispatcher.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a(\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0006*\u0008\u0012\u0004\u0012\u0002H\u00060\u00072\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "swap",
        "",
        "Landroidx/collection/MutableIntList;",
        "a",
        "",
        "b",
        "T",
        "",
        "runtime_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$swap(Landroidx/collection/MutableIntList;II)V
    .locals 0
    .param p0, "$receiver"    # Landroidx/collection/MutableIntList;
    .param p1, "a"    # I
    .param p2, "b"    # I

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/internal/RememberEventDispatcherKt;->swap(Landroidx/collection/MutableIntList;II)V

    return-void
.end method

.method public static final synthetic access$swap(Ljava/util/List;II)V
    .locals 0
    .param p0, "$receiver"    # Ljava/util/List;
    .param p1, "a"    # I
    .param p2, "b"    # I

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/internal/RememberEventDispatcherKt;->swap(Ljava/util/List;II)V

    return-void
.end method

.method private static final swap(Landroidx/collection/MutableIntList;II)V
    .locals 2
    .param p0, "$this$swap"    # Landroidx/collection/MutableIntList;
    .param p1, "a"    # I
    .param p2, "b"    # I

    .line 305
    invoke-virtual {p0, p1}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v0

    .line 306
    .local v0, "item":I
    invoke-virtual {p0, p2}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v1

    invoke-virtual {p0, p1, v1}, Landroidx/collection/MutableIntList;->set(II)I

    .line 307
    invoke-virtual {p0, p2, v0}, Landroidx/collection/MutableIntList;->set(II)I

    .line 308
    return-void
.end method

.method private static final swap(Ljava/util/List;II)V
    .locals 2
    .param p0, "$this$swap"    # Ljava/util/List;
    .param p1, "a"    # I
    .param p2, "b"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;II)V"
        }
    .end annotation

    .line 299
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 300
    .local v0, "item":Ljava/lang/Object;
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 301
    invoke-interface {p0, p2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 302
    return-void
.end method
