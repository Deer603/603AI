.class public final Landroidx/compose/ui/focus/FocusRequester;
.super Ljava/lang/Object;
.source "FocusRequester.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusRequester$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,268:1\n253#1:272\n254#1,2:274\n256#1,2:277\n258#1:285\n259#1,5:321\n264#1:367\n265#1:371\n1101#2:269\n1083#2,2:270\n1101#2:299\n1083#2,2:300\n1101#2:433\n1083#2,2:434\n1#3:273\n1#3:373\n519#4:276\n423#4,6:279\n44#4:306\n429#4,3:368\n519#4:372\n423#4,9:374\n519#4:383\n423#4,9:384\n519#4:393\n423#4,9:394\n519#4:403\n423#4,9:404\n519#4:413\n423#4,6:414\n519#4:439\n44#4:441\n429#4,3:497\n119#5:286\n119#5:420\n283#6,5:287\n148#6:292\n149#6:298\n150#6,4:302\n154#6,9:307\n437#6,5:316\n442#6:326\n447#6,2:328\n449#6,17:333\n466#6,8:353\n163#6,6:361\n283#6,5:421\n148#6:426\n149#6:432\n150#6,3:436\n153#6:440\n154#6,9:442\n437#6,6:451\n447#6,2:458\n449#6,17:463\n466#6,8:483\n163#6,6:491\n56#7,5:293\n56#7,5:427\n246#8:327\n246#8:457\n240#9,3:330\n243#9,3:350\n240#9,3:460\n243#9,3:480\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n87#1:272\n87#1:274,2\n87#1:277,2\n87#1:285\n87#1:321,5\n87#1:367\n87#1:371\n53#1:269\n53#1:270,2\n87#1:299\n87#1:300,2\n258#1:433\n258#1:434,2\n87#1:273\n87#1:276\n87#1:279,6\n87#1:306\n87#1:368,3\n111#1:372\n112#1:374,9\n134#1:383\n135#1:384,9\n153#1:393\n154#1:394,9\n168#1:403\n170#1:404,9\n255#1:413\n257#1:414,6\n258#1:439\n258#1:441\n257#1:497,3\n87#1:286\n258#1:420\n87#1:287,5\n87#1:292\n87#1:298\n87#1:302,4\n87#1:307,9\n87#1:316,5\n87#1:326\n87#1:328,2\n87#1:333,17\n87#1:353,8\n87#1:361,6\n258#1:421,5\n258#1:426\n258#1:432\n258#1:436,3\n258#1:440\n258#1:442,9\n258#1:451,6\n258#1:458,2\n258#1:463,17\n258#1:483,8\n258#1:491,6\n87#1:293,5\n258#1:427,5\n87#1:327\n258#1:457\n87#1:330,3\n87#1:350,3\n258#1:460,3\n258#1:480,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0008\u001a\u00020\tJ\u001d\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000cH\u0082\u0008J!\u0010\u000e\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000cH\u0000\u00a2\u0006\u0002\u0008\u000fJ\u0006\u0010\u0010\u001a\u00020\tJ\u0008\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010\u0011\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\tR\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusRequester;",
        "",
        "()V",
        "focusRequesterNodes",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "Landroidx/compose/ui/focus/FocusRequesterModifierNode;",
        "getFocusRequesterNodes$ui_release",
        "()Landroidx/compose/runtime/collection/MutableVector;",
        "captureFocus",
        "",
        "findFocusTarget",
        "onFound",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "findFocusTargetNode",
        "findFocusTargetNode$ui_release",
        "freeFocus",
        "requestFocus",
        "",
        "focusDirection",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "requestFocus-3ESFkO8",
        "(I)Z",
        "restoreFocusedChild",
        "saveFocusedChild",
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

.field private static final Cancel:Landroidx/compose/ui/focus/FocusRequester;

.field public static final Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

.field private static final Default:Landroidx/compose/ui/focus/FocusRequester;

.field private static final Redirect:Landroidx/compose/ui/focus/FocusRequester;


