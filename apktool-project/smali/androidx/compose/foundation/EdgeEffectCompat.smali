.class public final Landroidx/compose/foundation/EdgeEffectCompat;
.super Ljava/lang/Object;
.source "EdgeEffectCompat.android.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u0012\u0010\u0016\u001a\u00020\u0011*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/foundation/EdgeEffectCompat;",
        "",
        "()V",
        "distanceCompat",
        "",
        "Landroid/widget/EdgeEffect;",
        "getDistanceCompat",
        "(Landroid/widget/EdgeEffect;)F",
        "create",
        "context",
        "Landroid/content/Context;",
        "absorbToRelaxIfNeeded",
        "velocity",
        "edgeEffectLength",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "onAbsorbCompat",
        "",
        "",
        "onPullDistanceCompat",
        "deltaDistance",
        "displacement",
        "onReleaseWithOppositeDelta",
        "delta",
        "foundation_release"
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

.field public static final INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/EdgeEffectCompat;

    invoke-direct {v0}, Landroidx/compose/foundation/EdgeEffectCompat;-><init>()V

    sput-object v0, Landroidx/compose/foundation/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final absorbToRelaxIfNeeded(Landroid/widget/EdgeEffect;FFLandroidx/compose/ui/unit/Density;)F
    .locals 3
    .param p1, "$this$absorbToRelaxIfNeeded"    # Landroid/widget/EdgeEffect;
    .param p2, "velocity"    # F
    .param p3, "edgeEffectLength"    # F
    .param p4, "density"    # Landroidx/compose/ui/unit/Density;

    .line 79
    invoke-static {p4, p2}, Landroidx/compose/foundation/EdgeEffectCompat_androidKt;->access$flingDistance(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    .line 80
    .local v0, "flingDistance":F
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v1

    mul-float/2addr v1, p3

    .line 81
    .local v1, "actualDistance":F
    cmpg-float v2, v0, v1

    if-gtz v2, :cond_0

    .line 82
    invoke-static {p2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-virtual {p0, p1, v2}, Landroidx/compose/foundation/EdgeEffectCompat;->onAbsorbCompat(Landroid/widget/EdgeEffect;I)V

    .line 84
    move v2, p2

    goto :goto_0

    .line 87
    :cond_0
    const/4 v2, 0x0

    .line 81
    :goto_0
    return v2
.end method

.method public final create(Landroid/content/Context;)Landroid/widget/EdgeEffect;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .line 35
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 36
    sget-object v0, Landroidx/compose/foundation/Api31Impl;->INSTANCE:Landroidx/compose/foundation/Api31Impl;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroidx/compose/foundation/Api31Impl;->create(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v0

    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Landroidx/compose/foundation/GlowEdgeEffectCompat;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/GlowEdgeEffectCompat;-><init>(Landroid/content/Context;)V

    check-cast v0, Landroid/widget/EdgeEffect;

    .line 35
    :goto_0
    return-object v0
.end method

.method public final getDistanceCompat(Landroid/widget/EdgeEffect;)F
    .locals 2
    .param p1, "$this$distanceCompat"    # Landroid/widget/EdgeEffect;

    .line 105
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 106
    sget-object v0, Landroidx/compose/foundation/Api31Impl;->INSTANCE:Landroidx/compose/foundation/Api31Impl;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/Api31Impl;->getDistance(Landroid/widget/EdgeEffect;)F

    move-result v0

    goto :goto_0

    .line 107
    :cond_0
    const/4 v0, 0x0

    .line 105
    :goto_0
    return v0
.end method

.method public final onAbsorbCompat(Landroid/widget/EdgeEffect;I)V
    .locals 2
    .param p1, "$this$onAbsorbCompat"    # Landroid/widget/EdgeEffect;
    .param p2, "velocity"    # I

    .line 51
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 52
    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    return-void

    .line 53
    :cond_0
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 58
    :cond_1
    return-void
.end method

.method public final onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F
    .locals 2
    .param p1, "$this$onPullDistanceCompat"    # Landroid/widget/EdgeEffect;
    .param p2, "deltaDistance"    # F
    .param p3, "displacement"    # F

    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 44
    sget-object v0, Landroidx/compose/foundation/Api31Impl;->INSTANCE:Landroidx/compose/foundation/Api31Impl;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/Api31Impl;->onPullDistance(Landroid/widget/EdgeEffect;FF)F

    move-result v0

    return v0

    .line 46
    :cond_0
    invoke-virtual {p1, p2, p3}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 47
    return p2
.end method

.method public final onReleaseWithOppositeDelta(Landroid/widget/EdgeEffect;F)V
    .locals 1
    .param p1, "$this$onReleaseWithOppositeDelta"    # Landroid/widget/EdgeEffect;
    .param p2, "delta"    # F

    .line 96
    instance-of v0, p1, Landroidx/compose/foundation/GlowEdgeEffectCompat;

    if-eqz v0, :cond_0

    .line 97
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/GlowEdgeEffectCompat;

    invoke-virtual {v0, p2}, Landroidx/compose/foundation/GlowEdgeEffectCompat;->releaseWithOppositeDelta(F)V

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 101
    :goto_0
    return-void
.end method
