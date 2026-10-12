.class public final Landroidx/compose/ui/graphics/ColorKt;
.super Ljava/lang/Object;
.source "Color.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,659:1\n583#1:988\n583#1:989\n583#1:990\n635#1:1006\n65#2,10:660\n65#2,10:670\n65#2,10:680\n65#2,10:690\n65#2,10:710\n65#2,10:758\n65#2,10:806\n65#2,10:854\n65#2,10:978\n65#2,10:996\n33#3,5:700\n33#3,5:705\n33#3,5:991\n535#4,38:720\n535#4,38:768\n535#4,38:816\n535#4,38:864\n535#4,38:902\n535#4,38:940\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n568#1:988\n569#1:989\n570#1:990\n646#1:1006\n387#1:660,10\n388#1:670,10\n389#1:680,10\n390#1:690,10\n403#1:710,10\n404#1:758,10\n405#1:806,10\n406#1:854,10\n537#1:978,10\n617#1:996,10\n394#1:700,5\n399#1:705,5\n607#1:991,5\n403#1:720,38\n404#1:768,38\n405#1:816,38\n441#1:864,38\n442#1:902,38\n443#1:940,38\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0013\n\u0002\u0010\u0014\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a9\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0016H\u0007\u00a2\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u000f\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0019H\u0007\u00a2\u0006\u0002\u0010\u001a\u001a5\u0010\u000f\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00192\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00192\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u00192\u0008\u0008\u0003\u0010\u0014\u001a\u00020\u0019H\u0007\u00a2\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001cH\u0007\u00a2\u0006\u0002\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0016H\u0001\u00a2\u0006\u0002\u0010\u0017\u001a1\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0082\u0008\u001a,\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u00072\u0008\u0008\u0001\u0010(\u001a\u00020\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*\u001a\u001e\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.\u001a\u0016\u0010/\u001a\u000200*\u00020\u0007H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102\u001a\u0016\u00103\u001a\u00020\u0011*\u00020\u0007H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00105\u001a%\u00106\u001a\u00020\u0007*\u00020\u00072\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000708H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u00089\u0010:\u001a\u0016\u0010;\u001a\u00020\u0019*\u00020\u0007H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008<\u0010=\"\u0018\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T\u00a2\u0006\n\n\u0002\u0010\u0004\u0012\u0004\u0008\u0002\u0010\u0003\"\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00078\u00c6\u0002X\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u001f\u0010\u000c\u001a\u00020\u0006*\u00020\u00078\u00c6\u0002X\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\r\u0010\t\u001a\u0004\u0008\u000e\u0010\u000b\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006>"
    }
    d2 = {
        "UnspecifiedColor",
        "Lkotlin/ULong;",
        "getUnspecifiedColor$annotations",
        "()V",
        "J",
        "isSpecified",
        "",
        "Landroidx/compose/ui/graphics/Color;",
        "isSpecified-8_81llA$annotations",
        "(J)V",
        "isSpecified-8_81llA",
        "(J)Z",
        "isUnspecified",
        "isUnspecified-8_81llA$annotations",
        "isUnspecified-8_81llA",
        "Color",
        "red",
        "",
        "green",
        "blue",
        "alpha",
        "colorSpace",
        "Landroidx/compose/ui/graphics/colorspace/ColorSpace;",
        "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J",
        "color",
        "",
        "(I)J",
        "(IIII)J",
        "",
        "(J)J",
        "UncheckedColor",
        "compositeComponent",
        "fgC",
        "bgC",
        "fgA",
        "bgA",
        "a",
        "lerp",
        "start",
        "stop",
        "fraction",
        "lerp-jxsXWHM",
        "(JJF)J",
        "compositeOver",
        "background",
        "compositeOver--OWjLjI",
        "(JJ)J",
        "getComponents",
        "",
        "getComponents-8_81llA",
        "(J)[F",
        "luminance",
        "luminance-8_81llA",
        "(J)F",
        "takeOrElse",
        "block",
        "Lkotlin/Function0;",
        "takeOrElse-DxMtmZc",
        "(JLkotlin/jvm/functions/Function0;)J",
        "toArgb",
        "toArgb-8_81llA",
        "(J)I",
        "ui-graphics_release"
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
.field public static final UnspecifiedColor:J = 0x10L


# direct methods
.method public static final Color(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J
    .locals 24
    .param p0, "red"    # F
    .param p1, "green"    # F
    .param p2, "blue"    # F
    .param p3, "alpha"    # F
    .param p4, "colorSpace"    # Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    .line 385
    move-object/from16 v0, p4

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->isSrgb()Z

    move-result v1

    const/16 v2, 0x20

    const/16 v3, 0x10

    const/high16 v4, 0x3f000000    # 0.5f

    if-eqz v1, :cond_8

    .line 387
    const/4 v1, 0x0

    .local v1, "minimumValue$iv":F
    const/high16 v5, 0x3f800000    # 1.0f

    .local v5, "maximumValue$iv":F
    move/from16 v6, p3

    .local v6, "$this$fastCoerceIn$iv":F
    const/4 v7, 0x0

    .line 660
    .local v7, "$i$f$fastCoerceIn":I
    move v8, v6

    .local v8, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v9, 0x0

    .line 664
    .local v9, "$i$f$fastCoerceAtLeast":I
    cmpg-float v10, v8, v1

    if-gez v10, :cond_0

    move v8, v1

    .line 660
    .end local v8    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v9    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    nop

    .local v8, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v9, 0x0

    .line 669
    .local v9, "$i$f$fastCoerceAtMost":I
    cmpl-float v10, v8, v5

    if-lez v10, :cond_1

    move v8, v5

    .line 660
    .end local v8    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v9    # "$i$f$fastCoerceAtMost":I
    :cond_1
    nop

    .line 387
    .end local v1    # "minimumValue$iv":F
    .end local v5    # "maximumValue$iv":F
    .end local v6    # "$this$fastCoerceIn$iv":F
    .end local v7    # "$i$f$fastCoerceIn":I
    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v8, v1

    add-float/2addr v8, v4

    float-to-int v5, v8

    shl-int/lit8 v5, v5, 0x18

    .line 388
    const/4 v6, 0x0

    .local v6, "minimumValue$iv":F
    const/high16 v7, 0x3f800000    # 1.0f

    .local v7, "maximumValue$iv":F
    move/from16 v8, p0

    .local v8, "$this$fastCoerceIn$iv":F
    const/4 v9, 0x0

    .line 670
    .local v9, "$i$f$fastCoerceIn":I
    move v10, v8

    .local v10, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v11, 0x0

    .line 674
    .local v11, "$i$f$fastCoerceAtLeast":I
    cmpg-float v12, v10, v6

    if-gez v12, :cond_2

    move v10, v6

    .line 670
    .end local v10    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v11    # "$i$f$fastCoerceAtLeast":I
    :cond_2
    nop

    .local v10, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v11, 0x0

    .line 679
    .local v11, "$i$f$fastCoerceAtMost":I
    cmpl-float v12, v10, v7

    if-lez v12, :cond_3

    move v10, v7

    .line 670
    .end local v10    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v11    # "$i$f$fastCoerceAtMost":I
    :cond_3
    nop

    .line 388
    .end local v6    # "minimumValue$iv":F
    .end local v7    # "maximumValue$iv":F
    .end local v8    # "$this$fastCoerceIn$iv":F
    .end local v9    # "$i$f$fastCoerceIn":I
    mul-float/2addr v10, v1

    add-float/2addr v10, v4

    float-to-int v6, v10

    shl-int/lit8 v3, v6, 0x10

    .line 387
    or-int/2addr v3, v5

    .line 389
    const/4 v5, 0x0

    .local v5, "minimumValue$iv":F
    const/high16 v6, 0x3f800000    # 1.0f

    .local v6, "maximumValue$iv":F
    move/from16 v7, p1

    .local v7, "$this$fastCoerceIn$iv":F
    const/4 v8, 0x0

    .line 680
    .local v8, "$i$f$fastCoerceIn":I
    move v9, v7

    .local v9, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v10, 0x0

    .line 684
    .local v10, "$i$f$fastCoerceAtLeast":I
    cmpg-float v11, v9, v5

    if-gez v11, :cond_4

    move v9, v5

    .line 680
    .end local v9    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v10    # "$i$f$fastCoerceAtLeast":I
    :cond_4
    nop

    .local v9, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v10, 0x0

    .line 689
    .local v10, "$i$f$fastCoerceAtMost":I
    cmpl-float v11, v9, v6

    if-lez v11, :cond_5

    move v9, v6

    .line 680
    .end local v9    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v10    # "$i$f$fastCoerceAtMost":I
    :cond_5
    nop

    .line 389
    .end local v5    # "minimumValue$iv":F
    .end local v6    # "maximumValue$iv":F
    .end local v7    # "$this$fastCoerceIn$iv":F
    .end local v8    # "$i$f$fastCoerceIn":I
    mul-float/2addr v9, v1

    add-float/2addr v9, v4

    float-to-int v5, v9

    shl-int/lit8 v5, v5, 0x8

    .line 387
    or-int/2addr v3, v5

    .line 390
    const/4 v5, 0x0

    .restart local v5    # "minimumValue$iv":F
    const/high16 v6, 0x3f800000    # 1.0f

    .restart local v6    # "maximumValue$iv":F
    move/from16 v7, p2

    .restart local v7    # "$this$fastCoerceIn$iv":F
    const/4 v8, 0x0

    .line 690
    .restart local v8    # "$i$f$fastCoerceIn":I
    move v9, v7

    .local v9, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v10, 0x0

    .line 694
    .local v10, "$i$f$fastCoerceAtLeast":I
    cmpg-float v11, v9, v5

    if-gez v11, :cond_6

    move v9, v5

    .line 690
    .end local v9    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v10    # "$i$f$fastCoerceAtLeast":I
    :cond_6
    nop

    .local v9, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v10, 0x0

    .line 699
    .local v10, "$i$f$fastCoerceAtMost":I
    cmpl-float v11, v9, v6

    if-lez v11, :cond_7

    move v9, v6

    .line 690
    .end local v9    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v10    # "$i$f$fastCoerceAtMost":I
    :cond_7
    nop

    .line 390
    .end local v5    # "minimumValue$iv":F
    .end local v6    # "maximumValue$iv":F
    .end local v7    # "$this$fastCoerceIn$iv":F
    .end local v8    # "$i$f$fastCoerceIn":I
    mul-float/2addr v9, v1

    add-float/2addr v9, v4

    float-to-int v1, v9

    .line 387
    or-int/2addr v1, v3

    .line 386
    nop

    .line 391
    .local v1, "argb":I
    int-to-long v3, v1

    invoke-static {v3, v4}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v3

    shl-long v2, v3, v2

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/Color;->constructor-impl(J)J

    move-result-wide v2

    return-wide v2

    .line 394
    .end local v1    # "argb":I
    :cond_8
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getComponentCount()I

    move-result v1

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v1, v5, :cond_9

    move v1, v7

    goto :goto_0

    :cond_9
    move v1, v6

    .local v1, "value$iv":Z
    :goto_0
    const/4 v5, 0x0

    .line 700
    .local v5, "$i$f$requirePrecondition":I
    nop

    .line 701
    if-nez v1, :cond_a

    .line 702
    const/4 v8, 0x0

    .line 395
    .local v8, "$i$a$-requirePrecondition-ColorKt$Color$1":I
    nop

    .line 702
    .end local v8    # "$i$a$-requirePrecondition-ColorKt$Color$1":I
    const-string v8, "Color only works with ColorSpaces with 3 components"

    invoke-static {v8}, Landroidx/compose/ui/graphics/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 704
    :cond_a
    nop

    .line 398
    .end local v1    # "value$iv":Z
    .end local v5    # "$i$f$requirePrecondition":I
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getId$ui_graphics_release()I

    move-result v1

    .line 399
    .local v1, "id":I
    const/4 v5, -0x1

    if-eq v1, v5, :cond_b

    move v5, v7

    goto :goto_1

    :cond_b
    move v5, v6

    .local v5, "value$iv":Z
    :goto_1
    const/4 v8, 0x0

    .line 705
    .local v8, "$i$f$requirePrecondition":I
    nop

    .line 706
    if-nez v5, :cond_c

    .line 707
    const/4 v9, 0x0

    .line 400
    .local v9, "$i$a$-requirePrecondition-ColorKt$Color$2":I
    nop

    .line 707
    .end local v9    # "$i$a$-requirePrecondition-ColorKt$Color$2":I
    const-string v9, "Unknown color space, please use a color space in ColorSpaces"

    invoke-static {v9}, Landroidx/compose/ui/graphics/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 709
    :cond_c
    nop

    .line 403
    .end local v5    # "value$iv":Z
    .end local v8    # "$i$f$requirePrecondition":I
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getMinValue(I)F

    move-result v5

    .local v5, "minimumValue$iv":F
    invoke-virtual {v0, v6}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getMaxValue(I)F

    move-result v8

    .local v8, "maximumValue$iv":F
    move/from16 v9, p0

    .local v9, "$this$fastCoerceIn$iv":F
    const/4 v10, 0x0

    .line 710
    .local v10, "$i$f$fastCoerceIn":I
    move v11, v9

    .local v11, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v12, 0x0

    .line 714
    .local v12, "$i$f$fastCoerceAtLeast":I
    cmpg-float v13, v11, v5

    if-gez v13, :cond_d

    move v11, v5

    .line 710
    .end local v11    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v12    # "$i$f$fastCoerceAtLeast":I
    :cond_d
    nop

    .local v11, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v12, 0x0

    .line 719
    .local v12, "$i$f$fastCoerceAtMost":I
    cmpl-float v13, v11, v8

    if-lez v13, :cond_e

    move v11, v8

    .line 710
    .end local v11    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v12    # "$i$f$fastCoerceAtMost":I
    :cond_e
    nop

    .line 403
    .end local v5    # "minimumValue$iv":F
    .end local v8    # "maximumValue$iv":F
    .end local v9    # "$this$fastCoerceIn$iv":F
    .end local v10    # "$i$f$fastCoerceIn":I
    nop

    .local v11, "f$iv":F
    const/4 v5, 0x0

    .line 720
    .local v5, "$i$f$floatToHalf":I
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    .line 721
    .local v8, "bits$iv":I
    ushr-int/lit8 v9, v8, 0x1f

    .line 722
    .local v9, "s$iv":I
    ushr-int/lit8 v10, v8, 0x17

    const/16 v12, 0xff

    and-int/2addr v10, v12

    .line 723
    .local v10, "e$iv":I
    const v13, 0x7fffff

    and-int v14, v8, v13

    .line 725
    .local v14, "m$iv":I
    const/4 v15, 0x0

    .line 726
    .local v15, "outE$iv":I
    const/16 v16, 0x0

    .line 728
    .local v16, "outM$iv":I
    const/high16 v17, 0x800000

    move/from16 v18, v2

    const/16 v2, -0xa

    const/16 v19, 0x200

    move/from16 v20, v3

    const/16 v3, 0x1f

    if-ne v10, v12, :cond_10

    .line 729
    const/16 v15, 0x1f

    .line 730
    if-eqz v14, :cond_f

    move/from16 v21, v19

    goto :goto_2

    :cond_f
    move/from16 v21, v6

    :goto_2
    move/from16 v16, v21

    move/from16 v21, v4

    goto :goto_3

    .line 732
    :cond_10
    add-int/lit8 v21, v10, -0x7f

    add-int/lit8 v10, v21, 0xf

    .line 733
    if-lt v10, v3, :cond_11

    .line 734
    const/16 v15, 0x31

    move/from16 v21, v4

    goto :goto_3

    .line 735
    :cond_11
    if-gtz v10, :cond_14

    .line 736
    if-lt v10, v2, :cond_13

    .line 741
    or-int v21, v14, v17

    rsub-int/lit8 v22, v10, 0x1

    shr-int v14, v21, v22

    .line 742
    move/from16 v21, v4

    and-int/lit16 v4, v14, 0x1000

    if-eqz v4, :cond_12

    add-int/lit16 v14, v14, 0x2000

    .line 743
    :cond_12
    shr-int/lit8 v16, v14, 0xd

    goto :goto_3

    .line 736
    :cond_13
    move/from16 v21, v4

    goto :goto_3

    .line 746
    :cond_14
    move/from16 v21, v4

    move v15, v10

    .line 747
    shr-int/lit8 v16, v14, 0xd

    .line 748
    and-int/lit16 v4, v14, 0x1000

    if-eqz v4, :cond_15

    .line 750
    shl-int/lit8 v4, v15, 0xa

    or-int v4, v4, v16

    .line 751
    .local v4, "out$iv":I
    add-int/2addr v4, v7

    .line 752
    shl-int/lit8 v22, v9, 0xf

    or-int v6, v4, v22

    int-to-short v6, v6

    goto :goto_4

    .line 757
    .end local v4    # "out$iv":I
    :cond_15
    :goto_3
    shl-int/lit8 v4, v9, 0xf

    shl-int/lit8 v6, v15, 0xa

    or-int/2addr v4, v6

    or-int v4, v4, v16

    int-to-short v6, v4

    .line 403
    .end local v5    # "$i$f$floatToHalf":I
    .end local v8    # "bits$iv":I
    .end local v9    # "s$iv":I
    .end local v10    # "e$iv":I
    .end local v11    # "f$iv":F
    .end local v14    # "m$iv":I
    .end local v15    # "outE$iv":I
    .end local v16    # "outM$iv":I
    :goto_4
    nop

    .line 404
    .local v6, "r":S
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getMinValue(I)F

    move-result v4

    .local v4, "minimumValue$iv":F
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getMaxValue(I)F

    move-result v5

    .local v5, "maximumValue$iv":F
    move/from16 v8, p1

    .local v8, "$this$fastCoerceIn$iv":F
    const/4 v9, 0x0

    .line 758
    .local v9, "$i$f$fastCoerceIn":I
    move v10, v8

    .local v10, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v11, 0x0

    .line 762
    .local v11, "$i$f$fastCoerceAtLeast":I
    cmpg-float v14, v10, v4

    if-gez v14, :cond_16

    move v10, v4

    .line 758
    .end local v10    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v11    # "$i$f$fastCoerceAtLeast":I
    :cond_16
    nop

    .local v10, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v11, 0x0

    .line 767
    .local v11, "$i$f$fastCoerceAtMost":I
    cmpl-float v14, v10, v5

    if-lez v14, :cond_17

    move v10, v5

    .line 758
    .end local v10    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v11    # "$i$f$fastCoerceAtMost":I
    :cond_17
    nop

    .line 404
    .end local v4    # "minimumValue$iv":F
    .end local v5    # "maximumValue$iv":F
    .end local v8    # "$this$fastCoerceIn$iv":F
    .end local v9    # "$i$f$fastCoerceIn":I
    nop

    .local v10, "f$iv":F
    const/4 v4, 0x0

    .line 768
    .local v4, "$i$f$floatToHalf":I
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    .line 769
    .local v5, "bits$iv":I
    ushr-int/lit8 v8, v5, 0x1f

    .line 770
    .local v8, "s$iv":I
    ushr-int/lit8 v9, v5, 0x17

    and-int/2addr v9, v12

    .line 771
    .local v9, "e$iv":I
    and-int v11, v5, v13

    .line 773
    .local v11, "m$iv":I
    const/4 v14, 0x0

    .line 774
    .local v14, "outE$iv":I
    const/4 v15, 0x0

    .line 776
    .local v15, "outM$iv":I
    if-ne v9, v12, :cond_19

    .line 777
    const/16 v14, 0x1f

    .line 778
    if-eqz v11, :cond_18

    move/from16 v16, v19

    goto :goto_5

    :cond_18
    const/16 v16, 0x0

    :goto_5
    move/from16 v15, v16

    move/from16 v16, v7

    move/from16 v23, v13

    goto :goto_6

    .line 780
    :cond_19
    add-int/lit8 v16, v9, -0x7f

    add-int/lit8 v9, v16, 0xf

    .line 781
    if-lt v9, v3, :cond_1a

    .line 782
    const/16 v14, 0x31

    move/from16 v16, v7

    move/from16 v23, v13

    goto :goto_6

    .line 783
    :cond_1a
    if-gtz v9, :cond_1d

    .line 784
    if-lt v9, v2, :cond_1c

    .line 789
    or-int v16, v11, v17

    rsub-int/lit8 v22, v9, 0x1

    shr-int v11, v16, v22

    .line 790
    move/from16 v16, v7

    and-int/lit16 v7, v11, 0x1000

    if-eqz v7, :cond_1b

    add-int/lit16 v11, v11, 0x2000

    .line 791
    :cond_1b
    shr-int/lit8 v15, v11, 0xd

    move/from16 v23, v13

    goto :goto_6

    .line 784
    :cond_1c
    move/from16 v16, v7

    move/from16 v23, v13

    goto :goto_6

    .line 794
    :cond_1d
    move/from16 v16, v7

    move v14, v9

    .line 795
    shr-int/lit8 v15, v11, 0xd

    .line 796
    and-int/lit16 v7, v11, 0x1000

    if-eqz v7, :cond_1e

    .line 798
    shl-int/lit8 v7, v14, 0xa

    or-int/2addr v7, v15

    .line 799
    .local v7, "out$iv":I
    add-int/lit8 v7, v7, 0x1

    .line 800
    shl-int/lit8 v22, v8, 0xf

    move/from16 v23, v13

    or-int v13, v7, v22

    int-to-short v13, v13

    goto :goto_7

    .line 796
    .end local v7    # "out$iv":I
    :cond_1e
    move/from16 v23, v13

    .line 805
    :goto_6
    shl-int/lit8 v7, v8, 0xf

    shl-int/lit8 v13, v14, 0xa

    or-int/2addr v7, v13

    or-int/2addr v7, v15

    int-to-short v13, v7

    .line 404
    .end local v4    # "$i$f$floatToHalf":I
    .end local v5    # "bits$iv":I
    .end local v8    # "s$iv":I
    .end local v9    # "e$iv":I
    .end local v10    # "f$iv":F
    .end local v11    # "m$iv":I
    .end local v14    # "outE$iv":I
    .end local v15    # "outM$iv":I
    :goto_7
    nop

    .line 405
    .local v13, "g":S
    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getMinValue(I)F

    move-result v5

    .local v5, "minimumValue$iv":F
    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getMaxValue(I)F

    move-result v4

    .local v4, "maximumValue$iv":F
    move/from16 v7, p2

    .local v7, "$this$fastCoerceIn$iv":F
    const/4 v8, 0x0

    .line 806
    .local v8, "$i$f$fastCoerceIn":I
    move v9, v7

    .local v9, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v10, 0x0

    .line 810
    .local v10, "$i$f$fastCoerceAtLeast":I
    cmpg-float v11, v9, v5

    if-gez v11, :cond_1f

    move v9, v5

    .line 806
    .end local v9    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v10    # "$i$f$fastCoerceAtLeast":I
    :cond_1f
    nop

    .local v9, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v10, 0x0

    .line 815
    .local v10, "$i$f$fastCoerceAtMost":I
    cmpl-float v11, v9, v4

    if-lez v11, :cond_20

    move v9, v4

    .line 806
    .end local v9    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v10    # "$i$f$fastCoerceAtMost":I
    :cond_20
    nop

    .line 405
    .end local v4    # "maximumValue$iv":F
    .end local v5    # "minimumValue$iv":F
    .end local v7    # "$this$fastCoerceIn$iv":F
    .end local v8    # "$i$f$fastCoerceIn":I
    nop

    .local v9, "f$iv":F
    const/4 v4, 0x0

    .line 816
    .local v4, "$i$f$floatToHalf":I
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    .line 817
    .local v5, "bits$iv":I
    ushr-int/lit8 v7, v5, 0x1f

    .line 818
    .local v7, "s$iv":I
    ushr-int/lit8 v8, v5, 0x17

    and-int/2addr v8, v12

    .line 819
    .local v8, "e$iv":I
    and-int v10, v5, v23

    .line 821
    .local v10, "m$iv":I
    const/4 v11, 0x0

    .line 822
    .local v11, "outE$iv":I
    const/4 v14, 0x0

    .line 824
    .local v14, "outM$iv":I
    if-ne v8, v12, :cond_22

    .line 825
    const/16 v11, 0x1f

    .line 826
    if-eqz v10, :cond_21

    goto :goto_8

    :cond_21
    const/16 v19, 0x0

    :goto_8
    move/from16 v14, v19

    goto :goto_9

    .line 828
    :cond_22
    add-int/lit8 v12, v8, -0x7f

    add-int/lit8 v8, v12, 0xf

    .line 829
    if-lt v8, v3, :cond_23

    .line 830
    const/16 v11, 0x31

    goto :goto_9

    .line 831
    :cond_23
    if-gtz v8, :cond_25

    .line 832
    if-lt v8, v2, :cond_26

    .line 837
    or-int v2, v10, v17

    rsub-int/lit8 v3, v8, 0x1

    shr-int/2addr v2, v3

    .line 838
    .end local v10    # "m$iv":I
    .local v2, "m$iv":I
    and-int/lit16 v3, v2, 0x1000

    if-eqz v3, :cond_24

    add-int/lit16 v2, v2, 0x2000

    :cond_24
    move v10, v2

    .line 839
    .end local v2    # "m$iv":I
    .restart local v10    # "m$iv":I
    shr-int/lit8 v14, v10, 0xd

    goto :goto_9

    .line 842
    :cond_25
    move v11, v8

    .line 843
    shr-int/lit8 v14, v10, 0xd

    .line 844
    and-int/lit16 v2, v10, 0x1000

    if-eqz v2, :cond_26

    .line 846
    shl-int/lit8 v2, v11, 0xa

    or-int/2addr v2, v14

    .line 847
    .local v2, "out$iv":I
    add-int/lit8 v2, v2, 0x1

    .line 848
    shl-int/lit8 v3, v7, 0xf

    or-int/2addr v3, v2

    int-to-short v3, v3

    goto :goto_a

    .line 853
    .end local v2    # "out$iv":I
    :cond_26
    :goto_9
    shl-int/lit8 v2, v7, 0xf

    shl-int/lit8 v3, v11, 0xa

    or-int/2addr v2, v3

    or-int/2addr v2, v14

    int-to-short v3, v2

    .line 405
    .end local v4    # "$i$f$floatToHalf":I
    .end local v5    # "bits$iv":I
    .end local v7    # "s$iv":I
    .end local v8    # "e$iv":I
    .end local v9    # "f$iv":F
    .end local v10    # "m$iv":I
    .end local v11    # "outE$iv":I
    .end local v14    # "outM$iv":I
    :goto_a
    nop

    .line 406
    .local v3, "b":S
    const/4 v2, 0x0

    .local v2, "minimumValue$iv":F
    const/high16 v4, 0x3f800000    # 1.0f

    .local v4, "maximumValue$iv":F
    move/from16 v5, p3

    .local v5, "$this$fastCoerceIn$iv":F
    const/4 v7, 0x0

    .line 854
    .local v7, "$i$f$fastCoerceIn":I
    move v8, v5

    .local v8, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v9, 0x0

    .line 858
    .local v9, "$i$f$fastCoerceAtLeast":I
    cmpg-float v10, v8, v2

    if-gez v10, :cond_27

    move v8, v2

    .line 854
    .end local v8    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v9    # "$i$f$fastCoerceAtLeast":I
    :cond_27
    nop

    .local v8, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v9, 0x0

    .line 863
    .local v9, "$i$f$fastCoerceAtMost":I
    cmpl-float v10, v8, v4

    if-lez v10, :cond_28

    move v8, v4

    .line 854
    .end local v8    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v9    # "$i$f$fastCoerceAtMost":I
    :cond_28
    nop

    .line 406
    .end local v2    # "minimumValue$iv":F
    .end local v4    # "maximumValue$iv":F
    .end local v5    # "$this$fastCoerceIn$iv":F
    .end local v7    # "$i$f$fastCoerceIn":I
    const v2, 0x447fc000    # 1023.0f

    mul-float/2addr v8, v2

    add-float v8, v8, v21

    float-to-int v2, v8

    .line 414
    .local v2, "a":I
    nop

    .line 409
    int-to-long v4, v6

    const-wide/32 v7, 0xffff

    and-long/2addr v4, v7

    const/16 v9, 0x30

    shl-long/2addr v4, v9

    .line 410
    int-to-long v9, v13

    and-long/2addr v9, v7

    shl-long v9, v9, v18

    .line 409
    or-long/2addr v4, v9

    .line 411
    int-to-long v9, v3

    and-long/2addr v7, v9

    shl-long v7, v7, v20

    .line 409
    or-long/2addr v4, v7

    .line 412
    int-to-long v7, v2

    const-wide/16 v9, 0x3ff

    and-long/2addr v7, v9

    const/4 v9, 0x6

    shl-long/2addr v7, v9

    .line 409
    or-long/2addr v4, v7

    .line 413
    int-to-long v7, v1

    const-wide/16 v9, 0x3f

    and-long/2addr v7, v9

    .line 409
    or-long/2addr v4, v7

    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v4

    .line 408
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/Color;->constructor-impl(J)J

    move-result-wide v4

    return-wide v4
.end method

.method public static final Color(I)J
    .locals 3
    .param p0, "color"    # I

    .line 468
    int-to-long v0, p0

    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->constructor-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final Color(IIII)J
    .locals 3
    .param p0, "red"    # I
    .param p1, "green"    # I
    .param p2, "blue"    # I
    .param p3, "alpha"    # I

    .line 504
    and-int/lit16 v0, p3, 0xff

    shl-int/lit8 v0, v0, 0x18

    .line 505
    and-int/lit16 v1, p0, 0xff

    shl-int/lit8 v1, v1, 0x10

    .line 504
    or-int/2addr v0, v1

    .line 506
    and-int/lit16 v1, p1, 0xff

    shl-int/lit8 v1, v1, 0x8

    .line 504
    or-int/2addr v0, v1

    .line 507
    and-int/lit16 v1, p2, 0xff

    .line 504
    or-int/2addr v0, v1

    .line 503
    nop

    .line 508
    .local v0, "color":I
    invoke-static {v0}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v1

    return-wide v1
.end method

.method public static final Color(J)J
    .locals 2
    .param p0, "color"    # J

    .line 483
    const/16 v0, 0x20

    shl-long v0, p0, v0

    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->constructor-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic Color$default(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;ILjava/lang/Object;)J
    .locals 0

    .line 378
    and-int/lit8 p6, p5, 0x8

    if-eqz p6, :cond_0

    .line 382
    const/high16 p3, 0x3f800000    # 1.0f

    .line 378
    :cond_0
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_1

    .line 383
    sget-object p4, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/ColorSpaces;

    invoke-virtual {p4}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getSrgb()Landroidx/compose/ui/graphics/colorspace/Rgb;

    move-result-object p4

    check-cast p4, Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    .line 378
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/graphics/ColorKt;->Color(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic Color$default(IIIIILjava/lang/Object;)J
    .locals 0

    .line 497
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    .line 501
    const/16 p3, 0xff

    .line 497
    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/graphics/ColorKt;->Color(IIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final UncheckedColor(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J
    .locals 22
    .param p0, "red"    # F
    .param p1, "green"    # F
    .param p2, "blue"    # F
    .param p3, "alpha"    # F
    .param p4, "colorSpace"    # Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    .line 432
    move/from16 v0, p3

    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->isSrgb()Z

    move-result v1

    const/16 v2, 0x20

    const/16 v3, 0x10

    const/high16 v4, 0x3f000000    # 0.5f

    if-eqz v1, :cond_0

    .line 434
    const/high16 v1, 0x437f0000    # 255.0f

    mul-float v5, v0, v1

    add-float/2addr v5, v4

    float-to-int v5, v5

    shl-int/lit8 v5, v5, 0x18

    .line 435
    mul-float v6, p0, v1

    add-float/2addr v6, v4

    float-to-int v6, v6

    shl-int/lit8 v3, v6, 0x10

    .line 434
    or-int/2addr v3, v5

    .line 436
    mul-float v5, p1, v1

    add-float/2addr v5, v4

    float-to-int v5, v5

    shl-int/lit8 v5, v5, 0x8

    .line 434
    or-int/2addr v3, v5

    .line 437
    mul-float v1, v1, p2

    add-float/2addr v1, v4

    float-to-int v1, v1

    .line 434
    or-int/2addr v1, v3

    .line 433
    nop

    .line 438
    .local v1, "argb":I
    int-to-long v3, v1

    invoke-static {v3, v4}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v3

    shl-long v2, v3, v2

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/Color;->constructor-impl(J)J

    move-result-wide v2

    return-wide v2

    .line 441
    .end local v1    # "argb":I
    :cond_0
    const/4 v1, 0x0

    .line 864
    .local v1, "$i$f$floatToHalf":I
    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    .line 865
    .local v5, "bits$iv":I
    ushr-int/lit8 v6, v5, 0x1f

    .line 866
    .local v6, "s$iv":I
    ushr-int/lit8 v7, v5, 0x17

    const/16 v8, 0xff

    and-int/2addr v7, v8

    .line 867
    .local v7, "e$iv":I
    const v9, 0x7fffff

    and-int v10, v5, v9

    .line 869
    .local v10, "m$iv":I
    const/4 v11, 0x0

    .line 870
    .local v11, "outE$iv":I
    const/4 v12, 0x0

    .line 872
    .local v12, "outM$iv":I
    const/high16 v13, 0x800000

    const/16 v14, -0xa

    const/16 v15, 0x200

    const/16 v16, 0x0

    move/from16 v17, v2

    const/16 v2, 0x1f

    if-ne v7, v8, :cond_2

    .line 873
    const/16 v11, 0x1f

    .line 874
    if-eqz v10, :cond_1

    move/from16 v18, v15

    goto :goto_0

    :cond_1
    move/from16 v18, v16

    :goto_0
    move/from16 v12, v18

    move/from16 v18, v3

    move/from16 v20, v4

    goto :goto_1

    .line 876
    :cond_2
    add-int/lit8 v18, v7, -0x7f

    add-int/lit8 v7, v18, 0xf

    .line 877
    if-lt v7, v2, :cond_3

    .line 878
    const/16 v11, 0x31

    move/from16 v18, v3

    move/from16 v20, v4

    goto :goto_1

    .line 879
    :cond_3
    if-gtz v7, :cond_6

    .line 880
    if-lt v7, v14, :cond_5

    .line 885
    or-int v18, v10, v13

    rsub-int/lit8 v19, v7, 0x1

    shr-int v10, v18, v19

    .line 886
    move/from16 v18, v3

    and-int/lit16 v3, v10, 0x1000

    if-eqz v3, :cond_4

    add-int/lit16 v10, v10, 0x2000

    .line 887
    :cond_4
    shr-int/lit8 v12, v10, 0xd

    move/from16 v20, v4

    goto :goto_1

    .line 880
    :cond_5
    move/from16 v18, v3

    move/from16 v20, v4

    goto :goto_1

    .line 890
    :cond_6
    move/from16 v18, v3

    move v11, v7

    .line 891
    shr-int/lit8 v12, v10, 0xd

    .line 892
    and-int/lit16 v3, v10, 0x1000

    if-eqz v3, :cond_7

    .line 894
    shl-int/lit8 v3, v11, 0xa

    or-int/2addr v3, v12

    .line 895
    .local v3, "out$iv":I
    add-int/lit8 v3, v3, 0x1

    .line 896
    shl-int/lit8 v19, v6, 0xf

    move/from16 v20, v4

    or-int v4, v3, v19

    int-to-short v4, v4

    goto :goto_2

    .line 892
    .end local v3    # "out$iv":I
    :cond_7
    move/from16 v20, v4

    .line 901
    :goto_1
    shl-int/lit8 v3, v6, 0xf

    shl-int/lit8 v4, v11, 0xa

    or-int/2addr v3, v4

    or-int/2addr v3, v12

    int-to-short v4, v3

    .line 441
    .end local v1    # "$i$f$floatToHalf":I
    .end local v5    # "bits$iv":I
    .end local v6    # "s$iv":I
    .end local v7    # "e$iv":I
    .end local v10    # "m$iv":I
    .end local v11    # "outE$iv":I
    .end local v12    # "outM$iv":I
    :goto_2
    nop

    .line 442
    .local v4, "r":S
    const/4 v1, 0x0

    .line 902
    .restart local v1    # "$i$f$floatToHalf":I
    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    .line 903
    .local v3, "bits$iv":I
    ushr-int/lit8 v5, v3, 0x1f

    .line 904
    .local v5, "s$iv":I
    ushr-int/lit8 v6, v3, 0x17

    and-int/2addr v6, v8

    .line 905
    .local v6, "e$iv":I
    and-int v7, v3, v9

    .line 907
    .local v7, "m$iv":I
    const/4 v10, 0x0

    .line 908
    .local v10, "outE$iv":I
    const/4 v11, 0x0

    .line 910
    .local v11, "outM$iv":I
    if-ne v6, v8, :cond_9

    .line 911
    const/16 v10, 0x1f

    .line 912
    if-eqz v7, :cond_8

    move v12, v15

    goto :goto_3

    :cond_8
    move/from16 v12, v16

    :goto_3
    move v11, v12

    move/from16 v21, v9

    goto :goto_4

    .line 914
    :cond_9
    add-int/lit8 v12, v6, -0x7f

    add-int/lit8 v6, v12, 0xf

    .line 915
    if-lt v6, v2, :cond_a

    .line 916
    const/16 v10, 0x31

    move/from16 v21, v9

    goto :goto_4

    .line 917
    :cond_a
    if-gtz v6, :cond_d

    .line 918
    if-lt v6, v14, :cond_c

    .line 923
    or-int v12, v7, v13

    rsub-int/lit8 v19, v6, 0x1

    shr-int v7, v12, v19

    .line 924
    and-int/lit16 v12, v7, 0x1000

    if-eqz v12, :cond_b

    add-int/lit16 v7, v7, 0x2000

    .line 925
    :cond_b
    shr-int/lit8 v11, v7, 0xd

    move/from16 v21, v9

    goto :goto_4

    .line 918
    :cond_c
    move/from16 v21, v9

    goto :goto_4

    .line 928
    :cond_d
    move v10, v6

    .line 929
    shr-int/lit8 v11, v7, 0xd

    .line 930
    and-int/lit16 v12, v7, 0x1000

    if-eqz v12, :cond_e

    .line 932
    shl-int/lit8 v12, v10, 0xa

    or-int/2addr v12, v11

    .line 933
    .local v12, "out$iv":I
    add-int/lit8 v12, v12, 0x1

    .line 934
    shl-int/lit8 v19, v5, 0xf

    move/from16 v21, v9

    or-int v9, v12, v19

    int-to-short v9, v9

    goto :goto_5

    .line 930
    .end local v12    # "out$iv":I
    :cond_e
    move/from16 v21, v9

    .line 939
    :goto_4
    shl-int/lit8 v9, v5, 0xf

    shl-int/lit8 v12, v10, 0xa

    or-int/2addr v9, v12

    or-int/2addr v9, v11

    int-to-short v9, v9

    .line 442
    .end local v1    # "$i$f$floatToHalf":I
    .end local v3    # "bits$iv":I
    .end local v5    # "s$iv":I
    .end local v6    # "e$iv":I
    .end local v7    # "m$iv":I
    .end local v10    # "outE$iv":I
    .end local v11    # "outM$iv":I
    :goto_5
    nop

    .line 443
    .local v9, "g":S
    const/4 v1, 0x0

    .line 940
    .restart local v1    # "$i$f$floatToHalf":I
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    .line 941
    .restart local v3    # "bits$iv":I
    ushr-int/lit8 v5, v3, 0x1f

    .line 942
    .restart local v5    # "s$iv":I
    ushr-int/lit8 v6, v3, 0x17

    and-int/2addr v6, v8

    .line 943
    .restart local v6    # "e$iv":I
    and-int v7, v3, v21

    .line 945
    .restart local v7    # "m$iv":I
    const/4 v10, 0x0

    .line 946
    .restart local v10    # "outE$iv":I
    const/4 v11, 0x0

    .line 948
    .restart local v11    # "outM$iv":I
    if-ne v6, v8, :cond_10

    .line 949
    const/16 v10, 0x1f

    .line 950
    if-eqz v7, :cond_f

    goto :goto_6

    :cond_f
    move/from16 v15, v16

    :goto_6
    move v11, v15

    goto :goto_7

    .line 952
    :cond_10
    add-int/lit8 v8, v6, -0x7f

    add-int/lit8 v6, v8, 0xf

    .line 953
    if-lt v6, v2, :cond_11

    .line 954
    const/16 v10, 0x31

    goto :goto_7

    .line 955
    :cond_11
    if-gtz v6, :cond_13

    .line 956
    if-lt v6, v14, :cond_14

    .line 961
    or-int v2, v7, v13

    rsub-int/lit8 v8, v6, 0x1

    shr-int/2addr v2, v8

    .line 962
    .end local v7    # "m$iv":I
    .local v2, "m$iv":I
    and-int/lit16 v7, v2, 0x1000

    if-eqz v7, :cond_12

    add-int/lit16 v2, v2, 0x2000

    :cond_12
    move v7, v2

    .line 963
    .end local v2    # "m$iv":I
    .restart local v7    # "m$iv":I
    shr-int/lit8 v11, v7, 0xd

    goto :goto_7

    .line 966
    :cond_13
    move v10, v6

    .line 967
    shr-int/lit8 v11, v7, 0xd

    .line 968
    and-int/lit16 v2, v7, 0x1000

    if-eqz v2, :cond_14

    .line 970
    shl-int/lit8 v2, v10, 0xa

    or-int/2addr v2, v11

    .line 971
    .local v2, "out$iv":I
    add-int/lit8 v2, v2, 0x1

    .line 972
    shl-int/lit8 v8, v5, 0xf

    or-int/2addr v8, v2

    int-to-short v8, v8

    goto :goto_8

    .line 977
    .end local v2    # "out$iv":I
    :cond_14
    :goto_7
    shl-int/lit8 v2, v5, 0xf

    shl-int/lit8 v8, v10, 0xa

    or-int/2addr v2, v8

    or-int/2addr v2, v11

    int-to-short v8, v2

    .line 443
    .end local v1    # "$i$f$floatToHalf":I
    .end local v3    # "bits$iv":I
    .end local v5    # "s$iv":I
    .end local v6    # "e$iv":I
    .end local v7    # "m$iv":I
    .end local v10    # "outE$iv":I
    .end local v11    # "outM$iv":I
    :goto_8
    nop

    .line 445
    .local v8, "b":S
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    const v2, 0x447fc000    # 1023.0f

    mul-float/2addr v1, v2

    add-float v1, v1, v20

    float-to-int v1, v1

    .line 447
    .local v1, "a":I
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getId$ui_graphics_release()I

    move-result v2

    .line 455
    .local v2, "id":I
    nop

    .line 450
    int-to-long v5, v4

    const-wide/32 v10, 0xffff

    and-long/2addr v5, v10

    const/16 v3, 0x30

    shl-long/2addr v5, v3

    .line 451
    int-to-long v12, v9

    and-long/2addr v12, v10

    shl-long v12, v12, v17

    .line 450
    or-long/2addr v5, v12

    .line 452
    int-to-long v12, v8

    and-long/2addr v10, v12

    shl-long v10, v10, v18

    .line 450
    or-long/2addr v5, v10

    .line 453
    int-to-long v10, v1

    const-wide/16 v12, 0x3ff

    and-long/2addr v10, v12

    const/4 v3, 0x6

    shl-long/2addr v10, v3

    .line 450
    or-long/2addr v5, v10

    .line 454
    int-to-long v10, v2

    const-wide/16 v12, 0x3f

    and-long/2addr v10, v12

    .line 450
    or-long/2addr v5, v10

    invoke-static {v5, v6}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v5

    .line 449
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/Color;->constructor-impl(J)J

    move-result-wide v5

    return-wide v5
.end method

.method public static synthetic UncheckedColor$default(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;ILjava/lang/Object;)J
    .locals 0

    .line 425
    and-int/lit8 p6, p5, 0x8

    if-eqz p6, :cond_0

    .line 429
    const/high16 p3, 0x3f800000    # 1.0f

    .line 425
    :cond_0
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_1

    .line 430
    sget-object p4, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/ColorSpaces;

    invoke-virtual {p4}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getSrgb()Landroidx/compose/ui/graphics/colorspace/Rgb;

    move-result-object p4

    check-cast p4, Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    .line 425
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/graphics/ColorKt;->UncheckedColor(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final compositeComponent(FFFFF)F
    .locals 4
    .param p0, "fgC"    # F
    .param p1, "bgC"    # F
    .param p2, "fgA"    # F
    .param p3, "bgA"    # F
    .param p4, "a"    # F

    const/4 v0, 0x0

    .line 583
    .local v0, "$i$f$compositeComponent":I
    const/4 v1, 0x0

    cmpg-float v2, p4, v1

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    mul-float v1, p0, p2

    mul-float v2, p1, p3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v3, p2

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    div-float/2addr v1, p4

    :goto_1
    return v1
.end method

.method public static final compositeOver--OWjLjI(JJ)J
    .locals 18
    .param p0, "$this$compositeOver_u2d_u2dOWjLjI"    # J
    .param p2, "background"    # J

    .line 562
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/graphics/Color;->getColorSpace-impl(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object v0

    move-wide/from16 v1, p0

    invoke-static {v1, v2, v0}, Landroidx/compose/ui/graphics/Color;->convert-vNxB06k(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    move-result-wide v3

    .line 564
    .local v3, "fg":J
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/graphics/Color;->getAlpha-impl(J)F

    move-result v0

    .line 565
    .local v0, "bgA":F
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->getAlpha-impl(J)F

    move-result v5

    .line 566
    .local v5, "fgA":F
    const/high16 v6, 0x3f800000    # 1.0f

    sub-float v7, v6, v5

    mul-float/2addr v7, v0

    add-float/2addr v7, v5

    .line 568
    .local v7, "a":F
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->getRed-impl(J)F

    move-result v8

    .local v8, "fgC$iv":F
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/graphics/Color;->getRed-impl(J)F

    move-result v9

    .local v9, "bgC$iv":F
    const/4 v10, 0x0

    .line 988
    .local v10, "$i$f$compositeComponent":I
    const/4 v11, 0x0

    cmpg-float v12, v7, v11

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-nez v12, :cond_0

    move v12, v13

    goto :goto_0

    :cond_0
    move v12, v14

    :goto_0
    if-eqz v12, :cond_1

    move v12, v11

    goto :goto_1

    :cond_1
    mul-float v12, v8, v5

    mul-float v15, v9, v0

    sub-float v16, v6, v5

    mul-float v15, v15, v16

    add-float/2addr v12, v15

    div-float/2addr v12, v7

    .line 568
    .end local v8    # "fgC$iv":F
    .end local v9    # "bgC$iv":F
    .end local v10    # "$i$f$compositeComponent":I
    :goto_1
    nop

    .line 569
    .local v12, "r":F
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->getGreen-impl(J)F

    move-result v8

    .restart local v8    # "fgC$iv":F
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/graphics/Color;->getGreen-impl(J)F

    move-result v9

    .restart local v9    # "bgC$iv":F
    const/4 v10, 0x0

    .line 989
    .restart local v10    # "$i$f$compositeComponent":I
    cmpg-float v15, v7, v11

    if-nez v15, :cond_2

    move v15, v13

    goto :goto_2

    :cond_2
    move v15, v14

    :goto_2
    if-eqz v15, :cond_3

    move v15, v11

    goto :goto_3

    :cond_3
    mul-float v15, v8, v5

    mul-float v16, v9, v0

    sub-float v17, v6, v5

    mul-float v16, v16, v17

    add-float v15, v15, v16

    div-float/2addr v15, v7

    .line 569
    .end local v8    # "fgC$iv":F
    .end local v9    # "bgC$iv":F
    .end local v10    # "$i$f$compositeComponent":I
    :goto_3
    nop

    .line 570
    .local v15, "g":F
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->getBlue-impl(J)F

    move-result v8

    .restart local v8    # "fgC$iv":F
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/graphics/Color;->getBlue-impl(J)F

    move-result v9

    .restart local v9    # "bgC$iv":F
    const/4 v10, 0x0

    .line 990
    .restart local v10    # "$i$f$compositeComponent":I
    cmpg-float v16, v7, v11

    if-nez v16, :cond_4

    goto :goto_4

    :cond_4
    move v13, v14

    :goto_4
    if-eqz v13, :cond_5

    goto :goto_5

    :cond_5
    mul-float v11, v8, v5

    mul-float v13, v9, v0

    sub-float/2addr v6, v5

    mul-float/2addr v13, v6

    add-float/2addr v11, v13

    div-float/2addr v11, v7

    .line 570
    .end local v8    # "fgC$iv":F
    .end local v9    # "bgC$iv":F
    .end local v10    # "$i$f$compositeComponent":I
    :goto_5
    nop

    .line 572
    .local v11, "b":F
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/graphics/Color;->getColorSpace-impl(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object v6

    invoke-static {v12, v15, v11, v7, v6}, Landroidx/compose/ui/graphics/ColorKt;->UncheckedColor(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    move-result-wide v8

    return-wide v8
.end method

.method private static final getComponents-8_81llA(J)[F
    .locals 6
    .param p0, "$this$getComponents_u2d8_81llA"    # J

    .line 592
    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/Color;->getRed-impl(J)F

    move-result v0

    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/Color;->getGreen-impl(J)F

    move-result v1

    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/Color;->getBlue-impl(J)F

    move-result v2

    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/Color;->getAlpha-impl(J)F

    move-result v3

    const/4 v4, 0x4

    new-array v4, v4, [F

    const/4 v5, 0x0

    aput v0, v4, v5

    const/4 v0, 0x1

    aput v1, v4, v0

    const/4 v0, 0x2

    aput v2, v4, v0

    const/4 v0, 0x3

    aput v3, v4, v0

    return-object v4
.end method

.method public static synthetic getUnspecifiedColor$annotations()V
    .locals 0

    return-void
.end method

.method public static final isSpecified-8_81llA(J)Z
    .locals 3
    .param p0, "$this$isSpecified"    # J

    const/4 v0, 0x0

    .line 635
    .local v0, "$i$f$isSpecified-8_81llA":I
    const-wide/16 v1, 0x10

    cmp-long v1, p0, v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static synthetic isSpecified-8_81llA$annotations(J)V
    .locals 0

    return-void
.end method

.method public static final isUnspecified-8_81llA(J)Z
    .locals 3
    .param p0, "$this$isUnspecified"    # J

    const/4 v0, 0x0

    .line 640
    .local v0, "$i$f$isUnspecified-8_81llA":I
    const-wide/16 v1, 0x10

    cmp-long v1, p0, v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static synthetic isUnspecified-8_81llA$annotations(J)V
    .locals 0

    return-void
.end method

.method public static final lerp-jxsXWHM(JJF)J
    .locals 22
    .param p0, "start"    # J
    .param p2, "stop"    # J
    .param p4, "fraction"    # F

    .line 519
    sget-object v0, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/ColorSpaces;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getOklab()Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object v0

    .line 520
    .local v0, "colorSpace":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    move-wide/from16 v1, p0

    invoke-static {v1, v2, v0}, Landroidx/compose/ui/graphics/Color;->convert-vNxB06k(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    move-result-wide v3

    .line 521
    .local v3, "startColor":J
    move-wide/from16 v5, p2

    invoke-static {v5, v6, v0}, Landroidx/compose/ui/graphics/Color;->convert-vNxB06k(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    move-result-wide v7

    .line 523
    .local v7, "endColor":J
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->getAlpha-impl(J)F

    move-result v9

    .line 524
    .local v9, "startAlpha":F
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->getRed-impl(J)F

    move-result v10

    .line 525
    .local v10, "startL":F
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->getGreen-impl(J)F

    move-result v11

    .line 526
    .local v11, "startA":F
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->getBlue-impl(J)F

    move-result v12

    .line 528
    .local v12, "startB":F
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/Color;->getAlpha-impl(J)F

    move-result v13

    .line 529
    .local v13, "endAlpha":F
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/Color;->getRed-impl(J)F

    move-result v14

    .line 530
    .local v14, "endL":F
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/Color;->getGreen-impl(J)F

    move-result v15

    .line 531
    .local v15, "endA":F
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/Color;->getBlue-impl(J)F

    move-result v1

    .line 537
    .local v1, "endB":F
    const/4 v2, 0x0

    .local v2, "minimumValue$iv":F
    const/high16 v16, 0x3f800000    # 1.0f

    .local v16, "maximumValue$iv":F
    move/from16 v17, p4

    .local v17, "$this$fastCoerceIn$iv":F
    const/16 v18, 0x0

    .line 978
    .local v18, "$i$f$fastCoerceIn":I
    move/from16 v19, v17

    .local v19, "$this$fastCoerceAtLeast$iv$iv":F
    const/16 v20, 0x0

    .line 982
    .local v20, "$i$f$fastCoerceAtLeast":I
    cmpg-float v21, v19, v2

    if-gez v21, :cond_0

    move/from16 v19, v2

    .line 978
    .end local v19    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v20    # "$i$f$fastCoerceAtLeast":I
    :cond_0
    nop

    .local v19, "$this$fastCoerceAtMost$iv$iv":F
    const/16 v20, 0x0

    .line 987
    .local v20, "$i$f$fastCoerceAtMost":I
    cmpl-float v21, v19, v16

    if-lez v21, :cond_1

    move/from16 v19, v16

    .line 978
    .end local v19    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v20    # "$i$f$fastCoerceAtMost":I
    :cond_1
    nop

    .line 537
    .end local v2    # "minimumValue$iv":F
    .end local v16    # "maximumValue$iv":F
    .end local v17    # "$this$fastCoerceIn$iv":F
    .end local v18    # "$i$f$fastCoerceIn":I
    move/from16 v2, v19

    .line 540
    .local v2, "t":F
    move-wide/from16 v16, v3

    .end local v3    # "startColor":J
    .local v16, "startColor":J
    invoke-static {v10, v14, v2}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result v3

    .line 541
    invoke-static {v11, v15, v2}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result v4

    .line 542
    invoke-static {v12, v1, v2}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result v5

    .line 543
    invoke-static {v9, v13, v2}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result v6

    .line 544
    nop

    .line 539
    invoke-static {v3, v4, v5, v6, v0}, Landroidx/compose/ui/graphics/ColorKt;->UncheckedColor(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    move-result-wide v3

    .line 538
    nop

    .line 546
    .local v3, "interpolated":J
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/graphics/Color;->getColorSpace-impl(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object v5

    invoke-static {v3, v4, v5}, Landroidx/compose/ui/graphics/Color;->convert-vNxB06k(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    move-result-wide v5

    return-wide v5
.end method

.method public static final luminance-8_81llA(J)F
    .locals 15
    .param p0, "$this$luminance_u2d8_81llA"    # J

    .line 606
    invoke-static/range {p0 .. p1}, Landroidx/compose/ui/graphics/Color;->getColorSpace-impl(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object v0

    .line 607
    .local v0, "colorSpace":Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getModel-xdoWZVw()J

    move-result-wide v1

    sget-object v3, Landroidx/compose/ui/graphics/colorspace/ColorModel;->Companion:Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;->getRgb-xdoWZVw()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/graphics/colorspace/ColorModel;->equals-impl0(JJ)Z

    move-result v1

    .local v1, "value$iv":Z
    const/4 v2, 0x0

    .line 991
    .local v2, "$i$f$requirePrecondition":I
    nop

    .line 992
    if-nez v1, :cond_0

    .line 993
    const/4 v3, 0x0

    .line 608
    .local v3, "$i$a$-requirePrecondition-ColorKt$luminance$1":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "The specified color must be encoded in an RGB color space. The supplied color space is "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 609
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getModel-xdoWZVw()J

    move-result-wide v5

    .line 608
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/colorspace/ColorModel;->toString-impl(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 609
    nop

    .line 993
    .end local v3    # "$i$a$-requirePrecondition-ColorKt$luminance$1":I
    invoke-static {v4}, Landroidx/compose/ui/graphics/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 995
    :cond_0
    nop

    .line 612
    .end local v1    # "value$iv":Z
    .end local v2    # "$i$f$requirePrecondition":I
    const-string/jumbo v1, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/graphics/colorspace/Rgb;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/colorspace/Rgb;->getEotfFunc$ui_graphics_release()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;

    move-result-object v1

    .line 613
    .local v1, "eotf":Landroidx/compose/ui/graphics/colorspace/DoubleFunction;
    invoke-static/range {p0 .. p1}, Landroidx/compose/ui/graphics/Color;->getRed-impl(J)F

    move-result v2

    float-to-double v2, v2

    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/graphics/colorspace/DoubleFunction;->invoke(D)D

    move-result-wide v2

    .line 614
    .local v2, "r":D
    invoke-static/range {p0 .. p1}, Landroidx/compose/ui/graphics/Color;->getGreen-impl(J)F

    move-result v4

    float-to-double v4, v4

    invoke-interface {v1, v4, v5}, Landroidx/compose/ui/graphics/colorspace/DoubleFunction;->invoke(D)D

    move-result-wide v4

    .line 615
    .local v4, "g":D
    invoke-static/range {p0 .. p1}, Landroidx/compose/ui/graphics/Color;->getBlue-impl(J)F

    move-result v6

    float-to-double v6, v6

    invoke-interface {v1, v6, v7}, Landroidx/compose/ui/graphics/colorspace/DoubleFunction;->invoke(D)D

    move-result-wide v6

    .line 617
    .local v6, "b":D
    const-wide v8, 0x3fcb367a0f9096bcL    # 0.2126

    mul-double/2addr v8, v2

    const-wide v10, 0x3fe6e2eb1c432ca5L    # 0.7152

    mul-double/2addr v10, v4

    add-double/2addr v8, v10

    const-wide v10, 0x3fb27bb2fec56d5dL    # 0.0722

    mul-double/2addr v10, v6

    add-double/2addr v8, v10

    double-to-float v8, v8

    .local v8, "$this$fastCoerceIn$iv":F
    const/4 v9, 0x0

    .local v9, "minimumValue$iv":F
    const/high16 v10, 0x3f800000    # 1.0f

    .local v10, "maximumValue$iv":F
    const/4 v11, 0x0

    .line 996
    .local v11, "$i$f$fastCoerceIn":I
    move v12, v8

    .local v12, "$this$fastCoerceAtLeast$iv$iv":F
    const/4 v13, 0x0

    .line 1000
    .local v13, "$i$f$fastCoerceAtLeast":I
    cmpg-float v14, v12, v9

    if-gez v14, :cond_1

    move v12, v9

    .line 996
    .end local v12    # "$this$fastCoerceAtLeast$iv$iv":F
    .end local v13    # "$i$f$fastCoerceAtLeast":I
    :cond_1
    nop

    .local v12, "$this$fastCoerceAtMost$iv$iv":F
    const/4 v13, 0x0

    .line 1005
    .local v13, "$i$f$fastCoerceAtMost":I
    cmpl-float v14, v12, v10

    if-lez v14, :cond_2

    move v12, v10

    .line 996
    .end local v12    # "$this$fastCoerceAtMost$iv$iv":F
    .end local v13    # "$i$f$fastCoerceAtMost":I
    :cond_2
    nop

    .line 617
    .end local v8    # "$this$fastCoerceIn$iv":F
    .end local v9    # "minimumValue$iv":F
    .end local v10    # "maximumValue$iv":F
    .end local v11    # "$i$f$fastCoerceIn":I
    return v12
.end method

.method public static final takeOrElse-DxMtmZc(JLkotlin/jvm/functions/Function0;)J
    .locals 6
    .param p0, "$this$takeOrElse_u2dDxMtmZc"    # J
    .param p2, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/graphics/Color;",
            ">;)J"
        }
    .end annotation

    const/4 v0, 0x0

    .line 646
    .local v0, "$i$f$takeOrElse-DxMtmZc":I
    move-wide v1, p0

    .local v1, "$this$isSpecified$iv":J
    const/4 v3, 0x0

    .line 1006
    .local v3, "$i$f$isSpecified-8_81llA":I
    const-wide/16 v4, 0x10

    cmp-long v4, v1, v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 646
    .end local v1    # "$this$isSpecified$iv":J
    .end local v3    # "$i$f$isSpecified-8_81llA":I
    :goto_0
    if-eqz v4, :cond_1

    move-wide v1, p0

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v1

    :goto_1
    return-wide v1
.end method

.method public static final toArgb-8_81llA(J)I
    .locals 3
    .param p0, "$this$toArgb_u2d8_81llA"    # J

    .line 629
    sget-object v0, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/ColorSpaces;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getSrgb()Landroidx/compose/ui/graphics/colorspace/Rgb;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    invoke-static {p0, p1, v0}, Landroidx/compose/ui/graphics/Color;->convert-vNxB06k(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long/2addr v0, v2

    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method
