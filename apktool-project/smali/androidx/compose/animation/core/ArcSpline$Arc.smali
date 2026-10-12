.class public final Landroidx/compose/animation/core/ArcSpline$Arc;
.super Ljava/lang/Object;
.source "ArcSpline.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/core/ArcSpline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Arc"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 2 ArcSpline.jvm.kt\nandroidx/compose/animation/core/ArcSpline_jvmKt\n*L\n1#1,393:1\n268#1,2:394\n21#2:396\n26#2:397\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n*L\n262#1:394,2\n334#1:396\n353#1:397\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0014\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B?\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ-\u0010!\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\u0008#J\u0011\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0082\u0008J\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010\'\u001a\u00020\u0005J\t\u0010(\u001a\u00020\u0005H\u0086\u0008J\t\u0010)\u001a\u00020\u0005H\u0086\u0008J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0002J\u000e\u0010.\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0005R\u000e\u0010\u000c\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00058\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00058\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00058\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00058\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0014\u001a\u00020\u00058\u00c0\u0002X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0015\u0010\u0017\u001a\u00020\u00058\u00c0\u0002X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0016R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"
    }
    d2 = {
        "Landroidx/compose/animation/core/ArcSpline$Arc;",
        "",
        "mode",
        "",
        "time1",
        "",
        "time2",
        "x1",
        "y1",
        "x2",
        "y2",
        "(IFFFFFF)V",
        "arcDistance",
        "arcVelocity",
        "ellipseA",
        "ellipseB",
        "ellipseCenterX",
        "ellipseCenterY",
        "isLinear",
        "",
        "linearDX",
        "getLinearDX$animation_core_release",
        "()F",
        "linearDY",
        "getLinearDY$animation_core_release",
        "lut",
        "",
        "oneOverDeltaTime",
        "getTime1",
        "getTime2",
        "tmpCosAngle",
        "tmpSinAngle",
        "vertical",
        "buildTable",
        "",
        "buildTable$animation_core_release",
        "calcAngle",
        "time",
        "calcDX",
        "calcDY",
        "calcX",
        "calcY",
        "getLinearX",
        "getLinearY",
        "lookup",
        "v",
        "setPoint",
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
.field private arcDistance:F

.field private final arcVelocity:F

.field public final ellipseA:F

.field public final ellipseB:F

.field public final ellipseCenterX:F

.field public final ellipseCenterY:F

.field public final isLinear:Z

.field private final lut:[F

.field private final oneOverDeltaTime:F

.field private final time1:F

.field private final time2:F

.field private tmpCosAngle:F

.field private tmpSinAngle:F

.field private final vertical:F

.field private final x1:F

.field private final x2:F

.field private final y1:F

.field private final y2:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/animation/core/ArcSpline$Arc;->$stable:I

    return-void
.end method

.method public constructor <init>(IFFFFFF)V
    .locals 8
    .param p1, "mode"    # I
    .param p2, "time1"    # F
    .param p3, "time2"    # F
    .param p4, "x1"    # F
    .param p5, "y1"    # F
    .param p6, "x2"    # F
    .param p7, "y2"    # F

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    iput p2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time1:F

    .line 196
    iput p3, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time2:F

    .line 197
    iput p4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x1:F

    .line 198
    iput p5, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y1:F

    .line 199
    iput p6, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x2:F

    .line 200
    iput p7, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y2:F

    .line 227
    nop

    .line 228
    iget v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x2:F

    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x1:F

    sub-float/2addr v0, v1

    .line 229
    .local v0, "dx":F
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y2:F

    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y1:F

    sub-float/2addr v1, v2

    .line 231
    .local v1, "dy":F
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch p1, :pswitch_data_0

    .line 235
    :pswitch_0
    move v2, v3

    goto :goto_0

    .line 233
    :pswitch_1
    cmpg-float v2, v1, v2

    if-gez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    goto :goto_0

    .line 234
    :pswitch_2
    cmpl-float v2, v1, v2

    if-lez v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    goto :goto_0

    .line 232
    :pswitch_3
    move v2, v4

    .line 231
    :goto_0
    nop

    .line 230
    nop

    .line 237
    .local v2, "isVertical":Z
    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v2, :cond_2

    const/high16 v6, -0x40800000    # -1.0f

    goto :goto_1

    :cond_2
    move v6, v5

    :goto_1
    iput v6, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->vertical:F

    .line 238
    iget v6, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time2:F

    iget v7, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time1:F

    sub-float/2addr v6, v7

    div-float/2addr v5, v6

    iput v5, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->oneOverDeltaTime:F

    .line 239
    const/16 v5, 0x65

    new-array v5, v5, [F

    iput-object v5, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->lut:[F

    .line 241
    const/4 v5, 0x3

    if-ne p1, v5, :cond_3

    move v3, v4

    .line 242
    .local v3, "isLinear":Z
    :cond_3
    if-nez v3, :cond_7

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const v5, 0x3a83126f    # 0.001f

    cmpg-float v4, v4, v5

    if-ltz v4, :cond_7

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpg-float v4, v4, v5

    if-gez v4, :cond_4

    goto :goto_4

    .line 251
    :cond_4
    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->vertical:F

    mul-float/2addr v4, v0

    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseA:F

    .line 252
    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->vertical:F

    neg-float v4, v4

    mul-float/2addr v4, v1

    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseB:F

    .line 253
    if-eqz v2, :cond_5

    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x2:F

    goto :goto_2

    :cond_5
    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x1:F

    :goto_2
    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseCenterX:F

    .line 254
    if-eqz v2, :cond_6

    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y1:F

    goto :goto_3

    :cond_6
    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y2:F

    :goto_3
    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseCenterY:F

    .line 255
    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x1:F

    iget v5, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y1:F

    iget v6, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x2:F

    iget v7, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y2:F

    invoke-virtual {p0, v4, v5, v6, v7}, Landroidx/compose/animation/core/ArcSpline$Arc;->buildTable$animation_core_release(FFFF)V

    .line 256
    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->arcDistance:F

    iget v5, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->oneOverDeltaTime:F

    mul-float/2addr v4, v5

    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->arcVelocity:F

    goto :goto_5

    .line 243
    :cond_7
    :goto_4
    const/4 v3, 0x1

    .line 244
    float-to-double v4, v1

    float-to-double v6, v0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    double-to-float v4, v4

    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->arcDistance:F

    .line 245
    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->arcDistance:F

    iget v5, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->oneOverDeltaTime:F

    mul-float/2addr v4, v5

    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->arcVelocity:F

    .line 246
    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->oneOverDeltaTime:F

    mul-float/2addr v4, v0

    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseCenterX:F

    .line 247
    iget v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->oneOverDeltaTime:F

    mul-float/2addr v4, v1

    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseCenterY:F

    .line 248
    const/high16 v4, 0x7fc00000    # Float.NaN

    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseA:F

    .line 249
    iput v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseB:F

    .line 258
    :goto_5
    iput-boolean v3, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->isLinear:Z

    .line 259
    .end local v0    # "dx":F
    .end local v1    # "dy":F
    .end local v2    # "isVertical":Z
    .end local v3    # "isLinear":Z
    nop

    .line 193
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final synthetic access$getTmpCosAngle$p(Landroidx/compose/animation/core/ArcSpline$Arc;)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/core/ArcSpline$Arc;

    .line 192
    iget v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->tmpCosAngle:F

    return v0
.end method

.method public static final synthetic access$getTmpSinAngle$p(Landroidx/compose/animation/core/ArcSpline$Arc;)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/core/ArcSpline$Arc;

    .line 192
    iget v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->tmpSinAngle:F

    return v0
.end method

.method private final calcAngle(F)F
    .locals 4
    .param p1, "time"    # F

    const/4 v0, 0x0

    .line 268
    .local v0, "$i$f$calcAngle":I
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->vertical:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time2:F

    sub-float/2addr v1, p1

    goto :goto_1

    :cond_1
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time1:F

    sub-float v1, p1, v1

    :goto_1
    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->oneOverDeltaTime:F

    mul-float/2addr v1, v2

    .line 269
    .local v1, "percent":F
    const v2, 0x3fc90fdb

    invoke-direct {p0, v1}, Landroidx/compose/animation/core/ArcSpline$Arc;->lookup(F)F

    move-result v3

    mul-float/2addr v3, v2

    return v3
.end method

.method private final lookup(F)F
    .locals 6
    .param p1, "v"    # F

    .line 307
    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_0

    .line 308
    return v0

    .line 310
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-ltz v1, :cond_1

    .line 311
    return v0

    .line 313
    :cond_1
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr v0, p1

    .line 314
    .local v0, "pos":F
    float-to-int v1, v0

    .line 315
    .local v1, "iv":I
    float-to-int v2, v0

    int-to-float v2, v2

    sub-float v2, v0, v2

    .line 316
    .local v2, "off":F
    iget-object v3, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->lut:[F

    aget v3, v3, v1

    iget-object v4, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->lut:[F

    add-int/lit8 v5, v1, 0x1

    aget v4, v4, v5

    iget-object v5, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->lut:[F

    aget v5, v5, v1

    sub-float/2addr v4, v5

    mul-float/2addr v4, v2

    add-float/2addr v3, v4

    return v3
.end method


# virtual methods
.method public final buildTable$animation_core_release(FFFF)V
    .locals 21
    .param p1, "x1"    # F
    .param p2, "y1"    # F
    .param p3, "x2"    # F
    .param p4, "y2"    # F

    .line 322
    move-object/from16 v0, p0

    sub-float v1, p3, p1

    .line 323
    .local v1, "a":F
    sub-float v2, p2, p4

    .line 324
    .local v2, "b":F
    const/4 v3, 0x0

    .line 325
    .local v3, "lx":F
    move v4, v2

    .line 326
    .local v4, "ly":F
    const/4 v5, 0x0

    .line 328
    .local v5, "dist":F
    invoke-static {}, Landroidx/compose/animation/core/ArcSplineKt;->access$getOurPercentCache$p()[F

    move-result-object v6

    .line 329
    .local v6, "ourPercent":[F
    array-length v7, v6

    add-int/lit8 v12, v7, -0x1

    .line 330
    .local v12, "lastIndex":I
    int-to-float v13, v12

    .line 331
    .local v13, "lastIndexFloat":F
    iget-object v14, v0, Landroidx/compose/animation/core/ArcSpline$Arc;->lut:[F

    .line 333
    .local v14, "lut":[F
    const/4 v7, 0x1

    .local v7, "i":I
    if-gt v7, v12, :cond_0

    .line 334
    :goto_0
    const-wide v8, 0x4056800000000000L    # 90.0

    int-to-double v10, v7

    mul-double/2addr v10, v8

    int-to-double v8, v12

    div-double/2addr v10, v8

    .local v10, "value$iv":D
    const/4 v8, 0x0

    .line 396
    .local v8, "$i$f$toRadians":I
    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    .line 334
    .end local v8    # "$i$f$toRadians":I
    .end local v10    # "value$iv":D
    double-to-float v8, v8

    .line 335
    .local v8, "angle":F
    float-to-double v9, v8

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    double-to-float v9, v9

    .line 336
    .local v9, "s":F
    float-to-double v10, v8

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    double-to-float v10, v10

    .line 337
    .local v10, "c":F
    mul-float v11, v1, v9

    .line 338
    .local v11, "px":F
    mul-float v15, v2, v10

    .line 339
    .local v15, "py":F
    move/from16 v16, v1

    .end local v1    # "a":F
    .local v16, "a":F
    sub-float v1, v11, v3

    move/from16 v17, v2

    .end local v2    # "b":F
    .local v17, "b":F
    float-to-double v1, v1

    move/from16 v18, v3

    .end local v3    # "lx":F
    .local v18, "lx":F
    sub-float v3, v15, v4

    move/from16 v19, v4

    .end local v4    # "ly":F
    .local v19, "ly":F
    float-to-double v3, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v1

    double-to-float v1, v1

    add-float/2addr v5, v1

    .line 340
    aput v5, v6, v7

    .line 341
    move v3, v11

    .line 342
    .end local v18    # "lx":F
    .restart local v3    # "lx":F
    move v4, v15

    .line 333
    .end local v8    # "angle":F
    .end local v9    # "s":F
    .end local v10    # "c":F
    .end local v11    # "px":F
    .end local v15    # "py":F
    .end local v19    # "ly":F
    .restart local v4    # "ly":F
    if-eq v7, v12, :cond_1

    add-int/lit8 v7, v7, 0x1

    move/from16 v1, v16

    move/from16 v2, v17

    goto :goto_0

    .end local v16    # "a":F
    .end local v17    # "b":F
    .restart local v1    # "a":F
    .restart local v2    # "b":F
    :cond_0
    move/from16 v16, v1

    move/from16 v17, v2

    .line 345
    .end local v1    # "a":F
    .end local v2    # "b":F
    .end local v7    # "i":I
    .restart local v16    # "a":F
    .restart local v17    # "b":F
    :cond_1
    iput v5, v0, Landroidx/compose/animation/core/ArcSpline$Arc;->arcDistance:F

    .line 346
    const/4 v1, 0x1

    .local v1, "i":I
    if-gt v1, v12, :cond_2

    .line 347
    :goto_1
    aget v2, v6, v1

    div-float/2addr v2, v5

    aput v2, v6, v1

    .line 346
    if-eq v1, v12, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 350
    .end local v1    # "i":I
    :cond_2
    const/high16 v1, 0x42c80000    # 100.0f

    .line 351
    .local v1, "lutLastIndex":F
    const/4 v2, 0x0

    .local v2, "i":I
    array-length v15, v14

    :goto_2
    if-ge v2, v15, :cond_5

    .line 352
    int-to-float v7, v2

    div-float/2addr v7, v1

    .line 353
    .local v7, "pos":F
    const/16 v18, 0x0

    .line 397
    .local v18, "$i$f$binarySearch":I
    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/collections/ArraysKt;->binarySearch$default([FFIIILjava/lang/Object;)I

    move-result v8

    .line 353
    .end local v18    # "$i$f$binarySearch":I
    nop

    .line 354
    .local v8, "index":I
    if-ltz v8, :cond_3

    .line 355
    int-to-float v9, v8

    div-float/2addr v9, v13

    aput v9, v14, v2

    goto :goto_3

    .line 356
    :cond_3
    const/4 v9, -0x1

    if-ne v8, v9, :cond_4

    .line 357
    const/4 v9, 0x0

    aput v9, v14, v2

    goto :goto_3

    .line 359
    :cond_4
    neg-int v9, v8

    add-int/lit8 v9, v9, -0x2

    .line 360
    .local v9, "p1":I
    neg-int v10, v8

    add-int/lit8 v10, v10, -0x1

    .line 362
    .local v10, "p2":I
    int-to-float v11, v9

    aget v18, v6, v9

    sub-float v18, v7, v18

    aget v19, v6, v10

    aget v20, v6, v9

    sub-float v19, v19, v20

    div-float v18, v18, v19

    add-float v11, v11, v18

    .line 363
    nop

    .line 362
    div-float/2addr v11, v13

    .line 361
    nop

    .line 364
    .local v11, "ans":F
    aput v11, v14, v2

    .line 351
    .end local v7    # "pos":F
    .end local v8    # "index":I
    .end local v9    # "p1":I
    .end local v10    # "p2":I
    .end local v11    # "ans":F
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 367
    .end local v2    # "i":I
    :cond_5
    return-void
.end method

.method public final calcDX()F
    .locals 7

    .line 281
    iget v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseA:F

    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->tmpCosAngle:F

    mul-float/2addr v0, v1

    .line 282
    .local v0, "vx":F
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseB:F

    neg-float v1, v1

    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->tmpSinAngle:F

    mul-float/2addr v1, v2

    .line 283
    .local v1, "vy":F
    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->arcVelocity:F

    float-to-double v3, v0

    float-to-double v5, v1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v3

    double-to-float v3, v3

    div-float/2addr v2, v3

    .line 284
    .local v2, "norm":F
    iget v3, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->vertical:F

    mul-float/2addr v3, v0

    mul-float/2addr v3, v2

    return v3
.end method

.method public final calcDY()F
    .locals 7

    .line 288
    iget v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseA:F

    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->tmpCosAngle:F

    mul-float/2addr v0, v1

    .line 289
    .local v0, "vx":F
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseB:F

    neg-float v1, v1

    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->tmpSinAngle:F

    mul-float/2addr v1, v2

    .line 290
    .local v1, "vy":F
    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->arcVelocity:F

    float-to-double v3, v0

    float-to-double v5, v1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v3

    double-to-float v3, v3

    div-float/2addr v2, v3

    .line 291
    .local v2, "norm":F
    iget v3, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->vertical:F

    mul-float/2addr v3, v1

    mul-float/2addr v3, v2

    return v3
.end method

.method public final calcX()F
    .locals 4

    const/4 v0, 0x0

    .line 273
    .local v0, "$i$f$calcX":I
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseCenterX:F

    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseA:F

    invoke-static {p0}, Landroidx/compose/animation/core/ArcSpline$Arc;->access$getTmpSinAngle$p(Landroidx/compose/animation/core/ArcSpline$Arc;)F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    return v1
.end method

.method public final calcY()F
    .locals 4

    const/4 v0, 0x0

    .line 277
    .local v0, "$i$f$calcY":I
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseCenterY:F

    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseB:F

    invoke-static {p0}, Landroidx/compose/animation/core/ArcSpline$Arc;->access$getTmpCosAngle$p(Landroidx/compose/animation/core/ArcSpline$Arc;)F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    return v1
.end method

.method public final getLinearDX$animation_core_release()F
    .locals 2

    const/4 v0, 0x0

    .line 222
    .local v0, "$i$f$getLinearDX$animation_core_release":I
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseCenterX:F

    return v1
.end method

.method public final getLinearDY$animation_core_release()F
    .locals 2

    const/4 v0, 0x0

    .line 225
    .local v0, "$i$f$getLinearDY$animation_core_release":I
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->ellipseCenterY:F

    return v1
.end method

.method public final getLinearX(F)F
    .locals 4
    .param p1, "time"    # F

    .line 295
    move v0, p1

    .line 296
    .local v0, "t":F
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time1:F

    sub-float v1, v0, v1

    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->oneOverDeltaTime:F

    mul-float/2addr v1, v2

    .line 297
    .end local v0    # "t":F
    .local v1, "t":F
    iget v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x1:F

    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x2:F

    iget v3, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->x1:F

    sub-float/2addr v2, v3

    mul-float/2addr v2, v1

    add-float/2addr v0, v2

    return v0
.end method

.method public final getLinearY(F)F
    .locals 4
    .param p1, "time"    # F

    .line 301
    move v0, p1

    .line 302
    .local v0, "t":F
    iget v1, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time1:F

    sub-float v1, v0, v1

    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->oneOverDeltaTime:F

    mul-float/2addr v1, v2

    .line 303
    .end local v0    # "t":F
    .local v1, "t":F
    iget v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y1:F

    iget v2, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y2:F

    iget v3, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->y1:F

    sub-float/2addr v2, v3

    mul-float/2addr v2, v1

    add-float/2addr v0, v2

    return v0
.end method

.method public final getTime1()F
    .locals 1

    .line 195
    iget v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time1:F

    return v0
.end method

.method public final getTime2()F
    .locals 1

    .line 196
    iget v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->time2:F

    return v0
.end method

.method public final setPoint(F)V
    .locals 5
    .param p1, "time"    # F

    .line 262
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/animation/core/ArcSpline$Arc;
    const/4 v1, 0x0

    .line 394
    .local v1, "$i$f$calcAngle":I
    iget v2, v0, Landroidx/compose/animation/core/ArcSpline$Arc;->vertical:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpg-float v2, v2, v3

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    iget v2, v0, Landroidx/compose/animation/core/ArcSpline$Arc;->time2:F

    sub-float/2addr v2, p1

    goto :goto_1

    :cond_1
    iget v2, v0, Landroidx/compose/animation/core/ArcSpline$Arc;->time1:F

    sub-float v2, p1, v2

    :goto_1
    iget v3, v0, Landroidx/compose/animation/core/ArcSpline$Arc;->oneOverDeltaTime:F

    mul-float/2addr v2, v3

    .line 395
    .local v2, "percent$iv":F
    const v3, 0x3fc90fdb

    invoke-direct {v0, v2}, Landroidx/compose/animation/core/ArcSpline$Arc;->lookup(F)F

    move-result v4

    mul-float/2addr v4, v3

    .line 262
    .end local v0    # "this_$iv":Landroidx/compose/animation/core/ArcSpline$Arc;
    .end local v1    # "$i$f$calcAngle":I
    .end local v2    # "percent$iv":F
    nop

    .line 263
    .local v4, "angle":F
    float-to-double v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->tmpSinAngle:F

    .line 264
    float-to-double v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Landroidx/compose/animation/core/ArcSpline$Arc;->tmpCosAngle:F

    .line 265
    return-void
.end method
