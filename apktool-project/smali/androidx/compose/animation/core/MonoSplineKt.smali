.class public final Landroidx/compose/animation/core/MonoSplineKt;
.super Ljava/lang/Object;
.source "MonoSpline.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0008\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a8\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "MonoSplineIsExtrapolate",
        "",
        "hermiteDifferential",
        "",
        "h",
        "x",
        "y1",
        "y2",
        "t1",
        "t2",
        "hermiteInterpolate",
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


# static fields
.field private static final MonoSplineIsExtrapolate:Z = true


# direct methods
.method public static final hermiteDifferential(FFFFFF)F
    .locals 4
    .param p0, "h"    # F
    .param p1, "x"    # F
    .param p2, "y1"    # F
    .param p3, "y2"    # F
    .param p4, "t1"    # F
    .param p5, "t2"    # F

    .line 300
    mul-float v0, p1, p1

    .line 301
    .local v0, "x2":F
    const/high16 v1, 0x40000000    # 2.0f

    mul-float v2, v1, p1

    mul-float/2addr v1, p4

    add-float/2addr v1, p5

    mul-float/2addr v2, v1

    sub-float v1, p4, v2

    const/high16 v2, 0x40400000    # 3.0f

    add-float v3, p4, p5

    mul-float/2addr v2, v3

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    mul-float/2addr v1, p0

    const/high16 v2, 0x40c00000    # 6.0f

    sub-float v3, p1, v0

    mul-float/2addr v2, v3

    sub-float v3, p2, p3

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    return v1
.end method

.method public static final hermiteInterpolate(FFFFFF)F
    .locals 6
    .param p0, "h"    # F
    .param p1, "x"    # F
    .param p2, "y1"    # F
    .param p3, "y2"    # F
    .param p4, "t1"    # F
    .param p5, "t2"    # F

    .line 269
    mul-float v0, p1, p1

    .line 270
    .local v0, "x2":F
    mul-float v1, v0, p1

    .line 280
    .local v1, "x3":F
    mul-float v2, p0, p4

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v4, v3, v0

    sub-float v4, p1, v4

    add-float/2addr v4, v1

    mul-float/2addr v2, v4

    mul-float v4, p0, p5

    sub-float v5, v1, v0

    mul-float/2addr v4, v5

    add-float/2addr v2, v4

    add-float/2addr v2, p2

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v4, v0

    mul-float/2addr v3, v1

    sub-float/2addr v4, v3

    sub-float v3, p2, p3

    mul-float/2addr v4, v3

    sub-float/2addr v2, v4

    return v2
.end method
