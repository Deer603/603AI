.class public final Landroidx/collection/DoubleListKt;
.super Ljava/lang/Object;
.source "DoubleList.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DoubleList.kt\nandroidx/collection/MutableDoubleList\n*L\n1#1,983:1\n1#2:984\n678#3,2:985\n718#3,2:987\n718#3,2:989\n718#3,2:991\n718#3,2:993\n718#3,2:995\n718#3,2:997\n678#3,2:999\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n*L\n912#1:985,2\n920#1:987,2\n927#1:989,2\n928#1:991,2\n942#1:993,2\n943#1:995,2\n944#1:997,2\n950#1:999,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0013\n\u0002\u0008\u0003\u001a2\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0008\u0007H\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\t2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0008\u0007H\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\n\u001a\u00020\u0001\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u000c\u001a\u0016\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c\u001a\u001e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c\u001a\u0012\u0010\n\u001a\u00020\u00012\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u000c\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\t\u0010\u0012\u001a\u00020\u0005H\u0086\u0008\u001a\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c\u001a\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c\u001a\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c\u001a\u0015\u0010\u0012\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u0010\"\u00020\u000cH\u0086\u0008\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0013"
    }
    d2 = {
        "EmptyDoubleList",
        "Landroidx/collection/DoubleList;",
        "buildDoubleList",
        "builderAction",
        "Lkotlin/Function1;",
        "Landroidx/collection/MutableDoubleList;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "initialCapacity",
        "",
        "doubleListOf",
        "element1",
        "",
        "element2",
        "element3",
        "elements",
        "",
        "emptyDoubleList",
        "mutableDoubleListOf",
        "collection"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final EmptyDoubleList:Landroidx/collection/DoubleList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 888
    new-instance v0, Landroidx/collection/MutableDoubleList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/collection/MutableDoubleList;-><init>(I)V

    check-cast v0, Landroidx/collection/DoubleList;

    sput-object v0, Landroidx/collection/DoubleListKt;->EmptyDoubleList:Landroidx/collection/DoubleList;

    return-void
.end method

.method public static final buildDoubleList(ILkotlin/jvm/functions/Function1;)Landroidx/collection/DoubleList;
    .locals 2
    .param p0, "initialCapacity"    # I
    .param p1, "builderAction"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/collection/MutableDoubleList;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/collection/DoubleList;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 980
    .local v0, "$i$f$buildDoubleList":I
    nop

    .line 981
    new-instance v1, Landroidx/collection/MutableDoubleList;

    invoke-direct {v1, p0}, Landroidx/collection/MutableDoubleList;-><init>(I)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Landroidx/collection/DoubleList;

    return-object v1
.end method

.method public static final buildDoubleList(Lkotlin/jvm/functions/Function1;)Landroidx/collection/DoubleList;
    .locals 5
    .param p0, "builderAction"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/collection/MutableDoubleList;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/collection/DoubleList;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 963
    .local v0, "$i$f$buildDoubleList":I
    nop

    .line 964
    new-instance v1, Landroidx/collection/MutableDoubleList;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Landroidx/collection/MutableDoubleList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Landroidx/collection/DoubleList;

    return-object v1
.end method

.method public static final doubleListOf()Landroidx/collection/DoubleList;
    .locals 1

    .line 894
    sget-object v0, Landroidx/collection/DoubleListKt;->EmptyDoubleList:Landroidx/collection/DoubleList;

    return-object v0
.end method

.method public static final doubleListOf(D)Landroidx/collection/DoubleList;
    .locals 1
    .param p0, "element1"    # D

    .line 897
    invoke-static {p0, p1}, Landroidx/collection/DoubleListKt;->mutableDoubleListOf(D)Landroidx/collection/MutableDoubleList;

    move-result-object v0

    check-cast v0, Landroidx/collection/DoubleList;

    return-object v0
.end method

.method public static final doubleListOf(DD)Landroidx/collection/DoubleList;
    .locals 1
    .param p0, "element1"    # D
    .param p2, "element2"    # D

    .line 901
    invoke-static {p0, p1, p2, p3}, Landroidx/collection/DoubleListKt;->mutableDoubleListOf(DD)Landroidx/collection/MutableDoubleList;

    move-result-object v0

    check-cast v0, Landroidx/collection/DoubleList;

    return-object v0
.end method

.method public static final doubleListOf(DDD)Landroidx/collection/DoubleList;
    .locals 1
    .param p0, "element1"    # D
    .param p2, "element2"    # D
    .param p4, "element3"    # D

    .line 908
    invoke-static/range {p0 .. p5}, Landroidx/collection/DoubleListKt;->mutableDoubleListOf(DDD)Landroidx/collection/MutableDoubleList;

    move-result-object v0

    check-cast v0, Landroidx/collection/DoubleList;

    return-object v0
.end method

.method public static final varargs doubleListOf([D)Landroidx/collection/DoubleList;
    .locals 6
    .param p0, "elements"    # [D

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 912
    new-instance v0, Landroidx/collection/MutableDoubleList;

    array-length v1, p0

    invoke-direct {v0, v1}, Landroidx/collection/MutableDoubleList;-><init>(I)V

    move-object v1, v0

    .line 984
    .local v1, "$this$doubleListOf_u24lambda_u240":Landroidx/collection/MutableDoubleList;
    const/4 v2, 0x0

    .line 912
    .local v2, "$i$a$-apply-DoubleListKt$doubleListOf$1":I
    move-object v3, v1

    .local v3, "this_$iv":Landroidx/collection/MutableDoubleList;
    const/4 v4, 0x0

    .line 985
    .local v4, "$i$f$plusAssign":I
    iget v5, v3, Landroidx/collection/MutableDoubleList;->_size:I

    invoke-virtual {v3, v5, p0}, Landroidx/collection/MutableDoubleList;->addAll(I[D)Z

    .line 986
    nop

    .line 912
    .end local v3    # "this_$iv":Landroidx/collection/MutableDoubleList;
    .end local v4    # "$i$f$plusAssign":I
    nop

    .end local v1    # "$this$doubleListOf_u24lambda_u240":Landroidx/collection/MutableDoubleList;
    .end local v2    # "$i$a$-apply-DoubleListKt$doubleListOf$1":I
    check-cast v0, Landroidx/collection/DoubleList;

    return-object v0
.end method

.method public static final emptyDoubleList()Landroidx/collection/DoubleList;
    .locals 1

    .line 891
    sget-object v0, Landroidx/collection/DoubleListKt;->EmptyDoubleList:Landroidx/collection/DoubleList;

    return-object v0
.end method

.method public static final mutableDoubleListOf()Landroidx/collection/MutableDoubleList;
    .locals 5

    const/4 v0, 0x0

    .line 915
    .local v0, "$i$f$mutableDoubleListOf":I
    new-instance v1, Landroidx/collection/MutableDoubleList;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Landroidx/collection/MutableDoubleList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final mutableDoubleListOf(D)Landroidx/collection/MutableDoubleList;
    .locals 3
    .param p0, "element1"    # D

    .line 919
    new-instance v0, Landroidx/collection/MutableDoubleList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/collection/MutableDoubleList;-><init>(I)V

    .line 920
    .local v0, "list":Landroidx/collection/MutableDoubleList;
    move-object v1, v0

    .local v1, "this_$iv":Landroidx/collection/MutableDoubleList;
    const/4 v2, 0x0

    .line 987
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p0, p1}, Landroidx/collection/MutableDoubleList;->add(D)Z

    .line 988
    nop

    .line 921
    .end local v1    # "this_$iv":Landroidx/collection/MutableDoubleList;
    .end local v2    # "$i$f$plusAssign":I
    return-object v0
.end method

.method public static final mutableDoubleListOf(DD)Landroidx/collection/MutableDoubleList;
    .locals 3
    .param p0, "element1"    # D
    .param p2, "element2"    # D

    .line 926
    new-instance v0, Landroidx/collection/MutableDoubleList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/collection/MutableDoubleList;-><init>(I)V

    .line 927
    .local v0, "list":Landroidx/collection/MutableDoubleList;
    move-object v1, v0

    .local v1, "this_$iv":Landroidx/collection/MutableDoubleList;
    const/4 v2, 0x0

    .line 989
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p0, p1}, Landroidx/collection/MutableDoubleList;->add(D)Z

    .line 990
    nop

    .line 928
    .end local v1    # "this_$iv":Landroidx/collection/MutableDoubleList;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .restart local v1    # "this_$iv":Landroidx/collection/MutableDoubleList;
    const/4 v2, 0x0

    .line 991
    .restart local v2    # "$i$f$plusAssign":I
    invoke-virtual {v1, p2, p3}, Landroidx/collection/MutableDoubleList;->add(D)Z

    .line 992
    nop

    .line 929
    .end local v1    # "this_$iv":Landroidx/collection/MutableDoubleList;
    .end local v2    # "$i$f$plusAssign":I
    return-object v0
.end method

.method public static final mutableDoubleListOf(DDD)Landroidx/collection/MutableDoubleList;
    .locals 3
    .param p0, "element1"    # D
    .param p2, "element2"    # D
    .param p4, "element3"    # D

    .line 941
    new-instance v0, Landroidx/collection/MutableDoubleList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroidx/collection/MutableDoubleList;-><init>(I)V

    .line 942
    .local v0, "list":Landroidx/collection/MutableDoubleList;
    move-object v1, v0

    .local v1, "this_$iv":Landroidx/collection/MutableDoubleList;
    const/4 v2, 0x0

    .line 993
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p0, p1}, Landroidx/collection/MutableDoubleList;->add(D)Z

    .line 994
    nop

    .line 943
    .end local v1    # "this_$iv":Landroidx/collection/MutableDoubleList;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .restart local v1    # "this_$iv":Landroidx/collection/MutableDoubleList;
    const/4 v2, 0x0

    .line 995
    .restart local v2    # "$i$f$plusAssign":I
    invoke-virtual {v1, p2, p3}, Landroidx/collection/MutableDoubleList;->add(D)Z

    .line 996
    nop

    .line 944
    .end local v1    # "this_$iv":Landroidx/collection/MutableDoubleList;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .restart local v1    # "this_$iv":Landroidx/collection/MutableDoubleList;
    const/4 v2, 0x0

    .line 997
    .restart local v2    # "$i$f$plusAssign":I
    invoke-virtual {v1, p4, p5}, Landroidx/collection/MutableDoubleList;->add(D)Z

    .line 998
    nop

    .line 945
    .end local v1    # "this_$iv":Landroidx/collection/MutableDoubleList;
    .end local v2    # "$i$f$plusAssign":I
    return-object v0
