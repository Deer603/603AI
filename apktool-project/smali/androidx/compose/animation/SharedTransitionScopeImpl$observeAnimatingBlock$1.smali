.class final Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SharedTransitionScope.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/SharedTransitionScopeImpl;-><init>(Landroidx/compose/ui/layout/LookaheadScope;Lkotlinx/coroutines/CoroutineScope;)V
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
    value = "SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1221:1\n385#2:1222\n357#2,4:1223\n329#2,6:1227\n339#2,3:1234\n342#2,9:1238\n361#2:1247\n386#2:1248\n1399#3:1233\n1270#3:1237\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1\n*L\n879#1:1222\n879#1:1223,4\n879#1:1227,6\n879#1:1234,3\n879#1:1238,9\n879#1:1247\n879#1:1248\n879#1:1233\n879#1:1237\n*E\n"
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
.field final synthetic this$0:Landroidx/compose/animation/SharedTransitionScopeImpl;


# direct methods
.method constructor <init>(Landroidx/compose/animation/SharedTransitionScopeImpl;)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;->this$0:Landroidx/compose/animation/SharedTransitionScopeImpl;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 878
    invoke-virtual {p0}, Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 24

    .line 879
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1;->this$0:Landroidx/compose/animation/SharedTransitionScopeImpl;

    invoke-static {v1}, Landroidx/compose/animation/SharedTransitionScopeImpl;->access$getSharedElements$p(Landroidx/compose/animation/SharedTransitionScopeImpl;)Landroidx/collection/MutableScatterMap;

    move-result-object v1

    check-cast v1, Landroidx/collection/ScatterMap;

    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v2, 0x0

    .line 1222
    .local v2, "$i$f$any":I
    move-object v3, v1

    .local v3, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v4, 0x0

    .line 1223
    .local v4, "$i$f$forEach":I
    iget-object v5, v3, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 1224
    .local v5, "k$iv$iv":[Ljava/lang/Object;
    iget-object v6, v3, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 1226
    .local v6, "v$iv$iv":[Ljava/lang/Object;
    move-object v7, v3

    .local v7, "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v8, 0x0

    .line 1227
    .local v8, "$i$f$forEachIndexed":I
    iget-object v9, v7, Landroidx/collection/ScatterMap;->metadata:[J

    .line 1228
    .local v9, "m$iv$iv$iv":[J
    array-length v10, v9

    add-int/lit8 v10, v10, -0x2

    .line 1230
    .local v10, "lastIndex$iv$iv$iv":I
    const/4 v11, 0x0

    .local v11, "i$iv$iv$iv":I
    if-gt v11, v10, :cond_4

    .line 1231
    :goto_0
    aget-wide v12, v9, v11

    .line 1232
    .local v12, "slot$iv$iv$iv":J
    move-wide v14, v12

    .local v14, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1233
    .local v16, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v17, v1

    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v17, "this_$iv":Landroidx/collection/ScatterMap;
    not-long v0, v14

    const/16 v18, 0x7

    shl-long v0, v0, v18

    and-long/2addr v0, v14

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v0, v18

    .line 1232
    .end local v14    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v16    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v18

    if-eqz v0, :cond_3

    .line 1234
    sub-int v0, v11, v10

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 1235
    .local v0, "bitCount$iv$iv$iv":I
    const/4 v14, 0x0

    .local v14, "j$iv$iv$iv":I
    :goto_1
    if-ge v14, v0, :cond_2

    .line 1236
    const-wide/16 v15, 0xff

    and-long/2addr v15, v12

    .local v15, "value$iv$iv$iv$iv":J
    const/16 v18, 0x0

    .line 1237
    .local v18, "$i$f$isFull":I
    const-wide/16 v19, 0x80

    cmp-long v19, v15, v19

    if-gez v19, :cond_0

    const/16 v19, 0x1

    goto :goto_2

    :cond_0
    const/16 v19, 0x0

    .line 1236
    .end local v15    # "value$iv$iv$iv$iv":J
    .end local v18    # "$i$f$isFull":I
    :goto_2
    if-eqz v19, :cond_1

    .line 1238
    shl-int/lit8 v15, v11, 0x3

    add-int/2addr v15, v14

    .line 1239
    .local v15, "index$iv$iv$iv":I
    move/from16 v16, v15

    .local v16, "index$iv$iv":I
    const/16 v18, 0x0

    .line 1226
    .local v18, "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv$iv":I
    aget-object v19, v5, v16

    .local v19, "key$iv":Ljava/lang/Object;
    aget-object v20, v6, v16

    .local v20, "value$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 1222
    .local v21, "$i$a$-forEach-ScatterMap$any$1$iv":I
    move-object/from16 v22, v20

    check-cast v22, Landroidx/compose/animation/SharedElement;

    .local v22, "element":Landroidx/compose/animation/SharedElement;
    const/16 v23, 0x0

    .line 879
    .local v23, "$i$a$-any-SharedTransitionScopeImpl$observeAnimatingBlock$1$1":I
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/animation/SharedElement;->isAnimating()Z

    move-result v22

    .line 1222
    .end local v22    # "element":Landroidx/compose/animation/SharedElement;
    .end local v23    # "$i$a$-any-SharedTransitionScopeImpl$observeAnimatingBlock$1$1":I
    if-nez v22, :cond_7

    .line 1226
    .end local v19    # "key$iv":Ljava/lang/Object;
    .end local v20    # "value$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-forEach-ScatterMap$any$1$iv":I
    nop

    .line 1239
    .end local v16    # "index$iv$iv":I
    .end local v18    # "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv$iv":I
    nop

    .line 1241
    .end local v15    # "index$iv$iv$iv":I
    :cond_1
    shr-long/2addr v12, v1

    .line 1235
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 1243
    .end local v14    # "j$iv$iv$iv":I
    :cond_2
    if-ne v0, v1, :cond_6

    .line 1230
    .end local v0    # "bitCount$iv$iv$iv":I
    .end local v12    # "slot$iv$iv$iv":J
    :cond_3
    if-eq v11, v10, :cond_5

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    goto :goto_0

    .end local v17    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    :cond_4
    move-object/from16 v17, v1

    .line 1246
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v11    # "i$iv$iv$iv":I
    .restart local v17    # "this_$iv":Landroidx/collection/ScatterMap;
    :cond_5
    nop

    .line 1247
    .end local v7    # "this_$iv$iv$iv":Landroidx/collection/ScatterMap;
    .end local v8    # "$i$f$forEachIndexed":I
    .end local v9    # "m$iv$iv$iv":[J
    .end local v10    # "lastIndex$iv$iv$iv":I
    :cond_6
    nop

    .line 1248
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v4    # "$i$f$forEach":I
    .end local v5    # "k$iv$iv":[Ljava/lang/Object;
    .end local v6    # "v$iv$iv":[Ljava/lang/Object;
    nop

    .line 880
    .end local v2    # "$i$f$any":I
    .end local v17    # "this_$iv":Landroidx/collection/ScatterMap;
    :cond_7
    return-void
.end method
