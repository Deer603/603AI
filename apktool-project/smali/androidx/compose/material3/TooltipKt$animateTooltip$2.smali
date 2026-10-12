.class final Landroidx/compose/material3/TooltipKt$animateTooltip$2;
.super Lkotlin/jvm/internal/Lambda;
.source "Tooltip.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TooltipKt;->animateTooltip(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/ui/Modifier;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,645:1\n1967#2:646\n1882#2,7:647\n1967#2:654\n1882#2,7:655\n81#3:662\n81#3:663\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n*L\n586#1:646\n586#1:647,7\n608#1:654\n608#1:655,7\n586#1:662\n608#1:663\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/Modifier;",
        "invoke",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $transition:Landroidx/compose/animation/core/Transition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Transition<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/animation/core/Transition;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Transition<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material3/TooltipKt$animateTooltip$2;->$transition:Landroidx/compose/animation/core/Transition;

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda$1(Landroidx/compose/runtime/State;)F
    .locals 4
    .param p0, "$scale$delegate"    # Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    .line 585
    nop

    .line 586
    const/4 v0, 0x0

    move-object v1, v0

    .local v1, "thisObj$iv":Ljava/lang/Object;
    move-object v2, p0

    .local v0, "property$iv":Lkotlin/reflect/KProperty;
    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 662
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

    .line 586
    return v0
.end method

