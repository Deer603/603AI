.class public final Landroidx/collection/MutableObjectList;
.super Landroidx/collection/ObjectList;
.source "ObjectList.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/collection/MutableObjectList$MutableObjectListIterator;,
        Landroidx/collection/MutableObjectList$ObjectListMutableList;,
        Landroidx/collection/MutableObjectList$SubList;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/collection/ObjectList<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n903#1,5:1549\n903#1,5:1554\n903#1,5:1559\n903#1,5:1564\n903#1,5:1572\n903#1,5:1577\n903#1,5:1582\n919#1,2:1604\n903#1,5:1613\n903#1,5:1618\n919#1,2:1624\n919#1,2:1628\n629#1:1631\n924#1,2:1634\n924#1,2:1641\n924#1,2:1661\n924#1,2:1670\n924#1,2:1673\n924#1,2:1677\n1864#2,3:1569\n1855#2:1623\n1856#2:1626\n1855#2:1672\n1856#2:1675\n231#3,3:1587\n200#3,7:1590\n211#3,3:1598\n214#3,2:1602\n217#3,6:1606\n234#3:1612\n231#3,3:1644\n200#3,7:1647\n211#3,3:1655\n214#3,2:1659\n217#3,6:1663\n234#3:1669\n1399#4:1597\n1270#4:1601\n1399#4:1654\n1270#4:1658\n1313#5:1627\n1314#5:1630\n1313#5:1676\n1314#5:1679\n84#6:1632\n287#6,4:1637\n292#6:1643\n80#6:1680\n80#6:1681\n80#6:1682\n80#6:1683\n80#6:1684\n80#6:1685\n13309#7:1633\n13310#7:1636\n1#8:1686\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n633#1:1549,5\n649#1:1554,5\n678#1:1559,5\n708#1:1564,5\n738#1:1572,5\n825#1:1577,5\n839#1:1582,5\n840#1:1604,2\n846#1:1613,5\n856#1:1618,5\n866#1:1624,2\n871#1:1628,2\n892#1:1631\n1020#1:1634,2\n1025#1:1641,2\n1030#1:1661,2\n1036#1:1670,2\n1042#1:1673,2\n1047#1:1677,2\n718#1:1569,3\n866#1:1623\n866#1:1626\n1042#1:1672\n1042#1:1675\n840#1:1587,3\n840#1:1590,7\n840#1:1598,3\n840#1:1602,2\n840#1:1606,6\n840#1:1612\n1030#1:1644,3\n1030#1:1647,7\n1030#1:1655,3\n1030#1:1659,2\n1030#1:1663,6\n1030#1:1669\n840#1:1597\n840#1:1601\n1030#1:1654\n1030#1:1658\n871#1:1627\n871#1:1630\n1047#1:1676\n1047#1:1679\n946#1:1632\n1025#1:1637,4\n1025#1:1643\n1061#1:1680\n1113#1:1681\n1130#1:1682\n1147#1:1683\n1164#1:1684\n1181#1:1685\n1020#1:1633\n1020#1:1636\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0008\u000b\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003;<=B\u000f\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\u0002\u0010\u0016J\u001e\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J#\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010\u0012\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001bJ\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u0011\u0010 \u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0008J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n\u00a2\u0006\u0002\u0010\"J\u0017\u0010!\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u001c\u0010!\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0002\u00a2\u0006\u0002\u0010#J\u0017\u0010!\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002J\u0016\u0010$\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n\u00a2\u0006\u0002\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u001c\u0010$\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0002\u00a2\u0006\u0002\u0010#J\u0017\u0010$\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002J\u0013\u0010%\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010&\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010&\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010&\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\u0002\u0010\u0016J\u0014\u0010&\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010&\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010&\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001bJ\u0015\u0010\'\u001a\u00028\u00002\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0004\u00a2\u0006\u0002\u0010(J/\u0010)\u001a\u00020\u000f2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u0008,\u0012\u0008\u0008-\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000c0+H\u0086\u0008\u00f8\u0001\u0000J\u001a\u0010.\u001a\u00020\u000f2\u0008\u0008\u0001\u0010/\u001a\u00020\u00042\u0008\u0008\u0001\u00100\u001a\u00020\u0004J%\u00101\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00042\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0015H\u0001\u00a2\u0006\u0002\u00104J\u0014\u00105\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u00105\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\u0002\u0010\u0016J\u0014\u00105\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u00105\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u00105\u001a\u00020\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001bJ \u00106\u001a\u00028\u00002\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u00109\u001a\u00020\u000f2\u0008\u0008\u0002\u0010:\u001a\u00020\u0004R\u0012\u0010\u0006\u001a\u00020\u00048\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006>"
    }
    d2 = {
        "Landroidx/collection/MutableObjectList;",
        "E",
        "Landroidx/collection/ObjectList;",
        "initialCapacity",
        "",
        "(I)V",
        "capacity",
        "getCapacity",
        "()I",
        "list",
        "Landroidx/collection/MutableObjectList$ObjectListMutableList;",
        "add",
        "",
        "element",
        "(Ljava/lang/Object;)Z",
        "",
        "index",
        "(ILjava/lang/Object;)V",
        "addAll",
        "elements",
        "Landroidx/collection/ScatterSet;",
        "",
        "([Ljava/lang/Object;)Z",
        "(I[Ljava/lang/Object;)Z",
        "",
        "",
        "",
        "Lkotlin/sequences/Sequence;",
        "asList",
        "asMutableList",
        "",
        "clear",
        "ensureCapacity",
        "minusAssign",
        "(Ljava/lang/Object;)V",
        "([Ljava/lang/Object;)V",
        "plusAssign",
        "remove",
        "removeAll",
        "removeAt",
        "(I)Ljava/lang/Object;",
        "removeIf",
        "predicate",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "removeRange",
        "start",
        "end",
        "resizeStorage",
        "oldContent",
        "",
        "(I[Ljava/lang/Object;)V",
        "retainAll",
        "set",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
        "throwIndexOutOfBoundsInclusiveException",
        "trim",
        "minCapacity",
        "MutableObjectListIterator",
        "ObjectListMutableList",
        "SubList",
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
.field private list:Landroidx/collection/MutableObjectList$ObjectListMutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectList$ObjectListMutableList<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/collection/MutableObjectList;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .param p1, "initialCapacity"    # I

    .line 619
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/collection/ObjectList;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 619
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    :cond_0
    invoke-direct {p0, p1}, Landroidx/collection/MutableObjectList;-><init>(I)V

    return-void
.end method

.method private final throwIndexOutOfBoundsInclusiveException(I)V
    .locals 2
    .param p1, "index"    # I

    .line 759
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " must be in 0.."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/collection/internal/RuntimeHelpersKt;->throwIndexOutOfBoundsException(Ljava/lang/String;)V

    .line 760
    return-void
.end method

.method public static synthetic trim$default(Landroidx/collection/MutableObjectList;IILjava/lang/Object;)V
    .locals 0

    .line 890
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Landroidx/collection/MutableObjectList;->_size:I

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->trim(I)V

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 6
    .param p1, "index"    # I
    .param p2, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .line 646
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-gt p1, v2, :cond_0

    move v0, v1

    :cond_0
    if-nez v0, :cond_1

    .line 647
    invoke-direct {p0, p1}, Landroidx/collection/MutableObjectList;->throwIndexOutOfBoundsInclusiveException(I)V

    .line 649
    :cond_1
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    add-int/2addr v0, v1

    .local v0, "capacity$iv":I
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v3, 0x0

    .line 1554
    .local v3, "$i$f$ensureCapacity":I
    iget-object v4, v2, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1555
    .local v4, "oldContent$iv":[Ljava/lang/Object;
    array-length v5, v4

    if-ge v5, v0, :cond_2

    .line 1556
    invoke-virtual {v2, v0, v4}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 1558
    :cond_2
    nop

    .line 650
    .end local v0    # "capacity$iv":I
    .end local v2    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v3    # "$i$f$ensureCapacity":I
    .end local v4    # "oldContent$iv":[Ljava/lang/Object;
    iget-object v0, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 651
    .local v0, "content":[Ljava/lang/Object;
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq p1, v2, :cond_3

    .line 652
    nop

    .line 653
    nop

    .line 654
    add-int/lit8 v2, p1, 0x1

    .line 655
    nop

    .line 656
    iget v3, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 652
    invoke-static {v0, v0, v2, p1, v3}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 659
    :cond_3
    aput-object p2, v0, p1

    .line 660
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    add-int/2addr v2, v1

    iput v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 661
    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 6
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 633
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .local v0, "capacity$iv":I
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v3, 0x0

    .line 1549
    .local v3, "$i$f$ensureCapacity":I
    iget-object v4, v2, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1550
    .local v4, "oldContent$iv":[Ljava/lang/Object;
    array-length v5, v4

    if-ge v5, v0, :cond_0

    .line 1551
    invoke-virtual {v2, v0, v4}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 1553
    :cond_0
    nop

    .line 634
    .end local v0    # "capacity$iv":I
    .end local v2    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v3    # "$i$f$ensureCapacity":I
    .end local v4    # "oldContent$iv":[Ljava/lang/Object;
    iget-object v0, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    aput-object p1, v0, v2

    .line 635
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 636
    return v1
.end method

.method public final addAll(ILandroidx/collection/ObjectList;)Z
    .locals 7
    .param p1, "index"    # I
    .param p2, "elements"    # Landroidx/collection/ObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/collection/ObjectList<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 734
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-gt p1, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    .line 735
    invoke-direct {p0, p1}, Landroidx/collection/MutableObjectList;->throwIndexOutOfBoundsInclusiveException(I)V

    .line 737
    :cond_1
    invoke-virtual {p2}, Landroidx/collection/ObjectList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    return v1

    .line 738
    :cond_2
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    iget v3, p2, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v2, v3

    .local v2, "capacity$iv":I
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v4, 0x0

    .line 1572
    .local v4, "$i$f$ensureCapacity":I
    iget-object v5, v3, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1573
    .local v5, "oldContent$iv":[Ljava/lang/Object;
    array-length v6, v5

    if-ge v6, v2, :cond_3

    .line 1574
    invoke-virtual {v3, v2, v5}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 1576
    :cond_3
    nop

    .line 739
    .end local v2    # "capacity$iv":I
    .end local v3    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v4    # "$i$f$ensureCapacity":I
    .end local v5    # "oldContent$iv":[Ljava/lang/Object;
    iget-object v2, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 740
    .local v2, "content":[Ljava/lang/Object;
    iget v3, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq p1, v3, :cond_4

    .line 741
    nop

    .line 742
    nop

    .line 743
    iget v3, p2, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v3, p1

    .line 744
    nop

    .line 745
    iget v4, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 741
    invoke-static {v2, v2, v3, p1, v4}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 748
    :cond_4
    iget-object v3, p2, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 749
    nop

    .line 750
    nop

    .line 751
    nop

    .line 752
    iget v4, p2, Landroidx/collection/ObjectList;->_size:I

    .line 748
    invoke-static {v3, v2, p1, v1, v4}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 754
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    iget v3, p2, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v1, v3

    iput v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 755
    return v0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 11
    .param p1, "index"    # I
    .param p2, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 704
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-gt p1, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    .line 705
    invoke-direct {p0, p1}, Landroidx/collection/MutableObjectList;->throwIndexOutOfBoundsInclusiveException(I)V

    .line 707
    :cond_1
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    return v1

    .line 708
    :cond_2
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v1, v2

    .local v1, "capacity$iv":I
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v3, 0x0

    .line 1564
    .local v3, "$i$f$ensureCapacity":I
    iget-object v4, v2, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1565
    .local v4, "oldContent$iv":[Ljava/lang/Object;
    array-length v5, v4

    if-ge v5, v1, :cond_3

    .line 1566
    invoke-virtual {v2, v1, v4}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 1568
    :cond_3
    nop

    .line 709
    .end local v1    # "capacity$iv":I
    .end local v2    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v3    # "$i$f$ensureCapacity":I
    .end local v4    # "oldContent$iv":[Ljava/lang/Object;
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 710
    .local v1, "content":[Ljava/lang/Object;
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq p1, v2, :cond_4

    .line 711
    nop

    .line 712
    nop

    .line 713
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v2, p1

    .line 714
    nop

    .line 715
    iget v3, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 711
    invoke-static {v1, v1, v2, p1, v3}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 718
    :cond_4
    move-object v2, p2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 1569
    .local v3, "$i$f$forEachIndexed":I
    const/4 v4, 0x0

    .line 1570
    .local v4, "index$iv":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v4, 0x1

    .end local v4    # "index$iv":I
    .local v7, "index$iv":I
    if-gez v4, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .local v4, "i":I
    :cond_5
    move-object v8, v6

    .local v8, "element":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 718
    .local v9, "$i$a$-forEachIndexed-MutableObjectList$addAll$1":I
    add-int v10, p1, v4

    aput-object v8, v1, v10

    .line 1570
    .end local v4    # "i":I
    .end local v8    # "element":Ljava/lang/Object;
    .end local v9    # "$i$a$-forEachIndexed-MutableObjectList$addAll$1":I
    move v4, v7

    .end local v6    # "item$iv":Ljava/lang/Object;
    goto :goto_1

    .line 1571
    .end local v7    # "index$iv":I
    .local v4, "index$iv":I
    :cond_6
    nop

    .line 719
    .end local v2    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEachIndexed":I
    .end local v4    # "index$iv":I
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 720
    return v0
.end method

.method public final addAll(I[Ljava/lang/Object;)Z
    .locals 13
    .param p1, "index"    # I
    .param p2, "elements"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[TE;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 674
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-gt p1, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    .line 675
    invoke-direct {p0, p1}, Landroidx/collection/MutableObjectList;->throwIndexOutOfBoundsInclusiveException(I)V

    .line 677
    :cond_1
    array-length v2, p2

    if-nez v2, :cond_2

    move v2, v0

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    if-eqz v2, :cond_3

    return v1

    .line 678
    :cond_3
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    array-length v2, p2

    add-int/2addr v1, v2

    .local v1, "capacity$iv":I
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v3, 0x0

    .line 1559
    .local v3, "$i$f$ensureCapacity":I
    iget-object v4, v2, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1560
    .local v4, "oldContent$iv":[Ljava/lang/Object;
    array-length v5, v4

    if-ge v5, v1, :cond_4

    .line 1561
    invoke-virtual {v2, v1, v4}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 1563
    :cond_4
    nop

    .line 679
    .end local v1    # "capacity$iv":I
    .end local v2    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v3    # "$i$f$ensureCapacity":I
    .end local v4    # "oldContent$iv":[Ljava/lang/Object;
    iget-object v7, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 680
    .local v7, "content":[Ljava/lang/Object;
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq p1, v1, :cond_5

    .line 681
    nop

    .line 682
    nop

    .line 683
    array-length v1, p2

    add-int/2addr v1, p1

    .line 684
    nop

    .line 685
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 681
    invoke-static {v7, v7, v1, p1, v2}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 688
    :cond_5
    const/16 v11, 0xc

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v8, p1

    move-object v6, p2

    .end local p1    # "index":I
    .end local p2    # "elements":[Ljava/lang/Object;
    .local v6, "elements":[Ljava/lang/Object;
    .local v8, "index":I
    invoke-static/range {v6 .. v12}, Lkotlin/collections/ArraysKt;->copyInto$default([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 689
    iget p1, p0, Landroidx/collection/MutableObjectList;->_size:I

    array-length p2, v6

    add-int/2addr p1, p2

    iput p1, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 690
    return v0
.end method

.method public final addAll(Landroidx/collection/ObjectList;)Z
    .locals 2
    .param p1, "elements"    # Landroidx/collection/ObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 767
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 768
    .local v0, "oldSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Landroidx/collection/ObjectList;)V

    .line 769
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final addAll(Landroidx/collection/ScatterSet;)Z
    .locals 2
    .param p1, "elements"    # Landroidx/collection/ScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 777
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 778
    .local v0, "oldSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Landroidx/collection/ScatterSet;)V

    .line 779
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final addAll(Ljava/lang/Iterable;)Z
    .locals 2
    .param p1, "elements"    # Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 807
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 808
    .local v0, "oldSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Ljava/lang/Iterable;)V

    .line 809
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final addAll(Ljava/util/List;)Z
    .locals 2
    .param p1, "elements"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 797
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 798
    .local v0, "oldSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Ljava/util/List;)V

    .line 799
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final addAll(Lkotlin/sequences/Sequence;)Z
    .locals 2
    .param p1, "elements"    # Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/Sequence<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 817
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 818
    .local v0, "oldSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign(Lkotlin/sequences/Sequence;)V

    .line 819
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final addAll([Ljava/lang/Object;)Z
    .locals 2
    .param p1, "elements"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 787
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 788
    .local v0, "oldSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->plusAssign([Ljava/lang/Object;)V

    .line 789
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public asList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .line 1206
    invoke-virtual {p0}, Landroidx/collection/MutableObjectList;->asMutableList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final asMutableList()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    .line 1216
    iget-object v0, p0, Landroidx/collection/MutableObjectList;->list:Landroidx/collection/MutableObjectList$ObjectListMutableList;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/collection/MutableObjectList$ObjectListMutableList;

    invoke-direct {v0, p0}, Landroidx/collection/MutableObjectList$ObjectListMutableList;-><init>(Landroidx/collection/MutableObjectList;)V

    move-object v1, v0

    .line 1686
    .local v1, "it":Landroidx/collection/MutableObjectList$ObjectListMutableList;
    const/4 v2, 0x0

    .line 1216
    .local v2, "$i$a$-also-MutableObjectList$asMutableList$1":I
    iput-object v1, p0, Landroidx/collection/MutableObjectList;->list:Landroidx/collection/MutableObjectList$ObjectListMutableList;

    .end local v1    # "it":Landroidx/collection/MutableObjectList$ObjectListMutableList;
    .end local v2    # "$i$a$-also-MutableObjectList$asMutableList$1":I
    :goto_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final clear()V
    .locals 4

    .line 880
    iget-object v0, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lkotlin/collections/ArraysKt;->fill([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 881
    iput v3, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 882
    return-void
.end method

.method public final ensureCapacity(I)V
    .locals 3
    .param p1, "capacity"    # I

    const/4 v0, 0x0

    .line 903
    .local v0, "$i$f$ensureCapacity":I
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 904
    .local v1, "oldContent":[Ljava/lang/Object;
    array-length v2, v1

    if-ge v2, p1, :cond_0

    .line 905
    invoke-virtual {p0, p1, v1}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 907
    :cond_0
    return-void
.end method

.method public final getCapacity()I
    .locals 2

    const/4 v0, 0x0

    .line 629
    .local v0, "$i$f$getCapacity":I
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    array-length v1, v1

    return v1
.end method

.method public final minusAssign(Landroidx/collection/ObjectList;)V
    .locals 9
    .param p1, "elements"    # Landroidx/collection/ObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1025
    move-object v0, p1

    .local v0, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v1, 0x0

    .line 1637
    .local v1, "$i$f$forEach":I
    nop

    .line 1638
    iget-object v2, v0, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 1639
    .local v2, "content$iv":[Ljava/lang/Object;
    const/4 v3, 0x0

    .local v3, "i$iv":I
    iget v4, v0, Landroidx/collection/ObjectList;->_size:I

    :goto_0
    if-ge v3, v4, :cond_0

    .line 1640
    aget-object v5, v2, v3

    .local v5, "element":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1025
    .local v6, "$i$a$-forEach-MutableObjectList$minusAssign$2":I
    move-object v7, p0

    .local v7, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v8, 0x0

    .line 1641
    .local v8, "$i$f$minusAssign":I
    invoke-virtual {v7, v5}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    .line 1642
    nop

    .line 1025
    .end local v7    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v8    # "$i$f$minusAssign":I
    nop

    .line 1640
    .end local v5    # "element":Ljava/lang/Object;
    .end local v6    # "$i$a$-forEach-MutableObjectList$minusAssign$2":I
    nop

    .line 1639
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1643
    .end local v3    # "i$iv":I
    :cond_0
    nop

    .line 1026
    .end local v0    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v1    # "$i$f$forEach":I
    .end local v2    # "content$iv":[Ljava/lang/Object;
    return-void
.end method

.method public final minusAssign(Landroidx/collection/ScatterSet;)V
    .locals 22
    .param p1, "elements"    # Landroidx/collection/ScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1030
    move-object/from16 v0, p1

    .local v0, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v2, 0x0

    .line 1644
    .local v2, "$i$f$forEach":I
    nop

    .line 1645
    iget-object v3, v0, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1646
    .local v3, "elements$iv":[Ljava/lang/Object;
    move-object v4, v0

    .local v4, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v5, 0x0

    .line 1647
    .local v5, "$i$f$forEachIndex":I
    nop

    .line 1648
    iget-object v6, v4, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1649
    .local v6, "m$iv$iv":[J
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    .line 1651
    .local v7, "lastIndex$iv$iv":I
    const/4 v8, 0x0

    .local v8, "i$iv$iv":I
    if-gt v8, v7, :cond_4

    .line 1652
    :goto_0
    aget-wide v9, v6, v8

    .line 1653
    .local v9, "slot$iv$iv":J
    move-wide v11, v9

    .local v11, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v13, 0x0

    .line 1654
    .local v13, "$i$f$maskEmptyOrDeleted":I
    not-long v14, v11

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v11

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v11, v14, v16

    .line 1653
    .end local v11    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v13    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v11, v11, v16

    if-eqz v11, :cond_3

    .line 1655
    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    .line 1656
    .local v11, "bitCount$iv$iv":I
    const/4 v13, 0x0

    .local v13, "j$iv$iv":I
    :goto_1
    if-ge v13, v11, :cond_2

    .line 1657
    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    .local v14, "value$iv$iv$iv":J
    const/16 v16, 0x0

    .line 1658
    .local v16, "$i$f$isFull":I
    const-wide/16 v17, 0x80

    cmp-long v17, v14, v17

    if-gez v17, :cond_0

    const/16 v17, 0x1

    goto :goto_2

    :cond_0
    const/16 v17, 0x0

    .line 1657
    .end local v14    # "value$iv$iv$iv":J
    .end local v16    # "$i$f$isFull":I
    :goto_2
    if-eqz v17, :cond_1

    .line 1659
    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    .line 1660
    .local v14, "index$iv$iv":I
    move v15, v14

    .local v15, "index$iv":I
    const/16 v16, 0x0

    .line 1646
    .local v16, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    move/from16 v17, v12

    aget-object v12, v3, v15

    .local v12, "element":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 1030
    .local v18, "$i$a$-forEach-MutableObjectList$minusAssign$3":I
    move-object/from16 v19, p0

    .local v19, "this_$iv":Landroidx/collection/MutableObjectList;
    const/16 v20, 0x0

    .line 1661
    .local v20, "$i$f$minusAssign":I
    move-object/from16 v21, v0

    move-object/from16 v0, v19

    .end local v19    # "this_$iv":Landroidx/collection/MutableObjectList;
    .local v0, "this_$iv":Landroidx/collection/MutableObjectList;
    .local v21, "this_$iv":Landroidx/collection/ScatterSet;
    invoke-virtual {v0, v12}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    .line 1662
    nop

    .line 1030
    .end local v0    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v20    # "$i$f$minusAssign":I
    nop

    .line 1646
    .end local v12    # "element":Ljava/lang/Object;
    .end local v18    # "$i$a$-forEach-MutableObjectList$minusAssign$3":I
    nop

    .line 1660
    .end local v15    # "index$iv":I
    .end local v16    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_3

    .line 1657
    .end local v14    # "index$iv$iv":I
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v0, "this_$iv":Landroidx/collection/ScatterSet;
    :cond_1
    move-object/from16 v21, v0

    move/from16 v17, v12

    .line 1663
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_3
    shr-long v9, v9, v17

    .line 1656
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v17

    move-object/from16 v0, v21

    goto :goto_1

    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_2
    move-object/from16 v21, v0

    move/from16 v17, v12

    .line 1665
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v13    # "j$iv$iv":I
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    move/from16 v0, v17

    if-ne v11, v0, :cond_6

    goto :goto_4

    .line 1653
    .end local v11    # "bitCount$iv$iv":I
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_3
    move-object/from16 v21, v0

    .line 1651
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v9    # "slot$iv$iv":J
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_4
    if-eq v8, v7, :cond_5

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, v21

    goto :goto_0

    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_4
    move-object/from16 v21, v0

    .line 1668
    .end local v0    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v8    # "i$iv$iv":I
    .restart local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_5
    nop

    .line 1669
    .end local v4    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v5    # "$i$f$forEachIndex":I
    .end local v6    # "m$iv$iv":[J
    .end local v7    # "lastIndex$iv$iv":I
    :cond_6
    nop

    .line 1031
    .end local v2    # "$i$f$forEach":I
    .end local v3    # "elements$iv":[Ljava/lang/Object;
    .end local v21    # "this_$iv":Landroidx/collection/ScatterSet;
    return-void
.end method

.method public final minusAssign(Ljava/lang/Iterable;)V
    .locals 8
    .param p1, "elements"    # Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1042
    move-object v0, p1

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 1672
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    .local v4, "element":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 1042
    .local v5, "$i$a$-forEach-MutableObjectList$minusAssign$4":I
    move-object v6, p0

    .local v6, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v7, 0x0

    .line 1673
    .local v7, "$i$f$minusAssign":I
    invoke-virtual {v6, v4}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    .line 1674
    nop

    .line 1042
    .end local v6    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v7    # "$i$f$minusAssign":I
    nop

    .line 1672
    .end local v4    # "element":Ljava/lang/Object;
    .end local v5    # "$i$a$-forEach-MutableObjectList$minusAssign$4":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1675
    :cond_0
    nop

    .line 1043
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    return-void
.end method

.method public final minusAssign(Ljava/lang/Object;)V
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 924
    .local v0, "$i$f$minusAssign":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    .line 925
    return-void
.end method

.method public final minusAssign(Ljava/util/List;)V
    .locals 5
    .param p1, "elements"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1035
    const/4 v0, 0x0

    .local v0, "i":I
    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 1036
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .local v2, "element$iv":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v4, 0x0

    .line 1670
    .local v4, "$i$f$minusAssign":I
    invoke-virtual {v3, v2}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    .line 1671
    nop

    .line 1035
    .end local v2    # "element$iv":Ljava/lang/Object;
    .end local v3    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v4    # "$i$f$minusAssign":I
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1038
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public final minusAssign(Lkotlin/sequences/Sequence;)V
    .locals 8
    .param p1, "elements"    # Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/Sequence<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1047
    move-object v0, p1

    .local v0, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/4 v1, 0x0

    .line 1676
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    .local v4, "element":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 1047
    .local v5, "$i$a$-forEach-MutableObjectList$minusAssign$5":I
    move-object v6, p0

    .local v6, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v7, 0x0

    .line 1677
    .local v7, "$i$f$minusAssign":I
    invoke-virtual {v6, v4}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    .line 1678
    nop

    .line 1047
    .end local v6    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v7    # "$i$f$minusAssign":I
    nop

    .line 1676
    .end local v4    # "element":Ljava/lang/Object;
    .end local v5    # "$i$a$-forEach-MutableObjectList$minusAssign$5":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1679
    :cond_0
    nop

    .line 1048
    .end local v0    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v1    # "$i$f$forEach":I
    return-void
.end method

.method public final minusAssign([Ljava/lang/Object;)V
    .locals 9
    .param p1, "elements"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1020
    move-object v0, p1

    .local v0, "$this$forEach$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1633
    .local v1, "$i$f$forEach":I
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    .local v5, "element":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 1020
    .local v6, "$i$a$-forEach-MutableObjectList$minusAssign$1":I
    move-object v7, p0

    .local v7, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v8, 0x0

    .line 1634
    .local v8, "$i$f$minusAssign":I
    invoke-virtual {v7, v5}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    .line 1635
    nop

    .line 1020
    .end local v7    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v8    # "$i$f$minusAssign":I
    nop

    .line 1633
    .end local v5    # "element":Ljava/lang/Object;
    .end local v6    # "$i$a$-forEach-MutableObjectList$minusAssign$1":I
    nop

    .end local v4    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1636
    :cond_0
    nop

    .line 1021
    .end local v0    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$forEach":I
    return-void
.end method

.method public final plusAssign(Landroidx/collection/ObjectList;)V
    .locals 5
    .param p1, "elements"    # Landroidx/collection/ObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 824
    invoke-virtual {p1}, Landroidx/collection/ObjectList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 825
    :cond_0
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    iget v1, p1, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v0, v1

    .local v0, "capacity$iv":I
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v2, 0x0

    .line 1577
    .local v2, "$i$f$ensureCapacity":I
    iget-object v3, v1, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1578
    .local v3, "oldContent$iv":[Ljava/lang/Object;
    array-length v4, v3

    if-ge v4, v0, :cond_1

    .line 1579
    invoke-virtual {v1, v0, v3}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 1581
    :cond_1
    nop

    .line 826
    .end local v0    # "capacity$iv":I
    .end local v1    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v2    # "$i$f$ensureCapacity":I
    .end local v3    # "oldContent$iv":[Ljava/lang/Object;
    iget-object v0, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 827
    .local v0, "content":[Ljava/lang/Object;
    iget-object v1, p1, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 828
    nop

    .line 829
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 830
    nop

    .line 831
    iget v3, p1, Landroidx/collection/ObjectList;->_size:I

    .line 827
    const/4 v4, 0x0

    invoke-static {v1, v0, v2, v4, v3}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 833
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    iget v2, p1, Landroidx/collection/ObjectList;->_size:I

    add-int/2addr v1, v2

    iput v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 834
    return-void
.end method

.method public final plusAssign(Landroidx/collection/ScatterSet;)V
    .locals 21
    .param p1, "elements"    # Landroidx/collection/ScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 838
    invoke-virtual {v1}, Landroidx/collection/ScatterSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 839
    :cond_0
    move-object/from16 v0, p0

    iget v2, v0, Landroidx/collection/MutableObjectList;->_size:I

    invoke-virtual {v1}, Landroidx/collection/ScatterSet;->getSize()I

    move-result v3

    add-int/2addr v2, v3

    .local v2, "capacity$iv":I
    move-object/from16 v3, p0

    .local v3, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v4, 0x0

    .line 1582
    .local v4, "$i$f$ensureCapacity":I
    iget-object v5, v3, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1583
    .local v5, "oldContent$iv":[Ljava/lang/Object;
    array-length v6, v5

    if-ge v6, v2, :cond_1

    .line 1584
    invoke-virtual {v3, v2, v5}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 1586
    :cond_1
    nop

    .line 840
    .end local v2    # "capacity$iv":I
    .end local v3    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v4    # "$i$f$ensureCapacity":I
    .end local v5    # "oldContent$iv":[Ljava/lang/Object;
    move-object/from16 v2, p1

    .local v2, "this_$iv":Landroidx/collection/ScatterSet;
    const/4 v3, 0x0

    .line 1587
    .local v3, "$i$f$forEach":I
    nop

    .line 1588
    iget-object v4, v2, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1589
    .local v4, "elements$iv":[Ljava/lang/Object;
    move-object v5, v2

    .local v5, "this_$iv$iv":Landroidx/collection/ScatterSet;
    const/4 v6, 0x0

    .line 1590
    .local v6, "$i$f$forEachIndex":I
    nop

    .line 1591
    iget-object v7, v5, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1592
    .local v7, "m$iv$iv":[J
    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    .line 1594
    .local v8, "lastIndex$iv$iv":I
    const/4 v9, 0x0

    .local v9, "i$iv$iv":I
    if-gt v9, v8, :cond_6

    .line 1595
    :goto_0
    aget-wide v10, v7, v9

    .line 1596
    .local v10, "slot$iv$iv":J
    move-wide v12, v10

    .local v12, "$this$maskEmptyOrDeleted$iv$iv$iv":J
    const/4 v14, 0x0

    .line 1597
    .local v14, "$i$f$maskEmptyOrDeleted":I
    not-long v0, v12

    const/4 v15, 0x7

    shl-long/2addr v0, v15

    and-long/2addr v0, v12

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v0, v15

    .line 1596
    .end local v12    # "$this$maskEmptyOrDeleted$iv$iv$iv":J
    .end local v14    # "$i$f$maskEmptyOrDeleted":I
    cmp-long v0, v0, v15

    if-eqz v0, :cond_5

    .line 1598
    sub-int v0, v9, v8

    not-int v0, v0

    ushr-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    .line 1599
    .local v0, "bitCount$iv$iv":I
    const/4 v12, 0x0

    .local v12, "j$iv$iv":I
    :goto_1
    if-ge v12, v0, :cond_4

    .line 1600
    const-wide/16 v13, 0xff

    and-long/2addr v13, v10

    .local v13, "value$iv$iv$iv":J
    const/4 v15, 0x0

    .line 1601
    .local v15, "$i$f$isFull":I
    const-wide/16 v16, 0x80

    cmp-long v16, v13, v16

    if-gez v16, :cond_2

    const/16 v16, 0x1

    goto :goto_2

    :cond_2
    const/16 v16, 0x0

    .line 1600
    .end local v13    # "value$iv$iv$iv":J
    .end local v15    # "$i$f$isFull":I
    :goto_2
    if-eqz v16, :cond_3

    .line 1602
    shl-int/lit8 v13, v9, 0x3

    add-int/2addr v13, v12

    .line 1603
    .local v13, "index$iv$iv":I
    move v14, v13

    .local v14, "index$iv":I
    const/4 v15, 0x0

    .line 1589
    .local v15, "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    move/from16 v16, v1

    aget-object v1, v4, v14

    .local v1, "element":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 840
    .local v17, "$i$a$-forEach-MutableObjectList$plusAssign$1":I
    move-object/from16 v18, p0

    .local v18, "this_$iv":Landroidx/collection/MutableObjectList;
    const/16 v19, 0x0

    .line 1604
    .local v19, "$i$f$plusAssign":I
    move-object/from16 v20, v2

    move-object/from16 v2, v18

    .end local v18    # "this_$iv":Landroidx/collection/MutableObjectList;
    .local v2, "this_$iv":Landroidx/collection/MutableObjectList;
    .local v20, "this_$iv":Landroidx/collection/ScatterSet;
    invoke-virtual {v2, v1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 1605
    nop

    .line 840
    .end local v2    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v19    # "$i$f$plusAssign":I
    nop

    .line 1589
    .end local v1    # "element":Ljava/lang/Object;
    .end local v17    # "$i$a$-forEach-MutableObjectList$plusAssign$1":I
    nop

    .line 1603
    .end local v14    # "index$iv":I
    .end local v15    # "$i$a$-forEachIndex-ScatterSet$forEach$2$iv":I
    goto :goto_3

    .line 1600
    .end local v13    # "index$iv$iv":I
    .end local v20    # "this_$iv":Landroidx/collection/ScatterSet;
    .local v2, "this_$iv":Landroidx/collection/ScatterSet;
    :cond_3
    move/from16 v16, v1

    move-object/from16 v20, v2

    .line 1606
    .end local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v20    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_3
    shr-long v10, v10, v16

    .line 1599
    add-int/lit8 v12, v12, 0x1

    move/from16 v1, v16

    move-object/from16 v2, v20

    goto :goto_1

    .end local v20    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_4
    move/from16 v16, v1

    move-object/from16 v20, v2

    .line 1608
    .end local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v12    # "j$iv$iv":I
    .restart local v20    # "this_$iv":Landroidx/collection/ScatterSet;
    if-ne v0, v1, :cond_8

    goto :goto_4

    .line 1596
    .end local v0    # "bitCount$iv$iv":I
    .end local v20    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_5
    move-object/from16 v20, v2

    .line 1594
    .end local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v10    # "slot$iv$iv":J
    .restart local v20    # "this_$iv":Landroidx/collection/ScatterSet;
    :goto_4
    if-eq v9, v8, :cond_7

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v20

    goto :goto_0

    .end local v20    # "this_$iv":Landroidx/collection/ScatterSet;
    .restart local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_6
    move-object/from16 v20, v2

    .line 1611
    .end local v2    # "this_$iv":Landroidx/collection/ScatterSet;
    .end local v9    # "i$iv$iv":I
    .restart local v20    # "this_$iv":Landroidx/collection/ScatterSet;
    :cond_7
    nop

    .line 1612
    .end local v5    # "this_$iv$iv":Landroidx/collection/ScatterSet;
    .end local v6    # "$i$f$forEachIndex":I
    .end local v7    # "m$iv$iv":[J
    .end local v8    # "lastIndex$iv$iv":I
    :cond_8
    nop

    .line 841
    .end local v3    # "$i$f$forEach":I
    .end local v4    # "elements$iv":[Ljava/lang/Object;
    .end local v20    # "this_$iv":Landroidx/collection/ScatterSet;
    return-void
.end method

.method public final plusAssign(Ljava/lang/Iterable;)V
    .locals 8
    .param p1, "elements"    # Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 866
    move-object v0, p1

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 1623
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    .local v4, "element":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 866
    .local v5, "$i$a$-forEach-MutableObjectList$plusAssign$2":I
    move-object v6, p0

    .local v6, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v7, 0x0

    .line 1624
    .local v7, "$i$f$plusAssign":I
    invoke-virtual {v6, v4}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 1625
    nop

    .line 866
    .end local v6    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v7    # "$i$f$plusAssign":I
    nop

    .line 1623
    .end local v4    # "element":Ljava/lang/Object;
    .end local v5    # "$i$a$-forEach-MutableObjectList$plusAssign$2":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1626
    :cond_0
    nop

    .line 867
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    return-void
.end method

.method public final plusAssign(Ljava/lang/Object;)V
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 919
    .local v0, "$i$f$plusAssign":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 920
    return-void
.end method

.method public final plusAssign(Ljava/util/List;)V
    .locals 6
    .param p1, "elements"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 854
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 855
    :cond_0
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 856
    .local v0, "size":I
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v0

    .local v1, "capacity$iv":I
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v3, 0x0

    .line 1618
    .local v3, "$i$f$ensureCapacity":I
    iget-object v4, v2, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1619
    .local v4, "oldContent$iv":[Ljava/lang/Object;
    array-length v5, v4

    if-ge v5, v1, :cond_1

    .line 1620
    invoke-virtual {v2, v1, v4}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 1622
    :cond_1
    nop

    .line 857
    .end local v1    # "capacity$iv":I
    .end local v2    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v3    # "$i$f$ensureCapacity":I
    .end local v4    # "oldContent$iv":[Ljava/lang/Object;
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 858
    .local v1, "content":[Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "i":I
    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_2

    .line 859
    add-int v4, v2, v0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v1, v4

    .line 858
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 861
    .end local v2    # "i":I
    :cond_2
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 862
    return-void
.end method

.method public final plusAssign(Lkotlin/sequences/Sequence;)V
    .locals 8
    .param p1, "elements"    # Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/Sequence<",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 871
    move-object v0, p1

    .local v0, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/4 v1, 0x0

    .line 1627
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    .local v4, "element":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 871
    .local v5, "$i$a$-forEach-MutableObjectList$plusAssign$3":I
    move-object v6, p0

    .local v6, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v7, 0x0

    .line 1628
    .local v7, "$i$f$plusAssign":I
    invoke-virtual {v6, v4}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 1629
    nop

    .line 871
    .end local v6    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v7    # "$i$f$plusAssign":I
    nop

    .line 1627
    .end local v4    # "element":Ljava/lang/Object;
    .end local v5    # "$i$a$-forEach-MutableObjectList$plusAssign$3":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 1630
    :cond_0
    nop

    .line 872
    .end local v0    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v1    # "$i$f$forEach":I
    return-void
.end method

.method public final plusAssign([Ljava/lang/Object;)V
    .locals 12
    .param p1, "elements"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 845
    array-length v0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-void

    .line 846
    :cond_1
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    array-length v1, p1

    add-int/2addr v0, v1

    .local v0, "capacity$iv":I
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v2, 0x0

    .line 1613
    .local v2, "$i$f$ensureCapacity":I
    iget-object v3, v1, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1614
    .local v3, "oldContent$iv":[Ljava/lang/Object;
    array-length v4, v3

    if-ge v4, v0, :cond_2

    .line 1615
    invoke-virtual {v1, v0, v3}, Landroidx/collection/MutableObjectList;->resizeStorage(I[Ljava/lang/Object;)V

    .line 1617
    :cond_2
    nop

    .line 847
    .end local v0    # "capacity$iv":I
    .end local v1    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v2    # "$i$f$ensureCapacity":I
    .end local v3    # "oldContent$iv":[Ljava/lang/Object;
    iget-object v6, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 848
    .local v6, "content":[Ljava/lang/Object;
    iget v7, p0, Landroidx/collection/MutableObjectList;->_size:I

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p1

    .end local p1    # "elements":[Ljava/lang/Object;
    .local v5, "elements":[Ljava/lang/Object;
    invoke-static/range {v5 .. v11}, Lkotlin/collections/ArraysKt;->copyInto$default([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    .line 849
    iget p1, p0, Landroidx/collection/MutableObjectList;->_size:I

    array-length v0, v5

    add-int/2addr p1, v0

    iput p1, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 850
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .line 933
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 934
    .local v0, "index":I
    if-ltz v0, :cond_0

    .line 935
    invoke-virtual {p0, v0}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    .line 936
    const/4 v1, 0x1

    return v1

    .line 938
    :cond_0
    const/4 v1, 0x0

    return v1
.end method

.method public final removeAll(Landroidx/collection/ObjectList;)Z
    .locals 2
    .param p1, "elements"    # Landroidx/collection/ObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 973
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 974
    .local v0, "initialSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Landroidx/collection/ObjectList;)V

    .line 975
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final removeAll(Landroidx/collection/ScatterSet;)Z
    .locals 2
    .param p1, "elements"    # Landroidx/collection/ScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ScatterSet<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 983
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 984
    .local v0, "initialSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Landroidx/collection/ScatterSet;)V

    .line 985
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final removeAll(Ljava/lang/Iterable;)Z
    .locals 2
    .param p1, "elements"    # Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1003
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1004
    .local v0, "initialSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Ljava/lang/Iterable;)V

    .line 1005
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final removeAll(Ljava/util/List;)Z
    .locals 2
    .param p1, "elements"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 993
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 994
    .local v0, "initialSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Ljava/util/List;)V

    .line 995
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final removeAll(Lkotlin/sequences/Sequence;)Z
    .locals 2
    .param p1, "elements"    # Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/Sequence<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1013
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1014
    .local v0, "initialSize":I
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->minusAssign(Lkotlin/sequences/Sequence;)V

    .line 1015
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final removeAll([Ljava/lang/Object;)Z
    .locals 4
    .param p1, "elements"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 961
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 962
    .local v0, "initialSize":I
    const/4 v1, 0x0

    .local v1, "i":I
    array-length v2, p1

    :goto_0
    if-ge v1, v2, :cond_0

    .line 963
    aget-object v3, p1, v1

    invoke-virtual {p0, v3}, Landroidx/collection/MutableObjectList;->remove(Ljava/lang/Object;)Z

    .line 962
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 965
    .end local v1    # "i":I
    :cond_0
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public final removeAt(I)Ljava/lang/Object;
    .locals 6
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1056
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-ge p1, v2, :cond_0

    move v0, v1

    :cond_0
    if-nez v0, :cond_1

    .line 1057
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->throwIndexOutOfBoundsExclusiveException$collection(I)V

    .line 1059
    :cond_1
    iget-object v0, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1060
    .local v0, "content":[Ljava/lang/Object;
    aget-object v2, v0, p1

    .line 1061
    .local v2, "element":Ljava/lang/Object;
    move-object v3, p0

    check-cast v3, Landroidx/collection/ObjectList;

    .local v3, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v4, 0x0

    .line 1680
    .local v4, "$i$f$getLastIndex":I
    iget v5, v3, Landroidx/collection/ObjectList;->_size:I

    sub-int/2addr v5, v1

    .line 1061
    .end local v3    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v4    # "$i$f$getLastIndex":I
    if-eq p1, v5, :cond_2

    .line 1062
    nop

    .line 1063
    nop

    .line 1064
    nop

    .line 1065
    add-int/lit8 v1, p1, 0x1

    .line 1066
    iget v3, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1062
    invoke-static {v0, v0, p1, v1, v3}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 1069
    :cond_2
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1070
    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    const/4 v3, 0x0

    aput-object v3, v0, v1

    .line 1071
    return-object v2
.end method

.method public final removeIf(Lkotlin/jvm/functions/Function1;)V
    .locals 8
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TE;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 943
    .local v0, "$i$f$removeIf":I
    const/4 v1, 0x0

    .line 944
    .local v1, "gap":I
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 945
    .local v2, "size":I
    iget-object v3, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 946
    .local v3, "content":[Ljava/lang/Object;
    move-object v4, p0

    check-cast v4, Landroidx/collection/ObjectList;

    .local v4, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v5, 0x0

    .line 1632
    .local v5, "$i$f$getIndices":I
    const/4 v6, 0x0

    iget v7, v4, Landroidx/collection/ObjectList;->_size:I

    invoke-static {v6, v7}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v4

    .line 946
    .end local v4    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v5    # "$i$f$getIndices":I
    invoke-virtual {v4}, Lkotlin/ranges/IntRange;->getFirst()I

    move-result v5

    .local v5, "i":I
    invoke-virtual {v4}, Lkotlin/ranges/IntRange;->getLast()I

    move-result v4

    if-gt v5, v4, :cond_1

    .line 947
    :goto_0
    sub-int v6, v5, v1

    aget-object v7, v3, v5

    aput-object v7, v3, v6

    .line 948
    aget-object v6, v3, v5

    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 949
    add-int/lit8 v1, v1, 0x1

    .line 946
    :cond_0
    if-eq v5, v4, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 952
    .end local v5    # "i":I
    :cond_1
    const/4 v4, 0x0

    sub-int v5, v2, v1

    invoke-static {v3, v4, v5, v2}, Lkotlin/collections/ArraysKt;->fill([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 953
    iget v4, p0, Landroidx/collection/MutableObjectList;->_size:I

    sub-int/2addr v4, v1

    iput v4, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 954
    return-void
.end method

.method public final removeRange(II)V
    .locals 4
    .param p1, "start"    # I
    .param p2, "end"    # I

    .line 1084
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-gt p1, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Start ("

    if-eqz v2, :cond_2

    if-ltz p2, :cond_1

    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-gt p2, v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-nez v0, :cond_3

    .line 1085
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") and end ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") must be in 0.."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/collection/internal/RuntimeHelpersKt;->throwIndexOutOfBoundsException(Ljava/lang/String;)V

    .line 1087
    :cond_3
    if-ge p2, p1, :cond_4

    .line 1088
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") is more than end ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/collection/internal/RuntimeHelpersKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 1090
    :cond_4
    if-eq p2, p1, :cond_6

    .line 1091
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-ge p2, v0, :cond_5

    .line 1092
    iget-object v0, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1093
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1094
    nop

    .line 1095
    nop

    .line 1096
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1092
    invoke-static {v0, v1, p1, p2, v2}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 1099
    :cond_5
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    sub-int v1, p2, p1

    sub-int/2addr v0, v1

    .line 1100
    .local v0, "newSize":I
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Landroidx/collection/MutableObjectList;->_size:I

    invoke-static {v1, v2, v0, v3}, Lkotlin/collections/ArraysKt;->fill([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 1101
    iput v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1103
    .end local v0    # "newSize":I
    :cond_6
    return-void
.end method

.method public final resizeStorage(I[Ljava/lang/Object;)V
    .locals 4
    .param p1, "capacity"    # I
    .param p2, "oldContent"    # [Ljava/lang/Object;

    const-string/jumbo v0, "oldContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 911
    array-length v0, p2

    .line 912
    .local v0, "oldSize":I
    mul-int/lit8 v1, v0, 0x3

    div-int/lit8 v1, v1, 0x2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 913
    .local v1, "newSize":I
    new-array v2, v1, [Ljava/lang/Object;

    .line 914
    .local v2, "newContent":[Ljava/lang/Object;
    const/4 v3, 0x0

    invoke-static {p2, v2, v3, v3, v0}, Lkotlin/collections/ArraysKt;->copyInto([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 915
    return-void
.end method

.method public final retainAll(Landroidx/collection/ObjectList;)Z
    .locals 6
    .param p1, "elements"    # Landroidx/collection/ObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/ObjectList<",
            "TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1128
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1129
    .local v0, "initialSize":I
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1130
    .local v1, "content":[Ljava/lang/Object;
    move-object v2, p0

    check-cast v2, Landroidx/collection/ObjectList;

    .local v2, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v3, 0x0

    .line 1682
    .local v3, "$i$f$getLastIndex":I
    iget v4, v2, Landroidx/collection/ObjectList;->_size:I

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    .line 1130
    .end local v2    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v3    # "$i$f$getLastIndex":I
    nop

    .local v4, "i":I
    :goto_0
    const/4 v2, -0x1

    if-ge v2, v4, :cond_1

    .line 1131
    aget-object v2, v1, v4

    .line 1132
    .local v2, "element":Ljava/lang/Object;
    invoke-virtual {p1, v2}, Landroidx/collection/ObjectList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1133
    invoke-virtual {p0, v4}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    .line 1130
    .end local v2    # "element":Ljava/lang/Object;
    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 1136
    .end local v4    # "i":I
    :cond_1
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    return v5
.end method

.method public final retainAll(Ljava/lang/Iterable;)Z
    .locals 6
    .param p1, "elements"    # Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1162
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1163
    .local v0, "initialSize":I
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1164
    .local v1, "content":[Ljava/lang/Object;
    move-object v2, p0

    check-cast v2, Landroidx/collection/ObjectList;

    .local v2, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v3, 0x0

    .line 1684
    .local v3, "$i$f$getLastIndex":I
    iget v4, v2, Landroidx/collection/ObjectList;->_size:I

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    .line 1164
    .end local v2    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v3    # "$i$f$getLastIndex":I
    nop

    .local v4, "i":I
    :goto_0
    const/4 v2, -0x1

    if-ge v2, v4, :cond_1

    .line 1165
    aget-object v2, v1, v4

    .line 1166
    .local v2, "element":Ljava/lang/Object;
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1167
    invoke-virtual {p0, v4}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    .line 1164
    .end local v2    # "element":Ljava/lang/Object;
    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 1170
    .end local v4    # "i":I
    :cond_1
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    return v5
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 6
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1145
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1146
    .local v0, "initialSize":I
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1147
    .local v1, "content":[Ljava/lang/Object;
    move-object v2, p0

    check-cast v2, Landroidx/collection/ObjectList;

    .local v2, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v3, 0x0

    .line 1683
    .local v3, "$i$f$getLastIndex":I
    iget v4, v2, Landroidx/collection/ObjectList;->_size:I

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    .line 1147
    .end local v2    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v3    # "$i$f$getLastIndex":I
    nop

    .local v4, "i":I
    :goto_0
    const/4 v2, -0x1

    if-ge v2, v4, :cond_1

    .line 1148
    aget-object v2, v1, v4

    .line 1149
    .local v2, "element":Ljava/lang/Object;
    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1150
    invoke-virtual {p0, v4}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    .line 1147
    .end local v2    # "element":Ljava/lang/Object;
    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 1153
    .end local v4    # "i":I
    :cond_1
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    return v5
.end method

.method public final retainAll(Lkotlin/sequences/Sequence;)Z
    .locals 6
    .param p1, "elements"    # Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/sequences/Sequence<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1179
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1180
    .local v0, "initialSize":I
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1181
    .local v1, "content":[Ljava/lang/Object;
    move-object v2, p0

    check-cast v2, Landroidx/collection/ObjectList;

    .local v2, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v3, 0x0

    .line 1685
    .local v3, "$i$f$getLastIndex":I
    iget v4, v2, Landroidx/collection/ObjectList;->_size:I

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    .line 1181
    .end local v2    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v3    # "$i$f$getLastIndex":I
    nop

    .local v4, "i":I
    :goto_0
    const/4 v2, -0x1

    if-ge v2, v4, :cond_1

    .line 1182
    aget-object v2, v1, v4

    .line 1183
    .local v2, "element":Ljava/lang/Object;
    invoke-static {p1, v2}, Lkotlin/sequences/SequencesKt;->contains(Lkotlin/sequences/Sequence;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1184
    invoke-virtual {p0, v4}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    .line 1181
    .end local v2    # "element":Ljava/lang/Object;
    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 1187
    .end local v4    # "i":I
    :cond_1
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    return v5
.end method

.method public final retainAll([Ljava/lang/Object;)Z
    .locals 6
    .param p1, "elements"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1111
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    .line 1112
    .local v0, "initialSize":I
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1113
    .local v1, "content":[Ljava/lang/Object;
    move-object v2, p0

    check-cast v2, Landroidx/collection/ObjectList;

    .local v2, "this_$iv":Landroidx/collection/ObjectList;
    const/4 v3, 0x0

    .line 1681
    .local v3, "$i$f$getLastIndex":I
    iget v4, v2, Landroidx/collection/ObjectList;->_size:I

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    .line 1113
    .end local v2    # "this_$iv":Landroidx/collection/ObjectList;
    .end local v3    # "$i$f$getLastIndex":I
    nop

    .local v4, "i":I
    :goto_0
    const/4 v2, -0x1

    if-ge v2, v4, :cond_1

    .line 1114
    aget-object v2, v1, v4

    .line 1115
    .local v2, "element":Ljava/lang/Object;
    invoke-static {p1, v2}, Lkotlin/collections/ArraysKt;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_0

    .line 1116
    invoke-virtual {p0, v4}, Landroidx/collection/MutableObjectList;->removeAt(I)Ljava/lang/Object;

    .line 1113
    .end local v2    # "element":Ljava/lang/Object;
    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 1119
    .end local v4    # "i":I
    :cond_1
    iget v2, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    return v5
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "index"    # I
    .param p2, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .line 1197
    const/4 v0, 0x0

    if-ltz p1, :cond_0

    iget v1, p0, Landroidx/collection/MutableObjectList;->_size:I

    if-ge p1, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-nez v0, :cond_1

    .line 1198
    invoke-virtual {p0, p1}, Landroidx/collection/MutableObjectList;->throwIndexOutOfBoundsExclusiveException$collection(I)V

    .line 1200
    :cond_1
    iget-object v0, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 1201
    .local v0, "content":[Ljava/lang/Object;
    aget-object v1, v0, p1

    .line 1202
    .local v1, "old":Ljava/lang/Object;
    aput-object p2, v0, p1

    .line 1203
    return-object v1
.end method

.method public final trim(I)V
    .locals 4
    .param p1, "minCapacity"    # I

    .line 891
    iget v0, p0, Landroidx/collection/MutableObjectList;->_size:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 892
    .local v0, "minSize":I
    move-object v1, p0

    .local v1, "this_$iv":Landroidx/collection/MutableObjectList;
    const/4 v2, 0x0

    .line 1631
    .local v2, "$i$f$getCapacity":I
    iget-object v3, v1, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    array-length v1, v3

    .line 892
    .end local v1    # "this_$iv":Landroidx/collection/MutableObjectList;
    .end local v2    # "$i$f$getCapacity":I
    if-le v1, v0, :cond_0

    .line 893
    iget-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "copyOf(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Landroidx/collection/MutableObjectList;->content:[Ljava/lang/Object;

    .line 895
    :cond_0
    return-void
.end method
