.class public abstract Landroidx/compose/ui/node/LookaheadCapablePlaceable;
.super Landroidx/compose/ui/layout/Placeable;
.source "LookaheadDelegate.kt"

# interfaces
.implements Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;
.implements Landroidx/compose/ui/node/MotionReferencePlacementDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 9 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,521:1\n372#2,3:522\n329#2,6:525\n339#2,3:532\n342#2,2:536\n345#2,6:567\n375#2:573\n329#2,6:575\n339#2,3:582\n342#2,2:586\n345#2,6:592\n372#2,3:610\n329#2,6:613\n339#2,3:620\n342#2,9:624\n375#2:633\n372#2,3:634\n329#2,6:637\n339#2,3:644\n342#2,9:648\n375#2:657\n1399#3:531\n1270#3:535\n1399#3:581\n1270#3:585\n1399#3:619\n1270#3:623\n1399#3:643\n1270#3:647\n1399#3:669\n1270#3:673\n1399#3:693\n1270#3:697\n1399#3:718\n1270#3:722\n809#4,2:538\n812#4,4:556\n816#4:566\n200#5,16:540\n217#5,6:560\n231#5,3:708\n200#5,7:711\n211#5,3:719\n214#5,9:723\n234#5:732\n842#6:574\n844#6,4:588\n848#6:598\n683#6:599\n1#7:600\n1#7:658\n438#8:601\n395#8,4:659\n367#8,6:663\n377#8,3:670\n380#8,9:674\n399#8:683\n403#8,3:684\n367#8,6:687\n377#8,3:694\n380#8,2:698\n438#8:700\n383#8,6:701\n406#8:707\n361#9:602\n362#9,2:606\n365#9:609\n56#10,3:603\n60#10:608\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n*L\n185#1:522,3\n185#1:525,6\n185#1:532,3\n185#1:536,2\n185#1:567,6\n185#1:573\n186#1:575,6\n186#1:582,3\n186#1:586,2\n186#1:592,6\n254#1:610,3\n254#1:613,6\n254#1:620,3\n254#1:624,9\n254#1:633\n269#1:634,3\n269#1:637,6\n269#1:644,3\n269#1:648,9\n269#1:657\n185#1:531\n185#1:535\n186#1:581\n186#1:585\n254#1:619\n254#1:623\n269#1:643\n269#1:647\n288#1:669\n288#1:673\n301#1:693\n301#1:697\n311#1:718\n311#1:722\n185#1:538,2\n185#1:556,4\n185#1:566\n185#1:540,16\n185#1:560,6\n311#1:708,3\n311#1:711,7\n311#1:719,3\n311#1:723,9\n311#1:732\n186#1:574\n186#1:588,4\n186#1:598\n192#1:599\n192#1:600\n199#1:601\n288#1:659,4\n288#1:663,6\n288#1:670,3\n288#1:674,9\n288#1:683\n301#1:684,3\n301#1:687,6\n301#1:694,3\n301#1:698,2\n302#1:700\n301#1:701,6\n301#1:707\n230#1:602\n230#1:606,2\n230#1:609\n230#1:603,3\n230#1:608\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008 \u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010=\u001a\u00020>2\u0006\u0010 \u001a\u00020!2\u0006\u0010?\u001a\u000204H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH&J\u0017\u0010D\u001a\u00020>2\u0008\u0010E\u001a\u0004\u0018\u00010%H\u0000\u00a2\u0006\u0002\u0008FJ\u0010\u0010D\u001a\u00020>2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u00020\u00002\u0006\u0010?\u001a\u000204H\u0002J\u0016\u0010J\u001a\u00020K2\u0006\u0010?\u001a\u0002042\u0006\u0010L\u001a\u00020KJ\u0011\u0010M\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0086\u0002J\u0010\u0010N\u001a\u00020>2\u0006\u0010?\u001a\u000204H\u0002J`\u0010O\u001a\u00020%2\u0006\u0010P\u001a\u00020A2\u0006\u0010Q\u001a\u00020A2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020A0S2\u0019\u0010T\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020>\u0018\u00010U\u00a2\u0006\u0002\u0008V2\u0017\u0010W\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020>0U\u00a2\u0006\u0002\u0008VH\u0016J\u001c\u0010X\u001a\u00020>2\u0012\u0010Y\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0605H\u0002J\u0016\u0010Z\u001a\u00020>2\u0006\u0010?\u001a\u0002042\u0006\u0010[\u001a\u00020KJ\u0016\u0010\\\u001a\u00020>2\u0006\u0010?\u001a\u0002042\u0006\u0010[\u001a\u00020KJ\r\u0010]\u001a\u00020>H \u00a2\u0006\u0002\u0008^J\u0010\u0010_\u001a\u00020>2\u0006\u0010`\u001a\u00020\u0013H\u0016J\u000c\u0010a\u001a\u00020>*\u00020bH\u0004J\u0014\u0010c\u001a\u00020\u0013*\u00020!2\u0006\u0010d\u001a\u00020!H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0015\"\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0015\"\u0004\u0008\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u0015\"\u0004\u0008\u001f\u0010\u0019R\u0012\u0010 \u001a\u00020!X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R\u0012\u0010$\u001a\u00020%X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u0004\u0018\u00010\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\rR\u0011\u0010*\u001a\u00020+\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0018\u0010.\u001a\u00020/X\u00a6\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R(\u00102\u001a\u001c\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0605\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u00107\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u0016\u0010:\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010<\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006f"
    }
    d2 = {
        "Landroidx/compose/ui/node/LookaheadCapablePlaceable;",
        "Landroidx/compose/ui/layout/Placeable;",
        "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;",
        "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;",
        "()V",
        "_rulerScope",
        "Landroidx/compose/ui/layout/RulerScope;",
        "alignmentLinesOwner",
        "Landroidx/compose/ui/node/AlignmentLinesOwner;",
        "getAlignmentLinesOwner",
        "()Landroidx/compose/ui/node/AlignmentLinesOwner;",
        "child",
        "getChild",
        "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;",
        "coordinates",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "getCoordinates",
        "()Landroidx/compose/ui/layout/LayoutCoordinates;",
        "hasMeasureResult",
        "",
        "getHasMeasureResult",
        "()Z",
        "isLookingAhead",
        "isPlacedUnderMotionFrameOfReference",
        "setPlacedUnderMotionFrameOfReference",
        "(Z)V",
        "isPlacingForAlignment",
        "isPlacingForAlignment$ui_release",
        "setPlacingForAlignment$ui_release",
        "isShallowPlacing",
        "isShallowPlacing$ui_release",
        "setShallowPlacing$ui_release",
        "layoutNode",
        "Landroidx/compose/ui/node/LayoutNode;",
        "getLayoutNode",
        "()Landroidx/compose/ui/node/LayoutNode;",
        "measureResult",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "getMeasureResult$ui_release",
        "()Landroidx/compose/ui/layout/MeasureResult;",
        "parent",
        "getParent",
        "placementScope",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "getPlacementScope",
        "()Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "position",
        "Landroidx/compose/ui/unit/IntOffset;",
        "getPosition-nOcc-ac",
        "()J",
        "rulerReaders",
        "Landroidx/collection/MutableScatterMap;",
        "Landroidx/compose/ui/layout/Ruler;",
        "Landroidx/collection/MutableScatterSet;",
        "Landroidx/compose/ui/node/WeakReference;",
        "rulerScope",
        "getRulerScope",
        "()Landroidx/compose/ui/layout/RulerScope;",
        "rulerValues",
        "Landroidx/collection/MutableObjectFloatMap;",
        "rulerValuesCache",
        "addRulerReader",
        "",
        "ruler",
        "calculateAlignmentLine",
        "",
        "alignmentLine",
        "Landroidx/compose/ui/layout/AlignmentLine;",
        "captureRulers",
        "result",
        "captureRulers$ui_release",
        "placeableResult",
        "Landroidx/compose/ui/node/PlaceableResult;",
        "findAncestorRulerDefiner",
        "findRulerValue",
        "",
        "defaultValue",
        "get",
        "invalidateChildrenOfDefiningRuler",
        "layout",
        "width",
        "height",
        "alignmentLines",
        "",
        "rulers",
        "Lkotlin/Function1;",
        "Lkotlin/ExtensionFunctionType;",
        "placementBlock",
        "notifyRulerValueChange",
        "layoutNodes",
        "provideRelativeRulerValue",
        "value",
        "provideRulerValue",
        "replace",
        "replace$ui_release",
        "updatePlacedUnderMotionFrameOfReference",
        "newMFR",
        "invalidateAlignmentLinesFromPositionChange",
        "Landroidx/compose/ui/node/NodeCoordinator;",
        "isLayoutNodeAncestor",
        "ancestor",
        "Companion",
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

.field public static final Companion:Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion;

.field private static final onCommitAffectingRuler:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/node/PlaceableResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private _rulerScope:Landroidx/compose/ui/layout/RulerScope;

.field private isPlacedUnderMotionFrameOfReference:Z

.field private isPlacingForAlignment:Z

.field private isShallowPlacing:Z

.field private final placementScope:Landroidx/compose/ui/layout/Placeable$PlacementScope;

.field private rulerReaders:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Landroidx/compose/ui/layout/Ruler;",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/ui/node/WeakReference<",
            "Landroidx/compose/ui/node/LayoutNode;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private rulerValues:Landroidx/collection/MutableObjectFloatMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectFloatMap<",
            "Landroidx/compose/ui/layout/Ruler;",
            ">;"
        }
    .end annotation
.end field

.field private rulerValuesCache:Landroidx/collection/MutableObjectFloatMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectFloatMap<",
            "Landroidx/compose/ui/layout/Ruler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->Companion:Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion;

    .line 338
    sget-object v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1;->INSTANCE:Landroidx/compose/ui/node/LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sput-object v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->onCommitAffectingRuler:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Landroidx/compose/ui/layout/Placeable;-><init>()V

    .line 143
    invoke-static {p0}, Landroidx/compose/ui/layout/PlaceableKt;->PlacementScope(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)Landroidx/compose/ui/layout/Placeable$PlacementScope;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->placementScope:Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 46
    return-void
.end method

