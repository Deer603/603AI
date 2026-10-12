.class public final Landroidx/compose/material3/carousel/KeylinesKt;
.super Ljava/lang/Object;
.source "Keylines.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nKeylines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keylines.kt\nandroidx/compose/material3/carousel/KeylinesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u000cH\u0000\u001aD\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0001H\u0000\u001a(\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0001H\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "calculateMediumChildSize",
        "",
        "minimumMediumSize",
        "largeItemSize",
        "remainingSpace",
        "createLeftAlignedKeylineList",
        "Landroidx/compose/material3/carousel/KeylineList;",
        "carouselMainAxisSize",
        "itemSpacing",
        "leftAnchorSize",
        "rightAnchorSize",
        "arrangement",
        "Landroidx/compose/material3/carousel/Arrangement;",
        "multiBrowseKeylineList",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "preferredItemSize",
        "itemCount",
        "",
        "minSmallItemSize",
        "maxSmallItemSize",
        "uncontainedKeylineList",
        "itemSize",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final calculateMediumChildSize(FFF)F
    .locals 4
    .param p0, "minimumMediumSize"    # F
    .param p1, "largeItemSize"    # F
    .param p2, "remainingSpace"    # F

    .line 232
    move v0, p0

    .line 233
    .local v0, "mediumItemSize":F
    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v1, p2

    .line 234
    .local v1, "sizeWithThirdCutOff":F
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 239
    const v2, 0x3f59999a    # 0.85f

    mul-float/2addr v2, p1

    .line 240
    .local v2, "largeItemThreshold":F
    cmpl-float v3, v0, v2

    if-lez v3, :cond_0

    .line 243
    const v3, 0x3f99999a    # 1.2f

    mul-float/2addr v3, p2

    .line 244
    .local v3, "sizeWithFifthCutOff":F
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 246
    .end local v3    # "sizeWithFifthCutOff":F
    :cond_0
    return v0
.end method

.method public static final createLeftAlignedKeylineList(FFFFLandroidx/compose/material3/carousel/Arrangement;)Landroidx/compose/material3/carousel/KeylineList;
    .locals 2
    .param p0, "carouselMainAxisSize"    # F
    .param p1, "itemSpacing"    # F
    .param p2, "leftAnchorSize"    # F
    .param p3, "rightAnchorSize"    # F
    .param p4, "arrangement"    # Landroidx/compose/material3/carousel/Arrangement;

    .line 153
    sget-object v0, Landroidx/compose/material3/carousel/CarouselAlignment;->Companion:Landroidx/compose/material3/carousel/CarouselAlignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/material3/carousel/CarouselAlignment$Companion;->getStart-NUL3oTo()I

    move-result v0

    new-instance v1, Landroidx/compose/material3/carousel/KeylinesKt$createLeftAlignedKeylineList$1;

    invoke-direct {v1, p2, p4, p3}, Landroidx/compose/material3/carousel/KeylinesKt$createLeftAlignedKeylineList$1;-><init>(FLandroidx/compose/material3/carousel/Arrangement;F)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p1, v0, v1}, Landroidx/compose/material3/carousel/KeylineListKt;->keylineListOf-WNYm7Xg(FFILkotlin/jvm/functions/Function1;)Landroidx/compose/material3/carousel/KeylineList;

    move-result-object v0

    return-object v0
.end method

