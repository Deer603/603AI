.class public final Landroidx/compose/material3/ModalBottomSheetKt;
.super Ljava/lang/Object;
.source "ModalBottomSheet.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,445:1\n148#2:446\n148#2:544\n148#2:545\n488#3:447\n487#3,4:448\n491#3,2:455\n495#3:461\n1223#4,3:452\n1226#4,3:458\n1223#4,6:462\n1223#4,6:468\n1223#4,6:474\n1223#4,6:480\n1223#4,6:486\n1223#4,6:493\n1223#4,6:499\n1223#4,6:505\n1223#4,6:511\n1223#4,6:517\n1223#4,6:525\n1223#4,6:531\n1223#4,6:537\n487#5:457\n177#6:492\n240#6:524\n696#7:523\n81#8:543\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n*L\n127#1:446\n442#1:544\n443#1:545\n134#1:447\n134#1:448,4\n134#1:455,2\n134#1:461\n134#1:452,3\n134#1:458,3\n135#1:462,6\n146#1:468,6\n152#1:474,6\n156#1:480,6\n194#1:486,6\n225#1:493,6\n233#1:499,6\n268#1:505,6\n270#1:511,6\n274#1:517,6\n415#1:525,6\n416#1:531,6\n427#1:537,6\n134#1:457\n216#1:492\n412#1:524\n409#1:523\n411#1:543\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u00c4\u0001\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00132\u0015\u0008\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u00182\u0013\u0008\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n\u00a2\u0006\u0002\u0008\u00182\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00080\u001e\u00a2\u0006\u0002\u0008\u0018\u00a2\u0006\u0002\u0008 H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"\u001a0\u0010#\u001a\u00020\u00082\u0006\u0010$\u001a\u00020\u00132\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0006\u0010%\u001a\u00020&H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(\u001a-\u0010)\u001a\u00020\u000e2\u0008\u0008\u0002\u0010*\u001a\u00020&2\u0014\u0008\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001eH\u0007\u00a2\u0006\u0002\u0010-\u001a\u00f3\u0001\u0010.\u001a\u00020\u0008*\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\u0006\u00104\u001a\u0002052\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2!\u00107\u001a\u001d\u0012\u0013\u0012\u001102\u00a2\u0006\u000c\u00088\u0012\u0008\u00089\u0012\u0004\u0008\u0008(:\u0012\u0004\u0012\u00020\u00080\u001e2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00042\u0015\u0008\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u00182\u0013\u0008\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n\u00a2\u0006\u0002\u0008\u00182\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00080\u001e\u00a2\u0006\u0002\u0008\u0018\u00a2\u0006\u0002\u0008 H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008;\u0010<\u001a\u0014\u0010=\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\u001a\u0014\u0010@\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006A\u00b2\u0006\n\u0010B\u001a\u000202X\u008a\u0084\u0002"
    }
    d2 = {
        "PredictiveBackChildTransformOrigin",
        "Landroidx/compose/ui/graphics/TransformOrigin;",
        "J",
        "PredictiveBackMaxScaleXDistance",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "PredictiveBackMaxScaleYDistance",
        "ModalBottomSheet",
        "",
        "onDismissRequest",
        "Lkotlin/Function0;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "sheetState",
        "Landroidx/compose/material3/SheetState;",
        "sheetMaxWidth",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "containerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "tonalElevation",
        "scrimColor",
        "dragHandle",
        "Landroidx/compose/runtime/Composable;",
        "contentWindowInsets",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "properties",
        "Landroidx/compose/material3/ModalBottomSheetProperties;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Lkotlin/ExtensionFunctionType;",
        "ModalBottomSheet-dYc4hso",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "Scrim",
        "color",
        "visible",
        "",
        "Scrim-3J-VO9M",
        "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V",
        "rememberModalBottomSheetState",
        "skipPartiallyExpanded",
        "confirmValueChange",
        "Landroidx/compose/material3/SheetValue;",
        "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;",
        "ModalBottomSheetContent",
        "Landroidx/compose/foundation/layout/BoxScope;",
        "predictiveBackProgress",
        "Landroidx/compose/animation/core/Animatable;",
        "",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "animateToDismiss",
        "settleToDismiss",
        "Lkotlin/ParameterName;",
        "name",
        "velocity",
        "ModalBottomSheetContent-IQkwcL4",
        "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "calculatePredictiveBackScaleX",
        "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
        "progress",
        "calculatePredictiveBackScaleY",
        "material3_release",
        "alpha"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final PredictiveBackChildTransformOrigin:J

.field private static final PredictiveBackMaxScaleXDistance:F

.field private static final PredictiveBackMaxScaleYDistance:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 442
    const/16 v0, 0x30

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 544
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 442
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackMaxScaleXDistance:F

    .line 443
    const/16 v0, 0x18

    .restart local v0    # "$this$dp$iv":I
    const/4 v1, 0x0

    .line 545
    .restart local v1    # "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 443
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackMaxScaleYDistance:F

    .line 444
    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/TransformOriginKt;->TransformOrigin(FF)J

    move-result-wide v0

    sput-wide v0, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackChildTransformOrigin:J

    return-void
.end method

.method public static final ModalBottomSheet-dYc4hso(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 47
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
    .param p13, "contentWindowInsets"    # Lkotlin/jvm/functions/Function2;
    .param p14, "properties"    # Landroidx/compose/material3/ModalBottomSheetProperties;
    .param p15, "content"    # Lkotlin/jvm/functions/Function3;
    .param p16, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p17, "$changed"    # I
    .param p18, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/SheetState;",
            "F",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFJ",
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
            "+",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            ">;",
            "Landroidx/compose/material3/ModalBottomSheetProperties;",
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
            "III)V"
        }
    .end annotation

    .line 133
    move-object/from16 v1, p0

    move/from16 v0, p17

    move/from16 v2, p18

    move/from16 v3, p19

    const v4, 0x7f1eb8b9

    move-object/from16 v5, p16

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .end local p16    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    const-string v6, "C(ModalBottomSheet)P(6,5,11,10:c#ui.unit.Dp,9,0:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.unit.Dp,8:c#ui.graphics.Color,4,3,7)121@6012L31,123@6143L13,124@6206L14,125@6248L31,127@6356L10,133@6697L24,134@6761L327,145@7142L149,151@7326L42,155@7458L708,167@8231L771,153@7374L1628,193@9077L21,193@9050L48:ModalBottomSheet.kt#uh7d8r"

    invoke-static {v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v6, p17

    .local v6, "$dirty":I
    move/from16 v7, p18

    .local v7, "$dirty1":I
    and-int/lit8 v8, v3, 0x1

    if-eqz v8, :cond_0

    or-int/lit8 v6, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v0, 0x6

    if-nez v8, :cond_2

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v6, v8

    :cond_2
    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v6, v6, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v13, v0, 0x30

    if-nez v13, :cond_5

    move-object/from16 v13, p1

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v14, 0x20

    goto :goto_2

    :cond_4
    const/16 v14, 0x10

    :goto_2
    or-int/2addr v6, v14

    goto :goto_3

    :cond_5
    move-object/from16 v13, p1

    :goto_3
    and-int/lit16 v14, v0, 0x180

    if-nez v14, :cond_8

    and-int/lit8 v14, v3, 0x4

    if-nez v14, :cond_6

    move-object/from16 v14, p2

    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v14, p2

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v6, v6, v16

    goto :goto_5

    :cond_8
    move-object/from16 v14, p2

    :goto_5
    and-int/lit8 v16, v3, 0x8

    if-eqz v16, :cond_9

    or-int/lit16 v6, v6, 0xc00

    move/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v0, 0xc00

    if-nez v12, :cond_b

    move/from16 v12, p3

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v18

    if-eqz v18, :cond_a

    const/16 v18, 0x800

    goto :goto_6

    :cond_a
    const/16 v18, 0x400

    :goto_6
    or-int v6, v6, v18

    goto :goto_7

    :cond_b
    move/from16 v12, p3

    :goto_7
    and-int/lit16 v15, v0, 0x6000

    if-nez v15, :cond_e

    and-int/lit8 v15, v3, 0x10

    if-nez v15, :cond_c

    move-object/from16 v15, p4

    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_d

    const/16 v19, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v15, p4

    :cond_d
    const/16 v19, 0x2000

    :goto_8
    or-int v6, v6, v19

    goto :goto_9

    :cond_e
    move-object/from16 v15, p4

    :goto_9
    const/high16 v19, 0x30000

    and-int v19, v0, v19

    if-nez v19, :cond_11

    and-int/lit8 v19, v3, 0x20

    if-nez v19, :cond_f

    move-wide/from16 v9, p5

    invoke-interface {v5, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v21

    if-eqz v21, :cond_10

    const/high16 v21, 0x20000

    goto :goto_a

    :cond_f
    move-wide/from16 v9, p5

    :cond_10
    const/high16 v21, 0x10000

    :goto_a
    or-int v6, v6, v21

    goto :goto_b

    :cond_11
    move-wide/from16 v9, p5

    :goto_b
    const/high16 v21, 0x180000

    and-int v21, v0, v21

    if-nez v21, :cond_14

    and-int/lit8 v21, v3, 0x40

    if-nez v21, :cond_12

    move-wide/from16 v11, p7

    invoke-interface {v5, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v22

    if-eqz v22, :cond_13

    const/high16 v22, 0x100000

    goto :goto_c

    :cond_12
    move-wide/from16 v11, p7

    :cond_13
    const/high16 v22, 0x80000

    :goto_c
    or-int v6, v6, v22

    goto :goto_d

    :cond_14
    move-wide/from16 v11, p7

    :goto_d
    and-int/lit16 v4, v3, 0x80

    const/high16 v23, 0xc00000

    if-eqz v4, :cond_15

    or-int v6, v6, v23

    move/from16 v0, p9

    goto :goto_f

    :cond_15
    and-int v23, v0, v23

    if-nez v23, :cond_17

    move/from16 v0, p9

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v23

    if-eqz v23, :cond_16

    const/high16 v23, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v23, 0x400000

    :goto_e
    or-int v6, v6, v23

    goto :goto_f

    :cond_17
    move/from16 v0, p9

    :goto_f
    const/high16 v23, 0x6000000

    and-int v23, p17, v23

    if-nez v23, :cond_1a

    and-int/lit16 v0, v3, 0x100

    if-nez v0, :cond_18

    move/from16 v23, v6

    move v0, v7

    move-wide/from16 v6, p10

    .end local v6    # "$dirty":I
    .end local v7    # "$dirty1":I
    .local v0, "$dirty1":I
    .local v23, "$dirty":I
    invoke-interface {v5, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v24

    if-eqz v24, :cond_19

    const/high16 v24, 0x4000000

    goto :goto_10

    .end local v0    # "$dirty1":I
    .end local v23    # "$dirty":I
    .restart local v6    # "$dirty":I
    .restart local v7    # "$dirty1":I
    :cond_18
    move/from16 v23, v6

    move v0, v7

    move-wide/from16 v6, p10

    .end local v6    # "$dirty":I
    .end local v7    # "$dirty1":I
    .restart local v0    # "$dirty1":I
    .restart local v23    # "$dirty":I
    :cond_19
    const/high16 v24, 0x2000000

    :goto_10
    or-int v23, v23, v24

    goto :goto_11

    .end local v0    # "$dirty1":I
    .end local v23    # "$dirty":I
    .restart local v6    # "$dirty":I
    .restart local v7    # "$dirty1":I
    :cond_1a
    move/from16 v23, v6

    move v0, v7

    move-wide/from16 v6, p10

    .end local v6    # "$dirty":I
    .end local v7    # "$dirty1":I
    .restart local v0    # "$dirty1":I
    .restart local v23    # "$dirty":I
    :goto_11
    move/from16 v24, v0

    .end local v0    # "$dirty1":I
    .local v24, "$dirty1":I
    and-int/lit16 v0, v3, 0x200

    const/high16 v25, 0x30000000

    if-eqz v0, :cond_1b

    or-int v23, v23, v25

    move/from16 v25, v0

    goto :goto_13

    :cond_1b
    and-int v25, p17, v25

    if-nez v25, :cond_1d

    move/from16 v25, v0

    move-object/from16 v0, p12

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1c

    const/high16 v26, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v26, 0x10000000

    :goto_12
    or-int v23, v23, v26

    goto :goto_13

    :cond_1d
    move/from16 v25, v0

    move-object/from16 v0, p12

    :goto_13
    move/from16 v0, v23

    .end local v23    # "$dirty":I
    .local v0, "$dirty":I
    and-int/lit8 v23, v2, 0x6

    if-nez v23, :cond_20

    move/from16 v23, v4

    and-int/lit16 v4, v3, 0x400

    if-nez v4, :cond_1e

    move-object/from16 v4, p13

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1f

    const/16 v26, 0x4

    goto :goto_14

    :cond_1e
    move-object/from16 v4, p13

    :cond_1f
    const/16 v26, 0x2

    :goto_14
    or-int v24, v24, v26

    goto :goto_15

    :cond_20
    move/from16 v23, v4

    move-object/from16 v4, p13

    :goto_15
    and-int/lit16 v4, v3, 0x800

    if-eqz v4, :cond_21

    or-int/lit8 v24, v24, 0x30

    move/from16 v26, v4

    goto :goto_17

    :cond_21
    and-int/lit8 v26, v2, 0x30

    if-nez v26, :cond_23

    move/from16 v26, v4

    move-object/from16 v4, p14

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_22

    const/16 v17, 0x20

    goto :goto_16

    :cond_22
    const/16 v17, 0x10

    :goto_16
    or-int v24, v24, v17

    goto :goto_17

    :cond_23
    move/from16 v26, v4

    move-object/from16 v4, p14

    :goto_17
    move/from16 v4, v24

    .end local v24    # "$dirty1":I
    .local v4, "$dirty1":I
    and-int/lit16 v6, v3, 0x1000

    if-eqz v6, :cond_24

    or-int/lit16 v4, v4, 0x180

    move-object/from16 v6, p15

    goto :goto_19

    :cond_24
    and-int/lit16 v6, v2, 0x180

    if-nez v6, :cond_26

    move-object/from16 v6, p15

    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_25

    const/16 v18, 0x100

    goto :goto_18

    :cond_25
    const/16 v18, 0x80

    :goto_18
    or-int v4, v4, v18

    goto :goto_19

    :cond_26
    move-object/from16 v6, p15

    :goto_19
    const v7, 0x12492493

    and-int/2addr v7, v0

    const v2, 0x12492492

    if-ne v7, v2, :cond_28

    and-int/lit16 v2, v4, 0x93

    const/16 v7, 0x92

    if-ne v2, v7, :cond_28

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_27

    goto :goto_1a

    .line 196
    :cond_27
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v43, p12

    move/from16 v21, v4

    move-object v2, v5

    move-wide v6, v9

    move-wide v8, v11

    move-object v3, v14

    move-object v5, v15

    move/from16 v4, p3

    move/from16 v10, p9

    move-wide/from16 v11, p10

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v20, v0

    goto/16 :goto_35

    .line 133
    :cond_28
    :goto_1a
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v2, p17, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_30

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v2

    if-eqz v2, :cond_29

    goto :goto_1b

    .line 131
    :cond_29
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v2, v3, 0x4

    if-eqz v2, :cond_2a

    and-int/lit16 v0, v0, -0x381

    :cond_2a
    and-int/lit8 v2, v3, 0x10

    if-eqz v2, :cond_2b

    const v2, -0xe001

    and-int/2addr v0, v2

    :cond_2b
    and-int/lit8 v2, v3, 0x20

    if-eqz v2, :cond_2c

    const v2, -0x70001

    and-int/2addr v0, v2

    :cond_2c
    and-int/lit8 v2, v3, 0x40

    if-eqz v2, :cond_2d

    const v2, -0x380001

    and-int/2addr v0, v2

    :cond_2d
    and-int/lit16 v2, v3, 0x100

    if-eqz v2, :cond_2e

    const v2, -0xe000001

    and-int/2addr v0, v2

    :cond_2e
    and-int/lit16 v2, v3, 0x400

    if-eqz v2, :cond_2f

    and-int/lit8 v4, v4, -0xf

    :cond_2f
    move/from16 v36, p3

    move/from16 v42, p9

    move-wide/from16 v28, p10

    move-object/from16 v43, p12

    move-object/from16 v44, p13

    move-object/from16 v18, p14

    move/from16 v16, v7

    move-wide/from16 v38, v9

    move-wide/from16 v40, v11

    move-object/from16 v35, v13

    move-object/from16 v37, v15

    goto/16 :goto_23

    .line 133
    :cond_30
    :goto_1b
    if-eqz v8, :cond_31

    .line 121
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v13, v2

    .end local p1    # "modifier":Landroidx/compose/ui/Modifier;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    :cond_31
    and-int/lit8 v2, v3, 0x4

    if-eqz v2, :cond_32

    .line 122
    const/4 v2, 0x3

    const/4 v8, 0x0

    invoke-static {v7, v8, v5, v7, v2}, Landroidx/compose/material3/ModalBottomSheetKt;->rememberModalBottomSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object v2

    .end local p2    # "sheetState":Landroidx/compose/material3/SheetState;
    .local v2, "sheetState":Landroidx/compose/material3/SheetState;
    and-int/lit16 v0, v0, -0x381

    move-object v14, v2

    .end local v2    # "sheetState":Landroidx/compose/material3/SheetState;
    .local v14, "sheetState":Landroidx/compose/material3/SheetState;
    :cond_32
    if-eqz v16, :cond_33

    .line 123
    sget-object v2, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetMaxWidth-D9Ej5fM()F

    move-result v2

    .end local p3    # "sheetMaxWidth":F
    .local v2, "sheetMaxWidth":F
    goto :goto_1c

    .line 122
    .end local v2    # "sheetMaxWidth":F
    .restart local p3    # "sheetMaxWidth":F
    :cond_33
    move/from16 v2, p3

    .line 123
    .end local p3    # "sheetMaxWidth":F
    .restart local v2    # "sheetMaxWidth":F
    :goto_1c
    and-int/lit8 v8, v3, 0x10

    if-eqz v8, :cond_34

    .line 124
    sget-object v8, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    move/from16 v16, v7

    const/4 v7, 0x6

    invoke-virtual {v8, v5, v7}, Landroidx/compose/material3/BottomSheetDefaults;->getExpandedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v8

    .end local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v8, "shape":Landroidx/compose/ui/graphics/Shape;
    const v7, -0xe001

    and-int/2addr v0, v7

    move-object v15, v8

    goto :goto_1d

    .line 123
    .end local v8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .restart local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_34
    move/from16 v16, v7

    .line 124
    .end local p4    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v15, "shape":Landroidx/compose/ui/graphics/Shape;
    :goto_1d
    and-int/lit8 v7, v3, 0x20

    if-eqz v7, :cond_35

    .line 125
    sget-object v7, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    const/4 v8, 0x6

    invoke-virtual {v7, v5, v8}, Landroidx/compose/material3/BottomSheetDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    .end local p5    # "containerColor":J
    .local v9, "containerColor":J
    const v7, -0x70001

    and-int/2addr v0, v7

    :cond_35
    and-int/lit8 v7, v3, 0x40

    if-eqz v7, :cond_36

    .line 126
    shr-int/lit8 v7, v0, 0xf

    and-int/lit8 v7, v7, 0xe

    invoke-static {v9, v10, v5, v7}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    .end local p7    # "contentColor":J
    .local v7, "contentColor":J
    const v11, -0x380001

    and-int/2addr v0, v11

    goto :goto_1e

    .line 125
    .end local v7    # "contentColor":J
    .restart local p7    # "contentColor":J
    :cond_36
    move-wide v7, v11

    .line 126
    .end local p7    # "contentColor":J
    .restart local v7    # "contentColor":J
    :goto_1e
    if-eqz v23, :cond_37

    .line 127
    const/4 v11, 0x0

    .local v11, "$this$dp$iv":I
    const/4 v12, 0x0

    .line 446
    .local v12, "$i$f$getDp":I
    move/from16 p1, v0

    .end local v0    # "$dirty":I
    .local p1, "$dirty":I
    int-to-float v0, v11

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .end local v11    # "$this$dp$iv":I
    .end local v12    # "$i$f$getDp":I
    .end local p9    # "tonalElevation":F
    .local v0, "tonalElevation":F
    goto :goto_1f

    .line 126
    .end local p1    # "$dirty":I
    .local v0, "$dirty":I
    .restart local p9    # "tonalElevation":F
    :cond_37
    move/from16 p1, v0

    .end local v0    # "$dirty":I
    .restart local p1    # "$dirty":I
    move/from16 v0, p9

    .line 446
    .end local p9    # "tonalElevation":F
    .local v0, "tonalElevation":F
    :goto_1f
    and-int/lit16 v11, v3, 0x100

    if-eqz v11, :cond_38

    .line 128
    sget-object v11, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    const/4 v12, 0x6

    invoke-virtual {v11, v5, v12}, Landroidx/compose/material3/BottomSheetDefaults;->getScrimColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v23

    .end local p10    # "scrimColor":J
    .local v23, "scrimColor":J
    const v11, -0xe000001

    and-int v11, p1, v11

    .end local p1    # "$dirty":I
    .local v11, "$dirty":I
    goto :goto_20

    .line 446
    .end local v11    # "$dirty":I
    .end local v23    # "scrimColor":J
    .restart local p1    # "$dirty":I
    .restart local p10    # "scrimColor":J
    :cond_38
    move/from16 v11, p1

    move-wide/from16 v23, p10

    .line 128
    .end local p1    # "$dirty":I
    .end local p10    # "scrimColor":J
    .restart local v11    # "$dirty":I
    .restart local v23    # "scrimColor":J
    :goto_20
    if-eqz v25, :cond_39

    sget-object v12, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;

    invoke-virtual {v12}, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;->getLambda-1$material3_release()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    .end local p12    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v12, "dragHandle":Lkotlin/jvm/functions/Function2;
    goto :goto_21

    .end local v12    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .restart local p12    # "dragHandle":Lkotlin/jvm/functions/Function2;
    :cond_39
    move-object/from16 v12, p12

    .end local p12    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .restart local v12    # "dragHandle":Lkotlin/jvm/functions/Function2;
    :goto_21
    move/from16 p1, v0

    .end local v0    # "tonalElevation":F
    .local p1, "tonalElevation":F
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_3a

    .line 130
    sget-object v0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$1;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .end local p13    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .local v0, "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    and-int/lit8 v4, v4, -0xf

    goto :goto_22

    .line 128
    .end local v0    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .restart local p13    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    :cond_3a
    move-object/from16 v0, p13

    .line 130
    .end local p13    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .restart local v0    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    :goto_22
    if-eqz v26, :cond_3b

    .line 131
    sget-object v18, Landroidx/compose/material3/ModalBottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetDefaults;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/material3/ModalBottomSheetDefaults;->getProperties()Landroidx/compose/material3/ModalBottomSheetProperties;

    move-result-object v18

    move/from16 v42, p1

    move-object/from16 v44, v0

    move/from16 v36, v2

    move-wide/from16 v40, v7

    move-wide/from16 v38, v9

    move v0, v11

    move-object/from16 v43, v12

    move-object/from16 v35, v13

    move-object/from16 v37, v15

    move-wide/from16 v28, v23

    .end local p14    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local v18, "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    goto :goto_23

    .line 130
    .end local v18    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .restart local p14    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    :cond_3b
    move/from16 v42, p1

    move-object/from16 v18, p14

    move-object/from16 v44, v0

    move/from16 v36, v2

    move-wide/from16 v40, v7

    move-wide/from16 v38, v9

    move v0, v11

    move-object/from16 v43, v12

    move-object/from16 v35, v13

    move-object/from16 v37, v15

    move-wide/from16 v28, v23

    .line 131
    .end local v2    # "sheetMaxWidth":F
    .end local v7    # "contentColor":J
    .end local v9    # "containerColor":J
    .end local v11    # "$dirty":I
    .end local v12    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .end local v13    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v15    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v23    # "scrimColor":J
    .end local p1    # "tonalElevation":F
    .end local p14    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local v0, "$dirty":I
    .restart local v18    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local v28, "scrimColor":J
    .local v35, "modifier":Landroidx/compose/ui/Modifier;
    .local v36, "sheetMaxWidth":F
    .local v37, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v38, "containerColor":J
    .local v40, "contentColor":J
    .local v42, "tonalElevation":F
    .local v43, "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v44, "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    :goto_23
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_3c

    .line 133
    const-string v2, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)"

    const v7, 0x7f1eb8b9

    invoke-static {v7, v0, v4, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3c
    nop

    .line 134
    move/from16 v2, v16

    .local v2, "$changed$iv":I
    const/4 v7, 0x0

    .line 447
    .local v7, "$i$f$rememberCoroutineScope":I
    const v8, 0x2e20b340

    const-string v9, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp"

    invoke-static {v5, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 448
    nop

    .line 450
    move-object v8, v5

    .line 451
    .local v8, "composer$iv":Landroidx/compose/runtime/Composer;
    const v9, -0x38e26dd0

    const-string v10, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v5, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v9, 0x0

    .local v9, "invalid$iv$iv":Z
    move-object v10, v5

    .local v10, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/4 v11, 0x0

    .line 452
    .local v11, "$i$f$cache":I
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 453
    .local v13, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v12, v15, :cond_3d

    .line 454
    const/4 v15, 0x0

    .line 455
    .local v15, "$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    nop

    .line 456
    const/16 v22, 0x0

    .line 457
    .local v22, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v22, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 456
    .end local v22    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move/from16 p1, v2

    .end local v2    # "$changed$iv":I
    .local p1, "$changed$iv":I
    move-object/from16 v2, v22

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v2, v8}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    .line 455
    new-instance v3, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v3, v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 454
    .end local v15    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv":I
    nop

    .line 458
    .local v3, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 459
    nop

    .end local v3    # "value$iv$iv":Ljava/lang/Object;
    goto :goto_24

    .line 460
    .end local p1    # "$changed$iv":I
    .restart local v2    # "$changed$iv":I
    :cond_3d
    move/from16 p1, v2

    .end local v2    # "$changed$iv":I
    .restart local p1    # "$changed$iv":I
    move-object v3, v12

    .line 453
    :goto_24
    nop

    .line 452
    .end local v12    # "it$iv$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    nop

    .line 451
    .end local v9    # "invalid$iv$iv":Z
    .end local v10    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v11    # "$i$f$cache":I
    move-object v2, v3

    check-cast v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .local v2, "wrapper$iv":Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 461
    invoke-virtual {v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v33

    .line 447
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 461
    nop

    .line 134
    .end local v2    # "wrapper$iv":Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
    .end local v7    # "$i$f$rememberCoroutineScope":I
    .end local v8    # "composer$iv":Landroidx/compose/runtime/Composer;
    .end local p1    # "$changed$iv":I
    move-object/from16 v2, v33

    .line 135
    .local v2, "scope":Lkotlinx/coroutines/CoroutineScope;
    const v3, -0x77e36f2f

    const-string v7, "CC(remember):ModalBottomSheet.kt#9igjgp"

    invoke-static {v5, v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v3, v0, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v9, 0x100

    if-le v3, v9, :cond_3e

    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3f

    :cond_3e
    and-int/lit16 v3, v0, 0x180

    const/16 v9, 0x100

    if-ne v3, v9, :cond_40

    :cond_3f
    const/4 v3, 0x1

    goto :goto_25

    :cond_40
    move/from16 v3, v16

    :goto_25
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v3, v9

    and-int/lit8 v9, v0, 0xe

    const/4 v10, 0x4

    if-ne v9, v10, :cond_41

    const/4 v9, 0x1

    goto :goto_26

    :cond_41
    move/from16 v9, v16

    :goto_26
    or-int/2addr v3, v9

    .local v3, "invalid$iv":Z
    move-object v9, v5

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 462
    .local v10, "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .local v11, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 463
    .local v12, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_43

    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v11, v13, :cond_42

    goto :goto_27

    .line 467
    :cond_42
    move-object v15, v11

    goto :goto_28

    .line 464
    :cond_43
    :goto_27
    const/4 v13, 0x0

    .line 135
    .local v13, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1":I
    new-instance v15, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;

    invoke-direct {v15, v14, v2, v1}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V

    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 464
    .end local v13    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1":I
    nop

    .line 465
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 466
    nop

    .line 463
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_28
    nop

    .line 462
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 135
    .end local v3    # "invalid$iv":Z
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    move-object/from16 v30, v15

    check-cast v30, Lkotlin/jvm/functions/Function0;

    .local v30, "animateToDismiss":Lkotlin/jvm/functions/Function0;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 146
    const v3, -0x77e34041

    invoke-static {v5, v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit16 v9, v0, 0x380

    xor-int/lit16 v9, v9, 0x180

    const/16 v10, 0x100

    if-le v9, v10, :cond_44

    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_45

    :cond_44
    and-int/lit16 v9, v0, 0x180

    const/16 v10, 0x100

    if-ne v9, v10, :cond_46

    :cond_45
    const/4 v9, 0x1

    goto :goto_29

    :cond_46
    move/from16 v9, v16

    :goto_29
    or-int/2addr v3, v9

    and-int/lit8 v9, v0, 0xe

    const/4 v10, 0x4

    if-ne v9, v10, :cond_47

    const/4 v9, 0x1

    goto :goto_2a

    :cond_47
    move/from16 v9, v16

    :goto_2a
    or-int/2addr v3, v9

    .restart local v3    # "invalid$iv":Z
    move-object v9, v5

    .restart local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 468
    .restart local v10    # "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .restart local v11    # "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 469
    .restart local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_49

    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v11, v13, :cond_48

    goto :goto_2b

    .line 473
    :cond_48
    move-object v15, v11

    goto :goto_2c

    .line 470
    :cond_49
    :goto_2b
    const/4 v13, 0x0

    .line 146
    .local v13, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1":I
    new-instance v15, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1;

    invoke-direct {v15, v2, v14, v1}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1;-><init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V

    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 470
    .end local v13    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1":I
    nop

    .line 471
    .restart local v15    # "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 472
    nop

    .line 469
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_2c
    nop

    .line 468
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 146
    .end local v3    # "invalid$iv":Z
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    move-object/from16 v34, v15

    check-cast v34, Lkotlin/jvm/functions/Function1;

    .local v34, "settleToDismiss":Lkotlin/jvm/functions/Function1;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 152
    const v3, -0x77e329ac

    invoke-static {v5, v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .restart local v3    # "invalid$iv":Z
    move-object v9, v5

    .restart local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 474
    .restart local v10    # "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    .restart local v11    # "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 475
    .restart local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v11, v13, :cond_4a

    .line 476
    const/4 v13, 0x0

    .line 152
    .local v13, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$predictiveBackProgress$1":I
    const/4 v15, 0x0

    const/4 v8, 0x0

    move/from16 p1, v3

    move/from16 v19, v4

    const/4 v3, 0x0

    const/4 v4, 0x2

    .end local v3    # "invalid$iv":Z
    .end local v4    # "$dirty1":I
    .local v19, "$dirty1":I
    .local p1, "invalid$iv":Z
    invoke-static {v15, v8, v4, v3}, Landroidx/compose/animation/core/AnimatableKt;->Animatable$default(FFILjava/lang/Object;)Landroidx/compose/animation/core/Animatable;

    move-result-object v4

    .line 476
    .end local v13    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$predictiveBackProgress$1":I
    nop

    .line 477
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 478
    nop

    .end local v4    # "value$iv":Ljava/lang/Object;
    goto :goto_2d

    .line 479
    .end local v19    # "$dirty1":I
    .end local p1    # "invalid$iv":Z
    .restart local v3    # "invalid$iv":Z
    .local v4, "$dirty1":I
    :cond_4a
    move/from16 p1, v3

    move/from16 v19, v4

    .end local v3    # "invalid$iv":Z
    .end local v4    # "$dirty1":I
    .restart local v19    # "$dirty1":I
    .restart local p1    # "invalid$iv":Z
    move-object v4, v11

    .line 475
    :goto_2d
    nop

    .line 474
    .end local v11    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 152
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    .end local p1    # "invalid$iv":Z
    move-object v3, v4

    check-cast v3, Landroidx/compose/animation/core/Animatable;

    .local v3, "predictiveBackProgress":Landroidx/compose/animation/core/Animatable;
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 156
    const v4, -0x77e31692

    invoke-static {v5, v4, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v4, v0, 0x380

    xor-int/lit16 v4, v4, 0x180

    const/16 v9, 0x100

    if-le v4, v9, :cond_4b

    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4c

    :cond_4b
    and-int/lit16 v4, v0, 0x180

    const/16 v9, 0x100

    if-ne v4, v9, :cond_4d

    :cond_4c
    const/4 v4, 0x1

    goto :goto_2e

    :cond_4d
    move/from16 v4, v16

    :goto_2e
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    and-int/lit8 v8, v0, 0xe

    const/4 v10, 0x4

    if-ne v8, v10, :cond_4e

    const/4 v8, 0x1

    goto :goto_2f

    :cond_4e
    move/from16 v8, v16

    :goto_2f
    or-int/2addr v4, v8

    .local v4, "invalid$iv":Z
    move-object v8, v5

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 480
    .local v9, "$i$f$cache":I
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 481
    .local v11, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v4, :cond_50

    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v10, v12, :cond_4f

    goto :goto_30

    .line 485
    :cond_4f
    move-object v13, v10

    goto :goto_31

    .line 482
    :cond_50
    :goto_30
    const/4 v12, 0x0

    .line 156
    .local v12, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$2":I
    new-instance v13, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;

    invoke-direct {v13, v14, v2, v3, v1}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function0;)V

    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 482
    .end local v12    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$2":I
    nop

    .line 483
    .local v13, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 484
    nop

    .line 481
    .end local v13    # "value$iv":Ljava/lang/Object;
    :goto_31
    nop

    .line 480
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 156
    .end local v4    # "invalid$iv":Z
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    check-cast v13, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 155
    nop

    .line 167
    nop

    .line 168
    new-instance v27, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$3;

    move-object/from16 v33, v2

    move-object/from16 v32, v3

    move-object/from16 v45, v6

    move-object/from16 v31, v14

    .end local v2    # "scope":Lkotlinx/coroutines/CoroutineScope;
    .end local v3    # "predictiveBackProgress":Landroidx/compose/animation/core/Animatable;
    .end local v14    # "sheetState":Landroidx/compose/material3/SheetState;
    .local v31, "sheetState":Landroidx/compose/material3/SheetState;
    .local v32, "predictiveBackProgress":Landroidx/compose/animation/core/Animatable;
    .local v33, "scope":Lkotlinx/coroutines/CoroutineScope;
    invoke-direct/range {v27 .. v45}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$3;-><init>(JLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V

    move-object/from16 v2, v27

    .end local v31    # "sheetState":Landroidx/compose/material3/SheetState;
    .restart local v14    # "sheetState":Landroidx/compose/material3/SheetState;
    const/16 v3, 0x36

    const v4, -0x12c18966

    const/4 v6, 0x1

    invoke-static {v4, v6, v2, v5, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function2;

    and-int/lit8 v3, v19, 0x70

    or-int/lit16 v3, v3, 0xc00

    sget v4, Landroidx/compose/animation/core/Animatable;->$stable:I

    const/16 v17, 0x6

    shl-int/lit8 v4, v4, 0x6

    or-int/2addr v3, v4

    .line 154
    move-object/from16 p4, v2

    move/from16 p6, v3

    move-object/from16 p5, v5

    move-object/from16 p1, v13

    move-object/from16 p2, v18

    move-object/from16 p3, v32

    .end local v5    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v18    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .end local v32    # "predictiveBackProgress":Landroidx/compose/animation/core/Animatable;
    .local p2, "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local p3, "predictiveBackProgress":Landroidx/compose/animation/core/Animatable;
    .local p5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {p1 .. p6}, Landroidx/compose/material3/ModalBottomSheet_androidKt;->ModalBottomSheetDialog(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 193
    move-object/from16 v2, p5

    .end local p2    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .end local p3    # "predictiveBackProgress":Landroidx/compose/animation/core/Animatable;
    .end local p5    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$composer":Landroidx/compose/runtime/Composer;
    .restart local v18    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .restart local v32    # "predictiveBackProgress":Landroidx/compose/animation/core/Animatable;
    invoke-virtual {v14}, Landroidx/compose/material3/SheetState;->getHasExpandedState()Z

    move-result v3

    if-eqz v3, :cond_56

    .line 194
    const v3, -0x77e24ee1

    invoke-static {v2, v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v3, v0, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v9, 0x100

    if-le v3, v9, :cond_51

    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_52

    :cond_51
    and-int/lit16 v3, v0, 0x180

    const/16 v9, 0x100

    if-ne v3, v9, :cond_53

    :cond_52
    move v7, v6

    goto :goto_32

    :cond_53
    move/from16 v7, v16

    .local v7, "invalid$iv":Z
    :goto_32
    move-object v3, v2

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 486
    .local v4, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 487
    .local v6, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v7, :cond_55

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_54

    goto :goto_33

    .line 491
    :cond_54
    move-object v9, v5

    goto :goto_34

    .line 488
    :cond_55
    :goto_33
    const/4 v8, 0x0

    .line 194
    .local v8, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$4":I
    new-instance v9, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$4$1;

    const/4 v10, 0x0

    invoke-direct {v9, v14, v10}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$4$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlin/coroutines/Continuation;)V

    check-cast v9, Lkotlin/jvm/functions/Function2;

    .line 488
    .end local v8    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheet$4":I
    nop

    .line 489
    .local v9, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 490
    nop

    .line 487
    .end local v9    # "value$iv":Ljava/lang/Object;
    :goto_34
    nop

    .line 486
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 194
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache":I
    .end local v7    # "invalid$iv":Z
    check-cast v9, Lkotlin/jvm/functions/Function2;

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    shr-int/lit8 v3, v0, 0x6

    and-int/lit8 v3, v3, 0xe

    invoke-static {v14, v9, v2, v3}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    :cond_56
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_57

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 196
    .end local v30    # "animateToDismiss":Lkotlin/jvm/functions/Function0;
    .end local v32    # "predictiveBackProgress":Landroidx/compose/animation/core/Animatable;
    .end local v33    # "scope":Lkotlinx/coroutines/CoroutineScope;
    .end local v34    # "settleToDismiss":Lkotlin/jvm/functions/Function1;
    :cond_57
    move-object v3, v14

    move-object/from16 v15, v18

    move/from16 v21, v19

    move-wide/from16 v11, v28

    move-object/from16 v13, v35

    move/from16 v4, v36

    move-object/from16 v5, v37

    move-wide/from16 v6, v38

    move-wide/from16 v8, v40

    move/from16 v10, v42

    move-object/from16 v14, v44

    move/from16 v20, v0

    .end local v0    # "$dirty":I
    .end local v18    # "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .end local v19    # "$dirty1":I
    .end local v28    # "scrimColor":J
    .end local v35    # "modifier":Landroidx/compose/ui/Modifier;
    .end local v36    # "sheetMaxWidth":F
    .end local v37    # "shape":Landroidx/compose/ui/graphics/Shape;
    .end local v38    # "containerColor":J
    .end local v40    # "contentColor":J
    .end local v42    # "tonalElevation":F
    .end local v44    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .local v3, "sheetState":Landroidx/compose/material3/SheetState;
    .local v4, "sheetMaxWidth":F
    .local v5, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v6, "containerColor":J
    .local v8, "contentColor":J
    .local v10, "tonalElevation":F
    .local v11, "scrimColor":J
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    .local v14, "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .local v15, "properties":Landroidx/compose/material3/ModalBottomSheetProperties;
    .local v20, "$dirty":I
    .local v21, "$dirty1":I
    :goto_35
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_58

    move-object/from16 v16, v0

    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$5;

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v22, v2

    move-object v2, v13

    move-object/from16 v46, v16

    move-object/from16 v13, v43

    move-object/from16 v16, p15

    .end local v43    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v13, "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v22, "$composer":Landroidx/compose/runtime/Composer;
    invoke-direct/range {v0 .. v19}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$5;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v46

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    goto :goto_36

    .end local v22    # "$composer":Landroidx/compose/runtime/Composer;
    .local v2, "$composer":Landroidx/compose/runtime/Composer;
    .local v13, "modifier":Landroidx/compose/ui/Modifier;
    .restart local v43    # "dragHandle":Lkotlin/jvm/functions/Function2;
    :cond_58
    move-object/from16 v22, v2

    move-object v2, v13

    move-object/from16 v13, v43

    .end local v43    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v2, "modifier":Landroidx/compose/ui/Modifier;
    .local v13, "dragHandle":Lkotlin/jvm/functions/Function2;
    .restart local v22    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_36
    return-void
.end method

.method public static final ModalBottomSheetContent-IQkwcL4(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 40
    .param p0, "$this$ModalBottomSheetContent_u2dIQkwcL4"    # Landroidx/compose/foundation/layout/BoxScope;
    .param p1, "predictiveBackProgress"    # Landroidx/compose/animation/core/Animatable;
    .param p2, "scope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p3, "animateToDismiss"    # Lkotlin/jvm/functions/Function0;
    .param p4, "settleToDismiss"    # Lkotlin/jvm/functions/Function1;
    .param p5, "modifier"    # Landroidx/compose/ui/Modifier;
    .param p6, "sheetState"    # Landroidx/compose/material3/SheetState;
    .param p7, "sheetMaxWidth"    # F
    .param p8, "shape"    # Landroidx/compose/ui/graphics/Shape;
    .param p9, "containerColor"    # J
    .param p11, "contentColor"    # J
    .param p13, "tonalElevation"    # F
    .param p14, "dragHandle"    # Lkotlin/jvm/functions/Function2;
    .param p15, "contentWindowInsets"    # Lkotlin/jvm/functions/Function2;
    .param p16, "content"    # Lkotlin/jvm/functions/Function3;
    .param p17, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p18, "$changed"    # I
    .param p19, "$changed1"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/BoxScope;",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/SheetState;",
            "F",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJF",
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
            "+",
            "Landroidx/compose/foundation/layout/WindowInsets;",
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
            "III)V"
        }
    .end annotation

    .line 215
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v0, p18

    move/from16 v3, p19

    move/from16 v4, p20

    const v6, -0x63f46313

    move-object/from16 v7, p17

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .end local p17    # "$composer":Landroidx/compose/runtime/Composer;
    .local v6, "$composer":Landroidx/compose/runtime/Composer;
    const-string v7, "C(ModalBottomSheetContent)P(7,8!1,9,6,12,11:c#ui.unit.Dp,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.unit.Dp,5,4)205@9432L31,207@9563L13,208@9626L14,209@9668L31,215@10018L48,224@10294L324,232@10728L1476,267@12552L23,269@12621L112,273@12765L612,288@13518L2623,217@10072L6069:ModalBottomSheet.kt#uh7d8r"

    invoke-static {v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v7, p18

    .local v7, "$dirty":I
    move/from16 v8, p19

    .local v8, "$dirty1":I
    const/high16 v9, -0x80000000

    and-int/2addr v9, v4

    if-eqz v9, :cond_0

    or-int/lit8 v7, v7, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v9, v0, 0x6

    if-nez v9, :cond_2

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v7, v9

    :cond_2
    :goto_1
    and-int/lit8 v9, v4, 0x1

    if-eqz v9, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_6

    and-int/lit8 v9, v0, 0x40

    if-nez v9, :cond_4

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_2

    :cond_4
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    :goto_2
    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_3

    :cond_5
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v7, v9

    :cond_6
    :goto_4
    and-int/lit8 v9, v4, 0x2

    if-eqz v9, :cond_7

    or-int/lit16 v7, v7, 0x180

    move-object/from16 v9, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v9, v0, 0x180

    if-nez v9, :cond_9

    move-object/from16 v9, p2

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_5

    :cond_8
    const/16 v16, 0x80

    :goto_5
    or-int v7, v7, v16

    goto :goto_6

    :cond_9
    move-object/from16 v9, p2

    :goto_6
    and-int/lit8 v16, v4, 0x4

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_a

    or-int/lit16 v7, v7, 0xc00

    move-object/from16 v10, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_c

    move-object/from16 v10, p3

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    move/from16 v16, v17

    goto :goto_7

    :cond_b
    move/from16 v16, v18

    :goto_7
    or-int v7, v7, v16

    goto :goto_8

    :cond_c
    move-object/from16 v10, p3

    :goto_8
    and-int/lit8 v16, v4, 0x8

    const/16 v20, 0x2000

    if-eqz v16, :cond_d

    or-int/lit16 v7, v7, 0x6000

    goto :goto_a

    :cond_d
    and-int/lit16 v14, v0, 0x6000

    if-nez v14, :cond_f

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_9

    :cond_e
    move/from16 v14, v20

    :goto_9
    or-int/2addr v7, v14

    :cond_f
    :goto_a
    and-int/lit8 v14, v4, 0x10

    const/high16 v21, 0x30000

    if-eqz v14, :cond_10

    or-int v7, v7, v21

    move-object/from16 v15, p5

    goto :goto_c

    :cond_10
    and-int v21, v0, v21

    if-nez v21, :cond_12

    move-object/from16 v15, p5

    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_11

    const/high16 v22, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v22, 0x10000

    :goto_b
    or-int v7, v7, v22

    goto :goto_c

    :cond_12
    move-object/from16 v15, p5

    :goto_c
    const/high16 v22, 0x180000

    and-int v23, v0, v22

    if-nez v23, :cond_15

    and-int/lit8 v23, v4, 0x20

    if-nez v23, :cond_13

    move-object/from16 v12, p6

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_14

    const/high16 v24, 0x100000

    goto :goto_d

    :cond_13
    move-object/from16 v12, p6

    :cond_14
    const/high16 v24, 0x80000

    :goto_d
    or-int v7, v7, v24

    goto :goto_e

    :cond_15
    move-object/from16 v12, p6

    :goto_e
    and-int/lit8 v24, v4, 0x40

    const/high16 v25, 0xc00000

    if-eqz v24, :cond_16

    or-int v7, v7, v25

    move/from16 v11, p7

    goto :goto_10

    :cond_16
    and-int v25, v0, v25

    if-nez v25, :cond_18

    move/from16 v11, p7

    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v26

    if-eqz v26, :cond_17

    const/high16 v26, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v26, 0x400000

    :goto_f
    or-int v7, v7, v26

    goto :goto_10

    :cond_18
    move/from16 v11, p7

    :goto_10
    const/high16 v26, 0x6000000

    and-int v26, v0, v26

    if-nez v26, :cond_1b

    and-int/lit16 v13, v4, 0x80

    if-nez v13, :cond_19

    move-object/from16 v13, p8

    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_1a

    const/high16 v27, 0x4000000

    goto :goto_11

    :cond_19
    move-object/from16 v13, p8

    :cond_1a
    const/high16 v27, 0x2000000

    :goto_11
    or-int v7, v7, v27

    goto :goto_12

    :cond_1b
    move-object/from16 v13, p8

    :goto_12
    const/high16 v27, 0x30000000

    and-int v27, v0, v27

    if-nez v27, :cond_1e

    and-int/lit16 v0, v4, 0x100

    if-nez v0, :cond_1c

    move/from16 v27, v7

    move v0, v8

    move-wide/from16 v7, p9

    .end local v7    # "$dirty":I
    .end local v8    # "$dirty1":I
    .local v0, "$dirty1":I
    .local v27, "$dirty":I
    invoke-interface {v6, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v28

    if-eqz v28, :cond_1d

    const/high16 v28, 0x20000000

    goto :goto_13

    .end local v0    # "$dirty1":I
    .end local v27    # "$dirty":I
    .restart local v7    # "$dirty":I
    .restart local v8    # "$dirty1":I
    :cond_1c
    move/from16 v27, v7

    move v0, v8

    move-wide/from16 v7, p9

    .end local v7    # "$dirty":I
    .end local v8    # "$dirty1":I
    .restart local v0    # "$dirty1":I
    .restart local v27    # "$dirty":I
    :cond_1d
    const/high16 v28, 0x10000000

    :goto_13
    or-int v27, v27, v28

    goto :goto_14

    .end local v0    # "$dirty1":I
    .end local v27    # "$dirty":I
    .restart local v7    # "$dirty":I
    .restart local v8    # "$dirty1":I
    :cond_1e
    move/from16 v27, v7

    move v0, v8

    move-wide/from16 v7, p9

    .end local v7    # "$dirty":I
    .end local v8    # "$dirty1":I
    .restart local v0    # "$dirty1":I
    .restart local v27    # "$dirty":I
    :goto_14
    and-int/lit8 v28, v3, 0x6

    if-nez v28, :cond_21

    move/from16 v28, v0

    .end local v0    # "$dirty1":I
    .local v28, "$dirty1":I
    and-int/lit16 v0, v4, 0x200

    if-nez v0, :cond_1f

    move-wide/from16 v7, p11

    invoke-interface {v6, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v0

    if-eqz v0, :cond_20

    const/4 v0, 0x4

    goto :goto_15

    :cond_1f
    move-wide/from16 v7, p11

    :cond_20
    const/4 v0, 0x2

    :goto_15
    or-int v0, v28, v0

    move/from16 v28, v0

    .end local v28    # "$dirty1":I
    .restart local v0    # "$dirty1":I
    goto :goto_16

    :cond_21
    move-wide/from16 v7, p11

    move/from16 v28, v0

    .end local v0    # "$dirty1":I
    .restart local v28    # "$dirty1":I
    :goto_16
    and-int/lit16 v0, v4, 0x400

    if-eqz v0, :cond_22

    or-int/lit8 v28, v28, 0x30

    move/from16 v29, v0

    goto :goto_18

    :cond_22
    and-int/lit8 v29, v3, 0x30

    if-nez v29, :cond_24

    move/from16 v29, v0

    move/from16 v0, p13

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v30

    if-eqz v30, :cond_23

    const/16 v19, 0x20

    goto :goto_17

    :cond_23
    const/16 v19, 0x10

    :goto_17
    or-int v28, v28, v19

    goto :goto_18

    :cond_24
    move/from16 v29, v0

    move/from16 v0, p13

    :goto_18
    move/from16 v0, v28

    .end local v28    # "$dirty1":I
    .restart local v0    # "$dirty1":I
    and-int/lit16 v7, v4, 0x800

    if-eqz v7, :cond_25

    or-int/lit16 v0, v0, 0x180

    move-object/from16 v8, p14

    goto :goto_1a

    :cond_25
    and-int/lit16 v8, v3, 0x180

    if-nez v8, :cond_27

    move-object/from16 v8, p14

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_26

    const/16 v16, 0x100

    goto :goto_19

    :cond_26
    const/16 v16, 0x80

    :goto_19
    or-int v0, v0, v16

    goto :goto_1a

    :cond_27
    move-object/from16 v8, p14

    :goto_1a
    move/from16 p17, v0

    .end local v0    # "$dirty1":I
    .local p17, "$dirty1":I
    and-int/lit16 v0, v3, 0xc00

    if-nez v0, :cond_2a

    and-int/lit16 v0, v4, 0x1000

    if-nez v0, :cond_28

    move-object/from16 v0, p15

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_29

    goto :goto_1b

    :cond_28
    move-object/from16 v0, p15

    :cond_29
    move/from16 v17, v18

    :goto_1b
    or-int v16, p17, v17

    move/from16 v0, v16

    .end local p17    # "$dirty1":I
    .local v16, "$dirty1":I
    goto :goto_1c

    .end local v16    # "$dirty1":I
    .restart local p17    # "$dirty1":I
    :cond_2a
    move-object/from16 v0, p15

    move/from16 v0, p17

    .end local p17    # "$dirty1":I
    .restart local v0    # "$dirty1":I
    :goto_1c
    move/from16 v16, v7

    and-int/lit16 v7, v4, 0x2000

    if-eqz v7, :cond_2b

    or-int/lit16 v0, v0, 0x6000

    move-object/from16 v7, p16

    goto :goto_1d

    :cond_2b
    and-int/lit16 v7, v3, 0x6000

    if-nez v7, :cond_2d

    move-object/from16 v7, p16

    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2c

    const/16 v20, 0x4000

    :cond_2c
    or-int v0, v0, v20

    goto :goto_1d

    :cond_2d
    move-object/from16 v7, p16

    :goto_1d
    const v17, 0x12492493

    and-int v3, v27, v17

    const v7, 0x12492492

    if-ne v3, v7, :cond_2f

    and-int/lit16 v3, v0, 0x2493

    const/16 v7, 0x2492

    if-ne v3, v7, :cond_2f

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_2e

    goto :goto_1e

    .line 344
    :cond_2e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v14, p13

    move-object/from16 v16, p15

    move/from16 v22, v0

    move-object/from16 v21, v6

    move-object v7, v12

    move-object v9, v13

    move-object v6, v15

    move-wide/from16 v12, p11

    move-object v15, v8

    move v8, v11

    move-wide/from16 v10, p9

    goto/16 :goto_35

    .line 215
    :cond_2f
    :goto_1e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v3, p18, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_36

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v3

    if-eqz v3, :cond_30

    goto :goto_1f

    .line 213
    :cond_30
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v3, v4, 0x20

    if-eqz v3, :cond_31

    const v3, -0x380001

    and-int v27, v27, v3

    :cond_31
    and-int/lit16 v3, v4, 0x80

    if-eqz v3, :cond_32

    const v3, -0xe000001

    and-int v27, v27, v3

    :cond_32
    and-int/lit16 v3, v4, 0x100

    if-eqz v3, :cond_33

    const v3, -0x70000001

    and-int v27, v27, v3

    :cond_33
    and-int/lit16 v3, v4, 0x200

    if-eqz v3, :cond_34

    and-int/lit8 v0, v0, -0xf

    :cond_34
    and-int/lit16 v3, v4, 0x1000

    if-eqz v3, :cond_35

    and-int/lit16 v0, v0, -0x1c01

    :cond_35
    move-wide/from16 v9, p9

    move-wide/from16 v17, p11

    move v14, v0

    move-object/from16 v16, v8

    move v7, v11

    move-object v8, v13

    move-object v0, v15

    move/from16 v15, v27

    move/from16 v13, p13

    move-object/from16 v11, p15

    goto/16 :goto_24

    .line 215
    :cond_36
    :goto_1f
    if-eqz v14, :cond_37

    .line 205
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v15, v3

    .end local p5    # "modifier":Landroidx/compose/ui/Modifier;
    .local v15, "modifier":Landroidx/compose/ui/Modifier;
    :cond_37
    and-int/lit8 v3, v4, 0x20

    if-eqz v3, :cond_38

    .line 206
    const/4 v3, 0x3

    const/4 v14, 0x0

    invoke-static {v7, v14, v6, v7, v3}, Landroidx/compose/material3/ModalBottomSheetKt;->rememberModalBottomSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object v3

    .end local p6    # "sheetState":Landroidx/compose/material3/SheetState;
    .local v3, "sheetState":Landroidx/compose/material3/SheetState;
    const v12, -0x380001

    and-int v27, v27, v12

    move-object v12, v3

    .end local v3    # "sheetState":Landroidx/compose/material3/SheetState;
    .local v12, "sheetState":Landroidx/compose/material3/SheetState;
    :cond_38
    if-eqz v24, :cond_39

    .line 207
    sget-object v3, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v3}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetMaxWidth-D9Ej5fM()F

    move-result v3

    move v11, v3

    .end local p7    # "sheetMaxWidth":F
    .local v11, "sheetMaxWidth":F
    :cond_39
    and-int/lit16 v3, v4, 0x80

    const/4 v14, 0x6

    if-eqz v3, :cond_3a

    .line 208
    sget-object v3, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v3, v6, v14}, Landroidx/compose/material3/BottomSheetDefaults;->getExpandedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .end local p8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v3, "shape":Landroidx/compose/ui/graphics/Shape;
    const v13, -0xe000001

    and-int v27, v27, v13

    move-object v13, v3

    .end local v3    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v13, "shape":Landroidx/compose/ui/graphics/Shape;
    :cond_3a
    and-int/lit16 v3, v4, 0x100

    if-eqz v3, :cond_3b

    .line 209
    sget-object v3, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v3, v6, v14}, Landroidx/compose/material3/BottomSheetDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    .end local p9    # "containerColor":J
    .local v17, "containerColor":J
    const v3, -0x70000001

    and-int v27, v27, v3

    move-wide/from16 v7, v17

    goto :goto_20

    .line 208
    .end local v17    # "containerColor":J
    .restart local p9    # "containerColor":J
    :cond_3b
    move-wide/from16 v7, p9

    .line 209
    .end local p9    # "containerColor":J
    .local v7, "containerColor":J
    :goto_20
    and-int/lit16 v14, v4, 0x200

    if-eqz v14, :cond_3c

    .line 210
    shr-int/lit8 v14, v27, 0x1b

    and-int/lit8 v14, v14, 0xe

    invoke-static {v7, v8, v6, v14}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    .end local p11    # "contentColor":J
    .local v17, "contentColor":J
    and-int/lit8 v0, v0, -0xf

    goto :goto_21

    .line 209
    .end local v17    # "contentColor":J
    .restart local p11    # "contentColor":J
    :cond_3c
    move-wide/from16 v17, p11

    .line 210
    .end local p11    # "contentColor":J
    .restart local v17    # "contentColor":J
    :goto_21
    if-eqz v29, :cond_3d

    .line 211
    sget-object v14, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v14}, Landroidx/compose/material3/BottomSheetDefaults;->getElevation-D9Ej5fM()F

    move-result v14

    .end local p13    # "tonalElevation":F
    .local v14, "tonalElevation":F
    goto :goto_22

    .line 210
    .end local v14    # "tonalElevation":F
    .restart local p13    # "tonalElevation":F
    :cond_3d
    move/from16 v14, p13

    .line 211
    .end local p13    # "tonalElevation":F
    .restart local v14    # "tonalElevation":F
    :goto_22
    if-eqz v16, :cond_3e

    sget-object v16, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;->getLambda-2$material3_release()Lkotlin/jvm/functions/Function2;

    move-result-object v16

    .end local p14    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v16, "dragHandle":Lkotlin/jvm/functions/Function2;
    goto :goto_23

    .end local v16    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .restart local p14    # "dragHandle":Lkotlin/jvm/functions/Function2;
    :cond_3e
    move-object/from16 v16, p14

    .end local p14    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .restart local v16    # "dragHandle":Lkotlin/jvm/functions/Function2;
    :goto_23
    and-int/lit16 v3, v4, 0x1000

    if-eqz v3, :cond_3f

    .line 213
    sget-object v3, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$1;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$1;

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .end local p15    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .local v3, "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    and-int/lit16 v0, v0, -0x1c01

    move-wide v9, v7

    move v7, v11

    move-object v8, v13

    move v13, v14

    move v14, v0

    move-object v11, v3

    move-object v0, v15

    move/from16 v15, v27

    goto :goto_24

    .line 211
    .end local v3    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .restart local p15    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    :cond_3f
    move-wide v9, v7

    move v7, v11

    move-object v8, v13

    move v13, v14

    move-object/from16 v11, p15

    move v14, v0

    move-object v0, v15

    move/from16 v15, v27

    .line 213
    .end local v27    # "$dirty":I
    .end local p15    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .local v0, "modifier":Landroidx/compose/ui/Modifier;
    .local v7, "sheetMaxWidth":F
    .local v8, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v9, "containerColor":J
    .local v11, "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .local v13, "tonalElevation":F
    .local v14, "$dirty1":I
    .local v15, "$dirty":I
    :goto_24
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_40

    .line 215
    const v3, -0x63f46313

    const-string v4, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)"

    invoke-static {v3, v15, v14, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 216
    :cond_40
    sget-object v3, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .local v3, "this_$iv":Landroidx/compose/material3/internal/Strings$Companion;
    const/4 v4, 0x0

    .line 492
    .local v4, "$i$f$getBottomSheetPaneTitle-8iCLdWM":I
    sget v19, Landroidx/compose/material3/R$string;->m3c_bottom_sheet_pane_title:I

    invoke-static/range {v19 .. v19}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    move-result v3

    .line 216
    .end local v3    # "this_$iv":Landroidx/compose/material3/internal/Strings$Companion;
    .end local v4    # "$i$f$getBottomSheetPaneTitle-8iCLdWM":I
    const/4 v4, 0x0

    invoke-static {v3, v6, v4}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    .line 221
    move-object v4, v3

    .line 220
    .local v4, "bottomSheetPaneTitle":Ljava/lang/String;
    nop

    .line 221
    sget-object v19, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/Alignment$Companion;->getTopCenter()Landroidx/compose/ui/Alignment;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 222
    move-object/from16 v20, v0

    .end local v0    # "modifier":Landroidx/compose/ui/Modifier;
    .local v20, "modifier":Landroidx/compose/ui/Modifier;
    const/4 v0, 0x0

    const/4 v1, 0x1

    move-object/from16 p13, v8

    const/4 v8, 0x0

    .end local v8    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local p13, "shape":Landroidx/compose/ui/graphics/Shape;
    invoke-static {v3, v0, v7, v1, v8}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 223
    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 225
    const v3, 0x49c83473

    const-string v8, "CC(remember):ModalBottomSheet.kt#9igjgp"

    invoke-static {v6, v3, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v3, 0x380000

    and-int/2addr v3, v15

    xor-int v3, v3, v22

    const/high16 v1, 0x100000

    if-le v3, v1, :cond_41

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_42

    :cond_41
    and-int v1, v15, v22

    const/high16 v3, 0x100000

    if-ne v1, v3, :cond_43

    :cond_42
    const/4 v1, 0x1

    goto :goto_25

    :cond_43
    const/4 v1, 0x0

    .local v1, "invalid$iv":Z
    :goto_25
    move-object v3, v6

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v19, 0x0

    .line 493
    .local v19, "$i$f$cache":I
    move/from16 p6, v1

    .end local v1    # "invalid$iv":Z
    .local p6, "invalid$iv":Z
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 494
    .local v21, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p6, :cond_45

    sget-object v24, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v27, v7

    .end local v7    # "sheetMaxWidth":F
    .local v27, "sheetMaxWidth":F
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v1, v7, :cond_44

    goto :goto_26

    .line 498
    :cond_44
    move-object/from16 p7, v1

    goto :goto_27

    .line 494
    .end local v27    # "sheetMaxWidth":F
    .restart local v7    # "sheetMaxWidth":F
    :cond_45
    move/from16 v27, v7

    .line 495
    .end local v7    # "sheetMaxWidth":F
    .restart local v27    # "sheetMaxWidth":F
    :goto_26
    const/4 v7, 0x0

    .line 227
    .local v7, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$2":I
    nop

    .line 228
    move-object/from16 p7, v1

    .end local v1    # "it$iv":Ljava/lang/Object;
    .local p7, "it$iv":Ljava/lang/Object;
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 229
    nop

    .line 226
    invoke-static {v12, v1, v5}, Landroidx/compose/material3/SheetDefaultsKt;->ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v1

    .line 495
    .end local v7    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$2":I
    nop

    .line 496
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 497
    nop

    .line 494
    .end local v1    # "value$iv":Ljava/lang/Object;
    :goto_27
    nop

    .line 493
    .end local v21    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p7    # "it$iv":Ljava/lang/Object;
    nop

    .line 225
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v19    # "$i$f$cache":I
    .end local p6    # "invalid$iv":Z
    check-cast v1, Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 224
    const/4 v3, 0x2

    const/4 v7, 0x0

    invoke-static {v0, v1, v7, v3, v7}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt;->nestedScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 233
    invoke-virtual {v12}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v1

    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    const v7, 0x49c86f33

    invoke-static {v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v7, 0x380000

    and-int/2addr v7, v15

    xor-int v7, v7, v22

    move-wide/from16 v24, v9

    const/high16 v9, 0x100000

    .end local v9    # "containerColor":J
    .local v24, "containerColor":J
    if-le v7, v9, :cond_46

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_47

    :cond_46
    and-int v7, v15, v22

    const/high16 v9, 0x100000

    if-ne v7, v9, :cond_48

    :cond_47
    const/4 v7, 0x1

    goto :goto_28

    :cond_48
    const/4 v7, 0x0

    .local v7, "invalid$iv":Z
    :goto_28
    move-object v9, v6

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 499
    .local v10, "$i$f$cache":I
    move/from16 p6, v7

    .end local v7    # "invalid$iv":Z
    .restart local p6    # "invalid$iv":Z
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 500
    .local v19, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez p6, :cond_4a

    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p7, v10

    .end local v10    # "$i$f$cache":I
    .local p7, "$i$f$cache":I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v7, v10, :cond_49

    goto :goto_29

    .line 504
    :cond_49
    move-object/from16 p8, v7

    goto :goto_2a

    .line 500
    .end local p7    # "$i$f$cache":I
    .restart local v10    # "$i$f$cache":I
    :cond_4a
    move/from16 p7, v10

    .line 501
    .end local v10    # "$i$f$cache":I
    .restart local p7    # "$i$f$cache":I
    :goto_29
    const/4 v10, 0x0

    .line 233
    .local v10, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$3":I
    move-object/from16 p8, v7

    .end local v7    # "it$iv":Ljava/lang/Object;
    .local p8, "it$iv":Ljava/lang/Object;
    new-instance v7, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$3$1;

    invoke-direct {v7, v12}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$3$1;-><init>(Landroidx/compose/material3/SheetState;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 501
    .end local v10    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$3":I
    nop

    .line 502
    .local v7, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 503
    nop

    .line 500
    .end local v7    # "value$iv":Ljava/lang/Object;
    :goto_2a
    nop

    .line 499
    .end local v19    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local p8    # "it$iv":Ljava/lang/Object;
    nop

    .line 233
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p6    # "invalid$iv":Z
    .end local p7    # "$i$f$cache":I
    check-cast v7, Lkotlin/jvm/functions/Function2;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v0, v1, v3, v7}, Landroidx/compose/material3/internal/AnchoredDraggableKt;->draggableAnchors(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v28

    .line 264
    invoke-virtual {v12}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/internal/AnchoredDraggableState;->getDraggableState$material3_release()Landroidx/compose/foundation/gestures/DraggableState;

    move-result-object v29

    .line 265
    sget-object v30, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 266
    invoke-virtual {v12}, Landroidx/compose/material3/SheetState;->isVisible()Z

    move-result v31

    .line 263
    nop

    .line 267
    invoke-virtual {v12}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/internal/AnchoredDraggableState;->isAnimationRunning()Z

    move-result v33

    .line 263
    nop

    .line 268
    const v0, 0x49c94d86

    invoke-static {v6, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v0, 0xe000

    and-int/2addr v0, v15

    const/16 v1, 0x4000

    if-ne v0, v1, :cond_4b

    const/4 v0, 0x1

    goto :goto_2b

    :cond_4b
    const/4 v0, 0x0

    .local v0, "invalid$iv":Z
    :goto_2b
    move-object v1, v6

    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 505
    .local v3, "$i$f$cache":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 506
    .local v9, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_4d

    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v7, v10, :cond_4c

    goto :goto_2c

    .line 510
    :cond_4c
    move/from16 p6, v0

    move/from16 p7, v3

    move-object v0, v7

    goto :goto_2d

    .line 507
    :cond_4d
    :goto_2c
    const/4 v10, 0x0

    .line 268
    .local v10, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$4":I
    move/from16 p6, v0

    .end local v0    # "invalid$iv":Z
    .restart local p6    # "invalid$iv":Z
    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$4$1;

    move/from16 p7, v3

    const/4 v3, 0x0

    .end local v3    # "$i$f$cache":I
    .restart local p7    # "$i$f$cache":I
    invoke-direct {v0, v5, v3}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$4$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function3;

    .line 507
    .end local v10    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$4":I
    nop

    .line 508
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 509
    nop

    .line 506
    .end local v0    # "value$iv":Ljava/lang/Object;
    :goto_2d
    nop

    .line 505
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 268
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local p6    # "invalid$iv":Z
    .end local p7    # "$i$f$cache":I
    move-object/from16 v35, v0

    check-cast v35, Lkotlin/jvm/functions/Function3;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 263
    const/16 v37, 0xa8

    const/16 v38, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    invoke-static/range {v28 .. v38}, Landroidx/compose/foundation/gestures/DraggableKt;->draggable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 270
    const v1, 0x49c9567f

    invoke-static {v6, v1, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .local v1, "invalid$iv":Z
    move-object v3, v6

    .local v3, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 511
    .local v7, "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 512
    .local v10, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v1, :cond_4f

    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p6, v1

    .end local v1    # "invalid$iv":Z
    .restart local p6    # "invalid$iv":Z
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v9, v1, :cond_4e

    goto :goto_2e

    .line 516
    :cond_4e
    move-object v1, v9

    goto :goto_2f

    .line 512
    .end local p6    # "invalid$iv":Z
    .restart local v1    # "invalid$iv":Z
    :cond_4f
    move/from16 p6, v1

    .line 513
    .end local v1    # "invalid$iv":Z
    .restart local p6    # "invalid$iv":Z
    :goto_2e
    const/4 v1, 0x0

    .line 270
    .local v1, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$5":I
    move/from16 p7, v1

    .end local v1    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$5":I
    .local p7, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$5":I
    new-instance v1, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$5$1;

    invoke-direct {v1, v4}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$5$1;-><init>(Ljava/lang/String;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 513
    .end local p7    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$5":I
    nop

    .line 514
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 515
    nop

    .line 512
    .end local v1    # "value$iv":Ljava/lang/Object;
    :goto_2f
    nop

    .line 511
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 270
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    .end local p6    # "invalid$iv":Z
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x1

    invoke-static {v0, v3, v1, v9, v7}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 274
    const v1, 0x49c96a73    # 1649998.4f

    invoke-static {v6, v1, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v1, 0x380000

    and-int/2addr v1, v15

    xor-int v1, v1, v22

    const/high16 v9, 0x100000

    if-le v1, v9, :cond_50

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_51

    :cond_50
    and-int v1, v15, v22

    const/high16 v9, 0x100000

    if-ne v1, v9, :cond_52

    :cond_51
    const/4 v1, 0x1

    goto :goto_30

    :cond_52
    move v1, v3

    :goto_30
    and-int/lit8 v7, v15, 0x70

    const/16 v8, 0x20

    if-eq v7, v8, :cond_54

    and-int/lit8 v7, v15, 0x40

    if-eqz v7, :cond_53

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_53

    goto :goto_31

    :cond_53
    move v7, v3

    goto :goto_32

    :cond_54
    :goto_31
    const/4 v7, 0x1

    :goto_32
    or-int/2addr v1, v7

    .local v1, "invalid$iv":Z
    move-object v3, v6

    .restart local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 517
    .restart local v7    # "$i$f$cache":I
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 518
    .local v9, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v1, :cond_56

    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v8, v10, :cond_55

    goto :goto_33

    .line 522
    :cond_55
    move/from16 p5, v1

    move-object v1, v8

    goto :goto_34

    .line 519
    :cond_56
    :goto_33
    const/4 v10, 0x0

    .line 274
    .local v10, "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$6":I
    move/from16 p5, v1

    .end local v1    # "invalid$iv":Z
    .local p5, "invalid$iv":Z
    new-instance v1, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$6$1;

    invoke-direct {v1, v12, v2}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$6$1;-><init>(Landroidx/compose/material3/SheetState;Landroidx/compose/animation/core/Animatable;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 519
    .end local v10    # "$i$a$-cache-ModalBottomSheetKt$ModalBottomSheetContent$6":I
    nop

    .line 520
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 521
    nop

    .line 518
    .end local v1    # "value$iv":Ljava/lang/Object;
    :goto_34
    nop

    .line 517
    .end local v8    # "it$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 274
    .end local v3    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    .end local p5    # "invalid$iv":Z
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 285
    nop

    .line 286
    nop

    .line 287
    nop

    .line 288
    nop

    .line 289
    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$7;

    move-object/from16 p11, p2

    move-object/from16 p10, p3

    move-object/from16 p12, p16

    move-object/from16 p5, v0

    move-object/from16 p7, v2

    move-object/from16 p6, v11

    move-object/from16 p9, v12

    move-object/from16 p8, v16

    .end local v11    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .end local v12    # "sheetState":Landroidx/compose/material3/SheetState;
    .end local v16    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .local p6, "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .local p8, "dragHandle":Lkotlin/jvm/functions/Function2;
    .local p9, "sheetState":Landroidx/compose/material3/SheetState;
    invoke-direct/range {p5 .. p12}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$7;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)V

    move-object/from16 v1, p5

    move-object/from16 v3, p6

    move-object/from16 v2, p8

    move-object/from16 v0, p9

    .end local p6    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .end local p8    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .end local p9    # "sheetState":Landroidx/compose/material3/SheetState;
    .local v0, "sheetState":Landroidx/compose/material3/SheetState;
    .local v2, "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v3, "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    const/16 v8, 0x36

    const v9, -0x294949f8

    const/4 v10, 0x1

    invoke-static {v9, v10, v1, v6, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v1, v15, 0x15

    and-int/lit8 v1, v1, 0x70

    const/high16 v8, 0xc00000

    or-int/2addr v1, v8

    shr-int/lit8 v8, v15, 0x15

    and-int/lit16 v8, v8, 0x380

    or-int/2addr v1, v8

    shl-int/lit8 v8, v14, 0x9

    and-int/lit16 v8, v8, 0x1c00

    or-int/2addr v1, v8

    shl-int/lit8 v8, v14, 0x9

    const v9, 0xe000

    and-int/2addr v8, v9

    or-int/2addr v1, v8

    .line 218
    move v8, v14

    .end local v14    # "$dirty1":I
    .local v8, "$dirty1":I
    const/4 v14, 0x0

    move v9, v15

    .end local v15    # "$dirty":I
    .local v9, "$dirty":I
    const/4 v15, 0x0

    const/16 v19, 0x60

    move-wide/from16 v11, v17

    move/from16 v18, v1

    move-object/from16 v17, v6

    move v1, v8

    move/from16 v6, v27

    move-object/from16 v8, p13

    move/from16 v27, v9

    move-wide/from16 v9, v24

    .end local v24    # "containerColor":J
    .end local p13    # "shape":Landroidx/compose/ui/graphics/Shape;
    .local v1, "$dirty1":I
    .local v6, "sheetMaxWidth":F
    .local v8, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v9, "containerColor":J
    .local v11, "contentColor":J
    .local v17, "$composer":Landroidx/compose/runtime/Composer;
    .local v27, "$dirty":I
    invoke-static/range {v7 .. v19}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v21, v17

    .end local v17    # "$composer":Landroidx/compose/runtime/Composer;
    .local v21, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_57

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 344
    .end local v4    # "bottomSheetPaneTitle":Ljava/lang/String;
    :cond_57
    move-object v7, v0

    move/from16 v22, v1

    move-object v15, v2

    move-object/from16 v16, v3

    move v14, v13

    move-wide v12, v11

    move-wide v10, v9

    move-object v9, v8

    move v8, v6

    move-object/from16 v6, v20

    .end local v0    # "sheetState":Landroidx/compose/material3/SheetState;
    .end local v1    # "$dirty1":I
    .end local v2    # "dragHandle":Lkotlin/jvm/functions/Function2;
    .end local v3    # "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .end local v11    # "contentColor":J
    .end local v13    # "tonalElevation":F
    .end local v20    # "modifier":Landroidx/compose/ui/Modifier;
    .local v6, "modifier":Landroidx/compose/ui/Modifier;
    .local v7, "sheetState":Landroidx/compose/material3/SheetState;
    .local v8, "sheetMaxWidth":F
    .local v9, "shape":Landroidx/compose/ui/graphics/Shape;
    .local v10, "containerColor":J
    .local v12, "contentColor":J
    .local v14, "tonalElevation":F
    .local v15, "dragHandle":Lkotlin/jvm/functions/Function2;
    .local v16, "contentWindowInsets":Lkotlin/jvm/functions/Function2;
    .local v22, "$dirty1":I
    :goto_35
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_58

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$8;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v17, p16

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v39, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v20}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$8;-><init>(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v39

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_58
    return-void
.end method

.method private static final Scrim-3J-VO9M(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 22
    .param p0, "color"    # J
    .param p2, "onDismissRequest"    # Lkotlin/jvm/functions/Function0;
    .param p3, "visible"    # Z
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 408
    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p5

    const v0, 0x38bc6405

    move-object/from16 v6, p4

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    .end local p4    # "$composer":Landroidx/compose/runtime/Composer;
    .local v11, "$composer":Landroidx/compose/runtime/Composer;
    const-string v6, "C(Scrim)P(0:c#ui.graphics.Color)410@18376L87,411@18489L29,426@19112L79,426@19062L129:ModalBottomSheet.kt#uh7d8r"

    invoke-static {v11, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v6, p5

    .local v6, "$dirty":I
    and-int/lit8 v7, v5, 0x6

    if-nez v7, :cond_1

    invoke-interface {v11, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v6, v7

    :cond_1
    and-int/lit8 v7, v5, 0x30

    const/16 v15, 0x20

    if-nez v7, :cond_3

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v15

    goto :goto_1

    :cond_2
    const/16 v7, 0x10

    :goto_1
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_2

    :cond_4
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v6, 0x93

    const/16 v8, 0x92

    if-ne v7, v8, :cond_7

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_3

    .line 431
    :cond_6
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v16, v6

    goto/16 :goto_11

    .line 408
    :cond_7
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)"

    invoke-static {v0, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 409
    :cond_8
    move-wide/from16 v7, p0

    .local v7, "$this$isSpecified$iv":J
    const/4 v0, 0x0

    .line 523
    .local v0, "$i$f$isSpecified-8_81llA":I
    const-wide/16 v9, 0x10

    cmp-long v9, v7, v9

    const/4 v10, 0x1

    const/4 v12, 0x0

    if-eqz v9, :cond_9

    move v0, v10

    goto :goto_4

    :cond_9
    move v0, v12

    .line 409
    .end local v0    # "$i$f$isSpecified-8_81llA":I
    .end local v7    # "$this$isSpecified$iv":J
    :goto_4
    if-eqz v0, :cond_15

    .line 411
    if-eqz v4, :cond_a

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_a
    const/4 v7, 0x0

    :goto_5
    new-instance v16, Landroidx/compose/animation/core/TweenSpec;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Landroidx/compose/animation/core/TweenSpec;-><init>(IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v16, Landroidx/compose/animation/core/AnimationSpec;

    move v8, v12

    const/16 v12, 0x30

    const/16 v13, 0x1c

    move v9, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v0, v16

    move/from16 v16, v6

    move v6, v7

    move-object v7, v0

    move/from16 v0, v17

    move/from16 v14, v18

    .end local v6    # "$dirty":I
    .local v16, "$dirty":I
    invoke-static/range {v6 .. v13}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v6

    .line 410
    nop

    .line 412
    .local v6, "alpha$delegate":Landroidx/compose/runtime/State;
    sget-object v7, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .local v7, "this_$iv":Landroidx/compose/material3/internal/Strings$Companion;
    const/4 v8, 0x0

    .line 524
    .local v8, "$i$f$getCloseSheet-8iCLdWM":I
    sget v9, Landroidx/compose/ui/R$string;->close_sheet:I

    invoke-static {v9}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    move-result v7

    .line 412
    .end local v7    # "this_$iv":Landroidx/compose/material3/internal/Strings$Companion;
    .end local v8    # "$i$f$getCloseSheet-8iCLdWM":I
    invoke-static {v7, v11, v0}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    .local v7, "closeSheet":Ljava/lang/String;
    const v8, -0x6a6eea4e

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "414@18629L44,415@18730L263"

    invoke-static {v11, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 414
    const/4 v8, 0x0

    const-string v9, "CC(remember):ModalBottomSheet.kt#9igjgp"

    if-eqz v4, :cond_11

    .line 415
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v10, Landroidx/compose/ui/Modifier;

    const v12, -0x6a6ee331

    invoke-static {v11, v12, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v12, v16, 0x70

    if-ne v12, v15, :cond_b

    move v12, v14

    goto :goto_6

    :cond_b
    move v12, v0

    .local v12, "invalid$iv":Z
    :goto_6
    move-object v13, v11

    .local v13, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/16 v18, 0x0

    .line 525
    .local v18, "$i$f$cache":I
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 526
    .local v20, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v12, :cond_d

    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v0, v14, :cond_c

    goto :goto_7

    .line 530
    :cond_c
    move-object v15, v0

    goto :goto_8

    .line 527
    :cond_d
    :goto_7
    const/4 v14, 0x0

    .line 415
    .local v14, "$i$a$-cache-ModalBottomSheetKt$Scrim$dismissSheet$1":I
    new-instance v15, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$dismissSheet$1$1;

    invoke-direct {v15, v3, v8}, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$dismissSheet$1$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    check-cast v15, Lkotlin/jvm/functions/Function2;

    .line 527
    .end local v14    # "$i$a$-cache-ModalBottomSheetKt$Scrim$dismissSheet$1":I
    nop

    .line 528
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 529
    nop

    .line 526
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_8
    nop

    .line 525
    .end local v0    # "it$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 415
    .end local v12    # "invalid$iv":Z
    .end local v13    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v18    # "$i$f$cache":I
    check-cast v15, Lkotlin/jvm/functions/Function2;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v10, v3, v15}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 416
    const v10, -0x6a6ed5b6

    invoke-static {v11, v10, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    and-int/lit8 v12, v16, 0x70

    const/16 v13, 0x20

    if-ne v12, v13, :cond_e

    const/4 v12, 0x1

    goto :goto_9

    :cond_e
    const/4 v12, 0x0

    :goto_9
    or-int/2addr v10, v12

    .local v10, "invalid$iv":Z
    move-object v12, v11

    .local v12, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 531
    .local v13, "$i$f$cache":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 532
    .local v15, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v10, :cond_10

    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v14, v8, :cond_f

    goto :goto_a

    .line 536
    :cond_f
    move-object v4, v14

    goto :goto_b

    .line 533
    :cond_10
    :goto_a
    const/4 v8, 0x0

    .line 416
    .local v8, "$i$a$-cache-ModalBottomSheetKt$Scrim$dismissSheet$2":I
    new-instance v4, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$dismissSheet$2$1;

    invoke-direct {v4, v7, v3}, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$dismissSheet$2$1;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 533
    .end local v8    # "$i$a$-cache-ModalBottomSheetKt$Scrim$dismissSheet$2":I
    nop

    .line 534
    .local v4, "value$iv":Ljava/lang/Object;
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 535
    nop

    .line 532
    .end local v4    # "value$iv":Ljava/lang/Object;
    :goto_b
    nop

    .line 531
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 416
    .end local v10    # "invalid$iv":Z
    .end local v12    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache":I
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v14, 0x1

    invoke-static {v0, v14, v4}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_c

    .line 425
    :cond_11
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 414
    :goto_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 413
    nop

    .line 427
    .local v0, "dismissSheet":Landroidx/compose/ui/Modifier;
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x1

    invoke-static {v4, v10, v14, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-interface {v4, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v8, -0x6a6ea6ae

    invoke-static {v11, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v8, v16, 0xe

    const/4 v9, 0x4

    if-ne v8, v9, :cond_12

    move v10, v14

    goto :goto_d

    :cond_12
    const/4 v10, 0x0

    :goto_d
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v8, v10

    .local v8, "invalid$iv":Z
    move-object v9, v11

    .local v9, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v10, 0x0

    .line 537
    .local v10, "$i$f$cache":I
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .local v12, "it$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 538
    .local v13, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v8, :cond_14

    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v12, v14, :cond_13

    goto :goto_e

    .line 542
    :cond_13
    move-object v15, v12

    goto :goto_f

    .line 539
    :cond_14
    :goto_e
    const/4 v14, 0x0

    .line 427
    .local v14, "$i$a$-cache-ModalBottomSheetKt$Scrim$1":I
    new-instance v15, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$1$1;

    invoke-direct {v15, v1, v2, v6}, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$1$1;-><init>(JLandroidx/compose/runtime/State;)V

    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 539
    .end local v14    # "$i$a$-cache-ModalBottomSheetKt$Scrim$1":I
    nop

    .line 540
    .local v15, "value$iv":Ljava/lang/Object;
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 541
    nop

    .line 538
    .end local v15    # "value$iv":Ljava/lang/Object;
    :goto_f
    nop

    .line 537
    .end local v12    # "it$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-ComposerKt$cache$1$iv":I
    nop

    .line 427
    .end local v8    # "invalid$iv":Z
    .end local v9    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v10    # "$i$f$cache":I
    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v8, 0x0

    invoke-static {v4, v15, v11, v8}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_10

    .line 409
    .end local v0    # "dismissSheet":Landroidx/compose/ui/Modifier;
    .end local v7    # "closeSheet":Ljava/lang/String;
    .end local v16    # "$dirty":I
    .local v6, "$dirty":I
    :cond_15
    move/from16 v16, v6

    .line 427
    .end local v6    # "$dirty":I
    .restart local v16    # "$dirty":I
    :goto_10
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 431
    :cond_16
    :goto_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_17

    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$2;

    move/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$2;-><init>(JLkotlin/jvm/functions/Function0;ZI)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_17
    return-void
.end method

.method private static final Scrim_3J_VO9M$lambda$10(Landroidx/compose/runtime/State;)F
    .locals 4
    .param p0, "$alpha$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    .line 410
    nop

    .line 411
    const/4 v0, 0x0

    move-object v1, v0

    .local v1, "thisObj$iv":Ljava/lang/Object;
    move-object v2, p0

    .local v0, "property$iv":Lkotlin/reflect/KProperty;
    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 543
    .local v3, "$i$f$getValue":I
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v1    # "thisObj$iv":Ljava/lang/Object;
    .end local v2    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v3    # "$i$f$getValue":I
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    .line 411
    return v0
.end method

.method public static final synthetic access$Scrim-3J-VO9M(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 0
    .param p0, "color"    # J
    .param p2, "onDismissRequest"    # Lkotlin/jvm/functions/Function0;
    .param p3, "visible"    # Z
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/ModalBottomSheetKt;->Scrim-3J-VO9M(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$Scrim_3J_VO9M$lambda$10(Landroidx/compose/runtime/State;)F
    .locals 1
    .param p0, "$alpha$delegate"    # Landroidx/compose/runtime/State;

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/ModalBottomSheetKt;->Scrim_3J_VO9M$lambda$10(Landroidx/compose/runtime/State;)F

    move-result v0

    return v0
.end method

.method public static final synthetic access$calculatePredictiveBackScaleX(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "progress"    # F

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/ModalBottomSheetKt;->calculatePredictiveBackScaleX(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F

    move-result v0

    return v0
.end method

.method public static final synthetic access$calculatePredictiveBackScaleY(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "progress"    # F

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/ModalBottomSheetKt;->calculatePredictiveBackScaleY(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F

    move-result v0

    return v0
.end method

.method public static final synthetic access$getPredictiveBackChildTransformOrigin$p()J
    .locals 2

    .line 1
    sget-wide v0, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackChildTransformOrigin:J

    return-wide v0
.end method

.method private static final calculatePredictiveBackScaleX(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 4
    .param p0, "$this$calculatePredictiveBackScaleX"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "progress"    # F

    .line 347
    invoke-interface {p0}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v0

    .line 348
    .local v0, "width":F
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v1, :cond_2

    const/4 v1, 0x0

    cmpg-float v3, v0, v1

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    .line 351
    :cond_1
    sget v3, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackMaxScaleXDistance:F

    invoke-interface {p0, v3}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->toPx-0680j_4(F)F

    move-result v3

    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v1, v3, p1}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result v1

    div-float/2addr v1, v0

    sub-float/2addr v2, v1

    goto :goto_2

    .line 349
    :cond_2
    :goto_1
    nop

    .line 348
    :goto_2
    return v2
.end method

.method private static final calculatePredictiveBackScaleY(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 4
    .param p0, "$this$calculatePredictiveBackScaleY"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "progress"    # F

    .line 356
    invoke-interface {p0}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v0

    .line 357
    .local v0, "height":F
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v1, :cond_2

    const/4 v1, 0x0

    cmpg-float v3, v0, v1

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    .line 360
    :cond_1
    sget v3, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackMaxScaleYDistance:F

    invoke-interface {p0, v3}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->toPx-0680j_4(F)F

    move-result v3

    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v1, v3, p1}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result v1

    div-float/2addr v1, v0

    sub-float/2addr v2, v1

    goto :goto_2

    .line 358
    :cond_2
    :goto_1
    nop

    .line 357
    :goto_2
    return v2
.end method

.method public static final rememberModalBottomSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;
    .locals 8
    .param p0, "skipPartiallyExpanded"    # Z
    .param p1, "confirmValueChange"    # Lkotlin/jvm/functions/Function1;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/material3/SheetValue;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material3/SheetState;"
        }
    .end annotation

    .line 401
    const v0, -0x2e63272e

    const-string v1, "C(rememberModalBottomSheetState)P(1)400@18058L160:ModalBottomSheet.kt#uh7d8r"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    .line 398
    const/4 p0, 0x0

    move v1, p0

    goto :goto_0

    .line 401
    :cond_0
    move v1, p0

    .line 398
    .end local p0    # "skipPartiallyExpanded":Z
    .local v1, "skipPartiallyExpanded":Z
    :goto_0
    and-int/lit8 p0, p4, 0x2

    if-eqz p0, :cond_1

    .line 399
    sget-object p0, Landroidx/compose/material3/ModalBottomSheetKt$rememberModalBottomSheetState$1;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetKt$rememberModalBottomSheetState$1;

    move-object p1, p0

    check-cast p1, Lkotlin/jvm/functions/Function1;

    move-object v2, p1

    goto :goto_1

    .line 398
    :cond_1
    move-object v2, p1

    .line 399
    .end local p1    # "confirmValueChange":Lkotlin/jvm/functions/Function1;
    .local v2, "confirmValueChange":Lkotlin/jvm/functions/Function1;
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 401
    const/4 p0, -0x1

    const-string p1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)"

    invoke-static {v0, p3, p0, p1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 402
    :cond_2
    nop

    .line 403
    nop

    .line 404
    sget-object v3, Landroidx/compose/material3/SheetValue;->Hidden:Landroidx/compose/material3/SheetValue;

    and-int/lit8 p0, p3, 0xe

    or-int/lit16 p0, p0, 0x180

    and-int/lit8 p1, p3, 0x70

    or-int v6, p0, p1

    .line 401
    const/4 v4, 0x0

    const/16 v7, 0x8

    move-object v5, p2

    .end local p2    # "$composer":Landroidx/compose/runtime/Composer;
    .local v5, "$composer":Landroidx/compose/runtime/Composer;
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/SheetDefaultsKt;->rememberSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object p0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object p0
.end method