.method private static final invoke$lambda$3(Landroidx/compose/runtime/State;)F
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

    .line 607
    nop

    .line 608
    const/4 v0, 0x0

    move-object v1, v0

    .local v1, "thisObj$iv":Ljava/lang/Object;
    move-object v2, p0

    .local v0, "property$iv":Lkotlin/reflect/KProperty;
    .local v2, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v3, 0x0

    .line 663
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

    .line 608
    return v0
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 35
    .param p1, "$this$composed"    # Landroidx/compose/ui/Modifier;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    const v1, -0x59518a75

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "C585@24638L747,607@25431L561:Tooltip.kt#uh7d8r"

    invoke-static {v7, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    const/4 v9, -0x1

    if-eqz v2, :cond_0

    .line 585
    const-string v2, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:584)"

    move/from16 v10, p3

    invoke-static {v1, v10, v9, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    .line 0
    :cond_0
    move/from16 v10, p3

    .line 586
    :goto_0
    iget-object v1, v0, Landroidx/compose/material3/TooltipKt$animateTooltip$2;->$transition:Landroidx/compose/animation/core/Transition;

    sget-object v2, Landroidx/compose/material3/TooltipKt$animateTooltip$2$scale$2;->INSTANCE:Landroidx/compose/material3/TooltipKt$animateTooltip$2$scale$2;

    check-cast v2, Lkotlin/jvm/functions/Function3;

    .line 602
    nop

    .line 586
    move-object v11, v2

    .local v11, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/16 v12, 0x180

    move v13, v12

    .local v13, "$changed$iv":I
    const-string/jumbo v6, "tooltip transition: scaling"

    .local v6, "label$iv":Ljava/lang/String;
    move-object v14, v1

    .local v14, "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    const/4 v15, 0x0

    .line 646
    .local v15, "$i$f$animateFloat":I
    const v1, -0x4fcbfb15

    const-string v2, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli"

    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v3, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v3}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .local v5, "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v3, v13, 0xe

    shl-int/lit8 v4, v13, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shl-int/lit8 v4, v13, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shl-int/lit8 v4, v13, 0x3

    const v16, 0xe000

    and-int v4, v4, v16

    or-int v17, v3, v4

    move v3, v1

    .local v17, "$changed$iv$iv":I
    move-object v1, v14

    .local v1, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    const/16 v18, 0x0

    .line 647
    .local v18, "$i$f$animateValue":I
    const v4, -0x880d1ef

    const-string v8, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli"

    invoke-static {v7, v4, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 649
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v19

    shr-int/lit8 v20, v17, 0x9

    and-int/lit8 v3, v20, 0x70

    .local v3, "$changed":I
    check-cast v19, Ljava/lang/Boolean;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v19

    .local v19, "it":Z
    move-object/from16 v20, p2

    .local v20, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v22, 0x0

    .local v22, "$i$a$-animateFloat-TooltipKt$animateTooltip$2$scale$3":I
    const v4, -0x5c966d11

    move/from16 v24, v12

    move-object/from16 v12, v20

    .end local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .local v12, "$composer":Landroidx/compose/runtime/Composer;
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v4, "C:Tooltip.kt#uh7d8r"

    invoke-static {v12, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v25

    const-string v9, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:603)"

    if-eqz v25, :cond_1

    .line 604
    move-object/from16 v25, v1

    move-object/from16 v27, v2

    const v1, -0x5c966d11

    const/4 v2, -0x1

    .end local v1    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v25, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static {v1, v3, v2, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_1

    .line 649
    .end local v25    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v1    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    :cond_1
    move-object/from16 v25, v1

    move-object/from16 v27, v2

    .line 604
    .end local v1    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v25    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    :goto_1
    const/high16 v28, 0x3f800000    # 1.0f

    if-eqz v19, :cond_2

    move/from16 v2, v28

    goto :goto_2

    :cond_2
    const v2, 0x3f4ccccd    # 0.8f

    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v29

    if-eqz v29, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v3    # "$changed":I
    .end local v12    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v19    # "it":Z
    .end local v22    # "$i$a$-animateFloat-TooltipKt$animateTooltip$2$scale$3":I
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 649
    nop

    .line 650
    .local v2, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v3

    shr-int/lit8 v12, v17, 0x9

    and-int/lit8 v12, v12, 0x70

    .local v12, "$changed":I
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .local v3, "it":Z
    move-object/from16 v19, p2

    .local v19, "$composer":Landroidx/compose/runtime/Composer;
    const/16 v22, 0x0

    move-object/from16 v1, v19

    move-object/from16 v19, v2

    const v2, -0x5c966d11

    .end local v2    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v1, "$composer":Landroidx/compose/runtime/Composer;
    .local v19, "initialValue$iv$iv":Ljava/lang/Object;
    .restart local v22    # "$i$a$-animateFloat-TooltipKt$animateTooltip$2$scale$3":I
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v1, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v20

    if-eqz v20, :cond_4

    .line 604
    move-object/from16 v20, v1

    const/4 v1, -0x1

    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v20    # "$composer":Landroidx/compose/runtime/Composer;
    invoke-static {v2, v12, v1, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_3

    .line 650
    .end local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v1    # "$composer":Landroidx/compose/runtime/Composer;
    :cond_4
    move-object/from16 v20, v1

    .line 604
    .end local v1    # "$composer":Landroidx/compose/runtime/Composer;
    .restart local v20    # "$composer":Landroidx/compose/runtime/Composer;
    :goto_3
    if-eqz v3, :cond_5

    move/from16 v1, v28

    goto :goto_4

    :cond_5
    const v1, 0x3f4ccccd    # 0.8f

    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v3    # "it":Z
    .end local v12    # "$changed":I
    .end local v20    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v22    # "$i$a$-animateFloat-TooltipKt$animateTooltip$2$scale$3":I
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 650
    nop

    .line 651
    .local v3, "targetValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v1

    shr-int/lit8 v2, v17, 0x3

    and-int/lit8 v2, v2, 0x70

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v1, v7, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 653
    .local v1, "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v2, v17, 0xe

    shl-int/lit8 v9, v17, 0x9

    and-int v9, v9, v16

    or-int/2addr v2, v9

    shl-int/lit8 v9, v17, 0x6

    const/high16 v12, 0x70000

    and-int/2addr v9, v12

    or-int/2addr v2, v9

    move-object/from16 v30, v4

    move-object v9, v8

    const v10, -0x4fcbfb15

    move-object v4, v1

    move v8, v2

    move-object/from16 v2, v19

    move-object/from16 v1, v25

    move/from16 v19, v12

    move-object/from16 v12, v27

    .end local v19    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v25    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v1, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v2    # "initialValue$iv$iv":Ljava/lang/Object;
    .local v4, "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .line 647
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 653
    nop

    .line 646
    .end local v1    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v17    # "$changed$iv$iv":I
    .end local v18    # "$i$f$animateValue":I
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 586
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v11    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v13    # "$changed$iv":I
    .end local v14    # "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    .end local v15    # "$i$f$animateFloat":I
    nop

    .line 585
    move-object v11, v8

    .line 608
    .local v11, "scale$delegate":Landroidx/compose/runtime/State;
    iget-object v1, v0, Landroidx/compose/material3/TooltipKt$animateTooltip$2;->$transition:Landroidx/compose/animation/core/Transition;

    sget-object v2, Landroidx/compose/material3/TooltipKt$animateTooltip$2$alpha$2;->INSTANCE:Landroidx/compose/material3/TooltipKt$animateTooltip$2$alpha$2;

    check-cast v2, Lkotlin/jvm/functions/Function3;

    .line 618
    nop

    .line 608
    move-object v13, v1

    .local v13, "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    const-string/jumbo v6, "tooltip transition: alpha"

    .restart local v6    # "label$iv":Ljava/lang/String;
    .local v24, "$changed$iv":I
    move-object v14, v2

    .local v14, "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    const/4 v15, 0x0

    .line 654
    .restart local v15    # "$i$f$animateFloat":I
    invoke-static {v7, v10, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;

    move-result-object v5

    .restart local v5    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    and-int/lit8 v1, v24, 0xe

    shl-int/lit8 v2, v24, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, v24, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v2, v24, 0x3

    and-int v2, v2, v16

    or-int/2addr v1, v2

    .local v1, "$changed$iv$iv":I
    move v10, v1

    .end local v1    # "$changed$iv$iv":I
    .local v10, "$changed$iv$iv":I
    move-object v1, v13

    .local v1, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    const/4 v12, 0x0

    .line 655
    .local v12, "$i$f$animateValue":I
    const v2, -0x880d1ef

    invoke-static {v7, v2, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 657
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    shr-int/lit8 v3, v10, 0x9

    and-int/lit8 v3, v3, 0x70

    .local v3, "$changed":I
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .local v2, "it":Z
    move-object/from16 v4, p2

    .local v4, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .local v8, "$i$a$-animateFloat-TooltipKt$animateTooltip$2$alpha$3":I
    const v9, 0x7b90285b

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    move-object/from16 v9, v30

    invoke-static {v4, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v18

    if-eqz v18, :cond_7

    .line 620
    const-string v0, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)"

    move-object/from16 v18, v1

    move/from16 v20, v2

    const v1, 0x7b90285b

    const/4 v2, -0x1

    .end local v1    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "it":Z
    .local v18, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v20, "it":Z
    invoke-static {v1, v3, v2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_5

    .line 657
    .end local v18    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v20    # "it":Z
    .restart local v1    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v2    # "it":Z
    :cond_7
    move-object/from16 v18, v1

    move/from16 v20, v2

    .line 620
    .end local v1    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "it":Z
    .restart local v18    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .restart local v20    # "it":Z
    :goto_5
    if-eqz v20, :cond_8

    move/from16 v0, v28

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v3    # "$changed":I
    .end local v4    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$a$-animateFloat-TooltipKt$animateTooltip$2$alpha$3":I
    .end local v20    # "it":Z
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 657
    nop

    .line 658
    .local v2, "initialValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v0

    shr-int/lit8 v1, v10, 0x9

    and-int/lit8 v1, v1, 0x70

    .local v1, "$changed":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .local v0, "it":Z
    move-object/from16 v3, p2

    .local v3, "$composer":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    const v8, 0x7b90285b

    .local v4, "$i$a$-animateFloat-TooltipKt$animateTooltip$2$alpha$3":I
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_a

    .line 620
    const-string v9, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)"

    move/from16 v17, v0

    const/4 v0, -0x1

    .end local v0    # "it":Z
    .local v17, "it":Z
    invoke-static {v8, v1, v0, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_7

    .line 658
    .end local v17    # "it":Z
    .restart local v0    # "it":Z
    :cond_a
    move/from16 v17, v0

    .line 620
    .end local v0    # "it":Z
    .restart local v17    # "it":Z
    :goto_7
    if-eqz v17, :cond_b

    goto :goto_8

    :cond_b
    const/16 v28, 0x0

    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_c
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .end local v1    # "$changed":I
    .end local v3    # "$composer":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$a$-animateFloat-TooltipKt$animateTooltip$2$alpha$3":I
    .end local v17    # "it":Z
    invoke-static/range {v28 .. v28}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 658
    nop

    .line 659
    .local v3, "targetValue$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    move-result-object v0

    shr-int/lit8 v1, v10, 0x3

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v14, v0, v7, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 661
    .local v4, "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    and-int/lit8 v0, v10, 0xe

    shl-int/lit8 v1, v10, 0x9

    and-int v1, v1, v16

    or-int/2addr v0, v1

    shl-int/lit8 v1, v10, 0x6

    and-int v1, v1, v19

    or-int v8, v0, v1

    move-object/from16 v1, v18

    .end local v18    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .local v1, "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 655
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 661
    nop

    .line 654
    .end local v1    # "$this$animateValue$iv$iv":Landroidx/compose/animation/core/Transition;
    .end local v2    # "initialValue$iv$iv":Ljava/lang/Object;
    .end local v3    # "targetValue$iv$iv":Ljava/lang/Object;
    .end local v4    # "animationSpec$iv$iv":Landroidx/compose/animation/core/FiniteAnimationSpec;
    .end local v5    # "typeConverter$iv$iv":Landroidx/compose/animation/core/TwoWayConverter;
    .end local v10    # "$changed$iv$iv":I
    .end local v12    # "$i$f$animateValue":I
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 608
    .end local v6    # "label$iv":Ljava/lang/String;
    .end local v13    # "$this$animateFloat$iv":Landroidx/compose/animation/core/Transition;
    .end local v14    # "transitionSpec$iv":Lkotlin/jvm/functions/Function3;
    .end local v15    # "$i$f$animateFloat":I
    .end local v24    # "$changed$iv":I
    nop

    .line 607
    nop

    .line 623
    .local v0, "alpha$delegate":Landroidx/compose/runtime/State;
    invoke-static {v11}, Landroidx/compose/material3/TooltipKt$animateTooltip$2;->invoke$lambda$1(Landroidx/compose/runtime/State;)F

    move-result v13

    invoke-static {v11}, Landroidx/compose/material3/TooltipKt$animateTooltip$2;->invoke$lambda$1(Landroidx/compose/runtime/State;)F

    move-result v14

    invoke-static {v0}, Landroidx/compose/material3/TooltipKt$animateTooltip$2;->invoke$lambda$3(Landroidx/compose/runtime/State;)F

    move-result v15

    const v33, 0x1fff8

    const/16 v34, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v34}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer-Ap8cVGQ$default(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJIILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_d
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;
    .param p3, "p3"    # Ljava/lang/Object;

    .line 578
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Landroidx/compose/material3/TooltipKt$animateTooltip$2;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method
