.class final Landroidx/compose/ui/platform/BoundsHelperApi29Impl;
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
        "Landroidx/compose/ui/platform/BoundsHelperApi29Impl;",
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
.field public static final INSTANCE:Landroidx/compose/ui/platform/BoundsHelperApi29Impl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/BoundsHelperApi29Impl;

    invoke-direct {v0}, Landroidx/compose/ui/platform/BoundsHelperApi29Impl;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/BoundsHelperApi29Impl;->INSTANCE:Landroidx/compose/ui/platform/BoundsHelperApi29Impl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public currentWindowBounds(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 9
    .param p1, "activity"    # Landroid/app/Activity;

    .line 147
    const/4 v0, 0x0

    .line 148
    .local v0, "bounds":Landroid/graphics/Rect;
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 149
    .local v1, "config":Landroid/content/res/Configuration;
    nop

    .line 151
    const/4 v2, 0x1

    :try_start_0
    const-class v3, Landroid/content/res/Configuration;

    const-string/jumbo v4, "windowConfiguration"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 150
    nop

    .line 152
    .local v3, "windowConfigField":Ljava/lang/reflect/Field;
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 153
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 154
    .local v4, "windowConfig":Ljava/lang/Object;
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-string v6, "getBounds"

    const/4 v7, 0x0

    new-array v8, v7, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 155
    .local v5, "getBoundsMethod":Ljava/lang/reflect/Method;
    new-instance v6, Landroid/graphics/Rect;

    new-array v7, v7, [Ljava/lang/Object;

    invoke-virtual {v5, v4, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string/jumbo v8, "null cannot be cast to non-null type android.graphics.Rect"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/graphics/Rect;

    invoke-direct {v6, v7}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .end local v0    # "bounds":Landroid/graphics/Rect;
    .end local v3    # "windowConfigField":Ljava/lang/reflect/Field;
    .end local v4    # "windowConfig":Ljava/lang/Object;
    .end local v5    # "getBoundsMethod":Ljava/lang/reflect/Method;
    .local v6, "bounds":Landroid/graphics/Rect;
    goto :goto_3

    .line 156
    .end local v6    # "bounds":Landroid/graphics/Rect;
    .restart local v0    # "bounds":Landroid/graphics/Rect;
    :catch_0
    move-exception v3

    .line 157
    .local v3, "e":Ljava/lang/Exception;
    nop

    .line 161
    nop

    .line 160
    nop

    .line 159
    nop

    .line 158
    instance-of v4, v3, Ljava/lang/NoSuchFieldException;

    if-eqz v4, :cond_0

    move v4, v2

    goto :goto_0

    .line 159
    :cond_0
    instance-of v4, v3, Ljava/lang/NoSuchMethodException;

    :goto_0
    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_1

    .line 160
    :cond_1
    instance-of v4, v3, Ljava/lang/IllegalAccessException;

    :goto_1
    if-eqz v4, :cond_2

    goto :goto_2

    .line 161
    :cond_2
    instance-of v2, v3, Ljava/lang/reflect/InvocationTargetException;

    :goto_2
    if-eqz v2, :cond_3

    .line 164
    sget-object v2, Landroidx/compose/ui/platform/BoundsHelperApi28Impl;->INSTANCE:Landroidx/compose/ui/platform/BoundsHelperApi28Impl;

    invoke-virtual {v2, p1}, Landroidx/compose/ui/platform/BoundsHelperApi28Impl;->currentWindowBounds(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object v6

    .line 169
    .end local v0    # "bounds":Landroid/graphics/Rect;
    .end local v3    # "e":Ljava/lang/Exception;
    .restart local v6    # "bounds":Landroid/graphics/Rect;
    :goto_3
    return-object v6

    .line 166
    .end local v6    # "bounds":Landroid/graphics/Rect;
    .restart local v0    # "bounds":Landroid/graphics/Rect;
    .restart local v3    # "e":Ljava/lang/Exception;
    :cond_3
    throw v3
.end method
