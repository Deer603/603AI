.class public final Landroidx/compose/runtime/changelist/Operation$TrimParentValues;
.super Landroidx/compose/runtime/changelist/Operation;
.source "Operation.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/changelist/Operation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TrimParentValues"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1057:1\n260#1:1058\n260#1:1059\n1678#2,4:1060\n1683#2:1072\n4341#3,8:1064\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n*L\n264#1:1058\n273#1:1059\n275#1:1060,4\n275#1:1072\n281#1:1064,8\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00082\n\u0010\t\u001a\u00060\u0004j\u0002`\nH\u0016J(\u0010\u000b\u001a\u00020\u000c*\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/runtime/changelist/Operation$TrimParentValues;",
        "Landroidx/compose/runtime/changelist/Operation;",
        "()V",
        "Count",
        "",
        "getCount",
        "()I",
        "intParamName",
        "",
        "parameter",
        "Landroidx/compose/runtime/changelist/IntParameter;",
        "execute",
        "",
        "Landroidx/compose/runtime/changelist/OperationArgContainer;",
        "applier",
        "Landroidx/compose/runtime/Applier;",
        "slots",
        "Landroidx/compose/runtime/SlotWriter;",
        "rememberManager",
        "Landroidx/compose/runtime/RememberManager;",
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

