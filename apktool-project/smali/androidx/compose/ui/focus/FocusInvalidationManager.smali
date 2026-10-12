.class public final Landroidx/compose/ui/focus/FocusInvalidationManager;
.super Ljava/lang/Object;
.source "FocusInvalidationManager.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 12 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,275:1\n231#2,3:276\n200#2,7:279\n211#2,3:287\n214#2,9:291\n234#2:300\n231#2,3:334\n200#2,7:337\n211#2,3:345\n214#2,9:349\n234#2:358\n1399#3:286\n1270#3:290\n1399#3:344\n1270#3:348\n119#4,9:301\n119#4:325\n119#4:375\n119#4:497\n55#5:310\n90#6:311\n91#6,8:317\n100#6,7:327\n289#6,6:376\n437#6,6:382\n447#6,2:389\n449#6,8:394\n457#6,9:405\n466#6,8:417\n295#6:425\n148#6:426\n149#6,4:432\n153#6:437\n154#6,9:439\n437#6,37:448\n163#6,6:485\n296#6:491\n289#6,6:498\n437#6,6:504\n447#6,2:511\n449#6,8:516\n457#6,9:527\n466#6,8:539\n295#6:547\n148#6:548\n149#6,4:554\n153#6:559\n154#6,9:561\n437#6,37:570\n163#6,6:607\n296#6:613\n56#7,5:312\n56#7,5:427\n56#7,5:549\n56#7,5:621\n56#7,5:626\n56#7,5:631\n246#8:326\n246#8:388\n246#8:510\n34#9,6:359\n34#9,6:365\n34#9,4:371\n39#9:492\n34#9,4:493\n39#9:614\n34#9,6:615\n240#10,3:391\n243#10,3:414\n240#10,3:513\n243#10,3:536\n1101#11:402\n1083#11,2:403\n1101#11:524\n1083#11,2:525\n519#12:436\n44#12:438\n519#12:558\n44#12:560\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n124#1:276,3\n124#1:279,7\n124#1:287,3\n124#1:291,9\n124#1:300\n161#1:334,3\n161#1:337,7\n161#1:345,3\n161#1:349,9\n161#1:358\n124#1:286\n124#1:290\n161#1:344\n161#1:348\n133#1:301,9\n139#1:325\n193#1:375\n214#1:497\n133#1:310\n132#1:311\n132#1:317,8\n132#1:327,7\n193#1:376,6\n193#1:382,6\n193#1:389,2\n193#1:394,8\n193#1:405,9\n193#1:417,8\n193#1:425\n193#1:426\n193#1:432,4\n193#1:437\n193#1:439,9\n193#1:448,37\n193#1:485,6\n193#1:491\n214#1:498,6\n214#1:504,6\n214#1:511,2\n214#1:516,8\n214#1:527,9\n214#1:539,8\n214#1:547\n214#1:548\n214#1:554,4\n214#1:559\n214#1:561,9\n214#1:570,37\n214#1:607,6\n214#1:613\n132#1:312,5\n193#1:427,5\n214#1:549,5\n268#1:621,5\n271#1:626,5\n272#1:631,5\n139#1:326\n193#1:388\n214#1:510\n173#1:359,6\n174#1:365,6\n188#1:371,4\n188#1:492\n200#1:493,4\n200#1:614\n248#1:615,6\n193#1:391,3\n193#1:414,3\n214#1:513,3\n214#1:536,3\n193#1:402\n193#1:403,2\n214#1:524\n214#1:525,2\n193#1:436\n193#1:438\n214#1:558\n214#1:560\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0000\u0018\u00002\u00020\u0001BK\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\u0017J\u0008\u0010\u0019\u001a\u00020\u0005H\u0002J\u0008\u0010\u001a\u001a\u00020\u0005H\u0002J\u0008\u0010\u001b\u001a\u00020\u0005H\u0002J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\u0005J\u0008\u0010\u001f\u001a\u00020\u0005H\u0002J%\u0010\u001c\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\r2\u0006\u0010\u001d\u001a\u0002H H\u0002\u00a2\u0006\u0002\u0010!J%\u0010\"\u001a\u00020\u0005\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u00102\u0006\u0010\u001d\u001a\u0002H H\u0002\u00a2\u0006\u0002\u0010#R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusInvalidationManager;",
        "",
        "onRequestApplyChangesListener",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "",
        "invalidateOwnerFocusState",
        "rootFocusStateFetcher",
        "Landroidx/compose/ui/focus/FocusState;",
        "activeFocusTargetNodeFetcher",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "focusEventNodes",
        "Landroidx/collection/MutableScatterSet;",
        "Landroidx/compose/ui/focus/FocusEventModifierNode;",
        "focusEventNodesLegacy",
        "",
        "focusPropertiesNodesLegacy",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "focusTargetNodes",
        "focusTargetNodesLegacy",
        "focusTargetsWithInvalidatedFocusEventsLegacy",
        "isInvalidationScheduled",
        "",
        "hasPendingInvalidation",
        "invalidateNodes",
        "invalidateNodesLegacy",
        "invalidateNodesOptimized",
        "scheduleInvalidation",
        "node",
        "scheduleInvalidationForOwner",
        "setUpOnRequestApplyChangesListener",
        "T",
        "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V",
        "scheduleInvalidationLegacy",
        "(Ljava/util/List;Ljava/lang/Object;)V",
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
.field private final activeFocusTargetNodeFetcher:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            ">;"
        }
    .end annotation
.end field

.field private final focusEventNodes:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/ui/focus/FocusEventModifierNode;",
            ">;"
        }
    .end annotation
.end field

.field private final focusEventNodesLegacy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/focus/FocusEventModifierNode;",
            ">;"
        }
    .end annotation
.end field

.field private final focusPropertiesNodesLegacy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
            ">;"
        }
    .end annotation
.end field

.field private final focusTargetNodes:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            ">;"
        }
    .end annotation
.end field

.field private final focusTargetNodesLegacy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            ">;"
        }
    .end annotation
.end field

.field private final focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            ">;"
        }
    .end annotation
.end field

.field private final invalidateOwnerFocusState:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private isInvalidationScheduled:Z

.field private final onRequestApplyChangesListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final rootFocusStateFetcher:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/focus/FocusState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "onRequestApplyChangesListener"    # Lkotlin/jvm/functions/Function1;
    .param p2, "invalidateOwnerFocusState"    # Lkotlin/jvm/functions/Function0;
    .param p3, "rootFocusStateFetcher"    # Lkotlin/jvm/functions/Function0;
    .param p4, "activeFocusTargetNodeFetcher"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/ui/focus/FocusState;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            ">;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->onRequestApplyChangesListener:Lkotlin/jvm/functions/Function1;

    .line 38
    iput-object p2, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateOwnerFocusState:Lkotlin/jvm/functions/Function0;

    .line 39
    iput-object p3, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->rootFocusStateFetcher:Lkotlin/jvm/functions/Function0;

    .line 40
    iput-object p4, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->activeFocusTargetNodeFetcher:Lkotlin/jvm/functions/Function0;

    .line 42
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Landroidx/collection/MutableScatterSet;

    .line 43
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    .line 36
    return-void
.end method

