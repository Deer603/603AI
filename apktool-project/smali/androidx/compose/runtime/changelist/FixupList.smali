.class public final Landroidx/compose/runtime/changelist/FixupList;
.super Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;
.source "FixupList.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,90:1\n4643#2,5:91\n4643#2,5:137\n202#3,4:96\n359#3:111\n356#3:112\n207#3,2:115\n202#3,4:117\n359#3:131\n356#3:132\n207#3,2:135\n202#3,4:142\n207#3,2:148\n679#4:100\n682#4:101\n685#4:114\n370#5,9:102\n379#5:113\n370#5,9:122\n379#5:133\n718#6:121\n721#6:134\n532#7:146\n535#7:147\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n49#1:91,5\n70#1:137,5\n57#1:96,4\n59#1:111\n59#1:112\n57#1:115,2\n63#1:117,4\n64#1:131\n64#1:132\n63#1:135,2\n77#1:142,4\n77#1:148,2\n58#1:100\n59#1:101\n60#1:114\n59#1:102,9\n59#1:113\n64#1:122,9\n64#1:133\n64#1:121\n65#1:134\n78#1:146\n79#1:147\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\u000c\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\"\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\u0008\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J>\u0010!\u001a\u00020\u000b\"\u0004\u0008\u0000\u0010\"\"\u0004\u0008\u0001\u0010#2\u0006\u0010$\u001a\u0002H\"2\u001d\u0010%\u001a\u0019\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u00020\u000b0&\u00a2\u0006\u0002\u0008\'\u00a2\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006)"
    }
    d2 = {
        "Landroidx/compose/runtime/changelist/FixupList;",
        "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;",
        "()V",
        "operations",
        "Landroidx/compose/runtime/changelist/Operations;",
        "pendingOperations",
        "size",
        "",
        "getSize",
        "()I",
        "clear",
        "",
        "createAndInsertNode",
        "factory",
        "Lkotlin/Function0;",
        "",
        "insertIndex",
        "groupAnchor",
        "Landroidx/compose/runtime/Anchor;",
        "endNodeInsert",
        "executeAndFlushAllPendingFixups",
        "applier",
        "Landroidx/compose/runtime/Applier;",
        "slots",
        "Landroidx/compose/runtime/SlotWriter;",
        "rememberManager",
        "Landroidx/compose/runtime/RememberManager;",
        "isEmpty",
        "",
        "isNotEmpty",
        "toDebugString",
        "",
        "linePrefix",
        "updateNode",
        "V",
        "T",
        "value",
        "block",
        "Lkotlin/Function2;",
        "Lkotlin/ExtensionFunctionType;",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V",
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
.field private final operations:Landroidx/compose/runtime/changelist/Operations;

.field private final pendingOperations:Landroidx/compose/runtime/changelist/Operations;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/changelist/FixupList;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;-><init>()V

    .line 29
    new-instance v0, Landroidx/compose/runtime/changelist/Operations;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/Operations;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    .line 30
    new-instance v0, Landroidx/compose/runtime/changelist/Operations;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/Operations;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->pendingOperations:Landroidx/compose/runtime/changelist/Operations;

    .line 28
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 40
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->pendingOperations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operations;->clear()V

    .line 41
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operations;->clear()V

    .line 42
    return-void
.end method

.method public final createAndInsertNode(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Anchor;)V
    .locals 22
    .param p1, "factory"    # Lkotlin/jvm/functions/Function0;
    .param p2, "insertIndex"    # I
    .param p3, "groupAnchor"    # Landroidx/compose/runtime/Anchor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/lang/Object;",
            ">;I",
            "Landroidx/compose/runtime/Anchor;",
            ")V"
        }
    .end annotation

    .line 57
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    iget-object v2, v0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    .local v2, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    sget-object v3, Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;

    check-cast v3, Landroidx/compose/runtime/changelist/Operation;

    .local v3, "operation$iv":Landroidx/compose/runtime/changelist/Operation;
    const/4 v4, 0x0

    .line 96
    .local v4, "$i$f$push":I
    nop

    .line 98
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/changelist/Operations;->pushOp(Landroidx/compose/runtime/changelist/Operation;)V

    .line 99
    invoke-static {v2}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->constructor-impl(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;

    move-result-object v5

    .local v5, "$this$createAndInsertNode_u24lambda_u241":Landroidx/compose/runtime/changelist/Operations;
    const/4 v6, 0x0

    .line 58
    .local v6, "$i$a$-push-FixupList$createAndInsertNode$1":I
    sget-object v7, Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;

    .local v7, "this_$iv":Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
    const/4 v8, 0x0

    .line 100
    .local v8, "$i$f$getFactory-HpuvwBQ":I
    const/4 v9, 0x0

    invoke-static {v9}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    move-result v7

    .line 58
    .end local v7    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
    .end local v8    # "$i$f$getFactory-HpuvwBQ":I
    move-object/from16 v8, p1

    invoke-static {v5, v7, v8}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->setObject-DKhxnng(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V

    .line 59
    sget-object v7, Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;

    .restart local v7    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
    const/4 v10, 0x0

    .line 101
    .local v10, "$i$f$getInsertIndex":I
    nop

    .line 59
    .end local v7    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
    .end local v10    # "$i$f$getInsertIndex":I
    move v7, v9

    .local v7, "parameter$iv":I
    const/4 v10, 0x0

    .line 102
    .local v10, "$i$f$setInt-impl":I
    move-object v11, v5

    .local v11, "$this$setInt_impl_u24lambda_u241$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v12, 0x0

    .line 103
    .local v12, "$i$a$-with-Operations$WriteScope$setInt$1$iv":I
    nop

    .line 110
    iget-object v13, v11, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    move-object v14, v11

    .local v14, "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v15, 0x0

    .line 111
    .local v15, "$i$f$topIntIndexOf":I
    move/from16 v16, v9

    iget v9, v14, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    move-object/from16 v17, v14

    .local v17, "this_$iv$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    const/16 v18, 0x0

    .line 112
    .local v18, "$i$f$peekOperation":I
    move/from16 v19, v4

    move-object/from16 v4, v17

    move/from16 v17, v6

    .end local v6    # "$i$a$-push-FixupList$createAndInsertNode$1":I
    .local v4, "this_$iv$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    .local v17, "$i$a$-push-FixupList$createAndInsertNode$1":I
    .local v19, "$i$f$push":I
    iget-object v6, v4, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    move-object/from16 v20, v6

    iget v6, v4, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    const/16 v21, 0x1

    add-int/lit8 v6, v6, -0x1

    aget-object v4, v20, v6

    .line 111
    .end local v4    # "this_$iv$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v18    # "$i$f$peekOperation":I
    invoke-virtual {v4}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v4

    sub-int/2addr v9, v4

    add-int/2addr v9, v7

    .line 110
    .end local v14    # "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v15    # "$i$f$topIntIndexOf":I
    aput p2, v13, v9

    .line 113
    nop

    .line 102
    .end local v11    # "$this$setInt_impl_u24lambda_u241$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v12    # "$i$a$-with-Operations$WriteScope$setInt$1$iv":I
    nop

    .line 113
    nop

    .line 60
    .end local v7    # "parameter$iv":I
    .end local v10    # "$i$f$setInt-impl":I
    sget-object v4, Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;

    .local v4, "this_$iv":Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
    const/4 v6, 0x0

    .line 114
    .local v6, "$i$f$getGroupAnchor-HpuvwBQ":I
    invoke-static/range {v21 .. v21}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    move-result v4

    .line 60
    .end local v4    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;
    .end local v6    # "$i$f$getGroupAnchor-HpuvwBQ":I
    invoke-static {v5, v4, v1}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->setObject-DKhxnng(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V

    .line 61
    nop

    .line 99
    .end local v5    # "$this$createAndInsertNode_u24lambda_u241":Landroidx/compose/runtime/changelist/Operations;
    .end local v17    # "$i$a$-push-FixupList$createAndInsertNode$1":I
    nop

    .line 115
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/changelist/Operations;->ensureAllArgumentsPushedFor(Landroidx/compose/runtime/changelist/Operation;)V

    .line 116
    nop

    .line 63
    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v3    # "operation$iv":Landroidx/compose/runtime/changelist/Operation;
    .end local v19    # "$i$f$push":I
    iget-object v2, v0, Landroidx/compose/runtime/changelist/FixupList;->pendingOperations:Landroidx/compose/runtime/changelist/Operations;

    .restart local v2    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    sget-object v3, Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;

    check-cast v3, Landroidx/compose/runtime/changelist/Operation;

    .restart local v3    # "operation$iv":Landroidx/compose/runtime/changelist/Operation;
    const/4 v4, 0x0

    .line 117
    .local v4, "$i$f$push":I
    nop

    .line 119
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/changelist/Operations;->pushOp(Landroidx/compose/runtime/changelist/Operation;)V

    .line 120
    invoke-static {v2}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->constructor-impl(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;

    move-result-object v5

    .local v5, "$this$createAndInsertNode_u24lambda_u242":Landroidx/compose/runtime/changelist/Operations;
    const/4 v6, 0x0

    .line 64
    .local v6, "$i$a$-push-FixupList$createAndInsertNode$2":I
    sget-object v7, Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;

    .local v7, "this_$iv":Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;
    const/4 v9, 0x0

    .line 121
    .local v9, "$i$f$getInsertIndex":I
    nop

    .line 64
    .end local v7    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;
    .end local v9    # "$i$f$getInsertIndex":I
    move/from16 v7, v16

    .local v7, "parameter$iv":I
    const/4 v9, 0x0

    .line 122
    .local v9, "$i$f$setInt-impl":I
    move-object v10, v5

    .local v10, "$this$setInt_impl_u24lambda_u241$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v11, 0x0

    .line 123
    .local v11, "$i$a$-with-Operations$WriteScope$setInt$1$iv":I
    nop

    .line 130
    iget-object v12, v10, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    move-object v13, v10

    .local v13, "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v14, 0x0

    .line 131
    .local v14, "$i$f$topIntIndexOf":I
    iget v15, v13, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    move-object/from16 v17, v13

    .local v17, "this_$iv$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    const/16 v18, 0x0

    .line 132
    .restart local v18    # "$i$f$peekOperation":I
    move-object/from16 v0, v17

    move/from16 v17, v4

    .end local v4    # "$i$f$push":I
    .local v0, "this_$iv$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    .local v17, "$i$f$push":I
    iget-object v4, v0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    move-object/from16 v19, v4

    iget v4, v0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v4, v4, -0x1

    aget-object v0, v19, v4

    .line 131
    .end local v0    # "this_$iv$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v18    # "$i$f$peekOperation":I
    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v0

    sub-int/2addr v15, v0

    add-int/2addr v15, v7

    .line 130
    .end local v13    # "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v14    # "$i$f$topIntIndexOf":I
    aput p2, v12, v15

    .line 133
    nop

    .line 122
    .end local v10    # "$this$setInt_impl_u24lambda_u241$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v11    # "$i$a$-with-Operations$WriteScope$setInt$1$iv":I
    nop

    .line 133
    nop

    .line 65
    .end local v7    # "parameter$iv":I
    .end local v9    # "$i$f$setInt-impl":I
    sget-object v0, Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;

    .local v0, "this_$iv":Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;
    const/4 v4, 0x0

    .line 134
    .local v4, "$i$f$getGroupAnchor-HpuvwBQ":I
    invoke-static/range {v16 .. v16}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    move-result v0

    .line 65
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;
    .end local v4    # "$i$f$getGroupAnchor-HpuvwBQ":I
    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->setObject-DKhxnng(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V

    .line 66
    nop

    .line 120
    .end local v5    # "$this$createAndInsertNode_u24lambda_u242":Landroidx/compose/runtime/changelist/Operations;
    .end local v6    # "$i$a$-push-FixupList$createAndInsertNode$2":I
    nop

    .line 135
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/changelist/Operations;->ensureAllArgumentsPushedFor(Landroidx/compose/runtime/changelist/Operation;)V

    .line 136
    nop

    .line 67
    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v3    # "operation$iv":Landroidx/compose/runtime/changelist/Operation;
    .end local v17    # "$i$f$push":I
    return-void
.end method

.method public final endNodeInsert()V
    .locals 3

    .line 70
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->pendingOperations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operations;->isNotEmpty()Z

    move-result v0

    .local v0, "value$iv":Z
    const/4 v1, 0x0

    .line 137
    .local v1, "$i$f$runtimeCheck":I
    nop

    .line 138
    if-nez v0, :cond_0

    .line 139
    const/4 v2, 0x0

    .line 71
    .local v2, "$i$a$-runtimeCheck-FixupList$endNodeInsert$1":I
    nop

    .line 139
    .end local v2    # "$i$a$-runtimeCheck-FixupList$endNodeInsert$1":I
    const-string v2, "Cannot end node insertion, there are no pending operations that can be realized."

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 141
    :cond_0
    nop

    .line 73
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$runtimeCheck":I
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->pendingOperations:Landroidx/compose/runtime/changelist/Operations;

    iget-object v1, p0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v0, v1}, Landroidx/compose/runtime/changelist/Operations;->popInto(Landroidx/compose/runtime/changelist/Operations;)V

    .line 74
    return-void
.end method

.method public final executeAndFlushAllPendingFixups(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
    .locals 3
    .param p1, "applier"    # Landroidx/compose/runtime/Applier;
    .param p2, "slots"    # Landroidx/compose/runtime/SlotWriter;
    .param p3, "rememberManager"    # Landroidx/compose/runtime/RememberManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Applier<",
            "*>;",
            "Landroidx/compose/runtime/SlotWriter;",
            "Landroidx/compose/runtime/RememberManager;",
            ")V"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->pendingOperations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operations;->isEmpty()Z

    move-result v0

    .local v0, "value$iv":Z
    const/4 v1, 0x0

    .line 91
    .local v1, "$i$f$runtimeCheck":I
    nop

    .line 92
    if-nez v0, :cond_0

    .line 93
    const/4 v2, 0x0

    .line 50
    .local v2, "$i$a$-runtimeCheck-FixupList$executeAndFlushAllPendingFixups$1":I
    nop

    .line 51
    nop

    .line 93
    .end local v2    # "$i$a$-runtimeCheck-FixupList$executeAndFlushAllPendingFixups$1":I
    const-string v2, "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 95
    :cond_0
    nop

    .line 53
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$runtimeCheck":I
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/runtime/changelist/Operations;->executeAndFlushAllPendingOperations(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V

    .line 54
    return-void
.end method

.method public final getSize()I
    .locals 1

    .line 33
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operations;->getSize()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 35
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operations;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final isNotEmpty()Z
    .locals 1

    .line 37
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operations;->isNotEmpty()Z

    move-result v0

    return v0
.end method

.method public toDebugString(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "linePrefix"    # Ljava/lang/String;

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v1, v0

    .local v1, "$this$toDebugString_u24lambda_u245":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .line 85
    .local v2, "$i$a$-buildString-FixupList$toDebugString$1":I
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "FixupList instance containing "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/compose/runtime/changelist/FixupList;->getSize()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " operations"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ":\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    invoke-virtual {v4, p1}, Landroidx/compose/runtime/changelist/Operations;->toDebugString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    :cond_1
    nop

    .line 84
    .end local v1    # "$this$toDebugString_u24lambda_u245":Ljava/lang/StringBuilder;
    .end local v2    # "$i$a$-buildString-FixupList$toDebugString$1":I
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final updateNode(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    .locals 8
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "block"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(TV;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-TV;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Landroidx/compose/runtime/changelist/FixupList;->operations:Landroidx/compose/runtime/changelist/Operations;

    .local v0, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    sget-object v1, Landroidx/compose/runtime/changelist/Operation$UpdateNode;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$UpdateNode;

    check-cast v1, Landroidx/compose/runtime/changelist/Operation;

    .local v1, "operation$iv":Landroidx/compose/runtime/changelist/Operation;
    const/4 v2, 0x0

    .line 142
    .local v2, "$i$f$push":I
    nop

    .line 144
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/changelist/Operations;->pushOp(Landroidx/compose/runtime/changelist/Operation;)V

    .line 145
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->constructor-impl(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;

    move-result-object v3

    .local v3, "$this$updateNode_u24lambda_u244":Landroidx/compose/runtime/changelist/Operations;
    const/4 v4, 0x0

    .line 78
    .local v4, "$i$a$-push-FixupList$updateNode$1":I
    sget-object v5, Landroidx/compose/runtime/changelist/Operation$UpdateNode;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$UpdateNode;

    .local v5, "this_$iv":Landroidx/compose/runtime/changelist/Operation$UpdateNode;
    const/4 v6, 0x0

    .line 146
    .local v6, "$i$f$getValue-HpuvwBQ":I
    const/4 v7, 0x0

    invoke-static {v7}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    move-result v5

    .line 78
    .end local v5    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$UpdateNode;
    .end local v6    # "$i$f$getValue-HpuvwBQ":I
    invoke-static {v3, v5, p1}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->setObject-DKhxnng(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V

    .line 79
    sget-object v5, Landroidx/compose/runtime/changelist/Operation$UpdateNode;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$UpdateNode;

    .restart local v5    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$UpdateNode;
    const/4 v6, 0x0

    .line 147
    .local v6, "$i$f$getBlock-HpuvwBQ":I
    const/4 v7, 0x1

    invoke-static {v7}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    move-result v5

    .line 79
    .end local v5    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$UpdateNode;
    .end local v6    # "$i$f$getBlock-HpuvwBQ":I
    const-string/jumbo v6, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>"

    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    invoke-static {p2, v6}, Lkotlin/jvm/internal/TypeIntrinsics;->beforeCheckcastToFunctionOfArity(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/jvm/functions/Function2;

    invoke-static {v3, v5, v6}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->setObject-DKhxnng(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V

    .line 80
    nop

    .line 145
    .end local v3    # "$this$updateNode_u24lambda_u244":Landroidx/compose/runtime/changelist/Operations;
    .end local v4    # "$i$a$-push-FixupList$updateNode$1":I
    nop

    .line 148
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/changelist/Operations;->ensureAllArgumentsPushedFor(Landroidx/compose/runtime/changelist/Operation;)V

    .line 149
    nop

    .line 81
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v1    # "operation$iv":Landroidx/compose/runtime/changelist/Operation;
    .end local v2    # "$i$f$push":I
    return-void
.end method
