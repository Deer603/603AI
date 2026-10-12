.class public final Landroidx/compose/foundation/layout/Arrangement;
.super Ljava/lang/Object;
.source "Arrangement.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/layout/Arrangement$Absolute;,
        Landroidx/compose/foundation/layout/Arrangement$Horizontal;,
        Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;,
        Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;,
        Landroidx/compose/foundation/layout/Arrangement$Vertical;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,711:1\n702#1,2:717\n705#1,5:722\n702#1,2:727\n705#1,5:732\n702#1,2:740\n705#1,5:746\n702#1,2:754\n705#1,5:760\n702#1,2:768\n705#1,5:774\n702#1,2:782\n705#1,5:788\n113#2:712\n113#2:713\n12762#3,3:714\n13404#3,3:719\n13404#3,3:729\n12762#3,3:737\n13404#3,2:742\n13406#3:745\n12762#3,3:751\n13404#3,2:756\n13406#3:759\n12762#3,3:765\n13404#3,2:770\n13406#3:773\n12762#3,3:779\n13404#3,2:784\n13406#3:787\n13404#3,3:793\n26#4:744\n26#4:758\n26#4:772\n26#4:786\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n614#1:717,2\n614#1:722,5\n622#1:727,2\n622#1:732,5\n636#1:740,2\n636#1:746,5\n651#1:754,2\n651#1:760,5\n675#1:768,2\n675#1:774,5\n695#1:782,2\n695#1:788,5\n339#1:712\n351#1:713\n612#1:714,3\n614#1:719,3\n622#1:729,3\n634#1:737,3\n636#1:742,2\n636#1:745\n648#1:751,3\n651#1:756,2\n651#1:759\n665#1:765,3\n675#1:770,2\n675#1:773\n687#1:779,3\n695#1:784,2\n695#1:787\n703#1:793,3\n637#1:744\n652#1:758\n676#1:772\n696#1:786\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0005EFGHIB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020$H\u0007J-\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u0008.J%\u0010/\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00080J-\u00101\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00082J-\u00103\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00084J-\u00105\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00086J-\u00107\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000\u00a2\u0006\u0002\u00088J\u001a\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020;H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008<\u0010=J\"\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;2\u0006\u0010\"\u001a\u00020#H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008>\u0010?J\"\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020;2\u0006\u0010\"\u001a\u00020$H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008>\u0010@J/\u0010A\u001a\u00020&*\u00020*2\u0006\u0010B\u001a\u00020-2\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&0DH\u0082\u0008R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\n\u0010\u0002\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\u0002\u001a\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0013\u0010\u0002\u001a\u0004\u0008\u0014\u0010\u000cR\u001c\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0002\u001a\u0004\u0008\u0017\u0010\u000cR\u001c\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u0002\u001a\u0004\u0008\u001a\u0010\u000cR\u001c\u0010\u001b\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001c\u0010\u0002\u001a\u0004\u0008\u001d\u0010\u0011R\u001c\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001f\u0010\u0002\u001a\u0004\u0008 \u0010\u0007\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006J"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/Arrangement;",
        "",
        "()V",
        "Bottom",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "getBottom$annotations",
        "getBottom",
        "()Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "Center",
        "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;",
        "getCenter$annotations",
        "getCenter",
        "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;",
        "End",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "getEnd$annotations",
        "getEnd",
        "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "SpaceAround",
        "getSpaceAround$annotations",
        "getSpaceAround",
        "SpaceBetween",
        "getSpaceBetween$annotations",
        "getSpaceBetween",
        "SpaceEvenly",
        "getSpaceEvenly$annotations",
        "getSpaceEvenly",
        "Start",
        "getStart$annotations",
        "getStart",
        "Top",
        "getTop$annotations",
        "getTop",
        "aligned",
        "alignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "placeCenter",
        "",
        "totalSize",
        "",
        "size",
        "",
        "outPosition",
        "reverseInput",
        "",
        "placeCenter$foundation_layout_release",
        "placeLeftOrTop",
        "placeLeftOrTop$foundation_layout_release",
        "placeRightOrBottom",
        "placeRightOrBottom$foundation_layout_release",
        "placeSpaceAround",
        "placeSpaceAround$foundation_layout_release",
        "placeSpaceBetween",
        "placeSpaceBetween$foundation_layout_release",
        "placeSpaceEvenly",
        "placeSpaceEvenly$foundation_layout_release",
        "spacedBy",
        "space",
        "Landroidx/compose/ui/unit/Dp;",
        "spacedBy-0680j_4",
        "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;",
        "spacedBy-D5KLDUw",
        "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "forEachIndexed",
        "reversed",
        "action",
        "Lkotlin/Function2;",
        "Absolute",
        "Horizontal",
        "HorizontalOrVertical",
        "SpacedAligned",
        "Vertical",
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

.field private static final Bottom:Landroidx/compose/foundation/layout/Arrangement$Vertical;

.field private static final Center:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

.field private static final End:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field public static final INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

.field private static final SpaceAround:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

.field private static final SpaceBetween:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

.field private static final SpaceEvenly:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

.field private static final Start:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

