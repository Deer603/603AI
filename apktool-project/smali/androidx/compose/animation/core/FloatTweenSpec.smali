.class public final Landroidx/compose/animation/core/FloatTweenSpec;
.super Ljava/lang/Object;
.source "FloatAnimationSpec.kt"

# interfaces
.implements Landroidx/compose/animation/core/FloatAnimationSpec;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFloatAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n*L\n1#1,260:1\n223#1:261\n223#1:283\n119#2,10:262\n119#2,10:273\n119#2,10:284\n71#3:272\n*S KotlinDebug\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n*L\n216#1:261\n244#1:283\n216#1:262,10\n223#1:273,10\n244#1:284,10\n219#1:272\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0082\u0008J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\tR\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/animation/core/FloatTweenSpec;",
        "Landroidx/compose/animation/core/FloatAnimationSpec;",
        "duration",
        "",
        "delay",
        "easing",
        "Landroidx/compose/animation/core/Easing;",
        "(IILandroidx/compose/animation/core/Easing;)V",
        "getDelay",
        "()I",
        "delayNanos",
        "",
        "getDuration",
        "durationNanos",
        "clampPlayTimeNanos",
        "playTimeNanos",
        "getDurationNanos",
        "initialValue",
        "",
        "targetValue",
        "initialVelocity",
        "getValueFromNanos",
        "getVelocityFromNanos",
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
.field private final delay:I

.field private final delayNanos:J

.field private final duration:I

.field private final durationNanos:J

.field private final easing:Landroidx/compose/animation/core/Easing;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/animation/core/FloatTweenSpec;-><init>(IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IILandroidx/compose/animation/core/Easing;)V
    .locals 4
    .param p1, "duration"    # I
    .param p2, "delay"    # I
    .param p3, "easing"    # Landroidx/compose/animation/core/Easing;

    .line 201
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 202
    iput p1, p0, Landroidx/compose/animation/core/FloatTweenSpec;->duration:I

    .line 203
    iput p2, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delay:I

    .line 204
    iput-object p3, p0, Landroidx/compose/animation/core/FloatTweenSpec;->easing:Landroidx/compose/animation/core/Easing;

    .line 206
    iget v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->duration:I

    int-to-long v0, v0

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->durationNanos:J

    .line 208
    iget v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delay:I

    int-to-long v0, v0

    mul-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delayNanos:J

    .line 201
    return-void
.end method

