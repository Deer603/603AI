.class public final Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
.super Ljava/lang/Object;
.source "BasicTextField.kt"

# interfaces
.implements Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1\n+ 2 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionStateKt\n*L\n1#1,971:1\n1545#2,7:972\n1545#2,7:979\n1545#2,7:986\n1545#2,7:993\n1545#2,7:1000\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1\n*L\n315#1:972,7\n321#1:979,7\n327#1:986,7\n333#1:993,7\n337#1:1000,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "androidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1",
        "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;",
        "hideTextToolbar",
        "",
        "showTextToolbar",
        "selectionState",
        "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;",
        "rect",
        "Landroidx/compose/ui/geometry/Rect;",
        "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field final synthetic $coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $currentTextToolbar:Landroidx/compose/ui/platform/TextToolbar;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/TextToolbar;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 0
    .param p1, "$currentTextToolbar"    # Landroidx/compose/ui/platform/TextToolbar;
    .param p2, "$coroutineScope"    # Lkotlinx/coroutines/CoroutineScope;

    iput-object p1, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;->$currentTextToolbar:Landroidx/compose/ui/platform/TextToolbar;

    iput-object p2, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 306
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hideTextToolbar()V
    .locals 2

    .line 342
    iget-object v0, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;->$currentTextToolbar:Landroidx/compose/ui/platform/TextToolbar;

    invoke-interface {v0}, Landroidx/compose/ui/platform/TextToolbar;->getStatus()Landroidx/compose/ui/platform/TextToolbarStatus;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/platform/TextToolbarStatus;->Shown:Landroidx/compose/ui/platform/TextToolbarStatus;

    if-ne v0, v1, :cond_0

    .line 343
    iget-object v0, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;->$currentTextToolbar:Landroidx/compose/ui/platform/TextToolbar;

    invoke-interface {v0}, Landroidx/compose/ui/platform/TextToolbar;->hide()V

    .line 345
    :cond_0
    return-void
.end method

