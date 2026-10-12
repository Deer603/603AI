.class public final Landroidx/compose/animation/core/MonoSpline;
.super Ljava/lang/Object;
.source "MonoSpline.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMonoSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,303:1\n65#2,10:304\n65#2,10:314\n*S KotlinDebug\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n*L\n176#1:304,10\n244#1:314,10\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/compose/animation/core/MonoSpline;",
        "",
        "time",
        "",
        "y",
        "",
        "periodicBias",
        "",
        "([F[[FF)V",
        "slopeTemp",
        "tangents",
        "[[F",
        "timePoints",
        "values",
        "getPos",
        "",
        "v",
        "Landroidx/compose/animation/core/AnimationVector;",
        "index",
        "",
        "t",
        "j",
        "getSlope",
        "makeFloatArray",
        "a",
        "b",
        "(II)[[F",
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
.field private final slopeTemp:[F

.field private final tangents:[[F

.field private final timePoints:[F

.field private final values:[[F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/animation/core/MonoSpline;->$stable:I

    return-void
.end method

.method public constructor <init>([F[[FF)V
    .locals 18
    .param p1, "time"    # [F
    .param p2, "y"    # [[F
    .param p3, "periodicBias"    # F

    .line 28
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    nop

    .line 35
    array-length v3, v1

    .line 36
    .local v3, "n":I
    const/4 v4, 0x0

    aget-object v5, v2, v4

    array-length v5, v5

    .line 37
    .local v5, "dim":I
    new-array v6, v5, [F

    iput-object v6, v0, Landroidx/compose/animation/core/MonoSpline;->slopeTemp:[F

    .line 38
    add-int/lit8 v6, v3, -0x1

    invoke-direct {v0, v6, v5}, Landroidx/compose/animation/core/MonoSpline;->makeFloatArray(II)[[F

    move-result-object v6

    .line 39
    .local v6, "slope":[[F
    invoke-direct {v0, v3, v5}, Landroidx/compose/animation/core/MonoSpline;->makeFloatArray(II)[[F

    move-result-object v7

    .line 40
    .local v7, "tangent":[[F
    const/4 v8, 0x0

    .local v8, "j":I
    :goto_0
    if-ge v8, v5, :cond_2

    .line 41
    const/4 v9, 0x0

    .local v9, "i":I
    add-int/lit8 v10, v3, -0x1

    :goto_1
    if-ge v9, v10, :cond_1

    .line 42
    add-int/lit8 v11, v9, 0x1

    aget v11, v1, v11

    aget v12, v1, v9

    sub-float/2addr v11, v12

    .line 43
    .local v11, "dt":F
    aget-object v12, v6, v9

    add-int/lit8 v13, v9, 0x1

    aget-object v13, v2, v13

    aget v13, v13, v8

    aget-object v14, v2, v9

    aget v14, v14, v8

    sub-float/2addr v13, v14

    div-float/2addr v13, v11

    aput v13, v12, v8

    .line 44
    if-nez v9, :cond_0

    .line 45
    aget-object v12, v7, v9

    aget-object v13, v6, v9

    aget v13, v13, v8

    aput v13, v12, v8

    goto :goto_2

    .line 47
    :cond_0
    aget-object v12, v7, v9

    add-int/lit8 v13, v9, -0x1

    aget-object v13, v6, v13

    aget v13, v13, v8

    aget-object v14, v6, v9

    aget v14, v14, v8

    add-float/2addr v13, v14

    const/high16 v14, 0x3f000000    # 0.5f

    mul-float/2addr v13, v14

    aput v13, v12, v8

    .line 41
    .end local v11    # "dt":F
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 50
    .end local v9    # "i":I
    :cond_1
    add-int/lit8 v9, v3, -0x1

    aget-object v9, v7, v9

    add-int/lit8 v10, v3, -0x2

    aget-object v10, v6, v10

    aget v10, v10, v8

    aput v10, v9, v8

    .line 40
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 52
    .end local v8    # "j":I
    :cond_2
    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_3

    .line 53
    const/4 v8, 0x0

    .restart local v8    # "j":I
    :goto_3
    if-ge v8, v5, :cond_3

    .line 56
    add-int/lit8 v9, v3, -0x2

    aget-object v9, v6, v9

    aget v9, v9, v8

    const/high16 v10, 0x3f800000    # 1.0f

    sub-float v10, v10, p3

    mul-float/2addr v9, v10

    aget-object v10, v6, v4

    aget v10, v10, v8

    mul-float v10, v10, p3

    add-float/2addr v9, v10

    .line 55
    nop

    .line 57
    .local v9, "adjustedSlope":F
    aget-object v10, v6, v4

    aput v9, v10, v8

    .line 58
    add-int/lit8 v10, v3, -0x2

    aget-object v10, v6, v10

    aput v9, v10, v8

    .line 59
    add-int/lit8 v10, v3, -0x1

    aget-object v10, v7, v10

    aput v9, v10, v8

    .line 60
    aget-object v10, v7, v4

    aput v9, v10, v8

    .line 53
    .end local v9    # "adjustedSlope":F
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 63
    .end local v8    # "j":I
    :cond_3
    const/4 v8, 0x0

    .local v8, "i":I
    add-int/lit8 v9, v3, -0x1

    :goto_4
    if-ge v8, v9, :cond_8

    .line 64
    const/4 v10, 0x0

    .local v10, "j":I
    :goto_5
    if-ge v10, v5, :cond_7

    .line 65
    aget-object v11, v6, v8

    aget v11, v11, v10

    const/4 v12, 0x0

    cmpg-float v11, v11, v12

    if-nez v11, :cond_4

    const/4 v11, 0x1

    goto :goto_6

    :cond_4
    move v11, v4

    :goto_6
    if-eqz v11, :cond_5

    .line 66
    aget-object v11, v7, v8

    aput v12, v11, v10

    .line 67
    add-int/lit8 v11, v8, 0x1

    aget-object v11, v7, v11

    aput v12, v11, v10

    move v15, v5

    goto :goto_7

    .line 69
    :cond_5
    aget-object v11, v7, v8

    aget v11, v11, v10

    aget-object v12, v6, v8

    aget v12, v12, v10

    div-float/2addr v11, v12

    .line 70
    .local v11, "a":F
    add-int/lit8 v12, v8, 0x1

    aget-object v12, v7, v12

    aget v12, v12, v10

    aget-object v13, v6, v8

    aget v13, v13, v10

    div-float/2addr v12, v13

    .line 71
    .local v12, "b":F
    float-to-double v13, v11

    move v15, v5

    .end local v5    # "dim":I
    .local v15, "dim":I
    float-to-double v4, v12

    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    double-to-float v4, v4

    .line 72
    .local v4, "h":F
    float-to-double v13, v4

    const-wide/high16 v16, 0x4022000000000000L    # 9.0

    cmpl-double v5, v13, v16

    if-lez v5, :cond_6

    .line 73
    const/high16 v5, 0x40400000    # 3.0f

    div-float/2addr v5, v4

    .line 74
    .local v5, "t":F
    aget-object v13, v7, v8

    mul-float v14, v5, v11

    aget-object v16, v6, v8

    aget v16, v16, v10

    mul-float v14, v14, v16

    aput v14, v13, v10

    .line 75
    add-int/lit8 v13, v8, 0x1

    aget-object v13, v7, v13

    mul-float v14, v5, v12

    aget-object v16, v6, v8

    aget v16, v16, v10

    mul-float v14, v14, v16

    aput v14, v13, v10

    .line 64
    .end local v4    # "h":F
    .end local v5    # "t":F
    .end local v11    # "a":F
    .end local v12    # "b":F
    :cond_6
    :goto_7
    add-int/lit8 v10, v10, 0x1

    move v5, v15

    const/4 v4, 0x0

    goto :goto_5

    .end local v15    # "dim":I
    .local v5, "dim":I
    :cond_7
    move v15, v5

    .line 63
    .end local v5    # "dim":I
    .end local v10    # "j":I
    .restart local v15    # "dim":I
    add-int/lit8 v8, v8, 0x1

    const/4 v4, 0x0

    goto :goto_4

    .line 80
    .end local v8    # "i":I
    .end local v15    # "dim":I
    .restart local v5    # "dim":I
    :cond_8
    iput-object v1, v0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    .line 81
    iput-object v2, v0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    .line 82
    iput-object v7, v0, Landroidx/compose/animation/core/MonoSpline;->tangents:[[F

    .line 83
    .end local v3    # "n":I
    .end local v5    # "dim":I
    .end local v6    # "slope":[[F
    .end local v7    # "tangent":[[F
    nop

    .line 28
    return-void
.end method

.method public static synthetic getPos$default(Landroidx/compose/animation/core/MonoSpline;FLandroidx/compose/animation/core/AnimationVector;IILjava/lang/Object;)V
    .locals 0

    .line 129
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/core/MonoSpline;->getPos(FLandroidx/compose/animation/core/AnimationVector;I)V

    return-void
.end method

.method private final getSlope(FI)F
    .locals 16
    .param p1, "time"    # F
    .param p2, "j"    # I

    .line 240
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    .line 241
    .local v1, "timePoints":[F
    iget-object v2, v0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    .line 242
    .local v2, "values":[[F
    iget-object v3, v0, Landroidx/compose/animation/core/MonoSpline;->tangents:[[F

    .line 243
    .local v3, "tangents":[[F
    array-length v4, v1

    .line 244
    .local v4, "n":I
    const/4 v5, 0x0

    aget v5, v1, v5

    .local v5, "minimumValue$iv":F
    add-int/lit8 v6, v4, -0x1

    aget v6, v1, v6

    .local v6, "maximumValue$iv":F
    move/from16 v7, p1

    .local v7, "$this$fastCoerceIn$iv":F
    const/4 v8, 0x0

    .line 314
    .local v8, "$i$f$fastCoerceIn":I
    move v9, v7

    .local v9, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v10, 0x0

    .line 318
    .local v10, "$i$f$fastCoerceAtLeast":I
    cmpg-float v11, v9, v5

    if-gez v11, :cond_0

    move v9, v5

    .line 314
    .end local v9    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v10    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    nop

    .local v9, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v10, 0x0

    .line 323
    .local v10, "$i$f$fastCoerceAtMost":I
    cmpl-float v11, v9, v6

    if-lez v11, :cond_1

    move v9, v6

    .line 314
    .end local v9    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v10    # "$i$f$fastCoerceAtMost":I
    :cond_1
    nop

    .line 244
    .end local v5    # "minimumValue$iv":F
    .end local v6    # "maximumValue$iv":F
    .end local v7    # "$this$fastCoerceIn$iv":F
    .end local v8    # "$i$f$fastCoerceIn":I
    nop

    .line 245
    .local v9, "t":F
    const/4 v5, 0x0

    .local v5, "i":I
    add-int/lit8 v6, v4, -0x1

    :goto_0
    if-ge v5, v6, :cond_3

    .line 246
    add-int/lit8 v7, v5, 0x1

    aget v7, v1, v7

    cmpg-float v7, v9, v7

    if-gtz v7, :cond_2

    .line 247
    aget-object v6, v2, v5

    aget v12, v6, p2

    .line 248
    .local v12, "y1":F
    add-int/lit8 v6, v5, 0x1

    aget-object v6, v2, v6

    aget v13, v6, p2

    .line 249
    .local v13, "y2":F
    aget-object v6, v3, v5

    aget v14, v6, p2

    .line 250
    .local v14, "t1":F
    add-int/lit8 v6, v5, 0x1

    aget-object v6, v3, v6

    aget v15, v6, p2

    .line 251
    .local v15, "t2":F
    add-int/lit8 v6, v5, 0x1

    aget v6, v1, v6

    aget v7, v1, v5

    sub-float v10, v6, v7

    .line 252
    .local v10, "h":F
    aget v6, v1, v5

    sub-float v6, v9, v6

    div-float v11, v6, v10

    .line 253
    .local v11, "x":F
    invoke-static/range {v10 .. v15}, Landroidx/compose/animation/core/MonoSplineKt;->hermiteDifferential(FFFFFF)F

    move-result v6

    div-float/2addr v6, v10

    return v6

    .line 245
    .end local v10    # "h":F
    .end local v11    # "x":F
    .end local v12    # "y1":F
    .end local v13    # "y2":F
    .end local v14    # "t1":F
    .end local v15    # "t2":F
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 256
    .end local v5    # "i":I
    :cond_3
    const/4 v5, 0x0

    return v5
.end method

.method private final getSlope(F[F)V
    .locals 13
    .param p1, "time"    # F
    .param p2, "v"    # [F

    .line 174
    iget-object v0, p0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    const/4 v1, 0x0

    aget-object v0, v0, v1

    array-length v0, v0

    .line 175
    .local v0, "dim":I
    iget-object v2, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    array-length v2, v2

    .line 176
    .local v2, "n":I
    iget-object v3, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v1, v3, v1

    .local v1, "minimumValue$iv":F
    iget-object v3, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    add-int/lit8 v4, v2, -0x1

    aget v3, v3, v4

    .local v3, "maximumValue$iv":F
    move v4, p1

    .local v4, "$this$fastCoerceIn$iv":F
    const/4 v5, 0x0

    .line 304
    .local v5, "$i$f$fastCoerceIn":I
    move v6, v4

    .local v6, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v7, 0x0

    .line 308
    .local v7, "$i$f$fastCoerceAtLeast":I
    cmpg-float v8, v6, v1

    if-gez v8, :cond_0

    move v6, v1

    .line 304
    .end local v6    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v7    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    nop

    .local v6, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v7, 0x0

    .line 313
    .local v7, "$i$f$fastCoerceAtMost":I
    cmpl-float v8, v6, v3

    if-lez v8, :cond_1

    move v6, v3

    .line 304
    .end local v6    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v7    # "$i$f$fastCoerceAtMost":I
    :cond_1
    nop

    .line 176
    .end local v1    # "minimumValue$iv":F
    .end local v3    # "maximumValue$iv":F
    .end local v4    # "$this$fastCoerceIn$iv":F
    .end local v5    # "$i$f$fastCoerceIn":I
    nop

    .line 178
    .local v6, "t":F
    array-length v1, p2

    if-ge v1, v0, :cond_2

    return-void

    .line 179
    :cond_2
    const/4 v1, 0x0

    .local v1, "i":I
    add-int/lit8 v3, v2, -0x1

    :goto_0
    if-ge v1, v3, :cond_5

    .line 180
    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    add-int/lit8 v5, v1, 0x1

    aget v4, v4, v5

    cmpg-float v4, v6, v4

    if-gtz v4, :cond_4

    .line 181
    iget-object v3, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    add-int/lit8 v4, v1, 0x1

    aget v3, v3, v4

    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v4, v4, v1

    sub-float v7, v3, v4

    .line 182
    .local v7, "h":F
    iget-object v3, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v3, v3, v1

    sub-float v3, v6, v3

    div-float v8, v3, v7

    .line 183
    .local v8, "x":F
    const/4 v3, 0x0

    .local v3, "j":I
    :goto_1
    if-ge v3, v0, :cond_3

    .line 184
    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    aget-object v4, v4, v1

    aget v9, v4, v3

    .line 185
    .local v9, "y1":F
    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    add-int/lit8 v5, v1, 0x1

    aget-object v4, v4, v5

    aget v10, v4, v3

    .line 186
    .local v10, "y2":F
    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->tangents:[[F

    aget-object v4, v4, v1

    aget v11, v4, v3

    .line 187
    .local v11, "t1":F
    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->tangents:[[F

    add-int/lit8 v5, v1, 0x1

    aget-object v4, v4, v5

    aget v12, v4, v3

    .line 188
    .local v12, "t2":F
    invoke-static/range {v7 .. v12}, Landroidx/compose/animation/core/MonoSplineKt;->hermiteDifferential(FFFFFF)F

    move-result v4

    div-float/2addr v4, v7

    aput v4, p2, v3

    .line 183
    .end local v9    # "y1":F
    .end local v10    # "y2":F
    .end local v11    # "t1":F
    .end local v12    # "t2":F
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 190
    .end local v3    # "j":I
    :cond_3
    goto :goto_2

    .line 179
    .end local v7    # "h":F
    .end local v8    # "x":F
    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 193
    .end local v1    # "i":I
    :cond_5
    :goto_2
    return-void
.end method

.method public static synthetic getSlope$default(Landroidx/compose/animation/core/MonoSpline;FLandroidx/compose/animation/core/AnimationVector;IILjava/lang/Object;)V
    .locals 0

    .line 201
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/core/MonoSpline;->getSlope(FLandroidx/compose/animation/core/AnimationVector;I)V

    return-void
.end method

.method private final makeFloatArray(II)[[F
    .locals 3
    .param p1, "a"    # I
    .param p2, "b"    # I

    .line 89
    new-array v0, p1, [[F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    new-array v2, p2, [F

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final getPos(FI)F
    .locals 13
    .param p1, "t"    # F
    .param p2, "j"    # I

    .line 93
    iget-object v0, p0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    .line 94
    .local v0, "values":[[F
    iget-object v1, p0, Landroidx/compose/animation/core/MonoSpline;->tangents:[[F

    .line 95
    .local v1, "tangents":[[F
    iget-object v2, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    array-length v2, v2

    .line 96
    .local v2, "n":I
    iget-object v3, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    cmpg-float v3, p1, v3

    const/4 v5, -0x1

    if-gtz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    iget-object v3, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    add-int/lit8 v6, v2, -0x1

    aget v3, v3, v6

    cmpl-float v3, p1, v3

    if-ltz v3, :cond_1

    add-int/lit8 v3, v2, -0x1

    goto :goto_0

    :cond_1
    move v3, v5

    .line 97
    .local v3, "index":I
    :goto_0
    nop

    .line 98
    if-eq v3, v5, :cond_2

    .line 99
    aget-object v4, v0, v3

    aget v4, v4, p2

    iget-object v5, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v5, v5, v3

    sub-float v5, p1, v5

    iget-object v6, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v6, v6, v3

    invoke-direct {p0, v6, p2}, Landroidx/compose/animation/core/MonoSpline;->getSlope(FI)F

    move-result v6

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    return v4

    .line 107
    :cond_2
    const/4 v5, 0x0

    .local v5, "i":I
    add-int/lit8 v6, v2, -0x1

    :goto_1
    if-ge v5, v6, :cond_6

    .line 108
    iget-object v7, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v7, v7, v5

    cmpg-float v7, p1, v7

    if-nez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    move v7, v4

    :goto_2
    if-eqz v7, :cond_4

    .line 109
    aget-object v4, v0, v5

    aget v4, v4, p2

    return v4

    .line 111
    :cond_4
    iget-object v7, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    add-int/lit8 v8, v5, 0x1

    aget v7, v7, v8

    cmpg-float v7, p1, v7

    if-gez v7, :cond_5

    .line 112
    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    add-int/lit8 v6, v5, 0x1

    aget v4, v4, v6

    iget-object v6, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v6, v6, v5

    sub-float v7, v4, v6

    .line 113
    .local v7, "h":F
    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v4, v4, v5

    sub-float v4, p1, v4

    div-float v8, v4, v7

    .line 114
    .local v8, "x":F
    aget-object v4, v0, v5

    aget v9, v4, p2

    .line 115
    .local v9, "y1":F
    add-int/lit8 v4, v5, 0x1

    aget-object v4, v0, v4

    aget v10, v4, p2

    .line 116
    .local v10, "y2":F
    aget-object v4, v1, v5

    aget v11, v4, p2

    .line 117
    .local v11, "t1":F
    add-int/lit8 v4, v5, 0x1

    aget-object v4, v1, v4

    aget v12, v4, p2

    .line 118
    .local v12, "t2":F
    invoke-static/range {v7 .. v12}, Landroidx/compose/animation/core/MonoSplineKt;->hermiteInterpolate(FFFFFF)F

    move-result v4

    return v4

    .line 107
    .end local v7    # "h":F
    .end local v8    # "x":F
    .end local v9    # "y1":F
    .end local v10    # "y2":F
    .end local v11    # "t1":F
    .end local v12    # "t2":F
    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 121
    .end local v5    # "i":I
    :cond_6
    const/4 v4, 0x0

    return v4
.end method

.method public final getPos(FLandroidx/compose/animation/core/AnimationVector;I)V
    .locals 12
    .param p1, "time"    # F
    .param p2, "v"    # Landroidx/compose/animation/core/AnimationVector;
    .param p3, "index"    # I

    .line 130
    iget-object v0, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    array-length v0, v0

    .line 131
    .local v0, "n":I
    iget-object v1, p0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    const/4 v2, 0x0

    aget-object v1, v1, v2

    array-length v1, v1

    .line 132
    .local v1, "dim":I
    iget-object v3, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v3, v3, v2

    cmpg-float v3, p1, v3

    const/4 v4, -0x1

    if-gtz v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget-object v3, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    add-int/lit8 v5, v0, -0x1

    aget v3, v3, v5

    cmpl-float v3, p1, v3

    if-ltz v3, :cond_1

    add-int/lit8 v3, v0, -0x1

    goto :goto_0

    :cond_1
    move v3, v4

    .line 133
    .local v3, "k":I
    :goto_0
    nop

    .line 134
    if-eq v3, v4, :cond_3

    .line 135
    iget-object v2, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v2, v2, v3

    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->slopeTemp:[F

    invoke-direct {p0, v2, v4}, Landroidx/compose/animation/core/MonoSpline;->getSlope(F[F)V

    .line 136
    const/4 v2, 0x0

    .local v2, "j":I
    :goto_1
    if-ge v2, v1, :cond_2

    .line 137
    iget-object v4, p0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    aget-object v4, v4, v3

    aget v4, v4, v2

    iget-object v5, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v5, v5, v3

    sub-float v5, p1, v5

    iget-object v6, p0, Landroidx/compose/animation/core/MonoSpline;->slopeTemp:[F

    aget v6, v6, v2

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-virtual {p2, v2, v4}, Landroidx/compose/animation/core/AnimationVector;->set$animation_core_release(IF)V

    .line 136
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 139
    .end local v2    # "j":I
    :cond_2
    return-void

    .line 150
    :cond_3
    move v4, p3

    .local v4, "i":I
    add-int/lit8 v5, v0, -0x1

    :goto_2
    if-ge v4, v5, :cond_9

    .line 151
    iget-object v6, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v6, v6, v4

    cmpg-float v6, p1, v6

    if-nez v6, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    move v6, v2

    :goto_3
    if-eqz v6, :cond_6

    .line 152
    const/4 v2, 0x0

    .restart local v2    # "j":I
    :goto_4
    if-ge v2, v1, :cond_5

    .line 153
    iget-object v5, p0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    aget-object v5, v5, v4

    aget v5, v5, v2

    invoke-virtual {p2, v2, v5}, Landroidx/compose/animation/core/AnimationVector;->set$animation_core_release(IF)V

    .line 152
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 155
    .end local v2    # "j":I
    :cond_5
    return-void

    .line 157
    :cond_6
    iget-object v6, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    add-int/lit8 v7, v4, 0x1

    aget v6, v6, v7

    cmpg-float v6, p1, v6

    if-gez v6, :cond_8

    .line 158
    iget-object v2, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    add-int/lit8 v5, v4, 0x1

    aget v2, v2, v5

    iget-object v5, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v5, v5, v4

    sub-float v6, v2, v5

    .line 159
    .local v6, "h":F
    iget-object v2, p0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    aget v2, v2, v4

    sub-float v2, p1, v2

    div-float v7, v2, v6

    .line 160
    .local v7, "x":F
    const/4 v2, 0x0

    .restart local v2    # "j":I
    :goto_5
    if-ge v2, v1, :cond_7

    .line 161
    iget-object v5, p0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    aget-object v5, v5, v4

    aget v8, v5, v2

    .line 162
    .local v8, "y1":F
    iget-object v5, p0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    add-int/lit8 v9, v4, 0x1

    aget-object v5, v5, v9

    aget v9, v5, v2

    .line 163
    .local v9, "y2":F
    iget-object v5, p0, Landroidx/compose/animation/core/MonoSpline;->tangents:[[F

    aget-object v5, v5, v4

    aget v10, v5, v2

    .line 164
    .local v10, "t1":F
    iget-object v5, p0, Landroidx/compose/animation/core/MonoSpline;->tangents:[[F

    add-int/lit8 v11, v4, 0x1

    aget-object v5, v5, v11

    aget v11, v5, v2

    .line 165
    .local v11, "t2":F
    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/core/MonoSplineKt;->hermiteInterpolate(FFFFFF)F

    move-result v5

    invoke-virtual {p2, v2, v5}, Landroidx/compose/animation/core/AnimationVector;->set$animation_core_release(IF)V

    .line 160
    .end local v8    # "y1":F
    .end local v9    # "y2":F
    .end local v10    # "t1":F
    .end local v11    # "t2":F
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 167
    .end local v2    # "j":I
    :cond_7
    return-void

    .line 150
    .end local v6    # "h":F
    .end local v7    # "x":F
    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 170
    .end local v4    # "i":I
    :cond_9
    return-void
.end method

.method public final getSlope(FLandroidx/compose/animation/core/AnimationVector;I)V
    .locals 17
    .param p1, "time"    # F
    .param p2, "v"    # Landroidx/compose/animation/core/AnimationVector;
    .param p3, "index"    # I

    .line 202
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Landroidx/compose/animation/core/MonoSpline;->timePoints:[F

    .line 203
    .local v2, "timePoints":[F
    iget-object v3, v0, Landroidx/compose/animation/core/MonoSpline;->values:[[F

    .line 204
    .local v3, "values":[[F
    iget-object v4, v0, Landroidx/compose/animation/core/MonoSpline;->tangents:[[F

    .line 206
    .local v4, "tangents":[[F
    array-length v5, v2

    .line 207
    .local v5, "n":I
    const/4 v6, 0x0

    aget-object v7, v3, v6

    array-length v7, v7

    .line 211
    .local v7, "dim":I
    aget v8, v2, v6

    cmpg-float v8, p1, v8

    const/4 v9, -0x1

    if-gtz v8, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v6, v5, -0x1

    aget v6, v2, v6

    cmpl-float v6, p1, v6

    if-ltz v6, :cond_1

    add-int/lit8 v6, v5, -0x1

    goto :goto_0

    :cond_1
    move v6, v9

    .line 210
    :goto_0
    nop

    .line 212
    .local v6, "tangentIndex":I
    if-eq v6, v9, :cond_4

    .line 213
    aget-object v8, v4, v6

    .line 215
    .local v8, "tangent":[F
    array-length v9, v8

    if-ge v9, v7, :cond_2

    return-void

    .line 216
    :cond_2
    const/4 v9, 0x0

    .local v9, "j":I
    :goto_1
    if-ge v9, v7, :cond_3

    .line 217
    aget v10, v8, v9

    invoke-virtual {v1, v9, v10}, Landroidx/compose/animation/core/AnimationVector;->set$animation_core_release(IF)V

    .line 216
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 219
    .end local v9    # "j":I
    :cond_3
    return-void

    .line 223
    .end local v8    # "tangent":[F
    :cond_4
    move/from16 v8, p3

    .local v8, "i":I
    add-int/lit8 v9, v5, -0x1

    :goto_2
    if-ge v8, v9, :cond_7

    .line 224
    add-int/lit8 v10, v8, 0x1

    aget v10, v2, v10

    cmpg-float v10, p1, v10

    if-gtz v10, :cond_6

    .line 225
    add-int/lit8 v9, v8, 0x1

    aget v9, v2, v9

    aget v10, v2, v8

    sub-float v11, v9, v10

    .line 226
    .local v11, "h":F
    aget v9, v2, v8

    sub-float v9, p1, v9

    div-float v12, v9, v11

    .line 227
    .local v12, "x":F
    const/4 v9, 0x0

    .restart local v9    # "j":I
    :goto_3
    if-ge v9, v7, :cond_5

    .line 228
    aget-object v10, v3, v8

    aget v13, v10, v9

    .line 229
    .local v13, "y1":F
    add-int/lit8 v10, v8, 0x1

    aget-object v10, v3, v10

    aget v14, v10, v9

    .line 230
    .local v14, "y2":F
    aget-object v10, v4, v8

    aget v15, v10, v9

    .line 231
    .local v15, "t1":F
    add-int/lit8 v10, v8, 0x1

    aget-object v10, v4, v10

    aget v16, v10, v9

    .line 232
    .local v16, "t2":F
    invoke-static/range {v11 .. v16}, Landroidx/compose/animation/core/MonoSplineKt;->hermiteDifferential(FFFFFF)F

    move-result v10

    div-float/2addr v10, v11

    invoke-virtual {v1, v9, v10}, Landroidx/compose/animation/core/AnimationVector;->set$animation_core_release(IF)V

    .line 227
    .end local v13    # "y1":F
    .end local v14    # "y2":F
    .end local v15    # "t1":F
    .end local v16    # "t2":F
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 234
    .end local v9    # "j":I
    :cond_5
    goto :goto_4

    .line 223
    .end local v11    # "h":F
    .end local v12    # "x":F
    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 237
    .end local v8    # "i":I
    :cond_7
    :goto_4
    return-void
.end method
