.class public final Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
.super Ljava/lang/Object;
.source "SubcomposeLayout.kt"

# interfaces
.implements Landroidx/compose/runtime/ComposeNodeLifecycleCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;,
        Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;,
        Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1037:1\n898#1:1066\n898#1:1078\n898#1:1188\n898#1:1193\n1101#2:1038\n1083#2,2:1039\n56#3,5:1041\n65#3,5:1047\n102#3,5:1053\n102#3,5:1120\n102#3,5:1125\n102#3,5:1130\n102#3,5:1202\n683#4:1046\n683#4:1058\n842#4:1136\n844#4,4:1150\n848#4:1160\n683#4:1161\n1#5:1052\n1#5:1059\n1#5:1135\n1#5:1162\n1#5:1187\n602#6,6:1060\n609#6:1071\n602#6,6:1072\n609#6:1083\n602#6,8:1084\n1149#7,4:1067\n1149#7,4:1079\n1149#7,2:1092\n1151#7,2:1118\n1149#7,4:1189\n1149#7,4:1194\n1149#7,4:1198\n372#8,3:1094\n329#8,6:1097\n339#8,3:1104\n342#8,9:1108\n375#8:1117\n329#8,6:1137\n339#8,3:1144\n342#8,2:1148\n345#8,6:1154\n372#8,3:1163\n329#8,6:1166\n339#8,3:1173\n342#8,9:1177\n375#8:1186\n1399#9:1103\n1270#9:1107\n1399#9:1143\n1270#9:1147\n1399#9:1172\n1270#9:1176\n34#10,6:1207\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n511#1:1066\n585#1:1078\n891#1:1188\n894#1:1193\n427#1:1038\n427#1:1039,2\n456#1:1041,5\n469#1:1047,5\n480#1:1053,5\n653#1:1120,5\n659#1:1125,5\n663#1:1130,5\n985#1:1202,5\n466#1:1046\n500#1:1058\n767#1:1136\n767#1:1150,4\n767#1:1160\n811#1:1161\n466#1:1052\n500#1:1059\n811#1:1162\n510#1:1060,6\n510#1:1071\n572#1:1072,6\n572#1:1083\n613#1:1084,8\n511#1:1067,4\n585#1:1079,4\n637#1:1092,2\n637#1:1118,2\n891#1:1189,4\n894#1:1194,4\n898#1:1198,4\n638#1:1094,3\n638#1:1097,6\n638#1:1104,3\n638#1:1108,9\n638#1:1117\n767#1:1137,6\n767#1:1144,3\n767#1:1148,2\n767#1:1154,6\n879#1:1163,3\n879#1:1166,6\n879#1:1173,3\n879#1:1177,9\n879#1:1186\n638#1:1103\n638#1:1107\n767#1:1143\n767#1:1147\n879#1:1172\n879#1:1176\n1007#1:1207,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001:\u0003bcdB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010)\u001a\u0008\u0012\u0004\u0012\u00020+0*2\u0008\u0010,\u001a\u0004\u0018\u00010\u000b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020/0.\u00a2\u0006\u0002\u00080H\u0002\u00a2\u0006\u0002\u00101J%\u00102\u001a\u0002032\u001d\u00104\u001a\u0019\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020805\u00a2\u0006\u0002\u00089J!\u0010:\u001a\u0002082\u0006\u0010;\u001a\u0002082\u000e\u0008\u0004\u0010<\u001a\u0008\u0012\u0004\u0012\u00020/0.H\u0082\u0008J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0018H\u0002J\u0008\u0010?\u001a\u00020/H\u0002J\u000e\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020\u0018J\u0008\u0010B\u001a\u00020/H\u0002J\u0006\u0010C\u001a\u00020/J \u0010D\u001a\u0004\u0018\u00010\u000b2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u00030*2\u0006\u0010>\u001a\u00020\u0018H\u0002J\u0017\u0010F\u001a\u00020/2\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u00020/0.H\u0082\u0008J\u0006\u0010G\u001a\u00020/J\u0010\u0010H\u001a\u00020/2\u0006\u0010I\u001a\u00020JH\u0002J\"\u0010K\u001a\u00020/2\u0006\u0010L\u001a\u00020\u00182\u0006\u0010M\u001a\u00020\u00182\u0008\u0008\u0002\u0010N\u001a\u00020\u0018H\u0002J\u0008\u0010O\u001a\u00020/H\u0016J\u0008\u0010P\u001a\u00020/H\u0016J\u0008\u0010Q\u001a\u00020/H\u0016J(\u0010R\u001a\u00020\u00102\u0008\u0010,\u001a\u0004\u0018\u00010\u000b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020/0.\u00a2\u0006\u0002\u00080\u00a2\u0006\u0002\u0010SJ\u0018\u0010T\u001a\u00020/2\u0006\u0010U\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u001bH\u0002J2\u0010T\u001a\u00020/2\u0006\u0010U\u001a\u00020\u00032\u0008\u0010,\u001a\u0004\u0018\u00010\u000b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020/0.\u00a2\u0006\u0002\u00080H\u0002\u00a2\u0006\u0002\u0010WJ.\u0010T\u001a\u0008\u0012\u0004\u0012\u00020+0*2\u0008\u0010,\u001a\u0004\u0018\u00010\u000b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020/0.\u00a2\u0006\u0002\u00080\u00a2\u0006\u0002\u00101JB\u0010X\u001a\u00020Y2\u0008\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020J2\u0006\u0010]\u001a\u00020\u00122\u0011\u0010^\u001a\r\u0012\u0004\u0012\u00020/0.\u00a2\u0006\u0002\u00080H\u0002\u00a2\u0006\u0002\u0010_J\u0014\u0010`\u001a\u0004\u0018\u00010\u00032\u0008\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002J\u000c\u0010a\u001a\u00020/*\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000c\u001a\u00060\rR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00060\"R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(\u00a8\u0006e"
    }
    d2 = {
        "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;",
        "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;",
        "root",
        "Landroidx/compose/ui/node/LayoutNode;",
        "slotReusePolicy",
        "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;",
        "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V",
        "NoIntrinsicsMessage",
        "",
        "approachComposedSlotIds",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "",
        "approachMeasureScope",
        "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;",
        "approachPrecomposeSlotHandleMap",
        "Landroidx/collection/MutableScatterMap;",
        "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;",
        "compositionContext",
        "Landroidx/compose/runtime/CompositionContext;",
        "getCompositionContext",
        "()Landroidx/compose/runtime/CompositionContext;",
        "setCompositionContext",
        "(Landroidx/compose/runtime/CompositionContext;)V",
        "currentApproachIndex",
        "",
        "currentIndex",
        "nodeToNodeState",
        "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;",
        "precomposeMap",
        "precomposedCount",
        "reusableCount",
        "reusableSlotIdsSet",
        "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;",
        "scope",
        "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;",
        "slotIdToNode",
        "value",
        "getSlotReusePolicy",
        "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;",
        "setSlotReusePolicy",
        "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V",
        "approachSubcompose",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "slotId",
        "content",
        "Lkotlin/Function0;",
        "",
        "Landroidx/compose/runtime/Composable;",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;",
        "createMeasurePolicy",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "block",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Lkotlin/ExtensionFunctionType;",
        "createMeasureResult",
        "result",
        "placeChildrenBlock",
        "createNodeAt",
        "index",
        "disposeCurrentNodes",
        "disposeOrReuseStartingFromIndex",
        "startIndex",
        "disposeUnusedSlotsInApproach",
        "forceRecomposeChildren",
        "getSlotIdAtIndex",
        "foldedChildren",
        "ignoreRemeasureRequests",
        "makeSureStateIsConsistent",
        "markActiveNodesAsReused",
        "deactivate",
        "",
        "move",
        "from",
        "to",
        "count",
        "onDeactivate",
        "onRelease",
        "onReuse",
        "precompose",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;",
        "subcompose",
        "node",
        "nodeState",
        "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V",
        "subcomposeInto",
        "Landroidx/compose/runtime/ReusableComposition;",
        "existing",
        "container",
        "reuseContent",
        "parent",
        "composable",
        "(Landroidx/compose/runtime/ReusableComposition;Landroidx/compose/ui/node/LayoutNode;ZLandroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/ReusableComposition;",
        "takeNodeFromReusables",
        "resetLayoutState",
        "ApproachMeasureScopeImpl",
        "NodeState",
        "Scope",
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
.field private final NoIntrinsicsMessage:Ljava/lang/String;

.field private final approachComposedSlotIds:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final approachMeasureScope:Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;

.field private final approachPrecomposeSlotHandleMap:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;",
            ">;"
        }
    .end annotation
.end field

.field private compositionContext:Landroidx/compose/runtime/CompositionContext;

.field private currentApproachIndex:I

.field private currentIndex:I

.field private final nodeToNodeState:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Landroidx/compose/ui/node/LayoutNode;",
            "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;",
            ">;"
        }
    .end annotation
.end field

.field private final precomposeMap:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Landroidx/compose/ui/node/LayoutNode;",
            ">;"
        }
    .end annotation
.end field

.field private precomposedCount:I

.field private reusableCount:I

.field private final reusableSlotIdsSet:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;

.field private final root:Landroidx/compose/ui/node/LayoutNode;

.field private final scope:Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;

.field private final slotIdToNode:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Landroidx/compose/ui/node/LayoutNode;",
            ">;"
        }
    .end annotation
.end field

