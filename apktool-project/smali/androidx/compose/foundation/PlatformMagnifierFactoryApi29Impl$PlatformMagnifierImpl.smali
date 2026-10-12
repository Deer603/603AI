.class public final Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;
.super Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;
.source "PlatformMagnifier.android.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PlatformMagnifierImpl"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,189:1\n273#2:190\n65#3:191\n69#3:194\n65#3:196\n69#3:199\n60#4:192\n70#4:195\n60#4:197\n70#4:200\n22#5:193\n22#5:198\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl\n*L\n180#1:190\n181#1:191\n181#1:194\n184#1:196\n184#1:199\n181#1:192\n181#1:195\n184#1:197\n184#1:200\n181#1:193\n184#1:198\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;",
        "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;",
        "magnifier",
        "Landroid/widget/Magnifier;",
        "(Landroid/widget/Magnifier;)V",
        "update",
        "",
        "sourceCenter",
        "Landroidx/compose/ui/geometry/Offset;",
        "magnifierCenter",
        "zoom",
        "",
        "update-Wko1d7g",
        "(JJF)V",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/widget/Magnifier;)V
    .locals 0
    .param p1, "magnifier"    # Landroid/widget/Magnifier;

    .line 175
    invoke-direct {p0, p1}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;-><init>(Landroid/widget/Magnifier;)V

    .line 174
    return-void
.end method


