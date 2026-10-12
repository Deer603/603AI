.class public final Landroidx/compose/material3/BottomSheetScaffoldKt;
.super Ljava/lang/Object;
.source "BottomSheetScaffold.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,410:1\n148#2:411\n1223#3,6:412\n1223#3,6:418\n1223#3,6:424\n1223#3,3:435\n1226#3,3:441\n1223#3,6:447\n1223#3,6:453\n1223#3,6:459\n1223#3,6:473\n488#4:430\n487#4,4:431\n491#4,2:438\n495#4:444\n487#5:440\n77#6:445\n1#7:446\n170#8:465\n168#8,7:466\n78#8,6:479\n85#8,4:494\n89#8,2:504\n93#8:509\n176#8:510\n368#9,9:485\n377#9,3:506\n4032#10,6:498\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n119#1:411\n134#1:412,6\n180#1:418,6\n182#1:424,6\n226#1:435,3\n226#1:441,3\n232#1:447,6\n249#1:453,6\n371#1:459,6\n356#1:473,6\n226#1:430\n226#1:431,4\n226#1:438,2\n226#1:444\n226#1:440\n228#1:445\n356#1:465\n356#1:466,7\n356#1:479,6\n356#1:494,4\n356#1:504,2\n356#1:509\n356#1:510\n356#1:485,9\n356#1:506,3\n356#1:498,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u008a\u0002\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u0005\u00a2\u0006\u0002\u0008\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000c2\u0015\u0008\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0015\u0008\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0019\u0008\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u00052\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u0005H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!\u001a\u008e\u0001\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00082\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*\u001a\u008d\u0001\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u000c2\u0006\u00100\u001a\u00020\u000c2\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u0005\u00a2\u0006\u0002\u0008\u0006H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u00082\u00103\u001a!\u00104\u001a\u00020\n2\u0008\u0008\u0002\u00105\u001a\u00020(2\u0008\u0008\u0002\u00106\u001a\u00020\u001bH\u0007\u00a2\u0006\u0002\u00107\u001a7\u00108\u001a\u00020(2\u0008\u0008\u0002\u00109\u001a\u00020:2\u0014\u0008\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00180\u00032\u0008\u0008\u0002\u0010<\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\u0010=\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006>"
    }
    d2 = {
        "BottomSheetScaffold",
        "",
        "sheetContent",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "scaffoldState",
        "Landroidx/compose/material3/BottomSheetScaffoldState;",
        "sheetPeekHeight",
        "Landroidx/compose/ui/unit/Dp;",
        "sheetMaxWidth",
        "sheetShape",
        "Landroidx/compose/ui/graphics/Shape;",
        "sheetContainerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "sheetContentColor",
        "sheetTonalElevation",
        "sheetShadowElevation",
        "sheetDragHandle",
        "Lkotlin/Function0;",
        "sheetSwipeEnabled",
        "",
        "topBar",
        "snackbarHost",
        "Landroidx/compose/material3/SnackbarHostState;",
        "containerColor",
        "contentColor",
        "content",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "BottomSheetScaffold-sdMYb0k",
        "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "BottomSheetScaffoldLayout",
        "body",
        "bottomSheet",
        "sheetOffset",
        "",
        "sheetState",
        "Landroidx/compose/material3/SheetState;",
        "BottomSheetScaffoldLayout-2E65NiM",
        "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V",
        "StandardBottomSheet",
        "state",
        "peekHeight",
        "shape",
        "tonalElevation",
        "shadowElevation",
        "dragHandle",
        "StandardBottomSheet-w7I5h1o",
        "(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "rememberBottomSheetScaffoldState",
        "bottomSheetState",
        "snackbarHostState",
        "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;",
        "rememberStandardBottomSheetState",
        "initialValue",
        "Landroidx/compose/material3/SheetValue;",
        "confirmValueChange",
        "skipHiddenState",
        "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;",
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
.method public static final BottomSheetScaffold-sdMYb0k(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 38
    .param p0, "sheetContent"    # Lkotlin/jvm/functions/Function3;
    .param p1, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p2, "scaffoldState"    # Landroidx/compose/material3/BottomSheetScaffoldState;
    .param p3, "sheetPeekHeight"    # F
    .param p4, "sheetMaxWidth"    # F
    .param p5, "sheetShape"    # Landroidx/compose/ui/graphics/Shape;
    .param p6, "sheetContainerColor"    # J
    .param p8, "sheetContentColor"    # J
    .param p10, "sheetTonalElevation"    # F
    .param p11, "sheetShadowElevation"    # F
    .param p12, "sheetDragHandle"    # Lkotlin/jvm/functions/Function2;
    .param p13, "sheetSwipeEnabled"    # Z
    .param p14, "topBar"    # Lkotlin/jvm/functions/Function2;
    .param p15, "snackbarHost"    # Lkotlin/jvm/functions/Function3;
    .param p16, "containerColor"    # J
    .param p18, "contentColor"    # J
    .param p20, "content"    # Lkotlin/jvm/functions/Function3;
    .param p21, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p22, "$changed"    # I
    .param p23, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/BottomSheetScaffoldState;",
            "FF",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFF",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/SnackbarHostState;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;JJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/PaddingValues;",
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

    .line 128
    move-object/from16 v0, p20

    move/from16 v1, p22

    move/from16 v2, p23

    move/from16 v3, p24

    const v4, -0x5ad53ca7

    move-object/from16 v5, p21

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p21    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(BottomSheetScaffold)P(6,3,4,10:c#ui.unit.Dp,9:c#ui.unit.Dp,12,5:c#ui.graphics.Color,7:c#ui.graphics.Color,14:c#ui.unit.Dp,11:c#ui.unit.Dp,8,13,16,15,0:c#ui.graphics.Color,2:c#ui.graphics.Color)112@5992L34,115@6194L13,116@6262L14,117@6309L36,124@6741L11,125@6788L31,131@6974L52,137@7329L597,132@7051L49,133@7124L50,128@6878L1054:BottomSheetScaffold.kt#uh7d8r"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p22

    .local v5, "$dirty":I
    move/from16 v6, p23

    .local v6, "$dirty1":I
    and-int/lit8 v7, v3, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v5, v5, 0x6

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v1, 0x6

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
    and-int/lit8 v10, v3, 0x2

    if-eqz v10, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v13, v1, 0x30

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
    and-int/lit16 v14, v1, 0x180

    const/16 v16, 0x80

    if-nez v14, :cond_8

    and-int/lit8 v14, v3, 0x4

    if-nez v14, :cond_6

    move-object/from16 v14, p2

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_7

    const/16 v17, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v14, p2

    :cond_7
    move/from16 v17, v16

    :goto_4
    or-int v5, v5, v17

    goto :goto_5

    :cond_8
    move-object/from16 v14, p2

    :goto_5
    and-int/lit8 v17, v3, 0x8

    const/16 v18, 0x800

    const/16 v19, 0x400

    if-eqz v17, :cond_9

    or-int/lit16 v5, v5, 0xc00

    move/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v1, 0xc00

    if-nez v8, :cond_b

    move/from16 v8, p3

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v18

    goto :goto_6

    :cond_a
    move/from16 v20, v19

    :goto_6
    or-int v5, v5, v20

    goto :goto_7

    :cond_b
    move/from16 v8, p3

    :goto_7
    and-int/lit8 v20, v3, 0x10

    const/16 v21, 0x2000

    const/16 v22, 0x4000

    if-eqz v20, :cond_c

    or-int/lit16 v5, v5, 0x6000

    move/from16 v9, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v9, v1, 0x6000

    if-nez v9, :cond_e

    move/from16 v9, p4

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v24

    if-eqz v24, :cond_d

    move/from16 v24, v22

    goto :goto_8

    :cond_d
    move/from16 v24, v21

    :goto_8
    or-int v5, v5, v24

    goto :goto_9

    :cond_e
    move/from16 v9, p4

    :goto_9
    const/high16 v24, 0x30000

    and-int v24, v1, v24

    const/high16 v25, 0x10000

    if-nez v24, :cond_11

    and-int/lit8 v24, v3, 0x20

    if-nez v24, :cond_f

    move-object/from16 v11, p5

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v11, p5

    :cond_10
    move/from16 v26, v25

    :goto_a
    or-int v5, v5, v26

    goto :goto_b

    :cond_11
    move-object/from16 v11, p5

    :goto_b
    const/high16 v26, 0x180000

    and-int v27, v1, v26

    if-nez v27, :cond_14

    and-int/lit8 v27, v3, 0x40

    if-nez v27, :cond_12

    move-wide/from16 v12, p6

    invoke-interface {v4, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v28

    if-eqz v28, :cond_13

    const/high16 v28, 0x100000

    goto :goto_c

    :cond_12
    move-wide/from16 v12, p6

    :cond_13
    const/high16 v28, 0x80000

    :goto_c
    or-int v5, v5, v28

    goto :goto_d

    :cond_14
    move-wide/from16 v12, p6

    :goto_d
    const/high16 v28, 0xc00000

    and-int v28, v1, v28

    if-nez v28, :cond_17

    and-int/lit16 v15, v3, 0x80

    if-nez v15, :cond_15

    move/from16 v29, v5

    move v15, v6

    move-wide/from16 v5, p8

    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .local v15, "$dirty1":I
    .local v29, "$dirty":I
    invoke-interface {v4, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_e

    .end local v15    # "$dirty1":I
    .end local v29    # "$dirty":I
    .restart local v5    # "$dirty":I
    .restart local v6    # "$dirty1":I
    :cond_15
    move/from16 v29, v5

    move v15, v6

    move-wide/from16 v5, p8

    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .restart local v15    # "$dirty1":I
    .restart local v29    # "$dirty":I
    :cond_16
    const/high16 v30, 0x400000

    :goto_e
    or-int v29, v29, v30

    goto :goto_f

    .end local v15    # "$dirty1":I
    .end local v29    # "$dirty":I
    .restart local v5    # "$dirty":I
    .restart local v6    # "$dirty1":I
    :cond_17
    move/from16 v29, v5

    move v15, v6

    move-wide/from16 v5, p8

    .end local v5    # "$dirty":I
    .end local v6    # "$dirty1":I
    .restart local v15    # "$dirty1":I
    .restart local v29    # "$dirty":I
    :goto_f
    and-int/lit16 v1, v3, 0x100

    const/high16 v30, 0x6000000

    if-eqz v1, :cond_18

    or-int v29, v29, v30

    move/from16 v30, v1

    move/from16 v1, p10

    goto :goto_11

    :cond_18
    and-int v30, p22, v30

    if-nez v30, :cond_1a

    move/from16 v30, v1

    move/from16 v1, p10

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v31

    if-eqz v31, :cond_19

    const/high16 v31, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v31, 0x2000000

    :goto_10
    or-int v29, v29, v31

    goto :goto_11

    :cond_1a
    move/from16 v30, v1

    move/from16 v1, p10

    :goto_11
    and-int/lit16 v1, v3, 0x200

    const/high16 v31, 0x30000000

    if-eqz v1, :cond_1b

    or-int v29, v29, v31

    move/from16 v31, v1

    goto :goto_13

    :cond_1b
    and-int v31, p22, v31

    if-nez v31, :cond_1d

    move/from16 v31, v1

    move/from16 v1, p11

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v32

    if-eqz v32, :cond_1c

    const/high16 v32, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v32, 0x10000000

    :goto_12
    or-int v29, v29, v32

    goto :goto_13

    :cond_1d
    move/from16 v31, v1

    move/from16 v1, p11

    :goto_13
    move/from16 v1, v29

    .end local v29    # "$dirty":I
    .local v1, "$dirty":I
    and-int/lit16 v5, v3, 0x400

    if-eqz v5, :cond_1e

    or-int/lit8 v6, v15, 0x6

    move v15, v6

    move-object/from16 v6, p12

    .end local v15    # "$dirty1":I
    .restart local v6    # "$dirty1":I
    goto :goto_15

    .end local v6    # "$dirty1":I
    .restart local v15    # "$dirty1":I
    :cond_1e
    and-int/lit8 v6, v2, 0x6

    if-nez v6, :cond_20

    move-object/from16 v6, p12

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_1f

    const/16 v23, 0x4

    goto :goto_14

    :cond_1f
    const/16 v23, 0x2

    :goto_14
    or-int v15, v15, v23

    goto :goto_15

    :cond_20
    move-object/from16 v6, p12

    :goto_15
    move/from16 v23, v5

    and-int/lit16 v5, v3, 0x800

    if-eqz v5, :cond_21

    or-int/lit8 v15, v15, 0x30

    move/from16 v29, v5

    move/from16 v5, p13

    goto :goto_17

    :cond_21
    and-int/lit8 v29, v2, 0x30

    if-nez v29, :cond_23

    move/from16 v29, v5

    move/from16 v5, p13

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v32

    if-eqz v32, :cond_22

    const/16 v24, 0x20

    goto :goto_16

    :cond_22
    const/16 v24, 0x10

    :goto_16
    or-int v15, v15, v24

    goto :goto_17

    :cond_23
    move/from16 v29, v5

    move/from16 v5, p13

    :goto_17
    and-int/lit16 v5, v3, 0x1000

    if-eqz v5, :cond_24

    or-int/lit16 v15, v15, 0x180

    move/from16 v24, v5

    move-object/from16 v5, p14

    goto :goto_18

    :cond_24
    move/from16 v24, v5

    and-int/lit16 v5, v2, 0x180

    if-nez v5, :cond_26

    move-object/from16 v5, p14

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_25

    const/16 v16, 0x100

    :cond_25
    or-int v15, v15, v16

    goto :goto_18

    :cond_26
    move-object/from16 v5, p14

    :goto_18
    and-int/lit16 v5, v3, 0x2000

    if-eqz v5, :cond_27

    or-int/lit16 v15, v15, 0xc00

    move/from16 v16, v5

    move-object/from16 v5, p15

    goto :goto_1a

    :cond_27
    move/from16 v16, v5

    and-int/lit16 v5, v2, 0xc00

    if-nez v5, :cond_29

    move-object/from16 v5, p15

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_28

    goto :goto_19

    :cond_28
    move/from16 v18, v19

    :goto_19
    or-int v15, v15, v18

    goto :goto_1a

    :cond_29
    move-object/from16 v5, p15

    :goto_1a
    and-int/lit16 v5, v2, 0x6000

    if-nez v5, :cond_2c

    and-int/lit16 v5, v3, 0x4000

    if-nez v5, :cond_2a

    move-wide/from16 v5, p16

    invoke-interface {v4, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    if-eqz v18, :cond_2b

    move/from16 v21, v22

    goto :goto_1b

    :cond_2a
    move-wide/from16 v5, p16

    :cond_2b
    :goto_1b
    or-int v15, v15, v21

    goto :goto_1c

    :cond_2c
    move-wide/from16 v5, p16

    :goto_1c
    const/high16 v18, 0x30000

    and-int v18, v2, v18

    const v19, 0x8000

    if-nez v18, :cond_2f

    and-int v18, v3, v19

    if-nez v18, :cond_2d

    move-wide/from16 v5, p18

    invoke-interface {v4, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v18

    if-eqz v18, :cond_2e

    const/high16 v18, 0x20000

    goto :goto_1d

    :cond_2d
    move-wide/from16 v5, p18

    :cond_2e
    move/from16 v18, v25

    :goto_1d
    or-int v15, v15, v18

    goto :goto_1e

    :cond_2f
    move-wide/from16 v5, p18

    :goto_1e
    and-int v18, v3, v25

    if-eqz v18, :cond_30

    or-int v15, v15, v26

    goto :goto_20

    :cond_30
    and-int v18, v2, v26

    if-nez v18, :cond_32

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_31

    const/high16 v18, 0x100000

    goto :goto_1f

    :cond_31
    const/high16 v18, 0x80000

    :goto_1f
    or-int v15, v15, v18

    :cond_32
    :goto_20
    const v18, 0x12492493

    and-int v2, v1, v18

    const v5, 0x12492492

    if-ne v2, v5, :cond_34

    const v2, 0x92493

    and-int/2addr v2, v15

    const v5, 0x92492

    if-ne v2, v5, :cond_34

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_33

    goto :goto_21

    .line 154
    :cond_33
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v2, p1

    move-object/from16 v16, p15

    move-wide/from16 v17, p16

    move-wide/from16 v19, p18

    move/from16 v26, v1

    move-object/from16 v25, v4

    move v4, v8

    move v5, v9

    move-object v6, v11

    move-wide v7, v12

    move-object v3, v14

    move/from16 v27, v15

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    goto/16 :goto_32

    .line 128
    :cond_34
    :goto_21
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v2, p22, 0x1

    const v5, -0x70001

    if-eqz v2, :cond_3c

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v2

    if-eqz v2, :cond_35

    goto :goto_22

    .line 126
    :cond_35
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v2, v3, 0x4

    if-eqz v2, :cond_36

    and-int/lit16 v1, v1, -0x381

    :cond_36
    and-int/lit8 v2, v3, 0x20

    if-eqz v2, :cond_37

    and-int/2addr v1, v5

    :cond_37
    and-int/lit8 v2, v3, 0x40

    if-eqz v2, :cond_38

    const v2, -0x380001

    and-int/2addr v1, v2

    :cond_38
    and-int/lit16 v2, v3, 0x80

    if-eqz v2, :cond_39

    const v2, -0x1c00001

    and-int/2addr v1, v2

    :cond_39
    and-int/lit16 v2, v3, 0x4000

    if-eqz v2, :cond_3a

    const v2, -0xe001

    and-int/2addr v15, v2

    :cond_3a
    and-int v2, v3, v19

    if-eqz v2, :cond_3b

    and-int v2, v15, v5

    move-wide/from16 v17, p8

    move/from16 v6, p11

    move-object/from16 v10, p12

    move/from16 v20, p13

    move-object/from16 v21, p14

    move-object/from16 v5, p15

    move-wide/from16 v15, p16

    move-wide/from16 v22, p18

    move-object/from16 p15, p1

    move/from16 p11, p10

    .end local v15    # "$dirty1":I
    .local v2, "$dirty1":I
    goto/16 :goto_2d

    .end local v2    # "$dirty1":I
    .restart local v15    # "$dirty1":I
    :cond_3b
    move-wide/from16 v17, p8

    move/from16 v6, p11

    move-object/from16 v10, p12

    move/from16 v20, p13

    move-object/from16 v21, p14

    move-object/from16 v5, p15

    move-wide/from16 v22, p18

    move v2, v15

    move-object/from16 p15, p1

    move/from16 p11, p10

    move-wide/from16 v15, p16

    goto/16 :goto_2d

    .line 128
    :cond_3c
    :goto_22
    if-eqz v10, :cond_3d

    .line 112
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_23

    .line 128
    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_3d
    move-object/from16 v2, p1

    .line 112
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_23
    and-int/lit8 v6, v3, 0x4

    if-eqz v6, :cond_3e

    .line 113
    const/4 v6, 0x0

    const/4 v10, 0x0

    move/from16 p21, v5

    const/4 v5, 0x0

    move-object/from16 p1, v2

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    const/4 v2, 0x3

    invoke-static {v5, v6, v4, v10, v2}, Landroidx/compose/material3/BottomSheetScaffoldKt;->rememberBottomSheetScaffoldState(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;

    move-result-object v2

    .end local p2    # "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    .local v2, "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    and-int/lit16 v1, v1, -0x381

    move-object v14, v2

    goto :goto_24

    .line 112
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .restart local p2    # "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    :cond_3e
    move-object/from16 p1, v2

    move/from16 p21, v5

    .line 113
    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    .local v14, "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    .restart local p1    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_24
    if-eqz v17, :cond_3f

    .line 114
    sget-object v2, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetPeekHeight-D9Ej5fM()F

    move-result v2

    move v8, v2

    .end local p3    # "sheetPeekHeight":F
    .local v8, "sheetPeekHeight":F
    :cond_3f
    if-eqz v20, :cond_40

    .line 115
    sget-object v2, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetMaxWidth-D9Ej5fM()F

    move-result v2

    move v9, v2

    .end local p4    # "sheetMaxWidth":F
    .local v9, "sheetMaxWidth":F
    :cond_40
    and-int/lit8 v2, v3, 0x20

    const/4 v5, 0x6

    if-eqz v2, :cond_41

    .line 116
    sget-object v2, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v2, v4, v5}, Landroidx/compose/material3/BottomSheetDefaults;->getExpandedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v2

    .end local p5    # "sheetShape":Landroidx/compose/ui/graphics/Shape;
    .local v2, "sheetShape":Landroidx/compose/ui/graphics/Shape;
    and-int v1, v1, p21

    move-object v11, v2

    .end local v2    # "sheetShape":Landroidx/compose/ui/graphics/Shape;
    .local v11, "sheetShape":Landroidx/compose/ui/graphics/Shape;
    :cond_41
    and-int/lit8 v2, v3, 0x40

    if-eqz v2, :cond_42

    .line 117
    sget-object v2, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v2, v4, v5}, Landroidx/compose/material3/BottomSheetDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    .end local p6    # "sheetContainerColor":J
    .local v12, "sheetContainerColor":J
    const v2, -0x380001

    and-int/2addr v1, v2

    :cond_42
    and-int/lit16 v2, v3, 0x80

    if-eqz v2, :cond_43

    .line 118
    shr-int/lit8 v2, v1, 0x12

    and-int/lit8 v2, v2, 0xe

    invoke-static {v12, v13, v4, v2}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    .end local p8    # "sheetContentColor":J
    .local v17, "sheetContentColor":J
    const v2, -0x1c00001

    and-int/2addr v1, v2

    goto :goto_25

    .line 117
    .end local v17    # "sheetContentColor":J
    .restart local p8    # "sheetContentColor":J
    :cond_43
    move-wide/from16 v17, p8

    .line 118
    .end local p8    # "sheetContentColor":J
    .restart local v17    # "sheetContentColor":J
    :goto_25
    if-eqz v30, :cond_44

    .line 119
    const/4 v2, 0x0

    .local v2, "$this$dp$iv":I
    const/4 v6, 0x0

    .line 411
    .local v6, "$i$f$getDp":I
    int-to-float v10, v2

    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .end local v6    # "$i$f$getDp":I
    .end local p10    # "sheetTonalElevation":F
    .local v2, "sheetTonalElevation":F
    goto :goto_26

    .line 118
    .end local v2    # "sheetTonalElevation":F
    .restart local p10    # "sheetTonalElevation":F
    :cond_44
    move/from16 v2, p10

    .line 411
    .end local p10    # "sheetTonalElevation":F
    .restart local v2    # "sheetTonalElevation":F
    :goto_26
    if-eqz v31, :cond_45

    .line 120
    sget-object v6, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v6}, Landroidx/compose/material3/BottomSheetDefaults;->getElevation-D9Ej5fM()F

    move-result v6

    .end local p11    # "sheetShadowElevation":F
    .local v6, "sheetShadowElevation":F
    goto :goto_27

    .line 411
    .end local v6    # "sheetShadowElevation":F
    .restart local p11    # "sheetShadowElevation":F
    :cond_45
    move/from16 v6, p11

    .line 120
    .end local p11    # "sheetShadowElevation":F
    .restart local v6    # "sheetShadowElevation":F
    :goto_27
    if-eqz v23, :cond_46

    sget-object v10, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;

    invoke-virtual {v10}, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->getLambda-1$material3_release()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    .end local p12    # "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    .local v10, "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    goto :goto_28

    .end local v10    # "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    .restart local p12    # "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    :cond_46
    move-object/from16 v10, p12

    .end local p12    # "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    .restart local v10    # "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    :goto_28
    if-eqz v29, :cond_47

    .line 122
    const/16 v20, 0x1

    .end local p13    # "sheetSwipeEnabled":Z
    .local v20, "sheetSwipeEnabled":Z
    goto :goto_29

    .line 120
    .end local v20    # "sheetSwipeEnabled":Z
    .restart local p13    # "sheetSwipeEnabled":Z
    :cond_47
    move/from16 v20, p13

    .line 122
    .end local p13    # "sheetSwipeEnabled":Z
    .restart local v20    # "sheetSwipeEnabled":Z
    :goto_29
    if-eqz v24, :cond_48

    .line 123
    const/16 v21, 0x0

    .end local p14    # "topBar":Lkotlin/jvm/functions/Function2;
    .local v21, "topBar":Lkotlin/jvm/functions/Function2;
    goto :goto_2a

    .line 122
    .end local v21    # "topBar":Lkotlin/jvm/functions/Function2;
    .restart local p14    # "topBar":Lkotlin/jvm/functions/Function2;
    :cond_48
    move-object/from16 v21, p14

    .line 123
    .end local p14    # "topBar":Lkotlin/jvm/functions/Function2;
    .restart local v21    # "topBar":Lkotlin/jvm/functions/Function2;
    :goto_2a
    if-eqz v16, :cond_49

    sget-object v16, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->getLambda-2$material3_release()Lkotlin/jvm/functions/Function3;

    move-result-object v16

    .end local p15    # "snackbarHost":Lkotlin/jvm/functions/Function3;
    .local v16, "snackbarHost":Lkotlin/jvm/functions/Function3;
    goto :goto_2b

    .end local v16    # "snackbarHost":Lkotlin/jvm/functions/Function3;
    .restart local p15    # "snackbarHost":Lkotlin/jvm/functions/Function3;
    :cond_49
    move-object/from16 v16, p15

    .end local p15    # "snackbarHost":Lkotlin/jvm/functions/Function3;
    .restart local v16    # "snackbarHost":Lkotlin/jvm/functions/Function3;
    :goto_2b
    and-int/lit16 v5, v3, 0x4000

    if-eqz v5, :cond_4a

    .line 125
    sget-object v5, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    move/from16 p3, v1

    const/4 v1, 0x6

    .end local v1    # "$dirty":I
    .local p3, "$dirty":I
    invoke-virtual {v5, v4, v1}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/material3/ColorScheme;->getSurface-0d7_KjU()J

    move-result-wide v22

    .end local p16    # "containerColor":J
    .local v22, "containerColor":J
    const v1, -0xe001

    and-int/2addr v15, v1

    move/from16 p2, v2

    move-wide/from16 v1, v22

    goto :goto_2c

    .line 123
    .end local v22    # "containerColor":J
    .end local p3    # "$dirty":I
    .restart local v1    # "$dirty":I
    .restart local p16    # "containerColor":J
    :cond_4a
    move/from16 p3, v1

    .end local v1    # "$dirty":I
    .restart local p3    # "$dirty":I
    move/from16 p2, v2

    move-wide/from16 v1, p16

    .line 125
    .end local v2    # "sheetTonalElevation":F
    .end local p16    # "containerColor":J
    .local v1, "containerColor":J
    .local p2, "sheetTonalElevation":F
    :goto_2c
    and-int v5, v3, v19

    if-eqz v5, :cond_4b

    .line 126
    shr-int/lit8 v5, v15, 0xc

    and-int/lit8 v5, v5, 0xe

    invoke-static {v1, v2, v4, v5}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v22

    .end local p18    # "contentColor":J
    .local v22, "contentColor":J
    and-int v5, v15, p21

    move-wide/from16 v34, v1

    move v2, v5

    move-object/from16 v5, v16

    move-wide/from16 v15, v34

    move-object/from16 p15, p1

    move/from16 p11, p2

    move/from16 v1, p3

    .end local v15    # "$dirty1":I
    .local v5, "$dirty1":I
    goto :goto_2d

    .line 125
    .end local v5    # "$dirty1":I
    .end local v22    # "contentColor":J
    .restart local v15    # "$dirty1":I
    .restart local p18    # "contentColor":J
    :cond_4b
    move-object/from16 p15, p1

    move/from16 p11, p2

    move-wide/from16 v22, p18

    move-object/from16 v5, v16

    move-wide/from16 v34, v1

    move/from16 v1, p3

    move v2, v15

    move-wide/from16 v15, v34

    .line 126
    .end local v16    # "snackbarHost":Lkotlin/jvm/functions/Function3;
    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "sheetTonalElevation":F
    .end local p3    # "$dirty":I
    .end local p18    # "contentColor":J
    .local v1, "$dirty":I
    .local v2, "$dirty1":I
    .local v5, "snackbarHost":Lkotlin/jvm/functions/Function3;
    .local v15, "containerColor":J
    .restart local v22    # "contentColor":J
    .local p11, "sheetTonalElevation":F
    .local p15, "modifier":Landroidx/compose/ui/Modifier;
    :goto_2d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v19

    if-eqz v19, :cond_4c

    .line 128
    const v3, -0x5ad53ca7

    move/from16 p12, v6

    .end local v6    # "sheetShadowElevation":F
    .local p12, "sheetShadowElevation":F
    const-string v6, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:127)"

    invoke-static {v3, v1, v2, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_2e

    .line 126
    .end local p12    # "sheetShadowElevation":F
    .restart local v6    # "sheetShadowElevation":F
    :cond_4c
    move/from16 p12, v6

    .line 135
    .end local v6    # "sheetShadowElevation":F
    .restart local p12    # "sheetShadowElevation":F
    :goto_2e
    invoke-virtual {v14}, Landroidx/compose/material3/BottomSheetScaffoldState;->getBottomSheetState()Landroidx/compose/material3/SheetState;

    move-result-object v3

    .line 130
    nop

    .line 131
    nop

    .line 132
    new-instance v6, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1;

    invoke-direct {v6, v0, v8}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1;-><init>(Lkotlin/jvm/functions/Function3;F)V

    const/16 v0, 0x36

    move/from16 v19, v2

    .end local v2    # "$dirty1":I
    .local v19, "$dirty1":I
    const v2, -0x1b693980

    move-object/from16 p16, v3

    const/4 v3, 0x1

    invoke-static {v2, v3, v6, v4, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 138
    new-instance v2, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$2;

    move-object/from16 p1, v2

    move-object/from16 p14, v7

    move/from16 p3, v8

    move/from16 p4, v9

    move-object/from16 p13, v10

    move-object/from16 p6, v11

    move-wide/from16 p7, v12

    move-object/from16 p2, v14

    move-wide/from16 p9, v17

    move/from16 p5, v20

    .end local v8    # "sheetPeekHeight":F
    .end local v9    # "sheetMaxWidth":F
    .end local v10    # "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    .end local v11    # "sheetShape":Landroidx/compose/ui/graphics/Shape;
    .end local v12    # "sheetContainerColor":J
    .end local v14    # "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    .end local v17    # "sheetContentColor":J
    .end local v20    # "sheetSwipeEnabled":Z
    .local p2, "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    .local p3, "sheetPeekHeight":F
    .restart local p4    # "sheetMaxWidth":F
    .local p5, "sheetSwipeEnabled":Z
    .local p6, "sheetShape":Landroidx/compose/ui/graphics/Shape;
    .local p7, "sheetContainerColor":J
    .local p9, "sheetContentColor":J
    .local p13, "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    invoke-direct/range {p1 .. p14}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$2;-><init>(Landroidx/compose/material3/BottomSheetScaffoldState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V

    move/from16 v6, p11

    move/from16 v7, p12

    move-object/from16 p3, v0

    .end local p2    # "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    .end local p3    # "sheetPeekHeight":F
    .end local p4    # "sheetMaxWidth":F
    .end local p5    # "sheetSwipeEnabled":Z
    .end local p6    # "sheetShape":Landroidx/compose/ui/graphics/Shape;
    .end local p7    # "sheetContainerColor":J
    .end local p9    # "sheetContentColor":J
    .end local p11    # "sheetTonalElevation":F
    .end local p12    # "sheetShadowElevation":F
    .end local p13    # "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    .local v6, "sheetTonalElevation":F
    .local v7, "sheetShadowElevation":F
    .restart local v8    # "sheetPeekHeight":F
    .restart local v9    # "sheetMaxWidth":F
    .restart local v10    # "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    .restart local v11    # "sheetShape":Landroidx/compose/ui/graphics/Shape;
    .restart local v12    # "sheetContainerColor":J
    .restart local v14    # "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    .restart local v17    # "sheetContentColor":J
    .restart local v20    # "sheetSwipeEnabled":Z
    const/16 v0, 0x36

    move/from16 p14, v6

    .end local v6    # "sheetTonalElevation":F
    .local p14, "sheetTonalElevation":F
    const v6, 0x74efce1f

    invoke-static {v6, v3, v2, v4, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 133
    new-instance v2, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$3;

    invoke-direct {v2, v5, v14}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$3;-><init>(Lkotlin/jvm/functions/Function3;Landroidx/compose/material3/BottomSheetScaffoldState;)V

    const/16 v6, 0x36

    move-object/from16 p4, v0

    const v0, 0x548d5be

    invoke-static {v0, v3, v2, v4, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 134
    const v2, -0x506b63c7

    const-string v6, "CC(remember):BottomSheetScaffold.kt#9igjgp"

    invoke-static {v4, v2, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v2, v1, 0x380

    xor-int/lit16 v2, v2, 0x180

    const/16 v6, 0x100

    if-le v2, v6, :cond_4d

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4e

    :cond_4d
    and-int/lit16 v2, v1, 0x180

    const/16 v6, 0x100

    if-ne v2, v6, :cond_4f

    :cond_4e
    goto :goto_2f

    :cond_4f
    const/4 v3, 0x0

    .local v3, "invalid$iv":Z
    :goto_2f
    move-object v2, v4

    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 412
    .local v6, "$i$f$cache":I
    move-object/from16 p5, v0

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 413
    .local v24, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_51

    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v26, v1

    .end local v1    # "$dirty":I
    .local v26, "$dirty":I
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_50

    goto :goto_30

    .line 417
    :cond_50
    move-object/from16 p1, v0

    goto :goto_31

    .line 413
    .end local v26    # "$dirty":I
    .restart local v1    # "$dirty":I
    :cond_51
    move/from16 v26, v1

    .line 414
    .end local v1    # "$dirty":I
    .restart local v26    # "$dirty":I
    :goto_30
    const/4 v1, 0x0

    .line 134
    .local v1, "$i$a$-cache-BottomSheetScaffoldKt$BottomSheetScaffold$4":I
    move-object/from16 p1, v0

    .end local v0    # "it$iv":Ljava/lang/Object;
    .local p1, "it$iv":Ljava/lang/Object;
    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$4$1;

    invoke-direct {v0, v14}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$4$1;-><init>(Landroidx/compose/material3/BottomSheetScaffoldState;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 414
    .end local v1    # "$i$a$-cache-BottomSheetScaffoldKt$BottomSheetScaffold$4":I
    nop

    .line 415
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 416
    nop

    .line 413
    .end local v0    # "value$iv":Ljava/lang/Object;
    :goto_31
    nop

    .line 412
    .end local v24    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p1    # "it$iv":Ljava/lang/Object;
    nop

    .line 134
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v3    # "invalid$iv":Z
    .end local v6    # "$i$f$cache":I
    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 135
    nop

    .line 136
    nop

    .line 137
    shr-int/lit8 v1, v26, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x6d80

    shr-int/lit8 v2, v19, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    shl-int/lit8 v2, v19, 0x9

    const/high16 v3, 0x1c00000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    shl-int/lit8 v2, v19, 0x9

    const/high16 v3, 0xe000000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 129
    move-object/from16 p1, p15

    move-object/from16 p7, p16

    move-object/from16 p6, v0

    move/from16 p13, v1

    move-object/from16 p12, v4

    move-wide/from16 p8, v15

    move-object/from16 p2, v21

    move-wide/from16 p10, v22

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v15    # "containerColor":J
    .end local v21    # "topBar":Lkotlin/jvm/functions/Function2;
    .end local v22    # "contentColor":J
    .end local p15    # "modifier":Landroidx/compose/ui/Modifier;
    .local p1, "modifier":Landroidx/compose/ui/Modifier;
    .local p2, "topBar":Lkotlin/jvm/functions/Function2;
    .local p8, "containerColor":J
    .local p10, "contentColor":J
    .local p12, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p1 .. p13}, Landroidx/compose/material3/BottomSheetScaffoldKt;->BottomSheetScaffoldLayout-2E65NiM(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V

    move-object/from16 v0, p1

    move-wide/from16 v1, p8

    move-object/from16 v25, p12

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p2    # "topBar":Lkotlin/jvm/functions/Function2;
    .end local p8    # "containerColor":J
    .end local p10    # "contentColor":J
    .end local p12    # "$composer":Landroidx/compose/runtime/Composer;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .local v1, "containerColor":J
    .restart local v21    # "topBar":Lkotlin/jvm/functions/Function2;
    .restart local v22    # "contentColor":J
    .local v25, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_52

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 154
    :cond_52
    move-object/from16 v16, v5

    move v4, v8

    move v5, v9

    move-object v6, v11

    move-object v3, v14

    move/from16 v27, v19

    move/from16 v14, v20

    move-object/from16 v15, v21

    move-wide/from16 v19, v22

    move/from16 v11, p14

    move-wide/from16 v34, v1

    move-object v2, v0

    move-wide/from16 v36, v12

    move v12, v7

    move-object v13, v10

    move-wide/from16 v7, v36

    move-wide/from16 v9, v17

    move-wide/from16 v17, v34

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v1    # "containerColor":J
    .end local v8    # "sheetPeekHeight":F
    .end local v10    # "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    .end local v20    # "sheetSwipeEnabled":Z
    .end local v21    # "topBar":Lkotlin/jvm/functions/Function2;
    .end local v22    # "contentColor":J
    .end local p14    # "sheetTonalElevation":F
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v3, "scaffoldState":Landroidx/compose/material3/BottomSheetScaffoldState;
    .local v4, "sheetPeekHeight":F
    .local v5, "sheetMaxWidth":F
    .local v6, "sheetShape":Landroidx/compose/ui/graphics/Shape;
    .local v7, "sheetContainerColor":J
    .local v9, "sheetContentColor":J
    .local v11, "sheetTonalElevation":F
    .local v12, "sheetShadowElevation":F
    .local v13, "sheetDragHandle":Lkotlin/jvm/functions/Function2;
    .local v14, "sheetSwipeEnabled":Z
    .local v15, "topBar":Lkotlin/jvm/functions/Function2;
    .restart local v16    # "snackbarHost":Lkotlin/jvm/functions/Function3;
    .local v17, "containerColor":J
    .local v19, "contentColor":J
    .local v27, "$dirty1":I
    :goto_32
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_53

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$5;

    move-object/from16 v21, p20

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v33, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v24}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$5;-><init>(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v33

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_53
    return-void
.end method

.method private static final BottomSheetScaffoldLayout-2E65NiM(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V
    .locals 27
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "topBar"    # Lkotlin/jvm/functions/Function2;
    .param p2, "body"    # Lkotlin/jvm/functions/Function2;
    .param p3, "bottomSheet"    # Lkotlin/jvm/functions/Function2;
    .param p4, "snackbarHost"    # Lkotlin/jvm/functions/Function2;
    .param p5, "sheetOffset"    # Lkotlin/jvm/functions/Function0;
    .param p6, "sheetState"    # Landroidx/compose/material3/SheetState;
    .param p7, "containerColor"    # J
    .param p9, "contentColor"    # J
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/material3/SheetState;",
            "JJ",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 355
    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v12, p12

    const v0, -0x626b8a2c

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    .end local p11    # "$composer":Landroidx/compose/runtime/Composer;
    .local v13, "$composer":Landroidx/compose/runtime/Composer;
    const-string v1, "C(BottomSheetScaffoldLayout)P(4,8!2,7,5,6,2:c#ui.graphics.Color,3:c#ui.graphics.Color)359@16300L255,370@16635L1950,355@16183L2402:BottomSheetScaffold.kt#uh7d8r"

    invoke-static {v13, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p12

    .local v1, "$dirty":I
    and-int/lit8 v3, v12, 0x6

    const/4 v8, 0x4

    if-nez v3, :cond_1

    move-object/from16 v15, p0

    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v8

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v1, v3

    goto :goto_1

    :cond_1
    move-object/from16 v15, p0

    :goto_1
    and-int/lit8 v3, v12, 0x30

    if-nez v3, :cond_3

    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v12, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_3

    :cond_4
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v1, v11

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v11, v12, 0xc00

    if-nez v11, :cond_7

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_5

    :cond_6
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v1, v11

    :cond_7
    and-int/lit16 v11, v12, 0x6000

    if-nez v11, :cond_9

    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_6

    :cond_8
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v1, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v12

    if-nez v11, :cond_b

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/high16 v11, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v11, 0x10000

    :goto_7
    or-int/2addr v1, v11

    :cond_b
    const/high16 v11, 0x180000

    and-int/2addr v11, v12

    const/16 p11, 0x2

    if-nez v11, :cond_d

    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v11, 0x80000

    :goto_8
    or-int/2addr v1, v11

    :cond_d
    const/high16 v11, 0xc00000

    and-int/2addr v11, v12

    if-nez v11, :cond_f

    move-wide/from16 v14, p7

    invoke-interface {v13, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v16, 0x400000

    :goto_9
    or-int v1, v1, v16

    goto :goto_a

    :cond_f
    move-wide/from16 v14, p7

    :goto_a
    const/high16 v16, 0x6000000

    and-int v16, v12, v16

    if-nez v16, :cond_11

    move-wide/from16 v11, p9

    invoke-interface {v13, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v17, 0x2000000

    :goto_b
    or-int v1, v1, v17

    goto :goto_c

    :cond_11
    move-wide/from16 v11, p9

    :goto_c
    const v17, 0x2492493

    and-int v10, v1, v17

    const v9, 0x2492492

    if-ne v10, v9, :cond_13

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v9

    if-nez v9, :cond_12

    goto :goto_d

    .line 409
    :cond_12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v16, v1

    goto/16 :goto_19

    .line 355
    :cond_13
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_14

    const/4 v9, -0x1

    const-string v10, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:354)"

    invoke-static {v0, v1, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 359
    :cond_14
    new-array v0, v8, [Lkotlin/jvm/functions/Function2;

    if-nez v2, :cond_15

    sget-object v8, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;

    invoke-virtual {v8}, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->getLambda-3$material3_release()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    goto :goto_e

    :cond_15
    move-object v8, v2

    :goto_e
    const/4 v9, 0x0

    aput-object v8, v0, v9

    .line 360
    new-instance v14, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1;

    move-object/from16 v15, p0

    move-wide/from16 v16, p7

    move-object/from16 v20, v3

    move-wide/from16 v18, v11

    const/high16 v11, 0x20000

    invoke-direct/range {v14 .. v20}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1;-><init>(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function2;)V

    const/16 v3, 0x36

    const v8, 0x17c7b382

    const/4 v10, 0x1

    invoke-static {v8, v10, v14, v13, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    aput-object v3, v0, v10

    .line 359
    nop

    .line 368
    aput-object v4, v0, p11

    .line 359
    nop

    .line 369
    const/4 v3, 0x3

    aput-object v5, v0, v3

    .line 359
    nop

    .line 358
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 371
    const v3, 0x48c9040f

    const-string v8, "CC(remember):BottomSheetScaffold.kt#9igjgp"

    invoke-static {v13, v3, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v3, 0x380000

    and-int/2addr v3, v1

    const/high16 v8, 0x100000

    if-ne v3, v8, :cond_16

    move v3, v10

    goto :goto_f

    :cond_16
    move v3, v9

    :goto_f
    const/high16 v8, 0x70000

    and-int/2addr v8, v1

    if-ne v8, v11, :cond_17

    move v8, v10

    goto :goto_10

    :cond_17
    move v8, v9

    :goto_10
    or-int/2addr v3, v8

    .local v3, "invalid$iv":Z
    move-object v8, v13

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v11, 0x0

    .line 459
    .local v11, "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 460
    .local v14, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_19

    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v12, v15, :cond_18

    goto :goto_11

    .line 464
    :cond_18
    move-object v10, v12

    goto :goto_12

    .line 461
    :cond_19
    :goto_11
    const/4 v15, 0x0

    .line 371
    .local v15, "$i$a$-cache-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2":I
    new-instance v10, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;

    invoke-direct {v10, v7, v6}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V

    check-cast v10, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    .line 461
    .end local v15    # "$i$a$-cache-BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2":I
    nop

    .line 462
    .local v10, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 463
    nop

    .line 460
    .end local v10    # "value$iv":Ljava/lang/Object;
    :goto_12
    nop

    .line 459
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 371
    .end local v3    # "invalid$iv":Z
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v11    # "$i$f$cache":I
    check-cast v10, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 356
    nop

    .local v0, "contents$iv":Ljava/util/List;
    .local v10, "measurePolicy$iv":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    move v3, v9

    .local v3, "$changed$iv":I
    const/4 v8, 0x0

    .line 465
    .local v8, "$i$f$Layout":I
    const v11, 0x5365e06c

    const-string v12, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh"

    invoke-static {v13, v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 466
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v11, Landroidx/compose/ui/Modifier;

    .line 470
    .local v11, "modifier$iv":Landroidx/compose/ui/Modifier;
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->combineAsVirtualLayouts(Ljava/util/List;)Lkotlin/jvm/functions/Function2;

    move-result-object v12

    .line 472
    const v14, -0x1154ad0d

    const-string v15, "CC(remember):Layout.kt#9igjgp"

    invoke-static {v13, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v14, v3, 0x380

    xor-int/lit16 v14, v14, 0x180

    const/16 v15, 0x100

    if-le v14, v15, :cond_1a

    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1b

    :cond_1a
    and-int/lit16 v14, v3, 0x180

    const/16 v15, 0x100

    if-ne v14, v15, :cond_1c

    :cond_1b
    const/4 v14, 0x1

    goto :goto_13

    :cond_1c
    move v14, v9

    .local v14, "invalid$iv$iv":Z
    :goto_13
    move-object v15, v13

    .local v15, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 473
    .local v16, "$i$f$cache":I
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 474
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    if-nez v14, :cond_1e

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v19, v0

    .end local v0    # "contents$iv":Ljava/util/List;
    .local v19, "contents$iv":Ljava/util/List;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v9, v0, :cond_1d

    goto :goto_14

    .line 478
    :cond_1d
    move-object v0, v9

    goto :goto_15

    .line 474
    .end local v19    # "contents$iv":Ljava/util/List;
    .restart local v0    # "contents$iv":Ljava/util/List;
    :cond_1e
    move-object/from16 v19, v0

    .line 475
    .end local v0    # "contents$iv":Ljava/util/List;
    .restart local v19    # "contents$iv":Ljava/util/List;
    :goto_14
    const/4 v0, 0x0

    .line 472
    .local v0, "$i$a$-cache-LayoutKt$Layout$3$iv":I
    invoke-static {v10}, Landroidx/compose/ui/layout/MultiContentMeasurePolicyKt;->createMeasurePolicy(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v0

    .line 475
    .end local v0    # "$i$a$-cache-LayoutKt$Layout$3$iv":I
    nop

    .line 476
    .local v0, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 477
    nop

    .line 474
    .end local v0    # "value$iv$iv":Ljava/lang/Object;
    :goto_15
    nop

    .line 473
    .end local v9    # "it$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    nop

    .line 472
    .end local v14    # "invalid$iv$iv":Z
    .end local v15    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    check-cast v0, Landroidx/compose/ui/layout/MeasurePolicy;

    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit8 v9, v3, 0x70

    .line 469
    nop

    .local v0, "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v9, "$changed$iv$iv":I
    .local v12, "content$iv$iv":Lkotlin/jvm/functions/Function2;
    const/4 v14, 0x0

    .line 479
    .local v14, "$i$f$Layout":I
    const v15, -0x4ee9b9da

    move/from16 v16, v1

    .end local v1    # "$dirty":I
    .local v16, "$dirty":I
    const-string v1, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh"

    invoke-static {v13, v15, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 480
    const/4 v1, 0x0

    invoke-static {v13, v1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v1

    .line 481
    .local v1, "compositeKeyHash$iv$iv":I
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v15

    .line 482
    .local v15, "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    move/from16 p11, v1

    .end local v1    # "compositeKeyHash$iv$iv":I
    .local p11, "compositeKeyHash$iv$iv":I
    invoke-static {v13, v11}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 484
    .local v1, "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v17

    shl-int/lit8 v2, v9, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/lit8 v2, v2, 0x6

    .line 483
    move-object/from16 v18, v17

    .local v2, "$changed$iv$iv$iv":I
    .local v18, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    const/16 v17, 0x0

    .line 485
    .local v17, "$i$f$ReusableComposeNode":I
    move/from16 v20, v2

    .end local v2    # "$changed$iv$iv$iv":I
    .local v20, "$changed$iv$iv$iv":I
    const v2, -0x2942ffcf

    move/from16 v21, v3

    .end local v3    # "$changed$iv":I
    .local v21, "$changed$iv":I
    const-string v3, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v13, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 486
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v2

    instance-of v2, v2, Landroidx/compose/runtime/Applier;

    if-nez v2, :cond_1f

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 487
    :cond_1f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 488
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-eqz v2, :cond_20

    .line 489
    move-object/from16 v2, v18

    .end local v18    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v2, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_16

    .line 491
    .end local v2    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v18    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    :cond_20
    move-object/from16 v2, v18

    .end local v18    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .restart local v2    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 493
    :goto_16
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v3

    .local v3, "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 494
    .local v18, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    sget-object v22, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v23, v2

    .end local v2    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    .local v23, "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v3, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 495
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v3, v15, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 497
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .local v2, "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    const/16 v22, 0x0

    .line 498
    .local v22, "$i$f$set-impl":I
    move-object/from16 v24, v3

    .local v24, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v25, 0x0

    .line 499
    .local v25, "$i$a$-with-Updater$set$1$iv$iv$iv":I
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v26

    if-nez v26, :cond_22

    move-object/from16 v26, v0

    .end local v0    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .local v26, "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static/range {p11 .. p11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_17

    :cond_21
    move-object/from16 v4, v24

    goto :goto_18

    .end local v26    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v0    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    :cond_22
    move-object/from16 v26, v0

    .line 500
    .end local v0    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .restart local v26    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    :goto_17
    invoke-static/range {p11 .. p11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v4, v24

    .end local v24    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .local v4, "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 501
    invoke-static/range {p11 .. p11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 503
    :goto_18
    nop

    .line 498
    .end local v4    # "$this$set_impl_u24lambda_u240$iv$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v25    # "$i$a$-with-Updater$set$1$iv$iv$iv":I
    nop

    .line 503
    nop

    .line 504
    .end local v2    # "block$iv$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v22    # "$i$f$set-impl":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v3, v1, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 505
    nop

    .line 493
    .end local v3    # "$this$Layout_u24lambda_u240$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv":I
    nop

    .line 506
    shr-int/lit8 v0, v20, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v12, v13, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 485
    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 508
    nop

    .line 479
    .end local v17    # "$i$f$ReusableComposeNode":I
    .end local v20    # "$changed$iv$iv$iv":I
    .end local v23    # "factory$iv$iv$iv":Lkotlin/jvm/functions/Function0;
    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 509
    nop

    .line 465
    .end local v1    # "materialized$iv$iv":Landroidx/compose/ui/Modifier;
    .end local v9    # "$changed$iv$iv":I
    .end local v12    # "content$iv$iv":Lkotlin/jvm/functions/Function2;
    .end local v14    # "$i$f$Layout":I
    .end local v15    # "localMap$iv$iv":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v26    # "measurePolicy$iv$iv":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local p11    # "compositeKeyHash$iv$iv":I
    invoke-static {v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 510
    nop

    .end local v8    # "$i$f$Layout":I
    .end local v10    # "measurePolicy$iv":Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .end local v11    # "modifier$iv":Landroidx/compose/ui/Modifier;
    .end local v19    # "contents$iv":Ljava/util/List;
    .end local v21    # "$changed$iv":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 409
    :cond_23
    :goto_19
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-eqz v14, :cond_24

    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJI)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v14, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_24
    return-void
.end method

.method private static final StandardBottomSheet-w7I5h1o(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .param p0, "state"    # Landroidx/compose/material3/SheetState;
    .param p1, "peekHeight"    # F
    .param p2, "sheetMaxWidth"    # F
    .param p3, "sheetSwipeEnabled"    # Z
    .param p4, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p5, "containerColor"    # J
    .param p7, "contentColor"    # J
    .param p9, "tonalElevation"    # F
    .param p10, "shadowElevation"    # F
    .param p11, "dragHandle"    # Lkotlin/jvm/functions/Function2;
    .param p12, "content"    # Lkotlin/jvm/functions/Function3;
    .param p13, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p14, "$changed"    # I
    .param p15, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetState;",
            "FFZ",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFF",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
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

    .line 225
    move-object/from16 v1, p0

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v3, p3

    move/from16 v0, p14

    const v2, 0x2b00b886

    move-object/from16 v4, p13

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .end local p13    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const-string v5, "C(StandardBottomSheet)P(9,4:c#ui.unit.Dp,7:c#ui.unit.Dp,8,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color,10:c#ui.unit.Dp,5:c#ui.unit.Dp,3)225@10249L24,*227@10358L7,248@11164L1938,294@13493L2297,242@10889L4901:BottomSheetScaffold.kt#uh7d8r"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v5, p14

    .local v5, "$dirty":I
    move/from16 v8, p15

    .local v8, "$dirty1":I
    and-int/lit8 v9, v0, 0x6

    const/4 v11, 0x2

    if-nez v9, :cond_1

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    move v9, v11

    :goto_0
    or-int/2addr v5, v9

    :cond_1
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_3

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_1

    :cond_2
    const/16 v9, 0x10

    :goto_1
    or-int/2addr v5, v9

    :cond_3
    and-int/lit16 v9, v0, 0x180

    if-nez v9, :cond_5

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_2

    :cond_4
    const/16 v9, 0x80

    :goto_2
    or-int/2addr v5, v9

    :cond_5
    and-int/lit16 v9, v0, 0xc00

    if-nez v9, :cond_7

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_3

    :cond_6
    const/16 v9, 0x400

    :goto_3
    or-int/2addr v5, v9

    :cond_7
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_9

    move-object/from16 v9, p4

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x4000

    goto :goto_4

    :cond_8
    const/16 v12, 0x2000

    :goto_4
    or-int/2addr v5, v12

    goto :goto_5

    :cond_9
    move-object/from16 v9, p4

    :goto_5
    const/high16 v12, 0x30000

    and-int/2addr v12, v0

    if-nez v12, :cond_b

    move-wide/from16 v12, p5

    invoke-interface {v4, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v14

    if-eqz v14, :cond_a

    const/high16 v14, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v14, 0x10000

    :goto_6
    or-int/2addr v5, v14

    goto :goto_7

    :cond_b
    move-wide/from16 v12, p5

    :goto_7
    const/high16 v14, 0x180000

    and-int/2addr v14, v0

    if-nez v14, :cond_d

    move-wide/from16 v14, p7

    invoke-interface {v4, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v16

    if-eqz v16, :cond_c

    const/high16 v16, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v16, 0x80000

    :goto_8
    or-int v5, v5, v16

    goto :goto_9

    :cond_d
    move-wide/from16 v14, p7

    :goto_9
    const/high16 v16, 0xc00000

    and-int v17, v0, v16

    if-nez v17, :cond_f

    move/from16 v12, p9

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v13

    if-eqz v13, :cond_e

    const/high16 v13, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v13, 0x400000

    :goto_a
    or-int/2addr v5, v13

    goto :goto_b

    :cond_f
    move/from16 v12, p9

    :goto_b
    const/high16 v13, 0x6000000

    and-int/2addr v13, v0

    if-nez v13, :cond_11

    move/from16 v13, p10

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v17, 0x2000000

    :goto_c
    or-int v5, v5, v17

    goto :goto_d

    :cond_11
    move/from16 v13, p10

    :goto_d
    const/high16 v17, 0x30000000

    and-int v17, v0, v17

    if-nez v17, :cond_13

    move-object/from16 v12, p11

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x20000000

    goto :goto_e

    :cond_12
    const/high16 v17, 0x10000000

    :goto_e
    or-int v5, v5, v17

    goto :goto_f

    :cond_13
    move-object/from16 v12, p11

    :goto_f
    and-int/lit8 v17, p15, 0x6

    if-nez v17, :cond_15

    move-object/from16 v12, p12

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_14

    const/16 v17, 0x4

    goto :goto_10

    :cond_14
    move/from16 v17, v11

    :goto_10
    or-int v8, v8, v17

    goto :goto_11

    :cond_15
    move-object/from16 v12, p12

    :goto_11
    const v17, 0x12492493

    and-int v10, v5, v17

    const v2, 0x12492492

    if-ne v10, v2, :cond_17

    and-int/lit8 v2, v8, 0x3

    if-ne v2, v11, :cond_17

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_12

    .line 341
    :cond_16
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v18, v4

    move/from16 v22, v5

    move/from16 v21, v8

    goto/16 :goto_1a

    .line 225
    :cond_17
    :goto_12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_18

    const-string v2, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:224)"

    const v10, 0x2b00b886

    invoke-static {v10, v5, v8, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 226
    :cond_18
    const/4 v2, 0x0

    move v10, v2

    .local v10, "$changed$iv":I
    const/16 v17, 0x0

    .line 430
    .local v17, "$i$f$rememberCoroutineScope":I
    const v2, 0x2e20b340

    const-string v11, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp"

    invoke-static {v4, v2, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 431
    nop

    .line 433
    move-object v2, v4

    .line 434
    .local v2, "composer$iv":Landroidx/compose/runtime/Composer;
    const v11, -0x38e26dd0

    const-string v0, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v4, v11, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid$iv$iv":Z
    move-object v11, v4

    .local v11, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v20, 0x0

    .line 435
    .local v20, "$i$f$cache":I
    move/from16 v21, v0

    .end local v0    # "invalid$iv$iv":Z
    .local v21, "invalid$iv$iv":Z
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 436
    .local v22, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    sget-object v23, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v23 .. v23}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_19

    .line 437
    const/4 v3, 0x0

    .line 438
    .local v3, "$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    nop

    .line 439
    const/16 v23, 0x0

    .line 440
    .local v23, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v23, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 439
    .end local v23    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move-object/from16 v24, v0

    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .local v24, "it$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v23

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v2}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    .line 438
    move-object/from16 v23, v2

    .end local v2    # "composer$iv":Landroidx/compose/runtime/Composer;
    .local v23, "composer$iv":Landroidx/compose/runtime/Composer;
    new-instance v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v2, v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 437
    .end local v3    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    nop

    .line 441
    .local v2, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 442
    nop

    .end local v2    # "value$iv$iv":Ljava/lang/Object;
    goto :goto_13

    .line 443
    .end local v23    # "composer$iv":Landroidx/compose/runtime/Composer;
    .end local v24    # "it$iv$iv":Ljava/lang/Object;
    .restart local v0    # "it$iv$iv":Ljava/lang/Object;
    .local v2, "composer$iv":Landroidx/compose/runtime/Composer;
    :cond_19
    move-object/from16 v24, v0

    move-object/from16 v23, v2

    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v2    # "composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v23    # "composer$iv":Landroidx/compose/runtime/Composer;
    .restart local v24    # "it$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v24

    .line 436
    :goto_13
    nop

    .line 435
    .end local v22    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    .end local v24    # "it$iv$iv":Ljava/lang/Object;
    nop

    .line 434
    .end local v11    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v20    # "$i$f$cache":I
    .end local v21    # "invalid$iv$iv":Z
    move-object v0, v2

    check-cast v0, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .local v0, "wrapper$iv":Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 444
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    .line 430
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 444
    nop

    .line 226
    .end local v0    # "wrapper$iv":Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
    .end local v10    # "$changed$iv":I
    .end local v17    # "$i$f$rememberCoroutineScope":I
    .end local v23    # "composer$iv":Landroidx/compose/runtime/Composer;
    nop

    .line 227
    .local v2, "scope":Lkotlinx/coroutines/CoroutineScope;
    sget-object v10, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 228
    .local v10, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    .local v0, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v3, 0x0

    .local v3, "$changed$iv":I
    const/4 v11, 0x0

    .line 445
    .local v11, "$i$f$getCurrent":I
    move/from16 v17, v3

    .end local v3    # "$changed$iv":I
    .local v17, "$changed$iv":I
    const v3, 0x789c5f52

    move/from16 v20, v5

    .end local v5    # "$dirty":I
    .local v20, "$dirty":I
    const-string v5, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v4, v3, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 228
    .end local v0    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v11    # "$i$f$getCurrent":I
    .end local v17    # "$changed$iv":I
    move-object v0, v3

    check-cast v0, Landroidx/compose/ui/unit/Density;

    .line 446
    .local v0, "$this$StandardBottomSheet_w7I5h1o_u24lambda_u243":Landroidx/compose/ui/unit/Density;
    const/4 v3, 0x0

    .line 228
    .local v3, "$i$a$-with-BottomSheetScaffoldKt$StandardBottomSheet$peekHeightPx$1":I
    invoke-interface {v0, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v0

    .end local v3    # "$i$a$-with-BottomSheetScaffoldKt$StandardBottomSheet$peekHeightPx$1":I
    .local v0, "peekHeightPx":F
    const v3, -0x6d2c2c7c

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "231@10496L326"

    invoke-static {v4, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 230
    const-string v3, "CC(remember):BottomSheetScaffold.kt#9igjgp"

    if-eqz p3, :cond_1c

    .line 231
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v11, Landroidx/compose/ui/Modifier;

    .line 232
    invoke-virtual {v1}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v5

    move/from16 v21, v8

    .end local v8    # "$dirty1":I
    .local v21, "$dirty1":I
    const v8, -0x6d2c2386

    invoke-static {v4, v8, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    .local v5, "invalid$iv":Z
    move-object v8, v4

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v22, 0x0

    .line 447
    .local v22, "$i$f$cache":I
    move/from16 v23, v5

    .end local v5    # "invalid$iv":Z
    .local v23, "invalid$iv":Z
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 448
    .local v24, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v23, :cond_1b

    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v5, v9, :cond_1a

    goto :goto_14

    .line 452
    :cond_1a
    move-object/from16 v25, v5

    goto :goto_15

    .line 449
    :cond_1b
    :goto_14
    const/4 v9, 0x0

    .line 234
    .local v9, "$i$a$-cache-BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1":I
    nop

    .line 235
    nop

    .line 233
    move-object/from16 v25, v5

    .end local v5    # "it$iv":Ljava/lang/Object;
    .local v25, "it$iv":Ljava/lang/Object;
    new-instance v5, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1;

    invoke-direct {v5, v2, v1}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1;-><init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;)V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v10, v5}, Landroidx/compose/material3/SheetDefaultsKt;->ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v5

    .line 449
    .end local v9    # "$i$a$-cache-BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1":I
    nop

    .line 450
    .local v5, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 451
    nop

    .line 448
    .end local v5    # "value$iv":Ljava/lang/Object;
    :goto_15
    nop

    .line 447
    .end local v24    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v25    # "it$iv":Ljava/lang/Object;
    nop

    .line 232
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v22    # "$i$f$cache":I
    .end local v23    # "invalid$iv":Z
    check-cast v5, Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 231
    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-static {v11, v5, v8, v9, v8}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt;->nestedScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    goto :goto_16

    .line 241
    .end local v21    # "$dirty1":I
    .local v8, "$dirty1":I
    :cond_1c
    move/from16 v21, v8

    .end local v8    # "$dirty1":I
    .restart local v21    # "$dirty1":I
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v5, Landroidx/compose/ui/Modifier;

    .line 230
    :goto_16
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 229
    nop

    .line 245
    .local v5, "nestedScroll":Landroidx/compose/ui/Modifier;
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v8, Landroidx/compose/ui/Modifier;

    const/4 v9, 0x0

    const/4 v11, 0x1

    move-object/from16 v22, v2

    const/4 v2, 0x0

    .end local v2    # "scope":Lkotlinx/coroutines/CoroutineScope;
    .local v22, "scope":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {v8, v9, v7, v11, v2}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 246
    invoke-static {v8, v9, v11, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 247
    const/4 v11, 0x2

    invoke-static {v8, v6, v9, v11, v2}, Landroidx/compose/foundation/layout/SizeKt;->requiredHeightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 248
    invoke-interface {v2, v5}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 249
    invoke-virtual {v1}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v8

    const v9, -0x6d2bc9ba

    invoke-static {v4, v9, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v3, v20, 0xe

    const/4 v9, 0x4

    if-ne v3, v9, :cond_1d

    const/16 v18, 0x1

    goto :goto_17

    :cond_1d
    const/16 v18, 0x0

    :goto_17
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v3

    or-int v3, v18, v3

    .local v3, "invalid$iv":Z
    move-object v9, v4

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v11, 0x0

    .line 453
    .local v11, "$i$f$cache":I
    move/from16 p13, v3

    .end local v3    # "invalid$iv":Z
    .local p13, "invalid$iv":Z
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 454
    .local v18, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p13, :cond_1f

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v23, v4

    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v23, "$composer":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_1e

    goto :goto_18

    .line 458
    :cond_1e
    move-object/from16 v19, v3

    goto :goto_19

    .line 454
    .end local v23    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v4    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_1f
    move-object/from16 v23, v4

    .line 455
    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v23    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_18
    const/4 v4, 0x0

    .line 249
    .local v4, "$i$a$-cache-BottomSheetScaffoldKt$StandardBottomSheet$1":I
    move-object/from16 v19, v3

    .end local v3    # "it$iv":Ljava/lang/Object;
    .local v19, "it$iv":Ljava/lang/Object;
    new-instance v3, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$1$1;

    invoke-direct {v3, v1, v0}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$1$1;-><init>(Landroidx/compose/material3/SheetState;F)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 455
    .end local v4    # "$i$a$-cache-BottomSheetScaffoldKt$StandardBottomSheet$1":I
    nop

    .line 456
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 457
    nop

    .line 454
    .end local v3    # "value$iv":Ljava/lang/Object;
    :goto_19
    nop

    .line 453
    .end local v18    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v19    # "it$iv":Ljava/lang/Object;
    nop

    .line 249
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v11    # "$i$f$cache":I
    .end local p13    # "invalid$iv":Z
    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-static/range {v23 .. v23}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, v8, v10, v3}, Landroidx/compose/material3/internal/AnchoredDraggableKt;->draggableAnchors(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 286
    invoke-virtual {v1}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v9

    .line 287
    nop

    .line 288
    nop

    .line 285
    const/16 v14, 0x18

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v11, p3

    const/16 v17, 0x1

    invoke-static/range {v8 .. v15}, Landroidx/compose/material3/internal/AnchoredDraggableKt;->anchoredDraggable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 290
    move-object/from16 v24, v10

    .line 291
    .end local v10    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v24, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    nop

    .line 292
    nop

    .line 293
    nop

    .line 294
    nop

    .line 295
    move v2, v0

    .end local v0    # "peekHeightPx":F
    .local v2, "peekHeightPx":F
    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$2;

    move/from16 v3, p3

    move-object/from16 v25, v5

    move/from16 v10, v17

    move-object/from16 v4, v22

    move-object/from16 v9, v23

    move-object/from16 v5, p12

    move/from16 v23, v2

    move/from16 v22, v20

    move-object v2, v1

    move-object/from16 v1, p11

    .end local v2    # "peekHeightPx":F
    .end local v5    # "nestedScroll":Landroidx/compose/ui/Modifier;
    .end local v20    # "$dirty":I
    .local v4, "scope":Lkotlinx/coroutines/CoroutineScope;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    .local v22, "$dirty":I
    .local v23, "peekHeightPx":F
    .local v25, "nestedScroll":Landroidx/compose/ui/Modifier;
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$2;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/SheetState;ZLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)V

    const/16 v1, 0x36

    const v2, 0x1749ed8b

    invoke-static {v2, v10, v0, v9, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v0, v22, 0x9

    and-int/lit8 v0, v0, 0x70

    or-int v0, v0, v16

    shr-int/lit8 v1, v22, 0x9

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    shr-int/lit8 v1, v22, 0x9

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v0, v1

    shr-int/lit8 v1, v22, 0x9

    const v2, 0xe000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    shr-int/lit8 v2, v22, 0x9

    and-int/2addr v1, v2

    or-int v19, v0, v1

    .line 243
    const/16 v16, 0x0

    const/16 v20, 0x40

    move-wide/from16 v10, p5

    move-wide/from16 v12, p7

    move/from16 v14, p9

    move/from16 v15, p10

    move-object/from16 v18, v9

    move-object/from16 v9, p4

    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .local v18, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v8 .. v20}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 341
    .end local v4    # "scope":Lkotlinx/coroutines/CoroutineScope;
    .end local v23    # "peekHeightPx":F
    .end local v24    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local v25    # "nestedScroll":Landroidx/compose/ui/Modifier;
    :cond_20
    :goto_1a
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_21

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3;

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v26, v1

    move v2, v6

    move v3, v7

    move-object/from16 v1, p0

    move-wide/from16 v6, p5

    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3;-><init>(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v26

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_21
    return-void
.end method

.method public static final synthetic access$BottomSheetScaffoldLayout-2E65NiM(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V
    .locals 0
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "topBar"    # Lkotlin/jvm/functions/Function2;
    .param p2, "body"    # Lkotlin/jvm/functions/Function2;
    .param p3, "bottomSheet"    # Lkotlin/jvm/functions/Function2;
    .param p4, "snackbarHost"    # Lkotlin/jvm/functions/Function2;
    .param p5, "sheetOffset"    # Lkotlin/jvm/functions/Function0;
    .param p6, "sheetState"    # Landroidx/compose/material3/SheetState;
    .param p7, "containerColor"    # J
    .param p9, "contentColor"    # J
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I

    .line 1
    invoke-static/range {p0 .. p12}, Landroidx/compose/material3/BottomSheetScaffoldKt;->BottomSheetScaffoldLayout-2E65NiM(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$StandardBottomSheet-w7I5h1o(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 0
    .param p0, "state"    # Landroidx/compose/material3/SheetState;
    .param p1, "peekHeight"    # F
    .param p2, "sheetMaxWidth"    # F
    .param p3, "sheetSwipeEnabled"    # Z
    .param p4, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p5, "containerColor"    # J
    .param p7, "contentColor"    # J
    .param p9, "tonalElevation"    # F
    .param p10, "shadowElevation"    # F
    .param p11, "dragHandle"    # Lkotlin/jvm/functions/Function2;
    .param p12, "content"    # Lkotlin/jvm/functions/Function3;
    .param p13, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p14, "$changed"    # I
    .param p15, "$changed1"    # I

    .line 1
    invoke-static/range {p0 .. p15}, Landroidx/compose/material3/BottomSheetScaffoldKt;->StandardBottomSheet-w7I5h1o(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final rememberBottomSheetScaffoldState(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;
    .locals 8
    .param p0, "bottomSheetState"    # Landroidx/compose/material3/SheetState;
    .param p1, "snackbarHostState"    # Landroidx/compose/material3/SnackbarHostState;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    .line 181
    const v0, -0x57e4b436

    const-string v1, "C(rememberBottomSheetScaffoldState)178@8695L34,179@8774L32,181@8848L196:BottomSheetScaffold.kt#uh7d8r"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    .line 179
    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v2 .. v7}, Landroidx/compose/material3/BottomSheetScaffoldKt;->rememberStandardBottomSheetState(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object p0

    goto :goto_0

    .line 181
    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local p2    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_0
    move-object v5, p2

    .line 179
    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v5    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_0
    and-int/lit8 p2, p4, 0x2

    const-string p4, "CC(remember):BottomSheetScaffold.kt#9igjgp"

    if-eqz p2, :cond_2

    .line 180
    const p2, -0x2ef392c9

    invoke-static {v5, p2, p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 p2, 0x0

    .local p2, "invalid$iv":Z
    move-object v1, v5

    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 418
    .local v2, "$i$f$cache":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 419
    .local v4, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v3, v6, :cond_1

    .line 420
    const/4 v6, 0x0

    .line 180
    .local v6, "$i$a$-cache-BottomSheetScaffoldKt$rememberBottomSheetScaffoldState$1":I
    new-instance v7, Landroidx/compose/material3/SnackbarHostState;

    invoke-direct {v7}, Landroidx/compose/material3/SnackbarHostState;-><init>()V

    .line 420
    .end local v6    # "$i$a$-cache-BottomSheetScaffoldKt$rememberBottomSheetScaffoldState$1":I
    nop

    .line 421
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 422
    nop

    .end local v7    # "value$iv":Ljava/lang/Object;
    goto :goto_1

    .line 423
    :cond_1
    move-object v7, v3

    .line 419
    :goto_1
    nop

    .line 418
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 180
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    move-object p1, v7

    check-cast p1, Landroidx/compose/material3/SnackbarHostState;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    :cond_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 181
    const/4 p2, -0x1

    const-string v1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:180)"

    invoke-static {v0, p3, p2, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3
    nop

    .line 182
    const p2, -0x2ef388e5

    invoke-static {v5, p2, p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 p2, p3, 0xe

    xor-int/lit8 p2, p2, 0x6

    const/4 p4, 0x0

    const/4 v0, 0x4

    const/4 v1, 0x1

    if-le p2, v0, :cond_4

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :cond_4
    and-int/lit8 p2, p3, 0x6

    if-ne p2, v0, :cond_6

    :cond_5
    move p2, v1

    goto :goto_2

    :cond_6
    move p2, p4

    :goto_2
    and-int/lit8 v0, p3, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v2, 0x20

    if-le v0, v2, :cond_7

    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    and-int/lit8 v0, p3, 0x30

    if-ne v0, v2, :cond_9

    :cond_8
    move p4, v1

    :cond_9
    or-int/2addr p2, p4

    .restart local p2    # "invalid$iv":Z
    move-object p4, v5

    .local p4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v0, 0x0

    .line 424
    .local v0, "$i$f$cache":I
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 425
    .local v2, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p2, :cond_b

    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_a

    goto :goto_3

    .line 429
    :cond_a
    move-object v4, v1

    goto :goto_4

    .line 426
    :cond_b
    :goto_3
    const/4 v3, 0x0

    .line 183
    .local v3, "$i$a$-cache-BottomSheetScaffoldKt$rememberBottomSheetScaffoldState$2":I
    new-instance v4, Landroidx/compose/material3/BottomSheetScaffoldState;

    .line 184
    nop

    .line 185
    nop

    .line 183
    invoke-direct {v4, p0, p1}, Landroidx/compose/material3/BottomSheetScaffoldState;-><init>(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V

    .line 426
    .end local v3    # "$i$a$-cache-BottomSheetScaffoldKt$rememberBottomSheetScaffoldState$2":I
    nop

    .line 427
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {p4, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 428
    nop

    .line 425
    .end local v4    # "value$iv":Ljava/lang/Object;
    :goto_4
    nop

    .line 424
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v2    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 182
    .end local v0    # "$i$f$cache":I
    .end local p2    # "invalid$iv":Z
    .end local p4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    check-cast v4, Landroidx/compose/material3/BottomSheetScaffoldState;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 181
    :cond_c
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 182
    return-object v4
.end method

.method public static final rememberStandardBottomSheetState(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;
    .locals 8
    .param p0, "initialValue"    # Landroidx/compose/material3/SheetValue;
    .param p1, "confirmValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p2, "skipHiddenState"    # Z
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/material3/SheetValue;",
            "Ljava/lang/Boolean;",
            ">;Z",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material3/SheetState;"
        }
    .end annotation

    .line 205
    const v0, 0x287143dd

    const-string v1, "C(rememberStandardBottomSheetState)P(1)204@9680L154:BottomSheetScaffold.kt#uh7d8r"

    invoke-static {p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    .line 201
    sget-object p0, Landroidx/compose/material3/SheetValue;->PartiallyExpanded:Landroidx/compose/material3/SheetValue;

    move-object v3, p0

    goto :goto_0

    .line 205
    :cond_0
    move-object v3, p0

    .line 201
    .end local p0    # "initialValue":Landroidx/compose/material3/SheetValue;
    .local v3, "initialValue":Landroidx/compose/material3/SheetValue;
    :goto_0
    and-int/lit8 p0, p5, 0x2

    if-eqz p0, :cond_1

    .line 202
    sget-object p0, Landroidx/compose/material3/BottomSheetScaffoldKt$rememberStandardBottomSheetState$1;->INSTANCE:Landroidx/compose/material3/BottomSheetScaffoldKt$rememberStandardBottomSheetState$1;

    move-object p1, p0

    check-cast p1, Lkotlin/jvm/functions/Function1;

    move-object v2, p1

    goto :goto_1

    .line 201
    :cond_1
    move-object v2, p1

    .line 202
    .end local p1    # "confirmValueChange":Lkotlin/jvm/functions/Function1;
    .local v2, "confirmValueChange":Lkotlin/jvm/functions/Function1;
    :goto_1
    and-int/lit8 p0, p5, 0x4

    if-eqz p0, :cond_2

    .line 203
    const/4 p2, 0x1

    move v4, p2

    goto :goto_2

    .line 202
    :cond_2
    move v4, p2

    .line 203
    .end local p2    # "skipHiddenState":Z
    .local v4, "skipHiddenState":Z
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 205
    const/4 p0, -0x1

    const-string p1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)"

    invoke-static {v0, p4, p0, p1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3
    nop

    .line 206
    nop

    .line 207
    nop

    .line 208
    and-int/lit8 p0, p4, 0x70

    shl-int/lit8 p1, p4, 0x6

    and-int/lit16 p1, p1, 0x380

    or-int/2addr p0, p1

    shl-int/lit8 p1, p4, 0x3

    and-int/lit16 p1, p1, 0x1c00

    or-int v6, p0, p1

    .line 205
    const/4 v1, 0x0

    const/4 v7, 0x1

    move-object v5, p3

    .end local p3    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/SheetDefaultsKt;->rememberSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object p0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object p0
.end method
