.class public final Landroidx/compose/ui/semantics/SemanticsNodeKt;
.super Ljava/lang/Object;
.source "SemanticsNode.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,502:1\n91#2:503\n91#2:568\n727#3:504\n662#3,6:505\n683#3,3:511\n668#3,2:514\n728#3:521\n671#3,2:560\n686#3,3:562\n673#3:565\n663#3:566\n730#3:567\n657#3,11:569\n683#3,3:580\n668#3,2:583\n671#3,2:628\n686#3,3:630\n673#3:633\n663#3:634\n658#3:635\n437#4,5:516\n442#4:522\n447#4,2:524\n449#4,8:529\n457#4,9:540\n466#4,8:552\n437#4,6:585\n447#4,2:592\n449#4,8:597\n457#4,9:608\n466#4,8:620\n246#5:523\n246#5:591\n240#6,3:526\n243#6,3:549\n240#6,3:594\n243#6,3:617\n1101#7:537\n1083#7,2:538\n1101#7:605\n1083#7,2:606\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n45#1:503\n475#1:568\n45#1:504\n45#1:505,6\n45#1:511,3\n45#1:514,2\n45#1:521\n45#1:560,2\n45#1:562,3\n45#1:565\n45#1:566\n45#1:567\n475#1:569,11\n475#1:580,3\n475#1:583,2\n475#1:628,2\n475#1:630,3\n475#1:633\n475#1:634\n475#1:635\n45#1:516,5\n45#1:522\n45#1:524,2\n45#1:529,8\n45#1:540,9\n45#1:552,8\n475#1:585,6\n475#1:592,2\n475#1:597,8\n475#1:608,9\n475#1:620,8\n45#1:523\n475#1:591\n45#1:526,3\n45#1:549,3\n475#1:594,3\n475#1:617,3\n45#1:537\n45#1:538,2\n475#1:605\n475#1:606,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\rH\u0000\u001a\"\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\u000c\u0010\u000f\u001a\u00020\u0010*\u00020\u0007H\u0002\u001a#\u0010\u0011\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0013H\u0080\u0008\u001a\u000c\u0010\u0014\u001a\u00020\u0010*\u00020\u0007H\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0015"
    }
    d2 = {
        "outerMergingSemantics",
        "Landroidx/compose/ui/node/SemanticsModifierNode;",
        "Landroidx/compose/ui/node/LayoutNode;",
        "getOuterMergingSemantics",
        "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;",
        "role",
        "Landroidx/compose/ui/semantics/Role;",
        "Landroidx/compose/ui/semantics/SemanticsNode;",
        "getRole",
        "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;",
        "SemanticsNode",
        "layoutNode",
        "mergingEnabled",
        "",
        "outerSemanticsNode",
        "contentDescriptionFakeNodeId",
        "",
        "findClosestParentNode",
        "selector",
        "Lkotlin/Function1;",
        "roleFakeNodeId",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final SemanticsNode(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/ui/semantics/SemanticsNode;
    .locals 33
    .param p0, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;
    .param p1, "mergingEnabled"    # Z

    .line 44
    nop

    .line 45
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    const/4 v1, 0x0

    .line 503
    .local v1, "$i$f$getSemantics-OLwlOKw":I
    const/16 v2, 0x8

    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    .line 45
    .end local v1    # "$i$f$getSemantics-OLwlOKw":I
    nop

    .local v0, "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .local v1, "type$iv":I
    const/4 v2, 0x0

    .line 504
    .local v2, "$i$f$head-H91voCI$ui_release":I
    move-object v3, v0

    .local v3, "this_$iv$iv":Landroidx/compose/ui/node/NodeChain;
    const/4 v4, 0x0

    .line 505
    .local v4, "$i$f$headToTail-aLcG6gQ$ui_release":I
    move v5, v1

    .local v5, "mask$iv$iv$iv":I
    move-object v6, v3

    .local v6, "this_$iv$iv$iv":Landroidx/compose/ui/node/NodeChain;
    const/4 v7, 0x0

    .line 509
    .local v7, "$i$f$headToTail$ui_release":I
    invoke-static {v6}, Landroidx/compose/ui/node/NodeChain;->access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I

    move-result v8

    and-int/2addr v8, v5

    if-eqz v8, :cond_f

    .line 510
    move-object v8, v6

    .local v8, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/NodeChain;
    const/4 v9, 0x0

    .line 511
    .local v9, "$i$f$headToTail$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    .line 512
    .local v10, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_0
    if-eqz v10, :cond_e

    .line 513
    move-object v11, v10

    .local v11, "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v12, 0x0

    .line 514
    .local v12, "$i$a$-headToTail$ui_release-NodeChain$headToTail$2$iv$iv$iv":I
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v13

    and-int/2addr v13, v5

    if-eqz v13, :cond_d

    .line 515
    move-object v13, v11

    .local v13, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 505
    .local v14, "$i$a$-headToTail$ui_release-NodeChain$headToTail$1$iv$iv":I
    move-object v15, v13

    .local v15, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 516
    .local v16, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v17, 0x0

    .line 517
    .local v17, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .local v18, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v15

    move-object/from16 v32, v18

    move-object/from16 v18, v0

    move-object/from16 v0, v32

    .line 518
    .local v0, "node$iv$iv$iv":Ljava/lang/Object;
    .local v18, "this_$iv":Landroidx/compose/ui/node/NodeChain;
    :goto_1
    if-eqz v0, :cond_c

    .line 519
    move/from16 v19, v1

    .end local v1    # "type$iv":I
    .local v19, "type$iv":I
    instance-of v1, v0, Landroidx/compose/ui/node/SemanticsModifierNode;

    if-eqz v1, :cond_0

    .line 520
    move-object v1, v0

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 521
    .local v20, "$i$a$-headToTail-aLcG6gQ$ui_release-NodeChain$head$1$iv":I
    goto/16 :goto_c

    .line 522
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-headToTail-aLcG6gQ$ui_release-NodeChain$head$1$iv":I
    :cond_0
    move-object v1, v0

    .local v1, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 523
    .local v20, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v21

    and-int v21, v21, v19

    move-object/from16 v22, v1

    .end local v1    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v22, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v21, :cond_1

    const/16 v20, 0x1

    goto :goto_2

    :cond_1
    const/16 v20, 0x0

    .line 522
    .end local v20    # "$i$f$isKind-H91voCI$ui_release":I
    .end local v22    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_2
    if-eqz v20, :cond_b

    instance-of v1, v0, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_b

    .line 524
    const/4 v1, 0x0

    .line 525
    .local v1, "count$iv$iv$iv":I
    move-object/from16 v21, v0

    check-cast v21, Landroidx/compose/ui/node/DelegatingNode;

    .local v21, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v22, 0x0

    .line 526
    .local v22, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v23

    .line 527
    .local v23, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_3
    if-eqz v23, :cond_9

    .line 528
    move-object/from16 v24, v23

    .local v24, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v25, 0x0

    .line 529
    .local v25, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v26, v24

    .local v26, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v27, 0x0

    .line 523
    .local v27, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v28

    and-int v28, v28, v19

    if-eqz v28, :cond_2

    const/16 v26, 0x1

    goto :goto_4

    :cond_2
    const/16 v26, 0x0

    .line 529
    .end local v26    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v27    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_4
    if-eqz v26, :cond_8

    .line 530
    add-int/lit8 v1, v1, 0x1

    .line 531
    move-object/from16 v26, v0

    const/4 v0, 0x1

    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v26, "node$iv$iv$iv":Ljava/lang/Object;
    if-ne v1, v0, :cond_3

    .line 532
    move-object/from16 v0, v24

    move/from16 v30, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v0

    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    goto :goto_8

    .line 536
    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    :cond_3
    if-nez v17, :cond_4

    const/4 v0, 0x0

    .line 537
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 538
    move/from16 v27, v0

    .end local v0    # "$i$f$mutableVectorOf":I
    .local v27, "$i$f$mutableVectorOf":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv":I
    const/16 v28, 0x0

    .line 539
    .local v28, "$i$f$MutableVector":I
    move/from16 v29, v1

    .end local v1    # "count$iv$iv$iv":I
    .local v29, "count$iv$iv$iv":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v30, v2

    .end local v2    # "$i$f$head-H91voCI$ui_release":I
    .local v30, "$i$f$head-H91voCI$ui_release":I
    new-array v2, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v31, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv":I
    .local v31, "capacity$iv$iv$iv$iv$iv":I
    invoke-direct {v1, v2, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 537
    .end local v28    # "$i$f$MutableVector":I
    .end local v31    # "capacity$iv$iv$iv$iv$iv":I
    goto :goto_5

    .line 536
    .end local v27    # "$i$f$mutableVectorOf":I
    .end local v29    # "count$iv$iv$iv":I
    .end local v30    # "$i$f$head-H91voCI$ui_release":I
    .restart local v1    # "count$iv$iv$iv":I
    .restart local v2    # "$i$f$head-H91voCI$ui_release":I
    :cond_4
    move/from16 v29, v1

    move/from16 v30, v2

    const/4 v0, 0x0

    .end local v1    # "count$iv$iv$iv":I
    .end local v2    # "$i$f$head-H91voCI$ui_release":I
    .restart local v29    # "count$iv$iv$iv":I
    .restart local v30    # "$i$f$head-H91voCI$ui_release":I
    move-object/from16 v1, v17

    :goto_5
    nop

    .line 540
    .end local v17    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v1, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v26

    .line 541
    .local v2, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v2, :cond_6

    .line 542
    if-eqz v1, :cond_5

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 543
    :cond_5
    const/16 v17, 0x0

    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v17, "node$iv$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 541
    .end local v17    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    :cond_6
    move-object/from16 v17, v26

    .line 545
    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "node$iv$iv$iv":Ljava/lang/Object;
    :goto_6
    if-eqz v1, :cond_7

    move-object/from16 v0, v24

    .end local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .end local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_7
    move-object/from16 v0, v24

    .line 548
    .end local v2    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_7
    move-object v2, v1

    move/from16 v1, v29

    goto :goto_8

    .line 529
    .end local v29    # "count$iv$iv$iv":I
    .end local v30    # "$i$f$head-H91voCI$ui_release":I
    .local v0, "node$iv$iv$iv":Ljava/lang/Object;
    .local v1, "count$iv$iv$iv":I
    .local v2, "$i$f$head-H91voCI$ui_release":I
    .local v17, "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_8
    move-object/from16 v26, v0

    move/from16 v30, v2

    move-object/from16 v0, v24

    .end local v2    # "$i$f$head-H91voCI$ui_release":I
    .end local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v30    # "$i$f$head-H91voCI$ui_release":I
    move-object/from16 v2, v17

    move-object/from16 v17, v26

    .line 548
    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv$iv":Ljava/lang/Object;
    .local v17, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_8
    nop

    .line 528
    .end local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v25    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 549
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v23

    move-object/from16 v0, v17

    move-object/from16 v17, v2

    move/from16 v2, v30

    goto :goto_3

    .line 551
    .end local v30    # "$i$f$head-H91voCI$ui_release":I
    .local v0, "node$iv$iv$iv":Ljava/lang/Object;
    .local v2, "$i$f$head-H91voCI$ui_release":I
    .local v17, "stack$iv$iv$iv":Ljava/lang/Object;
    :cond_9
    move-object/from16 v26, v0

    move/from16 v30, v2

    .line 552
    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v2    # "$i$f$head-H91voCI$ui_release":I
    .end local v21    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v22    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v23    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v30    # "$i$f$head-H91voCI$ui_release":I
    const/4 v0, 0x1

    if-ne v1, v0, :cond_a

    .line 554
    move/from16 v1, v19

    move-object/from16 v0, v26

    move/from16 v2, v30

    goto/16 :goto_1

    .line 552
    :cond_a
    move-object/from16 v0, v26

    goto :goto_9

    .line 522
    .end local v1    # "count$iv$iv$iv":I
    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v30    # "$i$f$head-H91voCI$ui_release":I
    .restart local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v2    # "$i$f$head-H91voCI$ui_release":I
    :cond_b
    move/from16 v30, v2

    .line 557
    .end local v2    # "$i$f$head-H91voCI$ui_release":I
    .restart local v30    # "$i$f$head-H91voCI$ui_release":I
    :goto_9
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move/from16 v1, v19

    move/from16 v2, v30

    goto/16 :goto_1

    .line 559
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$head-H91voCI$ui_release":I
    .local v1, "type$iv":I
    .restart local v2    # "$i$f$head-H91voCI$ui_release":I
    :cond_c
    move/from16 v19, v1

    move/from16 v30, v2

    .line 505
    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v1    # "type$iv":I
    .end local v2    # "$i$f$head-H91voCI$ui_release":I
    .end local v15    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v17    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v19    # "type$iv":I
    .restart local v30    # "$i$f$head-H91voCI$ui_release":I
    nop

    .line 515
    .end local v13    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-headToTail$ui_release-NodeChain$headToTail$1$iv$iv":I
    goto :goto_a

    .line 514
    .end local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$head-H91voCI$ui_release":I
    .local v0, "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v1    # "type$iv":I
    .restart local v2    # "$i$f$head-H91voCI$ui_release":I
    :cond_d
    move-object/from16 v18, v0

    move/from16 v19, v1

    move/from16 v30, v2

    .line 560
    .end local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v1    # "type$iv":I
    .end local v2    # "$i$f$head-H91voCI$ui_release":I
    .restart local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v19    # "type$iv":I
    .restart local v30    # "$i$f$head-H91voCI$ui_release":I
    :goto_a
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v0

    and-int/2addr v0, v5

    if-eqz v0, :cond_10

    .line 561
    nop

    .line 513
    .end local v11    # "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v12    # "$i$a$-headToTail$ui_release-NodeChain$headToTail$2$iv$iv$iv":I
    nop

    .line 562
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    move-object/from16 v0, v18

    move/from16 v1, v19

    move/from16 v2, v30

    goto/16 :goto_0

    .line 564
    .end local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$head-H91voCI$ui_release":I
    .restart local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v1    # "type$iv":I
    .restart local v2    # "$i$f$head-H91voCI$ui_release":I
    :cond_e
    move-object/from16 v18, v0

    move/from16 v19, v1

    move/from16 v30, v2

    .line 565
    .end local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v1    # "type$iv":I
    .end local v2    # "$i$f$head-H91voCI$ui_release":I
    .end local v8    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v9    # "$i$f$headToTail$ui_release":I
    .end local v10    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v19    # "type$iv":I
    .restart local v30    # "$i$f$head-H91voCI$ui_release":I
    goto :goto_b

    .line 509
    .end local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$head-H91voCI$ui_release":I
    .restart local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v1    # "type$iv":I
    .restart local v2    # "$i$f$head-H91voCI$ui_release":I
    :cond_f
    move-object/from16 v18, v0

    move/from16 v19, v1

    move/from16 v30, v2

    .line 566
    .end local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v1    # "type$iv":I
    .end local v2    # "$i$f$head-H91voCI$ui_release":I
    .end local v5    # "mask$iv$iv$iv":I
    .end local v6    # "this_$iv$iv$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v7    # "$i$f$headToTail$ui_release":I
    .restart local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v19    # "type$iv":I
    .restart local v30    # "$i$f$head-H91voCI$ui_release":I
    :cond_10
    :goto_b
    nop

    .line 567
    .end local v3    # "this_$iv$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v4    # "$i$f$headToTail-aLcG6gQ$ui_release":I
    const/4 v1, 0x0

    .end local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$head-H91voCI$ui_release":I
    :goto_c
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Landroidx/compose/ui/node/SemanticsModifierNode;

    .line 45
    invoke-interface {v1}, Landroidx/compose/ui/node/SemanticsModifierNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .line 46
    nop

    .line 47
    nop

    .line 48
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->getSemanticsConfiguration()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v1

    if-nez v1, :cond_11

    new-instance v1, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    invoke-direct {v1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;-><init>()V

    .line 44
    :cond_11
    new-instance v2, Landroidx/compose/ui/semantics/SemanticsNode;

    move-object/from16 v3, p0

    move/from16 v4, p1

    invoke-direct {v2, v0, v4, v3, v1}, Landroidx/compose/ui/semantics/SemanticsNode;-><init>(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V

    .line 49
    return-object v2
.end method

.method public static final SemanticsNode(Landroidx/compose/ui/node/SemanticsModifierNode;ZLandroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsNode;
    .locals 3
    .param p0, "outerSemanticsNode"    # Landroidx/compose/ui/node/SemanticsModifierNode;
    .param p1, "mergingEnabled"    # Z
    .param p2, "layoutNode"    # Landroidx/compose/ui/node/LayoutNode;

    .line 69
    new-instance v0, Landroidx/compose/ui/semantics/SemanticsNode;

    .line 70
    invoke-interface {p0}, Landroidx/compose/ui/node/SemanticsModifierNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    .line 71
    nop

    .line 72
    nop

    .line 73
    invoke-virtual {p2}, Landroidx/compose/ui/node/LayoutNode;->getSemanticsConfiguration()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    invoke-direct {v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;-><init>()V

    .line 69
    :cond_0
    invoke-direct {v0, v1, p1, p2, v2}, Landroidx/compose/ui/semantics/SemanticsNode;-><init>(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V

    .line 74
    return-object v0
.end method

.method public static synthetic SemanticsNode$default(Landroidx/compose/ui/node/SemanticsModifierNode;ZLandroidx/compose/ui/node/LayoutNode;ILjava/lang/Object;)Landroidx/compose/ui/semantics/SemanticsNode;
    .locals 0

    .line 51
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    .line 67
    move-object p2, p0

    check-cast p2, Landroidx/compose/ui/node/DelegatableNode;

    invoke-static {p2}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object p2

    .line 51
    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/semantics/SemanticsNodeKt;->SemanticsNode(Landroidx/compose/ui/node/SemanticsModifierNode;ZLandroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsNode;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$contentDescriptionFakeNodeId(Landroidx/compose/ui/semantics/SemanticsNode;)I
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/ui/semantics/SemanticsNode;

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/semantics/SemanticsNodeKt;->contentDescriptionFakeNodeId(Landroidx/compose/ui/semantics/SemanticsNode;)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$getRole(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/ui/semantics/SemanticsNode;

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/semantics/SemanticsNodeKt;->getRole(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$roleFakeNodeId(Landroidx/compose/ui/semantics/SemanticsNode;)I
    .locals 1
    .param p0, "$receiver"    # Landroidx/compose/ui/semantics/SemanticsNode;

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/semantics/SemanticsNodeKt;->roleFakeNodeId(Landroidx/compose/ui/semantics/SemanticsNode;)I

    move-result v0

    return v0
.end method

.method private static final contentDescriptionFakeNodeId(Landroidx/compose/ui/semantics/SemanticsNode;)I
    .locals 2
    .param p0, "$this$contentDescriptionFakeNodeId"    # Landroidx/compose/ui/semantics/SemanticsNode;

    .line 499
    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsNode;->getId()I

    move-result v0

    const v1, 0x77359400

    add-int/2addr v0, v1

    return v0
.end method

.method public static final findClosestParentNode(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;
    .locals 3
    .param p0, "$this$findClosestParentNode"    # Landroidx/compose/ui/node/LayoutNode;
    .param p1, "selector"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/node/LayoutNode;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/node/LayoutNode;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Landroidx/compose/ui/node/LayoutNode;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 484
    .local v0, "$i$f$findClosestParentNode":I
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v1

    .line 485
    .local v1, "currentParent":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    if-eqz v1, :cond_1

    .line 486
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 487
    return-object v1

    .line 489
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v1

    goto :goto_0

    .line 493
    :cond_1
    const/4 v2, 0x0

    return-object v2
.end method

.method public static final getOuterMergingSemantics(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;
    .locals 33
    .param p0, "$this$outerMergingSemantics"    # Landroidx/compose/ui/node/LayoutNode;

    .line 475
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    const/4 v1, 0x0

    .line 568
    .local v1, "$i$f$getSemantics-OLwlOKw":I
    const/16 v2, 0x8

    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    .line 475
    .end local v1    # "$i$f$getSemantics-OLwlOKw":I
    nop

    .local v0, "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .local v1, "type$iv":I
    const/4 v2, 0x0

    .line 569
    .local v2, "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    move-object v3, v0

    .local v3, "this_$iv$iv":Landroidx/compose/ui/node/NodeChain;
    const/4 v4, 0x0

    .line 574
    .local v4, "$i$f$headToTail-aLcG6gQ$ui_release":I
    move v5, v1

    .local v5, "mask$iv$iv$iv":I
    move-object v6, v3

    .local v6, "this_$iv$iv$iv":Landroidx/compose/ui/node/NodeChain;
    const/4 v7, 0x0

    .line 578
    .local v7, "$i$f$headToTail$ui_release":I
    invoke-static {v6}, Landroidx/compose/ui/node/NodeChain;->access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I

    move-result v8

    and-int/2addr v8, v5

    if-eqz v8, :cond_10

    .line 579
    move-object v8, v6

    .local v8, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/NodeChain;
    const/4 v9, 0x0

    .line 580
    .local v9, "$i$f$headToTail$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    .line 581
    .local v10, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_0
    if-eqz v10, :cond_f

    .line 582
    move-object v11, v10

    .local v11, "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v12, 0x0

    .line 583
    .local v12, "$i$a$-headToTail$ui_release-NodeChain$headToTail$2$iv$iv$iv":I
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v13

    and-int/2addr v13, v5

    if-eqz v13, :cond_e

    .line 584
    move-object v13, v11

    .local v13, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 574
    .local v14, "$i$a$-headToTail$ui_release-NodeChain$headToTail$1$iv$iv":I
    move-object v15, v13

    .local v15, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 585
    .local v16, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v17, 0x0

    .line 586
    .local v17, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .local v18, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v15

    move-object/from16 v32, v18

    move-object/from16 v18, v0

    move-object/from16 v0, v32

    .line 587
    .local v0, "node$iv$iv$iv":Ljava/lang/Object;
    .local v18, "this_$iv":Landroidx/compose/ui/node/NodeChain;
    :goto_1
    if-eqz v0, :cond_d

    .line 588
    move/from16 v19, v1

    .end local v1    # "type$iv":I
    .local v19, "type$iv":I
    instance-of v1, v0, Landroidx/compose/ui/node/SemanticsModifierNode;

    if-eqz v1, :cond_1

    .line 589
    move-object v1, v0

    .local v1, "it$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 569
    .local v20, "$i$a$-headToTail-aLcG6gQ$ui_release-NodeChain$firstFromHead$1$iv":I
    move-object/from16 v21, v1

    check-cast v21, Landroidx/compose/ui/node/SemanticsModifierNode;

    .local v21, "it":Landroidx/compose/ui/node/SemanticsModifierNode;
    const/16 v22, 0x0

    .line 475
    .local v22, "$i$a$-firstFromHead-aLcG6gQ$ui_release-SemanticsNodeKt$outerMergingSemantics$1":I
    invoke-interface/range {v21 .. v21}, Landroidx/compose/ui/node/SemanticsModifierNode;->getShouldMergeDescendantSemantics()Z

    move-result v21

    .line 569
    .end local v21    # "it":Landroidx/compose/ui/node/SemanticsModifierNode;
    .end local v22    # "$i$a$-firstFromHead-aLcG6gQ$ui_release-SemanticsNodeKt$outerMergingSemantics$1":I
    if-eqz v21, :cond_0

    goto/16 :goto_c

    .line 589
    .end local v1    # "it$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-headToTail-aLcG6gQ$ui_release-NodeChain$firstFromHead$1$iv":I
    :cond_0
    move/from16 v30, v2

    goto/16 :goto_9

    .line 590
    :cond_1
    move-object v1, v0

    .local v1, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 591
    .local v20, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v21

    and-int v21, v21, v19

    move-object/from16 v22, v1

    .end local v1    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v22, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v21, :cond_2

    const/16 v20, 0x1

    goto :goto_2

    :cond_2
    const/16 v20, 0x0

    .line 590
    .end local v20    # "$i$f$isKind-H91voCI$ui_release":I
    .end local v22    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_2
    if-eqz v20, :cond_c

    instance-of v1, v0, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_c

    .line 592
    const/4 v1, 0x0

    .line 593
    .local v1, "count$iv$iv$iv":I
    move-object/from16 v21, v0

    check-cast v21, Landroidx/compose/ui/node/DelegatingNode;

    .local v21, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v22, 0x0

    .line 594
    .local v22, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v23

    .line 595
    .local v23, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_3
    if-eqz v23, :cond_a

    .line 596
    move-object/from16 v24, v23

    .local v24, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v25, 0x0

    .line 597
    .local v25, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v26, v24

    .local v26, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v27, 0x0

    .line 591
    .local v27, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v28

    and-int v28, v28, v19

    if-eqz v28, :cond_3

    const/16 v26, 0x1

    goto :goto_4

    :cond_3
    const/16 v26, 0x0

    .line 597
    .end local v26    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v27    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_4
    if-eqz v26, :cond_9

    .line 598
    add-int/lit8 v1, v1, 0x1

    .line 599
    move-object/from16 v26, v0

    const/4 v0, 0x1

    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v26, "node$iv$iv$iv":Ljava/lang/Object;
    if-ne v1, v0, :cond_4

    .line 600
    move-object/from16 v0, v24

    move/from16 v30, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v0

    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    goto :goto_8

    .line 604
    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    :cond_4
    if-nez v17, :cond_5

    const/4 v0, 0x0

    .line 605
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 606
    move/from16 v27, v0

    .end local v0    # "$i$f$mutableVectorOf":I
    .local v27, "$i$f$mutableVectorOf":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv":I
    const/16 v28, 0x0

    .line 607
    .local v28, "$i$f$MutableVector":I
    move/from16 v29, v1

    .end local v1    # "count$iv$iv$iv":I
    .local v29, "count$iv$iv$iv":I
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v30, v2

    .end local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .local v30, "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    new-array v2, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v31, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv":I
    .local v31, "capacity$iv$iv$iv$iv$iv":I
    invoke-direct {v1, v2, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 605
    .end local v28    # "$i$f$MutableVector":I
    .end local v31    # "capacity$iv$iv$iv$iv$iv":I
    goto :goto_5

    .line 604
    .end local v27    # "$i$f$mutableVectorOf":I
    .end local v29    # "count$iv$iv$iv":I
    .end local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .restart local v1    # "count$iv$iv$iv":I
    .restart local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :cond_5
    move/from16 v29, v1

    move/from16 v30, v2

    const/4 v0, 0x0

    .end local v1    # "count$iv$iv$iv":I
    .end local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .restart local v29    # "count$iv$iv$iv":I
    .restart local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    move-object/from16 v1, v17

    :goto_5
    nop

    .line 608
    .end local v17    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v1, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v26

    .line 609
    .local v2, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v2, :cond_7

    .line 610
    if-eqz v1, :cond_6

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 611
    :cond_6
    const/16 v17, 0x0

    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v17, "node$iv$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 609
    .end local v17    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    :cond_7
    move-object/from16 v17, v26

    .line 613
    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v17    # "node$iv$iv$iv":Ljava/lang/Object;
    :goto_6
    if-eqz v1, :cond_8

    move-object/from16 v0, v24

    .end local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .end local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_8
    move-object/from16 v0, v24

    .line 616
    .end local v2    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_7
    move-object v2, v1

    move/from16 v1, v29

    goto :goto_8

    .line 597
    .end local v29    # "count$iv$iv$iv":I
    .end local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .local v0, "node$iv$iv$iv":Ljava/lang/Object;
    .local v1, "count$iv$iv$iv":I
    .local v2, "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .local v17, "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_9
    move-object/from16 v26, v0

    move/from16 v30, v2

    move-object/from16 v0, v24

    .end local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .end local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    move-object/from16 v2, v17

    move-object/from16 v17, v26

    .line 616
    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv$iv":Ljava/lang/Object;
    .local v17, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_8
    nop

    .line 596
    .end local v0    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v25    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 617
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v23

    move-object/from16 v0, v17

    move-object/from16 v17, v2

    move/from16 v2, v30

    goto :goto_3

    .line 619
    .end local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .local v0, "node$iv$iv$iv":Ljava/lang/Object;
    .local v2, "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .local v17, "stack$iv$iv$iv":Ljava/lang/Object;
    :cond_a
    move-object/from16 v26, v0

    move/from16 v30, v2

    .line 620
    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .end local v21    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v22    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v23    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    const/4 v0, 0x1

    if-ne v1, v0, :cond_b

    .line 622
    move/from16 v1, v19

    move-object/from16 v0, v26

    move/from16 v2, v30

    goto/16 :goto_1

    .line 620
    :cond_b
    move-object/from16 v0, v26

    goto :goto_9

    .line 590
    .end local v1    # "count$iv$iv$iv":I
    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .restart local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :cond_c
    move/from16 v30, v2

    .line 625
    .end local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .restart local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :goto_9
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move/from16 v1, v19

    move/from16 v2, v30

    goto/16 :goto_1

    .line 627
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .local v1, "type$iv":I
    .restart local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :cond_d
    move/from16 v19, v1

    move/from16 v30, v2

    .line 574
    .end local v0    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v1    # "type$iv":I
    .end local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .end local v15    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v17    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v19    # "type$iv":I
    .restart local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    nop

    .line 584
    .end local v13    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-headToTail$ui_release-NodeChain$headToTail$1$iv$iv":I
    goto :goto_a

    .line 583
    .end local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .local v0, "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v1    # "type$iv":I
    .restart local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :cond_e
    move-object/from16 v18, v0

    move/from16 v19, v1

    move/from16 v30, v2

    .line 628
    .end local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v1    # "type$iv":I
    .end local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .restart local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v19    # "type$iv":I
    .restart local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :goto_a
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v0

    and-int/2addr v0, v5

    if-eqz v0, :cond_11

    .line 629
    nop

    .line 582
    .end local v11    # "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v12    # "$i$a$-headToTail$ui_release-NodeChain$headToTail$2$iv$iv$iv":I
    nop

    .line 630
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    move-object/from16 v0, v18

    move/from16 v1, v19

    move/from16 v2, v30

    goto/16 :goto_0

    .line 632
    .end local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .restart local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v1    # "type$iv":I
    .restart local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :cond_f
    move-object/from16 v18, v0

    move/from16 v19, v1

    move/from16 v30, v2

    .line 633
    .end local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v1    # "type$iv":I
    .end local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .end local v8    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v9    # "$i$f$headToTail$ui_release":I
    .end local v10    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v19    # "type$iv":I
    .restart local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    goto :goto_b

    .line 578
    .end local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .restart local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v1    # "type$iv":I
    .restart local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :cond_10
    move-object/from16 v18, v0

    move/from16 v19, v1

    move/from16 v30, v2

    .line 634
    .end local v0    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v1    # "type$iv":I
    .end local v2    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    .end local v5    # "mask$iv$iv$iv":I
    .end local v6    # "this_$iv$iv$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v7    # "$i$f$headToTail$ui_release":I
    .restart local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .restart local v19    # "type$iv":I
    .restart local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :cond_11
    :goto_b
    nop

    .line 635
    .end local v3    # "this_$iv$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v4    # "$i$f$headToTail-aLcG6gQ$ui_release":I
    const/4 v1, 0x0

    .end local v18    # "this_$iv":Landroidx/compose/ui/node/NodeChain;
    .end local v19    # "type$iv":I
    .end local v30    # "$i$f$firstFromHead-aLcG6gQ$ui_release":I
    :goto_c
    check-cast v1, Landroidx/compose/ui/node/SemanticsModifierNode;

    .line 475
    return-object v1
.end method

.method private static final getRole(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;
    .locals 2
    .param p0, "$this$role"    # Landroidx/compose/ui/semantics/SemanticsNode;

    .line 497
    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsNode;->getUnmergedConfig$ui_release()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    invoke-virtual {v1}, Landroidx/compose/ui/semantics/SemanticsProperties;->getRole()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/ui/semantics/SemanticsConfigurationKt;->getOrNull(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/semantics/Role;

    return-object v0
.end method

.method private static final roleFakeNodeId(Landroidx/compose/ui/semantics/SemanticsNode;)I
    .locals 2
    .param p0, "$this$roleFakeNodeId"    # Landroidx/compose/ui/semantics/SemanticsNode;

    .line 501
    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsNode;->getId()I

    move-result v0

    const v1, 0x3b9aca00

    add-int/2addr v0, v1

    return v0
.end method