.method public showTextToolbar(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;

    iget v2, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v2, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->label:I

    sub-int/2addr v2, v3

    iput v2, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->label:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;-><init>(Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;Lkotlin/coroutines/Continuation;)V

    .local v1, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v3, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->result:Ljava/lang/Object;

    .local v3, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 307
    iget v5, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->label:I

    const/4 v6, 0x0

    packed-switch v5, :pswitch_data_0

    .end local v1    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v3    # "$result":Ljava/lang/Object;
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .restart local v1    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v3    # "$result":Ljava/lang/Object;
    :pswitch_0
    const/4 v4, 0x0

    .local v4, "$i$a$-with-BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2":I
    iget-object v5, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$5:Ljava/lang/Object;

    check-cast v5, Landroidx/compose/ui/platform/TextToolbar;

    iget-object v7, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$4:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/geometry/Rect;

    iget-object v8, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$3:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/functions/Function0;

    iget-object v9, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$2:Ljava/lang/Object;

    check-cast v9, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .local v9, "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    iget-object v10, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$1:Ljava/lang/Object;

    check-cast v10, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .local v10, "$this$showTextToolbar_u24lambda_u245":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    iget-object v11, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v12, v7

    move-object v7, v5

    move-object v5, v9

    move-object v9, v8

    move-object v8, v12

    move-object v12, v3

    goto :goto_2

    .end local v4    # "$i$a$-with-BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2":I
    .end local v9    # "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .end local v10    # "$this$showTextToolbar_u24lambda_u245":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    :pswitch_1
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v5, p0

    .local v5, "this":Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    move-object/from16 v7, p2

    .local v7, "rect":Landroidx/compose/ui/geometry/Rect;
    move-object/from16 v8, p1

    .line 311
    .local v8, "selectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    iget-object v9, v5, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;->$currentTextToolbar:Landroidx/compose/ui/platform/TextToolbar;

    iget-object v11, v5, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .end local v5    # "this":Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    move-object v10, v8

    .end local v8    # "selectionState":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .restart local v10    # "$this$showTextToolbar_u24lambda_u245":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    const/4 v5, 0x0

    .line 312
    .local v5, "$i$a$-with-BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2":I
    nop

    .line 313
    nop

    .line 315
    .end local v7    # "rect":Landroidx/compose/ui/geometry/Rect;
    invoke-virtual {v10}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->canCopy()Z

    move-result v8

    .local v8, "enabled$iv":Z
    sget-object v12, Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;

    .local v12, "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    move-object v13, v10

    .local v13, "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    const/4 v14, 0x0

    .line 972
    .local v14, "$i$f$menuItem":I
    if-nez v8, :cond_1

    move-object v8, v6

    goto :goto_1

    .line 974
    .end local v8    # "enabled$iv":Z
    :cond_1
    new-instance v8, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$1;

    invoke-direct {v8, v13, v12, v11, v10}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 978
    .end local v12    # "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    .end local v13    # "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    :goto_1
    nop

    .line 321
    .end local v14    # "$i$f$menuItem":I
    iput-object v11, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$0:Ljava/lang/Object;

    iput-object v10, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$1:Ljava/lang/Object;

    iput-object v10, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$2:Ljava/lang/Object;

    iput-object v8, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$3:Ljava/lang/Object;

    iput-object v7, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$4:Ljava/lang/Object;

    iput-object v9, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->L$5:Ljava/lang/Object;

    const/4 v12, 0x1

    iput v12, v1, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->label:I

    invoke-virtual {v10, v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->canPaste(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v4, :cond_2

    .line 307
    return-object v4

    .line 321
    :cond_2
    move-object v4, v10

    move/from16 v17, v5

    move-object v5, v4

    move/from16 v4, v17

    move-object/from16 v17, v8

    move-object v8, v7

    move-object v7, v9

    move-object/from16 v9, v17

    .restart local v4    # "$i$a$-with-BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2":I
    .local v5, "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    :goto_2
    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    .local v12, "enabled$iv":Z
    sget-object v13, Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;

    .local v13, "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    const/4 v14, 0x0

    .line 979
    .restart local v14    # "$i$f$menuItem":I
    if-nez v12, :cond_3

    move-object v12, v6

    goto :goto_3

    .line 981
    .end local v12    # "enabled$iv":Z
    :cond_3
    new-instance v12, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$2;

    invoke-direct {v12, v5, v13, v11, v10}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$2;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 985
    .end local v5    # "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .end local v13    # "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    :goto_3
    nop

    .line 327
    .end local v14    # "$i$f$menuItem":I
    invoke-virtual {v10}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->canCut()Z

    move-result v5

    .local v5, "enabled$iv":Z
    sget-object v13, Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;

    .restart local v13    # "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    move-object v14, v10

    .local v14, "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    const/4 v15, 0x0

    .line 986
    .local v15, "$i$f$menuItem":I
    if-nez v5, :cond_4

    move-object v11, v6

    goto :goto_4

    .line 988
    .end local v5    # "enabled$iv":Z
    :cond_4
    new-instance v5, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$3;

    invoke-direct {v5, v14, v13, v11, v10}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$3;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    move-object v11, v5

    .line 992
    .end local v13    # "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    .end local v14    # "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    :goto_4
    nop

    .line 333
    .end local v15    # "$i$f$menuItem":I
    invoke-virtual {v10}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->canSelectAll()Z

    move-result v5

    .restart local v5    # "enabled$iv":Z
    sget-object v13, Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;->Selection:Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;

    .restart local v13    # "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    move-object v14, v10

    .restart local v14    # "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    const/4 v15, 0x0

    .line 993
    .restart local v15    # "$i$f$menuItem":I
    if-nez v5, :cond_5

    move-object v5, v6

    goto :goto_5

    .line 995
    .end local v5    # "enabled$iv":Z
    :cond_5
    new-instance v5, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$4;

    invoke-direct {v5, v14, v13, v10}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$4;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 999
    .end local v13    # "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    .end local v14    # "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    :goto_5
    nop

    .line 337
    .end local v15    # "$i$f$menuItem":I
    invoke-virtual {v10}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->canAutofill()Z

    move-result v13

    .local v13, "enabled$iv":Z
    sget-object v14, Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;

    .local v14, "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    move-object v15, v10

    .local v15, "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    const/16 v16, 0x0

    .line 1000
    .local v16, "$i$f$menuItem":I
    if-nez v13, :cond_6

    move-object v13, v6

    goto :goto_6

    .line 1002
    .end local v13    # "enabled$iv":Z
    :cond_6
    new-instance v6, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$5;

    invoke-direct {v6, v15, v14, v10}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$5$$inlined$menuItem$5;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    check-cast v6, Lkotlin/jvm/functions/Function0;

    move-object v13, v6

    .line 1006
    .end local v10    # "$this$showTextToolbar_u24lambda_u245":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .end local v14    # "desiredState$iv":Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;
    .end local v15    # "$this$menuItem$iv":Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    :goto_6
    nop

    .line 312
    .end local v16    # "$i$f$menuItem":I
    move-object v10, v12

    move-object v12, v5

    invoke-interface/range {v7 .. v13}, Landroidx/compose/ui/platform/TextToolbar;->showMenu(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 339
    nop

    .line 311
    .end local v4    # "$i$a$-with-BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2":I
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 339
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