.field private static final Top:Landroidx/compose/foundation/layout/Arrangement$Vertical;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/Arrangement;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 111
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Start$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Start$1;-><init>()V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Start:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 133
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$End$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$End$1;-><init>()V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->End:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 155
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Top$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Top$1;-><init>()V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Top:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 168
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Bottom$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Bottom$1;-><init>()V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Bottom:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 181
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$Center$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$Center$1;-><init>()V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->Center:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 209
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1;-><init>()V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceEvenly:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 236
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpaceBetween$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$SpaceBetween$1;-><init>()V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceBetween:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 264
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpaceAround$1;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/Arrangement$SpaceAround$1;-><init>()V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    sput-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceAround:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final forEachIndexed([IZLkotlin/jvm/functions/Function2;)V
    .locals 9
    .param p1, "$this$forEachIndexed"    # [I
    .param p2, "reversed"    # Z
    .param p3, "action"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([IZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 702
    .local v0, "$i$f$forEachIndexed":I
    if-nez p2, :cond_1

    .line 703
    move-object v1, p1

    .local v1, "$this$forEachIndexed$iv":[I
    const/4 v2, 0x0

    .line 793
    .local v2, "$i$f$forEachIndexed":I
    const/4 v3, 0x0

    .line 794
    .local v3, "index$iv":I
    array-length v4, v1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget v6, v1, v5

    .local v6, "item$iv":I
    add-int/lit8 v7, v3, 0x1

    .end local v3    # "index$iv":I
    .local v7, "index$iv":I
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {p3, v3, v8}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v6    # "item$iv":I
    add-int/lit8 v5, v5, 0x1

    move v3, v7

    goto :goto_0

    .line 795
    .end local v7    # "index$iv":I
    .restart local v3    # "index$iv":I
    :cond_0
    nop

    .end local v1    # "$this$forEachIndexed$iv":[I
    .end local v2    # "$i$f$forEachIndexed":I
    .end local v3    # "index$iv":I
    goto :goto_2

    .line 705
    :cond_1
    array-length v1, p1

    add-int/lit8 v1, v1, -0x1

    .local v1, "i":I
    :goto_1
    const/4 v2, -0x1

    if-ge v2, v1, :cond_2

    .line 706
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aget v3, p1, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v2, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 709
    .end local v1    # "i":I
    :cond_2
    :goto_2
    return-void
.end method

.method public static synthetic getBottom$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCenter$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getEnd$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getSpaceAround$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getSpaceBetween$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getSpaceEvenly$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getStart$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getTop$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final aligned(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 5
    .param p1, "alignment"    # Landroidx/compose/ui/Alignment$Horizontal;

    .line 339
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    const/4 v1, 0x0

    .local v1, "$this$dp$iv":I
    const/4 v2, 0x0

    .line 712
    .local v2, "$i$f$getDp":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 339
    .end local v1    # "$this$dp$iv":I
    .end local v2    # "$i$f$getDp":I
    new-instance v2, Landroidx/compose/foundation/layout/Arrangement$aligned$1;

    invoke-direct {v2, p1}, Landroidx/compose/foundation/layout/Arrangement$aligned$1;-><init>(Landroidx/compose/ui/Alignment$Horizontal;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2, v3}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 341
    return-object v0
.end method

.method public final aligned(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 5
    .param p1, "alignment"    # Landroidx/compose/ui/Alignment$Vertical;

    .line 351
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    const/4 v1, 0x0

    .local v1, "$this$dp$iv":I
    const/4 v2, 0x0

    .line 713
    .local v2, "$i$f$getDp":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 351
    .end local v1    # "$this$dp$iv":I
    .end local v2    # "$i$f$getDp":I
    new-instance v2, Landroidx/compose/foundation/layout/Arrangement$aligned$2;

    invoke-direct {v2, p1}, Landroidx/compose/foundation/layout/Arrangement$aligned$2;-><init>(Landroidx/compose/ui/Alignment$Vertical;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    return-object v0
.end method

.method public final getBottom()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 1

    .line 167
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->Bottom:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    return-object v0
.end method

.method public final getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 1

    .line 180
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->Center:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-object v0
.end method

.method public final getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 1

    .line 132
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->End:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    return-object v0
.end method

.method public final getSpaceAround()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 1

    .line 263
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceAround:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-object v0
.end method

.method public final getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 1

    .line 235
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceBetween:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-object v0
.end method

.method public final getSpaceEvenly()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 1

    .line 208
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->SpaceEvenly:Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    return-object v0
.end method

.method public final getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 1

    .line 110
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->Start:Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    return-object v0
.end method

.method public final getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 1

    .line 154
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->Top:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    return-object v0
.end method

.method public final placeCenter$foundation_layout_release(I[I[IZ)V
    .locals 16
    .param p1, "totalSize"    # I
    .param p2, "size"    # [I
    .param p3, "outPosition"    # [I
    .param p4, "reverseInput"    # Z

    .line 634
    const/4 v0, 0x0

    .local v0, "initial$iv":I
    move-object/from16 v1, p2

    .local v1, "$this$fold$iv":[I
    const/4 v2, 0x0

    .line 737
    .local v2, "$i$f$fold":I
    move v3, v0

    .line 738
    .local v3, "accumulator$iv":I
    array-length v4, v1

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_0

    aget v7, v1, v6

    .local v7, "element$iv":I
    move v8, v3

    .local v8, "a":I
    move v9, v7

    .local v9, "b":I
    const/4 v10, 0x0

    .line 634
    .local v10, "$i$a$-fold-Arrangement$placeCenter$consumedSize$1":I
    add-int/2addr v8, v9

    .line 738
    .end local v8    # "a":I
    .end local v9    # "b":I
    .end local v10    # "$i$a$-fold-Arrangement$placeCenter$consumedSize$1":I
    move v3, v8

    .end local v7    # "element$iv":I
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 739
    :cond_0
    nop

    .line 634
    .end local v0    # "initial$iv":I
    .end local v1    # "$this$fold$iv":[I
    .end local v2    # "$i$f$fold":I
    .end local v3    # "accumulator$iv":I
    nop

    .line 635
    .local v3, "consumedSize":I
    const/4 v0, 0x0

    .local v0, "current":F
    sub-int v1, p1, v3

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    .line 636
    .end local v0    # "current":F
    .local v1, "current":F
    move-object/from16 v0, p2

    .local v0, "$this$forEachIndexed$iv":[I
    move-object/from16 v2, p0

    .local v2, "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    const/4 v4, 0x0

    .line 740
    .local v4, "$i$f$forEachIndexed":I
    if-nez p4, :cond_2

    .line 741
    move-object v6, v0

    .local v6, "$this$forEachIndexed$iv$iv":[I
    const/4 v7, 0x0

    .line 742
    .local v7, "$i$f$forEachIndexed":I
    const/4 v8, 0x0

    .line 743
    .local v8, "index$iv$iv":I
    array-length v9, v6

    :goto_1
    if-ge v5, v9, :cond_1

    aget v10, v6, v5

    .local v10, "item$iv$iv":I
    add-int/lit8 v11, v8, 0x1

    .local v8, "index":I
    .local v11, "index$iv$iv":I
    move v12, v10

    .local v12, "it":I
    const/4 v13, 0x0

    .line 637
    .local v13, "$i$a$-forEachIndexed-Arrangement$placeCenter$1":I
    move v14, v1

    .local v14, "$this$fastRoundToInt$iv":F
    const/4 v15, 0x0

    .line 744
    .local v15, "$i$f$fastRoundToInt":I
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    move-result v14

    .end local v14    # "$this$fastRoundToInt$iv":F
    .end local v15    # "$i$f$fastRoundToInt":I
    aput v14, p3, v8

    .line 638
    int-to-float v14, v12

    add-float/2addr v1, v14

    .line 639
    nop

    .line 743
    .end local v8    # "index":I
    .end local v12    # "it":I
    .end local v13    # "$i$a$-forEachIndexed-Arrangement$placeCenter$1":I
    nop

    .end local v10    # "item$iv$iv":I
    add-int/lit8 v5, v5, 0x1

    move v8, v11

    goto :goto_1

    .line 745
    .end local v11    # "index$iv$iv":I
    .local v8, "index$iv$iv":I
    :cond_1
    nop

    .end local v6    # "$this$forEachIndexed$iv$iv":[I
    .end local v7    # "$i$f$forEachIndexed":I
    .end local v8    # "index$iv$iv":I
    goto :goto_3

    .line 746
    :cond_2
    array-length v5, v0

    add-int/lit8 v5, v5, -0x1

    .local v5, "i$iv":I
    :goto_2
    const/4 v6, -0x1

    if-ge v6, v5, :cond_3

    .line 747
    aget v6, v0, v5

    .local v6, "it":I
    move v7, v5

    .local v7, "index":I
    const/4 v8, 0x0

    .line 637
    .local v8, "$i$a$-forEachIndexed-Arrangement$placeCenter$1":I
    move v9, v1

    .local v9, "$this$fastRoundToInt$iv":F
    const/4 v10, 0x0

    .line 744
    .local v10, "$i$f$fastRoundToInt":I
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    .end local v9    # "$this$fastRoundToInt$iv":F
    .end local v10    # "$i$f$fastRoundToInt":I
    aput v9, p3, v7

    .line 638
    int-to-float v9, v6

    add-float/2addr v1, v9

    .line 639
    nop

    .line 747
    .end local v6    # "it":I
    .end local v7    # "index":I
    .end local v8    # "$i$a$-forEachIndexed-Arrangement$placeCenter$1":I
    nop

    .line 746
    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    .line 750
    .end local v5    # "i$iv":I
    :cond_3
    :goto_3
    nop

    .line 640
    .end local v0    # "$this$forEachIndexed$iv":[I
    .end local v2    # "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    .end local v4    # "$i$f$forEachIndexed":I
    return-void
.end method

.method public final placeLeftOrTop$foundation_layout_release([I[IZ)V
    .locals 13
    .param p1, "size"    # [I
    .param p2, "outPosition"    # [I
    .param p3, "reverseInput"    # Z

    .line 621
    const/4 v0, 0x0

    .line 622
    .local v0, "current":I
    move-object v1, p1

    .local v1, "$this$forEachIndexed$iv":[I
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    const/4 v3, 0x0

    .line 727
    .local v3, "$i$f$forEachIndexed":I
    if-nez p3, :cond_1

    .line 728
    move-object v4, v1

    .local v4, "$this$forEachIndexed$iv$iv":[I
    const/4 v5, 0x0

    .line 729
    .local v5, "$i$f$forEachIndexed":I
    const/4 v6, 0x0

    .line 730
    .local v6, "index$iv$iv":I
    array-length v7, v4

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    aget v9, v4, v8

    .local v9, "item$iv$iv":I
    add-int/lit8 v10, v6, 0x1

    .local v6, "index":I
    .local v10, "index$iv$iv":I
    move v11, v9

    .local v11, "it":I
    const/4 v12, 0x0

    .line 623
    .local v12, "$i$a$-forEachIndexed-Arrangement$placeLeftOrTop$1":I
    aput v0, p2, v6

    .line 624
    add-int/2addr v0, v11

    .line 625
    nop

    .line 730
    .end local v6    # "index":I
    .end local v11    # "it":I
    .end local v12    # "$i$a$-forEachIndexed-Arrangement$placeLeftOrTop$1":I
    nop

    .end local v9    # "item$iv$iv":I
    add-int/lit8 v8, v8, 0x1

    move v6, v10

    goto :goto_0

    .line 731
    .end local v10    # "index$iv$iv":I
    .local v6, "index$iv$iv":I
    :cond_0
    nop

    .end local v4    # "$this$forEachIndexed$iv$iv":[I
    .end local v5    # "$i$f$forEachIndexed":I
    .end local v6    # "index$iv$iv":I
    goto :goto_2

    .line 732
    :cond_1
    array-length v4, v1

    add-int/lit8 v4, v4, -0x1

    .local v4, "i$iv":I
    :goto_1
    const/4 v5, -0x1

    if-ge v5, v4, :cond_2

    .line 733
    aget v5, v1, v4

    .local v5, "it":I
    move v6, v4

    .local v6, "index":I
    const/4 v7, 0x0

    .line 623
    .local v7, "$i$a$-forEachIndexed-Arrangement$placeLeftOrTop$1":I
    aput v0, p2, v6

    .line 624
    add-int/2addr v0, v5

    .line 625
    nop

    .line 733
    .end local v5    # "it":I
    .end local v6    # "index":I
    .end local v7    # "$i$a$-forEachIndexed-Arrangement$placeLeftOrTop$1":I
    nop

    .line 732
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    .line 736
    .end local v4    # "i$iv":I
    :cond_2
    :goto_2
    nop

    .line 626
    .end local v1    # "$this$forEachIndexed$iv":[I
    .end local v2    # "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    .end local v3    # "$i$f$forEachIndexed":I
    return-void
.end method

.method public final placeRightOrBottom$foundation_layout_release(I[I[IZ)V
    .locals 14
    .param p1, "totalSize"    # I
    .param p2, "size"    # [I
    .param p3, "outPosition"    # [I
    .param p4, "reverseInput"    # Z

    .line 612
    const/4 v0, 0x0

    .local v0, "initial$iv":I
    move-object/from16 v1, p2

    .local v1, "$this$fold$iv":[I
    const/4 v2, 0x0

    .line 714
    .local v2, "$i$f$fold":I
    move v3, v0

    .line 715
    .local v3, "accumulator$iv":I
    array-length v4, v1

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_0

    aget v7, v1, v6

    .local v7, "element$iv":I
    move v8, v3

    .local v8, "a":I
    move v9, v7

    .local v9, "b":I
    const/4 v10, 0x0

    .line 612
    .local v10, "$i$a$-fold-Arrangement$placeRightOrBottom$consumedSize$1":I
    add-int/2addr v8, v9

    .line 715
    .end local v8    # "a":I
    .end local v9    # "b":I
    .end local v10    # "$i$a$-fold-Arrangement$placeRightOrBottom$consumedSize$1":I
    move v3, v8

    .end local v7    # "element$iv":I
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 716
    :cond_0
    nop

    .line 612
    .end local v0    # "initial$iv":I
    .end local v1    # "$this$fold$iv":[I
    .end local v2    # "$i$f$fold":I
    .end local v3    # "accumulator$iv":I
    nop

    .line 613
    .local v3, "consumedSize":I
    const/4 v0, 0x0

    .local v0, "current":I
    sub-int v0, p1, v3

    .line 614
    move-object/from16 v1, p2

    .local v1, "$this$forEachIndexed$iv":[I
    move-object v2, p0

    .local v2, "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    const/4 v4, 0x0

    .line 717
    .local v4, "$i$f$forEachIndexed":I
    if-nez p4, :cond_2

    .line 718
    move-object v6, v1

    .local v6, "$this$forEachIndexed$iv$iv":[I
    const/4 v7, 0x0

    .line 719
    .local v7, "$i$f$forEachIndexed":I
    const/4 v8, 0x0

    .line 720
    .local v8, "index$iv$iv":I
    array-length v9, v6

    :goto_1
    if-ge v5, v9, :cond_1

    aget v10, v6, v5

    .local v10, "item$iv$iv":I
    add-int/lit8 v11, v8, 0x1

    .local v8, "index":I
    .local v11, "index$iv$iv":I
    move v12, v10

    .local v12, "it":I
    const/4 v13, 0x0

    .line 615
    .local v13, "$i$a$-forEachIndexed-Arrangement$placeRightOrBottom$1":I
    aput v0, p3, v8

    .line 616
    add-int/2addr v0, v12

    .line 617
    nop

    .line 720
    .end local v8    # "index":I
    .end local v12    # "it":I
    .end local v13    # "$i$a$-forEachIndexed-Arrangement$placeRightOrBottom$1":I
    nop

    .end local v10    # "item$iv$iv":I
    add-int/lit8 v5, v5, 0x1

    move v8, v11

    goto :goto_1

    .line 721
    .end local v11    # "index$iv$iv":I
    .local v8, "index$iv$iv":I
    :cond_1
    nop

    .end local v6    # "$this$forEachIndexed$iv$iv":[I
    .end local v7    # "$i$f$forEachIndexed":I
    .end local v8    # "index$iv$iv":I
    goto :goto_3

    .line 722
    :cond_2
    array-length v5, v1

    add-int/lit8 v5, v5, -0x1

    .local v5, "i$iv":I
    :goto_2
    const/4 v6, -0x1

    if-ge v6, v5, :cond_3

    .line 723
    aget v6, v1, v5

    .local v6, "it":I
    move v7, v5

    .local v7, "index":I
    const/4 v8, 0x0

    .line 615
    .local v8, "$i$a$-forEachIndexed-Arrangement$placeRightOrBottom$1":I
    aput v0, p3, v7

    .line 616
    add-int/2addr v0, v6

    .line 617
    nop

    .line 723
    .end local v6    # "it":I
    .end local v7    # "index":I
    .end local v8    # "$i$a$-forEachIndexed-Arrangement$placeRightOrBottom$1":I
    nop

    .line 722
    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    .line 726
    .end local v5    # "i$iv":I
    :cond_3
    :goto_3
    nop

    .line 618
    .end local v1    # "$this$forEachIndexed$iv":[I
    .end local v2    # "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    .end local v4    # "$i$f$forEachIndexed":I
    return-void
.end method

.method public final placeSpaceAround$foundation_layout_release(I[I[IZ)V
    .locals 18
    .param p1, "totalSize"    # I
    .param p2, "size"    # [I
    .param p3, "outPosition"    # [I
    .param p4, "reverseInput"    # Z

    .line 687
    move-object/from16 v0, p2

    const/4 v1, 0x0

    .local v1, "initial$iv":I
    move-object/from16 v2, p2

    .local v2, "$this$fold$iv":[I
    const/4 v3, 0x0

    .line 779
    .local v3, "$i$f$fold":I
    move v4, v1

    .line 780
    .local v4, "accumulator$iv":I
    array-length v5, v2

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_0

    aget v8, v2, v7

    .local v8, "element$iv":I
    move v9, v4

    .local v9, "a":I
    move v10, v8

    .local v10, "b":I
    const/4 v11, 0x0

    .line 687
    .local v11, "$i$a$-fold-Arrangement$placeSpaceAround$consumedSize$1":I
    add-int/2addr v9, v10

    .line 780
    .end local v9    # "a":I
    .end local v10    # "b":I
    .end local v11    # "$i$a$-fold-Arrangement$placeSpaceAround$consumedSize$1":I
    move v4, v9

    .end local v8    # "element$iv":I
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 781
    :cond_0
    nop

    .line 687
    .end local v1    # "initial$iv":I
    .end local v2    # "$this$fold$iv":[I
    .end local v3    # "$i$f$fold":I
    .end local v4    # "accumulator$iv":I
    nop

    .line 689
    .local v4, "consumedSize":I
    array-length v1, v0

    const/4 v2, 0x1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    if-nez v1, :cond_2

    .line 690
    sub-int v1, p1, v4

    int-to-float v1, v1

    array-length v3, v0

    int-to-float v3, v3

    div-float/2addr v1, v3

    goto :goto_2

    .line 692
    :cond_2
    const/4 v1, 0x0

    .line 689
    :goto_2
    nop

    .line 688
    nop

    .line 694
    .local v1, "gapSize":F
    const/4 v3, 0x0

    .local v3, "current":F
    const/high16 v5, 0x40000000    # 2.0f

    div-float v3, v1, v5

    .line 695
    move-object/from16 v5, p2

    .local v5, "$this$forEachIndexed$iv":[I
    move-object/from16 v7, p0

    .local v7, "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    const/4 v8, 0x0

    .line 782
    .local v8, "$i$f$forEachIndexed":I
    if-nez p4, :cond_4

    .line 783
    move-object v2, v5

    .local v2, "$this$forEachIndexed$iv$iv":[I
    const/4 v9, 0x0

    .line 784
    .local v9, "$i$f$forEachIndexed":I
    const/4 v10, 0x0

    .line 785
    .local v10, "index$iv$iv":I
    array-length v11, v2

    :goto_3
    if-ge v6, v11, :cond_3

    aget v12, v2, v6

    .local v12, "item$iv$iv":I
    add-int/lit8 v13, v10, 0x1

    .local v10, "index":I
    .local v13, "index$iv$iv":I
    move v14, v12

    .local v14, "it":I
    const/4 v15, 0x0

    .line 696
    .local v15, "$i$a$-forEachIndexed-Arrangement$placeSpaceAround$1":I
    move/from16 v16, v3

    .local v16, "$this$fastRoundToInt$iv":F
    const/16 v17, 0x0

    .line 786
    .local v17, "$i$f$fastRoundToInt":I
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->round(F)I

    move-result v16

    .end local v16    # "$this$fastRoundToInt$iv":F
    .end local v17    # "$i$f$fastRoundToInt":I
    aput v16, p3, v10

    .line 697
    int-to-float v0, v14

    add-float/2addr v0, v1

    add-float/2addr v3, v0

    .line 698
    nop

    .line 785
    .end local v10    # "index":I
    .end local v14    # "it":I
    .end local v15    # "$i$a$-forEachIndexed-Arrangement$placeSpaceAround$1":I
    nop

    .end local v12    # "item$iv$iv":I
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p2

    move v10, v13

    goto :goto_3

    .line 787
    .end local v13    # "index$iv$iv":I
    .local v10, "index$iv$iv":I
    :cond_3
    nop

    .end local v2    # "$this$forEachIndexed$iv$iv":[I
    .end local v9    # "$i$f$forEachIndexed":I
    .end local v10    # "index$iv$iv":I
    goto :goto_5

    .line 788
    :cond_4
    array-length v0, v5

    sub-int/2addr v0, v2

    .local v0, "i$iv":I
    :goto_4
    const/4 v2, -0x1

    if-ge v2, v0, :cond_5

    .line 789
    aget v2, v5, v0

    .local v2, "it":I
    move v6, v0

    .local v6, "index":I
    const/4 v9, 0x0

    .line 696
    .local v9, "$i$a$-forEachIndexed-Arrangement$placeSpaceAround$1":I
    move v10, v3

    .local v10, "$this$fastRoundToInt$iv":F
    const/4 v11, 0x0

    .line 786
    .local v11, "$i$f$fastRoundToInt":I
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    .end local v10    # "$this$fastRoundToInt$iv":F
    .end local v11    # "$i$f$fastRoundToInt":I
    aput v10, p3, v6

    .line 697
    int-to-float v10, v2

    add-float/2addr v10, v1

    add-float/2addr v3, v10

    .line 698
    nop

    .line 789
    .end local v2    # "it":I
    .end local v6    # "index":I
    .end local v9    # "$i$a$-forEachIndexed-Arrangement$placeSpaceAround$1":I
    nop

    .line 788
    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    .line 792
    .end local v0    # "i$iv":I
    :cond_5
    :goto_5
    nop

    .line 699
    .end local v5    # "$this$forEachIndexed$iv":[I
    .end local v7    # "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    .end local v8    # "$i$f$forEachIndexed":I
    return-void
.end method

.method public final placeSpaceBetween$foundation_layout_release(I[I[IZ)V
    .locals 19
    .param p1, "totalSize"    # I
    .param p2, "size"    # [I
    .param p3, "outPosition"    # [I
    .param p4, "reverseInput"    # Z

    .line 663
    move-object/from16 v0, p2

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    return-void

    .line 665
    :cond_1
    const/4 v1, 0x0

    .local v1, "initial$iv":I
    move-object/from16 v4, p2

    .local v4, "$this$fold$iv":[I
    const/4 v5, 0x0

    .line 765
    .local v5, "$i$f$fold":I
    move v6, v1

    .line 766
    .local v6, "accumulator$iv":I
    array-length v7, v4

    move v8, v2

    :goto_1
    if-ge v8, v7, :cond_2

    aget v9, v4, v8

    .local v9, "element$iv":I
    move v10, v6

    .local v10, "a":I
    move v11, v9

    .local v11, "b":I
    const/4 v12, 0x0

    .line 665
    .local v12, "$i$a$-fold-Arrangement$placeSpaceBetween$consumedSize$1":I
    add-int/2addr v10, v11

    .line 766
    .end local v10    # "a":I
    .end local v11    # "b":I
    .end local v12    # "$i$a$-fold-Arrangement$placeSpaceBetween$consumedSize$1":I
    move v6, v10

    .end local v9    # "element$iv":I
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 767
    :cond_2
    nop

    .line 665
    .end local v1    # "initial$iv":I
    .end local v4    # "$this$fold$iv":[I
    .end local v5    # "$i$f$fold":I
    .end local v6    # "accumulator$iv":I
    nop

    .line 666
    .local v6, "consumedSize":I
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->getLastIndex([I)I

    move-result v1

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 667
    .local v1, "noOfGaps":I
    sub-int v4, p1, v6

    int-to-float v4, v4

    int-to-float v5, v1

    div-float/2addr v4, v5

    .line 669
    .local v4, "gapSize":F
    const/4 v5, 0x0

    .line 670
    .local v5, "current":F
    if-eqz p4, :cond_3

    array-length v7, v0

    if-ne v7, v3, :cond_3

    .line 673
    move v5, v4

    .line 675
    :cond_3
    move-object/from16 v7, p2

    .local v7, "$this$forEachIndexed$iv":[I
    move-object/from16 v8, p0

    .local v8, "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    const/4 v9, 0x0

    .line 768
    .local v9, "$i$f$forEachIndexed":I
    if-nez p4, :cond_5

    .line 769
    move-object v3, v7

    .local v3, "$this$forEachIndexed$iv$iv":[I
    const/4 v10, 0x0

    .line 770
    .local v10, "$i$f$forEachIndexed":I
    const/4 v11, 0x0

    .line 771
    .local v11, "index$iv$iv":I
    array-length v12, v3

    :goto_2
    if-ge v2, v12, :cond_4

    aget v13, v3, v2

    .local v13, "item$iv$iv":I
    add-int/lit8 v14, v11, 0x1

    .local v11, "index":I
    .local v14, "index$iv$iv":I
    move v15, v13

    .local v15, "it":I
    const/16 v16, 0x0

    .line 676
    .local v16, "$i$a$-forEachIndexed-Arrangement$placeSpaceBetween$1":I
    move/from16 v17, v5

    .local v17, "$this$fastRoundToInt$iv":F
    const/16 v18, 0x0

    .line 772
    .local v18, "$i$f$fastRoundToInt":I
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    move-result v17

    .end local v17    # "$this$fastRoundToInt$iv":F
    .end local v18    # "$i$f$fastRoundToInt":I
    aput v17, p3, v11

    .line 677
    int-to-float v0, v15

    add-float/2addr v0, v4

    add-float/2addr v5, v0

    .line 678
    nop

    .line 771
    .end local v11    # "index":I
    .end local v15    # "it":I
    .end local v16    # "$i$a$-forEachIndexed-Arrangement$placeSpaceBetween$1":I
    nop

    .end local v13    # "item$iv$iv":I
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p2

    move v11, v14

    goto :goto_2

    .line 773
    .end local v14    # "index$iv$iv":I
    .local v11, "index$iv$iv":I
    :cond_4
    nop

    .end local v3    # "$this$forEachIndexed$iv$iv":[I
    .end local v10    # "$i$f$forEachIndexed":I
    .end local v11    # "index$iv$iv":I
    goto :goto_4

    .line 774
    :cond_5
    array-length v0, v7

    sub-int/2addr v0, v3

    .local v0, "i$iv":I
    :goto_3
    const/4 v2, -0x1

    if-ge v2, v0, :cond_6

    .line 775
    aget v2, v7, v0

    .local v2, "it":I
    move v3, v0

    .local v3, "index":I
    const/4 v10, 0x0

    .line 676
    .local v10, "$i$a$-forEachIndexed-Arrangement$placeSpaceBetween$1":I
    move v11, v5

    .local v11, "$this$fastRoundToInt$iv":F
    const/4 v12, 0x0

    .line 772
    .local v12, "$i$f$fastRoundToInt":I
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    .end local v11    # "$this$fastRoundToInt$iv":F
    .end local v12    # "$i$f$fastRoundToInt":I
    aput v11, p3, v3

    .line 677
    int-to-float v11, v2

    add-float/2addr v11, v4

    add-float/2addr v5, v11

    .line 678
    nop

    .line 775
    .end local v2    # "it":I
    .end local v3    # "index":I
    .end local v10    # "$i$a$-forEachIndexed-Arrangement$placeSpaceBetween$1":I
    nop

    .line 774
    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    .line 778
    .end local v0    # "i$iv":I
    :cond_6
    :goto_4
    nop

    .line 679
    .end local v7    # "$this$forEachIndexed$iv":[I
    .end local v8    # "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    .end local v9    # "$i$f$forEachIndexed":I
    return-void
.end method

.method public final placeSpaceEvenly$foundation_layout_release(I[I[IZ)V
    .locals 18
    .param p1, "totalSize"    # I
    .param p2, "size"    # [I
    .param p3, "outPosition"    # [I
    .param p4, "reverseInput"    # Z

    .line 648
    const/4 v0, 0x0

    .local v0, "initial$iv":I
    move-object/from16 v1, p2

    .local v1, "$this$fold$iv":[I
    const/4 v2, 0x0

    .line 751
    .local v2, "$i$f$fold":I
    move v3, v0

    .line 752
    .local v3, "accumulator$iv":I
    array-length v4, v1

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_0

    aget v7, v1, v6

    .local v7, "element$iv":I
    move v8, v3

    .local v8, "a":I
    move v9, v7

    .local v9, "b":I
    const/4 v10, 0x0

    .line 648
    .local v10, "$i$a$-fold-Arrangement$placeSpaceEvenly$consumedSize$1":I
    add-int/2addr v8, v9

    .line 752
    .end local v8    # "a":I
    .end local v9    # "b":I
    .end local v10    # "$i$a$-fold-Arrangement$placeSpaceEvenly$consumedSize$1":I
    move v3, v8

    .end local v7    # "element$iv":I
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 753
    :cond_0
    nop

    .line 648
    .end local v0    # "initial$iv":I
    .end local v1    # "$this$fold$iv":[I
    .end local v2    # "$i$f$fold":I
    .end local v3    # "accumulator$iv":I
    nop

    .line 649
    .local v3, "consumedSize":I
    sub-int v0, p1, v3

    int-to-float v0, v0

    move-object/from16 v1, p2

    array-length v2, v1

    add-int/lit8 v2, v2, 0x1

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 650
    .local v0, "gapSize":F
    const/4 v2, 0x0

    .local v2, "current":F
    move v2, v0

    .line 651
    move-object/from16 v4, p2

    .local v4, "$this$forEachIndexed$iv":[I
    move-object/from16 v6, p0

    .local v6, "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    const/4 v7, 0x0

    .line 754
    .local v7, "$i$f$forEachIndexed":I
    if-nez p4, :cond_2

    .line 755
    move-object v8, v4

    .local v8, "$this$forEachIndexed$iv$iv":[I
    const/4 v9, 0x0

    .line 756
    .local v9, "$i$f$forEachIndexed":I
    const/4 v10, 0x0

    .line 757
    .local v10, "index$iv$iv":I
    array-length v11, v8

    :goto_1
    if-ge v5, v11, :cond_1

    aget v12, v8, v5

    .local v12, "item$iv$iv":I
    add-int/lit8 v13, v10, 0x1

    .local v10, "index":I
    .local v13, "index$iv$iv":I
    move v14, v12

    .local v14, "it":I
    const/4 v15, 0x0

    .line 652
    .local v15, "$i$a$-forEachIndexed-Arrangement$placeSpaceEvenly$1":I
    move/from16 v16, v2

    .local v16, "$this$fastRoundToInt$iv":F
    const/16 v17, 0x0

    .line 758
    .local v17, "$i$f$fastRoundToInt":I
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->round(F)I

    move-result v16

    .end local v16    # "$this$fastRoundToInt$iv":F
    .end local v17    # "$i$f$fastRoundToInt":I
    aput v16, p3, v10

    .line 653
    move/from16 v16, v0

    .end local v0    # "gapSize":F
    .local v16, "gapSize":F
    int-to-float v0, v14

    add-float v0, v0, v16

    add-float/2addr v2, v0

    .line 654
    nop

    .line 757
    .end local v10    # "index":I
    .end local v14    # "it":I
    .end local v15    # "$i$a$-forEachIndexed-Arrangement$placeSpaceEvenly$1":I
    nop

    .end local v12    # "item$iv$iv":I
    add-int/lit8 v5, v5, 0x1

    move v10, v13

    move/from16 v0, v16

    goto :goto_1

    .line 759
    .end local v13    # "index$iv$iv":I
    .end local v16    # "gapSize":F
    .restart local v0    # "gapSize":F
    .local v10, "index$iv$iv":I
    :cond_1
    move/from16 v16, v0

    .end local v0    # "gapSize":F
    .end local v8    # "$this$forEachIndexed$iv$iv":[I
    .end local v9    # "$i$f$forEachIndexed":I
    .end local v10    # "index$iv$iv":I
    .restart local v16    # "gapSize":F
    goto :goto_3

    .line 760
    .end local v16    # "gapSize":F
    .restart local v0    # "gapSize":F
    :cond_2
    move/from16 v16, v0

    .end local v0    # "gapSize":F
    .restart local v16    # "gapSize":F
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    .local v0, "i$iv":I
    :goto_2
    const/4 v5, -0x1

    if-ge v5, v0, :cond_3

    .line 761
    aget v5, v4, v0

    .local v5, "it":I
    move v8, v0

    .local v8, "index":I
    const/4 v9, 0x0

    .line 652
    .local v9, "$i$a$-forEachIndexed-Arrangement$placeSpaceEvenly$1":I
    move v10, v2

    .local v10, "$this$fastRoundToInt$iv":F
    const/4 v11, 0x0

    .line 758
    .local v11, "$i$f$fastRoundToInt":I
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    .end local v10    # "$this$fastRoundToInt$iv":F
    .end local v11    # "$i$f$fastRoundToInt":I
    aput v10, p3, v8

    .line 653
    int-to-float v10, v5

    add-float v10, v10, v16

    add-float/2addr v2, v10

    .line 654
    nop

    .line 761
    .end local v5    # "it":I
    .end local v8    # "index":I
    .end local v9    # "$i$a$-forEachIndexed-Arrangement$placeSpaceEvenly$1":I
    nop

    .line 760
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 764
    .end local v0    # "i$iv":I
    :cond_3
    :goto_3
    nop

    .line 655
    .end local v4    # "$this$forEachIndexed$iv":[I
    .end local v6    # "this_$iv":Landroidx/compose/foundation/layout/Arrangement;
    .end local v7    # "$i$f$forEachIndexed":I
    return-void
.end method

.method public final spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    .locals 4
    .param p1, "space"    # F

    .line 297
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    sget-object v1, Landroidx/compose/foundation/layout/Arrangement$spacedBy$1;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement$spacedBy$1;

    check-cast v1, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p1, v3, v1, v2}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 299
    return-object v0
.end method

.method public final spacedBy-D5KLDUw(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .locals 4
    .param p1, "space"    # F
    .param p2, "alignment"    # Landroidx/compose/ui/Alignment$Horizontal;

    .line 313
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    new-instance v1, Landroidx/compose/foundation/layout/Arrangement$spacedBy$2;

    invoke-direct {v1, p2}, Landroidx/compose/foundation/layout/Arrangement$spacedBy$2;-><init>(Landroidx/compose/ui/Alignment$Horizontal;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p1, v3, v1, v2}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 315
    return-object v0
.end method

.method public final spacedBy-D5KLDUw(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 4
    .param p1, "space"    # F
    .param p2, "alignment"    # Landroidx/compose/ui/Alignment$Vertical;

    .line 329
    new-instance v0, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;

    new-instance v1, Landroidx/compose/foundation/layout/Arrangement$spacedBy$3;

    invoke-direct {v1, p2}, Landroidx/compose/foundation/layout/Arrangement$spacedBy$3;-><init>(Landroidx/compose/ui/Alignment$Vertical;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;-><init>(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    return-object v0
.end method
