.class final Landroidx/compose/foundation/StretchOverscrollNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "AndroidOverscroll.android.kt"

# interfaces
.implements Landroidx/compose/ui/node/DrawModifierNode;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/StretchOverscrollNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1073:1\n1#2:1074\n69#3:1075\n65#3:1078\n69#3:1081\n65#3:1084\n70#4:1076\n60#4:1079\n70#4:1082\n60#4:1085\n22#5:1077\n22#5:1080\n22#5:1083\n22#5:1086\n293#6,27:1087\n120#6,7:1114\n321#6,10:1121\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/StretchOverscrollNode\n*L\n278#1:1075\n295#1:1078\n312#1:1081\n330#1:1084\n278#1:1076\n295#1:1079\n312#1:1082\n330#1:1085\n278#1:1077\n295#1:1080\n312#1:1083\n330#1:1086\n348#1:1087,27\n349#1:1114,7\n348#1:1121,10\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J$\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u0008\u0010 \u001a\u00020\u0010H\u0002J\u0008\u0010!\u001a\u00020\u0010H\u0002J\u000c\u0010\"\u001a\u00020#*\u00020$H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006%"
    }
    d2 = {
        "Landroidx/compose/foundation/StretchOverscrollNode;",
        "Landroidx/compose/ui/node/DelegatingNode;",
        "Landroidx/compose/ui/node/DrawModifierNode;",
        "pointerInputNode",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "overscrollEffect",
        "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;",
        "edgeEffectWrapper",
        "Landroidx/compose/foundation/EdgeEffectWrapper;",
        "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;)V",
        "_renderNode",
        "Landroid/graphics/RenderNode;",
        "renderNode",
        "getRenderNode",
        "()Landroid/graphics/RenderNode;",
        "drawBottomStretch",
        "",
        "bottom",
        "Landroid/widget/EdgeEffect;",
        "canvas",
        "Landroid/graphics/Canvas;",
        "Landroidx/compose/ui/graphics/NativeCanvas;",
        "drawLeftStretch",
        "left",
        "drawRightStretch",
        "right",
        "drawTopStretch",
        "top",
        "drawWithRotation",
        "rotationDegrees",
        "",
        "edgeEffect",
        "shouldDrawHorizontalStretch",
        "shouldDrawVerticalStretch",
        "draw",
        "",
        "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private _renderNode:Landroid/graphics/RenderNode;

.field private final edgeEffectWrapper:Landroidx/compose/foundation/EdgeEffectWrapper;

.field private final overscrollEffect:Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;)V
    .locals 0
    .param p1, "pointerInputNode"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p2, "overscrollEffect"    # Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;
    .param p3, "edgeEffectWrapper"    # Landroidx/compose/foundation/EdgeEffectWrapper;

    .line 164
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 162
    iput-object p2, p0, Landroidx/compose/foundation/StretchOverscrollNode;->overscrollEffect:Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;

    .line 163
    iput-object p3, p0, Landroidx/compose/foundation/StretchOverscrollNode;->edgeEffectWrapper:Landroidx/compose/foundation/EdgeEffectWrapper;

    .line 165
    nop

    .line 166
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/StretchOverscrollNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 167
    nop

    .line 160
    return-void
.end method

