.class public final Landroidx/collection/LongListKt;
.super Ljava/lang/Object;
.source "LongList.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,972:1\n1#2:973\n673#3,2:974\n713#3,2:976\n713#3,2:978\n713#3,2:980\n713#3,2:982\n713#3,2:984\n713#3,2:986\n673#3,2:988\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n905#1:974,2\n913#1:976,2\n920#1:978,2\n921#1:980,2\n931#1:982,2\n932#1:984,2\n933#1:986,2\n939#1:988,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0016\n\u0002\u0008\u0002\u001a2\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0008\u0007H\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\t2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0008\u0007H\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\n\u001a\u00020\u0001\u001a\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\r\u001a\u0016\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a\u001e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r\u001a\u0012\u0010\u000b\u001a\u00020\u00012\n\u0010\u0010\u001a\u00020\u0011\"\u00020\r\u001a\t\u0010\u0012\u001a\u00020\u0005H\u0086\u0008\u001a\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r\u001a\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r\u001a\u0015\u0010\u0012\u001a\u00020\u00052\n\u0010\u0010\u001a\u00020\u0011\"\u00020\rH\u0086\u0008\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0013"
    }
    d2 = {
        "EmptyLongList",
        "Landroidx/collection/LongList;",
        "buildLongList",
        "builderAction",
        "Lkotlin/Function1;",
        "Landroidx/collection/MutableLongList;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "initialCapacity",
        "",
        "emptyLongList",
        "longListOf",
        "element1",
        "",
        "element2",
        "element3",
        "elements",
        "",
        "mutableLongListOf",
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
.field private static final EmptyLongList:Landroidx/collection/LongList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 881
    new-instance v0, Landroidx/collection/MutableLongList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/collection/MutableLongList;-><init>(I)V

    check-cast v0, Landroidx/collection/LongList;

    sput-object v0, Landroidx/collection/LongListKt;->EmptyLongList:Landroidx/collection/LongList;

    return-void
.end method

.method public static final buildLongList(ILkotlin/jvm/functions/Function1;)Landroidx/collection/LongList;
    .locals 2
    .param p0, "initialCapacity"    # I
    .param p1, "builderAction"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/collection/MutableLongList;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/collection/LongList;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 969
    .local v0, "$i$f$buildLongList":I
    nop

    .line 970
    new-instance v1, Landroidx/collection/MutableLongList;

    invoke-direct {v1, p0}, Landroidx/collection/MutableLongList;-><init>(I)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Landroidx/collection/LongList;

    return-object v1
.end method

.method public static final buildLongList(Lkotlin/jvm/functions/Function1;)Landroidx/collection/LongList;
    .locals 5
    .param p0, "builderAction"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/collection/MutableLongList;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/collection/LongList;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 952
    .local v0, "$i$f$buildLongList":I
    nop

    .line 953
    new-instance v1, Landroidx/collection/MutableLongList;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Landroidx/collection/MutableLongList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Landroidx/collection/LongList;

    return-object v1
.end method

.method public static final emptyLongList()Landroidx/collection/LongList;
    .locals 1

    .line 884
    sget-object v0, Landroidx/collection/LongListKt;->EmptyLongList:Landroidx/collection/LongList;

    return-object v0
.end method

.method public static final longListOf()Landroidx/collection/LongList;
    .locals 1

    .line 887
    sget-object v0, Landroidx/collection/LongListKt;->EmptyLongList:Landroidx/collection/LongList;

    return-object v0
.end method

.method public static final longListOf(J)Landroidx/collection/LongList;
    .locals 1
    .param p0, "element1"    # J

    .line 890
    invoke-static {p0, p1}, Landroidx/collection/LongListKt;->mutableLongListOf(J)Landroidx/collection/MutableLongList;

    move-result-object v0

    check-cast v0, Landroidx/collection/LongList;

    return-object v0
.end method

.method public static final longListOf(JJ)Landroidx/collection/LongList;
    .locals 1
    .param p0, "element1"    # J
    .param p2, "element2"    # J

    .line 894
    invoke-static {p0, p1, p2, p3}, Landroidx/collection/LongListKt;->mutableLongListOf(JJ)Landroidx/collection/MutableLongList;

    move-result-object v0

    check-cast v0, Landroidx/collection/LongList;

    return-object v0
.end method

.method public static final longListOf(JJJ)Landroidx/collection/LongList;
    .locals 1
    .param p0, "element1"    # J
    .param p2, "element2"    # J
    .param p4, "element3"    # J

    .line 901
    invoke-static/range {p0 .. p5}, Landroidx/collection/LongListKt;->mutableLongListOf(JJJ)Landroidx/collection/MutableLongList;

    move-result-object v0

    check-cast v0, Landroidx/collection/LongList;

    return-object v0
.end method

.method public static final varargs longListOf([J)Landroidx/collection/LongList;
    .locals 6
    .param p0, "elements"    # [J

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 905
    new-instance v0, Landroidx/collection/MutableLongList;

    array-length v1, p0

    invoke-direct {v0, v1}, Landroidx/collection/MutableLongList;-><init>(I)V

    move-object v1, v0

    .line 973
    .local v1, "$this$longListOf_u24lambda_u240":Landroidx/collection/MutableLongList;
    const/4 v2, 0x0

    .line 905
    .local v2, "$i$a$-apply-LongListKt$longListOf$1":I
    move-object v3, v1

    .local v3, "this_$iv":Landroidx/collection/MutableLongList;
    const/4 v4, 0x0

    .line 974
    .local v4, "$i$f$plusAssign":I
    iget v5, v3, Landroidx/collection/MutableLongList;->_size:I

    invoke-virtual {v3, v5, p0}, Landroidx/collection/MutableLongList;->addAll(I[J)Z

    .line 975
    nop

    .line 905
    .end local v3    # "this_$iv":Landroidx/collection/MutableLongList;
    .end local v4    # "$i$f$plusAssign":I
    nop

    .end local v1    # "$this$longListOf_u24lambda_u240":Landroidx/collection/MutableLongList;
    .end local v2    # "$i$a$-apply-LongListKt$longListOf$1":I
    check-cast v0, Landroidx/collection/LongList;

    return-object v0
.end method

.method public static final mutableLongListOf()Landroidx/collection/MutableLongList;
    .locals 5

    const/4 v0, 0x0

    .line 908
    .local v0, "$i$f$mutableLongListOf":I
    new-instance v1, Landroidx/collection/MutableLongList;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Landroidx/collection/MutableLongList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final mutableLongListOf(J)Landroidx/collection/MutableLongList;
    .locals 3
    .param p0, "element1"    # J

    .line 912
    new-instance v0, Landroidx/collection/MutableLongList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/collection/MutableLongList;-><init>(I)V

    .line 913
    .local v0, "list":Landroidx/collection/MutableLongList;
    move-object v1, v0

    .local v1, "this_$iv":Landroidx/collection/MutableLongList;
    const/4 v2, 0x0

    .line 976
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p0, p1}, Landroidx/collection/MutableLongList;->add(J)Z

    .line 977
    nop

    .line 914
    .end local v1    # "this_$iv":Landroidx/collection/MutableLongList;
    .end local v2    # "$i$f$plusAssign":I
    return-object v0
.end method

.method public static final mutableLongListOf(JJ)Landroidx/collection/MutableLongList;
    .locals 3
    .param p0, "element1"    # J
    .param p2, "element2"    # J

    .line 919
    new-instance v0, Landroidx/collection/MutableLongList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/collection/MutableLongList;-><init>(I)V

    .line 920
    .local v0, "list":Landroidx/collection/MutableLongList;
    move-object v1, v0

    .local v1, "this_$iv":Landroidx/collection/MutableLongList;
    const/4 v2, 0x0

    .line 978
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p0, p1}, Landroidx/collection/MutableLongList;->add(J)Z

    .line 979
    nop

    .line 921
    .end local v1    # "this_$iv":Landroidx/collection/MutableLongList;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .restart local v1    # "this_$iv":Landroidx/collection/MutableLongList;
    const/4 v2, 0x0

    .line 980
    .restart local v2    # "$i$f$plusAssign":I
    invoke-virtual {v1, p2, p3}, Landroidx/collection/MutableLongList;->add(J)Z

    .line 981
    nop

    .line 922
    .end local v1    # "this_$iv":Landroidx/collection/MutableLongList;
    .end local v2    # "$i$f$plusAssign":I
    return-object v0
.end method

.method public static final mutableLongListOf(JJJ)Landroidx/collection/MutableLongList;
    .locals 3
    .param p0, "element1"    # J
    .param p2, "element2"    # J
    .param p4, "element3"    # J

    .line 930
    new-instance v0, Landroidx/collection/MutableLongList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroidx/collection/MutableLongList;-><init>(I)V

    .line 931
    .local v0, "list":Landroidx/collection/MutableLongList;
    move-object v1, v0

    .local v1, "this_$iv":Landroidx/collection/MutableLongList;
    const/4 v2, 0x0

    .line 982
    .local v2, "$i$f$plusAssign":I
    invoke-virtual {v1, p0, p1}, Landroidx/collection/MutableLongList;->add(J)Z

    .line 983
    nop

    .line 932
    .end local v1    # "this_$iv":Landroidx/collection/MutableLongList;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .restart local v1    # "this_$iv":Landroidx/collection/MutableLongList;
    const/4 v2, 0x0

    .line 984
    .restart local v2    # "$i$f$plusAssign":I
    invoke-virtual {v1, p2, p3}, Landroidx/collection/MutableLongList;->add(J)Z

    .line 985
    nop

    .line 933
    .end local v1    # "this_$iv":Landroidx/collection/MutableLongList;
    .end local v2    # "$i$f$plusAssign":I
    nop

    .restart local v1    # "this_$iv":Landroidx/collection/MutableLongList;
    const/4 v2, 0x0

    .line 986
    .restart local v2    # "$i$f$plusAssign":I
    invoke-virtual {v1, p4, p5}, Landroidx/collection/MutableLongList;->add(J)Z

    .line 987
    nop

    .line 934
    .end local v1    # "this_$iv":Landroidx/collection/MutableLongList;
    .end local v2    # "$i$f$plusAssign":I
    return-object v0
.end method

.method public static final varargs mutableLongListOf([J)Landroidx/collection/MutableLongList;
    .locals 7
    .param p0, "elements"    # [J

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 939
    .local v0, "$i$f$mutableLongListOf":I
    new-instance v1, Landroidx/collection/MutableLongList;

    array-length v2, p0

    invoke-direct {v1, v2}, Landroidx/collection/MutableLongList;-><init>(I)V

    move-object v2, v1

    .line 973
    .local v2, "$this$mutableLongListOf_u24lambda_u241":Landroidx/collection/MutableLongList;
    const/4 v3, 0x0

    .line 939
    .local v3, "$i$a$-apply-LongListKt$mutableLongListOf$1":I
    move-object v4, v2

    .local v4, "this_$iv":Landroidx/collection/MutableLongList;
    const/4 v5, 0x0

    .line 988
    .local v5, "$i$f$plusAssign":I
    iget v6, v4, Landroidx/collection/MutableLongList;->_size:I

    invoke-virtual {v4, v6, p0}, Landroidx/collection/MutableLongList;->addAll(I[J)Z

    .line 989
    nop

    .line 939
    .end local v4    # "this_$iv":Landroidx/collection/MutableLongList;
    .end local v5    # "$i$f$plusAssign":I
    nop

    .end local v2    # "$this$mutableLongListOf_u24lambda_u241":Landroidx/collection/MutableLongList;
    .end local v3    # "$i$a$-apply-LongListKt$mutableLongListOf$1":I
    return-object v1
.end method
