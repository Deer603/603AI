.class public final Landroidx/compose/ui/graphics/layer/LayerManager;
.super Ljava/lang/Object;
.source "LayerManager.android.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/graphics/layer/LayerManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLayerManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,167:1\n1516#2:168\n1#3:169\n41#4,3:170\n44#4,2:198\n231#5,3:173\n200#5,7:176\n211#5,3:184\n214#5,9:188\n234#5:197\n1399#6:183\n1270#6:187\n287#7,6:200\n*S KotlinDebug\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n*L\n82#1:168\n123#1:170,3\n123#1:198,2\n126#1:173,3\n126#1:176,7\n126#1:184,3\n126#1:188,9\n126#1:197\n126#1:183\n126#1:187\n132#1:200,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rJ\u0016\u0010\u0017\u001a\u00020\u00132\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u001b\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/layer/LayerManager;",
        "",
        "canvasHolder",
        "Landroidx/compose/ui/graphics/CanvasHolder;",
        "(Landroidx/compose/ui/graphics/CanvasHolder;)V",
        "getCanvasHolder",
        "()Landroidx/compose/ui/graphics/CanvasHolder;",
        "handler",
        "Landroid/os/Handler;",
        "imageReader",
        "Landroid/media/ImageReader;",
        "layerSet",
        "Landroidx/collection/MutableScatterSet;",
        "Landroidx/compose/ui/graphics/layer/GraphicsLayer;",
        "persistenceIterationInProgress",
        "",
        "postponedReleaseRequests",
        "Landroidx/collection/MutableObjectList;",
        "destroy",
        "",
        "hasImageReader",
        "persist",
        "layer",
        "persistLayers",
        "layers",
        "Landroidx/collection/ScatterSet;",
        "release",
        "updateLayerPersistence",
        "Companion",
        "ui-graphics_release"
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
.field public static final Companion:Landroidx/compose/ui/graphics/layer/LayerManager$Companion;

.field private static final isRobolectric:Z


# instance fields
.field private final canvasHolder:Landroidx/compose/ui/graphics/CanvasHolder;

.field private final handler:Landroid/os/Handler;

.field private imageReader:Landroid/media/ImageReader;

.field private final layerSet:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/ui/graphics/layer/GraphicsLayer;",
            ">;"
        }
    .end annotation
.end field

.field private persistenceIterationInProgress:Z

