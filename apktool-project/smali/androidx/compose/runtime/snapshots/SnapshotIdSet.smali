.class public final Landroidx/compose/runtime/snapshots/SnapshotIdSet;
.super Ljava/lang/Object;
.source "SnapshotIdSet.kt"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Long;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n274#1,7:318\n281#1,15:329\n276#1:344\n274#1,7:345\n281#1,15:356\n276#1:371\n274#1,7:372\n281#1,15:383\n276#1:398\n274#1,7:399\n281#1,15:410\n276#1:425\n274#1,7:426\n281#1,15:437\n276#1:452\n280#1:453\n281#1,15:458\n1#2:316\n143#3:317\n83#3,4:325\n83#3,4:352\n83#3,4:379\n83#3,4:406\n83#3,4:433\n83#3,4:454\n83#3,4:473\n68#3:477\n1549#4:478\n1620#4,3:479\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n198#1:318,7\n198#1:329,15\n198#1:344\n218#1:345,7\n218#1:356,15\n218#1:371\n222#1:372,7\n222#1:383,15\n222#1:398\n242#1:399,7\n242#1:410,15\n242#1:425\n245#1:426,7\n245#1:437,15\n245#1:452\n275#1:453\n275#1:458,15\n131#1:317\n198#1:325,4\n218#1:352,4\n222#1:379,4\n242#1:406,4\n245#1:433,4\n275#1:454,4\n280#1:473,4\n299#1:477\n306#1:478\n306#1:479,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 &2\u000c\u0012\u0008\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001&B3\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0008j\u0004\u0018\u0001`\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0000J\u0012\u0010\u000e\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J>\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002+\u0010\u0012\u001a\'\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0008\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00000\u0013H\u0082\u0008J!\u0010\u0017\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\u0008\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00180\u001aH\u0086\u0008J\u0012\u0010\u001b\u001a\u00020\u001c2\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\u0013\u0010\u001d\u001a\u000c\u0012\u0008\u0012\u00060\u0002j\u0002`\u00030\u001eH\u0096\u0002J\u0016\u0010\u001f\u001a\u00060\u0002j\u0002`\u00032\n\u0010 \u001a\u00060\u0002j\u0002`\u0003J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000J\u0012\u0010#\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\u0008\u0010$\u001a\u00020%H\u0016R\u0016\u0010\u0007\u001a\n\u0018\u00010\u0008j\u0004\u0018\u0001`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
        "",
        "",
        "Landroidx/compose/runtime/snapshots/SnapshotId;",
        "upperSet",
        "lowerSet",
        "lowerBound",
        "belowBound",
        "",
        "Landroidx/compose/runtime/snapshots/SnapshotIdArray;",
        "(JJJ[J)V",
        "and",
        "ids",
        "andNot",
        "clear",
        "id",
        "fastFold",
        "initial",
        "operation",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "acc",
        "fastForEach",
        "",
        "block",
        "Lkotlin/Function1;",
        "get",
        "",
        "iterator",
        "",
        "lowest",
        "default",
        "or",
        "bits",
        "set",
        "toString",
        "",
        "Companion",
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

.field public static final Companion:Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;

.field private static final EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;


