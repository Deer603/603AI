.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
.super Ljava/lang/Object;
.source "LazyLayoutItemAnimator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;,
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;,
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyLayoutItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,587:1\n102#2,2:588\n34#2,6:590\n104#2:596\n34#2,4:625\n39#2:636\n34#2,6:639\n34#2,6:647\n34#2,6:684\n34#2,6:692\n34#2,4:731\n39#2:741\n32#3:597\n32#3:599\n80#4:598\n80#4:600\n85#4:736\n90#4:738\n80#4:740\n365#5,3:601\n329#5,6:604\n339#5,3:611\n342#5,9:615\n368#5:624\n372#5,3:700\n329#5,6:703\n339#5,3:710\n342#5,2:714\n345#5,6:718\n375#5:724\n1399#6:610\n1270#6:614\n1399#6:663\n1270#6:667\n1399#6:709\n1270#6:713\n1#7:629\n13309#8,2:630\n13309#8,2:632\n13309#8,2:634\n13374#8,3:670\n12474#8,2:673\n13309#8,2:698\n13309#8,2:716\n13374#8,3:725\n13374#8,3:728\n1011#9,2:637\n1002#9,2:645\n1011#9,2:682\n1002#9,2:690\n231#10,3:653\n200#10,7:656\n211#10,3:664\n214#10,2:668\n217#10,6:675\n234#10:681\n54#11:735\n59#11:737\n30#12:739\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimator.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator\n*L\n89#1:588,2\n89#1:590,6\n89#1:596\n113#1:625,4\n113#1:636\n189#1:639,6\n199#1:647,6\n289#1:684,6\n314#1:692,6\n433#1:731,4\n433#1:741\n102#1:597\n104#1:599\n102#1:598\n104#1:600\n438#1:736\n439#1:738\n437#1:740\n111#1:601,3\n111#1:604,6\n111#1:611,3\n111#1:615,9\n111#1:624\n368#1:700,3\n368#1:703,6\n368#1:710,3\n368#1:714,2\n368#1:718,6\n368#1:724\n111#1:610\n111#1:614\n210#1:663\n210#1:667\n368#1:709\n368#1:713\n145#1:630,2\n157#1:632,2\n166#1:634,2\n226#1:670,3\n264#1:673,2\n353#1:698,2\n369#1:716,2\n390#1:725,3\n401#1:728,3\n188#1:637,2\n198#1:645,2\n288#1:682,2\n313#1:690,2\n210#1:653,3\n210#1:656,7\n210#1:664,3\n210#1:668,2\n210#1:675,6\n210#1:681\n438#1:735\n439#1:737\n437#1:739\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0015\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0003JKLB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010(\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u000bJ1\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u000b2\u0012\u0008\u0002\u0010.\u001a\u000c0\u0010R\u0008\u0012\u0004\u0012\u00028\u00000\u0000H\u0002\u00a2\u0006\u0002\u0010/J\u0082\u0001\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000c\u001a\u00020\r2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00028\u0000062\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@J\u0008\u0010A\u001a\u00020,H\u0002J\u0010\u0010B\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0006\u0010C\u001a\u00020,J\u001f\u0010D\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\u0008\u0008\u0002\u0010E\u001a\u00020#H\u0002\u00a2\u0006\u0002\u0010FJ\u0019\u0010G\u001a\u00020\u000b*\u00020H2\u0006\u0010-\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010IR\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\u000c0\u0010R\u0008\u0012\u0004\u0012\u00028\u00000\u00000\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\u00020\u00128F\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0018\u0010\"\u001a\u00020#*\u00028\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0018\u0010&\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010!\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006M"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;",
        "T",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;",
        "",
        "()V",
        "disappearingItems",
        "",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;",
        "displayingNode",
        "Landroidx/compose/ui/node/DrawModifierNode;",
        "firstVisibleIndex",
        "",
        "keyIndexMap",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;",
        "keyToItemInfoMap",
        "Landroidx/collection/MutableScatterMap;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;",
        "minSizeToFitDisappearingItems",
        "Landroidx/compose/ui/unit/IntSize;",
        "getMinSizeToFitDisappearingItems-YbymL2g",
        "()J",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "movingAwayKeys",
        "Landroidx/collection/MutableScatterSet;",
        "movingAwayToEndBound",
        "movingAwayToStartBound",
        "movingInFromEndBound",
        "movingInFromStartBound",
        "crossAxisOffset",
        "getCrossAxisOffset",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I",
        "hasAnimations",
        "",
        "getHasAnimations",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z",
        "mainAxisOffset",
        "getMainAxisOffset",
        "getAnimation",
        "key",
        "placeableIndex",
        "initializeAnimation",
        "",
        "item",
        "itemInfo",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V",
        "onMeasured",
        "consumedScroll",
        "layoutWidth",
        "layoutHeight",
        "positionedItems",
        "itemProvider",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;",
        "isVertical",
        "isLookingAhead",
        "laneCount",
        "hasLookaheadOccurred",
        "layoutMinOffset",
        "layoutMaxOffset",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "graphicsContext",
        "Landroidx/compose/ui/graphics/GraphicsContext;",
        "releaseAnimations",
        "removeInfoForKey",
        "reset",
        "startPlacementAnimationsIfNeeded",
        "isMovingAway",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V",
        "updateAndReturnOffsetFor",
        "",
        "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I",
        "DisplayingDisappearingItemsElement",
        "DisplayingDisappearingItemsNode",
        "ItemInfo",
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
.field private final disappearingItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;",
            ">;"
        }
    .end annotation
.end field

.field private displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

.field private firstVisibleIndex:I

.field private keyIndexMap:Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

.field private final keyToItemInfoMap:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "TT;>.ItemInfo;>;"
        }
    .end annotation
.end field

.field private final modifier:Landroidx/compose/ui/Modifier;

.field private final movingAwayKeys:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final movingAwayToEndBound:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final movingAwayToStartBound:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final movingInFromEndBound:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final movingInFromStartBound:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 57
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    .line 446
    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V

    check-cast v0, Landroidx/compose/ui/Modifier;

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->modifier:Landroidx/compose/ui/Modifier;

    .line 46
    return-void
.end method

.method public static final synthetic access$getCrossAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .param p1, "$receiver"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 46
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getCrossAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$getDisappearingItems$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 46
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getDisplayingNode$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Landroidx/compose/ui/node/DrawModifierNode;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 46
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    return-object v0
.end method

.method public static final synthetic access$setDisplayingNode$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/ui/node/DrawModifierNode;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .param p1, "<set-?>"    # Landroidx/compose/ui/node/DrawModifierNode;

    .line 46
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    return-void
.end method

.method private final getCrossAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 4
    .param p1, "$this$crossAxisOffset"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 463
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    move-result-wide v0

    .line 629
    .local v0, "it":J
    const/4 v2, 0x0

    .line 463
    .local v2, "$i$a$-let-LazyLayoutItemAnimator$crossAxisOffset$1":I
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->isVertical()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v3

    .end local v0    # "it":J
    .end local v2    # "$i$a$-let-LazyLayoutItemAnimator$crossAxisOffset$1":I
    :goto_0
    return v3
.end method

