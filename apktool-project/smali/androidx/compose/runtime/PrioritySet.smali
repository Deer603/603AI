.class public final Landroidx/compose/runtime/PrioritySet;
.super Ljava/lang/Object;
.source "SlotTable.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 IntList.kt\nandroidx/collection/IntListKt\n*L\n1#1,3963:1\n366#2:3964\n65#2:3965\n65#2:3966\n363#2:3967\n366#2:3968\n65#2:3969\n366#2:3974\n65#2:3975\n65#2:3976\n65#2:3977\n65#2:3978\n4658#3,4:3970\n57#4,5:3979\n57#4,5:3984\n905#5:3989\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3875#1:3964\n3875#1:3965\n3877#1:3966\n3892#1:3967\n3894#1:3968\n3900#1:3969\n3907#1:3974\n3910#1:3975\n3912#1:3976\n3913#1:3977\n3944#1:3978\n3900#1:3970,4\n3948#1:3979,5\n3949#1:3984,5\n3871#1:3989\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001a\u0010\u0013J\r\u0010\u001b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\r\u0010!\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\"\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/runtime/PrioritySet;",
        "",
        "list",
        "Landroidx/collection/MutableIntList;",
        "constructor-impl",
        "(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;",
        "add",
        "",
        "value",
        "",
        "add-impl",
        "(Landroidx/collection/MutableIntList;I)V",
        "equals",
        "",
        "other",
        "equals-impl",
        "(Landroidx/collection/MutableIntList;Ljava/lang/Object;)Z",
        "hashCode",
        "hashCode-impl",
        "(Landroidx/collection/MutableIntList;)I",
        "isEmpty",
        "isEmpty-impl",
        "(Landroidx/collection/MutableIntList;)Z",
        "isNotEmpty",
        "isNotEmpty-impl",
        "peek",
        "peek-impl",
        "takeMax",
        "takeMax-impl",
        "toString",
        "",
        "toString-impl",
        "(Landroidx/collection/MutableIntList;)Ljava/lang/String;",
        "validateHeap",
        "validateHeap-impl",
        "(Landroidx/collection/MutableIntList;)V",
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
.field private final list:Landroidx/collection/MutableIntList;


# direct methods
.method private synthetic constructor <init>(Landroidx/collection/MutableIntList;)V
    .locals 0
    .param p1, "list"    # Landroidx/collection/MutableIntList;

    .line 3871
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/PrioritySet;->list:Landroidx/collection/MutableIntList;

    return-void
.end method

.method public static final add-impl(Landroidx/collection/MutableIntList;I)V
    .locals 5
    .param p0, "arg0"    # Landroidx/collection/MutableIntList;
    .param p1, "value"    # I

    .line 3875
    move-object v0, p0

    check-cast v0, Landroidx/collection/IntList;

    .local v0, "this_$iv":Landroidx/collection/IntList;
    const/4 v1, 0x0

    .line 3964
    .local v1, "$i$f$isNotEmpty":I
    iget v2, v0, Landroidx/collection/IntList;->_size:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    .line 3875
    .end local v0    # "this_$iv":Landroidx/collection/IntList;
    .end local v1    # "$i$f$isNotEmpty":I
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0, v3}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v0

    if-eq v0, p1, :cond_1

    move-object v0, p0

    check-cast v0, Landroidx/collection/IntList;

    .restart local v0    # "this_$iv":Landroidx/collection/IntList;
    const/4 v1, 0x0

    .line 3965
    .local v1, "$i$f$getSize":I
    iget v0, v0, Landroidx/collection/IntList;->_size:I

    .line 3875
    .end local v0    # "this_$iv":Landroidx/collection/IntList;
    .end local v1    # "$i$f$getSize":I
    sub-int/2addr v0, v4

    invoke-virtual {p0, v0}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v0

    if-ne v0, p1, :cond_2

    :cond_1
    return-void

    .line 3877
    :cond_2
    move-object v0, p0

    check-cast v0, Landroidx/collection/IntList;

    .restart local v0    # "this_$iv":Landroidx/collection/IntList;
    const/4 v1, 0x0

    .line 3966
    .restart local v1    # "$i$f$getSize":I
    iget v0, v0, Landroidx/collection/IntList;->_size:I

    .line 3877
    .end local v0    # "this_$iv":Landroidx/collection/IntList;
    .end local v1    # "$i$f$getSize":I
    nop

    .line 3878
    .local v0, "index":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 3881
    :goto_1
    if-lez v0, :cond_4

    .line 3882
    add-int/lit8 v1, v0, 0x1

    ushr-int/2addr v1, v4

    sub-int/2addr v1, v4

    .line 3883
    .local v1, "parent":I
    invoke-virtual {p0, v1}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v2

    .line 3884
    .local v2, "parentValue":I
    if-le p1, v2, :cond_3

    .line 3885
    invoke-virtual {p0, v0, v2}, Landroidx/collection/MutableIntList;->set(II)I

    .line 3887
    move v0, v1

    .end local v1    # "parent":I
    .end local v2    # "parentValue":I
    goto :goto_1

    .line 3886
    .restart local v1    # "parent":I
    .restart local v2    # "parentValue":I
    :cond_3
    nop

    .line 3889
    .end local v1    # "parent":I
    .end local v2    # "parentValue":I
    :cond_4
    invoke-virtual {p0, v0, p1}, Landroidx/collection/MutableIntList;->set(II)I

    .line 3890
    return-void
