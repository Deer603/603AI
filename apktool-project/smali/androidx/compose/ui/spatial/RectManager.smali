.class public final Landroidx/compose/ui/spatial/RectManager;
.super Ljava/lang/Object;
.source "RectManager.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 12 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,547:1\n1516#2:548\n544#3:549\n540#3:607\n544#3:608\n287#4,6:550\n725#5,7:556\n732#5,4:564\n736#5,7:569\n835#6:563\n810#6:568\n207#7:576\n207#7:592\n423#8,9:577\n423#8,9:593\n54#9:586\n59#9:588\n85#10:587\n90#10:589\n80#10:591\n53#10,3:604\n30#11:590\n159#12:602\n30#13:603\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n*L\n50#1:548\n75#1:549\n425#1:607\n426#1:608\n90#1:550,6\n91#1:556,7\n91#1:564,4\n91#1:569,7\n91#1:563\n91#1:568\n213#1:576\n303#1:592\n213#1:577,9\n303#1:593,9\n249#1:586\n250#1:588\n249#1:587\n250#1:589\n288#1:591\n402#1:604,3\n288#1:590\n402#1:602\n402#1:603\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u000bJ8\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u001dH\u0002J*\u0010(\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020\u000fH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0006\u0010.\u001a\u00020\u000bJ\u000e\u0010/\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J\u001d\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001dH\u0000\u00a2\u0006\u0002\u00083J\u000e\u00104\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J(\u00105\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020\u000f\u00f8\u0001\u0000\u00a2\u0006\u0004\u00086\u0010,J\u0016\u00107\u001a\u0004\u0018\u00010\u00012\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nJ:\u00109\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0=J:\u0010>\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0=J\u000e\u0010?\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000fJ\u0010\u0010B\u001a\u00020\u000b2\u0008\u0010C\u001a\u0004\u0018\u00010\u0001J(\u0010D\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u00020*2\u0006\u0010G\u001a\u00020H\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008I\u0010JJ\u0014\u0010K\u001a\u00020\u000b*\u00020L2\u0006\u0010M\u001a\u00020\u0007H\u0002J\u0019\u0010N\u001a\u00020**\u00020\u0004H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008O\u0010PJ\u0019\u0010Q\u001a\u00020**\u00020LH\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008R\u0010SR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006T"
    }
    d2 = {
        "Landroidx/compose/ui/spatial/RectManager;",
        "",
        "layoutNodes",
        "Landroidx/collection/IntObjectMap;",
        "Landroidx/compose/ui/node/LayoutNode;",
        "(Landroidx/collection/IntObjectMap;)V",
        "cachedRect",
        "Landroidx/compose/ui/geometry/MutableRect;",
        "callbacks",
        "Landroidx/collection/MutableObjectList;",
        "Lkotlin/Function0;",
        "",
        "dispatchLambda",
        "dispatchToken",
        "isDirty",
        "",
        "isFragmented",
        "isScreenOrWindowDirty",
        "rects",
        "Landroidx/compose/ui/spatial/RectList;",
        "getRects",
        "()Landroidx/compose/ui/spatial/RectList;",
        "scheduledDispatchDeadline",
        "",
        "throttledCallbacks",
        "Landroidx/compose/ui/spatial/ThrottledCallbacks;",
        "currentRectInfo",
        "Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
        "id",
        "",
        "node",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "dispatchCallbacks",
        "insertOrUpdate",
        "layoutNode",
        "firstPlacement",
        "l",
        "t",
        "r",
        "b",
        "insertOrUpdateTransformedNode",
        "position",
        "Landroidx/compose/ui/unit/IntOffset;",
        "insertOrUpdateTransformedNode-70tqf50",
        "(Landroidx/compose/ui/node/LayoutNode;JZ)V",
        "insertOrUpdateTransformedNodeSubhierarchy",
        "invalidate",
        "invalidateCallbacksFor",
        "isTargetDrawnFirst",
        "targetId",
        "otherId",
        "isTargetDrawnFirst$ui_release",
        "onLayoutLayerPositionalPropertiesChanged",
        "onLayoutPositionChanged",
        "onLayoutPositionChanged-70tqf50",
        "registerOnChangedCallback",
        "callback",
        "registerOnGlobalLayoutCallback",
        "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;",
        "throttleMillis",
        "debounceMillis",
        "Lkotlin/Function1;",
        "registerOnRectChangedCallback",
        "remove",
        "scheduleDebounceCallback",
        "ensureSomethingScheduled",
        "unregisterOnChangedCallback",
        "token",
        "updateOffsets",
        "screenOffset",
        "windowOffset",
        "viewToWindowMatrix",
        "Landroidx/compose/ui/graphics/Matrix;",
        "updateOffsets-ucfNpQE",
        "(JJ[F)V",
        "boundingRectInRoot",
        "Landroidx/compose/ui/node/NodeCoordinator;",
        "rect",
        "outerToInnerOffset",
        "outerToInnerOffset-Bjo55l4",
        "(Landroidx/compose/ui/node/LayoutNode;)J",
        "positionInRoot",
        "positionInRoot-Bjo55l4",
        "(Landroidx/compose/ui/node/NodeCoordinator;)J",
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
.field public static final $stable:I


# instance fields
.field private final cachedRect:Landroidx/compose/ui/geometry/MutableRect;

.field private final callbacks:Landroidx/collection/MutableObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectList<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private final dispatchLambda:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private dispatchToken:Ljava/lang/Object;

.field private isDirty:Z

.field private isFragmented:Z

.field private isScreenOrWindowDirty:Z

.field private final layoutNodes:Landroidx/collection/IntObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/IntObjectMap<",
            "Landroidx/compose/ui/node/LayoutNode;",
            ">;"
        }
    .end annotation
.end field

.field private final rects:Landroidx/compose/ui/spatial/RectList;

.field private scheduledDispatchDeadline:J

