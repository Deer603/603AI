.class public final Landroidx/compose/ui/focus/FocusTransactionManager;
.super Ljava/lang/Object;
.source "FocusTransactionManager.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFocusTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,122:1\n1101#2:123\n1083#2,2:124\n1#3:126\n641#4,2:127\n641#4,2:129\n423#4,9:162\n76#5,7:131\n365#6,3:138\n329#6,6:141\n339#6,3:148\n342#6,9:152\n368#6:161\n1399#7:147\n1270#7:151\n*S KotlinDebug\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n*L\n32#1:123\n32#1:124,2\n55#1:127,2\n72#1:129,2\n118#1:162,9\n100#1:131,7\n109#1:138,3\n109#1:141,6\n109#1:148,3\n109#1:152,9\n109#1:161\n109#1:147\n109#1:151\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u001a\u001a\u00020\u0006H\u0002J\u0008\u0010\u001b\u001a\u00020\u0006H\u0002J\u0008\u0010\u001c\u001a\u00020\u0006H\u0002J4\u0010\u001d\u001a\u0002H\u001e\"\u0004\u0008\u0000\u0010\u001e2\u0010\u0008\n\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u0002H\u001e0\u0005H\u0086\u0008\u00a2\u0006\u0002\u0010!J4\u0010\"\u001a\u0002H\u001e\"\u0004\u0008\u0000\u0010\u001e2\u0010\u0008\n\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u0002H\u001e0\u0005H\u0086\u0008\u00a2\u0006\u0002\u0010!R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u000c@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u0015\u001a\u0004\u0018\u00010\u0013*\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006#"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusTransactionManager;",
        "",
        "()V",
        "cancellationListener",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "Lkotlin/Function0;",
        "",
        "<set-?>",
        "",
        "generation",
        "getGeneration",
        "()I",
        "",
        "ongoingTransaction",
        "getOngoingTransaction",
        "()Z",
        "states",
        "Landroidx/collection/MutableScatterMap;",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "Landroidx/compose/ui/focus/FocusStateImpl;",
        "value",
        "uncommittedFocusState",
        "getUncommittedFocusState",
        "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;",
        "setUncommittedFocusState",
        "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V",
        "beginTransaction",
        "cancelTransaction",
        "commitTransaction",
        "withExistingTransaction",
        "T",
        "onCancelled",
        "block",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;",
        "withNewTransaction",
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
.field private final cancellationListener:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private generation:I

.field private ongoingTransaction:Z

