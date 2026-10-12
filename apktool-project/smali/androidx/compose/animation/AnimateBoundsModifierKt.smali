.class public final Landroidx/compose/animation/AnimateBoundsModifierKt;
.super Ljava/lang/Object;
.source "AnimateBoundsModifier.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u001a2\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u000c"
    }
    d2 = {
        "DefaultBoundsTransform",
        "Landroidx/compose/animation/BoundsTransform;",
        "getDefaultBoundsTransform$annotations",
        "()V",
        "animateBounds",
        "Landroidx/compose/ui/Modifier;",
        "lookaheadScope",
        "Landroidx/compose/ui/layout/LookaheadScope;",
        "modifier",
        "boundsTransform",
        "animateMotionFrameOfReference",
        "",
        "animation_release"
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
.field private static final DefaultBoundsTransform:Landroidx/compose/animation/BoundsTransform;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 437
    new-instance v0, Landroidx/compose/animation/AnimateBoundsModifierKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Landroidx/compose/animation/AnimateBoundsModifierKt$$ExternalSyntheticLambda0;-><init>()V

    sput-object v0, Landroidx/compose/animation/AnimateBoundsModifierKt;->DefaultBoundsTransform:Landroidx/compose/animation/BoundsTransform;

    return-void
.end method

.method static final DefaultBoundsTransform$lambda$0(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1

    .line 439
    nop

    .line 440
    nop

    .line 441
    sget-object p0, Landroidx/compose/ui/geometry/Rect;->Companion:Landroidx/compose/ui/geometry/Rect$Companion;

    invoke-static {p0}, Landroidx/compose/animation/core/VisibilityThresholdsKt;->getVisibilityThreshold(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;

    move-result-object p0

    .line 438
    const/high16 p1, 0x3f800000    # 1.0f

    const/high16 v0, 0x43c80000    # 400.0f

    invoke-static {p1, v0, p0}, Landroidx/compose/animation/core/AnimationSpecKt;->spring(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 442
    return-object p0
.end method

.method public static final animateBounds(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/BoundsTransform;Z)Landroidx/compose/ui/Modifier;
    .locals 3
    .param p0, "$this$animateBounds"    # Landroidx/compose/ui/Modifier;
    .param p1, "lookaheadScope"    # Landroidx/compose/ui/layout/LookaheadScope;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "boundsTransform"    # Landroidx/compose/animation/BoundsTransform;
    .param p4, "animateMotionFrameOfReference"    # Z

    .line 125
    nop

    .line 126
    new-instance v0, Landroidx/compose/animation/BoundsAnimationElement;

    .line 127
    nop

    .line 128
    nop

    .line 125
    sget-object v1, Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$1;->INSTANCE:Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$1;

    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 132
    nop

    .line 126
    invoke-direct {v0, p1, p3, v1, p4}, Landroidx/compose/animation/BoundsAnimationElement;-><init>(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/animation/BoundsTransform;Lkotlin/jvm/functions/Function2;Z)V

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 125
    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 135
    invoke-interface {v0, p2}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 137
    new-instance v1, Landroidx/compose/animation/BoundsAnimationElement;

    .line 138
    nop

    .line 139
    nop

    .line 136
    sget-object v2, Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2;->INSTANCE:Landroidx/compose/animation/AnimateBoundsModifierKt$animateBounds$2;

    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 144
    nop

    .line 137
    invoke-direct {v1, p1, p3, v2, p4}, Landroidx/compose/animation/BoundsAnimationElement;-><init>(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/animation/BoundsTransform;Lkotlin/jvm/functions/Function2;Z)V

    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 136
    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 146
    return-object v0
.end method

.method public static synthetic animateBounds$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/BoundsTransform;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 119
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 121
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p2, Landroidx/compose/ui/Modifier;

    .line 119
    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 122
    sget-object p3, Landroidx/compose/animation/AnimateBoundsModifierKt;->DefaultBoundsTransform:Landroidx/compose/animation/BoundsTransform;

    .line 119
    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 123
    const/4 p4, 0x0

    .line 119
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/animation/AnimateBoundsModifierKt;->animateBounds(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/BoundsTransform;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic getDefaultBoundsTransform$annotations()V
    .locals 0

    return-void
.end method