.end method

.method public static final synthetic box-impl(Landroidx/collection/MutableIntList;)Landroidx/compose/runtime/PrioritySet;
    .locals 1

    new-instance v0, Landroidx/compose/runtime/PrioritySet;

    invoke-direct {v0, p0}, Landroidx/compose/runtime/PrioritySet;-><init>(Landroidx/collection/MutableIntList;)V

    return-object v0
.end method

.method public static constructor-impl(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;
    .locals 0

    return-object p0
.end method

.method public static synthetic constructor-impl$default(Landroidx/collection/MutableIntList;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableIntList;
    .locals 2

    .line 3871
    const/4 p2, 0x1

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    .line 3989
    .local p0, "$i$f$mutableIntListOf":I
    new-instance p1, Landroidx/collection/MutableIntList;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p0, p1

    .line 3871
    .end local p0    # "$i$f$mutableIntListOf":I
    :cond_0
    invoke-static {p0}, Landroidx/compose/runtime/PrioritySet;->constructor-impl(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;

    move-result-object p0

    return-object p0
.end method

.method public static equals-impl(Landroidx/collection/MutableIntList;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/compose/runtime/PrioritySet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/PrioritySet;

    invoke-virtual {v0}, Landroidx/compose/runtime/PrioritySet;->unbox-impl()Landroidx/collection/MutableIntList;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static final equals-impl0(Landroidx/collection/MutableIntList;Landroidx/collection/MutableIntList;)Z
    .locals 1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static hashCode-impl(Landroidx/collection/MutableIntList;)I
    .locals 1

    invoke-virtual {p0}, Landroidx/collection/MutableIntList;->hashCode()I

    move-result v0

    return v0
.end method

.method public static final isEmpty-impl(Landroidx/collection/MutableIntList;)Z
    .locals 3
    .param p0, "arg0"    # Landroidx/collection/MutableIntList;

    .line 3892
    move-object v0, p0

    check-cast v0, Landroidx/collection/IntList;

    .local v0, "this_$iv":Landroidx/collection/IntList;
    const/4 v1, 0x0

    .line 3967
    .local v1, "$i$f$isEmpty":I
    iget v2, v0, Landroidx/collection/IntList;->_size:I

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 3892
    .end local v0    # "this_$iv":Landroidx/collection/IntList;
    .end local v1    # "$i$f$isEmpty":I
    :goto_0
    return v2
.end method

.method public static final isNotEmpty-impl(Landroidx/collection/MutableIntList;)Z
    .locals 3
    .param p0, "arg0"    # Landroidx/collection/MutableIntList;

    .line 3894
    move-object v0, p0

    check-cast v0, Landroidx/collection/IntList;

    .local v0, "this_$iv":Landroidx/collection/IntList;
    const/4 v1, 0x0

    .line 3968
    .local v1, "$i$f$isNotEmpty":I
    iget v2, v0, Landroidx/collection/IntList;->_size:I

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 3894
    .end local v0    # "this_$iv":Landroidx/collection/IntList;
    .end local v1    # "$i$f$isNotEmpty":I
    :goto_0
    return v2
.end method

.method public static final peek-impl(Landroidx/collection/MutableIntList;)I
    .locals 1
    .param p0, "arg0"    # Landroidx/collection/MutableIntList;

    .line 3896
    invoke-virtual {p0}, Landroidx/collection/MutableIntList;->first()I

    move-result v0

    return v0
.end method

.method public static final takeMax-impl(Landroidx/collection/MutableIntList;)I
    .locals 11
    .param p0, "arg0"    # Landroidx/collection/MutableIntList;

    .line 3900
    move-object v0, p0

    check-cast v0, Landroidx/collection/IntList;

    .local v0, "this_$iv":Landroidx/collection/IntList;
    const/4 v1, 0x0

    .line 3969
    .local v1, "$i$f$getSize":I
    iget v0, v0, Landroidx/collection/IntList;->_size:I

    .line 3900
    .end local v0    # "this_$iv":Landroidx/collection/IntList;
    .end local v1    # "$i$f$getSize":I
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    .local v0, "value$iv":Z
    :goto_0
    const/4 v3, 0x0

    .line 3970
    .local v3, "$i$f$debugRuntimeCheck":I
    nop

    .line 3973
    nop

    .line 3901
    .end local v0    # "value$iv":Z
    .end local v3    # "$i$f$debugRuntimeCheck":I
    invoke-virtual {p0, v1}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v0

    .line 3907
    .local v0, "value":I
    :cond_1
    :goto_1
    move-object v3, p0

    check-cast v3, Landroidx/collection/IntList;

    .local v3, "this_$iv":Landroidx/collection/IntList;
    const/4 v4, 0x0

    .line 3974
    .local v4, "$i$f$isNotEmpty":I
    iget v5, v3, Landroidx/collection/IntList;->_size:I

    if-eqz v5, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    move v3, v1

    .line 3907
    .end local v3    # "this_$iv":Landroidx/collection/IntList;
    .end local v4    # "$i$f$isNotEmpty":I
    :goto_2
    if-eqz v3, :cond_6

    invoke-virtual {p0, v1}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v3

    if-ne v3, v0, :cond_6

    .line 3909
    invoke-virtual {p0}, Landroidx/collection/MutableIntList;->last()I

    move-result v3

    invoke-virtual {p0, v1, v3}, Landroidx/collection/MutableIntList;->set(II)I

    .line 3910
    move-object v3, p0

    check-cast v3, Landroidx/collection/IntList;

    .restart local v3    # "this_$iv":Landroidx/collection/IntList;
    const/4 v4, 0x0

    .line 3975
    .local v4, "$i$f$getSize":I
    iget v3, v3, Landroidx/collection/IntList;->_size:I

    .line 3910
    .end local v3    # "this_$iv":Landroidx/collection/IntList;
    .end local v4    # "$i$f$getSize":I
    sub-int/2addr v3, v2

    invoke-virtual {p0, v3}, Landroidx/collection/MutableIntList;->removeAt(I)I

    .line 3911
    const/4 v3, 0x0

    .line 3912
    .local v3, "index":I
    move-object v4, p0

    check-cast v4, Landroidx/collection/IntList;

    .local v4, "this_$iv":Landroidx/collection/IntList;
    const/4 v5, 0x0

    .line 3976
    .local v5, "$i$f$getSize":I
    iget v4, v4, Landroidx/collection/IntList;->_size:I

    .line 3912
    .end local v4    # "this_$iv":Landroidx/collection/IntList;
    .end local v5    # "$i$f$getSize":I
    nop

    .line 3913
    .local v4, "size":I
    move-object v5, p0

    check-cast v5, Landroidx/collection/IntList;

    .local v5, "this_$iv":Landroidx/collection/IntList;
    const/4 v6, 0x0

    .line 3977
    .local v6, "$i$f$getSize":I
    iget v5, v5, Landroidx/collection/IntList;->_size:I

    .line 3913
    .end local v5    # "this_$iv":Landroidx/collection/IntList;
    .end local v6    # "$i$f$getSize":I
    ushr-int/2addr v5, v2

    .line 3914
    .local v5, "max":I
    :goto_3
    if-ge v3, v5, :cond_1

    .line 3915
    invoke-virtual {p0, v3}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v6

    .line 3916
    .local v6, "indexValue":I
    add-int/lit8 v7, v3, 0x1

    mul-int/lit8 v7, v7, 0x2

    sub-int/2addr v7, v2

    .line 3917
    .local v7, "left":I
    invoke-virtual {p0, v7}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v8

    .line 3918
    .local v8, "leftValue":I
    add-int/lit8 v9, v3, 0x1

    mul-int/lit8 v9, v9, 0x2

    .line 3919
    .local v9, "right":I
    if-ge v9, v4, :cond_4

    .line 3922
    invoke-virtual {p0, v9}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v10

    .line 3923
    .local v10, "rightValue":I
    if-le v10, v8, :cond_4

    .line 3924
    if-le v10, v6, :cond_3

    .line 3925
    invoke-virtual {p0, v3, v10}, Landroidx/collection/MutableIntList;->set(II)I

    .line 3926
    invoke-virtual {p0, v9, v6}, Landroidx/collection/MutableIntList;->set(II)I

    .line 3927
    move v3, v9

    .line 3928
    goto :goto_3

    .line 3929
    :cond_3
    goto :goto_1

    .line 3932
    .end local v10    # "rightValue":I
    :cond_4
    if-le v8, v6, :cond_5

    .line 3933
    invoke-virtual {p0, v3, v8}, Landroidx/collection/MutableIntList;->set(II)I

    .line 3934
    invoke-virtual {p0, v7, v6}, Landroidx/collection/MutableIntList;->set(II)I

    .line 3935
    move v3, v7

    goto :goto_3

    .line 3936
    :cond_5
    goto :goto_1

    .line 3939
    .end local v3    # "index":I
    .end local v4    # "size":I
    .end local v5    # "max":I
    .end local v6    # "indexValue":I
    .end local v7    # "left":I
    .end local v8    # "leftValue":I
    .end local v9    # "right":I
    :cond_6
    return v0
.end method

.method public static toString-impl(Landroidx/collection/MutableIntList;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PrioritySet(list="

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

.method public static final validateHeap-impl(Landroidx/collection/MutableIntList;)V
    .locals 10
    .param p0, "arg0"    # Landroidx/collection/MutableIntList;

    .line 3944
    move-object v0, p0

    check-cast v0, Landroidx/collection/IntList;

    .local v0, "this_$iv":Landroidx/collection/IntList;
    const/4 v1, 0x0

    .line 3978
    .local v1, "$i$f$getSize":I
    iget v0, v0, Landroidx/collection/IntList;->_size:I

    .line 3944
    .end local v0    # "this_$iv":Landroidx/collection/IntList;
    .end local v1    # "$i$f$getSize":I
    nop

    .line 3945
    .local v0, "size":I
    const/4 v1, 0x0

    .local v1, "index":I
    div-int/lit8 v2, v0, 0x2

    :goto_0
    if-ge v1, v2, :cond_5

    .line 3946
    add-int/lit8 v3, v1, 0x1

    mul-int/lit8 v3, v3, 0x2

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    .line 3947
    .local v3, "left":I
    add-int/lit8 v5, v1, 0x1

    mul-int/lit8 v5, v5, 0x2

    .line 3948
    .local v5, "right":I
    invoke-virtual {p0, v1}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v6

    invoke-virtual {p0, v3}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v7

    const/4 v8, 0x0

    if-lt v6, v7, :cond_0

    move v6, v4

    goto :goto_1

    :cond_0
    move v6, v8

    .local v6, "value$iv":Z
    :goto_1
    const/4 v7, 0x0

    .line 3979
    .local v7, "$i$f$checkPrecondition":I
    nop

    .line 3980
    const-string v9, "Check failed."

    if-nez v6, :cond_1

    .line 3981
    invoke-static {v9}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 3983
    :cond_1
    nop

    .line 3949
    .end local v6    # "value$iv":Z
    .end local v7    # "$i$f$checkPrecondition":I
    if-ge v5, v0, :cond_3

    invoke-virtual {p0, v1}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v6

    invoke-virtual {p0, v5}, Landroidx/collection/MutableIntList;->get(I)I

    move-result v7

    if-lt v6, v7, :cond_2

    goto :goto_2

    :cond_2
    move v4, v8

    .local v4, "value$iv":Z
    :cond_3
    :goto_2
    const/4 v6, 0x0

    .line 3984
    .local v6, "$i$f$checkPrecondition":I
    nop

    .line 3985
    if-nez v4, :cond_4

    .line 3986
    invoke-static {v9}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 3988
    :cond_4
    nop

    .line 3945
    .end local v3    # "left":I
    .end local v4    # "value$iv":Z
    .end local v5    # "right":I
    .end local v6    # "$i$f$checkPrecondition":I
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3951
    .end local v1    # "index":I
    :cond_5
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/PrioritySet;->list:Landroidx/collection/MutableIntList;

    invoke-static {v0, p1}, Landroidx/compose/runtime/PrioritySet;->equals-impl(Landroidx/collection/MutableIntList;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/PrioritySet;->list:Landroidx/collection/MutableIntList;

    invoke-static {v0}, Landroidx/compose/runtime/PrioritySet;->hashCode-impl(Landroidx/collection/MutableIntList;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/PrioritySet;->list:Landroidx/collection/MutableIntList;

    invoke-static {v0}, Landroidx/compose/runtime/PrioritySet;->toString-impl(Landroidx/collection/MutableIntList;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()Landroidx/collection/MutableIntList;
    .locals 1

    iget-object v0, p0, Landroidx/compose/runtime/PrioritySet;->list:Landroidx/collection/MutableIntList;

    return-object v0
.end method