# virtual methods
.method public update-Wko1d7g(JJF)V
    .locals 13
    .param p1, "sourceCenter"    # J
    .param p3, "magnifierCenter"    # J
    .param p5, "zoom"    # F

    .line 178
    invoke-static/range {p5 .. p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;->getMagnifier()Landroid/widget/Magnifier;

    move-result-object v0

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Landroid/widget/Magnifier;->setZoom(F)V

    goto :goto_0

    :cond_0
    move/from16 v1, p5

    .line 180
    :goto_0
    move-wide/from16 v2, p3

    .local v2, "$this$isSpecified$iv":J
    const/4 v0, 0x0

    .line 190
    .local v0, "$i$f$isSpecified-k-4lQ0M":I
    const-wide v4, 0x7fffffff7fffffffL

    and-long/2addr v4, v2

    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v4, v4, v6

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 180
    .end local v0    # "$i$f$isSpecified-k-4lQ0M":I
    .end local v2    # "$this$isSpecified$iv":J
    :goto_1
    const-wide v2, 0xffffffffL

    const/16 v0, 0x20

    if-eqz v4, :cond_2

    .line 181
    invoke-virtual {p0}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;->getMagnifier()Landroid/widget/Magnifier;

    move-result-object v4

    const/4 v5, 0x0

    .line 191
    .local v5, "$i$f$getX-impl":I
    move-wide v6, p1

    .local v6, "value$iv$iv":J
    const/4 v8, 0x0

    .line 192
    .local v8, "$i$f$unpackFloat1":I
    shr-long v9, v6, v0

    long-to-int v9, v9

    .local v9, "bits$iv$iv$iv":I
    const/4 v10, 0x0

    .line 193
    .local v10, "$i$f$floatFromBits":I
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    .line 192
    .end local v9    # "bits$iv$iv$iv":I
    .end local v10    # "$i$f$floatFromBits":I
    nop

    .line 191
    .end local v6    # "value$iv$iv":J
    .end local v8    # "$i$f$unpackFloat1":I
    nop

    .line 181
    .end local v5    # "$i$f$getX-impl":I
    const/4 v5, 0x0

    .line 194
    .local v5, "$i$f$getY-impl":I
    nop

    .restart local v6    # "value$iv$iv":J
    const/4 v8, 0x0

    .line 195
    .local v8, "$i$f$unpackFloat2":I
    and-long v10, v6, v2

    long-to-int v10, v10

    .local v10, "bits$iv$iv$iv":I
    const/4 v11, 0x0

    .line 193
    .local v11, "$i$f$floatFromBits":I
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    .line 195
    .end local v10    # "bits$iv$iv$iv":I
    .end local v11    # "$i$f$floatFromBits":I
    nop

    .line 194
    .end local v6    # "value$iv$iv":J
    .end local v8    # "$i$f$unpackFloat2":I
    nop

    .line 181
    .end local v5    # "$i$f$getY-impl":I
    const/4 v5, 0x0

    .line 191
    .local v5, "$i$f$getX-impl":I
    move-wide/from16 v6, p3

    .restart local v6    # "value$iv$iv":J
    const/4 v8, 0x0

    .line 192
    .local v8, "$i$f$unpackFloat1":I
    shr-long v11, v6, v0

    long-to-int v0, v11

    .local v0, "bits$iv$iv$iv":I
    const/4 v11, 0x0

    .line 193
    .restart local v11    # "$i$f$floatFromBits":I
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 192
    .end local v0    # "bits$iv$iv$iv":I
    .end local v11    # "$i$f$floatFromBits":I
    nop

    .line 191
    .end local v6    # "value$iv$iv":J
    .end local v8    # "$i$f$unpackFloat1":I
    nop

    .line 181
    .end local v5    # "$i$f$getX-impl":I
    const/4 v5, 0x0

    .line 194
    .local v5, "$i$f$getY-impl":I
    nop

    .restart local v6    # "value$iv$iv":J
    const/4 v8, 0x0

    .line 195
    .local v8, "$i$f$unpackFloat2":I
    and-long/2addr v2, v6

    long-to-int v2, v2

    .local v2, "bits$iv$iv$iv":I
    const/4 v3, 0x0

    .line 193
    .local v3, "$i$f$floatFromBits":I
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 195
    .end local v2    # "bits$iv$iv$iv":I
    .end local v3    # "$i$f$floatFromBits":I
    nop

    .line 194
    .end local v6    # "value$iv$iv":J
    .end local v8    # "$i$f$unpackFloat2":I
    nop

    .line 181
    .end local v5    # "$i$f$getY-impl":I
    invoke-virtual {v4, v9, v10, v0, v2}, Landroid/widget/Magnifier;->show(FFFF)V

    goto :goto_2

    .line 184
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;->getMagnifier()Landroid/widget/Magnifier;

    move-result-object v4

    const/4 v5, 0x0

    .line 196
    .local v5, "$i$f$getX-impl":I
    move-wide v6, p1

    .restart local v6    # "value$iv$iv":J
    const/4 v8, 0x0

    .line 197
    .local v8, "$i$f$unpackFloat1":I
    shr-long v9, v6, v0

    long-to-int v0, v9

    .restart local v0    # "bits$iv$iv$iv":I
    const/4 v9, 0x0

    .line 198
    .local v9, "$i$f$floatFromBits":I
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 197
    .end local v0    # "bits$iv$iv$iv":I
    .end local v9    # "$i$f$floatFromBits":I
    nop

    .line 196
    .end local v6    # "value$iv$iv":J
    .end local v8    # "$i$f$unpackFloat1":I
    nop

    .line 184
    .end local v5    # "$i$f$getX-impl":I
    const/4 v5, 0x0

    .line 199
    .local v5, "$i$f$getY-impl":I
    nop

    .restart local v6    # "value$iv$iv":J
    const/4 v8, 0x0

    .line 200
    .local v8, "$i$f$unpackFloat2":I
    and-long/2addr v2, v6

    long-to-int v2, v2

    .restart local v2    # "bits$iv$iv$iv":I
    const/4 v3, 0x0

    .line 198
    .restart local v3    # "$i$f$floatFromBits":I
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 200
    .end local v2    # "bits$iv$iv$iv":I
    .end local v3    # "$i$f$floatFromBits":I
    nop

    .line 199
    .end local v6    # "value$iv$iv":J
    .end local v8    # "$i$f$unpackFloat2":I
    nop

    .line 184
    .end local v5    # "$i$f$getY-impl":I
    invoke-virtual {v4, v0, v2}, Landroid/widget/Magnifier;->show(FF)V

    .line 186
    :goto_2
    return-void
.end method