# instance fields
.field private final belowBound:[J

.field private final lowerBound:J

.field private final lowerSet:J

.field private final upperSet:J


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->Companion:Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;

    .line 312
    new-instance v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-direct/range {v2 .. v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    sput-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    return-void
.end method

.method private constructor <init>(JJJ[J)V
    .locals 0
    .param p1, "upperSet"    # J
    .param p3, "lowerSet"    # J
    .param p5, "lowerBound"    # J
    .param p7, "belowBound"    # [J

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-wide p1, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 45
    iput-wide p3, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 48
    iput-wide p5, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 50
    iput-object p7, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 41
    return-void
.end method

.method public static final synthetic access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 39
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    return-object v0
.end method

.method public static final synthetic access$getEMPTY$cp()Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 1

    .line 39
    sget-object v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    return-object v0
.end method

.method public static final synthetic access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 39
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    return-wide v0
.end method

.method public static final synthetic access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 39
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    return-wide v0
.end method

.method public static final synthetic access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 39
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    return-wide v0
.end method

.method private final fastFold(Landroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 15
    .param p1, "initial"    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .param p2, "operation"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
            "-",
            "Ljava/lang/Long;",
            "Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
            ">;)",
            "Landroidx/compose/runtime/snapshots/SnapshotIdSet;"
        }
    .end annotation

    move-object/from16 v0, p2

    const/4 v1, 0x0

    .line 274
    .local v1, "$i$f$fastFold":I
    const/4 v2, 0x0

    .local v2, "accumulator":Ljava/lang/Object;
    move-object/from16 v2, p1

    .line 275
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v4, 0x0

    .line 453
    .local v4, "$i$f$fastForEach":I
    invoke-static {v3}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    move-result-object v5

    if-eqz v5, :cond_1

    .local v5, "$this$forEach$iv$iv":[J
    const/4 v6, 0x0

    .line 454
    .local v6, "$i$f$forEach":I
    array-length v7, v5

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    aget-wide v9, v5, v8

    .line 455
    .local v9, "value$iv$iv":J
    move-wide v11, v9

    .local v11, "element":J
    const/4 v13, 0x0

    .line 275
    .local v13, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1":I
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-interface {v0, v2, v14}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 455
    .end local v11    # "element":J
    .end local v13    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1":I
    nop

    .line 454
    .end local v9    # "value$iv$iv":J
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 457
    :cond_0
    nop

    .line 458
    .end local v5    # "$this$forEach$iv$iv":[J
    .end local v6    # "$i$f$forEach":I
    :cond_1
    invoke-static {v3}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    const-wide/16 v9, 0x1

    const/16 v6, 0x40

    if-eqz v5, :cond_3

    .line 459
    const/4 v5, 0x0

    .local v5, "index$iv":I
    :goto_1
    if-ge v5, v6, :cond_3

    .line 460
    invoke-static {v3}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v11

    shl-long v13, v9, v5

    and-long/2addr v11, v13

    cmp-long v11, v11, v7

    if-eqz v11, :cond_2

    .line 461
    invoke-static {v3}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v11

    int-to-long v13, v5

    add-long/2addr v11, v13

    .restart local v11    # "element":J
    const/4 v13, 0x0

    .line 275
    .restart local v13    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1":I
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-interface {v0, v2, v14}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 461
    .end local v11    # "element":J
    .end local v13    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1":I
    nop

    .line 459
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 465
    .end local v5    # "index$iv":I
    :cond_3
    invoke-static {v3}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v11

    cmp-long v5, v11, v7

    if-eqz v5, :cond_5

    .line 466
    const/4 v5, 0x0

    .restart local v5    # "index$iv":I
    :goto_2
    if-ge v5, v6, :cond_5

    .line 467
    invoke-static {v3}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v11

    shl-long v13, v9, v5

    and-long/2addr v11, v13

    cmp-long v11, v11, v7

    if-eqz v11, :cond_4

    .line 468
    invoke-static {v3}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v11

    int-to-long v13, v5

    add-long/2addr v11, v13

    const-wide/16 v13, 0x40

    add-long/2addr v11, v13

    .restart local v11    # "element":J
    const/4 v13, 0x0

    .line 275
    .restart local v13    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1":I
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-interface {v0, v2, v14}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 468
    .end local v11    # "element":J
    .end local v13    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1":I
    nop

    .line 466
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 472
    .end local v5    # "index$iv":I
    :cond_5
    nop

    .line 276
    .end local v3    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v4    # "$i$f$fastForEach":I
    move-object v3, v2

    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    return-object v3
.end method


# virtual methods
.method public final and(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 30
    .param p1, "ids"    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 203
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    return-object v2

    .line 204
    :cond_0
    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    return-object v2

    .line 205
    :cond_1
    iget-wide v2, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    iget-wide v4, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    cmp-long v2, v2, v4

    const-wide/16 v3, 0x0

    if-nez v2, :cond_3

    iget-object v2, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    if-ne v2, v5, :cond_3

    .line 206
    iget-wide v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    iget-wide v7, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    and-long/2addr v5, v7

    .line 207
    .local v5, "newUpper":J
    iget-wide v7, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    iget-wide v9, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    and-long/2addr v7, v9

    .line 208
    .local v7, "newLower":J
    cmp-long v2, v5, v3

    if-nez v2, :cond_2

    cmp-long v2, v7, v3

    if-nez v2, :cond_2

    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    if-nez v2, :cond_2

    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    goto/16 :goto_9

    .line 210
    :cond_2
    new-instance v9, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 211
    iget-wide v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    iget-wide v10, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    and-long/2addr v10, v2

    .line 212
    iget-wide v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    iget-wide v12, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    and-long/2addr v12, v2

    .line 213
    iget-wide v14, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 214
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 210
    move-object/from16 v16, v2

    invoke-direct/range {v9 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    move-object v2, v9

    .end local v5    # "newUpper":J
    .end local v7    # "newLower":J
    goto/16 :goto_9

    .line 217
    :cond_3
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    const/4 v7, 0x0

    const/16 v10, 0x40

    if-nez v2, :cond_d

    .line 218
    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .local v2, "initial$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-object/from16 v11, p0

    .local v11, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v12, 0x0

    .line 345
    .local v12, "$i$f$fastFold":I
    const/4 v13, 0x0

    .local v13, "accumulator$iv":Ljava/lang/Object;
    move-object v13, v2

    .line 346
    move-object v14, v11

    .local v14, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v15, 0x0

    .line 351
    .local v15, "$i$f$fastForEach":I
    invoke-static {v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    move-result-object v16

    if-eqz v16, :cond_6

    move-object/from16 v17, v16

    .local v17, "$this$forEach$iv$iv$iv":[J
    const/16 v16, 0x0

    .line 352
    .local v16, "$i$f$forEach":I
    move-wide/from16 v18, v3

    move-object/from16 v3, v17

    .end local v17    # "$this$forEach$iv$iv$iv":[J
    .local v3, "$this$forEach$iv$iv$iv":[J
    array-length v4, v3

    :goto_0
    if-ge v7, v4, :cond_5

    aget-wide v20, v3, v7

    .line 353
    .local v20, "value$iv$iv$iv":J
    move-wide/from16 v22, v20

    .local v22, "element$iv":J
    const/16 v17, 0x0

    .line 346
    .local v17, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object/from16 v24, v13

    .local v24, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide/from16 v25, v22

    .local v25, "index":J
    move-object/from16 v27, v24

    .end local v24    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v27, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/16 v24, 0x0

    .line 219
    .local v24, "$i$a$-fastFold-SnapshotIdSet$and$1":I
    move-wide/from16 v5, v25

    const-wide/16 v28, 0x40

    .end local v25    # "index":J
    .local v5, "index":J
    invoke-virtual {v1, v5, v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    move-result v25

    if-eqz v25, :cond_4

    move-object/from16 v8, v27

    const-wide/16 v25, 0x1

    .end local v27    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v8, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    invoke-virtual {v8, v5, v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v27

    goto :goto_1

    .end local v8    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .restart local v27    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    :cond_4
    move-object/from16 v8, v27

    const-wide/16 v25, 0x1

    .line 346
    .end local v5    # "index":J
    .end local v24    # "$i$a$-fastFold-SnapshotIdSet$and$1":I
    .end local v27    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    :goto_1
    move-object/from16 v13, v27

    .line 353
    .end local v17    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    .end local v22    # "element$iv":J
    nop

    .line 352
    .end local v20    # "value$iv$iv$iv":J
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 355
    :cond_5
    const-wide/16 v25, 0x1

    const-wide/16 v28, 0x40

    .end local v3    # "$this$forEach$iv$iv$iv":[J
    .end local v16    # "$i$f$forEach":I
    goto :goto_2

    .line 351
    :cond_6
    move-wide/from16 v18, v3

    const-wide/16 v25, 0x1

    const-wide/16 v28, 0x40

    .line 356
    :goto_2
    invoke-static {v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v3

    cmp-long v3, v3, v18

    if-eqz v3, :cond_9

    .line 357
    const/4 v3, 0x0

    .local v3, "index$iv$iv":I
    :goto_3
    if-ge v3, v10, :cond_9

    .line 358
    invoke-static {v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v4

    shl-long v6, v25, v3

    and-long/2addr v4, v6

    cmp-long v4, v4, v18

    if-eqz v4, :cond_8

    .line 359
    invoke-static {v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v4

    int-to-long v6, v3

    add-long/2addr v4, v6

    .local v4, "element$iv":J
    const/4 v6, 0x0

    .line 346
    .local v6, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v7, v13

    .local v7, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v8, v4

    .local v8, "index":J
    const/16 v16, 0x0

    .line 219
    .local v16, "$i$a$-fastFold-SnapshotIdSet$and$1":I
    invoke-virtual {v1, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    move-result v17

    if-eqz v17, :cond_7

    invoke-virtual {v7, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v17

    move-object/from16 v7, v17

    .line 346
    .end local v7    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v8    # "index":J
    .end local v16    # "$i$a$-fastFold-SnapshotIdSet$and$1":I
    :cond_7
    move-object v13, v7

    .line 359
    .end local v4    # "element$iv":J
    .end local v6    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    nop

    .line 357
    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 363
    .end local v3    # "index$iv$iv":I
    :cond_9
    invoke-static {v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v3

    cmp-long v3, v3, v18

    if-eqz v3, :cond_c

    .line 364
    const/4 v3, 0x0

    .restart local v3    # "index$iv$iv":I
    :goto_4
    if-ge v3, v10, :cond_c

    .line 365
    invoke-static {v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v4

    shl-long v6, v25, v3

    and-long/2addr v4, v6

    cmp-long v4, v4, v18

    if-eqz v4, :cond_b

    .line 366
    invoke-static {v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v4

    int-to-long v6, v3

    add-long/2addr v4, v6

    add-long v4, v4, v28

    .restart local v4    # "element$iv":J
    const/4 v6, 0x0

    .line 346
    .restart local v6    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v7, v13

    .restart local v7    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v8, v4

    .restart local v8    # "index":J
    const/16 v16, 0x0

    .line 219
    .restart local v16    # "$i$a$-fastFold-SnapshotIdSet$and$1":I
    invoke-virtual {v1, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    move-result v17

    if-eqz v17, :cond_a

    invoke-virtual {v7, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v17

    move-object/from16 v7, v17

    .line 346
    .end local v7    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v8    # "index":J
    .end local v16    # "$i$a$-fastFold-SnapshotIdSet$and$1":I
    :cond_a
    nop

    .line 366
    .end local v4    # "element$iv":J
    .end local v6    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    .end local v13    # "accumulator$iv":Ljava/lang/Object;
    .local v7, "accumulator$iv":Ljava/lang/Object;
    move-object v13, v7

    .line 364
    .end local v7    # "accumulator$iv":Ljava/lang/Object;
    .restart local v13    # "accumulator$iv":Ljava/lang/Object;
    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 370
    .end local v3    # "index$iv$iv":I
    :cond_c
    nop

    .line 371
    .end local v14    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v15    # "$i$f$fastForEach":I
    move-object v2, v13

    .end local v2    # "initial$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v11    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v12    # "$i$f$fastFold":I
    .end local v13    # "accumulator$iv":Ljava/lang/Object;
    goto/16 :goto_9

    .line 222
    :cond_d
    move-wide/from16 v18, v3

    const-wide/16 v25, 0x1

    const-wide/16 v28, 0x40

    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .restart local v2    # "initial$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-object/from16 v3, p1

    .local v3, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v4, 0x0

    .line 372
    .local v4, "$i$f$fastFold":I
    const/4 v5, 0x0

    .local v5, "accumulator$iv":Ljava/lang/Object;
    move-object v5, v2

    .line 373
    move-object v6, v3

    .local v6, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v8, 0x0

    .line 378
    .local v8, "$i$f$fastForEach":I
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    move-result-object v9

    if-eqz v9, :cond_10

    .local v9, "$this$forEach$iv$iv$iv":[J
    const/4 v11, 0x0

    .line 379
    .local v11, "$i$f$forEach":I
    array-length v12, v9

    :goto_5
    if-ge v7, v12, :cond_f

    aget-wide v13, v9, v7

    .line 380
    .local v13, "value$iv$iv$iv":J
    move-wide v15, v13

    .local v15, "element$iv":J
    const/16 v17, 0x0

    .line 373
    .restart local v17    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object/from16 v20, v5

    .local v20, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide/from16 v21, v15

    .local v21, "index":J
    move-object/from16 v23, v20

    .end local v20    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v23, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/16 v20, 0x0

    .line 223
    .local v20, "$i$a$-fastFold-SnapshotIdSet$and$2":I
    move/from16 v27, v11

    move-wide/from16 v10, v21

    .end local v11    # "$i$f$forEach":I
    .end local v21    # "index":J
    .local v10, "index":J
    .local v27, "$i$f$forEach":I
    invoke-virtual {v0, v10, v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    move-result v21

    if-eqz v21, :cond_e

    move-object/from16 v1, v23

    .end local v23    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v1, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    invoke-virtual {v1, v10, v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v23

    goto :goto_6

    .end local v1    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .restart local v23    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    :cond_e
    move-object/from16 v1, v23

    .line 373
    .end local v10    # "index":J
    .end local v20    # "$i$a$-fastFold-SnapshotIdSet$and$2":I
    .end local v23    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    :goto_6
    move-object/from16 v5, v23

    .line 380
    .end local v15    # "element$iv":J
    .end local v17    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    nop

    .line 379
    .end local v13    # "value$iv$iv$iv":J
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p1

    move/from16 v11, v27

    const/16 v10, 0x40

    goto :goto_5

    .line 382
    .end local v27    # "$i$f$forEach":I
    .restart local v11    # "$i$f$forEach":I
    :cond_f
    move/from16 v27, v11

    .line 383
    .end local v9    # "$this$forEach$iv$iv$iv":[J
    .end local v11    # "$i$f$forEach":I
    :cond_10
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v9

    cmp-long v1, v9, v18

    if-eqz v1, :cond_13

    .line 384
    const/4 v1, 0x0

    .local v1, "index$iv$iv":I
    :goto_7
    const/16 v7, 0x40

    if-ge v1, v7, :cond_13

    .line 385
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v9

    shl-long v11, v25, v1

    and-long/2addr v9, v11

    cmp-long v7, v9, v18

    if-eqz v7, :cond_12

    .line 386
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v9

    int-to-long v11, v1

    add-long/2addr v9, v11

    .local v9, "element$iv":J
    const/4 v7, 0x0

    .line 373
    .local v7, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v11, v5

    .local v11, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v12, v9

    .local v12, "index":J
    const/4 v14, 0x0

    .line 223
    .local v14, "$i$a$-fastFold-SnapshotIdSet$and$2":I
    invoke-virtual {v0, v12, v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    move-result v15

    if-eqz v15, :cond_11

    invoke-virtual {v11, v12, v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v15

    move-object v11, v15

    .line 373
    .end local v11    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v12    # "index":J
    .end local v14    # "$i$a$-fastFold-SnapshotIdSet$and$2":I
    :cond_11
    move-object v5, v11

    .line 386
    .end local v7    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    .end local v9    # "element$iv":J
    nop

    .line 384
    :cond_12
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 390
    .end local v1    # "index$iv$iv":I
    :cond_13
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v9

    cmp-long v1, v9, v18

    if-eqz v1, :cond_16

    .line 391
    const/4 v1, 0x0

    .restart local v1    # "index$iv$iv":I
    :goto_8
    const/16 v7, 0x40

    if-ge v1, v7, :cond_16

    .line 392
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v9

    shl-long v11, v25, v1

    and-long/2addr v9, v11

    cmp-long v9, v9, v18

    if-eqz v9, :cond_15

    .line 393
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v9

    int-to-long v11, v1

    add-long/2addr v9, v11

    add-long v9, v9, v28

    .restart local v9    # "element$iv":J
    const/4 v11, 0x0

    .line 373
    .local v11, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v12, v5

    .local v12, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v13, v9

    .local v13, "index":J
    const/4 v15, 0x0

    .line 223
    .local v15, "$i$a$-fastFold-SnapshotIdSet$and$2":I
    invoke-virtual {v0, v13, v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    move-result v16

    if-eqz v16, :cond_14

    invoke-virtual {v12, v13, v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v16

    move-object/from16 v12, v16

    .line 373
    .end local v12    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v13    # "index":J
    .end local v15    # "$i$a$-fastFold-SnapshotIdSet$and$2":I
    :cond_14
    nop

    .line 393
    .end local v5    # "accumulator$iv":Ljava/lang/Object;
    .end local v9    # "element$iv":J
    .end local v11    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    .local v12, "accumulator$iv":Ljava/lang/Object;
    move-object v5, v12

    .line 391
    .end local v12    # "accumulator$iv":Ljava/lang/Object;
    .restart local v5    # "accumulator$iv":Ljava/lang/Object;
    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 397
    .end local v1    # "index$iv$iv":I
    :cond_16
    nop

    .line 398
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v8    # "$i$f$fastForEach":I
    move-object v2, v5

    .line 205
    .end local v2    # "initial$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v3    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v4    # "$i$f$fastFold":I
    .end local v5    # "accumulator$iv":Ljava/lang/Object;
    :goto_9
    return-object v2
.end method

.method public final andNot(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 20
    .param p1, "ids"    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 188
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    if-ne v1, v2, :cond_0

    return-object v0

    .line 189
    :cond_0
    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    if-ne v0, v2, :cond_1

    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    return-object v2

    .line 190
    :cond_1
    iget-wide v2, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    iget-wide v4, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-object v2, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    iget-object v3, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    if-ne v2, v3, :cond_2

    .line 191
    new-instance v4, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 192
    iget-wide v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    iget-wide v5, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    not-long v5, v5

    and-long/2addr v5, v2

    .line 193
    iget-wide v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    iget-wide v7, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    not-long v7, v7

    and-long/2addr v7, v2

    .line 194
    iget-wide v9, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 195
    iget-object v11, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 191
    invoke-direct/range {v4 .. v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    goto/16 :goto_4

    .line 198
    :cond_2
    move-object/from16 v2, p1

    .local v2, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v3, 0x0

    .line 318
    .local v3, "$i$f$fastFold":I
    const/4 v4, 0x0

    .local v4, "accumulator$iv":Ljava/lang/Object;
    move-object/from16 v4, p0

    .line 319
    move-object v5, v2

    .local v5, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v6, 0x0

    .line 324
    .local v6, "$i$f$fastForEach":I
    invoke-static {v5}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    move-result-object v7

    if-eqz v7, :cond_4

    .local v7, "$this$forEach$iv$iv$iv":[J
    const/4 v8, 0x0

    .line 325
    .local v8, "$i$f$forEach":I
    array-length v9, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_3

    aget-wide v11, v7, v10

    .line 326
    .local v11, "value$iv$iv$iv":J
    move-wide v13, v11

    .local v13, "element$iv":J
    const/4 v15, 0x0

    .line 319
    .local v15, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object/from16 v16, v4

    check-cast v16, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .local v16, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide/from16 v17, v13

    .local v17, "index":J
    move-object/from16 v19, v16

    .end local v16    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v19, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/16 v16, 0x0

    .line 198
    .local v16, "$i$a$-fastFold-SnapshotIdSet$andNot$1":I
    move-wide/from16 v0, v17

    move-object/from16 v17, v2

    move-object/from16 v2, v19

    .end local v19    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v0, "index":J
    .local v2, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v17, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    invoke-virtual {v2, v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->clear(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v0

    .line 319
    .end local v0    # "index":J
    .end local v2    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v16    # "$i$a$-fastFold-SnapshotIdSet$andNot$1":I
    move-object v4, v0

    .line 326
    .end local v13    # "element$iv":J
    .end local v15    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    nop

    .line 325
    .end local v11    # "value$iv$iv$iv":J
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    goto :goto_0

    .line 328
    .end local v17    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v2, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    :cond_3
    move-object/from16 v17, v2

    .end local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v7    # "$this$forEach$iv$iv$iv":[J
    .end local v8    # "$i$f$forEach":I
    .restart local v17    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    goto :goto_1

    .line 324
    .end local v17    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .restart local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    :cond_4
    move-object/from16 v17, v2

    .line 329
    .end local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .restart local v17    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    :goto_1
    invoke-static {v5}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v0

    const-wide/16 v7, 0x0

    cmp-long v0, v0, v7

    const-wide/16 v1, 0x1

    const/16 v9, 0x40

    if-eqz v0, :cond_6

    .line 330
    const/4 v0, 0x0

    .local v0, "index$iv$iv":I
    :goto_2
    if-ge v0, v9, :cond_6

    .line 331
    invoke-static {v5}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v10

    shl-long v12, v1, v0

    and-long/2addr v10, v12

    cmp-long v10, v10, v7

    if-eqz v10, :cond_5

    .line 332
    invoke-static {v5}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v10

    int-to-long v12, v0

    add-long/2addr v10, v12

    .local v10, "element$iv":J
    const/4 v12, 0x0

    .line 319
    .local v12, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v13, v4

    check-cast v13, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .local v13, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v14, v10

    .local v14, "index":J
    const/16 v16, 0x0

    .line 198
    .restart local v16    # "$i$a$-fastFold-SnapshotIdSet$andNot$1":I
    invoke-virtual {v13, v14, v15}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->clear(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v13

    .line 319
    .end local v13    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v14    # "index":J
    .end local v16    # "$i$a$-fastFold-SnapshotIdSet$andNot$1":I
    move-object v4, v13

    .line 332
    .end local v10    # "element$iv":J
    .end local v12    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    nop

    .line 330
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 336
    .end local v0    # "index$iv$iv":I
    :cond_6
    invoke-static {v5}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v10

    cmp-long v0, v10, v7

    if-eqz v0, :cond_8

    .line 337
    const/4 v0, 0x0

    .restart local v0    # "index$iv$iv":I
    :goto_3
    if-ge v0, v9, :cond_8

    .line 338
    invoke-static {v5}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v10

    shl-long v12, v1, v0

    and-long/2addr v10, v12

    cmp-long v10, v10, v7

    if-eqz v10, :cond_7

    .line 339
    invoke-static {v5}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v10

    int-to-long v12, v0

    add-long/2addr v10, v12

    const-wide/16 v12, 0x40

    add-long/2addr v10, v12

    .restart local v10    # "element$iv":J
    const/4 v12, 0x0

    .line 319
    .restart local v12    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v13, v4

    check-cast v13, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .restart local v13    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v14, v10

    .restart local v14    # "index":J
    const/16 v16, 0x0

    .line 198
    .restart local v16    # "$i$a$-fastFold-SnapshotIdSet$andNot$1":I
    invoke-virtual {v13, v14, v15}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->clear(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v13

    .line 319
    .end local v13    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v14    # "index":J
    .end local v16    # "$i$a$-fastFold-SnapshotIdSet$andNot$1":I
    move-object v4, v13

    .line 339
    .end local v10    # "element$iv":J
    .end local v12    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    nop

    .line 337
    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 343
    .end local v0    # "index$iv$iv":I
    :cond_8
    nop

    .line 344
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v6    # "$i$f$fastForEach":I
    move-object v0, v4

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-object v4, v0

    .line 190
    .end local v3    # "$i$f$fastFold":I
    .end local v4    # "accumulator$iv":Ljava/lang/Object;
    .end local v17    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    :goto_4
    return-object v4
.end method

.method public final clear(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 17
    .param p1, "id"    # J

    .line 147
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-wide v3, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    sub-long v3, v1, v3

    .line 148
    .local v3, "offset":J
    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    const-wide/16 v8, 0x1

    const-wide/16 v10, 0x40

    if-ltz v7, :cond_0

    cmp-long v7, v3, v10

    if-gez v7, :cond_0

    .line 149
    long-to-int v7, v3

    shl-long v7, v8, v7

    .line 150
    .local v7, "mask":J
    iget-wide v9, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    and-long/2addr v9, v7

    cmp-long v5, v9, v5

    if-eqz v5, :cond_2

    .line 151
    new-instance v9, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 152
    iget-wide v10, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 153
    iget-wide v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    not-long v12, v7

    and-long/2addr v12, v5

    .line 154
    iget-wide v14, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 155
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 151
    move-object/from16 v16, v5

    invoke-direct/range {v9 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    return-object v9

    .line 158
    .end local v7    # "mask":J
    :cond_0
    cmp-long v7, v3, v10

    if-ltz v7, :cond_1

    const-wide/16 v10, 0x80

    cmp-long v7, v3, v10

    if-gez v7, :cond_1

    .line 159
    long-to-int v7, v3

    add-int/lit8 v7, v7, -0x40

    shl-long v7, v8, v7

    .line 160
    .restart local v7    # "mask":J
    iget-wide v9, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    and-long/2addr v9, v7

    cmp-long v5, v9, v5

    if-eqz v5, :cond_2

    .line 161
    new-instance v9, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 162
    iget-wide v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    not-long v10, v7

    and-long/2addr v10, v5

    .line 163
    iget-wide v12, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 164
    iget-wide v14, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 165
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 161
    move-object/from16 v16, v5

    invoke-direct/range {v9 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    return-object v9

    .line 168
    .end local v7    # "mask":J
    :cond_1
    cmp-long v5, v3, v5

    if-gez v5, :cond_2

    .line 169
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 170
    .local v5, "array":[J
    if-eqz v5, :cond_2

    .line 171
    invoke-static {v5, v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->binarySearch([JJ)I

    move-result v6

    .line 172
    .local v6, "location":I
    if-ltz v6, :cond_2

    .line 173
    new-instance v7, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 174
    iget-wide v8, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 175
    iget-wide v10, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 176
    iget-wide v12, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 177
    invoke-static {v5, v6}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->withIdRemovedAt([JI)[J

    move-result-object v14

    .line 173
    invoke-direct/range {v7 .. v14}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    return-object v7

    .line 183
    .end local v5    # "array":[J
    .end local v6    # "location":I
    :cond_2
    return-object v0
.end method

.method public final fastForEach(Lkotlin/jvm/functions/Function1;)V
    .locals 11
    .param p1, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 280
    .local v0, "$i$f$fastForEach":I
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    move-result-object v1

    if-eqz v1, :cond_1

    .local v1, "$this$forEach$iv":[J
    const/4 v2, 0x0

    .line 473
    .local v2, "$i$f$forEach":I
    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-wide v5, v1, v4

    .line 474
    .local v5, "value$iv":J
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {p1, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .end local v5    # "value$iv":J
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 476
    :cond_0
    nop

    .line 281
    .end local v1    # "$this$forEach$iv":[J
    .end local v2    # "$i$f$forEach":I
    :cond_1
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const-wide/16 v5, 0x1

    const/16 v2, 0x40

    if-eqz v1, :cond_3

    .line 282
    const/4 v1, 0x0

    .local v1, "index":I
    :goto_1
    if-ge v1, v2, :cond_3

    .line 283
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v7

    shl-long v9, v5, v1

    and-long/2addr v7, v9

    cmp-long v7, v7, v3

    if-eqz v7, :cond_2

    .line 284
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v7

    int-to-long v9, v1

    add-long/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {p1, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 288
    .end local v1    # "index":I
    :cond_3
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v7

    cmp-long v1, v7, v3

    if-eqz v1, :cond_5

    .line 289
    const/4 v1, 0x0

    .restart local v1    # "index":I
    :goto_2
    if-ge v1, v2, :cond_5

    .line 290
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v7

    shl-long v9, v5, v1

    and-long/2addr v7, v9

    cmp-long v7, v7, v3

    if-eqz v7, :cond_4

    .line 291
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v7

    int-to-long v9, v1

    add-long/2addr v7, v9

    const-wide/16 v9, 0x40

    add-long/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {p1, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 295
    .end local v1    # "index":I
    :cond_5
    return-void
.end method

.method public final get(J)Z
    .locals 11
    .param p1, "id"    # J

    .line 55
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    sub-long v0, p1, v0

    .line 56
    .local v0, "offset":J
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    const-wide/16 v5, 0x1

    const-wide/16 v7, 0x40

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-ltz v4, :cond_1

    cmp-long v4, v0, v7

    if-gez v4, :cond_1

    .line 57
    long-to-int v4, v0

    shl-long v4, v5, v4

    iget-wide v6, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    and-long/2addr v4, v6

    cmp-long v2, v4, v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v9, v10

    goto :goto_0

    .line 58
    :cond_1
    cmp-long v4, v0, v7

    if-ltz v4, :cond_3

    const-wide/16 v7, 0x80

    cmp-long v4, v0, v7

    if-gez v4, :cond_3

    .line 59
    long-to-int v4, v0

    add-int/lit8 v4, v4, -0x40

    shl-long v4, v5, v4

    iget-wide v6, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    and-long/2addr v4, v6

    cmp-long v2, v4, v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v9, v10

    goto :goto_0

    .line 60
    :cond_3
    cmp-long v2, v0, v2

    if-lez v2, :cond_4

    .line 61
    move v9, v10

    goto :goto_0

    .line 62
    :cond_4
    iget-object v2, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    if-eqz v2, :cond_6

    .line 316
    .local v2, "it":[J
    const/4 v3, 0x0

    .line 62
    .local v3, "$i$a$-let-SnapshotIdSet$get$1":I
    invoke-static {v2, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->binarySearch([JJ)I

    move-result v4

    if-ltz v4, :cond_5

    goto :goto_0

    :cond_5
    move v9, v10

    goto :goto_0

    .end local v2    # "it":[J
    .end local v3    # "$i$a$-let-SnapshotIdSet$get$1":I
    :cond_6
    move v9, v10

    .line 56
    :goto_0
    return v9
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 251
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1;-><init>(Landroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequence(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 268
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final lowest(J)J
    .locals 5
    .param p1, "default"    # J

    .line 298
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 299
    .local v0, "belowBound":[J
    if-eqz v0, :cond_0

    move-object v1, v0

    .local v1, "$this$first$iv":[J
    const/4 v2, 0x0

    .line 477
    .local v2, "$i$f$first":I
    const/4 v3, 0x0

    aget-wide v2, v1, v3

    .line 299
    .end local v1    # "$this$first$iv":[J
    .end local v2    # "$i$f$first":I
    return-wide v2

    .line 300
    :cond_0
    iget-wide v1, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    iget-wide v1, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    iget-wide v3, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    invoke-static {v3, v4}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    return-wide v1

    .line 301
    :cond_1
    iget-wide v1, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2

    iget-wide v1, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    const-wide/16 v3, 0x40

    add-long/2addr v1, v3

    iget-wide v3, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    invoke-static {v3, v4}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    return-wide v1

    .line 302
    :cond_2
    return-wide p1
.end method

.method public final or(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 29
    .param p1, "bits"    # Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 230
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    if-ne v1, v2, :cond_0

    return-object v0

    .line 231
    :cond_0
    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    if-ne v0, v2, :cond_1

    return-object v1

    .line 232
    :cond_1
    iget-wide v2, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    iget-wide v4, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-object v2, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    iget-object v3, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    if-ne v2, v3, :cond_2

    .line 233
    new-instance v4, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 234
    iget-wide v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    iget-wide v5, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    or-long/2addr v5, v2

    .line 235
    iget-wide v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    iget-wide v7, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    or-long/2addr v7, v2

    .line 236
    iget-wide v9, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 237
    iget-object v11, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 233
    invoke-direct/range {v4 .. v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    goto/16 :goto_8

    .line 240
    :cond_2
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    const/4 v5, 0x0

    const/16 v8, 0x40

    if-nez v2, :cond_a

    .line 242
    move-object/from16 v2, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v11, 0x0

    .line 399
    .local v11, "$i$f$fastFold":I
    const/4 v12, 0x0

    .local v12, "accumulator$iv":Ljava/lang/Object;
    move-object/from16 v12, p1

    .line 400
    move-object v13, v2

    .local v13, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v14, 0x0

    .line 405
    .local v14, "$i$f$fastForEach":I
    invoke-static {v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    move-result-object v15

    if-eqz v15, :cond_4

    .local v15, "$this$forEach$iv$iv$iv":[J
    const/16 v16, 0x0

    .line 406
    .local v16, "$i$f$forEach":I
    const-wide/16 v17, 0x40

    array-length v3, v15

    :goto_0
    if-ge v5, v3, :cond_3

    aget-wide v19, v15, v5

    .line 407
    .local v19, "value$iv$iv$iv":J
    move-wide/from16 v21, v19

    .local v21, "element$iv":J
    const/4 v4, 0x0

    .line 400
    .local v4, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object/from16 v23, v12

    .local v23, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide/from16 v24, v21

    .local v24, "index":J
    move-object/from16 v26, v23

    .end local v23    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v26, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/16 v23, 0x0

    .line 242
    .local v23, "$i$a$-fastFold-SnapshotIdSet$or$1":I
    move-wide/from16 v6, v24

    move-object/from16 v9, v26

    const-wide/16 v24, 0x0

    const-wide/16 v27, 0x1

    .end local v24    # "index":J
    .end local v26    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v6, "index":J
    .local v9, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    invoke-virtual {v9, v6, v7}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v6

    .line 400
    .end local v6    # "index":J
    .end local v9    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v23    # "$i$a$-fastFold-SnapshotIdSet$or$1":I
    move-object v12, v6

    .line 407
    .end local v4    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    .end local v21    # "element$iv":J
    nop

    .line 406
    .end local v19    # "value$iv$iv$iv":J
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 409
    :cond_3
    const-wide/16 v24, 0x0

    const-wide/16 v27, 0x1

    .end local v15    # "$this$forEach$iv$iv$iv":[J
    .end local v16    # "$i$f$forEach":I
    goto :goto_1

    .line 405
    :cond_4
    const-wide/16 v17, 0x40

    const-wide/16 v24, 0x0

    const-wide/16 v27, 0x1

    .line 410
    :goto_1
    invoke-static {v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v3

    cmp-long v3, v3, v24

    if-eqz v3, :cond_6

    .line 411
    const/4 v3, 0x0

    .local v3, "index$iv$iv":I
    :goto_2
    if-ge v3, v8, :cond_6

    .line 412
    invoke-static {v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v4

    shl-long v6, v27, v3

    and-long/2addr v4, v6

    cmp-long v4, v4, v24

    if-eqz v4, :cond_5

    .line 413
    invoke-static {v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v4

    int-to-long v6, v3

    add-long/2addr v4, v6

    .local v4, "element$iv":J
    const/4 v6, 0x0

    .line 400
    .local v6, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v7, v12

    .local v7, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v9, v4

    .local v9, "index":J
    const/4 v15, 0x0

    .line 242
    .local v15, "$i$a$-fastFold-SnapshotIdSet$or$1":I
    invoke-virtual {v7, v9, v10}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v7

    .line 400
    .end local v7    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v9    # "index":J
    .end local v15    # "$i$a$-fastFold-SnapshotIdSet$or$1":I
    move-object v12, v7

    .line 413
    .end local v4    # "element$iv":J
    .end local v6    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    nop

    .line 411
    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 417
    .end local v3    # "index$iv$iv":I
    :cond_6
    invoke-static {v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v3

    cmp-long v3, v3, v24

    if-eqz v3, :cond_9

    .line 418
    const/4 v3, 0x0

    .restart local v3    # "index$iv$iv":I
    :goto_3
    if-ge v3, v8, :cond_8

    .line 419
    invoke-static {v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v4

    shl-long v6, v27, v3

    and-long/2addr v4, v6

    cmp-long v4, v4, v24

    if-eqz v4, :cond_7

    .line 420
    invoke-static {v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v4

    int-to-long v6, v3

    add-long/2addr v4, v6

    add-long v4, v4, v17

    .restart local v4    # "element$iv":J
    const/4 v6, 0x0

    .line 400
    .restart local v6    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v7, v12

    .restart local v7    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v9, v4

    .restart local v9    # "index":J
    const/4 v15, 0x0

    .line 242
    .restart local v15    # "$i$a$-fastFold-SnapshotIdSet$or$1":I
    invoke-virtual {v7, v9, v10}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v7

    .line 400
    .end local v7    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v9    # "index":J
    .end local v15    # "$i$a$-fastFold-SnapshotIdSet$or$1":I
    nop

    .line 420
    .end local v4    # "element$iv":J
    .end local v6    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    .end local v12    # "accumulator$iv":Ljava/lang/Object;
    .local v7, "accumulator$iv":Ljava/lang/Object;
    move-object v12, v7

    .line 418
    .end local v7    # "accumulator$iv":Ljava/lang/Object;
    .restart local v12    # "accumulator$iv":Ljava/lang/Object;
    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    move-object v4, v12

    goto :goto_4

    .line 417
    .end local v3    # "index$iv$iv":I
    :cond_9
    move-object v4, v12

    .line 424
    .end local v12    # "accumulator$iv":Ljava/lang/Object;
    .local v4, "accumulator$iv":Ljava/lang/Object;
    :goto_4
    nop

    .line 425
    .end local v13    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v14    # "$i$f$fastForEach":I
    nop

    .end local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v4    # "accumulator$iv":Ljava/lang/Object;
    .end local v11    # "$i$f$fastFold":I
    goto/16 :goto_8

    .line 245
    :cond_a
    const-wide/16 v17, 0x40

    const-wide/16 v24, 0x0

    const-wide/16 v27, 0x1

    move-object/from16 v2, p1

    .restart local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v3, 0x0

    .line 426
    .local v3, "$i$f$fastFold":I
    const/4 v4, 0x0

    .restart local v4    # "accumulator$iv":Ljava/lang/Object;
    move-object/from16 v4, p0

    .line 427
    move-object v6, v2

    .local v6, "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/4 v7, 0x0

    .line 432
    .local v7, "$i$f$fastForEach":I
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    move-result-object v9

    if-eqz v9, :cond_c

    .local v9, "$this$forEach$iv$iv$iv":[J
    const/4 v10, 0x0

    .line 433
    .local v10, "$i$f$forEach":I
    array-length v11, v9

    :goto_5
    if-ge v5, v11, :cond_b

    aget-wide v12, v9, v5

    .line 434
    .local v12, "value$iv$iv$iv":J
    move-wide v14, v12

    .local v14, "element$iv":J
    const/16 v16, 0x0

    .line 427
    .local v16, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object/from16 v19, v4

    check-cast v19, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .local v19, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide/from16 v20, v14

    .local v20, "index":J
    move-object/from16 v22, v19

    .end local v19    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v22, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    const/16 v19, 0x0

    .line 245
    .local v19, "$i$a$-fastFold-SnapshotIdSet$or$2":I
    move-object/from16 v26, v9

    move-wide/from16 v8, v20

    move-object/from16 v0, v22

    .end local v9    # "$this$forEach$iv$iv$iv":[J
    .end local v20    # "index":J
    .end local v22    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v0, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .local v8, "index":J
    .local v26, "$this$forEach$iv$iv$iv":[J
    invoke-virtual {v0, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v0

    .line 427
    .end local v0    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v8    # "index":J
    .end local v19    # "$i$a$-fastFold-SnapshotIdSet$or$2":I
    move-object v4, v0

    .line 434
    .end local v14    # "element$iv":J
    .end local v16    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    nop

    .line 433
    .end local v12    # "value$iv$iv$iv":J
    add-int/lit8 v5, v5, 0x1

    const/16 v8, 0x40

    move-object/from16 v0, p0

    move-object/from16 v9, v26

    goto :goto_5

    .line 436
    .end local v26    # "$this$forEach$iv$iv$iv":[J
    .restart local v9    # "$this$forEach$iv$iv$iv":[J
    :cond_b
    move-object/from16 v26, v9

    .line 437
    .end local v9    # "$this$forEach$iv$iv$iv":[J
    .end local v10    # "$i$f$forEach":I
    :cond_c
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v8

    cmp-long v0, v8, v24

    if-eqz v0, :cond_e

    .line 438
    const/4 v0, 0x0

    .local v0, "index$iv$iv":I
    :goto_6
    const/16 v5, 0x40

    if-ge v0, v5, :cond_e

    .line 439
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v8

    shl-long v10, v27, v0

    and-long/2addr v8, v10

    cmp-long v5, v8, v24

    if-eqz v5, :cond_d

    .line 440
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v8

    int-to-long v10, v0

    add-long/2addr v8, v10

    .local v8, "element$iv":J
    const/4 v5, 0x0

    .line 427
    .local v5, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v10, v4

    check-cast v10, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .local v10, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v11, v8

    .local v11, "index":J
    const/4 v13, 0x0

    .line 245
    .local v13, "$i$a$-fastFold-SnapshotIdSet$or$2":I
    invoke-virtual {v10, v11, v12}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v10

    .line 427
    .end local v10    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v11    # "index":J
    .end local v13    # "$i$a$-fastFold-SnapshotIdSet$or$2":I
    move-object v4, v10

    .line 440
    .end local v5    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    .end local v8    # "element$iv":J
    nop

    .line 438
    :cond_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 444
    .end local v0    # "index$iv$iv":I
    :cond_e
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v8

    cmp-long v0, v8, v24

    if-eqz v0, :cond_10

    .line 445
    const/4 v0, 0x0

    .restart local v0    # "index$iv$iv":I
    :goto_7
    const/16 v5, 0x40

    if-ge v0, v5, :cond_10

    .line 446
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v8

    shl-long v10, v27, v0

    and-long/2addr v8, v10

    cmp-long v8, v8, v24

    if-eqz v8, :cond_f

    .line 447
    invoke-static {v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    move-result-wide v8

    int-to-long v10, v0

    add-long/2addr v8, v10

    add-long v8, v8, v17

    .restart local v8    # "element$iv":J
    const/4 v10, 0x0

    .line 427
    .local v10, "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    move-object v11, v4

    check-cast v11, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .local v11, "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    move-wide v12, v8

    .local v12, "index":J
    const/4 v14, 0x0

    .line 245
    .local v14, "$i$a$-fastFold-SnapshotIdSet$or$2":I
    invoke-virtual {v11, v12, v13}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v11

    .line 427
    .end local v11    # "previous":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v12    # "index":J
    .end local v14    # "$i$a$-fastFold-SnapshotIdSet$or$2":I
    move-object v4, v11

    .line 447
    .end local v8    # "element$iv":J
    .end local v10    # "$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv":I
    nop

    .line 445
    :cond_f
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 451
    .end local v0    # "index$iv$iv":I
    :cond_10
    nop

    .line 452
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v7    # "$i$f$fastForEach":I
    move-object v0, v4

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-object v4, v0

    .line 232
    .end local v2    # "this_$iv":Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .end local v3    # "$i$f$fastFold":I
    .end local v4    # "accumulator$iv":Ljava/lang/Object;
    :goto_8
    return-object v4
.end method

.method public final set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 30
    .param p1, "id"    # J

    .line 67
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-wide v3, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    sub-long v3, v1, v3

    .line 68
    .local v3, "offset":J
    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    const-wide/16 v8, 0x40

    const-wide/16 v10, 0x1

    if-ltz v7, :cond_0

    cmp-long v7, v3, v8

    if-gez v7, :cond_0

    .line 69
    long-to-int v7, v3

    shl-long v7, v10, v7

    .line 70
    .local v7, "mask":J
    iget-wide v9, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    and-long/2addr v9, v7

    cmp-long v5, v9, v5

    if-nez v5, :cond_c

    .line 71
    new-instance v9, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 72
    iget-wide v10, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 73
    iget-wide v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    or-long v12, v5, v7

    .line 74
    iget-wide v14, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 75
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 71
    move-object/from16 v16, v5

    invoke-direct/range {v9 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    return-object v9

    .line 78
    .end local v7    # "mask":J
    :cond_0
    cmp-long v7, v3, v8

    const/16 v12, 0x40

    const-wide/16 v13, 0x80

    if-ltz v7, :cond_1

    cmp-long v7, v3, v13

    if-gez v7, :cond_1

    .line 79
    long-to-int v7, v3

    sub-int/2addr v7, v12

    shl-long v7, v10, v7

    .line 80
    .restart local v7    # "mask":J
    iget-wide v9, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    and-long/2addr v9, v7

    cmp-long v5, v9, v5

    if-nez v5, :cond_c

    .line 81
    new-instance v9, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 82
    iget-wide v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    or-long v10, v5, v7

    .line 83
    iget-wide v12, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 84
    iget-wide v14, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 85
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 81
    move-object/from16 v16, v5

    invoke-direct/range {v9 .. v16}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    return-object v9

    .line 88
    .end local v7    # "mask":J
    :cond_1
    cmp-long v7, v3, v13

    const/4 v13, 0x0

    if-ltz v7, :cond_a

    .line 89
    invoke-virtual/range {p0 .. p2}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    move-result v7

    if-nez v7, :cond_c

    .line 91
    iget-wide v14, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 92
    .local v14, "newUpperSet":J
    const-wide/16 v16, 0x0

    move-wide/from16 v18, v5

    .local v16, "newLowerSet":J
    iget-wide v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 93
    .end local v16    # "newLowerSet":J
    .local v5, "newLowerSet":J
    const-wide/16 v16, 0x0

    move-wide/from16 v20, v8

    .local v16, "newLowerBound":J
    iget-wide v8, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 94
    .end local v16    # "newLowerBound":J
    .local v8, "newLowerBound":J
    const/4 v7, 0x0

    .line 96
    .local v7, "newBelowBound":Ljava/lang/Object;
    add-long v16, v1, v10

    div-long v16, v16, v20

    mul-long v16, v16, v20

    .local v16, "it":J
    const/16 v22, 0x0

    .line 97
    .local v22, "$i$a$-let-SnapshotIdSet$set$targetLowerBound$1":I
    cmp-long v23, v16, v18

    if-gez v23, :cond_2

    const-wide v23, 0x7fffffffffffff80L

    move-wide/from16 v16, v23

    .line 96
    .end local v16    # "it":J
    .end local v22    # "$i$a$-let-SnapshotIdSet$set$targetLowerBound$1":I
    :cond_2
    nop

    .line 95
    move-wide/from16 v23, v14

    .line 99
    .end local v14    # "newUpperSet":J
    .local v16, "targetLowerBound":J
    .local v23, "newUpperSet":J
    :goto_0
    cmp-long v14, v8, v16

    if-gez v14, :cond_7

    .line 101
    cmp-long v14, v5, v18

    if-eqz v14, :cond_5

    .line 102
    if-nez v7, :cond_3

    .line 103
    new-instance v14, Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;

    iget-object v15, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    invoke-direct {v14, v15}, Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;-><init>([J)V

    move-object v7, v14

    .line 104
    :cond_3
    move v14, v13

    :goto_1
    if-ge v14, v12, :cond_5

    move v15, v14

    .local v15, "bitOffset":I
    const/16 v22, 0x0

    .line 105
    .local v22, "$i$a$-repeat-SnapshotIdSet$set$1":I
    shl-long v25, v10, v15

    and-long v25, v5, v25

    cmp-long v25, v25, v18

    if-eqz v25, :cond_4

    .line 106
    int-to-long v10, v15

    add-long/2addr v10, v8

    invoke-virtual {v7, v10, v11}, Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;->add(J)V

    .line 108
    :cond_4
    nop

    .line 104
    .end local v15    # "bitOffset":I
    .end local v22    # "$i$a$-repeat-SnapshotIdSet$set$1":I
    add-int/lit8 v14, v14, 0x1

    const-wide/16 v10, 0x1

    goto :goto_1

    .line 110
    :cond_5
    cmp-long v10, v23, v18

    if-nez v10, :cond_6

    .line 111
    move-wide/from16 v8, v16

    .line 112
    const-wide/16 v5, 0x0

    .line 113
    move-wide/from16 v25, v5

    move-wide/from16 v27, v8

    goto :goto_2

    .line 115
    :cond_6
    move-wide/from16 v5, v23

    .line 116
    const-wide/16 v23, 0x0

    .line 117
    add-long v8, v8, v20

    const-wide/16 v10, 0x1

    goto :goto_0

    .line 99
    :cond_7
    move-wide/from16 v25, v5

    move-wide/from16 v27, v8

    .line 120
    .end local v5    # "newLowerSet":J
    .end local v8    # "newLowerBound":J
    .local v25, "newLowerSet":J
    .local v27, "newLowerBound":J
    :goto_2
    new-instance v22, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 121
    nop

    .line 122
    nop

    .line 123
    nop

    .line 124
    if-eqz v7, :cond_8

    invoke-virtual {v7}, Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;->toArray()[J

    move-result-object v5

    if-nez v5, :cond_9

    :cond_8
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    :cond_9
    move-object/from16 v29, v5

    .line 120
    invoke-direct/range {v22 .. v29}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 126
    move-object/from16 v5, v22

    invoke-virtual {v5, v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v5

    .line 120
    return-object v5

    .line 130
    .end local v7    # "newBelowBound":Ljava/lang/Object;
    .end local v16    # "targetLowerBound":J
    .end local v23    # "newUpperSet":J
    .end local v25    # "newLowerSet":J
    .end local v27    # "newLowerBound":J
    :cond_a
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    if-nez v5, :cond_b

    .line 131
    new-instance v14, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    iget-wide v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    iget-wide v7, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    iget-wide v9, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    const/4 v11, 0x0

    .line 317
    .local v11, "$i$f$snapshotIdArrayOf":I
    const/4 v12, 0x1

    new-array v12, v12, [J

    aput-wide v1, v12, v13

    .line 131
    .end local v11    # "$i$f$snapshotIdArrayOf":I
    move-wide v15, v5

    move-wide/from16 v17, v7

    move-wide/from16 v19, v9

    move-object/from16 v21, v12

    invoke-direct/range {v14 .. v21}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    return-object v14

    .line 129
    :cond_b
    nop

    .line 133
    .local v5, "array":[J
    invoke-static {v5, v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->binarySearch([JJ)I

    move-result v6

    .line 134
    .local v6, "location":I
    if-gez v6, :cond_c

    .line 135
    add-int/lit8 v7, v6, 0x1

    neg-int v7, v7

    .line 136
    .local v7, "insertLocation":I
    invoke-static {v5, v7, v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->withIdInsertedAt([JIJ)[J

    move-result-object v15

    .line 137
    .local v15, "newBelowBound":[J
    new-instance v8, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    iget-wide v9, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    iget-wide v11, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    iget-wide v13, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    invoke-direct/range {v8 .. v15}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    return-object v8

    .line 142
    .end local v5    # "array":[J
    .end local v6    # "location":I
    .end local v7    # "insertLocation":I
    .end local v15    # "newBelowBound":[J
    :cond_c
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super/range {p0 .. p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 478
    .local v2, "$i$f$map":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 479
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 480
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    .local v8, "it":J
    const/4 v10, 0x0

    .line 307
    .local v10, "$i$a$-map-SnapshotIdSet$toString$1":I
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 480
    .end local v8    # "it":J
    .end local v10    # "$i$a$-map-SnapshotIdSet$toString$1":I
    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 481
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    move-object v9, v3

    check-cast v9, Ljava/util/List;

    .line 478
    nop

    .line 308
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map":I
    const/16 v16, 0x3f

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, Landroidx/compose/runtime/snapshots/ListUtilsKt;->fastJoinToString$default(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 306
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 308
    return-object v0
.end method
