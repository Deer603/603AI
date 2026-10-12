.class final Landroidx/compose/material/SliderKt$Slider$2;
.super Lkotlin/jvm/internal/Lambda;
.source "Slider.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SliderKt;->Slider(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1290:1\n75#2:1291\n75#2:1292\n557#3:1293\n554#3,6:1294\n1247#4,3:1300\n1250#4,3:1304\n1247#4,6:1307\n1247#4,6:1313\n1247#4,6:1319\n1247#4,6:1325\n1247#4,6:1331\n1247#4,6:1337\n555#5:1303\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n*L\n197#1:1291\n202#1:1292\n213#1:1293\n213#1:1294,6\n213#1:1300,3\n213#1:1304,3\n214#1:1307,6\n215#1:1313,6\n218#1:1319,6\n227#1:1325,6\n230#1:1331,6\n261#1:1337,6\n213#1:1303\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
        "invoke",
        "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $colors:Landroidx/compose/material/SliderColors;

.field final synthetic $enabled:Z

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $onValueChangeFinished:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onValueChangeState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $tickFractions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $value:F

.field final synthetic $valueRange:Lkotlin/ranges/ClosedFloatingPointRange;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/ranges/ClosedFloatingPointRange;FLjava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/material/SliderColors;Landroidx/compose/runtime/State;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;F",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
            "Landroidx/compose/material/SliderColors;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    iput p2, p0, Landroidx/compose/material/SliderKt$Slider$2;->$value:F

    iput-object p3, p0, Landroidx/compose/material/SliderKt$Slider$2;->$tickFractions:Ljava/util/List;

    iput-object p4, p0, Landroidx/compose/material/SliderKt$Slider$2;->$onValueChangeFinished:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Landroidx/compose/material/SliderKt$Slider$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-boolean p6, p0, Landroidx/compose/material/SliderKt$Slider$2;->$enabled:Z

    iput-object p7, p0, Landroidx/compose/material/SliderKt$Slider$2;->$colors:Landroidx/compose/material/SliderColors;

    iput-object p8, p0, Landroidx/compose/material/SliderKt$Slider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F
    .locals 1
    .param p0, "$valueRange"    # Lkotlin/ranges/ClosedFloatingPointRange;
    .param p1, "minPx"    # Lkotlin/jvm/internal/Ref$FloatRef;
    .param p2, "maxPx"    # Lkotlin/jvm/internal/Ref$FloatRef;
    .param p3, "userValue"    # F

    .line 196
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/SliderKt$Slider$2;->invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F

    move-result v0

    return v0
.end method

.method public static final synthetic access$invoke$scaleToUserValue(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/ranges/ClosedFloatingPointRange;F)F
    .locals 1
    .param p0, "minPx"    # Lkotlin/jvm/internal/Ref$FloatRef;
    .param p1, "maxPx"    # Lkotlin/jvm/internal/Ref$FloatRef;
    .param p2, "$valueRange"    # Lkotlin/ranges/ClosedFloatingPointRange;
    .param p3, "offset"    # F

    .line 196
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/SliderKt$Slider$2;->invoke$scaleToUserValue(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/ranges/ClosedFloatingPointRange;F)F

    move-result v0

    return v0
.end method

.method private static final invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F
    .locals 4
    .param p0, "$valueRange"    # Lkotlin/ranges/ClosedFloatingPointRange;
    .param p1, "minPx"    # Lkotlin/jvm/internal/Ref$FloatRef;
    .param p2, "maxPx"    # Lkotlin/jvm/internal/Ref$FloatRef;
    .param p3, "userValue"    # F
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "F)F"
        }
    .end annotation

    .line 211
    invoke-interface {p0}, Lkotlin/ranges/ClosedFloatingPointRange;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {p0}, Lkotlin/ranges/ClosedFloatingPointRange;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget v2, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    iget v3, p2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-static {v0, v1, p3, v2, v3}, Landroidx/compose/material/SliderKt;->access$scale(FFFFF)F

    move-result v0

    return v0
