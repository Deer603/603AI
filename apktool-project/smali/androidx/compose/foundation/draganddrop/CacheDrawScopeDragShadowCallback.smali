.class public final Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;
.super Ljava/lang/Object;
.source "AndroidDragAndDropSource.android.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAndroidDragAndDropSource.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropSource.android.kt\nandroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;",
        "",
        "()V",
        "graphicsLayer",
        "Landroidx/compose/ui/graphics/layer/GraphicsLayer;",
        "cachePicture",
        "Landroidx/compose/ui/draw/DrawResult;",
        "scope",
        "Landroidx/compose/ui/draw/CacheDrawScope;",
        "drawDragShadow",
        "",
        "drawScope",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
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
.field public static final $stable:I


# instance fields
.field private graphicsLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getGraphicsLayer$p(Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;)Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;

    .line 37
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;->graphicsLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    return-object v0
.end method


# virtual methods
.method public final cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;
    .locals 12
    .param p1, "scope"    # Landroidx/compose/ui/draw/CacheDrawScope;

    .line 52
    move-object v0, p1

    .local v0, "$this$cachePicture_u24lambda_u242":Landroidx/compose/ui/draw/CacheDrawScope;
    const/4 v9, 0x0

    .line 53
    .local v9, "$i$a$-with-CacheDrawScopeDragShadowCallback$cachePicture$1":I
    invoke-virtual {p1}, Landroidx/compose/ui/draw/CacheDrawScope;->obtainGraphicsLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    move-result-object v10

    .line 58
    move-object v1, v10

    .local v1, "$this$cachePicture_u24lambda_u242_u24lambda_u241":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    const/4 v11, 0x0

    .line 53
    .local v11, "$i$a$-apply-CacheDrawScopeDragShadowCallback$cachePicture$1$1":I
    sget-object v2, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$1$1;->INSTANCE:Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$1$1;

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v0 .. v8}, Landroidx/compose/ui/draw/CacheDrawScope;->record-TdoYBX4$default(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .end local v1    # "$this$cachePicture_u24lambda_u242_u24lambda_u241":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v11    # "$i$a$-apply-CacheDrawScopeDragShadowCallback$cachePicture$1$1":I
    iput-object v10, p0, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;->graphicsLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 54
    new-instance v1, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$2;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback$cachePicture$1$2;-><init>(Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/draw/CacheDrawScope;->onDrawWithContent(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object v0

    .line 52
    .end local v0    # "$this$cachePicture_u24lambda_u242":Landroidx/compose/ui/draw/CacheDrawScope;
    .end local v9    # "$i$a$-with-CacheDrawScopeDragShadowCallback$cachePicture$1":I
    nop

    .line 55
    return-object v0
.end method

.method public final drawDragShadow(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 5
    .param p1, "drawScope"    # Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 41
    move-object v0, p1

    .local v0, "$this$drawDragShadow_u24lambda_u240":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    const/4 v1, 0x0

    .line 42
    .local v1, "$i$a$-with-CacheDrawScopeDragShadowCallback$drawDragShadow$1":I
    iget-object v2, p0, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;->graphicsLayer:Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 43
    .local v2, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    if-eqz v2, :cond_0

    .line 47
    invoke-static {v0, v2}, Landroidx/compose/ui/graphics/layer/GraphicsLayerKt;->drawLayer(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 49
    .end local v2    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    nop

    .line 41
    .end local v0    # "$this$drawDragShadow_u24lambda_u240":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .end local v1    # "$i$a$-with-CacheDrawScopeDragShadowCallback$drawDragShadow$1":I
    nop

    .line 49
    return-void

    .line 44
    .restart local v0    # "$this$drawDragShadow_u24lambda_u240":Landroidx/compose/ui/graphics/drawscope/DrawScope;
    .restart local v1    # "$i$a$-with-CacheDrawScopeDragShadowCallback$drawDragShadow$1":I
    .restart local v2    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    :cond_0
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 45
    nop

    .line 44
    const-string v4, "No cached drag shadow. Check if the drag source node was rendered first"

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
.end method
