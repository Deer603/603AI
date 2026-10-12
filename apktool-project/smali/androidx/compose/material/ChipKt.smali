.class public final Landroidx/compose/material/ChipKt;
.super Ljava/lang/Object;
.source "Chip.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,730:1\n85#2:731\n149#3:732\n149#3:733\n149#3:734\n149#3:735\n149#3:736\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n*L\n102#1:731\n709#1:732\n712#1:733\n715#1:734\n718#1:735\n729#1:736\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0090\u0001\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0015\u0008\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d\u00a2\u0006\u0002\u0008\u001b\u00a2\u0006\u0002\u0008\u001fH\u0007\u00a2\u0006\u0002\u0010 \u001a\u00c6\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020#2\u0015\u0008\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u001b2\u0015\u0008\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u001b2\u0015\u0008\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d\u00a2\u0006\u0002\u0008\u001b\u00a2\u0006\u0002\u0008\u001fH\u0007\u00a2\u0006\u0002\u0010&\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\u00a8\u0006\'\u00b2\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002\u00b2\u0006\n\u0010*\u001a\u00020)X\u008a\u0084\u0002"
    }
    d2 = {
        "HorizontalPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "LeadingIconEndSpacing",
        "LeadingIconStartSpacing",
        "SelectedIconContainerSize",
        "SelectedOverlayOpacity",
        "",
        "SurfaceOverlayOpacity",
        "TrailingIconSpacing",
        "Chip",
        "",
        "onClick",
        "Lkotlin/Function0;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "enabled",
        "",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "border",
        "Landroidx/compose/foundation/BorderStroke;",
        "colors",
        "Landroidx/compose/material/ChipColors;",
        "leadingIcon",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Lkotlin/ExtensionFunctionType;",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "FilterChip",
        "selected",
        "Landroidx/compose/material/SelectableChipColors;",
        "selectedIcon",
        "trailingIcon",
        "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "material_release",
        "contentColor",
        "Landroidx/compose/ui/graphics/Color;",
        "leadingIconContentColor"
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
.field private static final HorizontalPadding:F

.field private static final LeadingIconEndSpacing:F

.field private static final LeadingIconStartSpacing:F

.field private static final SelectedIconContainerSize:F

.field private static final SelectedOverlayOpacity:F = 0.16f

.field private static final SurfaceOverlayOpacity:F = 0.12f

.field private static final TrailingIconSpacing:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 709
    const/16 v0, 0xc

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 732
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 709
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material/ChipKt;->HorizontalPadding:F

    .line 712
    const/4 v0, 0x4

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 733
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 712
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material/ChipKt;->LeadingIconStartSpacing:F

    .line 715
    const/16 v0, 0x8

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 734
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 715
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material/ChipKt;->LeadingIconEndSpacing:F

    .line 718
    const/16 v0, 0x8

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 735
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 718
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material/ChipKt;->TrailingIconSpacing:F

    .line 729
    const/16 v0, 0x18

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 736
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 729
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material/ChipKt;->SelectedIconContainerSize:F

    return-void
.end method

.method public static final Chip(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .param p0, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "enabled"    # Z
    .param p3, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p4, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p5, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p6, "colors"    # Landroidx/compose/material/ChipColors;
    .param p7, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p8, "content"    # Lkotlin/jvm/functions/Function3;
    .param p9, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p10, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/material/ChipColors;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/RowScope;",
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

    .line 101
    move/from16 v10, p10

    move/from16 v11, p11

    const v0, -0x15f54878

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .end local p9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    const-string v2, "C(Chip)P(7,6,3,4,8!2,5)101@4584L21,107@4781L24,111@4939L1389,102@4610L1718:Chip.kt#jmzs0o"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v2, p10

    .local v2, "$dirty":I
    and-int/lit8 v3, v11, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v2, v2, 0x6

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    :goto_1
    and-int/lit8 v4, v11, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v10, 0x30

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
    and-int/lit8 v6, v11, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v2, v2, 0x180

    move/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v10, 0x180

    if-nez v7, :cond_8

    move/from16 v7, p2

    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    goto :goto_5

    :cond_8
    move/from16 v7, p2

    :goto_5
    and-int/lit8 v8, v11, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v2, v2, 0xc00

    move-object/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v10, 0xc00

    if-nez v9, :cond_b

    move-object/from16 v9, p3

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v2, v12

    goto :goto_7

    :cond_b
    move-object/from16 v9, p3

    :goto_7
    and-int/lit16 v12, v10, 0x6000

    if-nez v12, :cond_e

    and-int/lit8 v12, v11, 0x10

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v12, p4

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v2, v13

    goto :goto_9

    :cond_e
    move-object/from16 v12, p4

    :goto_9
    and-int/lit8 v13, v11, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_f

    or-int/2addr v2, v14

    move-object/from16 v14, p5

    goto :goto_b

    :cond_f
    and-int/2addr v14, v10

    if-nez v14, :cond_11

    move-object/from16 v14, p5

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v2, v15

    goto :goto_b

    :cond_11
    move-object/from16 v14, p5

    :goto_b
    const/high16 v15, 0x180000

    and-int/2addr v15, v10

    if-nez v15, :cond_14

    and-int/lit8 v15, v11, 0x40

    if-nez v15, :cond_12

    move-object/from16 v15, p6

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v15, p6

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v2, v2, v16

    goto :goto_d

    :cond_14
    move-object/from16 v15, p6

    :goto_d
    and-int/lit16 v0, v11, 0x80

    const/high16 v16, 0xc00000

    if-eqz v0, :cond_15

    or-int v2, v2, v16

    move/from16 p9, v13

    move-object/from16 v13, p7

    goto :goto_f

    :cond_15
    and-int v16, v10, v16

    if-nez v16, :cond_17

    move/from16 p9, v13

    move-object/from16 v13, p7

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_16

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v16, 0x400000

    :goto_e
    or-int v2, v2, v16

    goto :goto_f

    :cond_17
    move/from16 p9, v13

    move-object/from16 v13, p7

    :goto_f
    move/from16 v29, v0

    and-int/lit16 v0, v11, 0x100

    const/high16 v16, 0x6000000

    if-eqz v0, :cond_18

    or-int v2, v2, v16

    move-object/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v0, v10, v16

    if-nez v0, :cond_1a

    move-object/from16 v0, p8

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    const/high16 v16, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v16, 0x2000000

    :goto_10
    or-int v2, v2, v16

    goto :goto_11

    :cond_1a
    move-object/from16 v0, p8

    :goto_11
    const v16, 0x2492493

    and-int v0, v2, v16

    move/from16 v16, v2

    .end local v2    # "$dirty":I
    .local v16, "$dirty":I
    const v2, 0x2492492

    const/4 v13, 0x1

    if-eq v0, v2, :cond_1b

    move v0, v13

    goto :goto_12

    :cond_1b
    const/4 v0, 0x0

    :goto_12
    and-int/lit8 v2, v16, 0x1

    invoke-interface {v1, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v0, "95@4322L6,97@4439L12"

    invoke-static {v1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, v10, 0x1

    const v2, -0x380001

    const v18, -0xe001

    if-eqz v0, :cond_1f

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_13

    .line 99
    :cond_1c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v11, 0x10

    if-eqz v0, :cond_1d

    and-int v0, v16, v18

    move/from16 v16, v0

    :cond_1d
    and-int/lit8 v0, v11, 0x40

    if-eqz v0, :cond_1e

    and-int v0, v16, v2

    move-object v2, v15

    move-object v15, v12

    move-object v12, v2

    move-object/from16 v2, p7

    move v4, v0

    move-object/from16 v22, v9

    move v8, v13

    move-object/from16 v20, v14

    move-object v13, v1

    move v14, v7

    const/4 v1, 0x0

    .end local v16    # "$dirty":I
    .local v0, "$dirty":I
    goto/16 :goto_17

    .end local v0    # "$dirty":I
    .restart local v16    # "$dirty":I
    :cond_1e
    move-object v2, v15

    move-object v15, v12

    move-object v12, v2

    move-object/from16 v2, p7

    move-object/from16 v22, v9

    move v8, v13

    move-object/from16 v20, v14

    move/from16 v4, v16

    move-object v13, v1

    move v14, v7

    const/4 v1, 0x0

    goto/16 :goto_17

    .line 101
    :cond_1f
    :goto_13
    if-eqz v4, :cond_20

    .line 93
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v5, v0

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v5, "modifier":Landroidx/compose/ui/Modifier;
    :cond_20
    if-eqz v6, :cond_21

    .line 94
    const/4 v0, 0x1

    move v7, v0

    .end local p2    # "enabled":Z
    .local v7, "enabled":Z
    :cond_21
    if-eqz v8, :cond_22

    .line 95
    const/4 v0, 0x0

    move-object v9, v0

    .end local p3    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v9, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_22
    and-int/lit8 v0, v11, 0x10

    if-eqz v0, :cond_23

    .line 96
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    const/4 v4, 0x6

    invoke-virtual {v0, v1, v4}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material/Shapes;->getSmall()Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v0

    const/16 v4, 0x32

    invoke-static {v4}, Landroidx/compose/foundation/shape/CornerSizeKt;->CornerSize(I)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/compose/foundation/shape/CornerBasedShape;->copy(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/Shape;

    .end local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v0, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v4, v16, v18

    .end local v16    # "$dirty":I
    .local v4, "$dirty":I
    goto :goto_14

    .line 95
    .end local v0    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v4    # "$dirty":I
    .restart local v16    # "$dirty":I
    .restart local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_23
    move-object v0, v12

    move/from16 v4, v16

    .line 96
    .end local v16    # "$dirty":I
    .end local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local v0    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local v4    # "$dirty":I
    :goto_14
    if-eqz p9, :cond_24

    .line 97
    const/4 v6, 0x0

    .end local p5    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v6, "border":Landroidx/compose/foundation/BorderStroke;
    goto :goto_15

    .line 96
    .end local v6    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local p5    # "border":Landroidx/compose/foundation/BorderStroke;
    :cond_24
    move-object v6, v14

    .line 97
    .end local p5    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local v6    # "border":Landroidx/compose/foundation/BorderStroke;
    :goto_15
    and-int/lit8 v8, v11, 0x40

    if-eqz v8, :cond_25

    .line 98
    sget-object v12, Landroidx/compose/material/ChipDefaults;->INSTANCE:Landroidx/compose/material/ChipDefaults;

    const/high16 v26, 0x180000

    const/16 v27, 0x3f

    move v8, v13

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v19, 0x0

    const-wide/16 v17, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v23, v21

    const-wide/16 v21, 0x0

    move/from16 v25, v23

    const-wide/16 v23, 0x0

    move/from16 v31, v25

    move-object/from16 v25, v1

    move/from16 v1, v31

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .local v25, "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v12 .. v27}, Landroidx/compose/material/ChipDefaults;->chipColors-5tl4gsc(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;

    move-result-object v12

    move-object/from16 v13, v25

    .end local v25    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p6    # "colors":Landroidx/compose/material/ChipColors;
    .local v12, "colors":Landroidx/compose/material/ChipColors;
    .local v13, "$composer":Landroidx/compose/runtime/Composer;
    and-int/2addr v4, v2

    goto :goto_16

    .line 97
    .end local v12    # "colors":Landroidx/compose/material/ChipColors;
    .end local v13    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p6    # "colors":Landroidx/compose/material/ChipColors;
    :cond_25
    move v8, v13

    move-object v13, v1

    const/4 v1, 0x0

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v13    # "$composer":Landroidx/compose/runtime/Composer;
    move-object/from16 v12, p6

    .line 98
    .end local p6    # "colors":Landroidx/compose/material/ChipColors;
    .restart local v12    # "colors":Landroidx/compose/material/ChipColors;
    :goto_16
    if-eqz v29, :cond_26

    .line 99
    const/4 v2, 0x0

    move-object v15, v0

    move-object/from16 v20, v6

    move v14, v7

    move-object/from16 v22, v9

    .end local p7    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v2, "leadingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_17

    .line 98
    .end local v2    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p7    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_26
    move-object/from16 v2, p7

    move-object v15, v0

    move-object/from16 v20, v6

    move v14, v7

    move-object/from16 v22, v9

    .line 99
    .end local v0    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v6    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v7    # "enabled":Z
    .end local v9    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p7    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local v2    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v14, "enabled":Z
    .local v15, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v20, "border":Landroidx/compose/foundation/BorderStroke;
    .local v22, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_17
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_27

    .line 101
    const/4 v0, -0x1

    const-string v6, "androidx.compose.material.Chip (Chip.kt:100)"

    const v7, -0x15f54878

    invoke-static {v7, v4, v0, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 102
    :cond_27
    shr-int/lit8 v0, v4, 0x6

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v6, v4, 0xf

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v0, v6

    invoke-interface {v12, v14, v13, v0}, Landroidx/compose/material/ChipColors;->contentColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 104
    .local v0, "contentColor$delegate":Landroidx/compose/runtime/State;
    nop

    .line 105
    sget-object v6, Landroidx/compose/material/ChipKt$Chip$1;->INSTANCE:Landroidx/compose/material/ChipKt$Chip$1;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-static {v5, v1, v6, v8, v7}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 106
    nop

    .line 107
    nop

    .line 108
    shr-int/lit8 v6, v4, 0x6

    and-int/lit8 v6, v6, 0xe

    shr-int/lit8 v7, v4, 0xf

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v6, v7

    invoke-interface {v12, v14, v13, v6}, Landroidx/compose/material/ChipColors;->backgroundColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v6

    invoke-interface {v6}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v6}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v16

    .line 109
    invoke-static {v0}, Landroidx/compose/material/ChipKt;->Chip$lambda$0(Landroidx/compose/runtime/State;)J

    move-result-wide v23

    const/16 v29, 0xe

    const/16 v30, 0x0

    const/high16 v25, 0x3f800000    # 1.0f

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v23 .. v30}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v18

    .line 110
    nop

    .line 111
    nop

    .line 112
    new-instance v6, Landroidx/compose/material/ChipKt$Chip$2;

    move-object/from16 p6, p8

    move-object/from16 p2, v0

    move-object/from16 p3, v2

    move-object/from16 p1, v6

    move-object/from16 p4, v12

    move/from16 p5, v14

    .end local v0    # "contentColor$delegate":Landroidx/compose/runtime/State;
    .end local v2    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v12    # "colors":Landroidx/compose/material/ChipColors;
    .end local v14    # "enabled":Z
    .local p2, "contentColor$delegate":Landroidx/compose/runtime/State;
    .local p3, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local p4, "colors":Landroidx/compose/material/ChipColors;
    .local p5, "enabled":Z
    invoke-direct/range {p1 .. p6}, Landroidx/compose/material/ChipKt$Chip$2;-><init>(Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ChipColors;ZLkotlin/jvm/functions/Function3;)V

    move-object/from16 v2, p1

    move-object/from16 v7, p3

    move-object/from16 v6, p4

    .end local p2    # "contentColor$delegate":Landroidx/compose/runtime/State;
    .end local p3    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local p4    # "colors":Landroidx/compose/material/ChipColors;
    .end local p5    # "enabled":Z
    .restart local v0    # "contentColor$delegate":Landroidx/compose/runtime/State;
    .local v6, "colors":Landroidx/compose/material/ChipColors;
    .local v7, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local v14    # "enabled":Z
    const/16 v9, 0x36

    const v12, 0x84a244f

    invoke-static {v12, v8, v2, v13, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Lkotlin/jvm/functions/Function2;

    and-int/lit8 v2, v4, 0xe

    const/high16 v8, 0x30000000

    or-int/2addr v2, v8

    and-int/lit16 v8, v4, 0x380

    or-int/2addr v2, v8

    shr-int/lit8 v8, v4, 0x3

    and-int/lit16 v8, v8, 0x1c00

    or-int/2addr v2, v8

    shl-int/lit8 v8, v4, 0x3

    const/high16 v9, 0x380000

    and-int/2addr v8, v9

    or-int/2addr v2, v8

    const/high16 v8, 0xe000000

    shl-int/lit8 v9, v4, 0xf

    and-int/2addr v8, v9

    or-int v25, v2, v8

    .line 103
    const/16 v21, 0x0

    const/16 v26, 0x80

    move-object v12, v3

    move-object/from16 v24, v13

    move-object v13, v1

    .end local v13    # "$composer":Landroidx/compose/runtime/Composer;
    .local v24, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v12 .. v26}, Landroidx/compose/material/SurfaceKt;->Surface-LPr_se0(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 142
    .end local v0    # "contentColor$delegate":Landroidx/compose/runtime/State;
    :cond_28
    move/from16 v16, v4

    move-object v2, v5

    move-object v8, v7

    move v3, v14

    move-object v5, v15

    move-object/from16 v4, v22

    move-object v7, v6

    move-object/from16 v6, v20

    goto :goto_18

    .end local v4    # "$dirty":I
    .end local v5    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v6    # "colors":Landroidx/compose/material/ChipColors;
    .end local v7    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v14    # "enabled":Z
    .end local v15    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v20    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v22    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v24    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v16    # "$dirty":I
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local p2, "enabled":Z
    .local p3, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local p4, "shape":Landroidx/compose/ui/graphics/Shape;
    .local p5, "border":Landroidx/compose/foundation/BorderStroke;
    .restart local p6    # "colors":Landroidx/compose/material/ChipColors;
    .restart local p7    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_29
    move-object/from16 v24, v1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v24    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move-object v2, v5

    move v3, v7

    move-object v4, v9

    move-object v5, v12

    move-object v6, v14

    move-object/from16 v7, p6

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "enabled":Z
    .end local p3    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p5    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local p6    # "colors":Landroidx/compose/material/ChipColors;
    .end local p7    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "enabled":Z
    .local v4, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v5, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v6, "border":Landroidx/compose/foundation/BorderStroke;
    .local v7, "colors":Landroidx/compose/material/ChipColors;
    .local v8, "leadingIcon":Lkotlin/jvm/functions/Function2;
    :goto_18
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_2a

    new-instance v0, Landroidx/compose/material/ChipKt$Chip$3;

    move-object/from16 v1, p0

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v11}, Landroidx/compose/material/ChipKt$Chip$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2a
    return-void
.end method

.method private static final Chip$lambda$0(Landroidx/compose/runtime/State;)J
    .locals 4
    .param p0, "$contentColor$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/graphics/Color;",
            ">;)J"
        }
    .end annotation

    .line 102
    const/4 v0, 0x0

    .local v0, "thisObj$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 731
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "thisObj$iv":Ljava/lang/Object;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v0

    .line 102
    return-wide v0
.end method

.method public static final FilterChip(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 35
    .param p0, "selected"    # Z
    .param p1, "onClick"    # Lkotlin/jvm/functions/Function0;
    .param p2, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p3, "enabled"    # Z
    .param p4, "interactionSource"    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .param p5, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p6, "border"    # Landroidx/compose/foundation/BorderStroke;
    .param p7, "colors"    # Landroidx/compose/material/SelectableChipColors;
    .param p8, "leadingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p9, "selectedIcon"    # Lkotlin/jvm/functions/Function2;
    .param p10, "trailingIcon"    # Lkotlin/jvm/functions/Function2;
    .param p11, "content"    # Lkotlin/jvm/functions/Function3;
    .param p12, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p13, "$changed"    # I
    .param p14, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/material/SelectableChipColors;",
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
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/RowScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 197
    move/from16 v0, p0

    move-object/from16 v1, p7

    move/from16 v2, p13

    move/from16 v3, p15

    const v4, -0x4b0dfe36

    move-object/from16 v5, p12

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    .end local p12    # "$composer":Landroidx/compose/runtime/Composer;
    .local v13, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(FilterChip)P(8,7,6,3,4,10!2,5,9,11)198@9258L31,205@9496L34,209@9670L3851,199@9294L4227:Chip.kt#jmzs0o"

    invoke-static {v13, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p13

    .local v5, "$dirty":I
    move/from16 v6, p14

    .local v6, "$dirty1":I
    and-int/lit8 v7, v3, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v5, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v2, 0x6

    if-nez v7, :cond_2

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v5, v7

    :cond_2
    :goto_1
    and-int/lit8 v7, v3, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v2, 0x30

    if-nez v7, :cond_5

    move-object/from16 v7, p1

    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v5, v12

    goto :goto_3

    :cond_5
    move-object/from16 v7, p1

    :goto_3
    and-int/lit8 v12, v3, 0x4

    if-eqz v12, :cond_6

    or-int/lit16 v5, v5, 0x180

    move-object/from16 v14, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v14, v2, 0x180

    if-nez v14, :cond_8

    move-object/from16 v14, p2

    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_7

    const/16 v15, 0x100

    goto :goto_4

    :cond_7
    const/16 v15, 0x80

    :goto_4
    or-int/2addr v5, v15

    goto :goto_5

    :cond_8
    move-object/from16 v14, p2

    :goto_5
    and-int/lit8 v15, v3, 0x8

    if-eqz v15, :cond_9

    or-int/lit16 v5, v5, 0xc00

    move/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v2, 0xc00

    if-nez v8, :cond_b

    move/from16 v8, p3

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v5, v5, v16

    goto :goto_7

    :cond_b
    move/from16 v8, p3

    :goto_7
    and-int/lit8 v16, v3, 0x10

    if-eqz v16, :cond_c

    or-int/lit16 v5, v5, 0x6000

    move-object/from16 v9, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v9, v2, 0x6000

    if-nez v9, :cond_e

    move-object/from16 v9, p4

    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_d

    const/16 v18, 0x4000

    goto :goto_8

    :cond_d
    const/16 v18, 0x2000

    :goto_8
    or-int v5, v5, v18

    goto :goto_9

    :cond_e
    move-object/from16 v9, p4

    :goto_9
    const/high16 v18, 0x30000

    and-int v18, v2, v18

    if-nez v18, :cond_11

    and-int/lit8 v18, v3, 0x20

    if-nez v18, :cond_f

    move-object/from16 v10, p5

    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v10, p5

    :cond_10
    const/high16 v19, 0x10000

    :goto_a
    or-int v5, v5, v19

    goto :goto_b

    :cond_11
    move-object/from16 v10, p5

    :goto_b
    and-int/lit8 v19, v3, 0x40

    const/high16 v20, 0x180000

    if-eqz v19, :cond_12

    or-int v5, v5, v20

    move-object/from16 v11, p6

    goto :goto_d

    :cond_12
    and-int v20, v2, v20

    if-nez v20, :cond_14

    move-object/from16 v11, p6

    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v21, 0x80000

    :goto_c
    or-int v5, v5, v21

    goto :goto_d

    :cond_14
    move-object/from16 v11, p6

    :goto_d
    const/high16 v21, 0xc00000

    and-int v21, v2, v21

    if-nez v21, :cond_17

    and-int/lit16 v4, v3, 0x80

    if-nez v4, :cond_16

    const/high16 v4, 0x1000000

    and-int/2addr v4, v2

    if-nez v4, :cond_15

    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_e

    :cond_15
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    :goto_e
    if-eqz v4, :cond_16

    const/high16 v4, 0x800000

    goto :goto_f

    :cond_16
    const/high16 v4, 0x400000

    :goto_f
    or-int/2addr v5, v4

    :cond_17
    and-int/lit16 v4, v3, 0x100

    const/high16 v21, 0x6000000

    if-eqz v4, :cond_18

    or-int v5, v5, v21

    move/from16 v21, v6

    move-object/from16 v6, p8

    goto :goto_11

    :cond_18
    and-int v21, v2, v21

    if-nez v21, :cond_1a

    move/from16 v21, v6

    move-object/from16 v6, p8

    .end local v6    # "$dirty1":I
    .local v21, "$dirty1":I
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_19

    const/high16 v22, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v22, 0x2000000

    :goto_10
    or-int v5, v5, v22

    goto :goto_11

    .end local v21    # "$dirty1":I
    .restart local v6    # "$dirty1":I
    :cond_1a
    move/from16 v21, v6

    move-object/from16 v6, p8

    .end local v6    # "$dirty1":I
    .restart local v21    # "$dirty1":I
    :goto_11
    and-int/lit16 v6, v3, 0x200

    const/high16 v22, 0x30000000

    if-eqz v6, :cond_1b

    or-int v5, v5, v22

    move/from16 v22, v6

    move-object/from16 v6, p9

    goto :goto_13

    :cond_1b
    and-int v22, v2, v22

    if-nez v22, :cond_1d

    move/from16 v22, v6

    move-object/from16 v6, p9

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1c

    const/high16 v23, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v23, 0x10000000

    :goto_12
    or-int v5, v5, v23

    goto :goto_13

    :cond_1d
    move/from16 v22, v6

    move-object/from16 v6, p9

    :goto_13
    and-int/lit16 v6, v3, 0x400

    if-eqz v6, :cond_1e

    or-int/lit8 v17, v21, 0x6

    move/from16 v23, v6

    move-object/from16 v6, p10

    .end local v21    # "$dirty1":I
    .local v17, "$dirty1":I
    :goto_14
    goto :goto_16

    .end local v17    # "$dirty1":I
    .restart local v21    # "$dirty1":I
    :cond_1e
    and-int/lit8 v23, p14, 0x6

    if-nez v23, :cond_20

    move/from16 v23, v6

    move-object/from16 v6, p10

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1f

    const/16 v17, 0x4

    goto :goto_15

    :cond_1f
    const/16 v17, 0x2

    :goto_15
    or-int v17, v21, v17

    goto :goto_14

    :cond_20
    move/from16 v23, v6

    move-object/from16 v6, p10

    move/from16 v17, v21

    .end local v21    # "$dirty1":I
    .restart local v17    # "$dirty1":I
    :goto_16
    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_21

    or-int/lit8 v17, v17, 0x30

    move-object/from16 v1, p11

    goto :goto_18

    :cond_21
    and-int/lit8 v1, p14, 0x30

    if-nez v1, :cond_23

    move-object/from16 v1, p11

    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_22

    const/16 v18, 0x20

    goto :goto_17

    :cond_22
    const/16 v18, 0x10

    :goto_17
    or-int v17, v17, v18

    goto :goto_18

    :cond_23
    move-object/from16 v1, p11

    :goto_18
    move/from16 v6, v17

    .end local v17    # "$dirty1":I
    .restart local v6    # "$dirty1":I
    const v17, 0x12492493

    and-int v1, v5, v17

    const v2, 0x12492492

    move/from16 p12, v6

    .end local v6    # "$dirty1":I
    .local p12, "$dirty1":I
    const/4 v6, 0x1

    if-ne v1, v2, :cond_25

    and-int/lit8 v1, p12, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_24

    goto :goto_19

    :cond_24
    const/4 v1, 0x0

    goto :goto_1a

    :cond_25
    :goto_19
    move v1, v6

    :goto_1a
    and-int/lit8 v2, v5, 0x1

    invoke-interface {v13, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_35

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v1, "189@8800L6,191@8927L18"

    invoke-static {v13, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v1, p13, 0x1

    if-eqz v1, :cond_29

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_1b

    .line 195
    :cond_26
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v3, 0x20

    if-eqz v1, :cond_27

    const v1, -0x70001

    and-int/2addr v5, v1

    :cond_27
    and-int/lit16 v1, v3, 0x80

    if-eqz v1, :cond_28

    const v1, -0x1c00001

    and-int/2addr v1, v5

    move-object v2, v11

    move-object v11, v9

    move-object v9, v2

    move-object/from16 v5, p7

    move-object/from16 v7, p9

    move-object/from16 v12, p10

    move v2, v6

    move-object v4, v14

    move-object/from16 v6, p8

    move v14, v1

    move/from16 v1, p12

    .end local v5    # "$dirty":I
    .local v1, "$dirty":I
    goto/16 :goto_24

    .end local v1    # "$dirty":I
    .restart local v5    # "$dirty":I
    :cond_28
    move-object v1, v11

    move-object v11, v9

    move-object v9, v1

    move-object/from16 v7, p9

    move-object/from16 v12, p10

    move/from16 v1, p12

    move v2, v6

    move-object v4, v14

    move-object/from16 v6, p8

    move v14, v5

    move-object/from16 v5, p7

    goto/16 :goto_24

    .line 197
    :cond_29
    :goto_1b
    if-eqz v12, :cond_2a

    .line 187
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local v1, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_1c

    .line 197
    .end local v1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_2a
    move-object v1, v14

    .line 187
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v1    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1c
    if-eqz v15, :cond_2b

    .line 188
    const/4 v2, 0x1

    .end local p3    # "enabled":Z
    .local v2, "enabled":Z
    goto :goto_1d

    .line 187
    .end local v2    # "enabled":Z
    .restart local p3    # "enabled":Z
    :cond_2b
    move v2, v8

    .line 188
    .end local p3    # "enabled":Z
    .restart local v2    # "enabled":Z
    :goto_1d
    if-eqz v16, :cond_2c

    .line 189
    const/4 v8, 0x0

    move-object/from16 v27, v8

    .end local p4    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v8, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    goto :goto_1e

    .line 188
    .end local v8    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p4    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :cond_2c
    move-object/from16 v27, v9

    .line 189
    .end local p4    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v27, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    :goto_1e
    and-int/lit8 v8, v3, 0x20

    if-eqz v8, :cond_2d

    .line 190
    sget-object v8, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    const/4 v9, 0x6

    invoke-virtual {v8, v13, v9}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/material/Shapes;->getSmall()Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v8

    const/16 v9, 0x32

    invoke-static {v9}, Landroidx/compose/foundation/shape/CornerSizeKt;->CornerSize(I)Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/compose/foundation/shape/CornerBasedShape;->copy(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/graphics/Shape;

    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v8, "shape":Landroidx/compose/ui/graphics/Shape;
    const v9, -0x70001

    and-int/2addr v5, v9

    move-object/from16 v28, v8

    move/from16 v29, v5

    goto :goto_1f

    .line 189
    .end local v8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_2d
    move-object/from16 v28, v10

    move/from16 v29, v5

    .line 190
    .end local v5    # "$dirty":I
    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v28, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v29, "$dirty":I
    :goto_1f
    if-eqz v19, :cond_2e

    .line 191
    const/4 v5, 0x0

    move-object/from16 v30, v5

    .end local p6    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v5, "border":Landroidx/compose/foundation/BorderStroke;
    goto :goto_20

    .line 190
    .end local v5    # "border":Landroidx/compose/foundation/BorderStroke;
    .restart local p6    # "border":Landroidx/compose/foundation/BorderStroke;
    :cond_2e
    move-object/from16 v30, v11

    .line 191
    .end local p6    # "border":Landroidx/compose/foundation/BorderStroke;
    .local v30, "border":Landroidx/compose/foundation/BorderStroke;
    :goto_20
    and-int/lit16 v5, v3, 0x80

    if-eqz v5, :cond_2f

    .line 192
    sget-object v5, Landroidx/compose/material/ChipDefaults;->INSTANCE:Landroidx/compose/material/ChipDefaults;

    const/high16 v25, 0x30000000

    const/16 v26, 0x1ff

    move v8, v6

    const-wide/16 v6, 0x0

    move v10, v8

    const-wide/16 v8, 0x0

    move v12, v10

    const-wide/16 v10, 0x0

    move v14, v12

    move-object/from16 v24, v13

    .end local v13    # "$composer":Landroidx/compose/runtime/Composer;
    .local v24, "$composer":Landroidx/compose/runtime/Composer;
    const-wide/16 v12, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v31, v20

    const-wide/16 v20, 0x0

    move/from16 v32, v22

    move/from16 v33, v23

    const-wide/16 v22, 0x0

    move-object/from16 p2, v1

    move/from16 p3, v2

    move/from16 v2, v31

    move/from16 v1, p12

    .end local v2    # "enabled":Z
    .end local p12    # "$dirty1":I
    .local v1, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "enabled":Z
    invoke-virtual/range {v5 .. v26}, Landroidx/compose/material/ChipDefaults;->filterChipColors-J08w3-E(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;

    move-result-object v5

    move-object/from16 v13, v24

    .end local v24    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p7    # "colors":Landroidx/compose/material/SelectableChipColors;
    .local v5, "colors":Landroidx/compose/material/SelectableChipColors;
    .restart local v13    # "$composer":Landroidx/compose/runtime/Composer;
    const v6, -0x1c00001

    and-int v29, v29, v6

    goto :goto_21

    .line 191
    .end local v5    # "colors":Landroidx/compose/material/SelectableChipColors;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "enabled":Z
    .local v1, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "enabled":Z
    .restart local p7    # "colors":Landroidx/compose/material/SelectableChipColors;
    .restart local p12    # "$dirty1":I
    :cond_2f
    move-object/from16 p2, v1

    move/from16 p3, v2

    move v2, v6

    move/from16 v32, v22

    move/from16 v33, v23

    move/from16 v1, p12

    .end local v2    # "enabled":Z
    .end local p12    # "$dirty1":I
    .local v1, "$dirty1":I
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "enabled":Z
    move-object/from16 v5, p7

    .line 192
    .end local p7    # "colors":Landroidx/compose/material/SelectableChipColors;
    .restart local v5    # "colors":Landroidx/compose/material/SelectableChipColors;
    :goto_21
    if-eqz v4, :cond_30

    .line 193
    const/4 v4, 0x0

    .end local p8    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v4, "leadingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_22

    .line 192
    .end local v4    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p8    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :cond_30
    move-object/from16 v4, p8

    .line 193
    .end local p8    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .restart local v4    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    :goto_22
    if-eqz v32, :cond_31

    .line 194
    const/4 v6, 0x0

    .end local p9    # "selectedIcon":Lkotlin/jvm/functions/Function2;
    .local v6, "selectedIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_23

    .line 193
    .end local v6    # "selectedIcon":Lkotlin/jvm/functions/Function2;
    .restart local p9    # "selectedIcon":Lkotlin/jvm/functions/Function2;
    :cond_31
    move-object/from16 v6, p9

    .line 194
    .end local p9    # "selectedIcon":Lkotlin/jvm/functions/Function2;
    .restart local v6    # "selectedIcon":Lkotlin/jvm/functions/Function2;
    :goto_23
    if-eqz v33, :cond_32

    .line 195
    const/4 v7, 0x0

    move/from16 v8, p3

    move-object v12, v7

    move-object/from16 v11, v27

    move-object/from16 v10, v28

    move/from16 v14, v29

    move-object/from16 v9, v30

    move-object v7, v6

    move-object v6, v4

    move-object/from16 v4, p2

    .end local p10    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v7, "trailingIcon":Lkotlin/jvm/functions/Function2;
    goto :goto_24

    .line 194
    .end local v7    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p10    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    :cond_32
    move/from16 v8, p3

    move-object/from16 v12, p10

    move-object v7, v6

    move-object/from16 v11, v27

    move-object/from16 v10, v28

    move/from16 v14, v29

    move-object/from16 v9, v30

    move-object v6, v4

    move-object/from16 v4, p2

    .line 195
    .end local v27    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v28    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v29    # "$dirty":I
    .end local v30    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "enabled":Z
    .end local p10    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v4, "modifier":Landroidx/compose/ui/Modifier;
    .local v6, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v7, "selectedIcon":Lkotlin/jvm/functions/Function2;
    .local v8, "enabled":Z
    .local v9, "border":Landroidx/compose/foundation/BorderStroke;
    .local v10, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v11, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v12, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v14, "$dirty":I
    :goto_24
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v15

    if-eqz v15, :cond_33

    .line 197
    const-string v15, "androidx.compose.material.FilterChip (Chip.kt:196)"

    const v2, -0x4b0dfe36

    invoke-static {v2, v14, v1, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 199
    :cond_33
    shr-int/lit8 v2, v14, 0x9

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v15, v14, 0x3

    and-int/lit8 v15, v15, 0x70

    or-int/2addr v2, v15

    shr-int/lit8 v15, v14, 0xf

    and-int/lit16 v15, v15, 0x380

    or-int/2addr v2, v15

    invoke-interface {v5, v8, v0, v13, v2}, Landroidx/compose/material/SelectableChipColors;->contentColor(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    .line 203
    .local v2, "contentColor":Landroidx/compose/runtime/State;
    sget-object v15, Landroidx/compose/material/ChipKt$FilterChip$1;->INSTANCE:Landroidx/compose/material/ChipKt$FilterChip$1;

    check-cast v15, Lkotlin/jvm/functions/Function1;

    move/from16 p12, v1

    .end local v1    # "$dirty1":I
    .restart local p12    # "$dirty1":I
    const/4 v1, 0x0

    move-object/from16 p3, v2

    .end local v2    # "contentColor":Landroidx/compose/runtime/State;
    .local p3, "contentColor":Landroidx/compose/runtime/State;
    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v4, v2, v15, v3, v1}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 206
    shr-int/lit8 v1, v14, 0x9

    and-int/lit8 v1, v1, 0xe

    shl-int/lit8 v3, v14, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v1, v3

    shr-int/lit8 v3, v14, 0xf

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v1, v3

    invoke-interface {v5, v8, v0, v13, v1}, Landroidx/compose/material/SelectableChipColors;->backgroundColor(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v17

    .line 207
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v19

    const/16 v25, 0xe

    const/16 v26, 0x0

    const/high16 v21, 0x3f800000    # 1.0f

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v19 .. v26}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v19

    .line 201
    nop

    .line 202
    nop

    .line 203
    nop

    .line 204
    nop

    .line 205
    nop

    .line 206
    nop

    .line 207
    nop

    .line 209
    nop

    .line 208
    nop

    .line 210
    new-instance v1, Landroidx/compose/material/ChipKt$FilterChip$2;

    move-object/from16 p8, p11

    move/from16 p5, v0

    move-object/from16 p2, v1

    move-object/from16 p9, v5

    move-object/from16 p4, v6

    move-object/from16 p6, v7

    move/from16 p10, v8

    move-object/from16 p7, v12

    .end local v5    # "colors":Landroidx/compose/material/SelectableChipColors;
    .end local v6    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v7    # "selectedIcon":Lkotlin/jvm/functions/Function2;
    .end local v8    # "enabled":Z
    .end local v12    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local p4, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local p6, "selectedIcon":Lkotlin/jvm/functions/Function2;
    .local p7, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local p9, "colors":Landroidx/compose/material/SelectableChipColors;
    .local p10, "enabled":Z
    invoke-direct/range {p2 .. p10}, Landroidx/compose/material/ChipKt$FilterChip$2;-><init>(Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/material/SelectableChipColors;Z)V

    move-object/from16 v0, p2

    move-object/from16 v21, p3

    move-object/from16 v23, p4

    move-object/from16 v24, p6

    move-object/from16 v25, p7

    move-object/from16 v22, p9

    move/from16 v3, p10

    .end local p3    # "contentColor":Landroidx/compose/runtime/State;
    .end local p4    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local p6    # "selectedIcon":Lkotlin/jvm/functions/Function2;
    .end local p7    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local p9    # "colors":Landroidx/compose/material/SelectableChipColors;
    .end local p10    # "enabled":Z
    .local v3, "enabled":Z
    .local v21, "contentColor":Landroidx/compose/runtime/State;
    .local v22, "colors":Landroidx/compose/material/SelectableChipColors;
    .local v23, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v24, "selectedIcon":Lkotlin/jvm/functions/Function2;
    .local v25, "trailingIcon":Lkotlin/jvm/functions/Function2;
    const/16 v1, 0x36

    const v5, 0x2b0ac65f

    const/4 v8, 0x1

    invoke-static {v5, v8, v0, v13, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lkotlin/jvm/functions/Function2;

    and-int/lit8 v0, v14, 0xe

    and-int/lit8 v1, v14, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, v14, 0x1c00

    or-int/2addr v0, v1

    shr-int/lit8 v1, v14, 0x3

    const v5, 0xe000

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x1c00000

    shl-int/lit8 v5, v14, 0x3

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    const/high16 v1, 0x70000000

    shl-int/lit8 v5, v14, 0xf

    and-int/2addr v1, v5

    or-int/2addr v0, v1

    .line 200
    move-object v1, v4

    move-object v4, v10

    .end local v10    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v1, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "shape":Landroidx/compose/ui/graphics/Shape;
    const/4 v10, 0x0

    const/4 v15, 0x6

    const/16 v16, 0x100

    move/from16 v29, v14

    move-wide/from16 v5, v17

    move-wide/from16 v7, v19

    move/from16 v17, p12

    move v14, v0

    move-object/from16 v18, v1

    move/from16 v0, p0

    move-object/from16 v1, p1

    .end local v1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v14    # "$dirty":I
    .end local p12    # "$dirty1":I
    .restart local v17    # "$dirty1":I
    .local v18, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v29    # "$dirty":I
    invoke-static/range {v0 .. v16}, Landroidx/compose/material/SurfaceKt;->Surface-Ny5ogXk(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v16, v13

    .end local v13    # "$composer":Landroidx/compose/runtime/Composer;
    .local v16, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 286
    .end local v21    # "contentColor":Landroidx/compose/runtime/State;
    :cond_34
    move-object v6, v4

    move-object v7, v9

    move-object v5, v11

    move-object/from16 v8, v22

    move-object/from16 v9, v23

    move-object/from16 v10, v24

    move-object/from16 v11, v25

    move v4, v3

    move-object/from16 v3, v18

    goto :goto_25

    .end local v3    # "enabled":Z
    .end local v4    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v9    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local v11    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local v16    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v17    # "$dirty1":I
    .end local v18    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v22    # "colors":Landroidx/compose/material/SelectableChipColors;
    .end local v23    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local v24    # "selectedIcon":Lkotlin/jvm/functions/Function2;
    .end local v25    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .end local v29    # "$dirty":I
    .local v5, "$dirty":I
    .restart local v13    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .local p3, "enabled":Z
    .local p4, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .restart local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local p6, "border":Landroidx/compose/foundation/BorderStroke;
    .local p7, "colors":Landroidx/compose/material/SelectableChipColors;
    .restart local p8    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local p9, "selectedIcon":Lkotlin/jvm/functions/Function2;
    .local p10, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local p12    # "$dirty1":I
    :cond_35
    move/from16 v17, p12

    move-object/from16 v16, v13

    .end local v13    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p12    # "$dirty1":I
    .restart local v16    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v17    # "$dirty1":I
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v29, v5

    move v4, v8

    move-object v5, v9

    move-object v6, v10

    move-object v7, v11

    move-object v3, v14

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    .end local p2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "enabled":Z
    .end local p4    # "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .end local p5    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local p6    # "border":Landroidx/compose/foundation/BorderStroke;
    .end local p7    # "colors":Landroidx/compose/material/SelectableChipColors;
    .end local p8    # "leadingIcon":Lkotlin/jvm/functions/Function2;
    .end local p9    # "selectedIcon":Lkotlin/jvm/functions/Function2;
    .end local p10    # "trailingIcon":Lkotlin/jvm/functions/Function2;
    .local v3, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "enabled":Z
    .local v5, "interactionSource":Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .local v6, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v7, "border":Landroidx/compose/foundation/BorderStroke;
    .local v8, "colors":Landroidx/compose/material/SelectableChipColors;
    .local v9, "leadingIcon":Lkotlin/jvm/functions/Function2;
    .local v10, "selectedIcon":Lkotlin/jvm/functions/Function2;
    .local v11, "trailingIcon":Lkotlin/jvm/functions/Function2;
    .restart local v29    # "$dirty":I
    :goto_25
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_36

    move-object v1, v0

    new-instance v0, Landroidx/compose/material/ChipKt$FilterChip$3;

    move-object/from16 v2, p1

    move-object/from16 v12, p11

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v34, v1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v15}, Landroidx/compose/material/ChipKt$FilterChip$3;-><init>(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v34

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_36
    return-void
.end method

.method public static final synthetic access$Chip$lambda$0(Landroidx/compose/runtime/State;)J
    .locals 2
    .param p0, "$contentColor$delegate"    # Landroidx/compose/runtime/State;

    .line 1
    invoke-static {p0}, Landroidx/compose/material/ChipKt;->Chip$lambda$0(Landroidx/compose/runtime/State;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$getHorizontalPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material/ChipKt;->HorizontalPadding:F

    return v0
.end method

.method public static final synthetic access$getLeadingIconEndSpacing$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material/ChipKt;->LeadingIconEndSpacing:F

    return v0
.end method

.method public static final synthetic access$getLeadingIconStartSpacing$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material/ChipKt;->LeadingIconStartSpacing:F

    return v0
.end method

.method public static final synthetic access$getSelectedIconContainerSize$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material/ChipKt;->SelectedIconContainerSize:F

    return v0
.end method

.method public static final synthetic access$getTrailingIconSpacing$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material/ChipKt;->TrailingIconSpacing:F

    return v0
.end method
