.class public final Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
.super Ljava/lang/Object;
.source "FlowLayoutOverflow.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/layout/FlowLayoutOverflowState$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,869:1\n219#2:870\n219#2:871\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n*L\n794#1:870\n802#1:871\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u001f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010*\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008+J\u000e\u0010,\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\u0008-J\u000e\u0010.\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\u0008/J\'\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\'\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\u00086J-\u00107\u001a\u0004\u0018\u00010\r2\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0000\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0002\u00088J\u0013\u00109\u001a\u00020\u00102\u0008\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\u0005H\u00d6\u0001J6\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010@\u001a\u00020AH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008B\u0010CJ\\\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A28\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(D\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000fH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008E\u0010FJ6\u0010<\u001a\u00020=2\u0008\u0010\u001f\u001a\u0004\u0018\u00010G2\u0008\u0010\u0008\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\u00102\u0006\u0010@\u001a\u00020AH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008B\u0010IJ\t\u0010J\u001a\u00020%H\u00d6\u0001R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\n\u0000RB\u0010\u000e\u001a6\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017\"\u0004\u0008\u001c\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0017R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u0017R\u0014\u0010$\u001a\u00020%X\u0080D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006K"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
        "",
        "type",
        "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;",
        "minLinesToShowCollapse",
        "",
        "minCrossAxisSizeToShowCollapse",
        "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V",
        "collapseMeasurable",
        "Landroidx/compose/ui/layout/Measurable;",
        "collapsePlaceable",
        "Landroidx/compose/ui/layout/Placeable;",
        "collapseSize",
        "Landroidx/collection/IntIntPair;",
        "getOverflowMeasurable",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "isExpandable",
        "noOfItemsShown",
        "itemCount",
        "getItemCount$foundation_layout_release",
        "()I",
        "setItemCount$foundation_layout_release",
        "(I)V",
        "itemShown",
        "getItemShown$foundation_layout_release",
        "setItemShown$foundation_layout_release",
        "getMinCrossAxisSizeToShowCollapse$foundation_layout_release",
        "getMinLinesToShowCollapse$foundation_layout_release",
        "seeMoreMeasurable",
        "seeMorePlaceable",
        "seeMoreSize",
        "shownItemCount",
        "getShownItemCount$foundation_layout_release",
        "shownItemLazyErrorMessage",
        "",
        "getShownItemLazyErrorMessage$foundation_layout_release",
        "()Ljava/lang/String;",
        "getType$foundation_layout_release",
        "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;",
        "component1",
        "component1$foundation_layout_release",
        "component2",
        "component2$foundation_layout_release",
        "component3",
        "component3$foundation_layout_release",
        "copy",
        "ellipsisInfo",
        "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;",
        "hasNext",
        "lineIndex",
        "totalCrossAxisSize",
        "ellipsisInfo$foundation_layout_release",
        "ellipsisSize",
        "ellipsisSize-F35zm-w$foundation_layout_release",
        "equals",
        "other",
        "hashCode",
        "setOverflowMeasurables",
        "",
        "measurePolicy",
        "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "setOverflowMeasurables--hBUhpc$foundation_layout_release",
        "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V",
        "numberOfItemsShown",
        "setOverflowMeasurables-VKLhPVY$foundation_layout_release",
        "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function2;)V",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "isHorizontal",
        "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMeasurable;ZJ)V",
        "toString",
        "foundation-layout_release"
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
.field private collapseMeasurable:Landroidx/compose/ui/layout/Measurable;

.field private collapsePlaceable:Landroidx/compose/ui/layout/Placeable;

.field private collapseSize:Landroidx/collection/IntIntPair;

.field private getOverflowMeasurable:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;"
        }
    .end annotation
.end field

.field private itemCount:I

.field private itemShown:I

.field private final minCrossAxisSizeToShowCollapse:I

.field private final minLinesToShowCollapse:I

.field private seeMoreMeasurable:Landroidx/compose/ui/layout/Measurable;

.field private seeMorePlaceable:Landroidx/compose/ui/layout/Placeable;

.field private seeMoreSize:Landroidx/collection/IntIntPair;

.field private final shownItemLazyErrorMessage:Ljava/lang/String;

