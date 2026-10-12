.class public final Landroidx/compose/animation/core/ArcSpline_jvmKt;
.super Ljava/lang/Object;
.source "ArcSpline.jvm.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0080\u0008\u001a\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0080\u0008\u00a8\u0006\t"
    }
    d2 = {
        "binarySearch",
        "",
        "array",
        "",
        "position",
        "",
        "toRadians",
        "",
        "value",
        "animation-core_release"
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
.method public static final binarySearch([FF)I
    .locals 7
    .param p0, "array"    # [F
    .param p1, "position"    # F

    const/4 v0, 0x0

    .line 26
    .local v0, "$i$f$binarySearch":I
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move v2, p1

    .end local p0    # "array":[F
    .end local p1    # "position":F
    .local v1, "array":[F
    .local v2, "position":F
    invoke-static/range {v1 .. v6}, Lkotlin/collections/ArraysKt;->binarySearch$default([FFIIILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final toRadians(D)D
    .locals 3
    .param p0, "value"    # D

    const/4 v0, 0x0

    .line 21
    .local v0, "$i$f$toRadians":I
    invoke-static {p0, p1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    return-wide v1
.end method
