.class public final Landroidx/compose/foundation/lazy/LazyListKt;
.super Ljava/lang/Object;
.source "LazyList.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,391:1\n557#2:392\n554#2,6:393\n1247#3,3:399\n1250#3,3:403\n1247#3,6:408\n555#4:402\n75#5:406\n75#5:407\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n89#1:392\n89#1:393,6\n89#1:399,3\n89#1:403,3\n188#1:408,6\n89#1:402\n90#1:406\n91#1:407\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u00a2\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\t2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001b\u00a2\u0006\u0002\u0008\u001dH\u0001\u00a2\u0006\u0002\u0010\u001e\u001a\u009c\u0001\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 \u00a2\u0006\u0002\u0008\u001d2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0008\u0010+\u001a\u0004\u0018\u00010,H\u0003\u00a2\u0006\u0002\u0010-\u00a8\u0006."
    }
    d2 = {
        "LazyList",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "state",
        "Landroidx/compose/foundation/lazy/LazyListState;",
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
        "beyondBoundsItemCount",
        "",
        "horizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "verticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;ILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "rememberLazyListMeasurePolicy",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "itemProviderLambda",
        "Lkotlin/Function0;",
        "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "graphicsContext",
        "Landroidx/compose/ui/graphics/GraphicsContext;",
        "stickyItemsPlacement",
        "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;",
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
.method public static final LazyList(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;ILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 30
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "state"    # Landroidx/compose/foundation/lazy/LazyListState;
    .param p2, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p3, "reverseLayout"    # Z
    .param p4, "isVertical"    # Z
    .param p5, "flingBehavior"    # Landroidx/compose/foundation/gestures/FlingBehavior;
    .param p6, "userScrollEnabled"    # Z
    .param p7, "overscrollEffect"    # Landroidx/compose/foundation/OverscrollEffect;
    .param p8, "beyondBoundsItemCount"    # I
    .param p9, "horizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p10, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p11, "verticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p12, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p13, "content"    # Lkotlin/jvm/functions/Function1;
    .param p14, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p15, "$changed"    # I
    .param p16, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZZ",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "I",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/LazyListScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 85
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v0, p6

    move-object/from16 v3, p13

    move/from16 v6, p15

    move/from16 v7, p16

    move/from16 v8, p17

    const v9, 0x37213af3

    move-object/from16 v10, p14

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    .end local p14    # "$composer":Landroidx/compose/runtime/Composer;
    .local v15, "$composer":Landroidx/compose/runtime/Composer;
    const-string v10, "C(LazyList)P(7,10,2,9,6,3,11,8!1,4,13,12,5)85@4100L50,87@4176L48,88@4250L24,89@4322L7,90@4391L7,93@4432L483,132@5717L302,127@5548L1174:LazyList.kt#428nma"

    invoke-static {v15, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v10, p15

    .local v10, "$dirty":I
    move/from16 v11, p16

    .local v11, "$dirty1":I
    and-int/lit8 v12, v8, 0x1

    if-eqz v12, :cond_0

    or-int/lit8 v10, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v12, v6, 0x6

    if-nez v12, :cond_2

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/4 v12, 0x4

    goto :goto_0

    :cond_1
    const/4 v12, 0x2

    :goto_0
    or-int/2addr v10, v12

    :cond_2
    :goto_1
    and-int/lit8 v12, v8, 0x2

    const/16 v16, 0x20

    const/16 v17, 0x10

    if-eqz v12, :cond_3

    or-int/lit8 v10, v10, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v12, v6, 0x30

    if-nez v12, :cond_5

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    move/from16 v12, v16

    goto :goto_2

    :cond_4
    move/from16 v12, v17

    :goto_2
    or-int/2addr v10, v12

    :cond_5
    :goto_3
    and-int/lit8 v12, v8, 0x4

    const/16 v18, 0x100

    const/16 v19, 0x80

    if-eqz v12, :cond_6

    or-int/lit16 v10, v10, 0x180

    move-object/from16 v12, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v6, 0x180

    if-nez v12, :cond_8

    move-object/from16 v12, p2

    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_7

    move/from16 v20, v18

    goto :goto_4

    :cond_7
    move/from16 v20, v19

    :goto_4
    or-int v10, v10, v20

    goto :goto_5

    :cond_8
    move-object/from16 v12, p2

    :goto_5
    and-int/lit8 v20, v8, 0x8

    const/16 v21, 0x800

    const/16 v22, 0x400

    if-eqz v20, :cond_9

    or-int/lit16 v10, v10, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v6, 0xc00

    if-nez v13, :cond_b

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v13

    if-eqz v13, :cond_a

    move/from16 v13, v21

    goto :goto_6

    :cond_a
    move/from16 v13, v22

    :goto_6
    or-int/2addr v10, v13

    :cond_b
    :goto_7
    and-int/lit8 v13, v8, 0x10

    if-eqz v13, :cond_c

    or-int/lit16 v10, v10, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v6, 0x6000

    if-nez v13, :cond_e

    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v10, v13

    :cond_e
    :goto_9
    and-int/lit8 v13, v8, 0x20

    const/high16 v20, 0x30000

    if-eqz v13, :cond_f

    or-int v10, v10, v20

    move-object/from16 v13, p5

    goto :goto_b

    :cond_f
    and-int v13, v6, v20

    if-nez v13, :cond_11

    move-object/from16 v13, p5

    invoke-interface {v15, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_10

    const/high16 v20, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v20, 0x10000

    :goto_a
    or-int v10, v10, v20

    goto :goto_b

    :cond_11
    move-object/from16 v13, p5

    :goto_b
    and-int/lit8 v20, v8, 0x40

    const/high16 v23, 0x180000

    if-eqz v20, :cond_12

    or-int v10, v10, v23

    goto :goto_d

    :cond_12
    and-int v20, v6, v23

    if-nez v20, :cond_14

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v10, v10, v20

    :cond_14
    :goto_d
    and-int/lit16 v14, v8, 0x80

    if-eqz v14, :cond_15

    const/high16 v14, 0xc00000

    or-int/2addr v10, v14

    move-object/from16 v14, p7

    goto :goto_f

    :cond_15
    const/high16 v14, 0xc00000

    and-int/2addr v14, v6

    if-nez v14, :cond_17

    move-object/from16 v14, p7

    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_16

    const/high16 v23, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v23, 0x400000

    :goto_e
    or-int v10, v10, v23

    goto :goto_f

    :cond_17
    move-object/from16 v14, p7

    :goto_f
    and-int/lit16 v9, v8, 0x100

    const/high16 v24, 0x6000000

    if-eqz v9, :cond_18

    or-int v10, v10, v24

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v24, v6, v24

    if-nez v24, :cond_1a

    move/from16 v0, p8

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v24

    if-eqz v24, :cond_19

    const/high16 v24, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v24, 0x2000000

    :goto_10
    or-int v10, v10, v24

    goto :goto_11

    :cond_1a
    move/from16 v0, p8

    :goto_11
    and-int/lit16 v0, v8, 0x200

    const/high16 v24, 0x30000000

    if-eqz v0, :cond_1b

    or-int v10, v10, v24

    move/from16 v24, v0

    move-object/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v24, v6, v24

    if-nez v24, :cond_1d

    move/from16 v24, v0

    move-object/from16 v0, p9

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_1c

    const/high16 v25, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v25, 0x10000000

    :goto_12
    or-int v10, v10, v25

    goto :goto_13

    :cond_1d
    move/from16 v24, v0

    move-object/from16 v0, p9

    :goto_13
    and-int/lit16 v0, v8, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v11, v11, 0x6

    move/from16 v25, v0

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v25, v7, 0x6

    if-nez v25, :cond_20

    move/from16 v25, v0

    move-object/from16 v0, p10

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1f

    const/16 v20, 0x4

    goto :goto_14

    :cond_1f
    const/16 v20, 0x2

    :goto_14
    or-int v11, v11, v20

    goto :goto_15

    :cond_20
    move/from16 v25, v0

    move-object/from16 v0, p10

    :goto_15
    and-int/lit16 v0, v8, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v11, v11, 0x30

    move/from16 v20, v0

    move-object/from16 v0, p11

    goto :goto_17

    :cond_21
    and-int/lit8 v20, v7, 0x30

    if-nez v20, :cond_23

    move/from16 v20, v0

    move-object/from16 v0, p11

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_22

    goto :goto_16

    :cond_22
    move/from16 v16, v17

    :goto_16
    or-int v11, v11, v16

    goto :goto_17

    :cond_23
    move/from16 v20, v0

    move-object/from16 v0, p11

    :goto_17
    and-int/lit16 v0, v8, 0x1000

    if-eqz v0, :cond_24

    or-int/lit16 v11, v11, 0x180

    move/from16 v16, v0

    move-object/from16 v0, p12

    goto :goto_19

    :cond_24
    move/from16 v16, v0

    and-int/lit16 v0, v7, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p12

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_25

    goto :goto_18

    :cond_25
    move/from16 v18, v19

    :goto_18
    or-int v11, v11, v18

    goto :goto_19

    :cond_26
    move-object/from16 v0, p12

    :goto_19
    and-int/lit16 v0, v8, 0x2000

    if-eqz v0, :cond_27

    or-int/lit16 v11, v11, 0xc00

    goto :goto_1b

    :cond_27
    and-int/lit16 v0, v7, 0xc00

    if-nez v0, :cond_29

    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    goto :goto_1a

    :cond_28
    move/from16 v21, v22

    :goto_1a
    or-int v11, v11, v21

    :cond_29
    :goto_1b
    move v0, v11

    .end local v11    # "$dirty1":I
    .local v0, "$dirty1":I
    const v11, 0x12492493

    and-int/2addr v11, v10

    const v4, 0x12492492

    const/16 v17, 0x1

    if-ne v11, v4, :cond_2b

    and-int/lit16 v4, v0, 0x493

    const/16 v11, 0x492

    if-eq v4, v11, :cond_2a

    goto :goto_1c

    :cond_2a
    const/4 v4, 0x0

    goto :goto_1d

    :cond_2b
    :goto_1c
    move/from16 v4, v17

    :goto_1d
    and-int/lit8 v11, v10, 0x1

    invoke-interface {v15, v4, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v4

    if-eqz v4, :cond_37

    if-eqz v9, :cond_2c

    .line 74
    const/4 v4, 0x0

    move v7, v4

    .end local p8    # "beyondBoundsItemCount":I
    .local v4, "beyondBoundsItemCount":I
    goto :goto_1e

    .line 85
    .end local v4    # "beyondBoundsItemCount":I
    .restart local p8    # "beyondBoundsItemCount":I
    :cond_2c
    move/from16 v7, p8

    .line 74
    .end local p8    # "beyondBoundsItemCount":I
    .local v7, "beyondBoundsItemCount":I
    :goto_1e
    if-eqz v24, :cond_2d

    .line 76
    const/4 v4, 0x0

    move-object v8, v4

    .end local p9    # "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v4, "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    goto :goto_1f

    .line 74
    .end local v4    # "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .restart local p9    # "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    :cond_2d
    move-object/from16 v8, p9

    .line 76
    .end local p9    # "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v8, "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    :goto_1f
    if-eqz v25, :cond_2e

    .line 78
    const/4 v4, 0x0

    move-object v11, v4

    .end local p10    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v4, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    goto :goto_20

    .line 76
    .end local v4    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .restart local p10    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :cond_2e
    move-object/from16 v11, p10

    .line 78
    .end local p10    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v11, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    :goto_20
    if-eqz v20, :cond_2f

    .line 80
    const/4 v4, 0x0

    move-object v9, v4

    .end local p11    # "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v4, "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    goto :goto_21

    .line 78
    .end local v4    # "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .restart local p11    # "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    :cond_2f
    move-object/from16 v9, p11

    .line 80
    .end local p11    # "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v9, "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    :goto_21
    if-eqz v16, :cond_30

    .line 82
    const/4 v4, 0x0

    .end local p12    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v4, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    goto :goto_22

    .line 80
    .end local v4    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p12    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_30
    move-object/from16 v4, p12

    .line 82
    .end local p12    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v4    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_22
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v16

    if-eqz v16, :cond_31

    .line 85
    move-object/from16 p8, v4

    .end local v4    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local p8, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const-string v4, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:84)"

    const v6, 0x37213af3

    invoke-static {v6, v10, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_23

    .line 82
    .end local p8    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v4    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_31
    move-object/from16 p8, v4

    .line 86
    .end local v4    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local p8    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_23
    shr-int/lit8 v4, v10, 0x3

    and-int/lit8 v4, v4, 0xe

    shr-int/lit8 v6, v0, 0x6

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v4, v6

    invoke-static {v2, v3, v15, v4}, Landroidx/compose/foundation/lazy/LazyListItemProviderKt;->rememberLazyListItemProviderLambda(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;

    move-result-object v4

    .line 88
    .local v4, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    shr-int/lit8 v6, v10, 0x3

    and-int/lit8 v6, v6, 0xe

    shr-int/lit8 v16, v10, 0x9

    and-int/lit8 v16, v16, 0x70

    or-int v6, v6, v16

    invoke-static {v2, v5, v15, v6}, Landroidx/compose/foundation/lazy/LazyListSemanticsKt;->rememberLazyListSemanticState(Landroidx/compose/foundation/lazy/LazyListState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    move-result-object v18

    .line 89
    .local v18, "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    const/4 v6, 0x0

    .local v6, "$changed$iv":I
    const/16 v16, 0x0

    .line 392
    .local v16, "$i$f$rememberCoroutineScope":I
    move/from16 v19, v0

    .end local v0    # "$dirty1":I
    .local v19, "$dirty1":I
    const v0, 0x2e20b340

    const-string v2, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp"

    invoke-static {v15, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 393
    nop

    .line 397
    move-object v0, v15

    .line 398
    .local v0, "composer$iv":Landroidx/compose/runtime/Composer;
    const v2, -0x38dffd5c

    const-string v3, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v15, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v2, 0x0

    .local v2, "invalid$iv$iv":Z
    move-object v3, v15

    .local v3, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v20, 0x0

    .line 399
    .local v20, "$i$f$cache":I
    move/from16 p9, v2

    .end local v2    # "invalid$iv$iv":Z
    .local p9, "invalid$iv$iv":Z
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .local v2, "it$iv$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 400
    .local v21, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    sget-object v22, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p10, v4

    .end local v4    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local p10, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_32

    .line 401
    const/4 v4, 0x0

    .line 398
    .local v4, "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    const/16 v22, 0x0

    .line 402
    .local v22, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v22, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 398
    .end local v22    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move-object/from16 p11, v2

    .end local v2    # "it$iv$iv":Ljava/lang/Object;
    .local p11, "it$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v22

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v2, v0}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    .line 401
    .end local v4    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    nop

    .line 403
    .local v2, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 404
    nop

    .end local v2    # "value$iv$iv":Ljava/lang/Object;
    goto :goto_24

    .line 405
    .end local p11    # "it$iv$iv":Ljava/lang/Object;
    .local v2, "it$iv$iv":Ljava/lang/Object;
    :cond_32
    move-object/from16 p11, v2

    .line 399
    .end local v2    # "it$iv$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    :goto_24
    nop

    .line 398
    .end local v3    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v20    # "$i$f$cache":I
    .end local p9    # "invalid$iv$iv":Z
    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 392
    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 398
    nop

    .line 89
    .end local v0    # "composer$iv":Landroidx/compose/runtime/Composer;
    .end local v6    # "$changed$iv":I
    .end local v16    # "$i$f$rememberCoroutineScope":I
    nop

    .line 90
    .local v2, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalGraphicsContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    .local v0, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v3, 0x0

    .local v3, "$changed$iv":I
    const/4 v4, 0x0

    .line 406
    .local v4, "$i$f$getCurrent":I
    const v6, 0x789c5f52

    move-object/from16 p9, v2

    .end local v2    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local p9, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    const-string v2, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v15, v6, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 90
    .end local v0    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v3    # "$changed$iv":I
    .end local v4    # "$i$f$getCurrent":I
    move-object v0, v2

    check-cast v0, Landroidx/compose/ui/graphics/GraphicsContext;

    .line 91
    .local v0, "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalScrollCaptureInProgress()Landroidx/compose/runtime/CompositionLocal;

    move-result-object v2

    .local v2, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v3, 0x0

    .restart local v3    # "$changed$iv":I
    const/4 v4, 0x0

    .line 407
    .restart local v4    # "$i$f$getCurrent":I
    move-object/from16 p11, v0

    .end local v0    # "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    .local p11, "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    const-string v0, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v15, v6, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 91
    .end local v2    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v3    # "$changed$iv":I
    .end local v4    # "$i$f$getCurrent":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 95
    .local v0, "stickyHeadersEnabled":Z
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
    nop

    .line 105
    nop

    .line 106
    nop

    .line 107
    if-eqz v0, :cond_33

    sget-object v2, Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;->Companion:Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;->getStickToTopPlacement()Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;

    move-result-object v2

    goto :goto_25

    :cond_33
    const/4 v2, 0x0

    :goto_25
    and-int/lit8 v3, v10, 0x70

    and-int/lit16 v4, v10, 0x380

    or-int/2addr v3, v4

    and-int/lit16 v4, v10, 0x1c00

    or-int/2addr v3, v4

    const v4, 0xe000

    and-int/2addr v4, v10

    or-int/2addr v3, v4

    shr-int/lit8 v4, v10, 0x9

    const/high16 v6, 0x70000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    const/high16 v4, 0x380000

    shr-int/lit8 v6, v10, 0x9

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v19, 0x12

    const/high16 v6, 0x1c00000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v19, 0x12

    const/high16 v6, 0xe000000

    and-int/2addr v4, v6

    or-int/2addr v3, v4

    shl-int/lit8 v4, v19, 0x1b

    const/high16 v6, 0x70000000

    and-int/2addr v4, v6

    or-int v16, v3, v4

    .line 94
    const/16 v17, 0x0

    move-object/from16 v3, p1

    move-object/from16 v13, p11

    move-object v14, v2

    move v6, v5

    move/from16 v20, v10

    move-object v4, v12

    move/from16 v5, p3

    move-object/from16 v10, p8

    move-object/from16 v12, p9

    move-object/from16 v2, p10

    .end local p8    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local p9    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local p10    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .end local p11    # "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    .local v2, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local v10, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v12, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v13, "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    .local v20, "$dirty":I
    invoke-static/range {v2 .. v17}, Landroidx/compose/foundation/lazy/LazyListKt;->rememberLazyListMeasurePolicy(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;

    move-result-object v14

    .line 93
    move v4, v5

    move-object/from16 v21, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    move-object v6, v15

    move-object v15, v3

    move v10, v7

    .line 110
    .end local v7    # "beyondBoundsItemCount":I
    .end local v8    # "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v9    # "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .end local v11    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v12    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local v13    # "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    .local v10, "beyondBoundsItemCount":I
    .local v14, "measurePolicy":Lkotlin/jvm/functions/Function2;
    .local v16, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v17, "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    .local v21, "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v22, "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v23, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v24, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    if-eqz p4, :cond_34

    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_26

    :cond_34
    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_26
    move-object v5, v3

    .line 113
    .local v5, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    if-eqz p6, :cond_35

    const v3, -0x5a30cd85

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "115@5166L165"

    invoke-static {v6, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 114
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 117
    nop

    .line 118
    shr-int/lit8 v7, v20, 0x3

    and-int/lit8 v7, v7, 0xe

    shr-int/lit8 v8, v20, 0x15

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v7, v8

    .line 116
    invoke-static {v15, v10, v6, v7}, Landroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt;->rememberLazyListBeyondBoundsState(Landroidx/compose/foundation/lazy/LazyListState;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;

    move-result-object v7

    .line 120
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/LazyListState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    move-result-object v8

    .line 121
    nop

    .line 122
    nop

    .line 114
    invoke-static {v3, v7, v8, v4, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt;->lazyLayoutBeyondBoundsModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 113
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_27

    .line 124
    :cond_35
    const v3, -0x5a2a49f0

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 125
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 113
    :goto_27
    nop

    .line 112
    move-object v11, v3

    .line 130
    .local v11, "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    nop

    .line 131
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/LazyListState;->getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/Modifier;

    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 132
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/LazyListState;->getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/Modifier;

    invoke-interface {v3, v7}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 134
    nop

    .line 135
    nop

    .line 136
    nop

    .line 137
    nop

    .line 138
    shr-int/lit8 v7, v20, 0x6

    const v8, 0xe000

    and-int/2addr v7, v8

    const/high16 v8, 0x70000

    shl-int/lit8 v9, v20, 0x6

    and-int/2addr v8, v9

    or-int v9, v7, v8

    .line 133
    move-object v7, v3

    move-object v3, v2

    move-object v2, v7

    move v7, v4

    move-object v8, v6

    move-object/from16 v4, v18

    move/from16 v6, p6

    .end local v2    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v18    # "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    .local v3, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local v4, "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v2 .. v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt;->lazyLayoutSemantics(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 140
    move-object/from16 v25, v3

    move-object/from16 v26, v4

    move-object v4, v5

    move-object/from16 v18, v8

    .end local v3    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .end local v5    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v4, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v18, "$composer":Landroidx/compose/runtime/Composer;
    .local v25, "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local v26, "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    invoke-interface {v2, v11}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 141
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/LazyListState;->getItemAnimator$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getModifier()Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 143
    move-object v3, v15

    check-cast v3, Landroidx/compose/foundation/gestures/ScrollableState;

    .line 144
    nop

    .line 145
    nop

    .line 146
    nop

    .line 147
    nop

    .line 148
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/LazyListState;->getInternalInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v8

    .line 149
    nop

    .line 150
    nop

    .line 142
    const/16 v12, 0x100

    const/4 v13, 0x0

    const/4 v9, 0x0

    move-object v5, v11

    .end local v11    # "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    .local v5, "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    const/4 v11, 0x0

    move/from16 v6, p3

    move-object/from16 v7, p5

    move-object/from16 v28, v5

    move/from16 v27, v10

    move/from16 v5, p6

    move-object/from16 v10, p7

    .end local v5    # "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    .end local v10    # "beyondBoundsItemCount":I
    .local v27, "beyondBoundsItemCount":I
    .local v28, "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    invoke-static/range {v2 .. v13}, Landroidx/compose/foundation/ScrollingContainerKt;->scrollingContainer$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 152
    move-object v9, v4

    .end local v4    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .local v9, "orientation":Landroidx/compose/foundation/gestures/Orientation;
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/LazyListState;->getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    move-result-object v4

    .line 154
    nop

    .line 142
    nop

    .line 152
    nop

    .line 153
    nop

    .line 128
    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v14

    move-object/from16 v6, v18

    move-object/from16 v2, v25

    .end local v14    # "measurePolicy":Lkotlin/jvm/functions/Function2;
    .end local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v25    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .restart local v2    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .local v5, "measurePolicy":Lkotlin/jvm/functions/Function2;
    .restart local v6    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt;->LazyLayout(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v18    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_36

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 156
    .end local v0    # "stickyHeadersEnabled":Z
    .end local v2    # "itemProviderLambda":Lkotlin/jvm/functions/Function0;
    .end local v5    # "measurePolicy":Lkotlin/jvm/functions/Function2;
    .end local v9    # "orientation":Landroidx/compose/foundation/gestures/Orientation;
    .end local v16    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local v17    # "graphicsContext":Landroidx/compose/ui/graphics/GraphicsContext;
    .end local v26    # "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    .end local v28    # "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    :cond_36
    move-object/from16 v10, v21

    move-object/from16 v12, v22

    move-object/from16 v13, v23

    move-object/from16 v11, v24

    move/from16 v9, v27

    goto :goto_28

    .end local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v19    # "$dirty1":I
    .end local v20    # "$dirty":I
    .end local v21    # "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v22    # "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .end local v23    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .end local v24    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v27    # "beyondBoundsItemCount":I
    .local v0, "$dirty1":I
    .local v10, "$dirty":I
    .restart local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .local p8, "beyondBoundsItemCount":I
    .local p9, "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local p10, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local p11, "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .restart local p12    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_37
    move/from16 v19, v0

    move/from16 v20, v10

    move-object/from16 v18, v15

    move-object v15, v2

    .end local v0    # "$dirty1":I
    .end local v10    # "$dirty":I
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v18    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v19    # "$dirty1":I
    .restart local v20    # "$dirty":I
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    .end local p8    # "beyondBoundsItemCount":I
    .end local p9    # "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .end local p10    # "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local p11    # "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .end local p12    # "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v9, "beyondBoundsItemCount":I
    .local v10, "horizontalAlignment":Landroidx/compose/ui/Alignment$Horizontal;
    .local v11, "verticalArrangement":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v12, "verticalAlignment":Landroidx/compose/ui/Alignment$Vertical;
    .local v13, "horizontalArrangement":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_28
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_38

    move-object v2, v0

    new-instance v0, Landroidx/compose/foundation/lazy/LazyListKt$LazyList$1;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v14, p13

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v29, v2

    move-object v2, v15

    move/from16 v15, p15

    invoke-direct/range {v0 .. v17}, Landroidx/compose/foundation/lazy/LazyListKt$LazyList$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;ILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v2, v29

    invoke-interface {v2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_38
    return-void
.end method

.method private static final rememberLazyListMeasurePolicy(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;
    .locals 23
    .param p0, "itemProviderLambda"    # Lkotlin/jvm/functions/Function0;
    .param p1, "state"    # Landroidx/compose/foundation/lazy/LazyListState;
    .param p2, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p3, "reverseLayout"    # Z
    .param p4, "isVertical"    # Z
    .param p5, "beyondBoundsItemCount"    # I
    .param p6, "horizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p7, "verticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p8, "horizontalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .param p9, "verticalArrangement"    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .param p10, "coroutineScope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p11, "graphicsContext"    # Landroidx/compose/ui/graphics/GraphicsContext;
    .param p12, "stickyItemsPlacement"    # Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;
    .param p13, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p14, "$changed"    # I
    .param p15, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "ZZI",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
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

    .line 188
    move-object/from16 v0, p13

    move/from16 v1, p14

    move/from16 v2, p15

    const v3, -0x2c106004

    const-string v4, "C(rememberLazyListMeasurePolicy)P(7,9,1,8,6!1,4,11,5,12)187@7988L9562:LazyList.kt#428nma"

    invoke-static {v0, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)"

    invoke-static {v3, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    const v3, 0x22a390ab

    const-string v4, "CC(remember):LazyList.kt#9igjgp"

    invoke-static {v0, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v3, v1, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    if-le v3, v4, :cond_1

    .line 189
    move-object/from16 v8, p1

    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 188
    :cond_1
    move-object/from16 v8, p1

    .line 189
    :goto_0
    and-int/lit8 v3, v1, 0x30

    if-ne v3, v4, :cond_3

    :cond_2
    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    and-int/lit16 v4, v1, 0x380

    xor-int/lit16 v4, v4, 0x180

    const/16 v7, 0x100

    if-le v4, v7, :cond_4

    .line 190
    move-object/from16 v10, p2

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    .line 189
    :cond_4
    move-object/from16 v10, p2

    .line 190
    :goto_2
    and-int/lit16 v4, v1, 0x180

    if-ne v4, v7, :cond_6

    :cond_5
    const/4 v4, 0x1

    goto :goto_3

    :cond_6
    const/4 v4, 0x0

    :goto_3
    or-int/2addr v3, v4

    and-int/lit16 v4, v1, 0x1c00

    xor-int/lit16 v4, v4, 0xc00

    const/16 v9, 0x800

    if-le v4, v9, :cond_7

    .line 191
    move/from16 v11, p3

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_4

    .line 190
    :cond_7
    move/from16 v11, p3

    .line 191
    :goto_4
    and-int/lit16 v4, v1, 0xc00

    if-ne v4, v9, :cond_9

    :cond_8
    const/4 v4, 0x1

    goto :goto_5

    :cond_9
    const/4 v4, 0x0

    :goto_5
    or-int/2addr v3, v4

    const v4, 0xe000

    and-int/2addr v4, v1

    xor-int/lit16 v4, v4, 0x6000

    const/16 v9, 0x4000

    if-le v4, v9, :cond_a

    .line 192
    move/from16 v4, p4

    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v12

    if-nez v12, :cond_b

    goto :goto_6

    .line 191
    :cond_a
    move/from16 v4, p4

    .line 192
    :goto_6
    and-int/lit16 v12, v1, 0x6000

    if-ne v12, v9, :cond_c

    :cond_b
    const/4 v9, 0x1

    goto :goto_7

    :cond_c
    const/4 v9, 0x0

    :goto_7
    or-int/2addr v3, v9

    const/high16 v9, 0x380000

    and-int/2addr v9, v1

    const/high16 v12, 0x180000

    xor-int/2addr v9, v12

    const/high16 v13, 0x100000

    if-le v9, v13, :cond_d

    .line 193
    move-object/from16 v9, p6

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_e

    goto :goto_8

    .line 192
    :cond_d
    move-object/from16 v9, p6

    .line 193
    :goto_8
    and-int/2addr v12, v1

    if-ne v12, v13, :cond_f

    :cond_e
    const/4 v12, 0x1

    goto :goto_9

    :cond_f
    const/4 v12, 0x0

    :goto_9
    or-int/2addr v3, v12

    const/high16 v12, 0x1c00000

    and-int/2addr v12, v1

    const/high16 v13, 0xc00000

    xor-int/2addr v12, v13

    const/high16 v14, 0x800000

    if-le v12, v14, :cond_10

    .line 194
    move-object/from16 v12, p7

    invoke-interface {v0, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_11

    goto :goto_a

    .line 193
    :cond_10
    move-object/from16 v12, p7

    .line 194
    :goto_a
    and-int/2addr v13, v1

    if-ne v13, v14, :cond_12

    :cond_11
    const/4 v13, 0x1

    goto :goto_b

    :cond_12
    const/4 v13, 0x0

    :goto_b
    or-int/2addr v3, v13

    const/high16 v13, 0xe000000

    and-int/2addr v13, v1

    const/high16 v14, 0x6000000

    xor-int/2addr v13, v14

    const/high16 v15, 0x4000000

    if-le v13, v15, :cond_13

    .line 195
    move-object/from16 v13, p8

    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_14

    goto :goto_c

    .line 194
    :cond_13
    move-object/from16 v13, p8

    .line 195
    :goto_c
    and-int/2addr v14, v1

    if-ne v14, v15, :cond_15

    :cond_14
    const/4 v14, 0x1

    goto :goto_d

    :cond_15
    const/4 v14, 0x0

    :goto_d
    or-int/2addr v3, v14

    const/high16 v14, 0x70000000

    and-int/2addr v14, v1

    const/high16 v15, 0x30000000

    xor-int/2addr v14, v15

    const/high16 v5, 0x20000000

    if-le v14, v5, :cond_16

    .line 196
    move-object/from16 v14, p9

    invoke-interface {v0, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_17

    goto :goto_e

    .line 195
    :cond_16
    move-object/from16 v14, p9

    .line 196
    :goto_e
    and-int/2addr v15, v1

    if-ne v15, v5, :cond_18

    :cond_17
    const/4 v5, 0x1

    goto :goto_f

    :cond_18
    const/4 v5, 0x0

    :goto_f
    or-int/2addr v3, v5

    .line 197
    move-object/from16 v5, p11

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v3, v15

    and-int/lit16 v15, v2, 0x380

    xor-int/lit16 v15, v15, 0x180

    if-le v15, v7, :cond_19

    .line 198
    move-object/from16 v15, p12

    invoke-interface {v0, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_1a

    goto :goto_10

    .line 197
    :cond_19
    move-object/from16 v15, p12

    .line 198
    :goto_10
    and-int/lit16 v6, v2, 0x180

    if-ne v6, v7, :cond_1b

    :cond_1a
    const/16 v16, 0x1

    goto :goto_11

    :cond_1b
    const/16 v16, 0x0

    :goto_11
    or-int v3, v3, v16

    .line 188
    nop

    .local v3, "invalid$iv":Z
    move-object/from16 v6, p13

    .local v6, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .line 408
    .local v21, "$i$f$cache":I
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 409
    .local v22, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_1d

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v7, v0, :cond_1c

    goto :goto_12

    .line 413
    :cond_1c
    goto :goto_13

    .line 410
    :cond_1d
    :goto_12
    const/4 v0, 0x0

    .line 200
    .local v0, "$i$a$-cache-LazyListKt$rememberLazyListMeasurePolicy$1":I
    move-object/from16 v16, v7

    .end local v7    # "it$iv":Ljava/lang/Object;
    .local v16, "it$iv":Ljava/lang/Object;
    new-instance v7, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;

    move-object/from16 v17, v14

    move-object v14, v13

    move-object/from16 v13, v17

    move-object/from16 v17, v5

    move-object/from16 v19, v9

    move-object/from16 v20, v12

    move-object/from16 v18, v15

    move-object/from16 v12, p0

    move/from16 v15, p5

    move v9, v4

    move-object/from16 v4, v16

    move-object/from16 v16, p10

    .end local v16    # "it$iv":Ljava/lang/Object;
    .local v4, "it$iv":Ljava/lang/Object;
    invoke-direct/range {v7 .. v20}, Landroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1;-><init>(Landroidx/compose/foundation/lazy/LazyListState;ZLandroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 389
    nop

    .line 410
    .end local v0    # "$i$a$-cache-LazyListKt$rememberLazyListMeasurePolicy$1":I
    nop

    .line 411
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 412
    nop

    .line 408
    .end local v4    # "it$iv":Ljava/lang/Object;
    .end local v7    # "value$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_13
    nop

    .line 188
    .end local v3    # "invalid$iv":Z
    .end local v6    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v21    # "$i$f$cache":I
    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p13 .. p13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1e
    invoke-static/range {p13 .. p13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object v7
.end method