.field public static final INSTANCE:Landroidx/compose/runtime/changelist/Operation$TrimParentValues;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/runtime/changelist/Operation$TrimParentValues;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/Operation$TrimParentValues;-><init>()V

    sput-object v0, Landroidx/compose/runtime/changelist/Operation$TrimParentValues;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$TrimParentValues;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 258
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public execute(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
    .locals 22
    .param p1, "$this$execute"    # Landroidx/compose/runtime/changelist/OperationArgContainer;
    .param p2, "applier"    # Landroidx/compose/runtime/Applier;
    .param p3, "slots"    # Landroidx/compose/runtime/SlotWriter;
    .param p4, "rememberManager"    # Landroidx/compose/runtime/RememberManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/changelist/OperationArgContainer;",
            "Landroidx/compose/runtime/Applier<",
            "*>;",
            "Landroidx/compose/runtime/SlotWriter;",
            "Landroidx/compose/runtime/RememberManager;",
            ")V"
        }
    .end annotation

    .line 273
    move-object/from16 v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/changelist/Operation$TrimParentValues;
    const/4 v1, 0x0

    .line 1059
    .local v1, "$i$f$getCount":I
    nop

    .line 273
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$TrimParentValues;
    .end local v1    # "$i$f$getCount":I
    const/4 v0, 0x0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getInt(I)I

    move-result v0

    .line 274
    .local v0, "count":I
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->getSlotsSize()I

    move-result v2

    .line 275
    .local v2, "slotsSize":I
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/runtime/SlotWriter;->getParent()I

    move-result v3

    .local v3, "groupIndex$iv":I
    move-object/from16 v4, p3

    .local v4, "this_$iv":Landroidx/compose/runtime/SlotWriter;
    const/4 v5, 0x0

    .line 1060
    .local v5, "$i$f$forEachTailSlot":I
    invoke-virtual {v4, v3}, Landroidx/compose/runtime/SlotWriter;->slotsStartIndex$runtime_release(I)I

    move-result v6

    .line 1061
    .local v6, "slotsStart$iv":I
    invoke-virtual {v4, v3}, Landroidx/compose/runtime/SlotWriter;->slotsEndIndex$runtime_release(I)I

    move-result v7

    .line 1062
    .local v7, "slotsEnd$iv":I
    sub-int v8, v7, v0

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    .local v8, "slotIndex$iv":I
    :goto_0
    if-ge v8, v7, :cond_3

    .line 1063
    invoke-static {v4}, Landroidx/compose/runtime/SlotWriter;->access$getSlots$p(Landroidx/compose/runtime/SlotWriter;)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v4, v8}, Landroidx/compose/runtime/SlotWriter;->access$dataIndexToDataAddress(Landroidx/compose/runtime/SlotWriter;I)I

    move-result v10

    aget-object v9, v9, v10

    .local v9, "value":Ljava/lang/Object;
    move v10, v8

    .local v10, "slotIndex":I
    const/4 v11, 0x0

    .line 276
    .local v11, "$i$a$-forEachTailSlot-Operation$TrimParentValues$execute$1":I
    nop

    .line 277
    instance-of v12, v9, Landroidx/compose/runtime/RememberObserverHolder;

    if-eqz v12, :cond_1

    .line 280
    sub-int v12, v2, v10

    .line 281
    .local v12, "endRelativeOrder":I
    move-object v13, v9

    check-cast v13, Landroidx/compose/runtime/RememberObserverHolder;

    invoke-virtual {v13}, Landroidx/compose/runtime/RememberObserverHolder;->getAfter()Landroidx/compose/runtime/Anchor;

    move-result-object v13

    .local v13, "anchor$iv":Landroidx/compose/runtime/Anchor;
    move-object/from16 v14, p3

    .local v14, "$this$withAfterAnchorInfo$iv":Landroidx/compose/runtime/SlotWriter;
    const/4 v15, 0x0

    .line 1064
    .local v15, "$i$f$withAfterAnchorInfo":I
    const/16 v16, -0x1

    .line 1065
    .local v16, "priority$iv":I
    const/16 v17, -0x1

    .line 1066
    .local v17, "endRelativeAfter$iv":I
    if-eqz v13, :cond_0

    invoke-virtual {v13}, Landroidx/compose/runtime/Anchor;->getValid()Z

    move-result v18

    if-eqz v18, :cond_0

    .line 1067
    invoke-virtual {v14, v13}, Landroidx/compose/runtime/SlotWriter;->anchorIndex(Landroidx/compose/runtime/Anchor;)I

    move-result v1

    .line 1068
    .end local v16    # "priority$iv":I
    .local v1, "priority$iv":I
    invoke-virtual {v14}, Landroidx/compose/runtime/SlotWriter;->getSlotsSize()I

    move-result v16

    invoke-virtual {v14, v1}, Landroidx/compose/runtime/SlotWriter;->slotsEndAllIndex$runtime_release(I)I

    move-result v18

    sub-int v17, v16, v18

    move/from16 v16, v1

    .line 1070
    .end local v1    # "priority$iv":I
    .restart local v16    # "priority$iv":I
    :cond_0
    move/from16 v1, v16

    .local v1, "priority":I
    move/from16 v18, v17

    .local v18, "endRelativeAfter":I
    const/16 v19, 0x0

    .line 282
    .local v19, "$i$a$-withAfterAnchorInfo-Operation$TrimParentValues$execute$1$1":I
    nop

    .line 283
    move/from16 v20, v2

    .end local v2    # "slotsSize":I
    .local v20, "slotsSize":I
    move-object v2, v9

    check-cast v2, Landroidx/compose/runtime/RememberObserverHolder;

    .line 284
    nop

    .line 285
    nop

    .line 286
    nop

    .line 282
    move/from16 v21, v18

    move-object/from16 v18, v4

    move/from16 v4, v21

    move/from16 v21, v3

    move-object/from16 v3, p4

    .end local v3    # "groupIndex$iv":I
    .local v4, "endRelativeAfter":I
    .local v18, "this_$iv":Landroidx/compose/runtime/SlotWriter;
    .local v21, "groupIndex$iv":I
    invoke-interface {v3, v2, v12, v1, v4}, Landroidx/compose/runtime/RememberManager;->forgetting(Landroidx/compose/runtime/RememberObserverHolder;III)V

    .line 288
    nop

    .line 1070
    .end local v1    # "priority":I
    .end local v4    # "endRelativeAfter":I
    .end local v19    # "$i$a$-withAfterAnchorInfo-Operation$TrimParentValues$execute$1$1":I
    nop

    .line 1071
    nop

    .end local v12    # "endRelativeOrder":I
    .end local v13    # "anchor$iv":Landroidx/compose/runtime/Anchor;
    .end local v14    # "$this$withAfterAnchorInfo$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v15    # "$i$f$withAfterAnchorInfo":I
    .end local v16    # "priority$iv":I
    .end local v17    # "endRelativeAfter$iv":I
    goto :goto_1

    .line 290
    .end local v18    # "this_$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v20    # "slotsSize":I
    .end local v21    # "groupIndex$iv":I
    .restart local v2    # "slotsSize":I
    .restart local v3    # "groupIndex$iv":I
    .local v4, "this_$iv":Landroidx/compose/runtime/SlotWriter;
    :cond_1
    move/from16 v20, v2

    move/from16 v21, v3

    move-object/from16 v18, v4

    move-object/from16 v3, p4

    .end local v2    # "slotsSize":I
    .end local v3    # "groupIndex$iv":I
    .end local v4    # "this_$iv":Landroidx/compose/runtime/SlotWriter;
    .restart local v18    # "this_$iv":Landroidx/compose/runtime/SlotWriter;
    .restart local v20    # "slotsSize":I
    .restart local v21    # "groupIndex$iv":I
    instance-of v1, v9, Landroidx/compose/runtime/RecomposeScopeImpl;

    if-eqz v1, :cond_2

    move-object v1, v9

    check-cast v1, Landroidx/compose/runtime/RecomposeScopeImpl;

    invoke-virtual {v1}, Landroidx/compose/runtime/RecomposeScopeImpl;->release()V

    .line 292
    :cond_2
    :goto_1
    nop

    .line 1063
    .end local v9    # "value":Ljava/lang/Object;
    .end local v10    # "slotIndex":I
    .end local v11    # "$i$a$-forEachTailSlot-Operation$TrimParentValues$execute$1":I
    nop

    .line 1062
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, p1

    move-object/from16 v4, v18

    move/from16 v2, v20

    move/from16 v3, v21

    goto :goto_0

    .line 1072
    .end local v8    # "slotIndex$iv":I
    .end local v18    # "this_$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v20    # "slotsSize":I
    .end local v21    # "groupIndex$iv":I
    .restart local v2    # "slotsSize":I
    .restart local v3    # "groupIndex$iv":I
    .restart local v4    # "this_$iv":Landroidx/compose/runtime/SlotWriter;
    :cond_3
    nop

    .line 293
    .end local v3    # "groupIndex$iv":I
    .end local v4    # "this_$iv":Landroidx/compose/runtime/SlotWriter;
    .end local v5    # "$i$f$forEachTailSlot":I
    .end local v6    # "slotsStart$iv":I
    .end local v7    # "slotsEnd$iv":I
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroidx/compose/runtime/SlotWriter;->trimTailSlots(I)V

    .line 294
    return-void
.end method

.method public final getCount()I
    .locals 2

    const/4 v0, 0x0

    .line 260
    .local v0, "$i$f$getCount":I
    const/4 v1, 0x0

    return v1
.end method

.method public intParamName(I)Ljava/lang/String;
    .locals 2
    .param p1, "parameter"    # I

    .line 263
    nop

    .line 264
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/changelist/Operation$TrimParentValues;
    const/4 v1, 0x0

    .line 1058
    .local v1, "$i$f$getCount":I
    nop

    .line 264
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$TrimParentValues;
    .end local v1    # "$i$f$getCount":I
    if-nez p1, :cond_0

    const-string v0, "count"

    goto :goto_0

    .line 265
    :cond_0
    invoke-super {p0, p1}, Landroidx/compose/runtime/changelist/Operation;->intParamName(I)Ljava/lang/String;

    move-result-object v0

    .line 266
    :goto_0
    return-object v0
.end method
