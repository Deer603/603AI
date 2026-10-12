.class final Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "RecomposeScopeImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/RecomposeScopeImpl;->end(I)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/runtime/Composition;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,494:1\n775#2:495\n777#2,4:509\n781#2:519\n367#3,6:496\n377#3,3:503\n380#3,2:507\n383#3,6:513\n1399#4:502\n1270#4:506\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n453#1:495\n453#1:509,4\n453#1:519\n453#1:496,6\n453#1:503,3\n453#1:507,2\n453#1:513,6\n453#1:502\n453#1:506\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "composition",
        "Landroidx/compose/runtime/Composition;",
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
.field final synthetic $instances:Landroidx/collection/MutableObjectIntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectIntMap<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $token:I

.field final synthetic this$0:Landroidx/compose/runtime/RecomposeScopeImpl;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/RecomposeScopeImpl;ILandroidx/collection/MutableObjectIntMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/RecomposeScopeImpl;",
            "I",
            "Landroidx/collection/MutableObjectIntMap<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->this$0:Landroidx/compose/runtime/RecomposeScopeImpl;

    iput p2, p0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$token:I

    iput-object p3, p0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$instances:Landroidx/collection/MutableObjectIntMap;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 447
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/Composition;

    invoke-virtual {p0, v0}, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->invoke(Landroidx/compose/runtime/Composition;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composition;)V
    .locals 23
    .param p1, "composition"    # Landroidx/compose/runtime/Composition;

    .line 448
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 449
    iget-object v2, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->this$0:Landroidx/compose/runtime/RecomposeScopeImpl;

    invoke-static {v2}, Landroidx/compose/runtime/RecomposeScopeImpl;->access$getCurrentToken$p(Landroidx/compose/runtime/RecomposeScopeImpl;)I

    move-result v2

    iget v3, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$token:I

    if-ne v2, v3, :cond_c

    .line 450
    iget-object v2, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$instances:Landroidx/collection/MutableObjectIntMap;

    iget-object v3, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->this$0:Landroidx/compose/runtime/RecomposeScopeImpl;

    invoke-static {v3}, Landroidx/compose/runtime/RecomposeScopeImpl;->access$getTrackedInstances$p(Landroidx/compose/runtime/RecomposeScopeImpl;)Landroidx/collection/MutableObjectIntMap;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 451
    instance-of v2, v1, Landroidx/compose/runtime/CompositionImpl;

    if-eqz v2, :cond_c

    .line 453
    iget-object v2, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$instances:Landroidx/collection/MutableObjectIntMap;

    .local v2, "this_$iv":Landroidx/collection/MutableObjectIntMap;
    iget v3, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->$token:I

    iget-object v4, v0, Landroidx/compose/runtime/RecomposeScopeImpl$end$1$2;->this$0:Landroidx/compose/runtime/RecomposeScopeImpl;

    const/4 v5, 0x0

    .line 495
    .local v5, "$i$f$removeIf":I
    move-object v6, v2

    check-cast v6, Landroidx/collection/ObjectIntMap;

    .local v6, "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    const/4 v7, 0x0

    .line 496
    .local v7, "$i$f$forEachIndexed":I
    iget-object v8, v6, Landroidx/collection/ObjectIntMap;->metadata:[J

    .line 497
    .local v8, "m$iv$iv":[J
    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    .line 499
    .local v9, "lastIndex$iv$iv":I
    const/4 v10, 0x0

    .local v10, "i$iv$iv":I
    if-gt v10, v9, :cond_9

    .line 500
    :goto_0
    aget-wide v11, v8, v10

    .line 501
    .local v11, "slot$iv$iv":J
    move-wide v13, v11

    .local v13, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v15, 0x0

    .line 502
    .local v15, "$i$f$maskEmptyOrDeleted":I
    not-long v0, v13

    const/16 v16, 0x7

    shl-long v0, v0, v16

    and-long/2addr v0, v13

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v0, v16

    .line 501
    .end local v13    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v15    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v16

    if-eqz v0, :cond_8

    .line 503
    sub-int v0, v10, v9

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 504
    .local v0, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v0, :cond_7

    .line 505
    const-wide/16 v14, 0xff

    and-long/2addr v14, v11

    .local v14, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 506
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v14, v17

    const/16 v18, 0x0

    const/16 v19, 0x1

    if-gez v17, :cond_0

    move/from16 v14, v19

    goto :goto_2

    :cond_0
    move/from16 v14, v18

    .line 505
    .end local v14    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v14, :cond_6

    .line 507
    shl-int/lit8 v14, v10, 0x3

    add-int/2addr v14, v13

    .line 508
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v16, 0x0

    .line 509
    .local v16, "$i$a$-forEachIndexed-MutableObjectIntMap$removeIf$1$iv":I
    move/from16 v17, v1

    iget-object v1, v2, Landroidx/collection/MutableObjectIntMap;->keys:[Ljava/lang/Object;

    aget-object v1, v1, v15

    move/from16 v20, v5

    .end local v5    # "$i$f$removeIf":I
    .local v1, "instance":Ljava/lang/Object;
    .local v20, "$i$f$removeIf":I
    iget-object v5, v2, Landroidx/collection/MutableObjectIntMap;->values:[I

    aget v5, v5, v15

    .local v5, "instanceToken":I
    const/16 v21, 0x0

    .line 454
    .local v21, "$i$a$-removeIf-RecomposeScopeImpl$end$1$2$1":I
    if-eq v5, v3, :cond_1

    move/from16 v18, v19

    .line 455
    .local v18, "shouldRemove":Z
    :cond_1
    if-eqz v18, :cond_3

    .line 456
    move/from16 v19, v3

    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/runtime/CompositionImpl;

    invoke-virtual {v3, v1, v4}, Landroidx/compose/runtime/CompositionImpl;->removeObservation$runtime_release(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V

    .line 457
    instance-of v3, v1, Landroidx/compose/runtime/DerivedState;

    if-eqz v3, :cond_2

    .line 458
    move-object/from16 v3, p1

    check-cast v3, Landroidx/compose/runtime/CompositionImpl;

    move-object/from16 v22, v4

    move-object v4, v1

    check-cast v4, Landroidx/compose/runtime/DerivedState;

    invoke-virtual {v3, v4}, Landroidx/compose/runtime/CompositionImpl;->removeDerivedStateObservation$runtime_release(Landroidx/compose/runtime/DerivedState;)V

    .line 459
    invoke-static/range {v22 .. v22}, Landroidx/compose/runtime/RecomposeScopeImpl;->access$getTrackedDependencies$p(Landroidx/compose/runtime/RecomposeScopeImpl;)Landroidx/collection/MutableScatterMap;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3, v1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 457
    :cond_2
    move-object/from16 v22, v4

    goto :goto_3

    .line 455
    :cond_3
    move/from16 v19, v3

    move-object/from16 v22, v4

    .line 462
    :cond_4
    :goto_3
    nop

    .line 509
    .end local v1    # "instance":Ljava/lang/Object;
    .end local v5    # "instanceToken":I
    .end local v18    # "shouldRemove":Z
    .end local v21    # "$i$a$-removeIf-RecomposeScopeImpl$end$1$2$1":I
    if-eqz v18, :cond_5

    .line 510
    invoke-virtual {v2, v15}, Landroidx/collection/MutableObjectIntMap;->removeValueAt(I)V

    .line 512
    :cond_5
    nop

    .line 508
    .end local v15    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndexed-MutableObjectIntMap$removeIf$1$iv":I
    goto :goto_4

    .line 505
    .end local v14    # "index$iv$iv":I
    .end local v20    # "$i$f$removeIf":I
    .local v5, "$i$f$removeIf":I
    :cond_6
    move/from16 v17, v1

    move/from16 v19, v3

    move-object/from16 v22, v4

    move/from16 v20, v5

    .line 513
    .end local v5    # "$i$f$removeIf":I
    .restart local v20    # "$i$f$removeIf":I
    :goto_4
    shr-long v11, v11, v17

    .line 504
    add-int/lit8 v13, v13, 0x1

    move/from16 v1, v17

    move/from16 v3, v19

    move/from16 v5, v20

    move-object/from16 v4, v22

    goto :goto_1

    .end local v20    # "$i$f$removeIf":I
    .restart local v5    # "$i$f$removeIf":I
    :cond_7
    move/from16 v17, v1

    move/from16 v19, v3

    move-object/from16 v22, v4

    move/from16 v20, v5

    .line 515
    .end local v5    # "$i$f$removeIf":I
    .end local v13    # "j$iv$iv":I
    .restart local v20    # "$i$f$removeIf":I
    if-ne v0, v1, :cond_b

    goto :goto_5

    .line 501
    .end local v0    # "bitCount$iv$iv":I
    .end local v20    # "$i$f$removeIf":I
    .restart local v5    # "$i$f$removeIf":I
    :cond_8
    move/from16 v19, v3

    move-object/from16 v22, v4

    move/from16 v20, v5

    .line 499
    .end local v5    # "$i$f$removeIf":I
    .end local v11    # "slot$iv$iv":J
    .restart local v20    # "$i$f$removeIf":I
    :goto_5
    if-eq v10, v9, :cond_a

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v3, v19

    move/from16 v5, v20

    move-object/from16 v4, v22

    goto/16 :goto_0

    .end local v20    # "$i$f$removeIf":I
    .restart local v5    # "$i$f$removeIf":I
    :cond_9
    move/from16 v20, v5

    .line 518
    .end local v5    # "$i$f$removeIf":I
    .end local v10    # "i$iv$iv":I
    .restart local v20    # "$i$f$removeIf":I
    :cond_a
    nop

    .line 519
    .end local v6    # "this_$iv$iv":Landroidx/collection/ObjectIntMap;
    .end local v7    # "$i$f$forEachIndexed":I
    .end local v8    # "m$iv$iv":[J
    .end local v9    # "lastIndex$iv$iv":I
    :cond_b
    nop

    .line 465
    .end local v2    # "this_$iv":Landroidx/collection/MutableObjectIntMap;
    .end local v20    # "$i$f$removeIf":I
    :cond_c
    return-void
.end method