.field private postponedReleaseRequests:Landroidx/collection/MutableObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectList<",
            "Landroidx/compose/ui/graphics/layer/GraphicsLayer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/graphics/layer/LayerManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/layer/LayerManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/graphics/layer/LayerManager;->Companion:Landroidx/compose/ui/graphics/layer/LayerManager$Companion;

    .line 158
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "robolectric"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Landroidx/compose/ui/graphics/layer/LayerManager;->isRobolectric:Z

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/graphics/CanvasHolder;)V
    .locals 2
    .param p1, "canvasHolder"    # Landroidx/compose/ui/graphics/CanvasHolder;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->canvasHolder:Landroidx/compose/ui/graphics/CanvasHolder;

    .line 40
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->layerSet:Landroidx/collection/MutableScatterSet;

    .line 51
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Landroidx/compose/ui/graphics/layer/LayerManager$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Landroidx/compose/ui/graphics/layer/LayerManager$$ExternalSyntheticLambda1;-><init>(Landroidx/compose/ui/graphics/layer/LayerManager;)V

    invoke-static {v0, v1}, Landroidx/core/os/HandlerCompat;->createAsync(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->handler:Landroid/os/Handler;

    .line 38
    return-void
.end method

.method public static final synthetic access$isRobolectric$cp()Z
    .locals 1

    .line 38
    sget-boolean v0, Landroidx/compose/ui/graphics/layer/LayerManager;->isRobolectric:Z

    return v0
.end method

.method static final handler$lambda$0(Landroidx/compose/ui/graphics/layer/LayerManager;Landroid/os/Message;)Z
    .locals 1
    .param p0, "this$0"    # Landroidx/compose/ui/graphics/layer/LayerManager;
    .param p1, "it"    # Landroid/os/Message;

    .line 52
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->layerSet:Landroidx/collection/MutableScatterSet;

    check-cast v0, Landroidx/collection/ScatterSet;

    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/layer/LayerManager;->persistLayers(Landroidx/collection/ScatterSet;)V

    .line 53
    const/4 v0, 0x1

    return v0
.end method

.method private final persistLayers(Landroidx/collection/ScatterSet;)V
    .locals 31
    .param p1, "layers"    # Landroidx/collection/ScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "Landroidx/compose/ui/graphics/layer/GraphicsLayer;",
            ">;)V"
        }
    .end annotation

    .line 95
    move-object/from16 v0, p0

    const/4 v1, 0x1

    move v2, v1

    .line 101
    .local v2, "requiredOsVersion":Z
    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroidx/collection/ScatterSet;->isNotEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-boolean v4, Landroidx/compose/ui/graphics/layer/LayerManager;->isRobolectric:Z

    if-nez v4, :cond_0

    move v4, v1

    goto :goto_0

    :cond_0
    move v4, v3

    .line 102
    .local v4, "shouldPersistLayers":Z
    :goto_0
    if-eqz v4, :cond_b

    .line 104
    iget-object v5, v0, Landroidx/compose/ui/graphics/layer/LayerManager;->imageReader:Landroid/media/ImageReader;

    if-nez v5, :cond_1

    .line 107
    const/4 v5, 0x3

    invoke-static {v1, v1, v1, v5}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v5

    .line 108
    move-object v6, v5

    .local v6, "$this$persistLayers_u24lambda_u243":Landroid/media/ImageReader;
    const/4 v7, 0x0

    .line 113
    .local v7, "$i$a$-apply-LayerManager$persistLayers$reader$1":I
    nop

    .line 114
    new-instance v8, Landroidx/compose/ui/graphics/layer/LayerManager$$ExternalSyntheticLambda0;

    invoke-direct {v8}, Landroidx/compose/ui/graphics/layer/LayerManager$$ExternalSyntheticLambda0;-><init>()V

    .line 115
    iget-object v9, v0, Landroidx/compose/ui/graphics/layer/LayerManager;->handler:Landroid/os/Handler;

    .line 113
    invoke-virtual {v6, v8, v9}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 117
    nop

    .line 108
    .end local v6    # "$this$persistLayers_u24lambda_u243":Landroid/media/ImageReader;
    .end local v7    # "$i$a$-apply-LayerManager$persistLayers$reader$1":I
    nop

    .line 118
    nop

    .line 169
    .local v6, "it":Landroid/media/ImageReader;
    const/4 v7, 0x0

    .line 118
    .local v7, "$i$a$-also-LayerManager$persistLayers$reader$2":I
    iput-object v6, v0, Landroidx/compose/ui/graphics/layer/LayerManager;->imageReader:Landroid/media/ImageReader;

    .line 104
    .end local v6    # "it":Landroid/media/ImageReader;
    .end local v7    # "$i$a$-also-LayerManager$persistLayers$reader$2":I
    :cond_1
    nop

    .line 103
    nop

    .line 119
    .local v5, "reader":Landroid/media/ImageReader;
    invoke-virtual {v5}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v6

    .line 120
    .local v6, "surface":Landroid/view/Surface;
    sget-object v7, Landroidx/compose/ui/graphics/layer/LockHardwareCanvasHelper;->INSTANCE:Landroidx/compose/ui/graphics/layer/LockHardwareCanvasHelper;

    invoke-virtual {v7, v6}, Landroidx/compose/ui/graphics/layer/LockHardwareCanvasHelper;->lockHardwareCanvas(Landroid/view/Surface;)Landroid/graphics/Canvas;

    move-result-object v7

    .line 122
    .local v7, "canvas":Landroid/graphics/Canvas;
    iput-boolean v1, v0, Landroidx/compose/ui/graphics/layer/LayerManager;->persistenceIterationInProgress:Z

    .line 123
    iget-object v8, v0, Landroidx/compose/ui/graphics/layer/LayerManager;->canvasHolder:Landroidx/compose/ui/graphics/CanvasHolder;

    .local v8, "this_$iv":Landroidx/compose/ui/graphics/CanvasHolder;
    const/4 v9, 0x0

    .line 170
    .local v9, "$i$f$drawInto":I
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/CanvasHolder;->getAndroidCanvas()Landroidx/compose/ui/graphics/AndroidCanvas;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/AndroidCanvas;->getInternalCanvas()Landroid/graphics/Canvas;

    move-result-object v10

    .line 171
    .local v10, "previousCanvas$iv":Landroid/graphics/Canvas;
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/CanvasHolder;->getAndroidCanvas()Landroidx/compose/ui/graphics/AndroidCanvas;

    move-result-object v11

    invoke-virtual {v11, v7}, Landroidx/compose/ui/graphics/AndroidCanvas;->setInternalCanvas(Landroid/graphics/Canvas;)V

    .line 172
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/CanvasHolder;->getAndroidCanvas()Landroidx/compose/ui/graphics/AndroidCanvas;

    move-result-object v11

    check-cast v11, Landroidx/compose/ui/graphics/Canvas;

    .local v11, "$this$persistLayers_u24lambda_u246":Landroidx/compose/ui/graphics/Canvas;
    const/4 v12, 0x0

    .line 124
    .local v12, "$i$a$-drawInto-LayerManager$persistLayers$1":I
    invoke-virtual {v7}, Landroid/graphics/Canvas;->save()I

    .line 125
    invoke-virtual {v7, v3, v3, v1, v1}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 126
    move-object/from16 v13, p1

    .local v13, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v14, 0x0

    .line 173
    .local v14, "$i$f$forEach":I
    nop

    .line 174
    iget-object v15, v13, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 175
    .local v15, "elements$iv":[Ljava/lang/Object;
    move-object/from16 v16, v13

    .local v16, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v17, 0x0

    .line 176
    .local v17, "$i$f$forEachIndex":I
    nop

    .line 177
    move-object/from16 v1, v16

    .end local v16    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v1, "this_$iv$iv":Landroidx/collection/ScatterSet;
    iget-object v3, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 178
    .local v3, "m$iv$iv":[J
    move-object/from16 v18, v1

    .end local v1    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v18, "this_$iv$iv":Landroidx/collection/ScatterSet;
    array-length v1, v3

    add-int/lit8 v1, v1, -0x2

    .line 180
    .local v1, "lastIndex$iv$iv":I
    move/from16 v19, v2

    .end local v2    # "requiredOsVersion":Z
    .local v19, "requiredOsVersion":Z
    const/4 v2, 0x0

    .local v2, "i$iv$iv":I
    if-gt v2, v1, :cond_6

    .line 181
    :goto_1
    aget-wide v20, v3, v2

    .line 182
    .local v20, "slot$iv$iv":J
    move-wide/from16 v22, v20

    .local v22, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v24, 0x0

    .line 183
    .local v24, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v26, v3

    move/from16 v25, v4

    move-wide/from16 v3, v22

    move-object/from16 v22, v8

    move/from16 v23, v9

    .end local v4    # "shouldPersistLayers":Z
    .end local v8    # "this_$iv":Landroidx/compose/ui/graphics/CanvasHolder;
    .end local v9    # "$i$f$drawInto":I
    .local v3, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v22, "this_$iv":Landroidx/compose/ui/graphics/CanvasHolder;
    .local v23, "$i$f$drawInto":I
    .local v25, "shouldPersistLayers":Z
    .local v26, "m$iv$iv":[J
    not-long v8, v3

    const/16 v27, 0x7

    shl-long v8, v8, v27

    and-long/2addr v8, v3

    const-wide v27, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v3, v8, v27

    .line 182
    .end local v3    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v24    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v3, v3, v27

    if-eqz v3, :cond_5

    .line 184
    sub-int v3, v2, v1

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v4, 0x8

    rsub-int/lit8 v3, v3, 0x8

    .line 185
    .local v3, "bitCount$iv$iv":I
    const/4 v8, 0x0

    .local v8, "j$iv$iv":I
    :goto_2
    if-ge v8, v3, :cond_4

    .line 186
    const-wide/16 v27, 0xff

    and-long v27, v20, v27

    .local v27, "value$iv$iv$iv":J
    const/4 v9, 0x0

    .line 187
    .local v9, "$i$f$isFull":I
    const-wide/16 v29, 0x80

    cmp-long v24, v27, v29

    if-gez v24, :cond_2

    const/4 v9, 0x1

    goto :goto_3

    :cond_2
    const/4 v9, 0x0

    .line 186
    .end local v9    # "$i$f$isFull":I
    .end local v27    # "value$iv$iv$iv":J
    :goto_3
    if-eqz v9, :cond_3

    .line 188
    shl-int/lit8 v9, v2, 0x3

    add-int/2addr v9, v8

    .line 189
    .local v9, "index$iv$iv":I
    move/from16 v24, v9

    .local v24, "index$iv":I
    const/16 v27, 0x0

    .line 175
    .local v27, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    aget-object v28, v15, v24

    move/from16 v29, v4

    move-object/from16 v4, v28

    check-cast v4, Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .local v4, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    const/16 v28, 0x0

    .line 126
    .local v28, "$i$a$-forEach-LayerManager$persistLayers$1$1":I
    invoke-virtual {v4, v11}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->drawForPersistence$ui_graphics_release(Landroidx/compose/ui/graphics/Canvas;)V

    .line 175
    .end local v4    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v28    # "$i$a$-forEach-LayerManager$persistLayers$1$1":I
    nop

    .line 189
    .end local v24    # "index$iv":I
    .end local v27    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_4

    .line 186
    .end local v9    # "index$iv$iv":I
    :cond_3
    move/from16 v29, v4

    .line 191
    :goto_4
    shr-long v20, v20, v29

    .line 185
    add-int/lit8 v8, v8, 0x1

    move/from16 v4, v29

    goto :goto_2

    :cond_4
    move/from16 v29, v4

    .line 193
    .end local v8    # "j$iv$iv":I
    if-ne v3, v4, :cond_8

    .line 180
    .end local v3    # "bitCount$iv$iv":I
    .end local v20    # "slot$iv$iv":J
    :cond_5
    if-eq v2, v1, :cond_7

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v8, v22

    move/from16 v9, v23

    move/from16 v4, v25

    move-object/from16 v3, v26

    goto :goto_1

    .end local v22    # "this_$iv":Landroidx/compose/ui/graphics/CanvasHolder;
    .end local v23    # "$i$f$drawInto":I
    .end local v25    # "shouldPersistLayers":Z
    .end local v26    # "m$iv$iv":[J
    .local v3, "m$iv$iv":[J
    .local v4, "shouldPersistLayers":Z
    .local v8, "this_$iv":Landroidx/compose/ui/graphics/CanvasHolder;
    .local v9, "$i$f$drawInto":I
    :cond_6
    move-object/from16 v26, v3

    move/from16 v25, v4

    move-object/from16 v22, v8

    move/from16 v23, v9

    .line 196
    .end local v2    # "i$iv$iv":I
    .end local v3    # "m$iv$iv":[J
    .end local v4    # "shouldPersistLayers":Z
    .end local v8    # "this_$iv":Landroidx/compose/ui/graphics/CanvasHolder;
    .end local v9    # "$i$f$drawInto":I
    .restart local v22    # "this_$iv":Landroidx/compose/ui/graphics/CanvasHolder;
    .restart local v23    # "$i$f$drawInto":I
    .restart local v25    # "shouldPersistLayers":Z
    .restart local v26    # "m$iv$iv":[J
    :cond_7
    nop

    .line 197
    .end local v1    # "lastIndex$iv$iv":I
    .end local v17    # "$i$f$forEachIndex":I
    .end local v18    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v26    # "m$iv$iv":[J
    :cond_8
    nop

    .line 127
    .end local v13    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v14    # "$i$f$forEach":I
    .end local v15    # "elements$iv":[Ljava/lang/Object;
    invoke-virtual {v7}, Landroid/graphics/Canvas;->restore()V

    .line 128
    nop

    .line 172
    .end local v11    # "$this$persistLayers_u24lambda_u246":Landroidx/compose/ui/graphics/Canvas;
    .end local v12    # "$i$a$-drawInto-LayerManager$persistLayers$1":I
    nop

    .line 198
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/graphics/CanvasHolder;->getAndroidCanvas()Landroidx/compose/ui/graphics/AndroidCanvas;

    move-result-object v1

    invoke-virtual {v1, v10}, Landroidx/compose/ui/graphics/AndroidCanvas;->setInternalCanvas(Landroid/graphics/Canvas;)V

    .line 199
    nop

    .line 129
    .end local v10    # "previousCanvas$iv":Landroid/graphics/Canvas;
    .end local v22    # "this_$iv":Landroidx/compose/ui/graphics/CanvasHolder;
    .end local v23    # "$i$f$drawInto":I
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/compose/ui/graphics/layer/LayerManager;->persistenceIterationInProgress:Z

    .line 130
    iget-object v1, v0, Landroidx/compose/ui/graphics/layer/LayerManager;->postponedReleaseRequests:Landroidx/collection/MutableObjectList;

    .line 131
    .local v1, "requests":Landroidx/collection/MutableObjectList;
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroidx/collection/MutableObjectList;->isNotEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 132
    move-object v2, v1

    check-cast v2, Landroidx/collection/ObjectList;

    .local v2, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v3, 0x0

    .line 200
    .local v3, "$i$f$forEach":I
    nop

    .line 201
    iget-object v4, v2, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 202
    .local v4, "content$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .local v8, "i$iv":I
    iget v9, v2, Landroidx/collection/ObjectList;->_size:I

    :goto_5
    if-ge v8, v9, :cond_9

    .line 203
    aget-object v10, v4, v8

    check-cast v10, Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .local v10, "it":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    const/4 v11, 0x0

    .line 132
    .local v11, "$i$a$-forEach-LayerManager$persistLayers$2":I
    invoke-virtual {v0, v10}, Landroidx/compose/ui/graphics/layer/LayerManager;->release(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V

    .line 203
    .end local v10    # "it":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v11    # "$i$a$-forEach-LayerManager$persistLayers$2":I
    nop

    .line 202
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    .line 205
    .end local v8    # "i$iv":I
    :cond_9
    nop

    .line 133
    .end local v2    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v3    # "$i$f$forEach":I
    .end local v4    # "content$iv":[Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/collection/MutableObjectList;->clear()V

    .line 135
    :cond_a
    invoke-virtual {v6, v7}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    goto :goto_6

    .line 102
    .end local v1    # "requests":Landroidx/collection/MutableObjectList;
    .end local v5    # "reader":Landroid/media/ImageReader;
    .end local v6    # "surface":Landroid/view/Surface;
    .end local v7    # "canvas":Landroid/graphics/Canvas;
    .end local v19    # "requiredOsVersion":Z
    .end local v25    # "shouldPersistLayers":Z
    .local v2, "requiredOsVersion":Z
    .local v4, "shouldPersistLayers":Z
    :cond_b
    move/from16 v19, v2

    move/from16 v25, v4

    .line 137
    .end local v2    # "requiredOsVersion":Z
    .end local v4    # "shouldPersistLayers":Z
    .restart local v19    # "requiredOsVersion":Z
    .restart local v25    # "shouldPersistLayers":Z
    :goto_6
    return-void
.end method

.method static final persistLayers$lambda$3$lambda$2(Landroid/media/ImageReader;)V
    .locals 1
    .param p0, "it"    # Landroid/media/ImageReader;

    .line 114
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/media/ImageReader;->acquireLatestImage()Landroid/media/Image;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/Image;->close()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    .line 140
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->imageReader:Landroid/media/ImageReader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    .line 141
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->imageReader:Landroid/media/ImageReader;

    .line 142
    return-void
.end method

.method public final getCanvasHolder()Landroidx/compose/ui/graphics/CanvasHolder;
    .locals 1

    .line 38
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->canvasHolder:Landroidx/compose/ui/graphics/CanvasHolder;

    return-object v0
.end method

.method public final hasImageReader()Z
    .locals 1

    .line 144
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->imageReader:Landroid/media/ImageReader;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final persist(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 2
    .param p1, "layer"    # Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 60
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->layerSet:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 61
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 68
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->handler:Landroid/os/Handler;

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 70
    :cond_0
    return-void
.end method

.method public final release(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V
    .locals 5
    .param p1, "layer"    # Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 73
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->persistenceIterationInProgress:Z

    if-nez v0, :cond_0

    .line 74
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->layerSet:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 75
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->discardDisplayList$ui_graphics_release()V

    goto :goto_0

    .line 81
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->postponedReleaseRequests:Landroidx/collection/MutableObjectList;

    if-nez v0, :cond_1

    .line 82
    const/4 v0, 0x0

    .line 168
    .local v0, "$i$f$mutableObjectListOf":I
    new-instance v1, Landroidx/collection/MutableObjectList;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Landroidx/collection/MutableObjectList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    .end local v0    # "$i$f$mutableObjectListOf":I
    move-object v0, v1

    .line 169
    .local v0, "it":Landroidx/collection/MutableObjectList;
    const/4 v2, 0x0

    .line 82
    .local v2, "$i$a$-also-LayerManager$release$requests$1":I
    iput-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->postponedReleaseRequests:Landroidx/collection/MutableObjectList;

    .line 81
    .end local v0    # "it":Landroidx/collection/MutableObjectList;
    .end local v2    # "$i$a$-also-LayerManager$release$requests$1":I
    :cond_1
    nop

    .line 80
    nop

    .line 83
    .local v0, "requests":Landroidx/collection/MutableObjectList;
    invoke-virtual {v0, p1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 85
    .end local v0    # "requests":Landroidx/collection/MutableObjectList;
    :cond_2
    :goto_0
    return-void
.end method

.method public final updateLayerPersistence()V
    .locals 1

    .line 153
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/layer/LayerManager;->destroy()V

    .line 154
    iget-object v0, p0, Landroidx/compose/ui/graphics/layer/LayerManager;->layerSet:Landroidx/collection/MutableScatterSet;

    check-cast v0, Landroidx/collection/ScatterSet;

    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/layer/LayerManager;->persistLayers(Landroidx/collection/ScatterSet;)V

    .line 155
    return-void
.end method
