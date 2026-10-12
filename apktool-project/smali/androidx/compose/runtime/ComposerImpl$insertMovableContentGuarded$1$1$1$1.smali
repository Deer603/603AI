.class final Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "Composer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/ComposerImpl;->insertMovableContentGuarded(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n+ 2 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4891:1\n173#2,4:4892\n183#2,8:4904\n178#2,3:4915\n3537#3,8:4896\n3546#3,3:4912\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n*L\n3448#1:4892,4\n3450#1:4904,8\n3448#1:4915,3\n3449#1:4896,8\n3449#1:4912,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $offsetChanges:Landroidx/compose/runtime/changelist/ChangeList;

.field final synthetic $reader:Landroidx/compose/runtime/SlotReader;

.field final synthetic $to:Landroidx/compose/runtime/MovableContentStateReference;

.field final synthetic this$0:Landroidx/compose/runtime/ComposerImpl;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/SlotReader;Landroidx/compose/runtime/MovableContentStateReference;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->this$0:Landroidx/compose/runtime/ComposerImpl;

    iput-object p2, p0, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->$offsetChanges:Landroidx/compose/runtime/changelist/ChangeList;

    iput-object p3, p0, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->$reader:Landroidx/compose/runtime/SlotReader;

    iput-object p4, p0, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->$to:Landroidx/compose/runtime/MovableContentStateReference;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 3447
    invoke-virtual {p0}, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 20

    .line 3448
    move-object/from16 v1, p0

    iget-object v0, v1, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->this$0:Landroidx/compose/runtime/ComposerImpl;

    invoke-static {v0}, Landroidx/compose/runtime/ComposerImpl;->access$getChangeListWriter$p(Landroidx/compose/runtime/ComposerImpl;)Landroidx/compose/runtime/changelist/ComposerChangeListWriter;

    move-result-object v2

    .local v2, "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    iget-object v3, v1, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->$offsetChanges:Landroidx/compose/runtime/changelist/ChangeList;

    .local v3, "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    iget-object v0, v1, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->this$0:Landroidx/compose/runtime/ComposerImpl;

    iget-object v4, v1, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->$reader:Landroidx/compose/runtime/SlotReader;

    iget-object v5, v1, Landroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1;->$to:Landroidx/compose/runtime/MovableContentStateReference;

    const/4 v6, 0x0

    .line 4892
    .local v6, "$i$f$withChangeList":I
    invoke-virtual {v2}, Landroidx/compose/runtime/changelist/ComposerChangeListWriter;->getChangeList()Landroidx/compose/runtime/changelist/ChangeList;

    move-result-object v7

    .line 4893
    .local v7, "previousChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    nop

    .line 4894
    :try_start_0
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/changelist/ComposerChangeListWriter;->setChangeList(Landroidx/compose/runtime/changelist/ChangeList;)V

    .line 4895
    const/4 v8, 0x0

    .line 3449
    .local v8, "$i$a$-withChangeList-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1":I
    move-object v9, v0

    .local v9, "this_$iv":Landroidx/compose/runtime/ComposerImpl;
    const/4 v10, 0x0

    .line 4896
    .local v10, "$i$f$withReader":I
    invoke-virtual {v9}, Landroidx/compose/runtime/ComposerImpl;->getReader$runtime_release()Landroidx/compose/runtime/SlotReader;

    move-result-object v11

    .line 4897
    .local v11, "savedReader$iv":Landroidx/compose/runtime/SlotReader;
    invoke-static {v9}, Landroidx/compose/runtime/ComposerImpl;->access$getNodeCountOverrides$p(Landroidx/compose/runtime/ComposerImpl;)[I

    move-result-object v12

    .line 4898
    .local v12, "savedCountOverrides$iv":[I
    invoke-static {v9}, Landroidx/compose/runtime/ComposerImpl;->access$getProviderUpdates$p(Landroidx/compose/runtime/ComposerImpl;)Landroidx/collection/MutableIntObjectMap;

    move-result-object v13

    .line 4899
    .local v13, "savedProviderUpdates$iv":Landroidx/collection/MutableIntObjectMap;
    const/4 v14, 0x0

    invoke-static {v9, v14}, Landroidx/compose/runtime/ComposerImpl;->access$setNodeCountOverrides$p(Landroidx/compose/runtime/ComposerImpl;[I)V

    .line 4900
    invoke-static {v9, v14}, Landroidx/compose/runtime/ComposerImpl;->access$setProviderUpdates$p(Landroidx/compose/runtime/ComposerImpl;Landroidx/collection/MutableIntObjectMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 4901
    nop

    .line 4902
    :try_start_1
    invoke-virtual {v9, v4}, Landroidx/compose/runtime/ComposerImpl;->setReader$runtime_release(Landroidx/compose/runtime/SlotReader;)V

    .line 4903
    const/4 v4, 0x0

    .line 3450
    .local v4, "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    invoke-static {v0}, Landroidx/compose/runtime/ComposerImpl;->access$getChangeListWriter$p(Landroidx/compose/runtime/ComposerImpl;)Landroidx/compose/runtime/changelist/ComposerChangeListWriter;

    move-result-object v14

    .local v14, "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    const/4 v15, 0x0

    .line 4904
    .local v15, "$i$f$withoutImplicitRootStart":I
    invoke-virtual {v14}, Landroidx/compose/runtime/changelist/ComposerChangeListWriter;->getImplicitRootStart()Z

    move-result v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move/from16 v17, v16

    .line 4905
    .local v17, "previousImplicitRootStart$iv":Z
    nop

    .line 4906
    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {v14, v1}, Landroidx/compose/runtime/changelist/ComposerChangeListWriter;->setImplicitRootStart(Z)V

    .line 4907
    const/4 v1, 0x0

    .line 3451
    .local v1, "$i$a$-withoutImplicitRootStart-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1$1":I
    nop

    .line 3452
    move/from16 v16, v1

    .end local v1    # "$i$a$-withoutImplicitRootStart-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1$1":I
    .local v16, "$i$a$-withoutImplicitRootStart-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1$1":I
    invoke-virtual {v5}, Landroidx/compose/runtime/MovableContentStateReference;->getContent$runtime_release()Landroidx/compose/runtime/MovableContent;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 3453
    move-object/from16 v18, v3

    .end local v3    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .local v18, "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    :try_start_3
    invoke-virtual {v5}, Landroidx/compose/runtime/MovableContentStateReference;->getLocals$runtime_release()Landroidx/compose/runtime/PersistentCompositionLocalMap;

    move-result-object v3

    .line 3454
    invoke-virtual {v5}, Landroidx/compose/runtime/MovableContentStateReference;->getParameter$runtime_release()Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 3455
    nop

    .line 3451
    move/from16 v19, v4

    .end local v4    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    .local v19, "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    const/4 v4, 0x1

    :try_start_4
    invoke-static {v0, v1, v3, v5, v4}, Landroidx/compose/runtime/ComposerImpl;->access$invokeMovableContentLambda(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/lang/Object;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 3457
    nop

    .line 4907
    .end local v16    # "$i$a$-withoutImplicitRootStart-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1$1":I
    nop

    .line 4909
    move/from16 v1, v17

    .end local v17    # "previousImplicitRootStart$iv":Z
    .local v1, "previousImplicitRootStart$iv":Z
    :try_start_5
    invoke-virtual {v14, v1}, Landroidx/compose/runtime/changelist/ComposerChangeListWriter;->setImplicitRootStart(Z)V

    .line 4910
    nop

    .line 4911
    nop

    .line 3458
    .end local v1    # "previousImplicitRootStart$iv":Z
    .end local v14    # "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    .end local v15    # "$i$f$withoutImplicitRootStart":I
    nop

    .end local v19    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 4903
    nop

    .line 4912
    :try_start_6
    invoke-virtual {v9, v11}, Landroidx/compose/runtime/ComposerImpl;->setReader$runtime_release(Landroidx/compose/runtime/SlotReader;)V

    .line 4913
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposerImpl;->access$setNodeCountOverrides$p(Landroidx/compose/runtime/ComposerImpl;[I)V

    .line 4914
    invoke-static {v9, v13}, Landroidx/compose/runtime/ComposerImpl;->access$setProviderUpdates$p(Landroidx/compose/runtime/ComposerImpl;Landroidx/collection/MutableIntObjectMap;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 4903
    nop

    .line 3459
    .end local v9    # "this_$iv":Landroidx/compose/runtime/ComposerImpl;
    .end local v10    # "$i$f$withReader":I
    .end local v11    # "savedReader$iv":Landroidx/compose/runtime/SlotReader;
    .end local v12    # "savedCountOverrides$iv":[I
    .end local v13    # "savedProviderUpdates$iv":Landroidx/collection/MutableIntObjectMap;
    nop

    .line 4895
    .end local v8    # "$i$a$-withChangeList-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1":I
    nop

    .line 4915
    invoke-virtual {v2, v7}, Landroidx/compose/runtime/changelist/ComposerChangeListWriter;->setChangeList(Landroidx/compose/runtime/changelist/ChangeList;)V

    .line 4916
    nop

    .line 4917
    nop

    .line 3460
    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    .end local v6    # "$i$f$withChangeList":I
    .end local v7    # "previousChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .end local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    return-void

    .line 4909
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    .restart local v6    # "$i$f$withChangeList":I
    .restart local v7    # "previousChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v8    # "$i$a$-withChangeList-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1":I
    .restart local v9    # "this_$iv":Landroidx/compose/runtime/ComposerImpl;
    .restart local v10    # "$i$f$withReader":I
    .restart local v11    # "savedReader$iv":Landroidx/compose/runtime/SlotReader;
    .restart local v12    # "savedCountOverrides$iv":[I
    .restart local v13    # "savedProviderUpdates$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v14    # "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    .restart local v15    # "$i$f$withoutImplicitRootStart":I
    .restart local v17    # "previousImplicitRootStart$iv":Z
    .restart local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v19    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    :catchall_0
    move-exception v0

    move/from16 v1, v17

    .end local v17    # "previousImplicitRootStart$iv":Z
    .restart local v1    # "previousImplicitRootStart$iv":Z
    goto :goto_0

    .end local v1    # "previousImplicitRootStart$iv":Z
    .end local v19    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    .restart local v4    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    .restart local v17    # "previousImplicitRootStart$iv":Z
    :catchall_1
    move-exception v0

    move/from16 v19, v4

    move/from16 v1, v17

    .end local v4    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    .end local v17    # "previousImplicitRootStart$iv":Z
    .restart local v1    # "previousImplicitRootStart$iv":Z
    .restart local v19    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    goto :goto_0

    .end local v1    # "previousImplicitRootStart$iv":Z
    .end local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .end local v19    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    .restart local v3    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v4    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    .restart local v17    # "previousImplicitRootStart$iv":Z
    :catchall_2
    move-exception v0

    move-object/from16 v18, v3

    move/from16 v19, v4

    move/from16 v1, v17

    .end local v3    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .end local v4    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    .end local v17    # "previousImplicitRootStart$iv":Z
    .restart local v1    # "previousImplicitRootStart$iv":Z
    .restart local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v19    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    :goto_0
    :try_start_7
    invoke-virtual {v14, v1}, Landroidx/compose/runtime/changelist/ComposerChangeListWriter;->setImplicitRootStart(Z)V

    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    .end local v6    # "$i$f$withChangeList":I
    .end local v7    # "previousChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .end local v8    # "$i$a$-withChangeList-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1":I
    .end local v9    # "this_$iv":Landroidx/compose/runtime/ComposerImpl;
    .end local v10    # "$i$f$withReader":I
    .end local v11    # "savedReader$iv":Landroidx/compose/runtime/SlotReader;
    .end local v12    # "savedCountOverrides$iv":[I
    .end local v13    # "savedProviderUpdates$iv":Landroidx/collection/MutableIntObjectMap;
    .end local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 4912
    .end local v1    # "previousImplicitRootStart$iv":Z
    .end local v14    # "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    .end local v15    # "$i$f$withoutImplicitRootStart":I
    .end local v19    # "$i$a$-withReader-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1$1":I
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    .restart local v6    # "$i$f$withChangeList":I
    .restart local v7    # "previousChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v8    # "$i$a$-withChangeList-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1":I
    .restart local v9    # "this_$iv":Landroidx/compose/runtime/ComposerImpl;
    .restart local v10    # "$i$f$withReader":I
    .restart local v11    # "savedReader$iv":Landroidx/compose/runtime/SlotReader;
    .restart local v12    # "savedCountOverrides$iv":[I
    .restart local v13    # "savedProviderUpdates$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    :catchall_3
    move-exception v0

    goto :goto_1

    .end local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v3    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    :catchall_4
    move-exception v0

    move-object/from16 v18, v3

    .end local v3    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    :goto_1
    :try_start_8
    invoke-virtual {v9, v11}, Landroidx/compose/runtime/ComposerImpl;->setReader$runtime_release(Landroidx/compose/runtime/SlotReader;)V

    .line 4913
    invoke-static {v9, v12}, Landroidx/compose/runtime/ComposerImpl;->access$setNodeCountOverrides$p(Landroidx/compose/runtime/ComposerImpl;[I)V

    .line 4914
    invoke-static {v9, v13}, Landroidx/compose/runtime/ComposerImpl;->access$setProviderUpdates$p(Landroidx/compose/runtime/ComposerImpl;Landroidx/collection/MutableIntObjectMap;)V

    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    .end local v6    # "$i$f$withChangeList":I
    .end local v7    # "previousChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .end local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 4915
    .end local v8    # "$i$a$-withChangeList-ComposerImpl$insertMovableContentGuarded$1$1$1$1$1":I
    .end local v9    # "this_$iv":Landroidx/compose/runtime/ComposerImpl;
    .end local v10    # "$i$f$withReader":I
    .end local v11    # "savedReader$iv":Landroidx/compose/runtime/SlotReader;
    .end local v12    # "savedCountOverrides$iv":[I
    .end local v13    # "savedProviderUpdates$iv":Landroidx/collection/MutableIntObjectMap;
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/changelist/ComposerChangeListWriter;
    .restart local v6    # "$i$f$withChangeList":I
    .restart local v7    # "previousChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    :catchall_5
    move-exception v0

    goto :goto_2

    .end local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v3    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    :catchall_6
    move-exception v0

    move-object/from16 v18, v3

    .end local v3    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    .restart local v18    # "newChangeList$iv":Landroidx/compose/runtime/changelist/ChangeList;
    :goto_2
    invoke-virtual {v2, v7}, Landroidx/compose/runtime/changelist/ComposerChangeListWriter;->setChangeList(Landroidx/compose/runtime/changelist/ChangeList;)V

    throw v0
.end method
