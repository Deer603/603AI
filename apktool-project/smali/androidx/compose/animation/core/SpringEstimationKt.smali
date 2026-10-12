.class public final Landroidx/compose/animation/core/SpringEstimationKt;
.super Ljava/lang/Object;
.source "SpringEstimation.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,348:1\n347#1:349\n347#1:351\n344#1:353\n347#1:354\n347#1:356\n344#1:358\n150#2:350\n150#2:352\n150#2:355\n150#2:357\n150#2:359\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n172#1:349\n173#1:351\n213#1:353\n247#1:354\n248#1:356\n294#1:358\n172#1:350\n173#1:352\n247#1:355\n248#1:357\n347#1:359\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0007\u001a8\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0007\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u000c2\u0006\u0010\u0006\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u000cH\u0007\u001a(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0002\u001a@\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0002\u001a0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0002\u001a0\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0002\u001a9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aH\u0082\u0008\u001a\r\u0010\u001c\u001a\u00020\u001d*\u00020\u0004H\u0082\u0008\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "MAX_LONG_MILLIS",
        "",
        "estimateAnimationDurationMillis",
        "stiffness",
        "",
        "dampingRatio",
        "initialVelocity",
        "initialDisplacement",
        "delta",
        "springConstant",
        "dampingCoefficient",
        "mass",
        "",
        "estimateCriticallyDamped",
        "firstRootReal",
        "p0",
        "v0",
        "estimateDurationInternal",
        "firstRootImaginary",
        "secondRootReal",
        "initialPosition",
        "estimateOverDamped",
        "estimateUnderDamped",
        "iterateNewtonsMethod",
        "x",
        "fn",
        "Lkotlin/Function1;",
        "fnPrime",
        "isNotFinite",
        "",
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
.field private static final MAX_LONG_MILLIS:J = 0x8637bd05af6L


# direct methods
.method public static final estimateAnimationDurationMillis(DDDDD)J
    .locals 26
    .param p0, "stiffness"    # D
    .param p2, "dampingRatio"    # D
    .param p4, "initialVelocity"    # D
    .param p6, "initialDisplacement"    # D
    .param p8, "delta"    # D

    .line 66
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double v0, v0, p2

    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    .line 70
    .local v0, "dampingCoefficient":D
    mul-double v2, v0, v0

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    mul-double v4, v4, p0

    sub-double/2addr v2, v4

    .line 71
    .local v2, "partialRoot":D
    const-wide/16 v4, 0x0

    cmpg-double v6, v2, v4

    if-gez v6, :cond_0

    move-wide v6, v4

    goto :goto_0

    :cond_0
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    .line 72
    .local v6, "partialRootReal":D
    :goto_0
    cmpg-double v8, v2, v4

    if-gez v8, :cond_1

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    .line 74
    .local v4, "partialRootImaginary":D
    :cond_1
    neg-double v8, v0

    add-double/2addr v8, v6

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    mul-double v12, v8, v10

    .line 75
    .local v12, "firstRootReal":D
    mul-double v14, v4, v10

    .line 76
    .local v14, "firstRootImaginary":D
    neg-double v8, v0

    sub-double/2addr v8, v6

    mul-double v16, v8, v10

    .line 79
    .local v16, "secondRootReal":D
    nop

    .line 80
    nop

    .line 81
    nop

    .line 82
    nop

    .line 83
    nop

    .line 84
    nop

    .line 85
    nop

    .line 78
    move-wide/from16 v18, p2

    move-wide/from16 v20, p4

    move-wide/from16 v22, p6

    move-wide/from16 v24, p8

    invoke-static/range {v12 .. v25}, Landroidx/compose/animation/core/SpringEstimationKt;->estimateDurationInternal(DDDDDDD)J

    move-result-wide v8

    return-wide v8
.end method