.field private final type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V
    .locals 1
    .param p1, "type"    # Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;
    .param p2, "minLinesToShowCollapse"    # I
    .param p3, "minCrossAxisSizeToShowCollapse"    # I

    .line 676
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 679
    iput-object p1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 680
    iput p2, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    .line 681
    iput p3, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    .line 692
    const-string v0, "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase."

    iput-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->shownItemLazyErrorMessage:Ljava/lang/String;

    .line 699
    const/4 v0, -0x1

    iput v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->itemShown:I

    .line 678
    return-void
.end method

.method public static final synthetic access$setCollapsePlaceable$p(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/ui/layout/Placeable;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .param p1, "<set-?>"    # Landroidx/compose/ui/layout/Placeable;

    .line 676
    iput-object p1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapsePlaceable:Landroidx/compose/ui/layout/Placeable;

    return-void
.end method

.method public static final synthetic access$setCollapseSize$p(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/collection/IntIntPair;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .param p1, "<set-?>"    # Landroidx/collection/IntIntPair;

    .line 676
    iput-object p1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapseSize:Landroidx/collection/IntIntPair;

    return-void
.end method

.method public static final synthetic access$setSeeMorePlaceable$p(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/ui/layout/Placeable;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .param p1, "<set-?>"    # Landroidx/compose/ui/layout/Placeable;

    .line 676
    iput-object p1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMorePlaceable:Landroidx/compose/ui/layout/Placeable;

    return-void
.end method

.method public static final synthetic access$setSeeMoreSize$p(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/collection/IntIntPair;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .param p1, "<set-?>"    # Landroidx/collection/IntIntPair;

    .line 676
    iput-object p1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMoreSize:Landroidx/collection/IntIntPair;

    return-void
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IIILjava/lang/Object;)Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->copy(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    return-object v0
.end method

.method public final component2$foundation_layout_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    return v0
.end method

.method public final component3$foundation_layout_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    return v0
.end method

.method public final copy(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)Landroidx/compose/foundation/layout/FlowLayoutOverflowState;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;-><init>(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V

    return-object v0
.end method

.method public final ellipsisInfo$foundation_layout_release(ZII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;
    .locals 10
    .param p1, "hasNext"    # Z
    .param p2, "lineIndex"    # I
    .param p3, "totalCrossAxisSize"    # I

    .line 746
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    sget-object v1, Landroidx/compose/foundation/layout/FlowLayoutOverflowState$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 777
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 751
    :pswitch_0
    const/4 v0, 0x0

    .line 752
    .local v0, "measurable":Landroidx/compose/ui/layout/Measurable;
    const/4 v2, 0x0

    .line 753
    .local v2, "placeable":Landroidx/compose/ui/layout/Placeable;
    const/4 v3, 0x0

    .line 754
    .local v3, "ellipsisSize":Landroidx/collection/IntIntPair;
    const/4 v4, 0x1

    if-eqz p1, :cond_3

    .line 756
    iget-object v5, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getOverflowMeasurable:Lkotlin/jvm/functions/Function2;

    if-eqz v5, :cond_0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getShownItemCount$foundation_layout_release()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    if-nez v4, :cond_1

    .line 757
    :cond_0
    iget-object v4, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMoreMeasurable:Landroidx/compose/ui/layout/Measurable;

    .line 755
    :cond_1
    nop

    .line 758
    .end local v0    # "measurable":Landroidx/compose/ui/layout/Measurable;
    .local v4, "measurable":Landroidx/compose/ui/layout/Measurable;
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMoreSize:Landroidx/collection/IntIntPair;

    .line 759
    .end local v3    # "ellipsisSize":Landroidx/collection/IntIntPair;
    .local v0, "ellipsisSize":Landroidx/collection/IntIntPair;
    iget-object v3, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getOverflowMeasurable:Lkotlin/jvm/functions/Function2;

    if-nez v3, :cond_2

    .line 760
    iget-object v2, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMorePlaceable:Landroidx/compose/ui/layout/Placeable;

    move-object v3, v4

    move-object v4, v2

    goto :goto_0

    .line 759
    :cond_2
    move-object v3, v4

    move-object v4, v2

    goto :goto_0

    .line 763
    .end local v4    # "measurable":Landroidx/compose/ui/layout/Measurable;
    .local v0, "measurable":Landroidx/compose/ui/layout/Measurable;
    .restart local v3    # "ellipsisSize":Landroidx/collection/IntIntPair;
    :cond_3
    nop

    .line 764
    iget v5, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    sub-int/2addr v5, v4

    if-lt p2, v5, :cond_6

    .line 765
    iget v4, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    if-lt p3, v4, :cond_6

    .line 768
    iget-object v4, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getOverflowMeasurable:Lkotlin/jvm/functions/Function2;

    if-eqz v4, :cond_4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getShownItemCount$foundation_layout_release()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    if-nez v4, :cond_5

    .line 769
    :cond_4
    iget-object v4, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapseMeasurable:Landroidx/compose/ui/layout/Measurable;

    .line 767
    :cond_5
    move-object v0, v4

    .line 771
    :cond_6
    iget-object v3, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapseSize:Landroidx/collection/IntIntPair;

    .line 772
    iget-object v4, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getOverflowMeasurable:Lkotlin/jvm/functions/Function2;

    if-nez v4, :cond_7

    .line 773
    iget-object v2, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapsePlaceable:Landroidx/compose/ui/layout/Placeable;

    move-object v4, v3

    move-object v3, v0

    move-object v0, v4

    move-object v4, v2

    goto :goto_0

    .line 772
    :cond_7
    move-object v4, v3

    move-object v3, v0

    move-object v0, v4

    move-object v4, v2

    .line 776
    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v0, "ellipsisSize":Landroidx/collection/IntIntPair;
    .local v3, "measurable":Landroidx/compose/ui/layout/Measurable;
    .local v4, "placeable":Landroidx/compose/ui/layout/Placeable;
    :goto_0
    if-nez v3, :cond_8

    return-object v1

    .line 777
    :cond_8
    new-instance v2, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/collection/IntIntPair;->unbox-impl()J

    move-result-wide v5

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;-><init>(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Placeable;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    .end local v0    # "ellipsisSize":Landroidx/collection/IntIntPair;
    .end local v3    # "measurable":Landroidx/compose/ui/layout/Measurable;
    .end local v4    # "placeable":Landroidx/compose/ui/layout/Placeable;
    goto :goto_1

    .line 748
    :pswitch_1
    goto :goto_1

    .line 747
    :pswitch_2
    nop

    .line 746
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ellipsisSize-F35zm-w$foundation_layout_release(ZII)Landroidx/collection/IntIntPair;
    .locals 3
    .param p1, "hasNext"    # Z
    .param p2, "lineIndex"    # I
    .param p3, "totalCrossAxisSize"    # I

    .line 717
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    sget-object v1, Landroidx/compose/foundation/layout/FlowLayoutOverflowState$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 735
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 727
    :pswitch_0
    if-eqz p1, :cond_0

    .line 728
    iget-object v1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMoreSize:Landroidx/collection/IntIntPair;

    goto :goto_0

    .line 730
    :cond_0
    add-int/lit8 v0, p2, 0x1

    iget v2, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    if-lt v0, v2, :cond_1

    .line 731
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    if-lt p3, v0, :cond_1

    .line 733
    iget-object v1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapseSize:Landroidx/collection/IntIntPair;

    goto :goto_0

    .line 735
    :cond_1
    goto :goto_0

    .line 721
    :pswitch_1
    if-eqz p1, :cond_2

    .line 722
    iget-object v1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMoreSize:Landroidx/collection/IntIntPair;

    goto :goto_0

    .line 724
    :cond_2
    goto :goto_0

    .line 719
    :pswitch_2
    goto :goto_0

    .line 718
    :pswitch_3
    nop

    .line 717
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    iget-object v3, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    iget-object v4, v1, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    iget v4, v1, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget v3, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    iget v1, v1, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    if-eq v3, v1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getItemCount$foundation_layout_release()I
    .locals 1

    .line 700
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->itemCount:I

    return v0
.end method

.method public final getItemShown$foundation_layout_release()I
    .locals 1

    .line 699
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->itemShown:I

    return v0
.end method

.method public final getMinCrossAxisSizeToShowCollapse$foundation_layout_release()I
    .locals 1

    .line 681
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    return v0
.end method

.method public final getMinLinesToShowCollapse$foundation_layout_release()I
    .locals 1

    .line 680
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    return v0
.end method

.method public final getShownItemCount$foundation_layout_release()I
    .locals 2

    .line 685
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->itemShown:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 688
    iget v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->itemShown:I

    return v0

    .line 686
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->shownItemLazyErrorMessage:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getShownItemLazyErrorMessage$foundation_layout_release()Ljava/lang/String;
    .locals 1

    .line 691
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->shownItemLazyErrorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getType$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;
    .locals 1

    .line 679
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public final setItemCount$foundation_layout_release(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 700
    iput p1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->itemCount:I

    return-void
.end method

.method public final setItemShown$foundation_layout_release(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 699
    iput p1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->itemShown:I

    return-void
.end method

.method public final setOverflowMeasurables--hBUhpc$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V
    .locals 10
    .param p1, "measurePolicy"    # Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;
    .param p2, "seeMoreMeasurable"    # Landroidx/compose/ui/layout/Measurable;
    .param p3, "collapseMeasurable"    # Landroidx/compose/ui/layout/Measurable;
    .param p4, "constraints"    # J

    .line 816
    invoke-interface {p1}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    move-result v0

    .line 818
    .local v0, "isHorizontal":Z
    if-eqz v0, :cond_0

    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Vertical:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 817
    :goto_0
    nop

    .line 820
    .local v1, "orientation":Landroidx/compose/foundation/layout/LayoutOrientation;
    invoke-static {p4, p5, v1}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    move-result-wide v2

    .line 821
    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->copy-yUG9Ft0$default(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    .line 819
    nop

    .line 822
    .local v2, "orientationIndependentConstraints":J
    invoke-static {v2, v3, v1}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->toBoxConstraints-OenEA2s(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    move-result-wide v4

    .line 823
    .local v4, "finalConstraints":J
    if-eqz p2, :cond_1

    move-object v6, p2

    .local v6, "item":Landroidx/compose/ui/layout/Measurable;
    const/4 v7, 0x0

    .line 824
    .local v7, "$i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$3":I
    new-instance v8, Landroidx/compose/foundation/layout/FlowLayoutOverflowState$setOverflowMeasurables$3$1;

    invoke-direct {v8, p0, p1}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState$setOverflowMeasurables$3$1;-><init>(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;)V

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, p1, v4, v5, v8}, Landroidx/compose/foundation/layout/FlowLayoutKt;->measureAndCache-rqJ1uqs(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J

    .line 836
    iput-object v6, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMoreMeasurable:Landroidx/compose/ui/layout/Measurable;

    .line 837
    nop

    .line 823
    .end local v6    # "item":Landroidx/compose/ui/layout/Measurable;
    .end local v7    # "$i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$3":I
    nop

    .line 838
    :cond_1
    if-eqz p3, :cond_2

    move-object v6, p3

    .restart local v6    # "item":Landroidx/compose/ui/layout/Measurable;
    const/4 v7, 0x0

    .line 839
    .local v7, "$i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$4":I
    new-instance v8, Landroidx/compose/foundation/layout/FlowLayoutOverflowState$setOverflowMeasurables$4$1;

    invoke-direct {v8, p0, p1}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState$setOverflowMeasurables$4$1;-><init>(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;)V

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, p1, v4, v5, v8}, Landroidx/compose/foundation/layout/FlowLayoutKt;->measureAndCache-rqJ1uqs(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J

    .line 851
    iput-object v6, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapseMeasurable:Landroidx/compose/ui/layout/Measurable;

    .line 852
    nop

    .line 838
    .end local v6    # "item":Landroidx/compose/ui/layout/Measurable;
    .end local v7    # "$i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$4":I
    nop

    .line 853
    :cond_2
    return-void
.end method

.method public final setOverflowMeasurables--hBUhpc$foundation_layout_release(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMeasurable;ZJ)V
    .locals 10
    .param p1, "seeMoreMeasurable"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .param p2, "collapseMeasurable"    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .param p3, "isHorizontal"    # Z
    .param p4, "constraints"    # J

    .line 789
    if-eqz p3, :cond_0

    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Vertical:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 788
    :goto_0
    nop

    .line 791
    .local v0, "orientation":Landroidx/compose/foundation/layout/LayoutOrientation;
    invoke-static {p4, p5, v0}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    move-result-wide v1

    .line 790
    nop

    .line 792
    .local v1, "orientationIndependentConstraints":J
    const/4 v3, 0x0

    if-eqz p1, :cond_2

    move-object v4, p1

    .local v4, "item":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v5, 0x0

    .line 794
    .local v5, "$i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$1":I
    const/4 v6, 0x0

    .line 870
    .local v6, "$i$f$getCrossAxisMax-impl":I
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v6

    .line 794
    .end local v6    # "$i$f$getCrossAxisMax-impl":I
    invoke-static {v4, p3, v6}, Landroidx/compose/foundation/layout/FlowLayoutKt;->mainAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I

    move-result v6

    .line 793
    nop

    .line 795
    .local v6, "mainAxisSize":I
    invoke-static {v4, p3, v6}, Landroidx/compose/foundation/layout/FlowLayoutKt;->crossAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I

    move-result v7

    .line 796
    .local v7, "crossAxisSize":I
    invoke-static {v6, v7}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v8

    iput-object v8, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMoreSize:Landroidx/collection/IntIntPair;

    .line 797
    instance-of v8, v4, Landroidx/compose/ui/layout/Measurable;

    if-eqz v8, :cond_1

    move-object v8, v4

    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    goto :goto_1

    :cond_1
    move-object v8, v3

    :goto_1
    iput-object v8, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMoreMeasurable:Landroidx/compose/ui/layout/Measurable;

    .line 798
    iput-object v3, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->seeMorePlaceable:Landroidx/compose/ui/layout/Placeable;

    .line 799
    nop

    .line 792
    .end local v4    # "item":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v5    # "$i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$1":I
    .end local v6    # "mainAxisSize":I
    .end local v7    # "crossAxisSize":I
    nop

    .line 800
    :cond_2
    if-eqz p2, :cond_4

    move-object v4, p2

    .restart local v4    # "item":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/4 v5, 0x0

    .line 802
    .local v5, "$i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$2":I
    const/4 v6, 0x0

    .line 871
    .local v6, "$i$f$getCrossAxisMax-impl":I
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v6

    .line 802
    .end local v6    # "$i$f$getCrossAxisMax-impl":I
    invoke-static {v4, p3, v6}, Landroidx/compose/foundation/layout/FlowLayoutKt;->mainAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I

    move-result v6

    .line 801
    nop

    .line 803
    .local v6, "mainAxisSize":I
    invoke-static {v4, p3, v6}, Landroidx/compose/foundation/layout/FlowLayoutKt;->crossAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I

    move-result v7

    .line 804
    .restart local v7    # "crossAxisSize":I
    invoke-static {v6, v7}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v8

    invoke-static {v8, v9}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v8

    iput-object v8, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapseSize:Landroidx/collection/IntIntPair;

    .line 805
    instance-of v8, v4, Landroidx/compose/ui/layout/Measurable;

    if-eqz v8, :cond_3

    move-object v8, v4

    check-cast v8, Landroidx/compose/ui/layout/Measurable;

    goto :goto_2

    :cond_3
    move-object v8, v3

    :goto_2
    iput-object v8, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapseMeasurable:Landroidx/compose/ui/layout/Measurable;

    .line 806
    iput-object v3, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->collapsePlaceable:Landroidx/compose/ui/layout/Placeable;

    .line 807
    nop

    .line 800
    .end local v4    # "item":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v5    # "$i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$2":I
    .end local v6    # "mainAxisSize":I
    .end local v7    # "crossAxisSize":I
    nop

    .line 808
    :cond_4
    return-void
.end method

.method public final setOverflowMeasurables-VKLhPVY$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function2;)V
    .locals 9
    .param p1, "measurePolicy"    # Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;
    .param p2, "constraints"    # J
    .param p4, "getOverflowMeasurable"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;",
            "J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;)V"
        }
    .end annotation

    .line 860
    const/4 v0, 0x0

    .line 863
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 860
    iput v0, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->itemShown:I

    .line 861
    iput-object p4, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getOverflowMeasurable:Lkotlin/jvm/functions/Function2;

    .line 863
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p4, v2, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 862
    move-object v5, v2

    .line 865
    .local v5, "seeMoreMeasurable":Landroidx/compose/ui/layout/Measurable;
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p4, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 864
    nop

    .line 866
    .local v6, "collapseMeasurable":Landroidx/compose/ui/layout/Measurable;
    move-object v3, p0

    move-object v4, p1

    move-wide v7, p2

    .end local p1    # "measurePolicy":Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;
    .end local p2    # "constraints":J
    .local v4, "measurePolicy":Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;
    .local v7, "constraints":J
    invoke-virtual/range {v3 .. v8}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->setOverflowMeasurables--hBUhpc$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V

    .line 867
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FlowLayoutOverflowState(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->type:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minLinesToShowCollapse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minLinesToShowCollapse:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minCrossAxisSizeToShowCollapse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->minCrossAxisSizeToShowCollapse:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
