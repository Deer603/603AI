.class public final Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
.super Ljava/lang/Object;
.source "LazyListMeasuredItem.kt"

# interfaces
.implements Landroidx/compose/foundation/lazy/LazyListItemInfo;
.implements Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,264:1\n260#1:292\n260#1:300\n34#2,6:265\n70#2,4:271\n75#2:289\n107#3,7:275\n107#3,7:282\n96#3,5:295\n32#4:290\n32#4:293\n32#4:301\n32#4:303\n80#5:291\n80#5:294\n80#5:302\n80#5:304\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n183#1:292\n229#1:300\n97#1:265,6\n129#1:271,4\n129#1:289\n133#1:275,7\n142#1:282,7\n191#1:295,5\n163#1:290\n183#1:293\n229#1:301\n260#1:303\n163#1:291\n183#1:294\n229#1:302\n260#1:304\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u0015\n\u0002\u0008\r\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\tJ\u001d\u00106\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008I\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\tJ\u001e\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004J(\u0010P\u001a\u00020F2\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004H\u0016J\u000e\u0010U\u001a\u00020F2\u0006\u0010+\u001a\u00020\u0004J+\u0010V\u001a\u00020\u0015*\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040XH\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008Y\u0010ZR\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u00020\u001cX\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010#\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010%R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\'R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\"R\u0014\u0010)\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010%R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010%R\u000e\u0010.\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00081\u0010\'\"\u0004\u00082\u00103R\u001e\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010%R\u000e\u00107\u001a\u000208X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010%R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010%R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010%R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010 R\u0018\u0010?\u001a\u00020\u0004*\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010AR\u0018\u0010B\u001a\u00020\u0004*\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010D\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006["
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
        "Landroidx/compose/foundation/lazy/LazyListItemInfo;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;",
        "index",
        "",
        "placeables",
        "",
        "Landroidx/compose/ui/layout/Placeable;",
        "isVertical",
        "",
        "horizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "verticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "reverseLayout",
        "beforeContentPadding",
        "afterContentPadding",
        "spacing",
        "visualOffset",
        "Landroidx/compose/ui/unit/IntOffset;",
        "key",
        "",
        "contentType",
        "animator",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getConstraints-msEJaDk",
        "()J",
        "J",
        "getContentType",
        "()Ljava/lang/Object;",
        "crossAxisSize",
        "getCrossAxisSize",
        "()I",
        "getIndex",
        "()Z",
        "getKey",
        "lane",
        "getLane",
        "mainAxisLayoutSize",
        "mainAxisSizeWithSpacings",
        "getMainAxisSizeWithSpacings",
        "maxMainAxisOffset",
        "minMainAxisOffset",
        "nonScrollableItem",
        "getNonScrollableItem",
        "setNonScrollableItem",
        "(Z)V",
        "<set-?>",
        "offset",
        "getOffset",
        "placeableOffsets",
        "",
        "placeablesCount",
        "getPlaceablesCount",
        "size",
        "getSize",
        "span",
        "getSpan",
        "mainAxis",
        "getMainAxis--gyyYBs",
        "(J)I",
        "mainAxisSize",
        "getMainAxisSize",
        "(Landroidx/compose/ui/layout/Placeable;)I",
        "applyScrollDelta",
        "",
        "delta",
        "updateAnimations",
        "getOffset-Bjo55l4",
        "(I)J",
        "getParentData",
        "place",
        "scope",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "isLookingAhead",
        "position",
        "mainAxisOffset",
        "layoutWidth",
        "layoutHeight",
        "crossAxisOffset",
        "updateMainAxisLayoutSize",
        "copy",
        "mainAxisMap",
        "Lkotlin/Function1;",
        "copy-4Tuh3kE",
        "(JLkotlin/jvm/functions/Function1;)J",
        "foundation_release"
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
.field private final afterContentPadding:I

.field private final animator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation
.end field

.field private final beforeContentPadding:I

.field private final constraints:J

.field private final contentType:Ljava/lang/Object;

.field private final crossAxisSize:I

.field private final horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

.field private final index:I

.field private final isVertical:Z

.field private final key:Ljava/lang/Object;

.field private final lane:I

.field private final layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

.field private mainAxisLayoutSize:I

.field private final mainAxisSizeWithSpacings:I

.field private maxMainAxisOffset:I

.field private minMainAxisOffset:I

.field private nonScrollableItem:Z

.field private offset:I