.method public static final estimateAnimationDurationMillis(DDDDDD)J
    .locals 28
    .param p0, "springConstant"    # D
    .param p2, "dampingCoefficient"    # D
    .param p4, "mass"    # D
    .param p6, "initialVelocity"    # D
    .param p8, "initialDisplacement"    # D
    .param p10, "delta"    # D

    .line 99
    move-wide/from16 v0, p2

    mul-double v2, p0, p4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v2, v4

    .line 100
    .local v2, "criticalDamping":D
    div-double v12, v0, v2

    .line 103
    .local v12, "dampingRatio":D
    mul-double v6, v0, v0

    const-wide/high16 v8, 0x4010000000000000L    # 4.0

    mul-double v8, v8, p4

    mul-double v8, v8, p0

    sub-double v20, v6, v8

    .line 104
    .local v20, "partialRoot":D
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    mul-double v4, v4, p4

    div-double v4, v6, v4

    .line 105
    .local v4, "divisor":D
    const-wide/16 v6, 0x0

    cmpg-double v8, v20, v6

    if-gez v8, :cond_0

    move-wide v8, v6

    goto :goto_0

    :cond_0
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    :goto_0
    move-wide/from16 v22, v8

    .line 106
    .local v22, "partialRootReal":D
    cmpg-double v8, v20, v6

    if-gez v8, :cond_1

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    :cond_1
    move-wide/from16 v24, v6

    .line 108
    .local v24, "partialRootImaginary":D
    neg-double v6, v0

    add-double v6, v6, v22

    mul-double/2addr v6, v4

    .line 109
    .local v6, "firstRootReal":D
    mul-double v8, v24, v4

    .line 110
    .local v8, "firstRootImaginary":D
    neg-double v10, v0

    sub-double v10, v10, v22

    mul-double/2addr v10, v4

    .line 113
    .local v10, "secondRootReal":D
    nop

    .line 114
    nop

    .line 115
    nop

    .line 116
    nop

    .line 117
    nop

    .line 118
    nop

    .line 119
    nop

    .line 112
    move-wide/from16 v14, p6

    move-wide/from16 v16, p8

    move-wide/from16 v18, p10

    invoke-static/range {v6 .. v19}, Landroidx/compose/animation/core/SpringEstimationKt;->estimateDurationInternal(DDDDDDD)J

    move-result-wide v26

    return-wide v26
.end method

.method public static final estimateAnimationDurationMillis(FFFFF)J
    .locals 13
    .param p0, "stiffness"    # F
    .param p1, "dampingRatio"    # F
    .param p2, "initialVelocity"    # F
    .param p3, "initialDisplacement"    # F
    .param p4, "delta"    # F

    .line 43
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 45
    const-wide v0, 0x8637bd05af6L

    return-wide v0

    .line 49
    :cond_1
    float-to-double v2, p0

    .line 50
    float-to-double v4, p1

    .line 51
    move v0, p2

    float-to-double v6, v0

    .line 52
    move/from16 v1, p3

    float-to-double v8, v1

    .line 53
    move/from16 v12, p4

    float-to-double v10, v12

    .line 48
    invoke-static/range {v2 .. v11}, Landroidx/compose/animation/core/SpringEstimationKt;->estimateAnimationDurationMillis(DDDDD)J

    move-result-wide v2

    return-wide v2
.end method

