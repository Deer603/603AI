.class public final Landroidx/compose/animation/core/SpringSimulation;
.super Ljava/lang/Object;
.source "SpringSimulation.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n+ 2 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,152:1\n38#2:153\n53#3,3:154\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n*L\n149#1:153\n149#1:154,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003J-\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0008\"\u0004\u0008\u000b\u0010\u0004R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000f\u0010\u0008\"\u0004\u0008\u0010\u0010\u0004\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/animation/core/SpringSimulation;",
        "",
        "finalPosition",
        "",
        "(F)V",
        "value",
        "dampingRatio",
        "getDampingRatio",
        "()F",
        "setDampingRatio",
        "getFinalPosition",
        "setFinalPosition",
        "naturalFreq",
        "",
        "stiffness",
        "getStiffness",
        "setStiffness",
        "getAcceleration",
        "lastDisplacement",
        "lastVelocity",
        "updateValues",
        "Landroidx/compose/animation/core/Motion;",
        "timeElapsed",
        "",
        "updateValues-IJZedt4$animation_core_release",
        "(FFJ)J",
        "animation-core_release"
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
.field private dampingRatio:F

.field private finalPosition:F

.field private naturalFreq:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/animation/core/SpringSimulation;->$stable:I

    return-void
.end method

.method public constructor <init>(F)V
    .locals 2
    .param p1, "finalPosition"    # F

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    .line 57
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 76
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 55
    return-void
.end method


# virtual methods
.method public final getAcceleration(FF)F
    .locals 9
    .param p1, "lastDisplacement"    # F
    .param p2, "lastVelocity"    # F

    .line 86
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    sub-float v0, p1, v0

    .line 88
    .local v0, "adjustedDisplacement":F
    iget-wide v1, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    iget-wide v3, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double/2addr v1, v3

    .line 89
    .local v1, "k":D
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    iget-wide v5, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double/2addr v5, v3

    iget v3, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    float-to-double v3, v3

    mul-double/2addr v5, v3

    .line 91
    .local v5, "c":D
    neg-double v3, v1

    float-to-double v7, v0

    mul-double/2addr v3, v7

    float-to-double v7, p2

    mul-double/2addr v7, v5

    sub-double/2addr v3, v7

    double-to-float v3, v3

    return v3
.end method

.method public final getDampingRatio()F
    .locals 1

    .line 76
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    return v0
.end method

.method public final getFinalPosition()F
    .locals 1

    .line 55
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    return v0
.end method

.method public final getStiffness()F
    .locals 4

    .line 68
    iget-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    iget-wide v2, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method public final setDampingRatio(F)V
    .locals 1
    .param p1, "value"    # F

    .line 78
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 79
    const-string v0, "Damping ratio must be non-negative"

    invoke-static {v0}, Landroidx/compose/animation/core/PreconditionsKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 81
    :cond_0
    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 82
    return-void
.end method

