.class public final Landroidx/compose/runtime/collection/ScopeMap;
.super Ljava/lang/Object;
.source "ScopeMap.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Scope:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,176:1\n67#1,6:217\n75#1,4:248\n694#2,15:177\n842#2:252\n844#2:266\n845#2,3:294\n848#2:303\n842#2:304\n844#2,4:318\n848#2:328\n231#3,3:192\n200#3,7:195\n211#3,3:203\n214#3,9:207\n234#3:216\n231#3,3:223\n200#3,7:226\n211#3,3:234\n214#3,9:238\n234#3:247\n200#3,7:269\n211#3,3:277\n214#3,2:281\n217#3,6:287\n1399#4:202\n1270#4:206\n1399#4:233\n1270#4:237\n1399#4:259\n1270#4:263\n1399#4:276\n1270#4:280\n1399#4:311\n1270#4:315\n1399#4:339\n1270#4:343\n329#5,6:253\n339#5,3:260\n342#5,2:264\n345#5,6:297\n329#5,6:305\n339#5,3:312\n342#5,2:316\n345#5,6:322\n357#5,4:329\n329#5,6:333\n339#5,3:340\n342#5,9:344\n361#5:353\n809#6,2:267\n812#6,4:283\n816#6:293\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n81#1:217,6\n81#1:248,4\n36#1:177,15\n123#1:252\n123#1:266\n123#1:294,3\n123#1:303\n142#1:304\n142#1:318,4\n142#1:328\n72#1:192,3\n72#1:195,7\n72#1:203,3\n72#1:207,9\n72#1:216\n81#1:223,3\n81#1:226,7\n81#1:234,3\n81#1:238,9\n81#1:247\n127#1:269,7\n127#1:277,3\n127#1:281,2\n127#1:287,6\n72#1:202\n72#1:206\n81#1:233\n81#1:237\n123#1:259\n123#1:263\n127#1:276\n127#1:280\n142#1:311\n142#1:315\n162#1:339\n162#1:343\n123#1:253,6\n123#1:260,3\n123#1:264,2\n123#1:297,6\n142#1:305,6\n142#1:312,3\n142#1:316,2\n142#1:322,6\n162#1:329,4\n162#1:333,6\n162#1:340,3\n162#1:344,9\n162#1:353\n127#1:267,2\n127#1:283,4\n127#1:293\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0008\u001f\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0081@\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001d\u0012\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J;\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00028\u00002!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u0011\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\u0008\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u001e0\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\r\u0010!\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010(\u001a\u00020\u00152\u0008\u0010)\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010\'J;\u0010+\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u0011\u0012\u0004\u0012\u00020\u000f0\u0017H\u0086\u0008\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\rJ\u001d\u00100\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001\u00a2\u0006\u0004\u00081\u00102J\u0015\u00103\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001\u00a2\u0006\u0004\u00084\u00105J5\u00106\u001a\u00020\u000f2#\u0008\u0004\u00107\u001a\u001d\u0012\u0013\u0012\u00118\u0001\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u0011\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\u0008\u00a2\u0006\u0004\u00088\u00109J\u001d\u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010;\u001a\u00028\u0001\u00a2\u0006\u0004\u0008<\u0010\u0013J\u0010\u0010=\u001a\u00020>H\u00d6\u0001\u00a2\u0006\u0004\u0008?\u0010@R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u0088\u0001\u0004\u00a8\u0006A"
    }
    d2 = {
        "Landroidx/compose/runtime/collection/ScopeMap;",
        "Key",
        "",
        "Scope",
        "map",
        "Landroidx/collection/MutableScatterMap;",
        "constructor-impl",
        "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;",
        "getMap",
        "()Landroidx/collection/MutableScatterMap;",
        "size",
        "",
        "getSize-impl",
        "(Landroidx/collection/MutableScatterMap;)I",
        "add",
        "",
        "key",
        "scope",
        "add-impl",
        "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V",
        "anyScopeOf",
        "",
        "block",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "anyScopeOf-impl",
        "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z",
        "asMap",
        "",
        "",
        "asMap-impl",
        "(Landroidx/collection/MutableScatterMap;)Ljava/util/Map;",
        "clear",
        "clear-impl",
        "(Landroidx/collection/MutableScatterMap;)V",
        "contains",
        "element",
        "contains-impl",
        "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z",
        "equals",
        "other",
        "equals-impl",
        "forEachScopeOf",
        "forEachScopeOf-impl",
        "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V",
        "hashCode",
        "hashCode-impl",
        "remove",
        "remove-impl",
        "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z",
        "removeScope",
        "removeScope-impl",
        "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V",
        "removeScopeIf",
        "predicate",
        "removeScopeIf-impl",
        "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function1;)V",
        "set",
        "value",
        "set-impl",
        "toString",
        "",
        "toString-impl",
        "(Landroidx/collection/MutableScatterMap;)Ljava/lang/String;",
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

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# instance fields
.field private final map:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private synthetic constructor <init>(Landroidx/collection/MutableScatterMap;)V
    .locals 0
    .param p1, "map"    # Landroidx/collection/MutableScatterMap;

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/collection/ScopeMap;->map:Landroidx/collection/MutableScatterMap;

    return-void
.end method

.method public static final add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 10
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "scope"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;TKey;TScope;)V"
        }
    .end annotation

    .line 36
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v1, 0x0

    .line 177
    .local v1, "$i$f$compute":I
    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->findInsertIndex(Ljava/lang/Object;)I

    move-result v2

    .line 178
    .local v2, "index$iv":I
    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gez v2, :cond_0

    move v5, v3

    goto :goto_0

    :cond_0
    move v5, v4

    .line 181
    .local v5, "inserting$iv":Z
    :goto_0
    const/4 v6, 0x0

    if-eqz v5, :cond_1

    move-object v7, v6

    goto :goto_1

    :cond_1
    iget-object v7, v0, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v7, v7, v2

    .local v7, "value":Ljava/lang/Object;
    :goto_1
    const/4 v8, 0x0

    .line 37
    .local v8, "$i$a$-compute-ScopeMap$add$1":I
    nop

    .line 38
    if-nez v7, :cond_2

    move-object v9, p2

    goto :goto_3

    .line 39
    :cond_2
    instance-of v9, v7, Landroidx/collection/MutableScatterSet;

    if-eqz v9, :cond_3

    .line 40
    const-string/jumbo v3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v7

    check-cast v3, Landroidx/collection/MutableScatterSet;

    invoke-virtual {v3, p2}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 41
    goto :goto_2

    .line 44
    :cond_3
    if-eq v7, p2, :cond_4

    .line 45
    new-instance v9, Landroidx/collection/MutableScatterSet;

    invoke-direct {v9, v4, v3, v6}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    .local v9, "set":Landroidx/collection/MutableScatterSet;
    const-string/jumbo v3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 47
    invoke-virtual {v9, p2}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 48
    nop

    .end local v9    # "set":Landroidx/collection/MutableScatterSet;
    goto :goto_3

    .line 50
    :cond_4
    nop

    .line 53
    :goto_2
    move-object v9, v7

    :goto_3
    nop

    .line 181
    .end local v7    # "value":Ljava/lang/Object;
    .end local v8    # "$i$a$-compute-ScopeMap$add$1":I
    nop

    .line 184
    .local v9, "computedValue$iv":Ljava/lang/Object;
    if-eqz v5, :cond_5

    .line 185
    not-int v3, v2

    .line 186
    .local v3, "insertionIndex$iv":I
    iget-object v4, v0, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aput-object p1, v4, v3

    .line 187
    iget-object v4, v0, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aput-object v9, v4, v3

    .end local v3    # "insertionIndex$iv":I
    goto :goto_4

    .line 189
    :cond_5
    iget-object v3, v0, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aput-object v9, v3, v2

    .line 191
    :goto_4
    nop

    .line 55
    .end local v0    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v1    # "$i$f$compute":I
    .end local v2    # "index$iv":I
    .end local v5    # "inserting$iv":Z
    .end local v9    # "computedValue$iv":Ljava/lang/Object;
    return-void
