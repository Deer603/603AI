.class public final Landroidx/compose/ui/window/DialogLayout$1;
.super Landroidx/core/view/WindowInsetsAnimationCompat$Callback;
.source "AndroidDialog.android.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/DialogLayout;-><init>(Landroid/content/Context;Landroid/view/Window;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout$1\n+ 2 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n1#1,627:1\n385#2,12:628\n385#2,12:640\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout$1\n*L\n247#1:628,12\n253#1:640,12\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "androidx/compose/ui/window/DialogLayout$1",
        "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;",
        "onProgress",
        "Landroidx/core/view/WindowInsetsCompat;",
        "insets",
        "runningAnimations",
        "",
        "Landroidx/core/view/WindowInsetsAnimationCompat;",
        "onStart",
        "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;",
        "animation",
        "bounds",
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
.field final synthetic this$0:Landroidx/compose/ui/window/DialogLayout;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/DialogLayout;)V
    .locals 1
    .param p1, "$receiver"    # Landroidx/compose/ui/window/DialogLayout;

    iput-object p1, p0, Landroidx/compose/ui/window/DialogLayout$1;->this$0:Landroidx/compose/ui/window/DialogLayout;

    .line 242
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/core/view/WindowInsetsAnimationCompat$Callback;-><init>(I)V

    return-void
.end method


# virtual methods
.method public onProgress(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;
    .locals 13
    .param p1, "insets"    # Landroidx/core/view/WindowInsetsCompat;
    .param p2, "runningAnimations"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/view/WindowInsetsCompat;",
            "Ljava/util/List<",
            "Landroidx/core/view/WindowInsetsAnimationCompat;",
            ">;)",
            "Landroidx/core/view/WindowInsetsCompat;"
        }
    .end annotation

    .line 253
    iget-object v0, p0, Landroidx/compose/ui/window/DialogLayout$1;->this$0:Landroidx/compose/ui/window/DialogLayout;

    .local v0, "this_$iv":Landroidx/compose/ui/window/DialogLayout;
    const/4 v1, 0x0

    .line 640
    .local v1, "$i$f$insetValue":I
    invoke-static {v0}, Landroidx/compose/ui/window/DialogLayout;->access$getDecorFitsSystemWindows$p(Landroidx/compose/ui/window/DialogLayout;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 641
    move-object v12, p1

    goto :goto_1

    .line 643
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/compose/ui/window/DialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 644
    .local v3, "child$iv":Landroid/view/View;
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 645
    .local v4, "left$iv":I
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 646
    .local v5, "top$iv":I
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getWidth()I

    move-result v6

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 647
    .local v6, "right$iv":I
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getHeight()I

    move-result v7

    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v8

    sub-int/2addr v7, v8

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 648
    .local v2, "bottom$iv":I
    if-nez v4, :cond_1

    if-nez v5, :cond_1

    if-nez v6, :cond_1

    if-nez v2, :cond_1

    .line 649
    move-object v12, p1

    goto :goto_0

    .line 651
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

    .line 253
    .local v11, "$i$a$-insetValue-DialogLayout$1$onProgress$1":I
    invoke-virtual {p1, v7, v8, v9, v10}, Landroidx/core/view/WindowInsetsCompat;->inset(IIII)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v12

    .line 651
    .end local v7    # "l":I
    .end local v8    # "t":I
    .end local v9    # "r":I
    .end local v10    # "b":I
    .end local v11    # "$i$a$-insetValue-DialogLayout$1$onProgress$1":I
    :goto_0
    nop

    .line 648
    nop

    .line 253
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

.method public onStart(Landroidx/core/view/WindowInsetsAnimationCompat;Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;
    .locals 13
    .param p1, "animation"    # Landroidx/core/view/WindowInsetsAnimationCompat;
    .param p2, "bounds"    # Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;

    .line 247
    iget-object v0, p0, Landroidx/compose/ui/window/DialogLayout$1;->this$0:Landroidx/compose/ui/window/DialogLayout;

    .local v0, "this_$iv":Landroidx/compose/ui/window/DialogLayout;
    const/4 v1, 0x0

    .line 628
    .local v1, "$i$f$insetValue":I
    invoke-static {v0}, Landroidx/compose/ui/window/DialogLayout;->access$getDecorFitsSystemWindows$p(Landroidx/compose/ui/window/DialogLayout;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 629
    move-object v12, p2

    goto :goto_1

    .line 631
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/compose/ui/window/DialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 632
    .local v3, "child$iv":Landroid/view/View;
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 633
    .local v4, "left$iv":I
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 634
    .local v5, "top$iv":I
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getWidth()I

    move-result v6

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 635
    .local v6, "right$iv":I
    invoke-virtual {v0}, Landroidx/compose/ui/window/DialogLayout;->getHeight()I

    move-result v7

    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v8

    sub-int/2addr v7, v8

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 636
    .local v2, "bottom$iv":I
    if-nez v4, :cond_1

    if-nez v5, :cond_1

    if-nez v6, :cond_1

    if-nez v2, :cond_1

    .line 637
    move-object v12, p2

    goto :goto_0

    .line 639
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

    .line 247
    .local v11, "$i$a$-insetValue-DialogLayout$1$onStart$1":I
    invoke-static {v7, v8, v9, v10}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object v12

    invoke-virtual {p2, v12}, Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;->inset(Landroidx/core/graphics/Insets;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;

    move-result-object v12

    .line 639
    .end local v7    # "l":I
    .end local v8    # "t":I
    .end local v9    # "r":I
    .end local v10    # "b":I
    .end local v11    # "$i$a$-insetValue-DialogLayout$1$onStart$1":I
    :goto_0
    nop

    .line 636
    nop

    .line 247
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
