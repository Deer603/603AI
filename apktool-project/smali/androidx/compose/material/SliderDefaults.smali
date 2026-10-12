.class public final Landroidx/compose/material/SliderDefaults;
.super Ljava/lang/Object;
.source "Slider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002Jv\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000cH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/material/SliderDefaults;",
        "",
        "()V",
        "DisabledActiveTrackAlpha",
        "",
        "DisabledInactiveTrackAlpha",
        "DisabledTickAlpha",
        "InactiveTrackAlpha",
        "TickAlpha",
        "colors",
        "Landroidx/compose/material/SliderColors;",
        "thumbColor",
        "Landroidx/compose/ui/graphics/Color;",
        "disabledThumbColor",
        "activeTrackColor",
        "inactiveTrackColor",
        "disabledActiveTrackColor",
        "disabledInactiveTrackColor",
        "activeTickColor",
        "inactiveTickColor",
        "disabledActiveTickColor",
        "disabledInactiveTickColor",
        "colors-q0g_0yA",
        "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;",
        "material_release"
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
.field public static final $stable:I = 0x0

.field public static final DisabledActiveTrackAlpha:F = 0.32f

.field public static final DisabledInactiveTrackAlpha:F = 0.12f

.field public static final DisabledTickAlpha:F = 0.12f

.field public static final INSTANCE:Landroidx/compose/material/SliderDefaults;

.field public static final InactiveTrackAlpha:F = 0.24f

