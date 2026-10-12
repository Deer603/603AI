.class public final Landroidx/compose/ui/layout/ContentScaleKt;
.super Ljava/lang/Object;
.source "ContentScale.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,159:1\n155#1:160\n158#1:164\n155#1:168\n158#1:172\n57#2:161\n61#2:165\n57#2:169\n61#2:173\n57#2:176\n61#2:179\n60#3:162\n70#3:166\n60#3:170\n70#3:174\n60#3:177\n70#3:180\n22#4:163\n22#4:167\n22#4:171\n22#4:175\n22#4:178\n22#4:181\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n*L\n143#1:160\n144#1:164\n149#1:168\n150#1:172\n143#1:161\n144#1:165\n149#1:169\n150#1:173\n155#1:176\n158#1:179\n143#1:162\n144#1:166\n149#1:170\n150#1:174\n155#1:177\n158#1:180\n143#1:163\n144#1:167\n149#1:171\n150#1:175\n155#1:178\n158#1:181\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0006\u001a\"\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\u0006\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\r"
    }
    d2 = {
        "computeFillHeight",
        "",
        "srcSize",
        "Landroidx/compose/ui/geometry/Size;",
        "dstSize",
        "computeFillHeight-iLBOSCw",
        "(JJ)F",
        "computeFillMaxDimension",
        "computeFillMaxDimension-iLBOSCw",
        "computeFillMinDimension",
        "computeFillMinDimension-iLBOSCw",
        "computeFillWidth",
        "computeFillWidth-iLBOSCw",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$computeFillMaxDimension-iLBOSCw(JJ)F
    .locals 1
    .param p0, "srcSize"    # J
    .param p2, "dstSize"    # J

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/ContentScaleKt;->computeFillMaxDimension-iLBOSCw(JJ)F

    move-result v0

    return v0
.end method

.method public static final synthetic access$computeFillMinDimension-iLBOSCw(JJ)F
    .locals 1
    .param p0, "srcSize"    # J
    .param p2, "dstSize"    # J

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/ContentScaleKt;->computeFillMinDimension-iLBOSCw(JJ)F

    move-result v0

    return v0
.end method

.method private static final computeFillHeight-iLBOSCw(JJ)F
    .locals 9
    .param p0, "srcSize"    # J
    .param p2, "dstSize"    # J

    const/4 v0, 0x0

    .line 158
    .local v0, "$i$f$computeFillHeight-iLBOSCw":I
    const/4 v1, 0x0

    .line 179
    .local v1, "$i$f$getHeight-impl":I
    move-wide v2, p2

    .local v2, "value$iv$iv":J
    const/4 v4, 0x0

    .line 180
    .local v4, "$i$f$unpackFloat2":I
    const-wide v5, 0xffffffffL

    and-long v7, v2, v5

    long-to-int v7, v7

    .local v7, "bits$iv$iv$iv":I
    const/4 v8, 0x0

    .line 181
    .local v8, "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 180
    .end local v7    # "bits$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 179
    .end local v2    # "value$iv$iv":J
    .end local v4    # "$i$f$unpackFloat2":I
    nop

    .line 158
    .end local v1    # "$i$f$getHeight-impl":I
    const/4 v1, 0x0

    .line 179
    .restart local v1    # "$i$f$getHeight-impl":I
    move-wide v2, p0

    .restart local v2    # "value$iv$iv":J
    const/4 v4, 0x0

    .line 180
    .restart local v4    # "$i$f$unpackFloat2":I
    and-long/2addr v5, v2

    long-to-int v5, v5

    .local v5, "bits$iv$iv$iv":I
    const/4 v6, 0x0

    .line 181
    .local v6, "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 180
    .end local v5    # "bits$iv$iv$iv":I
    .end local v6    # "$i$f$floatFromBits":I
    nop

    .line 179
    .end local v2    # "value$iv$iv":J
    .end local v4    # "$i$f$unpackFloat2":I
    nop

    .line 158
    .end local v1    # "$i$f$getHeight-impl":I
    div-float/2addr v7, v5

    return v7
.end method

.method private static final computeFillMaxDimension-iLBOSCw(JJ)F
    .locals 11
    .param p0, "srcSize"    # J
    .param p2, "dstSize"    # J

    .line 143
    const/4 v0, 0x0

    .line 160
    .local v0, "$i$f$computeFillWidth-iLBOSCw":I
    const/4 v1, 0x0

    .line 161
    .local v1, "$i$f$getWidth-impl":I
    move-wide v2, p2

    .local v2, "value$iv$iv$iv":J
    const/4 v4, 0x0

    .line 162
    .local v4, "$i$f$unpackFloat1":I
    const/16 v5, 0x20

    shr-long v6, v2, v5

    long-to-int v6, v6

    .local v6, "bits$iv$iv$iv$iv":I
    const/4 v7, 0x0

    .line 163
    .local v7, "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 162
    .end local v6    # "bits$iv$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 161
    .end local v2    # "value$iv$iv$iv":J
    .end local v4    # "$i$f$unpackFloat1":I
    nop

    .line 160
    .end local v1    # "$i$f$getWidth-impl":I
    const/4 v1, 0x0

    .line 161
    .restart local v1    # "$i$f$getWidth-impl":I
    move-wide v2, p0

    .restart local v2    # "value$iv$iv$iv":J
    const/4 v4, 0x0

    .line 162
    .restart local v4    # "$i$f$unpackFloat1":I
    shr-long v7, v2, v5

    long-to-int v5, v7

    .local v5, "bits$iv$iv$iv$iv":I
    const/4 v7, 0x0

    .line 163
    .restart local v7    # "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 162
    .end local v5    # "bits$iv$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 161
    .end local v2    # "value$iv$iv$iv":J
    .end local v4    # "$i$f$unpackFloat1":I
    nop

    .line 160
    .end local v1    # "$i$f$getWidth-impl":I
    div-float/2addr v6, v5

    .line 143
    .end local v0    # "$i$f$computeFillWidth-iLBOSCw":I
    nop

    .line 144
    .local v6, "widthScale":F
    const/4 v0, 0x0

    .line 164
    .local v0, "$i$f$computeFillHeight-iLBOSCw":I
    const/4 v1, 0x0

    .line 165
    .local v1, "$i$f$getHeight-impl":I
    move-wide v2, p2

    .restart local v2    # "value$iv$iv$iv":J
    const/4 v4, 0x0

    .line 166
    .local v4, "$i$f$unpackFloat2":I
    const-wide v7, 0xffffffffL

    and-long v9, v2, v7

    long-to-int v5, v9

    .restart local v5    # "bits$iv$iv$iv$iv":I
    const/4 v9, 0x0

    .line 167
    .local v9, "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 166
    .end local v5    # "bits$iv$iv$iv$iv":I
    .end local v9    # "$i$f$floatFromBits":I
    nop

    .line 165
    .end local v2    # "value$iv$iv$iv":J
    .end local v4    # "$i$f$unpackFloat2":I
    nop

    .line 164
    .end local v1    # "$i$f$getHeight-impl":I
    const/4 v1, 0x0

    .line 165
    .restart local v1    # "$i$f$getHeight-impl":I
    move-wide v2, p0

    .restart local v2    # "value$iv$iv$iv":J
    const/4 v4, 0x0

    .line 166
    .restart local v4    # "$i$f$unpackFloat2":I
    and-long/2addr v7, v2

    long-to-int v7, v7

    .local v7, "bits$iv$iv$iv$iv":I
    const/4 v8, 0x0

    .line 167
    .local v8, "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 166
    .end local v7    # "bits$iv$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 165
    .end local v2    # "value$iv$iv$iv":J
    .end local v4    # "$i$f$unpackFloat2":I
    nop

    .line 164
    .end local v1    # "$i$f$getHeight-impl":I
    div-float/2addr v5, v7

    .line 144
    .end local v0    # "$i$f$computeFillHeight-iLBOSCw":I
    nop

    .line 145
    .local v5, "heightScale":F
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method private static final computeFillMinDimension-iLBOSCw(JJ)F
    .locals 11
    .param p0, "srcSize"    # J
    .param p2, "dstSize"    # J

    .line 149
    const/4 v0, 0x0

    .line 168
    .local v0, "$i$f$computeFillWidth-iLBOSCw":I
    const/4 v1, 0x0

    .line 169
    .local v1, "$i$f$getWidth-impl":I
    move-wide v2, p2

    .local v2, "value$iv$iv$iv":J
    const/4 v4, 0x0

    .line 170
    .local v4, "$i$f$unpackFloat1":I
    const/16 v5, 0x20

    shr-long v6, v2, v5

    long-to-int v6, v6

    .local v6, "bits$iv$iv$iv$iv":I
    const/4 v7, 0x0

    .line 171
    .local v7, "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 170
    .end local v6    # "bits$iv$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 169
    .end local v2    # "value$iv$iv$iv":J
    .end local v4    # "$i$f$unpackFloat1":I
    nop

    .line 168
    .end local v1    # "$i$f$getWidth-impl":I
    const/4 v1, 0x0

    .line 169
    .restart local v1    # "$i$f$getWidth-impl":I
    move-wide v2, p0

    .restart local v2    # "value$iv$iv$iv":J
    const/4 v4, 0x0

    .line 170
    .restart local v4    # "$i$f$unpackFloat1":I
    shr-long v7, v2, v5

    long-to-int v5, v7

    .local v5, "bits$iv$iv$iv$iv":I
    const/4 v7, 0x0

    .line 171
    .restart local v7    # "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 170
    .end local v5    # "bits$iv$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 169
    .end local v2    # "value$iv$iv$iv":J
    .end local v4    # "$i$f$unpackFloat1":I
    nop

    .line 168
    .end local v1    # "$i$f$getWidth-impl":I
    div-float/2addr v6, v5

    .line 149
    .end local v0    # "$i$f$computeFillWidth-iLBOSCw":I
    nop

    .line 150
    .local v6, "widthScale":F
    const/4 v0, 0x0

    .line 172
    .local v0, "$i$f$computeFillHeight-iLBOSCw":I
    const/4 v1, 0x0

    .line 173
    .local v1, "$i$f$getHeight-impl":I
    move-wide v2, p2

    .restart local v2    # "value$iv$iv$iv":J
    const/4 v4, 0x0

    .line 174
    .local v4, "$i$f$unpackFloat2":I
    const-wide v7, 0xffffffffL

    and-long v9, v2, v7

    long-to-int v5, v9

    .restart local v5    # "bits$iv$iv$iv$iv":I
    const/4 v9, 0x0

    .line 175
    .local v9, "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 174
    .end local v5    # "bits$iv$iv$iv$iv":I
    .end local v9    # "$i$f$floatFromBits":I
    nop

    .line 173
    .end local v2    # "value$iv$iv$iv":J
    .end local v4    # "$i$f$unpackFloat2":I
    nop

    .line 172
    .end local v1    # "$i$f$getHeight-impl":I
    const/4 v1, 0x0

    .line 173
    .restart local v1    # "$i$f$getHeight-impl":I
    move-wide v2, p0

    .restart local v2    # "value$iv$iv$iv":J
    const/4 v4, 0x0

    .line 174
    .restart local v4    # "$i$f$unpackFloat2":I
    and-long/2addr v7, v2

    long-to-int v7, v7

    .local v7, "bits$iv$iv$iv$iv":I
    const/4 v8, 0x0

    .line 175
    .local v8, "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    .line 174
    .end local v7    # "bits$iv$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 173
    .end local v2    # "value$iv$iv$iv":J
    .end local v4    # "$i$f$unpackFloat2":I
    nop

    .line 172
    .end local v1    # "$i$f$getHeight-impl":I
    div-float/2addr v5, v7

    .line 150
    .end local v0    # "$i$f$computeFillHeight-iLBOSCw":I
    nop

    .line 151
    .local v5, "heightScale":F
    invoke-static {v6, v5}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method private static final computeFillWidth-iLBOSCw(JJ)F
    .locals 9
    .param p0, "srcSize"    # J
    .param p2, "dstSize"    # J

    const/4 v0, 0x0

    .line 155
    .local v0, "$i$f$computeFillWidth-iLBOSCw":I
    const/4 v1, 0x0

    .line 176
    .local v1, "$i$f$getWidth-impl":I
    move-wide v2, p2

    .local v2, "value$iv$iv":J
    const/4 v4, 0x0

    .line 177
    .local v4, "$i$f$unpackFloat1":I
    const/16 v5, 0x20

    shr-long v6, v2, v5

    long-to-int v6, v6

    .local v6, "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 178
    .local v7, "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 177
    .end local v6    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 176
    .end local v2    # "value$iv$iv":J
    .end local v4    # "$i$f$unpackFloat1":I
    nop

    .line 155
    .end local v1    # "$i$f$getWidth-impl":I
    const/4 v1, 0x0

    .line 176
    .restart local v1    # "$i$f$getWidth-impl":I
    move-wide v2, p0

    .restart local v2    # "value$iv$iv":J
    const/4 v4, 0x0

    .line 177
    .restart local v4    # "$i$f$unpackFloat1":I
    shr-long v7, v2, v5

    long-to-int v5, v7

    .local v5, "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 178
    .restart local v7    # "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 177
    .end local v5    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 176
    .end local v2    # "value$iv$iv":J
    .end local v4    # "$i$f$unpackFloat1":I
    nop

    .line 155
    .end local v1    # "$i$f$getWidth-impl":I
    div-float/2addr v6, v5

    return v6
.end method
