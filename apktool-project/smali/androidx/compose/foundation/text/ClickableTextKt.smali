.class public final Landroidx/compose/foundation/text/ClickableTextKt;
.super Ljava/lang/Object;
.source "ClickableText.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,104:1\n1247#2,6:105\n1247#2,6:111\n1247#2,6:117\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n81#1:105,6\n83#1:111,6\n98#1:117,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000fH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0014"
    }
    d2 = {
        "ClickableText",
        "",
        "text",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "style",
        "Landroidx/compose/ui/text/TextStyle;",
        "softWrap",
        "",
        "overflow",
        "Landroidx/compose/ui/text/style/TextOverflow;",
        "maxLines",
        "",
        "onTextLayout",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "onClick",
        "ClickableText-4YKlhWE",
        "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "foundation_release"
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
.method public static final ClickableText-4YKlhWE(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p0, "text"    # Landroidx/compose/ui/text/AnnotatedString;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "style"    # Landroidx/compose/ui/text/TextStyle;
    .param p3, "softWrap"    # Z
    .param p4, "overflow"    # I
    .param p5, "maxLines"    # I
    .param p6, "onTextLayout"    # Lkotlin/jvm/functions/Function1;
    .param p7, "onClick"    # Lkotlin/jvm/functions/Function1;
    .param p8, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p9, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/TextStyle;",
            "ZII",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation. Check LinkAnnotation\'s documentation for more details and samples."
    .end annotation

    .line 80
    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0xeb2f629

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(ClickableText)P(7,1,6,5,4:c#ui.text.style.TextOverflow!1,3)80@3824L52,82@3941L208,97@4370L76,90@4155L297:ClickableText.kt#423gt5"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p9

    .local v2, "$dirty":I
    and-int/lit8 v3, v10, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    :goto_1
    and-int/lit8 v3, v10, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_5

    move-object/from16 v5, p1

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    goto :goto_3

    :cond_5
    move-object/from16 v5, p1

    :goto_3
    and-int/lit8 v6, v10, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v2, v2, 0x180

    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v9, 0x180

    if-nez v7, :cond_8

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v2, v12

    goto :goto_5

    :cond_8
    move-object/from16 v7, p2

    :goto_5
    and-int/lit8 v12, v10, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v9, 0xc00

    if-nez v13, :cond_b

    move/from16 v13, p3

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v2, v14

    goto :goto_7

    :cond_b
    move/from16 v13, p3

    :goto_7
    and-int/lit8 v14, v10, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v2, v2, 0x6000

    move/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v9, 0x6000

    if-nez v15, :cond_e

    move/from16 v15, p4

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v2, v2, v16

    goto :goto_9

    :cond_e
    move/from16 v15, p4

    :goto_9
    and-int/lit8 v16, v10, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v2, v2, v17

    move/from16 v4, p5

    goto :goto_b

    :cond_f
    and-int v17, v9, v17

    if-nez v17, :cond_11

    move/from16 v4, p5

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v2, v2, v17

    goto :goto_b

    :cond_11
    move/from16 v4, p5

    :goto_b
    and-int/lit8 v17, v10, 0x40

    const/high16 v19, 0x180000

    if-eqz v17, :cond_12

    or-int v2, v2, v19

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v19, v9, v19

    if-nez v19, :cond_14

    move-object/from16 v0, p6

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v2, v2, v20

    goto :goto_d

    :cond_14
    move-object/from16 v0, p6

    :goto_d
    and-int/lit16 v0, v10, 0x80

    move/from16 v20, v0

    const/high16 v21, 0xc00000

    if-eqz v20, :cond_15

    or-int v2, v2, v21

    goto :goto_f

    :cond_15
    and-int v20, v9, v21

    if-nez v20, :cond_17

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v2, v2, v20

    :cond_17
    :goto_f
    const v20, 0x492493

    and-int v0, v2, v20

    move/from16 v20, v3

    const v3, 0x492492

    const/16 v22, 0x0

    const/16 v23, 0x1

    if-eq v0, v3, :cond_18

    move/from16 v0, v23

    goto :goto_10

    :cond_18
    move/from16 v0, v22

    :goto_10
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v1, v0, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_28

    if-eqz v20, :cond_19

    .line 73
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v5, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "modifier":Landroidx/compose/ui/Modifier;
    :cond_19
    if-eqz v6, :cond_1a

    .line 74
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    move-object v13, v0

    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v0, "style":Landroidx/compose/ui/text/TextStyle;
    goto :goto_11

    .line 73
    .end local v0    # "style":Landroidx/compose/ui/text/TextStyle;
    .restart local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    :cond_1a
    move-object v13, v7

    .line 74
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .local v13, "style":Landroidx/compose/ui/text/TextStyle;
    :goto_11
    if-eqz v12, :cond_1b

    .line 75
    const/4 v0, 0x1

    move/from16 v26, v16

    move/from16 v16, v0

    move/from16 v0, v26

    .end local p3    # "softWrap":Z
    .local v0, "softWrap":Z
    goto :goto_12

    .line 74
    .end local v0    # "softWrap":Z
    .restart local p3    # "softWrap":Z
    :cond_1b
    move/from16 v0, v16

    move/from16 v16, p3

    .line 75
    .end local p3    # "softWrap":Z
    .local v16, "softWrap":Z
    :goto_12
    if-eqz v14, :cond_1c

    .line 76
    sget-object v3, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v3

    move v15, v3

    .end local p4    # "overflow":I
    .local v15, "overflow":I
    :cond_1c
    if-eqz v0, :cond_1d

    .line 77
    const v0, 0x7fffffff

    move/from16 v26, v17

    move/from16 v17, v0

    move/from16 v0, v26

    .end local p5    # "maxLines":I
    .local v0, "maxLines":I
    goto :goto_13

    .line 76
    .end local v0    # "maxLines":I
    .restart local p5    # "maxLines":I
    :cond_1d
    move/from16 v0, v17

    move/from16 v17, v4

    .line 77
    .end local p5    # "maxLines":I
    .local v17, "maxLines":I
    :goto_13
    if-eqz v0, :cond_1e

    .line 78
    sget-object v0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$1;->INSTANCE:Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .end local p6    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v0, "onTextLayout":Lkotlin/jvm/functions/Function1;
    goto :goto_14

    .line 77
    .end local v0    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local p6    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_1e
    move-object/from16 v0, p6

    .line 78
    .end local p6    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v0    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :goto_14
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_1f

    .line 80
    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)"

    const v6, -0xeb2f629

    invoke-static {v6, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1f
    nop

    .line 81
    const v3, 0x594abbbc

    const-string v4, "CC(remember):ClickableText.kt#9igjgp"

    invoke-static {v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .local v3, "invalid$iv":Z
    move-object v6, v1

    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 105
    .local v7, "$i$f$cache":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 106
    .local v14, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p1, v3

    .end local v3    # "invalid$iv":Z
    .local p1, "invalid$iv":Z
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v12, v3, :cond_20

    .line 107
    const/4 v3, 0x0

    .line 81
    .local v3, "$i$a$-cache-ClickableTextKt$ClickableText$layoutResult$1":I
    move/from16 p2, v3

    .end local v3    # "$i$a$-cache-ClickableTextKt$ClickableText$layoutResult$1":I
    .local p2, "$i$a$-cache-ClickableTextKt$ClickableText$layoutResult$1":I
    const/4 v3, 0x0

    move/from16 p3, v7

    const/4 v7, 0x2

    .end local v7    # "$i$f$cache":I
    .local p3, "$i$f$cache":I
    invoke-static {v3, v3, v7, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v3

    .line 107
    .end local p2    # "$i$a$-cache-ClickableTextKt$ClickableText$layoutResult$1":I
    nop

    .line 108
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 109
    move-object v12, v3

    .end local v3    # "value$iv":Ljava/lang/Object;
    goto :goto_15

    .line 110
    .end local p3    # "$i$f$cache":I
    .restart local v7    # "$i$f$cache":I
    :cond_20
    move/from16 p3, v7

    .line 105
    .end local v7    # "$i$f$cache":I
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .restart local p3    # "$i$f$cache":I
    :goto_15
    nop

    .line 81
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p1    # "invalid$iv":Z
    .end local p3    # "$i$f$cache":I
    move-object v3, v12

    check-cast v3, Landroidx/compose/runtime/MutableState;

    .local v3, "layoutResult":Landroidx/compose/runtime/MutableState;
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 83
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v6, Landroidx/compose/ui/Modifier;

    const v7, 0x594acaf8

    invoke-static {v1, v7, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v7, 0x1c00000

    and-int/2addr v7, v2

    const/high16 v12, 0x800000

    if-ne v7, v12, :cond_21

    move/from16 v7, v23

    goto :goto_16

    :cond_21
    move/from16 v7, v22

    .local v7, "invalid$iv":Z
    :goto_16
    move-object v12, v1

    .local v12, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v14, 0x0

    .line 111
    .local v14, "$i$f$cache":I
    move/from16 p1, v7

    .end local v7    # "invalid$iv":Z
    .restart local p1    # "invalid$iv":Z
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 112
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p1, :cond_23

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_22

    goto :goto_17

    .line 116
    :cond_22
    goto :goto_18

    .line 113
    :cond_23
    :goto_17
    const/4 v9, 0x0

    .line 83
    .local v9, "$i$a$-cache-ClickableTextKt$ClickableText$pressIndicator$1":I
    move-object/from16 p2, v7

    .end local v7    # "it$iv":Ljava/lang/Object;
    .local p2, "it$iv":Ljava/lang/Object;
    new-instance v7, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1;

    invoke-direct {v7, v3, v8}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1;-><init>(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)V

    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 113
    .end local v9    # "$i$a$-cache-ClickableTextKt$ClickableText$pressIndicator$1":I
    nop

    .line 114
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 115
    nop

    .line 111
    .end local v7    # "value$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p2    # "it$iv":Ljava/lang/Object;
    :goto_18
    nop

    .line 83
    .end local v12    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v14    # "$i$f$cache":I
    .end local p1    # "invalid$iv":Z
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v6, v8, v7}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 82
    nop

    .line 93
    .local v6, "pressIndicator":Landroidx/compose/ui/Modifier;
    invoke-interface {v5, v6}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    .line 92
    nop

    .line 93
    nop

    .line 94
    nop

    .line 98
    const v7, 0x594b0014

    invoke-static {v1, v7, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v4, 0x380000

    and-int v7, v2, v4

    const/high16 v9, 0x100000

    if-ne v7, v9, :cond_24

    move/from16 v22, v23

    .local v22, "invalid$iv":Z
    :cond_24
    move-object v7, v1

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 117
    .local v9, "$i$f$cache":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 118
    .restart local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v22, :cond_26

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p1, v4

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v14, v4, :cond_25

    goto :goto_19

    .line 122
    :cond_25
    move-object/from16 p8, v1

    goto :goto_1a

    .line 118
    :cond_26
    move/from16 p1, v4

    .line 119
    :goto_19
    const/4 v4, 0x0

    .line 98
    .local v4, "$i$a$-cache-ClickableTextKt$ClickableText$2":I
    move-object/from16 p8, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p8    # "$composer":Landroidx/compose/runtime/Composer;
    new-instance v1, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$2$1;

    invoke-direct {v1, v3, v0}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$2$1;-><init>(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 119
    .end local v4    # "$i$a$-cache-ClickableTextKt$ClickableText$2":I
    nop

    .line 120
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 121
    move-object v14, v1

    .line 117
    .end local v1    # "value$iv":Ljava/lang/Object;
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_1a
    nop

    .line 98
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    .end local v22    # "invalid$iv":Z
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static/range {p8 .. p8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 96
    nop

    .line 95
    nop

    .line 97
    and-int/lit8 v1, v2, 0xe

    and-int/lit16 v4, v2, 0x380

    or-int/2addr v1, v4

    const v4, 0xe000

    and-int/2addr v4, v2

    or-int/2addr v1, v4

    const/high16 v4, 0x70000

    shl-int/lit8 v7, v2, 0x6

    and-int/2addr v4, v7

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    and-int v4, v4, p1

    or-int v23, v1, v4

    .line 91
    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x780

    move-object/from16 v22, p8

    .end local p8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v22, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v11 .. v25}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-CL7eQgs(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 103
    .end local v3    # "layoutResult":Landroidx/compose/runtime/MutableState;
    .end local v6    # "pressIndicator":Landroidx/compose/ui/Modifier;
    :cond_27
    move-object v7, v0

    move-object v3, v13

    move/from16 v4, v16

    move/from16 v6, v17

    goto :goto_1b

    .end local v0    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .end local v5    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v13    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local v15    # "overflow":I
    .end local v16    # "softWrap":Z
    .end local v17    # "maxLines":I
    .end local v22    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    .local p1, "modifier":Landroidx/compose/ui/Modifier;
    .local p2, "style":Landroidx/compose/ui/text/TextStyle;
    .local p3, "softWrap":Z
    .restart local p4    # "overflow":I
    .restart local p5    # "maxLines":I
    .restart local p6    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    :cond_28
    move-object/from16 v22, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v22    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v6, v4

    move-object v3, v7

    move/from16 v4, p3

    move-object/from16 v7, p6

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "style":Landroidx/compose/ui/text/TextStyle;
    .end local p3    # "softWrap":Z
    .end local p4    # "overflow":I
    .end local p5    # "maxLines":I
    .end local p6    # "onTextLayout":Lkotlin/jvm/functions/Function1;
    .local v3, "style":Landroidx/compose/ui/text/TextStyle;
    .local v4, "softWrap":Z
    .restart local v5    # "modifier":Landroidx/compose/ui/Modifier;
    .local v6, "maxLines":I
    .local v7, "onTextLayout":Lkotlin/jvm/functions/Function1;
    .restart local v15    # "overflow":I
    :goto_1b
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_29

    new-instance v0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$3;

    move-object/from16 v1, p0

    move/from16 v9, p9

    move v12, v2

    move-object v2, v5

    move v5, v15

    .end local v15    # "overflow":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "overflow":I
    .local v12, "$dirty":I
    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$3;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_1c

    .end local v12    # "$dirty":I
    .local v2, "$dirty":I
    .local v5, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v15    # "overflow":I
    :cond_29
    move v12, v2

    move-object v2, v5

    move v5, v15

    .end local v15    # "overflow":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "overflow":I
    .restart local v12    # "$dirty":I
    :goto_1c
    return-void
.end method