.method private static final estimateCriticallyDamped(DDDD)D
    .locals 35
    .param p0, "firstRootReal"    # D
    .param p2, "p0"    # D
    .param p4, "v0"    # D
    .param p6, "delta"    # D

    .line 153
    move-wide/from16 v0, p6

    move-wide/from16 v2, p0

    .line 154
    .local v2, "r":D
    move-wide/from16 v4, p2

    .line 155
    .local v4, "c1":D
    mul-double v6, v2, v4

    sub-double v6, p4, v6

    .line 159
    .local v6, "c2":D
    div-double v8, v0, v4

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    div-double/2addr v8, v2

    .line 161
    .local v8, "t1":D
    const/4 v10, 0x0

    .line 163
    .local v10, "$i$a$-run-SpringEstimationKt$estimateCriticallyDamped$t2$1":I
    div-double v11, v0, v6

    invoke-static {v11, v12}, Ljava/lang/Math;->abs(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v11

    .line 164
    .local v11, "guess":D
    move-wide v13, v11

    .line 165
    .local v13, "t":D
    const/4 v15, 0x0

    .local v15, "i":I
    :goto_0
    move-wide/from16 v16, v2

    .end local v2    # "r":D
    .local v16, "r":D
    const/4 v2, 0x6

    if-ge v15, v2, :cond_0

    .line 166
    div-double v2, v13, v16

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    sub-double v13, v11, v2

    .line 165
    add-int/lit8 v15, v15, 0x1

    move-wide/from16 v2, v16

    goto :goto_0

    .line 168
    .end local v15    # "i":I
    :cond_0
    nop

    .line 161
    .end local v10    # "$i$a$-run-SpringEstimationKt$estimateCriticallyDamped$t2$1":I
    .end local v11    # "guess":D
    .end local v13    # "t":D
    nop

    .line 169
    nop

    .line 161
    div-double v13, v13, v16

    .line 160
    nop

    .line 171
    .local v13, "t2":D
    nop

    .line 172
    move-wide v2, v8

    .local v2, "$this$isNotFinite$iv":D
    const/4 v10, 0x0

    .line 349
    .local v10, "$i$f$isNotFinite":I
    move-wide v11, v2

    .local v11, "$this$fastIsFinite$iv$iv":D
    const/4 v15, 0x0

    .line 350
    .local v15, "$i$f$fastIsFinite":I
    invoke-static {v11, v12}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v18

    const-wide v20, 0x7fffffffffffffffL

    and-long v18, v18, v20

    const-wide/high16 v22, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    cmp-long v18, v18, v22

    const/16 v19, 0x0

    const/16 v24, 0x1

    if-gez v18, :cond_1

    move/from16 v11, v24

    goto :goto_1

    :cond_1
    move/from16 v11, v19

    .line 349
    .end local v11    # "$this$fastIsFinite$iv$iv":D
    .end local v15    # "$i$f$fastIsFinite":I
    :goto_1
    nop

    .line 172
    .end local v2    # "$this$isNotFinite$iv":D
    .end local v10    # "$i$f$isNotFinite":I
    if-nez v11, :cond_2

    move-wide v2, v13

    goto :goto_2

    .line 173
    :cond_2
    move-wide v2, v13

    .restart local v2    # "$this$isNotFinite$iv":D
    const/4 v10, 0x0

    .line 351
    .restart local v10    # "$i$f$isNotFinite":I
    move-wide v11, v2

    .restart local v11    # "$this$fastIsFinite$iv$iv":D
    const/4 v15, 0x0

    .line 352
    .restart local v15    # "$i$f$fastIsFinite":I
    invoke-static {v11, v12}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v25

    and-long v20, v25, v20

    cmp-long v18, v20, v22

    if-gez v18, :cond_3

    move/from16 v19, v24

    .line 351
    .end local v11    # "$this$fastIsFinite$iv$iv":D
    .end local v15    # "$i$f$fastIsFinite":I
    :cond_3
    nop

    .line 173
    .end local v2    # "$this$isNotFinite$iv":D
    .end local v10    # "$i$f$isNotFinite":I
    if-nez v19, :cond_4

    move-wide v2, v8

    goto :goto_2

    .line 174
    :cond_4
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    .line 171
    :goto_2
    nop

    .line 170
    nop

    .line 178
    .local v2, "tCurr":D
    mul-double v10, v16, v4

    add-double/2addr v10, v6

    neg-double v10, v10

    mul-double v18, v16, v6

    div-double v10, v10, v18

    .line 179
    .local v10, "tInflection":D
    mul-double v18, v16, v10

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->exp(D)D

    move-result-wide v18

    mul-double v18, v18, v4

    mul-double v20, v6, v10

    mul-double v22, v16, v10

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->exp(D)D

    move-result-wide v22

    mul-double v20, v20, v22

    move-wide/from16 v22, v2

    .end local v2    # "tCurr":D
    .local v22, "tCurr":D
    add-double v2, v18, v20

    .line 184
    .local v2, "xInflection":D
    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    move-result v12

    if-nez v12, :cond_9

    const-wide/16 v18, 0x0

    cmpg-double v12, v10, v18

    if-gtz v12, :cond_5

    move-wide/from16 v18, v2

    move-wide/from16 v20, v4

    goto :goto_5

    .line 186
    :cond_5
    cmpl-double v12, v10, v18

    if-lez v12, :cond_8

    move-wide/from16 v20, v4

    .end local v4    # "c1":D
    .local v20, "c1":D
    neg-double v4, v2

    cmpg-double v4, v4, v0

    if-gez v4, :cond_7

    .line 189
    cmpg-double v4, v6, v18

    if-gez v4, :cond_6

    cmpl-double v4, v20, v18

    if-lez v4, :cond_6

    .line 190
    const-wide/16 v4, 0x0

    .end local v22    # "tCurr":D
    .local v4, "tCurr":D
    goto :goto_3

    .line 192
    .end local v4    # "tCurr":D
    .restart local v22    # "tCurr":D
    :cond_6
    move-wide/from16 v4, v22

    .end local v22    # "tCurr":D
    .restart local v4    # "tCurr":D
    :goto_3
    move-wide/from16 v18, v2

    .end local v2    # "xInflection":D
    .local v18, "xInflection":D
    neg-double v2, v0

    goto :goto_6

    .line 186
    .end local v4    # "tCurr":D
    .end local v18    # "xInflection":D
    .restart local v2    # "xInflection":D
    .restart local v22    # "tCurr":D
    :cond_7
    move-wide/from16 v18, v2

    .end local v2    # "xInflection":D
    .restart local v18    # "xInflection":D
    goto :goto_4

    .end local v18    # "xInflection":D
    .end local v20    # "c1":D
    .restart local v2    # "xInflection":D
    .local v4, "c1":D
    :cond_8
    move-wide/from16 v18, v2

    move-wide/from16 v20, v4

    .line 202
    .end local v2    # "xInflection":D
    .end local v4    # "c1":D
    .restart local v18    # "xInflection":D
    .restart local v20    # "c1":D
    :goto_4
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double v2, v2, v16

    neg-double v2, v2

    div-double v4, v20, v6

    sub-double/2addr v2, v4

    .line 203
    .local v2, "tConcavChange":D
    move-wide v4, v2

    .line 204
    .end local v22    # "tCurr":D
    .local v4, "tCurr":D
    move-wide v2, v0

    goto :goto_6

    .line 184
    .end local v18    # "xInflection":D
    .end local v20    # "c1":D
    .local v2, "xInflection":D
    .local v4, "c1":D
    .restart local v22    # "tCurr":D
    :cond_9
    move-wide/from16 v18, v2

    move-wide/from16 v20, v4

    .line 185
    .end local v2    # "xInflection":D
    .end local v4    # "c1":D
    .restart local v18    # "xInflection":D
    .restart local v20    # "c1":D
    :goto_5
    neg-double v2, v0

    move-wide/from16 v4, v22

    .line 184
    .end local v22    # "tCurr":D
    .local v4, "tCurr":D
    :goto_6
    nop

    .line 183
    nop

    .line 207
    .local v2, "signedDelta":D
    const-wide v22, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 208
    .local v22, "tDelta":D
    const/4 v12, 0x0

    .line 209
    .local v12, "iterations":I
    :goto_7
    const-wide v24, 0x3f50624dd2f1a9fcL    # 0.001

    cmpl-double v15, v22, v24

    if-lez v15, :cond_a

    const/16 v15, 0x64

    if-ge v12, v15, :cond_a

    .line 210
    add-int/lit8 v12, v12, 0x1

    .line 211
    move-wide/from16 v24, v4

    .line 213
    .local v24, "tLast":D
    const/4 v15, 0x0

    .line 353
    .local v15, "$i$f$iterateNewtonsMethod":I
    move-wide/from16 v26, v4

    .local v26, "t":D
    const/16 v28, 0x0

    .line 215
    .local v28, "$i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateCriticallyDamped$1":I
    mul-double v29, v6, v26

    add-double v29, v20, v29

    mul-double v31, v16, v26

    invoke-static/range {v31 .. v32}, Ljava/lang/Math;->exp(D)D

    move-result-wide v31

    mul-double v29, v29, v31

    add-double v29, v29, v2

    .line 353
    .end local v26    # "t":D
    .end local v28    # "$i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateCriticallyDamped$1":I
    nop

    .restart local v26    # "t":D
    const/16 v28, 0x0

    .line 216
    .local v28, "$i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateCriticallyDamped$2":I
    mul-double v31, v16, v26

    const-wide/high16 v33, 0x3ff0000000000000L    # 1.0

    add-double v31, v31, v33

    mul-double v31, v31, v6

    mul-double v33, v20, v16

    add-double v31, v31, v33

    mul-double v33, v16, v26

    invoke-static/range {v33 .. v34}, Ljava/lang/Math;->exp(D)D

    move-result-wide v33

    mul-double v31, v31, v33

    .line 353
    .end local v26    # "t":D
    .end local v28    # "$i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateCriticallyDamped$2":I
    div-double v29, v29, v31

    sub-double v26, v4, v29

    .line 212
    .end local v15    # "$i$f$iterateNewtonsMethod":I
    move-wide/from16 v4, v26

    .line 218
    sub-double v26, v24, v4

    invoke-static/range {v26 .. v27}, Ljava/lang/Math;->abs(D)D

    move-result-wide v22

    .end local v24    # "tLast":D
    goto :goto_7

    .line 221
    :cond_a
    return-wide v4
.end method

.method private static final estimateDurationInternal(DDDDDDD)J
    .locals 14
    .param p0, "firstRootReal"    # D
    .param p2, "firstRootImaginary"    # D
    .param p4, "secondRootReal"    # D
    .param p6, "dampingRatio"    # D
    .param p8, "initialVelocity"    # D
    .param p10, "initialPosition"    # D
    .param p12, "delta"    # D

    .line 316
    move-wide/from16 v0, p8

    const-wide/16 v2, 0x0

    cmpg-double v4, p10, v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    if-eqz v4, :cond_2

    cmpg-double v4, v0, v2

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    if-eqz v5, :cond_2

    .line 317
    const-wide/16 v2, 0x0

    return-wide v2

    .line 320
    :cond_2
    cmpg-double v2, p10, v2

    if-gez v2, :cond_3

    neg-double v2, v0

    goto :goto_2

    :cond_3
    move-wide v2, v0

    :goto_2
    move-wide v10, v2

    .line 321
    .local v10, "v0":D
    invoke-static/range {p10 .. p11}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    .line 336
    .local v8, "p0":D
    nop

    .line 323
    nop

    .line 324
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, p6, v2

    if-lez v4, :cond_4

    .line 325
    move-wide v4, p0

    move-wide/from16 v6, p4

    move-wide/from16 v12, p12

    invoke-static/range {v4 .. v13}, Landroidx/compose/animation/core/SpringEstimationKt;->estimateOverDamped(DDDDD)D

    move-result-wide v2

    goto :goto_3

    .line 326
    :cond_4
    cmpg-double v2, p6, v2

    if-gez v2, :cond_5

    .line 328
    nop

    .line 329
    nop

    .line 331
    nop

    .line 330
    nop

    .line 332
    nop

    .line 327
    move-wide v4, p0

    move-wide/from16 v6, p2

    move-wide/from16 v12, p12

    invoke-static/range {v4 .. v13}, Landroidx/compose/animation/core/SpringEstimationKt;->estimateUnderDamped(DDDDD)D

    move-result-wide v2

    goto :goto_3

    .line 334
    :cond_5
    move-wide v4, p0

    move-wide v6, v8

    move-wide v8, v10

    move-wide/from16 v10, p12

    .end local v10    # "v0":D
    .local v6, "p0":D
    .local v8, "v0":D
    invoke-static/range {v4 .. v11}, Landroidx/compose/animation/core/SpringEstimationKt;->estimateCriticallyDamped(DDDD)D

    move-result-wide v2

    move-wide v10, v8

    move-wide v8, v6

    .line 335
    .end local v6    # "p0":D
    .local v8, "p0":D
    .restart local v10    # "v0":D
    :goto_3
    nop

    .line 323
    const-wide v4, 0x408f400000000000L    # 1000.0

    mul-double/2addr v2, v4

    .line 336
    double-to-long v2, v2

    .line 323
    return-wide v2
.end method

.method private static final estimateOverDamped(DDDDD)D
    .locals 35
    .param p0, "firstRootReal"    # D
    .param p2, "secondRootReal"    # D
    .param p4, "p0"    # D
    .param p6, "v0"    # D
    .param p8, "delta"    # D

    .line 235
    move-wide/from16 v0, p8

    move-wide/from16 v4, p0

    .line 236
    .local v4, "r1":D
    move-wide/from16 v10, p2

    .line 237
    .local v10, "r2":D
    mul-double v2, v4, p4

    sub-double v2, v2, p6

    sub-double v6, v4, v10

    div-double v8, v2, v6

    .line 238
    .local v8, "c2":D
    sub-double v2, p4, v8

    .line 242
    .local v2, "c1":D
    div-double v6, v0, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    div-double v12, v6, v4

    .line 243
    .local v12, "t1":D
    div-double v6, v0, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    div-double v14, v6, v10

    .line 246
    .local v14, "t2":D
    nop

    .line 247
    move-wide v6, v12

    .local v6, "$this$isNotFinite$iv":D
    const/16 v16, 0x0

    .line 354
    .local v16, "$i$f$isNotFinite":I
    move-wide/from16 v17, v6

    .local v17, "$this$fastIsFinite$iv$iv":D
    const/16 v19, 0x0

    .line 355
    .local v19, "$i$f$fastIsFinite":I
    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v20

    const-wide v22, 0x7fffffffffffffffL

    and-long v20, v20, v22

    const-wide/high16 v24, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    cmp-long v20, v20, v24

    const/16 v21, 0x0

    const/16 v26, 0x1

    if-gez v20, :cond_0

    move/from16 v17, v26

    goto :goto_0

    :cond_0
    move/from16 v17, v21

    .line 354
    .end local v17    # "$this$fastIsFinite$iv$iv":D
    .end local v19    # "$i$f$fastIsFinite":I
    :goto_0
    nop

    .line 247
    .end local v6    # "$this$isNotFinite$iv":D
    .end local v16    # "$i$f$isNotFinite":I
    if-nez v17, :cond_1

    move-wide v6, v14

    goto :goto_1

    .line 248
    :cond_1
    move-wide v6, v14

    .restart local v6    # "$this$isNotFinite$iv":D
    const/16 v16, 0x0

    .line 356
    .restart local v16    # "$i$f$isNotFinite":I
    move-wide/from16 v17, v6

    .restart local v17    # "$this$fastIsFinite$iv$iv":D
    const/16 v19, 0x0

    .line 357
    .restart local v19    # "$i$f$fastIsFinite":I
    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v27

    and-long v22, v27, v22

    cmp-long v20, v22, v24

    if-gez v20, :cond_2

    move/from16 v21, v26

    .line 356
    .end local v17    # "$this$fastIsFinite$iv$iv":D
    .end local v19    # "$i$f$fastIsFinite":I
    :cond_2
    nop

    .line 248
    .end local v6    # "$this$isNotFinite$iv":D
    .end local v16    # "$i$f$isNotFinite":I
    if-nez v21, :cond_3

    move-wide v6, v12

    goto :goto_1

    .line 249
    :cond_3
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(DD)D

    move-result-wide v6

    .line 246
    :goto_1
    nop

    .line 245
    move-wide/from16 v16, v6

    .line 253
    .local v16, "tCurr":D
    mul-double v6, v2, v4

    move-wide/from16 v18, v2

    .end local v2    # "c1":D
    .local v18, "c1":D
    neg-double v2, v8

    mul-double/2addr v2, v10

    div-double/2addr v6, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    sub-double v6, v10, v4

    div-double v6, v2, v6

    .line 259
    .local v6, "tInflection":D
    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_8

    const-wide/16 v20, 0x0

    cmpg-double v2, v6, v20

    if-gtz v2, :cond_4

    move-wide/from16 v2, v18

    move-wide/from16 v18, v12

    goto :goto_2

    .line 261
    :cond_4
    cmpl-double v2, v6, v20

    if-lez v2, :cond_6

    move-wide/from16 v2, v18

    move-wide/from16 v18, v12

    .end local v12    # "t1":D
    .restart local v2    # "c1":D
    .local v18, "t1":D
    invoke-static/range {v2 .. v11}, Landroidx/compose/animation/core/SpringEstimationKt;->estimateOverDamped$xInflection(DDDDD)D

    move-result-wide v12

    neg-double v12, v12

    cmpg-double v12, v12, v0

    if-gez v12, :cond_7

    .line 264
    cmpl-double v12, v8, v20

    if-lez v12, :cond_5

    cmpg-double v12, v2, v20

    if-gez v12, :cond_5

    .line 265
    const-wide/16 v12, 0x0

    move-wide/from16 v16, v12

    .line 267
    :cond_5
    neg-double v12, v0

    goto :goto_3

    .line 261
    .end local v2    # "c1":D
    .restart local v12    # "t1":D
    .local v18, "c1":D
    :cond_6
    move-wide/from16 v2, v18

    move-wide/from16 v18, v12

    .line 277
    .end local v12    # "t1":D
    .restart local v2    # "c1":D
    .local v18, "t1":D
    :cond_7
    mul-double v12, v8, v10

    mul-double/2addr v12, v10

    neg-double v12, v12

    mul-double v20, v2, v4

    mul-double v20, v20, v4

    div-double v12, v12, v20

    invoke-static {v12, v13}, Ljava/lang/Math;->log(D)D

    move-result-wide v12

    sub-double v20, v4, v10

    div-double v12, v12, v20

    .line 278
    .local v12, "tConcavChange":D
    move-wide/from16 v16, v12

    .line 279
    move-wide v12, v0

    goto :goto_3

    .line 259
    .end local v2    # "c1":D
    .local v12, "t1":D
    .local v18, "c1":D
    :cond_8
    move-wide/from16 v2, v18

    move-wide/from16 v18, v12

    .line 260
    .end local v12    # "t1":D
    .restart local v2    # "c1":D
    .local v18, "t1":D
    :goto_2
    neg-double v12, v0

    .line 259
    :goto_3
    nop

    .line 258
    nop

    .line 283
    .local v12, "signedDelta":D
    mul-double v20, v2, v4

    mul-double v22, v4, v16

    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->exp(D)D

    move-result-wide v22

    mul-double v20, v20, v22

    mul-double v22, v8, v10

    mul-double v24, v10, v16

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->exp(D)D

    move-result-wide v24

    mul-double v22, v22, v24

    add-double v20, v20, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(D)D

    move-result-wide v20

    const-wide v22, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpg-double v20, v20, v22

    if-gez v20, :cond_9

    .line 284
    return-wide v16

    .line 286
    :cond_9
    const-wide v20, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 289
    .local v20, "tDelta":D
    const/16 v22, 0x0

    move/from16 v0, v22

    .line 290
    .local v0, "iterations":I
    :goto_4
    const-wide v22, 0x3f50624dd2f1a9fcL    # 0.001

    cmpl-double v1, v20, v22

    if-lez v1, :cond_a

    const/16 v1, 0x64

    if-ge v0, v1, :cond_a

    .line 291
    add-int/lit8 v0, v0, 0x1

    .line 292
    move-wide/from16 v22, v16

    .line 294
    .local v22, "tLast":D
    const/4 v1, 0x0

    .line 358
    .local v1, "$i$f$iterateNewtonsMethod":I
    move-wide/from16 v24, v16

    .local v24, "t":D
    const/16 v26, 0x0

    .line 296
    .local v26, "$i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateOverDamped$1":I
    mul-double v27, v4, v24

    invoke-static/range {v27 .. v28}, Ljava/lang/Math;->exp(D)D

    move-result-wide v27

    mul-double v27, v27, v2

    mul-double v29, v10, v24

    invoke-static/range {v29 .. v30}, Ljava/lang/Math;->exp(D)D

    move-result-wide v29

    mul-double v29, v29, v8

    add-double v27, v27, v29

    add-double v27, v27, v12

    .line 358
    .end local v24    # "t":D
    .end local v26    # "$i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateOverDamped$1":I
    nop

    .restart local v24    # "t":D
    const/16 v26, 0x0

    .line 297
    .local v26, "$i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateOverDamped$2":I
    mul-double v29, v2, v4

    mul-double v31, v4, v24

    invoke-static/range {v31 .. v32}, Ljava/lang/Math;->exp(D)D

    move-result-wide v31

    mul-double v29, v29, v31

    mul-double v31, v8, v10

    mul-double v33, v10, v24

    invoke-static/range {v33 .. v34}, Ljava/lang/Math;->exp(D)D

    move-result-wide v33

    mul-double v31, v31, v33

    add-double v29, v29, v31

    .line 358
    .end local v24    # "t":D
    .end local v26    # "$i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateOverDamped$2":I
    div-double v27, v27, v29

    sub-double v24, v16, v27

    .line 293
    .end local v1    # "$i$f$iterateNewtonsMethod":I
    move-wide/from16 v16, v24

    .line 299
    sub-double v24, v22, v16

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->abs(D)D

    move-result-wide v20

    .end local v22    # "tLast":D
    goto :goto_4

    .line 302
    :cond_a
    return-wide v16
.end method

.method private static final estimateOverDamped$xInflection(DDDDD)D
    .locals 4
    .param p0, "c1"    # D
    .param p2, "r1"    # D
    .param p4, "tInflection"    # D
    .param p6, "c2"    # D
    .param p8, "r2"    # D

    .line 254
    mul-double v0, p2, p4

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    mul-double/2addr v0, p0

    mul-double v2, p8, p4

    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v2

    mul-double/2addr v2, p6

    add-double/2addr v0, v2

    return-wide v0
.end method

.method private static final estimateUnderDamped(DDDDD)D
    .locals 10
    .param p0, "firstRootReal"    # D
    .param p2, "firstRootImaginary"    # D
    .param p4, "p0"    # D
    .param p6, "v0"    # D
    .param p8, "delta"    # D

    .line 135
    move-wide v0, p0

    .line 136
    .local v0, "r":D
    move-wide v2, p4

    .line 137
    .local v2, "c1":D
    mul-double v4, v0, v2

    sub-double v4, p6, v4

    div-double/2addr v4, p2

    .line 138
    .local v4, "c2":D
    mul-double v6, v2, v2

    mul-double v8, v4, v4

    add-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    .line 140
    .local v6, "c":D
    div-double v8, p8, v6

    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    div-double/2addr v8, v0

    return-wide v8
.end method

.method private static final isNotFinite(D)Z
    .locals 8
    .param p0, "$this$isNotFinite"    # D

    const/4 v0, 0x0

    .line 347
    .local v0, "$i$f$isNotFinite":I
    move-wide v1, p0

    .local v1, "$this$fastIsFinite$iv":D
    const/4 v3, 0x0

    .line 359
    .local v3, "$i$f$fastIsFinite":I
    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    and-long/2addr v4, v6

    const-wide/high16 v6, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    cmp-long v4, v4, v6

    const/4 v5, 0x1

    if-gez v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 347
    .end local v1    # "$this$fastIsFinite$iv":D
    .end local v3    # "$i$f$fastIsFinite":I
    :goto_0
    xor-int/lit8 v1, v4, 0x1

    return v1
.end method

.method private static final iterateNewtonsMethod(DLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)D
    .locals 5
    .param p0, "x"    # D
    .param p2, "fn"    # Lkotlin/jvm/functions/Function1;
    .param p3, "fnPrime"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;)D"
        }
    .end annotation

    const/4 v0, 0x0

    .line 344
    .local v0, "$i$f$iterateNewtonsMethod":I
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-interface {p3, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    div-double/2addr v1, v3

    sub-double v1, p0, v1

    return-wide v1
.end method
