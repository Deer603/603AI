.class public final Landroidx/compose/material3/ModalBottomSheet_androidKt;
.super Ljava/lang/Object;
.source "ModalBottomSheet.android.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material3/ModalBottomSheet_androidKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,640:1\n148#2:641\n77#3:642\n77#3:643\n77#3:644\n488#4:645\n487#4,4:646\n491#4,2:653\n495#4:659\n1223#5,3:650\n1226#5,3:656\n1223#5,6:660\n1223#5,6:666\n1223#5,6:672\n487#6:655\n81#7:678\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n241#1:641\n274#1:642\n275#1:643\n276#1:644\n280#1:645\n280#1:646,4\n280#1:653,2\n280#1:659\n280#1:650,3\n280#1:656,3\n283#1:660,6\n306#1:666,6\n315#1:672,6\n280#1:655\n278#1:678\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u00b9\u0001\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\r2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u00a2\u0006\u0002\u0008\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0002\u0008\u001aH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001aJ\u0010\u001d\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u0012H\u0001\u00a2\u0006\u0002\u0010\"\u001a\u000c\u0010#\u001a\u00020$*\u00020%H\u0000\u001a\u0014\u0010&\u001a\u00020$*\u00020\'2\u0006\u0010(\u001a\u00020$H\u0002\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006)\u00b2\u0006\u0015\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u0012X\u008a\u0084\u0002"
    }
    d2 = {
        "ModalBottomSheet",
        "",
        "onDismissRequest",
        "Lkotlin/Function0;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "sheetState",
        "Landroidx/compose/material3/SheetState;",
        "sheetMaxWidth",
        "Landroidx/compose/ui/unit/Dp;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "containerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "tonalElevation",
        "scrimColor",
        "dragHandle",
        "Landroidx/compose/runtime/Composable;",
        "windowInsets",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "properties",
        "Landroidx/compose/material3/ModalBottomSheetProperties;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Lkotlin/ExtensionFunctionType;",
        "ModalBottomSheet-dYc4hso",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "ModalBottomSheetDialog",
        "predictiveBackProgress",
        "Landroidx/compose/animation/core/Animatable;",
        "",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "isFlagSecureEnabled",
        "",
        "Landroid/view/View;",
        "shouldApplySecureFlag",
        "Landroidx/compose/ui/window/SecureFlagPolicy;",
        "isSecureFlagSetOnParent",
        "material3_release",
        "currentContent"
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
.method public static final synthetic ModalBottomSheet-dYc4hso(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 28
    .param p0, "onDismissRequest"    # Lkotlin/jvm/functions/Function0;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "sheetState"    # Landroidx/compose/material3/SheetState;
    .param p3, "sheetMaxWidth"    # F
    .param p4, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p5, "containerColor"    # J
    .param p7, "contentColor"    # J
    .param p9, "tonalElevation"    # F
    .param p10, "scrimColor"    # J
    .param p12, "dragHandle"    # Lkotlin/jvm/functions/Function2;
    .param p13, "windowInsets"    # Landroidx/compose/foundation/layout/WindowInsets;
    .param p14, "properties"    # Landroidx/compose/material3/ModalBottomSheetProperties;
    .param p15, "content"    # Lkotlin/jvm/functions/Function3;
    .param p16, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p17, "$changed"    # I
    .param p18, "$changed1"    # I
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Use constructor with contentWindowInsets parameter."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "ModalBottomSheet(onDismissRequest,modifier,sheetState,sheetMaxWidth,shape,containerColor,contentColor,tonalElevation,scrimColor,dragHandle,{ windowInsets },properties,content,)"
            imports = {}
        .end subannotation
    .end annotation

    .line 248
    move/from16 v0, p17

    move/from16 v1, p18

    move/from16 v2, p19

    const v3, 0x385187de

    move-object/from16 v4, p16

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p16    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(ModalBottomSheet)P(5,4,10,9:c#ui.unit.Dp,8,0:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.unit.Dp,7:c#ui.graphics.Color,3,12,6)235@10240L31,237@10371L13,238@10434L14,239@10476L31,241@10584L10,243@10731L12,247@10884L485:ModalBottomSheet.android.kt#uh7d8r"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p17

    .local v5, "$dirty":I
    move/from16 v6, p18

    .local v6, "$dirty1":I
    and-int/lit8 v7, v2, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v5, v5, 0x6

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v0, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v10, 0x4

    goto :goto_0

    :cond_1
    const/4 v10, 0x2

    :goto_0
    or-int/2addr v5, v10

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    :goto_1
    and-int/lit8 v10, v2, 0x2

    if-eqz v10, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v13, v0, 0x30

    if-nez v13, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v14, 0x20

    goto :goto_2

    :cond_4
    const/16 v14, 0x10

    :goto_2
    or-int/2addr v5, v14

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit16 v14, v0, 0x180

    const/16 v16, 0x100

    if-nez v14, :cond_8

    and-int/lit8 v14, v2, 0x4

    if-nez v14, :cond_6

    move-object/from16 v14, p2

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_7

    move/from16 v17, v16

    goto :goto_4

    :cond_6
    move-object/from16 v14, p2

    :cond_7
    const/16 v17, 0x80

    :goto_4
    or-int v5, v5, v17

    goto :goto_5

    :cond_8
    move-object/from16 v14, p2

    :goto_5
    and-int/lit8 v17, v2, 0x8

    if-eqz v17, :cond_9

    or-int/lit16 v5, v5, 0xc00

    move/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v0, 0xc00

    if-nez v8, :cond_b

    move/from16 v8, p3

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v18

    if-eqz v18, :cond_a

    const/16 v18, 0x800

    goto :goto_6

    :cond_a
    const/16 v18, 0x400

    :goto_6
    or-int v5, v5, v18

    goto :goto_7

    :cond_b
    move/from16 v8, p3

    :goto_7
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_e

    and-int/lit8 v9, v2, 0x10

    if-nez v9, :cond_c

    move-object/from16 v9, p4

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_d

    const/16 v19, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v9, p4

    :cond_d
    const/16 v19, 0x2000

    :goto_8
    or-int v5, v5, v19

    goto :goto_9

    :cond_e
    move-object/from16 v9, p4

    :goto_9
    const/high16 v19, 0x30000

    and-int v19, v0, v19

    if-nez v19, :cond_11

    and-int/lit8 v19, v2, 0x20

    if-nez v19, :cond_f

    move-wide/from16 v11, p5

    invoke-interface {v4, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v21

    if-eqz v21, :cond_10

    const/high16 v21, 0x20000

    goto :goto_a

    :cond_f
    move-wide/from16 v11, p5

    :cond_10
    const/high16 v21, 0x10000

    :goto_a
    or-int v5, v5, v21

    goto :goto_b

    :cond_11
    move-wide/from16 v11, p5

    :goto_b
    const/high16 v21, 0x180000

    and-int v21, v0, v21

    if-nez v21, :cond_14

    and-int/lit8 v21, v2, 0x40

    if-nez v21, :cond_12

    move/from16 v22, v5

    move/from16 v21, v6

    move-wide/from16 v5, p7

    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .local v21, "$dirty1":I
    .local v22, "$dirty":I
    invoke-interface {v4, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v23

    if-eqz v23, :cond_13

    const/high16 v23, 0x100000

    goto :goto_c

    .end local v21    # "$dirty1":I
    .end local v22    # "$dirty":I
    .restart local v5    # "$dirty":I
    .restart local v6    # "$dirty1":I
    :cond_12
    move/from16 v22, v5

    move/from16 v21, v6

    move-wide/from16 v5, p7

    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .restart local v21    # "$dirty1":I
    .restart local v22    # "$dirty":I
    :cond_13
    const/high16 v23, 0x80000

    :goto_c
    or-int v22, v22, v23

    goto :goto_d

    .end local v21    # "$dirty1":I
    .end local v22    # "$dirty":I
    .restart local v5    # "$dirty":I
    .restart local v6    # "$dirty1":I
    :cond_14
    move/from16 v22, v5

    move/from16 v21, v6

    move-wide/from16 v5, p7

    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .restart local v21    # "$dirty1":I
    .restart local v22    # "$dirty":I
    :goto_d
    and-int/lit16 v15, v2, 0x80

    const/high16 v24, 0xc00000

    if-eqz v15, :cond_15

    or-int v22, v22, v24

    move/from16 v3, p9

    goto :goto_f

    :cond_15
    and-int v24, v0, v24

    if-nez v24, :cond_17

    move/from16 v3, p9

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v25

    if-eqz v25, :cond_16

    const/high16 v25, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v25, 0x400000

    :goto_e
    or-int v22, v22, v25

    goto :goto_f

    :cond_17
    move/from16 v3, p9

    :goto_f
    const/high16 v25, 0x6000000

    and-int v25, v0, v25

    if-nez v25, :cond_1a

    and-int/lit16 v0, v2, 0x100

    if-nez v0, :cond_18

    move-wide/from16 v5, p10

    invoke-interface {v4, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v0

    if-eqz v0, :cond_19

    const/high16 v0, 0x4000000

    goto :goto_10

    :cond_18
    move-wide/from16 v5, p10

    :cond_19
    const/high16 v0, 0x2000000

    :goto_10
    or-int v22, v22, v0

    goto :goto_11

    :cond_1a
    move-wide/from16 v5, p10

    :goto_11
    and-int/lit16 v0, v2, 0x200

    const/high16 v25, 0x30000000

    if-eqz v0, :cond_1b

    or-int v22, v22, v25

    move/from16 v25, v0

    goto :goto_13

    :cond_1b
    and-int v25, p17, v25

    if-nez v25, :cond_1d

    move/from16 v25, v0

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1c

    const/high16 v26, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v26, 0x10000000

    :goto_12
    or-int v22, v22, v26

    goto :goto_13

    :cond_1d
    move/from16 v25, v0

    move-object/from16 v0, p12

    :goto_13
    move/from16 v0, v22

    .end local v22    # "$dirty":I
    .local v0, "$dirty":I
    and-int/lit8 v22, v1, 0x6

    if-nez v22, :cond_20

    and-int/lit16 v3, v2, 0x400

    if-nez v3, :cond_1e

    move-object/from16 v3, p13

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1f

    const/16 v18, 0x4

    goto :goto_14

    :cond_1e
    move-object/from16 v3, p13

    :cond_1f
    const/16 v18, 0x2

    :goto_14
    or-int v18, v21, v18

    .end local v21    # "$dirty1":I
    .local v18, "$dirty1":I
    goto :goto_15

    .end local v18    # "$dirty1":I
    .restart local v21    # "$dirty1":I
    :cond_20
    move-object/from16 v3, p13

    move/from16 v18, v21

    .end local v21    # "$dirty1":I
    .restart local v18    # "$dirty1":I
    :goto_15
    and-int/lit16 v3, v2, 0x800

    if-eqz v3, :cond_21

    or-int/lit8 v18, v18, 0x30

    move/from16 v21, v3

    goto :goto_17

    :cond_21
    and-int/lit8 v21, v1, 0x30

    if-nez v21, :cond_23

    move/from16 v21, v3

    move-object/from16 v3, p14

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_22

    const/16 v19, 0x20

    goto :goto_16

    :cond_22
    const/16 v19, 0x10

    :goto_16
    or-int v18, v18, v19

    goto :goto_17

    :cond_23
    move/from16 v21, v3

    move-object/from16 v3, p14

    :goto_17
    move/from16 v3, v18

    .end local v18    # "$dirty1":I
    .local v3, "$dirty1":I
    and-int/lit16 v5, v2, 0x1000

    if-eqz v5, :cond_24

    or-int/lit16 v3, v3, 0x180

    move-object/from16 v5, p15

    goto :goto_19

    :cond_24
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_26

    move-object/from16 v5, p15

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_25

    goto :goto_18

    :cond_25
    const/16 v16, 0x80

    :goto_18
    or-int v3, v3, v16

    goto :goto_19

    :cond_26
    move-object/from16 v5, p15

    :goto_19
    const v6, 0x12492493

    and-int/2addr v6, v0

    const v1, 0x12492492

    if-ne v6, v1, :cond_28

    and-int/lit16 v1, v3, 0x93

    const/16 v6, 0x92

    if-ne v1, v6, :cond_28

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_27

    goto :goto_1a

    .line 262
    :cond_27
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v10, p9

    move-object/from16 v15, p14

    move/from16 v21, v0

    move/from16 v22, v3

    move-object/from16 v20, v4

    move v4, v8

    move-object v5, v9

    move-wide v6, v11

    move-object v2, v13

    move-object v3, v14

    move-wide/from16 v8, p7

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    goto/16 :goto_27

    .line 248
    :cond_28
    :goto_1a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, p17, 0x1

    const v6, -0x380001

    const v16, -0x70001

    const v18, -0xe001

    if-eqz v1, :cond_30

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_29

    goto/16 :goto_1b

    .line 245
    :cond_29
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v2, 0x4

    if-eqz v1, :cond_2a

    and-int/lit16 v0, v0, -0x381

    :cond_2a
    and-int/lit8 v1, v2, 0x10

    if-eqz v1, :cond_2b

    and-int v0, v0, v18

    :cond_2b
    and-int/lit8 v1, v2, 0x20

    if-eqz v1, :cond_2c

    and-int v0, v0, v16

    :cond_2c
    and-int/lit8 v1, v2, 0x40

    if-eqz v1, :cond_2d

    and-int/2addr v0, v6

    :cond_2d
    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_2e

    const v1, -0xe000001

    and-int/2addr v0, v1

    :cond_2e
    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2f

    and-int/lit8 v1, v3, -0xf

    move/from16 p1, p9

    move-object/from16 v16, p12

    move-object/from16 v18, p14

    move v3, v0

    move v0, v1

    move v7, v8

    move-object v8, v9

    move-wide v9, v11

    move-object v6, v14

    move-wide/from16 v11, p7

    move-wide/from16 v14, p10

    move-object/from16 v1, p13

    .end local v3    # "$dirty1":I
    .local v1, "$dirty1":I
    goto/16 :goto_25

    .end local v1    # "$dirty1":I
    .restart local v3    # "$dirty1":I
    :cond_2f
    move/from16 p1, v3

    move v3, v0

    move/from16 v0, p1

    move/from16 p1, p9

    move-object/from16 v16, p12

    move-object/from16 v1, p13

    move-object/from16 v18, p14

    move v7, v8

    move-object v8, v9

    move-wide v9, v11

    move-object v6, v14

    move-wide/from16 v11, p7

    move-wide/from16 v14, p10

    goto/16 :goto_25

    .line 248
    :cond_30
    :goto_1b
    if-eqz v10, :cond_31

    .line 235
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object v13, v1

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    :cond_31
    and-int/lit8 v1, v2, 0x4

    if-eqz v1, :cond_32

    .line 236
    const/4 v1, 0x0

    const/4 v10, 0x3

    move/from16 p16, v6

    const/4 v6, 0x0

    invoke-static {v6, v1, v4, v6, v10}, Landroidx/compose/material3/ModalBottomSheetKt;->rememberModalBottomSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object v1

    .end local p2    # "sheetState":Landroidx/compose/material3/SheetState;
    .local v1, "sheetState":Landroidx/compose/material3/SheetState;
    and-int/lit16 v0, v0, -0x381

    move-object v14, v1

    goto :goto_1c

    .line 235
    .end local v1    # "sheetState":Landroidx/compose/material3/SheetState;
    .restart local p2    # "sheetState":Landroidx/compose/material3/SheetState;
    :cond_32
    move/from16 p16, v6

    .line 236
    .end local p2    # "sheetState":Landroidx/compose/material3/SheetState;
    .local v14, "sheetState":Landroidx/compose/material3/SheetState;
    :goto_1c
    if-eqz v17, :cond_33

    .line 237
    sget-object v1, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v1}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetMaxWidth-D9Ej5fM()F

    move-result v1

    .end local p3    # "sheetMaxWidth":F
    .local v1, "sheetMaxWidth":F
    goto :goto_1d

    .line 236
    .end local v1    # "sheetMaxWidth":F
    .restart local p3    # "sheetMaxWidth":F
    :cond_33
    move v1, v8

    .line 237
    .end local p3    # "sheetMaxWidth":F
    .restart local v1    # "sheetMaxWidth":F
    :goto_1d
    and-int/lit8 v6, v2, 0x10

    const/4 v8, 0x6

    if-eqz v6, :cond_34

    .line 238
    sget-object v6, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v6, v4, v8}, Landroidx/compose/material3/BottomSheetDefaults;->getExpandedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v6

    .end local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v6, "shape":Landroidx/compose/ui/graphics/Shape;
    and-int v0, v0, v18

    goto :goto_1e

    .line 237
    .end local v6    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_34
    move-object v6, v9

    .line 238
    .end local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local v6    # "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_1e
    and-int/lit8 v9, v2, 0x20

    if-eqz v9, :cond_35

    .line 239
    sget-object v9, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v9, v4, v8}, Landroidx/compose/material3/BottomSheetDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    .end local p5    # "containerColor":J
    .local v9, "containerColor":J
    and-int v0, v0, v16

    goto :goto_1f

    .line 238
    .end local v9    # "containerColor":J
    .restart local p5    # "containerColor":J
    :cond_35
    move-wide v9, v11

    .line 239
    .end local p5    # "containerColor":J
    .restart local v9    # "containerColor":J
    :goto_1f
    and-int/lit8 v11, v2, 0x40

    if-eqz v11, :cond_36

    .line 240
    shr-int/lit8 v11, v0, 0xf

    and-int/lit8 v11, v11, 0xe

    invoke-static {v9, v10, v4, v11}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    .end local p7    # "contentColor":J
    .local v11, "contentColor":J
    and-int v0, v0, p16

    goto :goto_20

    .line 239
    .end local v11    # "contentColor":J
    .restart local p7    # "contentColor":J
    :cond_36
    move-wide/from16 v11, p7

    .line 240
    .end local p7    # "contentColor":J
    .restart local v11    # "contentColor":J
    :goto_20
    if-eqz v15, :cond_37

    .line 241
    const/4 v15, 0x0

    .local v15, "$this$dp$iv":I
    const/16 v16, 0x0

    .line 641
    .local v16, "$i$f$getDp":I
    int-to-float v8, v15

    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .end local v15    # "$this$dp$iv":I
    .end local v16    # "$i$f$getDp":I
    .end local p9    # "tonalElevation":F
    .local v8, "tonalElevation":F
    goto :goto_21

    .line 240
    .end local v8    # "tonalElevation":F
    .restart local p9    # "tonalElevation":F
    :cond_37
    move/from16 v8, p9

    .line 641
    .end local p9    # "tonalElevation":F
    .restart local v8    # "tonalElevation":F
    :goto_21
    and-int/lit16 v15, v2, 0x100

    if-eqz v15, :cond_38

    .line 242
    sget-object v15, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    move/from16 p2, v0

    const/4 v0, 0x6

    .end local v0    # "$dirty":I
    .local p2, "$dirty":I
    invoke-virtual {v15, v4, v0}, Landroidx/compose/material3/BottomSheetDefaults;->getScrimColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v15

    .end local p10    # "scrimColor":J
    .local v15, "scrimColor":J
    const v0, -0xe000001

    and-int v0, p2, v0

    .end local p2    # "$dirty":I
    .restart local v0    # "$dirty":I
    goto :goto_22

    .line 641
    .end local v15    # "scrimColor":J
    .restart local p10    # "scrimColor":J
    :cond_38
    move/from16 p2, v0

    .end local v0    # "$dirty":I
    .restart local p2    # "$dirty":I
    move-wide/from16 v15, p10

    .line 242
    .end local p2    # "$dirty":I
    .end local p10    # "scrimColor":J
    .restart local v0    # "$dirty":I
    .restart local v15    # "scrimColor":J
    :goto_22
    if-eqz v25, :cond_39

    sget-object v17, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheet_androidKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$ModalBottomSheet_androidKt;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheet_androidKt;->getLambda-1$material3_release()Lkotlin/jvm/functions/Function2;

    move-result-object v17

    .end local p12    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v17, "dragHandle":Lkotlin/jvm/functions/Function2;
    goto :goto_23

    .end local v17    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .restart local p12    # "dragHandle":Lkotlin/jvm/functions/Function2;
    :cond_39
    move-object/from16 v17, p12

    .end local p12    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .restart local v17    # "dragHandle":Lkotlin/jvm/functions/Function2;
    :goto_23
    move/from16 p2, v0

    .end local v0    # "$dirty":I
    .restart local p2    # "$dirty":I
    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_3a

    .line 244
    sget-object v0, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    move/from16 p3, v1

    const/4 v1, 0x6

    .end local v1    # "sheetMaxWidth":F
    .restart local p3    # "sheetMaxWidth":F
    invoke-virtual {v0, v4, v1}, Landroidx/compose/material3/BottomSheetDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    move-result-object v0

    .end local p13    # "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    .local v0, "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    and-int/lit8 v3, v3, -0xf

    goto :goto_24

    .line 242
    .end local v0    # "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    .end local p3    # "sheetMaxWidth":F
    .restart local v1    # "sheetMaxWidth":F
    .restart local p13    # "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    :cond_3a
    move/from16 p3, v1

    .end local v1    # "sheetMaxWidth":F
    .restart local p3    # "sheetMaxWidth":F
    move-object/from16 v0, p13

    .line 244
    .end local p13    # "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    .restart local v0    # "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    :goto_24
    if-eqz v21, :cond_3b

    .line 245
    sget-object v1, Landroidx/compose/material3/ModalBottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetDefaults;

    invoke-virtual {v1}, Landroidx/compose/material3/ModalBottomSheetDefaults;->getProperties()Landroidx/compose/material3/ModalBottomSheetProperties;

    move-result-object v1

    move/from16 v7, p3

    move-object/from16 v18, v1

    move/from16 p1, v8

    move-object v1, v0

    move v0, v3

    move-object v8, v6

    move-object v6, v14

    move-wide v14, v15

    move-object/from16 v16, v17

    move/from16 v3, p2

    .end local p14    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local v1, "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    goto :goto_25

    .line 244
    .end local v1    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .restart local p14    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    :cond_3b
    move/from16 v7, p3

    move-object/from16 v18, p14

    move-object v1, v0

    move v0, v3

    move/from16 p1, v8

    move/from16 v3, p2

    move-object v8, v6

    move-object v6, v14

    move-wide v14, v15

    move-object/from16 v16, v17

    .line 245
    .end local v15    # "scrimColor":J
    .end local v17    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .end local p2    # "$dirty":I
    .end local p3    # "sheetMaxWidth":F
    .end local p14    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local v0, "$dirty1":I
    .local v1, "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    .local v3, "$dirty":I
    .local v6, "sheetState":Landroidx/compose/material3/SheetState;
    .local v7, "sheetMaxWidth":F
    .local v8, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v14, "scrimColor":J
    .local v16, "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v18, "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local p1, "tonalElevation":F
    :goto_25
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v17

    if-eqz v17, :cond_3c

    .line 248
    const-string v2, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:247)"

    move-object/from16 v20, v4

    const v4, 0x385187de

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v20, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v4, v3, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_26

    .line 245
    .end local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v4    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_3c
    move-object/from16 v20, v4

    .line 249
    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v20    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_26
    nop

    .line 250
    nop

    .line 251
    nop

    .line 252
    nop

    .line 253
    nop

    .line 254
    nop

    .line 255
    nop

    .line 256
    nop

    .line 257
    nop

    .line 258
    nop

    .line 248
    new-instance v2, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$1;

    invoke-direct {v2, v1}, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$1;-><init>(Landroidx/compose/foundation/layout/WindowInsets;)V

    move-object/from16 v17, v2

    check-cast v17, Lkotlin/jvm/functions/Function2;

    .line 260
    nop

    .line 261
    and-int/lit8 v2, v3, 0xe

    and-int/lit8 v4, v3, 0x70

    or-int/2addr v2, v4

    and-int/lit16 v4, v3, 0x380

    or-int/2addr v2, v4

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v2, v4

    const v4, 0xe000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x70000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x1c00000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0xe000000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x70000000

    and-int/2addr v4, v3

    or-int v21, v2, v4

    and-int/lit8 v2, v0, 0x70

    and-int/lit16 v4, v0, 0x380

    or-int v22, v2, v4

    .line 248
    const/16 v23, 0x0

    move-object/from16 v4, p0

    move-object/from16 v19, v5

    move-object v5, v13

    move/from16 v13, p1

    .end local p1    # "tonalElevation":F
    .local v5, "modifier":Landroidx/compose/ui/Modifier;
    .local v13, "tonalElevation":F
    invoke-static/range {v4 .. v23}, Landroidx/compose/material3/ModalBottomSheetKt;->ModalBottomSheet-dYc4hso(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_3d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 262
    :cond_3d
    move/from16 v22, v0

    move/from16 v21, v3

    move-object v2, v5

    move-object v3, v6

    move v4, v7

    move-object v5, v8

    move-wide v6, v9

    move-wide v8, v11

    move v10, v13

    move-wide v11, v14

    move-object/from16 v13, v16

    move-object/from16 v15, v18

    move-object v14, v1

    .end local v0    # "$dirty1":I
    .end local v1    # "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    .end local v7    # "sheetMaxWidth":F
    .end local v9    # "containerColor":J
    .end local v16    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .end local v18    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "sheetState":Landroidx/compose/material3/SheetState;
    .local v4, "sheetMaxWidth":F
    .local v5, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v6, "containerColor":J
    .local v8, "contentColor":J
    .local v10, "tonalElevation":F
    .local v11, "scrimColor":J
    .local v13, "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v14, "windowInsets":Landroidx/compose/foundation/layout/WindowInsets;
    .local v15, "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local v21, "$dirty":I
    .local v22, "$dirty1":I
    :goto_27
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_3e

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2;

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v27, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v19}, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v27

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_3e
    return-void
.end method

.method public static final ModalBottomSheetDialog(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .param p0, "onDismissRequest"    # Lkotlin/jvm/functions/Function0;
    .param p1, "properties"    # Landroidx/compose/material3/ModalBottomSheetProperties;
    .param p2, "predictiveBackProgress"    # Landroidx/compose/animation/core/Animatable;
    .param p3, "content"    # Lkotlin/jvm/functions/Function2;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/material3/ModalBottomSheetProperties;",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 273
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v10, p3

    move/from16 v11, p5

    const v0, 0x4acd0b82    # 6718913.0f

    move-object/from16 v4, p4

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(ModalBottomSheetDialog)P(1,3,2)273@11822L7,274@11861L7,275@11916L7,276@11946L28,277@12001L29,278@12050L38,279@12105L24,280@12157L21,282@12204L697,305@12932L129,305@12907L154,314@13078L182,314@13067L193:ModalBottomSheet.android.kt#uh7d8r"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p5

    .local v5, "$dirty":I
    and-int/lit8 v6, v11, 0x6

    if-nez v6, :cond_1

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v5, v6

    :cond_1
    and-int/lit8 v6, v11, 0x30

    if-nez v6, :cond_3

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_1

    :cond_2
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_6

    and-int/lit16 v6, v11, 0x200

    if-nez v6, :cond_4

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_4
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v11, 0xc00

    if-nez v6, :cond_8

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_4

    :cond_7
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v5, v6

    :cond_8
    and-int/lit16 v6, v5, 0x493

    const/16 v9, 0x492

    if-ne v6, v9, :cond_a

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_5

    .line 322
    :cond_9
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v13, v4

    move v12, v5

    goto/16 :goto_f

    .line 273
    :cond_a
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_b

    const/4 v6, -0x1

    const-string v9, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:272)"

    invoke-static {v0, v5, v6, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 274
    :cond_b
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalView()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    .local v0, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v6, 0x0

    .local v6, "$changed$iv":I
    const/4 v9, 0x0

    .line 642
    .local v9, "$i$f$getCurrent":I
    const v12, 0x789c5f52

    const-string v13, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v4, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 274
    .end local v0    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v6    # "$changed$iv":I
    .end local v9    # "$i$f$getCurrent":I
    move-object v0, v14

    check-cast v0, Landroid/view/View;

    .line 275
    .local v0, "view":Landroid/view/View;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    check-cast v6, Landroidx/compose/runtime/CompositionLocal;

    .local v6, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v9, 0x0

    .local v9, "$changed$iv":I
    const/4 v14, 0x0

    .line 643
    .local v14, "$i$f$getCurrent":I
    invoke-static {v4, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 275
    .end local v6    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v9    # "$changed$iv":I
    .end local v14    # "$i$f$getCurrent":I
    move-object v6, v15

    check-cast v6, Landroidx/compose/ui/unit/Density;

    .line 276
    .local v6, "density":Landroidx/compose/ui/unit/Density;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v9

    check-cast v9, Landroidx/compose/runtime/CompositionLocal;

    .local v9, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v14, 0x0

    .local v14, "$changed$iv":I
    const/4 v15, 0x0

    .line 644
    .local v15, "$i$f$getCurrent":I
    invoke-static {v4, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 276
    .end local v9    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v14    # "$changed$iv":I
    .end local v15    # "$i$f$getCurrent":I
    move-object v9, v12

    check-cast v9, Landroidx/compose/ui/unit/LayoutDirection;

    .line 277
    .local v9, "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    const/4 v12, 0x0

    invoke-static {v4, v12}, Landroidx/compose/runtime/ComposablesKt;->rememberCompositionContext(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;

    move-result-object v13

    .line 278
    .local v13, "composition":Landroidx/compose/runtime/CompositionContext;
    shr-int/lit8 v14, v5, 0x9

    and-int/lit8 v14, v14, 0xe

    invoke-static {v10, v4, v14}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v14

    move v15, v12

    .local v14, "currentContent$delegate":Landroidx/compose/runtime/State;
    new-array v12, v15, [Ljava/lang/Object;

    .line 279
    sget-object v16, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialogId$1;->INSTANCE:Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialogId$1;

    check-cast v16, Lkotlin/jvm/functions/Function0;

    const/16 v17, 0xc00

    const/16 v18, 0x6

    move-object/from16 v19, v13

    .end local v13    # "composition":Landroidx/compose/runtime/CompositionContext;
    .local v19, "composition":Landroidx/compose/runtime/CompositionContext;
    const/4 v13, 0x0

    move-object/from16 v20, v14

    .end local v14    # "currentContent$delegate":Landroidx/compose/runtime/State;
    .local v20, "currentContent$delegate":Landroidx/compose/runtime/State;
    const/4 v14, 0x0

    move-object/from16 v21, v16

    move-object/from16 v16, v4

    move v4, v15

    move-object/from16 v15, v21

    move-object/from16 v21, v19

    move-object/from16 v22, v20

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v19    # "composition":Landroidx/compose/runtime/CompositionContext;
    .end local v20    # "currentContent$delegate":Landroidx/compose/runtime/State;
    .local v16, "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "composition":Landroidx/compose/runtime/CompositionContext;
    .local v22, "currentContent$delegate":Landroidx/compose/runtime/State;
    invoke-static/range {v12 .. v18}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v13, v16

    .end local v16    # "$composer":Landroidx/compose/runtime/Composer;
    .local v13, "$composer":Landroidx/compose/runtime/Composer;
    check-cast v12, Ljava/util/UUID;

    .line 280
    .local v12, "dialogId":Ljava/util/UUID;
    move v14, v4

    .local v14, "$changed$iv":I
    const/4 v15, 0x0

    .line 645
    .local v15, "$i$f$rememberCoroutineScope":I
    const v7, 0x2e20b340

    const-string v8, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp"

    invoke-static {v13, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 646
    nop

    .line 648
    move-object v7, v13

    .line 649
    .local v7, "composer$iv":Landroidx/compose/runtime/Composer;
    const v8, -0x38e26dd0

    const-string v4, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v13, v8, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v4, 0x0

    .local v4, "invalid$iv$iv":Z
    move-object v8, v13

    .local v8, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 650
    .local v18, "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 651
    .local v19, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_c

    .line 652
    const/4 v2, 0x0

    .line 653
    .local v2, "$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    nop

    .line 654
    const/16 v20, 0x0

    .line 655
    .local v20, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v20, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 654
    .end local v20    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move-object/from16 v23, v1

    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .local v23, "it$iv$iv":Ljava/lang/Object;
    move-object/from16 v1, v20

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v7}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    .line 653
    move/from16 v20, v2

    .end local v2    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    .local v20, "$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    new-instance v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v2, v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 652
    .end local v20    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    nop

    .line 656
    .local v2, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 657
    nop

    .end local v2    # "value$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 658
    .end local v23    # "it$iv$iv":Ljava/lang/Object;
    .restart local v1    # "it$iv$iv":Ljava/lang/Object;
    :cond_c
    move-object/from16 v23, v1

    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .restart local v23    # "it$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v23

    .line 651
    :goto_6
    nop

    .line 650
    .end local v19    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    .end local v23    # "it$iv$iv":Ljava/lang/Object;
    nop

    .line 649
    .end local v4    # "invalid$iv$iv":Z
    .end local v8    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$f$cache":I
    move-object v1, v2

    check-cast v1, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .local v1, "wrapper$iv":Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 659
    invoke-virtual {v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v8

    .line 645
    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 659
    nop

    .line 280
    .end local v1    # "wrapper$iv":Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
    .end local v7    # "composer$iv":Landroidx/compose/runtime/Composer;
    .end local v14    # "$changed$iv":I
    .end local v15    # "$i$f$rememberCoroutineScope":I
    nop

    .line 281
    .local v8, "scope":Lkotlinx/coroutines/CoroutineScope;
    move-object v4, v9

    const/4 v15, 0x0

    .end local v9    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .local v4, "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    invoke-static {v13, v15}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result v9

    .line 283
    .local v9, "darkThemeEnabled":Z
    const v1, -0x761b8d75

    const-string v14, "CC(remember):ModalBottomSheet.android.kt#9igjgp"

    invoke-static {v13, v1, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid$iv":Z
    move-object v2, v13

    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    move/from16 v17, v1

    .end local v1    # "invalid$iv":Z
    .local v17, "invalid$iv":Z
    const/16 v18, 0x0

    .line 660
    .restart local v18    # "$i$f$cache":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 661
    .local v19, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v17, :cond_e

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v1, v7, :cond_d

    goto :goto_7

    .line 665
    :cond_d
    move-object v3, v12

    move v12, v5

    move-object v5, v6

    move-object v6, v3

    move-object/from16 v27, v0

    move-object v0, v1

    move-object/from16 v16, v0

    move-object v15, v2

    move-object/from16 v10, v21

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    goto :goto_8

    .line 662
    :cond_e
    :goto_7
    const/16 v20, 0x0

    .line 284
    .local v20, "$i$a$-cache-ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1":I
    move-object v3, v0

    .end local v0    # "view":Landroid/view/View;
    .local v3, "view":Landroid/view/View;
    new-instance v0, Landroidx/compose/material3/ModalBottomSheetDialogWrapper;

    .line 285
    nop

    .line 286
    nop

    .line 287
    nop

    .line 288
    nop

    .line 289
    nop

    .line 290
    nop

    .line 291
    nop

    .line 292
    nop

    .line 293
    nop

    .line 284
    move-object v7, v12

    move v12, v5

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v7, p2

    move-object/from16 v16, v1

    move-object v15, v2

    const/4 v10, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v5, "density":Landroidx/compose/ui/unit/Density;
    .local v6, "dialogId":Ljava/util/UUID;
    .local v12, "$dirty":I
    .local v15, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .local v16, "it$iv":Ljava/lang/Object;
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/ModalBottomSheetDialogWrapper;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Ljava/util/UUID;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Z)V

    .line 295
    move-object v7, v0

    .local v7, "$this$ModalBottomSheetDialog_u24lambda_u242_u24lambda_u241":Landroidx/compose/material3/ModalBottomSheetDialogWrapper;
    const/16 v24, 0x0

    .line 296
    .local v24, "$i$a$-apply-ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1":I
    new-instance v10, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1;

    move-object/from16 v26, v0

    move-object/from16 v0, v22

    .end local v22    # "currentContent$delegate":Landroidx/compose/runtime/State;
    .local v0, "currentContent$delegate":Landroidx/compose/runtime/State;
    invoke-direct {v10, v0}, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1;-><init>(Landroidx/compose/runtime/State;)V

    .end local v0    # "currentContent$delegate":Landroidx/compose/runtime/State;
    .restart local v22    # "currentContent$delegate":Landroidx/compose/runtime/State;
    const v0, -0x5d0a5e91

    move-object/from16 v27, v3

    const/4 v3, 0x1

    .end local v3    # "view":Landroid/view/View;
    .local v27, "view":Landroid/view/View;
    invoke-static {v0, v3, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v10, v21

    .end local v21    # "composition":Landroidx/compose/runtime/CompositionContext;
    .local v10, "composition":Landroidx/compose/runtime/CompositionContext;
    invoke-virtual {v7, v10, v0}, Landroidx/compose/material3/ModalBottomSheetDialogWrapper;->setContent(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V

    .line 303
    nop

    .line 295
    .end local v7    # "$this$ModalBottomSheetDialog_u24lambda_u242_u24lambda_u241":Landroidx/compose/material3/ModalBottomSheetDialogWrapper;
    .end local v24    # "$i$a$-apply-ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1":I
    nop

    .line 662
    .end local v20    # "$i$a$-cache-ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1":I
    move-object/from16 v0, v26

    .line 663
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 664
    nop

    .line 661
    .end local v0    # "value$iv":Ljava/lang/Object;
    :goto_8
    nop

    .line 660
    .end local v16    # "it$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 283
    .end local v15    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v17    # "invalid$iv":Z
    .end local v18    # "$i$f$cache":I
    check-cast v0, Landroidx/compose/material3/ModalBottomSheetDialogWrapper;

    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 282
    nop

    .line 306
    .local v0, "dialog":Landroidx/compose/material3/ModalBottomSheetDialogWrapper;
    const v7, -0x761b34ad

    invoke-static {v13, v7, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    .local v7, "invalid$iv":Z
    move-object v15, v13

    .restart local v15    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 666
    .local v16, "$i$f$cache":I
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 667
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v7, :cond_10

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v19, v5

    .end local v5    # "density":Landroidx/compose/ui/unit/Density;
    .local v19, "density":Landroidx/compose/ui/unit/Density;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_f

    goto :goto_9

    .line 671
    :cond_f
    move-object/from16 v18, v3

    goto :goto_a

    .line 667
    .end local v19    # "density":Landroidx/compose/ui/unit/Density;
    .restart local v5    # "density":Landroidx/compose/ui/unit/Density;
    :cond_10
    move-object/from16 v19, v5

    .line 668
    .end local v5    # "density":Landroidx/compose/ui/unit/Density;
    .restart local v19    # "density":Landroidx/compose/ui/unit/Density;
    :goto_9
    const/4 v5, 0x0

    .line 306
    .local v5, "$i$a$-cache-ModalBottomSheet_androidKt$ModalBottomSheetDialog$1":I
    move-object/from16 v18, v3

    .end local v3    # "it$iv":Ljava/lang/Object;
    .local v18, "it$iv":Ljava/lang/Object;
    new-instance v3, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1;

    invoke-direct {v3, v0}, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1;-><init>(Landroidx/compose/material3/ModalBottomSheetDialogWrapper;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 668
    .end local v5    # "$i$a$-cache-ModalBottomSheet_androidKt$ModalBottomSheetDialog$1":I
    nop

    .line 669
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 670
    nop

    .line 667
    .end local v3    # "value$iv":Ljava/lang/Object;
    :goto_a
    nop

    .line 666
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v18    # "it$iv":Ljava/lang/Object;
    nop

    .line 306
    .end local v7    # "invalid$iv":Z
    .end local v15    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v15, 0x0

    invoke-static {v0, v3, v13, v15}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 315
    const v3, -0x761b2238

    invoke-static {v13, v3, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v5, v12, 0xe

    const/4 v7, 0x4

    if-ne v5, v7, :cond_11

    const/4 v5, 0x1

    goto :goto_b

    :cond_11
    move v5, v15

    :goto_b
    or-int/2addr v3, v5

    and-int/lit8 v5, v12, 0x70

    const/16 v7, 0x20

    if-ne v5, v7, :cond_12

    const/16 v25, 0x1

    goto :goto_c

    :cond_12
    move/from16 v25, v15

    :goto_c
    or-int v3, v3, v25

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .local v3, "invalid$iv":Z
    move-object v5, v13

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 672
    .local v7, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 673
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_14

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v14, v15, :cond_13

    goto :goto_d

    .line 677
    :cond_13
    move/from16 p4, v3

    move-object v3, v14

    goto :goto_e

    .line 674
    :cond_14
    :goto_d
    const/4 v15, 0x0

    .line 315
    .local v15, "$i$a$-cache-ModalBottomSheet_androidKt$ModalBottomSheetDialog$2":I
    move/from16 p4, v3

    .end local v3    # "invalid$iv":Z
    .local p4, "invalid$iv":Z
    new-instance v3, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$2$1;

    invoke-direct {v3, v0, v1, v2, v4}, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$2$1;-><init>(Landroidx/compose/material3/ModalBottomSheetDialogWrapper;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/ui/unit/LayoutDirection;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 674
    .end local v15    # "$i$a$-cache-ModalBottomSheet_androidKt$ModalBottomSheetDialog$2":I
    nop

    .line 675
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 676
    nop

    .line 673
    .end local v3    # "value$iv":Ljava/lang/Object;
    :goto_e
    nop

    .line 672
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 315
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    .end local p4    # "invalid$iv":Z
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v15, 0x0

    invoke-static {v3, v13, v15}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 322
    .end local v0    # "dialog":Landroidx/compose/material3/ModalBottomSheetDialogWrapper;
    .end local v4    # "layoutDirection":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v6    # "dialogId":Ljava/util/UUID;
    .end local v8    # "scope":Lkotlinx/coroutines/CoroutineScope;
    .end local v9    # "darkThemeEnabled":Z
    .end local v10    # "composition":Landroidx/compose/runtime/CompositionContext;
    .end local v19    # "density":Landroidx/compose/ui/unit/Density;
    .end local v22    # "currentContent$delegate":Landroidx/compose/runtime/State;
    .end local v27    # "view":Landroid/view/View;
    :cond_15
    :goto_f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$3;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v5, v11

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetDialog$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;I)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_16
    return-void
.end method

.method private static final ModalBottomSheetDialog$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;
    .locals 4
    .param p0, "$currentContent$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;)",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 278
    const/4 v0, 0x0

    .local v0, "thisObj$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 678
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "thisObj$iv":Ljava/lang/Object;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 278
    return-object v0
.end method

.method public static final synthetic access$ModalBottomSheetDialog$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;
    .locals 1
    .param p0, "$currentContent$delegate"    # Landroidx/compose/runtime/State;

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/ModalBottomSheet_androidKt;->ModalBottomSheetDialog$lambda$0(Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$shouldApplySecureFlag(Landroidx/compose/ui/window/SecureFlagPolicy;Z)Z
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/ui/window/SecureFlagPolicy;
    .param p1, "isSecureFlagSetOnParent"    # Z

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/ModalBottomSheet_androidKt;->shouldApplySecureFlag(Landroidx/compose/ui/window/SecureFlagPolicy;Z)Z

    move-result v0

    return v0
.end method

.method public static final isFlagSecureEnabled(Landroid/view/View;)Z
    .locals 3
    .param p0, "$this$isFlagSecureEnabled"    # Landroid/view/View;

    .line 625
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/WindowManager$LayoutParams;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 626
    .local v0, "windowParams":Landroid/view/WindowManager$LayoutParams;
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 627
    iget v2, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v2, v2, 0x2000

    if-eqz v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    .line 629
    :cond_2
    return v1
.end method

.method private static final shouldApplySecureFlag(Landroidx/compose/ui/window/SecureFlagPolicy;Z)Z
    .locals 2
    .param p0, "$this$shouldApplySecureFlag"    # Landroidx/compose/ui/window/SecureFlagPolicy;
    .param p1, "isSecureFlagSetOnParent"    # Z

    .line 634
    sget-object v0, Landroidx/compose/material3/ModalBottomSheet_androidKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Landroidx/compose/ui/window/SecureFlagPolicy;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 637
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    move v0, p1

    goto :goto_0

    .line 636
    :pswitch_1
    const/4 v0, 0x1

    goto :goto_0

    .line 635
    :pswitch_2
    const/4 v0, 0x0

    .line 634
    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
