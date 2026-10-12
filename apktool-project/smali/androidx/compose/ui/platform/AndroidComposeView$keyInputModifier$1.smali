.class final Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;
.super Lkotlin/jvm/internal/Lambda;
.source "AndroidComposeView.android.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/AndroidComposeView;-><init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3125:1\n1#2:3126\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "keyEvent",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "invoke-ZmokQxo",
        "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"
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
.field final synthetic this$0:Landroidx/compose/ui/platform/AndroidComposeView;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 428
    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/input/key/KeyEvent;

    invoke-virtual {v0}, Landroidx/compose/ui/input/key/KeyEvent;->unbox-impl()Landroid/view/KeyEvent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 16
    .param p1, "keyEvent"    # Landroid/view/KeyEvent;

    .line 429
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusDirection-P8AzH3I(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;

    move-result-object v1

    .line 430
    .local v1, "focusDirection":Landroidx/compose/ui/focus/FocusDirection;
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v1, :cond_b

    invoke-static {v2}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    move-result v5

    sget-object v6, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyDown-CS__XNY()I

    move-result v6

    invoke-static {v5, v6}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_4

    .line 432
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection;->unbox-impl()I

    move-result v5

    invoke-static {v5}, Landroidx/compose/ui/focus/FocusInteropUtils_androidKt;->toAndroidFocusDirection-3ESFkO8(I)Ljava/lang/Integer;

    move-result-object v5

    .line 435
    .local v5, "androidDirection":Ljava/lang/Integer;
    sget-boolean v6, Landroidx/compose/ui/ComposeUiFlags;->isViewFocusFixEnabled:Z

    const/4 v7, 0x1

    if-eqz v6, :cond_1

    .line 436
    iget-object v6, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v6}, Landroidx/compose/ui/platform/AndroidComposeView;->hasFocus()Z

    move-result v6

    if-eqz v6, :cond_1

    if-eqz v5, :cond_1

    .line 439
    iget-object v6, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection;->unbox-impl()I

    move-result v8

    invoke-static {v6, v8}, Landroidx/compose/ui/platform/AndroidComposeView;->access$onMoveFocusInChildren-3ESFkO8(Landroidx/compose/ui/platform/AndroidComposeView;I)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    return-object v3

    .line 442
    :cond_1
    iget-object v6, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-static {v6}, Landroidx/compose/ui/platform/AndroidComposeView;->access$onFetchFocusRect(Landroidx/compose/ui/platform/AndroidComposeView;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v6

    .line 447
    .local v6, "focusedRect":Landroidx/compose/ui/geometry/Rect;
    iget-object v8, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v8}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    move-result-object v8

    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection;->unbox-impl()I

    move-result v9

    new-instance v10, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1;

    invoke-direct {v10, v1}, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1;-><init>(Landroidx/compose/ui/focus/FocusDirection;)V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-interface {v8, v9, v6, v10}, Landroidx/compose/ui/focus/FocusOwner;->focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_0

    .line 449
    :cond_2
    move v8, v7

    .line 447
    :goto_0
    nop

    .line 446
    nop

    .line 450
    .local v8, "focusWasMovedOrCancelled":Z
    if-eqz v8, :cond_3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    return-object v3

    .line 456
    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection;->unbox-impl()I

    move-result v9

    invoke-static {v9}, Landroidx/compose/ui/focus/FocusOwnerImplKt;->is1dFocusSearch-3ESFkO8(I)Z

    move-result v9

    if-nez v9, :cond_4

    return-object v4

    .line 463
    :cond_4
    if-eqz v5, :cond_8

    .line 464
    iget-object v9, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static {v9, v10}, Landroidx/compose/ui/platform/AndroidComposeView;->access$findNextNonChildView(Landroidx/compose/ui/platform/AndroidComposeView;I)Landroid/view/View;

    move-result-object v9

    iget-object v10, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    move-object v11, v9

    .line 3126
    .local v11, "it":Landroid/view/View;
    const/4 v12, 0x0

    .line 464
    .local v12, "$i$a$-takeIf-AndroidComposeView$keyInputModifier$1$nextView$1":I
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    .end local v11    # "it":Landroid/view/View;
    .end local v12    # "$i$a$-takeIf-AndroidComposeView$keyInputModifier$1$nextView$1":I
    if-nez v10, :cond_5

    goto :goto_1

    :cond_5
    const/4 v9, 0x0

    .line 465
    .local v9, "nextView":Landroid/view/View;
    :goto_1
    if-eqz v9, :cond_8

    .line 466
    if-eqz v6, :cond_6

    invoke-static {v6}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toAndroidRect(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;

    move-result-object v10

    goto :goto_2

    :cond_6
    const/4 v10, 0x0

    :goto_2
    if-eqz v10, :cond_7

    .line 467
    .local v10, "androidRect":Landroid/graphics/Rect;
    iget-object v11, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-static {v11}, Landroidx/compose/ui/platform/AndroidComposeView;->access$getTmpPositionArray$p(Landroidx/compose/ui/platform/AndroidComposeView;)[I

    move-result-object v11

    invoke-virtual {v9, v11}, Landroid/view/View;->getLocationInWindow([I)V

    .line 468
    iget-object v11, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-static {v11}, Landroidx/compose/ui/platform/AndroidComposeView;->access$getTmpPositionArray$p(Landroidx/compose/ui/platform/AndroidComposeView;)[I

    move-result-object v11

    aget v11, v11, v3

    .line 469
    .local v11, "nextX":I
    iget-object v12, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-static {v12}, Landroidx/compose/ui/platform/AndroidComposeView;->access$getTmpPositionArray$p(Landroidx/compose/ui/platform/AndroidComposeView;)[I

    move-result-object v12

    aget v12, v12, v7

    .line 470
    .local v12, "nextY":I
    iget-object v13, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v14, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-static {v14}, Landroidx/compose/ui/platform/AndroidComposeView;->access$getTmpPositionArray$p(Landroidx/compose/ui/platform/AndroidComposeView;)[I

    move-result-object v14

    invoke-virtual {v13, v14}, Landroidx/compose/ui/platform/AndroidComposeView;->getLocationInWindow([I)V

    .line 471
    iget-object v13, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-static {v13}, Landroidx/compose/ui/platform/AndroidComposeView;->access$getTmpPositionArray$p(Landroidx/compose/ui/platform/AndroidComposeView;)[I

    move-result-object v13

    aget v13, v13, v3

    .line 472
    .local v13, "currentX":I
    iget-object v14, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-static {v14}, Landroidx/compose/ui/platform/AndroidComposeView;->access$getTmpPositionArray$p(Landroidx/compose/ui/platform/AndroidComposeView;)[I

    move-result-object v14

    aget v14, v14, v7

    .line 473
    .local v14, "currentY":I
    sub-int v15, v13, v11

    sub-int v4, v14, v12

    invoke-virtual {v10, v15, v4}, Landroid/graphics/Rect;->offset(II)V

    .line 474
    invoke-static {v9, v5, v10}, Landroidx/compose/ui/focus/FocusInteropUtils_androidKt;->requestInteropFocus(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 475
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    return-object v3

    .line 3126
    .end local v10    # "androidRect":Landroid/graphics/Rect;
    .end local v11    # "nextX":I
    .end local v12    # "nextY":I
    .end local v13    # "currentX":I
    .end local v14    # "currentY":I
    :cond_7
    const/4 v3, 0x0

    .line 466
    .local v3, "$i$a$-checkNotNull-AndroidComposeView$keyInputModifier$1$androidRect$1":I
    nop

    .end local v3    # "$i$a$-checkNotNull-AndroidComposeView$keyInputModifier$1$androidRect$1":I
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Invalid rect"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 483
    .end local v9    # "nextView":Landroid/view/View;
    :cond_8
    iget-object v4, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    move-result-object v4

    .line 484
    nop

    .line 485
    nop

    .line 486
    nop

    .line 487
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection;->unbox-impl()I

    move-result v9

    .line 483
    invoke-interface {v4, v3, v7, v3, v9}, Landroidx/compose/ui/focus/FocusOwner;->clearFocus-I7lrPNg(ZZZI)Z

    move-result v3

    .line 482
    nop

    .line 491
    .local v3, "clearedFocusSuccessfully":Z
    if-nez v3, :cond_9

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    return-object v4

    .line 494
    :cond_9
    iget-object v4, v0, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1;->this$0:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    move-result-object v4

    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusDirection;->unbox-impl()I

    move-result v9

    new-instance v10, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1$1;

    invoke-direct {v10, v1}, Landroidx/compose/ui/platform/AndroidComposeView$keyInputModifier$1$1;-><init>(Landroidx/compose/ui/focus/FocusDirection;)V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    invoke-interface {v4, v9, v11, v10}, Landroidx/compose/ui/focus/FocusOwner;->focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    goto :goto_3

    .line 496
    :cond_a
    nop

    :goto_3
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 494
    return-object v4

    .line 430
    .end local v3    # "clearedFocusSuccessfully":Z
    .end local v5    # "androidDirection":Ljava/lang/Integer;
    .end local v6    # "focusedRect":Landroidx/compose/ui/geometry/Rect;
    .end local v8    # "focusWasMovedOrCancelled":Z
    :cond_b
    :goto_4
    return-object v4
.end method
