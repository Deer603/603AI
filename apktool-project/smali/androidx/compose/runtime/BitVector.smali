.class public final Landroidx/compose/runtime/BitVector;
.super Ljava/lang/Object;
.source "SlotTable.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3963:1\n3500#1,5:3967\n3505#1,27:3973\n3500#1,5:4000\n3505#1,27:4006\n3810#2:3964\n3810#2:3965\n3810#2:3966\n3580#2:3972\n3580#2:4005\n3580#2:4033\n3580#2:4034\n3580#2:4035\n3810#2:4036\n3810#2:4037\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n*L\n3490#1:3967,5\n3490#1:3973,27\n3492#1:4000,5\n3492#1:4006,27\n3467#1:3964\n3473#1:3965\n3487#1:3966\n3490#1:3972\n3492#1:4005\n3504#1:4033\n3510#1:4034\n3527#1:4035\n3544#1:4036\n3555#1:4037\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0086\u0002J%\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0082\u0008J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\rH\u0086\u0002J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tJ\u0008\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0008\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/compose/runtime/BitVector;",
        "",
        "()V",
        "first",
        "",
        "others",
        "",
        "second",
        "size",
        "",
        "getSize",
        "()I",
        "get",
        "",
        "index",
        "nextBit",
        "valueSelector",
        "Lkotlin/Function1;",
        "nextClear",
        "nextSet",
        "set",
        "",
        "value",
        "setRange",
        "start",
        "end",
        "toString",
        "",
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
.field private first:J

