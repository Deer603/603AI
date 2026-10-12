.class public final Landroidx/compose/ui/scrollcapture/ScrollCapture_androidKt;
.super Ljava/lang/Object;
.source "ScrollCapture.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,237:1\n203#1:238\n204#1:242\n205#1:244\n206#1:246\n207#1:248\n208#1,5:256\n1101#2:239\n1083#2,2:240\n1101#2:261\n1083#2,2:262\n136#3:243\n519#3:245\n44#3:247\n136#3:264\n519#3:265\n44#3:266\n136#3:267\n76#4,7:249\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n*L\n133#1:238\n133#1:242\n133#1:244\n133#1:246\n133#1:248\n133#1:256,5\n133#1:239\n133#1:240,2\n203#1:261\n203#1:262,2\n133#1:243\n133#1:245\n133#1:247\n204#1:264\n205#1:265\n206#1:266\n209#1:267\n143#1:249,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\u001a.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u0015H\u0002\u001a\u0012\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0018*\u00020\u0002H\u0002\u001a!\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0015H\u0082\u0008\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"E\u0010\u0005\u001a/\u0008\u0001\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0018\u00010\u0006*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "canScrollVertically",
        "",
        "Landroidx/compose/ui/semantics/SemanticsNode;",
        "getCanScrollVertically",
        "(Landroidx/compose/ui/semantics/SemanticsNode;)Z",
        "scrollCaptureScrollByAction",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/geometry/Offset;",
        "Lkotlin/ParameterName;",
        "name",
        "offset",
        "Lkotlin/coroutines/Continuation;",
        "",
        "getScrollCaptureScrollByAction",
        "(Landroidx/compose/ui/semantics/SemanticsNode;)Lkotlin/jvm/functions/Function2;",
        "visitScrollCaptureCandidates",
        "",
        "fromNode",
        "depth",
        "",
        "onCandidate",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;",
        "getChildrenForSearch",
        "",
        "visitDescendants",
        "onNode",
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
.method private static final getCanScrollVertically(Landroidx/compose/ui/semantics/SemanticsNode;)Z
    .locals 4
    .param p0, "$this$canScrollVertically"    # Landroidx/compose/ui/semantics/SemanticsNode;

    .line 189
    invoke-static {p0}, Landroidx/compose/ui/scrollcapture/ScrollCapture_androidKt;->getScrollCaptureScrollByAction(Landroidx/compose/ui/semantics/SemanticsNode;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 190
    .local v0, "scrollByOffset":Lkotlin/jvm/functions/Function2;
    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsNode;->getUnmergedConfig$ui_release()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    invoke-virtual {v2}, Landroidx/compose/ui/semantics/SemanticsProperties;->getVerticalScrollAxisRange()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/ui/semantics/SemanticsConfigurationKt;->getOrNull(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/semantics/ScrollAxisRange;

    .line 191
    .local v1, "verticalScrollAxisRange":Landroidx/compose/ui/semantics/ScrollAxisRange;
    if-eqz v0, :cond_0

    .line 192
    if-eqz v1, :cond_0

    .line 193
    invoke-virtual {v1}, Landroidx/compose/ui/semantics/ScrollAxisRange;->getMaxValue()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 191
    :goto_0
    return v2
.end method

.method private static final getChildrenForSearch(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/util/List;
    .locals 1
    .param p0, "$this$getChildrenForSearch"    # Landroidx/compose/ui/semantics/SemanticsNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/semantics/SemanticsNode;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/ui/semantics/SemanticsNode;",
            ">;"
        }
    .end annotation

    .line 215
    nop

    .line 217
    nop

    .line 218
    nop

    .line 216
    nop

    .line 215
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0}, Landroidx/compose/ui/semantics/SemanticsNode;->getChildren$ui_release(ZZZ)Ljava/util/List;

    move-result-object v0

    .line 219
    return-object v0
.end method

.method public static final getScrollCaptureScrollByAction(Landroidx/compose/ui/semantics/SemanticsNode;)Lkotlin/jvm/functions/Function2;
    .locals 2
    .param p0, "$this$scrollCaptureScrollByAction"    # Landroidx/compose/ui/semantics/SemanticsNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/semantics/SemanticsNode;",
            ")",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 185
    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsNode;->getUnmergedConfig$ui_release()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/semantics/SemanticsActions;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;

    invoke-virtual {v1}, Landroidx/compose/ui/semantics/SemanticsActions;->getScrollByOffset()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/ui/semantics/SemanticsConfigurationKt;->getOrNull(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method private static final visitDescendants(Landroidx/compose/ui/semantics/SemanticsNode;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .param p0, "$this$visitDescendants"    # Landroidx/compose/ui/semantics/SemanticsNode;
    .param p1, "onNode"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/semantics/SemanticsNode;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/semantics/SemanticsNode;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 203
    .local v0, "$i$f$visitDescendants":I
    const/4 v1, 0x0

    .line 261
    .local v1, "$i$f$mutableVectorOf":I
    nop

    .line 262
    const/16 v2, 0x10

    .local v2, "capacity$iv$iv":I
    const/4 v3, 0x0

    .line 263
    .local v3, "$i$f$MutableVector":I
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    new-array v5, v2, [Landroidx/compose/ui/semantics/SemanticsNode;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 261
    .end local v2    # "capacity$iv$iv":I
    .end local v3    # "$i$f$MutableVector":I
    nop

    .line 203
    .end local v1    # "$i$f$mutableVectorOf":I
    nop

    .line 204
    .local v4, "nodes":Landroidx/compose/runtime/collection/MutableVector;
    invoke-static {p0}, Landroidx/compose/ui/scrollcapture/ScrollCapture_androidKt;->getChildrenForSearch(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/util/List;

    move-result-object v1

    .local v1, "elements$iv":Ljava/util/List;
    move-object v2, v4

    .local v2, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v3, 0x0

    .line 264
    .local v3, "$i$f$addAll":I
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v5

    invoke-virtual {v2, v5, v1}, Landroidx/compose/runtime/collection/MutableVector;->addAll(ILjava/util/List;)Z

    .line 205
    .end local v1    # "elements$iv":Ljava/util/List;
    .end local v2    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v3    # "$i$f$addAll":I
    :cond_0
    :goto_0
    move-object v1, v4

    .local v1, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v2, 0x0

    .line 265
    .local v2, "$i$f$isNotEmpty":I
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    move v1, v5

    goto :goto_1

    :cond_1
    move v1, v6

    .end local v1    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "$i$f$isNotEmpty":I
    :goto_1
    if-eqz v1, :cond_2

    .line 206
    move-object v1, v4

    .restart local v1    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v2, 0x0

    .line 266
    .local v2, "$i$f$getLastIndex":I
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v3

    sub-int/2addr v3, v5

    .line 206
    .end local v1    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "$i$f$getLastIndex":I
    invoke-virtual {v4, v3}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/semantics/SemanticsNode;

    .line 207
    .local v1, "node":Landroidx/compose/ui/semantics/SemanticsNode;
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 208
    .local v2, "visitChildren":Z
    if-eqz v2, :cond_0

    .line 209
    invoke-static {v1}, Landroidx/compose/ui/scrollcapture/ScrollCapture_androidKt;->getChildrenForSearch(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/util/List;

    move-result-object v3

    .local v3, "elements$iv":Ljava/util/List;
    move-object v5, v4

    .local v5, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v7, 0x0

    .line 267
    .local v7, "$i$f$addAll":I
    invoke-virtual {v5}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v8

    invoke-virtual {v5, v8, v3}, Landroidx/compose/runtime/collection/MutableVector;->addAll(ILjava/util/List;)Z

    .end local v3    # "elements$iv":Ljava/util/List;
    .end local v5    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v7    # "$i$f$addAll":I
    goto :goto_0

    .line 212
    .end local v1    # "node":Landroidx/compose/ui/semantics/SemanticsNode;
    .end local v2    # "visitChildren":Z
    :cond_2
    return-void
.end method

.method private static final visitScrollCaptureCandidates(Landroidx/compose/ui/semantics/SemanticsNode;ILkotlin/jvm/functions/Function1;)V
    .locals 11
    .param p0, "fromNode"    # Landroidx/compose/ui/semantics/SemanticsNode;
    .param p1, "depth"    # I
    .param p2, "onCandidate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/semantics/SemanticsNode;",
            "I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 133
    move-object v0, p0

    .local v0, "$this$visitDescendants$iv":Landroidx/compose/ui/semantics/SemanticsNode;
    const/4 v1, 0x0

    .line 238
    .local v1, "$i$f$visitDescendants":I
    const/4 v2, 0x0

    .line 239
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 240
    const/16 v3, 0x10

    .local v3, "capacity$iv$iv$iv":I
    const/4 v4, 0x0

    .line 241
    .local v4, "$i$f$MutableVector":I
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    new-array v6, v3, [Landroidx/compose/ui/semantics/SemanticsNode;

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 239
    .end local v3    # "capacity$iv$iv$iv":I
    .end local v4    # "$i$f$MutableVector":I
    nop

    .line 238
    .end local v2    # "$i$f$mutableVectorOf":I
    nop

    .line 242
    .local v5, "nodes$iv":Landroidx/compose/runtime/collection/MutableVector;
    invoke-static {v0}, Landroidx/compose/ui/scrollcapture/ScrollCapture_androidKt;->getChildrenForSearch(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/util/List;

    move-result-object v2

    .local v2, "elements$iv$iv":Ljava/util/List;
    move-object v3, v5

    .local v3, "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v4, 0x0

    .line 243
    .local v4, "$i$f$addAll":I
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v6

    invoke-virtual {v3, v6, v2}, Landroidx/compose/runtime/collection/MutableVector;->addAll(ILjava/util/List;)Z

    .line 244
    .end local v2    # "elements$iv$iv":Ljava/util/List;
    .end local v3    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v4    # "$i$f$addAll":I
    :cond_0
    :goto_0
    move-object v2, v5

    .local v2, "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v3, 0x0

    .line 245
    .local v3, "$i$f$isNotEmpty":I
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    move v2, v6

    goto :goto_1

    :cond_1
    move v2, v7

    .end local v2    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v3    # "$i$f$isNotEmpty":I
    :goto_1
    if-eqz v2, :cond_7

    .line 246
    move-object v2, v5

    .restart local v2    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v3, 0x0

    .line 247
    .local v3, "$i$f$getLastIndex":I
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v4

    sub-int/2addr v4, v6

    .line 246
    .end local v2    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v3    # "$i$f$getLastIndex":I
    invoke-virtual {v5, v4}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/semantics/SemanticsNode;

    .line 248
    .local v2, "node$iv":Landroidx/compose/ui/semantics/SemanticsNode;
    move-object v3, v2

    .local v3, "node":Landroidx/compose/ui/semantics/SemanticsNode;
    const/4 v4, 0x0

    .line 138
    .local v4, "$i$a$-visitDescendants-ScrollCapture_androidKt$visitScrollCaptureCandidates$1":I
    invoke-static {v3}, Landroidx/compose/ui/platform/SemanticsUtils_androidKt;->isHidden(Landroidx/compose/ui/semantics/SemanticsNode;)Z

    move-result v8

    if-nez v8, :cond_6

    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsNode;->getUnmergedConfig$ui_release()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v8

    sget-object v9, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    invoke-virtual {v9}, Landroidx/compose/ui/semantics/SemanticsProperties;->getDisabled()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    .line 143
    :cond_2
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsNode;->findCoordinatorToGetBounds$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v8

    .local v8, "value$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 249
    .local v9, "$i$f$checkPreconditionNotNull":I
    nop

    .line 251
    if-eqz v8, :cond_5

    .line 255
    nop

    .line 146
    .end local v8    # "value$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$checkPreconditionNotNull":I
    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeCoordinator;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v8

    .line 142
    nop

    .line 150
    .local v8, "nodeCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->boundsInWindow(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v9

    invoke-static {v9}, Landroidx/compose/ui/unit/IntRectKt;->roundToIntRect(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/unit/IntRect;

    move-result-object v9

    .line 151
    .local v9, "viewportBoundsInWindow":Landroidx/compose/ui/unit/IntRect;
    invoke-virtual {v9}, Landroidx/compose/ui/unit/IntRect;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_3

    .line 152
    move v6, v7

    goto :goto_3

    .line 158
    :cond_3
    invoke-static {v3}, Landroidx/compose/ui/scrollcapture/ScrollCapture_androidKt;->getCanScrollVertically(Landroidx/compose/ui/semantics/SemanticsNode;)Z

    move-result v10

    if-nez v10, :cond_4

    .line 160
    goto :goto_3

    .line 165
    :cond_4
    add-int/lit8 v6, p1, 0x1

    .line 166
    .local v6, "candidateDepth":I
    nop

    .line 167
    new-instance v10, Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;

    .line 168
    nop

    .line 169
    nop

    .line 170
    nop

    .line 171
    nop

    .line 167
    invoke-direct {v10, v3, v6, v9, v8}, Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;-><init>(Landroidx/compose/ui/semantics/SemanticsNode;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 166
    invoke-interface {p2, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    nop

    .line 176
    nop

    .line 177
    nop

    .line 174
    invoke-static {v3, v6, p2}, Landroidx/compose/ui/scrollcapture/ScrollCapture_androidKt;->visitScrollCaptureCandidates(Landroidx/compose/ui/semantics/SemanticsNode;ILkotlin/jvm/functions/Function1;)V

    .line 180
    move v6, v7

    goto :goto_3

    .line 252
    .end local v6    # "candidateDepth":I
    .local v8, "value$iv":Ljava/lang/Object;
    .local v9, "$i$f$checkPreconditionNotNull":I
    :cond_5
    const/4 v6, 0x0

    .line 144
    .local v6, "$i$a$-checkPreconditionNotNull-ScrollCapture_androidKt$visitScrollCaptureCandidates$1$nodeCoordinates$1":I
    nop

    .line 252
    .end local v6    # "$i$a$-checkPreconditionNotNull-ScrollCapture_androidKt$visitScrollCaptureCandidates$1$nodeCoordinates$1":I
    const-string v6, "Expected semantics node to have a coordinator."

    invoke-static {v6}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v6, Lkotlin/KotlinNothingValueException;

    invoke-direct {v6}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v6

    .line 139
    .end local v8    # "value$iv":Ljava/lang/Object;
    .end local v9    # "$i$f$checkPreconditionNotNull":I
    :cond_6
    :goto_2
    move v6, v7

    .line 248
    .end local v3    # "node":Landroidx/compose/ui/semantics/SemanticsNode;
    .end local v4    # "$i$a$-visitDescendants-ScrollCapture_androidKt$visitScrollCaptureCandidates$1":I
    :goto_3
    nop

    .line 256
    .local v6, "visitChildren$iv":Z
    if-eqz v6, :cond_0

    .line 257
    invoke-static {v2}, Landroidx/compose/ui/scrollcapture/ScrollCapture_androidKt;->getChildrenForSearch(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/util/List;

    move-result-object v3

    .local v3, "elements$iv$iv":Ljava/util/List;
    move-object v4, v5

    .local v4, "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v8, 0x0

    .line 243
    .local v8, "$i$f$addAll":I
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v9

    invoke-virtual {v4, v9, v3}, Landroidx/compose/runtime/collection/MutableVector;->addAll(ILjava/util/List;)Z

    .end local v3    # "elements$iv$iv":Ljava/util/List;
    .end local v4    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v8    # "$i$f$addAll":I
    goto/16 :goto_0

    .line 260
    .end local v2    # "node$iv":Landroidx/compose/ui/semantics/SemanticsNode;
    .end local v6    # "visitChildren$iv":Z
    :cond_7
    nop

    .line 182
    .end local v0    # "$this$visitDescendants$iv":Landroidx/compose/ui/semantics/SemanticsNode;
    .end local v1    # "$i$f$visitDescendants":I
    .end local v5    # "nodes$iv":Landroidx/compose/runtime/collection/MutableVector;
    return-void
.end method

.method static synthetic visitScrollCaptureCandidates$default(Landroidx/compose/ui/semantics/SemanticsNode;ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    .line 128
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 130
    const/4 p1, 0x0

    .line 128
    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/scrollcapture/ScrollCapture_androidKt;->visitScrollCaptureCandidates(Landroidx/compose/ui/semantics/SemanticsNode;ILkotlin/jvm/functions/Function1;)V

    return-void
.end method
