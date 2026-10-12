.class public final Landroidx/collection/IntListKt;
.super Ljava/lang/Object;
.source "IntList.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,968:1\n1#2:969\n672#3,2:970\n712#3,2:972\n712#3,2:974\n712#3,2:976\n712#3,2:978\n712#3,2:980\n712#3,2:982\n672#3,2:984\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n902#1:970,2\n910#1:972,2\n917#1:974,2\n918#1:976,2\n927#1:978,2\n928#1:980,2\n929#1:982,2\n935#1:984,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0015\n\u0002\u0008\u0002\u001a2\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0008\u0007H\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\t2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0008\u0007H\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\n\u001a\u00020\u0001\u001a\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\t\u001a\u0016\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\u00012\n\u0010\u000f\u001a\u00020\u0010\"\u00020\t\u001a\t\u0010\u0011\u001a\u00020\u0005H\u0086\u0008\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\t\u001a\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0015\u0010\u0011\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u0010\"\u00020\tH\u0086\u0008\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0012"
    }
    d2 = {
        "EmptyIntList",
        "Landroidx/collection/IntList;",
        "buildIntList",
        "builderAction",
        "Lkotlin/Function1;",
        "Landroidx/collection/MutableIntList;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "initialCapacity",
        "",
        "emptyIntList",
        "intListOf",
        "element1",
        "element2",
        "element3",
        "elements",
        "",
        "mutableIntListOf",
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
.field private static final EmptyIntList:Landroidx/collection/IntList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 879
    new-instance v0, Landroidx/collection/MutableIntList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/collection/MutableIntList;-><init>(I)V

    check-cast v0, Landroidx/collection/IntList;

    sput-object v0, Landroidx/collection/IntListKt;->EmptyIntList:Landroidx/collection/IntList;

    return-void
.end method

.method public static final buildIntList(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntList;
    .locals 2
    .param p0, "initialCapacity"    # I
    .param p1, "builderAction"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/collection/MutableIntList;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/collection/IntList;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 965
    .local v0, "$i$f$buildIntList":I
    nop

    .line 966
    new-instance v1, Landroidx/collection/MutableIntList;

    invoke-direct {v1, p0}, Landroidx/collection/MutableIntList;-><init>(I)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Landroidx/collection/IntList;

    return-object v1
.end method

.method public static final buildIntList(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntList;
    .locals 5
    .param p0, "builderAction"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/collection/MutableIntList;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/collection/IntList;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 948
    .local v0, "$i$f$buildIntList":I
    nop

    .line 949
    new-instance v1, Landroidx/collection/MutableIntList;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Landroidx/collection/IntList;

    return-object v1
.end method

.method public static final emptyIntList()Landroidx/collection/IntList;
    .locals 1

    .line 882
    sget-object v0, Landroidx/collection/IntListKt;->EmptyIntList:Landroidx/collection/IntList;

    return-object v0
.end method

.method public static final intListOf()Landroidx/collection/IntList;
    .locals 1

    .line 885
    sget-object v0, Landroidx/collection/IntListKt;->EmptyIntList:Landroidx/collection/IntList;

    return-object v0
.end method

.method public static final intListOf(I)Landroidx/collection/IntList;
    .locals 1
    .param p0, "element1"    # I

    .line 888
    invoke-static {p0}, Landroidx/collection/IntListKt;->mutableIntListOf(I)Landroidx/collection/MutableIntList;

    move-result-object v0

    check-cast v0, Landroidx/collection/IntList;

    return-object v0
.end method

.method public static final intListOf(II)Landroidx/collection/IntList;
    .locals 1
    .param p0, "element1"    # I
    .param p1, "element2"    # I

    .line 891
    invoke-static {p0, p1}, Landroidx/collection/IntListKt;->mutableIntListOf(II)Landroidx/collection/MutableIntList;

    move-result-object v0

    check-cast v0, Landroidx/collection/IntList;

    return-object v0
.end method

.method public static final intListOf(III)Landroidx/collection/IntList;
    .locals 1
    .param p0, "element1"    # I
    .param p1, "element2"    # I
    .param p2, "element3"    # I

    .line 898
    invoke-static {p0, p1, p2}, Landroidx/collection/IntListKt;->mutableIntListOf(III)Landroidx/collection/MutableIntList;

    move-result-object v0

    check-cast v0, Landroidx/collection/IntList;

    return-object v0
.end method

.method public static final varargs intListOf([I)Landroidx/collection/IntList;
    .locals 6
    .param p0, "elements"    # [I

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 902
    new-instance v0, Landroidx/collection/MutableIntList;

    array-length v1, p0

    invoke-direct {v0, v1}, Landroidx/collection/MutableIntList;-><init>(I)V

    move-object v1, v0

    .line 969
    .local v1, "$this$intListOf_u24lambda_u240":Landroidx/collection/MutableIntList;
    const/4 v2, 0x0

    .line 902
    .local v2, "$i$a$-apply-IntListKt$intListOf$1":I
    move-object v3, v1

    .local v3, "this_$iv":Landroidx/collection/MutableIntList;
    const/4 v4, 0x0

    .line 970
    .local v4, "$i$f$plusAssign":I
    iget v5, v3, Landroidx/collection/MutableIntList;->_size:I

    invoke-virtual {v3, v5, p0}, Landroidx/collection/MutableIntList;->addAll(I[I)Z

    .line 971
    nop

    .line 902
    .end local v3    # "this_$iv":Landroidx/collection/MutableIntList;
    .end local v4    # "$i$f$plusAssign":I
    nop

    .end local v1    # "$this$intListOf_u24lambda_u240":Landroidx/collection/MutableIntList;
    .end local v2    # "$i$a$-apply-IntListKt$intListOf$1":I
    check-cast v0, Landroidx/collection/IntList;

    return-object v0
.end method

.method public static final mutableIntListOf()Landroidx/collection/MutableIntList;
    .locals 5

    const/4 v0, 0x0

    .line 905
    .local v0, "$i$f$mutableIntListOf":I
    new-instance v1, Landroidx/collection/MutableIntList;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final mutableIntListOf(I)Landroidx/collection/MutableIntList;
    .locals 3
    .param p0, "element1"    # I

    .line 909
    new-instance v0, Landroidx/collection/MutableIntList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/collection/MutableIntList;-><init>(I)V

    .line 910
    .local v0, "list":Landroidx/collection/MutableIntList;
    move-object v1, v0

    .local v1, "this_$iv":Landroidx/collection/MutableIntList;
    const/4 v2, 0x0

    .line 972
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p0}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 973
    nop

    .line 911
    .end local v1    # "this_$iv":Landroidx/collection/MutableIntList;
    .end local v2    # "$i$f$plusAssign":I
    return-object v0
.end method

.method public static final mutableIntListOf(II)Landroidx/collection/MutableIntList;
    .locals 3
    .param p0, "element1"    # I
    .param p1, "element2"    # I

    .line 916
    new-instance v0, Landroidx/collection/MutableIntList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/collection/MutableIntList;-><init>(I)V

    .line 917
    .local v0, "list":Landroidx/collection/MutableIntList;
    move-object v1, v0

    .local v1, "this_$iv":Landroidx/collection/MutableIntList;
    const/4 v2, 0x0

    .line 974
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p0}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 975
    nop

    .line 918
    .end local v1    # "this_$iv":Landroidx/collection/MutableIntList;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .restart local v1    # "this_$iv":Landroidx/collection/MutableIntList;
    const/4 v2, 0x0

    .line 976
    .restart local v2    # "$i$f$plusAssign":I
    invoke-virtual {v1, p1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 977
    nop

    .line 919
    .end local v1    # "this_$iv":Landroidx/collection/MutableIntList;
    .end local v2    # "$i$f$plusAssign":I
    return-object v0
.end method

.method public static final mutableIntListOf(III)Landroidx/collection/MutableIntList;
    .locals 3
    .param p0, "element1"    # I
    .param p1, "element2"    # I
    .param p2, "element3"    # I

    .line 926
    new-instance v0, Landroidx/collection/MutableIntList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroidx/collection/MutableIntList;-><init>(I)V

    .line 927
    .local v0, "list":Landroidx/collection/MutableIntList;
    move-object v1, v0

    .local v1, "this_$iv":Landroidx/collection/MutableIntList;
    const/4 v2, 0x0

    .line 978
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p0}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 979
    nop

    .line 928
    .end local v1    # "this_$iv":Landroidx/collection/MutableIntList;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .restart local v1    # "this_$iv":Landroidx/collection/MutableIntList;
    const/4 v2, 0x0

    .line 980
    .restart local v2    # "$i$f$plusAssign":I
    invoke-virtual {v1, p1}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 981
    nop

    .line 929
    .end local v1    # "this_$iv":Landroidx/collection/MutableIntList;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .restart local v1    # "this_$iv":Landroidx/collection/MutableIntList;
    const/4 v2, 0x0

    .line 982
    .restart local v2    # "$i$f$plusAssign":I
    invoke-virtual {v1, p2}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 983
    nop

    .line 930
    .end local v1    # "this_$iv":Landroidx/collection/MutableIntList;
    .end local v2    # "$i$f$plusAssign":I
    return-object v0
.end method

.method public static final varargs mutableIntListOf([I)Landroidx/collection/MutableIntList;
    .locals 7
    .param p0, "elements"    # [I

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 935
    .local v0, "$i$f$mutableIntListOf":I
    new-instance v1, Landroidx/collection/MutableIntList;

    array-length v2, p0

    invoke-direct {v1, v2}, Landroidx/collection/MutableIntList;-><init>(I)V

    move-object v2, v1

    .line 969
    .local v2, "$this$mutableIntListOf_u24lambda_u241":Landroidx/collection/MutableIntList;
    const/4 v3, 0x0

    .line 935
    .local v3, "$i$a$-apply-IntListKt$mutableIntListOf$1":I
    move-object v4, v2

    .local v4, "this_$iv":Landroidx/collection/MutableIntList;
    const/4 v5, 0x0

    .line 984
    .local v5, "$i$f$plusAssign":I
    iget v6, v4, Landroidx/collection/MutableIntList;->_size:I

    invoke-virtual {v4, v6, p0}, Landroidx/collection/MutableIntList;->addAll(I[I)Z

    .line 985
    nop

    .line 935
    .end local v4    # "this_$iv":Landroidx/collection/MutableIntList;
    .end local v5    # "$i$f$plusAssign":I
    nop

    .end local v2    # "$this$mutableIntListOf_u24lambda_u241":Landroidx/collection/MutableIntList;
    .end local v3    # "$i$a$-apply-IntListKt$mutableIntListOf$1":I
    return-object v1
.end method