.end method

.method public static final anyScopeOf-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z
    .locals 25
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;TKey;",
            "Lkotlin/jvm/functions/Function1<",
            "-TScope;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v0, p2

    const/4 v1, 0x0

    .line 81
    .local v1, "$i$f$anyScopeOf-impl":I
    const/4 v2, 0x0

    .line 217
    .local v2, "$i$f$forEachScopeOf-impl":I
    invoke-virtual/range {p0 .. p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 218
    .local v3, "value$iv":Ljava/lang/Object;
    if-eqz v3, :cond_a

    .line 221
    instance-of v5, v3, Landroidx/collection/MutableScatterSet;

    if-eqz v5, :cond_8

    .line 222
    move-object v5, v3

    check-cast v5, Landroidx/collection/MutableScatterSet;

    check-cast v5, Landroidx/collection/ScatterSet;

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v7, 0x0

    .line 223
    .local v7, "$i$f$forEach":I
    nop

    .line 224
    iget-object v8, v5, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 225
    .local v8, "elements$iv$iv":[Ljava/lang/Object;
    move-object v9, v5

    .local v9, "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v10, 0x0

    .line 226
    .local v10, "$i$f$forEachIndex":I
    nop

    .line 227
    iget-object v11, v9, Landroidx/collection/ScatterSet;->metadata:[J

    .line 228
    .local v11, "m$iv$iv$iv":[J
    array-length v12, v11

    add-int/lit8 v12, v12, -0x2

    .line 230
    .local v12, "lastIndex$iv$iv$iv":I
    const/4 v13, 0x0

    .local v13, "i$iv$iv$iv":I
    if-gt v13, v12, :cond_5

    .line 231
    :goto_0
    aget-wide v14, v11, v13

    .line 232
    .local v14, "slot$iv$iv$iv":J
    move-wide/from16 v16, v14

    .local v16, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    const/16 v18, 0x0

    .line 233
    .local v18, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v20, v5

    move-wide/from16 v4, v16

    const/16 v16, 0x1

    const/16 v19, 0x0

    move/from16 v17, v7

    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v7    # "$i$f$forEach":I
    .end local v16    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v4, "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .local v17, "$i$f$forEach":I
    .local v20, "this_$iv$iv":Landroidx/collection/ScatterSet;
    not-long v6, v4

    const/16 v21, 0x7

    shl-long v6, v6, v21

    and-long/2addr v6, v4

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v4, v6, v21

    .line 232
    .end local v4    # "$this$maskEmptyOrDeleted$iv$iv$iv$iv":J
    .end local v18    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v4, v4, v21

    if-eqz v4, :cond_4

    .line 234
    sub-int v4, v13, v12

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    const/16 v5, 0x8

    rsub-int/lit8 v4, v4, 0x8

    .line 235
    .local v4, "bitCount$iv$iv$iv":I
    const/4 v6, 0x0

    .local v6, "j$iv$iv$iv":I
    :goto_1
    if-ge v6, v4, :cond_3

    .line 236
    const-wide/16 v21, 0xff

    and-long v21, v14, v21

    .local v21, "value$iv$iv$iv$iv":J
    const/4 v7, 0x0

    .line 237
    .local v7, "$i$f$isFull":I
    const-wide/16 v23, 0x80

    cmp-long v18, v21, v23

    if-gez v18, :cond_0

    move/from16 v7, v16

    goto :goto_2

    :cond_0
    move/from16 v7, v19

    .line 236
    .end local v7    # "$i$f$isFull":I
    .end local v21    # "value$iv$iv$iv$iv":J
    :goto_2
    if-eqz v7, :cond_2

    .line 238
    shl-int/lit8 v7, v13, 0x3

    add-int/2addr v7, v6

    .line 239
    .local v7, "index$iv$iv$iv":I
    move/from16 v18, v7

    .local v18, "index$iv$iv":I
    const/16 v21, 0x0

    .line 225
    .local v21, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    move/from16 v22, v5

    aget-object v5, v8, v18

    .local v5, "it":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 81
    .local v23, "$i$a$-forEachScopeOf-impl-ScopeMap$anyScopeOf$1":I
    invoke-interface {v0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Ljava/lang/Boolean;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v24

    if-eqz v24, :cond_1

    return v16

    .line 225
    .end local v5    # "it":Ljava/lang/Object;
    .end local v23    # "$i$a$-forEachScopeOf-impl-ScopeMap$anyScopeOf$1":I
    :cond_1
    nop

    .line 239
    .end local v18    # "index$iv$iv":I
    .end local v21    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv":I
    goto :goto_3

    .line 236
    .end local v7    # "index$iv$iv$iv":I
    :cond_2
    move/from16 v22, v5

    .line 241
    :goto_3
    shr-long v14, v14, v22

    .line 235
    add-int/lit8 v6, v6, 0x1

    move/from16 v5, v22

    goto :goto_1

    :cond_3
    move/from16 v22, v5

    .line 243
    .end local v6    # "j$iv$iv$iv":I
    if-ne v4, v5, :cond_7

    .line 230
    .end local v4    # "bitCount$iv$iv$iv":I
    .end local v14    # "slot$iv$iv$iv":J
    :cond_4
    if-eq v13, v12, :cond_6

    add-int/lit8 v13, v13, 0x1

    move/from16 v7, v17

    move-object/from16 v5, v20

    goto :goto_0

    .end local v17    # "$i$f$forEach":I
    .end local v20    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v7, "$i$f$forEach":I
    :cond_5
    move-object/from16 v20, v5

    move/from16 v17, v7

    const/16 v19, 0x0

    .line 246
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v7    # "$i$f$forEach":I
    .end local v13    # "i$iv$iv$iv":I
    .restart local v17    # "$i$f$forEach":I
    .restart local v20    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    :cond_6
    nop

    .line 247
    .end local v9    # "this_$iv$iv$iv":Landroidx/collection/ScatterSet;
    .end local v10    # "$i$f$forEachIndex":I
    .end local v11    # "m$iv$iv$iv":[J
    .end local v12    # "lastIndex$iv$iv$iv":I
    :cond_7
    nop

    .end local v8    # "elements$iv$iv":[Ljava/lang/Object;
    .end local v17    # "$i$f$forEach":I
    .end local v20    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    goto :goto_4

    .line 248
    :cond_8
    const/16 v16, 0x1

    const/16 v19, 0x0

    move-object v4, v3

    .local v4, "it":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 81
    .local v5, "$i$a$-forEachScopeOf-impl-ScopeMap$anyScopeOf$1":I
    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_9

    return v16

    .line 248
    .end local v4    # "it":Ljava/lang/Object;
    .end local v5    # "$i$a$-forEachScopeOf-impl-ScopeMap$anyScopeOf$1":I
    :cond_9
    goto :goto_4

    .line 218
    :cond_a
    const/16 v19, 0x0

    .line 251
    .end local v3    # "value$iv":Ljava/lang/Object;
    :goto_4
    nop

    .line 82
    .end local v2    # "$i$f$forEachScopeOf-impl":I
    return v19
.end method

.method public static final asMap-impl(Landroidx/collection/MutableScatterMap;)Ljava/util/Map;
    .locals 23
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "TKey;",
            "Ljava/util/Set<",
            "TScope;>;>;"
        }
    .end annotation

    .line 161
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 162
    .local v0, "result":Ljava/util/HashMap;
    move-object/from16 v1, p0

    check-cast v1, Landroidx/collection/ScatterMap;

    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v2, 0x0

    .line 329
    .local v2, "$i$f$forEach":I
    iget-object v3, v1, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 330
    .local v3, "k$iv":[Ljava/lang/Object;
    iget-object v4, v1, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 332
    .local v4, "v$iv":[Ljava/lang/Object;
    move-object v5, v1

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v6, 0x0

    .line 333
    .local v6, "$i$f$forEachIndexed":I
    iget-object v7, v5, Landroidx/collection/ScatterMap;->metadata:[J

    .line 334
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 336
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_5

    .line 337
    :goto_0
    aget-wide v10, v7, v9

    .line 338
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v14, 0x0

    .line 339
    .local v14, "$i$f$maskEmptyOrDeleted":I
    move-object v15, v0

    move-object/from16 v16, v1

    .end local v0    # "result":Ljava/util/HashMap;
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .local v15, "result":Ljava/util/HashMap;
    .local v16, "this_$iv":Landroidx/collection/ScatterMap;
    not-long v0, v12

    const/16 v17, 0x7

    shl-long v0, v0, v17

    and-long/2addr v0, v12

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v0, v0, v17

    .line 338
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v17

    if-eqz v0, :cond_4

    .line 340
    sub-int v0, v9, v8

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 341
    .local v0, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v0, :cond_3

    .line 342
    const-wide/16 v13, 0xff

    and-long/2addr v13, v10

    .local v13, "value$iv$iv$iv":J
    const/16 v17, 0x0

    .line 343
    .local v17, "$i$f$isFull":I
    const-wide/16 v18, 0x80

    cmp-long v18, v13, v18

    if-gez v18, :cond_0

    const/16 v18, 0x1

    goto :goto_2

    :cond_0
    const/16 v18, 0x0

    .line 342
    .end local v13    # "value$iv$iv$iv":J
    .end local v17    # "$i$f$isFull":I
    :goto_2
    if-eqz v18, :cond_2

    .line 344
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 345
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/16 v17, 0x0

    .line 332
    .local v17, "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    move/from16 v18, v1

    aget-object v1, v3, v14

    move/from16 v19, v2

    .end local v2    # "$i$f$forEach":I
    .local v1, "key":Ljava/lang/Object;
    .local v19, "$i$f$forEach":I
    aget-object v2, v4, v14

    .local v2, "value":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 164
    .local v20, "$i$a$-forEach-ScopeMap$asMap$1":I
    move-object/from16 v21, v3

    .end local v3    # "k$iv":[Ljava/lang/Object;
    .local v21, "k$iv":[Ljava/lang/Object;
    move-object v3, v15

    check-cast v3, Ljava/util/Map;

    move-object/from16 v22, v4

    .end local v4    # "v$iv":[Ljava/lang/Object;
    .local v22, "v$iv":[Ljava/lang/Object;
    const-string/jumbo v4, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    nop

    .line 166
    instance-of v4, v2, Landroidx/collection/MutableScatterSet;

    if-eqz v4, :cond_1

    .line 167
    const-string/jumbo v4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v2

    check-cast v4, Landroidx/collection/MutableScatterSet;

    .line 168
    .local v4, "set":Landroidx/collection/MutableScatterSet;
    invoke-virtual {v4}, Landroidx/collection/MutableScatterSet;->asSet()Ljava/util/Set;

    move-result-object v4

    .end local v4    # "set":Landroidx/collection/MutableScatterSet;
    goto :goto_3

    .line 170
    :cond_1
    const-string/jumbo v4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/SetsKt;->mutableSetOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    .line 164
    :goto_3
    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    nop

    .line 332
    .end local v1    # "key":Ljava/lang/Object;
    .end local v2    # "value":Ljava/lang/Object;
    .end local v20    # "$i$a$-forEach-ScopeMap$asMap$1":I
    nop

    .line 345
    .end local v14    # "index$iv":I
    .end local v17    # "$i$a$-forEachIndexed-ScatterMap$forEach$1$iv":I
    goto :goto_4

    .line 342
    .end local v13    # "index$iv$iv":I
    .end local v19    # "$i$f$forEach":I
    .end local v21    # "k$iv":[Ljava/lang/Object;
    .end local v22    # "v$iv":[Ljava/lang/Object;
    .local v2, "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    .local v4, "v$iv":[Ljava/lang/Object;
    :cond_2
    move/from16 v18, v1

    move/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    .line 347
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .restart local v19    # "$i$f$forEach":I
    .restart local v21    # "k$iv":[Ljava/lang/Object;
    .restart local v22    # "v$iv":[Ljava/lang/Object;
    :goto_4
    shr-long v10, v10, v18

    .line 341
    add-int/lit8 v12, v12, 0x1

    move/from16 v1, v18

    move/from16 v2, v19

    move-object/from16 v3, v21

    move-object/from16 v4, v22

    goto :goto_1

    .end local v19    # "$i$f$forEach":I
    .end local v21    # "k$iv":[Ljava/lang/Object;
    .end local v22    # "v$iv":[Ljava/lang/Object;
    .restart local v2    # "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    .restart local v4    # "v$iv":[Ljava/lang/Object;
    :cond_3
    move/from16 v18, v1

    move/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    .line 349
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v12    # "j$iv$iv":I
    .restart local v19    # "$i$f$forEach":I
    .restart local v21    # "k$iv":[Ljava/lang/Object;
    .restart local v22    # "v$iv":[Ljava/lang/Object;
    if-ne v0, v1, :cond_7

    goto :goto_5

    .line 338
    .end local v0    # "bitCount$iv$iv":I
    .end local v19    # "$i$f$forEach":I
    .end local v21    # "k$iv":[Ljava/lang/Object;
    .end local v22    # "v$iv":[Ljava/lang/Object;
    .restart local v2    # "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    .restart local v4    # "v$iv":[Ljava/lang/Object;
    :cond_4
    move/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    .line 336
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v10    # "slot$iv$iv":J
    .restart local v19    # "$i$f$forEach":I
    .restart local v21    # "k$iv":[Ljava/lang/Object;
    .restart local v22    # "v$iv":[Ljava/lang/Object;
    :goto_5
    if-eq v9, v8, :cond_6

    add-int/lit8 v9, v9, 0x1

    move-object v0, v15

    move-object/from16 v1, v16

    move/from16 v2, v19

    move-object/from16 v3, v21

    move-object/from16 v4, v22

    goto/16 :goto_0

    .end local v15    # "result":Ljava/util/HashMap;
    .end local v16    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v19    # "$i$f$forEach":I
    .end local v21    # "k$iv":[Ljava/lang/Object;
    .end local v22    # "v$iv":[Ljava/lang/Object;
    .local v0, "result":Ljava/util/HashMap;
    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v2    # "$i$f$forEach":I
    .restart local v3    # "k$iv":[Ljava/lang/Object;
    .restart local v4    # "v$iv":[Ljava/lang/Object;
    :cond_5
    move-object v15, v0

    move-object/from16 v16, v1

    move/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    .line 352
    .end local v0    # "result":Ljava/util/HashMap;
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    .end local v4    # "v$iv":[Ljava/lang/Object;
    .end local v9    # "i$iv$iv":I
    .restart local v15    # "result":Ljava/util/HashMap;
    .restart local v16    # "this_$iv":Landroidx/collection/ScatterMap;
    .restart local v19    # "$i$f$forEach":I
    .restart local v21    # "k$iv":[Ljava/lang/Object;
    .restart local v22    # "v$iv":[Ljava/lang/Object;
    :cond_6
    nop

    .line 353
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v6    # "$i$f$forEachIndexed":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_7
    nop

    .line 173
    .end local v16    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v19    # "$i$f$forEach":I
    .end local v21    # "k$iv":[Ljava/lang/Object;
    .end local v22    # "v$iv":[Ljava/lang/Object;
    move-object v0, v15

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic box-impl(Landroidx/collection/MutableScatterMap;)Landroidx/compose/runtime/collection/ScopeMap;
    .locals 1

    new-instance v0, Landroidx/compose/runtime/collection/ScopeMap;

    invoke-direct {v0, p0}, Landroidx/compose/runtime/collection/ScopeMap;-><init>(Landroidx/collection/MutableScatterMap;)V

    return-object v0
.end method

.method public static final clear-impl(Landroidx/collection/MutableScatterMap;)V
    .locals 0
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 87
    invoke-virtual {p0}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 88
    return-void
.end method

.method public static constructor-impl(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Key:",
            "Ljava/lang/Object;",
            "Scope:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    return-object p0
.end method

.method public static synthetic constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;
    .locals 0

    .line 26
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    .line 27
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object p0

    .line 26
    :cond_0
    invoke-static {p0}, Landroidx/compose/runtime/collection/ScopeMap;->constructor-impl(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;

    move-result-object p0

    return-object p0
.end method

.method public static final contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z
    .locals 1
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;TKey;)Z"
        }
    .end annotation

    .line 63
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static equals-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    instance-of v0, p1, Landroidx/compose/runtime/collection/ScopeMap;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/collection/ScopeMap;

    invoke-virtual {v0}, Landroidx/compose/runtime/collection/ScopeMap;->unbox-impl()Landroidx/collection/MutableScatterMap;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static final equals-impl0(Landroidx/collection/MutableScatterMap;Landroidx/collection/MutableScatterMap;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static final forEachScopeOf-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 21
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;TKey;",
            "Lkotlin/jvm/functions/Function1<",
            "-TScope;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p2

    const/4 v1, 0x0

    .line 67
    .local v1, "$i$f$forEachScopeOf-impl":I
    invoke-virtual/range {p0 .. p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 68
    .local v2, "value":Ljava/lang/Object;
    if-eqz v2, :cond_8

    .line 71
    instance-of v3, v2, Landroidx/collection/MutableScatterSet;

    if-eqz v3, :cond_7

    .line 72
    move-object v3, v2

    check-cast v3, Landroidx/collection/MutableScatterSet;

    check-cast v3, Landroidx/collection/ScatterSet;

    .local v3, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v4, 0x0

    .line 192
    .local v4, "$i$f$forEach":I
    nop

    .line 193
    iget-object v5, v3, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 194
    .local v5, "elements$iv":[Ljava/lang/Object;
    move-object v6, v3

    .local v6, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v7, 0x0

    .line 195
    .local v7, "$i$f$forEachIndex":I
    nop

    .line 196
    iget-object v8, v6, Landroidx/collection/ScatterSet;->metadata:[J

    .line 197
    .local v8, "m$iv$iv":[J
    array-length v9, v8

    add-int/lit8 v9, v9, -0x2

    .line 199
    .local v9, "lastIndex$iv$iv":I
    const/4 v10, 0x0

    .local v10, "i$iv$iv":I
    if-gt v10, v9, :cond_4

    .line 200
    :goto_0
    aget-wide v11, v8, v10

    .line 201
    .local v11, "slot$iv$iv":J
    move-wide v13, v11

    .local v13, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v15, 0x0

    .line 202
    .local v15, "$i$f$maskEmptyOrDeleted":I
    move-object/from16 v16, v3

    move/from16 v17, v4

    .end local v3    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v4    # "$i$f$forEach":I
    .local v16, "this_$iv":Landroidx/collection/ScatterSet;
    .local v17, "$i$f$forEach":I
    not-long v3, v13

    const/16 v18, 0x7

    shl-long v3, v3, v18

    and-long/2addr v3, v13

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v3, v3, v18

    .line 201
    .end local v13    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v15    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v3, v3, v18

    if-eqz v3, :cond_3

    .line 203
    sub-int v3, v10, v9

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v4, 0x8

    rsub-int/lit8 v3, v3, 0x8

    .line 204
    .local v3, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v3, :cond_2

    .line 205
    const-wide/16 v14, 0xff

    and-long/2addr v14, v11

    .local v14, "value$iv$iv$iv":J
    const/16 v18, 0x0

    .line 206
    .local v18, "$i$f$isFull":I
    const-wide/16 v19, 0x80

    cmp-long v19, v14, v19

    if-gez v19, :cond_0

    const/16 v19, 0x1

    goto :goto_2

    :cond_0
    const/16 v19, 0x0

    .line 205
    .end local v14    # "value$iv$iv$iv":J
    .end local v18    # "$i$f$isFull":I
    :goto_2
    if-eqz v19, :cond_1

    .line 207
    shl-int/lit8 v14, v10, 0x3

    add-int/2addr v14, v13

    .line 208
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v18, 0x0

    .line 194
    .local v18, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    move/from16 v19, v4

    aget-object v4, v5, v15

    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .end local v15    # "index$iv":I
    .end local v18    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_3

    .line 205
    .end local v14    # "index$iv$iv":I
    :cond_1
    move/from16 v19, v4

    .line 210
    :goto_3
    shr-long v11, v11, v19

    .line 204
    add-int/lit8 v13, v13, 0x1

    move/from16 v4, v19

    goto :goto_1

    :cond_2
    move/from16 v19, v4

    .line 212
    .end local v13    # "j$iv$iv":I
    if-ne v3, v4, :cond_6

    .line 199
    .end local v3    # "bitCount$iv$iv":I
    .end local v11    # "slot$iv$iv":J
    :cond_3
    if-eq v10, v9, :cond_5

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v3, v16

    move/from16 v4, v17

    goto :goto_0

    .end local v16    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v17    # "$i$f$forEach":I
    .local v3, "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v4    # "$i$f$forEach":I
    :cond_4
    move-object/from16 v16, v3

    move/from16 v17, v4

    .line 215
    .end local v3    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v4    # "$i$f$forEach":I
    .end local v10    # "i$iv$iv":I
    .restart local v16    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v17    # "$i$f$forEach":I
    :cond_5
    nop

    .line 216
    .end local v6    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v7    # "$i$f$forEachIndex":I
    .end local v8    # "m$iv$iv":[J
    .end local v9    # "lastIndex$iv$iv":I
    :cond_6
    nop

    .end local v5    # "elements$iv":[Ljava/lang/Object;
    .end local v16    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v17    # "$i$f$forEach":I
    goto :goto_4

    .line 75
    :cond_7
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .end local v2    # "value":Ljava/lang/Object;
    :cond_8
    :goto_4
    return-void
.end method

.method public static final getSize-impl(Landroidx/collection/MutableScatterMap;)I
    .locals 1
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    .line 32
    invoke-virtual {p0}, Landroidx/collection/MutableScatterMap;->getSize()I

    move-result v0

    return v0
.end method

.method public static hashCode-impl(Landroidx/collection/MutableScatterMap;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/collection/MutableScatterMap;->hashCode()I

    move-result v0

    return v0
.end method

.method public static final remove-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "scope"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;TKey;TScope;)Z"
        }
    .end annotation

    .line 99
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 100
    .local v0, "value":Ljava/lang/Object;
    :cond_0
    nop

    .line 101
    instance-of v2, v0, Landroidx/collection/MutableScatterSet;

    if-eqz v2, :cond_2

    .line 102
    move-object v1, v0

    check-cast v1, Landroidx/collection/MutableScatterSet;

    .line 104
    .local v1, "set":Landroidx/collection/MutableScatterSet;
    invoke-virtual {v1, p2}, Landroidx/collection/MutableScatterSet;->remove(Ljava/lang/Object;)Z

    move-result v2

    .line 105
    .local v2, "removed":Z
    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroidx/collection/MutableScatterSet;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 106
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    :cond_1
    return v2

    .line 110
    .end local v1    # "set":Landroidx/collection/MutableScatterSet;
    .end local v2    # "removed":Z
    :cond_2
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 111
    invoke-virtual {p0, p1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    const/4 v1, 0x1

    goto :goto_0

    .line 114
    :cond_3
    nop

    .line 100
    :goto_0
    return v1
.end method

.method public static final removeScope-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V
    .locals 21
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .param p1, "scope"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;TScope;)V"
        }
    .end annotation

    .line 142
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v2, 0x0

    .line 304
    .local v2, "$i$f$removeIf":I
    move-object v3, v1

    check-cast v3, Landroidx/collection/ScatterMap;

    .local v3, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v4, 0x0

    .line 305
    .local v4, "$i$f$forEachIndexed":I
    iget-object v5, v3, Landroidx/collection/ScatterMap;->metadata:[J

    .line 306
    .local v5, "m$iv$iv":[J
    array-length v6, v5

    add-int/lit8 v6, v6, -0x2

    .line 308
    .local v6, "lastIndex$iv$iv":I
    const/4 v7, 0x0

    .local v7, "i$iv$iv":I
    if-gt v7, v6, :cond_7

    .line 309
    :goto_0
    aget-wide v8, v5, v7

    .line 310
    .local v8, "slot$iv$iv":J
    move-wide v10, v8

    .local v10, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v12, 0x0

    .line 311
    .local v12, "$i$f$maskEmptyOrDeleted":I
    not-long v13, v10

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v10

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v10, v13, v15

    .line 310
    .end local v10    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v12    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v10, v10, v15

    if-eqz v10, :cond_6

    .line 312
    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    .line 313
    .local v10, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v10, :cond_5

    .line 314
    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    .local v13, "value$iv$iv$iv":J
    const/4 v15, 0x0

    .line 315
    .local v15, "$i$f$isFull":I
    const-wide/16 v16, 0x80

    cmp-long v16, v13, v16

    const/16 v17, 0x0

    const/16 v18, 0x1

    if-gez v16, :cond_0

    move/from16 v13, v18

    goto :goto_2

    :cond_0
    move/from16 v13, v17

    .line 314
    .end local v13    # "value$iv$iv$iv":J
    .end local v15    # "$i$f$isFull":I
    :goto_2
    if-eqz v13, :cond_4

    .line 316
    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    .line 317
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/4 v15, 0x0

    .line 318
    .local v15, "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv":I
    move/from16 v16, v11

    iget-object v11, v1, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v11, v11, v14

    iget-object v11, v1, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v11, v11, v14

    .local v11, "value":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 143
    .local v19, "$i$a$-removeIf-ScopeMap$removeScope$1":I
    nop

    .line 144
    move/from16 v20, v2

    .end local v2    # "$i$f$removeIf":I
    .local v20, "$i$f$removeIf":I
    instance-of v2, v11, Landroidx/collection/MutableScatterSet;

    if-eqz v2, :cond_1

    .line 145
    const-string/jumbo v2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v11

    check-cast v2, Landroidx/collection/MutableScatterSet;

    .line 146
    .local v2, "set":Landroidx/collection/MutableScatterSet;
    invoke-virtual {v2, v0}, Landroidx/collection/MutableScatterSet;->remove(Ljava/lang/Object;)Z

    .line 147
    invoke-virtual {v2}, Landroidx/collection/MutableScatterSet;->isEmpty()Z

    move-result v17

    .end local v2    # "set":Landroidx/collection/MutableScatterSet;
    goto :goto_3

    .line 150
    :cond_1
    if-ne v11, v0, :cond_2

    move/from16 v17, v18

    .line 152
    :cond_2
    :goto_3
    nop

    .line 318
    .end local v11    # "value":Ljava/lang/Object;
    .end local v19    # "$i$a$-removeIf-ScopeMap$removeScope$1":I
    if-eqz v17, :cond_3

    .line 319
    invoke-virtual {v1, v14}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 321
    :cond_3
    nop

    .line 317
    .end local v14    # "index$iv":I
    .end local v15    # "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv":I
    goto :goto_4

    .line 314
    .end local v13    # "index$iv$iv":I
    .end local v20    # "$i$f$removeIf":I
    .local v2, "$i$f$removeIf":I
    :cond_4
    move/from16 v20, v2

    move/from16 v16, v11

    .line 322
    .end local v2    # "$i$f$removeIf":I
    .restart local v20    # "$i$f$removeIf":I
    :goto_4
    shr-long v8, v8, v16

    .line 313
    add-int/lit8 v12, v12, 0x1

    move/from16 v11, v16

    move/from16 v2, v20

    goto :goto_1

    .end local v20    # "$i$f$removeIf":I
    .restart local v2    # "$i$f$removeIf":I
    :cond_5
    move/from16 v20, v2

    move/from16 v16, v11

    .line 324
    .end local v2    # "$i$f$removeIf":I
    .end local v12    # "j$iv$iv":I
    .restart local v20    # "$i$f$removeIf":I
    move/from16 v2, v16

    if-ne v10, v2, :cond_9

    goto :goto_5

    .line 310
    .end local v10    # "bitCount$iv$iv":I
    .end local v20    # "$i$f$removeIf":I
    .restart local v2    # "$i$f$removeIf":I
    :cond_6
    move/from16 v20, v2

    .line 308
    .end local v2    # "$i$f$removeIf":I
    .end local v8    # "slot$iv$iv":J
    .restart local v20    # "$i$f$removeIf":I
    :goto_5
    if-eq v7, v6, :cond_8

    add-int/lit8 v7, v7, 0x1

    move/from16 v2, v20

    goto/16 :goto_0

    .end local v20    # "$i$f$removeIf":I
    .restart local v2    # "$i$f$removeIf":I
    :cond_7
    move/from16 v20, v2

    .line 327
    .end local v2    # "$i$f$removeIf":I
    .end local v7    # "i$iv$iv":I
    .restart local v20    # "$i$f$removeIf":I
    :cond_8
    nop

    .line 328
    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "m$iv$iv":[J
    .end local v6    # "lastIndex$iv$iv":I
    :cond_9
    nop

    .line 154
    .end local v1    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v20    # "$i$f$removeIf":I
    return-void
.end method

.method public static final removeScopeIf-impl(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function1;)V
    .locals 45
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-TScope;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    const/4 v1, 0x0

    .line 123
    .local v1, "$i$f$removeScopeIf-impl":I
    move-object/from16 v2, p0

    .local v2, "this_$iv":Landroidx/collection/MutableScatterMap;
    const/4 v3, 0x0

    .line 252
    .local v3, "$i$f$removeIf":I
    move-object v4, v2

    check-cast v4, Landroidx/collection/ScatterMap;

    .local v4, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v5, 0x0

    .line 253
    .local v5, "$i$f$forEachIndexed":I
    iget-object v6, v4, Landroidx/collection/ScatterMap;->metadata:[J

    .line 254
    .local v6, "m$iv$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 256
    .local v7, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv$iv":I
    if-gt v8, v7, :cond_e

    .line 257
    :goto_0
    aget-wide v9, v6, v8

    .line 258
    .local v9, "slot$iv$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v13, 0x0

    .line 259
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v11

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v14, v17

    .line 258
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v17

    if-eqz v11, :cond_d

    .line 260
    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 261
    .local v11, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v11, :cond_c

    .line 262
    const-wide/16 v14, 0xff

    and-long v19, v9, v14

    .local v19, "value$iv$iv$iv":J
    const/16 v21, 0x0

    .line 263
    .local v21, "$i$f$isFull":I
    const-wide/16 v22, 0x80

    cmp-long v24, v19, v22

    const/16 v25, 0x0

    const/16 v26, 0x1

    if-gez v24, :cond_0

    move/from16 v19, v26

    goto :goto_2

    :cond_0
    move/from16 v19, v25

    .line 262
    .end local v19    # "value$iv$iv$iv":J
    .end local v21    # "$i$f$isFull":I
    :goto_2
    if-eqz v19, :cond_b

    .line 264
    shl-int/lit8 v19, v8, 0x3

    add-int v19, v19, v13

    .line 265
    .local v19, "index$iv$iv":I
    move/from16 v20, v19

    .local v20, "index$iv":I
    const/16 v21, 0x0

    .line 266
    .local v21, "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv":I
    move-wide/from16 v27, v14

    iget-object v14, v2, Landroidx/collection/MutableScatterMap;->keys:[Ljava/lang/Object;

    aget-object v14, v14, v20

    iget-object v14, v2, Landroidx/collection/MutableScatterMap;->values:[Ljava/lang/Object;

    aget-object v14, v14, v20

    .local v14, "value":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 124
    .local v15, "$i$a$-removeIf-ScopeMap$removeScopeIf$1":I
    nop

    .line 125
    move/from16 v24, v12

    instance-of v12, v14, Landroidx/collection/MutableScatterSet;

    if-eqz v12, :cond_9

    .line 126
    const-string/jumbo v12, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    invoke-static {v14, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v14

    check-cast v12, Landroidx/collection/MutableScatterSet;

    .line 127
    .local v12, "set":Landroidx/collection/MutableScatterSet;
    move-object/from16 v29, v12

    .local v29, "this_$iv":Landroidx/collection/MutableScatterSet;
    const/16 v30, 0x0

    .line 267
    .local v30, "$i$f$removeIf":I
    move/from16 v31, v1

    move-object/from16 v1, v29

    move/from16 v29, v3

    .end local v3    # "$i$f$removeIf":I
    .local v1, "this_$iv":Landroidx/collection/MutableScatterSet;
    .local v29, "$i$f$removeIf":I
    .local v31, "$i$f$removeScopeIf-impl":I
    iget-object v3, v1, Landroidx/collection/MutableScatterSet;->elements:[Ljava/lang/Object;

    .line 268
    .local v3, "elements$iv":[Ljava/lang/Object;
    move-object/from16 v32, v3

    .end local v3    # "elements$iv":[Ljava/lang/Object;
    .local v32, "elements$iv":[Ljava/lang/Object;
    move-object v3, v1

    check-cast v3, Landroidx/collection/ScatterSet;

    .local v3, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/16 v33, 0x0

    .line 269
    .local v33, "$i$f$forEachIndex":I
    nop

    .line 270
    move-object/from16 v34, v4

    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .local v34, "this_$iv$iv":Landroidx/collection/ScatterMap;
    iget-object v4, v3, Landroidx/collection/ScatterSet;->metadata:[J

    .line 271
    .local v4, "m$iv$iv":[J
    move-object/from16 v35, v3

    .end local v3    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .local v35, "this_$iv$iv":Landroidx/collection/ScatterSet;
    array-length v3, v4

    add-int/lit8 v3, v3, -0x2

    .line 273
    .local v3, "lastIndex$iv$iv":I
    move-object/from16 v36, v4

    .end local v4    # "m$iv$iv":[J
    .local v36, "m$iv$iv":[J
    const/4 v4, 0x0

    .local v4, "i$iv$iv":I
    if-gt v4, v3, :cond_6

    .line 274
    :goto_3
    aget-wide v37, v36, v4

    .line 275
    .local v37, "slot$iv$iv":J
    move-wide/from16 v39, v37

    .local v39, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/16 v41, 0x0

    .line 276
    .local v41, "$i$f$maskEmptyOrDeleted":I
    move/from16 v42, v5

    move-object/from16 v43, v6

    move-wide/from16 v5, v39

    move-wide/from16 v39, v9

    .end local v6    # "m$iv$iv":[J
    .end local v9    # "slot$iv$iv":J
    .local v5, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .local v39, "slot$iv$iv":J
    .local v42, "$i$f$forEachIndexed":I
    .local v43, "m$iv$iv":[J
    not-long v9, v5

    shl-long v9, v9, v16

    and-long/2addr v9, v5

    and-long v5, v9, v17

    .line 275
    .end local v5    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v41    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v5, v5, v17

    if-eqz v5, :cond_5

    .line 277
    sub-int v5, v4, v3

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    rsub-int/lit8 v5, v5, 0x8

    .line 278
    .local v5, "bitCount$iv$iv":I
    const/4 v6, 0x0

    .local v6, "j$iv$iv":I
    :goto_4
    if-ge v6, v5, :cond_4

    .line 279
    and-long v9, v37, v27

    .local v9, "value$iv$iv$iv":J
    const/16 v41, 0x0

    .line 280
    .local v41, "$i$f$isFull":I
    cmp-long v44, v9, v22

    if-gez v44, :cond_1

    move/from16 v9, v26

    goto :goto_5

    :cond_1
    move/from16 v9, v25

    .line 279
    .end local v9    # "value$iv$iv$iv":J
    .end local v41    # "$i$f$isFull":I
    :goto_5
    if-eqz v9, :cond_3

    .line 281
    shl-int/lit8 v9, v4, 0x3

    add-int/2addr v9, v6

    .line 282
    .local v9, "index$iv$iv":I
    move v10, v9

    .local v10, "index$iv":I
    const/16 v41, 0x0

    .line 283
    .local v41, "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv":I
    move/from16 v44, v6

    .end local v6    # "j$iv$iv":I
    .local v44, "j$iv$iv":I
    aget-object v6, v32, v10

    invoke-interface {v0, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 284
    invoke-virtual {v1, v10}, Landroidx/collection/MutableScatterSet;->removeElementAt(I)V

    .line 286
    :cond_2
    nop

    .line 282
    .end local v10    # "index$iv":I
    .end local v41    # "$i$a$-forEachIndex-MutableScatterSet$removeIf$1$iv":I
    goto :goto_6

    .line 279
    .end local v9    # "index$iv$iv":I
    .end local v44    # "j$iv$iv":I
    .restart local v6    # "j$iv$iv":I
    :cond_3
    move/from16 v44, v6

    .line 287
    .end local v6    # "j$iv$iv":I
    .restart local v44    # "j$iv$iv":I
    :goto_6
    shr-long v37, v37, v24

    .line 278
    add-int/lit8 v6, v44, 0x1

    .end local v44    # "j$iv$iv":I
    .restart local v6    # "j$iv$iv":I
    goto :goto_4

    :cond_4
    move/from16 v44, v6

    .line 289
    .end local v6    # "j$iv$iv":I
    move/from16 v6, v24

    if-ne v5, v6, :cond_8

    .line 273
    .end local v5    # "bitCount$iv$iv":I
    .end local v37    # "slot$iv$iv":J
    :cond_5
    if-eq v4, v3, :cond_7

    add-int/lit8 v4, v4, 0x1

    move-wide/from16 v9, v39

    move/from16 v5, v42

    move-object/from16 v6, v43

    const/16 v24, 0x8

    goto :goto_3

    .end local v39    # "slot$iv$iv":J
    .end local v42    # "$i$f$forEachIndexed":I
    .end local v43    # "m$iv$iv":[J
    .local v5, "$i$f$forEachIndexed":I
    .local v6, "m$iv$iv":[J
    .local v9, "slot$iv$iv":J
    :cond_6
    move/from16 v42, v5

    move-object/from16 v43, v6

    move-wide/from16 v39, v9

    .line 292
    .end local v4    # "i$iv$iv":I
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v9    # "slot$iv$iv":J
    .restart local v39    # "slot$iv$iv":J
    .restart local v42    # "$i$f$forEachIndexed":I
    .restart local v43    # "m$iv$iv":[J
    :cond_7
    nop

    .line 293
    .end local v3    # "lastIndex$iv$iv":I
    .end local v33    # "$i$f$forEachIndex":I
    .end local v35    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v36    # "m$iv$iv":[J
    :cond_8
    nop

    .line 128
    .end local v1    # "this_$iv":Landroidx/collection/MutableScatterSet;
    .end local v30    # "$i$f$removeIf":I
    .end local v32    # "elements$iv":[Ljava/lang/Object;
    invoke-virtual {v12}, Landroidx/collection/MutableScatterSet;->isEmpty()Z

    move-result v1

    .end local v12    # "set":Landroidx/collection/MutableScatterSet;
    goto :goto_7

    .line 131
    .end local v29    # "$i$f$removeIf":I
    .end local v31    # "$i$f$removeScopeIf-impl":I
    .end local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v39    # "slot$iv$iv":J
    .end local v42    # "$i$f$forEachIndexed":I
    .end local v43    # "m$iv$iv":[J
    .local v1, "$i$f$removeScopeIf-impl":I
    .local v3, "$i$f$removeIf":I
    .local v4, "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v5    # "$i$f$forEachIndexed":I
    .restart local v6    # "m$iv$iv":[J
    .restart local v9    # "slot$iv$iv":J
    :cond_9
    move/from16 v31, v1

    move/from16 v29, v3

    move-object/from16 v34, v4

    move/from16 v42, v5

    move-object/from16 v43, v6

    move-wide/from16 v39, v9

    .end local v1    # "$i$f$removeScopeIf-impl":I
    .end local v3    # "$i$f$removeIf":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v9    # "slot$iv$iv":J
    .restart local v29    # "$i$f$removeIf":I
    .restart local v31    # "$i$f$removeScopeIf-impl":I
    .restart local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v39    # "slot$iv$iv":J
    .restart local v42    # "$i$f$forEachIndexed":I
    .restart local v43    # "m$iv$iv":[J
    const-string/jumbo v1, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 133
    :goto_7
    nop

    .line 266
    .end local v14    # "value":Ljava/lang/Object;
    .end local v15    # "$i$a$-removeIf-ScopeMap$removeScopeIf$1":I
    if-eqz v1, :cond_a

    .line 294
    move/from16 v1, v20

    .end local v20    # "index$iv":I
    .local v1, "index$iv":I
    invoke-virtual {v2, v1}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    goto :goto_8

    .line 266
    .end local v1    # "index$iv":I
    .restart local v20    # "index$iv":I
    :cond_a
    move/from16 v1, v20

    .line 296
    .end local v20    # "index$iv":I
    .restart local v1    # "index$iv":I
    :goto_8
    nop

    .line 265
    .end local v1    # "index$iv":I
    .end local v21    # "$i$a$-forEachIndexed-MutableScatterMap$removeIf$1$iv":I
    goto :goto_9

    .line 262
    .end local v19    # "index$iv$iv":I
    .end local v29    # "$i$f$removeIf":I
    .end local v31    # "$i$f$removeScopeIf-impl":I
    .end local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v39    # "slot$iv$iv":J
    .end local v42    # "$i$f$forEachIndexed":I
    .end local v43    # "m$iv$iv":[J
    .local v1, "$i$f$removeScopeIf-impl":I
    .restart local v3    # "$i$f$removeIf":I
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v5    # "$i$f$forEachIndexed":I
    .restart local v6    # "m$iv$iv":[J
    .restart local v9    # "slot$iv$iv":J
    :cond_b
    move/from16 v31, v1

    move/from16 v29, v3

    move-object/from16 v34, v4

    move/from16 v42, v5

    move-object/from16 v43, v6

    move-wide/from16 v39, v9

    .line 297
    .end local v1    # "$i$f$removeScopeIf-impl":I
    .end local v3    # "$i$f$removeIf":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v9    # "slot$iv$iv":J
    .restart local v29    # "$i$f$removeIf":I
    .restart local v31    # "$i$f$removeScopeIf-impl":I
    .restart local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v39    # "slot$iv$iv":J
    .restart local v42    # "$i$f$forEachIndexed":I
    .restart local v43    # "m$iv$iv":[J
    :goto_9
    const/16 v6, 0x8

    shr-long v9, v39, v6

    .line 261
    .end local v39    # "slot$iv$iv":J
    .restart local v9    # "slot$iv$iv":J
    add-int/lit8 v13, v13, 0x1

    move v12, v6

    move/from16 v3, v29

    move/from16 v1, v31

    move-object/from16 v4, v34

    move/from16 v5, v42

    move-object/from16 v6, v43

    goto/16 :goto_1

    .end local v29    # "$i$f$removeIf":I
    .end local v31    # "$i$f$removeScopeIf-impl":I
    .end local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v42    # "$i$f$forEachIndexed":I
    .end local v43    # "m$iv$iv":[J
    .restart local v1    # "$i$f$removeScopeIf-impl":I
    .restart local v3    # "$i$f$removeIf":I
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v5    # "$i$f$forEachIndexed":I
    .restart local v6    # "m$iv$iv":[J
    :cond_c
    move/from16 v31, v1

    move/from16 v29, v3

    move-object/from16 v34, v4

    move/from16 v42, v5

    move-object/from16 v43, v6

    move-wide/from16 v39, v9

    move v6, v12

    .line 299
    .end local v1    # "$i$f$removeScopeIf-impl":I
    .end local v3    # "$i$f$removeIf":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v9    # "slot$iv$iv":J
    .end local v13    # "j$iv$iv":I
    .restart local v29    # "$i$f$removeIf":I
    .restart local v31    # "$i$f$removeScopeIf-impl":I
    .restart local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v39    # "slot$iv$iv":J
    .restart local v42    # "$i$f$forEachIndexed":I
    .restart local v43    # "m$iv$iv":[J
    if-ne v11, v6, :cond_10

    goto :goto_a

    .line 258
    .end local v11    # "bitCount$iv$iv":I
    .end local v29    # "$i$f$removeIf":I
    .end local v31    # "$i$f$removeScopeIf-impl":I
    .end local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v39    # "slot$iv$iv":J
    .end local v42    # "$i$f$forEachIndexed":I
    .end local v43    # "m$iv$iv":[J
    .restart local v1    # "$i$f$removeScopeIf-impl":I
    .restart local v3    # "$i$f$removeIf":I
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v5    # "$i$f$forEachIndexed":I
    .restart local v6    # "m$iv$iv":[J
    .restart local v9    # "slot$iv$iv":J
    :cond_d
    move/from16 v31, v1

    move/from16 v29, v3

    move-object/from16 v34, v4

    move/from16 v42, v5

    move-object/from16 v43, v6

    .line 256
    .end local v1    # "$i$f$removeScopeIf-impl":I
    .end local v3    # "$i$f$removeIf":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v9    # "slot$iv$iv":J
    .restart local v29    # "$i$f$removeIf":I
    .restart local v31    # "$i$f$removeScopeIf-impl":I
    .restart local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v42    # "$i$f$forEachIndexed":I
    .restart local v43    # "m$iv$iv":[J
    :goto_a
    if-eq v8, v7, :cond_f

    add-int/lit8 v8, v8, 0x1

    move/from16 v3, v29

    move/from16 v1, v31

    move-object/from16 v4, v34

    move/from16 v5, v42

    move-object/from16 v6, v43

    goto/16 :goto_0

    .end local v29    # "$i$f$removeIf":I
    .end local v31    # "$i$f$removeScopeIf-impl":I
    .end local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v42    # "$i$f$forEachIndexed":I
    .end local v43    # "m$iv$iv":[J
    .restart local v1    # "$i$f$removeScopeIf-impl":I
    .restart local v3    # "$i$f$removeIf":I
    .restart local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v5    # "$i$f$forEachIndexed":I
    .restart local v6    # "m$iv$iv":[J
    :cond_e
    move/from16 v31, v1

    move/from16 v29, v3

    move-object/from16 v34, v4

    move/from16 v42, v5

    move-object/from16 v43, v6

    .line 302
    .end local v1    # "$i$f$removeScopeIf-impl":I
    .end local v3    # "$i$f$removeIf":I
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v8    # "i$iv$iv":I
    .restart local v29    # "$i$f$removeIf":I
    .restart local v31    # "$i$f$removeScopeIf-impl":I
    .restart local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .restart local v42    # "$i$f$forEachIndexed":I
    .restart local v43    # "m$iv$iv":[J
    :cond_f
    nop

    .line 303
    .end local v7    # "lastIndex$iv$iv":I
    .end local v34    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v42    # "$i$f$forEachIndexed":I
    .end local v43    # "m$iv$iv":[J
    :cond_10
    nop

    .line 135
    .end local v2    # "this_$iv":Landroidx/collection/MutableScatterMap;
    .end local v29    # "$i$f$removeIf":I
    return-void
.end method

.method public static final set-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p0, "arg0"    # Landroidx/collection/MutableScatterMap;
    .param p1, "key"    # Ljava/lang/Object;
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;TKey;TScope;)V"
        }
    .end annotation

    .line 59
    invoke-virtual {p0, p1, p2}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    return-void
.end method

.method public static toString-impl(Landroidx/collection/MutableScatterMap;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScopeMap(map="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/collection/ScopeMap;->map:Landroidx/collection/MutableScatterMap;

    invoke-static {v0, p1}, Landroidx/compose/runtime/collection/ScopeMap;->equals-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final getMap()Landroidx/collection/MutableScatterMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Landroidx/compose/runtime/collection/ScopeMap;->map:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/collection/ScopeMap;->map:Landroidx/collection/MutableScatterMap;

    invoke-static {v0}, Landroidx/compose/runtime/collection/ScopeMap;->hashCode-impl(Landroidx/collection/MutableScatterMap;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/collection/ScopeMap;->map:Landroidx/collection/MutableScatterMap;

    invoke-static {v0}, Landroidx/compose/runtime/collection/ScopeMap;->toString-impl(Landroidx/collection/MutableScatterMap;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()Landroidx/collection/MutableScatterMap;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/collection/ScopeMap;->map:Landroidx/collection/MutableScatterMap;

    return-object v0
.end method