.method public static final synthetic access$invalidateNodes(Landroidx/compose/ui/focus/FocusInvalidationManager;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 36
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateNodes()V

    return-void
.end method

.method private final invalidateNodes()V
    .locals 1

    .line 113
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-eqz v0, :cond_0

    .line 114
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateNodesOptimized()V

    goto :goto_0

    .line 116
    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateNodesLegacy()V

    .line 118
    :goto_0
    return-void
.end method

.method private final invalidateNodesLegacy()V
    .locals 45

    .line 171
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->rootFocusStateFetcher:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/focus/FocusState;

    invoke-interface {v1}, Landroidx/compose/ui/focus/FocusState;->getHasFocus()Z

    move-result v1

    if-nez v1, :cond_3

    .line 173
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 359
    .local v2, "$i$f$fastForEach":I
    nop

    .line 360
    const/4 v3, 0x0

    .local v3, "index$iv":I
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_0

    .line 361
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 362
    .local v5, "item$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .local v6, "it":Landroidx/compose/ui/focus/FocusEventModifierNode;
    const/4 v7, 0x0

    .line 173
    .local v7, "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$1":I
    sget-object v8, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    check-cast v8, Landroidx/compose/ui/focus/FocusState;

    invoke-interface {v6, v8}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 362
    .end local v6    # "it":Landroidx/compose/ui/focus/FocusEventModifierNode;
    .end local v7    # "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$1":I
    nop

    .line 360
    .end local v5    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 364
    .end local v3    # "index$iv":I
    :cond_0
    nop

    .line 174
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    .restart local v1    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 365
    .restart local v2    # "$i$f$fastForEach":I
    nop

    .line 366
    const/4 v3, 0x0

    .restart local v3    # "index$iv":I
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_1
    if-ge v3, v4, :cond_2

    .line 367
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 368
    .restart local v5    # "item$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v6, "node":Landroidx/compose/ui/focus/FocusTargetNode;
    const/4 v7, 0x0

    .line 175
    .local v7, "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$2":I
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->isAttached()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->isInitialized$ui_release()Z

    move-result v8

    if-nez v8, :cond_1

    .line 176
    sget-object v8, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-virtual {v6, v8}, Landroidx/compose/ui/focus/FocusTargetNode;->initializeFocusState$ui_release(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 178
    :cond_1
    nop

    .line 368
    .end local v6    # "node":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v7    # "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$2":I
    nop

    .line 366
    .end local v5    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 370
    .end local v3    # "index$iv":I
    :cond_2
    nop

    .line 179
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 180
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 181
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 182
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 183
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateOwnerFocusState:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 184
    return-void

    .line 188
    :cond_3
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    .restart local v1    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 371
    .restart local v2    # "$i$f$fastForEach":I
    nop

    .line 372
    const/4 v3, 0x0

    .restart local v3    # "index$iv":I
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_2
    const-string/jumbo v5, "visitChildren called on an unattached node"

    const/16 v6, 0x400

    if-ge v3, v4, :cond_26

    .line 373
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 374
    .local v9, "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .local v10, "it":Landroidx/compose/ui/focus/FocusPropertiesModifierNode;
    const/4 v11, 0x0

    .line 191
    .local v11, "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$3":I
    invoke-interface {v10}, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v12

    if-eqz v12, :cond_25

    .line 193
    move-object v12, v10

    check-cast v12, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v13, 0x0

    .line 375
    .local v13, "$i$f$getFocusTarget-OLwlOKw":I
    invoke-static {v6}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v6

    .line 193
    .end local v13    # "$i$f$getFocusTarget-OLwlOKw":I
    nop

    .line 376
    .local v6, "type$iv":I
    .local v12, "$this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 378
    const/4 v13, 0x0

    .line 376
    .local v13, "zOrder$iv":Z
    const/4 v14, 0x0

    .line 381
    .local v14, "$i$f$visitSelfAndChildren-Y-YKmho":I
    invoke-interface {v12}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v15

    .local v15, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 382
    .local v16, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v17, 0x0

    .line 383
    .local v17, "stack$iv$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .local v18, "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v15

    move-object/from16 v7, v18

    .line 384
    .end local v18    # "node$iv$iv":Ljava/lang/Object;
    .local v7, "node$iv$iv":Ljava/lang/Object;
    :goto_3
    if-eqz v7, :cond_10

    .line 385
    instance-of v8, v7, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v8, :cond_4

    .line 386
    move-object v8, v7

    check-cast v8, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v8, "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v20, 0x0

    .line 194
    .local v20, "$i$a$-visitSelfAndChildren-Y-YKmho$default-FocusInvalidationManager$invalidateNodesLegacy$3$1":I
    move-object/from16 v21, v1

    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .local v21, "$this$fastForEach$iv":Ljava/util/List;
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    nop

    .line 386
    .end local v8    # "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v20    # "$i$a$-visitSelfAndChildren-Y-YKmho$default-FocusInvalidationManager$invalidateNodesLegacy$3$1":I
    move/from16 v25, v2

    move/from16 v29, v3

    goto/16 :goto_a

    .line 387
    .end local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v1    # "$this$fastForEach$iv":Ljava/util/List;
    :cond_4
    move-object/from16 v21, v1

    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v21    # "$this$fastForEach$iv":Ljava/util/List;
    move-object v1, v7

    .local v1, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v8, 0x0

    .line 388
    .local v8, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v6

    if-eqz v20, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    .line 387
    .end local v1    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v8    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_4
    if-eqz v1, :cond_e

    instance-of v1, v7, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_e

    .line 389
    const/4 v1, 0x0

    .line 390
    .local v1, "count$iv$iv":I
    move-object v8, v7

    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v20, 0x0

    .line 391
    .local v20, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v22

    .line 392
    .local v22, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_5
    if-eqz v22, :cond_d

    .line 393
    move-object/from16 v23, v22

    .local v23, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v24, 0x0

    .line 394
    .local v24, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object/from16 v25, v23

    .local v25, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 388
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v6

    if-eqz v27, :cond_6

    const/16 v25, 0x1

    goto :goto_6

    :cond_6
    const/16 v25, 0x0

    .line 394
    .end local v25    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_6
    if-eqz v25, :cond_c

    .line 395
    add-int/lit8 v1, v1, 0x1

    .line 396
    move/from16 v25, v2

    const/4 v2, 0x1

    .end local v2    # "$i$f$fastForEach":I
    .local v25, "$i$f$fastForEach":I
    if-ne v1, v2, :cond_7

    .line 397
    move-object/from16 v7, v23

    move/from16 v29, v3

    move-object/from16 v3, v23

    goto :goto_9

    .line 401
    :cond_7
    if-nez v17, :cond_8

    const/4 v2, 0x0

    .line 402
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 403
    move/from16 v26, v1

    .end local v1    # "count$iv$iv":I
    .local v26, "count$iv$iv":I
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv":I
    const/16 v27, 0x0

    .line 404
    .local v27, "$i$f$MutableVector":I
    move/from16 v28, v2

    .end local v2    # "$i$f$mutableVectorOf":I
    .local v28, "$i$f$mutableVectorOf":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v29, v3

    .end local v3    # "index$iv":I
    .local v29, "index$iv":I
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v30, v1

    const/4 v1, 0x0

    .end local v1    # "capacity$iv$iv$iv$iv":I
    .local v30, "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 402
    .end local v27    # "$i$f$MutableVector":I
    .end local v30    # "capacity$iv$iv$iv$iv":I
    goto :goto_7

    .line 401
    .end local v26    # "count$iv$iv":I
    .end local v28    # "$i$f$mutableVectorOf":I
    .end local v29    # "index$iv":I
    .local v1, "count$iv$iv":I
    .restart local v3    # "index$iv":I
    :cond_8
    move/from16 v26, v1

    move/from16 v29, v3

    .end local v1    # "count$iv$iv":I
    .end local v3    # "index$iv":I
    .restart local v26    # "count$iv$iv":I
    .restart local v29    # "index$iv":I
    move-object/from16 v2, v17

    :goto_7
    nop

    .line 405
    .end local v17    # "stack$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv":Ljava/lang/Object;
    move-object v1, v7

    .line 406
    .local v1, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v1, :cond_a

    .line 407
    if-eqz v2, :cond_9

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 408
    :cond_9
    const/4 v3, 0x0

    move-object v7, v3

    .line 410
    :cond_a
    if-eqz v2, :cond_b

    move-object/from16 v3, v23

    .end local v23    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_8

    .end local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v23    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_b
    move-object/from16 v3, v23

    .end local v23    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_8
    move-object/from16 v17, v2

    move/from16 v1, v26

    goto :goto_9

    .line 394
    .end local v25    # "$i$f$fastForEach":I
    .end local v26    # "count$iv$iv":I
    .end local v29    # "index$iv":I
    .local v1, "count$iv$iv":I
    .local v2, "$i$f$fastForEach":I
    .local v3, "index$iv":I
    .restart local v17    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v23    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_c
    move/from16 v25, v2

    move/from16 v29, v3

    move-object/from16 v3, v23

    .line 413
    .end local v2    # "$i$f$fastForEach":I
    .end local v23    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v25    # "$i$f$fastForEach":I
    .restart local v29    # "index$iv":I
    :goto_9
    nop

    .line 393
    .end local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v24    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 414
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v22

    move/from16 v2, v25

    move/from16 v3, v29

    goto :goto_5

    .line 416
    .end local v25    # "$i$f$fastForEach":I
    .end local v29    # "index$iv":I
    .restart local v2    # "$i$f$fastForEach":I
    .local v3, "index$iv":I
    :cond_d
    move/from16 v25, v2

    move/from16 v29, v3

    .line 417
    .end local v2    # "$i$f$fastForEach":I
    .end local v3    # "index$iv":I
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v20    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v22    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v25    # "$i$f$fastForEach":I
    .restart local v29    # "index$iv":I
    const/4 v2, 0x1

    if-ne v1, v2, :cond_f

    .line 419
    move-object/from16 v1, v21

    move/from16 v2, v25

    move/from16 v3, v29

    goto/16 :goto_3

    .line 387
    .end local v1    # "count$iv$iv":I
    .end local v25    # "$i$f$fastForEach":I
    .end local v29    # "index$iv":I
    .restart local v2    # "$i$f$fastForEach":I
    .restart local v3    # "index$iv":I
    :cond_e
    move/from16 v25, v2

    move/from16 v29, v3

    .line 422
    .end local v2    # "$i$f$fastForEach":I
    .end local v3    # "index$iv":I
    .restart local v25    # "$i$f$fastForEach":I
    .restart local v29    # "index$iv":I
    :cond_f
    :goto_a
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    move-object/from16 v1, v21

    move/from16 v2, v25

    move/from16 v3, v29

    goto/16 :goto_3

    .line 424
    .end local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v25    # "$i$f$fastForEach":I
    .end local v29    # "index$iv":I
    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    .restart local v2    # "$i$f$fastForEach":I
    .restart local v3    # "index$iv":I
    :cond_10
    move-object/from16 v21, v1

    move/from16 v25, v2

    move/from16 v29, v3

    .line 425
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    .end local v3    # "index$iv":I
    .end local v7    # "node$iv$iv":Ljava/lang/Object;
    .end local v15    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v17    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v25    # "$i$f$fastForEach":I
    .restart local v29    # "index$iv":I
    move v1, v6

    .local v1, "mask$iv$iv":I
    move-object v2, v12

    .local v2, "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v3, 0x0

    .line 426
    .local v3, "$i$f$visitChildren":I
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v7

    .local v7, "value$iv$iv$iv":Z
    const/4 v8, 0x0

    .line 427
    .local v8, "$i$f$checkPrecondition":I
    nop

    .line 428
    if-nez v7, :cond_11

    .line 429
    const/4 v15, 0x0

    .line 426
    .local v15, "$i$a$-checkPrecondition-DelegatableNodeKt$visitChildren$1$iv$iv":I
    nop

    .line 429
    .end local v15    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitChildren$1$iv$iv":I
    invoke-static {v5}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 431
    :cond_11
    nop

    .line 432
    .end local v7    # "value$iv$iv$iv":Z
    .end local v8    # "$i$f$checkPrecondition":I
    const/4 v5, 0x0

    .line 402
    .local v5, "$i$f$mutableVectorOf":I
    nop

    .line 403
    const/16 v7, 0x10

    .local v7, "capacity$iv$iv$iv$iv":I
    const/4 v8, 0x0

    .line 404
    .local v8, "$i$f$MutableVector":I
    new-instance v15, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v16, v1

    .end local v1    # "mask$iv$iv":I
    .local v16, "mask$iv$iv":I
    new-array v1, v7, [Landroidx/compose/ui/Modifier$Node;

    move-object/from16 v17, v2

    const/4 v2, 0x0

    .end local v2    # "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v17, "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    invoke-direct {v15, v1, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 402
    .end local v7    # "capacity$iv$iv$iv$iv":I
    .end local v8    # "$i$f$MutableVector":I
    nop

    .line 432
    .end local v5    # "$i$f$mutableVectorOf":I
    nop

    .line 433
    .local v15, "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    invoke-interface/range {v17 .. v17}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    .line 434
    .local v1, "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-nez v1, :cond_12

    invoke-interface/range {v17 .. v17}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    invoke-static {v15, v2, v13}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    goto :goto_b

    :cond_12
    invoke-virtual {v15, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 435
    :goto_b
    move-object v2, v15

    .local v2, "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v5, 0x0

    .line 436
    .local v5, "$i$f$isNotEmpty":I
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v7

    if-eqz v7, :cond_13

    const/4 v2, 0x1

    goto :goto_c

    :cond_13
    const/4 v2, 0x0

    .end local v2    # "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v5    # "$i$f$isNotEmpty":I
    :goto_c
    if-eqz v2, :cond_24

    .line 437
    move-object v2, v15

    .restart local v2    # "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v5, 0x0

    .line 438
    .local v5, "$i$f$getLastIndex":I
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v7

    const/16 v19, 0x1

    add-int/lit8 v7, v7, -0x1

    .line 437
    .end local v2    # "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v5    # "$i$f$getLastIndex":I
    invoke-virtual {v15, v7}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/Modifier$Node;

    .line 439
    .local v2, "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v5

    and-int v5, v5, v16

    if-nez v5, :cond_14

    .line 440
    invoke-static {v15, v2, v13}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 442
    goto :goto_b

    .line 444
    :cond_14
    move-object v5, v2

    .line 445
    .local v5, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_d
    if-eqz v5, :cond_23

    .line 446
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v7

    and-int v7, v7, v16

    if-eqz v7, :cond_22

    .line 447
    move-object v7, v5

    .local v7, "it$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v8, 0x0

    .line 425
    .local v8, "$i$a$-visitChildren-DelegatableNodeKt$visitSelfAndChildren$1$iv":I
    move-object/from16 v20, v7

    .local v20, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v22, 0x0

    .line 448
    .local v22, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v23, 0x0

    .line 449
    .local v23, "stack$iv$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .local v24, "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v24, v20

    move-object/from16 v44, v24

    move-object/from16 v24, v1

    move-object/from16 v1, v44

    .line 450
    .local v1, "node$iv$iv":Ljava/lang/Object;
    .local v24, "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_e
    if-eqz v1, :cond_21

    .line 451
    move-object/from16 v26, v2

    .end local v2    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v26, "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    instance-of v2, v1, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v2, :cond_15

    .line 452
    move-object v2, v1

    check-cast v2, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v2, "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v27, 0x0

    .line 194
    .local v27, "$i$a$-visitSelfAndChildren-Y-YKmho$default-FocusInvalidationManager$invalidateNodesLegacy$3$1":I
    move/from16 v28, v3

    .end local v3    # "$i$f$visitChildren":I
    .local v28, "$i$f$visitChildren":I
    iget-object v3, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    nop

    .line 452
    .end local v2    # "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v27    # "$i$a$-visitSelfAndChildren-Y-YKmho$default-FocusInvalidationManager$invalidateNodesLegacy$3$1":I
    goto/16 :goto_15

    .line 453
    .end local v28    # "$i$f$visitChildren":I
    .restart local v3    # "$i$f$visitChildren":I
    :cond_15
    move/from16 v28, v3

    .end local v3    # "$i$f$visitChildren":I
    .restart local v28    # "$i$f$visitChildren":I
    move-object v2, v1

    .local v2, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v3, 0x0

    .line 388
    .local v3, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v6

    if-eqz v27, :cond_16

    const/4 v2, 0x1

    goto :goto_f

    :cond_16
    const/4 v2, 0x0

    .line 453
    .end local v2    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v3    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_f
    if-eqz v2, :cond_20

    instance-of v2, v1, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v2, :cond_20

    .line 458
    const/4 v2, 0x0

    .line 459
    .local v2, "count$iv$iv":I
    move-object v3, v1

    check-cast v3, Landroidx/compose/ui/node/DelegatingNode;

    .local v3, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 391
    .local v27, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v3}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v30

    .line 392
    .local v30, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_10
    if-eqz v30, :cond_1e

    .line 393
    move-object/from16 v31, v30

    .local v31, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v32, 0x0

    .line 460
    .local v32, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object/from16 v33, v31

    .local v33, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v34, 0x0

    .line 388
    .local v34, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v35

    and-int v35, v35, v6

    if-eqz v35, :cond_17

    const/16 v33, 0x1

    goto :goto_11

    :cond_17
    const/16 v33, 0x0

    .line 460
    .end local v33    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v34    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_11
    if-eqz v33, :cond_1d

    .line 461
    add-int/lit8 v2, v2, 0x1

    .line 462
    move-object/from16 v33, v1

    const/4 v1, 0x1

    .end local v1    # "node$iv$iv":Ljava/lang/Object;
    .local v33, "node$iv$iv":Ljava/lang/Object;
    if-ne v2, v1, :cond_18

    .line 463
    move-object/from16 v1, v31

    move-object/from16 v37, v3

    move-object/from16 v3, v31

    .end local v33    # "node$iv$iv":Ljava/lang/Object;
    .restart local v1    # "node$iv$iv":Ljava/lang/Object;
    goto :goto_14

    .line 467
    .end local v1    # "node$iv$iv":Ljava/lang/Object;
    .restart local v33    # "node$iv$iv":Ljava/lang/Object;
    :cond_18
    if-nez v23, :cond_19

    const/4 v1, 0x0

    .line 402
    .local v1, "$i$f$mutableVectorOf":I
    nop

    .line 403
    move/from16 v34, v1

    .end local v1    # "$i$f$mutableVectorOf":I
    .local v34, "$i$f$mutableVectorOf":I
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv":I
    const/16 v35, 0x0

    .line 404
    .local v35, "$i$f$MutableVector":I
    move/from16 v36, v2

    .end local v2    # "count$iv$iv":I
    .local v36, "count$iv$iv":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v37, v3

    .end local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v37, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v38, v1

    const/4 v1, 0x0

    .end local v1    # "capacity$iv$iv$iv$iv":I
    .local v38, "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 402
    .end local v35    # "$i$f$MutableVector":I
    .end local v38    # "capacity$iv$iv$iv$iv":I
    goto :goto_12

    .line 467
    .end local v34    # "$i$f$mutableVectorOf":I
    .end local v36    # "count$iv$iv":I
    .end local v37    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v2    # "count$iv$iv":I
    .restart local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    :cond_19
    move/from16 v36, v2

    move-object/from16 v37, v3

    .end local v2    # "count$iv$iv":I
    .end local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v36    # "count$iv$iv":I
    .restart local v37    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    move-object/from16 v2, v23

    :goto_12
    nop

    .line 468
    .end local v23    # "stack$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v1, v33

    .line 469
    .local v1, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v1, :cond_1b

    .line 470
    if-eqz v2, :cond_1a

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 471
    :cond_1a
    const/4 v3, 0x0

    move-object/from16 v33, v3

    .line 473
    :cond_1b
    if-eqz v2, :cond_1c

    move-object/from16 v3, v31

    .end local v31    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v23

    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_13

    .end local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1c
    move-object/from16 v3, v31

    .end local v31    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_13
    move-object/from16 v23, v2

    move-object/from16 v1, v33

    move/from16 v2, v36

    goto :goto_14

    .line 460
    .end local v33    # "node$iv$iv":Ljava/lang/Object;
    .end local v36    # "count$iv$iv":I
    .end local v37    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v1, "node$iv$iv":Ljava/lang/Object;
    .local v2, "count$iv$iv":I
    .local v3, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v23    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v31    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1d
    move-object/from16 v33, v1

    move-object/from16 v37, v3

    move-object/from16 v3, v31

    .line 476
    .end local v31    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v37    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    :goto_14
    nop

    .line 393
    .end local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v32    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 414
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v30

    move-object/from16 v3, v37

    goto :goto_10

    .line 416
    .end local v37    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v3, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    :cond_1e
    move-object/from16 v33, v1

    move-object/from16 v37, v3

    .line 477
    .end local v1    # "node$iv$iv":Ljava/lang/Object;
    .end local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v30    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v33    # "node$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x1

    if-ne v2, v1, :cond_1f

    .line 479
    move-object/from16 v2, v26

    move/from16 v3, v28

    move-object/from16 v1, v33

    goto/16 :goto_e

    .line 477
    :cond_1f
    move-object/from16 v1, v33

    .line 482
    .end local v2    # "count$iv$iv":I
    .end local v33    # "node$iv$iv":Ljava/lang/Object;
    .restart local v1    # "node$iv$iv":Ljava/lang/Object;
    :cond_20
    :goto_15
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    move-object/from16 v2, v26

    move/from16 v3, v28

    goto/16 :goto_e

    .line 484
    .end local v26    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "$i$f$visitChildren":I
    .local v2, "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "$i$f$visitChildren":I
    :cond_21
    move-object/from16 v26, v2

    move/from16 v28, v3

    .line 425
    .end local v1    # "node$iv$iv":Ljava/lang/Object;
    .end local v2    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v3    # "$i$f$visitChildren":I
    .end local v20    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v23    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v26    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v28    # "$i$f$visitChildren":I
    nop

    .line 447
    .end local v7    # "it$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v8    # "$i$a$-visitChildren-DelegatableNodeKt$visitSelfAndChildren$1$iv":I
    nop

    .line 485
    move-object/from16 v1, v24

    goto/16 :goto_b

    .line 487
    .end local v24    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "$i$f$visitChildren":I
    .local v1, "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "$i$f$visitChildren":I
    :cond_22
    move-object/from16 v24, v1

    move-object/from16 v26, v2

    move/from16 v28, v3

    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v3    # "$i$f$visitChildren":I
    .restart local v24    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v26    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v28    # "$i$f$visitChildren":I
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v5

    goto/16 :goto_d

    .line 445
    .end local v24    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "$i$f$visitChildren":I
    .restart local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "$i$f$visitChildren":I
    :cond_23
    move-object/from16 v24, v1

    move-object/from16 v26, v2

    move/from16 v28, v3

    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v3    # "$i$f$visitChildren":I
    .restart local v24    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v26    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v28    # "$i$f$visitChildren":I
    goto/16 :goto_b

    .line 490
    .end local v5    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v24    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "$i$f$visitChildren":I
    .restart local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "$i$f$visitChildren":I
    :cond_24
    move-object/from16 v24, v1

    move/from16 v28, v3

    .line 491
    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v3    # "$i$f$visitChildren":I
    .end local v15    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v16    # "mask$iv$iv":I
    .end local v17    # "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 196
    .end local v6    # "type$iv":I
    .end local v12    # "$this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "zOrder$iv":Z
    .end local v14    # "$i$f$visitSelfAndChildren-Y-YKmho":I
    goto :goto_16

    .line 191
    .end local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v25    # "$i$f$fastForEach":I
    .end local v29    # "index$iv":I
    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    .local v2, "$i$f$fastForEach":I
    .local v3, "index$iv":I
    :cond_25
    move-object/from16 v21, v1

    move/from16 v25, v2

    move/from16 v29, v3

    .line 374
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    .end local v3    # "index$iv":I
    .end local v10    # "it":Landroidx/compose/ui/focus/FocusPropertiesModifierNode;
    .end local v11    # "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$3":I
    .restart local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v25    # "$i$f$fastForEach":I
    .restart local v29    # "index$iv":I
    :goto_16
    nop

    .line 372
    .end local v9    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v3, v29, 0x1

    move-object/from16 v1, v21

    move/from16 v2, v25

    .end local v29    # "index$iv":I
    .restart local v3    # "index$iv":I
    goto/16 :goto_2

    .end local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v25    # "$i$f$fastForEach":I
    .restart local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v2    # "$i$f$fastForEach":I
    :cond_26
    move-object/from16 v21, v1

    move/from16 v25, v2

    move/from16 v29, v3

    .line 492
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    .end local v3    # "index$iv":I
    .restart local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v25    # "$i$f$fastForEach":I
    nop

    .line 197
    .end local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v25    # "$i$f$fastForEach":I
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 200
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    .restart local v1    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 493
    .restart local v2    # "$i$f$fastForEach":I
    nop

    .line 494
    const/4 v3, 0x0

    .restart local v3    # "index$iv":I
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_17
    if-ge v3, v4, :cond_51

    .line 495
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 496
    .local v7, "item$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .local v8, "focusEventNode":Landroidx/compose/ui/focus/FocusEventModifierNode;
    const/4 v9, 0x0

    .line 206
    .local v9, "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$4":I
    invoke-interface {v8}, Landroidx/compose/ui/focus/FocusEventModifierNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v10

    if-nez v10, :cond_27

    .line 207
    sget-object v10, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    check-cast v10, Landroidx/compose/ui/focus/FocusState;

    invoke-interface {v8, v10}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 208
    move-object/from16 v23, v1

    move/from16 v25, v2

    move/from16 v33, v3

    const/4 v1, 0x1

    goto/16 :goto_30

    .line 211
    :cond_27
    const/4 v10, 0x0

    .local v10, "requiresUpdate":Z
    const/4 v10, 0x1

    .line 212
    const/4 v11, 0x0

    .line 213
    .local v11, "aggregatedNode":Z
    const/4 v12, 0x0

    .line 214
    .local v12, "focusTarget":Ljava/lang/Object;
    move-object v13, v8

    check-cast v13, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v14, 0x0

    .line 497
    .local v14, "$i$f$getFocusTarget-OLwlOKw":I
    invoke-static {v6}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v14

    .line 214
    .end local v14    # "$i$f$getFocusTarget-OLwlOKw":I
    nop

    .line 498
    .local v13, "$this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v14, "type$iv":I
    nop

    .line 500
    const/4 v15, 0x0

    .line 498
    .local v15, "zOrder$iv":Z
    const/16 v16, 0x0

    .line 503
    .local v16, "$i$f$visitSelfAndChildren-Y-YKmho":I
    invoke-interface {v13}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    .local v17, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 504
    .local v20, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v21, 0x0

    .line 505
    .local v21, "stack$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .local v22, "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v17

    move-object/from16 v6, v22

    .line 506
    .end local v22    # "node$iv$iv":Ljava/lang/Object;
    .local v6, "node$iv$iv":Ljava/lang/Object;
    :goto_18
    if-eqz v6, :cond_36

    .line 507
    move-object/from16 v23, v1

    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .local v23, "$this$fastForEach$iv":Ljava/util/List;
    instance-of v1, v6, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v1, :cond_2a

    .line 508
    move-object v1, v6

    check-cast v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v1, "it":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v24, 0x0

    .line 218
    .local v24, "$i$a$-visitSelfAndChildren-Y-YKmho$default-FocusInvalidationManager$invalidateNodesLegacy$4$1":I
    if-eqz v12, :cond_28

    .line 219
    const/4 v11, 0x1

    .line 222
    :cond_28
    move-object v12, v1

    .line 228
    move/from16 v25, v2

    .end local v2    # "$i$f$fastForEach":I
    .restart local v25    # "$i$f$fastForEach":I
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    .line 229
    const/4 v10, 0x0

    .line 230
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    goto :goto_19

    .line 233
    :cond_29
    nop

    .line 508
    .end local v1    # "it":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v24    # "$i$a$-visitSelfAndChildren-Y-YKmho$default-FocusInvalidationManager$invalidateNodesLegacy$4$1":I
    :goto_19
    move/from16 v33, v3

    goto/16 :goto_20

    .line 509
    .end local v25    # "$i$f$fastForEach":I
    .restart local v2    # "$i$f$fastForEach":I
    :cond_2a
    move/from16 v25, v2

    .end local v2    # "$i$f$fastForEach":I
    .restart local v25    # "$i$f$fastForEach":I
    move-object v1, v6

    .local v1, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 510
    .local v2, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v24

    and-int v24, v24, v14

    if-eqz v24, :cond_2b

    const/4 v1, 0x1

    goto :goto_1a

    :cond_2b
    const/4 v1, 0x0

    .line 509
    .end local v1    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1a
    if-eqz v1, :cond_34

    instance-of v1, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_34

    .line 511
    const/4 v1, 0x0

    .line 512
    .local v1, "count$iv$iv":I
    move-object v2, v6

    check-cast v2, Landroidx/compose/ui/node/DelegatingNode;

    .local v2, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v24, 0x0

    .line 513
    .local v24, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v2}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v26

    .line 514
    .local v26, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_1b
    if-eqz v26, :cond_33

    .line 515
    move-object/from16 v27, v26

    .local v27, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v28, 0x0

    .line 516
    .local v28, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object/from16 v29, v27

    .local v29, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 510
    .local v30, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v31

    and-int v31, v31, v14

    if-eqz v31, :cond_2c

    const/16 v29, 0x1

    goto :goto_1c

    :cond_2c
    const/16 v29, 0x0

    .line 516
    .end local v29    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1c
    if-eqz v29, :cond_32

    .line 517
    add-int/lit8 v1, v1, 0x1

    .line 518
    move-object/from16 v29, v2

    const/4 v2, 0x1

    .end local v2    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v29, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    if-ne v1, v2, :cond_2d

    .line 519
    move-object/from16 v6, v27

    move/from16 v33, v3

    move-object/from16 v3, v27

    goto :goto_1f

    .line 523
    :cond_2d
    if-nez v21, :cond_2e

    const/4 v2, 0x0

    .line 524
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 525
    move/from16 v30, v1

    .end local v1    # "count$iv$iv":I
    .local v30, "count$iv$iv":I
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv":I
    const/16 v31, 0x0

    .line 526
    .local v31, "$i$f$MutableVector":I
    move/from16 v32, v2

    .end local v2    # "$i$f$mutableVectorOf":I
    .local v32, "$i$f$mutableVectorOf":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v33, v3

    .end local v3    # "index$iv":I
    .local v33, "index$iv":I
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v34, v1

    const/4 v1, 0x0

    .end local v1    # "capacity$iv$iv$iv$iv":I
    .local v34, "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 524
    .end local v31    # "$i$f$MutableVector":I
    .end local v34    # "capacity$iv$iv$iv$iv":I
    goto :goto_1d

    .line 523
    .end local v30    # "count$iv$iv":I
    .end local v32    # "$i$f$mutableVectorOf":I
    .end local v33    # "index$iv":I
    .local v1, "count$iv$iv":I
    .restart local v3    # "index$iv":I
    :cond_2e
    move/from16 v30, v1

    move/from16 v33, v3

    .end local v1    # "count$iv$iv":I
    .end local v3    # "index$iv":I
    .restart local v30    # "count$iv$iv":I
    .restart local v33    # "index$iv":I
    move-object/from16 v2, v21

    :goto_1d
    nop

    .line 527
    .end local v21    # "stack$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv":Ljava/lang/Object;
    move-object v1, v6

    .line 528
    .local v1, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v1, :cond_30

    .line 529
    if-eqz v2, :cond_2f

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 530
    :cond_2f
    const/4 v3, 0x0

    move-object v6, v3

    .line 532
    :cond_30
    if-eqz v2, :cond_31

    move-object/from16 v3, v27

    .end local v27    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v21

    invoke-static/range {v21 .. v21}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_1e

    .end local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v27    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_31
    move-object/from16 v3, v27

    .end local v27    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_1e
    move-object/from16 v21, v2

    move/from16 v1, v30

    goto :goto_1f

    .line 516
    .end local v29    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v30    # "count$iv$iv":I
    .end local v33    # "index$iv":I
    .local v1, "count$iv$iv":I
    .local v2, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v3, "index$iv":I
    .restart local v21    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v27    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_32
    move-object/from16 v29, v2

    move/from16 v33, v3

    move-object/from16 v3, v27

    .line 535
    .end local v2    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v33    # "index$iv":I
    :goto_1f
    nop

    .line 515
    .end local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 536
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v26

    move-object/from16 v2, v29

    move/from16 v3, v33

    goto :goto_1b

    .line 538
    .end local v29    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v33    # "index$iv":I
    .restart local v2    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v3, "index$iv":I
    :cond_33
    move-object/from16 v29, v2

    move/from16 v33, v3

    .line 539
    .end local v2    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v3    # "index$iv":I
    .end local v24    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v26    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v33    # "index$iv":I
    const/4 v2, 0x1

    if-ne v1, v2, :cond_35

    .line 541
    move-object/from16 v1, v23

    move/from16 v2, v25

    move/from16 v3, v33

    goto/16 :goto_18

    .line 509
    .end local v1    # "count$iv$iv":I
    .end local v33    # "index$iv":I
    .restart local v3    # "index$iv":I
    :cond_34
    move/from16 v33, v3

    .line 544
    .end local v3    # "index$iv":I
    .restart local v33    # "index$iv":I
    :cond_35
    :goto_20
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v1, v23

    move/from16 v2, v25

    move/from16 v3, v33

    goto/16 :goto_18

    .line 546
    .end local v23    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v25    # "$i$f$fastForEach":I
    .end local v33    # "index$iv":I
    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    .local v2, "$i$f$fastForEach":I
    .restart local v3    # "index$iv":I
    :cond_36
    move-object/from16 v23, v1

    move/from16 v25, v2

    move/from16 v33, v3

    .line 547
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    .end local v3    # "index$iv":I
    .end local v6    # "node$iv$iv":Ljava/lang/Object;
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v21    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v23    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v25    # "$i$f$fastForEach":I
    .restart local v33    # "index$iv":I
    move v1, v14

    .local v1, "mask$iv$iv":I
    move-object v2, v13

    .local v2, "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v3, 0x0

    .line 548
    .local v3, "$i$f$visitChildren":I
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v6

    .local v6, "value$iv$iv$iv":Z
    const/16 v17, 0x0

    .line 549
    .local v17, "$i$f$checkPrecondition":I
    nop

    .line 550
    if-nez v6, :cond_37

    .line 551
    const/16 v20, 0x0

    .line 548
    .local v20, "$i$a$-checkPrecondition-DelegatableNodeKt$visitChildren$1$iv$iv":I
    nop

    .line 551
    .end local v20    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitChildren$1$iv$iv":I
    invoke-static {v5}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 553
    :cond_37
    nop

    .line 554
    .end local v6    # "value$iv$iv$iv":Z
    .end local v17    # "$i$f$checkPrecondition":I
    const/4 v6, 0x0

    .line 524
    .local v6, "$i$f$mutableVectorOf":I
    nop

    .line 525
    move/from16 v17, v1

    .end local v1    # "mask$iv$iv":I
    .local v17, "mask$iv$iv":I
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv":I
    const/16 v20, 0x0

    .line 526
    .local v20, "$i$f$MutableVector":I
    move-object/from16 v21, v2

    .end local v2    # "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v21, "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v24, v3

    .end local v3    # "$i$f$visitChildren":I
    .local v24, "$i$f$visitChildren":I
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v26, v1

    const/4 v1, 0x0

    .end local v1    # "capacity$iv$iv$iv$iv":I
    .local v26, "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 524
    .end local v20    # "$i$f$MutableVector":I
    .end local v26    # "capacity$iv$iv$iv$iv":I
    nop

    .line 554
    .end local v6    # "$i$f$mutableVectorOf":I
    nop

    .line 555
    .local v2, "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    invoke-interface/range {v21 .. v21}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    .line 556
    .local v1, "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-nez v1, :cond_38

    invoke-interface/range {v21 .. v21}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    invoke-static {v2, v3, v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    goto :goto_21

    :cond_38
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 557
    :goto_21
    move-object v3, v2

    .local v3, "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v6, 0x0

    .line 558
    .local v6, "$i$f$isNotEmpty":I
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v20

    if-eqz v20, :cond_39

    const/4 v3, 0x1

    goto :goto_22

    :cond_39
    const/4 v3, 0x0

    .end local v3    # "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v6    # "$i$f$isNotEmpty":I
    :goto_22
    if-eqz v3, :cond_4c

    .line 559
    move-object v3, v2

    .restart local v3    # "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v6, 0x0

    .line 560
    .local v6, "$i$f$getLastIndex":I
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v20

    const/16 v19, 0x1

    add-int/lit8 v3, v20, -0x1

    .line 559
    .end local v3    # "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v6    # "$i$f$getLastIndex":I
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/Modifier$Node;

    .line 561
    .local v3, "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v6

    and-int v6, v6, v17

    if-nez v6, :cond_3a

    .line 562
    invoke-static {v2, v3, v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 564
    move-object/from16 v30, v1

    move-object/from16 v31, v2

    const/4 v1, 0x1

    goto/16 :goto_2e

    .line 566
    :cond_3a
    move-object v6, v3

    .line 567
    .local v6, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_23
    if-eqz v6, :cond_4b

    .line 568
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v17

    if-eqz v20, :cond_4a

    .line 569
    move-object/from16 v20, v6

    .local v20, "it$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 547
    .local v26, "$i$a$-visitChildren-DelegatableNodeKt$visitSelfAndChildren$1$iv":I
    move-object/from16 v27, v20

    .local v27, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v28, 0x0

    .line 570
    .local v28, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v29, 0x0

    .line 571
    .local v29, "stack$iv$iv":Ljava/lang/Object;
    const/16 v30, 0x0

    .local v30, "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v30, v27

    move-object/from16 v44, v30

    move-object/from16 v30, v1

    move-object/from16 v1, v44

    .line 572
    .local v1, "node$iv$iv":Ljava/lang/Object;
    .local v30, "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_24
    if-eqz v1, :cond_49

    .line 573
    move-object/from16 v31, v2

    .end local v2    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .local v31, "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    instance-of v2, v1, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v2, :cond_3d

    .line 574
    move-object v2, v1

    check-cast v2, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v2, "it":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v32, 0x0

    .line 218
    .local v32, "$i$a$-visitSelfAndChildren-Y-YKmho$default-FocusInvalidationManager$invalidateNodesLegacy$4$1":I
    if-eqz v12, :cond_3b

    .line 219
    const/4 v11, 0x1

    .line 222
    :cond_3b
    move-object v12, v2

    .line 228
    move-object/from16 v34, v3

    .end local v3    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v34, "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    iget-object v3, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3c

    .line 229
    const/4 v10, 0x0

    .line 230
    iget-object v3, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    goto :goto_25

    .line 233
    :cond_3c
    nop

    .line 574
    .end local v2    # "it":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v32    # "$i$a$-visitSelfAndChildren-Y-YKmho$default-FocusInvalidationManager$invalidateNodesLegacy$4$1":I
    :goto_25
    move-object/from16 v38, v1

    const/4 v1, 0x1

    goto/16 :goto_2d

    .line 575
    .end local v34    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_3d
    move-object/from16 v34, v3

    .end local v3    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v34    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    move-object v2, v1

    .local v2, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v3, 0x0

    .line 510
    .local v3, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v32

    and-int v32, v32, v14

    if-eqz v32, :cond_3e

    const/4 v2, 0x1

    goto :goto_26

    :cond_3e
    const/4 v2, 0x0

    .line 575
    .end local v2    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v3    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_26
    if-eqz v2, :cond_47

    instance-of v2, v1, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v2, :cond_47

    .line 580
    const/4 v2, 0x0

    .line 581
    .local v2, "count$iv$iv":I
    move-object v3, v1

    check-cast v3, Landroidx/compose/ui/node/DelegatingNode;

    .local v3, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v32, 0x0

    .line 513
    .local v32, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v3}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v35

    .line 514
    .local v35, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_27
    if-eqz v35, :cond_46

    .line 515
    move-object/from16 v36, v35

    .local v36, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v37, 0x0

    .line 582
    .local v37, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object/from16 v38, v36

    .local v38, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v39, 0x0

    .line 510
    .local v39, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v38 .. v38}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v40

    and-int v40, v40, v14

    if-eqz v40, :cond_3f

    const/16 v38, 0x1

    goto :goto_28

    :cond_3f
    const/16 v38, 0x0

    .line 582
    .end local v38    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v39    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_28
    if-eqz v38, :cond_45

    .line 583
    add-int/lit8 v2, v2, 0x1

    .line 584
    move-object/from16 v38, v1

    const/4 v1, 0x1

    .end local v1    # "node$iv$iv":Ljava/lang/Object;
    .local v38, "node$iv$iv":Ljava/lang/Object;
    if-ne v2, v1, :cond_40

    .line 585
    move-object/from16 v1, v36

    move-object/from16 v18, v1

    move-object/from16 v42, v3

    .end local v38    # "node$iv$iv":Ljava/lang/Object;
    .restart local v1    # "node$iv$iv":Ljava/lang/Object;
    goto :goto_2c

    .line 589
    .end local v1    # "node$iv$iv":Ljava/lang/Object;
    .restart local v38    # "node$iv$iv":Ljava/lang/Object;
    :cond_40
    if-nez v29, :cond_41

    const/4 v1, 0x0

    .line 524
    .local v1, "$i$f$mutableVectorOf":I
    nop

    .line 525
    move/from16 v39, v1

    .end local v1    # "$i$f$mutableVectorOf":I
    .local v39, "$i$f$mutableVectorOf":I
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv":I
    const/16 v40, 0x0

    .line 526
    .local v40, "$i$f$MutableVector":I
    move/from16 v41, v2

    .end local v2    # "count$iv$iv":I
    .local v41, "count$iv$iv":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v42, v3

    .end local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v42, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v43, v1

    const/4 v1, 0x0

    .end local v1    # "capacity$iv$iv$iv$iv":I
    .local v43, "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 524
    .end local v40    # "$i$f$MutableVector":I
    .end local v43    # "capacity$iv$iv$iv$iv":I
    goto :goto_29

    .line 589
    .end local v39    # "$i$f$mutableVectorOf":I
    .end local v41    # "count$iv$iv":I
    .end local v42    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v2    # "count$iv$iv":I
    .restart local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    :cond_41
    move/from16 v41, v2

    move-object/from16 v42, v3

    const/4 v1, 0x0

    .end local v2    # "count$iv$iv":I
    .end local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v41    # "count$iv$iv":I
    .restart local v42    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    move-object/from16 v2, v29

    :goto_29
    nop

    .line 590
    .end local v29    # "stack$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v3, v38

    .line 591
    .local v3, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v3, :cond_43

    .line 592
    if-eqz v2, :cond_42

    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 593
    :cond_42
    const/16 v18, 0x0

    .end local v38    # "node$iv$iv":Ljava/lang/Object;
    .restart local v18    # "node$iv$iv":Ljava/lang/Object;
    goto :goto_2a

    .line 591
    .end local v18    # "node$iv$iv":Ljava/lang/Object;
    .restart local v38    # "node$iv$iv":Ljava/lang/Object;
    :cond_43
    move-object/from16 v18, v38

    .line 595
    .end local v38    # "node$iv$iv":Ljava/lang/Object;
    .restart local v18    # "node$iv$iv":Ljava/lang/Object;
    :goto_2a
    if-eqz v2, :cond_44

    move-object/from16 v1, v36

    .end local v36    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v1, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v29

    invoke-static/range {v29 .. v29}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_2b

    .end local v1    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v36    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_44
    move-object/from16 v1, v36

    .end local v36    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_2b
    move-object/from16 v29, v2

    move/from16 v2, v41

    goto :goto_2c

    .line 582
    .end local v18    # "node$iv$iv":Ljava/lang/Object;
    .end local v41    # "count$iv$iv":I
    .end local v42    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v1, "node$iv$iv":Ljava/lang/Object;
    .local v2, "count$iv$iv":I
    .local v3, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v29    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v36    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_45
    move-object/from16 v38, v1

    move-object/from16 v42, v3

    move-object/from16 v1, v36

    .end local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v36    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v1, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v38    # "node$iv$iv":Ljava/lang/Object;
    .restart local v42    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    move-object/from16 v18, v38

    .line 598
    .end local v38    # "node$iv$iv":Ljava/lang/Object;
    .restart local v18    # "node$iv$iv":Ljava/lang/Object;
    :goto_2c
    nop

    .line 515
    .end local v1    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v37    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 536
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v35

    move-object/from16 v1, v18

    move-object/from16 v3, v42

    goto :goto_27

    .line 538
    .end local v18    # "node$iv$iv":Ljava/lang/Object;
    .end local v42    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v1, "node$iv$iv":Ljava/lang/Object;
    .restart local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    :cond_46
    move-object/from16 v38, v1

    move-object/from16 v42, v3

    .line 599
    .end local v1    # "node$iv$iv":Ljava/lang/Object;
    .end local v3    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v32    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v35    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v38    # "node$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x1

    if-ne v2, v1, :cond_48

    .line 601
    move-object/from16 v2, v31

    move-object/from16 v3, v34

    move-object/from16 v1, v38

    goto/16 :goto_24

    .line 575
    .end local v2    # "count$iv$iv":I
    .end local v38    # "node$iv$iv":Ljava/lang/Object;
    .restart local v1    # "node$iv$iv":Ljava/lang/Object;
    :cond_47
    move-object/from16 v38, v1

    const/4 v1, 0x1

    .line 604
    .end local v1    # "node$iv$iv":Ljava/lang/Object;
    .restart local v38    # "node$iv$iv":Ljava/lang/Object;
    :cond_48
    :goto_2d
    invoke-static/range {v29 .. v29}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    move-object v1, v2

    move-object/from16 v2, v31

    move-object/from16 v3, v34

    .end local v38    # "node$iv$iv":Ljava/lang/Object;
    .local v2, "node$iv$iv":Ljava/lang/Object;
    goto/16 :goto_24

    .line 606
    .end local v31    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v34    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "node$iv$iv":Ljava/lang/Object;
    .local v2, "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .local v3, "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_49
    move-object/from16 v38, v1

    move-object/from16 v31, v2

    move-object/from16 v34, v3

    const/4 v1, 0x1

    .line 547
    .end local v1    # "node$iv$iv":Ljava/lang/Object;
    .end local v2    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v3    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v27    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v29    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v31    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v34    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    nop

    .line 569
    .end local v20    # "it$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$a$-visitChildren-DelegatableNodeKt$visitSelfAndChildren$1$iv":I
    nop

    .line 607
    move-object/from16 v1, v30

    goto/16 :goto_21

    .line 609
    .end local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v31    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v34    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v1, "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v3    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_4a
    move-object/from16 v30, v1

    move-object/from16 v31, v2

    move-object/from16 v34, v3

    const/4 v1, 0x1

    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v3    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v34    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v1, v30

    goto/16 :goto_23

    .line 567
    .end local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v31    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v34    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v3    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_4b
    move-object/from16 v30, v1

    move-object/from16 v31, v2

    move-object/from16 v34, v3

    const/4 v1, 0x1

    .line 557
    .end local v3    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v6    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_2e
    move-object/from16 v1, v30

    move-object/from16 v2, v31

    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    goto/16 :goto_21

    .line 612
    .end local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v31    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    :cond_4c
    move-object/from16 v30, v1

    move-object/from16 v31, v2

    const/4 v1, 0x1

    .line 613
    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v17    # "mask$iv$iv":I
    .end local v21    # "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v24    # "$i$f$visitChildren":I
    nop

    .line 235
    .end local v13    # "$this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "type$iv":I
    .end local v15    # "zOrder$iv":Z
    .end local v16    # "$i$f$visitSelfAndChildren-Y-YKmho":I
    if-eqz v10, :cond_50

    .line 236
    nop

    .line 237
    if-eqz v11, :cond_4d

    .line 238
    invoke-static {v8}, Landroidx/compose/ui/focus/FocusEventModifierNodeKt;->getFocusState(Landroidx/compose/ui/focus/FocusEventModifierNode;)Landroidx/compose/ui/focus/FocusState;

    move-result-object v2

    goto :goto_2f

    .line 240
    :cond_4d
    if-eqz v12, :cond_4e

    invoke-virtual {v12}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v2

    if-nez v2, :cond_4f

    :cond_4e
    sget-object v2, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    :cond_4f
    check-cast v2, Landroidx/compose/ui/focus/FocusState;

    .line 236
    :goto_2f
    invoke-interface {v8, v2}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 244
    :cond_50
    nop

    .line 496
    .end local v8    # "focusEventNode":Landroidx/compose/ui/focus/FocusEventModifierNode;
    .end local v9    # "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$4":I
    .end local v10    # "requiresUpdate":Z
    .end local v11    # "aggregatedNode":Z
    .end local v12    # "focusTarget":Ljava/lang/Object;
    :goto_30
    nop

    .line 494
    .end local v7    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v3, v33, 0x1

    move-object/from16 v1, v23

    move/from16 v2, v25

    const/16 v6, 0x400

    .end local v33    # "index$iv":I
    .local v3, "index$iv":I
    goto/16 :goto_17

    .end local v23    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v25    # "$i$f$fastForEach":I
    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    .local v2, "$i$f$fastForEach":I
    :cond_51
    move-object/from16 v23, v1

    move/from16 v25, v2

    move/from16 v33, v3

    .line 614
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    .end local v3    # "index$iv":I
    .restart local v23    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v25    # "$i$f$fastForEach":I
    nop

    .line 245
    .end local v23    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v25    # "$i$f$fastForEach":I
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 248
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    .restart local v1    # "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 615
    .restart local v2    # "$i$f$fastForEach":I
    nop

    .line 616
    const/4 v3, 0x0

    .restart local v3    # "index$iv":I
    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_31
    if-ge v3, v4, :cond_55

    .line 617
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 618
    .local v5, "item$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v6, "it":Landroidx/compose/ui/focus/FocusTargetNode;
    const/4 v7, 0x0

    .line 251
    .local v7, "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$5":I
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->isAttached()Z

    move-result v8

    if-eqz v8, :cond_54

    .line 253
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v8

    .line 254
    .local v8, "preInvalidationState":Landroidx/compose/ui/focus/FocusStateImpl;
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->invalidateFocus$ui_release()V

    .line 255
    nop

    .line 256
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v9

    if-ne v8, v9, :cond_52

    .line 257
    iget-object v9, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v9, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_53

    .line 259
    :cond_52
    invoke-virtual {v6}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    .line 261
    :cond_53
    nop

    .line 618
    .end local v6    # "it":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v7    # "$i$a$-fastForEach-FocusInvalidationManager$invalidateNodesLegacy$5":I
    .end local v8    # "preInvalidationState":Landroidx/compose/ui/focus/FocusStateImpl;
    :cond_54
    nop

    .line 616
    .end local v5    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_31

    .line 620
    .end local v3    # "index$iv":I
    :cond_55
    nop

    .line 262
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 264
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 266
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateOwnerFocusState:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 268
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    .local v1, "value$iv":Z
    const/4 v2, 0x0

    .line 621
    .local v2, "$i$f$checkPrecondition":I
    nop

    .line 622
    if-nez v1, :cond_56

    .line 623
    const/4 v3, 0x0

    .line 269
    .local v3, "$i$a$-checkPrecondition-FocusInvalidationManager$invalidateNodesLegacy$6":I
    nop

    .line 623
    .end local v3    # "$i$a$-checkPrecondition-FocusInvalidationManager$invalidateNodesLegacy$6":I
    const-string v3, "Unprocessed FocusProperties nodes"

    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 625
    :cond_56
    nop

    .line 271
    .end local v1    # "value$iv":Z
    .end local v2    # "$i$f$checkPrecondition":I
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    .restart local v1    # "value$iv":Z
    const/4 v2, 0x0

    .line 626
    .restart local v2    # "$i$f$checkPrecondition":I
    nop

    .line 627
    if-nez v1, :cond_57

    .line 628
    const/4 v3, 0x0

    .line 271
    .local v3, "$i$a$-checkPrecondition-FocusInvalidationManager$invalidateNodesLegacy$7":I
    nop

    .line 628
    .end local v3    # "$i$a$-checkPrecondition-FocusInvalidationManager$invalidateNodesLegacy$7":I
    const-string v3, "Unprocessed FocusEvent nodes"

    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 630
    :cond_57
    nop

    .line 272
    .end local v1    # "value$iv":Z
    .end local v2    # "$i$f$checkPrecondition":I
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    .restart local v1    # "value$iv":Z
    const/4 v2, 0x0

    .line 631
    .restart local v2    # "$i$f$checkPrecondition":I
    nop

    .line 632
    if-nez v1, :cond_58

    .line 633
    const/4 v3, 0x0

    .line 272
    .local v3, "$i$a$-checkPrecondition-FocusInvalidationManager$invalidateNodesLegacy$8":I
    nop

    .line 633
    .end local v3    # "$i$a$-checkPrecondition-FocusInvalidationManager$invalidateNodesLegacy$8":I
    const-string v3, "Unprocessed FocusTarget nodes"

    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 635
    :cond_58
    nop

    .line 273
    .end local v1    # "value$iv":Z
    .end local v2    # "$i$f$checkPrecondition":I
    return-void
.end method

.method private final invalidateNodesOptimized()V
    .locals 32

    .line 121
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->activeFocusTargetNodeFetcher:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 122
    .local v1, "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v10, 0x8

    if-nez v1, :cond_7

    .line 124
    iget-object v12, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    check-cast v12, Landroidx/collection/ScatterSet;

    .local v12, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v13, 0x0

    .line 276
    .local v13, "$i$f$forEach":I
    nop

    .line 277
    iget-object v14, v12, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 278
    .local v14, "elements$iv":[Ljava/lang/Object;
    move-object v15, v12

    .local v15, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v16, 0x0

    .line 279
    .local v16, "$i$f$forEachIndex":I
    nop

    .line 280
    const-wide/16 v17, 0x80

    iget-object v2, v15, Landroidx/collection/ScatterSet;->metadata:[J

    .line 281
    .local v2, "m$iv$iv":[J
    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    .line 283
    .local v3, "lastIndex$iv$iv":I
    const-wide/16 v19, 0xff

    const/4 v4, 0x0

    .local v4, "i$iv$iv":I
    if-gt v4, v3, :cond_4

    .line 284
    :goto_0
    aget-wide v21, v2, v4

    .line 285
    .local v21, "slot$iv$iv":J
    move-wide/from16 v23, v21

    .local v23, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v5, 0x0

    .line 286
    .local v5, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v6, v23

    const/4 v8, 0x1

    const/16 v25, 0x7

    const-wide v26, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    move-object/from16 v23, v12

    .end local v12    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v6, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v23, "this_$iv":Landroidx/collection/ScatterSet;
    not-long v11, v6

    shl-long v11, v11, v25

    and-long/2addr v11, v6

    and-long v5, v11, v26

    .line 285
    .end local v5    # "$i$f$maskEmptyOrDeleted":I
    .end local v6    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    cmp-long v5, v5, v26

    if-eqz v5, :cond_3

    .line 287
    sub-int v5, v4, v3

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    rsub-int/lit8 v5, v5, 0x8

    .line 288
    .local v5, "bitCount$iv$iv":I
    const/4 v6, 0x0

    .local v6, "j$iv$iv":I
    :goto_1
    if-ge v6, v5, :cond_2

    .line 289
    and-long v11, v21, v19

    .local v11, "value$iv$iv$iv":J
    const/4 v7, 0x0

    .line 290
    .local v7, "$i$f$isFull":I
    cmp-long v24, v11, v17

    if-gez v24, :cond_0

    move v7, v8

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    .line 289
    .end local v7    # "$i$f$isFull":I
    .end local v11    # "value$iv$iv$iv":J
    :goto_2
    if-eqz v7, :cond_1

    .line 291
    shl-int/lit8 v7, v4, 0x3

    add-int/2addr v7, v6

    .line 292
    .local v7, "index$iv$iv":I
    move v11, v7

    .local v11, "index$iv":I
    const/4 v12, 0x0

    .line 278
    .local v12, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    aget-object v24, v14, v11

    move/from16 v28, v8

    move-object/from16 v8, v24

    check-cast v8, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .local v8, "it":Landroidx/compose/ui/focus/FocusEventModifierNode;
    const/16 v24, 0x0

    .line 124
    .local v24, "$i$a$-forEach-FocusInvalidationManager$invalidateNodesOptimized$1":I
    sget-object v29, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    move-object/from16 v9, v29

    check-cast v9, Landroidx/compose/ui/focus/FocusState;

    invoke-interface {v8, v9}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 278
    .end local v8    # "it":Landroidx/compose/ui/focus/FocusEventModifierNode;
    .end local v24    # "$i$a$-forEach-FocusInvalidationManager$invalidateNodesOptimized$1":I
    nop

    .line 292
    .end local v11    # "index$iv":I
    .end local v12    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_3

    .line 289
    .end local v7    # "index$iv$iv":I
    :cond_1
    move/from16 v28, v8

    .line 294
    :goto_3
    shr-long v21, v21, v10

    .line 288
    add-int/lit8 v6, v6, 0x1

    move/from16 v8, v28

    goto :goto_1

    :cond_2
    move/from16 v28, v8

    .line 296
    .end local v6    # "j$iv$iv":I
    if-ne v5, v10, :cond_6

    goto :goto_4

    .line 285
    .end local v5    # "bitCount$iv$iv":I
    :cond_3
    move/from16 v28, v8

    .line 283
    .end local v21    # "slot$iv$iv":J
    :goto_4
    if-eq v4, v3, :cond_5

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v12, v23

    goto :goto_0

    .end local v23    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v12, "this_$iv":Landroidx/collection/ScatterSet;
    :cond_4
    move-object/from16 v23, v12

    .line 299
    .end local v4    # "i$iv$iv":I
    .end local v12    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v23    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_5
    nop

    .line 300
    .end local v2    # "m$iv$iv":[J
    .end local v3    # "lastIndex$iv$iv":I
    .end local v15    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v16    # "$i$f$forEachIndex":I
    :cond_6
    move-object v15, v1

    .end local v13    # "$i$f$forEach":I
    .end local v14    # "elements$iv":[Ljava/lang/Object;
    .end local v23    # "this_$iv":Landroidx/collection/ScatterSet;
    goto/16 :goto_11

    .line 125
    :cond_7
    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    const/16 v25, 0x7

    const-wide v26, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v28, 0x1

    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->isAttached()Z

    move-result v2

    if-eqz v2, :cond_1a

    .line 126
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v2, v1}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 127
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->invalidateFocus$ui_release()V

    .line 130
    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v2

    .line 131
    .local v2, "activeFocusTargetNodeState":Landroidx/compose/ui/focus/FocusStateImpl;
    const/4 v3, 0x0

    .line 132
    .local v3, "traversedFocusTargetCount":I
    move-object v4, v1

    check-cast v4, Landroidx/compose/ui/node/DelegatableNode;

    .line 133
    const/4 v5, 0x0

    .line 301
    .local v5, "$i$f$getFocusTarget-OLwlOKw":I
    const/16 v6, 0x400

    invoke-static {v6}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v5

    .line 133
    .end local v5    # "$i$f$getFocusTarget-OLwlOKw":I
    const/4 v7, 0x0

    .line 309
    .local v7, "$i$f$getFocusEvent-OLwlOKw":I
    const/16 v8, 0x1000

    invoke-static {v8}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v7

    .line 133
    .end local v7    # "$i$f$getFocusEvent-OLwlOKw":I
    nop

    .local v5, "arg0$iv":I
    .local v7, "other$iv":I
    const/4 v8, 0x0

    .line 310
    .local v8, "$i$f$or-H91voCI":I
    or-int/2addr v5, v7

    .line 134
    .end local v5    # "arg0$iv":I
    .end local v7    # "other$iv":I
    .end local v8    # "$i$f$or-H91voCI":I
    nop

    .line 132
    move/from16 v7, v28

    .local v4, "$this$visitAncestors$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v5, "mask$iv":I
    .local v7, "includeSelf$iv":Z
    const/4 v8, 0x0

    .line 311
    .local v8, "$i$f$visitAncestors":I
    invoke-interface {v4}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v9

    .local v9, "value$iv$iv":Z
    const/4 v11, 0x0

    .line 312
    .local v11, "$i$f$checkPrecondition":I
    nop

    .line 313
    if-nez v9, :cond_9

    .line 314
    const/4 v12, 0x0

    .line 311
    .local v12, "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv":I
    nop

    .line 314
    .end local v12    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitAncestors$1$iv":I
    const-string/jumbo v12, "visitAncestors called on an unattached node"

    invoke-static {v12}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 316
    :cond_9
    nop

    .line 317
    .end local v9    # "value$iv$iv":Z
    .end local v11    # "$i$f$checkPrecondition":I
    invoke-interface {v4}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    .line 318
    .local v9, "node$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v11

    .line 319
    .local v11, "layout$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_5
    if-eqz v11, :cond_12

    .line 320
    invoke-virtual {v11}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 321
    .local v12, "head$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v13

    and-int/2addr v13, v5

    if-eqz v13, :cond_10

    .line 322
    :goto_6
    if-eqz v9, :cond_10

    .line 323
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v13

    and-int/2addr v13, v5

    if-eqz v13, :cond_f

    .line 324
    move-object v13, v9

    .local v13, "it":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 139
    .local v14, "$i$a$-visitAncestors-FocusInvalidationManager$invalidateNodesOptimized$2":I
    const/4 v15, 0x0

    .line 325
    .local v15, "$i$f$getFocusTarget-OLwlOKw":I
    invoke-static {v6}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v15

    .line 139
    .end local v15    # "$i$f$getFocusTarget-OLwlOKw":I
    nop

    .local v15, "kind$iv":I
    move-object/from16 v16, v13

    .local v16, "this_$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v21, 0x0

    .line 326
    .local v21, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v22

    and-int v22, v22, v15

    if-eqz v22, :cond_a

    move/from16 v15, v28

    goto :goto_7

    :cond_a
    const/4 v15, 0x0

    .line 139
    .end local v15    # "kind$iv":I
    .end local v16    # "this_$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v21    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_7
    if-eqz v15, :cond_b

    add-int/lit8 v3, v3, 0x1

    .line 142
    :cond_b
    instance-of v15, v13, Landroidx/compose/ui/focus/FocusEventModifierNode;

    if-eqz v15, :cond_e

    iget-object v15, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v15, v13}, Landroidx/collection/MutableScatterSet;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_c

    goto :goto_9

    .line 149
    :cond_c
    move/from16 v15, v28

    if-gt v3, v15, :cond_d

    .line 150
    move-object v6, v13

    check-cast v6, Landroidx/compose/ui/focus/FocusEventModifierNode;

    move-object v15, v2

    check-cast v15, Landroidx/compose/ui/focus/FocusState;

    invoke-interface {v6, v15}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    goto :goto_8

    .line 152
    :cond_d
    move-object v6, v13

    check-cast v6, Landroidx/compose/ui/focus/FocusEventModifierNode;

    sget-object v15, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    check-cast v15, Landroidx/compose/ui/focus/FocusState;

    invoke-interface {v6, v15}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 157
    :goto_8
    iget-object v6, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v6, v13}, Landroidx/collection/MutableScatterSet;->remove(Ljava/lang/Object;)Z

    .line 158
    goto :goto_a

    .line 143
    :cond_e
    :goto_9
    nop

    .line 324
    .end local v13    # "it":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-visitAncestors-FocusInvalidationManager$invalidateNodesOptimized$2":I
    :goto_a
    nop

    .line 327
    :cond_f
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    const/16 v6, 0x400

    const/16 v28, 0x1

    goto :goto_6

    .line 330
    :cond_10
    invoke-virtual {v11}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v11

    .line 331
    if-eqz v11, :cond_11

    invoke-virtual {v11}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v6

    if-eqz v6, :cond_11

    invoke-virtual {v6}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    goto :goto_b

    :cond_11
    const/4 v6, 0x0

    :goto_b
    move-object v9, v6

    const/16 v6, 0x400

    const/16 v28, 0x1

    .end local v12    # "head$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_5

    .line 333
    :cond_12
    nop

    .line 161
    .end local v4    # "$this$visitAncestors$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v5    # "mask$iv":I
    .end local v7    # "includeSelf$iv":Z
    .end local v8    # "$i$f$visitAncestors":I
    .end local v9    # "node$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v11    # "layout$iv":Landroidx/compose/ui/node/LayoutNode;
    iget-object v4, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    check-cast v4, Landroidx/collection/ScatterSet;

    .local v4, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v5, 0x0

    .line 334
    .local v5, "$i$f$forEach":I
    nop

    .line 335
    iget-object v6, v4, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 336
    .local v6, "elements$iv":[Ljava/lang/Object;
    move-object v7, v4

    .local v7, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v8, 0x0

    .line 337
    .local v8, "$i$f$forEachIndex":I
    nop

    .line 338
    iget-object v9, v7, Landroidx/collection/ScatterSet;->metadata:[J

    .line 339
    .local v9, "m$iv$iv":[J
    array-length v11, v9

    add-int/lit8 v11, v11, -0x2

    .line 341
    .local v11, "lastIndex$iv$iv":I
    const/4 v12, 0x0

    .local v12, "i$iv$iv":I
    if-gt v12, v11, :cond_17

    .line 342
    :goto_c
    aget-wide v13, v9, v12

    .line 343
    .local v13, "slot$iv$iv":J
    move-wide v15, v13

    .local v15, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v21, 0x0

    .line 344
    .local v21, "$i$f$maskEmptyOrDeleted":I
    move/from16 v22, v10

    move/from16 v23, v11

    move-wide v10, v15

    move-object v15, v1

    move-object/from16 v16, v2

    .end local v1    # "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v2    # "activeFocusTargetNodeState":Landroidx/compose/ui/focus/FocusStateImpl;
    .end local v11    # "lastIndex$iv$iv":I
    .local v10, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v15, "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v16, "activeFocusTargetNodeState":Landroidx/compose/ui/focus/FocusStateImpl;
    .local v23, "lastIndex$iv$iv":I
    not-long v1, v10

    shl-long v1, v1, v25

    and-long/2addr v1, v10

    and-long v1, v1, v26

    .line 343
    .end local v10    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v21    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v1, v1, v26

    if-eqz v1, :cond_16

    .line 345
    sub-int v1, v12, v23

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    rsub-int/lit8 v10, v1, 0x8

    .line 346
    .local v10, "bitCount$iv$iv":I
    const/4 v1, 0x0

    .local v1, "j$iv$iv":I
    :goto_d
    if-ge v1, v10, :cond_15

    .line 347
    and-long v30, v13, v19

    .local v30, "value$iv$iv$iv":J
    const/4 v2, 0x0

    .line 348
    .local v2, "$i$f$isFull":I
    cmp-long v11, v30, v17

    if-gez v11, :cond_13

    const/4 v2, 0x1

    goto :goto_e

    :cond_13
    const/4 v2, 0x0

    .line 347
    .end local v2    # "$i$f$isFull":I
    .end local v30    # "value$iv$iv$iv":J
    :goto_e
    if-eqz v2, :cond_14

    .line 349
    shl-int/lit8 v2, v12, 0x3

    add-int/2addr v2, v1

    .line 350
    .local v2, "index$iv$iv":I
    move v11, v2

    .local v11, "index$iv":I
    const/16 v21, 0x0

    .line 336
    .local v21, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    aget-object v24, v6, v11

    move/from16 v29, v1

    .end local v1    # "j$iv$iv":I
    .local v29, "j$iv$iv":I
    move-object/from16 v1, v24

    check-cast v1, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .local v1, "it":Landroidx/compose/ui/focus/FocusEventModifierNode;
    const/16 v24, 0x0

    .line 161
    .local v24, "$i$a$-forEach-FocusInvalidationManager$invalidateNodesOptimized$3":I
    sget-object v30, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    move/from16 v31, v2

    .end local v2    # "index$iv$iv":I
    .local v31, "index$iv$iv":I
    move-object/from16 v2, v30

    check-cast v2, Landroidx/compose/ui/focus/FocusState;

    invoke-interface {v1, v2}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 336
    .end local v1    # "it":Landroidx/compose/ui/focus/FocusEventModifierNode;
    .end local v24    # "$i$a$-forEach-FocusInvalidationManager$invalidateNodesOptimized$3":I
    nop

    .line 350
    .end local v11    # "index$iv":I
    .end local v21    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_f

    .line 347
    .end local v29    # "j$iv$iv":I
    .end local v31    # "index$iv$iv":I
    .local v1, "j$iv$iv":I
    :cond_14
    move/from16 v29, v1

    .line 352
    .end local v1    # "j$iv$iv":I
    .restart local v29    # "j$iv$iv":I
    :goto_f
    shr-long v13, v13, v22

    .line 346
    add-int/lit8 v1, v29, 0x1

    .end local v29    # "j$iv$iv":I
    .restart local v1    # "j$iv$iv":I
    goto :goto_d

    :cond_15
    move/from16 v29, v1

    .line 354
    .end local v1    # "j$iv$iv":I
    move/from16 v1, v22

    if-ne v10, v1, :cond_19

    goto :goto_10

    .line 343
    .end local v10    # "bitCount$iv$iv":I
    :cond_16
    move/from16 v1, v22

    .line 341
    .end local v13    # "slot$iv$iv":J
    :goto_10
    move/from16 v11, v23

    .end local v23    # "lastIndex$iv$iv":I
    .local v11, "lastIndex$iv$iv":I
    if-eq v12, v11, :cond_18

    add-int/lit8 v12, v12, 0x1

    move v10, v1

    move-object v1, v15

    move-object/from16 v2, v16

    goto :goto_c

    .end local v15    # "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v16    # "activeFocusTargetNodeState":Landroidx/compose/ui/focus/FocusStateImpl;
    .local v1, "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v2, "activeFocusTargetNodeState":Landroidx/compose/ui/focus/FocusStateImpl;
    :cond_17
    move-object v15, v1

    move-object/from16 v16, v2

    .line 357
    .end local v1    # "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v2    # "activeFocusTargetNodeState":Landroidx/compose/ui/focus/FocusStateImpl;
    .end local v12    # "i$iv$iv":I
    .restart local v15    # "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v16    # "activeFocusTargetNodeState":Landroidx/compose/ui/focus/FocusStateImpl;
    :cond_18
    nop

    .line 358
    .end local v7    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v8    # "$i$f$forEachIndex":I
    .end local v9    # "m$iv$iv":[J
    .end local v11    # "lastIndex$iv$iv":I
    :cond_19
    goto :goto_11

    .line 125
    .end local v3    # "traversedFocusTargetCount":I
    .end local v4    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v5    # "$i$f$forEach":I
    .end local v6    # "elements$iv":[Ljava/lang/Object;
    .end local v15    # "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v16    # "activeFocusTargetNodeState":Landroidx/compose/ui/focus/FocusStateImpl;
    .restart local v1    # "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_1a
    move-object v15, v1

    .line 164
    .end local v1    # "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v15    # "activeFocusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    :goto_11
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateOwnerFocusState:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 165
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 166
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 167
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->isInvalidationScheduled:Z

    .line 168
    return-void
.end method

.method private final scheduleInvalidation(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V
    .locals 1
    .param p1, "$this$scheduleInvalidation"    # Landroidx/collection/MutableScatterSet;
    .param p2, "node"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/collection/MutableScatterSet<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 86
    invoke-virtual {p1, p2}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->setUpOnRequestApplyChangesListener()V

    .line 89
    :cond_0
    return-void
.end method

.method private final scheduleInvalidationLegacy(Ljava/util/List;Ljava/lang/Object;)V
    .locals 2
    .param p1, "$this$scheduleInvalidationLegacy"    # Ljava/util/List;
    .param p2, "node"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 99
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    nop

    .line 103
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 104
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 105
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 105
    nop

    .line 103
    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 107
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->onRequestApplyChangesListener:Lkotlin/jvm/functions/Function1;

    new-instance v1, Landroidx/compose/ui/focus/FocusInvalidationManager$scheduleInvalidationLegacy$1;

    invoke-direct {v1, p0}, Landroidx/compose/ui/focus/FocusInvalidationManager$scheduleInvalidationLegacy$1;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    :cond_0
    return-void
.end method

.method private final setUpOnRequestApplyChangesListener()V
    .locals 2

    .line 92
    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->isInvalidationScheduled:Z

    if-nez v0, :cond_0

    .line 93
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->onRequestApplyChangesListener:Lkotlin/jvm/functions/Function1;

    new-instance v1, Landroidx/compose/ui/focus/FocusInvalidationManager$setUpOnRequestApplyChangesListener$1;

    invoke-direct {v1, p0}, Landroidx/compose/ui/focus/FocusInvalidationManager$setUpOnRequestApplyChangesListener$1;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->isInvalidationScheduled:Z

    .line 96
    :cond_0
    return-void
.end method


# virtual methods
.method public final hasPendingInvalidation()Z
    .locals 1

    .line 76
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-eqz v0, :cond_0

    .line 77
    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->isInvalidationScheduled:Z

    goto :goto_1

    .line 79
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 80
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 81
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 76
    :goto_1
    return v0
.end method

.method public final scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .locals 1
    .param p1, "node"    # Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 60
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V

    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidationLegacy(Ljava/util/List;Ljava/lang/Object;)V

    .line 65
    :goto_0
    return-void
.end method

.method public final scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
    .locals 1
    .param p1, "node"    # Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 68
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidationLegacy(Ljava/util/List;Ljava/lang/Object;)V

    .line 69
    return-void
.end method

.method public final scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1
    .param p1, "node"    # Landroidx/compose/ui/focus/FocusTargetNode;

    .line 52
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Landroidx/collection/MutableScatterSet;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V

    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidationLegacy(Ljava/util/List;Ljava/lang/Object;)V

    .line 57
    :goto_0
    return-void
.end method

.method public final scheduleInvalidationForOwner()V
    .locals 0

    .line 72
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->setUpOnRequestApplyChangesListener()V

    .line 73
    return-void
.end method