.field private others:[J

.field private second:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/BitVector;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3441
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3444
    invoke-static {}, Landroidx/compose/runtime/SlotTableKt;->access$getEmptyLongArray$p()[J

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/BitVector;->others:[J

    .line 3441
    return-void
.end method

.method private final nextBit(ILkotlin/jvm/functions/Function1;)I
    .locals 17
    .param p1, "index"    # I
    .param p2, "valueSelector"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;)I"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    .line 3500
    .local v3, "$i$f$nextBit":I
    const/16 v4, 0x40

    if-ge v1, v4, :cond_0

    .line 3504
    iget-wide v5, v0, Landroidx/compose/runtime/BitVector;->first:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v2, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    ushr-long/2addr v5, v1

    shl-long/2addr v5, v1

    .local v5, "$this$firstBitSet$iv":J
    const/4 v7, 0x0

    .line 4033
    .local v7, "$i$f$getFirstBitSet":I
    invoke-static {v5, v6}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v8

    .line 3504
    .end local v5    # "$this$firstBitSet$iv":J
    .end local v7    # "$i$f$getFirstBitSet":I
    nop

    .line 3505
    .local v8, "bit":I
    if-ge v8, v4, :cond_0

    return v8

    .line 3508
    .end local v8    # "bit":I
    :cond_0
    const/16 v5, 0x80

    if-ge v1, v5, :cond_1

    .line 3509
    add-int/lit8 v6, v1, -0x40

    .line 3510
    .local v6, "index":I
    iget-wide v7, v0, Landroidx/compose/runtime/BitVector;->second:J

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v2, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    ushr-long/2addr v7, v6

    shl-long/2addr v7, v6

    .local v7, "$this$firstBitSet$iv":J
    const/4 v9, 0x0

    .line 4034
    .local v9, "$i$f$getFirstBitSet":I
    invoke-static {v7, v8}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v10

    .line 3510
    .end local v7    # "$this$firstBitSet$iv":J
    .end local v9    # "$i$f$getFirstBitSet":I
    nop

    .line 3511
    .local v10, "bit":I
    if-ge v10, v4, :cond_1

    add-int/lit8 v4, v10, 0x40

    return v4

    .line 3514
    .end local v6    # "index":I
    .end local v10    # "bit":I
    :cond_1
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 3515
    .restart local v6    # "index":I
    div-int/lit8 v7, v6, 0x40

    add-int/lit8 v7, v7, -0x2

    .line 3516
    .local v7, "start":I
    iget-object v8, v0, Landroidx/compose/runtime/BitVector;->others:[J

    .line 3518
    .local v8, "others":[J
    move v9, v7

    .local v9, "i":I
    array-length v10, v8

    :goto_0
    if-ge v9, v10, :cond_4

    .line 3519
    aget-wide v11, v8, v9

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-interface {v2, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    .line 3523
    .local v11, "value":J
    if-ne v9, v7, :cond_2

    .line 3524
    rem-int/lit8 v13, v6, 0x40

    .line 3525
    .local v13, "shift":I
    ushr-long v14, v11, v13

    shl-long v11, v14, v13

    .line 3527
    .end local v13    # "shift":I
    :cond_2
    move-wide v13, v11

    .local v13, "$this$firstBitSet$iv":J
    const/4 v15, 0x0

    .line 4035
    .local v15, "$i$f$getFirstBitSet":I
    invoke-static {v13, v14}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v16

    .line 3527
    .end local v13    # "$this$firstBitSet$iv":J
    .end local v15    # "$i$f$getFirstBitSet":I
    move/from16 v13, v16

    .line 3528
    .local v13, "bit":I
    if-ge v13, v4, :cond_3

    mul-int/lit8 v4, v9, 0x40

    add-int/2addr v4, v5

    add-int/2addr v4, v13

    return v4

    .line 3518
    .end local v11    # "value":J
    .end local v13    # "bit":I
    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 3531
    .end local v9    # "i":I
    :cond_4
    const v4, 0x7fffffff

    return v4
.end method


# virtual methods
.method public final get(I)Z
    .locals 12
    .param p1, "index"    # I

    .line 3450
    const/16 v0, 0x40

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1

    const/4 v6, 0x0

    if-ge p1, v0, :cond_1

    iget-wide v7, p0, Landroidx/compose/runtime/BitVector;->first:J

    shl-long/2addr v4, p1

    and-long/2addr v4, v7

    cmp-long v0, v4, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v6

    :goto_0
    return v1

    .line 3451
    :cond_1
    const/16 v0, 0x80

    if-ge p1, v0, :cond_3

    iget-wide v7, p0, Landroidx/compose/runtime/BitVector;->second:J

    add-int/lit8 v0, p1, -0x40

    shl-long/2addr v4, v0

    and-long/2addr v4, v7

    cmp-long v0, v4, v2

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v6

    :goto_1
    return v1

    .line 3453
    :cond_3
    iget-object v0, p0, Landroidx/compose/runtime/BitVector;->others:[J

    .line 3454
    .local v0, "others":[J
    array-length v7, v0

    .line 3455
    .local v7, "size":I
    if-nez v7, :cond_4

    return v6

    .line 3457
    :cond_4
    div-int/lit8 v8, p1, 0x40

    add-int/lit8 v8, v8, -0x2

    .line 3458
    .local v8, "address":I
    if-lt v8, v7, :cond_5

    return v6

    .line 3460
    :cond_5
    rem-int/lit8 v9, p1, 0x40

    .line 3461
    .local v9, "bit":I
    aget-wide v10, v0, v8

    shl-long/2addr v4, v9

    and-long/2addr v4, v10

    cmp-long v2, v4, v2

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_6
    move v1, v6

    :goto_2
    return v1
.end method

.method public final getSize()I
    .locals 1

    .line 3447
    iget-object v0, p0, Landroidx/compose/runtime/BitVector;->others:[J

    array-length v0, v0

    add-int/lit8 v0, v0, 0x2

    mul-int/lit8 v0, v0, 0x40

    return v0
.end method

.method public final nextClear(I)I
    .locals 16
    .param p1, "index"    # I

    .line 3492
    move/from16 v0, p1

    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/BitVector;
    const/4 v2, 0x0

    .line 4000
    .local v2, "$i$f$nextBit":I
    const/16 v3, 0x40

    if-ge v0, v3, :cond_0

    .line 4004
    iget-wide v4, v1, Landroidx/compose/runtime/BitVector;->first:J

    .local v4, "it":J
    const/4 v6, 0x0

    .line 3492
    .local v6, "$i$a$-nextBit-BitVector$nextClear$1":I
    not-long v4, v4

    .line 4004
    .end local v4    # "it":J
    .end local v6    # "$i$a$-nextBit-BitVector$nextClear$1":I
    ushr-long/2addr v4, v0

    shl-long/2addr v4, v0

    .local v4, "$this$firstBitSet$iv$iv":J
    const/4 v6, 0x0

    .line 4005
    .local v6, "$i$f$getFirstBitSet":I
    invoke-static {v4, v5}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v7

    .line 4004
    .end local v4    # "$this$firstBitSet$iv$iv":J
    .end local v6    # "$i$f$getFirstBitSet":I
    nop

    .line 4006
    .local v7, "bit$iv":I
    if-ge v7, v3, :cond_0

    goto :goto_1

    .line 4009
    .end local v7    # "bit$iv":I
    :cond_0
    const/16 v4, 0x80

    if-ge v0, v4, :cond_1

    .line 4010
    add-int/lit8 v5, v0, -0x40

    .line 4011
    .local v5, "index$iv":I
    iget-wide v6, v1, Landroidx/compose/runtime/BitVector;->second:J

    .local v6, "it":J
    const/4 v8, 0x0

    .line 3492
    .local v8, "$i$a$-nextBit-BitVector$nextClear$1":I
    not-long v6, v6

    .line 4011
    .end local v6    # "it":J
    .end local v8    # "$i$a$-nextBit-BitVector$nextClear$1":I
    ushr-long/2addr v6, v5

    shl-long/2addr v6, v5

    .local v6, "$this$firstBitSet$iv$iv":J
    const/4 v8, 0x0

    .line 4005
    .local v8, "$i$f$getFirstBitSet":I
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v9

    .line 4011
    .end local v6    # "$this$firstBitSet$iv$iv":J
    .end local v8    # "$i$f$getFirstBitSet":I
    nop

    .line 4012
    .local v9, "bit$iv":I
    if-ge v9, v3, :cond_1

    add-int/lit8 v7, v9, 0x40

    goto :goto_1

    .line 4015
    .end local v5    # "index$iv":I
    .end local v9    # "bit$iv":I
    :cond_1
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 4016
    .restart local v5    # "index$iv":I
    div-int/lit8 v6, v5, 0x40

    add-int/lit8 v6, v6, -0x2

    .line 4017
    .local v6, "start$iv":I
    iget-object v7, v1, Landroidx/compose/runtime/BitVector;->others:[J

    .line 4019
    .local v7, "others$iv":[J
    move v8, v6

    .local v8, "i$iv":I
    array-length v9, v7

    :goto_0
    if-ge v8, v9, :cond_4

    .line 4020
    aget-wide v10, v7, v8

    .local v10, "it":J
    const/4 v12, 0x0

    .line 3492
    .local v12, "$i$a$-nextBit-BitVector$nextClear$1":I
    not-long v10, v10

    .line 4020
    .end local v10    # "it":J
    .end local v12    # "$i$a$-nextBit-BitVector$nextClear$1":I
    nop

    .line 4024
    .local v10, "value$iv":J
    if-ne v8, v6, :cond_2

    .line 4025
    rem-int/lit8 v12, v5, 0x40

    .line 4026
    .local v12, "shift$iv":I
    ushr-long v13, v10, v12

    shl-long v10, v13, v12

    .line 4028
    .end local v12    # "shift$iv":I
    :cond_2
    move-wide v12, v10

    .local v12, "$this$firstBitSet$iv$iv":J
    const/4 v14, 0x0

    .line 4005
    .local v14, "$i$f$getFirstBitSet":I
    invoke-static {v12, v13}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v15

    .line 4028
    .end local v12    # "$this$firstBitSet$iv$iv":J
    .end local v14    # "$i$f$getFirstBitSet":I
    nop

    .line 4029
    .local v15, "bit$iv":I
    if-ge v15, v3, :cond_3

    mul-int/lit8 v3, v8, 0x40

    add-int/2addr v3, v4

    add-int/2addr v3, v15

    move v7, v3

    goto :goto_1

    .line 4019
    .end local v10    # "value$iv":J
    .end local v15    # "bit$iv":I
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 4032
    .end local v8    # "i$iv":I
    :cond_4
    const v3, 0x7fffffff

    move v7, v3

    .line 3492
    .end local v1    # "this_$iv":Landroidx/compose/runtime/BitVector;
    .end local v2    # "$i$f$nextBit":I
    .end local v5    # "index$iv":I
    .end local v6    # "start$iv":I
    .end local v7    # "others$iv":[J
    :goto_1
    return v7
.end method

.method public final nextSet(I)I
    .locals 16
    .param p1, "index"    # I

    .line 3490
    move/from16 v0, p1

    move-object/from16 v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/BitVector;
    const/4 v2, 0x0

    .line 3967
    .local v2, "$i$f$nextBit":I
    const/16 v3, 0x40

    if-ge v0, v3, :cond_0

    .line 3971
    iget-wide v4, v1, Landroidx/compose/runtime/BitVector;->first:J

    .local v4, "it":J
    const/4 v6, 0x0

    .line 3490
    .local v6, "$i$a$-nextBit-BitVector$nextSet$1":I
    nop

    .line 3971
    .end local v4    # "it":J
    .end local v6    # "$i$a$-nextBit-BitVector$nextSet$1":I
    ushr-long/2addr v4, v0

    shl-long/2addr v4, v0

    .local v4, "$this$firstBitSet$iv$iv":J
    const/4 v6, 0x0

    .line 3972
    .local v6, "$i$f$getFirstBitSet":I
    invoke-static {v4, v5}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v7

    .line 3971
    .end local v4    # "$this$firstBitSet$iv$iv":J
    .end local v6    # "$i$f$getFirstBitSet":I
    nop

    .line 3973
    .local v7, "bit$iv":I
    if-ge v7, v3, :cond_0

    goto :goto_1

    .line 3976
    .end local v7    # "bit$iv":I
    :cond_0
    const/16 v4, 0x80

    if-ge v0, v4, :cond_1

    .line 3977
    add-int/lit8 v5, v0, -0x40

    .line 3978
    .local v5, "index$iv":I
    iget-wide v6, v1, Landroidx/compose/runtime/BitVector;->second:J

    .local v6, "it":J
    const/4 v8, 0x0

    .line 3490
    .local v8, "$i$a$-nextBit-BitVector$nextSet$1":I
    nop

    .line 3978
    .end local v6    # "it":J
    .end local v8    # "$i$a$-nextBit-BitVector$nextSet$1":I
    ushr-long/2addr v6, v5

    shl-long/2addr v6, v5

    .local v6, "$this$firstBitSet$iv$iv":J
    const/4 v8, 0x0

    .line 3972
    .local v8, "$i$f$getFirstBitSet":I
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v9

    .line 3978
    .end local v6    # "$this$firstBitSet$iv$iv":J
    .end local v8    # "$i$f$getFirstBitSet":I
    nop

    .line 3979
    .local v9, "bit$iv":I
    if-ge v9, v3, :cond_1

    add-int/lit8 v7, v9, 0x40

    goto :goto_1

    .line 3982
    .end local v5    # "index$iv":I
    .end local v9    # "bit$iv":I
    :cond_1
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 3983
    .restart local v5    # "index$iv":I
    div-int/lit8 v6, v5, 0x40

    add-int/lit8 v6, v6, -0x2

    .line 3984
    .local v6, "start$iv":I
    iget-object v7, v1, Landroidx/compose/runtime/BitVector;->others:[J

    .line 3986
    .local v7, "others$iv":[J
    move v8, v6

    .local v8, "i$iv":I
    array-length v9, v7

    :goto_0
    if-ge v8, v9, :cond_4

    .line 3987
    aget-wide v10, v7, v8

    .local v10, "it":J
    const/4 v12, 0x0

    .line 3490
    .local v12, "$i$a$-nextBit-BitVector$nextSet$1":I
    nop

    .line 3987
    .end local v10    # "it":J
    .end local v12    # "$i$a$-nextBit-BitVector$nextSet$1":I
    nop

    .line 3991
    .local v10, "value$iv":J
    if-ne v8, v6, :cond_2

    .line 3992
    rem-int/lit8 v12, v5, 0x40

    .line 3993
    .local v12, "shift$iv":I
    ushr-long v13, v10, v12

    shl-long v10, v13, v12

    .line 3995
    .end local v12    # "shift$iv":I
    :cond_2
    move-wide v12, v10

    .local v12, "$this$firstBitSet$iv$iv":J
    const/4 v14, 0x0

    .line 3972
    .local v14, "$i$f$getFirstBitSet":I
    invoke-static {v12, v13}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v15

    .line 3995
    .end local v12    # "$this$firstBitSet$iv$iv":J
    .end local v14    # "$i$f$getFirstBitSet":I
    nop

    .line 3996
    .local v15, "bit$iv":I
    if-ge v15, v3, :cond_3

    mul-int/lit8 v3, v8, 0x40

    add-int/2addr v3, v4

    add-int/2addr v3, v15

    move v7, v3

    goto :goto_1

    .line 3986
    .end local v10    # "value$iv":J
    .end local v15    # "bit$iv":I
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 3999
    .end local v8    # "i$iv":I
    :cond_4
    const v3, 0x7fffffff

    move v7, v3

    .line 3490
    .end local v1    # "this_$iv":Landroidx/compose/runtime/BitVector;
    .end local v2    # "$i$f$nextBit":I
    .end local v5    # "index$iv":I
    .end local v6    # "start$iv":I
    .end local v7    # "others$iv":[J
    :goto_1
    return v7
.end method

.method public final set(IZ)V
    .locals 13
    .param p1, "index"    # I
    .param p2, "value"    # Z

    .line 3465
    const/16 v0, 0x40

    const/4 v1, 0x0

    const-wide/16 v2, 0x1

    const/4 v4, 0x1

    if-ge p1, v0, :cond_1

    .line 3466
    shl-long/2addr v2, p1

    .line 3467
    .local v2, "mask":J
    iget-wide v5, p0, Landroidx/compose/runtime/BitVector;->first:J

    not-long v7, v2

    and-long/2addr v5, v7

    move v0, p2

    .local v0, "$this$toBit$iv":Z
    const/4 v7, 0x0

    .line 3964
    .local v7, "$i$f$toBit":I
    if-eqz v0, :cond_0

    move v1, v4

    .line 3467
    .end local v0    # "$this$toBit$iv":Z
    .end local v7    # "$i$f$toBit":I
    :cond_0
    int-to-long v0, v1

    shl-long/2addr v0, p1

    or-long/2addr v0, v5

    iput-wide v0, p0, Landroidx/compose/runtime/BitVector;->first:J

    .line 3468
    return-void

    .line 3471
    .end local v2    # "mask":J
    :cond_1
    const/16 v0, 0x80

    if-ge p1, v0, :cond_3

    .line 3472
    add-int/lit8 v0, p1, -0x40

    shl-long/2addr v2, v0

    .line 3473
    .restart local v2    # "mask":J
    iget-wide v5, p0, Landroidx/compose/runtime/BitVector;->second:J

    not-long v7, v2

    and-long/2addr v5, v7

    move v0, p2

    .restart local v0    # "$this$toBit$iv":Z
    const/4 v7, 0x0

    .line 3965
    .restart local v7    # "$i$f$toBit":I
    if-eqz v0, :cond_2

    move v1, v4

    .line 3473
    .end local v0    # "$this$toBit$iv":Z
    .end local v7    # "$i$f$toBit":I
    :cond_2
    int-to-long v0, v1

    shl-long/2addr v0, p1

    or-long/2addr v0, v5

    iput-wide v0, p0, Landroidx/compose/runtime/BitVector;->second:J

    .line 3474
    return-void

    .line 3477
    .end local v2    # "mask":J
    :cond_3
    div-int/lit8 v0, p1, 0x40

    add-int/lit8 v0, v0, -0x2

    .line 3478
    .local v0, "address":I
    rem-int/lit8 v5, p1, 0x40

    .line 3479
    .local v5, "newIndex":I
    shl-long/2addr v2, v5

    .line 3480
    .restart local v2    # "mask":J
    iget-object v6, p0, Landroidx/compose/runtime/BitVector;->others:[J

    .line 3481
    .local v6, "others":[J
    array-length v7, v6

    if-lt v0, v7, :cond_4

    .line 3482
    add-int/lit8 v7, v0, 0x1

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v7

    const-string v8, "copyOf(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v7

    .line 3483
    iput-object v6, p0, Landroidx/compose/runtime/BitVector;->others:[J

    .line 3486
    :cond_4
    aget-wide v7, v6, v0

    .line 3487
    .local v7, "bits":J
    not-long v9, v2

    and-long/2addr v9, v7

    move v11, p2

    .local v11, "$this$toBit$iv":Z
    const/4 v12, 0x0

    .line 3966
    .local v12, "$i$f$toBit":I
    if-eqz v11, :cond_5

    move v1, v4

    .line 3487
    .end local v11    # "$this$toBit$iv":Z
    .end local v12    # "$i$f$toBit":I
    :cond_5
    int-to-long v11, v1

    shl-long/2addr v11, v5

    or-long/2addr v9, v11

    aput-wide v9, v6, v0

    .line 3488
    return-void
.end method

.method public final setRange(II)V
    .locals 16
    .param p1, "start"    # I
    .param p2, "end"    # I

    .line 3536
    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p1

    .line 3541
    .local v2, "start":I
    if-ge v2, v1, :cond_0

    const-wide/16 v3, -0x1

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    .line 3544
    .local v3, "bits":J
    :goto_0
    const/4 v5, 0x0

    const/16 v6, 0x40

    const/4 v7, 0x1

    if-ge v2, v6, :cond_1

    move v8, v7

    goto :goto_1

    :cond_1
    move v8, v5

    .local v8, "$this$toBit$iv":Z
    :goto_1
    const/4 v9, 0x0

    .line 4036
    .local v9, "$i$f$toBit":I
    if-eqz v8, :cond_2

    move v8, v7

    goto :goto_2

    :cond_2
    move v8, v5

    .end local v8    # "$this$toBit$iv":Z
    .end local v9    # "$i$f$toBit":I
    :goto_2
    int-to-long v8, v8

    .line 3544
    mul-long/2addr v8, v3

    .line 3549
    .local v8, "selector":J
    invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I

    move-result v10

    sub-int/2addr v10, v2

    rsub-int/lit8 v10, v10, 0x40

    ushr-long v10, v8, v10

    shl-long/2addr v10, v2

    .line 3550
    .local v10, "firstValue":J
    iget-wide v12, v0, Landroidx/compose/runtime/BitVector;->first:J

    or-long/2addr v12, v10

    iput-wide v12, v0, Landroidx/compose/runtime/BitVector;->first:J

    .line 3552
    if-le v1, v6, :cond_7

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 3555
    const/16 v6, 0x80

    if-ge v2, v6, :cond_3

    move v12, v7

    goto :goto_3

    :cond_3
    move v12, v5

    .local v12, "$this$toBit$iv":Z
    :goto_3
    const/4 v13, 0x0

    .line 4037
    .local v13, "$i$f$toBit":I
    if-eqz v12, :cond_4

    move v5, v7

    .end local v12    # "$this$toBit$iv":Z
    .end local v13    # "$i$f$toBit":I
    :cond_4
    int-to-long v12, v5

    .line 3555
    mul-long/2addr v12, v3

    .line 3557
    .end local v8    # "selector":J
    .local v12, "selector":J
    invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v5, v2

    rsub-int v5, v5, 0x80

    ushr-long v8, v12, v5

    shl-long/2addr v8, v2

    .line 3558
    .local v8, "secondValue":J
    iget-wide v14, v0, Landroidx/compose/runtime/BitVector;->second:J

    or-long/2addr v14, v8

    iput-wide v14, v0, Landroidx/compose/runtime/BitVector;->second:J

    .line 3560
    if-le v1, v6, :cond_6

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 3562
    move v5, v2

    .local v5, "bit":I
    :goto_4
    if-ge v5, v1, :cond_5

    invoke-virtual {v0, v5, v7}, Landroidx/compose/runtime/BitVector;->set(IZ)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 3563
    .end local v5    # "bit":I
    :cond_5
    return-void

    .line 3560
    :cond_6
    return-void

    .line 3552
    .end local v12    # "selector":J
    .local v8, "selector":J
    :cond_7
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 3565
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v1, v0

    .local v1, "$this$toString_u24lambda_u242":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .line 3566
    .local v2, "$i$a$-buildString-BitVector$toString$1":I
    const/4 v3, 0x1

    .line 3567
    .local v3, "first":Z
    const-string v4, "BitVector ["

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3568
    const/4 v4, 0x0

    .local v4, "i":I
    invoke-virtual {p0}, Landroidx/compose/runtime/BitVector;->getSize()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_2

    .line 3569
    invoke-virtual {p0, v4}, Landroidx/compose/runtime/BitVector;->get(I)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 3570
    if-nez v3, :cond_0

    const-string v6, ", "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3571
    :cond_0
    const/4 v3, 0x0

    .line 3572
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3568
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3575
    .end local v4    # "i":I
    :cond_2
    const/16 v4, 0x5d

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3576
    nop

    .line 3565
    .end local v1    # "$this$toString_u24lambda_u242":Ljava/lang/StringBuilder;
    .end local v2    # "$i$a$-buildString-BitVector$toString$1":I
    .end local v3    # "first":Z
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3576
    return-object v0
.end method
