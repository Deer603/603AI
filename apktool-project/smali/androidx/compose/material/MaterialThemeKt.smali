.class public final Landroidx/compose/material/MaterialThemeKt;
.super Ljava/lang/Object;
.source "MaterialTheme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1247#2,6:114\n1#3:120\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n*L\n66#1:114,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\u0008\u001a\r\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\u0008\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "MaterialTheme",
        "",
        "colors",
        "Landroidx/compose/material/Colors;",
        "typography",
        "Landroidx/compose/material/Typography;",
        "shapes",
        "Landroidx/compose/material/Shapes;",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
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


# direct methods
.method public static final MaterialTheme(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .param p0, "colors"    # Landroidx/compose/material/Colors;
    .param p1, "typography"    # Landroidx/compose/material/Typography;
    .param p2, "shapes"    # Landroidx/compose/material/Shapes;
    .param p3, "content"    # Lkotlin/jvm/functions/Function2;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/Colors;",
            "Landroidx/compose/material/Typography;",
            "Landroidx/compose/material/Shapes;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 64
    move-object/from16 v4, p3

    move/from16 v5, p5

    const v0, -0x3521f1f7    # -7276292.5f

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .end local p4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v7, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(MaterialTheme)P(!1,3,2)*65@2983L216,72@3310L45,75@3481L4,80@3684L93,73@3360L417:MaterialTheme.kt#jmzs0o"

    invoke-static {v7, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p5

    .local v1, "$dirty":I
    and-int/lit8 v2, v5, 0x6

    const/4 v6, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p6, 0x1

    if-nez v2, :cond_0

    move-object/from16 v2, p0

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    :cond_1
    move v8, v6

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, p6, 0x2

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v8, p1

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v1, v9

    goto :goto_3

    :cond_5
    move-object/from16 v8, p1

    :goto_3
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_8

    and-int/lit8 v9, p6, 0x4

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v9, p2

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v1, v10

    goto :goto_5

    :cond_8
    move-object/from16 v9, p2

    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_b

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v1, v10

    :cond_b
    :goto_7
    and-int/lit16 v10, v1, 0x493

    const/16 v11, 0x492

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v10, v11, :cond_c

    move v10, v13

    goto :goto_8

    :cond_c
    move v10, v12

    :goto_8
    and-int/lit8 v11, v1, 0x1

    invoke-interface {v7, v10, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v10, "59@2802L6,60@2853L10,61@2900L6"

    invoke-static {v7, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v10, v5, 0x1

    const/4 v11, 0x6

    if-eqz v10, :cond_11

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v10

    if-eqz v10, :cond_d

    goto :goto_9

    .line 62
    :cond_d
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v10, p6, 0x1

    if-eqz v10, :cond_e

    and-int/lit8 v1, v1, -0xf

    :cond_e
    and-int/lit8 v10, p6, 0x2

    if-eqz v10, :cond_f

    and-int/lit8 v1, v1, -0x71

    :cond_f
    and-int/lit8 v10, p6, 0x4

    if-eqz v10, :cond_10

    and-int/lit16 v1, v1, -0x381

    move-object v14, v2

    goto :goto_a

    :cond_10
    move-object v14, v2

    goto :goto_a

    .line 64
    :cond_11
    :goto_9
    and-int/lit8 v10, p6, 0x1

    if-eqz v10, :cond_12

    .line 60
    sget-object v10, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v10, v7, v11}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v2

    .end local p0    # "colors":Landroidx/compose/material/Colors;
    .local v2, "colors":Landroidx/compose/material/Colors;
    and-int/lit8 v1, v1, -0xf

    :cond_12
    and-int/lit8 v10, p6, 0x2

    if-eqz v10, :cond_13

    .line 61
    sget-object v10, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v10, v7, v11}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v8

    .end local p1    # "typography":Landroidx/compose/material/Typography;
    .local v8, "typography":Landroidx/compose/material/Typography;
    and-int/lit8 v1, v1, -0x71

    :cond_13
    and-int/lit8 v10, p6, 0x4

    if-eqz v10, :cond_14

    .line 62
    sget-object v10, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v10, v7, v11}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v9

    .end local p2    # "shapes":Landroidx/compose/material/Shapes;
    .local v9, "shapes":Landroidx/compose/material/Shapes;
    and-int/lit16 v1, v1, -0x381

    move-object v14, v2

    goto :goto_a

    .line 61
    .end local v9    # "shapes":Landroidx/compose/material/Shapes;
    .restart local p2    # "shapes":Landroidx/compose/material/Shapes;
    :cond_14
    move-object v14, v2

    .line 62
    .end local v2    # "colors":Landroidx/compose/material/Colors;
    .end local p2    # "shapes":Landroidx/compose/material/Shapes;
    .restart local v9    # "shapes":Landroidx/compose/material/Shapes;
    .local v14, "colors":Landroidx/compose/material/Colors;
    :goto_a
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 64
    const/4 v2, -0x1

    const-string v10, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:63)"

    invoke-static {v0, v1, v2, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_15
    nop

    .line 66
    const v0, 0x22ef5174

    const-string v2, "CC(remember):MaterialTheme.kt#9igjgp"

    invoke-static {v7, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid$iv":Z
    move-object v2, v7

    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 114
    .local v10, "$i$f$cache":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v42, 0x0

    .line 115
    .local v42, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    const/16 p4, 0x4

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v15, v3, :cond_16

    .line 116
    const/4 v3, 0x0

    .line 69
    .local v3, "$i$a$-cache-MaterialThemeKt$MaterialTheme$rememberedColors$1":I
    const/16 v40, 0x1fff

    const/16 v41, 0x0

    move-object/from16 v17, v15

    .end local v15    # "it$iv":Ljava/lang/Object;
    .local v17, "it$iv":Ljava/lang/Object;
    const-wide/16 v15, 0x0

    move-object/from16 v19, v17

    .end local v17    # "it$iv":Ljava/lang/Object;
    .local v19, "it$iv":Ljava/lang/Object;
    const-wide/16 v17, 0x0

    move-object/from16 v21, v19

    .end local v19    # "it$iv":Ljava/lang/Object;
    .local v21, "it$iv":Ljava/lang/Object;
    const-wide/16 v19, 0x0

    move-object/from16 v23, v21

    .end local v21    # "it$iv":Ljava/lang/Object;
    .local v23, "it$iv":Ljava/lang/Object;
    const-wide/16 v21, 0x0

    move-object/from16 v25, v23

    .end local v23    # "it$iv":Ljava/lang/Object;
    .local v25, "it$iv":Ljava/lang/Object;
    const-wide/16 v23, 0x0

    move-object/from16 v27, v25

    .end local v25    # "it$iv":Ljava/lang/Object;
    .local v27, "it$iv":Ljava/lang/Object;
    const-wide/16 v25, 0x0

    move-object/from16 v29, v27

    .end local v27    # "it$iv":Ljava/lang/Object;
    .local v29, "it$iv":Ljava/lang/Object;
    const-wide/16 v27, 0x0

    move-object/from16 v31, v29

    .end local v29    # "it$iv":Ljava/lang/Object;
    .local v31, "it$iv":Ljava/lang/Object;
    const-wide/16 v29, 0x0

    move-object/from16 v33, v31

    .end local v31    # "it$iv":Ljava/lang/Object;
    .local v33, "it$iv":Ljava/lang/Object;
    const-wide/16 v31, 0x0

    move-object/from16 v35, v33

    .end local v33    # "it$iv":Ljava/lang/Object;
    .local v35, "it$iv":Ljava/lang/Object;
    const-wide/16 v33, 0x0

    move-object/from16 v37, v35

    .end local v35    # "it$iv":Ljava/lang/Object;
    .local v37, "it$iv":Ljava/lang/Object;
    const-wide/16 v35, 0x0

    move-object/from16 v39, v37

    .end local v37    # "it$iv":Ljava/lang/Object;
    .local v39, "it$iv":Ljava/lang/Object;
    const-wide/16 v37, 0x0

    move-object/from16 v43, v39

    .end local v39    # "it$iv":Ljava/lang/Object;
    .local v43, "it$iv":Ljava/lang/Object;
    const/16 v39, 0x0

    invoke-static/range {v14 .. v41}, Landroidx/compose/material/Colors;->copy-pvPzIIM$default(Landroidx/compose/material/Colors;JJJJJJJJJJJJZILjava/lang/Object;)Landroidx/compose/material/Colors;

    move-result-object v3

    .line 116
    .end local v3    # "$i$a$-cache-MaterialThemeKt$MaterialTheme$rememberedColors$1":I
    move-object v15, v3

    .line 117
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 118
    nop

    .end local v15    # "value$iv":Ljava/lang/Object;
    goto :goto_b

    .line 119
    .end local v43    # "it$iv":Ljava/lang/Object;
    .local v15, "it$iv":Ljava/lang/Object;
    :cond_16
    move-object/from16 v43, v15

    .line 114
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v42    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_b
    nop

    .line 66
    .end local v0    # "invalid$iv":Z
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    check-cast v15, Landroidx/compose/material/Colors;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 71
    move-object v0, v15

    .line 120
    .local v0, "$this$MaterialTheme_u24lambda_u241":Landroidx/compose/material/Colors;
    const/4 v2, 0x0

    .line 71
    .local v2, "$i$a$-apply-MaterialThemeKt$MaterialTheme$rememberedColors$2":I
    invoke-static {v0, v14}, Landroidx/compose/material/ColorsKt;->updateColorsFrom(Landroidx/compose/material/Colors;Landroidx/compose/material/Colors;)V

    .line 65
    .end local v0    # "$this$MaterialTheme_u24lambda_u241":Landroidx/compose/material/Colors;
    .end local v2    # "$i$a$-apply-MaterialThemeKt$MaterialTheme$rememberedColors$2":I
    nop

    .line 72
    .local v15, "rememberedColors":Landroidx/compose/material/Colors;
    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/material/RippleKt;->ripple-H2RKhps$default(ZFJILjava/lang/Object;)Landroidx/compose/foundation/IndicationNodeFactory;

    move-result-object v0

    .line 73
    .local v0, "rippleIndication":Landroidx/compose/foundation/IndicationNodeFactory;
    invoke-static {v15, v7, v12}, Landroidx/compose/material/MaterialTextSelectionColorsKt;->rememberTextSelectionColors(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;

    move-result-object v2

    .line 75
    .local v2, "selectionColors":Landroidx/compose/foundation/text/selection/TextSelectionColors;
    new-array v3, v11, [Landroidx/compose/runtime/ProvidedValue;

    invoke-static {}, Landroidx/compose/material/ColorsKt;->getLocalColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v10

    invoke-virtual {v10, v15}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v10

    aput-object v10, v3, v12

    .line 76
    invoke-static {}, Landroidx/compose/material/ContentAlphaKt;->getLocalContentAlpha()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v10

    sget-object v12, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v12, v7, v11}, Landroidx/compose/material/ContentAlpha;->getHigh(Landroidx/compose/runtime/Composer;I)F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v10

    aput-object v10, v3, v13

    .line 75
    nop

    .line 77
    invoke-static {}, Landroidx/compose/foundation/IndicationKt;->getLocalIndication()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v10

    invoke-virtual {v10, v0}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v10

    aput-object v10, v3, v6

    .line 75
    nop

    .line 78
    invoke-static {}, Landroidx/compose/material/ShapesKt;->getLocalShapes()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    invoke-virtual {v6, v9}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v6

    const/4 v10, 0x3

    aput-object v6, v3, v10

    .line 75
    nop

    .line 79
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v6

    aput-object v6, v3, p4

    .line 75
    nop

    .line 80
    invoke-static {}, Landroidx/compose/material/TypographyKt;->getLocalTypography()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    invoke-virtual {v6, v8}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v6

    const/4 v10, 0x5

    aput-object v6, v3, v10

    .line 75
    nop

    .line 81
    new-instance v6, Landroidx/compose/material/MaterialThemeKt$MaterialTheme$1;

    invoke-direct {v6, v8, v4}, Landroidx/compose/material/MaterialThemeKt$MaterialTheme$1;-><init>(Landroidx/compose/material/Typography;Lkotlin/jvm/functions/Function2;)V

    const/16 v10, 0x36

    const v11, -0x67b7dd37

    invoke-static {v11, v13, v6, v7, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v6

    check-cast v6, Lkotlin/jvm/functions/Function2;

    sget v10, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    or-int/lit8 v10, v10, 0x30

    .line 74
    invoke-static {v3, v6, v7, v10}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 84
    .end local v0    # "rippleIndication":Landroidx/compose/foundation/IndicationNodeFactory;
    .end local v2    # "selectionColors":Landroidx/compose/foundation/text/selection/TextSelectionColors;
    .end local v15    # "rememberedColors":Landroidx/compose/material/Colors;
    :cond_17
    move-object v2, v8

    move v8, v1

    move-object v1, v14

    move-object v3, v9

    goto :goto_c

    .end local v8    # "typography":Landroidx/compose/material/Typography;
    .end local v9    # "shapes":Landroidx/compose/material/Shapes;
    .end local v14    # "colors":Landroidx/compose/material/Colors;
    .restart local p0    # "colors":Landroidx/compose/material/Colors;
    .restart local p1    # "typography":Landroidx/compose/material/Typography;
    .restart local p2    # "shapes":Landroidx/compose/material/Shapes;
    :cond_18
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v8

    move v8, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v9

    .end local p0    # "colors":Landroidx/compose/material/Colors;
    .end local p1    # "typography":Landroidx/compose/material/Typography;
    .end local p2    # "shapes":Landroidx/compose/material/Shapes;
    .local v1, "colors":Landroidx/compose/material/Colors;
    .local v2, "typography":Landroidx/compose/material/Typography;
    .local v3, "shapes":Landroidx/compose/material/Shapes;
    .local v8, "$dirty":I
    :goto_c
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v9

    if-eqz v9, :cond_19

    new-instance v0, Landroidx/compose/material/MaterialThemeKt$MaterialTheme$2;

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Landroidx/compose/material/MaterialThemeKt$MaterialTheme$2;-><init>(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_19
    return-void
.end method
