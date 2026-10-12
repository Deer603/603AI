.class public final Landroidx/compose/foundation/lazy/grid/LazyGridSpanKt;
.super Ljava/lang/Object;
.source "LazyGridSpan.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyGridSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpan.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,66:1\n96#2,5:67\n*S KotlinDebug\n*F\n+ 1 LazyGridSpan.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanKt\n*L\n40#1:67,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "GridItemSpan",
        "Landroidx/compose/foundation/lazy/grid/GridItemSpan;",
        "currentLineSpan",
        "",
        "(I)J",
        "foundation_release"
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
.method public static final GridItemSpan(I)J
    .locals 3
    .param p0, "currentLineSpan"    # I

    .line 40
    if-lez p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 67
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 68
    if-nez v0, :cond_1

    .line 69
    const/4 v2, 0x0

    .line 40
    .local v2, "$i$a$-requirePrecondition-LazyGridSpanKt$GridItemSpan$1":I
    nop

    .line 69
    .end local v2    # "$i$a$-requirePrecondition-LazyGridSpanKt$GridItemSpan$1":I
    const-string v2, "The span value should be higher than 0"

    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 71
    :cond_1
    nop

    .line 41
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    int-to-long v0, p0

    invoke-static {v0, v1}, Landroidx/compose/foundation/lazy/grid/GridItemSpan;->constructor-impl(J)J

    move-result-wide v0

    return-wide v0
.end method