.field public static final TickAlpha:F = 0.54f


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material/SliderDefaults;

    invoke-direct {v0}, Landroidx/compose/material/SliderDefaults;-><init>()V

    sput-object v0, Landroidx/compose/material/SliderDefaults;->INSTANCE:Landroidx/compose/material/SliderDefaults;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 560
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final colors-q0g_0yA(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;
    .locals 30
    .param p1, "thumbColor"    # J
    .param p3, "disabledThumbColor"    # J
    .param p5, "activeTrackColor"    # J
    .param p7, "inactiveTrackColor"    # J
    .param p9, "disabledActiveTrackColor"    # J
    .param p11, "disabledInactiveTrackColor"    # J
    .param p13, "activeTickColor"    # J
    .param p15, "inactiveTickColor"    # J
    .param p17, "disabledActiveTickColor"    # J
    .param p19, "disabledInactiveTickColor"    # J
    .param p21, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p22, "$changed"    # I
    .param p23, "$changed1"    # I

    .line 608
    move-object/from16 v0, p21

    move/from16 v1, p22

    move/from16 v2, p24

    const v3, 0x19fd1a17

    const-string v4, "C(colors)P(9:c#ui.graphics.Color,6:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,7:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color)590@25832L6,592@25910L6,593@25970L8,594@26025L6,595@26090L6,598@26261L6,601@26474L33:Slider.kt#jmzs0o"

    invoke-static {v0, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v4, v2, 0x1

    const/4 v5, 0x6

    if-eqz v4, :cond_0

    .line 591
    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v5}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v6

    move-wide v9, v6

    .end local p1    # "thumbColor":J
    .local v6, "thumbColor":J
    goto :goto_0

    .line 608
    .end local v6    # "thumbColor":J
    .restart local p1    # "thumbColor":J
    :cond_0
    move-wide/from16 v9, p1

    .line 591
    .end local p1    # "thumbColor":J
    .local v9, "thumbColor":J
    :goto_0
    and-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_1

    .line 595
    nop

    .line 593
    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v5}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v11

    .line 594
    sget-object v4, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    invoke-virtual {v4, v0, v5}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v13

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    .line 595
    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v5}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getSurface-0d7_KjU()J

    move-result-wide v11

    invoke-static {v6, v7, v11, v12}, Landroidx/compose/ui/graphics/ColorKt;->compositeOver--OWjLjI(JJ)J

    move-result-wide v6

    move-wide v11, v6

    .end local p3    # "disabledThumbColor":J
    .local v6, "disabledThumbColor":J
    goto :goto_1

    .line 591
    .end local v6    # "disabledThumbColor":J
    .restart local p3    # "disabledThumbColor":J
    :cond_1
    move-wide/from16 v11, p3

    .line 595
    .end local p3    # "disabledThumbColor":J
    .local v11, "disabledThumbColor":J
    :goto_1
    and-int/lit8 v4, v2, 0x4

    if-eqz v4, :cond_2

    .line 596
    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v5}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v6

    move-wide v13, v6

    .end local p5    # "activeTrackColor":J
    .local v6, "activeTrackColor":J
    goto :goto_2

    .line 595
    .end local v6    # "activeTrackColor":J
    .restart local p5    # "activeTrackColor":J
    :cond_2
    move-wide/from16 v13, p5

    .line 596
    .end local p5    # "activeTrackColor":J
    .local v13, "activeTrackColor":J
    :goto_2
    and-int/lit8 v4, v2, 0x8

    if-eqz v4, :cond_3

    .line 597
    const/16 v19, 0xe

    const/16 v20, 0x0

    const v15, 0x3e75c28f    # 0.24f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    move-wide v15, v6

    .end local p7    # "inactiveTrackColor":J
    .local v6, "inactiveTrackColor":J
    goto :goto_3

    .line 596
    .end local v6    # "inactiveTrackColor":J
    .restart local p7    # "inactiveTrackColor":J
    :cond_3
    move-wide/from16 v15, p7

    .line 597
    .end local p7    # "inactiveTrackColor":J
    .local v15, "inactiveTrackColor":J
    :goto_3
    and-int/lit8 v4, v2, 0x10

    if-eqz v4, :cond_4

    .line 599
    sget-object v4, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    invoke-virtual {v4, v0, v5}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/material/Colors;->getOnSurface-0d7_KjU()J

    move-result-wide v4

    const/16 v6, 0xe

    const/4 v7, 0x0

    const v8, 0x3ea3d70a    # 0.32f

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 p1, v4

    move/from16 p7, v6

    move-object/from16 p8, v7

    move/from16 p3, v8

    move/from16 p4, v17

    move/from16 p5, v18

    move/from16 p6, v19

    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v17, v4

    .end local p9    # "disabledActiveTrackColor":J
    .local v4, "disabledActiveTrackColor":J
    goto :goto_4

    .line 597
    .end local v4    # "disabledActiveTrackColor":J
    .restart local p9    # "disabledActiveTrackColor":J
    :cond_4
    move-wide/from16 v17, p9

    .line 599
    .end local p9    # "disabledActiveTrackColor":J
    .local v17, "disabledActiveTrackColor":J
    :goto_4
    and-int/lit8 v4, v2, 0x20

    if-eqz v4, :cond_5

    .line 601
    const/16 v4, 0xe

    const/4 v5, 0x0

    const v6, 0x3df5c28f    # 0.12f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v19, 0x0

    move/from16 p7, v4

    move-object/from16 p8, v5

    move/from16 p3, v6

    move/from16 p4, v7

    move/from16 p5, v8

    move-wide/from16 p1, v17

    move/from16 p6, v19

    .end local v17    # "disabledActiveTrackColor":J
    .local p1, "disabledActiveTrackColor":J
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v19, v4

    .end local p1    # "disabledActiveTrackColor":J
    .end local p11    # "disabledInactiveTrackColor":J
    .local v4, "disabledInactiveTrackColor":J
    .restart local v17    # "disabledActiveTrackColor":J
    goto :goto_5

    .line 599
    .end local v4    # "disabledInactiveTrackColor":J
    .restart local p11    # "disabledInactiveTrackColor":J
    :cond_5
    move-wide/from16 v19, p11

    .line 601
    .end local p11    # "disabledInactiveTrackColor":J
    .local v19, "disabledInactiveTrackColor":J
    :goto_5
    and-int/lit8 v4, v2, 0x40

    if-eqz v4, :cond_6

    .line 602
    shr-int/lit8 v4, v1, 0x6

    and-int/lit8 v4, v4, 0xe

    invoke-static {v13, v14, v0, v4}, Landroidx/compose/material/ColorsKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    const/16 v6, 0xe

    const/4 v7, 0x0

    const v8, 0x3f0a3d71    # 0.54f

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-wide/from16 p1, v4

    move/from16 p7, v6

    move-object/from16 p8, v7

    move/from16 p3, v8

    move/from16 p4, v21

    move/from16 p5, v22

    move/from16 p6, v23

    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v21, v4

    .end local p13    # "activeTickColor":J
    .local v4, "activeTickColor":J
    goto :goto_6

    .line 601
    .end local v4    # "activeTickColor":J
    .restart local p13    # "activeTickColor":J
    :cond_6
    move-wide/from16 v21, p13

    .line 602
    .end local p13    # "activeTickColor":J
    .local v21, "activeTickColor":J
    :goto_6
    and-int/lit16 v4, v2, 0x80

    if-eqz v4, :cond_7

    .line 603
    const/16 v4, 0xe

    const/4 v5, 0x0

    const v6, 0x3f0a3d71    # 0.54f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v23, 0x0

    move/from16 p7, v4

    move-object/from16 p8, v5

    move/from16 p3, v6

    move/from16 p4, v7

    move/from16 p5, v8

    move-wide/from16 p1, v13

    move/from16 p6, v23

    .end local v13    # "activeTrackColor":J
    .local p1, "activeTrackColor":J
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v23, v4

    .end local p1    # "activeTrackColor":J
    .end local p15    # "inactiveTickColor":J
    .local v4, "inactiveTickColor":J
    .restart local v13    # "activeTrackColor":J
    goto :goto_7

    .line 602
    .end local v4    # "inactiveTickColor":J
    .restart local p15    # "inactiveTickColor":J
    :cond_7
    move-wide/from16 v23, p15

    .line 603
    .end local p15    # "inactiveTickColor":J
    .local v23, "inactiveTickColor":J
    :goto_7
    and-int/lit16 v4, v2, 0x100

    if-eqz v4, :cond_8

    .line 604
    const/16 v4, 0xe

    const/4 v5, 0x0

    const v6, 0x3df5c28f    # 0.12f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v25, 0x0

    move/from16 p7, v4

    move-object/from16 p8, v5

    move/from16 p3, v6

    move/from16 p4, v7

    move/from16 p5, v8

    move-wide/from16 p1, v21

    move/from16 p6, v25

    .end local v21    # "activeTickColor":J
    .local p1, "activeTickColor":J
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v25, v4

    .end local p1    # "activeTickColor":J
    .end local p17    # "disabledActiveTickColor":J
    .local v4, "disabledActiveTickColor":J
    .restart local v21    # "activeTickColor":J
    goto :goto_8

    .line 603
    .end local v4    # "disabledActiveTickColor":J
    .restart local p17    # "disabledActiveTickColor":J
    :cond_8
    move-wide/from16 v25, p17

    .line 604
    .end local p17    # "disabledActiveTickColor":J
    .local v25, "disabledActiveTickColor":J
    :goto_8
    and-int/lit16 v2, v2, 0x200

    if-eqz v2, :cond_9

    .line 606
    const/16 v2, 0xe

    const/4 v4, 0x0

    const v5, 0x3df5c28f    # 0.12f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 p7, v2

    move-object/from16 p8, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move/from16 p5, v7

    move/from16 p6, v8

    move-wide/from16 p1, v19

    .end local v19    # "disabledInactiveTrackColor":J
    .local p1, "disabledInactiveTrackColor":J
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v27, v4

    .end local p1    # "disabledInactiveTrackColor":J
    .end local p19    # "disabledInactiveTickColor":J
    .local v4, "disabledInactiveTickColor":J
    .restart local v19    # "disabledInactiveTrackColor":J
    goto :goto_9

    .line 604
    .end local v4    # "disabledInactiveTickColor":J
    .restart local p19    # "disabledInactiveTickColor":J
    :cond_9
    move-wide/from16 v27, p19

    .line 606
    .end local p19    # "disabledInactiveTickColor":J
    .local v27, "disabledInactiveTickColor":J
    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 608
    const-string v2, "androidx.compose.material.SliderDefaults.colors (Slider.kt:607)"

    move/from16 v4, p23

    invoke-static {v3, v1, v4, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_a

    .line 606
    :cond_a
    move/from16 v4, p23

    .line 608
    :goto_a
    new-instance v8, Landroidx/compose/material/DefaultSliderColors;

    .line 609
    nop

    .line 610
    nop

    .line 611
    nop

    .line 612
    nop

    .line 613
    nop

    .line 614
    nop

    .line 615
    nop

    .line 616
    nop

    .line 617
    nop

    .line 618
    nop

    .line 608
    const/16 v29, 0x0

    invoke-direct/range {v8 .. v29}, Landroidx/compose/material/DefaultSliderColors;-><init>(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_b
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast v8, Landroidx/compose/material/SliderColors;

    return-object v8
.end method
