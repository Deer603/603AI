.class public final Landroidx/compose/foundation/BorderModifierNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "Border.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 11 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,468:1\n56#2,6:469\n30#3:475\n80#4:476\n60#4:489\n70#4:493\n85#4:499\n90#4:501\n60#4:529\n70#4:532\n365#5,11:477\n376#5:491\n377#5,4:494\n381#5,2:502\n379#5,6:504\n387#5,3:511\n392#5,2:523\n394#5:556\n395#5,2:565\n57#6:488\n61#6:492\n57#6:528\n61#6:531\n22#7:490\n22#7:530\n54#8:498\n59#8:500\n1#9:510\n536#10,9:514\n545#10,8:557\n120#11,3:525\n167#11,6:533\n249#11,14:539\n124#11,3:553\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n240#1:469,6\n240#1:475\n240#1:476\n247#1:489\n247#1:493\n247#1:499\n247#1:501\n262#1:529\n262#1:532\n247#1:477,11\n247#1:491\n247#1:494,4\n247#1:502,2\n247#1:504,6\n247#1:511,3\n247#1:523,2\n247#1:556\n247#1:565,2\n247#1:488\n247#1:492\n262#1:528\n262#1:531\n247#1:490\n262#1:530\n247#1:498\n247#1:500\n247#1:510\n247#1:514,9\n247#1:557,8\n250#1:525,3\n262#1:533,6\n262#1:539,14\n250#1:553,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JF\u0010\'\u001a\u00020\u001f*\u00020 2\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R,\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006/"
    }
    d2 = {
        "Landroidx/compose/foundation/BorderModifierNode;",
        "Landroidx/compose/ui/node/DelegatingNode;",
        "widthParameter",
        "Landroidx/compose/ui/unit/Dp;",
        "brushParameter",
        "Landroidx/compose/ui/graphics/Brush;",
        "shapeParameter",
        "Landroidx/compose/ui/graphics/Shape;",
        "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "borderCache",
        "Landroidx/compose/foundation/BorderCache;",
        "value",
        "brush",
        "getBrush",
        "()Landroidx/compose/ui/graphics/Brush;",
        "setBrush",
        "(Landroidx/compose/ui/graphics/Brush;)V",
        "drawWithCacheModifierNode",
        "Landroidx/compose/ui/draw/CacheDrawModifierNode;",
        "shape",
        "getShape",
        "()Landroidx/compose/ui/graphics/Shape;",
        "setShape",
        "(Landroidx/compose/ui/graphics/Shape;)V",
        "width",
        "getWidth-D9Ej5fM",
        "()F",
        "setWidth-0680j_4",
        "(F)V",
        "F",
        "drawGenericBorder",
        "Landroidx/compose/ui/draw/DrawResult;",
        "Landroidx/compose/ui/draw/CacheDrawScope;",
        "outline",
        "Landroidx/compose/ui/graphics/Outline$Generic;",
        "fillArea",
        "",
        "strokeWidth",
        "",
        "drawRoundRectBorder",
        "Landroidx/compose/ui/graphics/Outline$Rounded;",
        "topLeft",
        "Landroidx/compose/ui/geometry/Offset;",
        "borderSize",
        "Landroidx/compose/ui/geometry/Size;",
        "drawRoundRectBorder-JqoCqck",
        "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;",
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


# static fields
.field public static final $stable:I


# instance fields
.field private borderCache:Landroidx/compose/foundation/BorderCache;

.field private brush:Landroidx/compose/ui/graphics/Brush;

.field private final drawWithCacheModifierNode:Landroidx/compose/ui/draw/CacheDrawModifierNode;

.field private shape:Landroidx/compose/ui/graphics/Shape;

.field private width:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/BorderModifierNode;->$stable:I

    return-void
.end method

.method private constructor <init>(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)V
    .locals 1
    .param p1, "widthParameter"    # F
    .param p2, "brushParameter"    # Landroidx/compose/ui/graphics/Brush;
    .param p3, "shapeParameter"    # Landroidx/compose/ui/graphics/Shape;

    .line 124
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 132
    iput p1, p0, Landroidx/compose/foundation/BorderModifierNode;->width:F

    .line 140
    iput-object p2, p0, Landroidx/compose/foundation/BorderModifierNode;->brush:Landroidx/compose/ui/graphics/Brush;

    .line 148
    iput-object p3, p0, Landroidx/compose/foundation/BorderModifierNode;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 157
    nop

    .line 158
    new-instance v0, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/BorderModifierNode$drawWithCacheModifierNode$1;-><init>(Landroidx/compose/foundation/BorderModifierNode;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Landroidx/compose/ui/draw/DrawModifierKt;->CacheDrawModifierNode(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/CacheDrawModifierNode;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    .line 157
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/BorderModifierNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/draw/CacheDrawModifierNode;

    iput-object v0, p0, Landroidx/compose/foundation/BorderModifierNode;->drawWithCacheModifierNode:Landroidx/compose/ui/draw/CacheDrawModifierNode;

    .line 120
    return-void
.end method

.method public synthetic constructor <init>(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/BorderModifierNode;-><init>(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)V

    return-void
.end method

.method public static final synthetic access$drawGenericBorder(Landroidx/compose/foundation/BorderModifierNode;Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/BorderModifierNode;
    .param p1, "$receiver"    # Landroidx/compose/ui/draw/CacheDrawScope;
    .param p2, "brush"    # Landroidx/compose/ui/graphics/Brush;
    .param p3, "outline"    # Landroidx/compose/ui/graphics/Outline$Generic;
    .param p4, "fillArea"    # Z
    .param p5, "strokeWidth"    # F

    .line 120
    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/BorderModifierNode;->drawGenericBorder(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$drawRoundRectBorder-JqoCqck(Landroidx/compose/foundation/BorderModifierNode;Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/BorderModifierNode;
    .param p1, "$receiver"    # Landroidx/compose/ui/draw/CacheDrawScope;
    .param p2, "brush"    # Landroidx/compose/ui/graphics/Brush;
    .param p3, "outline"    # Landroidx/compose/ui/graphics/Outline$Rounded;
    .param p4, "topLeft"    # J
    .param p6, "borderSize"    # J
    .param p8, "fillArea"    # Z
    .param p9, "strokeWidth"    # F

    .line 120
    invoke-direct/range {p0 .. p9}, Landroidx/compose/foundation/BorderModifierNode;->drawRoundRectBorder-JqoCqck(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v0

    return-object v0
.end method

.method private final drawGenericBorder(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;
    .locals 60
    .param p1, "$this$drawGenericBorder"    # Landroidx/compose/ui/draw/CacheDrawScope;
    .param p2, "brush"    # Landroidx/compose/ui/graphics/Brush;
    .param p3, "outline"    # Landroidx/compose/ui/graphics/Outline$Generic;
    .param p4, "fillArea"    # Z
    .param p5, "strokeWidth"    # F

    .line 203
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    if-eqz p4, :cond_0

    .line 204
    new-instance v0, Landroidx/compose/foundation/BorderModifierNode$drawGenericBorder$1;

    move-object/from16 v12, p3

    invoke-direct {v0, v12, v5}, Landroidx/compose/foundation/BorderModifierNode$drawGenericBorder$1;-><init>(Landroidx/compose/ui/graphics/Outline$Generic;Landroidx/compose/ui/graphics/Brush;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v0}, Landroidx/compose/ui/draw/CacheDrawScope;->onDrawWithContent(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v0

    move-object v1, v2

    goto/16 :goto_5

    .line 212
    :cond_0
    move-object/from16 v12, p3

    const/4 v0, 0x0

    .line 213
    .local v0, "config":I
    const/4 v3, 0x0

    .line 214
    .local v3, "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    instance-of v4, v5, Landroidx/compose/ui/graphics/SolidColor;

    if-eqz v4, :cond_1

    .line 215
    sget-object v4, Landroidx/compose/ui/graphics/ImageBitmapConfig;->Companion:Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;->getAlpha8-_sVssgQ()I

    move-result v0

    .line 219
    sget-object v6, Landroidx/compose/ui/graphics/ColorFilter;->Companion:Landroidx/compose/ui/graphics/ColorFilter$Companion;

    move-object v4, v5

    check-cast v4, Landroidx/compose/ui/graphics/SolidColor;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/SolidColor;->getValue-0d7_KjU()J

    move-result-wide v13

    const/16 v19, 0xe

    const/16 v20, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/ui/graphics/ColorFilter$Companion;->tint-xETnrds$default(Landroidx/compose/ui/graphics/ColorFilter$Companion;JIILjava/lang/Object;)Landroidx/compose/ui/graphics/ColorFilter;

    move-result-object v3

    move v15, v0

    move-object/from16 v20, v3

    goto :goto_0

    .line 221
    :cond_1
    sget-object v4, Landroidx/compose/ui/graphics/ImageBitmapConfig;->Companion:Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;->getArgb8888-_sVssgQ()I

    move-result v0

    .line 222
    const/4 v3, 0x0

    move v15, v0

    move-object/from16 v20, v3

    .line 225
    .end local v0    # "config":I
    .end local v3    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .local v15, "config":I
    .local v20, "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    :goto_0
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Outline$Generic;->getPath()Landroidx/compose/ui/graphics/Path;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/Path;->getBounds()Landroidx/compose/ui/geometry/Rect;

    move-result-object v3

    .line 228
    .local v3, "pathBounds":Landroidx/compose/ui/geometry/Rect;
    iget-object v0, v1, Landroidx/compose/foundation/BorderModifierNode;->borderCache:Landroidx/compose/foundation/BorderCache;

    if-nez v0, :cond_2

    .line 229
    new-instance v21, Landroidx/compose/foundation/BorderCache;

    const/16 v26, 0xf

    const/16 v27, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v21 .. v27}, Landroidx/compose/foundation/BorderCache;-><init>(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v21

    iput-object v0, v1, Landroidx/compose/foundation/BorderModifierNode;->borderCache:Landroidx/compose/foundation/BorderCache;

    .line 232
    :cond_2
    iget-object v0, v1, Landroidx/compose/foundation/BorderModifierNode;->borderCache:Landroidx/compose/foundation/BorderCache;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/compose/foundation/BorderCache;->obtainPath()Landroidx/compose/ui/graphics/Path;

    move-result-object v4

    move-object v0, v4

    .local v0, "$this$drawGenericBorder_u24lambda_u240":Landroidx/compose/ui/graphics/Path;
    const/4 v6, 0x0

    .line 233
    .local v6, "$i$a$-apply-BorderModifierNode$drawGenericBorder$maskPath$1":I
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Path;->reset()V

    .line 234
    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v0, v3, v8, v7, v8}, Landroidx/compose/ui/graphics/Path;->addRect$default(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Path$Direction;ILjava/lang/Object;)V

    .line 235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Outline$Generic;->getPath()Landroidx/compose/ui/graphics/Path;

    move-result-object v7

    sget-object v9, Landroidx/compose/ui/graphics/PathOperation;->Companion:Landroidx/compose/ui/graphics/PathOperation$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/graphics/PathOperation$Companion;->getDifference-b3I0S0c()I

    move-result v9

    invoke-interface {v0, v0, v7, v9}, Landroidx/compose/ui/graphics/Path;->op-N5in7k0(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z

    .line 236
    nop

    .line 232
    .end local v0    # "$this$drawGenericBorder_u24lambda_u240":Landroidx/compose/ui/graphics/Path;
    .end local v6    # "$i$a$-apply-BorderModifierNode$drawGenericBorder$maskPath$1":I
    nop

    .line 231
    move-object/from16 v21, v4

    .line 238
    .local v21, "maskPath":Landroidx/compose/ui/graphics/Path;
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    move-object v4, v0

    .line 240
    .local v4, "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    move-object v0, v3

    .local v0, "this_$iv":Landroidx/compose/ui/geometry/Rect;
    const/4 v6, 0x0

    .line 469
    .local v6, "$i$f$getWidth":I
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v7

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v9

    sub-float/2addr v7, v9

    .line 240
    .end local v0    # "this_$iv":Landroidx/compose/ui/geometry/Rect;
    .end local v6    # "$i$f$getWidth":I
    float-to-double v6, v7

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v0, v6

    float-to-int v0, v0

    move-object v6, v3

    .local v6, "this_$iv":Landroidx/compose/ui/geometry/Rect;
    const/4 v7, 0x0

    .line 474
    .local v7, "$i$f$getHeight":I
    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v9

    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v10

    sub-float/2addr v9, v10

    .line 240
    .end local v6    # "this_$iv":Landroidx/compose/ui/geometry/Rect;
    .end local v7    # "$i$f$getHeight":I
    float-to-double v6, v9

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v6, v6

    float-to-int v6, v6

    .local v0, "width$iv":I
    .local v6, "height$iv":I
    const/4 v7, 0x0

    .line 475
    .local v7, "$i$f$IntSize":I
    const/4 v9, 0x0

    .line 476
    .local v9, "$i$f$packInts":I
    int-to-long v10, v0

    const/16 v22, 0x20

    shl-long v10, v10, v22

    int-to-long v13, v6

    const-wide v23, 0xffffffffL

    and-long v13, v13, v23

    or-long v9, v10, v13

    .line 475
    .end local v9    # "$i$f$packInts":I
    invoke-static {v9, v10}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    move-result-wide v6

    .line 240
    .end local v0    # "width$iv":I
    .end local v6    # "height$iv":I
    .end local v7    # "$i$f$IntSize":I
    nop

    .line 239
    move-wide/from16 v25, v6

    .line 241
    .local v25, "pathBoundsSize":J
    iget-object v0, v1, Landroidx/compose/foundation/BorderModifierNode;->borderCache:Landroidx/compose/foundation/BorderCache;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v27, v0

    .local v27, "$this$drawGenericBorder_u24lambda_u244":Landroidx/compose/foundation/BorderCache;
    const/16 v28, 0x0

    .line 246
    .local v28, "$i$a$-with-BorderModifierNode$drawGenericBorder$2":I
    nop

    .line 247
    move-object/from16 v0, p1

    .local v0, "$this$drawBorderCache_u2dEMwLDEs$iv":Landroidx/compose/ui/draw/CacheDrawScope;
    move-object/from16 v6, v27

    .local v6, "this_$iv":Landroidx/compose/foundation/BorderCache;
    move-object/from16 v29, v0

    .end local v0    # "$this$drawBorderCache_u2dEMwLDEs$iv":Landroidx/compose/ui/draw/CacheDrawScope;
    .local v29, "$this$drawBorderCache_u2dEMwLDEs$iv":Landroidx/compose/ui/draw/CacheDrawScope;
    const/16 v30, 0x0

    .line 477
    .local v30, "$i$f$drawBorderCache-EMwLDEs":I
    invoke-static {v6}, Landroidx/compose/foundation/BorderCache;->access$getImageBitmap$p(Landroidx/compose/foundation/BorderCache;)Landroidx/compose/ui/graphics/ImageBitmap;

    move-result-object v0

    .line 478
    .local v0, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    invoke-static {v6}, Landroidx/compose/foundation/BorderCache;->access$getCanvas$p(Landroidx/compose/foundation/BorderCache;)Landroidx/compose/ui/graphics/Canvas;

    move-result-object v7

    .line 482
    .local v7, "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroidx/compose/ui/graphics/ImageBitmap;->getConfig-_sVssgQ()I

    move-result v9

    invoke-static {v9}, Landroidx/compose/ui/graphics/ImageBitmapConfig;->box-impl(I)Landroidx/compose/ui/graphics/ImageBitmapConfig;

    move-result-object v9

    goto :goto_1

    :cond_3
    move-object v9, v8

    :goto_1
    sget-object v10, Landroidx/compose/ui/graphics/ImageBitmapConfig;->Companion:Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;->getArgb8888-_sVssgQ()I

    move-result v10

    const/4 v11, 0x0

    if-nez v9, :cond_4

    move v9, v11

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Landroidx/compose/ui/graphics/ImageBitmapConfig;->unbox-impl()I

    move-result v9

    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ImageBitmapConfig;->equals-impl0(II)Z

    move-result v9

    :goto_2
    if-nez v9, :cond_6

    .line 483
    if-eqz v0, :cond_5

    invoke-interface {v0}, Landroidx/compose/ui/graphics/ImageBitmap;->getConfig-_sVssgQ()I

    move-result v8

    invoke-static {v8}, Landroidx/compose/ui/graphics/ImageBitmapConfig;->box-impl(I)Landroidx/compose/ui/graphics/ImageBitmapConfig;

    move-result-object v8

    :cond_5
    invoke-static {v15, v8}, Landroidx/compose/ui/graphics/ImageBitmapConfig;->equals-impl(ILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    :cond_6
    const/4 v11, 0x1

    .line 481
    :cond_7
    move/from16 v31, v11

    .line 484
    .local v31, "compatibleConfig$iv":Z
    nop

    .line 485
    if-eqz v0, :cond_a

    .line 486
    if-eqz v7, :cond_9

    .line 487
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v8

    .local v8, "arg0$iv$iv":J
    const/4 v10, 0x0

    .line 488
    .local v10, "$i$f$getWidth-impl":I
    move-wide v13, v8

    .local v13, "value$iv$iv$iv":J
    const/4 v11, 0x0

    .line 489
    .local v11, "$i$f$unpackFloat1":I
    move-object/from16 v32, v0

    .end local v0    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v32, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    shr-long v0, v13, v22

    long-to-int v0, v0

    .local v0, "bits$iv$iv$iv$iv":I
    const/4 v1, 0x0

    .line 490
    .local v1, "$i$f$floatFromBits":I
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 489
    .end local v0    # "bits$iv$iv$iv$iv":I
    .end local v1    # "$i$f$floatFromBits":I
    nop

    .line 488
    .end local v11    # "$i$f$unpackFloat1":I
    .end local v13    # "value$iv$iv$iv":J
    nop

    .line 487
    .end local v8    # "arg0$iv$iv":J
    .end local v10    # "$i$f$getWidth-impl":I
    invoke-interface/range {v32 .. v32}, Landroidx/compose/ui/graphics/ImageBitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_b

    .line 491
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    move-result-wide v0

    .local v0, "arg0$iv$iv":J
    const/4 v8, 0x0

    .line 492
    .local v8, "$i$f$getHeight-impl":I
    move-wide v9, v0

    .local v9, "value$iv$iv$iv":J
    const/4 v11, 0x0

    .line 493
    .local v11, "$i$f$unpackFloat2":I
    and-long v13, v9, v23

    long-to-int v13, v13

    .local v13, "bits$iv$iv$iv$iv":I
    const/4 v14, 0x0

    .line 490
    .local v14, "$i$f$floatFromBits":I
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    .line 493
    .end local v13    # "bits$iv$iv$iv$iv":I
    .end local v14    # "$i$f$floatFromBits":I
    nop

    .line 492
    .end local v9    # "value$iv$iv$iv":J
    .end local v11    # "$i$f$unpackFloat2":I
    nop

    .line 491
    .end local v0    # "arg0$iv$iv":J
    .end local v8    # "$i$f$getHeight-impl":I
    invoke-interface/range {v32 .. v32}, Landroidx/compose/ui/graphics/ImageBitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, v13, v0

    if-gtz v0, :cond_b

    .line 494
    if-nez v31, :cond_8

    goto :goto_3

    :cond_8
    move-object/from16 v1, v32

    move-object v13, v7

    goto :goto_4

    .line 486
    .end local v32    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v0, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    :cond_9
    move-object/from16 v32, v0

    .end local v0    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v32    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    goto :goto_3

    .line 485
    .end local v32    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v0    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    :cond_a
    move-object/from16 v32, v0

    .line 497
    .end local v0    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v32    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    :cond_b
    :goto_3
    const/4 v0, 0x0

    .line 498
    .local v0, "$i$f$getWidth-impl":I
    move-wide/from16 v8, v25

    .local v8, "value$iv$iv$iv":J
    const/4 v1, 0x0

    .line 499
    .local v1, "$i$f$unpackInt1":I
    shr-long v10, v8, v22

    long-to-int v13, v10

    .line 498
    .end local v1    # "$i$f$unpackInt1":I
    .end local v8    # "value$iv$iv$iv":J
    nop

    .line 497
    .end local v0    # "$i$f$getWidth-impl":I
    const/4 v0, 0x0

    .line 500
    .local v0, "$i$f$getHeight-impl":I
    nop

    .restart local v8    # "value$iv$iv$iv":J
    const/4 v1, 0x0

    .line 501
    .local v1, "$i$f$unpackInt2":I
    and-long v10, v8, v23

    long-to-int v14, v10

    .line 500
    .end local v1    # "$i$f$unpackInt2":I
    .end local v8    # "value$iv$iv$iv":J
    nop

    .line 497
    .end local v0    # "$i$f$getHeight-impl":I
    const/16 v18, 0x18

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Landroidx/compose/ui/graphics/ImageBitmapKt;->ImageBitmap-x__-hDU$default(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;ILjava/lang/Object;)Landroidx/compose/ui/graphics/ImageBitmap;

    move-result-object v0

    move-object v1, v0

    .local v1, "it$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    const/4 v8, 0x0

    .line 502
    .local v8, "$i$a$-also-BorderCache$drawBorderCache$1$iv":I
    invoke-static {v6, v1}, Landroidx/compose/foundation/BorderCache;->access$setImageBitmap$p(Landroidx/compose/foundation/BorderCache;Landroidx/compose/ui/graphics/ImageBitmap;)V

    .line 503
    nop

    .line 497
    .end local v1    # "it$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v8    # "$i$a$-also-BorderCache$drawBorderCache$1$iv":I
    nop

    .line 504
    nop

    .line 509
    .end local v32    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v0, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    invoke-static {v0}, Landroidx/compose/ui/graphics/CanvasKt;->Canvas(Landroidx/compose/ui/graphics/ImageBitmap;)Landroidx/compose/ui/graphics/Canvas;

    move-result-object v1

    move-object v8, v1

    .line 510
    .local v8, "it$iv":Landroidx/compose/ui/graphics/Canvas;
    const/4 v9, 0x0

    .line 509
    .local v9, "$i$a$-also-BorderCache$drawBorderCache$2$iv":I
    invoke-static {v6, v8}, Landroidx/compose/foundation/BorderCache;->access$setCanvas$p(Landroidx/compose/foundation/BorderCache;Landroidx/compose/ui/graphics/Canvas;)V

    .line 508
    .end local v8    # "it$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v9    # "$i$a$-also-BorderCache$drawBorderCache$2$iv":I
    move-object v7, v1

    move-object v1, v0

    move-object v13, v7

    .line 511
    .end local v0    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v7    # "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v1, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v13, "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    :goto_4
    invoke-static {v6}, Landroidx/compose/foundation/BorderCache;->access$getCanvasDrawScope$p(Landroidx/compose/foundation/BorderCache;)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;

    move-result-object v0

    if-nez v0, :cond_c

    new-instance v0, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;

    invoke-direct {v0}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;-><init>()V

    move-object v7, v0

    .line 510
    .local v7, "it$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    const/4 v8, 0x0

    .line 511
    .local v8, "$i$a$-also-BorderCache$drawBorderCache$targetDrawScope$1$iv":I
    invoke-static {v6, v7}, Landroidx/compose/foundation/BorderCache;->access$setCanvasDrawScope$p(Landroidx/compose/foundation/BorderCache;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V

    .end local v7    # "it$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .end local v8    # "$i$a$-also-BorderCache$drawBorderCache$targetDrawScope$1$iv":I
    :cond_c
    move-object v14, v0

    .line 512
    .local v14, "targetDrawScope$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    invoke-static/range {v25 .. v26}, Landroidx/compose/ui/unit/IntSizeKt;->toSize-ozmzZPI(J)J

    move-result-wide v7

    .line 513
    .local v7, "drawSize$iv":J
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/draw/CacheDrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v9

    .local v9, "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    move-object/from16 v16, v14

    .local v16, "this_$iv$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    const/16 v17, 0x0

    .line 514
    .local v17, "$i$f$draw-yzxVdVo":I
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;->getDrawParams()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->component1()Landroidx/compose/ui/unit/Density;

    move-result-object v10

    .local v10, "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->component2()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v11

    move-object/from16 v18, v6

    .end local v6    # "this_$iv":Landroidx/compose/foundation/BorderCache;
    .local v11, "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .local v18, "this_$iv":Landroidx/compose/foundation/BorderCache;
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->component3()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v6

    move-object/from16 v19, v10

    move-object/from16 v45, v11

    .end local v10    # "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    .end local v11    # "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .local v6, "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v19, "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    .local v45, "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->component4-NH-jbRc()J

    move-result-wide v10

    .line 515
    .local v10, "prevSize$iv$iv":J
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;->getDrawParams()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;

    move-result-object v0

    .local v0, "$this$draw_yzxVdVo_u24lambda_u240$iv$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
    const/16 v32, 0x0

    .line 516
    .local v32, "$i$a$-apply-CanvasDrawScope$draw$1$iv$iv":I
    move-object/from16 v46, v3

    .end local v3    # "pathBounds":Landroidx/compose/ui/geometry/Rect;
    .local v46, "pathBounds":Landroidx/compose/ui/geometry/Rect;
    move-object/from16 v3, v29

    check-cast v3, Landroidx/compose/ui/unit/Density;

    invoke-virtual {v0, v3}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->setDensity(Landroidx/compose/ui/unit/Density;)V

    .line 517
    invoke-virtual {v0, v9}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 518
    invoke-virtual {v0, v13}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->setCanvas(Landroidx/compose/ui/graphics/Canvas;)V

    .line 519
    invoke-virtual {v0, v7, v8}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->setSize-uvyYCjk(J)V

    .line 520
    nop

    .line 515
    .end local v0    # "$this$draw_yzxVdVo_u24lambda_u240$iv$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
    .end local v32    # "$i$a$-apply-CanvasDrawScope$draw$1$iv$iv":I
    nop

    .line 521
    invoke-interface {v13}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 522
    move-object/from16 v32, v16

    check-cast v32, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .local v32, "$this$drawBorderCache_EMwLDEs_u24lambda_u243$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/16 v47, 0x0

    .line 523
    .local v47, "$i$a$-draw-yzxVdVo-BorderCache$drawBorderCache$3$iv":I
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v33

    sget-object v0, Landroidx/compose/ui/graphics/BlendMode;->Companion:Landroidx/compose/ui/graphics/BlendMode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/BlendMode$Companion;->getClear-0nO6VwU()I

    move-result v42

    const/16 v43, 0x3a

    const/16 v44, 0x0

    const-wide/16 v35, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move-wide/from16 v37, v7

    .end local v7    # "drawSize$iv":J
    .local v37, "drawSize$iv":J
    invoke-static/range {v32 .. v44}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRect-n-J9OG0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 524
    move-object/from16 v33, v32

    .local v33, "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/16 v34, 0x0

    .line 250
    .local v34, "$i$a$-drawBorderCache-EMwLDEs-BorderModifierNode$drawGenericBorder$2$1":I
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v0

    neg-float v3, v0

    .local v3, "left$iv":F
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v0

    neg-float v7, v0

    .local v7, "top$iv":F
    move-object/from16 v35, v33

    .local v35, "$this$translate$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/16 v36, 0x0

    .line 525
    .local v36, "$i$f$translate":I
    invoke-interface/range {v35 .. v35}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v0

    invoke-interface {v0, v3, v7}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .line 526
    nop

    .line 527
    move v8, v3

    .end local v3    # "left$iv":F
    .local v8, "left$iv":F
    move-object/from16 v3, v35

    .local v3, "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/16 v39, 0x0

    .line 254
    .local v39, "$i$a$-translate-BorderModifierNode$drawGenericBorder$2$1$1":I
    nop

    .line 255
    move-object/from16 v40, v4

    .end local v4    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v40, "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    :try_start_0
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Outline$Generic;->getPath()Landroidx/compose/ui/graphics/Path;

    move-result-object v4

    .line 256
    nop

    .line 254
    nop

    .line 257
    new-instance v48, Landroidx/compose/ui/graphics/drawscope/Stroke;

    const/high16 v0, 0x40000000    # 2.0f

    mul-float v49, p5, v0

    const/16 v54, 0x1e

    const/16 v55, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    invoke-direct/range {v48 .. v55}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v48, Landroidx/compose/ui/graphics/drawscope/DrawStyle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 254
    move-wide/from16 v41, v10

    .end local v10    # "prevSize$iv$iv":J
    .local v41, "prevSize$iv$iv":J
    const/16 v10, 0x34

    const/4 v11, 0x0

    move-object/from16 v43, v6

    .end local v6    # "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v43, "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    const/4 v6, 0x0

    move/from16 v44, v8

    .end local v8    # "left$iv":F
    .local v44, "left$iv":F
    const/4 v8, 0x0

    move-object/from16 v49, v9

    .end local v9    # "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .local v49, "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    const/4 v9, 0x0

    move-object/from16 v12, v19

    move-object/from16 v19, v13

    move-object v13, v12

    move/from16 v12, v44

    move-wide/from16 v57, v41

    move-object/from16 v42, v1

    move v1, v7

    move/from16 v41, v15

    move-object/from16 v15, v43

    move-object/from16 v7, v48

    move-object/from16 v43, v40

    move-object/from16 v40, v14

    move-object/from16 v14, v45

    move-wide/from16 v44, v57

    .end local v7    # "top$iv":F
    .end local v45    # "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .local v1, "top$iv":F
    .local v12, "left$iv":F
    .local v13, "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    .local v14, "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .local v15, "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v19, "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v40, "targetDrawScope$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .local v41, "config":I
    .local v42, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v43, "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v44, "prevSize$iv$iv":J
    :try_start_1
    invoke-static/range {v3 .. v11}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-GBMwjPU$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    move-object v2, v3

    .line 262
    .end local v3    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .local v2, "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v3

    .local v3, "arg0$iv":J
    const/4 v0, 0x0

    .line 528
    .local v0, "$i$f$getWidth-impl":I
    move-wide v5, v3

    .local v5, "value$iv$iv":J
    const/4 v7, 0x0

    .line 529
    .local v7, "$i$f$unpackFloat1":I
    shr-long v8, v5, v22

    long-to-int v8, v8

    .local v8, "bits$iv$iv$iv":I
    const/4 v9, 0x0

    .line 530
    .local v9, "$i$f$floatFromBits":I
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    .line 529
    .end local v8    # "bits$iv$iv$iv":I
    .end local v9    # "$i$f$floatFromBits":I
    nop

    .line 528
    .end local v5    # "value$iv$iv":J
    .end local v7    # "$i$f$unpackFloat1":I
    nop

    .line 262
    .end local v0    # "$i$f$getWidth-impl":I
    .end local v3    # "arg0$iv":J
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v10, v0

    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .restart local v3    # "arg0$iv":J
    const/4 v5, 0x0

    .line 528
    .local v5, "$i$f$getWidth-impl":I
    move-wide v6, v3

    .local v6, "value$iv$iv":J
    const/4 v8, 0x0

    .line 529
    .local v8, "$i$f$unpackFloat1":I
    move v9, v0

    move/from16 v48, v1

    .end local v1    # "top$iv":F
    .local v48, "top$iv":F
    shr-long v0, v6, v22

    long-to-int v0, v0

    .local v0, "bits$iv$iv$iv":I
    const/4 v1, 0x0

    .line 530
    .local v1, "$i$f$floatFromBits":I
    :try_start_2
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    .line 529
    .end local v0    # "bits$iv$iv$iv":I
    .end local v1    # "$i$f$floatFromBits":I
    nop

    .line 528
    .end local v6    # "value$iv$iv":J
    .end local v8    # "$i$f$unpackFloat1":I
    nop

    .line 262
    .end local v3    # "arg0$iv":J
    .end local v5    # "$i$f$getWidth-impl":I
    div-float/2addr v10, v11

    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v0

    .local v0, "arg0$iv":J
    const/4 v3, 0x0

    .line 531
    .local v3, "$i$f$getHeight-impl":I
    move-wide v4, v0

    .local v4, "value$iv$iv":J
    const/4 v6, 0x0

    .line 532
    .local v6, "$i$f$unpackFloat2":I
    and-long v7, v4, v23

    long-to-int v7, v7

    .local v7, "bits$iv$iv$iv":I
    const/4 v8, 0x0

    .line 530
    .local v8, "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    .line 532
    .end local v7    # "bits$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 531
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackFloat2":I
    nop

    .line 262
    .end local v0    # "arg0$iv":J
    .end local v3    # "$i$f$getHeight-impl":I
    add-float/2addr v11, v9

    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v0

    .restart local v0    # "arg0$iv":J
    const/4 v3, 0x0

    .line 531
    .restart local v3    # "$i$f$getHeight-impl":I
    move-wide v4, v0

    .restart local v4    # "value$iv$iv":J
    const/4 v6, 0x0

    .line 532
    .restart local v6    # "$i$f$unpackFloat2":I
    and-long v7, v4, v23

    long-to-int v7, v7

    .restart local v7    # "bits$iv$iv$iv":I
    const/4 v8, 0x0

    .line 530
    .restart local v8    # "$i$f$floatFromBits":I
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    .line 532
    .end local v7    # "bits$iv$iv$iv":I
    .end local v8    # "$i$f$floatFromBits":I
    nop

    .line 531
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackFloat2":I
    nop

    .line 262
    .end local v0    # "arg0$iv":J
    .end local v3    # "$i$f$getHeight-impl":I
    div-float/2addr v11, v9

    .local v11, "scaleY$iv":F
    move-object v1, v2

    .local v1, "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    move v3, v11

    .end local v11    # "scaleY$iv":F
    .local v3, "scaleY$iv":F
    move v4, v10

    .line 533
    .local v4, "scaleX$iv":F
    nop

    .line 536
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getCenter-F1C5BW0()J

    move-result-wide v5

    .line 533
    .local v5, "pivot$iv":J
    const/16 v22, 0x0

    .line 538
    .local v22, "$i$f$scale-Fgt4K4Q":I
    move-object/from16 v23, v1

    .local v23, "$this$withTransform$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/16 v24, 0x0

    .line 539
    .local v24, "$i$f$withTransform":I
    invoke-interface/range {v23 .. v23}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    move-object v7, v0

    .local v7, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    const/16 v50, 0x0

    .line 543
    .local v50, "$i$a$-with-DrawScopeKt$withTransform$1$iv$iv":I
    invoke-interface {v7}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    move-result-wide v8

    .line 544
    .local v8, "previousSize$iv$iv":J
    invoke-interface {v7}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->save()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 545
    nop

    .line 546
    :try_start_3
    invoke-interface {v7}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v0

    .local v0, "$this$scale_Fgt4K4Q_u24lambda_u242$iv":Landroidx/compose/ui/graphics/drawscope/DrawTransform;
    const/4 v10, 0x0

    .line 538
    .local v10, "$i$a$-withTransform-DrawScopeKt$scale$1$iv":I
    invoke-interface {v0, v4, v3, v5, v6}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->scale-0AR0LA0(FFJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 546
    .end local v0    # "$this$scale_Fgt4K4Q_u24lambda_u242$iv":Landroidx/compose/ui/graphics/drawscope/DrawTransform;
    .end local v10    # "$i$a$-withTransform-DrawScopeKt$scale$1$iv":I
    nop

    .line 547
    move v11, v3

    .end local v3    # "scaleY$iv":F
    .restart local v11    # "scaleY$iv":F
    move-object/from16 v3, v23

    .local v3, "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242_u24lambda_u241":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/4 v0, 0x0

    .line 264
    .local v0, "$i$a$-scale-Fgt4K4Q$default-BorderModifierNode$drawGenericBorder$2$1$1$1":I
    nop

    .line 265
    nop

    .line 266
    nop

    .line 264
    nop

    .line 267
    :try_start_4
    sget-object v10, Landroidx/compose/ui/graphics/BlendMode;->Companion:Landroidx/compose/ui/graphics/BlendMode$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/BlendMode$Companion;->getClear-0nO6VwU()I

    move-result v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 264
    move-wide/from16 v51, v8

    move v9, v10

    .end local v8    # "previousSize$iv$iv":J
    .local v51, "previousSize$iv$iv":J
    const/16 v10, 0x1c

    move v8, v11

    .end local v11    # "scaleY$iv":F
    .local v8, "scaleY$iv":F
    const/4 v11, 0x0

    move-wide/from16 v53, v5

    .end local v5    # "pivot$iv":J
    .local v53, "pivot$iv":J
    const/4 v6, 0x0

    move-object v5, v7

    .end local v7    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .local v5, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    const/4 v7, 0x0

    move/from16 v55, v8

    .end local v8    # "scaleY$iv":F
    .local v55, "scaleY$iv":F
    const/4 v8, 0x0

    move-object/from16 v56, v21

    move/from16 v21, v4

    move-object/from16 v4, v56

    move-object/from16 v56, v1

    move-object/from16 v57, v5

    move-object/from16 v5, p2

    move-wide/from16 v58, v51

    move-object/from16 v52, v2

    move-object/from16 v51, v57

    move-wide/from16 v1, v58

    .end local v2    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v5    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .local v1, "previousSize$iv$iv":J
    .local v4, "maskPath":Landroidx/compose/ui/graphics/Path;
    .local v21, "scaleX$iv":F
    .local v51, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .local v52, "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .local v56, "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    :try_start_5
    invoke-static/range {v3 .. v11}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-GBMwjPU$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-object v9, v4

    .line 269
    .end local v4    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .local v9, "maskPath":Landroidx/compose/ui/graphics/Path;
    nop

    .line 547
    .end local v0    # "$i$a$-scale-Fgt4K4Q$default-BorderModifierNode$drawGenericBorder$2$1$1$1":I
    .end local v3    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242_u24lambda_u241":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    nop

    .line 549
    :try_start_6
    invoke-interface/range {v51 .. v51}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 550
    move-object/from16 v5, v51

    .end local v51    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v5    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    invoke-interface {v5, v1, v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 551
    nop

    .line 552
    nop

    .line 539
    .end local v1    # "previousSize$iv$iv":J
    .end local v5    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v50    # "$i$a$-with-DrawScopeKt$withTransform$1$iv$iv":I
    nop

    .line 552
    nop

    .line 538
    .end local v23    # "$this$withTransform$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v24    # "$i$f$withTransform":I
    nop

    .line 270
    .end local v21    # "scaleX$iv":F
    .end local v22    # "$i$f$scale-Fgt4K4Q":I
    .end local v53    # "pivot$iv":J
    .end local v55    # "scaleY$iv":F
    .end local v56    # "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    nop

    .line 527
    .end local v39    # "$i$a$-translate-BorderModifierNode$drawGenericBorder$2$1$1":I
    .end local v52    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    nop

    .line 553
    invoke-interface/range {v35 .. v35}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v0

    neg-float v1, v12

    move/from16 v3, v48

    .end local v48    # "top$iv":F
    .local v3, "top$iv":F
    neg-float v2, v3

    invoke-interface {v0, v1, v2}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    .line 554
    nop

    .line 555
    nop

    .line 271
    .end local v3    # "top$iv":F
    .end local v12    # "left$iv":F
    .end local v35    # "$this$translate$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v36    # "$i$f$translate":I
    nop

    .line 524
    .end local v33    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v34    # "$i$a$-drawBorderCache-EMwLDEs-BorderModifierNode$drawGenericBorder$2$1":I
    nop

    .line 556
    nop

    .line 522
    .end local v32    # "$this$drawBorderCache_EMwLDEs_u24lambda_u243$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v47    # "$i$a$-draw-yzxVdVo-BorderCache$drawBorderCache$3$iv":I
    nop

    .line 557
    invoke-interface/range {v19 .. v19}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 558
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;->getDrawParams()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;

    move-result-object v0

    .local v0, "$this$draw_yzxVdVo_u24lambda_u241$iv$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
    const/4 v1, 0x0

    .line 559
    .local v1, "$i$a$-apply-CanvasDrawScope$draw$2$iv$iv":I
    invoke-virtual {v0, v13}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->setDensity(Landroidx/compose/ui/unit/Density;)V

    .line 560
    invoke-virtual {v0, v14}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 561
    invoke-virtual {v0, v15}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->setCanvas(Landroidx/compose/ui/graphics/Canvas;)V

    .line 562
    move-wide/from16 v6, v44

    .end local v44    # "prevSize$iv$iv":J
    .local v6, "prevSize$iv$iv":J
    invoke-virtual {v0, v6, v7}, Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;->setSize-uvyYCjk(J)V

    .line 563
    nop

    .line 558
    .end local v0    # "$this$draw_yzxVdVo_u24lambda_u241$iv$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;
    .end local v1    # "$i$a$-apply-CanvasDrawScope$draw$2$iv$iv":I
    nop

    .line 564
    nop

    .line 565
    .end local v6    # "prevSize$iv$iv":J
    .end local v13    # "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    .end local v14    # "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v15    # "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v16    # "this_$iv$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .end local v17    # "$i$f$draw-yzxVdVo":I
    .end local v49    # "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    invoke-interface/range {v42 .. v42}, Landroidx/compose/ui/graphics/ImageBitmap;->prepareToDraw()V

    .line 566
    nop

    .line 246
    .end local v18    # "this_$iv":Landroidx/compose/foundation/BorderCache;
    .end local v19    # "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v29    # "$this$drawBorderCache_u2dEMwLDEs$iv":Landroidx/compose/ui/draw/CacheDrawScope;
    .end local v30    # "$i$f$drawBorderCache-EMwLDEs":I
    .end local v31    # "compatibleConfig$iv":Z
    .end local v37    # "drawSize$iv":J
    .end local v40    # "targetDrawScope$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .end local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    move-object/from16 v4, v42

    move-object/from16 v5, v43

    .end local v43    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v4, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v5, "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    iput-object v4, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 272
    .end local v4    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    nop

    .line 241
    .end local v27    # "$this$drawGenericBorder_u24lambda_u244":Landroidx/compose/foundation/BorderCache;
    .end local v28    # "$i$a$-with-BorderModifierNode$drawGenericBorder$2":I
    nop

    .line 274
    new-instance v3, Landroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3;

    move-object/from16 v8, v20

    move-wide/from16 v6, v25

    move-object/from16 v4, v46

    .end local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v25    # "pathBoundsSize":J
    .end local v46    # "pathBounds":Landroidx/compose/ui/geometry/Rect;
    .local v4, "pathBounds":Landroidx/compose/ui/geometry/Rect;
    .local v6, "pathBoundsSize":J
    .local v8, "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    invoke-direct/range {v3 .. v8}, Landroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3;-><init>(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/internal/Ref$ObjectRef;JLandroidx/compose/ui/graphics/ColorFilter;)V

    move-wide v10, v6

    .end local v4    # "pathBounds":Landroidx/compose/ui/geometry/Rect;
    .end local v5    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v6    # "pathBoundsSize":J
    .local v10, "pathBoundsSize":J
    .restart local v43    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v46    # "pathBounds":Landroidx/compose/ui/geometry/Rect;
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p1

    invoke-virtual {v1, v3}, Landroidx/compose/ui/draw/CacheDrawScope;->onDrawWithContent(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v0

    .line 280
    .end local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v10    # "pathBoundsSize":J
    .end local v41    # "config":I
    .end local v43    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v46    # "pathBounds":Landroidx/compose/ui/geometry/Rect;
    :goto_5
    return-object v0

    .line 553
    .restart local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v12    # "left$iv":F
    .restart local v13    # "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    .restart local v14    # "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local v15    # "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    .restart local v16    # "this_$iv$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .restart local v17    # "$i$f$draw-yzxVdVo":I
    .restart local v18    # "this_$iv":Landroidx/compose/foundation/BorderCache;
    .restart local v19    # "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .restart local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v25    # "pathBoundsSize":J
    .restart local v27    # "$this$drawGenericBorder_u24lambda_u244":Landroidx/compose/foundation/BorderCache;
    .restart local v28    # "$i$a$-with-BorderModifierNode$drawGenericBorder$2":I
    .restart local v29    # "$this$drawBorderCache_u2dEMwLDEs$iv":Landroidx/compose/ui/draw/CacheDrawScope;
    .restart local v30    # "$i$f$drawBorderCache-EMwLDEs":I
    .restart local v31    # "compatibleConfig$iv":Z
    .restart local v32    # "$this$drawBorderCache_EMwLDEs_u24lambda_u243$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v33    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v34    # "$i$a$-drawBorderCache-EMwLDEs-BorderModifierNode$drawGenericBorder$2$1":I
    .restart local v35    # "$this$translate$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v36    # "$i$f$translate":I
    .restart local v37    # "drawSize$iv":J
    .restart local v40    # "targetDrawScope$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .restart local v41    # "config":I
    .restart local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v43    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v44    # "prevSize$iv$iv":J
    .restart local v46    # "pathBounds":Landroidx/compose/ui/geometry/Rect;
    .restart local v47    # "$i$a$-draw-yzxVdVo-BorderCache$drawBorderCache$3$iv":I
    .restart local v48    # "top$iv":F
    .restart local v49    # "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    :catchall_0
    move-exception v0

    move-object/from16 v1, p1

    move-object/from16 v8, v20

    move-wide/from16 v10, v25

    move-object/from16 v4, v42

    move-wide/from16 v6, v44

    move/from16 v3, v48

    .end local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v25    # "pathBoundsSize":J
    .end local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v44    # "prevSize$iv$iv":J
    .end local v48    # "top$iv":F
    .restart local v3    # "top$iv":F
    .local v4, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v6, "prevSize$iv$iv":J
    .restart local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v10    # "pathBoundsSize":J
    goto/16 :goto_7

    .line 549
    .end local v3    # "top$iv":F
    .end local v6    # "prevSize$iv$iv":J
    .end local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v10    # "pathBoundsSize":J
    .local v1, "previousSize$iv$iv":J
    .local v4, "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v21    # "scaleX$iv":F
    .restart local v22    # "$i$f$scale-Fgt4K4Q":I
    .restart local v23    # "$this$withTransform$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v24    # "$i$f$withTransform":I
    .restart local v25    # "pathBoundsSize":J
    .restart local v39    # "$i$a$-translate-BorderModifierNode$drawGenericBorder$2$1$1":I
    .restart local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v44    # "prevSize$iv$iv":J
    .restart local v48    # "top$iv":F
    .restart local v50    # "$i$a$-with-DrawScopeKt$withTransform$1$iv$iv":I
    .restart local v51    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v52    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v53    # "pivot$iv":J
    .restart local v55    # "scaleY$iv":F
    .restart local v56    # "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    :catchall_1
    move-exception v0

    move-object v9, v4

    move-object/from16 v8, v20

    move-wide/from16 v10, v25

    move-object/from16 v4, v42

    move-wide/from16 v6, v44

    move/from16 v3, v48

    move-object/from16 v5, v51

    .end local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v25    # "pathBoundsSize":J
    .end local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v44    # "prevSize$iv$iv":J
    .end local v48    # "top$iv":F
    .end local v51    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v3    # "top$iv":F
    .local v4, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v5, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v6    # "prevSize$iv$iv":J
    .restart local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v10    # "pathBoundsSize":J
    goto :goto_6

    .end local v3    # "top$iv":F
    .end local v6    # "prevSize$iv$iv":J
    .end local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v10    # "pathBoundsSize":J
    .end local v52    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v53    # "pivot$iv":J
    .end local v55    # "scaleY$iv":F
    .end local v56    # "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .local v1, "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v2    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .local v4, "scaleX$iv":F
    .local v5, "pivot$iv":J
    .restart local v7    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .local v8, "previousSize$iv$iv":J
    .restart local v11    # "scaleY$iv":F
    .restart local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .local v21, "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v25    # "pathBoundsSize":J
    .restart local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v44    # "prevSize$iv$iv":J
    .restart local v48    # "top$iv":F
    :catchall_2
    move-exception v0

    move-object/from16 v56, v1

    move-object/from16 v52, v2

    move-wide/from16 v53, v5

    move-object v5, v7

    move-wide v1, v8

    move/from16 v55, v11

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move-wide/from16 v10, v25

    move-wide/from16 v6, v44

    move/from16 v3, v48

    move/from16 v21, v4

    move-object/from16 v4, v42

    .end local v2    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v7    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v11    # "scaleY$iv":F
    .end local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v25    # "pathBoundsSize":J
    .end local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v44    # "prevSize$iv$iv":J
    .end local v48    # "top$iv":F
    .local v1, "previousSize$iv$iv":J
    .restart local v3    # "top$iv":F
    .local v4, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v5, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v6    # "prevSize$iv$iv":J
    .local v8, "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v10    # "pathBoundsSize":J
    .local v21, "scaleX$iv":F
    .restart local v52    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v53    # "pivot$iv":J
    .restart local v55    # "scaleY$iv":F
    .restart local v56    # "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    goto :goto_6

    .end local v6    # "prevSize$iv$iv":J
    .end local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v10    # "pathBoundsSize":J
    .end local v52    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v53    # "pivot$iv":J
    .end local v55    # "scaleY$iv":F
    .end local v56    # "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .local v1, "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v2    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .local v3, "scaleY$iv":F
    .local v4, "scaleX$iv":F
    .local v5, "pivot$iv":J
    .restart local v7    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .local v8, "previousSize$iv$iv":J
    .restart local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .local v21, "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v25    # "pathBoundsSize":J
    .restart local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v44    # "prevSize$iv$iv":J
    .restart local v48    # "top$iv":F
    :catchall_3
    move-exception v0

    move-object/from16 v56, v1

    move-object/from16 v52, v2

    move/from16 v55, v3

    move-wide/from16 v53, v5

    move-object v5, v7

    move-wide v1, v8

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move-wide/from16 v10, v25

    move-wide/from16 v6, v44

    move/from16 v3, v48

    move/from16 v21, v4

    move-object/from16 v4, v42

    .end local v2    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v7    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v25    # "pathBoundsSize":J
    .end local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v44    # "prevSize$iv$iv":J
    .end local v48    # "top$iv":F
    .local v1, "previousSize$iv$iv":J
    .local v3, "top$iv":F
    .local v4, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v5, "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .restart local v6    # "prevSize$iv$iv":J
    .local v8, "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v10    # "pathBoundsSize":J
    .local v21, "scaleX$iv":F
    .restart local v52    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v53    # "pivot$iv":J
    .restart local v55    # "scaleY$iv":F
    .restart local v56    # "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    :goto_6
    :try_start_7
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 550
    invoke-interface {v5, v1, v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .end local v3    # "top$iv":F
    .end local v4    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v6    # "prevSize$iv$iv":J
    .end local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v10    # "pathBoundsSize":J
    .end local v12    # "left$iv":F
    .end local v13    # "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    .end local v14    # "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local v15    # "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v16    # "this_$iv$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .end local v17    # "$i$f$draw-yzxVdVo":I
    .end local v18    # "this_$iv":Landroidx/compose/foundation/BorderCache;
    .end local v19    # "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .end local v27    # "$this$drawGenericBorder_u24lambda_u244":Landroidx/compose/foundation/BorderCache;
    .end local v28    # "$i$a$-with-BorderModifierNode$drawGenericBorder$2":I
    .end local v29    # "$this$drawBorderCache_u2dEMwLDEs$iv":Landroidx/compose/ui/draw/CacheDrawScope;
    .end local v30    # "$i$f$drawBorderCache-EMwLDEs":I
    .end local v31    # "compatibleConfig$iv":Z
    .end local v32    # "$this$drawBorderCache_EMwLDEs_u24lambda_u243$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v33    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v34    # "$i$a$-drawBorderCache-EMwLDEs-BorderModifierNode$drawGenericBorder$2$1":I
    .end local v35    # "$this$translate$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v36    # "$i$f$translate":I
    .end local v37    # "drawSize$iv":J
    .end local v40    # "targetDrawScope$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .end local v41    # "config":I
    .end local v43    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v46    # "pathBounds":Landroidx/compose/ui/geometry/Rect;
    .end local v47    # "$i$a$-draw-yzxVdVo-BorderCache$drawBorderCache$3$iv":I
    .end local v49    # "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .end local p1    # "$this$drawGenericBorder":Landroidx/compose/ui/draw/CacheDrawScope;
    .end local p2    # "brush":Landroidx/compose/ui/graphics/Brush;
    .end local p3    # "outline":Landroidx/compose/ui/graphics/Outline$Generic;
    .end local p4    # "fillArea":Z
    .end local p5    # "strokeWidth":F
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 553
    .end local v1    # "previousSize$iv$iv":J
    .end local v5    # "$this$withTransform_u24lambda_u246$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawContext;
    .end local v21    # "scaleX$iv":F
    .end local v22    # "$i$f$scale-Fgt4K4Q":I
    .end local v23    # "$this$withTransform$iv$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v24    # "$i$f$withTransform":I
    .end local v39    # "$i$a$-translate-BorderModifierNode$drawGenericBorder$2$1$1":I
    .end local v50    # "$i$a$-with-DrawScopeKt$withTransform$1$iv$iv":I
    .end local v52    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243_u24lambda_u242":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v53    # "pivot$iv":J
    .end local v55    # "scaleY$iv":F
    .end local v56    # "$this$scale_u2dFgt4K4Q_u24default$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v3    # "top$iv":F
    .restart local v4    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v6    # "prevSize$iv$iv":J
    .restart local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v10    # "pathBoundsSize":J
    .restart local v12    # "left$iv":F
    .restart local v13    # "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    .restart local v14    # "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local v15    # "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    .restart local v16    # "this_$iv$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .restart local v17    # "$i$f$draw-yzxVdVo":I
    .restart local v18    # "this_$iv":Landroidx/compose/foundation/BorderCache;
    .restart local v19    # "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .restart local v27    # "$this$drawGenericBorder_u24lambda_u244":Landroidx/compose/foundation/BorderCache;
    .restart local v28    # "$i$a$-with-BorderModifierNode$drawGenericBorder$2":I
    .restart local v29    # "$this$drawBorderCache_u2dEMwLDEs$iv":Landroidx/compose/ui/draw/CacheDrawScope;
    .restart local v30    # "$i$f$drawBorderCache-EMwLDEs":I
    .restart local v31    # "compatibleConfig$iv":Z
    .restart local v32    # "$this$drawBorderCache_EMwLDEs_u24lambda_u243$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v33    # "$this$drawGenericBorder_u24lambda_u244_u24lambda_u243":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v34    # "$i$a$-drawBorderCache-EMwLDEs-BorderModifierNode$drawGenericBorder$2$1":I
    .restart local v35    # "$this$translate$iv":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v36    # "$i$f$translate":I
    .restart local v37    # "drawSize$iv":J
    .restart local v40    # "targetDrawScope$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .restart local v41    # "config":I
    .restart local v43    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v46    # "pathBounds":Landroidx/compose/ui/geometry/Rect;
    .restart local v47    # "$i$a$-draw-yzxVdVo-BorderCache$drawBorderCache$3$iv":I
    .restart local v49    # "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local p1    # "$this$drawGenericBorder":Landroidx/compose/ui/draw/CacheDrawScope;
    .restart local p2    # "brush":Landroidx/compose/ui/graphics/Brush;
    .restart local p3    # "outline":Landroidx/compose/ui/graphics/Outline$Generic;
    .restart local p4    # "fillArea":Z
    .restart local p5    # "strokeWidth":F
    :catchall_4
    move-exception v0

    goto :goto_7

    .end local v3    # "top$iv":F
    .end local v4    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v6    # "prevSize$iv$iv":J
    .end local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v10    # "pathBoundsSize":J
    .restart local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .local v21, "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v25    # "pathBoundsSize":J
    .restart local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v44    # "prevSize$iv$iv":J
    .restart local v48    # "top$iv":F
    :catchall_5
    move-exception v0

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move-wide/from16 v10, v25

    move-object/from16 v4, v42

    move-wide/from16 v6, v44

    move/from16 v3, v48

    .end local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v21    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v25    # "pathBoundsSize":J
    .end local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v44    # "prevSize$iv$iv":J
    .end local v48    # "top$iv":F
    .restart local v3    # "top$iv":F
    .restart local v4    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v6    # "prevSize$iv$iv":J
    .restart local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v10    # "pathBoundsSize":J
    goto :goto_7

    .end local v3    # "top$iv":F
    .end local v4    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v6    # "prevSize$iv$iv":J
    .end local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v10    # "pathBoundsSize":J
    .local v1, "top$iv":F
    .restart local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v21    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v25    # "pathBoundsSize":J
    .restart local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v44    # "prevSize$iv$iv":J
    :catchall_6
    move-exception v0

    move v3, v1

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move-wide/from16 v10, v25

    move-object/from16 v4, v42

    move-wide/from16 v6, v44

    .end local v1    # "top$iv":F
    .end local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v21    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v25    # "pathBoundsSize":J
    .end local v42    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v44    # "prevSize$iv$iv":J
    .restart local v3    # "top$iv":F
    .restart local v4    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .restart local v6    # "prevSize$iv$iv":J
    .restart local v8    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v9    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v10    # "pathBoundsSize":J
    goto :goto_7

    .end local v3    # "top$iv":F
    .end local v4    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v12    # "left$iv":F
    .end local v41    # "config":I
    .end local v43    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v49    # "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .local v1, "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v6, "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v7, "top$iv":F
    .local v8, "left$iv":F
    .local v9, "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .local v10, "prevSize$iv$iv":J
    .local v13, "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v14, "targetDrawScope$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .local v15, "config":I
    .local v19, "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    .restart local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .restart local v21    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .restart local v25    # "pathBoundsSize":J
    .local v40, "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v45    # "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    :catchall_7
    move-exception v0

    move-object/from16 v3, v19

    move-object/from16 v19, v13

    move-object v13, v3

    move-object v4, v1

    move v3, v7

    move v12, v8

    move-object/from16 v49, v9

    move/from16 v41, v15

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move-object/from16 v43, v40

    move-object v15, v6

    move-wide v6, v10

    move-object/from16 v40, v14

    move-wide/from16 v10, v25

    move-object/from16 v14, v45

    .end local v1    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .end local v7    # "top$iv":F
    .end local v20    # "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .end local v21    # "maskPath":Landroidx/compose/ui/graphics/Path;
    .end local v25    # "pathBoundsSize":J
    .end local v45    # "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .restart local v3    # "top$iv":F
    .restart local v4    # "targetImageBitmap$iv":Landroidx/compose/ui/graphics/ImageBitmap;
    .local v6, "prevSize$iv$iv":J
    .local v8, "colorFilter":Landroidx/compose/ui/graphics/ColorFilter;
    .local v9, "maskPath":Landroidx/compose/ui/graphics/Path;
    .local v10, "pathBoundsSize":J
    .restart local v12    # "left$iv":F
    .local v13, "prevDensity$iv$iv":Landroidx/compose/ui/unit/Density;
    .local v14, "prevLayoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    .local v15, "prevCanvas$iv$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v19, "targetCanvas$iv":Landroidx/compose/ui/graphics/Canvas;
    .local v40, "targetDrawScope$iv":Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;
    .restart local v41    # "config":I
    .restart local v43    # "cacheImageBitmap":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v49    # "layoutDirection$iv$iv":Landroidx/compose/ui/unit/LayoutDirection;
    :goto_7
    invoke-interface/range {v35 .. v35}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    move-result-object v1

    neg-float v2, v12

    neg-float v5, v3

    invoke-interface {v1, v2, v5}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V

    throw v0
.end method

.method private final drawRoundRectBorder-JqoCqck(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;
    .locals 16
    .param p1, "$this$drawRoundRectBorder_u2dJqoCqck"    # Landroidx/compose/ui/draw/CacheDrawScope;
    .param p2, "brush"    # Landroidx/compose/ui/graphics/Brush;
    .param p3, "outline"    # Landroidx/compose/ui/graphics/Outline$Rounded;
    .param p4, "topLeft"    # J
    .param p6, "borderSize"    # J
    .param p8, "fillArea"    # Z
    .param p9, "strokeWidth"    # F

    .line 291
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/ui/geometry/RoundRectKt;->isSimple(Landroidx/compose/ui/geometry/RoundRect;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 292
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/RoundRect;->getTopLeftCornerRadius-kKHJgLs()J

    move-result-wide v10

    .line 293
    .local v10, "cornerRadius":J
    const/high16 v2, 0x40000000    # 2.0f

    div-float v12, p9, v2

    .line 294
    .local v12, "halfStroke":F
    new-instance v13, Landroidx/compose/ui/graphics/drawscope/Stroke;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 v3, p9

    move-object v2, v13

    invoke-direct/range {v2 .. v9}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 295
    .local v13, "borderStroke":Landroidx/compose/ui/graphics/drawscope/Stroke;
    new-instance v2, Landroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1;

    move-object/from16 v4, p2

    move/from16 v3, p8

    move/from16 v8, p9

    move-wide v5, v10

    move v7, v12

    move-wide/from16 v9, p4

    move-wide/from16 v11, p6

    .end local v10    # "cornerRadius":J
    .end local v12    # "halfStroke":F
    .local v5, "cornerRadius":J
    .local v7, "halfStroke":F
    invoke-direct/range {v2 .. v13}, Landroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1;-><init>(ZLandroidx/compose/ui/graphics/Brush;JFFJJLandroidx/compose/ui/graphics/drawscope/Stroke;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2}, Landroidx/compose/ui/draw/CacheDrawScope;->onDrawWithContent(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v2

    move-object/from16 v6, p2

    move/from16 v4, p8

    .end local v5    # "cornerRadius":J
    .end local v7    # "halfStroke":F
    .end local v13    # "borderStroke":Landroidx/compose/ui/graphics/drawscope/Stroke;
    goto :goto_0

    .line 335
    :cond_0
    move/from16 v8, p9

    iget-object v2, v0, Landroidx/compose/foundation/BorderModifierNode;->borderCache:Landroidx/compose/foundation/BorderCache;

    if-nez v2, :cond_1

    .line 336
    new-instance v9, Landroidx/compose/foundation/BorderCache;

    const/16 v14, 0xf

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Landroidx/compose/foundation/BorderCache;-><init>(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Landroidx/compose/foundation/BorderModifierNode;->borderCache:Landroidx/compose/foundation/BorderCache;

    .line 338
    :cond_1
    iget-object v2, v0, Landroidx/compose/foundation/BorderModifierNode;->borderCache:Landroidx/compose/foundation/BorderCache;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroidx/compose/foundation/BorderCache;->obtainPath()Landroidx/compose/ui/graphics/Path;

    move-result-object v2

    .line 340
    .local v2, "path":Landroidx/compose/ui/graphics/Path;
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    move-result-object v3

    move/from16 v4, p8

    invoke-static {v2, v3, v8, v4}, Landroidx/compose/foundation/BorderKt;->access$createRoundRectPath(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/RoundRect;FZ)Landroidx/compose/ui/graphics/Path;

    move-result-object v3

    .line 339
    nop

    .line 341
    .local v3, "roundedRectPath":Landroidx/compose/ui/graphics/Path;
    new-instance v5, Landroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$2;

    move-object/from16 v6, p2

    invoke-direct {v5, v3, v6}, Landroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$2;-><init>(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;)V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v5}, Landroidx/compose/ui/draw/CacheDrawScope;->onDrawWithContent(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v5

    move-object v2, v5

    .line 291
    .end local v2    # "path":Landroidx/compose/ui/graphics/Path;
    .end local v3    # "roundedRectPath":Landroidx/compose/ui/graphics/Path;
    :goto_0
    return-object v2
.end method


# virtual methods
.method public final getBrush()Landroidx/compose/ui/graphics/Brush;
    .locals 1

    .line 140
    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNode;->brush:Landroidx/compose/ui/graphics/Brush;

    return-object v0
.end method

.method public final getShape()Landroidx/compose/ui/graphics/Shape;
    .locals 1

    .line 148
    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNode;->shape:Landroidx/compose/ui/graphics/Shape;

    return-object v0
.end method

.method public final getWidth-D9Ej5fM()F
    .locals 1

    .line 132
    iget v0, p0, Landroidx/compose/foundation/BorderModifierNode;->width:F

    return v0
.end method

.method public final setBrush(Landroidx/compose/ui/graphics/Brush;)V
    .locals 1
    .param p1, "value"    # Landroidx/compose/ui/graphics/Brush;

    .line 142
    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNode;->brush:Landroidx/compose/ui/graphics/Brush;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    iput-object p1, p0, Landroidx/compose/foundation/BorderModifierNode;->brush:Landroidx/compose/ui/graphics/Brush;

    .line 144
    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNode;->drawWithCacheModifierNode:Landroidx/compose/ui/draw/CacheDrawModifierNode;

    invoke-interface {v0}, Landroidx/compose/ui/draw/CacheDrawModifierNode;->invalidateDrawCache()V

    .line 146
    :cond_0
    return-void
.end method

.method public final setShape(Landroidx/compose/ui/graphics/Shape;)V
    .locals 1
    .param p1, "value"    # Landroidx/compose/ui/graphics/Shape;

    .line 150
    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNode;->shape:Landroidx/compose/ui/graphics/Shape;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    iput-object p1, p0, Landroidx/compose/foundation/BorderModifierNode;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 152
    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNode;->drawWithCacheModifierNode:Landroidx/compose/ui/draw/CacheDrawModifierNode;

    invoke-interface {v0}, Landroidx/compose/ui/draw/CacheDrawModifierNode;->invalidateDrawCache()V

    .line 154
    :cond_0
    return-void
.end method

.method public final setWidth-0680j_4(F)V
    .locals 1
    .param p1, "value"    # F

    .line 134
    iget v0, p0, Landroidx/compose/foundation/BorderModifierNode;->width:F

    invoke-static {v0, p1}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    iput p1, p0, Landroidx/compose/foundation/BorderModifierNode;->width:F

    .line 136
    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNode;->drawWithCacheModifierNode:Landroidx/compose/ui/draw/CacheDrawModifierNode;

    invoke-interface {v0}, Landroidx/compose/ui/draw/CacheDrawModifierNode;->invalidateDrawCache()V

    .line 138
    :cond_0
    return-void
.end method
