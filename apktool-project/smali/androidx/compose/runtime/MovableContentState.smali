.class public final Landroidx/compose/runtime/MovableContentState;
.super Ljava/lang/Object;
.source "Composer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n+ 2 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4891:1\n29#2,8:4892\n37#2:4906\n287#3,6:4900\n287#3,6:4913\n919#4,2:4907\n174#5,4:4909\n179#5,3:4920\n1#6:4919\n4643#7,5:4923\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n*L\n422#1:4892,8\n422#1:4906\n422#1:4900,6\n445#1:4913,6\n422#1:4907,2\n426#1:4909,4\n426#1:4920,3\n426#1:4919\n442#1:4923,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J3\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u00082\n\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\rH\u0000\u00a2\u0006\u0002\u0008\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/runtime/MovableContentState;",
        "",
        "slotTable",
        "Landroidx/compose/runtime/SlotTable;",
        "(Landroidx/compose/runtime/SlotTable;)V",
        "getSlotTable$runtime_release",
        "()Landroidx/compose/runtime/SlotTable;",
        "extractNestedStates",
        "Landroidx/collection/ScatterMap;",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "applier",
        "Landroidx/compose/runtime/Applier;",
        "references",
        "Landroidx/collection/ObjectList;",
        "extractNestedStates$runtime_release",
        "runtime_release"
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
.field private final slotTable:Landroidx/compose/runtime/SlotTable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/MovableContentState;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/SlotTable;)V
    .locals 0
    .param p1, "slotTable"    # Landroidx/compose/runtime/SlotTable;

    .line 409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 410
    iput-object p1, p0, Landroidx/compose/runtime/MovableContentState;->slotTable:Landroidx/compose/runtime/SlotTable;

    return-void
.end method

.method private static final extractNestedStates$lambda$3$closeToGroupContaining(Landroidx/compose/runtime/SlotWriter;I)V
    .locals 1
    .param p0, "$writer"    # Landroidx/compose/runtime/SlotWriter;
    .param p1, "group"    # I

    .line 428
    nop

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getParent()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroupEnd()I

    move-result v0

    if-gt v0, p1, :cond_0

    .line 429
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->skipToGroupEnd()V

    .line 430
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->endGroup()I

    goto :goto_0

    .line 432
    :cond_0
    return-void
.end method

.method private static final extractNestedStates$lambda$3$openParent(Landroidx/compose/runtime/SlotWriter;I)V
    .locals 3
    .param p0, "$writer"    # Landroidx/compose/runtime/SlotWriter;
    .param p1, "parent"    # I

    .line 434
    invoke-static {p0, p1}, Landroidx/compose/runtime/MovableContentState;->extractNestedStates$lambda$3$closeToGroupContaining(Landroidx/compose/runtime/SlotWriter;I)V

    .line 435
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    move-result v0

    if-eq v0, p1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->isGroupEnd()Z

    move-result v0

    if-nez v0, :cond_1

    .line 436
    invoke-static {p0}, Landroidx/compose/runtime/ComposerKt;->access$getNextGroup(Landroidx/compose/runtime/SlotWriter;)I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 437
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->startGroup()V

    goto :goto_0

    .line 439
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->skipGroup()I

    goto :goto_0

    .line 442
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    move-result v0

    if-ne v0, p1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .local v0, "value$iv":Z
    :goto_1
    const/4 v1, 0x0

    .line 4923
    .local v1, "$i$f$runtimeCheck":I
    nop

    .line 4924
    if-nez v0, :cond_3

    .line 4925
    const/4 v2, 0x0

    .line 442
    .local v2, "$i$a$-runtimeCheck-MovableContentState$extractNestedStates$1$openParent$1":I
    nop

    .line 4925
    .end local v2    # "$i$a$-runtimeCheck-MovableContentState$extractNestedStates$1$openParent$1":I
    const-string v2, "Unexpected slot table structure"

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 4927
    :cond_3
    nop

    .line 443
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$runtimeCheck":I
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->startGroup()V

    .line 444
    return-void
