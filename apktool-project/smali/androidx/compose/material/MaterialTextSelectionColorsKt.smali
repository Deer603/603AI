.class public final Landroidx/compose/material/MaterialTextSelectionColorsKt;
.super Ljava/lang/Object;
.source "MaterialTextSelectionColors.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,244:1\n708#2:245\n696#2:246\n75#3:247\n1247#4,6:248\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n45#1:245\n45#1:246\n45#1:247\n47#1:248,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a*\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a2\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a*\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001\u00a2\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001b"
    }
    d2 = {
        "DefaultSelectionBackgroundAlpha",
        "",
        "DesiredContrastRatio",
        "MinimumSelectionBackgroundAlpha",
        "binarySearchForAccessibleSelectionColorAlpha",
        "selectionColor",
        "Landroidx/compose/ui/graphics/Color;",
        "textColor",
        "backgroundColor",
        "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8",
        "(JJJ)F",
        "calculateContrastRatio",
        "foreground",
        "background",
        "calculateContrastRatio--OWjLjI",
        "(JJ)F",
        "selectionColorAlpha",
        "calculateContrastRatio-nb2GgbA",
        "(JFJJ)F",
        "calculateSelectionBackgroundColor",
        "calculateSelectionBackgroundColor-ysEtTa8",
        "(JJJ)J",
        "rememberTextSelectionColors",
        "Landroidx/compose/foundation/text/selection/TextSelectionColors;",
        "colors",
        "Landroidx/compose/material/Colors;",
        "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;",
        "material_release"
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
.field private static final DefaultSelectionBackgroundAlpha:F = 0.4f

.field private static final DesiredContrastRatio:F = 4.5f

.field private static final MinimumSelectionBackgroundAlpha:F = 0.2f


# direct methods
.method private static final binarySearchForAccessibleSelectionColorAlpha-ysEtTa8(JJJ)F
    .locals 12
    .param p0, "selectionColor"    # J
    .param p2, "textColor"    # J
    .param p4, "backgroundColor"    # J

    .line 147
    const/4 v0, 0x0

    .line 148
    .local v0, "attempts":I
    const/4 v1, 0x7

    .line 150
    .local v1, "maxAttempts":I
    const v2, 0x3e4ccccd    # 0.2f

    .line 151
    .local v2, "lowAlpha":F
    const v3, 0x3ecccccd    # 0.4f

    .line 152
    .local v3, "alpha":F
    const v4, 0x3ecccccd    # 0.4f

    move v5, v3

    move v10, v4

    .line 154
    .end local v3    # "alpha":F
    .local v5, "alpha":F
    .local v10, "highAlpha":F
    :goto_0
    if-ge v0, v1, :cond_2

    .line 157
    nop

    .line 158
    nop

    .line 159
    nop

    .line 160
    nop

    .line 156
    move-wide v3, p0

    move-wide v6, p2

    move-wide/from16 v8, p4

    invoke-static/range {v3 .. v9}, Landroidx/compose/material/MaterialTextSelectionColorsKt;->calculateContrastRatio-nb2GgbA(JFJJ)F

    move-result v11

    .line 155
    nop

    .line 165
    .local v11, "contrastRatio":F
    const/high16 v3, 0x40900000    # 4.5f

    div-float v3, v11, v3

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float/2addr v3, v4

    .line 166
    .local v3, "percentageError":F
    nop

    .line 168
    const/4 v4, 0x0

    cmpg-float v6, v4, v3

    const/4 v7, 0x0

    if-gtz v6, :cond_0

    const v6, 0x3c23d70a    # 0.01f

    cmpg-float v6, v3, v6

    if-gtz v6, :cond_0

    const/4 v7, 0x1

    :cond_0
    if-nez v7, :cond_2

    .line 170
    cmpg-float v4, v3, v4

    if-gez v4, :cond_1

    move v4, v5

    move v10, v4

    .end local v10    # "highAlpha":F
    .local v4, "highAlpha":F
    goto :goto_1

    .line 172
    .end local v4    # "highAlpha":F
    .restart local v10    # "highAlpha":F
    :cond_1
    move v2, v5

    .line 174
    :goto_1
    add-float v4, v10, v2

    const/high16 v6, 0x40000000    # 2.0f

    div-float v5, v4, v6

    .line 175
    nop

    .end local v3    # "percentageError":F
    .end local v11    # "contrastRatio":F
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 178
    :cond_2
    return v5
.end method

.method public static final calculateContrastRatio--OWjLjI(JJ)F
    .locals 4
    .param p0, "foreground"    # J
    .param p2, "background"    # J

    .line 221
    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/ColorKt;->luminance-8_81llA(J)F

    move-result v0

    const v1, 0x3d4ccccd    # 0.05f

    add-float/2addr v0, v1

    .line 222
    .local v0, "foregroundLuminance":F
    invoke-static {p2, p3}, Landroidx/compose/ui/graphics/ColorKt;->luminance-8_81llA(J)F

    move-result v2

    add-float/2addr v2, v1

    .line 224
    .local v2, "backgroundLuminance":F
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 225
    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v3

    .line 224
    div-float/2addr v1, v3

    return v1
.end method

.method private static final calculateContrastRatio-nb2GgbA(JFJJ)F
    .locals 8
    .param p0, "selectionColor"    # J
    .param p2, "selectionColorAlpha"    # F
    .param p3, "textColor"    # J
    .param p5, "backgroundColor"    # J

    .line 202
    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v0, p0

    move v2, p2

    .end local p0    # "selectionColor":J
    .end local p2    # "selectionColorAlpha":F
    .local v0, "selectionColor":J
    .local v2, "selectionColorAlpha":F
    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide p0

    invoke-static {p0, p1, p5, p6}, Landroidx/compose/ui/graphics/ColorKt;->compositeOver--OWjLjI(JJ)J

    move-result-wide p0

    .line 201
    nop

    .line 203
    .local p0, "compositeBackground":J
    invoke-static {p3, p4, p0, p1}, Landroidx/compose/ui/graphics/ColorKt;->compositeOver--OWjLjI(JJ)J

    move-result-wide v3

    .line 204
    .local v3, "compositeTextColor":J
    invoke-static {v3, v4, p0, p1}, Landroidx/compose/material/MaterialTextSelectionColorsKt;->calculateContrastRatio--OWjLjI(JJ)F

    move-result p2

    return p2
.end method

.method public static final calculateSelectionBackgroundColor-ysEtTa8(JJJ)J
    .locals 10
    .param p0, "selectionColor"    # J
    .param p2, "textColor"    # J
    .param p4, "backgroundColor"    # J

    .line 84
    nop

    .line 85
    nop

    .line 86
    nop

    .line 87
    nop

    .line 83
    const v2, 0x3ecccccd    # 0.4f

    move-wide v0, p0

    move-wide v3, p2

    move-wide v5, p4

    .end local p0    # "selectionColor":J
    .end local p2    # "textColor":J
    .end local p4    # "backgroundColor":J
    .local v0, "selectionColor":J
    .local v3, "textColor":J
    .local v5, "backgroundColor":J
    invoke-static/range {v0 .. v6}, Landroidx/compose/material/MaterialTextSelectionColorsKt;->calculateContrastRatio-nb2GgbA(JFJJ)F

    move-result p0

    .line 82
    nop

    .line 92
    .local p0, "maximumContrastRatio":F
    nop

    .line 93
    nop

    .line 94
    nop

    .line 95
    nop

    .line 91
    const v2, 0x3e4ccccd    # 0.2f

    invoke-static/range {v0 .. v6}, Landroidx/compose/material/MaterialTextSelectionColorsKt;->calculateContrastRatio-nb2GgbA(JFJJ)F

    move-result p1

    .line 90
    nop

    .line 99
    .local p1, "minimumContrastRatio":F
    nop

    .line 101
    const/high16 p2, 0x40900000    # 4.5f

    cmpl-float p3, p0, p2

    if-ltz p3, :cond_0

    const p2, 0x3ecccccd    # 0.4f

    move v2, p2

    move-wide p3, v3

    move-wide v8, v5

    goto :goto_0

    .line 104
    :cond_0
    cmpg-float p2, p1, p2

    if-gez p2, :cond_1

    const p2, 0x3e4ccccd    # 0.2f

    move v2, p2

    move-wide p3, v3

    move-wide v8, v5

    goto :goto_0

    .line 107
    :cond_1
    nop

    .line 108
    nop

    .line 109
    nop

    .line 106
    move-wide v2, v3

    move-wide v4, v5

    .end local v3    # "textColor":J
    .end local v5    # "backgroundColor":J
    .local v2, "textColor":J
    .local v4, "backgroundColor":J
    invoke-static/range {v0 .. v5}, Landroidx/compose/material/MaterialTextSelectionColorsKt;->binarySearchForAccessibleSelectionColorAlpha-ysEtTa8(JJJ)F

    move-result p2

    move-wide p3, v2

    move-wide v8, v4

    move v2, p2

    .line 99
    .end local v2    # "textColor":J
    .end local v4    # "backgroundColor":J
    .local v8, "backgroundColor":J
    .local p3, "textColor":J
    :goto_0
    nop

    .line 98
    nop

    .line 113
    .local v2, "alpha":F
    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    return-wide v3
.end method

.method public static final rememberTextSelectionColors(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;
    .locals 21
    .param p0, "colors"    # Landroidx/compose/material/Colors;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    .line 36
    move-object/from16 v0, p1

    const v1, -0x2b0437ad

    const-string v2, "C(rememberTextSelectionColors)45@1907L6,46@1926L416:MaterialTextSelectionColors.kt#jmzs0o"

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)"

    move/from16 v4, p2

    invoke-static {v1, v4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v4, p2

    .line 37
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v5

    .line 38
    .local v5, "primaryColor":J
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material/Colors;->getBackground-0d7_KjU()J

    move-result-wide v9

    .local v9, "backgroundColor":J
    const v1, 0x41bad364

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "*44@1858L7"

    invoke-static {v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 43
    nop

    .line 44
    move-object/from16 v1, p0

    invoke-static {v1, v9, v10}, Landroidx/compose/material/ColorsKt;->contentColorFor-4WTKRHQ(Landroidx/compose/material/Colors;J)J

    move-result-wide v2

    .line 45
    nop

    .local v2, "$this$takeOrElse_u2dDxMtmZc$iv":J
    const/4 v7, 0x0

    .line 245
    .local v7, "$i$f$takeOrElse-DxMtmZc":I
    move-wide v11, v2

    .local v11, "$this$isSpecified$iv$iv":J
    const/4 v8, 0x0

    .line 246
    .local v8, "$i$f$isSpecified-8_81llA":I
    const-wide/16 v13, 0x10

    cmp-long v13, v11, v13

    if-eqz v13, :cond_1

    const/4 v13, 0x1

    goto :goto_1

    :cond_1
    const/4 v13, 0x0

    .line 245
    .end local v8    # "$i$f$isSpecified-8_81llA":I
    .end local v11    # "$this$isSpecified$iv$iv":J
    :goto_1
    if-eqz v13, :cond_2

    move-wide v13, v2

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    .line 45
    .local v8, "$i$a$-takeOrElse-DxMtmZc-MaterialTextSelectionColorsKt$rememberTextSelectionColors$textColorWithLowestAlpha$1":I
    invoke-static {}, Landroidx/compose/material/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v11

    check-cast v11, Landroidx/compose/runtime/CompositionLocal;

    .local v11, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v12, 0x6

    .local v12, "$changed$iv":I
    const/4 v13, 0x0

    .line 247
    .local v13, "$i$f$getCurrent":I
    const v14, 0x789c5f52

    const-string v15, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v0, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 45
    .end local v11    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v12    # "$changed$iv":I
    .end local v13    # "$i$f$getCurrent":I
    check-cast v14, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v14}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v11

    .line 245
    .end local v8    # "$i$a$-takeOrElse-DxMtmZc-MaterialTextSelectionColorsKt$rememberTextSelectionColors$textColorWithLowestAlpha$1":I
    move-wide v13, v11

    .line 45
    .end local v2    # "$this$takeOrElse_u2dDxMtmZc$iv":J
    .end local v7    # "$i$f$takeOrElse-DxMtmZc":I
    :goto_2
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 46
    sget-object v2, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    const/4 v3, 0x6

    invoke-virtual {v2, v0, v3}, Landroidx/compose/material/ContentAlpha;->getMedium(Landroidx/compose/runtime/Composer;I)F

    move-result v15

    const/16 v19, 0xe

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    .line 42
    nop

    .line 47
    .local v7, "textColorWithLowestAlpha":J
    const v2, 0x41bae13c

    const-string v3, "CC(remember):MaterialTextSelectionColors.kt#9igjgp"

    invoke-static {v0, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v0, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v2

    invoke-interface {v0, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v0, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v3

    or-int/2addr v2, v3

    .local v2, "invalid$iv":Z
    move-object/from16 v3, p1

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v11, 0x0

    .line 248
    .local v11, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 249
    .local v13, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_4

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v12, v14, :cond_3

    goto :goto_3

    .line 253
    :cond_3
    goto :goto_4

    .line 250
    :cond_4
    :goto_3
    const/4 v14, 0x0

    .line 48
    .local v14, "$i$a$-cache-MaterialTextSelectionColorsKt$rememberTextSelectionColors$1":I
    new-instance v15, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 49
    invoke-virtual {v1}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v16

    .line 52
    nop

    .line 53
    nop

    .line 54
    nop

    .line 51
    invoke-static/range {v5 .. v10}, Landroidx/compose/material/MaterialTextSelectionColorsKt;->calculateSelectionBackgroundColor-ysEtTa8(JJJ)J

    move-result-wide v18

    .line 48
    const/16 v20, 0x0

    invoke-direct/range {v15 .. v20}, Landroidx/compose/foundation/text/selection/TextSelectionColors;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 56
    nop

    .line 250
    .end local v14    # "$i$a$-cache-MaterialTextSelectionColorsKt$rememberTextSelectionColors$1":I
    nop

    .line 251
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 252
    move-object v12, v15

    .line 248
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_4
    nop

    .line 47
    .end local v2    # "invalid$iv":Z
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v11    # "$i$f$cache":I
    check-cast v12, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 36
    :cond_5
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 47
    return-object v12
.end method