.field private final placeableOffsets:[I

.field private final placeables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation
.end field

.field private final reverseLayout:Z

.field private final size:I

.field private final spacing:I

.field private final span:I

.field private final verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

.field private final visualOffset:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->$stable:I

    return-void
.end method

.method private constructor <init>(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;J)V
    .locals 22
    .param p1, "index"    # I
    .param p2, "placeables"    # Ljava/util/List;
    .param p3, "isVertical"    # Z
    .param p4, "horizontalAlignment"    # Landroidx/compose/ui/Alignment$Horizontal;
    .param p5, "verticalAlignment"    # Landroidx/compose/ui/Alignment$Vertical;
    .param p6, "layoutDirection"    # Landroidx/compose/ui/unit/LayoutDirection;
    .param p7, "reverseLayout"    # Z
    .param p8, "beforeContentPadding"    # I
    .param p9, "afterContentPadding"    # I
    .param p10, "spacing"    # I
    .param p11, "visualOffset"    # J
    .param p13, "key"    # Ljava/lang/Object;
    .param p14, "contentType"    # Ljava/lang/Object;
    .param p15, "animator"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .param p16, "constraints"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;Z",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "ZIIIJ",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;J)V"
        }
    .end annotation

    .line 37
    move-object/from16 v0, p0

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    move/from16 v1, p1

    iput v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->index:I

    .line 40
    move-object/from16 v2, p2

    iput-object v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeables:Ljava/util/List;

    .line 41
    move/from16 v3, p3

    iput-boolean v3, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical:Z

    .line 42
    move-object/from16 v4, p4

    iput-object v4, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    .line 43
    move-object/from16 v5, p5

    iput-object v5, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    .line 44
    move-object/from16 v6, p6

    iput-object v6, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 45
    move/from16 v7, p7

    iput-boolean v7, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->reverseLayout:Z

    .line 46
    move/from16 v8, p8

    iput v8, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->beforeContentPadding:I

    .line 47
    move/from16 v9, p9

    iput v9, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->afterContentPadding:I

    .line 52
    move/from16 v10, p10

    iput v10, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->spacing:I

    .line 57
    move-wide/from16 v11, p11

    iput-wide v11, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->visualOffset:J

    .line 58
    move-object/from16 v13, p13

    iput-object v13, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->key:Ljava/lang/Object;

    .line 59
    move-object/from16 v14, p14

    iput-object v14, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->contentType:Ljava/lang/Object;

    .line 60
    move-object/from16 v15, p15

    iput-object v15, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->animator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 61
    move-wide/from16 v1, p16

    iput-wide v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->constraints:J

    .line 72
    const/4 v1, 0x1

    iput v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->span:I

    .line 86
    const/high16 v1, -0x80000000

    iput v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->mainAxisLayoutSize:I

    .line 94
    nop

    .line 95
    const/4 v1, 0x0

    .line 96
    .local v1, "mainAxisSize":I
    const/4 v2, 0x0

    .line 97
    .local v2, "maxCrossAxis":I
    move/from16 v16, v1

    .end local v1    # "mainAxisSize":I
    .local v16, "mainAxisSize":I
    iget-object v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeables:Ljava/util/List;

    .local v1, "$this$fastForEach$iv":Ljava/util/List;
    const/16 v17, 0x0

    .line 265
    .local v17, "$i$f$fastForEach":I
    nop

    .line 266
    const/16 v18, 0x0

    .local v18, "index$iv":I
    move-object/from16 v19, v1

    check-cast v19, Ljava/util/Collection;

    move/from16 v20, v2

    .end local v2    # "maxCrossAxis":I
    .local v20, "maxCrossAxis":I
    invoke-interface/range {v19 .. v19}, Ljava/util/Collection;->size()I

    move-result v2

    move/from16 v3, v16

    move/from16 v5, v18

    move/from16 v4, v20

    .end local v16    # "mainAxisSize":I
    .end local v18    # "index$iv":I
    .end local v20    # "maxCrossAxis":I
    .local v3, "mainAxisSize":I
    .local v4, "maxCrossAxis":I
    .local v5, "index$iv":I
    :goto_0
    if-ge v5, v2, :cond_2

    .line 267
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 268
    .local v16, "item$iv":Ljava/lang/Object;
    move-object/from16 v18, v16

    check-cast v18, Landroidx/compose/ui/layout/Placeable;

    .local v18, "it":Landroidx/compose/ui/layout/Placeable;
    const/16 v19, 0x0

    .line 98
    .local v19, "$i$a$-fastForEach-LazyListMeasuredItem$1":I
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v20

    if-eqz v20, :cond_0

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v20

    goto :goto_1

    :cond_0
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v20

    :goto_1
    add-int v3, v3, v20

    .line 99
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v20

    if-nez v20, :cond_1

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v20

    goto :goto_2

    :cond_1
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v20

    :goto_2
    move-object/from16 v21, v1

    move/from16 v1, v20

    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .local v21, "$this$fastForEach$iv":Ljava/util/List;
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 100
    nop

    .line 268
    .end local v18    # "it":Landroidx/compose/ui/layout/Placeable;
    .end local v19    # "$i$a$-fastForEach-LazyListMeasuredItem$1":I
    nop

    .line 266
    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, v21

    goto :goto_0

    .end local v21    # "$this$fastForEach$iv":Ljava/util/List;
    .restart local v1    # "$this$fastForEach$iv":Ljava/util/List;
    :cond_2
    move-object/from16 v21, v1

    .line 270
    .end local v1    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v5    # "index$iv":I
    .restart local v21    # "$this$fastForEach$iv":Ljava/util/List;
    nop

    .line 101
    .end local v17    # "$i$f$fastForEach":I
    .end local v21    # "$this$fastForEach$iv":Ljava/util/List;
    iput v3, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->size:I

    .line 102
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSize()I

    move-result v1

    iget v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->spacing:I

    add-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    iput v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->mainAxisSizeWithSpacings:I

    .line 103
    iput v4, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->crossAxisSize:I

    .line 104
    iget-object v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeables:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [I

    iput-object v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeableOffsets:[I

    .line 105
    .end local v3    # "mainAxisSize":I
    .end local v4    # "maxCrossAxis":I
    nop

    .line 38
    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p17}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;-><init>(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;J)V

    return-void
.end method

.method private final copy-4Tuh3kE(JLkotlin/jvm/functions/Function1;)J
    .locals 12
    .param p1, "$this$copy_u2d4Tuh3kE"    # J
    .param p3, "mainAxisMap"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)J"
        }
    .end annotation

    const/4 v0, 0x0

    .line 260
    .local v0, "$i$f$copy-4Tuh3kE":I
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v1

    const-wide v2, 0xffffffffL

    const/16 v4, 0x20

    if-eqz v1, :cond_0

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v1

    .local v1, "x$iv":I
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {p3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .local v5, "y$iv":I
    const/4 v6, 0x0

    .line 303
    .local v6, "$i$f$IntOffset":I
    const/4 v7, 0x0

    .line 304
    .local v7, "$i$f$packInts":I
    int-to-long v8, v1

    shl-long/2addr v8, v4

    int-to-long v10, v5

    and-long/2addr v2, v10

    or-long/2addr v2, v8

    .line 303
    .end local v7    # "$i$f$packInts":I
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v1

    .end local v1    # "x$iv":I
    .end local v5    # "y$iv":I
    .end local v6    # "$i$f$IntOffset":I
    goto :goto_0

    .line 260
    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .restart local v1    # "x$iv":I
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v5

    .restart local v5    # "y$iv":I
    const/4 v6, 0x0

    .line 303
    .restart local v6    # "$i$f$IntOffset":I
    const/4 v7, 0x0

    .line 304
    .restart local v7    # "$i$f$packInts":I
    int-to-long v8, v1

    shl-long/2addr v8, v4

    int-to-long v10, v5

    and-long/2addr v2, v10

    or-long/2addr v2, v8

    .line 303
    .end local v7    # "$i$f$packInts":I
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v2

    move-wide v1, v2

    .line 260
    .end local v1    # "x$iv":I
    .end local v5    # "y$iv":I
    .end local v6    # "$i$f$IntOffset":I
    :goto_0
    return-wide v1
.end method

.method private final getMainAxis--gyyYBs(J)I
    .locals 1
    .param p1, "$this$mainAxis"    # J

    .line 254
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v0

    :goto_0
    return v0
.end method

.method private final getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I
    .locals 1
    .param p1, "$this$mainAxisSize"    # Landroidx/compose/ui/layout/Placeable;

    .line 257
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v0

    :goto_0
    return v0
.end method


# virtual methods
.method public final applyScrollDelta(IZ)V
    .locals 20
    .param p1, "delta"    # I
    .param p2, "updateAnimations"    # Z

    .line 166
    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getNonScrollableItem()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 167
    return-void

    .line 169
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getOffset()I

    move-result v1

    add-int v1, v1, p1

    iput v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->offset:I

    .line 170
    iget-object v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeableOffsets:[I

    array-length v1, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    move v4, v3

    .local v4, "index":I
    const/4 v5, 0x0

    .line 174
    .local v5, "$i$a$-repeat-LazyListMeasuredItem$applyScrollDelta$1":I
    and-int/lit8 v6, v4, 0x1

    .line 175
    .local v6, "oddEven":I
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v7

    if-eqz v7, :cond_1

    if-nez v6, :cond_2

    :cond_1
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v7

    if-nez v7, :cond_3

    if-nez v6, :cond_3

    .line 176
    :cond_2
    iget-object v7, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeableOffsets:[I

    aget v8, v7, v4

    add-int v8, v8, p1

    aput v8, v7, v4

    .line 178
    :cond_3
    nop

    .line 170
    .end local v4    # "index":I
    .end local v5    # "$i$a$-repeat-LazyListMeasuredItem$applyScrollDelta$1":I
    .end local v6    # "oddEven":I
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 179
    :cond_4
    if-eqz p2, :cond_7

    .line 180
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getPlaceablesCount()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_7

    move v3, v2

    .local v3, "index":I
    const/4 v4, 0x0

    .line 181
    .local v4, "$i$a$-repeat-LazyListMeasuredItem$applyScrollDelta$2":I
    iget-object v5, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->animator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getAnimation(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v5

    .line 182
    .local v5, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    if-eqz v5, :cond_6

    .line 183
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    move-result-wide v6

    .local v6, "$this$copy_u2d4Tuh3kE$iv":J
    move-object/from16 v8, p0

    .local v8, "this_$iv":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/4 v9, 0x0

    .line 292
    .local v9, "$i$f$copy-4Tuh3kE":I
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v10

    const/16 v13, 0x20

    if-eqz v10, :cond_5

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v10

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v14

    .local v14, "mainAxis":I
    const/4 v15, 0x0

    .line 183
    .local v15, "$i$a$-copy-4Tuh3kE-LazyListMeasuredItem$applyScrollDelta$2$1":I
    add-int v14, v14, p1

    .end local v14    # "mainAxis":I
    .end local v15    # "$i$a$-copy-4Tuh3kE-LazyListMeasuredItem$applyScrollDelta$2$1":I
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 292
    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v14

    .local v10, "x$iv$iv":I
    .local v14, "y$iv$iv":I
    const/4 v15, 0x0

    .line 293
    .local v15, "$i$f$IntOffset":I
    const/16 v16, 0x0

    .line 294
    .local v16, "$i$f$packInts":I
    const-wide v17, 0xffffffffL

    int-to-long v11, v10

    shl-long/2addr v11, v13

    move/from16 v19, v1

    int-to-long v0, v14

    and-long v0, v0, v17

    or-long/2addr v0, v11

    .line 293
    .end local v16    # "$i$f$packInts":I
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v0

    .end local v10    # "x$iv$iv":I
    .end local v14    # "y$iv$iv":I
    .end local v15    # "$i$f$IntOffset":I
    goto :goto_2

    .line 292
    :cond_5
    move/from16 v19, v1

    const-wide v17, 0xffffffffL

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v0

    .local v0, "mainAxis":I
    const/4 v1, 0x0

    .line 183
    .local v1, "$i$a$-copy-4Tuh3kE-LazyListMeasuredItem$applyScrollDelta$2$1":I
    add-int v0, v0, p1

    .end local v0    # "mainAxis":I
    .end local v1    # "$i$a$-copy-4Tuh3kE-LazyListMeasuredItem$applyScrollDelta$2$1":I
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 292
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .local v0, "x$iv$iv":I
    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    .local v1, "y$iv$iv":I
    const/4 v10, 0x0

    .line 293
    .local v10, "$i$f$IntOffset":I
    const/4 v11, 0x0

    .line 294
    .local v11, "$i$f$packInts":I
    int-to-long v14, v0

    shl-long v12, v14, v13

    int-to-long v14, v1

    and-long v14, v14, v17

    or-long v11, v12, v14

    .line 293
    .end local v11    # "$i$f$packInts":I
    invoke-static {v11, v12}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v11

    move-wide v0, v11

    .line 292
    .end local v0    # "x$iv$iv":I
    .end local v1    # "y$iv$iv":I
    .end local v10    # "$i$f$IntOffset":I
    :goto_2
    nop

    .line 183
    .end local v6    # "$this$copy_u2d4Tuh3kE$iv":J
    .end local v8    # "this_$iv":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v9    # "$i$f$copy-4Tuh3kE":I
    invoke-virtual {v5, v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setRawOffset--gyyYBs(J)V

    goto :goto_3

    .line 182
    :cond_6
    move/from16 v19, v1

    .line 185
    :goto_3
    nop

    .line 180
    .end local v3    # "index":I
    .end local v4    # "$i$a$-repeat-LazyListMeasuredItem$applyScrollDelta$2":I
    .end local v5    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v19

    goto/16 :goto_1

    .line 187
    :cond_7
    return-void
.end method

.method public getConstraints-msEJaDk()J
    .locals 2

    .line 61
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->constraints:J

    return-wide v0
.end method

.method public getContentType()Ljava/lang/Object;
    .locals 1

    .line 59
    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->contentType:Ljava/lang/Object;

    return-object v0
.end method

.method public final getCrossAxisSize()I
    .locals 1

    .line 78
    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->crossAxisSize:I

    return v0
.end method

.method public getIndex()I
    .locals 1

    .line 39
    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->index:I

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    .line 58
    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->key:Ljava/lang/Object;

    return-object v0
.end method

.method public getLane()I
    .locals 1

    .line 70
    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->lane:I

    return v0
.end method

.method public getMainAxisSizeWithSpacings()I
    .locals 1

    .line 75
    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->mainAxisSizeWithSpacings:I

    return v0
.end method

.method public getNonScrollableItem()Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->nonScrollableItem:Z

    return v0
.end method

.method public getOffset()I
    .locals 1

    .line 63
    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->offset:I

    return v0
.end method

.method public getOffset-Bjo55l4(I)J
    .locals 10
    .param p1, "index"    # I

    .line 163
    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeableOffsets:[I

    mul-int/lit8 v1, p1, 0x2

    aget v0, v0, v1

    .local v0, "x$iv":I
    iget-object v1, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeableOffsets:[I

    mul-int/lit8 v2, p1, 0x2

    add-int/lit8 v2, v2, 0x1

    aget v1, v1, v2

    .local v1, "y$iv":I
    const/4 v2, 0x0

    .line 290
    .local v2, "$i$f$IntOffset":I
    const/4 v3, 0x0

    .line 291
    .local v3, "$i$f$packInts":I
    int-to-long v4, v0

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    int-to-long v6, v1

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    or-long v3, v4, v6

    .line 290
    .end local v3    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v0

    .line 163
    .end local v0    # "x$iv":I
    .end local v1    # "y$iv":I
    .end local v2    # "$i$f$IntOffset":I
    return-wide v0
.end method

.method public getParentData(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I

    .line 110
    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeables:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/Placeable;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/Placeable;->getParentData()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getPlaceablesCount()I
    .locals 1

    .line 108
    iget-object v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeables:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getSize()I
    .locals 1

    .line 67
    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->size:I

    return v0
.end method

.method public getSpan()I
    .locals 1

    .line 72
    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->span:I

    return v0
.end method

.method public isVertical()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical:Z

    return v0
.end method

.method public final place(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z)V
    .locals 29
    .param p1, "scope"    # Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .param p2, "isLookingAhead"    # Z

    .line 190
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .local v1, "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    const/4 v9, 0x0

    .line 191
    .local v9, "$i$a$-with-LazyListMeasuredItem$place$1":I
    iget v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->mainAxisLayoutSize:I

    const/high16 v3, -0x80000000

    const/4 v4, 0x0

    if-eq v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v4

    .local v2, "value$iv":Z
    :goto_0
    const/4 v3, 0x0

    .line 295
    .local v3, "$i$f$requirePrecondition":I
    nop

    .line 296
    if-nez v2, :cond_1

    .line 297
    const/4 v5, 0x0

    .line 191
    .local v5, "$i$a$-requirePrecondition-LazyListMeasuredItem$place$1$1":I
    nop

    .line 297
    .end local v5    # "$i$a$-requirePrecondition-LazyListMeasuredItem$place$1$1":I
    const-string/jumbo v5, "position() should be called first"

    invoke-static {v5}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 299
    :cond_1
    nop

    .line 192
    .end local v2    # "value$iv":Z
    .end local v3    # "$i$f$requirePrecondition":I
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getPlaceablesCount()I

    move-result v10

    move v11, v4

    :goto_1
    if-ge v11, v10, :cond_f

    move v12, v11

    .local v12, "index":I
    const/4 v13, 0x0

    .line 193
    .local v13, "$i$a$-repeat-LazyListMeasuredItem$place$1$2":I
    iget-object v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeables:Ljava/util/List;

    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/layout/Placeable;

    .line 194
    .local v2, "placeable":Landroidx/compose/ui/layout/Placeable;
    iget v3, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->minMainAxisOffset:I

    invoke-direct {v0, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result v4

    sub-int v14, v3, v4

    .line 195
    .local v14, "minOffset":I
    iget v15, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->maxMainAxisOffset:I

    .line 196
    .local v15, "maxOffset":I
    invoke-virtual {v0, v12}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getOffset-Bjo55l4(I)J

    move-result-wide v3

    .line 197
    .local v3, "offset":J
    iget-object v5, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->animator:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6, v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getAnimation(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v5

    .line 198
    .local v5, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/4 v6, 0x0

    .line 199
    .local v6, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    if-eqz v5, :cond_7

    .line 200
    if-eqz p2, :cond_2

    .line 202
    invoke-virtual {v5, v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setLookaheadOffset--gyyYBs(J)V

    move-object/from16 v16, v1

    goto :goto_3

    .line 205
    :cond_2
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLookaheadOffset-nOcc-ac()J

    move-result-wide v7

    sget-object v16, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->Companion:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;

    move-wide/from16 v17, v3

    .end local v3    # "offset":J
    .local v17, "offset":J
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;->getNotInitialized-nOcc-ac()J

    move-result-wide v3

    invoke-static {v7, v8, v3, v4}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v3

    if-nez v3, :cond_3

    .line 206
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLookaheadOffset-nOcc-ac()J

    move-result-wide v3

    goto :goto_2

    .line 208
    :cond_3
    move-wide/from16 v3, v17

    .line 205
    :goto_2
    nop

    .line 204
    nop

    .line 210
    .local v3, "targetOffset":J
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getPlacementDelta-nOcc-ac()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    move-result-wide v7

    .line 213
    .local v7, "animatedOffset":J
    nop

    .line 214
    move-object/from16 v16, v1

    .end local v1    # "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .local v16, "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    invoke-direct {v0, v3, v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-gt v1, v14, :cond_4

    .line 215
    invoke-direct {v0, v7, v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-le v1, v14, :cond_5

    .line 216
    :cond_4
    invoke-direct {v0, v3, v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-lt v1, v15, :cond_6

    .line 217
    invoke-direct {v0, v7, v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxis--gyyYBs(J)I

    move-result v1

    if-lt v1, v15, :cond_6

    .line 219
    :cond_5
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->cancelPlacementAnimation()V

    .line 221
    :cond_6
    move-wide/from16 v17, v7

    move-wide/from16 v3, v17

    .line 223
    .end local v7    # "animatedOffset":J
    .end local v17    # "offset":J
    .local v3, "offset":J
    :goto_3
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    move-result-object v1

    .end local v6    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v1, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    goto :goto_4

    .line 225
    .end local v16    # "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .local v1, "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v6    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    :cond_7
    move-object/from16 v16, v1

    move-wide/from16 v17, v3

    .end local v1    # "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v3    # "offset":J
    .restart local v16    # "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v17    # "offset":J
    const/4 v1, 0x0

    .line 227
    .end local v6    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v17    # "offset":J
    .local v1, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v3    # "offset":J
    :goto_4
    iget-boolean v6, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->reverseLayout:Z

    if-eqz v6, :cond_9

    .line 229
    move-wide v6, v3

    .local v6, "$this$copy_u2d4Tuh3kE$iv":J
    move-object/from16 v8, p0

    .local v8, "this_$iv":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    const/16 v17, 0x0

    .line 300
    .local v17, "$i$f$copy-4Tuh3kE":I
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v18

    const-wide v19, 0xffffffffL

    const/16 v21, 0x20

    if-eqz v18, :cond_8

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v18

    invoke-static {v6, v7}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v22

    .local v22, "mainAxisOffset":I
    const/16 v23, 0x0

    .line 230
    .local v23, "$i$a$-copy-4Tuh3kE-LazyListMeasuredItem$place$1$2$1":I
    move-object/from16 v24, v1

    .end local v1    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v24, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    iget v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->mainAxisLayoutSize:I

    sub-int v1, v1, v22

    invoke-direct {v0, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result v25

    sub-int v1, v1, v25

    .line 300
    .end local v22    # "mainAxisOffset":I
    .end local v23    # "$i$a$-copy-4Tuh3kE-LazyListMeasuredItem$place$1$2$1":I
    nop

    .local v1, "y$iv$iv":I
    move/from16 v22, v18

    .local v22, "x$iv$iv":I
    const/16 v18, 0x0

    .line 301
    .local v18, "$i$f$IntOffset":I
    const/16 v23, 0x0

    .line 302
    .local v23, "$i$f$packInts":I
    move-wide/from16 v25, v3

    move-wide/from16 v27, v6

    move/from16 v3, v22

    .end local v6    # "$this$copy_u2d4Tuh3kE$iv":J
    .end local v22    # "x$iv$iv":I
    .local v3, "x$iv$iv":I
    .local v25, "offset":J
    .local v27, "$this$copy_u2d4Tuh3kE$iv":J
    int-to-long v6, v3

    shl-long v6, v6, v21

    .end local v3    # "x$iv$iv":I
    .restart local v22    # "x$iv$iv":I
    int-to-long v3, v1

    and-long v3, v3, v19

    or-long/2addr v3, v6

    .line 301
    .end local v23    # "$i$f$packInts":I
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v3

    move-object v7, v2

    .end local v1    # "y$iv$iv":I
    .end local v18    # "$i$f$IntOffset":I
    .end local v22    # "x$iv$iv":I
    goto :goto_5

    .line 300
    .end local v24    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v25    # "offset":J
    .end local v27    # "$this$copy_u2d4Tuh3kE$iv":J
    .local v1, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v3, "offset":J
    .restart local v6    # "$this$copy_u2d4Tuh3kE$iv":J
    :cond_8
    move-object/from16 v24, v1

    move-wide/from16 v25, v3

    move-wide/from16 v27, v6

    .end local v1    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v3    # "offset":J
    .end local v6    # "$this$copy_u2d4Tuh3kE$iv":J
    .restart local v24    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v25    # "offset":J
    .restart local v27    # "$this$copy_u2d4Tuh3kE$iv":J
    invoke-static/range {v27 .. v28}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v1

    .local v1, "mainAxisOffset":I
    const/4 v3, 0x0

    .line 230
    .local v3, "$i$a$-copy-4Tuh3kE-LazyListMeasuredItem$place$1$2$1":I
    iget v4, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->mainAxisLayoutSize:I

    sub-int/2addr v4, v1

    invoke-direct {v0, v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    move-result v6

    sub-int/2addr v4, v6

    .line 300
    .end local v1    # "mainAxisOffset":I
    .end local v3    # "$i$a$-copy-4Tuh3kE-LazyListMeasuredItem$place$1$2$1":I
    invoke-static/range {v27 .. v28}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    .local v1, "y$iv$iv":I
    .local v4, "x$iv$iv":I
    const/4 v3, 0x0

    .line 301
    .local v3, "$i$f$IntOffset":I
    const/4 v6, 0x0

    .line 302
    .local v6, "$i$f$packInts":I
    move-object v7, v2

    move/from16 v18, v3

    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v3    # "$i$f$IntOffset":I
    .local v7, "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v18    # "$i$f$IntOffset":I
    int-to-long v2, v4

    shl-long v2, v2, v21

    move-wide/from16 v21, v2

    int-to-long v2, v1

    and-long v2, v2, v19

    or-long v2, v21, v2

    .line 301
    .end local v6    # "$i$f$packInts":I
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v2

    move-wide v3, v2

    .line 300
    .end local v1    # "y$iv$iv":I
    .end local v4    # "x$iv$iv":I
    .end local v18    # "$i$f$IntOffset":I
    :goto_5
    nop

    .line 228
    .end local v8    # "this_$iv":Landroidx/compose/foundation/lazy/LazyListMeasuredItem;
    .end local v17    # "$i$f$copy-4Tuh3kE":I
    .end local v27    # "$this$copy_u2d4Tuh3kE$iv":J
    nop

    .end local v25    # "offset":J
    .local v3, "offset":J
    goto :goto_6

    .line 227
    .end local v7    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v24    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v1, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    :cond_9
    move-object/from16 v24, v1

    move-object v7, v2

    move-wide/from16 v25, v3

    .line 233
    .end local v1    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v7    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v24    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    :goto_6
    iget-wide v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->visualOffset:J

    invoke-static {v3, v4, v1, v2}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    move-result-wide v3

    .line 234
    if-nez p2, :cond_b

    .line 235
    if-nez v5, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v5, v3, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setFinalOffset--gyyYBs(J)V

    .line 237
    :cond_b
    :goto_7
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 238
    if-eqz v24, :cond_c

    .line 239
    move-object v2, v7

    .end local v7    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v16

    move-object/from16 v16, v5

    move-object/from16 v5, v24

    .end local v24    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v1, "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .local v5, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v16, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;FILjava/lang/Object;)V

    .end local v5    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v24    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    goto :goto_8

    .line 241
    .end local v1    # "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v5, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v7    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v16, "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    :cond_c
    move-object v2, v7

    move-object/from16 v1, v16

    move-object/from16 v16, v5

    .end local v5    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v7    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v1    # "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v16, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    goto :goto_8

    .line 244
    .end local v1    # "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v5    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .restart local v7    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v16, "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    :cond_d
    move-object v2, v7

    move-object/from16 v1, v16

    move-object/from16 v16, v5

    .end local v5    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v7    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v1    # "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .restart local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .local v16, "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    if-eqz v24, :cond_e

    .line 245
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v5, v24

    .end local v24    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .local v5, "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelativeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;FILjava/lang/Object;)V

    .end local v5    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    .restart local v24    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    goto :goto_8

    .line 247
    :cond_e
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelativeWithLayer-aW-9-wM$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 250
    :goto_8
    nop

    .line 192
    .end local v2    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v3    # "offset":J
    .end local v12    # "index":I
    .end local v13    # "$i$a$-repeat-LazyListMeasuredItem$place$1$2":I
    .end local v14    # "minOffset":I
    .end local v15    # "maxOffset":I
    .end local v16    # "animation":Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .end local v24    # "layer":Landroidx/compose/ui/graphics/layer/GraphicsLayer;
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1

    .line 251
    :cond_f
    nop

    .line 190
    .end local v1    # "$this$place_u24lambda_u2410":Landroidx/compose/ui/layout/Placeable$PlacementScope;
    .end local v9    # "$i$a$-with-LazyListMeasuredItem$place$1":I
    nop

    .line 251
    return-void
.end method

.method public final position(III)V
    .locals 16
    .param p1, "mainAxisOffset"    # I
    .param p2, "layoutWidth"    # I
    .param p3, "layoutHeight"    # I

    .line 126
    move-object/from16 v0, p0

    move/from16 v1, p1

    iput v1, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->offset:I

    .line 127
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v2

    if-eqz v2, :cond_0

    move/from16 v2, p3

    goto :goto_0

    :cond_0
    move/from16 v2, p2

    :goto_0
    iput v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->mainAxisLayoutSize:I

    .line 128
    nop

    .line 129
    iget-object v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeables:Ljava/util/List;

    .local v2, "$this$fastForEachIndexed$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 271
    .local v3, "$i$f$fastForEachIndexed":I
    nop

    .line 272
    const/4 v4, 0x0

    .local v4, "index$iv":I
    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move v6, v1

    .local v6, "mainAxisOffset":I
    :goto_1
    if-ge v4, v5, :cond_4

    .line 273
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 274
    .local v7, "item$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Landroidx/compose/ui/layout/Placeable;

    .local v8, "placeable":Landroidx/compose/ui/layout/Placeable;
    move v9, v4

    .local v9, "index":I
    const/4 v10, 0x0

    .line 130
    .local v10, "$i$a$-fastForEachIndexed-LazyListMeasuredItem$position$1":I
    mul-int/lit8 v11, v9, 0x2

    .line 131
    .local v11, "indexInArray":I
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->isVertical()Z

    move-result v12

    .line 140
    iget-object v13, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeableOffsets:[I

    .line 131
    if-eqz v12, :cond_2

    .line 132
    nop

    .line 133
    iget-object v12, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->horizontalAlignment:Landroidx/compose/ui/Alignment$Horizontal;

    .local v12, "value$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 275
    .local v14, "$i$f$requirePreconditionNotNull":I
    nop

    .line 277
    if-eqz v12, :cond_1

    .line 281
    nop

    .line 136
    .end local v12    # "value$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$requirePreconditionNotNull":I
    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v14

    iget-object v15, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    move/from16 v1, p2

    invoke-interface {v12, v14, v1, v15}, Landroidx/compose/ui/Alignment$Horizontal;->align(IILandroidx/compose/ui/unit/LayoutDirection;)I

    move-result v12

    aput v12, v13, v11

    .line 137
    iget-object v12, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeableOffsets:[I

    add-int/lit8 v13, v11, 0x1

    aput v6, v12, v13

    .line 138
    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v12

    add-int/2addr v6, v12

    move/from16 v1, p3

    goto :goto_2

    .line 278
    .restart local v12    # "value$iv":Ljava/lang/Object;
    .restart local v14    # "$i$f$requirePreconditionNotNull":I
    :cond_1
    move/from16 v1, p2

    const/4 v5, 0x0

    .line 134
    .local v5, "$i$a$-requirePreconditionNotNull-LazyListMeasuredItem$position$1$1":I
    nop

    .line 278
    .end local v5    # "$i$a$-requirePreconditionNotNull-LazyListMeasuredItem$position$1$1":I
    const-string/jumbo v5, "null horizontalAlignment when isVertical == true"

    invoke-static {v5}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v5, Lkotlin/KotlinNothingValueException;

    invoke-direct {v5}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v5

    .line 140
    .end local v12    # "value$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$requirePreconditionNotNull":I
    :cond_2
    move/from16 v1, p2

    aput v6, v13, v11

    .line 141
    iget-object v12, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->placeableOffsets:[I

    add-int/lit8 v13, v11, 0x1

    .line 142
    iget-object v14, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->verticalAlignment:Landroidx/compose/ui/Alignment$Vertical;

    .local v14, "value$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 282
    .local v15, "$i$f$requirePreconditionNotNull":I
    nop

    .line 284
    if-eqz v14, :cond_3

    .line 288
    nop

    .line 145
    .end local v14    # "value$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$requirePreconditionNotNull":I
    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result v15

    move/from16 v1, p3

    invoke-interface {v14, v15, v1}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    move-result v14

    aput v14, v12, v13

    .line 146
    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result v12

    add-int/2addr v6, v12

    .line 148
    :goto_2
    nop

    .line 274
    .end local v8    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "index":I
    .end local v10    # "$i$a$-fastForEachIndexed-LazyListMeasuredItem$position$1":I
    .end local v11    # "indexInArray":I
    nop

    .line 272
    .end local v7    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v4, v4, 0x1

    move/from16 v1, p1

    goto :goto_1

    .line 285
    .restart local v7    # "item$iv":Ljava/lang/Object;
    .restart local v8    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .restart local v9    # "index":I
    .restart local v10    # "$i$a$-fastForEachIndexed-LazyListMeasuredItem$position$1":I
    .restart local v11    # "indexInArray":I
    .restart local v14    # "value$iv":Ljava/lang/Object;
    .restart local v15    # "$i$f$requirePreconditionNotNull":I
    :cond_3
    move/from16 v1, p3

    const/4 v5, 0x0

    .line 143
    .local v5, "$i$a$-requirePreconditionNotNull-LazyListMeasuredItem$position$1$2":I
    nop

    .line 285
    .end local v5    # "$i$a$-requirePreconditionNotNull-LazyListMeasuredItem$position$1$2":I
    const-string/jumbo v5, "null verticalAlignment when isVertical == false"

    invoke-static {v5}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v5, Lkotlin/KotlinNothingValueException;

    invoke-direct {v5}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v5

    .line 272
    .end local v7    # "item$iv":Ljava/lang/Object;
    .end local v8    # "placeable":Landroidx/compose/ui/layout/Placeable;
    .end local v9    # "index":I
    .end local v10    # "$i$a$-fastForEachIndexed-LazyListMeasuredItem$position$1":I
    .end local v11    # "indexInArray":I
    .end local v14    # "value$iv":Ljava/lang/Object;
    .end local v15    # "$i$f$requirePreconditionNotNull":I
    :cond_4
    move/from16 v1, p3

    .line 289
    .end local v4    # "index$iv":I
    nop

    .line 149
    .end local v2    # "$this$fastForEachIndexed$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastForEachIndexed":I
    iget v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->beforeContentPadding:I

    neg-int v2, v2

    iput v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->minMainAxisOffset:I

    .line 150
    iget v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->mainAxisLayoutSize:I

    iget v3, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->afterContentPadding:I

    add-int/2addr v2, v3

    iput v2, v0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->maxMainAxisOffset:I

    .line 151
    return-void
.end method

.method public position(IIII)V
    .locals 0
    .param p1, "mainAxisOffset"    # I
    .param p2, "crossAxisOffset"    # I
    .param p3, "layoutWidth"    # I
    .param p4, "layoutHeight"    # I

    .line 118
    invoke-virtual {p0, p1, p3, p4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 119
    return-void
.end method

.method public setNonScrollableItem(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 84
    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->nonScrollableItem:Z

    return-void
.end method

.method public final updateMainAxisLayoutSize(I)V
    .locals 1
    .param p1, "mainAxisLayoutSize"    # I

    .line 158
    iput p1, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->mainAxisLayoutSize:I

    .line 159
    iget v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->afterContentPadding:I

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->maxMainAxisOffset:I

    .line 160
    return-void
.end method
