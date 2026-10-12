.class public final Landroidx/compose/foundation/pager/LazyLayoutPagerKt;
.super Ljava/lang/Object;
.source "LazyLayoutPager.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,411:1\n113#2:412\n96#3,5:413\n1247#4,6:418\n1247#4,3:431\n1250#4,3:435\n1247#4,6:438\n1247#4,6:444\n1247#4,6:451\n1247#4,6:457\n557#5:424\n554#5,6:425\n555#6:434\n75#7:450\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n*L\n89#1:412\n105#1:413,5\n111#1:418,6\n115#1:431,3\n115#1:435,3\n131#1:438,6\n137#1:444,6\n141#1:451,6\n263#1:457,6\n115#1:424\n115#1:425,6\n115#1:434\n139#1:450\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u00e8\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0008(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$21\u0010%\u001a-\u0012\u0004\u0012\u00020\'\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0008((\u0012\u0004\u0012\u00020\u00010&\u00a2\u0006\u0002\u0008)\u00a2\u0006\u0002\u0008*H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,\u001a\u0081\u0001\u0010-\u001a\u0008\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u0004\u001a\u00020\u000521\u0010%\u001a-\u0012\u0004\u0012\u00020\'\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0008((\u0012\u0004\u0012\u00020\u00010&\u00a2\u0006\u0002\u0008)\u00a2\u0006\u0002\u0008*2#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0008(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00120.H\u0003\u00a2\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00063"
    }
    d2 = {
        "Pager",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "state",
        "Landroidx/compose/foundation/pager/PagerState;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "reverseLayout",
        "",
        "orientation",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "flingBehavior",
        "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;",
        "userScrollEnabled",
        "overscrollEffect",
        "Landroidx/compose/foundation/OverscrollEffect;",
        "beyondViewportPageCount",
        "",
        "pageSpacing",
        "Landroidx/compose/ui/unit/Dp;",
        "pageSize",
        "Landroidx/compose/foundation/pager/PageSize;",
        "pageNestedScrollConnection",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "key",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "index",
        "",
        "horizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "verticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "snapPosition",
        "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
        "pageContent",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/pager/PagerScope;",
        "page",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "Pager-eLwUrMk",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V",
        "rememberPagerItemProviderLambda",
        "Lkotlin/Function0;",
        "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
        "pageCount",
        "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;",
        "dragDirectionDetector",
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
.method public static final Pager-eLwUrMk(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V
    .locals 28
    .param p0, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p1, "state"    # Landroidx/compose/foundation/pager/PagerState;
    .param p2, "contentPadding"    # Landroidx/compose/foundation/layout/PaddingValues;
    .param p3, "reverseLayout"    # Z
    .param p4, "orientation"    # Landroidx/compose/foundation/gestures/Orientation;
    .param p5, "flingBehavior"    # Landroidx/compose/foundation/gestures/TargetedFlingBehavior;
    .param p6, "userScrollEnabled"    # Z
    .param p7, "overscrollEffect"    # Landroidx/compose/foundation/OverscrollEffect;
    .param p8, "beyondViewportPageCount"    # I
    .param p9, "pageSpacing"    # F
    .param p10, "pageSize"    # Landroidx/compose/foundation/pager/PageSize;
    .param p11, "pageNestedScrollConnection"    # Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .param p12, "key"    # Lkotlin/jvm/functions/Function1;
    .param p13, "horizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p14, "verticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p15, "snapPosition"    # Landroidx/compose/foundation/gestures/snapping/SnapPosition;
    .param p16, "pageContent"    # Lkotlin/jvm/functions/Function4;
    .param p17, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p18, "$changed"    # I
    .param p19, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "IF",
            "Landroidx/compose/foundation/pager/PageSize;",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/pager/PagerScope;",
            "-",
            "Ljava/lang/Integer;",
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

    .line 104
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    move-object/from16 v11, p11

    move/from16 v12, p18

    move/from16 v13, p19

    move/from16 v14, p20

    const v3, 0x43111c3a    # 145.11026f

    move-object/from16 v4, p17

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    .end local p17    # "$composer":Landroidx/compose/runtime/Composer;
    .local v15, "$composer":Landroidx/compose/runtime/Composer;
    const-string v3, "C(Pager)P(5,14,1,12,6,2,15,7!1,11:c#ui.unit.Dp,10,9,4!1,16,13)110@5371L39,110@5286L124,114@5437L24,130@6080L19,117@5495L614,133@6135L70,136@6247L82,138@6389L7,140@6438L121,165@7275L301,160@7106L1506:LazyLayoutPager.kt#g6yjnt"

    invoke-static {v15, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p18

    .local v3, "$dirty":I
    move/from16 v4, p19

    .local v4, "$dirty1":I
    and-int/lit8 v5, v14, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v3, v3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v12, 0x6

    if-nez v5, :cond_2

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v3, v5

    :cond_2
    :goto_1
    and-int/lit8 v5, v14, 0x2

    const/16 v16, 0x10

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_5

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    move/from16 v5, v16

    :goto_2
    or-int/2addr v3, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, v14, 0x4

    const/16 v17, 0x100

    const/16 v18, 0x80

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v12, 0x180

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_7

    move/from16 v19, v17

    goto :goto_4

    :cond_7
    move/from16 v19, v18

    :goto_4
    or-int v3, v3, v19

    goto :goto_5

    :cond_8
    move-object/from16 v5, p2

    :goto_5
    and-int/lit8 v19, v14, 0x8

    const/16 v20, 0x800

    const/16 v21, 0x400

    if-eqz v19, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v6, v12, 0xc00

    if-nez v6, :cond_b

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    move/from16 v6, v20

    goto :goto_6

    :cond_a
    move/from16 v6, v21

    :goto_6
    or-int/2addr v3, v6

    :cond_b
    :goto_7
    and-int/lit8 v6, v14, 0x10

    if-eqz v6, :cond_c

    or-int/lit16 v3, v3, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v6, v12, 0x6000

    if-nez v6, :cond_e

    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    const/16 v6, 0x4000

    goto :goto_8

    :cond_d
    const/16 v6, 0x2000

    :goto_8
    or-int/2addr v3, v6

    :cond_e
    :goto_9
    and-int/lit8 v6, v14, 0x20

    const/high16 v19, 0x30000

    if-eqz v6, :cond_f

    or-int v3, v3, v19

    goto :goto_b

    :cond_f
    and-int v6, v12, v19

    if-nez v6, :cond_11

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    const/high16 v6, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v6, 0x10000

    :goto_a
    or-int/2addr v3, v6

    :cond_11
    :goto_b
    and-int/lit8 v6, v14, 0x40

    const/high16 v22, 0x180000

    if-eqz v6, :cond_12

    or-int v3, v3, v22

    goto :goto_d

    :cond_12
    and-int v6, v12, v22

    if-nez v6, :cond_14

    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_13

    const/high16 v6, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v6, 0x80000

    :goto_c
    or-int/2addr v3, v6

    :cond_14
    :goto_d
    and-int/lit16 v6, v14, 0x80

    if-eqz v6, :cond_15

    const/high16 v6, 0xc00000

    or-int/2addr v3, v6

    move-object/from16 v6, p7

    goto :goto_f

    :cond_15
    const/high16 v6, 0xc00000

    and-int/2addr v6, v12

    if-nez v6, :cond_17

    move-object/from16 v6, p7

    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_16

    const/high16 v23, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v23, 0x400000

    :goto_e
    or-int v3, v3, v23

    goto :goto_f

    :cond_17
    move-object/from16 v6, p7

    :goto_f
    and-int/lit16 v7, v14, 0x100

    const/high16 v24, 0x6000000

    if-eqz v7, :cond_18

    or-int v3, v3, v24

    move/from16 v1, p8

    goto :goto_11

    :cond_18
    and-int v24, v12, v24

    if-nez v24, :cond_1a

    move/from16 v1, p8

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v25

    if-eqz v25, :cond_19

    const/high16 v25, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v25, 0x2000000

    :goto_10
    or-int v3, v3, v25

    goto :goto_11

    :cond_1a
    move/from16 v1, p8

    :goto_11
    and-int/lit16 v0, v14, 0x200

    const/high16 v25, 0x30000000

    if-eqz v0, :cond_1b

    or-int v3, v3, v25

    move/from16 v25, v0

    move/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v25, v12, v25

    if-nez v25, :cond_1d

    move/from16 v25, v0

    move/from16 v0, p9

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v26

    if-eqz v26, :cond_1c

    const/high16 v26, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v26, 0x10000000

    :goto_12
    or-int v3, v3, v26

    goto :goto_13

    :cond_1d
    move/from16 v25, v0

    move/from16 v0, p9

    :goto_13
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v4, v4, 0x6

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v0, v13, 0x6

    if-nez v0, :cond_20

    move-object/from16 v0, p10

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1f

    const/16 v26, 0x4

    goto :goto_14

    :cond_1f
    const/16 v26, 0x2

    :goto_14
    or-int v4, v4, v26

    goto :goto_15

    :cond_20
    move-object/from16 v0, p10

    :goto_15
    and-int/lit16 v0, v14, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v4, v4, 0x30

    goto :goto_16

    :cond_21
    and-int/lit8 v0, v13, 0x30

    if-nez v0, :cond_23

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    const/16 v16, 0x20

    :cond_22
    or-int v4, v4, v16

    :cond_23
    :goto_16
    and-int/lit16 v0, v14, 0x1000

    if-eqz v0, :cond_24

    or-int/lit16 v4, v4, 0x180

    move-object/from16 v0, p12

    goto :goto_18

    :cond_24
    and-int/lit16 v0, v13, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p12

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_25

    goto :goto_17

    :cond_25
    move/from16 v17, v18

    :goto_17
    or-int v4, v4, v17

    goto :goto_18

    :cond_26
    move-object/from16 v0, p12

    :goto_18
    and-int/lit16 v0, v14, 0x2000

    if-eqz v0, :cond_27

    or-int/lit16 v4, v4, 0xc00

    move-object/from16 v0, p13

    goto :goto_1a

    :cond_27
    and-int/lit16 v0, v13, 0xc00

    if-nez v0, :cond_29

    move-object/from16 v0, p13

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_28

    goto :goto_19

    :cond_28
    move/from16 v20, v21

    :goto_19
    or-int v4, v4, v20

    goto :goto_1a

    :cond_29
    move-object/from16 v0, p13

    :goto_1a
    and-int/lit16 v0, v14, 0x4000

    if-eqz v0, :cond_2a

    or-int/lit16 v4, v4, 0x6000

    move-object/from16 v0, p14

    goto :goto_1c

    :cond_2a
    and-int/lit16 v0, v13, 0x6000

    if-nez v0, :cond_2c

    move-object/from16 v0, p14

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2b

    const/16 v16, 0x4000

    goto :goto_1b

    :cond_2b
    const/16 v16, 0x2000

    :goto_1b
    or-int v4, v4, v16

    goto :goto_1c

    :cond_2c
    move-object/from16 v0, p14

    :goto_1c
    const v16, 0x8000

    and-int v16, v14, v16

    if-eqz v16, :cond_2d

    or-int v4, v4, v19

    move-object/from16 v0, p15

    goto :goto_1e

    :cond_2d
    and-int v16, v13, v19

    if-nez v16, :cond_2f

    move-object/from16 v0, p15

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2e

    const/high16 v16, 0x20000

    goto :goto_1d

    :cond_2e
    const/high16 v16, 0x10000

    :goto_1d
    or-int v4, v4, v16

    goto :goto_1e

    :cond_2f
    move-object/from16 v0, p15

    :goto_1e
    const/high16 v16, 0x10000

    and-int v16, v14, v16

    if-eqz v16, :cond_30

    or-int v4, v4, v22

    move-object/from16 v0, p16

    goto :goto_20

    :cond_30
    and-int v16, v13, v22

    if-nez v16, :cond_32

    move-object/from16 v0, p16

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_31

    const/high16 v16, 0x100000

    goto :goto_1f

    :cond_31
    const/high16 v16, 0x80000

    :goto_1f
    or-int v4, v4, v16

    goto :goto_20

    :cond_32
    move-object/from16 v0, p16

    :goto_20
    const v16, 0x12492493

    and-int v0, v3, v16

    const v1, 0x12492492

    const/16 v18, 0x0

    const/16 v19, 0x1

    if-ne v0, v1, :cond_34

    const v0, 0x92493

    and-int/2addr v0, v4

    const v1, 0x92492

    if-eq v0, v1, :cond_33

    goto :goto_21

    :cond_33
    move/from16 v0, v18

    goto :goto_22

    :cond_34
    :goto_21
    move/from16 v0, v19

    :goto_22
    and-int/lit8 v1, v3, 0x1

    invoke-interface {v15, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_4c

    if-eqz v7, :cond_35

    .line 87
    const/4 v0, 0x0

    .end local p8    # "beyondViewportPageCount":I
    .local v0, "beyondViewportPageCount":I
    goto :goto_23

    .line 104
    .end local v0    # "beyondViewportPageCount":I
    .restart local p8    # "beyondViewportPageCount":I
    :cond_35
    move/from16 v0, p8

    .line 87
    .end local p8    # "beyondViewportPageCount":I
    .restart local v0    # "beyondViewportPageCount":I
    :goto_23
    if-eqz v25, :cond_36

    .line 89
    const/4 v1, 0x0

    .local v1, "$this$dp$iv":I
    const/4 v7, 0x0

    .line 412
    .local v7, "$i$f$getDp":I
    int-to-float v5, v1

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    move v8, v1

    .end local v7    # "$i$f$getDp":I
    .end local p9    # "pageSpacing":F
    .local v1, "pageSpacing":F
    goto :goto_24

    .line 87
    .end local v1    # "pageSpacing":F
    .restart local p9    # "pageSpacing":F
    :cond_36
    move/from16 v8, p9

    .line 412
    .end local p9    # "pageSpacing":F
    .local v8, "pageSpacing":F
    :goto_24
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_37

    .line 104
    const v1, 0x43111c3a    # 145.11026f

    const-string v5, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:103)"

    invoke-static {v1, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 105
    :cond_37
    if-ltz v0, :cond_38

    move/from16 v1, v19

    goto :goto_25

    :cond_38
    move/from16 v1, v18

    .local v1, "value$iv":Z
    :goto_25
    const/4 v5, 0x0

    .line 413
    .local v5, "$i$f$requirePrecondition":I
    nop

    .line 414
    if-nez v1, :cond_39

    .line 415
    const/4 v7, 0x0

    .line 106
    .local v7, "$i$a$-requirePrecondition-LazyLayoutPagerKt$Pager$1":I
    move/from16 p8, v1

    .end local v1    # "value$iv":Z
    .local p8, "value$iv":Z
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 p17, v3

    .end local v3    # "$dirty":I
    .local p17, "$dirty":I
    const-string v3, "beyondViewportPageCount should be greater than or equal to 0, you selected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 107
    nop

    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 107
    nop

    .line 415
    .end local v7    # "$i$a$-requirePrecondition-LazyLayoutPagerKt$Pager$1":I
    invoke-static {v1}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    goto :goto_26

    .line 414
    .end local p8    # "value$iv":Z
    .end local p17    # "$dirty":I
    .restart local v1    # "value$iv":Z
    .restart local v3    # "$dirty":I
    :cond_39
    move/from16 p8, v1

    move/from16 p17, v3

    .line 417
    .end local v1    # "value$iv":Z
    .end local v3    # "$dirty":I
    .restart local p8    # "value$iv":Z
    .restart local p17    # "$dirty":I
    :goto_26
    nop

    .line 111
    .end local v5    # "$i$f$requirePrecondition":I
    .end local p8    # "value$iv":Z
    const v1, 0x6f12d785

    const-string v3, "CC(remember):LazyLayoutPager.kt#9igjgp"

    invoke-static {v15, v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p17, 0x70

    const/16 v5, 0x20

    if-ne v1, v5, :cond_3a

    move/from16 v1, v19

    goto :goto_27

    :cond_3a
    move/from16 v1, v18

    .local v1, "invalid$iv":Z
    :goto_27
    move-object v5, v15

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 418
    .local v7, "$i$f$cache":I
    move/from16 p8, v0

    .end local v0    # "beyondViewportPageCount":I
    .local p8, "beyondViewportPageCount":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 419
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v1, :cond_3c

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p9, v1

    .end local v1    # "invalid$iv":Z
    .local p9, "invalid$iv":Z
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3b

    goto :goto_28

    .line 423
    :cond_3b
    goto :goto_29

    .line 419
    .end local p9    # "invalid$iv":Z
    .restart local v1    # "invalid$iv":Z
    :cond_3c
    move/from16 p9, v1

    .line 420
    .end local v1    # "invalid$iv":Z
    .restart local p9    # "invalid$iv":Z
    :goto_28
    const/4 v1, 0x0

    .line 111
    .local v1, "$i$a$-cache-LazyLayoutPagerKt$Pager$pagerItemProvider$1":I
    move-object/from16 v17, v0

    .end local v0    # "it$iv":Ljava/lang/Object;
    .local v17, "it$iv":Ljava/lang/Object;
    new-instance v0, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$pagerItemProvider$1$1;

    invoke-direct {v0, v2}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$pagerItemProvider$1$1;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 420
    .end local v1    # "$i$a$-cache-LazyLayoutPagerKt$Pager$pagerItemProvider$1":I
    nop

    .line 421
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 422
    nop

    .line 418
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v17    # "it$iv":Ljava/lang/Object;
    :goto_29
    nop

    .line 111
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    .end local p9    # "invalid$iv":Z
    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    shr-int/lit8 v0, p17, 0x3

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v1, v4, 0xf

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, v4, 0x380

    or-int v7, v0, v1

    move/from16 v0, p17

    move-object v1, v3

    move/from16 v21, v4

    move-object v6, v15

    const/16 v23, 0x2

    move-object/from16 v4, p12

    move-object/from16 v3, p16

    .end local v4    # "$dirty1":I
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p17    # "$dirty":I
    .local v0, "$dirty":I
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "$dirty1":I
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt;->rememberPagerItemProviderLambda(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;

    move-result-object v5

    .line 110
    .end local v6    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v15    # "$composer":Landroidx/compose/runtime/Composer;
    move-object v3, v5

    .line 115
    .local v3, "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    move/from16 v4, v18

    .local v4, "$changed$iv":I
    const/4 v5, 0x0

    .line 424
    .local v5, "$i$f$rememberCoroutineScope":I
    const v6, 0x2e20b340

    const-string v7, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp"

    invoke-static {v15, v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 425
    nop

    .line 429
    move-object v6, v15

    .line 430
    .local v6, "composer$iv":Landroidx/compose/runtime/Composer;
    const v7, -0x38dffd5c

    move-object/from16 p9, v3

    .end local v3    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .local p9, "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    const-string v3, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v15, v7, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .local v3, "invalid$iv$iv":Z
    move-object v7, v15

    .local v7, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/16 v16, 0x0

    .line 431
    .local v16, "$i$f$cache":I
    move/from16 p17, v3

    .end local v3    # "invalid$iv$iv":Z
    .local p17, "invalid$iv$iv":Z
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 432
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v22, v4

    .end local v4    # "$changed$iv":I
    .local v22, "$changed$iv":I
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_3d

    .line 433
    const/4 v4, 0x0

    .line 430
    .local v4, "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    const/16 v20, 0x0

    .line 434
    .local v20, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v20, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 430
    .end local v20    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move-object/from16 v25, v3

    .end local v3    # "it$iv$iv":Ljava/lang/Object;
    .local v25, "it$iv$iv":Ljava/lang/Object;
    move-object/from16 v3, v20

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v3, v6}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    .line 433
    .end local v4    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    nop

    .line 435
    .local v3, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 436
    nop

    .end local v3    # "value$iv$iv":Ljava/lang/Object;
    goto :goto_2a

    .line 437
    .end local v25    # "it$iv$iv":Ljava/lang/Object;
    .local v3, "it$iv$iv":Ljava/lang/Object;
    :cond_3d
    move-object/from16 v25, v3

    .line 431
    .end local v3    # "it$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    :goto_2a
    nop

    .line 430
    .end local v7    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v16    # "$i$f$cache":I
    .end local p17    # "invalid$iv$iv":Z
    check-cast v3, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 424
    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 430
    nop

    .line 115
    .end local v5    # "$i$f$rememberCoroutineScope":I
    .end local v6    # "composer$iv":Landroidx/compose/runtime/Composer;
    .end local v22    # "$changed$iv":I
    nop

    .line 128
    .local v3, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    nop

    .line 119
    nop

    .line 120
    nop

    .line 121
    nop

    .line 122
    nop

    .line 123
    nop

    .line 124
    nop

    .line 125
    nop

    .line 126
    nop

    .line 127
    nop

    .line 129
    nop

    .line 130
    nop

    .line 131
    const v4, 0x6f133011

    invoke-static {v15, v4, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v4, v0, 0x70

    const/16 v5, 0x20

    if-ne v4, v5, :cond_3e

    move/from16 v4, v19

    goto :goto_2b

    :cond_3e
    move/from16 v4, v18

    .local v4, "invalid$iv":Z
    :goto_2b
    move-object v5, v15

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 438
    .local v6, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 439
    .local v16, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v4, :cond_40

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p17, v3

    .end local v3    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local p17, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_3f

    goto :goto_2c

    .line 443
    :cond_3f
    goto :goto_2d

    .line 439
    .end local p17    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .restart local v3    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    :cond_40
    move-object/from16 p17, v3

    .line 440
    .end local v3    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .restart local p17    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    :goto_2c
    const/4 v3, 0x0

    .line 131
    .local v3, "$i$a$-cache-LazyLayoutPagerKt$Pager$measurePolicy$1":I
    move/from16 v17, v3

    .end local v3    # "$i$a$-cache-LazyLayoutPagerKt$Pager$measurePolicy$1":I
    .local v17, "$i$a$-cache-LazyLayoutPagerKt$Pager$measurePolicy$1":I
    new-instance v3, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$measurePolicy$1$1;

    invoke-direct {v3, v2}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$measurePolicy$1$1;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 440
    .end local v17    # "$i$a$-cache-LazyLayoutPagerKt$Pager$measurePolicy$1":I
    nop

    .line 441
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 442
    move-object v7, v3

    .line 438
    .end local v3    # "value$iv":Ljava/lang/Object;
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_2d
    nop

    .line 131
    .end local v4    # "invalid$iv":Z
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache":I
    check-cast v7, Lkotlin/jvm/functions/Function0;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit8 v3, v0, 0x70

    and-int/lit16 v4, v0, 0x380

    or-int/2addr v3, v4

    and-int/lit16 v4, v0, 0x1c00

    or-int/2addr v3, v4

    const v4, 0xe000

    and-int/2addr v4, v0

    or-int/2addr v3, v4

    shr-int/lit8 v4, v0, 0x9

    const/high16 v5, 0x70000

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    shr-int/lit8 v4, v0, 0x9

    const/high16 v5, 0x380000

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    shl-int/lit8 v4, v21, 0x15

    const/high16 v5, 0x1c00000

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    shl-int/lit8 v4, v21, 0xf

    const/high16 v5, 0xe000000

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    shl-int/lit8 v4, v21, 0xf

    const/high16 v5, 0x70000000

    and-int/2addr v4, v5

    or-int v16, v3, v4

    shr-int/lit8 v3, v21, 0xf

    and-int/lit8 v17, v3, 0xe

    .line 118
    move-object/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v10, p13

    move-object/from16 v11, p14

    move-object/from16 v12, p15

    move-object/from16 v13, p17

    move/from16 v20, v0

    move-object v3, v2

    move-object v14, v7

    move-object v0, v9

    move/from16 v7, p8

    move-object/from16 v2, p9

    move-object/from16 v9, p10

    .end local v0    # "$dirty":I
    .end local p8    # "beyondViewportPageCount":I
    .end local p9    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .end local p17    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v2, "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .local v7, "beyondViewportPageCount":I
    .local v13, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v20, "$dirty":I
    invoke-static/range {v2 .. v17}, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt;->rememberPagerMeasurePolicy-8u0NR3k(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;

    move-result-object v14

    .line 117
    move-object v12, v3

    move v4, v5

    move-object v5, v6

    move/from16 v16, v8

    move-object v10, v13

    move v13, v7

    .line 134
    .end local v7    # "beyondViewportPageCount":I
    .end local v8    # "pageSpacing":F
    .local v10, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v13, "beyondViewportPageCount":I
    .local v14, "measurePolicy":Lkotlin/jvm/functions/Function2;
    .local v16, "pageSpacing":F
    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v5, v3, :cond_41

    move/from16 v3, v19

    goto :goto_2e

    :cond_41
    move/from16 v3, v18

    :goto_2e
    shr-int/lit8 v6, v20, 0x3

    and-int/lit8 v6, v6, 0xe

    invoke-static {v12, v3, v15, v6}, Landroidx/compose/foundation/pager/PagerSemanticsKt;->rememberPagerSemanticState(Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    move-result-object v3

    .line 137
    .local v3, "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    const v6, 0x6f134530

    invoke-static {v15, v6, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v6, v20, 0x70

    const/16 v7, 0x20

    if-ne v6, v7, :cond_42

    move/from16 v6, v19

    goto :goto_2f

    :cond_42
    move/from16 v6, v18

    :goto_2f
    const/high16 v7, 0x70000

    and-int v7, v20, v7

    const/high16 v8, 0x20000

    if-ne v7, v8, :cond_43

    move/from16 v7, v19

    goto :goto_30

    :cond_43
    move/from16 v7, v18

    :goto_30
    or-int/2addr v6, v7

    .local v6, "invalid$iv":Z
    move-object v7, v15

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 444
    .local v8, "$i$f$cache":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 445
    .local v11, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v6, :cond_45

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p9, v2

    .end local v2    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .restart local p9    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v9, v2, :cond_44

    goto :goto_31

    .line 449
    :cond_44
    goto :goto_32

    .line 445
    .end local p9    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .restart local v2    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    :cond_45
    move-object/from16 p9, v2

    .line 446
    .end local v2    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .restart local p9    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    :goto_31
    const/4 v2, 0x0

    .line 137
    .local v2, "$i$a$-cache-LazyLayoutPagerKt$Pager$resolvedFlingBehavior$1":I
    move/from16 p8, v2

    .end local v2    # "$i$a$-cache-LazyLayoutPagerKt$Pager$resolvedFlingBehavior$1":I
    .local p8, "$i$a$-cache-LazyLayoutPagerKt$Pager$resolvedFlingBehavior$1":I
    new-instance v2, Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;

    invoke-direct {v2, v0, v12}, Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;-><init>(Landroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/pager/PagerState;)V

    .line 446
    .end local p8    # "$i$a$-cache-LazyLayoutPagerKt$Pager$resolvedFlingBehavior$1":I
    nop

    .line 447
    .local v2, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 448
    move-object v9, v2

    .line 444
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_32
    nop

    .line 137
    .end local v6    # "invalid$iv":Z
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$cache":I
    check-cast v9, Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 136
    move-object/from16 v17, v9

    .line 139
    .local v17, "resolvedFlingBehavior":Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;
    invoke-static {}, Landroidx/compose/foundation/gestures/BringIntoViewSpec_androidKt;->getLocalBringIntoViewSpec()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/CompositionLocal;

    .local v2, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v6, 0x6

    .local v6, "$changed$iv":I
    const/4 v7, 0x0

    .line 450
    .local v7, "$i$f$getCurrent":I
    const v8, 0x789c5f52

    const-string v9, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v15, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 139
    .end local v2    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v6    # "$changed$iv":I
    .end local v7    # "$i$f$getCurrent":I
    move-object v11, v8

    check-cast v11, Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    .line 141
    .local v11, "defaultBringIntoViewSpec":Landroidx/compose/foundation/gestures/BringIntoViewSpec;
    const v2, 0x6f135d37

    invoke-static {v15, v2, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, v20, 0x70

    const/16 v7, 0x20

    if-ne v1, v7, :cond_46

    move/from16 v1, v19

    goto :goto_33

    :cond_46
    move/from16 v1, v18

    :goto_33
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid$iv":Z
    move-object v2, v15

    .local v2, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v6, 0x0

    .line 451
    .local v6, "$i$f$cache":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 452
    .local v8, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v1, :cond_48

    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_47

    goto :goto_34

    .line 456
    :cond_47
    goto :goto_35

    .line 453
    :cond_48
    :goto_34
    const/4 v9, 0x0

    .line 142
    .local v9, "$i$a$-cache-LazyLayoutPagerKt$Pager$pagerBringIntoViewSpec$1":I
    new-instance v0, Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;

    invoke-direct {v0, v12, v11}, Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;-><init>(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V

    .line 453
    .end local v9    # "$i$a$-cache-LazyLayoutPagerKt$Pager$pagerBringIntoViewSpec$1":I
    nop

    .line 454
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 455
    move-object v7, v0

    .line 451
    .end local v0    # "value$iv":Ljava/lang/Object;
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_35
    nop

    .line 141
    .end local v1    # "invalid$iv":Z
    .end local v2    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v6    # "$i$f$cache":I
    check-cast v7, Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;

    invoke-static {v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 140
    move-object v0, v7

    .line 146
    .local v0, "pagerBringIntoViewSpec":Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;
    if-eqz p6, :cond_49

    const v1, 0x735b3d0d

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "148@6722L166"

    invoke-static {v15, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 147
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 150
    nop

    .line 151
    shr-int/lit8 v2, v20, 0x3

    and-int/lit8 v2, v2, 0xe

    shr-int/lit8 v6, v20, 0x15

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v2, v6

    .line 149
    invoke-static {v12, v13, v15, v2}, Landroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt;->rememberPagerBeyondBoundsState(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;

    move-result-object v2

    .line 153
    invoke-virtual {v12}, Landroidx/compose/foundation/pager/PagerState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    move-result-object v6

    .line 154
    nop

    .line 155
    nop

    .line 147
    invoke-static {v1, v2, v6, v4, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt;->lazyLayoutBeyondBoundsModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 146
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_36

    .line 157
    :cond_49
    const v1, 0x7361c824

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 158
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 146
    :goto_36
    nop

    .line 145
    nop

    .line 163
    .local v1, "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    nop

    .line 164
    invoke-virtual {v12}, Landroidx/compose/foundation/pager/PagerState;->getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object/from16 v6, p0

    invoke-interface {v6, v2}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 165
    invoke-virtual {v12}, Landroidx/compose/foundation/pager/PagerState;->getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/Modifier;

    invoke-interface {v2, v7}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 167
    nop

    .line 168
    nop

    .line 169
    nop

    .line 170
    nop

    .line 171
    shr-int/lit8 v7, v20, 0x3

    and-int/lit16 v7, v7, 0x1c00

    shr-int/lit8 v8, v20, 0x6

    const v9, 0xe000

    and-int/2addr v8, v9

    or-int/2addr v7, v8

    const/high16 v8, 0x70000

    shl-int/lit8 v9, v20, 0x6

    and-int/2addr v8, v9

    or-int v9, v7, v8

    .line 166
    move/from16 v6, p6

    move v7, v4

    move-object v8, v15

    move-object v4, v3

    move-object/from16 v3, p9

    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .end local p9    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .local v3, "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .local v4, "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    .local v8, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v2 .. v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt;->lazyLayoutSemantics(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 174
    move-object/from16 v22, v3

    move-object/from16 v23, v4

    .line 175
    .end local v3    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .end local v4    # "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .local v22, "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .local v23, "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v5, v3, :cond_4a

    move/from16 v3, v19

    goto :goto_37

    :cond_4a
    move/from16 v3, v18

    .line 176
    :goto_37
    nop

    .line 177
    nop

    .line 173
    invoke-static {v2, v12, v3, v10, v6}, Landroidx/compose/foundation/pager/PagerKt;->pagerSemantics(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLkotlinx/coroutines/CoroutineScope;Z)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 179
    invoke-interface {v2, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 186
    invoke-virtual {v12}, Landroidx/compose/foundation/pager/PagerState;->getInternalInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v8

    .line 179
    nop

    .line 181
    move-object v3, v12

    check-cast v3, Landroidx/compose/foundation/gestures/ScrollableState;

    .line 182
    nop

    .line 183
    nop

    .line 184
    nop

    .line 185
    move-object/from16 v7, v17

    check-cast v7, Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 186
    nop

    .line 188
    nop

    .line 187
    nop

    .line 189
    move-object v4, v11

    .end local v11    # "defaultBringIntoViewSpec":Landroidx/compose/foundation/gestures/BringIntoViewSpec;
    .local v4, "defaultBringIntoViewSpec":Landroidx/compose/foundation/gestures/BringIntoViewSpec;
    move-object v11, v0

    check-cast v11, Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    .line 180
    const/4 v9, 0x0

    move-object/from16 v19, v4

    move-object v4, v5

    move v5, v6

    move-object/from16 v18, v10

    move/from16 v6, p3

    move-object/from16 v10, p7

    .end local v4    # "defaultBringIntoViewSpec":Landroidx/compose/foundation/gestures/BringIntoViewSpec;
    .end local v10    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v18, "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .local v19, "defaultBringIntoViewSpec":Landroidx/compose/foundation/gestures/BringIntoViewSpec;
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/ScrollingContainerKt;->scrollingContainer(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 191
    invoke-static {v2, v12}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt;->dragDirectionDetector(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 192
    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v11, p11

    const/4 v5, 0x2

    invoke-static {v2, v11, v3, v5, v4}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt;->nestedScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 194
    invoke-virtual {v12}, Landroidx/compose/foundation/pager/PagerState;->getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    move-result-object v6

    .line 195
    nop

    .line 192
    nop

    .line 194
    nop

    .line 193
    nop

    .line 161
    const/4 v10, 0x0

    move-object v7, v14

    move-object v8, v15

    move-object/from16 v4, v22

    .end local v14    # "measurePolicy":Lkotlin/jvm/functions/Function2;
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v22    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .local v4, "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .local v7, "measurePolicy":Lkotlin/jvm/functions/Function2;
    .restart local v8    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt;->LazyLayout(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v4

    move-object/from16 v22, v8

    .end local v4    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .end local v8    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .local v22, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_4b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 197
    .end local v0    # "pagerBringIntoViewSpec":Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;
    .end local v1    # "beyondBoundsModifier":Landroidx/compose/ui/Modifier;
    .end local v2    # "pagerItemProvider":Lkotlin/jvm/functions/Function0;
    .end local v7    # "measurePolicy":Lkotlin/jvm/functions/Function2;
    .end local v17    # "resolvedFlingBehavior":Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;
    .end local v18    # "coroutineScope":Lkotlinx/coroutines/CoroutineScope;
    .end local v19    # "defaultBringIntoViewSpec":Landroidx/compose/foundation/gestures/BringIntoViewSpec;
    .end local v23    # "semanticState":Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    :cond_4b
    move v9, v13

    move/from16 v10, v16

    goto :goto_38

    .end local v13    # "beyondViewportPageCount":I
    .end local v16    # "pageSpacing":F
    .end local v20    # "$dirty":I
    .end local v21    # "$dirty1":I
    .end local v22    # "$composer":Landroidx/compose/runtime/Composer;
    .local v3, "$dirty":I
    .local v4, "$dirty1":I
    .restart local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .local p8, "beyondViewportPageCount":I
    .local p9, "pageSpacing":F
    :cond_4c
    move-object v12, v2

    move/from16 v20, v3

    move/from16 v21, v4

    move-object/from16 v22, v15

    .end local v3    # "$dirty":I
    .end local v4    # "$dirty1":I
    .end local v15    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v20    # "$dirty":I
    .restart local v21    # "$dirty1":I
    .restart local v22    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v9, p8

    move/from16 v10, p9

    .end local p8    # "beyondViewportPageCount":I
    .end local p9    # "pageSpacing":F
    .local v9, "beyondViewportPageCount":I
    .local v10, "pageSpacing":F
    :goto_38
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_4d

    move-object v1, v0

    new-instance v0, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$2;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v27, v1

    move-object v2, v12

    move/from16 v23, v20

    move-object/from16 v1, p0

    move/from16 v20, p20

    move-object v12, v11

    move-object/from16 v11, p10

    .end local v20    # "$dirty":I
    .local v23, "$dirty":I
    invoke-direct/range {v0 .. v20}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v27

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_39

    .end local v23    # "$dirty":I
    .restart local v20    # "$dirty":I
    :cond_4d
    move/from16 v23, v20

    .end local v20    # "$dirty":I
    .restart local v23    # "$dirty":I
    :goto_39
    return-void
.end method

.method private static final dragDirectionDetector(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;)Landroidx/compose/ui/Modifier;
    .locals 2
    .param p0, "$this$dragDirectionDetector"    # Landroidx/compose/ui/Modifier;
    .param p1, "state"    # Landroidx/compose/foundation/pager/PagerState;

    .line 284
    nop

    .line 285
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    new-instance v1, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v0, p1, v1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 284
    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 303
    return-object v0
.end method

.method private static final rememberPagerItemProviderLambda(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;
    .locals 16
    .param p0, "state"    # Landroidx/compose/foundation/pager/PagerState;
    .param p1, "pageContent"    # Lkotlin/jvm/functions/Function4;
    .param p2, "key"    # Lkotlin/jvm/functions/Function1;
    .param p3, "pageCount"    # Lkotlin/jvm/functions/Function0;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/pager/PagerScope;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
            ">;"
        }
    .end annotation

    .line 260
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p5

    const v4, -0x51cec4ba

    const-string v5, "C(rememberPagerItemProviderLambda)P(3,1)260@10823L33,261@10877L25,262@10914L741:LazyLayoutPager.kt#g6yjnt"

    invoke-static {v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:259)"

    invoke-static {v4, v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 261
    :cond_0
    shr-int/lit8 v4, v3, 0x3

    and-int/lit8 v4, v4, 0xe

    move-object/from16 v5, p1

    invoke-static {v5, v2, v4}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v4

    .line 262
    .local v4, "latestContent":Landroidx/compose/runtime/State;
    shr-int/lit8 v6, v3, 0x6

    and-int/lit8 v6, v6, 0xe

    move-object/from16 v7, p2

    invoke-static {v7, v2, v6}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v6

    .line 263
    .local v6, "latestKey":Landroidx/compose/runtime/State;
    const v8, 0x5e1bb721

    const-string v9, "CC(remember):LazyLayoutPager.kt#9igjgp"

    invoke-static {v2, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v8, v3, 0xe

    xor-int/lit8 v8, v8, 0x6

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x4

    if-le v8, v11, :cond_1

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    :cond_1
    and-int/lit8 v8, v3, 0x6

    if-ne v8, v11, :cond_3

    :cond_2
    move v8, v10

    goto :goto_0

    :cond_3
    move v8, v9

    :goto_0
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v8, v11

    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v8, v11

    and-int/lit16 v11, v3, 0x1c00

    xor-int/lit16 v11, v11, 0xc00

    const/16 v12, 0x800

    if-le v11, v12, :cond_4

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    :cond_4
    and-int/lit16 v11, v3, 0xc00

    if-ne v11, v12, :cond_6

    :cond_5
    move v9, v10

    :cond_6
    or-int/2addr v8, v9

    .local v8, "invalid$iv":Z
    move-object/from16 v9, p4

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 457
    .local v10, "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 458
    .local v12, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v8, :cond_8

    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v11, v13, :cond_7

    goto :goto_1

    .line 462
    :cond_7
    goto :goto_2

    .line 459
    :cond_8
    :goto_1
    const/4 v13, 0x0

    .line 265
    .local v13, "$i$a$-cache-LazyLayoutPagerKt$rememberPagerItemProviderLambda$1":I
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->referentialEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v14

    new-instance v15, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1;

    invoke-direct {v15, v4, v6, v1}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function0;)V

    check-cast v15, Lkotlin/jvm/functions/Function0;

    invoke-static {v14, v15}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object v14

    .line 264
    nop

    .line 269
    .local v14, "intervalContentState":Landroidx/compose/runtime/State;
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->referentialEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v15

    new-instance v1, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1;

    invoke-direct {v1, v14, v0}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/foundation/pager/PagerState;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v15, v1}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object v1

    .line 268
    nop

    .line 278
    .local v1, "itemProviderState":Landroidx/compose/runtime/State;
    new-instance v15, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1;

    invoke-direct {v15, v1}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v15, Lkotlin/reflect/KProperty0;

    .line 459
    .end local v1    # "itemProviderState":Landroidx/compose/runtime/State;
    .end local v13    # "$i$a$-cache-LazyLayoutPagerKt$rememberPagerItemProviderLambda$1":I
    .end local v14    # "intervalContentState":Landroidx/compose/runtime/State;
    nop

    .line 460
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 461
    move-object v11, v15

    .line 457
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_2
    nop

    .line 263
    .end local v8    # "invalid$iv":Z
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    check-cast v11, Lkotlin/reflect/KProperty0;

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 260
    :cond_9
    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 263
    return-object v11
.end method
