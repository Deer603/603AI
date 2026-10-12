.class public final Landroidx/compose/runtime/changelist/Operations$WriteScope;
.super Ljava/lang/Object;
.source "Operations.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/changelist/Operations;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WriteScope"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n1#1,642:1\n356#2:643\n359#2:644\n356#2:645\n356#2:646\n356#2:647\n362#2:648\n356#2:649\n356#2:650\n356#2:651\n356#2:652\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n367#1:643\n378#1:644\n378#1:645\n396#1:646\n420#1:647\n436#1:648\n436#1:649\n454#1:650\n481#1:651\n513#1:652\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J$\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0086\u0008\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J8\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001c\u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001e\u001a\u00020\u0010H\u0086\u0008\u00a2\u0006\u0004\u0008\u001f\u0010 JL\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001c\u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\u001e\u001a\u00020\u00102\n\u0010!\u001a\u00060\u0010j\u0002`\u00162\u0006\u0010\"\u001a\u00020\u0010H\u0086\u0008\u00a2\u0006\u0004\u0008\u001f\u0010#J,\u0010$\u001a\u00020\u0014\"\u0004\u0008\u0000\u0010%2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u0017\u001a\u0002H%\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(JH\u0010)\u001a\u00020\u0014\"\u0004\u0008\u0000\u0010%\"\u0004\u0008\u0001\u0010*2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u001c\u001a\u0002H%2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u0002H*0&2\u0006\u0010\u001e\u001a\u0002H*\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,Jd\u0010)\u001a\u00020\u0014\"\u0004\u0008\u0000\u0010%\"\u0004\u0008\u0001\u0010*\"\u0004\u0008\u0002\u0010-2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u001c\u001a\u0002H%2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u0002H*0&2\u0006\u0010\u001e\u001a\u0002H*2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u0002H-0&2\u0006\u0010\"\u001a\u0002H-\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008.\u0010/J\u0080\u0001\u0010)\u001a\u00020\u0014\"\u0004\u0008\u0000\u0010%\"\u0004\u0008\u0001\u0010*\"\u0004\u0008\u0002\u0010-\"\u0004\u0008\u0003\u001002\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u0002H%0&2\u0006\u0010\u001c\u001a\u0002H%2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u0002H*0&2\u0006\u0010\u001e\u001a\u0002H*2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u0002H-0&2\u0006\u0010\"\u001a\u0002H-2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u0002H00&2\u0006\u00102\u001a\u0002H0\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u000206H\u00d6\u0001\u00a2\u0006\u0004\u00087\u00108R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00069"
    }
    d2 = {
        "Landroidx/compose/runtime/changelist/Operations$WriteScope;",
        "",
        "stack",
        "Landroidx/compose/runtime/changelist/Operations;",
        "constructor-impl",
        "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;",
        "operation",
        "Landroidx/compose/runtime/changelist/Operation;",
        "getOperation-impl",
        "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;",
        "equals",
        "",
        "other",
        "equals-impl",
        "(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z",
        "hashCode",
        "",
        "hashCode-impl",
        "(Landroidx/compose/runtime/changelist/Operations;)I",
        "setInt",
        "",
        "parameter",
        "Landroidx/compose/runtime/changelist/IntParameter;",
        "value",
        "setInt-impl",
        "(Landroidx/compose/runtime/changelist/Operations;II)V",
        "setInts",
        "parameter1",
        "value1",
        "parameter2",
        "value2",
        "setInts-impl",
        "(Landroidx/compose/runtime/changelist/Operations;IIII)V",
        "parameter3",
        "value3",
        "(Landroidx/compose/runtime/changelist/Operations;IIIIII)V",
        "setObject",
        "T",
        "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;",
        "setObject-DKhxnng",
        "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V",
        "setObjects",
        "U",
        "setObjects-4uCC6AY",
        "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;)V",
        "V",
        "setObjects-t7hvbck",
        "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V",
        "W",
        "parameter4",
        "value4",
        "setObjects-OGa0p1M",
        "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V",
        "toString",
        "",
        "toString-impl",
        "(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;",
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
.field private final stack:Landroidx/compose/runtime/changelist/Operations;


# direct methods
.method private synthetic constructor <init>(Landroidx/compose/runtime/changelist/Operations;)V
    .locals 0
    .param p1, "stack"    # Landroidx/compose/runtime/changelist/Operations;

    .line 365
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/changelist/Operations$WriteScope;->stack:Landroidx/compose/runtime/changelist/Operations;

    return-void
.end method

.method public static final synthetic box-impl(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations$WriteScope;
    .locals 1

    new-instance v0, Landroidx/compose/runtime/changelist/Operations$WriteScope;

    invoke-direct {v0, p0}, Landroidx/compose/runtime/changelist/Operations$WriteScope;-><init>(Landroidx/compose/runtime/changelist/Operations;)V

    return-object v0
.end method

.method public static constructor-impl(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;
    .locals 0

    return-object p0
.end method

.method public static equals-impl(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/compose/runtime/changelist/Operations$WriteScope;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/changelist/Operations$WriteScope;

    invoke-virtual {v0}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->unbox-impl()Landroidx/compose/runtime/changelist/Operations;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static final equals-impl0(Landroidx/compose/runtime/changelist/Operations;Landroidx/compose/runtime/changelist/Operations;)Z
    .locals 1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static final getOperation-impl(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;
    .locals 4
    .param p0, "arg0"    # Landroidx/compose/runtime/changelist/Operations;

    .line 367
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v1, 0x0

    .line 643
    .local v1, "$i$f$peekOperation":I
    iget-object v2, v0, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v3, v0, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v3, v3, -0x1

    aget-object v0, v2, v3

    .line 367
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v1    # "$i$f$peekOperation":I
    return-object v0
.end method

.method public static hashCode-impl(Landroidx/compose/runtime/changelist/Operations;)I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/runtime/changelist/Operations;->hashCode()I

    move-result v0

    return v0
.end method

.method public static final setInt-impl(Landroidx/compose/runtime/changelist/Operations;II)V
    .locals 11
    .param p0, "arg0"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "parameter"    # I
    .param p2, "value"    # I

    const/4 v0, 0x0

    .line 370
    .local v0, "$i$f$setInt-impl":I
    move-object v1, p0

    .local v1, "$this$setInt_impl_u24lambda_u241":Landroidx/compose/runtime/changelist/Operations;
    const/4 v2, 0x0

    .line 371
    .local v2, "$i$a$-with-Operations$WriteScope$setInt$1":I
    nop

    .line 378
    iget-object v3, v1, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    move-object v4, v1

    .local v4, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v5, 0x0

    .line 644
    .local v5, "$i$f$topIntIndexOf":I
    iget v6, v4, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    move-object v7, v4

    .local v7, "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v8, 0x0

    .line 645
    .local v8, "$i$f$peekOperation":I
    iget-object v9, v7, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v10, v7, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v10, v10, -0x1

    aget-object v7, v9, v10

    .line 644
    .end local v7    # "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v8    # "$i$f$peekOperation":I
    invoke-virtual {v7}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v7

    sub-int/2addr v6, v7

    add-int/2addr v6, p1

    .line 378
    .end local v4    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v5    # "$i$f$topIntIndexOf":I
    aput p2, v3, v6

    .line 379
    nop

    .line 370
    .end local v1    # "$this$setInt_impl_u24lambda_u241":Landroidx/compose/runtime/changelist/Operations;
    .end local v2    # "$i$a$-with-Operations$WriteScope$setInt$1":I
    nop

    .line 379
    return-void
.end method

.method public static final setInts-impl(Landroidx/compose/runtime/changelist/Operations;IIII)V
    .locals 8
    .param p0, "arg0"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "parameter1"    # I
    .param p2, "value1"    # I
    .param p3, "parameter2"    # I
    .param p4, "value2"    # I

    const/4 v0, 0x0

    .line 387
    .local v0, "$i$f$setInts-impl":I
    move-object v1, p0

    .local v1, "$this$setInts_impl_u24lambda_u243":Landroidx/compose/runtime/changelist/Operations;
    const/4 v2, 0x0

    .line 388
    .local v2, "$i$a$-with-Operations$WriteScope$setInts$1":I
    nop

    .line 396
    iget v3, v1, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    move-object v4, v1

    .local v4, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v5, 0x0

    .line 646
    .local v5, "$i$f$peekOperation":I
    iget-object v6, v4, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v7, v4, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v7, v7, -0x1

    aget-object v4, v6, v7

    .line 396
    .end local v4    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v5    # "$i$f$peekOperation":I
    invoke-virtual {v4}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v4

    sub-int/2addr v3, v4

    .line 397
    .local v3, "base":I
    iget-object v4, v1, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    .line 398
    .local v4, "intArgs":[I
    add-int v5, v3, p1

    aput p2, v4, v5

    .line 399
    add-int v5, v3, p3

    aput p4, v4, v5

    .line 400
    nop

    .line 387
    .end local v1    # "$this$setInts_impl_u24lambda_u243":Landroidx/compose/runtime/changelist/Operations;
    .end local v2    # "$i$a$-with-Operations$WriteScope$setInts$1":I
    .end local v3    # "base":I
    .end local v4    # "intArgs":[I
    nop

    .line 400
    return-void
.end method

.method public static final setInts-impl(Landroidx/compose/runtime/changelist/Operations;IIIIII)V
    .locals 8
    .param p0, "arg0"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "parameter1"    # I
    .param p2, "value1"    # I
    .param p3, "parameter2"    # I
    .param p4, "value2"    # I
    .param p5, "parameter3"    # I
    .param p6, "value3"    # I

    const/4 v0, 0x0

    .line 410
    .local v0, "$i$f$setInts-impl":I
    move-object v1, p0

    .local v1, "$this$setInts_impl_u24lambda_u245":Landroidx/compose/runtime/changelist/Operations;
    const/4 v2, 0x0

    .line 411
    .local v2, "$i$a$-with-Operations$WriteScope$setInts$2":I
    nop

    .line 420
    iget v3, v1, Landroidx/compose/runtime/changelist/Operations;->intArgsSize:I

    move-object v4, v1

    .local v4, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v5, 0x0

    .line 647
    .local v5, "$i$f$peekOperation":I
    iget-object v6, v4, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v7, v4, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v7, v7, -0x1

    aget-object v4, v6, v7

    .line 420
    .end local v4    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v5    # "$i$f$peekOperation":I
    invoke-virtual {v4}, Landroidx/compose/runtime/changelist/Operation;->getInts()I

    move-result v4

    sub-int/2addr v3, v4

    .line 421
    .local v3, "base":I
    iget-object v4, v1, Landroidx/compose/runtime/changelist/Operations;->intArgs:[I

    .line 422
    .local v4, "intArgs":[I
    add-int v5, v3, p1

    aput p2, v4, v5

    .line 423
    add-int v5, v3, p3

    aput p4, v4, v5

    .line 424
    add-int v5, v3, p5

    aput p6, v4, v5

    .line 425
    nop

    .line 410
    .end local v1    # "$this$setInts_impl_u24lambda_u245":Landroidx/compose/runtime/changelist/Operations;
    .end local v2    # "$i$a$-with-Operations$WriteScope$setInts$2":I
    .end local v3    # "base":I
    .end local v4    # "intArgs":[I
    nop

    .line 425
    return-void
.end method

.method public static final setObject-DKhxnng(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V
    .locals 10
    .param p0, "arg0"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "parameter"    # I
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/changelist/Operations;",
            "ITT;)V"
        }
    .end annotation

    .line 428
    move-object v0, p0

    .local v0, "$this$setObject_DKhxnng_u24lambda_u247":Landroidx/compose/runtime/changelist/Operations;
    const/4 v1, 0x0

    .line 429
    .local v1, "$i$a$-with-Operations$WriteScope$setObject$1":I
    nop

    .line 436
    iget-object v2, v0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    move-object v3, v0

    .local v3, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v4, 0x0

    .line 648
    .local v4, "$i$f$topObjectIndexOf-31yXWZQ":I
    iget v5, v3, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    move-object v6, v3

    .local v6, "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v7, 0x0

    .line 649
    .local v7, "$i$f$peekOperation":I
    iget-object v8, v6, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v9, v6, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v9, v9, -0x1

    aget-object v6, v8, v9

    .line 648
    .end local v6    # "this_$iv$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v7    # "$i$f$peekOperation":I
    invoke-virtual {v6}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v6

    sub-int/2addr v5, v6

    add-int/2addr v5, p1

    .line 436
    .end local v3    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v4    # "$i$f$topObjectIndexOf-31yXWZQ":I
    aput-object p2, v2, v5

    .line 437
    nop

    .line 428
    .end local v0    # "$this$setObject_DKhxnng_u24lambda_u247":Landroidx/compose/runtime/changelist/Operations;
    .end local v1    # "$i$a$-with-Operations$WriteScope$setObject$1":I
    nop

    .line 437
    return-void
.end method

.method public static final setObjects-4uCC6AY(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 7
    .param p0, "arg0"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "parameter1"    # I
    .param p2, "value1"    # Ljava/lang/Object;
    .param p3, "parameter2"    # I
    .param p4, "value2"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/changelist/Operations;",
            "ITT;ITU;)V"
        }
    .end annotation

    .line 445
    move-object v0, p0

    .local v0, "$this$setObjects_4uCC6AY_u24lambda_u249":Landroidx/compose/runtime/changelist/Operations;
    const/4 v1, 0x0

    .line 446
    .local v1, "$i$a$-with-Operations$WriteScope$setObjects$1":I
    nop

    .line 454
    iget v2, v0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    move-object v3, v0

    .local v3, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v4, 0x0

    .line 650
    .local v4, "$i$f$peekOperation":I
    iget-object v5, v3, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v6, v3, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v6, v6, -0x1

    aget-object v3, v5, v6

    .line 454
    .end local v3    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v4    # "$i$f$peekOperation":I
    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v3

    sub-int/2addr v2, v3

    .line 455
    .local v2, "base":I
    iget-object v3, v0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    .line 456
    .local v3, "objectArgs":[Ljava/lang/Object;
    add-int v4, v2, p1

    aput-object p2, v3, v4

    .line 457
    add-int v4, v2, p3

    aput-object p4, v3, v4

    .line 458
    nop

    .line 445
    .end local v0    # "$this$setObjects_4uCC6AY_u24lambda_u249":Landroidx/compose/runtime/changelist/Operations;
    .end local v1    # "$i$a$-with-Operations$WriteScope$setObjects$1":I
    .end local v2    # "base":I
    .end local v3    # "objectArgs":[Ljava/lang/Object;
    nop

    .line 458
    return-void
.end method

.method public static final setObjects-OGa0p1M(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 7
    .param p0, "arg0"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "parameter1"    # I
    .param p2, "value1"    # Ljava/lang/Object;
    .param p3, "parameter2"    # I
    .param p4, "value2"    # Ljava/lang/Object;
    .param p5, "parameter3"    # I
    .param p6, "value3"    # Ljava/lang/Object;
    .param p7, "parameter4"    # I
    .param p8, "value4"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "W:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/changelist/Operations;",
            "ITT;ITU;ITV;ITW;)V"
        }
    .end annotation

    .line 498
    move-object v0, p0

    .local v0, "$this$setObjects_OGa0p1M_u24lambda_u2413":Landroidx/compose/runtime/changelist/Operations;
    const/4 v1, 0x0

    .line 499
    .local v1, "$i$a$-with-Operations$WriteScope$setObjects$3":I
    nop

    .line 513
    iget v2, v0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    move-object v3, v0

    .local v3, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v4, 0x0

    .line 652
    .local v4, "$i$f$peekOperation":I
    iget-object v5, v3, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v6, v3, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v6, v6, -0x1

    aget-object v3, v5, v6

    .line 513
    .end local v3    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v4    # "$i$f$peekOperation":I
    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v3

    sub-int/2addr v2, v3

    .line 514
    .local v2, "base":I
    iget-object v3, v0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    .line 515
    .local v3, "objectArgs":[Ljava/lang/Object;
    add-int v4, v2, p1

    aput-object p2, v3, v4

    .line 516
    add-int v4, v2, p3

    aput-object p4, v3, v4

    .line 517
    add-int v4, v2, p5

    aput-object p6, v3, v4

    .line 518
    add-int v4, v2, p7

    aput-object p8, v3, v4

    .line 519
    nop

    .line 498
    .end local v0    # "$this$setObjects_OGa0p1M_u24lambda_u2413":Landroidx/compose/runtime/changelist/Operations;
    .end local v1    # "$i$a$-with-Operations$WriteScope$setObjects$3":I
    .end local v2    # "base":I
    .end local v3    # "objectArgs":[Ljava/lang/Object;
    nop

    .line 519
    return-void
.end method

.method public static final setObjects-t7hvbck(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 7
    .param p0, "arg0"    # Landroidx/compose/runtime/changelist/Operations;
    .param p1, "parameter1"    # I
    .param p2, "value1"    # Ljava/lang/Object;
    .param p3, "parameter2"    # I
    .param p4, "value2"    # Ljava/lang/Object;
    .param p5, "parameter3"    # I
    .param p6, "value3"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/runtime/changelist/Operations;",
            "ITT;ITU;ITV;)V"
        }
    .end annotation

    .line 468
    move-object v0, p0

    .local v0, "$this$setObjects_t7hvbck_u24lambda_u2411":Landroidx/compose/runtime/changelist/Operations;
    const/4 v1, 0x0

    .line 469
    .local v1, "$i$a$-with-Operations$WriteScope$setObjects$2":I
    nop

    .line 481
    iget v2, v0, Landroidx/compose/runtime/changelist/Operations;->objectArgsSize:I

    move-object v3, v0

    .local v3, "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    const/4 v4, 0x0

    .line 651
    .local v4, "$i$f$peekOperation":I
    iget-object v5, v3, Landroidx/compose/runtime/changelist/Operations;->opCodes:[Landroidx/compose/runtime/changelist/Operation;

    iget v6, v3, Landroidx/compose/runtime/changelist/Operations;->opCodesSize:I

    add-int/lit8 v6, v6, -0x1

    aget-object v3, v5, v6

    .line 481
    .end local v3    # "this_$iv":Landroidx/compose/runtime/changelist/Operations;
    .end local v4    # "$i$f$peekOperation":I
    invoke-virtual {v3}, Landroidx/compose/runtime/changelist/Operation;->getObjects()I

    move-result v3

    sub-int/2addr v2, v3

    .line 482
    .local v2, "base":I
    iget-object v3, v0, Landroidx/compose/runtime/changelist/Operations;->objectArgs:[Ljava/lang/Object;

    .line 483
    .local v3, "objectArgs":[Ljava/lang/Object;
    add-int v4, v2, p1

    aput-object p2, v3, v4

    .line 484
    add-int v4, v2, p3

    aput-object p4, v3, v4

    .line 485
    add-int v4, v2, p5

    aput-object p6, v3, v4

    .line 486
    nop

    .line 468
    .end local v0    # "$this$setObjects_t7hvbck_u24lambda_u2411":Landroidx/compose/runtime/changelist/Operations;
    .end local v1    # "$i$a$-with-Operations$WriteScope$setObjects$2":I
    .end local v2    # "base":I
    .end local v3    # "objectArgs":[Ljava/lang/Object;
    nop

    .line 486
    return-void
.end method

.method public static toString-impl(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WriteScope(stack="

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

    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations$WriteScope;->stack:Landroidx/compose/runtime/changelist/Operations;

    invoke-static {v0, p1}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->equals-impl(Landroidx/compose/runtime/changelist/Operations;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations$WriteScope;->stack:Landroidx/compose/runtime/changelist/Operations;

    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->hashCode-impl(Landroidx/compose/runtime/changelist/Operations;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations$WriteScope;->stack:Landroidx/compose/runtime/changelist/Operations;

    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operations$WriteScope;->toString-impl(Landroidx/compose/runtime/changelist/Operations;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()Landroidx/compose/runtime/changelist/Operations;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/changelist/Operations$WriteScope;->stack:Landroidx/compose/runtime/changelist/Operations;

    return-object v0
.end method