.field private final throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/spatial/RectManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Landroidx/compose/ui/spatial/RectManager;-><init>(Landroidx/collection/IntObjectMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/collection/IntObjectMap;)V
    .locals 5
    .param p1, "layoutNodes"    # Landroidx/collection/IntObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/IntObjectMap<",
            "Landroidx/compose/ui/node/LayoutNode;",
            ">;)V"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Landroidx/compose/ui/spatial/RectManager;->layoutNodes:Landroidx/collection/IntObjectMap;

    .line 47
    new-instance v0, Landroidx/compose/ui/spatial/RectList;

    invoke-direct {v0}, Landroidx/compose/ui/spatial/RectList;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    .line 49
    new-instance v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;

    invoke-direct {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    .line 50
    const/4 v0, 0x0

    .line 548
    .local v0, "$i$f$mutableObjectListOf":I
    new-instance v1, Landroidx/collection/MutableObjectList;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Landroidx/collection/MutableObjectList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    .end local v0    # "$i$f$mutableObjectListOf":I
    iput-object v1, p0, Landroidx/compose/ui/spatial/RectManager;->callbacks:Landroidx/collection/MutableObjectList;

    .line 55
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/compose/ui/spatial/RectManager;->scheduledDispatchDeadline:J

    .line 56
    new-instance v0, Landroidx/compose/ui/spatial/RectManager$dispatchLambda$1;

    invoke-direct {v0, p0}, Landroidx/compose/ui/spatial/RectManager$dispatchLambda$1;-><init>(Landroidx/compose/ui/spatial/RectManager;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    iput-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->dispatchLambda:Lkotlin/jvm/functions/Function0;

    .line 309
    new-instance v0, Landroidx/compose/ui/geometry/MutableRect;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Landroidx/compose/ui/geometry/MutableRect;-><init>(FFFF)V

    iput-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->cachedRect:Landroidx/compose/ui/geometry/MutableRect;

    .line 43
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/collection/IntObjectMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 43
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 45
    invoke-static {}, Landroidx/collection/IntObjectMapKt;->intObjectMapOf()Landroidx/collection/IntObjectMap;

    move-result-object p1

    .line 43
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/spatial/RectManager;-><init>(Landroidx/collection/IntObjectMap;)V

    .line 46
    return-void
.end method

.method public static final synthetic access$getThrottledCallbacks$p(Landroidx/compose/ui/spatial/RectManager;)Landroidx/compose/ui/spatial/ThrottledCallbacks;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/spatial/RectManager;

    .line 43
    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    return-object v0
.end method

.method public static final synthetic access$setDispatchToken$p(Landroidx/compose/ui/spatial/RectManager;Ljava/lang/Object;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/spatial/RectManager;
    .param p1, "<set-?>"    # Ljava/lang/Object;

    .line 43
    iput-object p1, p0, Landroidx/compose/ui/spatial/RectManager;->dispatchToken:Ljava/lang/Object;

    return-void
.end method

.method private final boundingRectInRoot(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;)V
    .locals 18
    .param p1, "$this$boundingRectInRoot"    # Landroidx/compose/ui/node/NodeCoordinator;
    .param p2, "rect"    # Landroidx/compose/ui/geometry/MutableRect;

    .line 399
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    .line 400
    .local v1, "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    .line 401
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->getLayer()Landroidx/compose/ui/node/OwnedLayer;

    move-result-object v2

    .line 402
    .local v2, "layer":Landroidx/compose/ui/node/OwnedLayer;
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    move-result-wide v3

    .local v3, "$this$toOffset_u2d_u2dgyyYBs$iv":J
    const/4 v5, 0x0

    .line 602
    .local v5, "$i$f$toOffset--gyyYBs":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v6

    int-to-float v6, v6

    .local v6, "x$iv$iv":F
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v7

    int-to-float v7, v7

    .local v7, "y$iv$iv":F
    const/4 v8, 0x0

    .line 603
    .local v8, "$i$f$Offset":I
    const/4 v9, 0x0

    .line 604
    .local v9, "$i$f$packFloats":I
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v10, v10

    .line 605
    .local v10, "v1$iv$iv$iv":J
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v12, v12

    .line 606
    .local v12, "v2$iv$iv$iv":J
    const/16 v14, 0x20

    shl-long v14, v10, v14

    const-wide v16, 0xffffffffL

    and-long v16, v12, v16

    or-long v9, v14, v16

    .line 603
    .end local v9    # "$i$f$packFloats":I
    .end local v10    # "v1$iv$iv$iv":J
    .end local v12    # "v2$iv$iv$iv":J
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v6

    .line 602
    .end local v6    # "x$iv$iv":F
    .end local v7    # "y$iv$iv":F
    .end local v8    # "$i$f$Offset":I
    nop

    .line 402
    .end local v3    # "$this$toOffset_u2d_u2dgyyYBs$iv":J
    .end local v5    # "$i$f$toOffset--gyyYBs":I
    invoke-virtual {v0, v6, v7}, Landroidx/compose/ui/geometry/MutableRect;->translate-k-4lQ0M(J)V

    .line 403
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->getWrappedBy$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    .line 404
    if-eqz v2, :cond_0

    .line 405
    invoke-interface {v2}, Landroidx/compose/ui/node/OwnedLayer;->getUnderlyingMatrix-sQKQjiQ()[F

    move-result-object v3

    .line 406
    .local v3, "matrix":[F
    invoke-static {v3}, Landroidx/compose/ui/graphics/MatrixKt;->isIdentity-58bKbWc([F)Z

    move-result v4

    if-nez v4, :cond_0

    .line 407
    invoke-static {v3, v0}, Landroidx/compose/ui/graphics/Matrix;->map-impl([FLandroidx/compose/ui/geometry/MutableRect;)V

    .end local v2    # "layer":Landroidx/compose/ui/node/OwnedLayer;
    .end local v3    # "matrix":[F
    goto :goto_0

    .line 411
    :cond_1
    return-void
.end method

.method private final insertOrUpdate(Landroidx/compose/ui/node/LayoutNode;ZIIII)V
    .locals 11
    .param p1, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;
    .param p2, "firstPlacement"    # Z
    .param p3, "l"    # I
    .param p4, "t"    # I
    .param p5, "r"    # I
    .param p6, "b"    # I

    .line 360
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getSemanticsId()I

    move-result v1

    .line 361
    .local v1, "id":I
    if-nez p2, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    move v2, p3

    move v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/spatial/RectList;->move(IIIII)Z

    move-result v0

    if-nez v0, :cond_2

    .line 362
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getSemanticsId()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    move v6, v0

    .line 363
    .local v6, "parentId":I
    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    .line 364
    nop

    .line 365
    nop

    .line 366
    nop

    .line 367
    nop

    .line 368
    nop

    .line 369
    nop

    .line 363
    const/16 v9, 0xc0

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v2, p3

    move v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    invoke-static/range {v0 .. v10}, Landroidx/compose/ui/spatial/RectList;->insert$default(Landroidx/compose/ui/spatial/RectList;IIIIIIZZILjava/lang/Object;)V

    .line 372
    .end local v6    # "parentId":I
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/spatial/RectManager;->invalidate()V

    .line 373
    return-void
.end method

.method private final insertOrUpdateTransformedNode-70tqf50(Landroidx/compose/ui/node/LayoutNode;JZ)V
    .locals 18
    .param p1, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;
    .param p2, "position"    # J
    .param p4, "firstPlacement"    # Z

    .line 316
    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    .line 317
    .local v1, "coord":Landroidx/compose/ui/node/NodeCoordinator;
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/node/LayoutNode;->getMeasurePassDelegate$ui_release()Landroidx/compose/ui/node/MeasurePassDelegate;

    move-result-object v2

    .line 318
    .local v2, "delegate":Landroidx/compose/ui/node/MeasurePassDelegate;
    invoke-virtual {v2}, Landroidx/compose/ui/node/MeasurePassDelegate;->getMeasuredWidth()I

    move-result v3

    .line 319
    .local v3, "width":I
    invoke-virtual {v2}, Landroidx/compose/ui/node/MeasurePassDelegate;->getMeasuredHeight()I

    move-result v4

    .line 320
    .local v4, "height":I
    iget-object v5, v0, Landroidx/compose/ui/spatial/RectManager;->cachedRect:Landroidx/compose/ui/geometry/MutableRect;

    .line 322
    .local v5, "rect":Landroidx/compose/ui/geometry/MutableRect;
    nop

    .line 323
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v6

    int-to-float v6, v6

    .line 324
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v7

    int-to-float v7, v7

    .line 325
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v8

    add-int/2addr v8, v3

    int-to-float v8, v8

    .line 326
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v9

    add-int/2addr v9, v4

    int-to-float v9, v9

    .line 322
    invoke-virtual {v5, v6, v7, v8, v9}, Landroidx/compose/ui/geometry/MutableRect;->set(FFFF)V

    .line 329
    invoke-direct {v0, v1, v5}, Landroidx/compose/ui/spatial/RectManager;->boundingRectInRoot(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;)V

    .line 331
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/MutableRect;->getLeft()F

    move-result v6

    float-to-int v9, v6

    .line 332
    .local v9, "l":I
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/MutableRect;->getTop()F

    move-result v6

    float-to-int v10, v6

    .line 333
    .local v10, "t":I
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/MutableRect;->getRight()F

    move-result v6

    float-to-int v11, v6

    .line 334
    .local v11, "r":I
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/MutableRect;->getBottom()F

    move-result v6

    float-to-int v12, v6

    .line 335
    .local v12, "b":I
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/node/LayoutNode;->getSemanticsId()I

    move-result v8

    .line 338
    .local v8, "id":I
    if-nez p4, :cond_0

    iget-object v7, v0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    invoke-virtual/range {v7 .. v12}, Landroidx/compose/ui/spatial/RectList;->update(IIIII)Z

    move-result v6

    if-nez v6, :cond_2

    .line 339
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getSemanticsId()I

    move-result v6

    goto :goto_0

    :cond_1
    const/4 v6, -0x1

    :goto_0
    move v13, v6

    .line 340
    .local v13, "parentId":I
    iget-object v7, v0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    .line 341
    nop

    .line 342
    nop

    .line 343
    nop

    .line 344
    nop

    .line 345
    nop

    .line 346
    nop

    .line 340
    const/16 v16, 0xc0

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v7 .. v17}, Landroidx/compose/ui/spatial/RectList;->insert$default(Landroidx/compose/ui/spatial/RectList;IIIIIIZZILjava/lang/Object;)V

    .line 349
    .end local v13    # "parentId":I
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/RectManager;->invalidate()V

    .line 350
    return-void
.end method

.method private final insertOrUpdateTransformedNodeSubhierarchy(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 12
    .param p1, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;

    .line 303
    move-object v0, p1

    .local v0, "this_$iv":Landroidx/compose/ui/node/LayoutNode;
    const/4 v1, 0x0

    .line 592
    .local v1, "$i$f$forEachChild":I
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->get_children$ui_release()Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v2

    .local v2, "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v3, 0x0

    .line 593
    .local v3, "$i$f$forEach":I
    nop

    .line 594
    const/4 v4, 0x0

    .line 595
    .local v4, "i$iv$iv":I
    iget-object v5, v2, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 596
    .local v5, "content$iv$iv":[Ljava/lang/Object;
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v6

    .line 597
    .local v6, "size$iv$iv":I
    :goto_0
    if-ge v4, v6, :cond_0

    .line 598
    aget-object v7, v5, v4

    check-cast v7, Landroidx/compose/ui/node/LayoutNode;

    .local v7, "it":Landroidx/compose/ui/node/LayoutNode;
    const/4 v8, 0x0

    .line 304
    .local v8, "$i$a$-forEachChild-RectManager$insertOrUpdateTransformedNodeSubhierarchy$1":I
    invoke-virtual {v7}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    move-result-wide v9

    const/4 v11, 0x0

    invoke-direct {p0, v7, v9, v10, v11}, Landroidx/compose/ui/spatial/RectManager;->insertOrUpdateTransformedNode-70tqf50(Landroidx/compose/ui/node/LayoutNode;JZ)V

    .line 305
    invoke-direct {p0, v7}, Landroidx/compose/ui/spatial/RectManager;->insertOrUpdateTransformedNodeSubhierarchy(Landroidx/compose/ui/node/LayoutNode;)V

    .line 306
    nop

    .line 598
    .end local v7    # "it":Landroidx/compose/ui/node/LayoutNode;
    .end local v8    # "$i$a$-forEachChild-RectManager$insertOrUpdateTransformedNodeSubhierarchy$1":I
    nop

    .line 599
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 601
    :cond_0
    nop

    .line 592
    .end local v2    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v3    # "$i$f$forEach":I
    .end local v4    # "i$iv$iv":I
    .end local v5    # "content$iv$iv":[Ljava/lang/Object;
    .end local v6    # "size$iv$iv":I
    nop

    .line 307
    .end local v0    # "this_$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v1    # "$i$f$forEachChild":I
    return-void
.end method

.method private final outerToInnerOffset-Bjo55l4(Landroidx/compose/ui/node/LayoutNode;)J
    .locals 12
    .param p1, "$this$outerToInnerOffset_u2dBjo55l4"    # Landroidx/compose/ui/node/LayoutNode;

    .line 414
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    .line 415
    .local v0, "terminator":Landroidx/compose/ui/node/NodeCoordinator;
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v1

    .line 416
    .local v1, "position":J
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getInnerCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v3

    .line 417
    .local v3, "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    :cond_0
    :goto_0
    if-eqz v3, :cond_4

    .line 418
    if-eq v3, v0, :cond_4

    .line 419
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->getLayer()Landroidx/compose/ui/node/OwnedLayer;

    move-result-object v4

    .line 420
    .local v4, "layer":Landroidx/compose/ui/node/OwnedLayer;
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    move-result-wide v5

    invoke-static {v1, v2, v5, v6}, Landroidx/compose/ui/unit/IntOffsetKt;->plus-Nv-tHpc(JJ)J

    move-result-wide v1

    .line 421
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->getWrappedBy$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v3

    .line 422
    if-eqz v4, :cond_0

    .line 423
    invoke-interface {v4}, Landroidx/compose/ui/node/OwnedLayer;->getUnderlyingMatrix-sQKQjiQ()[F

    move-result-object v5

    .line 424
    .local v5, "matrix":[F
    invoke-static {v5}, Landroidx/compose/ui/spatial/RectManagerKt;->access$analyzeComponents-58bKbWc([F)I

    move-result v6

    .line 425
    .local v6, "analysis":I
    move v7, v6

    .local v7, "$this$isIdentity$iv":I
    const/4 v8, 0x0

    .line 607
    .local v8, "$i$f$isIdentity":I
    const/4 v9, 0x3

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-ne v7, v9, :cond_1

    move v7, v10

    goto :goto_1

    :cond_1
    move v7, v11

    .line 425
    .end local v7    # "$this$isIdentity$iv":I
    .end local v8    # "$i$f$isIdentity":I
    :goto_1
    if-nez v7, :cond_0

    .line 426
    move v7, v6

    .local v7, "$this$hasNonTranslationComponents$iv":I
    const/4 v8, 0x0

    .line 608
    .local v8, "$i$f$getHasNonTranslationComponents":I
    and-int/lit8 v9, v7, 0x2

    if-nez v9, :cond_2

    goto :goto_2

    :cond_2
    move v10, v11

    .line 426
    .end local v7    # "$this$hasNonTranslationComponents$iv":I
    .end local v8    # "$i$f$getHasNonTranslationComponents":I
    :goto_2
    if-eqz v10, :cond_3

    .line 427
    sget-object v7, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/unit/IntOffset$Companion;->getMax-nOcc-ac()J

    move-result-wide v7

    return-wide v7

    .line 429
    :cond_3
    invoke-static {v5, v1, v2}, Landroidx/compose/ui/graphics/Matrix;->map-MK-Hz9U([FJ)J

    move-result-wide v1

    .end local v4    # "layer":Landroidx/compose/ui/node/OwnedLayer;
    .end local v5    # "matrix":[F
    .end local v6    # "analysis":I
    goto :goto_0

    .line 432
    :cond_4
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v4

    return-wide v4
.end method

.method private final positionInRoot-Bjo55l4(Landroidx/compose/ui/node/NodeCoordinator;)J
    .locals 9
    .param p1, "$this$positionInRoot_u2dBjo55l4"    # Landroidx/compose/ui/node/NodeCoordinator;

    .line 377
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v0

    .line 378
    .local v0, "position":J
    move-object v2, p1

    .line 379
    .local v2, "coordinator":Landroidx/compose/ui/node/NodeCoordinator;
    :cond_0
    :goto_0
    if-eqz v2, :cond_3

    .line 380
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->getLayer()Landroidx/compose/ui/node/OwnedLayer;

    move-result-object v3

    .line 381
    .local v3, "layer":Landroidx/compose/ui/node/OwnedLayer;
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/unit/IntOffsetKt;->plus-Nv-tHpc(JJ)J

    move-result-wide v0

    .line 382
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->getWrappedBy$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v2

    .line 383
    if-eqz v3, :cond_0

    .line 384
    invoke-interface {v3}, Landroidx/compose/ui/node/OwnedLayer;->getUnderlyingMatrix-sQKQjiQ()[F

    move-result-object v4

    .line 385
    .local v4, "matrix":[F
    invoke-static {v4}, Landroidx/compose/ui/spatial/RectManagerKt;->access$analyzeComponents-58bKbWc([F)I

    move-result v5

    .line 386
    .local v5, "analysis":I
    const/4 v6, 0x3

    if-eq v5, v6, :cond_0

    .line 387
    and-int/lit8 v6, v5, 0x2

    if-nez v6, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 388
    .local v6, "hasNonTranslationComponents":Z
    :goto_1
    if-eqz v6, :cond_2

    .line 389
    sget-object v7, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/unit/IntOffset$Companion;->getMax-nOcc-ac()J

    move-result-wide v7

    return-wide v7

    .line 391
    :cond_2
    invoke-static {v4, v0, v1}, Landroidx/compose/ui/graphics/Matrix;->map-MK-Hz9U([FJ)J

    move-result-wide v0

    .end local v3    # "layer":Landroidx/compose/ui/node/OwnedLayer;
    .end local v4    # "matrix":[F
    .end local v5    # "analysis":I
    .end local v6    # "hasNonTranslationComponents":Z
    goto :goto_0

    .line 394
    :cond_3
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    move-result-wide v3

    return-wide v3
.end method


# virtual methods
.method public final currentRectInfo(ILandroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/spatial/RelativeLayoutBounds;
    .locals 3
    .param p1, "id"    # I
    .param p2, "node"    # Landroidx/compose/ui/node/DelegatableNode;

    .line 142
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 143
    .local v0, "result":Lkotlin/jvm/internal/Ref$ObjectRef;
    iget-object v1, p0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    new-instance v2, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;

    invoke-direct {v2, v0, p2, p0}, Landroidx/compose/ui/spatial/RectManager$currentRectInfo$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/spatial/RectManager;)V

    check-cast v2, Lkotlin/jvm/functions/Function4;

    invoke-virtual {v1, p1, v2}, Landroidx/compose/ui/spatial/RectList;->withRect(ILkotlin/jvm/functions/Function4;)Z

    .line 154
    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/spatial/RelativeLayoutBounds;

    return-object v1
.end method

.method public final dispatchCallbacks()V
    .locals 24

    .line 81
    move-object/from16 v0, p0

    invoke-static {}, Landroidx/compose/ui/Actual_androidKt;->currentTimeMillis()J

    move-result-wide v7

    .line 85
    .local v7, "currentTime":J
    iget-boolean v1, v0, Landroidx/compose/ui/spatial/RectManager;->isDirty:Z

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v1, :cond_1

    iget-boolean v1, v0, Landroidx/compose/ui/spatial/RectManager;->isScreenOrWindowDirty:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v10

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v9

    :goto_1
    move v11, v1

    .line 88
    .local v11, "isDispatchGlobalCallbacks":Z
    iget-boolean v1, v0, Landroidx/compose/ui/spatial/RectManager;->isDirty:Z

    if-eqz v1, :cond_6

    .line 89
    iput-boolean v10, v0, Landroidx/compose/ui/spatial/RectManager;->isDirty:Z

    .line 90
    iget-object v1, v0, Landroidx/compose/ui/spatial/RectManager;->callbacks:Landroidx/collection/MutableObjectList;

    check-cast v1, Landroidx/collection/ObjectList;

    .local v1, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v2, 0x0

    .line 550
    .local v2, "$i$f$forEach":I
    nop

    .line 551
    iget-object v3, v1, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 552
    .local v3, "content$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .local v4, "i$iv":I
    iget v5, v1, Landroidx/collection/ObjectList;->_size:I

    :goto_2
    if-ge v4, v5, :cond_2

    .line 553
    aget-object v6, v3, v4

    check-cast v6, Lkotlin/jvm/functions/Function0;

    .local v6, "it":Lkotlin/jvm/functions/Function0;
    const/4 v12, 0x0

    .line 90
    .local v12, "$i$a$-forEach-RectManager$dispatchCallbacks$1":I
    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 553
    .end local v6    # "it":Lkotlin/jvm/functions/Function0;
    .end local v12    # "$i$a$-forEach-RectManager$dispatchCallbacks$1":I
    nop

    .line 552
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 555
    .end local v4    # "i$iv":I
    :cond_2
    nop

    .line 91
    .end local v1    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "content$iv":[Ljava/lang/Object;
    iget-object v12, v0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    .local v12, "this_$iv":Landroidx/compose/ui/spatial/RectList;
    const/4 v13, 0x0

    .line 556
    .local v13, "$i$f$forEachUpdatedRect":I
    iget-object v14, v12, Landroidx/compose/ui/spatial/RectList;->items:[J

    .line 557
    .local v14, "items$iv":[J
    iget v15, v12, Landroidx/compose/ui/spatial/RectList;->itemsSize:I

    .line 558
    .local v15, "size$iv":I
    const/4 v1, 0x0

    .line 559
    .local v1, "i$iv":I
    :goto_3
    array-length v2, v14

    add-int/lit8 v2, v2, -0x2

    if-ge v1, v2, :cond_5

    .line 560
    if-ge v1, v15, :cond_4

    .line 561
    add-int/lit8 v2, v1, 0x2

    aget-wide v2, v14, v2

    .line 562
    .local v2, "meta$iv":J
    const/4 v4, 0x0

    .line 563
    .local v4, "$i$f$unpackMetaUpdated":I
    const/16 v5, 0x3d

    shr-long v5, v2, v5

    long-to-int v5, v5

    and-int/lit8 v4, v5, 0x1

    .line 562
    .end local v4    # "$i$f$unpackMetaUpdated":I
    if-eqz v4, :cond_3

    .line 564
    add-int/lit8 v4, v1, 0x0

    aget-wide v16, v14, v4

    .line 565
    .local v16, "topLeft$iv":J
    add-int/lit8 v4, v1, 0x1

    aget-wide v18, v14, v4

    .line 566
    .local v18, "bottomRight$iv":J
    nop

    .line 567
    const/4 v4, 0x0

    .line 568
    .local v4, "$i$f$unpackMetaValue":I
    long-to-int v5, v2

    const v6, 0x3ffffff

    and-int v4, v5, v6

    .line 569
    .end local v4    # "$i$f$unpackMetaValue":I
    nop

    .line 570
    nop

    .line 566
    nop

    .local v4, "id":I
    move-wide/from16 v5, v18

    move-wide/from16 v20, v2

    move v2, v4

    .end local v4    # "id":I
    .local v2, "id":I
    .local v5, "bottomRight":J
    .local v20, "meta$iv":J
    move-wide/from16 v3, v16

    .local v3, "topLeft":J
    const/16 v22, 0x0

    .line 92
    .local v22, "$i$a$-forEachUpdatedRect-RectManager$dispatchCallbacks$2":I
    move/from16 v23, v1

    .end local v1    # "i$iv":I
    .local v23, "i$iv":I
    iget-object v1, v0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    invoke-virtual/range {v1 .. v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->fireOnUpdatedRect(IJJJ)V

    .line 93
    nop

    .line 566
    .end local v2    # "id":I
    .end local v3    # "topLeft":J
    .end local v5    # "bottomRight":J
    .end local v22    # "$i$a$-forEachUpdatedRect-RectManager$dispatchCallbacks$2":I
    goto :goto_4

    .line 562
    .end local v16    # "topLeft$iv":J
    .end local v18    # "bottomRight$iv":J
    .end local v20    # "meta$iv":J
    .end local v23    # "i$iv":I
    .restart local v1    # "i$iv":I
    .local v2, "meta$iv":J
    :cond_3
    move/from16 v23, v1

    move-wide/from16 v20, v2

    .line 573
    .end local v1    # "i$iv":I
    .end local v2    # "meta$iv":J
    .restart local v20    # "meta$iv":J
    .restart local v23    # "i$iv":I
    :goto_4
    nop

    .end local v20    # "meta$iv":J
    add-int/lit8 v1, v23, 0x3

    .end local v23    # "i$iv":I
    .restart local v1    # "i$iv":I
    goto :goto_3

    .line 560
    :cond_4
    move/from16 v23, v1

    .end local v1    # "i$iv":I
    .restart local v23    # "i$iv":I
    goto :goto_5

    .line 559
    .end local v23    # "i$iv":I
    .restart local v1    # "i$iv":I
    :cond_5
    move/from16 v23, v1

    .line 575
    .end local v1    # "i$iv":I
    .restart local v23    # "i$iv":I
    :goto_5
    nop

    .line 94
    .end local v12    # "this_$iv":Landroidx/compose/ui/spatial/RectList;
    .end local v13    # "$i$f$forEachUpdatedRect":I
    .end local v14    # "items$iv":[J
    .end local v15    # "size$iv":I
    .end local v23    # "i$iv":I
    iget-object v1, v0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    invoke-virtual {v1}, Landroidx/compose/ui/spatial/RectList;->clearUpdated()V

    .line 96
    :cond_6
    iget-boolean v1, v0, Landroidx/compose/ui/spatial/RectManager;->isScreenOrWindowDirty:Z

    if-eqz v1, :cond_7

    .line 97
    iput-boolean v10, v0, Landroidx/compose/ui/spatial/RectManager;->isScreenOrWindowDirty:Z

    .line 98
    iget-object v1, v0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    invoke-virtual {v1, v7, v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->fireOnRectChangedEntries(J)V

    .line 100
    :cond_7
    if-eqz v11, :cond_8

    .line 101
    iget-object v1, v0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    invoke-virtual {v1, v7, v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->fireGlobalChangeEntries(J)V

    .line 107
    :cond_8
    iget-boolean v1, v0, Landroidx/compose/ui/spatial/RectManager;->isFragmented:Z

    if-eqz v1, :cond_9

    .line 108
    iput-boolean v10, v0, Landroidx/compose/ui/spatial/RectManager;->isFragmented:Z

    .line 113
    iget-object v1, v0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    invoke-virtual {v1}, Landroidx/compose/ui/spatial/RectList;->defragment()V

    .line 117
    :cond_9
    iget-object v1, v0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    invoke-virtual {v1, v7, v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->triggerDebounced(J)V

    .line 118
    return-void
.end method

.method public final getRects()Landroidx/compose/ui/spatial/RectList;
    .locals 1

    .line 47
    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    return-object v0
.end method

.method public final invalidate()V
    .locals 1

    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/spatial/RectManager;->isDirty:Z

    .line 63
    return-void
.end method

.method public final invalidateCallbacksFor(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 3
    .param p1, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;

    .line 201
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/spatial/RectManager;->isDirty:Z

    .line 202
    iget-object v1, p0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getSemanticsId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/compose/ui/spatial/RectList;->markUpdated(I)V

    .line 203
    invoke-virtual {p0, v0}, Landroidx/compose/ui/spatial/RectManager;->scheduleDebounceCallback(Z)V

    .line 204
    return-void
.end method

.method public final isTargetDrawnFirst$ui_release(II)Z
    .locals 8
    .param p1, "targetId"    # I
    .param p2, "otherId"    # I

    .line 449
    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->layoutNodes:Landroidx/collection/IntObjectMap;

    invoke-virtual {v0, p1}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 450
    .local v0, "nodeA":Landroidx/compose/ui/node/LayoutNode;
    :cond_0
    iget-object v2, p0, Landroidx/compose/ui/spatial/RectManager;->layoutNodes:Landroidx/collection/IntObjectMap;

    invoke-virtual {v2, p2}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/node/LayoutNode;

    if-nez v2, :cond_1

    return v1

    .line 452
    .local v2, "nodeB":Landroidx/compose/ui/node/LayoutNode;
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_4

    .line 457
    :cond_2
    :goto_0
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    move-result v3

    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    move-result v4

    if-le v3, v4, :cond_4

    .line 458
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v3

    if-nez v3, :cond_3

    return v1

    :cond_3
    move-object v0, v3

    goto :goto_0

    .line 461
    :cond_4
    if-ne v0, v2, :cond_5

    .line 463
    return v1

    .line 466
    :cond_5
    :goto_1
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    move-result v3

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getDepth$ui_release()I

    move-result v4

    if-le v3, v4, :cond_7

    .line 467
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v3

    if-nez v3, :cond_6

    return v1

    :cond_6
    move-object v2, v3

    goto :goto_1

    .line 470
    :cond_7
    if-ne v0, v2, :cond_8

    .line 472
    return v1

    .line 477
    :cond_8
    move-object v3, v0

    .line 478
    .local v3, "lastParentA":Landroidx/compose/ui/node/LayoutNode;
    move-object v4, v2

    .line 480
    .local v4, "lastParentB":Landroidx/compose/ui/node/LayoutNode;
    :goto_2
    if-eq v0, v2, :cond_b

    .line 481
    move-object v3, v0

    .line 482
    move-object v4, v2

    .line 485
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v5

    if-nez v5, :cond_9

    return v1

    :cond_9
    move-object v0, v5

    .line 486
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v5

    if-nez v5, :cond_a

    return v1

    :cond_a
    move-object v2, v5

    goto :goto_2

    .line 490
    :cond_b
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getMeasurePassDelegate$ui_release()Landroidx/compose/ui/node/MeasurePassDelegate;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/node/MeasurePassDelegate;->getZIndex$ui_release()F

    move-result v5

    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getMeasurePassDelegate$ui_release()Landroidx/compose/ui/node/MeasurePassDelegate;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/ui/node/MeasurePassDelegate;->getZIndex$ui_release()F

    move-result v6

    cmpg-float v5, v5, v6

    const/4 v6, 0x1

    if-nez v5, :cond_c

    move v5, v6

    goto :goto_3

    :cond_c
    move v5, v1

    :goto_3
    if-eqz v5, :cond_e

    .line 491
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getPlaceOrder$ui_release()I

    move-result v5

    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getPlaceOrder$ui_release()I

    move-result v7

    if-ge v5, v7, :cond_d

    move v1, v6

    :cond_d
    return v1

    .line 493
    :cond_e
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getMeasurePassDelegate$ui_release()Landroidx/compose/ui/node/MeasurePassDelegate;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/node/MeasurePassDelegate;->getZIndex$ui_release()F

    move-result v5

    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getMeasurePassDelegate$ui_release()Landroidx/compose/ui/node/MeasurePassDelegate;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/node/MeasurePassDelegate;->getZIndex$ui_release()F

    move-result v7

    cmpg-float v5, v5, v7

    if-gez v5, :cond_f

    move v1, v6

    :cond_f
    return v1

    .line 454
    .end local v3    # "lastParentA":Landroidx/compose/ui/node/LayoutNode;
    .end local v4    # "lastParentB":Landroidx/compose/ui/node/LayoutNode;
    :cond_10
    :goto_4
    return v1
.end method

.method public final onLayoutLayerPositionalPropertiesChanged(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 14
    .param p1, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;

    .line 207
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isRectTrackingEnabled:Z

    if-nez v0, :cond_0

    return-void

    .line 208
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/spatial/RectManager;->outerToInnerOffset-Bjo55l4(Landroidx/compose/ui/node/LayoutNode;)J

    move-result-wide v0

    .line 209
    .local v0, "outerToInnerOffset":J
    invoke-static {v0, v1}, Landroidx/compose/ui/spatial/RectManagerKt;->access$isSet--gyyYBs(J)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 211
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/node/LayoutNode;->setOuterToInnerOffset--gyyYBs$ui_release(J)V

    .line 212
    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroidx/compose/ui/node/LayoutNode;->setOuterToInnerOffsetDirty$ui_release(Z)V

    .line 213
    move-object v3, p1

    .local v3, "this_$iv":Landroidx/compose/ui/node/LayoutNode;
    const/4 v4, 0x0

    .line 576
    .local v4, "$i$f$forEachChild":I
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->get_children$ui_release()Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v5

    .local v5, "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v6, 0x0

    .line 577
    .local v6, "$i$f$forEach":I
    nop

    .line 578
    const/4 v7, 0x0

    .line 579
    .local v7, "i$iv$iv":I
    iget-object v8, v5, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 580
    .local v8, "content$iv$iv":[Ljava/lang/Object;
    invoke-virtual {v5}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v9

    .line 581
    .local v9, "size$iv$iv":I
    :goto_0
    if-ge v7, v9, :cond_1

    .line 582
    aget-object v10, v8, v7

    check-cast v10, Landroidx/compose/ui/node/LayoutNode;

    .local v10, "it":Landroidx/compose/ui/node/LayoutNode;
    const/4 v11, 0x0

    .line 216
    .local v11, "$i$a$-forEachChild-RectManager$onLayoutLayerPositionalPropertiesChanged$1":I
    invoke-virtual {v10}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/node/NodeCoordinator;->getPosition-nOcc-ac()J

    move-result-wide v12

    invoke-virtual {p0, v10, v12, v13, v2}, Landroidx/compose/ui/spatial/RectManager;->onLayoutPositionChanged-70tqf50(Landroidx/compose/ui/node/LayoutNode;JZ)V

    .line 217
    nop

    .line 582
    .end local v10    # "it":Landroidx/compose/ui/node/LayoutNode;
    .end local v11    # "$i$a$-forEachChild-RectManager$onLayoutLayerPositionalPropertiesChanged$1":I
    nop

    .line 583
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 585
    :cond_1
    nop

    .line 576
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v6    # "$i$f$forEach":I
    .end local v7    # "i$iv$iv":I
    .end local v8    # "content$iv$iv":[Ljava/lang/Object;
    .end local v9    # "size$iv$iv":I
    nop

    .line 218
    .end local v3    # "this_$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v4    # "$i$f$forEachChild":I
    invoke-virtual {p0, p1}, Landroidx/compose/ui/spatial/RectManager;->invalidateCallbacksFor(Landroidx/compose/ui/node/LayoutNode;)V

    goto :goto_1

    .line 221
    :cond_2
    invoke-direct {p0, p1}, Landroidx/compose/ui/spatial/RectManager;->insertOrUpdateTransformedNodeSubhierarchy(Landroidx/compose/ui/node/LayoutNode;)V

    .line 223
    :goto_1
    return-void
.end method

.method public final onLayoutPositionChanged-70tqf50(Landroidx/compose/ui/node/LayoutNode;JZ)V
    .locals 30
    .param p1, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;
    .param p2, "position"    # J
    .param p4, "firstPlacement"    # Z

    .line 230
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-boolean v2, Landroidx/compose/ui/ComposeUiFlags;->isRectTrackingEnabled:Z

    if-nez v2, :cond_0

    return-void

    .line 240
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getMeasurePassDelegate$ui_release()Landroidx/compose/ui/node/MeasurePassDelegate;

    move-result-object v7

    .line 241
    .local v7, "delegate":Landroidx/compose/ui/node/MeasurePassDelegate;
    invoke-virtual {v7}, Landroidx/compose/ui/node/MeasurePassDelegate;->getMeasuredWidth()I

    move-result v8

    .line 242
    .local v8, "width":I
    invoke-virtual {v7}, Landroidx/compose/ui/node/MeasurePassDelegate;->getMeasuredHeight()I

    move-result v9

    .line 244
    .local v9, "height":I
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v10

    .line 245
    .local v10, "parent":Landroidx/compose/ui/node/LayoutNode;
    const-wide/16 v2, 0x0

    .line 247
    .local v2, "offset":J
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOffsetFromRoot-nOcc-ac$ui_release()J

    move-result-wide v11

    .line 248
    .local v11, "lastOffset":J
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getLastSize-YbymL2g$ui_release()J

    move-result-wide v13

    .line 249
    .local v13, "lastSize":J
    const/4 v4, 0x0

    .line 586
    .local v4, "$i$f$getWidth-impl":I
    move-wide v5, v13

    .local v5, "value$iv$iv":J
    const/4 v15, 0x0

    .line 587
    .local v15, "$i$f$unpackInt1":I
    const/16 v16, 0x20

    move-wide/from16 v17, v2

    .end local v2    # "offset":J
    .local v17, "offset":J
    shr-long v2, v5, v16

    long-to-int v2, v2

    .line 586
    .end local v5    # "value$iv$iv":J
    .end local v15    # "$i$f$unpackInt1":I
    nop

    .line 249
    .end local v4    # "$i$f$getWidth-impl":I
    move v15, v2

    .line 250
    .local v15, "lastWidth":I
    const/4 v2, 0x0

    .line 588
    .local v2, "$i$f$getHeight-impl":I
    move-wide v3, v13

    .local v3, "value$iv$iv":J
    const/4 v5, 0x0

    .line 589
    .local v5, "$i$f$unpackInt2":I
    const-wide v19, 0xffffffffL

    move v6, v2

    move-wide/from16 v21, v3

    .end local v2    # "$i$f$getHeight-impl":I
    .end local v3    # "value$iv$iv":J
    .local v6, "$i$f$getHeight-impl":I
    .local v21, "value$iv$iv":J
    and-long v2, v21, v19

    long-to-int v2, v2

    .line 588
    .end local v5    # "$i$f$unpackInt2":I
    .end local v21    # "value$iv$iv":J
    nop

    .line 250
    .end local v6    # "$i$f$getHeight-impl":I
    nop

    .line 252
    .local v2, "lastHeight":I
    const/4 v3, 0x0

    .line 254
    .local v3, "hasNonTranslationTransformations":Z
    if-eqz v10, :cond_3

    .line 255
    invoke-virtual {v10}, Landroidx/compose/ui/node/LayoutNode;->getOuterToInnerOffsetDirty$ui_release()Z

    move-result v4

    .line 256
    .local v4, "parentOffsetDirty":Z
    invoke-virtual {v10}, Landroidx/compose/ui/node/LayoutNode;->getOffsetFromRoot-nOcc-ac$ui_release()J

    move-result-wide v5

    .line 257
    .local v5, "parentOffset":J
    invoke-virtual {v10}, Landroidx/compose/ui/node/LayoutNode;->getOuterToInnerOffset-nOcc-ac$ui_release()J

    move-result-wide v21

    .line 260
    .local v21, "prevOuterToInnerOffset":J
    invoke-static {v5, v6}, Landroidx/compose/ui/spatial/RectManagerKt;->access$isSet--gyyYBs(J)Z

    move-result v23

    if-eqz v23, :cond_2

    .line 262
    if-eqz v4, :cond_1

    .line 263
    move/from16 v23, v3

    move/from16 v24, v4

    .end local v3    # "hasNonTranslationTransformations":Z
    .end local v4    # "parentOffsetDirty":Z
    .local v23, "hasNonTranslationTransformations":Z
    .local v24, "parentOffsetDirty":Z
    invoke-direct {v0, v10}, Landroidx/compose/ui/spatial/RectManager;->outerToInnerOffset-Bjo55l4(Landroidx/compose/ui/node/LayoutNode;)J

    move-result-wide v3

    .line 265
    .local v3, "it":J
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/node/LayoutNode;->setOuterToInnerOffset--gyyYBs$ui_release(J)V

    .line 266
    move-wide/from16 v25, v3

    .end local v3    # "it":J
    .local v25, "it":J
    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Landroidx/compose/ui/node/LayoutNode;->setOuterToInnerOffsetDirty$ui_release(Z)V

    .line 267
    move-wide/from16 v3, v25

    .end local v25    # "it":J
    goto :goto_0

    .line 269
    .end local v23    # "hasNonTranslationTransformations":Z
    .end local v24    # "parentOffsetDirty":Z
    .local v3, "hasNonTranslationTransformations":Z
    .restart local v4    # "parentOffsetDirty":Z
    :cond_1
    move/from16 v23, v3

    move/from16 v24, v4

    .end local v3    # "hasNonTranslationTransformations":Z
    .end local v4    # "parentOffsetDirty":Z
    .restart local v23    # "hasNonTranslationTransformations":Z
    .restart local v24    # "parentOffsetDirty":Z
    move-wide/from16 v3, v21

    .line 262
    :goto_0
    nop

    .line 261
    nop

    .line 271
    .local v3, "parentOuterInnerOffset":J
    invoke-static {v3, v4}, Landroidx/compose/ui/spatial/RectManagerKt;->access$isSet--gyyYBs(J)Z

    move-result v25

    xor-int/lit8 v25, v25, 0x1

    .line 272
    .end local v23    # "hasNonTranslationTransformations":Z
    .local v25, "hasNonTranslationTransformations":Z
    move-wide/from16 v26, v13

    .end local v13    # "lastSize":J
    .local v26, "lastSize":J
    invoke-static {v5, v6, v3, v4}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    move-result-wide v13

    move-wide/from16 v28, v3

    move-wide/from16 v3, p2

    .end local v3    # "parentOuterInnerOffset":J
    .local v28, "parentOuterInnerOffset":J
    invoke-static {v13, v14, v3, v4}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    move-result-wide v13

    move/from16 v23, v25

    .end local v28    # "parentOuterInnerOffset":J
    goto :goto_1

    .line 274
    .end local v24    # "parentOffsetDirty":Z
    .end local v25    # "hasNonTranslationTransformations":Z
    .end local v26    # "lastSize":J
    .local v3, "hasNonTranslationTransformations":Z
    .restart local v4    # "parentOffsetDirty":Z
    .restart local v13    # "lastSize":J
    :cond_2
    move/from16 v23, v3

    move/from16 v24, v4

    move-wide/from16 v26, v13

    move-wide/from16 v3, p2

    .end local v3    # "hasNonTranslationTransformations":Z
    .end local v4    # "parentOffsetDirty":Z
    .end local v13    # "lastSize":J
    .restart local v23    # "hasNonTranslationTransformations":Z
    .restart local v24    # "parentOffsetDirty":Z
    .restart local v26    # "lastSize":J
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v13

    invoke-direct {v0, v13}, Landroidx/compose/ui/spatial/RectManager;->positionInRoot-Bjo55l4(Landroidx/compose/ui/node/NodeCoordinator;)J

    move-result-wide v13

    .line 259
    :goto_1
    nop

    .end local v5    # "parentOffset":J
    .end local v17    # "offset":J
    .end local v21    # "prevOuterToInnerOffset":J
    .end local v24    # "parentOffsetDirty":Z
    .local v13, "offset":J
    goto :goto_2

    .line 278
    .end local v23    # "hasNonTranslationTransformations":Z
    .end local v26    # "lastSize":J
    .restart local v3    # "hasNonTranslationTransformations":Z
    .local v13, "lastSize":J
    .restart local v17    # "offset":J
    :cond_3
    move/from16 v23, v3

    move-wide/from16 v26, v13

    move-wide/from16 v3, p2

    .end local v3    # "hasNonTranslationTransformations":Z
    .end local v13    # "lastSize":J
    .restart local v23    # "hasNonTranslationTransformations":Z
    .restart local v26    # "lastSize":J
    move-wide/from16 v13, p2

    .line 282
    .end local v17    # "offset":J
    .local v13, "offset":J
    :goto_2
    if-nez v23, :cond_6

    invoke-static {v13, v14}, Landroidx/compose/ui/spatial/RectManagerKt;->access$isSet--gyyYBs(J)Z

    move-result v5

    if-nez v5, :cond_4

    move/from16 v16, v2

    goto :goto_3

    .line 287
    :cond_4
    invoke-virtual {v1, v13, v14}, Landroidx/compose/ui/node/LayoutNode;->setOffsetFromRoot--gyyYBs$ui_release(J)V

    .line 288
    const/4 v5, 0x0

    .line 590
    .local v5, "$i$f$IntSize":I
    const/4 v6, 0x0

    .line 591
    .local v6, "$i$f$packInts":I
    int-to-long v3, v8

    shl-long v3, v3, v16

    move-wide/from16 v16, v3

    int-to-long v3, v9

    and-long v3, v3, v19

    or-long v3, v16, v3

    .line 590
    .end local v6    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    move-result-wide v3

    .line 288
    .end local v5    # "$i$f$IntSize":I
    invoke-virtual {v1, v3, v4}, Landroidx/compose/ui/node/LayoutNode;->setLastSize-ozmzZPI$ui_release(J)V

    .line 290
    invoke-static {v13, v14}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v3

    .line 291
    .local v3, "l":I
    invoke-static {v13, v14}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v4

    .line 292
    .local v4, "t":I
    add-int v5, v3, v8

    .line 293
    .local v5, "r":I
    add-int v6, v4, v9

    .line 295
    .local v6, "b":I
    if-nez p4, :cond_5

    invoke-static {v13, v14, v11, v12}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v16

    if-eqz v16, :cond_5

    if-ne v15, v8, :cond_5

    if-ne v2, v9, :cond_5

    .line 296
    return-void

    .line 299
    :cond_5
    move/from16 v16, v2

    move/from16 v2, p4

    .end local v2    # "lastHeight":I
    .local v16, "lastHeight":I
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/spatial/RectManager;->insertOrUpdate(Landroidx/compose/ui/node/LayoutNode;ZIIII)V

    .line 300
    return-void

    .line 282
    .end local v3    # "l":I
    .end local v4    # "t":I
    .end local v5    # "r":I
    .end local v6    # "b":I
    .end local v16    # "lastHeight":I
    .restart local v2    # "lastHeight":I
    :cond_6
    move/from16 v16, v2

    .line 283
    .end local v2    # "lastHeight":I
    .restart local v16    # "lastHeight":I
    :goto_3
    invoke-direct/range {p0 .. p4}, Landroidx/compose/ui/spatial/RectManager;->insertOrUpdateTransformedNode-70tqf50(Landroidx/compose/ui/node/LayoutNode;JZ)V

    .line 284
    return-void
.end method

.method public final registerOnChangedCallback(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 1
    .param p1, "callback"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 158
    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->callbacks:Landroidx/collection/MutableObjectList;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 159
    return-object p1
.end method

.method public final registerOnGlobalLayoutCallback(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;
    .locals 8
    .param p1, "id"    # I
    .param p2, "throttleMillis"    # J
    .param p4, "debounceMillis"    # J
    .param p6, "node"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p7, "callback"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"
        }
    .end annotation

    .line 185
    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    .line 186
    nop

    .line 187
    nop

    .line 188
    nop

    .line 189
    nop

    .line 190
    nop

    .line 185
    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    move-object v7, p7

    .end local p1    # "id":I
    .end local p2    # "throttleMillis":J
    .end local p4    # "debounceMillis":J
    .end local p6    # "node":Landroidx/compose/ui/node/DelegatableNode;
    .end local p7    # "callback":Lkotlin/jvm/functions/Function1;
    .local v1, "id":I
    .local v2, "throttleMillis":J
    .local v4, "debounceMillis":J
    .local v6, "node":Landroidx/compose/ui/node/DelegatableNode;
    .local v7, "callback":Lkotlin/jvm/functions/Function1;
    invoke-virtual/range {v0 .. v7}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->registerOnGlobalChange(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    move-result-object p1

    return-object p1
.end method

.method public final registerOnRectChangedCallback(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;
    .locals 8
    .param p1, "id"    # I
    .param p2, "throttleMillis"    # J
    .param p4, "debounceMillis"    # J
    .param p6, "node"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p7, "callback"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/spatial/RelativeLayoutBounds;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    .line 170
    nop

    .line 171
    nop

    .line 172
    nop

    .line 173
    nop

    .line 174
    nop

    .line 169
    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    move-object v7, p7

    .end local p1    # "id":I
    .end local p2    # "throttleMillis":J
    .end local p4    # "debounceMillis":J
    .end local p6    # "node":Landroidx/compose/ui/node/DelegatableNode;
    .end local p7    # "callback":Lkotlin/jvm/functions/Function1;
    .local v1, "id":I
    .local v2, "throttleMillis":J
    .local v4, "debounceMillis":J
    .local v6, "node":Landroidx/compose/ui/node/DelegatableNode;
    .local v7, "callback":Lkotlin/jvm/functions/Function1;
    invoke-virtual/range {v0 .. v7}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->registerOnRectChanged(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;

    move-result-object p1

    return-object p1
.end method

.method public final remove(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 2
    .param p1, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;

    .line 436
    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->rects:Landroidx/compose/ui/spatial/RectList;

    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getSemanticsId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/spatial/RectList;->remove(I)Z

    .line 437
    invoke-virtual {p0}, Landroidx/compose/ui/spatial/RectManager;->invalidate()V

    .line 438
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/spatial/RectManager;->isFragmented:Z

    .line 439
    return-void
.end method

.method public final scheduleDebounceCallback(Z)V
    .locals 14
    .param p1, "ensureSomethingScheduled"    # Z

    .line 121
    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->dispatchToken:Ljava/lang/Object;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 122
    .local v0, "canExitEarly":Z
    :goto_1
    iget-object v1, p0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->getMinDebounceDeadline()J

    move-result-wide v1

    .line 123
    .local v1, "nextDeadline":J
    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-gez v3, :cond_2

    if-eqz v0, :cond_2

    .line 124
    return-void

    .line 126
    :cond_2
    iget-wide v3, p0, Landroidx/compose/ui/spatial/RectManager;->scheduledDispatchDeadline:J

    .line 127
    .local v3, "currentScheduledDeadline":J
    cmp-long v5, v3, v1

    if-nez v5, :cond_3

    if-eqz v0, :cond_3

    .line 128
    return-void

    .line 130
    :cond_3
    iget-object v5, p0, Landroidx/compose/ui/spatial/RectManager;->dispatchToken:Ljava/lang/Object;

    if-eqz v5, :cond_4

    .line 131
    iget-object v5, p0, Landroidx/compose/ui/spatial/RectManager;->dispatchToken:Ljava/lang/Object;

    invoke-static {v5}, Landroidx/compose/ui/Actual_androidKt;->removePost(Ljava/lang/Object;)V

    .line 133
    :cond_4
    invoke-static {}, Landroidx/compose/ui/Actual_androidKt;->currentTimeMillis()J

    move-result-wide v5

    .line 134
    .local v5, "currentTime":J
    const-wide/16 v7, 0x10

    add-long/2addr v7, v5

    .line 135
    .local v7, "nextFrameIsh":J
    invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    .line 136
    .local v9, "deadline":J
    iput-wide v9, p0, Landroidx/compose/ui/spatial/RectManager;->scheduledDispatchDeadline:J

    .line 137
    sub-long v11, v9, v5

    .line 138
    .local v11, "delay":J
    iget-object v13, p0, Landroidx/compose/ui/spatial/RectManager;->dispatchLambda:Lkotlin/jvm/functions/Function0;

    invoke-static {v11, v12, v13}, Landroidx/compose/ui/Actual_androidKt;->postDelayed(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, p0, Landroidx/compose/ui/spatial/RectManager;->dispatchToken:Ljava/lang/Object;

    .line 139
    return-void
.end method

.method public final unregisterOnChangedCallback(Ljava/lang/Object;)V
    .locals 1
    .param p1, "token"    # Ljava/lang/Object;

    .line 196
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/TypeIntrinsics;->isFunctionOfArity(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkotlin/jvm/functions/Function0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-void

    .line 197
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/spatial/RectManager;->callbacks:Landroidx/collection/MutableObjectList;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    .line 198
    return-void
.end method

.method public final updateOffsets-ucfNpQE(JJ[F)V
    .locals 9
    .param p1, "screenOffset"    # J
    .param p3, "windowOffset"    # J
    .param p5, "viewToWindowMatrix"    # [F

    .line 70
    invoke-static {p5}, Landroidx/compose/ui/spatial/RectManagerKt;->access$analyzeComponents-58bKbWc([F)I

    move-result v0

    .line 71
    .local v0, "analysis":I
    nop

    .line 72
    iget-object v1, p0, Landroidx/compose/ui/spatial/RectManager;->throttledCallbacks:Landroidx/compose/ui/spatial/ThrottledCallbacks;

    .line 73
    nop

    .line 74
    nop

    .line 75
    move v2, v0

    .local v2, "$this$hasNonTranslationComponents$iv":I
    const/4 v3, 0x0

    .line 549
    .local v3, "$i$f$getHasNonTranslationComponents":I
    and-int/lit8 v4, v2, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-nez v4, :cond_0

    move v2, v7

    goto :goto_0

    :cond_0
    move v2, v8

    .line 75
    .end local v2    # "$this$hasNonTranslationComponents$iv":I
    .end local v3    # "$i$f$getHasNonTranslationComponents":I
    :goto_0
    if-eqz v2, :cond_1

    move-object v6, p5

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    move-object v6, v2

    .line 72
    :goto_1
    move-wide v2, p1

    move-wide v4, p3

    .end local p1    # "screenOffset":J
    .end local p3    # "windowOffset":J
    .local v2, "screenOffset":J
    .local v4, "windowOffset":J
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->updateOffsets-bT0EZQs(JJ[F)Z

    move-result p1

    if-nez p1, :cond_3

    .line 76
    iget-boolean p1, p0, Landroidx/compose/ui/spatial/RectManager;->isScreenOrWindowDirty:Z

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v7, v8

    goto :goto_3

    :cond_3
    :goto_2
    nop

    .line 71
    :goto_3
    iput-boolean v7, p0, Landroidx/compose/ui/spatial/RectManager;->isScreenOrWindowDirty:Z

    .line 77
    return-void
.end method
