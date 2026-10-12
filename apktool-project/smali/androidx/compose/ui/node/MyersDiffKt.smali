.class public final Landroidx/compose/ui/node/MyersDiffKt;
.super Ljava/lang/Object;
.source "MyersDiff.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n1#1,518:1\n375#1:528\n375#1:529\n329#2:519\n318#2:520\n310#2:521\n322#2:522\n314#2:523\n310#2:524\n314#2:525\n318#2:526\n322#2:527\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n203#1:528\n270#1:529\n75#1:519\n75#1:520\n75#1:521\n75#1:522\n75#1:523\n82#1:524\n84#1:525\n89#1:526\n91#1:527\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0016\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aZ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0012H\u0000\u001aZ\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010\u0014\u001aR\u0010!\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002\u001a\r\u0010\'\u001a\u00020\t*\u00020\u0007H\u0082\u0008\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006("
    }
    d2 = {
        "applyDiff",
        "",
        "diagonals",
        "Landroidx/compose/ui/node/IntStack;",
        "callback",
        "Landroidx/compose/ui/node/DiffCallback;",
        "backward",
        "",
        "oldStart",
        "",
        "oldEnd",
        "newStart",
        "newEnd",
        "cb",
        "forward",
        "Landroidx/compose/ui/node/CenteredArray;",
        "d",
        "snake",
        "",
        "backward-4l5_RBY",
        "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z",
        "calculateDiff",
        "oldSize",
        "newSize",
        "executeDiff",
        "fillSnake",
        "startX",
        "startY",
        "endX",
        "endY",
        "reverse",
        "data",
        "forward-4l5_RBY",
        "midPoint",
        "midPoint-q5eDKzI",
        "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z",
        "swap",
        "i",
        "j",
        "toInt",
        "ui_release"
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
.method public static final synthetic access$swap([III)V
    .locals 0
    .param p0, "$receiver"    # [I
    .param p1, "i"    # I
    .param p2, "j"    # I

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/node/MyersDiffKt;->swap([III)V

    return-void
.end method

.method private static final applyDiff(Landroidx/compose/ui/node/IntStack;Landroidx/compose/ui/node/DiffCallback;)V
    .locals 7
    .param p0, "diagonals"    # Landroidx/compose/ui/node/IntStack;
    .param p1, "callback"    # Landroidx/compose/ui/node/DiffCallback;

    .line 108
    const/4 v0, 0x0

    .line 109
    .local v0, "posX":I
    const/4 v1, 0x0

    .line 110
    .local v1, "posY":I
    const/4 v2, 0x0

    .line 112
    .local v2, "i":I
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/IntStack;->getSize()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 113
    invoke-virtual {p0, v2}, Landroidx/compose/ui/node/IntStack;->get(I)I

    move-result v3

    add-int/lit8 v4, v2, 0x2

    invoke-virtual {p0, v4}, Landroidx/compose/ui/node/IntStack;->get(I)I

    move-result v4

    sub-int/2addr v3, v4

    .line 114
    .local v3, "startX":I
    add-int/lit8 v4, v2, 0x1

    invoke-virtual {p0, v4}, Landroidx/compose/ui/node/IntStack;->get(I)I

    move-result v4

    add-int/lit8 v5, v2, 0x2

    invoke-virtual {p0, v5}, Landroidx/compose/ui/node/IntStack;->get(I)I

    move-result v5

    sub-int/2addr v4, v5

    .line 115
    .local v4, "startY":I
    add-int/lit8 v5, v2, 0x2

    invoke-virtual {p0, v5}, Landroidx/compose/ui/node/IntStack;->get(I)I

    move-result v5

    .line 116
    .local v5, "len":I
    add-int/lit8 v2, v2, 0x3

    .line 117
    :goto_0
    if-ge v0, v3, :cond_1

    .line 118
    invoke-interface {p1, v1, v0}, Landroidx/compose/ui/node/DiffCallback;->remove(II)V

    .line 119
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 121
    :cond_1
    :goto_1
    if-ge v1, v4, :cond_2

    .line 122
    invoke-interface {p1, v1}, Landroidx/compose/ui/node/DiffCallback;->insert(I)V

    .line 123
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 125
    :cond_2
    :goto_2
    add-int/lit8 v6, v5, -0x1

    .end local v5    # "len":I
    .local v6, "len":I
    if-lez v5, :cond_0

    .line 126
    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/node/DiffCallback;->same(II)V

    .line 127
    add-int/lit8 v0, v0, 0x1

    .line 128
    add-int/lit8 v1, v1, 0x1

    move v5, v6

    goto :goto_2

    .line 131
    .end local v3    # "startX":I
    .end local v4    # "startY":I
    .end local v6    # "len":I
    :cond_3
    return-void
.end method

.method private static final backward-4l5_RBY(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z
    .locals 20
    .param p0, "oldStart"    # I
    .param p1, "oldEnd"    # I
    .param p2, "newStart"    # I
    .param p3, "newEnd"    # I
    .param p4, "cb"    # Landroidx/compose/ui/node/DiffCallback;
    .param p5, "forward"    # [I
    .param p6, "backward"    # [I
    .param p7, "d"    # I
    .param p8, "snake"    # [I

    .line 245
    move/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p6

    move/from16 v3, p7

    sub-int v4, p1, v0

    .line 246
    .local v4, "oldSize":I
    sub-int v5, p3, v1

    .line 247
    .local v5, "newSize":I
    sub-int v6, v4, v5

    const/4 v7, 0x1

    and-int/2addr v6, v7

    if-nez v6, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 248
    .local v6, "checkForSnake":Z
    :goto_0
    sub-int v9, v4, v5

    .line 251
    .local v9, "delta":I
    neg-int v10, v3

    .line 252
    .local v10, "k":I
    :goto_1
    if-gt v10, v3, :cond_a

    .line 258
    const/4 v11, 0x0

    .line 259
    .local v11, "startX":I
    const/4 v12, 0x0

    .line 260
    .local v12, "x":I
    neg-int v13, v3

    if-eq v10, v13, :cond_2

    if-eq v10, v3, :cond_1

    add-int/lit8 v13, v10, 0x1

    invoke-static {v2, v13}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v13

    add-int/lit8 v14, v10, -0x1

    invoke-static {v2, v14}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v14

    if-ge v13, v14, :cond_1

    goto :goto_2

    .line 266
    :cond_1
    add-int/lit8 v13, v10, -0x1

    invoke-static {v2, v13}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v11

    .line 267
    add-int/lit8 v12, v11, -0x1

    move v15, v11

    goto :goto_3

    .line 262
    :cond_2
    :goto_2
    add-int/lit8 v13, v10, 0x1

    invoke-static {v2, v13}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v11

    .line 263
    move v12, v11

    move v15, v11

    .line 269
    .end local v11    # "startX":I
    .local v15, "startX":I
    :goto_3
    sub-int v11, p1, v12

    sub-int/2addr v11, v10

    sub-int v11, p3, v11

    .line 270
    .local v11, "y":I
    if-eqz v3, :cond_3

    move v13, v7

    goto :goto_4

    :cond_3
    const/4 v13, 0x0

    :goto_4
    if-ne v12, v15, :cond_4

    move v14, v7

    goto :goto_5

    :cond_4
    const/4 v14, 0x0

    :goto_5
    and-int/2addr v13, v14

    .local v13, "$this$toInt$iv":Z
    const/4 v14, 0x0

    .line 529
    .local v14, "$i$f$toInt":I
    nop

    .line 270
    .end local v13    # "$this$toInt$iv":Z
    .end local v14    # "$i$f$toInt":I
    add-int v16, v11, v13

    move v14, v11

    move v13, v12

    .line 272
    .end local v11    # "y":I
    .end local v12    # "x":I
    .local v13, "x":I
    .local v14, "y":I
    .local v16, "startY":I
    :goto_6
    if-le v13, v0, :cond_5

    if-le v14, v1, :cond_5

    add-int/lit8 v11, v13, -0x1

    add-int/lit8 v12, v14, -0x1

    move/from16 v19, v7

    move-object/from16 v7, p4

    invoke-interface {v7, v11, v12}, Landroidx/compose/ui/node/DiffCallback;->areItemsTheSame(II)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 273
    add-int/lit8 v13, v13, -0x1

    .line 274
    add-int/lit8 v14, v14, -0x1

    move/from16 v7, v19

    goto :goto_6

    .line 272
    :cond_5
    move/from16 v19, v7

    move-object/from16 v7, p4

    .line 277
    :cond_6
    invoke-static {v2, v10, v13}, Landroidx/compose/ui/node/CenteredArray;->set-impl([III)V

    .line 278
    if-eqz v6, :cond_8

    .line 281
    sub-int v11, v9, v10

    .line 283
    .local v11, "forwardsK":I
    neg-int v12, v3

    if-lt v11, v12, :cond_7

    if-gt v11, v3, :cond_7

    move-object/from16 v12, p5

    const/16 v17, 0x0

    invoke-static {v12, v11}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v8

    if-lt v8, v13, :cond_9

    .line 287
    nop

    .line 288
    nop

    .line 289
    nop

    .line 290
    nop

    .line 291
    nop

    .line 292
    nop

    .line 286
    const/16 v17, 0x1

    move-object/from16 v18, p8

    invoke-static/range {v13 .. v18}, Landroidx/compose/ui/node/MyersDiffKt;->fillSnake(IIIIZ[I)V

    .line 294
    return v19

    .line 283
    :cond_7
    move-object/from16 v12, p5

    const/16 v17, 0x0

    goto :goto_7

    .line 278
    .end local v11    # "forwardsK":I
    :cond_8
    move-object/from16 v12, p5

    const/16 v17, 0x0

    .line 297
    :cond_9
    :goto_7
    nop

    .end local v13    # "x":I
    .end local v14    # "y":I
    .end local v15    # "startX":I
    .end local v16    # "startY":I
    add-int/lit8 v10, v10, 0x2

    move/from16 v7, v19

    goto/16 :goto_1

    .line 299
    :cond_a
    move-object/from16 v7, p4

    move-object/from16 v12, p5

    const/16 v17, 0x0

    return v17
.end method

.method private static final calculateDiff(IILandroidx/compose/ui/node/DiffCallback;)Landroidx/compose/ui/node/IntStack;
    .locals 22
    .param p0, "oldSize"    # I
    .param p1, "newSize"    # I
    .param p2, "cb"    # Landroidx/compose/ui/node/DiffCallback;

    .line 52
    move/from16 v0, p0

    move/from16 v1, p1

    add-int v2, v0, v1

    const/4 v3, 0x1

    add-int/2addr v2, v3

    const/4 v4, 0x2

    div-int/2addr v2, v4

    .line 53
    .local v2, "max":I
    new-instance v5, Landroidx/compose/ui/node/IntStack;

    mul-int/lit8 v6, v2, 0x3

    invoke-direct {v5, v6}, Landroidx/compose/ui/node/IntStack;-><init>(I)V

    .line 56
    .local v5, "diagonals":Landroidx/compose/ui/node/IntStack;
    new-instance v6, Landroidx/compose/ui/node/IntStack;

    mul-int/lit8 v7, v2, 0x4

    invoke-direct {v6, v7}, Landroidx/compose/ui/node/IntStack;-><init>(I)V

    .line 57
    .local v6, "stack":Landroidx/compose/ui/node/IntStack;
    const/4 v7, 0x0

    invoke-virtual {v6, v7, v0, v7, v1}, Landroidx/compose/ui/node/IntStack;->pushRange(IIII)V

    .line 61
    mul-int/lit8 v8, v2, 0x2

    add-int/2addr v8, v3

    new-array v8, v8, [I

    invoke-static {v8}, Landroidx/compose/ui/node/CenteredArray;->constructor-impl([I)[I

    move-result-object v14

    .line 62
    .local v14, "forward":[I
    mul-int/lit8 v8, v2, 0x2

    add-int/2addr v8, v3

    new-array v8, v8, [I

    invoke-static {v8}, Landroidx/compose/ui/node/CenteredArray;->constructor-impl([I)[I

    move-result-object v15

    .line 63
    .local v15, "backward":[I
    const/4 v8, 0x5

    new-array v8, v8, [I

    invoke-static {v8}, Landroidx/compose/ui/node/Snake;->constructor-impl([I)[I

    move-result-object v16

    .line 65
    .local v16, "snake":[I
    :goto_0
    invoke-virtual {v6}, Landroidx/compose/ui/node/IntStack;->isNotEmpty()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 66
    invoke-virtual {v6}, Landroidx/compose/ui/node/IntStack;->pop()I

    move-result v12

    .line 67
    .local v12, "newEnd":I
    invoke-virtual {v6}, Landroidx/compose/ui/node/IntStack;->pop()I

    move-result v11

    .line 68
    .local v11, "newStart":I
    invoke-virtual {v6}, Landroidx/compose/ui/node/IntStack;->pop()I

    move-result v10

    .line 69
    .local v10, "oldEnd":I
    invoke-virtual {v6}, Landroidx/compose/ui/node/IntStack;->pop()I

    move-result v9

    .line 71
    .local v9, "oldStart":I
    move-object/from16 v13, p2

    invoke-static/range {v9 .. v16}, Landroidx/compose/ui/node/MyersDiffKt;->midPoint-q5eDKzI(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z

    move-result v8

    .line 73
    move v13, v9

    move-object/from16 v9, v16

    .end local v16    # "snake":[I
    .local v8, "found":Z
    .local v9, "snake":[I
    .local v13, "oldStart":I
    if-eqz v8, :cond_1

    .line 75
    const/16 v16, 0x0

    .line 519
    .local v16, "$i$f$getDiagonalSize-impl":I
    const/16 v17, 0x0

    .line 520
    .local v17, "$i$f$getEndX-impl":I
    aget v17, v9, v4

    .line 519
    .end local v17    # "$i$f$getEndX-impl":I
    const/16 v18, 0x0

    .line 521
    .local v18, "$i$f$getStartX-impl":I
    aget v18, v9, v7

    .line 519
    .end local v18    # "$i$f$getStartX-impl":I
    move/from16 v19, v3

    sub-int v3, v17, v18

    const/16 v17, 0x0

    .line 522
    .local v17, "$i$f$getEndY-impl":I
    const/16 v18, 0x3

    aget v17, v9, v18

    .line 519
    .end local v17    # "$i$f$getEndY-impl":I
    const/16 v20, 0x0

    .line 523
    .local v20, "$i$f$getStartY-impl":I
    aget v20, v9, v19

    .line 519
    .end local v20    # "$i$f$getStartY-impl":I
    move/from16 v21, v4

    sub-int v4, v17, v20

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 75
    .end local v16    # "$i$f$getDiagonalSize-impl":I
    if-lez v3, :cond_0

    .line 76
    invoke-static {v9, v5}, Landroidx/compose/ui/node/Snake;->addDiagonalToStack-impl([ILandroidx/compose/ui/node/IntStack;)V

    .line 80
    :cond_0
    nop

    .line 81
    nop

    .line 82
    const/4 v3, 0x0

    .line 524
    .local v3, "$i$f$getStartX-impl":I
    aget v3, v9, v7

    .line 83
    .end local v3    # "$i$f$getStartX-impl":I
    nop

    .line 84
    const/4 v4, 0x0

    .line 525
    .local v4, "$i$f$getStartY-impl":I
    aget v4, v9, v19

    .line 80
    .end local v4    # "$i$f$getStartY-impl":I
    invoke-virtual {v6, v13, v3, v11, v4}, Landroidx/compose/ui/node/IntStack;->pushRange(IIII)V

    .line 88
    nop

    .line 89
    const/4 v3, 0x0

    .line 526
    .local v3, "$i$f$getEndX-impl":I
    aget v3, v9, v21

    .line 90
    .end local v3    # "$i$f$getEndX-impl":I
    nop

    .line 91
    const/4 v4, 0x0

    .line 527
    .local v4, "$i$f$getEndY-impl":I
    aget v4, v9, v18

    .line 92
    .end local v4    # "$i$f$getEndY-impl":I
    nop

    .line 88
    invoke-virtual {v6, v3, v10, v4, v12}, Landroidx/compose/ui/node/IntStack;->pushRange(IIII)V

    move-object/from16 v16, v9

    move/from16 v3, v19

    move/from16 v4, v21

    .end local v8    # "found":Z
    .end local v10    # "oldEnd":I
    .end local v11    # "newStart":I
    .end local v12    # "newEnd":I
    .end local v13    # "oldStart":I
    goto :goto_0

    .line 73
    .restart local v8    # "found":Z
    .restart local v10    # "oldEnd":I
    .restart local v11    # "newStart":I
    .restart local v12    # "newEnd":I
    .restart local v13    # "oldStart":I
    :cond_1
    move/from16 v19, v3

    move/from16 v21, v4

    move-object/from16 v16, v9

    goto :goto_0

    .line 97
    .end local v8    # "found":Z
    .end local v9    # "snake":[I
    .end local v10    # "oldEnd":I
    .end local v11    # "newStart":I
    .end local v12    # "newEnd":I
    .end local v13    # "oldStart":I
    .local v16, "snake":[I
    :cond_2
    invoke-virtual {v5}, Landroidx/compose/ui/node/IntStack;->sortDiagonals()V

    .line 99
    invoke-virtual {v5, v0, v1, v7}, Landroidx/compose/ui/node/IntStack;->pushDiagonal(III)V

    .line 101
    return-object v5
.end method

.method public static final executeDiff(IILandroidx/compose/ui/node/DiffCallback;)V
    .locals 1
    .param p0, "oldSize"    # I
    .param p1, "newSize"    # I
    .param p2, "callback"    # Landroidx/compose/ui/node/DiffCallback;

    .line 134
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/node/MyersDiffKt;->calculateDiff(IILandroidx/compose/ui/node/DiffCallback;)Landroidx/compose/ui/node/IntStack;

    move-result-object v0

    .line 135
    .local v0, "diagonals":Landroidx/compose/ui/node/IntStack;
    invoke-static {v0, p2}, Landroidx/compose/ui/node/MyersDiffKt;->applyDiff(Landroidx/compose/ui/node/IntStack;Landroidx/compose/ui/node/DiffCallback;)V

    .line 136
    return-void
.end method

.method public static final fillSnake(IIIIZ[I)V
    .locals 2
    .param p0, "startX"    # I
    .param p1, "startY"    # I
    .param p2, "endX"    # I
    .param p3, "endY"    # I
    .param p4, "reverse"    # Z
    .param p5, "data"    # [I

    .line 385
    array-length v0, p5

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    return-void

    .line 386
    :cond_0
    const/4 v0, 0x0

    aput p0, p5, v0

    .line 387
    const/4 v0, 0x1

    aput p1, p5, v0

    .line 388
    const/4 v0, 0x2

    aput p2, p5, v0

    .line 389
    const/4 v0, 0x3

    aput p3, p5, v0

    .line 390
    const/4 v0, 0x4

    aput p4, p5, v0

    .line 391
    return-void
.end method

.method private static final forward-4l5_RBY(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z
    .locals 21
    .param p0, "oldStart"    # I
    .param p1, "oldEnd"    # I
    .param p2, "newStart"    # I
    .param p3, "newEnd"    # I
    .param p4, "cb"    # Landroidx/compose/ui/node/DiffCallback;
    .param p5, "forward"    # [I
    .param p6, "backward"    # [I
    .param p7, "d"    # I
    .param p8, "snake"    # [I

    .line 181
    move/from16 v0, p1

    move/from16 v1, p3

    move-object/from16 v2, p5

    move/from16 v3, p7

    sub-int v4, v0, p0

    .line 182
    .local v4, "oldSize":I
    sub-int v5, v1, p2

    .line 183
    .local v5, "newSize":I
    sub-int v6, v4, v5

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    const/4 v7, 0x1

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 184
    .local v6, "checkForSnake":Z
    :goto_0
    sub-int v9, v4, v5

    .line 185
    .local v9, "delta":I
    neg-int v10, v3

    .line 186
    .local v10, "k":I
    :goto_1
    if-gt v10, v3, :cond_a

    .line 190
    const/4 v11, 0x0

    .line 191
    .local v11, "startX":I
    const/4 v12, 0x0

    .line 192
    .local v12, "startY":I
    const/4 v13, 0x0

    .line 193
    .local v13, "x":I
    neg-int v14, v3

    if-eq v10, v14, :cond_2

    if-eq v10, v3, :cond_1

    add-int/lit8 v14, v10, 0x1

    invoke-static {v2, v14}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v14

    add-int/lit8 v15, v10, -0x1

    invoke-static {v2, v15}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v15

    if-le v14, v15, :cond_1

    goto :goto_2

    .line 199
    :cond_1
    add-int/lit8 v14, v10, -0x1

    invoke-static {v2, v14}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v11

    .line 200
    add-int/lit8 v13, v11, 0x1

    move v14, v11

    goto :goto_3

    .line 195
    :cond_2
    :goto_2
    add-int/lit8 v14, v10, 0x1

    invoke-static {v2, v14}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v11

    .line 196
    move v13, v11

    move v14, v11

    .line 202
    .end local v11    # "startX":I
    .local v14, "startX":I
    :goto_3
    sub-int v11, v13, p0

    add-int v11, p2, v11

    sub-int/2addr v11, v10

    .line 203
    .local v11, "y":I
    if-eqz v3, :cond_3

    move v15, v7

    goto :goto_4

    :cond_3
    const/4 v15, 0x0

    :goto_4
    if-ne v13, v14, :cond_4

    move/from16 v16, v7

    goto :goto_5

    :cond_4
    const/16 v16, 0x0

    :goto_5
    and-int v15, v15, v16

    .local v15, "$this$toInt$iv":Z
    const/16 v16, 0x0

    .line 528
    .local v16, "$i$f$toInt":I
    nop

    .line 203
    .end local v15    # "$this$toInt$iv":Z
    .end local v16    # "$i$f$toInt":I
    sub-int v15, v11, v15

    .line 205
    .end local v12    # "startY":I
    .local v15, "startY":I
    :goto_6
    if-ge v13, v0, :cond_5

    if-ge v11, v1, :cond_5

    move-object/from16 v12, p4

    invoke-interface {v12, v13, v11}, Landroidx/compose/ui/node/DiffCallback;->areItemsTheSame(II)Z

    move-result v16

    if-eqz v16, :cond_6

    .line 206
    add-int/lit8 v13, v13, 0x1

    .line 207
    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    .line 205
    :cond_5
    move-object/from16 v12, p4

    .line 210
    :cond_6
    invoke-static {v2, v10, v13}, Landroidx/compose/ui/node/CenteredArray;->set-impl([III)V

    .line 211
    if-eqz v6, :cond_9

    .line 214
    move/from16 v20, v7

    sub-int v7, v9, v10

    .line 216
    .local v7, "backwardsK":I
    const/16 v16, 0x0

    neg-int v8, v3

    add-int/lit8 v8, v8, 0x1

    if-lt v7, v8, :cond_7

    add-int/lit8 v8, v3, -0x1

    if-gt v7, v8, :cond_7

    move-object/from16 v8, p6

    invoke-static {v8, v7}, Landroidx/compose/ui/node/CenteredArray;->get-impl([II)I

    move-result v0

    if-gt v0, v13, :cond_8

    .line 219
    nop

    .line 220
    nop

    .line 221
    nop

    .line 222
    nop

    .line 223
    nop

    .line 224
    nop

    .line 218
    const/16 v18, 0x0

    move-object/from16 v19, p8

    move/from16 v17, v11

    move/from16 v16, v13

    .end local v11    # "y":I
    .end local v13    # "x":I
    .local v16, "x":I
    .local v17, "y":I
    invoke-static/range {v14 .. v19}, Landroidx/compose/ui/node/MyersDiffKt;->fillSnake(IIIIZ[I)V

    .line 226
    .end local v16    # "x":I
    .restart local v13    # "x":I
    return v20

    .line 216
    .end local v17    # "y":I
    .restart local v11    # "y":I
    :cond_7
    move-object/from16 v8, p6

    :cond_8
    move/from16 v17, v11

    .end local v11    # "y":I
    .restart local v17    # "y":I
    goto :goto_7

    .line 211
    .end local v7    # "backwardsK":I
    .end local v17    # "y":I
    .restart local v11    # "y":I
    :cond_9
    move-object/from16 v8, p6

    move/from16 v20, v7

    move/from16 v17, v11

    const/16 v16, 0x0

    .line 229
    .end local v11    # "y":I
    .restart local v17    # "y":I
    :goto_7
    nop

    .end local v13    # "x":I
    .end local v14    # "startX":I
    .end local v15    # "startY":I
    .end local v17    # "y":I
    add-int/lit8 v10, v10, 0x2

    move/from16 v0, p1

    move/from16 v7, v20

    goto/16 :goto_1

    .line 231
    :cond_a
    move-object/from16 v12, p4

    move-object/from16 v8, p6

    const/16 v16, 0x0

    return v16
.end method

.method private static final midPoint-q5eDKzI(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z
    .locals 16
    .param p0, "oldStart"    # I
    .param p1, "oldEnd"    # I
    .param p2, "newStart"    # I
    .param p3, "newEnd"    # I
    .param p4, "cb"    # Landroidx/compose/ui/node/DiffCallback;
    .param p5, "forward"    # [I
    .param p6, "backward"    # [I
    .param p7, "snake"    # [I

    .line 149
    move/from16 v0, p0

    move/from16 v1, p1

    sub-int v9, v1, v0

    .line 150
    .local v9, "oldSize":I
    sub-int v10, p3, p2

    .line 151
    .local v10, "newSize":I
    const/4 v11, 0x0

    const/4 v12, 0x1

    if-lt v9, v12, :cond_4

    if-ge v10, v12, :cond_0

    goto :goto_1

    .line 154
    :cond_0
    add-int v2, v9, v10

    add-int/2addr v2, v12

    div-int/lit8 v13, v2, 0x2

    .line 155
    .local v13, "max":I
    move-object/from16 v5, p5

    invoke-static {v5, v12, v0}, Landroidx/compose/ui/node/CenteredArray;->set-impl([III)V

    .line 156
    move-object/from16 v6, p6

    invoke-static {v6, v12, v1}, Landroidx/compose/ui/node/CenteredArray;->set-impl([III)V

    .line 157
    const/4 v2, 0x0

    move v7, v2

    .local v7, "d":I
    :goto_0
    if-ge v7, v13, :cond_3

    .line 158
    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v8, p7

    invoke-static/range {v0 .. v8}, Landroidx/compose/ui/node/MyersDiffKt;->forward-4l5_RBY(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z

    move-result v14

    .line 159
    .local v14, "found":Z
    if-eqz v14, :cond_1

    .line 160
    return v12

    .line 162
    :cond_1
    move/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v8, p7

    invoke-static/range {v0 .. v8}, Landroidx/compose/ui/node/MyersDiffKt;->backward-4l5_RBY(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z

    move-result v15

    .line 163
    .local v15, "found2":Z
    if-eqz v15, :cond_2

    .line 164
    return v12

    .line 157
    .end local v14    # "found":Z
    .end local v15    # "found2":Z
    :cond_2
    add-int/lit8 v7, v7, 0x1

    move/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    goto :goto_0

    .line 167
    .end local v7    # "d":I
    :cond_3
    return v11

    .line 152
    .end local v13    # "max":I
    :cond_4
    :goto_1
    return v11
.end method

.method private static final swap([III)V
    .locals 2
    .param p0, "$this$swap"    # [I
    .param p1, "i"    # I
    .param p2, "j"    # I

    .line 514
    aget v0, p0, p1

    .line 515
    .local v0, "tmp":I
    aget v1, p0, p2

    aput v1, p0, p1

    .line 516
    aput v0, p0, p2

    .line 517
    return-void
.end method

.method private static final toInt(Z)I
    .locals 1
    .param p0, "$this$toInt"    # Z

    const/4 v0, 0x0

    .line 375
    .local v0, "$i$f$toInt":I
    return p0
.end method
