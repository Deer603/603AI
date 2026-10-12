.class public final Landroidx/compose/ui/graphics/vector/PathNodeKt;
.super Ljava/lang/Object;
.source "PathNode.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,329:1\n254#1,7:330\n254#1,7:337\n254#1,7:344\n254#1,7:351\n254#1,7:358\n254#1,7:365\n254#1,7:372\n254#1,7:379\n254#1,7:386\n254#1,7:393\n254#1,7:400\n254#1,7:407\n254#1,7:414\n254#1,7:421\n254#1,7:428\n254#1,7:435\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n130#1:330,7\n134#1:337,7\n138#1:344,7\n142#1:351,7\n146#1:358,7\n150#1:365,7\n154#1:372,7\n165#1:379,7\n176#1:386,7\n185#1:393,7\n194#1:400,7\n203#1:407,7\n212#1:414,7\n216#1:421,7\n220#1:428,7\n232#1:435,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0010\u000c\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u001f\u001a\u00020 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0008H\u0002\u001ai\u0010\'\u001a\u00020 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00082\u0006\u0010(\u001a\u00020\u000828\u0008\u0004\u0010)\u001a2\u0012\u0013\u0012\u00110%\u00a2\u0006\u000c\u0008+\u0012\u0008\u0008,\u0012\u0004\u0008\u0008(-\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008+\u0012\u0008\u0008,\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020#0*H\u0082\u0008\u001a&\u0010/\u001a\u00020 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0008H\u0002\u001a4\u00100\u001a\u00020 *\u00020\u00012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#01j\u0008\u0012\u0004\u0012\u00020#`22\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0008H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00063"
    }
    d2 = {
        "ArcToKey",
        "",
        "CloseKey",
        "CurveToKey",
        "HorizontalToKey",
        "LineToKey",
        "MoveToKey",
        "NUM_ARC_TO_ARGS",
        "",
        "NUM_CURVE_TO_ARGS",
        "NUM_HORIZONTAL_TO_ARGS",
        "NUM_LINE_TO_ARGS",
        "NUM_MOVE_TO_ARGS",
        "NUM_QUAD_TO_ARGS",
        "NUM_REFLECTIVE_CURVE_TO_ARGS",
        "NUM_REFLECTIVE_QUAD_TO_ARGS",
        "NUM_VERTICAL_TO_ARGS",
        "QuadToKey",
        "ReflectiveCurveToKey",
        "ReflectiveQuadToKey",
        "RelativeArcToKey",
        "RelativeCloseKey",
        "RelativeCurveToKey",
        "RelativeHorizontalToKey",
        "RelativeLineToKey",
        "RelativeMoveToKey",
        "RelativeQuadToKey",
        "RelativeReflectiveCurveToKey",
        "RelativeReflectiveQuadToKey",
        "RelativeVerticalToKey",
        "VerticalToKey",
        "pathMoveNodeFromArgs",
        "",
        "nodes",
        "",
        "Landroidx/compose/ui/graphics/vector/PathNode;",
        "args",
        "",
        "count",
        "pathNodesFromArgs",
        "numArgs",
        "nodeFor",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "subArray",
        "start",
        "pathRelativeMoveNodeFromArgs",
        "addPathNodes",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ArcToKey:C = 'A'

.field private static final CloseKey:C = 'Z'

.field private static final CurveToKey:C = 'C'

.field private static final HorizontalToKey:C = 'H'

.field private static final LineToKey:C = 'L'

.field private static final MoveToKey:C = 'M'

.field private static final NUM_ARC_TO_ARGS:I = 0x7

.field private static final NUM_CURVE_TO_ARGS:I = 0x6

.field private static final NUM_HORIZONTAL_TO_ARGS:I = 0x1

.field private static final NUM_LINE_TO_ARGS:I = 0x2

.field private static final NUM_MOVE_TO_ARGS:I = 0x2

.field private static final NUM_QUAD_TO_ARGS:I = 0x4

.field private static final NUM_REFLECTIVE_CURVE_TO_ARGS:I = 0x4

.field private static final NUM_REFLECTIVE_QUAD_TO_ARGS:I = 0x2

.field private static final NUM_VERTICAL_TO_ARGS:I = 0x1

.field private static final QuadToKey:C = 'Q'

.field private static final ReflectiveCurveToKey:C = 'S'

.field private static final ReflectiveQuadToKey:C = 'T'

.field private static final RelativeArcToKey:C = 'a'

.field private static final RelativeCloseKey:C = 'z'

.field private static final RelativeCurveToKey:C = 'c'

.field private static final RelativeHorizontalToKey:C = 'h'

.field private static final RelativeLineToKey:C = 'l'

.field private static final RelativeMoveToKey:C = 'm'

.field private static final RelativeQuadToKey:C = 'q'

.field private static final RelativeReflectiveCurveToKey:C = 's'

.field private static final RelativeReflectiveQuadToKey:C = 't'

.field private static final RelativeVerticalToKey:C = 'v'

.field private static final VerticalToKey:C = 'V'


# direct methods
.method public static final addPathNodes(CLjava/util/ArrayList;[FI)V
    .locals 23
    .param p0, "$this$addPathNodes"    # C
    .param p1, "nodes"    # Ljava/util/ArrayList;
    .param p2, "args"    # [F
    .param p3, "count"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C",
            "Ljava/util/ArrayList<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FI)V"
        }
    .end annotation

    .line 124
    move/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    const/4 v5, 0x0

    sparse-switch v0, :sswitch_data_0

    .line 243
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unknown command for: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 146
    :sswitch_0
    const/4 v4, 0x1

    .local v4, "numArgs$iv":I
    const/4 v5, 0x0

    .line 358
    .local v5, "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 359
    .local v6, "end$iv":I
    const/4 v7, 0x0

    .line 360
    .local v7, "index$iv":I
    :goto_0
    if-gt v7, v6, :cond_0

    .line 361
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .local v9, "start":I
    move-object/from16 v10, p2

    .local v10, "array":[F
    const/4 v11, 0x0

    .line 147
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$5":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;

    aget v13, v10, v9

    invoke-direct {v12, v13}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;-><init>(F)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 361
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$5":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 362
    add-int/2addr v7, v4

    goto :goto_0

    .line 364
    :cond_0
    nop

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 212
    :sswitch_1
    const/4 v4, 0x2

    .restart local v4    # "numArgs$iv":I
    const/4 v5, 0x0

    .line 414
    .restart local v5    # "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 415
    .restart local v6    # "end$iv":I
    const/4 v7, 0x0

    .line 416
    .restart local v7    # "index$iv":I
    :goto_1
    if-gt v7, v6, :cond_1

    .line 417
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .restart local v9    # "start":I
    move-object/from16 v10, p2

    .restart local v10    # "array":[F
    const/4 v11, 0x0

    .line 213
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$13":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;

    aget v13, v10, v9

    add-int/lit8 v14, v9, 0x1

    aget v14, v10, v14

    invoke-direct {v12, v13, v14}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;-><init>(FF)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 417
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$13":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 418
    add-int/2addr v7, v4

    goto :goto_1

    .line 420
    :cond_1
    nop

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 176
    :sswitch_2
    const/4 v4, 0x4

    .restart local v4    # "numArgs$iv":I
    const/4 v5, 0x0

    .line 386
    .restart local v5    # "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 387
    .restart local v6    # "end$iv":I
    const/4 v7, 0x0

    .line 388
    .restart local v7    # "index$iv":I
    :goto_2
    if-gt v7, v6, :cond_2

    .line 389
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .restart local v9    # "start":I
    move-object/from16 v10, p2

    .restart local v10    # "array":[F
    const/4 v11, 0x0

    .line 177
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$9":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;

    .line 178
    aget v13, v10, v9

    .line 179
    add-int/lit8 v14, v9, 0x1

    aget v14, v10, v14

    .line 180
    add-int/lit8 v15, v9, 0x2

    aget v15, v10, v15

    .line 181
    add-int/lit8 v16, v9, 0x3

    move/from16 v17, v4

    .end local v4    # "numArgs$iv":I
    .local v17, "numArgs$iv":I
    aget v4, v10, v16

    .line 177
    invoke-direct {v12, v13, v14, v15, v4}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;-><init>(FFFF)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 182
    nop

    .line 389
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$9":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    add-int v7, v7, v17

    move/from16 v4, v17

    goto :goto_2

    .line 392
    .end local v17    # "numArgs$iv":I
    .restart local v4    # "numArgs$iv":I
    :cond_2
    move/from16 v17, v4

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 194
    :sswitch_3
    const/4 v4, 0x4

    .restart local v4    # "numArgs$iv":I
    const/4 v5, 0x0

    .line 400
    .restart local v5    # "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 401
    .restart local v6    # "end$iv":I
    const/4 v7, 0x0

    .line 402
    .restart local v7    # "index$iv":I
    :goto_3
    if-gt v7, v6, :cond_3

    .line 403
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .restart local v9    # "start":I
    move-object/from16 v10, p2

    .restart local v10    # "array":[F
    const/4 v11, 0x0

    .line 195
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$11":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;

    .line 196
    aget v13, v10, v9

    .line 197
    add-int/lit8 v14, v9, 0x1

    aget v14, v10, v14

    .line 198
    add-int/lit8 v15, v9, 0x2

    aget v15, v10, v15

    .line 199
    add-int/lit8 v16, v9, 0x3

    move/from16 v17, v4

    .end local v4    # "numArgs$iv":I
    .restart local v17    # "numArgs$iv":I
    aget v4, v10, v16

    .line 195
    invoke-direct {v12, v13, v14, v15, v4}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;-><init>(FFFF)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 200
    nop

    .line 403
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$11":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    add-int v7, v7, v17

    move/from16 v4, v17

    goto :goto_3

    .line 406
    .end local v17    # "numArgs$iv":I
    .restart local v4    # "numArgs$iv":I
    :cond_3
    move/from16 v17, v4

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 127
    :sswitch_4
    move-object v4, v1

    check-cast v4, Ljava/util/List;

    invoke-static {v4, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNodeKt;->pathRelativeMoveNodeFromArgs(Ljava/util/List;[FI)V

    goto/16 :goto_14

    .line 130
    :sswitch_5
    const/4 v4, 0x2

    .restart local v4    # "numArgs$iv":I
    const/4 v5, 0x0

    .line 330
    .restart local v5    # "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 331
    .restart local v6    # "end$iv":I
    const/4 v7, 0x0

    .line 332
    .restart local v7    # "index$iv":I
    :goto_4
    if-gt v7, v6, :cond_4

    .line 333
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .restart local v9    # "start":I
    move-object/from16 v10, p2

    .restart local v10    # "array":[F
    const/4 v11, 0x0

    .line 131
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$1":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    aget v13, v10, v9

    add-int/lit8 v14, v9, 0x1

    aget v14, v10, v14

    invoke-direct {v12, v13, v14}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 333
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$1":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 334
    add-int/2addr v7, v4

    goto :goto_4

    .line 336
    :cond_4
    nop

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 138
    :sswitch_6
    const/4 v4, 0x1

    .restart local v4    # "numArgs$iv":I
    const/4 v5, 0x0

    .line 344
    .restart local v5    # "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 345
    .restart local v6    # "end$iv":I
    const/4 v7, 0x0

    .line 346
    .restart local v7    # "index$iv":I
    :goto_5
    if-gt v7, v6, :cond_5

    .line 347
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .restart local v9    # "start":I
    move-object/from16 v10, p2

    .restart local v10    # "array":[F
    const/4 v11, 0x0

    .line 139
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$3":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;

    aget v13, v10, v9

    invoke-direct {v12, v13}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;-><init>(F)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 347
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$3":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 348
    add-int/2addr v7, v4

    goto :goto_5

    .line 350
    :cond_5
    nop

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 154
    :sswitch_7
    const/4 v4, 0x6

    .restart local v4    # "numArgs$iv":I
    const/4 v5, 0x0

    .line 372
    .restart local v5    # "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 373
    .restart local v6    # "end$iv":I
    const/4 v7, 0x0

    .line 374
    .restart local v7    # "index$iv":I
    :goto_6
    if-gt v7, v6, :cond_6

    .line 375
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .restart local v9    # "start":I
    move-object/from16 v10, p2

    .restart local v10    # "array":[F
    const/4 v11, 0x0

    .line 155
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$7":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;

    .line 156
    aget v13, v10, v9

    .line 157
    add-int/lit8 v14, v9, 0x1

    aget v14, v10, v14

    .line 158
    add-int/lit8 v15, v9, 0x2

    aget v15, v10, v15

    .line 159
    add-int/lit8 v16, v9, 0x3

    aget v16, v10, v16

    .line 160
    add-int/lit8 v17, v9, 0x4

    aget v17, v10, v17

    .line 161
    add-int/lit8 v18, v9, 0x5

    aget v18, v10, v18

    .line 155
    invoke-direct/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;-><init>(FFFFFF)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 162
    nop

    .line 375
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$7":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 376
    add-int/2addr v7, v4

    goto :goto_6

    .line 378
    :cond_6
    nop

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 220
    :sswitch_8
    const/4 v7, 0x7

    .local v7, "numArgs$iv":I
    const/4 v8, 0x0

    .line 428
    .local v8, "$i$f$pathNodesFromArgs":I
    sub-int v9, v3, v7

    .line 429
    .local v9, "end$iv":I
    const/4 v10, 0x0

    .line 430
    .local v10, "index$iv":I
    :goto_7
    if-gt v10, v9, :cond_9

    .line 431
    move-object v11, v1

    check-cast v11, Ljava/util/List;

    move v12, v10

    .local v12, "start":I
    move-object/from16 v13, p2

    .local v13, "array":[F
    const/4 v14, 0x0

    .line 221
    .local v14, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$15":I
    new-instance v15, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;

    .line 222
    aget v16, v13, v12

    .line 223
    add-int/lit8 v17, v12, 0x1

    aget v17, v13, v17

    .line 224
    add-int/lit8 v18, v12, 0x2

    aget v18, v13, v18

    .line 225
    add-int/lit8 v19, v12, 0x3

    aget v4, v13, v19

    invoke-static {v4, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v4

    if-eqz v4, :cond_7

    const/16 v19, 0x1

    goto :goto_8

    :cond_7
    const/16 v19, 0x0

    .line 226
    :goto_8
    add-int/lit8 v4, v12, 0x4

    aget v4, v13, v4

    invoke-static {v4, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v4

    if-eqz v4, :cond_8

    const/16 v20, 0x1

    goto :goto_9

    :cond_8
    const/16 v20, 0x0

    .line 227
    :goto_9
    add-int/lit8 v4, v12, 0x5

    aget v21, v13, v4

    .line 228
    add-int/lit8 v4, v12, 0x6

    aget v22, v13, v4

    .line 221
    invoke-direct/range {v15 .. v22}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;-><init>(FFFZZFF)V

    check-cast v15, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 229
    nop

    .line 431
    .end local v12    # "start":I
    .end local v13    # "array":[F
    .end local v14    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$15":I
    invoke-interface {v11, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 432
    add-int/2addr v10, v7

    goto :goto_7

    .line 434
    :cond_9
    nop

    .end local v7    # "numArgs$iv":I
    .end local v8    # "$i$f$pathNodesFromArgs":I
    .end local v9    # "end$iv":I
    .end local v10    # "index$iv":I
    goto/16 :goto_14

    .line 126
    :sswitch_9
    sget-object v4, Landroidx/compose/ui/graphics/vector/PathNode$Close;->INSTANCE:Landroidx/compose/ui/graphics/vector/PathNode$Close;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_14

    .line 150
    :sswitch_a
    const/4 v4, 0x1

    .restart local v4    # "numArgs$iv":I
    const/4 v5, 0x0

    .line 365
    .restart local v5    # "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 366
    .restart local v6    # "end$iv":I
    const/4 v7, 0x0

    .line 367
    .local v7, "index$iv":I
    :goto_a
    if-gt v7, v6, :cond_a

    .line 368
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .local v9, "start":I
    move-object/from16 v10, p2

    .local v10, "array":[F
    const/4 v11, 0x0

    .line 151
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$6":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;

    aget v13, v10, v9

    invoke-direct {v12, v13}, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;-><init>(F)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 368
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$6":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    add-int/2addr v7, v4

    goto :goto_a

    .line 371
    :cond_a
    nop

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 216
    :sswitch_b
    const/4 v4, 0x2

    .restart local v4    # "numArgs$iv":I
    const/4 v5, 0x0

    .line 421
    .restart local v5    # "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 422
    .restart local v6    # "end$iv":I
    const/4 v7, 0x0

    .line 423
    .restart local v7    # "index$iv":I
    :goto_b
    if-gt v7, v6, :cond_b

    .line 424
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .restart local v9    # "start":I
    move-object/from16 v10, p2

    .restart local v10    # "array":[F
    const/4 v11, 0x0

    .line 217
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$14":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;

    aget v13, v10, v9

    add-int/lit8 v14, v9, 0x1

    aget v14, v10, v14

    invoke-direct {v12, v13, v14}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;-><init>(FF)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 424
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$14":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 425
    add-int/2addr v7, v4

    goto :goto_b

    .line 427
    :cond_b
    nop

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 185
    :sswitch_c
    const/4 v4, 0x4

    .restart local v4    # "numArgs$iv":I
    const/4 v5, 0x0

    .line 393
    .restart local v5    # "$i$f$pathNodesFromArgs":I
    sub-int v6, v3, v4

    .line 394
    .restart local v6    # "end$iv":I
    const/4 v7, 0x0

    .line 395
    .restart local v7    # "index$iv":I
    :goto_c
    if-gt v7, v6, :cond_c

    .line 396
    move-object v8, v1

    check-cast v8, Ljava/util/List;

    move v9, v7

    .restart local v9    # "start":I
    move-object/from16 v10, p2

    .restart local v10    # "array":[F
    const/4 v11, 0x0

    .line 186
    .local v11, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$10":I
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;

    .line 187
    aget v13, v10, v9

    .line 188
    add-int/lit8 v14, v9, 0x1

    aget v14, v10, v14

    .line 189
    add-int/lit8 v15, v9, 0x2

    aget v15, v10, v15

    .line 190
    add-int/lit8 v16, v9, 0x3

    aget v1, v10, v16

    .line 186
    invoke-direct {v12, v13, v14, v15, v1}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;-><init>(FFFF)V

    check-cast v12, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 191
    nop

    .line 396
    .end local v9    # "start":I
    .end local v10    # "array":[F
    .end local v11    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$10":I
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 397
    add-int/2addr v7, v4

    move-object/from16 v1, p1

    goto :goto_c

    .line 399
    :cond_c
    nop

    .end local v4    # "numArgs$iv":I
    .end local v5    # "$i$f$pathNodesFromArgs":I
    .end local v6    # "end$iv":I
    .end local v7    # "index$iv":I
    goto/16 :goto_14

    .line 203
    :sswitch_d
    const/4 v1, 0x4

    .local v1, "numArgs$iv":I
    const/4 v4, 0x0

    .line 407
    .local v4, "$i$f$pathNodesFromArgs":I
    sub-int v5, v3, v1

    .line 408
    .local v5, "end$iv":I
    const/4 v6, 0x0

    .line 409
    .local v6, "index$iv":I
    :goto_d
    if-gt v6, v5, :cond_d

    .line 410
    move-object/from16 v7, p1

    check-cast v7, Ljava/util/List;

    move v8, v6

    .local v8, "start":I
    move-object/from16 v9, p2

    .local v9, "array":[F
    const/4 v10, 0x0

    .line 204
    .local v10, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$12":I
    new-instance v11, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;

    .line 205
    aget v12, v9, v8

    .line 206
    add-int/lit8 v13, v8, 0x1

    aget v13, v9, v13

    .line 207
    add-int/lit8 v14, v8, 0x2

    aget v14, v9, v14

    .line 208
    add-int/lit8 v15, v8, 0x3

    aget v15, v9, v15

    .line 204
    invoke-direct {v11, v12, v13, v14, v15}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;-><init>(FFFF)V

    check-cast v11, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 209
    nop

    .line 410
    .end local v8    # "start":I
    .end local v9    # "array":[F
    .end local v10    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$12":I
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 411
    add-int/2addr v6, v1

    goto :goto_d

    .line 413
    :cond_d
    nop

    .end local v1    # "numArgs$iv":I
    .end local v4    # "$i$f$pathNodesFromArgs":I
    .end local v5    # "end$iv":I
    .end local v6    # "index$iv":I
    goto/16 :goto_14

    .line 128
    :sswitch_e
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    invoke-static {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNodeKt;->pathMoveNodeFromArgs(Ljava/util/List;[FI)V

    goto/16 :goto_14

    .line 134
    :sswitch_f
    const/4 v1, 0x2

    .restart local v1    # "numArgs$iv":I
    const/4 v4, 0x0

    .line 337
    .restart local v4    # "$i$f$pathNodesFromArgs":I
    sub-int v5, v3, v1

    .line 338
    .restart local v5    # "end$iv":I
    const/4 v6, 0x0

    .line 339
    .restart local v6    # "index$iv":I
    :goto_e
    if-gt v6, v5, :cond_e

    .line 340
    move-object/from16 v7, p1

    check-cast v7, Ljava/util/List;

    move v8, v6

    .restart local v8    # "start":I
    move-object/from16 v9, p2

    .restart local v9    # "array":[F
    const/4 v10, 0x0

    .line 135
    .local v10, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$2":I
    new-instance v11, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    aget v12, v9, v8

    add-int/lit8 v13, v8, 0x1

    aget v13, v9, v13

    invoke-direct {v11, v12, v13}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    check-cast v11, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 340
    .end local v8    # "start":I
    .end local v9    # "array":[F
    .end local v10    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$2":I
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    add-int/2addr v6, v1

    goto :goto_e

    .line 343
    :cond_e
    nop

    .end local v1    # "numArgs$iv":I
    .end local v4    # "$i$f$pathNodesFromArgs":I
    .end local v5    # "end$iv":I
    .end local v6    # "index$iv":I
    goto/16 :goto_14

    .line 142
    :sswitch_10
    const/4 v1, 0x1

    .restart local v1    # "numArgs$iv":I
    const/4 v4, 0x0

    .line 351
    .restart local v4    # "$i$f$pathNodesFromArgs":I
    sub-int v5, v3, v1

    .line 352
    .restart local v5    # "end$iv":I
    const/4 v6, 0x0

    .line 353
    .restart local v6    # "index$iv":I
    :goto_f
    if-gt v6, v5, :cond_f

    .line 354
    move-object/from16 v7, p1

    check-cast v7, Ljava/util/List;

    move v8, v6

    .restart local v8    # "start":I
    move-object/from16 v9, p2

    .restart local v9    # "array":[F
    const/4 v10, 0x0

    .line 143
    .local v10, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$4":I
    new-instance v11, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;

    aget v12, v9, v8

    invoke-direct {v11, v12}, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;-><init>(F)V

    check-cast v11, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 354
    .end local v8    # "start":I
    .end local v9    # "array":[F
    .end local v10    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$4":I
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    add-int/2addr v6, v1

    goto :goto_f

    .line 357
    :cond_f
    nop

    .end local v1    # "numArgs$iv":I
    .end local v4    # "$i$f$pathNodesFromArgs":I
    .end local v5    # "end$iv":I
    .end local v6    # "index$iv":I
    goto/16 :goto_14

    .line 165
    :sswitch_11
    const/4 v1, 0x6

    .restart local v1    # "numArgs$iv":I
    const/4 v4, 0x0

    .line 379
    .restart local v4    # "$i$f$pathNodesFromArgs":I
    sub-int v5, v3, v1

    .line 380
    .restart local v5    # "end$iv":I
    const/4 v6, 0x0

    .line 381
    .restart local v6    # "index$iv":I
    :goto_10
    if-gt v6, v5, :cond_10

    .line 382
    move-object/from16 v7, p1

    check-cast v7, Ljava/util/List;

    move v8, v6

    .restart local v8    # "start":I
    move-object/from16 v9, p2

    .restart local v9    # "array":[F
    const/4 v10, 0x0

    .line 166
    .local v10, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$8":I
    new-instance v11, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;

    .line 167
    aget v12, v9, v8

    .line 168
    add-int/lit8 v13, v8, 0x1

    aget v13, v9, v13

    .line 169
    add-int/lit8 v14, v8, 0x2

    aget v14, v9, v14

    .line 170
    add-int/lit8 v15, v8, 0x3

    aget v15, v9, v15

    .line 171
    add-int/lit8 v16, v8, 0x4

    aget v16, v9, v16

    .line 172
    add-int/lit8 v17, v8, 0x5

    aget v17, v9, v17

    .line 166
    invoke-direct/range {v11 .. v17}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;-><init>(FFFFFF)V

    check-cast v11, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 173
    nop

    .line 382
    .end local v8    # "start":I
    .end local v9    # "array":[F
    .end local v10    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$8":I
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 383
    add-int/2addr v6, v1

    goto :goto_10

    .line 385
    :cond_10
    nop

    .end local v1    # "numArgs$iv":I
    .end local v4    # "$i$f$pathNodesFromArgs":I
    .end local v5    # "end$iv":I
    .end local v6    # "index$iv":I
    goto :goto_14

    .line 232
    :sswitch_12
    const/4 v1, 0x7

    .restart local v1    # "numArgs$iv":I
    const/4 v4, 0x0

    .line 435
    .restart local v4    # "$i$f$pathNodesFromArgs":I
    sub-int v7, v3, v1

    .line 436
    .local v7, "end$iv":I
    const/4 v8, 0x0

    .line 437
    .local v8, "index$iv":I
    :goto_11
    if-gt v8, v7, :cond_13

    .line 438
    move-object/from16 v9, p1

    check-cast v9, Ljava/util/List;

    move v10, v8

    .local v10, "start":I
    move-object/from16 v11, p2

    .local v11, "array":[F
    const/4 v12, 0x0

    .line 233
    .local v12, "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$16":I
    new-instance v13, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;

    .line 234
    aget v14, v11, v10

    .line 235
    add-int/lit8 v15, v10, 0x1

    aget v15, v11, v15

    .line 236
    add-int/lit8 v16, v10, 0x2

    aget v16, v11, v16

    .line 237
    add-int/lit8 v17, v10, 0x3

    aget v6, v11, v17

    invoke-static {v6, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v6

    if-eqz v6, :cond_11

    const/16 v17, 0x1

    goto :goto_12

    :cond_11
    const/16 v17, 0x0

    .line 238
    :goto_12
    add-int/lit8 v6, v10, 0x4

    aget v6, v11, v6

    invoke-static {v6, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v6

    if-eqz v6, :cond_12

    const/16 v18, 0x1

    goto :goto_13

    :cond_12
    const/16 v18, 0x0

    .line 239
    :goto_13
    add-int/lit8 v6, v10, 0x5

    aget v19, v11, v6

    .line 240
    add-int/lit8 v6, v10, 0x6

    aget v20, v11, v6

    .line 233
    invoke-direct/range {v13 .. v20}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;-><init>(FFFZZFF)V

    check-cast v13, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 241
    nop

    .line 438
    .end local v10    # "start":I
    .end local v11    # "array":[F
    .end local v12    # "$i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$16":I
    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 439
    add-int/2addr v8, v1

    goto :goto_11

    .line 441
    :cond_13
    nop

    .line 245
    .end local v1    # "numArgs$iv":I
    .end local v4    # "$i$f$pathNodesFromArgs":I
    .end local v7    # "end$iv":I
    .end local v8    # "index$iv":I
    :goto_14
    return-void

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_12
        0x43 -> :sswitch_11
        0x48 -> :sswitch_10
        0x4c -> :sswitch_f
        0x4d -> :sswitch_e
        0x51 -> :sswitch_d
        0x53 -> :sswitch_c
        0x54 -> :sswitch_b
        0x56 -> :sswitch_a
        0x5a -> :sswitch_9
        0x61 -> :sswitch_8
        0x63 -> :sswitch_7
        0x68 -> :sswitch_6
        0x6c -> :sswitch_5
        0x6d -> :sswitch_4
        0x71 -> :sswitch_3
        0x73 -> :sswitch_2
        0x74 -> :sswitch_1
        0x76 -> :sswitch_0
        0x7a -> :sswitch_9
    .end sparse-switch
.end method

.method private static final pathMoveNodeFromArgs(Ljava/util/List;[FI)V
    .locals 5
    .param p0, "nodes"    # Ljava/util/List;
    .param p1, "args"    # [F
    .param p2, "count"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FI)V"
        }
    .end annotation

    .line 265
    add-int/lit8 v0, p2, -0x2

    .line 266
    .local v0, "end":I
    if-ltz v0, :cond_0

    .line 267
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    const/4 v2, 0x0

    aget v2, p1, v2

    const/4 v3, 0x1

    aget v3, p1, v3

    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;-><init>(FF)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    const/4 v1, 0x2

    .line 269
    .local v1, "index":I
    :goto_0
    if-gt v1, v0, :cond_0

    .line 270
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    aget v3, p1, v1

    add-int/lit8 v4, v1, 0x1

    aget v4, p1, v4

    invoke-direct {v2, v3, v4}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 274
    .end local v1    # "index":I
    :cond_0
    return-void
.end method

.method private static final pathNodesFromArgs(Ljava/util/List;[FIILkotlin/jvm/functions/Function2;)V
    .locals 4
    .param p0, "nodes"    # Ljava/util/List;
    .param p1, "args"    # [F
    .param p2, "count"    # I
    .param p3, "numArgs"    # I
    .param p4, "nodeFor"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FII",
            "Lkotlin/jvm/functions/Function2<",
            "-[F-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 254
    .local v0, "$i$f$pathNodesFromArgs":I
    sub-int v1, p2, p3

    .line 255
    .local v1, "end":I
    const/4 v2, 0x0

    .line 256
    .local v2, "index":I
    :goto_0
    if-gt v2, v1, :cond_0

    .line 257
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p4, p1, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 258
    add-int/2addr v2, p3

    goto :goto_0

    .line 260
    :cond_0
    return-void
.end method

.method private static final pathRelativeMoveNodeFromArgs(Ljava/util/List;[FI)V
    .locals 5
    .param p0, "nodes"    # Ljava/util/List;
    .param p1, "args"    # [F
    .param p2, "count"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;[FI)V"
        }
    .end annotation

    .line 283
    add-int/lit8 v0, p2, -0x2

    .line 284
    .local v0, "end":I
    if-ltz v0, :cond_0

    .line 285
    new-instance v1, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    const/4 v2, 0x0

    aget v2, p1, v2

    const/4 v3, 0x1

    aget v3, p1, v3

    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;-><init>(FF)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    const/4 v1, 0x2

    .line 287
    .local v1, "index":I
    :goto_0
    if-gt v1, v0, :cond_0

    .line 288
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    aget v3, p1, v1

    add-int/lit8 v4, v1, 0x1

    aget v4, p1, v4

    invoke-direct {v2, v3, v4}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 292
    .end local v1    # "index":I
    :cond_0
    return-void
.end method