.method public synthetic constructor <init>(IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 201
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 202
    const/16 p1, 0x12c

    .line 201
    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 203
    const/4 p2, 0x0

    .line 201
    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 204
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getFastOutSlowInEasing()Landroidx/compose/animation/core/Easing;

    move-result-object p3

    .line 201
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/animation/core/FloatTweenSpec;-><init>(IILandroidx/compose/animation/core/Easing;)V

    .line 205
    return-void
.end method

.method private final clampPlayTimeNanos(J)J
    .locals 12
    .param p1, "playTimeNanos"    # J

    const/4 v0, 0x0

    .line 223
    .local v0, "$i$f$clampPlayTimeNanos":I
    iget-wide v1, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delayNanos:J

    sub-long v1, p1, v1

    .local v1, "$this$fastCoerceIn$iv":J
    const-wide/16 v3, 0x0

    .local v3, "minimumValue$iv":J
    iget-wide v5, p0, Landroidx/compose/animation/core/FloatTweenSpec;->durationNanos:J

    .local v5, "maximumValue$iv":J
    const/4 v7, 0x0

    .line 273
    .local v7, "$i$f$fastCoerceIn":I
    move-wide v8, v1

    .local v8, "$this$fastCoerceAtLeast$iv$iv":J
    const/4 v10, 0x0

    .line 277
    .local v10, "$i$f$fastCoerceAtLeast":I
    cmp-long v11, v8, v3

    if-gez v11, :cond_0

    move-wide v8, v3

    .line 273
    .end local v8    # "$this$fastCoerceAtLeast$iv$iv":J
    .end local v10    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    nop

    .local v8, "$this$fastCoerceAtMost$iv$iv":J
    const/4 v10, 0x0

    .line 282
    .local v10, "$i$f$fastCoerceAtMost":I
    cmp-long v11, v8, v5

    if-lez v11, :cond_1

    move-wide v8, v5

    .line 273
    .end local v8    # "$this$fastCoerceAtMost$iv$iv":J
    .end local v10    # "$i$f$fastCoerceAtMost":I
    :cond_1
    nop

    .line 223
    .end local v1    # "$this$fastCoerceIn$iv":J
    .end local v3    # "minimumValue$iv":J
    .end local v5    # "maximumValue$iv":J
    .end local v7    # "$i$f$fastCoerceIn":I
    return-wide v8
.end method


# virtual methods
.method public final getDelay()I
    .locals 1

    .line 203
    iget v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delay:I

    return v0
.end method

.method public final getDuration()I
    .locals 1

    .line 202
    iget v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->duration:I

    return v0
.end method

.method public getDurationNanos(FFF)J
    .locals 4
    .param p1, "initialValue"    # F
    .param p2, "targetValue"    # F
    .param p3, "initialVelocity"    # F

    .line 232
    iget-wide v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->delayNanos:J

    iget-wide v2, p0, Landroidx/compose/animation/core/FloatTweenSpec;->durationNanos:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public getValueFromNanos(JFFF)F
    .locals 13
    .param p1, "playTimeNanos"    # J
    .param p3, "initialValue"    # F
    .param p4, "targetValue"    # F
    .param p5, "initialVelocity"    # F

    .line 216
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/animation/core/FloatTweenSpec;
    const/4 v1, 0x0

    .line 261
    .local v1, "$i$f$clampPlayTimeNanos":I
    iget-wide v2, v0, Landroidx/compose/animation/core/FloatTweenSpec;->delayNanos:J

    sub-long v2, p1, v2

    .local v2, "$this$fastCoerceIn$iv$iv":J
    const-wide/16 v4, 0x0

    .local v4, "minimumValue$iv$iv":J
    iget-wide v6, v0, Landroidx/compose/animation/core/FloatTweenSpec;->durationNanos:J

    .local v6, "maximumValue$iv$iv":J
    const/4 v8, 0x0

    .line 262
    .local v8, "$i$f$fastCoerceIn":I
    move-wide v9, v2

    .local v9, "$this$fastCoerceAtLeast$iv$iv$iv":J
    const/4 v11, 0x0

    .line 266
    .local v11, "$i$f$fastCoerceAtLeast":I
    cmp-long v12, v9, v4

    if-gez v12, :cond_0

    move-wide v9, v4

    .line 262
    .end local v9    # "$this$fastCoerceAtLeast$iv$iv$iv":J
    .end local v11    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    nop

    .local v9, "$this$fastCoerceAtMost$iv$iv$iv":J
    const/4 v11, 0x0

    .line 271
    .local v11, "$i$f$fastCoerceAtMost":I
    cmp-long v12, v9, v6

    if-lez v12, :cond_1

    move-wide v9, v6

    .line 262
    .end local v9    # "$this$fastCoerceAtMost$iv$iv$iv":J
    .end local v11    # "$i$f$fastCoerceAtMost":I
    :cond_1
    nop

    .line 261
    .end local v2    # "$this$fastCoerceIn$iv$iv":J
    .end local v4    # "minimumValue$iv$iv":J
    .end local v6    # "maximumValue$iv$iv":J
    .end local v8    # "$i$f$fastCoerceIn":I
    nop

    .line 216
    .end local v0    # "this_$iv":Landroidx/compose/animation/core/FloatTweenSpec;
    .end local v1    # "$i$f$clampPlayTimeNanos":I
    nop

    .line 217
    .local v9, "clampedPlayTimeNanos":J
    iget v0, p0, Landroidx/compose/animation/core/FloatTweenSpec;->duration:I

    const/high16 v1, 0x3f800000    # 1.0f

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    long-to-float v0, v9

    iget-wide v2, p0, Landroidx/compose/animation/core/FloatTweenSpec;->durationNanos:J

    long-to-float v2, v2

    div-float/2addr v0, v2

    .line 218
    .local v0, "rawFraction":F
    :goto_0
    iget-object v2, p0, Landroidx/compose/animation/core/FloatTweenSpec;->easing:Landroidx/compose/animation/core/Easing;

    invoke-interface {v2, v0}, Landroidx/compose/animation/core/Easing;->transform(F)F

    move-result v2

    .line 219
    .local v2, "fraction":F
    const/4 v3, 0x0

    .line 272
    .local v3, "$i$f$lerp":I
    sub-float/2addr v1, v2

    mul-float v1, v1, p3

    mul-float v4, p4, v2

    add-float/2addr v1, v4

    .line 219
    .end local v3    # "$i$f$lerp":I
    return v1
.end method

.method public getVelocityFromNanos(JFFF)F
    .locals 17
    .param p1, "playTimeNanos"    # J
    .param p3, "initialValue"    # F
    .param p4, "targetValue"    # F
    .param p5, "initialVelocity"    # F

    .line 244
    move-object/from16 v0, p0

    .local v0, "this_$iv":Landroidx/compose/animation/core/FloatTweenSpec;
    const/4 v1, 0x0

    .line 283
    .local v1, "$i$f$clampPlayTimeNanos":I
    iget-wide v2, v0, Landroidx/compose/animation/core/FloatTweenSpec;->delayNanos:J

    sub-long v2, p1, v2

    .local v2, "$this$fastCoerceIn$iv$iv":J
    const-wide/16 v4, 0x0

    .local v4, "minimumValue$iv$iv":J
    iget-wide v6, v0, Landroidx/compose/animation/core/FloatTweenSpec;->durationNanos:J

    .local v6, "maximumValue$iv$iv":J
    const/4 v8, 0x0

    .line 284
    .local v8, "$i$f$fastCoerceIn":I
    move-wide v9, v2

    .local v9, "$this$fastCoerceAtLeast$iv$iv$iv":J
    const/4 v11, 0x0

    .line 288
    .local v11, "$i$f$fastCoerceAtLeast":I
    cmp-long v12, v9, v4

    if-gez v12, :cond_0

    move-wide v9, v4

    .line 284
    .end local v9    # "$this$fastCoerceAtLeast$iv$iv$iv":J
    .end local v11    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    nop

    .local v9, "$this$fastCoerceAtMost$iv$iv$iv":J
    const/4 v11, 0x0

    .line 293
    .local v11, "$i$f$fastCoerceAtMost":I
    cmp-long v12, v9, v6

    if-lez v12, :cond_1

    move-wide v9, v6

    .line 284
    .end local v9    # "$this$fastCoerceAtMost$iv$iv$iv":J
    .end local v11    # "$i$f$fastCoerceAtMost":I
    :cond_1
    nop

    .line 283
    .end local v2    # "$this$fastCoerceIn$iv$iv":J
    .end local v4    # "minimumValue$iv$iv":J
    .end local v6    # "maximumValue$iv$iv":J
    .end local v8    # "$i$f$fastCoerceIn":I
    nop

    .line 244
    .end local v0    # "this_$iv":Landroidx/compose/animation/core/FloatTweenSpec;
    .end local v1    # "$i$f$clampPlayTimeNanos":I
    move-wide v12, v9

    .line 245
    .local v12, "clampedPlayTimeNanos":J
    const-wide/16 v0, 0x0

    cmp-long v0, v12, v0

    if-nez v0, :cond_2

    .line 246
    return p5

    .line 249
    :cond_2
    nop

    .line 250
    const-wide/32 v0, 0xf4240

    sub-long v3, v12, v0

    .line 251
    nop

    .line 252
    nop

    .line 253
    nop

    .line 249
    move-object/from16 v2, p0

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    invoke-virtual/range {v2 .. v7}, Landroidx/compose/animation/core/FloatTweenSpec;->getValueFromNanos(JFFF)F

    move-result v0

    .line 248
    nop

    .line 256
    .local v0, "startNum":F
    move-object/from16 v11, p0

    move/from16 v14, p3

    move/from16 v15, p4

    move/from16 v16, p5

    invoke-virtual/range {v11 .. v16}, Landroidx/compose/animation/core/FloatTweenSpec;->getValueFromNanos(JFFF)F

    move-result v1

    .line 255
    nop

    .line 257
    .local v1, "endNum":F
    sub-float v2, v1, v0

    const/high16 v3, 0x447a0000    # 1000.0f

    mul-float/2addr v2, v3

    return v2
.end method