.method public static final multiBrowseKeylineList(Landroidx/compose/ui/unit/Density;FFFIFF)Landroidx/compose/material3/carousel/KeylineList;
    .locals 23
    .param p0, "density"    # Landroidx/compose/ui/unit/Density;
    .param p1, "carouselMainAxisSize"    # F
    .param p2, "preferredItemSize"    # F
    .param p3, "itemSpacing"    # F
    .param p4, "itemCount"    # I
    .param p5, "minSmallItemSize"    # F
    .param p6, "maxSmallItemSize"    # F

    .line 55
    move/from16 v1, p1

    move/from16 v11, p2

    move/from16 v12, p4

    move/from16 v4, p5

    move/from16 v5, p6

    const/4 v0, 0x0

    cmpg-float v2, v1, v0

    const/4 v3, 0x0

    const/4 v13, 0x1

    if-nez v2, :cond_0

    move v2, v13

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-nez v2, :cond_a

    cmpg-float v0, v11, v0

    if-nez v0, :cond_1

    move v0, v13

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    if-eqz v0, :cond_2

    move/from16 v2, p3

    goto/16 :goto_6

    .line 59
    :cond_2
    filled-new-array {v13}, [I

    move-result-object v0

    .line 60
    .local v0, "smallCounts":[I
    filled-new-array {v13, v3}, [I

    move-result-object v8

    .line 62
    .local v8, "mediumCounts":[I
    invoke-static {v11, v1}, Ljava/lang/Math;->min(FF)F

    move-result v9

    .line 67
    .local v9, "targetLargeSize":F
    const/high16 v2, 0x40400000    # 3.0f

    div-float v2, v9, v2

    invoke-static {v2, v4, v5}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    .line 68
    .local v2, "targetSmallSize":F
    add-float v6, v9, v2

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    .line 70
    .local v6, "targetMediumSize":F
    mul-float/2addr v7, v4

    cmpg-float v7, v1, v7

    if-gez v7, :cond_3

    .line 74
    filled-new-array {v3}, [I

    move-result-object v7

    move-object v0, v7

    .line 80
    :cond_3
    nop

    .line 81
    invoke-static {v8}, Lkotlin/collections/ArraysKt;->maxOrThrow([I)I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v7, v6

    .line 80
    sub-float v7, v1, v7

    .line 82
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->maxOrThrow([I)I

    move-result v10

    int-to-float v10, v10

    mul-float/2addr v10, v5

    .line 80
    sub-float/2addr v7, v10

    .line 79
    move v14, v7

    .line 83
    .local v14, "minAvailableLargeSpace":F
    div-float v7, v14, v9

    float-to-double v3, v7

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    invoke-static {v13, v3}, Ljava/lang/Math;->max(II)I

    move-result v15

    .line 84
    .local v15, "minLargeCount":I
    div-float v3, v1, v9

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    .line 86
    .local v3, "maxLargeCount":I
    sub-int v4, v3, v15

    add-int/2addr v4, v13

    new-array v7, v4, [I

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v4, :cond_4

    sub-int v16, v3, v10

    aput v16, v7, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_4
    move-object v10, v7

    .line 87
    .local v10, "largeCounts":[I
    move-object/from16 v4, p0

    .line 249
    .local v4, "$this$multiBrowseKeylineList_u24lambda_u242":Landroidx/compose/ui/unit/Density;
    const/4 v7, 0x0

    .line 87
    .local v7, "$i$a$-with-KeylinesKt$multiBrowseKeylineList$anchorSize$1":I
    sget-object v16, Landroidx/compose/material3/carousel/CarouselDefaults;->INSTANCE:Landroidx/compose/material3/carousel/CarouselDefaults;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/carousel/CarouselDefaults;->getAnchorSize-D9Ej5fM$material3_release()F

    move-result v13

    invoke-interface {v4, v13}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v13

    .line 89
    .end local v4    # "$this$multiBrowseKeylineList_u24lambda_u242":Landroidx/compose/ui/unit/Density;
    .end local v7    # "$i$a$-with-KeylinesKt$multiBrowseKeylineList$anchorSize$1":I
    .local v13, "anchorSize":F
    move v7, v6

    move-object v6, v0

    .end local v0    # "smallCounts":[I
    .local v6, "smallCounts":[I
    .local v7, "targetMediumSize":F
    sget-object v0, Landroidx/compose/material3/carousel/Arrangement;->Companion:Landroidx/compose/material3/carousel/Arrangement$Companion;

    .line 90
    nop

    .line 91
    nop

    .line 92
    nop

    .line 93
    nop

    .line 94
    nop

    .line 95
    nop

    .line 96
    nop

    .line 97
    nop

    .line 98
    nop

    .line 99
    nop

    .line 89
    move/from16 v4, p5

    move/from16 v16, v3

    move v3, v2

    move/from16 v2, p3

    .end local v2    # "targetSmallSize":F
    .local v3, "targetSmallSize":F
    .local v16, "maxLargeCount":I
    invoke-virtual/range {v0 .. v10}, Landroidx/compose/material3/carousel/Arrangement$Companion;->findLowestCostArrangement(FFFFF[IF[IF[I)Landroidx/compose/material3/carousel/Arrangement;

    move-result-object v0

    .line 88
    move-object/from16 v19, v6

    move-object/from16 v18, v8

    .end local v6    # "smallCounts":[I
    .end local v8    # "mediumCounts":[I
    .local v18, "mediumCounts":[I
    .local v19, "smallCounts":[I
    move-object/from16 v20, v0

    .line 102
    .local v20, "arrangement":Landroidx/compose/material3/carousel/Arrangement;
    if-eqz v20, :cond_8

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/carousel/Arrangement;->itemCount()I

    move-result v0

    if-le v0, v12, :cond_8

    .line 103
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/carousel/Arrangement;->itemCount()I

    move-result v0

    sub-int/2addr v0, v12

    .line 104
    .local v0, "keylineSurplus":I
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/carousel/Arrangement;->getSmallCount()I

    move-result v1

    .line 105
    .local v1, "smallCount":I
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/carousel/Arrangement;->getMediumCount()I

    move-result v2

    move/from16 v21, v0

    move/from16 v22, v1

    move v0, v2

    .line 106
    .end local v1    # "smallCount":I
    .local v0, "mediumCount":I
    .local v21, "keylineSurplus":I
    .local v22, "smallCount":I
    :goto_3
    if-lez v21, :cond_7

    .line 107
    if-lez v22, :cond_5

    add-int/lit8 v22, v22, -0x1

    .line 108
    const/4 v1, 0x1

    goto :goto_4

    .line 109
    :cond_5
    const/4 v1, 0x1

    if-le v0, v1, :cond_6

    add-int/lit8 v0, v0, -0x1

    .line 112
    :cond_6
    :goto_4
    add-int/lit8 v21, v21, -0x1

    .line 116
    goto :goto_3

    .line 119
    :cond_7
    move v2, v0

    .end local v0    # "mediumCount":I
    .local v2, "mediumCount":I
    sget-object v0, Landroidx/compose/material3/carousel/Arrangement;->Companion:Landroidx/compose/material3/carousel/Arrangement$Companion;

    .line 120
    nop

    .line 121
    nop

    .line 122
    nop

    .line 123
    nop

    .line 124
    nop

    .line 125
    filled-new-array/range {v22 .. v22}, [I

    move-result-object v6

    .line 126
    nop

    .line 127
    filled-new-array {v2}, [I

    move-result-object v8

    .line 128
    nop

    .line 129
    nop

    .line 119
    move/from16 v1, p1

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v17, v2

    move/from16 v2, p3

    .end local v2    # "mediumCount":I
    .local v17, "mediumCount":I
    invoke-virtual/range {v0 .. v10}, Landroidx/compose/material3/carousel/Arrangement$Companion;->findLowestCostArrangement(FFFFF[IF[IF[I)Landroidx/compose/material3/carousel/Arrangement;

    move-result-object v0

    .line 118
    move-object/from16 v20, v0

    goto :goto_5

    .line 102
    .end local v17    # "mediumCount":I
    .end local v21    # "keylineSurplus":I
    .end local v22    # "smallCount":I
    :cond_8
    move/from16 v1, p1

    .line 133
    move-object/from16 v0, v20

    .end local v20    # "arrangement":Landroidx/compose/material3/carousel/Arrangement;
    .local v0, "arrangement":Landroidx/compose/material3/carousel/Arrangement;
    :goto_5
    if-nez v0, :cond_9

    .line 134
    invoke-static {}, Landroidx/compose/material3/carousel/KeylineListKt;->emptyKeylineList()Landroidx/compose/material3/carousel/KeylineList;

    move-result-object v2

    return-object v2

    .line 138
    :cond_9
    nop

    .line 139
    nop

    .line 141
    nop

    .line 140
    nop

    .line 142
    nop

    .line 137
    move/from16 v2, p3

    invoke-static {v1, v2, v13, v13, v0}, Landroidx/compose/material3/carousel/KeylinesKt;->createLeftAlignedKeylineList(FFFFLandroidx/compose/material3/carousel/Arrangement;)Landroidx/compose/material3/carousel/KeylineList;

    move-result-object v4

    return-object v4

    .line 55
    .end local v0    # "arrangement":Landroidx/compose/material3/carousel/Arrangement;
    .end local v3    # "targetSmallSize":F
    .end local v7    # "targetMediumSize":F
    .end local v9    # "targetLargeSize":F
    .end local v10    # "largeCounts":[I
    .end local v13    # "anchorSize":F
    .end local v14    # "minAvailableLargeSpace":F
    .end local v15    # "minLargeCount":I
    .end local v16    # "maxLargeCount":I
    .end local v18    # "mediumCounts":[I
    .end local v19    # "smallCounts":[I
    :cond_a
    move/from16 v2, p3

    .line 56
    :goto_6
    invoke-static {}, Landroidx/compose/material3/carousel/KeylineListKt;->emptyKeylineList()Landroidx/compose/material3/carousel/KeylineList;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic multiBrowseKeylineList$default(Landroidx/compose/ui/unit/Density;FFFIFFILjava/lang/Object;)Landroidx/compose/material3/carousel/KeylineList;
    .locals 7

    .line 46
    and-int/lit8 p8, p7, 0x20

    if-eqz p8, :cond_0

    .line 52
    move-object p5, p0

    .line 249
    .local p5, "$this$multiBrowseKeylineList_u24lambda_u240":Landroidx/compose/ui/unit/Density;
    const/4 p8, 0x0

    .line 52
    .local p8, "$i$a$-with-KeylinesKt$multiBrowseKeylineList$1":I
    sget-object v0, Landroidx/compose/material3/carousel/CarouselDefaults;->INSTANCE:Landroidx/compose/material3/carousel/CarouselDefaults;

    invoke-virtual {v0}, Landroidx/compose/material3/carousel/CarouselDefaults;->getMinSmallItemSize-D9Ej5fM$material3_release()F

    move-result v0

    invoke-interface {p5, v0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result p5

    move v5, p5

    .end local p5    # "$this$multiBrowseKeylineList_u24lambda_u240":Landroidx/compose/ui/unit/Density;
    .end local p8    # "$i$a$-with-KeylinesKt$multiBrowseKeylineList$1":I
    goto :goto_0

    .line 46
    :cond_0
    move v5, p5

    :goto_0
    and-int/lit8 p5, p7, 0x40

    if-eqz p5, :cond_1

    .line 53
    move-object p5, p0

    .line 249
    .local p5, "$this$multiBrowseKeylineList_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    const/4 p6, 0x0

    .line 53
    .local p6, "$i$a$-with-KeylinesKt$multiBrowseKeylineList$2":I
    sget-object p7, Landroidx/compose/material3/carousel/CarouselDefaults;->INSTANCE:Landroidx/compose/material3/carousel/CarouselDefaults;

    invoke-virtual {p7}, Landroidx/compose/material3/carousel/CarouselDefaults;->getMaxSmallItemSize-D9Ej5fM$material3_release()F

    move-result p7

    invoke-interface {p5, p7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result p6

    move v6, p6

    .end local p5    # "$this$multiBrowseKeylineList_u24lambda_u241":Landroidx/compose/ui/unit/Density;
    .end local p6    # "$i$a$-with-KeylinesKt$multiBrowseKeylineList$2":I
    goto :goto_1

    .line 46
    :cond_1
    move v6, p6

    :goto_1
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/carousel/KeylinesKt;->multiBrowseKeylineList(Landroidx/compose/ui/unit/Density;FFFIFF)Landroidx/compose/material3/carousel/KeylineList;

    move-result-object p0

    return-object p0
.end method

.method public static final uncontainedKeylineList(Landroidx/compose/ui/unit/Density;FFF)Landroidx/compose/material3/carousel/KeylineList;
    .locals 12
    .param p0, "density"    # Landroidx/compose/ui/unit/Density;
    .param p1, "carouselMainAxisSize"    # F
    .param p2, "itemSize"    # F
    .param p3, "itemSpacing"    # F

    .line 185
    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-nez v1, :cond_4

    cmpg-float v1, p2, v0

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-eqz v1, :cond_2

    goto :goto_3

    .line 189
    :cond_2
    add-float v1, p2, p3

    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result v10

    .line 191
    .local v10, "largeItemSize":F
    div-float v1, p1, v10

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v1, v4

    float-to-int v1, v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 192
    .local v11, "largeCount":I
    int-to-float v1, v11

    mul-float/2addr v1, v10

    sub-float v1, p1, v1

    .line 194
    .local v1, "remainingSpace":F
    cmpl-float v0, v1, v0

    if-lez v0, :cond_3

    move v9, v3

    goto :goto_2

    :cond_3
    move v9, v2

    .line 196
    .local v9, "mediumCount":I
    :goto_2
    move-object v0, p0

    .line 249
    .local v0, "$this$uncontainedKeylineList_u24lambda_u243":Landroidx/compose/ui/unit/Density;
    const/4 v2, 0x0

    .line 196
    .local v2, "$i$a$-with-KeylinesKt$uncontainedKeylineList$defaultAnchorSize$1":I
    sget-object v3, Landroidx/compose/material3/carousel/CarouselDefaults;->INSTANCE:Landroidx/compose/material3/carousel/CarouselDefaults;

    invoke-virtual {v3}, Landroidx/compose/material3/carousel/CarouselDefaults;->getAnchorSize-D9Ej5fM$material3_release()F

    move-result v3

    invoke-interface {v0, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v0

    .line 199
    .end local v2    # "$i$a$-with-KeylinesKt$uncontainedKeylineList$defaultAnchorSize$1":I
    .local v0, "defaultAnchorSize":F
    nop

    .line 200
    nop

    .line 201
    nop

    .line 198
    invoke-static {v0, v10, v1}, Landroidx/compose/material3/carousel/KeylinesKt;->calculateMediumChildSize(FFF)F

    move-result v8

    .line 197
    nop

    .line 203
    .local v8, "mediumItemSize":F
    new-instance v4, Landroidx/compose/material3/carousel/Arrangement;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v4 .. v11}, Landroidx/compose/material3/carousel/Arrangement;-><init>(IFIFIFI)V

    .line 205
    .local v4, "arrangement":Landroidx/compose/material3/carousel/Arrangement;
    invoke-static {v0, p2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 208
    .local v2, "xSmallSize":F
    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v3, v8

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    .line 210
    .local v3, "leftAnchorSize":F
    nop

    .line 211
    nop

    .line 212
    nop

    .line 213
    nop

    .line 214
    nop

    .line 209
    invoke-static {p1, p3, v3, v0, v4}, Landroidx/compose/material3/carousel/KeylinesKt;->createLeftAlignedKeylineList(FFFFLandroidx/compose/material3/carousel/Arrangement;)Landroidx/compose/material3/carousel/KeylineList;

    move-result-object v5

    return-object v5

    .line 186
    .end local v0    # "defaultAnchorSize":F
    .end local v1    # "remainingSpace":F
    .end local v2    # "xSmallSize":F
    .end local v3    # "leftAnchorSize":F
    .end local v4    # "arrangement":Landroidx/compose/material3/carousel/Arrangement;
    .end local v8    # "mediumItemSize":F
    .end local v9    # "mediumCount":I
    .end local v10    # "largeItemSize":F
    .end local v11    # "largeCount":I
    :cond_4
    :goto_3
    invoke-static {}, Landroidx/compose/material3/carousel/KeylineListKt;->emptyKeylineList()Landroidx/compose/material3/carousel/KeylineList;

    move-result-object v0

    return-object v0
.end method