# instance fields
.field private final focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/focus/FocusRequesterModifierNode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/focus/FocusRequester$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/FocusRequester$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 180
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Default:Landroidx/compose/ui/focus/FocusRequester;

    .line 189
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Cancel:Landroidx/compose/ui/focus/FocusRequester;

    .line 192
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/FocusRequester;->Redirect:Landroidx/compose/ui/focus/FocusRequester;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x0

    .line 269
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 270
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv":I
    const/4 v2, 0x0

    .line 271
    .local v2, "$i$f$MutableVector":I
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    new-array v4, v1, [Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 269
    .end local v1    # "capacity$iv$iv":I
    .end local v2    # "$i$f$MutableVector":I
    nop

    .line 53
    .end local v0    # "$i$f$mutableVectorOf":I
    iput-object v3, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .line 51
    return-void
.end method

.method public static final synthetic access$getCancel$cp()Landroidx/compose/ui/focus/FocusRequester;
    .locals 1

    .line 50
    sget-object v0, Landroidx/compose/ui/focus/FocusRequester;->Cancel:Landroidx/compose/ui/focus/FocusRequester;

    return-object v0
.end method

.method public static final synthetic access$getDefault$cp()Landroidx/compose/ui/focus/FocusRequester;
    .locals 1

    .line 50
    sget-object v0, Landroidx/compose/ui/focus/FocusRequester;->Default:Landroidx/compose/ui/focus/FocusRequester;

    return-object v0
.end method

.method public static final synthetic access$getRedirect$cp()Landroidx/compose/ui/focus/FocusRequester;
    .locals 1

    .line 50
    sget-object v0, Landroidx/compose/ui/focus/FocusRequester;->Redirect:Landroidx/compose/ui/focus/FocusRequester;

    return-object v0
.end method

.method private final findFocusTarget(Lkotlin/jvm/functions/Function1;)Z
    .locals 40
    .param p1, "onFound"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 253
    .local v1, "$i$f$findFocusTarget":I
    sget-object v2, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v2

    const/4 v3, 0x0

    if-eq v0, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    const-string v5, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    if-eqz v2, :cond_1b

    .line 254
    sget-object v2, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v2, :cond_1a

    .line 255
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .local v2, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v5, 0x0

    .line 413
    .local v5, "$i$f$isNotEmpty":I
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v6

    if-eqz v6, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    move v2, v3

    .line 255
    .end local v2    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v5    # "$i$f$isNotEmpty":I
    :goto_2
    if-eqz v2, :cond_19

    .line 256
    const/4 v2, 0x0

    .line 257
    .local v2, "success":Z
    iget-object v5, v0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .local v5, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v6, 0x0

    .line 414
    .local v6, "$i$f$forEach":I
    nop

    .line 415
    const/4 v7, 0x0

    .line 416
    .local v7, "i$iv":I
    iget-object v8, v5, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 417
    .local v8, "content$iv":[Ljava/lang/Object;
    invoke-virtual {v5}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v9

    .line 418
    .local v9, "size$iv":I
    :goto_3
    if-ge v7, v9, :cond_18

    .line 419
    aget-object v10, v8, v7

    check-cast v10, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .local v10, "node":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    const/4 v11, 0x0

    .line 258
    .local v11, "$i$a$-forEach-FocusRequester$findFocusTarget$4":I
    move-object v12, v10

    check-cast v12, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v13, 0x0

    .line 420
    .local v13, "$i$f$getFocusTarget-OLwlOKw":I
    const/16 v14, 0x400

    invoke-static {v14}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v13

    .line 258
    .end local v13    # "$i$f$getFocusTarget-OLwlOKw":I
    nop

    .line 421
    .local v12, "$this$visitChildren_u2dY_u2dYKmho_u24default$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v13, "type$iv":I
    nop

    .line 423
    const/4 v14, 0x0

    .line 421
    .local v14, "zOrder$iv":Z
    const/4 v15, 0x0

    .line 425
    .local v15, "$i$f$visitChildren-Y-YKmho":I
    move/from16 v16, v13

    .local v16, "mask$iv$iv":I
    move-object/from16 v17, v12

    .local v17, "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v18, 0x0

    .line 426
    .local v18, "$i$f$visitChildren":I
    invoke-interface/range {v17 .. v17}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v19

    .local v19, "value$iv$iv$iv":Z
    const/16 v20, 0x0

    .line 427
    .local v20, "$i$f$checkPrecondition":I
    nop

    .line 428
    if-nez v19, :cond_3

    .line 429
    const/16 v21, 0x0

    .line 426
    .local v21, "$i$a$-checkPrecondition-DelegatableNodeKt$visitChildren$1$iv$iv":I
    nop

    .line 429
    .end local v21    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitChildren$1$iv$iv":I
    const-string/jumbo v21, "visitChildren called on an unattached node"

    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 431
    :cond_3
    nop

    .line 432
    .end local v19    # "value$iv$iv$iv":Z
    .end local v20    # "$i$f$checkPrecondition":I
    const/16 v19, 0x0

    .line 433
    .local v19, "$i$f$mutableVectorOf":I
    nop

    .line 434
    const/16 v20, 0x1

    const/16 v4, 0x10

    .local v4, "capacity$iv$iv$iv$iv":I
    const/16 v21, 0x0

    .line 435
    .local v21, "$i$f$MutableVector":I
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v22, v1

    .end local v1    # "$i$f$findFocusTarget":I
    .local v22, "$i$f$findFocusTarget":I
    new-array v1, v4, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v0, v1, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 433
    .end local v4    # "capacity$iv$iv$iv$iv":I
    .end local v21    # "$i$f$MutableVector":I
    nop

    .line 432
    .end local v19    # "$i$f$mutableVectorOf":I
    nop

    .line 436
    .local v0, "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    invoke-interface/range {v17 .. v17}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    .line 437
    .local v1, "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-nez v1, :cond_4

    invoke-interface/range {v17 .. v17}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    invoke-static {v0, v4, v14}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 438
    :goto_4
    move-object v4, v0

    .local v4, "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/16 v19, 0x0

    .line 439
    .local v19, "$i$f$isNotEmpty":I
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v21

    if-eqz v21, :cond_5

    move/from16 v4, v20

    goto :goto_5

    :cond_5
    move v4, v3

    .end local v4    # "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v19    # "$i$f$isNotEmpty":I
    :goto_5
    if-eqz v4, :cond_17

    .line 440
    move-object v4, v0

    .restart local v4    # "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/16 v19, 0x0

    .line 441
    .local v19, "$i$f$getLastIndex":I
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v21

    add-int/lit8 v4, v21, -0x1

    .line 440
    .end local v4    # "this_$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v19    # "$i$f$getLastIndex":I
    invoke-virtual {v0, v4}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/Modifier$Node;

    .line 442
    .local v4, "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v19

    and-int v19, v19, v16

    if-nez v19, :cond_6

    .line 443
    invoke-static {v0, v4, v14}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 445
    goto :goto_4

    .line 447
    :cond_6
    move-object/from16 v19, v4

    .line 448
    .local v19, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_6
    if-eqz v19, :cond_16

    .line 449
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v21

    and-int v21, v21, v16

    if-eqz v21, :cond_15

    .line 450
    move-object/from16 v21, v19

    .local v21, "it$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v23, 0x0

    .line 425
    .local v23, "$i$a$-visitChildren-DelegatableNodeKt$visitChildren$2$iv":I
    move-object/from16 v24, v21

    .local v24, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v25, 0x0

    .line 451
    .local v25, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v26, 0x0

    .line 452
    .local v26, "stack$iv$iv":Ljava/lang/Object;
    const/16 v27, 0x0

    .local v27, "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v27, v24

    move-object/from16 v3, v27

    .line 453
    .end local v27    # "node$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv":Ljava/lang/Object;
    :goto_7
    if-eqz v3, :cond_14

    .line 454
    move-object/from16 v28, v0

    .end local v0    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .local v28, "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    instance-of v0, v3, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v0, :cond_8

    .line 455
    move-object v0, v3

    check-cast v0, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v0, "it":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v29, 0x0

    .line 259
    .local v29, "$i$a$-visitChildren-Y-YKmho$default-FocusRequester$findFocusTarget$4$1":I
    move-object/from16 v30, v1

    move-object/from16 v1, p1

    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v30, "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v31

    check-cast v31, Ljava/lang/Boolean;

    invoke-virtual/range {v31 .. v31}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v31

    if-eqz v31, :cond_7

    .line 260
    const/4 v2, 0x1

    .line 261
    move/from16 v1, v20

    goto/16 :goto_11

    .line 263
    :cond_7
    nop

    .line 455
    .end local v0    # "it":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v29    # "$i$a$-visitChildren-Y-YKmho$default-FocusRequester$findFocusTarget$4$1":I
    move/from16 v38, v2

    move-object/from16 v39, v3

    move/from16 v1, v20

    goto/16 :goto_f

    .line 456
    .end local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_8
    move-object/from16 v30, v1

    move-object/from16 v1, p1

    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    move-object v0, v3

    .local v0, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v29, 0x0

    .line 457
    .local v29, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v31

    and-int v31, v31, v13

    if-eqz v31, :cond_9

    move/from16 v0, v20

    goto :goto_8

    :cond_9
    const/4 v0, 0x0

    .line 456
    .end local v0    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v29    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_8
    if-eqz v0, :cond_13

    instance-of v0, v3, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v0, :cond_13

    .line 458
    const/4 v0, 0x0

    .line 459
    .local v0, "count$iv$iv":I
    move-object/from16 v29, v3

    check-cast v29, Landroidx/compose/ui/node/DelegatingNode;

    .local v29, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v31, 0x0

    .line 460
    .local v31, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v32

    .line 461
    .local v32, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_9
    if-eqz v32, :cond_11

    .line 462
    move-object/from16 v33, v32

    .local v33, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v34, 0x0

    .line 463
    .local v34, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object/from16 v35, v33

    .local v35, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v36, 0x0

    .line 457
    .local v36, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v37

    and-int v37, v37, v13

    if-eqz v37, :cond_a

    move/from16 v35, v20

    goto :goto_a

    :cond_a
    const/16 v35, 0x0

    .line 463
    .end local v35    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v36    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_a
    if-eqz v35, :cond_10

    .line 464
    add-int/lit8 v0, v0, 0x1

    .line 465
    move/from16 v1, v20

    if-ne v0, v1, :cond_b

    .line 466
    move-object/from16 v3, v33

    move/from16 v38, v2

    move-object v2, v3

    goto :goto_e

    .line 470
    :cond_b
    if-nez v26, :cond_c

    const/4 v1, 0x0

    .line 433
    .local v1, "$i$f$mutableVectorOf":I
    nop

    .line 434
    move/from16 v35, v0

    .end local v0    # "count$iv$iv":I
    .local v35, "count$iv$iv":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v36, 0x0

    .line 435
    .local v36, "$i$f$MutableVector":I
    move/from16 v37, v1

    .end local v1    # "$i$f$mutableVectorOf":I
    .local v37, "$i$f$mutableVectorOf":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v38, v2

    .end local v2    # "success":Z
    .local v38, "success":Z
    new-array v2, v0, [Landroidx/compose/ui/Modifier$Node;

    move-object/from16 v39, v3

    const/4 v3, 0x0

    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .local v39, "node$iv$iv":Ljava/lang/Object;
    invoke-direct {v1, v2, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 433
    .end local v0    # "capacity$iv$iv$iv$iv":I
    .end local v36    # "$i$f$MutableVector":I
    goto :goto_b

    .line 470
    .end local v35    # "count$iv$iv":I
    .end local v37    # "$i$f$mutableVectorOf":I
    .end local v38    # "success":Z
    .end local v39    # "node$iv$iv":Ljava/lang/Object;
    .local v0, "count$iv$iv":I
    .restart local v2    # "success":Z
    .restart local v3    # "node$iv$iv":Ljava/lang/Object;
    :cond_c
    move/from16 v35, v0

    move/from16 v38, v2

    move-object/from16 v39, v3

    const/4 v3, 0x0

    .end local v0    # "count$iv$iv":I
    .end local v2    # "success":Z
    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .restart local v35    # "count$iv$iv":I
    .restart local v38    # "success":Z
    .restart local v39    # "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v1, v26

    :goto_b
    nop

    .line 471
    .end local v26    # "stack$iv$iv":Ljava/lang/Object;
    .local v1, "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v39

    .line 472
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_e

    .line 473
    if-eqz v1, :cond_d

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 474
    :cond_d
    const/4 v2, 0x0

    .end local v39    # "node$iv$iv":Ljava/lang/Object;
    .local v2, "node$iv$iv":Ljava/lang/Object;
    goto :goto_c

    .line 472
    .end local v2    # "node$iv$iv":Ljava/lang/Object;
    .restart local v39    # "node$iv$iv":Ljava/lang/Object;
    :cond_e
    move-object/from16 v2, v39

    .line 476
    .end local v39    # "node$iv$iv":Ljava/lang/Object;
    .restart local v2    # "node$iv$iv":Ljava/lang/Object;
    :goto_c
    if-eqz v1, :cond_f

    move-object/from16 v3, v33

    .end local v33    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v1, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .end local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v33    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_f
    move-object/from16 v3, v33

    .line 479
    .end local v0    # "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v33    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_d
    move-object/from16 v26, v1

    move/from16 v0, v35

    goto :goto_e

    .line 463
    .end local v1    # "stack$iv$iv":Ljava/lang/Object;
    .end local v35    # "count$iv$iv":I
    .end local v38    # "success":Z
    .local v0, "count$iv$iv":I
    .local v2, "success":Z
    .local v3, "node$iv$iv":Ljava/lang/Object;
    .restart local v26    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v33    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_10
    move/from16 v38, v2

    move-object/from16 v39, v3

    move-object/from16 v3, v33

    .end local v2    # "success":Z
    .end local v33    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v38    # "success":Z
    .restart local v39    # "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v39

    .line 479
    .end local v39    # "node$iv$iv":Ljava/lang/Object;
    .local v2, "node$iv$iv":Ljava/lang/Object;
    :goto_e
    nop

    .line 462
    .end local v3    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v34    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 480
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v32

    move-object/from16 v1, p1

    move-object v3, v2

    move/from16 v2, v38

    const/16 v20, 0x1

    goto :goto_9

    .line 482
    .end local v38    # "success":Z
    .local v2, "success":Z
    .local v3, "node$iv$iv":Ljava/lang/Object;
    :cond_11
    move/from16 v38, v2

    move-object/from16 v39, v3

    .line 483
    .end local v2    # "success":Z
    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .end local v29    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v31    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v32    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v38    # "success":Z
    .restart local v39    # "node$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x1

    if-ne v0, v1, :cond_12

    .line 485
    move/from16 v20, v1

    move-object/from16 v0, v28

    move-object/from16 v1, v30

    move/from16 v2, v38

    move-object/from16 v3, v39

    goto/16 :goto_7

    .line 483
    :cond_12
    move-object/from16 v3, v39

    goto :goto_10

    .line 456
    .end local v0    # "count$iv$iv":I
    .end local v38    # "success":Z
    .end local v39    # "node$iv$iv":Ljava/lang/Object;
    .restart local v2    # "success":Z
    .restart local v3    # "node$iv$iv":Ljava/lang/Object;
    :cond_13
    move/from16 v38, v2

    move-object/from16 v39, v3

    move/from16 v1, v20

    .line 488
    :goto_f
    move-object/from16 v3, v39

    .end local v2    # "success":Z
    .restart local v38    # "success":Z
    :goto_10
    invoke-static/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    move/from16 v20, v1

    move-object/from16 v0, v28

    move-object/from16 v1, v30

    move/from16 v2, v38

    goto/16 :goto_7

    .line 490
    .end local v28    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v38    # "success":Z
    .local v0, "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .local v1, "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "success":Z
    :cond_14
    move-object/from16 v28, v0

    move-object/from16 v30, v1

    move/from16 v38, v2

    move-object/from16 v39, v3

    move/from16 v1, v20

    .line 425
    .end local v0    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "success":Z
    .end local v3    # "node$iv$iv":Ljava/lang/Object;
    .end local v24    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v25    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v26    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v28    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v38    # "success":Z
    nop

    .line 450
    .end local v21    # "it$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v23    # "$i$a$-visitChildren-DelegatableNodeKt$visitChildren$2$iv":I
    nop

    .line 491
    move-object/from16 v1, v30

    const/4 v3, 0x0

    goto/16 :goto_4

    .line 493
    .end local v28    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v38    # "success":Z
    .restart local v0    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "success":Z
    :cond_15
    move-object/from16 v28, v0

    move-object/from16 v30, v1

    move/from16 v38, v2

    move/from16 v1, v20

    .end local v0    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "success":Z
    .restart local v28    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v38    # "success":Z
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v19

    move-object/from16 v1, v30

    const/4 v3, 0x0

    goto/16 :goto_6

    .line 448
    .end local v28    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v38    # "success":Z
    .restart local v0    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "success":Z
    :cond_16
    move-object/from16 v28, v0

    move-object/from16 v30, v1

    move/from16 v38, v2

    move/from16 v1, v20

    .end local v0    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "success":Z
    .restart local v28    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v38    # "success":Z
    move-object/from16 v1, v30

    const/4 v3, 0x0

    goto/16 :goto_4

    .line 496
    .end local v4    # "branch$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v30    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v38    # "success":Z
    .restart local v0    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "success":Z
    :cond_17
    move-object/from16 v28, v0

    move-object/from16 v30, v1

    move/from16 v38, v2

    move/from16 v1, v20

    .line 425
    .end local v0    # "branches$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "child$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "success":Z
    .end local v16    # "mask$iv$iv":I
    .end local v17    # "$this$visitChildren$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v18    # "$i$f$visitChildren":I
    .restart local v38    # "success":Z
    nop

    .line 264
    .end local v12    # "$this$visitChildren_u2dY_u2dYKmho_u24default$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "type$iv":I
    .end local v14    # "zOrder$iv":Z
    .end local v15    # "$i$f$visitChildren-Y-YKmho":I
    nop

    .line 419
    .end local v10    # "node":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    .end local v11    # "$i$a$-forEach-FocusRequester$findFocusTarget$4":I
    .end local v38    # "success":Z
    .restart local v2    # "success":Z
    :goto_11
    nop

    .line 497
    add-int/lit8 v7, v7, 0x1

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v22

    goto/16 :goto_3

    .line 499
    .end local v22    # "$i$f$findFocusTarget":I
    .local v1, "$i$f$findFocusTarget":I
    :cond_18
    move/from16 v38, v2

    .line 265
    .end local v2    # "success":Z
    .end local v5    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v6    # "$i$f$forEach":I
    .end local v7    # "i$iv":I
    .end local v8    # "content$iv":[Ljava/lang/Object;
    .end local v9    # "size$iv":I
    .restart local v38    # "success":Z
    return v38

    .line 373
    .end local v38    # "success":Z
    :cond_19
    move/from16 v22, v1

    .end local v1    # "$i$f$findFocusTarget":I
    .restart local v22    # "$i$f$findFocusTarget":I
    const/4 v0, 0x0

    .line 255
    .local v0, "$i$a$-check-FocusRequester$findFocusTarget$3":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$findFocusTarget$3":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 373
    .end local v22    # "$i$f$findFocusTarget":I
    .restart local v1    # "$i$f$findFocusTarget":I
    :cond_1a
    move/from16 v22, v1

    .end local v1    # "$i$f$findFocusTarget":I
    .restart local v22    # "$i$f$findFocusTarget":I
    const/4 v0, 0x0

    .line 254
    .local v0, "$i$a$-check-FocusRequester$findFocusTarget$2":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$findFocusTarget$2":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 373
    .end local v22    # "$i$f$findFocusTarget":I
    .restart local v1    # "$i$f$findFocusTarget":I
    :cond_1b
    move/from16 v22, v1

    .end local v1    # "$i$f$findFocusTarget":I
    .restart local v22    # "$i$f$findFocusTarget":I
    const/4 v0, 0x0

    .line 253
    .local v0, "$i$a$-check-FocusRequester$findFocusTarget$1":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$findFocusTarget$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic requestFocus-3ESFkO8$default(Landroidx/compose/ui/focus/FocusRequester;IILjava/lang/Object;)Z
    .locals 0

    .line 82
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    move-result p1

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8(I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final captureFocus()Z
    .locals 10

    .line 111
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .local v0, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v1, 0x0

    .line 372
    .local v1, "$i$f$isNotEmpty":I
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    .line 111
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "$i$f$isNotEmpty":I
    :goto_0
    if-eqz v0, :cond_3

    .line 112
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .restart local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v1, 0x0

    .line 374
    .local v1, "$i$f$forEach":I
    nop

    .line 375
    const/4 v2, 0x0

    .line 376
    .local v2, "i$iv":I
    iget-object v5, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 377
    .local v5, "content$iv":[Ljava/lang/Object;
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v6

    .line 378
    .local v6, "size$iv":I
    :goto_1
    if-ge v2, v6, :cond_2

    .line 379
    aget-object v7, v5, v2

    check-cast v7, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .local v7, "it":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    const/4 v8, 0x0

    .line 113
    .local v8, "$i$a$-forEach-FocusRequester$captureFocus$2":I
    invoke-static {v7}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->captureFocus(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 114
    return v4

    .line 116
    :cond_1
    nop

    .line 379
    .end local v7    # "it":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    .end local v8    # "$i$a$-forEach-FocusRequester$captureFocus$2":I
    nop

    .line 380
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 382
    :cond_2
    nop

    .line 117
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "$i$f$forEach":I
    .end local v2    # "i$iv":I
    .end local v5    # "content$iv":[Ljava/lang/Object;
    .end local v6    # "size$iv":I
    return v3

    .line 373
    :cond_3
    const/4 v0, 0x0

    .line 111
    .local v0, "$i$a$-check-FocusRequester$captureFocus$1":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$captureFocus$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final findFocusTargetNode$ui_release(Lkotlin/jvm/functions/Function1;)Z
    .locals 41
    .param p1, "onFound"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 87
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    const/4 v2, 0x0

    .line 272
    .local v2, "$i$f$findFocusTarget":I
    sget-object v3, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v3

    const/4 v4, 0x0

    if-eq v1, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    const-string v6, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    if-eqz v3, :cond_1c

    .line 274
    sget-object v3, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v3

    if-eq v1, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    if-eqz v3, :cond_1b

    .line 275
    iget-object v3, v1, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .local v3, "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v6, 0x0

    .line 276
    .local v6, "$i$f$isNotEmpty":I
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v7

    if-eqz v7, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move v3, v4

    .line 275
    .end local v3    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v6    # "$i$f$isNotEmpty":I
    :goto_2
    if-eqz v3, :cond_1a

    .line 277
    const/4 v3, 0x0

    .line 278
    .local v3, "success$iv":Z
    iget-object v6, v1, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .local v6, "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v7, 0x0

    .line 279
    .local v7, "$i$f$forEach":I
    nop

    .line 280
    const/4 v8, 0x0

    .line 281
    .local v8, "i$iv$iv":I
    iget-object v9, v6, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 282
    .local v9, "content$iv$iv":[Ljava/lang/Object;
    invoke-virtual {v6}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v10

    .line 283
    .local v10, "size$iv$iv":I
    :goto_3
    if-ge v8, v10, :cond_19

    .line 284
    aget-object v11, v9, v8

    check-cast v11, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .local v11, "node$iv":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    const/4 v12, 0x0

    .line 285
    .local v12, "$i$a$-forEach-FocusRequester$findFocusTarget$4$iv":I
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v14, 0x0

    .line 286
    .local v14, "$i$f$getFocusTarget-OLwlOKw":I
    const/16 v15, 0x400

    invoke-static {v15}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v14

    .line 285
    .end local v14    # "$i$f$getFocusTarget-OLwlOKw":I
    nop

    .line 287
    .local v13, "$this$visitChildren_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v14, "type$iv$iv":I
    nop

    .line 289
    const/4 v15, 0x0

    .line 287
    .local v15, "zOrder$iv$iv":Z
    const/16 v16, 0x0

    .line 291
    .local v16, "$i$f$visitChildren-Y-YKmho":I
    move/from16 v17, v14

    .local v17, "mask$iv$iv$iv":I
    move-object/from16 v18, v13

    .local v18, "$this$visitChildren$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v19, 0x0

    .line 292
    .local v19, "$i$f$visitChildren":I
    invoke-interface/range {v18 .. v18}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v20

    .local v20, "value$iv$iv$iv$iv":Z
    const/16 v21, 0x0

    .line 293
    .local v21, "$i$f$checkPrecondition":I
    nop

    .line 294
    if-nez v20, :cond_3

    .line 295
    const/16 v22, 0x0

    .line 292
    .local v22, "$i$a$-checkPrecondition-DelegatableNodeKt$visitChildren$1$iv$iv$iv":I
    nop

    .line 295
    .end local v22    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitChildren$1$iv$iv$iv":I
    const-string/jumbo v22, "visitChildren called on an unattached node"

    invoke-static/range {v22 .. v22}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 297
    :cond_3
    nop

    .line 298
    .end local v20    # "value$iv$iv$iv$iv":Z
    .end local v21    # "$i$f$checkPrecondition":I
    const/16 v20, 0x0

    .line 299
    .local v20, "$i$f$mutableVectorOf":I
    nop

    .line 300
    const/16 v21, 0x1

    const/16 v5, 0x10

    .local v5, "capacity$iv$iv$iv$iv$iv":I
    const/16 v22, 0x0

    .line 301
    .local v22, "$i$f$MutableVector":I
    move-object/from16 v23, v1

    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .local v23, "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v24, v2

    .end local v2    # "$i$f$findFocusTarget":I
    .local v24, "$i$f$findFocusTarget":I
    new-array v2, v5, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v1, v2, v4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 299
    .end local v5    # "capacity$iv$iv$iv$iv$iv":I
    .end local v22    # "$i$f$MutableVector":I
    nop

    .line 298
    .end local v20    # "$i$f$mutableVectorOf":I
    nop

    .line 302
    .local v1, "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    invoke-interface/range {v18 .. v18}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    .line 303
    .local v2, "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-nez v2, :cond_4

    invoke-interface/range {v18 .. v18}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v5

    invoke-static {v1, v5, v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    goto :goto_4

    :cond_4
    invoke-virtual {v1, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 304
    :goto_4
    move-object v5, v1

    .local v5, "this_$iv$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/16 v20, 0x0

    .line 276
    .local v20, "$i$f$isNotEmpty":I
    invoke-virtual {v5}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v22

    if-eqz v22, :cond_5

    move/from16 v5, v21

    goto :goto_5

    :cond_5
    move v5, v4

    .end local v5    # "this_$iv$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v20    # "$i$f$isNotEmpty":I
    :goto_5
    if-eqz v5, :cond_18

    .line 305
    move-object v5, v1

    .restart local v5    # "this_$iv$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/16 v20, 0x0

    .line 306
    .local v20, "$i$f$getLastIndex":I
    invoke-virtual {v5}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v22

    add-int/lit8 v5, v22, -0x1

    .line 305
    .end local v5    # "this_$iv$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v20    # "$i$f$getLastIndex":I
    invoke-virtual {v1, v5}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/ui/Modifier$Node;

    .line 307
    .local v5, "branch$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v17

    if-nez v20, :cond_6

    .line 308
    invoke-static {v1, v5, v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 310
    goto :goto_4

    .line 312
    :cond_6
    move-object/from16 v20, v5

    .line 313
    .local v20, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_6
    if-eqz v20, :cond_17

    .line 314
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v22

    and-int v22, v22, v17

    if-eqz v22, :cond_16

    .line 315
    move-object/from16 v22, v20

    .local v22, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v25, 0x0

    .line 291
    .local v25, "$i$a$-visitChildren-DelegatableNodeKt$visitChildren$2$iv$iv":I
    move-object/from16 v26, v22

    .local v26, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v27, 0x0

    .line 316
    .local v27, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v28, 0x0

    .line 317
    .local v28, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v29, 0x0

    .local v29, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v29, v26

    move-object/from16 v4, v29

    .line 318
    .end local v29    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v4, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_7
    if-eqz v4, :cond_15

    .line 319
    move-object/from16 v30, v1

    .end local v1    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .local v30, "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    instance-of v1, v4, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v1, :cond_9

    .line 320
    move-object v1, v4

    check-cast v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v1, "it$iv":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v31, 0x0

    .line 321
    .local v31, "$i$a$-visitChildren-Y-YKmho$default-FocusRequester$findFocusTarget$4$1$iv":I
    move-object/from16 v32, v1

    .local v32, "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v33, 0x0

    .line 88
    .local v33, "$i$a$-findFocusTarget-FocusRequester$findFocusTargetNode$1":I
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    move-result-object v34

    invoke-interface/range {v34 .. v34}, Landroidx/compose/ui/focus/FocusProperties;->getCanFocus()Z

    move-result v34

    if-eqz v34, :cond_7

    .line 89
    move-object/from16 v34, v1

    move-object/from16 v1, v32

    .end local v32    # "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v1, "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v34, "it$iv":Landroidx/compose/ui/focus/FocusTargetNode;
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v32

    check-cast v32, Ljava/lang/Boolean;

    invoke-virtual/range {v32 .. v32}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v32

    move-object/from16 v35, v2

    goto :goto_8

    .line 91
    .end local v34    # "it$iv":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v1, "it$iv":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v32    # "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_7
    move-object/from16 v34, v1

    move-object/from16 v1, v32

    .end local v32    # "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v1, "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v34    # "it$iv":Landroidx/compose/ui/focus/FocusTargetNode;
    sget-object v32, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    move-object/from16 v35, v2

    .end local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v35, "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    move-result v2

    invoke-static {v1, v2, v0}, Landroidx/compose/ui/focus/TwoDimensionalFocusSearchKt;->findChildCorrespondingToFocusEnter--OM-vw8(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z

    move-result v32

    .line 92
    :goto_8
    nop

    .line 321
    .end local v1    # "focusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v33    # "$i$a$-findFocusTarget-FocusRequester$findFocusTargetNode$1":I
    if-eqz v32, :cond_8

    .line 322
    const/4 v1, 0x1

    .line 323
    .end local v3    # "success$iv":Z
    .local v1, "success$iv":Z
    move v3, v1

    move/from16 v0, v21

    goto/16 :goto_10

    .line 325
    .end local v1    # "success$iv":Z
    .restart local v3    # "success$iv":Z
    :cond_8
    nop

    .line 320
    .end local v31    # "$i$a$-visitChildren-Y-YKmho$default-FocusRequester$findFocusTarget$4$1$iv":I
    .end local v34    # "it$iv":Landroidx/compose/ui/focus/FocusTargetNode;
    move/from16 v0, v21

    goto/16 :goto_f

    .line 326
    .end local v35    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_9
    move-object/from16 v35, v2

    .end local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v35    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    move-object v1, v4

    .local v1, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 327
    .local v2, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v31

    and-int v31, v31, v14

    if-eqz v31, :cond_a

    move/from16 v1, v21

    goto :goto_9

    :cond_a
    const/4 v1, 0x0

    .line 326
    .end local v1    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_9
    if-eqz v1, :cond_13

    instance-of v1, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_13

    .line 328
    const/4 v1, 0x0

    .line 329
    .local v1, "count$iv$iv$iv":I
    move-object v2, v4

    check-cast v2, Landroidx/compose/ui/node/DelegatingNode;

    .local v2, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v31, 0x0

    .line 330
    .local v31, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v2}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v32

    .line 331
    .local v32, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_a
    if-eqz v32, :cond_12

    .line 332
    move-object/from16 v33, v32

    .local v33, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v34, 0x0

    .line 333
    .local v34, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v36, v33

    .local v36, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v37, 0x0

    .line 327
    .local v37, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v38

    and-int v38, v38, v14

    if-eqz v38, :cond_b

    move/from16 v36, v21

    goto :goto_b

    :cond_b
    const/16 v36, 0x0

    .line 333
    .end local v36    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v37    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_b
    if-eqz v36, :cond_11

    .line 334
    add-int/lit8 v1, v1, 0x1

    .line 335
    move/from16 v0, v21

    if-ne v1, v0, :cond_c

    .line 336
    move-object/from16 v4, v33

    move-object/from16 v39, v2

    move-object/from16 v0, v33

    goto :goto_e

    .line 340
    :cond_c
    if-nez v28, :cond_d

    const/4 v0, 0x0

    .line 299
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 300
    move/from16 v36, v0

    .end local v0    # "$i$f$mutableVectorOf":I
    .local v36, "$i$f$mutableVectorOf":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv":I
    const/16 v37, 0x0

    .line 301
    .local v37, "$i$f$MutableVector":I
    move/from16 v38, v1

    .end local v1    # "count$iv$iv$iv":I
    .local v38, "count$iv$iv$iv":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v39, v2

    .end local v2    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v39, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    new-array v2, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v40, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv":I
    .local v40, "capacity$iv$iv$iv$iv$iv":I
    invoke-direct {v1, v2, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 299
    .end local v37    # "$i$f$MutableVector":I
    .end local v40    # "capacity$iv$iv$iv$iv$iv":I
    goto :goto_c

    .line 340
    .end local v36    # "$i$f$mutableVectorOf":I
    .end local v38    # "count$iv$iv$iv":I
    .end local v39    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v1    # "count$iv$iv$iv":I
    .restart local v2    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    :cond_d
    move/from16 v38, v1

    move-object/from16 v39, v2

    const/4 v0, 0x0

    .end local v1    # "count$iv$iv$iv":I
    .end local v2    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v38    # "count$iv$iv$iv":I
    .restart local v39    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    move-object/from16 v1, v28

    :goto_c
    nop

    .line 341
    .end local v28    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v1, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object v2, v4

    .line 342
    .local v2, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v2, :cond_f

    .line 343
    if-eqz v1, :cond_e

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 344
    :cond_e
    const/4 v4, 0x0

    .line 346
    :cond_f
    if-eqz v1, :cond_10

    move-object/from16 v0, v33

    .end local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .end local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_10
    move-object/from16 v0, v33

    .line 349
    .end local v2    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_d
    move-object/from16 v28, v1

    move/from16 v1, v38

    goto :goto_e

    .line 333
    .end local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v38    # "count$iv$iv$iv":I
    .end local v39    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v1, "count$iv$iv$iv":I
    .local v2, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v28    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_11
    move-object/from16 v39, v2

    move-object/from16 v0, v33

    .line 349
    .end local v2    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v33    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v39    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    :goto_e
    nop

    .line 332
    .end local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v34    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 350
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v32

    move-object/from16 v0, p1

    move-object/from16 v2, v39

    const/16 v21, 0x1

    goto :goto_a

    .line 352
    .end local v39    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v2    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    :cond_12
    move-object/from16 v39, v2

    .line 353
    .end local v2    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v31    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v32    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v0, 0x1

    if-ne v1, v0, :cond_14

    .line 355
    move/from16 v21, v0

    move-object/from16 v1, v30

    move-object/from16 v2, v35

    move-object/from16 v0, p1

    goto/16 :goto_7

    .line 326
    .end local v1    # "count$iv$iv$iv":I
    :cond_13
    move/from16 v0, v21

    .line 358
    :cond_14
    :goto_f
    invoke-static/range {v28 .. v28}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move/from16 v21, v0

    move-object/from16 v1, v30

    move-object/from16 v2, v35

    move-object/from16 v0, p1

    goto/16 :goto_7

    .line 360
    .end local v30    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v35    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v1, "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .local v2, "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_15
    move-object/from16 v30, v1

    move-object/from16 v35, v2

    move/from16 v0, v21

    .line 291
    .end local v1    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v4    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v26    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v27    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v28    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v30    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v35    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    nop

    .line 315
    .end local v22    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v25    # "$i$a$-visitChildren-DelegatableNodeKt$visitChildren$2$iv$iv":I
    nop

    .line 361
    const/4 v4, 0x0

    move-object/from16 v0, p1

    goto/16 :goto_4

    .line 363
    .end local v30    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v35    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_16
    move-object/from16 v30, v1

    move-object/from16 v35, v2

    move/from16 v0, v21

    .end local v1    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v30    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v35    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v20

    const/4 v4, 0x0

    move-object/from16 v0, p1

    goto/16 :goto_6

    .line 313
    .end local v30    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v35    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_17
    move-object/from16 v30, v1

    move-object/from16 v35, v2

    move/from16 v0, v21

    .end local v1    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v30    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v35    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v4, 0x0

    move-object/from16 v0, p1

    goto/16 :goto_4

    .line 366
    .end local v5    # "branch$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v35    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v1    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .restart local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_18
    move-object/from16 v30, v1

    move-object/from16 v35, v2

    move/from16 v0, v21

    .line 291
    .end local v1    # "branches$iv$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "child$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v17    # "mask$iv$iv$iv":I
    .end local v18    # "$this$visitChildren$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v19    # "$i$f$visitChildren":I
    nop

    .line 367
    .end local v13    # "$this$visitChildren_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "type$iv$iv":I
    .end local v15    # "zOrder$iv$iv":Z
    .end local v16    # "$i$f$visitChildren-Y-YKmho":I
    nop

    .line 284
    .end local v11    # "node$iv":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    .end local v12    # "$i$a$-forEach-FocusRequester$findFocusTarget$4$iv":I
    :goto_10
    nop

    .line 368
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move/from16 v2, v24

    const/4 v4, 0x0

    goto/16 :goto_3

    .line 370
    .end local v23    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .end local v24    # "$i$f$findFocusTarget":I
    .local v1, "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .local v2, "$i$f$findFocusTarget":I
    :cond_19
    nop

    .line 371
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v7    # "$i$f$forEach":I
    .end local v8    # "i$iv$iv":I
    .end local v9    # "content$iv$iv":[Ljava/lang/Object;
    .end local v10    # "size$iv$iv":I
    nop

    .line 87
    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .end local v2    # "$i$f$findFocusTarget":I
    .end local v3    # "success$iv":Z
    return v3

    .line 273
    .restart local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .restart local v2    # "$i$f$findFocusTarget":I
    :cond_1a
    move-object/from16 v23, v1

    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .restart local v23    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    const/4 v0, 0x0

    .line 275
    .local v0, "$i$a$-check-FocusRequester$findFocusTarget$3$iv":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$findFocusTarget$3$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 273
    .end local v23    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .restart local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    :cond_1b
    move-object/from16 v23, v1

    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .restart local v23    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    const/4 v0, 0x0

    .line 274
    .local v0, "$i$a$-check-FocusRequester$findFocusTarget$2$iv":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$findFocusTarget$2$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 273
    .end local v23    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .restart local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    :cond_1c
    move-object/from16 v23, v1

    .end local v1    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    .restart local v23    # "this_$iv":Landroidx/compose/ui/focus/FocusRequester;
    const/4 v0, 0x0

    .line 272
    .local v0, "$i$a$-check-FocusRequester$findFocusTarget$1$iv":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$findFocusTarget$1$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final freeFocus()Z
    .locals 10

    .line 134
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .local v0, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v1, 0x0

    .line 383
    .local v1, "$i$f$isNotEmpty":I
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    .line 134
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "$i$f$isNotEmpty":I
    :goto_0
    if-eqz v0, :cond_3

    .line 135
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .restart local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v1, 0x0

    .line 384
    .local v1, "$i$f$forEach":I
    nop

    .line 385
    const/4 v2, 0x0

    .line 386
    .local v2, "i$iv":I
    iget-object v5, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 387
    .local v5, "content$iv":[Ljava/lang/Object;
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v6

    .line 388
    .local v6, "size$iv":I
    :goto_1
    if-ge v2, v6, :cond_2

    .line 389
    aget-object v7, v5, v2

    check-cast v7, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .local v7, "it":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    const/4 v8, 0x0

    .line 136
    .local v8, "$i$a$-forEach-FocusRequester$freeFocus$2":I
    invoke-static {v7}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->freeFocus(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 137
    return v4

    .line 139
    :cond_1
    nop

    .line 389
    .end local v7    # "it":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    .end local v8    # "$i$a$-forEach-FocusRequester$freeFocus$2":I
    nop

    .line 390
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 392
    :cond_2
    nop

    .line 140
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "$i$f$forEach":I
    .end local v2    # "i$iv":I
    .end local v5    # "content$iv":[Ljava/lang/Object;
    .end local v6    # "size$iv":I
    return v3

    .line 373
    :cond_3
    const/4 v0, 0x0

    .line 134
    .local v0, "$i$a$-check-FocusRequester$freeFocus$1":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$freeFocus$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getFocusRequesterNodes$ui_release()Landroidx/compose/runtime/collection/MutableVector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/focus/FocusRequesterModifierNode;",
            ">;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    return-object v0
.end method

.method public final synthetic requestFocus()V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "use the version the has a FocusDirection"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "this.requestFocus()"
            imports = {}
        .end subannotation
    .end annotation

    .line 68
    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getEnter-dhqQ-8s()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus-3ESFkO8(I)Z

    .line 69
    return-void
.end method

.method public final requestFocus-3ESFkO8(I)Z
    .locals 1
    .param p1, "focusDirection"    # I

    .line 82
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester$requestFocus$1;

    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusRequester$requestFocus$1;-><init>(I)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusRequester;->findFocusTargetNode$ui_release(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    .line 84
    return v0
.end method

.method public final restoreFocusedChild()Z
    .locals 11

    .line 168
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .local v0, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v1, 0x0

    .line 403
    .local v1, "$i$f$isNotEmpty":I
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    .line 168
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "$i$f$isNotEmpty":I
    :goto_0
    if-eqz v0, :cond_4

    .line 169
    const/4 v0, 0x0

    .line 170
    .local v0, "success":Z
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .local v1, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v2, 0x0

    .line 404
    .local v2, "$i$f$forEach":I
    nop

    .line 405
    const/4 v5, 0x0

    .line 406
    .local v5, "i$iv":I
    iget-object v6, v1, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 407
    .local v6, "content$iv":[Ljava/lang/Object;
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v7

    .line 408
    .local v7, "size$iv":I
    :goto_1
    if-ge v5, v7, :cond_3

    .line 409
    aget-object v8, v6, v5

    check-cast v8, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .local v8, "it":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    const/4 v9, 0x0

    .line 170
    .local v9, "$i$a$-forEach-FocusRequester$restoreFocusedChild$2":I
    invoke-static {v8}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->restoreFocusedChild(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    move-result v10

    if-nez v10, :cond_2

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    move v10, v3

    goto :goto_3

    :cond_2
    :goto_2
    move v10, v4

    :goto_3
    move v0, v10

    .line 409
    .end local v8    # "it":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    .end local v9    # "$i$a$-forEach-FocusRequester$restoreFocusedChild$2":I
    nop

    .line 410
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 412
    :cond_3
    nop

    .line 171
    .end local v1    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "$i$f$forEach":I
    .end local v5    # "i$iv":I
    .end local v6    # "content$iv":[Ljava/lang/Object;
    .end local v7    # "size$iv":I
    return v0

    .line 373
    .end local v0    # "success":Z
    :cond_4
    const/4 v0, 0x0

    .line 168
    .local v0, "$i$a$-check-FocusRequester$restoreFocusedChild$1":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$restoreFocusedChild$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final saveFocusedChild()Z
    .locals 10

    .line 153
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .local v0, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v1, 0x0

    .line 393
    .local v1, "$i$f$isNotEmpty":I
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    .line 153
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "$i$f$isNotEmpty":I
    :goto_0
    if-eqz v0, :cond_3

    .line 154
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequester;->focusRequesterNodes:Landroidx/compose/runtime/collection/MutableVector;

    .restart local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v1, 0x0

    .line 394
    .local v1, "$i$f$forEach":I
    nop

    .line 395
    const/4 v2, 0x0

    .line 396
    .local v2, "i$iv":I
    iget-object v5, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 397
    .local v5, "content$iv":[Ljava/lang/Object;
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v6

    .line 398
    .local v6, "size$iv":I
    :goto_1
    if-ge v2, v6, :cond_2

    .line 399
    aget-object v7, v5, v2

    check-cast v7, Landroidx/compose/ui/focus/FocusRequesterModifierNode;

    .local v7, "it":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    const/4 v8, 0x0

    .line 154
    .local v8, "$i$a$-forEach-FocusRequester$saveFocusedChild$2":I
    invoke-static {v7}, Landroidx/compose/ui/focus/FocusRequesterModifierNodeKt;->saveFocusedChild(Landroidx/compose/ui/focus/FocusRequesterModifierNode;)Z

    move-result v9

    if-eqz v9, :cond_1

    return v4

    .line 399
    .end local v7    # "it":Landroidx/compose/ui/focus/FocusRequesterModifierNode;
    .end local v8    # "$i$a$-forEach-FocusRequester$saveFocusedChild$2":I
    :cond_1
    nop

    .line 400
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 402
    :cond_2
    nop

    .line 155
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "$i$f$forEach":I
    .end local v2    # "i$iv":I
    .end local v5    # "content$iv":[Ljava/lang/Object;
    .end local v6    # "size$iv":I
    return v3

    .line 373
    :cond_3
    const/4 v0, 0x0

    .line 153
    .local v0, "$i$a$-check-FocusRequester$saveFocusedChild$1":I
    nop

    .end local v0    # "$i$a$-check-FocusRequester$saveFocusedChild$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
