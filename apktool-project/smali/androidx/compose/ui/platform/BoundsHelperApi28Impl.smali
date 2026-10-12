.class final Landroidx/compose/ui/platform/BoundsHelperApi28Impl;
.super Ljava/lang/Object;
.source "AndroidWindowInfo.android.kt"

# interfaces
.implements Landroidx/compose/ui/platform/BoundsHelper;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/platform/BoundsHelperApi28Impl;",
        "Landroidx/compose/ui/platform/BoundsHelper;",
        "()V",
        "currentWindowBounds",
        "Landroid/graphics/Rect;",
        "activity",
        "Landroid/app/Activity;",
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


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/platform/BoundsHelperApi28Impl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/BoundsHelperApi28Impl;

    invoke-direct {v0}, Landroidx/compose/ui/platform/BoundsHelperApi28Impl;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/BoundsHelperApi28Impl;->INSTANCE:Landroidx/compose/ui/platform/BoundsHelperApi28Impl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public currentWindowBounds(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 10
    .param p1, "activity"    # Landroid/app/Activity;

    .line 184
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 185
    .local v0, "bounds":Landroid/graphics/Rect;
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 186
    .local v1, "config":Landroid/content/res/Configuration;
    nop

    .line 188
    const/4 v2, 0x1

    const/4 v3, 0x0

    :try_start_0
    const-class v4, Landroid/content/res/Configuration;

    const-string/jumbo v5, "windowConfiguration"

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 187
    nop

    .line 189
    .local v4, "windowConfigField":Ljava/lang/reflect/Field;
    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 190
    invoke-virtual {v4, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 195
    .local v5, "windowConfig":Ljava/lang/Object;
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string/jumbo v7, "null cannot be cast to non-null type android.graphics.Rect"

    if-eqz v6, :cond_0

    .line 196
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v8, "getBounds"

    new-array v9, v3, [Ljava/lang/Class;

    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 197
    .local v6, "getAppBounds":Ljava/lang/reflect/Method;
    new-array v8, v3, [Ljava/lang/Object;

    invoke-virtual {v6, v5, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/graphics/Rect;

    invoke-virtual {v0, v8}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .end local v6    # "getAppBounds":Ljava/lang/reflect/Method;
    goto :goto_3

    .line 199
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v8, "getAppBounds"

    new-array v9, v3, [Ljava/lang/Class;

    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 200
    .restart local v6    # "getAppBounds":Ljava/lang/reflect/Method;
    new-array v8, v3, [Ljava/lang/Object;

    invoke-virtual {v6, v5, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/graphics/Rect;

    invoke-virtual {v0, v8}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .end local v4    # "windowConfigField":Ljava/lang/reflect/Field;
    .end local v5    # "windowConfig":Ljava/lang/Object;
    .end local v6    # "getAppBounds":Ljava/lang/reflect/Method;
    goto :goto_3

    .line 202
    :catch_0
    move-exception v4

    .line 203
    .local v4, "e":Ljava/lang/Exception;
    nop

    .line 207
    nop

    .line 206
    nop

    .line 205
    nop

    .line 204
    instance-of v5, v4, Ljava/lang/NoSuchFieldException;

    if-eqz v5, :cond_1

    move v5, v2

    goto :goto_0

    .line 205
    :cond_1
    instance-of v5, v4, Ljava/lang/NoSuchMethodException;

    :goto_0
    if-eqz v5, :cond_2

    move v5, v2

    goto :goto_1

    .line 206
    :cond_2
    instance-of v5, v4, Ljava/lang/IllegalAccessException;

    :goto_1
    if-eqz v5, :cond_3

    goto :goto_2

    .line 207
    :cond_3
    instance-of v2, v4, Ljava/lang/reflect/InvocationTargetException;

    :goto_2
    if-eqz v2, :cond_c

    .line 208
    invoke-static {p1, v0}, Landroidx/compose/ui/platform/AndroidWindowInfo_androidKt;->access$getRectSizeFromDisplay(Landroid/app/Activity;Landroid/graphics/Rect;)V

    .line 214
    .end local v4    # "e":Ljava/lang/Exception;
    :goto_3
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    .line 218
    .local v2, "platformWindowManager":Landroid/view/WindowManager;
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v4

    .line 219
    .local v4, "currentDisplay":Landroid/view/Display;
    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    .line 220
    .local v5, "realDisplaySize":Landroid/graphics/Point;
    invoke-virtual {v4, v5}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 222
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v6

    if-nez v6, :cond_6

    .line 226
    move-object v6, p1

    check-cast v6, Landroid/content/Context;

    invoke-static {v6}, Landroidx/compose/ui/platform/AndroidWindowInfo_androidKt;->access$getNavigationBarHeight(Landroid/content/Context;)I

    move-result v6

    .line 227
    .local v6, "navigationBarHeight":I
    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v7, v6

    iget v8, v5, Landroid/graphics/Point;->y:I

    if-ne v7, v8, :cond_4

    .line 228
    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v7, v6

    iput v7, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_4

    .line 229
    :cond_4
    iget v7, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v6

    iget v8, v5, Landroid/graphics/Point;->x:I

    if-ne v7, v8, :cond_5

    .line 230
    iget v7, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v6

    iput v7, v0, Landroid/graphics/Rect;->right:I

    goto :goto_4

    .line 231
    :cond_5
    iget v7, v0, Landroid/graphics/Rect;->left:I

    if-ne v7, v6, :cond_6

    .line 232
    iput v3, v0, Landroid/graphics/Rect;->left:I

    .line 235
    .end local v6    # "navigationBarHeight":I
    :cond_6
    :goto_4
    nop

    .line 236
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v6

    iget v7, v5, Landroid/graphics/Point;->x:I

    if-lt v6, v7, :cond_7

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v6

    iget v7, v5, Landroid/graphics/Point;->y:I

    if-ge v6, v7, :cond_b

    .line 237
    :cond_7
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v6

    if-nez v6, :cond_b

    .line 243
    invoke-static {v4}, Landroidx/compose/ui/platform/AndroidWindowInfo_androidKt;->access$getCutoutForDisplay(Landroid/view/Display;)Landroid/view/DisplayCutout;

    move-result-object v6

    .line 244
    .local v6, "displayCutout":Landroid/view/DisplayCutout;
    if-eqz v6, :cond_b

    .line 245
    iget v7, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    move-result v8

    if-ne v7, v8, :cond_8

    .line 246
    iput v3, v0, Landroid/graphics/Rect;->left:I

    .line 248
    :cond_8
    iget v7, v5, Landroid/graphics/Point;->x:I

    iget v8, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v7, v8

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v8

    if-ne v7, v8, :cond_9

    .line 249
    iget v7, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v8

    add-int/2addr v7, v8

    iput v7, v0, Landroid/graphics/Rect;->right:I

    .line 251
    :cond_9
    iget v7, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    move-result v8

    if-ne v7, v8, :cond_a

    .line 252
    iput v3, v0, Landroid/graphics/Rect;->top:I

    .line 254
    :cond_a
    iget v3, v5, Landroid/graphics/Point;->y:I

    iget v7, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v3, v7

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v7

    if-ne v3, v7, :cond_b

    .line 255
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v6}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v7

    add-int/2addr v3, v7

    iput v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 259
    .end local v6    # "displayCutout":Landroid/view/DisplayCutout;
    :cond_b
    return-object v0

    .line 210
    .end local v2    # "platformWindowManager":Landroid/view/WindowManager;
    .end local v5    # "realDisplaySize":Landroid/graphics/Point;
    .local v4, "e":Ljava/lang/Exception;
    :cond_c
    throw v4
.end method