.method public final setFinalPosition(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 55
    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    return-void
.end method

.method public final setStiffness(F)V
    .locals 2
    .param p1, "value"    # F

    .line 62
    invoke-virtual {p0}, Landroidx/compose/animation/core/SpringSimulation;->getStiffness()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 63
    const-string v0, "Spring stiffness constant must be positive."

    invoke-static {v0}, Landroidx/compose/animation/core/PreconditionsKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 65
    :cond_0
    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 66
    return-void
.end method

.method public final updateValues-IJZedt4$animation_core_release(FFJ)J
    .locals 29
    .param p1, "lastDisplacement"    # F
    .param p2, "lastVelocity"    # F
    .param p3, "timeElapsed"    # J

    .line 103
    move-object/from16 v0, p0

    move/from16 v1, p2

    iget v2, v0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    sub-float v2, p1, v2

    .line 104
    .local v2, "adjustedDisplacement":F
    move-wide/from16 v3, p3

    long-to-double v5, v3

    const-wide v7, 0x408f400000000000L    # 1000.0

    div-double/2addr v5, v7

    .line 105
    .local v5, "deltaT":D
    iget v7, v0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    float-to-double v7, v7

    iget v9, v0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    float-to-double v9, v9

    mul-double/2addr v7, v9

    .line 106
    .local v7, "dampingRatioSquared":D
    iget v9, v0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    neg-float v9, v9

    float-to-double v9, v9

    iget-wide v11, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double/2addr v9, v11

    .line 108
    .local v9, "r":D
    const-wide/16 v11, 0x0

    .line 109
    .local v11, "displacement":D
    const-wide/16 v13, 0x0

    .line 111
    .local v13, "currentVelocity":D
    iget v15, v0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    const/high16 v16, 0x3f800000    # 1.0f

    cmpl-float v15, v15, v16

    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    if-lez v15, :cond_0

    .line 113
    iget-wide v3, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    sub-double v15, v7, v17

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v15

    mul-double/2addr v3, v15

    .line 114
    .local v3, "s":D
    add-double v15, v9, v3

    .line 115
    .local v15, "gammaPlus":D
    sub-double v17, v9, v3

    .line 119
    .local v17, "gammaMinus":D
    move-wide/from16 v19, v3

    .end local v3    # "s":D
    .local v19, "s":D
    float-to-double v3, v2

    mul-double v3, v3, v17

    move-wide/from16 v21, v3

    float-to-double v3, v1

    sub-double v3, v21, v3

    sub-double v21, v17, v15

    div-double v3, v3, v21

    .line 118
    nop

    .line 120
    .local v3, "coeffB":D
    move-wide/from16 v21, v3

    .end local v3    # "coeffB":D
    .local v21, "coeffB":D
    float-to-double v3, v2

    sub-double v3, v3, v21

    .line 121
    .local v3, "coeffA":D
    mul-double v23, v17, v5

    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->exp(D)D

    move-result-wide v23

    mul-double v23, v23, v3

    mul-double v25, v15, v5

    invoke-static/range {v25 .. v26}, Ljava/lang/Math;->exp(D)D

    move-result-wide v25

    mul-double v25, v25, v21

    add-double v23, v23, v25

    .line 123
    .end local v11    # "displacement":D
    .local v23, "displacement":D
    mul-double v11, v3, v17

    mul-double v25, v17, v5

    invoke-static/range {v25 .. v26}, Ljava/lang/Math;->exp(D)D

    move-result-wide v25

    mul-double v11, v11, v25

    .line 124
    mul-double v25, v21, v15

    mul-double v27, v15, v5

    invoke-static/range {v27 .. v28}, Ljava/lang/Math;->exp(D)D

    move-result-wide v27

    mul-double v25, v25, v27

    .line 123
    add-double v11, v11, v25

    .line 122
    move/from16 v16, v2

    move-wide/from16 v19, v5

    .end local v3    # "coeffA":D
    .end local v13    # "currentVelocity":D
    .end local v15    # "gammaPlus":D
    .end local v17    # "gammaMinus":D
    .end local v19    # "s":D
    .end local v21    # "coeffB":D
    .local v11, "currentVelocity":D
    goto/16 :goto_1

    .line 125
    .end local v23    # "displacement":D
    .local v11, "displacement":D
    .restart local v13    # "currentVelocity":D
    :cond_0
    iget v3, v0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    cmpg-float v3, v3, v16

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 134
    :goto_0
    move v15, v3

    iget-wide v3, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 125
    if-eqz v15, :cond_2

    .line 127
    move v15, v2

    .line 128
    .local v15, "coeffA":F
    move-wide/from16 v19, v3

    float-to-double v3, v1

    move-wide/from16 v16, v3

    float-to-double v3, v2

    mul-double v3, v3, v19

    add-double v3, v16, v3

    .line 129
    .local v3, "coeffB":D
    move-wide/from16 v16, v3

    .end local v3    # "coeffB":D
    .local v16, "coeffB":D
    iget-wide v3, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    neg-double v3, v3

    mul-double/2addr v3, v5

    .line 130
    .local v3, "nFdT":D
    move-wide/from16 v18, v3

    .end local v3    # "nFdT":D
    .local v18, "nFdT":D
    float-to-double v3, v15

    mul-double v20, v16, v5

    add-double v3, v3, v20

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->exp(D)D

    move-result-wide v20

    mul-double v23, v3, v20

    .line 132
    .end local v11    # "displacement":D
    .restart local v23    # "displacement":D
    float-to-double v3, v15

    mul-double v11, v16, v5

    add-double/2addr v3, v11

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->exp(D)D

    move-result-wide v11

    mul-double/2addr v3, v11

    iget-wide v11, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    neg-double v11, v11

    mul-double/2addr v3, v11

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->exp(D)D

    move-result-wide v11

    mul-double v11, v11, v16

    add-double/2addr v3, v11

    .line 131
    move-wide v11, v3

    move/from16 v16, v2

    move-wide/from16 v19, v5

    .end local v13    # "currentVelocity":D
    .end local v15    # "coeffA":F
    .end local v16    # "coeffB":D
    .end local v18    # "nFdT":D
    .local v11, "currentVelocity":D
    goto :goto_1

    .line 134
    .end local v23    # "displacement":D
    .local v11, "displacement":D
    .restart local v13    # "currentVelocity":D
    :cond_2
    move-wide/from16 v19, v3

    sub-double v3, v17, v7

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    mul-double v3, v3, v19

    .line 136
    .local v3, "dampedFreq":D
    move v15, v2

    .line 137
    .local v15, "cosCoeff":F
    div-double v17, v17, v3

    move-wide/from16 v19, v5

    .end local v5    # "deltaT":D
    .local v19, "deltaT":D
    neg-double v5, v9

    move-wide/from16 v21, v5

    float-to-double v5, v2

    mul-double v5, v5, v21

    move-wide/from16 v21, v5

    float-to-double v5, v1

    add-double v5, v21, v5

    mul-double v17, v17, v5

    .line 138
    .local v17, "sinCoeff":D
    mul-double v5, v3, v19

    .line 139
    .local v5, "dFdT":D
    mul-double v21, v9, v19

    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->exp(D)D

    move-result-wide v21

    move/from16 v16, v2

    .end local v2    # "adjustedDisplacement":F
    .local v16, "adjustedDisplacement":F
    float-to-double v1, v15

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v23

    mul-double v1, v1, v23

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v23

    mul-double v23, v23, v17

    add-double v1, v1, v23

    mul-double v23, v21, v1

    .line 141
    .end local v11    # "displacement":D
    .restart local v23    # "displacement":D
    mul-double v1, v23, v9

    .line 142
    mul-double v11, v9, v19

    invoke-static {v11, v12}, Ljava/lang/Math;->exp(D)D

    move-result-wide v11

    .line 143
    move-wide/from16 v21, v1

    neg-double v1, v3

    move-wide/from16 v25, v1

    float-to-double v1, v15

    mul-double v1, v1, v25

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v25

    mul-double v1, v1, v25

    mul-double v25, v3, v17

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v27

    mul-double v25, v25, v27

    add-double v1, v1, v25

    .line 142
    mul-double/2addr v11, v1

    .line 141
    add-double v1, v21, v11

    .line 140
    move-wide v11, v1

    .line 146
    .end local v3    # "dampedFreq":D
    .end local v5    # "dFdT":D
    .end local v13    # "currentVelocity":D
    .end local v15    # "cosCoeff":F
    .end local v17    # "sinCoeff":D
    .local v11, "currentVelocity":D
    :goto_1
    iget v1, v0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    float-to-double v1, v1

    add-double v1, v23, v1

    double-to-float v1, v1

    .line 147
    .local v1, "newValue":F
    double-to-float v2, v11

    .line 149
    .local v2, "newVelocity":F
    const/4 v3, 0x0

    .line 153
    .local v3, "$i$f$Motion":I
    const/4 v4, 0x0

    .line 154
    .local v4, "$i$f$packFloats":I
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    .line 155
    .local v5, "v1$iv$iv":J
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v13

    int-to-long v13, v13

    .line 156
    .local v13, "v2$iv$iv":J
    const/16 v15, 0x20

    shl-long v17, v5, v15

    const-wide v21, 0xffffffffL

    and-long v21, v13, v21

    or-long v4, v17, v21

    .line 153
    .end local v4    # "$i$f$packFloats":I
    .end local v5    # "v1$iv$iv":J
    .end local v13    # "v2$iv$iv":J
    invoke-static {v4, v5}, Landroidx/compose/animation/core/Motion;->constructor-impl(J)J

    move-result-wide v3

    .line 149
    .end local v3    # "$i$f$Motion":I
    return-wide v3
.end method