.end method


# virtual methods
.method public final extractNestedStates$runtime_release(Landroidx/compose/runtime/Applier;Landroidx/collection/ObjectList;)Landroidx/collection/ScatterMap;
    .locals 20
    .param p1, "applier"    # Landroidx/compose/runtime/Applier;
    .param p2, "references"    # Landroidx/collection/ObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Applier<",
            "*>;",
            "Landroidx/collection/ObjectList<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            ">;)",
            "Landroidx/collection/ScatterMap<",
            "Landroidx/compose/runtime/MovableContentStateReference;",
            "Landroidx/compose/runtime/MovableContentState;",
            ">;"
        }
    .end annotation

    .line 421
    move-object/from16 v1, p0

    .line 422
    move-object/from16 v0, p2

    .local v0, "$this$fastFilter$iv":Landroidx/collection/ObjectList;
    const/4 v2, 0x0

    .line 4892
    .local v2, "$i$f$fastFilter":I
    move-object v3, v0

    .local v3, "$this$all$iv$iv":Landroidx/collection/ObjectList;
    const/4 v4, 0x0

    .line 4899
    .local v4, "$i$f$all":I
    move-object v5, v3

    .local v5, "this_$iv$iv$iv":Landroidx/collection/ObjectList;
    const/4 v6, 0x0

    .line 4900
    .local v6, "$i$f$forEach":I
    nop

    .line 4901
    iget-object v7, v5, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 4902
    .local v7, "content$iv$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .local v8, "i$iv$iv$iv":I
    iget v9, v5, Landroidx/collection/ObjectList;->_size:I

    :goto_0
    if-ge v8, v9, :cond_1

    .line 4903
    aget-object v12, v7, v8

    .local v12, "it$iv$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 4899
    .local v13, "$i$a$-forEach-ExtensionsKt$all$1$iv$iv":I
    move-object v14, v12

    check-cast v14, Landroidx/compose/runtime/MovableContentStateReference;

    .local v14, "it":Landroidx/compose/runtime/MovableContentStateReference;
    const/4 v15, 0x0

    .line 422
    .local v15, "$i$a$-fastFilter-MovableContentState$extractNestedStates$referencesToExtract$1":I
    iget-object v10, v1, Landroidx/compose/runtime/MovableContentState;->slotTable:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v14}, Landroidx/compose/runtime/MovableContentStateReference;->getAnchor$runtime_release()Landroidx/compose/runtime/Anchor;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroidx/compose/runtime/SlotTable;->ownsAnchor(Landroidx/compose/runtime/Anchor;)Z

    move-result v10

    .line 4899
    .end local v14    # "it":Landroidx/compose/runtime/MovableContentStateReference;
    .end local v15    # "$i$a$-fastFilter-MovableContentState$extractNestedStates$referencesToExtract$1":I
    if-nez v10, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    .line 4903
    .end local v12    # "it$iv$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-forEach-ExtensionsKt$all$1$iv$iv":I
    :cond_0
    nop

    .line 4902
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 4905
    .end local v8    # "i$iv$iv$iv":I
    :cond_1
    nop

    .line 4906
    .end local v5    # "this_$iv$iv$iv":Landroidx/collection/ObjectList;
    .end local v6    # "$i$f$forEach":I
    .end local v7    # "content$iv$iv$iv":[Ljava/lang/Object;
    const/4 v3, 0x1

    .line 4892
    .end local v3    # "$this$all$iv$iv":Landroidx/collection/ObjectList;
    .end local v4    # "$i$f$all":I
    :goto_1
    if-eqz v3, :cond_2

    goto :goto_3

    .line 4893
    :cond_2
    new-instance v3, Landroidx/collection/MutableObjectList;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct {v3, v5, v6, v4}, Landroidx/collection/MutableObjectList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4894
    .local v3, "target$iv":Landroidx/collection/MutableObjectList;
    move-object v4, v0

    .local v4, "this_$iv$iv":Landroidx/collection/ObjectList;
    const/4 v5, 0x0

    .line 4900
    .local v5, "$i$f$forEach":I
    nop

    .line 4901
    iget-object v6, v4, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 4902
    .local v6, "content$iv$iv":[Ljava/lang/Object;
    const/4 v7, 0x0

    .local v7, "i$iv$iv":I
    iget v8, v4, Landroidx/collection/ObjectList;->_size:I

    :goto_2
    if-ge v7, v8, :cond_4

    .line 4903
    aget-object v9, v6, v7

    .local v9, "it$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 4894
    .local v10, "$i$a$-forEach-ExtensionsKt$fastFilter$1$iv":I
    move-object v11, v9

    check-cast v11, Landroidx/compose/runtime/MovableContentStateReference;

    .local v11, "it":Landroidx/compose/runtime/MovableContentStateReference;
    const/4 v12, 0x0

    .line 422
    .local v12, "$i$a$-fastFilter-MovableContentState$extractNestedStates$referencesToExtract$1":I
    iget-object v13, v1, Landroidx/compose/runtime/MovableContentState;->slotTable:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v11}, Landroidx/compose/runtime/MovableContentStateReference;->getAnchor$runtime_release()Landroidx/compose/runtime/Anchor;

    move-result-object v14

    invoke-virtual {v13, v14}, Landroidx/compose/runtime/SlotTable;->ownsAnchor(Landroidx/compose/runtime/Anchor;)Z

    move-result v11

    .line 4894
    .end local v11    # "it":Landroidx/compose/runtime/MovableContentStateReference;
    .end local v12    # "$i$a$-fastFilter-MovableContentState$extractNestedStates$referencesToExtract$1":I
    if-eqz v11, :cond_3

    move-object v11, v3

    .local v11, "this_$iv$iv":Landroidx/collection/MutableObjectList;
    const/4 v12, 0x0

    .line 4907
    .local v12, "$i$f$plusAssign":I
    invoke-virtual {v11, v9}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 4908
    nop

    .line 4894
    .end local v11    # "this_$iv$iv":Landroidx/collection/MutableObjectList;
    .end local v12    # "$i$f$plusAssign":I
    :cond_3
    nop

    .line 4903
    .end local v9    # "it$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-forEach-ExtensionsKt$fastFilter$1$iv":I
    nop

    .line 4902
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 4905
    .end local v7    # "i$iv$iv":I
    :cond_4
    nop

    .line 4895
    .end local v4    # "this_$iv$iv":Landroidx/collection/ObjectList;
    .end local v5    # "$i$f$forEach":I
    .end local v6    # "content$iv$iv":[Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Landroidx/collection/ObjectList;

    move-object v0, v4

    .line 423
    .end local v0    # "$this$fastFilter$iv":Landroidx/collection/ObjectList;
    .end local v2    # "$i$f$fastFilter":I
    .end local v3    # "target$iv":Landroidx/collection/MutableObjectList;
    :goto_3
    new-instance v2, Landroidx/compose/runtime/MovableContentState$extractNestedStates$referencesToExtract$2;

    invoke-direct {v2, v1}, Landroidx/compose/runtime/MovableContentState$extractNestedStates$referencesToExtract$2;-><init>(Landroidx/compose/runtime/MovableContentState;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Landroidx/compose/runtime/collection/ExtensionsKt;->sortedBy(Landroidx/collection/ObjectList;Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectList;

    move-result-object v0

    .line 420
    move-object v2, v0

    .line 424
    .local v2, "referencesToExtract":Landroidx/collection/ObjectList;
    invoke-virtual {v2}, Landroidx/collection/ObjectList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/collection/ScatterMapKt;->emptyScatterMap()Landroidx/collection/ScatterMap;

    move-result-object v0

    return-object v0

    .line 425
    :cond_5
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object v3

    .line 426
    .local v3, "result":Landroidx/collection/MutableScatterMap;
    iget-object v4, v1, Landroidx/compose/runtime/MovableContentState;->slotTable:Landroidx/compose/runtime/SlotTable;

    .local v4, "this_$iv":Landroidx/compose/runtime/SlotTable;
    const/4 v5, 0x0

    .line 4909
    .local v5, "$i$f$write":I
    invoke-virtual {v4}, Landroidx/compose/runtime/SlotTable;->openWriter()Landroidx/compose/runtime/SlotWriter;

    move-result-object v6

    .local v6, "writer$iv":Landroidx/compose/runtime/SlotWriter;
    const/4 v7, 0x0

    .line 4910
    .local v7, "$i$a$-let-SlotTable$write$1$iv":I
    const/4 v8, 0x0

    .line 4911
    .local v8, "normalClose$iv":Z
    nop

    .line 4912
    move-object v0, v6

    .local v0, "writer":Landroidx/compose/runtime/SlotWriter;
    const/4 v9, 0x0

    .line 445
    .local v9, "$i$a$-write-MovableContentState$extractNestedStates$1":I
    move-object v10, v2

    .local v10, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v11, 0x0

    .line 4913
    .local v11, "$i$f$forEach":I
    nop

    .line 4914
    :try_start_0
    iget-object v12, v10, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 4915
    .local v12, "content$iv":[Ljava/lang/Object;
    const/4 v13, 0x0

    .local v13, "i$iv":I
    iget v14, v10, Landroidx/collection/ObjectList;->_size:I

    :goto_4
    if-ge v13, v14, :cond_6

    .line 4916
    aget-object v15, v12, v13

    check-cast v15, Landroidx/compose/runtime/MovableContentStateReference;

    .local v15, "reference":Landroidx/compose/runtime/MovableContentStateReference;
    const/16 v16, 0x0

    .line 446
    .local v16, "$i$a$-forEach-MovableContentState$extractNestedStates$1$1":I
    invoke-virtual {v15}, Landroidx/compose/runtime/MovableContentStateReference;->getAnchor$runtime_release()Landroidx/compose/runtime/Anchor;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/SlotWriter;->anchorIndex(Landroidx/compose/runtime/Anchor;)I

    move-result v1

    .line 447
    .local v1, "newGroup":I
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/SlotWriter;->parent(I)I

    move-result v17

    move/from16 v18, v17

    .line 448
    .local v18, "newParent":I
    move/from16 v17, v1

    move/from16 v1, v18

    .end local v18    # "newParent":I
    .local v1, "newParent":I
    .local v17, "newGroup":I
    invoke-static {v0, v1}, Landroidx/compose/runtime/MovableContentState;->extractNestedStates$lambda$3$closeToGroupContaining(Landroidx/compose/runtime/SlotWriter;I)V

    .line 449
    invoke-static {v0, v1}, Landroidx/compose/runtime/MovableContentState;->extractNestedStates$lambda$3$openParent(Landroidx/compose/runtime/SlotWriter;I)V

    .line 450
    invoke-virtual {v0}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    move-result v18

    move/from16 v19, v1

    .end local v1    # "newParent":I
    .local v19, "newParent":I
    sub-int v1, v17, v18

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/SlotWriter;->advanceBy(I)V

    .line 453
    invoke-virtual {v15}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 454
    nop

    .line 455
    nop

    .line 456
    nop

    .line 452
    move-object/from16 v18, v2

    move-object/from16 v2, p1

    .end local v2    # "referencesToExtract":Landroidx/collection/ObjectList;
    .local v18, "referencesToExtract":Landroidx/collection/ObjectList;
    :try_start_1
    invoke-static {v1, v15, v0, v2}, Landroidx/compose/runtime/ComposerKt;->extractMovableContentAtCurrent(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;)Landroidx/compose/runtime/MovableContentState;

    move-result-object v1

    .line 451
    nop

    .line 458
    .local v1, "content":Landroidx/compose/runtime/MovableContentState;
    invoke-virtual {v3, v15, v1}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 459
    nop

    .line 4916
    .end local v1    # "content":Landroidx/compose/runtime/MovableContentState;
    .end local v15    # "reference":Landroidx/compose/runtime/MovableContentStateReference;
    .end local v16    # "$i$a$-forEach-MovableContentState$extractNestedStates$1$1":I
    .end local v17    # "newGroup":I
    .end local v19    # "newParent":I
    nop

    .line 4915
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, v18

    goto :goto_4

    .end local v18    # "referencesToExtract":Landroidx/collection/ObjectList;
    .restart local v2    # "referencesToExtract":Landroidx/collection/ObjectList;
    :cond_6
    move-object/from16 v18, v2

    move-object/from16 v2, p1

    .line 4918
    .end local v2    # "referencesToExtract":Landroidx/collection/ObjectList;
    .end local v13    # "i$iv":I
    .restart local v18    # "referencesToExtract":Landroidx/collection/ObjectList;
    nop

    .line 460
    .end local v10    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v11    # "$i$f$forEach":I
    .end local v12    # "content$iv":[Ljava/lang/Object;
    const v1, 0x7fffffff

    invoke-static {v0, v1}, Landroidx/compose/runtime/MovableContentState;->extractNestedStates$lambda$3$closeToGroupContaining(Landroidx/compose/runtime/SlotWriter;I)V

    .line 461
    nop

    .end local v0    # "writer":Landroidx/compose/runtime/SlotWriter;
    .end local v9    # "$i$a$-write-MovableContentState$extractNestedStates$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4912
    nop

    .line 4919
    .local v0, "it$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 4912
    .local v1, "$i$a$-also-SlotTable$write$1$1$iv":I
    const/4 v0, 0x1

    .line 4920
    .end local v1    # "$i$a$-also-SlotTable$write$1$1$iv":I
    .end local v8    # "normalClose$iv":Z
    .local v0, "normalClose$iv":Z
    invoke-virtual {v6, v0}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    .line 4921
    nop

    .line 4909
    .end local v0    # "normalClose$iv":Z
    .end local v6    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v7    # "$i$a$-let-SlotTable$write$1$iv":I
    nop

    .line 4922
    nop

    .line 462
    .end local v4    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .end local v5    # "$i$f$write":I
    move-object v0, v3

    check-cast v0, Landroidx/collection/ScatterMap;

    return-object v0

    .line 4920
    .restart local v4    # "this_$iv":Landroidx/compose/runtime/SlotTable;
    .restart local v5    # "$i$f$write":I
    .restart local v6    # "writer$iv":Landroidx/compose/runtime/SlotWriter;
    .restart local v7    # "$i$a$-let-SlotTable$write$1$iv":I
    .restart local v8    # "normalClose$iv":Z
    :catchall_0
    move-exception v0

    goto :goto_5

    .end local v18    # "referencesToExtract":Landroidx/collection/ObjectList;
    .restart local v2    # "referencesToExtract":Landroidx/collection/ObjectList;
    :catchall_1
    move-exception v0

    move-object/from16 v18, v2

    move-object/from16 v2, p1

    .end local v2    # "referencesToExtract":Landroidx/collection/ObjectList;
    .restart local v18    # "referencesToExtract":Landroidx/collection/ObjectList;
    :goto_5
    invoke-virtual {v6, v8}, Landroidx/compose/runtime/SlotWriter;->close(Z)V

    throw v0
.end method

.method public final getSlotTable$runtime_release()Landroidx/compose/runtime/SlotTable;
    .locals 1

    .line 410
    iget-object v0, p0, Landroidx/compose/runtime/MovableContentState;->slotTable:Landroidx/compose/runtime/SlotTable;

    return-object v0
.end method
