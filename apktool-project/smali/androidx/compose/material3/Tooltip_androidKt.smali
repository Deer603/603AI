.class public final Landroidx/compose/material3/Tooltip_androidKt;
.super Ljava/lang/Object;
.source "Tooltip.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,326:1\n148#2:327\n148#2:328\n482#2:329\n482#2:340\n148#2:349\n77#3:330\n77#3:331\n77#3:338\n77#3:341\n77#3:342\n1223#4,6:332\n1223#4,6:343\n50#5:339\n*S KotlinDebug\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n*L\n218#1:327\n219#1:328\n76#1:329\n153#1:340\n237#1:349\n77#1:330\n78#1:331\n149#1:338\n154#1:341\n155#1:342\n79#1:332,6\n156#1:343,6\n149#1:339\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001ao\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010\u00a2\u0006\u0002\u0008\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0093\u0001\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0015\u0008\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u00112\u0015\u0008\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u00112\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010\u00a2\u0006\u0002\u0008\u0011H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001aH\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010%\u001a\u0004\u0018\u00010&H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006)"
    }
    d2 = {
        "PlainTooltip",
        "",
        "Landroidx/compose/material3/TooltipScope;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "caretSize",
        "Landroidx/compose/ui/unit/DpSize;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "contentColor",
        "Landroidx/compose/ui/graphics/Color;",
        "containerColor",
        "tonalElevation",
        "Landroidx/compose/ui/unit/Dp;",
        "shadowElevation",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "PlainTooltip-7QI4Sbk",
        "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "RichTooltip",
        "title",
        "action",
        "colors",
        "Landroidx/compose/material3/RichTooltipColors;",
        "text",
        "RichTooltip-yDvdmqw",
        "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "drawCaretWithPath",
        "Landroidx/compose/ui/draw/DrawResult;",
        "Landroidx/compose/ui/draw/CacheDrawScope;",
        "caretType",
        "Landroidx/compose/material3/CaretType;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "configuration",
        "Landroid/content/res/Configuration;",
        "anchorLayoutCoordinates",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "drawCaretWithPath-JKu-mZY",
        "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/material3/CaretType;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJLandroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;",
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
.method public static final PlainTooltip-7QI4Sbk(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .param p0, "$this$PlainTooltip_u2d7QI4Sbk"    # Landroidx/compose/material3/TooltipScope;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "caretSize"    # J
    .param p4, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p5, "contentColor"    # J
    .param p7, "containerColor"    # J
    .param p9, "tonalElevation"    # F
    .param p10, "shadowElevation"    # F
    .param p11, "content"    # Lkotlin/jvm/functions/Function2;
    .param p12, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p13, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/TooltipScope;",
            "Landroidx/compose/ui/Modifier;",
            "J",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFF",
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

    .line 74
    move-object/from16 v1, p0

    move-object/from16 v12, p11

    move/from16 v13, p13

    move/from16 v14, p14

    const v0, 0x53de2e14

    move-object/from16 v2, p12

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .end local p12    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$composer":Landroidx/compose/runtime/Composer;
    const-string v3, "C(PlainTooltip)P(4,0:c#ui.unit.DpSize,6,3:c#ui.graphics.Color,1:c#ui.graphics.Color,7:c#ui.unit.Dp,5:c#ui.unit.Dp)208@8412L26,209@8482L24,211@8552L26,96@3876L606,90@3685L797:Tooltip.android.kt#uh7d8r"

    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p13

    .local v3, "$dirty":I
    const/high16 v4, -0x80000000

    and-int/2addr v4, v14

    if-eqz v4, :cond_0

    or-int/lit8 v3, v3, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v4, v13, 0x6

    if-nez v4, :cond_3

    and-int/lit8 v4, v13, 0x8

    if-nez v4, :cond_1

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_1
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_2

    const/4 v4, 0x4

    goto :goto_1

    :cond_2
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v3, v4

    :cond_3
    :goto_2
    and-int/lit8 v4, v14, 0x1

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, v13, 0x30

    if-nez v5, :cond_6

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    goto :goto_4

    :cond_6
    move-object/from16 v5, p1

    :goto_4
    and-int/lit16 v6, v13, 0x180

    if-nez v6, :cond_9

    and-int/lit8 v6, v14, 0x2

    if-nez v6, :cond_7

    move-wide/from16 v8, p2

    invoke-interface {v2, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_5

    :cond_7
    move-wide/from16 v8, p2

    :cond_8
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v3, v6

    goto :goto_6

    :cond_9
    move-wide/from16 v8, p2

    :goto_6
    and-int/lit16 v6, v13, 0xc00

    if-nez v6, :cond_c

    and-int/lit8 v6, v14, 0x4

    if-nez v6, :cond_a

    move-object/from16 v6, p4

    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_7

    :cond_a
    move-object/from16 v6, p4

    :cond_b
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v3, v10

    goto :goto_8

    :cond_c
    move-object/from16 v6, p4

    :goto_8
    and-int/lit16 v10, v13, 0x6000

    if-nez v10, :cond_f

    and-int/lit8 v10, v14, 0x8

    if-nez v10, :cond_d

    move-wide/from16 v10, p5

    invoke-interface {v2, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v15

    if-eqz v15, :cond_e

    const/16 v15, 0x4000

    goto :goto_9

    :cond_d
    move-wide/from16 v10, p5

    :cond_e
    const/16 v15, 0x2000

    :goto_9
    or-int/2addr v3, v15

    goto :goto_a

    :cond_f
    move-wide/from16 v10, p5

    :goto_a
    const/high16 v15, 0x30000

    and-int v16, v13, v15

    move/from16 p12, v15

    if-nez v16, :cond_12

    and-int/lit8 v16, v14, 0x10

    if-nez v16, :cond_10

    move-wide/from16 v7, p7

    invoke-interface {v2, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v9

    if-eqz v9, :cond_11

    const/high16 v9, 0x20000

    goto :goto_b

    :cond_10
    move-wide/from16 v7, p7

    :cond_11
    const/high16 v9, 0x10000

    :goto_b
    or-int/2addr v3, v9

    goto :goto_c

    :cond_12
    move-wide/from16 v7, p7

    :goto_c
    and-int/lit8 v9, v14, 0x20

    const/high16 v17, 0x180000

    if-eqz v9, :cond_13

    or-int v3, v3, v17

    move/from16 v15, p9

    goto :goto_e

    :cond_13
    and-int v17, v13, v17

    if-nez v17, :cond_15

    move/from16 v15, p9

    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v18

    if-eqz v18, :cond_14

    const/high16 v18, 0x100000

    goto :goto_d

    :cond_14
    const/high16 v18, 0x80000

    :goto_d
    or-int v3, v3, v18

    goto :goto_e

    :cond_15
    move/from16 v15, p9

    :goto_e
    and-int/lit8 v18, v14, 0x40

    const/high16 v19, 0xc00000

    if-eqz v18, :cond_16

    or-int v3, v3, v19

    move/from16 v0, p10

    goto :goto_10

    :cond_16
    and-int v20, v13, v19

    if-nez v20, :cond_18

    move/from16 v0, p10

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v21

    if-eqz v21, :cond_17

    const/high16 v21, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v21, 0x400000

    :goto_f
    or-int v3, v3, v21

    goto :goto_10

    :cond_18
    move/from16 v0, p10

    :goto_10
    and-int/lit16 v0, v14, 0x80

    const/high16 v21, 0x6000000

    if-eqz v0, :cond_19

    or-int v3, v3, v21

    goto :goto_12

    :cond_19
    and-int v0, v13, v21

    if-nez v0, :cond_1b

    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const/high16 v0, 0x4000000

    goto :goto_11

    :cond_1a
    const/high16 v0, 0x2000000

    :goto_11
    or-int/2addr v3, v0

    :cond_1b
    :goto_12
    const v0, 0x2492493

    and-int/2addr v0, v3

    move/from16 v21, v4

    const v4, 0x2492492

    if-ne v0, v4, :cond_1d

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_13

    .line 116
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v25, v2

    move-object v2, v5

    move-object v5, v6

    move-wide v8, v7

    move-wide v6, v10

    move v10, v15

    move/from16 v11, p10

    move v15, v3

    move-wide/from16 v3, p2

    goto/16 :goto_1e

    .line 74
    :cond_1d
    :goto_13
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v13, 0x1

    const v4, -0x70001

    const v22, -0xe001

    if-eqz v0, :cond_23

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_14

    .line 328
    :cond_1e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v14, 0x2

    if-eqz v0, :cond_1f

    and-int/lit16 v3, v3, -0x381

    :cond_1f
    and-int/lit8 v0, v14, 0x4

    if-eqz v0, :cond_20

    and-int/lit16 v3, v3, -0x1c01

    :cond_20
    and-int/lit8 v0, v14, 0x8

    if-eqz v0, :cond_21

    and-int v3, v3, v22

    :cond_21
    and-int/lit8 v0, v14, 0x10

    if-eqz v0, :cond_22

    and-int v0, v3, v4

    move-wide/from16 v3, p2

    move/from16 v22, p10

    move/from16 v21, v15

    .end local v3    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_16

    .end local v0    # "$dirty":I
    .restart local v3    # "$dirty":I
    :cond_22
    move/from16 v22, p10

    move v0, v3

    move/from16 v21, v15

    move-wide/from16 v3, p2

    goto/16 :goto_16

    .line 74
    :cond_23
    :goto_14
    if-eqz v21, :cond_24

    .line 207
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v5, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "modifier":Landroidx/compose/ui/Modifier;
    :cond_24
    and-int/lit8 v0, v14, 0x2

    if-eqz v0, :cond_25

    .line 208
    sget-object v0, Landroidx/compose/ui/unit/DpSize;->Companion:Landroidx/compose/ui/unit/DpSize$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/DpSize$Companion;->getUnspecified-MYxV2XQ()J

    move-result-wide v23

    .end local p2    # "caretSize":J
    .local v23, "caretSize":J
    and-int/lit16 v3, v3, -0x381

    goto :goto_15

    .line 207
    .end local v23    # "caretSize":J
    .restart local p2    # "caretSize":J
    :cond_25
    move-wide/from16 v23, p2

    .line 208
    .end local p2    # "caretSize":J
    .restart local v23    # "caretSize":J
    :goto_15
    and-int/lit8 v0, v14, 0x4

    move/from16 v21, v4

    const/4 v4, 0x6

    if-eqz v0, :cond_26

    .line 209
    nop

    .line 208
    sget-object v0, Landroidx/compose/material3/TooltipDefaults;->INSTANCE:Landroidx/compose/material3/TooltipDefaults;

    .line 209
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/TooltipDefaults;->getPlainTooltipContainerShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v0

    .end local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v0, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int/lit16 v3, v3, -0x1c01

    move-object v6, v0

    .end local v0    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v6, "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_26
    and-int/lit8 v0, v14, 0x8

    if-eqz v0, :cond_27

    .line 210
    nop

    .line 209
    sget-object v0, Landroidx/compose/material3/TooltipDefaults;->INSTANCE:Landroidx/compose/material3/TooltipDefaults;

    .line 210
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/TooltipDefaults;->getPlainTooltipContentColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    .end local p5    # "contentColor":J
    .local v10, "contentColor":J
    and-int v3, v3, v22

    :cond_27
    and-int/lit8 v0, v14, 0x10

    if-eqz v0, :cond_28

    .line 212
    nop

    .line 211
    sget-object v0, Landroidx/compose/material3/TooltipDefaults;->INSTANCE:Landroidx/compose/material3/TooltipDefaults;

    .line 212
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/TooltipDefaults;->getPlainTooltipContainerColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    .end local p7    # "containerColor":J
    .local v7, "containerColor":J
    and-int v3, v3, v21

    :cond_28
    if-eqz v9, :cond_29

    .line 218
    const/4 v0, 0x0

    .local v0, "$this$dp$iv":I
    const/4 v4, 0x0

    .line 327
    .local v4, "$i$f$getDp":I
    int-to-float v9, v0

    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    move v15, v0

    .end local v0    # "$this$dp$iv":I
    .end local v4    # "$i$f$getDp":I
    .end local p9    # "tonalElevation":F
    .local v15, "tonalElevation":F
    :cond_29
    if-eqz v18, :cond_2a

    .line 219
    const/4 v0, 0x0

    .restart local v0    # "$this$dp$iv":I
    const/4 v4, 0x0

    .line 328
    .restart local v4    # "$i$f$getDp":I
    int-to-float v9, v0

    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    move/from16 v22, v0

    move v0, v3

    move/from16 v21, v15

    move-wide/from16 v3, v23

    .end local v4    # "$i$f$getDp":I
    .end local p10    # "shadowElevation":F
    .local v0, "shadowElevation":F
    goto :goto_16

    .line 327
    .end local v0    # "shadowElevation":F
    .restart local p10    # "shadowElevation":F
    :cond_2a
    move/from16 v22, p10

    move v0, v3

    move/from16 v21, v15

    move-wide/from16 v3, v23

    .line 328
    .end local v15    # "tonalElevation":F
    .end local v23    # "caretSize":J
    .end local p10    # "shadowElevation":F
    .local v0, "$dirty":I
    .local v3, "caretSize":J
    .local v21, "tonalElevation":F
    .local v22, "shadowElevation":F
    :goto_16
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_2b

    .line 74
    const/4 v9, -0x1

    const-string v15, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:73)"

    move-object/from16 p8, v6

    const v6, 0x53de2e14

    .end local v6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local p8, "shape":Landroidx/compose/ui/graphics/Shape;
    invoke-static {v6, v0, v9, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_17

    .line 328
    .end local p8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local v6    # "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_2b
    move-object/from16 p8, v6

    .line 74
    .end local v6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p8    # "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_17
    const v6, -0x13e6272f

    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v6, "76@3183L7,77@3242L7,78@3281L343"

    invoke-static {v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 76
    move-wide/from16 v23, v3

    .local v23, "$this$isSpecified$iv":J
    const/4 v6, 0x0

    .line 329
    .local v6, "$i$f$isSpecified-EaSLcWc":I
    const-wide v25, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v9, v23, v25

    if-eqz v9, :cond_2c

    const/4 v6, 0x1

    goto :goto_18

    :cond_2c
    const/4 v6, 0x0

    .line 76
    .end local v6    # "$i$f$isSpecified-EaSLcWc":I
    .end local v23    # "$this$isSpecified$iv":J
    :goto_18
    if-eqz v6, :cond_35

    .line 77
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    check-cast v6, Landroidx/compose/runtime/CompositionLocal;

    .local v6, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v9, 0x0

    .local v9, "$changed$iv":I
    const/16 v18, 0x0

    .line 330
    .local v18, "$i$f$getCurrent":I
    const v15, 0x789c5f52

    move/from16 p2, v9

    .end local v9    # "$changed$iv":I
    .local p2, "$changed$iv":I
    const-string v9, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v2, v15, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 77
    .end local v6    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v18    # "$i$f$getCurrent":I
    .end local p2    # "$changed$iv":I
    move-object v6, v9

    check-cast v6, Landroidx/compose/ui/unit/Density;

    .line 78
    .local v6, "density":Landroidx/compose/ui/unit/Density;
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v9

    check-cast v9, Landroidx/compose/runtime/CompositionLocal;

    .local v9, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v15, 0x0

    .local v15, "$changed$iv":I
    const/16 v18, 0x0

    .line 331
    .restart local v18    # "$i$f$getCurrent":I
    const v13, 0x789c5f52

    const-string v14, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v2, v13, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 78
    .end local v9    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v15    # "$changed$iv":I
    .end local v18    # "$i$f$getCurrent":I
    move-object v9, v13

    check-cast v9, Landroid/content/res/Configuration;

    .line 79
    .local v9, "configuration":Landroid/content/res/Configuration;
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v13, Landroidx/compose/ui/Modifier;

    const v14, -0x13e6134d

    const-string v15, "CC(remember):Tooltip.android.kt#9igjgp"

    invoke-static {v2, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v14, v15

    const/high16 v15, 0x70000

    and-int/2addr v15, v0

    xor-int v15, v15, p12

    move-object/from16 p2, v6

    const/high16 v6, 0x20000

    .end local v6    # "density":Landroidx/compose/ui/unit/Density;
    .local p2, "density":Landroidx/compose/ui/unit/Density;
    if-le v15, v6, :cond_2d

    invoke-interface {v2, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v6

    if-nez v6, :cond_2e

    :cond_2d
    and-int v6, v0, p12

    const/high16 v15, 0x20000

    if-ne v6, v15, :cond_2f

    :cond_2e
    const/4 v6, 0x1

    goto :goto_19

    :cond_2f
    const/4 v6, 0x0

    :goto_19
    or-int/2addr v6, v14

    and-int/lit16 v14, v0, 0x380

    xor-int/lit16 v14, v14, 0x180

    const/16 v15, 0x100

    if-le v14, v15, :cond_30

    invoke-interface {v2, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v14

    if-nez v14, :cond_31

    :cond_30
    and-int/lit16 v14, v0, 0x180

    const/16 v15, 0x100

    if-ne v14, v15, :cond_32

    :cond_31
    const/4 v15, 0x1

    goto :goto_1a

    :cond_32
    const/4 v15, 0x0

    :goto_1a
    or-int/2addr v6, v15

    .local v6, "invalid$iv":Z
    move-object v14, v2

    .local v14, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v15, 0x0

    .line 332
    .local v15, "$i$f$cache":I
    move/from16 p10, v0

    .end local v0    # "$dirty":I
    .local p10, "$dirty":I
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 333
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v6, :cond_34

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-wide/from16 p6, v3

    .end local v3    # "caretSize":J
    .local p6, "caretSize":J
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_33

    goto :goto_1b

    .line 337
    :cond_33
    move-object/from16 v4, p2

    move-object v3, v0

    move-wide/from16 v17, v7

    move-wide/from16 v7, p6

    goto :goto_1c

    .line 333
    .end local p6    # "caretSize":J
    .restart local v3    # "caretSize":J
    :cond_34
    move-wide/from16 p6, v3

    .line 334
    .end local v3    # "caretSize":J
    .restart local p6    # "caretSize":J
    :goto_1b
    const/4 v3, 0x0

    .line 79
    .local v3, "$i$a$-cache-Tooltip_androidKt$PlainTooltip$drawCaretModifier$1":I
    new-instance v4, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$drawCaretModifier$1$1;

    move-object/from16 p1, v4

    move-wide/from16 p4, v7

    move-object/from16 p3, v9

    .end local v7    # "containerColor":J
    .end local v9    # "configuration":Landroid/content/res/Configuration;
    .local p3, "configuration":Landroid/content/res/Configuration;
    .local p4, "containerColor":J
    invoke-direct/range {p1 .. p7}, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$drawCaretModifier$1$1;-><init>(Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJ)V

    move-object/from16 v20, p1

    move-object/from16 v4, p2

    move-wide/from16 v17, p4

    move-wide/from16 v7, p6

    .end local p2    # "density":Landroidx/compose/ui/unit/Density;
    .end local p3    # "configuration":Landroid/content/res/Configuration;
    .end local p4    # "containerColor":J
    .end local p6    # "caretSize":J
    .local v4, "density":Landroidx/compose/ui/unit/Density;
    .local v7, "caretSize":J
    .restart local v9    # "configuration":Landroid/content/res/Configuration;
    .local v17, "containerColor":J
    move-object/from16 v3, v20

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 334
    .end local v3    # "$i$a$-cache-Tooltip_androidKt$PlainTooltip$drawCaretModifier$1":I
    nop

    .line 335
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 336
    nop

    .line 333
    .end local v3    # "value$iv":Ljava/lang/Object;
    :goto_1c
    nop

    .line 332
    .end local v0    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 79
    .end local v6    # "invalid$iv":Z
    .end local v14    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v15    # "$i$f$cache":I
    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-interface {v1, v13, v3}, Landroidx/compose/material3/TooltipScope;->drawCaret(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 89
    invoke-interface {v0, v5}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v15, v0

    .end local v4    # "density":Landroidx/compose/ui/unit/Density;
    .end local v9    # "configuration":Landroid/content/res/Configuration;
    goto :goto_1d

    .line 90
    .end local v17    # "containerColor":J
    .end local p10    # "$dirty":I
    .local v0, "$dirty":I
    .local v3, "caretSize":J
    .local v7, "containerColor":J
    :cond_35
    move/from16 p10, v0

    move-wide/from16 v17, v7

    move-wide v7, v3

    .end local v0    # "$dirty":I
    .end local v3    # "caretSize":J
    .local v7, "caretSize":J
    .restart local v17    # "containerColor":J
    .restart local p10    # "$dirty":I
    move-object v15, v5

    .line 76
    :goto_1d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 75
    nop

    .line 92
    .local v15, "drawCaretModifier":Landroidx/compose/ui/Modifier;
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
    new-instance v0, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$1;

    invoke-direct {v0, v10, v11, v12}, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$1;-><init>(JLkotlin/jvm/functions/Function2;)V

    const/16 v3, 0x36

    const v4, 0x553dda6f

    const/4 v6, 0x1

    invoke-static {v4, v6, v0, v2, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v0, p10, 0x6

    and-int/lit8 v0, v0, 0x70

    or-int v0, v0, v19

    shr-int/lit8 v3, p10, 0x9

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v0, v3

    shr-int/lit8 v3, p10, 0x6

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    shr-int/lit8 v3, p10, 0x6

    const/high16 v4, 0x70000

    and-int/2addr v3, v4

    or-int v26, v0, v3

    .line 91
    const-wide/16 v19, 0x0

    const/16 v23, 0x0

    const/16 v27, 0x48

    move-object/from16 v16, p8

    move-object/from16 v25, v2

    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v16, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v25, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v15 .. v27}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 116
    .end local v15    # "drawCaretModifier":Landroidx/compose/ui/Modifier;
    :cond_36
    move/from16 v15, p10

    move-object v2, v5

    move-wide v3, v7

    move-wide v6, v10

    move-object/from16 v5, v16

    move-wide/from16 v8, v17

    move/from16 v10, v21

    move/from16 v11, v22

    .end local v7    # "caretSize":J
    .end local v16    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v17    # "containerColor":J
    .end local v21    # "tonalElevation":F
    .end local v22    # "shadowElevation":F
    .end local p10    # "$dirty":I
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v3    # "caretSize":J
    .local v5, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v6, "contentColor":J
    .local v8, "containerColor":J
    .local v10, "tonalElevation":F
    .local v11, "shadowElevation":F
    .local v15, "$dirty":I
    :goto_1e
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_37

    move-object v13, v0

    new-instance v0, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$2;

    move/from16 v14, p14

    move/from16 p1, v15

    move-object v15, v13

    move/from16 v13, p13

    .end local v15    # "$dirty":I
    .local p1, "$dirty":I
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/Tooltip_androidKt$PlainTooltip$2;-><init>(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_1f

    .end local p1    # "$dirty":I
    .restart local v15    # "$dirty":I
    :cond_37
    move/from16 p1, v15

    .end local v15    # "$dirty":I
    .restart local p1    # "$dirty":I
    :goto_1f
    return-void
.end method

.method public static final RichTooltip-yDvdmqw(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .param p0, "$this$RichTooltip_u2dyDvdmqw"    # Landroidx/compose/material3/TooltipScope;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "title"    # Lkotlin/jvm/functions/Function2;
    .param p3, "action"    # Lkotlin/jvm/functions/Function2;
    .param p4, "caretSize"    # J
    .param p6, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p7, "colors"    # Landroidx/compose/material3/RichTooltipColors;
    .param p8, "tonalElevation"    # F
    .param p9, "shadowElevation"    # F
    .param p10, "text"    # Lkotlin/jvm/functions/Function2;
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/TooltipScope;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;J",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/RichTooltipColors;",
            "FF",
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

    .line 148
    move-object/from16 v1, p0

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    const v0, 0x6f4f19c9

    move-object/from16 v2, p11

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$composer":Landroidx/compose/runtime/Composer;
    const-string v3, "C(RichTooltip)P(3,7!1,1:c#ui.unit.DpSize,5!1,8:c#ui.unit.Dp,4:c#ui.unit.Dp)255@9959L25,257@10034L19,*148@5873L7,150@5944L11,150@5956L61,178@6991L1595,167@6622L1964:Tooltip.android.kt#uh7d8r"

    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p12

    .local v3, "$dirty":I
    const/high16 v4, -0x80000000

    and-int/2addr v4, v13

    if-eqz v4, :cond_0

    or-int/lit8 v3, v3, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v4, v12, 0x6

    if-nez v4, :cond_3

    and-int/lit8 v4, v12, 0x8

    if-nez v4, :cond_1

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_1
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_2

    const/4 v4, 0x4

    goto :goto_1

    :cond_2
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v3, v4

    :cond_3
    :goto_2
    and-int/lit8 v4, v13, 0x1

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_6

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    goto :goto_4

    :cond_6
    move-object/from16 v5, p1

    :goto_4
    and-int/lit8 v6, v13, 0x2

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    move-object/from16 v7, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v7, v12, 0x180

    if-nez v7, :cond_9

    move-object/from16 v7, p2

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v3, v8

    goto :goto_6

    :cond_9
    move-object/from16 v7, p2

    :goto_6
    and-int/lit8 v8, v13, 0x4

    if-eqz v8, :cond_a

    or-int/lit16 v3, v3, 0xc00

    move-object/from16 v9, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v9, v12, 0xc00

    if-nez v9, :cond_c

    move-object/from16 v9, p3

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_7

    :cond_b
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v3, v10

    goto :goto_8

    :cond_c
    move-object/from16 v9, p3

    :goto_8
    and-int/lit16 v10, v12, 0x6000

    if-nez v10, :cond_f

    and-int/lit8 v10, v13, 0x8

    if-nez v10, :cond_d

    move-wide/from16 v14, p4

    invoke-interface {v2, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v10

    if-eqz v10, :cond_e

    const/16 v10, 0x4000

    goto :goto_9

    :cond_d
    move-wide/from16 v14, p4

    :cond_e
    const/16 v10, 0x2000

    :goto_9
    or-int/2addr v3, v10

    goto :goto_a

    :cond_f
    move-wide/from16 v14, p4

    :goto_a
    const/high16 v10, 0x30000

    and-int/2addr v10, v12

    if-nez v10, :cond_12

    and-int/lit8 v10, v13, 0x10

    if-nez v10, :cond_10

    move-object/from16 v10, p6

    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_b

    :cond_10
    move-object/from16 v10, p6

    :cond_11
    const/high16 v16, 0x10000

    :goto_b
    or-int v3, v3, v16

    goto :goto_c

    :cond_12
    move-object/from16 v10, p6

    :goto_c
    const/high16 v16, 0x180000

    and-int v16, v12, v16

    if-nez v16, :cond_15

    and-int/lit8 v16, v13, 0x20

    if-nez v16, :cond_13

    move-object/from16 v0, p7

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_14

    const/high16 v17, 0x100000

    goto :goto_d

    :cond_13
    move-object/from16 v0, p7

    :cond_14
    const/high16 v17, 0x80000

    :goto_d
    or-int v3, v3, v17

    goto :goto_e

    :cond_15
    move-object/from16 v0, p7

    :goto_e
    and-int/lit8 v17, v13, 0x40

    const/high16 v18, 0xc00000

    if-eqz v17, :cond_16

    or-int v3, v3, v18

    move/from16 v0, p8

    goto :goto_10

    :cond_16
    and-int v19, v12, v18

    if-nez v19, :cond_18

    move/from16 v0, p8

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v19

    if-eqz v19, :cond_17

    const/high16 v19, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v19, 0x400000

    :goto_f
    or-int v3, v3, v19

    goto :goto_10

    :cond_18
    move/from16 v0, p8

    :goto_10
    and-int/lit16 v0, v13, 0x80

    const/high16 v19, 0x6000000

    if-eqz v0, :cond_19

    or-int v3, v3, v19

    move/from16 v19, v0

    move/from16 v0, p9

    goto :goto_12

    :cond_19
    and-int v19, v12, v19

    if-nez v19, :cond_1b

    move/from16 v19, v0

    move/from16 v0, p9

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v20

    if-eqz v20, :cond_1a

    const/high16 v20, 0x4000000

    goto :goto_11

    :cond_1a
    const/high16 v20, 0x2000000

    :goto_11
    or-int v3, v3, v20

    goto :goto_12

    :cond_1b
    move/from16 v19, v0

    move/from16 v0, p9

    :goto_12
    and-int/lit16 v0, v13, 0x100

    const/high16 v20, 0x30000000

    if-eqz v0, :cond_1c

    or-int v3, v3, v20

    goto :goto_14

    :cond_1c
    and-int v0, v12, v20

    if-nez v0, :cond_1e

    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const/high16 v0, 0x20000000

    goto :goto_13

    :cond_1d
    const/high16 v0, 0x10000000

    :goto_13
    or-int/2addr v3, v0

    :cond_1e
    :goto_14
    const v0, 0x12492493

    and-int/2addr v0, v3

    move/from16 v20, v3

    .end local v3    # "$dirty":I
    .local v20, "$dirty":I
    const v3, 0x12492492

    if-ne v0, v3, :cond_20

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_15

    .line 216
    :cond_1f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move-object/from16 v24, v2

    move-object v2, v5

    move-object v3, v7

    move-object v4, v9

    move-object v7, v10

    move-wide v5, v14

    move/from16 v9, p8

    move/from16 v10, p9

    goto/16 :goto_1f

    .line 148
    :cond_20
    :goto_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v12, 0x1

    const v21, -0xe001

    const v22, -0x70001

    const/4 v3, 0x6

    if-eqz v0, :cond_25

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_21

    goto :goto_16

    .line 260
    :cond_21
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v13, 0x8

    if-eqz v0, :cond_22

    and-int v0, v20, v21

    move/from16 v20, v0

    :cond_22
    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_23

    and-int v20, v20, v22

    :cond_23
    and-int/lit8 v0, v13, 0x20

    if-eqz v0, :cond_24

    const v0, -0x380001

    and-int v0, v20, v0

    move/from16 v20, p8

    move/from16 v21, p9

    move v4, v0

    move-object/from16 v0, p7

    .end local v20    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_19

    .end local v0    # "$dirty":I
    .restart local v20    # "$dirty":I
    :cond_24
    move-object/from16 v0, p7

    move/from16 v21, p9

    move/from16 v4, v20

    move/from16 v20, p8

    goto/16 :goto_19

    .line 148
    :cond_25
    :goto_16
    if-eqz v4, :cond_26

    .line 248
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v5, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "modifier":Landroidx/compose/ui/Modifier;
    :cond_26
    if-eqz v6, :cond_27

    .line 249
    const/4 v0, 0x0

    move-object v7, v0

    .end local p2    # "title":Lkotlin/jvm/functions/Function2;
    .local v7, "title":Lkotlin/jvm/functions/Function2;
    :cond_27
    if-eqz v8, :cond_28

    .line 251
    const/4 v0, 0x0

    move-object v9, v0

    .end local p3    # "action":Lkotlin/jvm/functions/Function2;
    .local v9, "action":Lkotlin/jvm/functions/Function2;
    :cond_28
    and-int/lit8 v0, v13, 0x8

    if-eqz v0, :cond_29

    .line 253
    nop

    .line 252
    sget-object v0, Landroidx/compose/ui/unit/DpSize;->Companion:Landroidx/compose/ui/unit/DpSize$Companion;

    .line 253
    invoke-virtual {v0}, Landroidx/compose/ui/unit/DpSize$Companion;->getUnspecified-MYxV2XQ()J

    move-result-wide v14

    .end local p4    # "caretSize":J
    .local v14, "caretSize":J
    and-int v0, v20, v21

    move/from16 v20, v0

    :cond_29
    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_2a

    .line 256
    nop

    .line 254
    sget-object v0, Landroidx/compose/material3/TooltipDefaults;->INSTANCE:Landroidx/compose/material3/TooltipDefaults;

    .line 256
    invoke-virtual {v0, v2, v3}, Landroidx/compose/material3/TooltipDefaults;->getRichTooltipContainerShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v0

    .end local p6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v0, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v20, v20, v22

    move-object v10, v0

    .end local v0    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v10, "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_2a
    and-int/lit8 v0, v13, 0x20

    if-eqz v0, :cond_2b

    .line 258
    nop

    .line 257
    sget-object v0, Landroidx/compose/material3/TooltipDefaults;->INSTANCE:Landroidx/compose/material3/TooltipDefaults;

    .line 258
    invoke-virtual {v0, v2, v3}, Landroidx/compose/material3/TooltipDefaults;->richTooltipColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RichTooltipColors;

    move-result-object v0

    .end local p7    # "colors":Landroidx/compose/material3/RichTooltipColors;
    .local v0, "colors":Landroidx/compose/material3/RichTooltipColors;
    const v4, -0x380001

    and-int v20, v20, v4

    goto :goto_17

    .line 256
    .end local v0    # "colors":Landroidx/compose/material3/RichTooltipColors;
    .restart local p7    # "colors":Landroidx/compose/material3/RichTooltipColors;
    :cond_2b
    move-object/from16 v0, p7

    .line 258
    .end local p7    # "colors":Landroidx/compose/material3/RichTooltipColors;
    .restart local v0    # "colors":Landroidx/compose/material3/RichTooltipColors;
    :goto_17
    if-eqz v17, :cond_2c

    .line 259
    sget-object v4, Landroidx/compose/material3/tokens/ElevationTokens;->INSTANCE:Landroidx/compose/material3/tokens/ElevationTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/ElevationTokens;->getLevel0-D9Ej5fM()F

    move-result v4

    .end local p8    # "tonalElevation":F
    .local v4, "tonalElevation":F
    goto :goto_18

    .line 258
    .end local v4    # "tonalElevation":F
    .restart local p8    # "tonalElevation":F
    :cond_2c
    move/from16 v4, p8

    .line 259
    .end local p8    # "tonalElevation":F
    .restart local v4    # "tonalElevation":F
    :goto_18
    if-eqz v19, :cond_2d

    .line 260
    sget-object v6, Landroidx/compose/material3/tokens/RichTooltipTokens;->INSTANCE:Landroidx/compose/material3/tokens/RichTooltipTokens;

    invoke-virtual {v6}, Landroidx/compose/material3/tokens/RichTooltipTokens;->getContainerElevation-D9Ej5fM()F

    move-result v6

    move/from16 v21, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move/from16 v21, v6

    .end local p9    # "shadowElevation":F
    .local v6, "shadowElevation":F
    goto :goto_19

    .line 259
    .end local v6    # "shadowElevation":F
    .restart local p9    # "shadowElevation":F
    :cond_2d
    move/from16 v21, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move/from16 v21, p9

    .line 260
    .end local p9    # "shadowElevation":F
    .local v4, "$dirty":I
    .local v20, "tonalElevation":F
    .local v21, "shadowElevation":F
    :goto_19
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_2e

    .line 148
    const/4 v6, -0x1

    const-string v8, "androidx.compose.material3.RichTooltip (Tooltip.android.kt:147)"

    const v3, 0x6f4f19c9

    invoke-static {v3, v4, v6, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 149
    :cond_2e
    invoke-static {}, Landroidx/compose/material3/SurfaceKt;->getLocalAbsoluteTonalElevation()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/CompositionLocal;

    .local v3, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v6, 0x6

    .local v6, "$changed$iv":I
    const/4 v8, 0x0

    .line 338
    .local v8, "$i$f$getCurrent":I
    move/from16 p1, v6

    .end local v6    # "$changed$iv":I
    .local p1, "$changed$iv":I
    const v6, 0x789c5f52

    move/from16 p2, v8

    .end local v8    # "$i$f$getCurrent":I
    .local p2, "$i$f$getCurrent":I
    const-string v8, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v2, v6, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v16

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local p1    # "$changed$iv":I
    .end local p2    # "$i$f$getCurrent":I
    check-cast v16, Landroidx/compose/ui/unit/Dp;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v3

    .line 149
    nop

    .local v3, "arg0$iv":F
    const/16 v16, 0x0

    .line 339
    .local v16, "$i$f$plus-5rwHm24":I
    add-float v19, v3, v20

    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 149
    .end local v3    # "arg0$iv":F
    .end local v16    # "$i$f$plus-5rwHm24":I
    nop

    .line 151
    .local v3, "absoluteElevation":F
    sget-object v6, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    move/from16 p4, v3

    const/4 v3, 0x6

    .end local v3    # "absoluteElevation":F
    .local p4, "absoluteElevation":F
    invoke-virtual {v6, v2, v3}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v3

    invoke-virtual {v0}, Landroidx/compose/material3/RichTooltipColors;->getContainerColor-0d7_KjU()J

    move-result-wide v16

    const/4 v6, 0x0

    move-object/from16 p5, v2

    move-object/from16 p1, v3

    move/from16 p6, v6

    move-wide/from16 p2, v16

    .end local v2    # "$composer":Landroidx/compose/runtime/Composer;
    .local p5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p1 .. p6}, Landroidx/compose/material3/ColorSchemeKt;->applyTonalElevation-RFCenO8(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    .line 150
    move/from16 v27, p4

    move-object/from16 v6, p5

    .end local p4    # "absoluteElevation":F
    .end local p5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    .local v27, "absoluteElevation":F
    move-object/from16 p8, v10

    .end local v10    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v2, "elevatedColor":J
    .local p8, "shape":Landroidx/compose/ui/graphics/Shape;
    const v10, 0x57c853b7

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v10, "153@6122L7,154@6181L7,155@6220L341"

    invoke-static {v6, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 153
    move-wide/from16 v16, v14

    .local v16, "$this$isSpecified$iv":J
    const/4 v10, 0x0

    .line 340
    .local v10, "$i$f$isSpecified-EaSLcWc":I
    const-wide v22, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v19, v16, v22

    move/from16 p1, v10

    .end local v10    # "$i$f$isSpecified-EaSLcWc":I
    .local p1, "$i$f$isSpecified-EaSLcWc":I
    if-eqz v19, :cond_2f

    const/16 v19, 0x1

    goto :goto_1a

    :cond_2f
    const/16 v19, 0x0

    .line 153
    .end local v16    # "$this$isSpecified$iv":J
    .end local p1    # "$i$f$isSpecified-EaSLcWc":I
    :goto_1a
    if-eqz v19, :cond_35

    .line 154
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v16

    move-object/from16 v10, v16

    check-cast v10, Landroidx/compose/runtime/CompositionLocal;

    .local v10, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v16, 0x0

    .local v16, "$changed$iv":I
    const/16 v17, 0x0

    .line 341
    .local v17, "$i$f$getCurrent":I
    const v12, 0x789c5f52

    invoke-static {v6, v12, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 154
    .end local v10    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v16    # "$changed$iv":I
    .end local v17    # "$i$f$getCurrent":I
    move-object v10, v12

    check-cast v10, Landroidx/compose/ui/unit/Density;

    .line 155
    .local v10, "density":Landroidx/compose/ui/unit/Density;
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v12

    check-cast v12, Landroidx/compose/runtime/CompositionLocal;

    .local v12, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/16 v16, 0x0

    .restart local v16    # "$changed$iv":I
    const/16 v17, 0x0

    .line 342
    .restart local v17    # "$i$f$getCurrent":I
    const v13, 0x789c5f52

    invoke-static {v6, v13, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 155
    .end local v12    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v16    # "$changed$iv":I
    .end local v17    # "$i$f$getCurrent":I
    check-cast v8, Landroid/content/res/Configuration;

    .line 156
    .local v8, "configuration":Landroid/content/res/Configuration;
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v12, Landroidx/compose/ui/Modifier;

    const v13, 0x57c86799

    move-object/from16 v28, v0

    .end local v0    # "colors":Landroidx/compose/material3/RichTooltipColors;
    .local v28, "colors":Landroidx/compose/material3/RichTooltipColors;
    const-string v0, "CC(remember):Tooltip.android.kt#9igjgp"

    invoke-static {v6, v13, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v0, v13

    invoke-interface {v6, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v13

    or-int/2addr v0, v13

    const v13, 0xe000

    and-int/2addr v13, v4

    xor-int/lit16 v13, v13, 0x6000

    move/from16 p1, v0

    const/16 v0, 0x4000

    if-le v13, v0, :cond_30

    invoke-interface {v6, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v0

    if-nez v0, :cond_31

    :cond_30
    and-int/lit16 v0, v4, 0x6000

    const/16 v13, 0x4000

    if-ne v0, v13, :cond_32

    :cond_31
    const/4 v0, 0x1

    goto :goto_1b

    :cond_32
    const/4 v0, 0x0

    :goto_1b
    or-int v0, p1, v0

    .local v0, "invalid$iv":Z
    move-object v13, v6

    .local v13, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 343
    .local v16, "$i$f$cache":I
    move/from16 p11, v0

    .end local v0    # "invalid$iv":Z
    .local p11, "invalid$iv":Z
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 344
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p11, :cond_34

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-wide/from16 p4, v2

    .end local v2    # "elevatedColor":J
    .local p4, "elevatedColor":J
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_33

    goto :goto_1c

    .line 348
    :cond_33
    move-wide/from16 v29, p4

    move-object v2, v0

    move-object v3, v10

    move-wide/from16 v31, v14

    goto :goto_1d

    .line 344
    .end local p4    # "elevatedColor":J
    .restart local v2    # "elevatedColor":J
    :cond_34
    move-wide/from16 p4, v2

    .line 345
    .end local v2    # "elevatedColor":J
    .restart local p4    # "elevatedColor":J
    :goto_1c
    const/4 v2, 0x0

    .line 156
    .local v2, "$i$a$-cache-Tooltip_androidKt$RichTooltip$drawCaretModifier$1":I
    new-instance v3, Landroidx/compose/material3/Tooltip_androidKt$RichTooltip$drawCaretModifier$1$1;

    move-object/from16 p1, v3

    move-object/from16 p3, v8

    move-object/from16 p2, v10

    move-wide/from16 p6, v14

    .end local v8    # "configuration":Landroid/content/res/Configuration;
    .end local v10    # "density":Landroidx/compose/ui/unit/Density;
    .end local v14    # "caretSize":J
    .local p2, "density":Landroidx/compose/ui/unit/Density;
    .local p3, "configuration":Landroid/content/res/Configuration;
    .local p6, "caretSize":J
    invoke-direct/range {p1 .. p7}, Landroidx/compose/material3/Tooltip_androidKt$RichTooltip$drawCaretModifier$1$1;-><init>(Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJ)V

    move-object/from16 v10, p1

    move-object/from16 v3, p2

    move-wide/from16 v29, p4

    move-wide/from16 v31, p6

    .end local p2    # "density":Landroidx/compose/ui/unit/Density;
    .end local p3    # "configuration":Landroid/content/res/Configuration;
    .end local p4    # "elevatedColor":J
    .end local p6    # "caretSize":J
    .local v3, "density":Landroidx/compose/ui/unit/Density;
    .restart local v8    # "configuration":Landroid/content/res/Configuration;
    .local v29, "elevatedColor":J
    .local v31, "caretSize":J
    move-object v2, v10

    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 345
    .end local v2    # "$i$a$-cache-Tooltip_androidKt$RichTooltip$drawCaretModifier$1":I
    nop

    .line 346
    .local v2, "value$iv":Ljava/lang/Object;
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 347
    nop

    .line 344
    .end local v2    # "value$iv":Ljava/lang/Object;
    :goto_1d
    nop

    .line 343
    .end local v0    # "it$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 156
    .end local v13    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    .end local p11    # "invalid$iv":Z
    check-cast v2, Lkotlin/jvm/functions/Function2;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-interface {v1, v12, v2}, Landroidx/compose/material3/TooltipScope;->drawCaret(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 166
    invoke-interface {v0, v5}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .end local v3    # "density":Landroidx/compose/ui/unit/Density;
    .end local v8    # "configuration":Landroid/content/res/Configuration;
    goto :goto_1e

    .line 167
    .end local v28    # "colors":Landroidx/compose/material3/RichTooltipColors;
    .end local v29    # "elevatedColor":J
    .end local v31    # "caretSize":J
    .local v0, "colors":Landroidx/compose/material3/RichTooltipColors;
    .local v2, "elevatedColor":J
    .restart local v14    # "caretSize":J
    :cond_35
    move-object/from16 v28, v0

    move-wide/from16 v29, v2

    move-wide/from16 v31, v14

    .end local v0    # "colors":Landroidx/compose/material3/RichTooltipColors;
    .end local v2    # "elevatedColor":J
    .end local v14    # "caretSize":J
    .restart local v28    # "colors":Landroidx/compose/material3/RichTooltipColors;
    .restart local v29    # "elevatedColor":J
    .restart local v31    # "caretSize":J
    move-object v0, v5

    .line 153
    :goto_1e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 152
    nop

    .line 171
    .local v0, "drawCaretModifier":Landroidx/compose/ui/Modifier;
    invoke-static {}, Landroidx/compose/material3/TooltipKt;->getTooltipMinWidth()F

    move-result v2

    .line 172
    invoke-static {}, Landroidx/compose/material3/TooltipKt;->getRichTooltipMaxWidth()F

    move-result v3

    .line 173
    invoke-static {}, Landroidx/compose/material3/TooltipKt;->getTooltipMinHeight()F

    move-result v8

    .line 170
    nop

    .line 171
    nop

    .line 173
    nop

    .line 172
    nop

    .line 170
    const/16 v10, 0x8

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 p1, v0

    move/from16 p2, v2

    move/from16 p4, v3

    move/from16 p3, v8

    move/from16 p6, v10

    move-object/from16 p7, v12

    move/from16 p5, v13

    .end local v0    # "drawCaretModifier":Landroidx/compose/ui/Modifier;
    .local p1, "drawCaretModifier":Landroidx/compose/ui/Modifier;
    invoke-static/range {p1 .. p7}, Landroidx/compose/foundation/layout/SizeKt;->sizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    .line 175
    .end local p1    # "drawCaretModifier":Landroidx/compose/ui/Modifier;
    .restart local v0    # "drawCaretModifier":Landroidx/compose/ui/Modifier;
    nop

    .line 176
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/material3/RichTooltipColors;->getContainerColor-0d7_KjU()J

    move-result-wide v16

    .line 177
    nop

    .line 178
    nop

    .line 179
    new-instance v2, Landroidx/compose/material3/Tooltip_androidKt$RichTooltip$1;

    move-object/from16 v3, v28

    .end local v28    # "colors":Landroidx/compose/material3/RichTooltipColors;
    .local v3, "colors":Landroidx/compose/material3/RichTooltipColors;
    invoke-direct {v2, v7, v9, v3, v11}, Landroidx/compose/material3/Tooltip_androidKt$RichTooltip$1;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/RichTooltipColors;Lkotlin/jvm/functions/Function2;)V

    const/16 v8, 0x36

    const v10, 0x12e979ce

    const/4 v12, 0x1

    invoke-static {v10, v12, v2, v6, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v2, v4, 0xc

    and-int/lit8 v2, v2, 0x70

    or-int v2, v2, v18

    shr-int/lit8 v8, v4, 0x9

    const v10, 0xe000

    and-int/2addr v8, v10

    or-int/2addr v2, v8

    shr-int/lit8 v8, v4, 0x9

    const/high16 v10, 0x70000

    and-int/2addr v8, v10

    or-int v25, v2, v8

    .line 168
    const-wide/16 v18, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x48

    move-object/from16 v15, p8

    move-object/from16 v24, v6

    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v15, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v24, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v14 .. v26}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_36

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 216
    .end local v0    # "drawCaretModifier":Landroidx/compose/ui/Modifier;
    .end local v27    # "absoluteElevation":F
    .end local v29    # "elevatedColor":J
    :cond_36
    move/from16 v2, v20

    move/from16 v20, v4

    move-object v4, v9

    move v9, v2

    move-object v8, v3

    move-object v2, v5

    move-object v3, v7

    move-object v7, v15

    move/from16 v10, v21

    move-wide/from16 v5, v31

    .end local v15    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v21    # "shadowElevation":F
    .end local v31    # "caretSize":J
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "title":Lkotlin/jvm/functions/Function2;
    .local v4, "action":Lkotlin/jvm/functions/Function2;
    .local v5, "caretSize":J
    .local v7, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v8, "colors":Landroidx/compose/material3/RichTooltipColors;
    .local v9, "tonalElevation":F
    .local v10, "shadowElevation":F
    .local v20, "$dirty":I
    :goto_1f
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-eqz v14, :cond_37

    new-instance v0, Landroidx/compose/material3/Tooltip_androidKt$RichTooltip$2;

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/Tooltip_androidKt$RichTooltip$2;-><init>(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v14, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_37
    return-void
.end method

.method public static final synthetic access$drawCaretWithPath-JKu-mZY(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/material3/CaretType;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJLandroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/ui/draw/CacheDrawScope;
    .param p1, "caretType"    # Landroidx/compose/material3/CaretType;
    .param p2, "density"    # Landroidx/compose/ui/unit/Density;
    .param p3, "configuration"    # Landroid/content/res/Configuration;
    .param p4, "containerColor"    # J
    .param p6, "caretSize"    # J
    .param p8, "anchorLayoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 1
    invoke-static/range {p0 .. p8}, Landroidx/compose/material3/Tooltip_androidKt;->drawCaretWithPath-JKu-mZY(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/material3/CaretType;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJLandroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v0

    return-object v0
.end method

.method private static final drawCaretWithPath-JKu-mZY(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/material3/CaretType;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJLandroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;
    .locals 25
    .param p0, "$this$drawCaretWithPath_u2dJKu_u2dmZY"    # Landroidx/compose/ui/draw/CacheDrawScope;
    .param p1, "caretType"    # Landroidx/compose/material3/CaretType;
    .param p2, "density"    # Landroidx/compose/ui/unit/Density;
    .param p3, "configuration"    # Landroid/content/res/Configuration;
    .param p4, "containerColor"    # J
    .param p6, "caretSize"    # J
    .param p8, "anchorLayoutCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 227
    move-object/from16 v0, p8

    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    move-result-object v1

    .line 229
    .local v1, "path":Landroidx/compose/ui/graphics/Path;
    if-eqz v0, :cond_8

    .line 230
    const/4 v2, 0x0

    .line 231
    .local v2, "caretHeightPx":I
    const/4 v3, 0x0

    .line 232
    .local v3, "caretWidthPx":I
    const/4 v4, 0x0

    .line 233
    .local v4, "screenWidthPx":I
    const/4 v5, 0x0

    .line 234
    .local v5, "tooltipAnchorSpacing":I
    move-object/from16 v6, p2

    .local v6, "$this$drawCaretWithPath_JKu_mZY_u24lambda_u242":Landroidx/compose/ui/unit/Density;
    const/4 v7, 0x0

    .line 235
    .local v7, "$i$a$-with-Tooltip_androidKt$drawCaretWithPath$1":I
    invoke-static/range {p6 .. p7}, Landroidx/compose/ui/unit/DpSize;->getHeight-D9Ej5fM(J)F

    move-result v8

    invoke-interface {v6, v8}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v2

    .line 236
    invoke-static/range {p6 .. p7}, Landroidx/compose/ui/unit/DpSize;->getWidth-D9Ej5fM(J)F

    move-result v8

    invoke-interface {v6, v8}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v3

    .line 237
    move-object/from16 v8, p3

    iget v9, v8, Landroid/content/res/Configuration;->screenWidthDp:I

    .local v9, "$this$dp$iv":I
    const/4 v10, 0x0

    .line 349
    .local v10, "$i$f$getDp":I
    int-to-float v11, v9

    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v9

    .line 237
    .end local v9    # "$this$dp$iv":I
    .end local v10    # "$i$f$getDp":I
    invoke-interface {v6, v9}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v4

    .line 238
    invoke-static {}, Landroidx/compose/material3/TooltipKt;->getSpacingBetweenTooltipAndAnchor()F

    move-result v9

    invoke-interface {v6, v9}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v5

    .line 239
    nop

    .line 234
    .end local v6    # "$this$drawCaretWithPath_JKu_mZY_u24lambda_u242":Landroidx/compose/ui/unit/Density;
    .end local v7    # "$i$a$-with-Tooltip_androidKt$drawCaretWithPath$1":I
    nop

    .line 240
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->boundsInWindow(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v6

    .line 241
    .local v6, "anchorBounds":Landroidx/compose/ui/geometry/Rect;
    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v7

    .line 242
    .local v7, "anchorLeft":F
    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v9

    .line 243
    .local v9, "anchorRight":F
    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v10

    .line 244
    .local v10, "anchorTop":F
    add-float v11, v9, v7

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v11, v12

    .line 245
    .local v11, "anchorMid":F
    sub-float v13, v9, v7

    .line 246
    .local v13, "anchorWidth":F
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v14

    invoke-static {v14, v15}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v14

    .line 247
    .local v14, "tooltipWidth":F
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v15

    .line 248
    .local v15, "tooltipHeight":F
    sub-float v16, v10, v15

    move/from16 v17, v12

    int-to-float v12, v5

    sub-float v16, v16, v12

    const/4 v12, 0x0

    cmpg-float v16, v16, v12

    if-gez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_0

    :cond_0
    const/16 v16, 0x0

    .line 250
    .local v16, "isCaretTop":Z
    :goto_0
    if-eqz v16, :cond_1

    .line 251
    move/from16 v18, v12

    goto :goto_1

    .line 253
    :cond_1
    move/from16 v18, v15

    .line 250
    :goto_1
    nop

    .line 249
    move/from16 v19, v18

    .line 256
    .local v19, "caretY":F
    const-wide/16 v20, 0x0

    .line 257
    .local v20, "position":J
    sget-object v12, Landroidx/compose/material3/CaretType;->Plain:Landroidx/compose/material3/CaretType;

    move/from16 v22, v3

    move-object/from16 v3, p1

    .end local v3    # "caretWidthPx":I
    .local v22, "caretWidthPx":I
    if-ne v3, v12, :cond_3

    .line 259
    div-float v12, v14, v17

    add-float/2addr v12, v11

    int-to-float v3, v4

    cmpl-float v3, v12, v3

    if-lez v3, :cond_2

    .line 261
    int-to-float v3, v4

    sub-float/2addr v3, v11

    .line 262
    .local v3, "anchorMidFromRightScreenEdge":F
    sub-float v12, v14, v3

    .line 263
    .local v12, "caretX":F
    move/from16 v17, v3

    move/from16 v3, v19

    .end local v19    # "caretY":F
    .local v3, "caretY":F
    .local v17, "anchorMidFromRightScreenEdge":F
    invoke-static {v12, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v17

    move/from16 v19, v5

    .end local v12    # "caretX":F
    .end local v17    # "anchorMidFromRightScreenEdge":F
    goto :goto_2

    .line 266
    .end local v3    # "caretY":F
    .restart local v19    # "caretY":F
    :cond_2
    move/from16 v3, v19

    .end local v19    # "caretY":F
    .restart local v3    # "caretY":F
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v12

    div-float v12, v12, v17

    div-float v17, v13, v17

    sub-float v12, v12, v17

    sub-float v12, v7, v12

    .line 267
    .local v12, "tooltipLeft":F
    move/from16 v19, v5

    const/4 v5, 0x0

    .end local v5    # "tooltipAnchorSpacing":I
    .local v19, "tooltipAnchorSpacing":I
    invoke-static {v12, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    sub-float v5, v11, v5

    .line 268
    .local v5, "caretX":F
    invoke-static {v5, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v17

    .line 258
    .end local v5    # "caretX":F
    .end local v12    # "tooltipLeft":F
    :goto_2
    nop

    .end local v20    # "position":J
    .local v17, "position":J
    goto :goto_4

    .line 272
    .end local v3    # "caretY":F
    .end local v17    # "position":J
    .local v5, "tooltipAnchorSpacing":I
    .local v19, "caretY":F
    .restart local v20    # "position":J
    :cond_3
    move/from16 v3, v19

    move/from16 v19, v5

    .end local v5    # "tooltipAnchorSpacing":I
    .restart local v3    # "caretY":F
    .local v19, "tooltipAnchorSpacing":I
    sub-float v5, v11, v7

    invoke-static {v5, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v23

    .line 273
    .local v23, "preferredPosition":J
    add-float v5, v7, v14

    int-to-float v12, v4

    cmpl-float v5, v5, v12

    if-lez v5, :cond_6

    .line 275
    sub-float v5, v9, v14

    sub-float v5, v11, v5

    invoke-static {v5, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v23

    .line 276
    sub-float v5, v9, v14

    const/16 v18, 0x0

    cmpg-float v5, v5, v18

    if-gez v5, :cond_6

    .line 280
    div-float v5, v14, v17

    sub-float v5, v7, v5

    div-float v12, v13, v17

    add-float/2addr v5, v12

    cmpg-float v5, v5, v18

    if-gtz v5, :cond_4

    .line 281
    invoke-static {v11, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v23

    goto :goto_3

    .line 282
    :cond_4
    div-float v5, v14, v17

    add-float/2addr v5, v9

    div-float v12, v13, v17

    sub-float/2addr v5, v12

    int-to-float v12, v4

    cmpl-float v5, v5, v12

    if-ltz v5, :cond_5

    .line 283
    int-to-float v5, v4

    sub-float/2addr v5, v11

    .line 284
    .local v5, "anchorMidFromRightScreenEdge":F
    sub-float v12, v14, v5

    .line 285
    .local v12, "caretX":F
    invoke-static {v12, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v23

    .end local v5    # "anchorMidFromRightScreenEdge":F
    .end local v12    # "caretX":F
    goto :goto_3

    .line 287
    :cond_5
    div-float v5, v14, v17

    invoke-static {v5, v3}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v23

    .line 291
    :cond_6
    :goto_3
    move-wide/from16 v17, v23

    .line 294
    .end local v20    # "position":J
    .end local v23    # "preferredPosition":J
    .restart local v17    # "position":J
    :goto_4
    if-eqz v16, :cond_7

    .line 295
    move-object v5, v1

    .local v5, "$this$drawCaretWithPath_JKu_mZY_u24lambda_u243":Landroidx/compose/ui/graphics/Path;
    const/4 v12, 0x0

    .line 296
    .local v12, "$i$a$-apply-Tooltip_androidKt$drawCaretWithPath$2":I
    move/from16 v20, v3

    .end local v3    # "caretY":F
    .local v20, "caretY":F
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v3

    move/from16 v21, v4

    .end local v4    # "screenWidthPx":I
    .local v21, "screenWidthPx":I
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v4

    invoke-interface {v5, v3, v4}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 297
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v3

    div-int/lit8 v4, v22, 0x2

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v4

    invoke-interface {v5, v3, v4}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 298
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v3

    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v4

    move/from16 v23, v4

    int-to-float v4, v2

    sub-float v4, v23, v4

    invoke-interface {v5, v3, v4}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 299
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v3

    div-int/lit8 v4, v22, 0x2

    int-to-float v4, v4

    sub-float/2addr v3, v4

    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v4

    invoke-interface {v5, v3, v4}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 300
    invoke-interface {v5}, Landroidx/compose/ui/graphics/Path;->close()V

    .line 301
    nop

    .line 295
    .end local v5    # "$this$drawCaretWithPath_JKu_mZY_u24lambda_u243":Landroidx/compose/ui/graphics/Path;
    .end local v12    # "$i$a$-apply-Tooltip_androidKt$drawCaretWithPath$2":I
    goto :goto_5

    .line 303
    .end local v20    # "caretY":F
    .end local v21    # "screenWidthPx":I
    .restart local v3    # "caretY":F
    .restart local v4    # "screenWidthPx":I
    :cond_7
    move/from16 v20, v3

    move/from16 v21, v4

    .end local v3    # "caretY":F
    .end local v4    # "screenWidthPx":I
    .restart local v20    # "caretY":F
    .restart local v21    # "screenWidthPx":I
    move-object v3, v1

    .local v3, "$this$drawCaretWithPath_JKu_mZY_u24lambda_u244":Landroidx/compose/ui/graphics/Path;
    const/4 v4, 0x0

    .line 304
    .local v4, "$i$a$-apply-Tooltip_androidKt$drawCaretWithPath$3":I
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v5

    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v12

    invoke-interface {v3, v5, v12}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 305
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v5

    div-int/lit8 v12, v22, 0x2

    int-to-float v12, v12

    add-float/2addr v5, v12

    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v12

    invoke-interface {v3, v5, v12}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 306
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v5

    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v12

    move/from16 v23, v4

    .end local v4    # "$i$a$-apply-Tooltip_androidKt$drawCaretWithPath$3":I
    .local v23, "$i$a$-apply-Tooltip_androidKt$drawCaretWithPath$3":I
    int-to-float v4, v2

    add-float/2addr v12, v4

    invoke-interface {v3, v5, v12}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 307
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v4

    div-int/lit8 v5, v22, 0x2

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v5

    invoke-interface {v3, v4, v5}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 308
    invoke-interface {v3}, Landroidx/compose/ui/graphics/Path;->close()V

    .line 309
    nop

    .line 303
    .end local v3    # "$this$drawCaretWithPath_JKu_mZY_u24lambda_u244":Landroidx/compose/ui/graphics/Path;
    .end local v23    # "$i$a$-apply-Tooltip_androidKt$drawCaretWithPath$3":I
    goto :goto_5

    .line 229
    .end local v2    # "caretHeightPx":I
    .end local v6    # "anchorBounds":Landroidx/compose/ui/geometry/Rect;
    .end local v7    # "anchorLeft":F
    .end local v9    # "anchorRight":F
    .end local v10    # "anchorTop":F
    .end local v11    # "anchorMid":F
    .end local v13    # "anchorWidth":F
    .end local v14    # "tooltipWidth":F
    .end local v15    # "tooltipHeight":F
    .end local v16    # "isCaretTop":Z
    .end local v17    # "position":J
    .end local v19    # "tooltipAnchorSpacing":I
    .end local v20    # "caretY":F
    .end local v21    # "screenWidthPx":I
    .end local v22    # "caretWidthPx":I
    :cond_8
    move-object/from16 v8, p3

    .line 313
    :goto_5
    new-instance v2, Landroidx/compose/material3/Tooltip_androidKt$drawCaretWithPath$4;

    move-wide/from16 v3, p4

    invoke-direct {v2, v0, v1, v3, v4}, Landroidx/compose/material3/Tooltip_androidKt$drawCaretWithPath$4;-><init>(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/graphics/Path;J)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object/from16 v5, p0

    invoke-virtual {v5, v2}, Landroidx/compose/ui/draw/CacheDrawScope;->onDrawWithContent(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v2

    return-object v2
.end method
