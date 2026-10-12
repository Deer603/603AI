.class final Landroidx/compose/ui/window/DialogLayout;
.super Landroidx/compose/ui/platform/AbstractComposeView;
.source "AndroidDialog.android.kt"

# interfaces
.implements Landroidx/compose/ui/window/DialogWindowProvider;
.implements Landroidx/core/view/OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,627:1\n385#1,12:633\n85#2:628\n113#2,2:629\n105#3:631\n105#3:632\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n379#1:633,12\n229#1:628\n229#1:629,2\n305#1:631\n306#1:632\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\r\u0010\u001d\u001a\u00020\u000bH\u0017\u00a2\u0006\u0002\u0010\u001eJ~\u0010\u001f\u001a\u0002H \"\u0004\u0008\u0000\u0010 2\u0006\u0010!\u001a\u0002H 2`\u0010\"\u001a\\\u0012\u0013\u0012\u00110$\u00a2\u0006\u000c\u0008%\u0012\u0008\u0008&\u0012\u0004\u0008\u0008(\'\u0012\u0013\u0012\u00110$\u00a2\u0006\u000c\u0008%\u0012\u0008\u0008&\u0012\u0004\u0008\u0008((\u0012\u0013\u0012\u00110$\u00a2\u0006\u000c\u0008%\u0012\u0008\u0008&\u0012\u0004\u0008\u0008()\u0012\u0013\u0012\u00110$\u00a2\u0006\u000c\u0008%\u0012\u0008\u0008&\u0012\u0004\u0008\u0008(*\u0012\u0004\u0012\u0002H 0#H\u0082\u0008\u00a2\u0006\u0002\u0010+J5\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$H\u0010\u00a2\u0006\u0002\u0008.J\u001d\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020$H\u0010\u00a2\u0006\u0002\u00082J\u000e\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u000205J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000207H\u0016J&\u0010\u0010\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0008\u000c\u00a2\u0006\u0002\u0010=J\u0016\u0010>\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015RA\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0008\u000c2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0008\u000c8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0015@RX\u0094\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006?"
    }
    d2 = {
        "Landroidx/compose/ui/window/DialogLayout;",
        "Landroidx/compose/ui/platform/AbstractComposeView;",
        "Landroidx/compose/ui/window/DialogWindowProvider;",
        "Landroidx/core/view/OnApplyWindowInsetsListener;",
        "context",
        "Landroid/content/Context;",
        "window",
        "Landroid/view/Window;",
        "(Landroid/content/Context;Landroid/view/Window;)V",
        "<set-?>",
        "Lkotlin/Function0;",
        "",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "getContent",
        "()Lkotlin/jvm/functions/Function2;",
        "setContent",
        "(Lkotlin/jvm/functions/Function2;)V",
        "content$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "decorFitsSystemWindows",
        "",
        "hasCalledSetLayout",
        "shouldCreateCompositionOnAttachedToWindow",
        "getShouldCreateCompositionOnAttachedToWindow",
        "()Z",
        "usePlatformDefaultWidth",
        "getWindow",
        "()Landroid/view/Window;",
        "Content",
        "(Landroidx/compose/runtime/Composer;I)V",
        "insetValue",
        "T",
        "unchangedValue",
        "block",
        "Lkotlin/Function4;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "left",
        "top",
        "right",
        "bottom",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;",
        "internalOnLayout",
        "changed",
        "internalOnLayout$ui_release",
        "internalOnMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "internalOnMeasure$ui_release",
        "isInsideContent",
        "event",
        "Landroid/view/MotionEvent;",
        "onApplyWindowInsets",
        "Landroidx/core/view/WindowInsetsCompat;",
        "v",
        "Landroid/view/View;",
        "insets",
        "parent",
        "Landroidx/compose/runtime/CompositionContext;",
        "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V",
        "updateProperties",
        "ui_release"
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
.field private final content$delegate:Landroidx/compose/runtime/MutableState;

.field private decorFitsSystemWindows:Z

.field private hasCalledSetLayout:Z

.field private shouldCreateCompositionOnAttachedToWindow:Z

.field private usePlatformDefaultWidth:Z

.field private final window:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "window"    # Landroid/view/Window;

    .line 227
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .end local p1    # "context":Landroid/content/Context;
    .local v1, "context":Landroid/content/Context;
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 226
    iput-object p2, p0, Landroidx/compose/ui/window/DialogLayout;->window:Landroid/view/Window;

    .line 229
    sget-object p1, Landroidx/compose/ui/window/ComposableSingletons$AndroidDialog_androidKt;->INSTANCE:Landroidx/compose/ui/window/ComposableSingletons$AndroidDialog_androidKt;

    invoke-virtual {p1}, Landroidx/compose/ui/window/ComposableSingletons$AndroidDialog_androidKt;->getLambda-1$ui_release()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v2, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/DialogLayout;->content$delegate:Landroidx/compose/runtime/MutableState;

    .line 238
    nop

    .line 239
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    move-object v0, p0

    check-cast v0, Landroidx/core/view/OnApplyWindowInsetsListener;

    invoke-static {p1, v0}, Landroidx/core/view/ViewCompat;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroidx/core/view/OnApplyWindowInsetsListener;)V

    .line 241
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    .line 242
    new-instance v0, Landroidx/compose/ui/window/DialogLayout$1;

    invoke-direct {v0, p0}, Landroidx/compose/ui/window/DialogLayout$1;-><init>(Landroidx/compose/ui/window/DialogLayout;)V

    check-cast v0, Landroidx/core/view/WindowInsetsAnimationCompat$Callback;

    .line 240
    invoke-static {p1, v0}, Landroidx/core/view/ViewCompat;->setWindowInsetsAnimationCallback(Landroid/view/View;Landroidx/core/view/WindowInsetsAnimationCompat$Callback;)V

    .line 256
    nop

    .line 226
    return-void
