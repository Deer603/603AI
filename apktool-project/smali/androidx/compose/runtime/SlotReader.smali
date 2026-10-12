.class public final Landroidx/compose/runtime/SlotReader;
.super Ljava/lang/Object;
.source "SlotTable.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3963:1\n3746#2:3964\n3666#2:3965\n3666#2:3966\n3732#2:3967\n3732#2:3968\n3666#2:3969\n3726#2:3970\n3726#2:3971\n3672#2:3972\n3672#2:3973\n3726#2:3974\n3689#2:3975\n3698#2:3976\n3732#2:3977\n3746#2:3983\n3777#2:3984\n3777#2:3985\n3746#2:3991\n3777#2:3997\n3666#2:3998\n3666#2:4009\n3732#2:4010\n3746#2:4021\n3746#2:4032\n3777#2:4033\n3726#2:4034\n3666#2:4035\n3732#2:4036\n3825#2,6:4037\n3666#2:4043\n3669#2:4044\n3681#2:4045\n3672#2:4046\n33#3,5:3978\n33#3,5:3986\n33#3,5:3992\n33#3,5:3999\n4643#4,5:4004\n4643#4,5:4011\n4643#4,5:4016\n4643#4,5:4022\n4643#4,5:4027\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n873#1:3964\n877#1:3965\n880#1:3966\n887#1:3967\n890#1:3968\n893#1:3969\n924#1:3970\n928#1:3971\n938#1:3972\n941#1:3973\n962#1:3974\n965#1:3975\n971#1:3976\n975#1:3977\n985#1:3983\n994#1:3984\n1011#1:3985\n1062#1:3991\n1080#1:3997\n1087#1:3998\n1095#1:4009\n1095#1:4010\n1112#1:4021\n1140#1:4032\n1151#1:4033\n1168#1:4034\n1171#1:4035\n1171#1:4036\n1185#1:4037,6\n1188#1:4043\n1189#1:4044\n1193#1:4045\n1198#1:4046\n984#1:3978,5\n1044#1:3986,5\n1062#1:3992,5\n1087#1:3999,5\n1094#1:4004,5\n1102#1:4011,5\n1110#1:4016,5\n1125#1:4022,5\n1137#1:4027,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0015\n\u0002\u0008\u0016\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010H\u001a\u00020C2\u0008\u0008\u0002\u0010I\u001a\u00020\nJ\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u000e\u0010M\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u0006\u0010N\u001a\u00020KJ\u0006\u0010O\u001a\u00020KJ\u000c\u0010P\u001a\u0008\u0012\u0004\u0012\u00020R0QJ\u0010\u0010S\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u0010\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u0018\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010U\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010H\u001a\u00020CJ\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010V\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u000e\u00100\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u0008\u0010W\u001a\u0004\u0018\u00010\u0001J\u0010\u0010X\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u000e\u00101\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u00103\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010Y\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010Z\u001a\u00020K2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010[\u001a\u00020K2\u0006\u0010I\u001a\u00020\nJ\u0006\u0010\\\u001a\u00020\nJ\u0006\u0010]\u001a\u00020KJ\u0006\u0010^\u001a\u00020KJ\u0006\u0010_\u001a\u00020KJ\u0008\u0010`\u001a\u00020aH\u0016J\u0016\u0010b\u001a\u0004\u0018\u00010\u0001*\u00020\'2\u0006\u0010I\u001a\u00020\nH\u0002J\u0016\u0010X\u001a\u0004\u0018\u00010\u0001*\u00020\'2\u0006\u0010I\u001a\u00020\nH\u0002J\u0016\u0010c\u001a\u0004\u0018\u00010\u0001*\u00020\'2\u0006\u0010I\u001a\u00020\nH\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\rR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0017R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0017R\u0011\u0010 \u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\rR\u0011\u0010\"\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\rR\u0011\u0010$\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\rR\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\tR\u0011\u0010+\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010\tR\u0011\u0010-\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010\tR\u0011\u0010/\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\tR\u0011\u00100\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u00080\u0010\tR\u0011\u00101\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u00082\u0010\rR\u001e\u00103\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\rR\u0011\u00105\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u00086\u0010\rR\u0011\u00107\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u00088\u0010\rR\u0011\u00109\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010\rR\u0011\u0010;\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010\rR\u0018\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010>X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010?R\u000e\u0010@\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010A\u001a\"\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0018\u00010Bj\u0010\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0018\u0001`EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010G\u00a8\u0006d"
    }
    d2 = {
        "Landroidx/compose/runtime/SlotReader;",
        "",
        "table",
        "Landroidx/compose/runtime/SlotTable;",
        "(Landroidx/compose/runtime/SlotTable;)V",
        "<set-?>",
        "",
        "closed",
        "getClosed",
        "()Z",
        "",
        "currentEnd",
        "getCurrentEnd",
        "()I",
        "currentGroup",
        "getCurrentGroup",
        "currentSlot",
        "currentSlotEnd",
        "currentSlotStack",
        "Landroidx/compose/runtime/IntStack;",
        "emptyCount",
        "groupAux",
        "getGroupAux",
        "()Ljava/lang/Object;",
        "groupEnd",
        "getGroupEnd",
        "groupKey",
        "getGroupKey",
        "groupNode",
        "getGroupNode",
        "groupObjectKey",
        "getGroupObjectKey",
        "groupSize",
        "getGroupSize",
        "groupSlotCount",
        "getGroupSlotCount",
        "groupSlotIndex",
        "getGroupSlotIndex",
        "groups",
        "",
        "groupsSize",
        "hadNext",
        "getHadNext",
        "hasObjectKey",
        "getHasObjectKey",
        "inEmpty",
        "getInEmpty",
        "isGroupEnd",
        "isNode",
        "nodeCount",
        "getNodeCount",
        "parent",
        "getParent",
        "parentNodes",
        "getParentNodes",
        "remainingSlots",
        "getRemainingSlots",
        "size",
        "getSize",
        "slot",
        "getSlot",
        "slots",
        "",
        "[Ljava/lang/Object;",
        "slotsSize",
        "sourceInformationMap",
        "Ljava/util/HashMap;",
        "Landroidx/compose/runtime/Anchor;",
        "Landroidx/compose/runtime/GroupSourceInformation;",
        "Lkotlin/collections/HashMap;",
        "getTable$runtime_release",
        "()Landroidx/compose/runtime/SlotTable;",
        "anchor",
        "index",
        "beginEmpty",
        "",
        "close",
        "containsMark",
        "endEmpty",
        "endGroup",
        "extractKeys",
        "",
        "Landroidx/compose/runtime/KeyInfo;",
        "get",
        "groupGet",
        "group",
        "hasMark",
        "next",
        "node",
        "parentOf",
        "reposition",
        "restoreParent",
        "skipGroup",
        "skipToGroupEnd",
        "startGroup",
        "startNode",
        "toString",
        "",
        "aux",
        "objectKey",
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
.field private closed:Z

.field private currentEnd:I

.field private currentGroup:I

.field private currentSlot:I

.field private currentSlotEnd:I

.field private final currentSlotStack:Landroidx/compose/runtime/IntStack;

.field private emptyCount:I

.field private final groups:[I

.field private final groupsSize:I

.field private hadNext:Z

.field private parent:I

.field private final slots:[Ljava/lang/Object;

.field private final slotsSize:I

.field private sourceInformationMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroidx/compose/runtime/Anchor;",
            "Landroidx/compose/runtime/GroupSourceInformation;",
            ">;"
        }
    .end annotation
.end field

.field private final table:Landroidx/compose/runtime/SlotTable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/runtime/SlotReader;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/SlotTable;)V
    .locals 1
    .param p1, "table"    # Landroidx/compose/runtime/SlotTable;

    .line 810
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 812
    iput-object p1, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    .line 816
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroups()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .line 819
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getGroupsSize()I

    move-result v0

    iput v0, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    .line 822
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getSlots()[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/runtime/SlotReader;->slots:[Ljava/lang/Object;

    .line 825
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getSlotsSize()I

    move-result v0

    iput v0, p0, Landroidx/compose/runtime/SlotReader;->slotsSize:I

    .line 842
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    iput v0, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    .line 846
    const/4 v0, -0x1

    iput v0, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    .line 850
    new-instance v0, Landroidx/compose/runtime/IntStack;

    invoke-direct {v0}, Landroidx/compose/runtime/IntStack;-><init>()V

    iput-object v0, p0, Landroidx/compose/runtime/SlotReader;->currentSlotStack:Landroidx/compose/runtime/IntStack;

    .line 810
    return-void
.end method

.method public static synthetic anchor$default(Landroidx/compose/runtime/SlotReader;IILjava/lang/Object;)Landroidx/compose/runtime/Anchor;
    .locals 0

    .line 1184
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/SlotReader;->anchor(I)Landroidx/compose/runtime/Anchor;

    move-result-object p0

    return-object p0
.end method

.method private final aux([II)Ljava/lang/Object;
    .locals 5
    .param p1, "$this$aux"    # [I
    .param p2, "index"    # I

    .line 1193
    move-object v0, p1

    .local v0, "$this$hasAux$iv":[I
    const/4 v1, 0x0

    .line 4045
    .local v1, "$i$f$hasAux":I
    mul-int/lit8 v2, p2, 0x5

    const/4 v3, 0x1

    add-int/2addr v2, v3

    aget v2, v0, v2

    const/high16 v4, 0x10000000

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 1193
    .end local v0    # "$this$hasAux$iv":[I
    .end local v1    # "$i$f$hasAux":I
    :goto_0
    if-eqz v3, :cond_1

    .line 1194
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->slots:[Ljava/lang/Object;

    invoke-static {p1, p2}, Landroidx/compose/runtime/SlotTableKt;->access$auxIndex([II)I

    move-result v1

    aget-object v0, v0, v1

    goto :goto_1

    .line 1195
    :cond_1
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method private final node([II)Ljava/lang/Object;
    .locals 5
    .param p1, "$this$node"    # [I
    .param p2, "index"    # I

    .line 1188
    move-object v0, p1

    .local v0, "$this$isNode$iv":[I
    const/4 v1, 0x0

    .line 4043
    .local v1, "$i$f$isNode":I
    mul-int/lit8 v2, p2, 0x5

    const/4 v3, 0x1

    add-int/2addr v2, v3

    aget v2, v0, v2

    const/high16 v4, 0x40000000    # 2.0f

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 1188
    .end local v0    # "$this$isNode$iv":[I
    .end local v1    # "$i$f$isNode":I
    :goto_0
    if-eqz v3, :cond_1

    .line 1189
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->slots:[Ljava/lang/Object;

    move-object v1, p1

    .local v1, "$this$nodeIndex$iv":[I
    const/4 v2, 0x0

    .line 4044
    .local v2, "$i$f$nodeIndex":I
    mul-int/lit8 v3, p2, 0x5

    add-int/lit8 v3, v3, 0x4

    aget v1, v1, v3

    .end local v1    # "$this$nodeIndex$iv":[I
    .end local v2    # "$i$f$nodeIndex":I
    aget-object v0, v0, v1

    goto :goto_1

    .line 1190
    :cond_1
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method private final objectKey([II)Ljava/lang/Object;
    .locals 5
    .param p1, "$this$objectKey"    # [I
    .param p2, "index"    # I

    .line 1198
    move-object v0, p1

    .local v0, "$this$hasObjectKey$iv":[I
    const/4 v1, 0x0

    .line 4046
    .local v1, "$i$f$hasObjectKey":I
    mul-int/lit8 v2, p2, 0x5

    const/4 v3, 0x1

    add-int/2addr v2, v3

    aget v2, v0, v2

    const/high16 v4, 0x20000000

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 1198
    .end local v0    # "$this$hasObjectKey$iv":[I
    .end local v1    # "$i$f$hasObjectKey":I
    :goto_0
    if-eqz v3, :cond_1

    .line 1199
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->slots:[Ljava/lang/Object;

    invoke-static {p1, p2}, Landroidx/compose/runtime/SlotTableKt;->access$objectKeyIndex([II)I

    move-result v1

    aget-object v0, v0, v1

    goto :goto_1

    .line 1200
    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method


# virtual methods
.method public final anchor(I)Landroidx/compose/runtime/Anchor;
    .locals 6
    .param p1, "index"    # I

    .line 1185
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->getAnchors$runtime_release()Ljava/util/ArrayList;

    move-result-object v0

    .local v0, "$this$getOrAdd$iv":Ljava/util/ArrayList;
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    .local v1, "effectiveSize$iv":I
    const/4 v2, 0x0

    .line 4037
    .local v2, "$i$f$getOrAdd":I
    invoke-static {v0, p1, v1}, Landroidx/compose/runtime/SlotTableKt;->access$search(Ljava/util/ArrayList;II)I

    move-result v3

    .line 4038
    .local v3, "location$iv":I
    if-gez v3, :cond_0

    .line 4039
    const/4 v4, 0x0

    .line 1185
    .local v4, "$i$a$-getOrAdd-SlotReader$anchor$1":I
    new-instance v5, Landroidx/compose/runtime/Anchor;

    invoke-direct {v5, p1}, Landroidx/compose/runtime/Anchor;-><init>(I)V

    .line 4039
    .end local v4    # "$i$a$-getOrAdd-SlotReader$anchor$1":I
    nop

    .line 4040
    .local v5, "anchor$iv":Landroidx/compose/runtime/Anchor;
    add-int/lit8 v4, v3, 0x1

    neg-int v4, v4

    invoke-virtual {v0, v4, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 4041
    nop

    .end local v5    # "anchor$iv":Landroidx/compose/runtime/Anchor;
    goto :goto_0

    .line 4042
    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroidx/compose/runtime/Anchor;

    .line 4038
    :goto_0
    nop

    .line 1185
    .end local v0    # "$this$getOrAdd$iv":Ljava/util/ArrayList;
    .end local v1    # "effectiveSize$iv":I
    .end local v2    # "$i$f$getOrAdd":I
    .end local v3    # "location$iv":I
    return-object v5
.end method

.method public final beginEmpty()V
    .locals 1

    .line 1039
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    .line 1040
    return-void
.end method

.method public final close()V
    .locals 2

    .line 1053
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/runtime/SlotReader;->closed:Z

    .line 1054
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->sourceInformationMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0, v1}, Landroidx/compose/runtime/SlotTable;->close$runtime_release(Landroidx/compose/runtime/SlotReader;Ljava/util/HashMap;)V

    .line 1055
    return-void
.end method

.method public final containsMark(I)Z
    .locals 5
    .param p1, "index"    # I

    .line 971
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$containsMark$iv":[I
    const/4 v1, 0x0

    .line 3976
    .local v1, "$i$f$containsMark":I
    mul-int/lit8 v2, p1, 0x5

    const/4 v3, 0x1

    add-int/2addr v2, v3

    aget v2, v0, v2

    const/high16 v4, 0x4000000

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 971
    .end local v0    # "$this$containsMark$iv":[I
    .end local v1    # "$i$f$containsMark":I
    :goto_0
    return v3
.end method

.method public final endEmpty()V
    .locals 3

    .line 1044
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 3986
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 3987
    if-nez v0, :cond_1

    .line 3988
    const/4 v2, 0x0

    .line 1044
    .local v2, "$i$a$-requirePrecondition-SlotReader$endEmpty$1":I
    nop

    .line 3988
    .end local v2    # "$i$a$-requirePrecondition-SlotReader$endEmpty$1":I
    const-string v2, "Unbalanced begin/end empty"

    invoke-static {v2}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 3990
    :cond_1
    nop

    .line 1045
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    .line 1046
    return-void
.end method

.method public final endGroup()V
    .locals 7

    .line 1136
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    if-nez v0, :cond_5

    .line 1137
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 4027
    .local v1, "$i$f$runtimeCheck":I
    nop

    .line 4028
    if-nez v0, :cond_1

    .line 4029
    const/4 v4, 0x0

    .line 1138
    .local v4, "$i$a$-runtimeCheck-SlotReader$endGroup$1":I
    nop

    .line 4029
    .end local v4    # "$i$a$-runtimeCheck-SlotReader$endGroup$1":I
    const-string v4, "endGroup() not called at the end of a group"

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 4031
    :cond_1
    nop

    .line 1140
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$runtimeCheck":I
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$parentAnchor$iv":[I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    .local v1, "address$iv":I
    const/4 v4, 0x0

    .line 4032
    .local v4, "$i$f$parentAnchor":I
    mul-int/lit8 v5, v1, 0x5

    add-int/lit8 v5, v5, 0x2

    aget v0, v0, v5

    .line 1140
    .end local v0    # "$this$parentAnchor$iv":[I
    .end local v1    # "address$iv":I
    .end local v4    # "$i$f$parentAnchor":I
    nop

    .line 1141
    .local v0, "parent":I
    iput v0, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    .line 1142
    if-gez v0, :cond_2

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    goto :goto_1

    :cond_2
    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v1, v0}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result v1

    add-int/2addr v1, v0

    :goto_1
    iput v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    .line 1143
    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->currentSlotStack:Landroidx/compose/runtime/IntStack;

    .line 1144
    .local v1, "currentSlotStack":Landroidx/compose/runtime/IntStack;
    invoke-virtual {v1}, Landroidx/compose/runtime/IntStack;->pop()I

    move-result v4

    .line 1145
    .local v4, "newCurrentSlot":I
    if-gez v4, :cond_3

    .line 1146
    iput v3, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    .line 1147
    iput v3, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    goto :goto_3

    .line 1149
    :cond_3
    iput v4, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    .line 1150
    nop

    .line 1151
    iget v3, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    sub-int/2addr v3, v2

    if-lt v0, v3, :cond_4

    iget v2, p0, Landroidx/compose/runtime/SlotReader;->slotsSize:I

    goto :goto_2

    :cond_4
    iget-object v2, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v2, "$this$dataAnchor$iv":[I
    add-int/lit8 v3, v0, 0x1

    .local v3, "address$iv":I
    const/4 v5, 0x0

    .line 4033
    .local v5, "$i$f$dataAnchor":I
    mul-int/lit8 v6, v3, 0x5

    add-int/lit8 v6, v6, 0x4

    aget v6, v2, v6

    move v2, v6

    .line 1150
    .end local v2    # "$this$dataAnchor$iv":[I
    .end local v3    # "address$iv":I
    .end local v5    # "$i$f$dataAnchor":I
    :goto_2
    iput v2, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    .line 1154
    .end local v0    # "parent":I
    .end local v1    # "currentSlotStack":Landroidx/compose/runtime/IntStack;
    .end local v4    # "newCurrentSlot":I
    :cond_5
    :goto_3
    return-void
.end method

.method public final extractKeys()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/runtime/KeyInfo;",
            ">;"
        }
    .end annotation

    .line 1161
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 1162
    .local v0, "result":Ljava/util/List;
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    if-lez v1, :cond_0

    return-object v0

    .line 1163
    :cond_0
    const/4 v1, 0x0

    .line 1164
    .local v1, "index":I
    iget v2, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    move v6, v2

    move v8, v1

    .line 1165
    .end local v1    # "index":I
    .local v6, "childIndex":I
    .local v8, "index":I
    :goto_0
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    if-ge v6, v1, :cond_3

    .line 1166
    nop

    .line 1167
    new-instance v3, Landroidx/compose/runtime/KeyInfo;

    .line 1168
    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v1, "$this$key$iv":[I
    const/4 v2, 0x0

    .line 4034
    .local v2, "$i$f$key":I
    mul-int/lit8 v4, v6, 0x5

    aget v4, v1, v4

    .line 1169
    .end local v1    # "$this$key$iv":[I
    .end local v2    # "$i$f$key":I
    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-direct {p0, v1, v6}, Landroidx/compose/runtime/SlotReader;->objectKey([II)Ljava/lang/Object;

    move-result-object v5

    .line 1170
    nop

    .line 1171
    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v1, "$this$isNode$iv":[I
    const/4 v2, 0x0

    .line 4035
    .local v2, "$i$f$isNode":I
    mul-int/lit8 v7, v6, 0x5

    const/4 v9, 0x1

    add-int/2addr v7, v9

    aget v7, v1, v7

    const/high16 v10, 0x40000000    # 2.0f

    and-int/2addr v7, v10

    if-eqz v7, :cond_1

    move v7, v9

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    .line 1171
    .end local v1    # "$this$isNode$iv":[I
    .end local v2    # "$i$f$isNode":I
    :goto_1
    if-eqz v7, :cond_2

    move v7, v9

    goto :goto_2

    :cond_2
    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v1, "$this$nodeCount$iv":[I
    const/4 v2, 0x0

    .line 4036
    .local v2, "$i$f$nodeCount":I
    mul-int/lit8 v7, v6, 0x5

    add-int/2addr v7, v9

    aget v7, v1, v7

    const v9, 0x3ffffff

    and-int/2addr v9, v7

    move v7, v9

    .line 1172
    .end local v1    # "$this$nodeCount$iv":[I
    .end local v2    # "$i$f$nodeCount":I
    :goto_2
    add-int/lit8 v1, v8, 0x1

    .line 1167
    .end local v8    # "index":I
    .local v1, "index":I
    nop

    .restart local v8    # "index":I
    invoke-direct/range {v3 .. v8}, Landroidx/compose/runtime/KeyInfo;-><init>(ILjava/lang/Object;III)V

    .line 1166
    .end local v8    # "index":I
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1175
    iget-object v2, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v2, v6}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result v2

    add-int/2addr v6, v2

    move v8, v1

    goto :goto_0

    .line 1177
    .end local v1    # "index":I
    .restart local v8    # "index":I
    :cond_3
    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3
    .param p1, "index"    # I

    .line 1000
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    add-int/2addr v0, p1

    .local v0, "slotIndex":I
    const/4 v1, 0x0

    .line 1001
    .local v1, "$i$a$-let-SlotReader$get$1":I
    iget v2, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Landroidx/compose/runtime/SlotReader;->slots:[Ljava/lang/Object;

    aget-object v2, v2, v0

    goto :goto_0

    :cond_0
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    .line 1000
    .end local v0    # "slotIndex":I
    .end local v1    # "$i$a$-let-SlotReader$get$1":I
    :goto_0
    nop

    .line 1002
    return-object v2
.end method

.method public final getClosed()Z
    .locals 1

    .line 834
    iget-boolean v0, p0, Landroidx/compose/runtime/SlotReader;->closed:Z

    return v0
.end method

.method public final getCurrentEnd()I
    .locals 1

    .line 842
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    return v0
.end method

.method public final getCurrentGroup()I
    .locals 1

    .line 838
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    return v0
.end method

.method public final getGroupAux()Ljava/lang/Object;
    .locals 2

    .line 952
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    invoke-direct {p0, v0, v1}, Landroidx/compose/runtime/SlotReader;->aux([II)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final getGroupEnd()I
    .locals 1

    .line 915
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    return v0
.end method

.method public final getGroupKey()I
    .locals 4

    .line 923
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    if-ge v0, v1, :cond_0

    .line 924
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$key$iv":[I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .local v1, "address$iv":I
    const/4 v2, 0x0

    .line 3970
    .local v2, "$i$f$key":I
    mul-int/lit8 v3, v1, 0x5

    aget v0, v0, v3

    .end local v0    # "$this$key$iv":[I
    .end local v1    # "address$iv":I
    .end local v2    # "$i$f$key":I
    goto :goto_0

    .line 925
    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getGroupNode()Ljava/lang/Object;
    .locals 2

    .line 959
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    invoke-direct {p0, v0, v1}, Landroidx/compose/runtime/SlotReader;->node([II)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getGroupObjectKey()Ljava/lang/Object;
    .locals 2

    .line 945
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    invoke-direct {p0, v0, v1}, Landroidx/compose/runtime/SlotReader;->objectKey([II)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getGroupSize()I
    .locals 2

    .line 905
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    invoke-static {v0, v1}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result v0

    return v0
.end method

.method public final getGroupSlotCount()I
    .locals 6

    .line 991
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .line 992
    .local v0, "current":I
    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v1, v0}, Landroidx/compose/runtime/SlotTableKt;->access$slotAnchor([II)I

    move-result v1

    .line 993
    .local v1, "start":I
    add-int/lit8 v2, v0, 0x1

    .line 994
    .local v2, "next":I
    iget v3, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v3, "$this$dataAnchor$iv":[I
    const/4 v4, 0x0

    .line 3984
    .local v4, "$i$f$dataAnchor":I
    mul-int/lit8 v5, v2, 0x5

    add-int/lit8 v5, v5, 0x4

    aget v3, v3, v5

    .end local v3    # "$this$dataAnchor$iv":[I
    .end local v4    # "$i$f$dataAnchor":I
    goto :goto_0

    .line 994
    :cond_0
    iget v3, p0, Landroidx/compose/runtime/SlotReader;->slotsSize:I

    :goto_0
    nop

    .line 995
    .local v3, "end":I
    sub-int v4, v3, v1

    return v4
.end method

.method public final getGroupSlotIndex()I
    .locals 3

    .line 935
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    iget v2, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    invoke-static {v1, v2}, Landroidx/compose/runtime/SlotTableKt;->access$slotAnchor([II)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final getHadNext()Z
    .locals 1

    .line 1031
    iget-boolean v0, p0, Landroidx/compose/runtime/SlotReader;->hadNext:Z

    return v0
.end method

.method public final getHasObjectKey()Z
    .locals 7

    .line 941
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$hasObjectKey$iv":[I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .local v1, "address$iv":I
    const/4 v3, 0x0

    .line 3973
    .local v3, "$i$f$hasObjectKey":I
    mul-int/lit8 v4, v1, 0x5

    const/4 v5, 0x1

    add-int/2addr v4, v5

    aget v4, v0, v4

    const/high16 v6, 0x20000000

    and-int/2addr v4, v6

    if-eqz v4, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v0, v2

    .line 941
    .end local v0    # "$this$hasObjectKey$iv":[I
    .end local v1    # "address$iv":I
    .end local v3    # "$i$f$hasObjectKey":I
    :goto_0
    if-eqz v0, :cond_1

    move v2, v5

    :cond_1
    return v2
.end method

.method public final getInEmpty()Z
    .locals 1

    .line 901
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getNodeCount()I
    .locals 5

    .line 887
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$nodeCount$iv":[I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .local v1, "address$iv":I
    const/4 v2, 0x0

    .line 3967
    .local v2, "$i$f$nodeCount":I
    mul-int/lit8 v3, v1, 0x5

    add-int/lit8 v3, v3, 0x1

    aget v3, v0, v3

    const v4, 0x3ffffff

    and-int v0, v3, v4

    .line 887
    .end local v0    # "$this$nodeCount$iv":[I
    .end local v1    # "address$iv":I
    .end local v2    # "$i$f$nodeCount":I
    return v0
.end method

.method public final getParent()I
    .locals 1

    .line 846
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    return v0
.end method

.method public final getParentNodes()I
    .locals 5

    .line 975
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$nodeCount$iv":[I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    .local v1, "address$iv":I
    const/4 v2, 0x0

    .line 3977
    .local v2, "$i$f$nodeCount":I
    mul-int/lit8 v3, v1, 0x5

    add-int/lit8 v3, v3, 0x1

    aget v3, v0, v3

    const v4, 0x3ffffff

    and-int v0, v3, v4

    .end local v0    # "$this$nodeCount$iv":[I
    .end local v1    # "address$iv":I
    .end local v2    # "$i$f$nodeCount":I
    goto :goto_0

    .line 975
    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getRemainingSlots()I
    .locals 2

    .line 979
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final getSize()I
    .locals 1

    .line 866
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    return v0
.end method

.method public final getSlot()I
    .locals 3

    .line 870
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    iget v2, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    invoke-static {v1, v2}, Landroidx/compose/runtime/SlotTableKt;->access$slotAnchor([II)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final getTable$runtime_release()Landroidx/compose/runtime/SlotTable;
    .locals 1

    .line 812
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    return-object v0
.end method

.method public final groupAux(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I

    .line 955
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-direct {p0, v0, p1}, Landroidx/compose/runtime/SlotReader;->aux([II)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final groupEnd(I)I
    .locals 1
    .param p1, "index"    # I

    .line 918
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v0, p1}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public final groupGet(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I

    .line 1005
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    invoke-virtual {p0, v0, p1}, Landroidx/compose/runtime/SlotReader;->groupGet(II)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final groupGet(II)Ljava/lang/Object;
    .locals 5
    .param p1, "group"    # I
    .param p2, "index"    # I

    .line 1009
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v0, p1}, Landroidx/compose/runtime/SlotTableKt;->access$slotAnchor([II)I

    move-result v0

    .line 1010
    .local v0, "start":I
    add-int/lit8 v1, p1, 0x1

    .line 1011
    .local v1, "next":I
    iget v2, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v2, "$this$dataAnchor$iv":[I
    const/4 v3, 0x0

    .line 3985
    .local v3, "$i$f$dataAnchor":I
    mul-int/lit8 v4, v1, 0x5

    add-int/lit8 v4, v4, 0x4

    aget v2, v2, v4

    .end local v2    # "$this$dataAnchor$iv":[I
    .end local v3    # "$i$f$dataAnchor":I
    goto :goto_0

    .line 1011
    :cond_0
    iget v2, p0, Landroidx/compose/runtime/SlotReader;->slotsSize:I

    :goto_0
    nop

    .line 1012
    .local v2, "end":I
    add-int v3, v0, p2

    .line 1013
    .local v3, "address":I
    if-ge v3, v2, :cond_1

    iget-object v4, p0, Landroidx/compose/runtime/SlotReader;->slots:[Ljava/lang/Object;

    aget-object v4, v4, v3

    goto :goto_1

    :cond_1
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    :goto_1
    return-object v4
.end method

.method public final groupKey(I)I
    .locals 3
    .param p1, "index"    # I

    .line 928
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$key$iv":[I
    const/4 v1, 0x0

    .line 3971
    .local v1, "$i$f$key":I
    mul-int/lit8 v2, p1, 0x5

    aget v0, v0, v2

    .line 928
    .end local v0    # "$this$key$iv":[I
    .end local v1    # "$i$f$key":I
    return v0
.end method

.method public final groupKey(Landroidx/compose/runtime/Anchor;)I
    .locals 4
    .param p1, "anchor"    # Landroidx/compose/runtime/Anchor;

    .line 962
    invoke-virtual {p1}, Landroidx/compose/runtime/Anchor;->getValid()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$key$iv":[I
    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v1, p1}, Landroidx/compose/runtime/SlotTable;->anchorIndex(Landroidx/compose/runtime/Anchor;)I

    move-result v1

    .local v1, "address$iv":I
    const/4 v2, 0x0

    .line 3974
    .local v2, "$i$f$key":I
    mul-int/lit8 v3, v1, 0x5

    aget v0, v0, v3

    .end local v0    # "$this$key$iv":[I
    .end local v1    # "address$iv":I
    .end local v2    # "$i$f$key":I
    goto :goto_0

    .line 962
    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final groupObjectKey(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I

    .line 948
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-direct {p0, v0, p1}, Landroidx/compose/runtime/SlotReader;->objectKey([II)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final groupSize(I)I
    .locals 1
    .param p1, "index"    # I

    .line 911
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v0, p1}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result v0

    return v0
.end method

.method public final hasMark(I)Z
    .locals 5
    .param p1, "index"    # I

    .line 965
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$hasMark$iv":[I
    const/4 v1, 0x0

    .line 3975
    .local v1, "$i$f$hasMark":I
    mul-int/lit8 v2, p1, 0x5

    const/4 v3, 0x1

    add-int/2addr v2, v3

    aget v2, v0, v2

    const/high16 v4, 0x8000000

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 965
    .end local v0    # "$this$hasMark$iv":[I
    .end local v1    # "$i$f$hasMark":I
    :goto_0
    return v3
.end method

.method public final hasObjectKey(I)Z
    .locals 5
    .param p1, "index"    # I

    .line 938
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$hasObjectKey$iv":[I
    const/4 v1, 0x0

    .line 3972
    .local v1, "$i$f$hasObjectKey":I
    mul-int/lit8 v2, p1, 0x5

    const/4 v3, 0x1

    add-int/2addr v2, v3

    aget v2, v0, v2

    const/high16 v4, 0x20000000

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 938
    .end local v0    # "$this$hasObjectKey$iv":[I
    .end local v1    # "$i$f$hasObjectKey":I
    :goto_0
    return v3
.end method

.method public final isGroupEnd()Z
    .locals 2

    .line 897
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotReader;->getInEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final isNode()Z
    .locals 6

    .line 877
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$isNode$iv":[I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .local v1, "address$iv":I
    const/4 v2, 0x0

    .line 3965
    .local v2, "$i$f$isNode":I
    mul-int/lit8 v3, v1, 0x5

    const/4 v4, 0x1

    add-int/2addr v3, v4

    aget v3, v0, v3

    const/high16 v5, 0x40000000    # 2.0f

    and-int/2addr v3, v5

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 877
    .end local v0    # "$this$isNode$iv":[I
    .end local v1    # "address$iv":I
    .end local v2    # "$i$f$isNode":I
    :goto_0
    return v4
.end method

.method public final isNode(I)Z
    .locals 5
    .param p1, "index"    # I

    .line 880
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$isNode$iv":[I
    const/4 v1, 0x0

    .line 3966
    .local v1, "$i$f$isNode":I
    mul-int/lit8 v2, p1, 0x5

    const/4 v3, 0x1

    add-int/2addr v2, v3

    aget v2, v0, v2

    const/high16 v4, 0x40000000    # 2.0f

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 880
    .end local v0    # "$this$isNode$iv":[I
    .end local v1    # "$i$f$isNode":I
    :goto_0
    return v3
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1022
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    if-gtz v0, :cond_1

    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 1026
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/runtime/SlotReader;->hadNext:Z

    .line 1027
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->slots:[Ljava/lang/Object;

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    aget-object v0, v0, v1

    return-object v0

    .line 1023
    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/runtime/SlotReader;->hadNext:Z

    .line 1024
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final node(I)Ljava/lang/Object;
    .locals 5
    .param p1, "index"    # I

    .line 893
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$isNode$iv":[I
    const/4 v1, 0x0

    .line 3969
    .local v1, "$i$f$isNode":I
    mul-int/lit8 v2, p1, 0x5

    const/4 v3, 0x1

    add-int/2addr v2, v3

    aget v2, v0, v2

    const/high16 v4, 0x40000000    # 2.0f

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 893
    .end local v0    # "$this$isNode$iv":[I
    .end local v1    # "$i$f$isNode":I
    :goto_0
    if-eqz v3, :cond_1

    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-direct {p0, v0, p1}, Landroidx/compose/runtime/SlotReader;->node([II)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final nodeCount(I)I
    .locals 4
    .param p1, "index"    # I

    .line 890
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$nodeCount$iv":[I
    const/4 v1, 0x0

    .line 3968
    .local v1, "$i$f$nodeCount":I
    mul-int/lit8 v2, p1, 0x5

    add-int/lit8 v2, v2, 0x1

    aget v2, v0, v2

    const v3, 0x3ffffff

    and-int v0, v2, v3

    .line 890
    .end local v0    # "$this$nodeCount$iv":[I
    .end local v1    # "$i$f$nodeCount":I
    return v0
.end method

.method public final parent(I)I
    .locals 3
    .param p1, "index"    # I

    .line 873
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$parentAnchor$iv":[I
    const/4 v1, 0x0

    .line 3964
    .local v1, "$i$f$parentAnchor":I
    mul-int/lit8 v2, p1, 0x5

    add-int/lit8 v2, v2, 0x2

    aget v0, v0, v2

    .line 873
    .end local v0    # "$this$parentAnchor$iv":[I
    .end local v1    # "$i$f$parentAnchor":I
    return v0
.end method

.method public final parentOf(I)I
    .locals 5
    .param p1, "index"    # I

    .line 984
    if-ltz p1, :cond_0

    iget v0, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .local v0, "value$iv":Z
    :goto_0
    const/4 v1, 0x0

    .line 3978
    .local v1, "$i$f$requirePrecondition":I
    nop

    .line 3979
    if-nez v0, :cond_1

    .line 3980
    const/4 v2, 0x0

    .line 984
    .local v2, "$i$a$-requirePrecondition-SlotReader$parentOf$1":I
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid group index "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 3980
    .end local v2    # "$i$a$-requirePrecondition-SlotReader$parentOf$1":I
    invoke-static {v2}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 3982
    :cond_1
    nop

    .line 985
    .end local v0    # "value$iv":Z
    .end local v1    # "$i$f$requirePrecondition":I
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$parentAnchor$iv":[I
    const/4 v1, 0x0

    .line 3983
    .local v1, "$i$f$parentAnchor":I
    mul-int/lit8 v2, p1, 0x5

    add-int/lit8 v2, v2, 0x2

    aget v0, v0, v2

    .line 985
    .end local v0    # "$this$parentAnchor$iv":[I
    .end local v1    # "$i$f$parentAnchor":I
    return v0
.end method

.method public final reposition(I)V
    .locals 4
    .param p1, "index"    # I

    .line 1110
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    .local v0, "value$iv":Z
    :goto_0
    const/4 v2, 0x0

    .line 4016
    .local v2, "$i$f$runtimeCheck":I
    nop

    .line 4017
    if-nez v0, :cond_1

    .line 4018
    const/4 v3, 0x0

    .line 1110
    .local v3, "$i$a$-runtimeCheck-SlotReader$reposition$1":I
    nop

    .line 4018
    .end local v3    # "$i$a$-runtimeCheck-SlotReader$reposition$1":I
    const-string v3, "Cannot reposition while in an empty region"

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 4020
    :cond_1
    nop

    .line 1111
    .end local v0    # "value$iv":Z
    .end local v2    # "$i$f$runtimeCheck":I
    iput p1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .line 1112
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    if-ge p1, v0, :cond_2

    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$parentAnchor$iv":[I
    const/4 v2, 0x0

    .line 4021
    .local v2, "$i$f$parentAnchor":I
    mul-int/lit8 v3, p1, 0x5

    add-int/lit8 v3, v3, 0x2

    aget v0, v0, v3

    .end local v0    # "$this$parentAnchor$iv":[I
    .end local v2    # "$i$f$parentAnchor":I
    goto :goto_1

    .line 1112
    :cond_2
    const/4 v0, -0x1

    :goto_1
    nop

    .line 1113
    .local v0, "parent":I
    iput v0, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    .line 1114
    if-gez v0, :cond_3

    iget v2, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    iput v2, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    goto :goto_2

    .line 1115
    :cond_3
    iget-object v2, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v2, v0}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result v2

    add-int/2addr v2, v0

    iput v2, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    .line 1116
    :goto_2
    iput v1, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    .line 1117
    iput v1, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    .line 1118
    return-void
.end method

.method public final restoreParent(I)V
    .locals 8
    .param p1, "index"    # I

    .line 1122
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v0, p1}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result v0

    add-int/2addr v0, p1

    .line 1123
    .local v0, "newCurrentEnd":I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .line 1125
    .local v1, "current":I
    const/4 v2, 0x0

    if-lt v1, p1, :cond_0

    if-gt v1, v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v2

    .local v3, "value$iv":Z
    :goto_0
    const/4 v4, 0x0

    .line 4022
    .local v4, "$i$f$runtimeCheck":I
    nop

    .line 4023
    if-nez v3, :cond_1

    .line 4024
    const/4 v5, 0x0

    .line 1126
    .local v5, "$i$a$-runtimeCheck-SlotReader$restoreParent$1":I
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Index "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " is not a parent of "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 4024
    .end local v5    # "$i$a$-runtimeCheck-SlotReader$restoreParent$1":I
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 4026
    :cond_1
    nop

    .line 1128
    .end local v3    # "value$iv":Z
    .end local v4    # "$i$f$runtimeCheck":I
    iput p1, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    .line 1129
    iput v0, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    .line 1130
    iput v2, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    .line 1131
    iput v2, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    .line 1132
    return-void
.end method

.method public final skipGroup()I
    .locals 7

    .line 1094
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    .local v0, "value$iv":Z
    :goto_0
    const/4 v3, 0x0

    .line 4004
    .local v3, "$i$f$runtimeCheck":I
    nop

    .line 4005
    if-nez v0, :cond_1

    .line 4006
    const/4 v4, 0x0

    .line 1094
    .local v4, "$i$a$-runtimeCheck-SlotReader$skipGroup$1":I
    nop

    .line 4006
    .end local v4    # "$i$a$-runtimeCheck-SlotReader$skipGroup$1":I
    const-string v4, "Cannot skip while in an empty region"

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 4008
    :cond_1
    nop

    .line 1095
    .end local v0    # "value$iv":Z
    .end local v3    # "$i$f$runtimeCheck":I
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$isNode$iv":[I
    iget v3, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .local v3, "address$iv":I
    const/4 v4, 0x0

    .line 4009
    .local v4, "$i$f$isNode":I
    mul-int/lit8 v5, v3, 0x5

    add-int/2addr v5, v2

    aget v5, v0, v5

    const/high16 v6, 0x40000000    # 2.0f

    and-int/2addr v5, v6

    if-eqz v5, :cond_2

    move v1, v2

    .line 1095
    .end local v0    # "$this$isNode$iv":[I
    .end local v3    # "address$iv":I
    .end local v4    # "$i$f$isNode":I
    :cond_2
    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$nodeCount$iv":[I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .local v1, "address$iv":I
    const/4 v3, 0x0

    .line 4010
    .local v3, "$i$f$nodeCount":I
    mul-int/lit8 v4, v1, 0x5

    add-int/2addr v4, v2

    aget v2, v0, v4

    const v4, 0x3ffffff

    and-int/2addr v2, v4

    .line 1095
    .end local v0    # "$this$nodeCount$iv":[I
    .end local v1    # "address$iv":I
    .end local v3    # "$i$f$nodeCount":I
    :goto_1
    nop

    .line 1096
    .local v2, "count":I
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    iget-object v1, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    iget v3, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    invoke-static {v1, v3}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .line 1097
    return v2
.end method

.method public final skipToGroupEnd()V
    .locals 4

    .line 1102
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    .local v0, "value$iv":Z
    :goto_0
    const/4 v2, 0x0

    .line 4011
    .local v2, "$i$f$runtimeCheck":I
    nop

    .line 4012
    if-nez v0, :cond_1

    .line 4013
    const/4 v3, 0x0

    .line 1102
    .local v3, "$i$a$-runtimeCheck-SlotReader$skipToGroupEnd$1":I
    nop

    .line 4013
    .end local v3    # "$i$a$-runtimeCheck-SlotReader$skipToGroupEnd$1":I
    const-string v3, "Cannot skip the enclosing group while in an empty region"

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->composeImmediateRuntimeError(Ljava/lang/String;)V

    .line 4015
    :cond_1
    nop

    .line 1103
    .end local v0    # "value$iv":Z
    .end local v2    # "$i$f$runtimeCheck":I
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    iput v0, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .line 1104
    iput v1, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    .line 1105
    iput v1, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    .line 1106
    return-void
.end method

.method public final startGroup()V
    .locals 9

    .line 1059
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    if-gtz v0, :cond_5

    .line 1060
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    .line 1061
    .local v0, "parent":I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .line 1062
    .local v1, "currentGroup":I
    iget-object v2, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v2, "$this$parentAnchor$iv":[I
    const/4 v3, 0x0

    .line 3991
    .local v3, "$i$f$parentAnchor":I
    mul-int/lit8 v4, v1, 0x5

    add-int/lit8 v4, v4, 0x2

    aget v2, v2, v4

    .line 1062
    .end local v2    # "$this$parentAnchor$iv":[I
    .end local v3    # "$i$f$parentAnchor":I
    const/4 v3, 0x1

    if-ne v2, v0, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .local v2, "value$iv":Z
    :goto_0
    const/4 v4, 0x0

    .line 3992
    .local v4, "$i$f$requirePrecondition":I
    nop

    .line 3993
    if-nez v2, :cond_1

    .line 3994
    const/4 v5, 0x0

    .line 1063
    .local v5, "$i$a$-requirePrecondition-SlotReader$startGroup$1":I
    nop

    .line 3994
    .end local v5    # "$i$a$-requirePrecondition-SlotReader$startGroup$1":I
    const-string v5, "Invalid slot table detected"

    invoke-static {v5}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 3996
    :cond_1
    nop

    .line 1065
    .end local v2    # "value$iv":Z
    .end local v4    # "$i$f$requirePrecondition":I
    iget-object v2, p0, Landroidx/compose/runtime/SlotReader;->sourceInformationMap:Ljava/util/HashMap;

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0}, Landroidx/compose/runtime/SlotReader;->anchor(I)Landroidx/compose/runtime/Anchor;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/GroupSourceInformation;

    if-eqz v2, :cond_2

    iget-object v4, p0, Landroidx/compose/runtime/SlotReader;->table:Landroidx/compose/runtime/SlotTable;

    invoke-virtual {v2, v4, v1}, Landroidx/compose/runtime/GroupSourceInformation;->reportGroup(Landroidx/compose/runtime/SlotTable;I)V

    .line 1066
    :cond_2
    iget-object v2, p0, Landroidx/compose/runtime/SlotReader;->currentSlotStack:Landroidx/compose/runtime/IntStack;

    .line 1067
    .local v2, "currentSlotStack":Landroidx/compose/runtime/IntStack;
    iget v4, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    .line 1068
    .local v4, "currentSlot":I
    iget v5, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    .line 1069
    .local v5, "currentEndSlot":I
    if-nez v4, :cond_3

    if-nez v5, :cond_3

    .line 1070
    const/4 v6, -0x1

    invoke-virtual {v2, v6}, Landroidx/compose/runtime/IntStack;->push(I)V

    goto :goto_1

    .line 1072
    :cond_3
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/IntStack;->push(I)V

    .line 1074
    :goto_1
    iput v1, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    .line 1075
    iget-object v6, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v6, v1}, Landroidx/compose/runtime/SlotTableKt;->access$groupSize([II)I

    move-result v6

    add-int/2addr v6, v1

    iput v6, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    .line 1076
    add-int/lit8 v6, v1, 0x1

    iput v6, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .line 1077
    iget-object v6, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    invoke-static {v6, v1}, Landroidx/compose/runtime/SlotTableKt;->access$slotAnchor([II)I

    move-result v6

    iput v6, p0, Landroidx/compose/runtime/SlotReader;->currentSlot:I

    .line 1078
    nop

    .line 1079
    iget v6, p0, Landroidx/compose/runtime/SlotReader;->groupsSize:I

    sub-int/2addr v6, v3

    if-lt v1, v6, :cond_4

    iget v3, p0, Landroidx/compose/runtime/SlotReader;->slotsSize:I

    goto :goto_2

    .line 1080
    :cond_4
    iget-object v3, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v3, "$this$dataAnchor$iv":[I
    add-int/lit8 v6, v1, 0x1

    .local v6, "address$iv":I
    const/4 v7, 0x0

    .line 3997
    .local v7, "$i$f$dataAnchor":I
    mul-int/lit8 v8, v6, 0x5

    add-int/lit8 v8, v8, 0x4

    aget v8, v3, v8

    move v3, v8

    .line 1078
    .end local v3    # "$this$dataAnchor$iv":[I
    .end local v6    # "address$iv":I
    .end local v7    # "$i$f$dataAnchor":I
    :goto_2
    iput v3, p0, Landroidx/compose/runtime/SlotReader;->currentSlotEnd:I

    .line 1082
    .end local v0    # "parent":I
    .end local v1    # "currentGroup":I
    .end local v2    # "currentSlotStack":Landroidx/compose/runtime/IntStack;
    .end local v4    # "currentSlot":I
    .end local v5    # "currentEndSlot":I
    :cond_5
    return-void
.end method

.method public final startNode()V
    .locals 6

    .line 1086
    iget v0, p0, Landroidx/compose/runtime/SlotReader;->emptyCount:I

    if-gtz v0, :cond_2

    .line 1087
    iget-object v0, p0, Landroidx/compose/runtime/SlotReader;->groups:[I

    .local v0, "$this$isNode$iv":[I
    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    .local v1, "address$iv":I
    const/4 v2, 0x0

    .line 3998
    .local v2, "$i$f$isNode":I
    mul-int/lit8 v3, v1, 0x5

    const/4 v4, 0x1

    add-int/2addr v3, v4

    aget v3, v0, v3

    const/high16 v5, 0x40000000    # 2.0f

    and-int/2addr v3, v5

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1087
    .end local v0    # "$this$isNode$iv":[I
    .end local v1    # "address$iv":I
    .end local v2    # "$i$f$isNode":I
    :goto_0
    nop

    .local v4, "value$iv":Z
    const/4 v0, 0x0

    .line 3999
    .local v0, "$i$f$requirePrecondition":I
    nop

    .line 4000
    if-nez v4, :cond_1

    .line 4001
    const/4 v1, 0x0

    .line 1087
    .local v1, "$i$a$-requirePrecondition-SlotReader$startNode$1":I
    nop

    .line 4001
    .end local v1    # "$i$a$-requirePrecondition-SlotReader$startNode$1":I
    const-string v1, "Expected a node group"

    invoke-static {v1}, Landroidx/compose/runtime/PreconditionsKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 4003
    :cond_1
    nop

    .line 1088
    .end local v0    # "$i$f$requirePrecondition":I
    .end local v4    # "value$iv":Z
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotReader;->startGroup()V

    .line 1090
    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1181
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SlotReader(current="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentGroup:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/runtime/SlotReader;->getGroupKey()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->parent:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/compose/runtime/SlotReader;->currentEnd:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