.end method

.method public static final varargs mutableDoubleListOf([D)Landroidx/collection/MutableDoubleList;
    .locals 7
    .param p0, "elements"    # [D

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 950
    .local v0, "$i$f$mutableDoubleListOf":I
    new-instance v1, Landroidx/collection/MutableDoubleList;

    array-length v2, p0

    invoke-direct {v1, v2}, Landroidx/collection/MutableDoubleList;-><init>(I)V

    move-object v2, v1

    .line 984
    .local v2, "$this$mutableDoubleListOf_u24lambda_u241":Landroidx/collection/MutableDoubleList;
    const/4 v3, 0x0

    .line 950
    .local v3, "$i$a$-apply-DoubleListKt$mutableDoubleListOf$1":I
    move-object v4, v2

    .local v4, "this_$iv":Landroidx/collection/MutableDoubleList;
    const/4 v5, 0x0

    .line 999
    .local v5, "$i$f$plusAssign":I
    iget v6, v4, Landroidx/collection/MutableDoubleList;->_size:I

    invoke-virtual {v4, v6, p0}, Landroidx/collection/MutableDoubleList;->addAll(I[D)Z

    .line 1000
    nop

    .line 950
    .end local v4    # "this_$iv":Landroidx/collection/MutableDoubleList;
    .end local v5    # "$i$f$plusAssign":I
    nop

    .end local v2    # "$this$mutableDoubleListOf_u24lambda_u241":Landroidx/collection/MutableDoubleList;
    .end local v3    # "$i$a$-apply-DoubleListKt$mutableDoubleListOf$1":I
    return-object v1
.end method
