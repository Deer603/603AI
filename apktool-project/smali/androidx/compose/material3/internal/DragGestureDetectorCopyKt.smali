.class public final Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;
.super Ljava/lang/Object;
.source "DragGestureDetectorCopy.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/internal/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,136:1\n74#1,10:137\n84#1,4:156\n88#1,29:167\n116#2,2:147\n33#2,6:149\n118#2:155\n33#2,6:160\n118#2:166\n116#2,2:196\n33#2,6:198\n118#2:204\n116#2,2:205\n33#2,6:207\n118#2:213\n116#2,2:214\n33#2,6:216\n118#2:222\n158#3:223\n148#3:224\n77#4:225\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/internal/DragGestureDetectorCopyKt\n*L\n42#1:137,10\n42#1:156,4\n42#1:167,29\n42#1:147,2\n42#1:149,6\n42#1:155\n42#1:160,6\n42#1:166\n83#1:196,2\n83#1:198,6\n83#1:204\n87#1:205,2\n87#1:207,6\n87#1:213\n124#1:214,2\n124#1:216,6\n124#1:222\n126#1:223\n127#1:224\n128#1:225\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aa\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0011\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0082H\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 \u001a\u001e\u0010!\u001a\u00020\u0005*\u00020\"2\u0006\u0010\u000b\u001a\u00020\u000cH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006%"
    }
    d2 = {
        "defaultTouchSlop",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "mouseSlop",
        "mouseToTouchSlopRatio",
        "",
        "awaitHorizontalPointerSlopOrCancellation",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "pointerId",
        "Landroidx/compose/ui/input/pointer/PointerId;",
        "pointerType",
        "Landroidx/compose/ui/input/pointer/PointerType;",
        "onPointerSlopReached",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "change",
        "overSlop",
        "",
        "awaitHorizontalPointerSlopOrCancellation-gDDlDlE",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "awaitPointerSlopOrCancellation",
        "getDragDirectionValue",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/geometry/Offset;",
        "awaitPointerSlopOrCancellation-pn7EDYM",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isPointerUp",
        "",
        "Landroidx/compose/ui/input/pointer/PointerEvent;",
        "isPointerUp-DmW0f2w",
        "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z",
        "pointerSlop",
        "Landroidx/compose/ui/platform/ViewConfiguration;",
        "pointerSlop-E8SPZFQ",
        "(Landroidx/compose/ui/platform/ViewConfiguration;I)F",
        "material3_release"
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
.field private static final defaultTouchSlop:F

.field private static final mouseSlop:F

.field private static final mouseToTouchSlopRatio:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 126
    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    .local v0, "$this$dp$iv":D
    const/4 v2, 0x0

    .line 223
    .local v2, "$i$f$getDp":I
    double-to-float v3, v0

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 126
    .end local v0    # "$this$dp$iv":D
    .end local v2    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->mouseSlop:F

    .line 127
    const/16 v0, 0x12

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 224
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 127
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    sput v0, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->defaultTouchSlop:F

    .line 128
    sget v0, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->mouseSlop:F

    .local v0, "arg0$iv":F
    sget v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->defaultTouchSlop:F

    .local v1, "other$iv":F
    const/4 v2, 0x0

    .line 225
    .local v2, "$i$f$div-0680j_4":I
    div-float/2addr v0, v1

    .line 128
    .end local v0    # "arg0$iv":F
    .end local v1    # "other$iv":F
    .end local v2    # "$i$f$div-0680j_4":I
    sput v0, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->mouseToTouchSlopRatio:F

    return-void
.end method

.method public static final awaitHorizontalPointerSlopOrCancellation-gDDlDlE(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "JI",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;

    iget v2, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;

    invoke-direct {v1, v0}, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .local v1, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v0, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->result:Ljava/lang/Object;

    .local v0, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 37
    iget v3, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    const/4 v4, 0x0

    packed-switch v3, :pswitch_data_0

    .end local v0    # "$result":Ljava/lang/Object;
    .end local v1    # "$continuation":Lkotlin/coroutines/Continuation;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v0    # "$result":Ljava/lang/Object;
    .restart local v1    # "$continuation":Lkotlin/coroutines/Continuation;
    :pswitch_0
    const/4 v3, 0x0

    .local v3, "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    iget v5, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$1:F

    .local v5, "totalPositionChange$iv":F
    iget v6, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .local v6, "touchSlop$iv":F
    iget-object v7, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .local v7, "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    iget-object v8, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/Ref$LongRef;

    .local v8, "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    iget-object v9, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .local v9, "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    iget-object v10, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/functions/Function2;

    .local v10, "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v21, v9

    move v9, v3

    move-object/from16 v3, v21

    move/from16 v21, v6

    move v6, v5

    move-object v5, v10

    move-object v10, v8

    move/from16 v8, v21

    goto/16 :goto_7

    .end local v3    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .end local v5    # "totalPositionChange$iv":F
    .end local v6    # "touchSlop$iv":F
    .end local v7    # "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .end local v8    # "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v9    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .end local v10    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    :pswitch_1
    const/4 v3, 0x0

    .restart local v3    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    iget v5, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$1:F

    .restart local v5    # "totalPositionChange$iv":F
    iget v6, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .restart local v6    # "touchSlop$iv":F
    iget-object v7, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/Ref$LongRef;

    .local v7, "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    iget-object v8, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .local v8, "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    iget-object v9, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/functions/Function2;

    .local v9, "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v7

    move v7, v6

    move v6, v5

    move-object v5, v9

    move v9, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v0

    goto :goto_2

    .end local v3    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .end local v5    # "totalPositionChange$iv":F
    .end local v6    # "touchSlop$iv":F
    .end local v7    # "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v8    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .end local v9    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    :pswitch_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p0

    .local v3, "$this$awaitHorizontalPointerSlopOrCancellation_u2dgDDlDlE":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    move-object/from16 v5, p4

    .local v5, "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    move-wide/from16 v6, p1

    .local v6, "pointerId":J
    move/from16 v8, p3

    .line 42
    .local v8, "pointerType":I
    nop

    .local v3, "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    const/4 v9, 0x0

    .line 137
    .local v9, "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    invoke-interface {v3}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    move-result-object v10

    invoke-static {v10, v6, v7}, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 138
    .end local v3    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .end local v5    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .end local v6    # "pointerId":J
    .end local v8    # "pointerType":I
    goto/16 :goto_8

    .line 140
    .restart local v3    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .restart local v5    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .restart local v6    # "pointerId":J
    .restart local v8    # "pointerType":I
    :cond_1
    invoke-interface {v3}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    move-result-object v10

    invoke-static {v10, v8}, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    move-result v8

    .line 141
    .local v8, "touchSlop$iv":F
    new-instance v10, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .local v10, "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    iput-wide v6, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 142
    .end local v6    # "pointerId":J
    const/4 v6, 0x0

    .line 144
    .local v6, "totalPositionChange$iv":F
    :goto_1
    nop

    .line 145
    iput-object v5, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    iput-object v3, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    iput-object v10, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    iput-object v4, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    iput v8, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    iput v6, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$1:F

    const/4 v7, 0x1

    iput v7, v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    invoke-static {v3, v4, v1, v7, v4}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_2

    .line 37
    return-object v2

    .line 145
    :cond_2
    move-object/from16 v21, v1

    move-object v1, v0

    move-object v0, v7

    move v7, v8

    move-object v8, v3

    move-object v3, v2

    move-object/from16 v2, v21

    .line 37
    .end local v0    # "$result":Ljava/lang/Object;
    .end local v3    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .local v1, "$result":Ljava/lang/Object;
    .local v2, "$continuation":Lkotlin/coroutines/Continuation;
    .local v7, "touchSlop$iv":F
    .local v8, "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    :goto_2
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 146
    .local v0, "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    move-result-object v11

    .local v11, "$this$fastFirstOrNull$iv$iv":Ljava/util/List;
    const/4 v12, 0x0

    .line 147
    .local v12, "$i$f$fastFirstOrNull":I
    nop

    .line 148
    nop

    .local v11, "$this$fastForEach$iv$iv$iv":Ljava/util/List;
    const/4 v13, 0x0

    .line 149
    .local v13, "$i$f$fastForEach":I
    nop

    .line 150
    const/4 v14, 0x0

    .local v14, "index$iv$iv$iv":I
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v15

    :goto_3
    if-ge v14, v15, :cond_4

    .line 151
    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 152
    .local v16, "item$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    .local v17, "it$iv$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 148
    .local v18, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv$iv":I
    move-object/from16 v19, v17

    check-cast v19, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .local v19, "it$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    const/16 v20, 0x0

    .line 146
    .local v20, "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$awaitPointerSlopOrCancellation$dragEvent$1$iv":I
    move-object/from16 p0, v5

    .end local v5    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .local p0, "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    move-result-wide v4

    move-object/from16 p2, v0

    move-object/from16 p1, v1

    .end local v0    # "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    .end local v1    # "$result":Ljava/lang/Object;
    .local p1, "$result":Ljava/lang/Object;
    .local p2, "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    iget-wide v0, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v4, v5, v0, v1}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    move-result v0

    .line 148
    .end local v19    # "it$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .end local v20    # "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$awaitPointerSlopOrCancellation$dragEvent$1$iv":I
    if-eqz v0, :cond_3

    goto :goto_4

    .line 152
    .end local v17    # "it$iv$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv$iv":I
    :cond_3
    nop

    .line 150
    .end local v16    # "item$iv$iv$iv":Ljava/lang/Object;
    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x0

    move-object/from16 v5, p0

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    goto :goto_3

    .end local p0    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .end local p1    # "$result":Ljava/lang/Object;
    .end local p2    # "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    .restart local v0    # "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    .restart local v1    # "$result":Ljava/lang/Object;
    .restart local v5    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    :cond_4
    move-object/from16 p2, v0

    move-object/from16 p1, v1

    move-object/from16 p0, v5

    .line 154
    .end local v0    # "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    .end local v1    # "$result":Ljava/lang/Object;
    .end local v5    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .end local v14    # "index$iv$iv$iv":I
    .restart local p0    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .restart local p1    # "$result":Ljava/lang/Object;
    .restart local p2    # "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    nop

    .line 155
    .end local v11    # "$this$fastForEach$iv$iv$iv":Ljava/util/List;
    .end local v13    # "$i$f$fastForEach":I
    const/16 v17, 0x0

    .line 146
    .end local v12    # "$i$f$fastFirstOrNull":I
    :goto_4
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v0, v17

    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 156
    .local v0, "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 157
    .end local v0    # "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .end local v6    # "totalPositionChange$iv":F
    .end local v7    # "touchSlop$iv":F
    .end local v8    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .end local v10    # "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    .end local p0    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .end local p2    # "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    move-object/from16 v0, p1

    move-object v1, v2

    const/4 v4, 0x0

    goto/16 :goto_8

    .line 158
    .restart local v0    # "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .restart local v6    # "totalPositionChange$iv":F
    .restart local v7    # "touchSlop$iv":F
    .restart local v8    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .restart local v10    # "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local p0    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .restart local p2    # "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    :cond_5
    invoke-static {v0}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 159
    .end local v0    # "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    move-result-object v0

    .end local p2    # "event$iv":Landroidx/compose/ui/input/pointer/PointerEvent;
    .local v0, "$this$fastFirstOrNull$iv$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 147
    .local v1, "$i$f$fastFirstOrNull":I
    nop

    .line 148
    nop

    .local v0, "$this$fastForEach$iv$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 160
    .local v4, "$i$f$fastForEach":I
    nop

    .line 161
    const/4 v5, 0x0

    .local v5, "index$iv$iv$iv":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v11

    :goto_5
    if-ge v5, v11, :cond_7

    .line 162
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 163
    .local v12, "item$iv$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it$iv$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 148
    .local v14, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv$iv":I
    move-object v15, v13

    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .local v15, "it$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    const/16 v16, 0x0

    .line 159
    .local v16, "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$awaitPointerSlopOrCancellation$otherDown$1$iv":I
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    move-result v15

    .line 148
    .end local v15    # "it$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .end local v16    # "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$awaitPointerSlopOrCancellation$otherDown$1$iv":I
    if-eqz v15, :cond_6

    goto :goto_6

    .line 163
    .end local v13    # "it$iv$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv$iv":I
    :cond_6
    nop

    .line 161
    .end local v12    # "item$iv$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 165
    .end local v5    # "index$iv$iv$iv":I
    :cond_7
    nop

    .line 166
    .end local v0    # "$this$fastForEach$iv$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    const/4 v13, 0x0

    .line 159
    .end local v1    # "$i$f$fastFirstOrNull":I
    :goto_6
    move-object v0, v13

    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 167
    .local v0, "otherDown$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    if-nez v0, :cond_8

    .line 169
    move-object/from16 v0, p1

    move-object v1, v2

    const/4 v4, 0x0

    goto/16 :goto_8

    .line 171
    :cond_8
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    move-result-wide v4

    iput-wide v4, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    move-object/from16 v5, p0

    move-object/from16 v0, p1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v8

    const/4 v4, 0x0

    move v8, v7

    .end local v0    # "otherDown$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    goto/16 :goto_1

    .line 174
    .local v0, "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    move-result-wide v4

    .line 175
    .local v4, "currentPosition$iv":J
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPosition-F1C5BW0()J

    move-result-wide v11

    .line 177
    .local v11, "previousPosition$iv":J
    nop

    .local v4, "it":J
    const/4 v1, 0x0

    .line 46
    .local v1, "$i$a$-awaitPointerSlopOrCancellation-pn7EDYM-DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$2":I
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v1

    .line 177
    .end local v1    # "$i$a$-awaitPointerSlopOrCancellation-pn7EDYM-DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$2":I
    .end local v4    # "it":J
    nop

    .local v11, "it":J
    const/4 v4, 0x0

    .line 46
    .local v4, "$i$a$-awaitPointerSlopOrCancellation-pn7EDYM-DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$2":I
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v4

    .line 177
    .end local v4    # "$i$a$-awaitPointerSlopOrCancellation-pn7EDYM-DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$2":I
    .end local v11    # "it":J
    sub-float/2addr v1, v4

    .line 176
    nop

    .line 178
    .local v1, "positionChange$iv":F
    add-float v5, v6, v1

    .line 180
    .end local v1    # "positionChange$iv":F
    .end local v6    # "totalPositionChange$iv":F
    .local v5, "totalPositionChange$iv":F
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 181
    .local v1, "inDirection$iv":F
    cmpg-float v4, v1, v7

    if-gez v4, :cond_c

    .line 183
    .end local v1    # "inDirection$iv":F
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    move-object/from16 v4, p0

    .end local p0    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .local v4, "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    iput-object v4, v2, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    iput-object v10, v2, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    iput-object v0, v2, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    iput v7, v2, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    iput v5, v2, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->F$1:F

    const/4 v6, 0x2

    iput v6, v2, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    invoke-interface {v8, v1, v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    .line 37
    return-object v3

    .line 183
    :cond_a
    move-object v1, v2

    move-object v2, v3

    move v6, v5

    move-object v3, v8

    move-object v5, v4

    move v8, v7

    move-object v7, v0

    move-object/from16 v0, p1

    .line 184
    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v4    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    .local v1, "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v3    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .local v5, "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .restart local v6    # "totalPositionChange$iv":F
    .local v7, "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .local v8, "touchSlop$iv":F
    :goto_7
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 185
    .end local v3    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .end local v5    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .end local v6    # "totalPositionChange$iv":F
    .end local v8    # "touchSlop$iv":F
    .end local v10    # "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    const/4 v4, 0x0

    goto :goto_8

    .line 184
    .restart local v3    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .restart local v5    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .restart local v6    # "totalPositionChange$iv":F
    .restart local v8    # "touchSlop$iv":F
    .restart local v10    # "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    :cond_b
    const/4 v4, 0x0

    goto/16 :goto_1

    .line 181
    .end local v3    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .end local v6    # "totalPositionChange$iv":F
    .local v0, "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .local v1, "inDirection$iv":F
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v5, "totalPositionChange$iv":F
    .local v7, "touchSlop$iv":F
    .local v8, "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .restart local p0    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_c
    move-object/from16 v4, p0

    .line 188
    .end local v1    # "inDirection$iv":F
    .end local p0    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .restart local v4    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    nop

    .line 189
    nop

    .line 190
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v1

    .end local v5    # "totalPositionChange$iv":F
    mul-float/2addr v1, v7

    sub-float/2addr v5, v1

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v1

    .line 188
    invoke-interface {v4, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 193
    .end local v4    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .end local v7    # "touchSlop$iv":F
    .end local v8    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .end local v10    # "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    move-object v4, v0

    move-object v1, v2

    move-object/from16 v0, p1

    .line 47
    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v9    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    .local v1, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_8
    return-object v4

    .line 195
    .end local v1    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v0, "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v4    # "onPointerSlopReached":Lkotlin/jvm/functions/Function2;
    .restart local v7    # "touchSlop$iv":F
    .restart local v8    # "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv":Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .restart local v9    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .restart local v10    # "pointer$iv":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_d
    const/4 v6, 0x0

    move-object/from16 v0, p1

    move-object v1, v2

    move-object v2, v3

    move-object v5, v4

    move-object v3, v8

    const/4 v4, 0x0

    move v8, v7

    .end local v0    # "dragEvent$iv":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .restart local v6    # "totalPositionChange$iv":F
    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final awaitPointerSlopOrCancellation-pn7EDYM(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 25
    .param p0, "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM"    # Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    .param p1, "pointerId"    # J
    .param p3, "pointerType"    # I
    .param p4, "onPointerSlopReached"    # Lkotlin/jvm/functions/Function2;
    .param p5, "getDragDirectionValue"    # Lkotlin/jvm/functions/Function1;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "JI",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    const/4 v5, 0x0

    .line 74
    .local v5, "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    invoke-interface {v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    move-result-object v6

    invoke-static {v6, v1, v2}, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    .line 75
    return-object v7

    .line 77
    :cond_0
    invoke-interface {v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    move-result-object v6

    move/from16 v8, p3

    invoke-static {v6, v8}, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    move-result v6

    .line 78
    .local v6, "touchSlop":F
    new-instance v9, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .local v9, "pointer":Lkotlin/jvm/internal/Ref$LongRef;
    iput-wide v1, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 79
    const/4 v10, 0x0

    .line 81
    .local v10, "totalPositionChange":F
    :goto_0
    nop

    .line 82
    const/4 v11, 0x1

    invoke-static {v0, v7, v4, v11, v7}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 83
    .local v11, "event":Landroidx/compose/ui/input/pointer/PointerEvent;
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    move-result-object v12

    .local v12, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v13, 0x0

    .line 196
    .local v13, "$i$f$fastFirstOrNull":I
    nop

    .line 197
    move-object v14, v12

    .local v14, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v15, 0x0

    .line 198
    .local v15, "$i$f$fastForEach":I
    nop

    .line 199
    const/16 v16, 0x0

    move-object/from16 v17, v7

    .local v16, "index$iv$iv":I
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v7

    move/from16 v1, v16

    .end local v16    # "index$iv$iv":I
    .local v1, "index$iv$iv":I
    :goto_1
    if-ge v1, v7, :cond_2

    .line 200
    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 201
    .local v2, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v2

    .local v16, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 197
    .local v18, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v19, v16

    check-cast v19, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .local v19, "it":Landroidx/compose/ui/input/pointer/PointerInputChange;
    const/16 v20, 0x0

    .line 83
    .local v20, "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$awaitPointerSlopOrCancellation$dragEvent$1":I
    move/from16 v21, v1

    move-object/from16 v22, v2

    .end local v1    # "index$iv$iv":I
    .end local v2    # "item$iv$iv":Ljava/lang/Object;
    .local v21, "index$iv$iv":I
    .local v22, "item$iv$iv":Ljava/lang/Object;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    move-result-wide v1

    move/from16 v23, v5

    move/from16 v24, v6

    .end local v5    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .end local v6    # "touchSlop":F
    .local v23, "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .local v24, "touchSlop":F
    iget-wide v5, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v1, v2, v5, v6}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    move-result v1

    .end local v19    # "it":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .end local v20    # "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$awaitPointerSlopOrCancellation$dragEvent$1":I
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 197
    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 201
    .end local v16    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_1
    nop

    .line 199
    .end local v22    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v1, v21, 0x1

    move/from16 v5, v23

    move/from16 v6, v24

    .end local v21    # "index$iv$iv":I
    .restart local v1    # "index$iv$iv":I
    goto :goto_1

    .end local v23    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .end local v24    # "touchSlop":F
    .restart local v5    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .restart local v6    # "touchSlop":F
    :cond_2
    move/from16 v21, v1

    move/from16 v23, v5

    move/from16 v24, v6

    .line 203
    .end local v1    # "index$iv$iv":I
    .end local v5    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .end local v6    # "touchSlop":F
    .restart local v23    # "$i$f$awaitPointerSlopOrCancellation-pn7EDYM":I
    .restart local v24    # "touchSlop":F
    nop

    .line 204
    .end local v14    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v15    # "$i$f$fastForEach":I
    move-object/from16 v16, v17

    .line 83
    .end local v12    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v13    # "$i$f$fastFirstOrNull":I
    :goto_2
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v1, v16

    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 84
    .local v1, "dragEvent":Landroidx/compose/ui/input/pointer/PointerInputChange;
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 85
    return-object v17

    .line 86
    :cond_3
    invoke-static {v1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 87
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    move-result-object v2

    .local v2, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v5, 0x0

    .line 205
    .local v5, "$i$f$fastFirstOrNull":I
    nop

    .line 206
    move-object v6, v2

    .local v6, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v7, 0x0

    .line 207
    .local v7, "$i$f$fastForEach":I
    nop

    .line 208
    const/4 v12, 0x0

    .local v12, "index$iv$iv":I
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v13

    :goto_3
    if-ge v12, v13, :cond_5

    .line 209
    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 210
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 206
    .local v16, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object/from16 v18, v15

    check-cast v18, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .local v18, "it":Landroidx/compose/ui/input/pointer/PointerInputChange;
    const/16 v19, 0x0

    .line 87
    .local v19, "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$awaitPointerSlopOrCancellation$otherDown$1":I
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    move-result v20

    .end local v18    # "it":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .end local v19    # "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$awaitPointerSlopOrCancellation$otherDown$1":I
    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    .line 206
    move-object/from16 v19, v18

    check-cast v19, Ljava/lang/Boolean;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    if-eqz v18, :cond_4

    goto :goto_4

    .line 210
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_4
    nop

    .line 208
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 212
    .end local v12    # "index$iv$iv":I
    :cond_5
    nop

    .line 213
    .end local v6    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v7    # "$i$f$fastForEach":I
    move-object/from16 v15, v17

    .line 87
    .end local v2    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v5    # "$i$f$fastFirstOrNull":I
    :goto_4
    move-object v2, v15

    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 88
    .local v2, "otherDown":Landroidx/compose/ui/input/pointer/PointerInputChange;
    if-nez v2, :cond_6

    .line 90
    return-object v17

    .line 92
    :cond_6
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    move-result-wide v5

    iput-wide v5, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    move-object/from16 v15, p4

    .end local v2    # "otherDown":Landroidx/compose/ui/input/pointer/PointerInputChange;
    goto :goto_5

    .line 95
    :cond_7
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    move-result-wide v5

    .line 96
    .local v5, "currentPosition":J
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPosition-F1C5BW0()J

    move-result-wide v12

    .line 98
    .local v12, "previousPosition":J
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v2

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v12, v13}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v7

    invoke-interface {v3, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    sub-float/2addr v2, v7

    .line 97
    nop

    .line 99
    .local v2, "positionChange":F
    add-float/2addr v10, v2

    .line 101
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v7

    .line 102
    .local v7, "inDirection":F
    cmpg-float v14, v7, v24

    if-gez v14, :cond_9

    .line 104
    sget-object v14, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    invoke-interface {v0, v14, v4}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 105
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result v14

    if-eqz v14, :cond_8

    .line 106
    return-object v17

    :cond_8
    move-object/from16 v15, p4

    goto :goto_5

    .line 109
    :cond_9
    nop

    .line 110
    nop

    .line 111
    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    move-result v14

    mul-float v14, v14, v24

    sub-float v14, v10, v14

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    .line 109
    move-object/from16 v15, p4

    invoke-interface {v15, v1, v14}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    move-result v14

    if-eqz v14, :cond_a

    .line 114
    return-object v1

    .line 116
    :cond_a
    const/4 v10, 0x0

    .end local v1    # "dragEvent":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .end local v2    # "positionChange":F
    .end local v5    # "currentPosition":J
    .end local v7    # "inDirection":F
    .end local v11    # "event":Landroidx/compose/ui/input/pointer/PointerEvent;
    .end local v12    # "previousPosition":J
    :goto_5
    move-wide/from16 v1, p1

    move-object/from16 v7, v17

    move/from16 v5, v23

    move/from16 v6, v24

    goto/16 :goto_0
.end method

.method private static final isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z
    .locals 13
    .param p0, "$this$isPointerUp_u2dDmW0f2w"    # Landroidx/compose/ui/input/pointer/PointerEvent;
    .param p1, "pointerId"    # J

    .line 124
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    move-result-object v0

    .local v0, "$this$fastFirstOrNull$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 214
    .local v1, "$i$f$fastFirstOrNull":I
    nop

    .line 215
    move-object v2, v0

    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 216
    .local v3, "$i$f$fastForEach":I
    nop

    .line 217
    const/4 v4, 0x0

    .local v4, "index$iv$iv":I
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_1

    .line 218
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 219
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    .local v7, "it$iv":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 215
    .local v8, "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    move-object v9, v7

    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .local v9, "it":Landroidx/compose/ui/input/pointer/PointerInputChange;
    const/4 v10, 0x0

    .line 124
    .local v10, "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$isPointerUp$1":I
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    move-result-wide v11

    invoke-static {v11, v12, p1, p2}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    move-result v9

    .line 215
    .end local v9    # "it":Landroidx/compose/ui/input/pointer/PointerInputChange;
    .end local v10    # "$i$a$-fastFirstOrNull-DragGestureDetectorCopyKt$isPointerUp$1":I
    if-eqz v9, :cond_0

    goto :goto_1

    .line 219
    .end local v7    # "it$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-fastForEach-ListUtilsKt$fastFirstOrNull$2$iv":I
    :cond_0
    nop

    .line 217
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 221
    .end local v4    # "index$iv$iv":I
    :cond_1
    nop

    .line 222
    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    const/4 v7, 0x0

    .line 124
    .end local v0    # "$this$fastFirstOrNull$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastFirstOrNull":I
    :goto_1
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    move-result v2

    if-ne v2, v1, :cond_2

    move v0, v1

    :cond_2
    xor-int/2addr v0, v1

    return v0
.end method

.method public static final pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F
    .locals 2
    .param p0, "$this$pointerSlop_u2dE8SPZFQ"    # Landroidx/compose/ui/platform/ViewConfiguration;
    .param p1, "pointerType"    # I

    .line 131
    nop

    .line 132
    sget-object v0, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getMouse-T8wyACA()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    move-result v0

    sget v1, Landroidx/compose/material3/internal/DragGestureDetectorCopyKt;->mouseToTouchSlopRatio:F

    mul-float/2addr v0, v1

    goto :goto_0

    .line 133
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    move-result v0

    .line 131
    :goto_0
    return v0
.end method
