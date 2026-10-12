.class public final Landroidx/compose/foundation/lazy/grid/LazyGridKt;
.super Ljava/lang/Object;
.source "LazyGrid.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,422:1\n113#2:423\n557#3:424\n554#3,6:425\n1247#4,3:431\n1250#4,3:435\n1247#4,6:440\n555#5:434\n75#6:438\n75#6:439\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n66#1:423\n88#1:424\n88#1:425,6\n88#1:431,3\n88#1:435,3\n180#1:440,6\n88#1:434\n89#1:438\n90#1:439\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017\u00a2\u0006\u0002\u0008\u0019H\u0001\u00a2\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c\u00a2\u0006\u0002\u0008\u00192\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0003\u00a2\u0006\u0002\u0010)\u00a8\u0006*"
    }
    d2 = {
        "LazyGrid",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "state",
        "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
        "slots",
        "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "reverseLayout",
        "",
        "isVertical",
        "flingBehavior",
        "Landroidx/compose/foundation/gestures/FlingBehavior;",
        "userScrollEnabled",
        "overscrollEffect",
        "Landroidx/compose/foundation/OverscrollEffect;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "rememberLazyGridMeasurePolicy",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "itemProviderLambda",
        "Lkotlin/Function0;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "graphicsContext",
        "Landroidx/compose/ui/graphics/GraphicsContext;",
        "stickyItemsScrollBehavior",
        "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;",
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
.method public static final LazyGrid(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 27
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "state"    # Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .param p2, "slots"    # Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;
    .param p3, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p4, "reverseLayout"    # Z
    .param p5, "isVertical"    # Z
    .param p6, "flingBehavior"    # Landroidx/compose/foundation/gestures/FlingBehavior;
    .param p7, "userScrollEnabled"    # Z
    .param p8, "overscrollEffect"    # Landroidx/compose/foundation/OverscrollEffect;
    .param p9, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p10, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p11, "content"    # Lkotlin/jvm/functions/Function1;
    .param p12, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p13, "$changed"    # I
    .param p14, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZZ",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/LazyGridScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 83
    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v5, p5

    move/from16 v14, p7

    move-object/from16 v15, p11

    move/from16 v0, p13

    move/from16 v3, p15

    const v4, 0x2a3e8512

    move-object/from16 v6, p12

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .end local p12    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    const-string v7, "C(LazyGrid)P(5,9,8,1,7,4,2,10,6,11,3)83@3963L50,85@4039L51,87@4117L24,88@4189L7,89@4258L7,92@4299L403,125@5367L302,120@5198L1174:LazyGrid.kt#7791vq"

    invoke-static {v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v7, p13

    .local v7, "$dirty":I
    move/from16 v8, p14

    .local v8, "$dirty1":I
    and-int/lit8 v9, v3, 0x1

    if-eqz v9, :cond_0

    or-int/lit8 v7, v7, 0x6

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v12, v0, 0x6

    if-nez v12, :cond_2

    move-object/from16 v12, p0

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x4

    goto :goto_0

    :cond_1
    const/4 v13, 0x2

    :goto_0
    or-int/2addr v7, v13

    goto :goto_1

    :cond_2
    move-object/from16 v12, p0

    :goto_1
    and-int/lit8 v13, v3, 0x2

    const/16 v16, 0x20

    const/16 v17, 0x10

    if-eqz v13, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v13, v0, 0x30

    if-nez v13, :cond_5

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    move/from16 v13, v16

    goto :goto_2

    :cond_4
    move/from16 v13, v17

    :goto_2
    or-int/2addr v7, v13

    :cond_5
    :goto_3
    and-int/lit8 v13, v3, 0x4

    if-eqz v13, :cond_6

    or-int/lit16 v7, v7, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v13, v0, 0x180

    if-nez v13, :cond_9

    and-int/lit16 v13, v0, 0x200

    if-nez v13, :cond_7

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    goto :goto_4

    :cond_7
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    :goto_4
    if-eqz v13, :cond_8

    const/16 v13, 0x100

    goto :goto_5

    :cond_8
    const/16 v13, 0x80

    :goto_5
    or-int/2addr v7, v13

    :cond_9
    :goto_6
    and-int/lit8 v13, v3, 0x8

    if-eqz v13, :cond_a

    or-int/lit16 v7, v7, 0xc00

    move-object/from16 v10, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_c

    move-object/from16 v10, p3

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_b

    const/16 v18, 0x800

    goto :goto_7

    :cond_b
    const/16 v18, 0x400

    :goto_7
    or-int v7, v7, v18

    goto :goto_8

    :cond_c
    move-object/from16 v10, p3

    :goto_8
    and-int/lit8 v18, v3, 0x10

    if-eqz v18, :cond_d

    or-int/lit16 v7, v7, 0x6000

    move/from16 v11, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_f

    move/from16 v11, p4

    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_e

    const/16 v20, 0x4000

    goto :goto_9

    :cond_e
    const/16 v20, 0x2000

    :goto_9
    or-int v7, v7, v20

    goto :goto_a

    :cond_f
    move/from16 v11, p4

    :goto_a
    and-int/lit8 v20, v3, 0x20

    const/high16 v21, 0x30000

    if-eqz v20, :cond_10

    or-int v7, v7, v21

    goto :goto_c

    :cond_10
    and-int v20, v0, v21

    if-nez v20, :cond_12

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_11

    const/high16 v20, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v20, 0x10000

    :goto_b
    or-int v7, v7, v20

    :cond_12
    :goto_c
    const/high16 v20, 0x180000

    and-int v20, v0, v20

    if-nez v20, :cond_15

    and-int/lit8 v20, v3, 0x40

    if-nez v20, :cond_13

    move-object/from16 v4, p6

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_14

    const/high16 v21, 0x100000

    goto :goto_d

    :cond_13
    move-object/from16 v4, p6

    :cond_14
    const/high16 v21, 0x80000

    :goto_d
    or-int v7, v7, v21

    goto :goto_e

    :cond_15
    move-object/from16 v4, p6

    :goto_e
    and-int/lit16 v0, v3, 0x80

    const/high16 v21, 0xc00000

    if-eqz v0, :cond_16

    or-int v7, v7, v21

    goto :goto_10

    :cond_16
    and-int v0, p13, v21

    if-nez v0, :cond_18

    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v0

    if-eqz v0, :cond_17

    const/high16 v0, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v0, 0x400000

    :goto_f
    or-int/2addr v7, v0

    :cond_18
    :goto_10
    and-int/lit16 v0, v3, 0x100

    if-eqz v0, :cond_19

    const/high16 v0, 0x6000000

    or-int/2addr v7, v0

    move-object/from16 v0, p8

    goto :goto_12

    :cond_19
    const/high16 v0, 0x6000000

    and-int v0, p13, v0

    if-nez v0, :cond_1b

    move-object/from16 v0, p8

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1a

    const/high16 v21, 0x4000000

    goto :goto_11

    :cond_1a
    const/high16 v21, 0x2000000

    :goto_11
    or-int v7, v7, v21

    goto :goto_12

    :cond_1b
    move-object/from16 v0, p8

    :goto_12
    and-int/lit16 v0, v3, 0x200

    if-eqz v0, :cond_1c

    const/high16 v0, 0x30000000

    or-int/2addr v7, v0

    move-object/from16 v0, p9

    goto :goto_14

    :cond_1c
    const/high16 v0, 0x30000000

    and-int v0, p13, v0

    if-nez v0, :cond_1e

    move-object/from16 v0, p9

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1d

    const/high16 v21, 0x20000000

    goto :goto_13

    :cond_1d
    const/high16 v21, 0x10000000

    :goto_13
    or-int v7, v7, v21

    goto :goto_14

    :cond_1e
    move-object/from16 v0, p9

    :goto_14
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_1f

    or-int/lit8 v8, v8, 0x6

    move-object/from16 v0, p10

    goto :goto_16

    :cond_1f
    and-int/lit8 v0, p14, 0x6

    if-nez v0, :cond_21

    move-object/from16 v0, p10

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_20

    const/16 v19, 0x4

    goto :goto_15

    :cond_20
    const/16 v19, 0x2

    :goto_15
    or-int v8, v8, v19

    goto :goto_16

    :cond_21
    move-object/from16 v0, p10

    :goto_16
    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_22

    or-int/lit8 v8, v8, 0x30

    goto :goto_18

    :cond_22
    and-int/lit8 v0, p14, 0x30

    if-nez v0, :cond_24

    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    goto :goto_17

    :cond_23
    move/from16 v16, v17

    :goto_17
    or-int v8, v8, v16

    :cond_24
    :goto_18
    move v0, v8

    .end local v8    # "$dirty1":I
    .local v0, "$dirty1":I
    const v8, 0x12492493

    and-int/2addr v8, v7

    const v2, 0x12492492

    const/16 v16, 0x1

    if-ne v8, v2, :cond_26

    and-int/lit8 v2, v0, 0x13

    const/16 v8, 0x12

    if-eq v2, v8, :cond_25

    goto :goto_19

    :cond_25
    const/4 v2, 0x0

    goto :goto_1a

    :cond_26
    :goto_19
    move/from16 v2, v16

    :goto_1a
    and-int/lit8 v8, v7, 0x1

    invoke-interface {v6, v2, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_34

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v2, "71@3432L15"

    invoke-static {v6, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, p13, 0x1

    if-eqz v2, :cond_29

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v2

    if-eqz v2, :cond_27

    goto :goto_1b

    .line 72
    :cond_27
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v2, v3, 0x40

    if-eqz v2, :cond_28

    const v2, -0x380001

    and-int/2addr v7, v2

    :cond_28
    move-object/from16 v17, v4

    move-object v3, v10

    move v4, v11

    move-object v2, v12

    goto :goto_1f

    .line 83
    :cond_29
    :goto_1b
    if-eqz v9, :cond_2a

    .line 60
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    goto :goto_1c

    .line 83
    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local p0    # "modifier":Landroidx/compose/ui/Modifier;
    :cond_2a
    move-object v2, v12

    .line 60
    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .restart local v2    # "modifier":Landroidx/compose/ui/Modifier;
    :goto_1c
    if-eqz v13, :cond_2b

    .line 66
    const/4 v8, 0x0

    .local v8, "$this$dp$iv":I
    const/4 v9, 0x0

    .line 423
    .local v9, "$i$f$getDp":I
    int-to-float v12, v8

    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 66
    .end local v8    # "$this$dp$iv":I
    .end local v9    # "$i$f$getDp":I
    invoke-static {v8}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v8

    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v8, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    goto :goto_1d

    .line 60
    .end local v8    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    :cond_2b
    move-object v8, v10

    .line 66
    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local v8    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    :goto_1d
    if-eqz v18, :cond_2c

    .line 68
    const/4 v9, 0x0

    .end local p4    # "reverseLayout":Z
    .local v9, "reverseLayout":Z
    goto :goto_1e

    .line 66
    .end local v9    # "reverseLayout":Z
    .restart local p4    # "reverseLayout":Z
    :cond_2c
    move v9, v11

    .line 68
    .end local p4    # "reverseLayout":Z
    .restart local v9    # "reverseLayout":Z
    :goto_1e
    and-int/lit8 v10, v3, 0x40

    if-eqz v10, :cond_2d

    .line 72
    sget-object v10, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    const/4 v11, 0x6

    invoke-virtual {v10, v6, v11}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->flingBehavior(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;

    move-result-object v4

    .end local p6    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v4, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    const v10, -0x380001

    and-int/2addr v7, v10

    move-object/from16 v17, v4

    move-object v3, v8

    move v4, v9

    goto :goto_1f

    .line 68
    .end local v4    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local p6    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :cond_2d
    move-object/from16 v17, v4

    move-object v3, v8

    move v4, v9

    .line 72
    .end local v8    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local v9    # "reverseLayout":Z
    .end local p6    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v3, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v4, "reverseLayout":Z
    .local v17, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :goto_1f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v8

    if-eqz v8, :cond_2e

    .line 83
    const-string v8, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:82)"

    const v9, 0x2a3e8512

    invoke-static {v9, v7, v0, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 84
    :cond_2e
    shr-int/lit8 v8, v7, 0x3

    and-int/lit8 v8, v8, 0xe

    and-int/lit8 v9, v0, 0x70

    or-int/2addr v8, v9

    invoke-static {v1, v15, v6, v8}, Landroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt;->rememberLazyGridItemProviderLambda(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;

    move-result-object v8

    .line 86
    .local v8, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    shr-int/lit8 v9, v7, 0x3

    and-int/lit8 v9, v9, 0xe

    shr-int/lit8 v10, v7, 0x9

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v9, v10

    invoke-static {v1, v4, v6, v9}, Landroidx/compose/foundation/lazy/grid/LazySemanticsKt;->rememberLazyGridSemanticState(Landroidx/compose/foundation/lazy/grid/LazyGridState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    move-result-object v18

    .line 88
    .local v18, "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    const/4 v9, 0x0

    .local v9, "$changed$iv":I
    const/4 v10, 0x0

    .line 424
    .local v10, "$i$f$rememberCoroutineScope":I
    const v11, 0x2e20b340

    const-string v12, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp"

    invoke-static {v6, v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 425
    nop

    .line 429
    move-object v11, v6

    .line 430
    .local v11, "composer$iv":Landroidx/compose/runtime/Composer;
    const v12, -0x38dffd5c

    const-string v13, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v6, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v12, 0x0

    .local v12, "invalid$iv$iv":Z
    move-object v13, v6

    .local v13, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v19, 0x0

    .line 431
    .local v19, "$i$f$cache":I
    move/from16 p12, v0

    .end local v0    # "$dirty1":I
    .local p12, "$dirty1":I
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 432
    .local v20, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2f

    .line 433
    const/4 v1, 0x0

    .line 430
    .local v1, "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    const/16 v21, 0x0

    .line 434
    .local v21, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v21, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 430
    .end local v21    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move-object/from16 p0, v0

    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .local p0, "it$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v21

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v11}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    .line 433
    .end local v1    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    nop

    .line 435
    .local v0, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 436
    nop

    .end local v0    # "value$iv$iv":Ljava/lang/Object;
    goto :goto_20

    .line 437
    .end local p0    # "it$iv$iv":Ljava/lang/Object;
    .local v0, "it$iv$iv":Ljava/lang/Object;
    :cond_2f
    move-object/from16 p0, v0

    .line 431
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    :goto_20
    nop

    .line 430
    .end local v12    # "invalid$iv$iv":Z
    .end local v13    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v19    # "$i$f$cache":I
    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 424
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 430
    nop

    .line 88
    .end local v9    # "$changed$iv":I
    .end local v10    # "$i$f$rememberCoroutineScope":I
    .end local v11    # "composer$iv":Landroidx/compose/runtime/Composer;
    nop

    .line 89
    .local v0, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalGraphicsContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    .local v1, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v9, 0x0

    .restart local v9    # "$changed$iv":I
    const/4 v10, 0x0

    .line 438
    .local v10, "$i$f$getCurrent":I
    const v11, 0x789c5f52

    const-string v12, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v6, v11, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 89
    .end local v1    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v9    # "$changed$iv":I
    .end local v10    # "$i$f$getCurrent":I
    move-object v9, v11

    check-cast v9, Landroidx/compose/ui/graphics/GraphicsContext;

    .line 90
    .local v9, "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalScrollCaptureInProgress()Landroidx/compose/runtime/CompositionLocal;

    move-result-object v1

    .restart local v1    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v10, 0x0

    .local v10, "$changed$iv":I
    const/4 v11, 0x0

    .line 439
    .local v11, "$i$f$getCurrent":I
    const v12, 0x789c5f52

    const-string v13, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v6, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 90
    .end local v1    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v10    # "$changed$iv":I
    .end local v11    # "$i$f$getCurrent":I
    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    move/from16 v16, v1

    .line 94
    .local v16, "stickyHeadersEnabled":Z
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

    .line 100
    nop

    .line 101
    nop

    .line 102
    nop

    .line 103
    nop

    .line 104
    if-eqz v16, :cond_30

    sget-object v1, Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;->Companion:Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;->getStickToTopPlacement()Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;

    move-result-object v1

    goto :goto_21

    :cond_30
    const/4 v1, 0x0

    :goto_21
    move-object v10, v1

    and-int/lit8 v1, v7, 0x70

    and-int/lit16 v11, v7, 0x380

    or-int/2addr v1, v11

    and-int/lit16 v11, v7, 0x1c00

    or-int/2addr v1, v11

    const v11, 0xe000

    and-int/2addr v11, v7

    or-int/2addr v1, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v7

    or-int/2addr v1, v11

    shl-int/lit8 v11, p12, 0x12

    const/high16 v12, 0x380000

    and-int/2addr v11, v12

    or-int/2addr v1, v11

    shr-int/lit8 v11, v7, 0x6

    const/high16 v12, 0x1c00000

    and-int/2addr v11, v12

    or-int v12, v1, v11

    .line 93
    const/4 v13, 0x0

    move-object v1, v8

    move-object v8, v0

    move-object v0, v1

    move-object/from16 v1, p1

    move/from16 v19, p12

    move-object v14, v2

    move-object v11, v6

    move/from16 v20, v7

    move-object/from16 v2, p2

    move-object/from16 v7, p9

    move-object/from16 v6, p10

    .end local v2    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v7    # "$dirty":I
    .end local p12    # "$dirty1":I
    .local v0, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local v8, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v11, "$composer":Landroidx/compose/runtime/Composer;
    .local v14, "modifier":Landroidx/compose/ui/Modifier;
    .local v19, "$dirty1":I
    .local v20, "$dirty":I
    invoke-static/range {v0 .. v13}, Landroidx/compose/foundation/lazy/grid/LazyGridKt;->rememberLazyGridMeasurePolicy(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;

    move-result-object v10

    .line 92
    move-object v13, v1

    move-object/from16 v22, v3

    move-object v12, v8

    move-object/from16 v21, v9

    move-object v6, v11

    .end local v3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local v8    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local v9    # "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    .end local v11    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .local v12, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v21, "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    .local v22, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    move-object/from16 v23, v10

    .line 107
    .local v23, "measurePolicy":Lkotlin/jvm/functions/Function2;
    if-eqz p5, :cond_31

    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_22

    :cond_31
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_22
    move-object v2, v1

    .line 110
    .local v2, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    if-eqz p7, :cond_32

    const v1, -0x604146cc

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "111@4933L48"

    invoke-static {v6, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 111
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 112
    shr-int/lit8 v3, v20, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v13, v6, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt;->rememberLazyGridBeyondBoundsState(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;

    move-result-object v3

    .line 113
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    move-result-object v5

    .line 114
    nop

    .line 115
    nop

    .line 111
    invoke-static {v1, v3, v5, v4, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt;->lazyLayoutBeyondBoundsModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 110
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_23

    .line 117
    :cond_32
    const v1, -0x603cc580

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 118
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 110
    :goto_23
    nop

    .line 109
    move-object v8, v1

    .line 123
    .local v8, "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    nop

    .line 124
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/Modifier;

    invoke-interface {v14, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 125
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/Modifier;

    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 127
    nop

    .line 128
    nop

    .line 129
    nop

    .line 130
    nop

    .line 131
    shr-int/lit8 v3, v20, 0x9

    const v5, 0xe000

    and-int/2addr v3, v5

    const/high16 v5, 0x70000

    shl-int/lit8 v7, v20, 0x3

    and-int/2addr v5, v7

    or-int v7, v3, v5

    .line 126
    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    move-object v3, v2

    move v5, v4

    move-object/from16 v2, v18

    move/from16 v4, p7

    .end local v0    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .end local v4    # "reverseLayout":Z
    .end local v18    # "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    .local v1, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local v2, "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    .local v3, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v5, "reverseLayout":Z
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt;->lazyLayoutSemantics(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 133
    move-object/from16 v24, v1

    move-object/from16 v25, v2

    move-object v2, v3

    move v4, v5

    move-object/from16 v18, v6

    .end local v1    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .end local v3    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local v5    # "reverseLayout":Z
    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .restart local v4    # "reverseLayout":Z
    .local v18, "$composer":Landroidx/compose/runtime/Composer;
    .local v24, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local v25, "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    invoke-interface {v0, v8}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 134
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getItemAnimator$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getModifier()Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 136
    move-object v1, v13

    check-cast v1, Landroidx/compose/foundation/gestures/ScrollableState;

    .line 137
    nop

    .line 138
    nop

    .line 139
    nop

    .line 140
    nop

    .line 141
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getInternalInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v6

    .line 142
    nop

    .line 143
    nop

    .line 135
    const/16 v10, 0x100

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move/from16 v3, p7

    move-object/from16 v5, v17

    move-object/from16 v17, v8

    move-object/from16 v8, p8

    .end local v8    # "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    .local v5, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v17, "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    invoke-static/range {v0 .. v11}, Landroidx/compose/foundation/ScrollingContainerKt;->scrollingContainer$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 145
    move-object v0, v5

    .end local v5    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v0, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    move-result-object v7

    .line 147
    nop

    .line 135
    nop

    .line 145
    nop

    .line 146
    nop

    .line 121
    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, v18

    move-object/from16 v8, v23

    move-object/from16 v5, v24

    .end local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v23    # "measurePolicy":Lkotlin/jvm/functions/Function2;
    .end local v24    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local v5, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local v8, "measurePolicy":Lkotlin/jvm/functions/Function2;
    .local v9, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt;->LazyLayout(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v5

    .end local v5    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .end local v9    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .restart local v18    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_33

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 149
    .end local v1    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .end local v2    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local v8    # "measurePolicy":Lkotlin/jvm/functions/Function2;
    .end local v12    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local v16    # "stickyHeadersEnabled":Z
    .end local v17    # "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    .end local v21    # "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    .end local v25    # "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    :cond_33
    move-object v7, v0

    move v5, v4

    move-object v1, v14

    move-object/from16 v4, v22

    goto :goto_24

    .end local v4    # "reverseLayout":Z
    .end local v14    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v19    # "$dirty1":I
    .end local v20    # "$dirty":I
    .end local v22    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v0, "$dirty1":I
    .restart local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v7    # "$dirty":I
    .local p0, "modifier":Landroidx/compose/ui/Modifier;
    .restart local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .restart local p4    # "reverseLayout":Z
    .restart local p6    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    :cond_34
    move/from16 v19, v0

    move-object v13, v1

    move-object/from16 v18, v6

    .end local v0    # "$dirty1":I
    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v19    # "$dirty1":I
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v20, v7

    move v5, v11

    move-object v1, v12

    move-object v7, v4

    move-object v4, v10

    .end local p0    # "modifier":Landroidx/compose/ui/Modifier;
    .end local p3    # "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .end local p4    # "reverseLayout":Z
    .end local p6    # "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .local v1, "modifier":Landroidx/compose/ui/Modifier;
    .local v4, "contentPadding":Landroidx/compose/foundation/layout/PaddingValues;
    .local v5, "reverseLayout":Z
    .local v7, "flingBehavior":Landroidx/compose/foundation/gestures/FlingBehavior;
    .restart local v20    # "$dirty":I
    :goto_24
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_35

    move-object v2, v0

    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridKt$LazyGrid$1;

    move-object/from16 v3, p2

    move/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v14, p14

    move-object/from16 v26, v2

    move-object v2, v13

    move-object v12, v15

    move/from16 v13, p13

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Landroidx/compose/foundation/lazy/grid/LazyGridKt$LazyGrid$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v2, v26

    invoke-interface {v2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_35
    return-void
.end method

.method private static final rememberLazyGridMeasurePolicy(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;
    .locals 22
    .param p0, "itemProviderLambda"    # Lkotlin/jvm/functions/Function0;
    .param p1, "state"    # Landroidx/compose/foundation/lazy/grid/LazyGridState;
    .param p2, "slots"    # Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;
    .param p3, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p4, "reverseLayout"    # Z
    .param p5, "isVertical"    # Z
    .param p6, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p7, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p8, "coroutineScope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p9, "graphicsContext"    # Landroidx/compose/ui/graphics/GraphicsContext;
    .param p10, "stickyItemsScrollBehavior"    # Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;
    .param p11, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p12, "$changed"    # I
    .param p13, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
            ">;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZZ",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "Landroidx/compose/ui/unit/Constraints;",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;"
        }
    .end annotation

    .line 180
    move-object/from16 v0, p11

    move/from16 v1, p12

    const v2, -0x78b8ec4d

    const-string v3, "C(rememberLazyGridMeasurePolicy)P(5,8,7!1,6,4,3,10)179@7592L11578:LazyGrid.kt#7791vq"

    invoke-static {v0, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)"

    move/from16 v4, p13

    invoke-static {v2, v1, v4, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v4, p13

    :goto_0
    const v2, 0x3d30d7bb

    const-string v3, "CC(remember):LazyGrid.kt#9igjgp"

    invoke-static {v0, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v2, v1, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v3, 0x20

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-le v2, v3, :cond_1

    .line 181
    move-object/from16 v8, p1

    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    .line 180
    :cond_1
    move-object/from16 v8, p1

    .line 181
    :goto_1
    and-int/lit8 v2, v1, 0x30

    if-ne v2, v3, :cond_3

    :cond_2
    move v2, v6

    goto :goto_2

    :cond_3
    move v2, v5

    :goto_2
    and-int/lit16 v3, v1, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v7, 0x100

    if-le v3, v7, :cond_4

    .line 182
    move-object/from16 v13, p2

    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_3

    .line 181
    :cond_4
    move-object/from16 v13, p2

    .line 182
    :goto_3
    and-int/lit16 v3, v1, 0x180

    if-ne v3, v7, :cond_6

    :cond_5
    move v3, v6

    goto :goto_4

    :cond_6
    move v3, v5

    :goto_4
    or-int/2addr v2, v3

    and-int/lit16 v3, v1, 0x1c00

    xor-int/lit16 v3, v3, 0xc00

    const/16 v7, 0x800

    if-le v3, v7, :cond_7

    .line 183
    move-object/from16 v10, p3

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    .line 182
    :cond_7
    move-object/from16 v10, p3

    .line 183
    :goto_5
    and-int/lit16 v3, v1, 0xc00

    if-ne v3, v7, :cond_9

    :cond_8
    move v3, v6

    goto :goto_6

    :cond_9
    move v3, v5

    :goto_6
    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v3, v1

    xor-int/lit16 v3, v3, 0x6000

    const/16 v7, 0x4000

    if-le v3, v7, :cond_a

    .line 184
    move/from16 v11, p4

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_7

    .line 183
    :cond_a
    move/from16 v11, p4

    .line 184
    :goto_7
    and-int/lit16 v3, v1, 0x6000

    if-ne v3, v7, :cond_c

    :cond_b
    move v3, v6

    goto :goto_8

    :cond_c
    move v3, v5

    :goto_8
    or-int/2addr v2, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v1

    const/high16 v7, 0x30000

    xor-int/2addr v3, v7

    const/high16 v9, 0x20000

    if-le v3, v9, :cond_d

    .line 185
    move/from16 v3, p5

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v12

    if-nez v12, :cond_e

    goto :goto_9

    .line 184
    :cond_d
    move/from16 v3, p5

    .line 185
    :goto_9
    and-int/2addr v7, v1

    if-ne v7, v9, :cond_f

    :cond_e
    move v7, v6

    goto :goto_a

    :cond_f
    move v7, v5

    :goto_a
    or-int/2addr v2, v7

    const/high16 v7, 0x380000

    and-int/2addr v7, v1

    const/high16 v9, 0x180000

    xor-int/2addr v7, v9

    const/high16 v12, 0x100000

    if-le v7, v12, :cond_10

    .line 186
    move-object/from16 v15, p6

    invoke-interface {v0, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    goto :goto_b

    .line 185
    :cond_10
    move-object/from16 v15, p6

    .line 186
    :goto_b
    and-int v7, v1, v9

    if-ne v7, v12, :cond_12

    :cond_11
    move v7, v6

    goto :goto_c

    :cond_12
    move v7, v5

    :goto_c
    or-int/2addr v2, v7

    const/high16 v7, 0x1c00000

    and-int/2addr v7, v1

    const/high16 v9, 0xc00000

    xor-int/2addr v7, v9

    const/high16 v12, 0x800000

    if-le v7, v12, :cond_13

    .line 187
    move-object/from16 v14, p7

    invoke-interface {v0, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    goto :goto_d

    .line 186
    :cond_13
    move-object/from16 v14, p7

    .line 187
    :goto_d
    and-int v7, v1, v9

    if-ne v7, v12, :cond_15

    :cond_14
    move v5, v6

    :cond_15
    or-int/2addr v2, v5

    .line 188
    move-object/from16 v5, p9

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    .line 180
    move-object/from16 v6, p11

    .local v2, "invalid$iv":Z
    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v19, 0x0

    .line 440
    .local v19, "$i$f$cache":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 441
    .local v20, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v2, :cond_17

    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_16

    goto :goto_e

    .line 445
    :cond_16
    goto :goto_f

    .line 442
    :cond_17
    :goto_e
    const/16 v21, 0x0

    .line 190
    .local v21, "$i$a$-cache-LazyGridKt$rememberLazyGridMeasurePolicy$1":I
    move-object v9, v7

    .end local v7    # "it$iv":Ljava/lang/Object;
    .local v9, "it$iv":Ljava/lang/Object;
    new-instance v7, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;

    move-object v12, v9

    move v9, v3

    move-object v3, v12

    move-object/from16 v12, p0

    move-object/from16 v16, p8

    move-object/from16 v18, p10

    move-object/from16 v17, v5

    .end local v9    # "it$iv":Ljava/lang/Object;
    .local v3, "it$iv":Ljava/lang/Object;
    invoke-direct/range {v7 .. v18}, Landroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;ZLandroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 420
    nop

    .line 442
    .end local v21    # "$i$a$-cache-LazyGridKt$rememberLazyGridMeasurePolicy$1":I
    nop

    .line 443
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 444
    nop

    .line 440
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v7    # "value$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_f
    nop

    .line 180
    .end local v2    # "invalid$iv":Z
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v19    # "$i$f$cache":I
    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_18
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v7
.end method
