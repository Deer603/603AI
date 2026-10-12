.class public final Landroidx/compose/animation/SharedTransitionScopeImpl;
.super Ljava/lang/Object;
.source "SharedTransitionScope.kt"

# interfaces
.implements Landroidx/compose/animation/SharedTransitionScope;
.implements Landroidx/compose/ui/layout/LookaheadScope;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;,
        Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1221:1\n85#2:1222\n113#2,2:1223\n1247#3,6:1225\n1247#3,6:1308\n385#4:1231\n357#4,4:1232\n329#4,6:1236\n339#4,3:1243\n342#4,9:1247\n361#4:1256\n386#4:1257\n357#4,4:1258\n329#4,6:1262\n339#4,3:1269\n342#4,9:1273\n361#4:1282\n357#4,4:1283\n329#4,6:1287\n339#4,3:1294\n342#4,9:1298\n361#4:1307\n1399#5:1242\n1270#5:1246\n1399#5:1268\n1270#5:1272\n1399#5:1293\n1270#5:1297\n1#6:1314\n1002#7,2:1315\n350#7,7:1323\n34#8,6:1317\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n673#1:1222\n673#1:1223,2\n875#1:1225,6\n992#1:1308,6\n887#1:1231\n887#1:1232,4\n887#1:1236,6\n887#1:1243,3\n887#1:1247,9\n887#1:1256\n887#1:1257\n891#1:1258,4\n891#1:1262,6\n891#1:1269,3\n891#1:1273,9\n891#1:1282\n894#1:1283,4\n894#1:1287,6\n894#1:1294,3\n894#1:1298,9\n894#1:1307\n887#1:1242\n887#1:1246\n891#1:1268\n891#1:1272\n894#1:1293\n894#1:1297\n1040#1:1315,2\n1070#1:1323,7\n1045#1:1317,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u0002:\u0004\u0083\u0001\u0084\u0001B\u0017\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u0015\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020*H\u0000\u00a2\u0006\u0002\u00088J\u0015\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020:H\u0000\u00a2\u0006\u0002\u0008;J\u0008\u0010<\u001a\u00020\u001dH\u0002J7\u0010=\u001a\u00020\u001d2\u0006\u00107\u001a\u00020+2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001d0-2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000\u00a2\u0006\u0002\u0008@J\r\u0010A\u001a\u00020\u001dH\u0000\u00a2\u0006\u0002\u0008BJ\u0015\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020$H\u0000\u00a2\u0006\u0002\u0008EJ\u0015\u0010F\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020$H\u0000\u00a2\u0006\u0002\u0008GJ\u0015\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020JH\u0000\u00a2\u0006\u0002\u0008KJ\u0015\u0010L\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020JH\u0000\u00a2\u0006\u0002\u0008MJ\u0015\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020*H\u0017\u00a2\u0006\u0002\u0010QJM\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020+2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020O2\u0006\u0010Z\u001a\u0002032\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\nH\u0003\u00a2\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020+2\u0006\u0010P\u001a\u00020*H\u0002J\u0008\u0010,\u001a\u00020\u001dH\u0002J3\u0010`\u001a\u00020a*\u00020\u00142\u0006\u0010b\u001a\u00020\u00142\u0008\u0008\u0002\u0010c\u001a\u00020a2\u0008\u0008\u0002\u0010d\u001a\u00020\nH\u0096\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008e\u0010fJ>\u0010g\u001a\u00020h*\u00020h2\u000c\u0010i\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001c2\u0006\u0010[\u001a\u00020\\2\u001a\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020l\u0012\u0006\u0012\u0004\u0018\u00010m0jH\u0016J\\\u0010n\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\u0006\u0010V\u001a\u00020W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0016Jp\u0010y\u001a\u00020h\"\u0004\u0008\u0000\u0010z*\u00020h2\u0006\u0010Y\u001a\u00020O2\u000e\u0010{\u001a\n\u0012\u0004\u0012\u0002Hz\u0018\u00010|2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u0002Hz\u0012\u0004\u0012\u00020\n0-2\u0006\u0010u\u001a\u00020v2\u0008\u0008\u0002\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0002JS\u0010~\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010}\u001a\u00020\n2\u0008\u0008\u0002\u0010u\u001a\u00020v2\u0008\u0008\u0002\u0010V\u001a\u00020W2\u0008\u0008\u0002\u0010]\u001a\u00020\n2\u0008\u0008\u0002\u0010[\u001a\u00020\\2\u0008\u0008\u0002\u0010Z\u001a\u000203H\u0000\u00a2\u0006\u0002\u0008\u007fJD\u0010S\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010o\u001a\u00020p2\u0006\u0010u\u001a\u00020v2\u0006\u0010V\u001a\u00020W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0016JE\u0010\u0080\u0001\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010}\u001a\u00020\n2\u0006\u0010u\u001a\u00020v2\u0006\u0010V\u001a\u00020W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0016J\r\u0010\u0081\u0001\u001a\u00020h*\u00020hH\u0016J\u000e\u0010\u0082\u0001\u001a\u00020\u0014*\u00020\u0014H\u0096\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0080\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR+\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@RX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000e\u0010\r\"\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00148@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016\"\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0014\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0014X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u0016\"\u0004\u0008\'\u0010\u001aR\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001d0-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010.\u001a\u00020\u0014*\u00020/X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u00080\u00101\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0085\u0001"
    }
    d2 = {
        "Landroidx/compose/animation/SharedTransitionScopeImpl;",
        "Landroidx/compose/animation/SharedTransitionScope;",
        "Landroidx/compose/ui/layout/LookaheadScope;",
        "lookaheadScope",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "(Landroidx/compose/ui/layout/LookaheadScope;Lkotlinx/coroutines/CoroutineScope;)V",
        "getCoroutineScope",
        "()Lkotlinx/coroutines/CoroutineScope;",
        "<set-?>",
        "",
        "disposed",
        "getDisposed$animation_release",
        "()Z",
        "isTransitionActive",
        "setTransitionActive",
        "(Z)V",
        "isTransitionActive$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "lookaheadRoot",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "getLookaheadRoot$animation_release",
        "()Landroidx/compose/ui/layout/LayoutCoordinates;",
        "nullableLookaheadRoot",
        "getNullableLookaheadRoot$animation_release",
        "setNullableLookaheadRoot$animation_release",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;)V",
        "observeAnimatingBlock",
        "Lkotlin/Function0;",
        "",
        "observerForTest",
        "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;",
        "getObserverForTest$animation_release",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;",
        "renderers",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "Landroidx/compose/animation/LayerRenderer;",
        "root",
        "getRoot$animation_release",
        "setRoot$animation_release",
        "sharedElements",
        "Landroidx/collection/MutableScatterMap;",
        "",
        "Landroidx/compose/animation/SharedElement;",
        "updateTransitionActiveness",
        "Lkotlin/Function1;",
        "lookaheadScopeCoordinates",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "getLookaheadScopeCoordinates",
        "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;",
        "OverlayClip",
        "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;",
        "clipShape",
        "Landroidx/compose/ui/graphics/Shape;",
        "clearObservation",
        "scope",
        "clearObservation$animation_release",
        "drawInOverlay",
        "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;",
        "drawInOverlay$animation_release",
        "observeIsAnimating",
        "observeReads",
        "onValueChangedForScope",
        "block",
        "observeReads$animation_release",
        "onDispose",
        "onDispose$animation_release",
        "onLayerRendererCreated",
        "renderer",
        "onLayerRendererCreated$animation_release",
        "onLayerRendererRemoved",
        "onLayerRendererRemoved$animation_release",
        "onStateAdded",
        "sharedElementState",
        "Landroidx/compose/animation/SharedElementInternalState;",
        "onStateAdded$animation_release",
        "onStateRemoved",
        "onStateRemoved$animation_release",
        "rememberSharedContentState",
        "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;",
        "key",
        "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;",
        "rememberSharedElementState",
        "sharedElement",
        "boundsAnimation",
        "Landroidx/compose/animation/BoundsAnimation;",
        "placeHolderSize",
        "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;",
        "renderOnlyWhenVisible",
        "sharedContentState",
        "clipInOverlayDuringTransition",
        "zIndexInOverlay",
        "",
        "renderInOverlayDuringTransition",
        "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;",
        "sharedElementsFor",
        "localLookaheadPositionOf",
        "Landroidx/compose/ui/geometry/Offset;",
        "sourceCoordinates",
        "relativeToSource",
        "includeMotionFrameOfReference",
        "localLookaheadPositionOf-au-aQtc",
        "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J",
        "renderInSharedTransitionScopeOverlay",
        "Landroidx/compose/ui/Modifier;",
        "renderInOverlay",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "Landroidx/compose/ui/unit/Density;",
        "Landroidx/compose/ui/graphics/Path;",
        "sharedBounds",
        "animatedVisibilityScope",
        "Landroidx/compose/animation/AnimatedVisibilityScope;",
        "enter",
        "Landroidx/compose/animation/EnterTransition;",
        "exit",
        "Landroidx/compose/animation/ExitTransition;",
        "boundsTransform",
        "Landroidx/compose/animation/BoundsTransform;",
        "resizeMode",
        "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;",
        "sharedBoundsImpl",
        "T",
        "parentTransition",
        "Landroidx/compose/animation/core/Transition;",
        "visible",
        "sharedBoundsWithCallerManagedVisibility",
        "sharedBoundsWithCallerManagedVisibility$animation_release",
        "sharedElementWithCallerManagedVisibility",
        "skipToLookaheadSize",
        "toLookaheadCoordinates",
        "Companion",
        "ShapeBasedClip",
        "animation_release"
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

