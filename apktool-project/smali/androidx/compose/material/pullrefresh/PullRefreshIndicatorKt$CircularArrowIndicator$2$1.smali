.class final Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "PullRefreshIndicator.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt;->CircularArrowIndicator-iJQMabo(Landroidx/compose/material/pullrefresh/PullRefreshState;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,232:1\n147#2,5:233\n272#2,14:238\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1\n*L\n142#1:233,5\n142#1:238,14\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "invoke"
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
.field final synthetic $alphaState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $color:J

.field final synthetic $path:Landroidx/compose/ui/graphics/Path;

.field final synthetic $state:Landroidx/compose/material/pullrefresh/PullRefreshState;


# direct methods
.method constructor <init>(Landroidx/compose/material/pullrefresh/PullRefreshState;Landroidx/compose/runtime/State;JLandroidx/compose/ui/graphics/Path;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/pullrefresh/PullRefreshState;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;J",
            "Landroidx/compose/ui/graphics/Path;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;->$state:Landroidx/compose/material/pullrefresh/PullRefreshState;

    iput-object p2, p0, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;->$alphaState:Landroidx/compose/runtime/State;

    iput-wide p3, p0, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;->$color:J

    iput-object p5, p0, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;->$path:Landroidx/compose/ui/graphics/Path;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 138
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-virtual {p0, v0}, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;->invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 42
    .param p1, "$this$Canvas"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 139
    move-object/from16 v1, p0

    iget-object v0, v1, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;->$state:Landroidx/compose/material/pullrefresh/PullRefreshState;

    invoke-virtual {v0}, Landroidx/compose/material/pullrefresh/PullRefreshState;->getProgress()F

    move-result v0

    invoke-static {v0}, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt;->access$ArrowValues(F)Landroidx/compose/material/pullrefresh/ArrowValues;

    move-result-object v8

    .line 140
    .local v8, "values":Landroidx/compose/material/pullrefresh/ArrowValues;
    iget-object v0, v1, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;->$alphaState:Landroidx/compose/runtime/State;

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v19

    .line 142
    .local v19, "alpha":F
    invoke-virtual {v8}, Landroidx/compose/material/pullrefresh/ArrowValues;->getRotation()F

    move-result v2

    .local v2, "degrees$iv":F
    iget-wide v5, v1, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;->$color:J

    iget-object v3, v1, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2$1;->$path:Landroidx/compose/ui/graphics/Path;

    move-object/from16 v25, p1

    .line 233
    .local v25, "$this$rotate_u2dRg1IO4c_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    nop

    .line 235
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v9

    .line 233
    .local v9, "pivot$iv":J
    const/16 v26, 0x0

    .line 237
    .local v26, "$i$f$rotate-Rg1IO4c":I
    move-object/from16 v27, v25

    .local v27, "$this$withTransform$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/16 v28, 0x0

    .line 238
    .local v28, "$i$f$withTransform":I
    invoke-interface/range {v27 .. v27}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v4

    .local v4, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    const/16 v29, 0x0

    .line 242
    .local v29, "$i$a$-with-DrawScopeKt$withTransform$1$iv$iv":I
    invoke-interface {v4}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    move-result-wide v11

    .line 243
    .local v11, "previousSize$iv$iv":J
    invoke-interface {v4}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 244
    nop

    .line 245
    :try_start_0
    invoke-interface {v4}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v0

    .local v0, "$this$rotate_Rg1IO4c_u24lambda_u240$iv":Landroidx/compose/ui/graphics/drawscope/DrawTransform;
    const/4 v7, 0x0

    .line 237
    .local v7, "$i$a$-withTransform-DrawScopeKt$rotate$1$iv":I
    invoke-interface {v0, v2, v9, v10}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->rotate-Uv8p0NA(FJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 245
    .end local v0    # "$this$rotate_Rg1IO4c_u24lambda_u240$iv":Landroidx/compose/ui/graphics/drawscope/DrawTransform;
    .end local v7    # "$i$a$-withTransform-DrawScopeKt$rotate$1$iv":I
    nop

    .line 246
    move-wide v13, v9

    .end local v9    # "pivot$iv":J
    .local v13, "pivot$iv":J
    move-object/from16 v9, v27

    .local v9, "$this$invoke_u24lambda_u240":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/4 v0, 0x0

    .line 143
    .local v0, "$i$a$-rotate-Rg1IO4c$default-PullRefreshIndicatorKt$CircularArrowIndicator$2$1$1":I
    :try_start_1
    invoke-static {}, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt;->access$getArcRadius$p()F

    move-result v7

    invoke-interface {v9, v7}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v7

    invoke-static {}, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt;->access$getStrokeWidth$p()F

    move-result v10

    invoke-interface {v9, v10}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v10

    const/high16 v15, 0x40000000    # 2.0f

    div-float/2addr v10, v15

    add-float v30, v7, v10

    .line 145
    .local v30, "arcRadius":F
    new-instance v7, Landroidx/compose/ui/geometry/Rect;

    .line 146
    invoke-interface {v9}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/SizeKt;->getCenter-uvyYCjk(J)J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v10

    sub-float v10, v10, v30

    .line 147
    invoke-interface {v9}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/SizeKt;->getCenter-uvyYCjk(J)J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v15

    sub-float v15, v15, v30

    .line 148
    invoke-interface {v9}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/geometry/SizeKt;->getCenter-uvyYCjk(J)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v16

    move/from16 v31, v0

    .end local v0    # "$i$a$-rotate-Rg1IO4c$default-PullRefreshIndicatorKt$CircularArrowIndicator$2$1$1":I
    .local v31, "$i$a$-rotate-Rg1IO4c$default-PullRefreshIndicatorKt$CircularArrowIndicator$2$1$1":I
    add-float v0, v16, v30

    .line 149
    invoke-interface {v9}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/geometry/SizeKt;->getCenter-uvyYCjk(J)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v16

    add-float v1, v16, v30

    .line 145
    invoke-direct {v7, v10, v15, v0, v1}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 144
    nop

    .line 154
    .local v7, "arcBounds":Landroidx/compose/ui/geometry/Rect;
    move-wide v10, v11

    .end local v11    # "previousSize$iv$iv":J
    .local v10, "previousSize$iv$iv":J
    :try_start_2
    invoke-virtual {v8}, Landroidx/compose/material/pullrefresh/ArrowValues;->getStartAngle()F

    move-result v12

    .line 155
    invoke-virtual {v8}, Landroidx/compose/material/pullrefresh/ArrowValues;->getEndAngle()F

    move-result v0

    invoke-virtual {v8}, Landroidx/compose/material/pullrefresh/ArrowValues;->getStartAngle()F

    move-result v1

    sub-float/2addr v0, v1

    .line 157
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    move-result-wide v15

    .line 158
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/Rect;->getSize-NH-jbRc()J

    move-result-wide v17

    .line 159
    new-instance v32, Landroidx/compose/ui/graphics/drawscope/Stroke;

    invoke-static {}, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt;->access$getStrokeWidth$p()F

    move-result v1

    invoke-interface {v9, v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->toPx-0680j_4(F)F

    move-result v33

    sget-object v1, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getSquare-KaPHkGw()I

    move-result v35

    const/16 v38, 0x1a

    const/16 v39, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v32 .. v39}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 151
    nop

    .line 152
    nop

    .line 154
    nop

    .line 155
    nop

    .line 156
    nop

    .line 157
    nop

    .line 158
    nop

    .line 153
    nop

    .line 159
    move-object/from16 v20, v32

    check-cast v20, Landroidx/compose/ui/graphics/drawscope/DrawStyle;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 151
    const/16 v23, 0x300

    const/16 v24, 0x0

    move-wide/from16 v21, v13

    .end local v13    # "pivot$iv":J
    .local v21, "pivot$iv":J
    const/4 v14, 0x0

    move-wide/from16 v32, v21

    .end local v21    # "pivot$iv":J
    .local v32, "pivot$iv":J
    const/16 v21, 0x0

    const/16 v22, 0x0

    move-wide/from16 v40, v10

    move-wide v10, v5

    move-wide/from16 v5, v40

    move v13, v0

    .end local v10    # "previousSize$iv$iv":J
    .local v5, "previousSize$iv$iv":J
    :try_start_3
    invoke-static/range {v9 .. v24}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawArc-yD3GUKo$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 161
    move-wide/from16 v40, v10

    move-wide v10, v5

    move-wide/from16 v5, v40

    move v1, v2

    move-object v2, v9

    move-object v9, v4

    move-object v4, v7

    move/from16 v7, v19

    .end local v5    # "previousSize$iv$iv":J
    .end local v19    # "alpha":F
    .local v1, "degrees$iv":F
    .local v2, "$this$invoke_u24lambda_u240":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .local v4, "arcBounds":Landroidx/compose/ui/geometry/Rect;
    .local v7, "alpha":F
    .local v9, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v10    # "previousSize$iv$iv":J
    :try_start_4
    invoke-static/range {v2 .. v8}, Landroidx/compose/material/pullrefresh/PullRefreshIndicatorKt;->access$drawArrow-Bx497Mc(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material/pullrefresh/ArrowValues;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 162
    .end local v7    # "alpha":F
    .restart local v19    # "alpha":F
    nop

    .line 246
    .end local v2    # "$this$invoke_u24lambda_u240":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v4    # "arcBounds":Landroidx/compose/ui/geometry/Rect;
    .end local v30    # "arcRadius":F
    .end local v31    # "$i$a$-rotate-Rg1IO4c$default-PullRefreshIndicatorKt$CircularArrowIndicator$2$1$1":I
    nop

    .line 248
    invoke-interface {v9}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 249
    invoke-interface {v9, v10, v11}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 250
    nop

    .line 251
    nop

    .line 238
    .end local v9    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v10    # "previousSize$iv$iv":J
    .end local v29    # "$i$a$-with-DrawScopeKt$withTransform$1$iv$iv":I
    nop

    .line 251
    nop

    .line 237
    .end local v27    # "$this$withTransform$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v28    # "$i$f$withTransform":I
    nop

    .line 163
    .end local v1    # "degrees$iv":F
    .end local v25    # "$this$rotate_u2dRg1IO4c_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v26    # "$i$f$rotate-Rg1IO4c":I
    .end local v32    # "pivot$iv":J
    return-void

    .line 248
    .end local v19    # "alpha":F
    .restart local v1    # "degrees$iv":F
    .restart local v7    # "alpha":F
    .restart local v9    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v10    # "previousSize$iv$iv":J
    .restart local v25    # "$this$rotate_u2dRg1IO4c_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v26    # "$i$f$rotate-Rg1IO4c":I
    .restart local v27    # "$this$withTransform$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v28    # "$i$f$withTransform":I
    .restart local v29    # "$i$a$-with-DrawScopeKt$withTransform$1$iv$iv":I
    .restart local v32    # "pivot$iv":J
    :catchall_0
    move-exception v0

    move/from16 v19, v7

    .end local v7    # "alpha":F
    .restart local v19    # "alpha":F
    goto :goto_0

    .end local v1    # "degrees$iv":F
    .end local v9    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v10    # "previousSize$iv$iv":J
    .local v2, "degrees$iv":F
    .local v4, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v5    # "previousSize$iv$iv":J
    :catchall_1
    move-exception v0

    move v1, v2

    move-object v9, v4

    move-wide v10, v5

    .end local v2    # "degrees$iv":F
    .end local v4    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v5    # "previousSize$iv$iv":J
    .restart local v1    # "degrees$iv":F
    .restart local v9    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v10    # "previousSize$iv$iv":J
    goto :goto_0

    .end local v1    # "degrees$iv":F
    .end local v9    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v32    # "pivot$iv":J
    .restart local v2    # "degrees$iv":F
    .restart local v4    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v13    # "pivot$iv":J
    :catchall_2
    move-exception v0

    move v1, v2

    move-object v9, v4

    move-wide/from16 v32, v13

    .end local v2    # "degrees$iv":F
    .end local v4    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v13    # "pivot$iv":J
    .restart local v1    # "degrees$iv":F
    .restart local v9    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v32    # "pivot$iv":J
    goto :goto_0

    .end local v1    # "degrees$iv":F
    .end local v9    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v10    # "previousSize$iv$iv":J
    .end local v32    # "pivot$iv":J
    .restart local v2    # "degrees$iv":F
    .restart local v4    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v11    # "previousSize$iv$iv":J
    .restart local v13    # "pivot$iv":J
    :catchall_3
    move-exception v0

    move v1, v2

    move-object v9, v4

    move-wide v10, v11

    move-wide/from16 v32, v13

    .end local v2    # "degrees$iv":F
    .end local v4    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v11    # "previousSize$iv$iv":J
    .end local v13    # "pivot$iv":J
    .restart local v1    # "degrees$iv":F
    .restart local v9    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v10    # "previousSize$iv$iv":J
    .restart local v32    # "pivot$iv":J
    goto :goto_0

    .end local v1    # "degrees$iv":F
    .end local v10    # "previousSize$iv$iv":J
    .end local v32    # "pivot$iv":J
    .restart local v2    # "degrees$iv":F
    .restart local v4    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .local v9, "pivot$iv":J
    .restart local v11    # "previousSize$iv$iv":J
    :catchall_4
    move-exception v0

    move v1, v2

    move-wide/from16 v32, v9

    move-wide v10, v11

    move-object v9, v4

    .end local v2    # "degrees$iv":F
    .end local v4    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v11    # "previousSize$iv$iv":J
    .restart local v1    # "degrees$iv":F
    .local v9, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v10    # "previousSize$iv$iv":J
    .restart local v32    # "pivot$iv":J
    :goto_0
    invoke-interface {v9}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 249
    invoke-interface {v9, v10, v11}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    throw v0
.end method
