.class public final Landroidx/compose/runtime/changelist/Operation$MoveNode;
.super Landroidx/compose/runtime/changelist/Operation;
.source "Operation.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/changelist/Operation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MoveNode"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,1057:1\n580#1:1058\n583#1:1059\n586#1:1060\n580#1,7:1061\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n590#1:1058\n591#1:1059\n592#1:1060\n601#1:1061,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u00020\u000c2\n\u0010\r\u001a\u00060\u0004j\u0002`\u000eH\u0016J(\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\u0008\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u00048\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006R\u0012\u0010\t\u001a\u00020\u00048\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0006\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/runtime/changelist/Operation$MoveNode;",
        "Landroidx/compose/runtime/changelist/Operation;",
        "()V",
        "Count",
        "",
        "getCount",
        "()I",
        "From",
        "getFrom",
        "To",
        "getTo",
        "intParamName",
        "",
        "parameter",
        "Landroidx/compose/runtime/changelist/IntParameter;",
        "execute",
        "",
        "Landroidx/compose/runtime/changelist/OperationArgContainer;",
        "applier",
        "Landroidx/compose/runtime/Applier;",
        "slots",
        "Landroidx/compose/runtime/SlotWriter;",
        "rememberManager",
        "Landroidx/compose/runtime/RememberManager;",
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

.field public static final INSTANCE:Landroidx/compose/runtime/changelist/Operation$MoveNode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/runtime/changelist/Operation$MoveNode;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/Operation$MoveNode;-><init>()V

    sput-object v0, Landroidx/compose/runtime/changelist/Operation$MoveNode;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$MoveNode;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 578
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public execute(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
    .locals 4
    .param p1, "$this$execute"    # Landroidx/compose/runtime/changelist/OperationArgContainer;
    .param p2, "applier"    # Landroidx/compose/runtime/Applier;
    .param p3, "slots"    # Landroidx/compose/runtime/SlotWriter;
    .param p4, "rememberManager"    # Landroidx/compose/runtime/RememberManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/changelist/OperationArgContainer;",
            "Landroidx/compose/runtime/Applier<",
            "*>;",
            "Landroidx/compose/runtime/SlotWriter;",
            "Landroidx/compose/runtime/RememberManager;",
            ")V"
        }
    .end annotation

    .line 601
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    const/4 v1, 0x0

    .line 1061
    .local v1, "$i$f$getFrom":I
    nop

    .line 601
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    .end local v1    # "$i$f$getFrom":I
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getInt(I)I

    move-result v0

    move-object v1, p0

    .local v1, "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    const/4 v2, 0x0

    .line 1064
    .local v2, "$i$f$getTo":I
    nop

    .line 601
    .end local v1    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    .end local v2    # "$i$f$getTo":I
    const/4 v1, 0x1

    invoke-interface {p1, v1}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getInt(I)I

    move-result v1

    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    const/4 v3, 0x0

    .line 1067
    .local v3, "$i$f$getCount":I
    nop

    .line 601
    .end local v2    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    .end local v3    # "$i$f$getCount":I
    const/4 v2, 0x2

    invoke-interface {p1, v2}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getInt(I)I

    move-result v2

    invoke-interface {p2, v0, v1, v2}, Landroidx/compose/runtime/Applier;->move(III)V

    .line 602
    return-void
.end method

.method public final getCount()I
    .locals 2

    const/4 v0, 0x0

    .line 586
    .local v0, "$i$f$getCount":I
    const/4 v1, 0x2

    return v1
.end method

.method public final getFrom()I
    .locals 2

    const/4 v0, 0x0

    .line 580
    .local v0, "$i$f$getFrom":I
    const/4 v1, 0x0

    return v1
.end method

.method public final getTo()I
    .locals 2

    const/4 v0, 0x0

    .line 583
    .local v0, "$i$f$getTo":I
    const/4 v1, 0x1

    return v1
.end method

.method public intParamName(I)Ljava/lang/String;
    .locals 2
    .param p1, "parameter"    # I

    .line 589
    nop

    .line 590
    move-object v0, p0

    .local v0, "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    const/4 v1, 0x0

    .line 1058
    .local v1, "$i$f$getFrom":I
    nop

    .line 590
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    .end local v1    # "$i$f$getFrom":I
    if-nez p1, :cond_0

    const-string v0, "from"

    goto :goto_0

    .line 591
    :cond_0
    move-object v0, p0

    .restart local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    const/4 v1, 0x0

    .line 1059
    .local v1, "$i$f$getTo":I
    nop

    .line 591
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    .end local v1    # "$i$f$getTo":I
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const-string/jumbo v0, "to"

    goto :goto_0

    .line 592
    :cond_1
    move-object v0, p0

    .restart local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    const/4 v1, 0x0

    .line 1060
    .local v1, "$i$f$getCount":I
    nop

    .line 592
    .end local v0    # "this_$iv":Landroidx/compose/runtime/changelist/Operation$MoveNode;
    .end local v1    # "$i$f$getCount":I
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    const-string v0, "count"

    goto :goto_0

    .line 593
    :cond_2
    invoke-super {p0, p1}, Landroidx/compose/runtime/changelist/Operation;->intParamName(I)Ljava/lang/String;

    move-result-object v0

    .line 594
    :goto_0
    return-object v0
.end method