.method private final drawBottomStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1
    .param p1, "bottom"    # Landroid/widget/EdgeEffect;
    .param p2, "canvas"    # Landroid/graphics/Canvas;

    .line 396
    const/high16 v0, 0x43340000    # 180.0f

    invoke-direct {p0, v0, p1, p2}, Landroidx/compose/foundation/StretchOverscrollNode;->drawWithRotation(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v0

    return v0
.end method

.method private final drawLeftStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1
    .param p1, "left"    # Landroid/widget/EdgeEffect;
    .param p2, "canvas"    # Landroid/graphics/Canvas;

    .line 384
    const/high16 v0, 0x43870000    # 270.0f

    invoke-direct {p0, v0, p1, p2}, Landroidx/compose/foundation/StretchOverscrollNode;->drawWithRotation(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v0

    return v0
.end method

.method private final drawRightStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1
    .param p1, "right"    # Landroid/widget/EdgeEffect;
    .param p2, "canvas"    # Landroid/graphics/Canvas;

    .line 392
    const/high16 v0, 0x42b40000    # 90.0f

    invoke-direct {p0, v0, p1, p2}, Landroidx/compose/foundation/StretchOverscrollNode;->drawWithRotation(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v0

    return v0
.end method

.method private final drawTopStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1
    .param p1, "top"    # Landroid/widget/EdgeEffect;
    .param p2, "canvas"    # Landroid/graphics/Canvas;

    .line 388
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Landroidx/compose/foundation/StretchOverscrollNode;->drawWithRotation(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v0

    return v0
.end method

.method private final drawWithRotation(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 2
    .param p1, "rotationDegrees"    # F
    .param p2, "edgeEffect"    # Landroid/widget/EdgeEffect;
    .param p3, "canvas"    # Landroid/graphics/Canvas;

    .line 404
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 405
    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    .line 406
    .local v0, "needsInvalidate":Z
    return v0

    .line 408
    .end local v0    # "needsInvalidate":Z
    :cond_1
    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 409
    .local v0, "restore":I
    invoke-virtual {p3, p1}, Landroid/graphics/Canvas;->rotate(F)V

    .line 410
    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v1

    .line 411
    .local v1, "needsInvalidate":Z
    invoke-virtual {p3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 412
    return v1
.end method

.method private final getRenderNode()Landroid/graphics/RenderNode;
    .locals 3

    .line 203
    iget-object v0, p0, Landroidx/compose/foundation/StretchOverscrollNode;->_renderNode:Landroid/graphics/RenderNode;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/RenderNode;

    const-string v1, "AndroidEdgeEffectOverscrollEffect"

    invoke-direct {v0, v1}, Landroid/graphics/RenderNode;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    .line 1074
    .local v1, "it":Landroid/graphics/RenderNode;
    const/4 v2, 0x0

    .line 203
    .local v2, "$i$a$-also-StretchOverscrollNode$renderNode$1":I
    iput-object v1, p0, Landroidx/compose/foundation/StretchOverscrollNode;->_renderNode:Landroid/graphics/RenderNode;

    .end local v1    # "it":Landroid/graphics/RenderNode;
    .end local v2    # "$i$a$-also-StretchOverscrollNode$renderNode$1":I
    :cond_0
    return-object v0
.end method

.method private final shouldDrawHorizontalStretch()Z
    .locals 3

    .line 376
    iget-object v0, p0, Landroidx/compose/foundation/StretchOverscrollNode;->edgeEffectWrapper:Landroidx/compose/foundation/EdgeEffectWrapper;

    .local v0, "$this$shouldDrawHorizontalStretch_u24lambda_u246":Landroidx/compose/foundation/EdgeEffectWrapper;
    const/4 v1, 0x0

    .line 377
    .local v1, "$i$a$-with-StretchOverscrollNode$shouldDrawHorizontalStretch$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/EdgeEffectWrapper;->isLeftAnimating()Z

    move-result v2

    if-nez v2, :cond_1

    .line 378
    invoke-virtual {v0}, Landroidx/compose/foundation/EdgeEffectWrapper;->isLeftNegationStretched()Z

    move-result v2

    if-nez v2, :cond_1

    .line 379
    invoke-virtual {v0}, Landroidx/compose/foundation/EdgeEffectWrapper;->isRightAnimating()Z

    move-result v2

    if-nez v2, :cond_1

    .line 380
    invoke-virtual {v0}, Landroidx/compose/foundation/EdgeEffectWrapper;->isRightNegationStretched()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 376
    .end local v0    # "$this$shouldDrawHorizontalStretch_u24lambda_u246":Landroidx/compose/foundation/EdgeEffectWrapper;
    .end local v1    # "$i$a$-with-StretchOverscrollNode$shouldDrawHorizontalStretch$1":I
    :goto_1
    nop

    .line 381
    return v2
.end method

.method private final shouldDrawVerticalStretch()Z
    .locals 3

    .line 368
    iget-object v0, p0, Landroidx/compose/foundation/StretchOverscrollNode;->edgeEffectWrapper:Landroidx/compose/foundation/EdgeEffectWrapper;

    .local v0, "$this$shouldDrawVerticalStretch_u24lambda_u245":Landroidx/compose/foundation/EdgeEffectWrapper;
    const/4 v1, 0x0

    .line 369
    .local v1, "$i$a$-with-StretchOverscrollNode$shouldDrawVerticalStretch$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/EdgeEffectWrapper;->isTopAnimating()Z

    move-result v2

    if-nez v2, :cond_1

    .line 370
    invoke-virtual {v0}, Landroidx/compose/foundation/EdgeEffectWrapper;->isTopNegationStretched()Z

    move-result v2

    if-nez v2, :cond_1

    .line 371
    invoke-virtual {v0}, Landroidx/compose/foundation/EdgeEffectWrapper;->isBottomAnimating()Z

    move-result v2

    if-nez v2, :cond_1

    .line 372
    invoke-virtual {v0}, Landroidx/compose/foundation/EdgeEffectWrapper;->isBottomNegationStretched()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 368
    .end local v0    # "$this$shouldDrawVerticalStretch_u24lambda_u245":Landroidx/compose/foundation/EdgeEffectWrapper;
    .end local v1    # "$i$a$-with-StretchOverscrollNode$shouldDrawVerticalStretch$1":I
    :goto_1
    nop

    .line 373
    return v2
.end method


# virtual methods
.method public draw(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V
    .locals 34
    .param p1, "$this$draw"    # Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;

    .line 207
    move-object/from16 v1, p0

    iget-object v0, v1, Landroidx/compose/foundation/StretchOverscrollNode;->overscrollEffect:Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->getSize-NH-jbRc()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;->updateSize-uvyYCjk$foundation_release(J)V

    .line 208
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/AndroidCanvas_androidKt;->getNativeCanvas(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;

    move-result-object v2

    .line 209
    .local v2, "canvas":Landroid/graphics/Canvas;
    iget-object v0, v1, Landroidx/compose/foundation/StretchOverscrollNode;->overscrollEffect:Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;

    invoke-virtual {v0}, Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;->getRedrawSignal$foundation_release()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 210
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->getSize-NH-jbRc()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Size;->isEmpty-impl(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    .line 213
    return-void

    .line 217
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v0

    if-nez v0, :cond_1

    .line 218
    iget-object v0, v1, Landroidx/compose/foundation/StretchOverscrollNode;->edgeEffectWrapper:Landroidx/compose/foundation/EdgeEffectWrapper;

    invoke-virtual {v0}, Landroidx/compose/foundation/EdgeEffectWrapper;->finishAll()V

    .line 219
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    .line 220
    return-void

    .line 222
    :cond_1
    invoke-static {}, Landroidx/compose/foundation/ClipScrollableContainerKt;->getMaxSupportedElevation()F

    move-result v0

    move-object/from16 v3, p1

    invoke-interface {v3, v0}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->toPx-0680j_4(F)F

    move-result v4

    .line 223
    .local v4, "maxElevation":F
    const/4 v0, 0x0

    .line 224
    .local v0, "needsInvalidate":Z
    iget-object v5, v1, Landroidx/compose/foundation/StretchOverscrollNode;->edgeEffectWrapper:Landroidx/compose/foundation/EdgeEffectWrapper;

    .local v5, "$this$draw_u24lambda_u244":Landroidx/compose/foundation/EdgeEffectWrapper;
    const/4 v6, 0x0

    .line 225
    .local v6, "$i$a$-with-StretchOverscrollNode$draw$1":I
    invoke-direct {v1}, Landroidx/compose/foundation/StretchOverscrollNode;->shouldDrawVerticalStretch()Z

    move-result v7

    .line 226
    .local v7, "shouldDrawVerticalStretch":Z
    invoke-direct {v1}, Landroidx/compose/foundation/StretchOverscrollNode;->shouldDrawHorizontalStretch()Z

    move-result v8

    .line 227
    .local v8, "shouldDrawHorizontalStretch":Z
    nop

    .line 231
    const/4 v9, 0x0

    if-eqz v7, :cond_2

    if-eqz v8, :cond_2

    .line 232
    invoke-direct {v1}, Landroidx/compose/foundation/StretchOverscrollNode;->getRenderNode()Landroid/graphics/RenderNode;

    move-result-object v10

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v11

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v12

    invoke-virtual {v10, v9, v9, v11, v12}, Landroid/graphics/RenderNode;->setPosition(IIII)Z

    goto :goto_0

    .line 234
    :cond_2
    if-eqz v7, :cond_3

    .line 235
    invoke-direct {v1}, Landroidx/compose/foundation/StretchOverscrollNode;->getRenderNode()Landroid/graphics/RenderNode;

    move-result-object v10

    .line 236
    nop

    .line 237
    nop

    .line 238
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v11

    invoke-static {v4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v12

    mul-int/lit8 v12, v12, 0x2

    add-int/2addr v11, v12

    .line 239
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v12

    .line 235
    invoke-virtual {v10, v9, v9, v11, v12}, Landroid/graphics/RenderNode;->setPosition(IIII)Z

    goto :goto_0

    .line 242
    :cond_3
    if-eqz v8, :cond_19

    .line 243
    invoke-direct {v1}, Landroidx/compose/foundation/StretchOverscrollNode;->getRenderNode()Landroid/graphics/RenderNode;

    move-result-object v10

    .line 244
    nop

    .line 245
    nop

    .line 246
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v11

    .line 247
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v12

    invoke-static {v4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v13

    mul-int/lit8 v13, v13, 0x2

    add-int/2addr v12, v13

    .line 243
    invoke-virtual {v10, v9, v9, v11, v12}, Landroid/graphics/RenderNode;->setPosition(IIII)Z

    .line 255
    :goto_0
    invoke-direct {v1}, Landroidx/compose/foundation/StretchOverscrollNode;->getRenderNode()Landroid/graphics/RenderNode;

    move-result-object v10

    invoke-virtual {v10}, Landroid/graphics/RenderNode;->beginRecording()Landroid/graphics/RecordingCanvas;

    move-result-object v10

    .line 266
    .local v10, "recordingCanvas":Landroid/graphics/RecordingCanvas;
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isLeftNegationStretched()Z

    move-result v11

    if-eqz v11, :cond_4

    .line 267
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateLeftEffectNegation()Landroid/widget/EdgeEffect;

    move-result-object v11

    .line 269
    .local v11, "leftEffectNegation":Landroid/widget/EdgeEffect;
    move-object v12, v10

    check-cast v12, Landroid/graphics/Canvas;

    invoke-direct {v1, v11, v12}, Landroidx/compose/foundation/StretchOverscrollNode;->drawRightStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 270
    invoke-virtual {v11}, Landroid/widget/EdgeEffect;->finish()V

    .line 272
    .end local v11    # "leftEffectNegation":Landroid/widget/EdgeEffect;
    :cond_4
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isLeftAnimating()Z

    move-result v11

    const-wide v13, 0xffffffffL

    if-eqz v11, :cond_6

    .line 273
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateLeftEffect()Landroid/widget/EdgeEffect;

    move-result-object v11

    .line 274
    .local v11, "leftEffect":Landroid/widget/EdgeEffect;
    move-object v15, v10

    check-cast v15, Landroid/graphics/Canvas;

    invoke-direct {v1, v11, v15}, Landroidx/compose/foundation/StretchOverscrollNode;->drawLeftStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v15

    move v0, v15

    .line 275
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isLeftStretched()Z

    move-result v15

    if-eqz v15, :cond_5

    .line 278
    iget-object v15, v1, Landroidx/compose/foundation/StretchOverscrollNode;->overscrollEffect:Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;

    invoke-virtual {v15}, Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;->displacement-F1C5BW0$foundation_release()J

    move-result-wide v15

    .local v15, "arg0$iv":J
    const/16 v17, 0x0

    .line 1075
    .local v17, "$i$f$getY-impl":I
    move-wide/from16 v18, v15

    .local v18, "value$iv$iv":J
    const/16 v20, 0x0

    .line 1076
    .local v20, "$i$f$unpackFloat2":I
    move-object/from16 v22, v10

    .end local v10    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .local v22, "recordingCanvas":Landroid/graphics/RecordingCanvas;
    and-long v9, v18, v13

    long-to-int v9, v9

    .local v9, "bits$iv$iv$iv":I
    const/4 v10, 0x0

    .line 1077
    .local v10, "$i$f$floatFromBits":I
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    .line 1076
    .end local v9    # "bits$iv$iv$iv":I
    .end local v10    # "$i$f$floatFromBits":I
    nop

    .line 1075
    .end local v18    # "value$iv$iv":J
    .end local v20    # "$i$f$unpackFloat2":I
    nop

    .line 278
    .end local v15    # "arg0$iv":J
    .end local v17    # "$i$f$getY-impl":I
    nop

    .line 280
    .local v9, "displacementY":F
    sget-object v10, Landroidx/compose/foundation/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;

    .line 279
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateLeftEffectNegation()Landroid/widget/EdgeEffect;

    move-result-object v15

    .line 280
    const/high16 v16, 0x3f800000    # 1.0f

    sget-object v12, Landroidx/compose/foundation/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;

    invoke-virtual {v12, v11}, Landroidx/compose/foundation/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v12

    move-wide/from16 v17, v13

    sub-float v13, v16, v9

    invoke-virtual {v10, v15, v12, v13}, Landroidx/compose/foundation/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    goto :goto_1

    .line 275
    .end local v9    # "displacementY":F
    .end local v22    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .local v10, "recordingCanvas":Landroid/graphics/RecordingCanvas;
    :cond_5
    move-object/from16 v22, v10

    move-wide/from16 v17, v13

    const/high16 v16, 0x3f800000    # 1.0f

    .end local v10    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .restart local v22    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    goto :goto_1

    .line 272
    .end local v11    # "leftEffect":Landroid/widget/EdgeEffect;
    .end local v22    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .restart local v10    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    :cond_6
    move-object/from16 v22, v10

    move-wide/from16 v17, v13

    const/high16 v16, 0x3f800000    # 1.0f

    .line 283
    .end local v10    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .restart local v22    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    :goto_1
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isTopNegationStretched()Z

    move-result v9

    if-eqz v9, :cond_7

    .line 284
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateTopEffectNegation()Landroid/widget/EdgeEffect;

    move-result-object v9

    .line 286
    .local v9, "topEffectNegation":Landroid/widget/EdgeEffect;
    move-object/from16 v10, v22

    check-cast v10, Landroid/graphics/Canvas;

    invoke-direct {v1, v9, v10}, Landroidx/compose/foundation/StretchOverscrollNode;->drawBottomStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 287
    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->finish()V

    .line 289
    .end local v9    # "topEffectNegation":Landroid/widget/EdgeEffect;
    :cond_7
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isTopAnimating()Z

    move-result v9

    if-eqz v9, :cond_b

    .line 290
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateTopEffect()Landroid/widget/EdgeEffect;

    move-result-object v9

    .line 291
    .local v9, "topEffect":Landroid/widget/EdgeEffect;
    move-object/from16 v12, v22

    check-cast v12, Landroid/graphics/Canvas;

    invoke-direct {v1, v9, v12}, Landroidx/compose/foundation/StretchOverscrollNode;->drawTopStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v12

    if-nez v12, :cond_9

    if-eqz v0, :cond_8

    goto :goto_2

    :cond_8
    const/4 v12, 0x0

    goto :goto_3

    :cond_9
    :goto_2
    const/4 v12, 0x1

    :goto_3
    move v0, v12

    .line 292
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isTopStretched()Z

    move-result v12

    if-eqz v12, :cond_a

    .line 295
    iget-object v12, v1, Landroidx/compose/foundation/StretchOverscrollNode;->overscrollEffect:Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;

    invoke-virtual {v12}, Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;->displacement-F1C5BW0$foundation_release()J

    move-result-wide v12

    .local v12, "arg0$iv":J
    const/4 v14, 0x0

    .line 1078
    .local v14, "$i$f$getX-impl":I
    move-wide/from16 v19, v12

    .local v19, "value$iv$iv":J
    const/4 v15, 0x0

    .line 1079
    .local v15, "$i$f$unpackFloat1":I
    const/16 v23, 0x20

    shr-long v10, v19, v23

    long-to-int v10, v10

    .local v10, "bits$iv$iv$iv":I
    const/4 v11, 0x0

    .line 1080
    .local v11, "$i$f$floatFromBits":I
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    .line 1079
    .end local v10    # "bits$iv$iv$iv":I
    .end local v11    # "$i$f$floatFromBits":I
    nop

    .line 1078
    .end local v15    # "$i$f$unpackFloat1":I
    .end local v19    # "value$iv$iv":J
    nop

    .line 295
    .end local v12    # "arg0$iv":J
    .end local v14    # "$i$f$getX-impl":I
    nop

    .line 297
    .local v10, "displacementX":F
    sget-object v11, Landroidx/compose/foundation/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;

    .line 296
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateTopEffectNegation()Landroid/widget/EdgeEffect;

    move-result-object v12

    .line 297
    sget-object v13, Landroidx/compose/foundation/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;

    invoke-virtual {v13, v9}, Landroidx/compose/foundation/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v13

    invoke-virtual {v11, v12, v13, v10}, Landroidx/compose/foundation/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    goto :goto_4

    .line 292
    .end local v10    # "displacementX":F
    :cond_a
    const/16 v23, 0x20

    goto :goto_4

    .line 289
    .end local v9    # "topEffect":Landroid/widget/EdgeEffect;
    :cond_b
    const/16 v23, 0x20

    .line 300
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isRightNegationStretched()Z

    move-result v9

    if-eqz v9, :cond_c

    .line 301
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateRightEffectNegation()Landroid/widget/EdgeEffect;

    move-result-object v9

    .line 303
    .local v9, "rightEffectNegation":Landroid/widget/EdgeEffect;
    move-object/from16 v10, v22

    check-cast v10, Landroid/graphics/Canvas;

    invoke-direct {v1, v9, v10}, Landroidx/compose/foundation/StretchOverscrollNode;->drawLeftStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 304
    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->finish()V

    .line 306
    .end local v9    # "rightEffectNegation":Landroid/widget/EdgeEffect;
    :cond_c
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isRightAnimating()Z

    move-result v9

    if-eqz v9, :cond_10

    .line 307
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateRightEffect()Landroid/widget/EdgeEffect;

    move-result-object v9

    .line 308
    .local v9, "rightEffect":Landroid/widget/EdgeEffect;
    move-object/from16 v10, v22

    check-cast v10, Landroid/graphics/Canvas;

    invoke-direct {v1, v9, v10}, Landroidx/compose/foundation/StretchOverscrollNode;->drawRightStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v10

    if-nez v10, :cond_e

    if-eqz v0, :cond_d

    goto :goto_5

    :cond_d
    const/4 v10, 0x0

    goto :goto_6

    :cond_e
    :goto_5
    const/4 v10, 0x1

    :goto_6
    move v0, v10

    .line 309
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isRightStretched()Z

    move-result v10

    if-eqz v10, :cond_f

    .line 312
    iget-object v10, v1, Landroidx/compose/foundation/StretchOverscrollNode;->overscrollEffect:Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;

    invoke-virtual {v10}, Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;->displacement-F1C5BW0$foundation_release()J

    move-result-wide v10

    .local v10, "arg0$iv":J
    const/4 v12, 0x0

    .line 1081
    .local v12, "$i$f$getY-impl":I
    move-wide v13, v10

    .local v13, "value$iv$iv":J
    const/4 v15, 0x0

    .line 1082
    .local v15, "$i$f$unpackFloat2":I
    move/from16 v19, v4

    .end local v4    # "maxElevation":F
    .local v19, "maxElevation":F
    and-long v3, v13, v17

    long-to-int v3, v3

    .local v3, "bits$iv$iv$iv":I
    const/4 v4, 0x0

    .line 1083
    .local v4, "$i$f$floatFromBits":I
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    .line 1082
    .end local v3    # "bits$iv$iv$iv":I
    .end local v4    # "$i$f$floatFromBits":I
    nop

    .line 1081
    .end local v13    # "value$iv$iv":J
    .end local v15    # "$i$f$unpackFloat2":I
    nop

    .line 312
    .end local v10    # "arg0$iv":J
    .end local v12    # "$i$f$getY-impl":I
    nop

    .line 314
    .local v3, "displacementY":F
    sget-object v4, Landroidx/compose/foundation/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;

    .line 313
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateRightEffectNegation()Landroid/widget/EdgeEffect;

    move-result-object v10

    .line 314
    sget-object v11, Landroidx/compose/foundation/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;

    invoke-virtual {v11, v9}, Landroidx/compose/foundation/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v11

    invoke-virtual {v4, v10, v11, v3}, Landroidx/compose/foundation/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    goto :goto_7

    .line 309
    .end local v3    # "displacementY":F
    .end local v19    # "maxElevation":F
    .local v4, "maxElevation":F
    :cond_f
    move/from16 v19, v4

    .end local v4    # "maxElevation":F
    .restart local v19    # "maxElevation":F
    goto :goto_7

    .line 306
    .end local v9    # "rightEffect":Landroid/widget/EdgeEffect;
    .end local v19    # "maxElevation":F
    .restart local v4    # "maxElevation":F
    :cond_10
    move/from16 v19, v4

    .line 317
    .end local v4    # "maxElevation":F
    .restart local v19    # "maxElevation":F
    :goto_7
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isBottomNegationStretched()Z

    move-result v3

    if-eqz v3, :cond_11

    .line 318
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateBottomEffectNegation()Landroid/widget/EdgeEffect;

    move-result-object v3

    .line 320
    .local v3, "bottomEffectNegation":Landroid/widget/EdgeEffect;
    move-object/from16 v4, v22

    check-cast v4, Landroid/graphics/Canvas;

    invoke-direct {v1, v3, v4}, Landroidx/compose/foundation/StretchOverscrollNode;->drawTopStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 321
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->finish()V

    .line 323
    .end local v3    # "bottomEffectNegation":Landroid/widget/EdgeEffect;
    :cond_11
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isBottomAnimating()Z

    move-result v3

    if-eqz v3, :cond_15

    .line 324
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateBottomEffect()Landroid/widget/EdgeEffect;

    move-result-object v3

    .line 325
    .local v3, "bottomEffect":Landroid/widget/EdgeEffect;
    nop

    .line 326
    move-object/from16 v4, v22

    check-cast v4, Landroid/graphics/Canvas;

    invoke-direct {v1, v3, v4}, Landroidx/compose/foundation/StretchOverscrollNode;->drawBottomStretch(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v4

    if-nez v4, :cond_13

    if-eqz v0, :cond_12

    goto :goto_8

    :cond_12
    const/4 v9, 0x0

    goto :goto_9

    :cond_13
    :goto_8
    const/4 v9, 0x1

    .line 325
    :goto_9
    move v0, v9

    .line 327
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->isBottomStretched()Z

    move-result v4

    if-eqz v4, :cond_14

    .line 330
    iget-object v4, v1, Landroidx/compose/foundation/StretchOverscrollNode;->overscrollEffect:Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;

    invoke-virtual {v4}, Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;->displacement-F1C5BW0$foundation_release()J

    move-result-wide v9

    .local v9, "arg0$iv":J
    const/4 v4, 0x0

    .line 1084
    .local v4, "$i$f$getX-impl":I
    move-wide v11, v9

    .local v11, "value$iv$iv":J
    const/4 v13, 0x0

    .line 1085
    .local v13, "$i$f$unpackFloat1":I
    shr-long v14, v11, v23

    long-to-int v14, v14

    .local v14, "bits$iv$iv$iv":I
    const/4 v15, 0x0

    .line 1086
    .local v15, "$i$f$floatFromBits":I
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    .line 1085
    .end local v14    # "bits$iv$iv$iv":I
    .end local v15    # "$i$f$floatFromBits":I
    nop

    .line 1084
    .end local v11    # "value$iv$iv":J
    .end local v13    # "$i$f$unpackFloat1":I
    nop

    .line 330
    .end local v4    # "$i$f$getX-impl":I
    .end local v9    # "arg0$iv":J
    nop

    .line 332
    .local v14, "displacementX":F
    sget-object v4, Landroidx/compose/foundation/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;

    .line 331
    invoke-virtual {v5}, Landroidx/compose/foundation/EdgeEffectWrapper;->getOrCreateBottomEffectNegation()Landroid/widget/EdgeEffect;

    move-result-object v9

    .line 332
    sget-object v10, Landroidx/compose/foundation/EdgeEffectCompat;->INSTANCE:Landroidx/compose/foundation/EdgeEffectCompat;

    invoke-virtual {v10, v3}, Landroidx/compose/foundation/EdgeEffectCompat;->getDistanceCompat(Landroid/widget/EdgeEffect;)F

    move-result v10

    sub-float v12, v16, v14

    invoke-virtual {v4, v9, v10, v12}, Landroidx/compose/foundation/EdgeEffectCompat;->onPullDistanceCompat(Landroid/widget/EdgeEffect;FF)F

    .line 336
    .end local v3    # "bottomEffect":Landroid/widget/EdgeEffect;
    .end local v14    # "displacementX":F
    :cond_14
    move v3, v0

    goto :goto_a

    .line 323
    :cond_15
    move v3, v0

    .line 336
    .end local v0    # "needsInvalidate":Z
    .local v3, "needsInvalidate":Z
    :goto_a
    if-eqz v3, :cond_16

    iget-object v0, v1, Landroidx/compose/foundation/StretchOverscrollNode;->overscrollEffect:Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;

    invoke-virtual {v0}, Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;->invalidateOverscroll$foundation_release()V

    .line 344
    :cond_16
    const/4 v0, 0x0

    if-eqz v8, :cond_17

    move v4, v0

    goto :goto_b

    :cond_17
    move/from16 v4, v19

    .line 345
    .local v4, "left":F
    :goto_b
    if-eqz v7, :cond_18

    goto :goto_c

    :cond_18
    move/from16 v0, v19

    :goto_c
    move v9, v0

    .line 346
    .local v9, "top":F
    move-object/from16 v10, p1

    .line 347
    .local v10, "outerDraw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    move-object v11, v10

    .local v11, "$this$draw_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    const/4 v12, 0x0

    .line 348
    .local v12, "$i$a$-with-StretchOverscrollNode$draw$1$1":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .local v13, "$this$draw_u2dymL40Pk_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    invoke-interface {v11}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v14

    .local v14, "layoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    move-object/from16 v0, v22

    check-cast v0, Landroid/graphics/Canvas;

    invoke-static {v0}, Landroidx/compose/ui/graphics/AndroidCanvas_androidKt;->Canvas(Landroid/graphics/Canvas;)Landroidx/compose/ui/graphics/Canvas;

    move-result-object v15

    move-object/from16 v16, v5

    move/from16 v17, v6

    .end local v5    # "$this$draw_u24lambda_u244":Landroidx/compose/foundation/EdgeEffectWrapper;
    .end local v6    # "$i$a$-with-StretchOverscrollNode$draw$1":I
    .local v15, "canvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v16, "$this$draw_u24lambda_u244":Landroidx/compose/foundation/EdgeEffectWrapper;
    .local v17, "$i$a$-with-StretchOverscrollNode$draw$1":I
    invoke-interface {v11}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->getSize-NH-jbRc()J

    move-result-wide v5

    .line 1087
    .local v5, "size$iv":J
    nop

    .line 1092
    const/4 v1, 0x0

    .line 1087
    .local v1, "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    const/16 v18, 0x0

    .line 1099
    .local v18, "$i$f$draw-ymL40Pk":I
    invoke-interface {v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    move/from16 v20, v3

    .end local v3    # "needsInvalidate":Z
    .local v20, "needsInvalidate":Z
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getDensity()Landroidx/compose/ui/unit/Density;

    move-result-object v3

    .line 1100
    .local v3, "prevDensity$iv":Landroidx/compose/ui/unit/Density;
    invoke-interface {v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    move/from16 v21, v7

    .end local v7    # "shouldDrawVerticalStretch":Z
    .local v21, "shouldDrawVerticalStretch":Z
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v7

    .line 1101
    .local v7, "prevLayoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    invoke-interface {v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    move/from16 v23, v8

    .end local v8    # "shouldDrawHorizontalStretch":Z
    .local v23, "shouldDrawHorizontalStretch":Z
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v8

    .line 1102
    .local v8, "prevCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    invoke-interface {v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    move-object/from16 v24, v10

    move-object/from16 v25, v11

    .end local v10    # "outerDraw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .end local v11    # "$this$draw_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .local v24, "outerDraw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .local v25, "$this$draw_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    move-result-wide v10

    .line 1103
    .local v10, "prevSize$iv":J
    invoke-interface {v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    move/from16 v26, v12

    .end local v12    # "$i$a$-with-StretchOverscrollNode$draw$1$1":I
    .local v26, "$i$a$-with-StretchOverscrollNode$draw$1$1":I
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getGraphicsLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    move-result-object v12

    .line 1104
    .local v12, "prevLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    invoke-interface {v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    .local v0, "$this$draw_ymL40Pk_u24lambda_u247$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    const/16 v27, 0x0

    .line 1105
    .local v27, "$i$a$-apply-DrawScopeKt$draw$1$iv":I
    move-object/from16 v28, v13

    .end local v13    # "$this$draw_u2dymL40Pk_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .local v28, "$this$draw_u2dymL40Pk_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    move-object/from16 v13, v25

    check-cast v13, Landroidx/compose/ui/unit/Density;

    invoke-interface {v0, v13}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setDensity(Landroidx/compose/ui/unit/Density;)V

    .line 1106
    invoke-interface {v0, v14}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 1107
    invoke-interface {v0, v15}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setCanvas(Landroidx/compose/ui/graphics/Canvas;)V

    .line 1108
    invoke-interface {v0, v5, v6}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 1109
    invoke-interface {v0, v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setGraphicsLayer(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 1110
    nop

    .line 1104
    .end local v0    # "$this$draw_ymL40Pk_u24lambda_u247$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v27    # "$i$a$-apply-DrawScopeKt$draw$1$iv":I
    nop

    .line 1111
    invoke-interface {v15}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 1112
    nop

    .line 1113
    move-object/from16 v13, v28

    .local v13, "$this$draw_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/16 v27, 0x0

    .line 349
    .local v27, "$i$a$-draw-ymL40Pk$default-StretchOverscrollNode$draw$1$1$1":I
    move-object/from16 v29, v13

    .local v29, "$this$translate$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/16 v30, 0x0

    .line 1114
    .local v30, "$i$f$translate":I
    :try_start_0
    invoke-interface/range {v29 .. v29}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v0

    invoke-interface {v0, v4, v9}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1115
    nop

    .line 1116
    move-object/from16 v0, v29

    .local v0, "$this$draw_u24lambda_u244_u24lambda_u243_u24lambda_u242_u24lambda_u241":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/16 v31, 0x0

    .line 353
    .local v31, "$i$a$-translate-StretchOverscrollNode$draw$1$1$1$1":I
    :try_start_1
    invoke-interface/range {v24 .. v24}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 354
    nop

    .line 1116
    .end local v0    # "$this$draw_u24lambda_u244_u24lambda_u243_u24lambda_u242_u24lambda_u241":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v31    # "$i$a$-translate-StretchOverscrollNode$draw$1$1$1$1":I
    nop

    .line 1118
    :try_start_2
    invoke-interface/range {v29 .. v29}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v31, v1

    .end local v1    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v31, "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    neg-float v1, v4

    move-wide/from16 v32, v5

    .end local v5    # "size$iv":J
    .local v32, "size$iv":J
    neg-float v5, v9

    :try_start_3
    invoke-interface {v0, v1, v5}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1119
    nop

    .line 1120
    nop

    .line 355
    .end local v29    # "$this$translate$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v30    # "$i$f$translate":I
    nop

    .line 1113
    .end local v13    # "$this$draw_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v27    # "$i$a$-draw-ymL40Pk$default-StretchOverscrollNode$draw$1$1$1":I
    nop

    .line 1121
    invoke-interface {v15}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 1122
    invoke-interface/range {v28 .. v28}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    .local v0, "$this$draw_ymL40Pk_u24lambda_u248$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    const/4 v1, 0x0

    .line 1123
    .local v1, "$i$a$-apply-DrawScopeKt$draw$2$iv":I
    invoke-interface {v0, v3}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setDensity(Landroidx/compose/ui/unit/Density;)V

    .line 1124
    invoke-interface {v0, v7}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 1125
    invoke-interface {v0, v8}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setCanvas(Landroidx/compose/ui/graphics/Canvas;)V

    .line 1126
    invoke-interface {v0, v10, v11}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 1127
    invoke-interface {v0, v12}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setGraphicsLayer(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 1128
    nop

    .line 1122
    .end local v0    # "$this$draw_ymL40Pk_u24lambda_u248$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v1    # "$i$a$-apply-DrawScopeKt$draw$2$iv":I
    nop

    .line 1129
    nop

    .line 1130
    nop

    .line 356
    .end local v3    # "prevDensity$iv":Landroidx/compose/ui/unit/Density;
    .end local v7    # "prevLayoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v8    # "prevCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v10    # "prevSize$iv":J
    .end local v12    # "prevLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v14    # "layoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v15    # "canvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v18    # "$i$f$draw-ymL40Pk":I
    .end local v28    # "$this$draw_u2dymL40Pk_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v31    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v32    # "size$iv":J
    nop

    .line 347
    .end local v25    # "$this$draw_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .end local v26    # "$i$a$-with-StretchOverscrollNode$draw$1$1":I
    nop

    .line 357
    invoke-direct/range {p0 .. p0}, Landroidx/compose/foundation/StretchOverscrollNode;->getRenderNode()Landroid/graphics/RenderNode;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RenderNode;->endRecording()V

    .line 360
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 361
    .local v0, "restore":I
    neg-float v1, v4

    neg-float v3, v9

    invoke-virtual {v2, v1, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 362
    invoke-direct/range {p0 .. p0}, Landroidx/compose/foundation/StretchOverscrollNode;->getRenderNode()Landroid/graphics/RenderNode;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->drawRenderNode(Landroid/graphics/RenderNode;)V

    .line 363
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 364
    nop

    .line 224
    .end local v0    # "restore":I
    .end local v4    # "left":F
    .end local v9    # "top":F
    .end local v16    # "$this$draw_u24lambda_u244":Landroidx/compose/foundation/EdgeEffectWrapper;
    .end local v17    # "$i$a$-with-StretchOverscrollNode$draw$1":I
    .end local v21    # "shouldDrawVerticalStretch":Z
    .end local v22    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .end local v23    # "shouldDrawHorizontalStretch":Z
    .end local v24    # "outerDraw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    nop

    .line 365
    return-void

    .line 1118
    .local v1, "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v3    # "prevDensity$iv":Landroidx/compose/ui/unit/Density;
    .restart local v4    # "left":F
    .restart local v5    # "size$iv":J
    .restart local v7    # "prevLayoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local v8    # "prevCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .restart local v9    # "top":F
    .restart local v10    # "prevSize$iv":J
    .restart local v12    # "prevLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v13    # "$this$draw_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v14    # "layoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local v15    # "canvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .restart local v16    # "$this$draw_u24lambda_u244":Landroidx/compose/foundation/EdgeEffectWrapper;
    .restart local v17    # "$i$a$-with-StretchOverscrollNode$draw$1":I
    .restart local v18    # "$i$f$draw-ymL40Pk":I
    .restart local v21    # "shouldDrawVerticalStretch":Z
    .restart local v22    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .restart local v23    # "shouldDrawHorizontalStretch":Z
    .restart local v24    # "outerDraw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .restart local v25    # "$this$draw_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .restart local v26    # "$i$a$-with-StretchOverscrollNode$draw$1$1":I
    .restart local v27    # "$i$a$-draw-ymL40Pk$default-StretchOverscrollNode$draw$1$1$1":I
    .restart local v28    # "$this$draw_u2dymL40Pk_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v29    # "$this$translate$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v30    # "$i$f$translate":I
    :catchall_0
    move-exception v0

    move-object/from16 v31, v1

    move-wide/from16 v32, v5

    .end local v1    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v5    # "size$iv":J
    .restart local v31    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v32    # "size$iv":J
    :try_start_4
    invoke-interface/range {v29 .. v29}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v1

    neg-float v5, v4

    neg-float v6, v9

    invoke-interface {v1, v5, v6}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .end local v2    # "canvas":Landroid/graphics/Canvas;
    .end local v3    # "prevDensity$iv":Landroidx/compose/ui/unit/Density;
    .end local v4    # "left":F
    .end local v7    # "prevLayoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v8    # "prevCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v9    # "top":F
    .end local v10    # "prevSize$iv":J
    .end local v12    # "prevLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v14    # "layoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v15    # "canvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v16    # "$this$draw_u24lambda_u244":Landroidx/compose/foundation/EdgeEffectWrapper;
    .end local v17    # "$i$a$-with-StretchOverscrollNode$draw$1":I
    .end local v18    # "$i$f$draw-ymL40Pk":I
    .end local v19    # "maxElevation":F
    .end local v20    # "needsInvalidate":Z
    .end local v21    # "shouldDrawVerticalStretch":Z
    .end local v22    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .end local v23    # "shouldDrawHorizontalStretch":Z
    .end local v24    # "outerDraw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .end local v25    # "$this$draw_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .end local v26    # "$i$a$-with-StretchOverscrollNode$draw$1$1":I
    .end local v28    # "$this$draw_u2dymL40Pk_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v31    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v32    # "size$iv":J
    .end local p1    # "$this$draw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1121
    .end local v13    # "$this$draw_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v27    # "$i$a$-draw-ymL40Pk$default-StretchOverscrollNode$draw$1$1$1":I
    .end local v29    # "$this$translate$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v30    # "$i$f$translate":I
    .restart local v2    # "canvas":Landroid/graphics/Canvas;
    .restart local v3    # "prevDensity$iv":Landroidx/compose/ui/unit/Density;
    .restart local v4    # "left":F
    .restart local v7    # "prevLayoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local v8    # "prevCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .restart local v9    # "top":F
    .restart local v10    # "prevSize$iv":J
    .restart local v12    # "prevLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v14    # "layoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local v15    # "canvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .restart local v16    # "$this$draw_u24lambda_u244":Landroidx/compose/foundation/EdgeEffectWrapper;
    .restart local v17    # "$i$a$-with-StretchOverscrollNode$draw$1":I
    .restart local v18    # "$i$f$draw-ymL40Pk":I
    .restart local v19    # "maxElevation":F
    .restart local v20    # "needsInvalidate":Z
    .restart local v21    # "shouldDrawVerticalStretch":Z
    .restart local v22    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .restart local v23    # "shouldDrawHorizontalStretch":Z
    .restart local v24    # "outerDraw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .restart local v25    # "$this$draw_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .restart local v26    # "$i$a$-with-StretchOverscrollNode$draw$1$1":I
    .restart local v28    # "$this$draw_u2dymL40Pk_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v31    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v32    # "size$iv":J
    .restart local p1    # "$this$draw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    :catchall_1
    move-exception v0

    goto :goto_d

    .end local v31    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v32    # "size$iv":J
    .restart local v1    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v5    # "size$iv":J
    :catchall_2
    move-exception v0

    move-object/from16 v31, v1

    move-wide/from16 v32, v5

    .end local v1    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v5    # "size$iv":J
    .restart local v31    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v32    # "size$iv":J
    :goto_d
    invoke-interface {v15}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 1122
    invoke-interface/range {v28 .. v28}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v1

    .local v1, "$this$draw_ymL40Pk_u24lambda_u248$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    const/4 v5, 0x0

    .line 1123
    .local v5, "$i$a$-apply-DrawScopeKt$draw$2$iv":I
    invoke-interface {v1, v3}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setDensity(Landroidx/compose/ui/unit/Density;)V

    .line 1124
    invoke-interface {v1, v7}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 1125
    invoke-interface {v1, v8}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setCanvas(Landroidx/compose/ui/graphics/Canvas;)V

    .line 1126
    invoke-interface {v1, v10, v11}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 1127
    invoke-interface {v1, v12}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setGraphicsLayer(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 1128
    nop

    .line 1122
    .end local v1    # "$this$draw_ymL40Pk_u24lambda_u248$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v5    # "$i$a$-apply-DrawScopeKt$draw$2$iv":I
    throw v0

    .line 251
    .end local v3    # "prevDensity$iv":Landroidx/compose/ui/unit/Density;
    .end local v9    # "top":F
    .end local v10    # "prevSize$iv":J
    .end local v12    # "prevLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v14    # "layoutDirection$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v15    # "canvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v16    # "$this$draw_u24lambda_u244":Landroidx/compose/foundation/EdgeEffectWrapper;
    .end local v17    # "$i$a$-with-StretchOverscrollNode$draw$1":I
    .end local v18    # "$i$f$draw-ymL40Pk":I
    .end local v19    # "maxElevation":F
    .end local v20    # "needsInvalidate":Z
    .end local v21    # "shouldDrawVerticalStretch":Z
    .end local v22    # "recordingCanvas":Landroid/graphics/RecordingCanvas;
    .end local v23    # "shouldDrawHorizontalStretch":Z
    .end local v24    # "outerDraw":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .end local v25    # "$this$draw_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;
    .end local v26    # "$i$a$-with-StretchOverscrollNode$draw$1$1":I
    .end local v28    # "$this$draw_u2dymL40Pk_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v31    # "graphicsLayer$iv":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v32    # "size$iv":J
    .local v0, "needsInvalidate":Z
    .local v4, "maxElevation":F
    .local v5, "$this$draw_u24lambda_u244":Landroidx/compose/foundation/EdgeEffectWrapper;
    .restart local v6    # "$i$a$-with-StretchOverscrollNode$draw$1":I
    .local v7, "shouldDrawVerticalStretch":Z
    .local v8, "shouldDrawHorizontalStretch":Z
    :cond_19
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    .line 252
    return-void
.end method