.field public static final Companion:Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;

.field private static final SharedTransitionObserver$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/ui/layout/LookaheadScope;

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private disposed:Z

.field private final isTransitionActive$delegate:Landroidx/compose/runtime/MutableState;

.field private nullableLookaheadRoot:Landroidx/compose/ui/layout/LayoutCoordinates;

.field private final observeAnimatingBlock:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Landroidx/compose/animation/LayerRenderer;",
            ">;"
        }
    .end annotation
.end field

.field public root:Landroidx/compose/ui/layout/LayoutCoordinates;

.field private final sharedElements:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Landroidx/compose/animation/SharedElement;",
            ">;"
        }
    .end annotation
.end field

.field private final updateTransitionActiveness:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/SharedTransitionScope;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->Companion:Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;

    .line 667
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2;->INSTANCE:Landroidx/compose/animation/SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2;

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->SharedTransitionObserver$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/layout/LookaheadScope;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 4
    .param p1, "lookaheadScope"    # Landroidx/compose/ui/layout/LookaheadScope;
    .param p2, "coroutineScope"    # Lkotlinx/coroutines/CoroutineScope;

    .line 660
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 663
    iput-object p2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 664
    iput-object p1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->$$delegate_0:Landroidx/compose/ui/layout/LookaheadScope;

    .line 673
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->isTransitionActive$delegate:Landroidx/compose/runtime/MutableState;

    .line 878
    new-instance v1, Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;

    invoke-direct {v1, p0}, Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;-><init>(Landroidx/compose/animation/SharedTransitionScopeImpl;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    iput-object v1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->observeAnimatingBlock:Lkotlin/jvm/functions/Function0;

    .line 882
    new-instance v1, Landroidx/compose/animation/SharedTransitionScopeImpl$updateTransitionActiveness$1;

    invoke-direct {v1, p0}, Landroidx/compose/animation/SharedTransitionScopeImpl$updateTransitionActiveness$1;-><init>(Landroidx/compose/animation/SharedTransitionScopeImpl;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iput-object v1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->updateTransitionActiveness:Lkotlin/jvm/functions/Function1;

    .line 1030
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 1032
    new-instance v1, Landroidx/collection/MutableScatterMap;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2, v3}, Landroidx/collection/MutableScatterMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedElements:Landroidx/collection/MutableScatterMap;

    .line 663
    return-void
.end method

.method public static final synthetic access$getSharedElements$p(Landroidx/compose/animation/SharedTransitionScopeImpl;)Landroidx/collection/MutableScatterMap;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/SharedTransitionScopeImpl;

    .line 660
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedElements:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method

.method public static final synthetic access$getSharedTransitionObserver$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 660
    sget-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->SharedTransitionObserver$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static final synthetic access$rememberSharedElementState(Landroidx/compose/animation/SharedTransitionScopeImpl;Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/SharedTransitionScopeImpl;
    .param p1, "sharedElement"    # Landroidx/compose/animation/SharedElement;
    .param p2, "boundsAnimation"    # Landroidx/compose/animation/BoundsAnimation;
    .param p3, "placeHolderSize"    # Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;
    .param p4, "renderOnlyWhenVisible"    # Z
    .param p5, "sharedContentState"    # Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
    .param p6, "clipInOverlayDuringTransition"    # Landroidx/compose/animation/SharedTransitionScope$OverlayClip;
    .param p7, "zIndexInOverlay"    # F
    .param p8, "renderInOverlayDuringTransition"    # Z
    .param p9, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p10, "$changed"    # I

    .line 660
    invoke-direct/range {p0 .. p10}, Landroidx/compose/animation/SharedTransitionScopeImpl;->rememberSharedElementState(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$sharedElementsFor(Landroidx/compose/animation/SharedTransitionScopeImpl;Ljava/lang/Object;)Landroidx/compose/animation/SharedElement;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/SharedTransitionScopeImpl;
    .param p1, "key"    # Ljava/lang/Object;

    .line 660
    invoke-direct {p0, p1}, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedElementsFor(Ljava/lang/Object;)Landroidx/compose/animation/SharedElement;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$updateTransitionActiveness(Landroidx/compose/animation/SharedTransitionScopeImpl;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/animation/SharedTransitionScopeImpl;

    .line 660
    invoke-direct {p0}, Landroidx/compose/animation/SharedTransitionScopeImpl;->updateTransitionActiveness()V

    return-void
.end method

.method private final observeIsAnimating()V
    .locals 3

    .line 1100
    iget-boolean v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->disposed:Z

    if-nez v0, :cond_0

    .line 1101
    sget-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->Companion:Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;

    invoke-static {v0}, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;->access$getSharedTransitionObserver(Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    move-result-object v0

    .line 1102
    nop

    .line 1103
    iget-object v1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->updateTransitionActiveness:Lkotlin/jvm/functions/Function1;

    .line 1104
    iget-object v2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->observeAnimatingBlock:Lkotlin/jvm/functions/Function0;

    .line 1101
    invoke-virtual {v0, p0, v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->observeReads(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 1107
    :cond_0
    return-void
.end method

.method private final rememberSharedElementState(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;
    .locals 17
    .param p1, "sharedElement"    # Landroidx/compose/animation/SharedElement;
    .param p2, "boundsAnimation"    # Landroidx/compose/animation/BoundsAnimation;
    .param p3, "placeHolderSize"    # Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;
    .param p4, "renderOnlyWhenVisible"    # Z
    .param p5, "sharedContentState"    # Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
    .param p6, "clipInOverlayDuringTransition"    # Landroidx/compose/animation/SharedTransitionScope$OverlayClip;
    .param p7, "zIndexInOverlay"    # F
    .param p8, "renderInOverlayDuringTransition"    # Z
    .param p9, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p10, "$changed"    # I

    .line 992
    move-object/from16 v9, p9

    const v0, 0x7b307374

    const-string v1, "C(rememberSharedElementState)P(6!1,2,4,5!1,7)*991@54957L511:SharedTransitionScope.kt#xbi5r1"

    invoke-static {v9, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:991)"

    move/from16 v10, p10

    invoke-static {v0, v10, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v10, p10

    :goto_0
    const v0, -0x2788605b

    const-string v1, "CC(remember):SharedTransitionScope.kt#9igjgp"

    invoke-static {v9, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v11, 0x0

    .local v11, "invalid$iv":Z
    move-object/from16 v12, p9

    .local v12, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 1308
    .local v13, "$i$f$cache":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 1309
    .local v15, "$i$a$-let-ComposerKt$cache$1$iv":I
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v14, v0, :cond_1

    .line 1310
    const/16 v16, 0x0

    .line 993
    .local v16, "$i$a$-cache-SharedTransitionScopeImpl$rememberSharedElementState$1":I
    new-instance v0, Landroidx/compose/animation/SharedElementInternalState;

    .line 994
    nop

    .line 995
    nop

    .line 996
    nop

    .line 997
    nop

    .line 999
    nop

    .line 1001
    nop

    .line 998
    nop

    .line 1000
    nop

    .line 993
    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v7, p5

    move-object/from16 v5, p6

    move/from16 v8, p7

    move/from16 v6, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/SharedElementInternalState;-><init>(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;F)V

    .line 1002
    nop

    .line 1310
    .end local v16    # "$i$a$-cache-SharedTransitionScopeImpl$rememberSharedElementState$1":I
    nop

    .line 1311
    .local v0, "value$iv":Ljava/lang/Object;
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1312
    move-object v14, v0

    .end local v0    # "value$iv":Ljava/lang/Object;
    goto :goto_1

    .line 1313
    :cond_1
    move-object/from16 v7, p5

    .line 1308
    .end local v14    # "it$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-ComposerKt$cache$1$iv":I
    :goto_1
    nop

    .line 992
    .end local v11    # "invalid$iv":Z
    .end local v12    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache":I
    check-cast v14, Landroidx/compose/animation/SharedElementInternalState;

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1004
    move-object v0, v14

    .local v0, "it":Landroidx/compose/animation/SharedElementInternalState;
    const/4 v1, 0x0

    .line 1005
    .local v1, "$i$a$-also-SharedTransitionScopeImpl$rememberSharedElementState$2":I
    invoke-virtual {v7, v0}, Landroidx/compose/animation/SharedTransitionScope$SharedContentState;->setInternalState$animation_release(Landroidx/compose/animation/SharedElementInternalState;)V

    .line 1007
    move-object/from16 v2, p1

    invoke-virtual {v0, v2}, Landroidx/compose/animation/SharedElementInternalState;->setSharedElement(Landroidx/compose/animation/SharedElement;)V

    .line 1008
    move/from16 v4, p4

    invoke-virtual {v0, v4}, Landroidx/compose/animation/SharedElementInternalState;->setRenderOnlyWhenVisible(Z)V

    .line 1009
    move-object/from16 v3, p2

    invoke-virtual {v0, v3}, Landroidx/compose/animation/SharedElementInternalState;->setBoundsAnimation(Landroidx/compose/animation/BoundsAnimation;)V

    .line 1010
    move-object/from16 v5, p3

    invoke-virtual {v0, v5}, Landroidx/compose/animation/SharedElementInternalState;->setPlaceHolderSize(Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;)V

    .line 1011
    move-object/from16 v6, p6

    invoke-virtual {v0, v6}, Landroidx/compose/animation/SharedElementInternalState;->setOverlayClip(Landroidx/compose/animation/SharedTransitionScope$OverlayClip;)V

    .line 1012
    move/from16 v8, p7

    invoke-virtual {v0, v8}, Landroidx/compose/animation/SharedElementInternalState;->setZIndex(F)V

    .line 1013
    move/from16 v11, p8

    invoke-virtual {v0, v11}, Landroidx/compose/animation/SharedElementInternalState;->setRenderInOverlayDuringTransition(Z)V

    .line 1014
    invoke-virtual {v0, v7}, Landroidx/compose/animation/SharedElementInternalState;->setUserState(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;)V

    .line 1015
    nop

    .line 1004
    .end local v0    # "it":Landroidx/compose/animation/SharedElementInternalState;
    .end local v1    # "$i$a$-also-SharedTransitionScopeImpl$rememberSharedElementState$2":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 992
    :cond_2
    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 1004
    return-object v14
.end method

.method private setTransitionActive(Z)V
    .locals 4
    .param p1, "<set-?>"    # Z

    .line 673
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->isTransitionActive$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 1223
    .local v3, "$i$f$setValue":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 1224
    nop

    .line 673
    .end local v0    # "$this$setValue$iv":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "value$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$setValue":I
    return-void
.end method

.method private final sharedBoundsImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;
    .locals 11
    .param p1, "$this$sharedBoundsImpl"    # Landroidx/compose/ui/Modifier;
    .param p2, "sharedContentState"    # Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
    .param p3, "parentTransition"    # Landroidx/compose/animation/core/Transition;
    .param p4, "visible"    # Lkotlin/jvm/functions/Function1;
    .param p5, "boundsTransform"    # Landroidx/compose/animation/BoundsTransform;
    .param p6, "placeHolderSize"    # Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;
    .param p7, "renderOnlyWhenVisible"    # Z
    .param p8, "renderInOverlayDuringTransition"    # Z
    .param p9, "zIndexInOverlay"    # F
    .param p10, "clipInOverlayDuringTransition"    # Landroidx/compose/animation/SharedTransitionScope$OverlayClip;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/animation/BoundsTransform;",
            "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;",
            "ZZF",
            "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 915
    new-instance v0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;

    move-object v4, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object/from16 v10, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move/from16 v9, p8

    move/from16 v8, p9

    move-object/from16 v7, p10

    invoke-direct/range {v0 .. v10}, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;-><init>(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/SharedTransitionScopeImpl;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/animation/BoundsTransform;)V

    check-cast v0, Lkotlin/jvm/functions/Function3;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Landroidx/compose/ui/ComposedModifierKt;->composed$default(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 979
    return-object v0
.end method

.method static synthetic sharedBoundsImpl$default(Landroidx/compose/animation/SharedTransitionScopeImpl;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 12

    .line 905
    and-int/lit8 v0, p11, 0x10

    if-eqz v0, :cond_0

    .line 910
    sget-object v0, Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;->Companion:Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;

    invoke-virtual {v0}, Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;->getContentSize()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    .line 905
    :cond_0
    move-object/from16 v7, p6

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedBoundsImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic sharedBoundsWithCallerManagedVisibility$animation_release$default(Landroidx/compose/animation/SharedTransitionScopeImpl;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;ZLandroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 9

    .line 850
    and-int/lit8 v0, p9, 0x4

    if-eqz v0, :cond_0

    .line 853
    invoke-static {}, Landroidx/compose/animation/SharedTransitionScopeKt;->access$getDefaultBoundsTransform$p()Landroidx/compose/animation/BoundsTransform;

    move-result-object p4

    move-object v4, p4

    goto :goto_0

    .line 850
    :cond_0
    move-object v4, p4

    :goto_0
    and-int/lit8 p4, p9, 0x8

    if-eqz p4, :cond_1

    .line 854
    sget-object p4, Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;->Companion:Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;

    invoke-virtual {p4}, Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;->getContentSize()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;

    move-result-object p5

    move-object v5, p5

    goto :goto_1

    .line 850
    :cond_1
    move-object v5, p5

    :goto_1
    and-int/lit8 p4, p9, 0x10

    if-eqz p4, :cond_2

    .line 855
    const/4 p4, 0x1

    move v6, p4

    goto :goto_2

    .line 850
    :cond_2
    move v6, p6

    :goto_2
    and-int/lit8 p4, p9, 0x20

    if-eqz p4, :cond_3

    .line 856
    const/4 p4, 0x0

    move v7, p4

    goto :goto_3

    .line 850
    :cond_3
    move/from16 v7, p7

    :goto_3
    and-int/lit8 p4, p9, 0x40

    if-eqz p4, :cond_4

    .line 857
    invoke-static {}, Landroidx/compose/animation/SharedTransitionScopeKt;->access$getParentClip$p()Landroidx/compose/animation/SharedTransitionScope$OverlayClip;

    move-result-object p4

    move-object v8, p4

    goto :goto_4

    .line 850
    :cond_4
    move-object/from16 v8, p8

    :goto_4
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v8}, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedBoundsWithCallerManagedVisibility$animation_release(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;ZLandroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private final sharedElementsFor(Ljava/lang/Object;)Landroidx/compose/animation/SharedElement;
    .locals 4
    .param p1, "key"    # Ljava/lang/Object;

    .line 1035
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedElements:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/animation/SharedElement;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/compose/animation/SharedElement;

    invoke-direct {v0, p1, p0}, Landroidx/compose/animation/SharedElement;-><init>(Ljava/lang/Object;Landroidx/compose/animation/SharedTransitionScopeImpl;)V

    move-object v1, v0

    .line 1314
    .local v1, "it":Landroidx/compose/animation/SharedElement;
    const/4 v2, 0x0

    .line 1035
    .local v2, "$i$a$-also-SharedTransitionScopeImpl$sharedElementsFor$1":I
    iget-object v3, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedElements:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v3, p1, v1}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .end local v1    # "it":Landroidx/compose/animation/SharedElement;
    .end local v2    # "$i$a$-also-SharedTransitionScopeImpl$sharedElementsFor$1":I
    :cond_0
    return-object v0
.end method

.method private final updateTransitionActiveness()V
    .locals 33

    .line 887
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedElements:Landroidx/collection/MutableScatterMap;

    check-cast v1, Landroidx/collection/ScatterMap;

    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v2, 0x0

    .line 1231
    .local v2, "$i$f$any":I
    move-object v3, v1

    .local v3, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v4, 0x0

    .line 1232
    .local v4, "$i$f$forEach":I
    iget-object v5, v3, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 1233
    .local v5, "k$iv$iv":[Ljava/lang/Object;
    iget-object v6, v3, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 1235
    .local v6, "v$iv$iv":[Ljava/lang/Object;
    move-object v7, v3

    .local v7, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v8, 0x0

    .line 1236
    .local v8, "$i$f$forEachIndexed":I
    iget-object v9, v7, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1237
    .local v9, "m$iv$iv$iv":[J
    array-length v10, v9

    add-int/lit8 v10, v10, -0x2

    .line 1239
    .local v10, "lastIndex$iv$iv$iv":I
    const/4 v11, 0x0

    .local v11, "i$iv$iv$iv":I
    const/4 v15, 0x7

    const/16 v16, 0x0

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const-wide/16 v19, 0x80

    const/16 v12, 0x8

    if-gt v11, v10, :cond_5

    .line 1240
    :goto_0
    aget-wide v21, v9, v11

    .line 1241
    .local v21, "slot$iv$iv$iv":J
    move-wide/from16 v23, v21

    .local v23, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v25, 0x0

    .line 1242
    .local v25, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v13, v23

    const-wide/16 v26, 0xff

    move-object/from16 v23, v1

    move/from16 v24, v2

    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$any":I
    .local v13, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v23, "this_$iv":Landroidx/collection/ScatterMap;
    .local v24, "$i$f$any":I
    not-long v1, v13

    shl-long/2addr v1, v15

    and-long/2addr v1, v13

    and-long v1, v1, v17

    .line 1241
    .end local v13    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v25    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v1, v1, v17

    if-eqz v1, :cond_4

    .line 1243
    sub-int v1, v11, v10

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    rsub-int/lit8 v1, v1, 0x8

    .line 1244
    .local v1, "bitCount$iv$iv$iv":I
    const/4 v2, 0x0

    .local v2, "j$iv$iv$iv":I
    :goto_1
    if-ge v2, v1, :cond_3

    .line 1245
    and-long v13, v21, v26

    .local v13, "value$iv$iv$iv$iv":J
    const/16 v25, 0x0

    .line 1246
    .local v25, "$i$f$isFull":I
    cmp-long v28, v13, v19

    if-gez v28, :cond_0

    const/4 v13, 0x1

    goto :goto_2

    :cond_0
    move/from16 v13, v16

    .line 1245
    .end local v13    # "value$iv$iv$iv$iv":J
    .end local v25    # "$i$f$isFull":I
    :goto_2
    if-eqz v13, :cond_2

    .line 1247
    shl-int/lit8 v13, v11, 0x3

    add-int/2addr v13, v2

    .line 1248
    .local v13, "index$iv$iv$iv":I
    move v14, v13

    .local v14, "index$iv$iv":I
    const/16 v25, 0x0

    .line 1235
    .local v25, "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv$iv":I
    aget-object v28, v5, v14

    .local v28, "key$iv":Ljava/lang/Object;
    aget-object v29, v6, v14

    .local v29, "value$iv":Ljava/lang/Object;
    const/16 v30, 0x0

    .line 1231
    .local v30, "$i$a$-forEach-ScatterMap$any$1$iv":I
    move-object/from16 v31, v29

    check-cast v31, Landroidx/compose/animation/SharedElement;

    .local v31, "element":Landroidx/compose/animation/SharedElement;
    const/16 v32, 0x0

    .line 887
    .local v32, "$i$a$-any-SharedTransitionScopeImpl$updateTransitionActiveness$isActive$1":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/animation/SharedElement;->isAnimating()Z

    move-result v31

    .line 1231
    .end local v31    # "element":Landroidx/compose/animation/SharedElement;
    .end local v32    # "$i$a$-any-SharedTransitionScopeImpl$updateTransitionActiveness$isActive$1":I
    if-eqz v31, :cond_1

    const/4 v1, 0x1

    goto :goto_3

    .line 1235
    .end local v28    # "key$iv":Ljava/lang/Object;
    .end local v29    # "value$iv":Ljava/lang/Object;
    .end local v30    # "$i$a$-forEach-ScatterMap$any$1$iv":I
    :cond_1
    nop

    .line 1248
    .end local v14    # "index$iv$iv":I
    .end local v25    # "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv$iv":I
    nop

    .line 1250
    .end local v13    # "index$iv$iv$iv":I
    :cond_2
    shr-long v21, v21, v12

    .line 1244
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1252
    .end local v2    # "j$iv$iv$iv":I
    :cond_3
    if-ne v1, v12, :cond_7

    .line 1239
    .end local v1    # "bitCount$iv$iv$iv":I
    .end local v21    # "slot$iv$iv$iv":J
    :cond_4
    if-eq v11, v10, :cond_6

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, v23

    move/from16 v2, v24

    goto :goto_0

    .end local v23    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v24    # "$i$f$any":I
    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    .local v2, "$i$f$any":I
    :cond_5
    move-object/from16 v23, v1

    move/from16 v24, v2

    const-wide/16 v26, 0xff

    .line 1255
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$any":I
    .end local v11    # "i$iv$iv$iv":I
    .restart local v23    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v24    # "$i$f$any":I
    :cond_6
    nop

    .line 1256
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v8    # "$i$f$forEachIndexed":I
    .end local v9    # "m$iv$iv$iv":[J
    .end local v10    # "lastIndex$iv$iv$iv":I
    :cond_7
    nop

    .line 1257
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v4    # "$i$f$forEach":I
    .end local v5    # "k$iv$iv":[Ljava/lang/Object;
    .end local v6    # "v$iv$iv":[Ljava/lang/Object;
    move/from16 v1, v16

    .line 887
    .end local v23    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v24    # "$i$f$any":I
    :goto_3
    nop

    .line 888
    .local v1, "isActive":Z
    invoke-virtual {v0}, Landroidx/compose/animation/SharedTransitionScopeImpl;->isTransitionActive()Z

    move-result v2

    if-eq v1, v2, :cond_10

    .line 889
    invoke-direct {v0, v1}, Landroidx/compose/animation/SharedTransitionScopeImpl;->setTransitionActive(Z)V

    .line 890
    if-nez v1, :cond_f

    .line 891
    iget-object v2, v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedElements:Landroidx/collection/MutableScatterMap;

    check-cast v2, Landroidx/collection/ScatterMap;

    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v3, 0x0

    .line 1258
    .local v3, "$i$f$forEach":I
    iget-object v4, v2, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 1259
    .local v4, "k$iv":[Ljava/lang/Object;
    iget-object v5, v2, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 1261
    .local v5, "v$iv":[Ljava/lang/Object;
    move-object v6, v2

    .local v6, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v7, 0x0

    .line 1262
    .local v7, "$i$f$forEachIndexed":I
    iget-object v8, v6, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1263
    .local v8, "m$iv$iv":[J
    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    .line 1265
    .local v9, "lastIndex$iv$iv":I
    const/4 v10, 0x0

    .local v10, "i$iv$iv":I
    if-gt v10, v9, :cond_c

    .line 1266
    :goto_4
    aget-wide v13, v8, v10

    .line 1267
    .local v13, "slot$iv$iv":J
    move-wide/from16 v21, v13

    .local v21, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v11, 0x0

    .line 1268
    .local v11, "$i$f$maskEmptyOrDeleted":I
    move/from16 v23, v12

    move-wide/from16 v24, v13

    move-wide/from16 v12, v21

    move v14, v1

    move-object/from16 v21, v2

    .end local v1    # "isActive":Z
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v13    # "slot$iv$iv":J
    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v14, "isActive":Z
    .local v21, "this_$iv":Landroidx/collection/ScatterMap;
    .local v24, "slot$iv$iv":J
    not-long v1, v12

    shl-long/2addr v1, v15

    and-long/2addr v1, v12

    and-long v1, v1, v17

    .line 1267
    .end local v11    # "$i$f$maskEmptyOrDeleted":I
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    cmp-long v1, v1, v17

    if-eqz v1, :cond_b

    .line 1269
    sub-int v1, v10, v9

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    rsub-int/lit8 v12, v1, 0x8

    .line 1270
    .local v12, "bitCount$iv$iv":I
    const/4 v1, 0x0

    .local v1, "j$iv$iv":I
    :goto_5
    if-ge v1, v12, :cond_a

    .line 1271
    and-long v28, v24, v26

    .local v28, "value$iv$iv$iv":J
    const/4 v2, 0x0

    .line 1272
    .local v2, "$i$f$isFull":I
    cmp-long v11, v28, v19

    if-gez v11, :cond_8

    const/4 v2, 0x1

    goto :goto_6

    :cond_8
    move/from16 v2, v16

    .line 1271
    .end local v2    # "$i$f$isFull":I
    .end local v28    # "value$iv$iv$iv":J
    :goto_6
    if-eqz v2, :cond_9

    .line 1273
    shl-int/lit8 v2, v10, 0x3

    add-int/2addr v2, v1

    .line 1274
    .local v2, "index$iv$iv":I
    move v11, v2

    .local v11, "index$iv":I
    const/4 v13, 0x0

    .line 1261
    .local v13, "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    aget-object v22, v4, v11

    aget-object v22, v5, v11

    check-cast v22, Landroidx/compose/animation/SharedElement;

    .local v22, "element":Landroidx/compose/animation/SharedElement;
    const/16 v28, 0x0

    .line 891
    .local v28, "$i$a$-forEach-SharedTransitionScopeImpl$updateTransitionActiveness$2":I
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/animation/SharedElement;->onSharedTransitionFinished()V

    .line 1261
    .end local v22    # "element":Landroidx/compose/animation/SharedElement;
    .end local v28    # "$i$a$-forEach-SharedTransitionScopeImpl$updateTransitionActiveness$2":I
    nop

    .line 1274
    .end local v11    # "index$iv":I
    .end local v13    # "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    nop

    .line 1276
    .end local v2    # "index$iv$iv":I
    :cond_9
    shr-long v24, v24, v23

    .line 1270
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 1278
    .end local v1    # "j$iv$iv":I
    :cond_a
    move/from16 v1, v23

    if-ne v12, v1, :cond_e

    .line 1265
    .end local v12    # "bitCount$iv$iv":I
    .end local v24    # "slot$iv$iv":J
    :cond_b
    if-eq v10, v9, :cond_d

    add-int/lit8 v10, v10, 0x1

    move v1, v14

    move-object/from16 v2, v21

    const/16 v12, 0x8

    goto :goto_4

    .end local v14    # "isActive":Z
    .end local v21    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v1, "isActive":Z
    .local v2, "this_$iv":Landroidx/collection/ScatterMap;
    :cond_c
    move v14, v1

    move-object/from16 v21, v2

    .line 1281
    .end local v1    # "isActive":Z
    .end local v2    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v10    # "i$iv$iv":I
    .restart local v14    # "isActive":Z
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterMap;
    :cond_d
    nop

    .line 1282
    .end local v6    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v7    # "$i$f$forEachIndexed":I
    .end local v8    # "m$iv$iv":[J
    .end local v9    # "lastIndex$iv$iv":I
    :cond_e
    goto :goto_7

    .line 890
    .end local v3    # "$i$f$forEach":I
    .end local v4    # "k$iv":[Ljava/lang/Object;
    .end local v5    # "v$iv":[Ljava/lang/Object;
    .end local v14    # "isActive":Z
    .end local v21    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v1    # "isActive":Z
    :cond_f
    move v14, v1

    .end local v1    # "isActive":Z
    .restart local v14    # "isActive":Z
    goto :goto_7

    .line 888
    .end local v14    # "isActive":Z
    .restart local v1    # "isActive":Z
    :cond_10
    move v14, v1

    .line 894
    .end local v1    # "isActive":Z
    .restart local v14    # "isActive":Z
    :goto_7
    iget-object v1, v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedElements:Landroidx/collection/MutableScatterMap;

    check-cast v1, Landroidx/collection/ScatterMap;

    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v2, 0x0

    .line 1283
    .local v2, "$i$f$forEach":I
    iget-object v3, v1, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 1284
    .local v3, "k$iv":[Ljava/lang/Object;
    iget-object v4, v1, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 1286
    .local v4, "v$iv":[Ljava/lang/Object;
    move-object v5, v1

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v6, 0x0

    .line 1287
    .local v6, "$i$f$forEachIndexed":I
    iget-object v7, v5, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1288
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1290
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_15

    .line 1291
    :goto_8
    aget-wide v10, v7, v9

    .line 1292
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v21, 0x0

    .line 1293
    .local v21, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v22, v1

    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v22, "this_$iv":Landroidx/collection/ScatterMap;
    not-long v0, v12

    shl-long/2addr v0, v15

    and-long/2addr v0, v12

    and-long v0, v0, v17

    .line 1292
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v21    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v17

    if-eqz v0, :cond_14

    .line 1294
    sub-int v0, v9, v8

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v23, 0x8

    rsub-int/lit8 v12, v0, 0x8

    .line 1295
    .local v12, "bitCount$iv$iv":I
    const/4 v0, 0x0

    .local v0, "j$iv$iv":I
    :goto_9
    if-ge v0, v12, :cond_13

    .line 1296
    and-long v24, v10, v26

    .local v24, "value$iv$iv$iv":J
    const/4 v1, 0x0

    .line 1297
    .local v1, "$i$f$isFull":I
    cmp-long v13, v24, v19

    if-gez v13, :cond_11

    const/4 v1, 0x1

    goto :goto_a

    :cond_11
    move/from16 v1, v16

    .line 1296
    .end local v1    # "$i$f$isFull":I
    .end local v24    # "value$iv$iv$iv":J
    :goto_a
    if-eqz v1, :cond_12

    .line 1298
    shl-int/lit8 v1, v9, 0x3

    add-int/2addr v1, v0

    .line 1299
    .local v1, "index$iv$iv":I
    move v13, v1

    .local v13, "index$iv":I
    const/16 v21, 0x0

    .line 1286
    .local v21, "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    aget-object v24, v3, v13

    aget-object v24, v4, v13

    check-cast v24, Landroidx/compose/animation/SharedElement;

    .local v24, "element":Landroidx/compose/animation/SharedElement;
    const/16 v25, 0x0

    .line 894
    .local v25, "$i$a$-forEach-SharedTransitionScopeImpl$updateTransitionActiveness$3":I
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/animation/SharedElement;->updateMatch()V

    .line 1286
    .end local v24    # "element":Landroidx/compose/animation/SharedElement;
    .end local v25    # "$i$a$-forEach-SharedTransitionScopeImpl$updateTransitionActiveness$3":I
    nop

    .line 1299
    .end local v13    # "index$iv":I
    .end local v21    # "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    nop

    .line 1301
    .end local v1    # "index$iv$iv":I
    :cond_12
    const/16 v1, 0x8

    shr-long/2addr v10, v1

    .line 1295
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_13
    const/16 v1, 0x8

    .line 1303
    .end local v0    # "j$iv$iv":I
    if-ne v12, v1, :cond_17

    goto :goto_b

    .line 1292
    .end local v12    # "bitCount$iv$iv":I
    :cond_14
    const/16 v1, 0x8

    .line 1290
    .end local v10    # "slot$iv$iv":J
    :goto_b
    if-eq v9, v8, :cond_16

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    goto :goto_8

    .end local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    :cond_15
    move-object/from16 v22, v1

    .line 1306
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v9    # "i$iv$iv":I
    .restart local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    :cond_16
    nop

    .line 1307
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_17
    nop

    .line 895
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    invoke-direct/range {p0 .. p0}, Landroidx/compose/animation/SharedTransitionScopeImpl;->observeIsAnimating()V

    .line 896
    return-void
.end method


# virtual methods
.method public OverlayClip(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/animation/SharedTransitionScope$OverlayClip;
    .locals 1
    .param p1, "clipShape"    # Landroidx/compose/ui/graphics/Shape;

    .line 871
    new-instance v0, Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;

    invoke-direct {v0, p1}, Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;-><init>(Landroidx/compose/ui/graphics/Shape;)V

    check-cast v0, Landroidx/compose/animation/SharedTransitionScope$OverlayClip;

    return-object v0
.end method

.method public final clearObservation$animation_release(Ljava/lang/Object;)V
    .locals 1
    .param p1, "scope"    # Ljava/lang/Object;

    .line 1120
    sget-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->Companion:Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;

    invoke-static {v0}, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;->access$getSharedTransitionObserver(Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->clear(Ljava/lang/Object;)V

    .line 1121
    return-void
.end method

.method public final drawInOverlay$animation_release(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V
    .locals 8
    .param p1, "scope"    # Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;

    .line 1040
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/List;

    .local v0, "$this$sortBy$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 1315
    .local v1, "$i$f$sortBy":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    new-instance v2, Landroidx/compose/animation/SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1;

    invoke-direct {v2}, Landroidx/compose/animation/SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1;-><init>()V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1316
    :cond_0
    nop

    .line 1045
    .end local v0    # "$this$sortBy$iv":Ljava/util/List;
    .end local v1    # "$i$f$sortBy":I
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/List;

    .local v0, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v1, 0x0

    .line 1317
    .local v1, "$i$f$fastForEach":I
    nop

    .line 1318
    const/4 v2, 0x0

    .local v2, "index$iv":I
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_1

    .line 1319
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 1320
    .local v4, "item$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Landroidx/compose/animation/LayerRenderer;

    .local v5, "it":Landroidx/compose/animation/LayerRenderer;
    const/4 v6, 0x0

    .line 1045
    .local v6, "$i$a$-fastForEach-SharedTransitionScopeImpl$drawInOverlay$2":I
    move-object v7, p1

    check-cast v7, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-interface {v5, v7}, Landroidx/compose/animation/LayerRenderer;->drawInOverlay(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V

    .line 1320
    .end local v5    # "it":Landroidx/compose/animation/LayerRenderer;
    .end local v6    # "$i$a$-fastForEach-SharedTransitionScopeImpl$drawInOverlay$2":I
    nop

    .line 1318
    .end local v4    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1322
    .end local v2    # "index$iv":I
    :cond_1
    nop

    .line 1046
    .end local v0    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v1    # "$i$f$fastForEach":I
    return-void
.end method

.method public final getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;
    .locals 1

    .line 663
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final getDisposed$animation_release()Z
    .locals 1

    .line 670
    iget-boolean v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->disposed:Z

    return v0
.end method

.method public final getLookaheadRoot$animation_release()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 2

    .line 1020
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->nullableLookaheadRoot:Landroidx/compose/ui/layout/LayoutCoordinates;

    if-eqz v0, :cond_0

    .line 1025
    return-object v0

    .line 1020
    :cond_0
    const/4 v0, 0x0

    .line 1021
    .local v0, "$i$a$-requireNotNull-SharedTransitionScopeImpl$lookaheadRoot$1":I
    nop

    .line 1024
    nop

    .line 1020
    .end local v0    # "$i$a$-requireNotNull-SharedTransitionScopeImpl$lookaheadRoot$1":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getLookaheadScopeCoordinates(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->$$delegate_0:Landroidx/compose/ui/layout/LookaheadScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/LookaheadScope;->getLookaheadScopeCoordinates(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v0

    return-object v0
.end method

.method public final getNullableLookaheadRoot$animation_release()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 1

    .line 1027
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->nullableLookaheadRoot:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-object v0
.end method

.method public final getObserverForTest$animation_release()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
    .locals 1

    .line 1097
    sget-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->Companion:Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;

    invoke-static {v0}, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;->access$getSharedTransitionObserver(Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    move-result-object v0

    return-object v0
.end method

.method public final getRoot$animation_release()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 1

    .line 1017
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->root:Landroidx/compose/ui/layout/LayoutCoordinates;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "root"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public isTransitionActive()Z
    .locals 3

    .line 673
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->isTransitionActive$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue$iv":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property$iv":Lkotlin/reflect/KProperty;
    const/4 v2, 0x0

    .line 1222
    .local v2, "$i$f$getValue":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue$iv":Landroidx/compose/runtime/State;
    .end local v1    # "property$iv":Lkotlin/reflect/KProperty;
    .end local v2    # "$i$f$getValue":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 673
    return v0
.end method

.method public localLookaheadPositionOf-au-aQtc(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J
    .locals 6

    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->$$delegate_0:Landroidx/compose/ui/layout/LookaheadScope;

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, Landroidx/compose/ui/layout/LookaheadScope;->localLookaheadPositionOf-au-aQtc(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final observeReads$animation_release(Landroidx/compose/animation/SharedElement;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "scope"    # Landroidx/compose/animation/SharedElement;
    .param p2, "onValueChangedForScope"    # Lkotlin/jvm/functions/Function1;
    .param p3, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/SharedElement;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/animation/SharedElement;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1114
    iget-boolean v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->disposed:Z

    if-nez v0, :cond_0

    .line 1115
    sget-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->Companion:Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;

    invoke-static {v0}, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;->access$getSharedTransitionObserver(Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->observeReads(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 1117
    :cond_0
    return-void
.end method

.method public final onDispose$animation_release()V
    .locals 1

    .line 1091
    sget-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl;->Companion:Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;

    invoke-static {v0}, Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;->access$getSharedTransitionObserver(Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->clear(Ljava/lang/Object;)V

    .line 1092
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->disposed:Z

    .line 1093
    return-void
.end method

.method public final onLayerRendererCreated$animation_release(Landroidx/compose/animation/LayerRenderer;)V
    .locals 1
    .param p1, "renderer"    # Landroidx/compose/animation/LayerRenderer;

    .line 1083
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 1084
    return-void
.end method

.method public final onLayerRendererRemoved$animation_release(Landroidx/compose/animation/LayerRenderer;)V
    .locals 1
    .param p1, "renderer"    # Landroidx/compose/animation/LayerRenderer;

    .line 1087
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 1088
    return-void
.end method

.method public final onStateAdded$animation_release(Landroidx/compose/animation/SharedElementInternalState;)V
    .locals 12
    .param p1, "sharedElementState"    # Landroidx/compose/animation/SharedElementInternalState;

    .line 1065
    invoke-virtual {p1}, Landroidx/compose/animation/SharedElementInternalState;->getSharedElement()Landroidx/compose/animation/SharedElement;

    move-result-object v0

    .local v0, "$this$onStateAdded_u24lambda_u2412":Landroidx/compose/animation/SharedElement;
    const/4 v1, 0x0

    .line 1066
    .local v1, "$i$a$-with-SharedTransitionScopeImpl$onStateAdded$1":I
    invoke-virtual {v0, p1}, Landroidx/compose/animation/SharedElement;->addState(Landroidx/compose/animation/SharedElementInternalState;)V

    .line 1067
    iget-object v2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->updateTransitionActiveness:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1068
    invoke-virtual {v0}, Landroidx/compose/animation/SharedElement;->getScope()Landroidx/compose/animation/SharedTransitionScopeImpl;

    move-result-object v2

    invoke-direct {v2}, Landroidx/compose/animation/SharedTransitionScopeImpl;->observeIsAnimating()V

    .line 1070
    iget-object v2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v2, Ljava/util/List;

    .local v2, "$this$indexOfFirst$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 1323
    .local v3, "$i$f$indexOfFirst":I
    const/4 v4, 0x0

    .line 1324
    .local v4, "index$iv":I
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, -0x1

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 1325
    .local v6, "item$iv":Ljava/lang/Object;
    move-object v8, v6

    check-cast v8, Landroidx/compose/animation/LayerRenderer;

    .local v8, "it":Landroidx/compose/animation/LayerRenderer;
    const/4 v9, 0x0

    .line 1071
    .local v9, "$i$a$-indexOfFirst-SharedTransitionScopeImpl$onStateAdded$1$id$1":I
    instance-of v10, v8, Landroidx/compose/animation/SharedElementInternalState;

    const/4 v11, 0x0

    if-eqz v10, :cond_0

    move-object v10, v8

    check-cast v10, Landroidx/compose/animation/SharedElementInternalState;

    goto :goto_1

    :cond_0
    move-object v10, v11

    :goto_1
    if-eqz v10, :cond_1

    invoke-virtual {v10}, Landroidx/compose/animation/SharedElementInternalState;->getSharedElement()Landroidx/compose/animation/SharedElement;

    move-result-object v11

    .line 1072
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/animation/SharedElementInternalState;->getSharedElement()Landroidx/compose/animation/SharedElement;

    move-result-object v10

    .line 1071
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    .line 1072
    nop

    .line 1325
    .end local v8    # "it":Landroidx/compose/animation/LayerRenderer;
    .end local v9    # "$i$a$-indexOfFirst-SharedTransitionScopeImpl$onStateAdded$1$id$1":I
    if-eqz v10, :cond_2

    .line 1326
    goto :goto_2

    .line 1327
    :cond_2
    nop

    .end local v6    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1329
    :cond_3
    move v4, v7

    .line 1070
    .end local v2    # "$this$indexOfFirst$iv":Ljava/util/List;
    .end local v3    # "$i$f$indexOfFirst":I
    .end local v4    # "index$iv":I
    :goto_2
    nop

    .line 1069
    nop

    .line 1074
    .local v4, "id":I
    iget-object v2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-eq v4, v2, :cond_5

    if-ne v4, v7, :cond_4

    goto :goto_3

    .line 1077
    :cond_4
    iget-object v2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    add-int/lit8 v3, v4, 0x1

    invoke-virtual {v2, v3, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(ILjava/lang/Object;)V

    goto :goto_4

    .line 1075
    :cond_5
    :goto_3
    iget-object v2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v2, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 1078
    :goto_4
    nop

    .line 1065
    .end local v0    # "$this$onStateAdded_u24lambda_u2412":Landroidx/compose/animation/SharedElement;
    .end local v1    # "$i$a$-with-SharedTransitionScopeImpl$onStateAdded$1":I
    .end local v4    # "id":I
    nop

    .line 1080
    return-void
.end method

.method public final onStateRemoved$animation_release(Landroidx/compose/animation/SharedElementInternalState;)V
    .locals 9
    .param p1, "sharedElementState"    # Landroidx/compose/animation/SharedElementInternalState;

    .line 1049
    invoke-virtual {p1}, Landroidx/compose/animation/SharedElementInternalState;->getSharedElement()Landroidx/compose/animation/SharedElement;

    move-result-object v0

    .local v0, "$this$onStateRemoved_u24lambda_u2410":Landroidx/compose/animation/SharedElement;
    const/4 v1, 0x0

    .line 1050
    .local v1, "$i$a$-with-SharedTransitionScopeImpl$onStateRemoved$1":I
    invoke-virtual {v0, p1}, Landroidx/compose/animation/SharedElement;->removeState(Landroidx/compose/animation/SharedElementInternalState;)V

    .line 1051
    iget-object v2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->updateTransitionActiveness:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1052
    invoke-virtual {v0}, Landroidx/compose/animation/SharedElement;->getScope()Landroidx/compose/animation/SharedTransitionScopeImpl;

    move-result-object v2

    invoke-direct {v2}, Landroidx/compose/animation/SharedTransitionScopeImpl;->observeIsAnimating()V

    .line 1053
    iget-object v2, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->renderers:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v2, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 1054
    invoke-virtual {v0}, Landroidx/compose/animation/SharedElement;->getStates()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1055
    invoke-virtual {v0}, Landroidx/compose/animation/SharedElement;->getScope()Landroidx/compose/animation/SharedTransitionScopeImpl;

    move-result-object v2

    iget-object v3, v2, Landroidx/compose/animation/SharedTransitionScopeImpl;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v2, Landroidx/compose/animation/SharedTransitionScopeImpl$onStateRemoved$1$1;

    const/4 v4, 0x0

    invoke-direct {v2, v0, v4}, Landroidx/compose/animation/SharedTransitionScopeImpl$onStateRemoved$1$1;-><init>(Landroidx/compose/animation/SharedElement;Lkotlin/coroutines/Continuation;)V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 1061
    :cond_0
    nop

    .line 1049
    .end local v0    # "$this$onStateRemoved_u24lambda_u2410":Landroidx/compose/animation/SharedElement;
    .end local v1    # "$i$a$-with-SharedTransitionScopeImpl$onStateRemoved$1":I
    nop

    .line 1062
    return-void
.end method

.method public rememberSharedContentState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
    .locals 7
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p3, "$changed"    # I

    const v0, 0x2faa7df2

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "C(rememberSharedContentState)874@49196L41:SharedTransitionScope.kt#xbi5r1"

    invoke-static {p2, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 875
    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:874)"

    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x37c20192

    const-string v1, "CC(remember):SharedTransitionScope.kt#9igjgp"

    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .local v0, "invalid$iv":Z
    move-object v1, p2

    .local v1, "$this$cache$iv":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 1225
    .local v2, "$i$f$cache":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .local v3, "it$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 1226
    .local v4, "$i$a$-let-ComposerKt$cache$1$iv":I
    if-nez v0, :cond_2

    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_1

    goto :goto_0

    .line 1230
    :cond_1
    goto :goto_1

    .line 1227
    :cond_2
    :goto_0
    const/4 v5, 0x0

    .line 875
    .local v5, "$i$a$-cache-SharedTransitionScopeImpl$rememberSharedContentState$1":I
    new-instance v6, Landroidx/compose/animation/SharedTransitionScope$SharedContentState;

    invoke-direct {v6, p1}, Landroidx/compose/animation/SharedTransitionScope$SharedContentState;-><init>(Ljava/lang/Object;)V

    .line 1227
    .end local v5    # "$i$a$-cache-SharedTransitionScopeImpl$rememberSharedContentState$1":I
    nop

    .line 1228
    .local v6, "value$iv":Ljava/lang/Object;
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1229
    move-object v3, v6

    .line 1225
    .end local v3    # "it$iv":Ljava/lang/Object;
    .end local v4    # "$i$a$-let-ComposerKt$cache$1$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    :goto_1
    nop

    .line 875
    .end local v0    # "invalid$iv":Z
    .end local v1    # "$this$cache$iv":Landroidx/compose/runtime/Composer;
    .end local v2    # "$i$f$cache":I
    check-cast v3, Landroidx/compose/animation/SharedTransitionScope$SharedContentState;

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object v3
.end method

.method public renderInSharedTransitionScopeOverlay(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p1, "$this$renderInSharedTransitionScopeOverlay"    # Landroidx/compose/ui/Modifier;
    .param p2, "renderInOverlay"    # Lkotlin/jvm/functions/Function0;
    .param p3, "zIndexInOverlay"    # F
    .param p4, "clipInOverlayDuringTransition"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;F",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "+",
            "Landroidx/compose/ui/graphics/Path;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 683
    nop

    .line 684
    new-instance v0, Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;

    .line 685
    nop

    .line 686
    nop

    .line 687
    nop

    .line 688
    nop

    .line 684
    invoke-direct {v0, p0, p2, p3, p4}, Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;-><init>(Landroidx/compose/animation/SharedTransitionScopeImpl;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)V

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 683
    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 690
    return-object v0
.end method

.method public final setNullableLookaheadRoot$animation_release(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 1027
    iput-object p1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->nullableLookaheadRoot:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-void
.end method

.method public final setRoot$animation_release(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 1017
    iput-object p1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->root:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-void
.end method

.method public sharedBounds(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$ResizeMode;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;
    .locals 11
    .param p1, "$this$sharedBounds"    # Landroidx/compose/ui/Modifier;
    .param p2, "sharedContentState"    # Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
    .param p3, "animatedVisibilityScope"    # Landroidx/compose/animation/AnimatedVisibilityScope;
    .param p4, "enter"    # Landroidx/compose/animation/EnterTransition;
    .param p5, "exit"    # Landroidx/compose/animation/ExitTransition;
    .param p6, "boundsTransform"    # Landroidx/compose/animation/BoundsTransform;
    .param p7, "resizeMode"    # Landroidx/compose/animation/SharedTransitionScope$ResizeMode;
    .param p8, "placeHolderSize"    # Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;
    .param p9, "renderInOverlayDuringTransition"    # Z
    .param p10, "zIndexInOverlay"    # F
    .param p11, "clipInOverlayDuringTransition"    # Landroidx/compose/animation/SharedTransitionScope$OverlayClip;

    .line 727
    invoke-interface {p3}, Landroidx/compose/animation/AnimatedVisibilityScope;->getTransition()Landroidx/compose/animation/core/Transition;

    move-result-object v3

    .line 725
    nop

    .line 726
    nop

    .line 727
    nop

    .line 725
    sget-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$1;->INSTANCE:Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$1;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 729
    nop

    .line 730
    nop

    .line 734
    nop

    .line 731
    nop

    .line 732
    nop

    .line 733
    nop

    .line 725
    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v5, p6

    move-object/from16 v6, p8

    move/from16 v8, p9

    move/from16 v9, p10

    move-object/from16 v10, p11

    invoke-direct/range {v0 .. v10}, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedBoundsImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 736
    new-instance v4, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$2;

    move-object v8, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move-object/from16 v9, p7

    invoke-direct/range {v4 .. v9}, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$2;-><init>(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$ResizeMode;)V

    check-cast v4, Lkotlin/jvm/functions/Function3;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v3, v1, v4, v0, v1}, Landroidx/compose/ui/ComposedModifierKt;->composed$default(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 763
    return-object v0
.end method

.method public final sharedBoundsWithCallerManagedVisibility$animation_release(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;ZLandroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;
    .locals 13
    .param p1, "$this$sharedBoundsWithCallerManagedVisibility"    # Landroidx/compose/ui/Modifier;
    .param p2, "sharedContentState"    # Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
    .param p3, "visible"    # Z
    .param p4, "boundsTransform"    # Landroidx/compose/animation/BoundsTransform;
    .param p5, "placeHolderSize"    # Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;
    .param p6, "renderInOverlayDuringTransition"    # Z
    .param p7, "zIndexInOverlay"    # F
    .param p8, "clipInOverlayDuringTransition"    # Landroidx/compose/animation/SharedTransitionScope$OverlayClip;

    .line 859
    nop

    .line 860
    nop

    .line 861
    nop

    .line 859
    new-instance v0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1;

    move/from16 v1, p3

    invoke-direct {v0, v1}, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1;-><init>(Z)V

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 863
    nop

    .line 864
    nop

    .line 865
    nop

    .line 866
    nop

    .line 867
    nop

    .line 868
    nop

    .line 859
    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v10, p6

    move/from16 v11, p7

    move-object/from16 v12, p8

    invoke-direct/range {v2 .. v12}, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedBoundsImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 869
    return-object v0
.end method

.method public sharedElement(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;
    .locals 11
    .param p1, "$this$sharedElement"    # Landroidx/compose/ui/Modifier;
    .param p2, "sharedContentState"    # Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
    .param p3, "animatedVisibilityScope"    # Landroidx/compose/animation/AnimatedVisibilityScope;
    .param p4, "boundsTransform"    # Landroidx/compose/animation/BoundsTransform;
    .param p5, "placeHolderSize"    # Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;
    .param p6, "renderInOverlayDuringTransition"    # Z
    .param p7, "zIndexInOverlay"    # F
    .param p8, "clipInOverlayDuringTransition"    # Landroidx/compose/animation/SharedTransitionScope$OverlayClip;

    .line 701
    nop

    .line 702
    nop

    .line 703
    invoke-interface {p3}, Landroidx/compose/animation/AnimatedVisibilityScope;->getTransition()Landroidx/compose/animation/core/Transition;

    move-result-object v3

    .line 701
    sget-object v0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedElement$1;->INSTANCE:Landroidx/compose/animation/SharedTransitionScopeImpl$sharedElement$1;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 705
    nop

    .line 706
    nop

    .line 707
    nop

    .line 708
    nop

    .line 709
    nop

    .line 710
    nop

    .line 701
    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v0 .. v10}, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedBoundsImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 711
    return-object v3
.end method

.method public sharedElementWithCallerManagedVisibility(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;ZLandroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;
    .locals 13
    .param p1, "$this$sharedElementWithCallerManagedVisibility"    # Landroidx/compose/ui/Modifier;
    .param p2, "sharedContentState"    # Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
    .param p3, "visible"    # Z
    .param p4, "boundsTransform"    # Landroidx/compose/animation/BoundsTransform;
    .param p5, "placeHolderSize"    # Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;
    .param p6, "renderInOverlayDuringTransition"    # Z
    .param p7, "zIndexInOverlay"    # F
    .param p8, "clipInOverlayDuringTransition"    # Landroidx/compose/animation/SharedTransitionScope$OverlayClip;

    .line 774
    nop

    .line 775
    nop

    .line 776
    nop

    .line 774
    new-instance v0, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1;

    move/from16 v1, p3

    invoke-direct {v0, v1}, Landroidx/compose/animation/SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1;-><init>(Z)V

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 778
    nop

    .line 779
    nop

    .line 780
    nop

    .line 781
    nop

    .line 782
    nop

    .line 783
    nop

    .line 774
    const/4 v5, 0x0

    const/4 v9, 0x1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v10, p6

    move/from16 v11, p7

    move-object/from16 v12, p8

    invoke-direct/range {v2 .. v12}, Landroidx/compose/animation/SharedTransitionScopeImpl;->sharedBoundsImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 784
    return-object v0
.end method

.method public skipToLookaheadSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3
    .param p1, "$this$skipToLookaheadSize"    # Landroidx/compose/ui/Modifier;

    .line 676
    new-instance v0, Landroidx/compose/animation/SkipToLookaheadElement;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Landroidx/compose/animation/SkipToLookaheadElement;-><init>(Landroidx/compose/animation/ScaleToBoundsImpl;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public toLookaheadCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeImpl;->$$delegate_0:Landroidx/compose/ui/layout/LookaheadScope;

    invoke-interface {v0, p1}, Landroidx/compose/ui/layout/LookaheadScope;->toLookaheadCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v0

    return-object v0
.end method
