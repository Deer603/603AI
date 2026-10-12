.class public final Landroidx/compose/foundation/EdgeEffectCompat_androidKt;
.super Ljava/lang/Object;
.source "EdgeEffectCompat.android.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0018\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "DecelMinusOne",
        "",
        "DecelerationRate",
        "GravityEarth",
        "",
        "InchesPerMeter",
        "Inflection",
        "PlatformFlingScrollFriction",
        "flingDistance",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "velocity",
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


# static fields
.field private static final DecelMinusOne:D

.field private static final DecelerationRate:D

.field private static final GravityEarth:F = 9.80665f

.field private static final InchesPerMeter:F = 39.37f

.field private static final Inflection:F = 0.35f

.field private static final PlatformFlingScrollFriction:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 186
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v0

    sput v0, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->PlatformFlingScrollFriction:F

    .line 189
    const-wide v0, 0x3fe8f5c28f5c28f6L    # 0.78

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    sput-wide v0, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->DecelerationRate:D

    .line 190
    sget-wide v0, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->DecelerationRate:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    sput-wide v0, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->DecelMinusOne:D

    return-void
.end method

.method public static final synthetic access$flingDistance(Landroidx/compose/ui/unit/Density;F)F
    .locals 1
    .param p0, "density"    # Landroidx/compose/ui/unit/Density;
    .param p1, "velocity"    # F

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->flingDistance(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    return v0
.end method

.method private static final flingDistance(Landroidx/compose/ui/unit/Density;F)F
    .locals 10
    .param p0, "density"    # Landroidx/compose/ui/unit/Density;
    .param p1, "velocity"    # F

    .line 199
    const v0, 0x43c10b3d

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v1

    mul-float/2addr v1, v0

    const/high16 v0, 0x43200000    # 160.0f

    mul-float/2addr v1, v0

    const v0, 0x3f570a3d    # 0.84f

    mul-float/2addr v1, v0

    float-to-double v0, v1

    .line 198
    nop

    .line 201
    .local v0, "magicPhysicalCoefficient":D
    const v2, 0x3eb33333    # 0.35f

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    mul-float/2addr v3, v2

    float-to-double v2, v3

    sget v4, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->PlatformFlingScrollFriction:F

    float-to-double v4, v4

    mul-double/2addr v4, v0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    .line 200
    nop

    .line 203
    .local v2, "l":D
    sget v4, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->PlatformFlingScrollFriction:F

    float-to-double v4, v4

    .line 204
    nop

    .line 203
    mul-double/2addr v4, v0

    .line 205
    sget-wide v6, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->DecelerationRate:D

    sget-wide v8, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->DecelMinusOne:D

    div-double/2addr v6, v8

    mul-double/2addr v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->exp(D)D

    move-result-wide v6

    .line 203
    mul-double/2addr v4, v6

    .line 202
    nop

    .line 206
    .local v4, "distance":D
    double-to-float v6, v4

    return v6
.end method