.field private slotReusePolicy:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V
    .locals 6
    .param p1, "root"    # Landroidx/compose/ui/node/LayoutNode;
    .param p2, "slotReusePolicy"    # Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;

    .line 394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 395
    iput-object p1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    .line 400
    iput-object p2, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotReusePolicy:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;

    .line 412
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    .line 415
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotIdToNode:Landroidx/collection/MutableScatterMap;

    .line 416
    new-instance v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;

    invoke-direct {v0, p0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;-><init>(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V

    iput-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->scope:Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;

    .line 417
    new-instance v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;

    invoke-direct {v0, p0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;-><init>(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V

    iput-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachMeasureScope:Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;

    .line 419
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    .line 420
    new-instance v0, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;-><init>(Landroidx/collection/MutableOrderedScatterSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableSlotIdsSet:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;

    .line 423
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachPrecomposeSlotHandleMap:Landroidx/collection/MutableScatterMap;

    .line 427
    const/4 v0, 0x0

    .line 1038
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 1039
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv":I
    const/4 v2, 0x0

    .line 1040
    .local v2, "$i$f$MutableVector":I
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1038
    .end local v1    # "capacity$iv$iv":I
    .end local v2    # "$i$f$MutableVector":I
    nop

    .line 427
    .end local v0    # "$i$f$mutableVectorOf":I
    iput-object v3, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachComposedSlotIds:Landroidx/compose/runtime/collection/MutableVector;

    .line 790
    const-string v0, "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement."

    iput-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->NoIntrinsicsMessage:Ljava/lang/String;

    .line 394
    return-void
.end method

.method public static final synthetic access$approachSubcompose(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .param p1, "slotId"    # Ljava/lang/Object;
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;

    .line 394
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachSubcompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$disposeUnusedSlotsInApproach(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    invoke-direct {p0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->disposeUnusedSlotsInApproach()V

    return-void
.end method

.method public static final synthetic access$getApproachMeasureScope$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachMeasureScope:Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;

    return-object v0
.end method

.method public static final synthetic access$getCurrentApproachIndex$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    iget v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentApproachIndex:I

    return v0
.end method

.method public static final synthetic access$getCurrentIndex$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    iget v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentIndex:I

    return v0
.end method

.method public static final synthetic access$getPrecomposeMap$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)Landroidx/collection/MutableScatterMap;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method

.method public static final synthetic access$getPrecomposedCount$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    iget v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    return v0
.end method

.method public static final synthetic access$getReusableCount$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    iget v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    return v0
.end method

.method public static final synthetic access$getRoot$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)Landroidx/compose/ui/node/LayoutNode;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    return-object v0
.end method

.method public static final synthetic access$getScope$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->scope:Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;

    return-object v0
.end method

.method public static final synthetic access$getSlotIdToNode$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)Landroidx/collection/MutableScatterMap;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;

    .line 394
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotIdToNode:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method

.method public static final synthetic access$move(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;III)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .param p1, "from"    # I
    .param p2, "to"    # I
    .param p3, "count"    # I

    .line 394
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->move(III)V

    return-void
.end method

.method public static final synthetic access$setCurrentApproachIndex$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;I)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .param p1, "<set-?>"    # I

    .line 394
    iput p1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentApproachIndex:I

    return-void
.end method

.method public static final synthetic access$setCurrentIndex$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;I)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .param p1, "<set-?>"    # I

    .line 394
    iput p1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentIndex:I

    return-void
.end method

.method public static final synthetic access$setPrecomposedCount$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;I)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .param p1, "<set-?>"    # I

    .line 394
    iput p1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    return-void
.end method

.method public static final synthetic access$setReusableCount$p(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;I)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .param p1, "<set-?>"    # I

    .line 394
    iput p1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    return-void
.end method

.method private final approachSubcompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;
    .locals 12
    .param p1, "slotId"    # Ljava/lang/Object;
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;"
        }
    .end annotation

    .line 985
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachComposedSlotIds:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentApproachIndex:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 1202
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 1203
    if-nez v0, :cond_1

    .line 1204
    const/4 v3, 0x0

    .line 986
    .local v3, "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$approachSubcompose$1":I
    nop

    .line 987
    nop

    .line 1204
    .end local v3    # "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$approachSubcompose$1":I
    const-string v3, "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."

    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 1206
    :cond_1
    nop

    .line 989
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachComposedSlotIds:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentApproachIndex:I

    .line 992
    iget-object v3, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachComposedSlotIds:Landroidx/compose/runtime/collection/MutableVector;

    .line 989
    if-ne v0, v1, :cond_2

    .line 990
    invoke-virtual {v3, p1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 992
    :cond_2
    iget v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentApproachIndex:I

    invoke-virtual {v3, v0, p1}, Landroidx/compose/runtime/collection/MutableVector;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 994
    :goto_1
    iget v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentApproachIndex:I

    add-int/2addr v0, v2

    iput v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentApproachIndex:I

    .line 995
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 997
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;

    move-result-object v0

    .line 1187
    .local v0, "it":Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;
    const/4 v1, 0x0

    .line 997
    .local v1, "$i$a$-also-LayoutNodeSubcompositionsState$approachSubcompose$2":I
    iget-object v3, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachPrecomposeSlotHandleMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v3, p1, v0}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 998
    .end local v0    # "it":Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;
    .end local v1    # "$i$a$-also-LayoutNodeSubcompositionsState$approachSubcompose$2":I
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/node/LayoutNode$LayoutState;->LayingOut:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    .line 1001
    iget-object v3, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    .line 998
    if-ne v0, v1, :cond_3

    .line 999
    invoke-virtual {v3, v2}, Landroidx/compose/ui/node/LayoutNode;->requestLookaheadRelayout$ui_release(Z)V

    goto :goto_2

    .line 1001
    :cond_3
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/ui/node/LayoutNode;->requestLookaheadRemeasure$ui_release$default(Landroidx/compose/ui/node/LayoutNode;ZZZILjava/lang/Object;)V

    .line 1005
    :cond_4
    :goto_2
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    if-eqz v0, :cond_6

    .local v0, "$this$approachSubcompose_u24lambda_u2427":Landroidx/compose/ui/node/LayoutNode;
    const/4 v1, 0x0

    .line 1006
    .local v1, "$i$a$-run-LayoutNodeSubcompositionsState$approachSubcompose$3":I
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getMeasurePassDelegate$ui_release()Landroidx/compose/ui/node/MeasurePassDelegate;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/node/MeasurePassDelegate;->getChildDelegates$ui_release()Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    .local v3, "it":Ljava/util/List;
    const/4 v4, 0x0

    .line 1007
    .local v4, "$i$a$-also-LayoutNodeSubcompositionsState$approachSubcompose$3$1":I
    move-object v5, v3

    .local v5, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1207
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1208
    const/4 v7, 0x0

    .local v7, "index$iv":I
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_3
    if-ge v7, v8, :cond_5

    .line 1209
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1210
    .local v9, "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Landroidx/compose/ui/node/MeasurePassDelegate;

    .local v10, "delegate":Landroidx/compose/ui/node/MeasurePassDelegate;
    const/4 v11, 0x0

    .line 1007
    .local v11, "$i$a$-fastForEach-LayoutNodeSubcompositionsState$approachSubcompose$3$1$1":I
    invoke-virtual {v10}, Landroidx/compose/ui/node/MeasurePassDelegate;->markDetachedFromParentLookaheadPass$ui_release()V

    .line 1210
    .end local v10    # "delegate":Landroidx/compose/ui/node/MeasurePassDelegate;
    .end local v11    # "$i$a$-fastForEach-LayoutNodeSubcompositionsState$approachSubcompose$3$1$1":I
    nop

    .line 1208
    .end local v9    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 1212
    .end local v7    # "index$iv":I
    :cond_5
    nop

    .line 1008
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    nop

    .line 1006
    .end local v3    # "it":Ljava/util/List;
    .end local v4    # "$i$a$-also-LayoutNodeSubcompositionsState$approachSubcompose$3$1":I
    nop

    .line 1008
    nop

    .line 1005
    .end local v0    # "$this$approachSubcompose_u24lambda_u2427":Landroidx/compose/ui/node/LayoutNode;
    .end local v1    # "$i$a$-run-LayoutNodeSubcompositionsState$approachSubcompose$3":I
    if-nez v2, :cond_7

    .line 1009
    :cond_6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 1005
    :cond_7
    return-object v2
.end method

.method private final createMeasureResult(Landroidx/compose/ui/layout/MeasureResult;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 2
    .param p1, "result"    # Landroidx/compose/ui/layout/MeasureResult;
    .param p2, "placeChildrenBlock"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureResult;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 783
    .local v0, "$i$f$createMeasureResult":I
    new-instance v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1;

    invoke-direct {v1, p1, p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasureResult$1;-><init>(Landroidx/compose/ui/layout/MeasureResult;Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Landroidx/compose/ui/layout/MeasureResult;

    .line 787
    return-object v1
.end method

.method private final createNodeAt(I)Landroidx/compose/ui/node/LayoutNode;
    .locals 10
    .param p1, "index"    # I

    .line 888
    new-instance v0, Landroidx/compose/ui/node/LayoutNode;

    .line 889
    nop

    .line 888
    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/compose/ui/node/LayoutNode;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 891
    move-object v1, v0

    .line 1187
    .local v1, "node":Landroidx/compose/ui/node/LayoutNode;
    const/4 v2, 0x0

    .line 891
    .local v2, "$i$a$-also-LayoutNodeSubcompositionsState$createNodeAt$1":I
    move-object v5, p0

    .local v5, "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    const/4 v6, 0x0

    .line 1188
    .local v6, "$i$f$ignoreRemeasureRequests":I
    iget-object v7, v5, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    .local v7, "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    const/4 v8, 0x0

    .line 1189
    .local v8, "$i$f$ignoreRemeasureRequests$ui_release":I
    invoke-static {v7, v3}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1190
    const/4 v3, 0x0

    .line 891
    .local v3, "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$createNodeAt$1$1":I
    iget-object v9, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v9, p1, v1}, Landroidx/compose/ui/node/LayoutNode;->insertAt$ui_release(ILandroidx/compose/ui/node/LayoutNode;)V

    .line 1190
    .end local v3    # "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$createNodeAt$1$1":I
    nop

    .line 1191
    invoke-static {v7, v4}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1192
    nop

    .line 1188
    .end local v7    # "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v8    # "$i$f$ignoreRemeasureRequests$ui_release":I
    nop

    .line 891
    .end local v5    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .end local v6    # "$i$f$ignoreRemeasureRequests":I
    nop

    .end local v1    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local v2    # "$i$a$-also-LayoutNodeSubcompositionsState$createNodeAt$1":I
    return-object v0
.end method

.method private final disposeCurrentNodes()V
    .locals 24

    .line 637
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    .local v1, "this_$iv":Landroidx/compose/ui/node/LayoutNode;
    const/4 v2, 0x0

    .line 1092
    .local v2, "$i$f$ignoreRemeasureRequests$ui_release":I
    const/4 v3, 0x1

    invoke-static {v1, v3}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1093
    const/4 v4, 0x0

    .line 638
    .local v4, "$i$a$-ignoreRemeasureRequests$ui_release-LayoutNodeSubcompositionsState$disposeCurrentNodes$1":I
    iget-object v5, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    check-cast v5, Landroidx/collection/ScatterMap;

    .local v5, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v6, 0x0

    .line 1094
    .local v6, "$i$f$forEachValue":I
    iget-object v7, v5, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 1096
    .local v7, "v$iv":[Ljava/lang/Object;
    move-object v8, v5

    .local v8, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v9, 0x0

    .line 1097
    .local v9, "$i$f$forEachIndexed":I
    iget-object v10, v8, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1098
    .local v10, "m$iv$iv":[J
    array-length v11, v10

    add-int/lit8 v11, v11, -0x2

    .line 1100
    .local v11, "lastIndex$iv$iv":I
    const/4 v12, 0x0

    .local v12, "i$iv$iv":I
    if-gt v12, v11, :cond_5

    .line 1101
    :goto_0
    aget-wide v14, v10, v12

    .line 1102
    .local v14, "slot$iv$iv":J
    move-wide/from16 v16, v14

    .local v16, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v18, 0x0

    .line 1103
    .local v18, "$i$f$maskEmptyOrDeleted":I
    move/from16 v19, v4

    move-wide/from16 v20, v14

    move-wide/from16 v3, v16

    .end local v4    # "$i$a$-ignoreRemeasureRequests$ui_release-LayoutNodeSubcompositionsState$disposeCurrentNodes$1":I
    .end local v14    # "slot$iv$iv":J
    .end local v16    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v3, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v19, "$i$a$-ignoreRemeasureRequests$ui_release-LayoutNodeSubcompositionsState$disposeCurrentNodes$1":I
    .local v20, "slot$iv$iv":J
    not-long v13, v3

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v3

    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v3, v13, v22

    .line 1102
    .end local v3    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v18    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v3, v3, v22

    if-eqz v3, :cond_4

    .line 1104
    sub-int v3, v12, v11

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v4, 0x8

    rsub-int/lit8 v3, v3, 0x8

    .line 1105
    .local v3, "bitCount$iv$iv":I
    const/4 v13, 0x0

    move-wide/from16 v14, v20

    .end local v20    # "slot$iv$iv":J
    .local v13, "j$iv$iv":I
    .restart local v14    # "slot$iv$iv":J
    :goto_1
    if-ge v13, v3, :cond_3

    .line 1106
    const-wide/16 v17, 0xff

    and-long v17, v14, v17

    .local v17, "value$iv$iv$iv":J
    const/16 v20, 0x0

    .line 1107
    .local v20, "$i$f$isFull":I
    const-wide/16 v21, 0x80

    cmp-long v21, v17, v21

    if-gez v21, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 1106
    .end local v17    # "value$iv$iv$iv":J
    .end local v20    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_2

    .line 1108
    shl-int/lit8 v17, v12, 0x3

    add-int v17, v17, v13

    .line 1109
    .local v17, "index$iv$iv":I
    move/from16 v18, v17

    .local v18, "index$iv":I
    const/16 v20, 0x0

    .line 1096
    .local v20, "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    aget-object v21, v7, v18

    check-cast v21, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    .local v21, "it":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    const/16 v22, 0x0

    .line 638
    .local v22, "$i$a$-forEachValue-LayoutNodeSubcompositionsState$disposeCurrentNodes$1$1":I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getComposition()Landroidx/compose/runtime/ReusableComposition;

    move-result-object v23

    if-eqz v23, :cond_1

    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/ReusableComposition;->dispose()V

    .line 1096
    .end local v21    # "it":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    .end local v22    # "$i$a$-forEachValue-LayoutNodeSubcompositionsState$disposeCurrentNodes$1$1":I
    :cond_1
    nop

    .line 1109
    .end local v18    # "index$iv":I
    .end local v20    # "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    nop

    .line 1111
    .end local v17    # "index$iv$iv":I
    :cond_2
    shr-long/2addr v14, v4

    .line 1105
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 1113
    .end local v13    # "j$iv$iv":I
    :cond_3
    if-ne v3, v4, :cond_7

    .line 1100
    .end local v3    # "bitCount$iv$iv":I
    .end local v14    # "slot$iv$iv":J
    :cond_4
    if-eq v12, v11, :cond_6

    add-int/lit8 v12, v12, 0x1

    move/from16 v4, v19

    const/4 v3, 0x1

    goto :goto_0

    .end local v19    # "$i$a$-ignoreRemeasureRequests$ui_release-LayoutNodeSubcompositionsState$disposeCurrentNodes$1":I
    .restart local v4    # "$i$a$-ignoreRemeasureRequests$ui_release-LayoutNodeSubcompositionsState$disposeCurrentNodes$1":I
    :cond_5
    move/from16 v19, v4

    .line 1116
    .end local v4    # "$i$a$-ignoreRemeasureRequests$ui_release-LayoutNodeSubcompositionsState$disposeCurrentNodes$1":I
    .end local v12    # "i$iv$iv":I
    .restart local v19    # "$i$a$-ignoreRemeasureRequests$ui_release-LayoutNodeSubcompositionsState$disposeCurrentNodes$1":I
    :cond_6
    nop

    .line 1117
    .end local v8    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v9    # "$i$f$forEachIndexed":I
    .end local v10    # "m$iv$iv":[J
    .end local v11    # "lastIndex$iv$iv":I
    :cond_7
    nop

    .line 639
    .end local v5    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachValue":I
    .end local v7    # "v$iv":[Ljava/lang/Object;
    iget-object v3, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->removeAll$ui_release()V

    .line 640
    nop

    .line 1093
    .end local v19    # "$i$a$-ignoreRemeasureRequests$ui_release-LayoutNodeSubcompositionsState$disposeCurrentNodes$1":I
    nop

    .line 1118
    const/4 v3, 0x0

    invoke-static {v1, v3}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1119
    nop

    .line 642
    .end local v1    # "this_$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v2    # "$i$f$ignoreRemeasureRequests$ui_release":I
    iget-object v1, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 643
    iget-object v1, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotIdToNode:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 644
    iput v3, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    .line 645
    iput v3, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    .line 646
    iget-object v1, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 648
    invoke-virtual {v0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->makeSureStateIsConsistent()V

    .line 649
    return-void
.end method

.method private final disposeUnusedSlotsInApproach()V
    .locals 23

    .line 767
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachPrecomposeSlotHandleMap:Landroidx/collection/MutableScatterMap;

    .local v1, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v2, 0x0

    .line 1136
    .local v2, "$i$f$removeIf":I
    move-object v3, v1

    check-cast v3, Landroidx/collection/ScatterMap;

    .local v3, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v4, 0x0

    .line 1137
    .local v4, "$i$f$forEachIndexed":I
    iget-object v5, v3, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1138
    .local v5, "m$iv$iv":[J
    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    .line 1140
    .local v6, "lastIndex$iv$iv":I
    const/4 v7, 0x0

    .local v7, "i$iv$iv":I
    if-gt v7, v6, :cond_7

    .line 1141
    :goto_0
    aget-wide v8, v5, v7

    .line 1142
    .local v8, "slot$iv$iv":J
    move-wide v10, v8

    .local v10, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v12, 0x0

    .line 1143
    .local v12, "$i$f$maskEmptyOrDeleted":I
    not-long v13, v10

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v10

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v10, v13, v15

    .line 1142
    .end local v10    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v12    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v10, v10, v15

    if-eqz v10, :cond_6

    .line 1144
    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    .line 1145
    .local v10, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v10, :cond_5

    .line 1146
    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    .local v13, "value$iv$iv$iv":J
    const/4 v15, 0x0

    .line 1147
    .local v15, "$i$f$isFull":I
    const-wide/16 v16, 0x80

    cmp-long v16, v13, v16

    const/16 v17, 0x0

    const/16 v18, 0x1

    if-gez v16, :cond_0

    move/from16 v13, v18

    goto :goto_2

    :cond_0
    move/from16 v13, v17

    .line 1146
    .end local v13    # "value$iv$iv$iv":J
    .end local v15    # "$i$f$isFull":I
    :goto_2
    if-eqz v13, :cond_4

    .line 1148
    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    .line 1149
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/4 v15, 0x0

    .line 1150
    .local v15, "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv":I
    move/from16 v16, v11

    iget-object v11, v1, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v11, v11, v14

    move/from16 v19, v2

    .end local v2    # "$i$f$removeIf":I
    .local v11, "slotId":Ljava/lang/Object;
    .local v19, "$i$f$removeIf":I
    iget-object v2, v1, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v2, v2, v14

    check-cast v2, Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;

    .local v2, "handle":Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;
    const/16 v20, 0x0

    .line 768
    .local v20, "$i$a$-removeIf-LayoutNodeSubcompositionsState$disposeUnusedSlotsInApproach$1":I
    move-object/from16 v21, v2

    .end local v2    # "handle":Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;
    .local v21, "handle":Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;
    iget-object v2, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachComposedSlotIds:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v2, v11}, Landroidx/compose/runtime/collection/MutableVector;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 769
    .local v2, "id":I
    if-ltz v2, :cond_2

    move-object/from16 v22, v3

    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .local v22, "this_$iv$iv":Landroidx/collection/ScatterMap;
    iget v3, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentApproachIndex:I

    if-lt v2, v3, :cond_1

    goto :goto_3

    .line 774
    :cond_1
    goto :goto_4

    .line 769
    .end local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :cond_2
    move-object/from16 v22, v3

    .line 771
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :goto_3
    invoke-interface/range {v21 .. v21}, Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;->dispose()V

    .line 772
    move/from16 v17, v18

    .line 775
    :goto_4
    nop

    .line 1150
    .end local v2    # "id":I
    .end local v11    # "slotId":Ljava/lang/Object;
    .end local v20    # "$i$a$-removeIf-LayoutNodeSubcompositionsState$disposeUnusedSlotsInApproach$1":I
    .end local v21    # "handle":Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;
    if-eqz v17, :cond_3

    .line 1151
    invoke-virtual {v1, v14}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 1153
    :cond_3
    nop

    .line 1149
    .end local v14    # "index$iv":I
    .end local v15    # "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv":I
    goto :goto_5

    .line 1146
    .end local v13    # "index$iv$iv":I
    .end local v19    # "$i$f$removeIf":I
    .end local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .local v2, "$i$f$removeIf":I
    .restart local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :cond_4
    move/from16 v19, v2

    move-object/from16 v22, v3

    move/from16 v16, v11

    .line 1154
    .end local v2    # "$i$f$removeIf":I
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v19    # "$i$f$removeIf":I
    .restart local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :goto_5
    shr-long v8, v8, v16

    .line 1145
    add-int/lit8 v12, v12, 0x1

    move/from16 v11, v16

    move/from16 v2, v19

    move-object/from16 v3, v22

    goto :goto_1

    .end local v19    # "$i$f$removeIf":I
    .end local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "$i$f$removeIf":I
    .restart local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :cond_5
    move/from16 v19, v2

    move-object/from16 v22, v3

    move/from16 v16, v11

    .line 1156
    .end local v2    # "$i$f$removeIf":I
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v12    # "j$iv$iv":I
    .restart local v19    # "$i$f$removeIf":I
    .restart local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    move/from16 v2, v16

    if-ne v10, v2, :cond_9

    goto :goto_6

    .line 1142
    .end local v10    # "bitCount$iv$iv":I
    .end local v19    # "$i$f$removeIf":I
    .end local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "$i$f$removeIf":I
    .restart local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :cond_6
    move/from16 v19, v2

    move-object/from16 v22, v3

    .line 1140
    .end local v2    # "$i$f$removeIf":I
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v8    # "slot$iv$iv":J
    .restart local v19    # "$i$f$removeIf":I
    .restart local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :goto_6
    if-eq v7, v6, :cond_8

    add-int/lit8 v7, v7, 0x1

    move/from16 v2, v19

    move-object/from16 v3, v22

    goto/16 :goto_0

    .end local v19    # "$i$f$removeIf":I
    .end local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "$i$f$removeIf":I
    .restart local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :cond_7
    move/from16 v19, v2

    move-object/from16 v22, v3

    .line 1159
    .end local v2    # "$i$f$removeIf":I
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v7    # "i$iv$iv":I
    .restart local v19    # "$i$f$removeIf":I
    .restart local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :cond_8
    nop

    .line 1160
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "m$iv$iv":[J
    .end local v6    # "lastIndex$iv$iv":I
    .end local v22    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    :cond_9
    nop

    .line 777
    .end local v1    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v19    # "$i$f$removeIf":I
    return-void
.end method

.method private final getSlotIdAtIndex(Ljava/util/List;I)Ljava/lang/Object;
    .locals 2
    .param p1, "foldedChildren"    # Ljava/util/List;
    .param p2, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/ui/node/LayoutNode;",
            ">;I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 552
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    .line 553
    .local v0, "node":Landroidx/compose/ui/node/LayoutNode;
    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1, v0}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getSlotId()Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method private final ignoreRemeasureRequests(Lkotlin/jvm/functions/Function0;)V
    .locals 4
    .param p1, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 898
    .local v0, "$i$f$ignoreRemeasureRequests":I
    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    .local v1, "this_$iv":Landroidx/compose/ui/node/LayoutNode;
    const/4 v2, 0x0

    .line 1198
    .local v2, "$i$f$ignoreRemeasureRequests$ui_release":I
    const/4 v3, 0x1

    invoke-static {v1, v3}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1199
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1200
    const/4 v3, 0x0

    invoke-static {v1, v3}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1201
    nop

    .line 898
    .end local v1    # "this_$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v2    # "$i$f$ignoreRemeasureRequests$ui_release":I
    return-void
.end method

.method private final markActiveNodesAsReused(Z)V
    .locals 16
    .param p1, "deactivate"    # Z

    .line 606
    move-object/from16 v1, p0

    const/4 v0, 0x0

    iput v0, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    .line 607
    iget-object v2, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v2}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 609
    iget-object v2, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v2

    .line 610
    .local v2, "foldedChildren":Ljava/util/List;
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 611
    .local v3, "childCount":I
    iget v4, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    if-eq v4, v3, :cond_5

    .line 612
    iput v3, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    .line 613
    sget-object v4, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .local v4, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    const/4 v5, 0x0

    .line 1084
    .local v5, "$i$f$withoutReadObservation":I
    nop

    .line 1085
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v6

    .line 1086
    .local v6, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    const/4 v7, 0x0

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    goto :goto_0

    :cond_0
    move-object v8, v7

    .line 1087
    .local v8, "observer$iv":Lkotlin/jvm/functions/Function1;
    :goto_0
    invoke-virtual {v4, v6}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v9

    .line 1088
    .local v9, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 1089
    const/4 v10, 0x0

    .line 614
    .local v10, "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$markActiveNodesAsReused$1":I
    const/4 v11, 0x0

    .local v11, "i":I
    :goto_1
    if-ge v11, v3, :cond_4

    .line 615
    :try_start_0
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/ui/node/LayoutNode;

    .line 616
    .local v12, "node":Landroidx/compose/ui/node/LayoutNode;
    iget-object v13, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v13, v12}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    .line 617
    .local v13, "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    if-eqz v13, :cond_3

    invoke-virtual {v13}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getActive()Z

    move-result v14

    if-eqz v14, :cond_3

    .line 618
    invoke-direct {v1, v12}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->resetLayoutState(Landroidx/compose/ui/node/LayoutNode;)V

    .line 619
    if-eqz p1, :cond_2

    .line 620
    invoke-virtual {v13}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getComposition()Landroidx/compose/runtime/ReusableComposition;

    move-result-object v14

    if-eqz v14, :cond_1

    invoke-interface {v14}, Landroidx/compose/runtime/ReusableComposition;->deactivate()V

    .line 621
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    const/4 v15, 0x2

    invoke-static {v14, v7, v15, v7}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v14

    invoke-virtual {v13, v14}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setActiveState(Landroidx/compose/runtime/MutableState;)V

    goto :goto_2

    .line 623
    :cond_2
    invoke-virtual {v13, v0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setActive(Z)V

    .line 626
    :goto_2
    invoke-static {}, Landroidx/compose/ui/layout/SubcomposeLayoutKt;->access$getReusedSlotId$p()Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;

    move-result-object v14

    invoke-virtual {v13, v14}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setSlotId(Ljava/lang/Object;)V

    .line 614
    .end local v12    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local v13    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 629
    .end local v11    # "i":I
    :cond_4
    nop

    .end local v10    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$markActiveNodesAsReused$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1089
    nop

    .line 1091
    invoke-virtual {v4, v6, v9, v8}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    .line 1089
    nop

    .line 630
    .end local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v5    # "$i$f$withoutReadObservation":I
    .end local v6    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v8    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v9    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    iget-object v0, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotIdToNode:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->clear()V

    goto :goto_3

    .line 1091
    .restart local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .restart local v5    # "$i$f$withoutReadObservation":I
    .restart local v6    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v8    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v9    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :catchall_0
    move-exception v0

    invoke-virtual {v4, v6, v9, v8}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    throw v0

    .line 633
    .end local v4    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v5    # "$i$f$withoutReadObservation":I
    .end local v6    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v8    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v9    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    :cond_5
    :goto_3
    invoke-virtual {v1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->makeSureStateIsConsistent()V

    .line 634
    return-void
.end method

.method private final move(III)V
    .locals 6
    .param p1, "from"    # I
    .param p2, "to"    # I
    .param p3, "count"    # I

    .line 894
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    const/4 v1, 0x0

    .line 1193
    .local v1, "$i$f$ignoreRemeasureRequests":I
    iget-object v2, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    .local v2, "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    const/4 v3, 0x0

    .line 1194
    .local v3, "$i$f$ignoreRemeasureRequests$ui_release":I
    const/4 v4, 0x1

    invoke-static {v2, v4}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1195
    const/4 v4, 0x0

    .line 894
    .local v4, "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$move$1":I
    iget-object v5, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v5, p1, p2, p3}, Landroidx/compose/ui/node/LayoutNode;->move$ui_release(III)V

    .line 1195
    .end local v4    # "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$move$1":I
    nop

    .line 1196
    const/4 v4, 0x0

    invoke-static {v2, v4}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1197
    nop

    .line 1193
    .end local v2    # "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v3    # "$i$f$ignoreRemeasureRequests$ui_release":I
    nop

    .line 895
    .end local v0    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .end local v1    # "$i$f$ignoreRemeasureRequests":I
    return-void
.end method

.method static synthetic move$default(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;IIIILjava/lang/Object;)V
    .locals 0

    .line 893
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->move(III)V

    return-void
.end method

.method private final resetLayoutState(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 3
    .param p1, "$this$resetLayoutState"    # Landroidx/compose/ui/node/LayoutNode;

    .line 670
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getMeasurePassDelegate$ui_release()Landroidx/compose/ui/node/MeasurePassDelegate;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/node/LayoutNode$UsageByParent;->NotUsed:Landroidx/compose/ui/node/LayoutNode$UsageByParent;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/node/MeasurePassDelegate;->setMeasuredByParent$ui_release(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V

    .line 671
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getLookaheadPassDelegate$ui_release()Landroidx/compose/ui/node/LookaheadPassDelegate;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1135
    .local v0, "it":Landroidx/compose/ui/node/LookaheadPassDelegate;
    const/4 v1, 0x0

    .line 671
    .local v1, "$i$a$-let-LayoutNodeSubcompositionsState$resetLayoutState$1":I
    sget-object v2, Landroidx/compose/ui/node/LayoutNode$UsageByParent;->NotUsed:Landroidx/compose/ui/node/LayoutNode$UsageByParent;

    invoke-virtual {v0, v2}, Landroidx/compose/ui/node/LookaheadPassDelegate;->setMeasuredByParent$ui_release(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V

    .line 672
    .end local v0    # "it":Landroidx/compose/ui/node/LookaheadPassDelegate;
    .end local v1    # "$i$a$-let-LayoutNodeSubcompositionsState$resetLayoutState$1":I
    :cond_0
    return-void
.end method

.method private final subcompose(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;)V
    .locals 23
    .param p1, "node"    # Landroidx/compose/ui/node/LayoutNode;
    .param p2, "nodeState"    # Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    .line 510
    move-object/from16 v1, p2

    sget-object v2, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .local v2, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    const/4 v3, 0x0

    .line 1060
    .local v3, "$i$f$withoutReadObservation":I
    nop

    .line 1061
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v4

    .line 1062
    .local v4, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v5, v0

    .line 1063
    .local v5, "observer$iv":Lkotlin/jvm/functions/Function1;
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v6

    .line 1064
    .local v6, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 1065
    const/4 v0, 0x0

    .line 511
    .local v0, "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$subcompose$3":I
    move-object/from16 v7, p0

    .local v7, "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    const/4 v8, 0x0

    .line 1066
    .local v8, "$i$f$ignoreRemeasureRequests":I
    :try_start_0
    iget-object v9, v7, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    .local v9, "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    const/4 v10, 0x0

    .line 1067
    .local v10, "$i$f$ignoreRemeasureRequests$ui_release":I
    const/4 v11, 0x1

    invoke-static {v9, v11}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1068
    const/4 v12, 0x0

    .line 512
    .local v12, "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$subcompose$3$1":I
    invoke-virtual {v1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getContent()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    .line 513
    .local v13, "content":Lkotlin/jvm/functions/Function2;
    nop

    .line 515
    invoke-virtual {v1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getComposition()Landroidx/compose/runtime/ReusableComposition;

    move-result-object v15

    .line 518
    move-object/from16 v14, p0

    iget-object v11, v14, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->compositionContext:Landroidx/compose/runtime/CompositionContext;

    if-eqz v11, :cond_1

    .line 522
    invoke-virtual {v1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getForceReuse()Z

    move-result v17

    .line 514
    nop

    .line 515
    nop

    .line 516
    nop

    .line 522
    nop

    .line 518
    nop

    .line 523
    move/from16 v20, v0

    .end local v0    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$subcompose$3":I
    .local v20, "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$subcompose$3":I
    new-instance v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1;

    invoke-direct {v0, v1, v13}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1;-><init>(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;Lkotlin/jvm/functions/Function2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move/from16 v21, v3

    .end local v3    # "$i$f$withoutReadObservation":I
    .local v21, "$i$f$withoutReadObservation":I
    const v3, -0x68551fe9

    move-object/from16 v22, v7

    const/4 v7, 0x1

    .end local v7    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .local v22, "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    :try_start_1
    invoke-static {v3, v7, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lkotlin/jvm/functions/Function2;

    .line 514
    move-object/from16 v16, p1

    move-object/from16 v18, v11

    invoke-direct/range {v14 .. v19}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->subcomposeInto(Landroidx/compose/runtime/ReusableComposition;Landroidx/compose/ui/node/LayoutNode;ZLandroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/ReusableComposition;

    move-result-object v0

    .line 513
    invoke-virtual {v1, v0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setComposition(Landroidx/compose/runtime/ReusableComposition;)V

    .line 525
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setForceReuse(Z)V

    .line 526
    nop

    .line 1068
    .end local v12    # "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$subcompose$3$1":I
    .end local v13    # "content":Lkotlin/jvm/functions/Function2;
    nop

    .line 1069
    invoke-static {v9, v0}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1070
    nop

    .line 1066
    .end local v9    # "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v10    # "$i$f$ignoreRemeasureRequests$ui_release":I
    nop

    .line 527
    .end local v8    # "$i$f$ignoreRemeasureRequests":I
    .end local v22    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    nop

    .end local v20    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$subcompose$3":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1065
    nop

    .line 1071
    invoke-virtual {v2, v4, v6, v5}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    .line 1065
    nop

    .line 528
    .end local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v4    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v5    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v6    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v21    # "$i$f$withoutReadObservation":I
    return-void

    .line 520
    .restart local v0    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$subcompose$3":I
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .restart local v3    # "$i$f$withoutReadObservation":I
    .restart local v4    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v5    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v6    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v7    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .restart local v8    # "$i$f$ignoreRemeasureRequests":I
    .restart local v9    # "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v10    # "$i$f$ignoreRemeasureRequests$ui_release":I
    .restart local v12    # "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$subcompose$3$1":I
    .restart local v13    # "content":Lkotlin/jvm/functions/Function2;
    :cond_1
    move/from16 v20, v0

    move/from16 v21, v3

    move-object/from16 v22, v7

    .end local v0    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$subcompose$3":I
    .end local v3    # "$i$f$withoutReadObservation":I
    .end local v7    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .restart local v20    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$subcompose$3":I
    .restart local v21    # "$i$f$withoutReadObservation":I
    .restart local v22    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    :try_start_2
    const-string/jumbo v0, "parent composition reference not set"

    .line 519
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .end local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v4    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v5    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v6    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v21    # "$i$f$withoutReadObservation":I
    .end local p1    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local p2    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1071
    .end local v8    # "$i$f$ignoreRemeasureRequests":I
    .end local v9    # "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v10    # "$i$f$ignoreRemeasureRequests$ui_release":I
    .end local v12    # "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$subcompose$3$1":I
    .end local v13    # "content":Lkotlin/jvm/functions/Function2;
    .end local v20    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$subcompose$3":I
    .end local v22    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .restart local v4    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v5    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .restart local v6    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .restart local v21    # "$i$f$withoutReadObservation":I
    .restart local p1    # "node":Landroidx/compose/ui/node/LayoutNode;
    .restart local p2    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    :catchall_0
    move-exception v0

    goto :goto_1

    .end local v21    # "$i$f$withoutReadObservation":I
    .restart local v3    # "$i$f$withoutReadObservation":I
    :catchall_1
    move-exception v0

    move/from16 v21, v3

    .end local v3    # "$i$f$withoutReadObservation":I
    .restart local v21    # "$i$f$withoutReadObservation":I
    :goto_1
    invoke-virtual {v2, v4, v6, v5}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    throw v0
.end method

.method private final subcompose(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    .locals 9
    .param p1, "node"    # Landroidx/compose/ui/node/LayoutNode;
    .param p2, "slotId"    # Ljava/lang/Object;
    .param p3, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/node/LayoutNode;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 500
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    .local v0, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v1, 0x0

    .line 1058
    .local v1, "$i$f$getOrPut":I
    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    .line 500
    .local v2, "$i$a$-getOrPut-LayoutNodeSubcompositionsState$subcompose$nodeState$1":I
    new-instance v3, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    sget-object v4, Landroidx/compose/ui/layout/ComposableSingletons$SubcomposeLayoutKt;->INSTANCE:Landroidx/compose/ui/layout/ComposableSingletons$SubcomposeLayoutKt;

    invoke-virtual {v4}, Landroidx/compose/ui/layout/ComposableSingletons$SubcomposeLayoutKt;->getLambda-1$ui_release()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v4, p2

    .end local p2    # "slotId":Ljava/lang/Object;
    .local v4, "slotId":Ljava/lang/Object;
    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ReusableComposition;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1058
    .end local v2    # "$i$a$-getOrPut-LayoutNodeSubcompositionsState$subcompose$nodeState$1":I
    move-object p2, v3

    .line 1059
    .local p2, "it$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 1058
    .local v2, "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    invoke-virtual {v0, p1, p2}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v3

    .end local v2    # "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    .end local p2    # "it$iv":Ljava/lang/Object;
    goto :goto_0

    .end local v4    # "slotId":Ljava/lang/Object;
    .local p2, "slotId":Ljava/lang/Object;
    :cond_0
    move-object v4, p2

    .line 500
    .end local v0    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v1    # "$i$f$getOrPut":I
    .end local p2    # "slotId":Ljava/lang/Object;
    .restart local v4    # "slotId":Ljava/lang/Object;
    :goto_0
    move-object p2, v2

    check-cast p2, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    .line 501
    .local p2, "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    invoke-virtual {p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getComposition()Landroidx/compose/runtime/ReusableComposition;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/runtime/ReusableComposition;->getHasInvalidations()Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    .line 502
    .local v0, "hasPendingChanges":Z
    :goto_1
    invoke-virtual {p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getContent()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    if-ne v1, p3, :cond_2

    if-nez v0, :cond_2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getForceRecompose()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 503
    :cond_2
    invoke-virtual {p2, p3}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setContent(Lkotlin/jvm/functions/Function2;)V

    .line 504
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->subcompose(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;)V

    .line 505
    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setForceRecompose(Z)V

    .line 507
    :cond_3
    return-void
.end method

.method private final subcomposeInto(Landroidx/compose/runtime/ReusableComposition;Landroidx/compose/ui/node/LayoutNode;ZLandroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/ReusableComposition;
    .locals 3
    .param p1, "existing"    # Landroidx/compose/runtime/ReusableComposition;
    .param p2, "container"    # Landroidx/compose/ui/node/LayoutNode;
    .param p3, "reuseContent"    # Z
    .param p4, "parent"    # Landroidx/compose/runtime/CompositionContext;
    .param p5, "composable"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/ReusableComposition;",
            "Landroidx/compose/ui/node/LayoutNode;",
            "Z",
            "Landroidx/compose/runtime/CompositionContext;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/runtime/ReusableComposition;"
        }
    .end annotation

    .line 537
    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroidx/compose/runtime/ReusableComposition;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 540
    :cond_0
    move-object v0, p1

    goto :goto_1

    .line 538
    :cond_1
    :goto_0
    invoke-static {p2, p4}, Landroidx/compose/ui/platform/SubcompositionKt;->createSubcomposition(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;)Landroidx/compose/runtime/ReusableComposition;

    move-result-object v0

    .line 542
    :goto_1
    move-object v1, v0

    .local v1, "$this$subcomposeInto_u24lambda_u246":Landroidx/compose/runtime/ReusableComposition;
    const/4 v2, 0x0

    .line 543
    .local v2, "$i$a$-apply-LayoutNodeSubcompositionsState$subcomposeInto$1":I
    if-nez p3, :cond_2

    .line 544
    invoke-interface {v1, p5}, Landroidx/compose/runtime/ReusableComposition;->setContent(Lkotlin/jvm/functions/Function2;)V

    goto :goto_2

    .line 546
    :cond_2
    invoke-interface {v1, p5}, Landroidx/compose/runtime/ReusableComposition;->setContentWithReuse(Lkotlin/jvm/functions/Function2;)V

    .line 548
    :goto_2
    nop

    .line 542
    .end local v1    # "$this$subcomposeInto_u24lambda_u246":Landroidx/compose/runtime/ReusableComposition;
    .end local v2    # "$i$a$-apply-LayoutNodeSubcompositionsState$subcomposeInto$1":I
    nop

    .line 537
    return-object v0
.end method

.method private final takeNodeFromReusables(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;
    .locals 11
    .param p1, "slotId"    # Ljava/lang/Object;

    .line 675
    iget v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 676
    return-object v1

    .line 678
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v0

    .line 679
    .local v0, "foldedChildren":Ljava/util/List;
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    sub-int/2addr v2, v3

    .line 680
    .local v2, "reusableNodesSectionEnd":I
    iget v3, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    sub-int v3, v2, v3

    .line 681
    .local v3, "reusableNodesSectionStart":I
    add-int/lit8 v4, v2, -0x1

    .line 682
    .local v4, "index":I
    const/4 v5, -0x1

    .line 684
    .local v5, "chosenIndex":I
    :goto_0
    if-lt v4, v3, :cond_2

    .line 685
    invoke-direct {p0, v0, v4}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->getSlotIdAtIndex(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 687
    move v5, v4

    .line 688
    goto :goto_1

    .line 690
    :cond_1
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 693
    :cond_2
    :goto_1
    const/4 v6, -0x1

    if-ne v5, v6, :cond_5

    .line 695
    add-int/lit8 v4, v2, -0x1

    .line 696
    :goto_2
    if-lt v4, v3, :cond_5

    .line 697
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/node/LayoutNode;

    .line 698
    .local v7, "node":Landroidx/compose/ui/node/LayoutNode;
    iget-object v8, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v8, v7}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v8, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    .line 699
    .local v8, "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    nop

    .line 700
    invoke-virtual {v8}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getSlotId()Ljava/lang/Object;

    move-result-object v9

    invoke-static {}, Landroidx/compose/ui/layout/SubcomposeLayoutKt;->access$getReusedSlotId$p()Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;

    move-result-object v10

    if-eq v9, v10, :cond_4

    .line 701
    iget-object v9, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotReusePolicy:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;

    invoke-virtual {v8}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getSlotId()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v9, p1, v10}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;->areCompatible(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_3

    .line 707
    :cond_3
    nop

    .end local v7    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local v8    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    add-int/lit8 v4, v4, -0x1

    goto :goto_2

    .line 703
    .restart local v7    # "node":Landroidx/compose/ui/node/LayoutNode;
    .restart local v8    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    :cond_4
    :goto_3
    invoke-virtual {v8, p1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setSlotId(Ljava/lang/Object;)V

    .line 704
    move v5, v4

    .line 705
    nop

    .line 710
    .end local v7    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local v8    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    :cond_5
    if-ne v5, v6, :cond_6

    .line 712
    goto :goto_4

    .line 714
    :cond_6
    const/4 v7, 0x1

    if-eq v4, v3, :cond_7

    .line 716
    invoke-direct {p0, v4, v3, v7}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->move(III)V

    .line 718
    :cond_7
    iget v8, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    add-int/2addr v8, v6

    iput v8, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    .line 719
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/node/LayoutNode;

    .line 720
    .local v6, "node":Landroidx/compose/ui/node/LayoutNode;
    iget-object v8, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v8, v6}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v8, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    .line 722
    .restart local v8    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const/4 v10, 0x2

    invoke-static {v9, v1, v10, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    invoke-virtual {v8, v1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setActiveState(Landroidx/compose/runtime/MutableState;)V

    .line 723
    invoke-virtual {v8, v7}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setForceReuse(Z)V

    .line 724
    invoke-virtual {v8, v7}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setForceRecompose(Z)V

    .line 725
    move-object v1, v6

    .line 710
    .end local v6    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local v8    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    :goto_4
    return-object v1
.end method


# virtual methods
.method public final createMeasurePolicy(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 2
    .param p1, "block"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
            "-",
            "Landroidx/compose/ui/unit/Constraints;",
            "+",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;)",
            "Landroidx/compose/ui/layout/MeasurePolicy;"
        }
    .end annotation

    .line 732
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->NoIntrinsicsMessage:Ljava/lang/String;

    new-instance v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1;

    invoke-direct {v1, p0, p1, v0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$createMeasurePolicy$1;-><init>(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/ui/layout/MeasurePolicy;

    return-object v1
.end method

.method public final disposeOrReuseStartingFromIndex(I)V
    .locals 22
    .param p1, "startIndex"    # I

    .line 557
    move-object/from16 v1, p0

    move/from16 v2, p1

    const/4 v0, 0x0

    iput v0, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    .line 558
    iget-object v3, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v3

    .line 559
    .local v3, "foldedChildren":Ljava/util/List;
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    iget v5, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    sub-int/2addr v4, v5

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    .line 560
    .local v4, "lastReusableIndex":I
    const/4 v6, 0x0

    .line 561
    .local v6, "needApplyNotification":Z
    if-gt v2, v4, :cond_6

    .line 563
    iget-object v7, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableSlotIdsSet:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;

    invoke-virtual {v7}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->clear()V

    .line 564
    move/from16 v7, p1

    .local v7, "i":I
    if-gt v7, v4, :cond_0

    .line 565
    :goto_0
    invoke-direct {v1, v3, v7}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->getSlotIdAtIndex(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v8

    .line 566
    .local v8, "slotId":Ljava/lang/Object;
    iget-object v9, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableSlotIdsSet:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;

    invoke-virtual {v9, v8}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->add$ui_release(Ljava/lang/Object;)Z

    .line 564
    .end local v8    # "slotId":Ljava/lang/Object;
    if-eq v7, v4, :cond_0

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 569
    .end local v7    # "i":I
    :cond_0
    iget-object v7, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotReusePolicy:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;

    iget-object v8, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableSlotIdsSet:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;

    invoke-interface {v7, v8}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;->getSlotsToRetain(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;)V

    .line 571
    const/4 v7, 0x0

    .restart local v7    # "i":I
    move v7, v4

    .line 572
    sget-object v8, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .local v8, "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    const/4 v9, 0x0

    .line 1072
    .local v9, "$i$f$withoutReadObservation":I
    nop

    .line 1073
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->getCurrentThreadSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v10

    .line 1074
    .local v10, "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    if-eqz v10, :cond_1

    invoke-virtual {v10}, Landroidx/compose/runtime/snapshots/Snapshot;->getReadObserver()Lkotlin/jvm/functions/Function1;

    move-result-object v11

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    .line 1075
    .local v11, "observer$iv":Lkotlin/jvm/functions/Function1;
    :goto_1
    invoke-virtual {v8, v10}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->makeCurrentNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v12

    .line 1076
    .local v12, "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    nop

    .line 1077
    const/4 v13, 0x0

    .line 573
    .local v13, "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1":I
    :goto_2
    if-lt v7, v2, :cond_5

    .line 574
    :try_start_0
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/compose/ui/node/LayoutNode;

    .line 575
    .local v14, "node":Landroidx/compose/ui/node/LayoutNode;
    iget-object v15, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v15, v14}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v15, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    .line 576
    .local v15, "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    invoke-virtual {v15}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getSlotId()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v16

    .line 577
    .local v17, "slotId":Ljava/lang/Object;
    move/from16 v16, v5

    iget-object v5, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableSlotIdsSet:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;

    move-object/from16 v0, v17

    .end local v17    # "slotId":Ljava/lang/Object;
    .local v0, "slotId":Ljava/lang/Object;
    invoke-virtual {v5, v0}, Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;->contains(Ljava/lang/Object;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v5, :cond_3

    .line 578
    :try_start_1
    iget v5, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    .line 579
    invoke-virtual {v15}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getActive()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 580
    invoke-direct {v1, v14}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->resetLayoutState(Landroidx/compose/ui/node/LayoutNode;)V

    .line 581
    const/4 v5, 0x0

    invoke-virtual {v15, v5}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setActive(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 582
    const/4 v5, 0x1

    move-object/from16 v19, v3

    move/from16 v21, v4

    move v6, v5

    move/from16 v4, v16

    const/4 v3, 0x0

    .end local v6    # "needApplyNotification":Z
    .local v5, "needApplyNotification":Z
    goto :goto_4

    .line 579
    .end local v5    # "needApplyNotification":Z
    .restart local v6    # "needApplyNotification":Z
    :cond_2
    move-object/from16 v19, v3

    move/from16 v21, v4

    move/from16 v4, v16

    const/4 v3, 0x0

    goto :goto_4

    .line 1083
    .end local v0    # "slotId":Ljava/lang/Object;
    .end local v13    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1":I
    .end local v14    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local v15    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    :catchall_0
    move-exception v0

    move-object/from16 v19, v3

    move/from16 v21, v4

    goto :goto_5

    .line 585
    .restart local v0    # "slotId":Ljava/lang/Object;
    .restart local v13    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1":I
    .restart local v14    # "node":Landroidx/compose/ui/node/LayoutNode;
    .restart local v15    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    :cond_3
    move-object/from16 v5, p0

    .local v5, "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    const/16 v17, 0x0

    .line 1078
    .local v17, "$i$f$ignoreRemeasureRequests":I
    :try_start_2
    iget-object v2, v5, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .local v2, "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    const/16 v18, 0x0

    .line 1079
    .local v18, "$i$f$ignoreRemeasureRequests$ui_release":I
    move-object/from16 v19, v3

    move/from16 v3, v16

    .end local v3    # "foldedChildren":Ljava/util/List;
    .local v19, "foldedChildren":Ljava/util/List;
    :try_start_3
    invoke-static {v2, v3}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1080
    const/4 v3, 0x0

    .line 586
    .local v3, "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1$1":I
    move/from16 v20, v3

    .end local v3    # "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1$1":I
    .local v20, "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1$1":I
    iget-object v3, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v3, v14}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    invoke-virtual {v15}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->getComposition()Landroidx/compose/runtime/ReusableComposition;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v3, :cond_4

    :try_start_4
    invoke-interface {v3}, Landroidx/compose/runtime/ReusableComposition;->dispose()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    .line 1083
    .end local v0    # "slotId":Ljava/lang/Object;
    .end local v2    # "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v5    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .end local v13    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1":I
    .end local v14    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local v15    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    .end local v17    # "$i$f$ignoreRemeasureRequests":I
    .end local v18    # "$i$f$ignoreRemeasureRequests$ui_release":I
    .end local v20    # "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1$1":I
    :catchall_1
    move-exception v0

    move/from16 v21, v4

    goto :goto_5

    .line 588
    .restart local v0    # "slotId":Ljava/lang/Object;
    .restart local v2    # "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v5    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .restart local v13    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1":I
    .restart local v14    # "node":Landroidx/compose/ui/node/LayoutNode;
    .restart local v15    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    .restart local v17    # "$i$f$ignoreRemeasureRequests":I
    .restart local v18    # "$i$f$ignoreRemeasureRequests$ui_release":I
    .restart local v20    # "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1$1":I
    :cond_4
    :goto_3
    :try_start_5
    iget-object v3, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move/from16 v21, v4

    const/4 v4, 0x1

    .end local v4    # "lastReusableIndex":I
    .local v21, "lastReusableIndex":I
    :try_start_6
    invoke-virtual {v3, v7, v4}, Landroidx/compose/ui/node/LayoutNode;->removeAt$ui_release(II)V

    .line 589
    nop

    .line 1080
    .end local v20    # "$i$a$-ignoreRemeasureRequests-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1$1":I
    nop

    .line 1081
    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/compose/ui/node/LayoutNode;->access$setIgnoreRemeasureRequests$p(Landroidx/compose/ui/node/LayoutNode;Z)V

    .line 1082
    nop

    .line 1078
    .end local v2    # "this_$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .end local v18    # "$i$f$ignoreRemeasureRequests$ui_release":I
    nop

    .line 592
    .end local v5    # "this_$iv":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;
    .end local v17    # "$i$f$ignoreRemeasureRequests":I
    :goto_4
    iget-object v2, v1, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotIdToNode:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v2, v0}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    add-int/lit8 v7, v7, -0x1

    move/from16 v2, p1

    move v0, v3

    move v5, v4

    move-object/from16 v3, v19

    move/from16 v4, v21

    .end local v0    # "slotId":Ljava/lang/Object;
    .end local v14    # "node":Landroidx/compose/ui/node/LayoutNode;
    .end local v15    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    goto/16 :goto_2

    .line 1083
    .end local v13    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1":I
    .end local v21    # "lastReusableIndex":I
    .restart local v4    # "lastReusableIndex":I
    :catchall_2
    move-exception v0

    move/from16 v21, v4

    .end local v4    # "lastReusableIndex":I
    .restart local v21    # "lastReusableIndex":I
    goto :goto_5

    .end local v19    # "foldedChildren":Ljava/util/List;
    .end local v21    # "lastReusableIndex":I
    .local v3, "foldedChildren":Ljava/util/List;
    .restart local v4    # "lastReusableIndex":I
    :catchall_3
    move-exception v0

    move-object/from16 v19, v3

    move/from16 v21, v4

    .end local v3    # "foldedChildren":Ljava/util/List;
    .end local v4    # "lastReusableIndex":I
    .restart local v19    # "foldedChildren":Ljava/util/List;
    .restart local v21    # "lastReusableIndex":I
    goto :goto_5

    .line 595
    .end local v19    # "foldedChildren":Ljava/util/List;
    .end local v21    # "lastReusableIndex":I
    .restart local v3    # "foldedChildren":Ljava/util/List;
    .restart local v4    # "lastReusableIndex":I
    .restart local v13    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1":I
    :cond_5
    move-object/from16 v19, v3

    move/from16 v21, v4

    .end local v3    # "foldedChildren":Ljava/util/List;
    .end local v4    # "lastReusableIndex":I
    .end local v13    # "$i$a$-withoutReadObservation-LayoutNodeSubcompositionsState$disposeOrReuseStartingFromIndex$1":I
    .restart local v19    # "foldedChildren":Ljava/util/List;
    .restart local v21    # "lastReusableIndex":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1077
    nop

    .line 1083
    invoke-virtual {v8, v10, v12, v11}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    .line 1077
    goto :goto_6

    .line 1083
    :catchall_4
    move-exception v0

    :goto_5
    invoke-virtual {v8, v10, v12, v11}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->restoreNonObservable(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V

    throw v0

    .line 561
    .end local v7    # "i":I
    .end local v8    # "this_$iv":Landroidx/compose/runtime/snapshots/Snapshot$Companion;
    .end local v9    # "$i$f$withoutReadObservation":I
    .end local v10    # "previousSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v11    # "observer$iv":Lkotlin/jvm/functions/Function1;
    .end local v12    # "newSnapshot$iv":Landroidx/compose/runtime/snapshots/Snapshot;
    .end local v19    # "foldedChildren":Ljava/util/List;
    .end local v21    # "lastReusableIndex":I
    .restart local v3    # "foldedChildren":Ljava/util/List;
    .restart local v4    # "lastReusableIndex":I
    :cond_6
    move-object/from16 v19, v3

    move/from16 v21, v4

    .line 598
    .end local v3    # "foldedChildren":Ljava/util/List;
    .end local v4    # "lastReusableIndex":I
    .restart local v19    # "foldedChildren":Ljava/util/List;
    .restart local v21    # "lastReusableIndex":I
    :goto_6
    if-eqz v6, :cond_7

    .line 599
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->sendApplyNotifications()V

    .line 602
    :cond_7
    invoke-virtual {v1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->makeSureStateIsConsistent()V

    .line 603
    return-void
.end method

.method public final forceRecomposeChildren()V
    .locals 21

    .line 875
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 876
    .local v1, "childCount":I
    iget v2, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    if-eq v2, v1, :cond_7

    .line 879
    iget-object v2, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    check-cast v2, Landroidx/collection/ScatterMap;

    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v3, 0x0

    .line 1163
    .local v3, "$i$f$forEachValue":I
    iget-object v4, v2, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 1165
    .local v4, "v$iv":[Ljava/lang/Object;
    move-object v5, v2

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v6, 0x0

    .line 1166
    .local v6, "$i$f$forEachIndexed":I
    iget-object v7, v5, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1167
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1169
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_4

    .line 1170
    :goto_0
    aget-wide v10, v7, v9

    .line 1171
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v14, 0x0

    .line 1172
    .local v14, "$i$f$maskEmptyOrDeleted":I
    move v15, v1

    move-object/from16 v16, v2

    .end local v1    # "childCount":I
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v15, "childCount":I
    .local v16, "this_$iv":Landroidx/collection/ScatterMap;
    not-long v1, v12

    const/16 v17, 0x7

    shl-long v1, v1, v17

    and-long/2addr v1, v12

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v1, v1, v17

    .line 1171
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v1, v1, v17

    if-eqz v1, :cond_3

    .line 1173
    sub-int v1, v9, v8

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    const/16 v2, 0x8

    rsub-int/lit8 v1, v1, 0x8

    .line 1174
    .local v1, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v1, :cond_2

    .line 1175
    const-wide/16 v13, 0xff

    and-long/2addr v13, v10

    .local v13, "value$iv$iv$iv":J
    const/16 v17, 0x0

    .line 1176
    .local v17, "$i$f$isFull":I
    const-wide/16 v18, 0x80

    cmp-long v18, v13, v18

    move/from16 v19, v2

    if-gez v18, :cond_0

    const/16 v18, 0x1

    goto :goto_2

    :cond_0
    const/16 v18, 0x0

    .line 1175
    .end local v13    # "value$iv$iv$iv":J
    .end local v17    # "$i$f$isFull":I
    :goto_2
    if-eqz v18, :cond_1

    .line 1177
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 1178
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/16 v17, 0x0

    .line 1165
    .local v17, "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    aget-object v18, v4, v14

    move-object/from16 v2, v18

    check-cast v2, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;

    .local v2, "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    const/16 v18, 0x0

    .line 879
    .local v18, "$i$a$-forEachValue-LayoutNodeSubcompositionsState$forceRecomposeChildren$1":I
    move/from16 v20, v3

    const/4 v3, 0x1

    .end local v3    # "$i$f$forEachValue":I
    .local v20, "$i$f$forEachValue":I
    invoke-virtual {v2, v3}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;->setForceRecompose(Z)V

    .line 1165
    .end local v2    # "nodeState":Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;
    .end local v18    # "$i$a$-forEachValue-LayoutNodeSubcompositionsState$forceRecomposeChildren$1":I
    nop

    .line 1178
    .end local v14    # "index$iv":I
    .end local v17    # "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    goto :goto_3

    .line 1175
    .end local v13    # "index$iv$iv":I
    .end local v20    # "$i$f$forEachValue":I
    .restart local v3    # "$i$f$forEachValue":I
    :cond_1
    move/from16 v20, v3

    .line 1180
    .end local v3    # "$i$f$forEachValue":I
    .restart local v20    # "$i$f$forEachValue":I
    :goto_3
    shr-long v10, v10, v19

    .line 1174
    add-int/lit8 v12, v12, 0x1

    move/from16 v2, v19

    move/from16 v3, v20

    goto :goto_1

    .end local v20    # "$i$f$forEachValue":I
    .restart local v3    # "$i$f$forEachValue":I
    :cond_2
    move/from16 v19, v2

    move/from16 v20, v3

    .line 1182
    .end local v3    # "$i$f$forEachValue":I
    .end local v12    # "j$iv$iv":I
    .restart local v20    # "$i$f$forEachValue":I
    if-ne v1, v2, :cond_6

    goto :goto_4

    .line 1171
    .end local v1    # "bitCount$iv$iv":I
    .end local v20    # "$i$f$forEachValue":I
    .restart local v3    # "$i$f$forEachValue":I
    :cond_3
    move/from16 v20, v3

    .line 1169
    .end local v3    # "$i$f$forEachValue":I
    .end local v10    # "slot$iv$iv":J
    .restart local v20    # "$i$f$forEachValue":I
    :goto_4
    if-eq v9, v8, :cond_5

    add-int/lit8 v9, v9, 0x1

    move v1, v15

    move-object/from16 v2, v16

    move/from16 v3, v20

    goto :goto_0

    .end local v15    # "childCount":I
    .end local v16    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v20    # "$i$f$forEachValue":I
    .local v1, "childCount":I
    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v3    # "$i$f$forEachValue":I
    :cond_4
    move v15, v1

    move-object/from16 v16, v2

    move/from16 v20, v3

    .line 1185
    .end local v1    # "childCount":I
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v3    # "$i$f$forEachValue":I
    .end local v9    # "i$iv$iv":I
    .restart local v15    # "childCount":I
    .restart local v16    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v20    # "$i$f$forEachValue":I
    :cond_5
    nop

    .line 1186
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_6
    nop

    .line 881
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v16    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v20    # "$i$f$forEachValue":I
    iget-object v1, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getMeasurePending$ui_release()Z

    move-result v1

    if-nez v1, :cond_8

    .line 882
    iget-object v2, v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/node/LayoutNode;->requestRemeasure$ui_release$default(Landroidx/compose/ui/node/LayoutNode;ZZZILjava/lang/Object;)V

    goto :goto_5

    .line 876
    .end local v15    # "childCount":I
    .restart local v1    # "childCount":I
    :cond_7
    move v15, v1

    .line 885
    .end local v1    # "childCount":I
    .restart local v15    # "childCount":I
    :cond_8
    :goto_5
    return-void
.end method

.method public final getCompositionContext()Landroidx/compose/runtime/CompositionContext;
    .locals 1

    .line 398
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->compositionContext:Landroidx/compose/runtime/CompositionContext;

    return-object v0
.end method

.method public final getSlotReusePolicy()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;
    .locals 1

    .line 400
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotReusePolicy:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;

    return-object v0
.end method

.method public final makeSureStateIsConsistent()V
    .locals 8

    .line 652
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 653
    .local v0, "childrenCount":I
    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->getSize()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v0, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    .local v1, "value$iv":Z
    :goto_0
    const/4 v4, 0x0

    .line 1120
    .local v4, "$i$f$requirePrecondition":I
    nop

    .line 1121
    if-nez v1, :cond_1

    .line 1122
    const/4 v5, 0x0

    .line 654
    .local v5, "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$makeSureStateIsConsistent$1":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Inconsistency between the count of nodes tracked by the state ("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 655
    iget-object v7, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->nodeToNodeState:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v7}, Landroidx/collection/MutableScatterMap;->getSize()I

    move-result v7

    .line 654
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 655
    nop

    .line 654
    const-string v7, ") and the children count on the SubcomposeLayout ("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 656
    nop

    .line 654
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 656
    nop

    .line 654
    const-string v7, "). Are you trying to use the state of the disposed SubcomposeLayout?"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 657
    nop

    .line 1122
    .end local v5    # "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$makeSureStateIsConsistent$1":I
    invoke-static {v6}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 1124
    :cond_1
    nop

    .line 659
    .end local v1    # "value$iv":Z
    .end local v4    # "$i$f$requirePrecondition":I
    iget v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    sub-int v1, v0, v1

    iget v4, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    sub-int/2addr v1, v4

    if-ltz v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    move v1, v3

    .restart local v1    # "value$iv":Z
    :goto_1
    const/4 v4, 0x0

    .line 1125
    .restart local v4    # "$i$f$requirePrecondition":I
    nop

    .line 1126
    if-nez v1, :cond_3

    .line 1127
    const/4 v5, 0x0

    .line 660
    .local v5, "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$makeSureStateIsConsistent$2":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Incorrect state. Total children "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ". Reusable children "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 661
    iget v7, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->reusableCount:I

    .line 660
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 661
    nop

    .line 660
    const-string v7, ". Precomposed children "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 661
    iget v7, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    .line 660
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 661
    nop

    .line 1127
    .end local v5    # "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$makeSureStateIsConsistent$2":I
    invoke-static {v6}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 1129
    :cond_3
    nop

    .line 663
    .end local v1    # "value$iv":Z
    .end local v4    # "$i$f$requirePrecondition":I
    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->getSize()I

    move-result v1

    iget v4, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    if-ne v1, v4, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    .local v2, "value$iv":Z
    :goto_2
    const/4 v1, 0x0

    .line 1130
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 1131
    if-nez v2, :cond_5

    .line 1132
    const/4 v3, 0x0

    .line 664
    .local v3, "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$makeSureStateIsConsistent$3":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Incorrect state. Precomposed children "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ". Map size "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 665
    iget-object v5, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v5}, Landroidx/collection/MutableScatterMap;->getSize()I

    move-result v5

    .line 664
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 665
    nop

    .line 1132
    .end local v3    # "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$makeSureStateIsConsistent$3":I
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 1134
    :cond_5
    nop

    .line 667
    .end local v1    # "$i$f$requirePrecondition":I
    .end local v2    # "value$iv":Z
    return-void
.end method

.method public onDeactivate()V
    .locals 1

    .line 446
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->markActiveNodesAsReused(Z)V

    .line 447
    return-void
.end method

.method public onRelease()V
    .locals 0

    .line 450
    invoke-direct {p0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->disposeCurrentNodes()V

    .line 451
    return-void
.end method

.method public onReuse()V
    .locals 1

    .line 442
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->markActiveNodesAsReused(Z)V

    .line 443
    return-void
.end method

.method public final precompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;
    .locals 9
    .param p1, "slotId"    # Ljava/lang/Object;
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;"
        }
    .end annotation

    .line 801
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->isAttached()Z

    move-result v0

    if-nez v0, :cond_0

    .line 802
    new-instance v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1;

    invoke-direct {v0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$1;-><init>()V

    check-cast v0, Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;

    return-object v0

    .line 806
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->makeSureStateIsConsistent()V

    .line 807
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotIdToNode:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 809
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->approachPrecomposeSlotHandleMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 811
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    .local v0, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v1, 0x0

    .line 1161
    .local v1, "$i$f$getOrPut":I
    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v2, 0x0

    .line 812
    .local v2, "$i$a$-getOrPut-LayoutNodeSubcompositionsState$precompose$node$1":I
    invoke-direct {p0, p1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->takeNodeFromReusables(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v3

    .line 813
    .local v3, "reusedNode":Landroidx/compose/ui/node/LayoutNode;
    nop

    .line 820
    iget-object v4, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    .line 813
    const/4 v5, 0x1

    if-eqz v3, :cond_1

    .line 815
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 816
    .local v4, "nodeIndex":I
    iget-object v6, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {p0, v4, v6, v5}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->move(III)V

    .line 817
    iget v6, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    add-int/2addr v6, v5

    iput v6, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    .line 818
    move-object v4, v3

    .end local v4    # "nodeIndex":I
    goto :goto_0

    .line 820
    :cond_1
    invoke-virtual {v4}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {p0, v4}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->createNodeAt(I)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v4

    move-object v6, v4

    .line 1135
    .local v6, "it":Landroidx/compose/ui/node/LayoutNode;
    const/4 v7, 0x0

    .line 820
    .local v7, "$i$a$-also-LayoutNodeSubcompositionsState$precompose$node$1$1":I
    iget v8, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    add-int/2addr v8, v5

    iput v8, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    .line 821
    .end local v6    # "it":Landroidx/compose/ui/node/LayoutNode;
    .end local v7    # "$i$a$-also-LayoutNodeSubcompositionsState$precompose$node$1$1":I
    :goto_0
    nop

    .line 1161
    .end local v2    # "$i$a$-getOrPut-LayoutNodeSubcompositionsState$precompose$node$1":I
    .end local v3    # "reusedNode":Landroidx/compose/ui/node/LayoutNode;
    move-object v2, v4

    .line 1162
    .local v2, "it$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1161
    .local v3, "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    invoke-virtual {v0, p1, v2}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 811
    .end local v0    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v1    # "$i$f$getOrPut":I
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v3    # "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    :cond_2
    check-cast v2, Landroidx/compose/ui/node/LayoutNode;

    .line 810
    nop

    .line 823
    .local v2, "node":Landroidx/compose/ui/node/LayoutNode;
    invoke-direct {p0, v2, p1, p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->subcompose(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 825
    .end local v2    # "node":Landroidx/compose/ui/node/LayoutNode;
    :cond_3
    new-instance v0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$2;

    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$precompose$2;-><init>(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;Ljava/lang/Object;)V

    check-cast v0, Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;

    return-object v0
.end method

.method public final setCompositionContext(Landroidx/compose/runtime/CompositionContext;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/runtime/CompositionContext;

    .line 398
    iput-object p1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->compositionContext:Landroidx/compose/runtime/CompositionContext;

    return-void
.end method

.method public final setSlotReusePolicy(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V
    .locals 7
    .param p1, "value"    # Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;

    .line 402
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotReusePolicy:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;

    if-eq v0, p1, :cond_0

    .line 403
    iput-object p1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotReusePolicy:Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;

    .line 405
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->markActiveNodesAsReused(Z)V

    .line 406
    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/node/LayoutNode;->requestRemeasure$ui_release$default(Landroidx/compose/ui/node/LayoutNode;ZZZILjava/lang/Object;)V

    .line 408
    :cond_0
    return-void
.end method

.method public final subcompose(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;
    .locals 12
    .param p1, "slotId"    # Ljava/lang/Object;
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;"
        }
    .end annotation

    .line 454
    invoke-virtual {p0}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->makeSureStateIsConsistent()V

    .line 455
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLayoutState$ui_release()Landroidx/compose/ui/node/LayoutNode$LayoutState;

    move-result-object v0

    .line 457
    .local v0, "layoutState":Landroidx/compose/ui/node/LayoutNode$LayoutState;
    sget-object v1, Landroidx/compose/ui/node/LayoutNode$LayoutState;->Measuring:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_1

    .line 458
    sget-object v1, Landroidx/compose/ui/node/LayoutNode$LayoutState;->LayingOut:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    if-eq v0, v1, :cond_1

    .line 459
    sget-object v1, Landroidx/compose/ui/node/LayoutNode$LayoutState;->LookaheadMeasuring:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    if-eq v0, v1, :cond_1

    .line 460
    sget-object v1, Landroidx/compose/ui/node/LayoutNode$LayoutState;->LookaheadLayingOut:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v3

    .line 456
    :goto_1
    nop

    .local v1, "value$iv":Z
    const/4 v4, 0x0

    .line 1041
    .local v4, "$i$f$checkPrecondition":I
    nop

    .line 1042
    if-nez v1, :cond_2

    .line 1043
    const/4 v5, 0x0

    .line 462
    .local v5, "$i$a$-checkPrecondition-LayoutNodeSubcompositionsState$subcompose$1":I
    nop

    .line 1043
    .end local v5    # "$i$a$-checkPrecondition-LayoutNodeSubcompositionsState$subcompose$1":I
    const-string/jumbo v5, "subcompose can only be used inside the measure or layout blocks"

    invoke-static {v5}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1045
    :cond_2
    nop

    .line 466
    .end local v1    # "value$iv":Z
    .end local v4    # "$i$f$checkPrecondition":I
    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->slotIdToNode:Landroidx/collection/MutableScatterMap;

    .local v1, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v4, 0x0

    .line 1046
    .local v4, "$i$f$getOrPut":I
    invoke-virtual {v1, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_7

    const/4 v5, 0x0

    .line 467
    .local v5, "$i$a$-getOrPut-LayoutNodeSubcompositionsState$subcompose$node$1":I
    iget-object v6, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposeMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v6, p1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/node/LayoutNode;

    .line 468
    .local v6, "precomposed":Landroidx/compose/ui/node/LayoutNode;
    if-eqz v6, :cond_5

    .line 469
    iget v7, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    if-lez v7, :cond_3

    move v7, v3

    goto :goto_2

    :cond_3
    move v7, v2

    .local v7, "value$iv":Z
    :goto_2
    const/4 v8, 0x0

    .line 1047
    .local v8, "$i$f$checkPrecondition":I
    nop

    .line 1048
    if-nez v7, :cond_4

    .line 1049
    const-string v9, "Check failed."

    invoke-static {v9}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1051
    :cond_4
    nop

    .line 470
    .end local v7    # "value$iv":Z
    .end local v8    # "$i$f$checkPrecondition":I
    iget v7, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    add-int/lit8 v7, v7, -0x1

    iput v7, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->precomposedCount:I

    .line 471
    move-object v7, v6

    goto :goto_3

    .line 473
    :cond_5
    invoke-direct {p0, p1}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->takeNodeFromReusables(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v7

    if-nez v7, :cond_6

    iget v7, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentIndex:I

    invoke-direct {p0, v7}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->createNodeAt(I)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v7

    .line 474
    :cond_6
    :goto_3
    nop

    .line 1046
    .end local v5    # "$i$a$-getOrPut-LayoutNodeSubcompositionsState$subcompose$node$1":I
    .end local v6    # "precomposed":Landroidx/compose/ui/node/LayoutNode;
    move-object v5, v7

    .line 1052
    .local v5, "it$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1046
    .local v6, "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    invoke-virtual {v1, p1, v5}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 466
    .end local v1    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v4    # "$i$f$getOrPut":I
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-also-MutableScatterMap$getOrPut$1$iv":I
    :cond_7
    check-cast v5, Landroidx/compose/ui/node/LayoutNode;

    .line 465
    nop

    .line 477
    .local v5, "node":Landroidx/compose/ui/node/LayoutNode;
    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v1

    iget v4, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentIndex:I

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v5, :cond_a

    .line 479
    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->root:Landroidx/compose/ui/node/LayoutNode;

    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getFoldedChildren$ui_release()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    .line 480
    .local v7, "itemIndex":I
    iget v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentIndex:I

    if-lt v7, v1, :cond_8

    move v2, v3

    .local v2, "value$iv":Z
    :cond_8
    const/4 v1, 0x0

    .line 1053
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 1054
    if-nez v2, :cond_9

    .line 1055
    const/4 v4, 0x0

    .line 481
    .local v4, "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$subcompose$2":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Key \""

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 482
    nop

    .line 1055
    .end local v4    # "$i$a$-requirePrecondition-LayoutNodeSubcompositionsState$subcompose$2":I
    invoke-static {v6}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 1057
    :cond_9
    nop

    .line 484
    .end local v1    # "$i$f$requirePrecondition":I
    .end local v2    # "value$iv":Z
    iget v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentIndex:I

    if-eq v1, v7, :cond_a

    .line 485
    iget v8, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentIndex:I

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, p0

    invoke-static/range {v6 .. v11}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->move$default(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;IIIILjava/lang/Object;)V

    .line 488
    .end local v7    # "itemIndex":I
    :cond_a
    iget v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentIndex:I

    add-int/2addr v1, v3

    iput v1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->currentIndex:I

    .line 490
    invoke-direct {p0, v5, p1, p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;->subcompose(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 492
    sget-object v1, Landroidx/compose/ui/node/LayoutNode$LayoutState;->Measuring:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    if-eq v0, v1, :cond_c

    sget-object v1, Landroidx/compose/ui/node/LayoutNode$LayoutState;->LayingOut:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    if-ne v0, v1, :cond_b

    goto :goto_4

    .line 495
    :cond_b
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getChildLookaheadMeasurables$ui_release()Ljava/util/List;

    move-result-object v1

    goto :goto_5

    .line 493
    :cond_c
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getChildMeasurables$ui_release()Ljava/util/List;

    move-result-object v1

    .line 492
    :goto_5
    return-object v1
.end method
