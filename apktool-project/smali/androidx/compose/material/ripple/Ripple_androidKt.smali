.class public final Landroidx/compose/material/ripple/Ripple_androidKt;
.super Ljava/lang/Object;
.source "Ripple.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/Ripple_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n1#2:363\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0016"
    }
    d2 = {
        "createAndAttachRippleContainerIfNeeded",
        "Landroidx/compose/material/ripple/RippleContainer;",
        "view",
        "Landroid/view/ViewGroup;",
        "createPlatformRippleNode",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "bounded",
        "",
        "radius",
        "Landroidx/compose/ui/unit/Dp;",
        "color",
        "Landroidx/compose/ui/graphics/ColorProducer;",
        "rippleAlpha",
        "Lkotlin/Function0;",
        "Landroidx/compose/material/ripple/RippleAlpha;",
        "createPlatformRippleNode-TDGSqEk",
        "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;",
        "findNearestViewGroup",
        "initialView",
        "Landroid/view/View;",
        "material-ripple_release"
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
.method public static final synthetic access$createAndAttachRippleContainerIfNeeded(Landroid/view/ViewGroup;)Landroidx/compose/material/ripple/RippleContainer;
    .locals 1
    .param p0, "view"    # Landroid/view/ViewGroup;

    .line 1
    invoke-static {p0}, Landroidx/compose/material/ripple/Ripple_androidKt;->createAndAttachRippleContainerIfNeeded(Landroid/view/ViewGroup;)Landroidx/compose/material/ripple/RippleContainer;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$findNearestViewGroup(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "initialView"    # Landroid/view/View;

    .line 1
    invoke-static {p0}, Landroidx/compose/material/ripple/Ripple_androidKt;->findNearestViewGroup(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method

.method private static final createAndAttachRippleContainerIfNeeded(Landroid/view/ViewGroup;)Landroidx/compose/material/ripple/RippleContainer;
    .locals 4
    .param p0, "view"    # Landroid/view/ViewGroup;

    .line 329
    const/4 v0, 0x0

    .local v0, "index":I
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    .line 330
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 331
    .local v2, "child":Landroid/view/View;
    instance-of v3, v2, Landroidx/compose/material/ripple/RippleContainer;

    if-eqz v3, :cond_0

    .line 332
    move-object v1, v2

    check-cast v1, Landroidx/compose/material/ripple/RippleContainer;

    return-object v1

    .line 329
    .end local v2    # "child":Landroid/view/View;
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 337
    .end local v0    # "index":I
    :cond_1
    new-instance v0, Landroidx/compose/material/ripple/RippleContainer;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/material/ripple/RippleContainer;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    .line 363
    .local v1, "$this$createAndAttachRippleContainerIfNeeded_u24lambda_u240":Landroidx/compose/material/ripple/RippleContainer;
    const/4 v2, 0x0

    .line 337
    .local v2, "$i$a$-apply-Ripple_androidKt$createAndAttachRippleContainerIfNeeded$1":I
    move-object v3, v1

    check-cast v3, Landroid/view/View;

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .end local v1    # "$this$createAndAttachRippleContainerIfNeeded_u24lambda_u240":Landroidx/compose/material/ripple/RippleContainer;
    .end local v2    # "$i$a$-apply-Ripple_androidKt$createAndAttachRippleContainerIfNeeded$1":I
    return-object v0
.end method

.method public static final createPlatformRippleNode-TDGSqEk(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/DelegatableNode;
    .locals 7
    .param p0, "interactionSource"    # Landroidx/compose/foundation/interaction/InteractionSource;
    .param p1, "bounded"    # Z
    .param p2, "radius"    # F
    .param p3, "color"    # Landroidx/compose/ui/graphics/ColorProducer;
    .param p4, "rippleAlpha"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "ZF",
            "Landroidx/compose/ui/graphics/ColorProducer;",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/material/ripple/RippleAlpha;",
            ">;)",
            "Landroidx/compose/ui/node/DelegatableNode;"
        }
    .end annotation

    .line 62
    new-instance v0, Landroidx/compose/material/ripple/AndroidRippleNode;

    const/4 v6, 0x0

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    .end local p0    # "interactionSource":Landroidx/compose/foundation/interaction/InteractionSource;
    .end local p1    # "bounded":Z
    .end local p2    # "radius":F
    .end local p3    # "color":Landroidx/compose/ui/graphics/ColorProducer;
    .end local p4    # "rippleAlpha":Lkotlin/jvm/functions/Function0;
    .local v1, "interactionSource":Landroidx/compose/foundation/interaction/InteractionSource;
    .local v2, "bounded":Z
    .local v3, "radius":F
    .local v4, "color":Landroidx/compose/ui/graphics/ColorProducer;
    .local v5, "rippleAlpha":Lkotlin/jvm/functions/Function0;
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material/ripple/AndroidRippleNode;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    return-object v0
.end method

.method private static final findNearestViewGroup(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 5
    .param p0, "initialView"    # Landroid/view/View;

    .line 349
    const/4 v0, 0x0

    .local v0, "view":Ljava/lang/Object;
    move-object v0, p0

    .line 350
    :goto_0
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-nez v1, :cond_1

    .line 351
    move-object v1, v0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 354
    .local v1, "parent":Landroid/view/ViewParent;
    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_0

    .line 358
    move-object v0, v1

    .end local v1    # "parent":Landroid/view/ViewParent;
    goto :goto_0

    .line 354
    .restart local v1    # "parent":Landroid/view/ViewParent;
    :cond_0
    const/4 v2, 0x0

    .line 355
    .local v2, "$i$a$-require-Ripple_androidKt$findNearestViewGroup$1":I
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Couldn\'t find a valid parent for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 356
    nop

    .line 354
    .end local v2    # "$i$a$-require-Ripple_androidKt$findNearestViewGroup$1":I
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 360
    .end local v1    # "parent":Landroid/view/ViewParent;
    :cond_1
    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup;

    return-object v1
.end method
