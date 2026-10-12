.class public final Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;
.super Ljava/lang/Object;
.source "FocusFinderCompat.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat_androidKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,463:1\n260#2:464\n919#3,2:465\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat_androidKt\n*L\n448#1:464\n455#1:465,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\"\u0010\u0006\u001a\u00020\u0007*\u00020\u00012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u0007*\u00020\u00012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000cH\u0002\u001a\u001e\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0002\u001a*\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000c0\u0010H\u0002\u001a,\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000c0\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002\u00a8\u0006\u0013"
    }
    d2 = {
        "findViewInsideOutShouldExist",
        "Landroid/view/View;",
        "root",
        "start",
        "id",
        "",
        "addFocusableViews",
        "",
        "views",
        "Landroidx/collection/MutableObjectList;",
        "direction",
        "inTouchMode",
        "",
        "findUserSetNextFocus",
        "findViewByPredicateInsideOut",
        "predicate",
        "Lkotlin/Function1;",
        "findViewByPredicateTraversal",
        "childToSkip",
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
.method public static final synthetic access$addFocusableViews(Landroid/view/View;Landroidx/collection/MutableObjectList;I)V
    .locals 0
    .param p0, "$receiver"    # Landroid/view/View;
    .param p1, "views"    # Landroidx/collection/MutableObjectList;
    .param p2, "direction"    # I

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->addFocusableViews(Landroid/view/View;Landroidx/collection/MutableObjectList;I)V

    return-void
.end method

.method public static final synthetic access$findUserSetNextFocus(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;
    .locals 1
    .param p0, "$receiver"    # Landroid/view/View;
    .param p1, "root"    # Landroid/view/View;
    .param p2, "direction"    # I

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->findUserSetNextFocus(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$findViewInsideOutShouldExist(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;
    .locals 1
    .param p0, "root"    # Landroid/view/View;
    .param p1, "start"    # Landroid/view/View;
    .param p2, "id"    # I

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->findViewInsideOutShouldExist(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private static final addFocusableViews(Landroid/view/View;Landroidx/collection/MutableObjectList;I)V
    .locals 1
    .param p0, "$this$addFocusableViews"    # Landroid/view/View;
    .param p1, "views"    # Landroidx/collection/MutableObjectList;
    .param p2, "direction"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroidx/collection/MutableObjectList<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    .line 435
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->addFocusableViews(Landroid/view/View;Landroidx/collection/MutableObjectList;IZ)V

    .line 436
    return-void
.end method

.method private static final addFocusableViews(Landroid/view/View;Landroidx/collection/MutableObjectList;IZ)V
    .locals 3
    .param p0, "$this$addFocusableViews"    # Landroid/view/View;
    .param p1, "views"    # Landroidx/collection/MutableObjectList;
    .param p2, "direction"    # I
    .param p3, "inTouchMode"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroidx/collection/MutableObjectList<",
            "Landroid/view/View;",
            ">;IZ)V"
        }
    .end annotation

    .line 447
    nop

    .line 448
    move-object v0, p0

    .local v0, "$this$isVisible$iv":Landroid/view/View;
    const/4 v1, 0x0

    .line 464
    .local v1, "$i$f$isVisible":I
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 448
    .end local v0    # "$this$isVisible$iv":Landroid/view/View;
    .end local v1    # "$i$f$isVisible":I
    :goto_0
    if-eqz v2, :cond_2

    .line 449
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 450
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 451
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_2

    .line 452
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_2

    .line 453
    if-eqz p3, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isFocusableInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 455
    :cond_1
    move-object v0, p1

    .local v0, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v1, 0x0

    .line 465
    .local v1, "$i$f$plusAssign":I
    invoke-virtual {v0, p0}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 466
    nop

    .line 457
    .end local v0    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v1    # "$i$f$plusAssign":I
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    .line 458
    const/4 v0, 0x0

    .local v0, "i":I
    move-object v1, p0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_1
    if-ge v0, v1, :cond_3

    .line 459
    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, p1, p2, p3}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->addFocusableViews(Landroid/view/View;Landroidx/collection/MutableObjectList;IZ)V

    .line 458
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 462
    .end local v0    # "i":I
    :cond_3
    return-void
.end method

.method private static final findUserSetNextFocus(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;
    .locals 3
    .param p0, "$this$findUserSetNextFocus"    # Landroid/view/View;
    .param p1, "root"    # Landroid/view/View;
    .param p2, "direction"    # I

    .line 352
    const/4 v0, -0x1

    const/4 v1, 0x0

    packed-switch p2, :pswitch_data_0

    .line 369
    return-object v1

    .line 354
    :pswitch_0
    invoke-virtual {p0}, Landroid/view/View;->getNextFocusForwardId()I

    move-result v2

    .line 355
    .local v2, "next":I
    if-ne v2, v0, :cond_0

    return-object v1

    .line 356
    :cond_0
    invoke-static {p1, p0, v2}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->findViewInsideOutShouldExist(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 359
    .end local v2    # "next":I
    :pswitch_1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    if-ne v2, v0, :cond_1

    return-object v1

    .line 360
    :cond_1
    move-object v0, p0

    .line 364
    .local v0, "startView":Landroid/view/View;
    new-instance v1, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt$findUserSetNextFocus$1;

    invoke-direct {v1, p1, v0}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt$findUserSetNextFocus$1;-><init>(Landroid/view/View;Landroid/view/View;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->findViewByPredicateInsideOut(Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroid/view/View;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final findViewByPredicateInsideOut(Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroid/view/View;
    .locals 5
    .param p0, "$this$findViewByPredicateInsideOut"    # Landroid/view/View;
    .param p1, "start"    # Landroid/view/View;
    .param p2, "predicate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 390
    move-object v0, p1

    .line 391
    .local v0, "next":Landroid/view/View;
    const/4 v1, 0x0

    .line 392
    .local v1, "childToSkip":Landroid/view/View;
    :goto_0
    nop

    .line 393
    invoke-static {v0, p2, v1}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->findViewByPredicateTraversal(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    .line 394
    .local v2, "view":Landroid/view/View;
    if-nez v2, :cond_3

    if-ne v0, p0, :cond_0

    goto :goto_2

    .line 398
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 399
    .local v3, "parent":Landroid/view/ViewParent;
    if-eqz v3, :cond_2

    instance-of v4, v3, Landroid/view/View;

    if-nez v4, :cond_1

    goto :goto_1

    .line 403
    :cond_1
    move-object v1, v0

    .line 404
    move-object v0, v3

    check-cast v0, Landroid/view/View;

    .end local v2    # "view":Landroid/view/View;
    .end local v3    # "parent":Landroid/view/ViewParent;
    goto :goto_0

    .line 400
    .restart local v2    # "view":Landroid/view/View;
    .restart local v3    # "parent":Landroid/view/ViewParent;
    :cond_2
    :goto_1
    const/4 v4, 0x0

    return-object v4

    .line 395
    .end local v3    # "parent":Landroid/view/ViewParent;
    :cond_3
    :goto_2
    return-object v2
.end method

.method private static final findViewByPredicateTraversal(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;
    .locals 4
    .param p0, "$this$findViewByPredicateTraversal"    # Landroid/view/View;
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function1;
    .param p2, "childToSkip"    # Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/view/View;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 417
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    return-object p0

    .line 420
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 421
    const/4 v0, 0x0

    .local v0, "i":I
    move-object v1, p0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_2

    .line 422
    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 423
    .local v2, "child":Landroid/view/View;
    if-eq v2, p2, :cond_1

    .line 424
    invoke-static {v2, p1, p2}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->findViewByPredicateTraversal(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    .line 425
    .local v3, "v":Landroid/view/View;
    if-eqz v3, :cond_1

    .line 426
    return-object v3

    .line 421
    .end local v2    # "child":Landroid/view/View;
    .end local v3    # "v":Landroid/view/View;
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 431
    .end local v0    # "i":I
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private static final findViewInsideOutShouldExist(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;
    .locals 1
    .param p0, "root"    # Landroid/view/View;
    .param p1, "start"    # Landroid/view/View;
    .param p2, "id"    # I

    .line 373
    new-instance v0, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1;

    invoke-direct {v0, p2}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1;-><init>(I)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p1, v0}, Landroidx/compose/ui/platform/FocusFinderCompat_androidKt;->findViewByPredicateInsideOut(Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
