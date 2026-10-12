.class public final Landroidx/compose/foundation/text/selection/SelectionManagerKt;
.super Ljava/lang/Object;
.source "SelectionManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/selection/SelectionManagerKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,1107:1\n34#2,4:1108\n39#2:1132\n30#3:1112\n30#3:1116\n30#3:1138\n53#4,3:1113\n53#4,3:1117\n60#4:1121\n70#4:1124\n60#4:1127\n70#4:1130\n60#4:1134\n85#4:1137\n53#4,3:1139\n60#4:1143\n70#4:1146\n65#5:1120\n69#5:1123\n65#5:1126\n69#5:1129\n65#5:1133\n65#5:1142\n69#5:1145\n22#6:1122\n22#6:1125\n22#6:1128\n22#6:1131\n22#6:1135\n22#6:1144\n54#7:1136\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n981#1:1108,4\n981#1:1132\n1004#1:1112\n1005#1:1116\n1092#1:1138\n1004#1:1113,3\n1005#1:1117,3\n1011#1:1121\n1012#1:1124\n1013#1:1127\n1014#1:1130\n1048#1:1134\n1080#1:1137\n1092#1:1139,3\n1106#1:1143\n1106#1:1146\n1011#1:1120\n1012#1:1123\n1013#1:1126\n1014#1:1129\n1048#1:1133\n1106#1:1142\n1106#1:1145\n1011#1:1122\n1012#1:1125\n1013#1:1128\n1014#1:1131\n1048#1:1135\n1106#1:1144\n1080#1:1136\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a*\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0001\u001a\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0003H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u001e\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u0002H 0\u0011\"\u0004\u0008\u0000\u0010 *\u0008\u0012\u0004\u0012\u0002H 0\u0011H\u0002\u001a\u000c\u0010!\u001a\u00020\u0001*\u00020\u0016H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\""
    }
    d2 = {
        "invertedInfiniteRect",
        "Landroidx/compose/ui/geometry/Rect;",
        "calculateSelectionMagnifierCenterAndroid",
        "Landroidx/compose/ui/geometry/Offset;",
        "manager",
        "Landroidx/compose/foundation/text/selection/SelectionManager;",
        "magnifierSize",
        "Landroidx/compose/ui/unit/IntSize;",
        "calculateSelectionMagnifierCenterAndroid-O0kMr_c",
        "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J",
        "getMagnifierCenter",
        "anchor",
        "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;",
        "getMagnifierCenter-JVtK1S4",
        "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J",
        "getSelectedRegionRect",
        "selectableSubSelectionPairs",
        "",
        "Lkotlin/Pair;",
        "Landroidx/compose/foundation/text/selection/Selectable;",
        "Landroidx/compose/foundation/text/selection/Selection;",
        "containerCoordinates",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "merge",
        "lhs",
        "rhs",
        "containsInclusive",
        "",
        "offset",
        "containsInclusive-Uv8p0NA",
        "(Landroidx/compose/ui/geometry/Rect;J)Z",
        "firstAndLast",
        "T",
        "visibleBounds",
        "foundation_release"
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
.field private static final invertedInfiniteRect:Landroidx/compose/ui/geometry/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 955
    new-instance v0, Landroidx/compose/ui/geometry/Rect;

    .line 956
    nop

    .line 957
    nop

    .line 958
    nop

    .line 959
    nop

    .line 955
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v2, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-direct {v0, v1, v1, v2, v2}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    sput-object v0, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->invertedInfiniteRect:Landroidx/compose/ui/geometry/Rect;

    return-void
.end method

.method public static final synthetic access$firstAndLast(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p0, "$receiver"    # Ljava/util/List;

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->firstAndLast(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getInvertedInfiniteRect$p()Landroidx/compose/ui/geometry/Rect;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->invertedInfiniteRect:Landroidx/compose/ui/geometry/Rect;

    return-object v0
.end method

.method public static final calculateSelectionMagnifierCenterAndroid-O0kMr_c(Landroidx/compose/foundation/text/selection/SelectionManager;J)J
    .locals 3
    .param p0, "manager"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "magnifierSize"    # J

    .line 1023
    nop

    .line 1028
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getSelection()Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v0

    return-wide v0

    .line 1024
    .local v0, "selection":Landroidx/compose/foundation/text/selection/Selection;
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    :cond_1
    sget-object v2, Landroidx/compose/foundation/text/selection/SelectionManagerKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Landroidx/compose/foundation/text/Handle;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 1028
    :pswitch_0
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 1027
    :pswitch_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1028
    const-string v2, "SelectionContainer does not support cursor"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1027
    :pswitch_2
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v1

    invoke-static {p0, p1, p2, v1}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->getMagnifierCenter-JVtK1S4(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J

    move-result-wide v1

    goto :goto_1

    .line 1026
    :pswitch_3
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v1

    invoke-static {p0, p1, p2, v1}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->getMagnifierCenter-JVtK1S4(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J

    move-result-wide v1

    .line 1024
    :goto_1
    return-wide v1

    .line 1025
    :pswitch_4
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v1

    return-wide v1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final containsInclusive-Uv8p0NA(Landroidx/compose/ui/geometry/Rect;J)Z
    .locals 10
    .param p0, "$this$containsInclusive_u2dUv8p0NA"    # Landroidx/compose/ui/geometry/Rect;
    .param p1, "offset"    # J

    .line 1106
    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v1

    const/4 v2, 0x0

    .line 1142
    .local v2, "$i$f$getX-impl":I
    move-wide v3, p1

    .local v3, "value$iv$iv":J
    const/4 v5, 0x0

    .line 1143
    .local v5, "$i$f$unpackFloat1":I
    const/16 v6, 0x20

    shr-long v6, v3, v6

    long-to-int v6, v6

    .local v6, "bits$iv$iv$iv":I
    const/4 v7, 0x0

    .line 1144
    .local v7, "$i$f$floatFromBits":I
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    .line 1143
    .end local v6    # "bits$iv$iv$iv":I
    .end local v7    # "$i$f$floatFromBits":I
    nop

    .line 1142
    .end local v3    # "value$iv$iv":J
    .end local v5    # "$i$f$unpackFloat1":I
    nop

    .line 1106
    .end local v2    # "$i$f$getX-impl":I
    cmpg-float v0, v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gtz v0, :cond_0

    cmpg-float v0, v6, v1

    if-gtz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v1

    const/4 v4, 0x0

    .line 1145
    .local v4, "$i$f$getY-impl":I
    move-wide v5, p1

    .local v5, "value$iv$iv":J
    const/4 v7, 0x0

    .line 1146
    .local v7, "$i$f$unpackFloat2":I
    const-wide v8, 0xffffffffL

    and-long/2addr v8, v5

    long-to-int v8, v8

    .local v8, "bits$iv$iv$iv":I
    const/4 v9, 0x0

    .line 1144
    .local v9, "$i$f$floatFromBits":I
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    .line 1146
    .end local v8    # "bits$iv$iv$iv":I
    .end local v9    # "$i$f$floatFromBits":I
    nop

    .line 1145
    .end local v5    # "value$iv$iv":J
    .end local v7    # "$i$f$unpackFloat2":I
    nop

    .line 1106
    .end local v4    # "$i$f$getY-impl":I
    cmpg-float v0, v0, v8

    if-gtz v0, :cond_1

    cmpg-float v0, v8, v1

    if-gtz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    return v2
.end method

.method private static final firstAndLast(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .param p0, "$this$firstAndLast"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 963
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 966
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 965
    :pswitch_0
    move-object v0, p0

    .line 967
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static final getMagnifierCenter-JVtK1S4(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J
    .locals 23
    .param p0, "manager"    # Landroidx/compose/foundation/text/selection/SelectionManager;
    .param p1, "magnifierSize"    # J
    .param p3, "anchor"    # Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    .line 1037
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionManager;->getAnchorSelectable$foundation_release(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v2

    return-wide v2

    .line 1038
    .local v2, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getContainerLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v3

    if-nez v3, :cond_1

    sget-object v3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v3

    return-wide v3

    .line 1039
    .local v3, "containerCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :cond_1
    invoke-interface {v2}, Landroidx/compose/foundation/text/selection/Selectable;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v4

    if-nez v4, :cond_2

    sget-object v4, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v4

    return-wide v4

    .line 1040
    .local v4, "selectableCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :cond_2
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v5

    .line 1042
    .local v5, "offset":I
    invoke-interface {v2}, Landroidx/compose/foundation/text/selection/Selectable;->getLastVisibleOffset()I

    move-result v6

    if-le v5, v6, :cond_3

    sget-object v6, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v6

    return-wide v6

    .line 1047
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionManager;->getCurrentDragPosition-_m7T9-E()Landroidx/compose/ui/geometry/Offset;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v6

    invoke-interface {v4, v3, v6, v7}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v6

    .line 1046
    nop

    .line 1048
    .local v6, "localDragPosition":J
    const/4 v8, 0x0

    .line 1133
    .local v8, "$i$f$getX-impl":I
    move-wide v9, v6

    .local v9, "value$iv$iv":J
    const/4 v11, 0x0

    .line 1134
    .local v11, "$i$f$unpackFloat1":I
    const/16 v12, 0x20

    shr-long v13, v9, v12

    long-to-int v13, v13

    .local v13, "bits$iv$iv$iv":I
    const/4 v14, 0x0

    .line 1135
    .local v14, "$i$f$floatFromBits":I
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    .line 1134
    .end local v13    # "bits$iv$iv$iv":I
    .end local v14    # "$i$f$floatFromBits":I
    nop

    .line 1133
    .end local v9    # "value$iv$iv":J
    .end local v11    # "$i$f$unpackFloat1":I
    nop

    .line 1048
    .end local v8    # "$i$f$getX-impl":I
    nop

    .line 1051
    .local v13, "dragX":F
    invoke-interface {v2, v5}, Landroidx/compose/foundation/text/selection/Selectable;->getRangeOfLineContaining--jx7JFs(I)J

    move-result-wide v8

    .line 1053
    .local v8, "lineRange":J
    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    move-result v10

    const/4 v11, 0x1

    if-eqz v10, :cond_4

    .line 1056
    invoke-interface {v2, v5}, Landroidx/compose/foundation/text/selection/Selectable;->getLineLeft(I)F

    move-result v10

    goto :goto_0

    .line 1058
    :cond_4
    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    move-result v10

    invoke-interface {v2, v10}, Landroidx/compose/foundation/text/selection/Selectable;->getLineLeft(I)F

    move-result v10

    .line 1059
    .local v10, "lineStartX":F
    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    move-result v14

    sub-int/2addr v14, v11

    invoke-interface {v2, v14}, Landroidx/compose/foundation/text/selection/Selectable;->getLineRight(I)F

    move-result v14

    .line 1061
    .local v14, "lineEndX":F
    invoke-static {v10, v14}, Ljava/lang/Math;->min(FF)F

    move-result v15

    .line 1062
    .local v15, "minX":F
    invoke-static {v10, v14}, Ljava/lang/Math;->max(FF)F

    move-result v11

    .line 1063
    .local v11, "maxX":F
    invoke-static {v13, v15, v11}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v17

    move/from16 v10, v17

    .line 1053
    .end local v10    # "lineStartX":F
    .end local v11    # "maxX":F
    .end local v14    # "lineEndX":F
    .end local v15    # "minX":F
    :goto_0
    nop

    .line 1052
    nop

    .line 1067
    .local v10, "textConstrainedX":F
    const/high16 v11, -0x40800000    # -1.0f

    cmpg-float v14, v10, v11

    const/4 v15, 0x0

    if-nez v14, :cond_5

    const/4 v14, 0x1

    goto :goto_1

    :cond_5
    move v14, v15

    :goto_1
    if-eqz v14, :cond_6

    sget-object v11, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v11

    return-wide v11

    .line 1078
    :cond_6
    nop

    .line 1079
    sget-object v14, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    move/from16 v18, v11

    move/from16 v17, v12

    invoke-virtual {v14}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v11

    move-wide/from16 v0, p1

    invoke-static {v0, v1, v11, v12}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v11

    if-nez v11, :cond_7

    .line 1080
    sub-float v11, v13, v10

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v11

    const/4 v12, 0x0

    .line 1136
    .local v12, "$i$f$getWidth-impl":I
    move-wide/from16 v19, p1

    .local v19, "value$iv$iv":J
    const/4 v14, 0x0

    .line 1137
    .local v14, "$i$f$unpackInt1":I
    shr-long v0, v19, v17

    long-to-int v0, v0

    .line 1136
    .end local v14    # "$i$f$unpackInt1":I
    .end local v19    # "value$iv$iv":J
    nop

    .line 1080
    .end local v12    # "$i$f$getWidth-impl":I
    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    cmpl-float v0, v11, v0

    if-lez v0, :cond_7

    .line 1082
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v0

    return-wide v0

    .line 1085
    :cond_7
    invoke-interface {v2, v5}, Landroidx/compose/foundation/text/selection/Selectable;->getCenterYForOffset(I)F

    move-result v0

    .line 1088
    .local v0, "lineCenterY":F
    cmpg-float v1, v0, v18

    if-nez v1, :cond_8

    const/4 v11, 0x1

    goto :goto_2

    :cond_8
    move v11, v15

    :goto_2
    if-eqz v11, :cond_9

    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    move-result-wide v11

    return-wide v11

    .line 1090
    :cond_9
    nop

    .line 1091
    nop

    .line 1092
    const/4 v1, 0x0

    .line 1138
    .local v1, "$i$f$Offset":I
    const/4 v11, 0x0

    .line 1139
    .local v11, "$i$f$packFloats":I
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    int-to-long v14, v12

    .line 1140
    .local v14, "v1$iv$iv":J
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    move/from16 v16, v0

    move/from16 v18, v1

    .end local v0    # "lineCenterY":F
    .end local v1    # "$i$f$Offset":I
    .local v16, "lineCenterY":F
    .local v18, "$i$f$Offset":I
    int-to-long v0, v12

    .line 1141
    .local v0, "v2$iv$iv":J
    shl-long v19, v14, v17

    const-wide v21, 0xffffffffL

    and-long v21, v0, v21

    or-long v0, v19, v21

    .line 1138
    .end local v0    # "v2$iv$iv":J
    .end local v11    # "$i$f$packFloats":I
    .end local v14    # "v1$iv$iv":J
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v0

    .line 1090
    .end local v18    # "$i$f$Offset":I
    invoke-interface {v3, v4, v0, v1}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final getSelectedRegionRect(Ljava/util/List;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;
    .locals 41
    .param p0, "selectableSubSelectionPairs"    # Ljava/util/List;
    .param p1, "containerCoordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "+",
            "Landroidx/compose/foundation/text/selection/Selectable;",
            "Landroidx/compose/foundation/text/selection/Selection;",
            ">;>;",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            ")",
            "Landroidx/compose/ui/geometry/Rect;"
        }
    .end annotation

    .line 979
    move-object/from16 v0, p1

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->invertedInfiniteRect:Landroidx/compose/ui/geometry/Rect;

    return-object v1

    .line 980
    :cond_0
    sget-object v1, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->invertedInfiniteRect:Landroidx/compose/ui/geometry/Rect;

    const/4 v2, 0x0

    .local v2, "containerLeft":F
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->component1()F

    move-result v2

    const/4 v3, 0x0

    .local v3, "containerTop":F
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->component2()F

    move-result v3

    const/4 v4, 0x0

    .local v4, "containerRight":F
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->component3()F

    move-result v4

    const/4 v5, 0x0

    .local v5, "containerBottom":F
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->component4()F

    move-result v1

    .line 981
    .end local v5    # "containerBottom":F
    .local v1, "containerBottom":F
    move-object/from16 v5, p0

    .local v5, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 1108
    .local v6, "$i$f$fastForEach":I
    nop

    .line 1109
    const/4 v7, 0x0

    .local v7, "index$iv":I
    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_5

    .line 1110
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 1111
    .local v9, "item$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lkotlin/Pair;

    const/4 v11, 0x0

    .line 981
    .local v11, "$i$a$-fastForEach-SelectionManagerKt$getSelectedRegionRect$1":I
    invoke-virtual {v10}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/foundation/text/selection/Selectable;

    .local v12, "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    invoke-virtual {v10}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/foundation/text/selection/Selection;

    .line 982
    .local v10, "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    invoke-virtual {v10}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v13

    invoke-virtual {v13}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v13

    .line 983
    .local v13, "startOffset":I
    invoke-virtual {v10}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    move-result-object v14

    invoke-virtual {v14}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    move-result v14

    .line 984
    .local v14, "endOffset":I
    if-eq v13, v14, :cond_4

    .line 985
    invoke-interface {v12}, Landroidx/compose/foundation/text/selection/Selectable;->getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v15

    if-nez v15, :cond_1

    move-object/from16 v16, v5

    move/from16 v18, v6

    move/from16 v20, v7

    move/from16 v21, v8

    move-object/from16 v22, v9

    goto/16 :goto_3

    .line 987
    .local v15, "localCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    :cond_1
    move-object/from16 v16, v5

    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .local v16, "$this$fastForEach$iv":Ljava/util/List;
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 988
    .local v5, "minOffset":I
    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v17

    .line 990
    .local v17, "maxOffset":I
    move/from16 v18, v6

    .end local v6    # "$i$f$fastForEach":I
    .local v18, "$i$f$fastForEach":I
    add-int/lit8 v6, v17, -0x1

    const/16 v19, 0x0

    move/from16 v20, v7

    .end local v7    # "index$iv":I
    .local v20, "index$iv":I
    const/4 v7, 0x1

    if-ne v5, v6, :cond_2

    .line 991
    new-array v6, v7, [I

    aput v5, v6, v19

    goto :goto_1

    .line 993
    :cond_2
    const/4 v6, 0x2

    new-array v6, v6, [I

    aput v5, v6, v19

    add-int/lit8 v21, v17, -0x1

    aput v21, v6, v7

    .line 990
    :goto_1
    nop

    .line 989
    nop

    .line 995
    .local v6, "offsets":[I
    sget-object v7, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->invertedInfiniteRect:Landroidx/compose/ui/geometry/Rect;

    invoke-virtual {v7}, Landroidx/compose/ui/geometry/Rect;->component1()F

    move-result v21

    .local v21, "left":F
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/Rect;->component2()F

    move-result v22

    .local v22, "top":F
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/Rect;->component3()F

    move-result v23

    .local v23, "right":F
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/Rect;->component4()F

    move-result v7

    .line 996
    .local v7, "bottom":F
    move/from16 v24, v5

    .end local v5    # "minOffset":I
    .local v24, "minOffset":I
    array-length v5, v6

    move/from16 v40, v19

    move-object/from16 v19, v6

    move/from16 v6, v40

    move/from16 v40, v21

    move/from16 v21, v8

    move/from16 v8, v40

    move/from16 v40, v22

    move-object/from16 v22, v9

    move/from16 v9, v40

    move/from16 v40, v23

    move-object/from16 v23, v10

    move/from16 v10, v40

    .end local v6    # "offsets":[I
    .end local v21    # "left":F
    .local v8, "left":F
    .local v9, "top":F
    .local v10, "right":F
    .local v19, "offsets":[I
    .local v22, "item$iv":Ljava/lang/Object;
    .local v23, "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    :goto_2
    if-ge v6, v5, :cond_3

    move/from16 v25, v5

    aget v5, v19, v6

    .line 997
    .local v5, "i":I
    invoke-interface {v12, v5}, Landroidx/compose/foundation/text/selection/Selectable;->getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;

    move-result-object v26

    .line 998
    .local v26, "rect":Landroidx/compose/ui/geometry/Rect;
    move/from16 v27, v5

    .end local v5    # "i":I
    .local v27, "i":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v5

    invoke-static {v8, v5}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 999
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v5

    invoke-static {v9, v5}, Ljava/lang/Math;->min(FF)F

    move-result v9

    .line 1000
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v5

    invoke-static {v10, v5}, Ljava/lang/Math;->max(FF)F

    move-result v10

    .line 1001
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v5

    invoke-static {v7, v5}, Ljava/lang/Math;->max(FF)F

    move-result v7

    .line 996
    .end local v26    # "rect":Landroidx/compose/ui/geometry/Rect;
    .end local v27    # "i":I
    add-int/lit8 v6, v6, 0x1

    move/from16 v5, v25

    goto :goto_2

    .line 1004
    :cond_3
    const/4 v5, 0x0

    .line 1112
    .local v5, "$i$f$Offset":I
    const/4 v6, 0x0

    .line 1113
    .local v6, "$i$f$packFloats":I
    move/from16 v25, v5

    .end local v5    # "$i$f$Offset":I
    .local v25, "$i$f$Offset":I
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    move/from16 v26, v6

    .end local v6    # "$i$f$packFloats":I
    .local v26, "$i$f$packFloats":I
    int-to-long v5, v5

    .line 1114
    .local v5, "v1$iv$iv":J
    move-wide/from16 v27, v5

    .end local v5    # "v1$iv$iv":J
    .local v27, "v1$iv$iv":J
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    .line 1115
    .local v5, "v2$iv$iv":J
    const/16 v29, 0x20

    shl-long v30, v27, v29

    const-wide v32, 0xffffffffL

    and-long v34, v5, v32

    or-long v5, v30, v34

    .line 1112
    .end local v5    # "v2$iv$iv":J
    .end local v26    # "$i$f$packFloats":I
    .end local v27    # "v1$iv$iv":J
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v5

    .line 1004
    .end local v25    # "$i$f$Offset":I
    nop

    .line 1005
    .local v5, "localTopLeft":J
    const/16 v25, 0x0

    .line 1116
    .restart local v25    # "$i$f$Offset":I
    const/16 v26, 0x0

    .line 1117
    .restart local v26    # "$i$f$packFloats":I
    move/from16 v27, v7

    .end local v7    # "bottom":F
    .local v27, "bottom":F
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    move/from16 v28, v8

    .end local v8    # "left":F
    .local v28, "left":F
    int-to-long v7, v7

    .line 1118
    .local v7, "v1$iv$iv":J
    move-wide/from16 v30, v7

    .end local v7    # "v1$iv$iv":J
    .local v30, "v1$iv$iv":J
    invoke-static/range {v27 .. v27}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    .line 1119
    .local v7, "v2$iv$iv":J
    shl-long v34, v30, v29

    and-long v36, v7, v32

    or-long v7, v34, v36

    .line 1116
    .end local v7    # "v2$iv$iv":J
    .end local v26    # "$i$f$packFloats":I
    .end local v30    # "v1$iv$iv":J
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    move-result-wide v7

    .line 1005
    .end local v25    # "$i$f$Offset":I
    nop

    .line 1007
    .local v7, "localBottomRight":J
    invoke-interface {v0, v15, v5, v6}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v25

    .line 1009
    .local v25, "containerTopLeft":J
    invoke-interface {v0, v15, v7, v8}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v30

    .line 1008
    nop

    .line 1011
    .local v30, "containerBottomRight":J
    const/16 v34, 0x0

    .line 1120
    .local v34, "$i$f$getX-impl":I
    move-wide/from16 v35, v25

    .local v35, "value$iv$iv":J
    const/16 v37, 0x0

    .line 1121
    .local v37, "$i$f$unpackFloat1":I
    move-wide/from16 v38, v5

    .end local v5    # "localTopLeft":J
    .local v38, "localTopLeft":J
    shr-long v5, v35, v29

    long-to-int v5, v5

    .local v5, "bits$iv$iv$iv":I
    const/4 v6, 0x0

    .line 1122
    .local v6, "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 1121
    .end local v5    # "bits$iv$iv$iv":I
    .end local v6    # "$i$f$floatFromBits":I
    nop

    .line 1120
    .end local v35    # "value$iv$iv":J
    .end local v37    # "$i$f$unpackFloat1":I
    nop

    .line 1011
    .end local v34    # "$i$f$getX-impl":I
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 1012
    const/4 v5, 0x0

    .line 1123
    .local v5, "$i$f$getY-impl":I
    move-wide/from16 v34, v25

    .local v34, "value$iv$iv":J
    const/4 v6, 0x0

    .line 1124
    .local v6, "$i$f$unpackFloat2":I
    move/from16 v36, v5

    move/from16 v37, v6

    .end local v5    # "$i$f$getY-impl":I
    .end local v6    # "$i$f$unpackFloat2":I
    .local v36, "$i$f$getY-impl":I
    .local v37, "$i$f$unpackFloat2":I
    and-long v5, v34, v32

    long-to-int v5, v5

    .local v5, "bits$iv$iv$iv":I
    const/4 v6, 0x0

    .line 1125
    .local v6, "$i$f$floatFromBits":I
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 1124
    .end local v5    # "bits$iv$iv$iv":I
    .end local v6    # "$i$f$floatFromBits":I
    nop

    .line 1123
    .end local v34    # "value$iv$iv":J
    .end local v37    # "$i$f$unpackFloat2":I
    nop

    .line 1012
    .end local v36    # "$i$f$getY-impl":I
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v3

    .line 1013
    const/4 v5, 0x0

    .line 1126
    .local v5, "$i$f$getX-impl":I
    move-wide/from16 v34, v30

    .restart local v34    # "value$iv$iv":J
    const/4 v6, 0x0

    .line 1127
    .local v6, "$i$f$unpackFloat1":I
    move/from16 v36, v2

    move/from16 v37, v3

    .end local v2    # "containerLeft":F
    .end local v3    # "containerTop":F
    .local v36, "containerLeft":F
    .local v37, "containerTop":F
    shr-long v2, v34, v29

    long-to-int v2, v2

    .local v2, "bits$iv$iv$iv":I
    const/4 v3, 0x0

    .line 1128
    .local v3, "$i$f$floatFromBits":I
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 1127
    .end local v2    # "bits$iv$iv$iv":I
    .end local v3    # "$i$f$floatFromBits":I
    nop

    .line 1126
    .end local v6    # "$i$f$unpackFloat1":I
    .end local v34    # "value$iv$iv":J
    nop

    .line 1013
    .end local v5    # "$i$f$getX-impl":I
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 1014
    .end local v4    # "containerRight":F
    .local v2, "containerRight":F
    const/4 v3, 0x0

    .line 1129
    .local v3, "$i$f$getY-impl":I
    move-wide/from16 v4, v30

    .local v4, "value$iv$iv":J
    const/4 v6, 0x0

    .line 1130
    .local v6, "$i$f$unpackFloat2":I
    move/from16 v29, v2

    move/from16 v34, v3

    .end local v2    # "containerRight":F
    .end local v3    # "$i$f$getY-impl":I
    .local v29, "containerRight":F
    .local v34, "$i$f$getY-impl":I
    and-long v2, v4, v32

    long-to-int v2, v2

    .local v2, "bits$iv$iv$iv":I
    const/4 v3, 0x0

    .line 1131
    .local v3, "$i$f$floatFromBits":I
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 1130
    .end local v2    # "bits$iv$iv$iv":I
    .end local v3    # "$i$f$floatFromBits":I
    nop

    .line 1129
    .end local v4    # "value$iv$iv":J
    .end local v6    # "$i$f$unpackFloat2":I
    nop

    .line 1014
    .end local v34    # "$i$f$getY-impl":I
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 1015
    move/from16 v4, v29

    move/from16 v2, v36

    move/from16 v3, v37

    goto :goto_3

    .line 984
    .end local v15    # "localCoordinates":Landroidx/compose/ui/layout/LayoutCoordinates;
    .end local v16    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v17    # "maxOffset":I
    .end local v18    # "$i$f$fastForEach":I
    .end local v19    # "offsets":[I
    .end local v20    # "index$iv":I
    .end local v22    # "item$iv":Ljava/lang/Object;
    .end local v23    # "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v24    # "minOffset":I
    .end local v25    # "containerTopLeft":J
    .end local v27    # "bottom":F
    .end local v28    # "left":F
    .end local v29    # "containerRight":F
    .end local v30    # "containerBottomRight":J
    .end local v36    # "containerLeft":F
    .end local v37    # "containerTop":F
    .end local v38    # "localTopLeft":J
    .local v2, "containerLeft":F
    .local v3, "containerTop":F
    .local v4, "containerRight":F
    .local v5, "$this$fastForEach$iv":Ljava/util/List;
    .local v6, "$i$f$fastForEach":I
    .local v7, "index$iv":I
    .local v9, "item$iv":Ljava/lang/Object;
    .local v10, "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    :cond_4
    move-object/from16 v16, v5

    move/from16 v18, v6

    move/from16 v20, v7

    move/from16 v21, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    .line 1111
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    .end local v7    # "index$iv":I
    .end local v9    # "item$iv":Ljava/lang/Object;
    .end local v10    # "subSelection":Landroidx/compose/foundation/text/selection/Selection;
    .end local v11    # "$i$a$-fastForEach-SelectionManagerKt$getSelectedRegionRect$1":I
    .end local v12    # "selectable":Landroidx/compose/foundation/text/selection/Selectable;
    .end local v13    # "startOffset":I
    .end local v14    # "endOffset":I
    .restart local v16    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v18    # "$i$f$fastForEach":I
    .restart local v20    # "index$iv":I
    .restart local v22    # "item$iv":Ljava/lang/Object;
    :goto_3
    nop

    .line 1109
    .end local v22    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v20, 0x1

    move-object/from16 v5, v16

    move/from16 v6, v18

    move/from16 v8, v21

    .end local v20    # "index$iv":I
    .restart local v7    # "index$iv":I
    goto/16 :goto_0

    .end local v16    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v18    # "$i$f$fastForEach":I
    .restart local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastForEach":I
    :cond_5
    move-object/from16 v16, v5

    .line 1132
    .end local v5    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v7    # "index$iv":I
    .restart local v16    # "$this$fastForEach$iv":Ljava/util/List;
    nop

    .line 1016
    .end local v6    # "$i$f$fastForEach":I
    .end local v16    # "$this$fastForEach$iv":Ljava/util/List;
    new-instance v5, Landroidx/compose/ui/geometry/Rect;

    invoke-direct {v5, v2, v3, v4, v1}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    return-object v5
.end method

.method public static final merge(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/Selection;)Landroidx/compose/foundation/text/selection/Selection;
    .locals 1
    .param p0, "lhs"    # Landroidx/compose/foundation/text/selection/Selection;
    .param p1, "rhs"    # Landroidx/compose/foundation/text/selection/Selection;

    .line 947
    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/Selection;->merge(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/compose/foundation/text/selection/Selection;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p1

    :cond_1
    return-object v0
.end method

.method public static final visibleBounds(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;
    .locals 5
    .param p0, "$this$visibleBounds"    # Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 1101
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->boundsInWindow(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    .line 1102
    .local v0, "boundsInWindow":Landroidx/compose/ui/geometry/Rect;
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    move-result-wide v1

    invoke-interface {p0, v1, v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->windowToLocal-MK-Hz9U(J)J

    move-result-wide v1

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getBottomRight-F1C5BW0()J

    move-result-wide v3

    invoke-interface {p0, v3, v4}, Landroidx/compose/ui/layout/LayoutCoordinates;->windowToLocal-MK-Hz9U(J)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/geometry/RectKt;->Rect-0a9Yr6o(JJ)Landroidx/compose/ui/geometry/Rect;

    move-result-object v1

    return-object v1
.end method