.method private final getHasAnimations(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z
    .locals 6
    .param p1, "$this$hasAnimations"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 450
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getPlaceablesCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    move v3, v2

    .local v3, "index":I
    const/4 v4, 0x0

    .line 451
    .local v4, "$i$a$-repeat-LazyLayoutItemAnimator$hasAnimations$1":I
    invoke-interface {p1, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getParentData(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimatorKt;->access$getSpecs(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;

    move-result-object v5

    if-eqz v5, :cond_0

    .local v5, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;
    const/4 v0, 0x0

    .line 453
    .local v0, "$i$a$-let-LazyLayoutItemAnimator$hasAnimations$1$1":I
    const/4 v1, 0x1

    return v1

    .line 455
    .end local v0    # "$i$a$-let-LazyLayoutItemAnimator$hasAnimations$1$1":I
    .end local v5    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;
    :cond_0
    nop

    .line 450
    .end local v3    # "index":I
    .end local v4    # "$i$a$-repeat-LazyLayoutItemAnimator$hasAnimations$1":I
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 456
    :cond_1
    return v1
.end method

.method private final getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 4
    .param p1, "$this$mainAxisOffset"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 460
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    move-result-wide v0

    .line 629
    .local v0, "it":J
    const/4 v2, 0x0

    .line 460
    .local v2, "$i$a$-let-LazyLayoutItemAnimator$mainAxisOffset$1":I
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->isVertical()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v3

    .end local v0    # "it":J
    .end local v2    # "$i$a$-let-LazyLayoutItemAnimator$mainAxisOffset$1":I
    :goto_0
    return v3
.end method

.method private final initializeAnimation(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V
    .locals 17
    .param p1, "item"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .param p2, "mainAxisOffset"    # I
    .param p3, "itemInfo"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "TT;>.ItemInfo;)V"
        }
    .end annotation

    .line 380
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    move-result-wide v2

    .line 383
    .local v2, "firstPlaceableOffset":J
    invoke-interface {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->isVertical()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 384
    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v4, 0x0

    move/from16 v5, p2

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/unit/IntOffset;->copy-iSbpLlY$default(JIIILjava/lang/Object;)J

    move-result-wide v6

    goto :goto_0

    .line 386
    :cond_0
    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move/from16 v4, p2

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/unit/IntOffset;->copy-iSbpLlY$default(JIIILjava/lang/Object;)J

    move-result-wide v6

    .line 383
    :goto_0
    nop

    .line 382
    nop

    .line 390
    .local v6, "targetFirstPlaceableOffset":J
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v4

    .local v4, "$this$forEachIndexed$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 725
    .local v5, "$i$f$forEachIndexed":I
    const/4 v8, 0x0

    .line 726
    .local v8, "index$iv":I
    array-length v9, v4

    :goto_1
    if-ge v1, v9, :cond_2

    aget-object v10, v4, v1

    .local v10, "item$iv":Ljava/lang/Object;
    add-int/lit8 v11, v8, 0x1

    .local v8, "placeableIndex":I
    .local v11, "index$iv":I
    move-object v12, v10

    .local v12, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/4 v13, 0x0

    .line 391
    .local v13, "$i$a$-forEachIndexed-LazyLayoutItemAnimator$initializeAnimation$1":I
    if-eqz v12, :cond_1

    .line 393
    invoke-interface {v0, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    move-result-wide v14

    invoke-static {v14, v15, v2, v3}, Landroidx/compose/ui/unit/IntOffset;->minus-qkQi6aY(JJ)J

    move-result-wide v14

    .line 392
    nop

    .line 394
    .local v14, "diffToFirstPlaceableOffset":J
    move/from16 v16, v1

    invoke-static {v6, v7, v14, v15}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setRawOffset--gyyYBs(J)V

    goto :goto_2

    .line 391
    .end local v14    # "diffToFirstPlaceableOffset":J
    :cond_1
    move/from16 v16, v1

    .line 396
    :goto_2
    nop

    .line 726
    .end local v8    # "placeableIndex":I
    .end local v12    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v13    # "$i$a$-forEachIndexed-LazyLayoutItemAnimator$initializeAnimation$1":I
    nop

    .end local v10    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v1, v16, 0x1

    move-object/from16 v0, p1

    move v8, v11

    goto :goto_1

    .line 727
    .end local v11    # "index$iv":I
    .local v8, "index$iv":I
    :cond_2
    nop

    .line 397
    .end local v4    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v8    # "index$iv":I
    return-void
.end method

.method static synthetic initializeAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;ILjava/lang/Object;)V
    .locals 0

    .line 375
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 378
    iget-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 375
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->initializeAnimation(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V

    return-void
.end method

.method private final releaseAnimations()V
    .locals 26

    .line 367
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->isNotEmpty()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 368
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    check-cast v1, Landroidx/collection/ScatterMap;

    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v2, 0x0

    .line 700
    .local v2, "$i$f$forEachValue":I
    iget-object v3, v1, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 702
    .local v3, "v$iv":[Ljava/lang/Object;
    move-object v4, v1

    .local v4, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v5, 0x0

    .line 703
    .local v5, "$i$f$forEachIndexed":I
    iget-object v6, v4, Landroidx/collection/ScatterMap;->metadata:[J

    .line 704
    .local v6, "m$iv$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 706
    .local v7, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv$iv":I
    if-gt v8, v7, :cond_6

    .line 707
    :goto_0
    aget-wide v9, v6, v8

    .line 708
    .local v9, "slot$iv$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v13, 0x0

    .line 709
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v11

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v14, v16

    .line 708
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v16

    if-eqz v11, :cond_5

    .line 710
    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 711
    .local v11, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v11, :cond_4

    .line 712
    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    .local v14, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 713
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v14, v17

    const/16 v18, 0x0

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    move/from16 v17, v18

    .line 712
    .end local v14    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_3

    .line 714
    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    .line 715
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v16, 0x0

    .line 702
    .local v16, "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    aget-object v17, v3, v15

    check-cast v17, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .local v17, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    const/16 v19, 0x0

    .line 369
    .local v19, "$i$a$-forEachValue-LazyLayoutItemAnimator$releaseAnimations$1":I
    move/from16 v20, v12

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v12

    .local v12, "$this$forEach$iv":[Ljava/lang/Object;
    const/16 v21, 0x0

    .line 716
    .local v21, "$i$f$forEach":I
    move-object/from16 v22, v1

    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v22, "this_$iv":Landroidx/collection/ScatterMap;
    array-length v1, v12

    move/from16 v23, v2

    move/from16 v2, v18

    .end local v2    # "$i$f$forEachValue":I
    .local v23, "$i$f$forEachValue":I
    :goto_3
    if-ge v2, v1, :cond_2

    aget-object v18, v12, v2

    .local v18, "element$iv":Ljava/lang/Object;
    move-object/from16 v24, v18

    .local v24, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/16 v25, 0x0

    .line 369
    .local v25, "$i$a$-forEach-LazyLayoutItemAnimator$releaseAnimations$1$1":I
    if-eqz v24, :cond_1

    invoke-virtual/range {v24 .. v24}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->release()V

    .line 716
    .end local v24    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v25    # "$i$a$-forEach-LazyLayoutItemAnimator$releaseAnimations$1$1":I
    :cond_1
    nop

    .end local v18    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 717
    :cond_2
    nop

    .line 370
    .end local v12    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v21    # "$i$f$forEach":I
    nop

    .line 702
    .end local v17    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .end local v19    # "$i$a$-forEachValue-LazyLayoutItemAnimator$releaseAnimations$1":I
    nop

    .line 715
    .end local v15    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndexed-ScatterMap$forEachValue$1$iv":I
    goto :goto_4

    .line 712
    .end local v14    # "index$iv$iv":I
    .end local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v23    # "$i$f$forEachValue":I
    .restart local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "$i$f$forEachValue":I
    :cond_3
    move-object/from16 v22, v1

    move/from16 v23, v2

    move/from16 v20, v12

    .line 718
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$forEachValue":I
    .restart local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v23    # "$i$f$forEachValue":I
    :goto_4
    shr-long v9, v9, v20

    .line 711
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v20

    move-object/from16 v1, v22

    move/from16 v2, v23

    goto :goto_1

    .end local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v23    # "$i$f$forEachValue":I
    .restart local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "$i$f$forEachValue":I
    :cond_4
    move-object/from16 v22, v1

    move/from16 v23, v2

    move/from16 v20, v12

    .line 720
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$forEachValue":I
    .end local v13    # "j$iv$iv":I
    .restart local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v23    # "$i$f$forEachValue":I
    move/from16 v1, v20

    if-ne v11, v1, :cond_8

    goto :goto_5

    .line 708
    .end local v11    # "bitCount$iv$iv":I
    .end local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v23    # "$i$f$forEachValue":I
    .restart local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "$i$f$forEachValue":I
    :cond_5
    move-object/from16 v22, v1

    move/from16 v23, v2

    .line 706
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$forEachValue":I
    .end local v9    # "slot$iv$iv":J
    .restart local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v23    # "$i$f$forEachValue":I
    :goto_5
    if-eq v8, v7, :cond_7

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, v22

    move/from16 v2, v23

    goto/16 :goto_0

    .end local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v23    # "$i$f$forEachValue":I
    .restart local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "$i$f$forEachValue":I
    :cond_6
    move-object/from16 v22, v1

    move/from16 v23, v2

    .line 723
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$forEachValue":I
    .end local v8    # "i$iv$iv":I
    .restart local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v23    # "$i$f$forEachValue":I
    :cond_7
    nop

    .line 724
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v7    # "lastIndex$iv$iv":I
    :cond_8
    nop

    .line 371
    .end local v3    # "v$iv":[Ljava/lang/Object;
    .end local v22    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v23    # "$i$f$forEachValue":I
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 373
    :cond_9
    return-void
.end method

.method private final removeInfoForKey(Ljava/lang/Object;)V
    .locals 7
    .param p1, "key"    # Ljava/lang/Object;

    .line 353
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v0

    if-eqz v0, :cond_2

    .local v0, "$this$forEach$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 698
    .local v1, "$i$f$forEach":I
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    .local v5, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/4 v6, 0x0

    .line 353
    .local v6, "$i$a$-forEach-LazyLayoutItemAnimator$removeInfoForKey$1":I
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->release()V

    .line 698
    .end local v5    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v6    # "$i$a$-forEach-LazyLayoutItemAnimator$removeInfoForKey$1":I
    :cond_0
    nop

    .end local v4    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 699
    :cond_1
    nop

    .line 354
    .end local v0    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$forEach":I
    :cond_2
    return-void
.end method

.method private final startPlacementAnimationsIfNeeded(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V
    .locals 18
    .param p1, "item"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .param p2, "isMovingAway"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    .line 400
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 401
    .local v1, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v2

    .local v2, "$this$forEachIndexed$iv":[Ljava/lang/Object;
    const/4 v3, 0x0

    .line 728
    .local v3, "$i$f$forEachIndexed":I
    const/4 v4, 0x0

    .line 729
    .local v4, "index$iv":I
    array-length v5, v2

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v7, v2, v6

    .local v7, "item$iv":Ljava/lang/Object;
    add-int/lit8 v8, v4, 0x1

    .local v4, "placeableIndex":I
    .local v8, "index$iv":I
    move-object v9, v7

    .local v9, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/4 v10, 0x0

    .line 402
    .local v10, "$i$a$-forEachIndexed-LazyLayoutItemAnimator$startPlacementAnimationsIfNeeded$1":I
    if-eqz v9, :cond_2

    .line 403
    move-object/from16 v11, p1

    invoke-interface {v11, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    move-result-wide v12

    .line 404
    .local v12, "newTarget":J
    invoke-virtual {v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    move-result-wide v14

    .line 405
    .local v14, "currentTarget":J
    nop

    .line 406
    sget-object v16, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->Companion:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;

    move-object/from16 v17, v1

    .end local v1    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .local v17, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;->getNotInitialized-nOcc-ac()J

    move-result-wide v0

    invoke-static {v14, v15, v0, v1}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 407
    invoke-static {v14, v15, v12, v13}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 409
    invoke-static {v12, v13, v14, v15}, Landroidx/compose/ui/unit/IntOffset;->minus-qkQi6aY(JJ)J

    move-result-wide v0

    move-object/from16 v16, v2

    move/from16 v2, p2

    .end local v2    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .local v16, "$this$forEachIndexed$iv":[Ljava/lang/Object;
    invoke-virtual {v9, v0, v1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->animatePlacementDelta-ar5cAso(JZ)V

    goto :goto_1

    .line 407
    .end local v16    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .restart local v2    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    :cond_0
    move-object/from16 v16, v2

    move/from16 v2, p2

    .end local v2    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .restart local v16    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    goto :goto_1

    .line 406
    .end local v16    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .restart local v2    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    :cond_1
    move-object/from16 v16, v2

    move/from16 v2, p2

    .line 411
    .end local v2    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .restart local v16    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    :goto_1
    invoke-virtual {v9, v12, v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setRawOffset--gyyYBs(J)V

    goto :goto_2

    .line 402
    .end local v12    # "newTarget":J
    .end local v14    # "currentTarget":J
    .end local v16    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .end local v17    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v1    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v2    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    :cond_2
    move-object/from16 v11, p1

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    move/from16 v2, p2

    .line 413
    .end local v1    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .end local v2    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .restart local v16    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .restart local v17    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    :goto_2
    nop

    .line 729
    .end local v4    # "placeableIndex":I
    .end local v9    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v10    # "$i$a$-forEachIndexed-LazyLayoutItemAnimator$startPlacementAnimationsIfNeeded$1":I
    nop

    .end local v7    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    move v4, v8

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    goto :goto_0

    .line 730
    .end local v8    # "index$iv":I
    .end local v16    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .end local v17    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v1    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v2    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .local v4, "index$iv":I
    :cond_3
    nop

    .line 414
    .end local v2    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .end local v3    # "$i$f$forEachIndexed":I
    .end local v4    # "index$iv":I
    return-void
.end method

.method static synthetic startPlacementAnimationsIfNeeded$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ZILjava/lang/Object;)V
    .locals 0

    .line 399
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V

    return-void
.end method

.method private final updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 7
    .param p1, "$this$updateAndReturnOffsetFor"    # [I
    .param p2, "item"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([ITT;)I"
        }
    .end annotation

    .line 420
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getLane()I

    move-result v0

    .line 421
    .local v0, "lane":I
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getSpan()I

    move-result v1

    .line 422
    .local v1, "span":I
    const/4 v2, 0x0

    .line 423
    .local v2, "maxOffset":I
    move v3, v0

    .local v3, "i":I
    add-int v4, v0, v1

    :goto_0
    if-ge v3, v4, :cond_0

    .line 424
    aget v5, p1, v3

    invoke-interface {p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v6

    add-int/2addr v5, v6

    aput v5, p1, v3

    .line 425
    aget v5, p1, v3

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 423
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 427
    .end local v3    # "i":I
    :cond_0
    return v2
.end method


# virtual methods
.method public final getAnimation(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .locals 1
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "placeableIndex"    # I

    .line 417
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v0

    if-eqz v0, :cond_0

    aget-object v0, v0, p2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getMinSizeToFitDisappearingItems-YbymL2g()J
    .locals 24

    .line 432
    const-wide/16 v0, 0x0

    .local v0, "size":J
    sget-object v2, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v0

    .line 433
    move-object/from16 v2, p0

    iget-object v3, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    .local v3, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 731
    .local v4, "$i$f$fastForEach":I
    nop

    .line 732
    const/4 v5, 0x0

    .local v5, "index$iv":I
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_1

    .line 733
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 734
    .local v7, "item$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    .local v8, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/4 v9, 0x0

    .line 434
    .local v9, "$i$a$-fastForEach-LazyLayoutItemAnimator$minSizeToFitDisappearingItems$1":I
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    move-result-object v10

    .line 435
    .local v10, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    if-eqz v10, :cond_0

    .line 436
    nop

    .line 437
    nop

    .line 438
    move-wide v11, v0

    .local v11, "arg0$iv":J
    const/4 v13, 0x0

    .line 735
    .local v13, "$i$f$getWidth-impl":I
    move-wide v14, v11

    .local v14, "value$iv$iv":J
    const/16 v16, 0x0

    .line 736
    .local v16, "$i$f$unpackInt1":I
    const/16 v17, 0x20

    move-wide/from16 v18, v0

    .end local v0    # "size":J
    .local v18, "size":J
    shr-long v0, v14, v17

    long-to-int v0, v0

    .line 735
    .end local v14    # "value$iv$iv":J
    .end local v16    # "$i$f$unpackInt1":I
    nop

    .line 438
    .end local v11    # "arg0$iv":J
    .end local v13    # "$i$f$getWidth-impl":I
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    move-result-wide v11

    invoke-static {v11, v12}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v1

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->getSize-YbymL2g()J

    move-result-wide v11

    .restart local v11    # "arg0$iv":J
    const/4 v13, 0x0

    .line 735
    .restart local v13    # "$i$f$getWidth-impl":I
    move-wide v14, v11

    .restart local v14    # "value$iv$iv":J
    const/16 v16, 0x0

    .line 736
    .restart local v16    # "$i$f$unpackInt1":I
    move/from16 v20, v1

    shr-long v1, v14, v17

    long-to-int v1, v1

    .line 735
    .end local v14    # "value$iv$iv":J
    .end local v16    # "$i$f$unpackInt1":I
    nop

    .line 438
    .end local v11    # "arg0$iv":J
    .end local v13    # "$i$f$getWidth-impl":I
    add-int v1, v20, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 439
    move-wide/from16 v1, v18

    .local v1, "arg0$iv":J
    const/4 v11, 0x0

    .line 737
    .local v11, "$i$f$getHeight-impl":I
    move-wide v12, v1

    .local v12, "value$iv$iv":J
    const/4 v14, 0x0

    .line 738
    .local v14, "$i$f$unpackInt2":I
    const-wide v15, 0xffffffffL

    move/from16 v20, v0

    move-wide/from16 v21, v1

    .end local v1    # "arg0$iv":J
    .local v21, "arg0$iv":J
    and-long v0, v12, v15

    long-to-int v0, v0

    .line 737
    .end local v12    # "value$iv$iv":J
    .end local v14    # "$i$f$unpackInt2":I
    nop

    .line 439
    .end local v11    # "$i$f$getHeight-impl":I
    .end local v21    # "arg0$iv":J
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->getSize-YbymL2g()J

    move-result-wide v11

    .local v11, "arg0$iv":J
    const/4 v2, 0x0

    .line 737
    .local v2, "$i$f$getHeight-impl":I
    move-wide v13, v11

    .local v13, "value$iv$iv":J
    const/16 v21, 0x0

    .line 738
    .local v21, "$i$f$unpackInt2":I
    move/from16 v22, v1

    move/from16 v23, v2

    .end local v2    # "$i$f$getHeight-impl":I
    .local v23, "$i$f$getHeight-impl":I
    and-long v1, v13, v15

    long-to-int v1, v1

    .line 737
    .end local v13    # "value$iv$iv":J
    .end local v21    # "$i$f$unpackInt2":I
    nop

    .line 439
    .end local v11    # "arg0$iv":J
    .end local v23    # "$i$f$getHeight-impl":I
    add-int v1, v22, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 437
    move/from16 v1, v20

    .local v0, "height$iv":I
    .local v1, "width$iv":I
    const/4 v2, 0x0

    .line 739
    .local v2, "$i$f$IntSize":I
    const/4 v11, 0x0

    .line 740
    .local v11, "$i$f$packInts":I
    int-to-long v12, v1

    shl-long v12, v12, v17

    move v14, v1

    move/from16 v17, v2

    .end local v1    # "width$iv":I
    .end local v2    # "$i$f$IntSize":I
    .local v14, "width$iv":I
    .local v17, "$i$f$IntSize":I
    int-to-long v1, v0

    and-long/2addr v1, v15

    or-long/2addr v1, v12

    .line 739
    .end local v11    # "$i$f$packInts":I
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    move-result-wide v0

    .line 436
    .end local v0    # "height$iv":I
    .end local v14    # "width$iv":I
    .end local v17    # "$i$f$IntSize":I
    nop

    .end local v18    # "size":J
    .local v0, "size":J
    goto :goto_1

    .line 435
    :cond_0
    move-wide/from16 v18, v0

    .line 442
    :goto_1
    nop

    .line 734
    .end local v8    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v9    # "$i$a$-fastForEach-LazyLayoutItemAnimator$minSizeToFitDisappearingItems$1":I
    .end local v10    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    nop

    .line 732
    .end local v7    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, p0

    goto/16 :goto_0

    :cond_1
    move-wide/from16 v18, v0

    .line 741
    .end local v0    # "size":J
    .end local v5    # "index$iv":I
    .restart local v18    # "size":J
    nop

    .line 443
    .end local v3    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    return-wide v18
.end method

.method public final getModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    .line 446
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->modifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)V
    .locals 52
    .param p1, "consumedScroll"    # I
    .param p2, "layoutWidth"    # I
    .param p3, "layoutHeight"    # I
    .param p4, "positionedItems"    # Ljava/util/List;
    .param p5, "keyIndexMap"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;
    .param p6, "itemProvider"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;
    .param p7, "isVertical"    # Z
    .param p8, "isLookingAhead"    # Z
    .param p9, "laneCount"    # I
    .param p10, "hasLookaheadOccurred"    # Z
    .param p11, "layoutMinOffset"    # I
    .param p12, "layoutMaxOffset"    # I
    .param p13, "coroutineScope"    # Lkotlinx/coroutines/CoroutineScope;
    .param p14, "graphicsContext"    # Landroidx/compose/ui/graphics/GraphicsContext;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/util/List<",
            "TT;>;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider<",
            "TT;>;ZZIZII",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            ")V"
        }
    .end annotation

    .line 86
    move-object/from16 v0, p0

    move/from16 v6, p1

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move/from16 v11, p9

    iget-object v12, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyIndexMap:Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    .line 87
    .local v12, "previousKeyToIndexMap":Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;
    iput-object v10, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyIndexMap:Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    .line 89
    move-object/from16 v1, p4

    .local v1, "$this$fastAny$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 588
    .local v2, "$i$f$fastAny":I
    nop

    .line 589
    move-object v3, v1

    .local v3, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 590
    .local v4, "$i$f$fastForEach":I
    nop

    .line 591
    const/4 v5, 0x0

    .local v5, "index$iv$iv":I
    move-object v13, v3

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v13

    :goto_0
    if-ge v5, v13, :cond_1

    .line 592
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 593
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    .local v17, "it$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 589
    .local v18, "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    move-object/from16 v15, v17

    check-cast v15, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .local v15, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/16 v19, 0x0

    .line 89
    .local v19, "$i$a$-fastAny-LazyLayoutItemAnimator$onMeasured$hasAnimations$1":I
    invoke-direct {v0, v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getHasAnimations(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z

    move-result v15

    .line 589
    .end local v15    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v19    # "$i$a$-fastAny-LazyLayoutItemAnimator$onMeasured$hasAnimations$1":I
    if-eqz v15, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    .line 593
    .end local v17    # "it$iv":Ljava/lang/Object;
    .end local v18    # "$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv":I
    :cond_0
    nop

    .line 591
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 595
    .end local v5    # "index$iv$iv":I
    :cond_1
    nop

    .line 596
    .end local v3    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEach":I
    const/4 v1, 0x0

    .line 89
    .end local v1    # "$this$fastAny$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastAny":I
    :goto_1
    move v13, v1

    .line 90
    .local v13, "hasAnimations":Z
    if-nez v13, :cond_2

    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 92
    invoke-direct {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->releaseAnimations()V

    .line 93
    return-void

    .line 96
    :cond_2
    iget v15, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->firstVisibleIndex:I

    .line 97
    .local v15, "previousFirstVisibleIndex":I
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getIndex()I

    move-result v1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    iput v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->firstVisibleIndex:I

    .line 101
    const/16 v3, 0x20

    if-eqz p7, :cond_4

    .line 102
    const/4 v4, 0x0

    .local v4, "x$iv":I
    const/4 v5, 0x0

    .line 597
    .local v5, "$i$f$IntOffset":I
    const/16 v16, 0x0

    .line 598
    .local v16, "$i$f$packInts":I
    const-wide v17, 0xffffffffL

    int-to-long v1, v4

    shl-long/2addr v1, v3

    move/from16 v20, v15

    .end local v15    # "previousFirstVisibleIndex":I
    .local v20, "previousFirstVisibleIndex":I
    int-to-long v14, v6

    and-long v14, v14, v17

    or-long/2addr v1, v14

    .line 597
    .end local v16    # "$i$f$packInts":I
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v1

    .end local v4    # "x$iv":I
    .end local v5    # "$i$f$IntOffset":I
    goto :goto_3

    .line 104
    .end local v20    # "previousFirstVisibleIndex":I
    .restart local v15    # "previousFirstVisibleIndex":I
    :cond_4
    move/from16 v20, v15

    const-wide v17, 0xffffffffL

    .end local v15    # "previousFirstVisibleIndex":I
    .restart local v20    # "previousFirstVisibleIndex":I
    const/4 v1, 0x0

    .local v1, "y$iv":I
    const/4 v2, 0x0

    .line 599
    .local v2, "$i$f$IntOffset":I
    const/4 v4, 0x0

    .line 600
    .local v4, "$i$f$packInts":I
    int-to-long v14, v6

    shl-long/2addr v14, v3

    move v5, v2

    .end local v2    # "$i$f$IntOffset":I
    .restart local v5    # "$i$f$IntOffset":I
    int-to-long v2, v1

    and-long v2, v2, v17

    or-long/2addr v2, v14

    .line 599
    .end local v4    # "$i$f$packInts":I
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v2

    move-wide v1, v2

    .line 101
    .end local v1    # "y$iv":I
    .end local v5    # "$i$f$IntOffset":I
    :goto_3
    nop

    .line 100
    move-wide v14, v1

    .line 109
    .local v14, "scrollOffset":J
    if-nez p8, :cond_6

    if-nez p10, :cond_5

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v1, 0x1

    :goto_5
    move/from16 v16, v1

    .line 111
    .local v16, "shouldSetupAnimation":Z
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    check-cast v1, Landroidx/collection/ScatterMap;

    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v2, 0x0

    .line 601
    .local v2, "$i$f$forEachKey":I
    iget-object v3, v1, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 603
    .local v3, "k$iv":[Ljava/lang/Object;
    move-object v4, v1

    .local v4, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v5, 0x0

    .line 604
    .local v5, "$i$f$forEachIndexed":I
    move-object/from16 v17, v1

    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v17, "this_$iv":Landroidx/collection/ScatterMap;
    iget-object v1, v4, Landroidx/collection/ScatterMap;->metadata:[J

    .line 605
    .local v1, "m$iv$iv":[J
    move/from16 v18, v2

    .end local v2    # "$i$f$forEachKey":I
    .local v18, "$i$f$forEachKey":I
    array-length v2, v1

    move-object/from16 v21, v3

    .end local v3    # "k$iv":[Ljava/lang/Object;
    .local v21, "k$iv":[Ljava/lang/Object;
    const/4 v3, 0x2

    sub-int/2addr v2, v3

    .line 607
    .local v2, "lastIndex$iv$iv":I
    const/4 v3, 0x0

    .local v3, "i$iv$iv":I
    const-wide/16 v23, 0x80

    const-wide/16 v25, 0xff

    const/16 v27, 0x7

    const-wide v28, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    move-object/from16 v30, v4

    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .local v30, "this_$iv$iv":Landroidx/collection/ScatterMap;
    if-gt v3, v2, :cond_b

    .line 608
    :goto_6
    aget-wide v31, v1, v3

    .line 609
    .local v31, "slot$iv$iv":J
    move-wide/from16 v33, v31

    .local v33, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v35, 0x0

    .line 610
    .local v35, "$i$f$maskEmptyOrDeleted":I
    move/from16 v36, v5

    move-wide/from16 v4, v33

    const/16 v37, 0x8

    .end local v5    # "$i$f$forEachIndexed":I
    .end local v33    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v4, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v36, "$i$f$forEachIndexed":I
    not-long v6, v4

    shl-long v6, v6, v27

    and-long/2addr v6, v4

    and-long v4, v6, v28

    .line 609
    .end local v4    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v35    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v4, v4, v28

    if-eqz v4, :cond_a

    .line 611
    sub-int v4, v3, v2

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    rsub-int/lit8 v4, v4, 0x8

    .line 612
    .local v4, "bitCount$iv$iv":I
    const/4 v5, 0x0

    .local v5, "j$iv$iv":I
    :goto_7
    if-ge v5, v4, :cond_9

    .line 613
    and-long v6, v31, v25

    .local v6, "value$iv$iv$iv":J
    const/16 v33, 0x0

    .line 614
    .local v33, "$i$f$isFull":I
    cmp-long v34, v6, v23

    if-gez v34, :cond_7

    const/4 v6, 0x1

    goto :goto_8

    :cond_7
    const/4 v6, 0x0

    .line 613
    .end local v6    # "value$iv$iv$iv":J
    .end local v33    # "$i$f$isFull":I
    :goto_8
    if-eqz v6, :cond_8

    .line 615
    shl-int/lit8 v6, v3, 0x3

    add-int/2addr v6, v5

    .line 616
    .local v6, "index$iv$iv":I
    move v7, v6

    .local v7, "index$iv":I
    const/16 v33, 0x0

    .line 603
    .local v33, "$i$a$-forEachIndexed-ScatterMap$forEachKey$1$iv":I
    move-object/from16 v34, v1

    .end local v1    # "m$iv$iv":[J
    .local v34, "m$iv$iv":[J
    aget-object v1, v21, v7

    .local v1, "it":Ljava/lang/Object;
    const/16 v35, 0x0

    .line 111
    .local v35, "$i$a$-forEachKey-LazyLayoutItemAnimator$onMeasured$1":I
    move/from16 v38, v5

    .end local v5    # "j$iv$iv":I
    .local v38, "j$iv$iv":I
    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v5, v1}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 603
    .end local v1    # "it":Ljava/lang/Object;
    .end local v35    # "$i$a$-forEachKey-LazyLayoutItemAnimator$onMeasured$1":I
    nop

    .line 616
    .end local v7    # "index$iv":I
    .end local v33    # "$i$a$-forEachIndexed-ScatterMap$forEachKey$1$iv":I
    goto :goto_9

    .line 613
    .end local v6    # "index$iv$iv":I
    .end local v34    # "m$iv$iv":[J
    .end local v38    # "j$iv$iv":I
    .local v1, "m$iv$iv":[J
    .restart local v5    # "j$iv$iv":I
    :cond_8
    move-object/from16 v34, v1

    move/from16 v38, v5

    .line 618
    .end local v1    # "m$iv$iv":[J
    .end local v5    # "j$iv$iv":I
    .restart local v34    # "m$iv$iv":[J
    .restart local v38    # "j$iv$iv":I
    :goto_9
    shr-long v31, v31, v37

    .line 612
    add-int/lit8 v5, v38, 0x1

    move-object/from16 v1, v34

    .end local v38    # "j$iv$iv":I
    .restart local v5    # "j$iv$iv":I
    goto :goto_7

    .end local v34    # "m$iv$iv":[J
    .restart local v1    # "m$iv$iv":[J
    :cond_9
    move-object/from16 v34, v1

    move/from16 v38, v5

    .line 620
    .end local v1    # "m$iv$iv":[J
    .end local v5    # "j$iv$iv":I
    .restart local v34    # "m$iv$iv":[J
    move/from16 v1, v37

    if-ne v4, v1, :cond_d

    goto :goto_a

    .line 609
    .end local v4    # "bitCount$iv$iv":I
    .end local v34    # "m$iv$iv":[J
    .restart local v1    # "m$iv$iv":[J
    :cond_a
    move-object/from16 v34, v1

    move/from16 v1, v37

    .line 607
    .end local v1    # "m$iv$iv":[J
    .end local v31    # "slot$iv$iv":J
    .restart local v34    # "m$iv$iv":[J
    :goto_a
    if-eq v3, v2, :cond_c

    add-int/lit8 v3, v3, 0x1

    move/from16 v6, p1

    move-object/from16 v1, v34

    move/from16 v5, v36

    goto :goto_6

    .end local v34    # "m$iv$iv":[J
    .end local v36    # "$i$f$forEachIndexed":I
    .restart local v1    # "m$iv$iv":[J
    .local v5, "$i$f$forEachIndexed":I
    :cond_b
    move-object/from16 v34, v1

    move/from16 v36, v5

    const/16 v1, 0x8

    .line 623
    .end local v1    # "m$iv$iv":[J
    .end local v3    # "i$iv$iv":I
    .end local v5    # "$i$f$forEachIndexed":I
    .restart local v34    # "m$iv$iv":[J
    .restart local v36    # "$i$f$forEachIndexed":I
    :cond_c
    nop

    .line 624
    .end local v2    # "lastIndex$iv$iv":I
    .end local v30    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v34    # "m$iv$iv":[J
    .end local v36    # "$i$f$forEachIndexed":I
    :cond_d
    nop

    .line 113
    .end local v17    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v18    # "$i$f$forEachKey":I
    .end local v21    # "k$iv":[Ljava/lang/Object;
    move-object/from16 v2, p4

    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 625
    .local v3, "$i$f$fastForEach":I
    nop

    .line 626
    const/4 v4, 0x0

    .local v4, "index$iv":I
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_b
    if-ge v4, v5, :cond_21

    .line 627
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 628
    .local v17, "item$iv":Ljava/lang/Object;
    move-object/from16 v1, v17

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .local v1, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/16 v21, 0x0

    .line 115
    .local v21, "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$2":I
    iget-object v7, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroidx/collection/MutableScatterSet;->remove(Ljava/lang/Object;)Z

    .line 116
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getHasAnimations(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z

    move-result v6

    if-eqz v6, :cond_20

    .line 117
    iget-object v6, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 118
    .local v6, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    if-eqz v12, :cond_e

    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v12, v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;->getIndex(Ljava/lang/Object;)I

    move-result v7

    goto :goto_c

    :cond_e
    const/4 v7, -0x1

    .line 119
    .local v7, "previousIndex":I
    :goto_c
    move-object/from16 v31, v1

    const/4 v1, -0x1

    .end local v1    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .local v31, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    if-ne v7, v1, :cond_f

    if-eqz v12, :cond_f

    const/4 v1, 0x1

    goto :goto_d

    :cond_f
    const/4 v1, 0x0

    .line 121
    .local v1, "shouldAnimateAppearance":Z
    :goto_d
    if-nez v6, :cond_16

    .line 122
    move/from16 v40, v1

    .end local v1    # "shouldAnimateAppearance":Z
    .local v40, "shouldAnimateAppearance":Z
    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    invoke-direct {v1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V

    move-object/from16 v30, v1

    .line 123
    .local v30, "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    nop

    .line 124
    nop

    .line 125
    nop

    .line 126
    nop

    .line 127
    nop

    .line 128
    nop

    .line 123
    const/16 v37, 0x20

    const/16 v38, 0x0

    const/16 v36, 0x0

    move/from16 v34, p11

    move/from16 v35, p12

    move-object/from16 v32, p13

    move-object/from16 v33, p14

    invoke-static/range {v30 .. v38}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->updateAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;IIIILjava/lang/Object;)V

    .line 130
    move-object/from16 v41, v2

    move-object/from16 v2, v30

    move-object/from16 v1, v31

    .end local v30    # "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .end local v31    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .local v1, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .local v2, "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .local v41, "$this$fastForEach$iv":Ljava/util/List;
    move/from16 v42, v3

    .end local v3    # "$i$f$fastForEach":I
    .local v42, "$i$f$fastForEach":I
    iget-object v3, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    move/from16 v43, v4

    .end local v4    # "index$iv":I
    .local v43, "index$iv":I
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getIndex()I

    move-result v3

    if-eq v3, v7, :cond_11

    const/4 v3, -0x1

    if-eq v7, v3, :cond_11

    .line 132
    move/from16 v3, v20

    .end local v20    # "previousFirstVisibleIndex":I
    .local v3, "previousFirstVisibleIndex":I
    if-ge v7, v3, :cond_10

    .line 134
    iget-object v4, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v34, v3

    move/from16 v37, v5

    const/4 v3, 0x2

    goto/16 :goto_15

    .line 136
    :cond_10
    iget-object v4, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v34, v3

    move/from16 v37, v5

    const/4 v3, 0x2

    goto/16 :goto_15

    .line 131
    .end local v3    # "previousFirstVisibleIndex":I
    .restart local v20    # "previousFirstVisibleIndex":I
    :cond_11
    move/from16 v3, v20

    .line 139
    .end local v20    # "previousFirstVisibleIndex":I
    .restart local v3    # "previousFirstVisibleIndex":I
    nop

    .line 140
    nop

    .line 141
    const/4 v4, 0x0

    invoke-interface {v1, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    move-result-wide v30

    .line 629
    nop

    .local v30, "it":J
    const/4 v4, 0x0

    .line 141
    .local v4, "$i$a$-let-LazyLayoutItemAnimator$onMeasured$2$1":I
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->isVertical()Z

    move-result v20

    if-eqz v20, :cond_12

    invoke-static/range {v30 .. v31}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v20

    goto :goto_e

    :cond_12
    invoke-static/range {v30 .. v31}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v20

    :goto_e
    move/from16 v4, v20

    .line 142
    .end local v4    # "$i$a$-let-LazyLayoutItemAnimator$onMeasured$2$1":I
    .end local v30    # "it":J
    nop

    .line 139
    invoke-direct {v0, v1, v4, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->initializeAnimation(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V

    .line 144
    if-eqz v40, :cond_15

    .line 145
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v4

    .local v4, "$this$forEach$iv":[Ljava/lang/Object;
    const/16 v20, 0x0

    .line 630
    .local v20, "$i$f$forEach":I
    move-object/from16 v31, v1

    .end local v1    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .restart local v31    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    array-length v1, v4

    move-object/from16 v30, v2

    const/4 v2, 0x0

    .end local v2    # "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .local v30, "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    :goto_f
    if-ge v2, v1, :cond_14

    aget-object v32, v4, v2

    .local v32, "element$iv":Ljava/lang/Object;
    move-object/from16 v33, v32

    .local v33, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/16 v34, 0x0

    .line 145
    .local v34, "$i$a$-forEach-LazyLayoutItemAnimator$onMeasured$2$2":I
    if-eqz v33, :cond_13

    invoke-virtual/range {v33 .. v33}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->animateAppearance()V

    sget-object v35, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 630
    :cond_13
    nop

    .end local v32    # "element$iv":Ljava/lang/Object;
    .end local v33    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v34    # "$i$a$-forEach-LazyLayoutItemAnimator$onMeasured$2$2":I
    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    .line 631
    :cond_14
    move/from16 v34, v3

    move/from16 v37, v5

    move-object/from16 v1, v31

    const/4 v3, 0x2

    .end local v4    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v20    # "$i$f$forEach":I
    .end local v30    # "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    goto/16 :goto_15

    .line 144
    .end local v31    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .restart local v1    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .restart local v2    # "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    :cond_15
    move-object/from16 v31, v1

    move-object/from16 v30, v2

    .end local v1    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v2    # "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v30    # "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v31    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    move/from16 v34, v3

    move/from16 v37, v5

    const/4 v3, 0x2

    goto/16 :goto_15

    .line 149
    .end local v30    # "newItemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .end local v40    # "shouldAnimateAppearance":Z
    .end local v41    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v42    # "$i$f$fastForEach":I
    .end local v43    # "index$iv":I
    .local v1, "shouldAnimateAppearance":Z
    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    .local v3, "$i$f$fastForEach":I
    .local v4, "index$iv":I
    .local v20, "previousFirstVisibleIndex":I
    :cond_16
    move/from16 v40, v1

    move-object/from16 v41, v2

    move/from16 v42, v3

    move/from16 v43, v4

    move/from16 v3, v20

    .end local v1    # "shouldAnimateAppearance":Z
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v4    # "index$iv":I
    .end local v20    # "previousFirstVisibleIndex":I
    .local v3, "previousFirstVisibleIndex":I
    .restart local v40    # "shouldAnimateAppearance":Z
    .restart local v41    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v42    # "$i$f$fastForEach":I
    .restart local v43    # "index$iv":I
    if-eqz v16, :cond_1f

    .line 150
    nop

    .line 151
    nop

    .line 152
    nop

    .line 153
    nop

    .line 154
    nop

    .line 155
    nop

    .line 150
    const/16 v37, 0x20

    const/16 v38, 0x0

    const/16 v36, 0x0

    move/from16 v34, p11

    move/from16 v35, p12

    move-object/from16 v32, p13

    move-object/from16 v33, p14

    move-object/from16 v30, v6

    .end local v6    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .local v30, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    invoke-static/range {v30 .. v38}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->updateAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;IIIILjava/lang/Object;)V

    .line 157
    move-object/from16 v1, v31

    .end local v31    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .local v1, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v2

    .local v2, "$this$forEach$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 632
    .local v4, "$i$f$forEach":I
    array-length v6, v2

    move-object/from16 v20, v2

    const/4 v2, 0x0

    .end local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .local v20, "$this$forEach$iv":[Ljava/lang/Object;
    :goto_10
    if-ge v2, v6, :cond_19

    aget-object v31, v20, v2

    .local v31, "element$iv":Ljava/lang/Object;
    move-object/from16 v32, v31

    .local v32, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/16 v33, 0x0

    .line 158
    .local v33, "$i$a$-forEach-LazyLayoutItemAnimator$onMeasured$2$3":I
    nop

    .line 159
    if-eqz v32, :cond_18

    .line 160
    move/from16 v35, v2

    move/from16 v34, v3

    .end local v3    # "previousFirstVisibleIndex":I
    .local v34, "previousFirstVisibleIndex":I
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    move-result-wide v2

    sget-object v36, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->Companion:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;

    move/from16 v38, v4

    move/from16 v37, v5

    .end local v4    # "$i$f$forEach":I
    .local v38, "$i$f$forEach":I
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;->getNotInitialized-nOcc-ac()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v2

    if-nez v2, :cond_17

    .line 162
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    move-result-wide v2

    invoke-static {v2, v3, v14, v15}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    move-result-wide v2

    move-object/from16 v4, v32

    .end local v32    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v4, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    invoke-virtual {v4, v2, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setRawOffset--gyyYBs(J)V

    goto :goto_11

    .line 160
    .end local v4    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v32    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    :cond_17
    move-object/from16 v4, v32

    .end local v32    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v4    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    goto :goto_11

    .line 159
    .end local v34    # "previousFirstVisibleIndex":I
    .end local v38    # "$i$f$forEach":I
    .restart local v3    # "previousFirstVisibleIndex":I
    .local v4, "$i$f$forEach":I
    .restart local v32    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    :cond_18
    move/from16 v35, v2

    move/from16 v34, v3

    move/from16 v38, v4

    move/from16 v37, v5

    move-object/from16 v4, v32

    .line 164
    .end local v3    # "previousFirstVisibleIndex":I
    .end local v32    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v4, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v34    # "previousFirstVisibleIndex":I
    .restart local v38    # "$i$f$forEach":I
    :goto_11
    nop

    .line 632
    .end local v4    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v33    # "$i$a$-forEach-LazyLayoutItemAnimator$onMeasured$2$3":I
    nop

    .end local v31    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v2, v35, 0x1

    move/from16 v3, v34

    move/from16 v5, v37

    move/from16 v4, v38

    goto :goto_10

    .line 633
    .end local v34    # "previousFirstVisibleIndex":I
    .end local v38    # "$i$f$forEach":I
    .restart local v3    # "previousFirstVisibleIndex":I
    .local v4, "$i$f$forEach":I
    :cond_19
    move/from16 v34, v3

    move/from16 v38, v4

    move/from16 v37, v5

    .line 165
    .end local v3    # "previousFirstVisibleIndex":I
    .end local v4    # "$i$f$forEach":I
    .end local v20    # "$this$forEach$iv":[Ljava/lang/Object;
    .restart local v34    # "previousFirstVisibleIndex":I
    if-eqz v40, :cond_1e

    .line 166
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v2

    .restart local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    const/4 v3, 0x0

    .line 634
    .local v3, "$i$f$forEach":I
    array-length v4, v2

    const/4 v5, 0x0

    :goto_12
    if-ge v5, v4, :cond_1d

    aget-object v6, v2, v5

    .local v6, "element$iv":Ljava/lang/Object;
    move-object/from16 v20, v6

    .local v20, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/16 v31, 0x0

    .line 167
    .local v31, "$i$a$-forEach-LazyLayoutItemAnimator$onMeasured$2$4":I
    if-eqz v20, :cond_1c

    .line 168
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isDisappearanceAnimationInProgress()Z

    move-result v32

    if-eqz v32, :cond_1a

    .line 169
    move-object/from16 v32, v2

    .end local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .local v32, "$this$forEach$iv":[Ljava/lang/Object;
    iget-object v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    move/from16 v33, v3

    move-object/from16 v3, v20

    .end local v20    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v3, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v33, "$i$f$forEach":I
    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 170
    iget-object v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    if-eqz v2, :cond_1b

    invoke-static {v2}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_13

    .line 168
    .end local v32    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v33    # "$i$f$forEach":I
    .restart local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .local v3, "$i$f$forEach":I
    .restart local v20    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    :cond_1a
    move-object/from16 v32, v2

    move/from16 v33, v3

    move-object/from16 v3, v20

    .line 172
    .end local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v20    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v3, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v32    # "$this$forEach$iv":[Ljava/lang/Object;
    .restart local v33    # "$i$f$forEach":I
    :cond_1b
    :goto_13
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->animateAppearance()V

    goto :goto_14

    .line 167
    .end local v32    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v33    # "$i$f$forEach":I
    .restart local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .local v3, "$i$f$forEach":I
    .restart local v20    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    :cond_1c
    move-object/from16 v32, v2

    move/from16 v33, v3

    move-object/from16 v3, v20

    .line 174
    .end local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v20    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v3, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v32    # "$this$forEach$iv":[Ljava/lang/Object;
    .restart local v33    # "$i$f$forEach":I
    :goto_14
    nop

    .line 634
    .end local v3    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v31    # "$i$a$-forEach-LazyLayoutItemAnimator$onMeasured$2$4":I
    nop

    .end local v6    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v32

    move/from16 v3, v33

    goto :goto_12

    .line 635
    .end local v32    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v33    # "$i$f$forEach":I
    .restart local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .local v3, "$i$f$forEach":I
    :cond_1d
    move-object/from16 v32, v2

    move/from16 v33, v3

    .line 176
    .end local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v3    # "$i$f$forEach":I
    :cond_1e
    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v3, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ZILjava/lang/Object;)V

    .end local v7    # "previousIndex":I
    .end local v30    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .end local v40    # "shouldAnimateAppearance":Z
    goto :goto_15

    .line 149
    .end local v1    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v34    # "previousFirstVisibleIndex":I
    .local v3, "previousFirstVisibleIndex":I
    .local v6, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v7    # "previousIndex":I
    .local v31, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .restart local v40    # "shouldAnimateAppearance":Z
    :cond_1f
    move/from16 v34, v3

    move/from16 v37, v5

    move-object/from16 v30, v6

    move-object/from16 v1, v31

    const/4 v3, 0x2

    .end local v3    # "previousFirstVisibleIndex":I
    .end local v6    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .end local v31    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .restart local v1    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .restart local v30    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v34    # "previousFirstVisibleIndex":I
    goto :goto_15

    .line 181
    .end local v7    # "previousIndex":I
    .end local v30    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .end local v34    # "previousFirstVisibleIndex":I
    .end local v40    # "shouldAnimateAppearance":Z
    .end local v41    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v42    # "$i$f$fastForEach":I
    .end local v43    # "index$iv":I
    .local v2, "$this$fastForEach$iv":Ljava/util/List;
    .local v3, "$i$f$fastForEach":I
    .local v4, "index$iv":I
    .local v20, "previousFirstVisibleIndex":I
    :cond_20
    move-object/from16 v41, v2

    move/from16 v42, v3

    move/from16 v43, v4

    move/from16 v37, v5

    move/from16 v34, v20

    const/4 v3, 0x2

    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    .end local v4    # "index$iv":I
    .end local v20    # "previousFirstVisibleIndex":I
    .restart local v34    # "previousFirstVisibleIndex":I
    .restart local v41    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v42    # "$i$f$fastForEach":I
    .restart local v43    # "index$iv":I
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->removeInfoForKey(Ljava/lang/Object;)V

    .line 183
    :goto_15
    nop

    .line 628
    .end local v1    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v21    # "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$2":I
    nop

    .line 626
    .end local v17    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v43, 0x1

    move/from16 v20, v34

    move/from16 v5, v37

    move-object/from16 v2, v41

    move/from16 v3, v42

    const/16 v1, 0x8

    .end local v43    # "index$iv":I
    .restart local v4    # "index$iv":I
    goto/16 :goto_b

    .end local v34    # "previousFirstVisibleIndex":I
    .end local v41    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v42    # "$i$f$fastForEach":I
    .restart local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v3    # "$i$f$fastForEach":I
    .restart local v20    # "previousFirstVisibleIndex":I
    :cond_21
    move-object/from16 v41, v2

    move/from16 v42, v3

    move/from16 v43, v4

    move/from16 v34, v20

    const/4 v3, 0x2

    .line 636
    .end local v2    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEach":I
    .end local v4    # "index$iv":I
    .end local v20    # "previousFirstVisibleIndex":I
    .restart local v34    # "previousFirstVisibleIndex":I
    .restart local v41    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v42    # "$i$f$fastForEach":I
    nop

    .line 185
    .end local v41    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v42    # "$i$f$fastForEach":I
    new-array v6, v11, [I

    .line 186
    .local v6, "accumulatedOffsetPerLane":[I
    if-eqz v16, :cond_27

    if-eqz v12, :cond_27

    .line 187
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_24

    .line 188
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    .local v1, "$this$sortByDescending$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 637
    .local v2, "$i$f$sortByDescending":I
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_22

    new-instance v4, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1;

    invoke-direct {v4, v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V

    check-cast v4, Ljava/util/Comparator;

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 638
    :cond_22
    nop

    .line 189
    .end local v1    # "$this$sortByDescending$iv":Ljava/util/List;
    .end local v2    # "$i$f$sortByDescending":I
    iget-object v7, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    .local v7, "$this$fastForEach$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 639
    .local v17, "$i$f$fastForEach":I
    nop

    .line 640
    const/4 v1, 0x0

    .local v1, "index$iv":I
    move-object v2, v7

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_16
    if-ge v1, v2, :cond_23

    .line 641
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    .line 642
    .local v20, "item$iv":Ljava/lang/Object;
    move v4, v1

    .end local v1    # "index$iv":I
    .restart local v4    # "index$iv":I
    move-object/from16 v1, v20

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .local v1, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/16 v21, 0x0

    .line 190
    .local v21, "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$4":I
    invoke-direct {v0, v6, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v22

    .line 191
    .local v22, "accumulatedOffset":I
    move v5, v2

    sub-int v2, p11, v22

    .line 192
    .local v2, "mainAxisOffset":I
    move/from16 v30, v4

    .end local v4    # "index$iv":I
    .local v30, "index$iv":I
    const/4 v4, 0x4

    move/from16 v31, v5

    const/4 v5, 0x0

    move/from16 v32, v3

    const/4 v3, 0x0

    move-object/from16 v43, v6

    move/from16 v6, v32

    .end local v6    # "accumulatedOffsetPerLane":[I
    .local v43, "accumulatedOffsetPerLane":[I
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->initializeAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;ILjava/lang/Object;)V

    .line 193
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v6, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ZILjava/lang/Object;)V

    .line 194
    nop

    .line 642
    .end local v1    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v2    # "mainAxisOffset":I
    .end local v21    # "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$4":I
    .end local v22    # "accumulatedOffset":I
    nop

    .line 640
    .end local v20    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v1, v30, 0x1

    move v3, v6

    move/from16 v2, v31

    move-object/from16 v6, v43

    .end local v30    # "index$iv":I
    .local v1, "index$iv":I
    goto :goto_16

    .end local v43    # "accumulatedOffsetPerLane":[I
    .restart local v6    # "accumulatedOffsetPerLane":[I
    :cond_23
    move/from16 v30, v1

    move-object/from16 v43, v6

    move v6, v3

    .line 644
    .end local v1    # "index$iv":I
    .end local v6    # "accumulatedOffsetPerLane":[I
    .restart local v43    # "accumulatedOffsetPerLane":[I
    nop

    .line 195
    .end local v7    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v17    # "$i$f$fastForEach":I
    const/16 v47, 0x6

    const/16 v48, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    invoke-static/range {v43 .. v48}, Lkotlin/collections/ArraysKt;->fill$default([IIIIILjava/lang/Object;)V

    move-object/from16 v7, v43

    .end local v43    # "accumulatedOffsetPerLane":[I
    .local v7, "accumulatedOffsetPerLane":[I
    goto :goto_17

    .line 187
    .end local v7    # "accumulatedOffsetPerLane":[I
    .restart local v6    # "accumulatedOffsetPerLane":[I
    :cond_24
    move-object v7, v6

    move v6, v3

    .line 197
    .end local v6    # "accumulatedOffsetPerLane":[I
    .restart local v7    # "accumulatedOffsetPerLane":[I
    :goto_17
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_28

    .line 198
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    .local v1, "$this$sortBy$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 645
    .local v2, "$i$f$sortBy":I
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x1

    if-le v3, v5, :cond_25

    new-instance v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1;

    invoke-direct {v3, v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 646
    :cond_25
    nop

    .line 199
    .end local v1    # "$this$sortBy$iv":Ljava/util/List;
    .end local v2    # "$i$f$sortBy":I
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 647
    .restart local v17    # "$i$f$fastForEach":I
    nop

    .line 648
    const/4 v2, 0x0

    .local v2, "index$iv":I
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_18
    if-ge v2, v3, :cond_26

    .line 649
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    .line 650
    .local v18, "item$iv":Ljava/lang/Object;
    move-object v4, v1

    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .local v4, "$this$fastForEach$iv":Ljava/util/List;
    move-object/from16 v1, v18

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .local v1, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/16 v20, 0x0

    .line 200
    .local v20, "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$6":I
    invoke-direct {v0, v7, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v21

    .line 202
    .local v21, "accumulatedOffset":I
    add-int v5, p12, v21

    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v22

    sub-int v5, v5, v22

    .line 201
    nop

    .line 203
    .local v5, "mainAxisOffset":I
    move-object/from16 v22, v4

    .end local v4    # "$this$fastForEach$iv":Ljava/util/List;
    .local v22, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v4, 0x4

    move/from16 v30, v2

    move v2, v5

    .end local v5    # "mainAxisOffset":I
    .local v2, "mainAxisOffset":I
    .restart local v30    # "index$iv":I
    const/4 v5, 0x0

    move/from16 v31, v3

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->initializeAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;ILjava/lang/Object;)V

    .line 204
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v6, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ZILjava/lang/Object;)V

    .line 205
    nop

    .line 650
    .end local v1    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v2    # "mainAxisOffset":I
    .end local v20    # "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$6":I
    .end local v21    # "accumulatedOffset":I
    nop

    .line 648
    .end local v18    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v2, v30, 0x1

    move-object/from16 v1, v22

    move/from16 v3, v31

    .end local v30    # "index$iv":I
    .local v2, "index$iv":I
    goto :goto_18

    .end local v22    # "$this$fastForEach$iv":Ljava/util/List;
    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    :cond_26
    move-object/from16 v22, v1

    move/from16 v30, v2

    .line 652
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "index$iv":I
    .restart local v22    # "$this$fastForEach$iv":Ljava/util/List;
    nop

    .line 206
    .end local v17    # "$i$f$fastForEach":I
    .end local v22    # "$this$fastForEach$iv":Ljava/util/List;
    const/16 v47, 0x6

    const/16 v48, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    move-object/from16 v43, v7

    .end local v7    # "accumulatedOffsetPerLane":[I
    .restart local v43    # "accumulatedOffsetPerLane":[I
    invoke-static/range {v43 .. v48}, Lkotlin/collections/ArraysKt;->fill$default([IIIIILjava/lang/Object;)V

    .end local v43    # "accumulatedOffsetPerLane":[I
    .restart local v7    # "accumulatedOffsetPerLane":[I
    goto :goto_19

    .line 186
    .end local v7    # "accumulatedOffsetPerLane":[I
    .restart local v6    # "accumulatedOffsetPerLane":[I
    :cond_27
    move-object v7, v6

    move v6, v3

    .line 210
    .end local v6    # "accumulatedOffsetPerLane":[I
    .restart local v7    # "accumulatedOffsetPerLane":[I
    :cond_28
    :goto_19
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    check-cast v1, Landroidx/collection/ScatterSet;

    .local v1, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v2, 0x0

    .line 653
    .local v2, "$i$f$forEach":I
    nop

    .line 654
    iget-object v3, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 655
    .local v3, "elements$iv":[Ljava/lang/Object;
    move-object v4, v1

    .local v4, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v5, 0x0

    .line 656
    .local v5, "$i$f$forEachIndex":I
    nop

    .line 657
    move/from16 v22, v6

    iget-object v6, v4, Landroidx/collection/ScatterSet;->metadata:[J

    .line 658
    .local v6, "m$iv$iv":[J
    move-object/from16 v17, v1

    .end local v1    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v17, "this_$iv":Landroidx/collection/ScatterSet;
    array-length v1, v6

    add-int/lit8 v1, v1, -0x2

    .line 660
    .local v1, "lastIndex$iv$iv":I
    move/from16 v18, v2

    .end local v2    # "$i$f$forEach":I
    .local v18, "$i$f$forEach":I
    const/4 v2, 0x0

    .local v2, "i$iv$iv":I
    if-gt v2, v1, :cond_3f

    .line 661
    :goto_1a
    aget-wide v20, v6, v2

    .line 662
    .local v20, "slot$iv$iv":J
    move-wide/from16 v30, v20

    .local v30, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v22, 0x0

    .line 663
    .local v22, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v32, v3

    move-object/from16 v33, v4

    move-wide/from16 v3, v30

    move/from16 v30, v5

    move-object/from16 v31, v6

    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v5    # "$i$f$forEachIndex":I
    .end local v6    # "m$iv$iv":[J
    .local v3, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v30, "$i$f$forEachIndex":I
    .local v31, "m$iv$iv":[J
    .local v32, "elements$iv":[Ljava/lang/Object;
    .local v33, "this_$iv$iv":Landroidx/collection/ScatterSet;
    not-long v5, v3

    shl-long v5, v5, v27

    and-long/2addr v5, v3

    and-long v3, v5, v28

    .line 662
    .end local v3    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v22    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v3, v3, v28

    if-eqz v3, :cond_3e

    .line 664
    sub-int v3, v2, v1

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v4, 0x8

    rsub-int/lit8 v3, v3, 0x8

    .line 665
    .local v3, "bitCount$iv$iv":I
    const/4 v5, 0x0

    .local v5, "j$iv$iv":I
    :goto_1b
    if-ge v5, v3, :cond_3d

    .line 666
    and-long v35, v20, v25

    .local v35, "value$iv$iv$iv":J
    const/4 v6, 0x0

    .line 667
    .local v6, "$i$f$isFull":I
    cmp-long v22, v35, v23

    if-gez v22, :cond_29

    const/4 v6, 0x1

    goto :goto_1c

    :cond_29
    const/4 v6, 0x0

    .line 666
    .end local v6    # "$i$f$isFull":I
    .end local v35    # "value$iv$iv$iv":J
    :goto_1c
    if-eqz v6, :cond_3c

    .line 668
    shl-int/lit8 v6, v2, 0x3

    add-int/2addr v6, v5

    .line 669
    .local v6, "index$iv$iv":I
    move/from16 v22, v6

    .local v22, "index$iv":I
    const/16 v35, 0x0

    .line 655
    .local v35, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    move/from16 v37, v4

    aget-object v4, v32, v22

    .local v4, "key":Ljava/lang/Object;
    const/16 v36, 0x0

    .line 216
    .local v36, "$i$a$-forEach-LazyLayoutItemAnimator$onMeasured$7":I
    move/from16 v38, v5

    .end local v5    # "j$iv$iv":I
    .local v38, "j$iv$iv":I
    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v5, v4}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v41, v5

    check-cast v41, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    if-nez v41, :cond_2a

    move/from16 v48, v6

    move/from16 v49, v13

    const/16 v39, 0x0

    goto/16 :goto_24

    :cond_2a
    move-object/from16 v5, v41

    .line 217
    .local v5, "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    move/from16 v48, v6

    .end local v6    # "index$iv$iv":I
    .local v48, "index$iv$iv":I
    invoke-interface {v10, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;->getIndex(Ljava/lang/Object;)I

    move-result v6

    .line 221
    .local v6, "newIndex":I
    move/from16 v49, v13

    .end local v13    # "hasAnimations":Z
    .local v49, "hasAnimations":Z
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getSpan()I

    move-result v13

    invoke-static {v11, v13}, Ljava/lang/Math;->min(II)I

    move-result v13

    invoke-virtual {v5, v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->setSpan(I)V

    .line 222
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getSpan()I

    move-result v13

    sub-int v13, v11, v13

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getLane()I

    move-result v11

    invoke-static {v13, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-virtual {v5, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->setLane(I)V

    .line 224
    const/4 v11, -0x1

    if-ne v6, v11, :cond_34

    .line 225
    const/4 v13, 0x0

    .line 226
    .local v13, "isProgress":Z
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v11

    .local v11, "$this$forEachIndexed$iv":[Ljava/lang/Object;
    const/16 v40, 0x0

    .line 670
    .local v40, "$i$f$forEachIndexed":I
    const/16 v41, 0x0

    .line 671
    .local v41, "index$iv":I
    move-object/from16 v46, v5

    .end local v5    # "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .local v46, "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    array-length v5, v11

    move/from16 v42, v41

    move/from16 v41, v13

    const/4 v13, 0x0

    .end local v13    # "isProgress":Z
    .local v41, "isProgress":Z
    .local v42, "index$iv":I
    :goto_1d
    if-ge v13, v5, :cond_32

    aget-object v43, v11, v13

    .local v43, "item$iv":Ljava/lang/Object;
    add-int/lit8 v44, v42, 0x1

    .local v42, "index":I
    .local v44, "index$iv":I
    move-object/from16 v45, v43

    .local v45, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/16 v47, 0x0

    .line 227
    .local v47, "$i$a$-forEachIndexed-LazyLayoutItemAnimator$onMeasured$7$1":I
    if-eqz v45, :cond_31

    .line 228
    invoke-virtual/range {v45 .. v45}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isDisappearanceAnimationInProgress()Z

    move-result v50

    if-eqz v50, :cond_2b

    .line 229
    const/16 v41, 0x1

    move/from16 v50, v5

    move/from16 v51, v6

    move-object/from16 v6, v45

    const/16 v39, 0x0

    goto :goto_1e

    .line 230
    :cond_2b
    invoke-virtual/range {v45 .. v45}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isDisappearanceAnimationFinished()Z

    move-result v50

    if-eqz v50, :cond_2d

    .line 231
    invoke-virtual/range {v45 .. v45}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->release()V

    .line 232
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v50

    const/16 v39, 0x0

    aput-object v39, v50, v42

    .line 233
    move/from16 v50, v5

    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    move/from16 v51, v6

    move-object/from16 v6, v45

    .end local v45    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v6, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v51, "newIndex":I
    invoke-interface {v5, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 234
    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    if-eqz v5, :cond_2c

    invoke-static {v5}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2c
    const/16 v39, 0x0

    goto :goto_1e

    .line 236
    .end local v51    # "newIndex":I
    .local v6, "newIndex":I
    .restart local v45    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    :cond_2d
    move/from16 v50, v5

    move/from16 v51, v6

    move-object/from16 v6, v45

    .end local v45    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v6, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v51    # "newIndex":I
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    move-result-object v5

    if-eqz v5, :cond_2e

    .line 237
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->animateDisappearance()V

    .line 239
    :cond_2e
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isDisappearanceAnimationInProgress()Z

    move-result v5

    if-eqz v5, :cond_30

    .line 240
    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    if-eqz v5, :cond_2f

    invoke-static {v5}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 242
    :cond_2f
    const/4 v5, 0x1

    move/from16 v41, v5

    const/16 v39, 0x0

    .end local v41    # "isProgress":Z
    .local v5, "isProgress":Z
    goto :goto_1e

    .line 244
    .end local v5    # "isProgress":Z
    .restart local v41    # "isProgress":Z
    :cond_30
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->release()V

    .line 245
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v5

    const/16 v39, 0x0

    aput-object v39, v5, v42

    goto :goto_1e

    .line 227
    .end local v51    # "newIndex":I
    .local v6, "newIndex":I
    .restart local v45    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    :cond_31
    move/from16 v50, v5

    move/from16 v51, v6

    move-object/from16 v6, v45

    const/16 v39, 0x0

    .line 249
    .end local v45    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .local v6, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v51    # "newIndex":I
    :goto_1e
    nop

    .line 671
    .end local v6    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v42    # "index":I
    .end local v47    # "$i$a$-forEachIndexed-LazyLayoutItemAnimator$onMeasured$7$1":I
    nop

    .end local v43    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v13, v13, 0x1

    move/from16 v42, v44

    move/from16 v5, v50

    move/from16 v6, v51

    goto/16 :goto_1d

    .line 672
    .end local v44    # "index$iv":I
    .end local v51    # "newIndex":I
    .local v6, "newIndex":I
    .local v42, "index$iv":I
    :cond_32
    move/from16 v51, v6

    const/16 v39, 0x0

    .line 250
    .end local v6    # "newIndex":I
    .end local v11    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .end local v40    # "$i$f$forEachIndexed":I
    .end local v42    # "index$iv":I
    .restart local v51    # "newIndex":I
    if-nez v41, :cond_33

    .line 251
    invoke-direct {v0, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->removeInfoForKey(Ljava/lang/Object;)V

    move-object/from16 v41, v46

    move/from16 v5, v51

    .end local v41    # "isProgress":Z
    goto/16 :goto_23

    .line 250
    .restart local v41    # "isProgress":Z
    :cond_33
    move-object/from16 v41, v46

    move/from16 v5, v51

    goto/16 :goto_23

    .line 257
    .end local v41    # "isProgress":Z
    .end local v46    # "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .end local v51    # "newIndex":I
    .local v5, "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v6    # "newIndex":I
    :cond_34
    move-object/from16 v46, v5

    move/from16 v51, v6

    const/16 v39, 0x0

    .end local v5    # "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .end local v6    # "newIndex":I
    .restart local v46    # "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v51    # "newIndex":I
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getConstraints-DWUhwKw()Landroidx/compose/ui/unit/Constraints;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v44

    .line 258
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getLane()I

    move-result v42

    .line 259
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getSpan()I

    move-result v43

    .line 255
    nop

    .line 256
    nop

    .line 258
    nop

    .line 259
    nop

    .line 257
    nop

    .line 255
    move-object/from16 v40, p6

    move/from16 v41, v51

    .end local v51    # "newIndex":I
    .local v41, "newIndex":I
    invoke-interface/range {v40 .. v45}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;->getAndMeasure--hBUhpc(IIIJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    move-result-object v42

    .line 254
    move/from16 v5, v41

    .end local v41    # "newIndex":I
    .local v5, "newIndex":I
    move-object/from16 v6, v42

    .line 262
    .local v6, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/4 v11, 0x1

    invoke-interface {v6, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->setNonScrollableItem(Z)V

    .line 264
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v11

    .local v11, "$this$any$iv":[Ljava/lang/Object;
    const/4 v13, 0x0

    .line 673
    .local v13, "$i$f$any":I
    nop

    .end local v6    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .local v42, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    array-length v6, v11

    move-object/from16 v40, v11

    const/4 v11, 0x0

    .end local v11    # "$this$any$iv":[Ljava/lang/Object;
    .local v40, "$this$any$iv":[Ljava/lang/Object;
    :goto_1f
    if-ge v11, v6, :cond_38

    aget-object v41, v40, v11

    .local v41, "element$iv":Ljava/lang/Object;
    move-object/from16 v43, v41

    .local v43, "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/16 v44, 0x0

    .line 264
    .local v44, "$i$a$-any-LazyLayoutItemAnimator$onMeasured$7$inProgress$1":I
    if-eqz v43, :cond_35

    move/from16 v45, v6

    invoke-virtual/range {v43 .. v43}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isPlacementAnimationInProgress()Z

    move-result v6

    move/from16 v47, v11

    const/4 v11, 0x1

    if-ne v6, v11, :cond_36

    const/4 v6, 0x1

    goto :goto_20

    :cond_35
    move/from16 v45, v6

    move/from16 v47, v11

    :cond_36
    const/4 v6, 0x0

    .line 673
    .end local v43    # "it":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v44    # "$i$a$-any-LazyLayoutItemAnimator$onMeasured$7$inProgress$1":I
    :goto_20
    if-eqz v6, :cond_37

    const/4 v6, 0x1

    goto :goto_21

    .end local v41    # "element$iv":Ljava/lang/Object;
    :cond_37
    add-int/lit8 v11, v47, 0x1

    move/from16 v6, v45

    goto :goto_1f

    .line 674
    :cond_38
    const/4 v6, 0x0

    .line 264
    .end local v13    # "$i$f$any":I
    .end local v40    # "$this$any$iv":[Ljava/lang/Object;
    :goto_21
    nop

    .line 265
    .local v6, "inProgress":Z
    if-nez v6, :cond_3a

    if-eqz v12, :cond_39

    invoke-interface {v12, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;->getIndex(Ljava/lang/Object;)I

    move-result v11

    if-ne v5, v11, :cond_39

    const/4 v11, 0x1

    goto :goto_22

    :cond_39
    const/4 v11, 0x0

    :goto_22
    if-eqz v11, :cond_3a

    .line 266
    invoke-direct {v0, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->removeInfoForKey(Ljava/lang/Object;)V

    move-object/from16 v41, v46

    goto :goto_23

    .line 270
    :cond_3a
    nop

    .line 271
    nop

    .line 272
    nop

    .line 273
    nop

    .line 274
    nop

    .line 275
    nop

    .line 276
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getCrossAxisOffset()I

    move-result v47

    .line 270
    move/from16 v45, p11

    move-object/from16 v43, p13

    move-object/from16 v44, p14

    move-object/from16 v41, v46

    move/from16 v46, p12

    .end local v46    # "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .local v41, "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    invoke-virtual/range {v41 .. v47}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->updateAnimation(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;III)V

    .line 278
    move-object/from16 v11, v42

    .end local v42    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .local v11, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    iget v13, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->firstVisibleIndex:I

    if-ge v5, v13, :cond_3b

    .line 279
    iget-object v13, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    invoke-interface {v13, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_23

    .line 281
    :cond_3b
    iget-object v13, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    invoke-interface {v13, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 285
    .end local v6    # "inProgress":Z
    .end local v11    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    :goto_23
    nop

    .line 655
    .end local v4    # "key":Ljava/lang/Object;
    .end local v5    # "newIndex":I
    .end local v36    # "$i$a$-forEach-LazyLayoutItemAnimator$onMeasured$7":I
    .end local v41    # "info":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    :goto_24
    nop

    .line 669
    .end local v22    # "index$iv":I
    .end local v35    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_25

    .line 666
    .end local v38    # "j$iv$iv":I
    .end local v48    # "index$iv$iv":I
    .end local v49    # "hasAnimations":Z
    .local v5, "j$iv$iv":I
    .local v13, "hasAnimations":Z
    :cond_3c
    move/from16 v37, v4

    move/from16 v38, v5

    move/from16 v49, v13

    const/16 v39, 0x0

    .line 675
    .end local v5    # "j$iv$iv":I
    .end local v13    # "hasAnimations":Z
    .restart local v38    # "j$iv$iv":I
    .restart local v49    # "hasAnimations":Z
    :goto_25
    shr-long v20, v20, v37

    .line 665
    add-int/lit8 v5, v38, 0x1

    move/from16 v11, p9

    move/from16 v4, v37

    move/from16 v13, v49

    .end local v38    # "j$iv$iv":I
    .restart local v5    # "j$iv$iv":I
    goto/16 :goto_1b

    .end local v49    # "hasAnimations":Z
    .restart local v13    # "hasAnimations":Z
    :cond_3d
    move/from16 v37, v4

    move/from16 v38, v5

    move/from16 v49, v13

    const/16 v39, 0x0

    .line 677
    .end local v5    # "j$iv$iv":I
    .end local v13    # "hasAnimations":Z
    .restart local v49    # "hasAnimations":Z
    if-ne v3, v4, :cond_41

    goto :goto_26

    .line 662
    .end local v3    # "bitCount$iv$iv":I
    .end local v49    # "hasAnimations":Z
    .restart local v13    # "hasAnimations":Z
    :cond_3e
    move/from16 v49, v13

    const/16 v4, 0x8

    const/16 v39, 0x0

    .line 660
    .end local v13    # "hasAnimations":Z
    .end local v20    # "slot$iv$iv":J
    .restart local v49    # "hasAnimations":Z
    :goto_26
    if-eq v2, v1, :cond_40

    add-int/lit8 v2, v2, 0x1

    move/from16 v11, p9

    move/from16 v5, v30

    move-object/from16 v6, v31

    move-object/from16 v3, v32

    move-object/from16 v4, v33

    move/from16 v13, v49

    goto/16 :goto_1a

    .end local v30    # "$i$f$forEachIndex":I
    .end local v31    # "m$iv$iv":[J
    .end local v32    # "elements$iv":[Ljava/lang/Object;
    .end local v33    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v49    # "hasAnimations":Z
    .local v3, "elements$iv":[Ljava/lang/Object;
    .local v4, "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v5, "$i$f$forEachIndex":I
    .local v6, "m$iv$iv":[J
    .restart local v13    # "hasAnimations":Z
    :cond_3f
    move-object/from16 v32, v3

    move-object/from16 v33, v4

    move/from16 v30, v5

    move-object/from16 v31, v6

    move/from16 v49, v13

    .line 680
    .end local v2    # "i$iv$iv":I
    .end local v3    # "elements$iv":[Ljava/lang/Object;
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v5    # "$i$f$forEachIndex":I
    .end local v6    # "m$iv$iv":[J
    .end local v13    # "hasAnimations":Z
    .restart local v30    # "$i$f$forEachIndex":I
    .restart local v31    # "m$iv$iv":[J
    .restart local v32    # "elements$iv":[Ljava/lang/Object;
    .restart local v33    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .restart local v49    # "hasAnimations":Z
    :cond_40
    nop

    .line 681
    .end local v1    # "lastIndex$iv$iv":I
    .end local v30    # "$i$f$forEachIndex":I
    .end local v31    # "m$iv$iv":[J
    .end local v33    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_41
    nop

    .line 287
    .end local v17    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v18    # "$i$f$forEach":I
    .end local v32    # "elements$iv":[Ljava/lang/Object;
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_46

    .line 288
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    .local v1, "$this$sortByDescending$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 682
    .local v2, "$i$f$sortByDescending":I
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x1

    if-le v3, v5, :cond_42

    new-instance v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2;

    invoke-direct {v3, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 683
    :cond_42
    nop

    .line 289
    .end local v1    # "$this$sortByDescending$iv":Ljava/util/List;
    .end local v2    # "$i$f$sortByDescending":I
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 684
    .local v2, "$i$f$fastForEach":I
    nop

    .line 685
    const/4 v3, 0x0

    .local v3, "index$iv":I
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_27
    if-ge v3, v4, :cond_45

    .line 686
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 687
    .local v5, "item$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .local v6, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/4 v11, 0x0

    .line 290
    .local v11, "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$9":I
    iget-object v13, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    move-object/from16 v17, v1

    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .local v17, "$this$fastForEach$iv":Ljava/util/List;
    invoke-interface {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v13, v1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 291
    .local v1, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    invoke-direct {v0, v7, v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v13

    .line 293
    .local v13, "accumulatedOffset":I
    if-eqz p8, :cond_43

    .line 294
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v20, v1

    .end local v1    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .local v20, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    move-object/from16 v1, v18

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v1

    goto :goto_28

    .line 296
    .end local v20    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v1    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    :cond_43
    move-object/from16 v20, v1

    .end local v1    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v20    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getLayoutMinOffset()I

    move-result v1

    .line 297
    :goto_28
    nop

    .line 293
    sub-int/2addr v1, v13

    .line 292
    nop

    .line 299
    .local v1, "mainAxisOffset":I
    nop

    .line 300
    nop

    .line 301
    move/from16 v18, v2

    .end local v2    # "$i$f$fastForEach":I
    .local v18, "$i$f$fastForEach":I
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getCrossAxisOffset()I

    move-result v2

    .line 302
    nop

    .line 303
    nop

    .line 299
    move/from16 v21, v3

    move/from16 v3, p2

    .end local v3    # "index$iv":I
    .local v21, "index$iv":I
    invoke-interface {v6, v1, v2, v3, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->position(IIII)V

    .line 305
    if-eqz v16, :cond_44

    .line 306
    const/4 v2, 0x1

    invoke-direct {v0, v6, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V

    .line 308
    :cond_44
    nop

    .line 687
    .end local v1    # "mainAxisOffset":I
    .end local v6    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v11    # "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$9":I
    .end local v13    # "accumulatedOffset":I
    .end local v20    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    nop

    .line 685
    .end local v5    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v1, v21, 0x1

    move v3, v1

    move-object/from16 v1, v17

    move/from16 v2, v18

    .end local v21    # "index$iv":I
    .local v1, "index$iv":I
    goto :goto_27

    .end local v17    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastForEach":I
    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    .restart local v2    # "$i$f$fastForEach":I
    .restart local v3    # "index$iv":I
    :cond_45
    move-object/from16 v17, v1

    move/from16 v18, v2

    move/from16 v21, v3

    move/from16 v3, p2

    .line 689
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    .end local v3    # "index$iv":I
    .restart local v17    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v18    # "$i$f$fastForEach":I
    nop

    .line 309
    .end local v17    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastForEach":I
    const/16 v47, 0x6

    const/16 v48, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    move-object/from16 v43, v7

    .end local v7    # "accumulatedOffsetPerLane":[I
    .local v43, "accumulatedOffsetPerLane":[I
    invoke-static/range {v43 .. v48}, Lkotlin/collections/ArraysKt;->fill$default([IIIIILjava/lang/Object;)V

    .end local v43    # "accumulatedOffsetPerLane":[I
    .restart local v7    # "accumulatedOffsetPerLane":[I
    goto :goto_29

    .line 287
    :cond_46
    move/from16 v3, p2

    .line 312
    :goto_29
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4b

    .line 313
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    .local v1, "$this$sortBy$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 690
    .local v2, "$i$f$sortBy":I
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_47

    new-instance v4, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2;

    invoke-direct {v4, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V

    check-cast v4, Ljava/util/Comparator;

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 691
    :cond_47
    nop

    .line 314
    .end local v1    # "$this$sortBy$iv":Ljava/util/List;
    .end local v2    # "$i$f$sortBy":I
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 692
    .local v2, "$i$f$fastForEach":I
    nop

    .line 693
    const/4 v4, 0x0

    .local v4, "index$iv":I
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_2a
    if-ge v4, v5, :cond_4a

    .line 694
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 695
    .local v6, "item$iv":Ljava/lang/Object;
    move-object v11, v6

    check-cast v11, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .local v11, "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    const/4 v13, 0x0

    .line 315
    .local v13, "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$11":I
    move-object/from16 v17, v1

    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v17    # "$this$fastForEach$iv":Ljava/util/List;
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    move/from16 v18, v2

    .end local v2    # "$i$f$fastForEach":I
    .restart local v18    # "$i$f$fastForEach":I
    invoke-interface {v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 316
    .local v1, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    invoke-direct {v0, v7, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v2

    .line 318
    .local v2, "accumulatedOffset":I
    if-eqz p8, :cond_48

    .line 321
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v1

    .end local v1    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .local v21, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    move-object/from16 v1, v20

    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 322
    .local v1, "lastVisibleItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v20

    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v22

    add-int v20, v20, v22

    .end local v1    # "lastVisibleItem":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    goto :goto_2b

    .line 324
    .end local v21    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .local v1, "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    :cond_48
    move-object/from16 v21, v1

    .end local v1    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    .restart local v21    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getLayoutMaxOffset()I

    move-result v20

    .line 325
    :goto_2b
    invoke-interface {v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v1

    .line 318
    sub-int v20, v20, v1

    .line 325
    nop

    .line 318
    add-int v20, v20, v2

    .line 317
    move/from16 v1, v20

    .line 327
    .local v1, "mainAxisOffset":I
    nop

    .line 328
    nop

    .line 329
    move/from16 v20, v2

    .end local v2    # "accumulatedOffset":I
    .local v20, "accumulatedOffset":I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getCrossAxisOffset()I

    move-result v2

    .line 330
    nop

    .line 331
    nop

    .line 327
    invoke-interface {v11, v1, v2, v3, v8}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->position(IIII)V

    .line 334
    if-eqz v16, :cond_49

    .line 335
    const/4 v2, 0x1

    invoke-direct {v0, v11, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V

    goto :goto_2c

    .line 334
    :cond_49
    const/4 v2, 0x1

    .line 337
    :goto_2c
    nop

    .line 695
    .end local v1    # "mainAxisOffset":I
    .end local v11    # "item":Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;
    .end local v13    # "$i$a$-fastForEach-LazyLayoutItemAnimator$onMeasured$11":I
    .end local v20    # "accumulatedOffset":I
    .end local v21    # "itemInfo":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    nop

    .line 693
    .end local v6    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, v17

    move/from16 v2, v18

    goto :goto_2a

    .end local v17    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastForEach":I
    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    .local v2, "$i$f$fastForEach":I
    :cond_4a
    move-object/from16 v17, v1

    move/from16 v18, v2

    .line 697
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    .end local v4    # "index$iv":I
    .restart local v17    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v18    # "$i$f$fastForEach":I
    nop

    .line 342
    .end local v17    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastForEach":I
    :cond_4b
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    .line 629
    move-object v2, v1

    .local v2, "$this$onMeasured_u24lambda_u2418":Ljava/util/List;
    const/4 v4, 0x0

    .line 342
    .local v4, "$i$a$-apply-LazyLayoutItemAnimator$onMeasured$12":I
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->reverse(Ljava/util/List;)V

    .end local v2    # "$this$onMeasured_u24lambda_u2418":Ljava/util/List;
    .end local v4    # "$i$a$-apply-LazyLayoutItemAnimator$onMeasured$12":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    check-cast v1, Ljava/util/Collection;

    const/4 v4, 0x0

    invoke-interface {v9, v4, v1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 343
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v9, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 345
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 346
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 347
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 348
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 349
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 350
    return-void
.end method

.method public final reset()V
    .locals 1

    .line 361
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->releaseAnimations()V

    .line 362
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyIndexMap:Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    .line 363
    const/4 v0, -0x1

    iput v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->firstVisibleIndex:I

    .line 364
    return-void
.end method
