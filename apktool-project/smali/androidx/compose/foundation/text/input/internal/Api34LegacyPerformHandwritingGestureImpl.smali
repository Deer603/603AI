.class final Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl;
.super Ljava/lang/Object;
.source "RecordingInputConnection.android.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0012J,\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl;",
        "",
        "()V",
        "performHandwritingGesture",
        "",
        "legacyTextFieldState",
        "Landroidx/compose/foundation/text/LegacyTextFieldState;",
        "textFieldSelectionManager",
        "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
        "gesture",
        "Landroid/view/inputmethod/HandwritingGesture;",
        "viewConfiguration",
        "Landroidx/compose/ui/platform/ViewConfiguration;",
        "executor",
        "Ljava/util/concurrent/Executor;",
        "consumer",
        "Ljava/util/function/IntConsumer;",
        "editCommandConsumer",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/text/input/EditCommand;",
        "previewHandwritingGesture",
        "",
        "Landroid/view/inputmethod/PreviewableHandwritingGesture;",
        "cancellationSignal",
        "Landroid/os/CancellationSignal;",
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
.field public static final INSTANCE:Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl;

    invoke-direct {v0}, Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl;-><init>()V

    sput-object v0, Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl;->INSTANCE:Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 587
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final performHandwritingGesture$lambda$0(Ljava/util/function/IntConsumer;I)V
    .locals 0
    .param p0, "$consumer"    # Ljava/util/function/IntConsumer;
    .param p1, "$result"    # I

    .line 609
    invoke-interface {p0, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    return-void
.end method


# virtual methods
.method public final performHandwritingGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/ui/platform/ViewConfiguration;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .param p1, "legacyTextFieldState"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "textFieldSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p3, "gesture"    # Landroid/view/inputmethod/HandwritingGesture;
    .param p4, "viewConfiguration"    # Landroidx/compose/ui/platform/ViewConfiguration;
    .param p5, "executor"    # Ljava/util/concurrent/Executor;
    .param p6, "consumer"    # Ljava/util/function/IntConsumer;
    .param p7, "editCommandConsumer"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/LegacyTextFieldState;",
            "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;",
            "Landroid/view/inputmethod/HandwritingGesture;",
            "Landroidx/compose/ui/platform/ViewConfiguration;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/function/IntConsumer;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/EditCommand;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 600
    if-eqz p1, :cond_0

    sget-object v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    .line 601
    nop

    .line 602
    nop

    .line 603
    nop

    .line 604
    nop

    .line 600
    move-object v1, p1

    move-object v3, p2

    move-object v2, p3

    move-object v4, p4

    move-object v5, p7

    .end local p1    # "legacyTextFieldState":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p2    # "textFieldSelectionManager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local p3    # "gesture":Landroid/view/inputmethod/HandwritingGesture;
    .end local p4    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .end local p7    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    .local v1, "legacyTextFieldState":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .local v2, "gesture":Landroid/view/inputmethod/HandwritingGesture;
    .local v3, "textFieldSelectionManager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .local v4, "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .local v5, "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performHandwritingGesture$foundation_release(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I

    move-result p1

    goto :goto_0

    .line 605
    .end local v1    # "legacyTextFieldState":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local v2    # "gesture":Landroid/view/inputmethod/HandwritingGesture;
    .end local v3    # "textFieldSelectionManager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local v4    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .end local v5    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    .restart local p1    # "legacyTextFieldState":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .restart local p2    # "textFieldSelectionManager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local p3    # "gesture":Landroid/view/inputmethod/HandwritingGesture;
    .restart local p4    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .restart local p7    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    :cond_0
    move-object v1, p1

    move-object v3, p2

    move-object v2, p3

    move-object v4, p4

    move-object v5, p7

    .end local p1    # "legacyTextFieldState":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .end local p2    # "textFieldSelectionManager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .end local p3    # "gesture":Landroid/view/inputmethod/HandwritingGesture;
    .end local p4    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .end local p7    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    .restart local v1    # "legacyTextFieldState":Landroidx/compose/foundation/text/LegacyTextFieldState;
    .restart local v2    # "gesture":Landroid/view/inputmethod/HandwritingGesture;
    .restart local v3    # "textFieldSelectionManager":Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .restart local v4    # "viewConfiguration":Landroidx/compose/ui/platform/ViewConfiguration;
    .restart local v5    # "editCommandConsumer":Lkotlin/jvm/functions/Function1;
    const/4 p1, 0x3

    .line 600
    :goto_0
    nop

    .line 599
    nop

    .line 607
    .local p1, "result":I
    if-nez p6, :cond_1

    return-void

    .line 608
    :cond_1
    if-eqz p5, :cond_2

    .line 609
    new-instance p2, Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl$$ExternalSyntheticLambda0;

    invoke-direct {p2, p6, p1}, Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl$$ExternalSyntheticLambda0;-><init>(Ljava/util/function/IntConsumer;I)V

    invoke-interface {p5, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 611
    :cond_2
    invoke-interface {p6, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 613
    :goto_1
    return-void
.end method

.method public final previewHandwritingGesture(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 1
    .param p1, "legacyTextFieldState"    # Landroidx/compose/foundation/text/LegacyTextFieldState;
    .param p2, "textFieldSelectionManager"    # Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;
    .param p3, "gesture"    # Landroid/view/inputmethod/PreviewableHandwritingGesture;
    .param p4, "cancellationSignal"    # Landroid/os/CancellationSignal;

    .line 621
    if-eqz p1, :cond_0

    sget-object v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    .line 622
    nop

    .line 623
    nop

    .line 624
    nop

    .line 621
    invoke-virtual {v0, p1, p3, p2, p4}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewHandwritingGesture$foundation_release(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/os/CancellationSignal;)Z

    move-result v0

    goto :goto_0

    .line 625
    :cond_0
    const/4 v0, 0x0

    .line 621
    :goto_0
    return v0
.end method
