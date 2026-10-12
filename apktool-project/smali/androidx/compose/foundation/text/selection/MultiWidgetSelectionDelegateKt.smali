.class public final Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;
.super Ljava/lang/Object;
.source "MultiWidgetSelectionDelegate.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n54#2:367\n59#2:369\n85#3:368\n90#3:370\n60#3:373\n60#3:376\n70#3:379\n70#3:382\n70#3:385\n70#3:388\n278#4:371\n65#5:372\n65#5:375\n69#5:378\n69#5:381\n69#5:384\n69#5:387\n22#6:374\n22#6:377\n22#6:380\n22#6:383\n22#6:386\n22#6:389\n1#7:390\n*S KotlinDebug\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n*L\n230#1:367\n231#1:369\n230#1:368\n231#1:370\n325#1:373\n326#1:376\n332#1:379\n333#1:382\n361#1:385\n362#1:388\n290#1:371\n325#1:372\n326#1:375\n332#1:378\n333#1:381\n361#1:384\n362#1:387\n325#1:374\n326#1:377\n332#1:380\n333#1:383\n361#1:386\n362#1:389\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\"\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\r\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002\u001a6\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00020\t*\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002\u001a4\u0010 \u001a\u00020\u0001*\u00020!2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001a0#j\u0008\u0012\u0004\u0012\u00020\u001a`$2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0001H\u0002\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006&"
    }
    d2 = {
        "getOffsetForPosition",
        "",
        "position",
        "Landroidx/compose/ui/geometry/Offset;",
        "textLayoutResult",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "getOffsetForPosition-3MmeM6k",
        "(JLandroidx/compose/ui/text/TextLayoutResult;)I",
        "getXDirection",
        "Landroidx/compose/foundation/text/selection/Direction;",
        "bounds",
        "Landroidx/compose/ui/geometry/Rect;",
        "getXDirection-3MmeM6k",
        "(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;",
        "getYDirection",
        "getYDirection-3MmeM6k",
        "isSelected",
        "",
        "currentDirection",
        "otherDirection",
        "appendSelectableInfo",
        "",
        "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;",
        "localPosition",
        "previousHandlePosition",
        "selectableId",
        "",
        "appendSelectableInfo-Parwq6A",
        "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V",
        "getDirectionById",
        "anchorSelectableId",
        "currentSelectableId",
        "getPreviousAdjustedOffset",
        "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;",
        "selectableIdOrderingComparator",
        "Ljava/util/Comparator;",
        "Lkotlin/Comparator;",
        "currentTextLength",
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
.method public static final appendSelectableInfo-Parwq6A(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V
    .locals 24
    .param p0, "$this$appendSelectableInfo_u2dParwq6A"    # Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;
    .param p1, "textLayoutResult"    # Landroidx/compose/ui/text/TextLayoutResult;
    .param p2, "localPosition"    # J
    .param p4, "previousHandlePosition"    # J
    .param p6, "selectableId"    # J

    .line 227
    move-object/from16 v10, p1

    move-wide/from16 v11, p2

    new-instance v0, Landroidx/compose/ui/geometry/Rect;

    .line 228
    nop

    .line 229
    nop

    .line 230
    invoke-virtual {v10}, Landroidx/compose/ui/text/TextLayoutResult;->getSize-YbymL2g()J

    move-result-wide v1

    .local v1, "arg0$iv":J
    const/4 v3, 0x0

    .line 367
    .local v3, "$i$f$getWidth-impl":I
    move-wide v4, v1

    .local v4, "value$iv$iv":J
    const/4 v6, 0x0

    .line 368
    .local v6, "$i$f$unpackInt1":I
    const/16 v7, 0x20

    shr-long v7, v4, v7

    long-to-int v4, v7

    .line 367
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackInt1":I
    nop

    .line 230
    .end local v1    # "arg0$iv":J
    .end local v3    # "$i$f$getWidth-impl":I
    int-to-float v1, v4

    .line 231
    invoke-virtual {v10}, Landroidx/compose/ui/text/TextLayoutResult;->getSize-YbymL2g()J

    move-result-wide v2

    .local v2, "arg0$iv":J
    const/4 v4, 0x0

    .line 369
    .local v4, "$i$f$getHeight-impl":I
    move-wide v5, v2

    .local v5, "value$iv$iv":J
    const/4 v7, 0x0

    .line 370
    .local v7, "$i$f$unpackInt2":I
    const-wide v8, 0xffffffffL

    and-long/2addr v8, v5

    long-to-int v5, v8

    .line 369
    .end local v5    # "value$iv$iv":J
    .end local v7    # "$i$f$unpackInt2":I
    nop

    .line 231
    .end local v2    # "arg0$iv":J
    .end local v4    # "$i$f$getHeight-impl":I
    int-to-float v2, v5

    .line 227
    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 226
    move-object v13, v0

    .line 234
    .local v13, "bounds":Landroidx/compose/ui/geometry/Rect;
    invoke-static {v11, v12, v13}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->getXDirection-3MmeM6k(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;

    move-result-object v0

    .line 235
    .local v0, "currentXDirection":Landroidx/compose/foundation/text/selection/Direction;
    invoke-static {v11, v12, v13}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->getYDirection-3MmeM6k(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;

    move-result-object v1

    .line 241
    .local v1, "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    const/4 v6, 0x0

    .line 242
    .local v6, "otherDirection":Landroidx/compose/foundation/text/selection/Direction;
    const/4 v7, 0x0

    .line 243
    .local v7, "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    const/4 v8, 0x0

    .line 244
    .local v8, "startYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    const/4 v9, 0x0

    .line 245
    .local v9, "endXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    const/4 v14, 0x0

    .line 246
    .local v14, "endYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->isStartHandle()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 247
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->getPreviousSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v3

    :cond_0
    move-object v5, v3

    move-object/from16 v2, p0

    move-wide/from16 v3, p6

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->appendSelectableInfo_Parwq6A$otherDirection(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Direction;

    move-result-object v5

    .line 248
    .end local v6    # "otherDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v5, "otherDirection":Landroidx/compose/foundation/text/selection/Direction;
    move-object v2, v0

    .line 249
    .end local v7    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v2, "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    move-object v3, v1

    .line 250
    .end local v8    # "startYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v3, "startYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    move-object v4, v5

    .line 251
    .end local v9    # "endXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v4, "endXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    move-object v6, v5

    move-object v15, v0

    move-object v0, v1

    move-object v7, v4

    move-object v14, v5

    move-object v8, v6

    move-object v5, v3

    move-wide/from16 v3, p6

    .end local v14    # "endYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v6, "endYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    goto :goto_0

    .line 253
    .end local v2    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .end local v3    # "startYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .end local v4    # "endXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .end local v5    # "otherDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v6, "otherDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v7    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v8    # "startYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v9    # "endXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v14    # "endYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->getPreviousSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v3

    :cond_2
    move-object v5, v3

    move-object/from16 v2, p0

    move-wide/from16 v3, p6

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->appendSelectableInfo_Parwq6A$otherDirection(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Direction;

    move-result-object v5

    .line 254
    move-object v15, v0

    move-object v0, v1

    .end local v1    # "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    .end local v6    # "otherDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v0, "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v5    # "otherDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v15, "currentXDirection":Landroidx/compose/foundation/text/selection/Direction;
    move-object v2, v5

    .line 255
    .end local v7    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v2    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    move-object v1, v5

    .line 256
    .end local v8    # "startYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v1, "startYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    move-object v6, v15

    .line 257
    .end local v9    # "endXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v6, "endXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    move-object v7, v0

    move-object v14, v5

    move-object v8, v7

    move-object v7, v6

    .line 260
    .end local v1    # "startYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .end local v6    # "endXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v5, "startYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v7, "endXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v8, "endYHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v14, "otherDirection":Landroidx/compose/foundation/text/selection/Direction;
    :goto_0
    invoke-static {v15, v0}, Landroidx/compose/foundation/text/selection/SelectionLayoutKt;->resolve2dDirection(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Landroidx/compose/foundation/text/selection/Direction;

    move-result-object v1

    invoke-static {v1, v14}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->isSelected(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 261
    return-void

    .line 264
    :cond_3
    invoke-virtual {v10}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutInput;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/text/AnnotatedString;->length()I

    move-result v1

    .line 265
    .local v1, "textLength":I
    const/4 v6, 0x0

    .line 266
    .local v6, "rawStartHandleOffset":I
    const/4 v9, 0x0

    .line 267
    .local v9, "rawEndHandleOffset":I
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->isStartHandle()Z

    move-result v16

    if-eqz v16, :cond_6

    .line 268
    invoke-static {v11, v12, v10}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->getOffsetForPosition-3MmeM6k(JLandroidx/compose/ui/text/TextLayoutResult;)I

    move-result v6

    .line 270
    nop

    .line 272
    nop

    .line 270
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->getPreviousSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v16

    .line 271
    if-eqz v16, :cond_5

    .line 270
    nop

    .line 271
    move-object/from16 v17, v0

    .end local v0    # "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v17, "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v0

    .line 272
    if-eqz v0, :cond_4

    .line 271
    nop

    .line 273
    move-object/from16 v16, v2

    .end local v2    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v16, "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->getSelectableIdOrderingComparator()Ljava/util/Comparator;

    move-result-object v2

    .line 274
    nop

    .line 275
    nop

    .line 272
    invoke-static {v0, v2, v3, v4, v1}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->getPreviousAdjustedOffset(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Ljava/util/Comparator;JI)I

    move-result v0

    .line 270
    goto :goto_2

    .line 272
    .end local v16    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v2    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    :cond_4
    move-object/from16 v16, v2

    .end local v2    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v16    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    goto :goto_1

    .line 271
    .end local v16    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .end local v17    # "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v0    # "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v2    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    :cond_5
    move-object/from16 v17, v0

    move-object/from16 v16, v2

    .line 276
    .end local v0    # "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    .end local v2    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v16    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v17    # "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    :goto_1
    move v0, v6

    .line 269
    :goto_2
    move v3, v6

    move v6, v0

    .end local v9    # "rawEndHandleOffset":I
    .local v0, "rawEndHandleOffset":I
    goto :goto_4

    .line 278
    .end local v16    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .end local v17    # "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v0, "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v2    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v9    # "rawEndHandleOffset":I
    :cond_6
    move-object/from16 v17, v0

    move-object/from16 v16, v2

    .end local v0    # "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    .end local v2    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v16    # "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .restart local v17    # "currentYDirection":Landroidx/compose/foundation/text/selection/Direction;
    invoke-static {v11, v12, v10}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->getOffsetForPosition-3MmeM6k(JLandroidx/compose/ui/text/TextLayoutResult;)I

    move-result v0

    .line 280
    .end local v9    # "rawEndHandleOffset":I
    .local v0, "rawEndHandleOffset":I
    nop

    .line 282
    nop

    .line 280
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->getPreviousSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v2

    .line 281
    if-eqz v2, :cond_7

    .line 280
    nop

    .line 281
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v2

    .line 282
    if-eqz v2, :cond_7

    .line 281
    nop

    .line 283
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->getSelectableIdOrderingComparator()Ljava/util/Comparator;

    move-result-object v9

    .line 284
    nop

    .line 285
    nop

    .line 282
    invoke-static {v2, v9, v3, v4, v1}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->getPreviousAdjustedOffset(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Ljava/util/Comparator;JI)I

    move-result v2

    .line 280
    goto :goto_3

    .line 286
    :cond_7
    move v2, v0

    .line 279
    :goto_3
    move v6, v2

    move v3, v6

    move v6, v0

    .line 290
    .end local v0    # "rawEndHandleOffset":I
    .local v3, "rawStartHandleOffset":I
    .local v6, "rawEndHandleOffset":I
    :goto_4
    move-wide/from16 v18, p4

    .local v18, "$this$isUnspecified$iv":J
    const/4 v0, 0x0

    .line 371
    .local v0, "$i$f$isUnspecified-k-4lQ0M":I
    const-wide v20, 0x7fffffff7fffffffL

    and-long v20, v18, v20

    const-wide v22, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v2, v20, v22

    if-nez v2, :cond_8

    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    .line 290
    .end local v0    # "$i$f$isUnspecified-k-4lQ0M":I
    .end local v18    # "$this$isUnspecified$iv":J
    :goto_5
    if-eqz v2, :cond_9

    const/4 v0, -0x1

    move-wide/from16 v11, p4

    move v9, v0

    goto :goto_6

    .line 292
    :cond_9
    move-wide/from16 v11, p4

    invoke-static {v11, v12, v10}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->getOffsetForPosition-3MmeM6k(JLandroidx/compose/ui/text/TextLayoutResult;)I

    move-result v0

    move v9, v0

    .line 290
    :goto_6
    nop

    .line 289
    nop

    .line 295
    .local v9, "rawPreviousHandleOffset":I
    nop

    .line 296
    nop

    .line 297
    nop

    .line 298
    nop

    .line 299
    nop

    .line 300
    nop

    .line 301
    nop

    .line 302
    nop

    .line 303
    nop

    .line 304
    nop

    .line 295
    move-object/from16 v0, p0

    move-object/from16 v4, v16

    move/from16 v16, v1

    move-wide/from16 v1, p6

    .end local v1    # "textLength":I
    .local v4, "startXHandleDirection":Landroidx/compose/foundation/text/selection/Direction;
    .local v16, "textLength":I
    invoke-virtual/range {v0 .. v10}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->appendInfo(JILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/SelectableInfo;

    .line 306
    return-void
.end method

.method private static final appendSelectableInfo_Parwq6A$otherDirection(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Direction;
    .locals 4
    .param p0, "currentXDirection"    # Landroidx/compose/foundation/text/selection/Direction;
    .param p1, "currentYDirection"    # Landroidx/compose/foundation/text/selection/Direction;
    .param p2, "$this_appendSelectableInfo"    # Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;
    .param p3, "$selectableId"    # J
    .param p5, "anchor"    # Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    .line 238
    if-eqz p5, :cond_0

    move-object v0, p5

    .line 390
    .local v0, "it":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    const/4 v1, 0x0

    .line 238
    .local v1, "$i$a$-let-MultiWidgetSelectionDelegateKt$appendSelectableInfo$otherDirection$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getSelectableId()J

    move-result-wide v2

    invoke-static {p2, v2, v3, p3, p4}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt;->getDirectionById(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;JJ)Landroidx/compose/foundation/text/selection/Direction;

    move-result-object v0

    .end local v0    # "it":Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    .end local v1    # "$i$a$-let-MultiWidgetSelectionDelegateKt$appendSelectableInfo$otherDirection$1":I
    if-nez v0, :cond_1

    .line 239
    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/selection/SelectionLayoutKt;->resolve2dDirection(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Landroidx/compose/foundation/text/selection/Direction;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private static final getDirectionById(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;JJ)Landroidx/compose/foundation/text/selection/Direction;
    .locals 3
    .param p0, "$this$getDirectionById"    # Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;
    .param p1, "anchorSelectableId"    # J
    .param p3, "currentSelectableId"    # J

    .line 342
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;->getSelectableIdOrderingComparator()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    .line 341
    nop

    .line 344
    .local v0, "compareResult":I
    nop

    .line 345
    if-gez v0, :cond_0

    sget-object v1, Landroidx/compose/foundation/text/selection/Direction;->BEFORE:Landroidx/compose/foundation/text/selection/Direction;

    goto :goto_0

    .line 346
    :cond_0
    if-lez v0, :cond_1

    sget-object v1, Landroidx/compose/foundation/text/selection/Direction;->AFTER:Landroidx/compose/foundation/text/selection/Direction;

    goto :goto_0

    .line 347
    :cond_1
    sget-object v1, Landroidx/compose/foundation/text/selection/Direction;->ON:Landroidx/compose/foundation/text/selection/Direction;

    .line 344
    :goto_0
    return-object v1
.end method

.method private static final getOffsetForPosition-3MmeM6k(JLandroidx/compose/ui/text/TextLayoutResult;)I
    .locals 8
    .param p0, "position"    # J
    .param p2, "textLayoutResult"    # Landroidx/compose/ui/text/TextLayoutResult;

    .line 360
    nop

    .line 361
    const/4 v0, 0x0

    .line 384
    .local v0, "$i$f$getY-impl":I
    move-wide v1, p0

    .local v1, "value$iv$iv":J
    const/4 v3, 0x0

    .line 385
    .local v3, "$i$f$unpackFloat2":I
    const-wide v4, 0xffffffffL

    and-long v6, v1, v4

    long-to-int v6, v6

    .local v6, "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 386
    .local v7, "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 385
    .end local v6    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 384
    .end local v1    # "value$iv$iv":J
    .end local v3    # "$i$f$unpackFloat2":I
    nop

    .line 361
    .end local v0    # "$i$f$getY-impl":I
    const/4 v0, 0x0

    cmpg-float v0, v6, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 362
    :cond_0
    const/4 v0, 0x0

    .line 387
    .restart local v0    # "$i$f$getY-impl":I
    move-wide v1, p0

    .restart local v1    # "value$iv$iv":J
    const/4 v3, 0x0

    .line 388
    .restart local v3    # "$i$f$unpackFloat2":I
    and-long/2addr v4, v1

    long-to-int v4, v4

    .local v4, "bits$iv$iv$iv":I
    const/4 v5, 0x0

    .line 389
    .local v5, "$i$f$floatFromBits":I
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 388
    .end local v4    # "bits$iv$iv$iv":I
    .end local v5    # "$i$f$floatFromBits":I
    nop

    .line 387
    .end local v1    # "value$iv$iv":J
    .end local v3    # "$i$f$unpackFloat2":I
    nop

    .line 362
    .end local v0    # "$i$f$getY-impl":I
    invoke-virtual {p2}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/text/MultiParagraph;->getHeight()F

    move-result v0

    cmpl-float v0, v4, v0

    if-ltz v0, :cond_1

    .line 363
    invoke-virtual {p2}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutInput;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->length()I

    move-result v0

    goto :goto_0

    .line 364
    :cond_1
    invoke-virtual {p2, p0, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getOffsetForPosition-k-4lQ0M(J)I

    move-result v0

    .line 365
    :goto_0
    return v0
.end method

.method private static final getPreviousAdjustedOffset(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Ljava/util/Comparator;JI)I
    .locals 2
    .param p0, "$this$getPreviousAdjustedOffset"    # Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;
    .param p1, "selectableIdOrderingComparator"    # Ljava/util/Comparator;
    .param p2, "currentSelectableId"    # J
    .param p4, "currentTextLength"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;",
            "Ljava/util/Comparator<",
            "Ljava/lang/Long;",
            ">;JI)I"
        }
    .end annotation

    .line 314
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getSelectableId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    .line 313
    nop

    .line 316
    .local v0, "compareResult":I
    nop

    .line 317
    if-gez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 318
    :cond_0
    if-lez v0, :cond_1

    move v1, p4

    goto :goto_0

    .line 319
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v1

    .line 316
    :goto_0
    return v1
.end method

.method private static final getXDirection-3MmeM6k(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;
    .locals 7
    .param p0, "position"    # J
    .param p2, "bounds"    # Landroidx/compose/ui/geometry/Rect;

    .line 324
    nop

    .line 325
    const/4 v0, 0x0

    .line 372
    .local v0, "$i$f$getX-impl":I
    move-wide v1, p0

    .local v1, "value$iv$iv":J
    const/4 v3, 0x0

    .line 373
    .local v3, "$i$f$unpackFloat1":I
    const/16 v4, 0x20

    shr-long v5, v1, v4

    long-to-int v5, v5

    .local v5, "bits$iv$iv$iv":I
    const/4 v6, 0x0

    .line 374
    .local v6, "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 373
    .end local v5    # "bits$iv$iv$iv":I
    .end local v6    # "$i$f$floatFromBits":I
    nop

    .line 372
    .end local v1    # "value$iv$iv":J
    .end local v3    # "$i$f$unpackFloat1":I
    nop

    .line 325
    .end local v0    # "$i$f$getX-impl":I
    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_0

    sget-object v0, Landroidx/compose/foundation/text/selection/Direction;->BEFORE:Landroidx/compose/foundation/text/selection/Direction;

    goto :goto_0

    .line 326
    :cond_0
    const/4 v0, 0x0

    .line 375
    .restart local v0    # "$i$f$getX-impl":I
    move-wide v1, p0

    .restart local v1    # "value$iv$iv":J
    const/4 v3, 0x0

    .line 376
    .restart local v3    # "$i$f$unpackFloat1":I
    shr-long v4, v1, v4

    long-to-int v4, v4

    .local v4, "bits$iv$iv$iv":I
    const/4 v5, 0x0

    .line 377
    .local v5, "$i$f$floatFromBits":I
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 376
    .end local v4    # "bits$iv$iv$iv":I
    .end local v5    # "$i$f$floatFromBits":I
    nop

    .line 375
    .end local v1    # "value$iv$iv":J
    .end local v3    # "$i$f$unpackFloat1":I
    nop

    .line 326
    .end local v0    # "$i$f$getX-impl":I
    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_1

    sget-object v0, Landroidx/compose/foundation/text/selection/Direction;->AFTER:Landroidx/compose/foundation/text/selection/Direction;

    goto :goto_0

    .line 327
    :cond_1
    sget-object v0, Landroidx/compose/foundation/text/selection/Direction;->ON:Landroidx/compose/foundation/text/selection/Direction;

    .line 328
    :goto_0
    return-object v0
.end method

.method private static final getYDirection-3MmeM6k(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;
    .locals 8
    .param p0, "position"    # J
    .param p2, "bounds"    # Landroidx/compose/ui/geometry/Rect;

    .line 331
    nop

    .line 332
    const/4 v0, 0x0

    .line 378
    .local v0, "$i$f$getY-impl":I
    move-wide v1, p0

    .local v1, "value$iv$iv":J
    const/4 v3, 0x0

    .line 379
    .local v3, "$i$f$unpackFloat2":I
    const-wide v4, 0xffffffffL

    and-long v6, v1, v4

    long-to-int v6, v6

    .local v6, "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 380
    .local v7, "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 379
    .end local v6    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 378
    .end local v1    # "value$iv$iv":J
    .end local v3    # "$i$f$unpackFloat2":I
    nop

    .line 332
    .end local v0    # "$i$f$getY-impl":I
    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v0

    cmpg-float v0, v6, v0

    if-gez v0, :cond_0

    sget-object v0, Landroidx/compose/foundation/text/selection/Direction;->BEFORE:Landroidx/compose/foundation/text/selection/Direction;

    goto :goto_0

    .line 333
    :cond_0
    const/4 v0, 0x0

    .line 381
    .restart local v0    # "$i$f$getY-impl":I
    move-wide v1, p0

    .restart local v1    # "value$iv$iv":J
    const/4 v3, 0x0

    .line 382
    .restart local v3    # "$i$f$unpackFloat2":I
    and-long/2addr v4, v1

    long-to-int v4, v4

    .local v4, "bits$iv$iv$iv":I
    const/4 v5, 0x0

    .line 383
    .local v5, "$i$f$floatFromBits":I
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 382
    .end local v4    # "bits$iv$iv$iv":I
    .end local v5    # "$i$f$floatFromBits":I
    nop

    .line 381
    .end local v1    # "value$iv$iv":J
    .end local v3    # "$i$f$unpackFloat2":I
    nop

    .line 333
    .end local v0    # "$i$f$getY-impl":I
    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_1

    sget-object v0, Landroidx/compose/foundation/text/selection/Direction;->AFTER:Landroidx/compose/foundation/text/selection/Direction;

    goto :goto_0

    .line 334
    :cond_1
    sget-object v0, Landroidx/compose/foundation/text/selection/Direction;->ON:Landroidx/compose/foundation/text/selection/Direction;

    .line 335
    :goto_0
    return-object v0
.end method

.method private static final isSelected(Landroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)Z
    .locals 1
    .param p0, "currentDirection"    # Landroidx/compose/foundation/text/selection/Direction;
    .param p1, "otherDirection"    # Landroidx/compose/foundation/text/selection/Direction;

    .line 356
    sget-object v0, Landroidx/compose/foundation/text/selection/Direction;->ON:Landroidx/compose/foundation/text/selection/Direction;

    if-eq p0, v0, :cond_1

    if-eq p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