.end method

.method private static final invoke$scaleToUserValue(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/ranges/ClosedFloatingPointRange;F)F
    .locals 4
    .param p0, "minPx"    # Lkotlin/jvm/internal/Ref$FloatRef;
    .param p1, "maxPx"    # Lkotlin/jvm/internal/Ref$FloatRef;
    .param p2, "$valueRange"    # Lkotlin/ranges/ClosedFloatingPointRange;
    .param p3, "offset"    # F
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;F)F"
        }
    .end annotation

    .line 208
    iget v0, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    iget v1, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-interface {p2}, Lkotlin/ranges/ClosedFloatingPointRange;->getStart()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-interface {p2}, Lkotlin/ranges/ClosedFloatingPointRange;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v0, v1, p3, v2, v3}, Landroidx/compose/material/SliderKt;->access$scale(FFFFF)F

    move-result v0

    return v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;
    .param p3, "p3"    # Ljava/lang/Object;

    .line 196
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    move-object v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Landroidx/compose/material/SliderKt$Slider$2;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .param p1, "$this$BoxWithConstraints"    # Landroidx/compose/foundation/layout/BoxWithConstraintsScope;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v6, p2

    const-string v1, "C196@9102L7,*201@9263L7,212@9677L24,213@9726L54,214@9807L36,217@9886L420,226@10339L15,226@10316L83,229@10482L633,229@10444L671,260@11689L55,267@12042L209:Slider.kt#jmzs0o"

    invoke-static {v6, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v1, p3

    .local v1, "$dirty":I
    and-int/lit8 v2, p3, 0x6

    move-object/from16 v10, p1

    if-nez v2, :cond_1

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v1, v2

    :cond_1
    move v11, v1

    .line 197
    .end local v1    # "$dirty":I
    .local v11, "$dirty":I
    and-int/lit8 v1, v11, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    const/4 v8, 0x0

    if-eq v1, v2, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    move v1, v8

    :goto_1
    and-int/lit8 v2, v11, 0x1

    invoke-interface {v6, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.Slider.<anonymous> (Slider.kt:196)"

    const v4, 0x7c485b8e

    invoke-static {v4, v11, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    .local v1, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v2, 0x0

    .local v2, "$changed$iv":I
    const/4 v4, 0x0

    .line 1291
    .local v4, "$i$f$getCurrent":I
    const v5, 0x789c5f52

    const-string v7, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v6, v5, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 197
    .end local v1    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v2    # "$changed$iv":I
    .end local v4    # "$i$f$getCurrent":I
    sget-object v1, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    if-ne v9, v1, :cond_4

    goto :goto_2

    :cond_4
    move v3, v8

    :goto_2
    move/from16 v16, v3

    .line 198
    .local v16, "isRtl":Z
    invoke-interface {v10}, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;->getConstraints-msEJaDk()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v1

    int-to-float v15, v1

    .line 199
    .local v15, "widthPx":F
    new-instance v1, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 200
    .local v1, "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    new-instance v20, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct/range {v20 .. v20}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    move-object/from16 v2, v20

    .line 202
    .local v2, "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    check-cast v3, Landroidx/compose/runtime/CompositionLocal;

    .local v3, "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    const/4 v4, 0x0

    .local v4, "$changed$iv":I
    const/4 v9, 0x0

    .line 1292
    .local v9, "$i$f$getCurrent":I
    invoke-static {v6, v5, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 202
    .end local v3    # "this_$iv":Landroidx/compose/runtime/CompositionLocal;
    .end local v4    # "$changed$iv":I
    .end local v9    # "$i$f$getCurrent":I
    move-object v3, v5

    check-cast v3, Landroidx/compose/ui/unit/Density;

    .local v3, "$this$invoke_u24lambda_u240":Landroidx/compose/ui/unit/Density;
    const/4 v4, 0x0

    .line 203
    .local v4, "$i$a$-with-SliderKt$Slider$2$1":I
    invoke-static {}, Landroidx/compose/material/SliderKt;->getThumbRadius()F

    move-result v5

    invoke-interface {v3, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v5

    sub-float v5, v15, v5

    const/4 v7, 0x0

    invoke-static {v5, v7}, Ljava/lang/Math;->max(FF)F

    move-result v5

    iput v5, v1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 204
    invoke-static {}, Landroidx/compose/material/SliderKt;->getThumbRadius()F

    move-result v5

    invoke-interface {v3, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v5

    iget v9, v1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-static {v5, v9}, Ljava/lang/Math;->min(FF)F

    move-result v5

    iput v5, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 205
    nop

    .line 202
    .end local v3    # "$this$invoke_u24lambda_u240":Landroidx/compose/ui/unit/Density;
    .end local v4    # "$i$a$-with-SliderKt$Slider$2$1":I
    nop

    .line 213
    move v3, v8

    .local v3, "$changed$iv":I
    const/4 v4, 0x0

    .line 1293
    .local v4, "$i$f$rememberCoroutineScope":I
    const v5, 0x2e20b340

    const-string v9, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp"

    invoke-static {v6, v5, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 1294
    nop

    .line 1298
    move-object/from16 v5, p2

    .line 1299
    .local v5, "composer$iv":Landroidx/compose/runtime/Composer;
    const v9, -0x38dffd5c

    const-string v12, "CC(remember):Effects.kt#9igjgp"

    invoke-static {v6, v9, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v9, 0x0

    .local v9, "invalid$iv$iv":Z
    move-object/from16 v12, p2

    .local v12, "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 1300
    .local v13, "$i$f$cache":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 1301
    .local v17, "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v7

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v14, v7, :cond_5

    .line 1302
    const/4 v7, 0x0

    .line 1299
    .local v7, "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    const/16 v18, 0x0

    .line 1303
    .local v18, "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    sget-object v18, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 1299
    .end local v18    # "$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1":I
    move-object/from16 v8, v18

    check-cast v8, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v8, v5}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v7

    .line 1302
    .end local v7    # "$i$a$-cache-EffectsKt$rememberCoroutineScope$2$iv":I
    nop

    .line 1304
    .local v7, "value$iv$iv":Ljava/lang/Object;
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1305
    move-object v14, v7

    .end local v7    # "value$iv$iv":Ljava/lang/Object;
    goto :goto_3

    .line 1306
    :cond_5
    nop

    .line 1300
    .end local v14    # "it$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-let-ComposerKt$cache$1$iv$iv":I
    :goto_3
    nop

    .line 1299
    .end local v9    # "invalid$iv$iv":Z
    .end local v12    # "$this$cache$iv$iv":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache":I
    move-object/from16 v22, v14

    check-cast v22, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1293
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1299
    nop

    .line 213
    .end local v3    # "$changed$iv":I
    .end local v4    # "$i$f$rememberCoroutineScope":I
    .end local v5    # "composer$iv":Landroidx/compose/runtime/Composer;
    move-object/from16 v8, v22

    .line 214
    .local v8, "scope":Lkotlinx/coroutines/CoroutineScope;
    const v3, -0x7ab96604

    const-string v9, "CC(remember):Slider.kt#9igjgp"

    invoke-static {v6, v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .local v3, "invalid$iv":Z
    iget v4, v0, Landroidx/compose/material/SliderKt$Slider$2;->$value:F

    iget-object v5, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    move-object/from16 v7, p2

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 1307
    .local v12, "$i$f$cache":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1308
    .local v14, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v18, v3

    .end local v3    # "invalid$iv":Z
    .local v18, "invalid$iv":Z
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v13, v3, :cond_6

    .line 1309
    const/4 v3, 0x0

    .line 214
    .local v3, "$i$a$-cache-SliderKt$Slider$2$rawOffset$1":I
    invoke-static {v5, v2, v1, v4}, Landroidx/compose/material/SliderKt$Slider$2;->invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F

    move-result v4

    invoke-static {v4}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v3

    .line 1309
    .end local v3    # "$i$a$-cache-SliderKt$Slider$2$rawOffset$1":I
    nop

    .line 1310
    .local v3, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1311
    move-object v13, v3

    .end local v3    # "value$iv":Ljava/lang/Object;
    goto :goto_4

    .line 1312
    :cond_6
    nop

    .line 1307
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_4
    nop

    .line 214
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache":I
    .end local v18    # "invalid$iv":Z
    move-object/from16 v18, v13

    check-cast v18, Landroidx/compose/runtime/MutableFloatState;

    .local v18, "rawOffset":Landroidx/compose/runtime/MutableFloatState;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 215
    const v3, -0x7ab95bf6

    invoke-static {v6, v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v3, 0x0

    .local v3, "invalid$iv":Z
    move-object/from16 v4, p2

    .local v4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 1313
    .local v5, "$i$f$cache":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 1314
    .local v12, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v7, v13, :cond_7

    .line 1315
    const/4 v13, 0x0

    .line 215
    .local v13, "$i$a$-cache-SliderKt$Slider$2$pressOffset$1":I
    invoke-static/range {v19 .. v19}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v13

    .line 1315
    .end local v13    # "$i$a$-cache-SliderKt$Slider$2$pressOffset$1":I
    nop

    .line 1316
    .local v13, "value$iv":Ljava/lang/Object;
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1317
    move-object v7, v13

    .end local v13    # "value$iv":Ljava/lang/Object;
    goto :goto_5

    .line 1318
    :cond_7
    nop

    .line 1313
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_5
    nop

    .line 215
    .end local v3    # "invalid$iv":Z
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache":I
    move-object/from16 v19, v7

    check-cast v19, Landroidx/compose/runtime/MutableFloatState;

    .local v19, "pressOffset":Landroidx/compose/runtime/MutableFloatState;
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 218
    const v3, -0x7ab95096

    invoke-static {v6, v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget v3, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v3

    iget v4, v1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    .restart local v3    # "invalid$iv":Z
    iget-object v4, v0, Landroidx/compose/material/SliderKt$Slider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    iget-object v5, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    move-object/from16 v7, p2

    .local v7, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 1319
    .local v12, "$i$f$cache":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1320
    .restart local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v3, :cond_9

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v21, v1

    .end local v1    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v21, "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v13, v1, :cond_8

    goto :goto_6

    .line 1324
    :cond_8
    move-object v4, v2

    move-object/from16 v26, v19

    move-object/from16 v2, v21

    goto :goto_7

    .line 1320
    .end local v21    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .restart local v1    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    :cond_9
    move-object/from16 v21, v1

    .line 1321
    .end local v1    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .restart local v21    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    :goto_6
    const/4 v1, 0x0

    .line 219
    .local v1, "$i$a$-cache-SliderKt$Slider$2$draggableState$1":I
    move/from16 v24, v1

    .end local v1    # "$i$a$-cache-SliderKt$Slider$2$draggableState$1":I
    .local v24, "$i$a$-cache-SliderKt$Slider$2$draggableState$1":I
    new-instance v1, Landroidx/compose/material/SliderDraggableState;

    new-instance v17, Landroidx/compose/material/SliderKt$Slider$2$draggableState$1$1;

    move-object/from16 v20, v2

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    .end local v2    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v20, "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    invoke-direct/range {v17 .. v23}, Landroidx/compose/material/SliderKt$Slider$2$draggableState$1$1;-><init>(Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/runtime/State;Lkotlin/ranges/ClosedFloatingPointRange;)V

    move-object/from16 v26, v19

    move-object/from16 v4, v20

    move-object/from16 v2, v21

    .end local v19    # "pressOffset":Landroidx/compose/runtime/MutableFloatState;
    .end local v20    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .end local v21    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v2, "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v4, "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v26, "pressOffset":Landroidx/compose/runtime/MutableFloatState;
    move-object/from16 v5, v17

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v5}, Landroidx/compose/material/SliderDraggableState;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 224
    nop

    .line 1321
    .end local v24    # "$i$a$-cache-SliderKt$Slider$2$draggableState$1":I
    nop

    .line 1322
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1323
    move-object v13, v1

    .line 1319
    .end local v1    # "value$iv":Ljava/lang/Object;
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_7
    nop

    .line 218
    .end local v3    # "invalid$iv":Z
    .end local v7    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache":I
    move-object/from16 v23, v13

    check-cast v23, Landroidx/compose/material/SliderDraggableState;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 217
    move-object/from16 v12, v23

    .line 227
    .local v12, "draggableState":Landroidx/compose/material/SliderDraggableState;
    const v1, -0x7ab9198b

    invoke-static {v6, v1, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    iget v3, v4, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v3

    or-int/2addr v1, v3

    iget v3, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v3

    or-int/2addr v1, v3

    .local v1, "invalid$iv":Z
    iget-object v3, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    move-object/from16 v5, p2

    .local v5, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v7, 0x0

    .line 1325
    .local v7, "$i$f$cache":I
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .restart local v13    # "it$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 1326
    .restart local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v1, :cond_b

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v1

    .end local v1    # "invalid$iv":Z
    .local v19, "invalid$iv":Z
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v13, v1, :cond_a

    goto :goto_8

    .line 1330
    :cond_a
    goto :goto_9

    .line 1326
    .end local v19    # "invalid$iv":Z
    .restart local v1    # "invalid$iv":Z
    :cond_b
    move/from16 v19, v1

    .line 1327
    .end local v1    # "invalid$iv":Z
    .restart local v19    # "invalid$iv":Z
    :goto_8
    const/4 v1, 0x0

    .line 227
    .local v1, "$i$a$-cache-SliderKt$Slider$2$2":I
    move/from16 v17, v1

    .end local v1    # "$i$a$-cache-SliderKt$Slider$2$2":I
    .local v17, "$i$a$-cache-SliderKt$Slider$2$2":I
    new-instance v1, Landroidx/compose/material/SliderKt$Slider$2$2$1;

    invoke-direct {v1, v3, v4, v2}, Landroidx/compose/material/SliderKt$Slider$2$2$1;-><init>(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;)V

    check-cast v1, Lkotlin/reflect/KFunction;

    .line 1327
    .end local v17    # "$i$a$-cache-SliderKt$Slider$2$2":I
    nop

    .line 1328
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1329
    move-object v13, v1

    .line 1325
    .end local v1    # "value$iv":Ljava/lang/Object;
    .end local v13    # "it$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_9
    nop

    .line 227
    .end local v5    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v7    # "$i$f$cache":I
    .end local v19    # "invalid$iv":Z
    check-cast v13, Lkotlin/reflect/KFunction;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object v1, v13

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    iget v5, v4, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    iget v7, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-static {v5, v7}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v5

    move-object/from16 v20, v4

    .end local v4    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .restart local v20    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    move-object/from16 v4, v18

    check-cast v4, Landroidx/compose/runtime/MutableState;

    move-object/from16 v21, v2

    move-object v2, v3

    move-object v3, v5

    .end local v2    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .restart local v21    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    iget v5, v0, Landroidx/compose/material/SliderKt$Slider$2;->$value:F

    const/16 v7, 0xc00

    move-object/from16 v14, v20

    move-object/from16 v13, v21

    .end local v20    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .end local v21    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v13, "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v14, "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    invoke-static/range {v1 .. v7}, Landroidx/compose/material/SliderKt;->access$CorrectValueSideEffect(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V

    .line 230
    const v1, -0x7ab90541

    invoke-static {v6, v1, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, v0, Landroidx/compose/material/SliderKt$Slider$2;->$tickFractions:Ljava/util/List;

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    iget v2, v14, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v2

    or-int/2addr v1, v2

    iget v2, v13, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Landroidx/compose/material/SliderKt$Slider$2;->$onValueChangeFinished:Lkotlin/jvm/functions/Function0;

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .local v1, "invalid$iv":Z
    iget-object v2, v0, Landroidx/compose/material/SliderKt$Slider$2;->$tickFractions:Ljava/util/List;

    iget-object v3, v0, Landroidx/compose/material/SliderKt$Slider$2;->$onValueChangeFinished:Lkotlin/jvm/functions/Function0;

    move-object/from16 v4, p2

    .local v4, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v5, 0x0

    .line 1331
    .local v5, "$i$f$cache":I
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .local v7, "it$iv":Ljava/lang/Object;
    const/16 v27, 0x0

    .line 1332
    .local v27, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v1, :cond_d

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v28, v1

    .end local v1    # "invalid$iv":Z
    .local v28, "invalid$iv":Z
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_c

    goto :goto_a

    .line 1336
    :cond_c
    move-object/from16 v23, v8

    move-object/from16 v29, v12

    move-object v2, v13

    move-object v3, v14

    move-object/from16 v24, v18

    goto :goto_b

    .line 1332
    .end local v28    # "invalid$iv":Z
    .restart local v1    # "invalid$iv":Z
    :cond_d
    move/from16 v28, v1

    .line 1333
    .end local v1    # "invalid$iv":Z
    .restart local v28    # "invalid$iv":Z
    :goto_a
    const/4 v1, 0x0

    .line 230
    .local v1, "$i$a$-cache-SliderKt$Slider$2$gestureEndAction$1":I
    new-instance v17, Landroidx/compose/material/SliderKt$Slider$2$gestureEndAction$1$1;

    move-object/from16 v19, v2

    move-object/from16 v24, v3

    move-object/from16 v22, v8

    move-object/from16 v23, v12

    move-object/from16 v21, v13

    move-object/from16 v20, v14

    .end local v8    # "scope":Lkotlinx/coroutines/CoroutineScope;
    .end local v12    # "draggableState":Landroidx/compose/material/SliderDraggableState;
    .end local v13    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .end local v14    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .restart local v20    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .restart local v21    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v22, "scope":Lkotlinx/coroutines/CoroutineScope;
    .local v23, "draggableState":Landroidx/compose/material/SliderDraggableState;
    invoke-direct/range {v17 .. v24}, Landroidx/compose/material/SliderKt$Slider$2$gestureEndAction$1$1;-><init>(Landroidx/compose/runtime/MutableFloatState;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material/SliderDraggableState;Lkotlin/jvm/functions/Function0;)V

    move-object/from16 v24, v18

    move-object/from16 v3, v20

    move-object/from16 v2, v21

    move-object/from16 v29, v23

    move-object/from16 v23, v22

    .end local v18    # "rawOffset":Landroidx/compose/runtime/MutableFloatState;
    .end local v20    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .end local v21    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .end local v22    # "scope":Lkotlinx/coroutines/CoroutineScope;
    .restart local v2    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v3, "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v23, "scope":Lkotlinx/coroutines/CoroutineScope;
    .local v24, "rawOffset":Landroidx/compose/runtime/MutableFloatState;
    .local v29, "draggableState":Landroidx/compose/material/SliderDraggableState;
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 1333
    .end local v1    # "$i$a$-cache-SliderKt$Slider$2$gestureEndAction$1":I
    move-object/from16 v1, v17

    .line 1334
    .local v1, "value$iv":Ljava/lang/Object;
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1335
    move-object v7, v1

    .line 1331
    .end local v1    # "value$iv":Ljava/lang/Object;
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v27    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_b
    nop

    .line 230
    .end local v4    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v5    # "$i$f$cache":I
    .end local v28    # "invalid$iv":Z
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v1, 0x0

    invoke-static {v7, v6, v1}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v18

    .line 229
    nop

    .line 244
    .local v18, "gestureEndAction":Landroidx/compose/runtime/State;
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v12, v1

    check-cast v12, Landroidx/compose/ui/Modifier;

    .line 245
    move-object/from16 v13, v29

    check-cast v13, Landroidx/compose/foundation/gestures/DraggableState;

    .line 246
    iget-object v14, v0, Landroidx/compose/material/SliderKt$Slider$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 247
    nop

    .line 248
    nop

    .line 249
    move-object/from16 v17, v24

    check-cast v17, Landroidx/compose/runtime/State;

    .line 250
    nop

    .line 251
    move-object/from16 v19, v26

    check-cast v19, Landroidx/compose/runtime/MutableState;

    .line 252
    iget-boolean v1, v0, Landroidx/compose/material/SliderKt$Slider$2;->$enabled:Z

    .line 244
    move/from16 v20, v1

    invoke-static/range {v12 .. v20}, Landroidx/compose/material/SliderKt;->access$sliderTapModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;FZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 243
    move/from16 v25, v15

    move-object/from16 v4, v18

    .line 256
    .end local v15    # "widthPx":F
    .end local v18    # "gestureEndAction":Landroidx/compose/runtime/State;
    .local v1, "press":Landroidx/compose/ui/Modifier;
    .local v4, "gestureEndAction":Landroidx/compose/runtime/State;
    .local v25, "widthPx":F
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 257
    sget-object v14, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 262
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/material/SliderDraggableState;->isDragging()Z

    move-result v17

    .line 256
    move-object v12, v5

    check-cast v12, Landroidx/compose/ui/Modifier;

    .line 263
    move-object/from16 v13, v29

    check-cast v13, Landroidx/compose/foundation/gestures/DraggableState;

    .line 257
    nop

    .line 259
    iget-boolean v15, v0, Landroidx/compose/material/SliderKt$Slider$2;->$enabled:Z

    .line 260
    iget-object v5, v0, Landroidx/compose/material/SliderKt$Slider$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 262
    nop

    .line 256
    nop

    .line 261
    const v7, -0x7ab870a3

    invoke-static {v6, v7, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    .local v7, "invalid$iv":Z
    move-object/from16 v8, p2

    .local v8, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 1337
    .local v9, "$i$f$cache":I
    move-object/from16 v18, v5

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 1338
    .local v19, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v7, :cond_f

    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_e

    goto :goto_c

    .line 1342
    :cond_e
    goto :goto_d

    .line 1339
    :cond_f
    :goto_c
    const/4 v6, 0x0

    .line 261
    .local v6, "$i$a$-cache-SliderKt$Slider$2$drag$1":I
    move-object/from16 v20, v5

    .end local v5    # "it$iv":Ljava/lang/Object;
    .local v20, "it$iv":Ljava/lang/Object;
    new-instance v5, Landroidx/compose/material/SliderKt$Slider$2$drag$1$1;

    move/from16 v21, v6

    .end local v6    # "$i$a$-cache-SliderKt$Slider$2$drag$1":I
    .local v21, "$i$a$-cache-SliderKt$Slider$2$drag$1":I
    const/4 v6, 0x0

    invoke-direct {v5, v4, v6}, Landroidx/compose/material/SliderKt$Slider$2$drag$1$1;-><init>(Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Lkotlin/jvm/functions/Function3;

    .line 1339
    .end local v21    # "$i$a$-cache-SliderKt$Slider$2$drag$1":I
    nop

    .line 1340
    .local v5, "value$iv":Ljava/lang/Object;
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1341
    nop

    .line 1337
    .end local v5    # "value$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v20    # "it$iv":Ljava/lang/Object;
    :goto_d
    nop

    .line 261
    .end local v7    # "invalid$iv":Z
    .end local v8    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$cache":I
    move-object/from16 v19, v5

    check-cast v19, Lkotlin/jvm/functions/Function3;

    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 258
    nop

    .line 256
    const/16 v21, 0x20

    const/16 v22, 0x0

    move/from16 v20, v16

    move-object/from16 v16, v18

    .end local v16    # "isRtl":Z
    .local v20, "isRtl":Z
    const/16 v18, 0x0

    invoke-static/range {v12 .. v22}, Landroidx/compose/foundation/gestures/DraggableKt;->draggable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 255
    move/from16 v16, v20

    .end local v20    # "isRtl":Z
    .restart local v16    # "isRtl":Z
    move-object v12, v5

    .line 266
    .local v12, "drag":Landroidx/compose/ui/Modifier;
    iget v5, v0, Landroidx/compose/material/SliderKt$Slider$2;->$value:F

    iget-object v6, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    invoke-interface {v6}, Lkotlin/ranges/ClosedFloatingPointRange;->getStart()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    iget-object v7, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    invoke-interface {v7}, Lkotlin/ranges/ClosedFloatingPointRange;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v5, v6, v7}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v13

    .line 267
    .local v13, "coerced":F
    iget-object v5, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    invoke-interface {v5}, Lkotlin/ranges/ClosedFloatingPointRange;->getStart()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    iget-object v6, v0, Landroidx/compose/material/SliderKt$Slider$2;->$valueRange:Lkotlin/ranges/ClosedFloatingPointRange;

    invoke-interface {v6}, Lkotlin/ranges/ClosedFloatingPointRange;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {v5, v6, v13}, Landroidx/compose/material/SliderKt;->access$calcFraction(FFF)F

    move-result v5

    .line 269
    .local v5, "fraction":F
    iget-boolean v6, v0, Landroidx/compose/material/SliderKt$Slider$2;->$enabled:Z

    .line 270
    nop

    .line 271
    iget-object v7, v0, Landroidx/compose/material/SliderKt$Slider$2;->$tickFractions:Ljava/util/List;

    .line 272
    move-object/from16 v18, v4

    .end local v4    # "gestureEndAction":Landroidx/compose/runtime/State;
    .restart local v18    # "gestureEndAction":Landroidx/compose/runtime/State;
    iget-object v4, v0, Landroidx/compose/material/SliderKt$Slider$2;->$colors:Landroidx/compose/material/SliderColors;

    .line 273
    iget v8, v2, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    iget v9, v3, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    sub-float/2addr v8, v9

    .line 274
    move v9, v6

    iget-object v6, v0, Landroidx/compose/material/SliderKt$Slider$2;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 275
    move-object/from16 v20, v3

    move-object v3, v7

    .end local v3    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .local v20, "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    invoke-interface {v1, v12}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 268
    move-object v14, v1

    move v1, v9

    .end local v1    # "press":Landroidx/compose/ui/Modifier;
    .local v14, "press":Landroidx/compose/ui/Modifier;
    const/4 v9, 0x0

    move-object/from16 v21, v2

    move v2, v5

    move v5, v8

    move-object/from16 v8, p2

    .end local v5    # "fraction":F
    .local v2, "fraction":F
    .local v21, "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    invoke-static/range {v1 .. v9}, Landroidx/compose/material/SliderKt;->access$SliderImpl(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .end local v2    # "fraction":F
    .end local v12    # "drag":Landroidx/compose/ui/Modifier;
    .end local v13    # "coerced":F
    .end local v14    # "press":Landroidx/compose/ui/Modifier;
    .end local v16    # "isRtl":Z
    .end local v18    # "gestureEndAction":Landroidx/compose/runtime/State;
    .end local v20    # "minPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .end local v21    # "maxPx":Lkotlin/jvm/internal/Ref$FloatRef;
    .end local v23    # "scope":Lkotlinx/coroutines/CoroutineScope;
    .end local v24    # "rawOffset":Landroidx/compose/runtime/MutableFloatState;
    .end local v25    # "widthPx":F
    .end local v26    # "pressOffset":Landroidx/compose/runtime/MutableFloatState;
    .end local v29    # "draggableState":Landroidx/compose/material/SliderDraggableState;
    goto :goto_e

    .line 276
    :cond_10
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 277
    :cond_11
    :goto_e
    return-void
.end method
