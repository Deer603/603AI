.class public Landroidx/collection/SparseArrayCompat;
.super Ljava/lang/Object;
.source "SparseArrayCompat.jvm.kt"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,263:1\n250#2,9:264\n263#2,5:273\n271#2,5:278\n279#2,7:283\n294#2,9:290\n327#2,30:299\n360#2,2:329\n327#2,37:331\n367#2,3:368\n327#2,30:371\n371#2:401\n376#2,4:402\n383#2:406\n387#2,4:407\n395#2,5:411\n401#2:417\n406#2,5:418\n414#2,4:423\n422#2,9:427\n435#2:436\n440#2:437\n422#2,9:438\n445#2,8:447\n456#2,17:455\n476#2,21:472\n24#3:416\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n123#1:264,9\n126#1:273,5\n135#1:278,5\n144#1:283,7\n155#1:290,9\n161#1:299,30\n168#1:329,2\n168#1:331,37\n179#1:368,3\n179#1:371,30\n179#1:401\n182#1:402,4\n198#1:406\n204#1:407,4\n210#1:411,5\n210#1:417\n216#1:418,5\n226#1:423,4\n238#1:427,9\n241#1:436\n244#1:437\n244#1:438,9\n247#1:447,8\n253#1:455,17\n261#1:472,21\n210#1:416\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u001f\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0016\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0011\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0008\u0010\u0017\u001a\u00020\u0013H\u0016J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0017J\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u0004H\u0096\u0002\u00a2\u0006\u0002\u0010\u001eJ\u001d\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010#J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016J\u001d\u0010&\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\'\u001a\u00020\u00132\u000e\u0010(\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u0000H\u0016J\u001f\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010 J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010*\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0004H\u0016J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u001f\u0010-\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010 J%\u0010-\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010.\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00100J\u001d\u00101\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0008\u0010\r\u001a\u00020\u0004H\u0016J\u0008\u00102\u001a\u000203H\u0016J\u0015\u00104\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0004H\u0016\u00a2\u0006\u0002\u0010\u001eR\u0012\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0008\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u000c8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0011\u00a8\u00065"
    }
    d2 = {
        "Landroidx/collection/SparseArrayCompat;",
        "E",
        "",
        "initialCapacity",
        "",
        "(I)V",
        "garbage",
        "",
        "isEmpty",
        "getIsEmpty",
        "()Z",
        "keys",
        "",
        "size",
        "values",
        "",
        "",
        "[Ljava/lang/Object;",
        "append",
        "",
        "key",
        "value",
        "(ILjava/lang/Object;)V",
        "clear",
        "clone",
        "containsKey",
        "containsValue",
        "(Ljava/lang/Object;)Z",
        "delete",
        "get",
        "(I)Ljava/lang/Object;",
        "defaultValue",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
        "indexOfKey",
        "indexOfValue",
        "(Ljava/lang/Object;)I",
        "keyAt",
        "index",
        "put",
        "putAll",
        "other",
        "putIfAbsent",
        "remove",
        "removeAt",
        "removeAtRange",
        "replace",
        "oldValue",
        "newValue",
        "(ILjava/lang/Object;Ljava/lang/Object;)Z",
        "setValueAt",
        "toString",
        "",
        "valueAt",
        "collection"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public synthetic garbage:Z

.field public synthetic keys:[I

.field public synthetic size:I

.field public synthetic values:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/collection/SparseArrayCompat;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .param p1, "initialCapacity"    # I

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    nop

    .line 75
    if-nez p1, :cond_0

    .line 76
    sget-object v0, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_INTS:[I

    iput-object v0, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 77
    sget-object v0, Landroidx/collection/internal/ContainerHelpersKt;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v0, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    goto :goto_0

    .line 79
    :cond_0
    invoke-static {p1}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    move-result v0

    .line 80
    .local v0, "capacity":I
    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 81
    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 83
    .end local v0    # "capacity":I
    :goto_0
    nop

    .line 57
    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 57
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0xa

    :cond_0
    invoke-direct {p0, p1}, Landroidx/collection/SparseArrayCompat;-><init>(I)V

    return-void
.end method


# virtual methods
.method public append(ILjava/lang/Object;)V
    .locals 6
    .param p1, "key"    # I
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 253
    move-object v0, p0

    .local v0, "$this$commonAppend$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 455
    .local v1, "$i$f$commonAppend":I
    iget v2, v0, Landroidx/collection/SparseArrayCompat;->size:I

    if-eqz v2, :cond_0

    iget-object v2, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    if-gt p1, v2, :cond_0

    .line 456
    invoke-virtual {v0, p1, p2}, Landroidx/collection/SparseArrayCompat;->put(ILjava/lang/Object;)V

    .line 457
    goto :goto_0

    .line 459
    :cond_0
    iget-boolean v2, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v2, :cond_1

    iget v2, v0, Landroidx/collection/SparseArrayCompat;->size:I

    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    array-length v3, v3

    if-lt v2, v3, :cond_1

    .line 460
    invoke-static {v0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 462
    :cond_1
    iget v2, v0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 463
    .local v2, "pos$iv":I
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    array-length v3, v3

    if-lt v2, v3, :cond_2

    .line 464
    add-int/lit8 v3, v2, 0x1

    invoke-static {v3}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    move-result v3

    .line 465
    .local v3, "n$iv":I
    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    const-string v5, "copyOf(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 466
    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 468
    .end local v3    # "n$iv":I
    :cond_2
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    aput p1, v3, v2

    .line 469
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p2, v3, v2

    .line 470
    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 471
    nop

    .line 253
    .end local v0    # "$this$commonAppend$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonAppend":I
    .end local v2    # "pos$iv":I
    :goto_0
    return-void
.end method

.method public clear()V
    .locals 6

    .line 247
    move-object v0, p0

    .local v0, "$this$commonClear$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 447
    .local v1, "$i$f$commonClear":I
    iget v2, v0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 448
    .local v2, "n$iv":I
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 449
    .local v3, "values$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .local v4, "i$iv":I
    :goto_0
    if-ge v4, v2, :cond_0

    .line 450
    const/4 v5, 0x0

    aput-object v5, v3, v4

    .line 449
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 452
    .end local v4    # "i$iv":I
    :cond_0
    const/4 v4, 0x0

    iput v4, v0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 453
    iput-boolean v4, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 454
    nop

    .line 247
    .end local v0    # "$this$commonClear$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonClear":I
    .end local v2    # "n$iv":I
    .end local v3    # "values$iv":[Ljava/lang/Object;
    return-void
.end method

.method public clone()Landroidx/collection/SparseArrayCompat;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/SparseArrayCompat<",
            "TE;>;"
        }
    .end annotation

    .line 87
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/collection/SparseArrayCompat;

    .line 88
    .local v0, "clone":Landroidx/collection/SparseArrayCompat;
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->keys:[I

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 89
    iget-object v1, p0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 90
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 55
    invoke-virtual {p0}, Landroidx/collection/SparseArrayCompat;->clone()Landroidx/collection/SparseArrayCompat;

    move-result-object v0

    return-object v0
.end method

.method public containsKey(I)Z
    .locals 3
    .param p1, "key"    # I

    .line 241
    move-object v0, p0

    .local v0, "$this$commonContainsKey$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 436
    .local v1, "$i$f$commonContainsKey":I
    invoke-virtual {v0, p1}, Landroidx/collection/SparseArrayCompat;->indexOfKey(I)I

    move-result v2

    if-ltz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 241
    .end local v0    # "$this$commonContainsKey$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonContainsKey":I
    :goto_0
    return v2
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 7
    .param p1, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 244
    move-object v0, p0

    .local v0, "$this$commonContainsValue$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 437
    .local v1, "$i$f$commonContainsValue":I
    move-object v2, v0

    .local v2, "$this$commonIndexOfValue$iv$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v3, 0x0

    .line 438
    .local v3, "$i$f$commonIndexOfValue":I
    iget-boolean v4, v2, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v4, :cond_0

    .line 439
    invoke-static {v2}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 441
    :cond_0
    const/4 v4, 0x0

    .local v4, "i$iv$iv":I
    iget v5, v2, Landroidx/collection/SparseArrayCompat;->size:I

    :goto_0
    if-ge v4, v5, :cond_2

    .line 442
    iget-object v6, v2, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v6, v6, v4

    if-ne v6, p1, :cond_1

    .line 443
    goto :goto_1

    .line 441
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 446
    .end local v4    # "i$iv$iv":I
    :cond_2
    const/4 v4, -0x1

    .line 437
    .end local v2    # "$this$commonIndexOfValue$iv$iv":Landroidx/collection/SparseArrayCompat;
    .end local v3    # "$i$f$commonIndexOfValue":I
    :goto_1
    if-ltz v4, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    .line 244
    .end local v0    # "$this$commonContainsValue$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonContainsValue":I
    :goto_2
    return v2
.end method

.method public delete(I)V
    .locals 0
    .param p1, "key"    # I
    .annotation runtime Lkotlin/Deprecated;
        message = "Alias for remove(int)."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "remove(key)"
            imports = {}
        .end subannotation
    .end annotation

    .line 109
    invoke-virtual {p0, p1}, Landroidx/collection/SparseArrayCompat;->remove(I)V

    .line 110
    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .param p1, "key"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 96
    invoke-static {p0, p1}, Landroidx/collection/SparseArrayCompatKt;->commonGet(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "key"    # I
    .param p2, "defaultValue"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .line 102
    invoke-static {p0, p1, p2}, Landroidx/collection/SparseArrayCompatKt;->commonGet(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getIsEmpty()Z
    .locals 1

    .line 191
    invoke-virtual {p0}, Landroidx/collection/SparseArrayCompat;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public indexOfKey(I)I
    .locals 4
    .param p1, "key"    # I

    .line 226
    move-object v0, p0

    .local v0, "$this$commonIndexOfKey$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 423
    .local v1, "$i$f$commonIndexOfKey":I
    iget-boolean v2, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v2, :cond_0

    .line 424
    invoke-static {v0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 426
    :cond_0
    iget-object v2, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v2, v3, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    move-result v0

    .line 226
    .end local v0    # "$this$commonIndexOfKey$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonIndexOfKey":I
    return v0
.end method

.method public indexOfValue(Ljava/lang/Object;)I
    .locals 5
    .param p1, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)I"
        }
    .end annotation

    .line 238
    move-object v0, p0

    .local v0, "$this$commonIndexOfValue$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 427
    .local v1, "$i$f$commonIndexOfValue":I
    iget-boolean v2, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v2, :cond_0

    .line 428
    invoke-static {v0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 430
    :cond_0
    const/4 v2, 0x0

    .local v2, "i$iv":I
    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    :goto_0
    if-ge v2, v3, :cond_2

    .line 431
    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v4, v4, v2

    if-ne v4, p1, :cond_1

    .line 432
    goto :goto_1

    .line 430
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 435
    .end local v2    # "i$iv":I
    :cond_2
    const/4 v2, -0x1

    .line 238
    .end local v0    # "$this$commonIndexOfValue$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonIndexOfValue":I
    :goto_1
    return v2
.end method

.method public isEmpty()Z
    .locals 3

    .line 198
    move-object v0, p0

    .local v0, "$this$commonIsEmpty$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 406
    .local v1, "$i$f$commonIsEmpty":I
    invoke-virtual {v0}, Landroidx/collection/SparseArrayCompat;->size()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 198
    .end local v0    # "$this$commonIsEmpty$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonIsEmpty":I
    :goto_0
    return v2
.end method

.method public keyAt(I)I
    .locals 3
    .param p1, "index"    # I

    .line 204
    move-object v0, p0

    .local v0, "$this$commonKeyAt$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 407
    .local v1, "$i$f$commonKeyAt":I
    iget-boolean v2, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v2, :cond_0

    .line 408
    invoke-static {v0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 410
    :cond_0
    iget-object v2, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    aget v0, v2, p1

    .line 204
    .end local v0    # "$this$commonKeyAt$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonKeyAt":I
    return v0
.end method

.method public put(ILjava/lang/Object;)V
    .locals 7
    .param p1, "key"    # I
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 161
    move-object v0, p0

    .local v0, "$this$commonPut$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 299
    .local v1, "$i$f$commonPut":I
    iget-object v2, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v2, v3, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    move-result v2

    .line 300
    .local v2, "i$iv":I
    if-ltz v2, :cond_0

    .line 301
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p2, v3, v2

    goto/16 :goto_0

    .line 303
    :cond_0
    not-int v2, v2

    .line 304
    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    if-ge v2, v3, :cond_1

    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v3, v3, v2

    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_1

    .line 305
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    aput p1, v3, v2

    .line 306
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p2, v3, v2

    .line 307
    goto :goto_1

    .line 309
    :cond_1
    iget-boolean v3, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v3, :cond_2

    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    array-length v4, v4

    if-lt v3, v4, :cond_2

    .line 310
    invoke-static {v0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 313
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget v4, v0, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v3, v4, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    move-result v3

    not-int v2, v3

    .line 315
    :cond_2
    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    array-length v4, v4

    if-lt v3, v4, :cond_3

    .line 316
    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    move-result v3

    .line 317
    .local v3, "n$iv":I
    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    const-string v5, "copyOf(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 318
    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 320
    .end local v3    # "n$iv":I
    :cond_3
    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    sub-int/2addr v3, v2

    if-eqz v3, :cond_4

    .line 321
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    add-int/lit8 v5, v2, 0x1

    iget v6, v0, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v3, v4, v5, v2, v6}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    .line 322
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    add-int/lit8 v5, v2, 0x1

    iget v6, v0, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v3, v4, v5, v2, v6}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 324
    :cond_4
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->keys:[I

    aput p1, v3, v2

    .line 325
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p2, v3, v2

    .line 326
    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 328
    :goto_0
    nop

    .line 161
    .end local v0    # "$this$commonPut$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonPut":I
    .end local v2    # "i$iv":I
    :goto_1
    return-void
.end method

.method public putAll(Landroidx/collection/SparseArrayCompat;)V
    .locals 13
    .param p1, "other"    # Landroidx/collection/SparseArrayCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/SparseArrayCompat<",
            "+TE;>;)V"
        }
    .end annotation

    const-string/jumbo v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    move-object v0, p0

    .local v0, "$this$commonPutAll$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 329
    .local v1, "$i$f$commonPutAll":I
    const/4 v2, 0x0

    .local v2, "i$iv":I
    invoke-virtual {p1}, Landroidx/collection/SparseArrayCompat;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_5

    .line 330
    invoke-virtual {p1, v2}, Landroidx/collection/SparseArrayCompat;->keyAt(I)I

    move-result v4

    .local v4, "key$iv$iv":I
    invoke-virtual {p1, v2}, Landroidx/collection/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    .local v5, "value$iv$iv":Ljava/lang/Object;
    move-object v6, v0

    .local v6, "$this$commonPut$iv$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v7, 0x0

    .line 331
    .local v7, "$i$f$commonPut":I
    iget-object v8, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget v9, v6, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v8, v9, v4}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    move-result v8

    .line 332
    .local v8, "i$iv$iv":I
    if-ltz v8, :cond_0

    .line 333
    iget-object v9, v6, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object v5, v9, v8

    goto/16 :goto_1

    .line 335
    :cond_0
    not-int v8, v8

    .line 336
    iget v9, v6, Landroidx/collection/SparseArrayCompat;->size:I

    if-ge v8, v9, :cond_1

    iget-object v9, v6, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v9, v9, v8

    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_1

    .line 337
    iget-object v9, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    aput v4, v9, v8

    .line 338
    iget-object v9, v6, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object v5, v9, v8

    .line 339
    goto :goto_2

    .line 341
    :cond_1
    iget-boolean v9, v6, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v9, :cond_2

    iget v9, v6, Landroidx/collection/SparseArrayCompat;->size:I

    iget-object v10, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    array-length v10, v10

    if-lt v9, v10, :cond_2

    .line 342
    invoke-static {v6}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 345
    iget-object v9, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget v10, v6, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v9, v10, v4}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    move-result v9

    not-int v8, v9

    .line 347
    :cond_2
    iget v9, v6, Landroidx/collection/SparseArrayCompat;->size:I

    iget-object v10, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    array-length v10, v10

    if-lt v9, v10, :cond_3

    .line 348
    iget v9, v6, Landroidx/collection/SparseArrayCompat;->size:I

    add-int/lit8 v9, v9, 0x1

    invoke-static {v9}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    move-result v9

    .line 349
    .local v9, "n$iv$iv":I
    iget-object v10, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    invoke-static {v10, v9}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v10

    const-string v11, "copyOf(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 350
    iget-object v10, v6, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    invoke-static {v10, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v6, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 352
    .end local v9    # "n$iv$iv":I
    :cond_3
    iget v9, v6, Landroidx/collection/SparseArrayCompat;->size:I

    sub-int/2addr v9, v8

    if-eqz v9, :cond_4

    .line 353
    iget-object v9, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget-object v10, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    add-int/lit8 v11, v8, 0x1

    iget v12, v6, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v9, v10, v11, v8, v12}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    .line 354
    iget-object v9, v6, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    iget-object v10, v6, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    add-int/lit8 v11, v8, 0x1

    iget v12, v6, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v9, v10, v11, v8, v12}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 356
    :cond_4
    iget-object v9, v6, Landroidx/collection/SparseArrayCompat;->keys:[I

    aput v4, v9, v8

    .line 357
    iget-object v9, v6, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object v5, v9, v8

    .line 358
    iget v9, v6, Landroidx/collection/SparseArrayCompat;->size:I

    add-int/lit8 v9, v9, 0x1

    iput v9, v6, Landroidx/collection/SparseArrayCompat;->size:I

    .line 360
    :goto_1
    nop

    .line 329
    .end local v4    # "key$iv$iv":I
    .end local v5    # "value$iv$iv":Ljava/lang/Object;
    .end local v6    # "$this$commonPut$iv$iv":Landroidx/collection/SparseArrayCompat;
    .end local v7    # "$i$f$commonPut":I
    .end local v8    # "i$iv$iv":I
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 367
    .end local v2    # "i$iv":I
    :cond_5
    nop

    .line 168
    .end local v0    # "$this$commonPutAll$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonPutAll":I
    return-void
.end method

.method public putIfAbsent(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "key"    # I
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .line 179
    move-object v0, p0

    .local v0, "$this$commonPutIfAbsent$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 368
    .local v1, "$i$f$commonPutIfAbsent":I
    invoke-static {v0, p1}, Landroidx/collection/SparseArrayCompatKt;->commonGet(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;

    move-result-object v2

    .line 369
    .local v2, "mapValue$iv":Ljava/lang/Object;
    if-nez v2, :cond_5

    .line 370
    move-object v3, v0

    .local v3, "$this$commonPut$iv$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v4, 0x0

    .line 371
    .local v4, "$i$f$commonPut":I
    iget-object v5, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget v6, v3, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v5, v6, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    move-result v5

    .line 372
    .local v5, "i$iv$iv":I
    if-ltz v5, :cond_0

    .line 373
    iget-object v6, v3, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p2, v6, v5

    goto/16 :goto_0

    .line 375
    :cond_0
    not-int v5, v5

    .line 376
    iget v6, v3, Landroidx/collection/SparseArrayCompat;->size:I

    if-ge v5, v6, :cond_1

    iget-object v6, v3, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v6, v6, v5

    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_1

    .line 377
    iget-object v6, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    aput p1, v6, v5

    .line 378
    iget-object v6, v3, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p2, v6, v5

    .line 379
    goto :goto_1

    .line 381
    :cond_1
    iget-boolean v6, v3, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v6, :cond_2

    iget v6, v3, Landroidx/collection/SparseArrayCompat;->size:I

    iget-object v7, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    array-length v7, v7

    if-lt v6, v7, :cond_2

    .line 382
    invoke-static {v3}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 385
    iget-object v6, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget v7, v3, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v6, v7, p1}, Landroidx/collection/internal/ContainerHelpersKt;->binarySearch([III)I

    move-result v6

    not-int v5, v6

    .line 387
    :cond_2
    iget v6, v3, Landroidx/collection/SparseArrayCompat;->size:I

    iget-object v7, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    array-length v7, v7

    if-lt v6, v7, :cond_3

    .line 388
    iget v6, v3, Landroidx/collection/SparseArrayCompat;->size:I

    add-int/lit8 v6, v6, 0x1

    invoke-static {v6}, Landroidx/collection/internal/ContainerHelpersKt;->idealIntArraySize(I)I

    move-result v6

    .line 389
    .local v6, "n$iv$iv":I
    iget-object v7, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v7

    const-string v8, "copyOf(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    .line 390
    iget-object v7, v3, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v3, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    .line 392
    .end local v6    # "n$iv$iv":I
    :cond_3
    iget v6, v3, Landroidx/collection/SparseArrayCompat;->size:I

    sub-int/2addr v6, v5

    if-eqz v6, :cond_4

    .line 393
    iget-object v6, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    iget-object v7, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    add-int/lit8 v8, v5, 0x1

    iget v9, v3, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v6, v7, v8, v5, v9}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    .line 394
    iget-object v6, v3, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    iget-object v7, v3, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    add-int/lit8 v8, v5, 0x1

    iget v9, v3, Landroidx/collection/SparseArrayCompat;->size:I

    invoke-static {v6, v7, v8, v5, v9}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 396
    :cond_4
    iget-object v6, v3, Landroidx/collection/SparseArrayCompat;->keys:[I

    aput p1, v6, v5

    .line 397
    iget-object v6, v3, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p2, v6, v5

    .line 398
    iget v6, v3, Landroidx/collection/SparseArrayCompat;->size:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v3, Landroidx/collection/SparseArrayCompat;->size:I

    .line 400
    :goto_0
    nop

    .line 401
    .end local v3    # "$this$commonPut$iv$iv":Landroidx/collection/SparseArrayCompat;
    .end local v4    # "$i$f$commonPut":I
    .end local v5    # "i$iv$iv":I
    :cond_5
    :goto_1
    nop

    .line 179
    .end local v0    # "$this$commonPutIfAbsent$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonPutIfAbsent":I
    .end local v2    # "mapValue$iv":Ljava/lang/Object;
    return-object v2
.end method

.method public remove(I)V
    .locals 0
    .param p1, "key"    # I

    .line 113
    invoke-static {p0, p1}, Landroidx/collection/SparseArrayCompatKt;->commonRemove(Landroidx/collection/SparseArrayCompat;I)V

    return-void
.end method

.method public remove(ILjava/lang/Object;)Z
    .locals 5
    .param p1, "key"    # I
    .param p2, "value"    # Ljava/lang/Object;

    .line 123
    move-object v0, p0

    .local v0, "$this$commonRemove$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 264
    .local v1, "$i$f$commonRemove":I
    invoke-virtual {v0, p1}, Landroidx/collection/SparseArrayCompat;->indexOfKey(I)I

    move-result v2

    .line 265
    .local v2, "index$iv":I
    if-ltz v2, :cond_0

    .line 266
    invoke-virtual {v0, v2}, Landroidx/collection/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    .line 267
    .local v3, "mapValue$iv":Ljava/lang/Object;
    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 268
    invoke-virtual {v0, v2}, Landroidx/collection/SparseArrayCompat;->removeAt(I)V

    .line 269
    const/4 v4, 0x1

    goto :goto_0

    .line 272
    .end local v3    # "mapValue$iv":Ljava/lang/Object;
    :cond_0
    const/4 v4, 0x0

    .line 123
    .end local v0    # "$this$commonRemove$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonRemove":I
    .end local v2    # "index$iv":I
    :goto_0
    return v4
.end method

.method public removeAt(I)V
    .locals 4
    .param p1, "index"    # I

    .line 126
    move-object v0, p0

    .local v0, "$this$commonRemoveAt$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 273
    .local v1, "$i$f$commonRemoveAt":I
    iget-object v2, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v2, v2, p1

    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    move-result-object v3

    if-eq v2, v3, :cond_0

    .line 274
    iget-object v2, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    invoke-static {}, Landroidx/collection/SparseArrayCompatKt;->access$getDELETED$p()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, p1

    .line 275
    const/4 v2, 0x1

    iput-boolean v2, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    .line 277
    :cond_0
    nop

    .line 126
    .end local v0    # "$this$commonRemoveAt$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonRemoveAt":I
    return-void
.end method

.method public removeAtRange(II)V
    .locals 4
    .param p1, "index"    # I
    .param p2, "size"    # I

    .line 135
    move-object v0, p0

    .local v0, "$this$commonRemoveAtRange$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 278
    .local v1, "$i$f$commonRemoveAtRange":I
    add-int v2, p1, p2

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 279
    .local v2, "end$iv":I
    move v3, p1

    .local v3, "i$iv":I
    :goto_0
    if-ge v3, v2, :cond_0

    .line 280
    invoke-virtual {v0, v3}, Landroidx/collection/SparseArrayCompat;->removeAt(I)V

    .line 279
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 282
    .end local v3    # "i$iv":I
    :cond_0
    nop

    .line 135
    .end local v0    # "$this$commonRemoveAtRange$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonRemoveAtRange":I
    .end local v2    # "end$iv":I
    return-void
.end method

.method public replace(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "key"    # I
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .line 144
    move-object v0, p0

    .local v0, "$this$commonReplace$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 283
    .local v1, "$i$f$commonReplace":I
    invoke-virtual {v0, p1}, Landroidx/collection/SparseArrayCompat;->indexOfKey(I)I

    move-result v2

    .line 284
    .local v2, "index$iv":I
    if-ltz v2, :cond_0

    .line 285
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v3, v3, v2

    .line 286
    .local v3, "oldValue$iv":Ljava/lang/Object;
    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p2, v4, v2

    .line 287
    goto :goto_0

    .line 289
    .end local v3    # "oldValue$iv":Ljava/lang/Object;
    :cond_0
    const/4 v3, 0x0

    .line 144
    .end local v0    # "$this$commonReplace$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonReplace":I
    .end local v2    # "index$iv":I
    :goto_0
    return-object v3
.end method

.method public replace(ILjava/lang/Object;Ljava/lang/Object;)Z
    .locals 5
    .param p1, "key"    # I
    .param p2, "oldValue"    # Ljava/lang/Object;
    .param p3, "newValue"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;TE;)Z"
        }
    .end annotation

    .line 155
    move-object v0, p0

    .local v0, "$this$commonReplace$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 290
    .local v1, "$i$f$commonReplace":I
    invoke-virtual {v0, p1}, Landroidx/collection/SparseArrayCompat;->indexOfKey(I)I

    move-result v2

    .line 291
    .local v2, "index$iv":I
    if-ltz v2, :cond_0

    .line 292
    iget-object v3, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v3, v3, v2

    .line 293
    .local v3, "mapValue$iv":Ljava/lang/Object;
    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 294
    iget-object v4, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p3, v4, v2

    .line 295
    const/4 v4, 0x1

    goto :goto_0

    .line 298
    .end local v3    # "mapValue$iv":Ljava/lang/Object;
    :cond_0
    const/4 v4, 0x0

    .line 155
    .end local v0    # "$this$commonReplace$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonReplace":I
    .end local v2    # "index$iv":I
    :goto_0
    return v4
.end method

.method public setValueAt(ILjava/lang/Object;)V
    .locals 3
    .param p1, "index"    # I
    .param p2, "value"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 216
    move-object v0, p0

    .local v0, "$this$commonSetValueAt$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 418
    .local v1, "$i$f$commonSetValueAt":I
    iget-boolean v2, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v2, :cond_0

    .line 419
    invoke-static {v0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 421
    :cond_0
    iget-object v2, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aput-object p2, v2, p1

    .line 422
    nop

    .line 216
    .end local v0    # "$this$commonSetValueAt$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonSetValueAt":I
    return-void
.end method

.method public size()I
    .locals 3

    .line 182
    move-object v0, p0

    .local v0, "$this$commonSize$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 402
    .local v1, "$i$f$commonSize":I
    iget-boolean v2, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v2, :cond_0

    .line 403
    invoke-static {v0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 405
    :cond_0
    iget v0, v0, Landroidx/collection/SparseArrayCompat;->size:I

    .line 182
    .end local v0    # "$this$commonSize$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonSize":I
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 261
    move-object v0, p0

    .local v0, "$this$commonToString$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 472
    .local v1, "$i$f$commonToString":I
    invoke-virtual {v0}, Landroidx/collection/SparseArrayCompat;->size()I

    move-result v2

    if-gtz v2, :cond_0

    .line 473
    const-string/jumbo v2, "{}"

    goto :goto_2

    .line 475
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    iget v3, v0, Landroidx/collection/SparseArrayCompat;->size:I

    mul-int/lit8 v3, v3, 0x1c

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 476
    .local v2, "buffer$iv":Ljava/lang/StringBuilder;
    const/16 v3, 0x7b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 477
    const/4 v3, 0x0

    .local v3, "i$iv":I
    iget v4, v0, Landroidx/collection/SparseArrayCompat;->size:I

    :goto_0
    if-ge v3, v4, :cond_3

    .line 478
    if-lez v3, :cond_1

    .line 479
    const-string v5, ", "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    :cond_1
    invoke-virtual {v0, v3}, Landroidx/collection/SparseArrayCompat;->keyAt(I)I

    move-result v5

    .line 482
    .local v5, "key$iv":I
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 483
    const/16 v6, 0x3d

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 484
    invoke-virtual {v0, v3}, Landroidx/collection/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    .line 485
    .local v6, "value$iv":Ljava/lang/Object;
    if-eq v6, v0, :cond_2

    .line 486
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 488
    :cond_2
    const-string v7, "(this Map)"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .end local v5    # "key$iv":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 491
    .end local v3    # "i$iv":I
    :cond_3
    const/16 v3, 0x7d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 492
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v3

    .line 261
    .end local v0    # "$this$commonToString$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonToString":I
    .end local v2    # "buffer$iv":Ljava/lang/StringBuilder;
    :goto_2
    return-object v2
.end method

.method public valueAt(I)Ljava/lang/Object;
    .locals 5
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 210
    move-object v0, p0

    .local v0, "$this$commonValueAt$iv":Landroidx/collection/SparseArrayCompat;
    const/4 v1, 0x0

    .line 411
    .local v1, "$i$f$commonValueAt":I
    iget-boolean v2, v0, Landroidx/collection/SparseArrayCompat;->garbage:Z

    if-eqz v2, :cond_0

    .line 412
    invoke-static {v0}, Landroidx/collection/SparseArrayCompatKt;->access$gc(Landroidx/collection/SparseArrayCompat;)V

    .line 414
    :cond_0
    iget-object v2, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    array-length v2, v2

    if-ge p1, v2, :cond_1

    .line 417
    iget-object v2, v0, Landroidx/collection/SparseArrayCompat;->values:[Ljava/lang/Object;

    aget-object v0, v2, p1

    .line 210
    .end local v0    # "$this$commonValueAt$iv":Landroidx/collection/SparseArrayCompat;
    .end local v1    # "$i$f$commonValueAt":I
    return-object v0

    .line 415
    .restart local v0    # "$this$commonValueAt$iv":Landroidx/collection/SparseArrayCompat;
    .restart local v1    # "$i$f$commonValueAt":I
    :cond_1
    sget-object v2, Landroidx/collection/CollectionPlatformUtils;->INSTANCE:Landroidx/collection/CollectionPlatformUtils;

    .local v2, "this_$iv$iv":Landroidx/collection/CollectionPlatformUtils;
    const/4 v3, 0x0

    .line 416
    .local v3, "$i$f$createIndexOutOfBoundsException$collection":I
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v4}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    check-cast v4, Ljava/lang/IndexOutOfBoundsException;

    .end local v2    # "this_$iv$iv":Landroidx/collection/CollectionPlatformUtils;
    .end local v3    # "$i$f$createIndexOutOfBoundsException$collection":I
    throw v4
.end method