.method public static final synthetic access$captureRulers(Landroidx/compose/ui/node/LookaheadCapablePlaceable;Landroidx/compose/ui/node/PlaceableResult;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    .param p1, "placeableResult"    # Landroidx/compose/ui/node/PlaceableResult;

    .line 46
    invoke-direct {p0, p1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->captureRulers(Landroidx/compose/ui/node/PlaceableResult;)V

    return-void
.end method

.method private final addRulerReader(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/Ruler;)V
    .locals 47
    .param p1, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;
    .param p2, "ruler"    # Landroidx/compose/ui/layout/Ruler;

    .line 185
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerReaders:Landroidx/collection/MutableScatterMap;

    if-eqz v2, :cond_11

    check-cast v2, Landroidx/collection/ScatterMap;

    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v13, 0x0

    .line 522
    .local v13, "$i$f$forEachValue":I
    iget-object v14, v2, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 524
    .local v14, "v$iv":[Ljava/lang/Object;
    move-object v15, v2

    .local v15, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/16 v16, 0x0

    .line 525
    .local v16, "$i$f$forEachIndexed":I
    const-wide/16 v17, 0x80

    iget-object v3, v15, Landroidx/collection/ScatterMap;->metadata:[J

    .line 526
    .local v3, "m$iv$iv":[J
    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    .line 528
    .local v4, "lastIndex$iv$iv":I
    const-wide/16 v19, 0xff

    const/4 v5, 0x0

    .local v5, "i$iv$iv":I
    if-gt v5, v4, :cond_e

    .line 529
    :goto_0
    aget-wide v21, v3, v5

    .line 530
    .local v21, "slot$iv$iv":J
    move-wide/from16 v23, v21

    .local v23, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v6, 0x0

    .line 531
    .local v6, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v7, v23

    const/16 v23, 0x8

    const/16 v25, 0x7

    const-wide v26, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .end local v23    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v7, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    not-long v10, v7

    shl-long v10, v10, v25

    and-long/2addr v10, v7

    and-long v6, v10, v26

    .line 530
    .end local v6    # "$i$f$maskEmptyOrDeleted":I
    .end local v7    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    cmp-long v6, v6, v26

    if-eqz v6, :cond_d

    .line 532
    sub-int v6, v5, v4

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    rsub-int/lit8 v11, v6, 0x8

    .line 533
    .local v11, "bitCount$iv$iv":I
    const/4 v6, 0x0

    .local v6, "j$iv$iv":I
    :goto_1
    if-ge v6, v11, :cond_c

    .line 534
    and-long v7, v21, v19

    .local v7, "value$iv$iv$iv":J
    const/4 v10, 0x0

    .line 535
    .local v10, "$i$f$isFull":I
    cmp-long v24, v7, v17

    if-gez v24, :cond_0

    const/4 v7, 0x1

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    .line 534
    .end local v7    # "value$iv$iv$iv":J
    .end local v10    # "$i$f$isFull":I
    :goto_2
    if-eqz v7, :cond_b

    .line 536
    shl-int/lit8 v7, v5, 0x3

    add-int/2addr v7, v6

    .line 537
    .local v7, "index$iv$iv":I
    move v8, v7

    .local v8, "index$iv":I
    const/4 v10, 0x0

    .line 524
    .local v10, "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    aget-object v24, v14, v8

    check-cast v24, Landroidx/collection/MutableScatterSet;

    .local v24, "set":Landroidx/collection/MutableScatterSet;
    const/16 v28, 0x0

    .line 185
    .local v28, "$i$a$-forEachValue-LookaheadCapablePlaceable$addRulerReader$1":I
    move-object/from16 v29, v24

    .local v29, "this_$iv":Landroidx/collection/MutableScatterSet;
    const/16 v30, 0x0

    .line 538
    .local v30, "$i$f$removeIf":I
    move-object/from16 v9, v29

    .end local v29    # "this_$iv":Landroidx/collection/MutableScatterSet;
    .local v9, "this_$iv":Landroidx/collection/MutableScatterSet;
    iget-object v12, v9, Landroidx/collection/MutableScatterSet;->elements:[Ljava/lang/Object;

    .line 539
    .local v12, "elements$iv":[Ljava/lang/Object;
    move-object/from16 v31, v2

    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v31, "this_$iv":Landroidx/collection/ScatterMap;
    move-object v2, v9

    check-cast v2, Landroidx/collection/ScatterSet;

    .local v2, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v32, 0x0

    .line 540
    .local v32, "$i$f$forEachIndex":I
    nop

    .line 541
    move-object/from16 v33, v3

    .end local v3    # "m$iv$iv":[J
    .local v33, "m$iv$iv":[J
    iget-object v3, v2, Landroidx/collection/ScatterSet;->metadata:[J

    .line 542
    .restart local v3    # "m$iv$iv":[J
    move-object/from16 v34, v2

    .end local v2    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v34, "this_$iv$iv":Landroidx/collection/ScatterSet;
    array-length v2, v3

    add-int/lit8 v2, v2, -0x2

    .line 544
    .local v2, "lastIndex$iv$iv":I
    move-object/from16 v35, v3

    .end local v3    # "m$iv$iv":[J
    .local v35, "m$iv$iv":[J
    const/4 v3, 0x0

    .local v3, "i$iv$iv":I
    if-gt v3, v2, :cond_8

    .line 545
    :goto_3
    aget-wide v36, v35, v3

    .line 546
    .local v36, "slot$iv$iv":J
    move-wide/from16 v38, v36

    .local v38, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v40, 0x0

    .line 531
    .local v40, "$i$f$maskEmptyOrDeleted":I
    move/from16 v41, v6

    move/from16 v42, v7

    move-wide/from16 v6, v38

    move-object/from16 v39, v12

    move/from16 v38, v13

    .end local v7    # "index$iv$iv":I
    .end local v12    # "elements$iv":[Ljava/lang/Object;
    .end local v13    # "$i$f$forEachValue":I
    .local v6, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v38, "$i$f$forEachValue":I
    .local v39, "elements$iv":[Ljava/lang/Object;
    .local v41, "j$iv$iv":I
    .local v42, "index$iv$iv":I
    not-long v12, v6

    shl-long v12, v12, v25

    and-long/2addr v12, v6

    and-long v6, v12, v26

    .line 546
    .end local v6    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v40    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v6, v6, v26

    if-eqz v6, :cond_7

    .line 551
    sub-int v6, v3, v2

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    rsub-int/lit8 v6, v6, 0x8

    .line 552
    .local v6, "bitCount$iv$iv":I
    const/4 v7, 0x0

    .local v7, "j$iv$iv":I
    :goto_4
    if-ge v7, v6, :cond_6

    .line 553
    and-long v12, v36, v19

    .local v12, "value$iv$iv$iv":J
    const/16 v40, 0x0

    .line 535
    .local v40, "$i$f$isFull":I
    cmp-long v43, v12, v17

    if-gez v43, :cond_1

    const/4 v12, 0x1

    goto :goto_5

    :cond_1
    const/4 v12, 0x0

    .line 553
    .end local v12    # "value$iv$iv$iv":J
    .end local v40    # "$i$f$isFull":I
    :goto_5
    if-eqz v12, :cond_5

    .line 554
    shl-int/lit8 v12, v3, 0x3

    add-int/2addr v12, v7

    .line 555
    .local v12, "index$iv$iv":I
    move v13, v12

    .local v13, "index$iv":I
    const/16 v40, 0x0

    .line 556
    .local v40, "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv":I
    aget-object v43, v39, v13

    check-cast v43, Landroidx/compose/ui/node/WeakReference;

    .local v43, "it":Landroidx/compose/ui/node/WeakReference;
    const/16 v44, 0x0

    .line 185
    .local v44, "$i$a$-removeIf-LookaheadCapablePlaceable$addRulerReader$1$1":I
    invoke-virtual/range {v43 .. v43}, Landroidx/compose/ui/node/WeakReference;->get()Ljava/lang/Object;

    move-result-object v45

    check-cast v45, Landroidx/compose/ui/node/LayoutNode;

    if-eqz v45, :cond_2

    move/from16 v46, v7

    .end local v7    # "j$iv$iv":I
    .local v46, "j$iv$iv":I
    invoke-virtual/range {v45 .. v45}, Landroidx/compose/ui/node/LayoutNode;->isAttached()Z

    move-result v7

    move/from16 v45, v8

    const/4 v8, 0x1

    .end local v8    # "index$iv":I
    .local v45, "index$iv":I
    if-ne v7, v8, :cond_3

    const/4 v7, 0x1

    goto :goto_6

    .end local v45    # "index$iv":I
    .end local v46    # "j$iv$iv":I
    .restart local v7    # "j$iv$iv":I
    .restart local v8    # "index$iv":I
    :cond_2
    move/from16 v46, v7

    move/from16 v45, v8

    .end local v7    # "j$iv$iv":I
    .end local v8    # "index$iv":I
    .restart local v45    # "index$iv":I
    .restart local v46    # "j$iv$iv":I
    :cond_3
    const/4 v7, 0x0

    .line 556
    .end local v43    # "it":Landroidx/compose/ui/node/WeakReference;
    .end local v44    # "$i$a$-removeIf-LookaheadCapablePlaceable$addRulerReader$1$1":I
    :goto_6
    if-nez v7, :cond_4

    .line 557
    invoke-virtual {v9, v13}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    .line 559
    :cond_4
    nop

    .line 555
    .end local v13    # "index$iv":I
    .end local v40    # "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv":I
    goto :goto_7

    .line 553
    .end local v12    # "index$iv$iv":I
    .end local v45    # "index$iv":I
    .end local v46    # "j$iv$iv":I
    .restart local v7    # "j$iv$iv":I
    .restart local v8    # "index$iv":I
    :cond_5
    move/from16 v46, v7

    move/from16 v45, v8

    .line 560
    .end local v7    # "j$iv$iv":I
    .end local v8    # "index$iv":I
    .restart local v45    # "index$iv":I
    .restart local v46    # "j$iv$iv":I
    :goto_7
    shr-long v36, v36, v23

    .line 552
    add-int/lit8 v7, v46, 0x1

    move/from16 v8, v45

    .end local v46    # "j$iv$iv":I
    .restart local v7    # "j$iv$iv":I
    goto :goto_4

    .end local v45    # "index$iv":I
    .restart local v8    # "index$iv":I
    :cond_6
    move/from16 v46, v7

    move/from16 v45, v8

    .line 562
    .end local v7    # "j$iv$iv":I
    .end local v8    # "index$iv":I
    .restart local v45    # "index$iv":I
    move/from16 v7, v23

    if-ne v6, v7, :cond_a

    goto :goto_8

    .line 546
    .end local v6    # "bitCount$iv$iv":I
    .end local v45    # "index$iv":I
    .restart local v8    # "index$iv":I
    :cond_7
    move/from16 v45, v8

    .line 544
    .end local v8    # "index$iv":I
    .end local v36    # "slot$iv$iv":J
    .restart local v45    # "index$iv":I
    :goto_8
    if-eq v3, v2, :cond_9

    add-int/lit8 v3, v3, 0x1

    move/from16 v13, v38

    move-object/from16 v12, v39

    move/from16 v6, v41

    move/from16 v7, v42

    move/from16 v8, v45

    const/16 v23, 0x8

    goto/16 :goto_3

    .end local v38    # "$i$f$forEachValue":I
    .end local v39    # "elements$iv":[Ljava/lang/Object;
    .end local v41    # "j$iv$iv":I
    .end local v42    # "index$iv$iv":I
    .end local v45    # "index$iv":I
    .local v6, "j$iv$iv":I
    .local v7, "index$iv$iv":I
    .restart local v8    # "index$iv":I
    .local v12, "elements$iv":[Ljava/lang/Object;
    .local v13, "$i$f$forEachValue":I
    :cond_8
    move/from16 v41, v6

    move/from16 v42, v7

    move/from16 v45, v8

    move-object/from16 v39, v12

    move/from16 v38, v13

    .line 565
    .end local v3    # "i$iv$iv":I
    .end local v6    # "j$iv$iv":I
    .end local v7    # "index$iv$iv":I
    .end local v8    # "index$iv":I
    .end local v12    # "elements$iv":[Ljava/lang/Object;
    .end local v13    # "$i$f$forEachValue":I
    .restart local v38    # "$i$f$forEachValue":I
    .restart local v39    # "elements$iv":[Ljava/lang/Object;
    .restart local v41    # "j$iv$iv":I
    .restart local v42    # "index$iv$iv":I
    .restart local v45    # "index$iv":I
    :cond_9
    nop

    .line 566
    .end local v2    # "lastIndex$iv$iv":I
    .end local v32    # "$i$f$forEachIndex":I
    .end local v34    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v35    # "m$iv$iv":[J
    :cond_a
    nop

    .line 185
    .end local v9    # "this_$iv":Landroidx/collection/MutableScatterSet;
    .end local v30    # "$i$f$removeIf":I
    .end local v39    # "elements$iv":[Ljava/lang/Object;
    nop

    .line 524
    .end local v24    # "set":Landroidx/collection/MutableScatterSet;
    .end local v28    # "$i$a$-forEachValue-LookaheadCapablePlaceable$addRulerReader$1":I
    nop

    .line 537
    .end local v10    # "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    .end local v45    # "index$iv":I
    goto :goto_9

    .line 534
    .end local v31    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v33    # "m$iv$iv":[J
    .end local v38    # "$i$f$forEachValue":I
    .end local v41    # "j$iv$iv":I
    .end local v42    # "index$iv$iv":I
    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    .local v3, "m$iv$iv":[J
    .restart local v6    # "j$iv$iv":I
    .restart local v13    # "$i$f$forEachValue":I
    :cond_b
    move-object/from16 v31, v2

    move-object/from16 v33, v3

    move/from16 v41, v6

    move/from16 v38, v13

    .line 567
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v3    # "m$iv$iv":[J
    .end local v6    # "j$iv$iv":I
    .end local v13    # "$i$f$forEachValue":I
    .restart local v31    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v33    # "m$iv$iv":[J
    .restart local v38    # "$i$f$forEachValue":I
    .restart local v41    # "j$iv$iv":I
    :goto_9
    const/16 v7, 0x8

    shr-long v21, v21, v7

    .line 533
    add-int/lit8 v6, v41, 0x1

    move/from16 v23, v7

    move-object/from16 v2, v31

    move-object/from16 v3, v33

    move/from16 v13, v38

    .end local v41    # "j$iv$iv":I
    .restart local v6    # "j$iv$iv":I
    goto/16 :goto_1

    .end local v31    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v33    # "m$iv$iv":[J
    .end local v38    # "$i$f$forEachValue":I
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v3    # "m$iv$iv":[J
    .restart local v13    # "$i$f$forEachValue":I
    :cond_c
    move-object/from16 v31, v2

    move-object/from16 v33, v3

    move/from16 v41, v6

    move/from16 v38, v13

    move/from16 v7, v23

    .line 569
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v3    # "m$iv$iv":[J
    .end local v6    # "j$iv$iv":I
    .end local v13    # "$i$f$forEachValue":I
    .restart local v31    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v33    # "m$iv$iv":[J
    .restart local v38    # "$i$f$forEachValue":I
    if-ne v11, v7, :cond_10

    goto :goto_a

    .line 530
    .end local v11    # "bitCount$iv$iv":I
    .end local v31    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v33    # "m$iv$iv":[J
    .end local v38    # "$i$f$forEachValue":I
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v3    # "m$iv$iv":[J
    .restart local v13    # "$i$f$forEachValue":I
    :cond_d
    move-object/from16 v31, v2

    move-object/from16 v33, v3

    move/from16 v38, v13

    .line 528
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v3    # "m$iv$iv":[J
    .end local v13    # "$i$f$forEachValue":I
    .end local v21    # "slot$iv$iv":J
    .restart local v31    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v33    # "m$iv$iv":[J
    .restart local v38    # "$i$f$forEachValue":I
    :goto_a
    if-eq v5, v4, :cond_f

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v31

    move-object/from16 v3, v33

    move/from16 v13, v38

    goto/16 :goto_0

    .end local v31    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v33    # "m$iv$iv":[J
    .end local v38    # "$i$f$forEachValue":I
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v3    # "m$iv$iv":[J
    .restart local v13    # "$i$f$forEachValue":I
    :cond_e
    move-object/from16 v31, v2

    move-object/from16 v33, v3

    move/from16 v38, v13

    const/16 v25, 0x7

    const-wide v26, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 572
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v3    # "m$iv$iv":[J
    .end local v5    # "i$iv$iv":I
    .end local v13    # "$i$f$forEachValue":I
    .restart local v31    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v33    # "m$iv$iv":[J
    .restart local v38    # "$i$f$forEachValue":I
    :cond_f
    nop

    .line 573
    .end local v4    # "lastIndex$iv$iv":I
    .end local v15    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v16    # "$i$f$forEachIndexed":I
    .end local v33    # "m$iv$iv":[J
    :cond_10
    nop

    .end local v14    # "v$iv":[Ljava/lang/Object;
    .end local v31    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v38    # "$i$f$forEachValue":I
    goto :goto_b

    .line 185
    :cond_11
    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    const/16 v25, 0x7

    const-wide v26, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 186
    :goto_b
    iget-object v2, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerReaders:Landroidx/collection/MutableScatterMap;

    if-eqz v2, :cond_1a

    .local v2, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v3, 0x0

    .line 574
    .local v3, "$i$f$removeIf":I
    move-object v4, v2

    check-cast v4, Landroidx/collection/ScatterMap;

    .local v4, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v5, 0x0

    .line 575
    .local v5, "$i$f$forEachIndexed":I
    iget-object v6, v4, Landroidx/collection/ScatterMap;->metadata:[J

    .line 576
    .local v6, "m$iv$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 578
    .local v7, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv$iv":I
    if-gt v8, v7, :cond_17

    .line 579
    :goto_c
    aget-wide v9, v6, v8

    .line 580
    .local v9, "slot$iv$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v13, 0x0

    .line 581
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    shl-long v14, v14, v25

    and-long/2addr v14, v11

    and-long v11, v14, v26

    .line 580
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v26

    if-eqz v11, :cond_16

    .line 582
    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v23, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 583
    .local v11, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_d
    if-ge v12, v11, :cond_15

    .line 584
    and-long v13, v9, v19

    .local v13, "value$iv$iv$iv":J
    const/4 v15, 0x0

    .line 585
    .local v15, "$i$f$isFull":I
    cmp-long v16, v13, v17

    if-gez v16, :cond_12

    const/4 v13, 0x1

    goto :goto_e

    :cond_12
    const/4 v13, 0x0

    .line 584
    .end local v13    # "value$iv$iv$iv":J
    .end local v15    # "$i$f$isFull":I
    :goto_e
    if-eqz v13, :cond_14

    .line 586
    shl-int/lit8 v13, v8, 0x3

    add-int/2addr v13, v12

    .line 587
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/4 v15, 0x0

    .line 588
    .local v15, "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv":I
    move/from16 v16, v3

    .end local v3    # "$i$f$removeIf":I
    .local v16, "$i$f$removeIf":I
    iget-object v3, v2, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v3, v3, v14

    move-object/from16 v21, v3

    iget-object v3, v2, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v3, v3, v14

    check-cast v3, Landroidx/collection/MutableScatterSet;

    .local v3, "value":Landroidx/collection/MutableScatterSet;
    check-cast v21, Landroidx/compose/ui/layout/Ruler;

    const/16 v21, 0x0

    .line 186
    .local v21, "$i$a$-removeIf-LookaheadCapablePlaceable$addRulerReader$2":I
    invoke-virtual {v3}, Landroidx/collection/MutableScatterSet;->isEmpty()Z

    move-result v3

    .line 588
    .end local v3    # "value":Landroidx/collection/MutableScatterSet;
    .end local v21    # "$i$a$-removeIf-LookaheadCapablePlaceable$addRulerReader$2":I
    if-eqz v3, :cond_13

    .line 589
    invoke-virtual {v2, v14}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 591
    :cond_13
    nop

    .line 587
    .end local v14    # "index$iv":I
    .end local v15    # "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv":I
    goto :goto_f

    .line 584
    .end local v13    # "index$iv$iv":I
    .end local v16    # "$i$f$removeIf":I
    .local v3, "$i$f$removeIf":I
    :cond_14
    move/from16 v16, v3

    .line 592
    .end local v3    # "$i$f$removeIf":I
    .restart local v16    # "$i$f$removeIf":I
    :goto_f
    const/16 v3, 0x8

    shr-long/2addr v9, v3

    .line 583
    add-int/lit8 v12, v12, 0x1

    move/from16 v3, v16

    goto :goto_d

    .end local v16    # "$i$f$removeIf":I
    .restart local v3    # "$i$f$removeIf":I
    :cond_15
    move/from16 v16, v3

    const/16 v3, 0x8

    .line 594
    .end local v3    # "$i$f$removeIf":I
    .end local v12    # "j$iv$iv":I
    .restart local v16    # "$i$f$removeIf":I
    if-ne v11, v3, :cond_19

    goto :goto_10

    .line 580
    .end local v11    # "bitCount$iv$iv":I
    .end local v16    # "$i$f$removeIf":I
    .restart local v3    # "$i$f$removeIf":I
    :cond_16
    move/from16 v16, v3

    const/16 v3, 0x8

    .line 578
    .end local v3    # "$i$f$removeIf":I
    .end local v9    # "slot$iv$iv":J
    .restart local v16    # "$i$f$removeIf":I
    :goto_10
    if-eq v8, v7, :cond_18

    add-int/lit8 v8, v8, 0x1

    move/from16 v3, v16

    goto :goto_c

    .end local v16    # "$i$f$removeIf":I
    .restart local v3    # "$i$f$removeIf":I
    :cond_17
    move/from16 v16, v3

    .line 597
    .end local v3    # "$i$f$removeIf":I
    .end local v8    # "i$iv$iv":I
    .restart local v16    # "$i$f$removeIf":I
    :cond_18
    nop

    .line 598
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v7    # "lastIndex$iv$iv":I
    :cond_19
    nop

    .line 188
    .end local v2    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v16    # "$i$f$removeIf":I
    :cond_1a
    iget-object v2, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerReaders:Landroidx/collection/MutableScatterMap;

    const/4 v3, 0x0

    if-nez v2, :cond_1b

    .line 189
    new-instance v2, Landroidx/collection/MutableScatterMap;

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct {v2, v9, v8, v3}, Landroidx/collection/MutableScatterMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v2

    .local v4, "it":Landroidx/collection/MutableScatterMap;
    const/4 v5, 0x0

    .line 190
    .local v5, "$i$a$-also-LookaheadCapablePlaceable$addRulerReader$readerMap$1":I
    iput-object v4, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerReaders:Landroidx/collection/MutableScatterMap;

    .line 191
    nop

    .line 189
    .end local v4    # "it":Landroidx/collection/MutableScatterMap;
    .end local v5    # "$i$a$-also-LookaheadCapablePlaceable$addRulerReader$readerMap$1":I
    nop

    .line 188
    :cond_1b
    nop

    .line 187
    nop

    .line 192
    .local v2, "readerMap":Landroidx/collection/MutableScatterMap;
    move-object v4, v2

    .local v4, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v5, 0x0

    .line 599
    .local v5, "$i$f$getOrPut":I
    invoke-virtual {v4, v1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_1c

    const/4 v6, 0x0

    .line 192
    .local v6, "$i$a$-getOrPut-LookaheadCapablePlaceable$addRulerReader$readers$1":I
    new-instance v7, Landroidx/collection/MutableScatterSet;

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct {v7, v9, v8, v3}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 599
    .end local v6    # "$i$a$-getOrPut-LookaheadCapablePlaceable$addRulerReader$readers$1":I
    move-object v3, v7

    .line 600
    .local v3, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 599
    .local v6, "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    invoke-virtual {v4, v1, v3}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v6, v7

    .line 192
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v4    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v5    # "$i$f$getOrPut":I
    .end local v6    # "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    :cond_1c
    move-object v3, v6

    check-cast v3, Landroidx/collection/MutableScatterSet;

    .line 193
    .local v3, "readers":Landroidx/collection/MutableScatterSet;
    new-instance v4, Landroidx/compose/ui/node/WeakReference;

    move-object/from16 v5, p1

    invoke-direct {v4, v5}, Landroidx/compose/ui/node/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroidx/collection/MutableScatterSet;->plusAssign(Ljava/lang/Object;)V

    .line 194
    return-void
.end method

.method private final captureRulers(Landroidx/compose/ui/node/PlaceableResult;)V
    .locals 36
    .param p1, "placeableResult"    # Landroidx/compose/ui/node/PlaceableResult;

    .line 261
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacingForAlignment:Z

    if-eqz v2, :cond_0

    .line 262
    return-void

    .line 264
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/node/PlaceableResult;->getResult()Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureResult;->getRulers()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    .line 265
    .local v2, "rulerLambda":Lkotlin/jvm/functions/Function1;
    iget-object v3, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerReaders:Landroidx/collection/MutableScatterMap;

    .line 266
    .local v3, "rulerReaders":Landroidx/collection/MutableScatterMap;
    const/16 v12, 0x8

    if-nez v2, :cond_9

    .line 268
    if-eqz v3, :cond_8

    .line 269
    move-object v14, v3

    check-cast v14, Landroidx/collection/ScatterMap;

    .local v14, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v15, 0x0

    .line 634
    .local v15, "$i$f$forEachValue":I
    const-wide/16 v16, 0x80

    iget-object v4, v14, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 636
    .local v4, "v$iv":[Ljava/lang/Object;
    move-object v5, v14

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/16 v18, 0x0

    .line 637
    .local v18, "$i$f$forEachIndexed":I
    const-wide/16 v19, 0xff

    iget-object v6, v5, Landroidx/collection/ScatterMap;->metadata:[J

    .line 638
    .local v6, "m$iv$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 640
    .local v7, "lastIndex$iv$iv":I
    const/16 v21, 0x7

    const/4 v8, 0x0

    .local v8, "i$iv$iv":I
    if-gt v8, v7, :cond_5

    .line 641
    :goto_0
    aget-wide v22, v6, v8

    .line 642
    .local v22, "slot$iv$iv":J
    move-wide/from16 v24, v22

    .local v24, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v26, 0x0

    .line 643
    .local v26, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v9, v24

    const-wide v27, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    move-object/from16 v25, v14

    .end local v14    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v24    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v9, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v25, "this_$iv":Landroidx/collection/ScatterMap;
    not-long v13, v9

    shl-long v13, v13, v21

    and-long/2addr v13, v9

    and-long v9, v13, v27

    .line 642
    .end local v9    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v26    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v9, v9, v27

    if-eqz v9, :cond_4

    .line 644
    sub-int v9, v8, v7

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    rsub-int/lit8 v9, v9, 0x8

    .line 645
    .local v9, "bitCount$iv$iv":I
    const/4 v10, 0x0

    .local v10, "j$iv$iv":I
    :goto_1
    if-ge v10, v9, :cond_3

    .line 646
    and-long v13, v22, v19

    .local v13, "value$iv$iv$iv":J
    const/16 v26, 0x0

    .line 647
    .local v26, "$i$f$isFull":I
    cmp-long v29, v13, v16

    if-gez v29, :cond_1

    const/4 v13, 0x1

    goto :goto_2

    :cond_1
    const/4 v13, 0x0

    .line 646
    .end local v13    # "value$iv$iv$iv":J
    .end local v26    # "$i$f$isFull":I
    :goto_2
    if-eqz v13, :cond_2

    .line 648
    shl-int/lit8 v13, v8, 0x3

    add-int/2addr v13, v10

    .line 649
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/16 v26, 0x0

    .line 636
    .local v26, "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    aget-object v29, v4, v14

    move-object/from16 v11, v29

    check-cast v11, Landroidx/collection/MutableScatterSet;

    .local v11, "it":Landroidx/collection/MutableScatterSet;
    const/16 v29, 0x0

    .line 269
    .local v29, "$i$a$-forEachValue-LookaheadCapablePlaceable$captureRulers$2":I
    invoke-direct {v0, v11}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->notifyRulerValueChange(Landroidx/collection/MutableScatterSet;)V

    .line 636
    .end local v11    # "it":Landroidx/collection/MutableScatterSet;
    .end local v29    # "$i$a$-forEachValue-LookaheadCapablePlaceable$captureRulers$2":I
    nop

    .line 649
    .end local v14    # "index$iv":I
    .end local v26    # "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    nop

    .line 651
    .end local v13    # "index$iv$iv":I
    :cond_2
    shr-long v22, v22, v12

    .line 645
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 653
    .end local v10    # "j$iv$iv":I
    :cond_3
    if-ne v9, v12, :cond_7

    .line 640
    .end local v9    # "bitCount$iv$iv":I
    .end local v22    # "slot$iv$iv":J
    :cond_4
    if-eq v8, v7, :cond_6

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v14, v25

    goto :goto_0

    .end local v25    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v14, "this_$iv":Landroidx/collection/ScatterMap;
    :cond_5
    move-object/from16 v25, v14

    .line 656
    .end local v8    # "i$iv$iv":I
    .end local v14    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v25    # "this_$iv":Landroidx/collection/ScatterMap;
    :cond_6
    nop

    .line 657
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "m$iv$iv":[J
    .end local v7    # "lastIndex$iv$iv":I
    .end local v18    # "$i$f$forEachIndexed":I
    :cond_7
    nop

    .line 270
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v15    # "$i$f$forEachValue":I
    .end local v25    # "this_$iv":Landroidx/collection/ScatterMap;
    invoke-virtual {v3}, Landroidx/collection/MutableScatterMap;->clear()V

    move-object/from16 v25, v2

    goto/16 :goto_10

    .line 268
    :cond_8
    move-object/from16 v25, v2

    goto/16 :goto_10

    .line 274
    :cond_9
    const-wide/16 v16, 0x80

    const-wide/16 v19, 0xff

    const/16 v21, 0x7

    const-wide v27, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    iget-object v4, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValuesCache:Landroidx/collection/MutableObjectFloatMap;

    const/4 v5, 0x0

    if-nez v4, :cond_a

    new-instance v4, Landroidx/collection/MutableObjectFloatMap;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct {v4, v6, v7, v5}, Landroidx/collection/MutableObjectFloatMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v4

    .line 658
    .local v6, "it":Landroidx/collection/MutableObjectFloatMap;
    const/4 v7, 0x0

    .line 274
    .local v7, "$i$a$-also-LookaheadCapablePlaceable$captureRulers$oldValues$1":I
    iput-object v6, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValuesCache:Landroidx/collection/MutableObjectFloatMap;

    .line 273
    .end local v6    # "it":Landroidx/collection/MutableObjectFloatMap;
    .end local v7    # "$i$a$-also-LookaheadCapablePlaceable$captureRulers$oldValues$1":I
    :cond_a
    nop

    .line 275
    .local v4, "oldValues":Landroidx/collection/MutableObjectFloatMap;
    iget-object v6, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValues:Landroidx/collection/MutableObjectFloatMap;

    if-nez v6, :cond_b

    new-instance v6, Landroidx/collection/MutableObjectFloatMap;

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-direct {v6, v7, v8, v5}, Landroidx/collection/MutableObjectFloatMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v6

    .line 658
    .local v5, "it":Landroidx/collection/MutableObjectFloatMap;
    const/4 v9, 0x0

    .line 275
    .local v9, "$i$a$-also-LookaheadCapablePlaceable$captureRulers$newValues$1":I
    iput-object v5, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValues:Landroidx/collection/MutableObjectFloatMap;

    .end local v5    # "it":Landroidx/collection/MutableObjectFloatMap;
    .end local v9    # "$i$a$-also-LookaheadCapablePlaceable$captureRulers$newValues$1":I
    goto :goto_3

    :cond_b
    const/4 v7, 0x0

    const/4 v8, 0x1

    .line 276
    .local v6, "newValues":Landroidx/collection/MutableObjectFloatMap;
    :goto_3
    move-object v5, v6

    check-cast v5, Landroidx/collection/ObjectFloatMap;

    invoke-virtual {v4, v5}, Landroidx/collection/MutableObjectFloatMap;->putAll(Landroidx/collection/ObjectFloatMap;)V

    .line 277
    invoke-virtual {v6}, Landroidx/collection/MutableObjectFloatMap;->clear()V

    .line 279
    invoke-virtual {v0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getOwner$ui_release()Landroidx/compose/ui/node/Owner;

    move-result-object v5

    if-eqz v5, :cond_c

    invoke-interface {v5}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()Landroidx/compose/ui/node/OwnerSnapshotObserver;

    move-result-object v5

    if-eqz v5, :cond_c

    .line 280
    move-object v9, v1

    check-cast v9, Landroidx/compose/ui/node/OwnerScope;

    .line 281
    sget-object v10, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->onCommitAffectingRuler:Lkotlin/jvm/functions/Function1;

    .line 279
    new-instance v11, Landroidx/compose/ui/node/LookaheadCapablePlaceable$captureRulers$3;

    invoke-direct {v11, v1, v0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable$captureRulers$3;-><init>(Landroidx/compose/ui/node/PlaceableResult;Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V

    check-cast v11, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v5, v9, v10, v11}, Landroidx/compose/ui/node/OwnerSnapshotObserver;->observeReads$ui_release(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 286
    :cond_c
    if-eqz v3, :cond_17

    .line 288
    move-object v5, v4

    check-cast v5, Landroidx/collection/ObjectFloatMap;

    .local v5, "this_$iv":Landroidx/collection/ObjectFloatMap;
    const/4 v9, 0x0

    .line 659
    .local v9, "$i$f$forEach":I
    iget-object v10, v5, Landroidx/collection/ObjectFloatMap;->keys:[Ljava/lang/Object;

    .line 660
    .local v10, "k$iv":[Ljava/lang/Object;
    iget-object v11, v5, Landroidx/collection/ObjectFloatMap;->values:[F

    .line 662
    .local v11, "v$iv":[F
    move-object v13, v5

    .local v13, "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    const/4 v14, 0x0

    .line 663
    .local v14, "$i$f$forEachIndexed":I
    iget-object v15, v13, Landroidx/collection/ObjectFloatMap;->metadata:[J

    .line 664
    .local v15, "m$iv$iv":[J
    array-length v7, v15

    add-int/lit8 v7, v7, -0x2

    .line 666
    .local v7, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    .restart local v8    # "i$iv$iv":I
    if-gt v8, v7, :cond_14

    .line 667
    :goto_4
    aget-wide v22, v15, v8

    .line 668
    .restart local v22    # "slot$iv$iv":J
    move-wide/from16 v25, v22

    .local v25, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v18, 0x0

    .line 669
    .local v18, "$i$f$maskEmptyOrDeleted":I
    move/from16 v29, v12

    move-object/from16 v30, v13

    move-wide/from16 v12, v25

    move-object/from16 v25, v2

    .end local v2    # "rulerLambda":Lkotlin/jvm/functions/Function1;
    .end local v13    # "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v25, "rulerLambda":Lkotlin/jvm/functions/Function1;
    .local v30, "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    not-long v1, v12

    shl-long v1, v1, v21

    and-long/2addr v1, v12

    and-long v1, v1, v27

    .line 668
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v18    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v1, v1, v27

    if-eqz v1, :cond_13

    .line 670
    sub-int v1, v8, v7

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    rsub-int/lit8 v12, v1, 0x8

    .line 671
    .local v12, "bitCount$iv$iv":I
    const/4 v1, 0x0

    .local v1, "j$iv$iv":I
    :goto_5
    if-ge v1, v12, :cond_12

    .line 672
    and-long v31, v22, v19

    .local v31, "value$iv$iv$iv":J
    const/4 v2, 0x0

    .line 673
    .local v2, "$i$f$isFull":I
    cmp-long v13, v31, v16

    if-gez v13, :cond_d

    const/4 v2, 0x1

    goto :goto_6

    :cond_d
    const/4 v2, 0x0

    .line 672
    .end local v2    # "$i$f$isFull":I
    .end local v31    # "value$iv$iv$iv":J
    :goto_6
    if-eqz v2, :cond_11

    .line 674
    shl-int/lit8 v2, v8, 0x3

    add-int/2addr v2, v1

    .line 675
    .local v2, "index$iv$iv":I
    move v13, v2

    .local v13, "index$iv":I
    const/16 v18, 0x0

    .line 662
    .local v18, "$i$a$-forEachIndexed-ObjectFloatMap$forEach$1$iv":I
    aget-object v26, v10, v13

    aget v31, v11, v13

    .local v31, "oldValue":F
    check-cast v26, Landroidx/compose/ui/layout/Ruler;

    .local v26, "ruler":Landroidx/compose/ui/layout/Ruler;
    move-object/from16 v32, v26

    .end local v26    # "ruler":Landroidx/compose/ui/layout/Ruler;
    .local v32, "ruler":Landroidx/compose/ui/layout/Ruler;
    const/16 v26, 0x0

    .line 289
    .local v26, "$i$a$-forEach-LookaheadCapablePlaceable$captureRulers$4":I
    move/from16 v33, v1

    .end local v1    # "j$iv$iv":I
    .local v33, "j$iv$iv":I
    const/high16 v1, 0x7fc00000    # Float.NaN

    move/from16 v34, v2

    move-object/from16 v2, v32

    .end local v32    # "ruler":Landroidx/compose/ui/layout/Ruler;
    .local v2, "ruler":Landroidx/compose/ui/layout/Ruler;
    .local v34, "index$iv$iv":I
    invoke-virtual {v6, v2, v1}, Landroidx/collection/MutableObjectFloatMap;->getOrDefault(Ljava/lang/Object;F)F

    move-result v1

    .line 290
    .local v1, "newValue":F
    cmpg-float v32, v1, v31

    if-nez v32, :cond_e

    const/16 v32, 0x1

    goto :goto_7

    :cond_e
    const/16 v32, 0x0

    :goto_7
    if-nez v32, :cond_f

    .line 293
    invoke-virtual {v3, v2}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v32

    move/from16 v35, v1

    .end local v1    # "newValue":F
    .local v35, "newValue":F
    move-object/from16 v1, v32

    check-cast v1, Landroidx/collection/MutableScatterSet;

    .line 294
    .local v1, "readers":Landroidx/collection/MutableScatterSet;
    if-eqz v1, :cond_10

    .line 295
    invoke-direct {v0, v1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->notifyRulerValueChange(Landroidx/collection/MutableScatterSet;)V

    goto :goto_8

    .line 290
    .end local v35    # "newValue":F
    .local v1, "newValue":F
    :cond_f
    move/from16 v35, v1

    .line 298
    .end local v1    # "newValue":F
    .restart local v35    # "newValue":F
    :cond_10
    :goto_8
    nop

    .line 662
    .end local v2    # "ruler":Landroidx/compose/ui/layout/Ruler;
    .end local v26    # "$i$a$-forEach-LookaheadCapablePlaceable$captureRulers$4":I
    .end local v31    # "oldValue":F
    .end local v35    # "newValue":F
    nop

    .line 675
    .end local v13    # "index$iv":I
    .end local v18    # "$i$a$-forEachIndexed-ObjectFloatMap$forEach$1$iv":I
    goto :goto_9

    .line 672
    .end local v33    # "j$iv$iv":I
    .end local v34    # "index$iv$iv":I
    .local v1, "j$iv$iv":I
    :cond_11
    move/from16 v33, v1

    .line 677
    .end local v1    # "j$iv$iv":I
    .restart local v33    # "j$iv$iv":I
    :goto_9
    shr-long v22, v22, v29

    .line 671
    add-int/lit8 v1, v33, 0x1

    .end local v33    # "j$iv$iv":I
    .restart local v1    # "j$iv$iv":I
    goto :goto_5

    :cond_12
    move/from16 v33, v1

    .line 679
    .end local v1    # "j$iv$iv":I
    move/from16 v1, v29

    if-ne v12, v1, :cond_16

    .line 666
    .end local v12    # "bitCount$iv$iv":I
    .end local v22    # "slot$iv$iv":J
    :cond_13
    if-eq v8, v7, :cond_15

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    move-object/from16 v13, v30

    const/16 v12, 0x8

    goto/16 :goto_4

    .end local v25    # "rulerLambda":Lkotlin/jvm/functions/Function1;
    .end local v30    # "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    .local v2, "rulerLambda":Lkotlin/jvm/functions/Function1;
    .local v13, "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    :cond_14
    move-object/from16 v25, v2

    move-object/from16 v30, v13

    .line 682
    .end local v2    # "rulerLambda":Lkotlin/jvm/functions/Function1;
    .end local v8    # "i$iv$iv":I
    .end local v13    # "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    .restart local v25    # "rulerLambda":Lkotlin/jvm/functions/Function1;
    .restart local v30    # "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    :cond_15
    nop

    .line 683
    .end local v7    # "lastIndex$iv$iv":I
    .end local v14    # "$i$f$forEachIndexed":I
    .end local v15    # "m$iv$iv":[J
    .end local v30    # "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    :cond_16
    goto :goto_a

    .line 286
    .end local v5    # "this_$iv":Landroidx/collection/ObjectFloatMap;
    .end local v9    # "$i$f$forEach":I
    .end local v10    # "k$iv":[Ljava/lang/Object;
    .end local v11    # "v$iv":[F
    .end local v25    # "rulerLambda":Lkotlin/jvm/functions/Function1;
    .restart local v2    # "rulerLambda":Lkotlin/jvm/functions/Function1;
    :cond_17
    move-object/from16 v25, v2

    .line 301
    .end local v2    # "rulerLambda":Lkotlin/jvm/functions/Function1;
    .restart local v25    # "rulerLambda":Lkotlin/jvm/functions/Function1;
    :goto_a
    move-object v1, v6

    check-cast v1, Landroidx/collection/ObjectFloatMap;

    .local v1, "this_$iv":Landroidx/collection/ObjectFloatMap;
    const/4 v2, 0x0

    .line 684
    .local v2, "$i$f$forEachKey":I
    iget-object v5, v1, Landroidx/collection/ObjectFloatMap;->keys:[Ljava/lang/Object;

    .line 686
    .local v5, "k$iv":[Ljava/lang/Object;
    move-object v7, v1

    .local v7, "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    const/4 v8, 0x0

    .line 687
    .local v8, "$i$f$forEachIndexed":I
    iget-object v9, v7, Landroidx/collection/ObjectFloatMap;->metadata:[J

    .line 688
    .local v9, "m$iv$iv":[J
    array-length v10, v9

    add-int/lit8 v10, v10, -0x2

    .line 690
    .local v10, "lastIndex$iv$iv":I
    const/4 v11, 0x0

    .local v11, "i$iv$iv":I
    if-gt v11, v10, :cond_1d

    .line 691
    :goto_b
    aget-wide v12, v9, v11

    .line 692
    .local v12, "slot$iv$iv":J
    move-wide v14, v12

    .local v14, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v18, 0x0

    .line 693
    .local v18, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v22, v1

    .end local v1    # "this_$iv":Landroidx/collection/ObjectFloatMap;
    .local v22, "this_$iv":Landroidx/collection/ObjectFloatMap;
    not-long v0, v14

    shl-long v0, v0, v21

    and-long/2addr v0, v14

    and-long v0, v0, v27

    .line 692
    .end local v14    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v18    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v27

    if-eqz v0, :cond_1c

    .line 694
    sub-int v0, v11, v10

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v29, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 695
    .local v0, "bitCount$iv$iv":I
    const/4 v1, 0x0

    .local v1, "j$iv$iv":I
    :goto_c
    if-ge v1, v0, :cond_1b

    .line 696
    and-long v14, v12, v19

    .local v14, "value$iv$iv$iv":J
    const/16 v18, 0x0

    .line 697
    .local v18, "$i$f$isFull":I
    cmp-long v23, v14, v16

    if-gez v23, :cond_18

    const/4 v14, 0x1

    goto :goto_d

    :cond_18
    const/4 v14, 0x0

    .line 696
    .end local v14    # "value$iv$iv$iv":J
    .end local v18    # "$i$f$isFull":I
    :goto_d
    if-eqz v14, :cond_1a

    .line 698
    shl-int/lit8 v14, v11, 0x3

    add-int/2addr v14, v1

    .line 699
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v18, 0x0

    .line 686
    .local v18, "$i$a$-forEachIndexed-ObjectFloatMap$forEachKey$1$iv":I
    aget-object v23, v5, v15

    move/from16 v26, v1

    .end local v1    # "j$iv$iv":I
    .local v26, "j$iv$iv":I
    move-object/from16 v1, v23

    check-cast v1, Landroidx/compose/ui/layout/Ruler;

    .local v1, "ruler":Landroidx/compose/ui/layout/Ruler;
    const/16 v23, 0x0

    .line 302
    .local v23, "$i$a$-forEachKey-LookaheadCapablePlaceable$captureRulers$5":I
    move/from16 v30, v2

    .end local v2    # "$i$f$forEachKey":I
    .local v30, "$i$f$forEachKey":I
    move-object v2, v4

    check-cast v2, Landroidx/collection/ObjectFloatMap;

    .local v2, "this_$iv":Landroidx/collection/ObjectFloatMap;
    const/16 v31, 0x0

    .line 700
    .local v31, "$i$f$contains":I
    invoke-virtual {v2, v1}, Landroidx/collection/ObjectFloatMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    .line 302
    .end local v2    # "this_$iv":Landroidx/collection/ObjectFloatMap;
    .end local v31    # "$i$f$contains":I
    if-nez v2, :cond_19

    .line 303
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getParent()Landroidx/compose/ui/node/LookaheadCapablePlaceable;

    move-result-object v2

    if-eqz v2, :cond_19

    invoke-direct {v2, v1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->invalidateChildrenOfDefiningRuler(Landroidx/compose/ui/layout/Ruler;)V

    .line 305
    :cond_19
    nop

    .line 686
    .end local v1    # "ruler":Landroidx/compose/ui/layout/Ruler;
    .end local v23    # "$i$a$-forEachKey-LookaheadCapablePlaceable$captureRulers$5":I
    nop

    .line 699
    .end local v15    # "index$iv":I
    .end local v18    # "$i$a$-forEachIndexed-ObjectFloatMap$forEachKey$1$iv":I
    goto :goto_e

    .line 696
    .end local v14    # "index$iv$iv":I
    .end local v26    # "j$iv$iv":I
    .end local v30    # "$i$f$forEachKey":I
    .local v1, "j$iv$iv":I
    .local v2, "$i$f$forEachKey":I
    :cond_1a
    move/from16 v26, v1

    move/from16 v30, v2

    .line 701
    .end local v1    # "j$iv$iv":I
    .end local v2    # "$i$f$forEachKey":I
    .restart local v26    # "j$iv$iv":I
    .restart local v30    # "$i$f$forEachKey":I
    :goto_e
    const/16 v1, 0x8

    shr-long/2addr v12, v1

    .line 695
    add-int/lit8 v2, v26, 0x1

    move v1, v2

    move/from16 v2, v30

    .end local v26    # "j$iv$iv":I
    .local v2, "j$iv$iv":I
    goto :goto_c

    .end local v30    # "$i$f$forEachKey":I
    .restart local v1    # "j$iv$iv":I
    .local v2, "$i$f$forEachKey":I
    :cond_1b
    move/from16 v26, v1

    move/from16 v30, v2

    const/16 v1, 0x8

    .line 703
    .end local v1    # "j$iv$iv":I
    .end local v2    # "$i$f$forEachKey":I
    .restart local v30    # "$i$f$forEachKey":I
    if-ne v0, v1, :cond_1f

    goto :goto_f

    .line 692
    .end local v0    # "bitCount$iv$iv":I
    .end local v30    # "$i$f$forEachKey":I
    .restart local v2    # "$i$f$forEachKey":I
    :cond_1c
    move/from16 v30, v2

    const/16 v1, 0x8

    .line 690
    .end local v2    # "$i$f$forEachKey":I
    .end local v12    # "slot$iv$iv":J
    .restart local v30    # "$i$f$forEachKey":I
    :goto_f
    if-eq v11, v10, :cond_1e

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    move/from16 v2, v30

    goto :goto_b

    .end local v22    # "this_$iv":Landroidx/collection/ObjectFloatMap;
    .end local v30    # "$i$f$forEachKey":I
    .local v1, "this_$iv":Landroidx/collection/ObjectFloatMap;
    .restart local v2    # "$i$f$forEachKey":I
    :cond_1d
    move-object/from16 v22, v1

    move/from16 v30, v2

    .line 706
    .end local v1    # "this_$iv":Landroidx/collection/ObjectFloatMap;
    .end local v2    # "$i$f$forEachKey":I
    .end local v11    # "i$iv$iv":I
    .restart local v22    # "this_$iv":Landroidx/collection/ObjectFloatMap;
    .restart local v30    # "$i$f$forEachKey":I
    :cond_1e
    nop

    .line 707
    .end local v7    # "this_$iv$iv":Landroidx/collection/ObjectFloatMap;
    .end local v8    # "$i$f$forEachIndexed":I
    .end local v9    # "m$iv$iv":[J
    .end local v10    # "lastIndex$iv$iv":I
    :cond_1f
    nop

    .line 306
    .end local v5    # "k$iv":[Ljava/lang/Object;
    .end local v22    # "this_$iv":Landroidx/collection/ObjectFloatMap;
    .end local v30    # "$i$f$forEachKey":I
    invoke-virtual {v4}, Landroidx/collection/MutableObjectFloatMap;->clear()V

    .line 308
    .end local v4    # "oldValues":Landroidx/collection/MutableObjectFloatMap;
    .end local v6    # "newValues":Landroidx/collection/MutableObjectFloatMap;
    :goto_10
    return-void
.end method

.method private final findAncestorRulerDefiner(Landroidx/compose/ui/layout/Ruler;)Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    .locals 4
    .param p1, "ruler"    # Landroidx/compose/ui/layout/Ruler;

    .line 197
    move-object v0, p0

    .line 198
    .local v0, "p":Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    :goto_0
    nop

    .line 199
    iget-object v1, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValues:Landroidx/collection/MutableObjectFloatMap;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v1, Landroidx/collection/ObjectFloatMap;

    .local v1, "this_$iv":Landroidx/collection/ObjectFloatMap;
    const/4 v3, 0x0

    .line 601
    .local v3, "$i$f$contains":I
    invoke-virtual {v1, p1}, Landroidx/collection/ObjectFloatMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    .line 199
    .end local v1    # "this_$iv":Landroidx/collection/ObjectFloatMap;
    .end local v3    # "$i$f$contains":I
    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v2, v3

    :cond_0
    if-eqz v2, :cond_1

    .line 200
    return-object v0

    .line 202
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getParent()Landroidx/compose/ui/node/LookaheadCapablePlaceable;

    move-result-object v1

    if-nez v1, :cond_2

    return-object v0

    .line 203
    .local v1, "parent":Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    :cond_2
    move-object v0, v1

    .end local v1    # "parent":Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    goto :goto_0
.end method

.method private final invalidateChildrenOfDefiningRuler(Landroidx/compose/ui/layout/Ruler;)V
    .locals 2
    .param p1, "ruler"    # Landroidx/compose/ui/layout/Ruler;

    .line 215
    invoke-direct {p0, p1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->findAncestorRulerDefiner(Landroidx/compose/ui/layout/Ruler;)Landroidx/compose/ui/node/LookaheadCapablePlaceable;

    move-result-object v0

    .line 216
    .local v0, "definer":Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    iget-object v1, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerReaders:Landroidx/collection/MutableScatterMap;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/collection/MutableScatterSet;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 217
    .local v1, "readers":Landroidx/collection/MutableScatterSet;
    :goto_0
    if-eqz v1, :cond_1

    .line 218
    invoke-direct {p0, v1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->notifyRulerValueChange(Landroidx/collection/MutableScatterSet;)V

    .line 220
    :cond_1
    return-void
.end method

.method private final isLayoutNodeAncestor(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)Z
    .locals 1
    .param p1, "$this$isLayoutNodeAncestor"    # Landroidx/compose/ui/node/LayoutNode;
    .param p2, "ancestor"    # Landroidx/compose/ui/node/LayoutNode;

    .line 208
    if-ne p1, p2, :cond_0

    .line 209
    const/4 v0, 0x1

    return v0

    .line 211
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v0, p2}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isLayoutNodeAncestor(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final notifyRulerValueChange(Landroidx/collection/MutableScatterSet;)V
    .locals 22
    .param p1, "layoutNodes"    # Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/ui/node/WeakReference<",
            "Landroidx/compose/ui/node/LayoutNode;",
            ">;>;)V"
        }
    .end annotation

    .line 311
    move-object/from16 v0, p1

    check-cast v0, Landroidx/collection/ScatterSet;

    .local v0, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v1, 0x0

    .line 708
    .local v1, "$i$f$forEach":I
    nop

    .line 709
    iget-object v2, v0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 710
    .local v2, "elements$iv":[Ljava/lang/Object;
    move-object v3, v0

    .local v3, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v4, 0x0

    .line 711
    .local v4, "$i$f$forEachIndex":I
    nop

    .line 712
    iget-object v5, v3, Landroidx/collection/ScatterSet;->metadata:[J

    .line 713
    .local v5, "m$iv$iv":[J
    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    .line 715
    .local v6, "lastIndex$iv$iv":I
    const/4 v7, 0x0

    .local v7, "i$iv$iv":I
    if-gt v7, v6, :cond_6

    .line 716
    :goto_0
    aget-wide v8, v5, v7

    .line 717
    .local v8, "slot$iv$iv":J
    move-wide v10, v8

    .local v10, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v12, 0x0

    .line 718
    .local v12, "$i$f$maskEmptyOrDeleted":I
    not-long v13, v10

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v10

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v10, v13, v15

    .line 717
    .end local v10    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v12    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v10, v10, v15

    if-eqz v10, :cond_5

    .line 719
    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    .line 720
    .local v10, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v10, :cond_4

    .line 721
    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    .local v13, "value$iv$iv$iv":J
    const/4 v15, 0x0

    .line 722
    .local v15, "$i$f$isFull":I
    const-wide/16 v16, 0x80

    cmp-long v16, v13, v16

    move/from16 v17, v11

    const/4 v11, 0x0

    if-gez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_2

    :cond_0
    move/from16 v16, v11

    .line 721
    .end local v13    # "value$iv$iv$iv":J
    .end local v15    # "$i$f$isFull":I
    :goto_2
    if-eqz v16, :cond_3

    .line 723
    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    .line 724
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/4 v15, 0x0

    .line 710
    .local v15, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    aget-object v16, v2, v14

    check-cast v16, Landroidx/compose/ui/node/WeakReference;

    .local v16, "layoutNodeRef":Landroidx/compose/ui/node/WeakReference;
    const/16 v18, 0x0

    .line 312
    .local v18, "$i$a$-forEach-LookaheadCapablePlaceable$notifyRulerValueChange$1":I
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/WeakReference;->get()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroidx/compose/ui/node/LayoutNode;

    if-eqz v19, :cond_2

    move-object/from16 v20, v19

    .local v20, "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    const/16 v19, 0x0

    .line 313
    .local v19, "$i$a$-let-LookaheadCapablePlaceable$notifyRulerValueChange$1$1":I
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isLookingAhead()Z

    move-result v21

    if-eqz v21, :cond_1

    .line 314
    move-object/from16 v21, v0

    move-object/from16 v0, v20

    .end local v20    # "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    .local v0, "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    .local v21, "this_$iv":Landroidx/collection/ScatterSet;
    invoke-virtual {v0, v11}, Landroidx/compose/ui/node/LayoutNode;->requestLookaheadRelayout$ui_release(Z)V

    goto :goto_3

    .line 316
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v0, "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v20    # "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    :cond_1
    move-object/from16 v21, v0

    move-object/from16 v0, v20

    .end local v20    # "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    .local v0, "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    invoke-virtual {v0, v11}, Landroidx/compose/ui/node/LayoutNode;->requestRelayout$ui_release(Z)V

    .line 318
    :goto_3
    nop

    .end local v0    # "layoutNode":Landroidx/compose/ui/node/LayoutNode;
    .end local v19    # "$i$a$-let-LookaheadCapablePlaceable$notifyRulerValueChange$1$1":I
    goto :goto_4

    .line 312
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v0, "this_$iv":Landroidx/collection/ScatterSet;
    :cond_2
    move-object/from16 v21, v0

    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_4
    nop

    .line 319
    nop

    .line 710
    .end local v16    # "layoutNodeRef":Landroidx/compose/ui/node/WeakReference;
    .end local v18    # "$i$a$-forEach-LookaheadCapablePlaceable$notifyRulerValueChange$1":I
    nop

    .line 724
    .end local v14    # "index$iv":I
    .end local v15    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_5

    .line 721
    .end local v13    # "index$iv$iv":I
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_3
    move-object/from16 v21, v0

    .line 726
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_5
    shr-long v8, v8, v17

    .line 720
    add-int/lit8 v12, v12, 0x1

    move/from16 v11, v17

    move-object/from16 v0, v21

    goto :goto_1

    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_4
    move-object/from16 v21, v0

    move/from16 v17, v11

    .line 728
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v12    # "j$iv$iv":I
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    move/from16 v0, v17

    if-ne v10, v0, :cond_8

    goto :goto_6

    .line 717
    .end local v10    # "bitCount$iv$iv":I
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_5
    move-object/from16 v21, v0

    .line 715
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v8    # "slot$iv$iv":J
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_6
    if-eq v7, v6, :cond_7

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, v21

    goto/16 :goto_0

    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_6
    move-object/from16 v21, v0

    .line 731
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v7    # "i$iv$iv":I
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_7
    nop

    .line 732
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v4    # "$i$f$forEachIndex":I
    .end local v5    # "m$iv$iv":[J
    .end local v6    # "lastIndex$iv$iv":I
    :cond_8
    nop

    .line 320
    .end local v1    # "$i$f$forEach":I
    .end local v2    # "elements$iv":[Ljava/lang/Object;
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    return-void
.end method


# virtual methods
.method public abstract calculateAlignmentLine(Landroidx/compose/ui/layout/AlignmentLine;)I
.end method

.method public final captureRulers$ui_release(Landroidx/compose/ui/layout/MeasureResult;)V
    .locals 19
    .param p1, "result"    # Landroidx/compose/ui/layout/MeasureResult;

    .line 251
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v1, :cond_0

    .line 252
    new-instance v2, Landroidx/compose/ui/node/PlaceableResult;

    invoke-direct {v2, v1, v0}, Landroidx/compose/ui/node/PlaceableResult;-><init>(Landroidx/compose/ui/layout/MeasureResult;Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V

    invoke-direct {v0, v2}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->captureRulers(Landroidx/compose/ui/node/PlaceableResult;)V

    goto/16 :goto_4

    .line 254
    :cond_0
    iget-object v2, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerReaders:Landroidx/collection/MutableScatterMap;

    if-eqz v2, :cond_8

    check-cast v2, Landroidx/collection/ScatterMap;

    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v3, 0x0

    .line 610
    .local v3, "$i$f$forEachValue":I
    iget-object v4, v2, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 612
    .local v4, "v$iv":[Ljava/lang/Object;
    move-object v5, v2

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v6, 0x0

    .line 613
    .local v6, "$i$f$forEachIndexed":I
    iget-object v7, v5, Landroidx/collection/ScatterMap;->metadata:[J

    .line 614
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 616
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_5

    .line 617
    :goto_0
    aget-wide v10, v7, v9

    .line 618
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v14, 0x0

    .line 619
    .local v14, "$i$f$maskEmptyOrDeleted":I
    move-object v15, v2

    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v15, "this_$iv":Landroidx/collection/ScatterMap;
    not-long v1, v12

    const/16 v16, 0x7

    shl-long v1, v1, v16

    and-long/2addr v1, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v1, v1, v16

    .line 618
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v1, v1, v16

    if-eqz v1, :cond_4

    .line 620
    sub-int v1, v9, v8

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    const/16 v2, 0x8

    rsub-int/lit8 v1, v1, 0x8

    .line 621
    .local v1, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v1, :cond_3

    .line 622
    const-wide/16 v13, 0xff

    and-long/2addr v13, v10

    .local v13, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 623
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v13, v17

    if-gez v17, :cond_1

    const/16 v17, 0x1

    goto :goto_2

    :cond_1
    const/16 v17, 0x0

    .line 622
    .end local v13    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_2

    .line 624
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 625
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/16 v16, 0x0

    .line 612
    .local v16, "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    aget-object v17, v4, v14

    move/from16 v18, v2

    move-object/from16 v2, v17

    check-cast v2, Landroidx/collection/MutableScatterSet;

    .local v2, "it":Landroidx/collection/MutableScatterSet;
    const/16 v17, 0x0

    .line 254
    .local v17, "$i$a$-forEachValue-LookaheadCapablePlaceable$captureRulers$1":I
    invoke-direct {v0, v2}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->notifyRulerValueChange(Landroidx/collection/MutableScatterSet;)V

    .line 612
    .end local v2    # "it":Landroidx/collection/MutableScatterSet;
    .end local v17    # "$i$a$-forEachValue-LookaheadCapablePlaceable$captureRulers$1":I
    nop

    .line 625
    .end local v14    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    goto :goto_3

    .line 622
    .end local v13    # "index$iv$iv":I
    :cond_2
    move/from16 v18, v2

    .line 627
    :goto_3
    shr-long v10, v10, v18

    .line 621
    add-int/lit8 v12, v12, 0x1

    move/from16 v2, v18

    goto :goto_1

    :cond_3
    move/from16 v18, v2

    .line 629
    .end local v12    # "j$iv$iv":I
    if-ne v1, v2, :cond_7

    .line 616
    .end local v1    # "bitCount$iv$iv":I
    .end local v10    # "slot$iv$iv":J
    :cond_4
    if-eq v9, v8, :cond_6

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object v2, v15

    goto :goto_0

    .end local v15    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    :cond_5
    move-object v15, v2

    .line 632
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v9    # "i$iv$iv":I
    .restart local v15    # "this_$iv":Landroidx/collection/ScatterMap;
    :cond_6
    nop

    .line 633
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_7
    nop

    .line 255
    .end local v3    # "$i$f$forEachValue":I
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v15    # "this_$iv":Landroidx/collection/ScatterMap;
    :cond_8
    iget-object v1, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerReaders:Landroidx/collection/MutableScatterMap;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 256
    :cond_9
    iget-object v1, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValues:Landroidx/collection/MutableObjectFloatMap;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroidx/collection/MutableObjectFloatMap;->clear()V

    .line 258
    :cond_a
    :goto_4
    return-void
.end method

.method public final findRulerValue(Landroidx/compose/ui/layout/Ruler;F)F
    .locals 4
    .param p1, "ruler"    # Landroidx/compose/ui/layout/Ruler;
    .param p2, "defaultValue"    # F

    .line 165
    iget-boolean v0, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacingForAlignment:Z

    if-eqz v0, :cond_0

    .line 166
    return p2

    .line 168
    :cond_0
    move-object v0, p0

    .line 169
    .local v0, "p":Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    :goto_0
    nop

    .line 170
    iget-object v1, v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValues:Landroidx/collection/MutableObjectFloatMap;

    const/high16 v2, 0x7fc00000    # Float.NaN

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1, v2}, Landroidx/collection/MutableObjectFloatMap;->getOrDefault(Ljava/lang/Object;F)F

    move-result v2

    .line 171
    .local v2, "rulerValue":F
    :cond_1
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_2

    .line 172
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->addRulerReader(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/Ruler;)V

    .line 173
    invoke-virtual {v0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v3

    invoke-virtual {p1, v2, v1, v3}, Landroidx/compose/ui/layout/Ruler;->calculateCoordinate$ui_release(FLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)F

    move-result v1

    return v1

    .line 175
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getParent()Landroidx/compose/ui/node/LookaheadCapablePlaceable;

    move-result-object v1

    .line 176
    .local v1, "parent":Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    if-nez v1, :cond_3

    .line 177
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v3

    invoke-direct {v0, v3, p1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->addRulerReader(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/Ruler;)V

    .line 178
    return p2

    .line 180
    :cond_3
    move-object v0, v1

    .end local v1    # "parent":Landroidx/compose/ui/node/LookaheadCapablePlaceable;
    .end local v2    # "rulerValue":F
    goto :goto_0
.end method

.method public final get(Landroidx/compose/ui/layout/AlignmentLine;)I
    .locals 3
    .param p1, "alignmentLine"    # Landroidx/compose/ui/layout/AlignmentLine;

    .line 110
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getHasMeasureResult()Z

    move-result v0

    const/high16 v1, -0x80000000

    if-nez v0, :cond_0

    return v1

    .line 111
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->calculateAlignmentLine(Landroidx/compose/ui/layout/AlignmentLine;)I

    move-result v0

    .line 112
    .local v0, "measuredPosition":I
    if-ne v0, v1, :cond_1

    return v1

    .line 113
    :cond_1
    nop

    .line 114
    instance-of v1, p1, Landroidx/compose/ui/layout/VerticalAlignmentLine;

    if-eqz v1, :cond_2

    .line 115
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getApparentToRealOffset-nOcc-ac()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v1

    goto :goto_0

    .line 117
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getApparentToRealOffset-nOcc-ac()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    .line 113
    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public abstract getAlignmentLinesOwner()Landroidx/compose/ui/node/AlignmentLinesOwner;
.end method

.method public abstract getChild()Landroidx/compose/ui/node/LookaheadCapablePlaceable;
.end method

.method public abstract getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;
.end method

.method public abstract getHasMeasureResult()Z
.end method

.method public abstract getLayoutNode()Landroidx/compose/ui/node/LayoutNode;
.end method

.method public abstract getMeasureResult$ui_release()Landroidx/compose/ui/layout/MeasureResult;
.end method

.method public abstract getParent()Landroidx/compose/ui/node/LookaheadCapablePlaceable;
.end method

.method public final getPlacementScope()Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .locals 1

    .line 143
    iget-object v0, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->placementScope:Landroidx/compose/ui/layout/Placeable$PlacementScope;

    return-object v0
.end method

.method public abstract getPosition-nOcc-ac()J
.end method

.method public final getRulerScope()Landroidx/compose/ui/layout/RulerScope;
    .locals 1

    .line 84
    iget-object v0, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->_rulerScope:Landroidx/compose/ui/layout/RulerScope;

    if-nez v0, :cond_0

    .line 85
    new-instance v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable$rulerScope$1;

    invoke-direct {v0, p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable$rulerScope$1;-><init>(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V

    check-cast v0, Landroidx/compose/ui/layout/RulerScope;

    .line 84
    :cond_0
    return-object v0
.end method

.method protected final invalidateAlignmentLinesFromPositionChange(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 2
    .param p1, "$this$invalidateAlignmentLinesFromPositionChange"    # Landroidx/compose/ui/node/NodeCoordinator;

    .line 146
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getWrapped$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 147
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getAlignmentLinesOwner()Landroidx/compose/ui/node/AlignmentLinesOwner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/AlignmentLinesOwner;->getAlignmentLines()Landroidx/compose/ui/node/AlignmentLines;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/AlignmentLines;->onAlignmentsChanged()V

    goto :goto_1

    .line 149
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->getAlignmentLinesOwner()Landroidx/compose/ui/node/AlignmentLinesOwner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/AlignmentLinesOwner;->getParentAlignmentLinesOwner()Landroidx/compose/ui/node/AlignmentLinesOwner;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroidx/compose/ui/node/AlignmentLinesOwner;->getAlignmentLines()Landroidx/compose/ui/node/AlignmentLines;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/node/AlignmentLines;->onAlignmentsChanged()V

    .line 151
    :cond_2
    :goto_1
    return-void
.end method

.method public isLookingAhead()Z
    .locals 1

    .line 154
    const/4 v0, 0x0

    return v0
.end method

.method public isPlacedUnderMotionFrameOfReference()Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacedUnderMotionFrameOfReference:Z

    return v0
.end method

.method public final isPlacingForAlignment$ui_release()Z
    .locals 1

    .line 140
    iget-boolean v0, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacingForAlignment:Z

    return v0
.end method

.method public final isShallowPlacing$ui_release()Z
    .locals 1

    .line 127
    iget-boolean v0, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isShallowPlacing:Z

    return v0
.end method

.method public layout(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 8
    .param p1, "width"    # I
    .param p2, "height"    # I
    .param p3, "alignmentLines"    # Ljava/util/Map;
    .param p4, "rulers"    # Lkotlin/jvm/functions/Function1;
    .param p5, "placementBlock"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/AlignmentLine;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/RulerScope;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 230
    const/4 v0, 0x0

    .line 602
    .local v0, "$i$f$checkMeasuredSize":I
    const/high16 v3, -0x1000000

    and-int v4, p1, v3

    if-nez v4, :cond_0

    and-int/2addr v3, p2

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .local v3, "value$iv$iv":Z
    :goto_0
    const/4 v4, 0x0

    .line 603
    .local v4, "$i$f$checkPrecondition":I
    nop

    .line 604
    if-nez v3, :cond_1

    .line 605
    const/4 v5, 0x0

    .line 606
    .local v5, "$i$a$-checkPrecondition-LookaheadDelegateKt$checkMeasuredSize$1$iv":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Size("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " x "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 607
    nop

    .line 605
    .end local v5    # "$i$a$-checkPrecondition-LookaheadDelegateKt$checkMeasuredSize$1$iv":I
    invoke-static {v6}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 608
    :cond_1
    nop

    .line 609
    .end local v3    # "value$iv$iv":Z
    .end local v4    # "$i$f$checkPrecondition":I
    nop

    .line 231
    .end local v0    # "$i$f$checkMeasuredSize":I
    new-instance v0, Landroidx/compose/ui/node/LookaheadCapablePlaceable$layout$1;

    move-object v6, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/node/LookaheadCapablePlaceable$layout$1;-><init>(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V

    check-cast v0, Landroidx/compose/ui/layout/MeasureResult;

    return-object v0
.end method

.method public final provideRelativeRulerValue(Landroidx/compose/ui/layout/Ruler;F)V
    .locals 4
    .param p1, "ruler"    # Landroidx/compose/ui/layout/Ruler;
    .param p2, "value"    # F

    .line 328
    iget-object v0, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValues:Landroidx/collection/MutableObjectFloatMap;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/collection/MutableObjectFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectFloatMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    .line 658
    .local v1, "it":Landroidx/collection/MutableObjectFloatMap;
    const/4 v2, 0x0

    .line 328
    .local v2, "$i$a$-also-LookaheadCapablePlaceable$provideRelativeRulerValue$rulerValues$1":I
    iput-object v1, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValues:Landroidx/collection/MutableObjectFloatMap;

    .line 329
    .end local v1    # "it":Landroidx/collection/MutableObjectFloatMap;
    .end local v2    # "$i$a$-also-LookaheadCapablePlaceable$provideRelativeRulerValue$rulerValues$1":I
    .local v0, "rulerValues":Landroidx/collection/MutableObjectFloatMap;
    :cond_0
    nop

    .line 330
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    if-ne v1, v2, :cond_1

    .line 331
    move v1, p2

    goto :goto_0

    .line 333
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getWidth()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, p2

    .line 329
    :goto_0
    invoke-virtual {v0, p1, v1}, Landroidx/collection/MutableObjectFloatMap;->set(Ljava/lang/Object;F)V

    .line 335
    return-void
.end method

.method public final provideRulerValue(Landroidx/compose/ui/layout/Ruler;F)V
    .locals 4
    .param p1, "ruler"    # Landroidx/compose/ui/layout/Ruler;
    .param p2, "value"    # F

    .line 323
    iget-object v0, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValues:Landroidx/collection/MutableObjectFloatMap;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/collection/MutableObjectFloatMap;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/collection/MutableObjectFloatMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    .line 658
    .local v1, "it":Landroidx/collection/MutableObjectFloatMap;
    const/4 v2, 0x0

    .line 323
    .local v2, "$i$a$-also-LookaheadCapablePlaceable$provideRulerValue$rulerValues$1":I
    iput-object v1, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->rulerValues:Landroidx/collection/MutableObjectFloatMap;

    .line 324
    .end local v1    # "it":Landroidx/collection/MutableObjectFloatMap;
    .end local v2    # "$i$a$-also-LookaheadCapablePlaceable$provideRulerValue$rulerValues$1":I
    .local v0, "rulerValues":Landroidx/collection/MutableObjectFloatMap;
    :cond_0
    invoke-virtual {v0, p1, p2}, Landroidx/collection/MutableObjectFloatMap;->set(Ljava/lang/Object;F)V

    .line 325
    return-void
.end method

.method public abstract replace$ui_release()V
.end method

.method public setPlacedUnderMotionFrameOfReference(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 62
    iput-boolean p1, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacedUnderMotionFrameOfReference:Z

    return-void
.end method

.method public final setPlacingForAlignment$ui_release(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 140
    iput-boolean p1, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isPlacingForAlignment:Z

    return-void
.end method

.method public final setShallowPlacing$ui_release(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 127
    iput-boolean p1, p0, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->isShallowPlacing:Z

    return-void
.end method

.method public updatePlacedUnderMotionFrameOfReference(Z)V
    .locals 4
    .param p1, "newMFR"    # Z

    .line 65
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getParent()Landroidx/compose/ui/node/LookaheadCapablePlaceable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 66
    .local v0, "parentNode":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->getLayoutNode()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 67
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->setPlacedUnderMotionFrameOfReference(Z)V

    goto :goto_2

    .line 71
    :cond_1
    nop

    .line 72
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    sget-object v3, Landroidx/compose/ui/node/LayoutNode$LayoutState;->LayingOut:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    if-eq v2, v3, :cond_4

    .line 73
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object v1

    :cond_3
    sget-object v2, Landroidx/compose/ui/node/LayoutNode$LayoutState;->LookaheadLayingOut:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    if-ne v1, v2, :cond_5

    .line 75
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/LookaheadCapablePlaceable;->setPlacedUnderMotionFrameOfReference(Z)V

    .line 80
    :cond_5
    :goto_2
    return-void
.end method