.end method

.method public static final synthetic access$getDecorFitsSystemWindows$p(Landroidx/compose/ui/window/DialogLayout;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/window/DialogLayout;

    .line 225
    iget-boolean v0, p0, Landroidx/compose/ui/window/DialogLayout;->decorFitsSystemWindows:Z

    return v0
.end method

.method private final getContent()Lkotlin/jvm/functions/Function2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 229
    iget-object v0, p0, Landroidx/compose/ui/window/DialogLayout;->content$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 628
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 229
    return-object v0
.end method

.method private final insetValue(Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;
    .locals 10
    .param p1, "unchangedValue"    # Ljava/lang/Object;
    .param p2, "block"    # Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "+TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 385
    .local v0, "$i$f$insetValue":I
    invoke-static {p0}, Landroidx/compose/ui/window/DialogLayout;->access$getDecorFitsSystemWindows$p(Landroidx/compose/ui/window/DialogLayout;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 386
    return-object p1

    .line 388
    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/compose/ui/window/DialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 389
    .local v2, "child":Landroid/view/View;
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 390
    .local v3, "left":I
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 391
    .local v4, "top":I
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 392
    .local v5, "right":I
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getHeight()I

    move-result v6

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 393
    .local v1, "bottom":I
    if-nez v3, :cond_1

    if-nez v4, :cond_1

    if-nez v5, :cond_1

    if-nez v1, :cond_1

    .line 394
    move-object v6, p1

    goto :goto_0

    .line 396
    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {p2, v6, v7, v8, v9}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 393
    :goto_0
    return-object v6
.end method

.method private final setContent(Lkotlin/jvm/functions/Function2;)V
    .locals 3
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 229
    iget-object v0, p0, Landroidx/compose/ui/window/DialogLayout;->content$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 629
    .local v2, "$i$f$setValue":I
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 630
    nop

    .line 229
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$setValue":I
    return-void
.end method


# virtual methods
.method public Content(Landroidx/compose/runtime/Composer;I)V
    .locals 3
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const v0, 0x6770d814

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "C(Content)411@16815L9:AndroidDialog.android.kt#2oxthz"

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 411
    const/4 v1, -0x1

    const-string v2, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:410)"

    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 412
    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/window/DialogLayout;->getContent()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 413
    return-void
.end method

.method protected getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    .line 235
    iget-boolean v0, p0, Landroidx/compose/ui/window/DialogLayout;->shouldCreateCompositionOnAttachedToWindow:Z

    return v0
.end method

.method public getWindow()Landroid/view/Window;
    .locals 1

    .line 226
    iget-object v0, p0, Landroidx/compose/ui/window/DialogLayout;->window:Landroid/view/Window;

    return-object v0
.end method

.method public internalOnLayout$ui_release(ZIIII)V
    .locals 13
    .param p1, "changed"    # Z
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .line 351
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/window/DialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 354
    .local v0, "child":Landroid/view/View;
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    .line 355
    .local v1, "hPadding":I
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    .line 356
    .local v2, "vPadding":I
    sub-int v3, p4, p2

    .line 357
    .local v3, "width":I
    sub-int v4, p5, p3

    .line 358
    .local v4, "height":I
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 359
    .local v5, "childWidth":I
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    .line 361
    .local v6, "childHeight":I
    sub-int v7, v3, v5

    sub-int/2addr v7, v1

    .line 362
    .local v7, "extraWidth":I
    sub-int v8, v4, v6

    sub-int/2addr v8, v2

    .line 364
    .local v8, "extraHeight":I
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingLeft()I

    move-result v9

    div-int/lit8 v10, v7, 0x2

    add-int/2addr v9, v10

    .line 365
    .local v9, "l":I
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingTop()I

    move-result v10

    div-int/lit8 v11, v8, 0x2

    add-int/2addr v10, v11

    .line 366
    .local v10, "t":I
    add-int v11, v9, v5

    .line 367
    .local v11, "r":I
    add-int v12, v10, v6

    .line 368
    .local v12, "b":I
    invoke-virtual {v0, v9, v10, v11, v12}, Landroid/view/View;->layout(IIII)V

    .line 369
    return-void
.end method

.method public internalOnMeasure$ui_release(II)V
    .locals 16
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .line 281
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/compose/ui/window/DialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 282
    .local v1, "child":Landroid/view/View;
    if-nez v1, :cond_0

    .line 283
    invoke-super/range {p0 .. p2}, Landroidx/compose/ui/platform/AbstractComposeView;->internalOnMeasure$ui_release(II)V

    .line 284
    return-void

    .line 286
    :cond_0
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 287
    .local v2, "width":I
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 288
    .local v3, "height":I
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 290
    .local v4, "heightMode":I
    nop

    .line 291
    const/4 v5, -0x2

    const/high16 v6, -0x80000000

    if-ne v4, v6, :cond_1

    .line 292
    iget-boolean v7, v0, Landroidx/compose/ui/window/DialogLayout;->usePlatformDefaultWidth:Z

    if-nez v7, :cond_1

    .line 293
    iget-boolean v7, v0, Landroidx/compose/ui/window/DialogLayout;->decorFitsSystemWindows:Z

    if-nez v7, :cond_1

    .line 294
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getWindow()Landroid/view/Window;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v7

    iget v7, v7, Landroid/view/WindowManager$LayoutParams;->height:I

    if-ne v7, v5, :cond_1

    .line 298
    add-int/lit8 v7, v3, 0x1

    goto :goto_0

    .line 300
    :cond_1
    move v7, v3

    .line 290
    :goto_0
    nop

    .line 289
    nop

    .line 303
    .local v7, "targetHeight":I
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingLeft()I

    move-result v8

    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingRight()I

    move-result v9

    add-int/2addr v8, v9

    .line 304
    .local v8, "horizontalPadding":I
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingTop()I

    move-result v9

    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getPaddingBottom()I

    move-result v10

    add-int/2addr v9, v10

    .line 305
    .local v9, "verticalPadding":I
    sub-int v10, v2, v8

    .local v10, "$this$fastCoerceAtLeast$iv":I
    const/4 v11, 0x0

    .local v11, "minimumValue$iv":I
    const/4 v12, 0x0

    .line 631
    .local v12, "$i$f$fastCoerceAtLeast":I
    if-gez v10, :cond_2

    move v10, v11

    .line 305
    .end local v10    # "$this$fastCoerceAtLeast$iv":I
    .end local v11    # "minimumValue$iv":I
    .end local v12    # "$i$f$fastCoerceAtLeast":I
    :cond_2
    nop

    .line 306
    .local v10, "remainingWidth":I
    sub-int v11, v7, v9

    .local v11, "$this$fastCoerceAtLeast$iv":I
    const/4 v12, 0x0

    .local v12, "minimumValue$iv":I
    const/4 v13, 0x0

    .line 632
    .local v13, "$i$f$fastCoerceAtLeast":I
    if-gez v11, :cond_3

    move v11, v12

    .line 306
    .end local v11    # "$this$fastCoerceAtLeast$iv":I
    .end local v12    # "minimumValue$iv":I
    .end local v13    # "$i$f$fastCoerceAtLeast":I
    :cond_3
    nop

    .line 308
    .local v11, "remainingHeight":I
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v12

    .line 310
    .local v12, "widthMode":I
    if-nez v12, :cond_4

    .line 311
    move/from16 v13, p1

    goto :goto_1

    .line 313
    :cond_4
    invoke-static {v10, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    .line 310
    :goto_1
    nop

    .line 309
    nop

    .line 316
    .local v13, "childWidthSpec":I
    if-nez v4, :cond_5

    .line 317
    move/from16 v6, p2

    goto :goto_2

    .line 319
    :cond_5
    invoke-static {v11, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 316
    :goto_2
    nop

    .line 315
    nop

    .line 321
    .local v6, "childHeightSpec":I
    invoke-virtual {v1, v13, v6}, Landroid/view/View;->measure(II)V

    .line 325
    sparse-switch v12, :sswitch_data_0

    .line 328
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    add-int/2addr v14, v8

    goto :goto_3

    .line 326
    :sswitch_0
    move v14, v2

    goto :goto_3

    .line 327
    :sswitch_1
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    add-int/2addr v14, v8

    invoke-static {v2, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 325
    :goto_3
    nop

    .line 324
    nop

    .line 331
    .local v14, "measuredWidth":I
    sparse-switch v4, :sswitch_data_1

    .line 334
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v15, v9

    goto :goto_4

    .line 332
    :sswitch_2
    move v15, v3

    goto :goto_4

    .line 333
    :sswitch_3
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v15, v9

    invoke-static {v3, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    .line 331
    :goto_4
    nop

    .line 330
    nop

    .line 336
    .local v15, "measuredHeight":I
    invoke-virtual {v0, v14, v15}, Landroidx/compose/ui/window/DialogLayout;->setMeasuredDimension(II)V

    .line 338
    nop

    .line 339
    iget-boolean v5, v0, Landroidx/compose/ui/window/DialogLayout;->usePlatformDefaultWidth:Z

    if-nez v5, :cond_6

    .line 340
    iget-boolean v5, v0, Landroidx/compose/ui/window/DialogLayout;->decorFitsSystemWindows:Z

    if-nez v5, :cond_6

    .line 341
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v5, v9

    if-le v5, v3, :cond_6

    .line 342
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    iget v5, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 v0, -0x2

    if-ne v5, v0, :cond_6

    .line 346
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/window/DialogLayout;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v5, -0x1

    invoke-virtual {v0, v5, v5}, Landroid/view/Window;->setLayout(II)V

    .line 348
    :cond_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x40000000 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_3
        0x40000000 -> :sswitch_2
    .end sparse-switch
.end method

.method public final isInsideContent(Landroid/view/MotionEvent;)Z
    .locals 8
    .param p1, "event"    # Landroid/view/MotionEvent;

    .line 401
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-eqz v0, :cond_7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    if-nez v0, :cond_2

    goto :goto_5

    .line 402
    :cond_2
    invoke-virtual {p0, v3}, Landroidx/compose/ui/window/DialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_3

    return v3

    .line 403
    .local v0, "child":Landroid/view/View;
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v4

    add-int/2addr v1, v4

    .line 404
    .local v1, "left":I
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v4, v1

    .line 405
    .local v4, "right":I
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getTop()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v6

    add-int/2addr v5, v6

    .line 406
    .local v5, "top":I
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v6, v5

    .line 407
    .local v6, "bottom":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    invoke-static {v7}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v7

    if-gt v1, v7, :cond_4

    if-gt v7, v4, :cond_4

    move v7, v2

    goto :goto_2

    :cond_4
    move v7, v3

    :goto_2
    if-eqz v7, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    invoke-static {v7}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v7

    if-gt v5, v7, :cond_5

    if-gt v7, v6, :cond_5

    move v7, v2

    goto :goto_3

    :cond_5
    move v7, v3

    :goto_3
    if-eqz v7, :cond_6

    goto :goto_4

    :cond_6
    move v2, v3

    :goto_4
    return v2

    .line 401
    .end local v0    # "child":Landroid/view/View;
    .end local v1    # "left":I
    .end local v4    # "right":I
    .end local v5    # "top":I
    .end local v6    # "bottom":I
    :cond_7
    :goto_5
    return v3
.end method

.method public onApplyWindowInsets(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 13
    .param p1, "v"    # Landroid/view/View;
    .param p2, "insets"    # Landroidx/core/view/WindowInsetsCompat;

    .line 379
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/ui/window/DialogLayout;
    const/4 v1, 0x0

    .line 633
    .local v1, "$i$f$insetValue":I
    invoke-static {v0}, Landroidx/compose/ui/window/DialogLayout;->access$getDecorFitsSystemWindows$p(Landroidx/compose/ui/window/DialogLayout;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 634
    move-object v12, p2

    goto :goto_1

    .line 636
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/compose/ui/window/DialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 637
    .local v3, "child$iv":Landroid/view/View;
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 638
    .local v4, "left$iv":I
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 639
    .local v5, "top$iv":I
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getWidth()I

    move-result v6

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 640
    .local v6, "right$iv":I
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getHeight()I

    move-result v7

    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v8

    sub-int/2addr v7, v8

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 641
    .local v2, "bottom$iv":I
    if-nez v4, :cond_1

    if-nez v5, :cond_1

    if-nez v6, :cond_1

    if-nez v2, :cond_1

    .line 642
    move-object v12, p2

    goto :goto_0

    .line 644
    :cond_1
    move v7, v4

    .local v7, "l":I
    move v8, v5

    .local v8, "t":I
    move v9, v6

    .local v9, "r":I
    move v10, v2

    .local v10, "b":I
    const/4 v11, 0x0

    .line 379
    .local v11, "$i$a$-insetValue-DialogLayout$onApplyWindowInsets$1":I
    invoke-virtual {p2, v7, v8, v9, v10}, Landroidx/core/view/WindowInsetsCompat;->inset(IIII)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v12

    .line 644
    .end local v7    # "l":I
    .end local v8    # "t":I
    .end local v9    # "r":I
    .end local v10    # "b":I
    .end local v11    # "$i$a$-insetValue-DialogLayout$onApplyWindowInsets$1":I
    :goto_0
    nop

    .line 641
    nop

    .line 379
    .end local v0    # "this_$iv":Landroidx/compose/ui/window/DialogLayout;
    .end local v1    # "$i$f$insetValue":I
    .end local v2    # "bottom$iv":I
    .end local v3    # "child$iv":Landroid/view/View;
    .end local v4    # "left$iv":I
    .end local v5    # "top$iv":I
    .end local v6    # "right$iv":I
    :goto_1
    return-object v12
.end method

.method public final setContent(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p1, "parent"    # Landroidx/compose/runtime/CompositionContext;
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/CompositionContext;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 372
    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/DialogLayout;->setParentCompositionContext(Landroidx/compose/runtime/CompositionContext;)V

    .line 373
    invoke-direct {p0, p2}, Landroidx/compose/ui/window/DialogLayout;->setContent(Lkotlin/jvm/functions/Function2;)V

    .line 374
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/window/DialogLayout;->shouldCreateCompositionOnAttachedToWindow:Z

    .line 375
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->createComposition()V

    .line 376
    return-void
.end method

.method public final updateProperties(ZZ)V
    .locals 6
    .param p1, "usePlatformDefaultWidth"    # Z
    .param p2, "decorFitsSystemWindows"    # Z

    .line 260
    iget-boolean v0, p0, Landroidx/compose/ui/window/DialogLayout;->hasCalledSetLayout:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 261
    iget-boolean v0, p0, Landroidx/compose/ui/window/DialogLayout;->usePlatformDefaultWidth:Z

    if-ne p1, v0, :cond_1

    .line 262
    iget-boolean v0, p0, Landroidx/compose/ui/window/DialogLayout;->decorFitsSystemWindows:Z

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    .line 259
    :goto_1
    nop

    .line 263
    .local v0, "callSetLayout":Z
    iput-boolean p1, p0, Landroidx/compose/ui/window/DialogLayout;->usePlatformDefaultWidth:Z

    .line 264
    iput-boolean p2, p0, Landroidx/compose/ui/window/DialogLayout;->decorFitsSystemWindows:Z

    .line 266
    if-eqz v0, :cond_4

    .line 267
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    .line 268
    .local v2, "attrs":Landroid/view/WindowManager$LayoutParams;
    const/4 v3, -0x2

    if-eqz p1, :cond_2

    move v4, v3

    goto :goto_2

    :cond_2
    const/4 v4, -0x1

    .line 269
    .local v4, "measurementWidth":I
    :goto_2
    iget v5, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    if-ne v4, v5, :cond_3

    iget-boolean v5, p0, Landroidx/compose/ui/window/DialogLayout;->hasCalledSetLayout:Z

    if-nez v5, :cond_4

    .line 274
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/window/DialogLayout;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5, v4, v3}, Landroid/view/Window;->setLayout(II)V

    .line 275
    iput-boolean v1, p0, Landroidx/compose/ui/window/DialogLayout;->hasCalledSetLayout:Z

    .line 278
    .end local v2    # "attrs":Landroid/view/WindowManager$LayoutParams;
    .end local v4    # "measurementWidth":I
    :cond_4
    return-void
.end method