.field private final states:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            "Landroidx/compose/ui/focus/FocusStateImpl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/focus/FocusTransactionManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->states:Landroidx/collection/MutableScatterMap;

    .line 32
    const/4 v0, 0x0

    .line 123
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 124
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv":I
    const/4 v2, 0x0

    .line 125
    .local v2, "$i$f$MutableVector":I
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    new-array v4, v1, [Lkotlin/jvm/functions/Function0;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 123
    .end local v1    # "capacity$iv$iv":I
    .end local v2    # "$i$f$MutableVector":I
    nop

    .line 32
    .end local v0    # "$i$f$mutableVectorOf":I
    iput-object v3, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->cancellationListener:Landroidx/compose/runtime/collection/MutableVector;

    .line 30
    return-void
.end method

.method public static final synthetic access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 30
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->beginTransaction()V

    return-void
.end method

.method public static final synthetic access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 30
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->cancelTransaction()V

    return-void
.end method

.method public static final synthetic access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 30
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->commitTransaction()V

    return-void
.end method

.method public static final synthetic access$getCancellationListener$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Landroidx/compose/runtime/collection/MutableVector;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 30
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->cancellationListener:Landroidx/compose/runtime/collection/MutableVector;

    return-object v0
.end method

.method private final beginTransaction()V
    .locals 1

    .line 105
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->ongoingTransaction:Z

    .line 106
    return-void
.end method

.method private final cancelTransaction()V
    .locals 7

    .line 116
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->states:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 117
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->ongoingTransaction:Z

    .line 118
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->cancellationListener:Landroidx/compose/runtime/collection/MutableVector;

    .local v0, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v1, 0x0

    .line 162
    .local v1, "$i$f$forEach":I
    nop

    .line 163
    const/4 v2, 0x0

    .line 164
    .local v2, "i$iv":I
    iget-object v3, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 165
    .local v3, "content$iv":[Ljava/lang/Object;
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v4

    .line 166
    .local v4, "size$iv":I
    :goto_0
    if-ge v2, v4, :cond_0

    .line 167
    aget-object v5, v3, v2

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .local v5, "it":Lkotlin/jvm/functions/Function0;
    const/4 v6, 0x0

    .line 118
    .local v6, "$i$a$-forEach-FocusTransactionManager$cancelTransaction$1":I
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 167
    .end local v5    # "it":Lkotlin/jvm/functions/Function0;
    .end local v6    # "$i$a$-forEach-FocusTransactionManager$cancelTransaction$1":I
    nop

    .line 168
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 170
    :cond_0
    nop

    .line 119
    .end local v0    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v1    # "$i$f$forEach":I
    .end local v2    # "i$iv":I
    .end local v3    # "content$iv":[Ljava/lang/Object;
    .end local v4    # "size$iv":I
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->cancellationListener:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 120
    return-void
.end method

.method private final commitTransaction()V
    .locals 20

    .line 109
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/focus/FocusTransactionManager;->states:Landroidx/collection/MutableScatterMap;

    check-cast v1, Landroidx/collection/ScatterMap;

    .local v1, "this_$iv":Landroidx/collection/ScatterMap;
    const/4 v2, 0x0

    .line 138
    .local v2, "$i$f$forEachKey":I
    iget-object v3, v1, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 140
    .local v3, "k$iv":[Ljava/lang/Object;
    move-object v4, v1

    .local v4, "this_$iv$iv":Landroidx/collection/ScatterMap;
    const/4 v5, 0x0

    .line 141
    .local v5, "$i$f$forEachIndexed":I
    iget-object v6, v4, Landroidx/collection/ScatterMap;->metadata:[J

    .line 142
    .local v6, "m$iv$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 144
    .local v7, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv$iv":I
    if-gt v8, v7, :cond_4

    .line 145
    :goto_0
    aget-wide v10, v6, v8

    .line 146
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v14, 0x0

    .line 147
    .local v14, "$i$f$maskEmptyOrDeleted":I
    move-wide/from16 v16, v10

    .end local v10    # "slot$iv$iv":J
    .local v16, "slot$iv$iv":J
    not-long v9, v12

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v12

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v9, v9, v18

    .line 146
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v9, v9, v18

    if-eqz v9, :cond_3

    .line 148
    sub-int v9, v8, v7

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    .line 149
    .local v9, "bitCount$iv$iv":I
    const/4 v11, 0x0

    .local v11, "j$iv$iv":I
    :goto_1
    if-ge v11, v9, :cond_2

    .line 150
    const-wide/16 v12, 0xff

    and-long v12, v16, v12

    .local v12, "value$iv$iv$iv":J
    const/4 v14, 0x0

    .line 151
    .local v14, "$i$f$isFull":I
    const-wide/16 v18, 0x80

    cmp-long v18, v12, v18

    if-gez v18, :cond_0

    const/16 v18, 0x1

    goto :goto_2

    :cond_0
    const/16 v18, 0x0

    .line 150
    .end local v12    # "value$iv$iv$iv":J
    .end local v14    # "$i$f$isFull":I
    :goto_2
    if-eqz v18, :cond_1

    .line 152
    shl-int/lit8 v12, v8, 0x3

    add-int/2addr v12, v11

    .line 153
    .local v12, "index$iv$iv":I
    move v13, v12

    .local v13, "index$iv":I
    const/4 v14, 0x0

    .line 140
    .local v14, "$i$a$-forEachIndexed-ScatterMap$forEachKey$1$iv":I
    aget-object v18, v3, v13

    check-cast v18, Landroidx/compose/ui/focus/FocusTargetNode;

    .local v18, "focusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    const/16 v19, 0x0

    .line 109
    .local v19, "$i$a$-forEachKey-FocusTransactionManager$commitTransaction$1":I
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/focus/FocusTargetNode;->commitFocusState$ui_release()V

    .line 140
    .end local v18    # "focusTargetNode":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v19    # "$i$a$-forEachKey-FocusTransactionManager$commitTransaction$1":I
    nop

    .line 153
    .end local v13    # "index$iv":I
    .end local v14    # "$i$a$-forEachIndexed-ScatterMap$forEachKey$1$iv":I
    nop

    .line 155
    .end local v12    # "index$iv$iv":I
    :cond_1
    shr-long v16, v16, v10

    .line 149
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 157
    .end local v11    # "j$iv$iv":I
    :cond_2
    if-ne v9, v10, :cond_5

    .line 144
    .end local v9    # "bitCount$iv$iv":I
    .end local v16    # "slot$iv$iv":J
    :cond_3
    if-eq v8, v7, :cond_4

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 160
    .end local v8    # "i$iv$iv":I
    :cond_4
    nop

    .line 161
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterMap;
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "m$iv$iv":[J
    .end local v7    # "lastIndex$iv$iv":I
    :cond_5
    nop

    .line 110
    .end local v1    # "this_$iv":Landroidx/collection/ScatterMap;
    .end local v2    # "$i$f$forEachKey":I
    .end local v3    # "k$iv":[Ljava/lang/Object;
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusTransactionManager;->states:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 111
    const/4 v15, 0x0

    iput-boolean v15, v0, Landroidx/compose/ui/focus/FocusTransactionManager;->ongoingTransaction:Z

    .line 112
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusTransactionManager;->cancellationListener:Landroidx/compose/runtime/collection/MutableVector;

    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 113
    return-void
.end method

.method public static synthetic withExistingTransaction$default(Landroidx/compose/ui/focus/FocusTransactionManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p0, "$this"    # Landroidx/compose/ui/focus/FocusTransactionManager;
    .param p1, "onCancelled"    # Lkotlin/jvm/functions/Function0;
    .param p2, "block"    # Lkotlin/jvm/functions/Function0;

    .line 68
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 69
    const/4 p1, 0x0

    .line 68
    :cond_0
    const/4 p3, 0x0

    .line 72
    .local p3, "$i$f$withExistingTransaction":I
    if-eqz p1, :cond_1

    move-object p4, p1

    .line 126
    .local p4, "it":Lkotlin/jvm/functions/Function0;
    const/4 v0, 0x0

    .line 72
    .local v0, "$i$a$-let-FocusTransactionManager$withExistingTransaction$1":I
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getCancellationListener$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v1

    .local v1, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v2, 0x0

    .line 129
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 130
    nop

    .line 72
    .end local v1    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .line 73
    .end local v0    # "$i$a$-let-FocusTransactionManager$withExistingTransaction$1":I
    .end local p4    # "it":Lkotlin/jvm/functions/Function0;
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p4

    goto :goto_0

    .line 75
    :cond_2
    nop

    .line 76
    :try_start_0
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 77
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 80
    nop

    .line 79
    nop

    .line 73
    :goto_0
    return-object p4

    .line 79
    :catchall_0
    move-exception p4

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw p4
.end method

.method public static synthetic withNewTransaction$default(Landroidx/compose/ui/focus/FocusTransactionManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p0, "$this"    # Landroidx/compose/ui/focus/FocusTransactionManager;
    .param p1, "onCancelled"    # Lkotlin/jvm/functions/Function0;
    .param p2, "block"    # Lkotlin/jvm/functions/Function0;

    .line 48
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 49
    const/4 p1, 0x0

    .line 48
    :cond_0
    const/4 p3, 0x0

    .line 52
    .local p3, "$i$f$withNewTransaction":I
    nop

    .line 53
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 54
    :cond_1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 55
    if-eqz p1, :cond_2

    move-object p4, p1

    .line 126
    .local p4, "it":Lkotlin/jvm/functions/Function0;
    const/4 v0, 0x0

    .line 55
    .local v0, "$i$a$-let-FocusTransactionManager$withNewTransaction$1":I
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getCancellationListener$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v1

    .local v1, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v2, 0x0

    .line 127
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 128
    nop

    .line 55
    .end local v1    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .line 56
    .end local v0    # "$i$a$-let-FocusTransactionManager$withNewTransaction$1":I
    .end local p4    # "it":Lkotlin/jvm/functions/Function0;
    :cond_2
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 59
    return-object p4

    .line 58
    :catchall_0
    move-exception p4

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw p4
.end method


# virtual methods
.method public final getGeneration()I
    .locals 1

    .line 39
    iget v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->generation:I

    return v0
.end method

.method public final getOngoingTransaction()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->ongoingTransaction:Z

    return v0
.end method

.method public final getUncommittedFocusState(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;
    .locals 2
    .param p1, "$this$uncommittedFocusState"    # Landroidx/compose/ui/focus/FocusTargetNode;

    .line 89
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->states:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/FocusStateImpl;

    .line 93
    return-object v0

    .line 89
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 90
    const-string/jumbo v1, "uncommittedFocusState must not be accessed when isTrackFocusEnabled is on"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setUncommittedFocusState(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V
    .locals 3
    .param p1, "$this$uncommittedFocusState"    # Landroidx/compose/ui/focus/FocusTargetNode;
    .param p2, "value"    # Landroidx/compose/ui/focus/FocusStateImpl;

    .line 95
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-nez v0, :cond_3

    .line 96
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->states:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/FocusStateImpl;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 97
    .local v0, "currentFocusState":Landroidx/compose/ui/focus/FocusStateImpl;
    :cond_0
    if-eq v0, p2, :cond_1

    .line 98
    iget v1, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->generation:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->generation:I

    .line 100
    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusTransactionManager;->states:Landroidx/collection/MutableScatterMap;

    const/4 v2, 0x0

    .line 131
    .local v2, "$i$f$checkPreconditionNotNull":I
    nop

    .line 133
    if-eqz p2, :cond_2

    .line 137
    nop

    .line 100
    .end local v2    # "$i$f$checkPreconditionNotNull":I
    invoke-virtual {v1, p1, p2}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 134
    .restart local v2    # "$i$f$checkPreconditionNotNull":I
    :cond_2
    const/4 v1, 0x0

    .line 100
    .local v1, "$i$a$-checkPreconditionNotNull-FocusTransactionManager$uncommittedFocusState$1":I
    nop

    .line 134
    .end local v1    # "$i$a$-checkPreconditionNotNull-FocusTransactionManager$uncommittedFocusState$1":I
    const-string/jumbo v1, "requires a non-null focus state"

    invoke-static {v1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    .line 102
    .end local v0    # "currentFocusState":Landroidx/compose/ui/focus/FocusStateImpl;
    .end local v2    # "$i$f$checkPreconditionNotNull":I
    :cond_3
    :goto_0
    return-void
.end method

.method public final withExistingTransaction(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 5
    .param p1, "onCancelled"    # Lkotlin/jvm/functions/Function0;
    .param p2, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 72
    .local v0, "$i$f$withExistingTransaction":I
    if-eqz p1, :cond_0

    move-object v1, p1

    .line 126
    .local v1, "it":Lkotlin/jvm/functions/Function0;
    const/4 v2, 0x0

    .line 72
    .local v2, "$i$a$-let-FocusTransactionManager$withExistingTransaction$1":I
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getCancellationListener$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v3

    .local v3, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v4, 0x0

    .line 129
    .local v4, "$i$f$plusAssign":I
    invoke-virtual {v3, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 130
    nop

    .line 72
    .end local v3    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v4    # "$i$f$plusAssign":I
    nop

    .line 73
    .end local v1    # "it":Lkotlin/jvm/functions/Function0;
    .end local v2    # "$i$a$-let-FocusTransactionManager$withExistingTransaction$1":I
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    .line 75
    :cond_1
    nop

    .line 76
    :try_start_0
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 77
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 80
    nop

    .line 79
    nop

    .line 73
    :goto_0
    return-object v1

    .line 79
    :catchall_0
    move-exception v1

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw v1
.end method

.method public final withNewTransaction(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 5
    .param p1, "onCancelled"    # Lkotlin/jvm/functions/Function0;
    .param p2, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 52
    .local v0, "$i$f$withNewTransaction":I
    nop

    .line 53
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 54
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 55
    if-eqz p1, :cond_1

    move-object v1, p1

    .line 126
    .local v1, "it":Lkotlin/jvm/functions/Function0;
    const/4 v2, 0x0

    .line 55
    .local v2, "$i$a$-let-FocusTransactionManager$withNewTransaction$1":I
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getCancellationListener$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v3

    .local v3, "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v4, 0x0

    .line 127
    .local v4, "$i$f$plusAssign":I
    invoke-virtual {v3, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 128
    nop

    .line 55
    .end local v3    # "this_$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v4    # "$i$f$plusAssign":I
    nop

    .line 56
    .end local v1    # "it":Lkotlin/jvm/functions/Function0;
    .end local v2    # "$i$a$-let-FocusTransactionManager$withNewTransaction$1":I
    :cond_1
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 59
    return-object v1

    .line 58
    :catchall_0
    move-exception v1

    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw v1
.end method
